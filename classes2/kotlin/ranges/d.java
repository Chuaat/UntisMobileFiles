// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0011\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001c" }, d2 = { "Lkotlin/ranges/d;", "Lkotlin/ranges/f;", "", "a", "b", "", "e", "value", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "G", "D", "_start", "H", "_endInclusive", "d", "()Ljava/lang/Double;", "start", "c", "endInclusive", "<init>", "(DD)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class d implements f<Double>
{
    private final double G;
    private final double H;
    
    public d(final double g, final double h) {
        this.G = g;
        this.H = h;
    }
    
    public boolean a(final double n) {
        return n >= this.G && n <= this.H;
    }
    
    @e
    public Double c() {
        return this.H;
    }
    
    @e
    public Double d() {
        return this.G;
    }
    
    public boolean e(final double n, final double n2) {
        return n <= n2;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        if (o instanceof d) {
            if (!this.isEmpty() || !((d)o).isEmpty()) {
                final double g = this.G;
                final d d = (d)o;
                if (g != d.G || this.H != d.H) {
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
            n = Double.valueOf(this.G).hashCode() * 31 + Double.valueOf(this.H).hashCode();
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return this.G > this.H;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G);
        sb.append("..");
        sb.append(this.H);
        return sb.toString();
    }
}
