// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.slider;

import com.flask.colorpicker.i;
import android.graphics.Color;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.graphics.PorterDuff$Mode;
import com.flask.colorpicker.builder.d;
import android.content.Context;
import com.flask.colorpicker.e;
import android.graphics.Paint;

public class c extends a
{
    private int P;
    private Paint Q;
    private Paint R;
    private Paint S;
    private e T;
    
    public c(final Context context) {
        super(context);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    public c(final Context context, final AttributeSet set) {
        super(context, set);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    public c(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.Q = d.c().b();
        this.R = d.c().b();
        this.S = d.c().c(-1).h(PorterDuff$Mode.CLEAR).b();
    }
    
    @Override
    protected void b(final Canvas canvas) {
        final int width = canvas.getWidth();
        final int height = canvas.getHeight();
        final float[] array = new float[3];
        Color.colorToHSV(this.P, array);
        final int max = Math.max(2, width / 256);
        int i = 0;
        while (i <= width) {
            final float n = (float)i;
            array[2] = n / (width - 1);
            this.Q.setColor(Color.HSVToColor(array));
            i += max;
            canvas.drawRect(n, 0.0f, (float)i, (float)height, this.Q);
        }
    }
    
    @Override
    protected void c(final Canvas canvas, final float n, final float n2) {
        this.R.setColor(i.c(this.P, super.O));
        canvas.drawCircle(n, n2, (float)super.M, this.S);
        canvas.drawCircle(n, n2, super.M * 0.75f, this.R);
    }
    
    @Override
    protected void e(final float lightness) {
        final e t = this.T;
        if (t != null) {
            t.setLightness(lightness);
        }
    }
    
    public void setColor(final int p) {
        this.P = p;
        super.O = i.f(p);
        if (super.I != null) {
            this.f();
            this.invalidate();
        }
    }
    
    public void setColorPicker(final e t) {
        this.T = t;
    }
}
