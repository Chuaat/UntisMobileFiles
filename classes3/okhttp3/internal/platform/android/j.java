// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import okhttp3.d0;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.f;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0007B\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0013¨\u0006\u0017" }, d2 = { "Lokhttp3/internal/platform/android/j;", "Lokhttp3/internal/platform/android/k;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "g", "", "b", "a", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "c", "Lokhttp3/internal/platform/android/j$a;", "Lokhttp3/internal/platform/android/j$a;", "socketAdapterFactory", "Lokhttp3/internal/platform/android/k;", "delegate", "<init>", "(Lokhttp3/internal/platform/android/j$a;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class j implements k
{
    private k a;
    private final a b;
    
    public j(@e final a b) {
        k0.p((Object)b, "socketAdapterFactory");
        this.b = b;
    }
    
    private final k g(final SSLSocket sslSocket) {
        synchronized (this) {
            if (this.a == null && this.b.a(sslSocket)) {
                this.a = this.b.b(sslSocket);
            }
            return this.a;
        }
    }
    
    @Override
    public boolean a(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        return this.b.a(sslSocket);
    }
    
    @Override
    public boolean b() {
        return true;
    }
    
    @f
    @Override
    public String c(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final k g = this.g(sslSocket);
        String c;
        if (g != null) {
            c = g.c(sslSocket);
        }
        else {
            c = null;
        }
        return c;
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
        final k g = this.g(sslSocket);
        if (g != null) {
            g.f(sslSocket, s, list);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b" }, d2 = { "okhttp3/internal/platform/android/j$a", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "a", "Lokhttp3/internal/platform/android/k;", "b", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface a
    {
        boolean a(@e final SSLSocket p0);
        
        @e
        k b(@e final SSLSocket p0);
    }
}
