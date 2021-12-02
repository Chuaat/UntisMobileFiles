// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import org.jetbrains.annotations.f;
import n6.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "Lkotlin/coroutines/a;", "Lkotlin/coroutines/g$b;", "Lkotlin/coroutines/g$c;", "key", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "<init>", "(Lkotlin/coroutines/g$c;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public abstract class a implements b
{
    @e
    private final c<?> key;
    
    public a(@e final c<?> key) {
        k0.p(key, "key");
        this.key = key;
    }
    
    @Override
    public <R> R fold(final R r, @e final p<? super R, ? super b, ? extends R> p2) {
        k0.p(p2, "operation");
        return b.a.a((g.b)this, r, p2);
    }
    
    @f
    @Override
    public <E extends b> E get(@e final c<E> c) {
        k0.p(c, "key");
        return b.a.b((g.b)this, c);
    }
    
    @e
    @Override
    public c<?> getKey() {
        return this.key;
    }
    
    @e
    @Override
    public g minusKey(@e final c<?> c) {
        k0.p(c, "key");
        return b.a.c((g.b)this, c);
    }
    
    @e
    @Override
    public g plus(@e final g g) {
        k0.p(g, "context");
        return b.a.d((g.b)this, g);
    }
}
