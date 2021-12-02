// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.random;

import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.Random;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \f2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\rB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\t\u001a\u00020\u00048\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e" }, d2 = { "Lkotlin/random/d;", "Lkotlin/random/a;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Ljava/util/Random;", "I", "Ljava/util/Random;", "r", "()Ljava/util/Random;", "impl", "<init>", "(Ljava/util/Random;)V", "K", "a", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
final class d extends kotlin.random.a implements Serializable
{
    @Deprecated
    private static final long J = 0L;
    @e
    private static final a K;
    @e
    private final Random I;
    
    static {
        K = new a(null);
    }
    
    public d(@e final Random i) {
        k0.p(i, "impl");
        this.I = i;
    }
    
    @e
    @Override
    public Random r() {
        return this.I;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "kotlin/random/d$a", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class a
    {
    }
}
