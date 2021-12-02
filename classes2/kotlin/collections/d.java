// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.RandomAccess;
import java.util.NoSuchElementException;
import java.util.ListIterator;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.util.Collection;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;
import java.util.List;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b'\u0018\u0000 \u001d*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004\u001e\u0018\u001f B\t\b\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\fJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H\u0016J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0004H\u0016R\u0016\u0010\u001a\u001a\u00020\u00048&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006!" }, d2 = { "Lkotlin/collections/d;", "E", "Lkotlin/collections/a;", "", "", "index", "get", "(I)Ljava/lang/Object;", "", "iterator", "element", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "", "equals", "hashCode", "b", "()I", "size", "<init>", "()V", "G", "a", "c", "d", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class d<E> extends kotlin.collections.a<E> implements List<E>, o6.a
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    protected d() {
    }
    
    @Override
    public void add(final int n, final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final int n, final Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public abstract int b();
    
    @Override
    public boolean equals(@f final Object o) {
        return o == this || (o instanceof List && d.G.e(this, (Collection<?>)o));
    }
    
    @Override
    public abstract E get(final int p0);
    
    @Override
    public int hashCode() {
        return d.G.f(this);
    }
    
    @Override
    public int indexOf(final Object o) {
        final Iterator<Object> iterator = this.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (k0.g(iterator.next(), o)) {
                return n;
            }
            ++n;
        }
        n = -1;
        return n;
    }
    
    @e
    @Override
    public Iterator<E> iterator() {
        return new b();
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        final ListIterator<Object> listIterator = (ListIterator<Object>)this.listIterator(this.size());
        while (listIterator.hasPrevious()) {
            if (k0.g(listIterator.previous(), o)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }
    
    @e
    @Override
    public ListIterator<E> listIterator() {
        return new c(0);
    }
    
    @e
    @Override
    public ListIterator<E> listIterator(final int n) {
        return new c(n);
    }
    
    @Override
    public E remove(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public E set(final int n, final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @e
    @Override
    public List<E> subList(final int n, final int n2) {
        return new d<E>((d<? extends E>)this, n, n2);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\u0007J'\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u001b\u0010\u0011\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0015\u001a\u00020\u00142\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00102\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0019" }, d2 = { "kotlin/collections/d$a", "", "", "index", "size", "Lkotlin/j2;", "b", "(II)V", "c", "fromIndex", "toIndex", "d", "(III)V", "startIndex", "endIndex", "a", "", "f", "(Ljava/util/Collection;)I", "other", "", "e", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final void a(final int n, final int n2, final int i) {
            if (n < 0 || n2 > i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("startIndex: ");
                sb.append(n);
                sb.append(", endIndex: ");
                sb.append(n2);
                sb.append(", size: ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (n <= n2) {
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("startIndex: ");
            sb2.append(n);
            sb2.append(" > endIndex: ");
            sb2.append(n2);
            throw new IllegalArgumentException(sb2.toString());
        }
        
        public final void b(final int i, final int j) {
            if (i >= 0 && i < j) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(j);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        public final void c(final int i, final int j) {
            if (i >= 0 && i <= j) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("index: ");
            sb.append(i);
            sb.append(", size: ");
            sb.append(j);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        
        public final void d(final int n, final int n2, final int i) {
            if (n < 0 || n2 > i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("fromIndex: ");
                sb.append(n);
                sb.append(", toIndex: ");
                sb.append(n2);
                sb.append(", size: ");
                sb.append(i);
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (n <= n2) {
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("fromIndex: ");
            sb2.append(n);
            sb2.append(" > toIndex: ");
            sb2.append(n2);
            throw new IllegalArgumentException(sb2.toString());
        }
        
        public final boolean e(@e final Collection<?> collection, @e final Collection<?> collection2) {
            k0.p(collection, "c");
            k0.p(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            final Iterator<?> iterator = collection2.iterator();
            final Iterator<?> iterator2 = collection.iterator();
            while (iterator2.hasNext()) {
                if (k0.g(iterator2.next(), iterator.next()) ^ true) {
                    return false;
                }
            }
            return true;
        }
        
        public final int f(@e final Collection<?> collection) {
            k0.p(collection, "c");
            final Iterator<?> iterator = collection.iterator();
            int n = 1;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                int hashCode;
                if (next != null) {
                    hashCode = next.hashCode();
                }
                else {
                    hashCode = 0;
                }
                n = n * 31 + hashCode;
            }
            return n;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b\u0092\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0010\u0010\u0004\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\r\u001a\u00020\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010" }, d2 = { "kotlin/collections/d$b", "", "", "hasNext", "next", "()Ljava/lang/Object;", "", "G", "I", "a", "()I", "b", "(I)V", "index", "<init>", "(Lkotlin/collections/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private class b implements Iterator<E>, o6.a
    {
        private int G;
        
        public b() {
        }
        
        protected final int a() {
            return this.G;
        }
        
        protected final void b(final int g) {
            this.G = g;
        }
        
        @Override
        public boolean hasNext() {
            return this.G < d.this.size();
        }
        
        @Override
        public E next() {
            if (this.hasNext()) {
                return d.this.get(this.G++);
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\b\u0010\n\u001a\u00020\u0006H\u0016¨\u0006\u000e" }, d2 = { "kotlin/collections/d$c", "Lkotlin/collections/d$b;", "Lkotlin/collections/d;", "", "", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "index", "<init>", "(Lkotlin/collections/d;I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private class c extends b implements ListIterator<E>, o6.a
    {
        public c(final int n) {
            d.G.c(n, d.this.size());
            ((b)this).b(n);
        }
        
        @Override
        public void add(final E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
        
        @Override
        public boolean hasPrevious() {
            return ((b)this).a() > 0;
        }
        
        @Override
        public int nextIndex() {
            return ((b)this).a();
        }
        
        @Override
        public E previous() {
            if (this.hasPrevious()) {
                final d i = d.this;
                ((b)this).b(((b)this).a() - 1);
                return i.get(((b)this).a());
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public int previousIndex() {
            return ((b)this).a() - 1;
        }
        
        @Override
        public void set(final E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00010\u00022\u00060\u0003j\u0002`\u0004B%\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0007\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\tR\u0016\u0010\u0012\u001a\u00020\u00058V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016" }, d2 = { "kotlin/collections/d$d", "E", "Lkotlin/collections/d;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "index", "get", "(I)Ljava/lang/Object;", "I", "Lkotlin/collections/d;", "list", "H", "_size", "J", "fromIndex", "b", "()I", "size", "toIndex", "<init>", "(Lkotlin/collections/d;II)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class d<E> extends kotlin.collections.d<E> implements RandomAccess
    {
        private int H;
        private final kotlin.collections.d<E> I;
        private final int J;
        
        public d(@e final kotlin.collections.d<? extends E> i, final int j, final int n) {
            k0.p(i, "list");
            this.I = (kotlin.collections.d<E>)i;
            this.J = j;
            kotlin.collections.d.G.d(j, n, i.size());
            this.H = n - j;
        }
        
        @Override
        public int b() {
            return this.H;
        }
        
        @Override
        public E get(final int n) {
            kotlin.collections.d.G.b(n, this.H);
            return this.I.get(this.J + n);
        }
    }
}
