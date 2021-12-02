// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import androidx.constraintlayout.core.widgets.d;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashMap;

public class e
{
    public static boolean A = false;
    private static int B = 1000;
    public static f C;
    public static long D = 0L;
    public static long E = 0L;
    public static final boolean r = false;
    public static final boolean s = false;
    public static final boolean t = false;
    private static final boolean u = false;
    public static boolean v = false;
    public static boolean w = true;
    public static boolean x = true;
    public static boolean y = true;
    public static boolean z = true;
    public boolean a;
    int b;
    private HashMap<String, i> c;
    private a d;
    private int e;
    private int f;
    androidx.constraintlayout.core.b[] g;
    public boolean h;
    public boolean i;
    private boolean[] j;
    int k;
    int l;
    private int m;
    final c n;
    private i[] o;
    private int p;
    private a q;
    
    public e() {
        this.a = false;
        this.b = 0;
        this.c = null;
        this.e = 32;
        this.f = 32;
        this.g = null;
        this.h = false;
        this.i = false;
        this.j = new boolean[32];
        this.k = 1;
        this.l = 0;
        this.m = 32;
        this.o = new i[androidx.constraintlayout.core.e.B];
        this.p = 0;
        this.g = new androidx.constraintlayout.core.b[32];
        this.W();
        final c n = new c();
        this.n = n;
        this.d = (a)new h(n);
        androidx.constraintlayout.core.b q;
        if (androidx.constraintlayout.core.e.A) {
            q = new b(n);
        }
        else {
            q = new androidx.constraintlayout.core.b(n);
        }
        this.q = (a)q;
    }
    
    private void A() {
        this.B();
        String string = "";
        for (int i = 0; i < this.l; ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(this.g[i]);
            final String string2 = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string2);
            sb2.append("\n");
            string = sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append(this.d);
        sb3.append("\n");
        System.out.println(sb3.toString());
    }
    
    private void B() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Display Rows (");
        sb.append(this.l);
        sb.append("x");
        sb.append(this.k);
        sb.append(")\n");
        System.out.println(sb.toString());
    }
    
    private int E(final a a) throws Exception {
        while (true) {
            for (int i = 0; i < this.l; ++i) {
                final androidx.constraintlayout.core.b[] g = this.g;
                if (g[i].a.P != androidx.constraintlayout.core.i.b.G) {
                    if (g[i].b < 0.0f) {
                        final boolean b = true;
                        int n;
                        if (b) {
                            int j = 0;
                            n = 0;
                            while (j == 0) {
                                final f c = androidx.constraintlayout.core.e.C;
                                if (c != null) {
                                    ++c.o;
                                }
                                final int n2 = n + 1;
                                float n3 = Float.MAX_VALUE;
                                int k = 0;
                                int l = -1;
                                int m = -1;
                                int n4 = 0;
                                while (k < this.l) {
                                    final androidx.constraintlayout.core.b b2 = this.g[k];
                                    float n5;
                                    int n6;
                                    int n7;
                                    int n8;
                                    if (b2.a.P == androidx.constraintlayout.core.i.b.G) {
                                        n5 = n3;
                                        n6 = l;
                                        n7 = m;
                                        n8 = n4;
                                    }
                                    else if (b2.f) {
                                        n5 = n3;
                                        n6 = l;
                                        n7 = m;
                                        n8 = n4;
                                    }
                                    else {
                                        n5 = n3;
                                        n6 = l;
                                        n7 = m;
                                        n8 = n4;
                                        if (b2.b < 0.0f) {
                                            if (androidx.constraintlayout.core.e.z) {
                                                final int d = b2.e.d();
                                                int n9 = 0;
                                                while (true) {
                                                    n5 = n3;
                                                    n6 = l;
                                                    n7 = m;
                                                    n8 = n4;
                                                    if (n9 >= d) {
                                                        break;
                                                    }
                                                    final i j2 = b2.e.j(n9);
                                                    final float o = b2.e.o(j2);
                                                    float n10;
                                                    int n11;
                                                    int n12;
                                                    int n13;
                                                    if (o <= 0.0f) {
                                                        n10 = n3;
                                                        n11 = l;
                                                        n12 = m;
                                                        n13 = n4;
                                                    }
                                                    else {
                                                        final int n14 = 0;
                                                        int n15 = n4;
                                                        int n16 = n14;
                                                        while (true) {
                                                            n10 = n3;
                                                            n11 = l;
                                                            n12 = m;
                                                            n13 = n15;
                                                            if (n16 >= 9) {
                                                                break;
                                                            }
                                                            final float n17 = j2.N[n16] / o;
                                                            int n18;
                                                            if ((n17 < n3 && n16 == n15) || n16 > (n18 = n15)) {
                                                                m = j2.I;
                                                                n18 = n16;
                                                                l = k;
                                                                n3 = n17;
                                                            }
                                                            ++n16;
                                                            n15 = n18;
                                                        }
                                                    }
                                                    ++n9;
                                                    n3 = n10;
                                                    l = n11;
                                                    m = n12;
                                                    n4 = n13;
                                                }
                                            }
                                            else {
                                                final int n19 = 1;
                                                int n20 = n4;
                                                int n21 = m;
                                                int n22 = n19;
                                                while (true) {
                                                    n5 = n3;
                                                    n6 = l;
                                                    n7 = n21;
                                                    n8 = n20;
                                                    if (n22 >= this.k) {
                                                        break;
                                                    }
                                                    final i i2 = this.n.d[n22];
                                                    final float o2 = b2.e.o(i2);
                                                    float n23;
                                                    int n24;
                                                    int n25;
                                                    int n26;
                                                    if (o2 <= 0.0f) {
                                                        n23 = n3;
                                                        n24 = l;
                                                        n25 = n21;
                                                        n26 = n20;
                                                    }
                                                    else {
                                                        final int n27 = 0;
                                                        int n28 = n21;
                                                        int n29 = n27;
                                                        while (true) {
                                                            n23 = n3;
                                                            n24 = l;
                                                            n25 = n28;
                                                            n26 = n20;
                                                            if (n29 >= 9) {
                                                                break;
                                                            }
                                                            final float n30 = i2.N[n29] / o2;
                                                            int n31;
                                                            if ((n30 < n3 && n29 == n20) || n29 > (n31 = n20)) {
                                                                n28 = n22;
                                                                n31 = n29;
                                                                l = k;
                                                                n3 = n30;
                                                            }
                                                            ++n29;
                                                            n20 = n31;
                                                        }
                                                    }
                                                    ++n22;
                                                    n3 = n23;
                                                    l = n24;
                                                    n21 = n25;
                                                    n20 = n26;
                                                }
                                            }
                                        }
                                    }
                                    ++k;
                                    n3 = n5;
                                    l = n6;
                                    m = n7;
                                    n4 = n8;
                                }
                                if (l != -1) {
                                    final androidx.constraintlayout.core.b b3 = this.g[l];
                                    b3.a.J = -1;
                                    final f c2 = androidx.constraintlayout.core.e.C;
                                    if (c2 != null) {
                                        ++c2.n;
                                    }
                                    b3.C(this.n.d[m]);
                                    final i a2 = b3.a;
                                    a2.J = l;
                                    a2.u(this, b3);
                                }
                                else {
                                    j = 1;
                                }
                                n = n2;
                                if (n2 > this.k / 2) {
                                    j = 1;
                                    n = n2;
                                }
                            }
                        }
                        else {
                            n = 0;
                        }
                        return n;
                    }
                }
            }
            final boolean b = false;
            continue;
        }
    }
    
    private String H(int i) {
        final int j = i * 4;
        final int k = j / 1024;
        i = k / 1024;
        if (i > 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append(i);
            sb.append(" Mb");
            return sb.toString();
        }
        if (k > 0) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(k);
            sb2.append(" Kb");
            return sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("");
        sb3.append(j);
        sb3.append(" bytes");
        return sb3.toString();
    }
    
    private String I(final int n) {
        if (n == 1) {
            return "LOW";
        }
        if (n == 2) {
            return "MEDIUM";
        }
        if (n == 3) {
            return "HIGH";
        }
        if (n == 4) {
            return "HIGHEST";
        }
        if (n == 5) {
            return "EQUALITY";
        }
        if (n == 8) {
            return "FIXED";
        }
        if (n == 6) {
            return "BARRIER";
        }
        return "NONE";
    }
    
    public static f L() {
        return e.C;
    }
    
    private void S() {
        final int n = this.e * 2;
        this.e = n;
        this.g = Arrays.copyOf(this.g, n);
        final c n2 = this.n;
        n2.d = Arrays.copyOf(n2.d, this.e);
        final int e = this.e;
        this.j = new boolean[e];
        this.f = e;
        this.m = e;
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.h;
            c.t = Math.max(c.t, e);
            final f c2 = androidx.constraintlayout.core.e.C;
            c2.J = c2.t;
        }
    }
    
    private final int V(final a a, final boolean b) {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.l;
        }
        for (int i = 0; i < this.k; ++i) {
            this.j[i] = false;
        }
        int j = 0;
        int n = 0;
        while (j == 0) {
            final f c2 = androidx.constraintlayout.core.e.C;
            if (c2 != null) {
                ++c2.m;
            }
            final int n2 = n + 1;
            if (n2 >= this.k * 2) {
                return n2;
            }
            if (a.getKey() != null) {
                this.j[a.getKey().I] = true;
            }
            final i e = a.e(this, this.j);
            if (e != null) {
                final boolean[] k = this.j;
                final int l = e.I;
                if (k[l]) {
                    return n2;
                }
                k[l] = true;
            }
            if (e != null) {
                float n3 = Float.MAX_VALUE;
                int n4 = 0;
                int m = -1;
                while (n4 < this.l) {
                    final androidx.constraintlayout.core.b b2 = this.g[n4];
                    float n5;
                    int n6;
                    if (b2.a.P == androidx.constraintlayout.core.i.b.G) {
                        n5 = n3;
                        n6 = m;
                    }
                    else if (b2.f) {
                        n5 = n3;
                        n6 = m;
                    }
                    else {
                        n5 = n3;
                        n6 = m;
                        if (b2.y(e)) {
                            final float o = b2.e.o(e);
                            n5 = n3;
                            n6 = m;
                            if (o < 0.0f) {
                                final float n7 = -b2.b / o;
                                n5 = n3;
                                n6 = m;
                                if (n7 < n3) {
                                    n6 = n4;
                                    n5 = n7;
                                }
                            }
                        }
                    }
                    ++n4;
                    n3 = n5;
                    m = n6;
                }
                n = n2;
                if (m <= -1) {
                    continue;
                }
                final androidx.constraintlayout.core.b b3 = this.g[m];
                b3.a.J = -1;
                final f c3 = androidx.constraintlayout.core.e.C;
                if (c3 != null) {
                    ++c3.n;
                }
                b3.C(e);
                final i a2 = b3.a;
                a2.J = m;
                a2.u(this, b3);
                n = n2;
            }
            else {
                j = 1;
                n = n2;
            }
        }
        return n;
    }
    
    private void W() {
        final boolean a = androidx.constraintlayout.core.e.A;
        int i = 0;
        final int n = 0;
        if (a) {
            for (int j = n; j < this.l; ++j) {
                final androidx.constraintlayout.core.b b = this.g[j];
                if (b != null) {
                    this.n.a.a(b);
                }
                this.g[j] = null;
            }
        }
        else {
            while (i < this.l) {
                final androidx.constraintlayout.core.b b2 = this.g[i];
                if (b2 != null) {
                    this.n.b.a(b2);
                }
                this.g[i] = null;
                ++i;
            }
        }
    }
    
    private i a(final i.b b, final String s) {
        i i = this.n.c.b();
        if (i == null) {
            i = new i(b, s);
        }
        else {
            i.k();
        }
        i.p(b, s);
        final int p2 = this.p;
        final int b2 = androidx.constraintlayout.core.e.B;
        if (p2 >= b2) {
            this.o = Arrays.copyOf(this.o, androidx.constraintlayout.core.e.B = b2 * 2);
        }
        return this.o[this.p++] = i;
    }
    
    private void g(final androidx.constraintlayout.core.b b) {
        b.g(this, 0);
    }
    
    private final void m(final androidx.constraintlayout.core.b b) {
        if (androidx.constraintlayout.core.e.x && b.f) {
            b.a.l(this, b.b);
        }
        else {
            final androidx.constraintlayout.core.b[] g = this.g;
            final int l = this.l;
            g[l] = b;
            final i a = b.a;
            a.J = l;
            this.l = l + 1;
            a.u(this, b);
        }
        if (androidx.constraintlayout.core.e.x && this.a) {
            int n;
            for (int i = 0; i < this.l; i = n + 1) {
                if (this.g[i] == null) {
                    System.out.println("WTF");
                }
                final androidx.constraintlayout.core.b[] g2 = this.g;
                n = i;
                if (g2[i] != null) {
                    n = i;
                    if (g2[i].f) {
                        final androidx.constraintlayout.core.b b2 = g2[i];
                        b2.a.l(this, b2.b);
                        g.a<androidx.constraintlayout.core.b> a2;
                        if (androidx.constraintlayout.core.e.A) {
                            a2 = this.n.a;
                        }
                        else {
                            a2 = this.n.b;
                        }
                        a2.a(b2);
                        this.g[i] = null;
                        int n3;
                        int n2 = n3 = i + 1;
                        int j;
                        while (true) {
                            j = this.l;
                            if (n2 >= j) {
                                break;
                            }
                            final androidx.constraintlayout.core.b[] g3 = this.g;
                            final int k = n2 - 1;
                            g3[k] = g3[n2];
                            if (g3[k].a.J == n2) {
                                g3[k].a.J = k;
                            }
                            n3 = n2;
                            ++n2;
                        }
                        if (n3 < j) {
                            this.g[n3] = null;
                        }
                        this.l = j - 1;
                        n = i - 1;
                    }
                }
            }
            this.a = false;
        }
    }
    
    private void n(final androidx.constraintlayout.core.b b, final int n) {
        this.o(b, n, 0);
    }
    
    private void r() {
        for (int i = 0; i < this.l; ++i) {
            final androidx.constraintlayout.core.b b = this.g[i];
            b.a.L = b.b;
        }
    }
    
    public static androidx.constraintlayout.core.b w(final e e, final i i, final i j, final float n) {
        return e.v().m(i, j, n);
    }
    
    private i y(final String key, final i.b b) {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.p;
        }
        if (this.k + 1 >= this.f) {
            this.S();
        }
        final i a = this.a(b, null);
        a.m(key);
        final int n = this.b + 1;
        this.b = n;
        ++this.k;
        a.I = n;
        if (this.c == null) {
            this.c = new HashMap<String, i>();
        }
        this.c.put(key, a);
        return this.n.d[this.b] = a;
    }
    
    void C() {
        int i = 0;
        int n = 0;
        while (i < this.e) {
            final androidx.constraintlayout.core.b[] g = this.g;
            int n2 = n;
            if (g[i] != null) {
                n2 = n + g[i].E();
            }
            ++i;
            n = n2;
        }
        int j = 0;
        int n3 = 0;
        while (j < this.l) {
            final androidx.constraintlayout.core.b[] g2 = this.g;
            int n4 = n3;
            if (g2[j] != null) {
                n4 = n3 + g2[j].E();
            }
            ++j;
            n3 = n4;
        }
        final PrintStream out = System.out;
        final StringBuilder sb = new StringBuilder();
        sb.append("Linear System -> Table size: ");
        sb.append(this.e);
        sb.append(" (");
        final int e = this.e;
        sb.append(this.H(e * e));
        sb.append(") -- row sizes: ");
        sb.append(this.H(n));
        sb.append(", actual size: ");
        sb.append(this.H(n3));
        sb.append(" rows: ");
        sb.append(this.l);
        sb.append("/");
        sb.append(this.m);
        sb.append(" cols: ");
        sb.append(this.k);
        sb.append("/");
        sb.append(this.f);
        sb.append(" ");
        sb.append(0);
        sb.append(" occupied cells, ");
        sb.append(this.H(0));
        out.println(sb.toString());
    }
    
    public void D() {
        this.B();
        String s = "";
        String string;
        for (int i = 0; i < this.l; ++i, s = string) {
            string = s;
            if (this.g[i].a.P == androidx.constraintlayout.core.i.b.G) {
                final StringBuilder sb = new StringBuilder();
                sb.append(s);
                sb.append(this.g[i].F());
                final String string2 = sb.toString();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                sb2.append("\n");
                string = sb2.toString();
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s);
        sb3.append(this.d);
        sb3.append("\n");
        System.out.println(sb3.toString());
    }
    
    public void F(final f c) {
        androidx.constraintlayout.core.e.C = c;
    }
    
    public c G() {
        return this.n;
    }
    
    a J() {
        return this.d;
    }
    
    public int K() {
        int i = 0;
        int n = 0;
        while (i < this.l) {
            final androidx.constraintlayout.core.b[] g = this.g;
            int n2 = n;
            if (g[i] != null) {
                n2 = n + g[i].E();
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    public int M() {
        return this.l;
    }
    
    public int N() {
        return this.b;
    }
    
    public int O(final Object o) {
        final i j = ((d)o).j();
        if (j != null) {
            return (int)(j.L + 0.5f);
        }
        return 0;
    }
    
    androidx.constraintlayout.core.b P(final int n) {
        return this.g[n];
    }
    
    float Q(final String s) {
        final i r = this.R(s, androidx.constraintlayout.core.i.b.G);
        if (r == null) {
            return 0.0f;
        }
        return r.L;
    }
    
    i R(final String key, final i.b b) {
        if (this.c == null) {
            this.c = new HashMap<String, i>();
        }
        i y;
        if ((y = this.c.get(key)) == null) {
            y = this.y(key, b);
        }
        return y;
    }
    
    public void T() throws Exception {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.i;
        }
        if (this.d.isEmpty()) {
            this.r();
            return;
        }
        Label_0052: {
            if (this.h || this.i) {
                final f c2 = androidx.constraintlayout.core.e.C;
                if (c2 != null) {
                    ++c2.v;
                }
                final int n = 0;
                int i = 0;
                while (true) {
                    while (i < this.l) {
                        if (!this.g[i].f) {
                            final int n2 = n;
                            if (n2 == 0) {
                                break Label_0052;
                            }
                            final f c3 = androidx.constraintlayout.core.e.C;
                            if (c3 != null) {
                                ++c3.u;
                            }
                            this.r();
                            return;
                        }
                        else {
                            ++i;
                        }
                    }
                    final int n2 = 1;
                    continue;
                }
            }
        }
        this.U(this.d);
    }
    
    void U(final a a) throws Exception {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.z;
            c.A = Math.max(c.A, this.k);
            final f c2 = androidx.constraintlayout.core.e.C;
            c2.B = Math.max(c2.B, this.l);
        }
        this.E(a);
        this.V(a, false);
        this.r();
    }
    
    public void X(final androidx.constraintlayout.core.b b) {
        if (b.f) {
            final i a = b.a;
            if (a != null) {
                int j = a.J;
                if (j != -1) {
                    int l;
                    while (true) {
                        l = this.l;
                        if (j >= l - 1) {
                            break;
                        }
                        final androidx.constraintlayout.core.b[] g = this.g;
                        final int n = j + 1;
                        final i a2 = g[n].a;
                        if (a2.J == n) {
                            a2.J = j;
                        }
                        g[j] = g[n];
                        j = n;
                    }
                    this.l = l - 1;
                }
                final i a3 = b.a;
                if (!a3.M) {
                    a3.l(this, b.b);
                }
                g.a<androidx.constraintlayout.core.b> a4;
                if (androidx.constraintlayout.core.e.A) {
                    a4 = this.n.a;
                }
                else {
                    a4 = this.n.b;
                }
                a4.a(b);
            }
        }
    }
    
    public void Y() {
        int n = 0;
        c n2;
        while (true) {
            n2 = this.n;
            final i[] d = n2.d;
            if (n >= d.length) {
                break;
            }
            final i i = d[n];
            if (i != null) {
                i.k();
            }
            ++n;
        }
        n2.c.c(this.o, this.p);
        this.p = 0;
        Arrays.fill(this.n.d, null);
        final HashMap<String, i> c = this.c;
        if (c != null) {
            c.clear();
        }
        this.b = 0;
        this.d.clear();
        this.k = 1;
        for (int j = 0; j < this.l; ++j) {
            final androidx.constraintlayout.core.b[] g = this.g;
            if (g[j] != null) {
                g[j].c = false;
            }
        }
        this.W();
        this.l = 0;
        androidx.constraintlayout.core.b q;
        if (androidx.constraintlayout.core.e.A) {
            q = new b(this.n);
        }
        else {
            q = new androidx.constraintlayout.core.b(this.n);
        }
        this.q = (a)q;
    }
    
    public void b(final androidx.constraintlayout.core.widgets.e e, final androidx.constraintlayout.core.widgets.e e2, final float n, final int n2) {
        final d.b h = androidx.constraintlayout.core.widgets.d.b.H;
        final i u = this.u(e.r(h));
        final d.b i = androidx.constraintlayout.core.widgets.d.b.I;
        final i u2 = this.u(e.r(i));
        final d.b j = androidx.constraintlayout.core.widgets.d.b.J;
        final i u3 = this.u(e.r(j));
        final d.b k = androidx.constraintlayout.core.widgets.d.b.K;
        final i u4 = this.u(e.r(k));
        final i u5 = this.u(e2.r(h));
        final i u6 = this.u(e2.r(i));
        final i u7 = this.u(e2.r(j));
        final i u8 = this.u(e2.r(k));
        final androidx.constraintlayout.core.b v = this.v();
        final double n3 = n;
        final double sin = Math.sin(n3);
        final double n4 = n2;
        v.v(u2, u4, u6, u8, (float)(sin * n4));
        this.d(v);
        final androidx.constraintlayout.core.b v2 = this.v();
        v2.v(u, u3, u5, u7, (float)(Math.cos(n3) * n4));
        this.d(v2);
    }
    
    public void c(final i i, final i j, final int n, final float n2, final i k, final i l, final int n3, final int n4) {
        final androidx.constraintlayout.core.b v = this.v();
        v.k(i, j, n, n2, k, l, n3);
        if (n4 != 8) {
            v.g(this, n4);
        }
        this.d(v);
    }
    
    public void d(final androidx.constraintlayout.core.b b) {
        if (b == null) {
            return;
        }
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.j;
            if (b.f) {
                ++c.k;
            }
        }
        final int l = this.l;
        final boolean b2 = true;
        if (l + 1 >= this.m || this.k + 1 >= this.f) {
            this.S();
        }
        int n = 0;
        if (!b.f) {
            b.b(this);
            if (b.isEmpty()) {
                return;
            }
            b.w();
            Label_0282: {
                if (b.i(this)) {
                    final i t = this.t();
                    b.a = t;
                    final int i = this.l;
                    this.m(b);
                    if (this.l == i + 1) {
                        this.q.d((a)b);
                        this.V(this.q, true);
                        n = (b2 ? 1 : 0);
                        if (t.J == -1) {
                            if (b.a == t) {
                                final i a = b.A(t);
                                if (a != null) {
                                    final f c2 = androidx.constraintlayout.core.e.C;
                                    if (c2 != null) {
                                        ++c2.n;
                                    }
                                    b.C(a);
                                }
                            }
                            if (!b.f) {
                                b.a.u(this, b);
                            }
                            g.a<androidx.constraintlayout.core.b> a2;
                            if (androidx.constraintlayout.core.e.A) {
                                a2 = this.n.a;
                            }
                            else {
                                a2 = this.n.b;
                            }
                            a2.a(b);
                            --this.l;
                            n = (b2 ? 1 : 0);
                        }
                        break Label_0282;
                    }
                }
                n = 0;
            }
            if (!b.x()) {
                return;
            }
        }
        if (n == 0) {
            this.m(b);
        }
    }
    
    public androidx.constraintlayout.core.b e(final i i, final i j, final int n, final int n2) {
        if (androidx.constraintlayout.core.e.w && n2 == 8 && j.M && i.J == -1) {
            i.l(this, j.L + n);
            return null;
        }
        final androidx.constraintlayout.core.b v = this.v();
        v.r(i, j, n);
        if (n2 != 8) {
            v.g(this, n2);
        }
        this.d(v);
        return v;
    }
    
    public void f(final i i, int j) {
        if (androidx.constraintlayout.core.e.w && i.J == -1) {
            final float n = (float)j;
            i.l(this, n);
            i k;
            for (j = 0; j < this.b + 1; ++j) {
                k = this.n.d[j];
                if (k != null && k.T && k.U == i.I) {
                    k.l(this, k.V + n);
                }
            }
            return;
        }
        final int l = i.J;
        androidx.constraintlayout.core.b b2 = null;
        Label_0189: {
            if (l != -1) {
                final androidx.constraintlayout.core.b b = this.g[l];
                if (!b.f) {
                    if (b.e.d() != 0) {
                        final androidx.constraintlayout.core.b v = this.v();
                        v.q(i, j);
                        b2 = v;
                        break Label_0189;
                    }
                    b.f = true;
                }
                b.b = (float)j;
                return;
            }
            final androidx.constraintlayout.core.b v2 = this.v();
            v2.l(i, j);
            b2 = v2;
        }
        this.d(b2);
    }
    
    public void h(final i i, final i j, final int n, final boolean b) {
        final androidx.constraintlayout.core.b v = this.v();
        final i x = this.x();
        x.K = 0;
        v.t(i, j, x, n);
        this.d(v);
    }
    
    public void i(final i i, final i j, final int n, final int n2) {
        final androidx.constraintlayout.core.b v = this.v();
        final i x = this.x();
        x.K = 0;
        v.t(i, j, x, n);
        if (n2 != 8) {
            this.o(v, (int)(v.e.o(x) * -1.0f), n2);
        }
        this.d(v);
    }
    
    public void j(final i i, final i j, final int n, final boolean b) {
        final androidx.constraintlayout.core.b v = this.v();
        final i x = this.x();
        x.K = 0;
        v.u(i, j, x, n);
        this.d(v);
    }
    
    public void k(final i i, final i j, final int n, final int n2) {
        final androidx.constraintlayout.core.b v = this.v();
        final i x = this.x();
        x.K = 0;
        v.u(i, j, x, n);
        if (n2 != 8) {
            this.o(v, (int)(v.e.o(x) * -1.0f), n2);
        }
        this.d(v);
    }
    
    public void l(final i i, final i j, final i k, final i l, final float n, final int n2) {
        final androidx.constraintlayout.core.b v = this.v();
        v.n(i, j, k, l, n);
        if (n2 != 8) {
            v.g(this, n2);
        }
        this.d(v);
    }
    
    void o(final androidx.constraintlayout.core.b b, final int n, final int n2) {
        b.h(this.s(n2, null), n);
    }
    
    public void p(i i, final i j, final int n) {
        if (i.J == -1 && n == 0) {
            i k = j;
            if (j.T) {
                k = this.n.d[j.U];
            }
            if (i.T) {
                i = this.n.d[i.U];
            }
            else {
                i.o(this, k, 0.0f);
            }
        }
        else {
            this.e(i, j, n, 8);
        }
    }
    
    final void q() {
        int n;
        for (int i = 0; i < this.l; i = n + 1) {
            final androidx.constraintlayout.core.b b = this.g[i];
            if (b.e.d() == 0) {
                b.f = true;
            }
            n = i;
            if (b.f) {
                final i a = b.a;
                a.L = b.b;
                a.j(b);
                int n2 = i;
                int l;
                while (true) {
                    l = this.l;
                    if (n2 >= l - 1) {
                        break;
                    }
                    final androidx.constraintlayout.core.b[] g = this.g;
                    final int n3 = n2 + 1;
                    g[n2] = g[n3];
                    n2 = n3;
                }
                this.g[l - 1] = null;
                this.l = l - 1;
                n = i - 1;
                g.a<androidx.constraintlayout.core.b> a2;
                if (androidx.constraintlayout.core.e.A) {
                    a2 = this.n.a;
                }
                else {
                    a2 = this.n.b;
                }
                a2.a(b);
            }
        }
    }
    
    public i s(final int k, final String s) {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.q;
        }
        if (this.k + 1 >= this.f) {
            this.S();
        }
        final i a = this.a(androidx.constraintlayout.core.i.b.J, s);
        final int n = this.b + 1;
        this.b = n;
        ++this.k;
        a.I = n;
        a.K = k;
        this.n.d[n] = a;
        this.d.f(a);
        return a;
    }
    
    public i t() {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.s;
        }
        if (this.k + 1 >= this.f) {
            this.S();
        }
        final i a = this.a(androidx.constraintlayout.core.i.b.I, null);
        final int n = this.b + 1;
        this.b = n;
        ++this.k;
        a.I = n;
        return this.n.d[n] = a;
    }
    
    public i u(final Object o) {
        i i = null;
        if (o == null) {
            return null;
        }
        if (this.k + 1 >= this.f) {
            this.S();
        }
        if (o instanceof d) {
            final d d = (d)o;
            i j;
            if ((j = d.j()) == null) {
                d.z(this.n);
                j = d.j();
            }
            final int k = j.I;
            if (k != -1 && k <= this.b) {
                i = j;
                if (this.n.d[k] != null) {
                    return i;
                }
            }
            if (k != -1) {
                j.k();
            }
            final int n = this.b + 1;
            this.b = n;
            ++this.k;
            j.I = n;
            j.P = androidx.constraintlayout.core.i.b.G;
            this.n.d[n] = j;
            i = j;
        }
        return i;
    }
    
    public androidx.constraintlayout.core.b v() {
        androidx.constraintlayout.core.b b = null;
        Label_0101: {
            if (androidx.constraintlayout.core.e.A) {
                if ((b = this.n.a.b()) == null) {
                    b = new b(this.n);
                    ++androidx.constraintlayout.core.e.E;
                    break Label_0101;
                }
            }
            else if ((b = this.n.b.b()) == null) {
                b = new androidx.constraintlayout.core.b(this.n);
                ++androidx.constraintlayout.core.e.D;
                break Label_0101;
            }
            b.D();
        }
        androidx.constraintlayout.core.i.i();
        return b;
    }
    
    public i x() {
        final f c = androidx.constraintlayout.core.e.C;
        if (c != null) {
            ++c.r;
        }
        if (this.k + 1 >= this.f) {
            this.S();
        }
        final i a = this.a(androidx.constraintlayout.core.i.b.I, null);
        final int n = this.b + 1;
        this.b = n;
        ++this.k;
        a.I = n;
        return this.n.d[n] = a;
    }
    
    public void z() {
        this.B();
        final StringBuilder sb = new StringBuilder();
        sb.append(" num vars ");
        sb.append(this.b);
        sb.append("\n");
        String string = sb.toString();
        final int n = 0;
        String string2;
        for (int i = 0; i < this.b + 1; ++i, string = string2) {
            final i obj = this.n.d[i];
            string2 = string;
            if (obj != null) {
                string2 = string;
                if (obj.M) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(string);
                    sb2.append(" $[");
                    sb2.append(i);
                    sb2.append("] => ");
                    sb2.append(obj);
                    sb2.append(" = ");
                    sb2.append(obj.L);
                    sb2.append("\n");
                    string2 = sb2.toString();
                }
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("\n");
        String string3 = sb3.toString();
        String string4;
        for (int j = 0; j < this.b + 1; ++j, string3 = string4) {
            final i[] d = this.n.d;
            final i obj2 = d[j];
            string4 = string3;
            if (obj2 != null) {
                string4 = string3;
                if (obj2.T) {
                    final i obj3 = d[obj2.U];
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(string3);
                    sb4.append(" ~[");
                    sb4.append(j);
                    sb4.append("] => ");
                    sb4.append(obj2);
                    sb4.append(" = ");
                    sb4.append(obj3);
                    sb4.append(" + ");
                    sb4.append(obj2.V);
                    sb4.append("\n");
                    string4 = sb4.toString();
                }
            }
        }
        final StringBuilder sb5 = new StringBuilder();
        sb5.append(string3);
        sb5.append("\n\n #  ");
        String s = sb5.toString();
        for (int k = n; k < this.l; ++k) {
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(s);
            sb6.append(this.g[k].F());
            final String string5 = sb6.toString();
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(string5);
            sb7.append("\n #  ");
            s = sb7.toString();
        }
        String string6 = s;
        if (this.d != null) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(s);
            sb8.append("Goal: ");
            sb8.append(this.d);
            sb8.append("\n");
            string6 = sb8.toString();
        }
        System.out.println(string6);
    }
    
    interface a
    {
        void a(final e p0, final i p1, final boolean p2);
        
        void b(final e p0);
        
        void c(final e p0, final androidx.constraintlayout.core.b p1, final boolean p2);
        
        void clear();
        
        void d(final a p0);
        
        i e(final e p0, final boolean[] p1);
        
        void f(final i p0);
        
        i getKey();
        
        boolean isEmpty();
    }
    
    class b extends androidx.constraintlayout.core.b
    {
        public b(final c c) {
            super.e = new j(this, c);
        }
    }
}
