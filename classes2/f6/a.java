// 
// Decompiled by Procyon v0.5.36
// 

package f6;

import kotlin.jvm.internal.q1;
import kotlin.internal.f;
import kotlin.e1;
import java.util.Objects;
import java.util.Map;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aC\u0010\u0006\u001a\u00028\u0001\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000\"\u0004\b\u0001\u0010\u0002*\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u0006\u0010\u0007\u001aJ\u0010\u000b\u001a\u00020\n\"\t\b\u0000\u0010\u0001¢\u0006\u0002\b\u0000\"\t\b\u0001\u0010\u0002¢\u0006\u0002\b\u0000*\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\b2\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0087\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r" }, d2 = { "Lkotlin/internal/i;", "K", "V", "", "key", "defaultValue", "a", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "value", "", "b", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Z", "kotlin-stdlib-jdk8" }, k = 2, mv = { 1, 5, 1 }, pn = "kotlin.collections")
@g(name = "CollectionsJDK8Kt")
public final class a
{
    @e1(version = "1.2")
    @f
    private static final <K, V> V a(final Map<? extends K, ? extends V> obj, final K key, final V defaultValue) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return (V)obj.getOrDefault((Object)key, (V)defaultValue);
    }
    
    @e1(version = "1.2")
    @f
    private static final <K, V> boolean b(final Map<? extends K, ? extends V> obj, final K key, final V value) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.collections.MutableMap<K, V>");
        return q1.k(obj).remove(key, value);
    }
}
