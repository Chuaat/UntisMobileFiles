// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import java.util.regex.Matcher;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Locale;
import kotlin.text.s;
import kotlin.ranges.o;
import kotlin.collections.m;
import kotlin.jvm.internal.k0;
import m6.h;
import kotlin.z0;
import kotlin.i;
import org.jetbrains.annotations.f;
import m6.g;
import m6.k;
import java.nio.charset.Charset;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import java.util.regex.Pattern;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\n\u0018\u0000 \u00072\u00020\u0001:\u0001\nB/\b\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0019\u0010\u0013\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0019\u0010\u001b\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\t¨\u0006\u001e" }, d2 = { "Lokhttp3/y;", "", "Ljava/nio/charset/Charset;", "defaultValue", "f", "", "name", "i", "b", "()Ljava/lang/String;", "a", "toString", "other", "", "equals", "", "hashCode", "Ljava/lang/String;", "l", "type", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "mediaType", "c", "k", "subtype", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class y
{
    private static final String e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final String f = "\"([^\"]*)\"";
    private static final Pattern g;
    private static final Pattern h;
    public static final a i;
    private final String a;
    @e
    private final String b;
    @e
    private final String c;
    private final String[] d;
    
    static {
        i = new a(null);
        g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }
    
    private y(final String a, final String b, final String c, final String[] d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final /* synthetic */ Pattern c() {
        return y.h;
    }
    
    public static final /* synthetic */ Pattern d() {
        return y.g;
    }
    
    public static /* synthetic */ Charset g(final y y, Charset charset, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            charset = null;
        }
        return y.f(charset);
    }
    
    @k
    @g(name = "get")
    @e
    public static final y h(@e final String s) {
        return y.i.c(s);
    }
    
    @k
    @g(name = "parse")
    @f
    public static final y j(@e final String s) {
        return y.i.d(s);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "subtype", imports = {}))
    @g(name = "-deprecated_subtype")
    @e
    public final String a() {
        return this.c;
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "type", imports = {}))
    @g(name = "-deprecated_type")
    @e
    public final String b() {
        return this.b;
    }
    
    @h
    @f
    public final Charset e() {
        return g(this, null, 1, null);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof y && k0.g((Object)((y)o).a, (Object)this.a);
    }
    
    @h
    @f
    public final Charset f(@f final Charset charset) {
        final String i = this.i("charset");
        Charset forName = charset;
        if (i == null) {
            return forName;
        }
        try {
            forName = Charset.forName(i);
            return forName;
        }
        catch (IllegalArgumentException ex) {
            forName = charset;
            return forName;
        }
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @f
    public final String i(@e final String s) {
        k0.p((Object)s, "name");
        final kotlin.ranges.i s2 = o.S0((kotlin.ranges.i)m.Kd((Object[])this.d), 2);
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
        while (!s.K1(this.d[k], s, true)) {
            if (k == n) {
                return null;
            }
            k += o;
        }
        return this.d[k + 1];
    }
    
    @g(name = "subtype")
    @e
    public final String k() {
        return this.c;
    }
    
    @g(name = "type")
    @e
    public final String l() {
        return this.b;
    }
    
    @e
    @Override
    public String toString() {
        return this.a;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005R\u001e\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001e\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014" }, d2 = { "okhttp3/y$a", "", "", "Lokhttp3/y;", "c", "(Ljava/lang/String;)Lokhttp3/y;", "d", "mediaType", "a", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
        
        @i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "mediaType.toMediaType()", imports = { "okhttp3.MediaType.Companion.toMediaType" }))
        @g(name = "-deprecated_get")
        @e
        public final y a(@e final String s) {
            k0.p((Object)s, "mediaType");
            return this.c(s);
        }
        
        @i(level = kotlin.k.H, message = "moved to extension function", replaceWith = @z0(expression = "mediaType.toMediaTypeOrNull()", imports = { "okhttp3.MediaType.Companion.toMediaTypeOrNull" }))
        @g(name = "-deprecated_parse")
        @f
        public final y b(@e final String s) {
            k0.p((Object)s, "mediaType");
            return this.d(s);
        }
        
        @k
        @g(name = "get")
        @e
        public final y c(@e final String s) {
            k0.p((Object)s, "$this$toMediaType");
            final Matcher matcher = y.d().matcher(s);
            if (matcher.lookingAt()) {
                final String group = matcher.group(1);
                k0.o((Object)group, "typeSubtype.group(1)");
                final Locale us = Locale.US;
                k0.o((Object)us, "Locale.US");
                Objects.requireNonNull(group, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = group.toLowerCase(us);
                k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                final String group2 = matcher.group(2);
                k0.o((Object)group2, "typeSubtype.group(2)");
                k0.o((Object)us, "Locale.US");
                Objects.requireNonNull(group2, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase2 = group2.toLowerCase(us);
                k0.o((Object)lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
                final ArrayList<String> list = new ArrayList<String>();
                final Matcher matcher2 = y.c().matcher(s);
                for (int i = matcher.end(); i < s.length(); i = matcher2.end()) {
                    matcher2.region(i, s.length());
                    if (!matcher2.lookingAt()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Parameter is not formatted correctly: \"");
                        final String substring = s.substring(i);
                        k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                        sb.append(substring);
                        sb.append("\" for: \"");
                        sb.append(s);
                        sb.append('\"');
                        throw new IllegalArgumentException(sb.toString().toString());
                    }
                    final String group3 = matcher2.group(1);
                    if (group3 != null) {
                        final String group4 = matcher2.group(2);
                        String s2;
                        if (group4 == null) {
                            s2 = matcher2.group(3);
                        }
                        else {
                            s2 = group4;
                            if (s.u2(group4, "'", false, 2, null)) {
                                s2 = group4;
                                if (s.J1(group4, "'", false, 2, null)) {
                                    s2 = group4;
                                    if (group4.length() > 2) {
                                        s2 = group4.substring(1, group4.length() - 1);
                                        k0.o((Object)s2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                                    }
                                }
                            }
                        }
                        list.add(group3);
                        list.add(s2);
                    }
                }
                final String[] array = list.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                return new y(s, lowerCase, lowerCase2, array, null);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No subtype found for: \"");
            sb2.append(s);
            sb2.append('\"');
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        
        @k
        @g(name = "parse")
        @f
        public final y d(@e final String s) {
            k0.p((Object)s, "$this$toMediaTypeOrNull");
            y c;
            try {
                c = this.c(s);
            }
            catch (IllegalArgumentException ex) {
                c = null;
            }
            return c;
        }
    }
}
