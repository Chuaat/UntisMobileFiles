// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class k extends a0.f.d
{
    private final long a;
    private final String b;
    private final a0.f.d.a c;
    private final a0.f.d.c d;
    private final a0.f.d.d e;
    
    private k(final long a, final String b, final a0.f.d.a c, final a0.f.d.c d, @k0 final a0.f.d.d e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @j0
    @Override
    public a0.f.d.a b() {
        return this.c;
    }
    
    @j0
    @Override
    public a0.f.d.c c() {
        return this.d;
    }
    
    @k0
    @Override
    public a0.f.d.d d() {
        return this.e;
    }
    
    @Override
    public long e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f.d) {
            final a0.f.d d = (a0.f.d)o;
            if (this.a == d.e() && this.b.equals(d.f()) && this.c.equals(d.b()) && this.d.equals(d.c())) {
                final a0.f.d.d e = this.e;
                final a0.f.d.d d2 = d.d();
                if (e == null) {
                    if (d2 == null) {
                        return b;
                    }
                }
                else if (e.equals(d2)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @j0
    @Override
    public String f() {
        return this.b;
    }
    
    @Override
    public a0.f.d.b g() {
        return new b((a0.f.d)this);
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        final int hashCode3 = this.d.hashCode();
        final a0.f.d.d e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        return hashCode4 ^ ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Event{timestamp=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", app=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", log=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.d.b
    {
        private Long a;
        private String b;
        private a0.f.d.a c;
        private a0.f.d.c d;
        private a0.f.d.d e;
        
        b() {
        }
        
        private b(final a0.f.d d) {
            this.a = d.e();
            this.b = d.f();
            this.c = d.b();
            this.d = d.c();
            this.e = d.d();
        }
        
        @Override
        public a0.f.d a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" timestamp");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" type");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" app");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" device");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new k(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public a0.f.d.b b(final a0.f.d.a a) {
            Objects.requireNonNull(a, "Null app");
            this.c = a;
            return this;
        }
        
        @Override
        public a0.f.d.b c(final a0.f.d.c c) {
            Objects.requireNonNull(c, "Null device");
            this.d = c;
            return this;
        }
        
        @Override
        public a0.f.d.b d(final a0.f.d.d e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a0.f.d.b e(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a0.f.d.b f(final String s) {
            Objects.requireNonNull(s, "Null type");
            this.b = s;
            return this;
        }
    }
}
