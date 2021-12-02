// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.math.MathContext;
import java.math.BigDecimal;
import kotlin.internal.f;
import java.math.BigInteger;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0087\b\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\f\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\f\u001a\r\u0010\u0012\u001a\u00020\u0000*\u00020\u000eH\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0000*\u00020\u0013H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0015*\u00020\u0000H\u0087\b\u001a!\u0010\u001a\u001a\u00020\u0015*\u00020\u00002\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0087\b¨\u0006\u001b" }, d2 = { "Ljava/math/BigInteger;", "other", "x", "v", "B", "s", "y", "H", "t", "r", "u", "q", "w", "I", "", "n", "z", "A", "F", "", "G", "Ljava/math/BigDecimal;", "C", "scale", "Ljava/math/MathContext;", "mathContext", "D", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/NumbersKt")
class l0 extends k0
{
    public l0() {
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger A(BigInteger shiftRight, final int n) {
        shiftRight = shiftRight.shiftRight(n);
        kotlin.jvm.internal.k0.o(shiftRight, "this.shiftRight(n)");
        return shiftRight;
    }
    
    @f
    private static final BigInteger B(BigInteger multiply, final BigInteger val) {
        kotlin.jvm.internal.k0.p(multiply, "$this$times");
        multiply = multiply.multiply(val);
        kotlin.jvm.internal.k0.o(multiply, "this.multiply(other)");
        return multiply;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal C(final BigInteger val) {
        return new BigDecimal(val);
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal D(final BigInteger unscaledVal, final int scale, final MathContext mc) {
        return new BigDecimal(unscaledVal, scale, mc);
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger F(final int n) {
        final BigInteger value = BigInteger.valueOf(n);
        kotlin.jvm.internal.k0.o(value, "BigInteger.valueOf(this.toLong())");
        return value;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger G(final long val) {
        final BigInteger value = BigInteger.valueOf(val);
        kotlin.jvm.internal.k0.o(value, "BigInteger.valueOf(this)");
        return value;
    }
    
    @f
    private static final BigInteger H(BigInteger negate) {
        kotlin.jvm.internal.k0.p(negate, "$this$unaryMinus");
        negate = negate.negate();
        kotlin.jvm.internal.k0.o(negate, "this.negate()");
        return negate;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger I(BigInteger xor, final BigInteger val) {
        xor = xor.xor(val);
        kotlin.jvm.internal.k0.o(xor, "this.xor(other)");
        return xor;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger q(BigInteger and, final BigInteger val) {
        and = and.and(val);
        kotlin.jvm.internal.k0.o(and, "this.and(other)");
        return and;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger r(BigInteger subtract) {
        kotlin.jvm.internal.k0.p(subtract, "$this$dec");
        subtract = subtract.subtract(BigInteger.ONE);
        kotlin.jvm.internal.k0.o(subtract, "this.subtract(BigInteger.ONE)");
        return subtract;
    }
    
    @f
    private static final BigInteger s(BigInteger divide, final BigInteger val) {
        kotlin.jvm.internal.k0.p(divide, "$this$div");
        divide = divide.divide(val);
        kotlin.jvm.internal.k0.o(divide, "this.divide(other)");
        return divide;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger t(BigInteger add) {
        kotlin.jvm.internal.k0.p(add, "$this$inc");
        add = add.add(BigInteger.ONE);
        kotlin.jvm.internal.k0.o(add, "this.add(BigInteger.ONE)");
        return add;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger u(BigInteger not) {
        not = not.not();
        kotlin.jvm.internal.k0.o(not, "this.not()");
        return not;
    }
    
    @f
    private static final BigInteger v(BigInteger subtract, final BigInteger val) {
        kotlin.jvm.internal.k0.p(subtract, "$this$minus");
        subtract = subtract.subtract(val);
        kotlin.jvm.internal.k0.o(subtract, "this.subtract(other)");
        return subtract;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger w(BigInteger or, final BigInteger val) {
        or = or.or(val);
        kotlin.jvm.internal.k0.o(or, "this.or(other)");
        return or;
    }
    
    @f
    private static final BigInteger x(BigInteger add, final BigInteger val) {
        kotlin.jvm.internal.k0.p(add, "$this$plus");
        add = add.add(val);
        kotlin.jvm.internal.k0.o(add, "this.add(other)");
        return add;
    }
    
    @e1(version = "1.1")
    @f
    private static final BigInteger y(BigInteger remainder, final BigInteger val) {
        kotlin.jvm.internal.k0.p(remainder, "$this$rem");
        remainder = remainder.remainder(val);
        kotlin.jvm.internal.k0.o(remainder, "this.remainder(other)");
        return remainder;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigInteger z(BigInteger shiftLeft, final int n) {
        shiftLeft = shiftLeft.shiftLeft(n);
        kotlin.jvm.internal.k0.o(shiftLeft, "this.shiftLeft(n)");
        return shiftLeft;
    }
}
