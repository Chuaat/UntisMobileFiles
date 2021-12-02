// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform.android;

import okhttp3.internal.platform.h;
import okhttp3.internal.d;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.w;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B3\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u000e0\b\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\b\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\u000b\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u0006\u0012\u0002\b\u00030\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/platform/android/l;", "Lokhttp3/internal/platform/android/f;", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "", "e", "Ljavax/net/ssl/X509TrustManager;", "d", "Ljava/lang/Class;", "h", "Ljava/lang/Class;", "sslSocketFactoryClass", "i", "paramClass", "Ljavax/net/ssl/SSLSocket;", "sslSocketClass", "<init>", "(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/Class;)V", "j", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class l extends f
{
    public static final a j;
    private final Class<? super SSLSocketFactory> h;
    private final Class<?> i;
    
    static {
        j = new a(null);
    }
    
    public l(@e final Class<? super SSLSocket> clazz, @e final Class<? super SSLSocketFactory> h, @e final Class<?> i) {
        k0.p((Object)clazz, "sslSocketClass");
        k0.p((Object)h, "sslSocketFactoryClass");
        k0.p((Object)i, "paramClass");
        super(clazz);
        this.h = h;
        this.i = i;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public X509TrustManager d(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        final Object q = okhttp3.internal.d.Q(sslSocketFactory, this.i, "sslParameters");
        k0.m(q);
        X509TrustManager x509TrustManager = okhttp3.internal.d.Q(q, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager == null) {
            x509TrustManager = okhttp3.internal.d.Q(q, X509TrustManager.class, "trustManager");
        }
        return x509TrustManager;
    }
    
    @Override
    public boolean e(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        return this.h.isInstance(sslSocketFactory);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "okhttp3/internal/platform/android/l$a", "", "", "packageName", "Lokhttp3/internal/platform/android/k;", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final k a(@e final String str) {
            k0.p((Object)str, "packageName");
            k k;
            try {
                final StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".OpenSSLSocketImpl");
                final Class<?> forName = Class.forName(sb.toString());
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".OpenSSLSocketFactoryImpl");
                final Class<?> forName2 = Class.forName(sb2.toString());
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".SSLParametersImpl");
                final Class<?> forName3 = Class.forName(sb3.toString());
                k0.o((Object)forName3, "paramsClass");
                k = new l((Class<? super SSLSocket>)forName, (Class<? super SSLSocketFactory>)forName2, forName3);
            }
            catch (Exception ex) {
                okhttp3.internal.platform.h.e.g().m("unable to load android socket classes", 5, ex);
                k = null;
            }
            return k;
        }
    }
}
