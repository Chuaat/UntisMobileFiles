// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.collections.u;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.internal.m;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0016\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0019\u0010\u0012\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0016\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0019\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011¨\u0006 " }, d2 = { "Lkotlin/ranges/a;", "", "", "Lkotlin/collections/u;", "p", "", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "H", "C", "n", "()C", "last", "I", "o", "()I", "step", "G", "k", "first", "start", "endInclusive", "<init>", "(CCI)V", "J", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public class a implements Iterable<Character>, a
{
    @e
    public static final a J;
    private final char G;
    private final char H;
    private final int I;
    
    static {
        J = new a(null);
    }
    
    public a(final char c, final char c2, final int i) {
        if (i == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i != Integer.MIN_VALUE) {
            this.G = c;
            this.H = (char)m.c(c, c2, i);
            this.I = i;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof a) {
            if (!this.isEmpty() || !((a)o).isEmpty()) {
                final char g = this.G;
                final a a = (a)o;
                if (g != a.G || this.H != a.H || this.I != a.I) {
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
            n = (this.G * '\u001f' + this.H) * 31 + this.I;
        }
        return n;
    }
    
    public boolean isEmpty() {
        final int i = this.I;
        boolean b = true;
        if (i > 0) {
            if (k0.t(this.G, this.H) > 0) {
                return b;
            }
        }
        else if (k0.t(this.G, this.H) < 0) {
            return b;
        }
        b = false;
        return b;
    }
    
    public final char k() {
        return this.G;
    }
    
    public final char n() {
        return this.H;
    }
    
    public final int o() {
        return this.I;
    }
    
    @e
    public u p() {
        return new b(this.G, this.H, this.I);
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
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b" }, d2 = { "kotlin/ranges/a$a", "", "", "rangeStart", "rangeEnd", "", "step", "Lkotlin/ranges/a;", "a", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final kotlin.ranges.a a(final char c, final char c2, final int n) {
            return new kotlin.ranges.a(c, c2, n);
        }
    }
}
