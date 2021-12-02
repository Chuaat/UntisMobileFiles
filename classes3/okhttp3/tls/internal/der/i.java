// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.collections.v;
import kotlin.n1;
import kotlin.jvm.internal.k1;
import java.net.ProtocolException;
import kotlin.jvm.internal.k0;
import java.util.List;
import kotlin.s0;
import okio.p;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b:\u0010;R\u001e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000bR.\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00110\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\t\u001a\u0004\b\u0013\u0010\u000bR4\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0019\u0010\u001aR4\u0010\u001e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u001aR\"\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\t\u001a\u0004\b!\u0010\u000bR\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\tR4\u0010%\u001a \u0012\u001c\u0012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00180\u00110\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\tR\"\u0010)\u001a\b\u0012\u0004\u0012\u00020&0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010\t\u001a\u0004\b(\u0010\u000bR\"\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010\t\u001a\u0004\b#\u0010\u000bR\"\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0019\u0010\t\u001a\u0004\b\b\u0010\u000bR\"\u00100\u001a\b\u0012\u0004\u0012\u00020/0\u00068\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\"\u00103\u001a\b\u0012\u0004\u0012\u0002010\u00028\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b\u001c\u0010\u001aR\u001c\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\tR\u001e\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\tR\u001c\u00109\u001a\b\u0012\u0004\u0012\u0002070\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010\t¨\u0006<" }, d2 = { "Lokhttp3/tls/internal/der/i;", "", "Lokhttp3/tls/internal/der/j;", "c", "Lokhttp3/tls/internal/der/j;", "algorithmParameters", "Lokhttp3/tls/internal/der/f;", "Lokio/p;", "g", "Lokhttp3/tls/internal/der/f;", "h", "()Lokhttp3/tls/internal/der/f;", "generalNameIpAddress", "Lokhttp3/tls/internal/der/n;", "k", "e", "extension", "", "Lokhttp3/tls/internal/der/d;", "m", "rdnSequence", "Lokhttp3/tls/internal/der/r;", "p", "tbsCertificate", "Lkotlin/s0;", "f", "()Lokhttp3/tls/internal/der/j;", "generalName", "n", "i", "name", "Lokhttp3/tls/internal/der/h;", "q", "d", "certificate", "l", "attributeTypeAndValue", "subjectAlternativeName", "Lokhttp3/tls/internal/der/p;", "r", "j", "privateKeyInfo", "Lokhttp3/tls/internal/der/q;", "o", "subjectPublicKeyInfo", "", "generalNameDnsName", "Lokhttp3/tls/internal/der/b;", "algorithmIdentifier", "", "a", "time", "Lokhttp3/tls/internal/der/e;", "basicConstraints", "extensionValue", "Lokhttp3/tls/internal/der/s;", "b", "validity", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class i
{
    @e
    private static final j<Long> a;
    private static final f<s> b;
    private static final j<Object> c;
    @e
    private static final f<b> d;
    private static final f<okhttp3.tls.internal.der.e> e;
    @e
    private static final f<String> f;
    @e
    private static final f<p> g;
    @e
    private static final j<s0<j<?>, Object>> h;
    private static final f<List<s0<j<?>, Object>>> i;
    private static final f<Object> j;
    @e
    private static final f<n> k;
    private static final f<d> l;
    @e
    private static final f<List<List<d>>> m;
    @e
    private static final j<s0<j<?>, Object>> n;
    @e
    private static final f<q> o;
    @e
    private static final f<r> p;
    @e
    private static final f<h> q;
    @e
    private static final f<okhttp3.tls.internal.der.p> r;
    public static final i s;
    
    static {
        s = new i();
        final j<Long> j2 = (j<Long>)(a = new j<Long>() {
            @Override
            public boolean a(@e final k k) {
                k0.p((Object)k, "header");
                final okhttp3.tls.internal.der.a o = a.o;
                return o.q().a(k) || o.i().a(k);
            }
            
            @e
            @Override
            public f<Long> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
                return a.f((j<Long>)this, n, n2, b);
            }
            
            @e
            @Override
            public f<List<Long>> e() {
                return a.c((j<Long>)this);
            }
            
            @e
            @Override
            public f<List<Long>> g(@e final String s, final int n, final long n2) {
                k0.p((Object)s, "name");
                return a.a((j<Long>)this, s, n, n2);
            }
            
            @e
            public Long i(@e final l l) {
                k0.p((Object)l, "reader");
                final k m = l.m();
                if (m != null) {
                    final int j = m.j();
                    final okhttp3.tls.internal.der.a o = a.o;
                    f<Long> f;
                    if (j == o.q().v() && m.i() == o.q().u()) {
                        f = o.q();
                    }
                    else {
                        if (m.j() != o.i().v() || m.i() != o.i().u()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("expected time but was ");
                            sb.append(m);
                            sb.append(" at ");
                            sb.append(l);
                            throw new ProtocolException(sb.toString());
                        }
                        f = o.i();
                    }
                    return f.b(l).longValue();
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("expected time but was exhausted at ");
                sb2.append(l);
                throw new ProtocolException(sb2.toString());
            }
            
            @e
            public Long j(@e final p p) {
                k0.p((Object)p, "byteString");
                return a.d((j<Long>)this, p);
            }
            
            @e
            public p k(final long l) {
                return a.e(this, l);
            }
            
            public void l(@e final m m, final long l) {
                k0.p((Object)m, "writer");
                f<Long> f = null;
                Label_0044: {
                    if (-631152000000L <= l) {
                        if (2524608000000L > l) {
                            f = a.o.q();
                            break Label_0044;
                        }
                    }
                    f = a.o.i();
                }
                f.h(m, l);
            }
        });
        final a o2 = okhttp3.tls.internal.der.a.o;
        final f<s> f2 = (f<s>)(b = o2.u("Validity", (j<?>[])new j[] { j2, j2 }, (n6.l<? super s, ? extends List<?>>)i$t.G, (n6.l<? super List<?>, ? extends s>)i$u.G));
        final f<b> f3 = (f<b>)(d = o2.u("AlgorithmIdentifier", (j<?>[])new j[] { o2.n().j(), c = o2.v((n6.l<Object, ? extends j<?>>)i$c.G) }, (n6.l<? super b, ? extends List<?>>)i$a.G, (n6.l<? super List<?>, ? extends b>)i$b.G));
        final f<Boolean> h2 = o2.h();
        final Boolean false = Boolean.FALSE;
        e = o2.u("BasicConstraints", (j<?>[])new j[] { h2.x(false), okhttp3.tls.internal.der.f.y((f<Object>)o2.l(), null, 1, null) }, (n6.l<? super Object, ? extends List<?>>)i$f.G, (n6.l<? super List<?>, ?>)i$g.G);
        i = okhttp3.tls.internal.der.j.a.b(h = o2.c(f = okhttp3.tls.internal.der.f.A((f<Object>)o2.j(), 0, 2L, 1, null), g = okhttp3.tls.internal.der.f.A((f<Object>)o2.o(), 0, 7L, 1, null), o2.f()), null, 0, 0L, 7, null);
        final f<n> f4 = (f<n>)(k = o2.u("Extension", (j<?>[])new j[] { o2.n().j(), o2.h().x(false), j = o2.v((n6.l<Object, ? extends j<?>>)i$l.G).d(o2.o().v(), o2.o().u(), false) }, (n6.l<? super n, ? extends List<?>>)i$j.G, (n6.l<? super List<?>, ? extends n>)i$k.G));
        final j<s0<j<?>, Object>> j3 = (j<s0<j<?>, Object>>)(n = o2.c(m = okhttp3.tls.internal.der.j.a.b((l = o2.u("AttributeTypeAndValue", (j<?>[])new j[] { o2.n(), okhttp3.tls.internal.der.a.b(o2, new s0[] { n1.a((Object)k1.d((Class)String.class), (Object)o2.r()), n1.a((Object)k1.d((Class)Void.class), (Object)o2.p()), n1.a((Object)k1.d((Class)c.class), (Object)o2.f()) }, false, null, 6, null) }, (n6.l<? super d, ? extends List<?>>)i$d.G, (n6.l<? super List<?>, ? extends d>)i$e.G)).e(), null, 0, 0L, 7, null)));
        q = o2.u("Certificate", (j<?>[])new j[] { p = o2.u("TBSCertificate", (j<?>[])new j[] { okhttp3.tls.internal.der.j.a.g(o2.l(), 0, 0L, null, 5, null).x(0L), o2.k(), f3, j3, f2, j3, o = o2.u("SubjectPublicKeyInfo", (j<?>[])new j[] { f3, o2.g() }, (n6.l<? super q, ? extends List<?>>)i$o.G, (n6.l<? super List<?>, ? extends q>)i$p.G), okhttp3.tls.internal.der.f.y(okhttp3.tls.internal.der.f.A((f<Object>)o2.g(), 0, 1L, 1, null), null, 1, null), okhttp3.tls.internal.der.f.y(okhttp3.tls.internal.der.f.A((f<Object>)o2.g(), 0, 2L, 1, null), null, 1, null), okhttp3.tls.internal.der.j.a.g(okhttp3.tls.internal.der.j.a.b(f4, null, 0, 0L, 7, null), 0, 3L, null, 5, null).x(v.E()) }, (n6.l<? super Object, ? extends List<?>>)i$q.G, (n6.l<? super List<?>, ?>)i$r.G), f3, o2.g() }, (n6.l<? super Object, ? extends List<?>>)i$h.G, (n6.l<? super List<?>, ?>)i$i.G);
        r = o2.u("PrivateKeyInfo", (j<?>[])new j[] { o2.l(), f3, o2.o() }, (n6.l<? super Object, ? extends List<?>>)i$m.G, (n6.l<? super List<?>, ?>)i$n.G);
    }
    
    private i() {
    }
    
    @e
    public final f<b> c() {
        return okhttp3.tls.internal.der.i.d;
    }
    
    @e
    public final f<h> d() {
        return okhttp3.tls.internal.der.i.q;
    }
    
    @e
    public final f<n> e() {
        return okhttp3.tls.internal.der.i.k;
    }
    
    @e
    public final j<s0<j<?>, Object>> f() {
        return okhttp3.tls.internal.der.i.h;
    }
    
    @e
    public final f<String> g() {
        return okhttp3.tls.internal.der.i.f;
    }
    
    @e
    public final f<p> h() {
        return okhttp3.tls.internal.der.i.g;
    }
    
    @e
    public final j<s0<j<?>, Object>> i() {
        return okhttp3.tls.internal.der.i.n;
    }
    
    @e
    public final f<okhttp3.tls.internal.der.p> j() {
        return okhttp3.tls.internal.der.i.r;
    }
    
    @e
    public final f<List<List<d>>> k() {
        return okhttp3.tls.internal.der.i.m;
    }
    
    @e
    public final f<q> l() {
        return okhttp3.tls.internal.der.i.o;
    }
    
    @e
    public final f<r> m() {
        return okhttp3.tls.internal.der.i.p;
    }
    
    @e
    public final j<Long> n() {
        return okhttp3.tls.internal.der.i.a;
    }
}
