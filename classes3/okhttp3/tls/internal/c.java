// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509ExtendedTrustManager;
import okhttp3.internal.platform.h;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.util.List;
import javax.net.ssl.KeyManager;
import java.util.Arrays;
import java.util.Objects;
import javax.net.ssl.KeyManagerFactory;
import java.security.Key;
import kotlin.collections.m;
import java.security.cert.Certificate;
import javax.net.ssl.X509KeyManager;
import java.security.cert.X509Certificate;
import org.jetbrains.annotations.f;
import java.io.InputStream;
import java.security.KeyStore;
import m6.k;
import okhttp3.tls.b;
import n6.a;
import kotlin.d0;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J.\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007J7\u0010\u0011\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u000e\"\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002R\u0019\u0010\u001a\u001a\u00020\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\u00028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c¨\u0006 " }, d2 = { "Lokhttp3/tls/internal/c;", "", "Lokhttp3/tls/b;", "c", "", "keyStoreType", "", "Ljava/security/cert/X509Certificate;", "trustedCertificates", "insecureHosts", "Ljavax/net/ssl/X509TrustManager;", "f", "Lokhttp3/tls/c;", "heldCertificate", "", "intermediates", "Ljavax/net/ssl/X509KeyManager;", "e", "(Ljava/lang/String;Lokhttp3/tls/c;[Ljava/security/cert/X509Certificate;)Ljavax/net/ssl/X509KeyManager;", "Ljava/security/KeyStore;", "d", "", "a", "[C", "b", "()[C", "password", "Lkotlin/b0;", "()Lokhttp3/tls/b;", "localhost", "<init>", "()V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class c
{
    @e
    private static final char[] a;
    private static final b0 b;
    public static final c c;
    
    static {
        c = new c();
        final char[] charArray = "password".toCharArray();
        k0.o((Object)charArray, "(this as java.lang.String).toCharArray()");
        a = charArray;
        b = d0.c((a)c$a.G);
    }
    
    private c() {
    }
    
    private final b a() {
        return (b)okhttp3.tls.internal.c.b.getValue();
    }
    
    @k
    @e
    public static final b c() {
        return okhttp3.tls.internal.c.c.a();
    }
    
    private final KeyStore d(String defaultType) {
        if (defaultType == null) {
            defaultType = KeyStore.getDefaultType();
        }
        final KeyStore instance = KeyStore.getInstance(defaultType);
        instance.load(null, okhttp3.tls.internal.c.a);
        k0.o((Object)instance, "KeyStore.getInstance(key\u2026utStream, password)\n    }");
        return instance;
    }
    
    @k
    @e
    public static final X509KeyManager e(@f final String s, @f final okhttp3.tls.c c, @e final X509Certificate... array) {
        k0.p((Object)array, "intermediates");
        final KeyStore d = c.c.d(s);
        boolean b = true;
        if (c != null) {
            final Certificate[] chain = new Certificate[array.length + 1];
            chain[0] = c.d();
            m.l1((Object[])array, (Object[])chain, 1, 0, 0, 12, (Object)null);
            d.setKeyEntry("private", c.g().getPrivate(), c.a, chain);
        }
        final KeyManagerFactory instance = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        instance.init(d, c.a);
        k0.o((Object)instance, "factory");
        final KeyManager[] keyManagers = instance.getKeyManagers();
        k0.m((Object)keyManagers);
        if (keyManagers.length != 1 || !(keyManagers[0] instanceof X509KeyManager)) {
            b = false;
        }
        if (b) {
            final KeyManager obj = keyManagers[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type javax.net.ssl.X509KeyManager");
            return (X509KeyManager)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected key managers:");
        final String string = Arrays.toString(keyManagers);
        k0.o((Object)string, "java.util.Arrays.toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @k
    @IgnoreJRERequirement
    @e
    public static final X509TrustManager f(@f String string, @e final List<? extends X509Certificate> list, @e final List<String> list2) {
        k0.p((Object)list, "trustedCertificates");
        k0.p((Object)list2, "insecureHosts");
        final KeyStore d = okhttp3.tls.internal.c.c.d(string);
        for (int size = list.size(), i = 0; i < size; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("cert_");
            sb.append(i);
            d.setCertificateEntry(sb.toString(), (Certificate)list.get(i));
        }
        final TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        instance.init(d);
        k0.o((Object)instance, "factory");
        final TrustManager[] trustManagers = instance.getTrustManagers();
        k0.m((Object)trustManagers);
        final int length = trustManagers.length;
        boolean b = true;
        if (length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            b = false;
        }
        if (b) {
            final TrustManager obj = trustManagers[0];
            Objects.requireNonNull(obj, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
            X509TrustManager x509TrustManager = (X509TrustManager)obj;
            if (!list2.isEmpty()) {
                if (h.e.h()) {
                    x509TrustManager = new okhttp3.tls.internal.a(x509TrustManager, list2);
                }
                else {
                    x509TrustManager = new okhttp3.tls.internal.b((X509ExtendedTrustManager)x509TrustManager, list2);
                }
            }
            return x509TrustManager;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unexpected trust managers: ");
        string = Arrays.toString(trustManagers);
        k0.o((Object)string, "java.util.Arrays.toString(this)");
        sb2.append(string);
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    @e
    public final char[] b() {
        return okhttp3.tls.internal.c.a;
    }
}
