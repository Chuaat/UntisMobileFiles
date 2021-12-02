// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import h3.a;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class n extends a0.f.d.a.b.a
{
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    
    private n(final long a, final long b, final String c, @k0 final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @j0
    @Override
    public long b() {
        return this.a;
    }
    
    @j0
    @Override
    public String c() {
        return this.c;
    }
    
    @Override
    public long d() {
        return this.b;
    }
    
    @h3.a.b
    @k0
    @Override
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.f.d.a.b.a) {
            final a0.f.d.a.b.a a = (a0.f.d.a.b.a)o;
            if (this.a == a.b() && this.b == a.d() && this.c.equals(a.c())) {
                final String d = this.d;
                final String e = a.e();
                if (d == null) {
                    if (e == null) {
                        return b;
                    }
                }
                else if (d.equals(e)) {
                    return b;
                }
            }
            b = false;
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        final int n2 = (int)(b >>> 32 ^ b);
        final int hashCode = this.c.hashCode();
        final String d = this.d;
        int hashCode2;
        if (d == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = d.hashCode();
        }
        return hashCode2 ^ (((n ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ hashCode) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a0.f.d.a.b.a.a
    {
        private Long a;
        private Long b;
        private String c;
        private String d;
        
        @Override
        public a0.f.d.a.b.a a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" baseAddress");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" size");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" name");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new n(this.a, this.b, this.c, this.d, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a0.f.d.a.b.a.a b(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.a.a c(final String s) {
            Objects.requireNonNull(s, "Null name");
            this.c = s;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.a.a d(final long l) {
            this.b = l;
            return this;
        }
        
        @Override
        public a0.f.d.a.b.a.a e(@k0 final String d) {
            this.d = d;
            return this;
        }
    }
}
