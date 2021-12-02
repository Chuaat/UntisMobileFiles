// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import java.nio.ByteOrder;
import java.nio.ByteBuffer;

public interface b1
{
    b1 A0();
    
    boolean c0();
    
    b1 clear();
    
    int d0();
    
    double e0();
    
    long f0();
    
    int g0();
    
    byte get();
    
    byte get(final int p0);
    
    double getDouble(final int p0);
    
    int getInt(final int p0);
    
    long getLong(final int p0);
    
    b1 h0();
    
    int i0();
    
    int j0();
    
    byte[] k0();
    
    b1 l0(final int p0, final byte[] p1);
    
    ByteBuffer m0();
    
    b1 n0();
    
    b1 o0(final int p0, final byte[] p1, final int p2, final int p3);
    
    b1 p0(final byte[] p0, final int p1, final int p2);
    
    b1 q0(final int p0);
    
    b1 r0(final int p0, final byte p1);
    
    void release();
    
    b1 s0();
    
    b1 t0(final byte[] p0);
    
    b1 u0(final ByteOrder p0);
    
    b1 v0(final byte[] p0, final int p1, final int p2);
    
    b1 w0(final byte p0);
    
    int x0();
    
    int y0();
    
    b1 z0(final int p0);
}
