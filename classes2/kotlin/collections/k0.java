// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.v;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import java.util.Collection;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;
import java.io.Serializable;
import java.util.Set;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\t\n\u0002\b\t\b\u00c0\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00060\u0003j\u0002`\u0004B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u0011\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0002H\u0096\u0002J\u0016\u0010\u0013\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0016J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0096\u0002R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\n8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lkotlin/collections/k0;", "", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "i", "other", "", "equals", "", "hashCode", "", "toString", "isEmpty", "element", "f", "", "elements", "containsAll", "", "iterator", "", "G", "J", "serialVersionUID", "h", "()I", "size", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class k0 implements Set, Serializable, a
{
    private static final long G = 3406603774387020532L;
    @e
    public static final k0 H;
    
    static {
        H = new k0();
    }
    
    private k0() {
    }
    
    private final Object i() {
        return k0.H;
    }
    
    @Override
    public boolean addAll(final Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean b(final Void void1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Void && this.f((Void)o);
    }
    
    @Override
    public boolean containsAll(@e final Collection collection) {
        kotlin.jvm.internal.k0.p(collection, "elements");
        return collection.isEmpty();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof Set && ((Set)o).isEmpty();
    }
    
    public boolean f(@e final Void void1) {
        kotlin.jvm.internal.k0.p(void1, "element");
        return false;
    }
    
    public int h() {
        return 0;
    }
    
    @Override
    public int hashCode() {
        return 0;
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
        return this.h();
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
