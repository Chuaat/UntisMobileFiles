// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import java.util.Arrays;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLContext;
import org.bouncycastle.jsse.BCSSLParameters;
import java.util.Objects;
import org.bouncycastle.jsse.BCSSLSocket;
import kotlin.jvm.internal.k0;
import okhttp3.d0;
import java.util.List;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;
import kotlin.jvm.internal.w;
import java.security.Provider;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J-\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0011\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u000e¢\u0006\u0002\b\u000f0\rH\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u001b" }, d2 = { "Lokhttp3/internal/platform/c;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lm6/l;", "protocols", "Lkotlin/j2;", "f", "j", "Ljava/security/Provider;", "Ljava/security/Provider;", "provider", "<init>", "()V", "h", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class c extends h
{
    private static final boolean g;
    public static final a h;
    private final Provider f;
    
    static {
        final a a = h = new a(null);
        boolean g2 = false;
        while (true) {
            try {
                Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, a.getClass().getClassLoader());
                g2 = true;
                g = g2;
            }
            catch (ClassNotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    private c() {
        this.f = (Provider)new BouncyCastleJsseProvider();
    }
    
    public static final /* synthetic */ boolean t() {
        return c.g;
    }
    
    @Override
    public void f(@e final SSLSocket sslSocket, @f final String s, @e final List<d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        if (sslSocket instanceof BCSSLSocket) {
            final BCSSLSocket bcsslSocket = (BCSSLSocket)sslSocket;
            final BCSSLParameters parameters = bcsslSocket.getParameters();
            final List<String> b = okhttp3.internal.platform.h.e.b(list);
            k0.o((Object)parameters, "sslParameters");
            final Object[] array = b.toArray((Object[])new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[])array);
            bcsslSocket.setParameters(parameters);
        }
        else {
            super.f(sslSocket, s, list);
        }
    }
    
    @f
    @Override
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        String j;
        if (sslSocket instanceof BCSSLSocket) {
            final String applicationProtocol = ((BCSSLSocket)sslSocket).getApplicationProtocol();
            if (applicationProtocol != null) {
                if (applicationProtocol.hashCode() != 0) {
                    j = applicationProtocol;
                    return j;
                }
                j = applicationProtocol;
                if (!applicationProtocol.equals("")) {
                    return j;
                }
            }
            j = null;
        }
        else {
            j = super.j(sslSocket);
        }
        return j;
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
    public X509TrustManager r() {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        instance.init((KeyStore)null);
        k0.o((Object)instance, "factory");
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
            return (X509TrustManager)obj;
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
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported with BouncyCastle");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okhttp3/internal/platform/c$a", "", "Lokhttp3/internal/platform/c;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @f
        public final c a() {
            final boolean b = this.b();
            c c = null;
            if (b) {
                c = new c(null);
            }
            return c;
        }
        
        public final boolean b() {
            return c.t();
        }
    }
}
