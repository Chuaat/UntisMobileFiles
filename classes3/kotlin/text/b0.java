// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.collections.m;
import java.util.List;
import kotlin.ranges.o;
import java.util.Iterator;
import kotlin.ranges.k;
import kotlin.collections.t0;
import java.util.Collection;
import java.util.Comparator;
import kotlin.jvm.internal.p1;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.nio.CharBuffer;
import java.nio.ByteBuffer;
import java.nio.charset.CodingErrorAction;
import kotlin.internal.f;
import kotlin.internal.g;
import java.util.Locale;
import kotlin.q;
import kotlin.o2;
import kotlin.e1;
import kotlin.collections.d;
import kotlin.j;
import kotlin.z0;
import kotlin.i;
import java.util.Objects;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0086\u0001\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b\u001a\u001d\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b\u001a\u001d\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0081\b\u001a \u0010\r\u001a\u00020\u000b*\u0004\u0018\u00010\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0013\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0014\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\r\u0010\u0016\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\f\u0010\u001b\u001a\u00020\u0000*\u00020\u001aH\u0007\u001a \u0010\u001e\u001a\u00020\u0000*\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0007\u001a \u0010\u001f\u001a\u00020\u001a*\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0007\u001a\f\u0010!\u001a\u00020\u0000*\u00020 H\u0007\u001a*\u0010#\u001a\u00020\u0000*\u00020 2\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007\u001a\f\u0010$\u001a\u00020 *\u00020\u0000H\u0007\u001a*\u0010%\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u000bH\u0007\u001a\r\u0010&\u001a\u00020\u001a*\u00020\u0000H\u0087\b\u001a3\u0010)\u001a\u00020\u001a*\u00020\u00002\u0006\u0010'\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u0003H\u0087\b\u001a,\u0010-\u001a\u00020\u0000*\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b-\u0010.\u001a4\u00101\u001a\u00020\u0000*\u00020/2\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b1\u00102\u001a4\u00105\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u0002032\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b5\u00106\u001a6\u00107\u001a\u00020\u0000*\u00020\u00002\b\u00104\u001a\u0004\u0018\u0001032\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b7\u00106\u001a<\u00108\u001a\u00020\u0000*\u00020/2\u0006\u00104\u001a\u0002032\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b8\u00109\u001a>\u0010:\u001a\u00020\u0000*\u00020/2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u00100\u001a\u00020\u00002\u0016\u0010,\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010+0*\"\u0004\u0018\u00010+H\u0087\b¢\u0006\u0004\b:\u00109\u001a\"\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00000?*\u00020;2\u0006\u0010=\u001a\u00020<2\b\b\u0002\u0010>\u001a\u00020\u0003\u001a\u0015\u0010A\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u0003H\u0087\b\u001a\u001d\u0010B\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0087\b\u001a\u001c\u0010D\u001a\u00020\u000b*\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a$\u0010E\u001a\u00020\u000b*\u00020\u00002\u0006\u0010C\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u001c\u0010G\u001a\u00020\u000b*\u00020\u00002\u0006\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a)\u0010M\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010L\u001a\u00020KH\u0087\b\u001a\u0019\u0010N\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010L\u001a\u00020KH\u0087\b\u001a!\u0010O\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\u0087\b\u001a\u0011\u0010P\u001a\u00020\u00002\u0006\u0010H\u001a\u00020 H\u0087\b\u001a\u0011\u0010R\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001aH\u0087\b\u001a!\u0010S\u001a\u00020\u00002\u0006\u0010Q\u001a\u00020\u001a2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\u0087\b\u001a!\u0010V\u001a\u00020\u00002\u0006\u0010U\u001a\u00020T2\u0006\u0010I\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u0003H\u0087\b\u001a\u0011\u0010Y\u001a\u00020\u00002\u0006\u0010X\u001a\u00020WH\u0087\b\u001a\u0011\u0010\\\u001a\u00020\u00002\u0006\u0010[\u001a\u00020ZH\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u0003H\u0087\b\u001a\u0015\u0010_\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u0003H\u0087\b\u001a\u001d\u0010a\u001a\u00020\u0003*\u00020\u00002\u0006\u0010`\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u0003H\u0087\b\u001a\u001c\u0010b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0015\u0010d\u001a\u00020\u000b*\u00020\u00002\u0006\u0010c\u001a\u00020;H\u0087\b\u001a\u0015\u0010e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010[\u001a\u00020WH\u0087\b\u001a\u0019\u0010f\u001a\u00020\u000b*\u0004\u0018\u00010;2\b\u0010\n\u001a\u0004\u0018\u00010;H\u0087\u0004\u001a \u0010g\u001a\u00020\u000b*\u0004\u0018\u00010;2\b\u0010\n\u001a\u0004\u0018\u00010;2\u0006\u0010\f\u001a\u00020\u000bH\u0007\u001a\r\u0010h\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\n\u0010i\u001a\u00020\u000b*\u00020;\u001a\u001d\u0010k\u001a\u00020\u0003*\u00020\u00002\u0006\u0010]\u001a\u00020\u00032\u0006\u0010j\u001a\u00020\u0003H\u0087\b\u001a4\u0010n\u001a\u00020\u000b*\u00020;2\u0006\u0010l\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020;2\u0006\u0010m\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a4\u0010o\u001a\u00020\u000b*\u00020\u00002\u0006\u0010l\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010m\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u000b\u001a\u0015\u0010p\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0087\b\u001a\u0015\u0010q\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0087\b\u001a\u0015\u0010r\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0087\b\u001a\u0015\u0010s\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0087\b\u001a\u0017\u0010t\u001a\u00020 *\u00020\u00002\b\b\u0002\u0010L\u001a\u00020KH\u0087\b\u001a\u0017\u0010v\u001a\u00020<*\u00020\u00002\b\b\u0002\u0010u\u001a\u00020\u0003H\u0087\b\u001a\f\u0010w\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010x\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0007\u001a\f\u0010y\u001a\u00020\u0000*\u00020\u0000H\u0007\u001a\u0014\u0010z\u001a\u00020\u0000*\u00020\u00002\u0006\u00104\u001a\u000203H\u0007\u001a\u0012\u0010|\u001a\u00020\u0000*\u00020;2\u0006\u0010{\u001a\u00020\u0003\")\u0010\u0081\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u00000}j\b\u0012\u0004\u0012\u00020\u0000`~*\u00020/8F@\u0006¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0082\u0001" }, d2 = { "", "", "ch", "", "fromIndex", "X1", "str", "Y1", "Z1", "a2", "other", "", "ignoreCase", "K1", "oldChar", "newChar", "h2", "oldValue", "newValue", "i2", "l2", "m2", "I2", "K2", "E2", "V1", "", "t1", "startIndex", "endIndex", "u1", "A2", "", "C1", "throwOnInvalidSequence", "D1", "F1", "G1", "z2", "destination", "destinationOffset", "B2", "", "", "args", "N1", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/String$Companion;", "format", "O1", "(Lkotlin/jvm/internal/p1;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/util/Locale;", "locale", "M1", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "Q1", "P1", "(Lkotlin/jvm/internal/p1;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "R1", "", "Ljava/util/regex/Pattern;", "regex", "limit", "", "p2", "v2", "w2", "prefix", "s2", "r2", "suffix", "I1", "bytes", "offset", "length", "Ljava/nio/charset/Charset;", "charset", "h1", "i1", "g1", "f1", "chars", "j1", "k1", "", "codePoints", "l1", "Ljava/lang/StringBuffer;", "stringBuffer", "d1", "Ljava/lang/StringBuilder;", "stringBuilder", "e1", "index", "o1", "p1", "beginIndex", "q1", "r1", "charSequence", "y1", "z1", "w1", "x1", "T1", "U1", "codePointOffset", "b2", "thisOffset", "otherOffset", "c2", "d2", "F2", "W1", "J2", "L2", "x2", "flags", "G2", "m1", "n1", "A1", "B1", "n", "g2", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "S1", "(Lkotlin/jvm/internal/p1;)Ljava/util/Comparator;", "CASE_INSENSITIVE_ORDER", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class b0 extends a0
{
    public b0() {
    }
    
    @i(message = "Use replaceFirstChar instead.", replaceWith = @z0(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = { "java.util.Locale" }))
    @j(warningSince = "1.5")
    @e
    public static String A1(@e String substring) {
        k0.p((Object)substring, "$this$decapitalize");
        final boolean b = substring.length() > 0;
        String string = substring;
        if (b) {
            string = substring;
            if (!Character.isLowerCase(substring.charAt(0))) {
                final StringBuilder sb = new StringBuilder();
                final String substring2 = substring.substring(0, 1);
                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                Objects.requireNonNull(substring2, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = substring2.toLowerCase();
                k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
                sb.append(lowerCase);
                substring = substring.substring(1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                string = sb.toString();
            }
        }
        return string;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final char[] A2(@e final String s, final int srcBegin, final int srcEnd) {
        k0.p((Object)s, "$this$toCharArray");
        d.G.a(srcBegin, srcEnd, s.length());
        final char[] dst = new char[srcEnd - srcBegin];
        s.getChars(srcBegin, srcEnd, dst, 0);
        return dst;
    }
    
    @i(message = "Use replaceFirstChar instead.", replaceWith = @z0(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @j(warningSince = "1.5")
    @e1(version = "1.4")
    @g
    @o2(markerClass = { q.class })
    @e
    public static final String B1(@e String substring, @e final Locale locale) {
        k0.p((Object)substring, "$this$decapitalize");
        k0.p((Object)locale, "locale");
        final boolean b = substring.length() > 0;
        String string = substring;
        if (b) {
            string = substring;
            if (!Character.isLowerCase(substring.charAt(0))) {
                final StringBuilder sb = new StringBuilder();
                final String substring2 = substring.substring(0, 1);
                k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                Objects.requireNonNull(substring2, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = substring2.toLowerCase(locale);
                k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                sb.append(lowerCase);
                substring = substring.substring(1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                string = sb.toString();
            }
        }
        return string;
    }
    
    @f
    private static final char[] B2(final String obj, final char[] dst, final int dstBegin, final int srcBegin, final int srcEnd) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        obj.getChars(srcBegin, srcEnd, dst, dstBegin);
        return dst;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final String C1(@e final byte[] bytes) {
        k0.p((Object)bytes, "$this$decodeToString");
        return new String(bytes, kotlin.text.f.a);
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final String D1(@e final byte[] array, final int n, final int n2, final boolean b) {
        k0.p((Object)array, "$this$decodeToString");
        d.G.a(n, n2, array.length);
        if (!b) {
            return new String(array, n, n2 - n, kotlin.text.f.a);
        }
        final String string = kotlin.text.f.a.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).decode(ByteBuffer.wrap(array, n, n2 - n)).toString();
        k0.o((Object)string, "decoder.decode(ByteBuffe\u2026- startIndex)).toString()");
        return string;
    }
    
    @i(message = "Use lowercase() instead.", replaceWith = @z0(expression = "lowercase(Locale.getDefault())", imports = { "java.util.Locale" }))
    @j(warningSince = "1.5")
    @f
    private static final String E2(String lowerCase) {
        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
        lowerCase = lowerCase.toLowerCase();
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase()");
        return lowerCase;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final byte[] F1(@e final String s) {
        k0.p((Object)s, "$this$encodeToByteArray");
        final byte[] bytes = s.getBytes(kotlin.text.f.a);
        k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    @i(message = "Use lowercase() instead.", replaceWith = @z0(expression = "lowercase(locale)", imports = {}))
    @j(warningSince = "1.5")
    @f
    private static final String F2(String lowerCase, final Locale locale) {
        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
        lowerCase = lowerCase.toLowerCase(locale);
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final byte[] G1(@e String substring, int remaining, final int n, final boolean b) {
        k0.p((Object)substring, "$this$encodeToByteArray");
        d.G.a(remaining, n, substring.length());
        if (!b) {
            substring = substring.substring(remaining, n);
            k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final Charset a = kotlin.text.f.a;
            Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
            final byte[] bytes = substring.getBytes(a);
            k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
            return bytes;
        }
        final ByteBuffer encode = kotlin.text.f.a.newEncoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT).encode(CharBuffer.wrap(substring, remaining, n));
        if (encode.hasArray() && encode.arrayOffset() == 0) {
            remaining = encode.remaining();
            final byte[] array = encode.array();
            k0.m((Object)array);
            if (remaining == array.length) {
                final byte[] array2 = encode.array();
                k0.o((Object)array2, "byteBuffer.array()");
                return array2;
            }
        }
        final byte[] array2 = new byte[encode.remaining()];
        encode.get(array2);
        return array2;
    }
    
    @f
    private static final Pattern G2(final String regex, final int flags) {
        final Pattern compile = Pattern.compile(regex, flags);
        k0.o((Object)compile, "java.util.regex.Pattern.compile(this, flags)");
        return compile;
    }
    
    public static final boolean I1(@e final String s, @e final String suffix, final boolean b) {
        k0.p((Object)s, "$this$endsWith");
        k0.p((Object)suffix, "suffix");
        if (!b) {
            return s.endsWith(suffix);
        }
        return d2(s, s.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }
    
    @i(message = "Use uppercase() instead.", replaceWith = @z0(expression = "uppercase(Locale.getDefault())", imports = { "java.util.Locale" }))
    @j(warningSince = "1.5")
    @f
    private static final String I2(String upperCase) {
        Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        upperCase = upperCase.toUpperCase();
        k0.o((Object)upperCase, "(this as java.lang.String).toUpperCase()");
        return upperCase;
    }
    
    @i(message = "Use uppercase() instead.", replaceWith = @z0(expression = "uppercase(locale)", imports = {}))
    @j(warningSince = "1.5")
    @f
    private static final String J2(String upperCase, final Locale locale) {
        Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        upperCase = upperCase.toUpperCase(locale);
        k0.o((Object)upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
    
    public static boolean K1(@org.jetbrains.annotations.f final String s, @org.jetbrains.annotations.f final String s2, final boolean b) {
        if (s == null) {
            return s2 == null;
        }
        boolean b2;
        if (!b) {
            b2 = s.equals(s2);
        }
        else {
            b2 = s.equalsIgnoreCase(s2);
        }
        return b2;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String K2(String upperCase) {
        Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        upperCase = upperCase.toUpperCase(Locale.ROOT);
        k0.o((Object)upperCase, "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
        return upperCase;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String L2(String upperCase, final Locale locale) {
        Objects.requireNonNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        upperCase = upperCase.toUpperCase(locale);
        k0.o((Object)upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
    
    @f
    private static final String N1(String format, final Object... original) {
        format = String.format(format, Arrays.copyOf(original, original.length));
        k0.o((Object)format, "java.lang.String.format(this, *args)");
        return format;
    }
    
    @f
    private static final String O1(final p1 p3, final String format, final Object... original) {
        final String format2 = String.format(format, Arrays.copyOf(original, original.length));
        k0.o((Object)format2, "java.lang.String.format(format, *args)");
        return format2;
    }
    
    @e1(version = "1.4")
    @f
    @m6.g(name = "formatNullable")
    private static final String Q1(String format, final Locale l, final Object... original) {
        format = String.format(l, format, Arrays.copyOf(original, original.length));
        k0.o((Object)format, "java.lang.String.format(locale, this, *args)");
        return format;
    }
    
    @e1(version = "1.4")
    @f
    @m6.g(name = "formatNullable")
    private static final String R1(final p1 p4, final Locale l, final String format, final Object... original) {
        final String format2 = String.format(l, format, Arrays.copyOf(original, original.length));
        k0.o((Object)format2, "java.lang.String.format(locale, format, *args)");
        return format2;
    }
    
    @e
    public static Comparator<String> S1(@e final p1 p) {
        k0.p((Object)p, "$this$CASE_INSENSITIVE_ORDER");
        final Comparator<String> case_INSENSITIVE_ORDER = String.CASE_INSENSITIVE_ORDER;
        k0.o((Object)case_INSENSITIVE_ORDER, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return case_INSENSITIVE_ORDER;
    }
    
    @f
    private static final String T1(String intern) {
        Objects.requireNonNull(intern, "null cannot be cast to non-null type java.lang.String");
        intern = intern.intern();
        k0.o((Object)intern, "(this as java.lang.String).intern()");
        return intern;
    }
    
    public static boolean U1(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "$this$isBlank");
        final int length = charSequence.length();
        boolean b = false;
        if (length != 0) {
            final k h3 = s.h3(charSequence);
            boolean b2 = false;
            Label_0086: {
                if (!(h3 instanceof Collection) || !((Collection)h3).isEmpty()) {
                    final Iterator iterator = ((Iterable)h3).iterator();
                    while (iterator.hasNext()) {
                        if (!kotlin.text.d.r(charSequence.charAt(((t0)iterator).b()))) {
                            b2 = false;
                            break Label_0086;
                        }
                    }
                }
                b2 = true;
            }
            if (!b2) {
                return b;
            }
        }
        b = true;
        return b;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String V1(String lowerCase) {
        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
        lowerCase = lowerCase.toLowerCase(Locale.ROOT);
        k0.o((Object)lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String W1(String lowerCase, final Locale locale) {
        Objects.requireNonNull(lowerCase, "null cannot be cast to non-null type java.lang.String");
        lowerCase = lowerCase.toLowerCase(locale);
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
    
    @f
    private static final int X1(final String obj, final char ch, final int fromIndex) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.indexOf(ch, fromIndex);
    }
    
    @f
    private static final int Y1(final String obj, final String str, final int fromIndex) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.indexOf(str, fromIndex);
    }
    
    @f
    private static final int Z1(final String obj, final char ch, final int fromIndex) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.lastIndexOf(ch, fromIndex);
    }
    
    @f
    private static final int a2(final String obj, final String str, final int fromIndex) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.lastIndexOf(str, fromIndex);
    }
    
    @f
    private static final int b2(final String obj, final int index, final int codePointOffset) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.offsetByCodePoints(index, codePointOffset);
    }
    
    public static final boolean c2(@e final CharSequence charSequence, final int n, @e final CharSequence charSequence2, final int n2, final int n3, final boolean b) {
        k0.p((Object)charSequence, "$this$regionMatches");
        k0.p((Object)charSequence2, "other");
        if (charSequence instanceof String && charSequence2 instanceof String) {
            return d2((String)charSequence, n, (String)charSequence2, n2, n3, b);
        }
        return c0.a4(charSequence, n, charSequence2, n2, n3, b);
    }
    
    @f
    private static final String d1(final StringBuffer buffer) {
        return new String(buffer);
    }
    
    public static final boolean d2(@e final String s, final int n, @e final String s2, final int n2, final int n3, final boolean ignoreCase) {
        k0.p((Object)s, "$this$regionMatches");
        k0.p((Object)s2, "other");
        boolean b;
        if (!ignoreCase) {
            b = s.regionMatches(n, s2, n2, n3);
        }
        else {
            b = s.regionMatches(ignoreCase, n, s2, n2, n3);
        }
        return b;
    }
    
    @f
    private static final String e1(final StringBuilder builder) {
        return new String(builder);
    }
    
    @f
    private static final String f1(final byte[] bytes) {
        return new String(bytes, kotlin.text.f.a);
    }
    
    @f
    private static final String g1(final byte[] bytes, final int offset, final int length) {
        return new String(bytes, offset, length, kotlin.text.f.a);
    }
    
    @e
    public static String g2(@e final CharSequence s, final int i) {
        k0.p((Object)s, "$this$repeat");
        final int n = 0;
        final int n2 = 1;
        if (i >= 0) {
            String s3;
            final String s2 = s3 = "";
            if (i != 0) {
                if (i != 1) {
                    final int length = s.length();
                    s3 = s2;
                    if (length != 0) {
                        if (length != 1) {
                            final StringBuilder sb = new StringBuilder(s.length() * i);
                            if (1 <= i) {
                                int n3 = n2;
                                while (true) {
                                    sb.append(s);
                                    if (n3 == i) {
                                        break;
                                    }
                                    ++n3;
                                }
                            }
                            s3 = sb.toString();
                            k0.o((Object)s3, "sb.toString()");
                        }
                        else {
                            final char char1 = s.charAt(0);
                            final char[] value = new char[i];
                            for (int j = n; j < i; ++j) {
                                value[j] = char1;
                            }
                            s3 = new String(value);
                        }
                    }
                }
                else {
                    s3 = s.toString();
                }
            }
            return s3;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Count 'n' must be non-negative, but was ");
        sb2.append(i);
        sb2.append('.');
        throw new IllegalArgumentException(sb2.toString().toString());
    }
    
    @f
    private static final String h1(final byte[] bytes, final int offset, final int length, final Charset charset) {
        return new String(bytes, offset, length, charset);
    }
    
    @e
    public static final String h2(@e String s, final char oldChar, final char newChar, final boolean b) {
        k0.p((Object)s, "$this$replace");
        String s2;
        if (!b) {
            s = s.replace(oldChar, newChar);
            s2 = "(this as java.lang.Strin\u2026replace(oldChar, newChar)";
        }
        else {
            final StringBuilder sb = new StringBuilder(s.length());
            for (int i = 0; i < s.length(); ++i) {
                char char1;
                if (kotlin.text.e.J(char1 = s.charAt(i), oldChar, b)) {
                    char1 = newChar;
                }
                sb.append(char1);
            }
            s = sb.toString();
            s2 = "StringBuilder(capacity).\u2026builderAction).toString()";
        }
        k0.o((Object)s, s2);
        return s;
    }
    
    @f
    private static final String i1(final byte[] bytes, final Charset charset) {
        return new String(bytes, charset);
    }
    
    @e
    public static final String i2(@e String string, @e final String s, @e final String str, final boolean b) {
        k0.p((Object)string, "$this$replace");
        k0.p((Object)s, "oldValue");
        k0.p((Object)str, "newValue");
        int start = 0;
        int n3 = s.n3(string, s, 0, b);
        if (n3 < 0) {
            return string;
        }
        final int length = s.length();
        final int n4 = o.n(length, 1);
        final int capacity = string.length() - length + str.length();
        if (capacity >= 0) {
            final StringBuilder sb = new StringBuilder(capacity);
            int n5;
            int start2;
            do {
                sb.append(string, start, n3);
                sb.append(str);
                start2 = n3 + length;
                if (n3 >= string.length()) {
                    break;
                }
                n5 = s.n3(string, s, n3 + n4, b);
                start = start2;
            } while ((n3 = n5) > 0);
            sb.append(string, start2, string.length());
            string = sb.toString();
            k0.o((Object)string, "stringBuilder.append(this, i, length).toString()");
            return string;
        }
        throw new OutOfMemoryError();
    }
    
    @f
    private static final String j1(final char[] value) {
        return new String(value);
    }
    
    @f
    private static final String k1(final char[] value, final int offset, final int count) {
        return new String(value, offset, count);
    }
    
    @f
    private static final String l1(final int[] codePoints, final int offset, final int count) {
        return new String(codePoints, offset, count);
    }
    
    @e
    public static final String l2(@e String string, final char c, final char c2, final boolean b) {
        k0.p((Object)string, "$this$replaceFirst");
        final int q3 = s.q3(string, c, 0, b, 2, null);
        if (q3 >= 0) {
            string = c0.I4(string, q3, q3 + 1, String.valueOf(c2)).toString();
        }
        return string;
    }
    
    @i(message = "Use replaceFirstChar instead.", replaceWith = @z0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = { "java.util.Locale" }))
    @j(warningSince = "1.5")
    @e
    public static String m1(@e final String s) {
        k0.p((Object)s, "$this$capitalize");
        final Locale default1 = Locale.getDefault();
        k0.o((Object)default1, "Locale.getDefault()");
        return n1(s, default1);
    }
    
    @e
    public static final String m2(@e String string, @e final String s, @e final String s2, final boolean b) {
        k0.p((Object)string, "$this$replaceFirst");
        k0.p((Object)s, "oldValue");
        k0.p((Object)s2, "newValue");
        final int r3 = s.r3(string, s, 0, b, 2, null);
        if (r3 >= 0) {
            string = c0.I4(string, r3, s.length() + r3, s2).toString();
        }
        return string;
    }
    
    @i(message = "Use replaceFirstChar instead.", replaceWith = @z0(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @j(warningSince = "1.5")
    @e1(version = "1.4")
    @g
    @o2(markerClass = { q.class })
    @e
    public static final String n1(@e String substring, @e final Locale locale) {
        k0.p((Object)substring, "$this$capitalize");
        k0.p((Object)locale, "locale");
        final boolean b = substring.length() > 0;
        String string = substring;
        if (b) {
            final char char1 = substring.charAt(0);
            string = substring;
            if (Character.isLowerCase(char1)) {
                final StringBuilder sb = new StringBuilder();
                final char titleCase = Character.toTitleCase(char1);
                if (titleCase != Character.toUpperCase(char1)) {
                    sb.append(titleCase);
                }
                else {
                    final String substring2 = substring.substring(0, 1);
                    k0.o((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                    Objects.requireNonNull(substring2, "null cannot be cast to non-null type java.lang.String");
                    final String upperCase = substring2.toUpperCase(locale);
                    k0.o((Object)upperCase, "(this as java.lang.String).toUpperCase(locale)");
                    sb.append(upperCase);
                }
                substring = substring.substring(1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                sb.append(substring);
                string = sb.toString();
                k0.o((Object)string, "StringBuilder().apply(builderAction).toString()");
            }
        }
        return string;
    }
    
    @f
    private static final int o1(final String obj, final int index) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.codePointAt(index);
    }
    
    @f
    private static final int p1(final String obj, final int index) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.codePointBefore(index);
    }
    
    @e
    public static final List<String> p2(@e final CharSequence input, @e final Pattern pattern, final int i) {
        k0.p((Object)input, "$this$split");
        k0.p((Object)pattern, "regex");
        if (i >= 0) {
            int limit;
            if ((limit = i) == 0) {
                limit = -1;
            }
            final String[] split = pattern.split(input, limit);
            k0.o((Object)split, "regex.split(this, if (limit == 0) -1 else limit)");
            return (List<String>)m.t((Object[])split);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Limit must be non-negative, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @f
    private static final int q1(final String obj, final int beginIndex, final int endIndex) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.codePointCount(beginIndex, endIndex);
    }
    
    public static int r1(@e final String s, @e final String s2, final boolean b) {
        k0.p((Object)s, "$this$compareTo");
        k0.p((Object)s2, "other");
        if (b) {
            return s.compareToIgnoreCase(s2);
        }
        return s.compareTo(s2);
    }
    
    public static boolean r2(@e final String s, @e final String prefix, final int toffset, final boolean b) {
        k0.p((Object)s, "$this$startsWith");
        k0.p((Object)prefix, "prefix");
        if (!b) {
            return s.startsWith(prefix, toffset);
        }
        return d2(s, toffset, prefix, 0, prefix.length(), b);
    }
    
    public static boolean s2(@e final String s, @e final String prefix, final boolean b) {
        k0.p((Object)s, "$this$startsWith");
        k0.p((Object)prefix, "prefix");
        if (!b) {
            return s.startsWith(prefix);
        }
        return d2(s, 0, prefix, 0, prefix.length(), b);
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final String t1(@e final char[] value) {
        k0.p((Object)value, "$this$concatToString");
        return new String(value);
    }
    
    @e1(version = "1.4")
    @o2(markerClass = { q.class })
    @e
    public static final String u1(@e final char[] value, final int offset, final int n) {
        k0.p((Object)value, "$this$concatToString");
        d.G.a(offset, n, value.length);
        return new String(value, offset, n - offset);
    }
    
    @f
    private static final String v2(String substring, final int beginIndex) {
        Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
        substring = substring.substring(beginIndex);
        k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }
    
    @e1(version = "1.5")
    public static final boolean w1(@org.jetbrains.annotations.f final CharSequence charSequence, @org.jetbrains.annotations.f final CharSequence cs) {
        boolean b;
        if (charSequence instanceof String && cs != null) {
            b = ((String)charSequence).contentEquals(cs);
        }
        else {
            b = c0.X2(charSequence, cs);
        }
        return b;
    }
    
    @f
    private static final String w2(String substring, final int beginIndex, final int endIndex) {
        Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
        substring = substring.substring(beginIndex, endIndex);
        k0.o((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return substring;
    }
    
    @e1(version = "1.5")
    public static final boolean x1(@org.jetbrains.annotations.f final CharSequence charSequence, @org.jetbrains.annotations.f final CharSequence charSequence2, final boolean b) {
        boolean b2;
        if (b) {
            b2 = c0.W2(charSequence, charSequence2);
        }
        else {
            b2 = w1(charSequence, charSequence2);
        }
        return b2;
    }
    
    @f
    private static final byte[] x2(final String obj, final Charset charset) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        final byte[] bytes = obj.getBytes(charset);
        k0.o((Object)bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }
    
    @f
    private static final boolean y1(final String obj, final CharSequence cs) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.contentEquals(cs);
    }
    
    @f
    private static final boolean z1(final String obj, final StringBuffer sb) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        return obj.contentEquals(sb);
    }
    
    @f
    private static final char[] z2(final String obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.String");
        final char[] charArray = obj.toCharArray();
        k0.o((Object)charArray, "(this as java.lang.String).toCharArray()");
        return charArray;
    }
}
