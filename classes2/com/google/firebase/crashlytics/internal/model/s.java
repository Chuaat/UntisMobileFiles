// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.k0;

final class s extends c
{
    private final Double a;
    private final int b;
    private final boolean c;
    private final int d;
    private final long e;
    private final long f;
    
    private s(@k0 final Double a, final int b, final boolean c, final int d, final long e, final long f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @k0
    @Override
    public Double b() {
        return this.a;
    }
    
    @Override
    public int c() {
        return this.b;
    }
    
    @Override
    public long d() {
        return this.f;
    }
    
    @Override
    public int e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            final Double a = this.a;
            if (a == null) {
                if (c.b() != null) {
                    return false;
                }
            }
            else if (!a.equals(c.b())) {
                return false;
            }
            if (this.b == c.c() && this.c == c.g() && this.d == c.e() && this.e == c.f() && this.f == c.d()) {
                return b;
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public long f() {
        return this.e;
    }
    
    @Override
    public boolean g() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        final Double a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        final int b = this.b;
        int n;
        if (this.c) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        final int d = this.d;
        final long e = this.e;
        final int n2 = (int)(e ^ e >>> 32);
        final long f = this.f;
        return (((((hashCode ^ 0xF4243) * 1000003 ^ b) * 1000003 ^ n) * 1000003 ^ d) * 1000003 ^ n2) * 1000003 ^ (int)(f ^ f >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Device{batteryLevel=");
        sb.append(this.a);
        sb.append(", batteryVelocity=");
        sb.append(this.b);
        sb.append(", proximityOn=");
        sb.append(this.c);
        sb.append(", orientation=");
        sb.append(this.d);
        sb.append(", ramUsed=");
        sb.append(this.e);
        sb.append(", diskUsed=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Double a;
        private Integer b;
        private Boolean c;
        private Integer d;
        private Long e;
        private Long f;
        
        @Override
        public c a() {
            final Integer b = this.b;
            String string = "";
            if (b == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" batteryVelocity");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" proximityOn");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.d == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" orientation");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.e == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" ramUsed");
                string4 = sb4.toString();
            }
            String string5 = string4;
            if (this.f == null) {
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string4);
                sb5.append(" diskUsed");
                string5 = sb5.toString();
            }
            if (string5.isEmpty()) {
                return new s(this.a, this.b, this.c, this.d, this.e, this.f, null);
            }
            final StringBuilder sb6 = new StringBuilder();
            sb6.append("Missing required properties:");
            sb6.append(string5);
            throw new IllegalStateException(sb6.toString());
        }
        
        @Override
        public a b(final Double a) {
            this.a = a;
            return this;
        }
        
        @Override
        public a c(final int i) {
            this.b = i;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.f = l;
            return this;
        }
        
        @Override
        public a e(final int i) {
            this.d = i;
            return this;
        }
        
        @Override
        public a f(final boolean b) {
            this.c = b;
            return this;
        }
        
        @Override
        public a g(final long l) {
            this.e = l;
            return this;
        }
    }
}
