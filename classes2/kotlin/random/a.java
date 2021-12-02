// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import java.util.Random;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016R\u0016\u0010\u0016\u001a\u00020\u00138&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019" }, d2 = { "Lkotlin/random/a;", "Lkotlin/random/f;", "", "bitCount", "b", "l", "until", "m", "", "o", "", "c", "", "h", "", "k", "", "array", "e", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public abstract class a extends f
{
    @Override
    public int b(final int n) {
        return g.j(this.r().nextInt(), n);
    }
    
    @Override
    public boolean c() {
        return this.r().nextBoolean();
    }
    
    @e
    @Override
    public byte[] e(@e final byte[] bytes) {
        k0.p(bytes, "array");
        this.r().nextBytes(bytes);
        return bytes;
    }
    
    @Override
    public double h() {
        return this.r().nextDouble();
    }
    
    @Override
    public float k() {
        return this.r().nextFloat();
    }
    
    @Override
    public int l() {
        return this.r().nextInt();
    }
    
    @Override
    public int m(final int bound) {
        return this.r().nextInt(bound);
    }
    
    @Override
    public long o() {
        return this.r().nextLong();
    }
    
    @e
    public abstract Random r();
}
