// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

public class u
{
    private static final int m = 4;
    private static final int n = 10;
    private static final int o = 10;
    private static final int p = 5;
    int[] a;
    int[] b;
    int c;
    int[] d;
    float[] e;
    int f;
    int[] g;
    String[] h;
    int i;
    int[] j;
    boolean[] k;
    int l;
    
    public u() {
        this.a = new int[10];
        this.b = new int[10];
        this.c = 0;
        this.d = new int[10];
        this.e = new float[10];
        this.f = 0;
        this.g = new int[5];
        this.h = new String[5];
        this.i = 0;
        this.j = new int[4];
        this.k = new boolean[4];
        this.l = 0;
    }
    
    public void a(final int n, final float n2) {
        final int f = this.f;
        final int[] d = this.d;
        if (f >= d.length) {
            this.d = Arrays.copyOf(d, d.length * 2);
            final float[] e = this.e;
            this.e = Arrays.copyOf(e, e.length * 2);
        }
        final int[] d2 = this.d;
        final int f2 = this.f;
        d2[f2] = n;
        final float[] e2 = this.e;
        this.f = f2 + 1;
        e2[f2] = n2;
    }
    
    public void b(final int n, final int n2) {
        final int c = this.c;
        final int[] a = this.a;
        if (c >= a.length) {
            this.a = Arrays.copyOf(a, a.length * 2);
            final int[] b = this.b;
            this.b = Arrays.copyOf(b, b.length * 2);
        }
        final int[] a2 = this.a;
        final int c2 = this.c;
        a2[c2] = n;
        final int[] b2 = this.b;
        this.c = c2 + 1;
        b2[c2] = n2;
    }
    
    public void c(final int n, final String s) {
        final int i = this.i;
        final int[] g = this.g;
        if (i >= g.length) {
            this.g = Arrays.copyOf(g, g.length * 2);
            final String[] h = this.h;
            this.h = Arrays.copyOf(h, h.length * 2);
        }
        final int[] g2 = this.g;
        final int j = this.i;
        g2[j] = n;
        final String[] h2 = this.h;
        this.i = j + 1;
        h2[j] = s;
    }
    
    public void d(final int n, final boolean b) {
        final int l = this.l;
        final int[] j = this.j;
        if (l >= j.length) {
            this.j = Arrays.copyOf(j, j.length * 2);
            final boolean[] k = this.k;
            this.k = Arrays.copyOf(k, k.length * 2);
        }
        final int[] i = this.j;
        final int m = this.l;
        i[m] = n;
        final boolean[] k2 = this.k;
        this.l = m + 1;
        k2[m] = b;
    }
    
    public void e(final int n, final String s) {
        if (s != null) {
            this.c(n, s);
        }
    }
    
    public void f(final w w) {
        final int n = 0;
        for (int i = 0; i < this.c; ++i) {
            w.b(this.a[i], this.b[i]);
        }
        for (int j = 0; j < this.f; ++j) {
            w.c(this.d[j], this.e[j]);
        }
        int n2 = 0;
        int k;
        while (true) {
            k = n;
            if (n2 >= this.i) {
                break;
            }
            w.d(this.g[n2], this.h[n2]);
            ++n2;
        }
        while (k < this.l) {
            w.e(this.j[k], this.k[k]);
            ++k;
        }
    }
    
    public void g() {
        this.l = 0;
        this.i = 0;
        this.f = 0;
        this.c = 0;
    }
    
    public int h(final int n) {
        for (int i = 0; i < this.c; ++i) {
            if (this.a[i] == n) {
                return this.b[i];
            }
        }
        return -1;
    }
}
