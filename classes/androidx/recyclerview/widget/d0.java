// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.View;
import androidx.annotation.k0;
import androidx.annotation.j0;

public abstract class d0 extends m
{
    private static final boolean m = false;
    private static final String n = "SimpleItemAnimator";
    boolean l;
    
    public d0() {
        this.l = true;
    }
    
    public abstract boolean D(final g0 p0);
    
    public abstract boolean E(final g0 p0, final g0 p1, final int p2, final int p3, final int p4, final int p5);
    
    public abstract boolean F(final g0 p0, final int p1, final int p2, final int p3, final int p4);
    
    public abstract boolean G(final g0 p0);
    
    public final void H(final g0 g0) {
        this.Q(g0);
        ((RecyclerView.m)this).h(g0);
    }
    
    public final void I(final g0 g0) {
        this.R(g0);
    }
    
    public final void J(final g0 g0, final boolean b) {
        this.S(g0, b);
        ((RecyclerView.m)this).h(g0);
    }
    
    public final void K(final g0 g0, final boolean b) {
        this.T(g0, b);
    }
    
    public final void L(final g0 g0) {
        this.U(g0);
        ((RecyclerView.m)this).h(g0);
    }
    
    public final void M(final g0 g0) {
        this.V(g0);
    }
    
    public final void N(final g0 g0) {
        this.W(g0);
        ((RecyclerView.m)this).h(g0);
    }
    
    public final void O(final g0 g0) {
        this.X(g0);
    }
    
    public boolean P() {
        return this.l;
    }
    
    public void Q(final g0 g0) {
    }
    
    public void R(final g0 g0) {
    }
    
    public void S(final g0 g0, final boolean b) {
    }
    
    public void T(final g0 g0, final boolean b) {
    }
    
    public void U(final g0 g0) {
    }
    
    public void V(final g0 g0) {
    }
    
    public void W(final g0 g0) {
    }
    
    public void X(final g0 g0) {
    }
    
    public void Y(final boolean l) {
        this.l = l;
    }
    
    @Override
    public boolean a(@j0 final g0 g0, @k0 final d d, @j0 final d d2) {
        if (d != null) {
            final int a = d.a;
            final int a2 = d2.a;
            if (a != a2 || d.b != d2.b) {
                return this.F(g0, a, d.b, a2, d2.b);
            }
        }
        return this.D(g0);
    }
    
    @Override
    public boolean b(@j0 final g0 g0, @j0 final g0 g2, @j0 final d d, @j0 final d d2) {
        final int a = d.a;
        final int b = d.b;
        int n;
        int n2;
        if (g2.shouldIgnore()) {
            n = d.a;
            n2 = d.b;
        }
        else {
            n = d2.a;
            n2 = d2.b;
        }
        return this.E(g0, g2, a, b, n, n2);
    }
    
    @Override
    public boolean c(@j0 final g0 g0, @j0 final d d, @k0 final d d2) {
        final int a = d.a;
        final int b = d.b;
        final View itemView = g0.itemView;
        int n;
        if (d2 == null) {
            n = itemView.getLeft();
        }
        else {
            n = d2.a;
        }
        int n2;
        if (d2 == null) {
            n2 = itemView.getTop();
        }
        else {
            n2 = d2.b;
        }
        if (!g0.isRemoved() && (a != n || b != n2)) {
            itemView.layout(n, n2, itemView.getWidth() + n, itemView.getHeight() + n2);
            return this.F(g0, a, b, n, n2);
        }
        return this.G(g0);
    }
    
    @Override
    public boolean d(@j0 final g0 g0, @j0 final d d, @j0 final d d2) {
        final int a = d.a;
        final int a2 = d2.a;
        if (a == a2 && d.b == d2.b) {
            this.L(g0);
            return false;
        }
        return this.F(g0, a, d.b, a2, d2.b);
    }
    
    @Override
    public boolean f(@j0 final g0 g0) {
        return !this.l || g0.isInvalid();
    }
}
