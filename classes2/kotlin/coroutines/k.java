// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import kotlin.b1;
import kotlin.coroutines.intrinsics.b;
import org.jetbrains.annotations.f;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.y0;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 \u001e*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u001fB!\b\u0000\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001b\u0010\u001cB\u0017\b\u0011\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u001b\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0001J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "Lkotlin/coroutines/k;", "T", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlin/b1;", "result", "Lkotlin/j2;", "resumeWith", "(Ljava/lang/Object;)V", "", "b", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "", "toString", "Ljava/lang/Object;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "G", "Lkotlin/coroutines/d;", "delegate", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "initialResult", "<init>", "(Lkotlin/coroutines/d;Ljava/lang/Object;)V", "(Lkotlin/coroutines/d;)V", "I", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@y0
public final class k<T> implements d<T>, e
{
    @Deprecated
    private static final AtomicReferenceFieldUpdater<k<?>, Object> H;
    @org.jetbrains.annotations.e
    private static final a I;
    private final d<T> G;
    private volatile Object result;
    
    static {
        I = new a(null);
        H = AtomicReferenceFieldUpdater.newUpdater((Class<k<?>>)k.class, Object.class, "result");
    }
    
    @y0
    public k(@org.jetbrains.annotations.e final d<? super T> d) {
        k0.p(d, "delegate");
        this(d, kotlin.coroutines.intrinsics.a.H);
    }
    
    public k(@org.jetbrains.annotations.e final d<? super T> g, @f final Object result) {
        k0.p(g, "delegate");
        this.G = (d<T>)g;
        this.result = result;
    }
    
    @y0
    @f
    public final Object b() {
        final Object result = this.result;
        final kotlin.coroutines.intrinsics.a h = kotlin.coroutines.intrinsics.a.H;
        Object o = result;
        if (result == h) {
            if (k.H.compareAndSet(this, h, b.h())) {
                return b.h();
            }
            o = this.result;
        }
        if (o == kotlin.coroutines.intrinsics.a.I) {
            o = b.h();
        }
        else if (o instanceof b1.b) {
            throw ((b1.b)o).G;
        }
        return o;
    }
    
    @f
    @Override
    public e getCallerFrame() {
        Object g;
        if (!((g = this.G) instanceof e)) {
            g = null;
        }
        return (e)g;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g getContext() {
        return this.G.getContext();
    }
    
    @f
    @Override
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @Override
    public void resumeWith(@org.jetbrains.annotations.e final Object o) {
        while (true) {
            final Object result = this.result;
            final kotlin.coroutines.intrinsics.a h = kotlin.coroutines.intrinsics.a.H;
            if (result == h) {
                if (k.H.compareAndSet(this, h, o)) {
                    return;
                }
                continue;
            }
            else {
                if (result != b.h()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (k.H.compareAndSet(this, b.h(), kotlin.coroutines.intrinsics.a.I)) {
                    this.G.resumeWith(o);
                    return;
                }
                continue;
            }
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SafeContinuation for ");
        sb.append(this.G);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\bRl\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b¨\u0006\n" }, d2 = { "kotlin/coroutines/k$a", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/coroutines/k;", "kotlin.jvm.PlatformType", "RESULT", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "getRESULT$annotations", "()V", "<init>", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
    }
}
