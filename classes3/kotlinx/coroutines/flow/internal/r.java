// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlinx.coroutines.flow.j;
import org.jetbrains.annotations.e;
import kotlin.y0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0081\b¨\u0006\b" }, d2 = { "Lkotlinx/coroutines/flow/internal/a;", "Lkotlinx/coroutines/flow/j;", "owner", "Lkotlin/j2;", "b", "", "index", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class r
{
    @y0
    public static final int a(final int n) {
        if (n >= 0) {
            return n;
        }
        throw new ArithmeticException("Index overflow has happened");
    }
    
    public static final void b(@e final a a, @e final j<?> j) {
        if (a.a() == j) {
            return;
        }
        throw a;
    }
}
