// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.core.widget.r;
import android.view.ActionMode$Callback;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.annotation.SuppressLint;
import androidx.annotation.t0;
import android.widget.TextView;
import android.view.View;
import c.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.widget.w;
import androidx.core.widget.b;
import androidx.core.view.h0;
import android.widget.Button;

public class AppCompatButton extends Button implements h0, b, w
{
    private final f G;
    private final androidx.appcompat.widget.w H;
    
    public AppCompatButton(@j0 final Context context) {
        this(context, null);
    }
    
    public AppCompatButton(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, c.a.c.p0);
    }
    
    public AppCompatButton(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        p0.a((View)this, this.getContext());
        (this.G = new f((View)this)).e(set, n);
        final androidx.appcompat.widget.w h = new androidx.appcompat.widget.w((TextView)this);
        (this.H = h).m(set, n);
        h.b();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final f g = this.G;
        if (g != null) {
            g.b();
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.b();
        }
    }
    
    @t0({ t0.a.I })
    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            return h.e();
        }
        return -1;
    }
    
    @t0({ t0.a.I })
    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            return h.f();
        }
        return -1;
    }
    
    @t0({ t0.a.I })
    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            return h.g();
        }
        return -1;
    }
    
    @t0({ t0.a.I })
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            return h.h();
        }
        return new int[0];
    }
    
    @SuppressLint({ "WrongConstant" })
    @t0({ t0.a.I })
    public int getAutoSizeTextType() {
        final boolean a = b.a;
        int n = 0;
        if (a) {
            if (super.getAutoSizeTextType() == 1) {
                n = 1;
            }
            return n;
        }
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            return h.i();
        }
        return 0;
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
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.H.j();
    }
    
    @k0
    @t0({ t0.a.I })
    public PorterDuff$Mode getSupportCompoundDrawablesTintMode() {
        return this.H.k();
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)Button.class.getName());
    }
    
    public void onInitializeAccessibilityNodeInfo(final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)Button.class.getName());
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.o(b, n, n2, n3, n4);
        }
    }
    
    protected void onTextChanged(final CharSequence charSequence, final int n, final int n2, final int n3) {
        super.onTextChanged(charSequence, n, n2, n3);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null && !b.a && h.l()) {
            this.H.c();
        }
    }
    
    @t0({ t0.a.I })
    public void setAutoSizeTextTypeUniformWithConfiguration(final int n, final int n2, final int n3, final int n4) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(n, n2, n3, n4);
        }
        else {
            final androidx.appcompat.widget.w h = this.H;
            if (h != null) {
                h.t(n, n2, n3, n4);
            }
        }
    }
    
    @t0({ t0.a.I })
    public void setAutoSizeTextTypeUniformWithPresetSizes(@j0 final int[] array, final int n) throws IllegalArgumentException {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(array, n);
        }
        else {
            final androidx.appcompat.widget.w h = this.H;
            if (h != null) {
                h.u(array, n);
            }
        }
    }
    
    @t0({ t0.a.I })
    public void setAutoSizeTextTypeWithDefaults(final int autoSizeTextTypeWithDefaults) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(autoSizeTextTypeWithDefaults);
        }
        else {
            final androidx.appcompat.widget.w h = this.H;
            if (h != null) {
                h.v(autoSizeTextTypeWithDefaults);
            }
        }
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
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(r.H((TextView)this, actionMode$Callback));
    }
    
    public void setSupportAllCaps(final boolean b) {
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.s(b);
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
    public void setSupportCompoundDrawablesTintList(@k0 final ColorStateList list) {
        this.H.w(list);
        this.H.b();
    }
    
    @t0({ t0.a.I })
    public void setSupportCompoundDrawablesTintMode(@k0 final PorterDuff$Mode porterDuff$Mode) {
        this.H.x(porterDuff$Mode);
        this.H.b();
    }
    
    public void setTextAppearance(final Context context, final int n) {
        super.setTextAppearance(context, n);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.q(context, n);
        }
    }
    
    public void setTextSize(final int n, final float n2) {
        if (b.a) {
            super.setTextSize(n, n2);
        }
        else {
            final androidx.appcompat.widget.w h = this.H;
            if (h != null) {
                h.A(n, n2);
            }
        }
    }
}
