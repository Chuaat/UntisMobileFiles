// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import java.util.Arrays;
import okio.n;
import kotlin.collections.v;
import kotlin.collections.m;
import okio.d0;
import java.util.ArrayList;
import m6.h;
import kotlin.jvm.internal.w;
import okio.r0;
import okio.o;
import java.util.List;
import java.io.IOException;
import kotlin.jvm.internal.k0;
import java.util.Collections;
import java.util.LinkedHashMap;
import okio.p;
import java.util.Map;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0007\fB\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0014\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\bR%\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0016\u0010\u0011\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\u0012\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\bR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u001f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http2/d;", "", "", "Lokio/p;", "", "d", "name", "a", "I", "PREFIX_7_BITS", "h", "Ljava/util/Map;", "b", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "e", "SETTINGS_HEADER_TABLE_SIZE", "PREFIX_5_BITS", "PREFIX_4_BITS", "c", "PREFIX_6_BITS", "f", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "", "Lokhttp3/internal/http2/c;", "g", "[Lokhttp3/internal/http2/c;", "()[Lokhttp3/internal/http2/c;", "STATIC_HEADER_TABLE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    private static final int a = 15;
    private static final int b = 31;
    private static final int c = 63;
    private static final int d = 127;
    private static final int e = 4096;
    private static final int f = 16384;
    @e
    private static final c[] g;
    @e
    private static final Map<p, Integer> h;
    public static final d i;
    
    static {
        final d d = i = new d();
        final c c = new c(okhttp3.internal.http2.c.n, "");
        final p k = okhttp3.internal.http2.c.k;
        final c c2 = new c(k, "GET");
        final c c3 = new c(k, "POST");
        final p l = okhttp3.internal.http2.c.l;
        final c c4 = new c(l, "/");
        final c c5 = new c(l, "/index.html");
        final p m = okhttp3.internal.http2.c.m;
        final c c6 = new c(m, "http");
        final c c7 = new c(m, "https");
        final p j = okhttp3.internal.http2.c.j;
        g = new c[] { c, c2, c3, c4, c5, c6, c7, new c(j, "200"), new c(j, "204"), new c(j, "206"), new c(j, "304"), new c(j, "400"), new c(j, "404"), new c(j, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "") };
        h = d.d();
    }
    
    private d() {
    }
    
    private final Map<p, Integer> d() {
        final c[] g = okhttp3.internal.http2.d.g;
        final LinkedHashMap m = new LinkedHashMap<p, Integer>(g.length);
        for (int length = g.length, i = 0; i < length; ++i) {
            final c[] g2 = okhttp3.internal.http2.d.g;
            if (!m.containsKey(g2[i].b)) {
                m.put(g2[i].b, Integer.valueOf(i));
            }
        }
        final Map<p, Integer> unmodifiableMap = Collections.unmodifiableMap((Map<? extends p, ? extends Integer>)m);
        k0.o((Object)unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }
    
    @e
    public final p a(@e final p p) throws IOException {
        k0.p((Object)p, "name");
        for (int size = p.size(), i = 0; i < size; ++i) {
            final byte b = 65;
            final byte b2 = 90;
            final byte u = p.u(i);
            if (b <= u) {
                if (b2 >= u) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("PROTOCOL_ERROR response malformed: mixed case name: ");
                    sb.append(p.U0());
                    throw new IOException(sb.toString());
                }
            }
        }
        return p;
    }
    
    @e
    public final Map<p, Integer> b() {
        return okhttp3.internal.http2.d.h;
    }
    
    @e
    public final c[] c() {
        return okhttp3.internal.http2.d.g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010%\u001a\u00020/\u0012\u0006\u0010.\u001a\u00020\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0005¢\u0006\u0004\b0\u00101J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\f\u001a\u00020\u0002H\u0002J\u0010\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0005H\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0002J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0018\u0010\u0016\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0005H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018J\u0006\u0010\u001a\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u0002J\u0016\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005J\u0006\u0010\u001f\u001a\u00020\u0010R\u0016\u0010!\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0016\u0010\"\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010 R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010$R\u001e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140&8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\n\u0010'R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010*R\u0016\u0010,\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0016\u0010-\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010 R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010 ¨\u00062" }, d2 = { "okhttp3/internal/http2/d$a", "", "Lkotlin/j2;", "a", "b", "", "bytesToRecover", "d", "index", "m", "c", "q", "r", "nameIndex", "o", "p", "Lokio/p;", "f", "", "h", "Lokhttp3/internal/http2/c;", "entry", "g", "j", "", "e", "i", "l", "firstByte", "prefixMask", "n", "k", "I", "maxDynamicTableByteCount", "nextHeaderIndex", "Lokio/o;", "Lokio/o;", "source", "", "[Lokhttp3/internal/http2/c;", "dynamicTable", "", "Ljava/util/List;", "headerList", "headerCount", "dynamicTableByteCount", "headerTableSizeSetting", "Lokio/r0;", "<init>", "(Lokio/r0;II)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private final List<c> a;
        private final o b;
        @m6.d
        @e
        public c[] c;
        private int d;
        @m6.d
        public int e;
        @m6.d
        public int f;
        private final int g;
        private int h;
        
        @h
        public a(@e final r0 r0, final int n) {
            this(r0, n, 0, 4, null);
        }
        
        @h
        public a(@e final r0 r0, final int g, final int h) {
            k0.p((Object)r0, "source");
            this.g = g;
            this.h = h;
            this.a = new ArrayList<c>();
            this.b = d0.d(r0);
            final c[] c = new c[8];
            this.c = c;
            this.d = c.length - 1;
        }
        
        private final void a() {
            final int h = this.h;
            final int f = this.f;
            if (h < f) {
                if (h == 0) {
                    this.b();
                }
                else {
                    this.d(f - h);
                }
            }
        }
        
        private final void b() {
            m.w2((Object[])this.c, (Object)null, 0, 0, 6, (Object)null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }
        
        private final int c(final int n) {
            return this.d + 1 + n;
        }
        
        private final int d(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4 = this.c.length - 1;
                int n5 = n;
                n = n3;
                int d;
                while (true) {
                    d = this.d;
                    if (n4 < d || n5 <= 0) {
                        break;
                    }
                    final c c = this.c[n4];
                    k0.m((Object)c);
                    final int a = c.a;
                    n5 -= a;
                    this.f -= a;
                    --this.e;
                    ++n;
                    --n4;
                }
                final c[] c2 = this.c;
                System.arraycopy(c2, d + 1, c2, d + 1 + n, this.e);
                this.d += n;
                n2 = n;
            }
            return n2;
        }
        
        private final p f(final int n) throws IOException {
            if (!this.h(n)) {
                final int c = this.c(n - okhttp3.internal.http2.d.i.c().length);
                if (c >= 0) {
                    final c[] c2 = this.c;
                    if (c < c2.length) {
                        final c c3 = c2[c];
                        k0.m((Object)c3);
                        return c3.b;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Header index too large ");
                sb.append(n + 1);
                throw new IOException(sb.toString());
            }
            final c c3 = okhttp3.internal.http2.d.i.c()[n];
            return c3.b;
        }
        
        private final void g(int e, final c c) {
            this.a.add(c);
            int a;
            final int n = a = c.a;
            if (e != -1) {
                final c c2 = this.c[this.c(e)];
                k0.m((Object)c2);
                a = n - c2.a;
            }
            final int h = this.h;
            if (a > h) {
                this.b();
                return;
            }
            final int d = this.d(this.f + a - h);
            if (e == -1) {
                e = this.e;
                final c[] c3 = this.c;
                if (e + 1 > c3.length) {
                    final c[] c4 = new c[c3.length * 2];
                    System.arraycopy(c3, 0, c4, c3.length, c3.length);
                    this.d = this.c.length - 1;
                    this.c = c4;
                }
                e = this.d--;
                this.c[e] = c;
                ++this.e;
            }
            else {
                this.c[e + (this.c(e) + d)] = c;
            }
            this.f += a;
        }
        
        private final boolean h(final int n) {
            boolean b = true;
            if (n < 0 || n > okhttp3.internal.http2.d.i.c().length - 1) {
                b = false;
            }
            return b;
        }
        
        private final int j() throws IOException {
            return okhttp3.internal.d.b(this.b.readByte(), 255);
        }
        
        private final void m(final int n) throws IOException {
            if (!this.h(n)) {
                final int c = this.c(n - okhttp3.internal.http2.d.i.c().length);
                if (c >= 0) {
                    final c[] c2 = this.c;
                    if (c < c2.length) {
                        final List<c> a = this.a;
                        final c c3 = c2[c];
                        k0.m((Object)c3);
                        a.add(c3);
                        return;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Header index too large ");
                sb.append(n + 1);
                throw new IOException(sb.toString());
            }
            this.a.add(okhttp3.internal.http2.d.i.c()[n]);
        }
        
        private final void o(final int n) throws IOException {
            this.g(-1, new c(this.f(n), this.k()));
        }
        
        private final void p() throws IOException {
            this.g(-1, new c(okhttp3.internal.http2.d.i.a(this.k()), this.k()));
        }
        
        private final void q(final int n) throws IOException {
            this.a.add(new c(this.f(n), this.k()));
        }
        
        private final void r() throws IOException {
            this.a.add(new c(okhttp3.internal.http2.d.i.a(this.k()), this.k()));
        }
        
        @e
        public final List<c> e() {
            final List i5 = v.I5((Iterable)this.a);
            this.a.clear();
            return (List<c>)i5;
        }
        
        public final int i() {
            return this.h;
        }
        
        @e
        public final p k() throws IOException {
            final int j = this.j();
            final boolean b = (j & 0x80) == 0x80;
            final long n = this.n(j, 127);
            p p;
            if (b) {
                final okio.m m = new okio.m();
                k.d.b(this.b, n, m);
                p = m.D3();
            }
            else {
                p = this.b.E0(n);
            }
            return p;
        }
        
        public final void l() throws IOException {
            while (!this.b.D1()) {
                final int b = okhttp3.internal.d.b(this.b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 0x80) == 0x80) {
                    this.m(this.n(b, 127) - 1);
                }
                else if (b == 64) {
                    this.p();
                }
                else if ((b & 0x40) == 0x40) {
                    this.o(this.n(b, 63) - 1);
                }
                else if ((b & 0x20) == 0x20) {
                    final int n = this.n(b, 31);
                    this.h = n;
                    if (n < 0 || n > this.g) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid dynamic table size update ");
                        sb.append(this.h);
                        throw new IOException(sb.toString());
                    }
                    this.a();
                }
                else if (b != 16 && b != 0) {
                    this.q(this.n(b, 15) - 1);
                }
                else {
                    this.r();
                }
            }
        }
        
        public final int n(int n, int n2) throws IOException {
            n &= n2;
            if (n < n2) {
                return n;
            }
            n = 0;
            int j;
            while (true) {
                j = this.j();
                if ((j & 0x80) == 0x0) {
                    break;
                }
                n2 += (j & 0x7F) << n;
                n += 7;
            }
            return n2 + (j << n);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u001e\u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b)\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0002H\u0002J\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bJ\u001e\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004R\u001e\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00178\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u001aR\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0016\u0010#\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010(\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001a¨\u0006+" }, d2 = { "okhttp3/internal/http2/d$b", "", "Lkotlin/j2;", "b", "", "bytesToRecover", "c", "Lokhttp3/internal/http2/c;", "entry", "d", "a", "", "headerBlock", "g", "value", "prefixMask", "bits", "h", "Lokio/p;", "data", "f", "headerTableSizeSetting", "e", "", "[Lokhttp3/internal/http2/c;", "dynamicTable", "I", "dynamicTableByteCount", "smallestHeaderTableSizeSetting", "nextHeaderIndex", "", "Z", "emitDynamicTableSizeUpdate", "maxDynamicTableByteCount", "i", "useCompression", "Lokio/m;", "j", "Lokio/m;", "out", "headerCount", "<init>", "(IZLokio/m;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private int a;
        private boolean b;
        @m6.d
        public int c;
        @m6.d
        @e
        public c[] d;
        private int e;
        @m6.d
        public int f;
        @m6.d
        public int g;
        @m6.d
        public int h;
        private final boolean i;
        private final okio.m j;
        
        @h
        public b(final int n, @e final okio.m m) {
            this(n, false, m, 2, null);
        }
        
        @h
        public b(final int n, final boolean i, @e final okio.m j) {
            k0.p((Object)j, "out");
            this.h = n;
            this.i = i;
            this.j = j;
            this.a = Integer.MAX_VALUE;
            this.c = n;
            final c[] d = new c[8];
            this.d = d;
            this.e = d.length - 1;
        }
        
        @h
        public b(@e final okio.m m) {
            this(0, false, m, 3, null);
        }
        
        private final void a() {
            final int c = this.c;
            final int g = this.g;
            if (c < g) {
                if (c == 0) {
                    this.b();
                }
                else {
                    this.c(g - c);
                }
            }
        }
        
        private final void b() {
            m.w2((Object[])this.d, (Object)null, 0, 0, 6, (Object)null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
        }
        
        private final int c(int n) {
            int n2 = 0;
            final int n3 = 0;
            if (n > 0) {
                int n4 = this.d.length - 1;
                int n5 = n;
                n = n3;
                int e;
                while (true) {
                    e = this.e;
                    if (n4 < e || n5 <= 0) {
                        break;
                    }
                    final c c = this.d[n4];
                    k0.m((Object)c);
                    n5 -= c.a;
                    final int g = this.g;
                    final c c2 = this.d[n4];
                    k0.m((Object)c2);
                    this.g = g - c2.a;
                    --this.f;
                    ++n;
                    --n4;
                }
                final c[] d = this.d;
                System.arraycopy(d, e + 1, d, e + 1 + n, this.f);
                final c[] d2 = this.d;
                final int e2 = this.e;
                Arrays.fill(d2, e2 + 1, e2 + 1 + n, null);
                this.e += n;
                n2 = n;
            }
            return n2;
        }
        
        private final void d(final c c) {
            final int a = c.a;
            final int c2 = this.c;
            if (a > c2) {
                this.b();
                return;
            }
            this.c(this.g + a - c2);
            final int f = this.f;
            final c[] d = this.d;
            if (f + 1 > d.length) {
                final c[] d2 = new c[d.length * 2];
                System.arraycopy(d, 0, d2, d.length, d.length);
                this.e = this.d.length - 1;
                this.d = d2;
            }
            this.d[this.e--] = c;
            ++this.f;
            this.g += a;
        }
        
        public final void e(int min) {
            this.h = min;
            min = Math.min(min, 16384);
            final int c = this.c;
            if (c == min) {
                return;
            }
            if (min < c) {
                this.a = Math.min(this.a, min);
            }
            this.b = true;
            this.c = min;
            this.a();
        }
        
        public final void f(@e p d3) throws IOException {
            k0.p((Object)d3, "data");
            int n = 0;
            int n2 = 0;
            Label_0071: {
                if (this.i) {
                    final k d4 = k.d;
                    if (d4.d(d3) < d3.size()) {
                        final okio.m m = new okio.m();
                        d4.c(d3, m);
                        d3 = m.D3();
                        n = d3.size();
                        n2 = 128;
                        break Label_0071;
                    }
                }
                n = d3.size();
                n2 = 0;
            }
            this.h(n, 127, n2);
            this.j.p0(d3);
        }
        
        public final void g(@e final List<c> list) throws IOException {
            k0.p((Object)list, "headerBlock");
            if (this.b) {
                final int a = this.a;
                if (a < this.c) {
                    this.h(a, 31, 32);
                }
                this.b = false;
                this.a = Integer.MAX_VALUE;
                this.h(this.c, 31, 32);
            }
            for (int size = list.size(), i = 0; i < size; ++i) {
                final c c = list.get(i);
                final p r0 = c.b.R0();
                final p c2 = c.c;
                final d j = okhttp3.internal.http2.d.i;
                final Integer n = j.b().get(r0);
                int n2 = 0;
                int n3 = 0;
                Label_0229: {
                    if (n != null) {
                        n2 = n + 1;
                        if (2 <= n2) {
                            if (7 >= n2) {
                                if (k0.g((Object)j.c()[n2 - 1].c, (Object)c2)) {
                                    n3 = n2;
                                    break Label_0229;
                                }
                                if (k0.g((Object)j.c()[n2].c, (Object)c2)) {
                                    final int n4 = n2 + 1;
                                    n3 = n2;
                                    n2 = n4;
                                    break Label_0229;
                                }
                            }
                        }
                        n3 = n2;
                    }
                    else {
                        n3 = -1;
                    }
                    n2 = -1;
                }
                int n5 = n3;
                int n6 = n2;
                if (n2 == -1) {
                    int n7 = this.e + 1;
                    final int length = this.d.length;
                    while (true) {
                        n5 = n3;
                        n6 = n2;
                        if (n7 >= length) {
                            break;
                        }
                        final c c3 = this.d[n7];
                        k0.m((Object)c3);
                        int n8 = n3;
                        if (k0.g((Object)c3.b, (Object)r0)) {
                            final c c4 = this.d[n7];
                            k0.m((Object)c4);
                            if (k0.g((Object)c4.c, (Object)c2)) {
                                n6 = okhttp3.internal.http2.d.i.c().length + (n7 - this.e);
                                n5 = n3;
                                break;
                            }
                            if ((n8 = n3) == -1) {
                                n8 = n7 - this.e + okhttp3.internal.http2.d.i.c().length;
                            }
                        }
                        ++n7;
                        n3 = n8;
                    }
                }
                if (n6 != -1) {
                    this.h(n6, 127, 128);
                }
                else {
                    if (n5 == -1) {
                        this.j.G0(64);
                        this.f(r0);
                    }
                    else {
                        if (r0.G0(okhttp3.internal.http2.c.d) && (k0.g((Object)okhttp3.internal.http2.c.n, (Object)r0) ^ true)) {
                            this.h(n5, 15, 0);
                            this.f(c2);
                            continue;
                        }
                        this.h(n5, 63, 64);
                    }
                    this.f(c2);
                    this.d(c);
                }
            }
        }
        
        public final void h(int i, final int n, final int n2) {
            okio.m m;
            if (i < n) {
                m = this.j;
                i |= n2;
            }
            else {
                this.j.G0(n2 | n);
                for (i -= n; i >= 128; i >>>= 7) {
                    this.j.G0(0x80 | (i & 0x7F));
                }
                m = this.j;
            }
            m.G0(i);
        }
    }
}
