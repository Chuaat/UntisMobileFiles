// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.NoSuchElementException;
import java.util.Arrays;
import java.util.Objects;
import java.util.ListIterator;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.collections.d;
import kotlin.collections.l;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.m;
import kotlin.Metadata;
import o6.e;
import java.util.RandomAccess;
import java.util.List;
import kotlin.collections.g;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005:\u0001ZBO\b\u0002\u0012\f\u0010M\u001a\b\u0012\u0004\u0012\u00028\u000009\u0012\u0006\u0010R\u001a\u00020\u0006\u0012\u0006\u0010G\u001a\u00020\u0006\u0012\u0006\u0010P\u001a\u00020\u000f\u0012\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bU\u0010VB\t\b\u0016¢\u0006\u0004\bU\u0010WB\u0011\b\u0016\u0012\u0006\u0010X\u001a\u00020\u0006¢\u0006\u0004\bU\u0010YJ\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0014\u0010\u0010\u001a\u00020\u000f2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\rH\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0002J\u0017\u0010\u0019\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J.\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u001e\u001a\u00020\u000fH\u0002J\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\rJ\b\u0010!\u001a\u00020\u000fH\u0016J\u0018\u0010#\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0006H\u0096\u0002¢\u0006\u0004\b#\u0010\u001aJ \u0010$\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010'J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0096\u0002J\u000e\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0016J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+2\u0006\u0010\"\u001a\u00020\u0006H\u0016J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u0010-\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b-\u0010\u0015J\u0016\u0010/\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u001e\u0010/\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\b\u00100\u001a\u00020\bH\u0016J\u0017\u00101\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u0010\u001aJ\u0017\u00102\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010.J\u0016\u00103\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u0016\u00104\u001a\u00020\u000f2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016J\u001e\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00105\u001a\u00020\u00062\u0006\u00106\u001a\u00020\u0006H\u0016J)\u0010;\u001a\b\u0012\u0004\u0012\u00028\u000109\"\u0004\b\u0001\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000109H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010=09H\u0016¢\u0006\u0004\b;\u0010>J\u0013\u0010?\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010=H\u0096\u0002J\b\u0010@\u001a\u00020\u0006H\u0016J\b\u0010B\u001a\u00020AH\u0016R\u001e\u0010E\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010FR\u0016\u0010J\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010FR\u001e\u0010T\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010D¨\u0006[" }, d2 = { "Lkotlin/collections/builders/b;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/g;", "", "minCapacity", "Lkotlin/j2;", "x", "v", "n", "z", "", "other", "", "w", "i", "A", "element", "r", "(ILjava/lang/Object;)V", "", "elements", "q", "B", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "C", "retain", "D", "t", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "f", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "K", "Lkotlin/collections/builders/b;", "backing", "I", "length", "b", "()I", "size", "G", "[Ljava/lang/Object;", "array", "J", "Z", "isReadOnly", "H", "offset", "L", "root", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/b;Lkotlin/collections/builders/b;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class b<E> extends g<E> implements List<E>, RandomAccess, e
{
    private E[] G;
    private int H;
    private int I;
    private boolean J;
    private final b<E> K;
    private final b<E> L;
    
    public b() {
        this(10);
    }
    
    public b(final int n) {
        this(kotlin.collections.builders.c.d(n), 0, 0, false, null, null);
    }
    
    private b(final E[] g, final int h, final int i, final boolean j, final b<E> k, final b<E> l) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    private final void A(final int n, final int n2) {
        this.z(n2);
        final E[] g = this.G;
        m.c1(g, g, n + n2, n, this.H + this.I);
        this.I += n2;
    }
    
    private final E B(final int n) {
        final b<E> k = this.K;
        if (k != null) {
            final Object b = k.B(n);
            --this.I;
            return (E)b;
        }
        final E[] g = this.G;
        final E e = g[n];
        m.c1(g, g, n, n + 1, this.H + this.I);
        kotlin.collections.builders.c.f(this.G, this.H + this.I - 1);
        --this.I;
        return e;
    }
    
    private final void C(int i, final int n) {
        final b<E> k = this.K;
        if (k != null) {
            k.C(i, n);
        }
        else {
            final E[] g = this.G;
            m.c1(g, g, i, i + n, this.I);
            final E[] g2 = this.G;
            i = this.I;
            kotlin.collections.builders.c.g(g2, i - n, i);
        }
        this.I -= n;
    }
    
    private final int D(int n, final int n2, final Collection<? extends E> collection, final boolean b) {
        final b<E> k = this.K;
        if (k != null) {
            n = k.D(n, n2, collection, b);
            this.I -= n;
            return n;
        }
        int i = 0;
        int n3 = 0;
        while (i < n2) {
            final E[] g = this.G;
            final int n4 = n + i;
            if (collection.contains(g[n4]) == b) {
                final E[] g2 = this.G;
                ++i;
                g2[n3 + n] = g2[n4];
                ++n3;
            }
            else {
                ++i;
            }
        }
        final int n5 = n2 - n3;
        final E[] g3 = this.G;
        m.c1(g3, g3, n + n3, n2 + n, this.I);
        final E[] g4 = this.G;
        n = this.I;
        kotlin.collections.builders.c.g(g4, n - n5, n);
        this.I -= n5;
        return n5;
    }
    
    public static final /* synthetic */ Object[] h(final b b) {
        return b.G;
    }
    
    public static final /* synthetic */ int i(final b b) {
        return b.I;
    }
    
    public static final /* synthetic */ int k(final b b) {
        return b.H;
    }
    
    private final void q(final int n, final Collection<? extends E> collection, final int n2) {
        final b<E> k = this.K;
        if (k != null) {
            k.q(n, collection, n2);
            this.G = this.K.G;
            this.I += n2;
        }
        else {
            this.A(n, n2);
            int i = 0;
            final Iterator<? extends E> iterator = collection.iterator();
            while (i < n2) {
                this.G[n + i] = (E)iterator.next();
                ++i;
            }
        }
    }
    
    private final void r(final int n, final E e) {
        final b<E> k = this.K;
        if (k != null) {
            k.r(n, (Object)e);
            this.G = this.K.G;
            ++this.I;
        }
        else {
            this.A(n, 1);
            this.G[n] = e;
        }
    }
    
    private final void v() {
        if (!this.J) {
            final b<E> l = this.L;
            if (l == null || !l.J) {
                return;
            }
        }
        throw new UnsupportedOperationException();
    }
    
    private final boolean w(final List<?> list) {
        return kotlin.collections.builders.c.a(this.G, this.H, this.I, list);
    }
    
    private final void x(int a) {
        if (this.K == null) {
            final E[] g = this.G;
            if (a > g.length) {
                a = l.M.a(g.length, a);
                this.G = kotlin.collections.builders.c.e(this.G, a);
            }
            return;
        }
        throw new IllegalStateException();
    }
    
    private final void z(final int n) {
        this.x(this.I + n);
    }
    
    @Override
    public void add(final int n, final E e) {
        this.v();
        d.G.c(n, this.I);
        this.r(this.H + n, e);
    }
    
    @Override
    public boolean add(final E e) {
        this.v();
        this.r(this.H + this.I, e);
        return true;
    }
    
    @Override
    public boolean addAll(final int n, @org.jetbrains.annotations.e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        this.v();
        d.G.c(n, this.I);
        final int size = collection.size();
        this.q(this.H + n, collection, size);
        return size > 0;
    }
    
    @Override
    public boolean addAll(@org.jetbrains.annotations.e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        this.v();
        final int size = collection.size();
        this.q(this.H + this.I, collection, size);
        return size > 0;
    }
    
    @Override
    public int b() {
        return this.I;
    }
    
    @Override
    public void clear() {
        this.v();
        this.C(this.H, this.I);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o == this || (o instanceof List && this.w((List<?>)o));
    }
    
    @Override
    public E f(final int n) {
        this.v();
        d.G.b(n, this.I);
        return this.B(this.H + n);
    }
    
    @Override
    public E get(final int n) {
        d.G.b(n, this.I);
        return this.G[this.H + n];
    }
    
    @Override
    public int hashCode() {
        return kotlin.collections.builders.c.b(this.G, this.H, this.I);
    }
    
    @Override
    public int indexOf(final Object o) {
        for (int i = 0; i < this.I; ++i) {
            if (k0.g(this.G[this.H + i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    @Override
    public boolean isEmpty() {
        return this.I == 0;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Iterator<E> iterator() {
        return new a<E>(this, 0);
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        for (int i = this.I - 1; i >= 0; --i) {
            if (k0.g(this.G[this.H + i], o)) {
                return i;
            }
        }
        return -1;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public ListIterator<E> listIterator() {
        return new a<E>(this, 0);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public ListIterator<E> listIterator(final int n) {
        d.G.c(n, this.I);
        return new a<E>(this, n);
    }
    
    @Override
    public boolean remove(final Object o) {
        this.v();
        final int index = this.indexOf(o);
        if (index >= 0) {
            this.remove(index);
        }
        return index >= 0;
    }
    
    @Override
    public boolean removeAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "elements");
        this.v();
        final int h = this.H;
        final int i = this.I;
        boolean b = false;
        if (this.D(h, i, (Collection<? extends E>)collection, false) > 0) {
            b = true;
        }
        return b;
    }
    
    @Override
    public boolean retainAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "elements");
        this.v();
        final int h = this.H;
        final int i = this.I;
        boolean b = true;
        if (this.D(h, i, (Collection<? extends E>)collection, true) <= 0) {
            b = false;
        }
        return b;
    }
    
    @Override
    public E set(final int n, final E e) {
        this.v();
        d.G.b(n, this.I);
        final E[] g = this.G;
        final int h = this.H;
        final E e2 = g[h + n];
        g[h + n] = e;
        return e2;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<E> subList(final int n, final int n2) {
        d.G.d(n, n2, this.I);
        final E[] g = this.G;
        final int h = this.H;
        final boolean j = this.J;
        b<E> l = this.L;
        if (l == null) {
            l = this;
        }
        return new b(g, h + n, n2 - n, j, (b<Object>)this, (b<Object>)l);
    }
    
    @org.jetbrains.annotations.e
    public final List<E> t() {
        if (this.K == null) {
            this.v();
            this.J = true;
            return this;
        }
        throw new IllegalStateException();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Object[] toArray() {
        final E[] g = this.G;
        final int h = this.H;
        final E[] m1 = m.M1(g, h, this.I + h);
        Objects.requireNonNull(m1, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        return m1;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> T[] toArray(@org.jetbrains.annotations.e final T[] array) {
        k0.p(array, "destination");
        final int length = array.length;
        final int i = this.I;
        if (length < i) {
            final E[] g = this.G;
            final int h = this.H;
            final Object[] copyOfRange = Arrays.copyOfRange(g, h, i + h, array.getClass());
            k0.o(copyOfRange, "java.util.Arrays.copyOfR\u2026h, destination.javaClass)");
            return (T[])copyOfRange;
        }
        final E[] g2 = this.G;
        Objects.requireNonNull(g2, "null cannot be cast to non-null type kotlin.Array<T>");
        final int h2 = this.H;
        m.c1(g2, array, 0, h2, i + h2);
        final int length2 = array.length;
        final int j = this.I;
        if (length2 > j) {
            array[j] = null;
        }
        return array;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        return kotlin.collections.builders.c.c(this.G, this.H, this.I);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010\u0002B\u001f\b\u0016\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0015\u0012\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u000f\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\b\u0010\u0011\u001a\u00020\rH\u0016R\u0016\u0010\u0014\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00158\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0013¨\u0006\u001c" }, d2 = { "kotlin/collections/builders/b$a", "E", "", "", "hasPrevious", "hasNext", "", "previousIndex", "nextIndex", "previous", "()Ljava/lang/Object;", "next", "element", "Lkotlin/j2;", "set", "(Ljava/lang/Object;)V", "add", "remove", "H", "I", "index", "Lkotlin/collections/builders/b;", "G", "Lkotlin/collections/builders/b;", "list", "lastIndex", "<init>", "(Lkotlin/collections/builders/b;I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a<E> implements ListIterator<E>, f
    {
        private final b<E> G;
        private int H;
        private int I;
        
        public a(@org.jetbrains.annotations.e final b<E> g, final int h) {
            k0.p(g, "list");
            this.G = g;
            this.H = h;
            this.I = -1;
        }
        
        @Override
        public void add(final E e) {
            this.G.add(this.H++, e);
            this.I = -1;
        }
        
        @Override
        public boolean hasNext() {
            return this.H < b.i((b<Object>)this.G);
        }
        
        @Override
        public boolean hasPrevious() {
            return this.H > 0;
        }
        
        @Override
        public E next() {
            if (this.H < b.i((b<Object>)this.G)) {
                this.I = this.H++;
                return (E)b.h((b<Object>)this.G)[b.k((b<Object>)this.G) + this.I];
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public int nextIndex() {
            return this.H;
        }
        
        @Override
        public E previous() {
            int h = this.H;
            if (h > 0) {
                --h;
                this.H = h;
                this.I = h;
                return (E)b.h((b<Object>)this.G)[b.k((b<Object>)this.G) + this.I];
            }
            throw new NoSuchElementException();
        }
        
        @Override
        public int previousIndex() {
            return this.H - 1;
        }
        
        @Override
        public void remove() {
            final int i = this.I;
            if (i != -1) {
                this.G.remove(i);
                this.H = this.I;
                this.I = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }
        
        @Override
        public void set(final E e) {
            final int i = this.I;
            if (i != -1) {
                this.G.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }
}
