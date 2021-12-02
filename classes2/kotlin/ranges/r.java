// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import java.util.Iterator;
import kotlin.m2;
import org.jetbrains.annotations.f;
import kotlin.internal.q;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;
import o6.a;
import kotlin.u1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0017\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB$\b\u0000\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\n\u00f8\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001f\u0010\u0012\u001a\u00020\u00028\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0014\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u001f\u0010\u0017\u001a\u00020\u00028\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001e" }, d2 = { "Lkotlin/ranges/r;", "", "Lkotlin/u1;", "", "iterator", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "G", "I", "k", "()I", "first", "o", "step", "H", "n", "last", "start", "endInclusive", "<init>", "(IIILkotlin/jvm/internal/w;)V", "J", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.5")
@o2(markerClass = { kotlin.r.class })
public class r implements Iterable<u1>, o6.a
{
    @e
    public static final a J;
    private final int G;
    private final int H;
    private final int I;
    
    static {
        J = new a(null);
    }
    
    private r(final int g, final int n, final int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Integer.MIN_VALUE) {
            this.G = g;
            this.H = q.d(g, n, i);
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof r) {
            if (!this.isEmpty() || !((r)o).isEmpty()) {
                final int g = this.G;
                final r r = (r)o;
                if (g != r.G || this.H != r.H || this.I != r.I) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.isEmpty()) {
            n = -1;
        }
        else {
            n = (this.G * 31 + this.H) * 31 + this.I;
        }
        return n;
    }
    
    public boolean isEmpty() {
        final int i = this.I;
        boolean b = true;
        if (i > 0) {
            if (m2.c(this.G, this.H) > 0) {
                return b;
            }
        }
        else if (m2.c(this.G, this.H) < 0) {
            return b;
        }
        b = false;
        return b;
    }
    
    @e
    @Override
    public final Iterator<u1> iterator() {
        return new s(this.G, this.H, this.I, null);
    }
    
    public final int k() {
        return this.G;
    }
    
    public final int n() {
        return this.H;
    }
    
    public final int o() {
        return this.I;
    }
    
    @e
    @Override
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.I > 0) {
            sb = new StringBuilder();
            sb.append(u1.J0(this.G));
            sb.append("..");
            sb.append(u1.J0(this.H));
            sb.append(" step ");
            i = this.I;
        }
        else {
            sb = new StringBuilder();
            sb.append(u1.J0(this.G));
            sb.append(" downTo ");
            sb.append(u1.J0(this.H));
            sb.append(" step ");
            i = -this.I;
        }
        sb.append(i);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "kotlin/ranges/r$a", "", "Lkotlin/u1;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/r;", "a", "(III)Lkotlin/ranges/r;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final r a(final int n, final int n2, final int n3) {
            return new r(n, n2, n3, null);
        }
    }
}
