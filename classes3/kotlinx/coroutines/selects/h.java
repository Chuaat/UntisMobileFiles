// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b" }, d2 = { "R", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "Lkotlin/j2;", "Lkotlin/s;", "builder", "a", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class h
{
    @f
    public static final <R> Object a(@e final l<? super a<? super R>, j2> l, @e final d<? super R> d) {
        final j j = new j((d<? super R>)d);
        try {
            l.invoke((Object)j);
        }
        finally {
            final Throwable t;
            j.d(t);
        }
        final Object e = j.e();
        if (e == b.h()) {
            kotlin.coroutines.jvm.internal.h.c((d)d);
        }
        return e;
    }
    
    @f
    private static final Object b(@e final l l, @e final d d) {
        h0.e(0);
        final j j = new j((d<? super R>)d);
        try {
            l.invoke((Object)j);
        }
        finally {
            final Throwable t;
            j.d(t);
        }
        final Object e = j.e();
        if (e == b.h()) {
            kotlin.coroutines.jvm.internal.h.c(d);
        }
        h0.e(1);
        return e;
    }
}
