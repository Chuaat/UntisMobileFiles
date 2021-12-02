// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.logging;

import m6.h;
import okhttp3.e0;
import java.net.InetAddress;
import java.util.List;
import okhttp3.j;
import okhttp3.d0;
import java.net.Proxy;
import java.net.InetSocketAddress;
import java.io.IOException;
import org.jetbrains.annotations.f;
import okhttp3.u;
import kotlin.jvm.internal.k0;
import okhttp3.g0;
import okhttp3.e;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import okhttp3.s;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001>B\u0011\b\u0002\u0012\u0006\u0010C\u001a\u00020A¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J&\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\fH\u0016J \u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\rH\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016J2\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010!\u001a\u00020 H\u0016J\u0018\u0010%\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0018\u0010&\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#H\u0016J\u0010\u0010'\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0016J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010.\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u0010/\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00103\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016J\u0018\u00106\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00107\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u00108\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010!\u001a\u00020 H\u0016J\u0010\u00109\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010:\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0018\u0010;\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u000201H\u0016J\u0010\u0010<\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010>\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u000201H\u0016R\u0016\u0010@\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010?R\u0016\u0010C\u001a\u00020A8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010B¨\u0006F" }, d2 = { "Lokhttp3/logging/b;", "Lokhttp3/s;", "", "message", "Lkotlin/j2;", "D", "Lokhttp3/e;", "call", "f", "Lokhttp3/w;", "url", "p", "", "Ljava/net/Proxy;", "proxies", "o", "domainName", "n", "Ljava/net/InetAddress;", "inetAddressList", "m", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "j", "C", "Lokhttp3/u;", "handshake", "B", "Lokhttp3/d0;", "protocol", "h", "Ljava/io/IOException;", "ioe", "i", "Lokhttp3/j;", "connection", "k", "l", "u", "Lokhttp3/e0;", "request", "t", "r", "", "byteCount", "q", "s", "z", "Lokhttp3/g0;", "response", "y", "w", "v", "x", "d", "e", "g", "A", "b", "c", "cachedResponse", "a", "J", "startNs", "Lokhttp3/logging/a$b;", "Lokhttp3/logging/a$b;", "logger", "<init>", "(Lokhttp3/logging/a$b;)V", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
public final class b extends s
{
    private long c;
    private final okhttp3.logging.a.b d;
    
    private b(final okhttp3.logging.a.b d) {
        this.d = d;
    }
    
    private final void D(final String str) {
        final long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.c);
        final okhttp3.logging.a.b d = this.d;
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(millis);
        sb.append(" ms] ");
        sb.append(str);
        d.a(sb.toString());
    }
    
    @Override
    public void A(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g0 obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "response");
        final StringBuilder sb = new StringBuilder();
        sb.append("satisfactionFailure: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void B(@org.jetbrains.annotations.e final e e, @f final u obj) {
        k0.p((Object)e, "call");
        final StringBuilder sb = new StringBuilder();
        sb.append("secureConnectEnd: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void C(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("secureConnectStart");
    }
    
    @Override
    public void a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g0 obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "cachedResponse");
        final StringBuilder sb = new StringBuilder();
        sb.append("cacheConditionalHit: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g0 obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "response");
        final StringBuilder sb = new StringBuilder();
        sb.append("cacheHit: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void c(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("cacheMiss");
    }
    
    @Override
    public void d(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("callEnd");
    }
    
    @Override
    public void e(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final IOException obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "ioe");
        final StringBuilder sb = new StringBuilder();
        sb.append("callFailed: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void f(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.c = System.nanoTime();
        final StringBuilder sb = new StringBuilder();
        sb.append("callStart: ");
        sb.append(e.k());
        this.D(sb.toString());
    }
    
    @Override
    public void g(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("canceled");
    }
    
    @Override
    public void h(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final InetSocketAddress inetSocketAddress, @org.jetbrains.annotations.e final Proxy proxy, @f final d0 obj) {
        k0.p((Object)e, "call");
        k0.p((Object)inetSocketAddress, "inetSocketAddress");
        k0.p((Object)proxy, "proxy");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectEnd: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void i(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final InetSocketAddress inetSocketAddress, @org.jetbrains.annotations.e final Proxy proxy, @f final d0 obj, @org.jetbrains.annotations.e final IOException obj2) {
        k0.p((Object)e, "call");
        k0.p((Object)inetSocketAddress, "inetSocketAddress");
        k0.p((Object)proxy, "proxy");
        k0.p((Object)obj2, "ioe");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectFailed: ");
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        this.D(sb.toString());
    }
    
    @Override
    public void j(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final InetSocketAddress obj, @org.jetbrains.annotations.e final Proxy obj2) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "inetSocketAddress");
        k0.p((Object)obj2, "proxy");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectStart: ");
        sb.append(obj);
        sb.append(' ');
        sb.append(obj2);
        this.D(sb.toString());
    }
    
    @Override
    public void k(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final j obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "connection");
        final StringBuilder sb = new StringBuilder();
        sb.append("connectionAcquired: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void l(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final j j) {
        k0.p((Object)e, "call");
        k0.p((Object)j, "connection");
        this.D("connectionReleased");
    }
    
    @Override
    public void m(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final String s, @org.jetbrains.annotations.e final List<? extends InetAddress> obj) {
        k0.p((Object)e, "call");
        k0.p((Object)s, "domainName");
        k0.p((Object)obj, "inetAddressList");
        final StringBuilder sb = new StringBuilder();
        sb.append("dnsEnd: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void n(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final String str) {
        k0.p((Object)e, "call");
        k0.p((Object)str, "domainName");
        final StringBuilder sb = new StringBuilder();
        sb.append("dnsStart: ");
        sb.append(str);
        this.D(sb.toString());
    }
    
    @Override
    public void o(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final okhttp3.w w, @org.jetbrains.annotations.e final List<? extends Proxy> obj) {
        k0.p((Object)e, "call");
        k0.p((Object)w, "url");
        k0.p((Object)obj, "proxies");
        final StringBuilder sb = new StringBuilder();
        sb.append("proxySelectEnd: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void p(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final okhttp3.w obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "url");
        final StringBuilder sb = new StringBuilder();
        sb.append("proxySelectStart: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void q(@org.jetbrains.annotations.e final e e, final long lng) {
        k0.p((Object)e, "call");
        final StringBuilder sb = new StringBuilder();
        sb.append("requestBodyEnd: byteCount=");
        sb.append(lng);
        this.D(sb.toString());
    }
    
    @Override
    public void r(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("requestBodyStart");
    }
    
    @Override
    public void s(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final IOException obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "ioe");
        final StringBuilder sb = new StringBuilder();
        sb.append("requestFailed: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void t(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final e0 e2) {
        k0.p((Object)e, "call");
        k0.p((Object)e2, "request");
        this.D("requestHeadersEnd");
    }
    
    @Override
    public void u(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("requestHeadersStart");
    }
    
    @Override
    public void v(@org.jetbrains.annotations.e final e e, final long lng) {
        k0.p((Object)e, "call");
        final StringBuilder sb = new StringBuilder();
        sb.append("responseBodyEnd: byteCount=");
        sb.append(lng);
        this.D(sb.toString());
    }
    
    @Override
    public void w(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("responseBodyStart");
    }
    
    @Override
    public void x(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final IOException obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "ioe");
        final StringBuilder sb = new StringBuilder();
        sb.append("responseFailed: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void y(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final g0 obj) {
        k0.p((Object)e, "call");
        k0.p((Object)obj, "response");
        final StringBuilder sb = new StringBuilder();
        sb.append("responseHeadersEnd: ");
        sb.append(obj);
        this.D(sb.toString());
    }
    
    @Override
    public void z(@org.jetbrains.annotations.e final e e) {
        k0.p((Object)e, "call");
        this.D("responseHeadersStart");
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b" }, d2 = { "okhttp3/logging/b$a", "Lokhttp3/s$c;", "Lokhttp3/e;", "call", "Lokhttp3/s;", "a", "Lokhttp3/logging/a$b;", "Lokhttp3/logging/a$b;", "logger", "<init>", "(Lokhttp3/logging/a$b;)V", "okhttp-logging-interceptor" }, k = 1, mv = { 1, 4, 0 })
    public static class a implements c
    {
        private final okhttp3.logging.a.b a;
        
        @h
        public a() {
            this(null, 1, null);
        }
        
        @h
        public a(@org.jetbrains.annotations.e final okhttp3.logging.a.b a) {
            k0.p((Object)a, "logger");
            this.a = a;
        }
        
        @org.jetbrains.annotations.e
        @Override
        public s a(@org.jetbrains.annotations.e final e e) {
            k0.p((Object)e, "call");
            return new b(this.a, null);
        }
    }
}
