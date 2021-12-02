// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import io.realm.RealmFieldType;
import c6.h;
import io.realm.j0;
import io.realm.internal.android.AndroidRealmNotifier;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.lang.ref.WeakReference;
import java.io.File;
import java.util.List;
import java.io.Closeable;

@Keep
public final class OsSharedRealm implements Closeable, k
{
    public static final byte FILE_EXCEPTION_INCOMPATIBLE_SYNC_FILE = 7;
    public static final byte FILE_EXCEPTION_KIND_ACCESS_ERROR = 0;
    public static final byte FILE_EXCEPTION_KIND_BAD_HISTORY = 1;
    public static final byte FILE_EXCEPTION_KIND_EXISTS = 3;
    public static final byte FILE_EXCEPTION_KIND_FORMAT_UPGRADE_REQUIRED = 6;
    public static final byte FILE_EXCEPTION_KIND_INCOMPATIBLE_LOCK_FILE = 5;
    public static final byte FILE_EXCEPTION_KIND_NOT_FOUND = 4;
    public static final byte FILE_EXCEPTION_KIND_PERMISSION_DENIED = 2;
    private static final long nativeFinalizerPtr;
    private static final List<OsSharedRealm> sharedRealmsUnderConstruction;
    private static volatile File temporaryDirectory;
    public final io.realm.internal.a capabilities;
    public final j context;
    final List<WeakReference<OsResults.p>> iterators;
    private final long nativePtr;
    private final OsRealmConfig osRealmConfig;
    private final List<WeakReference<n>> pendingRows;
    public final RealmNotifier realmNotifier;
    private final OsSchemaInfo schemaInfo;
    private final List<OsSharedRealm> tempSharedRealmsForCallback;
    
    static {
        nativeFinalizerPtr = nativeGetFinalizerPtr();
        sharedRealmsUnderConstruction = new CopyOnWriteArrayList<OsSharedRealm>();
    }
    
    private OsSharedRealm(final long nativePtr, final OsRealmConfig osRealmConfig) {
        this.tempSharedRealmsForCallback = new ArrayList<OsSharedRealm>();
        this.pendingRows = new CopyOnWriteArrayList<WeakReference<n>>();
        this.iterators = new ArrayList<WeakReference<OsResults.p>>();
        this.nativePtr = nativePtr;
        this.osRealmConfig = osRealmConfig;
        this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativePtr), this);
        (this.context = osRealmConfig.a()).a(this);
        this.capabilities = new io.realm.internal.android.a();
        this.realmNotifier = null;
        final int n = 0;
        nativeSetAutoRefresh(nativePtr, false);
        final Iterator<OsSharedRealm> iterator = OsSharedRealm.sharedRealmsUnderConstruction.iterator();
        while (true) {
            OsSharedRealm osSharedRealm;
            do {
                final int n2 = n;
                if (iterator.hasNext()) {
                    osSharedRealm = iterator.next();
                }
                else {
                    if (n2 != 0) {
                        return;
                    }
                    throw new IllegalStateException("Cannot find the parent 'OsSharedRealm' which is under construction.");
                }
            } while (osSharedRealm.context != osRealmConfig.a());
            final int n2 = 1;
            osSharedRealm.tempSharedRealmsForCallback.add(this);
            continue;
        }
    }
    
    private OsSharedRealm(final OsRealmConfig osRealmConfig, final a a) {
        final ArrayList<OsSharedRealm> tempSharedRealmsForCallback = new ArrayList<OsSharedRealm>();
        this.tempSharedRealmsForCallback = tempSharedRealmsForCallback;
        this.pendingRows = new CopyOnWriteArrayList<WeakReference<n>>();
        this.iterators = new ArrayList<WeakReference<OsResults.p>>();
        final io.realm.internal.android.a capabilities = new io.realm.internal.android.a();
        final AndroidRealmNotifier realmNotifier = new AndroidRealmNotifier(this, capabilities);
        final j a2 = osRealmConfig.a();
        this.context = a2;
        final List<OsSharedRealm> sharedRealmsUnderConstruction = OsSharedRealm.sharedRealmsUnderConstruction;
        sharedRealmsUnderConstruction.add(this);
        try {
            final long nativeGetSharedRealm = nativeGetSharedRealm(osRealmConfig.getNativePtr(), a.G, a.H, realmNotifier);
            this.nativePtr = nativeGetSharedRealm;
            tempSharedRealmsForCallback.clear();
            sharedRealmsUnderConstruction.remove(this);
            this.osRealmConfig = osRealmConfig;
            this.schemaInfo = new OsSchemaInfo(nativeGetSchemaInfo(nativeGetSharedRealm), this);
            a2.a(this);
            this.capabilities = capabilities;
            this.realmNotifier = realmNotifier;
            if (a.equals(a.I)) {
                nativeSetAutoRefresh(nativeGetSharedRealm, capabilities.a());
            }
        }
        finally {
            try {
                for (final OsSharedRealm osSharedRealm : this.tempSharedRealmsForCallback) {
                    if (!osSharedRealm.isClosed()) {
                        osSharedRealm.close();
                    }
                }
            }
            finally {
                this.tempSharedRealmsForCallback.clear();
                OsSharedRealm.sharedRealmsUnderConstruction.remove(this);
            }
        }
    }
    
    private void detachIterators() {
        final Iterator<WeakReference<OsResults.p>> iterator = this.iterators.iterator();
        while (iterator.hasNext()) {
            final OsResults.p p = iterator.next().get();
            if (p != null) {
                p.c();
            }
        }
        this.iterators.clear();
    }
    
    private void executePendingRowQueries() {
        final Iterator<WeakReference<n>> iterator = this.pendingRows.iterator();
        while (iterator.hasNext()) {
            final n n = iterator.next().get();
            if (n != null) {
                n.e();
            }
        }
        this.pendingRows.clear();
    }
    
    public static OsSharedRealm getInstance(final OsRealmConfig.b b, final a a) {
        final OsRealmConfig b2 = b.b();
        l.e().k(b2);
        return new OsSharedRealm(b2, a);
    }
    
    public static OsSharedRealm getInstance(final j0 j0, final a a) {
        return getInstance(new OsRealmConfig.b(j0), a);
    }
    
    public static File getTemporaryDirectory() {
        return OsSharedRealm.temporaryDirectory;
    }
    
    public static void initialize(final File temporaryDirectory) {
        if (OsSharedRealm.temporaryDirectory != null) {
            return;
        }
        final String absolutePath = temporaryDirectory.getAbsolutePath();
        if (!temporaryDirectory.isDirectory() && !temporaryDirectory.mkdirs() && !temporaryDirectory.isDirectory()) {
            final StringBuilder sb = new StringBuilder();
            sb.append("failed to create temporary directory: ");
            sb.append(absolutePath);
            throw new f(sb.toString());
        }
        String string = absolutePath;
        if (!absolutePath.endsWith("/")) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append("/");
            string = sb2.toString();
        }
        nativeInit(string);
        OsSharedRealm.temporaryDirectory = temporaryDirectory;
    }
    
    private static native void nativeBeginTransaction(final long p0);
    
    private static native void nativeCancelTransaction(final long p0);
    
    private static native void nativeCloseSharedRealm(final long p0);
    
    private static native void nativeCommitTransaction(final long p0);
    
    private static native boolean nativeCompact(final long p0);
    
    private static native long nativeCreateTable(final long p0, final String p1);
    
    private static native long nativeCreateTableWithPrimaryKeyField(final long p0, final String p1, final String p2, final int p3, final boolean p4);
    
    private static native long nativeFreeze(final long p0);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native long nativeGetSchemaInfo(final long p0);
    
    private static native long nativeGetSharedRealm(final long p0, final long p1, final long p2, final RealmNotifier p3);
    
    private static native long nativeGetTableRef(final long p0, final String p1);
    
    private static native String[] nativeGetTablesName(final long p0);
    
    private static native long[] nativeGetVersionID(final long p0);
    
    private static native boolean nativeHasTable(final long p0, final String p1);
    
    private static native void nativeInit(final String p0);
    
    private static native boolean nativeIsAutoRefresh(final long p0);
    
    private static native boolean nativeIsClosed(final long p0);
    
    private static native boolean nativeIsEmpty(final long p0);
    
    private static native boolean nativeIsFrozen(final long p0);
    
    private static native boolean nativeIsInTransaction(final long p0);
    
    private static native long nativeNumberOfVersions(final long p0);
    
    private static native void nativeRefresh(final long p0);
    
    private static native void nativeRegisterSchemaChangedCallback(final long p0, final SchemaChangedCallback p1);
    
    private static native void nativeRenameTable(final long p0, final String p1, final String p2);
    
    private static native void nativeSetAutoRefresh(final long p0, final boolean p1);
    
    private static native long nativeSize(final long p0);
    
    private static native void nativeStopWaitForChange(final long p0);
    
    private static native boolean nativeWaitForChange(final long p0);
    
    private static native void nativeWriteCopy(final long p0, final String p1, @h final byte[] p2);
    
    private static void runInitializationCallback(final long n, final OsRealmConfig osRealmConfig, final InitializationCallback initializationCallback) {
        initializationCallback.onInit(new OsSharedRealm(n, osRealmConfig));
    }
    
    private static void runMigrationCallback(final long n, final OsRealmConfig osRealmConfig, final MigrationCallback migrationCallback, final long n2) {
        migrationCallback.onMigrationNeeded(new OsSharedRealm(n, osRealmConfig), n2, osRealmConfig.b().s());
    }
    
    void addIterator(final OsResults.p referent) {
        this.iterators.add(new WeakReference<OsResults.p>(referent));
    }
    
    void addPendingRow(final n referent) {
        this.pendingRows.add(new WeakReference<n>(referent));
    }
    
    public void beginTransaction() {
        this.detachIterators();
        this.executePendingRowQueries();
        nativeBeginTransaction(this.nativePtr);
    }
    
    public void cancelTransaction() {
        nativeCancelTransaction(this.nativePtr);
    }
    
    @Override
    public void close() {
        final RealmNotifier realmNotifier = this.realmNotifier;
        if (realmNotifier != null) {
            realmNotifier.close();
        }
        synchronized (this.context) {
            nativeCloseSharedRealm(this.nativePtr);
        }
    }
    
    public void commitTransaction() {
        nativeCommitTransaction(this.nativePtr);
    }
    
    public boolean compact() {
        return nativeCompact(this.nativePtr);
    }
    
    public Table createTable(final String s) {
        return new Table(this, nativeCreateTable(this.nativePtr, s));
    }
    
    public Table createTableWithPrimaryKey(final String s, final String s2, final RealmFieldType realmFieldType, final boolean b) {
        return new Table(this, nativeCreateTableWithPrimaryKeyField(this.nativePtr, s, s2, realmFieldType.getNativeValue(), b));
    }
    
    public OsSharedRealm freeze() {
        return new OsSharedRealm(this.osRealmConfig, this.getVersionID());
    }
    
    public j0 getConfiguration() {
        return this.osRealmConfig.b();
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsSharedRealm.nativeFinalizerPtr;
    }
    
    @Override
    public long getNativePtr() {
        return this.nativePtr;
    }
    
    public long getNumberOfVersions() {
        return nativeNumberOfVersions(this.nativePtr);
    }
    
    public String getPath() {
        return this.osRealmConfig.b().m();
    }
    
    public OsSchemaInfo getSchemaInfo() {
        return this.schemaInfo;
    }
    
    public Table getTable(final String s) {
        return new Table(this, nativeGetTableRef(this.nativePtr, s));
    }
    
    public String[] getTablesNames() {
        String[] nativeGetTablesName = nativeGetTablesName(this.nativePtr);
        if (nativeGetTablesName == null) {
            nativeGetTablesName = new String[0];
        }
        return nativeGetTablesName;
    }
    
    public a getVersionID() {
        final long[] nativeGetVersionID = nativeGetVersionID(this.nativePtr);
        if (nativeGetVersionID != null) {
            return new a(nativeGetVersionID[0], nativeGetVersionID[1]);
        }
        throw new IllegalStateException("Cannot get versionId, this could be related to a non existing read/write transaction");
    }
    
    public boolean hasTable(final String s) {
        return nativeHasTable(this.nativePtr, s);
    }
    
    void invalidateIterators() {
        final Iterator<WeakReference<OsResults.p>> iterator = this.iterators.iterator();
        while (iterator.hasNext()) {
            final OsResults.p p = iterator.next().get();
            if (p != null) {
                p.e();
            }
        }
        this.iterators.clear();
    }
    
    public boolean isAutoRefresh() {
        return nativeIsAutoRefresh(this.nativePtr);
    }
    
    public boolean isClosed() {
        return nativeIsClosed(this.nativePtr);
    }
    
    public boolean isEmpty() {
        return nativeIsEmpty(this.nativePtr);
    }
    
    public boolean isFrozen() {
        return nativeIsFrozen(this.nativePtr);
    }
    
    public boolean isInTransaction() {
        return nativeIsInTransaction(this.nativePtr);
    }
    
    public boolean isSyncRealm() {
        return this.osRealmConfig.c() != null;
    }
    
    public void refresh() {
        if (!this.isFrozen()) {
            nativeRefresh(this.nativePtr);
            return;
        }
        throw new IllegalStateException("It is not possible to refresh frozen Realms.");
    }
    
    public void registerSchemaChangedCallback(final SchemaChangedCallback schemaChangedCallback) {
        nativeRegisterSchemaChangedCallback(this.nativePtr, schemaChangedCallback);
    }
    
    void removePendingRow(final n n) {
        for (final WeakReference<n> weakReference : this.pendingRows) {
            final n n2 = weakReference.get();
            if (n2 == null || n2 == n) {
                this.pendingRows.remove(weakReference);
            }
        }
    }
    
    public void renameTable(final String s, final String s2) {
        nativeRenameTable(this.nativePtr, s, s2);
    }
    
    public void setAutoRefresh(final boolean b) {
        this.capabilities.c(null);
        nativeSetAutoRefresh(this.nativePtr, b);
    }
    
    public long size() {
        return nativeSize(this.nativePtr);
    }
    
    public void stopWaitForChange() {
        nativeStopWaitForChange(this.nativePtr);
    }
    
    public boolean waitForChange() {
        return nativeWaitForChange(this.nativePtr);
    }
    
    public void writeCopy(final File file, @h final byte[] array) {
        if (file.isFile() && file.exists()) {
            throw new IllegalArgumentException("The destination file must not exist");
        }
        nativeWriteCopy(this.nativePtr, file.getAbsolutePath(), array);
    }
    
    @Keep
    public interface InitializationCallback
    {
        void onInit(final OsSharedRealm p0);
    }
    
    @Keep
    public interface MigrationCallback
    {
        void onMigrationNeeded(final OsSharedRealm p0, final long p1, final long p2);
    }
    
    @Keep
    public interface SchemaChangedCallback
    {
        void onSchemaChanged();
    }
    
    public static class a implements Comparable<a>
    {
        public static final a I;
        public final long G;
        public final long H;
        
        static {
            I = new a(-1L, -1L);
        }
        
        a(final long g, final long h) {
            this.G = g;
            this.H = h;
        }
        
        public int b(final a a) {
            if (a == null) {
                throw new IllegalArgumentException("Version cannot be compared to a null value.");
            }
            final long g = this.G;
            final long g2 = a.G;
            if (g > g2) {
                return 1;
            }
            if (g < g2) {
                return -1;
            }
            return 0;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && this.getClass() == o.getClass()) {
                final a a = (a)o;
                if (this.G != a.G || this.H != a.H) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            final long g = this.G;
            final int n = (int)(g ^ g >>> 32);
            final long h = this.H;
            return n * 31 + (int)(h ^ h >>> 32);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("VersionID{version=");
            sb.append(this.G);
            sb.append(", index=");
            sb.append(this.H);
            sb.append('}');
            return sb.toString();
        }
    }
}
