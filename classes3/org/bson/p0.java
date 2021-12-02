// 
// Decompiled by Procyon v0.5.36
// 

package org.bson;

import org.bson.types.Decimal128;
import org.bson.types.ObjectId;
import java.io.Closeable;

public interface p0 extends Closeable
{
    String C0(final String p0);
    
    void C1();
    
    r0 C4();
    
    String D2(final String p0);
    
    ObjectId E();
    
    String E4(final String p0);
    
    String F2();
    
    String F4();
    
    String H3();
    
    void H4();
    
    void I2(final String p0);
    
    int I5();
    
    void J2();
    
    String J5();
    
    void K3();
    
    v0 K5(final String p0);
    
    void M2(final String p0);
    
    long N4(final String p0);
    
    @Deprecated
    void O();
    
    w O0();
    
    w0 O5();
    
    void P2();
    
    v0 R0();
    
    q0 S4();
    
    void T0(final String p0);
    
    void T1(final String p0);
    
    String U();
    
    long U1();
    
    ObjectId W1(final String p0);
    
    void W3();
    
    void X0();
    
    double X1(final String p0);
    
    String Y0(final String p0);
    
    byte a4();
    
    int b0();
    
    void b4();
    
    void close();
    
    void h2();
    
    long k0();
    
    long k4(final String p0);
    
    String m1();
    
    o n3(final String p0);
    
    int n5(final String p0);
    
    o o0();
    
    w0 o5();
    
    Decimal128 q0();
    
    boolean readBoolean();
    
    double readDouble();
    
    @Deprecated
    void reset();
    
    void skipValue();
    
    w t4(final String p0);
    
    Decimal128 u3(final String p0);
    
    boolean w4(final String p0);
    
    r0 x5(final String p0);
    
    void y3(final String p0);
}
