// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.net.Uri;
import android.graphics.Bitmap;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.widget.x;
import androidx.core.view.h0;
import android.widget.ImageView;

public class AppCompatImageView extends ImageView implements h0, x
{
    private final f G;
    private final l H;
    
    public AppCompatImageView(@j0 final Context context) {
        this(context, null);
    }
    
    public AppCompatImageView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public AppCompatImageView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        (this.G = new f((View)this)).e(set, n);
        (this.H = new l(this)).f(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final f g = this.G;
        if (g != null) {
            g.b();
        }
        final l h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportBackgroundTintList() {
        final f g = this.G;
        ColorStateList c;
        if (g != null) {
            c = g.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    @k0
    @t0({ t0.a.I })
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final f g = this.G;
        PorterDuff$Mode d;
        if (g != null) {
            d = g.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportImageTintList() {
        final l h = this.H;
        ColorStateList c;
        if (h != null) {
            c = h.c();
        }
        else {
            c = null;
        }
        return c;
    }
    
    @k0
    @t0({ t0.a.I })
    public PorterDuff$Mode getSupportImageTintMode() {
        final l h = this.H;
        PorterDuff$Mode d;
        if (h != null) {
            d = h.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    public boolean hasOverlappingRendering() {
        return this.H.e() && super.hasOverlappingRendering();
    }
    
    public void setBackgroundDrawable(@k0 final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        final f g = this.G;
        if (g != null) {
            g.f(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(@s final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final f g = this.G;
        if (g != null) {
            g.g(backgroundResource);
        }
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        final l h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    public void setImageDrawable(@k0 final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        final l h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    public void setImageResource(@s final int n) {
        final l h = this.H;
        if (h != null) {
            h.g(n);
        }
    }
    
    public void setImageURI(@k0 final Uri imageURI) {
        super.setImageURI(imageURI);
        final l h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintList(@k0 final ColorStateList list) {
        final f g = this.G;
        if (g != null) {
            g.i(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final f g = this.G;
        if (g != null) {
            g.j(porterDuff$Mode);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportImageTintList(@k0 final ColorStateList list) {
        final l h = this.H;
        if (h != null) {
            h.i(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportImageTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final l h = this.H;
        if (h != null) {
            h.j(porterDuff$Mode);
        }
    }
}
