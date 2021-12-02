// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import okio.p;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0006\u001a\u00020\u0002H\u00c6\u0003J\u001d\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0002H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\nH\u00d6\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0007\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017" }, d2 = { "Lokhttp3/tls/internal/der/g;", "", "", "hashCode", "Lokio/p;", "a", "b", "byteString", "unusedBitsCount", "c", "", "toString", "other", "", "equals", "Lokio/p;", "e", "()Lokio/p;", "I", "f", "()I", "<init>", "(Lokio/p;I)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class g
{
    @e
    private final p a;
    private final int b;
    
    public g(@e final p a, final int b) {
        k0.p((Object)a, "byteString");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final p a() {
        return this.a;
    }
    
    public final int b() {
        return this.b;
    }
    
    @e
    public final g c(@e final p p2, final int n) {
        k0.p((Object)p2, "byteString");
        return new g(p2, n);
    }
    
    @e
    public final p e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof g) {
                final g g = (g)o;
                if (k0.g((Object)this.a, (Object)g.a) && this.b == g.b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final int f() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return (0 + this.a.hashCode()) * 31 + this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("BitString(byteString=");
        sb.append(this.a);
        sb.append(", unusedBitsCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
