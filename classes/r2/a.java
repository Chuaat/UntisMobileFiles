// 
// Decompiled by Procyon v0.5.36
// 

package r2;

import androidx.annotation.l;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class a extends CoordinatorLayout implements g
{
    @j0
    private final d o0;
    
    public a(@j0 final Context context) {
        this(context, null);
    }
    
    public a(@j0 final Context context, final AttributeSet set) {
        super(context, set);
        this.o0 = new d((com.google.android.material.circularreveal.d.a)this);
    }
    
    @Override
    public void a() {
        this.o0.a();
    }
    
    @Override
    public void b() {
        this.o0.b();
    }
    
    public void c(final Canvas canvas) {
        super.draw(canvas);
    }
    
    public boolean d() {
        return super.isOpaque();
    }
    
    @Override
    public void draw(final Canvas canvas) {
        final d o0 = this.o0;
        if (o0 != null) {
            o0.c(canvas);
        }
        else {
            super.draw(canvas);
        }
    }
    
    @k0
    @Override
    public Drawable getCircularRevealOverlayDrawable() {
        return this.o0.g();
    }
    
    @Override
    public int getCircularRevealScrimColor() {
        return this.o0.h();
    }
    
    @k0
    @Override
    public e getRevealInfo() {
        return this.o0.j();
    }
    
    @Override
    public boolean isOpaque() {
        final d o0 = this.o0;
        if (o0 != null) {
            return o0.l();
        }
        return super.isOpaque();
    }
    
    @Override
    public void setCircularRevealOverlayDrawable(@k0 final Drawable drawable) {
        this.o0.m(drawable);
    }
    
    @Override
    public void setCircularRevealScrimColor(@l final int n) {
        this.o0.n(n);
    }
    
    @Override
    public void setRevealInfo(@k0 final e e) {
        this.o0.o(e);
    }
}
