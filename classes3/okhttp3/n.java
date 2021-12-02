// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.Collections;
import java.util.ArrayList;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import kotlin.text.o;
import java.util.regex.Matcher;
import java.util.GregorianCalendar;
import java.util.Locale;
import okhttp3.internal.d;
import kotlin.text.s;
import java.util.Objects;
import okhttp3.internal.http.c;
import java.util.Date;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import a4.a;
import kotlin.jvm.internal.k0;
import m6.g;
import kotlin.z0;
import kotlin.i;
import java.util.List;
import org.jetbrains.annotations.f;
import m6.k;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\"\u0018\u0000 -2\u00020\u0001:\u0002\u0015\u0012BQ\b\u0002\u0012\u0006\u0010*\u001a\u00020\n\u0012\u0006\u0010\u001e\u001a\u00020\n\u0012\u0006\u0010&\u001a\u00020\u0011\u0012\u0006\u0010.\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010,\u001a\u00020\u0004\u0012\u0006\u00100\u001a\u00020\u0004\u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\f\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0015\u0010\rJ\u000f\u0010\u0016\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0016\u0010\rJ\u000f\u0010\u0017\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0017\u0010\u0010J\u000f\u0010\u0018\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0010J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001e\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010 \u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001f\u0010\rR\u0019\u0010#\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010\u0010R\u0019\u0010&\u001a\u00020\u00118\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b%\u0010\u0013R\u0019\u0010(\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0016\u0010!\u001a\u0004\b'\u0010\u0010R\u0019\u0010*\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001c\u001a\u0004\b)\u0010\rR\u0019\u0010,\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u000f\u0010!\u001a\u0004\b+\u0010\u0010R\u0019\u0010.\u001a\u00020\n8\u0007@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b-\u0010\rR\u0019\u00100\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0018\u0010!\u001a\u0004\b/\u0010\u0010¨\u00063" }, d2 = { "Lokhttp3/n;", "", "Lokhttp3/w;", "url", "", "r", "other", "equals", "", "hashCode", "", "toString", "e", "()Ljava/lang/String;", "i", "g", "()Z", "", "b", "()J", "c", "a", "f", "d", "h", "forObsoleteRfc2965", "y", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "z", "value", "v", "path", "Z", "p", "hostOnly", "J", "o", "expiresAt", "x", "secure", "s", "name", "q", "httpOnly", "n", "domain", "w", "persistent", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class n
{
    private static final Pattern j;
    private static final Pattern k;
    private static final Pattern l;
    private static final Pattern m;
    public static final b n;
    @e
    private final String a;
    @e
    private final String b;
    private final long c;
    @e
    private final String d;
    @e
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;
    
    static {
        n = new b(null);
        j = Pattern.compile("(\\d{2,4})[^\\d]*");
        k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
        l = Pattern.compile("(\\d{1,2})[^\\d]*");
        m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    }
    
    private n(final String a, final String b, final long c, final String d, final String e, final boolean f, final boolean g, final boolean h, final boolean i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static final /* synthetic */ Pattern j() {
        return okhttp3.n.l;
    }
    
    public static final /* synthetic */ Pattern k() {
        return okhttp3.n.k;
    }
    
    public static final /* synthetic */ Pattern l() {
        return okhttp3.n.m;
    }
    
    public static final /* synthetic */ Pattern m() {
        return okhttp3.n.j;
    }
    
    @k
    @f
    public static final n t(@e final okhttp3.w w, @e final String s) {
        return okhttp3.n.n.e(w, s);
    }
    
    @k
    @e
    public static final List<n> u(@e final okhttp3.w w, @e final v v) {
        return okhttp3.n.n.g(w, v);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "domain", imports = {}))
    @g(name = "-deprecated_domain")
    @e
    public final String a() {
        return this.d;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "expiresAt", imports = {}))
    @g(name = "-deprecated_expiresAt")
    public final long b() {
        return this.c;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "hostOnly", imports = {}))
    @g(name = "-deprecated_hostOnly")
    public final boolean c() {
        return this.i;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "httpOnly", imports = {}))
    @g(name = "-deprecated_httpOnly")
    public final boolean d() {
        return this.g;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "name", imports = {}))
    @g(name = "-deprecated_name")
    @e
    public final String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(@f final Object o) {
        if (o instanceof n) {
            final n n = (n)o;
            if (k0.g((Object)n.a, (Object)this.a) && k0.g((Object)n.b, (Object)this.b) && n.c == this.c && k0.g((Object)n.d, (Object)this.d) && k0.g((Object)n.e, (Object)this.e) && n.f == this.f && n.g == this.g && n.h == this.h && n.i == this.i) {
                return true;
            }
        }
        return false;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "path", imports = {}))
    @g(name = "-deprecated_path")
    @e
    public final String f() {
        return this.e;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "persistent", imports = {}))
    @g(name = "-deprecated_persistent")
    public final boolean g() {
        return this.h;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "secure", imports = {}))
    @g(name = "-deprecated_secure")
    public final boolean h() {
        return this.f;
    }
    
    @IgnoreJRERequirement
    @Override
    public int hashCode() {
        return ((((((((527 + this.a.hashCode()) * 31 + this.b.hashCode()) * 31 + a4.a.a(this.c)) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + okhttp3.m.a(this.f)) * 31 + okhttp3.m.a(this.g)) * 31 + okhttp3.m.a(this.h)) * 31 + okhttp3.m.a(this.i);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "value", imports = {}))
    @g(name = "-deprecated_value")
    @e
    public final String i() {
        return this.b;
    }
    
    @g(name = "domain")
    @e
    public final String n() {
        return this.d;
    }
    
    @g(name = "expiresAt")
    public final long o() {
        return this.c;
    }
    
    @g(name = "hostOnly")
    public final boolean p() {
        return this.i;
    }
    
    @g(name = "httpOnly")
    public final boolean q() {
        return this.g;
    }
    
    public final boolean r(@e final okhttp3.w w) {
        k0.p((Object)w, "url");
        boolean b;
        if (this.i) {
            b = k0.g((Object)w.F(), (Object)this.d);
        }
        else {
            b = okhttp3.n.n.d(w.F(), this.d);
        }
        final boolean b2 = false;
        if (!b) {
            return false;
        }
        if (!okhttp3.n.n.k(w, this.e)) {
            return false;
        }
        if (this.f) {
            final boolean b3 = b2;
            if (!w.G()) {
                return b3;
            }
        }
        return true;
    }
    
    @g(name = "name")
    @e
    public final String s() {
        return this.a;
    }
    
    @e
    @Override
    public String toString() {
        return this.y(false);
    }
    
    @g(name = "path")
    @e
    public final String v() {
        return this.e;
    }
    
    @g(name = "persistent")
    public final boolean w() {
        return this.h;
    }
    
    @g(name = "secure")
    public final boolean x() {
        return this.f;
    }
    
    @e
    public final String y(final boolean b) {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            String b2;
            if (this.c == Long.MIN_VALUE) {
                b2 = "; max-age=0";
            }
            else {
                sb.append("; expires=");
                b2 = okhttp3.internal.http.c.b(new Date(this.c));
            }
            sb.append(b2);
        }
        if (!this.i) {
            sb.append("; domain=");
            if (b) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        final String string = sb.toString();
        k0.o((Object)string, "toString()");
        return string;
    }
    
    @g(name = "value")
    @e
    public final String z() {
        return this.b;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0002J\u0006\u0010\u0013\u001a\u00020\u0006J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0016\u001a\u00020\u0015R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019¨\u0006\u001f" }, d2 = { "okhttp3/n$a", "", "", "domain", "", "hostOnly", "Lokhttp3/n$a;", "c", "name", "g", "value", "j", "", "expiresAt", "d", "b", "e", "path", "h", "i", "f", "Lokhttp3/n;", "a", "Z", "secure", "Ljava/lang/String;", "httpOnly", "persistent", "J", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private String a;
        private String b;
        private long c;
        private String d;
        private String e;
        private boolean f;
        private boolean g;
        private boolean h;
        private boolean i;
        
        public a() {
            this.c = 253402300799999L;
            this.e = "/";
        }
        
        private final a c(final String str, final boolean i) {
            final String e = okhttp3.internal.a.e(str);
            if (e != null) {
                this.d = e;
                this.i = i;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected domain: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @e
        public final n a() {
            final String a = this.a;
            Objects.requireNonNull(a, "builder.name == null");
            final String b = this.b;
            Objects.requireNonNull(b, "builder.value == null");
            final long c = this.c;
            final String d = this.d;
            Objects.requireNonNull(d, "builder.domain == null");
            return new n(a, b, c, d, this.e, this.f, this.g, this.h, this.i, null);
        }
        
        @e
        public final a b(@e final String s) {
            k0.p((Object)s, "domain");
            return this.c(s, false);
        }
        
        @e
        public final a d(long c) {
            long n = c;
            if (c <= 0L) {
                n = Long.MIN_VALUE;
            }
            c = n;
            if (n > 253402300799999L) {
                c = 253402300799999L;
            }
            this.c = c;
            this.h = true;
            return this;
        }
        
        @e
        public final a e(@e final String s) {
            k0.p((Object)s, "domain");
            return this.c(s, true);
        }
        
        @e
        public final a f() {
            this.g = true;
            return this;
        }
        
        @e
        public final a g(@e final String a) {
            k0.p((Object)a, "name");
            if (k0.g((Object)s.B5(a).toString(), (Object)a)) {
                this.a = a;
                return this;
            }
            throw new IllegalArgumentException("name is not trimmed".toString());
        }
        
        @e
        public final a h(@e final String e) {
            k0.p((Object)e, "path");
            if (s.u2(e, "/", false, 2, null)) {
                this.e = e;
                return this;
            }
            throw new IllegalArgumentException("path must start with '/'".toString());
        }
        
        @e
        public final a i() {
            this.f = true;
            return this;
        }
        
        @e
        public final a j(@e final String b) {
            k0.p((Object)b, "value");
            if (k0.g((Object)s.B5(b).toString(), (Object)b)) {
                this.b = b;
                return this;
            }
            throw new IllegalArgumentException("value is not trimmed".toString());
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0007J)\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0007R\u001e\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001e\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001e\u0010%\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001e\u0010&\u001a\n !*\u0004\u0018\u00010 0 8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006)" }, d2 = { "okhttp3/n$b", "", "", "urlHost", "domain", "", "d", "Lokhttp3/w;", "url", "path", "k", "s", "", "pos", "limit", "", "i", "input", "invert", "c", "j", "h", "setCookie", "Lokhttp3/n;", "e", "currentTimeMillis", "f", "(JLokhttp3/w;Ljava/lang/String;)Lokhttp3/n;", "Lokhttp3/v;", "headers", "", "g", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        private final int c(final String s, int i, final int n, final boolean b) {
            while (i < n) {
                final char char1 = s.charAt(i);
                if (((char1 < ' ' && char1 != '\t') || char1 >= '\u007f' || ('0' <= char1 && '9' >= char1) || ('a' <= char1 && 'z' >= char1) || ('A' <= char1 && 'Z' >= char1) || char1 == ':') == (b ^ true)) {
                    return i;
                }
                ++i;
            }
            return n;
        }
        
        private final boolean d(final String s, final String s2) {
            final boolean g = k0.g((Object)s, (Object)s2);
            boolean b = true;
            if (g) {
                return true;
            }
            if (!s.J1(s, s2, false, 2, null) || s.charAt(s.length() - s2.length() - 1) != '.' || okhttp3.internal.d.h(s)) {
                b = false;
            }
            return b;
        }
        
        private final String h(String e) {
            if (!(s.J1(e, ".", false, 2, null) ^ true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            e = okhttp3.internal.a.e(s.c4(e, "."));
            if (e != null) {
                return e;
            }
            throw new IllegalArgumentException();
        }
        
        private final long i(final String input, int value, int n) {
            int i = this.c(input, value, n, false);
            final Matcher matcher = n.l().matcher(input);
            value = -1;
            int value2 = -1;
            int value3 = -1;
            int n2 = -1;
            int value4 = -1;
            int value5 = -1;
            while (i < n) {
                final int c = this.c(input, i + 1, n, true);
                matcher.region(i, c);
                int int1;
                int int2;
                int int3;
                int int4;
                int int5;
                int n3;
                if (value2 == -1 && matcher.usePattern(n.l()).matches()) {
                    final String group = matcher.group(1);
                    k0.o((Object)group, "matcher.group(1)");
                    int1 = Integer.parseInt(group);
                    final String group2 = matcher.group(2);
                    k0.o((Object)group2, "matcher.group(2)");
                    int2 = Integer.parseInt(group2);
                    final String group3 = matcher.group(3);
                    k0.o((Object)group3, "matcher.group(3)");
                    int3 = Integer.parseInt(group3);
                    int4 = value;
                    int5 = value3;
                    n3 = n2;
                }
                else if (value3 == -1 && matcher.usePattern(n.j()).matches()) {
                    final String group4 = matcher.group(1);
                    k0.o((Object)group4, "matcher.group(1)");
                    int5 = Integer.parseInt(group4);
                    int4 = value;
                    int1 = value2;
                    n3 = n2;
                    int2 = value4;
                    int3 = value5;
                }
                else if (n2 == -1 && matcher.usePattern(n.k()).matches()) {
                    final String group5 = matcher.group(1);
                    k0.o((Object)group5, "matcher.group(1)");
                    final Locale us = Locale.US;
                    k0.o((Object)us, "Locale.US");
                    Objects.requireNonNull(group5, "null cannot be cast to non-null type java.lang.String");
                    final String lowerCase = group5.toLowerCase(us);
                    k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    final String pattern = n.k().pattern();
                    k0.o((Object)pattern, "MONTH_PATTERN.pattern()");
                    n3 = s.r3(pattern, lowerCase, 0, false, 6, null) / 4;
                    int4 = value;
                    int1 = value2;
                    int5 = value3;
                    int2 = value4;
                    int3 = value5;
                }
                else {
                    int4 = value;
                    int1 = value2;
                    int5 = value3;
                    n3 = n2;
                    int2 = value4;
                    int3 = value5;
                    if (value == -1) {
                        int4 = value;
                        int1 = value2;
                        int5 = value3;
                        n3 = n2;
                        int2 = value4;
                        int3 = value5;
                        if (matcher.usePattern(n.m()).matches()) {
                            final String group6 = matcher.group(1);
                            k0.o((Object)group6, "matcher.group(1)");
                            int4 = Integer.parseInt(group6);
                            int3 = value5;
                            int2 = value4;
                            n3 = n2;
                            int5 = value3;
                            int1 = value2;
                        }
                    }
                }
                i = this.c(input, c + 1, n, false);
                value = int4;
                value2 = int1;
                value3 = int5;
                n2 = n3;
                value4 = int2;
                value5 = int3;
            }
            if (70 > value) {
                n = value;
            }
            else if (99 >= (n = value)) {
                n = value + 1900;
            }
            if (n < 0) {
                value = n;
            }
            else if (69 >= (value = n)) {
                value = n + 2000;
            }
            if (value >= 1601) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (n2 != -1) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Label_0605: {
                if (1 <= value3) {
                    if (31 >= value3) {
                        n = 1;
                        break Label_0605;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Label_0631: {
                if (value2 >= 0) {
                    if (23 >= value2) {
                        n = 1;
                        break Label_0631;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Label_0657: {
                if (value4 >= 0) {
                    if (59 >= value4) {
                        n = 1;
                        break Label_0657;
                    }
                }
                n = 0;
            }
            if (n == 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            Label_0683: {
                if (value5 >= 0) {
                    if (59 >= value5) {
                        n = 1;
                        break Label_0683;
                    }
                }
                n = 0;
            }
            if (n != 0) {
                final GregorianCalendar gregorianCalendar = new GregorianCalendar(okhttp3.internal.d.f);
                gregorianCalendar.setLenient(false);
                gregorianCalendar.set(1, value);
                gregorianCalendar.set(2, n2 - 1);
                gregorianCalendar.set(5, value3);
                gregorianCalendar.set(11, value2);
                gregorianCalendar.set(12, value4);
                gregorianCalendar.set(13, value5);
                gregorianCalendar.set(14, 0);
                return gregorianCalendar.getTimeInMillis();
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        
        private final long j(final String s) {
            long n = Long.MIN_VALUE;
            try {
                final long long1 = Long.parseLong(s);
                if (long1 > 0L) {
                    n = long1;
                }
                return n;
            }
            catch (NumberFormatException ex) {
                if (new o("-?\\d+").i(s)) {
                    if (!s.u2(s, "-", false, 2, null)) {
                        n = Long.MAX_VALUE;
                    }
                    return n;
                }
                throw ex;
            }
        }
        
        private final boolean k(final okhttp3.w w, final String s) {
            final String x = w.x();
            if (k0.g((Object)x, (Object)s)) {
                return true;
            }
            if (s.u2(x, s, false, 2, null)) {
                if (s.J1(s, "/", false, 2, null)) {
                    return true;
                }
                if (x.charAt(s.length()) == '/') {
                    return true;
                }
            }
            return false;
        }
        
        @k
        @f
        public final n e(@e final okhttp3.w w, @e final String s) {
            k0.p((Object)w, "url");
            k0.p((Object)s, "setCookie");
            return this.f(System.currentTimeMillis(), w, s);
        }
        
        @f
        public final n f(long n, @e okhttp3.w substring, @e String s) {
            k0.p((Object)substring, "url");
            k0.p((Object)s, "setCookie");
            final int r = okhttp3.internal.d.r(s, ';', 0, 0, 6, null);
            int n2 = okhttp3.internal.d.r(s, '=', 0, r, 2, null);
            if (n2 == r) {
                return null;
            }
            final String h0 = okhttp3.internal.d.h0(s, 0, n2, 1, null);
            Label_0830: {
                if (h0.length() == 0 || okhttp3.internal.d.B(h0) != -1) {
                    break Label_0830;
                }
                final String g0 = okhttp3.internal.d.g0(s, n2 + 1, r);
                if (okhttp3.internal.d.B(g0) != -1) {
                    return null;
                }
                int n3 = r + 1;
                n2 = s.length();
                Object x;
                Object o = x = null;
                long j = -1L;
                boolean b = false;
                boolean b2 = false;
                boolean b3 = false;
                boolean b4 = true;
                long i = 253402300799999L;
            Block_10_Outer:
                while (true) {
                    Label_0564: {
                        if (n3 >= n2) {
                            break Label_0564;
                        }
                        final int p3 = okhttp3.internal.d.p(s, ';', n3, n2);
                        final int p4 = okhttp3.internal.d.p(s, '=', n3, p3);
                        final String g2 = okhttp3.internal.d.g0(s, n3, p4);
                        String g3;
                        if (p4 < p3) {
                            g3 = okhttp3.internal.d.g0(s, p4 + 1, p3);
                        }
                        else {
                            g3 = "";
                        }
                        Label_0271: {
                            if (!s.K1(g2, "expires", true)) {
                                break Label_0271;
                            }
                            try {
                                i = this.i(g3, 0, g3.length());
                                boolean b5;
                                String h2;
                                long n4;
                                boolean b6;
                                boolean b7;
                                Object o2;
                                long n5;
                                String f;
                                long n6;
                                int e3;
                                Label_0657_Outer:Label_0619_Outer:
                                while (true) {
                                    Label_0295: {
                                        break Label_0295;
                                        try {
                                            j = this.j(g3);
                                            b5 = true;
                                            h2 = (String)o;
                                            n4 = j;
                                            b6 = b;
                                            b7 = b4;
                                            o2 = x;
                                            n5 = i;
                                            // iftrue(Label_0581:, i <= 253402300799999L)
                                            // iftrue(Label_0688:, this.d(f, (String)o))
                                            // iftrue(Label_0456:, !s.K1(g2, "secure", true))
                                            // iftrue(Label_0721:, f.length() == s.length() || PublicSuffixDatabase.j.c().e(s) != null)
                                            // iftrue(Label_0675:, o != null)
                                            // iftrue(Label_0527:, !s.K1(g2, "httponly", true))
                                            // iftrue(Label_0584:, j != -9223372036854775808L)
                                            // iftrue(Label_0801:, e3 == 0)
                                            // iftrue(Label_0647:, i < n)
                                            // iftrue(Label_0414:, !s.K1(g2, "path", true))
                                            // iftrue(Label_0749:, x == null || !s.u2((String)x, "/", false, 2, (Object)null))
                                            // iftrue(Label_0654:, j == -1L)
                                            // iftrue(Label_0371:, !s.K1(g2, "domain", true))
                                            // iftrue(Label_0614:, j > 9223372036854775L)
                                        Label_0619:
                                            while (true) {
                                            Block_18_Outer:
                                                while (true) {
                                                Label_0581:
                                                    while (true) {
                                                    Block_17:
                                                        while (true) {
                                                            Label_0692_Outer:Block_13_Outer:
                                                            while (true) {
                                                                n3 = p3 + 1;
                                                                o = h2;
                                                                j = n4;
                                                                b = b6;
                                                                b3 = b5;
                                                                b4 = b7;
                                                                x = o2;
                                                                i = n5;
                                                                continue Block_10_Outer;
                                                                Label_0688: {
                                                                    s = (String)o;
                                                                }
                                                                Block_15: {
                                                                    while (true) {
                                                                    Label_0801_Outer:
                                                                        while (true) {
                                                                            break Label_0692;
                                                                            o2 = g3;
                                                                            h2 = (String)o;
                                                                            n4 = j;
                                                                            b6 = b;
                                                                            b5 = b3;
                                                                            b7 = b4;
                                                                            n5 = i;
                                                                            continue Label_0692_Outer;
                                                                            Block_20: {
                                                                                Block_16: {
                                                                                    while (true) {
                                                                                        Block_26: {
                                                                                            while (true) {
                                                                                                n = i;
                                                                                                Label_0647: {
                                                                                                    break Label_0647;
                                                                                                    Label_0675:
                                                                                                    return null;
                                                                                                    Label_0414:
                                                                                                    Block_14: {
                                                                                                        break Block_14;
                                                                                                        return null;
                                                                                                        x = substring;
                                                                                                        return new n(h0, g0, n, s, (String)x, b, b2, b3, b4, null);
                                                                                                    }
                                                                                                    b6 = true;
                                                                                                    h2 = (String)o;
                                                                                                    n4 = j;
                                                                                                    b5 = b3;
                                                                                                    b7 = b4;
                                                                                                    o2 = x;
                                                                                                    n5 = i;
                                                                                                    continue Label_0692_Outer;
                                                                                                }
                                                                                                n = 253402300799999L;
                                                                                                f = substring.F();
                                                                                                break Block_20;
                                                                                                Label_0456:
                                                                                                h2 = (String)o;
                                                                                                n4 = j;
                                                                                                b6 = b;
                                                                                                b5 = b3;
                                                                                                b7 = b4;
                                                                                                o2 = x;
                                                                                                n5 = i;
                                                                                                break Block_15;
                                                                                                n6 = Long.MIN_VALUE;
                                                                                                break Block_16;
                                                                                                Label_0749:
                                                                                                x = substring.x();
                                                                                                e3 = s.E3((CharSequence)x, '/', 0, false, 6, null);
                                                                                                substring = (okhttp3.w)o;
                                                                                                break Block_26;
                                                                                                i += n;
                                                                                                continue Label_0801_Outer;
                                                                                            }
                                                                                            return null;
                                                                                        }
                                                                                        Objects.requireNonNull(x, "null cannot be cast to non-null type java.lang.String");
                                                                                        substring = (okhttp3.w)((String)x).substring(0, e3);
                                                                                        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                                                                        continue Label_0657_Outer;
                                                                                    }
                                                                                    h2 = this.h(g3);
                                                                                    b7 = false;
                                                                                    n4 = j;
                                                                                    b6 = b;
                                                                                    b5 = b3;
                                                                                    o2 = x;
                                                                                    n5 = i;
                                                                                    continue Label_0692_Outer;
                                                                                    i = j * 1000;
                                                                                    continue Label_0619;
                                                                                }
                                                                                n = n6;
                                                                                break Label_0581;
                                                                            }
                                                                            s = f;
                                                                            continue Block_13_Outer;
                                                                        }
                                                                        Label_0371:
                                                                        continue Label_0657_Outer;
                                                                    }
                                                                    Label_0721:
                                                                    o = "/";
                                                                    return new n(h0, g0, n, s, (String)x, b, b2, b3, b4, null);
                                                                }
                                                                b2 = true;
                                                                n5 = i;
                                                                o2 = x;
                                                                b7 = b4;
                                                                b5 = b3;
                                                                b6 = b;
                                                                n4 = j;
                                                                h2 = (String)o;
                                                                continue Label_0692_Outer;
                                                            }
                                                            Label_0584: {
                                                                break Block_17;
                                                            }
                                                            Label_0325:
                                                            continue Block_18_Outer;
                                                        }
                                                        continue;
                                                    }
                                                    continue Label_0619_Outer;
                                                }
                                                Label_0614: {
                                                    i = Long.MAX_VALUE;
                                                }
                                                continue Label_0619;
                                            }
                                            Label_0654: {
                                                n = i;
                                            }
                                        }
                                        catch (NumberFormatException ex) {
                                            h2 = (String)o;
                                            n4 = j;
                                            b6 = b;
                                            b5 = b3;
                                            b7 = b4;
                                            o2 = x;
                                            n5 = i;
                                        }
                                    }
                                    continue;
                                }
                            }
                            // iftrue(Label_0325:, !s.K1(g2, "max-age", true))
                            catch (IllegalArgumentException ex2) {}
                        }
                    }
                    break;
                }
            }
        }
        
        @k
        @e
        public final List<n> g(@e final okhttp3.w w, @e final v v) {
            k0.p((Object)w, "url");
            k0.p((Object)v, "headers");
            final List<String> w2 = v.w("Set-Cookie");
            final int size = w2.size();
            List<n> list = null;
            List<n> list2;
            for (int i = 0; i < size; ++i, list = list2) {
                final n e = this.e(w, w2.get(i));
                list2 = list;
                if (e != null) {
                    if ((list2 = list) == null) {
                        list2 = new ArrayList<n>();
                    }
                    list2.add(e);
                }
            }
            List<Object> list3;
            if (list != null) {
                list3 = Collections.unmodifiableList((List<?>)list);
                k0.o((Object)list3, "Collections.unmodifiableList(cookies)");
            }
            else {
                list3 = (List<Object>)kotlin.collections.v.E();
            }
            return (List<n>)list3;
        }
    }
}
