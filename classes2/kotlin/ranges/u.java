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
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;
import o6.a;
import kotlin.y1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\t\b\u0017\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB$\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0016\u00f8\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0086\u0002\u00f8\u0001\u0000J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001f\u0010\u0012\u001a\u00020\u00028\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0015\u001a\u00020\u00028\u0006@\u0006\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0019\u001a\u00020\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u001f" }, d2 = { "Lkotlin/ranges/u;", "", "Lkotlin/y1;", "", "iterator", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "G", "J", "k", "()J", "first", "H", "n", "last", "", "I", "o", "step", "start", "endInclusive", "<init>", "(JJJLkotlin/jvm/internal/w;)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.5")
@o2(markerClass = { r.class })
public class u implements Iterable<y1>, o6.a
{
    @e
    public static final a J;
    private final long G;
    private final long H;
    private final long I;
    
    static {
        J = new a(null);
    }
    
    private u(final long g, final long n, final long i) {
        if (i == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Long.MIN_VALUE) {
            this.G = g;
            this.H = q.c(g, n, i);
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof u) {
            if (!this.isEmpty() || !((u)o).isEmpty()) {
                final long g = this.G;
                final u u = (u)o;
                if (g != u.G || this.H != u.H || this.I != u.I) {
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
            final long g = this.G;
            final int n2 = (int)y1.k(g ^ y1.k(g >>> 32));
            final long h = this.H;
            final int n3 = (int)y1.k(h ^ y1.k(h >>> 32));
            final long i = this.I;
            n = (int)(i ^ i >>> 32) + (n2 * 31 + n3) * 31;
        }
        return n;
    }
    
    public boolean isEmpty() {
        final long i = this.I;
        boolean b = true;
        final int g = m2.g(this.G, this.H);
        if (i > 0L) {
            if (g > 0) {
                return b;
            }
        }
        else if (g < 0) {
            return b;
        }
        b = false;
        return b;
    }
    
    @e
    @Override
    public final Iterator<y1> iterator() {
        return new v(this.G, this.H, this.I, null);
    }
    
    public final long k() {
        return this.G;
    }
    
    public final long n() {
        return this.H;
    }
    
    public final long o() {
        return this.I;
    }
    
    @e
    @Override
    public String toString() {
        StringBuilder sb;
        long i;
        if (this.I > 0L) {
            sb = new StringBuilder();
            sb.append(y1.J0(this.G));
            sb.append("..");
            sb.append(y1.J0(this.H));
            sb.append(" step ");
            i = this.I;
        }
        else {
            sb = new StringBuilder();
            sb.append(y1.J0(this.G));
            sb.append(" downTo ");
            sb.append(y1.J0(this.H));
            sb.append(" step ");
            i = -this.I;
        }
        sb.append(i);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "kotlin/ranges/u$a", "", "Lkotlin/y1;", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/u;", "a", "(JJJ)Lkotlin/ranges/u;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final u a(final long n, final long n2, final long n3) {
            return new u(n, n2, n3, null);
        }
    }
}
