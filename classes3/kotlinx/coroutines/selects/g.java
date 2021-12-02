// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.j2;
import kotlinx.coroutines.z1;
import kotlin.time.j;
import kotlinx.coroutines.d1;
import kotlin.coroutines.d;
import n6.l;
import kotlinx.coroutines.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u001aN\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001c\u0010\u0007\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001f\b\u0004\u0010\f\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\u0002\b\u000bH\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\r\u0010\u000e\"\u001c\u0010\u0014\u001a\u00020\u000f8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\"\"\u0010\u001a\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018\"\u001c\u0010\u001d\u001a\u00020\u00068\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u0012\u0004\b\u001c\u0010\u0013\"\"\u0010!\u001a\u00020\u00068\u0000@\u0001X\u0081\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u0016\u0012\u0004\b \u0010\u0013\u001a\u0004\b\u001f\u0010\u0018\"\u001c\u0010#\u001a\u00020\u00068\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u0012\u0004\b\"\u0010\u0013\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$" }, d2 = { "R", "Lkotlinx/coroutines/selects/a;", "Lkotlin/time/d;", "timeout", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "Lkotlin/j2;", "k", "(Lkotlinx/coroutines/selects/a;DLn6/l;)V", "Lkotlin/s;", "builder", "l", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/i;", "e", "Lkotlinx/coroutines/selects/i;", "getSelectOpSequenceNumber$annotations", "()V", "selectOpSequenceNumber", "b", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "getALREADY_SELECTED$annotations", "ALREADY_SELECTED", "c", "getUNDECIDED$annotations", "UNDECIDED", "a", "f", "getNOT_SELECTED$annotations", "NOT_SELECTED", "getRESUMED$annotations", "RESUMED", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class g
{
    @e
    private static final Object a;
    @e
    private static final Object b;
    private static final Object c;
    private static final Object d;
    private static final i e;
    
    static {
        a = new k0("NOT_SELECTED");
        b = new k0("ALREADY_SELECTED");
        c = new k0("UNDECIDED");
        d = new k0("RESUMED");
        e = new i();
    }
    
    @e
    public static final Object d() {
        return g.b;
    }
    
    @e
    public static final Object f() {
        return g.a;
    }
    
    @j
    @z1
    public static final <R> void k(@e final a<? super R> a, final double n, @e final l<? super d<? super R>, ?> l) {
        a.u(d1.e(n), l);
    }
    
    @f
    public static final <R> Object l(@e final l<? super a<? super R>, j2> l, @e final d<? super R> d) {
        final b b = new b((d<? super R>)d);
        try {
            l.invoke((Object)b);
        }
        finally {
            final Throwable t;
            b.R0(t);
        }
        final Object q0 = b.Q0();
        if (q0 == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return q0;
    }
    
    @f
    private static final Object m(@e final l l, @e final d d) {
        h0.e(0);
        final b b = new b((d<? super R>)d);
        try {
            l.invoke((Object)b);
        }
        finally {
            final Throwable t;
            b.R0(t);
        }
        final Object q0 = b.Q0();
        if (q0 == kotlin.coroutines.intrinsics.b.h()) {
            h.c(d);
        }
        h0.e(1);
        return q0;
    }
}
