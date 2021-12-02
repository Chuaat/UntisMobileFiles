// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion;

import java.util.Iterator;
import java.util.Arrays;
import java.util.HashMap;
import androidx.constraintlayout.core.motion.utils.d;

public class e implements Comparable<e>
{
    public static final String Z = "MotionPaths";
    public static final boolean a0 = false;
    public static final boolean b0 = false;
    static final int c0 = 0;
    static final int d0 = 1;
    static final int e0 = 2;
    static final int f0 = 3;
    static final int g0 = 4;
    static final int h0 = 5;
    public static final int i0 = 1;
    public static final int j0 = 0;
    public static final int k0 = 2;
    static String[] l0;
    d G;
    int H;
    float I;
    float J;
    float K;
    float L;
    float M;
    float N;
    float O;
    float P;
    int Q;
    int R;
    float S;
    c T;
    HashMap<String, b> U;
    int V;
    int W;
    double[] X;
    double[] Y;
    
    static {
        e.l0 = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
    }
    
    public e() {
        this.H = 0;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = -1;
        this.R = -1;
        this.S = Float.NaN;
        this.T = null;
        this.U = new HashMap<String, b>();
        this.V = 0;
        this.X = new double[18];
        this.Y = new double[18];
    }
    
    public e(final int n, final int n2, final androidx.constraintlayout.core.motion.key.e e, final e e2, final e e3) {
        this.H = 0;
        this.O = Float.NaN;
        this.P = Float.NaN;
        this.Q = -1;
        this.R = -1;
        this.S = Float.NaN;
        this.T = null;
        this.U = new HashMap<String, b>();
        this.V = 0;
        this.X = new double[18];
        this.Y = new double[18];
        if (e2.R != -1) {
            this.z(n, n2, e, e2, e3);
            return;
        }
        final int i = e.I;
        if (i == 1) {
            this.y(e, e2, e3);
            return;
        }
        if (i != 2) {
            this.v(e, e2, e3);
            return;
        }
        this.A(n, n2, e, e2, e3);
    }
    
    private static final float K(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        return (n5 - n3) * n2 - (n6 - n4) * n + n3;
    }
    
    private static final float M(final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        return (n5 - n3) * n + (n6 - n4) * n2 + n4;
    }
    
    private boolean g(final float n, final float n2) {
        final boolean naN = Float.isNaN(n);
        final boolean b = true;
        boolean b2 = true;
        if (!naN && !Float.isNaN(n2)) {
            if (Math.abs(n - n2) <= 1.0E-6f) {
                b2 = false;
            }
            return b2;
        }
        return Float.isNaN(n) != Float.isNaN(n2) && b;
    }
    
    void A(int n, final int n2, final androidx.constraintlayout.core.motion.key.e e, final e e2, final e e3) {
        final float i = e.h / 100.0f;
        this.I = i;
        this.H = e.B;
        float c;
        if (Float.isNaN(e.C)) {
            c = i;
        }
        else {
            c = e.C;
        }
        float d;
        if (Float.isNaN(e.D)) {
            d = i;
        }
        else {
            d = e.D;
        }
        final float m = e3.M;
        final float j = e2.M;
        final float n3 = e3.N;
        final float n4 = e2.N;
        this.J = this.I;
        final float k = e2.K;
        final float n5 = j / 2.0f;
        final float l = e2.L;
        final float n6 = n4 / 2.0f;
        final float k2 = e3.K;
        final float n7 = m / 2.0f;
        final float l2 = e3.L;
        final float n8 = n3 / 2.0f;
        final float n9 = (m - j) * c;
        this.K = (float)(int)(k + (k2 + n7 - (n5 + k)) * i - n9 / 2.0f);
        final float n10 = (n3 - n4) * d;
        this.L = (float)(int)(l + (l2 + n8 - (l + n6)) * i - n10 / 2.0f);
        this.M = (float)(int)(j + n9);
        this.N = (float)(int)(n4 + n10);
        this.V = 2;
        if (!Float.isNaN(e.E)) {
            n -= (int)this.M;
            this.K = (float)(int)(e.E * n);
        }
        if (!Float.isNaN(e.F)) {
            n = (int)(n2 - this.N);
            this.L = (float)(int)(e.F * n);
        }
        this.R = this.R;
        this.G = androidx.constraintlayout.core.motion.utils.d.c(e.z);
        this.Q = e.A;
    }
    
    void B(final float k, final float l, final float m, final float n) {
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
    }
    
    void E(final float n, final float n2, final float[] array, final int[] array2, final double[] array3, final double[] array4) {
        int i = 0;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        while (i < array2.length) {
            final float n7 = (float)array3[i];
            final double n8 = array4[i];
            final int n9 = array2[i];
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 == 4) {
                            n6 = n7;
                        }
                    }
                    else {
                        n4 = n7;
                    }
                }
                else {
                    n5 = n7;
                }
            }
            else {
                n3 = n7;
            }
            ++i;
        }
        final float n10 = n3 - 0.0f * n4 / 2.0f;
        final float n11 = n5 - 0.0f * n6 / 2.0f;
        array[0] = n10 * (1.0f - n) + (n4 * 1.0f + n10) * n + 0.0f;
        array[1] = n11 * (1.0f - n2) + (n6 * 1.0f + n11) * n2 + 0.0f;
    }
    
    void G(float n, final f f, final int[] array, final double[] array2, final double[] array3, final double[] array4) {
        float k = this.K;
        float l = this.L;
        float m = this.M;
        float n2 = this.N;
        if (array.length != 0 && this.X.length <= array[array.length - 1]) {
            final int n3 = array[array.length - 1] + 1;
            this.X = new double[n3];
            this.Y = new double[n3];
        }
        Arrays.fill(this.X, Double.NaN);
        for (int i = 0; i < array.length; ++i) {
            this.X[array[i]] = array2[i];
            this.Y[array[i]] = array3[i];
        }
        float n4 = Float.NaN;
        int n5 = 0;
        float n6 = 0.0f;
        float n7 = 0.0f;
        float n8 = 0.0f;
        float n9 = 0.0f;
        while (true) {
            final double[] x = this.X;
            if (n5 >= x.length) {
                break;
            }
            final boolean naN = Double.isNaN(x[n5]);
            double n10 = 0.0;
            float n12 = 0.0f;
            Label_0345: {
                if (!naN || (array4 != null && array4[n5] != 0.0)) {
                    if (array4 != null) {
                        n10 = array4[n5];
                    }
                    if (!Double.isNaN(this.X[n5])) {
                        n10 += this.X[n5];
                    }
                    final float n11 = n4;
                    n12 = (float)n10;
                    final float n13 = (float)this.Y[n5];
                    if (n5 == 1) {
                        k = n12;
                        n6 = n13;
                        n12 = n11;
                        break Label_0345;
                    }
                    if (n5 == 2) {
                        l = n12;
                        n12 = n11;
                        n7 = n13;
                        break Label_0345;
                    }
                    if (n5 == 3) {
                        m = n12;
                        n12 = n11;
                        n8 = n13;
                        break Label_0345;
                    }
                    if (n5 == 4) {
                        n2 = n12;
                        n12 = n11;
                        n9 = n13;
                        break Label_0345;
                    }
                    if (n5 == 5) {
                        break Label_0345;
                    }
                }
                n12 = n4;
            }
            ++n5;
            n4 = n12;
        }
        final c t = this.T;
        float n20;
        if (t != null) {
            final float[] array5 = new float[2];
            final float[] array6 = new float[2];
            t.m(n, array5, array6);
            n = array5[0];
            final float n14 = array5[1];
            final float n15 = array6[0];
            final float n16 = array6[1];
            final double n17 = n;
            final double n18 = k;
            final double n19 = l;
            n = (float)(n17 + Math.sin(n19) * n18 - m / 2.0f);
            n20 = (float)(n14 - Math.cos(n19) * n18 - n2 / 2.0f);
            final double n21 = n15;
            final double n22 = n6;
            final double sin = Math.sin(n19);
            final double cos = Math.cos(n19);
            final double n23 = n7;
            final float n24 = (float)(n21 + sin * n22 + cos * n18 * n23);
            final float n25 = (float)(n16 - n22 * Math.cos(n19) + n18 * Math.sin(n19) * n23);
            if (array3.length >= 2) {
                array3[0] = n24;
                array3[1] = n25;
            }
            if (!Float.isNaN(n4)) {
                f.Q((float)(n4 + Math.toDegrees(Math.atan2(n25, n24))));
            }
        }
        else {
            n = k;
            n20 = l;
            if (!Float.isNaN(n4)) {
                n = n8 / 2.0f;
                f.Q((float)(0.0f + (n4 + Math.toDegrees(Math.atan2(n7 + n9 / 2.0f, n6 + n)))));
                n20 = l;
                n = k;
            }
        }
        n += 0.5f;
        final int n26 = (int)n;
        final float n27 = n20 + 0.5f;
        f.G(n26, (int)n27, (int)(n + m), (int)(n27 + n2));
    }
    
    public void I(final c t, final e e) {
        final double n = this.K + this.M / 2.0f - e.K - e.M / 2.0f;
        final double n2 = this.L + this.N / 2.0f - e.L - e.N / 2.0f;
        this.T = t;
        this.K = (float)Math.hypot(n2, n);
        double radians;
        if (Float.isNaN(this.S)) {
            radians = Math.atan2(n2, n) + 1.5707963267948966;
        }
        else {
            radians = Math.toRadians(this.S);
        }
        this.L = (float)radians;
    }
    
    public void b(final f f) {
        this.G = d.c(f.i.c);
        final f.a i = f.i;
        this.Q = i.d;
        this.R = i.a;
        this.O = i.h;
        this.H = i.e;
        this.W = i.b;
        this.P = f.j.d;
        this.S = 0.0f;
        for (final String key : f.j()) {
            final b j = f.i(key);
            if (j != null && j.q()) {
                this.U.put(key, j);
            }
        }
    }
    
    public int d(final e e) {
        return Float.compare(this.J, e.J);
    }
    
    public void f(final c c) {
        c.A(this.P);
    }
    
    void h(final e e, final boolean[] array, final String[] array2, final boolean b) {
        final boolean g = this.g(this.K, e.K);
        final boolean g2 = this.g(this.L, e.L);
        array[0] |= this.g(this.J, e.J);
        final boolean b2 = array[1];
        final boolean b3 = g | g2 | b;
        array[1] = (b2 | b3);
        array[2] |= b3;
        array[3] |= this.g(this.M, e.M);
        array[4] |= this.g(this.N, e.N);
    }
    
    void i(final double[] array, final int[] array2) {
        final float j = this.J;
        int i = 0;
        final float k = this.K;
        final float l = this.L;
        final float m = this.M;
        final float n = this.N;
        final float o = this.O;
        int n2 = 0;
        while (i < array2.length) {
            int n3 = n2;
            if (array2[i] < 6) {
                array[n2] = (new float[] { j, k, l, m, n, o })[array2[i]];
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
    }
    
    void j(final int[] array, final double[] array2, final float[] array3, final int n) {
        float m = this.M;
        float n2 = this.N;
        for (int i = 0; i < array.length; ++i) {
            final float n3 = (float)array2[i];
            final int n4 = array[i];
            if (n4 != 3) {
                if (n4 == 4) {
                    n2 = n3;
                }
            }
            else {
                m = n3;
            }
        }
        array3[n] = m;
        array3[n + 1] = n2;
    }
    
    void k(double n, final int[] array, final double[] array2, final float[] array3, final int n2) {
        float k = this.K;
        float l = this.L;
        float m = this.M;
        float n3 = this.N;
        for (int i = 0; i < array.length; ++i) {
            final float n4 = (float)array2[i];
            final int n5 = array[i];
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        if (n5 == 4) {
                            n3 = n4;
                        }
                    }
                    else {
                        m = n4;
                    }
                }
                else {
                    l = n4;
                }
            }
            else {
                k = n4;
            }
        }
        final c t = this.T;
        float n6 = k;
        float n7 = l;
        if (t != null) {
            final float[] array4 = new float[2];
            t.m(n, array4, new float[2]);
            final float n8 = array4[0];
            final float n9 = array4[1];
            final double n10 = n8;
            final double n11 = k;
            n = l;
            n6 = (float)(n10 + Math.sin(n) * n11 - m / 2.0f);
            n7 = (float)(n9 - n11 * Math.cos(n) - n3 / 2.0f);
        }
        array3[n2] = n6 + m / 2.0f + 0.0f;
        array3[n2 + 1] = n7 + n3 / 2.0f + 0.0f;
    }
    
    void l(double n, final int[] array, final double[] array2, final float[] array3, final double[] array4, final float[] array5) {
        float k = this.K;
        float l = this.L;
        float m = this.M;
        float n2 = this.N;
        int i = 0;
        float n3 = 0.0f;
        float n4 = 0.0f;
        float n5 = 0.0f;
        float n6 = 0.0f;
        while (i < array.length) {
            final float n7 = (float)array2[i];
            final float n8 = (float)array4[i];
            final int n9 = array[i];
            if (n9 != 1) {
                if (n9 != 2) {
                    if (n9 != 3) {
                        if (n9 == 4) {
                            n2 = n7;
                            n6 = n8;
                        }
                    }
                    else {
                        m = n7;
                        n4 = n8;
                    }
                }
                else {
                    l = n7;
                    n5 = n8;
                }
            }
            else {
                n3 = n8;
                k = n7;
            }
            ++i;
        }
        float n10 = n4 / 2.0f + n3;
        float n11 = n6 / 2.0f + n5;
        final c t = this.T;
        if (t != null) {
            final float[] array6 = new float[2];
            final float[] array7 = new float[2];
            t.m(n, array6, array7);
            final float n12 = array6[0];
            final float n13 = array6[1];
            final float n14 = array7[0];
            final float n15 = array7[1];
            final double n16 = n12;
            final double n17 = k;
            n = l;
            k = (float)(n16 + Math.sin(n) * n17 - m / 2.0f);
            l = (float)(n13 - n17 * Math.cos(n) - n2 / 2.0f);
            final double n18 = n14;
            final double n19 = n3;
            final double sin = Math.sin(n);
            final double cos = Math.cos(n);
            final double n20 = n5;
            final float n21 = (float)(n18 + sin * n19 + cos * n20);
            final float n22 = (float)(n15 - n19 * Math.cos(n) + Math.sin(n) * n20);
            n10 = n21;
            n11 = n22;
        }
        array3[0] = k + m / 2.0f + 0.0f;
        array3[1] = l + n2 / 2.0f + 0.0f;
        array5[0] = n10;
        array5[1] = n11;
    }
    
    void m(double n, final int[] array, final double[] array2, final float[] array3, final int n2) {
        float k = this.K;
        float l = this.L;
        float m = this.M;
        float n3 = this.N;
        for (int i = 0; i < array.length; ++i) {
            final float n4 = (float)array2[i];
            final int n5 = array[i];
            if (n5 != 1) {
                if (n5 != 2) {
                    if (n5 != 3) {
                        if (n5 == 4) {
                            n3 = n4;
                        }
                    }
                    else {
                        m = n4;
                    }
                }
                else {
                    l = n4;
                }
            }
            else {
                k = n4;
            }
        }
        final c t = this.T;
        float n6 = k;
        float n7 = l;
        if (t != null) {
            final float[] array4 = new float[2];
            t.m(n, array4, new float[2]);
            final float n8 = array4[0];
            final float n9 = array4[1];
            final double n10 = n8;
            final double n11 = k;
            n = l;
            n6 = (float)(n10 + Math.sin(n) * n11 - m / 2.0f);
            n7 = (float)(n9 - n11 * Math.cos(n) - n3 / 2.0f);
        }
        array3[n2] = n6 + m / 2.0f + 0.0f;
        array3[n2 + 1] = n7 + n3 / 2.0f + 0.0f;
    }
    
    int o(final String key, final double[] array, int n) {
        final b b = this.U.get(key);
        int i = 0;
        if (b == null) {
            return 0;
        }
        if (b.r() == 1) {
            array[n] = b.n();
            return 1;
        }
        final int r = b.r();
        final float[] array2 = new float[r];
        b.o(array2);
        while (i < r) {
            array[n] = array2[i];
            ++i;
            ++n;
        }
        return r;
    }
    
    int p(final String key) {
        final b b = this.U.get(key);
        if (b == null) {
            return 0;
        }
        return b.r();
    }
    
    void s(final int[] array, final double[] array2, final float[] array3, int n) {
        float k = this.K;
        float l = this.L;
        float m = this.M;
        float n2 = this.N;
        for (int i = 0; i < array.length; ++i) {
            final float n3 = (float)array2[i];
            final int n4 = array[i];
            if (n4 != 1) {
                if (n4 != 2) {
                    if (n4 != 3) {
                        if (n4 == 4) {
                            n2 = n3;
                        }
                    }
                    else {
                        m = n3;
                    }
                }
                else {
                    l = n3;
                }
            }
            else {
                k = n3;
            }
        }
        final c t = this.T;
        float n5 = k;
        float n6 = l;
        if (t != null) {
            final float n7 = t.n();
            final float o = this.T.o();
            final double n8 = n7;
            final double n9 = k;
            final double n10 = l;
            n5 = (float)(n8 + Math.sin(n10) * n9 - m / 2.0f);
            n6 = (float)(o - n9 * Math.cos(n10) - n2 / 2.0f);
        }
        final float n11 = m + n5;
        final float n12 = n2 + n6;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        final int n13 = n + 1;
        array3[n] = n5 + 0.0f;
        n = n13 + 1;
        array3[n13] = n6 + 0.0f;
        final int n14 = n + 1;
        array3[n] = n11 + 0.0f;
        n = n14 + 1;
        array3[n14] = n6 + 0.0f;
        final int n15 = n + 1;
        array3[n] = n11 + 0.0f;
        n = n15 + 1;
        array3[n15] = n12 + 0.0f;
        array3[n] = n5 + 0.0f;
        array3[n + 1] = n12 + 0.0f;
    }
    
    boolean u(final String key) {
        return this.U.containsKey(key);
    }
    
    void v(final androidx.constraintlayout.core.motion.key.e e, final e e2, final e e3) {
        float f = e.h / 100.0f;
        this.I = f;
        this.H = e.B;
        float c;
        if (Float.isNaN(e.C)) {
            c = f;
        }
        else {
            c = e.C;
        }
        float d;
        if (Float.isNaN(e.D)) {
            d = f;
        }
        else {
            d = e.D;
        }
        final float m = e3.M;
        final float i = e2.M;
        final float n = e3.N;
        final float n2 = e2.N;
        this.J = this.I;
        final float k = e2.K;
        final float n3 = i / 2.0f;
        final float l = e2.L;
        final float n4 = n2 / 2.0f;
        final float j = e3.K;
        final float n5 = m / 2.0f;
        final float l2 = e3.L;
        final float n6 = n / 2.0f;
        final float n7 = j + n5 - (n3 + k);
        final float n8 = l2 + n6 - (l + n4);
        final float n9 = (m - i) * c;
        final float n10 = n9 / 2.0f;
        this.K = (float)(int)(k + n7 * f - n10);
        final float n11 = (n - n2) * d;
        final float n12 = n11 / 2.0f;
        this.L = (float)(int)(l + n8 * f - n12);
        this.M = (float)(int)(i + n9);
        this.N = (float)(int)(n2 + n11);
        float e4;
        if (Float.isNaN(e.E)) {
            e4 = f;
        }
        else {
            e4 = e.E;
        }
        final boolean naN = Float.isNaN(e.H);
        float g = 0.0f;
        float h;
        if (naN) {
            h = 0.0f;
        }
        else {
            h = e.H;
        }
        if (!Float.isNaN(e.F)) {
            f = e.F;
        }
        if (!Float.isNaN(e.G)) {
            g = e.G;
        }
        this.V = 0;
        this.K = (float)(int)(e2.K + e4 * n7 + g * n8 - n10);
        this.L = (float)(int)(e2.L + n7 * h + n8 * f - n12);
        this.G = androidx.constraintlayout.core.motion.utils.d.c(e.z);
        this.Q = e.A;
    }
    
    void y(final androidx.constraintlayout.core.motion.key.e e, final e e2, final e e3) {
        float e4 = e.h / 100.0f;
        this.I = e4;
        this.H = e.B;
        float c;
        if (Float.isNaN(e.C)) {
            c = e4;
        }
        else {
            c = e.C;
        }
        float d;
        if (Float.isNaN(e.D)) {
            d = e4;
        }
        else {
            d = e.D;
        }
        final float m = e3.M;
        final float i = e2.M;
        final float n = e3.N;
        final float n2 = e2.N;
        this.J = this.I;
        if (!Float.isNaN(e.E)) {
            e4 = e.E;
        }
        final float k = e2.K;
        final float j = e2.M;
        final float n3 = j / 2.0f;
        final float l = e2.L;
        final float n4 = e2.N;
        final float n5 = n4 / 2.0f;
        final float k2 = e3.K;
        final float n6 = e3.M / 2.0f;
        final float l2 = e3.L;
        final float n7 = e3.N / 2.0f;
        final float n8 = k2 + n6 - (n3 + k);
        final float n9 = l2 + n7 - (n5 + l);
        final float n10 = n8 * e4;
        final float n11 = (m - i) * c;
        final float n12 = n11 / 2.0f;
        this.K = (float)(int)(k + n10 - n12);
        final float n13 = e4 * n9;
        final float n14 = (n - n2) * d;
        final float n15 = n14 / 2.0f;
        this.L = (float)(int)(l + n13 - n15);
        this.M = (float)(int)(j + n11);
        this.N = (float)(int)(n4 + n14);
        float f;
        if (Float.isNaN(e.F)) {
            f = 0.0f;
        }
        else {
            f = e.F;
        }
        final float n16 = -n9;
        this.V = 1;
        final float k3 = (float)(int)(e2.K + n10 - n12);
        this.K = k3;
        final float l3 = (float)(int)(e2.L + n13 - n15);
        this.L = l3;
        this.K = k3 + n16 * f;
        this.L = l3 + n8 * f;
        this.R = this.R;
        this.G = androidx.constraintlayout.core.motion.utils.d.c(e.z);
        this.Q = e.A;
    }
    
    void z(int i, final int n, final androidx.constraintlayout.core.motion.key.e e, final e e2, final e e3) {
        float f = e.h / 100.0f;
        this.I = f;
        this.H = e.B;
        this.V = e.I;
        float c;
        if (Float.isNaN(e.C)) {
            c = f;
        }
        else {
            c = e.C;
        }
        float d;
        if (Float.isNaN(e.D)) {
            d = f;
        }
        else {
            d = e.D;
        }
        final float m = e3.M;
        final float j = e2.M;
        final float n2 = e3.N;
        final float n3 = e2.N;
        this.J = this.I;
        this.M = (float)(int)(j + (m - j) * c);
        this.N = (float)(int)(n3 + (n2 - n3) * d);
        i = e.I;
        float f2 = 0.0f;
        Label_0261: {
            Label_0234: {
                if (i != 1) {
                    if (i != 2) {
                        float e4;
                        if (Float.isNaN(e.E)) {
                            e4 = f;
                        }
                        else {
                            e4 = e.E;
                        }
                        final float k = e3.K;
                        final float l = e2.K;
                        this.K = e4 * (k - l) + l;
                        if (Float.isNaN(e.F)) {
                            break Label_0234;
                        }
                    }
                    else {
                        float k4;
                        if (Float.isNaN(e.E)) {
                            final float k2 = e3.K;
                            final float k3 = e2.K;
                            k4 = (k2 - k3) * f + k3;
                        }
                        else {
                            k4 = Math.min(d, c) * e.E;
                        }
                        this.K = k4;
                        if (Float.isNaN(e.F)) {
                            break Label_0234;
                        }
                        f2 = e.F;
                        break Label_0261;
                    }
                }
                else {
                    float e5;
                    if (Float.isNaN(e.E)) {
                        e5 = f;
                    }
                    else {
                        e5 = e.E;
                    }
                    final float k5 = e3.K;
                    final float k6 = e2.K;
                    this.K = e5 * (k5 - k6) + k6;
                    if (Float.isNaN(e.F)) {
                        break Label_0234;
                    }
                }
                f = e.F;
            }
            final float l2 = e3.L;
            final float l3 = e2.L;
            f2 = f * (l2 - l3) + l3;
        }
        this.L = f2;
        this.R = e2.R;
        this.G = androidx.constraintlayout.core.motion.utils.d.c(e.z);
        this.Q = e.A;
    }
}
