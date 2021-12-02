// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.tls;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.k0;
import java.security.cert.X509Certificate;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import java.util.Map;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016R(\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000e¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/tls/b;", "Lokhttp3/internal/tls/e;", "Ljava/security/cert/X509Certificate;", "cert", "a", "", "other", "", "equals", "", "hashCode", "", "Ljavax/security/auth/x500/X500Principal;", "", "Ljava/util/Map;", "subjectToCaCerts", "", "caCerts", "<init>", "([Ljava/security/cert/X509Certificate;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b implements e
{
    private final Map<X500Principal, Set<X509Certificate>> a;
    
    public b(@org.jetbrains.annotations.e final X509Certificate... array) {
        k0.p((Object)array, "caCerts");
        final LinkedHashMap<Object, Set<X509Certificate>> a = new LinkedHashMap<Object, Set<X509Certificate>>();
        for (final X509Certificate x509Certificate : array) {
            final X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            k0.o((Object)subjectX500Principal, "caCert.subjectX500Principal");
            Set<X509Certificate> value;
            if ((value = a.get(subjectX500Principal)) == null) {
                value = new LinkedHashSet<X509Certificate>();
                a.put(subjectX500Principal, value);
            }
            value.add(x509Certificate);
        }
        this.a = (Map<X500Principal, Set<X509Certificate>>)a;
    }
    
    @f
    @Override
    public X509Certificate a(@org.jetbrains.annotations.e final X509Certificate x509Certificate) {
        k0.p((Object)x509Certificate, "cert");
        final Set<X509Certificate> set = this.a.get(x509Certificate.getIssuerX500Principal());
        X509Certificate x509Certificate2 = null;
        final X509Certificate x509Certificate3 = null;
        if (set != null) {
            final Iterator<Object> iterator = set.iterator();
            boolean b;
            X509Certificate next;
            do {
                next = x509Certificate3;
                if (!iterator.hasNext()) {
                    break;
                }
                next = iterator.next();
                final X509Certificate x509Certificate4 = next;
                try {
                    x509Certificate.verify(x509Certificate4.getPublicKey());
                    b = true;
                }
                catch (Exception ex) {
                    b = false;
                }
            } while (!b);
            x509Certificate2 = next;
        }
        return x509Certificate2;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o == this || (o instanceof b && k0.g((Object)((b)o).a, (Object)this.a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
