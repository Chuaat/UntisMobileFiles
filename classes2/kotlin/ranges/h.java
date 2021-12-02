// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0012\u0018\u0000*\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0010\u001a\u00028\u0000\u0012\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001c\u0010\u0010\u001a\u00028\u00008\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0013\u001a\u00028\u00008\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u0016" }, d2 = { "Lkotlin/ranges/h;", "", "T", "Lkotlin/ranges/g;", "", "other", "", "equals", "", "hashCode", "", "toString", "G", "Ljava/lang/Comparable;", "b", "()Ljava/lang/Comparable;", "start", "H", "i", "endInclusive", "<init>", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
class h<T extends Comparable<? super T>> implements g<T>
{
    @e
    private final T G;
    @e
    private final T H;
    
    public h(@e final T g, @e final T h) {
        k0.p(g, "start");
        k0.p(h, "endInclusive");
        this.G = g;
        this.H = h;
    }
    
    @e
    @Override
    public T b() {
        return this.G;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof h) {
            if (!this.isEmpty() || !((h)o).isEmpty()) {
                final Comparable<? super T> b = this.b();
                final h h = (h)o;
                if (!k0.g(b, h.b()) || !k0.g(this.i(), h.i())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean f(@e final T t) {
        k0.p(t, "value");
        return a.a(this, t);
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.isEmpty()) {
            n = -1;
        }
        else {
            n = this.b().hashCode() * 31 + this.i().hashCode();
        }
        return n;
    }
    
    @e
    @Override
    public T i() {
        return this.H;
    }
    
    @Override
    public boolean isEmpty() {
        return a.b((g<Comparable>)this);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.b());
        sb.append("..");
        sb.append(this.i());
        return sb.toString();
    }
}
