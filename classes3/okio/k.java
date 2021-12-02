// 
// Decompiled by Procyon v0.5.36
// 

package okio;

import java.io.InterruptedIOException;
import kotlin.y0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.h0;
import n6.a;
import java.io.IOException;
import kotlin.j2;
import kotlin.jvm.internal.k0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 $2\u00020\u0001:\u0002%&B\u0007¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\b\u0010\t\u001a\u00020\u0005H\u0014J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rJ'\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0086\b\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0017\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0001J\u0012\u0010\u0018\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 \u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006'" }, d2 = { "Lokio/k;", "Lokio/t0;", "", "now", "A", "Lkotlin/j2;", "x", "", "y", "D", "Lokio/p0;", "sink", "B", "Lokio/r0;", "source", "C", "T", "Lkotlin/Function0;", "block", "E", "(Ln6/a;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "r", "z", "f", "Z", "inQueue", "g", "Lokio/k;", "next", "h", "J", "timeoutAt", "<init>", "()V", "m", "a", "b", "okio" }, k = 1, mv = { 1, 4, 1 })
public class k extends t0
{
    private static final int i = 65536;
    private static final long j;
    private static final long k;
    private static k l;
    @e
    public static final a m;
    private boolean f;
    private k g;
    private long h;
    
    static {
        m = new a(null);
        k = TimeUnit.MILLISECONDS.toNanos(j = TimeUnit.SECONDS.toMillis(60L));
    }
    
    private final long A(final long n) {
        return this.h - n;
    }
    
    public static final /* synthetic */ k l() {
        return okio.k.l;
    }
    
    public static final /* synthetic */ long m() {
        return okio.k.j;
    }
    
    public static final /* synthetic */ long n() {
        return okio.k.k;
    }
    
    public static final /* synthetic */ boolean o(final k k) {
        return k.f;
    }
    
    public static final /* synthetic */ k p(final k k) {
        return k.g;
    }
    
    public static final /* synthetic */ void t(final k l) {
        okio.k.l = l;
    }
    
    public static final /* synthetic */ void u(final k k, final boolean f) {
        k.f = f;
    }
    
    public static final /* synthetic */ void v(final k k, final k g) {
        k.g = g;
    }
    
    public static final /* synthetic */ void w(final k k, final long h) {
        k.h = h;
    }
    
    @e
    public final p0 B(@e final p0 p) {
        k0.p((Object)p, "sink");
        return new p0(p) {
            final /* synthetic */ k G;
            final /* synthetic */ p0 H;
            
            @e
            public k a() {
                return this.G;
            }
            
            @Override
            public void close() {
                final k g = this.G;
                g.x();
                try {
                    try {
                        this.H.close();
                        final j2 a = j2.a;
                        if (!g.y()) {
                            return;
                        }
                        throw g.r(null);
                    }
                    finally {}
                }
                catch (IOException r) {
                    if (g.y()) {
                        r = g.r(r);
                    }
                    throw r;
                }
                g.y();
            }
            
            @Override
            public void flush() {
                final k g = this.G;
                g.x();
                try {
                    try {
                        this.H.flush();
                        final j2 a = j2.a;
                        if (!g.y()) {
                            return;
                        }
                        throw g.r(null);
                    }
                    finally {}
                }
                catch (IOException r) {
                    if (g.y()) {
                        r = g.r(r);
                    }
                    throw r;
                }
                g.y();
            }
            
            @Override
            public void t3(@e final m m, long n) {
                k0.p((Object)m, "source");
                okio.j.e(m.h0(), 0L, n);
                while (true) {
                    long n2 = 0L;
                    if (n <= 0L) {
                        return;
                    }
                    m0 m2 = m.G;
                    long n3;
                    while (true) {
                        k0.m((Object)m2);
                        n3 = n2;
                        if (n2 >= 65536) {
                            break;
                        }
                        n2 += m2.c - m2.b;
                        if (n2 >= n) {
                            n3 = n;
                            break;
                        }
                        m2 = m2.f;
                    }
                    final k g = this.G;
                    g.x();
                    try {
                        try {
                            this.H.t3(m, n3);
                            final j2 a = j2.a;
                            if (!g.y()) {
                                n -= n3;
                                continue;
                            }
                            throw g.r(null);
                        }
                        finally {}
                    }
                    catch (IOException r) {
                        if (g.y()) {
                            r = g.r(r);
                        }
                        throw r;
                    }
                    g.y();
                }
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("AsyncTimeout.sink(");
                sb.append(this.H);
                sb.append(')');
                return sb.toString();
            }
        };
    }
    
    @e
    public final r0 C(@e final r0 r0) {
        k0.p((Object)r0, "source");
        return new r0(r0) {
            final /* synthetic */ k G;
            final /* synthetic */ r0 H;
            
            @e
            public k a() {
                return this.G;
            }
            
            @Override
            public void close() {
                final k g = this.G;
                g.x();
                try {
                    try {
                        this.H.close();
                        final j2 a = j2.a;
                        if (!g.y()) {
                            return;
                        }
                        throw g.r(null);
                    }
                    finally {}
                }
                catch (IOException r) {
                    if (g.y()) {
                        r = g.r(r);
                    }
                    throw r;
                }
                g.y();
            }
            
            @Override
            public long read(@e final m m, long read) {
                k0.p((Object)m, "sink");
                final k g = this.G;
                g.x();
                try {
                    try {
                        read = this.H.read(m, read);
                        if (!g.y()) {
                            return read;
                        }
                        throw g.r(null);
                    }
                    finally {}
                }
                catch (IOException r) {
                    if (g.y()) {
                        r = g.r(r);
                    }
                    throw r;
                }
                g.y();
            }
            
            @e
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("AsyncTimeout.source(");
                sb.append(this.H);
                sb.append(')');
                return sb.toString();
            }
        };
    }
    
    protected void D() {
    }
    
    public final <T> T E(@e final n6.a<? extends T> a) {
        k0.p((Object)a, "block");
        this.x();
        try {
            try {
                final Object invoke = a.invoke();
                h0.d(1);
                if (!this.y()) {
                    h0.c(1);
                    return (T)invoke;
                }
                throw this.r(null);
            }
            finally {}
        }
        catch (IOException r) {
            if (this.y()) {
                r = this.r(r);
            }
            throw r;
        }
        h0.d(1);
        this.y();
        h0.c(1);
    }
    
    @y0
    @e
    public final IOException r(@f final IOException ex) {
        return this.z(ex);
    }
    
    public final void x() {
        final long j = this.j();
        final boolean f = this.f();
        if (j == 0L && !f) {
            return;
        }
        okio.k.m.e(this, j, f);
    }
    
    public final boolean y() {
        return okio.k.m.d(this);
    }
    
    @e
    protected IOException z(@f final IOException cause) {
        final InterruptedIOException ex = new InterruptedIOException("timeout");
        if (cause != null) {
            ex.initCause(cause);
        }
        return ex;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "okio/k$a", "", "Lokio/k;", "node", "", "timeoutNanos", "", "hasDeadline", "Lkotlin/j2;", "e", "d", "c", "()Lokio/k;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "head", "Lokio/k;", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final boolean d(final k k) {
            synchronized (k.class) {
                if (!k.o(k)) {
                    return false;
                }
                k.u(k, false);
                for (k i = k.l(); i != null; i = k.p(i)) {
                    if (k.p(i) == k) {
                        k.v(i, k.p(k));
                        k.v(k, null);
                        return false;
                    }
                }
                return true;
            }
        }
        
        private final void e(final k k, long a, final boolean b) {
            synchronized (k.class) {
                if (k.o(k) ^ true) {
                    k.u(k, true);
                    if (k.l() == null) {
                        k.t(new k());
                        new b().start();
                    }
                    final long nanoTime = System.nanoTime();
                    final long n = lcmp(a, 0L);
                    Label_0117: {
                        if (n != 0 && b) {
                            a = Math.min(a, k.d() - nanoTime);
                        }
                        else if (n == 0) {
                            if (b) {
                                k.w(k, k.d());
                                break Label_0117;
                            }
                            throw new AssertionError();
                        }
                        k.w(k, a + nanoTime);
                    }
                    a = k.A(nanoTime);
                    k i = k.l();
                    while (true) {
                        k0.m((Object)i);
                        if (k.p(i) == null) {
                            break;
                        }
                        final k p3 = k.p(i);
                        k0.m((Object)p3);
                        if (a < p3.A(nanoTime)) {
                            break;
                        }
                        i = k.p(i);
                    }
                    k.v(k, k.p(i));
                    k.v(i, k);
                    if (i == k.l()) {
                        k.class.notify();
                    }
                    final j2 a2 = j2.a;
                    return;
                }
                throw new IllegalStateException("Unbalanced enter/exit".toString());
            }
        }
        
        @f
        public final k c() throws InterruptedException {
            final k l = okio.k.l();
            k0.m((Object)l);
            final k p = okio.k.p(l);
            final k k = null;
            final long nanoTime = System.nanoTime();
            if (p == null) {
                k.class.wait(okio.k.m());
                final k i = okio.k.l();
                k0.m((Object)i);
                k j = k;
                if (okio.k.p(i) == null) {
                    j = k;
                    if (System.nanoTime() - nanoTime >= okio.k.n()) {
                        j = okio.k.l();
                    }
                }
                return j;
            }
            final long s = p.A(nanoTime);
            if (s > 0L) {
                final long timeoutMillis = s / 1000000L;
                k.class.wait(timeoutMillis, (int)(s - 1000000L * timeoutMillis));
                return null;
            }
            final k m = okio.k.l();
            k0.m((Object)m);
            okio.k.v(m, okio.k.p(p));
            okio.k.v(p, null);
            return p;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006" }, d2 = { "okio/k$b", "Ljava/lang/Thread;", "Lkotlin/j2;", "run", "<init>", "()V", "okio" }, k = 1, mv = { 1, 4, 1 })
    private static final class b extends Thread
    {
        public b() {
            super("Okio Watchdog");
            this.setDaemon(true);
        }
        
        @Override
        public void run() {
            while (true) {
                try {
                    while (true) {
                        synchronized (k.class) {
                            final k c = okio.k.m.c();
                            if (c == okio.k.l()) {
                                okio.k.t(null);
                                return;
                            }
                            final j2 a = j2.a;
                            // monitorexit(k.class)
                            if (c != null) {
                                c.D();
                                continue;
                            }
                            continue;
                        }
                    }
                }
                catch (InterruptedException ex) {
                    continue;
                }
                break;
            }
        }
    }
}
