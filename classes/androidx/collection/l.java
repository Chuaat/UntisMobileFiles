// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import java.util.NoSuchElementException;
import java.lang.reflect.Array;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import androidx.annotation.k0;

abstract class l<K, V>
{
    @k0
    b a;
    @k0
    c b;
    @k0
    e c;
    
    public static <K, V> boolean j(final Map<K, V> map, final Collection<?> collection) {
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!map.containsKey(iterator.next())) {
                return false;
            }
        }
        return true;
    }
    
    public static <T> boolean k(final Set<T> set, final Object o) {
        boolean b = true;
        if (set == o) {
            return true;
        }
        if (!(o instanceof Set)) {
            return false;
        }
        final Set set2 = (Set)o;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                b = false;
            }
            return b;
        }
        catch (NullPointerException | ClassCastException ex) {
            return false;
        }
    }
    
    public static <K, V> boolean o(final Map<K, V> map, final Collection<?> collection) {
        final int size = map.size();
        final Iterator<?> iterator = collection.iterator();
        while (iterator.hasNext()) {
            map.remove(iterator.next());
        }
        return size != map.size();
    }
    
    public static <K, V> boolean p(final Map<K, V> map, final Collection<?> collection) {
        final int size = map.size();
        final Iterator<K> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            if (!collection.contains(iterator.next())) {
                iterator.remove();
            }
        }
        return size != map.size();
    }
    
    protected abstract void a();
    
    protected abstract Object b(final int p0, final int p1);
    
    protected abstract Map<K, V> c();
    
    protected abstract int d();
    
    protected abstract int e(final Object p0);
    
    protected abstract int f(final Object p0);
    
    protected abstract void g(final K p0, final V p1);
    
    protected abstract void h(final int p0);
    
    protected abstract V i(final int p0, final V p1);
    
    public Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }
    
    public Set<K> m() {
        if (this.b == null) {
            this.b = new c();
        }
        return this.b;
    }
    
    public Collection<V> n() {
        if (this.c == null) {
            this.c = new e();
        }
        return this.c;
    }
    
    public Object[] q(final int n) {
        final int d = this.d();
        final Object[] array = new Object[d];
        for (int i = 0; i < d; ++i) {
            array[i] = this.b(i, n);
        }
        return array;
    }
    
    public <T> T[] r(final T[] array, final int n) {
        final int d = this.d();
        Object[] array2 = array;
        if (array.length < d) {
            array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), d);
        }
        for (int i = 0; i < d; ++i) {
            array2[i] = this.b(i, n);
        }
        if (array2.length > d) {
            array2[d] = null;
        }
        return (T[])array2;
    }
    
    final class a<T> implements Iterator<T>
    {
        final int G;
        int H;
        int I;
        boolean J;
        
        a(final int g) {
            this.J = false;
            this.G = g;
            this.H = l.this.d();
        }
        
        @Override
        public boolean hasNext() {
            return this.I < this.H;
        }
        
        @Override
        public T next() {
            if (this.hasNext()) {
                final Object b = l.this.b(this.I, this.G);
                ++this.I;
                this.J = true;
                return (T)b;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            if (this.J) {
                final int i = this.I - 1;
                this.I = i;
                --this.H;
                this.J = false;
                l.this.h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }
    
    final class b implements Set<Map.Entry<K, V>>
    {
        @Override
        public boolean addAll(final Collection<? extends Map.Entry<K, V>> collection) {
            final int d = l.this.d();
            for (final Map.Entry<K, V> entry : collection) {
                l.this.g(entry.getKey(), entry.getValue());
            }
            return d != l.this.d();
        }
        
        public boolean b(final Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void clear() {
            l.this.a();
        }
        
        @Override
        public boolean contains(final Object o) {
            if (!(o instanceof Map.Entry)) {
                return false;
            }
            final Map.Entry entry = (Map.Entry)o;
            final int e = l.this.e(entry.getKey());
            return e >= 0 && g.c(l.this.b(e, 1), entry.getValue());
        }
        
        @Override
        public boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public boolean equals(final Object o) {
            return l.k((Set<Object>)this, o);
        }
        
        @Override
        public int hashCode() {
            int i = l.this.d() - 1;
            int n = 0;
            while (i >= 0) {
                final Object b = l.this.b(i, 0);
                final Object b2 = l.this.b(i, 1);
                int hashCode;
                if (b == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = b.hashCode();
                }
                int hashCode2;
                if (b2 == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = b2.hashCode();
                }
                n += (hashCode ^ hashCode2);
                --i;
            }
            return n;
        }
        
        @Override
        public boolean isEmpty() {
            return l.this.d() == 0;
        }
        
        @Override
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }
        
        @Override
        public boolean remove(final Object o) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public int size() {
            return l.this.d();
        }
        
        @Override
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public <T> T[] toArray(final T[] array) {
            throw new UnsupportedOperationException();
        }
    }
    
    final class c implements Set<K>
    {
        @Override
        public boolean add(final K k) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean addAll(final Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void clear() {
            l.this.a();
        }
        
        @Override
        public boolean contains(final Object o) {
            return l.this.e(o) >= 0;
        }
        
        @Override
        public boolean containsAll(final Collection<?> collection) {
            return l.j(l.this.c(), collection);
        }
        
        @Override
        public boolean equals(final Object o) {
            return l.k((Set<Object>)this, o);
        }
        
        @Override
        public int hashCode() {
            int i = l.this.d() - 1;
            int n = 0;
            while (i >= 0) {
                final Object b = l.this.b(i, 0);
                int hashCode;
                if (b == null) {
                    hashCode = 0;
                }
                else {
                    hashCode = b.hashCode();
                }
                n += hashCode;
                --i;
            }
            return n;
        }
        
        @Override
        public boolean isEmpty() {
            return l.this.d() == 0;
        }
        
        @Override
        public Iterator<K> iterator() {
            return new a<K>(0);
        }
        
        @Override
        public boolean remove(final Object o) {
            final int e = l.this.e(o);
            if (e >= 0) {
                l.this.h(e);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            return l.o(l.this.c(), collection);
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            return l.p(l.this.c(), collection);
        }
        
        @Override
        public int size() {
            return l.this.d();
        }
        
        @Override
        public Object[] toArray() {
            return l.this.q(0);
        }
        
        @Override
        public <T> T[] toArray(final T[] array) {
            return l.this.r(array, 0);
        }
    }
    
    final class d implements Iterator<Entry<K, V>>, Entry<K, V>
    {
        int G;
        int H;
        boolean I;
        
        d() {
            this.I = false;
            this.G = l.this.d() - 1;
            this.H = -1;
        }
        
        public Entry<K, V> a() {
            if (this.hasNext()) {
                ++this.H;
                this.I = true;
                return this;
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public boolean equals(final Object o) {
            if (!this.I) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            final boolean b = o instanceof Entry;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final Entry entry = (Entry)o;
            boolean b3 = b2;
            if (g.c(entry.getKey(), l.this.b(this.H, 0))) {
                b3 = b2;
                if (g.c(entry.getValue(), l.this.b(this.H, 1))) {
                    b3 = true;
                }
            }
            return b3;
        }
        
        @Override
        public K getKey() {
            if (this.I) {
                return (K)l.this.b(this.H, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public V getValue() {
            if (this.I) {
                return (V)l.this.b(this.H, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public boolean hasNext() {
            return this.H < this.G;
        }
        
        @Override
        public int hashCode() {
            if (this.I) {
                final l j = l.this;
                final int h = this.H;
                int hashCode = 0;
                final Object b = j.b(h, 0);
                final Object b2 = l.this.b(this.H, 1);
                int hashCode2;
                if (b == null) {
                    hashCode2 = 0;
                }
                else {
                    hashCode2 = b.hashCode();
                }
                if (b2 != null) {
                    hashCode = b2.hashCode();
                }
                return hashCode2 ^ hashCode;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public void remove() {
            if (this.I) {
                l.this.h(this.H);
                --this.H;
                --this.G;
                this.I = false;
                return;
            }
            throw new IllegalStateException();
        }
        
        @Override
        public V setValue(final V v) {
            if (this.I) {
                return l.this.i(this.H, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getKey());
            sb.append("=");
            sb.append(this.getValue());
            return sb.toString();
        }
    }
    
    final class e implements Collection<V>
    {
        @Override
        public boolean add(final V v) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public boolean addAll(final Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }
        
        @Override
        public void clear() {
            l.this.a();
        }
        
        @Override
        public boolean contains(final Object o) {
            return l.this.f(o) >= 0;
        }
        
        @Override
        public boolean containsAll(final Collection<?> collection) {
            final Iterator<?> iterator = collection.iterator();
            while (iterator.hasNext()) {
                if (!this.contains(iterator.next())) {
                    return false;
                }
            }
            return true;
        }
        
        @Override
        public boolean isEmpty() {
            return l.this.d() == 0;
        }
        
        @Override
        public Iterator<V> iterator() {
            return new a<V>(1);
        }
        
        @Override
        public boolean remove(final Object o) {
            final int f = l.this.f(o);
            if (f >= 0) {
                l.this.h(f);
                return true;
            }
            return false;
        }
        
        @Override
        public boolean removeAll(final Collection<?> collection) {
            int d = l.this.d();
            int i = 0;
            boolean b = false;
            while (i < d) {
                int n = d;
                int n2 = i;
                if (collection.contains(l.this.b(i, 1))) {
                    l.this.h(i);
                    n2 = i - 1;
                    n = d - 1;
                    b = true;
                }
                i = n2 + 1;
                d = n;
            }
            return b;
        }
        
        @Override
        public boolean retainAll(final Collection<?> collection) {
            int d = l.this.d();
            int i = 0;
            boolean b = false;
            while (i < d) {
                int n = d;
                int n2 = i;
                if (!collection.contains(l.this.b(i, 1))) {
                    l.this.h(i);
                    n2 = i - 1;
                    n = d - 1;
                    b = true;
                }
                i = n2 + 1;
                d = n;
            }
            return b;
        }
        
        @Override
        public int size() {
            return l.this.d();
        }
        
        @Override
        public Object[] toArray() {
            return l.this.q(1);
        }
        
        @Override
        public <T> T[] toArray(final T[] array) {
            return l.this.r(array, 1);
        }
    }
}
