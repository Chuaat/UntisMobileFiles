// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.types;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Collections;
import java.util.Set;
import java.math.BigInteger;

public final class Decimal128 extends Number implements Comparable<Decimal128>
{
    private static final long I = 4570973266503637887L;
    private static final long J = 8646911284551352320L;
    private static final long K = 8935141660703064064L;
    private static final long L = Long.MIN_VALUE;
    private static final int M = -6176;
    private static final int N = 6111;
    private static final int O = 6176;
    private static final int P = 113;
    private static final BigInteger Q;
    private static final BigInteger R;
    private static final BigInteger S;
    private static final Set<String> T;
    private static final Set<String> U;
    private static final Set<String> V;
    private static final Set<String> W;
    public static final Decimal128 X;
    public static final Decimal128 Y;
    public static final Decimal128 Z;
    public static final Decimal128 a0;
    public static final Decimal128 b0;
    public static final Decimal128 c0;
    private final long G;
    private final long H;
    
    static {
        Q = new BigInteger("10");
        R = new BigInteger("1");
        S = new BigInteger("0");
        T = new HashSet<String>(Collections.singletonList("nan"));
        U = new HashSet<String>(Collections.singletonList("-nan"));
        V = new HashSet<String>(Arrays.asList("inf", "+inf", "infinity", "+infinity"));
        W = new HashSet<String>(Arrays.asList("-inf", "-infinity"));
        X = fromIEEE754BIDEncoding(8646911284551352320L, 0L);
        Y = fromIEEE754BIDEncoding(-576460752303423488L, 0L);
        Z = fromIEEE754BIDEncoding(-288230376151711744L, 0L);
        a0 = fromIEEE754BIDEncoding(8935141660703064064L, 0L);
        b0 = fromIEEE754BIDEncoding(3476778912330022912L, 0L);
        c0 = fromIEEE754BIDEncoding(-5746593124524752896L, 0L);
    }
    
    public Decimal128(final long val) {
        this(new BigDecimal(val, MathContext.DECIMAL128));
    }
    
    private Decimal128(final long g, final long h) {
        this.G = g;
        this.H = h;
    }
    
    public Decimal128(final BigDecimal bigDecimal) {
        this(bigDecimal, bigDecimal.signum() == -1);
    }
    
    private Decimal128(BigDecimal f, final boolean b) {
        f = this.f(f);
        final long lng = -f.scale();
        if (lng < -6176L || lng > 6111L) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Exponent is out of range for Decimal128 encoding: ");
            sb.append(lng);
            throw new AssertionError((Object)sb.toString());
        }
        if (f.unscaledValue().bitLength() <= 113) {
            final BigInteger abs = f.unscaledValue().abs();
            final int bitLength = abs.bitLength();
            int n = 0;
            final long n2 = 0L;
            long h = 0L;
            int i;
            long n3;
            while (true) {
                i = 64;
                n3 = n2;
                if (n >= Math.min(64, bitLength)) {
                    break;
                }
                long n4 = h;
                if (abs.testBit(n)) {
                    n4 = (h | 1L << n);
                }
                ++n;
                h = n4;
            }
            while (i < bitLength) {
                long n5 = n3;
                if (abs.testBit(i)) {
                    n5 = (n3 | 1L << i - 64);
                }
                ++i;
                n3 = n5;
            }
            final long n6 = lng + 6176L << 49 | n3;
            long g = 0L;
            Label_0203: {
                if (f.signum() != -1) {
                    g = n6;
                    if (!b) {
                        break Label_0203;
                    }
                }
                g = (n6 | Long.MIN_VALUE);
            }
            this.G = g;
            this.H = h;
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Unscaled roundedValue is out of range for Decimal128 encoding:");
        sb2.append(f.unscaledValue());
        throw new AssertionError((Object)sb2.toString());
    }
    
    private boolean B() {
        return (this.G & 0x6000000000000000L) == 0x6000000000000000L;
    }
    
    private BigDecimal d() {
        final int n = -this.j();
        if (this.B()) {
            return BigDecimal.valueOf(0L, n);
        }
        int signum;
        if (this.u()) {
            signum = -1;
        }
        else {
            signum = 1;
        }
        return new BigDecimal(new BigInteger(signum, this.i()), n);
    }
    
    private BigDecimal f(BigDecimal obj) {
        if (-((BigDecimal)obj).scale() > 6111) {
            final int exponent = -((BigDecimal)obj).scale() - 6111;
            if (((BigDecimal)obj).unscaledValue().equals(Decimal128.S)) {
                final Object o = new BigDecimal(((BigDecimal)obj).unscaledValue(), -6111);
                return (BigDecimal)o;
            }
            if (((BigDecimal)obj).precision() + exponent > 34) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Exponent is out of range for Decimal128 encoding of ");
                sb.append(obj);
                throw new NumberFormatException(sb.toString());
            }
            obj = new BigDecimal(((BigDecimal)obj).unscaledValue().multiply(Decimal128.Q.pow(exponent)), ((BigDecimal)obj).scale() + exponent);
        }
        else if (-((BigDecimal)obj).scale() < -6176) {
            final int exponent2 = ((BigDecimal)obj).scale() - 6176;
            BigInteger val;
            if (this.h((BigDecimal)obj, exponent2) == 0) {
                val = Decimal128.R;
            }
            else {
                val = Decimal128.Q.pow(exponent2);
            }
            obj = new BigDecimal(((BigDecimal)obj).unscaledValue().divide(val), ((BigDecimal)obj).scale() - exponent2);
        }
        else {
            final BigDecimal round = ((BigDecimal)obj).round(MathContext.DECIMAL128);
            final int n = ((BigDecimal)obj).precision() - round.precision();
            Object o = round;
            if (n > 0) {
                this.h((BigDecimal)obj, n);
                o = round;
                return (BigDecimal)o;
            }
            return (BigDecimal)o;
        }
        Object o = obj;
        return (BigDecimal)o;
    }
    
    public static Decimal128 fromIEEE754BIDEncoding(final long n, final long n2) {
        return new Decimal128(n, n2);
    }
    
    private int h(final BigDecimal obj, int i) {
        String string;
        int n;
        StringBuilder sb;
        for (string = obj.unscaledValue().abs().toString(), n = (i = Math.max(0, string.length() - i)); i < string.length(); ++i) {
            if (string.charAt(i) != '0') {
                sb = new StringBuilder();
                sb.append("Conversion to Decimal128 would require inexact rounding of ");
                sb.append(obj);
                throw new NumberFormatException(sb.toString());
            }
        }
        return n;
    }
    
    private byte[] i() {
        final byte[] array = new byte[15];
        int i = 14;
        final long n = 255L;
        long n2 = 255L;
        while (i >= 7) {
            array[i] = (byte)((this.H & n2) >>> (14 - i << 3));
            n2 <<= 8;
            --i;
        }
        int j = 6;
        long n3 = n;
        while (j >= 1) {
            array[j] = (byte)((this.G & n3) >>> (6 - j << 3));
            n3 <<= 8;
            --j;
        }
        array[0] = (byte)((0x1000000000000L & this.G) >>> 48);
        return array;
    }
    
    private int j() {
        long n;
        int n2;
        if (this.B()) {
            n = (this.G & 0x1FFFE00000000000L);
            n2 = 47;
        }
        else {
            n = (this.G & 0x7FFF800000000000L);
            n2 = 49;
        }
        return (int)(n >>> n2) - 6176;
    }
    
    private boolean m(final BigDecimal bigDecimal) {
        return this.u() && bigDecimal.signum() == 0;
    }
    
    private boolean v(final BigDecimal bigDecimal) {
        return !this.s() && !this.p() && bigDecimal.compareTo(BigDecimal.ZERO) == 0;
    }
    
    public static Decimal128 y(final String val) {
        final String lowerCase = val.toLowerCase();
        if (Decimal128.T.contains(lowerCase)) {
            return Decimal128.a0;
        }
        if (Decimal128.U.contains(lowerCase)) {
            return Decimal128.Z;
        }
        if (Decimal128.V.contains(lowerCase)) {
            return Decimal128.X;
        }
        if (Decimal128.W.contains(lowerCase)) {
            return Decimal128.Y;
        }
        final BigDecimal bigDecimal = new BigDecimal(val);
        boolean b = false;
        if (val.charAt(0) == '-') {
            b = true;
        }
        return new Decimal128(bigDecimal, b);
    }
    
    private String z() {
        final StringBuilder sb = new StringBuilder();
        final BigDecimal d = this.d();
        final String string = d.unscaledValue().abs().toString();
        if (this.u()) {
            sb.append('-');
        }
        final int n = -d.scale();
        final int i = string.length() - 1 + n;
        if (n <= 0 && i >= -6) {
            if (n == 0) {
                sb.append(string);
            }
            else {
                final int n2 = -n - string.length();
                if (n2 >= 0) {
                    sb.append('0');
                    sb.append('.');
                    for (int j = 0; j < n2; ++j) {
                        sb.append('0');
                    }
                    sb.append(string, 0, string.length());
                }
                else {
                    final int n3 = -n2;
                    sb.append(string, 0, n3);
                    sb.append('.');
                    sb.append(string, n3, n3 - n);
                }
            }
        }
        else {
            sb.append(string.charAt(0));
            if (string.length() > 1) {
                sb.append('.');
                sb.append(string, 1, string.length());
            }
            sb.append('E');
            if (i > 0) {
                sb.append('+');
            }
            sb.append(i);
        }
        return sb.toString();
    }
    
    public BigDecimal b() {
        if (this.s()) {
            throw new ArithmeticException("NaN can not be converted to a BigDecimal");
        }
        if (this.p()) {
            throw new ArithmeticException("Infinity can not be converted to a BigDecimal");
        }
        final BigDecimal d = this.d();
        if (this.u() && d.signum() == 0) {
            throw new ArithmeticException("Negative zero can not be converted to a BigDecimal");
        }
        return d;
    }
    
    @Override
    public double doubleValue() {
        if (this.s()) {
            return Double.NaN;
        }
        if (this.p()) {
            if (this.u()) {
                return Double.NEGATIVE_INFINITY;
            }
            return Double.POSITIVE_INFINITY;
        }
        else {
            final BigDecimal d = this.d();
            if (this.m(d)) {
                return 0.0;
            }
            return d.doubleValue();
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && Decimal128.class == o.getClass()) {
            final Decimal128 decimal128 = (Decimal128)o;
            return this.G == decimal128.G && this.H == decimal128.H;
        }
        return false;
    }
    
    @Override
    public float floatValue() {
        return (float)this.doubleValue();
    }
    
    public int g(final Decimal128 decimal128) {
        if (this.s()) {
            return (decimal128.s() ^ true) ? 1 : 0;
        }
        if (this.p()) {
            if (this.u()) {
                if (decimal128.p() && decimal128.u()) {
                    return 0;
                }
                return -1;
            }
            else {
                if (decimal128.s()) {
                    return -1;
                }
                if (decimal128.p() && !decimal128.u()) {
                    return 0;
                }
                return 1;
            }
        }
        else {
            final BigDecimal d = this.d();
            final BigDecimal d2 = decimal128.d();
            if (this.v(d) && decimal128.v(d2)) {
                if (this.m(d)) {
                    if (decimal128.m(d2)) {
                        return 0;
                    }
                    return -1;
                }
                else if (decimal128.m(d2)) {
                    return 1;
                }
            }
            if (decimal128.s()) {
                return -1;
            }
            if (!decimal128.p()) {
                return d.compareTo(d2);
            }
            if (decimal128.u()) {
                return 1;
            }
            return -1;
        }
    }
    
    @Override
    public int hashCode() {
        final long h = this.H;
        final int n = (int)(h ^ h >>> 32);
        final long g = this.G;
        return n * 31 + (int)(g ^ g >>> 32);
    }
    
    @Override
    public int intValue() {
        return (int)this.doubleValue();
    }
    
    public long k() {
        return this.G;
    }
    
    public long l() {
        return this.H;
    }
    
    @Override
    public long longValue() {
        return (long)this.doubleValue();
    }
    
    public boolean o() {
        return this.p() ^ true;
    }
    
    public boolean p() {
        return (this.G & 0x7800000000000000L) == 0x7800000000000000L;
    }
    
    public boolean s() {
        return (this.G & 0x7C00000000000000L) == 0x7C00000000000000L;
    }
    
    @Override
    public String toString() {
        if (this.s()) {
            return "NaN";
        }
        if (!this.p()) {
            return this.z();
        }
        if (this.u()) {
            return "-Infinity";
        }
        return "Infinity";
    }
    
    public boolean u() {
        return (this.G & Long.MIN_VALUE) == Long.MIN_VALUE;
    }
}
