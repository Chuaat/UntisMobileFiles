// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.j2;
import java.util.logging.Level;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import java.util.logging.Logger;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0003\u0014\u001d\u0011B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J\u0006\u0010\u0012\u001a\u00020\u0004R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0019\u0010\u001b\u001a\u00020\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\n0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010!R\u0016\u0010&\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010'¨\u0006+" }, d2 = { "Lokhttp3/internal/concurrent/d;", "", "Lokhttp3/internal/concurrent/a;", "task", "Lkotlin/j2;", "f", "k", "", "delayNanos", "d", "Lokhttp3/internal/concurrent/c;", "taskQueue", "i", "(Lokhttp3/internal/concurrent/c;)V", "e", "j", "", "c", "g", "", "a", "I", "nextQueueName", "Lokhttp3/internal/concurrent/d$a;", "Lokhttp3/internal/concurrent/d$a;", "h", "()Lokhttp3/internal/concurrent/d$a;", "backend", "", "b", "Z", "coordinatorWaiting", "", "Ljava/util/List;", "readyQueues", "busyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "J", "coordinatorWakeUpAt", "<init>", "(Lokhttp3/internal/concurrent/d$a;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    @m6.d
    @e
    public static final d h;
    @e
    private static final Logger i;
    public static final b j;
    private int a;
    private boolean b;
    private long c;
    private final List<okhttp3.internal.concurrent.c> d;
    private final List<okhttp3.internal.concurrent.c> e;
    private final Runnable f;
    @e
    private final a g;
    
    static {
        j = new b(null);
        final StringBuilder sb = new StringBuilder();
        sb.append(okhttp3.internal.d.i);
        sb.append(" TaskRunner");
        h = new d((a)new c(okhttp3.internal.d.U(sb.toString(), true)));
        final Logger logger = Logger.getLogger(d.class.getName());
        k0.o((Object)logger, "Logger.getLogger(TaskRunner::class.java.name)");
        i = logger;
    }
    
    public d(@e final a g) {
        k0.p((Object)g, "backend");
        this.g = g;
        this.a = 10000;
        this.d = new ArrayList<okhttp3.internal.concurrent.c>();
        this.e = new ArrayList<okhttp3.internal.concurrent.c>();
        this.f = new Runnable() {
            final /* synthetic */ d G;
            
            @Override
            public void run() {
                while (true) {
                    Object o = this.G;
                    synchronized (o) {
                        final okhttp3.internal.concurrent.a e = this.G.e();
                        // monitorexit(o)
                        if (e != null) {
                            o = e.d();
                            k0.m(o);
                            long b = -1L;
                            final boolean loggable = okhttp3.internal.concurrent.d.j.a().isLoggable(Level.FINE);
                            if (loggable) {
                                b = ((okhttp3.internal.concurrent.c)o).k().h().b();
                                okhttp3.internal.concurrent.b.a(e, (okhttp3.internal.concurrent.c)o, "starting");
                            }
                            try {
                                okhttp3.internal.concurrent.d.this.k(e);
                                final j2 j2 = kotlin.j2.a;
                                final boolean b2 = loggable;
                                if (b2) {
                                    final d d = ((okhttp3.internal.concurrent.c)o).k();
                                    final a a = d.h();
                                    final long n = a.b();
                                    final StringBuilder sb = new StringBuilder();
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = sb;
                                    final String s = "finished run in ";
                                    sb3.append(s);
                                    final StringBuilder sb4 = sb2;
                                    final long n2 = n;
                                    final long n3 = b;
                                    final long n4 = n2 - n3;
                                    final String s2 = okhttp3.internal.concurrent.b.b(n4);
                                    sb4.append(s2);
                                    final okhttp3.internal.concurrent.a a2 = e;
                                    final StringBuilder sb5 = sb2;
                                    final String s3 = sb5.toString();
                                    okhttp3.internal.concurrent.b.a(a2, (okhttp3.internal.concurrent.c)o, s3);
                                    continue;
                                }
                                continue;
                            }
                            finally {
                                this.G.h().execute(this);
                            }
                            try {
                                final j2 j2 = kotlin.j2.a;
                                final boolean b2 = loggable;
                                if (b2) {
                                    final d d = ((okhttp3.internal.concurrent.c)o).k();
                                    final a a = d.h();
                                    final long n = a.b();
                                    final StringBuilder sb = new StringBuilder();
                                    final StringBuilder sb3;
                                    final StringBuilder sb2 = sb3 = sb;
                                    final String s = "finished run in ";
                                    sb3.append(s);
                                    final StringBuilder sb4 = sb2;
                                    final long n2 = n;
                                    final long n3 = b;
                                    final long n4 = n2 - n3;
                                    final String s2 = okhttp3.internal.concurrent.b.b(n4);
                                    sb4.append(s2);
                                    final okhttp3.internal.concurrent.a a2 = e;
                                    final StringBuilder sb5 = sb2;
                                    final String s3 = sb5.toString();
                                    okhttp3.internal.concurrent.b.a(a2, (okhttp3.internal.concurrent.c)o, s3);
                                    continue;
                                }
                                continue;
                            }
                            finally {
                                if (loggable) {
                                    final long b3 = ((okhttp3.internal.concurrent.c)o).k().h().b();
                                    final StringBuilder sb6 = new StringBuilder();
                                    sb6.append("failed a run in ");
                                    sb6.append(okhttp3.internal.concurrent.b.b(b3 - b));
                                    okhttp3.internal.concurrent.b.a(e, (okhttp3.internal.concurrent.c)o, sb6.toString());
                                }
                            }
                        }
                    }
                }
            }
        };
    }
    
    public static final /* synthetic */ Logger a() {
        return d.i;
    }
    
    private final void d(final okhttp3.internal.concurrent.a a, final long n) {
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        final okhttp3.internal.concurrent.c d = a.d();
        k0.m((Object)d);
        if (d.e() == a) {
            final boolean f = d.f();
            d.s(false);
            d.r(null);
            this.d.remove(d);
            if (n != -1L && !f && !d.j()) {
                d.q(a, n, true);
            }
            if (d.g().isEmpty() ^ true) {
                this.e.add(d);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    private final void f(final okhttp3.internal.concurrent.a a) {
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        a.g(-1L);
        final okhttp3.internal.concurrent.c d = a.d();
        k0.m((Object)d);
        d.g().remove(a);
        this.e.remove(d);
        d.r(a);
        this.d.add(d);
    }
    
    private final void k(final okhttp3.internal.concurrent.a a) {
        if (okhttp3.internal.d.h && Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        final Thread currentThread2 = Thread.currentThread();
        k0.o((Object)currentThread2, "currentThread");
        final String name = currentThread2.getName();
        currentThread2.setName(a.b());
        try {
            final long f = a.f();
            synchronized (this) {
                this.d(a, f);
                final j2 a2 = j2.a;
                // monitorexit(this)
                currentThread2.setName(name);
            }
        }
        finally {
            synchronized (this) {
                this.d(a, -1L);
                final j2 a3 = j2.a;
                // monitorexit(this)
                currentThread2.setName(name);
            }
        }
    }
    
    @e
    public final List<okhttp3.internal.concurrent.c> c() {
        synchronized (this) {
            return (List<okhttp3.internal.concurrent.c>)v.q4((Collection)this.d, (Iterable)this.e);
        }
    }
    
    @f
    public final okhttp3.internal.concurrent.a e() {
        if (okhttp3.internal.d.h) {
            if (!Thread.holdsLock(this)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Thread ");
                final Thread currentThread = Thread.currentThread();
                k0.o((Object)currentThread, "Thread.currentThread()");
                sb.append(currentThread.getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError((Object)sb.toString());
            }
        }
        while (!this.e.isEmpty()) {
            final long b = this.g.b();
            long min = Long.MAX_VALUE;
            final Iterator<okhttp3.internal.concurrent.c> iterator = this.e.iterator();
            okhttp3.internal.concurrent.a a = null;
            while (true) {
                while (iterator.hasNext()) {
                    final okhttp3.internal.concurrent.a a2 = iterator.next().g().get(0);
                    final long max = Math.max(0L, a2.c() - b);
                    if (max > 0L) {
                        min = Math.min(max, min);
                    }
                    else if (a != null) {
                        final boolean b2 = true;
                        if (a != null) {
                            this.f(a);
                            if (b2 || (!this.b && (this.e.isEmpty() ^ true))) {
                                this.g.execute(this.f);
                            }
                            return a;
                        }
                        if (this.b) {
                            if (min < this.c - b) {
                                this.g.a(this);
                            }
                            return null;
                        }
                        this.b = true;
                        this.c = b + min;
                        while (true) {
                            try {
                                try {
                                    this.g.c(this, min);
                                    this.b = false;
                                }
                                finally {}
                            }
                            catch (InterruptedException ex) {
                                this.g();
                                continue;
                            }
                            break;
                        }
                        this.b = false;
                    }
                    else {
                        a = a2;
                    }
                }
                final boolean b2 = false;
                continue;
            }
        }
        return null;
    }
    
    public final void g() {
        for (int i = this.d.size() - 1; i >= 0; --i) {
            this.d.get(i).b();
        }
        for (int j = this.e.size() - 1; j >= 0; --j) {
            final okhttp3.internal.concurrent.c c = this.e.get(j);
            c.b();
            if (c.g().isEmpty()) {
                this.e.remove(j);
            }
        }
    }
    
    @e
    public final a h() {
        return this.g;
    }
    
    public final void i(@e final okhttp3.internal.concurrent.c c) {
        k0.p((Object)c, "taskQueue");
        if (okhttp3.internal.d.h && !Thread.holdsLock(this)) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Thread ");
            final Thread currentThread = Thread.currentThread();
            k0.o((Object)currentThread, "Thread.currentThread()");
            sb.append(currentThread.getName());
            sb.append(" MUST hold lock on ");
            sb.append(this);
            throw new AssertionError((Object)sb.toString());
        }
        if (c.e() == null) {
            if (c.g().isEmpty() ^ true) {
                okhttp3.internal.d.a(this.e, c);
            }
            else {
                this.e.remove(c);
            }
        }
        if (this.b) {
            this.g.a(this);
        }
        else {
            this.g.execute(this.f);
        }
    }
    
    @e
    public final okhttp3.internal.concurrent.c j() {
        synchronized (this) {
            final int i = this.a++;
            // monitorexit(this)
            final StringBuilder sb = new StringBuilder();
            sb.append('Q');
            sb.append(i);
            return new okhttp3.internal.concurrent.c(this, sb.toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H&J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH&¨\u0006\u000e" }, d2 = { "okhttp3/internal/concurrent/d$a", "", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/j2;", "d", "", "b", "a", "nanos", "c", "Ljava/lang/Runnable;", "runnable", "execute", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        void a(@e final d p0);
        
        long b();
        
        void c(@e final d p0, final long p1);
        
        void d(@e final d p0);
        
        void execute(@e final Runnable p0);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f" }, d2 = { "okhttp3/internal/concurrent/d$b", "", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/d;", "INSTANCE", "Lokhttp3/internal/concurrent/d;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final Logger a() {
            return okhttp3.internal.concurrent.d.a();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0006\u0010\u000e\u001a\u00020\u0004R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010¨\u0006\u0016" }, d2 = { "okhttp3/internal/concurrent/d$c", "Lokhttp3/internal/concurrent/d$a;", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Lkotlin/j2;", "d", "", "b", "a", "nanos", "c", "Ljava/lang/Runnable;", "runnable", "execute", "e", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class c implements a
    {
        private final ThreadPoolExecutor a;
        
        public c(@e final ThreadFactory threadFactory) {
            k0.p((Object)threadFactory, "threadFactory");
            this.a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue<Runnable>(), threadFactory);
        }
        
        @Override
        public void a(@e final d d) {
            k0.p((Object)d, "taskRunner");
            d.notify();
        }
        
        @Override
        public long b() {
            return System.nanoTime();
        }
        
        @Override
        public void c(@e final d d, final long n) throws InterruptedException {
            k0.p((Object)d, "taskRunner");
            final long timeoutMillis = n / 1000000L;
            if (timeoutMillis > 0L || n > 0L) {
                d.wait(timeoutMillis, (int)(n - 1000000L * timeoutMillis));
            }
        }
        
        @Override
        public void d(@e final d d) {
            k0.p((Object)d, "taskRunner");
        }
        
        public final void e() {
            this.a.shutdown();
        }
        
        @Override
        public void execute(@e final Runnable command) {
            k0.p((Object)command, "runnable");
            this.a.execute(command);
        }
    }
}
