// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime.backends;

import java.util.Objects;
import java.util.Arrays;
import androidx.annotation.k0;
import com.google.android.datatransport.runtime.i;

final class a extends g
{
    private final Iterable<i> a;
    private final byte[] b;
    
    private a(final Iterable<i> a, @k0 final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public Iterable<i> c() {
        return this.a;
    }
    
    @k0
    @Override
    public byte[] d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof g) {
            final g g = (g)o;
            if (this.a.equals(g.c())) {
                final byte[] b2 = this.b;
                byte[] a2;
                if (g instanceof a) {
                    a2 = ((a)g).b;
                }
                else {
                    a2 = g.d();
                }
                if (Arrays.equals(b2, a2)) {
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
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BackendRequest{events=");
        sb.append(this.a);
        sb.append(", extras=");
        sb.append(Arrays.toString(this.b));
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends g.a
    {
        private Iterable<i> a;
        private byte[] b;
        
        @Override
        public g a() {
            final Iterable<i> a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" events");
                string = sb.toString();
            }
            if (string.isEmpty()) {
                return new a(this.a, this.b, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Missing required properties:");
            sb2.append(string);
            throw new IllegalStateException(sb2.toString());
        }
        
        @Override
        public g.a b(final Iterable<i> iterable) {
            Objects.requireNonNull(iterable, "Null events");
            this.a = iterable;
            return this;
        }
        
        @Override
        public g.a c(@k0 final byte[] b) {
            this.b = b;
            return this;
        }
    }
}
