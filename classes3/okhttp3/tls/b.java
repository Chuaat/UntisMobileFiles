// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls;

import okhttp3.internal.d;
import java.util.Collection;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.k0;
import javax.net.ssl.SSLSocketFactory;
import java.security.SecureRandom;
import javax.net.ssl.TrustManager;
import javax.net.ssl.KeyManager;
import okhttp3.internal.platform.h;
import javax.net.ssl.SSLContext;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.w;
import javax.net.ssl.X509TrustManager;
import org.jetbrains.annotations.e;
import javax.net.ssl.X509KeyManager;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u0003B\u0019\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\nR\u0019\u0010\u000e\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0014" }, d2 = { "Lokhttp3/tls/b;", "", "Ljavax/net/ssl/X509KeyManager;", "a", "()Ljavax/net/ssl/X509KeyManager;", "Ljavax/net/ssl/X509TrustManager;", "b", "()Ljavax/net/ssl/X509TrustManager;", "Ljavax/net/ssl/SSLSocketFactory;", "e", "Ljavax/net/ssl/SSLContext;", "d", "Ljavax/net/ssl/X509KeyManager;", "c", "keyManager", "Ljavax/net/ssl/X509TrustManager;", "f", "trustManager", "<init>", "(Ljavax/net/ssl/X509KeyManager;Ljavax/net/ssl/X509TrustManager;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class b
{
    @e
    private final X509KeyManager a;
    @e
    private final X509TrustManager b;
    
    private b(final X509KeyManager a, final X509TrustManager b) {
        this.a = a;
        this.b = b;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "keyManager", imports = {}))
    @g(name = "-deprecated_keyManager")
    @e
    public final X509KeyManager a() {
        return this.a;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "trustManager", imports = {}))
    @g(name = "-deprecated_trustManager")
    @e
    public final X509TrustManager b() {
        return this.b;
    }
    
    @g(name = "keyManager")
    @e
    public final X509KeyManager c() {
        return this.a;
    }
    
    @e
    public final SSLContext d() {
        final SSLContext p = h.e.g().p();
        p.init(new KeyManager[] { this.a }, new TrustManager[] { this.b }, new SecureRandom());
        return p;
    }
    
    @e
    public final SSLSocketFactory e() {
        final SSLSocketFactory socketFactory = this.d().getSocketFactory();
        k0.o((Object)socketFactory, "sslContext().socketFactory");
        return socketFactory;
    }
    
    @g(name = "trustManager")
    @e
    public final X509TrustManager f() {
        return this.b;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\u0010R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u001a" }, d2 = { "okhttp3/tls/b$a", "", "Lokhttp3/tls/c;", "heldCertificate", "", "Ljava/security/cert/X509Certificate;", "intermediates", "Lokhttp3/tls/b$a;", "e", "(Lokhttp3/tls/c;[Ljava/security/cert/X509Certificate;)Lokhttp3/tls/b$a;", "certificate", "c", "b", "", "hostname", "a", "Lokhttp3/tls/b;", "d", "", "Ljava/util/List;", "trustedCertificates", "[Ljava/security/cert/X509Certificate;", "insecureHosts", "Lokhttp3/tls/c;", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private c a;
        private X509Certificate[] b;
        private final List<X509Certificate> c;
        private final List<String> d;
        
        public a() {
            this.c = new ArrayList<X509Certificate>();
            this.d = new ArrayList<String>();
        }
        
        @e
        public final a a(@e final String s) {
            k0.p((Object)s, "hostname");
            this.d.add(s);
            return this;
        }
        
        @e
        public final a b() {
            final X509TrustManager r = h.e.g().r();
            final List<X509Certificate> c = this.c;
            final X509Certificate[] acceptedIssuers = r.getAcceptedIssuers();
            Collections.addAll(c, (X509Certificate[])Arrays.copyOf((T[])acceptedIssuers, acceptedIssuers.length));
            return this;
        }
        
        @e
        public final a c(@e final X509Certificate x509Certificate) {
            k0.p((Object)x509Certificate, "certificate");
            this.c.add(x509Certificate);
            return this;
        }
        
        @e
        public final b d() {
            final List<String> c0 = okhttp3.internal.d.c0((List<? extends String>)this.d);
            final c a = this.a;
            X509Certificate[] b = this.b;
            if (b == null) {
                b = new X509Certificate[0];
            }
            return new b(okhttp3.tls.internal.c.e(null, a, (X509Certificate[])Arrays.copyOf(b, b.length)), okhttp3.tls.internal.c.f(null, this.c, c0), null);
        }
        
        @e
        public final a e(@e final c a, @e final X509Certificate... original) {
            k0.p((Object)a, "heldCertificate");
            k0.p((Object)original, "intermediates");
            this.a = a;
            this.b = Arrays.copyOf(original, original.length);
            return this;
        }
    }
}
