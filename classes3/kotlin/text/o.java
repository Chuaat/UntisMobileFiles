// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.ArrayList;
import java.util.Collections;
import kotlin.collections.v;
import java.util.EnumSet;
import n6.l;
import kotlin.jvm.internal.m0;
import n6.a;
import org.jetbrains.annotations.f;
import java.util.regex.Matcher;
import java.util.List;
import kotlin.y0;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import java.util.regex.Pattern;
import java.util.Set;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import java.io.Serializable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 22\u00060\u0001j\u0002`\u0002:\u0002\t\rB\u0011\b\u0001\u0012\u0006\u0010+\u001a\u00020\u001c¢\u0006\u0004\b,\u0010-B\u0011\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b,\u0010.B\u0019\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0011\u0012\u0006\u0010/\u001a\u00020\u001f¢\u0006\u0004\b,\u00100B\u001f\b\u0016\u0012\u0006\u0010(\u001a\u00020\u0011\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b,\u00101J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0004J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\"\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u0014J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0011J\u001e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u00192\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\nJ\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0006\u0010\u001d\u001a\u00020\u001cR\u0019\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8F@\u0006¢\u0006\u0006\u001a\u0004\b \u0010!R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0013\u0010(\u001a\u00020\u00118F@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00063" }, d2 = { "Lkotlin/text/o;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "p", "", "input", "", "i", "a", "", "startIndex", "Lkotlin/text/m;", "b", "Lkotlin/sequences/m;", "d", "h", "", "replacement", "j", "Lkotlin/Function1;", "transform", "k", "l", "limit", "", "m", "toString", "Ljava/util/regex/Pattern;", "o", "", "Lkotlin/text/q;", "f", "()Ljava/util/Set;", "options", "G", "Ljava/util/Set;", "_options", "g", "()Ljava/lang/String;", "pattern", "H", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "(Ljava/lang/String;)V", "option", "(Ljava/lang/String;Lkotlin/text/q;)V", "(Ljava/lang/String;Ljava/util/Set;)V", "I", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class o implements Serializable
{
    @e
    public static final a I;
    private Set<? extends q> G;
    private final Pattern H;
    
    static {
        I = new a(null);
    }
    
    public o(@e final String regex) {
        k0.p((Object)regex, "pattern");
        final Pattern compile = Pattern.compile(regex);
        k0.o((Object)compile, "Pattern.compile(pattern)");
        this(compile);
    }
    
    public o(@e final String regex, @e final Set<? extends q> set) {
        k0.p((Object)regex, "pattern");
        k0.p((Object)set, "options");
        final Pattern compile = Pattern.compile(regex, o.I.b(p.f(set)));
        k0.o((Object)compile, "Pattern.compile(pattern,\u2026odeCase(options.toInt()))");
        this(compile);
    }
    
    public o(@e final String regex, @e final q q) {
        k0.p((Object)regex, "pattern");
        k0.p((Object)q, "option");
        final Pattern compile = Pattern.compile(regex, o.I.b(q.getValue()));
        k0.o((Object)compile, "Pattern.compile(pattern,\u2026nicodeCase(option.value))");
        this(compile);
    }
    
    @y0
    public o(@e final Pattern h) {
        k0.p((Object)h, "nativePattern");
        this.H = h;
    }
    
    public static /* synthetic */ m c(final o o, final CharSequence charSequence, int n, final int n2, final Object o2) {
        if ((n2 & 0x2) != 0x0) {
            n = 0;
        }
        return o.b(charSequence, n);
    }
    
    private final Object p() {
        final String pattern = this.H.pattern();
        k0.o((Object)pattern, "nativePattern.pattern()");
        return new b(pattern, this.H.flags());
    }
    
    public final boolean a(@e final CharSequence input) {
        k0.p((Object)input, "input");
        return this.H.matcher(input).find();
    }
    
    @f
    public final m b(@e final CharSequence input, final int n) {
        k0.p((Object)input, "input");
        final Matcher matcher = this.H.matcher(input);
        k0.o((Object)matcher, "nativePattern.matcher(input)");
        return p.a(matcher, n, input);
    }
    
    @e
    public final kotlin.sequences.m<m> d(@e final CharSequence charSequence, final int i) {
        k0.p((Object)charSequence, "input");
        if (i >= 0 && i <= charSequence.length()) {
            return kotlin.sequences.p.q((n6.a<? extends m>)new n6.a<m>() {
                final /* synthetic */ o G;
                
                @f
                public final m a() {
                    return this.G.b(charSequence, i);
                }
            }, (n6.l<? super m, ? extends m>)o$d.G);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Start index out of bounds: ");
        sb.append(i);
        sb.append(", input length: ");
        sb.append(charSequence.length());
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    @e
    public final Set<q> f() {
        Set<? extends q> g = this.G;
        if (g == null) {
            final int flags = this.H.flags();
            final EnumSet<q> all = EnumSet.allOf(q.class);
            v.P0((Iterable)all, (l)new l<T, Boolean>() {
                public final boolean a(final T t) {
                    final int g = flags;
                    final i i = (i)t;
                    return (g & i.b()) == i.getValue();
                }
            });
            g = (Set<? extends q>)Collections.unmodifiableSet((Set<?>)all);
            k0.o((Object)g, "Collections.unmodifiable\u2026mask == it.value }\n    })");
            this.G = g;
        }
        return (Set<q>)g;
    }
    
    @e
    public final String g() {
        final String pattern = this.H.pattern();
        k0.o((Object)pattern, "nativePattern.pattern()");
        return pattern;
    }
    
    @f
    public final m h(@e final CharSequence input) {
        k0.p((Object)input, "input");
        final Matcher matcher = this.H.matcher(input);
        k0.o((Object)matcher, "nativePattern.matcher(input)");
        return p.c(matcher, input);
    }
    
    public final boolean i(@e final CharSequence input) {
        k0.p((Object)input, "input");
        return this.H.matcher(input).matches();
    }
    
    @e
    public final String j(@e final CharSequence input, @e final String replacement) {
        k0.p((Object)input, "input");
        k0.p((Object)replacement, "replacement");
        final String replaceAll = this.H.matcher(input).replaceAll(replacement);
        k0.o((Object)replaceAll, "nativePattern.matcher(in\u2026).replaceAll(replacement)");
        return replaceAll;
    }
    
    @e
    public final String k(@e final CharSequence charSequence, @e final l<? super m, ? extends CharSequence> l) {
        k0.p((Object)charSequence, "input");
        k0.p((Object)l, "transform");
        int start = 0;
        m c = c(this, charSequence, 0, 2, null);
        if (c != null) {
            final int length = charSequence.length();
            final StringBuilder sb = new StringBuilder(length);
            m next;
            int start2;
            do {
                k0.m((Object)c);
                sb.append(charSequence, start, c.d().v());
                sb.append((CharSequence)l.invoke((Object)c));
                start2 = c.d().t() + 1;
                next = c.next();
                if (start2 >= length) {
                    break;
                }
                start = start2;
            } while ((c = next) != null);
            if (start2 < length) {
                sb.append(charSequence, start2, length);
            }
            final String string = sb.toString();
            k0.o((Object)string, "sb.toString()");
            return string;
        }
        return charSequence.toString();
    }
    
    @e
    public final String l(@e final CharSequence input, @e final String replacement) {
        k0.p((Object)input, "input");
        k0.p((Object)replacement, "replacement");
        final String replaceFirst = this.H.matcher(input).replaceFirst(replacement);
        k0.o((Object)replaceFirst, "nativePattern.matcher(in\u2026replaceFirst(replacement)");
        return replaceFirst;
    }
    
    @e
    public final List<String> m(@e final CharSequence input, int i) {
        k0.p((Object)input, "input");
        final int n = 0;
        if (i < 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Limit must be non-negative, but was ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString().toString());
        }
        final Matcher matcher = this.H.matcher(input);
        if (matcher.find() && i != 1) {
            int u = 10;
            if (i > 0) {
                u = kotlin.ranges.o.u(i, 10);
            }
            final ArrayList list = new ArrayList<String>(u);
            final int n2 = i - 1;
            i = n;
            int end;
            do {
                list.add(input.subSequence(i, matcher.start()).toString());
                end = matcher.end();
                if (n2 >= 0 && list.size() == n2) {
                    break;
                }
                i = end;
            } while (matcher.find());
            list.add(input.subSequence(end, input.length()).toString());
            return (List<String>)list;
        }
        return (List<String>)v.k((Object)input.toString());
    }
    
    @e
    public final Pattern o() {
        return this.H;
    }
    
    @e
    @Override
    public String toString() {
        final String string = this.H.toString();
        k0.o((Object)string, "nativePattern.toString()");
        return string;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\r" }, d2 = { "kotlin/text/o$a", "", "", "flags", "b", "", "literal", "Lkotlin/text/o;", "e", "c", "d", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        private final int b(final int n) {
            int n2 = n;
            if ((n & 0x2) != 0x0) {
                n2 = (n | 0x40);
            }
            return n2;
        }
        
        @e
        public final String c(@e String quote) {
            k0.p((Object)quote, "literal");
            quote = Pattern.quote(quote);
            k0.o((Object)quote, "Pattern.quote(literal)");
            return quote;
        }
        
        @e
        public final String d(@e String quoteReplacement) {
            k0.p((Object)quoteReplacement, "literal");
            quoteReplacement = Matcher.quoteReplacement(quoteReplacement);
            k0.o((Object)quoteReplacement, "Matcher.quoteReplacement(literal)");
            return quoteReplacement;
        }
        
        @e
        public final o e(@e final String s) {
            k0.p((Object)s, "literal");
            return new o(s, q.K);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u0000 \u00132\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0017\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0002R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0010\u001a\u00020\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014" }, d2 = { "kotlin/text/o$b", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "c", "", "G", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "pattern", "", "H", "I", "a", "()I", "flags", "<init>", "(Ljava/lang/String;I)V", "J", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private static final class b implements Serializable
    {
        private static final long I = 0L;
        @e
        public static final a J;
        @e
        private final String G;
        private final int H;
        
        static {
            J = new a(null);
        }
        
        public b(@e final String g, final int h) {
            k0.p((Object)g, "pattern");
            this.G = g;
            this.H = h;
        }
        
        private final Object c() {
            final Pattern compile = Pattern.compile(this.G, this.H);
            k0.o((Object)compile, "Pattern.compile(pattern, flags)");
            return new o(compile);
        }
        
        public final int a() {
            return this.H;
        }
        
        @e
        public final String b() {
            return this.G;
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "kotlin/text/o$b$a", "", "", "serialVersionUID", "J", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        public static final class a
        {
            private a() {
            }
        }
    }
}
