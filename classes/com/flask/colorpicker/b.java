// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker;

import android.graphics.Canvas;
import android.graphics.Paint$Style;
import com.flask.colorpicker.builder.d;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;

public class b extends ColorDrawable
{
    private float a;
    private Paint b;
    private Paint c;
    private Paint d;
    
    public b() {
        this.b = com.flask.colorpicker.builder.d.c().g(Paint$Style.STROKE).f(this.a).c(-1).b();
        this.c = com.flask.colorpicker.builder.d.c().g(Paint$Style.FILL).c(0).b();
        this.d = com.flask.colorpicker.builder.d.c().e(com.flask.colorpicker.builder.d.b(16)).b();
    }
    
    public b(final int n) {
        super(n);
        this.b = com.flask.colorpicker.builder.d.c().g(Paint$Style.STROKE).f(this.a).c(-1).b();
        this.c = com.flask.colorpicker.builder.d.c().g(Paint$Style.FILL).c(0).b();
        this.d = com.flask.colorpicker.builder.d.c().e(com.flask.colorpicker.builder.d.b(16)).b();
    }
    
    public void draw(final Canvas canvas) {
        canvas.drawColor(0);
        final float n = canvas.getWidth() / 2.0f;
        final float n2 = n / 12.0f;
        this.a = n2;
        this.b.setStrokeWidth(n2);
        this.c.setColor(this.getColor());
        canvas.drawCircle(n, n, n - this.a * 1.5f, this.d);
        canvas.drawCircle(n, n, n - this.a * 1.5f, this.c);
        canvas.drawCircle(n, n, n - this.a, this.b);
    }
    
    public void setColor(final int color) {
        super.setColor(color);
        this.invalidateSelf();
    }
}
