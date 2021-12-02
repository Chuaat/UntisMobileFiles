// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import org.jetbrains.annotations.f;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import java.net.InetSocketAddress;
import java.net.Proxy;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0019\u0010\u0015\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0018\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u001b\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001e" }, d2 = { "Lokhttp3/i0;", "", "Lokhttp3/a;", "a", "()Lokhttp3/a;", "Ljava/net/Proxy;", "b", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", "c", "()Ljava/net/InetSocketAddress;", "", "f", "other", "equals", "", "hashCode", "", "toString", "Ljava/net/InetSocketAddress;", "g", "socketAddress", "Ljava/net/Proxy;", "e", "proxy", "Lokhttp3/a;", "d", "address", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class i0
{
    @e
    private final a a;
    @e
    private final Proxy b;
    @e
    private final InetSocketAddress c;
    
    public i0(@e final a a, @e final Proxy b, @e final InetSocketAddress c) {
        k0.p((Object)a, "address");
        k0.p((Object)b, "proxy");
        k0.p((Object)c, "socketAddress");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "address", imports = {}))
    @g(name = "-deprecated_address")
    @e
    public final a a() {
        return this.a;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "proxy", imports = {}))
    @g(name = "-deprecated_proxy")
    @e
    public final Proxy b() {
        return this.b;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "socketAddress", imports = {}))
    @g(name = "-deprecated_socketAddress")
    @e
    public final InetSocketAddress c() {
        return this.c;
    }
    
    @g(name = "address")
    @e
    public final a d() {
        return this.a;
    }
    
    @g(name = "proxy")
    @e
    public final Proxy e() {
        return this.b;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof i0) {
            final i0 i0 = (i0)o;
            if (k0.g((Object)i0.a, (Object)this.a) && k0.g((Object)i0.b, (Object)this.b) && k0.g((Object)i0.c, (Object)this.c)) {
                return true;
            }
        }
        return false;
    }
    
    public final boolean f() {
        return this.a.v() != null && this.b.type() == Proxy.Type.HTTP;
    }
    
    @g(name = "socketAddress")
    @e
    public final InetSocketAddress g() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return ((527 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
