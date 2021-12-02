// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.util.DisplayMetrics;
import android.content.Context;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.widget.Scroller;

public abstract class e0 extends s
{
    static final float d = 100.0f;
    RecyclerView a;
    private Scroller b;
    private final u c;
    
    public e0() {
        this.c = new u() {
            boolean a = false;
            
            @Override
            public void a(final RecyclerView recyclerView, final int n) {
                super.a(recyclerView, n);
                if (n == 0 && this.a) {
                    this.a = false;
                    e0.this.l();
                }
            }
            
            @Override
            public void b(final RecyclerView recyclerView, final int n, final int n2) {
                if (n != 0 || n2 != 0) {
                    this.a = true;
                }
            }
        };
    }
    
    private void g() {
        this.a.w1(this.c);
        this.a.setOnFlingListener(null);
    }
    
    private void j() throws IllegalStateException {
        if (this.a.getOnFlingListener() == null) {
            this.a.r(this.c);
            this.a.setOnFlingListener((RecyclerView.s)this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }
    
    private boolean k(@j0 final p p3, int i, final int n) {
        if (!(p3 instanceof c0.b)) {
            return false;
        }
        final c0 e = this.e(p3);
        if (e == null) {
            return false;
        }
        i = this.i(p3, i, n);
        if (i == -1) {
            return false;
        }
        e.q(i);
        p3.g2(e);
        return true;
    }
    
    @Override
    public boolean a(final int a, final int a2) {
        final RecyclerView.p layoutManager = this.a.getLayoutManager();
        final boolean b = false;
        if (layoutManager == null) {
            return false;
        }
        if (this.a.getAdapter() == null) {
            return false;
        }
        final int minFlingVelocity = this.a.getMinFlingVelocity();
        if (Math.abs(a2) <= minFlingVelocity) {
            final boolean b2 = b;
            if (Math.abs(a) <= minFlingVelocity) {
                return b2;
            }
        }
        boolean b2 = b;
        if (this.k(layoutManager, a, a2)) {
            b2 = true;
        }
        return b2;
    }
    
    public void b(@k0 final RecyclerView a) throws IllegalStateException {
        final RecyclerView a2 = this.a;
        if (a2 == a) {
            return;
        }
        if (a2 != null) {
            this.g();
        }
        if ((this.a = a) != null) {
            this.j();
            this.b = new Scroller(this.a.getContext(), (Interpolator)new DecelerateInterpolator());
            this.l();
        }
    }
    
    @k0
    public abstract int[] c(@j0 final p p0, @j0 final View p1);
    
    public int[] d(final int n, final int n2) {
        this.b.fling(0, 0, n, n2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return new int[] { this.b.getFinalX(), this.b.getFinalY() };
    }
    
    @k0
    protected c0 e(@j0 final p p) {
        return this.f(p);
    }
    
    @Deprecated
    @k0
    protected androidx.recyclerview.widget.s f(@j0 final p p) {
        if (!(p instanceof c0.b)) {
            return null;
        }
        return new androidx.recyclerview.widget.s(this.a.getContext()) {
            @Override
            protected void p(final View view, final d0 d0, final c0.a a) {
                final e0 x = e0.this;
                final RecyclerView a2 = x.a;
                if (a2 == null) {
                    return;
                }
                final int[] c = x.c(a2.getLayoutManager(), view);
                final int a3 = c[0];
                final int a4 = c[1];
                final int x2 = this.x(Math.max(Math.abs(a3), Math.abs(a4)));
                if (x2 > 0) {
                    a.l(a3, a4, x2, (Interpolator)super.j);
                }
            }
            
            @Override
            protected float w(final DisplayMetrics displayMetrics) {
                return 100.0f / displayMetrics.densityDpi;
            }
        };
    }
    
    @k0
    public abstract View h(final p p0);
    
    public abstract int i(final p p0, final int p1, final int p2);
    
    void l() {
        final RecyclerView a = this.a;
        if (a == null) {
            return;
        }
        final RecyclerView.p layoutManager = a.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        final View h = this.h(layoutManager);
        if (h == null) {
            return;
        }
        final int[] c = this.c(layoutManager, h);
        if (c[0] != 0 || c[1] != 0) {
            this.a.K1(c[0], c[1]);
        }
    }
}
