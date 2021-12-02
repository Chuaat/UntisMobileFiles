// 
// Decompiled by Procyon v0.5.36
// 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.k0;
import android.graphics.drawable.Animatable;
import com.bumptech.glide.request.transition.f;
import android.widget.ImageView;

public abstract class j<Z> extends r<ImageView, Z> implements f.a
{
    @k0
    private Animatable P;
    
    public j(final ImageView imageView) {
        super((View)imageView);
    }
    
    @Deprecated
    public j(final ImageView imageView, final boolean b) {
        super((View)imageView, b);
    }
    
    private void w(@k0 final Z b) {
        if (b instanceof Animatable) {
            (this.P = (Animatable)b).start();
        }
        else {
            this.P = null;
        }
    }
    
    private void y(@k0 final Z b) {
        this.x(b);
        this.w(b);
    }
    
    @Override
    public void a() {
        final Animatable p = this.P;
        if (p != null) {
            p.stop();
        }
    }
    
    @Override
    public void c(@j0 final Z b, @k0 final f<? super Z> f) {
        if (f != null && f.a(b, (f.a)this)) {
            this.w(b);
        }
        else {
            this.y(b);
        }
    }
    
    @Override
    public void d(final Drawable imageDrawable) {
        ((ImageView)super.H).setImageDrawable(imageDrawable);
    }
    
    @Override
    public void f() {
        final Animatable p = this.P;
        if (p != null) {
            p.start();
        }
    }
    
    @Override
    public void h(@k0 final Drawable drawable) {
        super.h(drawable);
        this.y(null);
        this.d(drawable);
    }
    
    @k0
    @Override
    public Drawable i() {
        return ((ImageView)super.H).getDrawable();
    }
    
    @Override
    public void k(@k0 final Drawable drawable) {
        super.k(drawable);
        this.y(null);
        this.d(drawable);
    }
    
    @Override
    public void p(@k0 final Drawable drawable) {
        super.p(drawable);
        final Animatable p = this.P;
        if (p != null) {
            p.stop();
        }
        this.y(null);
        this.d(drawable);
    }
    
    protected abstract void x(@k0 final Z p0);
}
