// 
// Decompiled by Procyon v0.5.36
// 

package androidx.sqlite.db;

import androidx.annotation.k0;

public final class b implements f
{
    private final String G;
    @k0
    private final Object[] H;
    
    public b(final String s) {
        this(s, null);
    }
    
    public b(final String g, @k0 final Object[] h) {
        this.G = g;
        this.H = h;
    }
    
    private static void d(final e e, final int i, final Object obj) {
        if (obj == null) {
            e.c4(i);
        }
        else if (obj instanceof byte[]) {
            e.H2(i, (byte[])obj);
        }
        else {
            double doubleValue;
            if (obj instanceof Float) {
                doubleValue = (float)obj;
            }
            else {
                if (!(obj instanceof Double)) {
                    long longValue = 0L;
                    Label_0096: {
                        if (obj instanceof Long) {
                            longValue = (long)obj;
                        }
                        else {
                            int n;
                            if (obj instanceof Integer) {
                                n = (int)obj;
                            }
                            else if (obj instanceof Short) {
                                n = (short)obj;
                            }
                            else if (obj instanceof Byte) {
                                n = (byte)obj;
                            }
                            else {
                                if (obj instanceof String) {
                                    e.K0(i, (String)obj);
                                    return;
                                }
                                if (!(obj instanceof Boolean)) {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append("Cannot bind ");
                                    sb.append(obj);
                                    sb.append(" at index ");
                                    sb.append(i);
                                    sb.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
                                    throw new IllegalArgumentException(sb.toString());
                                }
                                if (obj) {
                                    longValue = 1L;
                                    break Label_0096;
                                }
                                longValue = 0L;
                                break Label_0096;
                            }
                            longValue = n;
                        }
                    }
                    e.l2(i, longValue);
                    return;
                }
                doubleValue = (double)obj;
            }
            e.r1(i, doubleValue);
        }
    }
    
    public static void e(final e e, final Object[] array) {
        if (array == null) {
            return;
        }
        final int length = array.length;
        int i = 0;
        while (i < length) {
            final Object o = array[i];
            ++i;
            d(e, i, o);
        }
    }
    
    @Override
    public int a() {
        final Object[] h = this.H;
        int length;
        if (h == null) {
            length = 0;
        }
        else {
            length = h.length;
        }
        return length;
    }
    
    @Override
    public String b() {
        return this.G;
    }
    
    @Override
    public void c(final e e) {
        e(e, this.H);
    }
}
