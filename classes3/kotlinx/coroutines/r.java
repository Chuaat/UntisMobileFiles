// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.jvm.internal.h0;
import org.jetbrains.annotations.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.intrinsics.b;
import kotlinx.coroutines.internal.t;
import kotlinx.coroutines.internal.j;
import kotlin.coroutines.d;
import kotlin.j2;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0086H\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u001a\b\u0004\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0080H\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0000\u001a\u0018\u0010\u000e\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012" }, d2 = { "T", "Lkotlin/Function1;", "Lkotlinx/coroutines/o;", "Lkotlin/j2;", "block", "d", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "f", "Lkotlin/coroutines/d;", "delegate", "Lkotlinx/coroutines/p;", "b", "Lkotlinx/coroutines/internal/t;", "node", "c", "Lkotlinx/coroutines/l1;", "handle", "a", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class r
{
    @f2
    public static final void a(@e final o<?> o, @e final l1 l1) {
        o.t((l<? super Throwable, j2>)new m1(l1));
    }
    
    @e
    public static final <T> p<T> b(@e final d<? super T> d) {
        if (!(d instanceof j)) {
            return new p<T>((kotlin.coroutines.d<? super Object>)d, 2);
        }
        p<T> m = ((j<T>)d).m();
        if (m != null) {
            if (!m.K()) {
                m = null;
            }
            if (m != null) {
                return m;
            }
        }
        return new p<T>(d, 2);
    }
    
    public static final void c(@e final o<?> o, @e final t t) {
        o.t((l<? super Throwable, j2>)new e3(t));
    }
    
    @f
    public static final <T> Object d(@e final l<? super o<? super T>, j2> l, @e final d<? super T> d) {
        final p p2 = new p((d<? super T>)b.d((d)d), 1);
        p2.H();
        l.invoke((Object)p2);
        final Object y = p2.y();
        if (y == b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @f
    private static final Object e(@e final l l, @e final d d) {
        h0.e(0);
        final p p2 = new p((d<? super T>)b.d(d), 1);
        p2.H();
        l.invoke((Object)p2);
        final Object y = p2.y();
        if (y == b.h()) {
            h.c(d);
        }
        h0.e(1);
        return y;
    }
    
    @f
    public static final <T> Object f(@e final l<? super o<? super T>, j2> l, @e final d<? super T> d) {
        final p<Object> b = b((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d((d)d));
        l.invoke((Object)b);
        final Object y = b.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c((d)d);
        }
        return y;
    }
    
    @f
    private static final Object g(@e final l l, @e final d d) {
        h0.e(0);
        final p<Object> b = b((kotlin.coroutines.d<? super Object>)kotlin.coroutines.intrinsics.b.d(d));
        l.invoke((Object)b);
        final Object y = b.y();
        if (y == kotlin.coroutines.intrinsics.b.h()) {
            h.c(d);
        }
        h0.e(1);
        return y;
    }
}
