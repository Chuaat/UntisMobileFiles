// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.f;
import androidx.constraintlayout.core.motion.a;
import java.text.DecimalFormat;
import java.util.Arrays;

public abstract class o
{
    private static final String f = "SplineSet";
    protected androidx.constraintlayout.core.motion.utils.b a;
    protected int[] b;
    protected float[] c;
    private int d;
    private String e;
    
    public o() {
        this.b = new int[10];
        this.c = new float[10];
    }
    
    public static o d(final String s, final i.a a) {
        return new b(s, a);
    }
    
    public static o e(final String s, final i.b b) {
        return new c(s, b);
    }
    
    public static o f(final String s, final long n) {
        return new a(s, n);
    }
    
    public float a(final float n) {
        return (float)this.a.c(n, 0);
    }
    
    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.a;
    }
    
    public float c(final float n) {
        return (float)this.a.f(n, 0);
    }
    
    public void g(final int n, final float n2) {
        final int[] b = this.b;
        if (b.length < this.d + 1) {
            this.b = Arrays.copyOf(b, b.length * 2);
            final float[] c = this.c;
            this.c = Arrays.copyOf(c, c.length * 2);
        }
        final int[] b2 = this.b;
        final int d = this.d;
        b2[d] = n;
        this.c[d] = n2;
        this.d = d + 1;
    }
    
    public void h(final w w, final float n) {
        w.c(v.a(this.e), this.a(n));
    }
    
    public void i(final String e) {
        this.e = e;
    }
    
    public void j(final int n) {
        final int d = this.d;
        if (d == 0) {
            return;
        }
        o.d.a(this.b, this.c, 0, d - 1);
        int i = 1;
        int n2 = 1;
        while (i < this.d) {
            final int[] b = this.b;
            int n3 = n2;
            if (b[i - 1] != b[i]) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        final double[] array = new double[n2];
        final double[][] array2 = new double[n2][1];
        int j = 0;
        int n4 = 0;
        while (j < this.d) {
            Label_0155: {
                if (j > 0) {
                    final int[] b2 = this.b;
                    if (b2[j] == b2[j - 1]) {
                        break Label_0155;
                    }
                }
                array[n4] = this.b[j] * 0.01;
                array2[n4][0] = this.c[j];
                ++n4;
            }
            ++j;
        }
        this.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
    }
    
    @Override
    public String toString() {
        String str = this.e;
        final DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.d; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.b[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.c[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }
    
    private static class a extends o
    {
        String g;
        long h;
        
        public a(final String g, final long h) {
            this.g = g;
            this.h = h;
        }
        
        @Override
        public void h(final w w, final float n) {
            w.c(w.f(this.g), this.a(n));
        }
    }
    
    public static class b extends o
    {
        String g;
        i.a h;
        float[] i;
        
        public b(final String s, final i.a h) {
            this.g = s.split(",")[1];
            this.h = h;
        }
        
        @Override
        public void g(final int n, final float n2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }
        
        @Override
        public void j(final int n) {
            final int f = this.h.f();
            final int j = this.h.g(0).j();
            final double[] array = new double[f];
            this.i = new float[j];
            final double[][] array2 = new double[f][j];
            for (int i = 0; i < f; ++i) {
                final int d = this.h.d(i);
                final androidx.constraintlayout.core.motion.a g = this.h.g(i);
                array[i] = d * 0.01;
                g.g(this.i);
                int n2 = 0;
                while (true) {
                    final float[] k = this.i;
                    if (n2 >= k.length) {
                        break;
                    }
                    array2[i][n2] = k[n2];
                    ++n2;
                }
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        public void k(final int n, final androidx.constraintlayout.core.motion.a a) {
            this.h.a(n, a);
        }
        
        public void l(final androidx.constraintlayout.core.state.i i, final float n) {
            super.a.e(n, this.i);
            this.h.g(0).o(i, this.i);
        }
    }
    
    public static class c extends o
    {
        String g;
        i.b h;
        float[] i;
        
        public c(final String s, final i.b h) {
            this.g = s.split(",")[1];
            this.h = h;
        }
        
        @Override
        public void g(final int n, final float n2) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }
        
        @Override
        public void h(final w w, final float n) {
            this.l((f)w, n);
        }
        
        @Override
        public void j(final int n) {
            final int f = this.h.f();
            final int r = this.h.g(0).r();
            final double[] array = new double[f];
            this.i = new float[r];
            final double[][] array2 = new double[f][r];
            for (int i = 0; i < f; ++i) {
                final int d = this.h.d(i);
                final androidx.constraintlayout.core.motion.b g = this.h.g(i);
                array[i] = d * 0.01;
                g.o(this.i);
                int n2 = 0;
                while (true) {
                    final float[] j = this.i;
                    if (n2 >= j.length) {
                        break;
                    }
                    array2[i][n2] = j[n2];
                    ++n2;
                }
            }
            super.a = androidx.constraintlayout.core.motion.utils.b.a(n, array, array2);
        }
        
        public void k(final int n, final androidx.constraintlayout.core.motion.b b) {
            this.h.a(n, b);
        }
        
        public void l(final f f, final float n) {
            super.a.e(n, this.i);
            this.h.g(0).w(f, this.i);
        }
    }
    
    private static class d
    {
        static void a(final int[] array, final float[] array2, int i, int n) {
            final int[] array3 = new int[array.length + 10];
            array3[0] = n;
            array3[1] = i;
            int n2;
            int n3;
            int b = 0;
            int n4;
            for (i = 2; i > 0; i = n + 1, array3[n] = b - 1, n = i + 1, array3[i] = n2, n4 = n + 1, array3[n] = n3, i = n4 + 1, array3[n4] = b + 1) {
                --i;
                n2 = array3[i];
                n = i - 1;
                n3 = array3[n];
                i = n;
                if (n2 < n3) {
                    b = b(array, array2, n2, n3);
                }
            }
        }
        
        private static int b(final int[] array, final float[] array2, int i, final int n) {
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
        
        private static void c(final int[] array, final float[] array2, final int n, final int n2) {
            final int n3 = array[n];
            array[n] = array[n2];
            array[n2] = n3;
            final float n4 = array2[n];
            array2[n] = array2[n2];
            array2[n2] = n4;
        }
    }
}
