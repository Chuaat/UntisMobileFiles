// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

public class f
{
    int a;
    a[][] b;
    int c;
    double[] d;
    double e;
    double[][] f;
    
    public f() {
    }
    
    public f(final double[][] array) {
        this.g(array);
    }
    
    static a[] b(int i, final double[] array) {
        final double[] array2 = new double[i];
        final double[] array3 = new double[i];
        final double[] array4 = new double[i];
        final int n = i - 1;
        final int n2 = 0;
        array2[0] = 0.5;
        final int n3 = 1;
        for (i = 1; i < n; ++i) {
            array2[i] = 1.0 / (4.0 - array2[i - 1]);
        }
        final int n4 = n - 1;
        array2[n] = 1.0 / (2.0 - array2[n4]);
        array3[0] = (array[1] - array[0]) * 3.0 * array2[0];
        int n5;
        double n6;
        int n7;
        for (i = n3; i < n; i = n5) {
            n5 = i + 1;
            n6 = array[n5];
            n7 = i - 1;
            array3[i] = ((n6 - array[n7]) * 3.0 - array3[n7]) * array2[i];
        }
        array4[n] = (array3[n] = ((array[n] - array[n4]) * 3.0 - array3[n4]) * array2[n]);
        for (i = n4; i >= 0; --i) {
            array4[i] = array3[i] - array2[i] * array4[i + 1];
        }
        final a[] array5 = new a[n];
        double n8;
        double n9;
        int n10;
        for (i = n2; i < n; i = n10) {
            n8 = (float)array[i];
            n9 = array4[i];
            n10 = i + 1;
            array5[i] = new a(n8, n9, (array[n10] - array[i]) * 3.0 - array4[i] * 2.0 - array4[n10], (array[i] - array[n10]) * 2.0 + array4[i] + array4[n10]);
        }
        return array5;
    }
    
    public double a(final a[] array) {
        final int length = array.length;
        final double[] array2 = new double[array.length];
        final double n = 0.0;
        double n3;
        double n2 = n3 = 0.0;
        int i;
        double a;
        while (true) {
            i = 0;
            final int n4 = 0;
            a = n;
            if (n2 >= 1.0) {
                break;
            }
            double a2 = 0.0;
            for (int j = n4; j < array.length; ++j) {
                final double n5 = array2[j];
                final double a3 = array[j].a(n2);
                array2[j] = a3;
                final double n6 = n5 - a3;
                a2 += n6 * n6;
            }
            double n7 = n3;
            if (n2 > 0.0) {
                n7 = n3 + Math.sqrt(a2);
            }
            n2 += 0.1;
            n3 = n7;
        }
        while (i < array.length) {
            final double n8 = array2[i];
            final double a4 = array[i].a(1.0);
            array2[i] = a4;
            final double n9 = n8 - a4;
            a += n9 * n9;
            ++i;
        }
        return n3 + Math.sqrt(a);
    }
    
    public double c(double n, final int n2) {
        n *= this.e;
        int n3 = 0;
        double[] d;
        while (true) {
            d = this.d;
            if (n3 >= d.length - 1 || d[n3] >= n) {
                break;
            }
            n -= d[n3];
            ++n3;
        }
        return this.b[n2][n3].a(n / d[n3]);
    }
    
    public void d(double n, final double[] array) {
        n *= this.e;
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            final double[] d = this.d;
            i = n2;
            if (n3 >= d.length - 1) {
                break;
            }
            i = n2;
            if (d[n3] >= n) {
                break;
            }
            n -= d[n3];
            ++n3;
        }
        while (i < array.length) {
            array[i] = this.b[i][n3].a(n / this.d[n3]);
            ++i;
        }
    }
    
    public void e(double n, final float[] array) {
        n *= this.e;
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            final double[] d = this.d;
            i = n2;
            if (n3 >= d.length - 1) {
                break;
            }
            i = n2;
            if (d[n3] >= n) {
                break;
            }
            n -= d[n3];
            ++n3;
        }
        while (i < array.length) {
            array[i] = (float)this.b[i][n3].a(n / this.d[n3]);
            ++i;
        }
    }
    
    public void f(double n, final double[] array) {
        n *= this.e;
        final int n2 = 0;
        int n3 = 0;
        int i;
        while (true) {
            final double[] d = this.d;
            i = n2;
            if (n3 >= d.length - 1) {
                break;
            }
            i = n2;
            if (d[n3] >= n) {
                break;
            }
            n -= d[n3];
            ++n3;
        }
        while (i < array.length) {
            array[i] = this.b[i][n3].b(n / this.d[n3]);
            ++i;
        }
    }
    
    public void g(final double[][] array) {
        final int length = array[0].length;
        this.c = length;
        final int length2 = array.length;
        this.a = length2;
        this.f = new double[length][length2];
        this.b = new a[this.c][];
        for (int i = 0; i < this.c; ++i) {
            for (int j = 0; j < this.a; ++j) {
                this.f[i][j] = array[j][i];
            }
        }
        int n = 0;
        int c;
        while (true) {
            c = this.c;
            if (n >= c) {
                break;
            }
            final a[][] b = this.b;
            final double[][] f = this.f;
            b[n] = b(f[n].length, f[n]);
            ++n;
        }
        this.d = new double[this.a - 1];
        this.e = 0.0;
        final a[] array2 = new a[c];
        for (int k = 0; k < this.d.length; ++k) {
            for (int l = 0; l < this.c; ++l) {
                array2[l] = this.b[l][k];
            }
            final double e = this.e;
            final double[] d = this.d;
            final double a = this.a(array2);
            d[k] = a;
            this.e = e + a;
        }
    }
    
    public static class a
    {
        public static final double e = 0.3333333333333333;
        public static final double f = 0.5;
        double a;
        double b;
        double c;
        double d;
        
        public a(final double a, final double b, final double c, final double d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public double a(final double n) {
            return ((this.d * n + this.c) * n + this.b) * n + this.a;
        }
        
        public double b(final double n) {
            return (this.d * 0.3333333333333333 * n + this.c * 0.5) * n + this.b;
        }
    }
}
