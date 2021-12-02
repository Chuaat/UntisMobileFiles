// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J)\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\t\u0010\u000b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\r\u001a\u00020\fH\u00d6\u0001J\u0013\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b" }, d2 = { "Lokhttp3/tls/internal/der/n;", "", "", "a", "", "b", "c", "id", "critical", "value", "d", "toString", "", "hashCode", "other", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/lang/Object;", "h", "()Ljava/lang/Object;", "Z", "f", "()Z", "<init>", "(Ljava/lang/String;ZLjava/lang/Object;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class n
{
    @e
    private final String a;
    private final boolean b;
    @f
    private final Object c;
    
    public n(@e final String a, final boolean b, @f final Object c) {
        k0.p((Object)a, "id");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    public final boolean b() {
        return this.b;
    }
    
    @f
    public final Object c() {
        return this.c;
    }
    
    @e
    public final n d(@e final String s, final boolean b, @f final Object o) {
        k0.p((Object)s, "id");
        return new n(s, b, o);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof n) {
                final n n = (n)o;
                if (k0.g((Object)this.a, (Object)n.a) && this.b == n.b && k0.g(this.c, n.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean f() {
        return this.b;
    }
    
    @e
    public final String g() {
        return this.a;
    }
    
    @f
    public final Object h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final Object c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + b) * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Extension(id=");
        sb.append(this.a);
        sb.append(", critical=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
