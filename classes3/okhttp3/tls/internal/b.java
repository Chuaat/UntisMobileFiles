// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal;

import okhttp3.internal.d;
import javax.net.ssl.SSLEngine;
import java.net.Socket;
import java.security.cert.CertificateException;
import org.jetbrains.annotations.f;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.util.List;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import kotlin.Metadata;
import javax.net.ssl.X509ExtendedTrustManager;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u001a\u001a\u00020\u0001\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\f\u001a\u00020\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\f\u0010\u0010J'\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J1\u0010\u0015\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J1\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c¨\u0006 " }, d2 = { "Lokhttp3/tls/internal/b;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "", "Ljava/security/cert/X509Certificate;", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "chain", "", "authType", "Ljava/net/Socket;", "socket", "Lkotlin/j2;", "checkServerTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)V", "Ljavax/net/ssl/SSLEngine;", "engine", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)V", "", "d", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)Ljava/lang/Void;", "a", "c", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljavax/net/ssl/SSLEngine;)Ljava/lang/Void;", "b", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/net/Socket;)Ljava/lang/Void;", "Ljavax/net/ssl/X509ExtendedTrustManager;", "delegate", "", "Ljava/util/List;", "insecureHosts", "<init>", "(Ljavax/net/ssl/X509ExtendedTrustManager;Ljava/util/List;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
@IgnoreJRERequirement
public final class b extends X509ExtendedTrustManager
{
    private final X509ExtendedTrustManager a;
    private final List<String> b;
    
    public b(@e final X509ExtendedTrustManager a, @e final List<String> b) {
        k0.p((Object)a, "delegate");
        k0.p((Object)b, "insecureHosts");
        this.a = a;
        this.b = b;
    }
    
    @e
    public Void a(@e final X509Certificate[] array, @f final String s) {
        k0.p((Object)array, "chain");
        throw new CertificateException("Unsupported operation");
    }
    
    @e
    public Void b(@e final X509Certificate[] array, @e final String s, @f final Socket socket) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        throw new CertificateException("Unsupported operation");
    }
    
    @e
    public Void c(@e final X509Certificate[] array, @e final String s, @f final SSLEngine sslEngine) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        throw new CertificateException("Unsupported operation");
    }
    
    @Override
    public void checkServerTrusted(@e final X509Certificate[] array, @e final String s, @e final Socket socket) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        k0.p((Object)socket, "socket");
        if (!this.b.contains(d.O(socket))) {
            this.a.checkServerTrusted(array, s, socket);
        }
    }
    
    @Override
    public void checkServerTrusted(@e final X509Certificate[] array, @e final String s, @e final SSLEngine sslEngine) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        k0.p((Object)sslEngine, "engine");
        if (!this.b.contains(sslEngine.getPeerHost())) {
            this.a.checkServerTrusted(array, s, sslEngine);
        }
    }
    
    @e
    public Void d(@e final X509Certificate[] array, @e final String s) {
        k0.p((Object)array, "chain");
        k0.p((Object)s, "authType");
        throw new CertificateException("Unsupported operation");
    }
    
    @e
    @Override
    public X509Certificate[] getAcceptedIssuers() {
        final X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
        k0.o((Object)acceptedIssuers, "delegate.acceptedIssuers");
        return acceptedIssuers;
    }
}
