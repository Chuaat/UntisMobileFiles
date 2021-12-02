// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cardview.widget;

import androidx.annotation.k0;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import android.graphics.RectF;

class c implements e
{
    final RectF a;
    
    c() {
        this.a = new RectF();
    }
    
    private g p(final Context context, final ColorStateList list, final float n, final float n2, final float n3) {
        return new g(context.getResources(), list, n, n2, n3);
    }
    
    private g q(final d d) {
        return (g)d.f();
    }
    
    @Override
    public void a(final d d, final Context context, final ColorStateList list, final float n, final float n2, final float n3) {
        final g p6 = this.p(context, list, n, n2, n3);
        p6.m(d.d());
        d.c(p6);
        this.i(d);
    }
    
    @Override
    public void b(final d d, final float n) {
        this.q(d).p(n);
        this.i(d);
    }
    
    @Override
    public float c(final d d) {
        return this.q(d).l();
    }
    
    @Override
    public float d(final d d) {
        return this.q(d).g();
    }
    
    @Override
    public void e(final d d) {
    }
    
    @Override
    public void f(final d d, final float n) {
        this.q(d).r(n);
    }
    
    @Override
    public float g(final d d) {
        return this.q(d).i();
    }
    
    @Override
    public ColorStateList h(final d d) {
        return this.q(d).f();
    }
    
    @Override
    public void i(final d d) {
        final Rect rect = new Rect();
        this.q(d).h(rect);
        d.b((int)Math.ceil(this.l(d)), (int)Math.ceil(this.k(d)));
        d.a(rect.left, rect.top, rect.right, rect.bottom);
    }
    
    @Override
    public void j() {
        g.s = (g.a)new g.a() {
            @Override
            public void a(final Canvas canvas, final RectF rectF, final float n, final Paint paint) {
                final float n2 = 2.0f * n;
                final float n3 = rectF.width() - n2 - 1.0f;
                final float height = rectF.height();
                if (n >= 1.0f) {
                    final float n4 = n + 0.5f;
                    final RectF a = c.this.a;
                    final float n5 = -n4;
                    a.set(n5, n5, n4, n4);
                    final int save = canvas.save();
                    canvas.translate(rectF.left + n4, rectF.top + n4);
                    canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(n3, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(height - n2 - 1.0f, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                    canvas.translate(n3, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(c.this.a, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(save);
                    final float left = rectF.left;
                    final float top = rectF.top;
                    canvas.drawRect(left + n4 - 1.0f, top, rectF.right - n4 + 1.0f, top + n4, paint);
                    final float left2 = rectF.left;
                    final float bottom = rectF.bottom;
                    canvas.drawRect(left2 + n4 - 1.0f, bottom - n4, rectF.right - n4 + 1.0f, bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + n, rectF.right, rectF.bottom - n, paint);
            }
        };
    }
    
    @Override
    public float k(final d d) {
        return this.q(d).j();
    }
    
    @Override
    public float l(final d d) {
        return this.q(d).k();
    }
    
    @Override
    public void m(final d d) {
        this.q(d).m(d.d());
        this.i(d);
    }
    
    @Override
    public void n(final d d, @k0 final ColorStateList list) {
        this.q(d).o(list);
    }
    
    @Override
    public void o(final d d, final float n) {
        this.q(d).q(n);
        this.i(d);
    }
}
