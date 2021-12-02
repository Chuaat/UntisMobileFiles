// 
// Decompiled by Procyon v0.5.36
// 

package q6;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\tH\u0016R\u0016\u0010\u000e\u001a\u00020\u000b8V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011" }, d2 = { "Lq6/a;", "Lkotlin/random/a;", "", "from", "until", "n", "", "p", "q", "", "i", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8" }, k = 1, mv = { 1, 5, 1 })
public final class a extends kotlin.random.a
{
    @Override
    public double i(final double bound) {
        return ThreadLocalRandom.current().nextDouble(bound);
    }
    
    @Override
    public int n(final int origin, final int bound) {
        return ThreadLocalRandom.current().nextInt(origin, bound);
    }
    
    @Override
    public long p(final long bound) {
        return ThreadLocalRandom.current().nextLong(bound);
    }
    
    @Override
    public long q(final long origin, final long bound) {
        return ThreadLocalRandom.current().nextLong(origin, bound);
    }
    
    @e
    @Override
    public Random r() {
        final ThreadLocalRandom current = ThreadLocalRandom.current();
        k0.o(current, "ThreadLocalRandom.current()");
        return current;
    }
}
