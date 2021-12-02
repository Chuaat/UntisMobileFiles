// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\f\u001a\u00028\u0000\u0012\u0006\u0010\r\u001a\u00028\u0001\u0012\u0006\u0010\u000e\u001a\u00028\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000H\u00c6\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001H\u00c6\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002H\u00c6\u0003¢\u0006\u0004\b\u000b\u0010\tJ@\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\f\u001a\u00028\u00002\b\b\u0002\u0010\r\u001a\u00028\u00012\b\b\u0002\u0010\u000e\u001a\u00028\u0002H\u00c6\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u00d6\u0003R\u0019\u0010\u000e\u001a\u00028\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0019\u0010\r\u001a\u00028\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u0019\u0010\f\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\t¨\u0006 " }, d2 = { "Lkotlin/m1;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "c", "first", "second", "third", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/m1;", "", "hashCode", "", "other", "", "equals", "I", "Ljava/lang/Object;", "h", "H", "g", "G", "f", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class m1<A, B, C> implements Serializable
{
    private final A G;
    private final B H;
    private final C I;
    
    public m1(final A g, final B h, final C i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public final A a() {
        return this.G;
    }
    
    public final B b() {
        return this.H;
    }
    
    public final C c() {
        return this.I;
    }
    
    @e
    public final m1<A, B, C> d(final A a, final B b, final C c) {
        return new m1<A, B, C>(a, b, c);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof m1) {
                final m1 m1 = (m1)o;
                if (k0.g(this.G, m1.G) && k0.g(this.H, m1.H) && k0.g(this.I, m1.I)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final A f() {
        return this.G;
    }
    
    public final B g() {
        return this.H;
    }
    
    public final C h() {
        return this.I;
    }
    
    @Override
    public int hashCode() {
        final A g = this.G;
        int hashCode = 0;
        int hashCode2;
        if (g != null) {
            hashCode2 = g.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final B h = this.H;
        int hashCode3;
        if (h != null) {
            hashCode3 = h.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final C i = this.I;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.G);
        sb.append(", ");
        sb.append(this.H);
        sb.append(", ");
        sb.append(this.I);
        sb.append(')');
        return sb.toString();
    }
}
