// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.tls;

import java.util.Arrays;
import java.security.cert.X509Certificate;
import okhttp3.internal.platform.h;
import kotlin.jvm.internal.k0;
import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.jetbrains.annotations.e;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¨\u0006\n" }, d2 = { "Lokhttp3/internal/tls/c;", "", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class c
{
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @e
    public abstract List<Certificate> a(@e final List<? extends Certificate> p0, @e final String p1) throws SSLPeerUnverifiedException;
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J!\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u0006\"\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "okhttp3/internal/tls/c$a", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/tls/c;", "a", "", "Ljava/security/cert/X509Certificate;", "caCerts", "b", "([Ljava/security/cert/X509Certificate;)Lokhttp3/internal/tls/c;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final c a(@e final X509TrustManager x509TrustManager) {
            k0.p((Object)x509TrustManager, "trustManager");
            return h.e.g().d(x509TrustManager);
        }
        
        @e
        public final c b(@e final X509Certificate... original) {
            k0.p((Object)original, "caCerts");
            return new okhttp3.internal.tls.a(new b((X509Certificate[])Arrays.copyOf(original, original.length)));
        }
    }
}
