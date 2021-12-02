// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.tls.internal.der;

import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0007\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\t\u001a\u00020\bH\u00c6\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\bH\u00c6\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003R\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e" }, d2 = { "Lokhttp3/tls/internal/der/p;", "", "", "hashCode", "", "a", "Lokhttp3/tls/internal/der/b;", "b", "Lokio/p;", "c", "version", "algorithmIdentifier", "privateKey", "d", "", "toString", "other", "", "equals", "Lokio/p;", "g", "()Lokio/p;", "Lokhttp3/tls/internal/der/b;", "f", "()Lokhttp3/tls/internal/der/b;", "J", "h", "()J", "<init>", "(JLokhttp3/tls/internal/der/b;Lokio/p;)V", "okhttp-tls" }, k = 1, mv = { 1, 4, 0 })
public final class p
{
    private final long a;
    @e
    private final b b;
    @e
    private final okio.p c;
    
    public p(final long a, @e final b b, @e final okio.p c) {
        k0.p((Object)b, "algorithmIdentifier");
        k0.p((Object)c, "privateKey");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final long a() {
        return this.a;
    }
    
    @e
    public final b b() {
        return this.b;
    }
    
    @e
    public final okio.p c() {
        return this.c;
    }
    
    @e
    public final p d(final long n, @e final b b, @e final okio.p p3) {
        k0.p((Object)b, "algorithmIdentifier");
        k0.p((Object)p3, "privateKey");
        return new p(n, b, p3);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (this != o) {
            if (o instanceof p) {
                final p p = (p)o;
                if (this.a == p.a && k0.g((Object)this.b, (Object)p.b) && k0.g((Object)this.c, (Object)p.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @e
    public final b f() {
        return this.b;
    }
    
    @e
    public final okio.p g() {
        return this.c;
    }
    
    public final long h() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return ((0 + (int)this.a) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PrivateKeyInfo(version=");
        sb.append(this.a);
        sb.append(", algorithmIdentifier=");
        sb.append(this.b);
        sb.append(", privateKey=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
