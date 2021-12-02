// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public class j extends b
{
    private static final String i = "LinearCurveFit";
    private double[] d;
    private double[][] e;
    private double f;
    private boolean g;
    double[] h;
    
    public j(final double[] d, final double[][] e) {
        this.f = Double.NaN;
        this.g = true;
        final int length = d.length;
        final int length2 = e[0].length;
        this.h = new double[length2];
        this.d = d;
        this.e = e;
        if (length2 > 2) {
            double n2;
            double n = n2 = 0.0;
            double n3;
            double n4;
            for (int i = 0; i < d.length; ++i, n = n3, n2 = n4) {
                n3 = e[i][0];
                n4 = e[i][0];
                if (i > 0) {
                    Math.hypot(n3 - n, n4 - n2);
                }
            }
            this.f = 0.0;
        }
    }
    
    private double i(double n) {
        if (Double.isNaN(this.f)) {
            return 0.0;
        }
        final double[] d = this.d;
        final int length = d.length;
        if (n <= d[0]) {
            return 0.0;
        }
        final int n2 = length - 1;
        if (n >= d[n2]) {
            return this.f;
        }
        double n4;
        double n3 = n4 = 0.0;
        int i = 0;
        double n5 = n4;
        while (i < n2) {
            final double[][] e = this.e;
            final double n6 = e[i][0];
            final double n7 = e[i][1];
            double n8 = n3;
            if (i > 0) {
                n8 = n3 + Math.hypot(n6 - n5, n7 - n4);
            }
            final double[] d2 = this.d;
            if (n == d2[i]) {
                return n8;
            }
            final int n9 = i + 1;
            if (n < d2[n9]) {
                final double n10 = (n - d2[i]) / (d2[n9] - d2[i]);
                final double[][] e2 = this.e;
                final double n11 = e2[i][0];
                final double n12 = e2[n9][0];
                n = e2[i][1];
                final double n13 = e2[n9][1];
                final double n14 = 1.0 - n10;
                return n8 + Math.hypot(n7 - (n * n14 + n13 * n10), n6 - (n11 * n14 + n12 * n10));
            }
            i = n9;
            n5 = n6;
            n4 = n7;
            n3 = n8;
        }
        return 0.0;
    }
    
    @Override
    public double c(double n, final int n2) {
        final double[] d = this.d;
        final int length = d.length;
        final boolean g = this.g;
        int i = 0;
        if (g) {
            if (n <= d[0]) {
                return this.e[0][n2] + (n - d[0]) * this.f(d[0], n2);
            }
            final int n3 = length - 1;
            if (n >= d[n3]) {
                return this.e[n3][n2] + (n - d[n3]) * this.f(d[n3], n2);
            }
        }
        else {
            if (n <= d[0]) {
                return this.e[0][n2];
            }
            final int n4 = length - 1;
            if (n >= d[n4]) {
                return this.e[n4][n2];
            }
        }
        while (i < length - 1) {
            final double[] d2 = this.d;
            if (n == d2[i]) {
                return this.e[i][n2];
            }
            final int n5 = i + 1;
            if (n < d2[n5]) {
                n = (n - d2[i]) / (d2[n5] - d2[i]);
                final double[][] e = this.e;
                return e[i][n2] * (1.0 - n) + e[n5][n2] * n;
            }
            i = n5;
        }
        return 0.0;
    }
    
    @Override
    public void d(double n, final double[] array) {
        final double[] d = this.d;
        final int length = d.length;
        final double[][] e = this.e;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        final int length2 = e[0].length;
        if (this.g) {
            if (n <= d[0]) {
                this.g(d[0], this.h);
                for (int j = 0; j < length2; ++j) {
                    array[j] = this.e[0][j] + (n - this.d[0]) * this.h[j];
                }
                return;
            }
            final int n4 = length - 1;
            if (n >= d[n4]) {
                this.g(d[n4], this.h);
                while (i < length2) {
                    array[i] = this.e[n4][i] + (n - this.d[n4]) * this.h[i];
                    ++i;
                }
                return;
            }
        }
        else {
            if (n <= d[0]) {
                for (int k = 0; k < length2; ++k) {
                    array[k] = this.e[0][k];
                }
                return;
            }
            final int n5 = length - 1;
            if (n >= d[n5]) {
                for (int l = n2; l < length2; ++l) {
                    array[l] = this.e[n5][l];
                }
                return;
            }
        }
        int n8;
        for (int n6 = 0; n6 < length - 1; n6 = n8) {
            if (n == this.d[n6]) {
                for (int n7 = 0; n7 < length2; ++n7) {
                    array[n7] = this.e[n6][n7];
                }
            }
            final double[] d2 = this.d;
            n8 = n6 + 1;
            if (n < d2[n8]) {
                n = (n - d2[n6]) / (d2[n8] - d2[n6]);
                for (int n9 = n3; n9 < length2; ++n9) {
                    final double[][] e2 = this.e;
                    array[n9] = e2[n6][n9] * (1.0 - n) + e2[n8][n9] * n;
                }
                return;
            }
        }
    }
    
    @Override
    public void e(double n, final float[] array) {
        final double[] d = this.d;
        final int length = d.length;
        final double[][] e = this.e;
        final int n2 = 0;
        final int n3 = 0;
        int i = 0;
        final int length2 = e[0].length;
        if (this.g) {
            if (n <= d[0]) {
                this.g(d[0], this.h);
                for (int j = 0; j < length2; ++j) {
                    array[j] = (float)(this.e[0][j] + (n - this.d[0]) * this.h[j]);
                }
                return;
            }
            final int n4 = length - 1;
            if (n >= d[n4]) {
                this.g(d[n4], this.h);
                while (i < length2) {
                    array[i] = (float)(this.e[n4][i] + (n - this.d[n4]) * this.h[i]);
                    ++i;
                }
                return;
            }
        }
        else {
            if (n <= d[0]) {
                for (int k = 0; k < length2; ++k) {
                    array[k] = (float)this.e[0][k];
                }
                return;
            }
            final int n5 = length - 1;
            if (n >= d[n5]) {
                for (int l = n2; l < length2; ++l) {
                    array[l] = (float)this.e[n5][l];
                }
                return;
            }
        }
        int n8;
        for (int n6 = 0; n6 < length - 1; n6 = n8) {
            if (n == this.d[n6]) {
                for (int n7 = 0; n7 < length2; ++n7) {
                    array[n7] = (float)this.e[n6][n7];
                }
            }
            final double[] d2 = this.d;
            n8 = n6 + 1;
            if (n < d2[n8]) {
                n = (n - d2[n6]) / (d2[n8] - d2[n6]);
                for (int n9 = n3; n9 < length2; ++n9) {
                    final double[][] e2 = this.e;
                    array[n9] = (float)(e2[n6][n9] * (1.0 - n) + e2[n8][n9] * n);
                }
                return;
            }
        }
    }
    
    @Override
    public double f(double n, final int n2) {
        final double[] d = this.d;
        final int length = d.length;
        final int n3 = 0;
        double n4;
        int i;
        if (n < d[0]) {
            n4 = d[0];
            i = n3;
        }
        else {
            final int n5 = length - 1;
            i = n3;
            n4 = n;
            if (n >= d[n5]) {
                n4 = d[n5];
                i = n3;
            }
        }
        while (i < length - 1) {
            final double[] d2 = this.d;
            final int n6 = i + 1;
            if (n4 <= d2[n6]) {
                n = d2[n6];
                final double n7 = d2[i];
                final double n8 = d2[i];
                final double[][] e = this.e;
                return (e[n6][n2] - e[i][n2]) / (n - n7);
            }
            i = n6;
        }
        return 0.0;
    }
    
    @Override
    public void g(double n, final double[] array) {
        final double[] d = this.d;
        final int length = d.length;
        final double[][] e = this.e;
        int i = 0;
        final int length2 = e[0].length;
        double n2;
        if (n <= d[0]) {
            n2 = d[0];
        }
        else {
            final int n3 = length - 1;
            n2 = n;
            if (n >= d[n3]) {
                n2 = d[n3];
            }
        }
        int n4;
        for (int j = 0; j < length - 1; j = n4) {
            final double[] d2 = this.d;
            n4 = j + 1;
            if (n2 <= d2[n4]) {
                final double n5 = d2[n4];
                n = d2[j];
                final double n6 = d2[j];
                while (i < length2) {
                    final double[][] e2 = this.e;
                    array[i] = (e2[n4][i] - e2[j][i]) / (n5 - n);
                    ++i;
                }
                break;
            }
        }
    }
    
    @Override
    public double[] h() {
        return this.d;
    }
}
