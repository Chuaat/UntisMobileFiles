// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.persistence;

final class a extends d
{
    private final long g;
    private final int h;
    private final int i;
    private final long j;
    private final int k;
    
    private a(final long g, final int h, final int i, final long j, final int k) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    int b() {
        return this.i;
    }
    
    @Override
    long c() {
        return this.j;
    }
    
    @Override
    int d() {
        return this.h;
    }
    
    @Override
    int e() {
        return this.k;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            if (this.g != d.f() || this.h != d.d() || this.i != d.b() || this.j != d.c() || this.k != d.e()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    long f() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        final long g = this.g;
        final int n = (int)(g ^ g >>> 32);
        final int h = this.h;
        final int i = this.i;
        final long j = this.j;
        return this.k ^ ((((n ^ 0xF4243) * 1000003 ^ h) * 1000003 ^ i) * 1000003 ^ (int)(j >>> 32 ^ j)) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.g);
        sb.append(", loadBatchSize=");
        sb.append(this.h);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.i);
        sb.append(", eventCleanUpAge=");
        sb.append(this.j);
        sb.append(", maxBlobByteSizePerRow=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends d.a
    {
        private Long a;
        private Integer b;
        private Integer c;
        private Long d;
        private Integer e;
        
        @Override
        d a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" maxStorageSizeInBytes");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" loadBatchSize");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" criticalSectionEnterTimeoutMs");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" eventCleanUpAge");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.e == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" maxBlobByteSizePerRow");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new a(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        d.a b(final int i) {
            this.c = i;
            return this;
        }
        
        @Override
        d.a c(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        d.a d(final int i) {
            this.b = i;
            return this;
        }
        
        @Override
        d.a e(final int i) {
            this.e = i;
            return this;
        }
        
        @Override
        d.a f(final long l) {
            this.a = l;
            return this;
        }
    }
}
