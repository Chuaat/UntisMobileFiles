// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.utils;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;
import java.util.Arrays;
import java.lang.reflect.Array;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.AbstractList;

public class i<E> extends AbstractList<E> implements RandomAccess
{
    private int G;
    private Object H;
    
    private static /* synthetic */ void b(final int n) {
        String format;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
            format = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        }
        else {
            format = "@NotNull method %s.%s must not return null";
        }
        int n2;
        if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
            n2 = 3;
        }
        else {
            n2 = 2;
        }
        final Object[] args = new Object[n2];
        switch (n) {
            default: {
                args[0] = "elements";
                break;
            }
            case 4: {
                args[0] = "a";
                break;
            }
            case 2:
            case 3:
            case 5:
            case 6:
            case 7: {
                args[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            }
        }
        if (n != 2 && n != 3) {
            if (n != 5 && n != 6 && n != 7) {
                args[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
            }
            else {
                args[1] = "toArray";
            }
        }
        else {
            args[1] = "iterator";
        }
        switch (n) {
            case 4: {
                args[2] = "toArray";
            }
            default: {
                args[2] = "<init>";
            }
            case 2:
            case 3:
            case 5:
            case 6:
            case 7: {
                final String format2 = String.format(format, args);
                RuntimeException ex;
                if (n != 2 && n != 3 && n != 5 && n != 6 && n != 7) {
                    ex = new IllegalArgumentException(format2);
                }
                else {
                    ex = new IllegalStateException(format2);
                }
                throw ex;
            }
        }
    }
    
    @Override
    public void add(final int i, final E h) {
        if (i >= 0) {
            final int g = this.G;
            if (i <= g) {
                if (g == 0) {
                    this.H = h;
                }
                else if (g == 1 && i == 0) {
                    this.H = new Object[] { h, this.H };
                }
                else {
                    final Object[] h2 = new Object[g + 1];
                    if (g == 1) {
                        h2[0] = this.H;
                    }
                    else {
                        final Object[] array = (Object[])this.H;
                        System.arraycopy(array, 0, h2, 0, i);
                        System.arraycopy(array, i, h2, i + 1, this.G - i);
                    }
                    h2[i] = h;
                    this.H = h2;
                }
                ++this.G;
                ++super.modCount;
                return;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.G);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public boolean add(final E h) {
        final int g = this.G;
        if (g == 0) {
            this.H = h;
        }
        else if (g == 1) {
            this.H = new Object[] { this.H, h };
        }
        else {
            final Object[] array = (Object[])this.H;
            final int length = array.length;
            Object[] h2 = array;
            if (g >= length) {
                final int n = length * 3 / 2 + 1;
                final int n2 = g + 1;
                int n3;
                if ((n3 = n) < n2) {
                    n3 = n2;
                }
                h2 = new Object[n3];
                System.arraycopy(array, 0, this.H = h2, 0, length);
            }
            h2[this.G] = h;
        }
        ++this.G;
        ++super.modCount;
        return true;
    }
    
    @Override
    public void clear() {
        this.H = null;
        this.G = 0;
        ++super.modCount;
    }
    
    @Override
    public E get(final int i) {
        if (i >= 0) {
            final int g = this.G;
            if (i < g) {
                if (g == 1) {
                    return (E)this.H;
                }
                return (E)((Object[])this.H)[i];
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.G);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @e
    @Override
    public Iterator<E> iterator() {
        final int g = this.G;
        if (g == 0) {
            final b<E> a = b.a();
            if (a == null) {
                b(2);
            }
            return a;
        }
        if (g == 1) {
            return new c();
        }
        final Iterator<E> iterator = super.iterator();
        if (iterator == null) {
            b(3);
        }
        return iterator;
    }
    
    @Override
    public E remove(final int i) {
        if (i >= 0) {
            final int g = this.G;
            if (i < g) {
                Object h;
                if (g == 1) {
                    h = this.H;
                    this.H = null;
                }
                else {
                    final Object[] array = (Object[])this.H;
                    h = array[i];
                    if (g == 2) {
                        this.H = array[1 - i];
                    }
                    else {
                        final int n = g - i - 1;
                        if (n > 0) {
                            System.arraycopy(array, i + 1, array, i, n);
                        }
                        array[this.G - 1] = null;
                    }
                }
                --this.G;
                ++super.modCount;
                return (E)h;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.G);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public E set(final int i, final E h) {
        if (i >= 0) {
            final int g = this.G;
            if (i < g) {
                Object o;
                if (g == 1) {
                    final Object h2 = this.H;
                    this.H = h;
                    o = h2;
                }
                else {
                    final Object[] array = (Object[])this.H;
                    final Object o2 = array[i];
                    array[i] = h;
                    o = o2;
                }
                return (E)o;
            }
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        sb.append(", Size: ");
        sb.append(this.G);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public int size() {
        return this.G;
    }
    
    @e
    @Override
    public <T> T[] toArray(@e final T[] array) {
        if (array == null) {
            b(4);
        }
        final int length = array.length;
        final int g = this.G;
        if (g == 1) {
            if (length == 0) {
                final Object[] array2 = (Object[])Array.newInstance(array.getClass().getComponentType(), 1);
                array2[0] = this.H;
                return (T[])array2;
            }
            array[0] = (T)this.H;
        }
        else {
            if (length < g) {
                final Object[] copy = Arrays.copyOf((Object[])this.H, g, array.getClass());
                if (copy == null) {
                    b(6);
                }
                return (T[])copy;
            }
            if (g != 0) {
                System.arraycopy(this.H, 0, array, 0, g);
            }
        }
        final int g2 = this.G;
        if (length > g2) {
            array[g2] = null;
        }
        return array;
    }
    
    private static class b<T> implements Iterator<T>
    {
        private static final b G;
        
        static {
            G = new b();
        }
        
        public static <T> b<T> a() {
            return (b<T>)b.G;
        }
        
        @Override
        public boolean hasNext() {
            return false;
        }
        
        @Override
        public T next() {
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new IllegalStateException();
        }
    }
    
    private class c extends d<E>
    {
        private final int H;
        
        public c() {
            this.H = i.this.modCount;
        }
        
        @Override
        protected void a() {
            if (i.this.modCount == this.H) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("ModCount: ");
            sb.append(i.this.modCount);
            sb.append("; expected: ");
            sb.append(this.H);
            throw new ConcurrentModificationException(sb.toString());
        }
        
        @Override
        protected E b() {
            return (E)i.this.H;
        }
        
        @Override
        public void remove() {
            this.a();
            i.this.clear();
        }
    }
    
    private abstract static class d<T> implements Iterator<T>
    {
        private boolean G;
        
        protected abstract void a();
        
        protected abstract T b();
        
        @Override
        public final boolean hasNext() {
            return this.G ^ true;
        }
        
        @Override
        public final T next() {
            if (!this.G) {
                this.G = true;
                this.a();
                return this.b();
            }
            throw new NoSuchElementException();
        }
    }
}
