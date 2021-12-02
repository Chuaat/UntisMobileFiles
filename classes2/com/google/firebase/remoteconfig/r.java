// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig;

import com.google.firebase.remoteconfig.internal.l;
import androidx.annotation.j0;

public class r
{
    private final long a;
    private final long b;
    
    private r(final b b) {
        this.a = b.a;
        this.b = b.b;
    }
    
    public long a() {
        return this.a;
    }
    
    public long b() {
        return this.b;
    }
    
    @j0
    public b c() {
        final b b = new b();
        b.f(this.a());
        b.g(this.b());
        return b;
    }
    
    public static class b
    {
        private long a;
        private long b;
        
        public b() {
            this.a = 60L;
            this.b = l.j;
        }
        
        @j0
        public r c() {
            return new r(this, null);
        }
        
        public long d() {
            return this.a;
        }
        
        public long e() {
            return this.b;
        }
        
        @j0
        public b f(final long n) throws IllegalArgumentException {
            if (n >= 0L) {
                this.a = n;
                return this;
            }
            throw new IllegalArgumentException(String.format("Fetch connection timeout has to be a non-negative number. %d is an invalid argument", n));
        }
        
        @j0
        public b g(final long n) {
            if (n >= 0L) {
                this.b = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Minimum interval between fetches has to be a non-negative number. ");
            sb.append(n);
            sb.append(" is an invalid argument");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
