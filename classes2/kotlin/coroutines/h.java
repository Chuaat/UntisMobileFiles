// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import org.jetbrains.annotations.f;
import kotlin.q;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0007¨\u0006\b" }, d2 = { "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "a", "(Lkotlin/coroutines/g$b;Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g;", "b", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class h
{
    @e1(version = "1.3")
    @q
    @f
    public static final <E extends g.b> E a(@e g.b b, @e final g.c<E> c) {
        k0.p(b, "$this$getPolymorphicElement");
        k0.p(c, "key");
        final boolean b2 = c instanceof b;
        final g.b b3 = null;
        if (b2) {
            final b<?, g.b> b4 = (b<?, g.b>)c;
            g.b b5 = b3;
            if (b4.a(b.getKey())) {
                b5 = b4.b(b);
                if (!(b5 instanceof g.b)) {
                    b5 = b3;
                }
            }
            return (E)b5;
        }
        if (b.getKey() != c) {
            b = null;
        }
        return (E)b;
    }
    
    @e1(version = "1.3")
    @q
    @e
    public static final g b(@e final g.b b, @e final g.c<?> c) {
        k0.p(b, "$this$minusPolymorphicKey");
        k0.p(c, "key");
        if (c instanceof b) {
            final b<?, ?> b2 = (b<?, ?>)c;
            Object h = b;
            if (b2.a(b.getKey())) {
                h = b;
                if (b2.b(b) != null) {
                    h = i.H;
                }
            }
            return (g)h;
        }
        Object h2 = b;
        if (b.getKey() == c) {
            h2 = i.H;
        }
        return (g)h2;
    }
}
