// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

abstract class ec
{
    final Unsafe a;
    
    ec(final Unsafe a) {
        this.a = a;
    }
    
    public abstract double a(final Object p0, final long p1);
    
    public abstract float b(final Object p0, final long p1);
    
    public abstract void c(final Object p0, final long p1, final boolean p2);
    
    public abstract void d(final Object p0, final long p1, final byte p2);
    
    public abstract void e(final Object p0, final long p1, final double p2);
    
    public abstract void f(final Object p0, final long p1, final float p2);
    
    public abstract boolean g(final Object p0, final long p1);
    
    public final int h(final Class<?> arrayClass) {
        return this.a.arrayBaseOffset(arrayClass);
    }
    
    public final int i(final Class<?> arrayClass) {
        return this.a.arrayIndexScale(arrayClass);
    }
    
    public final int j(final Object o, final long offset) {
        return this.a.getInt(o, offset);
    }
    
    public final long k(final Object o, final long offset) {
        return this.a.getLong(o, offset);
    }
    
    public final long l(final Field f) {
        return this.a.objectFieldOffset(f);
    }
    
    public final Object m(final Object o, final long offset) {
        return this.a.getObject(o, offset);
    }
    
    public final void n(final Object o, final long offset, final int x) {
        this.a.putInt(o, offset, x);
    }
    
    public final void o(final Object o, final long offset, final long x) {
        this.a.putLong(o, offset, x);
    }
    
    public final void p(final Object o, final long offset, final Object x) {
        this.a.putObject(o, offset, x);
    }
}
