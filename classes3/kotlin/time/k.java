// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.time;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import java.math.RoundingMode;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000.\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u001a\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u001a\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\"\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\"\"\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000f\"\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\"\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012¨\u0006\u0014" }, d2 = { "", "decimals", "Ljava/text/DecimalFormat;", "a", "", "value", "", "c", "d", "b", "Ljava/text/DecimalFormatSymbols;", "Ljava/text/DecimalFormatSymbols;", "rootPositiveExpFormatSymbols", "", "Ljava/lang/ThreadLocal;", "[Ljava/lang/ThreadLocal;", "precisionFormats", "rootNegativeExpFormatSymbols", "Ljava/lang/ThreadLocal;", "scientificFormat", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
public final class k
{
    private static final DecimalFormatSymbols a;
    private static final DecimalFormatSymbols b;
    private static final ThreadLocal<DecimalFormat>[] c;
    private static final ThreadLocal<DecimalFormat> d;
    
    static {
        final Locale root = Locale.ROOT;
        final DecimalFormatSymbols a2 = new DecimalFormatSymbols(root);
        a2.setExponentSeparator("e");
        a = a2;
        final DecimalFormatSymbols b2 = new DecimalFormatSymbols(root);
        b2.setExponentSeparator("e+");
        b = b2;
        final ThreadLocal[] c2 = new ThreadLocal[4];
        for (int i = 0; i < 4; ++i) {
            c2[i] = new ThreadLocal<DecimalFormat>();
        }
        c = c2;
        d = new ThreadLocal<DecimalFormat>();
    }
    
    private static final DecimalFormat a(final int minimumFractionDigits) {
        final DecimalFormat decimalFormat = new DecimalFormat("0", k.a);
        if (minimumFractionDigits > 0) {
            decimalFormat.setMinimumFractionDigits(minimumFractionDigits);
        }
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat;
    }
    
    @e
    public static final String b(final double number) {
        final ThreadLocal<DecimalFormat> d = k.d;
        DecimalFormat value = d.get();
        if (value == null) {
            value = new DecimalFormat("0E0", k.a);
            value.setMinimumFractionDigits(2);
            d.set(value);
        }
        final DecimalFormat decimalFormat = value;
        DecimalFormatSymbols decimalFormatSymbols;
        if (number < 1 && number > -1) {
            decimalFormatSymbols = k.a;
        }
        else {
            decimalFormatSymbols = k.b;
        }
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        final String format = decimalFormat.format(number);
        k0.o((Object)format, "scientificFormat.getOrSe\u2026 }\n        .format(value)");
        return format;
    }
    
    @e
    public static final String c(final double number, final int n) {
        final ThreadLocal<DecimalFormat>[] c = k.c;
        DecimalFormat a;
        if (n < c.length) {
            final ThreadLocal<DecimalFormat> threadLocal = c[n];
            DecimalFormat value = threadLocal.get();
            if (value == null) {
                value = a(n);
                threadLocal.set(value);
            }
            a = value;
        }
        else {
            a = a(n);
        }
        final String format = a.format(number);
        k0.o((Object)format, "format.format(value)");
        return format;
    }
    
    @e
    public static final String d(final double number, final int maximumFractionDigits) {
        final DecimalFormat a = a(0);
        a.setMaximumFractionDigits(maximumFractionDigits);
        final String format = a.format(number);
        k0.o((Object)format, "createFormatForDecimals(\u2026 }\n        .format(value)");
        return format;
    }
}
