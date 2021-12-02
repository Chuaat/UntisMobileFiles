// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.graphics.drawable.Drawable$Callback;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import androidx.core.view.x0;
import android.view.View;
import androidx.core.view.a0;
import o2.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import androidx.annotation.t0;
import android.widget.FrameLayout;

@t0({ t0.a.H })
public class n extends FrameLayout
{
    @k0
    Drawable G;
    Rect H;
    private Rect I;
    private boolean J;
    private boolean K;
    
    public n(@j0 final Context context) {
        this(context, null);
    }
    
    public n(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public n(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = new Rect();
        this.J = true;
        this.K = true;
        final TypedArray j = t.j(context, set, a.o.op, n, a.n.ya, new int[0]);
        this.G = j.getDrawable(a.o.pp);
        j.recycle();
        this.setWillNotDraw(true);
        androidx.core.view.j0.Y1((View)this, new a0() {
            @Override
            public x0 a(final View view, @j0 final x0 x0) {
                final n a = n.this;
                if (a.H == null) {
                    a.H = new Rect();
                }
                n.this.H.set(x0.p(), x0.r(), x0.q(), x0.o());
                n.this.a(x0);
                n.this.setWillNotDraw(!x0.w() || n.this.G == null);
                androidx.core.view.j0.l1((View)n.this);
                return x0.c();
            }
        });
    }
    
    protected void a(final x0 x0) {
    }
    
    public void draw(@j0 final Canvas canvas) {
        super.draw(canvas);
        final int width = this.getWidth();
        final int height = this.getHeight();
        if (this.H != null && this.G != null) {
            final int save = canvas.save();
            canvas.translate((float)this.getScrollX(), (float)this.getScrollY());
            if (this.J) {
                this.I.set(0, 0, width, this.H.top);
                this.G.setBounds(this.I);
                this.G.draw(canvas);
            }
            if (this.K) {
                this.I.set(0, height - this.H.bottom, width, height);
                this.G.setBounds(this.I);
                this.G.draw(canvas);
            }
            final Rect i = this.I;
            final Rect h = this.H;
            i.set(0, h.top, h.left, height - h.bottom);
            this.G.setBounds(this.I);
            this.G.draw(canvas);
            final Rect j = this.I;
            final Rect h2 = this.H;
            j.set(width - h2.right, h2.top, width, height - h2.bottom);
            this.G.setBounds(this.I);
            this.G.draw(canvas);
            canvas.restoreToCount(save);
        }
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Drawable g = this.G;
        if (g != null) {
            g.setCallback((Drawable$Callback)this);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Drawable g = this.G;
        if (g != null) {
            g.setCallback((Drawable$Callback)null);
        }
    }
    
    public void setDrawBottomInsetForeground(final boolean k) {
        this.K = k;
    }
    
    public void setDrawTopInsetForeground(final boolean j) {
        this.J = j;
    }
    
    public void setScrimInsetForeground(@k0 final Drawable g) {
        this.G = g;
    }
}
