// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Locale;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.annotation.j0;
import androidx.recyclerview.widget.RecyclerView;

final class g extends u
{
    private static final int n = 0;
    private static final int o = 1;
    private static final int p = 2;
    private static final int q = 3;
    private static final int r = 4;
    private static final int s = -1;
    private ViewPager2.j a;
    @j0
    private final ViewPager2 b;
    @j0
    private final RecyclerView c;
    @j0
    private final LinearLayoutManager d;
    private int e;
    private int f;
    private a g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    
    g(@j0 final ViewPager2 b) {
        this.b = b;
        final RecyclerView p = b.P;
        this.c = p;
        this.d = (LinearLayoutManager)p.getLayoutManager();
        this.g = new a();
        this.q();
    }
    
    private void c(final int n, final float n2, final int n3) {
        final ViewPager2.j a = this.a;
        if (a != null) {
            a.b(n, n2, n3);
        }
    }
    
    private void d(final int n) {
        final ViewPager2.j a = this.a;
        if (a != null) {
            a.c(n);
        }
    }
    
    private void e(final int f) {
        if (this.e == 3 && this.f == 0) {
            return;
        }
        if (this.f == f) {
            return;
        }
        this.f = f;
        final ViewPager2.j a = this.a;
        if (a != null) {
            a.a(f);
        }
    }
    
    private int f() {
        return this.d.x2();
    }
    
    private boolean l() {
        final int e = this.e;
        boolean b = true;
        if (e != 1) {
            b = (e == 4 && b);
        }
        return b;
    }
    
    private void q() {
        this.e = 0;
        this.f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
        this.m = false;
        this.l = false;
    }
    
    private void s(final boolean m) {
        this.m = m;
        int e;
        if (m) {
            e = 4;
        }
        else {
            e = 1;
        }
        this.e = e;
        final int i = this.i;
        if (i != -1) {
            this.h = i;
            this.i = -1;
        }
        else if (this.h == -1) {
            this.h = this.f();
        }
        this.e(1);
    }
    
    private void t() {
        final a g = this.g;
        final int x2 = this.d.x2();
        g.a = x2;
        if (x2 == -1) {
            g.a();
            return;
        }
        final View j = this.d.J(x2);
        if (j == null) {
            g.a();
            return;
        }
        final int j2 = ((RecyclerView.p)this.d).j0(j);
        final int u0 = ((RecyclerView.p)this.d).u0(j);
        final int x3 = ((RecyclerView.p)this.d).x0(j);
        final int o = ((RecyclerView.p)this.d).O(j);
        final ViewGroup$LayoutParams layoutParams = j.getLayoutParams();
        int n = j2;
        int n2 = u0;
        int n3 = x3;
        int n4 = o;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
            n = j2 + viewGroup$MarginLayoutParams.leftMargin;
            n2 = u0 + viewGroup$MarginLayoutParams.rightMargin;
            n3 = x3 + viewGroup$MarginLayoutParams.topMargin;
            n4 = o + viewGroup$MarginLayoutParams.bottomMargin;
        }
        final int n5 = j.getHeight() + n3 + n4;
        final int width = j.getWidth();
        int n8;
        int n9;
        if (this.d.M2() == 0) {
            int n6 = j.getLeft() - n - this.c.getPaddingLeft();
            if (this.b.k()) {
                n6 = -n6;
            }
            final int n7 = width + n + n2;
            n8 = n6;
            n9 = n7;
        }
        else {
            n8 = j.getTop() - n3 - this.c.getPaddingTop();
            n9 = n5;
        }
        final int c = -n8;
        g.c = c;
        if (c >= 0) {
            float b;
            if (n9 == 0) {
                b = 0.0f;
            }
            else {
                b = c / (float)n9;
            }
            g.b = b;
            return;
        }
        if (new androidx.viewpager2.widget.a(this.d).d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", g.c));
    }
    
    @Override
    public void a(@j0 final RecyclerView recyclerView, int i) {
        final int e = this.e;
        final boolean b = true;
        if ((e != 1 || this.f != 1) && i == 1) {
            this.s(false);
            return;
        }
        if (this.l() && i == 2) {
            if (this.k) {
                this.e(2);
                this.j = true;
            }
            return;
        }
        if (this.l() && i == 0) {
            this.t();
            int n;
            if (!this.k) {
                final int a = this.g.a;
                n = (b ? 1 : 0);
                if (a != -1) {
                    this.c(a, 0.0f, 0);
                    n = (b ? 1 : 0);
                }
            }
            else {
                final a g = this.g;
                if (g.c == 0) {
                    final int h = this.h;
                    final int a2 = g.a;
                    n = (b ? 1 : 0);
                    if (h != a2) {
                        this.d(a2);
                        n = (b ? 1 : 0);
                    }
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                this.e(0);
                this.q();
            }
        }
        if (this.e == 2 && i == 0 && this.l) {
            this.t();
            final a g2 = this.g;
            if (g2.c == 0) {
                i = this.i;
                final int a3 = g2.a;
                if (i != a3) {
                    if ((i = a3) == -1) {
                        i = 0;
                    }
                    this.d(i);
                }
                this.e(0);
                this.q();
            }
        }
    }
    
    @Override
    public void b(@j0 final RecyclerView recyclerView, int i, int n) {
        this.k = true;
        this.t();
        Label_0143: {
            if (this.j) {
                this.j = false;
                if (n <= 0 && (n != 0 || i < 0 != this.b.k())) {
                    i = 0;
                }
                else {
                    i = 1;
                }
                Label_0098: {
                    if (i != 0) {
                        final a g = this.g;
                        if (g.c != 0) {
                            i = g.a + 1;
                            break Label_0098;
                        }
                    }
                    i = this.g.a;
                }
                this.i = i;
                if (this.h == i) {
                    break Label_0143;
                }
            }
            else {
                if (this.e != 0) {
                    break Label_0143;
                }
                n = this.g.a;
                if ((i = n) == -1) {
                    i = 0;
                }
            }
            this.d(i);
        }
        final a g2 = this.g;
        n = g2.a;
        if ((i = n) == -1) {
            i = 0;
        }
        this.c(i, g2.b, g2.c);
        final a g3 = this.g;
        n = g3.a;
        i = this.i;
        if ((n == i || i == -1) && g3.c == 0 && this.f != 1) {
            this.e(0);
            this.q();
        }
    }
    
    double g() {
        this.t();
        final a g = this.g;
        return g.a + (double)g.b;
    }
    
    int h() {
        return this.f;
    }
    
    boolean i() {
        final int f = this.f;
        boolean b = true;
        if (f != 1) {
            b = false;
        }
        return b;
    }
    
    boolean j() {
        return this.m;
    }
    
    boolean k() {
        return this.f == 0;
    }
    
    void m() {
        this.e = 4;
        this.s(true);
    }
    
    void n() {
        this.l = true;
    }
    
    void o() {
        if (this.i() && !this.m) {
            return;
        }
        this.m = false;
        this.t();
        final a g = this.g;
        if (g.c == 0) {
            final int a = g.a;
            if (a != this.h) {
                this.d(a);
            }
            this.e(0);
            this.q();
        }
        else {
            this.e(2);
        }
    }
    
    void p(final int i, final boolean b) {
        int e;
        if (b) {
            e = 2;
        }
        else {
            e = 3;
        }
        this.e = e;
        boolean b2 = false;
        this.m = false;
        if (this.i != i) {
            b2 = true;
        }
        this.i = i;
        this.e(2);
        if (b2) {
            this.d(i);
        }
    }
    
    void r(final ViewPager2.j a) {
        this.a = a;
    }
    
    private static final class a
    {
        int a;
        float b;
        int c;
        
        a() {
        }
        
        void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }
}
