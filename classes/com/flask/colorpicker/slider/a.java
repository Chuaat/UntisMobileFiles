// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.slider;

import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import com.flask.colorpicker.h;
import androidx.annotation.p;
import android.graphics.Bitmap$Config;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Bitmap;
import android.view.View;

public abstract class a extends View
{
    protected Bitmap G;
    protected Canvas H;
    protected Bitmap I;
    protected Canvas J;
    protected d K;
    protected int L;
    protected int M;
    protected int N;
    protected float O;
    
    public a(final Context context) {
        super(context);
        this.M = 20;
        this.N = 5;
        this.O = 1.0f;
    }
    
    public a(final Context context, final AttributeSet set) {
        super(context, set);
        this.M = 20;
        this.N = 5;
        this.O = 1.0f;
    }
    
    public a(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.M = 20;
        this.N = 5;
        this.O = 1.0f;
    }
    
    protected void a() {
        final int width = this.getWidth();
        final int height = this.getHeight();
        this.I = Bitmap.createBitmap(width - this.L * 2, this.N, Bitmap$Config.ARGB_8888);
        this.J = new Canvas(this.I);
        final Bitmap g = this.G;
        if (g == null || g.getWidth() != width || this.G.getHeight() != height) {
            final Bitmap g2 = this.G;
            if (g2 != null) {
                g2.recycle();
            }
            this.G = Bitmap.createBitmap(width, height, Bitmap$Config.ARGB_8888);
            this.H = new Canvas(this.G);
        }
    }
    
    protected abstract void b(final Canvas p0);
    
    protected abstract void c(final Canvas p0, final float p1, final float p2);
    
    protected int d(@p final int n) {
        return this.getResources().getDimensionPixelSize(n);
    }
    
    protected abstract void e(final float p0);
    
    protected void f() {
        this.M = this.d(h.e.z0);
        this.N = this.d(h.e.y0);
        this.L = this.M;
        if (this.I == null) {
            this.a();
        }
        this.b(this.J);
        this.invalidate();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.I != null) {
            final Canvas h = this.H;
            if (h != null) {
                h.drawColor(0, PorterDuff$Mode.CLEAR);
                this.H.drawBitmap(this.I, (float)this.L, (float)((this.getHeight() - this.I.getHeight()) / 2), (Paint)null);
                this.c(this.H, this.M + this.O * (this.getWidth() - this.M * 2), this.getHeight() / 2.0f);
                canvas.drawBitmap(this.G, 0.0f, 0.0f, (Paint)null);
            }
        }
    }
    
    protected void onMeasure(int size, int size2) {
        super.onMeasure(size, size2);
        final int mode = View$MeasureSpec.getMode(size);
        if (mode != 0) {
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                size = 0;
            }
            else {
                size = View$MeasureSpec.getSize(size);
            }
        }
        final int mode2 = View$MeasureSpec.getMode(size2);
        if (mode2 != 0) {
            if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
                size2 = 0;
            }
            else {
                size2 = View$MeasureSpec.getSize(size2);
            }
        }
        this.setMeasuredDimension(size, size2);
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.f();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        Label_0104: {
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        return true;
                    }
                }
                else {
                    this.e(this.O);
                    final d k = this.K;
                    if (k != null) {
                        k.a(this.O);
                    }
                    break Label_0104;
                }
            }
            if (this.I == null) {
                return true;
            }
            final float n = (motionEvent.getX() - this.L) / this.I.getWidth();
            this.O = n;
            this.e(this.O = Math.max(0.0f, Math.min(n, 1.0f)));
        }
        this.invalidate();
        return true;
    }
    
    public void setOnValueChangedListener(final d k) {
        this.K = k;
    }
}
