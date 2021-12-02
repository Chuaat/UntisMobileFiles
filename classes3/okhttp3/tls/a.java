// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls;

import kotlin.ranges.i;
import kotlin.ranges.o;
import java.security.cert.Certificate;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.security.GeneralSecurityException;
import kotlin.collections.v;
import okio.m;
import java.security.cert.CertificateFactory;
import okio.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.security.cert.X509Certificate;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0003\u001a\u00020\u0000*\u00020\u0001\u001a\u0018\u0010\t\u001a\u00020\b*\u00060\u0004j\u0002`\u00052\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¨\u0006\n" }, d2 = { "", "Ljava/security/cert/X509Certificate;", "b", "a", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lokio/p;", "data", "Lkotlin/j2;", "c", "okhttp-tls" }, k = 2, mv = { 1, 4, 0 })
@g(name = "Certificates")
public final class a
{
    @e
    public static final String a(@e final X509Certificate x509Certificate) {
        k0.p((Object)x509Certificate, "$this$certificatePem");
        final StringBuilder sb = new StringBuilder();
        sb.append("-----BEGIN CERTIFICATE-----\n");
        final p.a l = p.L;
        final byte[] encoded = x509Certificate.getEncoded();
        k0.o((Object)encoded, "encoded");
        c(sb, p.a.p(l, encoded, 0, 0, 3, null));
        sb.append("-----END CERTIFICATE-----\n");
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public static final X509Certificate b(@e final String s) {
        k0.p((Object)s, "$this$decodeCertificatePem");
        try {
            final Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new m().p1(s).N5());
            k0.o((Object)generateCertificates, "certificates");
            final Object s2 = v.S4((Iterable)generateCertificates);
            if (s2 != null) {
                return (X509Certificate)s2;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        }
        catch (GeneralSecurityException cause) {
            throw new IllegalArgumentException("failed to decode certificate", cause);
        }
        catch (IllegalArgumentException cause2) {
            throw new IllegalArgumentException("failed to decode certificate", cause2);
        }
        catch (NoSuchElementException cause3) {
            throw new IllegalArgumentException("failed to decode certificate", cause3);
        }
    }
    
    public static final void c(@e final StringBuilder sb, @e final p p2) {
        k0.p((Object)sb, "$this$encodeBase64Lines");
        k0.p((Object)p2, "data");
        final String g = p2.g();
        final i s0 = o.S0((i)o.n1(0, g.length()), 64);
        int k = s0.k();
        final int n = s0.n();
        final int o = s0.o();
        if (o >= 0) {
            if (k > n) {
                return;
            }
        }
        else if (k < n) {
            return;
        }
        while (true) {
            sb.append(g, k, Math.min(k + 64, g.length()));
            sb.append('\n');
            if (k == n) {
                break;
            }
            k += o;
        }
    }
}
