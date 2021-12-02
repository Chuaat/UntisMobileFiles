// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import java.security.cert.X509Certificate;
import javax.net.ssl.SSLSession;
import org.conscrypt.Conscrypt$Version;
import java.util.Arrays;
import org.conscrypt.ConscryptHostnameVerifier;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLContext;
import java.util.Objects;
import okhttp3.d0;
import java.util.List;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k0;
import org.conscrypt.Conscrypt;
import kotlin.jvm.internal.w;
import java.security.Provider;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0004H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017¨\u0006\u001e" }, d2 = { "Lokhttp3/internal/platform/d;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lm6/l;", "protocols", "Lkotlin/j2;", "f", "j", "trustManager", "q", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "<init>", "()V", "h", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d extends h
{
    private static final boolean g;
    public static final a h;
    private final Provider f;
    
    static {
        final a a = h = new a(null);
        final boolean b = false;
        while (true) {
            try {
                Class.forName("org.conscrypt.Conscrypt$Version", false, a.getClass().getClassLoader());
                boolean g2 = b;
                if (Conscrypt.isAvailable()) {
                    final boolean a2 = a.a(2, 1, 0);
                    g2 = b;
                    if (a2) {
                        g2 = true;
                    }
                }
                g = g2;
            }
            catch (NoClassDefFoundError | ClassNotFoundException noClassDefFoundError) {
                final boolean g2 = b;
                continue;
            }
            break;
        }
    }
    
    private d() {
        final Provider provider = Conscrypt.newProvider();
        k0.o((Object)provider, "Conscrypt.newProvider()");
        this.f = provider;
    }
    
    public static final /* synthetic */ boolean t() {
        return d.g;
    }
    
    @Override
    public void f(@e final SSLSocket sslSocket, @f final String s, @e final List<d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        if (Conscrypt.isConscrypt(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            final String[] array = okhttp3.internal.platform.h.e.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Conscrypt.setApplicationProtocols(sslSocket, (String[])array);
        }
        else {
            super.f(sslSocket, s, list);
        }
    }
    
    @f
    @Override
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        String s;
        if (Conscrypt.isConscrypt(sslSocket)) {
            s = Conscrypt.getApplicationProtocol(sslSocket);
        }
        else {
            s = super.j(sslSocket);
        }
        return s;
    }
    
    @e
    @Override
    public SSLContext p() {
        final SSLContext instance = SSLContext.getInstance("TLS", this.f);
        k0.o((Object)instance, "SSLContext.getInstance(\"TLS\", provider)");
        return instance;
    }
    
    @e
    @Override
    public SSLSocketFactory q(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        final SSLContext p = this.p();
        p.init(null, new TrustManager[] { x509TrustManager }, null);
        final SSLSocketFactory socketFactory = p.getSocketFactory();
        k0.o((Object)socketFactory, "newSSLContext().apply {\n\u2026null)\n    }.socketFactory");
        return socketFactory;
    }
    
    @e
    @Override
    public X509TrustManager r() {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init((KeyStore)null);
        k0.o((Object)instance, "TrustManagerFactory.getI\u2026(null as KeyStore?)\n    }");
        final TrustManager[] trustManagers = instance.getTrustManagers();
        k0.m((Object)trustManagers);
        final int length = trustManagers.length;
        boolean b = true;
        if (length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            b = false;
        }
        if (b) {
            final TrustManager obj = trustManagers[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            final X509TrustManager x509TrustManager = (X509TrustManager)obj;
            Conscrypt.setHostnameVerifier((TrustManager)x509TrustManager, (ConscryptHostnameVerifier)d.b.a);
            return x509TrustManager;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        final String string = Arrays.toString(trustManagers);
        k0.o((Object)string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @f
    @Override
    public X509TrustManager s(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return null;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004R\u0019\u0010\n\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010" }, d2 = { "okhttp3/internal/platform/d$a", "", "Lokhttp3/internal/platform/d;", "c", "", "major", "minor", "patch", "", "a", "isSupported", "Z", "d", "()Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        public final boolean a(final int n, final int n2, final int n3) {
            final Conscrypt$Version version = Conscrypt.version();
            final int major = version.major();
            final boolean b = true;
            final boolean b2 = true;
            boolean b3 = true;
            if (major != n) {
                if (version.major() <= n) {
                    b3 = false;
                }
                return b3;
            }
            if (version.minor() != n2) {
                return version.minor() > n2 && b;
            }
            return version.patch() >= n3 && b2;
        }
        
        @f
        public final d c() {
            final boolean d = this.d();
            d d2 = null;
            if (d) {
                d2 = new d(null);
            }
            return d2;
        }
        
        public final boolean d() {
            return d.t();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u00c0\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J5\u0010\u000b\u001a\u00020\u00062\u0010\u0010\n\u001a\f\u0012\u0006\b\u0001\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "okhttp3/internal/platform/d$b", "Lorg/conscrypt/ConscryptHostnameVerifier;", "", "hostname", "Ljavax/net/ssl/SSLSession;", "session", "", "a", "", "Ljava/security/cert/X509Certificate;", "certs", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b implements ConscryptHostnameVerifier
    {
        public static final b a;
        
        static {
            a = new b();
        }
        
        private b() {
        }
        
        public final boolean a(@f final String s, @f final SSLSession sslSession) {
            return true;
        }
        
        public boolean b(@f final X509Certificate[] array, @f final String s, @f final SSLSession sslSession) {
            return true;
        }
    }
}
