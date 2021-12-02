// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class l
{
    public static String i = "Oscillator";
    public static final int j = 0;
    public static final int k = 1;
    public static final int l = 2;
    public static final int m = 3;
    public static final int n = 4;
    public static final int o = 5;
    public static final int p = 6;
    public static final int q = 7;
    float[] a;
    double[] b;
    double[] c;
    String d;
    k e;
    int f;
    double g;
    private boolean h;
    
    public l() {
        this.a = new float[0];
        this.b = new double[0];
        this.g = 6.283185307179586;
        this.h = false;
    }
    
    public void a(final double key, final float n) {
        final int n2 = this.a.length + 1;
        int binarySearch;
        final int n3 = binarySearch = Arrays.binarySearch(this.b, key);
        if (n3 < 0) {
            binarySearch = -n3 - 1;
        }
        this.b = Arrays.copyOf(this.b, n2);
        this.a = Arrays.copyOf(this.a, n2);
        this.c = new double[n2];
        final double[] b = this.b;
        System.arraycopy(b, binarySearch, b, binarySearch + 1, n2 - binarySearch - 1);
        this.b[binarySearch] = key;
        this.a[binarySearch] = n;
        this.h = false;
    }
    
    double b(double n) {
        final double n2 = 0.0;
        double key;
        if (n <= 0.0) {
            key = 1.0E-5;
        }
        else {
            key = n;
            if (n >= 1.0) {
                key = 0.999999;
            }
        }
        final int binarySearch = Arrays.binarySearch(this.b, key);
        if (binarySearch > 0) {
            return 0.0;
        }
        n = n2;
        if (binarySearch != 0) {
            final int n3 = -binarySearch - 1;
            final float[] a = this.a;
            final float n4 = a[n3];
            final int n5 = n3 - 1;
            n = n4 - a[n5];
            final double[] b = this.b;
            n /= b[n3] - b[n5];
            n = a[n5] - n * b[n5] + key * n;
        }
        return n;
    }
    
    double c(double n) {
        final double n2 = 1.0;
        double key;
        if (n < 0.0) {
            key = 0.0;
        }
        else {
            key = n;
            if (n > 1.0) {
                key = 1.0;
            }
        }
        final int binarySearch = Arrays.binarySearch(this.b, key);
        if (binarySearch > 0) {
            n = n2;
        }
        else if (binarySearch != 0) {
            final int n3 = -binarySearch - 1;
            final float[] a = this.a;
            final float n4 = a[n3];
            final int n5 = n3 - 1;
            n = n4 - a[n5];
            final double[] b = this.b;
            n /= b[n3] - b[n5];
            n = this.c[n5] + (a[n5] - b[n5] * n) * (key - b[n5]) + n * (key * key - b[n5] * b[n5]) / 2.0;
        }
        else {
            n = 0.0;
        }
        return n;
    }
    
    public double d(double n, double n2, double n3) {
        n2 += this.c(n);
        n = this.b(n) + n3;
        switch (this.f) {
            default: {
                n3 = this.g;
                return n * n3 * Math.cos(n3 * n2);
            }
            case 7: {
                return this.e.f(n2 % 1.0, 0);
            }
            case 6: {
                return n * 4.0 * ((n2 * 4.0 + 2.0) % 4.0 - 2.0);
            }
            case 5: {
                n3 = this.g;
                return -n3 * n * Math.sin(n3 * n2);
            }
            case 4: {
                return -n * 2.0;
            }
            case 3: {
                return n * 2.0;
            }
            case 2: {
                return n * 4.0 * Math.signum((n2 * 4.0 + 3.0) % 4.0 - 2.0);
            }
            case 1: {
                return 0.0;
            }
        }
    }
    
    public double e(double abs, final double n) {
        abs = this.c(abs) + n;
        switch (this.f) {
            default: {
                return Math.sin(this.g * abs);
            }
            case 7: {
                return this.e.c(abs % 1.0, 0);
            }
            case 6: {
                abs = 1.0 - Math.abs(abs * 4.0 % 4.0 - 2.0);
                abs *= abs;
                break;
            }
            case 5: {
                return Math.cos(this.g * (n + abs));
            }
            case 4: {
                abs = (abs * 2.0 + 1.0) % 2.0;
                break;
            }
            case 3: {
                return (abs * 2.0 + 1.0) % 2.0 - 1.0;
            }
            case 2: {
                abs = Math.abs((abs * 4.0 + 1.0) % 4.0 - 2.0);
                break;
            }
            case 1: {
                return Math.signum(0.5 - abs % 1.0);
            }
        }
        return 1.0 - abs;
    }
    
    public void f() {
        double n = 0.0;
        int n2 = 0;
        while (true) {
            final float[] a = this.a;
            if (n2 >= a.length) {
                break;
            }
            n += a[n2];
            ++n2;
        }
        double n3 = 0.0;
        int n4 = 1;
        while (true) {
            final float[] a2 = this.a;
            if (n4 >= a2.length) {
                break;
            }
            final int n5 = n4 - 1;
            final float n6 = (a2[n5] + a2[n4]) / 2.0f;
            final double[] b = this.b;
            n3 += (b[n4] - b[n5]) * n6;
            ++n4;
        }
        int n7 = 0;
        while (true) {
            final float[] a3 = this.a;
            if (n7 >= a3.length) {
                break;
            }
            a3[n7] *= (float)(n / n3);
            ++n7;
        }
        this.c[0] = 0.0;
        int n8 = 1;
        while (true) {
            final float[] a4 = this.a;
            if (n8 >= a4.length) {
                break;
            }
            final int n9 = n8 - 1;
            final float n10 = (a4[n9] + a4[n8]) / 2.0f;
            final double[] b2 = this.b;
            final double n11 = b2[n8];
            final double n12 = b2[n9];
            final double[] c = this.c;
            c[n8] = c[n9] + (n11 - n12) * n10;
            ++n8;
        }
        this.h = true;
    }
    
    public void g(final int f, final String d) {
        this.f = f;
        this.d = d;
        if (d != null) {
            this.e = androidx.constraintlayout.core.motion.utils.k.i(d);
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("pos =");
        sb.append(Arrays.toString(this.b));
        sb.append(" period=");
        sb.append(Arrays.toString(this.a));
        return sb.toString();
    }
}
