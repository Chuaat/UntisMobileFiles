// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okhttp3.internal.d;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import org.jetbrains.annotations.f;
import java.security.Principal;
import kotlin.z0;
import java.security.cert.X509Certificate;
import m6.g;
import m6.k;
import java.io.IOException;
import javax.net.ssl.SSLSession;
import kotlin.d0;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k0;
import n6.a;
import kotlin.jvm.internal.w;
import java.security.cert.Certificate;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.b0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\u0006B;\b\u0000\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0+¢\u0006\u0004\b-\u0010.J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\f8G@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000eR\u0015\u0010\u001b\u001a\u0004\u0018\u00010\f8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000eR\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010!\u001a\u00020\u0016*\u00020\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0019\u0010$\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\"\u001a\u0004\b#\u0010\u0007R\u0019\u0010'\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010%\u001a\u0004\b&\u0010\u0004R#\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010\u000b¨\u0006/" }, d2 = { "Lokhttp3/u;", "", "Lokhttp3/j0;", "f", "()Lokhttp3/j0;", "Lokhttp3/i;", "a", "()Lokhttp3/i;", "", "Ljava/security/cert/Certificate;", "d", "()Ljava/util/List;", "Ljava/security/Principal;", "e", "()Ljava/security/Principal;", "b", "c", "other", "", "equals", "", "hashCode", "", "toString", "n", "peerPrincipal", "l", "localPrincipal", "Ljava/util/List;", "k", "localCertificates", "j", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "Lokhttp3/i;", "g", "cipherSuite", "Lokhttp3/j0;", "o", "tlsVersion", "Lkotlin/b0;", "m", "peerCertificates", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lokhttp3/j0;Lokhttp3/i;Ljava/util/List;Ln6/a;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class u
{
    public static final a e;
    @e
    private final b0 a;
    @e
    private final j0 b;
    @e
    private final i c;
    @e
    private final List<Certificate> d;
    
    static {
        e = new a(null);
    }
    
    public u(@e final j0 b, @e final i c, @e final List<? extends Certificate> d, @e final n6.a<? extends List<? extends Certificate>> a) {
        k0.p((Object)b, "tlsVersion");
        k0.p((Object)c, "cipherSuite");
        k0.p((Object)d, "localCertificates");
        k0.p((Object)a, "peerCertificatesFn");
        this.b = b;
        this.c = c;
        this.d = (List<Certificate>)d;
        this.a = d0.c((n6.a)new n6.a<List<? extends Certificate>>() {
            @e
            public final List<Certificate> a() {
                List e;
                try {
                    e = (List)a.invoke();
                }
                catch (SSLPeerUnverifiedException ex) {
                    e = v.E();
                }
                return (List<Certificate>)e;
            }
        });
    }
    
    @k
    @g(name = "get")
    @e
    public static final u h(@e final SSLSession sslSession) throws IOException {
        return u.e.b(sslSession);
    }
    
    @k
    @e
    public static final u i(@e final j0 j0, @e final i i, @e final List<? extends Certificate> list, @e final List<? extends Certificate> list2) {
        return u.e.c(j0, i, list, list2);
    }
    
    private final String j(final Certificate certificate) {
        String s;
        if (certificate instanceof X509Certificate) {
            s = ((X509Certificate)certificate).getSubjectDN().toString();
        }
        else {
            s = certificate.getType();
            k0.o((Object)s, "type");
        }
        return s;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "cipherSuite", imports = {}))
    @g(name = "-deprecated_cipherSuite")
    @e
    public final i a() {
        return this.c;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "localCertificates", imports = {}))
    @g(name = "-deprecated_localCertificates")
    @e
    public final List<Certificate> b() {
        return this.d;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "localPrincipal", imports = {}))
    @g(name = "-deprecated_localPrincipal")
    @f
    public final Principal c() {
        return this.l();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "peerCertificates", imports = {}))
    @g(name = "-deprecated_peerCertificates")
    @e
    public final List<Certificate> d() {
        return this.m();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "peerPrincipal", imports = {}))
    @g(name = "-deprecated_peerPrincipal")
    @f
    public final Principal e() {
        return this.n();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof u) {
            final u u = (u)o;
            if (u.b == this.b && k0.g((Object)u.c, (Object)this.c) && k0.g((Object)u.m(), (Object)this.m()) && k0.g((Object)u.d, (Object)this.d)) {
                return true;
            }
        }
        return false;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "tlsVersion", imports = {}))
    @g(name = "-deprecated_tlsVersion")
    @e
    public final j0 f() {
        return this.b;
    }
    
    @g(name = "cipherSuite")
    @e
    public final i g() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return (((527 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.m().hashCode()) * 31 + this.d.hashCode();
    }
    
    @g(name = "localCertificates")
    @e
    public final List<Certificate> k() {
        return this.d;
    }
    
    @g(name = "localPrincipal")
    @f
    public final Principal l() {
        Object t2 = v.t2((List)this.d);
        final boolean b = t2 instanceof X509Certificate;
        final Principal principal = null;
        if (!b) {
            t2 = null;
        }
        final X509Certificate x509Certificate = (X509Certificate)t2;
        Principal subjectX500Principal = principal;
        if (x509Certificate != null) {
            subjectX500Principal = x509Certificate.getSubjectX500Principal();
        }
        return subjectX500Principal;
    }
    
    @g(name = "peerCertificates")
    @e
    public final List<Certificate> m() {
        return (List<Certificate>)this.a.getValue();
    }
    
    @g(name = "peerPrincipal")
    @f
    public final Principal n() {
        Object t2 = v.t2((List)this.m());
        final boolean b = t2 instanceof X509Certificate;
        final Principal principal = null;
        if (!b) {
            t2 = null;
        }
        final X509Certificate x509Certificate = (X509Certificate)t2;
        Principal subjectX500Principal = principal;
        if (x509Certificate != null) {
            subjectX500Principal = x509Certificate.getSubjectX500Principal();
        }
        return subjectX500Principal;
    }
    
    @g(name = "tlsVersion")
    @e
    public final j0 o() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final List<Certificate> m = this.m();
        final ArrayList list = new ArrayList<String>(v.Y((Iterable)m, 10));
        final Iterator<Object> iterator = m.iterator();
        while (iterator.hasNext()) {
            list.add(this.j(iterator.next()));
        }
        final String string = list.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("Handshake{");
        sb.append("tlsVersion=");
        sb.append(this.b);
        sb.append(' ');
        sb.append("cipherSuite=");
        sb.append(this.c);
        sb.append(' ');
        sb.append("peerCertificates=");
        sb.append(string);
        sb.append(' ');
        sb.append("localCertificates=");
        final List<Certificate> d = this.d;
        final ArrayList obj = new ArrayList<String>(v.Y((Iterable)d, 10));
        final Iterator<Object> iterator2 = d.iterator();
        while (iterator2.hasNext()) {
            obj.add(this.j(iterator2.next()));
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ4\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¨\u0006\u0016" }, d2 = { "okhttp3/u$a", "", "", "Ljava/security/cert/Certificate;", "", "d", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lokhttp3/u;", "b", "(Ljavax/net/ssl/SSLSession;)Lokhttp3/u;", "sslSession", "a", "Lokhttp3/j0;", "tlsVersion", "Lokhttp3/i;", "cipherSuite", "peerCertificates", "localCertificates", "c", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        private final List<Certificate> d(final Certificate[] original) {
            List<Certificate> list;
            if (original != null) {
                list = okhttp3.internal.d.z((Certificate[])Arrays.copyOf((T[])original, original.length));
            }
            else {
                list = (List<Certificate>)v.E();
            }
            return list;
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "sslSession.handshake()", imports = {}))
        @g(name = "-deprecated_get")
        @e
        public final u a(@e final SSLSession sslSession) throws IOException {
            k0.p((Object)sslSession, "sslSession");
            return this.b(sslSession);
        }
        
        @k
        @g(name = "get")
        @e
        public final u b(@e final SSLSession sslSession) throws IOException {
            k0.p((Object)sslSession, "$this$handshake");
            final String cipherSuite = sslSession.getCipherSuite();
            if (cipherSuite != null) {
                final int hashCode = cipherSuite.hashCode();
                Label_0168: {
                    if (hashCode != 1019404634) {
                        if (hashCode == 1208658923) {
                            if (cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                                break Label_0168;
                            }
                        }
                    }
                    else if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL")) {
                        break Label_0168;
                    }
                    final i b = i.s1.b(cipherSuite);
                    final String protocol = sslSession.getProtocol();
                    if (protocol == null) {
                        throw new IllegalStateException("tlsVersion == null".toString());
                    }
                    if (!k0.g((Object)"NONE", (Object)protocol)) {
                        final j0 a = j0.N.a(protocol);
                        List<Certificate> list;
                        try {
                            list = this.d(sslSession.getPeerCertificates());
                        }
                        catch (SSLPeerUnverifiedException ex) {
                            list = (List<Certificate>)v.E();
                        }
                        return new u(a, b, this.d(sslSession.getLocalCertificates()), (n6.a<? extends List<? extends Certificate>>)new n6.a<List<? extends Certificate>>() {
                            @e
                            public final List<Certificate> a() {
                                return list;
                            }
                        });
                    }
                    throw new IOException("tlsVersion == NONE");
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("cipherSuite == ");
                sb.append(cipherSuite);
                throw new IOException(sb.toString());
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }
        
        @k
        @e
        public final u c(@e final j0 j0, @e final i i, @e final List<? extends Certificate> list, @e final List<? extends Certificate> list2) {
            k0.p((Object)j0, "tlsVersion");
            k0.p((Object)i, "cipherSuite");
            k0.p((Object)list, "peerCertificates");
            k0.p((Object)list2, "localCertificates");
            return new u(j0, i, okhttp3.internal.d.c0(list2), (n6.a<? extends List<? extends Certificate>>)new n6.a<List<? extends Certificate>>() {
                final /* synthetic */ List G = okhttp3.internal.d.c0((List<?>)list);
                
                @e
                public final List<Certificate> a() {
                    return (List<Certificate>)this.G;
                }
            });
        }
    }
}
