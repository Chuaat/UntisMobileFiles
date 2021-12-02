// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import java.lang.reflect.InvocationTargetException;
import java.security.cert.TrustAnchor;
import javax.net.ssl.SSLSocketFactory;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import okhttp3.d0;
import javax.net.ssl.SSLSocket;
import java.lang.reflect.Method;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.net.ssl.X509TrustManager;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import okhttp3.internal.platform.android.g;
import okhttp3.internal.platform.android.i;
import okhttp3.internal.platform.android.j;
import okhttp3.internal.platform.android.f;
import okhttp3.internal.platform.android.l;
import android.os.Build$VERSION;
import kotlin.jvm.internal.w;
import okhttp3.internal.platform.android.k;
import java.util.List;
import okhttp3.internal.c;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b+\u0010,J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J-\u0010\u0016\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0011\u0010\u0015\u001a\r\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u00140\u0012H\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0018\u001a\u00020\u0010H\u0016J\u001a\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u0019H\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\fH\u0016J\u0010\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\fH\u0016R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010&R\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010)¨\u00060" }, d2 = { "Lokhttp3/internal/platform/b;", "Lokhttp3/internal/platform/h;", "Ljava/net/Socket;", "socket", "Ljava/net/InetSocketAddress;", "address", "", "connectTimeout", "Lkotlin/j2;", "g", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lm6/l;", "protocols", "f", "j", "closer", "", "k", "message", "stackTrace", "o", "", "l", "trustManager", "Lokhttp3/internal/tls/c;", "d", "Lokhttp3/internal/tls/e;", "e", "Lokhttp3/internal/platform/android/k;", "Ljava/util/List;", "socketAdapters", "Lokhttp3/internal/platform/android/h;", "Lokhttp3/internal/platform/android/h;", "closeGuard", "<init>", "()V", "i", "a", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
@c
public final class b extends h
{
    private static final boolean h;
    public static final a i;
    private final List<k> f;
    private final okhttp3.internal.platform.android.h g;
    
    static {
        i = new a(null);
        final boolean h2 = okhttp3.internal.platform.h.e.h();
        boolean h3 = true;
        boolean b = false;
        Label_0056: {
            if (h2) {
                final int sdk_INT = Build$VERSION.SDK_INT;
                if (sdk_INT < 30) {
                    if (sdk_INT >= 21) {
                        b = true;
                    }
                    if (b) {
                        break Label_0056;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Expected Android API level 21+ but was ");
                    sb.append(sdk_INT);
                    throw new IllegalStateException(sb.toString().toString());
                }
            }
            h3 = false;
        }
        h = h3;
    }
    
    public b() {
        final List n = v.N((Object[])new k[] { l.a.b(l.j, null, 1, null), new j(okhttp3.internal.platform.android.f.g.d()), new j(okhttp3.internal.platform.android.i.b.a()), new j(okhttp3.internal.platform.android.g.b.a()) });
        final ArrayList<k> f = new ArrayList<k>();
        for (final k next : n) {
            if (next.b()) {
                f.add(next);
            }
        }
        this.f = f;
        this.g = okhttp3.internal.platform.android.h.d.a();
    }
    
    public static final /* synthetic */ boolean t() {
        return b.h;
    }
    
    @e
    @Override
    public okhttp3.internal.tls.c d(@e final X509TrustManager x509TrustManager) {
        k0.p((Object)x509TrustManager, "trustManager");
        final b a = b.d.a(x509TrustManager);
        okhttp3.internal.tls.c d;
        if (a != null) {
            d = a;
        }
        else {
            d = super.d(x509TrustManager);
        }
        return d;
    }
    
    @e
    @Override
    public okhttp3.internal.tls.e e(@e X509TrustManager e) {
        k0.p((Object)e, "trustManager");
        try {
            final Method declaredMethod = e.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            k0.o((Object)declaredMethod, "method");
            declaredMethod.setAccessible(true);
            e = (X509TrustManager)new b(e, declaredMethod);
        }
        catch (NoSuchMethodException ex) {
            e = (X509TrustManager)super.e(e);
        }
        return (okhttp3.internal.tls.e)e;
    }
    
    @Override
    public void f(@e final SSLSocket sslSocket, @org.jetbrains.annotations.f final String s, @e final List<d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        while (true) {
            for (final k next : this.f) {
                if (next.a(sslSocket)) {
                    final k k = next;
                    if (k != null) {
                        k.f(sslSocket, s, list);
                    }
                    return;
                }
            }
            k next = null;
            continue;
        }
    }
    
    @Override
    public void g(@e final Socket socket, @e final InetSocketAddress endpoint, final int timeout) throws IOException {
        k0.p((Object)socket, "socket");
        k0.p((Object)endpoint, "address");
        try {
            socket.connect(endpoint, timeout);
        }
        catch (ClassCastException cause) {
            if (Build$VERSION.SDK_INT == 26) {
                throw new IOException("Exception in connect", cause);
            }
            throw cause;
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final Iterator<Object> iterator = this.f.iterator();
        while (true) {
            k next;
            do {
                final boolean hasNext = iterator.hasNext();
                final String s = null;
                if (!hasNext) {
                    next = null;
                    final k k = next;
                    String c = s;
                    if (k != null) {
                        c = k.c(sslSocket);
                    }
                    return c;
                }
                next = iterator.next();
            } while (!next.a(sslSocket));
            continue;
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public Object k(@e final String s) {
        k0.p((Object)s, "closer");
        return this.g.a(s);
    }
    
    @Override
    public boolean l(@e final String s) {
        k0.p((Object)s, "hostname");
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b;
        if (sdk_INT >= 24) {
            b = NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(s);
        }
        else if (sdk_INT >= 23) {
            final NetworkSecurityPolicy instance = NetworkSecurityPolicy.getInstance();
            k0.o((Object)instance, "NetworkSecurityPolicy.getInstance()");
            b = instance.isCleartextTrafficPermitted();
        }
        else {
            b = true;
        }
        return b;
    }
    
    @Override
    public void o(@e final String s, @org.jetbrains.annotations.f final Object o) {
        k0.p((Object)s, "message");
        if (!this.g.b(o)) {
            okhttp3.internal.platform.h.n(this, s, 5, null, 4, null);
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public X509TrustManager s(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        final Iterator<Object> iterator = this.f.iterator();
        while (true) {
            k next;
            do {
                final boolean hasNext = iterator.hasNext();
                final X509TrustManager x509TrustManager = null;
                if (!hasNext) {
                    next = null;
                    final k k = next;
                    X509TrustManager d = x509TrustManager;
                    if (k != null) {
                        d = k.d(sslSocketFactory);
                    }
                    return d;
                }
                next = iterator.next();
            } while (!next.e(sslSocketFactory));
            continue;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okhttp3/internal/platform/b$a", "", "Lokhttp3/internal/platform/h;", "a", "", "isSupported", "Z", "b", "()Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final h a() {
            b b;
            if (this.b()) {
                b = new b();
            }
            else {
                b = null;
            }
            return b;
        }
        
        public final boolean b() {
            return b.t();
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002H\u00c2\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c2\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001d\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u000fH\u00d6\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016¨\u0006\u0019" }, d2 = { "okhttp3/internal/platform/b$b", "Lokhttp3/internal/tls/e;", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljava/lang/reflect/Method;", "c", "Ljava/security/cert/X509Certificate;", "cert", "a", "trustManager", "findByIssuerAndSignatureMethod", "Lokhttp3/internal/platform/b$b;", "d", "", "toString", "", "hashCode", "", "other", "", "equals", "Ljavax/net/ssl/X509TrustManager;", "Ljava/lang/reflect/Method;", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/lang/reflect/Method;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b implements e
    {
        private final X509TrustManager a;
        private final Method b;
        
        public b(@org.jetbrains.annotations.e final X509TrustManager a, @org.jetbrains.annotations.e final Method b) {
            k0.p((Object)a, "trustManager");
            k0.p((Object)b, "findByIssuerAndSignatureMethod");
            this.a = a;
            this.b = b;
        }
        
        private final X509TrustManager b() {
            return this.a;
        }
        
        private final Method c() {
            return this.b;
        }
        
        @org.jetbrains.annotations.f
        @Override
        public X509Certificate a(@org.jetbrains.annotations.e X509Certificate trustedCert) {
            k0.p((Object)trustedCert, "cert");
            try {
                final Object invoke = this.b.invoke(this.a, trustedCert);
                if (invoke != null) {
                    trustedCert = ((TrustAnchor)invoke).getTrustedCert();
                    goto Label_0056;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.security.cert.TrustAnchor");
            }
            catch (InvocationTargetException ex) {
                trustedCert = null;
            }
            catch (IllegalAccessException cause) {
                throw new AssertionError("unable to get issues and signature", cause);
            }
        }
        
        @org.jetbrains.annotations.e
        public final b d(@org.jetbrains.annotations.e final X509TrustManager x509TrustManager, @org.jetbrains.annotations.e final Method method) {
            k0.p((Object)x509TrustManager, "trustManager");
            k0.p((Object)method, "findByIssuerAndSignatureMethod");
            return new b(x509TrustManager, method);
        }
        
        @Override
        public boolean equals(@org.jetbrains.annotations.f final Object o) {
            if (this != o) {
                if (o instanceof b) {
                    final b b = (b)o;
                    if (k0.g((Object)this.a, (Object)b.a) && k0.g((Object)this.b, (Object)b.b)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public int hashCode() {
            final X509TrustManager a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final Method b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("CustomTrustRootIndex(trustManager=");
            sb.append(this.a);
            sb.append(", findByIssuerAndSignatureMethod=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }
}
