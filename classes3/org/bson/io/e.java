// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import org.bson.types.ObjectId;
import java.io.Closeable;

public interface e extends Closeable
{
    void A(final int p0);
    
    void B(final ObjectId p0);
    
    void C2(final byte[] p0);
    
    void I(final long p0);
    
    void L2(final String p0);
    
    void P(final double p0);
    
    void V3(final int p0, final int p1);
    
    void close();
    
    int getPosition();
    
    void i(final String p0);
    
    void l(final int p0);
    
    int l0();
    
    void n1(final byte[] p0, final int p1, final int p2);
    
    void u1(final int p0);
}
