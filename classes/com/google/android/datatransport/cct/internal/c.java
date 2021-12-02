// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import androidx.annotation.k0;

final class c extends a
{
    private final Integer a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    
    private c(@k0 final Integer a, @k0 final String b, @k0 final String c, @k0 final String d, @k0 final String e, @k0 final String f, @k0 final String g, @k0 final String h, @k0 final String i, @k0 final String j, @k0 final String k, @k0 final String l) {
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
        this.l = l;
    }
    
    @k0
    @Override
    public String b() {
        return this.l;
    }
    
    @k0
    @Override
    public String c() {
        return this.j;
    }
    
    @k0
    @Override
    public String d() {
        return this.d;
    }
    
    @k0
    @Override
    public String e() {
        return this.h;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            final Integer a2 = this.a;
            if (a2 == null) {
                if (a.m() != null) {
                    return false;
                }
            }
            else if (!a2.equals(a.m())) {
                return false;
            }
            final String b2 = this.b;
            if (b2 == null) {
                if (a.j() != null) {
                    return false;
                }
            }
            else if (!b2.equals(a.j())) {
                return false;
            }
            final String c = this.c;
            if (c == null) {
                if (a.f() != null) {
                    return false;
                }
            }
            else if (!c.equals(a.f())) {
                return false;
            }
            final String d = this.d;
            if (d == null) {
                if (a.d() != null) {
                    return false;
                }
            }
            else if (!d.equals(a.d())) {
                return false;
            }
            final String e = this.e;
            if (e == null) {
                if (a.l() != null) {
                    return false;
                }
            }
            else if (!e.equals(a.l())) {
                return false;
            }
            final String f = this.f;
            if (f == null) {
                if (a.k() != null) {
                    return false;
                }
            }
            else if (!f.equals(a.k())) {
                return false;
            }
            final String g = this.g;
            if (g == null) {
                if (a.h() != null) {
                    return false;
                }
            }
            else if (!g.equals(a.h())) {
                return false;
            }
            final String h = this.h;
            if (h == null) {
                if (a.e() != null) {
                    return false;
                }
            }
            else if (!h.equals(a.e())) {
                return false;
            }
            final String i = this.i;
            if (i == null) {
                if (a.g() != null) {
                    return false;
                }
            }
            else if (!i.equals(a.g())) {
                return false;
            }
            final String j = this.j;
            if (j == null) {
                if (a.c() != null) {
                    return false;
                }
            }
            else if (!j.equals(a.c())) {
                return false;
            }
            final String k = this.k;
            if (k == null) {
                if (a.i() != null) {
                    return false;
                }
            }
            else if (!k.equals(a.i())) {
                return false;
            }
            final String l = this.l;
            final String b3 = a.b();
            if (l == null) {
                if (b3 == null) {
                    return b;
                }
            }
            else if (l.equals(b3)) {
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
        return this.c;
    }
    
    @k0
    @Override
    public String g() {
        return this.i;
    }
    
    @k0
    @Override
    public String h() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        final Integer a = this.a;
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
        final String d = this.d;
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
        int hashCode8;
        if (g == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = g.hashCode();
        }
        final String h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final String i = this.i;
        int hashCode10;
        if (i == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = i.hashCode();
        }
        final String j = this.j;
        int hashCode11;
        if (j == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = j.hashCode();
        }
        final String k = this.k;
        int hashCode12;
        if (k == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = k.hashCode();
        }
        final String l = this.l;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return (((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ hashCode;
    }
    
    @k0
    @Override
    public String i() {
        return this.k;
    }
    
    @k0
    @Override
    public String j() {
        return this.b;
    }
    
    @k0
    @Override
    public String k() {
        return this.f;
    }
    
    @k0
    @Override
    public String l() {
        return this.e;
    }
    
    @k0
    @Override
    public Integer m() {
        return this.a;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AndroidClientInfo{sdkVersion=");
        sb.append(this.a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Integer a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private String j;
        private String k;
        private String l;
        
        @Override
        public a a() {
            return new c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, null);
        }
        
        @Override
        public a b(@k0 final String l) {
            this.l = l;
            return this;
        }
        
        @Override
        public a c(@k0 final String j) {
            this.j = j;
            return this;
        }
        
        @Override
        public a d(@k0 final String d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a e(@k0 final String h) {
            this.h = h;
            return this;
        }
        
        @Override
        public a f(@k0 final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a g(@k0 final String i) {
            this.i = i;
            return this;
        }
        
        @Override
        public a h(@k0 final String g) {
            this.g = g;
            return this;
        }
        
        @Override
        public a i(@k0 final String k) {
            this.k = k;
            return this;
        }
        
        @Override
        public a j(@k0 final String b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a k(@k0 final String f) {
            this.f = f;
            return this;
        }
        
        @Override
        public a l(@k0 final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a m(@k0 final Integer a) {
            this.a = a;
            return this;
        }
    }
}
