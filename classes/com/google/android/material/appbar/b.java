// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.appbar;

import android.view.ViewConfiguration;
import q.a;
import android.view.MotionEvent;
import androidx.annotation.j0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.content.Context;
import android.view.VelocityTracker;
import android.widget.OverScroller;
import androidx.annotation.k0;
import android.view.View;

abstract class b<V extends View> extends d<V>
{
    private static final int k = -1;
    @k0
    private Runnable d;
    OverScroller e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    @k0
    private VelocityTracker j;
    
    public b() {
        this.g = -1;
        this.i = -1;
    }
    
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.g = -1;
        this.i = -1;
    }
    
    private void Q() {
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
    }
    
    @Override
    public boolean E(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean b = true;
        int n2 = 0;
        Label_0244: {
            int n3 = 0;
            Label_0208: {
                Label_0205: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                break Label_0205;
                            }
                            if (actionMasked == 6) {
                                int n;
                                if (motionEvent.getActionIndex() == 0) {
                                    n = 1;
                                }
                                else {
                                    n = 0;
                                }
                                this.g = motionEvent.getPointerId(n);
                                this.h = (int)(motionEvent.getY(n) + 0.5f);
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.g);
                            if (pointerIndex == -1) {
                                return false;
                            }
                            final int h = (int)motionEvent.getY(pointerIndex);
                            final int h2 = this.h;
                            this.h = h;
                            this.W(coordinatorLayout, v, h2 - h, this.S(v), 0);
                        }
                        n2 = 0;
                        break Label_0244;
                    }
                    final VelocityTracker j = this.j;
                    if (j != null) {
                        j.addMovement(motionEvent);
                        this.j.computeCurrentVelocity(1000);
                        this.R(coordinatorLayout, v, -this.T(v), 0, this.j.getYVelocity(this.g));
                        n3 = 1;
                        break Label_0208;
                    }
                }
                n3 = 0;
            }
            this.f = false;
            this.g = -1;
            final VelocityTracker i = this.j;
            n2 = n3;
            if (i != null) {
                i.recycle();
                this.j = null;
                n2 = n3;
            }
        }
        final VelocityTracker k = this.j;
        if (k != null) {
            k.addMovement(motionEvent);
        }
        boolean b2 = b;
        if (!this.f) {
            b2 = (n2 != 0 && b);
        }
        return b2;
    }
    
    boolean P(final V v) {
        return false;
    }
    
    final boolean R(final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n, final int n2, final float a) {
        final Runnable d = this.d;
        if (d != null) {
            v.removeCallbacks(d);
            this.d = null;
        }
        if (this.e == null) {
            this.e = new OverScroller(v.getContext());
        }
        this.e.fling(0, this.H(), 0, Math.round(a), 0, 0, n, n2);
        if (this.e.computeScrollOffset()) {
            androidx.core.view.j0.n1(v, this.d = new a(coordinatorLayout, v));
            return true;
        }
        this.V(coordinatorLayout, v);
        return false;
    }
    
    int S(@j0 final V v) {
        return -v.getHeight();
    }
    
    int T(@j0 final V v) {
        return v.getHeight();
    }
    
    int U() {
        return this.H();
    }
    
    void V(final CoordinatorLayout coordinatorLayout, final V v) {
    }
    
    final int W(final CoordinatorLayout coordinatorLayout, final V v, final int n, final int n2, final int n3) {
        return this.Y(coordinatorLayout, v, this.U() - n, n2, n3);
    }
    
    int X(final CoordinatorLayout coordinatorLayout, final V v, final int n) {
        return this.Y(coordinatorLayout, v, n, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    int Y(final CoordinatorLayout coordinatorLayout, final V v, int c, final int n, final int n2) {
        final int h = this.H();
        if (n != 0 && h >= n && h <= n2) {
            c = q.a.c(c, n, n2);
            if (h != c) {
                this.N(c);
                c = h - c;
                return c;
            }
        }
        c = 0;
        return c;
    }
    
    @Override
    public boolean l(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
        if (this.i < 0) {
            this.i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f) {
            final int g = this.g;
            if (g == -1) {
                return false;
            }
            final int pointerIndex = motionEvent.findPointerIndex(g);
            if (pointerIndex == -1) {
                return false;
            }
            final int h = (int)motionEvent.getY(pointerIndex);
            if (Math.abs(h - this.h) > this.i) {
                this.h = h;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.g = -1;
            final int n = (int)motionEvent.getX();
            final int h2 = (int)motionEvent.getY();
            final boolean f = this.P(v) && coordinatorLayout.G(v, n, h2);
            this.f = f;
            if (f) {
                this.h = h2;
                this.g = motionEvent.getPointerId(0);
                this.Q();
                final OverScroller e = this.e;
                if (e != null && !e.isFinished()) {
                    this.e.abortAnimation();
                    return true;
                }
            }
        }
        final VelocityTracker j = this.j;
        if (j != null) {
            j.addMovement(motionEvent);
        }
        return false;
    }
    
    private class a implements Runnable
    {
        private final CoordinatorLayout G;
        private final V H;
        
        a(final CoordinatorLayout g, final V h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void run() {
            if (this.H != null) {
                final OverScroller e = b.this.e;
                if (e != null) {
                    if (e.computeScrollOffset()) {
                        final b i = b.this;
                        i.X(this.G, this.H, i.e.getCurrY());
                        androidx.core.view.j0.n1(this.H, this);
                    }
                    else {
                        b.this.V(this.G, this.H);
                    }
                }
            }
        }
    }
}
