// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import androidx.annotation.j0;
import java.util.Map;
import java.util.ConcurrentModificationException;
import androidx.annotation.k0;

public class m<K, V>
{
    private static final boolean J = false;
    private static final String K = "ArrayMap";
    private static final boolean L = true;
    private static final int M = 4;
    private static final int N = 10;
    @k0
    static Object[] O;
    static int P;
    @k0
    static Object[] Q;
    static int R;
    int[] G;
    Object[] H;
    int I;
    
    public m() {
        this.G = g.a;
        this.H = g.c;
        this.I = 0;
    }
    
    public m(final int n) {
        if (n == 0) {
            this.G = g.a;
            this.H = g.c;
        }
        else {
            this.a(n);
        }
        this.I = 0;
    }
    
    public m(final m<K, V> m) {
        this();
        if (m != null) {
            this.j((m<? extends K, ? extends V>)m);
        }
    }
    
    private void a(final int n) {
        Label_0145: {
            if (n == 8) {
                synchronized (m.class) {
                    final Object[] q = m.Q;
                    if (q != null) {
                        this.H = q;
                        m.Q = (Object[])q[0];
                        this.G = (int[])q[1];
                        q[0] = (q[1] = null);
                        --m.R;
                        return;
                    }
                    break Label_0145;
                }
            }
            if (n == 4) {
                synchronized (m.class) {
                    final Object[] o = m.O;
                    if (o != null) {
                        this.H = o;
                        m.O = (Object[])o[0];
                        this.G = (int[])o[1];
                        o[0] = (o[1] = null);
                        --m.P;
                        return;
                    }
                }
            }
        }
        this.G = new int[n];
        this.H = new Object[n << 1];
    }
    
    private static int b(final int[] array, int a, final int n) {
        try {
            a = g.a(array, a, n);
            return a;
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            throw new ConcurrentModificationException();
        }
    }
    
    private static void d(final int[] array, final Object[] array2, int i) {
        if (array.length == 8) {
            synchronized (m.class) {
                if (m.R < 10) {
                    array2[0] = m.Q;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    m.Q = array2;
                    ++m.R;
                }
                return;
            }
        }
        if (array.length == 4) {
            synchronized (m.class) {
                if (m.P < 10) {
                    array2[0] = m.O;
                    array2[1] = array;
                    for (i = (i << 1) - 1; i >= 2; --i) {
                        array2[i] = null;
                    }
                    m.O = array2;
                    ++m.P;
                }
            }
        }
    }
    
    public void c(final int n) {
        final int i = this.I;
        final int[] g = this.G;
        if (g.length < n) {
            final Object[] h = this.H;
            this.a(n);
            if (this.I > 0) {
                System.arraycopy(g, 0, this.G, 0, i);
                System.arraycopy(h, 0, this.H, 0, i << 1);
            }
            d(g, h, i);
        }
        if (this.I == i) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public void clear() {
        final int i = this.I;
        if (i > 0) {
            final int[] g = this.G;
            final Object[] h = this.H;
            this.G = androidx.collection.g.a;
            this.H = androidx.collection.g.c;
            this.I = 0;
            d(g, h, i);
        }
        if (this.I <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }
    
    public boolean containsKey(@k0 final Object o) {
        return this.f(o) >= 0;
    }
    
    public boolean containsValue(final Object o) {
        return this.h(o) >= 0;
    }
    
    int e(final Object o, final int n) {
        final int i = this.I;
        if (i == 0) {
            return -1;
        }
        int b = b(this.G, i, n);
        if (b < 0) {
            return b;
        }
        if (o.equals(this.H[b << 1])) {
            return b;
        }
        int n2;
        for (n2 = b + 1; n2 < i && this.G[n2] == n; ++n2) {
            if (o.equals(this.H[n2 << 1])) {
                return n2;
            }
        }
        --b;
        while (b >= 0 && this.G[b] == n) {
            if (o.equals(this.H[b << 1])) {
                return b;
            }
            --b;
        }
        return ~n2;
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof m) {
            final m m = (m)o;
            if (this.size() != m.size()) {
                return false;
            }
            int i = 0;
            try {
                while (i < this.I) {
                    o = this.i(i);
                    final V o2 = this.o(i);
                    final Object value = m.get(o);
                    if (o2 == null) {
                        if (value != null || !m.containsKey(o)) {
                            return false;
                        }
                    }
                    else if (!o2.equals(value)) {
                        return false;
                    }
                    ++i;
                }
                return true;
            }
            catch (NullPointerException | ClassCastException ex) {
                return false;
            }
        }
        if (!(o instanceof Map)) {
            return false;
        }
        final Map map = (Map)o;
        if (this.size() != map.size()) {
            return false;
        }
        int j = 0;
        try {
            while (j < this.I) {
                o = this.i(j);
                final V o3 = this.o(j);
                final Object value2 = map.get(o);
                if (o3 == null) {
                    if (value2 != null || !map.containsKey(o)) {
                        return false;
                    }
                }
                else if (!o3.equals(value2)) {
                    return false;
                }
                ++j;
            }
            return true;
        }
        catch (NullPointerException | ClassCastException ex2) {
            return false;
        }
    }
    
    public int f(@k0 final Object o) {
        int n;
        if (o == null) {
            n = this.g();
        }
        else {
            n = this.e(o, o.hashCode());
        }
        return n;
    }
    
    int g() {
        final int i = this.I;
        if (i == 0) {
            return -1;
        }
        int b = b(this.G, i, 0);
        if (b < 0) {
            return b;
        }
        if (this.H[b << 1] == null) {
            return b;
        }
        int n;
        for (n = b + 1; n < i && this.G[n] == 0; ++n) {
            if (this.H[n << 1] == null) {
                return n;
            }
        }
        --b;
        while (b >= 0 && this.G[b] == 0) {
            if (this.H[b << 1] == null) {
                return b;
            }
            --b;
        }
        return ~n;
    }
    
    @k0
    public V get(final Object o) {
        return this.getOrDefault(o, null);
    }
    
    public V getOrDefault(final Object o, V v) {
        final int f = this.f(o);
        if (f >= 0) {
            v = (V)this.H[(f << 1) + 1];
        }
        return v;
    }
    
    int h(final Object o) {
        final int n = this.I * 2;
        final Object[] h = this.H;
        if (o == null) {
            for (int i = 1; i < n; i += 2) {
                if (h[i] == null) {
                    return i >> 1;
                }
            }
        }
        else {
            for (int j = 1; j < n; j += 2) {
                if (o.equals(h[j])) {
                    return j >> 1;
                }
            }
        }
        return -1;
    }
    
    @Override
    public int hashCode() {
        final int[] g = this.G;
        final Object[] h = this.H;
        final int i = this.I;
        int n = 1;
        int j = 0;
        int n2 = 0;
        while (j < i) {
            final Object o = h[n];
            final int n3 = g[j];
            int hashCode;
            if (o == null) {
                hashCode = 0;
            }
            else {
                hashCode = o.hashCode();
            }
            n2 += (hashCode ^ n3);
            ++j;
            n += 2;
        }
        return n2;
    }
    
    public K i(final int n) {
        return (K)this.H[n << 1];
    }
    
    public boolean isEmpty() {
        return this.I <= 0;
    }
    
    public void j(@j0 final m<? extends K, ? extends V> m) {
        final int i = m.I;
        this.c(this.I + i);
        final int j = this.I;
        int k = 0;
        if (j == 0) {
            if (i > 0) {
                System.arraycopy(m.G, 0, this.G, 0, i);
                System.arraycopy(m.H, 0, this.H, 0, i << 1);
                this.I = i;
            }
        }
        else {
            while (k < i) {
                this.put(m.i(k), m.o(k));
                ++k;
            }
        }
    }
    
    public V k(int i) {
        final Object[] h = this.H;
        final int n = i << 1;
        final Object o = h[n + 1];
        final int j = this.I;
        final int n2 = 0;
        if (j <= 1) {
            d(this.G, h, j);
            this.G = g.a;
            this.H = g.c;
            i = n2;
        }
        else {
            final int n3 = j - 1;
            final int[] g = this.G;
            final int length = g.length;
            int n4 = 8;
            if (length > 8 && j < g.length / 3) {
                if (j > 8) {
                    n4 = j + (j >> 1);
                }
                this.a(n4);
                if (j != this.I) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(g, 0, this.G, 0, i);
                    System.arraycopy(h, 0, this.H, 0, n);
                }
                if (i < n3) {
                    final int n5 = i + 1;
                    final int[] g2 = this.G;
                    final int n6 = n3 - i;
                    System.arraycopy(g, n5, g2, i, n6);
                    System.arraycopy(h, n5 << 1, this.H, n, n6 << 1);
                }
            }
            else {
                if (i < n3) {
                    final int n7 = i + 1;
                    final int n8 = n3 - i;
                    System.arraycopy(g, n7, g, i, n8);
                    final Object[] h2 = this.H;
                    System.arraycopy(h2, n7 << 1, h2, n, n8 << 1);
                }
                final Object[] h3 = this.H;
                i = n3 << 1;
                h3[i + 1] = (h3[i] = null);
            }
            i = n3;
        }
        if (j == this.I) {
            this.I = i;
            return (V)o;
        }
        throw new ConcurrentModificationException();
    }
    
    public V n(int n, final V v) {
        n = (n << 1) + 1;
        final Object[] h = this.H;
        final Object o = h[n];
        h[n] = v;
        return (V)o;
    }
    
    public V o(final int n) {
        return (V)this.H[(n << 1) + 1];
    }
    
    @k0
    public V put(final K k, final V v) {
        final int i = this.I;
        int n;
        int hashCode;
        if (k == null) {
            n = this.g();
            hashCode = 0;
        }
        else {
            hashCode = k.hashCode();
            n = this.e(k, hashCode);
        }
        if (n >= 0) {
            final int n2 = (n << 1) + 1;
            final Object[] h = this.H;
            final Object o = h[n2];
            h[n2] = v;
            return (V)o;
        }
        final int n3 = ~n;
        final int[] g = this.G;
        if (i >= g.length) {
            int n4 = 4;
            if (i >= 8) {
                n4 = (i >> 1) + i;
            }
            else if (i >= 4) {
                n4 = 8;
            }
            final Object[] h2 = this.H;
            this.a(n4);
            if (i != this.I) {
                throw new ConcurrentModificationException();
            }
            final int[] g2 = this.G;
            if (g2.length > 0) {
                System.arraycopy(g, 0, g2, 0, g.length);
                System.arraycopy(h2, 0, this.H, 0, h2.length);
            }
            d(g, h2, i);
        }
        if (n3 < i) {
            final int[] g3 = this.G;
            final int n5 = n3 + 1;
            System.arraycopy(g3, n3, g3, n5, i - n3);
            final Object[] h3 = this.H;
            System.arraycopy(h3, n3 << 1, h3, n5 << 1, this.I - n3 << 1);
        }
        final int j = this.I;
        if (i == j) {
            final int[] g4 = this.G;
            if (n3 < g4.length) {
                g4[n3] = hashCode;
                final Object[] h4 = this.H;
                final int n6 = n3 << 1;
                h4[n6] = k;
                h4[n6 + 1] = v;
                this.I = j + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }
    
    @k0
    public V putIfAbsent(final K k, final V v) {
        Object o;
        if ((o = this.get(k)) == null) {
            o = this.put(k, v);
        }
        return (V)o;
    }
    
    @k0
    public V remove(final Object o) {
        final int f = this.f(o);
        if (f >= 0) {
            return this.k(f);
        }
        return null;
    }
    
    public boolean remove(Object o, final Object o2) {
        final int f = this.f(o);
        if (f >= 0) {
            o = this.o(f);
            if (o2 == o || (o2 != null && o2.equals(o))) {
                this.k(f);
                return true;
            }
        }
        return false;
    }
    
    @k0
    public V replace(final K k, final V v) {
        final int f = this.f(k);
        if (f >= 0) {
            return this.n(f, v);
        }
        return null;
    }
    
    public boolean replace(final K k, final V v, final V v2) {
        final int f = this.f(k);
        if (f >= 0) {
            final V o = this.o(f);
            if (o == v || (v != null && v.equals(o))) {
                this.n(f, v2);
                return true;
            }
        }
        return false;
    }
    
    public int size() {
        return this.I;
    }
    
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "{}";
        }
        final StringBuilder sb = new StringBuilder(this.I * 28);
        sb.append('{');
        for (int i = 0; i < this.I; ++i) {
            if (i > 0) {
                sb.append(", ");
            }
            final K j = this.i(i);
            if (j != this) {
                sb.append(j);
            }
            else {
                sb.append("(this Map)");
            }
            sb.append('=');
            final V o = this.o(i);
            if (o != this) {
                sb.append(o);
            }
            else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
