// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import java.util.Objects;
import java.util.Arrays;
import androidx.annotation.t0;
import androidx.annotation.k0;
import com.google.android.datatransport.e;

final class c extends o
{
    private final String a;
    private final byte[] b;
    private final e c;
    
    private c(final String a, @k0 final byte[] b, final e c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String b() {
        return this.a;
    }
    
    @k0
    @Override
    public byte[] c() {
        return this.b;
    }
    
    @t0({ t0.a.H })
    @Override
    public e d() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof o) {
            final o o2 = (o)o;
            if (this.a.equals(o2.b())) {
                final byte[] b2 = this.b;
                byte[] a2;
                if (o2 instanceof c) {
                    a2 = ((c)o2).b;
                }
                else {
                    a2 = o2.c();
                }
                if (Arrays.equals(b2, a2) && this.c.equals(o2.d())) {
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
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b)) * 1000003 ^ this.c.hashCode();
    }
    
    static final class b extends a
    {
        private String a;
        private byte[] b;
        private e c;
        
        @Override
        public o a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" backendName");
                string = sb.toString();
            }
            String string2 = string;
            if (this.c == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" priority");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new c(this.a, this.b, this.c, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final String s) {
            Objects.requireNonNull(s, "Null backendName");
            this.a = s;
            return this;
        }
        
        @Override
        public a c(@k0 final byte[] b) {
            this.b = b;
            return this;
        }
        
        @Override
        public a d(final e e) {
            Objects.requireNonNull(e, "Null priority");
            this.c = e;
            return this;
        }
    }
}
