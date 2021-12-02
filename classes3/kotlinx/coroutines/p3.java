// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.jvm.internal.h;
import kotlinx.coroutines.internal.g0;
import c7.b;
import kotlin.coroutines.d;
import n6.p;
import m6.g;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.e;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000\u001a\u001b\u0010\u0004\u001a\u00020\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001aO\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062'\u0010\f\u001a#\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\u0002\b\u000bH\u0086@\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lkotlinx/coroutines/k2;", "parent", "Lkotlinx/coroutines/b0;", "a", "b", "(Lkotlinx/coroutines/k2;)Lkotlinx/coroutines/k2;", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "e", "(Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class p3
{
    @e
    public static final b0 a(@f final k2 k2) {
        return new o3(k2);
    }
    
    @f
    public static final <R> Object e(@e final p<? super r0, ? super d<? super R>, ?> p2, @e final d<? super R> d) {
        final n3<Object> n3 = new n3<Object>(d.getContext(), (kotlin.coroutines.d<? super Object>)d);
        final Object f = b.f((g0<? super Object>)n3, n3, (n6.p<? super n3<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
        if (f == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return f;
    }
}
