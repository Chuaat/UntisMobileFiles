// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room;

import kotlinx.coroutines.r3;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.b0;
import java.util.concurrent.RejectedExecutionException;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlin.b1$a;
import kotlin.coroutines.g$b;
import kotlin.b1;
import kotlin.coroutines.g$c;
import kotlin.c1;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.o;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.k2$a;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.e;
import kotlin.coroutines.d;
import kotlinx.coroutines.k2;
import java.util.concurrent.Executor;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b*\u00020\u0001H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011" }, d2 = { "R", "Landroidx/room/r2;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "block", "c", "(Landroidx/room/r2;Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "b", "(Landroidx/room/r2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/util/concurrent/Executor;", "Lkotlinx/coroutines/k2;", "controlJob", "Lkotlin/coroutines/e;", "a", "(Ljava/util/concurrent/Executor;Lkotlinx/coroutines/k2;Lkotlin/coroutines/d;)Ljava/lang/Object;", "room-ktx_release" }, k = 2, mv = { 1, 4, 2 })
public final class s2
{
    static final /* synthetic */ Object a(final Executor executor, final k2 k2, final d<? super e> d) {
        final p p3 = new p(b.d((d)d), 1);
        p3.H();
        ((o)p3).t((l)new l<Throwable, j2>() {
            public final void a(@f final Throwable t) {
                k2$a.b(k2, (CancellationException)null, 1, (Object)null);
            }
        });
        try {
            executor.execute(new Runnable() {
                @Override
                public final void run() {
                    h.h((g)null, (n6.p)new n6.p<r0, d<? super j2>, Object>() {
                        private /* synthetic */ Object G;
                        int H;
                        final /* synthetic */ s2$b I;
                        
                        @org.jetbrains.annotations.e
                        public final d<j2> create(@f final Object g, @org.jetbrains.annotations.e final d<?> d) {
                            k0.p((Object)d, "completion");
                            final n6.p<r0, d<? super j2>, Object> p2 = (n6.p<r0, d<? super j2>, Object>)new n6.p<r0, d<? super j2>, Object>() {
                                private /* synthetic */ Object G;
                                int H;
                                final /* synthetic */ s2$b I = this.I;
                            };
                            p2.G = g;
                            return (d<j2>)p2;
                        }
                        
                        public final Object invoke(final Object o, final Object o2) {
                            return ((s2$b$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                        }
                        
                        @f
                        public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
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
                                final r0 r0 = (r0)this.G;
                                final o g = (o)p3;
                                final g$b value = r0.J().get((g$c)e.q);
                                k0.m((Object)value);
                                final b1$a h3 = b1.H;
                                ((d)g).resumeWith(b1.b((Object)value));
                                final k2 i = k2;
                                this.H = 1;
                                if (i.s((d)this) == h) {
                                    return h;
                                }
                            }
                            return j2.a;
                        }
                    }, 1, (Object)null);
                }
            });
        }
        catch (RejectedExecutionException cause) {
            ((o)p3).c((Throwable)new IllegalStateException("Unable to acquire a thread to perform the database transaction.", cause));
        }
        final Object y = p3.y();
        if (y == b.h()) {
            kotlin.coroutines.jvm.internal.h.c((d)d);
        }
        return y;
    }
    
    static final /* synthetic */ Object b(final r2 i, final d<? super g> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0046: {
            if (d instanceof s2$c) {
                final kotlin.coroutines.jvm.internal.d d2 = (s2$c)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0046;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return s2.b(null, (d<? super g>)this);
                }
            };
        }
        Object g = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Object o;
        r2 r2;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = d3.J;
            r2 = (r2)d3.I;
            c1.n(g);
        }
        else {
            c1.n(g);
            final b0 d4 = o2.d((k2)null, 1, (Object)null);
            final k2 k2 = (k2)((d)d3).getContext().get((g$c)kotlinx.coroutines.k2.t);
            if (k2 != null) {
                k2.N((l)new l<Throwable, j2>() {
                    public final void a(@f final Throwable t) {
                        k2$a.b((k2)d4, (CancellationException)null, 1, (Object)null);
                    }
                });
            }
            final Executor s = i.s();
            k0.o((Object)s, "transactionExecutor");
            d3.I = i;
            d3.J = d4;
            d3.H = 1;
            final Object a = a(s, (k2)d4, (d<? super e>)d3);
            if (a == h2) {
                return h2;
            }
            r2 = i;
            o = d4;
            g = a;
        }
        final e e = (e)g;
        final d3 d5 = new d3((k2)o, e);
        final ThreadLocal<Integer> r3 = r2.r();
        k0.o((Object)r3, "suspendingTransactionId");
        return ((g)e).plus((g)d5).plus((g)kotlinx.coroutines.r3.a((ThreadLocal)r3, (Object)kotlin.coroutines.jvm.internal.b.f(System.identityHashCode(o))));
    }
    
    @f
    public static final <R> Object c(@org.jetbrains.annotations.e r2 i, @org.jetbrains.annotations.e l<? super d<? super R>, ?> j, @org.jetbrains.annotations.e final d<? super R> d) {
        kotlin.coroutines.jvm.internal.d d3 = null;
        Label_0049: {
            if (d instanceof s2$e) {
                final kotlin.coroutines.jvm.internal.d d2 = (s2$e)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0049;
                }
            }
            d3 = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                Object J;
                
                @f
                public final Object invokeSuspend(@org.jetbrains.annotations.e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return s2.c((r2)null, (n6.l<? super kotlin.coroutines.d<? super Object>, ?>)null, (kotlin.coroutines.d<? super Object>)this);
                }
            };
        }
        Object o = d3.G;
        final Object h2 = b.h();
        final int h3 = d3.H;
        Object k = null;
        Label_0200: {
            if (h3 != 0) {
                if (h3 != 1) {
                    if (h3 == 2) {
                        c1.n(o);
                        return o;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    j = (l)d3.J;
                    i = (r2)d3.I;
                    c1.n(o);
                }
            }
            else {
                c1.n(o);
                final d3 d4 = (d3)((d)d3).getContext().get((g$c)androidx.room.d3.J);
                if (d4 != null) {
                    k = d4.i();
                    if (k != null) {
                        break Label_0200;
                    }
                }
                d3.I = i;
                d3.J = j;
                d3.H = 1;
                if ((o = b(i, (d<? super g>)d3)) == h2) {
                    return h2;
                }
            }
            k = o;
        }
        final n6.p<r0, d<? super R>, Object> p3 = (n6.p<r0, d<? super R>, Object>)new n6.p<r0, d<? super R>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ r2 I;
            final /* synthetic */ l J;
            
            @org.jetbrains.annotations.e
            public final d<j2> create(@f final Object g, @org.jetbrains.annotations.e final d<?> d) {
                k0.p((Object)d, "completion");
                final n6.p<r0, d<? super R>, Object> p2 = (n6.p<r0, d<? super R>, Object>)new n6.p<r0, d<? super R>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ r2 I = this.I;
                    final /* synthetic */ l J = this.J;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((s2$f)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object g) {
                final Object h = b.h();
                final int h2 = this.H;
                Label_0164: {
                    if (h2 != 0) {
                        if (h2 == 1) {
                            final Object o = this.G;
                            try {
                                c1.n(g);
                                final Object invoke = g;
                                break Label_0164;
                            }
                            finally {
                                break Label_0164;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c1.n(g);
                    final g$b value = ((r0)this.G).J().get((g$c)androidx.room.d3.J);
                    k0.m((Object)value);
                    g = value;
                    ((d3)g).e();
                    try {
                        this.I.e();
                        Object invoke;
                        Object o2;
                        try {
                            final l j = this.J;
                            this.G = g;
                            this.H = 1;
                            invoke = j.invoke((Object)this);
                            if (invoke == h) {
                                return h;
                            }
                            o2 = g;
                            this.I.I();
                            g = o2;
                            final n6.p<r0, d<? super R>, Object> p = (n6.p<r0, d<? super R>, Object>)this;
                            final r2 r2 = p.I;
                            r2.k();
                            final Object o3 = o2;
                            ((d3)o3).k();
                            return invoke;
                        }
                        finally {
                            final Throwable t;
                            o2 = t;
                            final Object o = g;
                        }
                        try {
                            final n6.p<r0, d<? super R>, Object> p = (n6.p<r0, d<? super R>, Object>)this;
                            final r2 r2 = p.I;
                            r2.k();
                            final Object o3 = o2;
                            ((d3)o3).k();
                            return invoke;
                            final Object o;
                            g = o;
                            this.I.k();
                            g = o;
                            throw o2;
                        }
                        finally {}
                    }
                    finally {}
                }
                ((d3)g).k();
            }
        };
        d3.I = null;
        d3.J = null;
        d3.H = 2;
        if ((o = h.i((g)k, (n6.p)p3, (d)d3)) == h2) {
            return h2;
        }
        return o;
    }
}
