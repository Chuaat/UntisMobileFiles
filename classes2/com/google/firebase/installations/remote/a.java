// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations.remote;

import androidx.annotation.k0;

final class a extends d
{
    private final String a;
    private final String b;
    private final String c;
    private final f d;
    private final d.b e;
    
    private a(@k0 final String a, @k0 final String b, @k0 final String c, @k0 final f d, @k0 final d.b e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @k0
    @Override
    public f b() {
        return this.d;
    }
    
    @k0
    @Override
    public String c() {
        return this.b;
    }
    
    @k0
    @Override
    public String d() {
        return this.c;
    }
    
    @k0
    @Override
    public d.b e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            final String a = this.a;
            if (a == null) {
                if (d.f() != null) {
                    return false;
                }
            }
            else if (!a.equals(d.f())) {
                return false;
            }
            final String b2 = this.b;
            if (b2 == null) {
                if (d.c() != null) {
                    return false;
                }
            }
            else if (!b2.equals(d.c())) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (d.d() != null) {
                    return false;
                }
            }
            else if (!c.equals(d.d())) {
                return false;
            }
            final f d2 = this.d;
            if (d2 == null) {
                if (d.b() != null) {
                    return false;
                }
            }
            else if (!d2.equals(d.b())) {
                return false;
            }
            final d.b e = this.e;
            final d.b e2 = d.e();
            if (e == null) {
                if (e2 == null) {
                    return b;
                }
            }
            else if (e.equals(e2)) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @k0
    @Override
    public String f() {
        return this.a;
    }
    
    @Override
    public d.a g() {
        return new b((d)this);
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final f d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final d.b e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InstallationResponse{uri=");
        sb.append(this.a);
        sb.append(", fid=");
        sb.append(this.b);
        sb.append(", refreshToken=");
        sb.append(this.c);
        sb.append(", authToken=");
        sb.append(this.d);
        sb.append(", responseCode=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends d.a
    {
        private String a;
        private String b;
        private String c;
        private f d;
        private d.b e;
        
        b() {
        }
        
        private b(final d d) {
            this.a = d.f();
            this.b = d.c();
            this.c = d.d();
            this.d = d.b();
            this.e = d.e();
        }
        
        @Override
        public d a() {
            return new a(this.a, this.b, this.c, this.d, this.e, null);
        }
        
        @Override
        public d.a b(final f d) {
            this.d = d;
            return this;
        }
        
        @Override
        public d.a c(final String b) {
            this.b = b;
            return this;
        }
        
        @Override
        public d.a d(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public d.a e(final d.b e) {
            this.e = e;
            return this;
        }
        
        @Override
        public d.a f(final String a) {
            this.a = a;
            return this;
        }
    }
}
