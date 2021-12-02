// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Objects;
import kotlin.text.s;
import kotlin.jvm.internal.k0;
import m6.g;
import kotlin.z0;
import kotlin.i;
import m6.k;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b \u0018\u0000 \u001a2\u00020\u0001:\u0002\u000f\u0007Bs\b\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0019\u0010\u0014\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0016\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u0019\u0010\u0018\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0017\u0010\u0004R\u0019\u0010\u001b\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0019\u001a\u0004\b\u001a\u0010\bR\u0019\u0010\u001d\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u001c\u0010\u0004R\u0019\u0010\u001f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010!\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0019\u001a\u0004\b \u0010\bR\u0019\u0010#\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\"\u0010\u0004R\u0019\u0010%\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b$\u0010\u0004R\u0019\u0010'\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010\u0012\u001a\u0004\b&\u0010\u0004R\u0019\u0010)\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b(\u0010\bR\u0018\u0010+\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010*R\u0019\u0010-\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0019\u001a\u0004\b,\u0010\b¨\u00060" }, d2 = { "Lokhttp3/d;", "", "", "f", "()Z", "g", "", "b", "()I", "j", "e", "c", "d", "i", "h", "a", "", "toString", "Z", "u", "onlyIfCached", "r", "noCache", "s", "noStore", "I", "p", "minFreshSeconds", "q", "mustRevalidate", "l", "isPrivate", "n", "maxAgeSeconds", "m", "isPublic", "k", "immutable", "t", "noTransform", "o", "maxStaleSeconds", "Ljava/lang/String;", "headerValue", "w", "sMaxAgeSeconds", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class d
{
    @m6.d
    @e
    public static final d n;
    @m6.d
    @e
    public static final d o;
    public static final b p;
    private final boolean a;
    private final boolean b;
    private final int c;
    private final int d;
    private final boolean e;
    private final boolean f;
    private final boolean g;
    private final int h;
    private final int i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private String m;
    
    static {
        p = new b(null);
        n = new a().g().a();
        o = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();
    }
    
    private d(final boolean a, final boolean b, final int c, final int d, final boolean e, final boolean f, final boolean g, final int h, final int i, final boolean j, final boolean k, final boolean l, final String m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    @k
    @e
    public static final d v(@e final v v) {
        return d.p.c(v);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "immutable", imports = {}))
    @g(name = "-deprecated_immutable")
    public final boolean a() {
        return this.l;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "maxAgeSeconds", imports = {}))
    @g(name = "-deprecated_maxAgeSeconds")
    public final int b() {
        return this.c;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "maxStaleSeconds", imports = {}))
    @g(name = "-deprecated_maxStaleSeconds")
    public final int c() {
        return this.h;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "minFreshSeconds", imports = {}))
    @g(name = "-deprecated_minFreshSeconds")
    public final int d() {
        return this.i;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "mustRevalidate", imports = {}))
    @g(name = "-deprecated_mustRevalidate")
    public final boolean e() {
        return this.g;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "noCache", imports = {}))
    @g(name = "-deprecated_noCache")
    public final boolean f() {
        return this.a;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "noStore", imports = {}))
    @g(name = "-deprecated_noStore")
    public final boolean g() {
        return this.b;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "noTransform", imports = {}))
    @g(name = "-deprecated_noTransform")
    public final boolean h() {
        return this.k;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "onlyIfCached", imports = {}))
    @g(name = "-deprecated_onlyIfCached")
    public final boolean i() {
        return this.j;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "sMaxAgeSeconds", imports = {}))
    @g(name = "-deprecated_sMaxAgeSeconds")
    public final int j() {
        return this.d;
    }
    
    @g(name = "immutable")
    public final boolean k() {
        return this.l;
    }
    
    public final boolean l() {
        return this.e;
    }
    
    public final boolean m() {
        return this.f;
    }
    
    @g(name = "maxAgeSeconds")
    public final int n() {
        return this.c;
    }
    
    @g(name = "maxStaleSeconds")
    public final int o() {
        return this.h;
    }
    
    @g(name = "minFreshSeconds")
    public final int p() {
        return this.i;
    }
    
    @g(name = "mustRevalidate")
    public final boolean q() {
        return this.g;
    }
    
    @g(name = "noCache")
    public final boolean r() {
        return this.a;
    }
    
    @g(name = "noStore")
    public final boolean s() {
        return this.b;
    }
    
    @g(name = "noTransform")
    public final boolean t() {
        return this.k;
    }
    
    @e
    @Override
    public String toString() {
        String m;
        if ((m = this.m) == null) {
            final StringBuilder sb = new StringBuilder();
            if (this.a) {
                sb.append("no-cache, ");
            }
            if (this.b) {
                sb.append("no-store, ");
            }
            if (this.c != -1) {
                sb.append("max-age=");
                sb.append(this.c);
                sb.append(", ");
            }
            if (this.d != -1) {
                sb.append("s-maxage=");
                sb.append(this.d);
                sb.append(", ");
            }
            if (this.e) {
                sb.append("private, ");
            }
            if (this.f) {
                sb.append("public, ");
            }
            if (this.g) {
                sb.append("must-revalidate, ");
            }
            if (this.h != -1) {
                sb.append("max-stale=");
                sb.append(this.h);
                sb.append(", ");
            }
            if (this.i != -1) {
                sb.append("min-fresh=");
                sb.append(this.i);
                sb.append(", ");
            }
            if (this.j) {
                sb.append("only-if-cached, ");
            }
            if (this.k) {
                sb.append("no-transform, ");
            }
            if (this.l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            m = sb.toString();
            k0.o((Object)m, "StringBuilder().apply(builderAction).toString()");
            this.m = m;
        }
        return m;
    }
    
    @g(name = "onlyIfCached")
    public final boolean u() {
        return this.j;
    }
    
    @g(name = "sMaxAgeSeconds")
    public final int w() {
        return this.d;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0005J\u0006\u0010\u0011\u001a\u00020\u0005J\u0006\u0010\u0012\u001a\u00020\u0005J\u0006\u0010\u0014\u001a\u00020\u0013R\u0016\u0010\u0017\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0016\u0010\u001d\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0016R\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001a¨\u0006\"" }, d2 = { "okhttp3/d$a", "", "", "", "b", "Lokhttp3/d$a;", "g", "h", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "d", "maxStale", "e", "minFresh", "f", "j", "i", "c", "Lokhttp3/d;", "a", "", "Z", "onlyIfCached", "noCache", "immutable", "I", "maxAgeSeconds", "noTransform", "noStore", "minFreshSeconds", "maxStaleSeconds", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private boolean a;
        private boolean b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        
        public a() {
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }
        
        private final int b(final long n) {
            int n2 = Integer.MAX_VALUE;
            if (n <= Integer.MAX_VALUE) {
                n2 = (int)n;
            }
            return n2;
        }
        
        @e
        public final d a() {
            return new d(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.g, this.h, null, null);
        }
        
        @e
        public final a c() {
            this.h = true;
            return this;
        }
        
        @e
        public final a d(final int i, @e final TimeUnit timeUnit) {
            k0.p((Object)timeUnit, "timeUnit");
            if (i >= 0) {
                this.c = this.b(timeUnit.toSeconds(i));
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("maxAge < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final a e(final int i, @e final TimeUnit timeUnit) {
            k0.p((Object)timeUnit, "timeUnit");
            if (i >= 0) {
                this.d = this.b(timeUnit.toSeconds(i));
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("maxStale < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final a f(final int i, @e final TimeUnit timeUnit) {
            k0.p((Object)timeUnit, "timeUnit");
            if (i >= 0) {
                this.e = this.b(timeUnit.toSeconds(i));
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("minFresh < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final a g() {
            this.a = true;
            return this;
        }
        
        @e
        public final a h() {
            this.b = true;
            return this;
        }
        
        @e
        public final a i() {
            this.g = true;
            return this;
        }
        
        @e
        public final a j() {
            this.f = true;
            return this;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0016\u0010\u000b\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010" }, d2 = { "okhttp3/d$b", "", "", "characters", "", "startIndex", "a", "Lokhttp3/v;", "headers", "Lokhttp3/d;", "c", "FORCE_CACHE", "Lokhttp3/d;", "FORCE_NETWORK", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        private final int a(final String s, final String s2, int i) {
            while (i < s.length()) {
                if (s.U2(s2, s.charAt(i), false, 2, null)) {
                    return i;
                }
                ++i;
            }
            return s.length();
        }
        
        @k
        @e
        public final d c(@e final v v) {
            k0.p((Object)v, "headers");
            int size = v.size();
            boolean b = true;
            int i = 0;
            boolean b2 = true;
            String s = null;
            boolean b3 = false;
            boolean b4 = false;
            int n = -1;
            int n2 = -1;
            boolean b5 = false;
            boolean b6 = false;
            boolean b7 = false;
            int n3 = -1;
            int n4 = -1;
            boolean b8 = false;
            boolean b9 = false;
            boolean b10 = false;
            while (i < size) {
                final String n5 = v.n(i);
                final String v2 = v.v(i);
                Label_1155: {
                    Label_0125: {
                        if (kotlin.text.s.K1(n5, "Cache-Control", b)) {
                            if (s == null) {
                                s = v2;
                                break Label_0125;
                            }
                        }
                        else if (!kotlin.text.s.K1(n5, "Pragma", b)) {
                            break Label_1155;
                        }
                        b2 = false;
                    }
                    int j = 0;
                    final int n6 = size;
                    while (j < v2.length()) {
                        int endIndex = this.a(v2, "=,;", j);
                        final String substring = v2.substring(j, endIndex);
                        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                        final String string = kotlin.text.s.B5(substring).toString();
                        String s2;
                        if (endIndex != v2.length() && v2.charAt(endIndex) != ',' && v2.charAt(endIndex) != ';') {
                            int g = okhttp3.internal.d.G(v2, endIndex + 1);
                            if (g < v2.length() && v2.charAt(g) == '\"') {
                                ++g;
                                endIndex = kotlin.text.s.q3(v2, '\"', g, false, 4, null);
                                s2 = v2.substring(g, endIndex);
                                k0.o((Object)s2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                ++endIndex;
                            }
                            else {
                                endIndex = this.a(v2, ",;", g);
                                final String substring2 = v2.substring(g, endIndex);
                                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                Objects.requireNonNull(substring2, "null cannot be cast to non-null type kotlin.CharSequence");
                                s2 = kotlin.text.s.B5(substring2).toString();
                            }
                        }
                        else {
                            ++endIndex;
                            s2 = null;
                        }
                        b = true;
                        boolean b11;
                        boolean b12;
                        int f0;
                        int f2;
                        boolean b13;
                        boolean b14;
                        boolean b15;
                        int f3;
                        int f4;
                        boolean b16;
                        boolean b17;
                        if (kotlin.text.s.K1("no-cache", string, true)) {
                            b11 = true;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("no-store", string, true)) {
                            b12 = true;
                            b11 = b3;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("max-age", string, true)) {
                            f0 = okhttp3.internal.d.f0(s2, -1);
                            b11 = b3;
                            b12 = b4;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("s-maxage", string, true)) {
                            f2 = okhttp3.internal.d.f0(s2, -1);
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("private", string, true)) {
                            b13 = true;
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("public", string, true)) {
                            b14 = true;
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("must-revalidate", string, true)) {
                            b15 = true;
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("max-stale", string, true)) {
                            f3 = okhttp3.internal.d.f0(s2, Integer.MAX_VALUE);
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("min-fresh", string, true)) {
                            f4 = okhttp3.internal.d.f0(s2, -1);
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            b16 = b8;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("only-if-cached", string, true)) {
                            b16 = true;
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b17 = b9;
                        }
                        else if (kotlin.text.s.K1("no-transform", string, true)) {
                            b17 = true;
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                        }
                        else {
                            b11 = b3;
                            b12 = b4;
                            f0 = n;
                            f2 = n2;
                            b13 = b5;
                            b14 = b6;
                            b15 = b7;
                            f3 = n3;
                            f4 = n4;
                            b16 = b8;
                            b17 = b9;
                            if (kotlin.text.s.K1("immutable", string, true)) {
                                b10 = true;
                                b17 = b9;
                                b16 = b8;
                                f4 = n4;
                                f3 = n3;
                                b15 = b7;
                                b14 = b6;
                                b13 = b5;
                                f2 = n2;
                                f0 = n;
                                b12 = b4;
                                b11 = b3;
                            }
                        }
                        j = endIndex;
                        b3 = b11;
                        b4 = b12;
                        n = f0;
                        n2 = f2;
                        b5 = b13;
                        b6 = b14;
                        b7 = b15;
                        n3 = f3;
                        n4 = f4;
                        b8 = b16;
                        b9 = b17;
                    }
                    size = n6;
                }
                ++i;
            }
            String s3;
            if (!b2) {
                s3 = null;
            }
            else {
                s3 = s;
            }
            return new d(b3, b4, n, n2, b5, b6, b7, n3, n4, b8, b9, b10, s3, null);
        }
    }
}
