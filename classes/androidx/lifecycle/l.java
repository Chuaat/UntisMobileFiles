// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.u0;
import kotlinx.coroutines.s0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlinx.coroutines.i1;
import kotlin.j2;
import kotlin.coroutines.d;
import androidx.annotation.g0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlinx.coroutines.l1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0003J\u0013\u0010\u0004\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0002H\u0016R\u001a\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "Landroidx/lifecycle/l;", "Lkotlinx/coroutines/l1;", "Lkotlin/j2;", "c", "b", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "dispose", "Landroidx/lifecycle/i0;", "I", "Landroidx/lifecycle/i0;", "mediator", "Landroidx/lifecycle/LiveData;", "H", "Landroidx/lifecycle/LiveData;", "source", "", "G", "Z", "disposed", "<init>", "(Landroidx/lifecycle/LiveData;Landroidx/lifecycle/i0;)V", "lifecycle-livedata-ktx_release" }, k = 1, mv = { 1, 4, 1 })
public final class l implements l1
{
    private boolean G;
    private final LiveData<?> H;
    private final i0<?> I;
    
    public l(@e final LiveData<?> h, @e final i0<?> i) {
        k0.p((Object)h, "source");
        k0.p((Object)i, "mediator");
        this.H = h;
        this.I = i;
    }
    
    @g0
    private final void c() {
        if (!this.G) {
            this.I.s(this.H);
            this.G = true;
        }
    }
    
    @org.jetbrains.annotations.f
    public final Object b(@e final d<? super j2> d) {
        final Object i = h.i((g)i1.e().M(), (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ l H;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ l H = this.H;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((l$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    l.this.c();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, (d)d);
        if (i == b.h()) {
            return i;
        }
        return j2.a;
    }
    
    public void dispose() {
        h.f(s0.a((g)i1.e().M()), (g)null, (u0)null, (p)new p<r0, d<? super j2>, Object>() {
            int G;
            final /* synthetic */ l H;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                k0.p((Object)d, "completion");
                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ l H = this.H;
                };
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((l$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e final Object o) {
                b.h();
                if (this.G == 0) {
                    c1.n(o);
                    l.this.c();
                    return j2.a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }, 3, (Object)null);
    }
}
