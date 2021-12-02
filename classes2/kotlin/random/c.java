// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.util.Random;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000  2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0018¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\tH\u0016R\u0016\u0010\u0017\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0019\u0010\u001d\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006!" }, d2 = { "Lkotlin/random/c;", "Ljava/util/Random;", "", "bits", "next", "nextInt", "bound", "", "nextBoolean", "", "nextLong", "", "nextFloat", "", "nextDouble", "", "bytes", "Lkotlin/j2;", "nextBytes", "seed", "setSeed", "G", "Z", "seedInitialized", "Lkotlin/random/f;", "H", "Lkotlin/random/f;", "a", "()Lkotlin/random/f;", "impl", "<init>", "(Lkotlin/random/f;)V", "J", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class c extends Random
{
    @Deprecated
    private static final long I = 0L;
    @e
    private static final a J;
    private boolean G;
    @e
    private final f H;
    
    static {
        J = new a(null);
    }
    
    public c(@e final f h) {
        k0.p(h, "impl");
        this.H = h;
    }
    
    @e
    public final f a() {
        return this.H;
    }
    
    @Override
    protected int next(final int n) {
        return this.H.b(n);
    }
    
    @Override
    public boolean nextBoolean() {
        return this.H.c();
    }
    
    @Override
    public void nextBytes(@e final byte[] array) {
        k0.p(array, "bytes");
        this.H.e(array);
    }
    
    @Override
    public double nextDouble() {
        return this.H.h();
    }
    
    @Override
    public float nextFloat() {
        return this.H.k();
    }
    
    @Override
    public int nextInt() {
        return this.H.l();
    }
    
    @Override
    public int nextInt(final int n) {
        return this.H.m(n);
    }
    
    @Override
    public long nextLong() {
        return this.H.o();
    }
    
    @Override
    public void setSeed(final long n) {
        if (!this.G) {
            this.G = true;
            return;
        }
        throw new UnsupportedOperationException("Setting seed is not supported.");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "kotlin/random/c$a", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
    }
}
