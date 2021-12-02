// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.j;
import kotlin.z0;
import kotlin.i;
import kotlin.y0;
import kotlin.ranges.k;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.o2;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0010\f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\t\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0000\u001a\r\u0010\u000b\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\f\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\r\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u000e\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0000H\u0087\b\u001a\u0014\u0010\u0013\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0000H\u0087\b\u001a\u0014\u0010\u0017\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u0018\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\u0014\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0007\u001a\r\u0010\u001c\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\u0018\u0010!\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u001fH\u0000\u001a\u0010\u0010\"\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0001\"\u0017\u0010&\u001a\u00020#*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0017\u0010*\u001a\u00020'*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006+" }, d2 = { "", "", "e", "l", "m", "f", "i", "h", "j", "k", "r", "q", "o", "z", "C", "", "A", "Ljava/util/Locale;", "locale", "B", "x", "u", "s", "t", "p", "y", "w", "v", "g", "n", "char", "", "radix", "b", "a", "Lkotlin/text/b;", "d", "(C)Lkotlin/text/b;", "directionality", "Lkotlin/text/a;", "c", "(C)Lkotlin/text/a;", "category", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/CharsKt")
class d
{
    public d() {
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String A(final char c) {
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = value.toUpperCase(Locale.ROOT);
        k0.o((Object)upperCase, "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
        return upperCase;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    @e
    public static final String B(final char c, @e final Locale locale) {
        k0.p((Object)locale, "locale");
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = value.toUpperCase(locale);
        k0.o((Object)upperCase, "(this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final char C(final char ch) {
        return Character.toUpperCase(ch);
    }
    
    @y0
    public static int a(final int i) {
        if (2 <= i && 36 >= i) {
            return i;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("radix ");
        sb.append(i);
        sb.append(" was not in valid range ");
        sb.append(new k(2, 36));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static final int b(final char codePoint, final int radix) {
        return Character.digit((int)codePoint, radix);
    }
    
    @e
    public static final a c(final char ch) {
        return a.n0.a(Character.getType(ch));
    }
    
    @e
    public static final b d(final char ch) {
        return b.d0.b(Character.getDirectionality(ch));
    }
    
    @f
    private static final boolean e(final char ch) {
        return Character.isDefined(ch);
    }
    
    @f
    private static final boolean f(final char ch) {
        return Character.isDigit(ch);
    }
    
    @f
    private static final boolean g(final char ch) {
        return Character.isHighSurrogate(ch);
    }
    
    @f
    private static final boolean h(final char ch) {
        return Character.isISOControl(ch);
    }
    
    @f
    private static final boolean i(final char ch) {
        return Character.isIdentifierIgnorable(ch);
    }
    
    @f
    private static final boolean j(final char ch) {
        return Character.isJavaIdentifierPart(ch);
    }
    
    @f
    private static final boolean k(final char ch) {
        return Character.isJavaIdentifierStart(ch);
    }
    
    @f
    private static final boolean l(final char ch) {
        return Character.isLetter(ch);
    }
    
    @f
    private static final boolean m(final char ch) {
        return Character.isLetterOrDigit(ch);
    }
    
    @f
    private static final boolean n(final char ch) {
        return Character.isLowSurrogate(ch);
    }
    
    @f
    private static final boolean o(final char ch) {
        return Character.isLowerCase(ch);
    }
    
    @f
    private static final boolean p(final char ch) {
        return Character.isTitleCase(ch);
    }
    
    @f
    private static final boolean q(final char ch) {
        return Character.isUpperCase(ch);
    }
    
    public static final boolean r(final char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final String s(final char c) {
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase = value.toLowerCase(Locale.ROOT);
        k0.o((Object)lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    @e
    public static final String t(final char c, @e final Locale locale) {
        k0.p((Object)locale, "locale");
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final String lowerCase = value.toLowerCase(locale);
        k0.o((Object)lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final char u(final char ch) {
        return Character.toLowerCase(ch);
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    @e
    public static final String v(final char c, @e final Locale locale) {
        k0.p((Object)locale, "locale");
        String s = B(c, locale);
        if (s.length() > 1) {
            if (c != '\u0149') {
                final char char1 = s.charAt(0);
                final String substring = s.substring(1);
                k0.o((Object)substring, "(this as java.lang.String).substring(startIndex)");
                Objects.requireNonNull(substring, "null cannot be cast to non-null type java.lang.String");
                final String lowerCase = substring.toLowerCase(Locale.ROOT);
                k0.o((Object)lowerCase, "(this as java.lang.Strin\u2026.toLowerCase(Locale.ROOT)");
                final StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(char1));
                sb.append(lowerCase);
                s = sb.toString();
            }
            return s;
        }
        final String value = String.valueOf(c);
        Objects.requireNonNull(value, "null cannot be cast to non-null type java.lang.String");
        final String upperCase = value.toUpperCase(Locale.ROOT);
        k0.o((Object)upperCase, "(this as java.lang.Strin\u2026.toUpperCase(Locale.ROOT)");
        if (k0.g((Object)s, (Object)upperCase) ^ true) {
            return s;
        }
        return String.valueOf(Character.toTitleCase(c));
    }
    
    @e1(version = "1.5")
    @f
    @o2(markerClass = { q.class })
    private static final char w(final char ch) {
        return Character.toTitleCase(ch);
    }
    
    @i(message = "Use lowercaseChar() instead.", replaceWith = @z0(expression = "lowercaseChar()", imports = {}))
    @j(warningSince = "1.5")
    @f
    private static final char x(final char ch) {
        return Character.toLowerCase(ch);
    }
    
    @i(message = "Use titlecaseChar() instead.", replaceWith = @z0(expression = "titlecaseChar()", imports = {}))
    @j(warningSince = "1.5")
    @f
    private static final char y(final char ch) {
        return Character.toTitleCase(ch);
    }
    
    @i(message = "Use uppercaseChar() instead.", replaceWith = @z0(expression = "uppercaseChar()", imports = {}))
    @j(warningSince = "1.5")
    @f
    private static final char z(final char ch) {
        return Character.toUpperCase(ch);
    }
}
