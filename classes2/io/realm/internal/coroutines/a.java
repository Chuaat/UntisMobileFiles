// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.coroutines;

import io.realm.z;
import io.realm.y;
import io.realm.OrderedRealmCollection;
import io.realm.q0;
import io.realm.k;
import kotlin.p1;
import io.realm.p0;
import io.realm.n0;
import io.realm.j;
import kotlin.jvm.internal.m0;
import kotlinx.coroutines.channels.l0$a;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.channels.d0;
import kotlin.c1;
import io.realm.i0;
import kotlin.coroutines.intrinsics.b;
import io.realm.j0;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import kotlinx.coroutines.flow.l;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.i;
import io.realm.l0;
import org.jetbrains.annotations.e;
import io.realm.f0;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010$\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J0\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J6\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\r0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J0\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J6\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\r0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J0\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J6\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\r0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J0\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J6\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\r0\u0004\"\u0004\b\u0000\u0010\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\t*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001c0\u0004\"\b\b\u0000\u0010\t*\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001e\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016J$\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0\u001c0\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#¨\u0006'" }, d2 = { "Lio/realm/internal/coroutines/a;", "Lz5/a;", "Lio/realm/f0;", "realm", "Lkotlinx/coroutines/flow/i;", "f", "Lio/realm/j;", "dynamicRealm", "e", "T", "Lio/realm/s0;", "results", "c", "Lio/realm/rx/a;", "k", "g", "m", "Lio/realm/l0;", "realmList", "a", "list", "n", "b", "j", "Lio/realm/n0;", "realmObject", "d", "(Lio/realm/f0;Lio/realm/n0;)Lkotlinx/coroutines/flow/i;", "Lio/realm/rx/b;", "i", "Lio/realm/k;", "dynamicRealmObject", "h", "l", "", "Z", "returnFrozenObjects", "<init>", "(Z)V", "realm-android-library_baseRelease" }, k = 1, mv = { 1, 4, 0 })
public final class a implements z5.a
{
    private final boolean a;
    
    public a() {
        this(false, 1, null);
    }
    
    public a(final boolean a) {
        this.a = a;
    }
    
    public static final /* synthetic */ boolean o(final a a) {
        return a.a;
    }
    
    @e
    @Override
    public <T> i<l0<T>> a(@e final f0 f0, @e final l0<T> l0) {
        k0.q(f0, "realm");
        k0.q(l0, "realmList");
        if (f0.N()) {
            return (i<l0<T>>)l.Q0((Object)l0);
        }
        return (i<l0<T>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super l0<T>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ l0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super l0<T>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super l0<T>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ l0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$k)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$k$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final i0<l0<T>> j = new i0<l0<T>>() {
                            final /* synthetic */ a$k a;
                            
                            public final void b(@org.jetbrains.annotations.e l0<T> w) {
                                k0.q(w, "listenerResults");
                                if (s0.k((r0)g)) {
                                    if (!w.T()) {
                                        l0$a.a((kotlinx.coroutines.channels.l0)g, (Throwable)null, 1, (Object)null);
                                    }
                                    else {
                                        kotlinx.coroutines.channels.f0 f0;
                                        if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                            f0 = g;
                                            w = w.w();
                                        }
                                        else {
                                            f0 = g;
                                        }
                                        ((kotlinx.coroutines.channels.l0)f0).offer((Object)w);
                                    }
                                }
                            }
                        };
                        this.M.n(j);
                        l0 l0;
                        if (a.o(this.L)) {
                            l0 = this.M.w();
                        }
                        else {
                            l0 = this.M;
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)l0);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$k G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.H(j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<l0<T>> b(@e final j j, @e final l0<T> l0) {
        k0.q(j, "dynamicRealm");
        k0.q(l0, "realmList");
        if (j.N()) {
            return (i<l0<T>>)l.Q0((Object)l0);
        }
        return (i<l0<T>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super l0<T>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ l0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super l0<T>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super l0<T>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ l0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$l)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final j j = (j)this.I;
                            final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$l$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j g3 = j.G0(this.N);
                        final i0<l0<T>> l = new i0<l0<T>>() {
                            final /* synthetic */ a$l a;
                            
                            public final void b(@org.jetbrains.annotations.e l0<T> w) {
                                k0.q(w, "listenerResults");
                                if (s0.k((r0)g)) {
                                    if (!w.T()) {
                                        l0$a.a((kotlinx.coroutines.channels.l0)g, (Throwable)null, 1, (Object)null);
                                    }
                                    else {
                                        kotlinx.coroutines.channels.f0 f0;
                                        if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                            f0 = g;
                                            w = w.w();
                                        }
                                        else {
                                            f0 = g;
                                        }
                                        ((kotlinx.coroutines.channels.l0)f0).offer((Object)w);
                                    }
                                }
                            }
                        };
                        this.M.n(l);
                        l0 l2;
                        if (a.o(this.L)) {
                            l2 = this.M.w();
                        }
                        else {
                            l2 = this.M;
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)l2);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$l G;
                            
                            public final void invoke() {
                                final j h = g3;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.H(l);
                                    g3.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = g3;
                        this.J = l;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.s0<T>> c(@e final f0 f0, @e final io.realm.s0<T> s0) {
        k0.q(f0, "realm");
        k0.q(s0, "results");
        if (f0.N()) {
            return (i<io.realm.s0<T>>)l.Q0((Object)s0);
        }
        return (i<io.realm.s0<T>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ io.realm.s0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ io.realm.s0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$i)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$i$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final i0<io.realm.s0<T>> j = new i0<io.realm.s0<T>>() {
                            final /* synthetic */ a$i a;
                            
                            public final void b(@org.jetbrains.annotations.e final io.realm.s0<T> s0) {
                                k0.q(s0, "listenerResults");
                                if (s0.k((r0)g)) {
                                    io.realm.s0<T> f;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        f = s0.F();
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b2 = g;
                                        f = s0;
                                        o = b2;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)f);
                                }
                            }
                        };
                        this.M.p(j);
                        io.realm.s0 s0;
                        if (a.o(this.L)) {
                            s0 = this.M.F();
                        }
                        else {
                            s0 = this.M;
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)s0);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$i G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.K(j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T extends n0> i<T> d(@e final f0 f0, @e final T t) {
        k0.q(f0, "realm");
        k0.q(t, "realmObject");
        if (f0.N()) {
            return (i<T>)l.Q0((Object)t);
        }
        return (i<T>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super T>, d<? super j2>, Object>(t) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ f0 M;
            final /* synthetic */ j0 N;
            final /* synthetic */ n0 O;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super T>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super T>, kotlin.coroutines.d<? super j2>, Object>() {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ f0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                    final /* synthetic */ n0 O = this.O;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$m)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (this.M.isClosed()) {
                        final n6.a<j2> g2 = a$m$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final i0<T> j = new i0<n0>() {
                            final /* synthetic */ a$m a;
                            
                            public final void b(@org.jetbrains.annotations.e final T t) {
                                k0.q(t, "listenerObj");
                                if (s0.k((r0)g)) {
                                    T e8;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        e8 = p0.e8(t);
                                        if (e8 == null) {
                                            throw new p1("null cannot be cast to non-null type T");
                                        }
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b2 = g;
                                        e8 = t;
                                        o = b2;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)e8);
                                }
                            }
                        };
                        p0.U7(this.O, (i0<n0>)j);
                        if (p0.i8(this.O)) {
                            n0 n0;
                            if (a.o(this.L)) {
                                n0 = p0.e8(this.O);
                                k0.h(n0, "RealmObject.freeze(realmObject)");
                            }
                            else {
                                n0 = this.O;
                            }
                            ((kotlinx.coroutines.channels.l0)g).offer((Object)n0);
                        }
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$m G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    p0.p8(this.G.O, j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public i<j> e(@e final j j) {
        k0.q(j, "dynamicRealm");
        if (j.N()) {
            return (i<j>)l.Q0((Object)j);
        }
        return (i<j>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super j>, d<? super j2>, Object>() {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ j M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super j>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super j>, kotlin.coroutines.d<? super j2>, Object>() {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ j M = this.M;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$h)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final i0 i0 = (i0)this.J;
                    final j j = (j)this.I;
                    final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    final j g2 = j.G0(this.M.D());
                    final i0<j> l = (i0<j>)new i0<Object>() {
                        final /* synthetic */ a$h a;
                        
                        public final void b(@org.jetbrains.annotations.e final j j) {
                            k0.q(j, "listenerRealm");
                            if (s0.k((r0)g)) {
                                if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                    ((kotlinx.coroutines.channels.l0)g).offer((Object)this.a.M.D0());
                                }
                                else {
                                    ((kotlinx.coroutines.channels.l0)g).offer((Object)j);
                                }
                            }
                        }
                    };
                    g2.d0(l);
                    if (a.o(this.L)) {
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)g2.D0());
                    }
                    else {
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)g2);
                    }
                    final n6.a<j2> a = new n6.a<j2>() {
                        public final void invoke() {
                            g2.M0(l);
                            g2.close();
                        }
                    };
                    this.H = g;
                    this.I = g2;
                    this.J = l;
                    this.K = 1;
                    if (kotlinx.coroutines.channels.d0.a(g, (n6.a)a, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public i<f0> f(@e final f0 f0) {
        k0.q(f0, "realm");
        if (f0.N()) {
            return (i<f0>)l.Q0((Object)f0);
        }
        return (i<f0>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super f0>, d<? super j2>, Object>() {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ f0 M;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super f0>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super f0>, kotlin.coroutines.d<? super j2>, Object>() {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ f0 M = this.M;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$g)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    final i0 i0 = (i0)this.J;
                    final f0 f0 = (f0)this.I;
                    final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                    c1.n(o);
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    final f0 q2 = f0.q2(this.M.D());
                    final i0<f0> j = (i0<f0>)new i0<Object>() {
                        final /* synthetic */ a$g a;
                        
                        public final void b(@org.jetbrains.annotations.e final f0 f0) {
                            k0.q(f0, "listenerRealm");
                            if (s0.k((r0)g)) {
                                if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                    ((kotlinx.coroutines.channels.l0)g).offer((Object)this.a.M.Q1());
                                }
                                else {
                                    ((kotlinx.coroutines.channels.l0)g).offer((Object)f0);
                                }
                            }
                        }
                    };
                    q2.d0(j);
                    if (a.o(this.L)) {
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)q2.Q1());
                    }
                    else {
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)q2);
                    }
                    final n6.a<j2> a = new n6.a<j2>() {
                        public final void invoke() {
                            q2.X2(j);
                            q2.close();
                        }
                    };
                    this.H = g;
                    this.I = q2;
                    this.J = j;
                    this.K = 1;
                    if (kotlinx.coroutines.channels.d0.a(g, (n6.a)a, (kotlin.coroutines.d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.s0<T>> g(@e final j j, @e final io.realm.s0<T> s0) {
        k0.q(j, "dynamicRealm");
        k0.q(s0, "results");
        if (j.N()) {
            return (i<io.realm.s0<T>>)l.Q0((Object)s0);
        }
        return (i<io.realm.s0<T>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ io.realm.s0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.s0<T>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ io.realm.s0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$j)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final j j = (j)this.I;
                            final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$j$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j g3 = j.G0(this.N);
                        final i0<io.realm.s0<T>> l = new i0<io.realm.s0<T>>() {
                            final /* synthetic */ a$j a;
                            
                            public final void b(@org.jetbrains.annotations.e final io.realm.s0<T> s0) {
                                k0.q(s0, "listenerResults");
                                if (s0.k((r0)g)) {
                                    io.realm.s0<T> f;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        f = s0.F();
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b2 = g;
                                        f = s0;
                                        o = b2;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)f);
                                }
                            }
                        };
                        this.M.p(l);
                        io.realm.s0 s0;
                        if (a.o(this.L)) {
                            s0 = this.M.F();
                        }
                        else {
                            s0 = this.M;
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)s0);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$j G;
                            
                            public final void invoke() {
                                final j h = g3;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.K(l);
                                    g3.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = g3;
                        this.J = l;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public i<k> h(@e final j j, @e final k k) {
        k0.q(j, "dynamicRealm");
        k0.q(k, "dynamicRealmObject");
        if (j.N()) {
            return (i<k>)l.Q0((Object)k);
        }
        return (i<k>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super k>, d<? super j2>, Object>(k) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ j M;
            final /* synthetic */ j0 N;
            final /* synthetic */ k O;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super k>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super k>, kotlin.coroutines.d<? super j2>, Object>() {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ j M = this.M;
                    final /* synthetic */ j0 N = this.N;
                    final /* synthetic */ k O = this.O;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$n)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final i0 i0 = (i0)this.J;
                            final j j = (j)this.I;
                            final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (this.M.isClosed()) {
                        final n6.a<j2> g2 = a$n$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j g3 = j.G0(this.N);
                        final i0<k> l = new i0<k>() {
                            final /* synthetic */ a$n a;
                            
                            public final void b(@org.jetbrains.annotations.e k d8) {
                                k0.q(d8, "listenerObj");
                                if (s0.k((r0)g)) {
                                    kotlinx.coroutines.channels.f0 f0;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        f0 = g;
                                        d8 = d8.d8();
                                        k0.h(d8, "listenerObj.freeze()");
                                    }
                                    else {
                                        f0 = g;
                                    }
                                    ((kotlinx.coroutines.channels.l0)f0).offer((Object)d8);
                                }
                            }
                        };
                        this.O.T7(l);
                        if (p0.i8(this.O)) {
                            k m;
                            if (a.o(this.L)) {
                                m = p0.e8(this.O);
                                k0.h(m, "RealmObject.freeze(dynamicRealmObject)");
                            }
                            else {
                                m = this.O;
                            }
                            ((kotlinx.coroutines.channels.l0)g).offer((Object)m);
                        }
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$n G;
                            
                            public final void invoke() {
                                final j h = g3;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.O.o8(l);
                                    g3.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = g3;
                        this.J = l;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T extends n0> i<io.realm.rx.b<T>> i(@e final f0 f0, @e final T t) {
        k0.q(f0, "realm");
        k0.q(t, "realmObject");
        if (f0.N()) {
            return (i<io.realm.rx.b<T>>)l.Q0((Object)new io.realm.rx.b(t, null));
        }
        return (i<io.realm.rx.b<T>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<T>>, d<? super j2>, Object>(t) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ f0 M;
            final /* synthetic */ j0 N;
            final /* synthetic */ n0 O;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<T>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<T>>, kotlin.coroutines.d<? super j2>, Object>() {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ f0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                    final /* synthetic */ n0 O = this.O;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$e)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final q0 q0 = (q0)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (this.M.isClosed()) {
                        final n6.a<j2> g2 = a$e$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final q0<T> j = new q0<n0>() {
                            final /* synthetic */ a$e a;
                            
                            @Override
                            public final void a(@org.jetbrains.annotations.e final T t, @org.jetbrains.annotations.f final io.realm.w w) {
                                k0.q(t, "listenerObject");
                                if (s0.k((r0)g)) {
                                    io.realm.rx.b b2;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        b2 = new io.realm.rx.b((E)p0.e8(t), w);
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b3 = g;
                                        b2 = new io.realm.rx.b((E)t, w);
                                        o = b3;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)b2);
                                }
                            }
                        };
                        p0.V7(this.O, (q0<n0>)j);
                        if (p0.i8(this.O)) {
                            io.realm.rx.b b;
                            if (a.o(this.L)) {
                                b = new io.realm.rx.b(p0.e8(this.O), null);
                            }
                            else {
                                b = new io.realm.rx.b((E)this.O, null);
                            }
                            ((kotlinx.coroutines.channels.l0)g).offer((Object)b);
                        }
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$e G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    p0.q8(this.G.O, j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.rx.a<l0<T>>> j(@e final j j, @e final l0<T> l0) {
        k0.q(j, "dynamicRealm");
        k0.q(l0, "list");
        if (j.N()) {
            return (i<io.realm.rx.a<l0<T>>>)l.Q0((Object)new io.realm.rx.a(l0, null));
        }
        return (i<io.realm.rx.a<l0<T>>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ l0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ l0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$d)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final z z = (z)this.J;
                            final j j = (j)this.I;
                            final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$d$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j g3 = j.G0(this.N);
                        final z<l0<T>> i = new z<l0<T>>() {
                            final /* synthetic */ a$d a;
                            
                            public final void b(@org.jetbrains.annotations.e final l0<T> l0, @org.jetbrains.annotations.e final y y) {
                                k0.q(l0, "listenerList");
                                k0.q(y, "changeSet");
                                if (s0.k((r0)g)) {
                                    if (!l0.T()) {
                                        l0$a.a((kotlinx.coroutines.channels.l0)g, (Throwable)null, 1, (Object)null);
                                    }
                                    else {
                                        io.realm.rx.a a;
                                        Object o;
                                        if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                            final kotlinx.coroutines.channels.f0 b = g;
                                            a = new io.realm.rx.a((E)l0.w(), y);
                                            o = b;
                                        }
                                        else {
                                            final kotlinx.coroutines.channels.f0 b2 = g;
                                            a = new io.realm.rx.a((E)l0, y);
                                            o = b2;
                                        }
                                        ((kotlinx.coroutines.channels.l0)o).offer((Object)a);
                                    }
                                }
                            }
                        };
                        this.M.m(i);
                        io.realm.rx.a a;
                        if (io.realm.internal.coroutines.a.o(this.L)) {
                            a = new io.realm.rx.a((E)this.M.w(), null);
                        }
                        else {
                            a = new io.realm.rx.a((E)this.M, null);
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)a);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$d G;
                            
                            public final void invoke() {
                                final j h = g3;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.G(i);
                                    g3.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = g3;
                        this.J = i;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.rx.a<io.realm.s0<T>>> k(@e final f0 f0, @e final io.realm.s0<T> s0) {
        k0.q(f0, "realm");
        k0.q(s0, "results");
        if (f0.N()) {
            return (i<io.realm.rx.a<io.realm.s0<T>>>)l.Q0((Object)new io.realm.rx.a(s0, null));
        }
        return (i<io.realm.rx.a<io.realm.s0<T>>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ io.realm.s0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ io.realm.s0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$a)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final z z = (z)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$a$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final z<io.realm.s0<T>> j = new z<io.realm.s0<T>>() {
                            final /* synthetic */ a$a a;
                            
                            public final void b(@org.jetbrains.annotations.e final io.realm.s0<T> s0, @org.jetbrains.annotations.e final y y) {
                                k0.q(s0, "listenerResults");
                                k0.q(y, "changeSet");
                                if (s0.k((r0)g)) {
                                    io.realm.rx.a a;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        a = new io.realm.rx.a((E)s0.F(), y);
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b2 = g;
                                        a = new io.realm.rx.a((E)s0, y);
                                        o = b2;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)a);
                                }
                            }
                        };
                        this.M.o(j);
                        io.realm.rx.a a;
                        if (io.realm.internal.coroutines.a.o(this.L)) {
                            a = new io.realm.rx.a((E)this.M.F(), null);
                        }
                        else {
                            a = new io.realm.rx.a((E)this.M, null);
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)a);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$a G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.J(j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public i<io.realm.rx.b<k>> l(@e final j j, @e final k k) {
        k0.q(j, "dynamicRealm");
        k0.q(k, "dynamicRealmObject");
        if (j.N()) {
            return (i<io.realm.rx.b<k>>)l.Q0((Object)new io.realm.rx.b(k, null));
        }
        return (i<io.realm.rx.b<k>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<k>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ k M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<k>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.b<k>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ k M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$f)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final q0 q0 = (q0)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!p0.k8(this.M)) {
                        final n6.a<j2> g2 = a$f$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final q0<k> j = new q0<Object>() {
                            final /* synthetic */ a$f a;
                            
                            public final void b(@org.jetbrains.annotations.e final k k, @org.jetbrains.annotations.f final io.realm.w w) {
                                k0.q(k, "listenerObject");
                                if (s0.k((r0)g)) {
                                    io.realm.rx.b b2;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        b2 = new io.realm.rx.b((E)p0.e8(k), w);
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b3 = g;
                                        b2 = new io.realm.rx.b((E)k, w);
                                        o = b3;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)b2);
                                }
                            }
                        };
                        p0.V7(this.M, j);
                        if (p0.i8(this.M)) {
                            io.realm.rx.b b;
                            if (a.o(this.L)) {
                                b = new io.realm.rx.b((E)p0.e8(this.M), null);
                            }
                            else {
                                b = new io.realm.rx.b((E)this.M, null);
                            }
                            ((kotlinx.coroutines.channels.l0)g).offer((Object)b);
                        }
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$f G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    p0.q8(this.G.M, j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.rx.a<io.realm.s0<T>>> m(@e final j j, @e final io.realm.s0<T> s0) {
        k0.q(j, "dynamicRealm");
        k0.q(s0, "results");
        if (j.N()) {
            return (i<io.realm.rx.a<io.realm.s0<T>>>)l.Q0((Object)new io.realm.rx.a(s0, null));
        }
        return (i<io.realm.rx.a<io.realm.s0<T>>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ io.realm.s0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<io.realm.s0<T>>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ io.realm.s0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$b)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final z z = (z)this.J;
                            final j j = (j)this.I;
                            final kotlinx.coroutines.channels.f0 f0 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$b$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final j g3 = j.G0(this.N);
                        final z<io.realm.s0<T>> i = new z<io.realm.s0<T>>() {
                            final /* synthetic */ a$b a;
                            
                            public final void b(@org.jetbrains.annotations.e final io.realm.s0<T> s0, @org.jetbrains.annotations.e final y y) {
                                k0.q(s0, "listenerResults");
                                k0.q(y, "changeSet");
                                if (s0.k((r0)g)) {
                                    io.realm.rx.a a;
                                    Object o;
                                    if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                        final kotlinx.coroutines.channels.f0 b = g;
                                        a = new io.realm.rx.a((E)s0.F(), y);
                                        o = b;
                                    }
                                    else {
                                        final kotlinx.coroutines.channels.f0 b2 = g;
                                        a = new io.realm.rx.a((E)s0, y);
                                        o = b2;
                                    }
                                    ((kotlinx.coroutines.channels.l0)o).offer((Object)a);
                                }
                            }
                        };
                        this.M.o(i);
                        io.realm.rx.a a;
                        if (io.realm.internal.coroutines.a.o(this.L)) {
                            a = new io.realm.rx.a((E)this.M.F(), null);
                        }
                        else {
                            a = new io.realm.rx.a((E)this.M, null);
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)a);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$b G;
                            
                            public final void invoke() {
                                final j h = g3;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.J(i);
                                    g3.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = g3;
                        this.J = i;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @e
    @Override
    public <T> i<io.realm.rx.a<l0<T>>> n(@e final f0 f0, @e final l0<T> l0) {
        k0.q(f0, "realm");
        k0.q(l0, "list");
        if (f0.N()) {
            return (i<io.realm.rx.a<l0<T>>>)l.Q0((Object)new io.realm.rx.a(l0, null));
        }
        return (i<io.realm.rx.a<l0<T>>>)l.u((p)new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, d<? super j2>, Object>(null) {
            private kotlinx.coroutines.channels.f0 G;
            Object H;
            Object I;
            Object J;
            int K;
            final /* synthetic */ a L;
            final /* synthetic */ l0 M;
            final /* synthetic */ j0 N;
            
            @org.jetbrains.annotations.e
            @Override
            public final kotlin.coroutines.d<j2> create(@org.jetbrains.annotations.f final Object o, @org.jetbrains.annotations.e final kotlin.coroutines.d<?> d) {
                k0.q(d, "completion");
                final p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, kotlin.coroutines.d<? super j2>, Object> p2 = new p<kotlinx.coroutines.channels.f0<? super io.realm.rx.a<l0<T>>>, kotlin.coroutines.d<? super j2>, Object>(d) {
                    private kotlinx.coroutines.channels.f0 G;
                    Object H;
                    Object I;
                    Object J;
                    int K;
                    final /* synthetic */ a L = this.L;
                    final /* synthetic */ l0 M = this.M;
                    final /* synthetic */ j0 N = this.N;
                };
                p2.G = (kotlinx.coroutines.channels.f0)o;
                return (kotlin.coroutines.d<j2>)p2;
            }
            
            @Override
            public final Object invoke(final Object o, final Object o2) {
                return ((a$c)this.create(o, (kotlin.coroutines.d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
            public final Object invokeSuspend(@org.jetbrains.annotations.e Object o) {
                final Object h = b.h();
                final int k = this.K;
                if (k != 0) {
                    if (k != 1) {
                        if (k == 2) {
                            final z z = (z)this.J;
                            final f0 f0 = (f0)this.I;
                            final kotlinx.coroutines.channels.f0 f2 = (kotlinx.coroutines.channels.f0)this.H;
                            c1.n(o);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    else {
                        final kotlinx.coroutines.channels.f0 f3 = (kotlinx.coroutines.channels.f0)this.H;
                        c1.n(o);
                    }
                }
                else {
                    c1.n(o);
                    final kotlinx.coroutines.channels.f0 g = this.G;
                    if (!this.M.T()) {
                        final n6.a<j2> g2 = a$c$a.G;
                        this.H = g;
                        this.K = 1;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)g2, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                    }
                    else {
                        final f0 q2 = f0.q2(this.N);
                        final z<l0<T>> j = new z<l0<T>>() {
                            final /* synthetic */ a$c a;
                            
                            public final void b(@org.jetbrains.annotations.e final l0<T> l0, @org.jetbrains.annotations.e final y y) {
                                k0.q(l0, "listenerList");
                                k0.q(y, "changeSet");
                                if (s0.k((r0)g)) {
                                    if (!l0.T()) {
                                        l0$a.a((kotlinx.coroutines.channels.l0)g, (Throwable)null, 1, (Object)null);
                                    }
                                    else {
                                        io.realm.rx.a a;
                                        Object o;
                                        if (io.realm.internal.coroutines.a.o(this.a.L)) {
                                            final kotlinx.coroutines.channels.f0 b = g;
                                            a = new io.realm.rx.a((E)l0.w(), y);
                                            o = b;
                                        }
                                        else {
                                            final kotlinx.coroutines.channels.f0 b2 = g;
                                            a = new io.realm.rx.a((E)l0, y);
                                            o = b2;
                                        }
                                        ((kotlinx.coroutines.channels.l0)o).offer((Object)a);
                                    }
                                }
                            }
                        };
                        this.M.m(j);
                        io.realm.rx.a a;
                        if (io.realm.internal.coroutines.a.o(this.L)) {
                            a = new io.realm.rx.a((E)this.M.w(), null);
                        }
                        else {
                            a = new io.realm.rx.a((E)this.M, null);
                        }
                        ((kotlinx.coroutines.channels.l0)g).offer((Object)a);
                        o = new n6.a<j2>() {
                            final /* synthetic */ a$c G;
                            
                            public final void invoke() {
                                final f0 h = q2;
                                k0.h(h, "flowRealm");
                                if (!h.isClosed()) {
                                    this.G.M.G(j);
                                    q2.close();
                                }
                            }
                        };
                        this.H = g;
                        this.I = q2;
                        this.J = j;
                        this.K = 2;
                        if (kotlinx.coroutines.channels.d0.a(g, (n6.a)o, (kotlin.coroutines.d)this) == h) {
                            return h;
                        }
                        return j2.a;
                    }
                }
                return j2.a;
            }
        });
    }
}
