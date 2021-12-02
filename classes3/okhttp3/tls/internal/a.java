// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal;

import java.lang.reflect.InvocationTargetException;
import kotlin.collections.v;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import org.jetbrains.annotations.f;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import java.lang.reflect.Method;
import kotlin.Metadata;
import javax.net.ssl.X509TrustManager;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0013\u001a\u00020\u0001\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ)\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u001b" }, d2 = { "Lokhttp3/tls/internal/a;", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "host", "", "Ljava/security/cert/Certificate;", "c", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "", "a", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "b", "Ljavax/net/ssl/X509TrustManager;", "delegate", "Ljava/lang/reflect/Method;", "Ljava/lang/reflect/Method;", "checkServerTrustedMethod", "Ljava/util/List;", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509TrustManager;Ljava/util/List;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class a implements X509TrustManager
{
    private final Method a;
    private final X509TrustManager b;
    private final List<String> c;
    
    public a(@e final X509TrustManager b, @e final List<String> c) {
        k0.p((Object)b, "delegate");
        k0.p((Object)c, "insecureHosts");
        this.b = b;
        this.c = c;
        Method method;
        try {
            method = b.getClass().getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class);
        }
        catch (NoSuchMethodException ex) {
            method = null;
        }
        this.a = method;
    }
    
    @e
    public Void a(@e final X509Certificate[] array, @f final String s) {
        k0.p((Object)array, "chain");
        throw new CertificateException("Unsupported operation");
    }
    
    @e
    public Void b(@e final X509Certificate[] array, @e final String s) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        throw new CertificateException("Unsupported operation");
    }
    
    @e
    public final List<Certificate> c(@e final X509Certificate[] array, @e final String s, @e final String s2) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        k0.p((Object)s2, "host");
        if (this.c.contains(s2)) {
            return (List<Certificate>)v.E();
        }
        try {
            final Method a = this.a;
            if (a == null) {
                throw new CertificateException("Failed to call checkServerTrusted");
            }
            final Object invoke = a.invoke(this.b, array, s, s2);
            if (invoke != null) {
                return (List<Certificate>)invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<java.security.cert.Certificate>");
        }
        catch (InvocationTargetException ex) {
            final Throwable targetException = ex.getTargetException();
            k0.o((Object)targetException, "e.targetException");
            throw targetException;
        }
    }
    
    @e
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        final X509Certificate[] acceptedIssuers = this.b.getAcceptedIssuers();
        k0.o((Object)acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }
}
