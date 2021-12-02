// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.math.MathContext;
import java.math.BigDecimal;
import n6.l;
import m6.g;
import kotlin.j;
import kotlin.i;
import org.jetbrains.annotations.f;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import java.math.BigInteger;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0010\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0006\u001a\u00020\u0003*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0015\u0010\t\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u000b\u001a\u00020\n*\u00020\u0003H\u0087\b\u001a\u0016\u0010\f\u001a\u00020\n*\u0004\u0018\u00010\u0003H\u0087\b¢\u0006\u0004\b\f\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0000*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u000f\u001a\u00020\u0000*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0005*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0005*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\b*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0015\u001a\u00020\b*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u0018*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0016*\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0018*\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\u0003H\u0087\b\u001a\u0015\u0010 \u001a\u00020\u001e*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u000e\u0010!\u001a\u0004\u0018\u00010\u001e*\u00020\u0003H\u0007\u001a\u0016\u0010\"\u001a\u0004\u0018\u00010\u001e*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u001a\r\u0010$\u001a\u00020#*\u00020\u0003H\u0087\b\u001a\u0015\u0010'\u001a\u00020#*\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0087\b\u001a\u000e\u0010(\u001a\u0004\u0018\u00010#*\u00020\u0003H\u0007\u001a\u0016\u0010)\u001a\u0004\u0018\u00010#*\u00020\u00032\u0006\u0010&\u001a\u00020%H\u0007\u001a4\u0010.\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010*2\u0006\u0010+\u001a\u00020\u00032\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000,H\u0082\b¢\u0006\u0004\b.\u0010/¨\u00060" }, d2 = { "", "", "radix", "", "Q0", "", "T0", "R0", "", "S0", "", "C0", "D0", "(Ljava/lang/String;)Z", "E0", "F0", "O0", "P0", "K0", "L0", "M0", "N0", "", "I0", "", "G0", "J0", "(Ljava/lang/String;)Ljava/lang/Float;", "H0", "(Ljava/lang/String;)Ljava/lang/Double;", "Ljava/math/BigInteger;", "y0", "z0", "A0", "B0", "Ljava/math/BigDecimal;", "u0", "Ljava/math/MathContext;", "mathContext", "v0", "w0", "x0", "T", "str", "Lkotlin/Function1;", "parse", "t0", "(Ljava/lang/String;Ln6/l;)Ljava/lang/Object;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class z extends y
{
    public z() {
    }
    
    @e1(version = "1.2")
    @f
    public static final BigInteger A0(@e final String s) {
        k0.p((Object)s, "$this$toBigIntegerOrNull");
        return B0(s, 10);
    }
    
    @e1(version = "1.2")
    @f
    public static final BigInteger B0(@e final String val, final int n) {
        k0.p((Object)val, "$this$toBigIntegerOrNull");
        c.a(n);
        final int length = val.length();
        if (length != 0) {
            int i = 0;
            if (length != 1) {
                if (val.charAt(0) == '-') {
                    i = 1;
                }
                while (i < length) {
                    if (d.b(val.charAt(i), n) < 0) {
                        return null;
                    }
                    ++i;
                }
            }
            else if (d.b(val.charAt(0), n) < 0) {
                return null;
            }
            return new BigInteger(val, c.a(n));
        }
        return null;
    }
    
    @e1(version = "1.4")
    @kotlin.internal.f
    @g(name = "toBooleanNullable")
    private static final boolean D0(final String s) {
        return Boolean.parseBoolean(s);
    }
    
    @kotlin.internal.f
    private static final byte E0(final String s) {
        return Byte.parseByte(s);
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final byte F0(final String s, final int n) {
        return Byte.parseByte(s, c.a(n));
    }
    
    @kotlin.internal.f
    private static final double G0(final String s) {
        return Double.parseDouble(s);
    }
    
    @e1(version = "1.1")
    @f
    public static Double H0(@e final String s) {
        k0.p((Object)s, "$this$toDoubleOrNull");
        Double value = null;
        try {
            if (r.a.i(s)) {
                value = Double.parseDouble(s);
            }
            return value;
        }
        catch (NumberFormatException ex) {
            value = value;
            return value;
        }
    }
    
    @kotlin.internal.f
    private static final float I0(final String s) {
        return Float.parseFloat(s);
    }
    
    @e1(version = "1.1")
    @f
    public static Float J0(@e final String s) {
        k0.p((Object)s, "$this$toFloatOrNull");
        Float value = null;
        try {
            if (r.a.i(s)) {
                value = Float.parseFloat(s);
            }
            return value;
        }
        catch (NumberFormatException ex) {
            value = value;
            return value;
        }
    }
    
    @kotlin.internal.f
    private static final int K0(final String s) {
        return Integer.parseInt(s);
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final int L0(final String s, final int n) {
        return Integer.parseInt(s, c.a(n));
    }
    
    @kotlin.internal.f
    private static final long M0(final String s) {
        return Long.parseLong(s);
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final long N0(final String s, final int n) {
        return Long.parseLong(s, c.a(n));
    }
    
    @kotlin.internal.f
    private static final short O0(final String s) {
        return Short.parseShort(s);
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final short P0(final String s, final int n) {
        return Short.parseShort(s, c.a(n));
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final String Q0(final byte i, final int n) {
        final String string = Integer.toString(i, c.a(c.a(n)));
        k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final String R0(final int i, final int n) {
        final String string = Integer.toString(i, c.a(n));
        k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final String S0(final long i, final int n) {
        final String string = Long.toString(i, c.a(n));
        k0.o((Object)string, "java.lang.Long.toString(this, checkRadix(radix))");
        return string;
    }
    
    @e1(version = "1.1")
    @kotlin.internal.f
    private static final String T0(final short i, final int n) {
        final String string = Integer.toString(i, c.a(c.a(n)));
        k0.o((Object)string, "java.lang.Integer.toStri\u2026(this, checkRadix(radix))");
        return string;
    }
    
    private static final <T> T t0(final String s, final l<? super String, ? extends T> l) {
        Object invoke;
        final Object o = invoke = null;
        try {
            if (r.a.i(s)) {
                invoke = l.invoke((Object)s);
            }
            return (T)invoke;
        }
        catch (NumberFormatException ex) {
            invoke = o;
            return (T)invoke;
        }
    }
    
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal u0(final String val) {
        return new BigDecimal(val);
    }
    
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigDecimal v0(final String val, final MathContext mc) {
        return new BigDecimal(val, mc);
    }
    
    @e1(version = "1.2")
    @f
    public static final BigDecimal w0(@e final String val) {
        k0.p((Object)val, "$this$toBigDecimalOrNull");
        BigDecimal bigDecimal2;
        final BigDecimal bigDecimal = bigDecimal2 = null;
        try {
            if (r.a.i(val)) {
                bigDecimal2 = new BigDecimal(val);
            }
            return bigDecimal2;
        }
        catch (NumberFormatException ex) {
            bigDecimal2 = bigDecimal;
            return bigDecimal2;
        }
    }
    
    @e1(version = "1.2")
    @f
    public static final BigDecimal x0(@e final String val, @e final MathContext mc) {
        k0.p((Object)val, "$this$toBigDecimalOrNull");
        k0.p((Object)mc, "mathContext");
        BigDecimal bigDecimal2;
        final BigDecimal bigDecimal = bigDecimal2 = null;
        try {
            if (r.a.i(val)) {
                bigDecimal2 = new BigDecimal(val, mc);
            }
            return bigDecimal2;
        }
        catch (NumberFormatException ex) {
            bigDecimal2 = bigDecimal;
            return bigDecimal2;
        }
    }
    
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger y0(final String val) {
        return new BigInteger(val);
    }
    
    @e1(version = "1.2")
    @kotlin.internal.f
    private static final BigInteger z0(final String val, final int n) {
        return new BigInteger(val, c.a(n));
    }
}
