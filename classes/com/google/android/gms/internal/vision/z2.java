// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.util.Map;
import java.util.Arrays;

final class z2<K, V> extends m2<K, V>
{
    static final m2<Object, Object> N;
    private final transient Object K;
    private final transient Object[] L;
    private final transient int M;
    
    static {
        N = new z2<Object, Object>(null, new Object[0], 0);
    }
    
    private z2(final Object k, final Object[] l, final int m) {
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    static <K, V> z2<K, V> d(final int n, final Object[] array) {
        if (n == 0) {
            return (z2<K, V>)(z2)z2.N;
        }
        Object o = null;
        final int n2 = 0;
        final int n3 = 0;
        int n4 = 0;
        if (n == 1) {
            w1.a(array[0], array[1]);
            return new z2<K, V>(null, array, 1);
        }
        k1.g(n, array.length >> 1);
        final int n5 = q2.n(n);
        if (n == 1) {
            w1.a(array[0], array[1]);
        }
        else {
            final int n6 = n5 - 1;
            if (n5 <= 128) {
                final byte[] a = new byte[n5];
                Arrays.fill(a, (byte)(-1));
                while (true) {
                    o = a;
                    if (n4 >= n) {
                        break;
                    }
                    final int n7 = n4 * 2;
                    final Object obj = array[n7];
                    final Object o2 = array[n7 ^ 0x1];
                    w1.a(obj, o2);
                    int a2 = j2.a(obj.hashCode());
                    while (true) {
                        a2 &= n6;
                        final int n8 = a[a2] & 0xFF;
                        if (n8 == 255) {
                            a[a2] = (byte)n7;
                            ++n4;
                            break;
                        }
                        if (array[n8].equals(obj)) {
                            throw e(obj, o2, array, n8);
                        }
                        ++a2;
                    }
                }
            }
            else {
                if (n5 <= 32768) {
                    final short[] a3 = new short[n5];
                    Arrays.fill(a3, (short)(-1));
                    int n9 = n2;
                    Object obj2 = null;
                    Object o3 = null;
                    int n12 = 0;
                Label_0335:
                    while (true) {
                        o = a3;
                        if (n9 >= n) {
                            return new z2<K, V>(o, array, n);
                        }
                        final int n10 = n9 * 2;
                        obj2 = array[n10];
                        o3 = array[n10 ^ 0x1];
                        w1.a(obj2, o3);
                        int a4 = j2.a(obj2.hashCode());
                        while (true) {
                            final int n11 = a4 & n6;
                            n12 = (a3[n11] & 0xFFFF);
                            if (n12 == 65535) {
                                a3[n11] = (short)n10;
                                ++n9;
                                break;
                            }
                            if (array[n12].equals(obj2)) {
                                break Label_0335;
                            }
                            a4 = n11 + 1;
                        }
                    }
                    throw e(obj2, o3, array, n12);
                }
                final int[] a5 = new int[n5];
                Arrays.fill(a5, -1);
                int n13 = n3;
                Object obj3 = null;
                Object o4 = null;
                int n15 = 0;
            Label_0448:
                while (true) {
                    o = a5;
                    if (n13 >= n) {
                        return new z2<K, V>(o, array, n);
                    }
                    final int n14 = n13 * 2;
                    obj3 = array[n14];
                    o4 = array[n14 ^ 0x1];
                    w1.a(obj3, o4);
                    int a6 = j2.a(obj3.hashCode());
                    while (true) {
                        a6 &= n6;
                        n15 = a5[a6];
                        if (n15 == -1) {
                            a5[a6] = n14;
                            ++n13;
                            break;
                        }
                        if (array[n15].equals(obj3)) {
                            break Label_0448;
                        }
                        ++a6;
                    }
                }
                throw e(obj3, o4, array, n15);
            }
        }
        return new z2<K, V>(o, array, n);
    }
    
    private static IllegalArgumentException e(final Object obj, final Object obj2, final Object[] array, final int n) {
        final String value = String.valueOf(obj);
        final String value2 = String.valueOf(obj2);
        final String value3 = String.valueOf(array[n]);
        final String value4 = String.valueOf(array[n ^ 0x1]);
        final StringBuilder sb = new StringBuilder(value.length() + 39 + value2.length() + value3.length() + value4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        sb.append(" and ");
        sb.append(value3);
        sb.append("=");
        sb.append(value4);
        return new IllegalArgumentException(sb.toString());
    }
    
    @Override
    final q2<Entry<K, V>> a() {
        return (q2<Entry<K, V>>)new y2((m2<Object, Object>)this, this.L, 0, this.M);
    }
    
    @Override
    final q2<K> b() {
        return new a3<K>(this, (l2<K>)new d3(this.L, 0, this.M));
    }
    
    @Override
    final i2<V> c() {
        return (i2<V>)new d3(this.L, 1, this.M);
    }
    
    @NullableDecl
    @Override
    public final V get(@NullableDecl final Object o) {
        final Object k = this.K;
        final Object[] l = this.L;
        final int m = this.M;
        if (o == null) {
            return null;
        }
        if (m == 1) {
            if (l[0].equals(o)) {
                return (V)l[1];
            }
            return null;
        }
        else {
            if (k == null) {
                return null;
            }
            if (k instanceof byte[]) {
                final byte[] array = (byte[])k;
                final int length = array.length;
                int a = j2.a(o.hashCode());
                while (true) {
                    a &= length - 1;
                    final int n = array[a] & 0xFF;
                    if (n == 255) {
                        return null;
                    }
                    if (l[n].equals(o)) {
                        return (V)l[n ^ 0x1];
                    }
                    ++a;
                }
            }
            else if (k instanceof short[]) {
                final short[] array2 = (short[])k;
                final int length2 = array2.length;
                int a2 = j2.a(o.hashCode());
                while (true) {
                    final int n2 = a2 & length2 - 1;
                    final int n3 = array2[n2] & 0xFFFF;
                    if (n3 == 65535) {
                        return null;
                    }
                    if (l[n3].equals(o)) {
                        return (V)l[n3 ^ 0x1];
                    }
                    a2 = n2 + 1;
                }
            }
            else {
                final int[] array3 = (int[])k;
                final int length3 = array3.length;
                int a3 = j2.a(o.hashCode());
                while (true) {
                    final int n4 = a3 & length3 - 1;
                    final int n5 = array3[n4];
                    if (n5 == -1) {
                        return null;
                    }
                    if (l[n5].equals(o)) {
                        return (V)l[n5 ^ 0x1];
                    }
                    a3 = n4 + 1;
                }
            }
        }
    }
    
    @Override
    public final int size() {
        return this.M;
    }
}
