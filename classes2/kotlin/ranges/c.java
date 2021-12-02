// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.ranges;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0017B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0016\u0010\u0011\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00038V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0018" }, d2 = { "Lkotlin/ranges/c;", "Lkotlin/ranges/a;", "Lkotlin/ranges/g;", "", "value", "", "r", "isEmpty", "", "other", "equals", "", "hashCode", "", "toString", "v", "()Ljava/lang/Character;", "start", "t", "endInclusive", "<init>", "(CC)V", "L", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class c extends kotlin.ranges.a implements g<Character>
{
    @e
    private static final c K;
    @e
    public static final a L;
    
    static {
        L = new a(null);
        K = new c((char)1, (char)0);
    }
    
    public c(final char c, final char c2) {
        super(c, c2, 1);
    }
    
    public static final /* synthetic */ c q() {
        return c.K;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof c) {
            if (!this.isEmpty() || !((c)o).isEmpty()) {
                final char k = this.k();
                final c c = (c)o;
                if (k != c.k() || this.n() != c.n()) {
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
            n = this.k() * '\u001f' + this.n();
        }
        return n;
    }
    
    @Override
    public boolean isEmpty() {
        return k0.t(this.k(), this.n()) > 0;
    }
    
    public boolean r(final char c) {
        return k0.t(this.k(), c) <= 0 && k0.t(c, this.n()) <= 0;
    }
    
    @e
    public Character t() {
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
    public Character v() {
        return this.k();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "kotlin/ranges/c$a", "", "Lkotlin/ranges/c;", "EMPTY", "Lkotlin/ranges/c;", "a", "()Lkotlin/ranges/c;", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final c a() {
            return c.q();
        }
    }
}
