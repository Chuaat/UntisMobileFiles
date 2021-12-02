// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.f;
import kotlin.q;
import kotlin.o2;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0002\u0010\f\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\f\u0010\t\u001a\u00020\u0000*\u00020\u0001H\u0007\u001a\u0014\u0010\n\u001a\u00020\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007\u001a\f\u0010\f\u001a\u00020\u000b*\u00020\u0000H\u0007\u001a\u0015\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\r\u001a\u00020\u000bH\u0087\n\u001a\u001c\u0010\u0011\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u0000¨\u0006\u0013" }, d2 = { "", "", "F", "radix", "G", "H", "(C)Ljava/lang/Integer;", "I", "(CI)Ljava/lang/Integer;", "D", "E", "", "N", "other", "M", "", "ignoreCase", "J", "L", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/CharsKt")
class e extends d
{
    public e() {
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    public static final char D(final int i) {
        if (i >= 0 && 9 >= i) {
            return (char)(i + 48);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Int ");
        sb.append(i);
        sb.append(" is not a decimal digit");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    public static final char E(int i, final int n) {
        if (2 > n || 36 < n) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid radix: ");
            sb.append(n);
            sb.append(". Valid radix values are in range 2..36");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0 && i < n) {
            if (i < 10) {
                i += 48;
            }
            else {
                i = (char)(i + 65) - '\n';
            }
            return (char)i;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Digit ");
        sb2.append(i);
        sb2.append(" does not represent a valid digit in radix ");
        sb2.append(n);
        throw new IllegalArgumentException(sb2.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    public static final int F(final char c) {
        final int b = d.b(c, 10);
        if (b >= 0) {
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Char ");
        sb.append(c);
        sb.append(" is not a decimal digit");
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    public static final int G(final char c, final int i) {
        final Integer j = I(c, i);
        if (j != null) {
            return j;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Char ");
        sb.append(c);
        sb.append(" is not a digit in the given radix=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    @f
    public static final Integer H(final char c) {
        Integer value = d.b(c, 10);
        if (value.intValue() < 0) {
            value = null;
        }
        return value;
    }
    
    @e1(version = "1.5")
    @o2(markerClass = { q.class })
    @f
    public static final Integer I(final char c, int n) {
        c.a(n);
        Integer value = d.b(c, n);
        if (value.intValue() >= 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n == 0) {
            value = null;
        }
        return value;
    }
    
    public static final boolean J(final char ch, final char ch2, final boolean b) {
        final boolean b2 = true;
        if (ch == ch2) {
            return true;
        }
        if (!b) {
            return false;
        }
        final char upperCase = Character.toUpperCase(ch);
        final char upperCase2 = Character.toUpperCase(ch2);
        boolean b3 = b2;
        if (upperCase != upperCase2) {
            b3 = (Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2) && b2);
        }
        return b3;
    }
    
    public static final boolean L(final char c) {
        if ('\ud800' <= c) {
            if ('\udfff' >= c) {
                return true;
            }
        }
        return false;
    }
    
    @kotlin.internal.f
    private static final String M(final char c, final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(c));
        sb.append(str);
        return sb.toString();
    }
    
    @e1(version = "1.5")
    @org.jetbrains.annotations.e
    public static final String N(final char c) {
        return j0.a(c);
    }
}
