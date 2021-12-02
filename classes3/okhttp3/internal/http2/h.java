// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import okio.t0;
import java.io.EOFException;
import java.util.logging.Level;
import kotlin.ranges.i;
import java.util.List;
import okio.p;
import java.io.IOException;
import okio.r0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import okio.o;
import org.jetbrains.annotations.e;
import java.util.logging.Logger;
import kotlin.Metadata;
import java.io.Closeable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 -2\u00020\u0001:\u0003.\u001a\u0017B\u0017\u0012\u0006\u0010'\u001a\u00020$\u0012\u0006\u0010*\u001a\u00020\u0018¢\u0006\u0004\b+\u0010,J(\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J.\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J(\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u000e\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u001b\u001a\u00020\bH\u0016R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020\u00188\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006/" }, d2 = { "Lokhttp3/internal/http2/h;", "Ljava/io/Closeable;", "Lokhttp3/internal/http2/h$c;", "handler", "", "length", "flags", "streamId", "Lkotlin/j2;", "g", "padding", "", "Lokhttp3/internal/http2/c;", "f", "d", "k", "j", "o", "q", "n", "h", "e", "r", "c", "", "requireSettings", "b", "close", "Lokhttp3/internal/http2/d$a;", "H", "Lokhttp3/internal/http2/d$a;", "hpackReader", "Lokhttp3/internal/http2/h$b;", "G", "Lokhttp3/internal/http2/h$b;", "continuation", "Lokio/o;", "I", "Lokio/o;", "source", "J", "Z", "client", "<init>", "(Lokio/o;Z)V", "L", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class h implements Closeable
{
    @e
    private static final Logger K;
    public static final a L;
    private final b G;
    private final d.a H;
    private final o I;
    private final boolean J;
    
    static {
        L = new a(null);
        final Logger logger = Logger.getLogger(okhttp3.internal.http2.e.class.getName());
        k0.o((Object)logger, "Logger.getLogger(Http2::class.java.name)");
        K = logger;
    }
    
    public h(@e final o i, final boolean j) {
        k0.p((Object)i, "source");
        this.I = i;
        this.J = j;
        final b g = new b(i);
        this.G = g;
        this.H = new d.a(g, 4096, 0, 4, null);
    }
    
    public static final /* synthetic */ Logger a() {
        return h.K;
    }
    
    private final void d(final c c, int b, final int n, final int n2) throws IOException {
        if (n2 == 0) {
            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
        }
        final int n3 = 0;
        boolean b2 = true;
        final boolean b3 = (n & 0x1) != 0x0;
        if ((n & 0x20) == 0x0) {
            b2 = false;
        }
        if (!b2) {
            int b4 = n3;
            if ((n & 0x8) != 0x0) {
                b4 = okhttp3.internal.d.b(this.I.readByte(), 255);
            }
            b = h.L.b(b, n, b4);
            c.j(b3, n2, this.I, b);
            this.I.skip(b4);
            return;
        }
        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
    }
    
    private final void e(final c c, int i, int int1, int int2) throws IOException {
        if (i < 8) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TYPE_GOAWAY length < 8: ");
            sb.append(i);
            throw new IOException(sb.toString());
        }
        if (int2 != 0) {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
        int2 = this.I.readInt();
        int1 = this.I.readInt();
        i -= 8;
        final okhttp3.internal.http2.b a = okhttp3.internal.http2.b.W.a(int1);
        if (a != null) {
            p p4 = p.K;
            if (i > 0) {
                p4 = this.I.E0(i);
            }
            c.q(int2, a, p4);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("TYPE_GOAWAY unexpected error code: ");
        sb2.append(int1);
        throw new IOException(sb2.toString());
    }
    
    private final List<okhttp3.internal.http2.c> f(final int n, final int n2, final int n3, final int n4) throws IOException {
        this.G.h(n);
        final b g = this.G;
        g.j(g.b());
        this.G.k(n2);
        this.G.g(n3);
        this.G.n(n4);
        this.H.l();
        return this.H.e();
    }
    
    private final void g(final c c, final int n, final int n2, final int n3) throws IOException {
        if (n3 != 0) {
            int b = 0;
            final boolean b2 = (n2 & 0x1) != 0x0;
            if ((n2 & 0x8) != 0x0) {
                b = okhttp3.internal.d.b(this.I.readByte(), 255);
            }
            int n4 = n;
            if ((n2 & 0x20) != 0x0) {
                this.j(c, n3);
                n4 = n - 5;
            }
            c.c(b2, n3, -1, this.f(h.L.b(n4, n2, b), b, n2, n3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }
    
    private final void h(final c c, int int1, final int n, int int2) throws IOException {
        if (int1 != 8) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PING length != 8: ");
            sb.append(int1);
            throw new IOException(sb.toString());
        }
        if (int2 == 0) {
            int2 = this.I.readInt();
            int1 = this.I.readInt();
            boolean b = true;
            if ((n & 0x1) == 0x0) {
                b = false;
            }
            c.k(b, int2, int1);
            return;
        }
        throw new IOException("TYPE_PING streamId != 0");
    }
    
    private final void j(final c c, final int n) throws IOException {
        final int int1 = this.I.readInt();
        c.l(n, int1 & Integer.MAX_VALUE, okhttp3.internal.d.b(this.I.readByte(), 255) + 1, (int1 & (int)2147483648L) != 0x0);
    }
    
    private final void k(final c c, final int i, final int n, final int n2) throws IOException {
        if (i != 5) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TYPE_PRIORITY length: ");
            sb.append(i);
            sb.append(" != 5");
            throw new IOException(sb.toString());
        }
        if (n2 != 0) {
            this.j(c, n2);
            return;
        }
        throw new IOException("TYPE_PRIORITY streamId == 0");
    }
    
    private final void n(final c c, final int n, final int n2, final int n3) throws IOException {
        if (n3 != 0) {
            int b;
            if ((n2 & 0x8) != 0x0) {
                b = okhttp3.internal.d.b(this.I.readByte(), 255);
            }
            else {
                b = 0;
            }
            c.p(n3, this.I.readInt() & Integer.MAX_VALUE, this.f(h.L.b(n - 4, n2, b), b, n2, n3));
            return;
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
    
    private final void o(final c c, int int1, final int n, final int n2) throws IOException {
        if (int1 != 4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TYPE_RST_STREAM length: ");
            sb.append(int1);
            sb.append(" != 4");
            throw new IOException(sb.toString());
        }
        if (n2 == 0) {
            throw new IOException("TYPE_RST_STREAM streamId == 0");
        }
        int1 = this.I.readInt();
        final okhttp3.internal.http2.b a = okhttp3.internal.http2.b.W.a(int1);
        if (a != null) {
            c.n(n2, a);
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("TYPE_RST_STREAM unexpected error code: ");
        sb2.append(int1);
        throw new IOException(sb2.toString());
    }
    
    private final void q(final c c, int i, int k, int c2) throws IOException {
        if (c2 != 0) {
            throw new IOException("TYPE_SETTINGS streamId != 0");
        }
        if ((k & 0x1) != 0x0) {
            if (i == 0) {
                c.a();
                return;
            }
            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
        }
        else {
            if (i % 6 == 0) {
                final m m = new m();
                final i s0 = kotlin.ranges.o.S0((i)kotlin.ranges.o.n1(0, i), 6);
                k = s0.k();
                final int n = s0.n();
                final int o = s0.o();
                Label_0297: {
                    if (o >= 0) {
                        if (k > n) {
                            break Label_0297;
                        }
                    }
                    else if (k < n) {
                        break Label_0297;
                    }
                    while (true) {
                        c2 = okhttp3.internal.d.c(this.I.readShort(), 65535);
                        final int int1 = this.I.readInt();
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 != 5) {
                                        i = c2;
                                    }
                                    else {
                                        if (int1 < 16384 || int1 > 16777215) {
                                            final StringBuilder sb = new StringBuilder();
                                            sb.append("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                                            sb.append(int1);
                                            throw new IOException(sb.toString());
                                        }
                                        i = c2;
                                    }
                                }
                                else {
                                    i = 7;
                                    if (int1 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                }
                            }
                            else {
                                i = 4;
                            }
                        }
                        else {
                            i = c2;
                            if (int1 != 0) {
                                if (int1 != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                i = c2;
                            }
                        }
                        m.k(i, int1);
                        if (k == n) {
                            break;
                        }
                        k += o;
                    }
                }
                c.b(false, m);
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("TYPE_SETTINGS length % 6 != 0: ");
            sb2.append(i);
            throw new IOException(sb2.toString());
        }
    }
    
    private final void r(final c c, final int i, final int n, final int n2) throws IOException {
        if (i != 4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("TYPE_WINDOW_UPDATE length !=4: ");
            sb.append(i);
            throw new IOException(sb.toString());
        }
        final long d = okhttp3.internal.d.d(this.I.readInt(), 2147483647L);
        if (d != 0L) {
            c.g(n2, d);
            return;
        }
        throw new IOException("windowSizeIncrement was 0");
    }
    
    public final boolean b(final boolean b, @e final c c) throws IOException {
        k0.p((Object)c, "handler");
        try {
            this.I.B5(9L);
            final int r = okhttp3.internal.d.R(this.I);
            if (r > 16384) {
                final StringBuilder sb = new StringBuilder();
                sb.append("FRAME_SIZE_ERROR: ");
                sb.append(r);
                throw new IOException(sb.toString());
            }
            final int b2 = okhttp3.internal.d.b(this.I.readByte(), 255);
            final int b3 = okhttp3.internal.d.b(this.I.readByte(), 255);
            final int n = this.I.readInt() & Integer.MAX_VALUE;
            final Logger k = h.K;
            if (k.isLoggable(Level.FINE)) {
                k.fine(okhttp3.internal.http2.e.x.c(true, n, r, b2, b3));
            }
            if (b && b2 != 4) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a SETTINGS frame but was ");
                sb2.append(okhttp3.internal.http2.e.x.b(b2));
                throw new IOException(sb2.toString());
            }
            switch (b2) {
                default: {
                    this.I.skip(r);
                    break;
                }
                case 8: {
                    this.r(c, r, b3, n);
                    break;
                }
                case 7: {
                    this.e(c, r, b3, n);
                    break;
                }
                case 6: {
                    this.h(c, r, b3, n);
                    break;
                }
                case 5: {
                    this.n(c, r, b3, n);
                    break;
                }
                case 4: {
                    this.q(c, r, b3, n);
                    break;
                }
                case 3: {
                    this.o(c, r, b3, n);
                    break;
                }
                case 2: {
                    this.k(c, r, b3, n);
                    break;
                }
                case 1: {
                    this.g(c, r, b3, n);
                    break;
                }
                case 0: {
                    this.d(c, r, b3, n);
                    break;
                }
            }
            return true;
        }
        catch (EOFException ex) {
            return false;
        }
    }
    
    public final void c(@e final c c) throws IOException {
        k0.p((Object)c, "handler");
        if (this.J) {
            if (!this.b(true, c)) {
                throw new IOException("Required SETTINGS preface not received");
            }
        }
        else {
            final o i = this.I;
            final p a = okhttp3.internal.http2.e.a;
            final p e0 = i.E0(a.size());
            final Logger k = h.K;
            if (k.isLoggable(Level.FINE)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("<< CONNECTION ");
                sb.append(e0.E());
                k.fine(okhttp3.internal.d.v(sb.toString(), new Object[0]));
            }
            if (k0.g((Object)a, (Object)e0) ^ true) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Expected a connection header but was ");
                sb2.append(e0.U0());
                throw new IOException(sb2.toString());
            }
        }
    }
    
    @Override
    public void close() throws IOException {
        this.I.close();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e" }, d2 = { "okhttp3/internal/http2/h$a", "", "", "length", "flags", "padding", "b", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", "a", "()Ljava/util/logging/Logger;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Logger a() {
            return h.a();
        }
        
        public final int b(final int n, final int n2, final int i) throws IOException {
            int j = n;
            if ((n2 & 0x8) != 0x0) {
                j = n - 1;
            }
            if (i <= j) {
                return j - i;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("PROTOCOL_ERROR padding ");
            sb.append(i);
            sb.append(" > remaining length ");
            sb.append(j);
            throw new IOException(sb.toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0019\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001b\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\"\u0010#\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0012\u001a\u0004\b!\u0010\u0014\"\u0004\b\"\u0010\u0016R\"\u0010&\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0012\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u0006)" }, d2 = { "okhttp3/internal/http2/h$b", "Lokio/r0;", "Lkotlin/j2;", "f", "Lokio/m;", "sink", "", "byteCount", "read", "Lokio/t0;", "timeout", "close", "Lokio/o;", "L", "Lokio/o;", "source", "", "G", "I", "c", "()I", "j", "(I)V", "length", "H", "a", "g", "flags", "J", "b", "h", "left", "K", "d", "k", "padding", "e", "n", "streamId", "<init>", "(Lokio/o;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b implements r0
    {
        private int G;
        private int H;
        private int I;
        private int J;
        private int K;
        private final o L;
        
        public b(@e final o l) {
            k0.p((Object)l, "source");
            this.L = l;
        }
        
        private final void f() throws IOException {
            final int i = this.I;
            final int r = okhttp3.internal.d.R(this.L);
            this.J = r;
            this.G = r;
            final int b = okhttp3.internal.d.b(this.L.readByte(), 255);
            this.H = okhttp3.internal.d.b(this.L.readByte(), 255);
            final a l = h.L;
            if (l.a().isLoggable(Level.FINE)) {
                l.a().fine(okhttp3.internal.http2.e.x.c(true, this.I, this.G, b, this.H));
            }
            final int j = this.L.readInt() & Integer.MAX_VALUE;
            this.I = j;
            if (b != 9) {
                final StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(" != TYPE_CONTINUATION");
                throw new IOException(sb.toString());
            }
            if (j == i) {
                return;
            }
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
        
        public final int a() {
            return this.H;
        }
        
        public final int b() {
            return this.J;
        }
        
        public final int c() {
            return this.G;
        }
        
        @Override
        public void close() throws IOException {
        }
        
        public final int d() {
            return this.K;
        }
        
        public final int e() {
            return this.I;
        }
        
        public final void g(final int h) {
            this.H = h;
        }
        
        public final void h(final int j) {
            this.J = j;
        }
        
        public final void j(final int g) {
            this.G = g;
        }
        
        public final void k(final int k) {
            this.K = k;
        }
        
        public final void n(final int i) {
            this.I = i;
        }
        
        @Override
        public long read(@e final okio.m m, long read) throws IOException {
            k0.p((Object)m, "sink");
            while (true) {
                final int j = this.J;
                if (j == 0) {
                    this.L.skip(this.K);
                    this.K = 0;
                    if ((this.H & 0x4) != 0x0) {
                        return -1L;
                    }
                    this.f();
                }
                else {
                    read = this.L.read(m, Math.min(read, j));
                    if (read == -1L) {
                        return -1L;
                    }
                    this.J -= (int)read;
                    return read;
                }
            }
        }
        
        @e
        @Override
        public t0 timeout() {
            return this.L.timeout();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H&J.\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0018\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H&J\b\u0010\u0017\u001a\u00020\tH&J \u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0004H&J \u0010\u001f\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001dH&J\u0018\u0010\"\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H&J(\u0010&\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010%\u001a\u00020\u0002H&J&\u0010)\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\r0\fH&J8\u00100\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020*2\u0006\u0010.\u001a\u00020\u00042\u0006\u0010/\u001a\u00020 H&¨\u00061" }, d2 = { "okhttp3/internal/http2/h$c", "", "", "inFinished", "", "streamId", "Lokio/o;", "source", "length", "Lkotlin/j2;", "j", "associatedStreamId", "", "Lokhttp3/internal/http2/c;", "headerBlock", "c", "Lokhttp3/internal/http2/b;", "errorCode", "n", "clearPrevious", "Lokhttp3/internal/http2/m;", "settings", "b", "a", "ack", "payload1", "payload2", "k", "lastGoodStreamId", "Lokio/p;", "debugData", "q", "", "windowSizeIncrement", "g", "streamDependency", "weight", "exclusive", "l", "promisedStreamId", "requestHeaders", "p", "", "origin", "protocol", "host", "port", "maxAge", "i", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface c
    {
        void a();
        
        void b(final boolean p0, @e final m p1);
        
        void c(final boolean p0, final int p1, final int p2, @e final List<okhttp3.internal.http2.c> p3);
        
        void g(final int p0, final long p1);
        
        void i(final int p0, @e final String p1, @e final p p2, @e final String p3, final int p4, final long p5);
        
        void j(final boolean p0, final int p1, @e final o p2, final int p3) throws IOException;
        
        void k(final boolean p0, final int p1, final int p2);
        
        void l(final int p0, final int p1, final int p2, final boolean p3);
        
        void n(final int p0, @e final okhttp3.internal.http2.b p1);
        
        void p(final int p0, final int p1, @e final List<okhttp3.internal.http2.c> p2) throws IOException;
        
        void q(final int p0, @e final okhttp3.internal.http2.b p1, @e final p p2);
    }
}
