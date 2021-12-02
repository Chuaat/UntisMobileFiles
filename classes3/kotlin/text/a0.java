// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0010\u000e\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\r\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u0004*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0011*\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0011*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¨\u0006\u0019" }, d2 = { "", "", "V0", "(Ljava/lang/String;)Ljava/lang/Byte;", "", "radix", "W0", "(Ljava/lang/String;I)Ljava/lang/Byte;", "", "b1", "(Ljava/lang/String;)Ljava/lang/Short;", "c1", "(Ljava/lang/String;I)Ljava/lang/Short;", "X0", "(Ljava/lang/String;)Ljava/lang/Integer;", "Y0", "(Ljava/lang/String;I)Ljava/lang/Integer;", "", "Z0", "(Ljava/lang/String;)Ljava/lang/Long;", "a1", "(Ljava/lang/String;I)Ljava/lang/Long;", "input", "", "U0", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class a0 extends z
{
    public a0() {
    }
    
    @e
    public static final Void U0(@e final String str) {
        k0.p((Object)str, "input");
        final StringBuilder sb = new StringBuilder();
        sb.append("Invalid number format: '");
        sb.append(str);
        sb.append('\'');
        throw new NumberFormatException(sb.toString());
    }
    
    @e1(version = "1.1")
    @f
    public static final Byte V0(@e final String s) {
        k0.p((Object)s, "$this$toByteOrNull");
        return s.W0(s, 10);
    }
    
    @e1(version = "1.1")
    @f
    public static Byte W0(@e final String s, int intValue) {
        k0.p((Object)s, "$this$toByteOrNull");
        final Integer y0 = s.Y0(s, intValue);
        if (y0 != null) {
            intValue = y0;
            if (intValue >= -128) {
                if (intValue <= 127) {
                    return (byte)intValue;
                }
            }
        }
        return null;
    }
    
    @e1(version = "1.1")
    @f
    public static Integer X0(@e final String s) {
        k0.p((Object)s, "$this$toIntOrNull");
        return s.Y0(s, 10);
    }
    
    @e1(version = "1.1")
    @f
    public static Integer Y0(@e final String s, final int n) {
        k0.p((Object)s, "$this$toIntOrNull");
        c.a(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        final int t = k0.t((int)char1, 48);
        int n2 = -2147483647;
        int j = 1;
        boolean b;
        if (t < 0) {
            if (length == 1) {
                return null;
            }
            if (char1 == '-') {
                n2 = Integer.MIN_VALUE;
                b = true;
            }
            else {
                if (char1 != '+') {
                    return null;
                }
                b = false;
            }
        }
        else {
            b = false;
            j = 0;
        }
        int n3 = -59652323;
        while (j < length) {
            final int b2 = d.b(s.charAt(j), n);
            if (b2 < 0) {
                return null;
            }
            int n4;
            if (i < (n4 = n3) && (n3 != -59652323 || i < (n4 = n2 / n))) {
                return null;
            }
            final int n5 = i * n;
            if (n5 < n2 + b2) {
                return null;
            }
            i = n5 - b2;
            ++j;
            n3 = n4;
        }
        Integer n6;
        if (b) {
            n6 = i;
        }
        else {
            n6 = -i;
        }
        return n6;
    }
    
    @e1(version = "1.1")
    @f
    public static Long Z0(@e final String s) {
        k0.p((Object)s, "$this$toLongOrNull");
        return s.a1(s, 10);
    }
    
    @e1(version = "1.1")
    @f
    public static Long a1(@e final String s, final int n) {
        k0.p((Object)s, "$this$toLongOrNull");
        c.a(n);
        final int length = s.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        final char char1 = s.charAt(0);
        final int t = k0.t((int)char1, 48);
        long n2 = -9223372036854775807L;
        boolean b = true;
        Label_0094: {
            if (t < 0) {
                if (length == 1) {
                    return null;
                }
                if (char1 == '-') {
                    n2 = Long.MIN_VALUE;
                    i = 1;
                    break Label_0094;
                }
                if (char1 != '+') {
                    return null;
                }
                i = 1;
            }
            b = false;
        }
        long l = 0L;
        long n3 = -256204778801521550L;
        while (i < length) {
            final int b2 = d.b(s.charAt(i), n);
            if (b2 < 0) {
                return null;
            }
            long n4 = n3;
            if (l < n3 && (n3 != -256204778801521550L || l < (n4 = n2 / n))) {
                return null;
            }
            final long n5 = l * n;
            final long n6 = b2;
            if (n5 < n2 + n6) {
                return null;
            }
            l = n5 - n6;
            ++i;
            n3 = n4;
        }
        Long n7;
        if (b) {
            n7 = l;
        }
        else {
            n7 = -l;
        }
        return n7;
    }
    
    @e1(version = "1.1")
    @f
    public static final Short b1(@e final String s) {
        k0.p((Object)s, "$this$toShortOrNull");
        return s.c1(s, 10);
    }
    
    @e1(version = "1.1")
    @f
    public static Short c1(@e final String s, int intValue) {
        k0.p((Object)s, "$this$toShortOrNull");
        final Integer y0 = s.Y0(s, intValue);
        if (y0 != null) {
            intValue = y0;
            if (intValue >= -32768) {
                if (intValue <= 32767) {
                    return (short)intValue;
                }
            }
        }
        return null;
    }
}
