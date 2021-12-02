// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.sync;

import kotlin.jvm.internal.h0;
import kotlin.j2;
import kotlin.c1;
import n6.a;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086H\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001c\u0010\u0010\u001a\u00020\u000b8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u0012\u0004\b\u000e\u0010\u000f\"\u001c\u0010\u0015\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u000f\"\u001c\u0010\u0018\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u0012\u0004\b\u0017\u0010\u000f\"\u001c\u0010\u001b\u001a\u00020\u000b8\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\r\u0012\u0004\b\u001a\u0010\u000f\"\u001c\u0010\u001d\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u0012\u0004\b\u001c\u0010\u000f\"\u001c\u0010 \u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u0012\u0004\b\u001f\u0010\u000f\"\u001c\u0010#\u001a\u00020\u00118\u0002@\u0003X\u0083\u0004¢\u0006\f\n\u0004\b!\u0010\u0013\u0012\u0004\b\"\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$" }, d2 = { "", "locked", "Lkotlinx/coroutines/sync/c;", "a", "T", "", "owner", "Lkotlin/Function0;", "action", "q", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Ln6/a;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlinx/coroutines/sync/b;", "g", "Lkotlinx/coroutines/sync/b;", "getEMPTY_UNLOCKED$annotations", "()V", "EMPTY_UNLOCKED", "Lkotlinx/coroutines/internal/k0;", "b", "Lkotlinx/coroutines/internal/k0;", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", "e", "getUNLOCKED$annotations", "UNLOCKED", "f", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "getLOCK_FAIL$annotations", "LOCK_FAIL", "d", "getLOCKED$annotations", "LOCKED", "c", "getSELECT_SUCCESS$annotations", "SELECT_SUCCESS", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class e
{
    private static final k0 a;
    private static final k0 b;
    private static final k0 c;
    private static final k0 d;
    private static final k0 e;
    private static final b f;
    private static final b g;
    
    static {
        a = new k0("LOCK_FAIL");
        b = new k0("UNLOCK_FAIL");
        c = new k0("SELECT_SUCCESS");
        final k0 k0 = d = new k0("LOCKED");
        final k0 k2 = e = new k0("UNLOCKED");
        f = new b(k0);
        g = new b(k2);
    }
    
    @org.jetbrains.annotations.e
    public static final c a(final boolean b) {
        return new d(b);
    }
    
    @f
    public static final <T> Object q(@org.jetbrains.annotations.e final c i, @f final Object j, @org.jetbrains.annotations.e a<? extends T> k, @org.jetbrains.annotations.e kotlin.coroutines.d<? super T> c) {
        kotlin.coroutines.jvm.internal.d d = null;
        Label_0051: {
            if (c instanceof e$a) {
                d = (e$a)c;
                final int h = d.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d.H = h + Integer.MIN_VALUE;
                    break Label_0051;
                }
            }
            d = new kotlin.coroutines.jvm.internal.d(c) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                Object K;
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return kotlinx.coroutines.sync.e.q((c)null, (Object)null, (n6.a<?>)null, (kotlin.coroutines.d<? super Object>)this);
                }
            };
        }
        final Object g = d.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = d.H;
        Object l;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k = (a)d.K;
            l = d.J;
            c = (c)d.I;
            c1.n(g);
        }
        else {
            c1.n(g);
            d.I = i;
            d.J = j;
            d.K = k;
            d.H = 1;
            c = i;
            l = j;
            if (i.c(j, (kotlin.coroutines.d<? super j2>)d) == h2) {
                return h2;
            }
        }
        try {
            return k.invoke();
        }
        finally {
            h0.d(1);
            c.d(l);
            h0.c(1);
        }
    }
    
    @f
    private static final Object r(@org.jetbrains.annotations.e final c c, @f final Object o, @org.jetbrains.annotations.e final a a, @org.jetbrains.annotations.e final kotlin.coroutines.d d) {
        h0.e(0);
        c.c(o, (kotlin.coroutines.d<? super j2>)d);
        h0.e(2);
        h0.e(1);
        try {
            return a.invoke();
        }
        finally {
            h0.d(1);
            c.d(o);
            h0.c(1);
        }
    }
}
