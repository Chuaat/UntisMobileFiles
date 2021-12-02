// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import java.security.cert.Certificate;
import java.util.Collection;
import java.security.GeneralSecurityException;
import okio.m;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import kotlin.collections.v;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.jetbrains.annotations.f;
import java.security.SignatureException;
import okio.p;
import java.security.Signature;
import java.security.PublicKey;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\t\u0010\u000b\u001a\u00020\nH\u00c6\u0003J\t\u0010\r\u001a\u00020\fH\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\fH\u00c6\u0001J\t\u0010\u0013\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001J\u0013\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0010\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u000e\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010 \u001a\u0004\u0018\u00010\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u0015\u0010'\u001a\u0004\u0018\u00010$8F@\u0006¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0013\u0010)\u001a\u00020$8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0015\u0010+\u001a\u0004\u0018\u00010\u00018F@\u0006¢\u0006\u0006\u001a\u0004\b*\u0010\u001f¨\u0006." }, d2 = { "Lokhttp3/tls/internal/der/h;", "", "Ljava/security/PublicKey;", "issuer", "", "a", "Ljava/security/cert/X509Certificate;", "n", "Lokhttp3/tls/internal/der/r;", "b", "Lokhttp3/tls/internal/der/b;", "c", "Lokhttp3/tls/internal/der/g;", "d", "tbsCertificate", "signatureAlgorithm", "signatureValue", "e", "", "toString", "", "hashCode", "other", "equals", "Lokhttp3/tls/internal/der/g;", "k", "()Lokhttp3/tls/internal/der/g;", "Lokhttp3/tls/internal/der/r;", "m", "()Lokhttp3/tls/internal/der/r;", "h", "()Ljava/lang/Object;", "commonName", "Lokhttp3/tls/internal/der/b;", "j", "()Lokhttp3/tls/internal/der/b;", "Lokhttp3/tls/internal/der/n;", "l", "()Lokhttp3/tls/internal/der/n;", "subjectAlternativeNames", "g", "basicConstraints", "i", "organizationalUnitName", "<init>", "(Lokhttp3/tls/internal/der/r;Lokhttp3/tls/internal/der/b;Lokhttp3/tls/internal/der/g;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class h
{
    @e
    private final r a;
    @e
    private final b b;
    @e
    private final g c;
    
    public h(@e final r a, @e final b b, @e final g c) {
        k0.p((Object)a, "tbsCertificate");
        k0.p((Object)b, "signatureAlgorithm");
        k0.p((Object)c, "signatureValue");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final boolean a(@e final PublicKey publicKey) throws SignatureException {
        k0.p((Object)publicKey, "issuer");
        final p f = i.s.m().f(this.a);
        final Signature instance = Signature.getInstance(this.a.r());
        instance.initVerify(publicKey);
        instance.update(f.T0());
        return instance.verify(this.c.e().T0());
    }
    
    @e
    public final r b() {
        return this.a;
    }
    
    @e
    public final b c() {
        return this.b;
    }
    
    @e
    public final g d() {
        return this.c;
    }
    
    @e
    public final h e(@e final r r, @e final b b, @e final g g) {
        k0.p((Object)r, "tbsCertificate");
        k0.p((Object)b, "signatureAlgorithm");
        k0.p((Object)g, "signatureValue");
        return new h(r, b, g);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof h) {
                final h h = (h)o;
                if (k0.g((Object)this.a, (Object)h.a) && k0.g((Object)this.b, (Object)h.b) && k0.g((Object)this.c, (Object)h.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final n g() {
        for (final n n : this.a.m()) {
            if (k0.g((Object)n.g(), (Object)"2.5.29.19")) {
                return n;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    @f
    public final Object h() {
        final Iterator iterator = v.c0((Iterable)this.a.s()).iterator();
        while (true) {
            d next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Object o = null;
                if (!hasNext) {
                    next = null;
                    final d d = next;
                    Object f = o;
                    if (d != null) {
                        f = d.f();
                    }
                    return f;
                }
                next = iterator.next();
            } while (!k0.g((Object)next.e(), (Object)"2.5.4.3"));
            continue;
        }
    }
    
    @Override
    public int hashCode() {
        final r a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final b b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final g c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + hashCode3) * 31 + hashCode;
    }
    
    @f
    public final Object i() {
        final Iterator iterator = v.c0((Iterable)this.a.s()).iterator();
        while (true) {
            d next;
            do {
                final boolean hasNext = iterator.hasNext();
                final Object o = null;
                if (!hasNext) {
                    next = null;
                    final d d = next;
                    Object f = o;
                    if (d != null) {
                        f = d.f();
                    }
                    return f;
                }
                next = iterator.next();
            } while (!k0.g((Object)next.e(), (Object)"2.5.4.11"));
            continue;
        }
    }
    
    @e
    public final b j() {
        return this.b;
    }
    
    @e
    public final g k() {
        return this.c;
    }
    
    @f
    public final n l() {
        for (final n next : this.a.m()) {
            if (k0.g((Object)next.g(), (Object)"2.5.29.17")) {
                return next;
            }
        }
        return null;
    }
    
    @e
    public final r m() {
        return this.a;
    }
    
    @e
    public final X509Certificate n() {
        final p f = i.s.d().f(this);
        try {
            final Collection<? extends Certificate> generateCertificates = CertificateFactory.getInstance("X.509").generateCertificates(new m().p0(f).N5());
            k0.o((Object)generateCertificates, "certificates");
            final Object s4 = v.S4((Iterable)generateCertificates);
            if (s4 != null) {
                return (X509Certificate)s4;
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
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Certificate(tbsCertificate=");
        sb.append(this.a);
        sb.append(", signatureAlgorithm=");
        sb.append(this.b);
        sb.append(", signatureValue=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
