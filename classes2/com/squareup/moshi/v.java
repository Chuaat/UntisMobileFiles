// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Iterator;
import java.util.AbstractSet;
import java.util.Objects;
import java.util.Set;
import java.util.Arrays;
import java.io.ObjectStreamException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Comparator;
import java.io.Serializable;
import java.util.AbstractMap;

final class v<K, V> extends AbstractMap<K, V> implements Serializable
{
    private static final Comparator<Comparable> O;
    Comparator<? super K> G;
    g<K, V>[] H;
    final g<K, V> I;
    int J;
    int K;
    int L;
    private d M;
    private e N;
    
    static {
        O = new Comparator<Comparable>() {
            public int a(final Comparable comparable, final Comparable comparable2) {
                return comparable.compareTo(comparable2);
            }
        };
    }
    
    v() {
        this(null);
    }
    
    v(Comparator<? super K> o) {
        this.J = 0;
        this.K = 0;
        if (o == null) {
            o = v.O;
        }
        this.G = (Comparator<? super K>)o;
        this.I = new g<K, V>();
        final g[] h = new g[16];
        this.H = (g<K, V>[])h;
        this.L = h.length / 2 + h.length / 4;
    }
    
    private void a() {
        final g<K, V>[] b = b(this.H);
        this.H = b;
        this.L = b.length / 2 + b.length / 4;
    }
    
    static <K, V> g<K, V>[] b(final g<K, V>[] array) {
        final int length = array.length;
        final g[] array2 = new g[length * 2];
        final c<K, V> c = new c<K, V>();
        final b<K, V> b = new b<K, V>();
        final b<K, V> b2 = new b<K, V>();
        for (int i = 0; i < length; ++i) {
            final g<K, V> g = array[i];
            if (g != null) {
                c.b(g);
                int n = 0;
                int n2 = 0;
                while (true) {
                    final g<K, V> a = c.a();
                    if (a == null) {
                        break;
                    }
                    if ((a.M & length) == 0x0) {
                        ++n;
                    }
                    else {
                        ++n2;
                    }
                }
                b.b(n);
                b2.b(n2);
                c.b(g);
                while (true) {
                    final g<K, V> a2 = c.a();
                    if (a2 == null) {
                        break;
                    }
                    if ((a2.M & length) == 0x0) {
                        b.a(a2);
                    }
                    else {
                        b2.a(a2);
                    }
                }
                final g<K, V> g2 = null;
                Entry<K, V> c2;
                if (n > 0) {
                    c2 = (Entry<K, V>)b.c();
                }
                else {
                    c2 = null;
                }
                array2[i] = (g)c2;
                Entry<K, V> c3 = (Entry<K, V>)g2;
                if (n2 > 0) {
                    c3 = (Entry<K, V>)b2.c();
                }
                array2[i + length] = (g)c3;
            }
        }
        return (g<K, V>[])array2;
    }
    
    private boolean c(final Object o, final Object obj) {
        return o == obj || (o != null && o.equals(obj));
    }
    
    private void g(g<K, V> g, final boolean b) {
        while (g != null) {
            final g<K, V> h = g.H;
            final g<K, V> i = g.I;
            final int n = 0;
            final int n2 = 0;
            int o;
            if (h != null) {
                o = h.O;
            }
            else {
                o = 0;
            }
            int o2;
            if (i != null) {
                o2 = i.O;
            }
            else {
                o2 = 0;
            }
            final int n3 = o - o2;
            if (n3 == -2) {
                final g<K, V> h2 = i.H;
                final g<K, V> j = i.I;
                int o3;
                if (j != null) {
                    o3 = j.O;
                }
                else {
                    o3 = 0;
                }
                int o4 = n2;
                if (h2 != null) {
                    o4 = h2.O;
                }
                final int n4 = o4 - o3;
                if (n4 != -1) {
                    if (n4 != 0 || b) {
                        this.n(i);
                    }
                }
                this.k(g);
                if (b) {
                    break;
                }
            }
            else if (n3 == 2) {
                final g<K, V> h3 = h.H;
                final g<K, V> k = h.I;
                int o5;
                if (k != null) {
                    o5 = k.O;
                }
                else {
                    o5 = 0;
                }
                int o6 = n;
                if (h3 != null) {
                    o6 = h3.O;
                }
                final int n5 = o6 - o5;
                if (n5 != 1) {
                    if (n5 != 0 || b) {
                        this.k(h);
                    }
                }
                this.n(g);
                if (b) {
                    break;
                }
            }
            else if (n3 == 0) {
                g.O = o + 1;
                if (b) {
                    break;
                }
            }
            else {
                g.O = Math.max(o, o2) + 1;
                if (!b) {
                    break;
                }
            }
            g = g.G;
        }
    }
    
    private void j(final g<K, V> g, final g<K, V> g2) {
        final g<K, V> g3 = g.G;
        g.G = null;
        if (g2 != null) {
            g2.G = g3;
        }
        if (g3 != null) {
            if (g3.H == g) {
                g3.H = g2;
            }
            else {
                g3.I = g2;
            }
        }
        else {
            final int m = g.M;
            final g<K, V>[] h = this.H;
            h[m & h.length - 1] = g2;
        }
    }
    
    private void k(final g<K, V> g) {
        final g<K, V> h = g.H;
        final g<K, V> i = g.I;
        final g<K, V> h2 = i.H;
        final g<K, V> j = i.I;
        g.I = h2;
        if (h2 != null) {
            h2.G = g;
        }
        this.j(g, i);
        i.H = g;
        g.G = i;
        final int n = 0;
        int o;
        if (h != null) {
            o = h.O;
        }
        else {
            o = 0;
        }
        int o2;
        if (h2 != null) {
            o2 = h2.O;
        }
        else {
            o2 = 0;
        }
        final int n2 = Math.max(o, o2) + 1;
        g.O = n2;
        int o3 = n;
        if (j != null) {
            o3 = j.O;
        }
        i.O = Math.max(n2, o3) + 1;
    }
    
    private void n(final g<K, V> g) {
        final g<K, V> h = g.H;
        final g<K, V> i = g.I;
        final g<K, V> h2 = h.H;
        final g<K, V> j = h.I;
        g.H = j;
        if (j != null) {
            j.G = g;
        }
        this.j(g, h);
        h.I = g;
        g.G = h;
        final int n = 0;
        int o;
        if (i != null) {
            o = i.O;
        }
        else {
            o = 0;
        }
        int o2;
        if (j != null) {
            o2 = j.O;
        }
        else {
            o2 = 0;
        }
        final int n2 = Math.max(o, o2) + 1;
        g.O = n2;
        int o3 = n;
        if (h2 != null) {
            o3 = h2.O;
        }
        h.O = Math.max(n2, o3) + 1;
    }
    
    private static int o(int n) {
        n ^= (n >>> 20 ^ n >>> 12);
        return n >>> 4 ^ (n >>> 7 ^ n);
    }
    
    private Object p() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }
    
    @Override
    public void clear() {
        Arrays.fill(this.H, null);
        this.J = 0;
        ++this.K;
        final g<K, V> i = this.I;
        g<K, V> k;
        for (g<K, V> j = i.J; j != i; j = k) {
            k = j.J;
            j.K = null;
            j.J = null;
        }
        i.K = i;
        i.J = i;
    }
    
    @Override
    public boolean containsKey(final Object o) {
        return this.f(o) != null;
    }
    
    g<K, V> d(final K k, final boolean b) {
        final Comparator<? super K> g = this.G;
        final g<K, V>[] h = this.H;
        final int o = o(k.hashCode());
        final int n = h.length - 1 & o;
        g<K, V> g2 = h[n];
        int n2;
        if (g2 != null) {
            Comparable<Comparable> comparable;
            if (g == v.O) {
                comparable = (Comparable<Comparable>)k;
            }
            else {
                comparable = null;
            }
            while (true) {
                final K l = g2.L;
                if (comparable != null) {
                    n2 = comparable.compareTo((Comparable)l);
                }
                else {
                    n2 = g.compare(k, l);
                }
                if (n2 == 0) {
                    return g2;
                }
                g<K, V> g3;
                if (n2 < 0) {
                    g3 = g2.H;
                }
                else {
                    g3 = g2.I;
                }
                if (g3 == null) {
                    break;
                }
                g2 = g3;
            }
        }
        else {
            n2 = 0;
        }
        if (!b) {
            return null;
        }
        final g<K, V> i = this.I;
        g g4;
        if (g2 == null) {
            if (g == v.O && !(k instanceof Comparable)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(k.getClass().getName());
                sb.append(" is not Comparable");
                throw new ClassCastException(sb.toString());
            }
            g4 = new g<K, V>((g<Object, Object>)g2, k, o, (g<Object, Object>)i, (g<Object, Object>)i.K);
            h[n] = (g<K, V>)g4;
        }
        else {
            g4 = new g<K, V>(g2, k, o, i, i.K);
            if (n2 < 0) {
                g2.H = (g<K, V>)g4;
            }
            else {
                g2.I = (g<K, V>)g4;
            }
            this.g(g2, true);
        }
        if (this.J++ > this.L) {
            this.a();
        }
        ++this.K;
        return (g<K, V>)g4;
    }
    
    g<K, V> e(final Entry<?, ?> entry) {
        final g<K, V> f = this.f(entry.getKey());
        g<K, V> g;
        if (f != null && this.c(f.N, entry.getValue())) {
            g = f;
        }
        else {
            g = null;
        }
        return g;
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        d m = this.M;
        if (m == null) {
            m = new d();
            this.M = m;
        }
        return m;
    }
    
    g<K, V> f(final Object o) {
        Object d;
        final Object o2 = d = null;
        if (o == null) {
            return (g<K, V>)d;
        }
        try {
            d = this.d(o, false);
            return (g<K, V>)d;
        }
        catch (ClassCastException ex) {
            d = o2;
            return (g<K, V>)d;
        }
    }
    
    @Override
    public V get(Object n) {
        final g<K, V> f = this.f(n);
        if (f != null) {
            n = f.N;
        }
        else {
            n = null;
        }
        return (V)n;
    }
    
    void h(final g<K, V> g, final boolean b) {
        if (b) {
            final g<K, V> k = g.K;
            k.J = g.J;
            g.J.K = k;
            g.K = null;
            g.J = null;
        }
        final g<K, V> h = g.H;
        final g<K, V> i = g.I;
        final g<K, V> g2 = g.G;
        int o = 0;
        if (h != null && i != null) {
            g<K, V> g3;
            if (h.O > i.O) {
                g3 = h.b();
            }
            else {
                g3 = i.a();
            }
            this.h(g3, false);
            final g<K, V> h2 = g.H;
            int o2;
            if (h2 != null) {
                o2 = h2.O;
                g3.H = h2;
                h2.G = g3;
                g.H = null;
            }
            else {
                o2 = 0;
            }
            final g<K, V> j = g.I;
            if (j != null) {
                o = j.O;
                g3.I = j;
                j.G = g3;
                g.I = null;
            }
            g3.O = Math.max(o2, o) + 1;
            this.j(g, g3);
            return;
        }
        if (h != null) {
            this.j(g, h);
            g.H = null;
        }
        else if (i != null) {
            this.j(g, i);
            g.I = null;
        }
        else {
            this.j(g, null);
        }
        this.g(g2, false);
        --this.J;
        ++this.K;
    }
    
    g<K, V> i(final Object o) {
        final g<K, V> f = this.f(o);
        if (f != null) {
            this.h(f, true);
        }
        return f;
    }
    
    @Override
    public Set<K> keySet() {
        e n = this.N;
        if (n == null) {
            n = new e();
            this.N = n;
        }
        return n;
    }
    
    @Override
    public V put(final K obj, final V n) {
        Objects.requireNonNull(obj, "key == null");
        final g<K, V> d = this.d(obj, true);
        final V n2 = d.N;
        d.N = n;
        return n2;
    }
    
    @Override
    public V remove(Object n) {
        final g<K, V> i = this.i(n);
        if (i != null) {
            n = i.N;
        }
        else {
            n = null;
        }
        return (V)n;
    }
    
    @Override
    public int size() {
        return this.J;
    }
    
    static final class b<K, V>
    {
        private g<K, V> a;
        private int b;
        private int c;
        private int d;
        
        void a(final g<K, V> a) {
            a.I = null;
            a.G = null;
            a.H = null;
            a.O = 1;
            final int b = this.b;
            if (b > 0) {
                final int d = this.d;
                if ((d & 0x1) == 0x0) {
                    this.d = d + 1;
                    this.b = b - 1;
                    ++this.c;
                }
            }
            a.G = this.a;
            this.a = a;
            final int d2 = this.d + 1;
            this.d = d2;
            final int b2 = this.b;
            if (b2 > 0 && (d2 & 0x1) == 0x0) {
                this.d = d2 + 1;
                this.b = b2 - 1;
                ++this.c;
            }
            int n = 4;
            while (true) {
                final int d3 = this.d;
                final int n2 = n - 1;
                if ((d3 & n2) != n2) {
                    break;
                }
                final int c = this.c;
                Label_0293: {
                    if (c == 0) {
                        final g<K, V> a2 = this.a;
                        final g<K, V> g = a2.G;
                        final g<K, V> g2 = (g<K, V>)g.G;
                        g.G = (g<K, V>)g2.G;
                        this.a = g;
                        g.H = (g<K, V>)g2;
                        g.I = a2;
                        g.O = a2.O + 1;
                        g2.G = (g<K, V>)g;
                        a2.G = g;
                    }
                    else {
                        if (c == 1) {
                            final g<K, V> a3 = this.a;
                            final g<K, V> g3 = a3.G;
                            this.a = g3;
                            g3.I = a3;
                            g3.O = a3.O + 1;
                            a3.G = g3;
                        }
                        else if (c != 2) {
                            break Label_0293;
                        }
                        this.c = 0;
                    }
                }
                n *= 2;
            }
        }
        
        void b(final int i) {
            this.b = Integer.highestOneBit(i) * 2 - 1 - i;
            this.d = 0;
            this.c = 0;
            this.a = null;
        }
        
        g<K, V> c() {
            final g<K, V> a = this.a;
            if (a.G == null) {
                return a;
            }
            throw new IllegalStateException();
        }
    }
    
    static class c<K, V>
    {
        private g<K, V> a;
        
        public g<K, V> a() {
            final g<K, V> a = this.a;
            if (a == null) {
                return null;
            }
            Entry<K, V> g = (Entry<K, V>)a.G;
            a.G = null;
            g<K, V> g2 = a.I;
            Entry<K, V> entry;
            while (true) {
                entry = g;
                g = (Entry<K, V>)g2;
                if (g == null) {
                    break;
                }
                ((g)g).G = (g<K, V>)entry;
                g2 = (g<K, V>)((g)g).H;
            }
            this.a = (g<K, V>)entry;
            return a;
        }
        
        void b(g<K, V> g) {
            g<K, V> g2 = null;
            while (g != null) {
                g.G = g2;
                final g<K, V> h = g.H;
                g2 = g;
                g = h;
            }
            this.a = g2;
        }
    }
    
    final class d extends AbstractSet<Entry<K, V>>
    {
        @Override
        public void clear() {
            v.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return o instanceof Entry && v.this.e((Entry<?, ?>)o) != null;
        }
        
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new f<Entry<K, V>>() {
                public Entry<K, V> b() {
                    return ((f)this).a();
                }
            };
        }
        
        @Override
        public boolean remove(final Object o) {
            if (!(o instanceof Entry)) {
                return false;
            }
            final g<K, V> e = v.this.e((Entry<?, ?>)o);
            if (e == null) {
                return false;
            }
            v.this.h(e, true);
            return true;
        }
        
        @Override
        public int size() {
            return v.this.J;
        }
    }
    
    final class e extends AbstractSet<K>
    {
        @Override
        public void clear() {
            v.this.clear();
        }
        
        @Override
        public boolean contains(final Object o) {
            return v.this.containsKey(o);
        }
        
        @Override
        public Iterator<K> iterator() {
            return new f<K>() {
                @Override
                public K next() {
                    return ((f)this).a().L;
                }
            };
        }
        
        @Override
        public boolean remove(final Object o) {
            return v.this.i(o) != null;
        }
        
        @Override
        public int size() {
            return v.this.J;
        }
    }
    
    abstract class f<T> implements Iterator<T>
    {
        g<K, V> G;
        g<K, V> H;
        int I;
        
        f() {
            this.G = v.this.I.J;
            this.H = null;
            this.I = v.this.K;
        }
        
        final g<K, V> a() {
            final g<K, V> g = this.G;
            final v j = v.this;
            if (g == j.I) {
                throw new NoSuchElementException();
            }
            if (j.K == this.I) {
                this.G = g.J;
                return this.H = g;
            }
            throw new ConcurrentModificationException();
        }
        
        @Override
        public final boolean hasNext() {
            return this.G != v.this.I;
        }
        
        @Override
        public final void remove() {
            final g<K, V> h = this.H;
            if (h != null) {
                v.this.h(h, true);
                this.H = null;
                this.I = v.this.K;
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    static final class g<K, V> implements Entry<K, V>
    {
        g<K, V> G;
        g<K, V> H;
        g<K, V> I;
        g<K, V> J;
        g<K, V> K;
        final K L;
        final int M;
        V N;
        int O;
        
        g() {
            this.L = null;
            this.M = -1;
            this.K = this;
            this.J = this;
        }
        
        g(final g<K, V> g, final K l, final int m, final g<K, V> j, final g<K, V> k) {
            this.G = g;
            this.L = l;
            this.M = m;
            this.O = 1;
            this.J = j;
            this.K = k;
            k.J = this;
            j.K = this;
        }
        
        public g<K, V> a() {
            g<K, V> h = this.H;
            g g = this;
            while (h != null) {
                final g<K, V> h2 = h.H;
                g = h;
                h = h2;
            }
            return (g<K, V>)g;
        }
        
        public g<K, V> b() {
            g<K, V> i = this.I;
            g g = this;
            while (i != null) {
                final g<K, V> j = i.I;
                g = i;
                i = j;
            }
            return (g<K, V>)g;
        }
        
        @Override
        public boolean equals(Object value) {
            final boolean b = value instanceof Entry;
            boolean b3;
            final boolean b2 = b3 = false;
            if (b) {
                final Entry entry = (Entry)value;
                final K l = this.L;
                if (l == null) {
                    b3 = b2;
                    if (entry.getKey() != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!l.equals(entry.getKey())) {
                        return b3;
                    }
                }
                final V n = this.N;
                value = entry.getValue();
                if (n == null) {
                    b3 = b2;
                    if (value != null) {
                        return b3;
                    }
                }
                else {
                    b3 = b2;
                    if (!n.equals(value)) {
                        return b3;
                    }
                }
                b3 = true;
            }
            return b3;
        }
        
        @Override
        public K getKey() {
            return this.L;
        }
        
        @Override
        public V getValue() {
            return this.N;
        }
        
        @Override
        public int hashCode() {
            final K l = this.L;
            int hashCode = 0;
            int hashCode2;
            if (l == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = l.hashCode();
            }
            final V n = this.N;
            if (n != null) {
                hashCode = n.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public V setValue(final V n) {
            final V n2 = this.N;
            this.N = n;
            return n2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.L);
            sb.append("=");
            sb.append(this.N);
            return sb.toString();
        }
    }
}
