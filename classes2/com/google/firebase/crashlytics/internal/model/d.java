// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class d extends a0.d
{
    private final String a;
    private final String b;
    
    private d(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public String b() {
        return this.a;
    }
    
    @j0
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof a0.d) {
            final a0.d d = (a0.d)o;
            if (!this.a.equals(d.b()) || !this.b.equals(d.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CustomAttribute{key=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        private String b;
        
        @Override
        public a0.d a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" key");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" value");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new d(this.a, this.b, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null key");
            this.a = s;
            return this;
        }
        
        @Override
        public a c(final String s) {
            Objects.requireNonNull(s, "Null value");
            this.b = s;
            return this;
        }
    }
}
