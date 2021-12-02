// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import org.bouncycastle.jsse.BCSSLParameters;
import java.util.Objects;
import okhttp3.internal.platform.h;
import okhttp3.d0;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.f;
import org.bouncycastle.jsse.BCSSLSocket;
import okhttp3.internal.platform.c;
import kotlin.jvm.internal.k0;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/platform/android/g;", "Lokhttp3/internal/platform/android/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "b", "", "c", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class g implements k
{
    @e
    private static final j.a a;
    public static final b b;
    
    static {
        b = new b(null);
        a = new j.a() {
            @Override
            public boolean a(@e final SSLSocket sslSocket) {
                k0.p((Object)sslSocket, "sslSocket");
                return c.h.b() && sslSocket instanceof BCSSLSocket;
            }
            
            @e
            @Override
            public k b(@e final SSLSocket sslSocket) {
                k0.p((Object)sslSocket, "sslSocket");
                return new g();
            }
        };
    }
    
    public static final /* synthetic */ j.a g() {
        return g.a;
    }
    
    @Override
    public boolean a(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        return sslSocket instanceof BCSSLSocket;
    }
    
    @Override
    public boolean b() {
        return c.h.b();
    }
    
    @f
    @Override
    public String c(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final String applicationProtocol = ((BCSSLSocket)sslSocket).getApplicationProtocol();
        if (applicationProtocol != null) {
            if (applicationProtocol.hashCode() != 0) {
                return applicationProtocol;
            }
            final String s = applicationProtocol;
            if (!applicationProtocol.equals("")) {
                return s;
            }
        }
        return null;
    }
    
    @f
    @Override
    public X509TrustManager d(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return k.a.b(this, sslSocketFactory);
    }
    
    @Override
    public boolean e(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return k.a.a(this, sslSocketFactory);
    }
    
    @Override
    public void f(@e final SSLSocket sslSocket, @f final String s, @e final List<? extends d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        if (this.a(sslSocket)) {
            final BCSSLSocket bcsslSocket = (BCSSLSocket)sslSocket;
            final BCSSLParameters parameters = bcsslSocket.getParameters();
            k0.o((Object)parameters, "sslParameters");
            final String[] array = h.e.b(list).toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            parameters.setApplicationProtocols((String[])array);
            bcsslSocket.setParameters(parameters);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t" }, d2 = { "okhttp3/internal/platform/android/g$b", "", "Lokhttp3/internal/platform/android/j$a;", "factory", "Lokhttp3/internal/platform/android/j$a;", "a", "()Lokhttp3/internal/platform/android/j$a;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        @e
        public final j.a a() {
            return g.g();
        }
    }
}
