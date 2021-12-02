// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0000\u0018\u0000 \u00192\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001aB9\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0011\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0018J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\tR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\tR\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\t¨\u0006\u001b" }, d2 = { "Lkotlin/random/i;", "Lkotlin/random/f;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "l", "bitCount", "b", "M", "I", "v", "K", "z", "N", "addend", "x", "J", "y", "L", "w", "<init>", "(IIIIII)V", "seed1", "seed2", "(II)V", "P", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class i extends f implements Serializable
{
    @Deprecated
    private static final long O = 0L;
    @e
    private static final a P;
    private int I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    
    static {
        P = new a(null);
    }
    
    public i(final int n, final int n2) {
        this(n, n2, 0, 0, ~n, n << 10 ^ n2 >>> 4);
    }
    
    public i(int i, final int j, final int k, final int l, final int m, int n) {
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        n = 0;
        if ((i | j | k | l | m) != 0x0) {
            i = 1;
        }
        else {
            i = 0;
        }
        if (i != 0) {
            for (i = n; i < 64; ++i) {
                this.l();
            }
            return;
        }
        throw new IllegalArgumentException("Initial state must have at least one non-zero element.".toString());
    }
    
    @Override
    public int b(final int n) {
        return g.j(this.l(), n);
    }
    
    @Override
    public int l() {
        final int i = this.I;
        final int n = i ^ i >>> 2;
        this.I = this.J;
        this.J = this.K;
        this.K = this.L;
        final int m = this.M;
        this.L = m;
        final int j = n ^ n << 1 ^ m ^ m << 4;
        this.M = j;
        return j + (this.N += 362437);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "kotlin/random/i$a", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
    }
}
