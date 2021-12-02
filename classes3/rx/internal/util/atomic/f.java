// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util.atomic;

import java.util.Objects;
import java.util.Iterator;
import java.util.Collection;
import rx.internal.util.unsafe.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class f<T> extends AtomicReferenceArray<T> implements Queue<T>
{
    private static final long K = 6210984603741293445L;
    final int G;
    final int H;
    final AtomicLong I;
    final AtomicLong J;
    
    public f(final int n) {
        super(p.b(n));
        final int length = this.length();
        this.G = length - 1;
        this.H = length - n;
        this.I = new AtomicLong();
        this.J = new AtomicLong();
    }
    
    @Override
    public boolean add(final T t) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(final Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void clear() {
        while (true) {
            if (this.poll() == null) {
                if (!this.isEmpty()) {
                    continue;
                }
                break;
            }
        }
    }
    
    @Override
    public boolean contains(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean containsAll(final Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public T element() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean isEmpty() {
        return this.I == this.J;
    }
    
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean offer(final T t) {
        Objects.requireNonNull(t);
        final long value = this.I.get();
        final int g = this.G;
        if (this.get((int)(this.H + value) & g) != null) {
            return false;
        }
        final int n = (int)value;
        this.I.lazySet(value + 1L);
        this.lazySet(g & n, t);
        return true;
    }
    
    @Override
    public T peek() {
        return this.get(this.G & (int)this.J.get());
    }
    
    @Override
    public T poll() {
        final long value = this.J.get();
        final int n = (int)value & this.G;
        final T value2 = this.get(n);
        if (value2 == null) {
            return null;
        }
        this.J.lazySet(value + 1L);
        this.lazySet(n, null);
        return value2;
    }
    
    @Override
    public T remove() {
        throw new UnsupportedOperationException();
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
        long value = this.J.get();
        long value2;
        long value3;
        while (true) {
            value2 = this.I.get();
            value3 = this.J.get();
            if (value == value3) {
                break;
            }
            value = value3;
        }
        return (int)(value2 - value3);
    }
    
    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public <E> E[] toArray(final E[] array) {
        throw new UnsupportedOperationException();
    }
}
