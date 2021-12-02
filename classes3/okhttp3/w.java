// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.nio.charset.StandardCharsets;
import okio.m;
import java.util.Iterator;
import okhttp3.internal.a;
import java.nio.charset.Charset;
import kotlin.text.s;
import java.net.MalformedURLException;
import kotlin.z0;
import java.net.URISyntaxException;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.Collections;
import java.util.LinkedHashSet;
import kotlin.collections.j1;
import java.util.Set;
import kotlin.ranges.i;
import kotlin.ranges.o;
import java.util.Collection;
import java.util.Objects;
import okhttp3.internal.d;
import java.net.URL;
import java.net.URI;
import m6.g;
import m6.k;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\"\n\u0002\b0\u0018\u0000 G2\u00020\u0001:\u00023#Bc\b\u0000\u0012\u0006\u0010Y\u001a\u00020\b\u0012\u0006\u0010W\u001a\u00020\b\u0012\u0006\u0010F\u001a\u00020\b\u0012\u0006\u0010[\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\r\u0012\f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\u0010\u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b\u0012\b\u0010D\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010K\u001a\u00020\b¢\u0006\u0004\b^\u0010_J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u000b2\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u0011\u001a\u00020\bJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0015\u001a\u00020\u0014J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0012\u001a\u00020\bJ\u0013\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001a\u001a\u00020\rH\u0016J\b\u0010\u001b\u001a\u00020\bH\u0016J\b\u0010\u001c\u001a\u0004\u0018\u00010\bJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u0004J\u000f\u0010\u001e\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u0007J\u000f\u0010\u001f\u001a\u00020\bH\u0007¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\bH\u0007¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\bH\u0007¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010 J\u000f\u0010$\u001a\u00020\bH\u0007¢\u0006\u0004\b$\u0010 J\u000f\u0010%\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010 J\u000f\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\rH\u0007¢\u0006\u0004\b(\u0010'J\u000f\u0010)\u001a\u00020\bH\u0007¢\u0006\u0004\b)\u0010 J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH\u0007¢\u0006\u0004\b,\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b-\u0010 J\u0011\u0010.\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b.\u0010 J\u000f\u0010/\u001a\u00020\rH\u0007¢\u0006\u0004\b/\u0010'J\u0015\u00101\u001a\b\u0012\u0004\u0012\u00020\b00H\u0007¢\u0006\u0004\b1\u00102J\u0011\u00103\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b3\u0010 J\u0011\u00104\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b4\u0010 R\u0019\u00106\u001a\u00020\r8\u0007@\u0006¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b5\u0010'R\u0019\u00109\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b7\u00108R\u0019\u0010;\u001a\b\u0012\u0004\u0012\u00020\b008G@\u0006¢\u0006\u0006\u001a\u0004\b:\u00102R \u0010=\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010<R\u0013\u0010?\u001a\u00020\r8G@\u0006¢\u0006\u0006\u001a\u0004\b>\u0010'R\u0013\u0010A\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b@\u0010 R\u001b\u0010D\u001a\u0004\u0018\u00010\b8\u0007@\u0006¢\u0006\f\n\u0004\b$\u0010B\u001a\u0004\bC\u0010 R\u0019\u0010F\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b*\u0010B\u001a\u0004\bE\u0010 R\u0013\u0010H\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\bG\u0010 R\u0019\u0010J\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8G@\u0006¢\u0006\u0006\u001a\u0004\bI\u0010+R\u0016\u0010K\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010BR\u0015\u0010M\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\bL\u0010 R\u0015\u0010O\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\bN\u0010 R\u0013\u0010Q\u001a\u00020\r8G@\u0006¢\u0006\u0006\u001a\u0004\bP\u0010'R\u0015\u0010S\u001a\u0004\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\bR\u0010 R\u001f\u0010U\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0007@\u0006¢\u0006\f\n\u0004\b4\u0010<\u001a\u0004\bT\u0010+R\u0019\u0010W\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b)\u0010B\u001a\u0004\bV\u0010 R\u0019\u0010Y\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b#\u0010B\u001a\u0004\bX\u0010 R\u0019\u0010[\u001a\u00020\b8\u0007@\u0006¢\u0006\f\n\u0004\b-\u0010B\u001a\u0004\bZ\u0010 R\u0013\u0010]\u001a\u00020\b8G@\u0006¢\u0006\u0006\u001a\u0004\b\\\u0010 ¨\u0006`" }, d2 = { "Lokhttp3/w;", "", "Ljava/net/URL;", "a0", "()Ljava/net/URL;", "Ljava/net/URI;", "Z", "()Ljava/net/URI;", "", "name", "P", "", "T", "", "index", "Q", "S", "V", "link", "W", "Lokhttp3/w$a;", "H", "I", "other", "", "equals", "hashCode", "toString", "Y", "r", "q", "p", "()Ljava/lang/String;", "f", "s", "b", "i", "h", "l", "()I", "k", "c", "d", "()Ljava/util/List;", "j", "e", "m", "o", "", "n", "()Ljava/util/Set;", "a", "g", "N", "port", "G", "()Z", "isHttps", "R", "queryParameterNames", "Ljava/util/List;", "queryNamesAndValues", "U", "querySize", "x", "encodedPath", "Ljava/lang/String;", "B", "fragment", "K", "password", "w", "encodedPassword", "y", "encodedPathSegments", "url", "z", "encodedQuery", "v", "encodedFragment", "M", "pathSize", "O", "query", "L", "pathSegments", "b0", "username", "X", "scheme", "F", "host", "A", "encodedUsername", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class w
{
    private static final char[] k;
    @e
    public static final String l = " \"':;<=>@[]^`{}|/\\?#";
    @e
    public static final String m = " \"':;<=>@[]^`{}|/\\?#";
    @e
    public static final String n = " \"<>^`{}|/\\?#";
    @e
    public static final String o = "[]";
    @e
    public static final String p = " \"'<>#";
    @e
    public static final String q = " \"'<>#&=";
    @e
    public static final String r = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    @e
    public static final String s = "\\^`{|}";
    @e
    public static final String t = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    @e
    public static final String u = "";
    @e
    public static final String v = " \"#<>\\^`{|}";
    public static final b w;
    private final boolean a;
    @e
    private final String b;
    @e
    private final String c;
    @e
    private final String d;
    @e
    private final String e;
    private final int f;
    @e
    private final List<String> g;
    private final List<String> h;
    @f
    private final String i;
    private final String j;
    
    static {
        w = new b(null);
        k = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
    }
    
    public w(@e final String b, @e final String c, @e final String d, @e final String e, final int f, @e final List<String> g, @f final List<String> h, @f final String i, @e final String j) {
        k0.p((Object)b, "scheme");
        k0.p((Object)c, "username");
        k0.p((Object)d, "password");
        k0.p((Object)e, "host");
        k0.p((Object)g, "pathSegments");
        k0.p((Object)j, "url");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.a = k0.g((Object)b, (Object)"https");
    }
    
    @k
    @g(name = "get")
    @e
    public static final w C(@e final String s) {
        return okhttp3.w.w.h(s);
    }
    
    @k
    @g(name = "get")
    @f
    public static final w D(@e final URI uri) {
        return okhttp3.w.w.i(uri);
    }
    
    @k
    @g(name = "get")
    @f
    public static final w E(@e final URL url) {
        return okhttp3.w.w.j(url);
    }
    
    @k
    @g(name = "parse")
    @f
    public static final w J(@e final String s) {
        return okhttp3.w.w.l(s);
    }
    
    public static final /* synthetic */ char[] t() {
        return okhttp3.w.k;
    }
    
    @k
    public static final int u(@e final String s) {
        return okhttp3.w.w.g(s);
    }
    
    @g(name = "encodedUsername")
    @e
    public final String A() {
        if (this.c.length() == 0) {
            return "";
        }
        final int beginIndex = this.b.length() + 3;
        final String j = this.j;
        final int q = okhttp3.internal.d.q(j, ":@", beginIndex, j.length());
        final String i = this.j;
        Objects.requireNonNull(i, "null cannot be cast to non-null type java.lang.String");
        final String substring = i.substring(beginIndex, q);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @g(name = "fragment")
    @f
    public final String B() {
        return this.i;
    }
    
    @g(name = "host")
    @e
    public final String F() {
        return this.e;
    }
    
    public final boolean G() {
        return this.a;
    }
    
    @e
    public final a H() {
        final a a = new a();
        a.X(this.b);
        a.S(this.A());
        a.O(this.w());
        a.T(this.e);
        int f;
        if (this.f != okhttp3.w.w.g(this.b)) {
            f = this.f;
        }
        else {
            f = -1;
        }
        a.V(f);
        a.r().clear();
        a.r().addAll(this.y());
        a.m(this.z());
        a.N(this.v());
        return a;
    }
    
    @f
    public final a I(@e final String s) {
        k0.p((Object)s, "link");
        a a;
        try {
            a = new a().A(this, s);
        }
        catch (IllegalArgumentException ex) {
            a = null;
        }
        return a;
    }
    
    @g(name = "password")
    @e
    public final String K() {
        return this.d;
    }
    
    @g(name = "pathSegments")
    @e
    public final List<String> L() {
        return this.g;
    }
    
    @g(name = "pathSize")
    public final int M() {
        return this.g.size();
    }
    
    @g(name = "port")
    public final int N() {
        return this.f;
    }
    
    @g(name = "query")
    @f
    public final String O() {
        if (this.h == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        okhttp3.w.w.q(this.h, sb);
        return sb.toString();
    }
    
    @f
    public final String P(@e final String s) {
        k0.p((Object)s, "name");
        final List<String> h = this.h;
        if (h == null) {
            return null;
        }
        final i s2 = kotlin.ranges.o.S0((i)kotlin.ranges.o.n1(0, h.size()), 2);
        int k = s2.k();
        final int n = s2.n();
        final int o = s2.o();
        if (o >= 0) {
            if (k > n) {
                return null;
            }
        }
        else if (k < n) {
            return null;
        }
        while (!k0.g((Object)s, (Object)this.h.get(k))) {
            if (k == n) {
                return null;
            }
            k += o;
        }
        return this.h.get(k + 1);
    }
    
    @e
    public final String Q(final int n) {
        final List<String> h = this.h;
        if (h != null) {
            final String value = h.get(n * 2);
            k0.m((Object)value);
            return value;
        }
        throw new IndexOutOfBoundsException();
    }
    
    @g(name = "queryParameterNames")
    @e
    public final Set<String> R() {
        if (this.h == null) {
            return (Set<String>)j1.k();
        }
        final LinkedHashSet<String> s = new LinkedHashSet<String>();
        final i s2 = kotlin.ranges.o.S0((i)kotlin.ranges.o.n1(0, this.h.size()), 2);
        int k = s2.k();
        final int n = s2.n();
        final int o = s2.o();
        Label_0109: {
            if (o >= 0) {
                if (k > n) {
                    break Label_0109;
                }
            }
            else if (k < n) {
                break Label_0109;
            }
            while (true) {
                final String value = this.h.get(k);
                k0.m((Object)value);
                s.add(value);
                if (k == n) {
                    break;
                }
                k += o;
            }
        }
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)s);
        k0.o((Object)unmodifiableSet, "Collections.unmodifiableSet(result)");
        return (Set<String>)unmodifiableSet;
    }
    
    @f
    public final String S(final int n) {
        final List<String> h = this.h;
        if (h != null) {
            return h.get(n * 2 + 1);
        }
        throw new IndexOutOfBoundsException();
    }
    
    @e
    public final List<String> T(@e final String s) {
        k0.p((Object)s, "name");
        if (this.h == null) {
            return (List<String>)kotlin.collections.v.E();
        }
        final ArrayList<String> list = new ArrayList<String>();
        final i s2 = kotlin.ranges.o.S0((i)kotlin.ranges.o.n1(0, this.h.size()), 2);
        int k = s2.k();
        final int n = s2.n();
        final int o = s2.o();
        Label_0142: {
            if (o >= 0) {
                if (k > n) {
                    break Label_0142;
                }
            }
            else if (k < n) {
                break Label_0142;
            }
            while (true) {
                if (k0.g((Object)s, (Object)this.h.get(k))) {
                    list.add(this.h.get(k + 1));
                }
                if (k == n) {
                    break;
                }
                k += o;
            }
        }
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
        k0.o((Object)unmodifiableList, "Collections.unmodifiableList(result)");
        return (List<String>)unmodifiableList;
    }
    
    @g(name = "querySize")
    public final int U() {
        final List<String> h = this.h;
        int n;
        if (h != null) {
            n = h.size() / 2;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    @e
    public final String V() {
        final a i = this.I("/...");
        k0.m((Object)i);
        return i.Y("").B("").h().toString();
    }
    
    @f
    public final w W(@e final String s) {
        k0.p((Object)s, "link");
        final a i = this.I(s);
        w h;
        if (i != null) {
            h = i.h();
        }
        else {
            h = null;
        }
        return h;
    }
    
    @g(name = "scheme")
    @e
    public final String X() {
        return this.b;
    }
    
    @f
    public final String Y() {
        String e;
        if (okhttp3.internal.d.h(this.e)) {
            e = null;
        }
        else {
            e = PublicSuffixDatabase.j.c().e(this.e);
        }
        return e;
    }
    
    @g(name = "uri")
    @e
    public final URI Z() {
        final String string = this.H().G().toString();
        try {
            final Object o = new URI(string);
            return (URI)o;
        }
        catch (URISyntaxException cause) {
            final kotlin.text.o o2 = new(kotlin.text.o.class);
            final kotlin.text.o o4;
            final kotlin.text.o o3 = o4 = o2;
            final String s = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";
            new kotlin.text.o(s);
            final kotlin.text.o o5 = o3;
            final String s2 = string;
            final String s3 = "";
            final String s4 = o5.j(s2, s3);
            final URI uri = URI.create(s4);
            final URI uri2;
            final Object o = uri2 = uri;
            final String s5 = "try {\n        val stripp\u2026e) // Unexpected!\n      }";
            k0.o((Object)uri2, s5);
        }
        try {
            final kotlin.text.o o2 = new(kotlin.text.o.class);
            final kotlin.text.o o4;
            final kotlin.text.o o3 = o4 = o2;
            final String s = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";
            new kotlin.text.o(s);
            final kotlin.text.o o5 = o3;
            final String s2 = string;
            final String s3 = "";
            final String s4 = o5.j(s2, s3);
            final URI uri = URI.create(s4);
            final URI uri2;
            final Object o = uri2 = uri;
            final String s5 = "try {\n        val stripp\u2026e) // Unexpected!\n      }";
            k0.o((Object)uri2, s5);
            return (URI)o;
        }
        catch (Exception ex) {
            final URISyntaxException cause;
            throw new RuntimeException(cause);
        }
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedFragment", imports = {}))
    @g(name = "-deprecated_encodedFragment")
    @f
    public final String a() {
        return this.v();
    }
    
    @g(name = "url")
    @e
    public final URL a0() {
        try {
            return new URL(this.j);
        }
        catch (MalformedURLException cause) {
            throw new RuntimeException(cause);
        }
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedPassword", imports = {}))
    @g(name = "-deprecated_encodedPassword")
    @e
    public final String b() {
        return this.w();
    }
    
    @g(name = "username")
    @e
    public final String b0() {
        return this.c;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedPath", imports = {}))
    @g(name = "-deprecated_encodedPath")
    @e
    public final String c() {
        return this.x();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedPathSegments", imports = {}))
    @g(name = "-deprecated_encodedPathSegments")
    @e
    public final List<String> d() {
        return this.y();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedQuery", imports = {}))
    @g(name = "-deprecated_encodedQuery")
    @f
    public final String e() {
        return this.z();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof w && k0.g((Object)((w)o).j, (Object)this.j);
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "encodedUsername", imports = {}))
    @g(name = "-deprecated_encodedUsername")
    @e
    public final String f() {
        return this.A();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "fragment", imports = {}))
    @g(name = "-deprecated_fragment")
    @f
    public final String g() {
        return this.i;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "host", imports = {}))
    @g(name = "-deprecated_host")
    @e
    public final String h() {
        return this.e;
    }
    
    @Override
    public int hashCode() {
        return this.j.hashCode();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "password", imports = {}))
    @g(name = "-deprecated_password")
    @e
    public final String i() {
        return this.d;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "pathSegments", imports = {}))
    @g(name = "-deprecated_pathSegments")
    @e
    public final List<String> j() {
        return this.g;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "pathSize", imports = {}))
    @g(name = "-deprecated_pathSize")
    public final int k() {
        return this.M();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "port", imports = {}))
    @g(name = "-deprecated_port")
    public final int l() {
        return this.f;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "query", imports = {}))
    @g(name = "-deprecated_query")
    @f
    public final String m() {
        return this.O();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "queryParameterNames", imports = {}))
    @g(name = "-deprecated_queryParameterNames")
    @e
    public final Set<String> n() {
        return this.R();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "querySize", imports = {}))
    @g(name = "-deprecated_querySize")
    public final int o() {
        return this.U();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "scheme", imports = {}))
    @g(name = "-deprecated_scheme")
    @e
    public final String p() {
        return this.b;
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to toUri()", replaceWith = @z0(expression = "toUri()", imports = {}))
    @g(name = "-deprecated_uri")
    @e
    public final URI q() {
        return this.Z();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to toUrl()", replaceWith = @z0(expression = "toUrl()", imports = {}))
    @g(name = "-deprecated_url")
    @e
    public final URL r() {
        return this.a0();
    }
    
    @kotlin.i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "username", imports = {}))
    @g(name = "-deprecated_username")
    @e
    public final String s() {
        return this.c;
    }
    
    @e
    @Override
    public String toString() {
        return this.j;
    }
    
    @g(name = "encodedFragment")
    @f
    public final String v() {
        if (this.i == null) {
            return null;
        }
        final int q3 = kotlin.text.s.q3(this.j, '#', 0, false, 6, null);
        final String j = this.j;
        Objects.requireNonNull(j, "null cannot be cast to non-null type java.lang.String");
        final String substring = j.substring(q3 + 1);
        k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
    
    @g(name = "encodedPassword")
    @e
    public final String w() {
        if (this.d.length() == 0) {
            return "";
        }
        final int q3 = kotlin.text.s.q3(this.j, ':', this.b.length() + 3, false, 4, null);
        final int q4 = kotlin.text.s.q3(this.j, '@', 0, false, 6, null);
        final String j = this.j;
        Objects.requireNonNull(j, "null cannot be cast to non-null type java.lang.String");
        final String substring = j.substring(q3 + 1, q4);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @g(name = "encodedPath")
    @e
    public final String x() {
        final int q3 = kotlin.text.s.q3(this.j, '/', this.b.length() + 3, false, 4, null);
        final String j = this.j;
        final int q4 = okhttp3.internal.d.q(j, "?#", q3, j.length());
        final String i = this.j;
        Objects.requireNonNull(i, "null cannot be cast to non-null type java.lang.String");
        final String substring = i.substring(q3, q4);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @g(name = "encodedPathSegments")
    @e
    public final List<String> y() {
        int i = kotlin.text.s.q3(this.j, '/', this.b.length() + 3, false, 4, null);
        final String j = this.j;
        final int q = okhttp3.internal.d.q(j, "?#", i, j.length());
        final ArrayList<String> list = new ArrayList<String>();
        while (i < q) {
            final int beginIndex = i + 1;
            i = okhttp3.internal.d.p(this.j, '/', beginIndex, q);
            final String k = this.j;
            Objects.requireNonNull(k, "null cannot be cast to non-null type java.lang.String");
            final String substring = k.substring(beginIndex, i);
            k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            list.add(substring);
        }
        return list;
    }
    
    @g(name = "encodedQuery")
    @f
    public final String z() {
        if (this.h == null) {
            return null;
        }
        final int beginIndex = kotlin.text.s.q3(this.j, '?', 0, false, 6, null) + 1;
        final String j = this.j;
        final int p = okhttp3.internal.d.p(j, '#', beginIndex, j.length());
        final String i = this.j;
        Objects.requireNonNull(i, "null cannot be cast to non-null type java.lang.String");
        final String substring = i.substring(beginIndex, p);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00008\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\f\u0018\u0000 C2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\be\u0010fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002J \u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0002J0\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u0016\u001a\u00020\u000bH\u0002J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0004J\u000e\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u0004J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0002J\u000e\u0010&\u001a\u00020\b2\u0006\u0010%\u001a\u00020\u0004J\u000e\u0010'\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010)\u001a\u00020\b2\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010+\u001a\u00020\b2\u0006\u0010*\u001a\u00020\u0004J\u0016\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0004J\u0016\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0004J\u000e\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020\u0002J\u000e\u00101\u001a\u00020\b2\u0006\u00100\u001a\u00020\u0004J\u0010\u00103\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u00010\u0004J\u0010\u00105\u001a\u00020\b2\b\u00104\u001a\u0004\u0018\u00010\u0004J\u0018\u00108\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\u0004J\u0018\u0010;\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00042\b\u0010:\u001a\u0004\u0018\u00010\u0004J\u0018\u0010<\u001a\u00020\b2\u0006\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u00010\u0004J\u0018\u0010=\u001a\u00020\b2\u0006\u00109\u001a\u00020\u00042\b\u0010:\u001a\u0004\u0018\u00010\u0004J\u000e\u0010>\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0004J\u000e\u0010?\u001a\u00020\b2\u0006\u00109\u001a\u00020\u0004J\u0010\u0010A\u001a\u00020\b2\b\u0010@\u001a\u0004\u0018\u00010\u0004J\u0010\u0010C\u001a\u00020\b2\b\u0010B\u001a\u0004\u0018\u00010\u0004J\u000f\u0010D\u001a\u00020\bH\u0000¢\u0006\u0004\bD\u0010EJ\u0006\u0010G\u001a\u00020FJ\b\u0010H\u001a\u00020\u0004H\u0016J!\u0010J\u001a\u00020\b2\b\u0010I\u001a\u0004\u0018\u00010F2\u0006\u0010\r\u001a\u00020\u0004H\u0000¢\u0006\u0004\bJ\u0010KR$\u0010B\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bG\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010L\u001a\u0004\bQ\u0010N\"\u0004\bR\u0010PR\"\u0010#\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010?\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010L\u001a\u0004\bW\u0010N\"\u0004\bX\u0010PR\"\u0010\u001b\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010L\u001a\u0004\bY\u0010N\"\u0004\bZ\u0010PR\"\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040[8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\\\u001a\u0004\b]\u0010^R\"\u0010\u001f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010L\u001a\u0004\b_\u0010N\"\u0004\b`\u0010PR,\u0010d\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010[8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b8\u0010\\\u001a\u0004\ba\u0010^\"\u0004\bb\u0010c¨\u0006g" }, d2 = { "okhttp3/w$a", "", "", "i", "", "pathSegments", "", "alreadyEncoded", "Lokhttp3/w$a;", "f", "canonicalName", "Lkotlin/j2;", "H", "input", "startPos", "limit", "L", "pos", "addTrailingSlash", "E", "y", "z", "C", "scheme", "M", "username", "Y", "encodedUsername", "n", "password", "B", "encodedPassword", "k", "host", "x", "port", "D", "pathSegment", "d", "e", "encodedPathSegment", "a", "encodedPathSegments", "b", "index", "U", "P", "K", "encodedPath", "l", "query", "F", "encodedQuery", "m", "name", "value", "g", "encodedName", "encodedValue", "c", "W", "R", "J", "I", "fragment", "o", "encodedFragment", "j", "G", "()Lokhttp3/w$a;", "Lokhttp3/w;", "h", "toString", "base", "A", "(Lokhttp3/w;Ljava/lang/String;)Lokhttp3/w$a;", "Ljava/lang/String;", "p", "()Ljava/lang/String;", "N", "(Ljava/lang/String;)V", "u", "T", "v", "()I", "V", "(I)V", "w", "X", "t", "S", "", "Ljava/util/List;", "r", "()Ljava/util/List;", "q", "O", "s", "Q", "(Ljava/util/List;)V", "encodedQueryNamesAndValues", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        @e
        public static final String i = "Invalid URL host";
        public static final w.a.a j;
        @f
        private String a;
        @e
        private String b;
        @e
        private String c;
        @f
        private String d;
        private int e;
        @e
        private final List<String> f;
        @f
        private List<String> g;
        @f
        private String h;
        
        static {
            j = new w.a.a(null);
        }
        
        public a() {
            this.b = "";
            this.c = "";
            this.e = -1;
            (this.f = new ArrayList<String>()).add("");
        }
        
        private final void C() {
            final List<String> f = this.f;
            if (f.remove(f.size() - 1).length() == 0 && (this.f.isEmpty() ^ true)) {
                final List<String> f2 = this.f;
                f2.set(f2.size() - 1, "");
            }
            else {
                this.f.add("");
            }
        }
        
        private final void E(String f, int n, final int n2, final boolean b, final boolean b2) {
            f = okhttp3.w.b.f(okhttp3.w.w, f, n, n2, " \"<>^`{}|/\\?#", b2, false, false, false, null, 240, null);
            if (this.y(f)) {
                return;
            }
            if (this.z(f)) {
                this.C();
                return;
            }
            final List<String> f2 = this.f;
            if (f2.get(f2.size() - 1).length() == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                final List<String> f3 = this.f;
                f3.set(f3.size() - 1, f);
            }
            else {
                this.f.add(f);
            }
            if (b) {
                this.f.add("");
            }
        }
        
        private final void H(final String s) {
            final List<String> g = this.g;
            k0.m((Object)g);
            final i s2 = kotlin.ranges.o.S0(kotlin.ranges.o.W(g.size() - 2, 0), 2);
            int k = s2.k();
            final int n = s2.n();
            final int o = s2.o();
            if (o >= 0) {
                if (k > n) {
                    return;
                }
            }
            else if (k < n) {
                return;
            }
            while (true) {
                final List<String> g2 = this.g;
                k0.m((Object)g2);
                if (k0.g((Object)s, (Object)g2.get(k))) {
                    final List<String> g3 = this.g;
                    k0.m((Object)g3);
                    g3.remove(k + 1);
                    final List<String> g4 = this.g;
                    k0.m((Object)g4);
                    g4.remove(k);
                    final List<String> g5 = this.g;
                    k0.m((Object)g5);
                    if (g5.isEmpty()) {
                        this.g = null;
                        return;
                    }
                }
                if (k == n) {
                    break;
                }
                k += o;
            }
        }
        
        private final void L(final String s, int i, final int n) {
            if (i == n) {
                return;
            }
            final char char1 = s.charAt(i);
            while (true) {
                Label_0134: {
                    if (char1 == '/' || char1 == '\\') {
                        this.f.clear();
                        this.f.add("");
                        break Label_0134;
                    }
                    final List<String> f = this.f;
                    f.set(f.size() - 1, "");
                    while (i < n) {
                        final int q = okhttp3.internal.d.q(s, "/\\", i, n);
                        final boolean b = q < n;
                        this.E(s, i, q, b, true);
                        i = q;
                        if (b) {
                            i = q;
                            break Label_0134;
                        }
                    }
                    return;
                }
                ++i;
                continue;
            }
        }
        
        private final w.a f(final String s, final boolean b) {
            int n = 0;
            int i;
            do {
                i = okhttp3.internal.d.q(s, "/\\", n, s.length());
                this.E(s, n, i, i < s.length(), b);
                n = ++i;
            } while (i <= s.length());
            return this;
        }
        
        private final int i() {
            int n = this.e;
            if (n == -1) {
                final b w = okhttp3.w.w;
                final String a = this.a;
                k0.m((Object)a);
                n = w.g(a);
            }
            return n;
        }
        
        private final boolean y(final String s) {
            final boolean g = k0.g((Object)s, (Object)".");
            boolean b = true;
            if (!g) {
                b = (s.K1(s, "%2e", true) && b);
            }
            return b;
        }
        
        private final boolean z(final String s) {
            final boolean g = k0.g((Object)s, (Object)"..");
            boolean b2;
            final boolean b = b2 = true;
            if (!g) {
                b2 = b;
                if (!s.K1(s, "%2e.", true)) {
                    b2 = b;
                    if (!s.K1(s, ".%2e", true)) {
                        b2 = (s.K1(s, "%2e%2e", true) && b);
                    }
                }
            }
            return b2;
        }
        
        @e
        public final w.a A(@f final w w, @e String str) {
            k0.p((Object)str, "input");
            int d = okhttp3.internal.d.D(str, 0, 0, 3, null);
            final int f = okhttp3.internal.d.F(str, d, 0, 2, null);
            final w.a.a j = okhttp3.w.a.j;
            final int c = j.g(str, d, f);
            final String s = "(this as java.lang.Strin\u2026ing(startIndex, endIndex)";
            if (c != -1) {
                if (kotlin.text.s.r2(str, "https:", d, true)) {
                    this.a = "https";
                    d += 6;
                }
                else {
                    if (!kotlin.text.s.r2(str, "http:", d, true)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Expected URL scheme 'http' or 'https' but was '");
                        str = str.substring(0, c);
                        k0.o((Object)str, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                        sb.append(str);
                        sb.append("'");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    this.a = "http";
                    d += 5;
                }
            }
            else {
                if (w == null) {
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                }
                this.a = w.X();
            }
            final int d2 = j.h(str, d, f);
            if (d2 < 2 && w != null && !(k0.g((Object)w.X(), (Object)this.a) ^ true)) {
                this.b = w.A();
                this.c = w.w();
                this.d = w.F();
                this.e = w.N();
                this.f.clear();
                this.f.addAll(w.y());
                if (d == f || str.charAt(d) == '#') {
                    this.m(w.z());
                }
            }
            else {
                int beginIndex = d + d2;
                int n = 0;
                int n2 = 0;
                final String s2 = s;
                int q;
                while (true) {
                    q = okhttp3.internal.d.q(str, "@/\\?#", beginIndex, f);
                    int char1;
                    if (q != f) {
                        char1 = str.charAt(q);
                    }
                    else {
                        char1 = -1;
                    }
                    if (char1 == -1 || char1 == 35 || char1 == 47 || char1 == 92 || char1 == 63) {
                        break;
                    }
                    if (char1 != 64) {
                        continue;
                    }
                    if (n == 0) {
                        final int p2 = okhttp3.internal.d.p(str, ':', beginIndex, q);
                        final b w2 = w.w;
                        String s3 = okhttp3.w.b.f(w2, str, beginIndex, p2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                        if (n2 != 0) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(this.b);
                            sb2.append("%40");
                            sb2.append(s3);
                            s3 = sb2.toString();
                        }
                        this.b = s3;
                        if (p2 != q) {
                            this.c = okhttp3.w.b.f(w2, str, p2 + 1, q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null);
                            n = 1;
                        }
                        n2 = 1;
                    }
                    else {
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append(this.c);
                        sb3.append("%40");
                        sb3.append(okhttp3.w.b.f(w.w, str, beginIndex, q, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 240, null));
                        this.c = sb3.toString();
                    }
                    beginIndex = q + 1;
                }
                final w.a.a i = okhttp3.w.a.j;
                final int b = i.f(str, beginIndex, q);
                final int beginIndex2 = b + 1;
                if (beginIndex2 < q) {
                    this.d = okhttp3.internal.a.e(okhttp3.w.b.n(w.w, str, beginIndex, b, false, 4, null));
                    if ((this.e = i.e(str, beginIndex2, q)) == -1) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("Invalid URL port: \"");
                        str = str.substring(beginIndex2, q);
                        k0.o((Object)str, s2);
                        sb4.append(str);
                        sb4.append('\"');
                        throw new IllegalArgumentException(sb4.toString().toString());
                    }
                }
                else {
                    final b w3 = w.w;
                    this.d = okhttp3.internal.a.e(okhttp3.w.b.n(w3, str, beginIndex, b, false, 4, null));
                    final String a = this.a;
                    k0.m((Object)a);
                    this.e = w3.g(a);
                }
                if (this.d == null) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append("Invalid URL host: \"");
                    str = str.substring(beginIndex, b);
                    k0.o((Object)str, s2);
                    sb5.append(str);
                    sb5.append('\"');
                    throw new IllegalArgumentException(sb5.toString().toString());
                }
                d = q;
            }
            final int q2 = okhttp3.internal.d.q(str, "?#", d, f);
            this.L(str, d, q2);
            int p3 = q2;
            if (q2 < f) {
                p3 = q2;
                if (str.charAt(q2) == '?') {
                    p3 = okhttp3.internal.d.p(str, '#', q2, f);
                    final b w4 = w.w;
                    this.g = w4.p(okhttp3.w.b.f(w4, str, q2 + 1, p3, " \"'<>#", true, false, true, false, null, 208, null));
                }
            }
            if (p3 < f && str.charAt(p3) == '#') {
                this.h = okhttp3.w.b.f(w.w, str, p3 + 1, f, "", true, false, false, true, null, 176, null);
            }
            return this;
        }
        
        @e
        public final w.a B(@e final String s) {
            k0.p((Object)s, "password");
            this.c = okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
        
        @e
        public final w.a D(final int n) {
            boolean b = true;
            Label_0022: {
                if (1 <= n) {
                    if (65535 >= n) {
                        break Label_0022;
                    }
                }
                b = false;
            }
            if (b) {
                this.e = n;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected port: ");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final w.a F(@f String f) {
            List<String> p = null;
            Label_0043: {
                if (f != null) {
                    final b w = okhttp3.w.w;
                    f = okhttp3.w.b.f(w, f, 0, 0, " \"'<>#", false, false, true, false, null, 219, null);
                    if (f != null) {
                        p = w.p(f);
                        break Label_0043;
                    }
                }
                p = null;
            }
            this.g = p;
            return this;
        }
        
        @e
        public final w.a G() {
            final String d = this.d;
            final String s = null;
            String j;
            if (d != null) {
                j = new kotlin.text.o("[\"<>^`{|}]").j(d, "");
            }
            else {
                j = null;
            }
            this.d = j;
            final int size = this.f.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final List<String> f = this.f;
                f.set(i, okhttp3.w.b.f(okhttp3.w.w, f.get(i), 0, 0, "[]", true, true, false, false, null, 227, null));
            }
            final List<String> g = this.g;
            if (g != null) {
                for (int size2 = g.size(), k = n; k < size2; ++k) {
                    final String s2 = g.get(k);
                    String f2;
                    if (s2 != null) {
                        f2 = okhttp3.w.b.f(okhttp3.w.w, s2, 0, 0, "\\^`{|}", true, true, true, false, null, 195, null);
                    }
                    else {
                        f2 = null;
                    }
                    g.set(k, f2);
                }
            }
            final String h = this.h;
            String f3 = s;
            if (h != null) {
                f3 = okhttp3.w.b.f(okhttp3.w.w, h, 0, 0, " \"#<>\\^`{|}", true, true, false, true, null, 163, null);
            }
            this.h = f3;
            return this;
        }
        
        @e
        public final w.a I(@e final String s) {
            k0.p((Object)s, "encodedName");
            if (this.g == null) {
                return this;
            }
            this.H(okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            return this;
        }
        
        @e
        public final w.a J(@e final String s) {
            k0.p((Object)s, "name");
            if (this.g == null) {
                return this;
            }
            this.H(okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            return this;
        }
        
        @e
        public final w.a K(final int n) {
            this.f.remove(n);
            if (this.f.isEmpty()) {
                this.f.add("");
            }
            return this;
        }
        
        @e
        public final w.a M(@e String s) {
            k0.p((Object)s, "scheme");
            final String s2 = "http";
            if (s.K1(s, "http", true)) {
                s = s2;
            }
            else {
                final String s3 = "https";
                if (!s.K1(s, "https", true)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unexpected scheme: ");
                    sb.append(s);
                    throw new IllegalArgumentException(sb.toString());
                }
                s = s3;
            }
            this.a = s;
            return this;
        }
        
        public final void N(@f final String h) {
            this.h = h;
        }
        
        public final void O(@e final String c) {
            k0.p((Object)c, "<set-?>");
            this.c = c;
        }
        
        @e
        public final w.a P(int n, @e final String str) {
            k0.p((Object)str, "encodedPathSegment");
            final String f = okhttp3.w.b.f(okhttp3.w.w, str, 0, 0, " \"<>^`{}|/\\?#", true, false, false, false, null, 243, null);
            this.f.set(n, f);
            if (!this.y(f) && !this.z(f)) {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected path segment: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public final void Q(@f final List<String> g) {
            this.g = g;
        }
        
        @e
        public final w.a R(@e final String s, @f final String s2) {
            k0.p((Object)s, "encodedName");
            this.I(s);
            this.c(s, s2);
            return this;
        }
        
        public final void S(@e final String b) {
            k0.p((Object)b, "<set-?>");
            this.b = b;
        }
        
        public final void T(@f final String d) {
            this.d = d;
        }
        
        @e
        public final w.a U(final int n, @e final String str) {
            k0.p((Object)str, "pathSegment");
            final String f = okhttp3.w.b.f(okhttp3.w.w, str, 0, 0, " \"<>^`{}|/\\?#", false, false, false, false, null, 251, null);
            if (!this.y(f) && !this.z(f)) {
                this.f.set(n, f);
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected path segment: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        public final void V(final int e) {
            this.e = e;
        }
        
        @e
        public final w.a W(@e final String s, @f final String s2) {
            k0.p((Object)s, "name");
            this.J(s);
            this.g(s, s2);
            return this;
        }
        
        public final void X(@f final String a) {
            this.a = a;
        }
        
        @e
        public final w.a Y(@e final String s) {
            k0.p((Object)s, "username");
            this.b = okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, null, 251, null);
            return this;
        }
        
        @e
        public final w.a a(@e final String s) {
            k0.p((Object)s, "encodedPathSegment");
            this.E(s, 0, s.length(), false, true);
            return this;
        }
        
        @e
        public final w.a b(@e final String s) {
            k0.p((Object)s, "encodedPathSegments");
            return this.f(s, true);
        }
        
        @e
        public final w.a c(@e String f, @f final String s) {
            k0.p((Object)f, "encodedName");
            if (this.g == null) {
                this.g = new ArrayList<String>();
            }
            final List<String> g = this.g;
            k0.m((Object)g);
            final b w = okhttp3.w.w;
            g.add(okhttp3.w.b.f(w, f, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null));
            final List<String> g2 = this.g;
            k0.m((Object)g2);
            if (s != null) {
                f = okhttp3.w.b.f(w, s, 0, 0, " \"'<>#&=", true, false, true, false, null, 211, null);
            }
            else {
                f = null;
            }
            g2.add(f);
            return this;
        }
        
        @e
        public final w.a d(@e final String s) {
            k0.p((Object)s, "pathSegment");
            this.E(s, 0, s.length(), false, false);
            return this;
        }
        
        @e
        public final w.a e(@e final String s) {
            k0.p((Object)s, "pathSegments");
            return this.f(s, false);
        }
        
        @e
        public final w.a g(@e String f, @f final String s) {
            k0.p((Object)f, "name");
            if (this.g == null) {
                this.g = new ArrayList<String>();
            }
            final List<String> g = this.g;
            k0.m((Object)g);
            final b w = okhttp3.w.w;
            g.add(okhttp3.w.b.f(w, f, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null));
            final List<String> g2 = this.g;
            k0.m((Object)g2);
            if (s != null) {
                f = okhttp3.w.b.f(w, s, 0, 0, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, false, null, 219, null);
            }
            else {
                f = null;
            }
            g2.add(f);
            return this;
        }
        
        @e
        public final w h() {
            final String a = this.a;
            if (a == null) {
                throw new IllegalStateException("scheme == null");
            }
            final b w = okhttp3.w.w;
            final String n = okhttp3.w.b.n(w, this.b, 0, 0, false, 7, null);
            final String n2 = okhttp3.w.b.n(w, this.c, 0, 0, false, 7, null);
            final String d = this.d;
            if (d != null) {
                final int i = this.i();
                final List<String> f = this.f;
                final ArrayList list = new ArrayList<String>(kotlin.collections.v.Y((Iterable)f, 10));
                final Iterator<Object> iterator = f.iterator();
                while (iterator.hasNext()) {
                    list.add(okhttp3.w.b.n(okhttp3.w.w, iterator.next(), 0, 0, false, 7, null));
                }
                final List<String> g = this.g;
                List<String> list3;
                if (g != null) {
                    final ArrayList list2 = new ArrayList<String>(kotlin.collections.v.Y((Iterable)g, 10));
                    final Iterator<Object> iterator2 = g.iterator();
                    while (true) {
                        list3 = (List<String>)list2;
                        if (!iterator2.hasNext()) {
                            break;
                        }
                        final String s = iterator2.next();
                        String n3;
                        if (s != null) {
                            n3 = okhttp3.w.b.n(okhttp3.w.w, s, 0, 0, true, 3, null);
                        }
                        else {
                            n3 = null;
                        }
                        list2.add(n3);
                    }
                }
                else {
                    list3 = null;
                }
                final String h = this.h;
                String n4;
                if (h != null) {
                    n4 = okhttp3.w.b.n(okhttp3.w.w, h, 0, 0, false, 7, null);
                }
                else {
                    n4 = null;
                }
                return new w(a, n, n2, d, i, (List<String>)list, list3, n4, this.toString());
            }
            throw new IllegalStateException("host == null");
        }
        
        @e
        public final w.a j(@f String f) {
            if (f != null) {
                f = okhttp3.w.b.f(okhttp3.w.w, f, 0, 0, "", true, false, false, true, null, 179, null);
            }
            else {
                f = null;
            }
            this.h = f;
            return this;
        }
        
        @e
        public final w.a k(@e final String s) {
            k0.p((Object)s, "encodedPassword");
            this.c = okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }
        
        @e
        public final w.a l(@e final String str) {
            k0.p((Object)str, "encodedPath");
            if (kotlin.text.s.u2(str, "/", false, 2, null)) {
                this.L(str, 0, str.length());
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected encodedPath: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final w.a m(@f String f) {
            List<String> p = null;
            Label_0043: {
                if (f != null) {
                    final b w = okhttp3.w.w;
                    f = okhttp3.w.b.f(w, f, 0, 0, " \"'<>#", true, false, true, false, null, 211, null);
                    if (f != null) {
                        p = w.p(f);
                        break Label_0043;
                    }
                }
                p = null;
            }
            this.g = p;
            return this;
        }
        
        @e
        public final w.a n(@e final String s) {
            k0.p((Object)s, "encodedUsername");
            this.b = okhttp3.w.b.f(okhttp3.w.w, s, 0, 0, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, null, 243, null);
            return this;
        }
        
        @e
        public final w.a o(@f String f) {
            if (f != null) {
                f = okhttp3.w.b.f(okhttp3.w.w, f, 0, 0, "", false, false, false, true, null, 187, null);
            }
            else {
                f = null;
            }
            this.h = f;
            return this;
        }
        
        @f
        public final String p() {
            return this.h;
        }
        
        @e
        public final String q() {
            return this.c;
        }
        
        @e
        public final List<String> r() {
            return this.f;
        }
        
        @f
        public final List<String> s() {
            return this.g;
        }
        
        @e
        public final String t() {
            return this.b;
        }
        
        @e
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            final String a = this.a;
            String str;
            if (a != null) {
                sb.append(a);
                str = "://";
            }
            else {
                str = "//";
            }
            sb.append(str);
            final int length = this.b.length();
            final int n = 1;
            if (length > 0 || this.c.length() > 0) {
                sb.append(this.b);
                int n2;
                if (this.c.length() > 0) {
                    n2 = n;
                }
                else {
                    n2 = 0;
                }
                if (n2 != 0) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            final String d = this.d;
            if (d != null) {
                k0.m((Object)d);
                if (kotlin.text.s.U2(d, ':', false, 2, null)) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                }
                else {
                    sb.append(this.d);
                }
            }
            Label_0268: {
                if (this.e != -1 || this.a != null) {
                    final int i = this.i();
                    final String a2 = this.a;
                    if (a2 != null) {
                        final b w = okhttp3.w.w;
                        k0.m((Object)a2);
                        if (i == w.g(a2)) {
                            break Label_0268;
                        }
                    }
                    sb.append(':');
                    sb.append(i);
                }
            }
            final b w2 = okhttp3.w.w;
            w2.o(this.f, sb);
            if (this.g != null) {
                sb.append('?');
                final List<String> g = this.g;
                k0.m((Object)g);
                w2.q(g, sb);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            final String string = sb.toString();
            k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
        
        @f
        public final String u() {
            return this.d;
        }
        
        public final int v() {
            return this.e;
        }
        
        @f
        public final String w() {
            return this.a;
        }
        
        @e
        public final w.a x(@e final String str) {
            k0.p((Object)str, "host");
            final String e = okhttp3.internal.a.e(okhttp3.w.b.n(okhttp3.w.w, str, 0, 0, false, 7, null));
            if (e != null) {
                this.d = e;
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("unexpected host: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001c\u0010\b\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002R\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f" }, d2 = { "okhttp3/w$a$a", "", "", "input", "", "pos", "limit", "g", "h", "f", "e", "INVALID_HOST", "Ljava/lang/String;", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
        public static final class a
        {
            private a() {
            }
            
            private final int e(final String s, int n, int int1) {
                final int n2 = -1;
                try {
                    int1 = Integer.parseInt(okhttp3.w.b.f(okhttp3.w.w, s, n, int1, "", false, false, false, false, null, 248, null));
                    if (1 > int1) {
                        n = n2;
                    }
                    else {
                        n = n2;
                        if (65535 >= int1) {
                            n = int1;
                        }
                    }
                    return n;
                }
                catch (NumberFormatException ex) {
                    n = n2;
                    return n;
                }
            }
            
            private final int f(final String s, int i, final int n) {
                while (i < n) {
                    final char char1 = s.charAt(i);
                    if (char1 == ':') {
                        return i;
                    }
                    int n2 = i;
                    int n3 = 0;
                    Label_0064: {
                        if (char1 != '[') {
                            n3 = i;
                        }
                        else {
                            do {
                                i = n2 + 1;
                                if ((n3 = i) >= n) {
                                    break Label_0064;
                                }
                                n2 = i;
                            } while (s.charAt(i) != ']');
                            n3 = i;
                        }
                    }
                    i = n3 + 1;
                }
                return n;
            }
            
            private final int g(final String s, int n, final int n2) {
                final int n3 = -1;
                if (n2 - n < 2) {
                    return -1;
                }
                final char char1 = s.charAt(n);
                int n5;
                while (true) {
                    Label_0042: {
                        if (k0.t((int)char1, 97) < 0) {
                            break Label_0042;
                        }
                        int n4 = n;
                        if (k0.t((int)char1, 122) > 0) {
                            break Label_0042;
                        }
                        while (true) {
                            n = n4 + 1;
                            n5 = n3;
                            if (n >= n2) {
                                return n5;
                            }
                            final char char2 = s.charAt(n);
                            Label_0184: {
                                if ('a' <= char2) {
                                    if ('z' >= char2) {
                                        break Label_0184;
                                    }
                                }
                                if ('A' <= char2) {
                                    if ('Z' >= char2) {
                                        break Label_0184;
                                    }
                                }
                                if ('0' <= char2) {
                                    if ('9' >= char2) {
                                        break Label_0184;
                                    }
                                }
                                if (char2 != '+') {
                                    if (char2 != '-') {
                                        if (char2 != '.') {
                                            n5 = n3;
                                            if (char2 == ':') {
                                                n5 = n;
                                                return n5;
                                            }
                                            return n5;
                                        }
                                    }
                                }
                            }
                            n4 = n;
                        }
                    }
                    n5 = n3;
                    if (k0.t((int)char1, 65) >= 0) {
                        final int n4 = n;
                        if (k0.t((int)char1, 90) <= 0) {
                            continue;
                        }
                        n5 = n3;
                    }
                    break;
                }
                return n5;
            }
            
            private final int h(final String s, int i, final int n) {
                int n2 = 0;
                while (i < n) {
                    final char char1 = s.charAt(i);
                    if (char1 != '\\' && char1 != '/') {
                        break;
                    }
                    ++n2;
                    ++i;
                }
                return n2;
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000f\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0019\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bD\u0010EJ,\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\f\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002JV\u0010\u0014\u001a\u00020\n*\u00020\u00022\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0003H\u0007J%\u0010\u001b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\n*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00172\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019H\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u001b\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001e*\u00020\u0003H\u0000¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\"\u001a\u00020!*\u00020\u0003H\u0007¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u0004\u0018\u00010!*\u00020\u0003H\u0007¢\u0006\u0004\b$\u0010#J\u0015\u0010&\u001a\u0004\u0018\u00010!*\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u0004\u0018\u00010!*\u00020(H\u0007¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b,\u0010#J\u0019\u0010-\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020\u0003H\u0007¢\u0006\u0004\b-\u0010#J\u0019\u0010.\u001a\u0004\u0018\u00010!2\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b.\u0010'J\u0019\u00100\u001a\u0004\u0018\u00010!2\u0006\u0010/\u001a\u00020(H\u0007¢\u0006\u0004\b0\u0010*J1\u00101\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b1\u00102Jc\u00103\u001a\u00020\u0003*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u00106R\u0016\u00108\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u00106R\u0016\u0010=\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u00106R\u0016\u0010>\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u00106R\u0016\u0010?\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u00106R\u0016\u0010@\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u00106R\u0016\u0010A\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u00106R\u0016\u0010B\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u00106R\u0016\u0010C\u001a\u00020\u00038\u0000@\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u00106¨\u0006F" }, d2 = { "okhttp3/w$b", "", "Lokio/m;", "", "encoded", "", "pos", "limit", "", "plusIsSpace", "Lkotlin/j2;", "s", "k", "input", "encodeSet", "alreadyEncoded", "strict", "unicodeAllowed", "Ljava/nio/charset/Charset;", "charset", "r", "scheme", "g", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "out", "o", "(Ljava/util/List;Ljava/lang/StringBuilder;)V", "q", "", "p", "(Ljava/lang/String;)Ljava/util/List;", "Lokhttp3/w;", "h", "(Ljava/lang/String;)Lokhttp3/w;", "l", "Ljava/net/URL;", "j", "(Ljava/net/URL;)Lokhttp3/w;", "Ljava/net/URI;", "i", "(Ljava/net/URI;)Lokhttp3/w;", "url", "a", "d", "c", "uri", "b", "m", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "e", "(Ljava/lang/String;IILjava/lang/String;ZZZZLjava/nio/charset/Charset;)Ljava/lang/String;", "FORM_ENCODE_SET", "Ljava/lang/String;", "FRAGMENT_ENCODE_SET", "FRAGMENT_ENCODE_SET_URI", "", "HEX_DIGITS", "[C", "PASSWORD_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET", "PATH_SEGMENT_ENCODE_SET_URI", "QUERY_COMPONENT_ENCODE_SET", "QUERY_COMPONENT_ENCODE_SET_URI", "QUERY_COMPONENT_REENCODE_SET", "QUERY_ENCODE_SET", "USERNAME_ENCODE_SET", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        public static /* synthetic */ String f(final b b, final String s, int n, int length, final String s2, boolean b2, boolean b3, boolean b4, boolean b5, Charset charset, final int n2, final Object o) {
            if ((n2 & 0x1) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x2) != 0x0) {
                length = s.length();
            }
            if ((n2 & 0x8) != 0x0) {
                b2 = false;
            }
            if ((n2 & 0x10) != 0x0) {
                b3 = false;
            }
            if ((n2 & 0x20) != 0x0) {
                b4 = false;
            }
            if ((n2 & 0x40) != 0x0) {
                b5 = false;
            }
            if ((n2 & 0x80) != 0x0) {
                charset = null;
            }
            return b.e(s, n, length, s2, b2, b3, b4, b5, charset);
        }
        
        private final boolean k(final String s, final int index, final int n) {
            final int index2 = index + 2;
            boolean b = true;
            if (index2 >= n || s.charAt(index) != '%' || okhttp3.internal.d.N(s.charAt(index + 1)) == -1 || okhttp3.internal.d.N(s.charAt(index2)) == -1) {
                b = false;
            }
            return b;
        }
        
        public static /* synthetic */ String n(final b b, final String s, int n, int length, boolean b2, final int n2, final Object o) {
            if ((n2 & 0x1) != 0x0) {
                n = 0;
            }
            if ((n2 & 0x2) != 0x0) {
                length = s.length();
            }
            if ((n2 & 0x4) != 0x0) {
                b2 = false;
            }
            return b.m(s, n, length, b2);
        }
        
        private final void r(final m m, final String obj, int i, final int n, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, final Charset charset) {
            m j = null;
            while (i < n) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                final int codePoint = obj.codePointAt(i);
                Label_0313: {
                    if (!b || (codePoint != 9 && codePoint != 10 && codePoint != 12 && codePoint != 13)) {
                        if (codePoint == 43 && b3) {
                            String s2;
                            if (b) {
                                s2 = "+";
                            }
                            else {
                                s2 = "%2B";
                            }
                            m.p1(s2);
                        }
                        else {
                            Label_0185: {
                                if (codePoint >= 32 && codePoint != 127 && (codePoint < 128 || b4)) {
                                    Label_0182: {
                                        if (!s.U2(s, (char)codePoint, false, 2, null)) {
                                            if (codePoint == 37) {
                                                if (!b) {
                                                    break Label_0182;
                                                }
                                                if (b2 && !this.k(obj, i, n)) {
                                                    break Label_0185;
                                                }
                                            }
                                            m.v1(codePoint);
                                            break Label_0313;
                                        }
                                    }
                                }
                            }
                            m k;
                            if ((k = j) == null) {
                                k = new m();
                            }
                            if (charset != null && !k0.g((Object)charset, (Object)StandardCharsets.UTF_8)) {
                                k.d1(obj, i, Character.charCount(codePoint) + i, charset);
                            }
                            else {
                                k.v1(codePoint);
                            }
                            while (true) {
                                j = k;
                                if (k.D1()) {
                                    break;
                                }
                                final int n2 = k.readByte() & 0xFF;
                                m.G0(37);
                                m.G0(okhttp3.w.t()[n2 >> 4 & 0xF]);
                                m.G0(okhttp3.w.t()[n2 & 0xF]);
                            }
                        }
                    }
                }
                i += Character.charCount(codePoint);
            }
        }
        
        private final void s(final m m, final String obj, int i, final int n, final boolean b) {
            while (i < n) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                final int codePoint = obj.codePointAt(i);
                Label_0123: {
                    if (codePoint == 37) {
                        final int index = i + 2;
                        if (index < n) {
                            final int n2 = okhttp3.internal.d.N(obj.charAt(i + 1));
                            final int n3 = okhttp3.internal.d.N(obj.charAt(index));
                            if (n2 != -1 && n3 != -1) {
                                m.G0((n2 << 4) + n3);
                                i = Character.charCount(codePoint) + index;
                                continue;
                            }
                            break Label_0123;
                        }
                    }
                    if (codePoint == 43 && b) {
                        m.G0(32);
                        ++i;
                        continue;
                    }
                }
                m.v1(codePoint);
                i += Character.charCount(codePoint);
            }
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "url.toHttpUrl()", imports = { "okhttp3.HttpUrl.Companion.toHttpUrl" }))
        @g(name = "-deprecated_get")
        @e
        public final w a(@e final String s) {
            k0.p((Object)s, "url");
            return this.h(s);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "uri.toHttpUrlOrNull()", imports = { "okhttp3.HttpUrl.Companion.toHttpUrlOrNull" }))
        @g(name = "-deprecated_get")
        @f
        public final w b(@e final URI uri) {
            k0.p((Object)uri, "uri");
            return this.i(uri);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "url.toHttpUrlOrNull()", imports = { "okhttp3.HttpUrl.Companion.toHttpUrlOrNull" }))
        @g(name = "-deprecated_get")
        @f
        public final w c(@e final URL url) {
            k0.p((Object)url, "url");
            return this.j(url);
        }
        
        @kotlin.i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "url.toHttpUrlOrNull()", imports = { "okhttp3.HttpUrl.Companion.toHttpUrlOrNull" }))
        @g(name = "-deprecated_parse")
        @f
        public final w d(@e final String s) {
            k0.p((Object)s, "url");
            return this.l(s);
        }
        
        @e
        public final String e(@e String substring, final int beginIndex, final int endIndex, @e final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, @f final Charset charset) {
            k0.p((Object)substring, "$this$canonicalize");
            k0.p((Object)s, "encodeSet");
            int codePoint;
            for (int i = beginIndex; i < endIndex; i += Character.charCount(codePoint)) {
                codePoint = substring.codePointAt(i);
                if (codePoint < 32 || codePoint == 127 || (codePoint >= 128 && !b4) || s.U2(s, (char)codePoint, false, 2, null) || (codePoint == 37 && (!b || (b2 && !this.k(substring, i, endIndex)))) || (codePoint == 43 && b3)) {
                    final m m = new m();
                    m.t1(substring, beginIndex, i);
                    this.r(m, substring, i, endIndex, s, b, b2, b3, b4, charset);
                    return m.y4();
                }
            }
            substring = substring.substring(beginIndex, endIndex);
            k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return substring;
        }
        
        @k
        public final int g(@e final String s) {
            k0.p((Object)s, "scheme");
            final int hashCode = s.hashCode();
            if (hashCode != 3213448) {
                if (hashCode == 99617003) {
                    if (s.equals("https")) {
                        return 443;
                    }
                }
            }
            else if (s.equals("http")) {
                return 80;
            }
            return -1;
        }
        
        @k
        @g(name = "get")
        @e
        public final w h(@e final String s) {
            k0.p((Object)s, "$this$toHttpUrl");
            return new w.a().A(null, s).h();
        }
        
        @k
        @g(name = "get")
        @f
        public final w i(@e final URI uri) {
            k0.p((Object)uri, "$this$toHttpUrlOrNull");
            final String string = uri.toString();
            k0.o((Object)string, "toString()");
            return this.l(string);
        }
        
        @k
        @g(name = "get")
        @f
        public final w j(@e final URL url) {
            k0.p((Object)url, "$this$toHttpUrlOrNull");
            final String string = url.toString();
            k0.o((Object)string, "toString()");
            return this.l(string);
        }
        
        @k
        @g(name = "parse")
        @f
        public final w l(@e final String s) {
            k0.p((Object)s, "$this$toHttpUrlOrNull");
            w h;
            try {
                h = this.h(s);
            }
            catch (IllegalArgumentException ex) {
                h = null;
            }
            return h;
        }
        
        @e
        public final String m(@e String substring, final int beginIndex, final int endIndex, final boolean b) {
            k0.p((Object)substring, "$this$percentDecode");
            for (int i = beginIndex; i < endIndex; ++i) {
                final char char1 = substring.charAt(i);
                if (char1 == '%' || (char1 == '+' && b)) {
                    final m m = new m();
                    m.t1(substring, beginIndex, i);
                    this.s(m, substring, i, endIndex, b);
                    return m.y4();
                }
            }
            substring = substring.substring(beginIndex, endIndex);
            k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            return substring;
        }
        
        public final void o(@e final List<String> list, @e final StringBuilder sb) {
            k0.p((Object)list, "$this$toPathString");
            k0.p((Object)sb, "out");
            for (int size = list.size(), i = 0; i < size; ++i) {
                sb.append('/');
                sb.append(list.get(i));
            }
        }
        
        @e
        public final List<String> p(@e final String s) {
            k0.p((Object)s, "$this$toQueryNamesAndValues");
            final ArrayList<String> list = new ArrayList<String>();
            int n;
            for (int i = 0; i <= s.length(); i = n + 1) {
                if ((n = s.q3(s, '&', i, false, 4, null)) == -1) {
                    n = s.length();
                }
                final int q3 = s.q3(s, '=', i, false, 4, null);
                String substring2;
                if (q3 != -1 && q3 <= n) {
                    final String substring = s.substring(i, q3);
                    k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    list.add(substring);
                    substring2 = s.substring(q3 + 1, n);
                    k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                }
                else {
                    final String substring3 = s.substring(i, n);
                    k0.o((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    list.add(substring3);
                    substring2 = null;
                }
                list.add(substring2);
            }
            return list;
        }
        
        public final void q(@e final List<String> list, @e final StringBuilder sb) {
            k0.p((Object)list, "$this$toQueryString");
            k0.p((Object)sb, "out");
            final i s0 = kotlin.ranges.o.S0((i)kotlin.ranges.o.n1(0, list.size()), 2);
            int k = s0.k();
            final int n = s0.n();
            final int o = s0.o();
            if (o >= 0) {
                if (k > n) {
                    return;
                }
            }
            else if (k < n) {
                return;
            }
            while (true) {
                final String str = list.get(k);
                final String str2 = list.get(k + 1);
                if (k > 0) {
                    sb.append('&');
                }
                sb.append(str);
                if (str2 != null) {
                    sb.append('=');
                    sb.append(str2);
                }
                if (k == n) {
                    break;
                }
                k += o;
            }
        }
    }
}
