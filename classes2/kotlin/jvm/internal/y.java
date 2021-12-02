// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\u0002R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010" }, d2 = { "Lkotlin/jvm/internal/y;", "Lkotlin/jvm/internal/b1;", "", "", "i", "", "value", "Lkotlin/j2;", "h", "j", "d", "[D", "values", "size", "<init>", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class y extends b1<double[]>
{
    private final double[] d;
    
    public y(final int n) {
        super(n);
        this.d = new double[n];
    }
    
    public final void h(final double n) {
        final double[] d = this.d;
        final int b = this.b();
        this.e(b + 1);
        d[b] = n;
    }
    
    protected int i(@e final double[] array) {
        k0.p(array, "$this$getSize");
        return array.length;
    }
    
    @e
    public final double[] j() {
        return this.g(this.d, new double[this.f()]);
    }
}
