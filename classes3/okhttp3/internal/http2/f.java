// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import java.util.Collection;
import okio.p;
import okio.d0;
import okio.n;
import okio.o;
import java.io.InterruptedIOException;
import okhttp3.v;
import java.util.List;
import java.io.IOException;
import okhttp3.internal.concurrent.a;
import java.util.concurrent.TimeUnit;
import java.util.LinkedHashSet;
import kotlin.j2;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.Set;
import java.net.Socket;
import okhttp3.internal.concurrent.c;
import okhttp3.internal.concurrent.d;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 F2\u00020\u0001:\u0007«\u0001¬\u0001\u00ad\u0001\fB\u0015\b\u0000\u0012\b\u0010¨\u0001\u001a\u00030§\u0001¢\u0006\u0006\b©\u0001\u0010ª\u0001J&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u0002J\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u001a\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007J-\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\"\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010!\u001a\u00020\u0015J\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\b%\u0010&J\u001f\u0010(\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010'\u001a\u00020#H\u0000¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u0015H\u0000¢\u0006\u0004\b*\u0010+J\u001e\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020\u0002J\u0006\u00100\u001a\u00020\rJ\u0006\u00101\u001a\u00020\rJ\u0006\u00102\u001a\u00020\rJ\u0006\u00103\u001a\u00020\rJ\u000e\u00104\u001a\u00020\r2\u0006\u0010'\u001a\u00020#J\b\u00105\u001a\u00020\rH\u0016J)\u00109\u001a\u00020\r2\u0006\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020#2\b\u00108\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u001c\u0010>\u001a\u00020\r2\b\b\u0002\u0010;\u001a\u00020\u00072\b\b\u0002\u0010=\u001a\u00020<H\u0007J\u000e\u0010A\u001a\u00020\r2\u0006\u0010@\u001a\u00020?J\u000e\u0010C\u001a\u00020\u00072\u0006\u0010B\u001a\u00020\u0015J\u000f\u0010D\u001a\u00020\rH\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\bF\u0010GJ%\u0010H\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bH\u0010IJ-\u0010K\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010N\u001a\u00020M2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0007H\u0000¢\u0006\u0004\bO\u0010PJ\u001f\u0010Q\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0000¢\u0006\u0004\bQ\u0010&R\"\u0010W\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010]\u001a\u00020X8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R$\u0010b\u001a\u00020\u00152\u0006\u0010^\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010Y\u001a\u0004\b`\u0010aR\u001c\u0010g\u001a\u00020c8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010d\u001a\u0004\be\u0010fR\u0016\u0010i\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010YR\u0016\u0010j\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010YR\u0019\u0010o\u001a\u00020k8\u0006@\u0006¢\u0006\f\n\u0004\bO\u0010l\u001a\u0004\bm\u0010nR\u0016\u0010p\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010YR\u001d\u0010u\u001a\u00060qR\u00020\u00008\u0006@\u0006¢\u0006\f\n\u0004\bK\u0010r\u001a\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010YR(\u0010|\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0x8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bh\u0010{R$\u0010\u0081\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b}\u0010y\u001a\u0004\bY\u0010~\"\u0005\b\u007f\u0010\u0080\u0001R\u0017\u0010=\u001a\u00020<8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0082\u0001R\u001f\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00020\u00020\u0083\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u0084\u0001R \u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0000@\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b[\u0010\u0087\u0001\u001a\u0005\b}\u0010\u0088\u0001R&\u0010\u008b\u0001\u001a\u00020\u00152\u0006\u0010^\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\r\n\u0004\b\n\u0010Y\u001a\u0005\b\u008a\u0001\u0010aR'\u0010\u008e\u0001\u001a\u00020\u00152\u0006\u0010^\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010Y\u001a\u0005\b\u008d\u0001\u0010aR'\u0010\u0091\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u008f\u0001\u0010y\u001a\u0005\b\u008f\u0001\u0010~\"\u0006\b\u0090\u0001\u0010\u0080\u0001R\u001a\u0010\u0094\u0001\u001a\u00030\u0092\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u0093\u0001R \u0010\u0097\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u0095\u0001\u0010m\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010YR\u001a\u0010\u009e\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009a\u0001R\u0019\u0010\u009f\u0001\u001a\u00030\u0098\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010\u009a\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0001\u0010YR\u001b\u0010£\u0001\u001a\u00020?8\u0006@\u0006¢\u0006\r\n\u0004\bm\u0010R\u001a\u0005\b¢\u0001\u0010TR\u0017\u0010¤\u0001\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010YR%\u0010¥\u0001\u001a\u00020\u00152\u0006\u0010^\u001a\u00020\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010Y\u001a\u0004\bv\u0010aR\u0018\u0010¦\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¢\u0001\u0010m¨\u0006®\u0001" }, d2 = { "Lokhttp3/internal/http2/f;", "Ljava/io/Closeable;", "", "associatedStreamId", "", "Lokhttp3/internal/http2/c;", "requestHeaders", "", "out", "Lokhttp3/internal/http2/i;", "d0", "Ljava/io/IOException;", "e", "Lkotlin/j2;", "F", "f0", "id", "V", "streamId", "s0", "(I)Lokhttp3/internal/http2/i;", "", "read", "Z0", "(J)V", "m0", "e0", "outFinished", "alternating", "d1", "(IZLjava/util/List;)V", "Lokio/m;", "buffer", "byteCount", "a1", "Lokhttp3/internal/http2/b;", "errorCode", "o1", "(ILokhttp3/internal/http2/b;)V", "statusCode", "k1", "unacknowledgedBytesRead", "p1", "(IJ)V", "reply", "payload1", "payload2", "f1", "g1", "e1", "C", "flush", "L0", "close", "connectionCode", "streamCode", "cause", "D", "(Lokhttp3/internal/http2/b;Lokhttp3/internal/http2/b;Ljava/io/IOException;)V", "sendConnectionPreface", "Lokhttp3/internal/concurrent/d;", "taskRunner", "Q0", "Lokhttp3/internal/http2/m;", "settings", "H0", "nowNs", "a0", "w0", "()V", "p0", "(I)Z", "i0", "(ILjava/util/List;)V", "inFinished", "h0", "(ILjava/util/List;Z)V", "Lokio/o;", "source", "g0", "(ILokio/o;IZ)V", "j0", "Lokhttp3/internal/http2/m;", "N", "()Lokhttp3/internal/http2/m;", "G0", "(Lokhttp3/internal/http2/m;)V", "peerSettings", "", "J", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "connectionName", "<set-?>", "c0", "Q", "()J", "readBytesAcknowledged", "Ljava/net/Socket;", "Ljava/net/Socket;", "T", "()Ljava/net/Socket;", "socket", "W", "awaitPingsSent", "intervalPongsReceived", "Lokhttp3/internal/http2/j;", "Lokhttp3/internal/http2/j;", "Z", "()Lokhttp3/internal/http2/j;", "writer", "degradedPongsReceived", "Lokhttp3/internal/http2/f$e;", "Lokhttp3/internal/http2/f$e;", "S", "()Lokhttp3/internal/http2/f$e;", "readerRunnable", "X", "awaitPongsReceived", "", "I", "Ljava/util/Map;", "()Ljava/util/Map;", "streams", "K", "()I", "y0", "(I)V", "lastGoodStreamId", "Lokhttp3/internal/concurrent/d;", "", "Ljava/util/Set;", "currentPushRequests", "Lokhttp3/internal/http2/f$d;", "Lokhttp3/internal/http2/f$d;", "()Lokhttp3/internal/http2/f$d;", "listener", "Y", "writeBytesTotal", "b0", "R", "readBytesTotal", "L", "D0", "nextStreamId", "Lokhttp3/internal/http2/l;", "Lokhttp3/internal/http2/l;", "pushObserver", "G", "()Z", "client", "Lokhttp3/internal/concurrent/c;", "P", "Lokhttp3/internal/concurrent/c;", "pushQueue", "degradedPongDeadlineNs", "O", "writerQueue", "settingsListenerQueue", "U", "degradedPingsSent", "M", "okHttpSettings", "intervalPingsSent", "writeBytesMaximum", "isShutdown", "Lokhttp3/internal/http2/f$b;", "builder", "<init>", "(Lokhttp3/internal/http2/f$b;)V", "b", "c", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class f implements Closeable
{
    public static final int j0 = 16777216;
    @org.jetbrains.annotations.e
    private static final m k0;
    public static final int l0 = 1;
    public static final int m0 = 2;
    public static final int n0 = 3;
    public static final int o0 = 1000000000;
    public static final c p0;
    private final boolean G;
    @org.jetbrains.annotations.e
    private final d H;
    @org.jetbrains.annotations.e
    private final Map<Integer, i> I;
    @org.jetbrains.annotations.e
    private final String J;
    private int K;
    private int L;
    private boolean M;
    private final okhttp3.internal.concurrent.d N;
    private final okhttp3.internal.concurrent.c O;
    private final okhttp3.internal.concurrent.c P;
    private final okhttp3.internal.concurrent.c Q;
    private final l R;
    private long S;
    private long T;
    private long U;
    private long V;
    private long W;
    private long X;
    private long Y;
    @org.jetbrains.annotations.e
    private final m Z;
    @org.jetbrains.annotations.e
    private m a0;
    private long b0;
    private long c0;
    private long d0;
    private long e0;
    @org.jetbrains.annotations.e
    private final Socket f0;
    @org.jetbrains.annotations.e
    private final j g0;
    @org.jetbrains.annotations.e
    private final e h0;
    private final Set<Integer> i0;
    
    static {
        p0 = new c(null);
        final m k = new m();
        k.k(7, 65535);
        k.k(5, 16384);
        k0 = k;
    }
    
    public f(@org.jetbrains.annotations.e final b b) {
        kotlin.jvm.internal.k0.p((Object)b, "builder");
        final boolean b2 = b.b();
        this.G = b2;
        this.H = b.d();
        this.I = new LinkedHashMap<Integer, i>();
        final String c = b.c();
        this.J = c;
        int l;
        if (b.b()) {
            l = 3;
        }
        else {
            l = 2;
        }
        this.L = l;
        final okhttp3.internal.concurrent.d j = b.j();
        this.N = j;
        final okhttp3.internal.concurrent.c i = j.j();
        this.O = i;
        this.P = j.j();
        this.Q = j.j();
        this.R = b.f();
        final m z = new m();
        if (b.b()) {
            z.k(7, 16777216);
        }
        final j2 a = j2.a;
        this.Z = z;
        final m k0 = f.k0;
        this.a0 = k0;
        this.e0 = k0.e();
        this.f0 = b.h();
        this.g0 = new j(b.g(), b2);
        this.h0 = new e(new h(b.i(), b2));
        this.i0 = new LinkedHashSet<Integer>();
        if (b.e() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(b.e());
            final StringBuilder sb = new StringBuilder();
            sb.append(c);
            sb.append(" ping");
            final String string = sb.toString();
            i.n(new a() {
                final /* synthetic */ f f;
                
                @Override
                public long f() {
                    f f = this.f;
                    synchronized (f) {
                        boolean b;
                        if (okhttp3.internal.http2.f.g(this.f) < okhttp3.internal.http2.f.f(this.f)) {
                            b = true;
                        }
                        else {
                            final f f2 = this.f;
                            okhttp3.internal.http2.f.t(f2, okhttp3.internal.http2.f.f(f2) + 1L);
                            b = false;
                        }
                        // monitorexit(f)
                        f = this.f;
                        long g;
                        if (b) {
                            f.F(null);
                            g = -1L;
                        }
                        else {
                            f.f1(false, 1, 0);
                            g = nanos;
                        }
                        return g;
                    }
                }
            }, nanos);
        }
    }
    
    private final void F(final IOException ex) {
        final okhttp3.internal.http2.b i = okhttp3.internal.http2.b.I;
        this.D(i, i, ex);
    }
    
    public static /* synthetic */ void W0(final f f, boolean b, okhttp3.internal.concurrent.d h, final int n, final Object o) throws IOException {
        if ((n & 0x1) != 0x0) {
            b = true;
        }
        if ((n & 0x2) != 0x0) {
            h = okhttp3.internal.concurrent.d.h;
        }
        f.Q0(b, h);
    }
    
    public static final /* synthetic */ long b(final f f) {
        return f.X;
    }
    
    public static final /* synthetic */ Set c(final f f) {
        return f.i0;
    }
    
    public static final /* synthetic */ m d() {
        return f.k0;
    }
    
    private final i d0(final int n, final List<okhttp3.internal.http2.c> list, final boolean b) throws IOException {
        final boolean b2 = b ^ true;
        synchronized (this.g0) {
            synchronized (this) {
                if (this.L > 1073741823) {
                    this.L0(b.O);
                }
                if (!this.M) {
                    final int l = this.L;
                    this.L = l + 2;
                    final i i = new i(l, this, b2, false, null);
                    final boolean b3 = !b || this.d0 >= this.e0 || i.t() >= i.s();
                    if (i.w()) {
                        this.I.put(l, i);
                    }
                    final j2 a = j2.a;
                    // monitorexit(this)
                    if (n == 0) {
                        this.g0.h(b2, l, list);
                    }
                    else {
                        if (!(true ^ this.G)) {
                            throw new IllegalArgumentException("client streams shouldn't have associated stream IDs".toString());
                        }
                        this.g0.n(n, l, list);
                    }
                    // monitorexit(this.g0)
                    if (b3) {
                        this.g0.flush();
                    }
                    return i;
                }
                throw new okhttp3.internal.http2.a();
            }
        }
    }
    
    public static final /* synthetic */ long e(final f f) {
        return f.V;
    }
    
    public static final /* synthetic */ long f(final f f) {
        return f.S;
    }
    
    public static final /* synthetic */ long g(final f f) {
        return f.T;
    }
    
    public static final /* synthetic */ l h(final f f) {
        return f.R;
    }
    
    public static final /* synthetic */ okhttp3.internal.concurrent.d k(final f f) {
        return f.N;
    }
    
    public static final /* synthetic */ okhttp3.internal.concurrent.c o(final f f) {
        return f.O;
    }
    
    public static final /* synthetic */ boolean q(final f f) {
        return f.M;
    }
    
    public static final /* synthetic */ void r(final f f, final long x) {
        f.X = x;
    }
    
    public static final /* synthetic */ void s(final f f, final long v) {
        f.V = v;
    }
    
    public static final /* synthetic */ void t(final f f, final long s) {
        f.S = s;
    }
    
    public static final /* synthetic */ void w(final f f, final long t) {
        f.T = t;
    }
    
    public static final /* synthetic */ void x(final f f, final boolean m) {
        f.M = m;
    }
    
    public static final /* synthetic */ void y(final f f, final long e0) {
        f.e0 = e0;
    }
    
    public final void C() throws InterruptedException {
        synchronized (this) {
            while (this.X < this.W) {
                this.wait();
            }
        }
    }
    
    public final void D(@org.jetbrains.annotations.e final okhttp3.internal.http2.b p0, @org.jetbrains.annotations.e final okhttp3.internal.http2.b p1, @org.jetbrains.annotations.f final IOException p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "connectionCode"
        //     4: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2        
        //     8: ldc_w           "streamCode"
        //    11: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: getstatic       okhttp3/internal/d.h:Z
        //    17: ifeq            92
        //    20: aload_0        
        //    21: invokestatic    java/lang/Thread.holdsLock:(Ljava/lang/Object;)Z
        //    24: ifne            30
        //    27: goto            92
        //    30: new             Ljava/lang/StringBuilder;
        //    33: dup            
        //    34: invokespecial   java/lang/StringBuilder.<init>:()V
        //    37: astore_1       
        //    38: aload_1        
        //    39: ldc_w           "Thread "
        //    42: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    45: pop            
        //    46: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    49: astore_2       
        //    50: aload_2        
        //    51: ldc_w           "Thread.currentThread()"
        //    54: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //    57: aload_1        
        //    58: aload_2        
        //    59: invokevirtual   java/lang/Thread.getName:()Ljava/lang/String;
        //    62: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    65: pop            
        //    66: aload_1        
        //    67: ldc_w           " MUST NOT hold lock on "
        //    70: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    73: pop            
        //    74: aload_1        
        //    75: aload_0        
        //    76: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //    79: pop            
        //    80: new             Ljava/lang/AssertionError;
        //    83: dup            
        //    84: aload_1        
        //    85: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    88: invokespecial   java/lang/AssertionError.<init>:(Ljava/lang/Object;)V
        //    91: athrow         
        //    92: aload_0        
        //    93: aload_1        
        //    94: invokevirtual   okhttp3/internal/http2/f.L0:(Lokhttp3/internal/http2/b;)V
        //    97: aconst_null    
        //    98: astore_1       
        //    99: aload_0        
        //   100: monitorenter   
        //   101: aload_0        
        //   102: getfield        okhttp3/internal/http2/f.I:Ljava/util/Map;
        //   105: invokeinterface java/util/Map.isEmpty:()Z
        //   110: istore          4
        //   112: iconst_0       
        //   113: istore          5
        //   115: iload           4
        //   117: iconst_1       
        //   118: ixor           
        //   119: ifeq            175
        //   122: aload_0        
        //   123: getfield        okhttp3/internal/http2/f.I:Ljava/util/Map;
        //   126: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   131: iconst_0       
        //   132: anewarray       Lokhttp3/internal/http2/i;
        //   135: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   140: astore_1       
        //   141: aload_1        
        //   142: ifnull          162
        //   145: aload_1        
        //   146: checkcast       [Lokhttp3/internal/http2/i;
        //   149: astore_1       
        //   150: aload_0        
        //   151: getfield        okhttp3/internal/http2/f.I:Ljava/util/Map;
        //   154: invokeinterface java/util/Map.clear:()V
        //   159: goto            175
        //   162: new             Ljava/lang/NullPointerException;
        //   165: astore_1       
        //   166: aload_1        
        //   167: ldc_w           "null cannot be cast to non-null type kotlin.Array<T>"
        //   170: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   173: aload_1        
        //   174: athrow         
        //   175: getstatic       kotlin/j2.a:Lkotlin/j2;
        //   178: astore          6
        //   180: aload_0        
        //   181: monitorexit    
        //   182: aload_1        
        //   183: ifnull          216
        //   186: aload_1        
        //   187: arraylength    
        //   188: istore          7
        //   190: iload           5
        //   192: iload           7
        //   194: if_icmpge       216
        //   197: aload_1        
        //   198: iload           5
        //   200: aaload         
        //   201: astore          6
        //   203: aload           6
        //   205: aload_2        
        //   206: aload_3        
        //   207: invokevirtual   okhttp3/internal/http2/i.d:(Lokhttp3/internal/http2/b;Ljava/io/IOException;)V
        //   210: iinc            5, 1
        //   213: goto            190
        //   216: aload_0        
        //   217: getfield        okhttp3/internal/http2/f.g0:Lokhttp3/internal/http2/j;
        //   220: invokevirtual   okhttp3/internal/http2/j.close:()V
        //   223: aload_0        
        //   224: getfield        okhttp3/internal/http2/f.f0:Ljava/net/Socket;
        //   227: invokevirtual   java/net/Socket.close:()V
        //   230: aload_0        
        //   231: getfield        okhttp3/internal/http2/f.O:Lokhttp3/internal/concurrent/c;
        //   234: invokevirtual   okhttp3/internal/concurrent/c.u:()V
        //   237: aload_0        
        //   238: getfield        okhttp3/internal/http2/f.P:Lokhttp3/internal/concurrent/c;
        //   241: invokevirtual   okhttp3/internal/concurrent/c.u:()V
        //   244: aload_0        
        //   245: getfield        okhttp3/internal/http2/f.Q:Lokhttp3/internal/concurrent/c;
        //   248: invokevirtual   okhttp3/internal/concurrent/c.u:()V
        //   251: return         
        //   252: astore_1       
        //   253: aload_0        
        //   254: monitorexit    
        //   255: aload_1        
        //   256: athrow         
        //   257: astore_1       
        //   258: goto            97
        //   261: astore          6
        //   263: goto            210
        //   266: astore_1       
        //   267: goto            223
        //   270: astore_1       
        //   271: goto            230
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  92     97     257    261    Ljava/io/IOException;
        //  101    112    252    257    Any
        //  122    141    252    257    Any
        //  145    159    252    257    Any
        //  162    175    252    257    Any
        //  175    180    252    257    Any
        //  203    210    261    266    Ljava/io/IOException;
        //  216    223    266    270    Ljava/io/IOException;
        //  223    230    270    274    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void D0(final int l) {
        this.L = l;
    }
    
    public final boolean G() {
        return this.G;
    }
    
    public final void G0(@org.jetbrains.annotations.e final m a0) {
        kotlin.jvm.internal.k0.p((Object)a0, "<set-?>");
        this.a0 = a0;
    }
    
    @org.jetbrains.annotations.e
    public final String H() {
        return this.J;
    }
    
    public final void H0(@org.jetbrains.annotations.e final m m) throws IOException {
        kotlin.jvm.internal.k0.p((Object)m, "settings");
        synchronized (this.g0) {
            synchronized (this) {
                if (!this.M) {
                    this.Z.j(m);
                    final j2 a = j2.a;
                    // monitorexit(this)
                    this.g0.q(m);
                    return;
                }
                throw new okhttp3.internal.http2.a();
            }
        }
    }
    
    public final int J() {
        return this.K;
    }
    
    @org.jetbrains.annotations.e
    public final d K() {
        return this.H;
    }
    
    public final int L() {
        return this.L;
    }
    
    public final void L0(@org.jetbrains.annotations.e final okhttp3.internal.http2.b b) throws IOException {
        kotlin.jvm.internal.k0.p((Object)b, "statusCode");
        synchronized (this.g0) {
            synchronized (this) {
                if (this.M) {
                    return;
                }
                this.M = true;
                final int k = this.K;
                final j2 a = j2.a;
                // monitorexit(this)
                this.g0.g(k, b, okhttp3.internal.d.a);
            }
        }
    }
    
    @org.jetbrains.annotations.e
    public final m M() {
        return this.Z;
    }
    
    @m6.h
    public final void M0() throws IOException {
        W0(this, false, null, 3, null);
    }
    
    @org.jetbrains.annotations.e
    public final m N() {
        return this.a0;
    }
    
    @m6.h
    public final void N0(final boolean b) throws IOException {
        W0(this, b, null, 2, null);
    }
    
    public final long Q() {
        return this.c0;
    }
    
    @m6.h
    public final void Q0(final boolean b, @org.jetbrains.annotations.e final okhttp3.internal.concurrent.d d) throws IOException {
        kotlin.jvm.internal.k0.p((Object)d, "taskRunner");
        if (b) {
            this.g0.b();
            this.g0.q(this.Z);
            final int e = this.Z.e();
            if (e != 65535) {
                this.g0.r(0, e - 65535);
            }
        }
        final okhttp3.internal.concurrent.c j = d.j();
        final String i = this.J;
        j.n(new a(i) {
            final /* synthetic */ n6.a e = this.h0;
            
            @Override
            public long f() {
                this.e.invoke();
                return -1L;
            }
        }, 0L);
    }
    
    public final long R() {
        return this.b0;
    }
    
    @org.jetbrains.annotations.e
    public final e S() {
        return this.h0;
    }
    
    @org.jetbrains.annotations.e
    public final Socket T() {
        return this.f0;
    }
    
    @org.jetbrains.annotations.f
    public final i V(final int i) {
        synchronized (this) {
            return this.I.get(i);
        }
    }
    
    @org.jetbrains.annotations.e
    public final Map<Integer, i> W() {
        return this.I;
    }
    
    public final long X() {
        return this.e0;
    }
    
    public final long Y() {
        return this.d0;
    }
    
    @org.jetbrains.annotations.e
    public final j Z() {
        return this.g0;
    }
    
    public final void Z0(long b0) {
        synchronized (this) {
            b0 += this.b0;
            this.b0 = b0;
            b0 -= this.c0;
            if (b0 >= this.Z.e() / 2) {
                this.p1(0, b0);
                this.c0 += b0;
            }
        }
    }
    
    public final boolean a0(final long n) {
        synchronized (this) {
            return !this.M && (this.V >= this.U || n < this.Y);
        }
    }
    
    public final void a1(final int i, final boolean b, @org.jetbrains.annotations.f final okio.m m, long d0) throws IOException {
        long a = d0;
        if (d0 == 0L) {
            this.g0.c(b, i, m, 0);
            return;
        }
    Label_0023:
        while (a > 0L) {
            // monitorenter(this)
            try {
                try {
                    while (true) {
                        d0 = this.d0;
                        final long e0 = this.e0;
                        if (d0 < e0) {
                            final int min = Math.min((int)Math.min(a, e0 - d0), this.g0.j());
                            final long d2 = this.d0;
                            d0 = min;
                            this.d0 = d2 + d0;
                            final j2 a2 = j2.a;
                            // monitorexit(this)
                            a -= d0;
                            this.g0.c(b && a == 0L, i, m, min);
                            continue Label_0023;
                        }
                        if (!this.I.containsKey(i)) {
                            throw new IOException("stream closed");
                        }
                        this.wait();
                    }
                }
                finally {}
            }
            catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        }
        // monitorexit(this)
    }
    
    @Override
    public void close() {
        this.D(okhttp3.internal.http2.b.H, okhttp3.internal.http2.b.P, null);
    }
    
    public final void d1(final int n, final boolean b, @org.jetbrains.annotations.e final List<okhttp3.internal.http2.c> list) throws IOException {
        kotlin.jvm.internal.k0.p((Object)list, "alternating");
        this.g0.h(b, n, list);
    }
    
    @org.jetbrains.annotations.e
    public final i e0(@org.jetbrains.annotations.e final List<okhttp3.internal.http2.c> list, final boolean b) throws IOException {
        kotlin.jvm.internal.k0.p((Object)list, "requestHeaders");
        return this.d0(0, list, b);
    }
    
    public final void e1() throws InterruptedException {
        synchronized (this) {
            ++this.W;
            // monitorexit(this)
            this.f1(false, 3, 1330343787);
        }
    }
    
    public final int f0() {
        synchronized (this) {
            return this.I.size();
        }
    }
    
    public final void f1(final boolean b, final int n, final int n2) {
        try {
            this.g0.k(b, n, n2);
        }
        catch (IOException ex) {
            this.F(ex);
        }
    }
    
    public final void flush() throws IOException {
        this.g0.flush();
    }
    
    public final void g0(final int i, @org.jetbrains.annotations.e final o o, final int n, final boolean b) throws IOException {
        kotlin.jvm.internal.k0.p((Object)o, "source");
        final okio.m m = new okio.m();
        final long n2 = n;
        o.B5(n2);
        o.read(m, n2);
        final okhttp3.internal.concurrent.c p4 = this.P;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append('[');
        sb.append(i);
        sb.append("] onData");
        final String string = sb.toString();
        p4.n(new a(true) {
            final /* synthetic */ f g;
            
            @Override
            public long f() {
                try {
                    final boolean d = okhttp3.internal.http2.f.h(this.g).d(i, m, n, b);
                    if (d) {
                        this.g.Z().o(i, b.P);
                    }
                    if (d || b) {
                        synchronized (this.g) {
                            okhttp3.internal.http2.f.c(this.g).remove(i);
                        }
                    }
                    return -1L;
                }
                catch (IOException ex) {
                    return -1L;
                }
            }
        }, 0L);
    }
    
    public final void g1() throws InterruptedException {
        this.e1();
        this.C();
    }
    
    public final void h0(final int i, @org.jetbrains.annotations.e final List<okhttp3.internal.http2.c> list, final boolean b) {
        kotlin.jvm.internal.k0.p((Object)list, "requestHeaders");
        final okhttp3.internal.concurrent.c p3 = this.P;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append('[');
        sb.append(i);
        sb.append("] onHeaders");
        final String string = sb.toString();
        p3.n(new a(true) {
            final /* synthetic */ f g;
            
            @Override
            public long f() {
                final boolean b = okhttp3.internal.http2.f.h(this.g).b(i, list, b);
                Label_0046: {
                    if (!b) {
                        break Label_0046;
                    }
                    try {
                        this.g.Z().o(i, okhttp3.internal.http2.b.P);
                        if (b || b) {
                            synchronized (this.g) {
                                okhttp3.internal.http2.f.c(this.g).remove(i);
                            }
                        }
                        return -1L;
                    }
                    catch (IOException ex) {
                        return -1L;
                    }
                }
            }
        }, 0L);
    }
    
    public final void i0(final int i, @org.jetbrains.annotations.e final List<okhttp3.internal.http2.c> list) {
        kotlin.jvm.internal.k0.p((Object)list, "requestHeaders");
        synchronized (this) {
            if (this.i0.contains(i)) {
                this.o1(i, okhttp3.internal.http2.b.I);
                return;
            }
            this.i0.add(i);
            // monitorexit(this)
            final okhttp3.internal.concurrent.c p2 = this.P;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.J);
            sb.append('[');
            sb.append(i);
            sb.append("] onRequest");
            final String string = sb.toString();
            p2.n(new a(true) {
                final /* synthetic */ f g;
                
                @Override
                public long f() {
                    if (!okhttp3.internal.http2.f.h(this.g).a(i, list)) {
                        return -1L;
                    }
                    try {
                        this.g.Z().o(i, b.P);
                        synchronized (this.g) {
                            okhttp3.internal.http2.f.c(this.g).remove(i);
                        }
                        return -1L;
                    }
                    catch (IOException ex) {
                        return -1L;
                    }
                }
            }, 0L);
        }
    }
    
    public final void j0(final int i, @org.jetbrains.annotations.e final okhttp3.internal.http2.b b) {
        kotlin.jvm.internal.k0.p((Object)b, "errorCode");
        final okhttp3.internal.concurrent.c p2 = this.P;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append('[');
        sb.append(i);
        sb.append("] onReset");
        final String string = sb.toString();
        p2.n(new a(true) {
            final /* synthetic */ f g;
            
            @Override
            public long f() {
                okhttp3.internal.http2.f.h(this.g).c(i, b);
                synchronized (this.g) {
                    okhttp3.internal.http2.f.c(this.g).remove(i);
                    final j2 a = j2.a;
                    return -1L;
                }
            }
        }, 0L);
    }
    
    public final void k1(final int n, @org.jetbrains.annotations.e final okhttp3.internal.http2.b b) throws IOException {
        kotlin.jvm.internal.k0.p((Object)b, "statusCode");
        this.g0.o(n, b);
    }
    
    @org.jetbrains.annotations.e
    public final i m0(final int n, @org.jetbrains.annotations.e final List<okhttp3.internal.http2.c> list, final boolean b) throws IOException {
        kotlin.jvm.internal.k0.p((Object)list, "requestHeaders");
        if (this.G ^ true) {
            return this.d0(n, list, b);
        }
        throw new IllegalStateException("Client cannot push requests.".toString());
    }
    
    public final void o1(final int i, @org.jetbrains.annotations.e final okhttp3.internal.http2.b b) {
        kotlin.jvm.internal.k0.p((Object)b, "errorCode");
        final okhttp3.internal.concurrent.c o = this.O;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append('[');
        sb.append(i);
        sb.append("] writeSynReset");
        final String string = sb.toString();
        o.n(new a(true) {
            final /* synthetic */ f g;
            
            @Override
            public long f() {
                try {
                    this.g.k1(i, b);
                }
                catch (IOException ex) {
                    okhttp3.internal.http2.f.this.F(ex);
                }
                return -1L;
            }
        }, 0L);
    }
    
    public final boolean p0(final int n) {
        boolean b = true;
        if (n == 0 || (n & 0x1) != 0x0) {
            b = false;
        }
        return b;
    }
    
    public final void p1(final int i, final long n) {
        final okhttp3.internal.concurrent.c o = this.O;
        final StringBuilder sb = new StringBuilder();
        sb.append(this.J);
        sb.append('[');
        sb.append(i);
        sb.append("] windowUpdate");
        final String string = sb.toString();
        o.n(new a(true) {
            final /* synthetic */ f g;
            
            @Override
            public long f() {
                try {
                    this.g.Z().r(i, n);
                }
                catch (IOException ex) {
                    okhttp3.internal.http2.f.this.F(ex);
                }
                return -1L;
            }
        }, 0L);
    }
    
    @org.jetbrains.annotations.f
    public final i s0(final int i) {
        synchronized (this) {
            final i j = this.I.remove(i);
            this.notifyAll();
            return j;
        }
    }
    
    public final void w0() {
        synchronized (this) {
            final long v = this.V;
            final long u = this.U;
            if (v < u) {
                return;
            }
            this.U = u + 1L;
            this.Y = System.nanoTime() + 1000000000;
            final j2 a = j2.a;
            // monitorexit(this)
            final okhttp3.internal.concurrent.c o = this.O;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.J);
            sb.append(" ping");
            final String string = sb.toString();
            o.n(new a(true) {
                final /* synthetic */ f g;
                
                @Override
                public long f() {
                    this.g.f1(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }
    
    public final void y0(final int k) {
        this.K = k;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010=\u001a\u000208\u0012\u0006\u0010B\u001a\u00020>¢\u0006\u0004\bG\u0010HJ.\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007J\u000e\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\"\u0010\u001d\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u0007\u001a\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010\t\u001a\u00020\b8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b#\u0010+\"\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0016\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b3\u00105\"\u0004\b6\u00107R\"\u0010=\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00109\u001a\u0004\b\u0017\u0010:\"\u0004\b;\u0010<R\u001c\u0010B\u001a\u00020>8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010?\u001a\u0004\b@\u0010AR\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010C\u001a\u0004\b)\u0010D\"\u0004\bE\u0010F¨\u0006I" }, d2 = { "okhttp3/internal/http2/f$b", "", "Ljava/net/Socket;", "socket", "", "peerName", "Lokio/o;", "source", "Lokio/n;", "sink", "Lokhttp3/internal/http2/f$b;", "y", "Lokhttp3/internal/http2/f$d;", "listener", "k", "Lokhttp3/internal/http2/l;", "pushObserver", "m", "", "pingIntervalMillis", "l", "Lokhttp3/internal/http2/f;", "a", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "o", "(Ljava/lang/String;)V", "connectionName", "Lokio/o;", "i", "()Lokio/o;", "u", "(Lokio/o;)V", "d", "Lokio/n;", "g", "()Lokio/n;", "s", "(Lokio/n;)V", "e", "Lokhttp3/internal/http2/f$d;", "()Lokhttp3/internal/http2/f$d;", "p", "(Lokhttp3/internal/http2/f$d;)V", "Ljava/net/Socket;", "h", "()Ljava/net/Socket;", "t", "(Ljava/net/Socket;)V", "f", "Lokhttp3/internal/http2/l;", "()Lokhttp3/internal/http2/l;", "r", "(Lokhttp3/internal/http2/l;)V", "", "Z", "()Z", "n", "(Z)V", "client", "Lokhttp3/internal/concurrent/d;", "Lokhttp3/internal/concurrent/d;", "j", "()Lokhttp3/internal/concurrent/d;", "taskRunner", "I", "()I", "q", "(I)V", "<init>", "(ZLokhttp3/internal/concurrent/d;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        @org.jetbrains.annotations.e
        public Socket a;
        @org.jetbrains.annotations.e
        public String b;
        @org.jetbrains.annotations.e
        public o c;
        @org.jetbrains.annotations.e
        public n d;
        @org.jetbrains.annotations.e
        private d e;
        @org.jetbrains.annotations.e
        private l f;
        private int g;
        private boolean h;
        @org.jetbrains.annotations.e
        private final okhttp3.internal.concurrent.d i;
        
        public b(final boolean h, @org.jetbrains.annotations.e final okhttp3.internal.concurrent.d i) {
            kotlin.jvm.internal.k0.p((Object)i, "taskRunner");
            this.h = h;
            this.i = i;
            this.e = d.a;
            this.f = l.a;
        }
        
        public static /* synthetic */ b z(final b b, final Socket socket, String o, o d, n c, final int n, final Object o2) throws IOException {
            if ((n & 0x2) != 0x0) {
                o = okhttp3.internal.d.O(socket);
            }
            if ((n & 0x4) != 0x0) {
                d = d0.d(d0.t(socket));
            }
            if ((n & 0x8) != 0x0) {
                c = d0.c(d0.o(socket));
            }
            return b.y(socket, o, d, c);
        }
        
        @org.jetbrains.annotations.e
        public final f a() {
            return new f(this);
        }
        
        public final boolean b() {
            return this.h;
        }
        
        @org.jetbrains.annotations.e
        public final String c() {
            final String b = this.b;
            if (b == null) {
                kotlin.jvm.internal.k0.S("connectionName");
            }
            return b;
        }
        
        @org.jetbrains.annotations.e
        public final d d() {
            return this.e;
        }
        
        public final int e() {
            return this.g;
        }
        
        @org.jetbrains.annotations.e
        public final l f() {
            return this.f;
        }
        
        @org.jetbrains.annotations.e
        public final n g() {
            final n d = this.d;
            if (d == null) {
                kotlin.jvm.internal.k0.S("sink");
            }
            return d;
        }
        
        @org.jetbrains.annotations.e
        public final Socket h() {
            final Socket a = this.a;
            if (a == null) {
                kotlin.jvm.internal.k0.S("socket");
            }
            return a;
        }
        
        @org.jetbrains.annotations.e
        public final o i() {
            final o c = this.c;
            if (c == null) {
                kotlin.jvm.internal.k0.S("source");
            }
            return c;
        }
        
        @org.jetbrains.annotations.e
        public final okhttp3.internal.concurrent.d j() {
            return this.i;
        }
        
        @org.jetbrains.annotations.e
        public final b k(@org.jetbrains.annotations.e final d e) {
            kotlin.jvm.internal.k0.p((Object)e, "listener");
            this.e = e;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final b l(final int g) {
            this.g = g;
            return this;
        }
        
        @org.jetbrains.annotations.e
        public final b m(@org.jetbrains.annotations.e final l f) {
            kotlin.jvm.internal.k0.p((Object)f, "pushObserver");
            this.f = f;
            return this;
        }
        
        public final void n(final boolean h) {
            this.h = h;
        }
        
        public final void o(@org.jetbrains.annotations.e final String b) {
            kotlin.jvm.internal.k0.p((Object)b, "<set-?>");
            this.b = b;
        }
        
        public final void p(@org.jetbrains.annotations.e final d e) {
            kotlin.jvm.internal.k0.p((Object)e, "<set-?>");
            this.e = e;
        }
        
        public final void q(final int g) {
            this.g = g;
        }
        
        public final void r(@org.jetbrains.annotations.e final l f) {
            kotlin.jvm.internal.k0.p((Object)f, "<set-?>");
            this.f = f;
        }
        
        public final void s(@org.jetbrains.annotations.e final n d) {
            kotlin.jvm.internal.k0.p((Object)d, "<set-?>");
            this.d = d;
        }
        
        public final void t(@org.jetbrains.annotations.e final Socket a) {
            kotlin.jvm.internal.k0.p((Object)a, "<set-?>");
            this.a = a;
        }
        
        public final void u(@org.jetbrains.annotations.e final o c) {
            kotlin.jvm.internal.k0.p((Object)c, "<set-?>");
            this.c = c;
        }
        
        @m6.h
        @org.jetbrains.annotations.e
        public final b v(@org.jetbrains.annotations.e final Socket socket) throws IOException {
            return z(this, socket, null, null, null, 14, null);
        }
        
        @m6.h
        @org.jetbrains.annotations.e
        public final b w(@org.jetbrains.annotations.e final Socket socket, @org.jetbrains.annotations.e final String s) throws IOException {
            return z(this, socket, s, null, null, 12, null);
        }
        
        @m6.h
        @org.jetbrains.annotations.e
        public final b x(@org.jetbrains.annotations.e final Socket socket, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final o o) throws IOException {
            return z(this, socket, s, o, null, 8, null);
        }
        
        @m6.h
        @org.jetbrains.annotations.e
        public final b y(@org.jetbrains.annotations.e final Socket a, @org.jetbrains.annotations.e final String str, @org.jetbrains.annotations.e final o c, @org.jetbrains.annotations.e final n d) throws IOException {
            kotlin.jvm.internal.k0.p((Object)a, "socket");
            kotlin.jvm.internal.k0.p((Object)str, "peerName");
            kotlin.jvm.internal.k0.p((Object)c, "source");
            kotlin.jvm.internal.k0.p((Object)d, "sink");
            this.a = a;
            StringBuilder sb;
            if (this.h) {
                sb = new StringBuilder();
                sb.append(okhttp3.internal.d.i);
                sb.append(' ');
            }
            else {
                sb = new StringBuilder();
                sb.append("MockWebServer ");
            }
            sb.append(str);
            this.b = sb.toString();
            this.c = c;
            this.d = d;
            return this;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0016\u0010\r\u001a\u00020\u00078\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010" }, d2 = { "okhttp3/internal/http2/f$c", "", "Lokhttp3/internal/http2/m;", "DEFAULT_SETTINGS", "Lokhttp3/internal/http2/m;", "a", "()Lokhttp3/internal/http2/m;", "", "AWAIT_PING", "I", "DEGRADED_PING", "DEGRADED_PONG_TIMEOUT_NS", "INTERVAL_PING", "OKHTTP_CLIENT_WINDOW_SIZE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class c
    {
        private c() {
        }
        
        @org.jetbrains.annotations.e
        public final m a() {
            return f.d();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u000e" }, d2 = { "okhttp3/internal/http2/f$d", "", "Lokhttp3/internal/http2/i;", "stream", "Lkotlin/j2;", "f", "Lokhttp3/internal/http2/f;", "connection", "Lokhttp3/internal/http2/m;", "settings", "e", "<init>", "()V", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public abstract static class d
    {
        @m6.d
        @org.jetbrains.annotations.e
        public static final d a;
        public static final b b;
        
        static {
            b = new b(null);
            a = new d() {
                @Override
                public void f(@org.jetbrains.annotations.e final i i) throws IOException {
                    kotlin.jvm.internal.k0.p((Object)i, "stream");
                    i.d(okhttp3.internal.http2.b.O, null);
                }
            };
        }
        
        public void e(@org.jetbrains.annotations.e final f f, @org.jetbrains.annotations.e final m m) {
            kotlin.jvm.internal.k0.p((Object)f, "connection");
            kotlin.jvm.internal.k0.p((Object)m, "settings");
        }
        
        public abstract void f(@org.jetbrains.annotations.e final i p0) throws IOException;
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/internal/http2/f$d$b", "", "Lokhttp3/internal/http2/f$d;", "REFUSE_INCOMING_STREAMS", "Lokhttp3/internal/http2/f$d;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        public static final class b
        {
            private b() {
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0011\b\u0000\u0012\u0006\u00109\u001a\u000204¢\u0006\u0004\b:\u0010;J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J(\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007H\u0016J.\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0016\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016J \u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007H\u0016J \u0010\"\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#H\u0016J(\u0010)\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0005H\u0016J&\u0010,\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u00072\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J8\u00103\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020 2\u0006\u00100\u001a\u00020-2\u0006\u00101\u001a\u00020\u00072\u0006\u00102\u001a\u00020#H\u0016R\u001c\u00109\u001a\u0002048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006<" }, d2 = { "okhttp3/internal/http2/f$e", "Lokhttp3/internal/http2/h$c;", "Lkotlin/Function0;", "Lkotlin/j2;", "u", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "j", "associatedStreamId", "", "Lokhttp3/internal/http2/c;", "headerBlock", "c", "Lokhttp3/internal/http2/b;", "errorCode", "n", "clearPrevious", "Lokhttp3/internal/http2/m;", "settings", "b", "s", "a", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lokio/p;", "debugData", "q", "", "windowSizeIncrement", "g", "streamDependency", "weight", "exclusive", "l", "promisedStreamId", "requestHeaders", "p", "", "origin", "protocol", "host", "port", "maxAge", "i", "Lokhttp3/internal/http2/h;", "G", "Lokhttp3/internal/http2/h;", "t", "()Lokhttp3/internal/http2/h;", "reader", "<init>", "(Lokhttp3/internal/http2/f;Lokhttp3/internal/http2/h;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public final class e implements h.c, n6.a<j2>
    {
        @org.jetbrains.annotations.e
        private final h G;
        final /* synthetic */ f H;
        
        public e(final h g) {
            kotlin.jvm.internal.k0.p((Object)g, "reader");
            this.G = g;
        }
        
        @Override
        public void a() {
        }
        
        @Override
        public void b(final boolean b, @org.jetbrains.annotations.e final m m) {
            kotlin.jvm.internal.k0.p((Object)m, "settings");
            final c o = f.o(f.this);
            final StringBuilder sb = new StringBuilder();
            sb.append(f.this.H());
            sb.append(" applyAndAckSettings");
            final String string = sb.toString();
            o.n(new okhttp3.internal.concurrent.a(true) {
                final /* synthetic */ e g;
                
                @Override
                public long f() {
                    this.g.s(b, m);
                    return -1L;
                }
            }, 0L);
        }
        
        @Override
        public void c(final boolean b, final int n, int n2, @org.jetbrains.annotations.e final List<c> list) {
            kotlin.jvm.internal.k0.p((Object)list, "headerBlock");
            if (f.this.p0(n)) {
                f.this.h0(n, list, b);
                return;
            }
            synchronized (f.this) {
                final i v = f.this.V(n);
                if (v != null) {
                    final j2 a = j2.a;
                    // monitorexit(this.H)
                    v.z(okhttp3.internal.d.X(list), b);
                    return;
                }
                if (f.q(f.this)) {
                    return;
                }
                n2 = f.this.J();
                if (n <= n2) {
                    return;
                }
                n2 = f.this.L();
                if (n % 2 == n2 % 2) {
                    return;
                }
                final i i = new i(n, f.this, false, b, okhttp3.internal.d.X(list));
                f.this.y0(n);
                f.this.W().put(n, i);
                final c j = f.k(f.this).j();
                final StringBuilder sb = new StringBuilder();
                sb.append(f.this.H());
                sb.append('[');
                sb.append(n);
                sb.append("] onStream");
                final String string = sb.toString();
                j.n(new okhttp3.internal.concurrent.a(true) {
                    final /* synthetic */ e h;
                    
                    @Override
                    public long f() {
                        try {
                            this.h.H.K().f(i);
                            return -1L;
                        }
                        catch (IOException ex) {
                            final okhttp3.internal.platform.h g = okhttp3.internal.platform.h.e.g();
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Http2Connection.Listener failure for ");
                            sb.append(this.h.H.H());
                            g.m(sb.toString(), 4, ex);
                            final a a = this;
                            final i i = i;
                            final b b = okhttp3.internal.http2.b.I;
                            final IOException ex2 = ex;
                            i.d(b, ex2);
                        }
                        try {
                            final a a = this;
                            final i i = i;
                            final b b = okhttp3.internal.http2.b.I;
                            final IOException ex;
                            final IOException ex2 = ex;
                            i.d(b, ex2);
                            return -1L;
                        }
                        catch (IOException ex3) {
                            return -1L;
                        }
                    }
                }, 0L);
            }
        }
        
        @Override
        public void g(final int n, final long n2) {
            Label_0107: {
                if (n == 0) {
                    synchronized (f.this) {
                        final f h = f.this;
                        f.y(h, h.X() + n2);
                        final f h2 = f.this;
                        if (h2 != null) {
                            h2.notifyAll();
                            final j2 a = j2.a;
                            break Label_0107;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                    }
                }
                final i v = f.this.V(n);
                if (v == null) {
                    return;
                }
                synchronized (v) {
                    v.a(n2);
                    final j2 a2 = j2.a;
                }
            }
        }
        
        @Override
        public void i(final int n, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final p p6, @org.jetbrains.annotations.e final String s2, final int n2, final long n3) {
            kotlin.jvm.internal.k0.p((Object)s, "origin");
            kotlin.jvm.internal.k0.p((Object)p6, "protocol");
            kotlin.jvm.internal.k0.p((Object)s2, "host");
        }
        
        @Override
        public void j(final boolean b, final int n, @org.jetbrains.annotations.e final o o, final int n2) throws IOException {
            kotlin.jvm.internal.k0.p((Object)o, "source");
            if (f.this.p0(n)) {
                f.this.g0(n, o, n2, b);
                return;
            }
            final i v = f.this.V(n);
            if (v == null) {
                f.this.o1(n, b.I);
                final f h = f.this;
                final long n3 = n2;
                h.Z0(n3);
                o.skip(n3);
                return;
            }
            v.y(o, n2);
            if (b) {
                v.z(okhttp3.internal.d.b, true);
            }
        }
        
        @Override
        public void k(final boolean b, final int n, final int n2) {
            if (b) {
                final f h = f.this;
                // monitorenter(h)
                Label_0109: {
                    if (n == 1) {
                        break Label_0109;
                    }
                    Label_0088: {
                        if (n == 2) {
                            break Label_0088;
                        }
                        Label_0036: {
                            if (n == 3) {
                                break Label_0036;
                            }
                            try {
                                // iftrue(Label_0073:, h3 == null)
                                while (true) {
                                    while (true) {
                                        final j2 a = j2.a;
                                        return;
                                        final f h2 = f.this;
                                        f.w(h2, f.g(h2) + 1L);
                                        return;
                                        final f h3;
                                        h3.notifyAll();
                                        continue;
                                    }
                                    final f h4 = f.this;
                                    f.r(h4, f.b(h4) + 1L);
                                    final f h3 = f.this;
                                    continue;
                                }
                                final f h5 = f.this;
                                f.s(h5, f.e(h5) + 1L);
                                return;
                                Label_0073: {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                }
                            }
                            finally {
                            }
                            // monitorexit(h)
                        }
                    }
                }
            }
            final c o = f.o(f.this);
            final StringBuilder sb = new StringBuilder();
            sb.append(f.this.H());
            sb.append(" ping");
            final String string = sb.toString();
            o.n(new okhttp3.internal.concurrent.a(true) {
                final /* synthetic */ e g;
                
                @Override
                public long f() {
                    this.g.H.f1(true, n, n2);
                    return -1L;
                }
            }, 0L);
        }
        
        @Override
        public void l(final int n, final int n2, final int n3, final boolean b) {
        }
        
        @Override
        public void n(final int n, @org.jetbrains.annotations.e final b b) {
            kotlin.jvm.internal.k0.p((Object)b, "errorCode");
            if (f.this.p0(n)) {
                f.this.j0(n, b);
                return;
            }
            final i s0 = f.this.s0(n);
            if (s0 != null) {
                s0.A(b);
            }
        }
        
        @Override
        public void p(final int n, final int n2, @org.jetbrains.annotations.e final List<c> list) {
            kotlin.jvm.internal.k0.p((Object)list, "requestHeaders");
            f.this.i0(n2, list);
        }
        
        @Override
        public void q(final int n, @org.jetbrains.annotations.e b h, @org.jetbrains.annotations.e final p p3) {
            kotlin.jvm.internal.k0.p((Object)h, "errorCode");
            kotlin.jvm.internal.k0.p((Object)p3, "debugData");
            p3.size();
            h = (b)f.this;
            synchronized (h) {
                final Collection<i> values = f.this.W().values();
                int i = 0;
                final i[] array = values.toArray(new i[0]);
                if (array != null) {
                    final i[] array2 = array;
                    f.x(f.this, true);
                    final j2 a = j2.a;
                    // monitorexit(h)
                    while (i < array2.length) {
                        h = (b)array2[i];
                        if (((i)h).k() > n && ((i)h).v()) {
                            ((i)h).A(b.O);
                            f.this.s0(((i)h).k());
                        }
                        ++i;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        
        public final void s(final boolean p0, @org.jetbrains.annotations.e final m p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "settings"
            //     3: invokestatic    kotlin/jvm/internal/k0.p:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: new             Lkotlin/jvm/internal/j1$g;
            //     9: dup            
            //    10: invokespecial   kotlin/jvm/internal/j1$g.<init>:()V
            //    13: astore_3       
            //    14: new             Lkotlin/jvm/internal/j1$h;
            //    17: dup            
            //    18: invokespecial   kotlin/jvm/internal/j1$h.<init>:()V
            //    21: astore          4
            //    23: new             Lkotlin/jvm/internal/j1$h;
            //    26: dup            
            //    27: invokespecial   kotlin/jvm/internal/j1$h.<init>:()V
            //    30: astore          5
            //    32: aload_0        
            //    33: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //    36: invokevirtual   okhttp3/internal/http2/f.Z:()Lokhttp3/internal/http2/j;
            //    39: astore          6
            //    41: aload           6
            //    43: monitorenter   
            //    44: aload_0        
            //    45: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //    48: astore          7
            //    50: aload           7
            //    52: monitorenter   
            //    53: aload_0        
            //    54: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //    57: invokevirtual   okhttp3/internal/http2/f.N:()Lokhttp3/internal/http2/m;
            //    60: astore          8
            //    62: iload_1        
            //    63: ifeq            72
            //    66: aload_2        
            //    67: astore          9
            //    69: goto            100
            //    72: new             Lokhttp3/internal/http2/m;
            //    75: astore          9
            //    77: aload           9
            //    79: invokespecial   okhttp3/internal/http2/m.<init>:()V
            //    82: aload           9
            //    84: aload           8
            //    86: invokevirtual   okhttp3/internal/http2/m.j:(Lokhttp3/internal/http2/m;)V
            //    89: aload           9
            //    91: aload_2        
            //    92: invokevirtual   okhttp3/internal/http2/m.j:(Lokhttp3/internal/http2/m;)V
            //    95: getstatic       kotlin/j2.a:Lkotlin/j2;
            //    98: astore          10
            //   100: aload           5
            //   102: aload           9
            //   104: putfield        kotlin/jvm/internal/j1$h.G:Ljava/lang/Object;
            //   107: aload           9
            //   109: checkcast       Lokhttp3/internal/http2/m;
            //   112: invokevirtual   okhttp3/internal/http2/m.e:()I
            //   115: i2l            
            //   116: aload           8
            //   118: invokevirtual   okhttp3/internal/http2/m.e:()I
            //   121: i2l            
            //   122: lsub           
            //   123: lstore          11
            //   125: aload_3        
            //   126: lload           11
            //   128: putfield        kotlin/jvm/internal/j1$g.G:J
            //   131: lload           11
            //   133: lconst_0       
            //   134: lcmp           
            //   135: ifeq            207
            //   138: aload_0        
            //   139: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   142: invokevirtual   okhttp3/internal/http2/f.W:()Ljava/util/Map;
            //   145: invokeinterface java/util/Map.isEmpty:()Z
            //   150: ifeq            156
            //   153: goto            207
            //   156: aload_0        
            //   157: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   160: invokevirtual   okhttp3/internal/http2/f.W:()Ljava/util/Map;
            //   163: invokeinterface java/util/Map.values:()Ljava/util/Collection;
            //   168: iconst_0       
            //   169: anewarray       Lokhttp3/internal/http2/i;
            //   172: invokeinterface java/util/Collection.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
            //   177: astore          9
            //   179: aload           9
            //   181: ifnull          194
            //   184: aload           9
            //   186: checkcast       [Lokhttp3/internal/http2/i;
            //   189: astore          9
            //   191: goto            210
            //   194: new             Ljava/lang/NullPointerException;
            //   197: astore_2       
            //   198: aload_2        
            //   199: ldc_w           "null cannot be cast to non-null type kotlin.Array<T>"
            //   202: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   205: aload_2        
            //   206: athrow         
            //   207: aconst_null    
            //   208: astore          9
            //   210: aload           4
            //   212: aload           9
            //   214: putfield        kotlin/jvm/internal/j1$h.G:Ljava/lang/Object;
            //   217: aload_0        
            //   218: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   221: aload           5
            //   223: getfield        kotlin/jvm/internal/j1$h.G:Ljava/lang/Object;
            //   226: checkcast       Lokhttp3/internal/http2/m;
            //   229: invokevirtual   okhttp3/internal/http2/f.G0:(Lokhttp3/internal/http2/m;)V
            //   232: aload_0        
            //   233: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   236: invokestatic    okhttp3/internal/http2/f.j:(Lokhttp3/internal/http2/f;)Lokhttp3/internal/concurrent/c;
            //   239: astore          9
            //   241: new             Ljava/lang/StringBuilder;
            //   244: astore          8
            //   246: aload           8
            //   248: invokespecial   java/lang/StringBuilder.<init>:()V
            //   251: aload           8
            //   253: aload_0        
            //   254: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   257: invokevirtual   okhttp3/internal/http2/f.H:()Ljava/lang/String;
            //   260: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   263: pop            
            //   264: aload           8
            //   266: ldc_w           " onSettings"
            //   269: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
            //   272: pop            
            //   273: aload           8
            //   275: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
            //   278: astore          8
            //   280: new             Lokhttp3/internal/http2/f$e$a;
            //   283: astore          10
            //   285: aload           10
            //   287: aload           8
            //   289: iconst_1       
            //   290: aload           8
            //   292: iconst_1       
            //   293: aload_0        
            //   294: aload           5
            //   296: iload_1        
            //   297: aload_2        
            //   298: aload_3        
            //   299: aload           4
            //   301: invokespecial   okhttp3/internal/http2/f$e$a.<init>:(Ljava/lang/String;ZLjava/lang/String;ZLokhttp3/internal/http2/f$e;Lkotlin/jvm/internal/j1$h;ZLokhttp3/internal/http2/m;Lkotlin/jvm/internal/j1$g;Lkotlin/jvm/internal/j1$h;)V
            //   304: aload           9
            //   306: aload           10
            //   308: lconst_0       
            //   309: invokevirtual   okhttp3/internal/concurrent/c.n:(Lokhttp3/internal/concurrent/a;J)V
            //   312: getstatic       kotlin/j2.a:Lkotlin/j2;
            //   315: astore_2       
            //   316: aload           7
            //   318: monitorexit    
            //   319: aload_0        
            //   320: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   323: invokevirtual   okhttp3/internal/http2/f.Z:()Lokhttp3/internal/http2/j;
            //   326: aload           5
            //   328: getfield        kotlin/jvm/internal/j1$h.G:Ljava/lang/Object;
            //   331: checkcast       Lokhttp3/internal/http2/m;
            //   334: invokevirtual   okhttp3/internal/http2/j.a:(Lokhttp3/internal/http2/m;)V
            //   337: goto            349
            //   340: astore_2       
            //   341: aload_0        
            //   342: getfield        okhttp3/internal/http2/f$e.H:Lokhttp3/internal/http2/f;
            //   345: aload_2        
            //   346: invokestatic    okhttp3/internal/http2/f.a:(Lokhttp3/internal/http2/f;Ljava/io/IOException;)V
            //   349: getstatic       kotlin/j2.a:Lkotlin/j2;
            //   352: astore_2       
            //   353: aload           6
            //   355: monitorexit    
            //   356: aload           4
            //   358: getfield        kotlin/jvm/internal/j1$h.G:Ljava/lang/Object;
            //   361: astore_2       
            //   362: aload_2        
            //   363: checkcast       [Lokhttp3/internal/http2/i;
            //   366: ifnull          431
            //   369: aload_2        
            //   370: checkcast       [Lokhttp3/internal/http2/i;
            //   373: astore          9
            //   375: aload           9
            //   377: invokestatic    kotlin/jvm/internal/k0.m:(Ljava/lang/Object;)V
            //   380: aload           9
            //   382: arraylength    
            //   383: istore          13
            //   385: iconst_0       
            //   386: istore          14
            //   388: iload           14
            //   390: iload           13
            //   392: if_icmpge       431
            //   395: aload           9
            //   397: iload           14
            //   399: aaload         
            //   400: astore_2       
            //   401: aload_2        
            //   402: monitorenter   
            //   403: aload_2        
            //   404: aload_3        
            //   405: getfield        kotlin/jvm/internal/j1$g.G:J
            //   408: invokevirtual   okhttp3/internal/http2/i.a:(J)V
            //   411: getstatic       kotlin/j2.a:Lkotlin/j2;
            //   414: astore          6
            //   416: aload_2        
            //   417: monitorexit    
            //   418: iinc            14, 1
            //   421: goto            388
            //   424: astore          9
            //   426: aload_2        
            //   427: monitorexit    
            //   428: aload           9
            //   430: athrow         
            //   431: return         
            //   432: astore_2       
            //   433: goto            437
            //   436: astore_2       
            //   437: aload           7
            //   439: monitorexit    
            //   440: aload_2        
            //   441: athrow         
            //   442: astore_2       
            //   443: aload           6
            //   445: monitorexit    
            //   446: aload_2        
            //   447: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  44     53     442    448    Any
            //  53     62     436    437    Any
            //  72     100    436    437    Any
            //  100    131    436    437    Any
            //  138    153    436    437    Any
            //  156    179    436    437    Any
            //  184    191    436    437    Any
            //  194    207    436    437    Any
            //  210    285    436    437    Any
            //  285    316    432    436    Any
            //  316    319    442    448    Any
            //  319    337    340    349    Ljava/io/IOException;
            //  319    337    442    448    Any
            //  341    349    442    448    Any
            //  349    353    442    448    Any
            //  403    416    424    431    Any
            //  437    442    442    448    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.NullPointerException
            //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
            //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
            //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:576)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
            //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
            //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
            //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
            //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @org.jetbrains.annotations.e
        public final h t() {
            return this.G;
        }
        
        public void u() {
            final b j = b.J;
            IOException ex = null;
            b h = null;
            IOException ex4 = null;
            Label_0113: {
                b b = null;
                try {
                    this.G.c((h.c)this);
                    while (this.G.b(false, (h.c)this)) {}
                    b = (h = okhttp3.internal.http2.b.H);
                    try {
                        final b b2 = okhttp3.internal.http2.b.P;
                        final e e = this;
                        final f f = e.H;
                        final b b3 = b;
                        final b b4 = b2;
                        final IOException ex2 = null;
                        f.D(b3, b4, ex2);
                    }
                    catch (IOException ex3) {}
                }
                catch (IOException ex3) {}
                finally {
                    final Object o;
                    ex = (IOException)o;
                    h = j;
                    break Label_0113;
                }
                try {
                    final b b2 = okhttp3.internal.http2.b.P;
                    final e e = this;
                    final f f = e.H;
                    final b b3 = b;
                    final b b4 = b2;
                    final IOException ex2 = null;
                    f.D(b3, b4, ex2);
                    while (true) {
                        okhttp3.internal.d.l(this.G);
                        return;
                        final IOException ex3;
                        ex = ex3;
                        final b i = okhttp3.internal.http2.b.I;
                        okhttp3.internal.http2.f.this.D(i, i, ex3);
                        continue;
                    }
                }
                finally {
                    ex4 = ex;
                }
            }
            f.this.D(h, j, ex4);
            okhttp3.internal.d.l(this.G);
        }
    }
}
