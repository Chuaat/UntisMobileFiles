// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.m2;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.r;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.y1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0018B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001c\u0010\u0012\u001a\u00020\u00038V@\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u00020\u00038V@\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019" }, d2 = { "Lkotlin/ranges/w;", "Lkotlin/ranges/u;", "Lkotlin/ranges/g;", "Lkotlin/y1;", "value", "", "q", "(J)Z", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "t", "()J", "start", "r", "endInclusive", "<init>", "(JJLkotlin/jvm/internal/w;)V", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.5")
@o2(markerClass = { r.class })
public final class w extends u implements g<y1>
{
    @e
    private static final w K;
    @e
    public static final a L;
    
    static {
        L = new a(null);
        K = new w(-1L, 0L);
    }
    
    private w(final long n, final long n2) {
        super(n, n2, 1L, null);
    }
    
    public static final /* synthetic */ w p() {
        return w.K;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof w) {
            if (!this.isEmpty() || !((w)o).isEmpty()) {
                final long k = this.k();
                final w w = (w)o;
                if (k != w.k() || this.n() != w.n()) {
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
            n = (int)y1.k(this.n() ^ y1.k(this.n() >>> 32)) + (int)y1.k(this.k() ^ y1.k(this.k() >>> 32)) * 31;
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return m2.g(this.k(), this.n()) > 0;
    }
    
    public boolean q(final long n) {
        return m2.g(this.k(), n) <= 0 && m2.g(n, this.n()) <= 0;
    }
    
    public long r() {
        return this.n();
    }
    
    public long t() {
        return this.k();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(y1.J0(this.k()));
        sb.append("..");
        sb.append(y1.J0(this.n()));
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/ranges/w$a", "", "Lkotlin/ranges/w;", "EMPTY", "Lkotlin/ranges/w;", "a", "()Lkotlin/ranges/w;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final w a() {
            return w.p();
        }
    }
}
