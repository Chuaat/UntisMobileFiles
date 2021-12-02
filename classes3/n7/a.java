// 
// Decompiled by Procyon v0.5.36
// 

package n7;

import kotlin.j2;
import kotlin.jvm.internal.k0;
import kotlin.s0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000\u001a&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u0006\"\u0004\b\u0000\u0010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000¨\u0006\b" }, d2 = { "Lkotlin/Function0;", "Lkotlin/j2;", "code", "", "b", "T", "Lkotlin/s0;", "a", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @e
    public static final <T> s0<T, Double> a(@e final n6.a<? extends T> a) {
        k0.q((Object)a, "code");
        return (s0<T, Double>)new s0(a.invoke(), (Object)((System.nanoTime() - System.nanoTime()) / 1000000.0));
    }
    
    public static final double b(@e final n6.a<j2> a) {
        k0.q((Object)a, "code");
        final long nanoTime = System.nanoTime();
        a.invoke();
        return (System.nanoTime() - nanoTime) / 1000000.0;
    }
}
