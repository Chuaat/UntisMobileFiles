// 
// Decompiled by Procyon v0.5.36
// 

package y6;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import n6.a;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a'\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u001a'\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0086\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0006" }, d2 = { "Lkotlin/Function0;", "Lkotlin/j2;", "block", "", "b", "a", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "TimingKt")
public final class b
{
    public static final long a(@e final a<j2> a) {
        k0.p((Object)a, "block");
        final long nanoTime = System.nanoTime();
        a.invoke();
        return System.nanoTime() - nanoTime;
    }
    
    public static final long b(@e final a<j2> a) {
        k0.p((Object)a, "block");
        final long currentTimeMillis = System.currentTimeMillis();
        a.invoke();
        return System.currentTimeMillis() - currentTimeMillis;
    }
}
