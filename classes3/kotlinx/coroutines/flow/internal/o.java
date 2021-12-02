// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$b$a;
import n6.p;
import kotlin.jvm.internal.w;
import m6.d;
import kotlin.coroutines.g$c;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\u00068\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010" }, d2 = { "Lkotlinx/coroutines/flow/internal/o;", "Lkotlin/coroutines/g$b;", "", "H", "Ljava/lang/Throwable;", "e", "Lkotlin/coroutines/g$c;", "G", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "(Ljava/lang/Throwable;)V", "I", "a", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public final class o implements g$b
{
    @e
    public static final a I;
    @e
    private final g$c<?> G;
    @d
    @e
    public final Throwable H;
    
    static {
        I = new a(null);
    }
    
    public o(@e final Throwable h) {
        this.H = h;
        this.G = (g$c<?>)o.I;
    }
    
    public <R> R fold(final R r, @e final p<? super R, ? super g$b, ? extends R> p2) {
        return (R)g$b$a.a((g$b)this, (Object)r, (p)p2);
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        return (E)g$b$a.b((g$b)this, (g$c)g$c);
    }
    
    @e
    public g$c<?> getKey() {
        return this.G;
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        return g$b$a.c((g$b)this, (g$c)g$c);
    }
    
    @e
    public g plus(@e final g g) {
        return g$b$a.d((g$b)this, g);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "kotlinx/coroutines/flow/internal/o$a", "Lkotlin/coroutines/g$c;", "Lkotlinx/coroutines/flow/internal/o;", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    public static final class a implements g$c<o>
    {
        private a() {
        }
    }
}
