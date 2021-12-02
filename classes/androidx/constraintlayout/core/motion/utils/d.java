// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.io.PrintStream;
import java.util.Arrays;

public class d
{
    static d b;
    private static final String c = "cubic(0.4, 0.0, 0.2, 1)";
    private static final String d = "cubic(0.4, 0.05, 0.8, 0.7)";
    private static final String e = "cubic(0.0, 0.0, 0.2, 0.95)";
    private static final String f = "cubic(1, 1, 0, 0)";
    private static final String g = "decelerate";
    private static final String h = "accelerate";
    private static final String i = "standard";
    private static final String j = "linear";
    public static String[] k;
    String a;
    
    static {
        androidx.constraintlayout.core.motion.utils.d.b = new d();
        androidx.constraintlayout.core.motion.utils.d.k = new String[] { "standard", "accelerate", "decelerate", "linear" };
    }
    
    public d() {
        this.a = "identity";
    }
    
    public static d c(final String s) {
        if (s == null) {
            return null;
        }
        if (s.startsWith("cubic")) {
            return new a(s);
        }
        if (s.startsWith("spline")) {
            return new q(s);
        }
        if (s.startsWith("Schlick")) {
            return new n(s);
        }
        int n = -1;
        switch (s) {
            case "standard": {
                n = 3;
                break;
            }
            case "linear": {
                n = 2;
                break;
            }
            case "decelerate": {
                n = 1;
                break;
            }
            case "accelerate": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                final PrintStream err = System.err;
                final StringBuilder sb = new StringBuilder();
                sb.append("transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or ");
                sb.append(Arrays.toString(androidx.constraintlayout.core.motion.utils.d.k));
                err.println(sb.toString());
                return androidx.constraintlayout.core.motion.utils.d.b;
            }
            case 3: {
                return new a("cubic(0.4, 0.0, 0.2, 1)");
            }
            case 2: {
                return new a("cubic(1, 1, 0, 0)");
            }
            case 1: {
                return new a("cubic(0.0, 0.0, 0.2, 0.95)");
            }
            case 0: {
                return new a("cubic(0.4, 0.05, 0.8, 0.7)");
            }
        }
    }
    
    public double a(final double n) {
        return n;
    }
    
    public double b(final double n) {
        return 1.0;
    }
    
    @Override
    public String toString() {
        return this.a;
    }
    
    static class a extends d
    {
        private static double p = 0.01;
        private static double q = 1.0E-4;
        double l;
        double m;
        double n;
        double o;
        
        public a(final double n, final double n2, final double n3, final double n4) {
            this.h(n, n2, n3, n4);
        }
        
        a(final String a) {
            super.a = a;
            final int index = a.indexOf(40);
            int index2 = a.indexOf(44, index);
            this.l = Double.parseDouble(a.substring(index + 1, index2).trim());
            ++index2;
            final int index3 = a.indexOf(44, index2);
            this.m = Double.parseDouble(a.substring(index2, index3).trim());
            final int n = index3 + 1;
            final int index4 = a.indexOf(44, n);
            this.n = Double.parseDouble(a.substring(n, index4).trim());
            final int n2 = index4 + 1;
            this.o = Double.parseDouble(a.substring(n2, a.indexOf(41, n2)).trim());
        }
        
        private double d(final double n) {
            final double n2 = 1.0 - n;
            final double l = this.l;
            final double n3 = this.n;
            return n2 * 3.0 * n2 * l + n2 * 6.0 * n * (n3 - l) + 3.0 * n * n * (1.0 - n3);
        }
        
        private double e(final double n) {
            final double n2 = 1.0 - n;
            final double m = this.m;
            final double o = this.o;
            return n2 * 3.0 * n2 * m + n2 * 6.0 * n * (o - m) + 3.0 * n * n * (1.0 - o);
        }
        
        private double f(final double n) {
            final double n2 = 1.0 - n;
            final double n3 = 3.0 * n2;
            return this.l * (n2 * n3 * n) + this.n * (n3 * n * n) + n * n * n;
        }
        
        private double g(final double n) {
            final double n2 = 1.0 - n;
            final double n3 = 3.0 * n2;
            return this.m * (n2 * n3 * n) + this.o * (n3 * n * n) + n * n * n;
        }
        
        @Override
        public double a(final double n) {
            if (n <= 0.0) {
                return 0.0;
            }
            if (n >= 1.0) {
                return 1.0;
            }
            double n3;
            double n2 = n3 = 0.5;
            while (n2 > a.p) {
                final double f = this.f(n3);
                n2 *= 0.5;
                if (f < n) {
                    n3 += n2;
                }
                else {
                    n3 -= n2;
                }
            }
            final double n4 = n3 - n2;
            final double f2 = this.f(n4);
            final double n5 = n3 + n2;
            final double f3 = this.f(n5);
            final double g = this.g(n4);
            return (this.g(n5) - g) * (n - f2) / (f3 - f2) + g;
        }
        
        @Override
        public double b(double f) {
            double n2;
            double n = n2 = 0.5;
            while (n > a.q) {
                final double f2 = this.f(n2);
                n *= 0.5;
                if (f2 < f) {
                    n2 += n;
                }
                else {
                    n2 -= n;
                }
            }
            final double n3 = n2 - n;
            f = this.f(n3);
            final double n4 = n2 + n;
            return (this.g(n4) - this.g(n3)) / (this.f(n4) - f);
        }
        
        void h(final double l, final double m, final double n, final double o) {
            this.l = l;
            this.m = m;
            this.n = n;
            this.o = o;
        }
    }
}
