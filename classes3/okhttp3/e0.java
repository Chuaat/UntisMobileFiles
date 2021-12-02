// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import m6.h;
import java.net.URL;
import kotlin.text.s;
import kotlin.collections.y0;
import java.util.LinkedHashMap;
import java.util.Iterator;
import kotlin.s0;
import java.util.List;
import m6.g;
import kotlin.z0;
import kotlin.k;
import kotlin.i;
import kotlin.jvm.internal.k0;
import java.util.Map;
import org.jetbrains.annotations.f;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010$\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u0018BC\b\u0000\u0012\u0006\u0010 \u001a\u00020\u000f\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0014\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0017\u0012\u0016\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010.¢\u0006\u0004\b7\u00108J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0019\u0010 \u001a\u00020\u000f8\u0007@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0013\u0010$\u001a\u00020!8F@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001b\u0010'\u001a\u0004\u0018\u00010\u00178\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\u0019R\u0019\u0010*\u001a\u00020\u00148\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\u0016R\u0019\u0010-\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010\u0013R,\u00102\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010.8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u00101R\u0013\u00104\u001a\u00020\u001a8G@\u0006¢\u0006\u0006\u001a\u0004\b3\u0010\u001cR\u0018\u00106\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105¨\u00069" }, d2 = { "Lokhttp3/e0;", "", "", "name", "i", "", "j", "o", "T", "Ljava/lang/Class;", "type", "p", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/e0$a;", "n", "Lokhttp3/w;", "e", "()Lokhttp3/w;", "d", "()Ljava/lang/String;", "Lokhttp3/v;", "c", "()Lokhttp3/v;", "Lokhttp3/f0;", "a", "()Lokhttp3/f0;", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "toString", "Lokhttp3/w;", "q", "url", "", "l", "()Z", "isHttps", "Lokhttp3/f0;", "f", "body", "Lokhttp3/v;", "k", "headers", "Ljava/lang/String;", "m", "method", "", "Ljava/util/Map;", "h", "()Ljava/util/Map;", "tags", "g", "cacheControl", "Lokhttp3/d;", "lazyCacheControl", "<init>", "(Lokhttp3/w;Ljava/lang/String;Lokhttp3/v;Lokhttp3/f0;Ljava/util/Map;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class e0
{
    private d a;
    @e
    private final w b;
    @e
    private final String c;
    @e
    private final v d;
    @f
    private final f0 e;
    @e
    private final Map<Class<?>, Object> f;
    
    public e0(@e final w b, @e final String c, @e final v d, @f final f0 e, @e final Map<Class<?>, ?> f) {
        k0.p((Object)b, "url");
        k0.p((Object)c, "method");
        k0.p((Object)d, "headers");
        k0.p((Object)f, "tags");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Map<Class<?>, Object>)f;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "body", imports = {}))
    @g(name = "-deprecated_body")
    @f
    public final f0 a() {
        return this.e;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "cacheControl", imports = {}))
    @g(name = "-deprecated_cacheControl")
    @e
    public final d b() {
        return this.g();
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "headers", imports = {}))
    @g(name = "-deprecated_headers")
    @e
    public final v c() {
        return this.d;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "method", imports = {}))
    @g(name = "-deprecated_method")
    @e
    public final String d() {
        return this.c;
    }
    
    @i(level = k.H, message = "moved to val", replaceWith = @z0(expression = "url", imports = {}))
    @g(name = "-deprecated_url")
    @e
    public final w e() {
        return this.b;
    }
    
    @g(name = "body")
    @f
    public final f0 f() {
        return this.e;
    }
    
    @g(name = "cacheControl")
    @e
    public final d g() {
        d a;
        if ((a = this.a) == null) {
            a = okhttp3.d.p.c(this.d);
            this.a = a;
        }
        return a;
    }
    
    @e
    public final Map<Class<?>, Object> h() {
        return this.f;
    }
    
    @f
    public final String i(@e final String s) {
        k0.p((Object)s, "name");
        return this.d.h(s);
    }
    
    @e
    public final List<String> j(@e final String s) {
        k0.p((Object)s, "name");
        return this.d.w(s);
    }
    
    @g(name = "headers")
    @e
    public final v k() {
        return this.d;
    }
    
    public final boolean l() {
        return this.b.G();
    }
    
    @g(name = "method")
    @e
    public final String m() {
        return this.c;
    }
    
    @e
    public final a n() {
        return new a(this);
    }
    
    @f
    public final Object o() {
        return this.p((Class<?>)Object.class);
    }
    
    @f
    public final <T> T p(@e final Class<? extends T> clazz) {
        k0.p((Object)clazz, "type");
        return (T)clazz.cast(this.f.get(clazz));
    }
    
    @g(name = "url")
    @e
    public final w q() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.c);
        sb.append(", url=");
        sb.append(this.b);
        if (this.d.size() != 0) {
            sb.append(", headers=[");
            final v d = this.d;
            int n = 0;
            for (final s0 next : d) {
                if (n < 0) {
                    kotlin.collections.v.W();
                }
                final s0 s0 = next;
                final String str = (String)s0.a();
                final String str2 = (String)s0.b();
                if (n > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                ++n;
            }
            sb.append(']');
        }
        if (this.f.isEmpty() ^ true) {
            sb.append(", tags=");
            sb.append(this.f);
        }
        sb.append('}');
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bE\u0010FB\u0011\b\u0010\u0012\u0006\u0010G\u001a\u00020&¢\u0006\u0004\bE\u0010HJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0004H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0014\u0010\u001a\u001a\u00020\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0017J\u0010\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010$\u001a\u00020\u0004\"\u0004\b\u0000\u0010!2\u000e\u0010#\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000\"2\b\u0010\u001f\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b$\u0010%J\b\u0010'\u001a\u00020&H\u0016R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R2\u00109\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"\u0012\u0004\u0012\u00020\u0001038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010\u0010\u001a\u00020?8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006I" }, d2 = { "okhttp3/e0$a", "", "Lokhttp3/w;", "url", "Lokhttp3/e0$a;", "D", "", "B", "Ljava/net/URL;", "C", "name", "value", "n", "a", "t", "Lokhttp3/v;", "headers", "o", "Lokhttp3/d;", "cacheControl", "c", "g", "m", "Lokhttp3/f0;", "body", "r", "e", "s", "q", "method", "p", "tag", "A", "T", "Ljava/lang/Class;", "type", "z", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/e0$a;", "Lokhttp3/e0;", "b", "d", "Lokhttp3/f0;", "h", "()Lokhttp3/f0;", "u", "(Lokhttp3/f0;)V", "Lokhttp3/w;", "l", "()Lokhttp3/w;", "y", "(Lokhttp3/w;)V", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "x", "(Ljava/util/Map;)V", "tags", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "w", "(Ljava/lang/String;)V", "Lokhttp3/v$a;", "Lokhttp3/v$a;", "i", "()Lokhttp3/v$a;", "v", "(Lokhttp3/v$a;)V", "<init>", "()V", "request", "(Lokhttp3/e0;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static class a
    {
        @f
        private w a;
        @e
        private String b;
        @e
        private v.a c;
        @f
        private f0 d;
        @e
        private Map<Class<?>, Object> e;
        
        public a() {
            this.e = new LinkedHashMap<Class<?>, Object>();
            this.b = "GET";
            this.c = new v.a();
        }
        
        public a(@e final e0 e0) {
            k0.p((Object)e0, "request");
            this.e = new LinkedHashMap<Class<?>, Object>();
            this.a = e0.q();
            this.b = e0.m();
            this.d = e0.f();
            Map<Class<?>, Object> j0;
            if (e0.h().isEmpty()) {
                j0 = new LinkedHashMap<Class<?>, Object>();
            }
            else {
                j0 = (Map<Class<?>, Object>)y0.J0((Map)e0.h());
            }
            this.e = j0;
            this.c = e0.k().p();
        }
        
        public static /* synthetic */ a f(final a a, f0 d, final int n, final Object o) {
            if (o == null) {
                if ((n & 0x1) != 0x0) {
                    d = okhttp3.internal.d.d;
                }
                return a.e(d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }
        
        @e
        public a A(@f final Object o) {
            return this.z(Object.class, o);
        }
        
        @e
        public a B(@e String substring) {
            k0.p((Object)substring, "url");
            StringBuilder sb;
            int beginIndex;
            if (s.s2(substring, "ws:", true)) {
                sb = new StringBuilder();
                sb.append("http:");
                beginIndex = 3;
            }
            else {
                final String string = substring;
                if (!s.s2(substring, "wss:", true)) {
                    return this.D(w.w.h(string));
                }
                sb = new StringBuilder();
                sb.append("https:");
                beginIndex = 4;
            }
            substring = substring.substring(beginIndex);
            k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
            sb.append(substring);
            final String string = sb.toString();
            return this.D(w.w.h(string));
        }
        
        @e
        public a C(@e final URL url) {
            k0.p((Object)url, "url");
            final w.b w = okhttp3.w.w;
            final String string = url.toString();
            k0.o((Object)string, "url.toString()");
            return this.D(w.h(string));
        }
        
        @e
        public a D(@e final w a) {
            k0.p((Object)a, "url");
            this.a = a;
            return this;
        }
        
        @e
        public a a(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.c.b(s, s2);
            return this;
        }
        
        @e
        public e0 b() {
            final w a = this.a;
            if (a != null) {
                return new e0(a, this.b, this.c.i(), this.d, okhttp3.internal.d.d0((Map<Class<?>, ?>)this.e));
            }
            throw new IllegalStateException("url == null".toString());
        }
        
        @e
        public a c(@e final d d) {
            k0.p((Object)d, "cacheControl");
            final String string = d.toString();
            a a;
            if (string.length() == 0) {
                a = this.t("Cache-Control");
            }
            else {
                a = this.n("Cache-Control", string);
            }
            return a;
        }
        
        @h
        @e
        public final a d() {
            return f(this, null, 1, null);
        }
        
        @h
        @e
        public a e(@f final f0 f0) {
            return this.p("DELETE", f0);
        }
        
        @e
        public a g() {
            return this.p("GET", null);
        }
        
        @f
        public final f0 h() {
            return this.d;
        }
        
        @e
        public final v.a i() {
            return this.c;
        }
        
        @e
        public final String j() {
            return this.b;
        }
        
        @e
        public final Map<Class<?>, Object> k() {
            return this.e;
        }
        
        @f
        public final w l() {
            return this.a;
        }
        
        @e
        public a m() {
            return this.p("HEAD", null);
        }
        
        @e
        public a n(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.c.m(s, s2);
            return this;
        }
        
        @e
        public a o(@e final v v) {
            k0.p((Object)v, "headers");
            this.c = v.p();
            return this;
        }
        
        @e
        public a p(@e final String b, @f final f0 d) {
            k0.p((Object)b, "method");
            if (b.length() > 0) {
                if (d == null) {
                    if (!(true ^ okhttp3.internal.http.f.e(b))) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("method ");
                        sb.append(b);
                        sb.append(" must have a request body.");
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                }
                else if (!okhttp3.internal.http.f.b(b)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("method ");
                    sb2.append(b);
                    sb2.append(" must not have a request body.");
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                this.b = b;
                this.d = d;
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }
        
        @e
        public a q(@e final f0 f0) {
            k0.p((Object)f0, "body");
            return this.p("PATCH", f0);
        }
        
        @e
        public a r(@e final f0 f0) {
            k0.p((Object)f0, "body");
            return this.p("POST", f0);
        }
        
        @e
        public a s(@e final f0 f0) {
            k0.p((Object)f0, "body");
            return this.p("PUT", f0);
        }
        
        @e
        public a t(@e final String s) {
            k0.p((Object)s, "name");
            this.c.l(s);
            return this;
        }
        
        public final void u(@f final f0 d) {
            this.d = d;
        }
        
        public final void v(@e final v.a c) {
            k0.p((Object)c, "<set-?>");
            this.c = c;
        }
        
        public final void w(@e final String b) {
            k0.p((Object)b, "<set-?>");
            this.b = b;
        }
        
        public final void x(@e final Map<Class<?>, Object> e) {
            k0.p((Object)e, "<set-?>");
            this.e = e;
        }
        
        public final void y(@f final w a) {
            this.a = a;
        }
        
        @e
        public <T> a z(@e final Class<? super T> clazz, @f final T obj) {
            k0.p((Object)clazz, "type");
            if (obj == null) {
                this.e.remove(clazz);
            }
            else {
                if (this.e.isEmpty()) {
                    this.e = new LinkedHashMap<Class<?>, Object>();
                }
                final Map<Class<?>, Object> e = this.e;
                final T cast = clazz.cast(obj);
                k0.m((Object)cast);
                e.put(clazz, cast);
            }
            return this;
        }
    }
}
