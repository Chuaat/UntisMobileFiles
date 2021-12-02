// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.e;

public class k
{
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 4;
    public static final int e = 8;
    public static final int f = 16;
    public static final int g = 32;
    public static final int h = 64;
    public static final int i = 128;
    public static final int j = 256;
    public static final int k = 512;
    public static final int l = 1024;
    public static final int m = 257;
    static boolean[] n;
    static final int o = 0;
    static final int p = 1;
    static final int q = 2;
    
    static {
        androidx.constraintlayout.core.widgets.k.n = new boolean[3];
    }
    
    static void a(final f f, final e e, final androidx.constraintlayout.core.widgets.e e2) {
        e2.t = -1;
        e2.u = -1;
        final androidx.constraintlayout.core.widgets.e.b b = f.b0[0];
        final androidx.constraintlayout.core.widgets.e.b h = androidx.constraintlayout.core.widgets.e.b.H;
        if (b != h && e2.b0[0] == androidx.constraintlayout.core.widgets.e.b.J) {
            final int g = e2.Q.g;
            final int n = f.j0() - e2.S.g;
            final d q = e2.Q;
            q.i = e.u(q);
            final d s = e2.S;
            s.i = e.u(s);
            e.f(e2.Q.i, g);
            e.f(e2.S.i, n);
            e2.t = 2;
            e2.w1(g, n);
        }
        if (f.b0[1] != h && e2.b0[1] == androidx.constraintlayout.core.widgets.e.b.J) {
            final int g2 = e2.R.g;
            final int n2 = f.D() - e2.T.g;
            final d r = e2.R;
            r.i = e.u(r);
            final d t = e2.T;
            t.i = e.u(t);
            e.f(e2.R.i, g2);
            e.f(e2.T.i, n2);
            if (e2.n0 > 0 || e2.i0() == 8) {
                final d u = e2.U;
                u.i = e.u(u);
                e.f(e2.U.i, e2.n0 + g2);
            }
            e2.u = 2;
            e2.R1(g2, n2);
        }
    }
    
    public static final boolean b(final int n, final int n2) {
        return (n & n2) == n2;
    }
}
