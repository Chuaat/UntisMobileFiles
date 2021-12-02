// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.Objects;
import java.util.Set;

final class d extends g.b
{
    private final long a;
    private final long b;
    private final Set<c> c;
    
    private d(final long a, final long b, final Set<c> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    long b() {
        return this.a;
    }
    
    @Override
    Set<c> c() {
        return this.c;
    }
    
    @Override
    long d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof g.b) {
            final g.b b2 = (g.b)o;
            if (this.a != b2.b() || this.b != b2.d() || !this.c.equals(b2.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        final int n = (int)(a ^ a >>> 32);
        final long b = this.b;
        return this.c.hashCode() ^ ((n ^ 0xF4243) * 1000003 ^ (int)(b >>> 32 ^ b)) * 1000003;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ConfigValue{delta=");
        sb.append(this.a);
        sb.append(", maxAllowedDelay=");
        sb.append(this.b);
        sb.append(", flags=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Long a;
        private Long b;
        private Set<c> c;
        
        @Override
        public g.b a() {
            final Long a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" delta");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" maxAllowedDelay");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" flags");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new d(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(final long l) {
            this.a = l;
            return this;
        }
        
        @Override
        public a c(final Set<c> set) {
            Objects.requireNonNull(set, "Null flags");
            this.c = set;
            return this;
        }
        
        @Override
        public a d(final long l) {
            this.b = l;
            return this;
        }
    }
}
