// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.t0;
import android.content.res.ColorStateList;
import android.widget.TextView;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.view.h0;
import android.widget.MultiAutoCompleteTextView;

public class m extends MultiAutoCompleteTextView implements h0
{
    private static final int[] I;
    private final f G;
    private final w H;
    
    static {
        I = new int[] { 16843126 };
    }
    
    public m(@j0 final Context context) {
        this(context, null);
    }
    
    public m(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.T);
    }
    
    public m(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        final u0 g = u0.G(this.getContext(), set, m.I, n, 0);
        if (g.C(0)) {
            this.setDropDownBackgroundDrawable(g.h(0));
        }
        g.I();
        (this.G = new f((View)this)).e(set, n);
        final w h = new w((TextView)this);
        (this.H = h).m(set, n);
        h.b();
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
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, (View)this);
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
    
    public void setDropDownBackgroundResource(@s final int n) {
        this.setDropDownBackgroundDrawable(androidx.appcompat.content.res.a.d(this.getContext(), n));
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
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final w h = this.H;
        if (h != null) {
            h.q(context, n);
        }
    }
}
