// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.jvm.internal.k0;
import java.util.Iterator;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;
import java.util.Set;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b'\u0018\u0000 \f*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\rB\t\b\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e" }, d2 = { "Lkotlin/collections/j;", "E", "Lkotlin/collections/a;", "", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "G", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public abstract class j<E> extends kotlin.collections.a<E> implements Set<E>, o6.a
{
    @e
    public static final a G;
    
    static {
        G = new a(null);
    }
    
    protected j() {
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o == this || (o instanceof Set && j.G.a(this, (Set<?>)o));
    }
    
    @Override
    public int hashCode() {
        return j.G.b(this);
    }
    
    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\n\u001a\u00020\t2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00072\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "kotlin/collections/j$a", "", "", "c", "", "b", "(Ljava/util/Collection;)I", "", "other", "", "a", "(Ljava/util/Set;Ljava/util/Set;)Z", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        public final boolean a(@e final Set<?> set, @e final Set<?> set2) {
            k0.p(set, "c");
            k0.p(set2, "other");
            return set.size() == set2.size() && set.containsAll(set2);
        }
        
        public final int b(@e final Collection<?> collection) {
            k0.p(collection, "c");
            final Iterator<?> iterator = collection.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Object next = iterator.next();
                int hashCode;
                if (next != null) {
                    hashCode = next.hashCode();
                }
                else {
                    hashCode = 0;
                }
                n += hashCode;
            }
            return n;
        }
    }
}
