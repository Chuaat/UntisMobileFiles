// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.collections;

import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.o;
import java.util.Map;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\t\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0015\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0087\n¢\u0006\u0004\b\t\u0010\n\u001aO\u0010\f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0001*\u00028\u0000*\u0017\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u000b\b\u0001\u0012\u00078\u0000¢\u0006\u0002\b\u00040\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0087\n¢\u0006\u0004\b\f\u0010\n\u001aH\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0000*\u0012\u0012\u0006\b\u0000\u0012\u00020\u0003\u0012\u0006\b\u0000\u0012\u00028\u00000\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u00072\u0006\u0010\r\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011" }, d2 = { "V", "V1", "", "", "Lkotlin/internal/d;", "", "thisRef", "Lkotlin/reflect/o;", "property", "a", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "", "b", "value", "Lkotlin/j2;", "c", "(Ljava/util/Map;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "MapAccessorsKt")
public final class v0
{
    @f
    private static final <V, V1 extends V> V1 a(final Map<? super String, ? extends V> map, final Object o, final o<?> o2) {
        k0.p(map, "$this$getValue");
        return z0.a((Map<String, ? extends V1>)map, o2.getName());
    }
    
    @f
    @g(name = "getVar")
    private static final <V, V1 extends V> V1 b(final Map<? super String, ? extends V> map, final Object o, final o<?> o2) {
        k0.p(map, "$this$getValue");
        return z0.a((Map<String, ? extends V1>)map, o2.getName());
    }
    
    @f
    private static final <V> void c(final Map<? super String, ? super V> map, final Object o, final o<?> o2, final V v) {
        k0.p(map, "$this$setValue");
        map.put(o2.getName(), v);
    }
}
