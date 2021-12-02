// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

class v<K extends Comparable<K>, V> extends AbstractMap<K, V>
{
    private final int G;
    private List<c> H;
    private Map<K, V> I;
    private boolean J;
    private volatile e K;
    
    private v(final int g) {
        this.G = g;
        this.H = Collections.emptyList();
        this.I = Collections.emptyMap();
    }
    
    private int e(final K k) {
        int n = this.H.size() - 1;
        if (n >= 0) {
            final int compareTo = k.compareTo(this.H.get(n).f());
            if (compareTo > 0) {
                return -(n + 2);
            }
            if (compareTo == 0) {
                return n;
            }
        }
        int i = 0;
        while (i <= n) {
            final int n2 = (i + n) / 2;
            final int compareTo2 = k.compareTo(this.H.get(n2).f());
            if (compareTo2 < 0) {
                n = n2 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n2;
                }
                i = n2 + 1;
            }
        }
        return -(i + 1);
    }
    
    private void f() {
        if (!this.J) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    private void g() {
        this.f();
        if (this.H.isEmpty() && !(this.H instanceof ArrayList)) {
            this.H = new ArrayList<c>(this.G);
        }
    }
    
    private SortedMap<K, V> k() {
        this.f();
        if (this.I.isEmpty() && !(this.I instanceof TreeMap)) {
            this.I = new TreeMap<K, V>();
        }
        return (SortedMap<K, V>)(SortedMap)this.I;
    }
    
    static <FieldDescriptorType extends h.b<FieldDescriptorType>> v<FieldDescriptorType, Object> p(final int n) {
        return new v<FieldDescriptorType, Object>(n) {
            @Override
            public void o() {
                if (!this.n()) {
                    for (int i = 0; i < this.i(); ++i) {
                        final Entry<FieldDescriptorType, Object> h = this.h(i);
                        if (((h.b)h.getKey()).D0()) {
                            h.setValue(Collections.unmodifiableList((List<?>)h.getValue()));
                        }
                    }
                    for (final Map.Entry<h.b, V> entry : this.j()) {
                        if (entry.getKey().D0()) {
                            entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                        }
                    }
                }
                super.o();
            }
        };
    }
    
    private V r(final int n) {
        this.f();
        final V value = this.H.remove(n).getValue();
        if (!this.I.isEmpty()) {
            final Iterator<Map.Entry<K, V>> iterator = this.k().entrySet().iterator();
            this.H.add(new c((Map.Entry<K, V>)iterator.next()));
            iterator.remove();
        }
        return value;
    }
    
    @Override
    public void clear() {
        this.f();
        if (!this.H.isEmpty()) {
            this.H.clear();
        }
        if (!this.I.isEmpty()) {
            this.I.clear();
        }
    }
    
    @Override
    public boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.e((K)comparable) >= 0 || this.I.containsKey(comparable);
    }
    
    @Override
    public Set<Entry<K, V>> entrySet() {
        if (this.K == null) {
            this.K = new e();
        }
        return this.K;
    }
    
    @Override
    public V get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int e = this.e((K)comparable);
        if (e >= 0) {
            return this.H.get(e).getValue();
        }
        return this.I.get(comparable);
    }
    
    public Entry<K, V> h(final int n) {
        return this.H.get(n);
    }
    
    public int i() {
        return this.H.size();
    }
    
    public Iterable<Entry<K, V>> j() {
        Iterable<Entry<K, V>> iterable;
        if (this.I.isEmpty()) {
            iterable = b.b();
        }
        else {
            iterable = this.I.entrySet();
        }
        return iterable;
    }
    
    public boolean n() {
        return this.J;
    }
    
    public void o() {
        if (!this.J) {
            Map<K, V> i;
            if (this.I.isEmpty()) {
                i = Collections.emptyMap();
            }
            else {
                i = Collections.unmodifiableMap((Map<? extends K, ? extends V>)this.I);
            }
            this.I = i;
            this.J = true;
        }
    }
    
    public V q(final K k, final V value) {
        this.f();
        final int e = this.e(k);
        if (e >= 0) {
            return this.H.get(e).setValue(value);
        }
        this.g();
        final int n = -(e + 1);
        if (n >= this.G) {
            return this.k().put(k, value);
        }
        final int size = this.H.size();
        final int g = this.G;
        if (size == g) {
            final c c = this.H.remove(g - 1);
            this.k().put(c.f(), c.getValue());
        }
        this.H.add(n, new c(k, value));
        return null;
    }
    
    @Override
    public V remove(final Object o) {
        this.f();
        final Comparable comparable = (Comparable)o;
        final int e = this.e((K)comparable);
        if (e >= 0) {
            return this.r(e);
        }
        if (this.I.isEmpty()) {
            return null;
        }
        return this.I.remove(comparable);
    }
    
    @Override
    public int size() {
        return this.H.size() + this.I.size();
    }
    
    private static class b
    {
        private static final Iterator<Object> a;
        private static final Iterable<Object> b;
        
        static {
            a = new Iterator<Object>() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                
                @Override
                public Object next() {
                    throw new NoSuchElementException();
                }
                
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            b = new Iterable<Object>() {
                @Override
                public Iterator<Object> iterator() {
                    return v.b.a;
                }
            };
        }
        
        static <T> Iterable<T> b() {
            return (Iterable<T>)v.b.b;
        }
    }
    
    private class c implements Comparable<c>, Entry<K, V>
    {
        private final K G;
        private V H;
        
        c(final K g, final V h) {
            this.G = g;
            this.H = h;
        }
        
        c(final v v, final Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }
        
        private boolean d(final Object o, final Object obj) {
            boolean equals;
            if (o == null) {
                equals = (obj == null);
            }
            else {
                equals = o.equals(obj);
            }
            return equals;
        }
        
        public int b(final c c) {
            return this.f().compareTo(c.f());
        }
        
        @Override
        public boolean equals(final Object o) {
            boolean b = true;
            if (o == this) {
                return true;
            }
            if (!(o instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)o;
            if (!this.d(this.G, entry.getKey()) || !this.d(this.H, entry.getValue())) {
                b = false;
            }
            return b;
        }
        
        public K f() {
            return this.G;
        }
        
        @Override
        public V getValue() {
            return this.H;
        }
        
        @Override
        public int hashCode() {
            final Comparable<K> g = this.G;
            int hashCode = 0;
            int hashCode2;
            if (g == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = g.hashCode();
            }
            final V h = this.H;
            if (h != null) {
                hashCode = h.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public V setValue(final V h) {
            v.this.f();
            final V h2 = this.H;
            this.H = h;
            return h2;
        }
        
        @Override
        public String toString() {
            final String value = String.valueOf(this.G);
            final String value2 = String.valueOf(this.H);
            final StringBuilder sb = new StringBuilder(value.length() + 1 + value2.length());
            sb.append(value);
            sb.append("=");
            sb.append(value2);
            return sb.toString();
        }
    }
    
    private class d implements Iterator<Entry<K, V>>
    {
        private int G;
        private boolean H;
        private Iterator<Entry<K, V>> I;
        
        private d() {
            this.G = -1;
        }
        
        private Iterator<Entry<K, V>> a() {
            if (this.I == null) {
                this.I = v.this.I.entrySet().iterator();
            }
            return this.I;
        }
        
        public Entry<K, V> b() {
            this.H = true;
            final int g = this.G + 1;
            this.G = g;
            Entry<K, V> entry;
            if (g < v.this.H.size()) {
                entry = v.this.H.get(this.G);
            }
            else {
                entry = this.a().next();
            }
            return entry;
        }
        
        @Override
        public boolean hasNext() {
            final int g = this.G;
            boolean b = true;
            if (g + 1 >= v.this.H.size()) {
                b = (this.a().hasNext() && b);
            }
            return b;
        }
        
        @Override
        public void remove() {
            if (this.H) {
                this.H = false;
                v.this.f();
                if (this.G < v.this.H.size()) {
                    v.this.r(this.G--);
                }
                else {
                    this.a().remove();
                }
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }
    
    private class e extends AbstractSet<Entry<K, V>>
    {
        public boolean b(final Entry<K, V> entry) {
            if (!this.contains(entry)) {
                v.this.q(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }
        
        @Override
        public void clear() {
            v.this.clear();
        }
        
        @Override
        public boolean contains(Object value) {
            final Entry entry = (Entry)value;
            value = v.this.get(entry.getKey());
            final Object value2 = entry.getValue();
            return value == value2 || (value != null && value.equals(value2));
        }
        
        @Override
        public Iterator<Entry<K, V>> iterator() {
            return new d();
        }
        
        @Override
        public boolean remove(final Object o) {
            final Entry entry = (Entry)o;
            if (this.contains(entry)) {
                v.this.remove(entry.getKey());
                return true;
            }
            return false;
        }
        
        @Override
        public int size() {
            return v.this.size();
        }
    }
}
