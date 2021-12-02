// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.slider;

import com.flask.colorpicker.i;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import com.flask.colorpicker.builder.d;
import android.content.Context;
import com.flask.colorpicker.e;
import android.graphics.Paint;

public class b extends a
{
    public int P;
    private Paint Q;
    private Paint R;
    private Paint S;
    private Paint T;
    private e U;
    
    public b(final Context context) {
        super(context);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().b();
        this.T = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().b();
        this.T = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    public b(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().b();
        this.T = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    @Override
    protected void a() {
        super.a();
        this.Q.setShader(d.b(super.N / 2));
    }
    
    @Override
    protected void b(final Canvas canvas) {
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        final float n = (float)width;
        final float n2 = (float)height;
        canvas.drawRect(0.0f, 0.0f, n, n2, this.Q);
        final int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            final float n3 = (float)i;
            final float n4 = n3 / (width - 1);
            this.R.setColor(this.P);
            this.R.setAlpha(Math.round(n4 * 255.0f));
            i += max;
            canvas.drawRect(n3, 0.0f, (float)i, n2, this.R);
        }
    }
    
    @Override
    protected void c(final Canvas canvas, final float n, final float n2) {
        this.S.setColor(this.P);
        this.S.setAlpha(Math.round(super.O * 255.0f));
        canvas.drawCircle(n, n2, (float)super.M, this.T);
        if (super.O < 1.0f) {
            canvas.drawCircle(n, n2, super.M * 0.75f, this.Q);
        }
        canvas.drawCircle(n, n2, super.M * 0.75f, this.S);
    }
    
    @Override
    protected void e(final float alphaValue) {
        final e u = this.U;
        if (u != null) {
            u.setAlphaValue(alphaValue);
        }
    }
    
    public void setColor(final int p) {
        this.P = p;
        super.O = i.d(p);
        if (super.I != null) {
            this.f();
            this.invalidate();
        }
    }
    
    public void setColorPicker(final e u) {
        this.U = u;
    }
}
