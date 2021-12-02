// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0017\u0012\u0006\u0010\n\u001a\u00028\u0000\u0012\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00028\u0000H\u00c6\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0001H\u00c6\u0003¢\u0006\u0004\b\t\u0010\bJ0\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u000b\u001a\u00028\u0001H\u00c6\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003R\u0019\u0010\n\u001a\u00028\u00008\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u000b\u001a\u00028\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u001b" }, d2 = { "Lkotlin/s0;", "A", "B", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "toString", "a", "()Ljava/lang/Object;", "b", "first", "second", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/s0;", "", "hashCode", "", "other", "", "equals", "G", "Ljava/lang/Object;", "e", "H", "f", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class s0<A, B> implements Serializable
{
    private final A G;
    private final B H;
    
    public s0(final A g, final B h) {
        this.G = g;
        this.H = h;
    }
    
    public final A a() {
        return this.G;
    }
    
    public final B b() {
        return this.H;
    }
    
    @e
    public final s0<A, B> c(final A a, final B b) {
        return new s0<A, B>(a, b);
    }
    
    public final A e() {
        return this.G;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof s0) {
                final s0 s0 = (s0)o;
                if (k0.g(this.G, s0.G) && k0.g(this.H, s0.H)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final B f() {
        return this.H;
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
        if (h != null) {
            hashCode = h.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.G);
        sb.append(", ");
        sb.append(this.H);
        sb.append(')');
        return sb.toString();
    }
}
