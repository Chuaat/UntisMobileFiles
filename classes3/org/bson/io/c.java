// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.io;

import org.bson.types.ObjectId;
import java.io.Closeable;

public interface c extends Closeable
{
    ObjectId E();
    
    void F3(final int p0);
    
    String U();
    
    int b0();
    
    boolean c0();
    
    void c3(final byte[] p0, final int p1, final int p2);
    
    void close();
    
    int getPosition();
    
    void i2(final byte[] p0);
    
    long k0();
    
    @Deprecated
    void mark(final int p0);
    
    d o4(final int p0);
    
    byte readByte();
    
    double readDouble();
    
    @Deprecated
    void reset();
    
    String x1();
    
    void x3();
}
