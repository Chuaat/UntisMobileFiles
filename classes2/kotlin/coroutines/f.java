// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.h0;
import kotlin.c1;
import kotlin.i0;
import n6.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.k0;
import kotlin.e1;
import org.jetbrains.annotations.e;
import kotlin.j2;
import kotlin.b1;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0087\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0087\b\u001a?\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\n\u001a\u00020\t2\u001a\b\u0004\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0004\u0012\u00020\u00030\u000bH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u001aF\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a_\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0001\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a@\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aY\u0010\u001b\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0013\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0014¢\u0006\u0002\b\u00152\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001aB\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00020\u00030\u000bH\u0087H\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u001e\u0010\u001f\"\u001d\u0010$\u001a\u00020\t8\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006%" }, d2 = { "T", "Lkotlin/coroutines/d;", "value", "Lkotlin/j2;", "f", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "", "exception", "g", "Lkotlin/coroutines/g;", "context", "Lkotlin/Function1;", "Lkotlin/b1;", "resumeWith", "a", "", "completion", "b", "(Ln6/l;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "R", "Lkotlin/Function2;", "Lkotlin/s;", "receiver", "c", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "h", "(Ln6/l;Lkotlin/coroutines/d;)V", "i", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "block", "j", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "d", "()Lkotlin/coroutines/g;", "getCoroutineContext$annotations", "()V", "coroutineContext", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class f
{
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> d<T> a(final g g, final l<? super b1<? extends T>, j2> l) {
        return new d<T>() {
            @e
            @Override
            public g getContext() {
                return g;
            }
            
            @Override
            public void resumeWith(@e final Object o) {
                l.invoke(b1.a(o));
            }
        };
    }
    
    @e1(version = "1.3")
    @e
    public static final <T> d<j2> b(@e final l<? super d<? super T>, ?> l, @e final d<? super T> d) {
        k0.p(l, "$this$createCoroutine");
        k0.p(d, "completion");
        return new k<j2>(b.d((d<? super j2>)b.b((l<? super d<? super Object>, ?>)l, (d<? super Object>)d)), b.h());
    }
    
    @e1(version = "1.3")
    @e
    public static final <R, T> d<j2> c(@e final p<? super R, ? super d<? super T>, ?> p3, final R r, @e final d<? super T> d) {
        k0.p(p3, "$this$createCoroutine");
        k0.p(d, "completion");
        return new k<j2>(b.d((d<? super j2>)b.c((p<? super R, ? super d<? super Object>, ?>)p3, r, (d<? super Object>)d)), b.h());
    }
    
    private static final g d() {
        throw new i0("Implemented as intrinsic");
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void f(final d<? super T> d, final T t) {
        final b1.a h = b1.H;
        d.resumeWith(b1.b(t));
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> void g(final d<? super T> d, final Throwable t) {
        final b1.a h = b1.H;
        d.resumeWith(b1.b(c1.a(t)));
    }
    
    @e1(version = "1.3")
    public static final <T> void h(@e final l<? super d<? super T>, ?> l, @e final d<? super T> d) {
        k0.p(l, "$this$startCoroutine");
        k0.p(d, "completion");
        final d<Object> d2 = b.d((d<? super Object>)b.b((l<? super d<? super Object>, ?>)l, (d<? super Object>)d));
        final j2 a = j2.a;
        final b1.a h = b1.H;
        d2.resumeWith(b1.b(a));
    }
    
    @e1(version = "1.3")
    public static final <R, T> void i(@e final p<? super R, ? super d<? super T>, ?> p3, final R r, @e final d<? super T> d) {
        k0.p(p3, "$this$startCoroutine");
        k0.p(d, "completion");
        final d<Object> d2 = b.d((d<? super Object>)b.c((p<? super R, ? super d<? super Object>, ?>)p3, r, (d<? super Object>)d));
        final j2 a = j2.a;
        final b1.a h = b1.H;
        d2.resumeWith(b1.b(a));
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object j(final l<? super d<? super T>, j2> l, final d<? super T> d) {
        h0.e(0);
        final k k = new k(b.d((d<? super T>)d));
        l.invoke((Object)k);
        final Object b = k.b();
        if (b == kotlin.coroutines.intrinsics.b.h()) {
            h.c(d);
        }
        h0.e(1);
        return b;
    }
}
