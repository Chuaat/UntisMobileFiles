// 
// Decompiled by Procyon v0.5.36
// 

package androidx.collection;

import kotlin.jvm.internal.k0;
import kotlin.s0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001H\u0086\b\u001aQ\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012*\u0010\u0006\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00050\u0004\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "K", "V", "Landroidx/collection/a;", "a", "", "Lkotlin/s0;", "pairs", "b", "([Lkotlin/s0;)Landroidx/collection/a;", "collection-ktx" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final <K, V> a<K, V> a() {
        return new a<K, V>();
    }
    
    @e
    public static final <K, V> a<K, V> b(@e final s0<? extends K, ? extends V>... array) {
        k0.q((Object)array, "pairs");
        final a<K, V> a = new a<K, V>(array.length);
        for (final s0<? extends K, ? extends V> s0 : array) {
            a.put((K)s0.e(), (V)s0.f());
        }
        return a;
    }
}
