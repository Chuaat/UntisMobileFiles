// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.util.NoSuchElementException;
import kotlin.collections.x1;
import kotlin.jvm.internal.v;
import kotlin.collections.m;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import m6.e;
import o6.a;
import java.util.Collection;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\r\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0014\b\u0001\u0012\u0006\u0010%\u001a\u00020 \u00f8\u0001\u0000¢\u0006\u0004\b(\u0010)B\u0014\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0086\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010%\u001a\u00020 8\u0000@\u0001X\u0081\u0004¢\u0006\f\n\u0004\b!\u0010\"\u0012\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001b\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006-" }, d2 = { "Lkotlin/f2;", "", "Lkotlin/e2;", "", "index", "r", "([SI)S", "value", "Lkotlin/j2;", "B", "([SIS)V", "", "A", "([S)Ljava/util/Iterator;", "element", "", "n", "([SS)Z", "elements", "o", "([SLjava/util/Collection;)Z", "z", "([S)Z", "", "C", "([S)Ljava/lang/String;", "x", "([S)I", "", "other", "p", "([SLjava/lang/Object;)Z", "", "G", "[S", "getStorage$annotations", "()V", "storage", "v", "size", "i", "([S)[S", "h", "(I)[S", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e
@e1(version = "1.3")
@r
public final class f2 implements Collection<e2>, o6.a
{
    @org.jetbrains.annotations.e
    private final short[] G = g;
    
    @org.jetbrains.annotations.e
    public static Iterator<e2> A(final short[] array) {
        return new a(array);
    }
    
    public static final void B(final short[] array, final int n, final short n2) {
        array[n] = n2;
    }
    
    public static String C(final short[] a) {
        final StringBuilder sb = new StringBuilder();
        sb.append("UShortArray(storage=");
        sb.append(Arrays.toString(a));
        sb.append(")");
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    public static short[] h(final int n) {
        return i(new short[n]);
    }
    
    @y0
    @org.jetbrains.annotations.e
    public static short[] i(@org.jetbrains.annotations.e final short[] array) {
        k0.p(array, "storage");
        return array;
    }
    
    public static boolean n(final short[] array, final short n) {
        return m.Q7(array, n);
    }
    
    public static boolean o(final short[] array, @org.jetbrains.annotations.e final Collection<e2> collection) {
        k0.p(collection, "elements");
        final boolean empty = collection.isEmpty();
        boolean b = false;
        if (!empty) {
            for (final e2 next : collection) {
                if (!(next instanceof e2) || !m.Q7(array, next.O0())) {
                    return b;
                }
            }
        }
        b = true;
        return b;
    }
    
    public static boolean p(final short[] array, final Object o) {
        return o instanceof f2 && k0.g(array, ((f2)o).D());
    }
    
    public static final boolean q(final short[] array, final short[] array2) {
        return k0.g(array, array2);
    }
    
    public static final short r(final short[] array, final int n) {
        return e2.k(array[n]);
    }
    
    public static int v(final short[] array) {
        return array.length;
    }
    
    public static int x(final short[] a) {
        int hashCode;
        if (a != null) {
            hashCode = Arrays.hashCode(a);
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    public static boolean z(final short[] array) {
        return array.length == 0;
    }
    
    public final /* synthetic */ short[] D() {
        return this.G;
    }
    
    @Override
    public boolean addAll(final Collection<? extends e2> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean b(final short n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof e2 && this.k(((e2)o).O0());
    }
    
    @Override
    public boolean containsAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        return o(this.G, (Collection<e2>)collection);
    }
    
    @Override
    public boolean equals(final Object o) {
        return p(this.G, o);
    }
    
    @Override
    public int hashCode() {
        return x(this.G);
    }
    
    @Override
    public boolean isEmpty() {
        return z(this.G);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Iterator<e2> iterator() {
        return A(this.G);
    }
    
    public boolean k(final short n) {
        return n(this.G, n);
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.t();
    }
    
    public int t() {
        return v(this.G);
    }
    
    @Override
    public Object[] toArray() {
        return v.a(this);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        return (T[])v.b(this, array);
    }
    
    @Override
    public String toString() {
        return C(this.G);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0002J\u0015\u0010\u0005\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0011" }, d2 = { "kotlin/f2$a", "Lkotlin/collections/x1;", "", "hasNext", "Lkotlin/e2;", "b", "()S", "", "H", "[S", "array", "", "G", "I", "index", "<init>", "([S)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a extends x1
    {
        private int G;
        private final short[] H;
        
        public a(@org.jetbrains.annotations.e final short[] h) {
            k0.p(h, "array");
            this.H = h;
        }
        
        @Override
        public short b() {
            final int g = this.G;
            final short[] h = this.H;
            if (g < h.length) {
                this.G = g + 1;
                return e2.k(h[g]);
            }
            throw new NoSuchElementException(String.valueOf(this.G));
        }
        
        @Override
        public boolean hasNext() {
            return this.G < this.H.length;
        }
    }
}
