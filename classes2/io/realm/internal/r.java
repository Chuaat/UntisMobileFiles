// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import c6.h;
import org.bson.types.Decimal128;
import java.util.Date;
import io.realm.RealmFieldType;
import org.bson.types.ObjectId;

public interface r
{
    long B(final String p0);
    
    void E(final long p0, final ObjectId p1);
    
    boolean G(final long p0);
    
    void I(final long p0);
    
    byte[] K(final long p0);
    
    void M();
    
    double O(final long p0);
    
    long P(final long p0);
    
    float Q(final long p0);
    
    boolean T();
    
    String U(final long p0);
    
    OsList V(final long p0, final RealmFieldType p1);
    
    void a0(final long p0, final Date p1);
    
    Decimal128 b(final long p0);
    
    RealmFieldType b0(final long p0);
    
    void c0(final long p0, final double p1);
    
    void d(final long p0, @h final String p1);
    
    boolean e1();
    
    void f(final long p0, final float p1);
    
    Table g();
    
    long getColumnCount();
    
    String[] getColumnNames();
    
    long h(final long p0, final RealmFieldType p1);
    
    void i(final long p0, final boolean p1);
    
    r i0(final OsSharedRealm p0);
    
    boolean j(final String p0);
    
    ObjectId k(final long p0);
    
    void k0(final long p0, @h final byte[] p1);
    
    boolean l(final long p0);
    
    long l0();
    
    long m(final long p0);
    
    void o(final long p0, final long p1);
    
    OsList p(final long p0);
    
    void s(final long p0, final long p1);
    
    Date u(final long p0);
    
    void v(final long p0, final Decimal128 p1);
    
    boolean y(final long p0);
    
    void z(final long p0);
}
