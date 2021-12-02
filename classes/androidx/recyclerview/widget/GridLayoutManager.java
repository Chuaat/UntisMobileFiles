// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import androidx.core.view.accessibility.d;
import java.util.Arrays;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseIntArray;
import android.view.View;

public class GridLayoutManager extends LinearLayoutManager
{
    private static final boolean X = false;
    private static final String Y = "GridLayoutManager";
    public static final int Z = -1;
    boolean O;
    int P;
    int[] Q;
    View[] R;
    final SparseIntArray S;
    final SparseIntArray T;
    c U;
    final Rect V;
    private boolean W;
    
    public GridLayoutManager(final Context context, final int n) {
        super(context);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = (c)new a();
        this.V = new Rect();
        this.M3(n);
    }
    
    public GridLayoutManager(final Context context, final int n, final int n2, final boolean b) {
        super(context, n2, b);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = (c)new a();
        this.V = new Rect();
        this.M3(n);
    }
    
    public GridLayoutManager(final Context context, final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.O = false;
        this.P = -1;
        this.S = new SparseIntArray();
        this.T = new SparseIntArray();
        this.U = (c)new a();
        this.V = new Rect();
        this.M3(RecyclerView.p.t0(context, set, n, n2).b);
    }
    
    private void A3(final x x, final d0 d0, final LinearLayoutManager.a a, int i) {
        final boolean b = i == 1;
        i = this.F3(x, d0, a.b);
        if (b) {
            while (i > 0) {
                i = a.b;
                if (i <= 0) {
                    break;
                }
                --i;
                a.b = i;
                i = this.F3(x, d0, i);
            }
        }
        else {
            int d2;
            int j;
            int n;
            int f3;
            for (d2 = d0.d(), j = a.b; j < d2 - 1; j = n, i = f3) {
                n = j + 1;
                f3 = this.F3(x, d0, n);
                if (f3 <= i) {
                    break;
                }
            }
            a.b = j;
        }
    }
    
    private void B3() {
        final View[] r = this.R;
        if (r == null || r.length != this.P) {
            this.R = new View[this.P];
        }
    }
    
    private int E3(final x x, final d0 d0, final int i) {
        if (!d0.j()) {
            return this.U.b(i, this.P);
        }
        final int g = x.g(i);
        if (g == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. ");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.U.b(g, this.P);
    }
    
    private int F3(final x x, final d0 d0, final int i) {
        if (!d0.j()) {
            return this.U.c(i, this.P);
        }
        final int value = this.T.get(i, -1);
        if (value != -1) {
            return value;
        }
        final int g = x.g(i);
        if (g == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        return this.U.c(g, this.P);
    }
    
    private int G3(final x x, final d0 d0, final int i) {
        if (!d0.j()) {
            return this.U.f(i);
        }
        final int value = this.S.get(i, -1);
        if (value != -1) {
            return value;
        }
        final int g = x.g(i);
        if (g == -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 1;
        }
        return this.U.f(g);
    }
    
    private void I3(final float n, final int b) {
        this.v3(Math.max(Math.round(n * this.P), b));
    }
    
    private void K3(final View view, int n, final boolean b) {
        final b b2 = (b)view.getLayoutParams();
        final Rect b3 = b2.b;
        final int n2 = b3.top + b3.bottom + b2.topMargin + b2.bottomMargin;
        final int n3 = b3.left + b3.right + b2.leftMargin + b2.rightMargin;
        final int c3 = this.C3(b2.e, b2.f);
        int n4;
        if (super.s == 1) {
            n4 = RecyclerView.p.R(c3, n, n3, b2.width, false);
            n = RecyclerView.p.R(super.u.o(), ((RecyclerView.p)this).f0(), n2, b2.height, true);
        }
        else {
            n = RecyclerView.p.R(c3, n, n2, b2.height, false);
            n4 = RecyclerView.p.R(super.u.o(), ((RecyclerView.p)this).A0(), n3, b2.width, true);
        }
        this.L3(view, n4, n, b);
    }
    
    private void L3(final View view, final int n, final int n2, final boolean b) {
        final q q = (q)view.getLayoutParams();
        boolean b2;
        if (b) {
            b2 = ((RecyclerView.p)this).e2(view, n, n2, q);
        }
        else {
            b2 = ((RecyclerView.p)this).c2(view, n, n2, q);
        }
        if (b2) {
            view.measure(n, n2);
        }
    }
    
    private void P3() {
        int n;
        int n2;
        if (this.M2() == 1) {
            n = ((RecyclerView.p)this).z0() - ((RecyclerView.p)this).p0();
            n2 = ((RecyclerView.p)this).o0();
        }
        else {
            n = ((RecyclerView.p)this).e0() - ((RecyclerView.p)this).m0();
            n2 = ((RecyclerView.p)this).r0();
        }
        this.v3(n - n2);
    }
    
    private void t3(final x x, final d0 d0, int i, final boolean b) {
        int e = 0;
        int n = -1;
        int n3;
        if (b) {
            final int n2 = 0;
            n3 = 1;
            n = i;
            i = n2;
        }
        else {
            --i;
            n3 = -1;
        }
        while (i != n) {
            final View view = this.R[i];
            final b b2 = (b)view.getLayoutParams();
            final int g3 = this.G3(x, d0, ((RecyclerView.p)this).s0(view));
            b2.f = g3;
            b2.e = e;
            e += g3;
            i += n3;
        }
    }
    
    private void u3() {
        for (int q = ((RecyclerView.p)this).Q(), i = 0; i < q; ++i) {
            final b b = (b)((RecyclerView.p)this).P(i).getLayoutParams();
            final int d = ((RecyclerView.q)b).d();
            this.S.put(d, b.k());
            this.T.put(d, b.j());
        }
    }
    
    private void v3(final int n) {
        this.Q = w3(this.Q, this.P, n);
    }
    
    static int[] w3(final int[] array, final int n, int n2) {
        int i = 1;
        int[] array2 = null;
        Label_0034: {
            if (array != null && array.length == n + 1) {
                array2 = array;
                if (array[array.length - 1] == n2) {
                    break Label_0034;
                }
            }
            array2 = new int[n + 1];
        }
        final int n3 = 0;
        array2[0] = 0;
        final int n4 = n2 / n;
        final int n5 = n2 % n;
        int n6 = 0;
        n2 = n3;
        while (i <= n) {
            n2 += n5;
            int n7;
            if (n2 > 0 && n - n2 < n5) {
                n7 = n4 + 1;
                n2 -= n;
            }
            else {
                n7 = n4;
            }
            n6 += n7;
            array2[i] = n6;
            ++i;
        }
        return array2;
    }
    
    private void x3() {
        this.S.clear();
        this.T.clear();
    }
    
    private int y3(final d0 d0) {
        if (((RecyclerView.p)this).Q() != 0) {
            if (d0.d() != 0) {
                this.r2();
                final boolean r2 = this.R2();
                final View w2 = this.w2(r2 ^ true, true);
                final View v2 = this.v2(r2 ^ true, true);
                if (w2 != null) {
                    if (v2 != null) {
                        final int b = this.U.b(((RecyclerView.p)this).s0(w2), this.P);
                        final int b2 = this.U.b(((RecyclerView.p)this).s0(v2), this.P);
                        final int min = Math.min(b, b2);
                        final int max = Math.max(b, b2);
                        final int b3 = this.U.b(d0.d() - 1, this.P);
                        int n;
                        if (super.x) {
                            n = Math.max(0, b3 + 1 - max - 1);
                        }
                        else {
                            n = Math.max(0, min);
                        }
                        if (!r2) {
                            return n;
                        }
                        return Math.round(n * (Math.abs(super.u.d(v2) - super.u.g(w2)) / (float)(this.U.b(((RecyclerView.p)this).s0(v2), this.P) - this.U.b(((RecyclerView.p)this).s0(w2), this.P) + 1)) + (super.u.n() - super.u.g(w2)));
                    }
                }
            }
        }
        return 0;
    }
    
    private int z3(final d0 d0) {
        if (((RecyclerView.p)this).Q() != 0) {
            if (d0.d() != 0) {
                this.r2();
                final View w2 = this.w2(this.R2() ^ true, true);
                final View v2 = this.v2(this.R2() ^ true, true);
                if (w2 != null) {
                    if (v2 != null) {
                        if (!this.R2()) {
                            return this.U.b(d0.d() - 1, this.P) + 1;
                        }
                        return (int)((super.u.d(v2) - super.u.g(w2)) / (float)(this.U.b(((RecyclerView.p)this).s0(v2), this.P) - this.U.b(((RecyclerView.p)this).s0(w2), this.P) + 1) * (this.U.b(d0.d() - 1, this.P) + 1));
                    }
                }
            }
        }
        return 0;
    }
    
    int C3(final int n, final int n2) {
        if (super.s == 1 && this.Q2()) {
            final int[] q = this.Q;
            final int p2 = this.P;
            return q[p2 - n] - q[p2 - n - n2];
        }
        final int[] q2 = this.Q;
        return q2[n2 + n] - q2[n];
    }
    
    public int D3() {
        return this.P;
    }
    
    @Override
    View F2(final x x, final d0 d0, final boolean b, final boolean b2) {
        final int q = ((RecyclerView.p)this).Q();
        int n = -1;
        int n2 = 1;
        int i;
        if (b2) {
            i = ((RecyclerView.p)this).Q() - 1;
            n2 = -1;
        }
        else {
            n = q;
            i = 0;
        }
        final int d2 = d0.d();
        this.r2();
        final int n3 = super.u.n();
        final int j = super.u.i();
        View view = null;
        View view2 = null;
        while (i != n) {
            final View p4 = ((RecyclerView.p)this).P(i);
            final int s0 = ((RecyclerView.p)this).s0(p4);
            View view3 = view;
            View view4 = view2;
            if (s0 >= 0) {
                view3 = view;
                view4 = view2;
                if (s0 < d2) {
                    if (this.F3(x, d0, s0) != 0) {
                        view3 = view;
                        view4 = view2;
                    }
                    else if (((q)p4.getLayoutParams()).g()) {
                        view3 = view;
                        if ((view4 = view2) == null) {
                            view4 = p4;
                            view3 = view;
                        }
                    }
                    else {
                        if (super.u.g(p4) < j && super.u.d(p4) >= n3) {
                            return p4;
                        }
                        view3 = view;
                        view4 = view2;
                        if (view == null) {
                            view3 = p4;
                            view4 = view2;
                        }
                    }
                }
            }
            i += n2;
            view = view3;
            view2 = view4;
        }
        if (view != null) {
            view2 = view;
        }
        return view2;
    }
    
    public c H3() {
        return this.U;
    }
    
    public boolean J3() {
        return this.W;
    }
    
    @Override
    public q K() {
        if (super.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }
    
    @Override
    public q L(final Context context, final AttributeSet set) {
        return new b(context, set);
    }
    
    @Override
    public q M(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new b((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new b(viewGroup$LayoutParams);
    }
    
    public void M3(final int n) {
        if (n == this.P) {
            return;
        }
        this.O = true;
        if (n >= 1) {
            this.P = n;
            this.U.h();
            ((RecyclerView.p)this).N1();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Span count should be at least 1. Provided ");
        sb.append(n);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void N3(final c u) {
        this.U = u;
    }
    
    public void O3(final boolean w) {
        this.W = w;
    }
    
    @Override
    public int Q1(final int n, final x x, final d0 d0) {
        this.P3();
        this.B3();
        return super.Q1(n, x, d0);
    }
    
    @Override
    public int S1(final int n, final x x, final d0 d0) {
        this.P3();
        this.B3();
        return super.S1(n, x, d0);
    }
    
    @Override
    void S2(final x x, final d0 d0, final LinearLayoutManager.c c, final LinearLayoutManager.b b) {
        final int m = super.u.m();
        final boolean b2 = m != 1073741824;
        int n;
        if (((RecyclerView.p)this).Q() > 0) {
            n = this.Q[this.P];
        }
        else {
            n = 0;
        }
        if (b2) {
            this.P3();
        }
        final boolean b3 = c.e == 1;
        int p4 = this.P;
        if (!b3) {
            p4 = this.F3(x, d0, c.d) + this.G3(x, d0, c.d);
        }
        int n2;
        for (n2 = 0; n2 < this.P && c.c(d0) && p4 > 0; ++n2) {
            final int d2 = c.d;
            final int g3 = this.G3(x, d0, d2);
            if (g3 > this.P) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Item at position ");
                sb.append(d2);
                sb.append(" requires ");
                sb.append(g3);
                sb.append(" spans but GridLayoutManager has only ");
                sb.append(this.P);
                sb.append(" spans.");
                throw new IllegalArgumentException(sb.toString());
            }
            p4 -= g3;
            if (p4 < 0) {
                break;
            }
            final View e = c.e(x);
            if (e == null) {
                break;
            }
            this.R[n2] = e;
        }
        if (n2 == 0) {
            b.b = true;
            return;
        }
        float n3 = 0.0f;
        this.t3(x, d0, n2, b3);
        int i = 0;
        int n4 = 0;
        while (i < n2) {
            final View view = this.R[i];
            if (c.l == null) {
                if (b3) {
                    ((RecyclerView.p)this).e(view);
                }
                else {
                    ((RecyclerView.p)this).f(view, 0);
                }
            }
            else if (b3) {
                ((RecyclerView.p)this).c(view);
            }
            else {
                ((RecyclerView.p)this).d(view, 0);
            }
            ((RecyclerView.p)this).m(view, this.V);
            this.K3(view, m, false);
            final int e2 = super.u.e(view);
            int n5 = n4;
            if (e2 > n4) {
                n5 = e2;
            }
            final float n6 = super.u.f(view) * 1.0f / ((b)view.getLayoutParams()).f;
            float n7 = n3;
            if (n6 > n3) {
                n7 = n6;
            }
            ++i;
            n4 = n5;
            n3 = n7;
        }
        int a = n4;
        if (b2) {
            this.I3(n3, n);
            int n8 = 0;
            int n9 = 0;
            while (true) {
                a = n9;
                if (n8 >= n2) {
                    break;
                }
                final View view2 = this.R[n8];
                this.K3(view2, 1073741824, true);
                final int e3 = super.u.e(view2);
                int n10;
                if (e3 > (n10 = n9)) {
                    n10 = e3;
                }
                ++n8;
                n9 = n10;
            }
        }
        for (int j = 0; j < n2; ++j) {
            final View view3 = this.R[j];
            if (super.u.e(view3) != a) {
                final b b4 = (b)view3.getLayoutParams();
                final Rect b5 = b4.b;
                final int n11 = b5.top + b5.bottom + b4.topMargin + b4.bottomMargin;
                final int n12 = b5.left + b5.right + b4.leftMargin + b4.rightMargin;
                final int c2 = this.C3(b4.e, b4.f);
                int n13;
                int n14;
                if (super.s == 1) {
                    n13 = RecyclerView.p.R(c2, 1073741824, n12, b4.width, false);
                    n14 = View$MeasureSpec.makeMeasureSpec(a - n11, 1073741824);
                }
                else {
                    n13 = View$MeasureSpec.makeMeasureSpec(a - n12, 1073741824);
                    n14 = RecyclerView.p.R(c2, 1073741824, n11, b4.height, false);
                }
                this.L3(view3, n13, n14, true);
            }
        }
        int k = 0;
        b.a = a;
        int b6;
        int n15;
        int b8;
        int b9;
        if (super.s == 1) {
            if (c.f == -1) {
                b6 = c.b;
                n15 = b6 - a;
            }
            else {
                final int b7;
                final int n16 = a + (b7 = c.b);
                n15 = b7;
                b6 = n16;
            }
            b8 = 0;
            b9 = 0;
        }
        else if (c.f == -1) {
            b8 = c.b;
            b9 = b8 - a;
            n15 = 0;
            b6 = 0;
        }
        else {
            b9 = c.b;
            b8 = a + b9;
            b6 = 0;
            n15 = 0;
        }
        while (k < n2) {
            final View view4 = this.R[k];
            final b b10 = (b)view4.getLayoutParams();
            int n18;
            int n21;
            int n22;
            int n23;
            if (super.s == 1) {
                int n19;
                if (this.Q2()) {
                    final int n17 = ((RecyclerView.p)this).o0() + this.Q[this.P - b10.e];
                    final int f = super.u.f(view4);
                    n18 = n17;
                    n19 = n17 - f;
                }
                else {
                    final int n20 = ((RecyclerView.p)this).o0() + this.Q[b10.e];
                    final int f2 = super.u.f(view4);
                    n19 = n20;
                    n18 = f2 + n20;
                }
                n21 = b6;
                n22 = n15;
                n23 = n19;
            }
            else {
                final int n24 = ((RecyclerView.p)this).r0() + this.Q[b10.e];
                final int f3 = super.u.f(view4);
                n22 = n24;
                n23 = b9;
                n21 = f3 + n24;
                n18 = b8;
            }
            ((RecyclerView.p)this).P0(view4, n23, n22, n18, n21);
            if (((RecyclerView.q)b10).g() || ((RecyclerView.q)b10).f()) {
                b.c = true;
            }
            b.d |= view4.hasFocusable();
            ++k;
            b8 = n18;
            b9 = n23;
            n15 = n22;
            b6 = n21;
        }
        Arrays.fill(this.R, null);
    }
    
    @Override
    public int V(final x x, final d0 d0) {
        if (super.s == 1) {
            return this.P;
        }
        if (d0.d() < 1) {
            return 0;
        }
        return this.E3(x, d0, d0.d() - 1) + 1;
    }
    
    @Override
    void V2(final x x, final d0 d0, final LinearLayoutManager.a a, final int n) {
        super.V2(x, d0, a, n);
        this.P3();
        if (d0.d() > 0 && !d0.j()) {
            this.A3(x, d0, a, n);
        }
        this.B3();
    }
    
    @Override
    public void Y1(final Rect rect, int n, int n2) {
        if (this.Q == null) {
            super.Y1(rect, n, n2);
        }
        final int n3 = ((RecyclerView.p)this).o0() + ((RecyclerView.p)this).p0();
        final int n4 = ((RecyclerView.p)this).r0() + ((RecyclerView.p)this).m0();
        if (super.s == 1) {
            n2 = RecyclerView.p.q(n2, rect.height() + n4, ((RecyclerView.p)this).k0());
            final int[] q = this.Q;
            n = RecyclerView.p.q(n, q[q.length - 1] + n3, ((RecyclerView.p)this).l0());
        }
        else {
            n = RecyclerView.p.q(n, rect.width() + n3, ((RecyclerView.p)this).l0());
            final int[] q2 = this.Q;
            n2 = RecyclerView.p.q(n2, q2[q2.length - 1] + n4, ((RecyclerView.p)this).k0());
        }
        ((RecyclerView.p)this).X1(n, n2);
    }
    
    @Override
    public View a1(View view, int n, final x x, final d0 d0) {
        final View i = ((RecyclerView.p)this).I(view);
        View view2 = null;
        if (i == null) {
            return null;
        }
        final b b = (b)i.getLayoutParams();
        final int e = b.e;
        final int b2 = b.f + e;
        if (super.a1(view, n, x, d0) == null) {
            return null;
        }
        if (this.p2(n) == 1 != super.x) {
            n = 1;
        }
        else {
            n = 0;
        }
        int q;
        int n2;
        if (n != 0) {
            n = ((RecyclerView.p)this).Q() - 1;
            q = -1;
            n2 = -1;
        }
        else {
            q = ((RecyclerView.p)this).Q();
            n = 0;
            n2 = 1;
        }
        final boolean b3 = super.s == 1 && this.Q2();
        final int e2 = this.E3(x, d0, n);
        int j = n;
        final int n3 = 0;
        int e3 = -1;
        int e4 = -1;
        n = 0;
        view = null;
        final int n4 = q;
        int n5 = n3;
        while (j != n4) {
            final int e5 = this.E3(x, d0, j);
            final View p4 = ((RecyclerView.p)this).P(j);
            if (p4 == i) {
                break;
            }
            if (p4.hasFocusable() && e5 != e2) {
                if (view2 != null) {
                    break;
                }
            }
            else {
                final b b4 = (b)p4.getLayoutParams();
                final int e6 = b4.e;
                final int a = b4.f + e6;
                if (p4.hasFocusable() && e6 == e && a == b2) {
                    return p4;
                }
                int n9 = 0;
                Label_0473: {
                    Label_0320: {
                        if ((p4.hasFocusable() || view2 != null) && (p4.hasFocusable() || view != null)) {
                            final int n6 = Math.min(a, b2) - Math.max(e6, e);
                            if (p4.hasFocusable()) {
                                if (n6 > n5 || (n6 == n5 && b3 == e6 > e3)) {
                                    break Label_0320;
                                }
                            }
                            else if (view2 == null) {
                                final int n7 = 1;
                                boolean b5 = true;
                                if (((RecyclerView.p)this).N0(p4, false, true)) {
                                    final int n8 = n;
                                    if (n6 > n8) {
                                        n9 = n7;
                                        break Label_0473;
                                    }
                                    if (n6 == n8) {
                                        if (e6 <= e4) {
                                            b5 = false;
                                        }
                                        if (b3 == b5) {
                                            break Label_0320;
                                        }
                                    }
                                }
                            }
                            n9 = 0;
                            break Label_0473;
                        }
                    }
                    n9 = 1;
                }
                if (n9 != 0) {
                    if (p4.hasFocusable()) {
                        e3 = b4.e;
                        final int min = Math.min(a, b2);
                        final int max = Math.max(e6, e);
                        view2 = p4;
                        n5 = min - max;
                    }
                    else {
                        e4 = b4.e;
                        n = Math.min(a, b2) - Math.max(e6, e);
                        view = p4;
                    }
                }
            }
            j += n2;
        }
        if (view2 == null) {
            view2 = view;
        }
        return view2;
    }
    
    @Override
    public void g1(final x x, final d0 d0, final View view, final androidx.core.view.accessibility.d d2) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.f1(view, d2);
            return;
        }
        final b b = (b)layoutParams;
        int e3 = this.E3(x, d0, ((RecyclerView.q)b).d());
        int j;
        int k;
        int i;
        if (super.s == 0) {
            j = b.j();
            k = b.k();
            i = 1;
        }
        else {
            k = 1;
            final int l = b.j();
            i = b.k();
            j = e3;
            e3 = l;
        }
        d2.X0(androidx.core.view.accessibility.d.c.h(j, k, e3, i, false, false));
    }
    
    @Override
    public void i1(final RecyclerView recyclerView, final int n, final int n2) {
        this.U.h();
        this.U.g();
    }
    
    @Override
    public void j1(final RecyclerView recyclerView) {
        this.U.h();
        this.U.g();
    }
    
    @Override
    public boolean j2() {
        return super.D == null && !this.O;
    }
    
    @Override
    public void j3(final boolean b) {
        if (!b) {
            super.j3(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }
    
    @Override
    public void k1(final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        this.U.h();
        this.U.g();
    }
    
    @Override
    public void l1(final RecyclerView recyclerView, final int n, final int n2) {
        this.U.h();
        this.U.g();
    }
    
    @Override
    void l2(final d0 d0, final LinearLayoutManager.c c, final p.c c2) {
        int d2;
        for (int p3 = this.P, n = 0; n < this.P && c.c(d0) && p3 > 0; p3 -= this.U.f(d2), c.d += c.e, ++n) {
            d2 = c.d;
            c2.a(d2, Math.max(0, c.g));
        }
    }
    
    @Override
    public void n1(final RecyclerView recyclerView, final int n, final int n2, final Object o) {
        this.U.h();
        this.U.g();
    }
    
    @Override
    public void o1(final x x, final d0 d0) {
        if (d0.j()) {
            this.u3();
        }
        super.o1(x, d0);
        this.x3();
    }
    
    @Override
    public boolean p(final q q) {
        return q instanceof b;
    }
    
    @Override
    public void p1(final d0 d0) {
        super.p1(d0);
        this.O = false;
    }
    
    @Override
    public int u(final d0 d0) {
        if (this.W) {
            return this.y3(d0);
        }
        return super.u(d0);
    }
    
    @Override
    public int v(final d0 d0) {
        if (this.W) {
            return this.z3(d0);
        }
        return super.v(d0);
    }
    
    @Override
    public int v0(final x x, final d0 d0) {
        if (super.s == 0) {
            return this.P;
        }
        if (d0.d() < 1) {
            return 0;
        }
        return this.E3(x, d0, d0.d() - 1) + 1;
    }
    
    @Override
    public int x(final d0 d0) {
        if (this.W) {
            return this.y3(d0);
        }
        return super.x(d0);
    }
    
    @Override
    public int y(final d0 d0) {
        if (this.W) {
            return this.z3(d0);
        }
        return super.y(d0);
    }
    
    public static final class a extends c
    {
        @Override
        public int e(final int n, final int n2) {
            return n % n2;
        }
        
        @Override
        public int f(final int n) {
            return 1;
        }
    }
    
    public static class b extends q
    {
        public static final int g = -1;
        int e;
        int f;
        
        public b(final int n, final int n2) {
            super(n, n2);
            this.e = -1;
            this.f = 0;
        }
        
        public b(final Context context, final AttributeSet set) {
            super(context, set);
            this.e = -1;
            this.f = 0;
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.e = -1;
            this.f = 0;
        }
        
        public b(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.e = -1;
            this.f = 0;
        }
        
        public b(final q q) {
            super(q);
            this.e = -1;
            this.f = 0;
        }
        
        public int j() {
            return this.e;
        }
        
        public int k() {
            return this.f;
        }
    }
    
    public abstract static class c
    {
        final SparseIntArray a;
        final SparseIntArray b;
        private boolean c;
        private boolean d;
        
        public c() {
            this.a = new SparseIntArray();
            this.b = new SparseIntArray();
            this.c = false;
            this.d = false;
        }
        
        static int a(final SparseIntArray sparseIntArray, int n) {
            int n2 = sparseIntArray.size() - 1;
            int i = 0;
            while (i <= n2) {
                final int n3 = i + n2 >>> 1;
                if (sparseIntArray.keyAt(n3) < n) {
                    i = n3 + 1;
                }
                else {
                    n2 = n3 - 1;
                }
            }
            n = i - 1;
            if (n >= 0 && n < sparseIntArray.size()) {
                return sparseIntArray.keyAt(n);
            }
            return -1;
        }
        
        int b(final int n, int d) {
            if (!this.d) {
                return this.d(n, d);
            }
            final int value = this.b.get(n, -1);
            if (value != -1) {
                return value;
            }
            d = this.d(n, d);
            this.b.put(n, d);
            return d;
        }
        
        int c(final int n, int e) {
            if (!this.c) {
                return this.e(n, e);
            }
            final int value = this.a.get(n, -1);
            if (value != -1) {
                return value;
            }
            e = this.e(n, e);
            this.a.put(n, e);
            return e;
        }
        
        public int d(int n, final int n2) {
            int n5 = 0;
            int n6 = 0;
            int n7 = 0;
            Label_0087: {
                Label_0084: {
                    if (this.d) {
                        final int a = a(this.b, n);
                        if (a != -1) {
                            final int value = this.b.get(a);
                            final int n3 = a + 1;
                            final int n4 = this.c(a, n2) + this.f(a);
                            n5 = value;
                            n6 = n3;
                            if ((n7 = n4) == n2) {
                                n5 = value + 1;
                                n6 = n3;
                                break Label_0084;
                            }
                            break Label_0087;
                        }
                    }
                    n5 = 0;
                    n6 = 0;
                }
                n7 = 0;
            }
            final int f = this.f(n);
            int n9;
            int n10;
            for (int i = n6; i < n; ++i, n5 = n9, n7 = n10) {
                final int f2 = this.f(i);
                final int n8 = n7 + f2;
                if (n8 == n2) {
                    n9 = n5 + 1;
                    n10 = 0;
                }
                else {
                    n9 = n5;
                    if ((n10 = n8) > n2) {
                        n9 = n5 + 1;
                        n10 = f2;
                    }
                }
            }
            n = n5;
            if (n7 + f > n2) {
                n = n5 + 1;
            }
            return n;
        }
        
        public int e(final int n, final int n2) {
            final int f = this.f(n);
            if (f == n2) {
                return 0;
            }
            while (true) {
                int a = 0;
                Label_0121: {
                    if (this.c) {
                        a = a(this.a, n);
                        if (a >= 0) {
                            final int n3 = this.a.get(a) + this.f(a);
                            break Label_0121;
                        }
                    }
                    final int n4 = 0;
                    int n3 = 0;
                    if (n4 < n) {
                        final int f2 = this.f(n4);
                        final int n5 = n3 + f2;
                        if (n5 == n2) {
                            n3 = 0;
                            a = n4;
                        }
                        else {
                            a = n4;
                            if ((n3 = n5) > n2) {
                                n3 = f2;
                                a = n4;
                            }
                        }
                    }
                    else {
                        if (f + n3 <= n2) {
                            return n3;
                        }
                        return 0;
                    }
                }
                final int n4 = a + 1;
                continue;
            }
        }
        
        public abstract int f(final int p0);
        
        public void g() {
            this.b.clear();
        }
        
        public void h() {
            this.a.clear();
        }
        
        public boolean i() {
            return this.d;
        }
        
        public boolean j() {
            return this.c;
        }
        
        public void k(final boolean d) {
            if (!d) {
                this.b.clear();
            }
            this.d = d;
        }
        
        public void l(final boolean c) {
            if (!c) {
                this.b.clear();
            }
            this.c = c;
        }
    }
}
