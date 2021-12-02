// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.View;
import android.graphics.Rect;

public abstract class z
{
    private static final int d = Integer.MIN_VALUE;
    public static final int e = 0;
    public static final int f = 1;
    protected final RecyclerView.p a;
    private int b;
    final Rect c;
    
    private z(final RecyclerView.p a) {
        this.b = Integer.MIN_VALUE;
        this.c = new Rect();
        this.a = a;
    }
    
    public static z a(final RecyclerView.p p) {
        return new z(p) {
            @Override
            public int d(final View view) {
                return super.a.b0(view) + ((RecyclerView.q)view.getLayoutParams()).rightMargin;
            }
            
            @Override
            public int e(final View view) {
                final RecyclerView.q q = (RecyclerView.q)view.getLayoutParams();
                return super.a.a0(view) + q.leftMargin + q.rightMargin;
            }
            
            @Override
            public int f(final View view) {
                final RecyclerView.q q = (RecyclerView.q)view.getLayoutParams();
                return super.a.Z(view) + q.topMargin + q.bottomMargin;
            }
            
            @Override
            public int g(final View view) {
                return super.a.Y(view) - ((RecyclerView.q)view.getLayoutParams()).leftMargin;
            }
            
            @Override
            public int h() {
                return super.a.z0();
            }
            
            @Override
            public int i() {
                return super.a.z0() - super.a.p0();
            }
            
            @Override
            public int j() {
                return super.a.p0();
            }
            
            @Override
            public int l() {
                return super.a.A0();
            }
            
            @Override
            public int m() {
                return super.a.f0();
            }
            
            @Override
            public int n() {
                return super.a.o0();
            }
            
            @Override
            public int o() {
                return super.a.z0() - super.a.o0() - super.a.p0();
            }
            
            @Override
            public int q(final View view) {
                super.a.y0(view, true, super.c);
                return super.c.right;
            }
            
            @Override
            public int r(final View view) {
                super.a.y0(view, true, super.c);
                return super.c.left;
            }
            
            @Override
            public void s(final View view, final int n) {
                view.offsetLeftAndRight(n);
            }
            
            @Override
            public void t(final int n) {
                super.a.T0(n);
            }
        };
    }
    
    public static z b(final RecyclerView.p p2, final int n) {
        if (n == 0) {
            return a(p2);
        }
        if (n == 1) {
            return c(p2);
        }
        throw new IllegalArgumentException("invalid orientation");
    }
    
    public static z c(final RecyclerView.p p) {
        return new z(p) {
            @Override
            public int d(final View view) {
                return super.a.W(view) + ((RecyclerView.q)view.getLayoutParams()).bottomMargin;
            }
            
            @Override
            public int e(final View view) {
                final RecyclerView.q q = (RecyclerView.q)view.getLayoutParams();
                return super.a.Z(view) + q.topMargin + q.bottomMargin;
            }
            
            @Override
            public int f(final View view) {
                final RecyclerView.q q = (RecyclerView.q)view.getLayoutParams();
                return super.a.a0(view) + q.leftMargin + q.rightMargin;
            }
            
            @Override
            public int g(final View view) {
                return super.a.c0(view) - ((RecyclerView.q)view.getLayoutParams()).topMargin;
            }
            
            @Override
            public int h() {
                return super.a.e0();
            }
            
            @Override
            public int i() {
                return super.a.e0() - super.a.m0();
            }
            
            @Override
            public int j() {
                return super.a.m0();
            }
            
            @Override
            public int l() {
                return super.a.f0();
            }
            
            @Override
            public int m() {
                return super.a.A0();
            }
            
            @Override
            public int n() {
                return super.a.r0();
            }
            
            @Override
            public int o() {
                return super.a.e0() - super.a.r0() - super.a.m0();
            }
            
            @Override
            public int q(final View view) {
                super.a.y0(view, true, super.c);
                return super.c.bottom;
            }
            
            @Override
            public int r(final View view) {
                super.a.y0(view, true, super.c);
                return super.c.top;
            }
            
            @Override
            public void s(final View view, final int n) {
                view.offsetTopAndBottom(n);
            }
            
            @Override
            public void t(final int n) {
                super.a.U0(n);
            }
        };
    }
    
    public abstract int d(final View p0);
    
    public abstract int e(final View p0);
    
    public abstract int f(final View p0);
    
    public abstract int g(final View p0);
    
    public abstract int h();
    
    public abstract int i();
    
    public abstract int j();
    
    public RecyclerView.p k() {
        return this.a;
    }
    
    public abstract int l();
    
    public abstract int m();
    
    public abstract int n();
    
    public abstract int o();
    
    public int p() {
        int n;
        if (Integer.MIN_VALUE == this.b) {
            n = 0;
        }
        else {
            n = this.o() - this.b;
        }
        return n;
    }
    
    public abstract int q(final View p0);
    
    public abstract int r(final View p0);
    
    public abstract void s(final View p0, final int p1);
    
    public abstract void t(final int p0);
    
    public void u() {
        this.b = this.o();
    }
}
