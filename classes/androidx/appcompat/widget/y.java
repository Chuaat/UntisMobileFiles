// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.view.h0;
import android.widget.ToggleButton;

public class y extends ToggleButton implements h0
{
    private final f G;
    private final w H;
    
    public y(@j0 final Context context) {
        this(context, null);
    }
    
    public y(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 16842827);
    }
    
    public y(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        p0.a((View)this, this.getContext());
        (this.G = new f((View)this)).e(set, n);
        (this.H = new w((TextView)this)).m(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final f g = this.G;
        if (g != null) {
            g.b();
        }
        final w h = this.H;
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
}
