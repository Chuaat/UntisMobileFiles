// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.coroutines.intrinsics;

import n6.q;
import n6.p;
import kotlin.jvm.internal.q1;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.k0;
import kotlin.e1;
import kotlin.coroutines.jvm.internal.a;
import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.c1;
import org.jetbrains.annotations.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.coroutines.i;
import kotlin.j2;
import n6.l;
import kotlin.coroutines.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001aC\u0010\u0005\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\\\u0010\u000b\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001ap\u0010\u0010\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\r\"\u0004\b\u0002\u0010\u0000*)\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e¢\u0006\u0002\b\t2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00020\u0002H\u0081\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aF\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a_\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\u0000*#\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b¢\u0006\u0002\b\t2\u0006\u0010\n\u001a\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002H\u0007\u00f8\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007\u001aH\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\"\u0004\b\u0000\u0010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001c\b\u0004\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0083\b¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b" }, d2 = { "T", "Lkotlin/Function1;", "Lkotlin/coroutines/d;", "", "completion", "e", "(Ln6/l;Lkotlin/coroutines/d;)Ljava/lang/Object;", "R", "Lkotlin/Function2;", "Lkotlin/s;", "receiver", "f", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "P", "Lkotlin/Function3;", "param", "g", "(Ln6/q;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/j2;", "b", "(Ln6/l;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "c", "(Ln6/p;Ljava/lang/Object;Lkotlin/coroutines/d;)Lkotlin/coroutines/d;", "d", "block", "a", "(Lkotlin/coroutines/d;Ln6/l;)Lkotlin/coroutines/d;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/coroutines/intrinsics/IntrinsicsKt")
class c
{
    public c() {
    }
    
    @e1(version = "1.3")
    private static final <T> d<j2> a(final d<? super T> d, final l<? super d<? super T>, ?> l) {
        final g context = d.getContext();
        a a;
        if (context == i.H) {
            a = new j() {
                private int G;
                
                @f
                @Override
                protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                        this.G = 2;
                        c1.n(invoke);
                    }
                    else {
                        this.G = 1;
                        c1.n(invoke);
                        invoke = l.invoke(this);
                    }
                    return invoke;
                }
            };
        }
        else {
            a = new kotlin.coroutines.jvm.internal.d(d) {
                private int G;
                
                @f
                @Override
                protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                    final int g = this.G;
                    if (g != 0) {
                        if (g != 1) {
                            throw new IllegalStateException("This coroutine had already completed".toString());
                        }
                        this.G = 2;
                        c1.n(invoke);
                    }
                    else {
                        this.G = 1;
                        c1.n(invoke);
                        invoke = l.invoke(this);
                    }
                    return invoke;
                }
            };
        }
        return (d<j2>)a;
    }
    
    @e1(version = "1.3")
    @e
    public static <T> d<j2> b(@e final l<? super d<? super T>, ?> l, @e final d<? super T> d) {
        k0.p(l, "$this$createCoroutineUnintercepted");
        k0.p(d, "completion");
        final d<Object> a = h.a((d<? super Object>)d);
        Object create;
        if (l instanceof a) {
            create = ((a)l).create(a);
        }
        else {
            final g context = a.getContext();
            if (context == i.H) {
                create = new j() {
                    private int G;
                    
                    @f
                    @Override
                    protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.G = 2;
                            c1.n(invoke);
                        }
                        else {
                            this.G = 1;
                            c1.n(invoke);
                            final l i = l;
                            Objects.requireNonNull(i, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            invoke = ((l)q1.q(i, 1)).invoke(this);
                        }
                        return invoke;
                    }
                };
            }
            else {
                create = new kotlin.coroutines.jvm.internal.d(context) {
                    private int G;
                    
                    @f
                    @Override
                    protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.G = 2;
                            c1.n(invoke);
                        }
                        else {
                            this.G = 1;
                            c1.n(invoke);
                            final l j = l;
                            Objects.requireNonNull(j, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            invoke = ((l)q1.q(j, 1)).invoke(this);
                        }
                        return invoke;
                    }
                };
            }
        }
        return (d<j2>)create;
    }
    
    @e1(version = "1.3")
    @e
    public static <R, T> d<j2> c(@e final p<? super R, ? super d<? super T>, ?> p3, final R r, @e final d<? super T> d) {
        k0.p(p3, "$this$createCoroutineUnintercepted");
        k0.p(d, "completion");
        final d<Object> a = h.a((d<? super Object>)d);
        Object create;
        if (p3 instanceof a) {
            create = ((a)p3).create(r, a);
        }
        else {
            final g context = a.getContext();
            if (context == i.H) {
                create = new j() {
                    private int G;
                    
                    @f
                    @Override
                    protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.G = 2;
                            c1.n(invoke);
                        }
                        else {
                            this.G = 1;
                            c1.n(invoke);
                            final p i = p3;
                            Objects.requireNonNull(i, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            invoke = ((p)q1.q(i, 2)).invoke(r, this);
                        }
                        return invoke;
                    }
                };
            }
            else {
                create = new kotlin.coroutines.jvm.internal.d(context) {
                    private int G;
                    
                    @f
                    @Override
                    protected Object invokeSuspend(@org.jetbrains.annotations.e Object invoke) {
                        final int g = this.G;
                        if (g != 0) {
                            if (g != 1) {
                                throw new IllegalStateException("This coroutine had already completed".toString());
                            }
                            this.G = 2;
                            c1.n(invoke);
                        }
                        else {
                            this.G = 1;
                            c1.n(invoke);
                            final p j = p3;
                            Objects.requireNonNull(j, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
                            invoke = ((p)q1.q(j, 2)).invoke(r, this);
                        }
                        return invoke;
                    }
                };
            }
        }
        return (d<j2>)create;
    }
    
    @e1(version = "1.3")
    @e
    public static <T> d<T> d(@e final d<? super T> d) {
        k0.p(d, "$this$intercepted");
        Object o;
        if (!(d instanceof kotlin.coroutines.jvm.internal.d)) {
            o = null;
        }
        else {
            o = d;
        }
        final kotlin.coroutines.jvm.internal.d d2 = (kotlin.coroutines.jvm.internal.d)o;
        Object o2 = d;
        if (d2 != null) {
            final d<Object> intercepted = d2.intercepted();
            o2 = d;
            if (intercepted != null) {
                o2 = intercepted;
            }
        }
        return (d<T>)o2;
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <T> Object e(final l<? super d<? super T>, ?> obj, final d<? super T> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type (kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((l)q1.q(obj, 1)).invoke(d);
    }
    
    @e1(version = "1.3")
    @kotlin.internal.f
    private static final <R, T> Object f(final p<? super R, ? super d<? super T>, ?> obj, final R r, final d<? super T> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((p)q1.q(obj, 2)).invoke(r, d);
    }
    
    @kotlin.internal.f
    private static final <R, P, T> Object g(final q<? super R, ? super P, ? super d<? super T>, ?> obj, final R r, final P p4, final d<? super T> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type (R, P, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        return ((q)q1.q(obj, 3)).invoke(r, p4, d);
    }
}
