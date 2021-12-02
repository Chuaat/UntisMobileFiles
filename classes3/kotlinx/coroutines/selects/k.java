// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlin.jvm.internal.h0;
import kotlinx.coroutines.z1;
import kotlin.coroutines.jvm.internal.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a4\u0010\u0006\u001a\u00020\u00032\u001f\b\u0004\u0010\u0005\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0002\b\u0004H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b" }, d2 = { "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/a;", "", "Lkotlin/j2;", "Lkotlin/s;", "builder", "a", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class k
{
    @z1
    @org.jetbrains.annotations.f
    public static final Object a(@e l<? super a<? super Boolean>, j2> i, @e d<? super j2> o) {
        Label_0046: {
            if (o instanceof k$a) {
                final kotlin.coroutines.jvm.internal.d d = (k$a)o;
                final int h = d.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d.H = h + Integer.MIN_VALUE;
                    o = d;
                    break Label_0046;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(o) {
                /* synthetic */ Object G;
                int H;
                Object I;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return k.a(null, (d<? super j2>)this);
                }
            };
        }
        Object g = ((k$a)o).G;
        final Object h2 = b.h();
        final int h3 = ((k$a)o).H;
        while (true) {
            Label_0170: {
                if (h3 != 0) {
                    if (h3 == 1) {
                        i = (l)((k$a)o).I;
                        c1.n(g);
                        break Label_0170;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    c1.n(g);
                }
                ((k$a)o).I = i;
                ((k$a)o).H = 1;
                final kotlinx.coroutines.selects.b b = new kotlinx.coroutines.selects.b((kotlin.coroutines.d<? super Object>)o);
                try {
                    i.invoke((Object)b);
                }
                finally {
                    final Throwable t;
                    b.R0(t);
                }
                final Object q0 = b.Q0();
                if (q0 == kotlin.coroutines.intrinsics.b.h()) {
                    h.c((d)o);
                }
                if ((g = q0) == h2) {
                    return h2;
                }
            }
            if (g) {
                continue;
            }
            break;
        }
        return j2.a;
    }
    
    @z1
    @org.jetbrains.annotations.f
    private static final Object b(@e final l l, @e final d d) {
        Object q0;
        do {
            h0.e(0);
            final kotlinx.coroutines.selects.b b = new kotlinx.coroutines.selects.b(d);
            try {
                l.invoke((Object)b);
            }
            finally {
                final Throwable t;
                b.R0(t);
            }
            q0 = b.Q0();
            if (q0 == kotlin.coroutines.intrinsics.b.h()) {
                h.c(d);
            }
            h0.e(1);
        } while (q0);
        return j2.a;
    }
}
