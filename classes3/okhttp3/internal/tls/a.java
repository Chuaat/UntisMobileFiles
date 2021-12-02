// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.tls;

import org.jetbrains.annotations.f;
import java.util.Iterator;
import javax.net.ssl.SSLPeerUnverifiedException;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ArrayDeque;
import java.security.cert.Certificate;
import java.util.List;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0013\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0096\u0002R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0013¨\u0006\u0018" }, d2 = { "Lokhttp3/internal/tls/a;", "Lokhttp3/internal/tls/c;", "Ljava/security/cert/X509Certificate;", "toVerify", "signingCert", "", "b", "", "Ljava/security/cert/Certificate;", "chain", "", "hostname", "a", "", "hashCode", "", "other", "equals", "Lokhttp3/internal/tls/e;", "Lokhttp3/internal/tls/e;", "trustRootIndex", "<init>", "(Lokhttp3/internal/tls/e;)V", "d", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class a extends c
{
    private static final int c = 9;
    public static final a d;
    private final e b;
    
    static {
        d = new a(null);
    }
    
    public a(@org.jetbrains.annotations.e final e b) {
        k0.p((Object)b, "trustRootIndex");
        this.b = b;
    }
    
    private final boolean b(final X509Certificate x509Certificate, final X509Certificate x509Certificate2) {
        final boolean g = k0.g((Object)x509Certificate.getIssuerDN(), (Object)x509Certificate2.getSubjectDN());
        boolean b = true;
        if (g ^ true) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
        }
        catch (GeneralSecurityException ex) {
            b = false;
        }
        return b;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<Certificate> a(@org.jetbrains.annotations.e final List<? extends Certificate> c, @org.jetbrains.annotations.e final String s) throws SSLPeerUnverifiedException {
        k0.p((Object)c, "chain");
        k0.p((Object)s, "hostname");
        final ArrayDeque<X509Certificate> arrayDeque = new ArrayDeque<X509Certificate>((Collection<? extends X509Certificate>)c);
        final ArrayList obj = new ArrayList<Object>();
        final Object removeFirst = arrayDeque.removeFirst();
        k0.o(removeFirst, "queue.removeFirst()");
        obj.add((X509Certificate)removeFirst);
        int i = 0;
        boolean b = false;
        while (i < 9) {
            final Object value = obj.get(obj.size() - 1);
            Objects.requireNonNull(value, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            final X509Certificate obj2 = (X509Certificate)value;
            final X509Certificate a = this.b.a(obj2);
            Label_0231: {
                if (a != null) {
                    if (obj.size() > 1 || (k0.g((Object)obj2, (Object)a) ^ true)) {
                        obj.add(a);
                    }
                    if (this.b(a, a)) {
                        return (List<Certificate>)obj;
                    }
                    b = true;
                }
                else {
                    final Iterator<Object> iterator = arrayDeque.iterator();
                    k0.o((Object)iterator, "queue.iterator()");
                    while (iterator.hasNext()) {
                        final X509Certificate next = iterator.next();
                        Objects.requireNonNull(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                        final X509Certificate x509Certificate = next;
                        if (this.b(obj2, x509Certificate)) {
                            iterator.remove();
                            obj.add(x509Certificate);
                            break Label_0231;
                        }
                    }
                    if (b) {
                        return (List<Certificate>)obj;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Failed to find a trusted cert that signed ");
                    sb.append(obj2);
                    throw new SSLPeerUnverifiedException(sb.toString());
                }
            }
            ++i;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Certificate chain too long: ");
        sb2.append(obj);
        throw new SSLPeerUnverifiedException(sb2.toString());
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = true;
        if (o != this) {
            if (!(o instanceof a) || !k0.g((Object)((a)o).b, (Object)this.b)) {
                b = false;
            }
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode();
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/internal/tls/a$a", "", "", "MAX_SIGNERS", "I", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
