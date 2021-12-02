// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.cache2;

import okio.t0;
import java.io.File;
import java.io.Closeable;
import kotlin.j2;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okio.r0;
import java.io.RandomAccessFile;
import okio.m;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import m6.d;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 *2\u00020\u0001:\u00026\nB5\b\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010&\u0012\b\u00101\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0004¢\u0006\u0004\bD\u0010EJ \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u000b\u001a\u00020\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\fR\"\u0010\u0015\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u000f\u0010 \"\u0004\b!\u0010\"R\u0013\u0010%\u001a\u00020\u001d8F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010 R$\u0010,\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)\"\u0004\b*\u0010+R$\u00101\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010-\u001a\u0004\b\u0016\u0010.\"\u0004\b/\u00100R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R$\u0010<\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0019\u0010>\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b=\u0010\u0019R\u0019\u0010B\u001a\u00020?8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010@\u001a\u0004\b2\u0010AR\u0019\u0010C\u001a\u00020?8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010@\u001a\u0004\b\u001e\u0010A¨\u0006F" }, d2 = { "Lokhttp3/internal/cache2/b;", "", "Lokio/p;", "prefix", "", "upstreamSize", "metadataSize", "Lkotlin/j2;", "u", "v", "b", "m", "Lokio/r0;", "n", "", "e", "I", "g", "()I", "q", "(I)V", "sourceCount", "h", "J", "j", "()J", "s", "(J)V", "upstreamPos", "", "c", "Z", "()Z", "o", "(Z)V", "complete", "l", "isClosed", "Ljava/io/RandomAccessFile;", "f", "Ljava/io/RandomAccessFile;", "()Ljava/io/RandomAccessFile;", "p", "(Ljava/io/RandomAccessFile;)V", "file", "Lokio/r0;", "()Lokio/r0;", "r", "(Lokio/r0;)V", "upstream", "i", "Lokio/p;", "metadata", "Ljava/lang/Thread;", "a", "Ljava/lang/Thread;", "k", "()Ljava/lang/Thread;", "t", "(Ljava/lang/Thread;)V", "upstreamReader", "d", "bufferMaxSize", "Lokio/m;", "Lokio/m;", "()Lokio/m;", "upstreamBuffer", "buffer", "<init>", "(Ljava/io/RandomAccessFile;Lokio/r0;JLokio/p;J)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    private static final int k = 1;
    private static final int l = 2;
    @d
    @e
    public static final p m;
    @d
    @e
    public static final p n;
    private static final long o = 32L;
    public static final a p;
    @f
    private Thread a;
    @e
    private final m b;
    private boolean c;
    @e
    private final m d;
    private int e;
    @f
    private RandomAccessFile f;
    @f
    private r0 g;
    private long h;
    private final p i;
    private final long j;
    
    static {
        p = new a(null);
        final p.a l = okio.p.L;
        m = l.l("OkHttp cache v1\n");
        n = l.l("OkHttp DIRTY :(\n");
    }
    
    private b(final RandomAccessFile f, final r0 g, final long h, final p i, final long j) {
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.b = new m();
        this.c = (this.g == null);
        this.d = new m();
    }
    
    private final void u(final p p3, final long n, final long n2) throws IOException {
        final m m = new m();
        m.p0(p3);
        m.Q0(n);
        m.Q0(n2);
        if (m.h0() == 32L) {
            final RandomAccessFile f = this.f;
            k0.m((Object)f);
            final FileChannel channel = f.getChannel();
            k0.o((Object)channel, "file!!.channel");
            new okhttp3.internal.cache2.a(channel).b(0L, m, 32L);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    private final void v(final long n) throws IOException {
        final m m = new m();
        m.p0(this.i);
        final RandomAccessFile f = this.f;
        k0.m((Object)f);
        final FileChannel channel = f.getChannel();
        k0.o((Object)channel, "file!!.channel");
        new okhttp3.internal.cache2.a(channel).b(32L + n, m, this.i.size());
    }
    
    public final void b(final long n) throws IOException {
        this.v(n);
        final RandomAccessFile f = this.f;
        k0.m((Object)f);
        f.getChannel().force(false);
        this.u(okhttp3.internal.cache2.b.m, n, this.i.size());
        final RandomAccessFile f2 = this.f;
        k0.m((Object)f2);
        f2.getChannel().force(false);
        synchronized (this) {
            this.c = true;
            final j2 a = j2.a;
            // monitorexit(this)
            final r0 g = this.g;
            if (g != null) {
                okhttp3.internal.d.l(g);
            }
            this.g = null;
        }
    }
    
    @e
    public final m c() {
        return this.d;
    }
    
    public final long d() {
        return this.j;
    }
    
    public final boolean e() {
        return this.c;
    }
    
    @f
    public final RandomAccessFile f() {
        return this.f;
    }
    
    public final int g() {
        return this.e;
    }
    
    @f
    public final r0 h() {
        return this.g;
    }
    
    @e
    public final m i() {
        return this.b;
    }
    
    public final long j() {
        return this.h;
    }
    
    @f
    public final Thread k() {
        return this.a;
    }
    
    public final boolean l() {
        return this.f == null;
    }
    
    @e
    public final p m() {
        return this.i;
    }
    
    @f
    public final r0 n() {
        synchronized (this) {
            if (this.f == null) {
                return null;
            }
            ++this.e;
            // monitorexit(this)
            return new b();
        }
    }
    
    public final void o(final boolean c) {
        this.c = c;
    }
    
    public final void p(@f final RandomAccessFile f) {
        this.f = f;
    }
    
    public final void q(final int e) {
        this.e = e;
    }
    
    public final void r(@f final r0 g) {
        this.g = g;
    }
    
    public final void s(final long h) {
        this.h = h;
    }
    
    public final void t(@f final Thread a) {
        this.a = a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\r\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018" }, d2 = { "okhttp3/internal/cache2/b$a", "", "Ljava/io/File;", "file", "Lokio/r0;", "upstream", "Lokio/p;", "metadata", "", "bufferMaxSize", "Lokhttp3/internal/cache2/b;", "a", "b", "FILE_HEADER_SIZE", "J", "PREFIX_CLEAN", "Lokio/p;", "PREFIX_DIRTY", "", "SOURCE_FILE", "I", "SOURCE_UPSTREAM", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final b a(@e final File file, @e final r0 r0, @e final p p4, final long n) throws IOException {
            k0.p((Object)file, "file");
            k0.p((Object)r0, "upstream");
            k0.p((Object)p4, "metadata");
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            final b b = new b(randomAccessFile, r0, 0L, p4, n, null);
            randomAccessFile.setLength(0L);
            b.u(okhttp3.internal.cache2.b.n, -1L, -1L);
            return b;
        }
        
        @e
        public final b b(@e final File file) throws IOException {
            k0.p((Object)file, "file");
            final RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
            final FileChannel channel = randomAccessFile.getChannel();
            k0.o((Object)channel, "randomAccessFile.channel");
            final okhttp3.internal.cache2.a a = new okhttp3.internal.cache2.a(channel);
            final m m = new m();
            a.a(0L, m, 32L);
            final p i = okhttp3.internal.cache2.b.m;
            if (!(k0.g((Object)m.E0(i.size()), (Object)i) ^ true)) {
                final long long1 = m.readLong();
                final long long2 = m.readLong();
                final m j = new m();
                a.a(long1 + 32L, j, long2);
                return new b(randomAccessFile, null, long1, j.D3(), 0L, null);
            }
            throw new IOException("unreadable cache file");
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016" }, d2 = { "okhttp3/internal/cache2/b$b", "Lokio/r0;", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "Lkotlin/j2;", "close", "G", "Lokio/t0;", "I", "J", "sourcePos", "Lokhttp3/internal/cache2/a;", "H", "Lokhttp3/internal/cache2/a;", "fileOperator", "<init>", "(Lokhttp3/internal/cache2/b;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class b implements r0
    {
        private final t0 G;
        private okhttp3.internal.cache2.a H;
        private long I;
        
        public b() {
            this.G = new t0();
            final RandomAccessFile f = okhttp3.internal.cache2.b.this.f();
            k0.m((Object)f);
            final FileChannel channel = f.getChannel();
            k0.o((Object)channel, "file!!.channel");
            this.H = new okhttp3.internal.cache2.a(channel);
        }
        
        @Override
        public void close() throws IOException {
            if (this.H == null) {
                return;
            }
            Closeable f = null;
            this.H = null;
            synchronized (okhttp3.internal.cache2.b.this) {
                final okhttp3.internal.cache2.b j = okhttp3.internal.cache2.b.this;
                j.q(j.g() - 1);
                if (okhttp3.internal.cache2.b.this.g() == 0) {
                    f = okhttp3.internal.cache2.b.this.f();
                    okhttp3.internal.cache2.b.this.p(null);
                }
                final j2 a = j2.a;
                // monitorexit(this.J)
                if (f != null) {
                    okhttp3.internal.d.l(f);
                }
            }
        }
        
        @Override
        public long read(@e m j, long a) throws IOException {
            k0.p((Object)j, "sink");
            final okhttp3.internal.cache2.a h = this.H;
            final int n = 1;
            if (h != null) {
                Object o = okhttp3.internal.cache2.b.this;
                synchronized (o) {
                    long n3;
                    while (true) {
                        while (this.I == okhttp3.internal.cache2.b.this.j()) {
                            if (okhttp3.internal.cache2.b.this.e()) {
                                return -1L;
                            }
                            if (okhttp3.internal.cache2.b.this.k() != null) {
                                this.G.k(okhttp3.internal.cache2.b.this);
                            }
                            else {
                                okhttp3.internal.cache2.b.this.t(Thread.currentThread());
                                final int n2 = n;
                                // monitorexit(o)
                                if (n2 == 2) {
                                    a = Math.min(a, okhttp3.internal.cache2.b.this.j() - this.I);
                                    o = this.H;
                                    k0.m(o);
                                    ((okhttp3.internal.cache2.a)o).a(this.I + 32L, j, a);
                                    this.I += a;
                                    return a;
                                }
                                try {
                                    final r0 h2 = okhttp3.internal.cache2.b.this.h();
                                    k0.m((Object)h2);
                                    final long read = h2.read(okhttp3.internal.cache2.b.this.i(), okhttp3.internal.cache2.b.this.d());
                                    if (read == -1L) {
                                        final okhttp3.internal.cache2.b i = okhttp3.internal.cache2.b.this;
                                        i.b(i.j());
                                        synchronized (okhttp3.internal.cache2.b.this) {
                                            okhttp3.internal.cache2.b.this.t(null);
                                            final okhttp3.internal.cache2.b k = okhttp3.internal.cache2.b.this;
                                            if (k != null) {
                                                k.notifyAll();
                                                final j2 a2 = j2.a;
                                                return -1L;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                    a = Math.min(read, a);
                                    okhttp3.internal.cache2.b.this.i().s(j, 0L, a);
                                    this.I += a;
                                    final okhttp3.internal.cache2.a h3 = this.H;
                                    k0.m((Object)h3);
                                    h3.b(okhttp3.internal.cache2.b.this.j() + 32L, okhttp3.internal.cache2.b.this.i().d(), read);
                                    synchronized (okhttp3.internal.cache2.b.this) {
                                        okhttp3.internal.cache2.b.this.c().t3(okhttp3.internal.cache2.b.this.i(), read);
                                        if (okhttp3.internal.cache2.b.this.c().h0() > okhttp3.internal.cache2.b.this.d()) {
                                            okhttp3.internal.cache2.b.this.c().skip(okhttp3.internal.cache2.b.this.c().h0() - okhttp3.internal.cache2.b.this.d());
                                        }
                                        final okhttp3.internal.cache2.b l = okhttp3.internal.cache2.b.this;
                                        l.s(l.j() + read);
                                        final j2 a3 = j2.a;
                                        // monitorexit(this.J)
                                        j = (m)okhttp3.internal.cache2.b.this;
                                        synchronized (okhttp3.internal.cache2.b.this) {
                                            okhttp3.internal.cache2.b.this.t(null);
                                            final okhttp3.internal.cache2.b m = okhttp3.internal.cache2.b.this;
                                            if (m != null) {
                                                m.notifyAll();
                                                return a;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                    }
                                }
                                finally {
                                    synchronized (okhttp3.internal.cache2.b.this) {
                                        okhttp3.internal.cache2.b.this.t(null);
                                        final okhttp3.internal.cache2.b j2 = okhttp3.internal.cache2.b.this;
                                        if (j2 == null) {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                        }
                                        j2.notifyAll();
                                        final j2 a4 = kotlin.j2.a;
                                    }
                                    // monitorexit(this.J)
                                }
                            }
                        }
                        n3 = okhttp3.internal.cache2.b.this.j() - okhttp3.internal.cache2.b.this.c().h0();
                        if (this.I < n3) {
                            final int n2 = 2;
                            continue;
                        }
                        break;
                    }
                    a = Math.min(a, okhttp3.internal.cache2.b.this.j() - this.I);
                    okhttp3.internal.cache2.b.this.c().s(j, this.I - n3, a);
                    this.I += a;
                    return a;
                }
            }
            throw new IllegalStateException("Check failed.".toString());
        }
        
        @e
        @Override
        public t0 timeout() {
            return this.G;
        }
    }
}
