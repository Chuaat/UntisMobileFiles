// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.j0;
import android.graphics.PointF;
import android.util.Log;
import java.util.List;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;

public class LinearLayoutManager extends p implements o.j, c0.b
{
    private static final String I = "LinearLayoutManager";
    static final boolean J = false;
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = Integer.MIN_VALUE;
    private static final float N = 0.33333334f;
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    androidx.recyclerview.widget.z u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;
    
    public LinearLayoutManager(final Context context) {
        this(context, 1, false);
    }
    
    public LinearLayoutManager(final Context context, final int n, final boolean b) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        this.f3(n);
        this.h3(b);
    }
    
    public LinearLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        final p.d t0 = RecyclerView.p.t0(context, set, n, n2);
        this.f3(t0.a);
        this.h3(t0.c);
        this.j3(t0.d);
    }
    
    private View D2() {
        View view;
        if (this.x) {
            view = this.u2();
        }
        else {
            view = this.z2();
        }
        return view;
    }
    
    private View E2() {
        View view;
        if (this.x) {
            view = this.z2();
        }
        else {
            view = this.u2();
        }
        return view;
    }
    
    private int G2(int n, final x x, final d0 d0, final boolean b) {
        final int n2 = this.u.i() - n;
        if (n2 > 0) {
            final int n3 = -this.c3(-n2, x, d0);
            if (b) {
                n = this.u.i() - (n + n3);
                if (n > 0) {
                    this.u.t(n);
                    return n + n3;
                }
            }
            return n3;
        }
        return 0;
    }
    
    private int H2(int n, final x x, final d0 d0, final boolean b) {
        final int n2 = n - this.u.n();
        if (n2 > 0) {
            int n4;
            final int n3 = n4 = -this.c3(n2, x, d0);
            if (b) {
                n = n + n3 - this.u.n();
                n4 = n3;
                if (n > 0) {
                    this.u.t(-n);
                    n4 = n3 - n;
                }
            }
            return n4;
        }
        return 0;
    }
    
    private View I2() {
        int n;
        if (this.x) {
            n = 0;
        }
        else {
            n = ((RecyclerView.p)this).Q() - 1;
        }
        return ((RecyclerView.p)this).P(n);
    }
    
    private View J2() {
        int n;
        if (this.x) {
            n = ((RecyclerView.p)this).Q() - 1;
        }
        else {
            n = 0;
        }
        return ((RecyclerView.p)this).P(n);
    }
    
    private void T2(final x x, final d0 d0, final int n, final int n2) {
        if (d0.n() && ((RecyclerView.p)this).Q() != 0 && !d0.j()) {
            if (this.j2()) {
                final List<g0> l = x.l();
                final int size = l.size();
                final int s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0));
                int i = 0;
                int h = 0;
                int h2 = 0;
                while (i < size) {
                    final g0 g0 = l.get(i);
                    if (!g0.isRemoved()) {
                        final int layoutPosition = g0.getLayoutPosition();
                        int n3 = 1;
                        if (layoutPosition < s0 != this.x) {
                            n3 = -1;
                        }
                        final int e = this.u.e(g0.itemView);
                        if (n3 == -1) {
                            h += e;
                        }
                        else {
                            h2 += e;
                        }
                    }
                    ++i;
                }
                this.t.l = l;
                if (h > 0) {
                    this.q3(((RecyclerView.p)this).s0(this.J2()), n);
                    final c t = this.t;
                    t.h = h;
                    t.c = 0;
                    t.a();
                    this.s2(x, this.t, d0, false);
                }
                if (h2 > 0) {
                    this.o3(((RecyclerView.p)this).s0(this.I2()), n2);
                    final c t2 = this.t;
                    t2.h = h2;
                    t2.c = 0;
                    t2.a();
                    this.s2(x, this.t, d0, false);
                }
                this.t.l = null;
            }
        }
    }
    
    private void U2() {
        Log.d("LinearLayoutManager", "internal representation of views on the screen");
        for (int i = 0; i < ((RecyclerView.p)this).Q(); ++i) {
            final View p = ((RecyclerView.p)this).P(i);
            final StringBuilder sb = new StringBuilder();
            sb.append("item ");
            sb.append(((RecyclerView.p)this).s0(p));
            sb.append(", coord:");
            sb.append(this.u.g(p));
            Log.d("LinearLayoutManager", sb.toString());
        }
        Log.d("LinearLayoutManager", "==============");
    }
    
    private void W2(final x x, final c c) {
        if (c.a) {
            if (!c.m) {
                final int g = c.g;
                final int i = c.i;
                if (c.f == -1) {
                    this.Y2(x, g, i);
                }
                else {
                    this.Z2(x, g, i);
                }
            }
        }
    }
    
    private void X2(final x x, final int n, int i) {
        if (n == i) {
            return;
        }
        int j;
        if (i > (j = n)) {
            --i;
            while (i >= n) {
                ((RecyclerView.p)this).G1(i, x);
                --i;
            }
        }
        else {
            while (j > i) {
                ((RecyclerView.p)this).G1(j, x);
                --j;
            }
        }
    }
    
    private void Y2(final x x, int i, int n) {
        final int q = ((RecyclerView.p)this).Q();
        if (i < 0) {
            return;
        }
        final int n2 = this.u.h() - i + n;
        if (this.x) {
            View p3;
            for (i = 0; i < q; ++i) {
                p3 = ((RecyclerView.p)this).P(i);
                if (this.u.g(p3) < n2 || this.u.r(p3) < n2) {
                    this.X2(x, 0, i);
                    return;
                }
            }
        }
        else {
            View p4;
            for (n = (i = q - 1); i >= 0; --i) {
                p4 = ((RecyclerView.p)this).P(i);
                if (this.u.g(p4) < n2 || this.u.r(p4) < n2) {
                    this.X2(x, n, i);
                    break;
                }
            }
        }
    }
    
    private void Z2(final x x, int i, int q) {
        if (i < 0) {
            return;
        }
        final int n = i - q;
        q = ((RecyclerView.p)this).Q();
        if (this.x) {
            View p3;
            for (i = --q; i >= 0; --i) {
                p3 = ((RecyclerView.p)this).P(i);
                if (this.u.d(p3) > n || this.u.q(p3) > n) {
                    this.X2(x, q, i);
                    return;
                }
            }
        }
        else {
            View p4;
            for (i = 0; i < q; ++i) {
                p4 = ((RecyclerView.p)this).P(i);
                if (this.u.d(p4) > n || this.u.q(p4) > n) {
                    this.X2(x, 0, i);
                    break;
                }
            }
        }
    }
    
    private void b3() {
        boolean w;
        if (this.s != 1 && this.Q2()) {
            w = (this.w ^ true);
        }
        else {
            w = this.w;
        }
        this.x = w;
    }
    
    private boolean k3(final x x, final d0 d0, final a a) {
        final int q = ((RecyclerView.p)this).Q();
        final int n = 0;
        if (q == 0) {
            return false;
        }
        final View d2 = ((RecyclerView.p)this).d0();
        if (d2 != null && a.d(d2, d0)) {
            a.c(d2, ((RecyclerView.p)this).s0(d2));
            return true;
        }
        final boolean v = this.v;
        final boolean y = this.y;
        if (v != y) {
            return false;
        }
        final View f2 = this.F2(x, d0, a.d, y);
        if (f2 != null) {
            a.b(f2, ((RecyclerView.p)this).s0(f2));
            if (!d0.j() && this.j2()) {
                final int g = this.u.g(f2);
                final int d3 = this.u.d(f2);
                final int n2 = this.u.n();
                final int i = this.u.i();
                final boolean b = d3 <= n2 && g < n2;
                int n3 = n;
                if (g >= i) {
                    n3 = n;
                    if (d3 > i) {
                        n3 = 1;
                    }
                }
                if (b || n3 != 0) {
                    int c = n2;
                    if (a.d) {
                        c = i;
                    }
                    a.c = c;
                }
            }
            return true;
        }
        return false;
    }
    
    private boolean l3(final d0 d0, final a a) {
        final boolean j = d0.j();
        boolean d2 = false;
        if (!j) {
            final int a2 = this.A;
            if (a2 != -1) {
                if (a2 >= 0 && a2 < d0.d()) {
                    a.b = this.A;
                    final d d3 = this.D;
                    if (d3 != null && d3.a()) {
                        final boolean i = this.D.I;
                        a.d = i;
                        int c;
                        if (i) {
                            c = this.u.i() - this.D.H;
                        }
                        else {
                            c = this.u.n() + this.D.H;
                        }
                        a.c = c;
                        return true;
                    }
                    if (this.B == Integer.MIN_VALUE) {
                        final View k = this.J(this.A);
                        if (k != null) {
                            if (this.u.e(k) > this.u.o()) {
                                a.a();
                                return true;
                            }
                            if (this.u.g(k) - this.u.n() < 0) {
                                a.c = this.u.n();
                                a.d = false;
                                return true;
                            }
                            if (this.u.i() - this.u.d(k) < 0) {
                                a.c = this.u.i();
                                return a.d = true;
                            }
                            int g;
                            if (a.d) {
                                g = this.u.d(k) + this.u.p();
                            }
                            else {
                                g = this.u.g(k);
                            }
                            a.c = g;
                        }
                        else {
                            if (((RecyclerView.p)this).Q() > 0) {
                                if (this.A < ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0)) == this.x) {
                                    d2 = true;
                                }
                                a.d = d2;
                            }
                            a.a();
                        }
                        return true;
                    }
                    final boolean x = this.x;
                    a.d = x;
                    int c2;
                    if (x) {
                        c2 = this.u.i() - this.B;
                    }
                    else {
                        c2 = this.u.n() + this.B;
                    }
                    a.c = c2;
                    return true;
                }
                else {
                    this.A = -1;
                    this.B = Integer.MIN_VALUE;
                }
            }
        }
        return false;
    }
    
    private int m2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        this.r2();
        return c0.a(d0, this.u, this.w2(this.z ^ true, true), this.v2(this.z ^ true, true), this, this.z);
    }
    
    private void m3(final x x, final d0 d0, final a a) {
        if (this.l3(d0, a)) {
            return;
        }
        if (this.k3(x, d0, a)) {
            return;
        }
        a.a();
        int b;
        if (this.y) {
            b = d0.d() - 1;
        }
        else {
            b = 0;
        }
        a.b = b;
    }
    
    private int n2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        this.r2();
        return c0.b(d0, this.u, this.w2(this.z ^ true, true), this.v2(this.z ^ true, true), this, this.z, this.x);
    }
    
    private void n3(int g, final int c, final boolean b, final d0 d0) {
        this.t.m = this.a3();
        this.t.f = g;
        final int[] h = this.H;
        boolean b2 = false;
        h[0] = 0;
        final int n = 1;
        final int n2 = 1;
        h[1] = 0;
        this.k2(d0, h);
        int max = Math.max(0, this.H[0]);
        final int max2 = Math.max(0, this.H[1]);
        if (g == 1) {
            b2 = true;
        }
        final c t = this.t;
        if (b2) {
            g = max2;
        }
        else {
            g = max;
        }
        t.h = g;
        if (!b2) {
            max = max2;
        }
        t.i = max;
        if (b2) {
            t.h = g + this.u.j();
            final View i2 = this.I2();
            final c t2 = this.t;
            g = n2;
            if (this.x) {
                g = -1;
            }
            t2.e = g;
            g = ((RecyclerView.p)this).s0(i2);
            final c t3 = this.t;
            t2.d = g + t3.e;
            t3.b = this.u.d(i2);
            g = this.u.d(i2) - this.u.i();
        }
        else {
            final View j2 = this.J2();
            final c t4 = this.t;
            t4.h += this.u.n();
            final c t5 = this.t;
            if (this.x) {
                g = n;
            }
            else {
                g = -1;
            }
            t5.e = g;
            g = ((RecyclerView.p)this).s0(j2);
            final c t6 = this.t;
            t5.d = g + t6.e;
            t6.b = this.u.g(j2);
            g = -this.u.g(j2) + this.u.n();
        }
        final c t7 = this.t;
        t7.c = c;
        if (b) {
            t7.c = c - g;
        }
        t7.g = g;
    }
    
    private int o2(final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0) {
            return 0;
        }
        this.r2();
        return c0.c(d0, this.u, this.w2(this.z ^ true, true), this.v2(this.z ^ true, true), this, this.z);
    }
    
    private void o3(final int d, final int b) {
        this.t.c = this.u.i() - b;
        final c t = this.t;
        int e;
        if (this.x) {
            e = -1;
        }
        else {
            e = 1;
        }
        t.e = e;
        t.d = d;
        t.f = 1;
        t.b = b;
        t.g = Integer.MIN_VALUE;
    }
    
    private void p3(final a a) {
        this.o3(a.b, a.c);
    }
    
    private void q3(int n, final int b) {
        this.t.c = b - this.u.n();
        final c t = this.t;
        t.d = n;
        if (this.x) {
            n = 1;
        }
        else {
            n = -1;
        }
        t.e = n;
        t.f = -1;
        t.b = b;
        t.g = Integer.MIN_VALUE;
    }
    
    private void r3(final a a) {
        this.q3(a.b, a.c);
    }
    
    private View u2() {
        return this.B2(0, ((RecyclerView.p)this).Q());
    }
    
    private View z2() {
        return this.B2(((RecyclerView.p)this).Q() - 1, -1);
    }
    
    public int A2() {
        final int q = ((RecyclerView.p)this).Q();
        int s0 = -1;
        final View c2 = this.C2(q - 1, -1, false, true);
        if (c2 != null) {
            s0 = ((RecyclerView.p)this).s0(c2);
        }
        return s0;
    }
    
    View B2(final int n, final int n2) {
        this.r2();
        int n3;
        if (n2 > n) {
            n3 = 1;
        }
        else if (n2 < n) {
            n3 = -1;
        }
        else {
            n3 = 0;
        }
        if (n3 == 0) {
            return ((RecyclerView.p)this).P(n);
        }
        int n4;
        int n5;
        if (this.u.g(((RecyclerView.p)this).P(n)) < this.u.n()) {
            n4 = 16644;
            n5 = 16388;
        }
        else {
            n4 = 4161;
            n5 = 4097;
        }
        k0 k0;
        if (this.s == 0) {
            k0 = super.e;
        }
        else {
            k0 = super.f;
        }
        return k0.a(n, n2, n4, n5);
    }
    
    View C2(final int n, final int n2, final boolean b, final boolean b2) {
        this.r2();
        int n3 = 320;
        int n4;
        if (b) {
            n4 = 24579;
        }
        else {
            n4 = 320;
        }
        if (!b2) {
            n3 = 0;
        }
        k0 k0;
        if (this.s == 0) {
            k0 = super.e;
        }
        else {
            k0 = super.f;
        }
        return k0.a(n, n2, n4, n3);
    }
    
    @Override
    public boolean F0() {
        return true;
    }
    
    View F2(final x x, final d0 d0, final boolean b, final boolean b2) {
        this.r2();
        final int q = ((RecyclerView.p)this).Q();
        int n = -1;
        int i;
        int n2;
        if (b2) {
            i = ((RecyclerView.p)this).Q() - 1;
            n2 = -1;
        }
        else {
            n = q;
            i = 0;
            n2 = 1;
        }
        final int d2 = d0.d();
        final int n3 = this.u.n();
        final int j = this.u.i();
        View view = null;
        View view3;
        View view2 = view3 = null;
        while (i != n) {
            final View p4 = ((RecyclerView.p)this).P(i);
            final int s0 = ((RecyclerView.p)this).s0(p4);
            final int g = this.u.g(p4);
            final int d3 = this.u.d(p4);
            View view4 = view;
            View view5 = view2;
            View view6 = view3;
            Label_0328: {
                if (s0 >= 0) {
                    view4 = view;
                    view5 = view2;
                    view6 = view3;
                    if (s0 < d2) {
                        if (((q)p4.getLayoutParams()).g()) {
                            view4 = view;
                            view5 = view2;
                            if ((view6 = view3) == null) {
                                view4 = view;
                                view5 = view2;
                                view6 = p4;
                            }
                        }
                        else {
                            final boolean b3 = d3 <= n3 && g < n3;
                            final boolean b4 = g >= j && d3 > j;
                            if (!b3 && !b4) {
                                return p4;
                            }
                            Label_0318: {
                                if (b) {
                                    if (!b4) {
                                        view4 = view;
                                        view5 = view2;
                                        view6 = view3;
                                        if (view == null) {
                                            break Label_0318;
                                        }
                                        break Label_0328;
                                    }
                                }
                                else if (!b3) {
                                    view4 = view;
                                    view5 = view2;
                                    view6 = view3;
                                    if (view == null) {
                                        break Label_0318;
                                    }
                                    break Label_0328;
                                }
                                view4 = view;
                                view5 = p4;
                                view6 = view3;
                                break Label_0328;
                            }
                            view6 = view3;
                            view5 = view2;
                            view4 = p4;
                        }
                    }
                }
            }
            i += n2;
            view = view4;
            view2 = view5;
            view3 = view6;
        }
        if (view == null) {
            if (view2 != null) {
                view = view2;
            }
            else {
                view = view3;
            }
        }
        return view;
    }
    
    @Override
    public View J(final int n) {
        final int q = ((RecyclerView.p)this).Q();
        if (q == 0) {
            return null;
        }
        final int n2 = n - ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0));
        if (n2 >= 0 && n2 < q) {
            final View p = ((RecyclerView.p)this).P(n2);
            if (((RecyclerView.p)this).s0(p) == n) {
                return p;
            }
        }
        return super.J(n);
    }
    
    @Override
    public q K() {
        return new RecyclerView.q(-2, -2);
    }
    
    @Deprecated
    protected int K2(final d0 d0) {
        if (d0.h()) {
            return this.u.o();
        }
        return 0;
    }
    
    public int L2() {
        return this.G;
    }
    
    public int M2() {
        return this.s;
    }
    
    public boolean N2() {
        return this.C;
    }
    
    public boolean O2() {
        return this.w;
    }
    
    public boolean P2() {
        return this.y;
    }
    
    @Override
    public int Q1(final int n, final x x, final d0 d0) {
        if (this.s == 1) {
            return 0;
        }
        return this.c3(n, x, d0);
    }
    
    protected boolean Q2() {
        final int i0 = ((RecyclerView.p)this).i0();
        boolean b = true;
        if (i0 != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public void R1(final int a) {
        this.A = a;
        this.B = Integer.MIN_VALUE;
        final d d = this.D;
        if (d != null) {
            d.b();
        }
        ((RecyclerView.p)this).N1();
    }
    
    public boolean R2() {
        return this.z;
    }
    
    @Override
    public int S1(final int n, final x x, final d0 d0) {
        if (this.s == 0) {
            return 0;
        }
        return this.c3(n, x, d0);
    }
    
    void S2(final x x, final d0 d0, final c c, final b b) {
        final View e = c.e(x);
        if (e == null) {
            b.b = true;
            return;
        }
        final q q = (q)e.getLayoutParams();
        if (c.l == null) {
            if (this.x == (c.f == -1)) {
                ((RecyclerView.p)this).e(e);
            }
            else {
                ((RecyclerView.p)this).f(e, 0);
            }
        }
        else if (this.x == (c.f == -1)) {
            ((RecyclerView.p)this).c(e);
        }
        else {
            ((RecyclerView.p)this).d(e, 0);
        }
        ((RecyclerView.p)this).R0(e, 0, 0);
        b.a = this.u.e(e);
        int n4;
        int n5;
        int n6;
        int n7;
        if (this.s == 1) {
            int n;
            int o0;
            if (this.Q2()) {
                n = ((RecyclerView.p)this).z0() - ((RecyclerView.p)this).p0();
                o0 = n - this.u.f(e);
            }
            else {
                o0 = ((RecyclerView.p)this).o0();
                n = this.u.f(e) + o0;
            }
            final int f = c.f;
            final int b2 = c.b;
            if (f == -1) {
                final int a = b.a;
                final int n2 = b2;
                final int n3 = n;
                n4 = b2 - a;
                n5 = o0;
                n6 = n3;
                n7 = n2;
            }
            else {
                final int a2 = b.a;
                final int n8 = b2;
                final int n9 = n;
                n7 = a2 + b2;
                n5 = o0;
                n4 = n8;
                n6 = n9;
            }
        }
        else {
            final int r0 = ((RecyclerView.p)this).r0();
            n7 = this.u.f(e) + r0;
            final int f2 = c.f;
            final int b3 = c.b;
            if (f2 == -1) {
                final int a3 = b.a;
                n6 = b3;
                final int n10 = r0;
                n5 = b3 - a3;
                n4 = n10;
            }
            else {
                n6 = b.a + b3;
                final int n11 = b3;
                n4 = r0;
                n5 = n11;
            }
        }
        ((RecyclerView.p)this).P0(e, n5, n4, n6, n7);
        if (q.g() || q.f()) {
            b.c = true;
        }
        b.d = e.hasFocusable();
    }
    
    void V2(final x x, final d0 d0, final a a, final int n) {
    }
    
    @Override
    public void Z0(final RecyclerView recyclerView, final x x) {
        super.Z0(recyclerView, x);
        if (this.C) {
            ((RecyclerView.p)this).D1(x);
            x.d();
        }
    }
    
    @Override
    public PointF a(int n) {
        if (((RecyclerView.p)this).Q() == 0) {
            return null;
        }
        boolean b = false;
        final int s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0));
        final int n2 = 1;
        if (n < s0) {
            b = true;
        }
        n = n2;
        if (b != this.x) {
            n = -1;
        }
        if (this.s == 0) {
            return new PointF((float)n, 0.0f);
        }
        return new PointF(0.0f, (float)n);
    }
    
    @Override
    public View a1(View view, int p4, final x x, final d0 d0) {
        this.b3();
        if (((RecyclerView.p)this).Q() == 0) {
            return null;
        }
        p4 = this.p2(p4);
        if (p4 == Integer.MIN_VALUE) {
            return null;
        }
        this.r2();
        this.n3(p4, (int)(this.u.o() * 0.33333334f), false, d0);
        final c t = this.t;
        t.g = Integer.MIN_VALUE;
        t.a = false;
        this.s2(x, t, d0, true);
        if (p4 == -1) {
            view = this.E2();
        }
        else {
            view = this.D2();
        }
        View view2;
        if (p4 == -1) {
            view2 = this.J2();
        }
        else {
            view2 = this.I2();
        }
        if (!view2.hasFocusable()) {
            return view;
        }
        if (view == null) {
            return null;
        }
        return view2;
    }
    
    boolean a3() {
        return this.u.l() == 0 && this.u.h() == 0;
    }
    
    @Override
    public void b(@j0 final View view, @j0 final View view2, int n, int s0) {
        this.i("Cannot drop a view during a scroll or layout calculation");
        this.r2();
        this.b3();
        n = ((RecyclerView.p)this).s0(view);
        s0 = ((RecyclerView.p)this).s0(view2);
        if (n < s0) {
            n = 1;
        }
        else {
            n = -1;
        }
        if (this.x) {
            if (n == 1) {
                this.d3(s0, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            }
            n = this.u.i() - this.u.d(view2);
        }
        else {
            if (n != -1) {
                this.d3(s0, this.u.d(view2) - this.u.e(view));
                return;
            }
            n = this.u.g(view2);
        }
        this.d3(s0, n);
    }
    
    @Override
    public void b1(final AccessibilityEvent accessibilityEvent) {
        super.b1(accessibilityEvent);
        if (((RecyclerView.p)this).Q() > 0) {
            accessibilityEvent.setFromIndex(this.x2());
            accessibilityEvent.setToIndex(this.A2());
        }
    }
    
    int c3(int n, final x x, final d0 d0) {
        if (((RecyclerView.p)this).Q() == 0 || n == 0) {
            return 0;
        }
        this.r2();
        this.t.a = true;
        int n2;
        if (n > 0) {
            n2 = 1;
        }
        else {
            n2 = -1;
        }
        final int abs = Math.abs(n);
        this.n3(n2, abs, true, d0);
        final c t = this.t;
        final int n3 = t.g + this.s2(x, t, d0, false);
        if (n3 < 0) {
            return 0;
        }
        if (abs > n3) {
            n = n2 * n3;
        }
        this.u.t(-n);
        return this.t.k = n;
    }
    
    @Override
    boolean d2() {
        return ((RecyclerView.p)this).f0() != 1073741824 && ((RecyclerView.p)this).A0() != 1073741824 && ((RecyclerView.p)this).B0();
    }
    
    public void d3(final int a, final int b) {
        this.A = a;
        this.B = b;
        final d d = this.D;
        if (d != null) {
            d.b();
        }
        ((RecyclerView.p)this).N1();
    }
    
    public void e3(final int g) {
        this.G = g;
    }
    
    @Override
    public void f2(final RecyclerView recyclerView, final d0 d0, final int n) {
        final androidx.recyclerview.widget.s s = new androidx.recyclerview.widget.s(recyclerView.getContext());
        ((RecyclerView.c0)s).q(n);
        ((RecyclerView.p)this).g2(s);
    }
    
    public void f3(final int n) {
        if (n != 0 && n != 1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid orientation:");
            sb.append(n);
            throw new IllegalArgumentException(sb.toString());
        }
        this.i(null);
        if (n != this.s || this.u == null) {
            final androidx.recyclerview.widget.z b = androidx.recyclerview.widget.z.b(this, n);
            this.u = b;
            this.E.a = b;
            this.s = n;
            ((RecyclerView.p)this).N1();
        }
    }
    
    public void g3(final boolean c) {
        this.C = c;
    }
    
    public void h3(final boolean w) {
        this.i(null);
        if (w == this.w) {
            return;
        }
        this.w = w;
        ((RecyclerView.p)this).N1();
    }
    
    @Override
    public void i(final String s) {
        if (this.D == null) {
            super.i(s);
        }
    }
    
    public void i3(final boolean z) {
        this.z = z;
    }
    
    @Override
    public boolean j2() {
        return this.D == null && this.v == this.y;
    }
    
    public void j3(final boolean y) {
        this.i(null);
        if (this.y == y) {
            return;
        }
        this.y = y;
        ((RecyclerView.p)this).N1();
    }
    
    protected void k2(@j0 final d0 d0, @j0 final int[] array) {
        int k2 = this.K2(d0);
        int n;
        if (this.t.f == -1) {
            n = 0;
        }
        else {
            n = k2;
            k2 = 0;
        }
        array[0] = k2;
        array[1] = n;
    }
    
    void l2(final d0 d0, final c c, final p.c c2) {
        final int d2 = c.d;
        if (d2 >= 0 && d2 < d0.d()) {
            c2.a(d2, Math.max(0, c.g));
        }
    }
    
    @Override
    public boolean n() {
        return this.s == 0;
    }
    
    @Override
    public boolean o() {
        final int s = this.s;
        boolean b = true;
        if (s != 1) {
            b = false;
        }
        return b;
    }
    
    @Override
    public void o1(final x x, final d0 d0) {
        final d d2 = this.D;
        int n = -1;
        if ((d2 != null || this.A != -1) && d0.d() == 0) {
            ((RecyclerView.p)this).D1(x);
            return;
        }
        final d d3 = this.D;
        if (d3 != null && d3.a()) {
            this.A = this.D.G;
        }
        this.r2();
        this.t.a = false;
        this.b3();
        final View d4 = ((RecyclerView.p)this).d0();
        final a e = this.E;
        if (e.e && this.A == -1 && this.D == null) {
            if (d4 != null && (this.u.g(d4) >= this.u.i() || this.u.d(d4) <= this.u.n())) {
                this.E.c(d4, ((RecyclerView.p)this).s0(d4));
            }
        }
        else {
            e.e();
            final a e2 = this.E;
            e2.d = (this.x ^ this.y);
            this.m3(x, d0, e2);
            this.E.e = true;
        }
        final c t = this.t;
        int f;
        if (t.k >= 0) {
            f = 1;
        }
        else {
            f = -1;
        }
        t.f = f;
        final int[] h = this.H;
        h[1] = (h[0] = 0);
        this.k2(d0, h);
        final int n2 = Math.max(0, this.H[0]) + this.u.n();
        final int n3 = Math.max(0, this.H[1]) + this.u.j();
        int h2 = n2;
        int h3 = n3;
        if (d0.j()) {
            final int a = this.A;
            h2 = n2;
            h3 = n3;
            if (a != -1) {
                h2 = n2;
                h3 = n3;
                if (this.B != Integer.MIN_VALUE) {
                    final View j = this.J(a);
                    h2 = n2;
                    h3 = n3;
                    if (j != null) {
                        int b;
                        int b2;
                        if (this.x) {
                            b = this.u.i() - this.u.d(j);
                            b2 = this.B;
                        }
                        else {
                            b2 = this.u.g(j) - this.u.n();
                            b = this.B;
                        }
                        final int n4 = b - b2;
                        if (n4 > 0) {
                            h2 = n2 + n4;
                            h3 = n3;
                        }
                        else {
                            h3 = n3 - n4;
                            h2 = n2;
                        }
                    }
                }
            }
        }
        final a e3 = this.E;
        Label_0491: {
            if (e3.d) {
                if (!this.x) {
                    break Label_0491;
                }
            }
            else if (this.x) {
                break Label_0491;
            }
            n = 1;
        }
        this.V2(x, d0, e3, n);
        ((RecyclerView.p)this).z(x);
        this.t.m = this.a3();
        this.t.j = d0.j();
        this.t.i = 0;
        final a e4 = this.E;
        int b5;
        int b6;
        if (e4.d) {
            this.r3(e4);
            final c t2 = this.t;
            t2.h = h2;
            this.s2(x, t2, d0, false);
            final c t3 = this.t;
            final int b3 = t3.b;
            final int d5 = t3.d;
            final int c = t3.c;
            int h4 = h3;
            if (c > 0) {
                h4 = h3 + c;
            }
            this.p3(this.E);
            final c t4 = this.t;
            t4.h = h4;
            t4.d += t4.e;
            this.s2(x, t4, d0, false);
            final c t5 = this.t;
            final int b4 = t5.b;
            final int c2 = t5.c;
            b5 = b3;
            b6 = b4;
            if (c2 > 0) {
                this.q3(d5, b3);
                final c t6 = this.t;
                t6.h = c2;
                this.s2(x, t6, d0, false);
                b5 = this.t.b;
                b6 = b4;
            }
        }
        else {
            this.p3(e4);
            final c t7 = this.t;
            t7.h = h3;
            this.s2(x, t7, d0, false);
            final c t8 = this.t;
            final int b7 = t8.b;
            final int d6 = t8.d;
            final int c3 = t8.c;
            int h5 = h2;
            if (c3 > 0) {
                h5 = h2 + c3;
            }
            this.r3(this.E);
            final c t9 = this.t;
            t9.h = h5;
            t9.d += t9.e;
            this.s2(x, t9, d0, false);
            final c t10 = this.t;
            final int b8 = t10.b;
            final int c4 = t10.c;
            b5 = b8;
            b6 = b7;
            if (c4 > 0) {
                this.o3(d6, b7);
                final c t11 = this.t;
                t11.h = c4;
                this.s2(x, t11, d0, false);
                b6 = this.t.b;
                b5 = b8;
            }
        }
        int n5 = b5;
        int n6 = b6;
        if (((RecyclerView.p)this).Q() > 0) {
            int n7;
            int n8;
            int n9;
            if (this.x ^ this.y) {
                final int g2 = this.G2(b6, x, d0, true);
                n7 = b5 + g2;
                n8 = b6 + g2;
                n9 = this.H2(n7, x, d0, false);
            }
            else {
                final int h6 = this.H2(b5, x, d0, true);
                n7 = b5 + h6;
                n8 = b6 + h6;
                n9 = this.G2(n8, x, d0, false);
            }
            n5 = n7 + n9;
            n6 = n8 + n9;
        }
        this.T2(x, d0, n5, n6);
        if (!d0.j()) {
            this.u.u();
        }
        else {
            this.E.e();
        }
        this.v = this.y;
    }
    
    @Override
    public void p1(final d0 d0) {
        super.p1(d0);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }
    
    int p2(int n) {
        int n2 = -1;
        final int n3 = 1;
        final int n4 = 1;
        if (n != 1) {
            if (n != 2) {
                if (n == 17) {
                    if (this.s != 0) {
                        n2 = Integer.MIN_VALUE;
                    }
                    return n2;
                }
                if (n == 33) {
                    if (this.s != 1) {
                        n2 = Integer.MIN_VALUE;
                    }
                    return n2;
                }
                if (n == 66) {
                    if (this.s == 0) {
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
                if (this.s == 1) {
                    n = n4;
                }
                else {
                    n = Integer.MIN_VALUE;
                }
                return n;
            }
            else {
                if (this.s == 1) {
                    return 1;
                }
                if (this.Q2()) {
                    return -1;
                }
                return 1;
            }
        }
        else {
            if (this.s == 1) {
                return -1;
            }
            if (this.Q2()) {
                return 1;
            }
            return -1;
        }
    }
    
    c q2() {
        return new c();
    }
    
    @Override
    public void r(int a, int n, final d0 d0, final p.c c) {
        if (this.s != 0) {
            a = n;
        }
        if (((RecyclerView.p)this).Q() != 0) {
            if (a != 0) {
                this.r2();
                if (a > 0) {
                    n = 1;
                }
                else {
                    n = -1;
                }
                this.n3(n, Math.abs(a), true, d0);
                this.l2(d0, this.t, c);
            }
        }
    }
    
    void r2() {
        if (this.t == null) {
            this.t = this.q2();
        }
    }
    
    @Override
    public void s(final int n, final p.c c) {
        final d d = this.D;
        int n2 = -1;
        boolean i;
        int n3;
        if (d != null && d.a()) {
            final d d2 = this.D;
            i = d2.I;
            n3 = d2.G;
        }
        else {
            this.b3();
            final boolean x = this.x;
            final int n4 = n3 = this.A;
            i = x;
            if (n4 == -1) {
                if (x) {
                    n3 = n - 1;
                    i = x;
                }
                else {
                    n3 = 0;
                    i = x;
                }
            }
        }
        if (!i) {
            n2 = 1;
        }
        for (int n5 = 0; n5 < this.G && n3 >= 0 && n3 < n; n3 += n2, ++n5) {
            c.a(n3, 0);
        }
    }
    
    int s2(final x x, final c c, final d0 d0, final boolean b) {
        final int c2 = c.c;
        final int g = c.g;
        if (g != Integer.MIN_VALUE) {
            if (c2 < 0) {
                c.g = g + c2;
            }
            this.W2(x, c);
        }
        int n = c.c + c.h;
        final b f = this.F;
        while ((c.m || n > 0) && c.c(d0)) {
            f.a();
            this.S2(x, d0, c, f);
            if (f.b) {
                break;
            }
            c.b += f.a * c.f;
            int n2 = 0;
            Label_0175: {
                if (f.c && c.l == null) {
                    n2 = n;
                    if (d0.j()) {
                        break Label_0175;
                    }
                }
                final int c3 = c.c;
                final int a = f.a;
                c.c = c3 - a;
                n2 = n - a;
            }
            final int g2 = c.g;
            if (g2 != Integer.MIN_VALUE) {
                final int g3 = g2 + f.a;
                c.g = g3;
                final int c4 = c.c;
                if (c4 < 0) {
                    c.g = g3 + c4;
                }
                this.W2(x, c);
            }
            n = n2;
            if (!b) {
                continue;
            }
            n = n2;
            if (f.d) {
                break;
            }
        }
        return c2 - c.c;
    }
    
    void s3() {
        final StringBuilder sb = new StringBuilder();
        sb.append("validating child count ");
        sb.append(((RecyclerView.p)this).Q());
        Log.d("LinearLayoutManager", sb.toString());
        final int q = ((RecyclerView.p)this).Q();
        final boolean b = true;
        boolean b2 = true;
        if (q < 1) {
            return;
        }
        final int s0 = ((RecyclerView.p)this).s0(((RecyclerView.p)this).P(0));
        final int g = this.u.g(((RecyclerView.p)this).P(0));
        if (this.x) {
            for (int i = 1; i < ((RecyclerView.p)this).Q(); ++i) {
                final View p = ((RecyclerView.p)this).P(i);
                final int s2 = ((RecyclerView.p)this).s0(p);
                final int g2 = this.u.g(p);
                if (s2 < s0) {
                    this.U2();
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("detected invalid position. loc invalid? ");
                    if (g2 >= g) {
                        b2 = false;
                    }
                    sb2.append(b2);
                    throw new RuntimeException(sb2.toString());
                }
                if (g2 > g) {
                    this.U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
        else {
            for (int j = 1; j < ((RecyclerView.p)this).Q(); ++j) {
                final View p2 = ((RecyclerView.p)this).P(j);
                final int s3 = ((RecyclerView.p)this).s0(p2);
                final int g3 = this.u.g(p2);
                if (s3 < s0) {
                    this.U2();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("detected invalid position. loc invalid? ");
                    sb3.append(g3 < g && b);
                    throw new RuntimeException(sb3.toString());
                }
                if (g3 < g) {
                    this.U2();
                    throw new RuntimeException("detected invalid location");
                }
            }
        }
    }
    
    @Override
    public int t(final d0 d0) {
        return this.m2(d0);
    }
    
    @Override
    public void t1(final Parcelable parcelable) {
        if (parcelable instanceof d) {
            final d d = (d)parcelable;
            this.D = d;
            if (this.A != -1) {
                d.b();
            }
            ((RecyclerView.p)this).N1();
        }
    }
    
    public int t2() {
        final View c2 = this.C2(0, ((RecyclerView.p)this).Q(), true, false);
        int s0;
        if (c2 == null) {
            s0 = -1;
        }
        else {
            s0 = ((RecyclerView.p)this).s0(c2);
        }
        return s0;
    }
    
    @Override
    public int u(final d0 d0) {
        return this.n2(d0);
    }
    
    @Override
    public Parcelable u1() {
        if (this.D != null) {
            return (Parcelable)new d(this.D);
        }
        final d d = new d();
        if (((RecyclerView.p)this).Q() > 0) {
            this.r2();
            final boolean i = this.v ^ this.x;
            d.I = i;
            if (i) {
                final View i2 = this.I2();
                d.H = this.u.i() - this.u.d(i2);
                d.G = ((RecyclerView.p)this).s0(i2);
            }
            else {
                final View j2 = this.J2();
                d.G = ((RecyclerView.p)this).s0(j2);
                d.H = this.u.g(j2) - this.u.n();
            }
        }
        else {
            d.b();
        }
        return (Parcelable)d;
    }
    
    @Override
    public int v(final d0 d0) {
        return this.o2(d0);
    }
    
    View v2(final boolean b, final boolean b2) {
        int n;
        int q;
        if (this.x) {
            n = 0;
            q = ((RecyclerView.p)this).Q();
        }
        else {
            n = ((RecyclerView.p)this).Q() - 1;
            q = -1;
        }
        return this.C2(n, q, b, b2);
    }
    
    @Override
    public int w(final d0 d0) {
        return this.m2(d0);
    }
    
    View w2(final boolean b, final boolean b2) {
        int n;
        int q;
        if (this.x) {
            n = ((RecyclerView.p)this).Q() - 1;
            q = -1;
        }
        else {
            n = 0;
            q = ((RecyclerView.p)this).Q();
        }
        return this.C2(n, q, b, b2);
    }
    
    @Override
    public int x(final d0 d0) {
        return this.n2(d0);
    }
    
    public int x2() {
        final View c2 = this.C2(0, ((RecyclerView.p)this).Q(), false, true);
        int s0;
        if (c2 == null) {
            s0 = -1;
        }
        else {
            s0 = ((RecyclerView.p)this).s0(c2);
        }
        return s0;
    }
    
    @Override
    public int y(final d0 d0) {
        return this.o2(d0);
    }
    
    public int y2() {
        final int q = ((RecyclerView.p)this).Q();
        int s0 = -1;
        final View c2 = this.C2(q - 1, -1, true, false);
        if (c2 != null) {
            s0 = ((RecyclerView.p)this).s0(c2);
        }
        return s0;
    }
    
    static class a
    {
        androidx.recyclerview.widget.z a;
        int b;
        int c;
        boolean d;
        boolean e;
        
        a() {
            this.e();
        }
        
        void a() {
            int c;
            if (this.d) {
                c = this.a.i();
            }
            else {
                c = this.a.n();
            }
            this.c = c;
        }
        
        public void b(final View view, final int b) {
            int g;
            if (this.d) {
                g = this.a.d(view) + this.a.p();
            }
            else {
                g = this.a.g(view);
            }
            this.c = g;
            this.b = b;
        }
        
        public void c(final View view, int a) {
            final int p2 = this.a.p();
            if (p2 >= 0) {
                this.b(view, a);
                return;
            }
            this.b = a;
            if (this.d) {
                a = this.a.i() - p2 - this.a.d(view);
                this.c = this.a.i() - a;
                if (a > 0) {
                    final int e = this.a.e(view);
                    final int c = this.c;
                    final int n = this.a.n();
                    final int n2 = c - e - (n + Math.min(this.a.g(view) - n, 0));
                    if (n2 < 0) {
                        this.c += Math.min(a, -n2);
                    }
                }
            }
            else {
                final int g = this.a.g(view);
                a = g - this.a.n();
                this.c = g;
                if (a > 0) {
                    final int n3 = this.a.i() - Math.min(0, this.a.i() - p2 - this.a.d(view)) - (g + this.a.e(view));
                    if (n3 < 0) {
                        this.c -= Math.min(a, -n3);
                    }
                }
            }
        }
        
        boolean d(final View view, final d0 d0) {
            final q q = (q)view.getLayoutParams();
            return !q.g() && q.d() >= 0 && q.d() < d0.d();
        }
        
        void e() {
            this.b = -1;
            this.c = Integer.MIN_VALUE;
            this.d = false;
            this.e = false;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("AnchorInfo{mPosition=");
            sb.append(this.b);
            sb.append(", mCoordinate=");
            sb.append(this.c);
            sb.append(", mLayoutFromEnd=");
            sb.append(this.d);
            sb.append(", mValid=");
            sb.append(this.e);
            sb.append('}');
            return sb.toString();
        }
    }
    
    protected static class b
    {
        public int a;
        public boolean b;
        public boolean c;
        public boolean d;
        
        void a() {
            this.a = 0;
            this.b = false;
            this.c = false;
            this.d = false;
        }
    }
    
    static class c
    {
        static final String n = "LLM#LayoutState";
        static final int o = -1;
        static final int p = 1;
        static final int q = Integer.MIN_VALUE;
        static final int r = -1;
        static final int s = 1;
        static final int t = Integer.MIN_VALUE;
        boolean a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        boolean j;
        int k;
        List<g0> l;
        boolean m;
        
        c() {
            this.a = true;
            this.h = 0;
            this.i = 0;
            this.j = false;
            this.l = null;
        }
        
        private View f() {
            for (int size = this.l.size(), i = 0; i < size; ++i) {
                final View itemView = this.l.get(i).itemView;
                final q q = (q)itemView.getLayoutParams();
                if (!q.g()) {
                    if (this.d == q.d()) {
                        this.b(itemView);
                        return itemView;
                    }
                }
            }
            return null;
        }
        
        public void a() {
            this.b(null);
        }
        
        public void b(View g) {
            g = this.g(g);
            int d;
            if (g == null) {
                d = -1;
            }
            else {
                d = ((q)g.getLayoutParams()).d();
            }
            this.d = d;
        }
        
        boolean c(final d0 d0) {
            final int d2 = this.d;
            return d2 >= 0 && d2 < d0.d();
        }
        
        void d() {
            final StringBuilder sb = new StringBuilder();
            sb.append("avail:");
            sb.append(this.c);
            sb.append(", ind:");
            sb.append(this.d);
            sb.append(", dir:");
            sb.append(this.e);
            sb.append(", offset:");
            sb.append(this.b);
            sb.append(", layoutDir:");
            sb.append(this.f);
            Log.d("LLM#LayoutState", sb.toString());
        }
        
        View e(final x x) {
            if (this.l != null) {
                return this.f();
            }
            final View p = x.p(this.d);
            this.d += this.e;
            return p;
        }
        
        public View g(final View view) {
            final int size = this.l.size();
            View view2 = null;
            int n = Integer.MAX_VALUE;
            int n2 = 0;
            View view3;
            while (true) {
                view3 = view2;
                if (n2 >= size) {
                    break;
                }
                final View itemView = this.l.get(n2).itemView;
                final q q = (q)itemView.getLayoutParams();
                View view4 = view2;
                int n3 = n;
                if (itemView != view) {
                    if (q.g()) {
                        view4 = view2;
                        n3 = n;
                    }
                    else {
                        final int n4 = (q.d() - this.d) * this.e;
                        if (n4 < 0) {
                            view4 = view2;
                            n3 = n;
                        }
                        else {
                            view4 = view2;
                            if (n4 < (n3 = n)) {
                                final View view5 = itemView;
                                if (n4 == 0) {
                                    view3 = view5;
                                    break;
                                }
                                n3 = n4;
                                view4 = view5;
                            }
                        }
                    }
                }
                ++n2;
                view2 = view4;
                n = n3;
            }
            return view3;
        }
    }
    
    @SuppressLint({ "BanParcelableUsage" })
    @t0({ t0.a.G })
    public static class d implements Parcelable
    {
        public static final Parcelable$Creator<d> CREATOR;
        int G;
        int H;
        boolean I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<d>() {
                public d a(final Parcel parcel) {
                    return new d(parcel);
                }
                
                public d[] b(final int n) {
                    return new d[n];
                }
            };
        }
        
        public d() {
        }
        
        d(final Parcel parcel) {
            this.G = parcel.readInt();
            this.H = parcel.readInt();
            final int int1 = parcel.readInt();
            boolean i = true;
            if (int1 != 1) {
                i = false;
            }
            this.I = i;
        }
        
        public d(final d d) {
            this.G = d.G;
            this.H = d.H;
            this.I = d.I;
        }
        
        boolean a() {
            return this.G >= 0;
        }
        
        void b() {
            this.G = -1;
        }
        
        public int describeContents() {
            return 0;
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt((int)(this.I ? 1 : 0));
        }
    }
}
