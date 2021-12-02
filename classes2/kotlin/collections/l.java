// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import java.util.NoSuchElementException;
import java.util.List;
import kotlin.j2;
import n6.p;
import kotlin.ranges.o;
import java.util.Iterator;
import kotlin.internal.f;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 =*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001QB\u0011\b\u0016\u0012\u0006\u0010L\u001a\u00020\u0003¢\u0006\u0004\bM\u0010NB\t\b\u0016¢\u0006\u0004\bM\u0010OB\u0017\b\u0016\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\bM\u0010PJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\n\u001a\u00028\u00002\u0006\u0010\t\u001a\u00020\u0003H\u0083\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0011\u0010\u0001\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0083\bJ\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002J\u001e\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002J\u001d\u0010\u0017\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\bJ\b\u0010\u0018\u001a\u00020\u0015H\u0016J\r\u0010\u0019\u001a\u00028\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\r\u0010\u001c\u001a\u00028\u0000¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u001d\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u001d\u0010\u001aJ\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00028\u0000¢\u0006\u0004\b!\u0010 J\r\u0010\"\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010\u001aJ\u000f\u0010#\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b#\u0010\u001aJ\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010\u001aJ\u000f\u0010%\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b%\u0010\u001aJ\u0017\u0010&\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010(J\u0016\u0010)\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u001e\u0010)\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0018\u0010*\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b*\u0010\u000bJ \u0010+\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b-\u0010'J\u0017\u0010.\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010'J\u0017\u00102\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b2\u0010\u000bJ\u0016\u00103\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u00104\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\b\u00105\u001a\u00020\u0005H\u0016J)\u00109\u001a\b\u0012\u0004\u0012\u00028\u000107\"\u0004\b\u0001\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000107H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;07H\u0016¢\u0006\u0004\b9\u0010<J)\u0010=\u001a\b\u0012\u0004\u0012\u00028\u000107\"\u0004\b\u0001\u001062\f\u00108\u001a\b\u0012\u0004\u0012\u00028\u000107H\u0000¢\u0006\u0004\b=\u0010:J\u0017\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;07H\u0000¢\u0006\u0004\b>\u0010<JO\u0010D\u001a\u00020\u00052>\u0010C\u001a:\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(B\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010;07¢\u0006\f\b@\u0012\b\bA\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00050?H\u0000¢\u0006\u0004\bD\u0010ER\u001e\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010;078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010FR$\u0010K\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\u00038\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b\r\u0010\r\u001a\u0004\bI\u0010JR\u0016\u0010B\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\r¨\u0006R" }, d2 = { "Lkotlin/collections/l;", "E", "Lkotlin/collections/g;", "", "minCapacity", "Lkotlin/j2;", "z", "newCapacity", "w", "internalIndex", "D", "(I)Ljava/lang/Object;", "index", "I", "H", "C", "x", "", "elements", "v", "Lkotlin/Function1;", "", "predicate", "A", "isEmpty", "o2", "()Ljava/lang/Object;", "B", "f1", "G", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "J", "removeLast", "K", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "f", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "M", "L", "Lkotlin/Function2;", "Lkotlin/t0;", "name", "head", "structure", "F", "(Ln6/p;)V", "[Ljava/lang/Object;", "elementData", "<set-?>", "b", "()I", "size", "initialCapacity", "<init>", "(I)V", "()V", "(Ljava/util/Collection;)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.4")
@o2(markerClass = { q.class })
public final class l<E> extends g<E>
{
    private static final Object[] J;
    private static final int K = 2147483639;
    private static final int L = 10;
    @org.jetbrains.annotations.e
    public static final a M;
    private int G;
    private Object[] H;
    private int I;
    
    static {
        M = new a(null);
        J = new Object[0];
    }
    
    public l() {
        this.H = l.J;
    }
    
    public l(final int i) {
        Object[] j;
        if (i == 0) {
            j = l.J;
        }
        else {
            if (i <= 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Illegal Capacity: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            j = new Object[i];
        }
        this.H = j;
    }
    
    public l(@org.jetbrains.annotations.e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        boolean b = false;
        final Object[] array = collection.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.H = array;
        this.I = array.length;
        if (array.length == 0) {
            b = true;
        }
        if (b) {
            this.H = l.J;
        }
    }
    
    private final boolean A(final n6.l<? super E, Boolean> l) {
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        boolean b2 = b;
        if (!empty) {
            if (h(this).length == 0) {
                b2 = b;
            }
            else {
                final int p = this.I(i(this) + this.size());
                int i = i(this);
                int n3;
                if (i(this) < p) {
                    int j = i(this);
                    n3 = i;
                    while (j < p) {
                        final Object o = h(this)[j];
                        if (l.invoke((Object)o)) {
                            h(this)[n3] = o;
                            ++n3;
                        }
                        else {
                            n2 = 1;
                        }
                        ++j;
                    }
                    m.n2(h(this), null, n3, p);
                }
                else {
                    int k = i(this);
                    final int length = h(this).length;
                    n2 = 0;
                    while (k < length) {
                        final Object o2 = h(this)[k];
                        h(this)[k] = null;
                        if (l.invoke((Object)o2)) {
                            h(this)[i] = o2;
                            ++i;
                        }
                        else {
                            n2 = 1;
                        }
                        ++k;
                    }
                    n3 = this.I(i);
                    for (int n4 = n; n4 < p; ++n4) {
                        final Object o3 = h(this)[n4];
                        h(this)[n4] = null;
                        if (l.invoke((Object)o3)) {
                            h(this)[n3] = o3;
                            n3 = this.C(n3);
                        }
                        else {
                            n2 = 1;
                        }
                    }
                }
                b2 = (n2 != 0);
                if (n2 != 0) {
                    t(this, this.H(n3 - i(this)));
                    b2 = (n2 != 0);
                }
            }
        }
        return b2;
    }
    
    private final int C(int n) {
        if (n == m.Td(this.H)) {
            n = 0;
        }
        else {
            ++n;
        }
        return n;
    }
    
    @f
    private final E D(final int n) {
        return (E)h(this)[n];
    }
    
    @f
    private final int E(final int n) {
        return this.I(i(this) + n);
    }
    
    private final int H(final int n) {
        int n2 = n;
        if (n < 0) {
            n2 = n + this.H.length;
        }
        return n2;
    }
    
    private final int I(final int n) {
        final Object[] h = this.H;
        int n2 = n;
        if (n >= h.length) {
            n2 = n - h.length;
        }
        return n2;
    }
    
    public static final /* synthetic */ Object[] h(final l l) {
        return l.H;
    }
    
    public static final /* synthetic */ int i(final l l) {
        return l.G;
    }
    
    public static final /* synthetic */ void t(final l l, final int i) {
        l.I = i;
    }
    
    private final void v(int n, final Collection<? extends E> collection) {
        Iterator<? extends E> iterator;
        for (iterator = collection.iterator(); n < this.H.length && iterator.hasNext(); ++n) {
            this.H[n] = iterator.next();
        }
        for (n = 0; n < this.G && iterator.hasNext(); ++n) {
            this.H[n] = iterator.next();
        }
        this.I = this.size() + collection.size();
    }
    
    private final void w(int g) {
        final Object[] h = new Object[g];
        final Object[] h2 = this.H;
        m.c1(h2, h, 0, this.G, h2.length);
        final Object[] h3 = this.H;
        final int length = h3.length;
        g = this.G;
        m.c1(h3, h, length - g, 0, g);
        this.G = 0;
        this.H = h;
    }
    
    private final int x(int td) {
        if (td == 0) {
            td = m.Td(this.H);
        }
        else {
            --td;
        }
        return td;
    }
    
    private final void z(final int n) {
        if (n < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        final Object[] h = this.H;
        if (n <= h.length) {
            return;
        }
        if (h == l.J) {
            this.H = new Object[o.n(n, 10)];
            return;
        }
        this.w(l.M.a(h.length, n));
    }
    
    @org.jetbrains.annotations.f
    public final E B() {
        Object o;
        if (this.isEmpty()) {
            o = null;
        }
        else {
            o = h(this)[this.G];
        }
        return (E)o;
    }
    
    public final void F(@org.jetbrains.annotations.e final p<? super Integer, ? super Object[], j2> p) {
        k0.p(p, "structure");
        final int p2 = this.I(i(this) + this.size());
        int g2 = 0;
        Label_0059: {
            if (!this.isEmpty()) {
                final int g = this.G;
                if (g >= p2) {
                    g2 = g - this.H.length;
                    break Label_0059;
                }
            }
            g2 = this.G;
        }
        p.invoke(g2, this.toArray());
    }
    
    @org.jetbrains.annotations.f
    public final E G() {
        Object o;
        if (this.isEmpty()) {
            o = null;
        }
        else {
            o = h(this)[this.I(i(this) + v.G((List<?>)this))];
        }
        return (E)o;
    }
    
    @org.jetbrains.annotations.f
    public final E J() {
        E removeFirst;
        if (this.isEmpty()) {
            removeFirst = null;
        }
        else {
            removeFirst = this.removeFirst();
        }
        return removeFirst;
    }
    
    @org.jetbrains.annotations.f
    public final E K() {
        E removeLast;
        if (this.isEmpty()) {
            removeLast = null;
        }
        else {
            removeLast = this.removeLast();
        }
        return removeLast;
    }
    
    @org.jetbrains.annotations.e
    public final Object[] L() {
        return this.toArray();
    }
    
    @org.jetbrains.annotations.e
    public final <T> T[] M(@org.jetbrains.annotations.e final T[] array) {
        k0.p(array, "array");
        return (T[])this.toArray((Object[])array);
    }
    
    @Override
    public void add(int n, final E e) {
        d.G.c(n, this.size());
        if (n == this.size()) {
            this.addLast(e);
            return;
        }
        if (n == 0) {
            this.addFirst(e);
            return;
        }
        this.z(this.size() + 1);
        final int p2 = this.I(i(this) + n);
        if (n < this.size() + 1 >> 1) {
            n = this.x(p2);
            final int x = this.x(this.G);
            final int g = this.G;
            if (n >= g) {
                final Object[] h = this.H;
                h[x] = h[g];
                m.c1(h, h, g, g + 1, n + 1);
            }
            else {
                final Object[] h2 = this.H;
                m.c1(h2, h2, g - 1, g, h2.length);
                final Object[] h3 = this.H;
                h3[h3.length - 1] = h3[0];
                m.c1(h3, h3, 0, 1, n + 1);
            }
            this.H[n] = e;
            this.G = x;
        }
        else {
            n = this.size();
            n = this.I(i(this) + n);
            final Object[] h4 = this.H;
            if (p2 < n) {
                m.c1(h4, h4, p2 + 1, p2, n);
            }
            else {
                m.c1(h4, h4, 1, 0, n);
                final Object[] h5 = this.H;
                h5[0] = h5[h5.length - 1];
                m.c1(h5, h5, p2 + 1, p2, h5.length - 1);
            }
            this.H[p2] = e;
        }
        this.I = this.size() + 1;
    }
    
    @Override
    public boolean add(final E e) {
        this.addLast(e);
        return true;
    }
    
    @Override
    public boolean addAll(int g, @org.jetbrains.annotations.e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        d.G.c(g, this.size());
        if (collection.isEmpty()) {
            return false;
        }
        if (g == this.size()) {
            return this.addAll(collection);
        }
        this.z(this.size() + collection.size());
        final int p2 = this.I(i(this) + this.size());
        final int p3 = this.I(i(this) + g);
        final int size = collection.size();
        if (g < this.size() + 1 >> 1) {
            final int g2 = this.G;
            g = g2 - size;
            if (p3 >= g2) {
                if (g >= 0) {
                    final Object[] h = this.H;
                    m.c1(h, h, g, g2, p3);
                }
                else {
                    final Object[] h2 = this.H;
                    g += h2.length;
                    final int n = h2.length - g;
                    if (n >= p3 - g2) {
                        m.c1(h2, h2, g, g2, p3);
                    }
                    else {
                        m.c1(h2, h2, g, g2, g2 + n);
                        final Object[] h3 = this.H;
                        m.c1(h3, h3, 0, this.G + n, p3);
                    }
                }
            }
            else {
                final Object[] h4 = this.H;
                m.c1(h4, h4, g, g2, h4.length);
                final Object[] h5 = this.H;
                if (size >= p3) {
                    m.c1(h5, h5, h5.length - size, 0, p3);
                }
                else {
                    m.c1(h5, h5, h5.length - size, 0, size);
                    final Object[] h6 = this.H;
                    m.c1(h6, h6, 0, size, p3);
                }
            }
            this.G = g;
            this.v(this.H(p3 - size), collection);
        }
        else {
            g = p3 + size;
            Label_0540: {
                if (p3 < p2) {
                    final int n2 = size + p2;
                    final Object[] h7 = this.H;
                    if (n2 > h7.length) {
                        if (g < h7.length) {
                            final int n3 = p2 - (n2 - h7.length);
                            m.c1(h7, h7, 0, n3, p2);
                            final Object[] h8 = this.H;
                            m.c1(h8, h8, g, p3, n3);
                            break Label_0540;
                        }
                        g -= h7.length;
                    }
                    m.c1(h7, h7, g, p3, p2);
                }
                else {
                    final Object[] h9 = this.H;
                    m.c1(h9, h9, size, 0, p2);
                    final Object[] h10 = this.H;
                    if (g >= h10.length) {
                        m.c1(h10, h10, g - h10.length, p3, h10.length);
                    }
                    else {
                        m.c1(h10, h10, 0, h10.length - size, h10.length);
                        final Object[] h11 = this.H;
                        m.c1(h11, h11, g, p3, h11.length - size);
                    }
                }
            }
            this.v(p3, collection);
        }
        return true;
    }
    
    @Override
    public boolean addAll(@org.jetbrains.annotations.e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        this.z(this.size() + collection.size());
        this.v(this.I(i(this) + this.size()), collection);
        return true;
    }
    
    public final void addFirst(final E e) {
        this.z(this.size() + 1);
        final int x = this.x(this.G);
        this.G = x;
        this.H[x] = e;
        this.I = this.size() + 1;
    }
    
    public final void addLast(final E e) {
        this.z(this.size() + 1);
        this.H[this.I(i(this) + this.size())] = e;
        this.I = this.size() + 1;
    }
    
    @Override
    public int b() {
        return this.I;
    }
    
    @Override
    public void clear() {
        final int p = this.I(i(this) + this.size());
        final int g = this.G;
        if (g < p) {
            m.n2(this.H, null, g, p);
        }
        else if (this.isEmpty() ^ true) {
            final Object[] h = this.H;
            m.n2(h, null, this.G, h.length);
            m.n2(this.H, null, 0, p);
        }
        this.G = 0;
        this.I = 0;
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.indexOf(o) != -1;
    }
    
    @Override
    public E f(int n) {
        d.G.b(n, this.size());
        if (n == v.G((List<?>)this)) {
            return this.removeLast();
        }
        if (n == 0) {
            return this.removeFirst();
        }
        final int p = this.I(i(this) + n);
        final Object o = h(this)[p];
        if (n < this.size() >> 1) {
            n = this.G;
            if (p >= n) {
                final Object[] h = this.H;
                m.c1(h, h, n + 1, n, p);
            }
            else {
                final Object[] h2 = this.H;
                m.c1(h2, h2, 1, 0, p);
                final Object[] h3 = this.H;
                h3[0] = h3[h3.length - 1];
                n = this.G;
                m.c1(h3, h3, n + 1, n, h3.length - 1);
            }
            final Object[] h4 = this.H;
            n = this.G;
            h4[n] = null;
            this.G = this.C(n);
        }
        else {
            n = v.G((List<?>)this);
            n = this.I(i(this) + n);
            final Object[] h5 = this.H;
            if (p <= n) {
                m.c1(h5, h5, p, p + 1, n + 1);
            }
            else {
                m.c1(h5, h5, p, p + 1, h5.length);
                final Object[] h6 = this.H;
                h6[h6.length - 1] = h6[0];
                m.c1(h6, h6, 0, 1, n + 1);
            }
            this.H[n] = null;
        }
        this.I = this.size() - 1;
        return (E)o;
    }
    
    public final E f1() {
        if (!this.isEmpty()) {
            return (E)h(this)[this.I(i(this) + v.G((List<?>)this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    @Override
    public E get(int p) {
        d.G.b(p, this.size());
        p = this.I(i(this) + p);
        return (E)h(this)[p];
    }
    
    @Override
    public int indexOf(final Object o) {
        final int p = this.I(i(this) + this.size());
        int i = this.G;
        if (i < p) {
            while (i < p) {
                if (k0.g(o, this.H[i])) {
                    return i - this.G;
                }
                ++i;
            }
            return -1;
        }
        if (i >= p) {
            while (i < this.H.length) {
                if (k0.g(o, this.H[i])) {
                    return i - this.G;
                }
                ++i;
            }
            for (int j = 0; j < p; ++j) {
                if (k0.g(o, this.H[j])) {
                    i = j + this.H.length;
                    return i - this.G;
                }
            }
            return -1;
        }
        return -1;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @Override
    public int lastIndexOf(final Object o) {
        int i = this.I(i(this) + this.size());
        final int g = this.G;
        if (g < i) {
            if (--i < g) {
                return -1;
            }
            while (!k0.g(o, this.H[i])) {
                if (i == g) {
                    return -1;
                }
                --i;
            }
        }
        else {
            if (g <= i) {
                return -1;
            }
            --i;
            while (i >= 0) {
                if (k0.g(o, this.H[i])) {
                    i += this.H.length;
                    return i - this.G;
                }
                --i;
            }
            i = m.Td(this.H);
            final int g2 = this.G;
            if (i < g2) {
                return -1;
            }
            while (!k0.g(o, this.H[i])) {
                if (i == g2) {
                    return -1;
                }
                --i;
            }
        }
        return i - this.G;
    }
    
    public final E o2() {
        if (!this.isEmpty()) {
            return (E)h(this)[this.G];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    @Override
    public boolean remove(final Object o) {
        final int index = this.indexOf(o);
        if (index == -1) {
            return false;
        }
        this.remove(index);
        return true;
    }
    
    @Override
    public boolean removeAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        boolean b2 = b;
        if (!empty) {
            if (h(this).length == 0) {
                b2 = b;
            }
            else {
                final int p = this.I(i(this) + this.size());
                int i = i(this);
                int n3;
                if (i(this) < p) {
                    int j = i(this);
                    n3 = i;
                    while (j < p) {
                        final Object o = h(this)[j];
                        if (collection.contains(o) ^ true) {
                            h(this)[n3] = o;
                            ++n3;
                        }
                        else {
                            n2 = 1;
                        }
                        ++j;
                    }
                    m.n2(h(this), null, n3, p);
                }
                else {
                    int k = i(this);
                    final int length = h(this).length;
                    n2 = 0;
                    while (k < length) {
                        final Object o2 = h(this)[k];
                        h(this)[k] = null;
                        if (collection.contains(o2) ^ true) {
                            h(this)[i] = o2;
                            ++i;
                        }
                        else {
                            n2 = 1;
                        }
                        ++k;
                    }
                    n3 = this.I(i);
                    for (int l = n; l < p; ++l) {
                        final Object o3 = h(this)[l];
                        h(this)[l] = null;
                        if (collection.contains(o3) ^ true) {
                            h(this)[n3] = o3;
                            n3 = this.C(n3);
                        }
                        else {
                            n2 = 1;
                        }
                    }
                }
                b2 = (n2 != 0);
                if (n2 != 0) {
                    t(this, this.H(n3 - i(this)));
                    b2 = (n2 != 0);
                }
            }
        }
        return b2;
    }
    
    public final E removeFirst() {
        if (!this.isEmpty()) {
            final Object o = h(this)[this.G];
            final Object[] h = this.H;
            final int g = this.G;
            h[g] = null;
            this.G = this.C(g);
            this.I = this.size() - 1;
            return (E)o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    public final E removeLast() {
        if (!this.isEmpty()) {
            final int p = this.I(i(this) + v.G((List<?>)this));
            final Object o = h(this)[p];
            this.H[p] = null;
            this.I = this.size() - 1;
            return (E)o;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }
    
    @Override
    public boolean retainAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "elements");
        final boolean empty = this.isEmpty();
        final int n = 0;
        final boolean b = false;
        int n2 = 0;
        boolean b2 = b;
        if (!empty) {
            if (h(this).length == 0) {
                b2 = b;
            }
            else {
                final int p = this.I(i(this) + this.size());
                int i = i(this);
                int n3;
                if (i(this) < p) {
                    int j = i(this);
                    n3 = i;
                    while (j < p) {
                        final Object o = h(this)[j];
                        if (collection.contains(o)) {
                            h(this)[n3] = o;
                            ++n3;
                        }
                        else {
                            n2 = 1;
                        }
                        ++j;
                    }
                    m.n2(h(this), null, n3, p);
                }
                else {
                    int k = i(this);
                    final int length = h(this).length;
                    n2 = 0;
                    while (k < length) {
                        final Object o2 = h(this)[k];
                        h(this)[k] = null;
                        if (collection.contains(o2)) {
                            h(this)[i] = o2;
                            ++i;
                        }
                        else {
                            n2 = 1;
                        }
                        ++k;
                    }
                    n3 = this.I(i);
                    for (int l = n; l < p; ++l) {
                        final Object o3 = h(this)[l];
                        h(this)[l] = null;
                        if (collection.contains(o3)) {
                            h(this)[n3] = o3;
                            n3 = this.C(n3);
                        }
                        else {
                            n2 = 1;
                        }
                    }
                }
                b2 = (n2 != 0);
                if (n2 != 0) {
                    t(this, this.H(n3 - i(this)));
                    b2 = (n2 != 0);
                }
            }
        }
        return b2;
    }
    
    @Override
    public E set(int p2, final E e) {
        d.G.b(p2, this.size());
        p2 = this.I(i(this) + p2);
        final Object o = h(this)[p2];
        this.H[p2] = e;
        return (E)o;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Object[] toArray() {
        return this.toArray(new Object[this.size()]);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public <T> T[] toArray(@org.jetbrains.annotations.e T[] a) {
        k0.p(a, "array");
        if (a.length < this.size()) {
            a = n.a(a, this.size());
        }
        Objects.requireNonNull(a, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        final int p = this.I(i(this) + this.size());
        final int g = this.G;
        if (g < p) {
            m.l1(this.H, a, 0, g, p, 2, null);
        }
        else if (this.isEmpty() ^ true) {
            final Object[] h = this.H;
            m.c1(h, a, 0, this.G, h.length);
            final Object[] h2 = this.H;
            m.c1(h2, a, h2.length - this.G, 0, p);
        }
        if (a.length > this.size()) {
            a[this.size()] = null;
        }
        return a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f" }, d2 = { "kotlin/collections/l$a", "", "", "oldCapacity", "minCapacity", "a", "(II)I", "defaultMinCapacity", "I", "", "emptyElementData", "[Ljava/lang/Object;", "maxArraySize", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final int a(int n, final int n2) {
            if ((n += n >> 1) - n2 < 0) {
                n = n2;
            }
            int n3 = n;
            if (n - 2147483639 > 0) {
                if (n2 > 2147483639) {
                    n3 = Integer.MAX_VALUE;
                }
                else {
                    n3 = 2147483639;
                }
            }
            return n3;
        }
    }
}
