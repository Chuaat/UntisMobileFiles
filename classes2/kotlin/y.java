// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001eB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001cJ \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0011\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0000H\u0096\u0002J\u0016\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u001e\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0012R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0012\u001a\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001f" }, d2 = { "Lkotlin/y;", "", "", "major", "minor", "patch", "j", "", "toString", "", "other", "", "equals", "hashCode", "b", "h", "i", "H", "I", "d", "()I", "G", "version", "f", "J", "g", "<init>", "(III)V", "(II)V", "M", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.1")
public final class y implements Comparable<y>
{
    public static final int K = 255;
    @d
    @e
    public static final y L;
    @e
    public static final a M;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    
    static {
        M = new a(null);
        L = z.a();
    }
    
    public y(final int n, final int n2) {
        this(n, n2, 0);
    }
    
    public y(final int h, final int i, final int j) {
        this.H = h;
        this.I = i;
        this.J = j;
        this.G = this.j(h, i, j);
    }
    
    private final int j(final int i, final int j, final int k) {
        boolean b = false;
        Label_0051: {
            if (i >= 0) {
                if (255 >= i) {
                    if (j >= 0) {
                        if (255 >= j) {
                            if (k >= 0) {
                                if (255 >= k) {
                                    b = true;
                                    break Label_0051;
                                }
                            }
                        }
                    }
                }
            }
            b = false;
        }
        if (b) {
            return (i << 16) + (j << 8) + k;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(i);
        sb.append('.');
        sb.append(j);
        sb.append('.');
        sb.append(k);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    public int b(@e final y y) {
        k0.p(y, "other");
        return this.G - y.G;
    }
    
    public final int d() {
        return this.H;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        Object o2 = o;
        if (!(o instanceof y)) {
            o2 = null;
        }
        final y y = (y)o2;
        if (y != null) {
            if (this.G != y.G) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    public final int f() {
        return this.I;
    }
    
    public final int g() {
        return this.J;
    }
    
    public final boolean h(final int n, final int n2) {
        final int h = this.H;
        return h > n || (h == n && this.I >= n2);
    }
    
    @Override
    public int hashCode() {
        return this.G;
    }
    
    public final boolean i(int i, final int n, final int n2) {
        final int h = this.H;
        if (h <= i) {
            if (h == i) {
                i = this.I;
                if (i > n) {
                    return true;
                }
                if (i == n && this.J >= n2) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.H);
        sb.append('.');
        sb.append(this.I);
        sb.append('.');
        sb.append(this.J);
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "kotlin/y$a", "", "Lkotlin/y;", "CURRENT", "Lkotlin/y;", "", "MAX_COMPONENT_VALUE", "I", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
    }
}
