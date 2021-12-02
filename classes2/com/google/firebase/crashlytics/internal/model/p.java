// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class p extends d
{
    private final String a;
    private final String b;
    private final long c;
    
    private p(final String a, final String b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    @Override
    public long b() {
        return this.c;
    }
    
    @j0
    @Override
    public String c() {
        return this.b;
    }
    
    @j0
    @Override
    public String d() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof d) {
            final d d = (d)o;
            if (!this.a.equals(d.d()) || !this.b.equals(d.c()) || this.c != d.b()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Signal{name=");
        sb.append(this.a);
        sb.append(", code=");
        sb.append(this.b);
        sb.append(", address=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        private String b;
        private Long c;
        
        @Override
        public d a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" name");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" code");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" address");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new p(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public a c(final String s) {
            Objects.requireNonNull(s, "Null code");
            this.b = s;
            return this;
        }
        
        @Override
        public a d(final String s) {
            Objects.requireNonNull(s, "Null name");
            this.a = s;
            return this;
        }
    }
}
