// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.authenticator;

import java.net.PasswordAuthentication;
import java.util.Iterator;
import okhttp3.p;
import java.net.Authenticator;
import kotlin.text.s;
import okhttp3.h;
import okhttp3.e0;
import okhttp3.g0;
import org.jetbrains.annotations.f;
import okhttp3.i0;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.InetSocketAddress;
import java.util.Objects;
import java.util.List;
import kotlin.collections.v;
import java.net.InetAddress;
import java.net.Proxy;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import okhttp3.r;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0014" }, d2 = { "Lokhttp3/internal/authenticator/b;", "Lokhttp3/b;", "Ljava/net/Proxy;", "Lokhttp3/w;", "url", "Lokhttp3/r;", "dns", "Ljava/net/InetAddress;", "b", "Lokhttp3/i0;", "route", "Lokhttp3/g0;", "response", "Lokhttp3/e0;", "a", "d", "Lokhttp3/r;", "defaultDns", "<init>", "(Lokhttp3/r;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class b implements okhttp3.b
{
    private final r d;
    
    public b() {
        this(null, 1, null);
    }
    
    public b(@e final r d) {
        k0.p((Object)d, "defaultDns");
        this.d = d;
    }
    
    private final InetAddress b(final Proxy proxy, final okhttp3.w w, final r r) throws IOException {
        final Proxy.Type type = proxy.type();
        if (type != null) {
            if (okhttp3.internal.authenticator.a.a[type.ordinal()] == 1) {
                return (InetAddress)v.o2((List)r.a(w.F()));
            }
        }
        final SocketAddress address2 = proxy.address();
        Objects.requireNonNull(address2, "null cannot be cast to non-null type java.net.InetSocketAddress");
        final InetAddress address = ((InetSocketAddress)address2).getAddress();
        k0.o((Object)address, "(address() as InetSocketAddress).address");
        return address;
    }
    
    @f
    @Override
    public e0 a(@f final i0 i0, @e final g0 g0) throws IOException {
        k0.p((Object)g0, "response");
        final List<h> w = g0.w();
        final e0 w2 = g0.W();
        final okhttp3.w q = w2.q();
        final boolean b = g0.x() == 407;
        Proxy proxy = null;
        Label_0063: {
            if (i0 != null) {
                proxy = i0.e();
                if (proxy != null) {
                    break Label_0063;
                }
            }
            proxy = Proxy.NO_PROXY;
        }
        for (final h h : w) {
            if (!s.K1("Basic", h.h(), true)) {
                continue;
            }
            r r = null;
            Label_0140: {
                if (i0 != null) {
                    final okhttp3.a d = i0.d();
                    if (d != null) {
                        r = d.n();
                        if (r != null) {
                            break Label_0140;
                        }
                    }
                }
                r = this.d;
            }
            PasswordAuthentication passwordAuthentication;
            if (b) {
                final SocketAddress address = proxy.address();
                Objects.requireNonNull(address, "null cannot be cast to non-null type java.net.InetSocketAddress");
                final InetSocketAddress inetSocketAddress = (InetSocketAddress)address;
                final String hostName = inetSocketAddress.getHostName();
                k0.o((Object)proxy, "proxy");
                passwordAuthentication = Authenticator.requestPasswordAuthentication(hostName, this.b(proxy, q, r), inetSocketAddress.getPort(), q.X(), h.g(), h.h(), q.a0(), Authenticator.RequestorType.PROXY);
            }
            else {
                final String f = q.F();
                k0.o((Object)proxy, "proxy");
                passwordAuthentication = Authenticator.requestPasswordAuthentication(f, this.b(proxy, q, r), q.N(), q.X(), h.g(), h.h(), q.a0(), Authenticator.RequestorType.SERVER);
            }
            if (passwordAuthentication != null) {
                String s;
                if (b) {
                    s = "Proxy-Authorization";
                }
                else {
                    s = "Authorization";
                }
                final String userName = passwordAuthentication.getUserName();
                k0.o((Object)userName, "auth.userName");
                final char[] password = passwordAuthentication.getPassword();
                k0.o((Object)password, "auth.password");
                return w2.n().n(s, p.b(userName, new String(password), h.f())).b();
            }
        }
        return null;
    }
}
