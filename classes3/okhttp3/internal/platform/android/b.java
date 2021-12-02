// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import org.jetbrains.annotations.f;
import java.security.cert.CertificateException;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Objects;
import java.security.cert.X509Certificate;
import java.security.cert.Certificate;
import java.util.List;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import android.net.http.X509TrustManagerExtensions;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import okhttp3.internal.tls.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0007B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019" }, d2 = { "Lokhttp3/internal/platform/android/b;", "Lokhttp3/internal/tls/c;", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "other", "", "equals", "", "hashCode", "Ljavax/net/ssl/X509TrustManager;", "b", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Landroid/net/http/X509TrustManagerExtensions;", "c", "Landroid/net/http/X509TrustManagerExtensions;", "x509TrustManagerExtensions", "<init>", "(Ljavax/net/ssl/X509TrustManager;Landroid/net/http/X509TrustManagerExtensions;)V", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b extends c
{
    public static final a d;
    private final X509TrustManager b;
    private final X509TrustManagerExtensions c;
    
    static {
        d = new a(null);
    }
    
    public b(@e final X509TrustManager b, @e final X509TrustManagerExtensions c) {
        k0.p((Object)b, "trustManager");
        k0.p((Object)c, "x509TrustManagerExtensions");
        this.b = b;
        this.c = c;
    }
    
    @okhttp3.internal.c
    @e
    @Override
    public List<Certificate> a(@e final List<? extends Certificate> list, @e final String s) throws SSLPeerUnverifiedException {
        k0.p((Object)list, "chain");
        k0.p((Object)s, "hostname");
        final Object[] array = list.toArray((Object[])new X509Certificate[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        final X509Certificate[] array2 = (X509Certificate[])array;
        try {
            final List checkServerTrusted = this.c.checkServerTrusted(array2, "RSA", s);
            k0.o((Object)checkServerTrusted, "x509TrustManagerExtensio\u2026ficates, \"RSA\", hostname)");
            return (List<Certificate>)checkServerTrusted;
        }
        catch (CertificateException cause) {
            final SSLPeerUnverifiedException ex = new SSLPeerUnverifiedException(cause.getMessage());
            ex.initCause(cause);
            throw ex;
        }
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof b && ((b)o).b == this.b;
    }
    
    @Override
    public int hashCode() {
        return System.identityHashCode(this.b);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b" }, d2 = { "okhttp3/internal/platform/android/b$a", "", "Ljavax/net/ssl/X509TrustManager;", "trustManager", "Lokhttp3/internal/platform/android/b;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @okhttp3.internal.c
        @f
        public final b a(@e final X509TrustManager x509TrustManager) {
            k0.p((Object)x509TrustManager, "trustManager");
            b b = null;
            X509TrustManagerExtensions x509TrustManagerExtensions;
            try {
                x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
            }
            catch (IllegalArgumentException ex) {
                x509TrustManagerExtensions = null;
            }
            if (x509TrustManagerExtensions != null) {
                b = new b(x509TrustManager, x509TrustManagerExtensions);
            }
            return b;
        }
    }
}
