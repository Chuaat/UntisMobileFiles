// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.reflect.l;
import kotlin.reflect.k;
import kotlin.reflect.q;
import kotlin.internal.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.o;
import kotlin.reflect.p;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a6\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0087\n¢\u0006\u0004\b\u0006\u0010\u0007\u001a>\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00028\u0000H\u0087\n¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\u000f\u001a\u00028\u0001\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e2\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0087\n¢\u0006\u0004\b\u000f\u0010\u0010\u001aH\u0010\u0012\u001a\u00020\n\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u0003\u001a\u00028\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\t\u001a\u00028\u0001H\u0087\n¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "V", "Lkotlin/reflect/p;", "", "thisRef", "Lkotlin/reflect/o;", "property", "a", "(Lkotlin/reflect/p;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "Lkotlin/reflect/k;", "value", "Lkotlin/j2;", "c", "(Lkotlin/reflect/k;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "T", "Lkotlin/reflect/q;", "b", "(Lkotlin/reflect/q;Ljava/lang/Object;Lkotlin/reflect/o;)Ljava/lang/Object;", "Lkotlin/reflect/l;", "d", "(Lkotlin/reflect/l;Ljava/lang/Object;Lkotlin/reflect/o;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class x0
{
    @e1(version = "1.4")
    @f
    private static final <V> V a(final p<? extends V> p3, final Object o, final o<?> o2) {
        k0.p(p3, "$this$getValue");
        return (V)p3.get();
    }
    
    @e1(version = "1.4")
    @f
    private static final <T, V> V b(final q<T, ? extends V> q, final T t, final o<?> o) {
        k0.p(q, "$this$getValue");
        return (V)q.get(t);
    }
    
    @e1(version = "1.4")
    @f
    private static final <V> void c(final k<V> k, final Object o, final o<?> o2, final V v) {
        k0.p(k, "$this$setValue");
        k.set(v);
    }
    
    @e1(version = "1.4")
    @f
    private static final <T, V> void d(final l<T, V> l, final T t, final o<?> o, final V v) {
        k0.p(l, "$this$setValue");
        l.d(t, v);
    }
}
