// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import androidx.constraintlayout.core.motion.f;
import java.util.ArrayList;

public abstract class h
{
    private static final String h = "KeyCycleOscillator";
    private androidx.constraintlayout.core.motion.utils.b a;
    private c b;
    private String c;
    private int d;
    private String e;
    public int f;
    ArrayList<g> g;
    
    public h() {
        this.d = 0;
        this.e = null;
        this.f = 0;
        this.g = new ArrayList<g>();
    }
    
    public static h d(final String s) {
        if (s.equals("pathRotate")) {
            return new f(s);
        }
        return new b(s);
    }
    
    public float a(final float n) {
        return (float)this.b.c(n);
    }
    
    public androidx.constraintlayout.core.motion.utils.b b() {
        return this.a;
    }
    
    public float c(final float n) {
        return (float)this.b.b(n);
    }
    
    protected void e(final Object o) {
    }
    
    public void f(final int n, final int d, final String e, final int f, final float n2, final float n3, final float n4, final float n5) {
        this.g.add(new g(n, n2, n3, n4, n5));
        if (f != -1) {
            this.f = f;
        }
        this.d = d;
        this.e = e;
    }
    
    public void g(final int n, final int d, final String e, final int f, final float n2, final float n3, final float n4, final float n5, final Object o) {
        this.g.add(new g(n, n2, n3, n4, n5));
        if (f != -1) {
            this.f = f;
        }
        this.d = d;
        this.e(o);
        this.e = e;
    }
    
    public void h(final androidx.constraintlayout.core.motion.f f, final float n) {
    }
    
    public void i(final String c) {
        this.c = c;
    }
    
    public void j(final float n) {
        final int size = this.g.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.g, (Comparator<? super g>)new Comparator<g>() {
            public int a(final g g, final g g2) {
                return Integer.compare(g.a, g2.a);
            }
        });
        final double[] array = new double[size];
        final double[][] array2 = new double[size][3];
        this.b = new c(this.d, this.e, this.f, size);
        final Iterator<g> iterator = this.g.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final g g = iterator.next();
            final float d = g.d;
            array[n2] = d * 0.01;
            final double[] array3 = array2[n2];
            final float b = g.b;
            array3[0] = b;
            final double[] array4 = array2[n2];
            final float c = g.c;
            array4[1] = c;
            final double[] array5 = array2[n2];
            final float e = g.e;
            array5[2] = e;
            this.b.d(n2, g.a, d, c, e, b);
            ++n2;
        }
        this.b.e(n);
        this.a = androidx.constraintlayout.core.motion.utils.b.a(0, array, array2);
    }
    
    public boolean k() {
        final int f = this.f;
        boolean b = true;
        if (f != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public String toString() {
        String str = this.c;
        final DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (final g g : this.g) {
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(g.a);
            sb.append(" , ");
            sb.append(decimalFormat.format(g.b));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }
    
    private static class b extends h
    {
        String i;
        int j;
        
        public b(final String i) {
            this.i = i;
            this.j = y.a(i);
        }
        
        @Override
        public void h(final androidx.constraintlayout.core.motion.f f, final float n) {
            f.c(this.j, this.a(n));
        }
    }
    
    static class c
    {
        static final int q = -1;
        private static final String r = "CycleOscillator";
        private final int a;
        l b;
        private final int c;
        private final int d;
        private final int e;
        float[] f;
        double[] g;
        float[] h;
        float[] i;
        float[] j;
        float[] k;
        int l;
        androidx.constraintlayout.core.motion.utils.b m;
        double[] n;
        double[] o;
        float p;
        
        c(final int l, final String s, final int a, final int n) {
            final l b = new l();
            this.b = b;
            this.c = 0;
            this.d = 1;
            this.e = 2;
            this.l = l;
            this.a = a;
            b.g(l, s);
            this.f = new float[n];
            this.g = new double[n];
            this.h = new float[n];
            this.i = new float[n];
            this.j = new float[n];
            this.k = new float[n];
        }
        
        public double a() {
            return this.n[1];
        }
        
        public double b(final float n) {
            final androidx.constraintlayout.core.motion.utils.b m = this.m;
            if (m != null) {
                final double n2 = n;
                m.g(n2, this.o);
                this.m.d(n2, this.n);
            }
            else {
                final double[] o = this.o;
                o[0] = 0.0;
                o[2] = (o[1] = 0.0);
            }
            final l b = this.b;
            final double n3 = n;
            final double e = b.e(n3, this.n[1]);
            final double d = this.b.d(n3, this.n[1], this.o[1]);
            final double[] o2 = this.o;
            return o2[0] + e * o2[2] + d * this.n[2];
        }
        
        public double c(final float n) {
            final androidx.constraintlayout.core.motion.utils.b m = this.m;
            if (m != null) {
                m.d(n, this.n);
            }
            else {
                final double[] n2 = this.n;
                n2[0] = this.i[0];
                n2[1] = this.j[0];
                n2[2] = this.f[0];
            }
            final double[] n3 = this.n;
            return n3[0] + this.b.e(n, n3[1]) * this.n[2];
        }
        
        public void d(final int n, final int n2, final float n3, final float n4, final float n5, final float n6) {
            this.g[n] = n2 / 100.0;
            this.h[n] = n3;
            this.i[n] = n4;
            this.j[n] = n5;
            this.f[n] = n6;
        }
        
        public void e(final float p) {
            this.p = p;
            final double[][] array = new double[this.g.length][3];
            final float[] f = this.f;
            this.n = new double[f.length + 2];
            this.o = new double[f.length + 2];
            if (this.g[0] > 0.0) {
                this.b.a(0.0, this.h[0]);
            }
            final double[] g = this.g;
            final int n = g.length - 1;
            if (g[n] < 1.0) {
                this.b.a(1.0, this.h[n]);
            }
            for (int i = 0; i < array.length; ++i) {
                array[i][0] = this.i[i];
                array[i][1] = this.j[i];
                array[i][2] = this.f[i];
                this.b.a(this.g[i], this.h[i]);
            }
            this.b.f();
            final double[] g2 = this.g;
            androidx.constraintlayout.core.motion.utils.b a;
            if (g2.length > 1) {
                a = androidx.constraintlayout.core.motion.utils.b.a(0, g2, array);
            }
            else {
                a = null;
            }
            this.m = a;
        }
    }
    
    private static class d
    {
        private static int a(final int[] array, final float[] array2, int i, final int n) {
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
        
        static void b(final int[] array, final float[] array2, int i, int n) {
            final int[] array3 = new int[array.length + 10];
            array3[0] = n;
            array3[1] = i;
            int n2;
            int n3;
            int a = 0;
            int n4;
            for (i = 2; i > 0; i = n + 1, array3[n] = a - 1, n = i + 1, array3[i] = n2, n4 = n + 1, array3[n] = n3, i = n4 + 1, array3[n4] = a + 1) {
                --i;
                n2 = array3[i];
                n = i - 1;
                n3 = array3[n];
                i = n;
                if (n2 < n3) {
                    a = a(array, array2, n2, n3);
                }
            }
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
    
    private static class e
    {
        private static int a(final int[] array, final float[] array2, final float[] array3, int i, final int n) {
            final int n2 = array[n];
            int n3 = i;
            while (i < n) {
                int n4 = n3;
                if (array[i] <= n2) {
                    c(array, array2, array3, n3, i);
                    n4 = n3 + 1;
                }
                ++i;
                n3 = n4;
            }
            c(array, array2, array3, n3, n);
            return n3;
        }
        
        static void b(final int[] array, final float[] array2, final float[] array3, int i, int n) {
            final int[] array4 = new int[array.length + 10];
            array4[0] = n;
            array4[1] = i;
            int n2;
            int n3;
            int a = 0;
            int n4 = 0;
            for (i = 2; i > 0; i = n4 + 1, array4[n4] = n2, n = i + 1, array4[i] = n3, i = n + 1, array4[n] = a + 1) {
                --i;
                n2 = array4[i];
                n = i - 1;
                n3 = array4[n];
                i = n;
                if (n2 < n3) {
                    a = a(array, array2, array3, n2, n3);
                    n4 = n + 1;
                    array4[n] = a - 1;
                }
            }
        }
        
        private static void c(final int[] array, final float[] array2, final float[] array3, final int n, final int n2) {
            final int n3 = array[n];
            array[n] = array[n2];
            array[n2] = n3;
            final float n4 = array2[n];
            array2[n] = array2[n2];
            array2[n2] = n4;
            final float n5 = array3[n];
            array3[n] = array3[n2];
            array3[n2] = n5;
        }
    }
    
    public static class f extends h
    {
        String i;
        int j;
        
        public f(final String i) {
            this.i = i;
            this.j = y.a(i);
        }
        
        @Override
        public void h(final androidx.constraintlayout.core.motion.f f, final float n) {
            f.c(this.j, this.a(n));
        }
        
        public void l(final androidx.constraintlayout.core.motion.f f, final float n, final double x, final double y) {
            f.Q(this.a(n) + (float)Math.toDegrees(Math.atan2(y, x)));
        }
    }
    
    static class g
    {
        int a;
        float b;
        float c;
        float d;
        float e;
        
        public g(final int a, final float d, final float c, final float e, final float b) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
