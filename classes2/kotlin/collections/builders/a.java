// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections.builders;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.collections.i;
import java.util.Map;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b \u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\n\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¨\u0006\r" }, d2 = { "Lkotlin/collections/builders/a;", "", "E", "K", "V", "Lkotlin/collections/i;", "element", "", "f", "(Ljava/util/Map$Entry;)Z", "h", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends i<E>
{
    @Override
    public final /* bridge */ boolean contains(final Object o) {
        return o instanceof Map.Entry && this.f((E)o);
    }
    
    public final boolean f(@e final E e) {
        k0.p(e, "element");
        return this.h(e);
    }
    
    public abstract boolean h(@e final Map.Entry<? extends K, ? extends V> p0);
    
    public /* bridge */ boolean i(final Map.Entry o) {
        return super.remove(o);
    }
    
    @Override
    public final /* bridge */ boolean remove(final Object o) {
        return o instanceof Map.Entry && this.i((Map.Entry)o);
    }
}
