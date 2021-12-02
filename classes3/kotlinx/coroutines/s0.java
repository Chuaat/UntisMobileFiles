// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.h0;
import kotlin.coroutines.jvm.internal.h;
import c7.b;
import kotlinx.coroutines.internal.g0;
import kotlin.coroutines.d;
import n6.p;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.i;
import kotlin.coroutines.g$c;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\u0002\u001a\u0006\u0010\u0004\u001a\u00020\u0000\u001aO\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006¢\u0006\u0002\b\tH\u0086@\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001c\u0010\u0012\u001a\u00020\u0011*\u00020\u00002\u0010\b\u0002\u0010\u0010\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u000f\u001a\u001e\u0010\u0016\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0015\u001a\n\u0010\u0017\u001a\u00020\u0011*\u00020\u0000\u001a\u0013\u0010\u0018\u001a\u00020\u0001H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u001d\u0010\u001f\u001a\u00020\u001a*\u00020\u00008F@\u0006¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "Lkotlinx/coroutines/r0;", "Lkotlin/coroutines/g;", "context", "m", "b", "R", "Lkotlin/Function2;", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "block", "g", "(Ln6/p;Lkotlin/coroutines/d;)Ljava/lang/Object;", "a", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/j2;", "d", "", "message", "", "c", "j", "h", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "k", "(Lkotlinx/coroutines/r0;)Z", "isActive$annotations", "(Lkotlinx/coroutines/r0;)V", "isActive", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class s0
{
    @e
    public static final r0 a(@e g plus) {
        if (plus.get((g$c)k2.t) == null) {
            plus = plus.plus((g)o2.d(null, 1, null));
        }
        return new i(plus);
    }
    
    @e
    public static final r0 b() {
        return new i(((g)p3.c(null, 1, null)).plus((g)i1.e()));
    }
    
    public static final void c(@e final r0 r0, @e final String s, @f final Throwable t) {
        d(r0, u1.a(s, t));
    }
    
    public static final void d(@e final r0 obj, @f final CancellationException ex) {
        final k2 k2 = (k2)obj.J().get((g$c)kotlinx.coroutines.k2.t);
        if (k2 != null) {
            k2.d(ex);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Scope cannot be cancelled because it does not have a job: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @f
    public static final <R> Object g(@e final p<? super r0, ? super d<? super R>, ?> p2, @e final d<? super R> d) {
        final g0<Object> g0 = new g0<Object>(d.getContext(), (kotlin.coroutines.d<? super Object>)d);
        final Object f = b.f((g0<? super Object>)g0, g0, (n6.p<? super g0<Object>, ? super kotlin.coroutines.d<? super Object>, ?>)p2);
        if (f == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return f;
    }
    
    @f
    public static final Object h(@e final d<? super g> d) {
        return d.getContext();
    }
    
    @f
    private static final Object i(@e final d d) {
        h0.e(3);
        throw null;
    }
    
    public static final void j(@e final r0 r0) {
        o2.A(r0.J());
    }
    
    public static final boolean k(@e final r0 r0) {
        final k2 k2 = (k2)r0.J().get((g$c)kotlinx.coroutines.k2.t);
        return k2 == null || k2.a();
    }
    
    @e
    public static final r0 m(@e final r0 r0, @e final g g) {
        return new i(r0.J().plus(g));
    }
}
