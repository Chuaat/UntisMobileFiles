// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$b$a;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import kotlin.coroutines.g$c;
import kotlin.coroutines.g$b;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c2\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00028V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b" }, d2 = { "Lkotlinx/coroutines/d4;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "<init>", "()V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
final class d4 implements g$b, g$c<d4>
{
    @e
    public static final d4 G;
    
    static {
        G = new d4();
    }
    
    private d4() {
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
        return (g$c<?>)this;
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        return g$b$a.c((g$b)this, (g$c)g$c);
    }
    
    @e
    public g plus(@e final g g) {
        return g$b$a.d((g$b)this, g);
    }
}
