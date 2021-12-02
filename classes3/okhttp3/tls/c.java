// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls;

import kotlin.text.m;
import java.security.GeneralSecurityException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.interfaces.ECPublicKey;
import java.util.concurrent.TimeUnit;
import javax.security.auth.x500.X500Principal;
import java.security.PublicKey;
import okhttp3.tls.internal.der.h;
import java.security.Signature;
import okhttp3.tls.internal.der.r;
import okhttp3.tls.internal.der.q;
import okhttp3.tls.internal.der.s;
import java.util.UUID;
import okhttp3.tls.internal.der.b;
import java.security.SecureRandom;
import java.security.KeyPairGenerator;
import okhttp3.tls.internal.der.j;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.n1;
import java.net.InetAddress;
import okhttp3.internal.d;
import kotlin.s0;
import kotlin.collections.v;
import okhttp3.tls.internal.der.n;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.List;
import java.security.interfaces.RSAPrivateKey;
import m6.g;
import kotlin.z0;
import java.security.PrivateKey;
import okhttp3.tls.internal.der.f;
import okhttp3.tls.internal.der.i;
import okio.p;
import m6.k;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.security.cert.X509Certificate;
import org.jetbrains.annotations.e;
import java.security.KeyPair;
import kotlin.text.o;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0005\bB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nR\u0019\u0010\u0010\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u00078\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\t¨\u0006\u0016" }, d2 = { "Lokhttp3/tls/c;", "", "Lokio/p;", "h", "Ljava/security/cert/X509Certificate;", "a", "()Ljava/security/cert/X509Certificate;", "Ljava/security/KeyPair;", "b", "()Ljava/security/KeyPair;", "", "e", "j", "i", "Ljava/security/cert/X509Certificate;", "d", "certificate", "Ljava/security/KeyPair;", "g", "keyPair", "<init>", "(Ljava/security/KeyPair;Ljava/security/cert/X509Certificate;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    private static final o c;
    public static final b d;
    @e
    private final KeyPair a;
    @e
    private final X509Certificate b;
    
    static {
        d = new b(null);
        c = new o("-----BEGIN ([!-,.-~ ]*)-----([^-]*)-----END \\1-----");
    }
    
    public c(@e final KeyPair a, @e final X509Certificate b) {
        k0.p((Object)a, "keyPair");
        k0.p((Object)b, "certificate");
        this.a = a;
        this.b = b;
    }
    
    public static final /* synthetic */ o c() {
        return okhttp3.tls.c.c;
    }
    
    @k
    @e
    public static final c f(@e final String s) {
        return okhttp3.tls.c.d.a(s);
    }
    
    private final p h() {
        final f<okhttp3.tls.internal.der.p> j = i.s.j();
        final p.a l = p.L;
        final PrivateKey private1 = this.a.getPrivate();
        k0.o((Object)private1, "keyPair.private");
        final byte[] encoded = private1.getEncoded();
        k0.o((Object)encoded, "keyPair.private.encoded");
        return j.c(p.a.p(l, encoded, 0, 0, 3, null)).g();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "certificate", imports = {}))
    @g(name = "-deprecated_certificate")
    @e
    public final X509Certificate a() {
        return this.b;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "keyPair", imports = {}))
    @g(name = "-deprecated_keyPair")
    @e
    public final KeyPair b() {
        return this.a;
    }
    
    @g(name = "certificate")
    @e
    public final X509Certificate d() {
        return this.b;
    }
    
    @e
    public final String e() {
        return okhttp3.tls.a.a(this.b);
    }
    
    @g(name = "keyPair")
    @e
    public final KeyPair g() {
        return this.a;
    }
    
    @e
    public final String i() {
        if (this.a.getPrivate() instanceof RSAPrivateKey) {
            final StringBuilder sb = new StringBuilder();
            sb.append("-----BEGIN RSA PRIVATE KEY-----\n");
            okhttp3.tls.a.c(sb, this.h());
            sb.append("-----END RSA PRIVATE KEY-----\n");
            final String string = sb.toString();
            k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        throw new IllegalStateException("PKCS1 only supports RSA keys".toString());
    }
    
    @e
    public final String j() {
        final StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN PRIVATE KEY-----\n");
        final p.a l = p.L;
        final PrivateKey private1 = this.a.getPrivate();
        k0.o((Object)private1, "keyPair.private");
        final byte[] encoded = private1.getEncoded();
        k0.o((Object)encoded, "keyPair.private.encoded");
        okhttp3.tls.a.c(sb, p.a.p(l, encoded, 0, 0, 3, null));
        sb.append("-----END PRIVATE KEY-----\n");
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\u0018\u0000 \"2\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b?\u0010@J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0002J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fJ\u0016\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0018J\u000e\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u0018J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fJ\u000e\u0010\"\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u000fJ\u000e\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\nJ\u0016\u0010)\u001a\u00020\u00122\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'J\u0010\u0010,\u001a\u00020\u00122\b\u0010+\u001a\u0004\u0018\u00010*J\u000e\u0010/\u001a\u00020\u00122\u0006\u0010.\u001a\u00020-J\u0006\u00100\u001a\u00020\u0012J\u0006\u00101\u001a\u00020\u0012J\u0006\u00102\u001a\u00020*R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00103R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00104R\u0018\u00106\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00105R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u00105R\u0016\u00109\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00107R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00105R\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00104R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00180\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010<R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010>¨\u0006A" }, d2 = { "okhttp3/tls/c$a", "", "", "Lokhttp3/tls/internal/der/d;", "q", "Lokhttp3/tls/internal/der/s;", "r", "", "Lokhttp3/tls/internal/der/n;", "g", "Ljava/security/KeyPair;", "signedByKeyPair", "Lokhttp3/tls/internal/der/b;", "o", "h", "", "notBefore", "notAfter", "Lokhttp3/tls/c$a;", "s", "duration", "Ljava/util/concurrent/TimeUnit;", "unit", "e", "", "altName", "a", "cn", "d", "ou", "k", "Ljava/math/BigInteger;", "serialNumber", "n", "m", "keyPair", "i", "Ljava/security/PublicKey;", "publicKey", "Ljava/security/PrivateKey;", "privateKey", "j", "Lokhttp3/tls/c;", "signedBy", "p", "", "maxIntermediateCas", "c", "f", "l", "b", "Ljava/math/BigInteger;", "J", "Ljava/lang/String;", "commonName", "I", "keyAlgorithm", "keySize", "Ljava/security/KeyPair;", "organizationalUnit", "Ljava/util/List;", "altNames", "Lokhttp3/tls/c;", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private static final long l = 86400000L;
        public static final c.a.a m;
        private long a;
        private long b;
        private String c;
        private String d;
        private final List<String> e;
        private BigInteger f;
        private KeyPair g;
        private c h;
        private int i;
        private String j;
        private int k;
        
        static {
            m = new c.a.a(null);
        }
        
        public a() {
            this.a = -1L;
            this.b = -1L;
            this.e = new ArrayList<String>();
            this.i = -1;
            this.f();
        }
        
        private final List<n> g() {
            final ArrayList<n> list = new ArrayList<n>();
            final int i = this.i;
            if (i != -1) {
                list.add(new n("2.5.29.19", true, new okhttp3.tls.internal.der.e(true, (long)i)));
            }
            if (this.e.isEmpty() ^ true) {
                final List<String> e = this.e;
                final ArrayList list2 = new ArrayList<s0>(v.Y((Iterable)e, 10));
                for (Serializable p : e) {
                    j<T> j;
                    if (okhttp3.internal.d.h((String)p)) {
                        j = (j<T>)okhttp3.tls.internal.der.i.s.h();
                        final p.a l = p.L;
                        final InetAddress byName = InetAddress.getByName((String)p);
                        k0.o((Object)byName, "InetAddress.getByName(it)");
                        final byte[] address = byName.getAddress();
                        k0.o((Object)address, "InetAddress.getByName(it).address");
                        p = p.a.p(l, address, 0, 0, 3, null);
                    }
                    else {
                        j = (j<T>)okhttp3.tls.internal.der.i.s.g();
                    }
                    list2.add(n1.a((Object)j, (Object)p));
                }
                list.add(new n("2.5.29.17", true, list2));
            }
            return list;
        }
        
        private final KeyPair h() {
            final KeyPairGenerator instance = KeyPairGenerator.getInstance(this.j);
            instance.initialize(this.k, new SecureRandom());
            final KeyPair generateKeyPair = instance.generateKeyPair();
            k0.o((Object)generateKeyPair, "KeyPairGenerator.getInst\u2026generateKeyPair()\n      }");
            return generateKeyPair;
        }
        
        private final okhttp3.tls.internal.der.b o(final KeyPair keyPair) {
            okhttp3.tls.internal.der.b b;
            if (keyPair.getPrivate() instanceof RSAPrivateKey) {
                b = new okhttp3.tls.internal.der.b("1.2.840.113549.1.1.11", null);
            }
            else {
                b = new okhttp3.tls.internal.der.b("1.2.840.10045.4.3.2", p.K);
            }
            return b;
        }
        
        private final List<List<okhttp3.tls.internal.der.d>> q() {
            final ArrayList<List> list = (ArrayList<List>)new ArrayList<List<okhttp3.tls.internal.der.d>>();
            final String d = this.d;
            if (d != null) {
                list.add(v.k((Object)new okhttp3.tls.internal.der.d("2.5.4.11", d)));
            }
            String s = this.c;
            if (s == null) {
                s = UUID.randomUUID().toString();
                k0.o((Object)s, "UUID.randomUUID().toString()");
            }
            list.add(v.k((Object)new okhttp3.tls.internal.der.d("2.5.4.3", s)));
            return (List<List<okhttp3.tls.internal.der.d>>)list;
        }
        
        private final s r() {
            long n = this.a;
            if (n == -1L) {
                n = System.currentTimeMillis();
            }
            long b = this.b;
            if (b == -1L) {
                b = n + 86400000L;
            }
            return new s(n, b);
        }
        
        @e
        public final c.a a(@e final String s) {
            k0.p((Object)s, "altName");
            this.e.add(s);
            return this;
        }
        
        @e
        public final c b() {
            KeyPair keyPair = this.g;
            if (keyPair == null) {
                keyPair = this.h();
            }
            final i s = okhttp3.tls.internal.der.i.s;
            final f<q> l = s.l();
            final p.a i = p.L;
            final PublicKey public1 = keyPair.getPublic();
            k0.o((Object)public1, "subjectKeyPair.public");
            final byte[] encoded = public1.getEncoded();
            k0.o((Object)encoded, "subjectKeyPair.public.encoded");
            final q q = l.c(p.a.p(i, encoded, 0, 0, 3, null));
            final List<List<okhttp3.tls.internal.der.d>> q2 = this.q();
            final c h = this.h;
            KeyPair g;
            List<List<okhttp3.tls.internal.der.d>> list;
            if (h != null) {
                k0.m((Object)h);
                g = h.g();
                final f<List<List<okhttp3.tls.internal.der.d>>> k = s.k();
                final c h2 = this.h;
                k0.m((Object)h2);
                final X500Principal subjectX500Principal = h2.d().getSubjectX500Principal();
                k0.o((Object)subjectX500Principal, "signedBy!!.certificate.subjectX500Principal");
                final byte[] encoded2 = subjectX500Principal.getEncoded();
                k0.o((Object)encoded2, "signedBy!!.certificate.s\u2026jectX500Principal.encoded");
                list = k.c(p.a.p(i, encoded2, 0, 0, 3, null));
            }
            else {
                g = keyPair;
                list = q2;
            }
            final okhttp3.tls.internal.der.b o = this.o(g);
            BigInteger bigInteger = this.f;
            if (bigInteger == null) {
                bigInteger = BigInteger.ONE;
            }
            k0.o((Object)bigInteger, "serialNumber ?: BigInteger.ONE");
            final r r = new r(2L, bigInteger, o, list, this.r(), q2, q, null, null, this.g());
            final Signature instance = Signature.getInstance(r.r());
            instance.initSign(g.getPrivate());
            instance.update(s.m().f(r).T0());
            final byte[] sign = instance.sign();
            k0.o((Object)sign, "sign()");
            return new c(keyPair, new h(r, o, new okhttp3.tls.internal.der.g(p.a.p(i, sign, 0, 0, 3, null), 0)).n());
        }
        
        @e
        public final c.a c(final int n) {
            if (n >= 0) {
                this.i = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("maxIntermediateCas < 0: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final c.a d(@e final String c) {
            k0.p((Object)c, "cn");
            this.c = c;
            return this;
        }
        
        @e
        public final c.a e(final long duration, @e final TimeUnit timeUnit) {
            k0.p((Object)timeUnit, "unit");
            final long currentTimeMillis = System.currentTimeMillis();
            this.s(currentTimeMillis, timeUnit.toMillis(duration) + currentTimeMillis);
            return this;
        }
        
        @e
        public final c.a f() {
            this.j = "EC";
            this.k = 256;
            return this;
        }
        
        @e
        public final c.a i(@e final KeyPair g) {
            k0.p((Object)g, "keyPair");
            this.g = g;
            return this;
        }
        
        @e
        public final c.a j(@e final PublicKey publicKey, @e final PrivateKey privateKey) {
            k0.p((Object)publicKey, "publicKey");
            k0.p((Object)privateKey, "privateKey");
            this.i(new KeyPair(publicKey, privateKey));
            return this;
        }
        
        @e
        public final c.a k(@e final String d) {
            k0.p((Object)d, "ou");
            this.d = d;
            return this;
        }
        
        @e
        public final c.a l() {
            this.j = "RSA";
            this.k = 2048;
            return this;
        }
        
        @e
        public final c.a m(final long val) {
            final BigInteger value = BigInteger.valueOf(val);
            k0.o((Object)value, "BigInteger.valueOf(serialNumber)");
            this.n(value);
            return this;
        }
        
        @e
        public final c.a n(@e final BigInteger f) {
            k0.p((Object)f, "serialNumber");
            this.f = f;
            return this;
        }
        
        @e
        public final c.a p(@org.jetbrains.annotations.f final c h) {
            this.h = h;
            return this;
        }
        
        @e
        public final c.a s(final long n, final long n2) {
            final int n3 = 1;
            int n4;
            if (n <= n2 && n == -1L == (n2 == -1L)) {
                n4 = n3;
            }
            else {
                n4 = 0;
            }
            if (n4 != 0) {
                this.a = n;
                this.b = n2;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid interval: ");
            sb.append(n);
            sb.append("..");
            sb.append(n2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/tls/c$a$a", "", "", "DEFAULT_DURATION_MILLIS", "J", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
        public static final class a
        {
            private a() {
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0002H\u0007R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013" }, d2 = { "okhttp3/tls/c$b", "", "", "certificatePem", "pkcs8Base64Text", "Lokhttp3/tls/c;", "b", "Lokio/p;", "data", "keyAlgorithm", "Ljava/security/PrivateKey;", "c", "certificateAndPrivateKeyPem", "a", "Lkotlin/text/o;", "PEM_REGEX", "Lkotlin/text/o;", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        private final c b(String s, final String s2) {
            final X509Certificate b = okhttp3.tls.a.b(s);
            final p h = p.L.h(s2);
            if (h != null) {
                final PublicKey publicKey = b.getPublicKey();
                if (publicKey instanceof ECPublicKey) {
                    s = "EC";
                }
                else {
                    if (!(publicKey instanceof RSAPublicKey)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("unexpected key type: ");
                        sb.append(b.getPublicKey());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    s = "RSA";
                }
                return new c(new KeyPair(b.getPublicKey(), this.c(h, s)), b);
            }
            throw new IllegalArgumentException("failed to decode private key");
        }
        
        private final PrivateKey c(final p p2, final String algorithm) {
            try {
                final PrivateKey generatePrivate = KeyFactory.getInstance(algorithm).generatePrivate(new PKCS8EncodedKeySpec(p2.T0()));
                k0.o((Object)generatePrivate, "keyFactory.generatePriva\u2026Spec(data.toByteArray()))");
                return generatePrivate;
            }
            catch (GeneralSecurityException cause) {
                throw new IllegalArgumentException("failed to decode private key", cause);
            }
        }
        
        @k
        @e
        public final c a(@e String f) {
            k0.p((Object)f, "certificateAndPrivateKeyPem");
            final o c = okhttp3.tls.c.c();
            final int n = 0;
            final String s = null;
            final Iterator iterator = o.e(c, f, 0, 2, null).iterator();
            final String s2 = null;
            f = s;
            String f2 = s2;
            Label_0285: {
                String f3;
                while (true) {
                    final boolean hasNext = iterator.hasNext();
                    final int n2 = 1;
                    boolean b = true;
                    if (!hasNext) {
                        break Label_0285;
                    }
                    final m m = iterator.next();
                    final kotlin.text.j value = m.c().get(1);
                    k0.m((Object)value);
                    f3 = value.f();
                    final int hashCode = f3.hashCode();
                    if (hashCode != -189606537) {
                        if (hashCode != -170985982 || !f3.equals("PRIVATE KEY")) {
                            break;
                        }
                        if (f2 != null) {
                            b = false;
                        }
                        if (!b) {
                            throw new IllegalArgumentException("string includes multiple private keys".toString());
                        }
                        final kotlin.text.j value2 = m.c().get(2);
                        k0.m((Object)value2);
                        f2 = value2.f();
                    }
                    else {
                        if (!f3.equals("CERTIFICATE")) {
                            break;
                        }
                        int n3;
                        if (f == null) {
                            n3 = n2;
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 == 0) {
                            throw new IllegalArgumentException("string includes multiple certificates".toString());
                        }
                        final kotlin.text.j value3 = m.c().get(0);
                        k0.m((Object)value3);
                        f = value3.f();
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unexpected type: ");
                sb.append(f3);
                throw new IllegalArgumentException(sb.toString());
            }
            if (f == null) {
                throw new IllegalArgumentException("string does not include a certificate".toString());
            }
            int n4 = n;
            if (f2 != null) {
                n4 = 1;
            }
            if (n4 != 0) {
                return this.b(f, f2);
            }
            throw new IllegalArgumentException("string does not include a private key".toString());
        }
    }
}
