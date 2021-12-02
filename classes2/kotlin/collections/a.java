// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.m0;
import n6.l;
import java.util.Objects;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.e;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.e1;
import kotlin.Metadata;
import java.util.Collection;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\t\b\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H¦\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u0017\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\b\u0001\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b" }, d2 = { "Lkotlin/collections/a;", "E", "", "", "iterator", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "isEmpty", "", "toString", "", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "b", "()I", "size", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class a<E> implements Collection<E>, o6.a
{
    protected a() {
    }
    
    @Override
    public boolean add(final E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean addAll(final Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public abstract int b();
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean contains(final Object o) {
        final boolean empty = this.isEmpty();
        final boolean b = false;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator = (Iterator<Object>)this.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (!k0.g(iterator.next(), o));
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public boolean containsAll(@e final Collection<?> collection) {
        k0.p(collection, "elements");
        final boolean empty = collection.isEmpty();
        final boolean b = true;
        boolean b2;
        if (empty) {
            b2 = b;
        }
        else {
            final Iterator<Object> iterator = collection.iterator();
            do {
                b2 = b;
                if (iterator.hasNext()) {
                    continue;
                }
                return b2;
            } while (this.contains(iterator.next()));
            b2 = false;
        }
        return b2;
    }
    
    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }
    
    @e
    @Override
    public abstract Iterator<E> iterator();
    
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
        return this.b();
    }
    
    @e
    @Override
    public Object[] toArray() {
        return v.a(this);
    }
    
    @e
    @Override
    public <T> T[] toArray(@e final T[] array) {
        k0.p(array, "array");
        final Object[] b = v.b(this, array);
        Objects.requireNonNull(b, "null cannot be cast to non-null type kotlin.Array<T>");
        return (T[])b;
    }
    
    @e
    @Override
    public String toString() {
        return kotlin.collections.v.Z2(this, ", ", "[", "]", 0, null, new l<E, CharSequence>() {
            final /* synthetic */ a G;
            
            @e
            public final CharSequence a(final E obj) {
                String value;
                if (obj == this.G) {
                    value = "(this Collection)";
                }
                else {
                    value = String.valueOf(obj);
                }
                return value;
            }
        }, 24, null);
    }
}
