// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import okio.m;
import java.util.Iterator;
import kotlin.collections.v;
import java.util.ArrayList;
import java.security.Provider;
import java.security.Security;
import okhttp3.internal.d;
import java.util.Objects;
import java.security.KeyStore;
import javax.net.ssl.TrustManagerFactory;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.SSLContext;
import java.util.logging.Level;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import okhttp3.d0;
import java.util.List;
import org.jetbrains.annotations.f;
import okhttp3.internal.tls.b;
import java.util.Arrays;
import java.security.cert.X509Certificate;
import okhttp3.internal.tls.a;
import okhttp3.internal.tls.c;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k0;
import javax.net.ssl.SSLSocket;
import org.jetbrains.annotations.e;
import m6.k;
import okhttp3.c0;
import kotlin.jvm.internal.w;
import java.util.logging.Logger;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 ,2\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J-\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00022\u0011\u0010\u0011\u001a\r\u0012\t\u0012\u00070\u000f¢\u0006\u0002\b\u00100\u000eH\u0016J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J&\u0010!\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001a2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010#\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0012\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010$\u001a\u00020\u0002H\u0016J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u00022\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u0016J\u0010\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010(\u001a\u00020\u0006H\u0016J\u0010\u0010-\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0006H\u0016J\b\u0010.\u001a\u00020\u0002H\u0016¨\u00062" }, d2 = { "Lokhttp3/internal/platform/h;", "", "", "i", "Ljavax/net/ssl/SSLContext;", "p", "Ljavax/net/ssl/X509TrustManager;", "r", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "hostname", "", "Lokhttp3/d0;", "Lm6/l;", "protocols", "Lkotlin/j2;", "f", "c", "j", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "g", "message", "level", "", "t", "m", "", "l", "closer", "k", "stackTrace", "o", "trustManager", "Lokhttp3/internal/tls/c;", "d", "Lokhttp3/internal/tls/e;", "e", "q", "toString", "<init>", "()V", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public class h
{
    private static volatile h a;
    public static final int b = 4;
    public static final int c = 5;
    private static final Logger d;
    public static final a e;
    
    static {
        h.a = (e = new a(null)).f();
        d = Logger.getLogger(c0.class.getName());
    }
    
    public static final /* synthetic */ h a() {
        return h.a;
    }
    
    public static final /* synthetic */ void b(final h a) {
        h.a = a;
    }
    
    @k
    @e
    public static final h h() {
        return h.e.g();
    }
    
    public void c(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
    }
    
    @e
    public c d(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        return new okhttp3.internal.tls.a(this.e(x509TrustManager));
    }
    
    @e
    public okhttp3.internal.tls.e e(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        final X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        k0.o((Object)acceptedIssuers, "trustManager.acceptedIssuers");
        return new b((X509Certificate[])Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }
    
    public void f(@e final SSLSocket sslSocket, @f final String s, @e final List<d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
    }
    
    public void g(@e final Socket socket, @e final InetSocketAddress endpoint, final int timeout) throws IOException {
        k0.p((Object)socket, "socket");
        k0.p((Object)endpoint, "address");
        socket.connect(endpoint, timeout);
    }
    
    @e
    public final String i() {
        return "OkHttp";
    }
    
    @f
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        return null;
    }
    
    @f
    public Object k(@e final String message) {
        k0.p((Object)message, "closer");
        Throwable t;
        if (h.d.isLoggable(Level.FINE)) {
            t = new Throwable(message);
        }
        else {
            t = null;
        }
        return t;
    }
    
    public boolean l(@e final String s) {
        k0.p((Object)s, "hostname");
        return true;
    }
    
    public void m(@e final String msg, final int n, @f final Throwable thrown) {
        k0.p((Object)msg, "message");
        Level level;
        if (n == 5) {
            level = Level.WARNING;
        }
        else {
            level = Level.INFO;
        }
        h.d.log(level, msg, thrown);
    }
    
    public void o(@e final String str, @f final Object o) {
        k0.p((Object)str, "message");
        String string = str;
        if (o == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            string = sb.toString();
        }
        this.m(string, 5, (Throwable)o);
    }
    
    @e
    public SSLContext p() {
        final SSLContext instance = SSLContext.getInstance("TLS");
        k0.o((Object)instance, "SSLContext.getInstance(\"TLS\")");
        return instance;
    }
    
    @e
    public SSLSocketFactory q(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        try {
            final SSLContext p = this.p();
            p.init(null, new TrustManager[] { x509TrustManager }, null);
            final SSLSocketFactory socketFactory = p.getSocketFactory();
            k0.o((Object)socketFactory, "newSSLContext().apply {\n\u2026ll)\n      }.socketFactory");
            return socketFactory;
        }
        catch (GeneralSecurityException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("No System TLS: ");
            sb.append(ex);
            throw new AssertionError(sb.toString(), ex);
        }
    }
    
    @e
    public X509TrustManager r() {
        final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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
    public X509TrustManager s(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        final X509TrustManager x509TrustManager = null;
        try {
            final Class<?> forName = Class.forName("sun.security.ssl.SSLContextImpl");
            k0.o((Object)forName, "sslContextClass");
            final Object q = okhttp3.internal.d.Q(sslSocketFactory, forName, "context");
            X509TrustManager x509TrustManager2 = x509TrustManager;
            if (q != null) {
                x509TrustManager2 = okhttp3.internal.d.Q(q, X509TrustManager.class, "trustManager");
            }
            return x509TrustManager2;
        }
        catch (ClassNotFoundException ex) {
            return x509TrustManager;
        }
    }
    
    @e
    @Override
    public String toString() {
        final String simpleName = this.getClass().getSimpleName();
        k0.o((Object)simpleName, "javaClass.simpleName");
        return simpleName;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0007\u001a\u00020\u0002J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nR\u0013\u0010\u0014\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00118B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u001e\u0010!\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010#¨\u0006&" }, d2 = { "okhttp3/internal/platform/h$a", "", "Lokhttp3/internal/platform/h;", "f", "d", "e", "g", "platform", "Lkotlin/j2;", "l", "", "Lokhttp3/d0;", "protocols", "", "b", "", "c", "", "h", "()Z", "isAndroid", "j", "isConscryptPreferred", "i", "isBouncyCastlePreferred", "k", "isOpenJSSEPreferred", "", "INFO", "I", "WARN", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "Lokhttp3/internal/platform/h;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        private final h d() {
            okhttp3.internal.platform.android.c.d.b();
            h h = okhttp3.internal.platform.a.h.a();
            if (h == null) {
                h = okhttp3.internal.platform.b.i.a();
                k0.m((Object)h);
            }
            return h;
        }
        
        private final h e() {
            if (this.j()) {
                final okhttp3.internal.platform.d c = okhttp3.internal.platform.d.h.c();
                if (c != null) {
                    return c;
                }
            }
            if (this.i()) {
                final okhttp3.internal.platform.c a = okhttp3.internal.platform.c.h.a();
                if (a != null) {
                    return a;
                }
            }
            if (this.k()) {
                final g a2 = g.h.a();
                if (a2 != null) {
                    return a2;
                }
            }
            final okhttp3.internal.platform.f a3 = okhttp3.internal.platform.f.g.a();
            if (a3 != null) {
                return a3;
            }
            final h a4 = okhttp3.internal.platform.e.k.a();
            if (a4 != null) {
                return a4;
            }
            return new h();
        }
        
        private final h f() {
            h h;
            if (this.h()) {
                h = this.d();
            }
            else {
                h = this.e();
            }
            return h;
        }
        
        private final boolean i() {
            final Provider provider = Security.getProviders()[0];
            k0.o((Object)provider, "Security.getProviders()[0]");
            return k0.g((Object)"BC", (Object)provider.getName());
        }
        
        private final boolean j() {
            final Provider provider = Security.getProviders()[0];
            k0.o((Object)provider, "Security.getProviders()[0]");
            return k0.g((Object)"Conscrypt", (Object)provider.getName());
        }
        
        private final boolean k() {
            final Provider provider = Security.getProviders()[0];
            k0.o((Object)provider, "Security.getProviders()[0]");
            return k0.g((Object)"OpenJSSE", (Object)provider.getName());
        }
        
        @e
        public final List<String> b(@e final List<? extends d0> list) {
            k0.p((Object)list, "protocols");
            final ArrayList<d0> list2 = new ArrayList<d0>();
            for (final d0 next : list) {
                if (next != d0.H) {
                    list2.add(next);
                }
            }
            final ArrayList list3 = new ArrayList<String>(v.Y((Iterable)list2, 10));
            final Iterator<Object> iterator2 = list2.iterator();
            while (iterator2.hasNext()) {
                list3.add(iterator2.next().toString());
            }
            return (List<String>)list3;
        }
        
        @e
        public final byte[] c(@e final List<? extends d0> list) {
            k0.p((Object)list, "protocols");
            final m m = new m();
            for (final String s : this.b(list)) {
                m.G0(s.length());
                m.p1(s);
            }
            return m.s1();
        }
        
        @k
        @e
        public final h g() {
            return h.a();
        }
        
        public final boolean h() {
            return k0.g((Object)"Dalvik", (Object)System.getProperty("java.vm.name"));
        }
        
        public final void l(@e final h h) {
            k0.p((Object)h, "platform");
            h.b(h);
        }
    }
}
