// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import org.jetbrains.annotations.f;
import java.util.UUID;
import java.util.ArrayList;
import m6.h;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import m6.g;
import java.io.IOException;
import okio.m;
import okio.n;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.List;
import okio.p;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 12\u00020\u0001:\u0003\u0018\r'B'\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b/\u00100J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\u001e\u001a\u00020\f8\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000fR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001f\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0017R\u0016\u0010)\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0013\u0010,\u001a\u00020\u00108G@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010\u0012R\u0013\u0010.\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b-\u0010\u0014¨\u00062" }, d2 = { "Lokhttp3/z;", "Lokhttp3/f0;", "Lokio/n;", "sink", "", "countBytes", "", "B", "", "index", "Lokhttp3/z$c;", "x", "Lokhttp3/y;", "b", "v", "()Lokhttp3/y;", "", "s", "()Ljava/lang/String;", "u", "()I", "", "t", "()Ljava/util/List;", "a", "Lkotlin/j2;", "r", "e", "Lokhttp3/y;", "A", "type", "Lokio/p;", "d", "Lokio/p;", "boundaryByteString", "f", "Ljava/util/List;", "y", "parts", "c", "J", "contentLength", "contentType", "w", "boundary", "z", "size", "<init>", "(Lokio/p;Lokhttp3/y;Ljava/util/List;)V", "o", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class z extends f0
{
    @d
    @e
    public static final y g;
    @d
    @e
    public static final y h;
    @d
    @e
    public static final y i;
    @d
    @e
    public static final y j;
    @d
    @e
    public static final y k;
    private static final byte[] l;
    private static final byte[] m;
    private static final byte[] n;
    public static final b o;
    private final y b;
    private long c;
    private final p d;
    @e
    private final y e;
    @e
    private final List<c> f;
    
    static {
        o = new b(null);
        final y.a i2 = y.i;
        g = i2.c("multipart/mixed");
        h = i2.c("multipart/alternative");
        i = i2.c("multipart/digest");
        j = i2.c("multipart/parallel");
        k = i2.c("multipart/form-data");
        l = new byte[] { 58, 32 };
        m = new byte[] { 13, 10 };
        final byte b = 45;
        n = new byte[] { b, b };
    }
    
    public z(@e final p d, @e final y y, @e final List<c> f) {
        k0.p((Object)d, "boundaryByteString");
        k0.p((Object)y, "type");
        k0.p((Object)f, "parts");
        this.d = d;
        this.e = y;
        this.f = f;
        final y.a i = y.i;
        final StringBuilder sb = new StringBuilder();
        sb.append(y);
        sb.append("; boundary=");
        sb.append(this.w());
        this.b = i.c(sb.toString());
        this.c = -1L;
    }
    
    private final long B(n n, final boolean b) throws IOException {
        m m;
        if (b) {
            n = (m = new m());
        }
        else {
            m = null;
        }
        final int size = this.f.size();
        long n2 = 0L;
        for (int i = 0; i < size; ++i) {
            final c c = this.f.get(i);
            final v h = c.h();
            final f0 c2 = c.c();
            k0.m((Object)n);
            n.G4(z.n);
            n.L4(this.d);
            n.G4(z.m);
            if (h != null) {
                for (int size2 = h.size(), j = 0; j < size2; ++j) {
                    n.Q2(h.n(j)).G4(z.l).Q2(h.v(j)).G4(z.m);
                }
            }
            final y b2 = c2.b();
            if (b2 != null) {
                n.Q2("Content-Type: ").Q2(b2.toString()).G4(z.m);
            }
            final long a = c2.a();
            if (a != -1L) {
                n.Q2("Content-Length: ").D5(a).G4(z.m);
            }
            else if (b) {
                k0.m((Object)m);
                m.c();
                return -1L;
            }
            final byte[] k = z.m;
            n.G4(k);
            if (b) {
                n2 += a;
            }
            else {
                c2.r(n);
            }
            n.G4(k);
        }
        k0.m((Object)n);
        final byte[] n3 = z.n;
        n.G4(n3);
        n.L4(this.d);
        n.G4(n3);
        n.G4(z.m);
        long n4 = n2;
        if (b) {
            k0.m((Object)m);
            n4 = n2 + m.h0();
            m.c();
        }
        return n4;
    }
    
    @g(name = "type")
    @e
    public final y A() {
        return this.e;
    }
    
    @Override
    public long a() throws IOException {
        long c;
        if ((c = this.c) == -1L) {
            c = this.B(null, true);
            this.c = c;
        }
        return c;
    }
    
    @e
    @Override
    public y b() {
        return this.b;
    }
    
    @Override
    public void r(@e final n n) throws IOException {
        k0.p((Object)n, "sink");
        this.B(n, false);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "boundary", imports = {}))
    @g(name = "-deprecated_boundary")
    @e
    public final String s() {
        return this.w();
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "parts", imports = {}))
    @g(name = "-deprecated_parts")
    @e
    public final List<c> t() {
        return this.f;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "size", imports = {}))
    @g(name = "-deprecated_size")
    public final int u() {
        return this.z();
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "type", imports = {}))
    @g(name = "-deprecated_type")
    @e
    public final y v() {
        return this.e;
    }
    
    @g(name = "boundary")
    @e
    public final String w() {
        return this.d.U0();
    }
    
    @e
    public final c x(final int n) {
        return this.f.get(n);
    }
    
    @g(name = "parts")
    @e
    public final List<c> y() {
        return this.f;
    }
    
    @g(name = "size")
    public final int z() {
        return this.f.size();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\f¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0018\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0007\u001a\u00020\u0006J\u0016\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fJ \u0010\u0011\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0016\u001a\u00020\u0015R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u001d¨\u0006 " }, d2 = { "okhttp3/z$a", "", "Lokhttp3/y;", "type", "Lokhttp3/z$a;", "g", "Lokhttp3/f0;", "body", "e", "Lokhttp3/v;", "headers", "c", "", "name", "value", "a", "filename", "b", "Lokhttp3/z$c;", "part", "d", "Lokhttp3/z;", "f", "", "Ljava/util/List;", "parts", "Lokio/p;", "Lokio/p;", "boundary", "Lokhttp3/y;", "<init>", "(Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private final p a;
        private y b;
        private final List<c> c;
        
        @h
        public a() {
            this(null, 1, null);
        }
        
        @h
        public a(@e final String s) {
            k0.p((Object)s, "boundary");
            this.a = p.L.l(s);
            this.b = z.g;
            this.c = new ArrayList<c>();
        }
        
        @e
        public final a a(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.d(z.c.c.c(s, s2));
            return this;
        }
        
        @e
        public final a b(@e final String s, @f final String s2, @e final f0 f0) {
            k0.p((Object)s, "name");
            k0.p((Object)f0, "body");
            this.d(z.c.c.d(s, s2, f0));
            return this;
        }
        
        @e
        public final a c(@f final v v, @e final f0 f0) {
            k0.p((Object)f0, "body");
            this.d(z.c.c.a(v, f0));
            return this;
        }
        
        @e
        public final a d(@e final c c) {
            k0.p((Object)c, "part");
            this.c.add(c);
            return this;
        }
        
        @e
        public final a e(@e final f0 f0) {
            k0.p((Object)f0, "body");
            this.d(z.c.c.b(f0));
            return this;
        }
        
        @e
        public final z f() {
            if (this.c.isEmpty() ^ true) {
                return new z(this.a, this.b, okhttp3.internal.d.c0((List<? extends c>)this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }
        
        @e
        public final a g(@e final y y) {
            k0.p((Object)y, "type");
            if (k0.g((Object)y.l(), (Object)"multipart")) {
                this.b = y;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("multipart != ");
            sb.append(y);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017" }, d2 = { "okhttp3/z$b", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/j2;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/y;", "ALTERNATIVE", "Lokhttp3/y;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        public final void a(@e final StringBuilder sb, @e final String s) {
            k0.p((Object)sb, "$this$appendQuotedString");
            k0.p((Object)s, "key");
            sb.append('\"');
            for (int length = s.length(), i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                String str;
                if (char1 != '\n') {
                    if (char1 != '\r') {
                        if (char1 != '\"') {
                            sb.append(char1);
                            continue;
                        }
                        str = "%22";
                    }
                    else {
                        str = "%0D";
                    }
                }
                else {
                    str = "%0A";
                }
                sb.append(str);
            }
            sb.append('\"');
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u001b\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\u0007¨\u0006\u0010" }, d2 = { "okhttp3/z$c", "", "Lokhttp3/v;", "b", "()Lokhttp3/v;", "Lokhttp3/f0;", "a", "()Lokhttp3/f0;", "Lokhttp3/v;", "h", "headers", "Lokhttp3/f0;", "c", "body", "<init>", "(Lokhttp3/v;Lokhttp3/f0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class c
    {
        public static final a c;
        @f
        private final v a;
        @e
        private final f0 b;
        
        static {
            c = new a(null);
        }
        
        private c(final v a, final f0 b) {
            this.a = a;
            this.b = b;
        }
        
        @m6.k
        @e
        public static final c d(@f final v v, @e final f0 f0) {
            return z.c.c.a(v, f0);
        }
        
        @m6.k
        @e
        public static final c e(@e final f0 f0) {
            return z.c.c.b(f0);
        }
        
        @m6.k
        @e
        public static final c f(@e final String s, @e final String s2) {
            return z.c.c.c(s, s2);
        }
        
        @m6.k
        @e
        public static final c g(@e final String s, @f final String s2, @e final f0 f0) {
            return z.c.c.d(s, s2, f0);
        }
        
        @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "body", imports = {}))
        @g(name = "-deprecated_body")
        @e
        public final f0 a() {
            return this.b;
        }
        
        @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "headers", imports = {}))
        @g(name = "-deprecated_headers")
        @f
        public final v b() {
            return this.a;
        }
        
        @g(name = "body")
        @e
        public final f0 c() {
            return this.b;
        }
        
        @g(name = "headers")
        @f
        public final v h() {
            return this.a;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0011" }, d2 = { "okhttp3/z$c$a", "", "Lokhttp3/f0;", "body", "Lokhttp3/z$c;", "b", "Lokhttp3/v;", "headers", "a", "", "name", "value", "c", "filename", "d", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        public static final class a
        {
            private a() {
            }
            
            @m6.k
            @e
            public final c a(@f final v v, @e final f0 f0) {
                k0.p((Object)f0, "body");
                String h;
                if (v != null) {
                    h = v.h("Content-Type");
                }
                else {
                    h = null;
                }
                final int n = 1;
                if (h != null) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                String h2;
                if (v != null) {
                    h2 = v.h("Content-Length");
                }
                else {
                    h2 = null;
                }
                int n2;
                if (h2 == null) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    return new c(v, f0, null);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }
            
            @m6.k
            @e
            public final c b(@e final f0 f0) {
                k0.p((Object)f0, "body");
                return this.a(null, f0);
            }
            
            @m6.k
            @e
            public final c c(@e final String s, @e final String s2) {
                k0.p((Object)s, "name");
                k0.p((Object)s2, "value");
                return this.d(s, null, f0.a.o(f0.a, s2, null, 1, null));
            }
            
            @m6.k
            @e
            public final c d(@e String string, @f final String s, @e final f0 f0) {
                k0.p((Object)string, "name");
                k0.p((Object)f0, "body");
                final StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                final b o = z.o;
                o.a(sb, string);
                if (s != null) {
                    sb.append("; filename=");
                    o.a(sb, s);
                }
                string = sb.toString();
                k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
                return this.a(new v.a().h("Content-Disposition", string).i(), f0);
            }
        }
    }
}
