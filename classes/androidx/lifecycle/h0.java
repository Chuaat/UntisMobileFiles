// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.l1;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.i1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00018\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c" }, d2 = { "Landroidx/lifecycle/h0;", "T", "Landroidx/lifecycle/g0;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/l1;", "c", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "value", "Lkotlin/j2;", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroidx/lifecycle/g;", "Landroidx/lifecycle/g;", "a", "()Landroidx/lifecycle/g;", "e", "(Landroidx/lifecycle/g;)V", "target", "d", "()Ljava/lang/Object;", "latestValue", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "coroutineContext", "context", "<init>", "(Landroidx/lifecycle/g;Lkotlin/coroutines/g;)V", "lifecycle-livedata-ktx_release" }, k = 1, mv = { 1, 4, 1 })
public final class h0<T> implements g0<T>
{
    private final g a;
    @e
    private androidx.lifecycle.g<T> b;
    
    public h0(@e final androidx.lifecycle.g<T> b, @e final g g) {
        k0.p((Object)b, "target");
        k0.p((Object)g, "context");
        this.b = b;
        this.a = g.plus((g)i1.e().M());
    }
    
    @e
    public final androidx.lifecycle.g<T> a() {
        return this.b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(final T t, @e final d<? super j2> d) {
        final Object i = h.i(this.a, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ h0 H;
            final /* synthetic */ Object I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ h0 H = this.H;
                    final /* synthetic */ Object I = this.I;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h0$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
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
                    final androidx.lifecycle.g<T> a = this.H.a();
                    this.G = 1;
                    if (a.v((d)this) == h) {
                        return h;
                    }
                }
                this.H.a().q((T)this.I);
                return j2.a;
            }
        }, (d)d);
        if (i == kotlin.coroutines.intrinsics.b.h()) {
            return i;
        }
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object c(@e final LiveData<T> liveData, @e final d<? super l1> d) {
        return h.i(this.a, (p)new p<r0, d<? super l1>, Object>() {
            int G;
            final /* synthetic */ h0 H;
            final /* synthetic */ LiveData I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new p<r0, d<? super l1>, Object>() {
                    int G;
                    final /* synthetic */ h0 H = this.H;
                    final /* synthetic */ LiveData I = this.I;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((h0$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object w) {
                final Object h = kotlin.coroutines.intrinsics.b.h();
                final int g = this.G;
                if (g != 0) {
                    if (g != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(w);
                }
                else {
                    c1.n(w);
                    final androidx.lifecycle.g<T> a = this.H.a();
                    final LiveData i = this.I;
                    this.G = 1;
                    if ((w = a.w(i, (d<? super l1>)this)) == h) {
                        return h;
                    }
                }
                return w;
            }
        }, (d)d);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public T d() {
        return this.b.f();
    }
    
    public final void e(@e final androidx.lifecycle.g<T> b) {
        k0.p((Object)b, "<set-?>");
        this.b = b;
    }
}
