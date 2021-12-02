// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class m extends a0.f.d.a.b
{
    private final b0<e> a;
    private final c b;
    private final a0.a c;
    private final d d;
    private final b0<a0.f.d.a.b.a> e;
    
    private m(@k0 final b0<e> a, @k0 final c b, @k0 final a0.a c, final d d, final b0<a0.f.d.a.b.a> e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @k0
    @Override
    public a0.a b() {
        return this.c;
    }
    
    @j0
    @Override
    public b0<a0.f.d.a.b.a> c() {
        return this.e;
    }
    
    @k0
    @Override
    public c d() {
        return this.b;
    }
    
    @j0
    @Override
    public d e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f.d.a.b) {
            final a0.f.d.a.b b2 = (a0.f.d.a.b)o;
            final b0<e> a = this.a;
            if (a == null) {
                if (b2.f() != null) {
                    return false;
                }
            }
            else if (!a.equals(b2.f())) {
                return false;
            }
            final c b3 = this.b;
            if (b3 == null) {
                if (b2.d() != null) {
                    return false;
                }
            }
            else if (!b3.equals(b2.d())) {
                return false;
            }
            final a0.a c = this.c;
            if (c == null) {
                if (b2.b() != null) {
                    return false;
                }
            }
            else if (!c.equals(b2.b())) {
                return false;
            }
            if (this.d.equals(b2.e()) && this.e.equals(b2.c())) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @k0
    @Override
    public b0<e> f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final b0<e> a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final c b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final a0.a c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return ((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.d.a.b.b
    {
        private b0<e> a;
        private c b;
        private a0.a c;
        private d d;
        private b0<a0.f.d.a.b.a> e;
        
        @Override
        public a0.f.d.a.b a() {
            final d d = this.d;
            String string = "";
            if (d == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" signal");
                string = sb.toString();
            }
            String string2 = string;
            if (this.e == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" binaries");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new m(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a0.f.d.a.b.b b(final a0.a c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.b c(final b0<a0.f.d.a.b.a> b0) {
            Objects.requireNonNull(b0, "Null binaries");
            this.e = b0;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.b d(final c b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.b e(final d d) {
            Objects.requireNonNull(d, "Null signal");
            this.d = d;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.b f(final b0<e> a) {
            this.a = a;
            return this;
        }
    }
}
