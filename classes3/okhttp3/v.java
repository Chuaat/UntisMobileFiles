// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3;

import okhttp3.internal.d;
import kotlin.ranges.o;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Locale;
import java.util.TreeMap;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import kotlin.text.s;
import kotlin.jvm.internal.p1;
import java.util.Set;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import java.time.Instant;
import kotlin.n1;
import java.util.Iterator;
import okhttp3.internal.http.c;
import java.util.Date;
import kotlin.jvm.internal.k0;
import java.util.Arrays;
import org.jetbrains.annotations.f;
import kotlin.z0;
import kotlin.i;
import m6.g;
import m6.k;
import org.jetbrains.annotations.e;
import java.util.Map;
import kotlin.jvm.internal.w;
import kotlin.Metadata;
import o6.a;
import kotlin.s0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\u0018\u0000 )2\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0002*\u000bB\u0017\b\u0002\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#¢\u0006\u0004\b'\u0010(J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0004\u001a\u00020\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nJ\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010J\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0015\u001a\u00020\u0014J\u001b\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00020\u0016H\u0096\u0002J\u0006\u0010\u0019\u001a\u00020\u0018J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00120 R\u0013\u0010\"\u001a\u00020\n8G@\u0006¢\u0006\u0006\u001a\u0004\b\"\u0010\fR\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006+" }, d2 = { "Lokhttp3/v;", "", "Lkotlin/s0;", "", "name", "h", "Ljava/util/Date;", "i", "Ljava/time/Instant;", "k", "", "b", "()I", "index", "n", "v", "", "o", "", "w", "", "f", "", "iterator", "Lokhttp3/v$a;", "p", "", "other", "", "equals", "hashCode", "toString", "", "t", "size", "", "G", "[Ljava/lang/String;", "namesAndValues", "<init>", "([Ljava/lang/String;)V", "H", "a", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class v implements Iterable<s0<? extends String, ? extends String>>, o6.a
{
    public static final b H;
    private final String[] G;
    
    static {
        H = new b(null);
    }
    
    private v(final String[] g) {
        this.G = g;
    }
    
    @k
    @g(name = "of")
    @e
    public static final v q(@e final Map<String, String> map) {
        return v.H.i(map);
    }
    
    @k
    @g(name = "of")
    @e
    public static final v r(@e final String... array) {
        return v.H.j(array);
    }
    
    @i(level = kotlin.k.H, message = "moved to val", replaceWith = @z0(expression = "size", imports = {}))
    @g(name = "-deprecated_size")
    public final int b() {
        return this.size();
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof v && Arrays.equals(this.G, ((v)o).G);
    }
    
    public final long f() {
        final String[] g = this.G;
        long n = g.length * 2;
        for (int length = g.length, i = 0; i < length; ++i) {
            n += this.G[i].length();
        }
        return n;
    }
    
    @f
    public final String h(@e final String s) {
        k0.p((Object)s, "name");
        return v.H.h(this.G, s);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.G);
    }
    
    @f
    public final Date i(@e String h) {
        k0.p((Object)h, "name");
        h = this.h(h);
        Date a;
        if (h != null) {
            a = c.a(h);
        }
        else {
            a = null;
        }
        return a;
    }
    
    @e
    @Override
    public Iterator<s0<String, String>> iterator() {
        final int size = this.size();
        final s0[] array = new s0[size];
        for (int i = 0; i < size; ++i) {
            array[i] = n1.a((Object)this.n(i), (Object)this.v(i));
        }
        return (Iterator<s0<String, String>>)kotlin.jvm.internal.i.a((Object[])array);
    }
    
    @IgnoreJRERequirement
    @f
    public final Instant k(@e final String s) {
        k0.p((Object)s, "name");
        final Date i = this.i(s);
        Instant instant;
        if (i != null) {
            instant = i.toInstant();
        }
        else {
            instant = null;
        }
        return instant;
    }
    
    @e
    public final String n(final int n) {
        return this.G[n * 2];
    }
    
    @e
    public final Set<String> o() {
        final TreeSet<String> s = new TreeSet<String>(kotlin.text.s.S1(p1.a));
        for (int size = this.size(), i = 0; i < size; ++i) {
            s.add(this.n(i));
        }
        final Set<Object> unmodifiableSet = Collections.unmodifiableSet((Set<?>)s);
        k0.o((Object)unmodifiableSet, "Collections.unmodifiableSet(result)");
        return (Set<String>)unmodifiableSet;
    }
    
    @e
    public final a p() {
        final a a = new a();
        kotlin.collections.v.s0((Collection)a.k(), (Object[])this.G);
        return a;
    }
    
    @g(name = "size")
    public final int size() {
        return this.G.length / 2;
    }
    
    @e
    public final Map<String, List<String>> t() {
        final TreeMap<String, List<String>> treeMap = new TreeMap<String, List<String>>(s.S1(p1.a));
        for (int size = this.size(), i = 0; i < size; ++i) {
            final String n = this.n(i);
            final Locale us = Locale.US;
            k0.o((Object)us, "Locale.US");
            Objects.requireNonNull(n, "null cannot be cast to non-null type java.lang.String");
            final String lowerCase = n.toLowerCase(us);
            k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            List<String> list;
            if ((list = treeMap.get(lowerCase)) == null) {
                list = new ArrayList<String>(2);
                treeMap.put(lowerCase, list);
            }
            list.add(this.v(i));
        }
        return treeMap;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        for (int size = this.size(), i = 0; i < size; ++i) {
            sb.append(this.n(i));
            sb.append(": ");
            sb.append(this.v(i));
            sb.append("\n");
        }
        final String string = sb.toString();
        k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
    
    @e
    public final String v(final int n) {
        return this.G[n * 2 + 1];
    }
    
    @e
    public final List<String> w(@e final String s) {
        k0.p((Object)s, "name");
        final int size = this.size();
        List<? extends String> list = null;
        List<? extends String> list2;
        for (int i = 0; i < size; ++i, list = list2) {
            list2 = list;
            if (s.K1(s, this.n(i), true)) {
                if ((list2 = list) == null) {
                    list2 = new ArrayList<String>(2);
                }
                list2.add(this.v(i));
            }
        }
        List<Object> list3;
        if (list != null) {
            list3 = Collections.unmodifiableList((List<?>)list);
            k0.o((Object)list3, "Collections.unmodifiableList(result)");
        }
        else {
            list3 = (List<Object>)kotlin.collections.v.E();
        }
        return (List<String>)list3;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fJ\u0018\u0010\u0012\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011H\u0007J\u0019\u0010\u0013\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u000fH\u0086\u0002J\u0019\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0011H\u0087\u0002J\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u000e\u0010\u0017\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002J\u0019\u0010\u0018\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\u0002J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0086\u0002J\u0006\u0010\u001a\u001a\u00020\fR\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b8\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\"" }, d2 = { "okhttp3/v$a", "", "", "line", "Lokhttp3/v$a;", "f", "(Ljava/lang/String;)Lokhttp3/v$a;", "a", "name", "value", "b", "h", "Lokhttp3/v;", "headers", "e", "Ljava/util/Date;", "d", "Ljava/time/Instant;", "c", "o", "n", "g", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/v$a;", "l", "m", "j", "i", "", "Ljava/util/List;", "k", "()Ljava/util/List;", "namesAndValues", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        @e
        private final List<String> a;
        
        public a() {
            this.a = new ArrayList<String>(20);
        }
        
        @e
        public final a a(@e String substring) {
            k0.p((Object)substring, "line");
            final int q3 = s.q3(substring, ':', 0, false, 6, null);
            if (q3 != -1) {
                final String substring2 = substring.substring(0, q3);
                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                Objects.requireNonNull(substring2, "null cannot be cast to non-null type kotlin.CharSequence");
                final String string = s.B5(substring2).toString();
                substring = substring.substring(q3 + 1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                this.b(string, substring);
                return this;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unexpected header: ");
            sb.append(substring);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        
        @e
        public final a b(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            final b h = v.H;
            h.f(s);
            h.g(s2, s);
            this.g(s, s2);
            return this;
        }
        
        @IgnoreJRERequirement
        @e
        public final a c(@e final String s, @e final Instant instant) {
            k0.p((Object)s, "name");
            k0.p((Object)instant, "value");
            this.d(s, new Date(instant.toEpochMilli()));
            return this;
        }
        
        @e
        public final a d(@e final String s, @e final Date date) {
            k0.p((Object)s, "name");
            k0.p((Object)date, "value");
            this.b(s, c.b(date));
            return this;
        }
        
        @e
        public final a e(@e final v v) {
            k0.p((Object)v, "headers");
            for (int size = v.size(), i = 0; i < size; ++i) {
                this.g(v.n(i), v.v(i));
            }
            return this;
        }
        
        @e
        public final a f(@e String substring) {
            k0.p((Object)substring, "line");
            final int q3 = s.q3(substring, ':', 1, false, 4, null);
            if (q3 != -1) {
                final String substring2 = substring.substring(0, q3);
                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                substring = substring.substring(q3 + 1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                this.g(substring2, substring);
            }
            else {
                String substring3 = substring;
                if (substring.charAt(0) == ':') {
                    substring3 = substring.substring(1);
                    k0.o((Object)substring3, "(this as java.lang.String).substring(startIndex)");
                }
                this.g("", substring3);
            }
            return this;
        }
        
        @e
        public final a g(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            this.a.add(s);
            this.a.add(s.B5(s2).toString());
            return this;
        }
        
        @e
        public final a h(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            v.H.f(s);
            this.g(s, s2);
            return this;
        }
        
        @e
        public final v i() {
            final String[] array = this.a.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            return new v(array, null);
        }
        
        @f
        public final String j(@e final String s) {
            k0.p((Object)s, "name");
            final kotlin.ranges.i s2 = o.S0(o.W(this.a.size() - 2, 0), 2);
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
            while (!s.K1(s, this.a.get(k), true)) {
                if (k == n) {
                    return null;
                }
                k += o;
            }
            return this.a.get(k + 1);
        }
        
        @e
        public final List<String> k() {
            return this.a;
        }
        
        @e
        public final a l(@e final String s) {
            k0.p((Object)s, "name");
            int n;
            for (int i = 0; i < this.a.size(); i = n + 2) {
                n = i;
                if (s.K1(s, this.a.get(i), true)) {
                    this.a.remove(i);
                    this.a.remove(i);
                    n = i - 2;
                }
            }
            return this;
        }
        
        @e
        public final a m(@e final String s, @e final String s2) {
            k0.p((Object)s, "name");
            k0.p((Object)s2, "value");
            final b h = v.H;
            h.f(s);
            h.g(s2, s);
            this.l(s);
            this.g(s, s2);
            return this;
        }
        
        @IgnoreJRERequirement
        @e
        public final a n(@e final String s, @e final Instant instant) {
            k0.p((Object)s, "name");
            k0.p((Object)instant, "value");
            return this.o(s, new Date(instant.toEpochMilli()));
        }
        
        @e
        public final a o(@e final String s, @e final Date date) {
            k0.p((Object)s, "name");
            k0.p((Object)date, "value");
            this.m(s, c.b(date));
            return this;
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J#\u0010\r\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u000f\u001a\u00020\f2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003H\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0012¨\u0006\u0017" }, d2 = { "okhttp3/v$b", "", "", "", "namesAndValues", "name", "h", "([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lkotlin/j2;", "f", "value", "g", "Lokhttp3/v;", "j", "([Ljava/lang/String;)Lokhttp3/v;", "b", "", "i", "(Ljava/util/Map;)Lokhttp3/v;", "headers", "a", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class b
    {
        private b() {
        }
        
        private final void f(final String s) {
            if (s.length() > 0) {
                for (int length = s.length(), i = 0; i < length; ++i) {
                    final char char1 = s.charAt(i);
                    boolean b = false;
                    Label_0065: {
                        if ('!' <= char1) {
                            if ('~' >= char1) {
                                b = true;
                                break Label_0065;
                            }
                        }
                        b = false;
                    }
                    if (!b) {
                        throw new IllegalArgumentException(d.v("Unexpected char %#04x at %d in header name: %s", (int)char1, i, s).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }
        
        private final void g(final String s, final String s2) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                final char char1 = s.charAt(i);
                boolean b = false;
                Label_0058: {
                    Label_0055: {
                        if (char1 != '\t') {
                            if (' ' <= char1) {
                                if ('~' >= char1) {
                                    break Label_0055;
                                }
                            }
                            b = false;
                            break Label_0058;
                        }
                    }
                    b = true;
                }
                if (!b) {
                    throw new IllegalArgumentException(d.v("Unexpected char %#04x at %d in %s value: %s", (int)char1, i, s2, s).toString());
                }
            }
        }
        
        private final String h(final String[] array, final String s) {
            final kotlin.ranges.i s2 = o.S0(o.W(array.length - 2, 0), 2);
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
            while (!s.K1(s, array[k], true)) {
                if (k == n) {
                    return null;
                }
                k += o;
            }
            return array[k + 1];
        }
        
        @i(level = kotlin.k.H, message = "function moved to extension", replaceWith = @z0(expression = "headers.toHeaders()", imports = {}))
        @g(name = "-deprecated_of")
        @e
        public final v a(@e final Map<String, String> map) {
            k0.p((Object)map, "headers");
            return this.i(map);
        }
        
        @i(level = kotlin.k.H, message = "function name changed", replaceWith = @z0(expression = "headersOf(*namesAndValues)", imports = {}))
        @g(name = "-deprecated_of")
        @e
        public final v b(@e final String... original) {
            k0.p((Object)original, "namesAndValues");
            return this.j((String[])Arrays.copyOf(original, original.length));
        }
        
        @k
        @g(name = "of")
        @e
        public final v i(@e final Map<String, String> map) {
            k0.p((Object)map, "$this$toHeaders");
            final String[] array = new String[map.size() * 2];
            final Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final Map.Entry<String, String> entry = iterator.next();
                final String obj = entry.getKey();
                final String obj2 = entry.getValue();
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                final String string = s.B5(obj).toString();
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                final String string2 = s.B5(obj2).toString();
                this.f(string);
                this.g(string2, string);
                array[n] = string;
                array[n + 1] = string2;
                n += 2;
            }
            return new v(array, null);
        }
        
        @k
        @g(name = "of")
        @e
        public final v j(@e String... array) {
            k0.p((Object)array, "namesAndValues");
            if (array.length % 2 == 0) {
                final String[] clone = array.clone();
                Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                array = clone;
                for (int length = array.length, i = 0; i < length; ++i) {
                    if (array[i] == null) {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                    final String obj = array[i];
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
                    array[i] = s.B5(obj).toString();
                }
                final kotlin.ranges.i s0 = o.S0((kotlin.ranges.i)o.n1(0, array.length), 2);
                int k = s0.k();
                final int n = s0.n();
                final int o = s0.o();
                if (o >= 0) {
                    if (k > n) {
                        return new v(array, null);
                    }
                }
                else if (k < n) {
                    return new v(array, null);
                }
                while (true) {
                    final String s2 = array[k];
                    final String s3 = array[k + 1];
                    this.f(s2);
                    this.g(s3, s2);
                    if (k == n) {
                        break;
                    }
                    k += o;
                }
                return new v(array, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }
    }
}
