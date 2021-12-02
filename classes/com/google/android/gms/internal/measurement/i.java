// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.math.BigDecimal;
import java.util.List;

public final class i implements q
{
    private final Double G;
    
    public i(final Double g) {
        if (g == null) {
            this.G = Double.NaN;
            return;
        }
        this.G = g;
    }
    
    @Override
    public final q c() {
        return new i(this.G);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof i && this.G.equals(((i)o).G));
    }
    
    @Override
    public final Double g() {
        return this.G;
    }
    
    @Override
    public final int hashCode() {
        return this.G.hashCode();
    }
    
    @Override
    public final q i(final String anObject, final g5 g5, final List<q> list) {
        if ("toString".equals(anObject)) {
            return new u(this.k());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", this.k(), anObject));
    }
    
    @Override
    public final String k() {
        if (Double.isNaN(this.G)) {
            return "NaN";
        }
        if (!Double.isInfinite(this.G)) {
            final BigDecimal stripTrailingZeros = BigDecimal.valueOf(this.G).stripTrailingZeros();
            final DecimalFormat decimalFormat = new DecimalFormat("0E0");
            decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
            int n;
            if (stripTrailingZeros.scale() > 0) {
                n = stripTrailingZeros.precision();
            }
            else {
                n = stripTrailingZeros.scale();
            }
            decimalFormat.setMinimumFractionDigits(n - 1);
            final String format = decimalFormat.format(stripTrailingZeros);
            final int index = format.indexOf("E");
            String s = format;
            if (index > 0) {
                final int int1 = Integer.parseInt(format.substring(index + 1));
                if ((int1 < 0 && int1 > -7) || (int1 >= 0 && int1 < 21)) {
                    s = stripTrailingZeros.toPlainString();
                }
                else {
                    s = format.replace("E-", "e-").replace("E", "e+");
                }
            }
            return s;
        }
        if (this.G > 0.0) {
            return "Infinity";
        }
        return "-Infinity";
    }
    
    @Override
    public final Boolean m() {
        final boolean naN = Double.isNaN(this.G);
        boolean b = false;
        if (!naN) {
            b = b;
            if (this.G != 0.0) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public final Iterator<q> p() {
        return null;
    }
    
    @Override
    public final String toString() {
        return this.k();
    }
}
