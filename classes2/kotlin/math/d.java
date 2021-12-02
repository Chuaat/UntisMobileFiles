// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.math;

import kotlin.internal.f;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\bD\u001a\u0011\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0019\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0019\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0007\u001a\u0011\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0010\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0011\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0011\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0011\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0019\u0010!\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0087\b\u001a\u0019\u0010\"\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010&\u001a\u00020\u0000*\u00020\u00002\u0006\u0010%\u001a\u00020$H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010'\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010)\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020\u0000H\u0087\b\u001a\u0015\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010(\u001a\u00020$H\u0087\b\u001a\r\u0010+\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\r\u0010,\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\u0015\u0010.\u001a\u00020\u0000*\u00020\u00002\u0006\u0010-\u001a\u00020\u0000H\u0087\b\u001a\f\u0010/\u001a\u00020$*\u00020\u0000H\u0007\u001a\f\u00101\u001a\u000200*\u00020\u0000H\u0007\u001a\u0011\u00103\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010\u0001\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u00104\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u00105\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u00106\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u00107\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0019\u00108\u001a\u0002022\u0006\u0010\b\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u00109\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010:\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010;\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010%\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010<\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010=\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0019\u0010>\u001a\u0002022\u0006\u0010\u0001\u001a\u0002022\u0006\u0010\b\u001a\u000202H\u0087\b\u001a\u0011\u0010?\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010@\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010A\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0018\u0010B\u001a\u0002022\u0006\u0010\u0001\u001a\u0002022\u0006\u0010\u0013\u001a\u000202H\u0007\u001a\u0011\u0010C\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010D\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0010\u0010E\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0007\u001a\u0011\u0010F\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010G\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010H\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0010\u0010I\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0007\u001a\u0011\u0010J\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010K\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0011\u0010L\u001a\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0019\u0010M\u001a\u0002022\u0006\u0010\u001f\u001a\u0002022\u0006\u0010 \u001a\u000202H\u0087\b\u001a\u0019\u0010N\u001a\u0002022\u0006\u0010\u001f\u001a\u0002022\u0006\u0010 \u001a\u000202H\u0087\b\u001a\u0015\u0010O\u001a\u000202*\u0002022\u0006\u0010\u0001\u001a\u000202H\u0087\b\u001a\u0015\u0010P\u001a\u000202*\u0002022\u0006\u0010%\u001a\u00020$H\u0087\b\u001a\u0015\u0010 \u001a\u000202*\u0002022\u0006\u0010'\u001a\u000202H\u0087\b\u001a\u0015\u0010Q\u001a\u000202*\u0002022\u0006\u0010(\u001a\u000202H\u0087\b\u001a\u0015\u0010R\u001a\u000202*\u0002022\u0006\u0010(\u001a\u00020$H\u0087\b\u001a\r\u0010S\u001a\u000202*\u000202H\u0087\b\u001a\r\u0010T\u001a\u000202*\u000202H\u0087\b\u001a\u0015\u0010U\u001a\u000202*\u0002022\u0006\u0010-\u001a\u000202H\u0087\b\u001a\f\u0010V\u001a\u00020$*\u000202H\u0007\u001a\f\u0010W\u001a\u000200*\u000202H\u0007\u001a\u0011\u0010X\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0087\b\u001a\u0019\u0010Y\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$H\u0087\b\u001a\u0019\u0010Z\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020$2\u0006\u0010 \u001a\u00020$H\u0087\b\u001a\u0011\u0010[\u001a\u0002002\u0006\u0010%\u001a\u000200H\u0087\b\u001a\u0019\u0010\\\u001a\u0002002\u0006\u0010\u001f\u001a\u0002002\u0006\u0010 \u001a\u000200H\u0087\b\u001a\u0019\u0010]\u001a\u0002002\u0006\u0010\u001f\u001a\u0002002\u0006\u0010 \u001a\u000200H\u0087\b\"!\u0010b\u001a\u000202*\u0002028\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010a\u001a\u0004\b^\u0010_\" \u0010(\u001a\u00020$*\u0002008F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010f\u001a\u0004\bc\u0010d\" \u0010(\u001a\u00020$*\u00020$8F@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010i\u001a\u0004\bg\u0010h\"!\u0010b\u001a\u000200*\u0002008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010f\u001a\u0004\bj\u0010k\"!\u0010(\u001a\u000202*\u0002028\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010a\u001a\u0004\bl\u0010_\"!\u0010b\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010o\u001a\u0004\bm\u0010n\"!\u0010r\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010o\u001a\u0004\bp\u0010n\"!\u0010b\u001a\u00020$*\u00020$8\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\b`\u0010i\u001a\u0004\bs\u0010h\"!\u0010(\u001a\u00020\u0000*\u00020\u00008\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\be\u0010o\u001a\u0004\bt\u0010n\"!\u0010r\u001a\u000202*\u0002028\u00c6\u0002@\u0007X\u0087\u0004¢\u0006\f\u0012\u0004\bq\u0010a\u001a\u0004\bu\u0010_¨\u0006v" }, d2 = { "", "x", "M0", "w", "S0", "k", "g", "o", "y", "q", "O0", "U0", "m", "i", "s", "a0", "Q0", "A", "C", "base", "g0", "c0", "i0", "k0", "e0", "u", "E", "W0", "E0", "c", "K0", "a", "b", "q0", "m0", "A0", "", "n", "B0", "divisor", "sign", "Y0", "Z0", "y0", "u0", "to", "w0", "G0", "", "I0", "", "N0", "T0", "l", "h", "p", "r", "P0", "z", "V0", "j", "t", "b0", "R0", "B", "D", "h0", "d0", "j0", "l0", "f0", "v", "F", "X0", "F0", "d", "L0", "r0", "n0", "C0", "D0", "a1", "b1", "z0", "v0", "x0", "H0", "J0", "e", "s0", "o0", "f", "t0", "p0", "H", "(F)F", "getAbsoluteValue$annotations", "(F)V", "absoluteValue", "R", "(J)I", "getSign$annotations", "(J)V", "Q", "(I)I", "(I)V", "J", "(J)J", "P", "G", "(D)D", "(D)V", "W", "getUlp$annotations", "ulp", "I", "O", "X", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/math/MathKt")
class d extends c
{
    public d() {
    }
    
    @e1(version = "1.2")
    @f
    private static final double A(final double a) {
        return Math.exp(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double A0(final double a, final double b) {
        return Math.pow(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final float B(final float n) {
        return (float)Math.exp(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double B0(final double a, final int n) {
        return Math.pow(a, n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double C(final double x) {
        return Math.expm1(x);
    }
    
    @e1(version = "1.2")
    @f
    private static final float C0(final float n, final float n2) {
        return (float)Math.pow(n, n2);
    }
    
    @e1(version = "1.2")
    @f
    private static final float D(final float n) {
        return (float)Math.expm1(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float D0(final float n, final int n2) {
        return (float)Math.pow(n, n2);
    }
    
    @e1(version = "1.2")
    @f
    private static final double E(final double a) {
        return Math.floor(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double E0(final double a) {
        return Math.rint(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float F(final float n) {
        return (float)Math.floor(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float F0(final float n) {
        return (float)Math.rint(n);
    }
    
    private static final double G(final double a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    public static int G0(final double n) {
        if (!Double.isNaN(n)) {
            int n2 = Integer.MAX_VALUE;
            if (n <= Integer.MAX_VALUE) {
                if (n < Integer.MIN_VALUE) {
                    n2 = Integer.MIN_VALUE;
                }
                else {
                    n2 = (int)Math.round(n);
                }
            }
            return n2;
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    private static final float H(final float a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    public static int H0(final float n) {
        if (!Float.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    private static final int I(final int a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    public static final long I0(final double n) {
        if (!Double.isNaN(n)) {
            return Math.round(n);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }
    
    private static final long J(final long a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    public static final long J0(final float n) {
        return I0(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double K0(final double d) {
        return Math.signum(d);
    }
    
    @e1(version = "1.2")
    @f
    private static final float L0(final float f) {
        return Math.signum(f);
    }
    
    @e1(version = "1.2")
    @f
    private static final double M0(final double a) {
        return Math.sin(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float N0(final float n) {
        return (float)Math.sin(n);
    }
    
    private static final double O(final double d) {
        return Math.signum(d);
    }
    
    @e1(version = "1.2")
    @f
    private static final double O0(final double x) {
        return Math.sinh(x);
    }
    
    private static final float P(final float f) {
        return Math.signum(f);
    }
    
    @e1(version = "1.2")
    @f
    private static final float P0(final float n) {
        return (float)Math.sinh(n);
    }
    
    public static int Q(int n) {
        if (n < 0) {
            n = -1;
        }
        else if (n > 0) {
            n = 1;
        }
        else {
            n = 0;
        }
        return n;
    }
    
    @e1(version = "1.2")
    @f
    private static final double Q0(final double a) {
        return Math.sqrt(a);
    }
    
    public static int R(final long n) {
        final long n2 = lcmp(n, 0L);
        int n3;
        if (n2 < 0) {
            n3 = -1;
        }
        else if (n2 > 0) {
            n3 = 1;
        }
        else {
            n3 = 0;
        }
        return n3;
    }
    
    @e1(version = "1.2")
    @f
    private static final float R0(final float n) {
        return (float)Math.sqrt(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double S0(final double a) {
        return Math.tan(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float T0(final float n) {
        return (float)Math.tan(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double U0(final double x) {
        return Math.tanh(x);
    }
    
    @e1(version = "1.2")
    @f
    private static final float V0(final float n) {
        return (float)Math.tanh(n);
    }
    
    private static final double W(final double d) {
        return Math.ulp(d);
    }
    
    @e1(version = "1.2")
    public static final double W0(final double n) {
        double n2 = n;
        if (!Double.isNaN(n)) {
            if (Double.isInfinite(n)) {
                n2 = n;
            }
            else if (n > 0) {
                n2 = Math.floor(n);
            }
            else {
                n2 = Math.ceil(n);
            }
        }
        return n2;
    }
    
    private static final float X(final float f) {
        return Math.ulp(f);
    }
    
    @e1(version = "1.2")
    public static final float X0(final float n) {
        float n2 = n;
        if (!Float.isNaN(n)) {
            if (Float.isInfinite(n)) {
                n2 = n;
            }
            else {
                double n3;
                if (n > 0) {
                    n3 = Math.floor(n);
                }
                else {
                    n3 = Math.ceil(n);
                }
                n2 = (float)n3;
            }
        }
        return n2;
    }
    
    @e1(version = "1.2")
    @f
    private static final double Y0(final double magnitude, final double sign) {
        return Math.copySign(magnitude, sign);
    }
    
    @e1(version = "1.2")
    @f
    private static final double Z0(final double magnitude, final int n) {
        return Math.copySign(magnitude, n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double a(final double f1, final double f2) {
        return Math.IEEEremainder(f1, f2);
    }
    
    @e1(version = "1.2")
    @f
    private static final double a0(final double x, final double y) {
        return Math.hypot(x, y);
    }
    
    @e1(version = "1.2")
    @f
    private static final float a1(final float magnitude, final float sign) {
        return Math.copySign(magnitude, sign);
    }
    
    @e1(version = "1.2")
    @f
    private static final float b(final float n, final float n2) {
        return (float)Math.IEEEremainder(n, n2);
    }
    
    @e1(version = "1.2")
    @f
    private static final float b0(final float n, final float n2) {
        return (float)Math.hypot(n, n2);
    }
    
    @e1(version = "1.2")
    @f
    private static final float b1(final float magnitude, final int n) {
        return Math.copySign(magnitude, (float)n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double c(final double a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double c0(final double a) {
        return Math.log(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float d(final float a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float d0(final float n) {
        return (float)Math.log(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final int e(final int a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double e0(final double x) {
        return Math.log1p(x);
    }
    
    @e1(version = "1.2")
    @f
    private static final long f(final long a) {
        return Math.abs(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float f0(final float n) {
        return (float)Math.log1p(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double g(final double a) {
        return Math.acos(a);
    }
    
    @e1(version = "1.2")
    public static final double g0(final double a, final double a2) {
        if (a2 > 0.0 && a2 != 1.0) {
            return Math.log(a) / Math.log(a2);
        }
        return Double.NaN;
    }
    
    @e1(version = "1.2")
    @f
    private static final float h(final float n) {
        return (float)Math.acos(n);
    }
    
    @e1(version = "1.2")
    public static final float h0(final float n, final float n2) {
        if (n2 > 0.0f && n2 != 1.0f) {
            return (float)(Math.log(n) / Math.log(n2));
        }
        return Float.NaN;
    }
    
    @e1(version = "1.2")
    public static final double i(double a) {
        final double n = 1;
        if (a < n) {
            a = Double.NaN;
        }
        else if (a > a.e) {
            a = Math.log(a) + a.a;
        }
        else {
            final double a2 = a - n;
            if (a2 >= a.d) {
                a = Math.log(a + Math.sqrt(a * a - n));
            }
            else {
                final double n2 = a = Math.sqrt(a2);
                if (n2 >= a.c) {
                    a = n2 - n2 * n2 * n2 / 12;
                }
                a *= Math.sqrt(2.0);
            }
        }
        return a;
    }
    
    @e1(version = "1.2")
    @f
    private static final double i0(final double a) {
        return Math.log10(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final float j(final float n) {
        return (float)i(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float j0(final float n) {
        return (float)Math.log10(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double k(final double a) {
        return Math.asin(a);
    }
    
    @e1(version = "1.2")
    public static final double k0(final double a) {
        return Math.log(a) / a.a;
    }
    
    @e1(version = "1.2")
    @f
    private static final float l(final float n) {
        return (float)Math.asin(n);
    }
    
    @e1(version = "1.2")
    public static final float l0(final float n) {
        return (float)(Math.log(n) / a.a);
    }
    
    @e1(version = "1.2")
    public static final double m(double n) {
        final double d = a.d;
        double log;
        if (n >= d) {
            double sqrt;
            if (n > a.f) {
                if (n > a.e) {
                    log = Math.log(n) + a.a;
                    return log;
                }
                n *= 2;
                sqrt = 1 / n;
            }
            else {
                sqrt = Math.sqrt(n * n + 1);
            }
            log = Math.log(n + sqrt);
        }
        else if (n <= -d) {
            log = -m(-n);
        }
        else {
            log = n;
            if (Math.abs(n) >= a.c) {
                log = n - n * n * n / 6;
            }
        }
        return log;
    }
    
    @e1(version = "1.2")
    @f
    private static final double m0(final double a, final double b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final float n(final float n) {
        return (float)m(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float n0(final float a, final float b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final double o(final double a) {
        return Math.atan(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final int o0(final int a, final int b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final float p(final float n) {
        return (float)Math.atan(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final long p0(final long a, final long b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final double q(final double y, final double x) {
        return Math.atan2(y, x);
    }
    
    @e1(version = "1.2")
    @f
    private static final double q0(final double a, final double b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final float r(final float n, final float n2) {
        return (float)Math.atan2(n, n2);
    }
    
    @e1(version = "1.2")
    @f
    private static final float r0(final float a, final float b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.2")
    public static final double s(final double n) {
        if (Math.abs(n) < a.d) {
            double n2 = n;
            if (Math.abs(n) > a.c) {
                n2 = n + n * n * n / 3;
            }
            return n2;
        }
        final double n3 = 1;
        return Math.log((n3 + n) / (n3 - n)) / 2;
    }
    
    @e1(version = "1.2")
    @f
    private static final int s0(final int a, final int b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final float t(final float n) {
        return (float)s(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final long t0(final long a, final long b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.2")
    @f
    private static final double u(final double a) {
        return Math.ceil(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double u0(final double start) {
        return Math.nextAfter(start, Double.NEGATIVE_INFINITY);
    }
    
    @e1(version = "1.2")
    @f
    private static final float v(final float n) {
        return (float)Math.ceil(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float v0(final float start) {
        return Math.nextAfter(start, Double.NEGATIVE_INFINITY);
    }
    
    @e1(version = "1.2")
    @f
    private static final double w(final double a) {
        return Math.cos(a);
    }
    
    @e1(version = "1.2")
    @f
    private static final double w0(final double start, final double direction) {
        return Math.nextAfter(start, direction);
    }
    
    @e1(version = "1.2")
    @f
    private static final float x(final float n) {
        return (float)Math.cos(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float x0(final float start, final float n) {
        return Math.nextAfter(start, n);
    }
    
    @e1(version = "1.2")
    @f
    private static final double y(final double x) {
        return Math.cosh(x);
    }
    
    @e1(version = "1.2")
    @f
    private static final double y0(final double d) {
        return Math.nextUp(d);
    }
    
    @e1(version = "1.2")
    @f
    private static final float z(final float n) {
        return (float)Math.cosh(n);
    }
    
    @e1(version = "1.2")
    @f
    private static final float z0(final float f) {
        return Math.nextUp(f);
    }
}
