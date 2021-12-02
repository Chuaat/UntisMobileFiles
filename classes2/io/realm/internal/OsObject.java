// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import io.realm.w;
import io.realm.n0;
import io.realm.q0;
import org.bson.types.ObjectId;
import io.realm.exceptions.RealmException;
import io.realm.RealmFieldType;
import c6.h;

@Keep
public class OsObject implements k
{
    private static final long nativeFinalizerPtr;
    private final long nativePtr;
    private m<b> observerPairs;
    
    static {
        nativeFinalizerPtr = nativeGetFinalizerPtr();
    }
    
    public OsObject(final OsSharedRealm osSharedRealm, final UncheckedRow uncheckedRow) {
        this.observerPairs = new m<b>();
        this.nativePtr = nativeCreate(osSharedRealm.getNativePtr(), uncheckedRow.getNativePtr());
        osSharedRealm.context.a(this);
    }
    
    public static UncheckedRow create(final Table table) {
        return new UncheckedRow(table.N().context, table, nativeCreateNewObject(table.getNativePtr()));
    }
    
    public static long createEmbeddedObject(final Table table, final long n, final long n2) {
        return nativeCreateEmbeddedObject(table.getNativePtr(), n, n2);
    }
    
    public static long createRow(final Table table) {
        return nativeCreateRow(table.getNativePtr());
    }
    
    public static long createRowWithPrimaryKey(final Table table, final long n, @h final Object o) {
        final RealmFieldType f = table.F(n);
        final OsSharedRealm n2 = table.N();
        if (f == RealmFieldType.STRING) {
            if (o != null && !(o instanceof String)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Primary key value is not a String: ");
                sb.append(o);
                throw new IllegalArgumentException(sb.toString());
            }
            return nativeCreateRowWithStringPrimaryKey(n2.getNativePtr(), table.getNativePtr(), n, (String)o);
        }
        else {
            if (f == RealmFieldType.INTEGER) {
                long long1;
                if (o == null) {
                    long1 = 0L;
                }
                else {
                    long1 = Long.parseLong(o.toString());
                }
                return nativeCreateRowWithLongPrimaryKey(n2.getNativePtr(), table.getNativePtr(), n, long1, o == null);
            }
            if (f != RealmFieldType.OBJECT_ID) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Cannot check for duplicate rows for unsupported primary key type: ");
                sb2.append(f);
                throw new RealmException(sb2.toString());
            }
            if (o != null && !(o instanceof ObjectId)) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append("Primary key value is not an ObjectId: ");
                sb3.append(o);
                throw new IllegalArgumentException(sb3.toString());
            }
            String string;
            if (o == null) {
                string = null;
            }
            else {
                string = o.toString();
            }
            return nativeCreateRowWithObjectIdPrimaryKey(n2.getNativePtr(), table.getNativePtr(), n, string);
        }
    }
    
    public static UncheckedRow createWithPrimaryKey(final Table table, @h final Object obj) {
        final long andVerifyPrimaryKeyColumnIndex = getAndVerifyPrimaryKeyColumnIndex(table);
        final RealmFieldType f = table.F(andVerifyPrimaryKeyColumnIndex);
        final OsSharedRealm n = table.N();
        if (f == RealmFieldType.STRING) {
            if (obj != null && !(obj instanceof String)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Primary key value is not a String: ");
                sb.append(obj);
                throw new IllegalArgumentException(sb.toString());
            }
            return new UncheckedRow(n.context, table, nativeCreateNewObjectWithStringPrimaryKey(n.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, (String)obj));
        }
        else {
            if (f == RealmFieldType.INTEGER) {
                long long1;
                if (obj == null) {
                    long1 = 0L;
                }
                else {
                    long1 = Long.parseLong(obj.toString());
                }
                return new UncheckedRow(n.context, table, nativeCreateNewObjectWithLongPrimaryKey(n.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, long1, obj == null));
            }
            if (f == RealmFieldType.OBJECT_ID) {
                String string;
                if (obj == null) {
                    string = null;
                }
                else {
                    string = obj.toString();
                }
                return new UncheckedRow(n.context, table, nativeCreateNewObjectWithObjectIdPrimaryKey(n.getNativePtr(), table.getNativePtr(), andVerifyPrimaryKeyColumnIndex, string));
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot check for duplicate rows for unsupported primary key type: ");
            sb2.append(f);
            throw new RealmException(sb2.toString());
        }
    }
    
    private static long getAndVerifyPrimaryKeyColumnIndex(final Table table) {
        final String c = OsObjectStore.c(table.N(), table.z());
        if (c != null) {
            return table.C(c);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(table.M());
        sb.append(" has no primary key defined.");
        throw new IllegalStateException(sb.toString());
    }
    
    private static native long nativeCreate(final long p0, final long p1);
    
    private static native long nativeCreateEmbeddedObject(final long p0, final long p1, final long p2);
    
    private static native long nativeCreateNewObject(final long p0);
    
    private static native long nativeCreateNewObjectWithLongPrimaryKey(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    private static native long nativeCreateNewObjectWithObjectIdPrimaryKey(final long p0, final long p1, final long p2, @h final String p3);
    
    private static native long nativeCreateNewObjectWithStringPrimaryKey(final long p0, final long p1, final long p2, @h final String p3);
    
    private static native long nativeCreateRow(final long p0);
    
    private static native long nativeCreateRowWithLongPrimaryKey(final long p0, final long p1, final long p2, final long p3, final boolean p4);
    
    private static native long nativeCreateRowWithObjectIdPrimaryKey(final long p0, final long p1, final long p2, @h final String p3);
    
    private static native long nativeCreateRowWithStringPrimaryKey(final long p0, final long p1, final long p2, @h final String p3);
    
    private static native long nativeGetFinalizerPtr();
    
    private native void nativeStartListening(final long p0);
    
    private native void nativeStopListening(final long p0);
    
    private void notifyChangeListeners(final String[] array) {
        this.observerPairs.c((m.a<b>)new a(array));
    }
    
    public <T extends n0> void addListener(final T t, final q0<T> q0) {
        if (this.observerPairs.d()) {
            this.nativeStartListening(this.nativePtr);
        }
        this.observerPairs.a(new b(t, q0));
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsObject.nativeFinalizerPtr;
    }
    
    @Override
    public long getNativePtr() {
        return this.nativePtr;
    }
    
    public <T extends n0> void removeListener(final T t) {
        this.observerPairs.f(t);
        if (this.observerPairs.d()) {
            this.nativeStopListening(this.nativePtr);
        }
    }
    
    public <T extends n0> void removeListener(final T t, final q0<T> q0) {
        this.observerPairs.e(t, q0);
        if (this.observerPairs.d()) {
            this.nativeStopListening(this.nativePtr);
        }
    }
    
    public void setObserverPairs(final m<b> observerPairs) {
        if (this.observerPairs.d()) {
            this.observerPairs = observerPairs;
            if (!observerPairs.d()) {
                this.nativeStartListening(this.nativePtr);
            }
            return;
        }
        throw new IllegalStateException("'observerPairs' is not empty. Listeners have been added before.");
    }
    
    private static class a implements m.a<OsObject.b>
    {
        private final String[] a;
        
        a(final String[] a) {
            this.a = a;
        }
        
        private w b() {
            String[] a = this.a;
            final boolean b = a == null;
            if (b) {
                a = new String[0];
            }
            return new c(a, b);
        }
        
        public void c(final OsObject.b b, final Object o) {
            b.a((n0)o, this.b());
        }
    }
    
    public static class b<T extends n0> extends m.b<T, q0<T>>
    {
        public b(final T t, final q0<T> q0) {
            super(t, q0);
        }
        
        public void a(final T t, @h final w w) {
            ((q0)super.b).a(t, w);
        }
    }
    
    private static class c implements w
    {
        final String[] a;
        final boolean b;
        
        c(final String[] a, final boolean b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public boolean a() {
            return this.b;
        }
        
        @Override
        public boolean b(final String anObject) {
            final String[] a = this.a;
            for (int length = a.length, i = 0; i < length; ++i) {
                if (a[i].equals(anObject)) {
                    return true;
                }
            }
            return false;
        }
        
        @Override
        public String[] c() {
            return this.a;
        }
    }
}
