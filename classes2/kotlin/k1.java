// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import n6.a;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B!\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0012\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017" }, d2 = { "Lkotlin/k1;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "b", "", "a", "", "toString", "H", "Ljava/lang/Object;", "_value", "I", "lock", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Ln6/a;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class k1<T> implements b0<T>, Serializable
{
    private a<? extends T> G;
    private volatile Object H;
    private final Object I;
    
    public k1(@e final a<? extends T> g, @f final Object o) {
        k0.p(g, "initializer");
        this.G = g;
        this.H = c2.a;
        Object i;
        if (o != null) {
            i = o;
        }
        else {
            i = this;
        }
        this.I = i;
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
        synchronized (this.I) {
            Object h2 = this.H;
            if (h2 == a) {
                final a<? extends T> g = this.G;
                k0.m(g);
                h2 = g.invoke();
                this.H = h2;
                this.G = null;
            }
            return (T)h2;
        }
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
}
