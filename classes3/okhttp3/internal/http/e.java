// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http;

import okhttp3.n;
import okhttp3.w;
import okhttp3.o;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.Map;
import kotlin.collections.y0;
import okhttp3.internal.d;
import java.io.EOFException;
import okio.m;
import kotlin.text.s;
import java.util.ArrayList;
import okhttp3.h;
import java.util.List;
import okhttp3.v;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import okio.p;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u001a\u0010\n\u001a\u00020\t*\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0002\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0006H\u0002\u001a\u0014\u0010\u000f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u001a\u000e\u0010\u0010\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0001*\u00020\u0006H\u0002\u001a\u001a\u0010\u0016\u001a\u00020\t*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0000\u001a\n\u0010\u0018\u001a\u00020\u000b*\u00020\u0017\u001a\u0010\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0017H\u0007\"\u0016\u0010\u001d\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c\"\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001f" }, d2 = { "Lokhttp3/v;", "", "headerName", "", "Lokhttp3/h;", "b", "Lokio/m;", "", "result", "Lkotlin/j2;", "d", "", "h", "", "prefix", "i", "e", "f", "Lokhttp3/o;", "Lokhttp3/w;", "url", "headers", "g", "Lokhttp3/g0;", "c", "response", "a", "Lokio/p;", "Lokio/p;", "TOKEN_DELIMITERS", "QUOTED_STRING_DELIMITERS", "okhttp" }, k = 2, mv = { 1, 4, 0 })
@g(name = "HttpHeaders")
public final class e
{
    private static final p a;
    private static final p b;
    
    static {
        final p.a l = p.L;
        a = l.l("\"\\");
        b = l.l("\t ,=");
    }
    
    @i(level = k.H, message = "No longer supported", replaceWith = @z0(expression = "response.promisesBody()", imports = {}))
    public static final boolean a(@org.jetbrains.annotations.e final g0 g0) {
        k0.p((Object)g0, "response");
        return c(g0);
    }
    
    @org.jetbrains.annotations.e
    public static final List<h> b(@org.jetbrains.annotations.e final v v, @org.jetbrains.annotations.e final String s) {
        k0.p((Object)v, "$this$parseChallenges");
        k0.p((Object)s, "headerName");
        final ArrayList<h> list = new ArrayList<h>();
        for (int size = v.size(), i = 0; i < size; ++i) {
            if (s.K1(s, v.n(i), true)) {
                final m p2 = new m().p1(v.v(i));
                try {
                    d(p2, list);
                }
                catch (EOFException ex) {
                    okhttp3.internal.platform.h.e.g().m("Unable to parse challenge", 5, ex);
                }
            }
        }
        return list;
    }
    
    public static final boolean c(@org.jetbrains.annotations.e final g0 g0) {
        k0.p((Object)g0, "$this$promisesBody");
        if (k0.g((Object)g0.W().m(), (Object)"HEAD")) {
            return false;
        }
        final int x = g0.x();
        return ((x < 100 || x >= 200) && x != 204 && x != 304) || d.x(g0) != -1L || s.K1("chunked", g0.G(g0, "Transfer-Encoding", null, 2, null), true);
    }
    
    private static final void d(final m m, final List<h> list) throws EOFException {
        while (true) {
            String f = null;
            while (true) {
                String f2 = f;
                if (f == null) {
                    h(m);
                    if ((f2 = f(m)) == null) {
                        return;
                    }
                }
                final boolean h = h(m);
                String f3 = f(m);
                if (f3 == null) {
                    if (!m.D1()) {
                        return;
                    }
                    list.add(new h(f2, y0.z()));
                }
                else {
                    final byte b = 61;
                    final int s = d.S(m, b);
                    final boolean h2 = h(m);
                    if (!h && (h2 || m.D1())) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(f3);
                        sb.append(kotlin.text.s.g2("=", s));
                        final Map<String, String> singletonMap = Collections.singletonMap((String)null, sb.toString());
                        k0.o((Object)singletonMap, "Collections.singletonMap\u2026ek + \"=\".repeat(eqCount))");
                        list.add(new h(f2, singletonMap));
                        break;
                    }
                    final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
                    int s2 = s + d.S(m, b);
                    while (true) {
                        f = f3;
                        if (f3 == null) {
                            f = f(m);
                            if (h(m)) {
                                break;
                            }
                            s2 = d.S(m, b);
                        }
                        if (s2 == 0) {
                            break;
                        }
                        if (s2 > 1) {
                            return;
                        }
                        if (h(m)) {
                            return;
                        }
                        String s3;
                        if (i(m, (byte)34)) {
                            s3 = e(m);
                        }
                        else {
                            s3 = f(m);
                        }
                        if (s3 == null) {
                            return;
                        }
                        if (linkedHashMap.put(f, s3) != null) {
                            return;
                        }
                        if (!h(m) && !m.D1()) {
                            return;
                        }
                        f3 = null;
                    }
                    list.add(new h(f2, linkedHashMap));
                    continue;
                }
            }
        }
    }
    
    private static final String e(final m m) throws EOFException {
        final byte byte1 = m.readByte();
        final byte b = 34;
        if (byte1 != b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        final m i = new m();
        while (true) {
            final long y1 = m.Y1(e.a);
            if (y1 == -1L) {
                return null;
            }
            if (m.F(y1) == b) {
                i.t3(m, y1);
                m.readByte();
                return i.y4();
            }
            if (m.h0() == y1 + 1L) {
                return null;
            }
            i.t3(m, y1);
            m.readByte();
            i.t3(m, 1L);
        }
    }
    
    private static final String f(final m m) {
        long n;
        if ((n = m.Y1(e.b)) == -1L) {
            n = m.h0();
        }
        String t0;
        if (n != 0L) {
            t0 = m.t0(n);
        }
        else {
            t0 = null;
        }
        return t0;
    }
    
    public static final void g(@org.jetbrains.annotations.e final o o, @org.jetbrains.annotations.e final w w, @org.jetbrains.annotations.e final v v) {
        k0.p((Object)o, "$this$receiveHeaders");
        k0.p((Object)w, "url");
        k0.p((Object)v, "headers");
        if (o == o.a) {
            return;
        }
        final List<n> g = n.n.g(w, v);
        if (g.isEmpty()) {
            return;
        }
        o.a(w, g);
    }
    
    private static final boolean h(final m m) {
        boolean b = false;
        while (!m.D1()) {
            final byte f = m.F(0L);
            if (f != 9 && f != 32) {
                if (f != 44) {
                    break;
                }
                m.readByte();
                b = true;
            }
            else {
                m.readByte();
            }
        }
        return b;
    }
    
    private static final boolean i(final m m, final byte b) {
        return !m.D1() && m.F(0L) == b;
    }
}
