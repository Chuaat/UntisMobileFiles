// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.h;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import kotlinx.coroutines.d1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.i1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.a;
import kotlinx.coroutines.r0;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlinx.coroutines.k2;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\u0012-\u0010\u001c\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0018¢\u0006\u0002\b\u001b\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0007J\b\u0010\u0005\u001a\u00020\u0003H\u0007R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Landroidx/lifecycle/c;", "T", "", "Lkotlin/j2;", "h", "g", "Lkotlinx/coroutines/r0;", "f", "Lkotlinx/coroutines/r0;", "scope", "", "e", "J", "timeoutInMs", "Lkotlinx/coroutines/k2;", "a", "Lkotlinx/coroutines/k2;", "runningJob", "b", "cancellationJob", "Landroidx/lifecycle/g;", "c", "Landroidx/lifecycle/g;", "liveData", "Lkotlin/Function2;", "Landroidx/lifecycle/g0;", "Lkotlin/coroutines/d;", "Lkotlin/s;", "block", "Lkotlin/Function0;", "onDone", "<init>", "(Landroidx/lifecycle/g;Ln6/p;JLkotlinx/coroutines/r0;Ln6/a;)V", "lifecycle-livedata-ktx_release" }, k = 1, mv = { 1, 4, 1 })
public final class c<T>
{
    private k2 a;
    private k2 b;
    private final g<T> c;
    private final p<g0<T>, d<? super j2>, Object> d;
    private final long e;
    private final r0 f;
    private final a<j2> g;
    
    public c(@e final g<T> c, @e final p<? super g0<T>, ? super d<? super j2>, ?> d, final long e, @e final r0 f, @e final a<j2> g) {
        k0.p((Object)c, "liveData");
        k0.p((Object)d, "block");
        k0.p((Object)f, "scope");
        k0.p((Object)g, "onDone");
        this.c = c;
        this.d = (p<g0<T>, d<? super j2>, Object>)d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    public static final /* synthetic */ p a(final c c) {
        return c.d;
    }
    
    public static final /* synthetic */ g b(final c c) {
        return c.c;
    }
    
    public static final /* synthetic */ a c(final c c) {
        return c.g;
    }
    
    public static final /* synthetic */ k2 d(final c c) {
        return c.a;
    }
    
    public static final /* synthetic */ long e(final c c) {
        return c.e;
    }
    
    public static final /* synthetic */ void f(final c c, final k2 a) {
        c.a = a;
    }
    
    @androidx.annotation.g0
    public final void g() {
        if (this.b == null) {
            this.b = h.f(this.f, (kotlin.coroutines.g)i1.e().M(), (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                int G;
                final /* synthetic */ c H;
                
                @e
                public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                    k0.p((Object)d, "completion");
                    return (d<j2>)new p<r0, d<? super j2>, Object>() {
                        int G;
                        final /* synthetic */ c H = this.H;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((c$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object o) {
                    final Object h = kotlin.coroutines.intrinsics.b.h();
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final long e = androidx.lifecycle.c.e(this.H);
                        this.G = 1;
                        if (d1.b(e, (d)this) == h) {
                            return h;
                        }
                    }
                    if (!androidx.lifecycle.c.b(this.H).h()) {
                        final k2 d = androidx.lifecycle.c.d(this.H);
                        if (d != null) {
                            k2$a.b(d, (CancellationException)null, 1, (Object)null);
                        }
                        androidx.lifecycle.c.f(this.H, null);
                    }
                    return j2.a;
                }
            }, 2, (Object)null);
            return;
        }
        throw new IllegalStateException("Cancel call cannot happen without a maybeRun".toString());
    }
    
    @androidx.annotation.g0
    public final void h() {
        final k2 b = this.b;
        if (b != null) {
            k2$a.b(b, (CancellationException)null, 1, (Object)null);
        }
        this.b = null;
        if (this.a != null) {
            return;
        }
        this.a = h.f(this.f, (kotlin.coroutines.g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ c I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ c I = this.I;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((c$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int h2 = this.H;
                if (h2 != 0) {
                    if (h2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final h0 h3 = new h0(androidx.lifecycle.c.b(this.I), ((r0)this.G).J());
                    final p a = androidx.lifecycle.c.a(this.I);
                    this.H = 1;
                    if (a.invoke((Object)h3, (Object)this) == h) {
                        return h;
                    }
                }
                androidx.lifecycle.c.c(this.I).invoke();
                return j2.a;
            }
        }, 3, (Object)null);
    }
}
