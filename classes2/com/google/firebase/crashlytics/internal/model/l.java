// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class l extends a0.f.d.a
{
    private final a0.f.d.a.b a;
    private final b0<a0.d> b;
    private final b0<a0.d> c;
    private final Boolean d;
    private final int e;
    
    private l(final a0.f.d.a.b a, @k0 final b0<a0.d> b, @k0 final b0<a0.d> c, @k0 final Boolean d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @k0
    @Override
    public Boolean b() {
        return this.d;
    }
    
    @k0
    @Override
    public b0<a0.d> c() {
        return this.b;
    }
    
    @j0
    @Override
    public a0.f.d.a.b d() {
        return this.a;
    }
    
    @k0
    @Override
    public b0<a0.d> e() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f.d.a) {
            final a0.f.d.a a = (a0.f.d.a)o;
            if (this.a.equals(a.d())) {
                final b0<a0.d> b2 = this.b;
                if (b2 == null) {
                    if (a.c() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(a.c())) {
                    return false;
                }
                final b0<a0.d> c = this.c;
                if (c == null) {
                    if (a.e() != null) {
                        return false;
                    }
                }
                else if (!c.equals(a.e())) {
                    return false;
                }
                final Boolean d = this.d;
                if (d == null) {
                    if (a.b() != null) {
                        return false;
                    }
                }
                else if (!d.equals(a.b())) {
                    return false;
                }
                if (this.e == a.f()) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int f() {
        return this.e;
    }
    
    @Override
    public a0.f.d.a.a g() {
        return new b((a0.f.d.a)this);
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final b0<a0.d> b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final b0<a0.d> c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Boolean d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2) * 1000003 ^ this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Application{execution=");
        sb.append(this.a);
        sb.append(", customAttributes=");
        sb.append(this.b);
        sb.append(", internalKeys=");
        sb.append(this.c);
        sb.append(", background=");
        sb.append(this.d);
        sb.append(", uiOrientation=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.d.a.a
    {
        private a0.f.d.a.b a;
        private b0<a0.d> b;
        private b0<a0.d> c;
        private Boolean d;
        private Integer e;
        
        b() {
        }
        
        private b(final a0.f.d.a a) {
            this.a = a.d();
            this.b = a.c();
            this.c = a.e();
            this.d = a.b();
            this.e = a.f();
        }
        
        @Override
        public a0.f.d.a a() {
            final a0.f.d.a.b a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" execution");
                string = sb.toString();
            }
            String string2 = string;
            if (this.e == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" uiOrientation");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new l(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a0.f.d.a.a b(@k0 final Boolean d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a0.f.d.a.a c(final b0<a0.d> b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a0.f.d.a.a d(final a0.f.d.a.b b) {
            Objects.requireNonNull(b, "Null execution");
            this.a = b;
            return this;
        }
        
        @Override
        public a0.f.d.a.a e(final b0<a0.d> c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a0.f.d.a.a f(final int i) {
            this.e = i;
            return this;
        }
    }
}
