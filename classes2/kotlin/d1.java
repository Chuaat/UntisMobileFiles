// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import n6.a;
import org.jetbrains.annotations.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u0017*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004:\u0001\bB\u0015\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\f¨\u0006\u0018" }, d2 = { "Lkotlin/d1;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "b", "", "a", "", "toString", "H", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "I", "final", "Lkotlin/Function0;", "initializer", "<init>", "(Ln6/a;)V", "K", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class d1<T> implements b0<T>, Serializable
{
    private static final AtomicReferenceFieldUpdater<d1<?>, Object> J;
    @e
    public static final a K;
    private volatile n6.a<? extends T> G;
    private volatile Object H;
    private final Object I;
    
    static {
        K = new a(null);
        J = AtomicReferenceFieldUpdater.newUpdater((Class<d1<?>>)d1.class, Object.class, "H");
    }
    
    public d1(@e final n6.a<? extends T> g) {
        k0.p(g, "initializer");
        this.G = g;
        final c2 a = c2.a;
        this.H = a;
        this.I = a;
    }
    
    private final Object b() {
        return new v(this.getValue());
    }
    
    @Override
    public boolean a() {
        return this.H != c2.a;
    }
    
    @Override
    public T getValue() {
        final Object h = this.H;
        final c2 a = c2.a;
        if (h != a) {
            return (T)h;
        }
        final n6.a<? extends T> g = this.G;
        if (g != null) {
            final T invoke = (T)g.invoke();
            if (d1.J.compareAndSet(this, a, invoke)) {
                this.G = null;
                return invoke;
            }
        }
        return (T)this.H;
    }
    
    @e
    @Override
    public String toString() {
        String value;
        if (this.a()) {
            value = String.valueOf(this.getValue());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bRf\u0010\u0005\u001aR\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001 \u0004*(\u0012\u0014\u0012\u0012\u0012\u0002\b\u0003 \u0004*\b\u0012\u0002\b\u0003\u0018\u00010\u00030\u0003\u0012\f\u0012\n \u0004*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/d1$a", "", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "Lkotlin/d1;", "kotlin.jvm.PlatformType", "valueUpdater", "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
