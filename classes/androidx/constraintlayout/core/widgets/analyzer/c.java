// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.widgets.analyzer;

import java.util.Iterator;
import androidx.constraintlayout.core.widgets.f;
import androidx.constraintlayout.core.widgets.e;
import java.util.ArrayList;

public class c extends p
{
    ArrayList<p> k;
    private int l;
    
    public c(final e e, final int f) {
        super(e);
        this.k = new ArrayList<p>();
        super.f = f;
        this.u();
    }
    
    private void u() {
        e b = super.b;
        while (true) {
            final e v = b.V(super.f);
            if (v == null) {
                break;
            }
            b = v;
        }
        super.b = b;
        this.k.add(b.a0(super.f));
        for (e e = b.R(super.f); e != null; e = e.R(super.f)) {
            this.k.add(e.a0(super.f));
        }
        for (final p p : this.k) {
            final int f = super.f;
            if (f == 0) {
                p.b.c = this;
            }
            else {
                if (f != 1) {
                    continue;
                }
                p.b.d = this;
            }
        }
        if (super.f == 0 && ((f)super.b.U()).I2() && this.k.size() > 1) {
            final ArrayList<p> k = this.k;
            super.b = k.get(k.size() - 1).b;
        }
        int l;
        if (super.f == 0) {
            l = super.b.G();
        }
        else {
            l = super.b.f0();
        }
        this.l = l;
    }
    
    private e v() {
        for (int i = 0; i < this.k.size(); ++i) {
            final p p = this.k.get(i);
            if (p.b.i0() != 8) {
                return p.b;
            }
        }
        return null;
    }
    
    private e w() {
        for (int i = this.k.size() - 1; i >= 0; --i) {
            final p p = this.k.get(i);
            if (p.b.i0() != 8) {
                return p.b;
            }
        }
        return null;
    }
    
    @Override
    public void a(final d d) {
        if (super.h.j) {
            if (super.i.j) {
                final e u = super.b.U();
                final boolean b = u instanceof f && ((f)u).I2();
                final int n = super.i.g - super.h.g;
                final int size = this.k.size();
                int index = 0;
                int n2;
                int n3;
                while (true) {
                    n2 = -1;
                    if (index >= size) {
                        n3 = -1;
                        break;
                    }
                    n3 = index;
                    if (this.k.get(index).b.i0() != 8) {
                        break;
                    }
                    ++index;
                }
                int index2;
                final int n4 = index2 = size - 1;
                int n5;
                while (true) {
                    n5 = n2;
                    if (index2 < 0) {
                        break;
                    }
                    if (this.k.get(index2).b.i0() != 8) {
                        n5 = index2;
                        break;
                    }
                    --index2;
                }
                int i = 0;
                while (true) {
                    while (i < 2) {
                        int j = 0;
                        int n6 = 0;
                        int n7 = 0;
                        int n8 = 0;
                        float n9 = 0.0f;
                        while (j < size) {
                            final p p = this.k.get(j);
                            int n10;
                            if (p.b.i0() == 8) {
                                n10 = n7;
                            }
                            else {
                                final int n11 = n8 + 1;
                                int n12 = n6;
                                if (j > 0) {
                                    n12 = n6;
                                    if (j >= n3) {
                                        n12 = n6 + p.h.f;
                                    }
                                }
                                final g e = p.e;
                                int g = e.g;
                                int n13;
                                if (p.d != androidx.constraintlayout.core.widgets.e.b.I) {
                                    n13 = 1;
                                }
                                else {
                                    n13 = 0;
                                }
                                Label_0425: {
                                    if (n13 != 0) {
                                        final int f = super.f;
                                        if (f == 0 && !p.b.e.e.j) {
                                            return;
                                        }
                                        if (f == 1 && !p.b.f.e.j) {
                                            return;
                                        }
                                    }
                                    else {
                                        int m;
                                        if (p.a == 1 && i == 0) {
                                            m = e.m;
                                            ++n7;
                                        }
                                        else {
                                            if (!e.j) {
                                                break Label_0425;
                                            }
                                            m = g;
                                        }
                                        final int n14 = 1;
                                        g = m;
                                        n13 = n14;
                                    }
                                }
                                int n17;
                                float n18;
                                if (n13 == 0) {
                                    final int n15 = n7 + 1;
                                    final float n16 = p.b.M0[super.f];
                                    n17 = n12;
                                    n7 = n15;
                                    n18 = n9;
                                    if (n16 >= 0.0f) {
                                        n18 = n9 + n16;
                                        n17 = n12;
                                        n7 = n15;
                                    }
                                }
                                else {
                                    n17 = n12 + g;
                                    n18 = n9;
                                }
                                n6 = n17;
                                n10 = n7;
                                n8 = n11;
                                n9 = n18;
                                if (j < n4) {
                                    n6 = n17;
                                    n10 = n7;
                                    n8 = n11;
                                    n9 = n18;
                                    if (j < n5) {
                                        n6 = n17 + -p.i.f;
                                        n9 = n18;
                                        n8 = n11;
                                        n10 = n7;
                                    }
                                }
                            }
                            ++j;
                            n7 = n10;
                        }
                        if (n6 >= n && n7 != 0) {
                            ++i;
                        }
                        else {
                            final int n19 = n8;
                            int n20 = n7;
                            int n21 = super.h.g;
                            if (b) {
                                n21 = super.i.g;
                            }
                            int n22 = n21;
                            if (n6 > n) {
                                final int n23 = (int)((n6 - n) / 2.0f + 0.5f);
                                if (b) {
                                    n22 = n21 + n23;
                                }
                                else {
                                    n22 = n21 - n23;
                                }
                            }
                            int n37;
                            if (n20 > 0) {
                                final float n24 = (float)(n - n6);
                                final int n25 = (int)(n24 / n20 + 0.5f);
                                int k = 0;
                                final int n26 = 0;
                                final int n27 = n6;
                                int n28 = n26;
                                final int n29 = n22;
                                while (k < size) {
                                    final p p2 = this.k.get(k);
                                    if (p2.b.i0() != 8) {
                                        if (p2.d == androidx.constraintlayout.core.widgets.e.b.I) {
                                            final g e2 = p2.e;
                                            if (!e2.j) {
                                                int a;
                                                if (n9 > 0.0f) {
                                                    a = (int)(p2.b.M0[super.f] * n24 / n9 + 0.5f);
                                                }
                                                else {
                                                    a = n25;
                                                }
                                                int a2;
                                                int a3;
                                                if (super.f == 0) {
                                                    final e b2 = p2.b;
                                                    a2 = b2.A;
                                                    a3 = b2.z;
                                                }
                                                else {
                                                    final e b3 = p2.b;
                                                    a2 = b3.D;
                                                    a3 = b3.C;
                                                }
                                                int min;
                                                if (p2.a == 1) {
                                                    min = Math.min(a, e2.m);
                                                }
                                                else {
                                                    min = a;
                                                }
                                                int n30;
                                                final int b4 = n30 = Math.max(a3, min);
                                                if (a2 > 0) {
                                                    n30 = Math.min(a2, b4);
                                                }
                                                int n31 = a;
                                                int n32 = n28;
                                                if (n30 != a) {
                                                    n32 = n28 + 1;
                                                    n31 = n30;
                                                }
                                                p2.e.e(n31);
                                                n28 = n32;
                                            }
                                        }
                                    }
                                    ++k;
                                }
                                int n34;
                                if (n28 > 0) {
                                    final int n33 = n20 - n28;
                                    int l = 0;
                                    n34 = 0;
                                    while (l < size) {
                                        final p p3 = this.k.get(l);
                                        if (p3.b.i0() != 8) {
                                            int n35 = n34;
                                            if (l > 0) {
                                                n35 = n34;
                                                if (l >= n3) {
                                                    n35 = n34 + p3.h.f;
                                                }
                                            }
                                            final int n36 = n34 = n35 + p3.e.g;
                                            if (l < n4) {
                                                n34 = n36;
                                                if (l < n5) {
                                                    n34 = n36 + -p3.i.f;
                                                }
                                            }
                                        }
                                        ++l;
                                    }
                                    n20 = n33;
                                }
                                else {
                                    n34 = n27;
                                }
                                if (this.l == 2 && n28 == 0) {
                                    this.l = 0;
                                    n6 = n34;
                                    n37 = n20;
                                    n22 = n29;
                                }
                                else {
                                    n6 = n34;
                                    n37 = n20;
                                    n22 = n29;
                                }
                            }
                            else {
                                n37 = n20;
                            }
                            if (n6 > n) {
                                this.l = 2;
                            }
                            if (n19 > 0 && n37 == 0 && n3 == n5) {
                                this.l = 2;
                            }
                            final int l2 = this.l;
                            if (l2 == 1) {
                                int n38;
                                if (n19 > 1) {
                                    n38 = (n - n6) / (n19 - 1);
                                }
                                else if (n19 == 1) {
                                    n38 = (n - n6) / 2;
                                }
                                else {
                                    n38 = 0;
                                }
                                int n39 = n38;
                                if (n37 > 0) {
                                    n39 = 0;
                                }
                                int n40 = 0;
                                int n41 = n22;
                                while (n40 < size) {
                                    int index3;
                                    if (b) {
                                        index3 = size - (n40 + 1);
                                    }
                                    else {
                                        index3 = n40;
                                    }
                                    final p p4 = this.k.get(index3);
                                    int n42;
                                    if (p4.b.i0() == 8) {
                                        p4.h.e(n41);
                                        p4.i.e(n41);
                                        n42 = n41;
                                    }
                                    else {
                                        int n43 = n41;
                                        if (n40 > 0) {
                                            if (b) {
                                                n43 = n41 - n39;
                                            }
                                            else {
                                                n43 = n41 + n39;
                                            }
                                        }
                                        int n44 = n43;
                                        if (n40 > 0) {
                                            n44 = n43;
                                            if (n40 >= n3) {
                                                final int f2 = p4.h.f;
                                                if (b) {
                                                    n44 = n43 - f2;
                                                }
                                                else {
                                                    n44 = n43 + f2;
                                                }
                                            }
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f3;
                                        if (b) {
                                            f3 = p4.i;
                                        }
                                        else {
                                            f3 = p4.h;
                                        }
                                        f3.e(n44);
                                        final g e3 = p4.e;
                                        int n46;
                                        final int n45 = n46 = e3.g;
                                        if (p4.d == androidx.constraintlayout.core.widgets.e.b.I) {
                                            n46 = n45;
                                            if (p4.a == 1) {
                                                n46 = e3.m;
                                            }
                                        }
                                        int n47;
                                        if (b) {
                                            n47 = n44 - n46;
                                        }
                                        else {
                                            n47 = n44 + n46;
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f4;
                                        if (b) {
                                            f4 = p4.h;
                                        }
                                        else {
                                            f4 = p4.i;
                                        }
                                        f4.e(n47);
                                        p4.g = true;
                                        n42 = n47;
                                        if (n40 < n4) {
                                            n42 = n47;
                                            if (n40 < n5) {
                                                final int n48 = -p4.i.f;
                                                if (b) {
                                                    n42 = n47 - n48;
                                                }
                                                else {
                                                    n42 = n47 + n48;
                                                }
                                            }
                                        }
                                    }
                                    ++n40;
                                    n41 = n42;
                                }
                                return;
                            }
                            if (l2 == 0) {
                                int n49 = (n - n6) / (n19 + 1);
                                if (n37 > 0) {
                                    n49 = 0;
                                }
                                for (int n50 = 0; n50 < size; ++n50) {
                                    int index4;
                                    if (b) {
                                        index4 = size - (n50 + 1);
                                    }
                                    else {
                                        index4 = n50;
                                    }
                                    final p p5 = this.k.get(index4);
                                    if (p5.b.i0() == 8) {
                                        p5.h.e(n22);
                                        p5.i.e(n22);
                                    }
                                    else {
                                        int n51;
                                        if (b) {
                                            n51 = n22 - n49;
                                        }
                                        else {
                                            n51 = n22 + n49;
                                        }
                                        int n52 = n51;
                                        if (n50 > 0) {
                                            n52 = n51;
                                            if (n50 >= n3) {
                                                final int f5 = p5.h.f;
                                                if (b) {
                                                    n52 = n51 - f5;
                                                }
                                                else {
                                                    n52 = n51 + f5;
                                                }
                                            }
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f6;
                                        if (b) {
                                            f6 = p5.i;
                                        }
                                        else {
                                            f6 = p5.h;
                                        }
                                        f6.e(n52);
                                        final g e4 = p5.e;
                                        int n53;
                                        final int a4 = n53 = e4.g;
                                        if (p5.d == androidx.constraintlayout.core.widgets.e.b.I) {
                                            n53 = a4;
                                            if (p5.a == 1) {
                                                n53 = Math.min(a4, e4.m);
                                            }
                                        }
                                        int n54;
                                        if (b) {
                                            n54 = n52 - n53;
                                        }
                                        else {
                                            n54 = n52 + n53;
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f7;
                                        if (b) {
                                            f7 = p5.h;
                                        }
                                        else {
                                            f7 = p5.i;
                                        }
                                        f7.e(n54);
                                        n22 = n54;
                                        if (n50 < n4) {
                                            n22 = n54;
                                            if (n50 < n5) {
                                                final int n55 = -p5.i.f;
                                                if (b) {
                                                    n22 = n54 - n55;
                                                }
                                                else {
                                                    n22 = n54 + n55;
                                                }
                                            }
                                        }
                                    }
                                }
                                return;
                            }
                            if (l2 == 2) {
                                float n56;
                                if (super.f == 0) {
                                    n56 = super.b.E();
                                }
                                else {
                                    n56 = super.b.d0();
                                }
                                float n57 = n56;
                                if (b) {
                                    n57 = 1.0f - n56;
                                }
                                int n58 = (int)((n - n6) * n57 + 0.5f);
                                if (n58 < 0 || n37 > 0) {
                                    n58 = 0;
                                }
                                int n59;
                                if (b) {
                                    n59 = n22 - n58;
                                }
                                else {
                                    n59 = n22 + n58;
                                }
                                for (int n60 = 0; n60 < size; ++n60) {
                                    int index5;
                                    if (b) {
                                        index5 = size - (n60 + 1);
                                    }
                                    else {
                                        index5 = n60;
                                    }
                                    final p p6 = this.k.get(index5);
                                    if (p6.b.i0() == 8) {
                                        p6.h.e(n59);
                                        p6.i.e(n59);
                                    }
                                    else {
                                        int n61 = n59;
                                        if (n60 > 0) {
                                            n61 = n59;
                                            if (n60 >= n3) {
                                                final int f8 = p6.h.f;
                                                if (b) {
                                                    n61 = n59 - f8;
                                                }
                                                else {
                                                    n61 = n59 + f8;
                                                }
                                            }
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f9;
                                        if (b) {
                                            f9 = p6.i;
                                        }
                                        else {
                                            f9 = p6.h;
                                        }
                                        f9.e(n61);
                                        final g e5 = p6.e;
                                        int n62 = e5.g;
                                        if (p6.d == androidx.constraintlayout.core.widgets.e.b.I && p6.a == 1) {
                                            n62 = e5.m;
                                        }
                                        int n63;
                                        if (b) {
                                            n63 = n61 - n62;
                                        }
                                        else {
                                            n63 = n61 + n62;
                                        }
                                        androidx.constraintlayout.core.widgets.analyzer.f f10;
                                        if (b) {
                                            f10 = p6.h;
                                        }
                                        else {
                                            f10 = p6.i;
                                        }
                                        f10.e(n63);
                                        n59 = n63;
                                        if (n60 < n4) {
                                            n59 = n63;
                                            if (n60 < n5) {
                                                final int n64 = -p6.i.f;
                                                if (b) {
                                                    n59 = n63 - n64;
                                                }
                                                else {
                                                    n59 = n63 + n64;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return;
                        }
                    }
                    final int n19 = 0;
                    int n6 = 0;
                    int n20 = 0;
                    float n9 = 0.0f;
                    continue;
                }
            }
        }
    }
    
    @Override
    void d() {
        final Iterator<p> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.next().d();
        }
        final int size = this.k.size();
        if (size < 1) {
            return;
        }
        final e b = this.k.get(0).b;
        final e b2 = this.k.get(size - 1).b;
        Label_0283: {
            androidx.constraintlayout.core.widgets.analyzer.f f;
            int n2;
            if (super.f == 0) {
                final androidx.constraintlayout.core.widgets.d q = b.Q;
                final androidx.constraintlayout.core.widgets.d s = b2.S;
                final androidx.constraintlayout.core.widgets.analyzer.f i = this.i(q, 0);
                int n = q.g();
                final e v = this.v();
                if (v != null) {
                    n = v.Q.g();
                }
                if (i != null) {
                    this.b(super.h, i, n);
                }
                f = this.i(s, 0);
                n2 = s.g();
                final e w = this.w();
                if (w != null) {
                    n2 = w.S.g();
                }
                if (f == null) {
                    break Label_0283;
                }
            }
            else {
                final androidx.constraintlayout.core.widgets.d r = b.R;
                final androidx.constraintlayout.core.widgets.d t = b2.T;
                final androidx.constraintlayout.core.widgets.analyzer.f j = this.i(r, 1);
                int n3 = r.g();
                final e v2 = this.v();
                if (v2 != null) {
                    n3 = v2.R.g();
                }
                if (j != null) {
                    this.b(super.h, j, n3);
                }
                f = this.i(t, 1);
                n2 = t.g();
                final e w2 = this.w();
                if (w2 != null) {
                    n2 = w2.T.g();
                }
                if (f == null) {
                    break Label_0283;
                }
            }
            this.b(super.i, f, -n2);
        }
        super.h.a = this;
        super.i.a = this;
    }
    
    public void e() {
        for (int i = 0; i < this.k.size(); ++i) {
            this.k.get(i).e();
        }
    }
    
    @Override
    void f() {
        super.c = null;
        final Iterator<p> iterator = this.k.iterator();
        while (iterator.hasNext()) {
            iterator.next().f();
        }
    }
    
    @Override
    public long j() {
        final int size = this.k.size();
        long n = 0L;
        for (int i = 0; i < size; ++i) {
            final p p = this.k.get(i);
            n = n + p.h.f + p.j() + p.i.f;
        }
        return n;
    }
    
    @Override
    void n() {
        super.h.j = false;
        super.i.j = false;
    }
    
    @Override
    boolean p() {
        for (int size = this.k.size(), i = 0; i < size; ++i) {
            if (!this.k.get(i).p()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ChainRun ");
        String str;
        if (super.f == 0) {
            str = "horizontal : ";
        }
        else {
            str = "vertical : ";
        }
        sb.append(str);
        for (final p obj : this.k) {
            sb.append("<");
            sb.append(obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}
