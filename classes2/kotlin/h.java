// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.q1;
import kotlin.coroutines.intrinsics.b;
import java.util.Objects;
import kotlin.coroutines.i;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004BM\u00129\u0010$\u001a5\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\b\u0007\u0012\u0006\u0010\u0011\u001a\u00028\u0000\u00f8\u0001\u0000¢\u0006\u0004\b%\u0010&Je\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u000429\u0010\b\u001a5\b\u0001\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0002\b\u00072\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00028\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0017\u001a\u00028\u0003\"\u0004\b\u0002\u0010\u0014\"\u0004\b\u0003\u0010\u0015*\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00162\u0006\u0010\u0011\u001a\u00028\u0002H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u001d8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR$\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f8\u0002@\u0002X\u0082\u000e\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\n\u0004\b!\u0010\u001cR \u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006'" }, d2 = { "Lkotlin/h;", "T", "R", "Lkotlin/g;", "Lkotlin/coroutines/d;", "Lkotlin/Function3;", "", "Lkotlin/s;", "currentFunction", "cont", "n", "(Ln6/q;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "value", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "U", "S", "Lkotlin/e;", "d", "(Lkotlin/e;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "o", "()Ljava/lang/Object;", "H", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "J", "I", "Lkotlin/coroutines/d;", "block", "<init>", "(Ln6/q;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@q
final class h<T, R> extends g<T, R> implements d<R>
{
    private n6.q<? super g<?, ?>, Object, ? super d<Object>, ?> G;
    private Object H;
    private d<Object> I;
    private Object J;
    
    public h(@e final n6.q<? super g<T, R>, ? super T, ? super d<? super R>, ?> g, final T h) {
        k0.p(g, "block");
        super(null);
        this.G = (n6.q<? super g<?, ?>, Object, ? super d<Object>, ?>)g;
        this.H = h;
        this.I = (d<Object>)this;
        this.J = f.b();
    }
    
    public static final /* synthetic */ void j(final h h, final d i) {
        h.I = (d<Object>)i;
    }
    
    public static final /* synthetic */ void l(final h h, final n6.q g) {
        h.G = (n6.q<? super g<?, ?>, Object, ? super d<Object>, ?>)g;
    }
    
    public static final /* synthetic */ void m(final h h, final Object j) {
        h.J = j;
    }
    
    private final d<Object> n(final n6.q<? super g<?, ?>, Object, ? super d<Object>, ?> q, final d<Object> d) {
        return new d<Object>() {
            final /* synthetic */ kotlin.coroutines.g G = i.H;
            final /* synthetic */ h H;
            
            @e
            @Override
            public kotlin.coroutines.g getContext() {
                return this.G;
            }
            
            @Override
            public void resumeWith(@e final Object o) {
                h.l(this.H, q);
                h.j(this.H, d);
                h.m(this.H, o);
            }
        };
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object b(final T h, @e final d<? super R> d) {
        Objects.requireNonNull(d, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.I = (d<Object>)d;
        this.H = h;
        final Object h2 = b.h();
        if (h2 == b.h()) {
            h.c(d);
        }
        return h2;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public <U, S> Object d(@e final kotlin.e<U, S> e, final U h, @e final d<? super S> i) {
        final n6.q<g<U, S>, U, d<? super S>, Object> a = e.a();
        Objects.requireNonNull((n6.q<? super g<?, ?>, Object, ? super d<Object>, ?>)a, "null cannot be cast to non-null type kotlin.DeepRecursiveFunctionBlock /* = suspend kotlin.DeepRecursiveScope<*, *>.(kotlin.Any?) -> kotlin.Any? */");
        final n6.q<? super g<?, ?>, Object, ? super d<Object>, ?> g = this.G;
        if (a != g) {
            this.G = (n6.q<? super g<?, ?>, Object, ? super d<Object>, ?>)a;
            Objects.requireNonNull(i, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.I = this.n(g, (d<Object>)i);
        }
        else {
            Objects.requireNonNull(i, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.I = (d<Object>)i;
        }
        this.H = h;
        final Object h2 = b.h();
        if (h2 == b.h()) {
            h.c(i);
        }
        return h2;
    }
    
    @e
    @Override
    public kotlin.coroutines.g getContext() {
        return i.H;
    }
    
    public final R o() {
        Object o;
        while (true) {
            o = this.J;
            final d<Object> i = this.I;
            if (i == null) {
                break;
            }
            if (b1.d(f.b(), o)) {
                Object a = null;
                try {
                    final n6.q<? super g<?, ?>, Object, ? super d<Object>, ?> g = this.G;
                    final Object h = this.H;
                    if (g == null) {
                        throw new NullPointerException("null cannot be cast to non-null type (R, P, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    if (((n6.q)q1.q(g, 3)).invoke(this, h, i) == b.h()) {
                        continue;
                    }
                    final b1.a h2 = b1.H;
                }
                finally {
                    final b1.a h3 = b1.H;
                    final Throwable t;
                    a = c1.a(t);
                }
                o = b1.b(a);
            }
            else {
                this.J = f.b();
            }
            i.resumeWith(o);
        }
        c1.n(o);
        return (R)o;
    }
    
    @Override
    public void resumeWith(@e final Object j) {
        this.I = null;
        this.J = j;
    }
}
