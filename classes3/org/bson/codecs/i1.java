// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.codecs;

import org.bson.w0;
import org.bson.g0;
import org.bson.types.Decimal128;
import java.math.BigDecimal;
import org.bson.p0;

final class i1
{
    private i1() {
    }
    
    static double a(p0 q0) {
        final w0 o5 = q0.O5();
        final int n = i1$a.a[o5.ordinal()];
        double val;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n == 4) {
                        q0 = (p0)q0.q0();
                        try {
                            val = ((Decimal128)q0).doubleValue();
                            if (((Decimal128)q0).equals(new Decimal128(new BigDecimal(val)))) {
                                return val;
                            }
                            throw d(Double.class, (Number)q0);
                        }
                        catch (NumberFormatException ex) {
                            throw d(Double.class, (Number)q0);
                        }
                    }
                    throw new g0(String.format("Invalid numeric type, found: %s", o5));
                }
                val = q0.readDouble();
            }
            else {
                final long k0 = q0.k0();
                val = (double)k0;
                if (k0 != (long)val) {
                    throw d(Double.class, k0);
                }
            }
        }
        else {
            val = q0.b0();
        }
        return val;
    }
    
    static int b(final p0 p) {
        final w0 o5 = p.O5();
        final int n = i1$a.a[o5.ordinal()];
        int n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new g0(String.format("Invalid numeric type, found: %s", o5));
                    }
                    final Decimal128 q0 = p.q0();
                    n2 = q0.intValue();
                    if (!q0.equals(new Decimal128(n2))) {
                        throw d(Integer.class, q0);
                    }
                }
                else {
                    final double double1 = p.readDouble();
                    n2 = (int)double1;
                    if (double1 != n2) {
                        throw d(Integer.class, double1);
                    }
                }
            }
            else {
                final long k0 = p.k0();
                n2 = (int)k0;
                if (k0 != n2) {
                    throw d(Integer.class, k0);
                }
            }
        }
        else {
            n2 = p.b0();
        }
        return n2;
    }
    
    static long c(final p0 p) {
        final w0 o5 = p.O5();
        final int n = i1$a.a[o5.ordinal()];
        long n2;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        throw new g0(String.format("Invalid numeric type, found: %s", o5));
                    }
                    final Decimal128 q0 = p.q0();
                    n2 = q0.longValue();
                    if (!q0.equals(new Decimal128(n2))) {
                        throw d(Long.class, q0);
                    }
                }
                else {
                    final double double1 = p.readDouble();
                    n2 = (long)double1;
                    if (double1 != n2) {
                        throw d(Long.class, double1);
                    }
                }
            }
            else {
                n2 = p.k0();
            }
        }
        else {
            n2 = p.b0();
        }
        return n2;
    }
    
    private static <T extends Number> g0 d(final Class<T> clazz, final Number n) {
        return new g0(String.format("Could not convert `%s` to a %s without losing precision", n, clazz));
    }
}
