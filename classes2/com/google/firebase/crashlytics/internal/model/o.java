// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;
import androidx.annotation.k0;

final class o extends c
{
    private final String a;
    private final String b;
    private final b0<e.b> c;
    private final c d;
    private final int e;
    
    private o(final String a, @k0 final String b, final b0<e.b> c, @k0 final c d, final int e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @k0
    @Override
    public c b() {
        return this.d;
    }
    
    @j0
    @Override
    public b0<e.b> c() {
        return this.c;
    }
    
    @Override
    public int d() {
        return this.e;
    }
    
    @k0
    @Override
    public String e() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof c) {
            final c c = (c)o;
            if (this.a.equals(c.f())) {
                final String b2 = this.b;
                if (b2 == null) {
                    if (c.e() != null) {
                        return false;
                    }
                }
                else if (!b2.equals(c.e())) {
                    return false;
                }
                if (this.c.equals(c.c())) {
                    final c d = this.d;
                    if (d == null) {
                        if (c.b() != null) {
                            return false;
                        }
                    }
                    else if (!d.equals(c.b())) {
                        return false;
                    }
                    if (this.e == c.d()) {
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
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final int hashCode4 = this.c.hashCode();
        final c d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode2) * 1000003 ^ this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        private String b;
        private b0<e.b> c;
        private c d;
        private Integer e;
        
        @Override
        public c a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" type");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" frames");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.e == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" overflowCount");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new o(this.a, this.b, this.c, this.d, this.e, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public a b(final c d) {
            this.d = d;
            return this;
        }
        
        @Override
        public a c(final b0<e.b> b0) {
            Objects.requireNonNull(b0, "Null frames");
            this.c = b0;
            return this;
        }
        
        @Override
        public a d(final int i) {
            this.e = i;
            return this;
        }
        
        @Override
        public a e(final String b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a f(final String s) {
            Objects.requireNonNull(s, "Null type");
            this.a = s;
            return this;
        }
    }
}
