// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.key;

import java.util.HashSet;
import androidx.constraintlayout.core.motion.utils.a0;
import androidx.constraintlayout.core.motion.utils.o;
import java.util.HashMap;
import androidx.constraintlayout.core.motion.f;

public class e extends b
{
    static final String L = "KeyPosition";
    protected static final float M = 20.0f;
    public static final int N = 2;
    public static final int O = 1;
    public static final int P = 0;
    static final int Q = 2;
    public int A;
    public int B;
    public float C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public int I;
    private float J;
    private float K;
    public int y;
    public String z;
    
    public e() {
        final int m = b.m;
        this.y = m;
        this.z = null;
        this.A = m;
        this.B = 0;
        this.C = Float.NaN;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = 0;
        this.J = Float.NaN;
        this.K = Float.NaN;
        super.k = 2;
    }
    
    private void v(final float n, final float n2, float e, float h) {
        final float n3 = e - n;
        final float n4 = h - n2;
        final boolean naN = Float.isNaN(this.E);
        float g = 0.0f;
        if (naN) {
            e = 0.0f;
        }
        else {
            e = this.E;
        }
        if (Float.isNaN(this.H)) {
            h = 0.0f;
        }
        else {
            h = this.H;
        }
        float f;
        if (Float.isNaN(this.F)) {
            f = 0.0f;
        }
        else {
            f = this.F;
        }
        if (!Float.isNaN(this.G)) {
            g = this.G;
        }
        this.J = (float)(int)(n + e * n3 + g * n4);
        this.K = (float)(int)(n2 + n3 * h + n4 * f);
    }
    
    private void w(final float n, final float n2, float n3, float n4) {
        n3 -= n;
        n4 -= n2;
        final float n5 = -n4;
        final float e = this.E;
        final float f = this.F;
        this.J = n + n3 * e + n5 * f;
        this.K = n2 + n4 * e + n3 * f;
    }
    
    private void y(final int n, final int n2) {
        final float n3 = (float)(n - 0);
        final float e = this.E;
        final float n4 = 0;
        this.J = n3 * e + n4;
        this.K = (n2 - 0) * e + n4;
    }
    
    float A() {
        return this.K;
    }
    
    public boolean B(final int n, final int n2, final androidx.constraintlayout.core.motion.utils.e e, final androidx.constraintlayout.core.motion.utils.e e2, final float n3, final float n4) {
        this.x(n, n2, e.a(), e.b(), e2.a(), e2.b());
        return Math.abs(n3 - this.J) < 20.0f && Math.abs(n4 - this.K) < 20.0f;
    }
    
    public void C(final androidx.constraintlayout.core.motion.f f, final androidx.constraintlayout.core.motion.utils.e e, final androidx.constraintlayout.core.motion.utils.e e2, final float n, final float n2, final String[] array, final float[] array2) {
        final int i = this.I;
        if (i == 1) {
            this.E(e, e2, n, n2, array, array2);
            return;
        }
        if (i != 2) {
            this.D(e, e2, n, n2, array, array2);
            return;
        }
        this.F(f, e, e2, n, n2, array, array2);
    }
    
    void D(final androidx.constraintlayout.core.motion.utils.e e, final androidx.constraintlayout.core.motion.utils.e e2, float n, final float n2, final String[] array, final float[] array2) {
        final float a = e.a();
        final float b = e.b();
        final float a2 = e2.a();
        final float b2 = e2.b();
        final float n3 = a2 - a;
        final float n4 = b2 - b;
        if (array[0] != null) {
            final boolean equals = "percentX".equals(array[0]);
            n = (n - a) / n3;
            if (equals) {
                array2[0] = n;
                array2[1] = (n2 - b) / n4;
            }
            else {
                array2[1] = n;
                array2[0] = (n2 - b) / n4;
            }
        }
        else {
            array[0] = "percentX";
            array2[0] = (n - a) / n3;
            array[1] = "percentY";
            array2[1] = (n2 - b) / n4;
        }
    }
    
    void E(final androidx.constraintlayout.core.motion.utils.e e, final androidx.constraintlayout.core.motion.utils.e e2, float n, float n2, final String[] array, final float[] array2) {
        final float a = e.a();
        final float b = e.b();
        final float a2 = e2.a();
        final float b2 = e2.b();
        final float n3 = a2 - a;
        final float n4 = b2 - b;
        final float n5 = (float)Math.hypot(n3, n4);
        if (n5 < 1.0E-4) {
            System.out.println("distance ~ 0");
            array2[1] = (array2[0] = 0.0f);
            return;
        }
        final float n6 = n3 / n5;
        final float n7 = n4 / n5;
        n2 -= b;
        final float n8 = n - a;
        n = (n6 * n2 - n8 * n7) / n5;
        n2 = (n6 * n8 + n7 * n2) / n5;
        if (array[0] != null) {
            if ("percentX".equals(array[0])) {
                array2[0] = n2;
                array2[1] = n;
            }
        }
        else {
            array[0] = "percentX";
            array[1] = "percentY";
            array2[0] = n2;
            array2[1] = n;
        }
    }
    
    void F(androidx.constraintlayout.core.motion.f n, final androidx.constraintlayout.core.motion.utils.e e, final androidx.constraintlayout.core.motion.utils.e e2, float n2, final float n3, final String[] array, final float[] array2) {
        e.a();
        e.b();
        e2.a();
        e2.b();
        n = n.n();
        final int d = n.D();
        final int k = n.k();
        if (array[0] != null) {
            final boolean equals = "percentX".equals(array[0]);
            n2 /= d;
            if (equals) {
                array2[0] = n2;
                array2[1] = n3 / k;
            }
            else {
                array2[1] = n2;
                array2[0] = n3 / k;
            }
        }
        else {
            array[0] = "percentX";
            array2[0] = n2 / d;
            array[1] = "percentY";
            array2[1] = n3 / k;
        }
    }
    
    @Override
    public void a(final HashMap<String, o> hashMap) {
    }
    
    @Override
    public boolean b(final int n, final int h) {
        if (n != 100) {
            if (n != 508) {
                if (n != 510) {
                    return super.b(n, h);
                }
                this.I = h;
            }
            else {
                this.y = h;
            }
        }
        else {
            super.h = h;
        }
        return true;
    }
    
    @Override
    public boolean c(final int n, final float c) {
        switch (n) {
            default: {
                return super.c(n, c);
            }
            case 507: {
                this.F = c;
                break;
            }
            case 506: {
                this.E = c;
                break;
            }
            case 505: {
                this.C = c;
            }
            case 504: {
                this.D = c;
                break;
            }
            case 503: {
                this.C = c;
                break;
            }
        }
        return true;
    }
    
    @Override
    public boolean d(final int n, final String s) {
        if (n != 501) {
            return super.d(n, s);
        }
        this.z = s.toString();
        return true;
    }
    
    @Override
    public int f(final String s) {
        return a0.a(s);
    }
    
    @Override
    public b g() {
        return new e().h(this);
    }
    
    @Override
    public b h(final b b) {
        super.h(b);
        final e e = (e)b;
        this.z = e.z;
        this.A = e.A;
        this.B = e.B;
        this.C = e.C;
        this.D = Float.NaN;
        this.E = e.E;
        this.F = e.F;
        this.G = e.G;
        this.H = e.H;
        this.J = e.J;
        this.K = e.K;
        return this;
    }
    
    @Override
    public void i(final HashSet<String> set) {
    }
    
    void x(final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
        final int i = this.I;
        if (i == 1) {
            this.w(n3, n4, n5, n6);
            return;
        }
        if (i != 2) {
            this.v(n3, n4, n5, n6);
            return;
        }
        this.y(n, n2);
    }
    
    float z() {
        return this.J;
    }
}
