// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.text;

import java.util.TreeSet;
import java.util.SortedSet;
import org.jetbrains.annotations.e;
import java.math.BigInteger;
import m6.g;
import kotlin.r0;
import kotlin.e1;
import kotlin.jvm.internal.k0;
import java.math.BigDecimal;
import n6.l;
import kotlin.internal.f;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\b\u001a\u0010\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u0000\u001a+\u0010\n\u001a\u00020\b*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\r\u001a\u00020\f*\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u0007H\u0087\b\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f" }, d2 = { "", "", "index", "", "T5", "Ljava/util/SortedSet;", "W5", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "selector", "U5", "(Ljava/lang/CharSequence;Ln6/l;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "V5", "(Ljava/lang/CharSequence;Ln6/l;)Ljava/math/BigInteger;", "kotlin-stdlib" }, k = 5, mv = { 1, 5, 1 }, xs = "kotlin/text/StringsKt")
class d0 extends c0
{
    public d0() {
    }
    
    @f
    private static final char T5(final CharSequence charSequence, final int n) {
        return charSequence.charAt(n);
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigDecimal")
    private static final BigDecimal U5(final CharSequence charSequence, final l<? super Character, ? extends BigDecimal> l) {
        int i = 0;
        BigDecimal bigDecimal = BigDecimal.valueOf(0);
        k0.o((Object)bigDecimal, "BigDecimal.valueOf(this.toLong())");
        while (i < charSequence.length()) {
            bigDecimal = bigDecimal.add((BigDecimal)l.invoke((Object)charSequence.charAt(i)));
            k0.o((Object)bigDecimal, "this.add(other)");
            ++i;
        }
        return bigDecimal;
    }
    
    @e1(version = "1.4")
    @f
    @r0
    @g(name = "sumOfBigInteger")
    private static final BigInteger V5(final CharSequence charSequence, final l<? super Character, ? extends BigInteger> l) {
        int i = 0;
        BigInteger bigInteger = BigInteger.valueOf(0);
        k0.o((Object)bigInteger, "BigInteger.valueOf(this.toLong())");
        while (i < charSequence.length()) {
            bigInteger = bigInteger.add((BigInteger)l.invoke((Object)charSequence.charAt(i)));
            k0.o((Object)bigInteger, "this.add(other)");
            ++i;
        }
        return bigInteger;
    }
    
    @e
    public static final SortedSet<Character> W5(@e final CharSequence charSequence) {
        k0.p((Object)charSequence, "$this$toSortedSet");
        return e0.V8(charSequence, new TreeSet<Character>());
    }
}
