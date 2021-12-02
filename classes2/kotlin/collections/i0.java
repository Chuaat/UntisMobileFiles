// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.v;
import java.util.ListIterator;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.util.RandomAccess;
import java.io.Serializable;
import java.util.List;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010(\n\u0000\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\t\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u0006B\t\b\u0002¢\u0006\u0004\b(\u0010)J\b\u0010\b\u001a\u00020\u0007H\u0002J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\nH\u0016J\u0011\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0015\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016J\u0011\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\fH\u0096\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0002H\u0016J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0096\u0002J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0016J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\fH\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006*" }, d2 = { "Lkotlin/collections/i0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "", "p", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "element", "h", "", "elements", "containsAll", "index", "i", "n", "o", "", "iterator", "", "listIterator", "fromIndex", "toIndex", "subList", "", "G", "J", "serialVersionUID", "k", "()I", "size", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class i0 implements List, Serializable, RandomAccess, a
{
    private static final long G = -7390468764508069838L;
    @e
    public static final i0 H;
    
    static {
        H = new i0();
    }
    
    private i0() {
    }
    
    private final Object p() {
        return i0.H;
    }
    
    @Override
    public boolean addAll(final int n, final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public void b(final int n, final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Void && this.h((Void)o);
    }
    
    @Override
    public boolean containsAll(@e final Collection collection) {
        k0.p(collection, "elements");
        return collection.isEmpty();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof List && ((List)o).isEmpty();
    }
    
    public boolean f(final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean h(@e final Void void1) {
        k0.p(void1, "element");
        return false;
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
    
    @e
    public Void i(final int i) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Empty list doesn't contain element at index ");
        sb.append(i);
        sb.append('.');
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public final /* bridge */ int indexOf(final Object o) {
        if (o instanceof Void) {
            return this.n((Void)o);
        }
        return -1;
    }
    
    @Override
    public boolean isEmpty() {
        return true;
    }
    
    @e
    @Override
    public Iterator iterator() {
        return h0.G;
    }
    
    public int k() {
        return 0;
    }
    
    @Override
    public final /* bridge */ int lastIndexOf(final Object o) {
        if (o instanceof Void) {
            return this.o((Void)o);
        }
        return -1;
    }
    
    @e
    @Override
    public ListIterator listIterator() {
        return h0.G;
    }
    
    @e
    @Override
    public ListIterator listIterator(final int i) {
        if (i == 0) {
            return h0.G;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Index: ");
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public int n(@e final Void void1) {
        k0.p(void1, "element");
        return -1;
    }
    
    public int o(@e final Void void1) {
        k0.p(void1, "element");
        return -1;
    }
    
    public Void q(final int n) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public Void r(final int n, final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean removeAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean retainAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.k();
    }
    
    @e
    @Override
    public List subList(final int i, final int j) {
        if (i == 0 && j == 0) {
            return this;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("fromIndex: ");
        sb.append(i);
        sb.append(", toIndex: ");
        sb.append(j);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @Override
    public Object[] toArray() {
        return v.a(this);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        return (T[])v.b(this, array);
    }
    
    @e
    @Override
    public String toString() {
        return "[]";
    }
}
