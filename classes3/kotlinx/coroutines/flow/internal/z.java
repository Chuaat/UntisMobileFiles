// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow.internal;

import kotlin.y0;
import kotlin.jvm.internal.h0;
import kotlinx.coroutines.flow.i;
import kotlin.b;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.internal.g0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.g$c;
import kotlinx.coroutines.k2;
import kotlin.jvm.internal.m0;
import kotlin.coroutines.g$b;
import n6.p;
import kotlin.coroutines.g;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010\u001aP\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\u0004\b\u0000\u0010\b2/\b\u0005\u0010\u000e\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0081\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "Lkotlinx/coroutines/flow/internal/x;", "Lkotlin/coroutines/g;", "currentContext", "Lkotlin/j2;", "a", "Lkotlinx/coroutines/k2;", "collectJob", "b", "T", "Lkotlin/Function2;", "Lkotlinx/coroutines/flow/j;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "Lkotlinx/coroutines/flow/i;", "c", "(Ln6/p;)Lkotlinx/coroutines/flow/i;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class z
{
    @m6.g(name = "checkContext")
    public static final void a(@e final x<?> x, @e final g obj) {
        if (((Number)obj.fold((Object)0, (p)new p<Integer, g$b, Integer>() {
            public final int a(int n, @e final g$b g$b) {
                final g$c key = g$b.getKey();
                final g$b value = x.K.get(key);
                if (key != k2.t) {
                    if (g$b != value) {
                        n = Integer.MIN_VALUE;
                    }
                    else {
                        ++n;
                    }
                    return n;
                }
                final k2 obj = (k2)value;
                final k2 b = z.b((k2)g$b, obj);
                if (b == obj) {
                    if (obj != null) {
                        ++n;
                    }
                    return n;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n");
                sb.append("\t\tChild of ");
                sb.append(b);
                sb.append(", expected child of ");
                sb.append(obj);
                sb.append(".\n");
                sb.append("\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n");
                sb.append("\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                throw new IllegalStateException(sb.toString().toString());
            }
        })).intValue() == x.G) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Flow invariant is violated:\n");
        sb.append("\t\tFlow was collected in ");
        sb.append(x.K);
        sb.append(",\n");
        sb.append("\t\tbut emission happened in ");
        sb.append(obj);
        sb.append(".\n");
        sb.append("\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @f
    public static final k2 b(@f k2 z1, @f final k2 k2) {
        while (z1 != null) {
            if (z1 == k2) {
                return z1;
            }
            if (!(z1 instanceof g0)) {
                return z1;
            }
            z1 = ((g0)z1).z1();
        }
        return null;
    }
    
    @y0
    @e
    public static final <T> i<T> c(@b @e final p<? super j<? super T>, ? super d<? super j2>, ?> p) {
        return new i<T>() {
            @f
            @Override
            public Object c(@e final j<? super T> j, @e final d<? super j2> d) {
                final Object invoke = p.invoke((Object)j, (Object)d);
                if (invoke == kotlin.coroutines.intrinsics.b.h()) {
                    return invoke;
                }
                return j2.a;
            }
            
            @f
            public Object e(@e final j j, @e final d d) {
                h0.e(4);
                new kotlin.coroutines.jvm.internal.d(d) {
                    /* synthetic */ Object G;
                    int H;
                    final /* synthetic */ z$b I;
                    
                    @f
                    public final Object invokeSuspend(@e final Object g) {
                        this.G = g;
                        this.H |= Integer.MIN_VALUE;
                        return this.I.c(null, (d<? super j2>)this);
                    }
                };
                h0.e(5);
                p.invoke((Object)j, (Object)d);
                return j2.a;
            }
        };
    }
}
