// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0016B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0017" }, d2 = { "Lkotlin/ranges/k;", "Lkotlin/ranges/i;", "Lkotlin/ranges/g;", "", "value", "", "r", "isEmpty", "", "other", "equals", "hashCode", "", "toString", "v", "()Ljava/lang/Integer;", "start", "t", "endInclusive", "<init>", "(II)V", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class k extends i implements g<Integer>
{
    @e
    private static final k K;
    @e
    public static final a L;
    
    static {
        L = new a(null);
        K = new k(1, 0);
    }
    
    public k(final int n, final int n2) {
        super(n, n2, 1);
    }
    
    public static final /* synthetic */ k q() {
        return k.K;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof k) {
            if (!this.isEmpty() || !((k)o).isEmpty()) {
                final int k = this.k();
                final k i = (k)o;
                if (k != i.k() || this.n() != i.n()) {
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
        return this.k() > this.n();
    }
    
    public boolean r(final int n) {
        return this.k() <= n && n <= this.n();
    }
    
    @e
    public Integer t() {
        return this.n();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.k());
        sb.append("..");
        sb.append(this.n());
        return sb.toString();
    }
    
    @e
    public Integer v() {
        return this.k();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/ranges/k$a", "", "Lkotlin/ranges/k;", "EMPTY", "Lkotlin/ranges/k;", "a", "()Lkotlin/ranges/k;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final k a() {
            return k.q();
        }
    }
}
