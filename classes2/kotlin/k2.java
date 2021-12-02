// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.a;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u0015\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00028\u00008V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015" }, d2 = { "Lkotlin/k2;", "T", "Lkotlin/b0;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "b", "", "a", "", "toString", "H", "Ljava/lang/Object;", "_value", "getValue", "()Ljava/lang/Object;", "value", "Lkotlin/Function0;", "initializer", "<init>", "(Ln6/a;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class k2<T> implements b0<T>, Serializable
{
    private a<? extends T> G;
    private Object H;
    
    public k2(@e final a<? extends T> g) {
        k0.p(g, "initializer");
        this.G = g;
        this.H = c2.a;
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
        if (this.H == c2.a) {
            final a<? extends T> g = this.G;
            k0.m(g);
            this.H = g.invoke();
            this.G = null;
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
}
