// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.annotation.SuppressLint;
import java.util.List;
import android.os.Parcelable;
import androidx.annotation.t0;
import java.util.Arrays;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PointF;
import androidx.annotation.k0;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import java.util.ArrayList;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import android.graphics.Rect;
import java.util.BitSet;

public class StaggeredGridLayoutManager extends p implements c0.b
{
    private static final String Q = "StaggeredGridLManager";
    static final boolean R = false;
    public static final int S = 0;
    public static final int T = 1;
    public static final int U = 0;
    @Deprecated
    public static final int V = 1;
    public static final int W = 2;
    static final int X = Integer.MIN_VALUE;
    private static final float Y = 0.33333334f;
    boolean A;
    private BitSet B;
    int C;
    int D;
    d E;
    private int F;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private final Rect K;
    private final b L;
    private boolean M;
    private boolean N;
    private int[] O;
    private final Runnable P;
    private int s;
    f[] t;
    @j0
    androidx.recyclerview.widget.z u;
    @j0
    androidx.recyclerview.widget.z v;
    private int w;
    private int x;
    @j0
    private final androidx.recyclerview.widget.r y;
    boolean z;
    
    public StaggeredGridLayoutManager(final int n, final int w) {
        this.s = -1;
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.E = new d();
        this.F = 2;
        this.K = new Rect();
        this.L = new b();
        this.M = false;
        this.N = true;
        this.P = new Runnable() {
            @Override
            public void run() {
                StaggeredGridLayoutManager.this.q2();
            }
        };
        this.w = w;
        this.r3(n);
        this.y = new androidx.recyclerview.widget.r();
        this.y2();
    }
    
    public StaggeredGridLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        this.s = -1;
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.E = new d();
        this.F = 2;
        this.K = new Rect();
        this.L = new b();
        this.M = false;
        this.N = true;
        this.P = new Runnable() {
            @Override
            public void run() {
                StaggeredGridLayoutManager.this.q2();
            }
        };
        final p.d t0 = RecyclerView.p.t0(context, set, n, n2);
        this.p3(t0.a);
        this.r3(t0.b);
        this.q3(t0.c);
        this.y = new androidx.recyclerview.widget.r();
        this.y2();
    }
    
    private int B2(final int n) {
        for (int q = ((RecyclerView.p)this).Q(), i = 0; i < q; ++i) {
            final int s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(i));
            if (s0 >= 0 && s0 < n) {
                return s0;
            }
        }
        return 0;
    }
    
    private int H2(final int n) {
        for (int i = ((RecyclerView.p)this).Q() - 1; i >= 0; --i) {
            final int s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(i));
            if (s0 >= 0 && s0 < n) {
                return s0;
            }
        }
        return 0;
    }
    
    private void J2(final x x, final d0 d0, final boolean b) {
        final int o2 = this.O2(Integer.MIN_VALUE);
        if (o2 == Integer.MIN_VALUE) {
            return;
        }
        final int n = this.u.i() - o2;
        if (n > 0) {
            final int n2 = n - -this.l3(-n, x, d0);
            if (b && n2 > 0) {
                this.u.t(n2);
            }
        }
    }
    
    private void K2(final x x, final d0 d0, final boolean b) {
        final int r2 = this.R2(Integer.MAX_VALUE);
        if (r2 == Integer.MAX_VALUE) {
            return;
        }
        final int n = r2 - this.u.n();
        if (n > 0) {
            final int n2 = n - this.l3(n, x, d0);
            if (b && n2 > 0) {
                this.u.t(-n2);
            }
        }
    }
    
    private int O2(final int n) {
        int q = this.t[0].q(n);
        int n2;
        for (int i = 1; i < this.s; ++i, q = n2) {
            final int q2 = this.t[i].q(n);
            if (q2 > (n2 = q)) {
                n2 = q2;
            }
        }
        return q;
    }
    
    private int P2(final int n) {
        int u = this.t[0].u(n);
        int n2;
        for (int i = 1; i < this.s; ++i, u = n2) {
            final int u2 = this.t[i].u(n);
            if (u2 > (n2 = u)) {
                n2 = u2;
            }
        }
        return u;
    }
    
    private int Q2(final int n) {
        int q = this.t[0].q(n);
        int n2;
        for (int i = 1; i < this.s; ++i, q = n2) {
            final int q2 = this.t[i].q(n);
            if (q2 < (n2 = q)) {
                n2 = q2;
            }
        }
        return q;
    }
    
    private int R2(final int n) {
        int u = this.t[0].u(n);
        int n2;
        for (int i = 1; i < this.s; ++i, u = n2) {
            final int u2 = this.t[i].u(n);
            if (u2 < (n2 = u)) {
                n2 = u2;
            }
        }
        return u;
    }
    
    private f S2(final androidx.recyclerview.widget.r r) {
        final boolean d3 = this.d3(r.e);
        int s = -1;
        int i;
        int n;
        if (d3) {
            i = this.s - 1;
            n = -1;
        }
        else {
            i = 0;
            s = this.s;
            n = 1;
        }
        final int e = r.e;
        final f f = null;
        f f2 = null;
        if (e == 1) {
            int n2 = Integer.MAX_VALUE;
            final int n3 = this.u.n();
            int n4;
            for (int j = i; j != s; j += n, n2 = n4) {
                final f f3 = this.t[j];
                final int q = f3.q(n3);
                if (q < (n4 = n2)) {
                    f2 = f3;
                    n4 = q;
                }
            }
            return f2;
        }
        int n5 = Integer.MIN_VALUE;
        final int k = this.u.i();
        f f4 = f;
        while (i != s) {
            final f f5 = this.t[i];
            final int u = f5.u(k);
            int n6;
            if (u > (n6 = n5)) {
                f4 = f5;
                n6 = u;
            }
            i += n;
            n5 = n6;
        }
        return f4;
    }
    
    private void W2(int n, final int n2, final int n3) {
        int n4;
        if (this.A) {
            n4 = this.N2();
        }
        else {
            n4 = this.L2();
        }
        int n5 = 0;
        int n6 = 0;
        Label_0060: {
            if (n3 == 8) {
                if (n >= n2) {
                    n5 = n + 1;
                    n6 = n2;
                    break Label_0060;
                }
                n5 = n2 + 1;
            }
            else {
                n5 = n + n2;
            }
            n6 = n;
        }
        this.E.h(n6);
        if (n3 != 1) {
            if (n3 != 2) {
                if (n3 == 8) {
                    this.E.k(n, 1);
                    this.E.j(n2, 1);
                }
            }
            else {
                this.E.k(n, n2);
            }
        }
        else {
            this.E.j(n, n2);
        }
        if (n5 <= n4) {
            return;
        }
        if (this.A) {
            n = this.L2();
        }
        else {
            n = this.N2();
        }
        if (n6 <= n) {
            ((RecyclerView.p)this).N1();
        }
    }
    
    private void a3(final View view, int z3, int z4, final boolean b) {
        ((RecyclerView.p)this).m(view, this.K);
        final c c = (c)view.getLayoutParams();
        final int leftMargin = c.leftMargin;
        final Rect k = this.K;
        z3 = this.z3(z3, leftMargin + k.left, c.rightMargin + k.right);
        final int topMargin = c.topMargin;
        final Rect i = this.K;
        z4 = this.z3(z4, topMargin + i.top, c.bottomMargin + i.bottom);
        boolean b2;
        if (b) {
            b2 = ((RecyclerView.p)this).e2(view, z3, z4, c);
        }
        else {
            b2 = ((RecyclerView.p)this).c2(view, z3, z4, c);
        }
        if (b2) {
            view.measure(z3, z4);
        }
    }
    
    private void b3(final View view, final c c, final boolean b) {
        int r = 0;
        int r2 = 0;
        Label_0173: {
            int n;
            if (c.f) {
                if (this.w != 1) {
                    this.a3(view, RecyclerView.p.R(((RecyclerView.p)this).z0(), ((RecyclerView.p)this).A0(), ((RecyclerView.p)this).o0() + ((RecyclerView.p)this).p0(), c.width, true), this.J, b);
                    return;
                }
                n = this.J;
            }
            else {
                if (this.w != 1) {
                    r = RecyclerView.p.R(((RecyclerView.p)this).z0(), ((RecyclerView.p)this).A0(), ((RecyclerView.p)this).o0() + ((RecyclerView.p)this).p0(), c.width, true);
                    r2 = RecyclerView.p.R(this.x, ((RecyclerView.p)this).f0(), 0, c.height, false);
                    break Label_0173;
                }
                n = RecyclerView.p.R(this.x, ((RecyclerView.p)this).A0(), 0, c.width, false);
            }
            final int r3 = RecyclerView.p.R(((RecyclerView.p)this).e0(), ((RecyclerView.p)this).f0(), ((RecyclerView.p)this).r0() + ((RecyclerView.p)this).m0(), c.height, true);
            r = n;
            r2 = r3;
        }
        this.a3(view, r, r2, b);
    }
    
    private void c3(final x x, final d0 d0, final boolean b) {
        final b l = this.L;
        if ((this.I != null || this.C != -1) && d0.d() == 0) {
            ((RecyclerView.p)this).D1(x);
            l.c();
            return;
        }
        final boolean e = l.e;
        final int n = 1;
        final boolean b2 = !e || this.C != -1 || this.I != null;
        if (b2) {
            l.c();
            if (this.I != null) {
                this.l2(l);
            }
            else {
                this.k3();
                l.c = this.A;
            }
            this.v3(d0, l);
            l.e = true;
        }
        if (this.I == null && this.C == -1 && (l.c != this.G || this.Z2() != this.H)) {
            this.E.b();
            l.d = true;
        }
        if (((RecyclerView.p)this).Q() > 0) {
            final e i = this.I;
            if (i == null || i.I < 1) {
                if (l.d) {
                    for (int j = 0; j < this.s; ++j) {
                        this.t[j].e();
                        final int b3 = l.b;
                        if (b3 != Integer.MIN_VALUE) {
                            this.t[j].A(b3);
                        }
                    }
                }
                else if (!b2 && this.L.f != null) {
                    for (int k = 0; k < this.s; ++k) {
                        final f f = this.t[k];
                        f.e();
                        f.A(this.L.f[k]);
                    }
                }
                else {
                    for (int n2 = 0; n2 < this.s; ++n2) {
                        this.t[n2].b(this.A, l.b);
                    }
                    this.L.d(this.t);
                }
            }
        }
        ((RecyclerView.p)this).z(x);
        this.y.a = false;
        this.M = false;
        this.x3(this.v.o());
        this.w3(l.a, d0);
        if (l.c) {
            this.o3(-1);
            this.z2(x, this.y, d0);
            this.o3(1);
        }
        else {
            this.o3(1);
            this.z2(x, this.y, d0);
            this.o3(-1);
        }
        final androidx.recyclerview.widget.r y = this.y;
        y.c = l.a + y.d;
        this.z2(x, y, d0);
        this.j3();
        if (((RecyclerView.p)this).Q() > 0) {
            if (this.A) {
                this.J2(x, d0, true);
                this.K2(x, d0, false);
            }
            else {
                this.K2(x, d0, true);
                this.J2(x, d0, false);
            }
        }
        int n3 = 0;
        Label_0637: {
            if (b && !d0.j() && (this.F != 0 && ((RecyclerView.p)this).Q() > 0 && (this.M || this.X2() != null))) {
                ((RecyclerView.p)this).H1(this.P);
                if (this.q2()) {
                    n3 = n;
                    break Label_0637;
                }
            }
            n3 = 0;
        }
        if (d0.j()) {
            this.L.c();
        }
        this.G = l.c;
        this.H = this.Z2();
        if (n3 != 0) {
            this.L.c();
            this.c3(x, d0, false);
        }
    }
    
    private boolean d3(final int n) {
        final int w = this.w;
        final boolean b = true;
        final boolean b2 = true;
        if (w == 0) {
            return n == -1 != this.A && b2;
        }
        return n == -1 == this.A == this.Z2() && b;
    }
    
    private void f3(final View view) {
        for (int i = this.s - 1; i >= 0; --i) {
            this.t[i].z(view);
        }
    }
    
    private void g3(final x x, final androidx.recyclerview.widget.r r) {
        if (r.a) {
            if (!r.i) {
                int f2 = 0;
                Label_0051: {
                    Label_0046: {
                        int g = 0;
                        Label_0037: {
                            if (r.b == 0) {
                                if (r.e != -1) {
                                    break Label_0046;
                                }
                            }
                            else if (r.e == -1) {
                                final int f = r.f;
                                final int a = f - this.P2(f);
                                if (a >= 0) {
                                    g = r.g - Math.min(a, r.b);
                                    break Label_0037;
                                }
                            }
                            else {
                                final int a2 = this.Q2(r.g) - r.g;
                                if (a2 < 0) {
                                    break Label_0046;
                                }
                                f2 = Math.min(a2, r.b) + r.f;
                                break Label_0051;
                            }
                            g = r.g;
                        }
                        this.h3(x, g);
                        return;
                    }
                    f2 = r.f;
                }
                this.i3(x, f2);
            }
        }
    }
    
    private void h3(final x x, final int n) {
        for (int i = ((RecyclerView.p)this).Q() - 1; i >= 0; --i) {
            final View p2 = ((RecyclerView.p)this).P(i);
            if (this.u.g(p2) < n || this.u.r(p2) < n) {
                break;
            }
            final c c = (c)p2.getLayoutParams();
            if (c.f) {
                final int n2 = 0;
                int n3 = 0;
                int j;
                while (true) {
                    j = n2;
                    if (n3 >= this.s) {
                        break;
                    }
                    if (this.t[n3].a.size() == 1) {
                        return;
                    }
                    ++n3;
                }
                while (j < this.s) {
                    this.t[j].x();
                    ++j;
                }
            }
            else {
                if (c.e.a.size() == 1) {
                    return;
                }
                c.e.x();
            }
            ((RecyclerView.p)this).F1(p2, x);
        }
    }
    
    private void i3(final x x, final int n) {
        while (((RecyclerView.p)this).Q() > 0) {
            final int n2 = 0;
            final View p2 = ((RecyclerView.p)this).P(0);
            if (this.u.d(p2) > n || this.u.q(p2) > n) {
                break;
            }
            final c c = (c)p2.getLayoutParams();
            if (c.f) {
                int n3 = 0;
                int i;
                while (true) {
                    i = n2;
                    if (n3 >= this.s) {
                        break;
                    }
                    if (this.t[n3].a.size() == 1) {
                        return;
                    }
                    ++n3;
                }
                while (i < this.s) {
                    this.t[i].y();
                    ++i;
                }
            }
            else {
                if (c.e.a.size() == 1) {
                    return;
                }
                c.e.y();
            }
            ((RecyclerView.p)this).F1(p2, x);
        }
    }
    
    private void j3() {
        if (this.v.l() == 1073741824) {
            return;
        }
        float max = 0.0f;
        final int q = ((RecyclerView.p)this).Q();
        final int n = 0;
        for (int i = 0; i < q; ++i) {
            final View p = ((RecyclerView.p)this).P(i);
            final float n2 = (float)this.v.e(p);
            if (n2 >= max) {
                float b = n2;
                if (((c)p.getLayoutParams()).k()) {
                    b = n2 * 1.0f / this.s;
                }
                max = Math.max(max, b);
            }
        }
        final int x = this.x;
        int a = Math.round(max * this.s);
        if (this.v.l() == Integer.MIN_VALUE) {
            a = Math.min(a, this.v.o());
        }
        this.x3(a);
        int j = n;
        if (this.x == x) {
            return;
        }
        while (j < q) {
            final View p2 = ((RecyclerView.p)this).P(j);
            final c c = (c)p2.getLayoutParams();
            if (!c.f) {
                if (this.Z2() && this.w == 1) {
                    final int s = this.s;
                    final int e = c.e.e;
                    p2.offsetLeftAndRight(-(s - 1 - e) * this.x - -(s - 1 - e) * x);
                }
                else {
                    final int e2 = c.e.e;
                    final int x2 = this.x;
                    final int w = this.w;
                    final int n3 = x2 * e2 - e2 * x;
                    if (w == 1) {
                        p2.offsetLeftAndRight(n3);
                    }
                    else {
                        p2.offsetTopAndBottom(n3);
                    }
                }
            }
            ++j;
        }
    }
    
    private void k2(final View view) {
        for (int i = this.s - 1; i >= 0; --i) {
            this.t[i].a(view);
        }
    }
    
    private void k3() {
        boolean z;
        if (this.w != 1 && this.Z2()) {
            z = (this.z ^ true);
        }
        else {
            z = this.z;
        }
        this.A = z;
    }
    
    private void l2(final b b) {
        final e i = this.I;
        final int j = i.I;
        if (j > 0) {
            if (j == this.s) {
                for (int k = 0; k < this.s; ++k) {
                    this.t[k].e();
                    final e l = this.I;
                    final int n = l.J[k];
                    int n2;
                    if ((n2 = n) != Integer.MIN_VALUE) {
                        int n3;
                        if (l.O) {
                            n3 = this.u.i();
                        }
                        else {
                            n3 = this.u.n();
                        }
                        n2 = n + n3;
                    }
                    this.t[k].A(n2);
                }
            }
            else {
                i.b();
                final e m = this.I;
                m.G = m.H;
            }
        }
        final e i2 = this.I;
        this.H = i2.P;
        this.q3(i2.N);
        this.k3();
        final e i3 = this.I;
        final int g = i3.G;
        boolean c;
        if (g != -1) {
            this.C = g;
            c = i3.O;
        }
        else {
            c = this.A;
        }
        b.c = c;
        if (i3.K > 1) {
            final d e = this.E;
            e.a = i3.L;
            e.b = i3.M;
        }
    }
    
    private void o2(final View view, final c c, final androidx.recyclerview.widget.r r) {
        if (r.e == 1) {
            if (c.f) {
                this.k2(view);
            }
            else {
                c.e.a(view);
            }
        }
        else if (c.f) {
            this.f3(view);
        }
        else {
            c.e.z(view);
        }
    }
    
    private void o3(int n) {
        final androidx.recyclerview.widget.r y = this.y;
        y.e = n;
        final boolean a = this.A;
        final int n2 = 1;
        if (a == (n == -1)) {
            n = n2;
        }
        else {
            n = -1;
        }
        y.d = n;
    }
    
    private int p2(final int n) {
        final int q = ((RecyclerView.p)this).Q();
        int n2 = -1;
        if (q == 0) {
            if (this.A) {
                n2 = 1;
            }
            return n2;
        }
        if (n < this.L2() == this.A) {
            n2 = 1;
        }
        return n2;
    }
    
    private boolean r2(final f f) {
        if (this.A) {
            if (f.p() < this.u.i()) {
                final ArrayList<View> a = f.a;
                return f.s(a.get(a.size() - 1)).f ^ true;
            }
        }
        else if (f.t() > this.u.n()) {
            return f.s(f.a.get(0)).f ^ true;
        }
        return false;
    }
    
    private int s2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        return c0.a(d0, this.u, this.D2(this.N ^ true), this.C2(this.N ^ true), this, this.N);
    }
    
    private void s3(final int n, final int n2) {
        for (int i = 0; i < this.s; ++i) {
            if (!this.t[i].a.isEmpty()) {
                this.y3(this.t[i], n, n2);
            }
        }
    }
    
    private int t2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        return c0.b(d0, this.u, this.D2(this.N ^ true), this.C2(this.N ^ true), this, this.N, this.A);
    }
    
    private boolean t3(final d0 d0, final b b) {
        final boolean g = this.G;
        final int d2 = d0.d();
        int a;
        if (g) {
            a = this.H2(d2);
        }
        else {
            a = this.B2(d2);
        }
        b.a = a;
        b.b = Integer.MIN_VALUE;
        return true;
    }
    
    private int u2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        return c0.c(d0, this.u, this.D2(this.N ^ true), this.C2(this.N ^ true), this, this.N);
    }
    
    private int v2(int n) {
        int n2 = -1;
        final int n3 = 1;
        final int n4 = 1;
        if (n != 1) {
            if (n != 2) {
                if (n == 17) {
                    if (this.w != 0) {
                        n2 = Integer.MIN_VALUE;
                    }
                    return n2;
                }
                if (n == 33) {
                    if (this.w != 1) {
                        n2 = Integer.MIN_VALUE;
                    }
                    return n2;
                }
                if (n == 66) {
                    if (this.w == 0) {
                        n = n3;
                    }
                    else {
                        n = Integer.MIN_VALUE;
                    }
                    return n;
                }
                if (n != 130) {
                    return Integer.MIN_VALUE;
                }
                if (this.w == 1) {
                    n = n4;
                }
                else {
                    n = Integer.MIN_VALUE;
                }
                return n;
            }
            else {
                if (this.w == 1) {
                    return 1;
                }
                if (this.Z2()) {
                    return -1;
                }
                return 1;
            }
        }
        else {
            if (this.w == 1) {
                return -1;
            }
            if (this.Z2()) {
                return 1;
            }
            return -1;
        }
    }
    
    private a w2(final int n) {
        final a a = new a();
        a.I = new int[this.s];
        for (int i = 0; i < this.s; ++i) {
            a.I[i] = n - this.t[i].q(n);
        }
        return a;
    }
    
    private void w3(int o, final d0 d0) {
        final androidx.recyclerview.widget.r y = this.y;
        final boolean b = false;
        y.b = 0;
        y.c = o;
        int o2 = 0;
        Label_0095: {
            Label_0092: {
                if (((RecyclerView.p)this).M0()) {
                    final int g = d0.g();
                    if (g != -1) {
                        if (this.A == g < o) {
                            o = this.u.o();
                            break Label_0092;
                        }
                        o2 = this.u.o();
                        o = 0;
                        break Label_0095;
                    }
                }
                o = 0;
            }
            o2 = 0;
        }
        if (((RecyclerView.p)this).U()) {
            this.y.f = this.u.n() - o2;
            this.y.g = this.u.i() + o;
        }
        else {
            this.y.g = this.u.h() + o;
            this.y.f = -o2;
        }
        final androidx.recyclerview.widget.r y2 = this.y;
        y2.h = false;
        y2.a = true;
        boolean i = b;
        if (this.u.l() == 0) {
            i = b;
            if (this.u.h() == 0) {
                i = true;
            }
        }
        y2.i = i;
    }
    
    private a x2(final int n) {
        final a a = new a();
        a.I = new int[this.s];
        for (int i = 0; i < this.s; ++i) {
            a.I[i] = this.t[i].u(n) - n;
        }
        return a;
    }
    
    private void y2() {
        this.u = androidx.recyclerview.widget.z.b(this, this.w);
        this.v = androidx.recyclerview.widget.z.b(this, 1 - this.w);
    }
    
    private void y3(final f f, final int n, final int n2) {
        final int o = f.o();
        if (n == -1) {
            if (f.t() + o > n2) {
                return;
            }
        }
        else if (f.p() - o < n2) {
            return;
        }
        this.B.set(f.e, false);
    }
    
    private int z2(final x x, final androidx.recyclerview.widget.r r, final d0 d0) {
        this.B.set(0, this.s, true);
        int n;
        if (this.y.i) {
            if (r.e == 1) {
                n = Integer.MAX_VALUE;
            }
            else {
                n = Integer.MIN_VALUE;
            }
        }
        else {
            int n2;
            if (r.e == 1) {
                n2 = r.g + r.b;
            }
            else {
                n2 = r.f - r.b;
            }
            n = n2;
        }
        this.s3(r.e, n);
        int n3;
        if (this.A) {
            n3 = this.u.i();
        }
        else {
            n3 = this.u.n();
        }
        boolean b = false;
        while (r.a(d0) && (this.y.i || !this.B.isEmpty())) {
            final View b2 = r.b(x);
            final c c = (c)b2.getLayoutParams();
            final int d2 = ((RecyclerView.q)c).d();
            final int g = this.E.g(d2);
            final boolean b3 = g == -1;
            f s2;
            if (b3) {
                if (c.f) {
                    s2 = this.t[0];
                }
                else {
                    s2 = this.S2(r);
                }
                this.E.n(d2, s2);
            }
            else {
                s2 = this.t[g];
            }
            c.e = s2;
            if (r.e == 1) {
                ((RecyclerView.p)this).e(b2);
            }
            else {
                ((RecyclerView.p)this).f(b2, 0);
            }
            this.b3(b2, c, false);
            int n6;
            int n7;
            if (r.e == 1) {
                int n4;
                if (c.f) {
                    n4 = this.O2(n3);
                }
                else {
                    n4 = s2.q(n3);
                }
                final int e = this.u.e(b2);
                if (b3 && c.f) {
                    final a w2 = this.w2(n4);
                    w2.H = -1;
                    w2.G = d2;
                    this.E.a(w2);
                }
                final int n5 = e + n4;
                n6 = n4;
                n7 = n5;
            }
            else {
                if (c.f) {
                    n7 = this.R2(n3);
                }
                else {
                    n7 = s2.u(n3);
                }
                n6 = n7 - this.u.e(b2);
                if (b3 && c.f) {
                    final a x2 = this.x2(n7);
                    x2.H = 1;
                    x2.G = d2;
                    this.E.a(x2);
                }
            }
            Label_0572: {
                if (c.f && r.d == -1) {
                    if (!b3) {
                        boolean b4;
                        if (r.e == 1) {
                            b4 = this.m2();
                        }
                        else {
                            b4 = this.n2();
                        }
                        if (!(b4 ^ true)) {
                            break Label_0572;
                        }
                        final a f = this.E.f(d2);
                        if (f != null) {
                            f.J = true;
                        }
                    }
                    this.M = true;
                }
            }
            this.o2(b2, c, r);
            int n8;
            int n9;
            if (this.Z2() && this.w == 1) {
                int i;
                if (c.f) {
                    i = this.v.i();
                }
                else {
                    i = this.v.i() - (this.s - 1 - s2.e) * this.x;
                }
                final int e2 = this.v.e(b2);
                n8 = i;
                n9 = i - e2;
            }
            else {
                int n10;
                if (c.f) {
                    n10 = this.v.n();
                }
                else {
                    n10 = s2.e * this.x + this.v.n();
                }
                final int e3 = this.v.e(b2);
                final int n11 = n10;
                n8 = e3 + n10;
                n9 = n11;
            }
            if (this.w == 1) {
                final int n12 = n6;
                n6 = n9;
                n9 = n12;
            }
            else {
                final int n13 = n7;
                n7 = n8;
                n8 = n13;
            }
            ((RecyclerView.p)this).P0(b2, n6, n9, n8, n7);
            if (c.f) {
                this.s3(this.y.e, n);
            }
            else {
                this.y3(s2, this.y.e, n);
            }
            this.g3(x, this.y);
            if (this.y.h && b2.hasFocusable()) {
                if (c.f) {
                    this.B.clear();
                }
                else {
                    this.B.set(s2.e, false);
                }
            }
            b = true;
        }
        if (!b) {
            this.g3(x, this.y);
        }
        int b5;
        if (this.y.e == -1) {
            b5 = this.u.n() - this.R2(this.u.n());
        }
        else {
            b5 = this.O2(this.u.i()) - this.u.i();
        }
        int min;
        if (b5 > 0) {
            min = Math.min(r.b, b5);
        }
        else {
            min = 0;
        }
        return min;
    }
    
    private int z3(final int n, final int n2, final int n3) {
        if (n2 == 0 && n3 == 0) {
            return n;
        }
        final int mode = View$MeasureSpec.getMode(n);
        if (mode != Integer.MIN_VALUE && mode != 1073741824) {
            return n;
        }
        return View$MeasureSpec.makeMeasureSpec(Math.max(0, View$MeasureSpec.getSize(n) - n2 - n3), mode);
    }
    
    public int[] A2(int[] array) {
        if (array == null) {
            array = new int[this.s];
        }
        else if (array.length < this.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; ++i) {
            array[i] = this.t[i].f();
        }
        return array;
    }
    
    View C2(final boolean b) {
        final int n = this.u.n();
        final int i = this.u.i();
        int j = ((RecyclerView.p)this).Q() - 1;
        View view = null;
        while (j >= 0) {
            final View p = ((RecyclerView.p)this).P(j);
            final int g = this.u.g(p);
            final int d = this.u.d(p);
            View view2 = view;
            if (d > n) {
                if (g >= i) {
                    view2 = view;
                }
                else {
                    if (d <= i || !b) {
                        return p;
                    }
                    if ((view2 = view) == null) {
                        view2 = p;
                    }
                }
            }
            --j;
            view = view2;
        }
        return view;
    }
    
    View D2(final boolean b) {
        final int n = this.u.n();
        final int i = this.u.i();
        final int q = ((RecyclerView.p)this).Q();
        View view = null;
        View view2;
        for (int j = 0; j < q; ++j, view = view2) {
            final View p = ((RecyclerView.p)this).P(j);
            final int g = this.u.g(p);
            view2 = view;
            if (this.u.d(p) > n) {
                if (g >= i) {
                    view2 = view;
                }
                else {
                    if (g >= n || !b) {
                        return p;
                    }
                    if ((view2 = view) == null) {
                        view2 = p;
                    }
                }
            }
        }
        return view;
    }
    
    int E2() {
        View view;
        if (this.A) {
            view = this.C2(true);
        }
        else {
            view = this.D2(true);
        }
        int s0;
        if (view == null) {
            s0 = -1;
        }
        else {
            s0 = ((RecyclerView.p)this).s0(view);
        }
        return s0;
    }
    
    @Override
    public boolean F0() {
        return this.F != 0;
    }
    
    public int[] F2(int[] array) {
        if (array == null) {
            array = new int[this.s];
        }
        else if (array.length < this.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; ++i) {
            array[i] = this.t[i].h();
        }
        return array;
    }
    
    public int[] G2(int[] array) {
        if (array == null) {
            array = new int[this.s];
        }
        else if (array.length < this.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; ++i) {
            array[i] = this.t[i].i();
        }
        return array;
    }
    
    public int[] I2(int[] array) {
        if (array == null) {
            array = new int[this.s];
        }
        else if (array.length < this.s) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Provided int[]'s size must be more than or equal to span count. Expected:");
            sb.append(this.s);
            sb.append(", array size:");
            sb.append(array.length);
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < this.s; ++i) {
            array[i] = this.t[i].k();
        }
        return array;
    }
    
    @Override
    public q K() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }
    
    @Override
    public q L(final Context context, final AttributeSet set) {
        return new c(context, set);
    }
    
    int L2() {
        final int q = ((RecyclerView.p)this).Q();
        int s0 = 0;
        if (q != 0) {
            s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0));
        }
        return s0;
    }
    
    @Override
    public q M(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new c((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new c(viewGroup$LayoutParams);
    }
    
    public int M2() {
        return this.F;
    }
    
    int N2() {
        final int q = ((RecyclerView.p)this).Q();
        int s0;
        if (q == 0) {
            s0 = 0;
        }
        else {
            s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(q - 1));
        }
        return s0;
    }
    
    @Override
    public int Q1(final int n, final x x, final d0 d0) {
        return this.l3(n, x, d0);
    }
    
    @Override
    public void R1(final int c) {
        final e i = this.I;
        if (i != null && i.G != c) {
            i.a();
        }
        this.C = c;
        this.D = Integer.MIN_VALUE;
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public int S1(final int n, final x x, final d0 d0) {
        return this.l3(n, x, d0);
    }
    
    @Override
    public void T0(final int n) {
        super.T0(n);
        for (int i = 0; i < this.s; ++i) {
            this.t[i].w(n);
        }
    }
    
    public int T2() {
        return this.w;
    }
    
    @Override
    public void U0(final int n) {
        super.U0(n);
        for (int i = 0; i < this.s; ++i) {
            this.t[i].w(n);
        }
    }
    
    public boolean U2() {
        return this.z;
    }
    
    @Override
    public void V0(@k0 final h h, @k0 final h h2) {
        this.E.b();
        for (int i = 0; i < this.s; ++i) {
            this.t[i].e();
        }
    }
    
    public int V2() {
        return this.s;
    }
    
    View X2() {
        int n = ((RecyclerView.p)this).Q() - 1;
        final BitSet set = new BitSet(this.s);
        set.set(0, this.s, true);
        final int w = this.w;
        int n2 = -1;
        int n3;
        if (w == 1 && this.Z2()) {
            n3 = 1;
        }
        else {
            n3 = -1;
        }
        int n4;
        if (this.A) {
            n4 = -1;
        }
        else {
            n4 = n + 1;
            n = 0;
        }
        int i = n;
        if (n < n4) {
            n2 = 1;
            i = n;
        }
        while (i != n4) {
            final View p = ((RecyclerView.p)this).P(i);
            final c c = (c)p.getLayoutParams();
            if (set.get(c.e.e)) {
                if (this.r2(c.e)) {
                    return p;
                }
                set.clear(c.e.e);
            }
            if (!c.f) {
                final int n5 = i + n2;
                if (n5 != n4) {
                    final View p2 = ((RecyclerView.p)this).P(n5);
                    boolean b = false;
                    Label_0277: {
                        Label_0275: {
                            if (this.A) {
                                final int d = this.u.d(p);
                                final int d2 = this.u.d(p2);
                                if (d < d2) {
                                    return p;
                                }
                                if (d != d2) {
                                    break Label_0275;
                                }
                            }
                            else {
                                final int g = this.u.g(p);
                                final int g2 = this.u.g(p2);
                                if (g > g2) {
                                    return p;
                                }
                                if (g != g2) {
                                    break Label_0275;
                                }
                            }
                            b = true;
                            break Label_0277;
                        }
                        b = false;
                    }
                    if (b && c.e.e - ((c)p2.getLayoutParams()).e.e < 0 != n3 < 0) {
                        return p;
                    }
                }
            }
            i += n2;
        }
        return null;
    }
    
    @Override
    public void Y1(final Rect rect, int q, int q2) {
        final int n = ((RecyclerView.p)this).o0() + ((RecyclerView.p)this).p0();
        final int n2 = ((RecyclerView.p)this).r0() + ((RecyclerView.p)this).m0();
        if (this.w == 1) {
            q2 = RecyclerView.p.q(q2, rect.height() + n2, ((RecyclerView.p)this).k0());
            final int q3 = RecyclerView.p.q(q, this.x * this.s + n, ((RecyclerView.p)this).l0());
            q = q2;
            q2 = q3;
        }
        else {
            q = RecyclerView.p.q(q, rect.width() + n, ((RecyclerView.p)this).l0());
            final int q4 = RecyclerView.p.q(q2, this.x * this.s + n2, ((RecyclerView.p)this).k0());
            q2 = q;
            q = q4;
        }
        ((RecyclerView.p)this).X1(q2, q);
    }
    
    public void Y2() {
        this.E.b();
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public void Z0(final RecyclerView recyclerView, final x x) {
        super.Z0(recyclerView, x);
        ((RecyclerView.p)this).H1(this.P);
        for (int i = 0; i < this.s; ++i) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }
    
    boolean Z2() {
        final int i0 = ((RecyclerView.p)this).i0();
        boolean b = true;
        if (i0 != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public PointF a(int p) {
        p = this.p2(p);
        final PointF pointF = new PointF();
        if (p == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float)p;
            pointF.y = 0.0f;
        }
        else {
            pointF.x = 0.0f;
            pointF.y = (float)p;
        }
        return pointF;
    }
    
    @k0
    @Override
    public View a1(View i, int n, final x x, final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return null;
        }
        i = ((RecyclerView.p)this).I(i);
        if (i == null) {
            return null;
        }
        this.k3();
        final int v2 = this.v2(n);
        if (v2 == Integer.MIN_VALUE) {
            return null;
        }
        final c c = (c)i.getLayoutParams();
        final boolean f = c.f;
        final f e = c.e;
        if (v2 == 1) {
            n = this.N2();
        }
        else {
            n = this.L2();
        }
        this.w3(n, d0);
        this.o3(v2);
        final androidx.recyclerview.widget.r y = this.y;
        y.c = y.d + n;
        y.b = (int)(this.u.o() * 0.33333334f);
        final androidx.recyclerview.widget.r y2 = this.y;
        y2.h = true;
        final int n2 = 0;
        y2.a = false;
        this.z2(x, y2, d0);
        this.G = this.A;
        if (!f) {
            final View r = e.r(n, v2);
            if (r != null && r != i) {
                return r;
            }
        }
        if (this.d3(v2)) {
            for (int j = this.s - 1; j >= 0; --j) {
                final View r2 = this.t[j].r(n, v2);
                if (r2 != null && r2 != i) {
                    return r2;
                }
            }
        }
        else {
            for (int k = 0; k < this.s; ++k) {
                final View r3 = this.t[k].r(n, v2);
                if (r3 != null && r3 != i) {
                    return r3;
                }
            }
        }
        final boolean z = this.z;
        if (v2 == -1) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (((z ^ true) ? 1 : 0) == n) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (!f) {
            int n3;
            if (n != 0) {
                n3 = e.g();
            }
            else {
                n3 = e.j();
            }
            final View l = ((RecyclerView.p)this).J(n3);
            if (l != null && l != i) {
                return l;
            }
        }
        int n4 = n2;
        if (this.d3(v2)) {
            for (int n5 = this.s - 1; n5 >= 0; --n5) {
                if (n5 != e.e) {
                    final f[] t = this.t;
                    int n6;
                    if (n != 0) {
                        n6 = t[n5].g();
                    }
                    else {
                        n6 = t[n5].j();
                    }
                    final View m = ((RecyclerView.p)this).J(n6);
                    if (m != null && m != i) {
                        return m;
                    }
                }
            }
        }
        else {
            while (n4 < this.s) {
                final f[] t2 = this.t;
                int n7;
                if (n != 0) {
                    n7 = t2[n4].g();
                }
                else {
                    n7 = t2[n4].j();
                }
                final View j2 = ((RecyclerView.p)this).J(n7);
                if (j2 != null && j2 != i) {
                    return j2;
                }
                ++n4;
            }
        }
        return null;
    }
    
    @Override
    public void b1(final AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (((RecyclerView.p)this).Q() > 0) {
            final View d2 = this.D2(false);
            final View c2 = this.C2(false);
            if (d2 != null) {
                if (c2 != null) {
                    final int s0 = ((RecyclerView.p)this).s0(d2);
                    final int s2 = ((RecyclerView.p)this).s0(c2);
                    if (s0 < s2) {
                        accessibilityEvent.setFromIndex(s0);
                        accessibilityEvent.setToIndex(s2);
                    }
                    else {
                        accessibilityEvent.setFromIndex(s2);
                        accessibilityEvent.setToIndex(s0);
                    }
                }
            }
        }
    }
    
    void e3(final int a, final d0 d0) {
        int n;
        int n2;
        if (a > 0) {
            n = this.N2();
            n2 = 1;
        }
        else {
            n = this.L2();
            n2 = -1;
        }
        this.y.a = true;
        this.w3(n, d0);
        this.o3(n2);
        final androidx.recyclerview.widget.r y = this.y;
        y.c = n + y.d;
        y.b = Math.abs(a);
    }
    
    @Override
    public void f2(final RecyclerView recyclerView, final d0 d0, final int n) {
        final androidx.recyclerview.widget.s s = new androidx.recyclerview.widget.s(recyclerView.getContext());
        ((RecyclerView.c0)s).q(n);
        ((RecyclerView.p)this).g2(s);
    }
    
    @Override
    public void i(final String s) {
        if (this.I == null) {
            super.i(s);
        }
    }
    
    @Override
    public void i1(final RecyclerView recyclerView, final int n, final int n2) {
        this.W2(n, n2, 1);
    }
    
    @Override
    public void j1(final RecyclerView recyclerView) {
        this.E.b();
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public boolean j2() {
        return this.I == null;
    }
    
    @Override
    public void k1(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.W2(n, n2, 8);
    }
    
    @Override
    public void l1(final RecyclerView recyclerView, final int n, final int n2) {
        this.W2(n, n2, 2);
    }
    
    int l3(int n, final x x, final d0 d0) {
        if (((RecyclerView.p)this).Q() != 0 && n != 0) {
            this.e3(n, d0);
            final int z2 = this.z2(x, this.y, d0);
            if (this.y.b >= z2) {
                if (n < 0) {
                    n = -z2;
                }
                else {
                    n = z2;
                }
            }
            this.u.t(-n);
            this.G = this.A;
            final androidx.recyclerview.widget.r y = this.y;
            y.b = 0;
            this.g3(x, y);
            return n;
        }
        return 0;
    }
    
    boolean m2() {
        final int q = this.t[0].q(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; ++i) {
            if (this.t[i].q(Integer.MIN_VALUE) != q) {
                return false;
            }
        }
        return true;
    }
    
    public void m3(final int c, final int d) {
        final e i = this.I;
        if (i != null) {
            i.a();
        }
        this.C = c;
        this.D = d;
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public boolean n() {
        return this.w == 0;
    }
    
    @Override
    public void n1(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
        this.W2(n, n2, 4);
    }
    
    boolean n2() {
        final int u = this.t[0].u(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; ++i) {
            if (this.t[i].u(Integer.MIN_VALUE) != u) {
                return false;
            }
        }
        return true;
    }
    
    public void n3(final int f) {
        this.i(null);
        if (f == this.F) {
            return;
        }
        if (f != 0 && f != 2) {
            throw new IllegalArgumentException("invalid gap strategy. Must be GAP_HANDLING_NONE or GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS");
        }
        this.F = f;
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public boolean o() {
        final int w = this.w;
        boolean b = true;
        if (w != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public void o1(final x x, final d0 d0) {
        this.c3(x, d0, true);
    }
    
    @Override
    public boolean p(final q q) {
        return q instanceof c;
    }
    
    @Override
    public void p1(final d0 d0) {
        super.p1(d0);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }
    
    public void p3(final int w) {
        if (w != 0 && w != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        this.i(null);
        if (w == this.w) {
            return;
        }
        this.w = w;
        final androidx.recyclerview.widget.z u = this.u;
        this.u = this.v;
        this.v = u;
        ((RecyclerView.p)this).N1();
    }
    
    boolean q2() {
        if (((RecyclerView.p)this).Q() != 0 && this.F != 0 && ((RecyclerView.p)this).E0()) {
            int n;
            int n2;
            if (this.A) {
                n = this.N2();
                n2 = this.L2();
            }
            else {
                n = this.L2();
                n2 = this.N2();
            }
            if (n == 0 && this.X2() != null) {
                this.E.b();
            }
            else {
                if (!this.M) {
                    return false;
                }
                int n3;
                if (this.A) {
                    n3 = -1;
                }
                else {
                    n3 = 1;
                }
                final d e = this.E;
                ++n2;
                final a e2 = e.e(n, n2, n3, true);
                if (e2 == null) {
                    this.M = false;
                    this.E.d(n2);
                    return false;
                }
                final a e3 = this.E.e(n, e2.G, n3 * -1, true);
                if (e3 == null) {
                    this.E.d(e2.G);
                }
                else {
                    this.E.d(e3.G + 1);
                }
            }
            ((RecyclerView.p)this).O1();
            ((RecyclerView.p)this).N1();
            return true;
        }
        return false;
    }
    
    public void q3(final boolean b) {
        this.i(null);
        final e i = this.I;
        if (i != null && i.N != b) {
            i.N = b;
        }
        this.z = b;
        ((RecyclerView.p)this).N1();
    }
    
    @t0({ androidx.annotation.t0.a.G })
    @Override
    public void r(int toIndex, int i, final d0 d0, final p.c c) {
        if (this.w != 0) {
            toIndex = i;
        }
        if (((RecyclerView.p)this).Q() != 0) {
            if (toIndex != 0) {
                this.e3(toIndex, d0);
                final int[] o = this.O;
                if (o == null || o.length < this.s) {
                    this.O = new int[this.s];
                }
                final int n = 0;
                i = 0;
                toIndex = 0;
                while (i < this.s) {
                    final androidx.recyclerview.widget.r y = this.y;
                    int n2;
                    int n3;
                    if (y.d == -1) {
                        n2 = y.f;
                        n3 = this.t[i].u(n2);
                    }
                    else {
                        n2 = this.t[i].q(y.g);
                        n3 = this.y.g;
                    }
                    final int n4 = n2 - n3;
                    int n5 = toIndex;
                    if (n4 >= 0) {
                        this.O[toIndex] = n4;
                        n5 = toIndex + 1;
                    }
                    ++i;
                    toIndex = n5;
                }
                Arrays.sort(this.O, 0, toIndex);
                androidx.recyclerview.widget.r y2;
                for (i = n; i < toIndex && this.y.a(d0); ++i) {
                    c.a(this.y.c, this.O[i]);
                    y2 = this.y;
                    y2.c += y2.d;
                }
            }
        }
    }
    
    public void r3(int i) {
        this.i(null);
        if (i != this.s) {
            this.Y2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (i = 0; i < this.s; ++i) {
                this.t[i] = new f(i);
            }
            ((RecyclerView.p)this).N1();
        }
    }
    
    @Override
    public int t(final d0 d0) {
        return this.s2(d0);
    }
    
    @Override
    public void t1(final Parcelable parcelable) {
        if (parcelable instanceof e) {
            final e i = (e)parcelable;
            this.I = i;
            if (this.C != -1) {
                i.a();
                this.I.b();
            }
            ((RecyclerView.p)this).N1();
        }
    }
    
    @Override
    public int u(final d0 d0) {
        return this.t2(d0);
    }
    
    @Override
    public Parcelable u1() {
        if (this.I != null) {
            return (Parcelable)new e(this.I);
        }
        final e e = new e();
        e.N = this.z;
        e.O = this.G;
        e.P = this.H;
        final d e2 = this.E;
        int i = 0;
        Label_0102: {
            if (e2 != null) {
                final int[] a = e2.a;
                if (a != null) {
                    e.L = a;
                    e.K = a.length;
                    e.M = e2.b;
                    break Label_0102;
                }
            }
            e.K = 0;
        }
        if (((RecyclerView.p)this).Q() > 0) {
            int g;
            if (this.G) {
                g = this.N2();
            }
            else {
                g = this.L2();
            }
            e.G = g;
            e.H = this.E2();
            final int s = this.s;
            e.I = s;
            e.J = new int[s];
            while (i < this.s) {
                int n2 = 0;
                Label_0256: {
                    int n;
                    int n3;
                    if (this.G) {
                        n = this.t[i].q(Integer.MIN_VALUE);
                        if ((n2 = n) == Integer.MIN_VALUE) {
                            break Label_0256;
                        }
                        n3 = this.u.i();
                    }
                    else {
                        n = this.t[i].u(Integer.MIN_VALUE);
                        if ((n2 = n) == Integer.MIN_VALUE) {
                            break Label_0256;
                        }
                        n3 = this.u.n();
                    }
                    n2 = n - n3;
                }
                e.J[i] = n2;
                ++i;
            }
        }
        else {
            e.G = -1;
            e.H = -1;
            e.I = 0;
        }
        return (Parcelable)e;
    }
    
    boolean u3(final d0 d0, final b b) {
        final boolean j = d0.j();
        boolean c = false;
        if (!j) {
            final int c2 = this.C;
            if (c2 != -1) {
                if (c2 >= 0 && c2 < d0.d()) {
                    final e i = this.I;
                    if (i != null && i.G != -1 && i.I >= 1) {
                        b.b = Integer.MIN_VALUE;
                        b.a = this.C;
                    }
                    else {
                        final View k = ((RecyclerView.p)this).J(this.C);
                        if (k != null) {
                            int a;
                            if (this.A) {
                                a = this.N2();
                            }
                            else {
                                a = this.L2();
                            }
                            b.a = a;
                            if (this.D != Integer.MIN_VALUE) {
                                int n;
                                int n2;
                                if (b.c) {
                                    n = this.u.i() - this.D;
                                    n2 = this.u.d(k);
                                }
                                else {
                                    n = this.u.n() + this.D;
                                    n2 = this.u.g(k);
                                }
                                b.b = n - n2;
                                return true;
                            }
                            if (this.u.e(k) > this.u.o()) {
                                int b2;
                                if (b.c) {
                                    b2 = this.u.i();
                                }
                                else {
                                    b2 = this.u.n();
                                }
                                b.b = b2;
                                return true;
                            }
                            final int n3 = this.u.g(k) - this.u.n();
                            if (n3 < 0) {
                                b.b = -n3;
                                return true;
                            }
                            final int b3 = this.u.i() - this.u.d(k);
                            if (b3 < 0) {
                                b.b = b3;
                                return true;
                            }
                            b.b = Integer.MIN_VALUE;
                        }
                        else {
                            final int c3 = this.C;
                            b.a = c3;
                            final int d2 = this.D;
                            if (d2 == Integer.MIN_VALUE) {
                                if (this.p2(c3) == 1) {
                                    c = true;
                                }
                                b.c = c;
                                b.a();
                            }
                            else {
                                b.b(d2);
                            }
                            b.d = true;
                        }
                    }
                    return true;
                }
                this.C = -1;
                this.D = Integer.MIN_VALUE;
            }
        }
        return false;
    }
    
    @Override
    public int v(final d0 d0) {
        return this.u2(d0);
    }
    
    @Override
    public void v1(final int n) {
        if (n == 0) {
            this.q2();
        }
    }
    
    void v3(final d0 d0, final b b) {
        if (this.u3(d0, b)) {
            return;
        }
        if (this.t3(d0, b)) {
            return;
        }
        b.a();
        b.a = 0;
    }
    
    @Override
    public int w(final d0 d0) {
        return this.s2(d0);
    }
    
    @Override
    public int x(final d0 d0) {
        return this.t2(d0);
    }
    
    void x3(final int n) {
        this.x = n / this.s;
        this.J = View$MeasureSpec.makeMeasureSpec(n, this.v.l());
    }
    
    @Override
    public int y(final d0 d0) {
        return this.u2(d0);
    }
    
    class b
    {
        int a;
        int b;
        boolean c;
        boolean d;
        boolean e;
        int[] f;
        
        b() {
            this.c();
        }
        
        void a() {
            int b;
            if (this.c) {
                b = StaggeredGridLayoutManager.this.u.i();
            }
            else {
                b = StaggeredGridLayoutManager.this.u.n();
            }
            this.b = b;
        }
        
        void b(int b) {
            if (this.c) {
                b = StaggeredGridLayoutManager.this.u.i() - b;
            }
            else {
                b += StaggeredGridLayoutManager.this.u.n();
            }
            this.b = b;
        }
        
        void c() {
            this.a = -1;
            this.b = Integer.MIN_VALUE;
            this.c = false;
            this.d = false;
            this.e = false;
            final int[] f = this.f;
            if (f != null) {
                Arrays.fill(f, -1);
            }
        }
        
        void d(final f[] array) {
            final int length = array.length;
            final int[] f = this.f;
            if (f == null || f.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; ++i) {
                this.f[i] = array[i].u(Integer.MIN_VALUE);
            }
        }
    }
    
    public static class c extends q
    {
        public static final int g = -1;
        f e;
        boolean f;
        
        public c(final int n, final int n2) {
            super(n, n2);
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
        
        public c(final q q) {
            super(q);
        }
        
        public final int j() {
            final f e = this.e;
            if (e == null) {
                return -1;
            }
            return e.e;
        }
        
        public boolean k() {
            return this.f;
        }
        
        public void l(final boolean f) {
            this.f = f;
        }
    }
    
    static class d
    {
        private static final int c = 10;
        int[] a;
        List<a> b;
        
        private int i(final int n) {
            if (this.b == null) {
                return -1;
            }
            final a f = this.f(n);
            if (f != null) {
                this.b.remove(f);
            }
            final int size = this.b.size();
            int i = 0;
            while (true) {
                while (i < size) {
                    if (this.b.get(i).G >= n) {
                        if (i != -1) {
                            final a a = this.b.get(i);
                            this.b.remove(i);
                            return a.G;
                        }
                        return -1;
                    }
                    else {
                        ++i;
                    }
                }
                i = -1;
                continue;
            }
        }
        
        private void l(final int n, final int n2) {
            final List<a> b = this.b;
            if (b == null) {
                return;
            }
            for (int i = b.size() - 1; i >= 0; --i) {
                final a a = this.b.get(i);
                final int g = a.G;
                if (g >= n) {
                    a.G = g + n2;
                }
            }
        }
        
        private void m(final int n, final int n2) {
            final List<a> b = this.b;
            if (b == null) {
                return;
            }
            for (int i = b.size() - 1; i >= 0; --i) {
                final a a = this.b.get(i);
                final int g = a.G;
                if (g >= n) {
                    if (g < n + n2) {
                        this.b.remove(i);
                    }
                    else {
                        a.G = g - n2;
                    }
                }
            }
        }
        
        public void a(final a a) {
            if (this.b == null) {
                this.b = new ArrayList<a>();
            }
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                final a a2 = this.b.get(i);
                if (a2.G == a.G) {
                    this.b.remove(i);
                }
                if (a2.G >= a.G) {
                    this.b.add(i, a);
                    return;
                }
            }
            this.b.add(a);
        }
        
        void b() {
            final int[] a = this.a;
            if (a != null) {
                Arrays.fill(a, -1);
            }
            this.b = null;
        }
        
        void c(final int a) {
            final int[] a2 = this.a;
            if (a2 == null) {
                Arrays.fill(this.a = new int[Math.max(a, 10) + 1], -1);
            }
            else if (a >= a2.length) {
                System.arraycopy(a2, 0, this.a = new int[this.o(a)], 0, a2.length);
                final int[] a3 = this.a;
                Arrays.fill(a3, a2.length, a3.length, -1);
            }
        }
        
        int d(final int n) {
            final List<a> b = this.b;
            if (b != null) {
                for (int i = b.size() - 1; i >= 0; --i) {
                    if (this.b.get(i).G >= n) {
                        this.b.remove(i);
                    }
                }
            }
            return this.h(n);
        }
        
        public a e(final int n, final int n2, final int n3, final boolean b) {
            final List<a> b2 = this.b;
            if (b2 == null) {
                return null;
            }
            for (int size = b2.size(), i = 0; i < size; ++i) {
                final a a = this.b.get(i);
                final int g = a.G;
                if (g >= n2) {
                    return null;
                }
                if (g >= n && (n3 == 0 || a.H == n3 || (b && a.J))) {
                    return a;
                }
            }
            return null;
        }
        
        public a f(final int n) {
            final List<a> b = this.b;
            if (b == null) {
                return null;
            }
            for (int i = b.size() - 1; i >= 0; --i) {
                final a a = this.b.get(i);
                if (a.G == n) {
                    return a;
                }
            }
            return null;
        }
        
        int g(final int n) {
            final int[] a = this.a;
            if (a != null && n < a.length) {
                return a[n];
            }
            return -1;
        }
        
        int h(final int n) {
            final int[] a = this.a;
            if (a == null) {
                return -1;
            }
            if (n >= a.length) {
                return -1;
            }
            final int i = this.i(n);
            if (i == -1) {
                final int[] a2 = this.a;
                Arrays.fill(a2, n, a2.length, -1);
                return this.a.length;
            }
            final int min = Math.min(i + 1, this.a.length);
            Arrays.fill(this.a, n, min, -1);
            return min;
        }
        
        void j(final int fromIndex, final int n) {
            final int[] a = this.a;
            if (a != null) {
                if (fromIndex < a.length) {
                    final int toIndex = fromIndex + n;
                    this.c(toIndex);
                    final int[] a2 = this.a;
                    System.arraycopy(a2, fromIndex, a2, toIndex, a2.length - fromIndex - n);
                    Arrays.fill(this.a, fromIndex, toIndex, -1);
                    this.l(fromIndex, n);
                }
            }
        }
        
        void k(final int n, final int n2) {
            final int[] a = this.a;
            if (a != null) {
                if (n < a.length) {
                    final int n3 = n + n2;
                    this.c(n3);
                    final int[] a2 = this.a;
                    System.arraycopy(a2, n3, a2, n, a2.length - n - n2);
                    final int[] a3 = this.a;
                    Arrays.fill(a3, a3.length - n2, a3.length, -1);
                    this.m(n, n2);
                }
            }
        }
        
        void n(final int n, final f f) {
            this.c(n);
            this.a[n] = f.e;
        }
        
        int o(final int n) {
            int i;
            for (i = this.a.length; i <= n; i *= 2) {}
            return i;
        }
        
        @SuppressLint({ "BanParcelableUsage" })
        static class a implements Parcelable
        {
            public static final Parcelable$Creator<a> CREATOR;
            int G;
            int H;
            int[] I;
            boolean J;
            
            static {
                CREATOR = (Parcelable$Creator)new Parcelable$Creator<a>() {
                    public a a(final Parcel parcel) {
                        return new a(parcel);
                    }
                    
                    public a[] b(final int n) {
                        return new a[n];
                    }
                };
            }
            
            a() {
            }
            
            a(final Parcel parcel) {
                this.G = parcel.readInt();
                this.H = parcel.readInt();
                final int int1 = parcel.readInt();
                boolean j = true;
                if (int1 != 1) {
                    j = false;
                }
                this.J = j;
                final int int2 = parcel.readInt();
                if (int2 > 0) {
                    parcel.readIntArray(this.I = new int[int2]);
                }
            }
            
            int a(int n) {
                final int[] i = this.I;
                if (i == null) {
                    n = 0;
                }
                else {
                    n = i[n];
                }
                return n;
            }
            
            public int describeContents() {
                return 0;
            }
            
            @Override
            public String toString() {
                final StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.G);
                sb.append(", mGapDir=");
                sb.append(this.H);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.J);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.I));
                sb.append('}');
                return sb.toString();
            }
            
            public void writeToParcel(final Parcel parcel, final int n) {
                parcel.writeInt(this.G);
                parcel.writeInt(this.H);
                parcel.writeInt((int)(this.J ? 1 : 0));
                final int[] i = this.I;
                if (i != null && i.length > 0) {
                    parcel.writeInt(i.length);
                    parcel.writeIntArray(this.I);
                }
                else {
                    parcel.writeInt(0);
                }
            }
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    @t0({ t0.a.G })
    public static class e implements Parcelable
    {
        public static final Parcelable$Creator<e> CREATOR;
        int G;
        int H;
        int I;
        int[] J;
        int K;
        int[] L;
        List<a> M;
        boolean N;
        boolean O;
        boolean P;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<e>() {
                public e a(final Parcel parcel) {
                    return new e(parcel);
                }
                
                public e[] b(final int n) {
                    return new e[n];
                }
            };
        }
        
        public e() {
        }
        
        e(final Parcel parcel) {
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            final int int1 = parcel.readInt();
            this.I = int1;
            if (int1 > 0) {
                parcel.readIntArray(this.J = new int[int1]);
            }
            final int int2 = parcel.readInt();
            if ((this.K = int2) > 0) {
                parcel.readIntArray(this.L = new int[int2]);
            }
            final int int3 = parcel.readInt();
            final boolean b = false;
            this.N = (int3 == 1);
            this.O = (parcel.readInt() == 1);
            boolean p = b;
            if (parcel.readInt() == 1) {
                p = true;
            }
            this.P = p;
            this.M = (List<a>)parcel.readArrayList(a.class.getClassLoader());
        }
        
        public e(final e e) {
            this.I = e.I;
            this.G = e.G;
            this.H = e.H;
            this.J = e.J;
            this.K = e.K;
            this.L = e.L;
            this.N = e.N;
            this.O = e.O;
            this.P = e.P;
            this.M = e.M;
        }
        
        void a() {
            this.J = null;
            this.I = 0;
            this.G = -1;
            this.H = -1;
        }
        
        void b() {
            this.J = null;
            this.I = 0;
            this.K = 0;
            this.L = null;
            this.M = null;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
            if (this.I > 0) {
                parcel.writeIntArray(this.J);
            }
            parcel.writeInt(this.K);
            if (this.K > 0) {
                parcel.writeIntArray(this.L);
            }
            parcel.writeInt((int)(this.N ? 1 : 0));
            parcel.writeInt((int)(this.O ? 1 : 0));
            parcel.writeInt((int)(this.P ? 1 : 0));
            parcel.writeList((List)this.M);
        }
    }
    
    class f
    {
        static final int g = Integer.MIN_VALUE;
        ArrayList<View> a;
        int b;
        int c;
        int d;
        final int e;
        
        f(final int e) {
            this.a = new ArrayList<View>();
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
            this.d = 0;
            this.e = e;
        }
        
        void A(final int n) {
            this.b = n;
            this.c = n;
        }
        
        void a(final View e) {
            final c s = this.s(e);
            s.e = this;
            this.a.add(e);
            this.c = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.b = Integer.MIN_VALUE;
            }
            if (((RecyclerView.q)s).g() || ((RecyclerView.q)s).f()) {
                this.d += StaggeredGridLayoutManager.this.u.e(e);
            }
        }
        
        void b(final boolean b, final int n) {
            int n2;
            if (b) {
                n2 = this.q(Integer.MIN_VALUE);
            }
            else {
                n2 = this.u(Integer.MIN_VALUE);
            }
            this.e();
            if (n2 == Integer.MIN_VALUE) {
                return;
            }
            if ((b && n2 < StaggeredGridLayoutManager.this.u.i()) || (!b && n2 > StaggeredGridLayoutManager.this.u.n())) {
                return;
            }
            int n3 = n2;
            if (n != Integer.MIN_VALUE) {
                n3 = n2 + n;
            }
            this.c = n3;
            this.b = n3;
        }
        
        void c() {
            final ArrayList<View> a = this.a;
            final View view = a.get(a.size() - 1);
            final c s = this.s(view);
            this.c = StaggeredGridLayoutManager.this.u.d(view);
            if (s.f) {
                final a f = StaggeredGridLayoutManager.this.E.f(((RecyclerView.q)s).d());
                if (f != null && f.H == 1) {
                    this.c += f.a(this.e);
                }
            }
        }
        
        void d() {
            final View view = this.a.get(0);
            final c s = this.s(view);
            this.b = StaggeredGridLayoutManager.this.u.g(view);
            if (s.f) {
                final a f = StaggeredGridLayoutManager.this.E.f(((RecyclerView.q)s).d());
                if (f != null && f.H == -1) {
                    this.b -= f.a(this.e);
                }
            }
        }
        
        void e() {
            this.a.clear();
            this.v();
            this.d = 0;
        }
        
        public int f() {
            int n;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                n = this.a.size() - 1;
                size = -1;
            }
            else {
                n = 0;
                size = this.a.size();
            }
            return this.n(n, size, true);
        }
        
        public int g() {
            int n;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                n = this.a.size() - 1;
                size = -1;
            }
            else {
                n = 0;
                size = this.a.size();
            }
            return this.m(n, size, true);
        }
        
        public int h() {
            int n;
            if (StaggeredGridLayoutManager.this.z) {
                n = this.n(this.a.size() - 1, -1, false);
            }
            else {
                n = this.n(0, this.a.size(), false);
            }
            return n;
        }
        
        public int i() {
            int n;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                n = 0;
                size = this.a.size();
            }
            else {
                n = this.a.size() - 1;
                size = -1;
            }
            return this.n(n, size, true);
        }
        
        public int j() {
            int n;
            int size;
            if (StaggeredGridLayoutManager.this.z) {
                n = 0;
                size = this.a.size();
            }
            else {
                n = this.a.size() - 1;
                size = -1;
            }
            return this.m(n, size, true);
        }
        
        public int k() {
            int n;
            if (StaggeredGridLayoutManager.this.z) {
                n = this.n(0, this.a.size(), false);
            }
            else {
                n = this.n(this.a.size() - 1, -1, false);
            }
            return n;
        }
        
        int l(int i, final int n, final boolean b, final boolean b2, final boolean b3) {
            final int n2 = StaggeredGridLayoutManager.this.u.n();
            final int j = StaggeredGridLayoutManager.this.u.i();
            int n3;
            if (n > i) {
                n3 = 1;
            }
            else {
                n3 = -1;
            }
            while (i != n) {
                final View view = this.a.get(i);
                final int g = StaggeredGridLayoutManager.this.u.g(view);
                final int d = StaggeredGridLayoutManager.this.u.d(view);
                boolean b4 = false;
                final boolean b5 = b3 ? (g <= j) : (g < j);
                Label_0143: {
                    if (b3) {
                        if (d < n2) {
                            break Label_0143;
                        }
                    }
                    else if (d <= n2) {
                        break Label_0143;
                    }
                    b4 = true;
                }
                Label_0211: {
                    if (b5 && b4) {
                        if (b && b2) {
                            if (g < n2 || d > j) {
                                break Label_0211;
                            }
                        }
                        else if (!b2) {
                            if (g >= n2) {
                                if (d <= j) {
                                    break Label_0211;
                                }
                            }
                        }
                        return ((RecyclerView.p)StaggeredGridLayoutManager.this).s0(view);
                    }
                }
                i += n3;
            }
            return -1;
        }
        
        int m(final int n, final int n2, final boolean b) {
            return this.l(n, n2, false, false, b);
        }
        
        int n(final int n, final int n2, final boolean b) {
            return this.l(n, n2, b, true, false);
        }
        
        public int o() {
            return this.d;
        }
        
        int p() {
            final int c = this.c;
            if (c != Integer.MIN_VALUE) {
                return c;
            }
            this.c();
            return this.c;
        }
        
        int q(final int n) {
            final int c = this.c;
            if (c != Integer.MIN_VALUE) {
                return c;
            }
            if (this.a.size() == 0) {
                return n;
            }
            this.c();
            return this.c;
        }
        
        public View r(final int n, int n2) {
            final View view = null;
            View view2 = null;
            View view3;
            if (n2 == -1) {
                final int size = this.a.size();
                n2 = 0;
                while (true) {
                    view3 = view2;
                    if (n2 >= size) {
                        break;
                    }
                    final View view4 = this.a.get(n2);
                    final StaggeredGridLayoutManager f = StaggeredGridLayoutManager.this;
                    if (f.z) {
                        view3 = view2;
                        if (((RecyclerView.p)f).s0(view4) <= n) {
                            break;
                        }
                    }
                    final StaggeredGridLayoutManager f2 = StaggeredGridLayoutManager.this;
                    if (!f2.z && ((RecyclerView.p)f2).s0(view4) >= n) {
                        view3 = view2;
                        break;
                    }
                    view3 = view2;
                    if (!view4.hasFocusable()) {
                        break;
                    }
                    ++n2;
                    view2 = view4;
                }
            }
            else {
                n2 = this.a.size() - 1;
                View view5 = view;
                while (true) {
                    view3 = view5;
                    if (n2 < 0) {
                        break;
                    }
                    final View view6 = this.a.get(n2);
                    final StaggeredGridLayoutManager f3 = StaggeredGridLayoutManager.this;
                    if (f3.z) {
                        view3 = view5;
                        if (((RecyclerView.p)f3).s0(view6) >= n) {
                            break;
                        }
                    }
                    final StaggeredGridLayoutManager f4 = StaggeredGridLayoutManager.this;
                    if (!f4.z && ((RecyclerView.p)f4).s0(view6) <= n) {
                        view3 = view5;
                        break;
                    }
                    view3 = view5;
                    if (!view6.hasFocusable()) {
                        break;
                    }
                    --n2;
                    view5 = view6;
                }
            }
            return view3;
        }
        
        c s(final View view) {
            return (c)view.getLayoutParams();
        }
        
        int t() {
            final int b = this.b;
            if (b != Integer.MIN_VALUE) {
                return b;
            }
            this.d();
            return this.b;
        }
        
        int u(final int n) {
            final int b = this.b;
            if (b != Integer.MIN_VALUE) {
                return b;
            }
            if (this.a.size() == 0) {
                return n;
            }
            this.d();
            return this.b;
        }
        
        void v() {
            this.b = Integer.MIN_VALUE;
            this.c = Integer.MIN_VALUE;
        }
        
        void w(final int n) {
            final int b = this.b;
            if (b != Integer.MIN_VALUE) {
                this.b = b + n;
            }
            final int c = this.c;
            if (c != Integer.MIN_VALUE) {
                this.c = c + n;
            }
        }
        
        void x() {
            final int size = this.a.size();
            final View view = this.a.remove(size - 1);
            final c s = this.s(view);
            s.e = null;
            if (((RecyclerView.q)s).g() || ((RecyclerView.q)s).f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            if (size == 1) {
                this.b = Integer.MIN_VALUE;
            }
            this.c = Integer.MIN_VALUE;
        }
        
        void y() {
            final View view = this.a.remove(0);
            final c s = this.s(view);
            s.e = null;
            if (this.a.size() == 0) {
                this.c = Integer.MIN_VALUE;
            }
            if (((RecyclerView.q)s).g() || ((RecyclerView.q)s).f()) {
                this.d -= StaggeredGridLayoutManager.this.u.e(view);
            }
            this.b = Integer.MIN_VALUE;
        }
        
        void z(final View element) {
            final c s = this.s(element);
            s.e = this;
            this.a.add(0, element);
            this.b = Integer.MIN_VALUE;
            if (this.a.size() == 1) {
                this.c = Integer.MIN_VALUE;
            }
            if (((RecyclerView.q)s).g() || ((RecyclerView.q)s).f()) {
                this.d += StaggeredGridLayoutManager.this.u.e(element);
            }
        }
    }
}
