// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.util.Arrays;
import org.bson.q;
import java.io.Serializable;

public class c implements Serializable
{
    private static final long I = 7902997490338209467L;
    private final byte G;
    private final byte[] H;
    
    public c(final byte b, final byte[] array) {
        this.G = b;
        this.H = array.clone();
    }
    
    public c(final q q, final byte[] array) {
        this(q.b(), array);
    }
    
    public c(final byte[] array) {
        this(q.H, array);
    }
    
    public byte[] a() {
        return this.H.clone();
    }
    
    public byte b() {
        return this.G;
    }
    
    public int c() {
        return this.H.length;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final c c = (c)o;
            return this.G == c.G && Arrays.equals(this.H, c.H);
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.G * 31 + Arrays.hashCode(this.H);
    }
}
