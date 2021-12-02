// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import kotlin.jvm.internal.k0;
import okhttp3.d0;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH&J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\bH&¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/platform/android/k;", "", "", "b", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "d", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "a", "e", "", "hostname", "", "Lokhttp3/d0;", "protocols", "Lkotlin/j2;", "f", "c", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public interface k
{
    boolean a(@e final SSLSocket p0);
    
    boolean b();
    
    @f
    String c(@e final SSLSocket p0);
    
    @f
    X509TrustManager d(@e final SSLSocketFactory p0);
    
    boolean e(@e final SSLSocketFactory p0);
    
    void f(@e final SSLSocket p0, @f final String p1, @e final List<? extends d0> p2);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = {}, d2 = {}, k = 3, mv = { 1, 4, 0 })
    public static final class a
    {
        public static boolean a(@e final k k, @e final SSLSocketFactory sslSocketFactory) {
            k0.p((Object)sslSocketFactory, "sslSocketFactory");
            return false;
        }
        
        @f
        public static X509TrustManager b(@e final k k, @e final SSLSocketFactory sslSocketFactory) {
            k0.p((Object)sslSocketFactory, "sslSocketFactory");
            return null;
        }
    }
}
