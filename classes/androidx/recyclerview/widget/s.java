// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.Interpolator;
import android.content.Context;
import android.util.DisplayMetrics;
import android.graphics.PointF;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

public class s extends c0
{
    private static final boolean q = false;
    private static final float r = 25.0f;
    private static final int s = 10000;
    public static final int t = -1;
    public static final int u = 1;
    public static final int v = 0;
    private static final float w = 1.2f;
    protected final LinearInterpolator i;
    protected final DecelerateInterpolator j;
    protected PointF k;
    private final DisplayMetrics l;
    private boolean m;
    private float n;
    protected int o;
    protected int p;
    
    public s(final Context context) {
        this.i = new LinearInterpolator();
        this.j = new DecelerateInterpolator();
        this.m = false;
        this.o = 0;
        this.p = 0;
        this.l = context.getResources().getDisplayMetrics();
    }
    
    private float B() {
        if (!this.m) {
            this.n = this.w(this.l);
            this.m = true;
        }
        return this.n;
    }
    
    private int z(final int n, int n2) {
        n2 = n - n2;
        if (n * n2 <= 0) {
            return 0;
        }
        return n2;
    }
    
    protected int A() {
        final PointF k = this.k;
        if (k != null) {
            final float x = k.x;
            if (x != 0.0f) {
                if (x > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
    
    protected int C() {
        final PointF k = this.k;
        if (k != null) {
            final float y = k.y;
            if (y != 0.0f) {
                if (y > 0.0f) {
                    return 1;
                }
                return -1;
            }
        }
        return 0;
    }
    
    protected void D(final a a) {
        final PointF a2 = ((RecyclerView.c0)this).a(((RecyclerView.c0)this).f());
        if (a2 != null && (a2.x != 0.0f || a2.y != 0.0f)) {
            ((RecyclerView.c0)this).j(a2);
            this.k = a2;
            this.o = (int)(a2.x * 10000.0f);
            this.p = (int)(a2.y * 10000.0f);
            a.l((int)(this.o * 1.2f), (int)(this.p * 1.2f), (int)(this.y(10000) * 1.2f), (Interpolator)this.i);
            return;
        }
        a.f(((RecyclerView.c0)this).f());
        ((RecyclerView.c0)this).s();
    }
    
    @Override
    protected void m(int z, final int n, final d0 d0, final a a) {
        if (((RecyclerView.c0)this).c() == 0) {
            ((RecyclerView.c0)this).s();
            return;
        }
        this.o = this.z(this.o, z);
        z = this.z(this.p, n);
        this.p = z;
        if (this.o == 0 && z == 0) {
            this.D(a);
        }
    }
    
    @Override
    protected void n() {
    }
    
    @Override
    protected void o() {
        this.p = 0;
        this.o = 0;
        this.k = null;
    }
    
    @Override
    protected void p(final View view, final d0 d0, final a a) {
        final int u = this.u(view, this.A());
        final int v = this.v(view, this.C());
        final int x = this.x((int)Math.sqrt(u * u + v * v));
        if (x > 0) {
            a.l(-u, -v, x, (Interpolator)this.j);
        }
    }
    
    public int t(int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == -1) {
            return n3 - n;
        }
        if (n5 != 0) {
            if (n5 == 1) {
                return n4 - n2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        else {
            n = n3 - n;
            if (n > 0) {
                return n;
            }
            n = n4 - n2;
            if (n < 0) {
                return n;
            }
            return 0;
        }
    }
    
    public int u(final View view, final int n) {
        final p e = ((RecyclerView.c0)this).e();
        if (e != null && e.n()) {
            final q q = (q)view.getLayoutParams();
            return this.t(e.Y(view) - q.leftMargin, e.b0(view) + q.rightMargin, e.o0(), e.z0() - e.p0(), n);
        }
        return 0;
    }
    
    public int v(final View view, final int n) {
        final p e = ((RecyclerView.c0)this).e();
        if (e != null && e.o()) {
            final q q = (q)view.getLayoutParams();
            return this.t(e.c0(view) - q.topMargin, e.W(view) + q.bottomMargin, e.r0(), e.e0() - e.m0(), n);
        }
        return 0;
    }
    
    protected float w(final DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }
    
    protected int x(final int n) {
        return (int)Math.ceil(this.y(n) / 0.3356);
    }
    
    protected int y(final int a) {
        return (int)Math.ceil(Math.abs(a) * this.B());
    }
}
