// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.a;
import org.jetbrains.annotations.f;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a*\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u000b" }, d2 = { "T", "Lkotlin/Function0;", "initializer", "Lkotlin/b0;", "c", "Lkotlin/g0;", "mode", "b", "", "lock", "a", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/LazyKt")
class e0
{
    public e0() {
    }
    
    @e
    public static final <T> b0<T> a(@f final Object o, @e final a<? extends T> a) {
        k0.p(a, "initializer");
        return new k1<T>(a, o);
    }
    
    @e
    public static <T> b0<T> b(@e final g0 g0, @e final a<? extends T> a) {
        k0.p(g0, "mode");
        k0.p(a, "initializer");
        final int n = c0.a[g0.ordinal()];
        Serializable s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    throw new h0();
                }
                s = new k2<Object>(a);
            }
            else {
                s = new d1<Object>(a);
            }
        }
        else {
            s = new k1<Object>(a, null, 2, null);
        }
        return (b0<T>)s;
    }
    
    @e
    public static <T> b0<T> c(@e final a<? extends T> a) {
        k0.p(a, "initializer");
        return new k1<T>(a, null, 2, null);
    }
}
