// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.flow;

import java.util.Set;
import java.util.List;
import n6.r;
import kotlin.c1;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.o;
import n6.p;
import kotlin.coroutines.g;
import kotlin.jvm.internal.h0;
import java.util.Objects;
import kotlin.j2;
import kotlin.coroutines.d;
import n6.q;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.w;
import org.jetbrains.annotations.f;
import java.util.concurrent.CancellationException;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u001a\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007\u001a&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u001a\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0007\u001a\"\u0010\u000f\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\n2\u0010\b\u0002\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0007\u001ao\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012D\b\b\u0010\u0017\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u0010¢\u0006\u0002\b\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001ah\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u001b\u001a\u00020\u001a23\b\n\u0010\u001e\u001a-\b\u0001\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001cH\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u0084\u0001\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012Y\b\b\u0010\u001e\u001aS\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00150!¢\u0006\u0002\b\u0016H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a)\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a)\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b)\u0010'\u001a#\u0010+\u001a\u00020*\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b+\u0010'\"$\u00100\u001a\u00020\u001d*\u0006\u0012\u0002\b\u00030\n8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b.\u0010/\u001a\u0004\b,\u0010-\"$\u00104\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\n8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b3\u0010/\u001a\u0004\b1\u00102\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065" }, d2 = { "T", "Lkotlinx/coroutines/flow/j0;", "Lkotlinx/coroutines/flow/i;", "c", "Lkotlin/coroutines/g;", "context", "h", "Lkotlinx/coroutines/flow/v0;", "e", "g", "Lkotlinx/coroutines/flow/j;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Lkotlin/j2;", "a", "Lkotlin/Function3;", "", "Lkotlin/t0;", "name", "Lkotlin/coroutines/d;", "", "Lkotlin/s;", "action", "d", "(Lkotlinx/coroutines/flow/j0;Ln6/q;)Lkotlinx/coroutines/flow/i;", "", "retries", "Lkotlin/Function2;", "", "predicate", "m", "(Lkotlinx/coroutines/flow/j0;JLn6/p;)Lkotlinx/coroutines/flow/i;", "Lkotlin/Function4;", "attempt", "o", "(Lkotlinx/coroutines/flow/j0;Ln6/r;)Lkotlinx/coroutines/flow/i;", "", "p", "(Lkotlinx/coroutines/flow/j0;Lkotlin/coroutines/d;)Ljava/lang/Object;", "", "q", "", "f", "k", "(Lkotlinx/coroutines/flow/j;)Z", "isActive$annotations", "(Lkotlinx/coroutines/flow/j;)V", "isActive", "i", "(Lkotlinx/coroutines/flow/j;)Lkotlin/coroutines/g;", "getCoroutineContext$annotations", "coroutineContext", "kotlinx-coroutines-core" }, k = 2, mv = { 1, 4, 2 })
public final class d0
{
    @i(level = k.H, message = "cancel() is resolved into the extension of outer CoroutineScope which is likely to be an error.Use currentCoroutineContext().cancel() instead or specify the receiver of cancel() explicitly", replaceWith = @z0(expression = "currentCoroutineContext().cancel(cause)", imports = {}))
    public static final void a(@e final j<?> j, @f final CancellationException ex) {
        l.j1();
        throw new w();
    }
    
    @i(level = k.H, message = "Applying 'cancellable' to a SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @z0(expression = "this", imports = {}))
    @e
    public static final <T> kotlinx.coroutines.flow.i<T> c(@e final j0<? extends T> j0) {
        l.j1();
        throw new w();
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @z0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> kotlinx.coroutines.flow.i<T> d(final j0<? extends T> obj, final q<? super j<? super T>, ? super Throwable, ? super d<? super j2>, ?> q) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        return l.w((kotlinx.coroutines.flow.i<? extends T>)obj, q);
    }
    
    @i(level = k.H, message = "Applying 'conflate' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @z0(expression = "this", imports = {}))
    @e
    public static final <T> kotlinx.coroutines.flow.i<T> e(@e final v0<? extends T> v0) {
        l.j1();
        throw new w();
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object f(final j0<? extends T> obj, final d<? super Integer> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        h0.e(0);
        final Object d2 = l.d0((kotlinx.coroutines.flow.i<?>)obj, d);
        h0.e(1);
        return d2;
    }
    
    @i(level = k.H, message = "Applying 'distinctUntilChanged' to StateFlow has no effect. See the StateFlow documentation on Operator Fusion.", replaceWith = @z0(expression = "this", imports = {}))
    @e
    public static final <T> kotlinx.coroutines.flow.i<T> g(@e final v0<? extends T> v0) {
        l.j1();
        throw new w();
    }
    
    @i(level = k.H, message = "Applying 'flowOn' to SharedFlow has no effect. See the SharedFlow documentation on Operator Fusion.", replaceWith = @z0(expression = "this", imports = {}))
    @e
    public static final <T> kotlinx.coroutines.flow.i<T> h(@e final j0<? extends T> j0, @e final g g) {
        l.j1();
        throw new w();
    }
    
    @e
    public static final g i(@e final j<?> j) {
        l.j1();
        throw new w();
    }
    
    public static final boolean k(@e final j<?> j) {
        l.j1();
        throw new w();
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @z0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> kotlinx.coroutines.flow.i<T> m(final j0<? extends T> obj, final long n, final p<? super Throwable, ? super d<? super Boolean>, ?> p3) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        return l.G1((kotlinx.coroutines.flow.i<? extends T>)obj, n, p3);
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this operator has no effect.", replaceWith = @z0(expression = "this", imports = {}))
    @kotlin.internal.f
    private static final <T> kotlinx.coroutines.flow.i<T> o(final j0<? extends T> obj, final r<? super j<? super T>, ? super Throwable, ? super Long, ? super d<? super Boolean>, ?> r) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        return l.J1((kotlinx.coroutines.flow.i<? extends T>)obj, r);
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object p(final j0<? extends T> obj, final d<? super List<? extends T>> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        h0.e(0);
        final Object i2 = l.i2(obj, null, d, 1, null);
        h0.e(1);
        return i2;
    }
    
    @i(level = k.G, message = "SharedFlow never completes, so this terminal operation never completes.")
    @kotlin.internal.f
    private static final <T> Object q(final j0<? extends T> obj, final d<? super Set<? extends T>> d) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<T>");
        h0.e(0);
        final Object k2 = l.k2(obj, null, d, 1, null);
        h0.e(1);
        return k2;
    }
}
