// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cardview.widget;

import androidx.annotation.k0;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.content.Context;
import androidx.annotation.p0;

@p0(21)
class b implements e
{
    private f p(final d d) {
        return (f)d.f();
    }
    
    @Override
    public void a(final d d, final Context context, final ColorStateList list, final float n, final float elevation, final float n2) {
        d.c(new f(list, n));
        final View g = d.g();
        g.setClipToOutline(true);
        g.setElevation(elevation);
        this.o(d, n2);
    }
    
    @Override
    public void b(final d d, final float n) {
        this.p(d).h(n);
    }
    
    @Override
    public float c(final d d) {
        return d.g().getElevation();
    }
    
    @Override
    public float d(final d d) {
        return this.p(d).d();
    }
    
    @Override
    public void e(final d d) {
        this.o(d, this.g(d));
    }
    
    @Override
    public void f(final d d, final float elevation) {
        d.g().setElevation(elevation);
    }
    
    @Override
    public float g(final d d) {
        return this.p(d).c();
    }
    
    @Override
    public ColorStateList h(final d d) {
        return this.p(d).b();
    }
    
    @Override
    public void i(final d d) {
        if (!d.e()) {
            d.a(0, 0, 0, 0);
            return;
        }
        final float g = this.g(d);
        final float d2 = this.d(d);
        final int n = (int)Math.ceil(androidx.cardview.widget.g.c(g, d2, d.d()));
        final int n2 = (int)Math.ceil(androidx.cardview.widget.g.d(g, d2, d.d()));
        d.a(n, n2, n, n2);
    }
    
    @Override
    public void j() {
    }
    
    @Override
    public float k(final d d) {
        return this.d(d) * 2.0f;
    }
    
    @Override
    public float l(final d d) {
        return this.d(d) * 2.0f;
    }
    
    @Override
    public void m(final d d) {
        this.o(d, this.g(d));
    }
    
    @Override
    public void n(final d d, @k0 final ColorStateList list) {
        this.p(d).f(list);
    }
    
    @Override
    public void o(final d d, final float n) {
        this.p(d).g(n, d.e(), d.d());
        this.i(d);
    }
}
