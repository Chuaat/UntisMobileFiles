// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import java.util.Arrays;
import java.io.PrintStream;

public class a implements b.a
{
    private static final boolean l = false;
    static final int m = -1;
    private static final boolean n = false;
    private static float o = 0.001f;
    int a;
    private final b b;
    protected final c c;
    private int d;
    private i e;
    private int[] f;
    private int[] g;
    private float[] h;
    private int i;
    private int j;
    private boolean k;
    
    a(final b b, final c c) {
        this.a = 0;
        this.d = 8;
        this.e = null;
        this.f = new int[8];
        this.g = new int[8];
        this.h = new float[8];
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.b = b;
        this.c = c;
    }
    
    public int a() {
        return this.i;
    }
    
    public final int b(final int n) {
        return this.f[n];
    }
    
    public final int c(final int n) {
        return this.g[n];
    }
    
    @Override
    public final void clear() {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            final i j = this.c.d[this.f[i]];
            if (j != null) {
                j.j(this.b);
            }
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.a = 0;
    }
    
    @Override
    public int d() {
        return this.a;
    }
    
    @Override
    public int e(final i i) {
        int j = this.i;
        if (j == -1) {
            return -1;
        }
        for (int n = 0; j != -1 && n < this.a; j = this.g[j], ++n) {
            if (this.f[j] == i.I) {
                return j;
            }
        }
        return -1;
    }
    
    @Override
    public void f() {
        final int a = this.a;
        System.out.print("{ ");
        for (int i = 0; i < a; ++i) {
            final i j = this.j(i);
            if (j != null) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append(j);
                sb.append(" = ");
                sb.append(this.m(i));
                sb.append(" ");
                out.print(sb.toString());
            }
        }
        System.out.println(" }");
    }
    
    @Override
    public boolean g(final i i) {
        int j = this.i;
        if (j == -1) {
            return false;
        }
        for (int n = 0; j != -1 && n < this.a; j = this.g[j], ++n) {
            if (this.f[j] == i.I) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public float h(final b b, final boolean b2) {
        final float o = this.o(b.a);
        this.n(b.a, b2);
        final b.a e = b.e;
        for (int d = e.d(), i = 0; i < d; ++i) {
            final i j = e.j(i);
            this.k(j, e.o(j) * o, b2);
        }
        return o;
    }
    
    @Override
    public final void i(final i i, final float n) {
        if (n == 0.0f) {
            this.n(i, true);
            return;
        }
        int j = this.i;
        if (j == -1) {
            this.i = 0;
            this.h[0] = n;
            this.f[0] = i.I;
            this.g[0] = -1;
            ++i.S;
            i.b(this.b);
            ++this.a;
            if (!this.k) {
                final int k = this.j + 1;
                this.j = k;
                final int[] f = this.f;
                if (k >= f.length) {
                    this.k = true;
                    this.j = f.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (j != -1 && n2 < this.a) {
            final int[] f2 = this.f;
            final int n4 = f2[j];
            final int l = i.I;
            if (n4 == l) {
                this.h[j] = n;
                return;
            }
            if (f2[j] < l) {
                n3 = j;
            }
            j = this.g[j];
            ++n2;
        }
        int n5 = this.j;
        if (this.k) {
            final int[] f3 = this.f;
            if (f3[n5] != -1) {
                n5 = f3.length;
            }
        }
        else {
            ++n5;
        }
        final int[] f4 = this.f;
        int n6 = n5;
        if (n5 >= f4.length) {
            n6 = n5;
            if (this.a < f4.length) {
                int n7 = 0;
                while (true) {
                    final int[] f5 = this.f;
                    n6 = n5;
                    if (n7 >= f5.length) {
                        break;
                    }
                    if (f5[n7] == -1) {
                        n6 = n7;
                        break;
                    }
                    ++n7;
                }
            }
        }
        final int[] f6 = this.f;
        int length;
        if ((length = n6) >= f6.length) {
            length = f6.length;
            final int n8 = this.d * 2;
            this.d = n8;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, n8);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = i.I;
        this.h[length] = n;
        final int[] g = this.g;
        if (n3 != -1) {
            g[length] = g[n3];
            g[n3] = length;
        }
        else {
            g[length] = this.i;
            this.i = length;
        }
        ++i.S;
        i.b(this.b);
        final int a = this.a + 1;
        this.a = a;
        if (!this.k) {
            ++this.j;
        }
        final int[] f7 = this.f;
        if (a >= f7.length) {
            this.k = true;
        }
        if (this.j >= f7.length) {
            this.k = true;
            this.j = f7.length - 1;
        }
    }
    
    @Override
    public i j(final int n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            if (n2 == n) {
                return this.c.d[this.f[i]];
            }
        }
        return null;
    }
    
    @Override
    public void k(final i i, float n, final boolean b) {
        final float o = androidx.constraintlayout.core.a.o;
        if (n > -o && n < o) {
            return;
        }
        int j = this.i;
        if (j == -1) {
            this.i = 0;
            this.h[0] = n;
            this.f[0] = i.I;
            this.g[0] = -1;
            ++i.S;
            i.b(this.b);
            ++this.a;
            if (!this.k) {
                final int k = this.j + 1;
                this.j = k;
                final int[] f = this.f;
                if (k >= f.length) {
                    this.k = true;
                    this.j = f.length - 1;
                }
            }
            return;
        }
        int n2 = 0;
        int n3 = -1;
        while (j != -1 && n2 < this.a) {
            final int[] f2 = this.f;
            final int n4 = f2[j];
            final int l = i.I;
            if (n4 == l) {
                final float[] h = this.h;
                final float n5 = h[j] + n;
                final float o2 = androidx.constraintlayout.core.a.o;
                n = n5;
                if (n5 > -o2) {
                    n = n5;
                    if (n5 < o2) {
                        n = 0.0f;
                    }
                }
                h[j] = n;
                if (n == 0.0f) {
                    if (j == this.i) {
                        this.i = this.g[j];
                    }
                    else {
                        final int[] g = this.g;
                        g[n3] = g[j];
                    }
                    if (b) {
                        i.j(this.b);
                    }
                    if (this.k) {
                        this.j = j;
                    }
                    --i.S;
                    --this.a;
                }
                return;
            }
            if (f2[j] < l) {
                n3 = j;
            }
            j = this.g[j];
            ++n2;
        }
        int n6 = this.j;
        if (this.k) {
            final int[] f3 = this.f;
            if (f3[n6] != -1) {
                n6 = f3.length;
            }
        }
        else {
            ++n6;
        }
        final int[] f4 = this.f;
        int n7 = n6;
        if (n6 >= f4.length) {
            n7 = n6;
            if (this.a < f4.length) {
                int n8 = 0;
                while (true) {
                    final int[] f5 = this.f;
                    n7 = n6;
                    if (n8 >= f5.length) {
                        break;
                    }
                    if (f5[n8] == -1) {
                        n7 = n8;
                        break;
                    }
                    ++n8;
                }
            }
        }
        final int[] f6 = this.f;
        int length;
        if ((length = n7) >= f6.length) {
            length = f6.length;
            final int n9 = this.d * 2;
            this.d = n9;
            this.k = false;
            this.j = length - 1;
            this.h = Arrays.copyOf(this.h, n9);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[length] = i.I;
        this.h[length] = n;
        final int[] g2 = this.g;
        if (n3 != -1) {
            g2[length] = g2[n3];
            g2[n3] = length;
        }
        else {
            g2[length] = this.i;
            this.i = length;
        }
        ++i.S;
        i.b(this.b);
        ++this.a;
        if (!this.k) {
            ++this.j;
        }
        final int m = this.j;
        final int[] f7 = this.f;
        if (m >= f7.length) {
            this.k = true;
            this.j = f7.length - 1;
        }
    }
    
    @Override
    public void l() {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            final float[] h = this.h;
            h[i] *= -1.0f;
        }
    }
    
    @Override
    public float m(final int n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            if (n2 == n) {
                return this.h[i];
            }
        }
        return 0.0f;
    }
    
    @Override
    public final float n(final i i, final boolean b) {
        if (this.e == i) {
            this.e = null;
        }
        int j = this.i;
        if (j == -1) {
            return 0.0f;
        }
        int n = 0;
        int n2 = -1;
        while (j != -1 && n < this.a) {
            if (this.f[j] == i.I) {
                if (j == this.i) {
                    this.i = this.g[j];
                }
                else {
                    final int[] g = this.g;
                    g[n2] = g[j];
                }
                if (b) {
                    i.j(this.b);
                }
                --i.S;
                --this.a;
                this.f[j] = -1;
                if (this.k) {
                    this.j = j;
                }
                return this.h[j];
            }
            final int n3 = this.g[j];
            ++n;
            n2 = j;
            j = n3;
        }
        return 0.0f;
    }
    
    @Override
    public final float o(final i i) {
        for (int j = this.i, n = 0; j != -1 && n < this.a; j = this.g[j], ++n) {
            if (this.f[j] == i.I) {
                return this.h[j];
            }
        }
        return 0.0f;
    }
    
    @Override
    public int p() {
        return this.f.length * 4 * 3 + 0 + 36;
    }
    
    @Override
    public void q(final float n) {
        for (int i = this.i, n2 = 0; i != -1 && n2 < this.a; i = this.g[i], ++n2) {
            final float[] h = this.h;
            h[i] /= n;
        }
    }
    
    i r() {
        final i e = this.e;
        if (e == null) {
            int i = this.i;
            int n = 0;
            i j = null;
            while (i != -1 && n < this.a) {
                i k = j;
                Label_0086: {
                    if (this.h[i] < 0.0f) {
                        final i l = this.c.d[this.f[i]];
                        if (j != null) {
                            k = j;
                            if (j.K >= l.K) {
                                break Label_0086;
                            }
                        }
                        k = l;
                    }
                }
                i = this.g[i];
                ++n;
                j = k;
            }
            return j;
        }
        return e;
    }
    
    public final float s(final int n) {
        return this.h[n];
    }
    
    boolean t() {
        for (int i = this.i, n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            if (this.h[i] > 0.0f) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        int i = this.i;
        String string = "";
        for (int n = 0; i != -1 && n < this.a; i = this.g[i], ++n) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(" -> ");
            final String string2 = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append(this.h[i]);
            sb2.append(" : ");
            final String string3 = sb2.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string3);
            sb3.append(this.c.d[this.f[i]]);
            string = sb3.toString();
        }
        return string;
    }
}
