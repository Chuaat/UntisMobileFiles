// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.j0;
import org.jetbrains.annotations.f;
import n6.a;
import kotlinx.coroutines.internal.k0;
import kotlin.coroutines.g$c;
import kotlin.w;
import kotlin.j2;
import n6.l;
import kotlinx.coroutines.internal.j;
import kotlin.coroutines.d;
import kotlin.coroutines.g;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.y0;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000¼\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\u00060\u0004j\u0002`\u0005B!\u0012\u000e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0084\u0001\u0012\u0006\u0010*\u001a\u00020$¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0013\u001a\u00020\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0011H\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014JB\u0010\u001a\u001a\u00020\t2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u00182\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0001\u0010\bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\bJB\u0010\u001f\u001a\u00020\t2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u00182\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J8\u0010\"\u001a\u00020!2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u0018H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'JZ\u0010-\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020$2#\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u00152\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b-\u0010.JH\u0010/\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010\u001d2\u0006\u0010*\u001a\u00020$2%\b\u0002\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0002¢\u0006\u0004\b/\u00100JJ\u00102\u001a\u0004\u0018\u0001012\b\u0010)\u001a\u0004\u0018\u00010\u001d2\b\u0010,\u001a\u0004\u0018\u00010\u001d2#\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0002¢\u0006\u0004\b2\u00103J\u0019\u00105\u001a\u0002042\b\u0010)\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b7\u0010\u000bJ\u000f\u00108\u001a\u00020\tH\u0016¢\u0006\u0004\b8\u0010\u000bJ\u000f\u00109\u001a\u00020\u0006H\u0001¢\u0006\u0004\b9\u0010\bJ\u0017\u0010<\u001a\n\u0018\u00010:j\u0004\u0018\u0001`;H\u0016¢\u0006\u0004\b<\u0010=J\u0011\u0010>\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\b>\u0010?J!\u0010A\u001a\u00020\t2\b\u0010@\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\bA\u0010BJ\u0019\u0010C\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\bC\u0010\u0010J\u0017\u0010D\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020!2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\bF\u0010GJ8\u0010H\u001a\u00020\t2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u00152\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\bH\u0010\u001bJ\u0017\u0010K\u001a\u00020\r2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ\u0011\u0010M\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0004\bM\u0010?J \u0010P\u001a\u00020\t2\f\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000NH\u0016\u00f8\u0001\u0000¢\u0006\u0004\bP\u0010QJ<\u0010S\u001a\u00020\t2\u0006\u0010R\u001a\u00028\u00002#\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0016¢\u0006\u0004\bS\u0010TJ8\u0010U\u001a\u00020\t2'\u0010\u0019\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u0015j\u0002`\u0018H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\tH\u0000¢\u0006\u0004\bW\u0010\u000bJ#\u0010X\u001a\u0004\u0018\u00010\u001d2\u0006\u0010R\u001a\u00028\u00002\b\u0010,\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\bX\u0010YJH\u0010Z\u001a\u0004\u0018\u00010\u001d2\u0006\u0010R\u001a\u00028\u00002\b\u0010,\u001a\u0004\u0018\u00010\u001d2#\u0010+\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010]\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\\\u001a\u00020\rH\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010`\u001a\u00020\t2\u0006\u0010_\u001a\u00020\u001dH\u0016¢\u0006\u0004\b`\u0010QJ\u001b\u0010b\u001a\u00020\t*\u00020a2\u0006\u0010R\u001a\u00028\u0000H\u0016¢\u0006\u0004\bb\u0010cJ\u001b\u0010d\u001a\u00020\t*\u00020a2\u0006\u0010\\\u001a\u00020\rH\u0016¢\u0006\u0004\bd\u0010eJ\u001f\u0010f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bf\u0010gJ\u001b\u0010h\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0010¢\u0006\u0004\bh\u0010iJ\u000f\u0010k\u001a\u00020jH\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020jH\u0014¢\u0006\u0004\bm\u0010lR(\u0010s\u001a\u0004\u0018\u00010n2\b\u0010R\u001a\u0004\u0018\u00010n8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR\u001c\u0010x\u001a\u00020t8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010u\u001a\u0004\bv\u0010wR\u0016\u0010y\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\by\u0010\bR\u0016\u0010{\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010\bR\u0016\u0010}\u001a\u00020j8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010lR\u0016\u0010\u007f\u001a\u00020\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b~\u0010\bR!\u0010\u0082\u0001\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058V@\u0016X\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8@@\u0000X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010?R'\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0084\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b9\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u008b\u0001" }, d2 = { "Lkotlinx/coroutines/p;", "T", "Lkotlinx/coroutines/f1;", "Lkotlinx/coroutines/o;", "Lkotlin/coroutines/jvm/internal/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "", "B", "()Z", "Lkotlin/j2;", "P", "()V", "r", "", "cause", "q", "(Ljava/lang/Throwable;)Z", "Lkotlin/Function0;", "block", "o", "(Ln6/a;)V", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "Lkotlinx/coroutines/CompletionHandler;", "handler", "n", "(Ln6/l;Ljava/lang/Throwable;)V", "Q", "", "state", "G", "(Ln6/l;Ljava/lang/Object;)V", "Lkotlinx/coroutines/m;", "C", "(Ln6/l;)Lkotlinx/coroutines/m;", "", "mode", "v", "(I)V", "Lkotlinx/coroutines/a3;", "proposedUpdate", "resumeMode", "onCancellation", "idempotent", "N", "(Lkotlinx/coroutines/a3;Ljava/lang/Object;ILn6/l;Ljava/lang/Object;)Ljava/lang/Object;", "L", "(Ljava/lang/Object;ILn6/l;)V", "Lkotlinx/coroutines/internal/k0;", "R", "(Ljava/lang/Object;Ljava/lang/Object;Ln6/l;)Lkotlinx/coroutines/internal/k0;", "", "l", "(Ljava/lang/Object;)Ljava/lang/Void;", "u", "H", "K", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "j", "()Ljava/lang/Object;", "takenState", "d", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "c", "J", "(Ljava/lang/Throwable;)V", "m", "(Lkotlinx/coroutines/m;Ljava/lang/Throwable;)V", "p", "Lkotlinx/coroutines/k2;", "parent", "w", "(Lkotlinx/coroutines/k2;)Ljava/lang/Throwable;", "y", "Lkotlin/b1;", "result", "resumeWith", "(Ljava/lang/Object;)V", "value", "Z", "(Ljava/lang/Object;Ln6/l;)V", "t", "(Ln6/l;)V", "s", "k", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "S", "(Ljava/lang/Object;Ljava/lang/Object;Ln6/l;)Ljava/lang/Object;", "exception", "D", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "token", "f0", "Lkotlinx/coroutines/m0;", "F", "(Lkotlinx/coroutines/m0;Ljava/lang/Object;)V", "E", "(Lkotlinx/coroutines/m0;Ljava/lang/Throwable;)V", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "I", "Lkotlinx/coroutines/l1;", "x", "()Lkotlinx/coroutines/l1;", "O", "(Lkotlinx/coroutines/l1;)V", "parentHandle", "Lkotlin/coroutines/g;", "Lkotlin/coroutines/g;", "getContext", "()Lkotlin/coroutines/g;", "context", "isCancelled", "g", "isCompleted", "A", "stateDebugRepresentation", "a", "isActive", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/e;", "callerFrame", "z", "Lkotlin/coroutines/d;", "Lkotlin/coroutines/d;", "e", "()Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;I)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@y0
public class p<T> extends f1<T> implements o<T>, e
{
    private static final /* synthetic */ AtomicIntegerFieldUpdater L;
    private static final /* synthetic */ AtomicReferenceFieldUpdater M;
    @org.jetbrains.annotations.e
    private final g J;
    @org.jetbrains.annotations.e
    private final d<T> K;
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;
    
    static {
        L = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decision");
        M = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state");
    }
    
    public p(@org.jetbrains.annotations.e final d<? super T> k, int n) {
        super(n);
        this.K = (d<T>)k;
        if (w0.b()) {
            if (n != -1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                throw new AssertionError();
            }
        }
        this.J = k.getContext();
        this._decision = 0;
        this._state = b.G;
        this._parentHandle = null;
    }
    
    private final String A() {
        final Object z = this.z();
        String s;
        if (z instanceof a3) {
            s = "Active";
        }
        else if (z instanceof s) {
            s = "Cancelled";
        }
        else {
            s = "Completed";
        }
        return s;
    }
    
    private final boolean B() {
        final d<T> k = this.K;
        return k instanceof j && ((j)k).q(this);
    }
    
    private final m C(final l<? super Throwable, j2> l) {
        m m;
        if (l instanceof m) {
            m = (m)l;
        }
        else {
            m = new h2(l);
        }
        return m;
    }
    
    private final void G(final l<? super Throwable, j2> obj, final Object obj2) {
        final StringBuilder sb = new StringBuilder();
        sb.append("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final void L(final Object o, final int n, final l<? super Throwable, j2> l) {
        while (true) {
            final Object state = this._state;
            if (!(state instanceof a3)) {
                if (state instanceof s) {
                    final s s = (s)state;
                    if (s.c()) {
                        if (l != null) {
                            this.p(l, s.a);
                        }
                        return;
                    }
                }
                this.l(o);
                throw new w();
            }
            if (!p.M.compareAndSet(this, state, this.N((a3)state, o, n, l, null))) {
                continue;
            }
            this.u();
            this.v(n);
        }
    }
    
    static /* synthetic */ void M(final p p6, final Object o, final int n, l l, final int n2, final Object o2) {
        if (o2 == null) {
            if ((n2 & 0x4) != 0x0) {
                l = null;
            }
            p6.L(o, n, l);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }
    
    private final Object N(final a3 a3, final Object o, int n, final l<? super Throwable, j2> l, final Object o2) {
        Object o3;
        if (o instanceof d0) {
            final boolean b = w0.b();
            final int n2 = 1;
            if (b) {
                if (o2 == null) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    throw new AssertionError();
                }
            }
            o3 = o;
            if (w0.b()) {
                if (l == null) {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    throw new AssertionError();
                }
                o3 = o;
            }
        }
        else if (!g1.c(n) && o2 == null) {
            o3 = o;
        }
        else {
            if (l == null && (!(a3 instanceof m) || a3 instanceof kotlinx.coroutines.e)) {
                o3 = o;
                if (o2 == null) {
                    return o3;
                }
            }
            a3 a4 = a3;
            if (!(a3 instanceof m)) {
                a4 = null;
            }
            o3 = new c0(o, (m)a4, l, o2, null, 16, null);
        }
        return o3;
    }
    
    private final void O(final l1 parentHandle) {
        this._parentHandle = parentHandle;
    }
    
    private final void P() {
        if (this.r()) {
            return;
        }
        if (this.x() != null) {
            return;
        }
        final k2 k2 = (k2)this.K.getContext().get((g$c)kotlinx.coroutines.k2.t);
        if (k2 != null) {
            final l1 f = kotlinx.coroutines.k2.a.f(k2, true, false, (l)new t(this), 2, null);
            this.O(f);
            if (this.g() && !this.B()) {
                f.dispose();
                this.O(z2.G);
            }
        }
    }
    
    private final boolean Q() {
        do {
            final int decision = this._decision;
            if (decision != 0) {
                if (decision == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!p.L.compareAndSet(this, 0, 2));
        return true;
    }
    
    private final k0 R(final Object o, final Object o2, final l<? super Throwable, j2> l) {
        while (true) {
            final Object state = this._state;
            if (!(state instanceof a3)) {
                final boolean b = state instanceof c0;
                k0 d;
                final k0 k0 = d = null;
                if (b) {
                    d = k0;
                    if (o2 != null) {
                        final c0 c0 = (c0)state;
                        d = k0;
                        if (c0.d == o2) {
                            if (w0.b() && !kotlin.jvm.internal.k0.g(c0.a, o)) {
                                throw new AssertionError();
                            }
                            d = q.d;
                        }
                    }
                }
                return d;
            }
            if (!p.M.compareAndSet(this, state, this.N((a3)state, o, super.I, l, o2))) {
                continue;
            }
            this.u();
            return q.d;
        }
    }
    
    private final boolean T() {
        do {
            final int decision = this._decision;
            if (decision != 0) {
                if (decision == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!p.L.compareAndSet(this, 0, 1));
        return true;
    }
    
    private final Void l(final Object obj) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Already resumed, but proposed with update ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    private final void n(final l<? super Throwable, j2> l, final Throwable t) {
        try {
            l.invoke((Object)t);
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            o0.b(context, new g0(sb.toString(), t));
        }
    }
    
    private final void o(final n6.a<j2> a) {
        try {
            a.invoke();
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            final Throwable t;
            o0.b(context, new g0(sb.toString(), t));
        }
    }
    
    private final boolean q(final Throwable t) {
        if (!g1.d(super.I)) {
            return false;
        }
        Object k;
        if (!((k = this.K) instanceof j)) {
            k = null;
        }
        final j j = (j)k;
        return j != null && j.r(t);
    }
    
    private final boolean r() {
        final boolean g = this.g();
        if (!g1.d(super.I)) {
            return g;
        }
        Object k;
        if (!((k = this.K) instanceof j)) {
            k = null;
        }
        final j j = (j)k;
        boolean b = g;
        if (j != null) {
            final Throwable l = j.l(this);
            b = g;
            if (l != null) {
                if (!g) {
                    this.c(l);
                }
                b = true;
            }
        }
        return b;
    }
    
    private final void u() {
        if (!this.B()) {
            this.s();
        }
    }
    
    private final void v(final int n) {
        if (this.Q()) {
            return;
        }
        g1.a((f1<? super Object>)this, n);
    }
    
    private final l1 x() {
        return (l1)this._parentHandle;
    }
    
    @f
    @Override
    public Object D(@org.jetbrains.annotations.e final Throwable t) {
        return this.R(new d0(t, false, 2, null), null, null);
    }
    
    @Override
    public void E(@org.jetbrains.annotations.e final m0 m0, @org.jetbrains.annotations.e final Throwable t) {
        Object k = this.K;
        final boolean b = k instanceof j;
        final m0 m2 = null;
        if (!b) {
            k = null;
        }
        final j j = (j)k;
        final d0 d0 = new d0(t, false, 2, null);
        m0 l = m2;
        if (j != null) {
            l = j.L;
        }
        int i;
        if (l == m0) {
            i = 4;
        }
        else {
            i = super.I;
        }
        M(this, d0, i, null, 4, null);
    }
    
    @Override
    public void F(@org.jetbrains.annotations.e final m0 m0, final T t) {
        Object k = this.K;
        final boolean b = k instanceof j;
        final m0 m2 = null;
        if (!b) {
            k = null;
        }
        final j j = (j)k;
        m0 l = m2;
        if (j != null) {
            l = j.L;
        }
        int i;
        if (l == m0) {
            i = 4;
        }
        else {
            i = super.I;
        }
        M(this, t, i, null, 4, null);
    }
    
    @Override
    public void H() {
        this.P();
    }
    
    @org.jetbrains.annotations.e
    protected String I() {
        return "CancellableContinuation";
    }
    
    public final void J(@org.jetbrains.annotations.e final Throwable t) {
        if (this.q(t)) {
            return;
        }
        this.c(t);
        this.u();
    }
    
    @m6.g(name = "resetStateReusable")
    public final boolean K() {
        if (w0.b() && super.I != 2) {
            throw new AssertionError();
        }
        if (w0.b() && this.x() == z2.G) {
            throw new AssertionError();
        }
        final Object state = this._state;
        if (w0.b() && !(state instanceof a3 ^ true)) {
            throw new AssertionError();
        }
        if (state instanceof c0 && ((c0)state).d != null) {
            this.s();
            return false;
        }
        this._decision = 0;
        this._state = b.G;
        return true;
    }
    
    @f
    @Override
    public Object S(final T t, @f final Object o, @f final l<? super Throwable, j2> l) {
        return this.R(t, o, l);
    }
    
    @Override
    public void Z(final T t, @f final l<? super Throwable, j2> l) {
        this.L(t, super.I, l);
    }
    
    @Override
    public boolean a() {
        return this.z() instanceof a3;
    }
    
    @Override
    public boolean c(@f final Throwable t) {
        while (true) {
            Object state = this._state;
            if (!(state instanceof a3)) {
                return false;
            }
            final boolean b = state instanceof m;
            if (!p.M.compareAndSet(this, state, new s((d<?>)this, t, b))) {
                continue;
            }
            if (!b) {
                state = null;
            }
            final m m = (m)state;
            if (m != null) {
                this.m(m, t);
            }
            this.u();
            this.v(super.I);
            return true;
        }
    }
    
    @Override
    public void d(@f final Object o, @org.jetbrains.annotations.e final Throwable t) {
        while (true) {
            final Object state = this._state;
            if (state instanceof a3) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (state instanceof d0) {
                return;
            }
            if (state instanceof c0) {
                final c0 c0 = (c0)state;
                if (!(c0.h() ^ true)) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (p.M.compareAndSet(this, state, kotlinx.coroutines.c0.g(c0, null, null, null, null, t, 15, null))) {
                    c0.i(this, t);
                    return;
                }
                continue;
            }
            else {
                if (p.M.compareAndSet(this, state, new c0(state, null, null, null, t, 14, null))) {
                    return;
                }
                continue;
            }
        }
    }
    
    @org.jetbrains.annotations.e
    @Override
    public final d<T> e() {
        return this.K;
    }
    
    @f
    @Override
    public Throwable f(@f final Object o) {
        final Throwable f = super.f(o);
        Throwable c;
        if (f != null) {
            final d<T> k = this.K;
            c = f;
            if (w0.e()) {
                if (!(k instanceof e)) {
                    c = f;
                }
                else {
                    c = j0.c(f, (e)k);
                }
            }
        }
        else {
            c = null;
        }
        return c;
    }
    
    @Override
    public void f0(@org.jetbrains.annotations.e final Object o) {
        if (w0.b() && o != q.d) {
            throw new AssertionError();
        }
        this.v(super.I);
    }
    
    @Override
    public boolean g() {
        return this.z() instanceof a3 ^ true;
    }
    
    @f
    public e getCallerFrame() {
        Object k;
        if (!((k = this.K) instanceof e)) {
            k = null;
        }
        return (e)k;
    }
    
    @org.jetbrains.annotations.e
    public g getContext() {
        return this.J;
    }
    
    @f
    public StackTraceElement getStackTraceElement() {
        return null;
    }
    
    @Override
    public <T> T h(@f final Object o) {
        Object a = o;
        if (o instanceof c0) {
            a = ((c0)o).a;
        }
        return (T)a;
    }
    
    @Override
    public boolean isCancelled() {
        return this.z() instanceof s;
    }
    
    @f
    @Override
    public Object j() {
        return this.z();
    }
    
    @f
    @Override
    public Object k(final T t, @f final Object o) {
        return this.R(t, o, null);
    }
    
    public final void m(@org.jetbrains.annotations.e final m m, @f final Throwable t) {
        try {
            m.a(t);
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in invokeOnCancellation handler for ");
            sb.append(this);
            final Throwable t2;
            o0.b(context, new g0(sb.toString(), t2));
        }
    }
    
    public final void p(@org.jetbrains.annotations.e final l<? super Throwable, j2> l, @org.jetbrains.annotations.e final Throwable t) {
        try {
            l.invoke((Object)t);
        }
        finally {
            final g context = this.getContext();
            final StringBuilder sb = new StringBuilder();
            sb.append("Exception in resume onCancellation handler for ");
            sb.append(this);
            o0.b(context, new g0(sb.toString(), t));
        }
    }
    
    public void resumeWith(@org.jetbrains.annotations.e final Object o) {
        M(this, kotlinx.coroutines.j0.b(o, this), super.I, null, 4, null);
    }
    
    public final void s() {
        final l1 x = this.x();
        if (x != null) {
            x.dispose();
        }
        this.O(z2.G);
    }
    
    @Override
    public void t(@org.jetbrains.annotations.e final l<? super Throwable, j2> l) {
        final m c = this.C(l);
        while (true) {
            Object state = this._state;
            if (state instanceof b) {
                if (p.M.compareAndSet(this, state, c)) {
                    return;
                }
                continue;
            }
            else if (state instanceof m) {
                this.G(l, state);
            }
            else {
                final boolean b = state instanceof d0;
                if (b) {
                    if (!((d0)state).b()) {
                        this.G(l, state);
                    }
                    if (state instanceof s) {
                        final Throwable t = null;
                        if (!b) {
                            state = null;
                        }
                        final d0 d0 = (d0)state;
                        Throwable a = t;
                        if (d0 != null) {
                            a = d0.a;
                        }
                        this.n(l, a);
                    }
                    return;
                }
                if (state instanceof c0) {
                    final c0 c2 = (c0)state;
                    if (c2.b != null) {
                        this.G(l, state);
                    }
                    if (c instanceof kotlinx.coroutines.e) {
                        return;
                    }
                    if (c2.h()) {
                        this.n(l, c2.e);
                        return;
                    }
                    if (p.M.compareAndSet(this, state, c0.g(c2, null, c, null, null, null, 29, null))) {
                        return;
                    }
                    continue;
                }
                else {
                    if (c instanceof kotlinx.coroutines.e) {
                        return;
                    }
                    if (p.M.compareAndSet(this, state, new c0(state, c, null, null, null, 28, null))) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.I());
        sb.append('(');
        sb.append(x0.c(this.K));
        sb.append("){");
        sb.append(this.A());
        sb.append("}@");
        sb.append(x0.b(this));
        return sb.toString();
    }
    
    @org.jetbrains.annotations.e
    public Throwable w(@org.jetbrains.annotations.e final k2 k2) {
        return k2.w();
    }
    
    @y0
    @f
    public final Object y() {
        this.P();
        if (this.T()) {
            return kotlin.coroutines.intrinsics.b.h();
        }
        final Object z = this.z();
        if (z instanceof d0) {
            Throwable t = ((d0)z).a;
            if (w0.e()) {
                t = j0.c(t, (e)this);
            }
            throw t;
        }
        if (g1.c(super.I)) {
            final k2 k2 = (k2)this.getContext().get((g$c)kotlinx.coroutines.k2.t);
            if (k2 != null && !k2.a()) {
                final CancellationException w = k2.w();
                this.d(z, w);
                Throwable c = w;
                if (w0.e()) {
                    c = j0.c(w, (e)this);
                }
                throw c;
            }
        }
        return this.h(z);
    }
    
    @f
    public final Object z() {
        return this._state;
    }
}
