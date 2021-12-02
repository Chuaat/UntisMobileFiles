// 
// Decompiled by Procyon v0.5.36
// 

package androidx.arch.core.internal;

import androidx.annotation.j0;
import java.util.Iterator;
import java.util.WeakHashMap;
import androidx.annotation.t0;
import java.util.Map;

@t0({ t0.a.I })
public class b<K, V> implements Iterable<Map.Entry<K, V>>
{
    c<K, V> G;
    private c<K, V> H;
    private WeakHashMap<f<K, V>, Boolean> I;
    private int J;
    
    public b() {
        this.I = new WeakHashMap<f<K, V>, Boolean>();
        this.J = 0;
    }
    
    public Map.Entry<K, V> b() {
        return this.G;
    }
    
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        final b key = new b<K, V>(this.H, this.G);
        this.I.put((f<K, V>)key, Boolean.FALSE);
        return (Iterator<Map.Entry<K, V>>)key;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b2 = (b)o;
        if (this.size() != b2.size()) {
            return false;
        }
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        final Iterator iterator2 = b2.iterator();
        while (iterator.hasNext() && iterator2.hasNext()) {
            final Map.Entry entry = (Map.Entry)iterator.next();
            final Object next = iterator2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        if (iterator.hasNext() || iterator2.hasNext()) {
            b = false;
        }
        return b;
    }
    
    protected c<K, V> f(final K obj) {
        c<K, V> c;
        for (c = this.G; c != null && !c.G.equals(obj); c = c.I) {}
        return c;
    }
    
    public d h() {
        final d key = new d();
        this.I.put((f<K, V>)key, Boolean.FALSE);
        return key;
    }
    
    @Override
    public int hashCode() {
        final Iterator<Map.Entry<K, V>> iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            n += ((Map.Entry)iterator.next()).hashCode();
        }
        return n;
    }
    
    public Map.Entry<K, V> i() {
        return this.H;
    }
    
    @j0
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        final a key = new a<K, V>(this.G, this.H);
        this.I.put((f<K, V>)key, Boolean.FALSE);
        return (Iterator<Map.Entry<K, V>>)key;
    }
    
    protected c<K, V> k(@j0 final K k, @j0 final V v) {
        final c<K, V> h = new c<K, V>(k, v);
        ++this.J;
        final c<K, V> h2 = this.H;
        if (h2 == null) {
            this.G = h;
        }
        else {
            h2.I = h;
            h.J = h2;
        }
        return this.H = h;
    }
    
    public V l(@j0 final K k, @j0 final V v) {
        final c<K, V> f = this.f(k);
        if (f != null) {
            return f.H;
        }
        this.k(k, v);
        return null;
    }
    
    public V m(@j0 final K k) {
        final c<K, V> f = this.f(k);
        if (f == null) {
            return null;
        }
        --this.J;
        if (!this.I.isEmpty()) {
            final Iterator<f<K, V>> iterator = this.I.keySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().a(f);
            }
        }
        final c<K, V> j = (c<K, V>)f.J;
        final c<K, V> i = f.I;
        if (j != null) {
            j.I = (c<K, V>)i;
        }
        else {
            this.G = i;
        }
        final c<K, V> l = f.I;
        if (l != null) {
            l.J = (c<K, V>)j;
        }
        else {
            this.H = (c<K, V>)j;
        }
        f.I = null;
        f.J = null;
        return f.H;
    }
    
    public int size() {
        return this.J;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        final Iterator<Map.Entry<?, ?>> iterator = (Iterator<Map.Entry<?, ?>>)this.iterator();
        while (iterator.hasNext()) {
            sb.append(((Map.Entry<?, ?>)iterator.next()).toString());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
    
    static class a<K, V> extends e<K, V>
    {
        a(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        c<K, V> b(final c<K, V> c) {
            return c.J;
        }
        
        @Override
        c<K, V> c(final c<K, V> c) {
            return c.I;
        }
    }
    
    private static class b<K, V> extends e<K, V>
    {
        b(final c<K, V> c, final c<K, V> c2) {
            super(c, c2);
        }
        
        @Override
        c<K, V> b(final c<K, V> c) {
            return c.I;
        }
        
        @Override
        c<K, V> c(final c<K, V> c) {
            return c.J;
        }
    }
    
    static class c<K, V> implements Entry<K, V>
    {
        @j0
        final K G;
        @j0
        final V H;
        c<K, V> I;
        c<K, V> J;
        
        c(@j0 final K g, @j0 final V h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final c c = (c)o;
            if (!this.G.equals(c.G) || !this.H.equals(c.H)) {
                b = false;
            }
            return b;
        }
        
        @j0
        @Override
        public K getKey() {
            return this.G;
        }
        
        @j0
        @Override
        public V getValue() {
            return this.H;
        }
        
        @Override
        public int hashCode() {
            return this.G.hashCode() ^ this.H.hashCode();
        }
        
        @Override
        public V setValue(final V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.G);
            sb.append("=");
            sb.append(this.H);
            return sb.toString();
        }
    }
    
    private class d implements Iterator<Map.Entry<K, V>>, f<K, V>
    {
        private c<K, V> G;
        private boolean H;
        
        d() {
            this.H = true;
        }
        
        @Override
        public void a(@j0 final c<K, V> c) {
            final c<K, V> g = this.G;
            if (c == g) {
                final c<K, V> j = g.J;
                this.G = j;
                this.H = (j == null);
            }
        }
        
        public Map.Entry<K, V> b() {
            Map.Entry<K, V> g;
            if (this.H) {
                this.H = false;
                g = (Map.Entry<K, V>)b.this.G;
            }
            else {
                final c<K, V> g2 = this.G;
                if (g2 != null) {
                    g = (Map.Entry<K, V>)g2.I;
                }
                else {
                    g = null;
                }
            }
            return this.G = (c<K, V>)g;
        }
        
        @Override
        public boolean hasNext() {
            final boolean h = this.H;
            final boolean b = true;
            boolean b2 = true;
            if (h) {
                if (androidx.arch.core.internal.b.this.G == null) {
                    b2 = false;
                }
                return b2;
            }
            final c<K, V> g = this.G;
            return g != null && g.I != null && b;
        }
    }
    
    private abstract static class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V>
    {
        c<K, V> G;
        c<K, V> H;
        
        e(final c<K, V> h, final c<K, V> g) {
            this.G = g;
            this.H = h;
        }
        
        private c<K, V> e() {
            final c<K, V> h = this.H;
            final c<K, V> g = this.G;
            if (h != g && g != null) {
                return this.c(h);
            }
            return null;
        }
        
        @Override
        public void a(@j0 final c<K, V> c) {
            if (this.G == c && c == this.H) {
                this.H = null;
                this.G = null;
            }
            final c<K, V> g = this.G;
            if (g == c) {
                this.G = this.b(g);
            }
            if (this.H == c) {
                this.H = this.e();
            }
        }
        
        abstract c<K, V> b(final c<K, V> p0);
        
        abstract c<K, V> c(final c<K, V> p0);
        
        public Map.Entry<K, V> d() {
            final c<K, V> h = this.H;
            this.H = this.e();
            return h;
        }
        
        @Override
        public boolean hasNext() {
            return this.H != null;
        }
    }
    
    interface f<K, V>
    {
        void a(@j0 final c<K, V> p0);
    }
}
