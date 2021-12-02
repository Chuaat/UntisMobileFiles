// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.util.Set;
import kotlin.collections.i;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010)\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\b\u0000\u0012\u0010\u0010\u001d\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001e\u0010\u001fB\t\b\u0016¢\u0006\u0004\b\u001e\u0010 B\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\"J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0016J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0002J\u0016\u0010\u0013\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J\u0016\u0010\u0015\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016R\u0016\u0010\u0019\u001a\u00020\u00168V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006#" }, d2 = { "Lkotlin/collections/builders/h;", "E", "", "Lkotlin/collections/i;", "", "f", "", "isEmpty", "element", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/j2;", "clear", "add", "remove", "", "iterator", "", "elements", "addAll", "removeAll", "retainAll", "", "b", "()I", "size", "Lkotlin/collections/builders/d;", "G", "Lkotlin/collections/builders/d;", "backing", "<init>", "(Lkotlin/collections/builders/d;)V", "()V", "initialCapacity", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class h<E> extends i<E> implements Set<E>, o6.h
{
    private final d<E, ?> G;
    
    public h() {
        this((d)new d());
    }
    
    public h(final int n) {
        this((d)new d(n));
    }
    
    public h(@e final d<E, ?> g) {
        k0.p(g, "backing");
        this.G = g;
    }
    
    @Override
    public boolean add(final E e) {
        return this.G.n(e) >= 0;
    }
    
    @Override
    public boolean addAll(@e final Collection<? extends E> c) {
        k0.p(c, "elements");
        this.G.q();
        return super.addAll(c);
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
    
    @e
    public final Set<E> f() {
        this.G.p();
        return this;
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
