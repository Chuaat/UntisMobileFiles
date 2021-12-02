// 
// Decompiled by Procyon v0.5.36
// 

package t6;

import kotlin.jvm.internal.v;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Set;
import o6.a;
import java.util.Collection;

public class c implements Collection<b>, a
{
    @e
    private final Set<b> G;
    
    @Override
    public boolean addAll(final Collection<? extends b> collection) {
        k0.p((Object)collection, "elements");
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public boolean b(final b b) {
        k0.p((Object)b, "element");
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof b && this.f((b)o);
    }
    
    @Override
    public boolean containsAll(@e final Collection<?> collection) {
        k0.p((Object)collection, "elements");
        return this.G.containsAll(collection);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return this == o || (o instanceof c && k0.g((Object)this.G, (Object)((c)o).G));
    }
    
    public boolean f(@e final b b) {
        k0.p((Object)b, "element");
        return this.G.contains(b);
    }
    
    @e
    public final Set<b> h() {
        return this.G;
    }
    
    @Override
    public int hashCode() {
        return this.G.hashCode();
    }
    
    public int i() {
        return this.G.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.G.isEmpty();
    }
    
    @e
    @Override
    public Iterator<b> iterator() {
        return this.G.iterator();
    }
    
    @Override
    public boolean remove(final Object o) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean removeAll(final Collection<?> collection) {
        k0.p((Object)collection, "elements");
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean retainAll(final Collection<?> collection) {
        k0.p((Object)collection, "elements");
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.i();
    }
    
    @Override
    public Object[] toArray() {
        return v.a((Collection)this);
    }
    
    @Override
    public <T> T[] toArray(final T[] array) {
        k0.p((Object)array, "array");
        return (T[])v.b((Collection)this, (Object[])array);
    }
    
    @e
    @Override
    public String toString() {
        return t6.a.a(this);
    }
}
