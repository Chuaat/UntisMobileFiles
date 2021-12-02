// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.internal.l;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0000*\u00020\u0001H\u0007\u001a\t\u0010\u0004\u001a\u00020\u0000H\u0081\b\u001a\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¨\u0006\n" }, d2 = { "Lkotlin/random/f;", "Ljava/util/Random;", "a", "b", "c", "", "hi26", "low27", "", "d", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    @e1(version = "1.3")
    @org.jetbrains.annotations.e
    public static final Random a(@org.jetbrains.annotations.e final f f) {
        k0.p(f, "$this$asJavaRandom");
        f f2;
        if (!(f instanceof a)) {
            f2 = null;
        }
        else {
            f2 = f;
        }
        final a a = (a)f2;
        if (a != null) {
            final Random r = a.r();
            if (r != null) {
                return r;
            }
        }
        return new c(f);
    }
    
    @e1(version = "1.3")
    @org.jetbrains.annotations.e
    public static final f b(@org.jetbrains.annotations.e final Random random) {
        k0.p(random, "$this$asKotlinRandom");
        Random random2;
        if (!(random instanceof c)) {
            random2 = null;
        }
        else {
            random2 = random;
        }
        final c c = (c)random2;
        if (c != null) {
            final f a = c.a();
            if (a != null) {
                return a;
            }
        }
        return new d(random);
    }
    
    @kotlin.internal.f
    private static final f c() {
        return l.a.b();
    }
    
    public static final double d(final int n, final int n2) {
        return (((long)n << 27) + n2) / (double)9007199254740992L;
    }
}
