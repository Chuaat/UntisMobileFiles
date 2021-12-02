// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.core.graphics.x;
import android.graphics.Typeface;
import androidx.annotation.n0;
import androidx.annotation.b0;
import android.view.ActionMode$Callback;
import androidx.appcompat.content.res.a;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.EditorInfo;
import android.os.Build$VERSION;
import android.view.textclassifier.TextClassifier;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.annotation.SuppressLint;
import androidx.annotation.t0;
import java.util.concurrent.ExecutionException;
import androidx.core.widget.r;
import android.view.View;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import androidx.core.text.g;
import java.util.concurrent.Future;
import androidx.core.widget.b;
import androidx.core.widget.w;
import androidx.core.view.h0;
import android.widget.TextView;

public class AppCompatTextView extends TextView implements h0, w, b
{
    private final f G;
    private final androidx.appcompat.widget.w H;
    private final v I;
    private boolean J;
    @k0
    private Future<g> K;
    
    public AppCompatTextView(@j0 final Context context) {
        this(context, null);
    }
    
    public AppCompatTextView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 16842884);
    }
    
    public AppCompatTextView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(r0.b(context), set, n);
        this.J = false;
        p0.a((View)this, this.getContext());
        (this.G = new f((View)this)).e(set, n);
        final androidx.appcompat.widget.w h = new androidx.appcompat.widget.w(this);
        (this.H = h).m(set, n);
        h.b();
        this.I = new v(this);
    }
    
    private void e() {
        final Future<g> k = this.K;
        if (k == null) {
            return;
        }
        try {
            this.K = null;
            r.D(this, k.get());
        }
        catch (InterruptedException | ExecutionException ex) {}
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
    
    public int getFirstBaselineToTopHeight() {
        return r.i(this);
    }
    
    public int getLastBaselineToBottomHeight() {
        return r.j(this);
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
    
    public CharSequence getText() {
        this.e();
        return super.getText();
    }
    
    @j0
    @androidx.annotation.p0(api = 26)
    public TextClassifier getTextClassifier() {
        if (Build$VERSION.SDK_INT < 28) {
            final v i = this.I;
            if (i != null) {
                return i.a();
            }
        }
        return super.getTextClassifier();
    }
    
    @j0
    public g.a getTextMetricsParamsCompat() {
        return r.o(this);
    }
    
    public InputConnection onCreateInputConnection(final EditorInfo editorInfo) {
        final InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.H.r(this, onCreateInputConnection, editorInfo);
        return k.a(onCreateInputConnection, editorInfo, (View)this);
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.o(b, n, n2, n3, n4);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.e();
        super.onMeasure(n, n2);
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
    
    public void setCompoundDrawables(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    @androidx.annotation.p0(17)
    public void setCompoundDrawablesRelative(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    @androidx.annotation.p0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable d = null;
        Drawable d2;
        if (n != 0) {
            d2 = androidx.appcompat.content.res.a.d(context, n);
        }
        else {
            d2 = null;
        }
        Drawable d3;
        if (n2 != 0) {
            d3 = androidx.appcompat.content.res.a.d(context, n2);
        }
        else {
            d3 = null;
        }
        Drawable d4;
        if (n3 != 0) {
            d4 = androidx.appcompat.content.res.a.d(context, n3);
        }
        else {
            d4 = null;
        }
        if (n4 != 0) {
            d = androidx.appcompat.content.res.a.d(context, n4);
        }
        this.setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, d);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    @androidx.annotation.p0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(final int n, final int n2, final int n3, final int n4) {
        final Context context = this.getContext();
        Drawable d = null;
        Drawable d2;
        if (n != 0) {
            d2 = androidx.appcompat.content.res.a.d(context, n);
        }
        else {
            d2 = null;
        }
        Drawable d3;
        if (n2 != 0) {
            d3 = androidx.appcompat.content.res.a.d(context, n2);
        }
        else {
            d3 = null;
        }
        Drawable d4;
        if (n3 != 0) {
            d4 = androidx.appcompat.content.res.a.d(context, n3);
        }
        else {
            d4 = null;
        }
        if (n4 != 0) {
            d = androidx.appcompat.content.res.a.d(context, n4);
        }
        this.setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, d);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    public void setCompoundDrawablesWithIntrinsicBounds(@k0 final Drawable drawable, @k0 final Drawable drawable2, @k0 final Drawable drawable3, @k0 final Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        final androidx.appcompat.widget.w h = this.H;
        if (h != null) {
            h.p();
        }
    }
    
    public void setCustomSelectionActionModeCallback(final ActionMode$Callback actionMode$Callback) {
        super.setCustomSelectionActionModeCallback(r.H(this, actionMode$Callback));
    }
    
    public void setFirstBaselineToTopHeight(@b0(from = 0L) @n0 final int firstBaselineToTopHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(firstBaselineToTopHeight);
        }
        else {
            r.A(this, firstBaselineToTopHeight);
        }
    }
    
    public void setLastBaselineToBottomHeight(@b0(from = 0L) @n0 final int lastBaselineToBottomHeight) {
        if (Build$VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(lastBaselineToBottomHeight);
        }
        else {
            r.B(this, lastBaselineToBottomHeight);
        }
    }
    
    public void setLineHeight(@b0(from = 0L) @n0 final int n) {
        r.C(this, n);
    }
    
    public void setPrecomputedText(@j0 final g g) {
        r.D(this, g);
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
    
    @androidx.annotation.p0(api = 26)
    public void setTextClassifier(@k0 final TextClassifier textClassifier) {
        if (Build$VERSION.SDK_INT < 28) {
            final v i = this.I;
            if (i != null) {
                i.b(textClassifier);
                return;
            }
        }
        super.setTextClassifier(textClassifier);
    }
    
    public void setTextFuture(@k0 final Future<g> k) {
        this.K = k;
        if (k != null) {
            this.requestLayout();
        }
    }
    
    public void setTextMetricsParamsCompat(@j0 final g.a a) {
        r.F(this, a);
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
    
    public void setTypeface(@k0 Typeface typeface, final int n) {
        if (this.J) {
            return;
        }
        Typeface b;
        final Typeface typeface2 = b = null;
        if (typeface != null) {
            b = typeface2;
            if (n > 0) {
                b = x.b(this.getContext(), typeface, n);
            }
        }
        this.J = true;
        if (b != null) {
            typeface = b;
        }
        try {
            super.setTypeface(typeface, n);
        }
        finally {
            this.J = false;
        }
    }
}
