// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.platform;

import javax.net.ssl.X509TrustManager;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.c;
import javax.net.ssl.SSLParameters;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import okhttp3.d0;
import java.util.List;
import org.jetbrains.annotations.e;
import javax.net.ssl.SSLSocket;
import kotlin.text.s;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\t\u0012\u00070\u0007¢\u0006\u0002\b\b0\u0006H\u0017J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0015" }, d2 = { "Lokhttp3/internal/platform/f;", "Lokhttp3/internal/platform/h;", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "hostname", "", "Lokhttp3/d0;", "Lm6/l;", "protocols", "Lkotlin/j2;", "f", "j", "Ljavax/net/ssl/SSLSocketFactory;", "sslSocketFactory", "Ljavax/net/ssl/X509TrustManager;", "s", "<init>", "()V", "g", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public class f extends h
{
    private static final boolean f;
    public static final a g;
    
    static {
        Integer x0 = null;
        g = new a(null);
        final String property = System.getProperty("java.specification.version");
        if (property != null) {
            x0 = s.X0(property);
        }
        boolean f2 = true;
        Label_0051: {
            if (x0 == null) {
                break Label_0051;
            }
            Label_0063: {
                if (x0 >= 9) {
                    break Label_0063;
                }
                while (true) {
                    f2 = false;
                    break Label_0063;
                    try {
                        SSLSocket.class.getMethod("getApplicationProtocol", (Class<?>[])new Class[0]);
                        f = f2;
                    }
                    catch (NoSuchMethodException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static final /* synthetic */ boolean t() {
        return okhttp3.internal.platform.f.f;
    }
    
    @c
    @Override
    public void f(@e final SSLSocket sslSocket, @org.jetbrains.annotations.f final String s, @e final List<d0> list) {
        k0.p((Object)sslSocket, "sslSocket");
        k0.p((Object)list, "protocols");
        final SSLParameters sslParameters = sslSocket.getSSLParameters();
        final List<String> b = h.e.b(list);
        k0.o((Object)sslParameters, "sslParameters");
        final Object[] array = b.toArray((Object[])new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        sslParameters.setApplicationProtocols((String[])array);
        sslSocket.setSSLParameters(sslParameters);
    }
    
    @c
    @org.jetbrains.annotations.f
    @Override
    public String j(@e final SSLSocket sslSocket) {
        k0.p((Object)sslSocket, "sslSocket");
        final String s = null;
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null) {
                applicationProtocol = s;
            }
            else if (applicationProtocol.hashCode() == 0) {
                if (applicationProtocol.equals("")) {
                    applicationProtocol = s;
                }
            }
            return applicationProtocol;
        }
        catch (UnsupportedOperationException ex) {
            return s;
        }
    }
    
    @org.jetbrains.annotations.f
    @Override
    public X509TrustManager s(@e final SSLSocketFactory sslSocketFactory) {
        k0.p((Object)sslSocketFactory, "sslSocketFactory");
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0019\u0010\u0005\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b" }, d2 = { "okhttp3/internal/platform/f$a", "", "Lokhttp3/internal/platform/f;", "a", "", "isAvailable", "Z", "b", "()Z", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @org.jetbrains.annotations.f
        public final f a() {
            f f;
            if (this.b()) {
                f = new f();
            }
            else {
                f = null;
            }
            return f;
        }
        
        public final boolean b() {
            return okhttp3.internal.platform.f.t();
        }
    }
}
