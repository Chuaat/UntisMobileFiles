// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.comparisons;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.internal.f;
import kotlin.e1;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000Z\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0013\n\u0002\b\u0017\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0019\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u0019\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b\u001a\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u001a7\u0010\u0013\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\b\u001a!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0087\b\u001a!\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0087\b\u001a!\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0087\b\u001a!\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\b\u001a;\u0010\u001d\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b\"\u00028\u0000H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010 \u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u001c\u001a\u00020\u001f\"\u00020\u0006H\u0007\u001a\u001c\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\n\u0010\u001c\u001a\u00020!\"\u00020\bH\u0007\u001a\u001c\u0010#\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u001c\u001a\u00020\"\"\u00020\nH\u0007\u001a\u001c\u0010%\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u001c\u001a\u00020$\"\u00020\fH\u0007\u001a\u001c\u0010'\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\u001c\u001a\u00020&\"\u00020\u000eH\u0007\u001a\u001c\u0010)\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\u001c\u001a\u00020(\"\u00020\u0010H\u0007\u001a/\u0010*\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b*\u0010\u0005\u001a\u0019\u0010+\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u0019\u0010,\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u0019\u0010-\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u0019\u0010.\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u0019\u0010/\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000eH\u0087\b\u001a\u0019\u00100\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u001a7\u00101\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b1\u0010\u0014\u001a!\u00102\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0087\b\u001a!\u00103\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0087\b\u001a!\u00104\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0087\b\u001a!\u00105\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fH\u0087\b\u001a!\u00106\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0087\b\u001a!\u00107\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0087\b\u001a;\u00108\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\u001c\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b\"\u00028\u0000H\u0007¢\u0006\u0004\b8\u0010\u001e\u001a\u001c\u00109\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\u001c\u001a\u00020\u001f\"\u00020\u0006H\u0007\u001a\u001c\u0010:\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\n\u0010\u001c\u001a\u00020!\"\u00020\bH\u0007\u001a\u001c\u0010;\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u001c\u001a\u00020\"\"\u00020\nH\u0007\u001a\u001c\u0010<\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\f2\n\u0010\u001c\u001a\u00020$\"\u00020\fH\u0007\u001a\u001c\u0010=\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\u001c\u001a\u00020&\"\u00020\u000eH\u0007\u001a\u001c\u0010>\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\u001c\u001a\u00020(\"\u00020\u0010H\u0007¨\u0006?" }, d2 = { "", "T", "a", "b", "O", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "z", "", "R", "", "I", "", "L", "", "F", "", "C", "c", "P", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "A", "S", "J", "M", "G", "D", "", "other", "Q", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "B", "", "", "K", "", "N", "", "H", "", "E", "j0", "U", "m0", "d0", "g0", "a0", "X", "k0", "V", "n0", "e0", "h0", "b0", "Y", "l0", "W", "o0", "f0", "i0", "c0", "Z", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/comparisons/ComparisonsKt")
class c extends b
{
    public c() {
    }
    
    @e1(version = "1.1")
    @f
    private static final byte A(final byte a, final byte a2, final byte b) {
        return (byte)Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final byte B(final byte b, @e final byte... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        byte a = b;
        byte b2;
        for (int i = n; i < length; ++i, a = b2) {
            b2 = (byte)Math.max(a, array[i]);
        }
        return a;
    }
    
    @e1(version = "1.1")
    @f
    private static final double C(final double a, final double b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final double D(final double a, final double a2, final double b) {
        return Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final double E(double max, @e final double... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    
    @e1(version = "1.1")
    @f
    private static final float F(final float a, final float b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final float G(final float a, final float a2, final float b) {
        return Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final float H(float max, @e final float... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    
    @e1(version = "1.1")
    @f
    private static final int I(final int a, final int b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final int J(final int a, final int a2, final int b) {
        return Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final int K(int max, @e final int... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    
    @e1(version = "1.1")
    @f
    private static final long L(final long a, final long b) {
        return Math.max(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final long M(final long a, final long a2, final long b) {
        return Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final long N(long max, @e final long... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            max = Math.max(max, array[i]);
        }
        return max;
    }
    
    @e1(version = "1.1")
    @e
    public static <T extends Comparable<? super T>> T O(@e T t, @e final T t2) {
        k0.p(t, "a");
        k0.p(t2, "b");
        if (t.compareTo((Object)t2) < 0) {
            t = t2;
        }
        return t;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T extends Comparable<? super T>> T P(@e final T t, @e final T t2, @e final T t3) {
        k0.p(t, "a");
        k0.p(t2, "b");
        k0.p(t3, "c");
        return a.O(t, a.O(t2, t3));
    }
    
    @e1(version = "1.4")
    @e
    public static final <T extends Comparable<? super T>> T Q(@e T o, @e final T... array) {
        k0.p(o, "a");
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            o = a.O(o, array[i]);
        }
        return o;
    }
    
    @e1(version = "1.1")
    @f
    private static final short R(final short a, final short b) {
        return (short)Math.max(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final short S(final short a, final short a2, final short b) {
        return (short)Math.max(a, Math.max(a2, b));
    }
    
    @e1(version = "1.4")
    public static final short T(final short n, @e final short... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n2 = 0;
        short a = n;
        short n3;
        for (int i = n2; i < length; ++i, a = n3) {
            n3 = (short)Math.max(a, array[i]);
        }
        return a;
    }
    
    @e1(version = "1.1")
    @f
    private static final byte U(final byte a, final byte b) {
        return (byte)Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final byte V(final byte a, final byte a2, final byte b) {
        return (byte)Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final byte W(final byte b, @e final byte... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        byte a = b;
        byte b2;
        for (int i = n; i < length; ++i, a = b2) {
            b2 = (byte)Math.min(a, array[i]);
        }
        return a;
    }
    
    @e1(version = "1.1")
    @f
    private static final double X(final double a, final double b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final double Y(final double a, final double a2, final double b) {
        return Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final double Z(double min, @e final double... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
    
    @e1(version = "1.1")
    @f
    private static final float a0(final float a, final float b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final float b0(final float a, final float a2, final float b) {
        return Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final float c0(float min, @e final float... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
    
    @e1(version = "1.1")
    @f
    private static final int d0(final int a, final int b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final int e0(final int a, final int a2, final int b) {
        return Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final int f0(int i, @e final int... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n = 0;
        int min = i;
        for (i = n; i < length; ++i) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
    
    @e1(version = "1.1")
    @f
    private static final long g0(final long a, final long b) {
        return Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final long h0(final long a, final long a2, final long b) {
        return Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final long i0(long min, @e final long... array) {
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            min = Math.min(min, array[i]);
        }
        return min;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T extends Comparable<? super T>> T j0(@e T t, @e final T t2) {
        k0.p(t, "a");
        k0.p(t2, "b");
        if (t.compareTo((Object)t2) > 0) {
            t = t2;
        }
        return t;
    }
    
    @e1(version = "1.1")
    @e
    public static final <T extends Comparable<? super T>> T k0(@e final T t, @e final T t2, @e final T t3) {
        k0.p(t, "a");
        k0.p(t2, "b");
        k0.p(t3, "c");
        return j0(t, j0(t2, t3));
    }
    
    @e1(version = "1.4")
    @e
    public static final <T extends Comparable<? super T>> T l0(@e T j0, @e final T... array) {
        k0.p(j0, "a");
        k0.p(array, "other");
        for (int length = array.length, i = 0; i < length; ++i) {
            j0 = j0(j0, array[i]);
        }
        return j0;
    }
    
    @e1(version = "1.1")
    @f
    private static final short m0(final short a, final short b) {
        return (short)Math.min(a, b);
    }
    
    @e1(version = "1.1")
    @f
    private static final short n0(final short a, final short a2, final short b) {
        return (short)Math.min(a, Math.min(a2, b));
    }
    
    @e1(version = "1.4")
    public static final short o0(final short n, @e final short... array) {
        k0.p(array, "other");
        final int length = array.length;
        final int n2 = 0;
        short a = n;
        short n3;
        for (int i = n2; i < length; ++i, a = n3) {
            n3 = (short)Math.min(a, array[i]);
        }
        return a;
    }
    
    @e1(version = "1.1")
    @f
    private static final byte z(final byte a, final byte b) {
        return (byte)Math.max(a, b);
    }
}
