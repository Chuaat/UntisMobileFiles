// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.util.Objects;
import java.util.Arrays;
import androidx.annotation.j0;

final class f extends e.b
{
    private final String a;
    private final byte[] b;
    
    private f(final String a, final byte[] b) {
        this.a = a;
        this.b = b;
    }
    
    @j0
    @Override
    public byte[] b() {
        return this.b;
    }
    
    @j0
    @Override
    public String c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof e.b) {
            final e.b b2 = (e.b)o;
            if (this.a.equals(b2.c())) {
                final byte[] b3 = this.b;
                byte[] a2;
                if (b2 instanceof f) {
                    a2 = ((f)b2).b;
                }
                else {
                    a2 = b2.b();
                }
                if (Arrays.equals(b3, a2)) {
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
        sb.append("File{filename=");
        sb.append(this.a);
        sb.append(", contents=");
        sb.append(Arrays.toString(this.b));
        sb.append("}");
        return sb.toString();
    }
    
    static final class b extends a
    {
        private String a;
        private byte[] b;
        
        @Override
        public e.b a() {
            final String a = this.a;
            String string = "";
            if (a == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(" filename");
                string = sb.toString();
            }
            String string2 = string;
            if (this.b == null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(" contents");
                string2 = sb2.toString();
            }
            if (string2.isEmpty()) {
                return new f(this.a, this.b, null);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Missing required properties:");
            sb3.append(string2);
            throw new IllegalStateException(sb3.toString());
        }
        
        @Override
        public a b(final byte[] array) {
            Objects.requireNonNull(array, "Null contents");
            this.b = array;
            return this;
        }
        
        @Override
        public a c(final String s) {
            Objects.requireNonNull(s, "Null filename");
            this.a = s;
            return this;
        }
    }
}
