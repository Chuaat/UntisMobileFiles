// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import kotlin.jvm.internal.h0;
import kotlin.j2;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.d;
import n6.a;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.internal.m0;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\u001a\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000\u001a8\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\b\u0010\t\u001a\u001a\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002\"\u001c\u0010\u0014\u001a\u00020\u000f8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0013\"\u001c\u0010\u0017\u001a\u00020\u000f8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u0012\u0004\b\u0016\u0010\u0013\"\u001c\u0010\u001a\u001a\u00020\u00008\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u0019\u0010\u0013\"\u001c\u0010\u001d\u001a\u00020\u000f8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0011\u0012\u0004\b\u001c\u0010\u0013\"\u001c\u0010 \u001a\u00020\u00008\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u0012\u0004\b\u001f\u0010\u0013\"\u001c\u0010#\u001a\u00020\u000f8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u0011\u0012\u0004\b\"\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$" }, d2 = { "", "permits", "acquiredPermits", "Lkotlinx/coroutines/sync/f;", "a", "T", "Lkotlin/Function0;", "action", "q", "(Lkotlinx/coroutines/sync/f;Ln6/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "id", "Lkotlinx/coroutines/sync/i;", "prev", "j", "Lkotlinx/coroutines/internal/k0;", "d", "Lkotlinx/coroutines/internal/k0;", "getBROKEN$annotations", "()V", "BROKEN", "c", "getTAKEN$annotations", "TAKEN", "I", "getMAX_SPIN_CYCLES$annotations", "MAX_SPIN_CYCLES", "e", "getCANCELLED$annotations", "CANCELLED", "f", "getSEGMENT_SIZE$annotations", "SEGMENT_SIZE", "b", "getPERMIT$annotations", "PERMIT", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class h
{
    private static final int a;
    private static final k0 b;
    private static final k0 c;
    private static final k0 d;
    private static final k0 e;
    private static final int f;
    
    static {
        a = m0.f("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, null);
        b = new k0("PERMIT");
        c = new k0("TAKEN");
        d = new k0("BROKEN");
        e = new k0("CANCELLED");
        f = m0.f("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, null);
    }
    
    @e
    public static final f a(final int n, final int n2) {
        return new g(n, n2);
    }
    
    private static final i j(final long n, final i i) {
        return new i(n, i, 0);
    }
    
    @org.jetbrains.annotations.f
    public static final <T> Object q(@e final f i, @e a<? extends T> j, @e d<? super T> f) {
        kotlin.coroutines.jvm.internal.d d = null;
        Label_0047: {
            if (f instanceof h$a) {
                d = (h$a)f;
                final int h = d.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d.H = h + Integer.MIN_VALUE;
                    break Label_0047;
                }
            }
            d = new kotlin.coroutines.jvm.internal.d(f) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return h.q((f)null, (n6.a<?>)null, (kotlin.coroutines.d<? super Object>)this);
                }
            };
        }
        final Object g = d.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = d.H;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = (a)d.J;
            f = (f)d.I;
            c1.n(g);
        }
        else {
            c1.n(g);
            d.I = i;
            d.J = j;
            d.H = 1;
            f = i;
            if (i.b((d<? super j2>)d) == h2) {
                return h2;
            }
        }
        try {
            return j.invoke();
        }
        finally {
            h0.d(1);
            f.release();
            h0.c(1);
        }
    }
    
    @org.jetbrains.annotations.f
    private static final Object r(@e final f f, @e final a a, @e final d d) {
        h0.e(0);
        f.b((d<? super j2>)d);
        h0.e(2);
        h0.e(1);
        try {
            return a.invoke();
        }
        finally {
            h0.d(1);
            f.release();
            h0.c(1);
        }
    }
}
