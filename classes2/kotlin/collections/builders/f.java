// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.h;
import java.util.Set;
import kotlin.collections.i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\n\u001a\u00020\tH\u0016J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0096\u0002J\u0016\u0010\u0012\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016J\u0016\u0010\u0013\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016R\u0016\u0010\u0017\u001a\u00020\u00148V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e" }, d2 = { "Lkotlin/collections/builders/f;", "E", "", "Lkotlin/collections/i;", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/j2;", "clear", "add", "", "elements", "addAll", "remove", "", "iterator", "removeAll", "retainAll", "", "b", "()I", "size", "Lkotlin/collections/builders/d;", "G", "Lkotlin/collections/builders/d;", "backing", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class f<E> extends i<E> implements Set<E>, h
{
    private final d<E, ?> G;
    
    public f(@e final d<E, ?> g) {
        k0.p(g, "backing");
        this.G = g;
    }
    
    @Override
    public boolean add(final E e) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean addAll(@e final Collection<? extends E> collection) {
        k0.p(collection, "elements");
        throw new UnsupportedOperationException();
    }
    
    @Override
    public int b() {
        return this.G.size();
    }
    
    @Override
    public void clear() {
        this.G.clear();
    }
    
    @Override
    public boolean contains(final Object o) {
        return this.G.containsKey(o);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @e
    @Override
    public Iterator<E> iterator() {
        return this.G.H();
    }
    
    @Override
    public boolean remove(final Object o) {
        return this.G.O((E)o) >= 0;
    }
    
    @Override
    public boolean removeAll(@e final Collection<?> c) {
        k0.p(c, "elements");
        this.G.q();
        return super.removeAll(c);
    }
    
    @Override
    public boolean retainAll(@e final Collection<?> c) {
        k0.p(c, "elements");
        this.G.q();
        return super.retainAll(c);
    }
}
