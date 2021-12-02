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
import android.widget.CompoundButton;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.view.h0;
import androidx.core.widget.v;
import android.widget.RadioButton;

public class p extends RadioButton implements v, h0
{
    private final i G;
    private final f H;
    private final w I;
    
    public p(final Context context) {
        this(context, null);
    }
    
    public p(final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.O2);
    }
    
    public p(final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        (this.G = new i((CompoundButton)this)).e(set, n);
        (this.H = new f((View)this)).e(set, n);
        (this.I = new w((TextView)this)).m(set, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final f h = this.H;
        if (h != null) {
            h.b();
        }
        final w i = this.I;
        if (i != null) {
            i.b();
        }
    }
    
    public int getCompoundPaddingLeft() {
        final int compoundPaddingLeft = super.getCompoundPaddingLeft();
        final i g = this.G;
        int b = compoundPaddingLeft;
        if (g != null) {
            b = g.b(compoundPaddingLeft);
        }
        return b;
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportBackgroundTintList() {
        final f h = this.H;
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
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        final f h = this.H;
        PorterDuff$Mode d;
        if (h != null) {
            d = h.d();
        }
        else {
            d = null;
        }
        return d;
    }
    
    @k0
    @t0({ t0.a.I })
    public ColorStateList getSupportButtonTintList() {
        final i g = this.G;
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
    public PorterDuff$Mode getSupportButtonTintMode() {
        final i g = this.G;
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
        final f h = this.H;
        if (h != null) {
            h.f(backgroundDrawable);
        }
    }
    
    public void setBackgroundResource(@s final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        final f h = this.H;
        if (h != null) {
            h.g(backgroundResource);
        }
    }
    
    public void setButtonDrawable(@s final int n) {
        this.setButtonDrawable(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setButtonDrawable(final Drawable buttonDrawable) {
        super.setButtonDrawable(buttonDrawable);
        final i g = this.G;
        if (g != null) {
            g.f();
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintList(@k0 final ColorStateList list) {
        final f h = this.H;
        if (h != null) {
            h.i(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final f h = this.H;
        if (h != null) {
            h.j(porterDuff$Mode);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportButtonTintList(@k0 final ColorStateList list) {
        final i g = this.G;
        if (g != null) {
            g.g(list);
        }
    }
    
    @t0({ t0.a.I })
    public void setSupportButtonTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        final i g = this.G;
        if (g != null) {
            g.h(porterDuff$Mode);
        }
    }
}
