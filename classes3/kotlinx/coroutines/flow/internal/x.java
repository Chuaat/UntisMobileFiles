// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.b1;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import kotlin.text.s;
import n6.q;
import java.util.Objects;
import kotlinx.coroutines.o2;
import n6.p;
import kotlin.coroutines.i;
import kotlin.j2;
import kotlin.coroutines.g;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlinx.coroutines.flow.j;
import kotlin.coroutines.jvm.internal.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001f\u001a\u00020\f¢\u0006\u0004\b1\u00102J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@\u00f8\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\f8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\f8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u001eR\u0016\u0010-\u001a\u00020+8\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b,\u0010#R\u0018\u00100\u001a\u0004\u0018\u00010\u00048V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\u0082\u0002\u0004\n\u0002\b\u0019¨\u00063" }, d2 = { "Lkotlinx/coroutines/flow/internal/x;", "T", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/jvm/internal/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/coroutines/d;", "Lkotlin/j2;", "uCont", "value", "", "p", "(Lkotlin/coroutines/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/g;", "currentContext", "previousContext", "n", "(Lkotlin/coroutines/g;Lkotlin/coroutines/g;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/o;", "exception", "q", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/b1;", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "b", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "K", "Lkotlin/coroutines/g;", "collectContext", "J", "Lkotlinx/coroutines/flow/j;", "collector", "I", "Lkotlin/coroutines/d;", "completion", "getContext", "()Lkotlin/coroutines/g;", "context", "H", "lastEmissionContext", "", "G", "collectContextSize", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "<init>", "(Lkotlinx/coroutines/flow/j;Lkotlin/coroutines/g;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class x<T> extends d implements j<T>, e
{
    @m6.d
    public final int G;
    private g H;
    private kotlin.coroutines.d<? super j2> I;
    @m6.d
    @org.jetbrains.annotations.e
    public final j<T> J;
    @m6.d
    @org.jetbrains.annotations.e
    public final g K;
    
    public x(@org.jetbrains.annotations.e final j<? super T> j, @org.jetbrains.annotations.e final g k) {
        super((kotlin.coroutines.d)u.H, (g)i.H);
        this.J = (j<T>)j;
        this.K = k;
        this.G = ((Number)k.fold((Object)0, (p)x$a.G)).intValue();
    }
    
    private final void n(final g h, final g g, final T t) {
        if (g instanceof o) {
            this.q((o)g, t);
        }
        z.a(this, h);
        this.H = h;
    }
    
    private final Object p(final kotlin.coroutines.d<? super j2> i, final T t) {
        final g context = i.getContext();
        o2.A(context);
        final g h = this.H;
        if (h != context) {
            this.n(context, h, t);
        }
        this.I = i;
        final q a = y.a();
        final j<T> j = this.J;
        Objects.requireNonNull(j, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        return a.invoke((Object)j, (Object)t, (Object)this);
    }
    
    private final void q(final o o, final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
        sb.append(o.H);
        sb.append(", but then emission attempt of value '");
        sb.append(obj);
        sb.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(s.p(sb.toString()).toString());
    }
    
    @f
    public Object b(final T t, @org.jetbrains.annotations.e final kotlin.coroutines.d<? super j2> d) {
        try {
            final Object p2 = this.p(d, t);
            if (p2 == b.h()) {
                h.c((kotlin.coroutines.d)d);
            }
            if (p2 == b.h()) {
                return p2;
            }
            return j2.a;
        }
        finally {
            final Throwable t2;
            this.H = (g)new o(t2);
        }
    }
    
    @f
    public e getCallerFrame() {
        Object i;
        if (!((i = this.I) instanceof e)) {
            i = null;
        }
        return (e)i;
    }
    
    @org.jetbrains.annotations.e
    public g getContext() {
        final kotlin.coroutines.d<? super j2> i = this.I;
        if (i != null) {
            final Object o = i.getContext();
            if (o != null) {
                return (g)o;
            }
        }
        final Object o = kotlin.coroutines.i.H;
        return (g)o;
    }
    
    @f
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @org.jetbrains.annotations.e
    public Object invokeSuspend(@org.jetbrains.annotations.e final Object o) {
        final Throwable e = b1.e(o);
        if (e != null) {
            this.H = (g)new o(e);
        }
        final kotlin.coroutines.d<? super j2> i = this.I;
        if (i != null) {
            i.resumeWith(o);
        }
        return b.h();
    }
    
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
