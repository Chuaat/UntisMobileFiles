// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.math;

import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\b\u00c2\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0000@\u0001X\u0081\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004¨\u0006\u0012" }, d2 = { "Lkotlin/math/a;", "", "", "f", "D", "upper_taylor_n_bound", "c", "taylor_2_bound", "e", "upper_taylor_2_bound", "d", "taylor_n_bound", "b", "epsilon", "a", "LN2", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class a
{
    @d
    public static final double a;
    @d
    public static final double b;
    @d
    public static final double c;
    @d
    public static final double d;
    @d
    public static final double e;
    @d
    public static final double f;
    @e
    public static final a g;
    
    static {
        g = new a();
        a = Math.log(2.0);
        final double a2 = c = Math.sqrt(b = Math.ulp(1.0));
        final double n = d = Math.sqrt(a2);
        final double n2 = 1;
        e = n2 / a2;
        f = n2 / n;
    }
    
    private a() {
    }
}
