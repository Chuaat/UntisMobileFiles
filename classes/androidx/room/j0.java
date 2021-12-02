// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.channels.l0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import android.os.Build$VERSION;
import kotlinx.coroutines.k2;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.u0;
import kotlin.b1$a;
import kotlin.b1;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.h;
import kotlin.coroutines.g;
import kotlinx.coroutines.channels.q;
import kotlinx.coroutines.r0;
import kotlin.coroutines.g$c;
import java.util.Set;
import kotlin.jvm.internal.j1$h;
import n6.l;
import kotlinx.coroutines.channels.n;
import kotlinx.coroutines.channels.r;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlinx.coroutines.flow.j;
import n6.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.d;
import android.os.CancellationSignal;
import m6.k;
import kotlinx.coroutines.flow.i;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import androidx.annotation.t0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005" }, d2 = { "Landroidx/room/j0;", "", "<init>", "()V", "a", "room-ktx_release" }, k = 1, mv = { 1, 4, 2 })
@t0({ t0.a.I })
public final class j0
{
    @e
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    private j0() {
    }
    
    @k
    @e
    public static final <R> i<R> a(@e final r2 r2, final boolean b, @e final String[] array, @e final Callable<R> callable) {
        return j0.a.a(r2, b, array, callable);
    }
    
    @k
    @f
    public static final <R> Object b(@e final r2 r2, final boolean b, @e final CancellationSignal cancellationSignal, @e final Callable<R> callable, @e final d<? super R> d) {
        return j0.a.b(r2, b, cancellationSignal, callable, d);
    }
    
    @k
    @f
    public static final <R> Object c(@e final r2 r2, final boolean b, @e final Callable<R> callable, @e final d<? super R> d) {
        return j0.a.c(r2, b, callable, d);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ?\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJL\u0010\u0014\u001a\r\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u00130\u0012\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "androidx/room/j0$a", "", "R", "Landroidx/room/r2;", "db", "", "inTransaction", "Ljava/util/concurrent/Callable;", "callable", "c", "(Landroidx/room/r2;ZLjava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Landroid/os/CancellationSignal;", "cancellationSignal", "b", "(Landroidx/room/r2;ZLandroid/os/CancellationSignal;Ljava/util/concurrent/Callable;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "", "tableNames", "Lkotlinx/coroutines/flow/i;", "Lm6/l;", "a", "(Landroidx/room/r2;Z[Ljava/lang/String;Ljava/util/concurrent/Callable;)Lkotlinx/coroutines/flow/i;", "<init>", "()V", "room-ktx_release" }, k = 1, mv = { 1, 4, 2 })
    public static final class a
    {
        private a() {
        }
        
        @k
        @e
        public final <R> i<R> a(@e final r2 r2, final boolean b, @e final String[] array, @e final Callable<R> callable) {
            k0.p((Object)r2, "db");
            k0.p((Object)array, "tableNames");
            k0.p((Object)callable, "callable");
            return (i<R>)kotlinx.coroutines.flow.l.N0((p)new p<j<?>, d<? super j2>, Object>(callable) {
                private /* synthetic */ Object G;
                int H;
                final /* synthetic */ String[] I;
                final /* synthetic */ boolean J;
                final /* synthetic */ r2 K;
                final /* synthetic */ Callable L;
                
                @e
                public final d<j2> create(@f final Object g, @e final d<?> d) {
                    k0.p((Object)d, "completion");
                    final p<j<?>, d<? super j2>, Object> p2 = (p<j<?>, d<? super j2>, Object>)new p<j<?>, d<? super j2>, Object>() {
                        private /* synthetic */ Object G;
                        int H;
                        final /* synthetic */ String[] I = this.I;
                        final /* synthetic */ boolean J = this.J;
                        final /* synthetic */ r2 K = this.K;
                        final /* synthetic */ Callable L = this.L;
                    };
                    p2.G = g;
                    return (d<j2>)p2;
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((j0$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@e final Object o) {
                    final Object h = b.h();
                    final int h2 = this.H;
                    if (h2 != 0) {
                        if (h2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c1.n(o);
                    }
                    else {
                        c1.n(o);
                        final j j = (j)this.G;
                        final kotlinx.coroutines.channels.o d = r.d(-1, (n)null, (l)null, 6, (Object)null);
                        final j1$h j1$h = new j1$h();
                        j1$h.G = new h1.c(d) {
                            final /* synthetic */ kotlinx.coroutines.channels.o c = j0$a$a.this.I;
                            
                            @Override
                            public void b(@org.jetbrains.annotations.e final Set<String> set) {
                                k0.p((Object)set, "tables");
                                ((l0)this.c).offer((Object)j2.a);
                            }
                        };
                        ((l0)d).offer((Object)j2.a);
                        final j1$h j1$h2 = new j1$h();
                        j1$h2.G = ((d)this).getContext();
                        final d3 d2 = (d3)((d)this).getContext().get((g$c)d3.J);
                        Object o2 = null;
                        Label_0178: {
                            if (d2 != null) {
                                o2 = d2.i();
                                if (o2 != null) {
                                    break Label_0178;
                                }
                            }
                            if (this.J) {
                                o2 = androidx.room.k0.b(this.K);
                            }
                            else {
                                o2 = androidx.room.k0.a(this.K);
                            }
                        }
                        final p<r0, d<? super j2>, Object> p = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>(d) {
                            Object G;
                            int H;
                            final /* synthetic */ j0$a$a I;
                            final /* synthetic */ j J;
                            final /* synthetic */ j1$h K;
                            final /* synthetic */ kotlinx.coroutines.channels.o L;
                            final /* synthetic */ j1$h M;
                            
                            @e
                            public final d<j2> create(@f final Object o, @e final d<?> d) {
                                k0.p((Object)d, "completion");
                                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                    Object G;
                                    int H;
                                    final /* synthetic */ j0$a$a I = this.I;
                                    final /* synthetic */ j J = this.J;
                                    final /* synthetic */ j1$h K = this.K;
                                    final /* synthetic */ kotlinx.coroutines.channels.o L = this.L;
                                    final /* synthetic */ j1$h M = this.M;
                                };
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                return ((j0$a$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                            }
                            
                            @f
                            public final Object invokeSuspend(@e Object o) {
                                final Object h = b.h();
                                final int h2 = this.H;
                                Label_0071: {
                                    if (h2 == 0) {
                                        break Label_0071;
                                    }
                                    Label_0049: {
                                        if (h2 == 1) {
                                            break Label_0049;
                                        }
                                        Label_0039: {
                                            if (h2 != 2) {
                                                break Label_0039;
                                            }
                                            q iterator = (q)this.G;
                                            try {
                                                c1.n(o);
                                                while (true) {
                                                    while (true) {
                                                        final Object o2 = this;
                                                        while (true) {
                                                            o = o2;
                                                            try {
                                                                ((j0$a$a$a)o2).G = iterator;
                                                                o = o2;
                                                                ((j0$a$a$a)o2).H = 1;
                                                                o = o2;
                                                                final Object a = iterator.a((d)o2);
                                                                if (a == h) {
                                                                    return h;
                                                                }
                                                                o = o2;
                                                                if (!(boolean)a) {
                                                                    ((j0$a$a$a)o2).I.K.n().m((h1.c)((j0$a$a$a)o2).K.G);
                                                                    return j2.a;
                                                                }
                                                                o = o2;
                                                                final j2 j2 = (j2)iterator.next();
                                                                o = o2;
                                                                o = o2;
                                                                final j1$h j1$h = new j1$h();
                                                                o = o2;
                                                                j1$h.G = ((j0$a$a$a)o2).I.L.call();
                                                                o = o2;
                                                                final g g = (g)((j0$a$a$a)o2).M.G;
                                                                o = o2;
                                                                o = o2;
                                                                final p<r0, d<? super j2>, Object> p = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                                                                    int G;
                                                                    final /* synthetic */ j0$a$a$a H;
                                                                    final /* synthetic */ j1$h I;
                                                                    
                                                                    @e
                                                                    public final d<j2> create(@f final Object o, @e final d<?> d) {
                                                                        k0.p((Object)d, "completion");
                                                                        return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                                                            int G;
                                                                            final /* synthetic */ j0$a$a$a H = this.H;
                                                                            final /* synthetic */ j1$h I = this.I;
                                                                        };
                                                                    }
                                                                    
                                                                    public final Object invoke(final Object o, final Object o2) {
                                                                        return ((j0$a$a$a$a)this.create(o, (d<?>)o2)).invokeSuspend(kotlin.j2.a);
                                                                    }
                                                                    
                                                                    @f
                                                                    public final Object invokeSuspend(@e Object g) {
                                                                        final Object h = b.h();
                                                                        final int g2 = this.G;
                                                                        if (g2 != 0) {
                                                                            if (g2 != 1) {
                                                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                            }
                                                                            c1.n(g);
                                                                        }
                                                                        else {
                                                                            c1.n(g);
                                                                            final j j = this.H.J;
                                                                            g = this.I.G;
                                                                            this.G = 1;
                                                                            if (j.b(g, (d)this) == h) {
                                                                                return h;
                                                                            }
                                                                        }
                                                                        return kotlin.j2.a;
                                                                    }
                                                                };
                                                                o = o2;
                                                                ((j0$a$a$a)o2).G = iterator;
                                                                o = o2;
                                                                ((j0$a$a$a)o2).H = 2;
                                                                o = o2;
                                                                if (kotlinx.coroutines.h.i(g, (p)p, (d)o2) == h) {
                                                                    return h;
                                                                }
                                                                continue;
                                                            }
                                                            finally {}
                                                        }
                                                        c1.n(o);
                                                        this.I.K.n().a((h1.c)this.K.G);
                                                        iterator = ((h0)this.L).iterator();
                                                        continue;
                                                    }
                                                    iterator = (q)this.G;
                                                    c1.n(o);
                                                    final Object o2 = this;
                                                    final Object a = o;
                                                    continue;
                                                }
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            finally {}
                                        }
                                    }
                                }
                                this.I.K.n().m((h1.c)this.K.G);
                            }
                        };
                        this.H = 1;
                        if (kotlinx.coroutines.h.i((g)o2, (p)p, (d)this) == h) {
                            return h;
                        }
                    }
                    return j2.a;
                }
            });
        }
        
        @k
        @f
        public final <R> Object b(@e final r2 r2, final boolean b, @e final CancellationSignal cancellationSignal, @e final Callable<R> callable, @e final d<? super R> d) {
            if (r2.A() && r2.u()) {
                return callable.call();
            }
            final d3 d2 = (d3)d.getContext().get((g$c)d3.J);
            Object o = null;
            Label_0082: {
                if (d2 != null) {
                    final kotlin.coroutines.e i = d2.i();
                    if (i != null) {
                        o = i;
                        break Label_0082;
                    }
                }
                if (b) {
                    o = androidx.room.k0.b(r2);
                }
                else {
                    o = androidx.room.k0.a(r2);
                }
            }
            final kotlinx.coroutines.p p5 = new kotlinx.coroutines.p(b.d((d)d), 1);
            p5.H();
            ((kotlinx.coroutines.o)p5).t((l)new l<Throwable, j2>() {
                final /* synthetic */ k2 G = h.f((r0)b2.G, (g)o, (u0)null, (p)new p<r0, d<? super j2>, Object>(p5, null, o, callable, cancellationSignal) {
                    int G;
                    final /* synthetic */ kotlinx.coroutines.o H;
                    final /* synthetic */ kotlin.coroutines.e I;
                    final /* synthetic */ Callable J;
                    final /* synthetic */ CancellationSignal K;
                    
                    @e
                    public final d<j2> create(@f final Object o, @e final d<?> d) {
                        k0.p((Object)d, "completion");
                        return (d<j2>)new p<r0, d<? super j2>, Object>(this.H, d, this.I, this.J, this.K) {
                            int G;
                            final /* synthetic */ kotlinx.coroutines.o H;
                            final /* synthetic */ kotlin.coroutines.e I;
                            final /* synthetic */ Callable J;
                            final /* synthetic */ CancellationSignal K;
                        };
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((j0$a$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                    }
                    
                    @f
                    public final Object invokeSuspend(@e Object call) {
                        b.h();
                        if (this.G == 0) {
                            c1.n(call);
                            try {
                                call = this.J.call();
                                final kotlinx.coroutines.o h = this.H;
                                final b1$a h2 = b1.H;
                                ((d)h).resumeWith(b1.b(call));
                            }
                            finally {
                                final kotlinx.coroutines.o h3 = this.H;
                                final b1$a h4 = b1.H;
                                final Throwable t;
                                ((d)h3).resumeWith(b1.b(c1.a(t)));
                            }
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 2, (Object)null);
                
                public final void a(@f final Throwable t) {
                    if (Build$VERSION.SDK_INT >= 16) {
                        cancellationSignal.cancel();
                    }
                    k2$a.b(this.G, (CancellationException)null, 1, (Object)null);
                }
            });
            final Object y = p5.y();
            if (y == b.h()) {
                kotlin.coroutines.jvm.internal.h.c((d)d);
            }
            return y;
        }
        
        @k
        @f
        public final <R> Object c(@e final r2 r2, final boolean b, @e final Callable<R> callable, @e final d<? super R> d) {
            if (r2.A() && r2.u()) {
                return callable.call();
            }
            final d3 d2 = (d3)d.getContext().get((g$c)d3.J);
            if (d2 != null) {
                final kotlin.coroutines.e i = d2.i();
                if (i != null) {
                    final Object o = i;
                    return h.i((g)o, (p)new p<r0, d<?>, Object>() {
                        int G;
                        final /* synthetic */ Callable H;
                        
                        @e
                        public final d<j2> create(@f final Object o, @e final d<?> d) {
                            k0.p((Object)d, "completion");
                            return (d<j2>)new p<r0, d<?>, Object>() {
                                int G;
                                final /* synthetic */ Callable H;
                            };
                        }
                        
                        public final Object invoke(final Object o, final Object o2) {
                            return ((j0$a$d)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                        }
                        
                        @f
                        public final Object invokeSuspend(@e final Object o) {
                            b.h();
                            if (this.G == 0) {
                                c1.n(o);
                                return this.H.call();
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    }, (d)d);
                }
            }
            Object o;
            if (b) {
                o = androidx.room.k0.b(r2);
            }
            else {
                o = androidx.room.k0.a(r2);
            }
            return h.i((g)o, (p)new p<r0, d<?>, Object>() {
                int G;
                final /* synthetic */ Callable H;
                
                @e
                public final d<j2> create(@f final Object o, @e final d<?> d) {
                    k0.p((Object)d, "completion");
                    return (d<j2>)new p<r0, d<?>, Object>() {
                        int G;
                        final /* synthetic */ Callable H = this.H;
                    };
                }
                
                public final Object invoke(final Object o, final Object o2) {
                    return ((j0$a$d)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                }
                
                @f
                public final Object invokeSuspend(@e final Object o) {
                    b.h();
                    if (this.G == 0) {
                        c1.n(o);
                        return this.H.call();
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }, (d)d);
        }
    }
}
