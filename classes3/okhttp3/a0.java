// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.concurrent.TimeUnit;
import okio.t0;
import org.jetbrains.annotations.f;
import okio.r0;
import okio.d0;
import okhttp3.internal.http1.a;
import m6.g;
import okio.m;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okio.o;
import okio.p;
import org.jetbrains.annotations.e;
import okio.g0;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 +2\u00020\u0001:\u0003,-.B\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a\u0012\u0006\u0010#\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b&\u0010*J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0010\u001a\b\u0018\u00010\rR\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u00020\u001e8\u0007@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\u0018¨\u0006/" }, d2 = { "Lokhttp3/a0;", "Ljava/io/Closeable;", "", "maxResult", "g", "Lokhttp3/a0$b;", "h", "Lkotlin/j2;", "close", "Lokio/p;", "H", "Lokio/p;", "crlfDashDashBoundary", "Lokhttp3/a0$c;", "L", "Lokhttp3/a0$c;", "currentPart", "", "I", "partCount", "G", "dashDashBoundary", "", "J", "Z", "closed", "Lokio/o;", "M", "Lokio/o;", "source", "", "N", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "boundary", "K", "noMoreParts", "<init>", "(Lokio/o;Ljava/lang/String;)V", "Lokhttp3/h0;", "response", "(Lokhttp3/h0;)V", "P", "a", "b", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a0 implements Closeable
{
    @e
    private static final g0 O;
    public static final a P;
    private final p G;
    private final p H;
    private int I;
    private boolean J;
    private boolean K;
    private c L;
    private final o M;
    @e
    private final String N;
    
    static {
        P = new a(null);
        final g0.a j = g0.J;
        final p.a l = p.L;
        O = j.d(l.l("\r\n"), l.l("--"), l.l(" "), l.l("\t"));
    }
    
    public a0(@e final h0 h0) throws IOException {
        k0.p((Object)h0, "response");
        final o source = h0.source();
        final y contentType = h0.contentType();
        if (contentType != null) {
            final String i = contentType.i("boundary");
            if (i != null) {
                this(source, i);
                return;
            }
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }
    
    public a0(@e final o m, @e final String n) throws IOException {
        k0.p((Object)m, "source");
        k0.p((Object)n, "boundary");
        this.M = m;
        this.N = n;
        this.G = new m().p1("--").p1(n).D3();
        this.H = new m().p1("\r\n--").p1(n).D3();
    }
    
    public static final /* synthetic */ g0 b() {
        return a0.O;
    }
    
    public static final /* synthetic */ c c(final a0 a0) {
        return a0.L;
    }
    
    public static final /* synthetic */ o d(final a0 a0) {
        return a0.M;
    }
    
    public static final /* synthetic */ void e(final a0 a0, final c l) {
        a0.L = l;
    }
    
    private final long g(final long a) {
        this.M.B5(this.H.size());
        long y1;
        if ((y1 = this.M.z().y1(this.H)) == -1L) {
            y1 = this.M.z().h0() - this.H.size() + 1L;
        }
        return Math.min(a, y1);
    }
    
    @Override
    public void close() throws IOException {
        if (this.J) {
            return;
        }
        this.J = true;
        this.L = null;
        this.M.close();
    }
    
    @g(name = "boundary")
    @e
    public final String f() {
        return this.N;
    }
    
    @f
    public final b h() throws IOException {
        if (!(this.J ^ true)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.K) {
            return null;
        }
        o o;
        p p;
        if (this.I == 0 && this.M.Y2(0L, this.G)) {
            o = this.M;
            p = this.G;
        }
        else {
            while (true) {
                final long g = this.g(8192L);
                if (g == 0L) {
                    break;
                }
                this.M.skip(g);
            }
            o = this.M;
            p = this.H;
        }
        o.skip(p.size());
        boolean b = false;
        while (true) {
            final int p2 = this.M.P5(a0.O);
            if (p2 == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (p2 == 0) {
                ++this.I;
                final v b2 = new okhttp3.internal.http1.a(this.M).b();
                final c l = new c();
                this.L = l;
                return new b(b2, d0.d(l));
            }
            if (p2 != 1) {
                if (p2 != 2 && p2 != 3) {
                    continue;
                }
                b = true;
            }
            else {
                if (b) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.I != 0) {
                    this.K = true;
                    return null;
                }
                throw new ProtocolException("expected at least 1 part");
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "okhttp3/a0$a", "", "Lokio/g0;", "afterBoundaryOptions", "Lokio/g0;", "a", "()Lokio/g0;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final g0 a() {
            return a0.b();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0019\u0010\t\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\u000f\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012" }, d2 = { "okhttp3/a0$b", "Ljava/io/Closeable;", "Lkotlin/j2;", "close", "Lokhttp3/v;", "G", "Lokhttp3/v;", "b", "()Lokhttp3/v;", "headers", "Lokio/o;", "H", "Lokio/o;", "a", "()Lokio/o;", "body", "<init>", "(Lokhttp3/v;Lokio/o;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b implements Closeable
    {
        @e
        private final v G;
        @e
        private final o H;
        
        public b(@e final v g, @e final o h) {
            k0.p((Object)g, "headers");
            k0.p((Object)h, "body");
            this.G = g;
            this.H = h;
        }
        
        @g(name = "body")
        @e
        public final o a() {
            return this.H;
        }
        
        @g(name = "headers")
        @e
        public final v b() {
            return this.G;
        }
        
        @Override
        public void close() {
            this.H.close();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "okhttp3/a0$c", "Lokio/r0;", "Lkotlin/j2;", "close", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "G", "Lokio/t0;", "<init>", "(Lokhttp3/a0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    private final class c implements r0
    {
        private final t0 G;
        
        public c() {
            this.G = new t0();
        }
        
        @Override
        public void close() {
            if (k0.g((Object)a0.c(a0.this), (Object)this)) {
                a0.e(a0.this, null);
            }
        }
        
        @Override
        public long read(@e final m m, long lng) {
            k0.p((Object)m, "sink");
            if (lng >= 0L) {
                if (k0.g((Object)a0.c(a0.this), (Object)this)) {
                    final t0 timeout = a0.d(a0.this).timeout();
                    final t0 g = this.G;
                    final long j = timeout.j();
                    final long a = t0.e.a(g.j(), timeout.j());
                    final TimeUnit nanoseconds = TimeUnit.NANOSECONDS;
                    timeout.i(a, nanoseconds);
                    if (timeout.f()) {
                        final long d = timeout.d();
                        if (g.f()) {
                            timeout.e(Math.min(timeout.d(), g.d()));
                        }
                        try {
                            lng = a0.this.g(lng);
                            if (lng == 0L) {
                                lng = -1L;
                            }
                            else {
                                lng = a0.d(a0.this).read(m, lng);
                            }
                            timeout.i(j, nanoseconds);
                            if (g.f()) {
                                timeout.e(d);
                            }
                            return lng;
                        }
                        finally {
                            timeout.i(j, TimeUnit.NANOSECONDS);
                            if (g.f()) {
                                timeout.e(d);
                            }
                        }
                    }
                    if (g.f()) {
                        timeout.e(g.d());
                    }
                    try {
                        lng = a0.this.g(lng);
                        if (lng == 0L) {
                            lng = -1L;
                        }
                        else {
                            lng = a0.d(a0.this).read(m, lng);
                        }
                        timeout.i(j, nanoseconds);
                        if (g.f()) {
                            timeout.a();
                        }
                        return lng;
                    }
                    finally {
                        timeout.i(j, TimeUnit.NANOSECONDS);
                        if (g.f()) {
                            timeout.a();
                        }
                    }
                }
                throw new IllegalStateException("closed".toString());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(lng);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        @Override
        public t0 timeout() {
            return this.G;
        }
    }
}
