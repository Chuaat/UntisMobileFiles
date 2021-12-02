// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001¢\u0006\u0004\b\t\u0010\nJ\t\u0010\f\u001a\u00020\u000bH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\rH\u00d6\u0001J\u0013\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u001b\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018" }, d2 = { "Lokhttp3/tls/internal/der/e;", "", "", "a", "", "b", "()Ljava/lang/Long;", "ca", "maxIntermediateCas", "c", "(ZLjava/lang/Long;)Lokhttp3/tls/internal/der/e;", "", "toString", "", "hashCode", "other", "equals", "Ljava/lang/Long;", "f", "Z", "e", "()Z", "<init>", "(ZLjava/lang/Long;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class e
{
    private final boolean a;
    @f
    private final Long b;
    
    public e(final boolean a, @f final Long b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        return this.a;
    }
    
    @f
    public final Long b() {
        return this.b;
    }
    
    @org.jetbrains.annotations.e
    public final e c(final boolean b, @f final Long n) {
        return new e(b, n);
    }
    
    public final boolean e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof e) {
                final e e = (e)o;
                if (this.a == e.a && k0.g((Object)this.b, (Object)e.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @f
    public final Long f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        int a;
        if ((a = (this.a ? 1 : 0)) != 0) {
            a = 1;
        }
        final Long b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BasicConstraints(ca=");
        sb.append(this.a);
        sb.append(", maxIntermediateCas=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
