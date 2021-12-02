// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.selects;

import kotlinx.coroutines.z1;
import n6.l;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020\u0002J5\u0010\b\u001a\u00020\u0007*\u00020\u00032\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H¦\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJG\u0010\r\u001a\u00020\u0007\"\u0004\b\u0001\u0010\n*\b\u0012\u0004\u0012\u00028\u00010\u000b2\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ[\u0010\u0012\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH¦\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013JU\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0001\u0010\u000f\"\u0004\b\u0002\u0010\n*\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00028\u00020\u00102\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\fH\u0096\u0002\u00f8\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J8\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\u001c\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0004H'\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a" }, d2 = { "Lkotlinx/coroutines/selects/a;", "R", "", "Lkotlinx/coroutines/selects/c;", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "block", "Lkotlin/j2;", "b", "(Lkotlinx/coroutines/selects/c;Ln6/l;)V", "Q", "Lkotlinx/coroutines/selects/d;", "Lkotlin/Function2;", "X", "(Lkotlinx/coroutines/selects/d;Ln6/p;)V", "P", "Lkotlinx/coroutines/selects/e;", "param", "n", "(Lkotlinx/coroutines/selects/e;Ljava/lang/Object;Ln6/p;)V", "x", "(Lkotlinx/coroutines/selects/e;Ln6/p;)V", "", "timeMillis", "u", "(JLn6/l;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
public interface a<R>
{
     <Q> void X(@e final d<? extends Q> p0, @e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p1);
    
    void b(@e final c p0, @e final l<? super kotlin.coroutines.d<? super R>, ?> p1);
    
     <P, Q> void n(@e final kotlinx.coroutines.selects.e<? super P, ? extends Q> p0, final P p1, @e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p2);
    
    @z1
    void u(final long p0, @e final l<? super kotlin.coroutines.d<? super R>, ?> p1);
    
     <P, Q> void x(@e final kotlinx.coroutines.selects.e<? super P, ? extends Q> p0, @e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p1);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 2 })
    public static final class a
    {
        public static <R, P, Q> void a(@e final kotlinx.coroutines.selects.a<? super R> a, @e final kotlinx.coroutines.selects.e<? super P, ? extends Q> e, @e final p<? super Q, ? super kotlin.coroutines.d<? super R>, ?> p3) {
            a.n((kotlinx.coroutines.selects.e<? super Object, ?>)e, (Object)null, (n6.p<? super Object, ? super kotlin.coroutines.d<? super R>, ?>)p3);
        }
    }
}
