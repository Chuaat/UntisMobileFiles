// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.channels;

import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import m6.g;
import kotlin.k;
import kotlin.i;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J\u0013\u0010\u0004\u001a\u00020\u0003H¦B\u00f8\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00028\u0000H\u0097@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00028\u0000H¦\u0002¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t" }, d2 = { "Lkotlinx/coroutines/channels/q;", "E", "", "", "a", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "b", "next", "()Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface q<E>
{
    @f
    Object a(@e final d<? super Boolean> p0);
    
    E next();
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        @i(level = k.I, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        @g(name = "next")
        public static /* synthetic */  <E> Object a(q<? extends E> j, final d<? super E> d) {
            Object o = null;
            Label_0047: {
                if (d instanceof q$a$a) {
                    final kotlin.coroutines.jvm.internal.d d2 = (q$a$a)d;
                    final int h = d2.H;
                    if ((h & Integer.MIN_VALUE) != 0x0) {
                        d2.H = h + Integer.MIN_VALUE;
                        o = d2;
                        break Label_0047;
                    }
                }
                o = new kotlin.coroutines.jvm.internal.d() {
                    /* synthetic */ Object G;
                    int H;
                    Object J;
                    
                    @f
                    public final Object invokeSuspend(@e final Object g) {
                        this.G = g;
                        this.H |= Integer.MIN_VALUE;
                        return a.a((q<?>)null, (kotlin.coroutines.d<? super Object>)this);
                    }
                };
            }
            final Object g = ((q$a$a)o).G;
            final Object h2 = b.h();
            final int h3 = ((q$a$a)o).H;
            Object a;
            if (h3 != 0) {
                if (h3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = (q)((q$a$a)o).J;
                c1.n(g);
                a = g;
            }
            else {
                c1.n(g);
                ((q$a$a)o).J = j;
                ((q$a$a)o).H = 1;
                if ((a = j.a((d<? super Boolean>)o)) == h2) {
                    return h2;
                }
            }
            if (a) {
                return j.next();
            }
            throw new w("Channel was closed");
        }
    }
}
