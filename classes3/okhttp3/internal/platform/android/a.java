// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import android.os.Build$VERSION;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import okhttp3.internal.platform.h;
import okhttp3.d0;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.f;
import android.net.ssl.SSLSockets;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.w;
import okhttp3.internal.c;
import android.annotation.SuppressLint;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0017¨\u0006\u0011" }, d2 = { "Lokhttp3/internal/platform/android/a;", "Lokhttp3/internal/platform/android/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "b", "", "c", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
@SuppressLint({ "NewApi" })
@c
public final class a implements k
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @Override
    public boolean a(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }
    
    @Override
    public boolean b() {
        return okhttp3.internal.platform.android.a.a.b();
    }
    
    @SuppressLint({ "NewApi" })
    @f
    @Override
    public String c(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final String applicationProtocol = sslSocket.getApplicationProtocol();
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
    
    @SuppressLint({ "NewApi" })
    @Override
    public void f(@e final SSLSocket sslSocket, @f final String s, @e final List<? extends d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            final SSLParameters sslParameters = sslSocket.getSSLParameters();
            k0.o((Object)sslParameters, "sslParameters");
            final String[] array = h.e.b(list).toArray(new String[0]);
            if (array != null) {
                sslParameters.setApplicationProtocols(array);
                sslSocket.setSSLParameters(sslParameters);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        catch (IllegalArgumentException cause) {
            throw new IOException("Android internal error", cause);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\b" }, d2 = { "okhttp3/internal/platform/android/a$a", "", "Lokhttp3/internal/platform/android/k;", "a", "", "b", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    @c
    public static final class a
    {
        private a() {
        }
        
        @f
        public final k a() {
            okhttp3.internal.platform.android.a a;
            if (this.b()) {
                a = new okhttp3.internal.platform.android.a();
            }
            else {
                a = null;
            }
            return a;
        }
        
        public final boolean b() {
            return h.e.h() && Build$VERSION.SDK_INT >= 29;
        }
    }
}
