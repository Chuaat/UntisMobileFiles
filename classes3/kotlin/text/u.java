// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.Objects;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import kotlin.sequences.m;
import kotlin.sequences.p;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.m0;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0014\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\u001e\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001a\n\u0010\u0005\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0000\u001a\u0014\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0000\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0007\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001aL\u0010\u0013\u001a\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00000\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\f2\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\fH\u0082\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015" }, d2 = { "", "marginPrefix", "q", "newIndent", "n", "p", "l", "indent", "i", "", "h", "(Ljava/lang/String;)I", "Lkotlin/Function1;", "g", "(Ljava/lang/String;)Ln6/l;", "", "resultSizeEstimate", "indentAddFunction", "indentCutFunction", "k", "(Ljava/util/List;ILn6/l;Ln6/l;)Ljava/lang/String;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class u extends t
{
    public u() {
    }
    
    private static final l<String, String> g(final String s) {
        m0 g;
        if (s.length() == 0) {
            g = u$a.G;
        }
        else {
            g = new l<String, String>() {
                @e
                public final String a(@e final String str) {
                    k0.p((Object)str, "line");
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s);
                    sb.append(str);
                    return sb.toString();
                }
            };
        }
        return (l<String, String>)g;
    }
    
    private static final int h(final String s) {
        while (true) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (d.r(s.charAt(i)) ^ true) {
                    int length2 = i;
                    if (i == -1) {
                        length2 = s.length();
                    }
                    return length2;
                }
            }
            int i = -1;
            continue;
        }
    }
    
    @e
    public static final String i(@e final String s, @e final String s2) {
        k0.p((Object)s, "$this$prependIndent");
        k0.p((Object)s2, "indent");
        return p.X0(p.d1((m<?>)c0.K3(s), (n6.l<? super Object, ?>)new l<String, String>() {
            @e
            public final String a(@e final String str) {
                k0.p((Object)str, "it");
                String s;
                if (kotlin.text.s.U1(str)) {
                    s = str;
                    if (str.length() < s2.length()) {
                        s = s2;
                    }
                }
                else {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(s2);
                    sb.append(str);
                    s = sb.toString();
                }
                return s;
            }
        }), "\n", null, null, 0, null, null, 62, null);
    }
    
    private static final String k(final List<String> list, final int capacity, final l<? super String, String> l, final l<? super String, String> i) {
        final int g = v.G((List)list);
        final ArrayList<String> list2 = new ArrayList<String>();
        final Iterator<String> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final String next = iterator.next();
            if (n < 0) {
                if (!kotlin.internal.l.a(1, 3, 0)) {
                    throw new ArithmeticException("Index overflow has happened.");
                }
                v.W();
            }
            final String s = next;
            String s2;
            if ((n == 0 || n == g) && kotlin.text.s.U1(s)) {
                s2 = null;
            }
            else {
                final String s3 = (String)i.invoke((Object)s);
                s2 = s;
                if (s3 != null) {
                    final String s4 = (String)l.invoke((Object)s3);
                    s2 = s;
                    if (s4 != null) {
                        s2 = s4;
                    }
                }
            }
            if (s2 != null) {
                list2.add(s2);
            }
            ++n;
        }
        final String string = ((StringBuilder)v.X2((Iterable)list2, (Appendable)new StringBuilder(capacity), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 124, (Object)null)).toString();
        k0.o((Object)string, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
        return string;
    }
    
    @e
    public static final String l(@e String string, @e String s) {
        k0.p((Object)string, "$this$replaceIndent");
        k0.p((Object)s, "newIndent");
        final List<String> l3 = c0.L3(string);
        final ArrayList<String> list = new ArrayList<String>();
        for (final String next : l3) {
            if (s.U1(next) ^ true) {
                list.add(next);
            }
        }
        final ArrayList list2 = new ArrayList<Integer>(v.Y((Iterable)list, 10));
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            list2.add(Integer.valueOf(h(iterator2.next())));
        }
        final Integer n = (Integer)v.X3((Iterable)list2);
        int n2 = 0;
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 0;
        }
        final int length = string.length();
        final int length2 = s.length();
        final int size = l3.size();
        final l<String, String> g = g(s);
        final int g2 = v.G((List)l3);
        final ArrayList<String> list3 = new ArrayList<String>();
        for (final String next2 : l3) {
            if (n2 < 0) {
                v.W();
            }
            s = next2;
            if ((n2 == 0 || n2 == g2) && s.U1(s)) {
                string = null;
            }
            else {
                final String r6 = e0.r6(s, intValue);
                string = s;
                if (r6 != null) {
                    final String s2 = (String)g.invoke((Object)r6);
                    string = s;
                    if (s2 != null) {
                        string = s2;
                    }
                }
            }
            if (string != null) {
                list3.add(string);
            }
            ++n2;
        }
        string = ((StringBuilder)v.X2((Iterable)list3, (Appendable)new StringBuilder(length + length2 * size), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 124, (Object)null)).toString();
        k0.o((Object)string, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
        return string;
    }
    
    @e
    public static final String n(@e String string, @e String substring, @e final String s) {
        k0.p((Object)string, "$this$replaceIndentByMargin");
        k0.p((Object)substring, "newIndent");
        k0.p((Object)s, "marginPrefix");
        if (s.U1(s) ^ true) {
            final List<String> l3 = c0.L3(string);
            final int length = string.length();
            final int length2 = substring.length();
            final int size = l3.size();
            final l<String, String> g = g(substring);
            final int g2 = v.G((List)l3);
            final ArrayList<String> list = new ArrayList<String>();
            final Iterator<Object> iterator = l3.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final String next = iterator.next();
                if (n < 0) {
                    v.W();
                }
                final String obj = next;
                string = null;
                substring = null;
                Label_0264: {
                    if ((n != 0 && n != g2) || !s.U1(obj)) {
                        final int length3 = obj.length();
                        int i = 0;
                        while (true) {
                            while (i < length3) {
                                if (d.r(obj.charAt(i)) ^ true) {
                                    if (i != -1) {
                                        if (s.t2(obj, s, i, false, 4, null)) {
                                            final int length4 = s.length();
                                            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
                                            substring = obj.substring(i + length4);
                                            k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                                        }
                                    }
                                    string = obj;
                                    if (substring == null) {
                                        break Label_0264;
                                    }
                                    substring = (String)g.invoke((Object)substring);
                                    string = obj;
                                    if (substring != null) {
                                        string = substring;
                                    }
                                    break Label_0264;
                                }
                                else {
                                    ++i;
                                }
                            }
                            i = -1;
                            continue;
                        }
                    }
                }
                if (string != null) {
                    list.add(string);
                }
                ++n;
            }
            string = ((StringBuilder)v.X2((Iterable)list, (Appendable)new StringBuilder(length + length2 * size), (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 124, (Object)null)).toString();
            k0.o((Object)string, "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
            return string;
        }
        throw new IllegalArgumentException("marginPrefix must be non-blank string.".toString());
    }
    
    @e
    public static String p(@e final String s) {
        k0.p((Object)s, "$this$trimIndent");
        return l(s, "");
    }
    
    @e
    public static final String q(@e final String s, @e final String s2) {
        k0.p((Object)s, "$this$trimMargin");
        k0.p((Object)s2, "marginPrefix");
        return n(s, "", s2);
    }
}
