// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import io.realm.RealmFieldType;
import c6.h;

public class OsObjectSchemaInfo implements k
{
    private static final long H;
    private long G;
    
    static {
        H = nativeGetFinalizerPtr();
    }
    
    OsObjectSchemaInfo(final long g) {
        this.G = g;
        j.c.a(this);
    }
    
    private OsObjectSchemaInfo(final String s, final String s2, final boolean b) {
        this(nativeCreateRealmObjectSchema(s, s2, b));
    }
    
    private static native void nativeAddProperties(final long p0, final long[] p1, final long[] p2);
    
    private static native long nativeCreateRealmObjectSchema(final String p0, final String p1, final boolean p2);
    
    private static native String nativeGetClassName(final long p0);
    
    private static native long nativeGetFinalizerPtr();
    
    private static native long nativeGetPrimaryKeyProperty(final long p0);
    
    private static native long nativeGetProperty(final long p0, final String p1);
    
    private static native boolean nativeIsEmbedded(final long p0);
    
    public String c() {
        return nativeGetClassName(this.G);
    }
    
    @h
    public Property d() {
        Property property;
        if (nativeGetPrimaryKeyProperty(this.G) == 0L) {
            property = null;
        }
        else {
            property = new Property(nativeGetPrimaryKeyProperty(this.G));
        }
        return property;
    }
    
    public Property e(final String s) {
        return new Property(nativeGetProperty(this.G, s));
    }
    
    public boolean f() {
        return nativeIsEmbedded(this.G);
    }
    
    @Override
    public long getNativeFinalizerPtr() {
        return OsObjectSchemaInfo.H;
    }
    
    @Override
    public long getNativePtr() {
        return this.G;
    }
    
    public static class b
    {
        private final String a;
        private final String b;
        private final long[] c;
        private final boolean d;
        private int e;
        private final long[] f;
        private int g;
        
        public b(final String b, final String a, final boolean d, final int n, final int n2) {
            this.e = 0;
            this.g = 0;
            this.b = b;
            this.a = a;
            this.d = d;
            this.c = new long[n];
            this.f = new long[n2];
        }
        
        public b(final String a, final boolean d, final int n, final int n2) {
            this.e = 0;
            this.g = 0;
            this.b = "";
            this.a = a;
            this.d = d;
            this.c = new long[n];
            this.f = new long[n2];
        }
        
        public b a(final String s, final String s2, final String s3) {
            final long nativeCreateComputedLinkProperty = Property.nativeCreateComputedLinkProperty(s, s2, s3);
            final long[] f = this.f;
            final int g = this.g;
            f[g] = nativeCreateComputedLinkProperty;
            this.g = g + 1;
            return this;
        }
        
        public b b(final String s, final String s2, final RealmFieldType realmFieldType, final String s3) {
            final long nativeCreatePersistedLinkProperty = Property.nativeCreatePersistedLinkProperty(s2, s, Property.a(realmFieldType, false), s3);
            final long[] c = this.c;
            final int e = this.e;
            c[e] = nativeCreatePersistedLinkProperty;
            this.e = e + 1;
            return this;
        }
        
        public b c(final String s, final String s2, final RealmFieldType realmFieldType, final boolean b, final boolean b2, final boolean b3) {
            final long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(s2, s, Property.a(realmFieldType, b3), b, b2);
            final long[] c = this.c;
            final int e = this.e;
            c[e] = nativeCreatePersistedProperty;
            this.e = e + 1;
            return this;
        }
        
        public b d(final String s, final String s2, final RealmFieldType realmFieldType, final boolean b) {
            final long nativeCreatePersistedProperty = Property.nativeCreatePersistedProperty(s2, s, Property.a(realmFieldType, b), false, false);
            final long[] c = this.c;
            final int e = this.e;
            c[e] = nativeCreatePersistedProperty;
            this.e = e + 1;
            return this;
        }
        
        public OsObjectSchemaInfo e() {
            if (this.e != -1 && this.g != -1) {
                final OsObjectSchemaInfo osObjectSchemaInfo = new OsObjectSchemaInfo(this.b, this.a, this.d, null);
                nativeAddProperties(osObjectSchemaInfo.G, this.c, this.f);
                this.e = -1;
                this.g = -1;
                return osObjectSchemaInfo;
            }
            throw new IllegalStateException("'OsObjectSchemaInfo.build()' has been called before on this object.");
        }
    }
}
