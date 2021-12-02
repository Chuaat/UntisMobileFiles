// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class a extends b
{
    public static final int g = 1;
    public static final int h = 2;
    public static final int i = 3;
    public static final int j = 0;
    private static final int k = 1;
    private static final int l = 2;
    private static final int m = 3;
    private final double[] d;
    a[] e;
    private boolean f;
    
    public a(final int[] array, final double[] d, final double[][] array2) {
        this.f = true;
        this.d = d;
        this.e = new a[d.length - 1];
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        while (true) {
            final a[] e = this.e;
            if (n >= e.length) {
                break;
            }
            final int n4 = array[n];
            if (n4 != 0) {
                if (n4 != 1) {
                    if (n4 != 2) {
                        if (n4 == 3) {
                            if (n2 == 1) {
                                n2 = 2;
                            }
                            else {
                                n2 = 1;
                            }
                            n3 = n2;
                        }
                    }
                    else {
                        n2 = 2;
                        n3 = 2;
                    }
                }
                else {
                    n2 = 1;
                    n3 = 1;
                }
            }
            else {
                n3 = 3;
            }
            final double n5 = d[n];
            final int n6 = n + 1;
            e[n] = new a(n3, n5, d[n6], array2[n][0], array2[n][1], array2[n6][0], array2[n6][1]);
            n = n6;
        }
    }
    
    @Override
    public double c(double n, final int n2) {
        final boolean f = this.f;
        final int n3 = 0;
        int n7 = 0;
        double n8 = 0.0;
        Label_0372: {
            if (f) {
                final a[] e = this.e;
                double n4;
                double n6;
                if (n < e[0].c) {
                    final double c = e[0].c;
                    n4 = n - e[0].c;
                    if (!e[0].r) {
                        e[0].k(c);
                        double n5;
                        if (n2 == 0) {
                            n5 = this.e[0].h();
                            n = this.e[0].b();
                        }
                        else {
                            n5 = this.e[0].i();
                            n = this.e[0].c();
                        }
                        return n5 + n4 * n;
                    }
                    if (n2 == 0) {
                        n6 = e[0].f(c);
                        n = this.e[0].d(c);
                    }
                    else {
                        n6 = e[0].g(c);
                        n = this.e[0].e(c);
                    }
                }
                else {
                    n7 = n3;
                    n8 = n;
                    if (n <= e[e.length - 1].d) {
                        break Label_0372;
                    }
                    final double d = e[e.length - 1].d;
                    n4 = n - d;
                    final int n9 = e.length - 1;
                    if (n2 == 0) {
                        n6 = e[n9].f(d);
                        n = this.e[n9].d(d);
                    }
                    else {
                        n6 = e[n9].g(d);
                        n = this.e[n9].e(d);
                    }
                }
                return n6 + n4 * n;
            }
            final a[] e2 = this.e;
            if (n < e2[0].c) {
                n8 = e2[0].c;
                n7 = n3;
            }
            else {
                n7 = n3;
                n8 = n;
                if (n > e2[e2.length - 1].d) {
                    n8 = e2[e2.length - 1].d;
                    n7 = n3;
                }
            }
        }
        while (true) {
            final a[] e3 = this.e;
            if (n7 >= e3.length) {
                return Double.NaN;
            }
            if (n8 <= e3[n7].d) {
                if (e3[n7].r) {
                    if (n2 == 0) {
                        return e3[n7].f(n8);
                    }
                    return e3[n7].g(n8);
                }
                else {
                    e3[n7].k(n8);
                    final a[] e4 = this.e;
                    if (n2 == 0) {
                        return e4[n7].h();
                    }
                    return e4[n7].i();
                }
            }
            else {
                ++n7;
            }
        }
    }
    
    @Override
    public void d(double n, final double[] array) {
        double d;
        if (this.f) {
            final a[] e = this.e;
            if (n < e[0].c) {
                final double c = e[0].c;
                n -= e[0].c;
                if (e[0].r) {
                    array[0] = e[0].f(c) + this.e[0].d(c) * n;
                    array[1] = this.e[0].g(c) + n * this.e[0].e(c);
                }
                else {
                    e[0].k(c);
                    array[0] = this.e[0].h() + this.e[0].b() * n;
                    array[1] = this.e[0].i() + n * this.e[0].c();
                }
                return;
            }
            d = n;
            if (n > e[e.length - 1].d) {
                final double d2 = e[e.length - 1].d;
                final double n2 = n - d2;
                final int n3 = e.length - 1;
                if (e[n3].r) {
                    array[0] = e[n3].f(d2) + this.e[n3].d(d2) * n2;
                    array[1] = this.e[n3].g(d2) + n2 * this.e[n3].e(d2);
                }
                else {
                    e[n3].k(n);
                    array[0] = this.e[n3].h() + this.e[n3].b() * n2;
                    array[1] = this.e[n3].i() + n2 * this.e[n3].c();
                }
                return;
            }
        }
        else {
            final a[] e2 = this.e;
            double c2 = n;
            if (n < e2[0].c) {
                c2 = e2[0].c;
            }
            d = c2;
            if (c2 > e2[e2.length - 1].d) {
                d = e2[e2.length - 1].d;
            }
        }
        int n4 = 0;
        while (true) {
            final a[] e3 = this.e;
            if (n4 >= e3.length) {
                return;
            }
            if (d <= e3[n4].d) {
                if (e3[n4].r) {
                    array[0] = e3[n4].f(d);
                    array[1] = this.e[n4].g(d);
                    return;
                }
                e3[n4].k(d);
                array[0] = this.e[n4].h();
                array[1] = this.e[n4].i();
            }
            else {
                ++n4;
            }
        }
    }
    
    @Override
    public void e(double n, final float[] array) {
        double n2;
        if (this.f) {
            final a[] e = this.e;
            if (n < e[0].c) {
                final double c = e[0].c;
                n -= e[0].c;
                if (e[0].r) {
                    array[0] = (float)(e[0].f(c) + this.e[0].d(c) * n);
                    array[1] = (float)(this.e[0].g(c) + n * this.e[0].e(c));
                }
                else {
                    e[0].k(c);
                    array[0] = (float)(this.e[0].h() + this.e[0].b() * n);
                    array[1] = (float)(this.e[0].i() + n * this.e[0].c());
                }
                return;
            }
            n2 = n;
            if (n > e[e.length - 1].d) {
                final double d = e[e.length - 1].d;
                final double n3 = n - d;
                final int n4 = e.length - 1;
                if (e[n4].r) {
                    array[0] = (float)(e[n4].f(d) + this.e[n4].d(d) * n3);
                    array[1] = (float)(this.e[n4].g(d) + n3 * this.e[n4].e(d));
                }
                else {
                    e[n4].k(n);
                    array[0] = (float)this.e[n4].h();
                    array[1] = (float)this.e[n4].i();
                }
                return;
            }
        }
        else {
            final a[] e2 = this.e;
            if (n < e2[0].c) {
                n2 = e2[0].c;
            }
            else {
                n2 = n;
                if (n > e2[e2.length - 1].d) {
                    n2 = e2[e2.length - 1].d;
                }
            }
        }
        int n5 = 0;
        while (true) {
            final a[] e3 = this.e;
            if (n5 >= e3.length) {
                return;
            }
            if (n2 <= e3[n5].d) {
                if (e3[n5].r) {
                    array[0] = (float)e3[n5].f(n2);
                    array[1] = (float)this.e[n5].g(n2);
                    return;
                }
                e3[n5].k(n2);
                array[0] = (float)this.e[n5].h();
                array[1] = (float)this.e[n5].i();
            }
            else {
                ++n5;
            }
        }
    }
    
    @Override
    public double f(double d, final int n) {
        final a[] e = this.e;
        final int n2 = 0;
        double c = d;
        if (d < e[0].c) {
            c = e[0].c;
        }
        int n3 = n2;
        d = c;
        if (c > e[e.length - 1].d) {
            d = e[e.length - 1].d;
            n3 = n2;
        }
        while (true) {
            final a[] e2 = this.e;
            if (n3 >= e2.length) {
                return Double.NaN;
            }
            if (d <= e2[n3].d) {
                if (e2[n3].r) {
                    if (n == 0) {
                        return e2[n3].d(d);
                    }
                    return e2[n3].e(d);
                }
                else {
                    e2[n3].k(d);
                    final a[] e3 = this.e;
                    if (n == 0) {
                        return e3[n3].b();
                    }
                    return e3[n3].c();
                }
            }
            else {
                ++n3;
            }
        }
    }
    
    @Override
    public void g(final double n, final double[] array) {
        final a[] e = this.e;
        double n2;
        if (n < e[0].c) {
            n2 = e[0].c;
        }
        else {
            n2 = n;
            if (n > e[e.length - 1].d) {
                n2 = e[e.length - 1].d;
            }
        }
        int n3 = 0;
        while (true) {
            final a[] e2 = this.e;
            if (n3 >= e2.length) {
                return;
            }
            if (n2 <= e2[n3].d) {
                if (e2[n3].r) {
                    array[0] = e2[n3].d(n2);
                    array[1] = this.e[n3].e(n2);
                    return;
                }
                e2[n3].k(n2);
                array[0] = this.e[n3].b();
                array[1] = this.e[n3].c();
            }
            else {
                ++n3;
            }
        }
    }
    
    @Override
    public double[] h() {
        return this.d;
    }
    
    private static class a
    {
        private static final String s = "Arc";
        private static double[] t;
        private static final double u = 0.001;
        double[] a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double g;
        double h;
        double i;
        double j;
        double k;
        double l;
        double m;
        double n;
        double o;
        double p;
        boolean q;
        boolean r;
        
        static {
            a.t = new double[91];
        }
        
        a(int n, double x, double y, double n2, double c, final double f, final double h) {
            boolean q = false;
            this.r = false;
            final int n3 = 1;
            if (n == 1) {
                q = true;
            }
            this.q = q;
            this.c = x;
            this.d = y;
            this.i = 1.0 / (y - x);
            if (3 == n) {
                this.r = true;
            }
            y = f - n2;
            x = h - c;
            if (!this.r && Math.abs(y) >= 0.001 && Math.abs(x) >= 0.001) {
                this.a = new double[101];
                final boolean q2 = this.q;
                if (q2) {
                    n = -1;
                }
                else {
                    n = 1;
                }
                this.j = y * n;
                if (q2) {
                    n = n3;
                }
                else {
                    n = -1;
                }
                this.k = x * n;
                if (q2) {
                    x = f;
                }
                else {
                    x = n2;
                }
                this.l = x;
                if (q2) {
                    x = c;
                }
                else {
                    x = h;
                }
                this.m = x;
                this.a(n2, c, f, h);
                this.n = this.b * this.i;
                return;
            }
            this.r = true;
            this.e = n2;
            this.f = f;
            this.g = c;
            this.h = h;
            n2 = Math.hypot(x, y);
            this.b = n2;
            this.n = n2 * this.i;
            n2 = this.d;
            c = this.c;
            this.l = y / (n2 - c);
            this.m = x / (n2 - c);
        }
        
        private void a(double n, double key, final double n2, final double n3) {
            int n4 = 0;
            double b = 0.0;
            double n5 = 0.0;
            double n6 = 0.0;
            while (true) {
                final double[] t = androidx.constraintlayout.core.motion.utils.a.a.t;
                if (n4 >= t.length) {
                    break;
                }
                final double radians = Math.toRadians(n4 * 90.0 / (t.length - 1));
                final double sin = Math.sin(radians);
                final double cos = Math.cos(radians);
                final double n7 = sin * (n2 - n);
                final double n8 = cos * (key - n3);
                if (n4 > 0) {
                    b += Math.hypot(n7 - n5, n8 - n6);
                    androidx.constraintlayout.core.motion.utils.a.a.t[n4] = b;
                }
                ++n4;
                n6 = n8;
                n5 = n7;
            }
            this.b = b;
            int n9 = 0;
            while (true) {
                final double[] t2 = androidx.constraintlayout.core.motion.utils.a.a.t;
                if (n9 >= t2.length) {
                    break;
                }
                t2[n9] /= b;
                ++n9;
            }
            int n10 = 0;
            while (true) {
                final double[] a = this.a;
                if (n10 >= a.length) {
                    break;
                }
                key = n10 / (double)(a.length - 1);
                final int binarySearch = Arrays.binarySearch(androidx.constraintlayout.core.motion.utils.a.a.t, key);
                if (binarySearch >= 0) {
                    this.a[n10] = binarySearch / (double)(androidx.constraintlayout.core.motion.utils.a.a.t.length - 1);
                }
                else if (binarySearch == -1) {
                    this.a[n10] = 0.0;
                }
                else {
                    final int n11 = -binarySearch;
                    final int n12 = n11 - 2;
                    n = n12;
                    final double[] t3 = androidx.constraintlayout.core.motion.utils.a.a.t;
                    n = (n + (key - t3[n12]) / (t3[n11 - 1] - t3[n12])) / (t3.length - 1);
                    this.a[n10] = n;
                }
                ++n10;
            }
        }
        
        double b() {
            final double x = this.j * this.p;
            final double n = this.n / Math.hypot(x, -this.k * this.o);
            double n2 = x;
            if (this.q) {
                n2 = -x;
            }
            return n2 * n;
        }
        
        double c() {
            final double j = this.j;
            final double p = this.p;
            final double y = -this.k * this.o;
            final double n = this.n / Math.hypot(j * p, y);
            double n2;
            if (this.q) {
                n2 = -y * n;
            }
            else {
                n2 = y * n;
            }
            return n2;
        }
        
        public double d(final double n) {
            return this.l;
        }
        
        public double e(final double n) {
            return this.m;
        }
        
        public double f(final double n) {
            final double c = this.c;
            final double i = this.i;
            final double e = this.e;
            return e + (n - c) * i * (this.f - e);
        }
        
        public double g(final double n) {
            final double c = this.c;
            final double i = this.i;
            final double g = this.g;
            return g + (n - c) * i * (this.h - g);
        }
        
        double h() {
            return this.l + this.j * this.o;
        }
        
        double i() {
            return this.m + this.k * this.p;
        }
        
        double j(double n) {
            if (n <= 0.0) {
                return 0.0;
            }
            if (n >= 1.0) {
                return 1.0;
            }
            final double[] a = this.a;
            final double n2 = n * (a.length - 1);
            final int n3 = (int)n2;
            n = n3;
            return a[n3] + (n2 - n) * (a[n3 + 1] - a[n3]);
        }
        
        void k(double n) {
            if (this.q) {
                n = this.d - n;
            }
            else {
                n -= this.c;
            }
            n = this.j(n * this.i) * 1.5707963267948966;
            this.o = Math.sin(n);
            this.p = Math.cos(n);
        }
    }
}
