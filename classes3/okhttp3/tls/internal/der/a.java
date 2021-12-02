// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import java.util.ArrayList;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import java.util.Objects;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import okio.n;
import java.net.ProtocolException;
import kotlin.n1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import kotlin.reflect.d;
import kotlin.s0;
import java.util.List;
import kotlin.j2;
import okio.p;
import java.math.BigInteger;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bJ\u0010KJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\tJm\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00020\u00022\u001a\u0010\u0010\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\"\u0006\u0012\u0002\b\u00030\u000f2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00112\u0016\u0010\u0014\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001a\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00190\u000f2\u001a\u0010\u0018\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u000e\"\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ*\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2\u001a\u0010\u001c\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000f0\u0011Ji\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000f2<\b\u0002\u0010\u0018\u001a\u001e\u0012\u001a\b\u0001\u0012\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00190\u000e\"\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\u00192\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010#R\u001f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u001f\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b+\u0010&R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u001f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u001f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&R\u001f\u00107\u001a\b\u0012\u0004\u0012\u0002060\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b-\u0010&R\u001f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010$\u001a\u0004\b0\u0010&R\u001f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b8\u0010&R:\u0010=\u001a&\u0012\"\u0012 \u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001e\u0012\u000e\u0012\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u000f0\u00190\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010<R\u001f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b3\u0010&R\u001f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010$\u001a\u0004\b@\u0010&R!\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010B0\u00158\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010$\u001a\u0004\bD\u0010&R\u001f\u0010I\u001a\b\u0012\u0004\u0012\u00020F0\u000f8\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010G\u001a\u0004\bC\u0010H¨\u0006L" }, d2 = { "Lokhttp3/tls/internal/der/a;", "", "", "string", "", "t", "(Ljava/lang/String;)J", "date", "e", "(J)Ljava/lang/String;", "s", "d", "T", "name", "", "Lokhttp3/tls/internal/der/j;", "members", "Lkotlin/Function1;", "", "decompose", "construct", "Lokhttp3/tls/internal/der/f;", "u", "(Ljava/lang/String;[Lokhttp3/tls/internal/der/j;Ln6/l;Ln6/l;)Lokhttp3/tls/internal/der/f;", "choices", "Lkotlin/s0;", "c", "([Lokhttp3/tls/internal/der/j;)Lokhttp3/tls/internal/der/j;", "chooser", "v", "Lkotlin/reflect/d;", "", "isOptional", "optionalValue", "a", "([Lkotlin/s0;ZLjava/lang/Object;)Lokhttp3/tls/internal/der/j;", "Lokhttp3/tls/internal/der/f;", "h", "()Lokhttp3/tls/internal/der/f;", "BOOLEAN", "r", "UTF8_STRING", "Lokio/p;", "o", "OCTET_STRING", "k", "q", "UTC_TIME", "i", "p", "PRINTABLE_STRING", "g", "n", "OBJECT_IDENTIFIER", "Ljava/math/BigInteger;", "INTEGER_AS_BIG_INTEGER", "l", "GENERALIZED_TIME", "b", "INTEGER_AS_LONG", "Ljava/util/List;", "defaultAnyChoices", "Lokhttp3/tls/internal/der/g;", "BIT_STRING", "j", "IA5_STRING", "Lkotlin/j2;", "f", "m", "NULL", "Lokhttp3/tls/internal/der/c;", "Lokhttp3/tls/internal/der/j;", "()Lokhttp3/tls/internal/der/j;", "ANY_VALUE", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class a
{
    @e
    private static final f<Boolean> a;
    @e
    private static final f<Long> b;
    @e
    private static final f<BigInteger> c;
    @e
    private static final f<g> d;
    @e
    private static final f<p> e;
    @e
    private static final f<j2> f;
    @e
    private static final f<String> g;
    @e
    private static final f<String> h;
    @e
    private static final f<String> i;
    @e
    private static final f<String> j;
    @e
    private static final f<Long> k;
    @e
    private static final f<Long> l;
    @e
    private static final j<c> m;
    private static final List<s0<d<?>, j<?>>> n;
    public static final a o;
    
    static {
        o = new a();
        final f<Boolean> f2 = (f<Boolean>)(a = new f<Boolean>("BOOLEAN", 0, 1L, (f.a)new f.a<Boolean>() {
            @e
            public Boolean c(@e final l l) {
                k0.p((Object)l, "reader");
                return l.q();
            }
            
            public void d(@e final m m, final boolean b) {
                k0.p((Object)m, "writer");
                m.j(b);
            }
        }, false, null, false, 112, null));
        b = new f<Long>("INTEGER", 0, 2L, (f.a)new f.a<Long>() {
            @e
            public Long c(@e final l l) {
                k0.p((Object)l, "reader");
                return l.s();
            }
            
            public void d(@e final m m, final long n) {
                k0.p((Object)m, "writer");
                m.k(n);
            }
        }, false, null, false, 112, null);
        n = v.L((Object[])new s0[] { n1.a((Object)k1.d((Class)Boolean.TYPE), (Object)f2), n1.a((Object)k1.d((Class)BigInteger.class), (Object)(c = new f<BigInteger>("INTEGER", 0, 2L, (f.a)new f.a<BigInteger>() {
                @e
                public BigInteger c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.o();
                }
                
                public void d(@e final m m, @e final BigInteger bigInteger) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)bigInteger, "value");
                    m.h(bigInteger);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)g.class), (Object)(d = new f<g>("BIT STRING", 0, 3L, (f.a)new f.a<g>() {
                @e
                public g c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.p();
                }
                
                public void d(@e final m m, @e final g g) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)g, "value");
                    m.i(g);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)p.class), (Object)(e = new f<p>("OCTET STRING", 0, 4L, (f.a)new f.a<p>() {
                @e
                public p c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.u();
                }
                
                public void d(@e final m m, @e final p p2) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)p2, "value");
                    m.m(p2);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)j2.class), (Object)(f = new f<j2>("NULL", 0, 5L, (f.a)new f.a<j2>() {
                @org.jetbrains.annotations.f
                public Void c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return null;
                }
                
                public void d(@e final m m, @org.jetbrains.annotations.f final j2 j2) {
                    k0.p((Object)m, "writer");
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)Void.class), (Object)(g = new f<String>("OBJECT IDENTIFIER", 0, 6L, (f.a)new f.a<String>() {
                @e
                public String c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.t();
                }
                
                public void d(@e final m m, @e final String s) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)s, "value");
                    m.l(s);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)Void.class), (Object)(h = new f<String>("UTF8", 0, 12L, (f.a)new f.a<String>() {
                @e
                public String c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.x();
                }
                
                public void d(@e final m m, @e final String s) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)s, "value");
                    m.o(s);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)String.class), (Object)(i = new f<String>("PRINTABLE STRING", 0, 19L, (f.a)new f.a<String>() {
                @e
                public String c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.x();
                }
                
                public void d(@e final m m, @e final String s) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)s, "value");
                    m.o(s);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)Void.class), (Object)(j = new f<String>("IA5 STRING", 0, 22L, (f.a)new f.a<String>() {
                @e
                public String c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return l.x();
                }
                
                public void d(@e final m m, @e final String s) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)s, "value");
                    m.o(s);
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)Void.class), (Object)(k = new f<Long>("UTC TIME", 0, 23L, (f.a)new f.a<Long>() {
                @e
                public Long c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return a.o.t(l.x());
                }
                
                public void d(@e final m m, final long n) {
                    k0.p((Object)m, "writer");
                    m.o(a.o.e(n));
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)Long.TYPE), (Object)(l = new f<Long>("GENERALIZED TIME", 0, 24L, (f.a)new f.a<Long>() {
                @e
                public Long c(@e final l l) {
                    k0.p((Object)l, "reader");
                    return a.o.s(l.x());
                }
                
                public void d(@e final m m, final long n) {
                    k0.p((Object)m, "writer");
                    m.o(a.o.d(n));
                }
            }, false, null, false, 112, null))), n1.a((Object)k1.d((Class)c.class), (Object)(m = new j<c>() {
                @Override
                public boolean a(@e final k k) {
                    k0.p((Object)k, "header");
                    return true;
                }
                
                @e
                @Override
                public f<c> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
                    return a.f((j<c>)this, n, n2, b);
                }
                
                @e
                @Override
                public f<List<c>> e() {
                    return a.c((j<c>)this);
                }
                
                @e
                @Override
                public f<List<c>> g(@e final String s, final int n, final long n2) {
                    k0.p((Object)s, "name");
                    return a.a((j<c>)this, s, n, n2);
                }
                
                @e
                public c i(@e final l l) {
                    k0.p((Object)l, "reader");
                    if (l.l()) {
                        final k e = l.e(l);
                        k0.m((Object)e);
                        l.h(l, null);
                        final long c = l.c(l);
                        final boolean b = l.b(l);
                        long n;
                        if (e.h() != -1L) {
                            n = l.a(l) + e.h();
                        }
                        else {
                            n = -1L;
                        }
                        if (c != -1L && n > c) {
                            throw new ProtocolException("enclosed object too large");
                        }
                        l.g(l, n);
                        l.f(l, e.g());
                        l.d(l).add("ANY");
                        try {
                            return new c(e.j(), e.i(), e.g(), e.h(), l.w());
                        }
                        finally {
                            l.h(l, null);
                            l.g(l, c);
                            l.f(l, b);
                            l.d(l).remove(l.d(l).size() - 1);
                        }
                    }
                    throw new ProtocolException("expected a value");
                }
                
                @e
                public c j(@e final p p) {
                    k0.p((Object)p, "byteString");
                    return a.d((j<c>)this, p);
                }
                
                @e
                public p k(@e final c c) {
                    k0.p((Object)c, "value");
                    return a.e(this, c);
                }
                
                public void l(@e final m m, @e final c c) {
                    k0.p((Object)m, "writer");
                    k0.p((Object)c, "value");
                    m.g("ANY", c.l(), c.k(), (n6.l<? super n, j2>)new n6.l<n, j2>() {
                        public final void a(@e final n n) {
                            k0.p((Object)n, "it");
                            m.m(c.h());
                            m.c(c.i());
                        }
                    });
                }
            })) });
    }
    
    private a() {
    }
    
    @e
    public final j<Object> a(@e final s0<? extends d<?>, ? extends j<?>>[] array, final boolean b, @org.jetbrains.annotations.f final Object o) {
        k0.p((Object)array, "choices");
        return new j<Object>() {
            @Override
            public boolean a(@e final k k) {
                k0.p((Object)k, "header");
                return true;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object b(@e final l l) {
                k0.p((Object)l, "reader");
                if (b && !l.l()) {
                    return o;
                }
                final k m = l.m();
                if (m != null) {
                    final s0[] c = array;
                    for (int length = c.length, i = 0; i < length; ++i) {
                        final j j = (j)c[i].b();
                        if (j.a(m)) {
                            return j.b(l);
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("expected any but was ");
                    sb.append(m);
                    sb.append(" at ");
                    sb.append(l);
                    throw new ProtocolException(sb.toString());
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("expected a value at ");
                sb2.append(l);
                throw new ProtocolException(sb2.toString());
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object c(@e final p p) {
                k0.p((Object)p, "byteString");
                return okhttp3.tls.internal.der.j.a.d((j<Object>)this, p);
            }
            
            @e
            @Override
            public f<Object> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
                return okhttp3.tls.internal.der.j.a.f((j<Object>)this, n, n2, b);
            }
            
            @e
            @Override
            public f<List<Object>> e() {
                return okhttp3.tls.internal.der.j.a.c((j<Object>)this);
            }
            
            @e
            @Override
            public p f(@org.jetbrains.annotations.f final Object o) {
                return okhttp3.tls.internal.der.j.a.e(this, o);
            }
            
            @e
            @Override
            public f<List<Object>> g(@e final String s, final int n, final long n2) {
                k0.p((Object)s, "name");
                return okhttp3.tls.internal.der.j.a.a((j<Object>)this, s, n, n2);
            }
            
            @Override
            public void h(@e final m m, @org.jetbrains.annotations.f final Object o) {
                k0.p((Object)m, "writer");
                if (!b || !k0.g(o, o)) {
                    for (final s0 s0 : array) {
                        final d d = (d)s0.a();
                        final j obj = (j)s0.b();
                        if (d.S(o) || (o == null && k0.g((Object)d, (Object)k1.d((Class)j2.class)))) {
                            Objects.requireNonNull(obj, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                            obj.h(m, o);
                            break;
                        }
                    }
                }
            }
        };
    }
    
    @e
    public final j<s0<j<?>, Object>> c(@e final j<?>... array) {
        k0.p((Object)array, "choices");
        return (j<s0<j<?>, Object>>)new j<s0<? extends j<?>, ?>>() {
            @Override
            public boolean a(@e final k k) {
                k0.p((Object)k, "header");
                return true;
            }
            
            @e
            @Override
            public f<s0<j<?>, Object>> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
                return okhttp3.tls.internal.der.j.a.f((j<s0<j<?>, Object>>)this, n, n2, b);
            }
            
            @e
            @Override
            public f<List<s0<j<?>, Object>>> e() {
                return okhttp3.tls.internal.der.j.a.c((j<s0<j<?>, Object>>)this);
            }
            
            @e
            @Override
            public f<List<s0<j<?>, Object>>> g(@e final String s, final int n, final long n2) {
                k0.p((Object)s, "name");
                return okhttp3.tls.internal.der.j.a.a((j<s0<j<?>, Object>>)this, s, n, n2);
            }
            
            @e
            public s0<j<?>, Object> i(@e final l l) {
                k0.p((Object)l, "reader");
                final k m = l.m();
                if (m != null) {
                    final j[] a = array;
                    final int length = a.length;
                    int i = 0;
                    while (true) {
                        while (i < length) {
                            final j<Object> j = (j<Object>)a[i];
                            if (j.a(m)) {
                                if (j != null) {
                                    return (s0<j<?>, Object>)n1.a((Object)j, j.b(l));
                                }
                                final StringBuilder sb = new StringBuilder();
                                sb.append("expected a matching choice but was ");
                                sb.append(m);
                                sb.append(" at ");
                                sb.append(l);
                                throw new ProtocolException(sb.toString());
                            }
                            else {
                                ++i;
                            }
                        }
                        final j<Object> j = null;
                        continue;
                    }
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("expected a value at ");
                sb2.append(l);
                throw new ProtocolException(sb2.toString());
            }
            
            @e
            public s0<j<?>, Object> j(@e final p p) {
                k0.p((Object)p, "byteString");
                return (s0<j<?>, Object>)okhttp3.tls.internal.der.j.a.d((j<s0>)this, p);
            }
            
            @e
            public p k(@e final s0<? extends j<?>, ?> s0) {
                k0.p((Object)s0, "value");
                return okhttp3.tls.internal.der.j.a.e(this, s0);
            }
            
            public void l(@e final m m, @e final s0<? extends j<?>, ?> s0) {
                k0.p((Object)m, "writer");
                k0.p((Object)s0, "value");
                final j obj = (j)s0.a();
                final Object b = s0.b();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                obj.h(m, b);
            }
            
            @e
            @Override
            public String toString() {
                return kotlin.collections.m.Ig((Object[])array, (CharSequence)" OR ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (n6.l)null, 62, (Object)null);
            }
        };
    }
    
    @e
    public final String d(final long l) {
        final TimeZone timeZone = TimeZone.getTimeZone("GMT");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        final String format = simpleDateFormat.format(l);
        k0.o((Object)format, "dateFormat.format(date)");
        return format;
    }
    
    @e
    public final String e(final long l) {
        final TimeZone timeZone = TimeZone.getTimeZone("GMT");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        final String format = simpleDateFormat.format(l);
        k0.o((Object)format, "dateFormat.format(date)");
        return format;
    }
    
    @e
    public final j<c> f() {
        return okhttp3.tls.internal.der.a.m;
    }
    
    @e
    public final f<g> g() {
        return okhttp3.tls.internal.der.a.d;
    }
    
    @e
    public final f<Boolean> h() {
        return okhttp3.tls.internal.der.a.a;
    }
    
    @e
    public final f<Long> i() {
        return okhttp3.tls.internal.der.a.l;
    }
    
    @e
    public final f<String> j() {
        return okhttp3.tls.internal.der.a.j;
    }
    
    @e
    public final f<BigInteger> k() {
        return okhttp3.tls.internal.der.a.c;
    }
    
    @e
    public final f<Long> l() {
        return okhttp3.tls.internal.der.a.b;
    }
    
    @e
    public final f<j2> m() {
        return okhttp3.tls.internal.der.a.f;
    }
    
    @e
    public final f<String> n() {
        return okhttp3.tls.internal.der.a.g;
    }
    
    @e
    public final f<p> o() {
        return okhttp3.tls.internal.der.a.e;
    }
    
    @e
    public final f<String> p() {
        return okhttp3.tls.internal.der.a.i;
    }
    
    @e
    public final f<Long> q() {
        return okhttp3.tls.internal.der.a.k;
    }
    
    @e
    public final f<String> r() {
        return okhttp3.tls.internal.der.a.h;
    }
    
    public final long s(@e final String s) {
        k0.p((Object)s, "string");
        final TimeZone timeZone = TimeZone.getTimeZone("GMT");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        try {
            final Date parse = simpleDateFormat.parse(s);
            k0.o((Object)parse, "parsed");
            return parse.getTime();
        }
        catch (ParseException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse GeneralizedTime ");
            sb.append(s);
            throw new ProtocolException(sb.toString());
        }
    }
    
    public final long t(@e final String s) {
        k0.p((Object)s, "string");
        final TimeZone timeZone = TimeZone.getTimeZone("GMT");
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyMMddHHmmss'Z'");
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.set2DigitYearStart(new Date(-631152000000L));
        try {
            final Date parse = simpleDateFormat.parse(s);
            k0.o((Object)parse, "parsed");
            return parse.getTime();
        }
        catch (ParseException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse UTCTime ");
            sb.append(s);
            throw new ProtocolException(sb.toString());
        }
    }
    
    @e
    public final <T> f<T> u(@e final String s, @e final j<?>[] array, @e final n6.l<? super T, ? extends List<?>> l, @e final n6.l<? super List<?>, ? extends T> i) {
        k0.p((Object)s, "name");
        k0.p((Object)array, "members");
        k0.p((Object)l, "decompose");
        k0.p((Object)i, "construct");
        return new f<T>(s, 0, 16L, (f.a)new f.a<T>() {
            @Override
            public T a(@e final l l) {
                k0.p((Object)l, "reader");
                return l.A((a<? extends T>)new a<T>() {
                    public final T invoke() {
                        final ArrayList<Object> list = new ArrayList<Object>();
                        while (true) {
                            final int size = list.size();
                            final j[] a = array;
                            if (size >= a.length) {
                                break;
                            }
                            list.add(a[list.size()].b(l));
                        }
                        if (!l.l()) {
                            return (T)i.invoke((Object)list);
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unexpected ");
                        sb.append(l.m());
                        sb.append(" at ");
                        sb.append(l);
                        throw new ProtocolException(sb.toString());
                    }
                });
            }
            
            @Override
            public void b(@e final m m, final T t) {
                k0.p((Object)m, "writer");
                m.f((a<?>)new a<j2>() {
                    final /* synthetic */ List H = (List)l.invoke((Object)t);
                    
                    public final void invoke() {
                        for (int size = this.H.size(), i = 0; i < size; ++i) {
                            final j obj = array[i];
                            Objects.requireNonNull(obj, "null cannot be cast to non-null type okhttp3.tls.internal.der.DerAdapter<kotlin.Any?>");
                            obj.h(m, this.H.get(i));
                        }
                    }
                });
            }
        }, false, null, false, 112, null);
    }
    
    @e
    public final j<Object> v(@e final n6.l<Object, ? extends j<?>> l) {
        k0.p((Object)l, "chooser");
        return new j<Object>() {
            @Override
            public boolean a(@e final k k) {
                k0.p((Object)k, "header");
                return true;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object b(@e final l l) {
                k0.p((Object)l, "reader");
                final j j = (j)l.invoke(l.k());
                Object o;
                if (j != null) {
                    o = j.b(l);
                }
                else {
                    o = l.w();
                }
                return o;
            }
            
            @org.jetbrains.annotations.f
            @Override
            public Object c(@e final p p) {
                k0.p((Object)p, "byteString");
                return okhttp3.tls.internal.der.j.a.d((j<Object>)this, p);
            }
            
            @e
            @Override
            public f<Object> d(final int n, final long n2, @org.jetbrains.annotations.f final Boolean b) {
                return okhttp3.tls.internal.der.j.a.f((j<Object>)this, n, n2, b);
            }
            
            @e
            @Override
            public f<List<Object>> e() {
                return okhttp3.tls.internal.der.j.a.c((j<Object>)this);
            }
            
            @e
            @Override
            public p f(@org.jetbrains.annotations.f final Object o) {
                return okhttp3.tls.internal.der.j.a.e(this, o);
            }
            
            @e
            @Override
            public f<List<Object>> g(@e final String s, final int n, final long n2) {
                k0.p((Object)s, "name");
                return okhttp3.tls.internal.der.j.a.a((j<Object>)this, s, n, n2);
            }
            
            @Override
            public void h(@e final m m, @org.jetbrains.annotations.f final Object obj) {
                k0.p((Object)m, "writer");
                final j j = (j)l.invoke(m.b());
                if (j != null) {
                    j.h(m, obj);
                }
                else {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type okio.ByteString");
                    m.m((p)obj);
                }
            }
        };
    }
}
