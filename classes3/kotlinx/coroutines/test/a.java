// 
// Decompiled by Procyon v0.5.36
// 

package kotlinx.coroutines.test;

import kotlinx.coroutines.m0;
import kotlinx.coroutines.o;
import kotlin.j2;
import kotlin.coroutines.d;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.c1;
import kotlinx.coroutines.p1;
import kotlinx.coroutines.x0;
import kotlin.coroutines.g$a;
import java.util.Objects;
import kotlin.coroutines.g$b;
import n6.p;
import java.util.Iterator;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import n6.l;
import org.jetbrains.annotations.e;
import kotlin.coroutines.g$c;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.internal.t0;
import kotlinx.coroutines.CoroutineExceptionHandler;
import java.util.List;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.Metadata;
import kotlin.coroutines.g;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001DB\u0013\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\"¢\u0006\u0004\bB\u0010CJ\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\u001c\u0010\n\u001a\u00020\t2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\u0007H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0007H\u0002J7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0018\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0015*\u00020\u00112\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00012\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\u0010\u0010\u001d\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0018\u0010\u001f\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0005J\u0006\u0010!\u001a\u00020\u0005J$\u0010(\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010)\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J$\u0010*\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$J*\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010#\u001a\u00020\"2\u0018\u0010'\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0+\u0012\u0004\u0012\u00020&0$J\b\u0010,\u001a\u00020\"H\u0016R\u0018\u0010.\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010-R\u0019\u00101\u001a\b\u0012\u0004\u0012\u00020%0+8F@\u0006¢\u0006\u0006\u001a\u0004\b/\u00100R\u001a\u00104\u001a\u000602R\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00103R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020%058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010!R\u0016\u0010=\u001a\u00020:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010!R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\t0?8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@¨\u0006E" }, d2 = { "Lkotlinx/coroutines/test/a;", "Lkotlin/coroutines/g;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "K", "", "delayTime", "Lkotlinx/coroutines/test/c;", "P", "S", "targetTime", "W", "R", "initial", "Lkotlin/Function2;", "Lkotlin/coroutines/g$b;", "operation", "fold", "(Ljava/lang/Object;Ln6/p;)Ljava/lang/Object;", "E", "Lkotlin/coroutines/g$c;", "key", "get", "(Lkotlin/coroutines/g$c;)Lkotlin/coroutines/g$b;", "minusKey", "Ljava/util/concurrent/TimeUnit;", "unit", "M", "p", "u", "U", "J", "", "message", "Lkotlin/Function1;", "", "", "predicate", "H", "z", "B", "", "toString", "Ljava/lang/String;", "name", "L", "()Ljava/util/List;", "exceptions", "Lkotlinx/coroutines/test/a$b;", "Lkotlinx/coroutines/test/a$b;", "ctxDispatcher", "", "G", "Ljava/util/List;", "uncaughtExceptions", "counter", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "I", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "ctxHandler", "time", "Lkotlinx/coroutines/internal/t0;", "Lkotlinx/coroutines/internal/t0;", "queue", "<init>", "(Ljava/lang/String;)V", "b", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
@i(level = k.G, message = "This API has been deprecated to integrate with Structured Concurrency.", replaceWith = @z0(expression = "TestCoroutineScope", imports = { "kotlin.coroutines.test" }))
public final class a implements g
{
    private final List<Throwable> G;
    private final b H;
    private final CoroutineExceptionHandler I;
    private final t0<c> J;
    private long K;
    private long L;
    private final String M;
    
    public a() {
        this(null, 1, null);
    }
    
    public a(@f final String m) {
        this.M = m;
        this.G = new ArrayList<Throwable>();
        this.H = new b();
        this.I = new CoroutineExceptionHandler(CoroutineExceptionHandler.s) {
            final /* synthetic */ a G;
            
            public void handleException(@e final g g, @e final Throwable t) {
                a.k(this.G).add(t);
            }
        };
        this.J = new t0<c>();
    }
    
    private final void K(final Runnable runnable) {
        final t0<c> j = this.J;
        final long k = this.K;
        this.K = 1L + k;
        j.b(new c(runnable, k, 0L, 4, null));
    }
    
    private final c P(final Runnable runnable, final long duration) {
        final long k = this.K;
        this.K = 1L + k;
        final c c = new c(runnable, k, this.L + TimeUnit.MILLISECONDS.toNanos(duration));
        this.J.b(c);
        return c;
    }
    
    private final long S() {
        final c c = this.J.h();
        if (c != null) {
            this.W(c.K);
        }
        long n;
        if (this.J.g()) {
            n = Long.MAX_VALUE;
        }
        else {
            n = 0L;
        }
        return n;
    }
    
    private final void W(final long n) {
        while (true) {
            final t0<c> j = this.J;
            synchronized (j) {
                final c e = j.e();
                c k = null;
                if (e != null) {
                    final boolean b = e.K <= n;
                    k = k;
                    if (b) {
                        k = j.k(0);
                    }
                }
                // monitorexit(j)
                final c c = k;
                if (c == null) {
                    return;
                }
                final long i = c.K;
                if (i != 0L) {
                    this.L = i;
                }
                c.run();
            }
        }
    }
    
    public static final /* synthetic */ t0 i(final a a) {
        return a.J;
    }
    
    public static final /* synthetic */ List k(final a a) {
        return a.G;
    }
    
    public final void B(@e final String detailMessage, @e final l<? super Throwable, Boolean> l) {
        final List<Throwable> g = this.G;
        final boolean b = g instanceof Collection;
        final boolean b2 = false;
        int n = 0;
        Label_0079: {
            if (b && g.isEmpty()) {
                n = (b2 ? 1 : 0);
            }
            else {
                final Iterator<Object> iterator = g.iterator();
                do {
                    n = (b2 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0079;
                } while (!(boolean)l.invoke(iterator.next()));
                n = 1;
            }
        }
        if (n != 0) {
            this.G.clear();
            return;
        }
        throw new AssertionError((Object)detailMessage);
    }
    
    public final void E(@e final String detailMessage, @e final l<? super List<? extends Throwable>, Boolean> l) {
        if (l.invoke((Object)this.G)) {
            this.G.clear();
            return;
        }
        throw new AssertionError((Object)detailMessage);
    }
    
    public final void H(@e final String detailMessage, @e final l<? super Throwable, Boolean> l) {
        if (this.G.size() == 1 && (boolean)l.invoke((Object)this.G.get(0))) {
            this.G.clear();
            return;
        }
        throw new AssertionError((Object)detailMessage);
    }
    
    public final void J() {
        if (!this.J.g()) {
            this.J.d();
        }
    }
    
    @e
    public final List<Throwable> L() {
        return this.G;
    }
    
    public final long M(@e final TimeUnit timeUnit) {
        return timeUnit.convert(this.L, TimeUnit.NANOSECONDS);
    }
    
    public final void U() {
        this.W(this.L);
    }
    
    public <R> R fold(final R r, @e final p<? super R, ? super g$b, ? extends R> p2) {
        return (R)p2.invoke(p2.invoke((Object)r, (Object)this.H), (Object)this.I);
    }
    
    @f
    public <E extends g$b> E get(@e final g$c<E> g$c) {
        Object obj;
        if (g$c == kotlin.coroutines.e.q) {
            obj = this.H;
        }
        else {
            if (g$c != CoroutineExceptionHandler.s) {
                obj = null;
                return (E)obj;
            }
            obj = this.I;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type E");
        return (E)obj;
    }
    
    @e
    public g minusKey(@e final g$c<?> g$c) {
        Object o;
        if (g$c == kotlin.coroutines.e.q) {
            o = this.I;
        }
        else if (g$c == CoroutineExceptionHandler.s) {
            o = this.H;
        }
        else {
            o = this;
        }
        return (g)o;
    }
    
    public final long p(long nanos, @e final TimeUnit timeUnit) {
        final long l = this.L;
        nanos = timeUnit.toNanos(nanos);
        final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
        this.u(nanos + l, nanoseconds);
        return timeUnit.convert(this.L - l, nanoseconds);
    }
    
    @e
    public g plus(@e final g g) {
        return g$a.a((g)this, g);
    }
    
    @e
    @Override
    public String toString() {
        String s = this.M;
        if (s == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TestCoroutineContext@");
            sb.append(x0.b(this));
            s = sb.toString();
        }
        return s;
    }
    
    public final void u(long nanos, @e final TimeUnit timeUnit) {
        nanos = timeUnit.toNanos(nanos);
        this.W(nanos);
        if (nanos > this.L) {
            this.L = nanos;
        }
    }
    
    public final void z(@e final String detailMessage, @e final l<? super Throwable, Boolean> l) {
        final List<Throwable> g = this.G;
        final boolean b = g instanceof Collection;
        final boolean b2 = true;
        int n = 0;
        Label_0079: {
            if (b && g.isEmpty()) {
                n = (b2 ? 1 : 0);
            }
            else {
                final Iterator<Object> iterator = g.iterator();
                do {
                    n = (b2 ? 1 : 0);
                    if (iterator.hasNext()) {
                        continue;
                    }
                    break Label_0079;
                } while (l.invoke(iterator.next()));
                n = 0;
            }
        }
        if (n != 0) {
            this.G.clear();
            return;
        }
        throw new AssertionError((Object)detailMessage);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\u001e\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0016J$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018" }, d2 = { "kotlinx/coroutines/test/a$b", "Lkotlinx/coroutines/p1;", "Lkotlinx/coroutines/c1;", "Lkotlin/coroutines/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/j2;", "H", "", "m0", "", "timeMillis", "Lkotlinx/coroutines/o;", "continuation", "e", "Lkotlinx/coroutines/l1;", "D", "i0", "", "toString", "<init>", "(Lkotlinx/coroutines/test/a;)V", "kotlinx-coroutines-core" }, k = 1, mv = { 1, 4, 2 })
    private final class b extends p1 implements c1
    {
        final /* synthetic */ a K;
        
        public b() {
            p1.e0(this, false, 1, null);
        }
        
        @e
        @Override
        public l1 D(final long n, @e final Runnable runnable, @e final g g) {
            return new l1(a.this.P(runnable, n)) {
                final /* synthetic */ b G;
                final /* synthetic */ c H;
                
                @Override
                public void dispose() {
                    a.i(this.G.K).j(this.H);
                }
            };
        }
        
        @f
        @Override
        public Object F(final long n, @e final d<? super j2> d) {
            return c1.a.a(this, n, d);
        }
        
        @Override
        public void H(@e final g g, @e final Runnable runnable) {
            a.this.K(runnable);
        }
        
        @Override
        public void e(final long n, @e final o<? super j2> o) {
            a.this.P(new Runnable() {
                final /* synthetic */ b G;
                
                @Override
                public final void run() {
                    o.F(this.G, j2.a);
                }
            }, n);
        }
        
        @Override
        public long i0() {
            return a.this.S();
        }
        
        @Override
        public boolean m0() {
            return true;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Dispatcher(");
            sb.append(a.this);
            sb.append(')');
            return sb.toString();
        }
    }
}
