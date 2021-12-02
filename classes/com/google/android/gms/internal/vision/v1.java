// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import java.io.Serializable;
import java.util.AbstractMap;

final class v1<K, V> extends AbstractMap<K, V> implements Serializable
{
    private static final Object P;
    @NullableDecl
    private transient Object G;
    @NullableDecl
    transient int[] H;
    @NullableDecl
    transient Object[] I;
    @NullableDecl
    transient Object[] J;
    private transient int K;
    private transient int L;
    @NullableDecl
    private transient Set<K> M;
    @NullableDecl
    private transient Set<Entry<K, V>> N;
    @NullableDecl
    private transient Collection<V> O;
    
    static {
        P = new Object();
    }
    
    v1() {
        k1.f(true, "Expected size must be >= 0");
        this.K = k3.a(3, 1, 1073741823);
    }
    
    private final int b(final int n, int i, int j, int b) {
        final Object d = h2.d(i);
        final int n2 = i - 1;
        if (b != 0) {
            h2.e(d, j & n2, b + 1);
        }
        final Object g = this.G;
        final int[] h = this.H;
        int n3;
        int n4;
        int n5;
        int n6;
        for (i = 0; i <= n; ++i) {
            for (j = h2.b(g, i); j != 0; j = (n4 & n)) {
                n3 = j - 1;
                n4 = h[n3];
                n5 = ((~n & n4) | i);
                n6 = (n5 & n2);
                b = h2.b(d, n6);
                h2.e(d, n6, j);
                h[n3] = h2.a(n5, b, n2);
            }
        }
        this.G = d;
        this.o(n2);
        return n2;
    }
    
    private final int d(@NullableDecl final Object o) {
        if (this.g()) {
            return -1;
        }
        final int b = j2.b(o);
        final int x = this.x();
        int b2 = h2.b(this.G, b & x);
        if (b2 == 0) {
            return -1;
        }
        final int n = ~x;
        int n2;
        do {
            --b2;
            n2 = this.H[b2];
            if ((n2 & n) == (b & n) && e1.a(o, this.I[b2])) {
                return b2;
            }
        } while ((b2 = (n2 & x)) != 0);
        return -1;
    }
    
    static int h(final int n, final int n2) {
        return n - 1;
    }
    
    @NullableDecl
    private final Object k(@NullableDecl Object o) {
        if (this.g()) {
            return v1.P;
        }
        final int x = this.x();
        final int c = h2.c(o, null, x, this.G, this.H, this.I, null);
        if (c == -1) {
            return v1.P;
        }
        o = this.J[c];
        this.f(c, x);
        --this.L;
        this.q();
        return o;
    }
    
    private final void o(int numberOfLeadingZeros) {
        numberOfLeadingZeros = Integer.numberOfLeadingZeros(numberOfLeadingZeros);
        this.K = h2.a(this.K, 32 - numberOfLeadingZeros, 31);
    }
    
    private final int x() {
        return (1 << (this.K & 0x1F)) - 1;
    }
    
    final int a(int n) {
        if (++n < this.L) {
            return n;
        }
        return -1;
    }
    
    @Override
    public final void clear() {
        if (this.g()) {
            return;
        }
        this.q();
        final Map<K, V> n = this.n();
        if (n != null) {
            this.K = k3.a(this.size(), 3, 1073741823);
            n.clear();
            this.G = null;
        }
        else {
            Arrays.fill(this.I, 0, this.L, null);
            Arrays.fill(this.J, 0, this.L, null);
            final Object g = this.G;
            if (g instanceof byte[]) {
                Arrays.fill((byte[])g, (byte)0);
            }
            else if (g instanceof short[]) {
                Arrays.fill((short[])g, (short)0);
            }
            else {
                Arrays.fill((int[])g, 0);
            }
            Arrays.fill(this.H, 0, this.L, 0);
        }
        this.L = 0;
    }
    
    @Override
    public final boolean containsKey(@NullableDecl final Object o) {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.containsKey(o);
        }
        return this.d(o) != -1;
    }
    
    @Override
    public final boolean containsValue(@NullableDecl final Object o) {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.containsValue(o);
        }
        for (int i = 0; i < this.L; ++i) {
            if (e1.a(o, this.J[i])) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final Set<Entry<K, V>> entrySet() {
        Object n;
        if ((n = this.N) == null) {
            n = new z1(this);
            this.N = (Set<Entry<K, V>>)n;
        }
        return (Set<Entry<K, V>>)n;
    }
    
    final void f(final int n, final int n2) {
        final int n3 = this.size() - 1;
        if (n >= n3) {
            this.I[n] = null;
            this.J[n] = null;
            this.H[n] = 0;
            return;
        }
        final Object[] i = this.I;
        final Object o = i[n3];
        i[n] = o;
        final Object[] j = this.J;
        j[n] = j[n3];
        j[n3] = (i[n3] = null);
        final int[] h = this.H;
        h[n] = h[n3];
        h[n3] = 0;
        final int n4 = j2.b(o) & n2;
        final int b = h2.b(this.G, n4);
        final int n5 = n3 + 1;
        int n6;
        if ((n6 = b) == n5) {
            h2.e(this.G, n4, n + 1);
            return;
        }
        int n7;
        int[] h2;
        int n8;
        do {
            n7 = n6 - 1;
            h2 = this.H;
            n8 = h2[n7];
            n6 = (n8 & n2);
        } while (n6 != n5);
        h2[n7] = com.google.android.gms.internal.vision.h2.a(n8, n + 1, n2);
    }
    
    final boolean g() {
        return this.G == null;
    }
    
    @Override
    public final V get(@NullableDecl final Object o) {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.get(o);
        }
        final int d = this.d(o);
        if (d == -1) {
            return null;
        }
        return (V)this.J[d];
    }
    
    @Override
    public final boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public final Set<K> keySet() {
        Object m;
        if ((m = this.M) == null) {
            m = new b2(this);
            this.M = (Set<K>)m;
        }
        return (Set<K>)m;
    }
    
    @NullableDecl
    final Map<K, V> n() {
        final Object g = this.G;
        if (g instanceof Map) {
            return (Map<K, V>)g;
        }
        return null;
    }
    
    @NullableDecl
    @Override
    public final V put(@NullableDecl final K k, @NullableDecl final V v) {
        if (this.g()) {
            k1.h(this.g(), "Arrays already allocated");
            final int i = this.K;
            final int max = Math.max(i + 1, 2);
            int highestOneBit;
            final int n = highestOneBit = Integer.highestOneBit(max);
            if (max > (int)(n * 1.0) && (highestOneBit = n << 1) <= 0) {
                highestOneBit = 1073741824;
            }
            final int max2 = Math.max(4, highestOneBit);
            this.G = h2.d(max2);
            this.o(max2 - 1);
            this.H = new int[i];
            this.I = new Object[i];
            this.J = new Object[i];
        }
        final Map<K, V> n2 = this.n();
        if (n2 != null) {
            return n2.put(k, v);
        }
        final int[] h = this.H;
        final Object[] j = this.I;
        final Object[] l = this.J;
        final int m = this.L;
        final int l2 = m + 1;
        final int b = j2.b(k);
        final int x = this.x();
        final int n3 = b & x;
        int b2 = h2.b(this.G, n3);
        int b3 = 0;
        Label_0448: {
            if (b2 == 0) {
                if (l2 <= x) {
                    h2.e(this.G, n3, l2);
                    b3 = x;
                    break Label_0448;
                }
            }
            else {
                final int n4 = ~x;
                int n5 = 0;
                while (true) {
                    final int n6 = b2 - 1;
                    final int n7 = h[n6];
                    if ((n7 & n4) == (b & n4) && e1.a(k, j[n6])) {
                        final Object o = l[n6];
                        l[n6] = v;
                        return (V)o;
                    }
                    b2 = (n7 & x);
                    ++n5;
                    if (b2 != 0) {
                        continue;
                    }
                    if (n5 >= 9) {
                        final LinkedHashMap<K, V> g = new LinkedHashMap<K, V>(this.x() + 1, 1.0f);
                        for (int n8 = this.r(); n8 >= 0; n8 = this.a(n8)) {
                            g.put((K)this.I[n8], (V)this.J[n8]);
                        }
                        this.G = g;
                        this.H = null;
                        this.I = null;
                        this.J = null;
                        this.q();
                        return g.put(k, v);
                    }
                    if (l2 > x) {
                        break;
                    }
                    h[n6] = h2.a(n7, l2, x);
                    b3 = x;
                    break Label_0448;
                }
            }
            b3 = this.b(x, h2.f(x), b, m);
        }
        final int length = this.H.length;
        if (l2 > length) {
            final int min = Math.min(1073741823, 0x1 | Math.max(1, length >>> 1) + length);
            if (min != length) {
                this.H = Arrays.copyOf(this.H, min);
                this.I = Arrays.copyOf(this.I, min);
                this.J = Arrays.copyOf(this.J, min);
            }
        }
        this.H[m] = h2.a(b, 0, b3);
        this.I[m] = k;
        this.J[m] = v;
        this.L = l2;
        this.q();
        return null;
    }
    
    final void q() {
        this.K += 32;
    }
    
    final int r() {
        if (this.isEmpty()) {
            return -1;
        }
        return 0;
    }
    
    @NullableDecl
    @Override
    public final V remove(@NullableDecl Object k) {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.remove(k);
        }
        if ((k = this.k(k)) == v1.P) {
            k = null;
        }
        return (V)k;
    }
    
    @Override
    public final int size() {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.size();
        }
        return this.L;
    }
    
    final Iterator<K> t() {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.keySet().iterator();
        }
        return (Iterator<K>)new y1(this);
    }
    
    final Iterator<Entry<K, V>> u() {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.entrySet().iterator();
        }
        return (Iterator<Entry<K, V>>)new x1(this);
    }
    
    final Iterator<V> v() {
        final Map<K, V> n = this.n();
        if (n != null) {
            return n.values().iterator();
        }
        return (Iterator<V>)new a2(this);
    }
    
    @Override
    public final Collection<V> values() {
        Object o;
        if ((o = this.O) == null) {
            o = new d2(this);
            this.O = (Collection<V>)o;
        }
        return (Collection<V>)o;
    }
}
