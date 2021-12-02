// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import kotlin.j2;
import n6.l;
import kotlin.jvm.internal.w;
import kotlin.b1$a;
import kotlin.c1;
import kotlin.b1;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\n\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012%\b\u0002\u0010\b\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a0\u0010\u000e\u001a\u0004\u0018\u00010\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\fH\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a6\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "T", "Lkotlin/b1;", "Lkotlin/Function1;", "", "Lkotlin/t0;", "name", "cause", "Lkotlin/j2;", "onCancellation", "", "c", "(Ljava/lang/Object;Ln6/l;)Ljava/lang/Object;", "Lkotlinx/coroutines/o;", "caller", "b", "(Ljava/lang/Object;Lkotlinx/coroutines/o;)Ljava/lang/Object;", "state", "Lkotlin/coroutines/d;", "uCont", "a", "(Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class j0
{
    @e
    public static final <T> Object a(@f Object a, @e final d<? super T> d) {
        if (a instanceof d0) {
            final b1$a h = b1.H;
            Throwable t2;
            final Throwable t = t2 = ((d0)a).a;
            if (w0.e()) {
                if (!(d instanceof kotlin.coroutines.jvm.internal.e)) {
                    t2 = t;
                }
                else {
                    t2 = kotlinx.coroutines.internal.j0.c(t, (kotlin.coroutines.jvm.internal.e)d);
                }
            }
            a = c1.a(t2);
        }
        else {
            final b1$a h2 = b1.H;
        }
        return b1.b(a);
    }
    
    @f
    public static final <T> Object b(@e Object o, @e final o<?> o2) {
        final Throwable e = b1.e(o);
        if (e != null) {
            Throwable c = e;
            if (w0.e()) {
                if (!(o2 instanceof kotlin.coroutines.jvm.internal.e)) {
                    c = e;
                }
                else {
                    c = kotlinx.coroutines.internal.j0.c(e, (kotlin.coroutines.jvm.internal.e)o2);
                }
            }
            o = new d0(c, false, 2, null);
        }
        return o;
    }
    
    @f
    public static final <T> Object c(@e final Object o, @f final l<? super Throwable, j2> l) {
        final Throwable e = b1.e(o);
        Object o2;
        if (e == null) {
            o2 = o;
            if (l != null) {
                o2 = new e0(o, l);
            }
        }
        else {
            o2 = new d0(e, false, 2, null);
        }
        return o2;
    }
}
