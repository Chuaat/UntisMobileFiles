// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.utils.futures;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeoutException;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.Executor;
import androidx.annotation.j0;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import androidx.annotation.k0;
import java.util.logging.Logger;
import androidx.annotation.t0;

@t0({ t0.a.H })
public abstract class a<V> implements x2.a<V>
{
    static final boolean J;
    private static final Logger K;
    private static final long L = 1000L;
    static final b M;
    private static final Object N;
    @k0
    volatile Object G;
    @k0
    volatile e H;
    @k0
    volatile i I;
    
    static {
        J = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        K = Logger.getLogger(a.class.getName());
        h m;
        try {
            final f f = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), (AtomicReferenceFieldUpdater<a, i>)AtomicReferenceFieldUpdater.newUpdater(a.class, i.class, "I"), (AtomicReferenceFieldUpdater<a, e>)AtomicReferenceFieldUpdater.newUpdater(a.class, e.class, "H"), (AtomicReferenceFieldUpdater<a, Object>)AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "G"));
        }
        finally {
            m = new h();
        }
        M = (b)m;
        final Throwable thrown;
        if (thrown != null) {
            a.K.log(Level.SEVERE, "SafeAtomicHelper is broken!", thrown);
        }
        N = new Object();
    }
    
    protected a() {
    }
    
    private void a(final StringBuilder sb) {
        String str = "]";
        try {
            final Object k = k((Future<Object>)this);
            sb.append("SUCCESS, result=[");
            sb.append(this.t(k));
            sb.append("]");
            return;
        }
        catch (RuntimeException ex) {
            sb.append("UNKNOWN, cause=[");
            sb.append(ex.getClass());
            str = " thrown from get()]";
        }
        catch (CancellationException ex3) {
            str = "CANCELLED";
        }
        catch (ExecutionException ex2) {
            sb.append("FAILURE, cause=[");
            sb.append(ex2.getCause());
        }
        sb.append(str);
    }
    
    private static CancellationException c(@k0 final String message, @k0 final Throwable cause) {
        final CancellationException ex = new CancellationException(message);
        ex.initCause(cause);
        return ex;
    }
    
    @j0
    static <T> T d(@k0 final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    private e e(e e) {
        e h;
        do {
            h = this.H;
        } while (!a.M.a(this, h, a.e.d));
        e c = e;
        e c2;
        for (e = h; e != null; e = c2) {
            c2 = e.c;
            e.c = c;
            c = e;
        }
        return c;
    }
    
    static void f(a<?> a) {
        e e = null;
    Label_0002:
        while (true) {
            a.o();
            a.b();
            e c;
            for (e e2 = a.e(e); e2 != null; e2 = c) {
                c = e2.c;
                final Runnable a2 = e2.a;
                if (a2 instanceof g) {
                    final g g = (g)a2;
                    final a<V> g2 = g.G;
                    if (g2.G == g && a.M.b(g2, g, j(g.H))) {
                        e = c;
                        a = g2;
                        continue Label_0002;
                    }
                }
                else {
                    h(a2, e2.b);
                }
            }
            break;
        }
    }
    
    private static void h(final Runnable obj, final Executor obj2) {
        try {
            obj2.execute(obj);
        }
        catch (RuntimeException thrown) {
            final Logger k = a.K;
            final Level severe = Level.SEVERE;
            final StringBuilder sb = new StringBuilder();
            sb.append("RuntimeException while executing runnable ");
            sb.append(obj);
            sb.append(" with executor ");
            sb.append(obj2);
            k.log(severe, sb.toString(), thrown);
        }
    }
    
    private V i(final Object o) throws ExecutionException {
        if (o instanceof c) {
            throw c("Task was cancelled.", ((c)o).b);
        }
        if (!(o instanceof d)) {
            Object o2;
            if ((o2 = o) == a.N) {
                o2 = null;
            }
            return (V)o2;
        }
        throw new ExecutionException(((d)o).a);
    }
    
    static Object j(final x2.a<?> obj) {
        if (obj instanceof a) {
            Object o2;
            final Object o = o2 = ((a<Object>)obj).G;
            if (o instanceof c) {
                final c c = (c)o;
                o2 = o;
                if (c.a) {
                    if (c.b != null) {
                        o2 = new c(false, c.b);
                    }
                    else {
                        o2 = a.c.d;
                    }
                }
            }
            return o2;
        }
        final boolean cancelled = obj.isCancelled();
        if ((a.J ^ true) & cancelled) {
            return c.d;
        }
        try {
            Object o3;
            if ((o3 = k(obj)) == null) {
                o3 = a.N;
            }
            return o3;
        }
        catch (CancellationException cause) {
            if (!cancelled) {
                final StringBuilder sb = new StringBuilder();
                sb.append("get() threw CancellationException, despite reporting isCancelled() == false: ");
                sb.append(obj);
                return new d(new IllegalArgumentException(sb.toString(), cause));
            }
            return new c(false, cause);
        }
        catch (ExecutionException ex) {
            return new d(ex.getCause());
        }
        finally {
            final Throwable t;
            return new d(t);
        }
    }
    
    private static <V> V k(final Future<V> future) throws ExecutionException {
        boolean b = false;
        try {
            return future.get();
        }
        catch (InterruptedException ex) {
            b = true;
            return future.get();
        }
        finally {
            if (b) {
                Thread.currentThread().interrupt();
            }
        }
    }
    
    private void o() {
        i i;
        do {
            i = this.I;
        } while (!a.M.c(this, i, a.i.c));
        while (i != null) {
            i.b();
            i = i.b;
        }
    }
    
    private void p(i i) {
        i.a = null;
    Label_0005:
        while (true) {
            i = this.I;
            if (i == a.i.c) {
                return;
            }
            i j = null;
            while (i != null) {
                final i b = i.b;
                i k;
                if (i.a != null) {
                    k = i;
                }
                else if (j != null) {
                    j.b = b;
                    k = j;
                    if (j.a == null) {
                        continue Label_0005;
                    }
                }
                else {
                    k = j;
                    if (!a.M.c(this, i, b)) {
                        continue Label_0005;
                    }
                }
                i = b;
                j = k;
            }
        }
    }
    
    private String t(final Object obj) {
        if (obj == this) {
            return "this future";
        }
        return String.valueOf(obj);
    }
    
    protected void b() {
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        Object o = this.G;
        final boolean b2 = true;
        boolean b3;
        if (o == null | o instanceof g) {
            c c;
            if (a.J) {
                c = new c(b, new CancellationException("Future.cancel() was called."));
            }
            else if (b) {
                c = a.c.c;
            }
            else {
                c = a.c.d;
            }
            b3 = false;
            a<? extends V> a = (a<? extends V>)this;
            while (true) {
                if (androidx.work.impl.utils.futures.a.M.b(a, o, c)) {
                    if (b) {
                        a.l();
                    }
                    f(a);
                    b3 = b2;
                    if (!(o instanceof g)) {
                        break;
                    }
                    final x2.a<? extends V> h = ((g)o).H;
                    if (!(h instanceof a)) {
                        h.cancel(b);
                        b3 = b2;
                        break;
                    }
                    a = (a<? extends V>)h;
                    o = a.G;
                    final boolean b4 = o == null;
                    b3 = b2;
                    if (!(b4 | o instanceof g)) {
                        break;
                    }
                    b3 = true;
                }
                else {
                    if (!((o = a.G) instanceof g)) {
                        break;
                    }
                    continue;
                }
            }
        }
        else {
            b3 = false;
        }
        return b3;
    }
    
    @Override
    public final void g(final Runnable runnable, final Executor executor) {
        d(runnable);
        d(executor);
        e c = this.H;
        if (c != e.d) {
            final e e = new e(runnable, executor);
            do {
                e.c = c;
                if (a.M.a(this, c, e)) {
                    return;
                }
            } while ((c = this.H) != a.e.d);
        }
        h(runnable, executor);
    }
    
    @Override
    public final V get() throws InterruptedException, ExecutionException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object g = this.G;
        if (g != null & (g instanceof g ^ true)) {
            return this.i(g);
        }
        i i = this.I;
        if (i != a.i.c) {
            final i j = new i();
            do {
                j.a(i);
                if (a.M.c(this, i, j)) {
                    Object g2;
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            this.p(j);
                            throw new InterruptedException();
                        }
                        g2 = this.G;
                    } while (!(g2 != null & (g2 instanceof g ^ true)));
                    return this.i(g2);
                }
            } while ((i = this.I) != a.i.c);
        }
        return this.i(this.G);
    }
    
    @Override
    public final V get(long convert, final TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long nanos = timeUnit.toNanos(convert);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        final Object g = this.G;
        if (g != null & (g instanceof g ^ true)) {
            return this.i(g);
        }
        long n;
        if (nanos > 0L) {
            n = System.nanoTime() + nanos;
        }
        else {
            n = 0L;
        }
        long n2 = nanos;
        Label_0254: {
            if (nanos >= 1000L) {
                i i = this.I;
                if (i != a.i.c) {
                    final i j = new i();
                    do {
                        j.a(i);
                        if (a.M.c(this, i, j)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (Thread.interrupted()) {
                                    this.p(j);
                                    throw new InterruptedException();
                                }
                                final Object g2 = this.G;
                                if (g2 != null & (g2 instanceof g ^ true)) {
                                    return this.i(g2);
                                }
                                n2 = (nanos = n - System.nanoTime());
                            } while (n2 >= 1000L);
                            this.p(j);
                            break Label_0254;
                        }
                    } while ((i = this.I) != a.i.c);
                }
                return this.i(this.G);
            }
        }
        while (n2 > 0L) {
            final Object g3 = this.G;
            if (g3 != null & (g3 instanceof g ^ true)) {
                return this.i(g3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            n2 = n - System.nanoTime();
        }
        final String string = this.toString();
        final String string2 = timeUnit.toString();
        final Locale root = Locale.ROOT;
        final String lowerCase = string2.toLowerCase(root);
        final StringBuilder sb = new StringBuilder();
        sb.append("Waited ");
        sb.append(convert);
        sb.append(" ");
        sb.append(timeUnit.toString().toLowerCase(root));
        String s;
        final String str = s = sb.toString();
        if (n2 + 1000L < 0L) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" (plus ");
            final String string3 = sb2.toString();
            final long sourceDuration = -n2;
            convert = timeUnit.convert(sourceDuration, TimeUnit.NANOSECONDS);
            final long lng = sourceDuration - timeUnit.toNanos(convert);
            final long n3 = lcmp(convert, 0L);
            final boolean b = n3 == 0 || lng > 1000L;
            String string4 = string3;
            if (n3 > 0) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string3);
                sb3.append(convert);
                sb3.append(" ");
                sb3.append(lowerCase);
                String s2 = sb3.toString();
                if (b) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(s2);
                    sb4.append(",");
                    s2 = sb4.toString();
                }
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(s2);
                sb5.append(" ");
                string4 = sb5.toString();
            }
            String string5 = string4;
            if (b) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(string4);
                sb6.append(lng);
                sb6.append(" nanoseconds ");
                string5 = sb6.toString();
            }
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(string5);
            sb7.append("delay)");
            s = sb7.toString();
        }
        if (this.isDone()) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(s);
            sb8.append(" but future completed as timeout expired");
            throw new TimeoutException(sb8.toString());
        }
        final StringBuilder sb9 = new StringBuilder();
        sb9.append(s);
        sb9.append(" for ");
        sb9.append(string);
        throw new TimeoutException(sb9.toString());
    }
    
    @Override
    public final boolean isCancelled() {
        return this.G instanceof c;
    }
    
    @Override
    public final boolean isDone() {
        final Object g = this.G;
        return (g instanceof g ^ true) & g != null;
    }
    
    protected void l() {
    }
    
    final void m(@k0 final Future<?> future) {
        if (future != null & this.isCancelled()) {
            future.cancel(this.u());
        }
    }
    
    @k0
    protected String n() {
        final Object g = this.G;
        if (g instanceof g) {
            final StringBuilder sb = new StringBuilder();
            sb.append("setFuture=[");
            sb.append(this.t(((g)g).H));
            sb.append("]");
            return sb.toString();
        }
        if (this instanceof ScheduledFuture) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("remaining delay=[");
            sb2.append(((ScheduledFuture)this).getDelay(TimeUnit.MILLISECONDS));
            sb2.append(" ms]");
            return sb2.toString();
        }
        return null;
    }
    
    protected boolean q(@k0 final V v) {
        Object n = v;
        if (v == null) {
            n = a.N;
        }
        if (a.M.b(this, null, n)) {
            f(this);
            return true;
        }
        return false;
    }
    
    protected boolean r(final Throwable t) {
        if (a.M.b(this, null, new d(d(t)))) {
            f(this);
            return true;
        }
        return false;
    }
    
    protected boolean s(final x2.a<? extends V> a) {
        d(a);
        Object o;
        if ((o = this.G) == null) {
            if (a.isDone()) {
                if (a.M.b(this, null, j(a))) {
                    f(this);
                    return true;
                }
                return false;
            }
            else {
                final g g = new g((a<V>)this, (x2.a<? extends V>)a);
                if (a.M.b(this, null, g)) {
                    try {
                        a.g(g, androidx.work.impl.utils.futures.b.G);
                    }
                    finally {
                        d b = null;
                        try {
                            final Throwable t;
                            final d d = new d(t);
                        }
                        finally {
                            b = d.b;
                        }
                        a.M.b(this, g, b);
                    }
                    return true;
                }
                o = this.G;
            }
        }
        if (o instanceof c) {
            a.cancel(((c)o).a);
        }
        return false;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        Label_0150: {
            String str2 = null;
            Label_0035: {
                if (!this.isCancelled()) {
                    if (!this.isDone()) {
                        String str;
                        try {
                            str = this.n();
                        }
                        catch (RuntimeException ex) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Exception thrown from implementation: ");
                            sb2.append(ex.getClass());
                            str = sb2.toString();
                        }
                        if (str != null && !str.isEmpty()) {
                            sb.append("PENDING, info=[");
                            sb.append(str);
                            sb.append("]");
                            break Label_0150;
                        }
                        if (!this.isDone()) {
                            str2 = "PENDING";
                            break Label_0035;
                        }
                    }
                    this.a(sb);
                    break Label_0150;
                }
                str2 = "CANCELLED";
            }
            sb.append(str2);
        }
        sb.append("]");
        return sb.toString();
    }
    
    protected final boolean u() {
        final Object g = this.G;
        return g instanceof c && ((c)g).a;
    }
    
    private abstract static class b
    {
        abstract boolean a(final a<?> p0, final e p1, final e p2);
        
        abstract boolean b(final a<?> p0, final Object p1, final Object p2);
        
        abstract boolean c(final a<?> p0, final i p1, final i p2);
        
        abstract void d(final i p0, final i p1);
        
        abstract void e(final i p0, final Thread p1);
    }
    
    private static final class c
    {
        static final c c;
        static final c d;
        final boolean a;
        @k0
        final Throwable b;
        
        static {
            if (a.J) {
                d = null;
                c = null;
            }
            else {
                d = new c(false, null);
                c = new c(true, null);
            }
        }
        
        c(final boolean a, @k0 final Throwable b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static final class d
    {
        static final d b;
        final Throwable a;
        
        static {
            b = new d(new Throwable() {
                @Override
                public Throwable fillInStackTrace() {
                    // monitorenter(this)
                    // monitorexit(this)
                    return this;
                }
            });
        }
        
        d(final Throwable t) {
            this.a = a.d(t);
        }
    }
    
    private static final class e
    {
        static final e d;
        final Runnable a;
        final Executor b;
        @k0
        e c;
        
        static {
            d = new e(null, null);
        }
        
        e(final Runnable a, final Executor b) {
            this.a = a;
            this.b = b;
        }
    }
    
    private static final class f extends b
    {
        final AtomicReferenceFieldUpdater<i, Thread> a;
        final AtomicReferenceFieldUpdater<i, i> b;
        final AtomicReferenceFieldUpdater<a, i> c;
        final AtomicReferenceFieldUpdater<a, e> d;
        final AtomicReferenceFieldUpdater<a, Object> e;
        
        f(final AtomicReferenceFieldUpdater<i, Thread> a, final AtomicReferenceFieldUpdater<i, i> b, final AtomicReferenceFieldUpdater<a, i> c, final AtomicReferenceFieldUpdater<a, e> d, final AtomicReferenceFieldUpdater<a, Object> e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
        
        @Override
        boolean a(final a<?> a, final e e, final e e2) {
            return this.d.compareAndSet(a, e, e2);
        }
        
        @Override
        boolean b(final a<?> a, final Object o, final Object o2) {
            return this.e.compareAndSet(a, o, o2);
        }
        
        @Override
        boolean c(final a<?> a, final i i, final i j) {
            return this.c.compareAndSet(a, i, j);
        }
        
        @Override
        void d(final i i, final i j) {
            this.b.lazySet(i, j);
        }
        
        @Override
        void e(final i i, final Thread thread) {
            this.a.lazySet(i, thread);
        }
    }
    
    private static final class g<V> implements Runnable
    {
        final a<V> G;
        final x2.a<? extends V> H;
        
        g(final a<V> g, final x2.a<? extends V> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            if (this.G.G != this) {
                return;
            }
            if (a.M.b(this.G, this, a.j(this.H))) {
                a.f(this.G);
            }
        }
    }
    
    private static final class h extends b
    {
        h() {
        }
        
        @Override
        boolean a(final a<?> a, final e e, final e h) {
            synchronized (a) {
                if (a.H == e) {
                    a.H = h;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        boolean b(final a<?> a, final Object o, final Object g) {
            synchronized (a) {
                if (a.G == o) {
                    a.G = g;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        boolean c(final a<?> a, final i i, final i j) {
            synchronized (a) {
                if (a.I == i) {
                    a.I = j;
                    return true;
                }
                return false;
            }
        }
        
        @Override
        void d(final i i, final i b) {
            i.b = b;
        }
        
        @Override
        void e(final i i, final Thread a) {
            i.a = a;
        }
    }
    
    private static final class i
    {
        static final i c;
        @k0
        volatile Thread a;
        @k0
        volatile i b;
        
        static {
            c = new i(false);
        }
        
        i() {
            a.M.e(this, Thread.currentThread());
        }
        
        i(final boolean b) {
        }
        
        void a(final i i) {
            androidx.work.impl.utils.futures.a.M.d(this, i);
        }
        
        void b() {
            final Thread a = this.a;
            if (a != null) {
                this.a = null;
                LockSupport.unpark(a);
            }
        }
    }
}
