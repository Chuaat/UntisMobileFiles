// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import kotlin.internal.f;
import n6.l;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a2\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u0002H\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u00020\u00052\n\u0010\b\u001a\u00020\u0005\"\u00020\u0003H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006\u000b" }, d2 = { "", "size", "Lkotlin/Function1;", "Lkotlin/y1;", "init", "Lkotlin/z1;", "a", "(ILn6/l;)[J", "elements", "b", "([J)[J", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class a2
{
    @e1(version = "1.3")
    @f
    @r
    private static final long[] a(final int n, final l<? super Integer, y1> l) {
        final long[] array = new long[n];
        for (int i = 0; i < n; ++i) {
            array[i] = l.invoke(i).R0();
        }
        return z1.i(array);
    }
    
    @e1(version = "1.3")
    @f
    @r
    private static final long[] b(final long... array) {
        return array;
    }
}
