// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import m6.g;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u0001H\u0086\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u001a\"\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0003\u001a(\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\t¨\u0006\u000b" }, d2 = { "A", "B", "that", "Lkotlin/s0;", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/s0;", "T", "", "b", "Lkotlin/m1;", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "TuplesKt")
public final class n1
{
    @e
    public static final <A, B> s0<A, B> a(final A a, final B b) {
        return new s0<A, B>(a, b);
    }
    
    @e
    public static final <T> List<T> b(@e final s0<? extends T, ? extends T> s0) {
        k0.p(s0, "$this$toList");
        return v.L(s0.e(), s0.f());
    }
    
    @e
    public static final <T> List<T> c(@e final m1<? extends T, ? extends T, ? extends T> m1) {
        k0.p(m1, "$this$toList");
        return v.L(m1.f(), m1.g(), m1.h());
    }
}
