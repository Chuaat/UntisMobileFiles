// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;
import java.util.Map;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001d\b\u0000\u0012\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0016¢\u0006\u0004\b \u0010!J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u001c\u0010\t\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001c\u0010\f\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\"\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\u001c\u0010\u0010\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016J\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0011H\u0096\u0002J\"\u0010\u0013\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0014\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016J\"\u0010\u0015\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\rH\u0016R%\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"" }, d2 = { "Lkotlin/collections/builders/e;", "K", "V", "Lkotlin/collections/builders/a;", "", "", "isEmpty", "", "element", "h", "Lkotlin/j2;", "clear", "k", "", "elements", "addAll", "i", "", "iterator", "containsAll", "removeAll", "retainAll", "Lkotlin/collections/builders/d;", "G", "Lkotlin/collections/builders/d;", "n", "()Lkotlin/collections/builders/d;", "backing", "", "b", "()I", "size", "<init>", "(Lkotlin/collections/builders/d;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class e<K, V> extends a<Map.Entry<K, V>, K, V>
{
    @org.jetbrains.annotations.e
    private final d<K, V> G;
    
    public e(@org.jetbrains.annotations.e final d<K, V> g) {
        k0.p(g, "backing");
        this.G = g;
    }
    
    @Override
    public boolean addAll(@org.jetbrains.annotations.e final Collection<? extends Map.Entry<K, V>> collection) {
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
    public boolean containsAll(@org.jetbrains.annotations.e final Collection<?> collection) {
        k0.p(collection, "elements");
        return this.G.s(collection);
    }
    
    @Override
    public boolean h(@org.jetbrains.annotations.e final Map.Entry<? extends K, ? extends V> entry) {
        k0.p(entry, "element");
        return this.G.t(entry);
    }
    
    public boolean i(@org.jetbrains.annotations.e final Map.Entry entry) {
        k0.p(entry, "element");
        return this.G.M(entry);
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @org.jetbrains.annotations.e
    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return this.G.x();
    }
    
    public boolean k(@org.jetbrains.annotations.e final Map.Entry<K, V> entry) {
        k0.p(entry, "element");
        throw new UnsupportedOperationException();
    }
    
    @org.jetbrains.annotations.e
    public final d<K, V> n() {
        return this.G;
    }
    
    @Override
    public boolean removeAll(@org.jetbrains.annotations.e final Collection<?> c) {
        k0.p(c, "elements");
        this.G.q();
        return super.removeAll(c);
    }
    
    @Override
    public boolean retainAll(@org.jetbrains.annotations.e final Collection<?> c) {
        k0.p(c, "elements");
        this.G.q();
        return super.retainAll(c);
    }
}
