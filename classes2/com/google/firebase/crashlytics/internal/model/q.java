// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class q extends e
{
    private final String a;
    private final int b;
    private final b0<e.b> c;
    
    private q(final String a, final int b, final b0<e.b> c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    @Override
    public b0<e.b> b() {
        return this.c;
    }
    
    @Override
    public int c() {
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
        if (o instanceof e) {
            final e e = (e)o;
            if (!this.a.equals(e.d()) || this.b != e.c() || !this.c.equals(e.b())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends e.a
    {
        private String a;
        private Integer b;
        private b0<e.b> c;
        
        @Override
        public e a() {
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
                sb2.append(" importance");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" frames");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new q(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public e.a b(final b0<e.b> b0) {
            Objects.requireNonNull(b0, "Null frames");
            this.c = b0;
            return this;
        }
        
        @Override
        public e.a c(final int i) {
            this.b = i;
            return this;
        }
        
        @Override
        public e.a d(final String s) {
            Objects.requireNonNull(s, "Null name");
            this.a = s;
            return this;
        }
    }
}
