// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import androidx.annotation.t0;
import androidx.annotation.b1;
import android.graphics.Canvas;
import android.view.ViewParent;
import android.view.View;
import androidx.annotation.n0;
import android.os.SystemClock;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.graphics.drawable.Drawable;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.ProgressBar;

public abstract class b<S extends c> extends ProgressBar
{
    public static final int U = 0;
    public static final int V = 1;
    public static final int W = 2;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    static final int d0;
    static final float e0 = 0.2f;
    static final int f0 = 255;
    static final int g0 = 1000;
    S G;
    private int H;
    private boolean I;
    private boolean J;
    private final int K;
    private final int L;
    private long M;
    a N;
    private boolean O;
    private int P;
    private final Runnable Q;
    private final Runnable R;
    private final androidx.vectordrawable.graphics.drawable.b.a S;
    private final androidx.vectordrawable.graphics.drawable.b.a T;
    
    static {
        d0 = o2.a.n.kc;
    }
    
    protected b(@j0 Context context, @k0 final AttributeSet set, @androidx.annotation.f final int n, @x0 final int n2) {
        super(com.google.android.material.theme.overlay.a.c(context, set, n, b.d0), set, n);
        this.M = -1L;
        this.O = false;
        this.P = 4;
        this.Q = new Runnable() {
            @Override
            public void run() {
                b.this.l();
            }
        };
        this.R = new Runnable() {
            @Override
            public void run() {
                b.this.k();
                b.this.M = -1L;
            }
        };
        this.S = new androidx.vectordrawable.graphics.drawable.b.a() {
            @Override
            public void b(final Drawable drawable) {
                com.google.android.material.progressindicator.b.this.setIndeterminate(false);
                com.google.android.material.progressindicator.b.this.p(0, false);
                final b b = com.google.android.material.progressindicator.b.this;
                b.p(b.H, com.google.android.material.progressindicator.b.this.I);
            }
        };
        this.T = new androidx.vectordrawable.graphics.drawable.b.a() {
            @Override
            public void b(final Drawable drawable) {
                super.b(drawable);
                if (!com.google.android.material.progressindicator.b.this.O) {
                    final b b = com.google.android.material.progressindicator.b.this;
                    b.setVisibility(b.P);
                }
            }
        };
        context = this.getContext();
        this.G = this.i(context, set);
        final TypedArray j = t.j(context, set, o2.a.o.c4, n, n2, new int[0]);
        this.K = j.getInt(o2.a.o.i4, -1);
        this.L = Math.min(j.getInt(o2.a.o.g4, -1), 1000);
        j.recycle();
        this.N = new a();
        this.J = true;
    }
    
    @k0
    private j<S> getCurrentDrawingDelegate() {
        final boolean indeterminate = this.isIndeterminate();
        final j<S> j = null;
        j<S> a = null;
        if (indeterminate) {
            if (this.getIndeterminateDrawable() != null) {
                a = this.getIndeterminateDrawable().A();
            }
            return a;
        }
        j<S> b;
        if (this.getProgressDrawable() == null) {
            b = j;
        }
        else {
            b = this.getProgressDrawable().B();
        }
        return b;
    }
    
    private void k() {
        ((i)this.getCurrentDrawable()).v(false, false, true);
        if (this.n()) {
            this.setVisibility(4);
        }
    }
    
    private void l() {
        if (this.L > 0) {
            this.M = SystemClock.uptimeMillis();
        }
        this.setVisibility(0);
    }
    
    private boolean n() {
        return (this.getProgressDrawable() == null || !this.getProgressDrawable().isVisible()) && (this.getIndeterminateDrawable() == null || !this.getIndeterminateDrawable().isVisible());
    }
    
    private void o() {
        if (this.getProgressDrawable() != null && this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().z().d(this.S);
        }
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().b(this.T);
        }
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().b(this.T);
        }
    }
    
    private void r() {
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().d(this.T);
            this.getIndeterminateDrawable().z().h();
        }
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().d(this.T);
        }
    }
    
    @k0
    public Drawable getCurrentDrawable() {
        i i;
        if (this.isIndeterminate()) {
            i = this.getIndeterminateDrawable();
        }
        else {
            i = this.getProgressDrawable();
        }
        return i;
    }
    
    public int getHideAnimationBehavior() {
        return this.G.f;
    }
    
    @k0
    public l<S> getIndeterminateDrawable() {
        return (l<S>)super.getIndeterminateDrawable();
    }
    
    @j0
    public int[] getIndicatorColor() {
        return this.G.c;
    }
    
    @k0
    public h<S> getProgressDrawable() {
        return (h<S>)super.getProgressDrawable();
    }
    
    public int getShowAnimationBehavior() {
        return this.G.e;
    }
    
    @androidx.annotation.l
    public int getTrackColor() {
        return this.G.d;
    }
    
    @n0
    public int getTrackCornerRadius() {
        return this.G.b;
    }
    
    @n0
    public int getTrackThickness() {
        return this.G.a;
    }
    
    protected void h(final boolean b) {
        if (!this.J) {
            return;
        }
        ((i)this.getCurrentDrawable()).v(this.s(), false, b);
    }
    
    abstract S i(@j0 final Context p0, @j0 final AttributeSet p1);
    
    public void invalidate() {
        super.invalidate();
        if (this.getCurrentDrawable() != null) {
            this.getCurrentDrawable().invalidateSelf();
        }
    }
    
    public void j() {
        if (this.getVisibility() != 0) {
            this.removeCallbacks(this.Q);
            return;
        }
        this.removeCallbacks(this.R);
        final long n = SystemClock.uptimeMillis() - this.M;
        final int l = this.L;
        if (n >= l) {
            this.R.run();
            return;
        }
        this.postDelayed(this.R, l - n);
    }
    
    boolean m() {
        Object o = this;
        while (true) {
            final int visibility = ((View)o).getVisibility();
            boolean b = false;
            if (visibility != 0) {
                return false;
            }
            final ViewParent parent = ((View)o).getParent();
            if (parent == null) {
                if (this.getWindowVisibility() == 0) {
                    b = true;
                }
                return b;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            o = parent;
        }
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.o();
        if (this.s()) {
            this.l();
        }
    }
    
    protected void onDetachedFromWindow() {
        this.removeCallbacks(this.R);
        this.removeCallbacks(this.Q);
        ((i)this.getCurrentDrawable()).l();
        this.r();
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(@j0 final Canvas canvas) {
        synchronized (this) {
            final int save = canvas.save();
            if (this.getPaddingLeft() != 0 || this.getPaddingTop() != 0) {
                canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
            }
            if (this.getPaddingRight() != 0 || this.getPaddingBottom() != 0) {
                canvas.clipRect(0, 0, this.getWidth() - (this.getPaddingLeft() + this.getPaddingRight()), this.getHeight() - (this.getPaddingTop() + this.getPaddingBottom()));
            }
            this.getCurrentDrawable().draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    protected void onMeasure(int n, int n2) {
        synchronized (this) {
            super.onMeasure(n, n2);
            final j<S> currentDrawingDelegate = this.getCurrentDrawingDelegate();
            if (currentDrawingDelegate == null) {
                return;
            }
            n = currentDrawingDelegate.e();
            n2 = currentDrawingDelegate.d();
            if (n < 0) {
                n = this.getMeasuredWidth();
            }
            else {
                n = n + this.getPaddingLeft() + this.getPaddingRight();
            }
            if (n2 < 0) {
                n2 = this.getMeasuredHeight();
            }
            else {
                n2 = n2 + this.getPaddingTop() + this.getPaddingBottom();
            }
            this.setMeasuredDimension(n, n2);
        }
    }
    
    protected void onVisibilityChanged(@j0 final View view, final int n) {
        super.onVisibilityChanged(view, n);
        this.h(n == 0);
    }
    
    protected void onWindowVisibilityChanged(final int n) {
        super.onWindowVisibilityChanged(n);
        this.h(false);
    }
    
    public void p(final int n, final boolean i) {
        if (this.isIndeterminate()) {
            if (this.getProgressDrawable() != null) {
                this.H = n;
                this.I = i;
                this.O = true;
                if (this.getIndeterminateDrawable().isVisible() && this.N.a(this.getContext().getContentResolver()) != 0.0f) {
                    this.getIndeterminateDrawable().z().f();
                }
                else {
                    this.S.b(this.getIndeterminateDrawable());
                }
            }
        }
        else {
            super.setProgress(n);
            if (this.getProgressDrawable() != null && !i) {
                this.getProgressDrawable().jumpToCurrentState();
            }
        }
    }
    
    public void q() {
        if (this.K > 0) {
            this.removeCallbacks(this.Q);
            this.postDelayed(this.Q, (long)this.K);
        }
        else {
            this.Q.run();
        }
    }
    
    boolean s() {
        return androidx.core.view.j0.N0((View)this) && this.getWindowVisibility() == 0 && this.m();
    }
    
    @b1
    @t0({ t0.a.H })
    public void setAnimatorDurationScaleProvider(@j0 final a i) {
        this.N = i;
        if (this.getProgressDrawable() != null) {
            this.getProgressDrawable().I = i;
        }
        if (this.getIndeterminateDrawable() != null) {
            this.getIndeterminateDrawable().I = i;
        }
    }
    
    public void setHideAnimationBehavior(final int f) {
        this.G.f = f;
        this.invalidate();
    }
    
    public void setIndeterminate(final boolean indeterminate) {
        synchronized (this) {
            if (indeterminate == this.isIndeterminate()) {
                return;
            }
            if (this.s() && indeterminate) {
                throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
            }
            final i i = (i)this.getCurrentDrawable();
            if (i != null) {
                i.l();
            }
            super.setIndeterminate(indeterminate);
            final i j = (i)this.getCurrentDrawable();
            if (j != null) {
                j.v(this.s(), false, false);
            }
            this.O = false;
        }
    }
    
    public void setIndeterminateDrawable(@k0 final Drawable indeterminateDrawable) {
        if (indeterminateDrawable == null) {
            super.setIndeterminateDrawable((Drawable)null);
            return;
        }
        if (indeterminateDrawable instanceof l) {
            ((i)indeterminateDrawable).l();
            super.setIndeterminateDrawable(indeterminateDrawable);
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
    }
    
    public void setIndicatorColor(@androidx.annotation.l final int... array) {
        int[] array2 = array;
        if (array.length == 0) {
            array2 = new int[] { s2.a.b(this.getContext(), o2.a.c.J2, -1) };
        }
        if (!Arrays.equals(this.getIndicatorColor(), array2)) {
            this.G.c = array2;
            this.getIndeterminateDrawable().z().c();
            this.invalidate();
        }
    }
    
    public void setProgress(final int n) {
        synchronized (this) {
            if (this.isIndeterminate()) {
                return;
            }
            this.p(n, false);
        }
    }
    
    public void setProgressDrawable(@k0 final Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable)null);
            return;
        }
        if (drawable instanceof h) {
            final h progressDrawable = (h)drawable;
            progressDrawable.l();
            super.setProgressDrawable((Drawable)progressDrawable);
            progressDrawable.F(this.getProgress() / (float)this.getMax());
            return;
        }
        throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
    }
    
    public void setShowAnimationBehavior(final int e) {
        this.G.e = e;
        this.invalidate();
    }
    
    public void setTrackColor(@androidx.annotation.l final int d) {
        final c g = this.G;
        if (g.d != d) {
            g.d = d;
            this.invalidate();
        }
    }
    
    public void setTrackCornerRadius(@n0 final int a) {
        final c g = this.G;
        if (g.b != a) {
            g.b = Math.min(a, g.a / 2);
        }
    }
    
    public void setTrackThickness(@n0 final int a) {
        final c g = this.G;
        if (g.a != a) {
            g.a = a;
            this.requestLayout();
        }
    }
    
    public void setVisibilityAfterHide(final int p) {
        if (p != 0 && p != 4 && p != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.P = p;
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface e {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface f {
    }
}
