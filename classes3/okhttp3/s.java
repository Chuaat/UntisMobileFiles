// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.net.InetAddress;
import java.util.List;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.io.IOException;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import m6.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b&\u0018\u0000 :2\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b>\u0010?J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J+\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0011\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\tH\u0016J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0011\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0011¢\u0006\u0002\b\u000b0\tH\u0016J \u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\nH\u0016J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016J*\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J2\u0010!\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0018\u0010$\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010&\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0016J\u0010\u0010*\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010-\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00102\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u00103\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00104\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00106\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00107\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001fH\u0016J\u0010\u00108\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u00109\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u00101\u001a\u000200H\u0016J\u0010\u0010;\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010=\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u000200H\u0016¨\u0006@" }, d2 = { "Lokhttp3/s;", "", "Lokhttp3/e;", "call", "Lkotlin/j2;", "f", "Lokhttp3/w;", "url", "p", "", "Ljava/net/Proxy;", "Lm6/l;", "proxies", "o", "", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lokhttp3/u;", "handshake", "B", "Lokhttp3/d0;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lokhttp3/j;", "connection", "k", "l", "u", "Lokhttp3/e0;", "request", "t", "r", "", "byteCount", "q", "s", "z", "Lokhttp3/g0;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public abstract class s
{
    @d
    @e
    public static final s a;
    public static final b b;
    
    static {
        b = new b(null);
        a = new s() {};
    }
    
    public void A(@e final okhttp3.e e, @e final g0 g0) {
        k0.p((Object)e, "call");
        k0.p((Object)g0, "response");
    }
    
    public void B(@e final okhttp3.e e, @f final u u) {
        k0.p((Object)e, "call");
    }
    
    public void C(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void a(@e final okhttp3.e e, @e final g0 g0) {
        k0.p((Object)e, "call");
        k0.p((Object)g0, "cachedResponse");
    }
    
    public void b(@e final okhttp3.e e, @e final g0 g0) {
        k0.p((Object)e, "call");
        k0.p((Object)g0, "response");
    }
    
    public void c(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void d(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void e(@e final okhttp3.e e, @e final IOException ex) {
        k0.p((Object)e, "call");
        k0.p((Object)ex, "ioe");
    }
    
    public void f(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void g(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void h(@e final okhttp3.e e, @e final InetSocketAddress inetSocketAddress, @e final Proxy proxy, @f final d0 d0) {
        k0.p((Object)e, "call");
        k0.p((Object)inetSocketAddress, "inetSocketAddress");
        k0.p((Object)proxy, "proxy");
    }
    
    public void i(@e final okhttp3.e e, @e final InetSocketAddress inetSocketAddress, @e final Proxy proxy, @f final d0 d0, @e final IOException ex) {
        k0.p((Object)e, "call");
        k0.p((Object)inetSocketAddress, "inetSocketAddress");
        k0.p((Object)proxy, "proxy");
        k0.p((Object)ex, "ioe");
    }
    
    public void j(@e final okhttp3.e e, @e final InetSocketAddress inetSocketAddress, @e final Proxy proxy) {
        k0.p((Object)e, "call");
        k0.p((Object)inetSocketAddress, "inetSocketAddress");
        k0.p((Object)proxy, "proxy");
    }
    
    public void k(@e final okhttp3.e e, @e final j j) {
        k0.p((Object)e, "call");
        k0.p((Object)j, "connection");
    }
    
    public void l(@e final okhttp3.e e, @e final j j) {
        k0.p((Object)e, "call");
        k0.p((Object)j, "connection");
    }
    
    public void m(@e final okhttp3.e e, @e final String s, @e final List<InetAddress> list) {
        k0.p((Object)e, "call");
        k0.p((Object)s, "domainName");
        k0.p((Object)list, "inetAddressList");
    }
    
    public void n(@e final okhttp3.e e, @e final String s) {
        k0.p((Object)e, "call");
        k0.p((Object)s, "domainName");
    }
    
    public void o(@e final okhttp3.e e, @e final okhttp3.w w, @e final List<Proxy> list) {
        k0.p((Object)e, "call");
        k0.p((Object)w, "url");
        k0.p((Object)list, "proxies");
    }
    
    public void p(@e final okhttp3.e e, @e final okhttp3.w w) {
        k0.p((Object)e, "call");
        k0.p((Object)w, "url");
    }
    
    public void q(@e final okhttp3.e e, final long n) {
        k0.p((Object)e, "call");
    }
    
    public void r(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void s(@e final okhttp3.e e, @e final IOException ex) {
        k0.p((Object)e, "call");
        k0.p((Object)ex, "ioe");
    }
    
    public void t(@e final okhttp3.e e, @e final e0 e2) {
        k0.p((Object)e, "call");
        k0.p((Object)e2, "request");
    }
    
    public void u(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void v(@e final okhttp3.e e, final long n) {
        k0.p((Object)e, "call");
    }
    
    public void w(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    public void x(@e final okhttp3.e e, @e final IOException ex) {
        k0.p((Object)e, "call");
        k0.p((Object)ex, "ioe");
    }
    
    public void y(@e final okhttp3.e e, @e final g0 g0) {
        k0.p((Object)e, "call");
        k0.p((Object)g0, "response");
    }
    
    public void z(@e final okhttp3.e e) {
        k0.p((Object)e, "call");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "okhttp3/s$b", "", "Lokhttp3/s;", "NONE", "Lokhttp3/s;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006" }, d2 = { "okhttp3/s$c", "", "Lokhttp3/e;", "call", "Lokhttp3/s;", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public interface c
    {
        @e
        s a(@e final okhttp3.e p0);
    }
}
