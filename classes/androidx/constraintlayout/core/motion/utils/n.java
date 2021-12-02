// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public class n extends d
{
    private static final boolean o = false;
    double l;
    double m;
    double n;
    
    n(final String a) {
        super.a = a;
        final int index = a.indexOf(40);
        int index2 = a.indexOf(44, index);
        this.l = Double.parseDouble(a.substring(index + 1, index2).trim());
        ++index2;
        this.m = Double.parseDouble(a.substring(index2, a.indexOf(44, index2)).trim());
    }
    
    private double d(final double n) {
        final double m = this.m;
        if (n < m) {
            final double l = this.l;
            return l * m * m / (((m - n) * l + n) * (l * (m - n) + n));
        }
        final double i = this.l;
        return (m - 1.0) * i * (m - 1.0) / ((-i * (m - n) - n + 1.0) * (-i * (m - n) - n + 1.0));
    }
    
    private double e(final double n) {
        final double m = this.m;
        if (n < m) {
            return m * n / (n + this.l * (m - n));
        }
        return (1.0 - m) * (n - 1.0) / (1.0 - n - this.l * (m - n));
    }
    
    @Override
    public double a(final double n) {
        return this.e(n);
    }
    
    @Override
    public double b(final double n) {
        return this.d(n);
    }
}
