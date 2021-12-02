// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lokhttp3/tls/internal/der/q;", "", "Lokhttp3/tls/internal/der/b;", "a", "Lokhttp3/tls/internal/der/g;", "b", "algorithm", "subjectPublicKey", "c", "", "toString", "", "hashCode", "other", "", "equals", "Lokhttp3/tls/internal/der/b;", "e", "()Lokhttp3/tls/internal/der/b;", "Lokhttp3/tls/internal/der/g;", "f", "()Lokhttp3/tls/internal/der/g;", "<init>", "(Lokhttp3/tls/internal/der/b;Lokhttp3/tls/internal/der/g;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class q
{
    @e
    private final b a;
    @e
    private final g b;
    
    public q(@e final b a, @e final g b) {
        k0.p((Object)a, "algorithm");
        k0.p((Object)b, "subjectPublicKey");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final b a() {
        return this.a;
    }
    
    @e
    public final g b() {
        return this.b;
    }
    
    @e
    public final q c(@e final b b, @e final g g) {
        k0.p((Object)b, "algorithm");
        k0.p((Object)g, "subjectPublicKey");
        return new q(b, g);
    }
    
    @e
    public final b e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof q) {
                final q q = (q)o;
                if (k0.g((Object)this.a, (Object)q.a) && k0.g((Object)this.b, (Object)q.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final g f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        final b a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final g b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SubjectPublicKeyInfo(algorithm=");
        sb.append(this.a);
        sb.append(", subjectPublicKey=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
