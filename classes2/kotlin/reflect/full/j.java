// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.full;

import kotlin.reflect.r;
import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.reflect.jvm.internal.u;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.q;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0000H\u0007\u001a1\u0010\u0006\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0003*\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00042\u0006\u0010\u0005\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lkotlin/reflect/q;", "", "a", "D", "Lkotlin/reflect/r;", "receiver", "b", "(Lkotlin/reflect/r;Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
@g(name = "KProperties")
public final class j
{
    @e1(version = "1.1")
    @f
    public static final Object a(@e final q<?, ?> q) {
        k0.p(q, "$this$getExtensionDelegate");
        return q.o(u.R.a());
    }
    
    @e1(version = "1.1")
    @f
    public static final <D> Object b(@e final r<D, ?, ?> r, final D n) {
        k0.p(r, "$this$getExtensionDelegate");
        return r.c0(n, u.R.a());
    }
}
