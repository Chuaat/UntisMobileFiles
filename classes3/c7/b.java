// 
// Decompiled by Procyon v0.5.36
// 

package c7;

import n6.a;
import kotlinx.coroutines.y3;
import org.jetbrains.annotations.f;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.w0;
import kotlinx.coroutines.t2;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.internal.g0;
import n6.p;
import kotlin.b1$a;
import kotlin.coroutines.g;
import kotlin.c1;
import kotlin.b1;
import kotlin.jvm.internal.q1;
import kotlinx.coroutines.internal.p0;
import kotlin.coroutines.jvm.internal.h;
import org.jetbrains.annotations.e;
import kotlin.coroutines.d;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a@\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001aT\u0010\u000b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a@\u0010\r\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u0007\u001aT\u0010\u000e\u001a\u00020\u0005\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\u0000*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u000e\u0010\f\u001a9\u0010\u0010\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0082\b\u001a[\u0010\u0013\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a[\u0010\u0015\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\n\u001a\u00028\u00012'\u0010\u000f\u001a#\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\t¢\u0006\u0002\b\u0012H\u0000\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0014\u001a?\u0010\u001b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00112\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00012\u000e\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019H\u0082\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c" }, d2 = { "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "Lkotlin/j2;", "c", "(Ln6/l;Lkotlin/coroutines/d;)V", "R", "Lkotlin/Function2;", "receiver", "d", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)V", "a", "b", "block", "e", "Lkotlinx/coroutines/internal/g0;", "Lkotlin/s;", "f", "(Lkotlinx/coroutines/internal/g0;Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "g", "", "", "shouldThrow", "Lkotlin/Function0;", "startBlock", "h", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class b
{
    public static final <T> void a(@e final l<? super d<? super T>, ?> l, @e d<? super T> o) {
        final d a = h.a((d)o);
        Object a2 = null;
        Label_0089: {
            try {
                final g context = ((d)o).getContext();
                o = p0.c(context, null);
                if (l != null) {
                    Label_0072: {
                        try {
                            final Object invoke = ((l)q1.q((Object)l, 1)).invoke((Object)a);
                            p0.a(context, o);
                            if (invoke != kotlin.coroutines.intrinsics.b.h()) {
                                o = b1.H;
                                break Label_0089;
                            }
                            return;
                        }
                        finally {
                            break Label_0072;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    p0.a(context, o);
                }
                throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
            finally {
                final b1$a h = b1.H;
                final Throwable t;
                a2 = c1.a(t);
            }
        }
        a.resumeWith(b1.b(a2));
    }
    
    public static final <R, T> void b(@e final p<? super R, ? super d<? super T>, ?> p2, final R r, @e d<? super T> context) {
        final d a = h.a((d)context);
        Object a2 = null;
        Label_0093: {
            try {
                context = ((d)context).getContext();
                final Object c = p0.c(context, null);
                if (p2 != null) {
                    Label_0075: {
                        try {
                            final Object invoke = ((p)q1.q((Object)p2, 2)).invoke((Object)r, (Object)a);
                            p0.a(context, c);
                            if (invoke != kotlin.coroutines.intrinsics.b.h()) {
                                final b1$a h = b1.H;
                                break Label_0093;
                            }
                            return;
                        }
                        finally {
                            break Label_0075;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                    }
                    p0.a(context, c);
                }
                throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
            }
            finally {
                final b1$a h2 = b1.H;
                final Throwable t;
                a2 = c1.a(t);
            }
        }
        a.resumeWith(b1.b(a2));
    }
    
    public static final <T> void c(@e l<? super d<? super T>, ?> o, @e d<? super T> a) {
        a = h.a(a);
        if (o != null) {
            Label_0063: {
                Label_0054: {
                    try {
                        o = ((l)q1.q(o, 1)).invoke((Object)a);
                        if (o != kotlin.coroutines.intrinsics.b.h()) {
                            final b1$a h = b1.H;
                            break Label_0063;
                        }
                        return;
                    }
                    finally {
                        break Label_0054;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                final b1$a h2 = b1.H;
                final Throwable t;
                o = c1.a(t);
            }
            a.resumeWith(b1.b(o));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
    
    public static final <R, T> void d(@e final p<? super R, ? super d<? super T>, ?> p2, final R r, @e d<? super T> a) {
        a = h.a(a);
        if (p2 != null) {
            final Object a2;
            Label_0064: {
                Label_0055: {
                    try {
                        if (((p)q1.q((Object)p2, 2)).invoke((Object)r, (Object)a) != kotlin.coroutines.intrinsics.b.h()) {
                            final b1$a h = b1.H;
                            break Label_0064;
                        }
                        return;
                    }
                    finally {
                        break Label_0055;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                final b1$a h2 = b1.H;
                a2 = c1.a((Throwable)a2);
            }
            a.resumeWith(b1.b(a2));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
    
    private static final <T> void e(d<? super T> a, final l<? super d<? super T>, ?> l) {
        a = h.a(a);
        try {
            final Object invoke = l.invoke((Object)a);
            if (invoke != kotlin.coroutines.intrinsics.b.h()) {
                final b1$a h = b1.H;
                a.resumeWith(b1.b(invoke));
            }
        }
        finally {
            final b1$a h2 = b1.H;
            final Throwable t;
            a.resumeWith(b1.b(c1.a(t)));
        }
    }
    
    @f
    public static final <T, R> Object f(@e final g0<? super T> g0, final R r, @e final p<? super R, ? super d<? super T>, ?> p3) {
        g0.t1();
        if (p3 != null) {
            final d0 d0;
            Label_0055: {
                Label_0043: {
                    try {
                        ((p)q1.q((Object)p3, 2)).invoke((Object)r, (Object)g0);
                        break Label_0055;
                    }
                    finally {
                        break Label_0043;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                d0 = new d0((Throwable)d0, false, 2, null);
            }
            if (d0 != kotlin.coroutines.intrinsics.b.h()) {
                final Object r2 = g0.R0(d0);
                if (r2 != t2.b) {
                    if (r2 instanceof d0) {
                        final Throwable a = ((d0)r2).a;
                        final d<T> j = (d<T>)g0.J;
                        Throwable c = a;
                        if (w0.e()) {
                            if (!(j instanceof kotlin.coroutines.jvm.internal.e)) {
                                c = a;
                            }
                            else {
                                c = j0.c(a, (kotlin.coroutines.jvm.internal.e)j);
                            }
                        }
                        throw c;
                    }
                    return t2.o(r2);
                }
            }
            return kotlin.coroutines.intrinsics.b.h();
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
    
    @f
    public static final <T, R> Object g(@e final g0<? super T> g0, final R r, @e final p<? super R, ? super d<? super T>, ?> p3) {
        g0.t1();
        boolean b = false;
        if (p3 != null) {
            final d0 d0;
            Label_0057: {
                Label_0045: {
                    try {
                        ((p)q1.q((Object)p3, 2)).invoke((Object)r, (Object)g0);
                        break Label_0057;
                    }
                    finally {
                        break Label_0045;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                }
                d0 = new d0((Throwable)d0, false, 2, null);
            }
            if (d0 != kotlin.coroutines.intrinsics.b.h()) {
                final Object r2 = g0.R0(d0);
                if (r2 != t2.b) {
                    if (!(r2 instanceof d0)) {
                        return t2.o(r2);
                    }
                    final Throwable a = ((d0)r2).a;
                    if (!(a instanceof y3) || ((y3)a).G != g0) {
                        b = true;
                    }
                    if (b) {
                        final d<T> j = (d<T>)g0.J;
                        Throwable c = a;
                        if (w0.e()) {
                            if (!(j instanceof kotlin.coroutines.jvm.internal.e)) {
                                c = a;
                            }
                            else {
                                c = j0.c(a, (kotlin.coroutines.jvm.internal.e)j);
                            }
                        }
                        throw c;
                    }
                    final Object o = d0;
                    if (d0 instanceof d0) {
                        final Throwable a2 = d0.a;
                        final d<T> i = (d<T>)g0.J;
                        Throwable c2 = a2;
                        if (w0.e()) {
                            if (!(i instanceof kotlin.coroutines.jvm.internal.e)) {
                                c2 = a2;
                            }
                            else {
                                c2 = j0.c(a2, (kotlin.coroutines.jvm.internal.e)i);
                            }
                        }
                        throw c2;
                    }
                    return o;
                }
            }
            return kotlin.coroutines.intrinsics.b.h();
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
    
    private static final <T> Object h(final g0<? super T> g0, final l<? super Throwable, Boolean> l, final a<?> a) {
        d0 d0 = null;
        try {
            a.invoke();
        }
        finally {
            final Throwable t;
            d0 = new d0(t, false, 2, null);
        }
        if (d0 == kotlin.coroutines.intrinsics.b.h()) {
            return kotlin.coroutines.intrinsics.b.h();
        }
        final Object r0 = g0.R0(d0);
        if (r0 == t2.b) {
            return kotlin.coroutines.intrinsics.b.h();
        }
        Object o;
        if (r0 instanceof d0) {
            final d0 d2 = (d0)r0;
            if (l.invoke((Object)d2.a)) {
                final Throwable a2 = d2.a;
                final kotlin.coroutines.d<? super T> j = g0.J;
                Throwable c = a2;
                if (w0.e()) {
                    if (!(j instanceof kotlin.coroutines.jvm.internal.e)) {
                        c = a2;
                    }
                    else {
                        c = j0.c(a2, (kotlin.coroutines.jvm.internal.e)j);
                    }
                }
                throw c;
            }
            o = d0;
            if (d0 instanceof d0) {
                final Throwable a3 = d0.a;
                final kotlin.coroutines.d<? super T> i = g0.J;
                Throwable c2 = a3;
                if (w0.e()) {
                    if (!(i instanceof kotlin.coroutines.jvm.internal.e)) {
                        c2 = a3;
                    }
                    else {
                        c2 = j0.c(a3, (kotlin.coroutines.jvm.internal.e)i);
                    }
                }
                throw c2;
            }
        }
        else {
            o = t2.o(r0);
        }
        return o;
    }
}
