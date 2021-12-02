// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core;

import java.util.ArrayList;

public class b implements e.a
{
    private static final boolean g = false;
    private static final boolean h = false;
    i a;
    float b;
    boolean c;
    ArrayList<i> d;
    public a e;
    boolean f;
    
    public b() {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList<i>();
        this.f = false;
    }
    
    public b(final c c) {
        this.a = null;
        this.b = 0.0f;
        this.c = false;
        this.d = new ArrayList<i>();
        this.f = false;
        this.e = (a)new androidx.constraintlayout.core.a(this, c);
    }
    
    private i B(final boolean[] array, final i i) {
        final int d = this.e.d();
        i j = null;
        int k = 0;
        float n = 0.0f;
        while (k < d) {
            final float m = this.e.m(k);
            i l = j;
            float n2 = n;
            Label_0157: {
                if (m < 0.0f) {
                    final i j2 = this.e.j(k);
                    if (array != null) {
                        l = j;
                        n2 = n;
                        if (array[j2.I]) {
                            break Label_0157;
                        }
                    }
                    l = j;
                    n2 = n;
                    if (j2 != i) {
                        final i.b p2 = j2.P;
                        if (p2 != androidx.constraintlayout.core.i.b.I) {
                            l = j;
                            n2 = n;
                            if (p2 != androidx.constraintlayout.core.i.b.J) {
                                break Label_0157;
                            }
                        }
                        l = j;
                        n2 = n;
                        if (m < n) {
                            n2 = m;
                            l = j2;
                        }
                    }
                }
            }
            ++k;
            j = l;
            n = n2;
        }
        return j;
    }
    
    private boolean z(final i i, final e e) {
        final int s = i.S;
        boolean b = true;
        if (s > 1) {
            b = false;
        }
        return b;
    }
    
    public i A(final i i) {
        return this.B(null, i);
    }
    
    void C(final i a) {
        final i a2 = this.a;
        if (a2 != null) {
            this.e.i(a2, -1.0f);
            this.a.J = -1;
            this.a = null;
        }
        final float n = this.e.n(a, true) * -1.0f;
        this.a = a;
        if (n == 1.0f) {
            return;
        }
        this.b /= n;
        this.e.q(n);
    }
    
    public void D() {
        this.a = null;
        this.e.clear();
        this.b = 0.0f;
        this.f = false;
    }
    
    int E() {
        int n;
        if (this.a != null) {
            n = 4;
        }
        else {
            n = 0;
        }
        return n + 4 + 4 + this.e.p();
    }
    
    String F() {
        StringBuilder sb;
        if (this.a == null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append("0");
        }
        else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.a);
        }
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(" = ");
        String str = sb2.toString();
        final float b = this.b;
        int i = 0;
        int n;
        if (b != 0.0f) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append(this.b);
            str = sb3.toString();
            n = 1;
        }
        else {
            n = 0;
        }
        while (i < this.e.d()) {
            final i j = this.e.j(i);
            if (j != null) {
                final float m = this.e.m(i);
                final float n2 = fcmpl(m, 0.0f);
                if (n2 != 0) {
                    final String string2 = j.toString();
                    String s = null;
                    float f = 0.0f;
                    Label_0323: {
                        String str2;
                        StringBuilder sb5;
                        if (n == 0) {
                            s = str;
                            f = m;
                            if (m >= 0.0f) {
                                break Label_0323;
                            }
                            final StringBuilder sb4 = new StringBuilder();
                            sb4.append(str);
                            str2 = "- ";
                            sb5 = sb4;
                        }
                        else {
                            if (n2 > 0) {
                                final StringBuilder sb6 = new StringBuilder();
                                sb6.append(str);
                                sb6.append(" + ");
                                s = sb6.toString();
                                f = m;
                                break Label_0323;
                            }
                            final StringBuilder sb6 = new StringBuilder();
                            sb6.append(str);
                            final String s2 = " - ";
                            sb5 = sb6;
                            str2 = s2;
                        }
                        sb5.append(str2);
                        s = sb5.toString();
                        f = m * -1.0f;
                    }
                    StringBuilder sb7;
                    if (f == 1.0f) {
                        sb7 = new StringBuilder();
                    }
                    else {
                        sb7 = new StringBuilder();
                        sb7.append(s);
                        sb7.append(f);
                        s = " ";
                    }
                    sb7.append(s);
                    sb7.append(string2);
                    str = sb7.toString();
                    n = 1;
                }
            }
            ++i;
        }
        String string3 = str;
        if (n == 0) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(str);
            sb8.append("0.0");
            string3 = sb8.toString();
        }
        return string3;
    }
    
    public void G(final e e, final i i, final boolean b) {
        if (i != null) {
            if (i.T) {
                final float o = this.e.o(i);
                this.b += i.V * o;
                this.e.n(i, b);
                if (b) {
                    i.j(this);
                }
                this.e.k(e.n.d[i.U], o, b);
                if (e.x && this.e.d() == 0) {
                    this.f = true;
                    e.a = true;
                }
            }
        }
    }
    
    @Override
    public void a(final e e, final i i, final boolean b) {
        if (i != null) {
            if (i.M) {
                this.b += i.L * this.e.o(i);
                this.e.n(i, b);
                if (b) {
                    i.j(this);
                }
                if (e.x && this.e.d() == 0) {
                    this.f = true;
                    e.a = true;
                }
            }
        }
    }
    
    @Override
    public void b(final e e) {
        if (e.g.length == 0) {
            return;
        }
        int i = 0;
        while (i == 0) {
            for (int d = this.e.d(), j = 0; j < d; ++j) {
                final i k = this.e.j(j);
                if (k.J != -1 || k.M || k.T) {
                    this.d.add(k);
                }
            }
            final int size = this.d.size();
            if (size > 0) {
                for (int l = 0; l < size; ++l) {
                    final i m = this.d.get(l);
                    if (m.M) {
                        this.a(e, m, true);
                    }
                    else if (m.T) {
                        this.G(e, m, true);
                    }
                    else {
                        this.c(e, e.g[m.J], true);
                    }
                }
                this.d.clear();
            }
            else {
                i = 1;
            }
        }
        if (e.x && this.a != null && this.e.d() == 0) {
            this.f = true;
            e.a = true;
        }
    }
    
    @Override
    public void c(final e e, final b b, final boolean b2) {
        this.b += b.b * this.e.h(b, b2);
        if (b2) {
            b.a.j(this);
        }
        if (e.x && this.a != null && this.e.d() == 0) {
            this.f = true;
            e.a = true;
        }
    }
    
    @Override
    public void clear() {
        this.e.clear();
        this.a = null;
        this.b = 0.0f;
    }
    
    @Override
    public void d(final e.a a) {
        if (a instanceof b) {
            final b b = (b)a;
            this.a = null;
            this.e.clear();
            for (int i = 0; i < b.e.d(); ++i) {
                this.e.k(b.e.j(i), b.e.m(i), true);
            }
        }
    }
    
    @Override
    public i e(final e e, final boolean[] array) {
        return this.B(array, null);
    }
    
    @Override
    public void f(final i i) {
        final int k = i.K;
        float n = 1.0f;
        if (k != 1) {
            if (k == 2) {
                n = 1000.0f;
            }
            else if (k == 3) {
                n = 1000000.0f;
            }
            else if (k == 4) {
                n = 1.0E9f;
            }
            else if (k == 5) {
                n = 1.0E12f;
            }
        }
        this.e.i(i, n);
    }
    
    public b g(final e e, final int n) {
        this.e.i(e.s(n, "ep"), 1.0f);
        this.e.i(e.s(n, "em"), -1.0f);
        return this;
    }
    
    @Override
    public i getKey() {
        return this.a;
    }
    
    b h(final i i, final int n) {
        this.e.i(i, (float)n);
        return this;
    }
    
    boolean i(final e e) {
        final i j = this.j(e);
        boolean b;
        if (j == null) {
            b = true;
        }
        else {
            this.C(j);
            b = false;
        }
        if (this.e.d() == 0) {
            this.f = true;
        }
        return b;
    }
    
    @Override
    public boolean isEmpty() {
        return this.a == null && this.b == 0.0f && this.e.d() == 0;
    }
    
    i j(final e e) {
        final int d = this.e.d();
        i i = null;
        i j = null;
        int k = 0;
        int n = 0;
        int n2 = 0;
        float n3 = 0.0f;
        float n4 = 0.0f;
        while (k < d) {
            final float m = this.e.m(k);
            final i l = this.e.j(k);
            i i2;
            i i3;
            int z;
            int z2;
            float n5;
            float n6;
            if (l.P == androidx.constraintlayout.core.i.b.G) {
                if (i != null && n3 <= m) {
                    i2 = i;
                    i3 = j;
                    z = n;
                    z2 = n2;
                    n5 = n3;
                    n6 = n4;
                    if (n == 0) {
                        i2 = i;
                        i3 = j;
                        z = n;
                        z2 = n2;
                        n5 = n3;
                        n6 = n4;
                        if (this.z(l, e)) {
                            z = 1;
                            i2 = l;
                            i3 = j;
                            z2 = n2;
                            n5 = m;
                            n6 = n4;
                        }
                    }
                }
                else {
                    z = (this.z(l, e) ? 1 : 0);
                    i2 = l;
                    i3 = j;
                    z2 = n2;
                    n5 = m;
                    n6 = n4;
                }
            }
            else {
                i2 = i;
                i3 = j;
                z = n;
                z2 = n2;
                n5 = n3;
                n6 = n4;
                if (i == null) {
                    i2 = i;
                    i3 = j;
                    z = n;
                    z2 = n2;
                    n5 = n3;
                    n6 = n4;
                    if (m < 0.0f) {
                        if (j != null && n4 <= m) {
                            i2 = i;
                            i3 = j;
                            z = n;
                            z2 = n2;
                            n5 = n3;
                            n6 = n4;
                            if (n2 == 0) {
                                i2 = i;
                                i3 = j;
                                z = n;
                                z2 = n2;
                                n5 = n3;
                                n6 = n4;
                                if (this.z(l, e)) {
                                    z2 = 1;
                                    n6 = m;
                                    n5 = n3;
                                    z = n;
                                    i3 = l;
                                    i2 = i;
                                }
                            }
                        }
                        else {
                            z2 = (this.z(l, e) ? 1 : 0);
                            i2 = i;
                            i3 = l;
                            z = n;
                            n5 = n3;
                            n6 = m;
                        }
                    }
                }
            }
            ++k;
            i = i2;
            j = i3;
            n = z;
            n2 = z2;
            n3 = n5;
            n4 = n6;
        }
        if (i != null) {
            return i;
        }
        return j;
    }
    
    b k(final i i, final i j, int n, float b, final i k, final i l, final int n2) {
        if (j == k) {
            this.e.i(i, 1.0f);
            this.e.i(l, 1.0f);
            this.e.i(j, -2.0f);
            return this;
        }
        Label_0155: {
            if (b == 0.5f) {
                this.e.i(i, 1.0f);
                this.e.i(j, -1.0f);
                this.e.i(k, -1.0f);
                this.e.i(l, 1.0f);
                if (n <= 0 && n2 <= 0) {
                    return this;
                }
                n = -n + n2;
            }
            else {
                if (b <= 0.0f) {
                    this.e.i(i, -1.0f);
                    this.e.i(j, 1.0f);
                    b = (float)n;
                    break Label_0155;
                }
                if (b >= 1.0f) {
                    this.e.i(l, -1.0f);
                    this.e.i(k, 1.0f);
                    n = -n2;
                }
                else {
                    final a e = this.e;
                    final float n3 = 1.0f - b;
                    e.i(i, n3 * 1.0f);
                    this.e.i(j, n3 * -1.0f);
                    this.e.i(k, -1.0f * b);
                    this.e.i(l, 1.0f * b);
                    if (n > 0 || n2 > 0) {
                        b = -n * n3 + n2 * b;
                        break Label_0155;
                    }
                    return this;
                }
            }
            b = (float)n;
        }
        this.b = b;
        return this;
    }
    
    b l(final i a, final int n) {
        this.a = a;
        final float n2 = (float)n;
        a.L = n2;
        this.b = n2;
        this.f = true;
        return this;
    }
    
    b m(final i i, final i j, final float n) {
        this.e.i(i, -1.0f);
        this.e.i(j, n);
        return this;
    }
    
    public b n(final i i, final i j, final i k, final i l, final float n) {
        this.e.i(i, -1.0f);
        this.e.i(j, 1.0f);
        this.e.i(k, n);
        this.e.i(l, -n);
        return this;
    }
    
    public b o(float n, final float n2, final float n3, final i i, final int n4, final i j, final int n5, final i k, final int n6, final i l, final int n7) {
        if (n2 != 0.0f && n != n3) {
            n = n / n2 / (n3 / n2);
            this.b = -n4 - n5 + n6 * n + n7 * n;
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
            this.e.i(l, n);
            this.e.i(k, -n);
        }
        else {
            this.b = (float)(-n4 - n5 + n6 + n7);
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
            this.e.i(l, 1.0f);
            this.e.i(k, -1.0f);
        }
        return this;
    }
    
    public b p(float n, final float n2, final float n3, final i i, final i j, final i k, final i l) {
        this.b = 0.0f;
        if (n2 != 0.0f && n != n3) {
            if (n == 0.0f) {
                this.e.i(i, 1.0f);
                this.e.i(j, -1.0f);
            }
            else if (n3 == 0.0f) {
                this.e.i(k, 1.0f);
                this.e.i(l, -1.0f);
            }
            else {
                n = n / n2 / (n3 / n2);
                this.e.i(i, 1.0f);
                this.e.i(j, -1.0f);
                this.e.i(l, n);
                this.e.i(k, -n);
            }
        }
        else {
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
            this.e.i(l, 1.0f);
            this.e.i(k, -1.0f);
        }
        return this;
    }
    
    public b q(final i i, final int n) {
        a a;
        float n2;
        if (n < 0) {
            this.b = (float)(n * -1);
            a = this.e;
            n2 = 1.0f;
        }
        else {
            this.b = (float)n;
            a = this.e;
            n2 = -1.0f;
        }
        a.i(i, n2);
        return this;
    }
    
    public b r(final i i, final i j, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.e.i(i, -1.0f);
            this.e.i(j, 1.0f);
        }
        else {
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
        }
        return this;
    }
    
    public b s(final i i, final int n, final i j) {
        this.b = (float)n;
        this.e.i(i, -1.0f);
        return this;
    }
    
    public b t(final i i, final i j, final i k, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.e.i(i, -1.0f);
            this.e.i(j, 1.0f);
            this.e.i(k, 1.0f);
        }
        else {
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
            this.e.i(k, -1.0f);
        }
        return this;
    }
    
    @Override
    public String toString() {
        return this.F();
    }
    
    public b u(final i i, final i j, final i k, final int n) {
        int n2 = 0;
        final int n3 = 0;
        if (n != 0) {
            n2 = n3;
            int n4;
            if ((n4 = n) < 0) {
                n4 = n * -1;
                n2 = 1;
            }
            this.b = (float)n4;
        }
        if (n2 == 0) {
            this.e.i(i, -1.0f);
            this.e.i(j, 1.0f);
            this.e.i(k, -1.0f);
        }
        else {
            this.e.i(i, 1.0f);
            this.e.i(j, -1.0f);
            this.e.i(k, 1.0f);
        }
        return this;
    }
    
    public b v(final i i, final i j, final i k, final i l, final float n) {
        this.e.i(k, 0.5f);
        this.e.i(l, 0.5f);
        this.e.i(i, -0.5f);
        this.e.i(j, -0.5f);
        this.b = -n;
        return this;
    }
    
    void w() {
        final float b = this.b;
        if (b < 0.0f) {
            this.b = b * -1.0f;
            this.e.l();
        }
    }
    
    boolean x() {
        final i a = this.a;
        return a != null && (a.P == androidx.constraintlayout.core.i.b.G || this.b >= 0.0f);
    }
    
    boolean y(final i i) {
        return this.e.g(i);
    }
    
    public interface a
    {
        void clear();
        
        int d();
        
        int e(final i p0);
        
        void f();
        
        boolean g(final i p0);
        
        float h(final b p0, final boolean p1);
        
        void i(final i p0, final float p1);
        
        i j(final int p0);
        
        void k(final i p0, final float p1, final boolean p2);
        
        void l();
        
        float m(final int p0);
        
        float n(final i p0, final boolean p1);
        
        float o(final i p0);
        
        int p();
        
        void q(final float p0);
    }
}
