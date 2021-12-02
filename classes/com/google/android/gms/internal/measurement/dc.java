// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

final class dc extends ec
{
    dc(final Unsafe unsafe) {
        super(unsafe);
    }
    
    @Override
    public final double a(final Object o, final long n) {
        return Double.longBitsToDouble(this.k(o, n));
    }
    
    @Override
    public final float b(final Object o, final long n) {
        return Float.intBitsToFloat(this.j(o, n));
    }
    
    @Override
    public final void c(final Object o, final long n, final boolean b) {
        if (fc.i) {
            fc.n(o, n, b);
            return;
        }
        fc.o(o, n, b);
    }
    
    @Override
    public final void d(final Object o, final long n, final byte b) {
        if (fc.i) {
            fc.p(o, n, b);
            return;
        }
        fc.q(o, n, b);
    }
    
    @Override
    public final void e(final Object o, final long n, final double value) {
        this.o(o, n, Double.doubleToLongBits(value));
    }
    
    @Override
    public final void f(final Object o, final long n, final float value) {
        this.n(o, n, Float.floatToIntBits(value));
    }
    
    @Override
    public final boolean g(final Object o, final long n) {
        if (fc.i) {
            return fc.y(o, n);
        }
        return fc.z(o, n);
    }
}
