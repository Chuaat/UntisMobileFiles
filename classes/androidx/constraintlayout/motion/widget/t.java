// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import androidx.annotation.j0;
import java.util.Iterator;
import android.view.View$MeasureSpec;
import java.util.Arrays;
import android.view.View;
import androidx.constraintlayout.widget.a;
import java.util.LinkedHashMap;
import androidx.constraintlayout.core.motion.utils.d;

class t implements Comparable<t>
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
    static final int i0 = 1;
    static final int j0 = 0;
    static final int k0 = 2;
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
    o T;
    LinkedHashMap<String, a> U;
    int V;
    int W;
    double[] X;
    double[] Y;
    
    static {
        t.l0 = new String[] { "position", "x", "y", "width", "height", "pathRotate" };
    }
    
    public t() {
        this.H = 0;
        this.O = Float.NaN;
        this.P = Float.NaN;
        final int f = androidx.constraintlayout.motion.widget.f.f;
        this.Q = f;
        this.R = f;
        this.S = Float.NaN;
        this.T = null;
        this.U = new LinkedHashMap<String, a>();
        this.V = 0;
        this.X = new double[18];
        this.Y = new double[18];
    }
    
    public t(final int n, final int n2, final j j, final t t, final t t2) {
        this.H = 0;
        this.O = Float.NaN;
        this.P = Float.NaN;
        final int f = androidx.constraintlayout.motion.widget.f.f;
        this.Q = f;
        this.R = f;
        this.S = Float.NaN;
        this.T = null;
        this.U = new LinkedHashMap<String, a>();
        this.V = 0;
        this.X = new double[18];
        this.Y = new double[18];
        if (t.R != androidx.constraintlayout.motion.widget.f.f) {
            this.z(n, n2, j, t, t2);
            return;
        }
        final int o = j.O;
        if (o == 1) {
            this.y(j, t, t2);
            return;
        }
        if (o != 2) {
            this.v(j, t, t2);
            return;
        }
        this.A(n, n2, j, t, t2);
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
    
    void A(int n, final int n2, final j j, final t t, final t t2) {
        final float i = j.a / 100.0f;
        this.I = i;
        this.H = j.H;
        float k;
        if (Float.isNaN(j.I)) {
            k = i;
        }
        else {
            k = j.I;
        }
        float l;
        if (Float.isNaN(j.J)) {
            l = i;
        }
        else {
            l = j.J;
        }
        final float m = t2.M;
        final float m2 = t.M;
        final float n3 = t2.N;
        final float n4 = t.N;
        this.J = this.I;
        final float k2 = t.K;
        final float n5 = m2 / 2.0f;
        final float l2 = t.L;
        final float n6 = n4 / 2.0f;
        final float k3 = t2.K;
        final float n7 = m / 2.0f;
        final float l3 = t2.L;
        final float n8 = n3 / 2.0f;
        final float n9 = (m - m2) * k;
        this.K = (float)(int)(k2 + (k3 + n7 - (n5 + k2)) * i - n9 / 2.0f);
        final float n10 = (n3 - n4) * l;
        this.L = (float)(int)(l2 + (l3 + n8 - (l2 + n6)) * i - n10 / 2.0f);
        this.M = (float)(int)(m2 + n9);
        this.N = (float)(int)(n4 + n10);
        this.V = 2;
        if (!Float.isNaN(j.K)) {
            n -= (int)this.M;
            this.K = (float)(int)(j.K * n);
        }
        if (!Float.isNaN(j.L)) {
            n = (int)(n2 - this.N);
            this.L = (float)(int)(j.L * n);
        }
        this.R = this.R;
        this.G = d.c(j.F);
        this.Q = j.G;
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
    
    void G(float n, final View view, final int[] array, final double[] array2, final double[] array3, final double[] array4) {
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
        final o t = this.T;
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
                view.setRotation((float)(n4 + Math.toDegrees(Math.atan2(n25, n24))));
            }
        }
        else {
            n = k;
            n20 = l;
            if (!Float.isNaN(n4)) {
                n = n8 / 2.0f;
                view.setRotation((float)(0.0f + (n4 + Math.toDegrees(Math.atan2(n7 + n9 / 2.0f, n6 + n)))));
                n20 = l;
                n = k;
            }
        }
        boolean b = false;
        if (view instanceof e) {
            ((e)view).a(n, n20, m + n, n20 + n2);
            return;
        }
        n += 0.5f;
        final int n26 = (int)n;
        final float n27 = n20 + 0.5f;
        final int n28 = (int)n27;
        final int n29 = (int)(n + m);
        final int n30 = (int)(n27 + n2);
        final int n31 = n29 - n26;
        final int n32 = n30 - n28;
        if (n31 != view.getMeasuredWidth() || n32 != view.getMeasuredHeight()) {
            b = true;
        }
        if (b) {
            view.measure(View$MeasureSpec.makeMeasureSpec(n31, 1073741824), View$MeasureSpec.makeMeasureSpec(n32, 1073741824));
        }
        view.layout(n26, n28, n29, n30);
    }
    
    public void I(final o t, final t t2) {
        final double n = this.K + this.M / 2.0f - t2.K - t2.M / 2.0f;
        final double n2 = this.L + this.N / 2.0f - t2.L - t2.N / 2.0f;
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
    
    public void b(final androidx.constraintlayout.widget.e.a a) {
        this.G = d.c(a.d.d);
        final androidx.constraintlayout.widget.e.c d = a.d;
        this.Q = d.e;
        this.R = d.b;
        this.O = d.i;
        this.H = d.f;
        this.W = d.c;
        this.P = a.c.e;
        this.S = a.e.C;
        for (final String s : a.g.keySet()) {
            final a value = a.g.get(s);
            if (value != null && value.h()) {
                this.U.put(s, value);
            }
        }
    }
    
    public int d(@j0 final t t) {
        return Float.compare(this.J, t.J);
    }
    
    public void f(final o o) {
        o.A(this.P);
    }
    
    void h(final t t, final boolean[] array, final String[] array2, final boolean b) {
        final boolean g = this.g(this.K, t.K);
        final boolean g2 = this.g(this.L, t.L);
        array[0] |= this.g(this.J, t.J);
        final boolean b2 = array[1];
        final boolean b3 = g | g2 | b;
        array[1] = (b2 | b3);
        array[2] |= b3;
        array[3] |= this.g(this.M, t.M);
        array[4] |= this.g(this.N, t.N);
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
        final o t = this.T;
        float n6 = k;
        float n7 = l;
        if (t != null) {
            final float[] array4 = new float[2];
            t.m(n, array4, new float[2]);
            final float n8 = array4[0];
            final float n9 = array4[1];
            final double n10 = n8;
            n = k;
            final double n11 = l;
            n6 = (float)(n10 + Math.sin(n11) * n - m / 2.0f);
            n7 = (float)(n9 - n * Math.cos(n11) - n3 / 2.0f);
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
        final o t = this.T;
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
            n10 = (float)(n18 + sin * n19 + cos * n20);
            n11 = (float)(n15 - n19 * Math.cos(n) + Math.sin(n) * n20);
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
        final o t = this.T;
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
            final float n12 = (float)(n10 + Math.sin(n) * n11 - m / 2.0f);
            n7 = (float)(n9 - n11 * Math.cos(n) - n3 / 2.0f);
            n6 = n12;
        }
        array3[n2] = n6 + m / 2.0f + 0.0f;
        array3[n2 + 1] = n7 + n3 / 2.0f + 0.0f;
    }
    
    int o(final String key, final double[] array, int n) {
        final a a = this.U.get(key);
        int i = 0;
        if (a == null) {
            return 0;
        }
        if (a.i() == 1) {
            array[n] = a.f();
            return 1;
        }
        final int j = a.i();
        final float[] array2 = new float[j];
        a.g(array2);
        while (i < j) {
            array[n] = array2[i];
            ++i;
            ++n;
        }
        return j;
    }
    
    int p(final String key) {
        final a a = this.U.get(key);
        if (a == null) {
            return 0;
        }
        return a.i();
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
        final o t = this.T;
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
    
    void v(final j j, final t t, final t t2) {
        float l = j.a / 100.0f;
        this.I = l;
        this.H = j.H;
        float i;
        if (Float.isNaN(j.I)) {
            i = l;
        }
        else {
            i = j.I;
        }
        float k;
        if (Float.isNaN(j.J)) {
            k = l;
        }
        else {
            k = j.J;
        }
        final float m = t2.M;
        final float m2 = t.M;
        final float n = t2.N;
        final float n2 = t.N;
        this.J = this.I;
        final float k2 = t.K;
        final float n3 = m2 / 2.0f;
        final float l2 = t.L;
        final float n4 = n2 / 2.0f;
        final float k3 = t2.K;
        final float n5 = m / 2.0f;
        final float l3 = t2.L;
        final float n6 = n / 2.0f;
        final float n7 = k3 + n5 - (n3 + k2);
        final float n8 = l3 + n6 - (l2 + n4);
        final float n9 = (m - m2) * i;
        final float n10 = n9 / 2.0f;
        this.K = (float)(int)(k2 + n7 * l - n10);
        final float n11 = (n - n2) * k;
        final float n12 = n11 / 2.0f;
        this.L = (float)(int)(l2 + n8 * l - n12);
        this.M = (float)(int)(m2 + n9);
        this.N = (float)(int)(n2 + n11);
        float k4;
        if (Float.isNaN(j.K)) {
            k4 = l;
        }
        else {
            k4 = j.K;
        }
        final boolean naN = Float.isNaN(j.N);
        float m3 = 0.0f;
        float n13;
        if (naN) {
            n13 = 0.0f;
        }
        else {
            n13 = j.N;
        }
        if (!Float.isNaN(j.L)) {
            l = j.L;
        }
        if (!Float.isNaN(j.M)) {
            m3 = j.M;
        }
        this.V = 0;
        this.K = (float)(int)(t.K + k4 * n7 + m3 * n8 - n10);
        this.L = (float)(int)(t.L + n7 * n13 + n8 * l - n12);
        this.G = d.c(j.F);
        this.Q = j.G;
    }
    
    void y(final j j, final t t, final t t2) {
        float k = j.a / 100.0f;
        this.I = k;
        this.H = j.H;
        float i;
        if (Float.isNaN(j.I)) {
            i = k;
        }
        else {
            i = j.I;
        }
        float l;
        if (Float.isNaN(j.J)) {
            l = k;
        }
        else {
            l = j.J;
        }
        final float m = t2.M;
        final float m2 = t.M;
        final float n = t2.N;
        final float n2 = t.N;
        this.J = this.I;
        if (!Float.isNaN(j.K)) {
            k = j.K;
        }
        final float k2 = t.K;
        final float m3 = t.M;
        final float n3 = m3 / 2.0f;
        final float l2 = t.L;
        final float n4 = t.N;
        final float n5 = n4 / 2.0f;
        final float k3 = t2.K;
        final float n6 = t2.M / 2.0f;
        final float l3 = t2.L;
        final float n7 = t2.N / 2.0f;
        final float n8 = k3 + n6 - (n3 + k2);
        final float n9 = l3 + n7 - (n5 + l2);
        final float n10 = n8 * k;
        final float n11 = (m - m2) * i;
        final float n12 = n11 / 2.0f;
        this.K = (float)(int)(k2 + n10 - n12);
        final float n13 = k * n9;
        final float n14 = (n - n2) * l;
        final float n15 = n14 / 2.0f;
        this.L = (float)(int)(l2 + n13 - n15);
        this.M = (float)(int)(m3 + n11);
        this.N = (float)(int)(n4 + n14);
        float l4;
        if (Float.isNaN(j.L)) {
            l4 = 0.0f;
        }
        else {
            l4 = j.L;
        }
        final float n16 = -n9;
        this.V = 1;
        final float k4 = (float)(int)(t.K + n10 - n12);
        this.K = k4;
        final float l5 = (float)(int)(t.L + n13 - n15);
        this.L = l5;
        this.K = k4 + n16 * l4;
        this.L = l5 + n8 * l4;
        this.R = this.R;
        this.G = d.c(j.F);
        this.Q = j.G;
    }
    
    void z(int o, final int n, final j j, final t t, final t t2) {
        float l = j.a / 100.0f;
        this.I = l;
        this.H = j.H;
        this.V = j.O;
        float i;
        if (Float.isNaN(j.I)) {
            i = l;
        }
        else {
            i = j.I;
        }
        float k;
        if (Float.isNaN(j.J)) {
            k = l;
        }
        else {
            k = j.J;
        }
        final float m = t2.M;
        final float m2 = t.M;
        final float n2 = t2.N;
        final float n3 = t.N;
        this.J = this.I;
        this.M = (float)(int)(m2 + (m - m2) * i);
        this.N = (float)(int)(n3 + (n2 - n3) * k);
        o = j.O;
        float l2 = 0.0f;
        Label_0261: {
            Label_0234: {
                if (o != 1) {
                    if (o != 2) {
                        float k2;
                        if (Float.isNaN(j.K)) {
                            k2 = l;
                        }
                        else {
                            k2 = j.K;
                        }
                        final float k3 = t2.K;
                        final float k4 = t.K;
                        this.K = k2 * (k3 - k4) + k4;
                        if (Float.isNaN(j.L)) {
                            break Label_0234;
                        }
                    }
                    else {
                        float k7;
                        if (Float.isNaN(j.K)) {
                            final float k5 = t2.K;
                            final float k6 = t.K;
                            k7 = (k5 - k6) * l + k6;
                        }
                        else {
                            k7 = Math.min(k, i) * j.K;
                        }
                        this.K = k7;
                        if (Float.isNaN(j.L)) {
                            break Label_0234;
                        }
                        l2 = j.L;
                        break Label_0261;
                    }
                }
                else {
                    float k8;
                    if (Float.isNaN(j.K)) {
                        k8 = l;
                    }
                    else {
                        k8 = j.K;
                    }
                    final float k9 = t2.K;
                    final float k10 = t.K;
                    this.K = k8 * (k9 - k10) + k10;
                    if (Float.isNaN(j.L)) {
                        break Label_0234;
                    }
                }
                l = j.L;
            }
            final float l3 = t2.L;
            final float l4 = t.L;
            l2 = l * (l3 - l4) + l4;
        }
        this.L = l2;
        this.R = t.R;
        this.G = d.c(j.F);
        this.Q = j.G;
    }
}
