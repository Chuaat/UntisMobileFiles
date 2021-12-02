// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import h3.a$a;
import androidx.annotation.k0;
import java.util.List;

final class g extends m
{
    private final long a;
    private final long b;
    private final k c;
    private final Integer d;
    private final String e;
    private final List<l> f;
    private final p g;
    
    private g(final long a, final long b, @k0 final k c, @k0 final Integer d, @k0 final String e, @k0 final List<l> f, @k0 final p g) {
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
    public k b() {
        return this.c;
    }
    
    @a$a(name = "logEvent")
    @k0
    @Override
    public List<l> c() {
        return this.f;
    }
    
    @k0
    @Override
    public Integer d() {
        return this.d;
    }
    
    @k0
    @Override
    public String e() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (this.a == m.g() && this.b == m.h()) {
                final k c = this.c;
                if (c == null) {
                    if (m.b() != null) {
                        return false;
                    }
                }
                else if (!c.equals(m.b())) {
                    return false;
                }
                final Integer d = this.d;
                if (d == null) {
                    if (m.d() != null) {
                        return false;
                    }
                }
                else if (!d.equals(m.d())) {
                    return false;
                }
                final String e = this.e;
                if (e == null) {
                    if (m.e() != null) {
                        return false;
                    }
                }
                else if (!e.equals(m.e())) {
                    return false;
                }
                final List<l> f = this.f;
                if (f == null) {
                    if (m.c() != null) {
                        return false;
                    }
                }
                else if (!f.equals(m.c())) {
                    return false;
                }
                final p g = this.g;
                final p f2 = m.f();
                if (g == null) {
                    if (f2 == null) {
                        return b;
                    }
                }
                else if (g.equals(f2)) {
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
    public p f() {
        return this.g;
    }
    
    @Override
    public long g() {
        return this.a;
    }
    
    @Override
    public long h() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final k c = this.c;
        int hashCode = 0;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode3;
        if (d == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = d.hashCode();
        }
        final String e = this.e;
        int hashCode4;
        if (e == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = e.hashCode();
        }
        final List<l> f = this.f;
        int hashCode5;
        if (f == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = f.hashCode();
        }
        final p g = this.g;
        if (g != null) {
            hashCode = g.hashCode();
        }
        return ((((((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LogRequest{requestTimeMs=");
        sb.append(this.a);
        sb.append(", requestUptimeMs=");
        sb.append(this.b);
        sb.append(", clientInfo=");
        sb.append(this.c);
        sb.append(", logSource=");
        sb.append(this.d);
        sb.append(", logSourceName=");
        sb.append(this.e);
        sb.append(", logEvents=");
        sb.append(this.f);
        sb.append(", qosTier=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Long a;
        private Long b;
        private k c;
        private Integer d;
        private String e;
        private List<l> f;
        private p g;
        
        @Override
        public m a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" requestTimeMs");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" requestUptimeMs");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new g(this.a, this.b, this.c, this.d, this.e, this.f, this.g, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(@k0 final k c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a c(@k0 final List<l> f) {
            this.f = f;
            return this;
        }
        
        @Override
        a d(@k0 final Integer d) {
            this.d = d;
            return this;
        }
        
        @Override
        a e(@k0 final String e) {
            this.e = e;
            return this;
        }
        
        @Override
        public a f(@k0 final p g) {
            this.g = g;
            return this;
        }
        
        @Override
        public a g(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a h(final long l) {
            this.b = l;
            return this;
        }
    }
}
