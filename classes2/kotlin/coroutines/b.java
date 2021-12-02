// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import n6.l;
import kotlin.q;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B:\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012#\u0010\u0013\u001a\u001f\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0016" }, d2 = { "Lkotlin/coroutines/b;", "Lkotlin/coroutines/g$b;", "B", "E", "Lkotlin/coroutines/g$c;", "element", "b", "(Lkotlin/coroutines/g$b;)Lkotlin/coroutines/g$b;", "key", "", "a", "(Lkotlin/coroutines/g$c;)Z", "G", "Lkotlin/coroutines/g$c;", "topmostKey", "baseKey", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "safeCast", "<init>", "(Lkotlin/coroutines/g$c;Ln6/l;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
@e1(version = "1.3")
@q
public abstract class b<B extends g.b, E extends B> implements c<E>
{
    private final c<?> G;
    private final l<g.b, E> H;
    
    public b(@e final c<B> c, @e final l<? super g.b, ? extends E> h) {
        k0.p(c, "baseKey");
        k0.p(h, "safeCast");
        this.H = (l<g.b, E>)h;
        c<?> g = c;
        if (c instanceof b) {
            g = ((b<?, ?>)c).G;
        }
        this.G = g;
    }
    
    public final boolean a(@e final c<?> c) {
        k0.p(c, "key");
        return c == this || this.G == c;
    }
    
    @f
    public final E b(@e final g.b b) {
        k0.p(b, "element");
        return this.H.invoke(b);
    }
}
