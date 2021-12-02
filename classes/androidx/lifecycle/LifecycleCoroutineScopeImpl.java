// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.o2;
import kotlin.jvm.internal.k0;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010\u0004\u001a\u00020\u0003J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000f\u001a\u00020\n8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0015\u001a\u00020\u00108\u0010@\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018" }, d2 = { "Landroidx/lifecycle/LifecycleCoroutineScopeImpl;", "Landroidx/lifecycle/t;", "Landroidx/lifecycle/v;", "Lkotlin/j2;", "m", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/s$b;", "event", "h", "Lkotlin/coroutines/g;", "H", "Lkotlin/coroutines/g;", "J", "()Lkotlin/coroutines/g;", "coroutineContext", "Landroidx/lifecycle/s;", "G", "Landroidx/lifecycle/s;", "i", "()Landroidx/lifecycle/s;", "lifecycle", "<init>", "(Landroidx/lifecycle/s;Lkotlin/coroutines/g;)V", "lifecycle-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class LifecycleCoroutineScopeImpl extends t implements v
{
    @e
    private final s G;
    @e
    private final g H;
    
    public LifecycleCoroutineScopeImpl(@e final s g, @e final g h) {
        k0.q((Object)g, "lifecycle");
        k0.q((Object)h, "coroutineContext");
        this.G = g;
        this.H = h;
        if (this.i().b() == s.c.G) {
            o2.j(this.J(), (CancellationException)null, 1, (Object)null);
        }
    }
    
    @e
    public g J() {
        return this.H;
    }
    
    @Override
    public void h(@e final y y, @e final s.b b) {
        k0.q((Object)y, "source");
        k0.q((Object)b, "event");
        if (this.i().b().compareTo(s.c.G) <= 0) {
            this.i().c(this);
            o2.j(this.J(), (CancellationException)null, 1, (Object)null);
        }
    }
    
    @e
    @Override
    public s i() {
        return this.G;
    }
    
    public final void m() {
        h.f((r0)this, (g)i1.e().M(), (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            private r0 G;
            int H;
            final /* synthetic */ LifecycleCoroutineScopeImpl I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.q((Object)d, "completion");
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private r0 G;
                    int H;
                    final /* synthetic */ LifecycleCoroutineScopeImpl I = this.I;
                };
                p2.G = (r0)o;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((LifecycleCoroutineScopeImpl$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                b.h();
                if (this.H == 0) {
                    c1.n(o);
                    final r0 g = this.G;
                    if (this.I.i().b().compareTo(s.c.H) >= 0) {
                        this.I.i().a(this.I);
                    }
                    else {
                        o2.j(g.J(), (CancellationException)null, 1, (Object)null);
                    }
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 2, (Object)null);
    }
}
