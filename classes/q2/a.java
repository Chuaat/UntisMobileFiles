// 
// Decompiled by Procyon v0.5.36
// 

package q2;

import androidx.annotation.l;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;

public class a extends com.google.android.material.card.a implements g
{
    @j0
    private final com.google.android.material.circularreveal.d d0;
    
    public a(final Context context) {
        this(context, null);
    }
    
    public a(final Context context, final AttributeSet set) {
        super(context, set);
        this.d0 = new com.google.android.material.circularreveal.d((com.google.android.material.circularreveal.d.a)this);
    }
    
    @Override
    public void a() {
        this.d0.a();
    }
    
    @Override
    public void b() {
        this.d0.b();
    }
    
    public void c(final Canvas canvas) {
        super.draw(canvas);
    }
    
    public boolean d() {
        return super.isOpaque();
    }
    
    @Override
    public void draw(final Canvas canvas) {
        final com.google.android.material.circularreveal.d d0 = this.d0;
        if (d0 != null) {
            d0.c(canvas);
        }
        else {
            super.draw(canvas);
        }
    }
    
    @k0
    @Override
    public Drawable getCircularRevealOverlayDrawable() {
        return this.d0.g();
    }
    
    @Override
    public int getCircularRevealScrimColor() {
        return this.d0.h();
    }
    
    @k0
    @Override
    public e getRevealInfo() {
        return this.d0.j();
    }
    
    @Override
    public boolean isOpaque() {
        final com.google.android.material.circularreveal.d d0 = this.d0;
        if (d0 != null) {
            return d0.l();
        }
        return super.isOpaque();
    }
    
    @Override
    public void setCircularRevealOverlayDrawable(@k0 final Drawable drawable) {
        this.d0.m(drawable);
    }
    
    @Override
    public void setCircularRevealScrimColor(@l final int n) {
        this.d0.n(n);
    }
    
    @Override
    public void setRevealInfo(@k0 final e e) {
        this.d0.o(e);
    }
}
