// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.logging;

import m6.d;
import java.io.IOException;
import okio.o;
import okhttp3.h0;
import java.nio.charset.Charset;
import okhttp3.j;
import okhttp3.f0;
import okhttp3.e0;
import java.io.Closeable;
import okio.r0;
import okio.y;
import java.util.concurrent.TimeUnit;
import java.nio.charset.StandardCharsets;
import okio.n;
import okio.m;
import okhttp3.g0;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.jvm.internal.p1;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.text.s;
import okhttp3.v;
import kotlin.collections.j1;
import kotlin.jvm.internal.k0;
import m6.h;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.Set;
import kotlin.Metadata;
import okhttp3.x;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\tB\u0013\b\u0007\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\u0011\"\u0004\b\u001a\u0010 ¨\u0006#" }, d2 = { "Lokhttp3/logging/a;", "Lokhttp3/x;", "Lokhttp3/v;", "headers", "", "i", "Lkotlin/j2;", "e", "", "b", "", "name", "f", "Lokhttp3/logging/a$a;", "level", "g", "a", "()Lokhttp3/logging/a$a;", "Lokhttp3/x$a;", "chain", "Lokhttp3/g0;", "intercept", "", "Ljava/util/Set;", "headersToRedact", "Lokhttp3/logging/a$b;", "d", "Lokhttp3/logging/a$b;", "logger", "<set-?>", "c", "Lokhttp3/logging/a$a;", "(Lokhttp3/logging/a$a;)V", "<init>", "(Lokhttp3/logging/a$b;)V", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
public final class a implements x
{
    private volatile Set<String> b;
    @e
    private volatile a c;
    private final b d;
    
    @h
    public a() {
        this(null, 1, null);
    }
    
    @h
    public a(@e final b d) {
        k0.p((Object)d, "logger");
        this.d = d;
        this.b = (Set<String>)j1.k();
        this.c = a.G;
    }
    
    private final boolean b(final v v) {
        final String h = v.h("Content-Encoding");
        boolean b2;
        final boolean b = b2 = false;
        if (h != null) {
            b2 = b;
            if (!s.K1(h, "identity", true)) {
                b2 = b;
                if (!s.K1(h, "gzip", true)) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    private final void e(final v v, final int n) {
        String v2;
        if (this.b.contains(v.n(n))) {
            v2 = "\u2588\u2588";
        }
        else {
            v2 = v.v(n);
        }
        final b d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append(v.n(n));
        sb.append(": ");
        sb.append(v2);
        d.a(sb.toString());
    }
    
    @i(level = k.H, message = "moved to var", replaceWith = @z0(expression = "level", imports = {}))
    @g(name = "-deprecated_level")
    @e
    public final a a() {
        return this.c;
    }
    
    @e
    public final a c() {
        return this.c;
    }
    
    @g(name = "level")
    public final void d(@e final a c) {
        k0.p((Object)c, "<set-?>");
        this.c = c;
    }
    
    public final void f(@e final String s) {
        k0.p((Object)s, "name");
        final TreeSet<String> b = new TreeSet<String>(s.S1(p1.a));
        kotlin.collections.v.q0((Collection)b, (Iterable)this.b);
        b.add(s);
        this.b = b;
    }
    
    @e
    public final a g(@e final a c) {
        k0.p((Object)c, "level");
        this.c = c;
        return this;
    }
    
    @e
    @Override
    public g0 intercept(@e x.a a) throws IOException {
        k0.p((Object)a, "chain");
        final a c = this.c;
        final e0 k = a.k();
        if (c == a.G) {
            return a.e(k);
        }
        final boolean b = c == a.J;
        final boolean b2 = b || c == a.I;
        final f0 f = k.f();
        final j f2 = a.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("--> ");
        sb.append(k.m());
        sb.append(' ');
        sb.append(k.q());
        String string;
        if (f2 != null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(" ");
            sb2.append(f2.a());
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        String s;
        final String str = s = sb.toString();
        if (!b2) {
            s = str;
            if (f != null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" (");
                sb3.append(f.a());
                sb3.append("-byte body)");
                s = sb3.toString();
            }
        }
        this.d.a(s);
        if (b2) {
            final v i = k.k();
            if (f != null) {
                final okhttp3.y b3 = f.b();
                if (b3 != null && i.h("Content-Type") == null) {
                    final b d = this.d;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Content-Type: ");
                    sb4.append(b3);
                    d.a(sb4.toString());
                }
                if (f.a() != -1L && i.h("Content-Length") == null) {
                    final b d2 = this.d;
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Content-Length: ");
                    sb5.append(f.a());
                    d2.a(sb5.toString());
                }
            }
            for (int size = i.size(), j = 0; j < size; ++j) {
                this.e(i, j);
            }
            b b4 = null;
            String s2 = null;
            Label_0867: {
                StringBuilder sb6;
                String m;
                if (b && f != null) {
                    if (this.b(k.k())) {
                        b4 = this.d;
                        sb6 = new StringBuilder();
                        sb6.append("--> END ");
                        sb6.append(k.m());
                        m = " (encoded body omitted)";
                    }
                    else if (f.p()) {
                        b4 = this.d;
                        sb6 = new StringBuilder();
                        sb6.append("--> END ");
                        sb6.append(k.m());
                        m = " (duplex request body omitted)";
                    }
                    else {
                        if (!f.q()) {
                            final m l = new m();
                            f.r(l);
                            final okhttp3.y b5 = f.b();
                            Charset charset = null;
                            Label_0654: {
                                if (b5 != null) {
                                    charset = b5.f(StandardCharsets.UTF_8);
                                    if (charset != null) {
                                        break Label_0654;
                                    }
                                }
                                charset = StandardCharsets.UTF_8;
                                k0.o((Object)charset, "UTF_8");
                            }
                            this.d.a("");
                            StringBuilder sb7;
                            if (okhttp3.logging.c.a(l)) {
                                this.d.a(l.b3(charset));
                                b4 = this.d;
                                sb7 = new StringBuilder();
                                sb7.append("--> END ");
                                sb7.append(k.m());
                                sb7.append(" (");
                                sb7.append(f.a());
                                sb7.append("-byte body)");
                            }
                            else {
                                b4 = this.d;
                                sb7 = new StringBuilder();
                                sb7.append("--> END ");
                                sb7.append(k.m());
                                sb7.append(" (binary ");
                                sb7.append(f.a());
                                sb7.append("-byte body omitted)");
                            }
                            s2 = sb7.toString();
                            break Label_0867;
                        }
                        b4 = this.d;
                        sb6 = new StringBuilder();
                        sb6.append("--> END ");
                        sb6.append(k.m());
                        m = " (one-shot body omitted)";
                    }
                }
                else {
                    b4 = this.d;
                    sb6 = new StringBuilder();
                    sb6.append("--> END ");
                    m = k.m();
                }
                sb6.append(m);
                s2 = sb6.toString();
            }
            b4.a(s2);
        }
        final long nanoTime = System.nanoTime();
        try {
            final g0 e = a.e(k);
            final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            final h0 r = e.r();
            k0.m((Object)r);
            final long contentLength = r.contentLength();
            String string2;
            if (contentLength != -1L) {
                final StringBuilder sb8 = new StringBuilder();
                sb8.append(contentLength);
                sb8.append("-byte");
                string2 = sb8.toString();
            }
            else {
                string2 = "unknown-length";
            }
            final b d3 = this.d;
            final StringBuilder sb9 = new StringBuilder();
            sb9.append("<-- ");
            sb9.append(e.x());
            String string3;
            if (e.M().length() == 0) {
                string3 = "";
            }
            else {
                final String m2 = e.M();
                final StringBuilder sb10 = new StringBuilder();
                sb10.append(String.valueOf(' '));
                sb10.append(m2);
                string3 = sb10.toString();
            }
            sb9.append(string3);
            sb9.append(' ');
            sb9.append(e.W().q());
            sb9.append(" (");
            sb9.append(millis);
            sb9.append("ms");
            String string4;
            if (!b2) {
                final StringBuilder sb11 = new StringBuilder();
                sb11.append(", ");
                sb11.append(string2);
                sb11.append(" body");
                string4 = sb11.toString();
            }
            else {
                string4 = "";
            }
            sb9.append(string4);
            sb9.append(')');
            d3.a(sb9.toString());
            if (b2) {
                final v j2 = e.J();
                for (int size2 = j2.size(), n = 0; n < size2; ++n) {
                    this.e(j2, n);
                }
                b b6;
                String s3;
                if (b && okhttp3.internal.http.e.c(e)) {
                    if (this.b(e.J())) {
                        b6 = this.d;
                        s3 = "<-- END HTTP (encoded body omitted)";
                    }
                    else {
                        final o source = r.source();
                        source.v(Long.MAX_VALUE);
                        final Object z = source.z();
                        final boolean k2 = kotlin.text.s.K1("gzip", j2.h("Content-Encoding"), true);
                        Object value = null;
                        a = (x.a)z;
                        if (k2) {
                            final long h0 = ((m)z).h0();
                            value = new y(((m)z).d());
                            try {
                                new m().z3((r0)value);
                                kotlin.io.c.a((Closeable)value, (Throwable)null);
                                value = h0;
                            }
                            finally {
                                try {}
                                finally {
                                    kotlin.io.c.a((Closeable)value, (Throwable)a);
                                }
                            }
                        }
                        final okhttp3.y contentType = r.contentType();
                        Charset charset2 = null;
                        Label_1425: {
                            if (contentType != null) {
                                charset2 = contentType.f(StandardCharsets.UTF_8);
                                if (charset2 != null) {
                                    break Label_1425;
                                }
                            }
                            charset2 = StandardCharsets.UTF_8;
                            k0.o((Object)charset2, "UTF_8");
                        }
                        if (!okhttp3.logging.c.a((m)a)) {
                            this.d.a("");
                            final b d4 = this.d;
                            final StringBuilder sb12 = new StringBuilder();
                            sb12.append("<-- END HTTP (binary ");
                            sb12.append(((m)a).h0());
                            sb12.append("-byte body omitted)");
                            d4.a(sb12.toString());
                            return e;
                        }
                        if (contentLength != 0L) {
                            this.d.a("");
                            this.d.a(((m)a).d().b3(charset2));
                        }
                        final b d5 = this.d;
                        String s4;
                        if (value != null) {
                            final StringBuilder sb13 = new StringBuilder();
                            sb13.append("<-- END HTTP (");
                            sb13.append(((m)a).h0());
                            sb13.append("-byte, ");
                            sb13.append(value);
                            sb13.append("-gzipped-byte body)");
                            s4 = sb13.toString();
                        }
                        else {
                            final StringBuilder sb14 = new StringBuilder();
                            sb14.append("<-- END HTTP (");
                            sb14.append(((m)a).h0());
                            sb14.append("-byte body)");
                            s4 = sb14.toString();
                        }
                        d5.a(s4);
                        return e;
                    }
                }
                else {
                    b6 = this.d;
                    s3 = "<-- END HTTP";
                }
                b6.a(s3);
            }
            return e;
        }
        catch (Exception obj) {
            final b d6 = this.d;
            final StringBuilder sb15 = new StringBuilder();
            sb15.append("<-- HTTP FAILED: ");
            sb15.append(obj);
            d6.a(sb15.toString());
            throw obj;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t" }, d2 = { "okhttp3/logging/a$a", "", "Lokhttp3/logging/a$a;", "<init>", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
    public enum a
    {
        G, 
        H, 
        I, 
        J;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00e6\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0005J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007" }, d2 = { "okhttp3/logging/a$b", "", "", "message", "Lkotlin/j2;", "a", "b", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
    public interface b
    {
        @d
        @e
        public static final b a = new a.a();
        public static final a b = new a(null);
        
        void a(@e final String p0);
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004\u00f8\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b" }, d2 = { "okhttp3/logging/a$b$a", "", "Lokhttp3/logging/a$b;", "DEFAULT", "Lokhttp3/logging/a$b;", "<init>", "()V", "a", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
        public static final class a
        {
            private a() {
            }
            
            @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b" }, d2 = { "okhttp3/logging/a$b$a$a", "Lokhttp3/logging/a$b;", "", "message", "Lkotlin/j2;", "a", "<init>", "()V", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
            private static final class a implements b
            {
                public a() {
                }
                
                @Override
                public void a(@e final String s) {
                    k0.p((Object)s, "message");
                    okhttp3.internal.platform.h.n(okhttp3.internal.platform.h.e.g(), s, 0, null, 6, null);
                }
            }
        }
    }
}
