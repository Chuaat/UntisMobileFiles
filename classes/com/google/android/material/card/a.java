// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.card;

import androidx.annotation.n;
import androidx.annotation.p;
import android.util.Log;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.view.View;
import com.google.android.material.shape.k;
import androidx.annotation.l;
import com.google.android.material.shape.o;
import androidx.annotation.q;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.graphics.RectF;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.j0;
import com.google.android.material.shape.s;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;

public class a extends CardView implements Checkable, s
{
    private static final int[] U;
    private static final int[] V;
    private static final int[] W;
    private static final int a0;
    private static final String b0 = "MaterialCardView";
    private static final String c0 = "androidx.cardview.widget.CardView";
    @j0
    private final b P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private a T;
    
    static {
        U = new int[] { 16842911 };
        V = new int[] { 16842912 };
        W = new int[] { a.c.dd };
        a0 = o2.a.n.jb;
    }
    
    public a(final Context context) {
        this(context, null);
    }
    
    public a(final Context context, final AttributeSet set) {
        this(context, set, a.c.L9);
    }
    
    public a(final Context context, final AttributeSet set, final int n) {
        final int a0 = a.a0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, a0), set, n);
        this.R = false;
        this.S = false;
        this.Q = true;
        final TypedArray j = t.j(this.getContext(), set, o2.a.o.ol, n, a0, new int[0]);
        final b p3 = new b(this, set, n, a0);
        (this.P = p3).H(super.getCardBackgroundColor());
        p3.U(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        p3.E(j);
        j.recycle();
    }
    
    @j0
    private RectF getBoundsAsRectF() {
        final RectF rectF = new RectF();
        rectF.set(this.P.k().getBounds());
        return rectF;
    }
    
    private void j() {
        if (Build$VERSION.SDK_INT > 26) {
            this.P.j();
        }
    }
    
    @j0
    @Override
    public ColorStateList getCardBackgroundColor() {
        return this.P.l();
    }
    
    @j0
    public ColorStateList getCardForegroundColor() {
        return this.P.m();
    }
    
    float getCardViewRadius() {
        return CardView.this.getRadius();
    }
    
    @k0
    public Drawable getCheckedIcon() {
        return this.P.n();
    }
    
    @q
    public int getCheckedIconMargin() {
        return this.P.o();
    }
    
    @q
    public int getCheckedIconSize() {
        return this.P.p();
    }
    
    @k0
    public ColorStateList getCheckedIconTint() {
        return this.P.q();
    }
    
    @Override
    public int getContentPaddingBottom() {
        return this.P.A().bottom;
    }
    
    @Override
    public int getContentPaddingLeft() {
        return this.P.A().left;
    }
    
    @Override
    public int getContentPaddingRight() {
        return this.P.A().right;
    }
    
    @Override
    public int getContentPaddingTop() {
        return this.P.A().top;
    }
    
    @androidx.annotation.t(from = 0.0, to = 1.0)
    public float getProgress() {
        return this.P.u();
    }
    
    @Override
    public float getRadius() {
        return this.P.s();
    }
    
    public ColorStateList getRippleColor() {
        return this.P.v();
    }
    
    @j0
    public o getShapeAppearanceModel() {
        return this.P.w();
    }
    
    @Deprecated
    @l
    public int getStrokeColor() {
        return this.P.x();
    }
    
    @k0
    public ColorStateList getStrokeColorStateList() {
        return this.P.y();
    }
    
    @q
    public int getStrokeWidth() {
        return this.P.z();
    }
    
    @Override
    public void h(final int n, final int n2, final int n3, final int n4) {
        this.P.U(n, n2, n3, n4);
    }
    
    public boolean isChecked() {
        return this.R;
    }
    
    public boolean k() {
        final b p = this.P;
        return p != null && p.D();
    }
    
    public boolean l() {
        return this.S;
    }
    
    void m(final int n, final int n2, final int n3, final int n4) {
        super.h(n, n2, n3, n4);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.f((View)this, this.P.k());
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 3);
        if (this.k()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, a.U);
        }
        if (this.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, a.V);
        }
        if (this.l()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, a.W);
        }
        return onCreateDrawableState;
    }
    
    public void onInitializeAccessibilityEvent(@j0 final AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.isChecked());
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((CharSequence)"androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(this.k());
        accessibilityNodeInfo.setClickable(this.isClickable());
        accessibilityNodeInfo.setChecked(this.isChecked());
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.P.F(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    
    public void setBackground(final Drawable backgroundDrawable) {
        this.setBackgroundDrawable(backgroundDrawable);
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        if (this.Q) {
            if (!this.P.C()) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                this.P.G(true);
            }
            super.setBackgroundDrawable(backgroundDrawable);
        }
    }
    
    void setBackgroundInternal(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
    }
    
    @Override
    public void setCardBackgroundColor(@l final int n) {
        this.P.H(ColorStateList.valueOf(n));
    }
    
    @Override
    public void setCardBackgroundColor(@k0 final ColorStateList list) {
        this.P.H(list);
    }
    
    @Override
    public void setCardElevation(final float cardElevation) {
        super.setCardElevation(cardElevation);
        this.P.Z();
    }
    
    public void setCardForegroundColor(@k0 final ColorStateList list) {
        this.P.I(list);
    }
    
    public void setCheckable(final boolean b) {
        this.P.J(b);
    }
    
    public void setChecked(final boolean b) {
        if (this.R != b) {
            this.toggle();
        }
    }
    
    public void setCheckedIcon(@k0 final Drawable drawable) {
        this.P.K(drawable);
    }
    
    public void setCheckedIconMargin(@q final int n) {
        this.P.L(n);
    }
    
    public void setCheckedIconMarginResource(@p final int n) {
        if (n != -1) {
            this.P.L(this.getResources().getDimensionPixelSize(n));
        }
    }
    
    public void setCheckedIconResource(@androidx.annotation.s final int n) {
        this.P.K(androidx.appcompat.content.res.a.d(this.getContext(), n));
    }
    
    public void setCheckedIconSize(@q final int n) {
        this.P.M(n);
    }
    
    public void setCheckedIconSizeResource(@p final int n) {
        if (n != 0) {
            this.P.M(this.getResources().getDimensionPixelSize(n));
        }
    }
    
    public void setCheckedIconTint(@k0 final ColorStateList list) {
        this.P.N(list);
    }
    
    public void setClickable(final boolean clickable) {
        super.setClickable(clickable);
        final b p = this.P;
        if (p != null) {
            p.X();
        }
    }
    
    public void setDragged(final boolean s) {
        if (this.S != s) {
            this.S = s;
            this.refreshDrawableState();
            this.j();
            this.invalidate();
        }
    }
    
    @Override
    public void setMaxCardElevation(final float maxCardElevation) {
        super.setMaxCardElevation(maxCardElevation);
        this.P.b0();
    }
    
    public void setOnCheckedChangeListener(@k0 final a t) {
        this.T = t;
    }
    
    @Override
    public void setPreventCornerOverlap(final boolean preventCornerOverlap) {
        super.setPreventCornerOverlap(preventCornerOverlap);
        this.P.b0();
        this.P.Y();
    }
    
    public void setProgress(@androidx.annotation.t(from = 0.0, to = 1.0) final float n) {
        this.P.P(n);
    }
    
    @Override
    public void setRadius(final float radius) {
        super.setRadius(radius);
        this.P.O(radius);
    }
    
    public void setRippleColor(@k0 final ColorStateList list) {
        this.P.Q(list);
    }
    
    public void setRippleColorResource(@n final int n) {
        this.P.Q(androidx.appcompat.content.res.a.c(this.getContext(), n));
    }
    
    public void setShapeAppearanceModel(@j0 final o o) {
        if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(o.u(this.getBoundsAsRectF()));
        }
        this.P.R(o);
    }
    
    public void setStrokeColor(@l final int n) {
        this.P.S(ColorStateList.valueOf(n));
    }
    
    public void setStrokeColor(final ColorStateList list) {
        this.P.S(list);
    }
    
    public void setStrokeWidth(@q final int n) {
        this.P.T(n);
    }
    
    @Override
    public void setUseCompatPadding(final boolean useCompatPadding) {
        super.setUseCompatPadding(useCompatPadding);
        this.P.b0();
        this.P.Y();
    }
    
    public void toggle() {
        if (this.k() && this.isEnabled()) {
            this.R ^= true;
            this.refreshDrawableState();
            this.j();
            final a t = this.T;
            if (t != null) {
                t.a(this, this.R);
            }
        }
    }
    
    public interface a
    {
        void a(final com.google.android.material.card.a p0, final boolean p1);
    }
}
