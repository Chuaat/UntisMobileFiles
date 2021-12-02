// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import n6.l;
import m6.g;
import kotlin.y0;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\u001a3\u0010\u0004\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001aQ\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006\u001aZ\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000b2!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00028\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e" }, d2 = { "K", "V", "", "key", "a", "(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "defaultValue", "b", "", "c", "(Ljava/util/Map;Ln6/l;)Ljava/util/Map;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/collections/MapsKt")
class z0
{
    public z0() {
    }
    
    @y0
    @g(name = "getOrImplicitDefaultNullable")
    public static final <K, V> V a(@e final Map<K, ? extends V> map, final K obj) {
        k0.p(map, "$this$getOrImplicitDefault");
        if (map instanceof w0) {
            return ((w0<K, V>)map).m(obj);
        }
        final Object value = map.get(obj);
        if (value == null && !map.containsKey(obj)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Key ");
            sb.append(obj);
            sb.append(" is missing in the map.");
            throw new NoSuchElementException(sb.toString());
        }
        return (V)value;
    }
    
    @e
    public static final <K, V> Map<K, V> b(@e final Map<K, ? extends V> map, @e final l<? super K, ? extends V> l) {
        k0.p(map, "$this$withDefault");
        k0.p(l, "defaultValue");
        Object b;
        if (map instanceof w0) {
            b = b((Map<Object, ?>)((w0<K, ? extends V>)map).l(), (l<? super Object, ?>)l);
        }
        else {
            b = new x0<K, V>((Map<Object, ?>)map, (l<? super Object, ?>)l);
        }
        return (Map<K, V>)b;
    }
    
    @g(name = "withDefaultMutable")
    @e
    public static final <K, V> Map<K, V> c(@e final Map<K, V> map, @e final l<? super K, ? extends V> l) {
        k0.p(map, "$this$withDefault");
        k0.p(l, "defaultValue");
        Object c;
        if (map instanceof e1) {
            c = c((Map<Object, Object>)((e1<K, V>)map).l(), (l<? super Object, ?>)l);
        }
        else {
            c = new f1<K, V>((Map<Object, Object>)map, (l<? super Object, ?>)l);
        }
        return (Map<K, V>)c;
    }
}
