// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import androidx.annotation.j0;

final class u extends e
{
    private final int a;
    private final String b;
    private final String c;
    private final boolean d;
    
    private u(final int a, final String b, final String c, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @j0
    @Override
    public String b() {
        return this.c;
    }
    
    @Override
    public int c() {
        return this.a;
    }
    
    @j0
    @Override
    public String d() {
        return this.b;
    }
    
    @Override
    public boolean e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof e) {
            final e e = (e)o;
            if (this.a != e.c() || !this.b.equals(e.d()) || !this.c.equals(e.b()) || this.d != e.e()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int a = this.a;
        final int hashCode = this.b.hashCode();
        final int hashCode2 = this.c.hashCode();
        int n;
        if (this.d) {
            n = 1231;
        }
        else {
            n = 1237;
        }
        return (((a ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("OperatingSystem{platform=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append(", buildVersion=");
        sb.append(this.c);
        sb.append(", jailbroken=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private Integer a;
        private String b;
        private String c;
        private Boolean d;
        
        @Override
        public e a() {
            final Integer a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" platform");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" version");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" buildVersion");
                string3 = sb3.toString();
            }
            String string4 = string3;
            if (this.d == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(string3);
                sb4.append(" jailbroken");
                string4 = sb4.toString();
            }
            if (string4.isEmpty()) {
                return new u(this.a, this.b, this.c, this.d, null);
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Missing required properties:");
            sb5.append(string4);
            throw new IllegalStateException(sb5.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null buildVersion");
            this.c = s;
            return this;
        }
        
        @Override
        public a c(final boolean b) {
            this.d = b;
            return this;
        }
        
        @Override
        public a d(final int i) {
            this.a = i;
            return this;
        }
        
        @Override
        public a e(final String s) {
            Objects.requireNonNull(s, "Null version");
            this.b = s;
            return this;
        }
    }
}
