// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002H\u00c6\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u001f\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u00c6\u0001J\t\u0010\b\u001a\u00020\u0002H\u00d6\u0001J\t\u0010\n\u001a\u00020\tH\u00d6\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016" }, d2 = { "Lokhttp3/tls/internal/der/d;", "", "", "a", "b", "type", "value", "c", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "Ljava/lang/Object;", "f", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    @e
    private final String a;
    @f
    private final Object b;
    
    public d(@e final String a, @f final Object b) {
        k0.p((Object)a, "type");
        this.a = a;
        this.b = b;
    }
    
    @e
    public final String a() {
        return this.a;
    }
    
    @f
    public final Object b() {
        return this.b;
    }
    
    @e
    public final d c(@e final String s, @f final Object o) {
        k0.p((Object)s, "type");
        return new d(s, o);
    }
    
    @e
    public final String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof d) {
                final d d = (d)o;
                if (k0.g((Object)this.a, (Object)d.a) && k0.g(this.b, d.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @f
    public final Object f() {
        return this.b;
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
        final Object b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AttributeTypeAndValue(type=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
