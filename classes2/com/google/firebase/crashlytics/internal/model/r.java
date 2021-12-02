// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class r extends e.b
{
    private final long a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    
    private r(final long a, final String b, @k0 final String c, final long d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @k0
    @Override
    public String b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.e;
    }
    
    @Override
    public long d() {
        return this.d;
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
        if (o instanceof e.b) {
            final e.b b2 = (e.b)o;
            if (this.a == b2.e() && this.b.equals(b2.f())) {
                final String c = this.c;
                if (c == null) {
                    if (b2.b() != null) {
                        return false;
                    }
                }
                else if (!c.equals(b2.b())) {
                    return false;
                }
                if (this.d == b2.d() && this.e == b2.c()) {
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
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final int hashCode = this.b.hashCode();
        final String c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        final long d = this.d;
        return this.e ^ ((((n ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ (int)(d >>> 32 ^ d)) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Frame{pc=");
        sb.append(this.a);
        sb.append(", symbol=");
        sb.append(this.b);
        sb.append(", file=");
        sb.append(this.c);
        sb.append(", offset=");
        sb.append(this.d);
        sb.append(", importance=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Long a;
        private String b;
        private String c;
        private Long d;
        private Integer e;
        
        @Override
        public e.b a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" pc");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" symbol");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" offset");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" importance");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new r(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public a b(final String c) {
            this.c = c;
            return this;
        }
        
        @Override
        public a c(final int i) {
            this.e = i;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.d = l;
            return this;
        }
        
        @Override
        public a e(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a f(final String s) {
            Objects.requireNonNull(s, "Null symbol");
            this.b = s;
            return this;
        }
    }
}
