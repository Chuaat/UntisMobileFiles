// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.e1;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c7\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0096\u0002J\u0014\u0010\u0014\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lkotlin/coroutines/i;", "Lkotlin/coroutines/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "e", "Lkotlin/coroutines/g$b;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "context", "plus", "minusKey", "", "hashCode", "", "toString", "", "G", "J", "serialVersionUID", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
public final class i implements g, Serializable
{
    private static final long G = 0L;
    @e
    public static final i H;
    
    static {
        H = new i();
    }
    
    private i() {
    }
    
    private final Object e() {
        return i.H;
    }
    
    @Override
    public <R> R fold(final R r, @e final p<? super R, ? super b, ? extends R> p2) {
        k0.p(p2, "operation");
        return r;
    }
    
    @f
    @Override
    public <E extends b> E get(@e final c<E> c) {
        k0.p(c, "key");
        return null;
    }
    
    @Override
    public int hashCode() {
        return 0;
    }
    
    @e
    @Override
    public g minusKey(@e final c<?> c) {
        k0.p(c, "key");
        return this;
    }
    
    @e
    @Override
    public g plus(@e final g g) {
        k0.p(g, "context");
        return g;
    }
    
    @e
    @Override
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
