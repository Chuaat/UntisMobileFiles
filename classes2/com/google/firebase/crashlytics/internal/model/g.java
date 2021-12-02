// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import h3.a;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class g extends a0.f
{
    private final String a;
    private final String b;
    private final long c;
    private final Long d;
    private final boolean e;
    private final a0.f.a f;
    private final a0.f.f g;
    private final a0.f.e h;
    private final a0.f.c i;
    private final b0<a0.f.d> j;
    private final int k;
    
    private g(final String a, final String b, final long c, @k0 final Long d, final boolean e, final a0.f.a f, @k0 final a0.f.f g, @k0 final a0.f.e h, @k0 final a0.f.c i, @k0 final b0<a0.f.d> j, final int k) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @j0
    @Override
    public a0.f.a b() {
        return this.f;
    }
    
    @k0
    @Override
    public a0.f.c c() {
        return this.i;
    }
    
    @k0
    @Override
    public Long d() {
        return this.d;
    }
    
    @k0
    @Override
    public b0<a0.f.d> e() {
        return this.j;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f) {
            final a0.f f = (a0.f)o;
            if (this.a.equals(f.f()) && this.b.equals(f.h()) && this.c == f.k()) {
                final Long d = this.d;
                if (d == null) {
                    if (f.d() != null) {
                        return false;
                    }
                }
                else if (!d.equals(f.d())) {
                    return false;
                }
                if (this.e == f.m() && this.f.equals(f.b())) {
                    final a0.f.f g = this.g;
                    if (g == null) {
                        if (f.l() != null) {
                            return false;
                        }
                    }
                    else if (!g.equals(f.l())) {
                        return false;
                    }
                    final a0.f.e h = this.h;
                    if (h == null) {
                        if (f.j() != null) {
                            return false;
                        }
                    }
                    else if (!h.equals(f.j())) {
                        return false;
                    }
                    final a0.f.c i = this.i;
                    if (i == null) {
                        if (f.c() != null) {
                            return false;
                        }
                    }
                    else if (!i.equals(f.c())) {
                        return false;
                    }
                    final b0<a0.f.d> j = this.j;
                    if (j == null) {
                        if (f.e() != null) {
                            return false;
                        }
                    }
                    else if (!j.equals(f.e())) {
                        return false;
                    }
                    if (this.k == f.g()) {
                        return b;
                    }
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
        return this.a;
    }
    
    @Override
    public int g() {
        return this.k;
    }
    
    @h3.a.b
    @j0
    @Override
    public String h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        final int n = (int)(c ^ c >>> 32);
        final Long d = this.d;
        int hashCode3 = 0;
        int hashCode4;
        if (d == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = d.hashCode();
        }
        int n2;
        if (this.e) {
            n2 = 1231;
        }
        else {
            n2 = 1237;
        }
        final int hashCode5 = this.f.hashCode();
        final a0.f.f g = this.g;
        int hashCode6;
        if (g == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = g.hashCode();
        }
        final a0.f.e h = this.h;
        int hashCode7;
        if (h == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = h.hashCode();
        }
        final a0.f.c i = this.i;
        int hashCode8;
        if (i == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = i.hashCode();
        }
        final b0<a0.f.d> j = this.j;
        if (j != null) {
            hashCode3 = j.hashCode();
        }
        return ((((((((((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ n) * 1000003 ^ hashCode4) * 1000003 ^ n2) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode3) * 1000003 ^ this.k;
    }
    
    @k0
    @Override
    public a0.f.e j() {
        return this.h;
    }
    
    @Override
    public long k() {
        return this.c;
    }
    
    @k0
    @Override
    public a0.f.f l() {
        return this.g;
    }
    
    @Override
    public boolean m() {
        return this.e;
    }
    
    @Override
    public a0.f.b n() {
        return new b((a0.f)this);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Session{generator=");
        sb.append(this.a);
        sb.append(", identifier=");
        sb.append(this.b);
        sb.append(", startedAt=");
        sb.append(this.c);
        sb.append(", endedAt=");
        sb.append(this.d);
        sb.append(", crashed=");
        sb.append(this.e);
        sb.append(", app=");
        sb.append(this.f);
        sb.append(", user=");
        sb.append(this.g);
        sb.append(", os=");
        sb.append(this.h);
        sb.append(", device=");
        sb.append(this.i);
        sb.append(", events=");
        sb.append(this.j);
        sb.append(", generatorType=");
        sb.append(this.k);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.b
    {
        private String a;
        private String b;
        private Long c;
        private Long d;
        private Boolean e;
        private a0.f.a f;
        private a0.f.f g;
        private a0.f.e h;
        private a0.f.c i;
        private b0<a0.f.d> j;
        private Integer k;
        
        b() {
        }
        
        private b(final a0.f f) {
            this.a = f.f();
            this.b = f.h();
            this.c = f.k();
            this.d = f.d();
            this.e = f.m();
            this.f = f.b();
            this.g = f.l();
            this.h = f.j();
            this.i = f.c();
            this.j = f.e();
            this.k = f.g();
        }
        
        @Override
        public a0.f a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" generator");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" identifier");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" startedAt");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" crashed");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.f == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" app");
                string5 = sb5.toString();
            }
            String string6 = string5;
            if (this.k == null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string5);
                sb6.append(" generatorType");
                string6 = sb6.toString();
            }
            if (string6.isEmpty()) {
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, null);
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(string6);
            throw new IllegalStateException(sb7.toString());
        }
        
        @Override
        public a0.f.b b(final a0.f.a a) {
            Objects.requireNonNull(a, "Null app");
            this.f = a;
            return this;
        }
        
        @Override
        public a0.f.b c(final boolean b) {
            this.e = b;
            return this;
        }
        
        @Override
        public a0.f.b d(final a0.f.c i) {
            this.i = i;
            return this;
        }
        
        @Override
        public a0.f.b e(final Long d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a0.f.b f(final b0<a0.f.d> j) {
            this.j = j;
            return this;
        }
        
        @Override
        public a0.f.b g(final String s) {
            Objects.requireNonNull(s, "Null generator");
            this.a = s;
            return this;
        }
        
        @Override
        public a0.f.b h(final int i) {
            this.k = i;
            return this;
        }
        
        @Override
        public a0.f.b i(final String s) {
            Objects.requireNonNull(s, "Null identifier");
            this.b = s;
            return this;
        }
        
        @Override
        public a0.f.b k(final a0.f.e h) {
            this.h = h;
            return this;
        }
        
        @Override
        public a0.f.b l(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public a0.f.b m(final a0.f.f g) {
            this.g = g;
            return this;
        }
    }
}
