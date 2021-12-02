// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import n6.a;
import kotlin.internal.f;
import n6.l;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u001a\u001a\u0010\u0006\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\u0004H\u0001\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\r\"\u0004\b\u0001\u0010\b*\u00028\u00002\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000e¢\u0006\u0002\b\u000fH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a`\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\u0017\u0010\u0011\u001a5\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0018\u001a\u00028\u0000H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0089\u0001\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00000\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\u0014\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001ab\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b \u0010\u0011\u001aU\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\u0004\b\u0001\u0010\r*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b!\u0010\u0011\u001af\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b\"\u0010\u0011\u001aY\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\b\"\b\b\u0001\u0010\r*\u00028\u0000*\b\u0012\u0004\u0012\u00028\u00010\u00042!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00028\u00000\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001¢\u0006\u0004\b#\u0010\u0011\u001a\\\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042!\u0010$\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u0001\u0012\u0004\u0012\u00020\u00050\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b%\u0010\u0011\u001a\\\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00042!\u0010$\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0014\u0012\b\b\u0015\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u00050\u000eH\u0087\b\u00f8\u0001\u0000\u00f8\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0000¢\u0006\u0004\b&\u0010\u0011\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006'" }, d2 = { "", "exception", "", "a", "Lkotlin/b1;", "Lkotlin/j2;", "n", "(Ljava/lang/Object;)V", "R", "Lkotlin/Function0;", "block", "m", "(Ln6/a;)Ljava/lang/Object;", "T", "Lkotlin/Function1;", "Lkotlin/s;", "l", "(Ljava/lang/Object;Ln6/l;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/t0;", "name", "onFailure", "d", "defaultValue", "c", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "value", "onSuccess", "b", "(Ljava/lang/Object;Ln6/l;Ln6/l;)Ljava/lang/Object;", "transform", "f", "g", "j", "k", "action", "h", "i", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class c1
{
    @e1(version = "1.3")
    @y0
    @e
    public static final Object a(@e final Throwable t) {
        k0.p(t, "exception");
        return new b1.b(t);
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T> R b(Object o, final l<? super T, ? extends R> l, final l<? super Throwable, ? extends R> i) {
        final Throwable e = b1.e(o);
        if (e == null) {
            o = l.invoke((Object)o);
        }
        else {
            o = i.invoke(e);
        }
        return (R)o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T extends R> R c(final Object o, final R r) {
        if (b1.i(o)) {
            return r;
        }
        return (R)o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T extends R> R d(Object invoke, final l<? super Throwable, ? extends R> l) {
        final Throwable e = b1.e(invoke);
        if (e != null) {
            invoke = l.invoke(e);
        }
        return (R)invoke;
    }
    
    @e1(version = "1.3")
    @f
    private static final <T> T e(final Object o) {
        n(o);
        return (T)o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T> Object f(final Object o, final l<? super T, ? extends R> l) {
        Object invoke = o;
        if (b1.j(o)) {
            final b1.a h = b1.H;
            invoke = l.invoke((Object)o);
        }
        return b1.b(invoke);
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T> Object g(Object o, final l<? super T, ? extends R> l) {
        Object a = o;
        if (b1.j(o)) {
            try {
                final b1.a h = b1.H;
                o = b1.b(l.invoke((Object)o));
                return o;
            }
            finally {
                final b1.a h2 = b1.H;
                a = a((Throwable)o);
            }
        }
        o = b1.b(a);
        return o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <T> Object h(final Object o, final l<? super Throwable, j2> l) {
        final Throwable e = b1.e(o);
        if (e != null) {
            l.invoke(e);
        }
        return o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <T> Object i(final Object o, final l<? super T, j2> l) {
        if (b1.j(o)) {
            l.invoke((Object)o);
        }
        return o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T extends R> Object j(Object b, final l<? super Throwable, ? extends R> l) {
        final Throwable e = b1.e(b);
        if (e != null) {
            final b1.a h = b1.H;
            b = b1.b(l.invoke(e));
        }
        return b;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R, T extends R> Object k(Object o, final l<? super Throwable, ? extends R> l) {
        final Throwable e = b1.e(o);
        if (e != null) {
            try {
                final b1.a h = b1.H;
                o = b1.b(l.invoke(e));
            }
            finally {
                final b1.a h2 = b1.H;
                final Throwable t;
                o = b1.b(a(t));
            }
        }
        return o;
    }
    
    @e1(version = "1.3")
    @f
    private static final <T, R> Object l(final T t, final l<? super T, ? extends R> l) {
        Object b = null;
        try {
            final b1.a h = b1.H;
            b1.b(l.invoke(t));
        }
        finally {
            final b1.a h2 = b1.H;
            final Throwable t2;
            b = b1.b(a(t2));
        }
        return b;
    }
    
    @e1(version = "1.3")
    @f
    private static final <R> Object m(final a<? extends R> a) {
        Object b = null;
        try {
            final b1.a h = b1.H;
            b1.b(a.invoke());
        }
        finally {
            final b1.a h2 = b1.H;
            final Throwable t;
            b = b1.b(a(t));
        }
        return b;
    }
    
    @e1(version = "1.3")
    @y0
    public static final void n(@e final Object o) {
        if (!(o instanceof b1.b)) {
            return;
        }
        throw ((b1.b)o).G;
    }
}
