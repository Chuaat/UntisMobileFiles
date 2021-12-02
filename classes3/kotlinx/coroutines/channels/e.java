// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.coroutines.i;
import kotlinx.coroutines.b3;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.f;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.r0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000P\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u009e\u0001\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062-\b\u0002\u0010\u000f\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r\u0018\u00010\bj\u0004\u0018\u0001`\u000e2-\u0010\u0015\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0010¢\u0006\u0002\b\u0014H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019" }, d2 = { "E", "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "", "capacity", "Lkotlinx/coroutines/u0;", "start", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "Lkotlinx/coroutines/CompletionHandler;", "onCompletion", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/f;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "Lkotlinx/coroutines/channels/l0;", "a", "(Lkotlinx/coroutines/r0;Lkotlin/coroutines/g;ILkotlinx/coroutines/u0;Ln6/l;Ln6/p;)Lkotlinx/coroutines/channels/l0;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class e
{
    @b3
    @org.jetbrains.annotations.e
    public static final <E> l0<E> a(@org.jetbrains.annotations.e final r0 r0, @org.jetbrains.annotations.e g d, final int n, @org.jetbrains.annotations.e final u0 u0, @f final l<? super Throwable, j2> l, @org.jetbrains.annotations.e final p<? super kotlinx.coroutines.channels.f<E>, ? super d<? super j2>, ?> p6) {
        d = kotlinx.coroutines.l0.d(r0, d);
        final o d2 = r.d(n, null, null, 6, null);
        kotlinx.coroutines.channels.d d3;
        if (u0.f()) {
            d3 = new a0<Object>(d, d2, p6);
        }
        else {
            d3 = new kotlinx.coroutines.channels.d<Object>(d, d2, true);
        }
        if (l != null) {
            d3.N(l);
        }
        d3.x1(u0, (kotlinx.coroutines.channels.d<Object>)d3, (n6.p<? super kotlinx.coroutines.channels.d<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p6);
        return (l0<E>)d3;
    }
}
