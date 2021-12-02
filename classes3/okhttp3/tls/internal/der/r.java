// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.util.List;
import org.jetbrains.annotations.e;
import java.math.BigInteger;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0080\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u0006\u0010\u001b\u001a\u00020\r\u0012\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n\u0012\u0006\u0010\u001d\u001a\u00020\u0010\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\n¢\u0006\u0004\bB\u0010CJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J\u0015\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nH\u00c6\u0003J\t\u0010\u000e\u001a\u00020\rH\u00c6\u0003J\u0015\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\nH\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u00c6\u0003J\u008f\u0001\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\b2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\b\b\u0002\u0010\u001b\u001a\u00020\r2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n2\b\b\u0002\u0010\u001d\u001a\u00020\u00102\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\nH\u00c6\u0001J\t\u0010#\u001a\u00020\"H\u00d6\u0001J\u0013\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u001d\u001a\u00020\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u0017\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010-\u001a\u0004\b.\u0010/R\u0013\u00102\u001a\u00020\"8F@\u0006¢\u0006\u0006\u001a\u0004\b0\u00101R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u00103\u001a\u0004\b4\u00105R%\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b6\u0010/R\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b7\u00105R\u0019\u0010\u0018\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0019\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u001b\u001a\u00020\r8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010@R%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\bA\u0010/¨\u0006D" }, d2 = { "Lokhttp3/tls/internal/der/r;", "", "", "hashCode", "", "a", "Ljava/math/BigInteger;", "c", "Lokhttp3/tls/internal/der/b;", "d", "", "Lokhttp3/tls/internal/der/d;", "e", "Lokhttp3/tls/internal/der/s;", "f", "g", "Lokhttp3/tls/internal/der/q;", "h", "Lokhttp3/tls/internal/der/g;", "i", "j", "Lokhttp3/tls/internal/der/n;", "b", "version", "serialNumber", "signature", "issuer", "validity", "subject", "subjectPublicKeyInfo", "issuerUniqueID", "subjectUniqueID", "extensions", "k", "", "toString", "other", "", "equals", "Lokhttp3/tls/internal/der/q;", "t", "()Lokhttp3/tls/internal/der/q;", "J", "w", "()J", "Ljava/util/List;", "m", "()Ljava/util/List;", "r", "()Ljava/lang/String;", "signatureAlgorithmName", "Lokhttp3/tls/internal/der/g;", "u", "()Lokhttp3/tls/internal/der/g;", "n", "o", "Ljava/math/BigInteger;", "p", "()Ljava/math/BigInteger;", "Lokhttp3/tls/internal/der/b;", "q", "()Lokhttp3/tls/internal/der/b;", "Lokhttp3/tls/internal/der/s;", "v", "()Lokhttp3/tls/internal/der/s;", "s", "<init>", "(JLjava/math/BigInteger;Lokhttp3/tls/internal/der/b;Ljava/util/List;Lokhttp3/tls/internal/der/s;Ljava/util/List;Lokhttp3/tls/internal/der/q;Lokhttp3/tls/internal/der/g;Lokhttp3/tls/internal/der/g;Ljava/util/List;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class r
{
    private final long a;
    @e
    private final BigInteger b;
    @e
    private final b c;
    @e
    private final List<List<d>> d;
    @e
    private final s e;
    @e
    private final List<List<d>> f;
    @e
    private final q g;
    @f
    private final g h;
    @f
    private final g i;
    @e
    private final List<n> j;
    
    public r(final long a, @e final BigInteger b, @e final b c, @e final List<? extends List<d>> d, @e final s e, @e final List<? extends List<d>> f, @e final q g, @f final g h, @f final g i, @e final List<n> j) {
        k0.p((Object)b, "serialNumber");
        k0.p((Object)c, "signature");
        k0.p((Object)d, "issuer");
        k0.p((Object)e, "validity");
        k0.p((Object)f, "subject");
        k0.p((Object)g, "subjectPublicKeyInfo");
        k0.p((Object)j, "extensions");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (List<List<d>>)d;
        this.e = e;
        this.f = (List<List<d>>)f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
    }
    
    public final long a() {
        return this.a;
    }
    
    @e
    public final List<n> b() {
        return this.j;
    }
    
    @e
    public final BigInteger c() {
        return this.b;
    }
    
    @e
    public final b d() {
        return this.c;
    }
    
    @e
    public final List<List<d>> e() {
        return this.d;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof r) {
                final r r = (r)o;
                if (this.a == r.a && k0.g((Object)this.b, (Object)r.b) && k0.g((Object)this.c, (Object)r.c) && k0.g((Object)this.d, (Object)r.d) && k0.g((Object)this.e, (Object)r.e) && k0.g((Object)this.f, (Object)r.f) && k0.g((Object)this.g, (Object)r.g) && k0.g((Object)this.h, (Object)r.h) && k0.g((Object)this.i, (Object)r.i) && k0.g((Object)this.j, (Object)r.j)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final s f() {
        return this.e;
    }
    
    @e
    public final List<List<d>> g() {
        return this.f;
    }
    
    @e
    public final q h() {
        return this.g;
    }
    
    @Override
    public int hashCode() {
        final int n = (int)this.a;
        int hashCode = 0;
        final int hashCode2 = this.b.hashCode();
        final int hashCode3 = this.c.hashCode();
        final int hashCode4 = this.d.hashCode();
        final int hashCode5 = this.e.hashCode();
        final int hashCode6 = this.f.hashCode();
        final int hashCode7 = this.g.hashCode();
        final g h = this.h;
        int hashCode8;
        if (h != null) {
            hashCode8 = h.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final g i = this.i;
        if (i != null) {
            hashCode = i.hashCode();
        }
        return (((((((((n + 0) * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode8) * 31 + hashCode) * 31 + this.j.hashCode();
    }
    
    @f
    public final g i() {
        return this.h;
    }
    
    @f
    public final g j() {
        return this.i;
    }
    
    @e
    public final r k(final long n, @e final BigInteger bigInteger, @e final b b, @e final List<? extends List<d>> list, @e final s s, @e final List<? extends List<d>> list2, @e final q q, @f final g g, @f final g g2, @e final List<n> list3) {
        k0.p((Object)bigInteger, "serialNumber");
        k0.p((Object)b, "signature");
        k0.p((Object)list, "issuer");
        k0.p((Object)s, "validity");
        k0.p((Object)list2, "subject");
        k0.p((Object)q, "subjectPublicKeyInfo");
        k0.p((Object)list3, "extensions");
        return new r(n, bigInteger, b, list, s, list2, q, g, g2, list3);
    }
    
    @e
    public final List<n> m() {
        return this.j;
    }
    
    @e
    public final List<List<d>> n() {
        return this.d;
    }
    
    @f
    public final g o() {
        return this.h;
    }
    
    @e
    public final BigInteger p() {
        return this.b;
    }
    
    @e
    public final b q() {
        return this.c;
    }
    
    @e
    public final String r() {
        final String e = this.c.e();
        final int hashCode = e.hashCode();
        Label_0054: {
            String s;
            if (hashCode != -551630290) {
                if (hashCode != 368620366 || !e.equals("1.2.840.10045.4.3.2")) {
                    break Label_0054;
                }
                s = "SHA256withECDSA";
            }
            else {
                if (!e.equals("1.2.840.113549.1.1.11")) {
                    break Label_0054;
                }
                s = "SHA256WithRSA";
            }
            return s;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("unexpected signature algorithm: ");
        sb.append(this.c.e());
        throw new IllegalStateException(sb.toString().toString());
    }
    
    @e
    public final List<List<d>> s() {
        return this.f;
    }
    
    @e
    public final q t() {
        return this.g;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TbsCertificate(version=");
        sb.append(this.a);
        sb.append(", serialNumber=");
        sb.append(this.b);
        sb.append(", signature=");
        sb.append(this.c);
        sb.append(", issuer=");
        sb.append(this.d);
        sb.append(", validity=");
        sb.append(this.e);
        sb.append(", subject=");
        sb.append(this.f);
        sb.append(", subjectPublicKeyInfo=");
        sb.append(this.g);
        sb.append(", issuerUniqueID=");
        sb.append(this.h);
        sb.append(", subjectUniqueID=");
        sb.append(this.i);
        sb.append(", extensions=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
    
    @f
    public final g u() {
        return this.i;
    }
    
    @e
    public final s v() {
        return this.e;
    }
    
    public final long w() {
        return this.a;
    }
}
