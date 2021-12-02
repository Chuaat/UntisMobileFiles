// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.collections.t0;
import java.util.Iterator;
import org.jetbrains.annotations.f;
import kotlin.internal.m;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import o6.a;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0016\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cB!\b\u0000\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0014\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0010R\u0019\u0010\u0016\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001d" }, d2 = { "Lkotlin/ranges/i;", "", "", "Lkotlin/collections/t0;", "p", "", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "G", "I", "k", "()I", "first", "H", "n", "last", "o", "step", "start", "endInclusive", "<init>", "(III)V", "J", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public class i implements Iterable<Integer>, o6.a
{
    @e
    public static final a J;
    private final int G;
    private final int H;
    private final int I;
    
    static {
        J = new a(null);
    }
    
    public i(final int g, final int n, final int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Integer.MIN_VALUE) {
            this.G = g;
            this.H = m.c(g, n, i);
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof i) {
            if (!this.isEmpty() || !((i)o).isEmpty()) {
                final int g = this.G;
                final i i = (i)o;
                if (g != i.G || this.H != i.H || this.I != i.I) {
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
            if (this.G > this.H) {
                return b;
            }
        }
        else if (this.G < this.H) {
            return b;
        }
        b = false;
        return b;
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
    public t0 p() {
        return new j(this.G, this.H, this.I);
    }
    
    @e
    @Override
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.I > 0) {
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n" }, d2 = { "kotlin/ranges/i$a", "", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/i;", "a", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final i a(final int n, final int n2, final int n3) {
            return new i(n, n2, n3);
        }
    }
}
