// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0004H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0015" }, d2 = { "Lokhttp3/tls/internal/der/s;", "", "", "hashCode", "", "a", "b", "notBefore", "notAfter", "c", "", "toString", "other", "", "equals", "J", "e", "()J", "f", "<init>", "(JJ)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class s
{
    private final long a;
    private final long b;
    
    public s(final long a, final long b) {
        this.a = a;
        this.b = b;
    }
    
    public final long a() {
        return this.a;
    }
    
    public final long b() {
        return this.b;
    }
    
    @e
    public final s c(final long n, final long n2) {
        return new s(n, n2);
    }
    
    public final long e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof s) {
                final s s = (s)o;
                if (this.a == s.a && this.b == s.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final long f() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return (0 + (int)this.a) * 31 + (int)this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Validity(notBefore=");
        sb.append(this.a);
        sb.append(", notAfter=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
