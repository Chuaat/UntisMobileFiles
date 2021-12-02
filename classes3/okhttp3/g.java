// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import kotlin.text.s;
import java.security.PublicKey;
import kotlin.jvm.internal.q1;
import java.security.Principal;
import kotlin.z0;
import kotlin.i;
import kotlin.collections.m;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Iterator;
import java.util.Objects;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import n6.a;
import java.util.List;
import okio.p;
import java.security.cert.X509Certificate;
import m6.k;
import java.security.cert.Certificate;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.f;
import okhttp3.internal.tls.c;
import java.util.Set;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0003\b\u000f\fB#\b\u0000\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J+\u0010\f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00040\tH\u0000¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000e\"\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0017\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#¨\u0006&" }, d2 = { "Lokhttp3/g;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lkotlin/j2;", "a", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "c", "(Ljava/lang/String;Ln6/a;)V", "", "b", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lokhttp3/g$c;", "d", "Lokhttp3/internal/tls/c;", "certificateChainCleaner", "j", "(Lokhttp3/internal/tls/c;)Lokhttp3/g;", "other", "", "equals", "", "hashCode", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "pins", "Lokhttp3/internal/tls/c;", "e", "()Lokhttp3/internal/tls/c;", "<init>", "(Ljava/util/Set;Lokhttp3/internal/tls/c;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g
{
    @d
    @e
    public static final g c;
    public static final b d;
    @e
    private final Set<c> a;
    @f
    private final okhttp3.internal.tls.c b;
    
    static {
        d = new b(null);
        c = new a().b();
    }
    
    public g(@e final Set<c> a, @f final okhttp3.internal.tls.c b) {
        k0.p((Object)a, "pins");
        this.a = a;
        this.b = b;
    }
    
    @k
    @e
    public static final String g(@e final Certificate certificate) {
        return g.d.a(certificate);
    }
    
    @k
    @e
    public static final p h(@e final X509Certificate x509Certificate) {
        return g.d.b(x509Certificate);
    }
    
    @k
    @e
    public static final p i(@e final X509Certificate x509Certificate) {
        return g.d.c(x509Certificate);
    }
    
    public final void a(@e final String s, @e final List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        k0.p((Object)s, "hostname");
        k0.p((Object)list, "peerCertificates");
        this.c(s, (n6.a<? extends List<? extends X509Certificate>>)new n6.a<List<? extends X509Certificate>>() {
            final /* synthetic */ g G;
            
            @e
            public final List<X509Certificate> a() {
                final okhttp3.internal.tls.c e = this.G.e();
                List<Certificate> list = null;
                Label_0037: {
                    if (e != null) {
                        list = e.a(list, s);
                        if (list != null) {
                            break Label_0037;
                        }
                    }
                    list = (List<Certificate>)list;
                }
                final ArrayList list2 = new ArrayList<X509Certificate>(v.Y((Iterable)list, 10));
                for (final Certificate obj : list) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    list2.add((X509Certificate)obj);
                }
                return (List<X509Certificate>)list2;
            }
        });
    }
    
    @i(message = "replaced with {@link #check(String, List)}.", replaceWith = @z0(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@e final String s, @e final Certificate... array) throws SSLPeerUnverifiedException {
        k0.p((Object)s, "hostname");
        k0.p((Object)array, "peerCertificates");
        this.a(s, m.ey((Object[])array));
    }
    
    public final void c(@e String string, @e final n6.a<? extends List<? extends X509Certificate>> a) {
        k0.p((Object)string, "hostname");
        k0.p((Object)a, "cleanedPeerCertificatesFn");
        final List<c> d = this.d(string);
        if (d.isEmpty()) {
            return;
        }
        final List list = (List)a.invoke();
        for (final X509Certificate x509Certificate : list) {
            final Iterator<c> iterator2 = d.iterator();
            p p2 = null;
            p p3 = null;
            while (iterator2.hasNext()) {
                final c c = iterator2.next();
                final String b = c.b();
                final int hashCode = b.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && b.equals("sha1")) {
                        p b2;
                        if ((b2 = p3) == null) {
                            b2 = g.d.b(x509Certificate);
                        }
                        p3 = b2;
                        if (k0.g((Object)c.a(), (Object)b2)) {
                            return;
                        }
                        continue;
                    }
                }
                else if (b.equals("sha256")) {
                    p c2;
                    if ((c2 = p2) == null) {
                        c2 = g.d.c(x509Certificate);
                    }
                    p2 = c2;
                    if (k0.g((Object)c.a(), (Object)c2)) {
                        return;
                    }
                    continue;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("unsupported hashAlgorithm: ");
                sb.append(c.b());
                throw new AssertionError((Object)sb.toString());
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate pinning failure!");
        sb2.append("\n  Peer certificate chain:");
        for (final X509Certificate x509Certificate2 : list) {
            sb2.append("\n    ");
            sb2.append(g.d.a(x509Certificate2));
            sb2.append(": ");
            final Principal subjectDN = x509Certificate2.getSubjectDN();
            k0.o((Object)subjectDN, "element.subjectDN");
            sb2.append(subjectDN.getName());
        }
        sb2.append("\n  Pinned certificates for ");
        sb2.append(string);
        sb2.append(":");
        for (final c obj : d) {
            sb2.append("\n    ");
            sb2.append(obj);
        }
        string = sb2.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(string);
    }
    
    @e
    public final List<c> d(@e final String s) {
        k0.p((Object)s, "hostname");
        final Set<c> a = this.a;
        List<c> e = (List<c>)v.E();
        for (final c next : a) {
            if (next.e(s)) {
                List<c> list = e;
                if (e.isEmpty()) {
                    list = new ArrayList<c>();
                }
                q1.g((Object)list).add(next);
                e = list;
            }
        }
        return e;
    }
    
    @f
    public final okhttp3.internal.tls.c e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof g) {
            final g g = (g)o;
            if (k0.g((Object)g.a, (Object)this.a) && k0.g((Object)g.b, (Object)this.b)) {
                return true;
            }
        }
        return false;
    }
    
    @e
    public final Set<c> f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final okhttp3.internal.tls.c b = this.b;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        return (1517 + hashCode) * 41 + hashCode2;
    }
    
    @e
    public final g j(@e final okhttp3.internal.tls.c c) {
        k0.p((Object)c, "certificateChainCleaner");
        g g;
        if (k0.g((Object)this.b, (Object)c)) {
            g = this;
        }
        else {
            g = new g(this.a, c);
        }
        return g;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\n\u001a\u00020\tR\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012" }, d2 = { "okhttp3/g$a", "", "", "pattern", "", "pins", "Lokhttp3/g$a;", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lokhttp3/g$a;", "Lokhttp3/g;", "b", "", "Lokhttp3/g$c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        @e
        private final List<c> a;
        
        public a() {
            this.a = new ArrayList<c>();
        }
        
        @e
        public final a a(@e final String s, @e final String... array) {
            k0.p((Object)s, "pattern");
            k0.p((Object)array, "pins");
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a.add(new c(s, array[i]));
            }
            return this;
        }
        
        @e
        public final g b() {
            return new g(v.N5((Iterable)this.a), null, 2, null);
        }
        
        @e
        public final List<c> c() {
            return this.a;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007R\u0016\u0010\u000b\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "okhttp3/g$b", "", "Ljava/security/cert/X509Certificate;", "Lokio/p;", "b", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "Lokhttp3/g;", "DEFAULT", "Lokhttp3/g;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @k
        @e
        public final String a(@e final Certificate certificate) {
            k0.p((Object)certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                final StringBuilder sb = new StringBuilder();
                sb.append("sha256/");
                sb.append(this.c((X509Certificate)certificate).g());
                return sb.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }
        
        @k
        @e
        public final p b(@e final X509Certificate x509Certificate) {
            k0.p((Object)x509Certificate, "$this$sha1Hash");
            final p.a l = p.L;
            final PublicKey publicKey = x509Certificate.getPublicKey();
            k0.o((Object)publicKey, "publicKey");
            final byte[] encoded = publicKey.getEncoded();
            k0.o((Object)encoded, "publicKey.encoded");
            return p.a.p(l, encoded, 0, 0, 3, null).C0();
        }
        
        @k
        @e
        public final p c(@e final X509Certificate x509Certificate) {
            k0.p((Object)x509Certificate, "$this$sha256Hash");
            final p.a l = p.L;
            final PublicKey publicKey = x509Certificate.getPublicKey();
            k0.o((Object)publicKey, "publicKey");
            final byte[] encoded = publicKey.getEncoded();
            k0.o((Object)encoded, "publicKey.encoded");
            return p.a.p(l, encoded, 0, 0, 3, null).E0();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0013\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0018\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u001c" }, d2 = { "okhttp3/g$c", "", "", "hostname", "", "e", "Ljava/security/cert/X509Certificate;", "certificate", "d", "toString", "other", "equals", "", "hashCode", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "hashAlgorithm", "Lokio/p;", "c", "Lokio/p;", "a", "()Lokio/p;", "hash", "pattern", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class c
    {
        @e
        private final String a;
        @e
        private final String b;
        @e
        private final p c;
        
        public c(@e final String s, @e final String str) {
            k0.p((Object)s, "pattern");
            k0.p((Object)str, "pin");
            if ((!s.u2(s, "*.", false, 2, null) || s.r3(s, "*", 1, false, 4, null) != -1) && (!s.u2(s, "**.", false, 2, null) || s.r3(s, "*", 2, false, 4, null) != -1) && s.r3(s, "*", 0, false, 6, null) != -1) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unexpected pattern: ");
                sb.append(s);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            final String e = okhttp3.internal.a.e(s);
            if (e != null) {
                this.a = e;
                p c;
                if (s.u2(str, "sha1/", false, 2, null)) {
                    this.b = "sha1";
                    final p.a l = p.L;
                    final String substring = str.substring(5);
                    k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                    c = l.h(substring);
                    if (c == null) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid pin hash: ");
                        sb2.append(str);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                }
                else {
                    if (!s.u2(str, "sha256/", false, 2, null)) {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("pins must start with 'sha256/' or 'sha1/': ");
                        sb3.append(str);
                        throw new IllegalArgumentException(sb3.toString());
                    }
                    this.b = "sha256";
                    final p.a i = p.L;
                    final String substring2 = str.substring(7);
                    k0.o((Object)substring2, "(this as java.lang.String).substring(startIndex)");
                    c = i.h(substring2);
                    if (c == null) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid pin hash: ");
                        sb4.append(str);
                        throw new IllegalArgumentException(sb4.toString());
                    }
                }
                this.c = c;
                return;
            }
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("Invalid pattern: ");
            sb5.append(s);
            throw new IllegalArgumentException(sb5.toString());
        }
        
        @e
        public final p a() {
            return this.c;
        }
        
        @e
        public final String b() {
            return this.b;
        }
        
        @e
        public final String c() {
            return this.a;
        }
        
        public final boolean d(@e final X509Certificate x509Certificate) {
            k0.p((Object)x509Certificate, "certificate");
            final String b = this.b;
            final int hashCode = b.hashCode();
            p p;
            p p2;
            if (hashCode != -903629273) {
                if (hashCode != 3528965) {
                    return false;
                }
                if (!b.equals("sha1")) {
                    return false;
                }
                p = this.c;
                p2 = g.d.b(x509Certificate);
            }
            else {
                if (!b.equals("sha256")) {
                    return false;
                }
                p = this.c;
                p2 = g.d.c(x509Certificate);
            }
            return k0.g((Object)p, (Object)p2);
            g = false;
            return g;
        }
        
        public final boolean e(@e final String s) {
            k0.p((Object)s, "hostname");
            final String a = this.a;
            final boolean b = false;
            if (s.u2(a, "**.", false, 2, null)) {
                final int n = this.a.length() - 3;
                final int n2 = s.length() - n;
                boolean g = b;
                if (!s.f2(s, s.length() - n, this.a, 3, n, false, 16, null)) {
                    return g;
                }
                if (n2 != 0) {
                    g = b;
                    if (s.charAt(n2 - 1) != '.') {
                        return g;
                    }
                }
            }
            else {
                if (!s.u2(this.a, "*.", false, 2, null)) {
                    return k0.g((Object)s, (Object)this.a);
                }
                final int n3 = this.a.length() - 1;
                final int length = s.length();
                boolean g = b;
                if (!s.f2(s, s.length() - n3, this.a, 1, n3, false, 16, null)) {
                    return g;
                }
                g = b;
                if (s.E3(s, '.', length - n3 - 1, false, 4, null) != -1) {
                    return g;
                }
            }
            return true;
        }
        
        @Override
        public boolean equals(@f final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof c)) {
                return false;
            }
            final String a = this.a;
            final c c = (c)o;
            return !(k0.g((Object)a, (Object)c.a) ^ true) && !(k0.g((Object)this.b, (Object)c.b) ^ true) && !(k0.g((Object)this.c, (Object)c.c) ^ true);
        }
        
        @Override
        public int hashCode() {
            return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.b);
            sb.append('/');
            sb.append(this.c.g());
            return sb.toString();
        }
    }
}
