// 
// Decompiled by Procyon v0.5.36
// 

package kotlin;

import java.math.MathContext;
import java.math.RoundingMode;
import kotlin.internal.f;
import java.math.BigDecimal;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\u0015\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0087\n\u001a\r\u0010\u000b\u001a\u00020\u0000*\u00020\nH\u0087\b\u001a\u0015\u0010\u000e\u001a\u00020\u0000*\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u0000*\u00020\u000fH\u0087\b\u001a\u0015\u0010\u0011\u001a\u00020\u0000*\u00020\u000f2\u0006\u0010\r\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u0000*\u00020\u0012H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0000*\u00020\u0015H\u0087\b\u001a\u0015\u0010\u0017\u001a\u00020\u0000*\u00020\u00152\u0006\u0010\r\u001a\u00020\fH\u0087\b¨\u0006\u0018" }, d2 = { "Ljava/math/BigDecimal;", "other", "e", "d", "g", "b", "f", "p", "c", "a", "", "l", "Ljava/math/MathContext;", "mathContext", "m", "", "n", "o", "", "j", "k", "", "h", "i", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/NumbersKt")
class k0
{
    public k0() {
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal a(BigDecimal subtract) {
        kotlin.jvm.internal.k0.p(subtract, "$this$dec");
        subtract = subtract.subtract(BigDecimal.ONE);
        kotlin.jvm.internal.k0.o(subtract, "this.subtract(BigDecimal.ONE)");
        return subtract;
    }
    
    @f
    private static final BigDecimal b(BigDecimal divide, final BigDecimal divisor) {
        kotlin.jvm.internal.k0.p(divide, "$this$div");
        divide = divide.divide(divisor, RoundingMode.HALF_EVEN);
        kotlin.jvm.internal.k0.o(divide, "this.divide(other, RoundingMode.HALF_EVEN)");
        return divide;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal c(BigDecimal add) {
        kotlin.jvm.internal.k0.p(add, "$this$inc");
        add = add.add(BigDecimal.ONE);
        kotlin.jvm.internal.k0.o(add, "this.add(BigDecimal.ONE)");
        return add;
    }
    
    @f
    private static final BigDecimal d(BigDecimal subtract, final BigDecimal subtrahend) {
        kotlin.jvm.internal.k0.p(subtract, "$this$minus");
        subtract = subtract.subtract(subtrahend);
        kotlin.jvm.internal.k0.o(subtract, "this.subtract(other)");
        return subtract;
    }
    
    @f
    private static final BigDecimal e(BigDecimal add, final BigDecimal augend) {
        kotlin.jvm.internal.k0.p(add, "$this$plus");
        add = add.add(augend);
        kotlin.jvm.internal.k0.o(add, "this.add(other)");
        return add;
    }
    
    @f
    private static final BigDecimal f(BigDecimal remainder, final BigDecimal divisor) {
        kotlin.jvm.internal.k0.p(remainder, "$this$rem");
        remainder = remainder.remainder(divisor);
        kotlin.jvm.internal.k0.o(remainder, "this.remainder(other)");
        return remainder;
    }
    
    @f
    private static final BigDecimal g(BigDecimal multiply, final BigDecimal multiplicand) {
        kotlin.jvm.internal.k0.p(multiply, "$this$times");
        multiply = multiply.multiply(multiplicand);
        kotlin.jvm.internal.k0.o(multiply, "this.multiply(other)");
        return multiply;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal h(final double d) {
        return new BigDecimal(String.valueOf(d));
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal i(final double d, final MathContext mc) {
        return new BigDecimal(String.valueOf(d), mc);
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal j(final float f) {
        return new BigDecimal(String.valueOf(f));
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal k(final float f, final MathContext mc) {
        return new BigDecimal(String.valueOf(f), mc);
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal l(final int n) {
        final BigDecimal value = BigDecimal.valueOf(n);
        kotlin.jvm.internal.k0.o(value, "BigDecimal.valueOf(this.toLong())");
        return value;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal m(final int val, final MathContext mc) {
        return new BigDecimal(val, mc);
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal n(final long val) {
        final BigDecimal value = BigDecimal.valueOf(val);
        kotlin.jvm.internal.k0.o(value, "BigDecimal.valueOf(this)");
        return value;
    }
    
    @e1(version = "1.2")
    @f
    private static final BigDecimal o(final long val, final MathContext mc) {
        return new BigDecimal(val, mc);
    }
    
    @f
    private static final BigDecimal p(BigDecimal negate) {
        kotlin.jvm.internal.k0.p(negate, "$this$unaryMinus");
        negate = negate.negate();
        kotlin.jvm.internal.k0.o(negate, "this.negate()");
        return negate;
    }
}
