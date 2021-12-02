// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.collections.u0;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.internal.m;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB!\b\u0000\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0015\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u000f\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u001e" }, d2 = { "Lkotlin/ranges/l;", "", "", "Lkotlin/collections/u0;", "p", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "I", "J", "o", "()J", "step", "H", "n", "last", "G", "k", "first", "start", "endInclusive", "<init>", "(JJJ)V", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public class l implements Iterable<Long>, o6.a
{
    @e
    public static final a J;
    private final long G;
    private final long H;
    private final long I;
    
    static {
        J = new a(null);
    }
    
    public l(final long g, final long n, final long i) {
        if (i == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Long.MIN_VALUE) {
            this.G = g;
            this.H = m.d(g, n, i);
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof l) {
            if (!this.isEmpty() || !((l)o).isEmpty()) {
                final long g = this.G;
                final l l = (l)o;
                if (g != l.G || this.H != l.H || this.I != l.I) {
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
            final long n2 = 31;
            final long g = this.G;
            final long h = this.H;
            final long i = this.I;
            n = (int)(n2 * ((g ^ g >>> 32) * n2 + (h ^ h >>> 32)) + (i ^ i >>> 32));
        }
        return n;
    }
    
    public boolean isEmpty() {
        final long i = this.I;
        boolean b = true;
        final long g = this.G;
        final long h = this.H;
        if (i > 0L) {
            if (g > h) {
                return b;
            }
        }
        else if (g < h) {
            return b;
        }
        b = false;
        return b;
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
    public u0 p() {
        return new kotlin.ranges.m(this.G, this.H, this.I);
    }
    
    @e
    @Override
    public String toString() {
        StringBuilder sb;
        long i;
        if (this.I > 0L) {
            sb = new StringBuilder();
            sb.append(this.G);
            sb.append("..");
            sb.append(this.H);
            sb.append(" step ");
            i = this.I;
        }
        else {
            sb = new StringBuilder();
            sb.append(this.G);
            sb.append(" downTo ");
            sb.append(this.H);
            sb.append(" step ");
            i = -this.I;
        }
        sb.append(i);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n" }, d2 = { "kotlin/ranges/l$a", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/l;", "a", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final l a(final long n, final long n2, final long n3) {
            return new l(n, n2, n3);
        }
    }
}
