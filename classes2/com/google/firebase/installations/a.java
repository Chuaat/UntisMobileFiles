// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import java.util.Objects;
import androidx.annotation.j0;

final class a extends o
{
    private final String a;
    private final long b;
    private final long c;
    
    private a(final String a, final long b, final long c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @j0
    @Override
    public String b() {
        return this.a;
    }
    
    @j0
    @Override
    public long c() {
        return this.c;
    }
    
    @j0
    @Override
    public long d() {
        return this.b;
    }
    
    @Override
    public o.a e() {
        return new b((o)this);
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o) {
            final o o2 = (o)o;
            if (!this.a.equals(o2.b()) || this.b != o2.d() || this.c != o2.c()) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final long c = this.c;
        return ((hashCode ^ 0xF4243) * 1000003 ^ n) * 1000003 ^ (int)(c ^ c >>> 32);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("InstallationTokenResult{token=");
        sb.append(this.a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.b);
        sb.append(", tokenCreationTimestamp=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends o.a
    {
        private String a;
        private Long b;
        private Long c;
        
        b() {
        }
        
        private b(final o o) {
            this.a = o.b();
            this.b = o.d();
            this.c = o.c();
        }
        
        @Override
        public o a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" token");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" tokenExpirationTimestamp");
                string2 = sb2.toString();
            }
            String string3 = string2;
            if (this.c == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string2);
                sb3.append(" tokenCreationTimestamp");
                string3 = sb3.toString();
            }
            if (string3.isEmpty()) {
                return new a(this.a, this.b, this.c, null);
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Missing required properties:");
            sb4.append(string3);
            throw new IllegalStateException(sb4.toString());
        }
        
        @Override
        public o.a b(final String s) {
            Objects.requireNonNull(s, "Null token");
            this.a = s;
            return this;
        }
        
        @Override
        public o.a c(final long l) {
            this.c = l;
            return this;
        }
        
        @Override
        public o.a d(final long l) {
            this.b = l;
            return this;
        }
    }
}
