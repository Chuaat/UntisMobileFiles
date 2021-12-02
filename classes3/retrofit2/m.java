// 
// Decompiled by Procyon v0.5.36
// 

package retrofit2;

import kotlinx.coroutines.i1;
import kotlin.coroutines.jvm.internal.h;
import java.lang.reflect.Method;
import kotlin.x;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import kotlin.jvm.internal.k0;
import kotlinx.coroutines.o;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.p;
import kotlin.coroutines.d;
import org.jetbrains.annotations.e;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a\u001c\u0010\u0002\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0002\u0010\u0003\u001a'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0000*\u00020\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005H\u0087@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u0007\u001a\u001b\u0010\u000e\u001a\u00020\r*\u00060\u000bj\u0002`\fH\u0080@\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "T", "Lretrofit2/u;", "d", "(Lretrofit2/u;)Ljava/lang/Object;", "", "Lretrofit2/b;", "a", "(Lretrofit2/b;Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "Lretrofit2/t;", "c", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "e", "(Ljava/lang/Exception;Lkotlin/coroutines/d;)Ljava/lang/Object;", "retrofit" }, k = 2, mv = { 1, 4, 0 })
@g(name = "KotlinExtensions")
public final class m
{
    @f
    public static final <T> Object a(@e final b<T> b, @e final d<? super T> d) {
        final p p2 = new p((d<? super T>)kotlin.coroutines.intrinsics.b.d((d)d), 1);
        p2.t((l)new l<Throwable, j2>() {
            public final void a(@f final Throwable t) {
                b.cancel();
            }
        });
        b.N2(new retrofit2.d<T>() {
            @Override
            public void a(@e final b<T> b, @e final Throwable t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "t");
                final o a = p2;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)a).resumeWith(b1.b(c1.a(t)));
            }
            
            @Override
            public void b(@e final b<T> b, @e final t<T> t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "response");
                Object o;
                o o2;
                if (t.g()) {
                    o = t.a();
                    if (o == null) {
                        final retrofit2.l p2 = b.k().p((Class<? extends retrofit2.l>)retrofit2.l.class);
                        if (p2 == null) {
                            k0.L();
                        }
                        k0.h((Object)p2, "call.request().tag(Invocation::class.java)!!");
                        final Method b2 = p2.b();
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Response from ");
                        k0.h((Object)b2, "method");
                        final Class<?> declaringClass = b2.getDeclaringClass();
                        k0.h((Object)declaringClass, "method.declaringClass");
                        sb.append(declaringClass.getName());
                        sb.append('.');
                        sb.append(b2.getName());
                        sb.append(" was null but response body type was declared as non-null");
                        final x x = new x(sb.toString());
                        o2 = p2;
                        final b1$a h = b1.H;
                        o = c1.a((Throwable)x);
                    }
                    else {
                        o2 = p2;
                        final b1$a h2 = b1.H;
                    }
                }
                else {
                    o2 = p2;
                    final j j = new j(t);
                    final b1$a h3 = b1.H;
                    o = c1.a((Throwable)j);
                }
                ((kotlin.coroutines.d)o2).resumeWith(b1.b(o));
            }
        });
        final Object y = p2.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @g(name = "awaitNullable")
    @f
    public static final <T> Object b(@e final b<T> b, @e final d<? super T> d) {
        final p p2 = new p((d<? super T>)kotlin.coroutines.intrinsics.b.d((d)d), 1);
        p2.t((l)new l<Throwable, j2>() {
            public final void a(@f final Throwable t) {
                b.cancel();
            }
        });
        b.N2(new retrofit2.d<T>() {
            @Override
            public void a(@e final b<T> b, @e final Throwable t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "t");
                final o a = p2;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)a).resumeWith(b1.b(c1.a(t)));
            }
            
            @Override
            public void b(@e final b<T> b, @e final t<T> t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "response");
                o o;
                Object o2;
                if (t.g()) {
                    o = p2;
                    o2 = t.a();
                    final b1$a h = b1.H;
                }
                else {
                    o = p2;
                    final j j = new j(t);
                    final b1$a h2 = b1.H;
                    o2 = c1.a((Throwable)j);
                }
                ((kotlin.coroutines.d)o).resumeWith(b1.b(o2));
            }
        });
        final Object y = p2.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @f
    public static final <T> Object c(@e final b<T> b, @e final d<? super t<T>> d) {
        final p p2 = new p((d<? super T>)kotlin.coroutines.intrinsics.b.d((d)d), 1);
        p2.t((l)new l<Throwable, j2>() {
            public final void a(@f final Throwable t) {
                b.cancel();
            }
        });
        b.N2(new retrofit2.d<T>() {
            @Override
            public void a(@e final b<T> b, @e final Throwable t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "t");
                final o a = p2;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)a).resumeWith(b1.b(c1.a(t)));
            }
            
            @Override
            public void b(@e final b<T> b, @e final t<T> t) {
                k0.q((Object)b, "call");
                k0.q((Object)t, "response");
                final o a = p2;
                final b1$a h = b1.H;
                ((kotlin.coroutines.d)a).resumeWith(b1.b((Object)t));
            }
        });
        final Object y = p2.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @f
    public static final Object e(@e Exception i, @e final d<?> d) {
        Object o = null;
        Label_0046: {
            if (d instanceof m$h) {
                final kotlin.coroutines.jvm.internal.d d2 = (m$h)d;
                final int h = d2.H;
                if ((h & Integer.MIN_VALUE) != 0x0) {
                    d2.H = h + Integer.MIN_VALUE;
                    o = d2;
                    break Label_0046;
                }
            }
            o = new kotlin.coroutines.jvm.internal.d(d) {
                /* synthetic */ Object G;
                int H;
                Object I;
                
                @f
                public final Object invokeSuspend(@e final Object g) {
                    this.G = g;
                    this.H |= Integer.MIN_VALUE;
                    return m.e(null, (d<?>)this);
                }
            };
        }
        final Object g = ((m$h)o).G;
        final Object h2 = kotlin.coroutines.intrinsics.b.h();
        final int h3 = ((m$h)o).H;
        if (h3 != 0) {
            if (h3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = (Exception)((m$h)o).I;
            c1.n(g);
        }
        else {
            c1.n(g);
            ((m$h)o).I = i;
            ((m$h)o).H = 1;
            i1.a().H(((d)o).getContext(), new Runnable() {
                @Override
                public final void run() {
                    final d d = kotlin.coroutines.intrinsics.b.d(o);
                    final Exception h = i;
                    final b1$a h2 = b1.H;
                    d.resumeWith(b1.b(c1.a((Throwable)h)));
                }
            });
            final Object h4 = kotlin.coroutines.intrinsics.b.h();
            if (h4 == kotlin.coroutines.intrinsics.b.h()) {
                h.c((d)o);
            }
            if (h4 == h2) {
                return h2;
            }
        }
        return j2.a;
    }
}
