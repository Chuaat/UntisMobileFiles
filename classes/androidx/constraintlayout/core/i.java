// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import java.util.Arrays;
import java.util.HashSet;

public class i implements Comparable<i>
{
    private static final boolean X = false;
    private static final boolean Y = false;
    public static final int Z = 0;
    public static final int a0 = 1;
    public static final int b0 = 2;
    public static final int c0 = 3;
    public static final int d0 = 4;
    public static final int e0 = 5;
    public static final int f0 = 6;
    public static final int g0 = 7;
    public static final int h0 = 8;
    private static int i0 = 1;
    private static int j0 = 1;
    private static int k0 = 1;
    private static int l0 = 1;
    private static int m0 = 1;
    static final int n0 = 9;
    public boolean G;
    private String H;
    public int I;
    int J;
    public int K;
    public float L;
    public boolean M;
    float[] N;
    float[] O;
    b P;
    androidx.constraintlayout.core.b[] Q;
    int R;
    public int S;
    boolean T;
    int U;
    float V;
    HashSet<androidx.constraintlayout.core.b> W;
    
    public i(final b p2, final String s) {
        this.I = -1;
        this.J = -1;
        this.K = 0;
        this.M = false;
        this.N = new float[9];
        this.O = new float[9];
        this.Q = new androidx.constraintlayout.core.b[16];
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = -1;
        this.V = 0.0f;
        this.W = null;
        this.P = p2;
    }
    
    public i(final String h, final b p2) {
        this.I = -1;
        this.J = -1;
        this.K = 0;
        this.M = false;
        this.N = new float[9];
        this.O = new float[9];
        this.Q = new androidx.constraintlayout.core.b[16];
        this.R = 0;
        this.S = 0;
        this.T = false;
        this.U = -1;
        this.V = 0.0f;
        this.W = null;
        this.H = h;
        this.P = p2;
    }
    
    private static String h(final b b, final String str) {
        StringBuilder sb;
        int j0;
        if (str != null) {
            sb = new StringBuilder();
            sb.append(str);
            j0 = i.j0;
        }
        else {
            final int n = i$a.a[b.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 4) {
                            if (n != 5) {
                                throw new AssertionError((Object)b.name());
                            }
                            sb = new StringBuilder();
                            sb.append("V");
                            j0 = ++i.m0;
                        }
                        else {
                            sb = new StringBuilder();
                            sb.append("e");
                            j0 = ++i.j0;
                        }
                    }
                    else {
                        sb = new StringBuilder();
                        sb.append("S");
                        j0 = ++i.i0;
                    }
                }
                else {
                    sb = new StringBuilder();
                    sb.append("C");
                    j0 = ++i.l0;
                }
            }
            else {
                sb = new StringBuilder();
                sb.append("U");
                j0 = ++i.k0;
            }
        }
        sb.append(j0);
        return sb.toString();
    }
    
    static void i() {
        ++i.j0;
    }
    
    public final void b(final androidx.constraintlayout.core.b b) {
        int n = 0;
        while (true) {
            final int r = this.R;
            if (n >= r) {
                final androidx.constraintlayout.core.b[] q = this.Q;
                if (r >= q.length) {
                    this.Q = Arrays.copyOf(q, q.length * 2);
                }
                final androidx.constraintlayout.core.b[] q2 = this.Q;
                final int r2 = this.R;
                q2[r2] = b;
                this.R = r2 + 1;
                return;
            }
            if (this.Q[n] == b) {
                return;
            }
            ++n;
        }
    }
    
    void d() {
        for (int i = 0; i < 9; ++i) {
            this.N[i] = 0.0f;
        }
    }
    
    public int f(final i i) {
        return this.I - i.I;
    }
    
    public String g() {
        return this.H;
    }
    
    public final void j(final androidx.constraintlayout.core.b b) {
        for (int r = this.R, i = 0; i < r; ++i) {
            if (this.Q[i] == b) {
                while (i < r - 1) {
                    final androidx.constraintlayout.core.b[] q = this.Q;
                    final int n = i + 1;
                    q[i] = q[n];
                    i = n;
                }
                --this.R;
                return;
            }
        }
    }
    
    public void k() {
        this.H = null;
        this.P = b.K;
        this.K = 0;
        this.I = -1;
        this.J = -1;
        this.L = 0.0f;
        this.M = false;
        this.T = false;
        this.U = -1;
        this.V = 0.0f;
        for (int r = this.R, i = 0; i < r; ++i) {
            this.Q[i] = null;
        }
        this.R = 0;
        this.S = 0;
        this.G = false;
        Arrays.fill(this.O, 0.0f);
    }
    
    public void l(final e e, final float l) {
        this.L = l;
        this.M = true;
        this.T = false;
        this.U = -1;
        this.V = 0.0f;
        final int r = this.R;
        this.J = -1;
        for (int i = 0; i < r; ++i) {
            this.Q[i].a(e, this, false);
        }
        this.R = 0;
    }
    
    public void m(final String h) {
        this.H = h;
    }
    
    public void o(final e e, final i i, final float v) {
        this.T = true;
        this.U = i.I;
        this.V = v;
        final int r = this.R;
        this.J = -1;
        for (int j = 0; j < r; ++j) {
            this.Q[j].G(e, this, false);
        }
        this.R = 0;
        e.z();
    }
    
    public void p(final b p2, final String s) {
        this.P = p2;
    }
    
    String s() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this);
        sb.append("[");
        String s = sb.toString();
        int i = 0;
        boolean b = false;
        boolean b2 = true;
        while (i < this.N.length) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s);
            sb2.append(this.N[i]);
            final String string = sb2.toString();
            final float[] n = this.N;
            if (n[i] > 0.0f) {
                b = false;
            }
            else if (n[i] < 0.0f) {
                b = true;
            }
            if (n[i] != 0.0f) {
                b2 = false;
            }
            StringBuilder sb3;
            String str;
            if (i < n.length - 1) {
                sb3 = new StringBuilder();
                sb3.append(string);
                str = ", ";
            }
            else {
                sb3 = new StringBuilder();
                sb3.append(string);
                str = "] ";
            }
            sb3.append(str);
            s = sb3.toString();
            ++i;
        }
        String string2 = s;
        if (b) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(s);
            sb4.append(" (-)");
            string2 = sb4.toString();
        }
        String string3 = string2;
        if (b2) {
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(string2);
            sb5.append(" (*)");
            string3 = sb5.toString();
        }
        return string3;
    }
    
    @Override
    public String toString() {
        StringBuilder sb;
        if (this.H != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.H);
        }
        else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.I);
        }
        return sb.toString();
    }
    
    public final void u(final e e, final androidx.constraintlayout.core.b b) {
        for (int r = this.R, i = 0; i < r; ++i) {
            this.Q[i].c(e, b, false);
        }
        this.R = 0;
    }
    
    public enum b
    {
        G, 
        H, 
        I, 
        J, 
        K;
    }
}
