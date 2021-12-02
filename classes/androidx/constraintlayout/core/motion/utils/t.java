// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.f;
import androidx.constraintlayout.core.motion.a;
import java.text.DecimalFormat;
import java.io.PrintStream;

public abstract class t
{
    private static final String k = "SplineSet";
    protected static final int l = 0;
    protected static final int m = 1;
    protected static final int n = 2;
    protected static float o = 6.2831855f;
    protected androidx.constraintlayout.core.motion.utils.b a;
    protected int b;
    protected int[] c;
    protected float[][] d;
    protected int e;
    protected String f;
    protected float[] g;
    protected boolean h;
    protected long i;
    protected float j;
    
    public t() {
        this.b = 0;
        this.c = new int[10];
        this.d = new float[10][3];
        this.g = new float[3];
        this.h = false;
        this.j = Float.NaN;
    }
    
    protected float a(float abs) {
        switch (this.b) {
            default: {
                return (float)Math.sin(abs * t.o);
            }
            case 6: {
                abs = 1.0f - Math.abs(abs * 4.0f % 4.0f - 2.0f);
                abs *= abs;
                break;
            }
            case 5: {
                return (float)Math.cos(abs * t.o);
            }
            case 4: {
                abs = (abs * 2.0f + 1.0f) % 2.0f;
                break;
            }
            case 3: {
                return (abs * 2.0f + 1.0f) % 2.0f - 1.0f;
            }
            case 2: {
                abs = Math.abs(abs);
                break;
            }
            case 1: {
                return Math.signum(abs * t.o);
            }
        }
        return 1.0f - abs;
    }
    
    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.a;
    }
    
    public void c(final int n, final float n2, final float n3, final int b, final float n4) {
        final int[] c = this.c;
        final int e = this.e;
        c[e] = n;
        final float[][] d = this.d;
        d[e][0] = n2;
        d[e][1] = n3;
        d[e][2] = n4;
        this.b = Math.max(this.b, b);
        ++this.e;
    }
    
    protected void d(final long i) {
        this.i = i;
    }
    
    public void e(final String f) {
        this.f = f;
    }
    
    public void f(final int n) {
        final int e = this.e;
        if (e == 0) {
            final PrintStream err = System.err;
            final StringBuilder sb = new StringBuilder();
            sb.append("Error no points added to ");
            sb.append(this.f);
            err.println(sb.toString());
            return;
        }
        t.c.a(this.c, this.d, 0, e - 1);
        int n2 = 1;
        int n3 = 0;
        while (true) {
            final int[] c = this.c;
            if (n2 >= c.length) {
                break;
            }
            int n4 = n3;
            if (c[n2] != c[n2 - 1]) {
                n4 = n3 + 1;
            }
            ++n2;
            n3 = n4;
        }
        int n5;
        if ((n5 = n3) == 0) {
            n5 = 1;
        }
        final double[] array = new double[n5];
        final double[][] array2 = new double[n5][3];
        int i = 0;
        int n6 = 0;
        while (i < this.e) {
            Label_0249: {
                if (i > 0) {
                    final int[] c2 = this.c;
                    if (c2[i] == c2[i - 1]) {
                        break Label_0249;
                    }
                }
                array[n6] = this.c[i] * 0.01;
                final double[] array3 = array2[n6];
                final float[][] d = this.d;
                array3[0] = d[i][0];
                array2[n6][1] = d[i][1];
                array2[n6][2] = d[i][2];
                ++n6;
            }
            ++i;
        }
        this.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
    }
    
    @Override
    public String toString() {
        String str = this.f;
        final DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.e; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.c[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.d[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }
    
    public static class a extends t
    {
        String p;
        i.a q;
        i.c r;
        float[] s;
        float[] t;
        
        public a(final String s, final i.a q) {
            this.r = new i.c();
            this.p = s.split(",")[1];
            this.q = q;
        }
        
        @Override
        public void c(final int n, final float n2, final float n3, final int n4, final float n5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
        
        @Override
        public void f(final int n) {
            final int f = this.q.f();
            final int j = this.q.g(0).j();
            final double[] array = new double[f];
            final int n2 = j + 2;
            this.s = new float[n2];
            this.t = new float[j];
            final double[][] array2 = new double[f][n2];
            for (int i = 0; i < f; ++i) {
                final int d = this.q.d(i);
                final androidx.constraintlayout.core.motion.a g = this.q.g(i);
                final float[] g2 = this.r.g(i);
                array[i] = d * 0.01;
                g.g(this.s);
                int n3 = 0;
                while (true) {
                    final float[] s = this.s;
                    if (n3 >= s.length) {
                        break;
                    }
                    array2[i][n3] = s[n3];
                    ++n3;
                }
                array2[i][j] = g2[0];
                array2[i][j + 1] = g2[1];
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        public void g(final int n, final androidx.constraintlayout.core.motion.a a, final float n2, final int b, final float n3) {
            this.q.a(n, a);
            this.r.a(n, new float[] { n2, n3 });
            super.b = Math.max(super.b, b);
        }
        
        public boolean h(final f f, float n, final long i, final g g) {
            super.a.e(n, this.s);
            final float[] s = this.s;
            n = s[s.length - 2];
            final float n2 = s[s.length - 1];
            final long j = super.i;
            if (Float.isNaN(super.j)) {
                final float a = g.a(f, this.p, 0);
                super.j = a;
                if (Float.isNaN(a)) {
                    super.j = 0.0f;
                }
            }
            final float k = (float)((super.j + (i - j) * 1.0E-9 * n) % 1.0);
            super.j = k;
            super.i = i;
            final float a2 = this.a(k);
            super.h = false;
            int n3 = 0;
            while (true) {
                final float[] t = this.t;
                if (n3 >= t.length) {
                    break;
                }
                final boolean h = super.h;
                final float[] s2 = this.s;
                super.h = (h | s2[n3] != 0.0);
                t[n3] = s2[n3] * a2 + n2;
                ++n3;
            }
            this.q.g(0).o(f, this.t);
            if (n != 0.0f) {
                super.h = true;
            }
            return super.h;
        }
    }
    
    public static class b extends t
    {
        String p;
        i.b q;
        i.c r;
        float[] s;
        float[] t;
        
        public b(final String s, final i.b q) {
            this.r = new i.c();
            this.p = s.split(",")[1];
            this.q = q;
        }
        
        @Override
        public void c(final int n, final float n2, final float n3, final int n4, final float n5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
        
        @Override
        public void f(final int n) {
            final int f = this.q.f();
            final int r = this.q.g(0).r();
            final double[] array = new double[f];
            final int n2 = r + 2;
            this.s = new float[n2];
            this.t = new float[r];
            final double[][] array2 = new double[f][n2];
            for (int i = 0; i < f; ++i) {
                final int d = this.q.d(i);
                final androidx.constraintlayout.core.motion.b g = this.q.g(i);
                final float[] g2 = this.r.g(i);
                array[i] = d * 0.01;
                g.o(this.s);
                int n3 = 0;
                while (true) {
                    final float[] s = this.s;
                    if (n3 >= s.length) {
                        break;
                    }
                    array2[i][n3] = s[n3];
                    ++n3;
                }
                array2[i][r] = g2[0];
                array2[i][r + 1] = g2[1];
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        public void g(final int n, final androidx.constraintlayout.core.motion.b b, final float n2, final int b2, final float n3) {
            this.q.a(n, b);
            this.r.a(n, new float[] { n2, n3 });
            super.b = Math.max(super.b, b2);
        }
        
        public boolean h(final f f, float n, final long i, final g g) {
            super.a.e(n, this.s);
            final float[] s = this.s;
            n = s[s.length - 2];
            final float n2 = s[s.length - 1];
            final long j = super.i;
            if (Float.isNaN(super.j)) {
                final float a = g.a(f, this.p, 0);
                super.j = a;
                if (Float.isNaN(a)) {
                    super.j = 0.0f;
                }
            }
            final float k = (float)((super.j + (i - j) * 1.0E-9 * n) % 1.0);
            super.j = k;
            super.i = i;
            final float a2 = this.a(k);
            super.h = false;
            int n3 = 0;
            while (true) {
                final float[] t = this.t;
                if (n3 >= t.length) {
                    break;
                }
                final boolean h = super.h;
                final float[] s2 = this.s;
                super.h = (h | s2[n3] != 0.0);
                t[n3] = s2[n3] * a2 + n2;
                ++n3;
            }
            this.q.g(0).w(f, this.t);
            if (n != 0.0f) {
                super.h = true;
            }
            return super.h;
        }
    }
    
    protected static class c
    {
        static void a(final int[] array, final float[][] array2, int i, int n) {
            final int[] array3 = new int[array.length + 10];
            array3[0] = n;
            array3[1] = i;
            int n2;
            int n3;
            int b = 0;
            int n4 = 0;
            for (i = 2; i > 0; i = n4 + 1, array3[n4] = n2, n = i + 1, array3[i] = n3, i = n + 1, array3[n] = b + 1) {
                --i;
                n2 = array3[i];
                n = i - 1;
                n3 = array3[n];
                i = n;
                if (n2 < n3) {
                    b = b(array, array2, n2, n3);
                    n4 = n + 1;
                    array3[n] = b - 1;
                }
            }
        }
        
        private static int b(final int[] array, final float[][] array2, int i, final int n) {
            final int n2 = array[n];
            int n3 = i;
            while (i < n) {
                int n4 = n3;
                if (array[i] <= n2) {
                    c(array, array2, n3, i);
                    n4 = n3 + 1;
                }
                ++i;
                n3 = n4;
            }
            c(array, array2, n3, n);
            return n3;
        }
        
        private static void c(final int[] array, final float[][] array2, final int n, final int n2) {
            final int n3 = array[n];
            array[n] = array[n2];
            array[n2] = n3;
            final float[] array3 = array2[n];
            array2[n] = array2[n2];
            array2[n2] = array3;
        }
    }
}
