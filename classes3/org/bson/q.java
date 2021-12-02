// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

public enum q
{
    H((byte)0), 
    I((byte)1), 
    J((byte)2), 
    K((byte)3), 
    L((byte)4), 
    M((byte)5), 
    N((byte)(-128));
    
    private final byte G;
    
    private q(final byte b) {
        this.G = b;
    }
    
    public static boolean d(final byte b) {
        return b == q.K.b() || b == q.L.b();
    }
    
    public byte b() {
        return this.G;
    }
}
