// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class k extends b
{
    private static final String i = "MonotonicCurveFit";
    private double[] d;
    private double[][] e;
    private double[][] f;
    private boolean g;
    double[] h;
    
    public k(final double[] d, final double[][] e) {
        this.g = true;
        final int length = d.length;
        final int length2 = e[0].length;
        this.h = new double[length2];
        final int n = length - 1;
        final double[][] array = new double[n][length2];
        final double[][] f = new double[length][length2];
        for (int i = 0; i < length2; ++i) {
            int n2;
            for (int j = 0; j < n; j = n2) {
                n2 = j + 1;
                array[j][i] = (e[n2][i] - e[j][i]) / (d[n2] - d[j]);
                if (j == 0) {
                    f[j][i] = array[j][i];
                }
                else {
                    f[j][i] = (array[j - 1][i] + array[j][i]) * 0.5;
                }
            }
            f[n][i] = array[length - 2][i];
        }
        for (int k = 0; k < n; ++k) {
            for (int l = 0; l < length2; ++l) {
                if (array[k][l] == 0.0) {
                    f[k][l] = 0.0;
                    f[k + 1][l] = 0.0;
                }
                else {
                    final double x = f[k][l] / array[k][l];
                    final int n3 = k + 1;
                    final double y = f[n3][l] / array[k][l];
                    final double hypot = Math.hypot(x, y);
                    if (hypot > 9.0) {
                        final double n4 = 3.0 / hypot;
                        f[k][l] = x * n4 * array[k][l];
                        f[n3][l] = n4 * y * array[k][l];
                    }
                }
            }
        }
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static k i(final String s) {
        final double[] original = new double[s.length() / 2];
        int fromIndex;
        int i;
        int n;
        for (fromIndex = s.indexOf(40) + 1, i = s.indexOf(44, fromIndex), n = 0; i != -1; i = s.indexOf(44, fromIndex), ++n) {
            original[n] = Double.parseDouble(s.substring(fromIndex, i).trim());
            fromIndex = i + 1;
        }
        original[n] = Double.parseDouble(s.substring(fromIndex, s.indexOf(41, fromIndex)).trim());
        return j(Arrays.copyOf(original, n + 1));
    }
    
    private static k j(final double[] array) {
        final int n = array.length * 3 - 2;
        final int n2 = array.length - 1;
        final double n3 = 1.0 / n2;
        final double[][] array2 = new double[n][1];
        final double[] array3 = new double[n];
        for (int i = 0; i < array.length; ++i) {
            final double n4 = array[i];
            final int n5 = i + n2;
            array2[n5][0] = n4;
            final double n6 = i * n3;
            array3[n5] = n6;
            if (i > 0) {
                final int n7 = n2 * 2 + i;
                array2[n7][0] = n4 + 1.0;
                array3[n7] = n6 + 1.0;
                final int n8 = i - 1;
                array2[n8][0] = n4 - 1.0 - n3;
                array3[n8] = n6 - 1.0 - n3;
            }
        }
        return new k(array3, array2);
    }
    
    private static double k(final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        final double n7 = n2 * n2;
        final double n8 = n2 * 6.0;
        final double n9 = 3.0 * n;
        return -6.0 * n7 * n4 + n8 * n4 + 6.0 * n7 * n3 - n8 * n3 + n9 * n6 * n7 + n9 * n5 * n7 - 2.0 * n * n6 * n2 - 4.0 * n * n5 * n2 + n * n5;
    }
    
    private static double l(final double n, final double n2, final double n3, final double n4, final double n5, double n6) {
        final double n7 = n2 * n2;
        final double n8 = n7 * n2;
        final double n9 = 3.0 * n7;
        n6 *= n;
        final double n10 = n * n5;
        return -2.0 * n8 * n4 + n9 * n4 + n8 * 2.0 * n3 - n9 * n3 + n3 + n6 * n8 + n8 * n10 - n6 * n7 - n * 2.0 * n5 * n7 + n10 * n2;
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
                final double n6 = d2[n5] - d2[i];
                final double n7 = (n - d2[i]) / n6;
                final double[][] e = this.e;
                n = e[i][n2];
                final double n8 = e[n5][n2];
                final double[][] f = this.f;
                return l(n6, n7, n, n8, f[i][n2], f[n5][n2]);
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
                final double n9 = d2[n8] - d2[n6];
                final double n10 = (n - d2[n6]) / n9;
                for (int n11 = n3; n11 < length2; ++n11) {
                    final double[][] e2 = this.e;
                    final double n12 = e2[n6][n11];
                    n = e2[n8][n11];
                    final double[][] f = this.f;
                    array[n11] = l(n9, n10, n12, n, f[n6][n11], f[n8][n11]);
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
                final double n9 = d2[n8] - d2[n6];
                n = (n - d2[n6]) / n9;
                for (int n10 = n3; n10 < length2; ++n10) {
                    final double[][] e2 = this.e;
                    final double n11 = e2[n6][n10];
                    final double n12 = e2[n8][n10];
                    final double[][] f = this.f;
                    array[n10] = (float)l(n9, n, n11, n12, f[n6][n10], f[n8][n10]);
                }
                return;
            }
        }
    }
    
    @Override
    public double f(double n, final int n2) {
        final double[] d = this.d;
        final int length = d.length;
        int i = 0;
        if (n < d[0]) {
            n = d[0];
        }
        else {
            final int n3 = length - 1;
            if (n >= d[n3]) {
                n = d[n3];
            }
        }
        while (i < length - 1) {
            final double[] d2 = this.d;
            final int n4 = i + 1;
            if (n <= d2[n4]) {
                final double n5 = d2[n4] - d2[i];
                n = (n - d2[i]) / n5;
                final double[][] e = this.e;
                final double n6 = e[i][n2];
                final double n7 = e[n4][n2];
                final double[][] f = this.f;
                return k(n5, n, n6, n7, f[i][n2], f[n4][n2]) / n5;
            }
            i = n4;
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
        if (n <= d[0]) {
            n = d[0];
        }
        else {
            final int n2 = length - 1;
            if (n >= d[n2]) {
                n = d[n2];
            }
        }
        int n3;
        for (int j = 0; j < length - 1; j = n3) {
            final double[] d2 = this.d;
            n3 = j + 1;
            if (n <= d2[n3]) {
                final double n4 = d2[n3] - d2[j];
                n = (n - d2[j]) / n4;
                while (i < length2) {
                    final double[][] e2 = this.e;
                    final double n5 = e2[j][i];
                    final double n6 = e2[n3][i];
                    final double[][] f = this.f;
                    array[i] = k(n4, n, n5, n6, f[j][i], f[n3][i]) / n4;
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
