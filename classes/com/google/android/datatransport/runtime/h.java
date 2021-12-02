// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.runtime;

import java.util.Arrays;
import java.util.Objects;
import androidx.annotation.j0;
import com.google.android.datatransport.c;

public final class h
{
    private final c a;
    private final byte[] b;
    
    public h(@j0 final c c, @j0 final byte[] array) {
        Objects.requireNonNull(c, "encoding is null");
        Objects.requireNonNull(array, "bytes is null");
        this.a = c;
        this.b = array;
    }
    
    public byte[] a() {
        return this.b;
    }
    
    public c b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.a.equals(h.a) && Arrays.equals(this.b, h.b);
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EncodedPayload{encoding=");
        sb.append(this.a);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
