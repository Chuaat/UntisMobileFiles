// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.progressindicator;

import s2.a;
import android.graphics.Paint$Style;
import androidx.annotation.l;
import android.graphics.Rect;
import androidx.annotation.t;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Canvas;
import androidx.annotation.j0;

final class m extends j<q>
{
    private float c;
    private float d;
    private float e;
    
    public m(@j0 final q q) {
        super(q);
        this.c = 300.0f;
    }
    
    private static void h(final Canvas canvas, final Paint paint, float n, final float n2, float n3, final boolean b, final RectF rectF) {
        canvas.save();
        canvas.translate(n3, 0.0f);
        if (!b) {
            canvas.rotate(180.0f);
        }
        final float n4 = -n2;
        n3 = -n / 2.0f + n2;
        n = n / 2.0f - n2;
        canvas.drawRect(n4, n3, 0.0f, n, paint);
        canvas.save();
        canvas.translate(0.0f, n3);
        canvas.drawArc(rectF, 180.0f, 90.0f, true, paint);
        canvas.restore();
        canvas.translate(0.0f, n);
        canvas.drawArc(rectF, 180.0f, -90.0f, true, paint);
        canvas.restore();
    }
    
    public void a(@j0 final Canvas canvas, @t(from = 0.0, to = 1.0) final float n) {
        final Rect clipBounds = canvas.getClipBounds();
        this.c = (float)clipBounds.width();
        final float n2 = (float)((q)super.a).a;
        canvas.translate(clipBounds.left + clipBounds.width() / 2.0f, clipBounds.top + clipBounds.height() / 2.0f + Math.max(0.0f, (clipBounds.height() - ((q)super.a).a) / 2.0f));
        if (((q)super.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((super.b.n() && ((q)super.a).e == 1) || (super.b.m() && ((q)super.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (super.b.n() || super.b.m()) {
            canvas.translate(0.0f, ((q)super.a).a * (n - 1.0f) / 2.0f);
        }
        final float c = this.c;
        canvas.clipRect(-c / 2.0f, -n2 / 2.0f, c / 2.0f, n2 / 2.0f);
        final c a = super.a;
        this.d = ((q)a).a * n;
        this.e = ((q)a).b * n;
    }
    
    public void b(@j0 final Canvas canvas, @j0 final Paint paint, @t(from = 0.0, to = 1.0) float n, @t(from = 0.0, to = 1.0) float n2, @l final int color) {
        if (n == n2) {
            return;
        }
        final float c = this.c;
        final float n3 = -c / 2.0f;
        final float e = this.e;
        n = n3 + e + (c - e * 2.0f) * n;
        n2 = -c / 2.0f + e + (c - e * 2.0f) * n2;
        paint.setStyle(Paint$Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(color);
        final float d = this.d;
        canvas.drawRect(n, -d / 2.0f, n2, d / 2.0f, paint);
        final float e2 = this.e;
        final RectF rectF = new RectF(-e2, -e2, e2, e2);
        h(canvas, paint, this.d, this.e, n, true, rectF);
        h(canvas, paint, this.d, this.e, n2, false, rectF);
    }
    
    @Override
    void c(@j0 final Canvas canvas, @j0 final Paint paint) {
        final int a = s2.a.a(((q)super.a).d, super.b.getAlpha());
        final float n = -this.c / 2.0f + this.e;
        final float n2 = -n;
        paint.setStyle(Paint$Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        final float d = this.d;
        canvas.drawRect(n, -d / 2.0f, n2, d / 2.0f, paint);
        final float e = this.e;
        final RectF rectF = new RectF(-e, -e, e, e);
        h(canvas, paint, this.d, this.e, n, true, rectF);
        h(canvas, paint, this.d, this.e, n2, false, rectF);
    }
    
    public int d() {
        return ((q)super.a).a;
    }
    
    public int e() {
        return -1;
    }
}
