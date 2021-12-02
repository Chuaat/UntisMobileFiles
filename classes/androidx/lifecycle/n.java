// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import kotlinx.coroutines.channels.h0;
import androidx.annotation.p0;
import java.time.Duration;
import kotlinx.coroutines.w2;
import kotlinx.coroutines.u0;
import kotlinx.coroutines.b2;
import kotlinx.coroutines.h;
import kotlinx.coroutines.r0;
import kotlinx.coroutines.i1;
import n6.l;
import kotlinx.coroutines.channels.r;
import kotlinx.coroutines.channels.q;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.j;
import n6.p;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.flow.i;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0007¨\u0006\f" }, d2 = { "T", "Lkotlinx/coroutines/flow/i;", "Lkotlin/coroutines/g;", "context", "", "timeoutInMs", "Landroidx/lifecycle/LiveData;", "d", "a", "Ljava/time/Duration;", "timeout", "e", "lifecycle-livedata-ktx_release" }, k = 2, mv = { 1, 4, 1 })
@g(name = "FlowLiveDataConversions")
public final class n
{
    @e
    public static final <T> i<T> a(@e final LiveData<T> liveData) {
        k0.p((Object)liveData, "$this$asFlow");
        return (i<T>)kotlinx.coroutines.flow.l.N0((p)new p<j<? super T>, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            Object H;
            Object I;
            int J;
            final /* synthetic */ LiveData K;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final p<j<? super T>, d<? super j2>, Object> p2 = (p<j<? super T>, d<? super j2>, Object>)new p<j<? super T>, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    Object H;
                    Object I;
                    int J;
                    final /* synthetic */ LiveData K = this.K;
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
                final int j = this.J;
                Object d = null;
                q iterator = null;
                Label_0345: {
                    if (j != 0) {
                        if (j == 1) {
                            final l0 l0 = (l0)this.I;
                            d = this.H;
                            final Object h2 = this.G;
                            c1.n(o);
                            o = l0;
                            break Label_0345;
                        }
                        Label_0083: {
                            if (j == 2) {
                                break Label_0083;
                            }
                            Label_0073: {
                                if (j != 3) {
                                    break Label_0073;
                                }
                                final q q = (q)this.I;
                                d = this.H;
                                Object i = this.G;
                                Object h2 = d;
                                try {
                                    c1.n(o);
                                    break Label_0345;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    i = this.I;
                                    d = this.H;
                                    final j k = (j)this.G;
                                    h2 = d;
                                    c1.n(o);
                                    h2 = d;
                                    break Label_0345;
                                }
                                finally {
                                    o = h2;
                                }
                            }
                        }
                    }
                    else {
                        c1.n(o);
                        final Object h2 = this.G;
                        d = r.d(-1, (kotlinx.coroutines.channels.n)null, (l)null, 6, (Object)null);
                        o = new l0<T>() {
                            @Override
                            public final void a(final T t) {
                                ((kotlinx.coroutines.channels.l0)d).offer((Object)t);
                            }
                        };
                        final w2 m = i1.e().M();
                        final p<r0, d<? super j2>, Object> p = (p<r0, d<? super j2>, Object>)new p<r0, d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ n$a H;
                            final /* synthetic */ l0 I;
                            
                            @e
                            public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                k0.p((Object)d, "completion");
                                return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                    int G;
                                    final /* synthetic */ n$a H = this.H;
                                    final /* synthetic */ l0 I = this.I;
                                };
                            }
                            
                            public final Object invoke(final Object o, final Object o2) {
                                return ((n$a$a)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                            }
                            
                            @org.jetbrains.annotations.f
                            public final Object invokeSuspend(@e final Object o) {
                                b.h();
                                if (this.G == 0) {
                                    c1.n(o);
                                    this.H.K.k(this.I);
                                    return j2.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        };
                        this.G = h2;
                        this.H = d;
                        this.I = o;
                        this.J = 1;
                        if (kotlinx.coroutines.h.i((kotlin.coroutines.g)m, (p)p, (d)this) == h) {
                            return h;
                        }
                        break Label_0345;
                    }
                    while (true) {
                        d = this;
                        break Label_0345;
                        try {
                            iterator = ((h0)d).iterator();
                            d = this;
                            try {
                                Object h2 = null;
                                ((n$a)d).G = h2;
                                ((n$a)d).H = o;
                                ((n$a)d).I = iterator;
                                ((n$a)d).J = 2;
                                final Object a = iterator.a((d)d);
                                if (a == h) {
                                    return h;
                                }
                                final Object i = iterator;
                                final Object o2 = a;
                                final Object o3 = h2;
                                h2 = o;
                                o = o2;
                                iterator = (q)o3;
                                try {
                                    if (o) {
                                        o = ((q)i).next();
                                        ((n$a)d).G = iterator;
                                        ((n$a)d).H = h2;
                                        ((n$a)d).I = i;
                                        ((n$a)d).J = 3;
                                        o = ((j)iterator).b(o, (d)d);
                                        if (o == h) {
                                            return h;
                                        }
                                        o = h2;
                                        h2 = iterator;
                                    }
                                    kotlinx.coroutines.h.f((r0)b2.G, (kotlin.coroutines.g)i1.e().M(), (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                                        int G;
                                        final /* synthetic */ n$a H;
                                        final /* synthetic */ l0 I;
                                        
                                        @e
                                        public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                                            k0.p((Object)d, "completion");
                                            return (d<j2>)new p<r0, d<? super j2>, Object>() {
                                                int G;
                                                final /* synthetic */ n$a H;
                                                final /* synthetic */ l0 I;
                                            };
                                        }
                                        
                                        public final Object invoke(final Object o, final Object o2) {
                                            return ((n$a$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                                        }
                                        
                                        @org.jetbrains.annotations.f
                                        public final Object invokeSuspend(@e final Object o) {
                                            b.h();
                                            if (this.G == 0) {
                                                c1.n(o);
                                                this.H.K.o(this.I);
                                                return j2.a;
                                            }
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                    }, 2, (Object)null);
                                    return j2.a;
                                }
                                finally {
                                    o = h2;
                                }
                            }
                            finally {}
                        }
                        finally {
                            continue;
                        }
                        break;
                    }
                }
                kotlinx.coroutines.h.f((r0)b2.G, (kotlin.coroutines.g)i1.e().M(), (u0)null, (p)new p<r0, d<? super j2>, Object>() {
                    int G;
                    final /* synthetic */ n$a H;
                    final /* synthetic */ l0 I;
                    
                    @e
                    public final d<j2> create(@org.jetbrains.annotations.f final Object o, @e final d<?> d) {
                        k0.p((Object)d, "completion");
                        return (d<j2>)new p<r0, d<? super j2>, Object>() {
                            int G;
                            final /* synthetic */ n$a H = this.H;
                            final /* synthetic */ l0 I = this.I;
                        };
                    }
                    
                    public final Object invoke(final Object o, final Object o2) {
                        return ((n$a$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
                    }
                    
                    @org.jetbrains.annotations.f
                    public final Object invokeSuspend(@e final Object o) {
                        b.h();
                        if (this.G == 0) {
                            c1.n(o);
                            this.H.K.o(this.I);
                            return j2.a;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }, 2, (Object)null);
                throw iterator;
            }
        });
    }
    
    @m6.h
    @e
    public static final <T> LiveData<T> b(@e final i<? extends T> i) {
        return (LiveData<T>)f(i, null, 0L, 3, null);
    }
    
    @m6.h
    @e
    public static final <T> LiveData<T> c(@e final i<? extends T> i, @e final kotlin.coroutines.g g) {
        return (LiveData<T>)f(i, g, 0L, 2, null);
    }
    
    @m6.h
    @e
    public static final <T> LiveData<T> d(@e final i<? extends T> i, @e final kotlin.coroutines.g g, final long n) {
        k0.p((Object)i, "$this$asLiveData");
        k0.p((Object)g, "context");
        return androidx.lifecycle.h.b(g, n, (n6.p<? super g0<T>, ? super d<? super j2>, ?>)new p<g0<T>, d<? super j2>, Object>() {
            private /* synthetic */ Object G;
            int H;
            final /* synthetic */ i I;
            
            @e
            public final d<j2> create(@org.jetbrains.annotations.f final Object g, @e final d<?> d) {
                k0.p((Object)d, "completion");
                final p<g0<T>, d<? super j2>, Object> p2 = (p<g0<T>, d<? super j2>, Object>)new p<g0<T>, d<? super j2>, Object>() {
                    private /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ i I = this.I;
                };
                p2.G = g;
                return (d<j2>)p2;
            }
            
            public final Object invoke(final Object o, final Object o2) {
                return ((n$b)this.create(o, (d<?>)o2)).invokeSuspend(j2.a);
            }
            
            @org.jetbrains.annotations.f
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
                    final g0 g0 = (g0)this.G;
                    final i i = this.I;
                    final j<T> j = (j<T>)new j<T>() {
                        @org.jetbrains.annotations.f
                        public Object b(Object b, @e final d d) {
                            b = g0.b(b, d);
                            if (b == b.h()) {
                                return b;
                            }
                            return j2.a;
                        }
                    };
                    this.H = 1;
                    if (i.c((j)j, (d)this) == h) {
                        return h;
                    }
                }
                return j2.a;
            }
        });
    }
    
    @p0(26)
    @e
    public static final <T> LiveData<T> e(@e final i<? extends T> i, @e final kotlin.coroutines.g g, @e final Duration duration) {
        k0.p((Object)i, "$this$asLiveData");
        k0.p((Object)g, "context");
        k0.p((Object)duration, "timeout");
        return d(i, g, duration.toMillis());
    }
    
    public static /* synthetic */ LiveData f(final i i, kotlin.coroutines.g h, long n, final int n2, final Object o) {
        if ((n2 & 0x1) != 0x0) {
            h = (kotlin.coroutines.g)kotlin.coroutines.i.H;
        }
        if ((n2 & 0x2) != 0x0) {
            n = 5000L;
        }
        return d((kotlinx.coroutines.flow.i<?>)i, h, n);
    }
}
