// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class h extends a0.f.a
{
    private final String a;
    private final String b;
    private final String c;
    private final a0.f.a.b d;
    private final String e;
    private final String f;
    private final String g;
    
    private h(final String a, final String b, @k0 final String c, @k0 final a0.f.a.b d, @k0 final String e, @k0 final String f, @k0 final String g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @k0
    @Override
    public String b() {
        return this.f;
    }
    
    @k0
    @Override
    public String c() {
        return this.g;
    }
    
    @k0
    @Override
    public String d() {
        return this.c;
    }
    
    @j0
    @Override
    public String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f.a) {
            final a0.f.a a = (a0.f.a)o;
            if (this.a.equals(a.e()) && this.b.equals(a.h())) {
                final String c = this.c;
                if (c == null) {
                    if (a.d() != null) {
                        return false;
                    }
                }
                else if (!c.equals(a.d())) {
                    return false;
                }
                final a0.f.a.b d = this.d;
                if (d == null) {
                    if (a.g() != null) {
                        return false;
                    }
                }
                else if (!d.equals(a.g())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (a.f() != null) {
                        return false;
                    }
                }
                else if (!e.equals(a.f())) {
                    return false;
                }
                final String f = this.f;
                if (f == null) {
                    if (a.b() != null) {
                        return false;
                    }
                }
                else if (!f.equals(a.b())) {
                    return false;
                }
                final String g = this.g;
                final String c2 = a.c();
                if (g == null) {
                    if (c2 == null) {
                        return b;
                    }
                }
                else if (g.equals(c2)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @k0
    @Override
    public String f() {
        return this.e;
    }
    
    @k0
    @Override
    public a0.f.a.b g() {
        return this.d;
    }
    
    @j0
    @Override
    public String h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final String c = this.c;
        int hashCode3 = 0;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final a0.f.a.b d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final String e = this.e;
        int hashCode6;
        if (e == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = e.hashCode();
        }
        final String f = this.f;
        int hashCode7;
        if (f == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = f.hashCode();
        }
        final String g = this.g;
        if (g != null) {
            hashCode3 = g.hashCode();
        }
        return ((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode3;
    }
    
    @Override
    protected a0.f.a.a i() {
        return new b((a0.f.a)this);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Application{identifier=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=");
        sb.append(this.d);
        sb.append(", installationUuid=");
        sb.append(this.e);
        sb.append(", developmentPlatform=");
        sb.append(this.f);
        sb.append(", developmentPlatformVersion=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.a.a
    {
        private String a;
        private String b;
        private String c;
        private a0.f.a.b d;
        private String e;
        private String f;
        private String g;
        
        b() {
        }
        
        private b(final a0.f.a a) {
            this.a = a.e();
            this.b = a.h();
            this.c = a.d();
            this.d = a.g();
            this.e = a.f();
            this.f = a.b();
            this.g = a.c();
        }
        
        @Override
        public a0.f.a a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" identifier");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" version");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new h(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a0.f.a.a b(@k0 final String f) {
            this.f = f;
            return this;
        }
        
        @Override
        public a0.f.a.a c(@k0 final String g) {
            this.g = g;
            return this;
        }
        
        @Override
        public a0.f.a.a d(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a0.f.a.a e(final String s) {
            Objects.requireNonNull(s, "Null identifier");
            this.a = s;
            return this;
        }
        
        @Override
        public a0.f.a.a f(final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a0.f.a.a g(final a0.f.a.b d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a0.f.a.a h(final String s) {
            Objects.requireNonNull(s, "Null version");
            this.b = s;
            return this;
        }
    }
}
