// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import kotlin.y0;
import kotlinx.coroutines.u0;
import java.util.Set;
import java.util.List;
import java.util.Collection;
import n6.a;
import kotlinx.coroutines.k2;
import java.util.Iterator;
import kotlinx.coroutines.channels.l0;
import n6.u;
import n6.r;
import n6.t;
import kotlinx.coroutines.z1;
import kotlin.b;
import kotlinx.coroutines.a2;
import kotlin.z0;
import kotlinx.coroutines.r0;
import n6.q;
import kotlinx.coroutines.channels.h0;
import kotlin.k;
import kotlin.coroutines.g;
import org.jetbrains.annotations.f;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "kotlinx/coroutines/flow/m", "kotlinx/coroutines/flow/n", "kotlinx/coroutines/flow/o", "kotlinx/coroutines/flow/p", "kotlinx/coroutines/flow/q", "kotlinx/coroutines/flow/r", "kotlinx/coroutines/flow/s", "kotlinx/coroutines/flow/t", "kotlinx/coroutines/flow/u", "kotlinx/coroutines/flow/v", "kotlinx/coroutines/flow/w", "kotlinx/coroutines/flow/x", "kotlinx/coroutines/flow/z", "kotlinx/coroutines/flow/a0", "kotlinx/coroutines/flow/b0", "kotlinx/coroutines/flow/y", "kotlinx/coroutines/flow/c0" }, d2 = {}, k = 4, mv = { 1, 4, 2 })
public final class l
{
    @e
    public static final String a = "kotlinx.coroutines.flow.defaultConcurrency";
    
    @f
    public static final <T> Object A(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p3, @e final d<? super j2> d) {
        return o.b((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p3, d);
    }
    
    @f
    public static final <T> Object A0(@e final i<? extends T> i, @e final d<? super T> d) {
        return a0.c((i<?>)i, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @kotlin.i(level = k.H, message = "Collect flow in the desired context instead")
    @e
    public static final <T> i<T> A1(@e final i<? extends T> i, @e final g g) {
        return z.y(i, g);
    }
    
    @f
    private static final Object B(@e final i i, @e final p p3, @e final d d) {
        return o.b((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p3, (d<? super j2>)d);
    }
    
    @f
    public static final <T> Object B0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p3, @e final d<? super T> d) {
        return a0.d((i<?>)i, (n6.p<? super Object, ? super d<? super Boolean>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @e
    public static final <T> i<T> B1(@e final h0<? extends T> h0) {
        return n.h(h0);
    }
    
    @f
    public static final <T> Object C(@e final i<? extends T> i, @e final q<? super Integer, ? super T, ? super d<? super j2>, ?> q, @e final d<? super j2> d) {
        return o.d((i<?>)i, (n6.q<? super Integer, ? super Object, ? super d<? super j2>, ?>)q, d);
    }
    
    @e
    public static final h0<j2> C0(@e final r0 r0, final long n, final long n2) {
        return s.f(r0, n, n2);
    }
    
    @f
    public static final <S, T extends S> Object C1(@e final i<? extends T> i, @e final q<? super S, ? super T, ? super d<? super S>, ?> q, @e final d<? super S> d) {
        return a0.g((i<?>)i, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)q, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @f
    private static final Object D(@e final i i, @e final q q, @e final d d) {
        return o.d((i<?>)i, (n6.q<? super Integer, ? super Object, ? super d<? super j2>, ?>)q, (d<? super j2>)d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @z0(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @e
    public static final <T> i<T> D1(@e final i<? extends T> i) {
        return z.z(i);
    }
    
    @f
    public static final <T> Object E(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p3, @e final d<? super j2> d) {
        return o.f((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p3, d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue is 'flatMapConcat'", replaceWith = @z0(expression = "flatMapConcat(mapper)", imports = {}))
    @e
    public static final <T, R> i<R> E0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super i<? extends R>>, ?> p2) {
        return z.l((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super i<? extends R>>, ?>)p2);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStared.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @z0(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @e
    public static final <T> i<T> E1(@e final i<? extends T> i, final int n) {
        return z.A(i, n);
    }
    
    @f
    public static final <T> Object F(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p3, @e final d<? super j2> d) {
        return w.a((i<?>)i, (n6.p<? super Object, ? super d<? super Boolean>, ?>)p3, d);
    }
    
    @a2
    @e
    public static final <T, R> i<R> F0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super i<? extends R>>, ?> p2) {
        return x.a((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super i<? extends R>>, ?>)p2);
    }
    
    @f
    private static final Object G(@e final i i, @e final p p3, @e final d d) {
        return w.a((i<?>)i, (n6.p<? super Object, ? super d<? super Boolean>, ?>)p3, (d<? super j2>)d);
    }
    
    @z1
    @e
    public static final <T, R> i<R> G0(@e final i<? extends T> i, @b @e final p<? super T, ? super d<? super i<? extends R>>, ?> p2) {
        return x.b((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super i<? extends R>>, ?>)p2);
    }
    
    @e
    public static final <T> i<T> G1(@e final i<? extends T> i, final long n, @e final p<? super Throwable, ? super d<? super Boolean>, ?> p3) {
        return v.i(i, n, p3);
    }
    
    @a2
    @e
    public static final <T, R> i<R> H0(@e final i<? extends T> i, final int n, @e final p<? super T, ? super d<? super i<? extends R>>, ?> p3) {
        return x.c((i<?>)i, n, (n6.p<? super Object, ? super kotlin.coroutines.d<? super i<? extends R>>, ?>)p3);
    }
    
    @e
    public static final <T1, T2, T3, T4, T5, R> i<R> I(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @e final i<? extends T5> m, @e final t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super R>, ?> t) {
        return c0.c((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (i<?>)m, (n6.t<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)t);
    }
    
    @e
    public static final <T1, T2, T3, T4, R> i<R> J(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @e final n6.s<? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super R>, ?> s) {
        return c0.d((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (n6.s<? super Object, ? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)s);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @z0(expression = "flattenConcat()", imports = {}))
    @e
    public static final <T> i<T> J0(@e final i<? extends i<? extends T>> i) {
        return z.m(i);
    }
    
    @e
    public static final <T> i<T> J1(@e final i<? extends T> i, @e final r<? super j<? super T>, ? super Throwable, ? super Long, ? super d<? super Boolean>, ?> r) {
        return v.l(i, r);
    }
    
    @e
    public static final <T1, T2, T3, R> i<R> K(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @b @e final r<? super T1, ? super T2, ? super T3, ? super d<? super R>, ?> r) {
        return c0.e((i<?>)i, (i<?>)j, (i<?>)k, (n6.r<? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)r);
    }
    
    @a2
    @e
    public static final <T> i<T> K0(@e final i<? extends i<? extends T>> i) {
        return x.e(i);
    }
    
    @z1
    @e
    public static final <T> i<T> K1(@e final i<? extends T> i, @e final q<? super T, ? super T, ? super d<? super T>, ?> q) {
        return y.h(i, q);
    }
    
    @e
    public static final <T1, T2, R> i<R> L(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final q<? super T1, ? super T2, ? super d<? super R>, ?> q) {
        return c0.f((i<?>)i, (i<?>)j, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @a2
    @e
    public static final <T> i<T> L0(@e final i<? extends i<? extends T>> i, final int n) {
        return x.f(i, n);
    }
    
    @a2
    @e
    public static final <T> i<T> L1(@e final i<? extends T> i, final long n) {
        return s.h(i, n);
    }
    
    @kotlin.time.j
    @a2
    @e
    public static final <T> i<T> M1(@e final i<? extends T> i, final double n) {
        return s.i(i, n);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @z0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @e
    public static final <T1, T2, T3, T4, T5, R> i<R> N(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @e final i<? extends T5> m, @e final t<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super R>, ?> t) {
        return z.b((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (i<?>)m, (n6.t<? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)t);
    }
    
    @e
    public static final <T> i<T> N0(@b @e final p<? super j<? super T>, ? super d<? super j2>, ?> p) {
        return m.n(p);
    }
    
    @z1
    @e
    public static final <T, R> i<R> N1(@e final i<? extends T> i, final R r, @b @e final q<? super R, ? super T, ? super d<? super R>, ?> q) {
        return y.i((i<?>)i, r, (n6.q<? super R, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @z0(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @e
    public static final <T1, T2, T3, T4, R> i<R> O(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @e final n6.s<? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super R>, ?> s) {
        return z.c((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (n6.s<? super Object, ? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)s);
    }
    
    @m6.g(name = "flowCombine")
    @e
    public static final <T1, T2, R> i<R> O0(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final q<? super T1, ? super T2, ? super d<? super R>, ?> q) {
        return c0.p((i<?>)i, (i<?>)j, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @kotlin.i(level = k.H, message = "Flow has less verbose 'scan' shortcut", replaceWith = @z0(expression = "scan(initial, operation)", imports = {}))
    @e
    public static final <T, R> i<R> O1(@e final i<? extends T> i, final R r, @b @e final q<? super R, ? super T, ? super d<? super R>, ?> q) {
        return z.B((i<?>)i, r, (n6.q<? super R, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @z0(expression = "combine(this, other, other2, transform)", imports = {}))
    @e
    public static final <T1, T2, T3, R> i<R> P(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final r<? super T1, ? super T2, ? super T3, ? super d<? super R>, ?> r) {
        return z.d((i<?>)i, (i<?>)j, (i<?>)k, (n6.r<? super Object, ? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)r);
    }
    
    @m6.g(name = "flowCombineTransform")
    @e
    public static final <T1, T2, R> i<R> P0(@e final i<? extends T1> i, @e final i<? extends T2> j, @b @e final r<? super j<? super R>, ? super T1, ? super T2, ? super d<? super j2>, ?> r) {
        return c0.q((i<?>)i, (i<?>)j, (n6.r<? super j<? super R>, ? super Object, ? super Object, ? super d<? super j2>, ?>)r);
    }
    
    @kotlin.i(level = k.G, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @z0(expression = "runningReduce(operation)", imports = {}))
    @e
    public static final <T> i<T> P1(@e final i<? extends T> i, @e final q<? super T, ? super T, ? super d<? super T>, ?> q) {
        return z.C(i, q);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @z0(expression = "this.combine(other, transform)", imports = {}))
    @e
    public static final <T1, T2, R> i<R> Q(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final q<? super T1, ? super T2, ? super d<? super R>, ?> q) {
        return z.e((i<?>)i, (i<?>)j, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @e
    public static final <T> i<T> Q0(final T t) {
        return m.o(t);
    }
    
    @e
    public static final <T> j0<T> Q1(@e final i<? extends T> i, @e final r0 r0, @e final q0 q0, final int n) {
        return b0.g(i, r0, q0, n);
    }
    
    @e
    public static final <T> i<T> R0(@e final T... array) {
        return m.p(array);
    }
    
    @e
    public static final <T1, T2, T3, T4, T5, R> i<R> S(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @e final i<? extends T5> m, @b @e final u<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super d<? super j2>, ?> u) {
        return c0.i((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (i<?>)m, (n6.u<? super j<? super R>, ? super Object, ? super Object, ? super Object, ? super Object, ? super Object, ? super d<? super j2>, ?>)u);
    }
    
    @e
    public static final <T> i<T> S0(@e final i<? extends T> i, @e final g g) {
        return kotlinx.coroutines.flow.q.h(i, g);
    }
    
    @f
    public static final <T> Object S1(@e final i<? extends T> i, @e final d<? super T> d) {
        return a0.h((i<?>)i, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @e
    public static final <T1, T2, T3, T4, R> i<R> T(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @e final i<? extends T4> l, @b @e final t<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super d<? super j2>, ?> t) {
        return c0.j((i<?>)i, (i<?>)j, (i<?>)k, (i<?>)l, (n6.t<? super j<? super R>, ? super Object, ? super Object, ? super Object, ? super Object, ? super d<? super j2>, ?>)t);
    }
    
    @kotlin.i(level = k.H, message = "Use channelFlow with awaitClose { } instead of flowViaChannel and invokeOnClose { }.")
    @a2
    @e
    public static final <T> i<T> T0(final int n, @b @e final p<? super r0, ? super l0<? super T>, j2> p2) {
        return m.q(n, p2);
    }
    
    @f
    public static final <T> Object T1(@e final i<? extends T> i, @e final d<? super T> d) {
        return a0.i((i<?>)i, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @e
    public static final <T1, T2, T3, R> i<R> U(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final i<? extends T3> k, @b @e final n6.s<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super d<? super j2>, ?> s) {
        return c0.k((i<?>)i, (i<?>)j, (i<?>)k, (n6.s<? super j<? super R>, ? super Object, ? super Object, ? super Object, ? super d<? super j2>, ?>)s);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @z0(expression = "drop(count)", imports = {}))
    @e
    public static final <T> i<T> U1(@e final i<? extends T> i, final int n) {
        return z.D(i, n);
    }
    
    @e
    public static final <T1, T2, R> i<R> V(@e final i<? extends T1> i, @e final i<? extends T2> j, @b @e final r<? super j<? super R>, ? super T1, ? super T2, ? super d<? super j2>, ?> r) {
        return c0.l((i<?>)i, (i<?>)j, (n6.r<? super j<? super R>, ? super Object, ? super Object, ? super d<? super j2>, ?>)r);
    }
    
    @kotlin.i(level = k.H, message = "flowWith is deprecated without replacement, please refer to its KDoc for an explanation")
    @a2
    @e
    public static final <T, R> i<R> V0(@e final i<? extends T> i, @e final g g, final int n, @e final n6.l<? super i<? extends T>, ? extends i<? extends R>> l) {
        return kotlinx.coroutines.flow.q.i((i<?>)i, g, n, (n6.l<? super i<?>, ? extends i<? extends R>>)l);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @z0(expression = "onStart { emit(value) }", imports = {}))
    @e
    public static final <T> i<T> V1(@e final i<? extends T> i, final T t) {
        return z.E(i, t);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @z0(expression = "onStart { emitAll(other) }", imports = {}))
    @e
    public static final <T> i<T> W1(@e final i<? extends T> i, @e final i<? extends T> j) {
        return z.F(i, j);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'compose' is 'let'", replaceWith = @z0(expression = "let(transformer)", imports = {}))
    @e
    public static final <T, R> i<R> X(@e final i<? extends T> i, @e final n6.l<? super i<? extends T>, ? extends i<? extends R>> l) {
        return z.f((i<?>)i, (n6.l<? super i<?>, ? extends i<? extends R>>)l);
    }
    
    @f
    public static final <T, R> Object X0(@e final i<? extends T> i, final R r, @e final q<? super R, ? super T, ? super d<? super R>, ?> q, @e final d<? super R> d) {
        return a0.e((i<?>)i, r, (n6.q<? super R, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q, d);
    }
    
    @f
    public static final <T> Object X1(@e final i<? extends T> i, @e final r0 r0, @e final d<? super v0<? extends T>> d) {
        return b0.i((i<?>)i, r0, (kotlin.coroutines.d<? super v0<?>>)d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @z0(expression = "flatMapConcat(mapper)", imports = {}))
    @e
    public static final <T, R> i<R> Y(@e final i<? extends T> i, @e final n6.l<? super T, ? extends i<? extends R>> l) {
        return z.g((i<?>)i, (n6.l<? super Object, ? extends i<? extends R>>)l);
    }
    
    @f
    private static final Object Y0(@e final i i, final Object o, @e final q q, @e final d d) {
        return a0.e((i<?>)i, o, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super Object>, ?>)q, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @e
    public static final <T> v0<T> Y1(@e final i<? extends T> i, @e final r0 r0, @e final q0 q0, final T t) {
        return b0.j(i, r0, q0, t);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @z0(expression = "onCompletion { emit(value) }", imports = {}))
    @e
    public static final <T> i<T> Z(@e final i<? extends T> i, final T t) {
        return z.h(i, t);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @z0(expression = "collect(block)", imports = {}))
    public static final <T> void Z0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p2) {
        z.n((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p2);
    }
    
    @kotlin.i(level = k.H, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void Z1(@e final i<? extends T> i) {
        z.G((i<?>)i);
    }
    
    @e
    public static final <T> i<T> a(@e final Iterable<? extends T> iterable) {
        return m.a(iterable);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emitAll(other) }'", replaceWith = @z0(expression = "onCompletion { emitAll(other) }", imports = {}))
    @e
    public static final <T> i<T> a0(@e final i<? extends T> i, @e final i<? extends T> j) {
        return z.i(i, j);
    }
    
    public static final int a1() {
        return x.h();
    }
    
    @kotlin.i(level = k.H, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void a2(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p2) {
        z.H((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p2);
    }
    
    @e
    public static final <T> i<T> b(@e final Iterator<? extends T> iterator) {
        return m.b(iterator);
    }
    
    @e
    public static final <T> i<T> b0(@e final i<? extends T> i) {
        return kotlinx.coroutines.flow.q.g(i);
    }
    
    @kotlin.i(level = k.H, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void b2(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p3, @e final p<? super Throwable, ? super d<? super j2>, ?> p4) {
        z.I((i<?>)i, (n6.p<? super Object, ? super d<? super j2>, ?>)p3, p4);
    }
    
    @e
    public static final i<Integer> c(@e final kotlin.ranges.k k) {
        return m.c(k);
    }
    
    @e
    public static final <T> i<T> c0(@e final h0<? extends T> h0) {
        return n.d(h0);
    }
    
    @e
    public static final <T> k2 c1(@e final i<? extends T> i, @e final r0 r0) {
        return o.i((i<?>)i, r0);
    }
    
    @kotlin.i(level = k.H, message = "Use 'flowOn' instead")
    @e
    public static final <T> i<T> c2(@e final i<? extends T> i, @e final g g) {
        return z.J(i, g);
    }
    
    @e
    public static final i<Long> d(@e final kotlin.ranges.n n) {
        return m.d(n);
    }
    
    @f
    public static final <T> Object d0(@e final i<? extends T> i, @e final d<? super Integer> d) {
        return kotlinx.coroutines.flow.r.a((i<?>)i, d);
    }
    
    @e
    public static final <T, R> i<R> d1(@e final i<? extends T> i, @e final p<? super T, ? super d<? super R>, ?> p2) {
        return y.e((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super R>, ?>)p2);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @z0(expression = "this.flatMapLatest(transform)", imports = {}))
    @e
    public static final <T, R> i<R> d2(@e final i<? extends T> i, @e final p<? super T, ? super d<? super i<? extends R>>, ?> p2) {
        return z.K((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super i<? extends R>>, ?>)p2);
    }
    
    @e
    public static final <T> i<T> e(@e final kotlin.sequences.m<? extends T> m) {
        return m.e(m);
    }
    
    @f
    public static final <T> Object e0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p3, @e final d<? super Integer> d) {
        return kotlinx.coroutines.flow.r.b((i<?>)i, (n6.p<? super Object, ? super d<? super Boolean>, ?>)p3, d);
    }
    
    @z1
    @e
    public static final <T, R> i<R> e1(@e final i<? extends T> i, @b @e final p<? super T, ? super d<? super R>, ?> p2) {
        return x.j((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super R>, ?>)p2);
    }
    
    @e
    public static final <T> i<T> e2(@e final i<? extends T> i, final int n) {
        return w.f(i, n);
    }
    
    @a2
    @e
    public static final <T> i<T> f(@e final kotlinx.coroutines.channels.j<T> j) {
        return n.a(j);
    }
    
    @a2
    @e
    public static final <T> i<T> f0(@e final i<? extends T> i, final long n) {
        return s.a(i, n);
    }
    
    @e
    public static final <T, R> i<R> f1(@e final i<? extends T> i, @e final p<? super T, ? super d<? super R>, ?> p2) {
        return y.f((i<?>)i, (n6.p<? super Object, ? super kotlin.coroutines.d<? super R>, ?>)p2);
    }
    
    @e
    public static final <T> i<T> f2(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p2) {
        return w.g(i, p2);
    }
    
    @a2
    @e
    public static final <T> i<T> g(@e final a<? extends T> a) {
        return m.f(a);
    }
    
    @kotlin.r0
    @a2
    @e
    public static final <T> i<T> g0(@e final i<? extends T> i, @e final n6.l<? super T, Long> l) {
        return s.b(i, l);
    }
    
    @z1
    @e
    public static final <T> i<T> g1(@e final Iterable<? extends i<? extends T>> iterable) {
        return x.k(iterable);
    }
    
    @f
    public static final <T, C extends Collection<? super T>> Object g2(@e final i<? extends T> i, @e final C c, @e final d<? super C> d) {
        return kotlinx.coroutines.flow.p.a((i<?>)i, c, d);
    }
    
    @a2
    @e
    public static final <T> i<T> h(@e final n6.l<? super d<? super T>, ?> l) {
        return m.g(l);
    }
    
    @kotlin.time.j
    @a2
    @e
    public static final <T> i<T> h0(@e final i<? extends T> i, final double n) {
        return s.c(i, n);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @z0(expression = "flattenConcat()", imports = {}))
    @e
    public static final <T> i<T> h1(@e final i<? extends i<? extends T>> i) {
        return z.o(i);
    }
    
    @f
    public static final <T> Object h2(@e final i<? extends T> i, @e final List<T> list, @e final d<? super List<? extends T>> d) {
        return kotlinx.coroutines.flow.p.b(i, list, d);
    }
    
    @e
    public static final i<Integer> i(@e final int[] array) {
        return m.h(array);
    }
    
    @kotlin.r0
    @kotlin.time.j
    @a2
    @m6.g(name = "debounceDuration")
    @e
    public static final <T> i<T> i0(@e final i<? extends T> i, @e final n6.l<? super T, kotlin.time.d> l) {
        return s.d(i, l);
    }
    
    @z1
    @e
    public static final <T> i<T> i1(@e final i<? extends T>... array) {
        return x.l(array);
    }
    
    @e
    public static final i<Long> j(@e final long[] array) {
        return m.i(array);
    }
    
    @kotlin.i(level = k.G, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @z0(expression = "onEach { delay(timeMillis) }", imports = {}))
    @e
    public static final <T> i<T> j0(@e final i<? extends T> i, final long n) {
        return z.j(i, n);
    }
    
    @e
    public static final Void j1() {
        return z.p();
    }
    
    @f
    public static final <T> Object j2(@e final i<? extends T> i, @e final Set<T> set, @e final d<? super Set<? extends T>> d) {
        return kotlinx.coroutines.flow.p.d(i, set, d);
    }
    
    @e
    public static final <T> i<T> k(@e final T[] array) {
        return m.j(array);
    }
    
    @kotlin.i(level = k.G, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @z0(expression = "onStart { delay(timeMillis) }", imports = {}))
    @e
    public static final <T> i<T> k0(@e final i<? extends T> i, final long n) {
        return z.k(i, n);
    }
    
    @kotlin.i(level = k.H, message = "Collect flow in the desired context instead")
    @e
    public static final <T> i<T> k1(@e final i<? extends T> i, @e final g g) {
        return z.q(i, g);
    }
    
    @e
    public static final <T> j0<T> l(@e final e0<T> e0) {
        return b0.a(e0);
    }
    
    @e
    public static final <T> i<T> l0(@e final i<? extends T> i) {
        return kotlinx.coroutines.flow.t.a(i);
    }
    
    @e
    public static final <T> i<T> l1(@e final i<? extends T> i, @e final q<? super j<? super T>, ? super Throwable, ? super d<? super j2>, ?> q) {
        return kotlinx.coroutines.flow.u.b(i, q);
    }
    
    @e
    public static final <T, R> i<R> l2(@e final i<? extends T> i, @b @e final q<? super j<? super R>, ? super T, ? super d<? super j2>, ?> q) {
        return kotlinx.coroutines.flow.u.e((i<?>)i, (n6.q<? super j<? super R>, ? super Object, ? super d<? super j2>, ?>)q);
    }
    
    @e
    public static final <T> v0<T> m(@e final f0<T> f0) {
        return b0.b(f0);
    }
    
    @e
    public static final <T> i<T> m0(@e final i<? extends T> i, @e final p<? super T, ? super T, Boolean> p2) {
        return kotlinx.coroutines.flow.t.b(i, p2);
    }
    
    @e
    public static final <T> i<T> m1(@e final i<? extends T> i, @e final p<? super T, ? super d<? super j2>, ?> p2) {
        return y.g(i, p2);
    }
    
    @z1
    @e
    public static final <T, R> i<R> m2(@e final i<? extends T> i, @b @e final q<? super j<? super R>, ? super T, ? super d<? super j2>, ?> q) {
        return x.m((i<?>)i, (n6.q<? super j<? super R>, ? super Object, ? super d<? super j2>, ?>)q);
    }
    
    @kotlin.i(level = k.G, message = "Use shareIn operator and the resulting SharedFlow as a replacement for BroadcastChannel", replaceWith = @z0(expression = "this.shareIn(scope, SharingStarted.Lazily, 0)", imports = {}))
    @e
    public static final <T> kotlinx.coroutines.channels.j<T> n(@e final i<? extends T> i, @e final r0 r0, @e final u0 u0) {
        return n.b(i, r0, u0);
    }
    
    @e
    public static final <T, K> i<T> n0(@e final i<? extends T> i, @e final n6.l<? super T, ? extends K> l) {
        return kotlinx.coroutines.flow.t.c(i, (n6.l<? super T, ?>)l);
    }
    
    @e
    public static final <T> i<T> n1(@e final i<? extends T> i, @e final p<? super j<? super T>, ? super d<? super j2>, ?> p2) {
        return kotlinx.coroutines.flow.u.c(i, p2);
    }
    
    @z1
    @e
    public static final <T, R> i<R> n2(@e final i<? extends T> i, @b @e final q<? super j<? super R>, ? super T, ? super d<? super Boolean>, ?> q) {
        return w.h((i<?>)i, (n6.q<? super j<? super R>, ? super Object, ? super d<? super Boolean>, ?>)q);
    }
    
    @e
    public static final <T> i<T> o0(@e final i<? extends T> i, final int n) {
        return w.c(i, n);
    }
    
    @kotlin.i(level = k.H, message = "Use catch { e -> if (predicate(e)) emitAll(fallback) else throw e }", replaceWith = @z0(expression = "catch { e -> if (predicate(e)) emitAll(fallback) else throw e }", imports = {}))
    @e
    public static final <T> i<T> o1(@e final i<? extends T> i, @e final i<? extends T> j, @e final n6.l<? super Throwable, Boolean> l) {
        return v.f(i, j, l);
    }
    
    @y0
    @e
    public static final <T, R> i<R> o2(@e final i<? extends T> i, @b @e final q<? super j<? super R>, ? super T, ? super d<? super j2>, ?> q) {
        return kotlinx.coroutines.flow.u.f((i<?>)i, (n6.q<? super j<? super R>, ? super Object, ? super d<? super j2>, ?>)q);
    }
    
    @e
    public static final <T> i<T> p0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p2) {
        return w.d(i, p2);
    }
    
    @e
    public static final <T> i<kotlin.collections.q0<T>> p2(@e final i<? extends T> i) {
        return y.j(i);
    }
    
    @e
    public static final <T> i<T> q(@e final i<? extends T> i, final int n, @e final kotlinx.coroutines.channels.n n2) {
        return kotlinx.coroutines.flow.q.b(i, n, n2);
    }
    
    @f
    public static final <T> Object q0(@e final j<? super T> j, @e final h0<? extends T> h0, @e final d<? super j2> d) {
        return n.e((j<? super Object>)j, (h0<?>)h0, d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @z0(expression = "catch { emitAll(fallback) }", imports = {}))
    @e
    public static final <T> i<T> q1(@e final i<? extends T> i, @e final i<? extends T> j) {
        return z.r(i, j);
    }
    
    @e
    public static final <T1, T2, R> i<R> q2(@e final i<? extends T1> i, @e final i<? extends T2> j, @e final q<? super T1, ? super T2, ? super d<? super R>, ?> q) {
        return c0.s((i<?>)i, (i<?>)j, (n6.q<? super Object, ? super Object, ? super kotlin.coroutines.d<? super R>, ?>)q);
    }
    
    @b
    @f
    public static final <T> Object r0(@e final j<? super T> j, @e final i<? extends T> i, @e final d<? super j2> d) {
        return o.g((j<? super Object>)j, (i<?>)i, d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @z0(expression = "catch { emitAll(fallback) }", imports = {}))
    @e
    public static final <T> i<T> r1(@e final i<? extends T> i, @e final i<? extends T> j) {
        return z.s(i, j);
    }
    
    @b
    @f
    private static final Object s0(@e final j j, @e final i i, @e final d d) {
        return o.g((j<? super Object>)j, (i<?>)i, (d<? super j2>)d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @z0(expression = "catch { emit(fallback) }", imports = {}))
    @e
    public static final <T> i<T> s1(@e final i<? extends T> i, final T t) {
        return z.t(i, t);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStared.Lazily' argument'", replaceWith = @z0(expression = "this.shareIn(scope, Int.MAX_VALUE, started = SharingStared.Lazily)", imports = {}))
    @e
    public static final <T> i<T> t(@e final i<? extends T> i) {
        return z.a(i);
    }
    
    @e
    public static final <T> i<T> t0() {
        return m.m();
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @z0(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @e
    public static final <T> i<T> t1(@e final i<? extends T> i, final T t, @e final n6.l<? super Throwable, Boolean> l) {
        return z.u(i, t, l);
    }
    
    @z1
    @e
    public static final <T> i<T> u(@b @e final p<? super kotlinx.coroutines.channels.f0<? super T>, ? super d<? super j2>, ?> p) {
        return m.k(p);
    }
    
    @e
    public static final <T> i<T> u0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p2) {
        return y.a(i, p2);
    }
    
    @e
    public static final <T> i<T> v(@e final i<? extends T> i) {
        return kotlinx.coroutines.flow.q.e(i);
    }
    
    @e
    public static final <T> i<T> v1(@e final i<? extends T> i, @e final p<? super j<? super T>, ? super d<? super j2>, ?> p2) {
        return kotlinx.coroutines.flow.u.d(i, p2);
    }
    
    @e
    public static final <T> i<T> w(@e final i<? extends T> i, @e final q<? super j<? super T>, ? super Throwable, ? super d<? super j2>, ?> q) {
        return v.b(i, q);
    }
    
    @e
    public static final <T> i<T> w0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p2) {
        return y.c(i, p2);
    }
    
    @e
    public static final <T> j0<T> w1(@e final j0<? extends T> j0, @e final p<? super j<? super T>, ? super d<? super j2>, ?> p2) {
        return b0.f(j0, p2);
    }
    
    @f
    public static final <T> Object x(@e final i<? extends T> i, @e final j<? super T> j, @e final d<? super Throwable> d) {
        return v.c((i<?>)i, (j<? super Object>)j, d);
    }
    
    @e
    public static final <T> i<T> x0(@e final i<? extends T> i) {
        return y.d(i);
    }
    
    @a2
    @e
    public static final <T> h0<T> x1(@e final i<? extends T> i, @e final r0 r0) {
        return n.g(i, r0);
    }
    
    @z1
    @e
    public static final <T> i<T> y(@b @e final p<? super kotlinx.coroutines.channels.f0<? super T>, ? super d<? super j2>, ?> p) {
        return m.l(p);
    }
    
    @f
    public static final <T> Object y0(@e final i<? extends T> i, @e final d<? super T> d) {
        return a0.a((i<?>)i, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @z0(expression = "this.shareIn(scope, 0)", imports = {}))
    @e
    public static final <T> i<T> y1(@e final i<? extends T> i) {
        return z.w(i);
    }
    
    @f
    public static final Object z(@e final i<?> i, @e final d<? super j2> d) {
        return o.a(i, d);
    }
    
    @f
    public static final <T> Object z0(@e final i<? extends T> i, @e final p<? super T, ? super d<? super Boolean>, ?> p3, @e final d<? super T> d) {
        return a0.b((i<?>)i, (n6.p<? super Object, ? super d<? super Boolean>, ?>)p3, (kotlin.coroutines.d<? super Object>)d);
    }
    
    @kotlin.i(level = k.H, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStared.Lazily' argument, \npublish().refCount() translates to 'started = SharingStared.WhileSubscribed()' argument.", replaceWith = @z0(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @e
    public static final <T> i<T> z1(@e final i<? extends T> i, final int n) {
        return z.x(i, n);
    }
}
