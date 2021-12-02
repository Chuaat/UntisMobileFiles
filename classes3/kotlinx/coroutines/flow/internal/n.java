// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.s0;
import kotlinx.coroutines.internal.p0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.b0;
import kotlin.jvm.internal.m0;
import java.util.Objects;
import kotlinx.coroutines.k2;
import kotlinx.coroutines.o2;
import kotlinx.coroutines.channels.d0;
import kotlinx.coroutines.channels.f0;
import kotlin.y0;
import kotlinx.coroutines.channels.h0;
import kotlinx.coroutines.channels.s;
import kotlinx.coroutines.u0;
import kotlin.coroutines.g;
import kotlinx.coroutines.h;
import kotlinx.coroutines.channels.l0;
import kotlinx.coroutines.f4;
import kotlin.collections.q0;
import java.util.concurrent.atomic.AtomicInteger;
import n6.l;
import kotlinx.coroutines.channels.r;
import kotlin.collections.m;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlinx.coroutines.r0;
import n6.p;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.q;
import n6.a;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.e;
import kotlinx.coroutines.flow.j;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0092\u0001\u0010\u000e\u001a\u00020\n\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0014\u0010\u0005\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0018\u00010\u00030\u000629\u0010\r\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\b¢\u0006\u0002\b\fH\u0081@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001ap\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004\"\u0004\b\u0000\u0010\u0010\"\u0004\b\u0001\u0010\u0011\"\u0004\b\u0002\u0010\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042(\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015*\u001c\b\u0002\u0010\u0017\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00162\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018" }, d2 = { "R", "T", "Lkotlinx/coroutines/flow/j;", "", "Lkotlinx/coroutines/flow/i;", "flows", "Lkotlin/Function0;", "arrayFactory", "Lkotlin/Function3;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "", "Lkotlin/s;", "transform", "a", "(Lkotlinx/coroutines/flow/j;[Lkotlinx/coroutines/flow/i;Ln6/a;Ln6/q;Lkotlin/coroutines/d;)Ljava/lang/Object;", "T1", "T2", "flow", "flow2", "b", "(Lkotlinx/coroutines/flow/i;Lkotlinx/coroutines/flow/i;Ln6/q;)Lkotlinx/coroutines/flow/i;", "Lkotlin/collections/q0;", "Update", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class n
{
    @y0
    @org.jetbrains.annotations.f
    public static final <R, T> Object a(@e final j<? super R> j, @e final i<? extends T>[] array, @e final a<T[]> a, @e final q<? super j<? super R>, ? super T[], ? super d<? super j2>, ?> q, @e final d<? super j2> d) {
        final Object c = q.c((n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, d<? super j2>, Object>(q) {
            private /* synthetic */ Object G;
            Object H;
            Object I;
            int J;
            int K;
            int L;
            final /* synthetic */ j M;
            final /* synthetic */ i[] N;
            final /* synthetic */ a O;
            final /* synthetic */ q P;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    Object H;
                    Object I;
                    int J;
                    int K;
                    int L;
                    final /* synthetic */ j M = this.M;
                    final /* synthetic */ i[] N = this.N;
                    final /* synthetic */ a O = this.O;
                    final /* synthetic */ q P = this.P;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((n$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@e Object o) {
                final Object h = b.h();
                final int l = this.L;
                final int n = 0;
                while (true) {
                    int i = 0;
                    int m = 0;
                    byte[] array4 = null;
                    kotlinx.coroutines.channels.o<? extends E> o5 = null;
                    Object[] array5 = null;
                    Object o6 = null;
                    Object o7 = null;
                    Label_0617: {
                        int k = 0;
                        int j = 0;
                        byte[] array = null;
                        kotlinx.coroutines.channels.o<? extends E> o2 = null;
                        Object o3 = null;
                        Object[] array3 = null;
                        Object o4 = null;
                        Label_0371: {
                            int length;
                            Object[] g;
                            int n3;
                            Object o8;
                            Object o9;
                            kotlinx.coroutines.channels.o<? extends E> h2;
                            byte[] i2;
                            if (l != 0) {
                                if (l == 1) {
                                    k = this.K;
                                    j = this.J;
                                    array = (byte[])this.I;
                                    o2 = (kotlinx.coroutines.channels.o<? extends E>)this.H;
                                    final Object[] array2 = (Object[])this.G;
                                    c1.n(o);
                                    o3 = o;
                                    o = h;
                                    array3 = array2;
                                    o4 = this;
                                    break Label_0371;
                                }
                                if (l != 2 && l != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i = this.K;
                                m = this.J;
                                array4 = (byte[])this.I;
                                o5 = (kotlinx.coroutines.channels.o<? extends E>)this.H;
                                array5 = (Object[])this.G;
                                c1.n(o);
                                o6 = this;
                                o7 = h;
                                break Label_0617;
                            }
                            else {
                                c1.n(o);
                                final r0 r0 = (r0)this.G;
                                length = this.N.length;
                                if (length == 0) {
                                    return j2.a;
                                }
                                g = new Object[length];
                                kotlin.collections.m.w2(g, (Object)w.b, 0, 0, 6, (Object)null);
                                final kotlinx.coroutines.channels.o d = r.d(length, null, null, 6, null);
                                final AtomicInteger atomicInteger = new AtomicInteger(length);
                                for (int n2 = 0; n2 < length; ++n2) {
                                    kotlinx.coroutines.h.f(r0, null, null, (p)new p<r0, d<? super j2>, Object>(atomicInteger) {
                                        int G;
                                        final /* synthetic */ n$a H;
                                        final /* synthetic */ int I;
                                        final /* synthetic */ kotlinx.coroutines.channels.o J;
                                        final /* synthetic */ AtomicInteger K;
                                        
                                        @e
                                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                                int G;
                                                final /* synthetic */ n$a H = this.H;
                                                final /* synthetic */ int I = this.I;
                                                final /* synthetic */ kotlinx.coroutines.channels.o J = this.J;
                                                final /* synthetic */ AtomicInteger K = this.K;
                                            };
                                        }
                                        
                                        public final Object invoke(final Object o, final Object o2) {
                                            return ((n$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                                        }
                                        
                                        @org.jetbrains.annotations.f
                                        public final Object invokeSuspend(@e Object c) {
                                            final Object h = b.h();
                                            final int g = this.G;
                                            Label_0035: {
                                                if (g == 0) {
                                                    break Label_0035;
                                                }
                                                Label_0025: {
                                                    if (g != 1) {
                                                        break Label_0025;
                                                    }
                                                    try {
                                                        c1.n(c);
                                                        Label_0085: {
                                                            return j2.a;
                                                        }
                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        c1.n(c);
                                                        final i i = this.H.N[this.I];
                                                        final j<T> j = new j<T>() {
                                                            final /* synthetic */ n$a$a G;
                                                            
                                                            @org.jetbrains.annotations.f
                                                            @Override
                                                            public Object b(Object o, @e final d d) {
                                                                Object o2 = null;
                                                                Label_0050: {
                                                                    if (d instanceof n$a$a$a$a) {
                                                                        final kotlin.coroutines.jvm.internal.d d2 = (n$a$a$a$a)d;
                                                                        final int h = d2.H;
                                                                        if ((h & Integer.MIN_VALUE) != 0x0) {
                                                                            d2.H = h + Integer.MIN_VALUE;
                                                                            o2 = d2;
                                                                            break Label_0050;
                                                                        }
                                                                    }
                                                                    o2 = new kotlin.coroutines.jvm.internal.d(d) {
                                                                        /* synthetic */ Object G;
                                                                        int H;
                                                                        final /* synthetic */ n$a$a$a I;
                                                                        
                                                                        @org.jetbrains.annotations.f
                                                                        public final Object invokeSuspend(@e final Object g) {
                                                                            this.G = g;
                                                                            this.H |= Integer.MIN_VALUE;
                                                                            return this.I.b(null, (d)this);
                                                                        }
                                                                    };
                                                                }
                                                                final Object g = ((n$a$a$a$a)o2).G;
                                                                final Object h2 = b.h();
                                                                final int h3 = ((n$a$a$a$a)o2).H;
                                                                if (h3 != 0) {
                                                                    if (h3 != 1) {
                                                                        if (h3 == 2) {
                                                                            c1.n(g);
                                                                            return j2.a;
                                                                        }
                                                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                    }
                                                                    else {
                                                                        c1.n(g);
                                                                    }
                                                                }
                                                                else {
                                                                    c1.n(g);
                                                                    final p<r0, d<? super j2>, Object> g2 = (p<r0, d<? super j2>, Object>)this.G;
                                                                    final kotlinx.coroutines.channels.o j = g2.J;
                                                                    o = new q0(g2.I, o);
                                                                    ((n$a$a$a$a)o2).H = 1;
                                                                    if (j.U(o, (d<? super j2>)o2) == h2) {
                                                                        return h2;
                                                                    }
                                                                }
                                                                ((n$a$a$a$a)o2).H = 2;
                                                                if (f4.b((d<? super j2>)o2) == h2) {
                                                                    return h2;
                                                                }
                                                                return j2.a;
                                                            }
                                                        };
                                                        this.G = 1;
                                                        c = i.c(j, (d)this);
                                                        // iftrue(Label_0085:, c != h)
                                                        return h;
                                                    }
                                                    finally {
                                                        if (this.K.decrementAndGet() == 0) {
                                                            l0.a.a(this.J, null, 1, null);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }, 3, null);
                                }
                                final byte[] array6 = new byte[length];
                                n3 = n;
                                o8 = h;
                                o9 = this;
                                h2 = (kotlinx.coroutines.channels.o<? extends E>)d;
                                i2 = array6;
                            }
                            final byte k2 = (byte)(n3 + 1);
                            ((n$a)o9).G = g;
                            ((n$a)o9).H = h2;
                            ((n$a)o9).I = i2;
                            ((n$a)o9).J = length;
                            ((n$a)o9).K = k2;
                            ((n$a)o9).L = 1;
                            final Object f1 = s.F1((h0<?>)h2, (kotlin.coroutines.d<? super Object>)o9);
                            if (f1 == o8) {
                                return o8;
                            }
                            final Object o10 = o8;
                            final Object[] array7 = g;
                            array = i2;
                            o4 = o9;
                            o2 = h2;
                            o = o10;
                            array3 = array7;
                            o3 = f1;
                            j = length;
                            k = k2;
                        }
                        q0 q0 = (q0)o3;
                        if (q0 == null) {
                            return j2.a;
                        }
                        int n4 = j;
                        int n5;
                        while (true) {
                            final int e = q0.e();
                            final Object o11 = array3[e];
                            array3[e] = q0.f();
                            n5 = n4;
                            if (o11 == w.b) {
                                n5 = n4 - 1;
                            }
                            if (array[e] == k) {
                                break;
                            }
                            array[e] = (byte)k;
                            q0 = o2.poll();
                            if (q0 == null) {
                                break;
                            }
                            n4 = n5;
                        }
                        i = k;
                        m = n5;
                        array4 = array;
                        o5 = o2;
                        o6 = o4;
                        array5 = array3;
                        o7 = o;
                        if (n5 == 0) {
                            final Object[] array8 = (Object[])((n$a)o4).O.invoke();
                            if (array8 == null) {
                                final q p = ((n$a)o4).P;
                                final j m2 = ((n$a)o4).M;
                                ((n$a)o4).G = array3;
                                ((n$a)o4).H = o2;
                                ((n$a)o4).I = array;
                                ((n$a)o4).J = n5;
                                ((n$a)o4).K = k;
                                ((n$a)o4).L = 2;
                                i = k;
                                m = n5;
                                array4 = array;
                                o5 = o2;
                                o6 = o4;
                                array5 = array3;
                                if (p.invoke((Object)m2, (Object)array3, o4) == (o7 = o)) {
                                    return o;
                                }
                            }
                            else {
                                kotlin.collections.m.l1(array3, array8, 0, 0, 0, 14, (Object)null);
                                final q p2 = ((n$a)o4).P;
                                final j m3 = ((n$a)o4).M;
                                ((n$a)o4).G = array3;
                                ((n$a)o4).H = o2;
                                ((n$a)o4).I = array;
                                ((n$a)o4).J = n5;
                                ((n$a)o4).K = k;
                                ((n$a)o4).L = 3;
                                i = k;
                                m = n5;
                                array4 = array;
                                o5 = o2;
                                o6 = o4;
                                array5 = array3;
                                if (p2.invoke((Object)m3, (Object)array8, o4) == (o7 = o)) {
                                    return o;
                                }
                            }
                        }
                    }
                    Object[] g = array5;
                    Object o8 = o7;
                    int n3 = i;
                    byte[] i2 = array4;
                    kotlinx.coroutines.channels.o<? extends E> h2 = o5;
                    Object o9 = o6;
                    int length = m;
                    continue;
                }
            }
        }, (kotlin.coroutines.d<? super Object>)d);
        if (c == b.h()) {
            return c;
        }
        return j2.a;
    }
    
    @e
    public static final <T1, T2, R> i<R> b(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final q<? super T1, ? super T2, ? super d<? super R>, ?> q) {
        return new i<R>() {
            @org.jetbrains.annotations.f
            @Override
            public Object c(@e final j j, @e final d d) {
                final Object g = s0.g((n6.p<? super r0, ? super kotlin.coroutines.d<? super Object>, ?>)new p<r0, d<? super j2>, Object>(this) {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ j I;
                    final /* synthetic */ n$b J;
                    
                    @e
                    public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                        final p<r0, d<? super j2>, Object> p2 = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                            private /* synthetic */ Object G;
                            int H;
                            final /* synthetic */ j I = this.I;
                            final /* synthetic */ n$b J = this.J;
                        };
                        p2.G = g;
                        return (d<j2>)p2;
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((n$b$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@e Object h) {
                        final Object h2 = b.h();
                        final int h3 = this.H;
                        Object o = null;
                    Label_0255:
                        while (true) {
                            Object b = null;
                            Label_0237: {
                                if (h3 != 0) {
                                    if (h3 == 1) {
                                        final h0 h4 = (h0)(o = this.G);
                                        try {
                                            try {
                                                c1.n(h);
                                            }
                                            finally {}
                                        }
                                        catch (kotlinx.coroutines.flow.internal.a b) {
                                            h = h4;
                                            break Label_0237;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c1.n(h);
                                final r0 r0 = (r0)this.G;
                                h = d0.h(r0, null, 0, (p)new p<f0<? super Object>, d<? super j2>, Object>() {
                                    private /* synthetic */ Object G;
                                    int H;
                                    final /* synthetic */ n$b$a I;
                                    
                                    @e
                                    public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                                        final p<f0<? super Object>, d<? super j2>, Object> p2 = (p<f0<? super Object>, d<? super j2>, Object>)new p<f0<? super Object>, d<? super j2>, Object>() {
                                            private /* synthetic */ Object G;
                                            int H;
                                            final /* synthetic */ n$b$a I = this.I;
                                        };
                                        p2.G = g;
                                        return (d<j2>)p2;
                                    }
                                    
                                    public final Object invoke(final Object o, final Object o2) {
                                        return ((n$b$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
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
                                            final f0 f0 = (f0)this.G;
                                            final i g = j;
                                            final j<T2> j = new j<T2>() {
                                                @org.jetbrains.annotations.f
                                                @Override
                                                public Object b(Object o, @e final d d) {
                                                    final l0<Object> e = f0.e();
                                                    if (o == null) {
                                                        o = w.a;
                                                    }
                                                    o = e.U(o, (d<? super j2>)d);
                                                    if (o == kotlin.coroutines.intrinsics.b.h()) {
                                                        return o;
                                                    }
                                                    return j2.a;
                                                }
                                            };
                                            this.H = 1;
                                            if (g.c(j, (d)this) == h) {
                                                return h;
                                            }
                                        }
                                        return j2.a;
                                    }
                                }, 3, null);
                                final b0 d = o2.d(null, 1, null);
                                Objects.requireNonNull(h, "null cannot be cast to non-null type kotlinx.coroutines.channels.SendChannel<*>");
                                ((l0)h).K((l)new l<Throwable, j2>() {
                                    final /* synthetic */ n$b$a G;
                                    
                                    public final void a(@org.jetbrains.annotations.f final Throwable t) {
                                        if (d.a()) {
                                            d.d(new kotlinx.coroutines.flow.internal.a(this.G.I));
                                        }
                                    }
                                });
                                try {
                                    final g j = r0.J();
                                    b = p0.b(j);
                                    final g plus = r0.J().plus((g)d);
                                    final j2 a = j2.a;
                                    final p<j2, d<? super j2>, Object> p = (p<j2, d<? super j2>, Object>)new p<j2, d<? super j2>, Object>(h) {
                                        int G;
                                        final /* synthetic */ n$b$a H;
                                        final /* synthetic */ g I;
                                        final /* synthetic */ Object J;
                                        final /* synthetic */ h0 K;
                                        
                                        @e
                                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                            return (d<j2>)new p<j2, d<? super j2>, Object>() {
                                                int G;
                                                final /* synthetic */ n$b$a H = this.H;
                                                final /* synthetic */ g I = this.I;
                                                final /* synthetic */ Object J = this.J;
                                                final /* synthetic */ h0 K = this.K;
                                            };
                                        }
                                        
                                        public final Object invoke(final Object o, final Object o2) {
                                            return ((n$b$a$c)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
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
                                                final i h2 = i;
                                                final j<T1> j = new j<T1>() {
                                                    final /* synthetic */ n$b$a$c G;
                                                    
                                                    @org.jetbrains.annotations.f
                                                    @Override
                                                    public Object b(Object c, @e final d d) {
                                                        final p<j2, d<? super j2>, Object> g = (p<j2, d<? super j2>, Object>)this.G;
                                                        final g i = g.I;
                                                        final j2 a = j2.a;
                                                        c = kotlinx.coroutines.flow.internal.g.c(i, a, g.J, (n6.p<? super j2, ? super kotlin.coroutines.d<? super Object>, ?>)new p<j2, d<? super j2>, Object>(this) {
                                                            Object G;
                                                            int H;
                                                            final /* synthetic */ Object I;
                                                            final /* synthetic */ n$b$a$c$a J;
                                                            
                                                            @e
                                                            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                                                return (d<j2>)new p<j2, d<? super j2>, Object>() {
                                                                    Object G;
                                                                    int H;
                                                                    final /* synthetic */ Object I = this.I;
                                                                    final /* synthetic */ n$b$a$c$a J = this.J;
                                                                };
                                                            }
                                                            
                                                            public final Object invoke(final Object o, final Object o2) {
                                                                return ((n$b$a$c$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                                                            }
                                                            
                                                            @org.jetbrains.annotations.f
                                                            public final Object invokeSuspend(@e Object o) {
                                                                final Object h = kotlin.coroutines.intrinsics.b.h();
                                                                final int h2 = this.H;
                                                                j<Object> j = null;
                                                                Label_0213: {
                                                                    if (h2 != 0) {
                                                                        if (h2 != 1) {
                                                                            if (h2 == 2) {
                                                                                j = (j<Object>)this.G;
                                                                                c1.n(o);
                                                                                break Label_0213;
                                                                            }
                                                                            if (h2 == 3) {
                                                                                c1.n(o);
                                                                                return j2.a;
                                                                            }
                                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                                        }
                                                                        else {
                                                                            c1.n(o);
                                                                        }
                                                                    }
                                                                    else {
                                                                        c1.n(o);
                                                                        final h0 k = this.J.G.K;
                                                                        this.H = 1;
                                                                        if ((o = s.F1((h0<?>)k, (kotlin.coroutines.d<? super Object>)this)) == h) {
                                                                            return h;
                                                                        }
                                                                    }
                                                                    if (o == null) {
                                                                        throw new kotlinx.coroutines.flow.internal.a(this.J.G.H.I);
                                                                    }
                                                                    final p<r0, d<? super j2>, Object> h3 = (p<r0, d<? super j2>, Object>)this.J.G.H;
                                                                    final j i = h3.I;
                                                                    final q l = q;
                                                                    final Object m = this.I;
                                                                    Object o2;
                                                                    if ((o2 = o) == w.a) {
                                                                        o2 = null;
                                                                    }
                                                                    this.G = i;
                                                                    this.H = 2;
                                                                    kotlin.jvm.internal.h0.e(6);
                                                                    kotlin.jvm.internal.h0.e(6);
                                                                    o = l.invoke(m, o2, (Object)this);
                                                                    kotlin.jvm.internal.h0.e(7);
                                                                    kotlin.jvm.internal.h0.e(7);
                                                                    if (o == h) {
                                                                        return h;
                                                                    }
                                                                    j = (j<Object>)i;
                                                                }
                                                                this.G = null;
                                                                this.H = 3;
                                                                if (j.b(o, (d<? super j2>)this) == h) {
                                                                    return h;
                                                                }
                                                                return j2.a;
                                                            }
                                                        }, (kotlin.coroutines.d<? super Object>)d);
                                                        if (c == kotlin.coroutines.intrinsics.b.h()) {
                                                            return c;
                                                        }
                                                        return a;
                                                    }
                                                };
                                                this.G = 1;
                                                if (h2.c(j, (d)this) == h) {
                                                    return h;
                                                }
                                            }
                                            return j2.a;
                                        }
                                    };
                                    this.G = h;
                                    this.H = 1;
                                    if (kotlinx.coroutines.flow.internal.g.d(plus, a, null, (p)p, (d)this, 4, null) == h2) {
                                        return h2;
                                    }
                                    h0.a.b((h0)h, null, 1, null);
                                    return j2.a;
                                }
                                catch (kotlinx.coroutines.flow.internal.a a2) {}
                                finally {
                                    o = h;
                                    break Label_0255;
                                }
                            }
                            kotlinx.coroutines.flow.internal.r.b((kotlinx.coroutines.flow.internal.a)b, this.I);
                            continue;
                        }
                        h0.a.b((h0)o, null, 1, null);
                    }
                }, (kotlin.coroutines.d<? super Object>)d);
                if (g == b.h()) {
                    return g;
                }
                return j2.a;
            }
        };
    }
}
