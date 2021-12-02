// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.tls;

import java.security.cert.Certificate;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.e;
import okhttp3.internal.a;
import java.util.Objects;
import java.util.Locale;
import kotlin.text.s;
import java.util.Iterator;
import java.util.Collection;
import java.security.cert.CertificateParsingException;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.ArrayList;
import java.util.List;
import java.security.cert.X509Certificate;
import kotlin.Metadata;
import javax.net.ssl.HostnameVerifier;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001c\u0010\u000b\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0016\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016¨\u0006\u001b" }, d2 = { "Lokhttp3/internal/tls/d;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "f", "hostname", "e", "pattern", "d", "", "type", "", "b", "host", "Ljavax/net/ssl/SSLSession;", "session", "verify", "c", "a", "I", "ALT_DNS_NAME", "ALT_IPA_NAME", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d implements HostnameVerifier
{
    private static final int a = 2;
    private static final int b = 7;
    public static final d c;
    
    static {
        c = new d();
    }
    
    private d() {
    }
    
    private final List<String> b(final X509Certificate x509Certificate, final int i) {
        try {
            final Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                final ArrayList<String> list = new ArrayList<String>();
                for (final List<Object> list2 : subjectAlternativeNames) {
                    if (list2 != null) {
                        if (list2.size() < 2) {
                            continue;
                        }
                        if (k0.g(list2.get(0), (Object)i) ^ true) {
                            continue;
                        }
                        final Object value = list2.get(1);
                        if (value == null) {
                            continue;
                        }
                        list.add((String)value);
                    }
                }
                return list;
            }
            return (List<String>)v.E();
        }
        catch (CertificateParsingException ex) {
            return (List<String>)v.E();
        }
    }
    
    private final boolean d(String s, final String str) {
        if (s != null && s.length() != 0 && !s.u2(s, ".", false, 2, null)) {
            if (!s.J1(s, "..", false, 2, null)) {
                if (str != null && str.length() != 0 && !s.u2(str, ".", false, 2, null)) {
                    if (!s.J1(str, "..", false, 2, null)) {
                        String string = s;
                        if (!s.J1(s, ".", false, 2, null)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(s);
                            sb.append(".");
                            string = sb.toString();
                        }
                        s = str;
                        if (!s.J1(str, ".", false, 2, null)) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(str);
                            sb2.append(".");
                            s = sb2.toString();
                        }
                        final Locale us = Locale.US;
                        k0.o((Object)us, "Locale.US");
                        Objects.requireNonNull(s, "null cannot be cast to non-null type java.lang.String");
                        s = s.toLowerCase(us);
                        k0.o((Object)s, "(this as java.lang.String).toLowerCase(locale)");
                        if (!s.V2(s, "*", false, 2, null)) {
                            return k0.g((Object)string, (Object)s);
                        }
                        if (s.u2(s, "*.", false, 2, null)) {
                            if (s.q3(s, '*', 1, false, 4, null) == -1) {
                                if (string.length() < s.length()) {
                                    return false;
                                }
                                if (k0.g((Object)"*.", (Object)s)) {
                                    return false;
                                }
                                s = s.substring(1);
                                k0.o((Object)s, "(this as java.lang.String).substring(startIndex)");
                                if (!s.J1(string, s, false, 2, null)) {
                                    return false;
                                }
                                final int n = string.length() - s.length();
                                return n <= 0 || s.E3(string, '.', n - 1, false, 4, null) == -1;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    private final boolean e(String lowerCase, final X509Certificate x509Certificate) {
        final Locale us = Locale.US;
        k0.o((Object)us, "Locale.US");
        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
        lowerCase = lowerCase.toLowerCase(us);
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        final List<String> b = this.b(x509Certificate, 2);
        final boolean b2 = b instanceof Collection;
        final boolean b3 = false;
        boolean b4;
        if (b2 && b.isEmpty()) {
            b4 = b3;
        }
        else {
            final Iterator<Object> iterator = b.iterator();
            do {
                b4 = b3;
                if (iterator.hasNext()) {
                    continue;
                }
                return b4;
            } while (!d.c.d(lowerCase, iterator.next()));
            b4 = true;
        }
        return b4;
    }
    
    private final boolean f(String e, final X509Certificate x509Certificate) {
        e = okhttp3.internal.a.e(e);
        final List<String> b = this.b(x509Certificate, 7);
        final boolean b2 = b instanceof Collection;
        final boolean b3 = false;
        boolean b4;
        if (b2 && b.isEmpty()) {
            b4 = b3;
        }
        else {
            final Iterator<Object> iterator = b.iterator();
            do {
                b4 = b3;
                if (iterator.hasNext()) {
                    continue;
                }
                return b4;
            } while (!k0.g((Object)e, (Object)okhttp3.internal.a.e(iterator.next())));
            b4 = true;
        }
        return b4;
    }
    
    @e
    public final List<String> a(@e final X509Certificate x509Certificate) {
        k0.p((Object)x509Certificate, "certificate");
        return (List<String>)v.q4((Collection)this.b(x509Certificate, 7), (Iterable)this.b(x509Certificate, 2));
    }
    
    public final boolean c(@e final String s, @e final X509Certificate x509Certificate) {
        k0.p((Object)s, "host");
        k0.p((Object)x509Certificate, "certificate");
        boolean b;
        if (okhttp3.internal.d.h(s)) {
            b = this.f(s, x509Certificate);
        }
        else {
            b = this.e(s, x509Certificate);
        }
        return b;
    }
    
    @Override
    public boolean verify(@e final String s, @e final SSLSession sslSession) {
        k0.p((Object)s, "host");
        k0.p((Object)sslSession, "session");
        final boolean b = false;
        try {
            final Certificate certificate = sslSession.getPeerCertificates()[0];
            if (certificate != null) {
                return this.c(s, (X509Certificate)certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        }
        catch (SSLException ex) {
            return b;
        }
    }
}
