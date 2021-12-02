// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Objects;
import kotlin.collections.v;
import java.util.ArrayList;
import m6.g;
import kotlin.z0;
import kotlin.k;
import java.util.List;
import kotlin.comparisons.a;
import java.util.Comparator;
import kotlin.jvm.internal.k0;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.f;
import java.util.Arrays;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 \u001d2\u00020\u0001:\u0002\t\rB9\b\u0000\u0012\u0006\u0010\u001c\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f\u0012\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f¢\u0006\u0004\b(\u0010)J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0017\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0002J\u0013\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0016R\u0019\u0010\u001c\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u001e\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u001e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010$\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010\nR\u001b\u0010&\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078G@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010\nR\u001e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010!¨\u0006*" }, d2 = { "Lokhttp3/l;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "j", "", "Lokhttp3/i;", "a", "()Ljava/util/List;", "Lokhttp3/j0;", "c", "b", "()Z", "Lkotlin/j2;", "f", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "h", "other", "equals", "", "hashCode", "", "toString", "Z", "i", "isTls", "k", "supportsTlsExtensions", "", "d", "[Ljava/lang/String;", "tlsVersionsAsString", "l", "tlsVersions", "g", "cipherSuites", "cipherSuitesAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class l
{
    private static final i[] e;
    private static final i[] f;
    @d
    @e
    public static final l g;
    @d
    @e
    public static final l h;
    @d
    @e
    public static final l i;
    @d
    @e
    public static final l j;
    public static final b k;
    private final boolean a;
    private final boolean b;
    private final String[] c;
    private final String[] d;
    
    static {
        k = new b(null);
        final i[] array = new i[9];
        final i n1 = okhttp3.i.n1;
        array[0] = n1;
        final i o1 = okhttp3.i.o1;
        array[1] = o1;
        final i p1 = okhttp3.i.p1;
        array[2] = p1;
        final i z0 = okhttp3.i.Z0;
        array[3] = z0;
        final i d1 = okhttp3.i.d1;
        array[4] = d1;
        final i a1 = okhttp3.i.a1;
        array[5] = a1;
        final i e2 = okhttp3.i.e1;
        array[6] = e2;
        final i k2 = okhttp3.i.k1;
        array[7] = k2;
        final i j2 = okhttp3.i.j1;
        array[8] = j2;
        e = array;
        final i[] array2 = f = new i[] { n1, o1, p1, z0, d1, a1, e2, k2, j2, okhttp3.i.K0, okhttp3.i.L0, okhttp3.i.i0, okhttp3.i.j0, okhttp3.i.G, okhttp3.i.K, okhttp3.i.k };
        final a e3 = new a(true).e((i[])Arrays.copyOf(array, array.length));
        final j0 h2 = j0.H;
        final j0 l = j0.I;
        g = e3.p(h2, l).n(true).c();
        h = new a(true).e((i[])Arrays.copyOf(array2, array2.length)).p(h2, l).n(true).c();
        i = new a(true).e((i[])Arrays.copyOf(array2, array2.length)).p(h2, l, j0.J, j0.K).n(true).c();
        j = new a(false).c();
    }
    
    public l(final boolean a, final boolean b, @f final String[] c, @f final String[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final /* synthetic */ String[] d(final l l) {
        return l.c;
    }
    
    public static final /* synthetic */ String[] e(final l l) {
        return l.d;
    }
    
    private final l j(final SSLSocket sslSocket, final boolean b) {
        String[] array;
        if (this.c != null) {
            final String[] enabledCipherSuites = sslSocket.getEnabledCipherSuites();
            k0.o((Object)enabledCipherSuites, "sslSocket.enabledCipherSuites");
            array = okhttp3.internal.d.I(enabledCipherSuites, this.c, okhttp3.i.s1.c());
        }
        else {
            array = sslSocket.getEnabledCipherSuites();
        }
        String[] original;
        if (this.d != null) {
            final String[] enabledProtocols = sslSocket.getEnabledProtocols();
            k0.o((Object)enabledProtocols, "sslSocket.enabledProtocols");
            original = okhttp3.internal.d.I(enabledProtocols, this.d, kotlin.comparisons.a.l());
        }
        else {
            original = sslSocket.getEnabledProtocols();
        }
        final String[] supportedCipherSuites = sslSocket.getSupportedCipherSuites();
        k0.o((Object)supportedCipherSuites, "supportedCipherSuites");
        final int a = okhttp3.internal.d.A(supportedCipherSuites, "TLS_FALLBACK_SCSV", okhttp3.i.s1.c());
        String[] o = array;
        if (b) {
            o = array;
            if (a != -1) {
                k0.o((Object)array, "cipherSuitesIntersection");
                final String s = supportedCipherSuites[a];
                k0.o((Object)s, "supportedCipherSuites[indexOfFallbackScsv]");
                o = okhttp3.internal.d.o(array, s);
            }
        }
        final a a2 = new a(this);
        k0.o((Object)o, "cipherSuitesIntersection");
        final a d = a2.d((String[])Arrays.copyOf(o, o.length));
        k0.o((Object)original, "tlsVersionsIntersection");
        return d.o((String[])Arrays.copyOf(original, original.length)).c();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "cipherSuites", imports = {}))
    @g(name = "-deprecated_cipherSuites")
    @f
    public final List<i> a() {
        return this.g();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "supportsTlsExtensions", imports = {}))
    @g(name = "-deprecated_supportsTlsExtensions")
    public final boolean b() {
        return this.b;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "tlsVersions", imports = {}))
    @g(name = "-deprecated_tlsVersions")
    @f
    public final List<j0> c() {
        return this.l();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (!(o instanceof l)) {
            return false;
        }
        if (o == this) {
            return true;
        }
        final boolean a = this.a;
        final l l = (l)o;
        if (a != l.a) {
            return false;
        }
        if (a) {
            if (!Arrays.equals(this.c, l.c)) {
                return false;
            }
            if (!Arrays.equals(this.d, l.d)) {
                return false;
            }
            if (this.b != l.b) {
                return false;
            }
        }
        return true;
    }
    
    public final void f(@e final SSLSocket sslSocket, final boolean b) {
        k0.p((Object)sslSocket, "sslSocket");
        final l j = this.j(sslSocket, b);
        if (j.l() != null) {
            sslSocket.setEnabledProtocols(j.d);
        }
        if (j.g() != null) {
            sslSocket.setEnabledCipherSuites(j.c);
        }
    }
    
    @g(name = "cipherSuites")
    @f
    public final List<i> g() {
        final String[] c = this.c;
        List<i> i2;
        if (c != null) {
            final ArrayList list = new ArrayList<i>(c.length);
            for (int length = c.length, i = 0; i < length; ++i) {
                list.add(okhttp3.i.s1.b(c[i]));
            }
            i2 = (List<i>)v.I5((Iterable)list);
        }
        else {
            i2 = null;
        }
        return i2;
    }
    
    public final boolean h(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "socket");
        if (!this.a) {
            return false;
        }
        final String[] d = this.d;
        if (d != null && !okhttp3.internal.d.w(d, sslSocket.getEnabledProtocols(), kotlin.comparisons.a.l())) {
            return false;
        }
        final String[] c = this.c;
        return c == null || okhttp3.internal.d.w(c, sslSocket.getEnabledCipherSuites(), okhttp3.i.s1.c());
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.a) {
            final String[] c = this.c;
            int hashCode = 0;
            int hashCode2;
            if (c != null) {
                hashCode2 = Arrays.hashCode(c);
            }
            else {
                hashCode2 = 0;
            }
            final String[] d = this.d;
            if (d != null) {
                hashCode = Arrays.hashCode(d);
            }
            n = ((527 + hashCode2) * 31 + hashCode) * 31 + ((this.b ^ true) ? 1 : 0);
        }
        else {
            n = 17;
        }
        return n;
    }
    
    @g(name = "isTls")
    public final boolean i() {
        return this.a;
    }
    
    @g(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.b;
    }
    
    @g(name = "tlsVersions")
    @f
    public final List<j0> l() {
        final String[] d = this.d;
        List<j0> i2;
        if (d != null) {
            final ArrayList list = new ArrayList<j0>(d.length);
            for (int length = d.length, i = 0; i < length; ++i) {
                list.add(j0.N.a(d[i]));
            }
            i2 = (List<j0>)v.I5((Iterable)list);
        }
        else {
            i2 = null;
        }
        return i2;
    }
    
    @e
    @Override
    public String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(");
        sb.append("cipherSuites=");
        sb.append(Objects.toString(this.g(), "[all enabled]"));
        sb.append(", ");
        sb.append("tlsVersions=");
        sb.append(Objects.toString(this.l(), "[all enabled]"));
        sb.append(", ");
        sb.append("supportsTlsExtensions=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020\u0015¢\u0006\u0004\b&\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0004\"\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0002J!\u0010\u000f\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004\"\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\u00022\u0012\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0004\"\u00020\t¢\u0006\u0004\b\u0011\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0006\u0010\u0016\u001a\u00020\u0015R\"\u0010\u001c\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\"\u0010\u0013\u001a\u00020\u00128\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001b¨\u0006)" }, d2 = { "okhttp3/l$a", "", "Lokhttp3/l$a;", "a", "", "Lokhttp3/i;", "cipherSuites", "e", "([Lokhttp3/i;)Lokhttp3/l$a;", "", "d", "([Ljava/lang/String;)Lokhttp3/l$a;", "b", "Lokhttp3/j0;", "tlsVersions", "p", "([Lokhttp3/j0;)Lokhttp3/l$a;", "o", "", "supportsTlsExtensions", "n", "Lokhttp3/l;", "c", "Z", "h", "()Z", "l", "(Z)V", "tls", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "j", "([Ljava/lang/String;)V", "i", "m", "g", "k", "<init>", "connectionSpec", "(Lokhttp3/l;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private boolean a;
        @f
        private String[] b;
        @f
        private String[] c;
        private boolean d;
        
        public a(@e final l l) {
            k0.p((Object)l, "connectionSpec");
            this.a = l.i();
            this.b = l.d(l);
            this.c = l.e(l);
            this.d = l.k();
        }
        
        public a(final boolean a) {
            this.a = a;
        }
        
        @e
        public final a a() {
            if (this.a) {
                this.b = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        
        @e
        public final a b() {
            if (this.a) {
                this.c = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
        
        @e
        public final l c() {
            return new l(this.a, this.d, this.b, this.c);
        }
        
        @e
        public final a d(@e final String... array) {
            k0.p((Object)array, "cipherSuites");
            if (!this.a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
            }
            if (array.length == 0 ^ true) {
                final String[] clone = array.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                this.b = clone;
                return this;
            }
            throw new IllegalArgumentException("At least one cipher suite is required".toString());
        }
        
        @e
        public final a e(@e final i... array) {
            k0.p((Object)array, "cipherSuites");
            if (this.a) {
                final ArrayList<String> list = new ArrayList<String>(array.length);
                for (int length = array.length, i = 0; i < length; ++i) {
                    list.add(array[i].e());
                }
                final String[] array2 = list.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                final String[] original = array2;
                return this.d((String[])Arrays.copyOf(original, original.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }
        
        @f
        public final String[] f() {
            return this.b;
        }
        
        public final boolean g() {
            return this.d;
        }
        
        public final boolean h() {
            return this.a;
        }
        
        @f
        public final String[] i() {
            return this.c;
        }
        
        public final void j(@f final String[] b) {
            this.b = b;
        }
        
        public final void k(final boolean d) {
            this.d = d;
        }
        
        public final void l(final boolean a) {
            this.a = a;
        }
        
        public final void m(@f final String[] c) {
            this.c = c;
        }
        
        @kotlin.i(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @e
        public final a n(final boolean d) {
            if (this.a) {
                this.d = d;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }
        
        @e
        public final a o(@e final String... array) {
            k0.p((Object)array, "tlsVersions");
            if (!this.a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
            }
            if (array.length == 0 ^ true) {
                final String[] clone = array.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                this.c = clone;
                return this;
            }
            throw new IllegalArgumentException("At least one TLS version is required".toString());
        }
        
        @e
        public final a p(@e final j0... array) {
            k0.p((Object)array, "tlsVersions");
            if (this.a) {
                final ArrayList<String> list = new ArrayList<String>(array.length);
                for (int length = array.length, i = 0; i < length; ++i) {
                    list.add(array[i].f());
                }
                final String[] array2 = list.toArray(new String[0]);
                Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                final String[] original = array2;
                return this.o((String[])Arrays.copyOf(original, original.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f" }, d2 = { "okhttp3/l$b", "", "", "Lokhttp3/i;", "APPROVED_CIPHER_SUITES", "[Lokhttp3/i;", "Lokhttp3/l;", "CLEARTEXT", "Lokhttp3/l;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
    }
}
