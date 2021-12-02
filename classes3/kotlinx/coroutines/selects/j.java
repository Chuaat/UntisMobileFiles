// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import n6.l;
import kotlin.jvm.internal.m0;
import n6.p;
import kotlin.coroutines.d;
import kotlin.j2;
import java.util.ArrayList;
import org.jetbrains.annotations.e;
import kotlin.y0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0015\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\n¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0001J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0007H\u0001J5\u0010\f\u001a\u00020\u0005*\u00020\b2\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\f\u0010\rJG\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u00028\u00010\u000f2\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J[\u0010\u0016\u001a\u00020\u0005\"\u0004\b\u0001\u0010\u0013\"\u0004\b\u0002\u0010\u000e*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u00012\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0010H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u001c\u0010\u000b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\tH\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R5\u0010)\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#0\"j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050#`$8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-" }, d2 = { "Lkotlinx/coroutines/selects/j;", "R", "Lkotlinx/coroutines/selects/a;", "", "e", "Lkotlin/j2;", "d", "", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "b", "(Lkotlinx/coroutines/selects/c;Ln6/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "X", "(Lkotlinx/coroutines/selects/d;Ln6/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "n", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Ln6/p;)V", "", "timeMillis", "u", "(JLn6/l;)V", "Lkotlinx/coroutines/selects/b;", "G", "Lkotlinx/coroutines/selects/b;", "c", "()Lkotlinx/coroutines/selects/b;", "instance", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "Lkotlin/collections/ArrayList;", "H", "Ljava/util/ArrayList;", "a", "()Ljava/util/ArrayList;", "clauses", "uCont", "<init>", "(Lkotlin/coroutines/d;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public final class j<R> implements a<R>
{
    @e
    private final b<R> G;
    @e
    private final ArrayList<n6.a<j2>> H;
    
    public j(@e final d<? super R> d) {
        this.G = new b<R>(d);
        this.H = new ArrayList<n6.a<j2>>();
    }
    
    @Override
    public <Q> void X(@e final kotlinx.coroutines.selects.d<? extends Q> d, @e final p<? super Q, ? super d<? super R>, ?> p2) {
        this.H.add(new n6.a<j2>() {
            final /* synthetic */ j G;
            
            public final void invoke() {
                d.i(this.G.c(), p2);
            }
        });
    }
    
    @e
    public final ArrayList<n6.a<j2>> a() {
        return this.H;
    }
    
    @Override
    public void b(@e final c c, @e final l<? super d<? super R>, ?> l) {
        this.H.add(new n6.a<j2>() {
            final /* synthetic */ j G;
            
            public final void invoke() {
                c.u((f<? super Object>)this.G.c(), (n6.l<? super kotlin.coroutines.d<? super Object>, ?>)l);
            }
        });
    }
    
    @e
    public final b<R> c() {
        return this.G;
    }
    
    @y0
    public final void d(@e final Throwable t) {
        this.G.R0(t);
    }
    
    @y0
    @org.jetbrains.annotations.f
    public final Object e() {
        if (!this.G.s()) {
            try {
                Collections.shuffle(this.H);
                final Iterator<n6.a> iterator = this.H.iterator();
                while (iterator.hasNext()) {
                    iterator.next().invoke();
                }
            }
            finally {
                final Throwable t;
                this.G.R0(t);
            }
        }
        return this.G.Q0();
    }
    
    @Override
    public <P, Q> void n(@e final kotlinx.coroutines.selects.e<? super P, ? extends Q> e, final P p3, @e final p<? super Q, ? super d<? super R>, ?> p4) {
        this.H.add(new n6.a<j2>() {
            final /* synthetic */ j G;
            
            public final void invoke() {
                e.P(this.G.c(), p3, p4);
            }
        });
    }
    
    @Override
    public void u(final long n, @e final l<? super d<? super R>, ?> l) {
        this.H.add(new n6.a<j2>() {
            final /* synthetic */ j G;
            
            public final void invoke() {
                this.G.c().u(n, l);
            }
        });
    }
    
    @Override
    public <P, Q> void x(@e final kotlinx.coroutines.selects.e<? super P, ? extends Q> e, @e final p<? super Q, ? super d<? super R>, ?> p2) {
        a.a((a<? super Object>)this, (kotlinx.coroutines.selects.e<? super Object, ?>)e, (n6.p<? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
    }
}
