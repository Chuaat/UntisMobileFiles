// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.l1;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.i;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.p3;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.i1;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BM\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012-\u0010\u001e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u001b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0019¢\u0006\u0002\b\u001d\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J!\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\bH\u0014J\b\u0010\f\u001a\u00020\bH\u0014R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!" }, d2 = { "Landroidx/lifecycle/g;", "T", "Landroidx/lifecycle/i0;", "Landroidx/lifecycle/LiveData;", "source", "Lkotlinx/coroutines/l1;", "w", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "v", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "l", "m", "Landroidx/lifecycle/c;", "n", "Landroidx/lifecycle/c;", "blockRunner", "Landroidx/lifecycle/l;", "o", "Landroidx/lifecycle/l;", "emittedSource", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Lkotlin/Function2;", "Landroidx/lifecycle/g0;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "<init>", "(Lkotlin/coroutines/g;JLn6/p;)V", "lifecycle-livedata-ktx_release" }, k = 1, mv = { 1, 4, 1 })
public final class g<T> extends i0<T>
{
    private androidx.lifecycle.c<T> n;
    private l o;
    
    public g(@e final kotlin.coroutines.g g, final long n, @e final p<? super g0<T>, ? super d<? super j2>, ?> p3) {
        kotlin.jvm.internal.k0.p((Object)g, "context");
        kotlin.jvm.internal.k0.p((Object)p3, "block");
        this.n = new androidx.lifecycle.c<T>(this, p3, n, s0.a(((kotlin.coroutines.a)i1.e().M()).plus(g).plus((kotlin.coroutines.g)p3.a((k2)g.get((kotlin.coroutines.g$c)k2.t)))), (n6.a<j2>)new n6.a<j2>() {
            final /* synthetic */ g G;
            
            public final void invoke() {
                g.u(this.G, null);
            }
        });
    }
    
    public static final /* synthetic */ void u(final g g, final androidx.lifecycle.c n) {
        g.n = (androidx.lifecycle.c<T>)n;
    }
    
    @Override
    protected void l() {
        super.l();
        final androidx.lifecycle.c<T> n = this.n;
        if (n != null) {
            n.h();
        }
    }
    
    @Override
    protected void m() {
        super.m();
        final androidx.lifecycle.c<T> n = this.n;
        if (n != null) {
            n.g();
        }
    }
    
    @org.jetbrains.annotations.f
    public final Object v(@e final d<? super j2> d) {
        Object o = null;
        Label_0047: {
            if (d instanceof g$b) {
                final kotlin.coroutines.jvm.internal.d d2 = (g$b)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0047;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ g I;
                Object J;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.v((d<? super j2>)this);
                }
            };
        }
        final Object g = ((g$b)o).G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = ((g$b)o).H;
        g g2;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g2 = (g)((g$b)o).J;
            c1.n(g);
        }
        else {
            c1.n(g);
            final l o2 = this.o;
            if (o2 != null) {
                ((g$b)o).J = this;
                ((g$b)o).H = 1;
                if (o2.b((d<? super j2>)o) == h2) {
                    return h2;
                }
            }
            g2 = this;
        }
        g2.o = null;
        return j2.a;
    }
    
    @org.jetbrains.annotations.f
    public final Object w(@e final LiveData<T> k, @e final d<? super l1> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0050: {
            if (d instanceof g$c) {
                final kotlin.coroutines.jvm.internal.d d2 = (g$c)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0050;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                final /* synthetic */ g I;
                Object J;
                Object K;
                
                @org.jetbrains.annotations.f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return this.I.w(null, (d<? super l1>)this);
                }
            };
        }
        final Object g = d3.G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = d3.H;
        g j;
        LiveData<T> liveData2;
        if (h3 != 0) {
            if (h3 != 1) {
                if (h3 == 2) {
                    j = (g)d3.J;
                    c1.n(g);
                    final Object a = g;
                    return j.o = (l)a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            else {
                final LiveData liveData = (LiveData)d3.K;
                j = (g)d3.J;
                c1.n(g);
                liveData2 = (LiveData<T>)liveData;
            }
        }
        else {
            c1.n(g);
            d3.J = this;
            d3.K = k;
            d3.H = 1;
            if (this.v((d<? super j2>)d3) == h2) {
                return h2;
            }
            liveData2 = k;
            j = this;
        }
        d3.J = j;
        d3.K = null;
        d3.H = 2;
        Object a;
        if ((a = androidx.lifecycle.h.a(j, liveData2, (d<? super l>)d3)) == h2) {
            return h2;
        }
        return j.o = (l)a;
    }
}
