// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import io.realm.internal.c;
import io.realm.internal.q;
import io.realm.internal.Table;
import java.util.List;
import java.util.Iterator;
import io.realm.exceptions.RealmException;
import io.reactivex.l;
import android.os.Looper;
import io.realm.log.RealmLog;
import io.realm.internal.p;
import java.util.Collections;
import io.realm.internal.r;
import io.realm.internal.CheckedRow;
import io.realm.internal.UncheckedRow;
import io.realm.internal.OsObjectStore;
import io.realm.internal.Util;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicBoolean;
import io.realm.exceptions.RealmMigrationNeededException;
import java.io.File;
import io.realm.internal.OsRealmConfig;
import c6.h;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.OsSharedRealm;
import io.realm.internal.async.d;
import android.content.Context;
import java.io.Closeable;

abstract class a implements Closeable
{
    private static final String N = "Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.";
    static final String O = "Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.";
    static final String P = "This Realm instance has already been closed, making it unusable.";
    private static final String Q = "Changing Realm data can only be done from inside a transaction.";
    static final String R = "Listeners cannot be used on current thread.";
    static final String S = "This API is not supported by partially synchronized Realms. Either unsubscribe using 'Realm.unsubscribeAsync()' or delete the objects using a query and 'RealmResults.deleteAllFromRealm()'";
    static volatile Context T;
    static final d U;
    public static final d V;
    public static final i W;
    final boolean G;
    final long H;
    protected final j0 I;
    private h0 J;
    public OsSharedRealm K;
    private boolean L;
    private OsSharedRealm.SchemaChangedCallback M;
    
    static {
        U = d.c();
        V = d.d();
        W = new i();
    }
    
    a(final h0 j, @c6.h final OsSchemaInfo osSchemaInfo, final OsSharedRealm.a a) {
        this(j.l(), osSchemaInfo, a);
        this.J = j;
    }
    
    a(final OsSharedRealm k) {
        this.M = new OsSharedRealm.SchemaChangedCallback() {
            @Override
            public void onSchemaChanged() {
                final t0 h = io.realm.a.this.H();
                if (h != null) {
                    h.t();
                }
                if (io.realm.a.this instanceof f0) {
                    h.f();
                }
            }
        };
        this.H = Thread.currentThread().getId();
        this.I = k.getConfiguration();
        this.J = null;
        this.K = k;
        this.G = k.isFrozen();
        this.L = false;
    }
    
    a(final j0 i, @c6.h final OsSchemaInfo osSchemaInfo, final OsSharedRealm.a a) {
        this.M = new OsSharedRealm.SchemaChangedCallback() {
            @Override
            public void onSchemaChanged() {
                final t0 h = io.realm.a.this.H();
                if (h != null) {
                    h.t();
                }
                if (io.realm.a.this instanceof f0) {
                    h.f();
                }
            }
        };
        this.H = Thread.currentThread().getId();
        this.I = i;
        OsSharedRealm.InitializationCallback initializationCallback = null;
        this.J = null;
        OsSharedRealm.MigrationCallback q;
        if (osSchemaInfo != null && i.k() != null) {
            q = q(i.k());
        }
        else {
            q = null;
        }
        final f0.d j = i.i();
        if (j != null) {
            initializationCallback = new OsSharedRealm.InitializationCallback() {
                @Override
                public void onInit(final OsSharedRealm osSharedRealm) {
                    j.a(f0.d1(osSharedRealm));
                }
            };
        }
        final OsSharedRealm instance = OsSharedRealm.getInstance(new OsRealmConfig.b(i).c(new File(a.T.getFilesDir(), ".realm.temp")).a(true).e(q).f(osSchemaInfo).d(initializationCallback), a);
        this.K = instance;
        this.G = instance.isFrozen();
        this.L = true;
        this.K.registerSchemaChangedCallback(this.M);
    }
    
    protected static void R(final j0 j0, @c6.h final m0 m0) throws FileNotFoundException {
        if (j0 == null) {
            throw new IllegalArgumentException("RealmConfiguration must be provided");
        }
        if (j0.y()) {
            throw new IllegalArgumentException("Manual migrations are not supported for synced Realms");
        }
        if (m0 == null && j0.k() == null) {
            throw new RealmMigrationNeededException(j0.m(), "RealmMigration must be provided.");
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        h0.q(j0, (h0.c)new h0.c() {
            @Override
            public void a(final int n) {
                if (n == 0) {
                    if (!new File(j0.m()).exists()) {
                        atomicBoolean.set(true);
                        return;
                    }
                    final OsSchemaInfo osSchemaInfo = new OsSchemaInfo(j0.r().g().values());
                    OsSharedRealm.MigrationCallback a = null;
                    m0 m0 = m0;
                    if (m0 == null) {
                        m0 = j0.k();
                    }
                    if (m0 != null) {
                        a = q(m0);
                    }
                    final OsRealmConfig.b e = new OsRealmConfig.b(j0).a(false).f(osSchemaInfo).e(a);
                    try {
                        final OsSharedRealm instance = OsSharedRealm.getInstance(e, OsSharedRealm.a.I);
                        if (instance != null) {
                            instance.close();
                        }
                        return;
                    }
                    finally {}
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot migrate a Realm file that is already open: ");
                sb.append(j0.m());
                throw new IllegalStateException(sb.toString());
            }
        });
        if (!atomicBoolean.get()) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Cannot migrate a Realm file which doesn't exist: ");
        sb.append(j0.m());
        throw new FileNotFoundException(sb.toString());
    }
    
    static boolean o(final j0 j0) {
        final OsSharedRealm instance = OsSharedRealm.getInstance(j0, OsSharedRealm.a.I);
        final boolean compact = instance.compact();
        instance.close();
        return (boolean)compact;
    }
    
    private static OsSharedRealm.MigrationCallback q(final m0 m0) {
        return new OsSharedRealm.MigrationCallback() {
            @Override
            public void onMigrationNeeded(final OsSharedRealm osSharedRealm, final long n, final long n2) {
                m0.a(j.g0(osSharedRealm), n, n2);
            }
        };
    }
    
    static boolean s(final j0 j0) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        if (OsObjectStore.a(j0, new Runnable() {
            @Override
            public void run() {
                atomicBoolean.set(Util.f(j0.m(), j0.n(), j0.o()));
            }
        })) {
            return atomicBoolean.get();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("It's not allowed to delete the file associated with an open Realm. Remember to close() all the instances of the Realm before deleting its file: ");
        sb.append(j0.m());
        throw new IllegalStateException(sb.toString());
    }
    
     <E extends n0> E C(@c6.h final Class<E> clazz, @c6.h final String s, final UncheckedRow uncheckedRow) {
        n0 s2;
        if (s != null) {
            s2 = new k(this, CheckedRow.q(uncheckedRow));
        }
        else {
            s2 = this.I.r().s(clazz, this, uncheckedRow, this.H().j(clazz), false, Collections.emptyList());
        }
        return (E)s2;
    }
    
    public j0 D() {
        return this.I;
    }
    
    r F(final String anObject, final p p5, final String s, final t0 t0, final r0 r0) {
        final long m = r0.m(s);
        final RealmFieldType q = r0.q(s);
        final r g = p5.S6().g();
        if (!r0.C(r0.q(s))) {
            throw new IllegalArgumentException(String.format("Field '%s' does not contain a valid link", s));
        }
        final String s2 = r0.s(s);
        if (s2.equals(anObject)) {
            return t0.p(anObject).y(g.h(m, q));
        }
        throw new IllegalArgumentException(String.format("Parent type %s expects that property '%s' be of type %s but was %s.", r0.l(), s, s2, anObject));
    }
    
    public long G() {
        this.h();
        return this.J().getNumberOfVersions();
    }
    
    public abstract t0 H();
    
    OsSharedRealm J() {
        return this.K;
    }
    
    public long K() {
        return OsObjectStore.d(this.K);
    }
    
    public boolean L() {
        return this.K.isAutoRefresh();
    }
    
    public abstract boolean M();
    
    public boolean N() {
        final OsSharedRealm k = this.K;
        if (k != null && !k.isClosed()) {
            return this.G;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }
    
    public boolean Q() {
        this.h();
        return this.K.isInTransaction();
    }
    
    public void S() {
        this.h();
        this.e();
        if (!this.Q()) {
            this.K.refresh();
            return;
        }
        throw new IllegalStateException("Cannot refresh a Realm instance inside a transaction.");
    }
    
    protected void T() {
        if (this.isClosed()) {
            RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.I.m());
        }
        this.K.realmNotifier.removeChangeListeners(this);
    }
    
    protected <T extends a> void V(final i0<T> i0) {
        if (i0 != null) {
            if (this.isClosed()) {
                RealmLog.w("Calling removeChangeListener on a closed Realm %s, make sure to close all listeners before closing the Realm.", this.I.m());
            }
            this.K.realmNotifier.removeChangeListener(this, (i0<a>)i0);
            return;
        }
        throw new IllegalArgumentException("Listener should not be null");
    }
    
    public void W(final boolean autoRefresh) {
        this.h();
        this.K.setAutoRefresh(autoRefresh);
    }
    
    @Deprecated
    public void X() {
        final h0 j = this.J;
        if (j != null) {
            j.r((h0.b)new h0.b() {
                @Override
                public void a() {
                    final OsSharedRealm k = io.realm.a.this.K;
                    if (k != null && !k.isClosed()) {
                        io.realm.a.this.K.stopWaitForChange();
                        return;
                    }
                    throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
                }
            });
            return;
        }
        throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
    }
    
    @Deprecated
    public boolean Y() {
        this.h();
        if (this.Q()) {
            throw new IllegalStateException("Cannot wait for changes inside of a transaction.");
        }
        if (Looper.myLooper() == null) {
            final boolean waitForChange = this.K.waitForChange();
            if (waitForChange) {
                this.K.refresh();
            }
            return waitForChange;
        }
        throw new IllegalStateException("Cannot wait for changes inside a Looper thread. Use RealmChangeListeners instead.");
    }
    
    public void Z(final File file) {
        if (file != null) {
            this.h();
            this.K.writeCopy(file, null);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }
    
    public void a0(final File file, final byte[] array) {
        if (file != null) {
            this.h();
            this.K.writeCopy(file, array);
            return;
        }
        throw new IllegalArgumentException("The destination argument cannot be null");
    }
    
    protected <T extends a> void b(final i0<T> i0) {
        if (i0 == null) {
            throw new IllegalArgumentException("Listener should not be null");
        }
        this.h();
        this.K.capabilities.c("Listeners cannot be used on current thread.");
        if (!this.G) {
            this.K.realmNotifier.addChangeListener(this, (i0<a>)i0);
            return;
        }
        throw new IllegalStateException("It is not possible to add a change listener to a frozen Realm since it never changes.");
    }
    
    public void beginTransaction() {
        this.h();
        this.K.beginTransaction();
    }
    
    public abstract l c();
    
    @Override
    public void close() {
        if (!this.G && this.H != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm instance can only be closed on the thread it was created.");
        }
        final h0 j = this.J;
        if (j != null) {
            j.t(this);
        }
        else {
            this.t();
        }
    }
    
    public void d() {
        this.h();
        this.K.cancelTransaction();
    }
    
    protected void e() {
        if (this.J().capabilities.b() && !this.D().u()) {
            throw new RealmException("Queries on the UI thread have been disabled. They can be enabled by setting 'RealmConfiguration.Builder.allowQueriesOnUiThread(true)'.");
        }
    }
    
    protected void f() {
        if (this.J().capabilities.b() && !this.D().v()) {
            throw new RealmException("Running transactions on the UI thread has been disabled. It can be enabled by setting 'RealmConfiguration.Builder.allowWritesOnUiThread(true)'.");
        }
    }
    
    @Override
    protected void finalize() throws Throwable {
        if (this.L) {
            final OsSharedRealm k = this.K;
            if (k != null && !k.isClosed()) {
                RealmLog.w("Remember to call close() on all Realm instances. Realm %s is being finalized without being closed, this can lead to running out of native memory.", this.I.m());
                final h0 j = this.J;
                if (j != null) {
                    j.s();
                }
            }
        }
        super.finalize();
    }
    
    protected void g() {
        if (this.K.isInTransaction()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }
    
    public String getPath() {
        return this.I.m();
    }
    
    protected void h() {
        final OsSharedRealm k = this.K;
        if (k == null || k.isClosed()) {
            throw new IllegalStateException("This Realm instance has already been closed, making it unusable.");
        }
        if (!this.G && this.H != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
    }
    
    public boolean isClosed() {
        if (!this.G && this.H != Thread.currentThread().getId()) {
            throw new IllegalStateException("Realm access from incorrect thread. Realm objects can only be accessed on the thread they were created.");
        }
        final OsSharedRealm k = this.K;
        return k == null || k.isClosed();
    }
    
    protected void j() {
        if (this.Q()) {
            return;
        }
        throw new IllegalStateException("Changing Realm data can only be done from inside a transaction.");
    }
    
    void k() {
        if (!this.I.y()) {
            return;
        }
        throw new UnsupportedOperationException("You cannot perform destructive changes to a schema of a synced Realm");
    }
    
    public void n() {
        this.h();
        this.K.commitTransaction();
    }
    
    public void r() {
        this.h();
        final Iterator<r0> iterator = this.H().i().iterator();
        while (iterator.hasNext()) {
            this.H().p(iterator.next().l()).f();
        }
    }
    
    void t() {
        this.J = null;
        final OsSharedRealm k = this.K;
        if (k != null && this.L) {
            k.close();
            this.K = null;
        }
    }
    
    public abstract a w();
    
     <E extends n0> E x(final Class<E> clazz, final long n, final boolean b, final List<String> list) {
        return this.I.r().s(clazz, this, this.H().o(clazz).R(n), this.H().j(clazz), b, list);
    }
    
     <E extends n0> E y(@c6.h final Class<E> clazz, @c6.h final String s, final long n) {
        final boolean b = s != null;
        Table table;
        if (b) {
            table = this.H().p(s);
        }
        else {
            table = this.H().o(clazz);
        }
        n0 s2;
        if (b) {
            r r;
            if (n != -1L) {
                r = table.y(n);
            }
            else {
                r = io.realm.internal.h.G;
            }
            s2 = new k(this, r);
        }
        else {
            final q r2 = this.I.r();
            r r3;
            if (n != -1L) {
                r3 = table.R(n);
            }
            else {
                r3 = io.realm.internal.h.G;
            }
            s2 = r2.s(clazz, this, r3, this.H().j(clazz), false, Collections.emptyList());
        }
        return (E)s2;
    }
    
    public abstract static class g<T extends a>
    {
        public void a(final Throwable t) {
            throw new RealmException("Exception happens when initializing Realm in the background thread.", t);
        }
        
        public abstract void b(final T p0);
    }
    
    public static final class h
    {
        private a a;
        private r b;
        private c c;
        private boolean d;
        private List<String> e;
        
        public void a() {
            this.a = null;
            this.b = null;
            this.c = null;
            this.d = false;
            this.e = null;
        }
        
        public boolean b() {
            return this.d;
        }
        
        public c c() {
            return this.c;
        }
        
        public List<String> d() {
            return this.e;
        }
        
        a e() {
            return this.a;
        }
        
        public r f() {
            return this.b;
        }
        
        public void g(final a a, final r b, final c c, final boolean d, final List<String> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    static final class i extends ThreadLocal<h>
    {
        protected h a() {
            return new h();
        }
    }
}
