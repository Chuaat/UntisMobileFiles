// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.k2;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.r0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\t\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ9\u0010\u000b\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\nJ9\u0010\f\u001a\u00020\b2'\u0010\u0007\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0002\b\u0006\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\u0016\u0010\u0010\u001a\u00020\r8 @ X \u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013" }, d2 = { "Landroidx/lifecycle/t;", "Lkotlinx/coroutines/r0;", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "", "Lkotlin/s;", "block", "Lkotlinx/coroutines/k2;", "j", "(Ln6/p;)Lkotlinx/coroutines/k2;", "l", "k", "Landroidx/lifecycle/s;", "i", "()Landroidx/lifecycle/s;", "lifecycle", "<init>", "()V", "lifecycle-runtime-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public abstract class t implements r0
{
    @e
    public abstract s i();
    
    @e
    public final k2 j(@e final p<? super r0, ? super d<? super j2>, ?> p) {
        k0.q((Object)p, "block");
        return h.f((r0)this, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            private r0 G;
            Object H;
            int I;
            final /* synthetic */ t J;
            final /* synthetic */ p K;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.q((Object)d, "completion");
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private r0 G;
                    Object H;
                    int I;
                    final /* synthetic */ t J = this.J;
                    final /* synthetic */ p K = this.K;
                };
                p2.G = (r0)o;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((t$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int i = this.I;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final r0 r0 = (r0)this.H;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final r0 g = this.G;
                    final s j = this.J.i();
                    final p k = this.K;
                    this.H = g;
                    this.I = 1;
                    if (o0.a(j, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)k, (kotlin.coroutines.d<? super Object>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 k(@e final p<? super r0, ? super d<? super j2>, ?> p) {
        k0.q((Object)p, "block");
        return h.f((r0)this, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            private r0 G;
            Object H;
            int I;
            final /* synthetic */ t J;
            final /* synthetic */ p K;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.q((Object)d, "completion");
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private r0 G;
                    Object H;
                    int I;
                    final /* synthetic */ t J = this.J;
                    final /* synthetic */ p K = this.K;
                };
                p2.G = (r0)o;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((t$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int i = this.I;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final r0 r0 = (r0)this.H;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final r0 g = this.G;
                    final s j = this.J.i();
                    final p k = this.K;
                    this.H = g;
                    this.I = 1;
                    if (o0.c(j, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)k, (kotlin.coroutines.d<? super Object>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
    
    @e
    public final k2 l(@e final p<? super r0, ? super d<? super j2>, ?> p) {
        k0.q((Object)p, "block");
        return h.f((r0)this, (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            private r0 G;
            Object H;
            int I;
            final /* synthetic */ t J;
            final /* synthetic */ p K;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.q((Object)d, "completion");
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private r0 G;
                    Object H;
                    int I;
                    final /* synthetic */ t J = this.J;
                    final /* synthetic */ p K = this.K;
                };
                p2.G = (r0)o;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((t$c)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                final Object h = b.h();
                final int i = this.I;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final r0 r0 = (r0)this.H;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final r0 g = this.G;
                    final s j = this.J.i();
                    final p k = this.K;
                    this.H = g;
                    this.I = 1;
                    if (o0.e(j, (n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)k, (kotlin.coroutines.d<? super Object>)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        }, 3, (Object)null);
    }
}
