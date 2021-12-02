// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import android.graphics.drawable.Drawable$Callback;
import androidx.annotation.p0;
import android.annotation.TargetApi;
import android.view.Gravity;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import o2.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import androidx.annotation.t0;
import androidx.appcompat.widget.LinearLayoutCompat;

@t0({ t0.a.H })
public class f extends LinearLayoutCompat
{
    @k0
    private Drawable k0;
    private final Rect l0;
    private final Rect m0;
    private int n0;
    protected boolean o0;
    boolean p0;
    
    public f(@j0 final Context context) {
        this(context, null);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public f(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.l0 = new Rect();
        this.m0 = new Rect();
        this.n0 = 119;
        this.o0 = true;
        this.p0 = false;
        final TypedArray j = t.j(context, set, o2.a.o.Lf, n, 0, new int[0]);
        this.n0 = j.getInt(o2.a.o.Nf, this.n0);
        final Drawable drawable = j.getDrawable(o2.a.o.Mf);
        if (drawable != null) {
            this.setForeground(drawable);
        }
        this.o0 = j.getBoolean(o2.a.o.Of, true);
        j.recycle();
    }
    
    public void draw(@j0 final Canvas canvas) {
        super.draw(canvas);
        final Drawable k0 = this.k0;
        if (k0 != null) {
            if (this.p0) {
                this.p0 = false;
                final Rect l0 = this.l0;
                final Rect m0 = this.m0;
                final int n = this.getRight() - this.getLeft();
                final int n2 = this.getBottom() - this.getTop();
                if (this.o0) {
                    l0.set(0, 0, n, n2);
                }
                else {
                    l0.set(this.getPaddingLeft(), this.getPaddingTop(), n - this.getPaddingRight(), n2 - this.getPaddingBottom());
                }
                Gravity.apply(this.n0, k0.getIntrinsicWidth(), k0.getIntrinsicHeight(), l0, m0);
                k0.setBounds(m0);
            }
            k0.draw(canvas);
        }
    }
    
    @TargetApi(21)
    @p0(21)
    public void drawableHotspotChanged(final float n, final float n2) {
        super.drawableHotspotChanged(n, n2);
        final Drawable k0 = this.k0;
        if (k0 != null) {
            k0.setHotspot(n, n2);
        }
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable k0 = this.k0;
        if (k0 != null && k0.isStateful()) {
            this.k0.setState(this.getDrawableState());
        }
    }
    
    @k0
    public Drawable getForeground() {
        return this.k0;
    }
    
    public int getForegroundGravity() {
        return this.n0;
    }
    
    @p0(11)
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable k0 = this.k0;
        if (k0 != null) {
            k0.jumpToCurrentState();
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.p0 |= b;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.p0 = true;
    }
    
    public void setForeground(@k0 final Drawable k0) {
        final Drawable k2 = this.k0;
        if (k2 != k0) {
            if (k2 != null) {
                k2.setCallback((Drawable$Callback)null);
                this.unscheduleDrawable(this.k0);
            }
            if ((this.k0 = k0) != null) {
                this.setWillNotDraw(false);
                k0.setCallback((Drawable$Callback)this);
                if (k0.isStateful()) {
                    k0.setState(this.getDrawableState());
                }
                if (this.n0 == 119) {
                    k0.getPadding(new Rect());
                }
            }
            else {
                this.setWillNotDraw(true);
            }
            this.requestLayout();
            this.invalidate();
        }
    }
    
    public void setForegroundGravity(int n0) {
        if (this.n0 != n0) {
            int n2 = n0;
            if ((0x800007 & n0) == 0x0) {
                n2 = (n0 | 0x800003);
            }
            n0 = n2;
            if ((n2 & 0x70) == 0x0) {
                n0 = (n2 | 0x30);
            }
            this.n0 = n0;
            if (n0 == 119 && this.k0 != null) {
                this.k0.getPadding(new Rect());
            }
            this.requestLayout();
        }
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.k0;
    }
}
