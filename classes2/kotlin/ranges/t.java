// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.m2;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;
import kotlin.u1;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0018B\u001a\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u001c\u0010\u0012\u001a\u00020\u00038V@\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u00020\u00038V@\u0016X\u0096\u0004\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011\u00f8\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019" }, d2 = { "Lkotlin/ranges/t;", "Lkotlin/ranges/r;", "Lkotlin/ranges/g;", "Lkotlin/u1;", "value", "", "q", "(I)Z", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "t", "()I", "start", "r", "endInclusive", "<init>", "(IILkotlin/jvm/internal/w;)V", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.5")
@o2(markerClass = { kotlin.r.class })
public final class t extends r implements g<u1>
{
    @e
    private static final t K;
    @e
    public static final a L;
    
    static {
        L = new a(null);
        K = new t(-1, 0);
    }
    
    private t(final int n, final int n2) {
        super(n, n2, 1, null);
    }
    
    public static final /* synthetic */ t p() {
        return t.K;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof t) {
            if (!this.isEmpty() || !((t)o).isEmpty()) {
                final int k = this.k();
                final t t = (t)o;
                if (k != t.k() || this.n() != t.n()) {
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
            n = this.k() * 31 + this.n();
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return m2.c(this.k(), this.n()) > 0;
    }
    
    public boolean q(final int n) {
        return m2.c(this.k(), n) <= 0 && m2.c(n, this.n()) <= 0;
    }
    
    public int r() {
        return this.n();
    }
    
    public int t() {
        return this.k();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(u1.J0(this.k()));
        sb.append("..");
        sb.append(u1.J0(this.n()));
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/ranges/t$a", "", "Lkotlin/ranges/t;", "EMPTY", "Lkotlin/ranges/t;", "a", "()Lkotlin/ranges/t;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final t a() {
            return t.p();
        }
    }
}
