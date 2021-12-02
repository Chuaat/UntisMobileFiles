// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import java.io.PrintStream;
import java.util.Arrays;

public class j implements a
{
    private static final boolean n = false;
    private static final boolean o = true;
    private static float p = 0.001f;
    private final int a;
    private int b;
    private int c;
    int[] d;
    int[] e;
    int[] f;
    float[] g;
    int[] h;
    int[] i;
    int j;
    int k;
    private final b l;
    protected final c m;
    
    j(final b l, final c m) {
        this.a = -1;
        this.b = 16;
        this.c = 16;
        this.d = new int[16];
        this.e = new int[16];
        this.f = new int[16];
        this.g = new float[16];
        this.h = new int[16];
        this.i = new int[16];
        this.j = 0;
        this.k = -1;
        this.l = l;
        this.m = m;
        this.clear();
    }
    
    private void a(final i i, final int n) {
        final int n2 = i.I % this.c;
        final int[] d = this.d;
        int n3;
        if ((n3 = d[n2]) == -1) {
            d[n2] = n;
        }
        else {
            int[] e;
            while (true) {
                e = this.e;
                if (e[n3] == -1) {
                    break;
                }
                n3 = e[n3];
            }
            e[n3] = n;
        }
        this.e[n] = -1;
    }
    
    private void b(final int n, final i i, final float n2) {
        this.f[n] = i.I;
        this.g[n] = n2;
        this.h[n] = -1;
        this.i[n] = -1;
        i.b(this.l);
        ++i.S;
        ++this.j;
    }
    
    private void c() {
        for (int i = 0; i < this.c; ++i) {
            if (this.d[i] != -1) {
                final StringBuilder sb = new StringBuilder();
                sb.append(this.hashCode());
                sb.append(" hash [");
                sb.append(i);
                sb.append("] => ");
                String s = sb.toString();
                int n = this.d[i];
                int j = 0;
                while (j == 0) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(s);
                    sb2.append(" ");
                    sb2.append(this.f[n]);
                    s = sb2.toString();
                    final int[] e = this.e;
                    if (e[n] != -1) {
                        n = e[n];
                    }
                    else {
                        j = 1;
                    }
                }
                System.out.println(s);
            }
        }
    }
    
    private int r() {
        for (int i = 0; i < this.b; ++i) {
            if (this.f[i] == -1) {
                return i;
            }
        }
        return -1;
    }
    
    private void s() {
        final int n = this.b * 2;
        this.f = Arrays.copyOf(this.f, n);
        this.g = Arrays.copyOf(this.g, n);
        this.h = Arrays.copyOf(this.h, n);
        this.i = Arrays.copyOf(this.i, n);
        this.e = Arrays.copyOf(this.e, n);
        for (int i = this.b; i < n; ++i) {
            this.f[i] = -1;
            this.e[i] = -1;
        }
        this.b = n;
    }
    
    private void t(final int n, final i i, final float n2) {
        final int r = this.r();
        this.b(r, i, n2);
        if (n != -1) {
            this.h[r] = n;
            final int[] j = this.i;
            j[r] = j[n];
            j[n] = r;
        }
        else {
            this.h[r] = -1;
            if (this.j > 0) {
                this.i[r] = this.k;
                this.k = r;
            }
            else {
                this.i[r] = -1;
            }
        }
        final int[] k = this.i;
        if (k[r] != -1) {
            this.h[k[r]] = r;
        }
        this.a(i, r);
    }
    
    private void u(final i i) {
        final int j = i.I;
        final int n = j % this.c;
        final int[] d = this.d;
        final int n2 = d[n];
        if (n2 == -1) {
            return;
        }
        int n3 = n2;
        if (this.f[n2] == j) {
            final int[] e = this.e;
            d[n] = e[n2];
            e[n2] = -1;
        }
        else {
            int[] e2;
            while (true) {
                e2 = this.e;
                if (e2[n3] == -1 || this.f[e2[n3]] == j) {
                    break;
                }
                n3 = e2[n3];
            }
            final int n4 = e2[n3];
            if (n4 != -1 && this.f[n4] == j) {
                e2[n3] = e2[n4];
                e2[n4] = -1;
            }
        }
    }
    
    @Override
    public void clear() {
        for (int j = this.j, i = 0; i < j; ++i) {
            final i k = this.j(i);
            if (k != null) {
                k.j(this.l);
            }
        }
        for (int l = 0; l < this.b; ++l) {
            this.f[l] = -1;
            this.e[l] = -1;
        }
        for (int n = 0; n < this.c; ++n) {
            this.d[n] = -1;
        }
        this.j = 0;
        this.k = -1;
    }
    
    @Override
    public int d() {
        return this.j;
    }
    
    @Override
    public int e(final i i) {
        if (this.j != 0) {
            if (i != null) {
                final int j = i.I;
                final int n = this.d[j % this.c];
                if (n == -1) {
                    return -1;
                }
                int n2 = n;
                if (this.f[n] == j) {
                    return n;
                }
                int[] e;
                while (true) {
                    e = this.e;
                    if (e[n2] == -1 || this.f[e[n2]] == j) {
                        break;
                    }
                    n2 = e[n2];
                }
                if (e[n2] == -1) {
                    return -1;
                }
                if (this.f[e[n2]] == j) {
                    return e[n2];
                }
            }
        }
        return -1;
    }
    
    @Override
    public void f() {
        final int j = this.j;
        System.out.print("{ ");
        for (int i = 0; i < j; ++i) {
            final i k = this.j(i);
            if (k != null) {
                final PrintStream out = System.out;
                final StringBuilder sb = new StringBuilder();
                sb.append(k);
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
        return this.e(i) != -1;
    }
    
    @Override
    public float h(final b b, final boolean b2) {
        final float o = this.o(b.a);
        this.n(b.a, b2);
        final j j = (j)b.e;
        final int d = j.d();
        int i = 0;
        int n = 0;
        while (i < d) {
            final int[] f = j.f;
            int n2 = i;
            if (f[n] != -1) {
                this.k(this.m.d[f[n]], j.g[n] * o, b2);
                n2 = i + 1;
            }
            ++n;
            i = n2;
        }
        return o;
    }
    
    @Override
    public void i(final i i, final float n) {
        final float p2 = androidx.constraintlayout.core.j.p;
        if (n > -p2 && n < p2) {
            this.n(i, true);
            return;
        }
        final int j = this.j;
        int n2 = 0;
        if (j == 0) {
            this.b(0, i, n);
            this.a(i, 0);
            this.k = 0;
        }
        else {
            final int e = this.e(i);
            if (e != -1) {
                this.g[e] = n;
            }
            else {
                if (this.j + 1 >= this.b) {
                    this.s();
                }
                final int k = this.j;
                int l = this.k;
                int n3 = -1;
                int n4;
                while (true) {
                    n4 = n3;
                    if (n2 >= k) {
                        break;
                    }
                    final int[] f = this.f;
                    final int n5 = f[l];
                    final int m = i.I;
                    if (n5 == m) {
                        this.g[l] = n;
                        return;
                    }
                    if (f[l] < m) {
                        n3 = l;
                    }
                    l = this.i[l];
                    if (l == -1) {
                        n4 = n3;
                        break;
                    }
                    ++n2;
                }
                this.t(n4, i, n);
            }
        }
    }
    
    @Override
    public i j(final int n) {
        final int j = this.j;
        if (j == 0) {
            return null;
        }
        int k = this.k;
        for (int i = 0; i < j; ++i) {
            if (i == n && k != -1) {
                return this.m.d[this.f[k]];
            }
            k = this.i[k];
            if (k == -1) {
                break;
            }
        }
        return null;
    }
    
    @Override
    public void k(final i i, float n, final boolean b) {
        final float p3 = androidx.constraintlayout.core.j.p;
        if (n > -p3 && n < p3) {
            return;
        }
        final int e = this.e(i);
        if (e == -1) {
            this.i(i, n);
        }
        else {
            final float[] g = this.g;
            g[e] += n;
            n = g[e];
            final float p4 = androidx.constraintlayout.core.j.p;
            if (n > -p4 && g[e] < p4) {
                g[e] = 0.0f;
                this.n(i, b);
            }
        }
    }
    
    @Override
    public void l() {
        final int j = this.j;
        int k = this.k;
        for (int i = 0; i < j; ++i) {
            final float[] g = this.g;
            g[k] *= -1.0f;
            k = this.i[k];
            if (k == -1) {
                break;
            }
        }
    }
    
    @Override
    public float m(final int n) {
        final int j = this.j;
        int k = this.k;
        for (int i = 0; i < j; ++i) {
            if (i == n) {
                return this.g[k];
            }
            k = this.i[k];
            if (k == -1) {
                break;
            }
        }
        return 0.0f;
    }
    
    @Override
    public float n(final i i, final boolean b) {
        final int e = this.e(i);
        if (e == -1) {
            return 0.0f;
        }
        this.u(i);
        final float n = this.g[e];
        if (this.k == e) {
            this.k = this.i[e];
        }
        this.f[e] = -1;
        final int[] h = this.h;
        if (h[e] != -1) {
            final int[] j = this.i;
            j[h[e]] = j[e];
        }
        final int[] k = this.i;
        if (k[e] != -1) {
            h[k[e]] = h[e];
        }
        --this.j;
        --i.S;
        if (b) {
            i.j(this.l);
        }
        return n;
    }
    
    @Override
    public float o(final i i) {
        final int e = this.e(i);
        if (e != -1) {
            return this.g[e];
        }
        return 0.0f;
    }
    
    @Override
    public int p() {
        return 0;
    }
    
    @Override
    public void q(final float n) {
        final int j = this.j;
        int k = this.k;
        for (int i = 0; i < j; ++i) {
            final float[] g = this.g;
            g[k] /= n;
            k = this.i[k];
            if (k == -1) {
                break;
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.hashCode());
        sb.append(" { ");
        String s = sb.toString();
        for (int j = this.j, i = 0; i < j; ++i) {
            final i k = this.j(i);
            if (k != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(s);
                sb2.append(k);
                sb2.append(" = ");
                sb2.append(this.m(i));
                sb2.append(" ");
                final String string = sb2.toString();
                final int e = this.e(k);
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append("[p: ");
                final String string2 = sb3.toString();
                StringBuilder sb4;
                if (this.h[e] != -1) {
                    sb4 = new StringBuilder();
                    sb4.append(string2);
                    sb4.append(this.m.d[this.f[this.h[e]]]);
                }
                else {
                    sb4 = new StringBuilder();
                    sb4.append(string2);
                    sb4.append("none");
                }
                final String string3 = sb4.toString();
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(string3);
                sb5.append(", n: ");
                final String string4 = sb5.toString();
                String str;
                if (this.i[e] != -1) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(string4);
                    sb6.append(this.m.d[this.f[this.i[e]]]);
                    str = sb6.toString();
                }
                else {
                    final StringBuilder sb7 = new StringBuilder();
                    sb7.append(string4);
                    sb7.append("none");
                    str = sb7.toString();
                }
                final StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append("]");
                s = sb8.toString();
            }
        }
        final StringBuilder sb9 = new StringBuilder();
        sb9.append(s);
        sb9.append(" }");
        return sb9.toString();
    }
}
