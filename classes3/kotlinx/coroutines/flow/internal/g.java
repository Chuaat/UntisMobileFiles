// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.q1;
import kotlinx.coroutines.internal.p0;
import kotlin.coroutines.d;
import n6.p;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.channels.n;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u001a]\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\rH\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "T", "Lkotlinx/coroutines/flow/i;", "Lkotlinx/coroutines/flow/internal/f;", "b", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/g;", "emitContext", "e", "V", "newContext", "value", "", "countOrElement", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "block", "c", "(Lkotlin/coroutines/g;Ljava/lang/Object;Ljava/lang/Object;Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class g
{
    @e
    public static final <T> f<T> b(@e final i<? extends T> i) {
        f<T> f;
        if (!(i instanceof f)) {
            f = null;
        }
        else {
            f = (f<T>)i;
        }
        final f<T> f2 = f;
        f<T> f3;
        if (f2 != null) {
            f3 = f2;
        }
        else {
            f3 = (f<T>)new kotlinx.coroutines.flow.internal.j(i, null, 0, null, 14, null);
        }
        return f3;
    }
    
    @org.jetbrains.annotations.f
    public static final <T, V> Object c(@e final kotlin.coroutines.g g, final V v, @e Object c, @e final p<? super V, ? super d<? super T>, ?> p5, @e final d<? super T> d) {
        c = p0.c(g, c);
        try {
            final b0 b0 = new b0(d, g);
            if (p5 != null) {
                final Object invoke = ((p)q1.q((Object)p5, 2)).invoke((Object)v, (Object)b0);
                p0.a(g, c);
                if (invoke == b.h()) {
                    h.c((d)d);
                }
                return invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        }
        finally {
            p0.a(g, c);
        }
    }
    
    private static final <T> j<T> e(j<? super T> c0, final kotlin.coroutines.g g) {
        if (!(c0 instanceof a0)) {
            if (!(c0 instanceof v)) {
                c0 = new c0<Object>((j<? super Object>)c0, g);
            }
        }
        return (j<T>)c0;
    }
}
