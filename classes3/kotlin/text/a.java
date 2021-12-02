// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b(\b\u0086\u0001\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0019\b\u0002\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0011\u001a\u00020\f8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3¨\u00064" }, d2 = { "Lkotlin/text/a;", "", "", "char", "", "b", "", "H", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "code", "", "G", "I", "f", "()I", "value", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "n0", "a", "UNASSIGNED", "UPPERCASE_LETTER", "LOWERCASE_LETTER", "TITLECASE_LETTER", "MODIFIER_LETTER", "OTHER_LETTER", "NON_SPACING_MARK", "ENCLOSING_MARK", "COMBINING_SPACING_MARK", "DECIMAL_DIGIT_NUMBER", "LETTER_NUMBER", "OTHER_NUMBER", "SPACE_SEPARATOR", "LINE_SEPARATOR", "PARAGRAPH_SEPARATOR", "CONTROL", "FORMAT", "PRIVATE_USE", "SURROGATE", "DASH_PUNCTUATION", "START_PUNCTUATION", "END_PUNCTUATION", "CONNECTOR_PUNCTUATION", "OTHER_PUNCTUATION", "MATH_SYMBOL", "CURRENCY_SYMBOL", "MODIFIER_SYMBOL", "OTHER_SYMBOL", "INITIAL_QUOTE_PUNCTUATION", "FINAL_QUOTE_PUNCTUATION", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public enum a
{
    I(0, "Cn"), 
    J(1, "Lu"), 
    K(2, "Ll"), 
    L(3, "Lt"), 
    M(4, "Lm"), 
    N(5, "Lo"), 
    O(6, "Mn"), 
    P(7, "Me"), 
    Q(8, "Mc"), 
    R(9, "Nd"), 
    S(10, "Nl"), 
    T(11, "No"), 
    U(12, "Zs"), 
    V(13, "Zl"), 
    W(14, "Zp"), 
    X(15, "Cc"), 
    Y(16, "Cf"), 
    Z(18, "Co"), 
    a0(19, "Cs"), 
    b0(20, "Pd"), 
    c0(21, "Ps"), 
    d0(22, "Pe"), 
    e0(23, "Pc"), 
    f0(24, "Po"), 
    g0(25, "Sm"), 
    h0(26, "Sc"), 
    i0(27, "Sk"), 
    j0(28, "So"), 
    k0(29, "Pi"), 
    l0(30, "Pf");
    
    @e
    public static final a n0;
    private final int G;
    @e
    private final String H;
    
    static {
        n0 = new a(null);
    }
    
    private a(final int g, final String h) {
        this.G = g;
        this.H = h;
    }
    
    public final boolean b(final char ch) {
        return Character.getType(ch) == this.G;
    }
    
    @e
    public final String d() {
        return this.H;
    }
    
    public final int f() {
        return this.G;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b" }, d2 = { "kotlin/text/a$a", "", "", "category", "Lkotlin/text/a;", "a", "<init>", "()V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final kotlin.text.a a(final int i) {
            if (i >= 0) {
                if (16 >= i) {
                    return kotlin.text.a.values()[i];
                }
            }
            if (18 > i || 30 < i) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Category #");
                sb.append(i);
                sb.append(" is not defined.");
                throw new IllegalArgumentException(sb.toString());
            }
            return kotlin.text.a.values()[i - 1];
        }
    }
}
