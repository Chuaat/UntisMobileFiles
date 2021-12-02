// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.jvm.internal;

import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0014J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\b\u001a\u00020\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f" }, d2 = { "Lkotlin/jvm/internal/j0;", "Lkotlin/jvm/internal/b1;", "", "", "i", "value", "Lkotlin/j2;", "h", "j", "d", "[I", "values", "size", "<init>", "(I)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class j0 extends b1<int[]>
{
    private final int[] d;
    
    public j0(final int n) {
        super(n);
        this.d = new int[n];
    }
    
    public final void h(final int n) {
        final int[] d = this.d;
        final int b = this.b();
        this.e(b + 1);
        d[b] = n;
    }
    
    protected int i(@e final int[] array) {
        k0.p(array, "$this$getSize");
        return array.length;
    }
    
    @e
    public final int[] j() {
        return this.g(this.d, new int[this.f()]);
    }
}
