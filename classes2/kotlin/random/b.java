// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.Random;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f" }, d2 = { "Lkotlin/random/b;", "Lkotlin/random/a;", "kotlin/random/b$a", "I", "Lkotlin/random/b$a;", "implStorage", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class b extends a
{
    private final b$a I;
    
    public b() {
        this.I = new ThreadLocal<Random>() {
            @e
            protected Random a() {
                return new Random();
            }
        };
    }
    
    @e
    @Override
    public Random r() {
        final Random value = this.I.get();
        k0.o(value, "implStorage.get()");
        return value;
    }
}
