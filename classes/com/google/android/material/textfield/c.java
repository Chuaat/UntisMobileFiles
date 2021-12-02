// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint$Style;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$Callback;
import android.view.View;
import android.graphics.Canvas;
import androidx.annotation.k0;
import com.google.android.material.shape.o;
import android.graphics.RectF;
import androidx.annotation.j0;
import android.graphics.Paint;
import com.google.android.material.shape.j;

class c extends j
{
    @j0
    private final Paint j0;
    @j0
    private final RectF k0;
    private int l0;
    
    c() {
        this((o)null);
    }
    
    c(@k0 o o) {
        if (o == null) {
            o = new o();
        }
        super(o);
        this.j0 = new Paint(1);
        this.V0();
        this.k0 = new RectF();
    }
    
    private void P0(@j0 final Canvas canvas) {
        if (!this.W0(this.getCallback())) {
            canvas.restoreToCount(this.l0);
        }
    }
    
    private void Q0(@j0 final Canvas canvas) {
        final Drawable$Callback callback = this.getCallback();
        if (this.W0(callback)) {
            final View view = (View)callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint)null);
            }
        }
        else {
            this.S0(canvas);
        }
    }
    
    private void S0(@j0 final Canvas canvas) {
        int l0;
        if (Build$VERSION.SDK_INT >= 21) {
            l0 = canvas.saveLayer(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight(), (Paint)null);
        }
        else {
            l0 = canvas.saveLayer(0.0f, 0.0f, (float)canvas.getWidth(), (float)canvas.getHeight(), (Paint)null, 31);
        }
        this.l0 = l0;
    }
    
    private void V0() {
        this.j0.setStyle(Paint$Style.FILL_AND_STROKE);
        this.j0.setColor(-1);
        this.j0.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
    }
    
    private boolean W0(final Drawable$Callback drawable$Callback) {
        return drawable$Callback instanceof View;
    }
    
    boolean O0() {
        return this.k0.isEmpty() ^ true;
    }
    
    void R0() {
        this.T0(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    void T0(final float n, final float n2, final float n3, final float n4) {
        final RectF k0 = this.k0;
        if (n != k0.left || n2 != k0.top || n3 != k0.right || n4 != k0.bottom) {
            k0.set(n, n2, n3, n4);
            this.invalidateSelf();
        }
    }
    
    void U0(@j0 final RectF rectF) {
        this.T0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
    
    @Override
    public void draw(@j0 final Canvas canvas) {
        this.Q0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.k0, this.j0);
        this.P0(canvas);
    }
}
