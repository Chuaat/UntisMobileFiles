// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import s2.a;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Style;
import androidx.annotation.l;
import androidx.annotation.t;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.annotation.j0;

final class d extends j<g>
{
    private int c;
    private float d;
    private float e;
    private float f;
    
    public d(@j0 final g g) {
        super(g);
        this.c = 1;
    }
    
    private void h(final Canvas canvas, final Paint paint, final float n, final float n2, float n3, final boolean b, final RectF rectF) {
        float n4;
        if (b) {
            n4 = -1.0f;
        }
        else {
            n4 = 1.0f;
        }
        canvas.save();
        canvas.rotate(n3);
        final float f = this.f;
        n3 = n / 2.0f;
        final float n5 = n4 * n2;
        canvas.drawRect(f - n3 + n2, Math.min(0.0f, this.c * n5), this.f + n3 - n2, Math.max(0.0f, n5 * this.c), paint);
        canvas.translate(this.f - n3 + n2, 0.0f);
        canvas.drawArc(rectF, 180.0f, -n4 * 90.0f * this.c, true, paint);
        canvas.translate(n - n2 * 2.0f, 0.0f);
        canvas.drawArc(rectF, 0.0f, n4 * 90.0f * this.c, true, paint);
        canvas.restore();
    }
    
    private int i() {
        final c a = super.a;
        return ((g)a).g + ((g)a).h * 2;
    }
    
    public void a(@j0 final Canvas canvas, @t(from = 0.0, to = 1.0) float f) {
        final c a = super.a;
        final float n = ((g)a).g / 2.0f + ((g)a).h;
        canvas.translate(n, n);
        canvas.rotate(-90.0f);
        final float n2 = -n;
        canvas.clipRect(n2, n2, n, n);
        final c a2 = super.a;
        int c;
        if (((g)a2).i == 0) {
            c = 1;
        }
        else {
            c = -1;
        }
        this.c = c;
        this.d = ((g)a2).a * f;
        this.e = ((g)a2).b * f;
        this.f = (((g)a2).g - ((g)a2).a) / 2.0f;
        if ((super.b.n() && ((g)super.a).e == 2) || (super.b.m() && ((g)super.a).f == 1)) {
            f = this.f + (1.0f - f) * ((g)super.a).a / 2.0f;
        }
        else {
            if ((super.b.n() || ((g)super.a).e != 1) && (!super.b.m() || ((g)super.a).f != 2)) {
                return;
            }
            f = this.f - (1.0f - f) * ((g)super.a).a / 2.0f;
        }
        this.f = f;
    }
    
    @Override
    void b(@j0 final Canvas canvas, @j0 final Paint paint, @t(from = 0.0, to = 1.0) float a, @t(from = 0.0, to = 1.0) float n, @l int c) {
        if (a == n) {
            return;
        }
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(c);
        paint.setStrokeWidth(this.d);
        c = this.c;
        final float n2 = a * 360.0f * c;
        if (n >= a) {
            a = n - a;
        }
        else {
            a = n + 1.0f - a;
        }
        a = a * 360.0f * c;
        n = this.f;
        canvas.drawArc(new RectF(-n, -n, n, n), n2, a, false, paint);
        if (this.e > 0.0f && Math.abs(a) < 360.0f) {
            paint.setStyle(Paint$Style.FILL);
            n = this.e;
            final RectF rectF = new RectF(-n, -n, n, n);
            this.h(canvas, paint, this.d, this.e, n2, true, rectF);
            this.h(canvas, paint, this.d, this.e, n2 + a, false, rectF);
        }
    }
    
    @Override
    void c(@j0 final Canvas canvas, @j0 final Paint paint) {
        final int a = s2.a.a(((g)super.a).d, super.b.getAlpha());
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeCap(Paint$Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.d);
        final float f = this.f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }
    
    public int d() {
        return this.i();
    }
    
    public int e() {
        return this.i();
    }
}
