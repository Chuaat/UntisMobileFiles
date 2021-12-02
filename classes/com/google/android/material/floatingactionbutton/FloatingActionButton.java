// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.List;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.annotation.t0;
import androidx.annotation.b1;
import androidx.annotation.y;
import androidx.annotation.p0;
import androidx.annotation.p;
import android.util.Log;
import android.view.MotionEvent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.google.android.material.animation.k;
import androidx.core.util.n;
import androidx.annotation.n0;
import android.animation.Animator$AnimatorListener;
import android.view.View$MeasureSpec;
import android.graphics.ColorFilter;
import androidx.appcompat.widget.j;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.widget.ImageView$ScaleType;
import v2.b;
import android.widget.ImageView;
import com.google.android.material.shape.o;
import com.google.android.material.animation.h;
import com.google.android.material.internal.b0;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import v2.c;
import androidx.annotation.j0;
import androidx.appcompat.widget.l;
import android.graphics.Rect;
import android.graphics.PorterDuff$Mode;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.shape.s;
import v2.a;
import androidx.core.widget.x;
import androidx.core.view.h0;
import com.google.android.material.internal.c0;

public class FloatingActionButton extends c0 implements h0, x, a, s, CoordinatorLayout.b
{
    private static final String a0 = "FloatingActionButton";
    private static final String b0 = "expandableWidgetHelper";
    private static final int c0;
    public static final int d0 = 1;
    public static final int e0 = 0;
    public static final int f0 = -1;
    public static final int g0 = 0;
    private static final int h0 = 470;
    @k0
    private ColorStateList H;
    @k0
    private PorterDuff$Mode I;
    @k0
    private ColorStateList J;
    @k0
    private PorterDuff$Mode K;
    @k0
    private ColorStateList L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    boolean R;
    final Rect S;
    private final Rect T;
    @j0
    private final l U;
    @j0
    private final v2.c V;
    private com.google.android.material.floatingactionbutton.d W;
    
    static {
        c0 = o2.a.n.wa;
    }
    
    public FloatingActionButton(@j0 final Context context) {
        this(context, null);
    }
    
    public FloatingActionButton(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.z5);
    }
    
    public FloatingActionButton(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        final int c0 = FloatingActionButton.c0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, c0), set, n);
        this.S = new Rect();
        this.T = new Rect();
        final Context context2 = this.getContext();
        final TypedArray j = t.j(context2, set, o2.a.o.Qe, n, c0, new int[0]);
        this.H = com.google.android.material.resources.c.a(context2, j, o2.a.o.Se);
        this.I = com.google.android.material.internal.b0.k(j.getInt(o2.a.o.Te, -1), null);
        this.L = com.google.android.material.resources.c.a(context2, j, o2.a.o.df);
        this.N = j.getInt(o2.a.o.Ye, -1);
        this.O = j.getDimensionPixelSize(o2.a.o.Xe, 0);
        this.M = j.getDimensionPixelSize(o2.a.o.Ue, 0);
        final float dimension = j.getDimension(o2.a.o.Ve, 0.0f);
        final float dimension2 = j.getDimension(o2.a.o.af, 0.0f);
        final float dimension3 = j.getDimension(o2.a.o.cf, 0.0f);
        this.R = j.getBoolean(o2.a.o.hf, false);
        final int dimensionPixelSize = this.getResources().getDimensionPixelSize(o2.a.f.S4);
        this.Q = j.getDimensionPixelSize(o2.a.o.bf, 0);
        final com.google.android.material.animation.h c2 = com.google.android.material.animation.h.c(context2, j, o2.a.o.gf);
        final com.google.android.material.animation.h c3 = com.google.android.material.animation.h.c(context2, j, o2.a.o.Ze);
        final o m = o.g(context2, set, n, c0, o.m).m();
        final boolean boolean1 = j.getBoolean(o2.a.o.We, false);
        this.setEnabled(j.getBoolean(o2.a.o.Re, true));
        j.recycle();
        (this.U = new l((ImageView)this)).f(set, n);
        this.V = new v2.c(this);
        this.getImpl().a0(m);
        this.getImpl().x(this.H, this.I, this.L, this.M);
        this.getImpl().W(dimensionPixelSize);
        this.getImpl().Q(dimension);
        this.getImpl().T(dimension2);
        this.getImpl().X(dimension3);
        this.getImpl().V(this.Q);
        this.getImpl().b0(c2);
        this.getImpl().S(c3);
        this.getImpl().R(boolean1);
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    @k0
    private com.google.android.material.floatingactionbutton.d.j C(@k0 final b b) {
        if (b == null) {
            return null;
        }
        return new com.google.android.material.floatingactionbutton.d.j() {
            @Override
            public void a() {
                b.b(FloatingActionButton.this);
            }
            
            @Override
            public void b() {
                b.a(FloatingActionButton.this);
            }
        };
    }
    
    static /* synthetic */ void e(final FloatingActionButton floatingActionButton, final Drawable backgroundDrawable) {
        floatingActionButton.setBackgroundDrawable(backgroundDrawable);
    }
    
    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.W == null) {
            this.W = this.j();
        }
        return this.W;
    }
    
    @j0
    private com.google.android.material.floatingactionbutton.d j() {
        if (Build$VERSION.SDK_INT >= 21) {
            return new com.google.android.material.floatingactionbutton.e(this, new c());
        }
        return new com.google.android.material.floatingactionbutton.d(this, new c());
    }
    
    private int m(int n) {
        final int o = this.O;
        if (o != 0) {
            return o;
        }
        final Resources resources = this.getResources();
        if (n != -1) {
            if (n != 1) {
                n = o2.a.f.i1;
            }
            else {
                n = o2.a.f.h1;
            }
            return resources.getDimensionPixelSize(n);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            n = this.m(1);
        }
        else {
            n = this.m(0);
        }
        return n;
    }
    
    private void s(@j0 final Rect rect) {
        final int left = rect.left;
        final Rect s = this.S;
        rect.left = left + s.left;
        rect.top += s.top;
        rect.right -= s.right;
        rect.bottom -= s.bottom;
    }
    
    private void t() {
        final Drawable drawable = this.getDrawable();
        if (drawable == null) {
            return;
        }
        final ColorStateList j = this.J;
        if (j == null) {
            androidx.core.graphics.drawable.c.c(drawable);
            return;
        }
        final int colorForState = j.getColorForState(this.getDrawableState(), 0);
        PorterDuff$Mode porterDuff$Mode;
        if ((porterDuff$Mode = this.K) == null) {
            porterDuff$Mode = PorterDuff$Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter((ColorFilter)androidx.appcompat.widget.j.e(colorForState, porterDuff$Mode));
    }
    
    private static int x(int min, int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalArgumentException();
                }
                min = size;
            }
        }
        else {
            min = Math.min(min, size);
        }
        return min;
    }
    
    public void A(@k0 final b b) {
        this.B(b, true);
    }
    
    void B(@k0 final b b, final boolean b2) {
        this.getImpl().f0(this.C(b), b2);
    }
    
    public boolean a(final boolean b) {
        return this.V.f(b);
    }
    
    public boolean b() {
        return this.V.c();
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.getImpl().E(this.getDrawableState());
    }
    
    public void f(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.getImpl().d(animator$AnimatorListener);
    }
    
    public void g(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.getImpl().e(animator$AnimatorListener);
    }
    
    @k0
    public ColorStateList getBackgroundTintList() {
        return this.H;
    }
    
    @k0
    public PorterDuff$Mode getBackgroundTintMode() {
        return this.I;
    }
    
    @j0
    @Override
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }
    
    public float getCompatElevation() {
        return this.getImpl().n();
    }
    
    public float getCompatHoveredFocusedTranslationZ() {
        return this.getImpl().q();
    }
    
    public float getCompatPressedTranslationZ() {
        return this.getImpl().t();
    }
    
    @k0
    public Drawable getContentBackground() {
        return this.getImpl().k();
    }
    
    @n0
    public int getCustomSize() {
        return this.O;
    }
    
    @Override
    public int getExpandedComponentIdHint() {
        return this.V.b();
    }
    
    @k0
    public com.google.android.material.animation.h getHideMotionSpec() {
        return this.getImpl().p();
    }
    
    @Deprecated
    @androidx.annotation.l
    public int getRippleColor() {
        final ColorStateList l = this.L;
        int defaultColor;
        if (l != null) {
            defaultColor = l.getDefaultColor();
        }
        else {
            defaultColor = 0;
        }
        return defaultColor;
    }
    
    @k0
    public ColorStateList getRippleColorStateList() {
        return this.L;
    }
    
    @j0
    @Override
    public o getShapeAppearanceModel() {
        return n.g(this.getImpl().u());
    }
    
    @k0
    public com.google.android.material.animation.h getShowMotionSpec() {
        return this.getImpl().v();
    }
    
    public int getSize() {
        return this.N;
    }
    
    int getSizeDimension() {
        return this.m(this.N);
    }
    
    @k0
    @Override
    public ColorStateList getSupportBackgroundTintList() {
        return this.getBackgroundTintList();
    }
    
    @k0
    @Override
    public PorterDuff$Mode getSupportBackgroundTintMode() {
        return this.getBackgroundTintMode();
    }
    
    @k0
    @Override
    public ColorStateList getSupportImageTintList() {
        return this.J;
    }
    
    @k0
    @Override
    public PorterDuff$Mode getSupportImageTintMode() {
        return this.K;
    }
    
    public boolean getUseCompatPadding() {
        return this.R;
    }
    
    public void h(@j0 final k<? extends FloatingActionButton> k) {
        this.getImpl().f((com.google.android.material.floatingactionbutton.d.i)new e((k<FloatingActionButton>)k));
    }
    
    public void i() {
        this.setCustomSize(0);
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.getImpl().A();
    }
    
    @Deprecated
    public boolean k(@j0 final Rect rect) {
        if (androidx.core.view.j0.T0((View)this)) {
            rect.set(0, 0, this.getWidth(), this.getHeight());
            this.s(rect);
            return true;
        }
        return false;
    }
    
    public void l(@j0 final Rect rect) {
        rect.set(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
        this.s(rect);
    }
    
    public void n() {
        this.o(null);
    }
    
    public void o(@k0 final b b) {
        this.p(b, true);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getImpl().B();
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getImpl().D();
    }
    
    protected void onMeasure(int min, final int n) {
        final int sizeDimension = this.getSizeDimension();
        this.P = (sizeDimension - this.Q) / 2;
        this.getImpl().i0();
        min = Math.min(x(sizeDimension, min), x(sizeDimension, n));
        final Rect s = this.S;
        this.setMeasuredDimension(s.left + min + s.right, min + s.top + s.bottom);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof com.google.android.material.stateful.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final com.google.android.material.stateful.a a = (com.google.android.material.stateful.a)parcelable;
        super.onRestoreInstanceState(a.a());
        this.V.d(n.g(a.I.get("expandableWidgetHelper")));
    }
    
    protected Parcelable onSaveInstanceState() {
        Object onSaveInstanceState;
        if ((onSaveInstanceState = super.onSaveInstanceState()) == null) {
            onSaveInstanceState = new Bundle();
        }
        final com.google.android.material.stateful.a a = new com.google.android.material.stateful.a((Parcelable)onSaveInstanceState);
        a.I.put("expandableWidgetHelper", this.V.e());
        return (Parcelable)a;
    }
    
    public boolean onTouchEvent(@j0 final MotionEvent motionEvent) {
        return (motionEvent.getAction() != 0 || !this.k(this.T) || this.T.contains((int)motionEvent.getX(), (int)motionEvent.getY())) && super.onTouchEvent(motionEvent);
    }
    
    void p(@k0 final b b, final boolean b2) {
        this.getImpl().w(this.C(b), b2);
    }
    
    public boolean q() {
        return this.getImpl().y();
    }
    
    public boolean r() {
        return this.getImpl().z();
    }
    
    public void setBackgroundColor(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundDrawable(final Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundResource(final int n) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }
    
    public void setBackgroundTintList(@k0 final ColorStateList h) {
        if (this.H != h) {
            this.H = h;
            this.getImpl().O(h);
        }
    }
    
    public void setBackgroundTintMode(@k0 final PorterDuff$Mode i) {
        if (this.I != i) {
            this.I = i;
            this.getImpl().P(i);
        }
    }
    
    public void setCompatElevation(final float n) {
        this.getImpl().Q(n);
    }
    
    public void setCompatElevationResource(@p final int n) {
        this.setCompatElevation(this.getResources().getDimension(n));
    }
    
    public void setCompatHoveredFocusedTranslationZ(final float n) {
        this.getImpl().T(n);
    }
    
    public void setCompatHoveredFocusedTranslationZResource(@p final int n) {
        this.setCompatHoveredFocusedTranslationZ(this.getResources().getDimension(n));
    }
    
    public void setCompatPressedTranslationZ(final float n) {
        this.getImpl().X(n);
    }
    
    public void setCompatPressedTranslationZResource(@p final int n) {
        this.setCompatPressedTranslationZ(this.getResources().getDimension(n));
    }
    
    public void setCustomSize(@n0 final int o) {
        if (o >= 0) {
            if (o != this.O) {
                this.O = o;
                this.requestLayout();
            }
            return;
        }
        throw new IllegalArgumentException("Custom size must be non-negative");
    }
    
    @p0(21)
    public void setElevation(final float elevation) {
        super.setElevation(elevation);
        this.getImpl().j0(elevation);
    }
    
    public void setEnsureMinTouchTargetSize(final boolean b) {
        if (b != this.getImpl().o()) {
            this.getImpl().R(b);
            this.requestLayout();
        }
    }
    
    @Override
    public void setExpandedComponentIdHint(@androidx.annotation.y final int n) {
        this.V.g(n);
    }
    
    public void setHideMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.getImpl().S(h);
    }
    
    public void setHideMotionSpecResource(@androidx.annotation.b final int n) {
        this.setHideMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setImageDrawable(@k0 final Drawable imageDrawable) {
        if (this.getDrawable() != imageDrawable) {
            super.setImageDrawable(imageDrawable);
            this.getImpl().h0();
            if (this.J != null) {
                this.t();
            }
        }
    }
    
    public void setImageResource(@androidx.annotation.s final int n) {
        this.U.g(n);
        this.t();
    }
    
    public void setRippleColor(@androidx.annotation.l final int n) {
        this.setRippleColor(ColorStateList.valueOf(n));
    }
    
    public void setRippleColor(@k0 final ColorStateList l) {
        if (this.L != l) {
            this.L = l;
            this.getImpl().Y(this.L);
        }
    }
    
    public void setScaleX(final float scaleX) {
        super.setScaleX(scaleX);
        this.getImpl().I();
    }
    
    public void setScaleY(final float scaleY) {
        super.setScaleY(scaleY);
        this.getImpl().I();
    }
    
    @b1
    @t0({ t0.a.H })
    public void setShadowPaddingEnabled(final boolean b) {
        this.getImpl().Z(b);
    }
    
    @Override
    public void setShapeAppearanceModel(@j0 final o o) {
        this.getImpl().a0(o);
    }
    
    public void setShowMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.getImpl().b0(h);
    }
    
    public void setShowMotionSpecResource(@androidx.annotation.b final int n) {
        this.setShowMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setSize(final int n) {
        this.O = 0;
        if (n != this.N) {
            this.N = n;
            this.requestLayout();
        }
    }
    
    @Override
    public void setSupportBackgroundTintList(@k0 final ColorStateList backgroundTintList) {
        this.setBackgroundTintList(backgroundTintList);
    }
    
    @Override
    public void setSupportBackgroundTintMode(@k0 final PorterDuff$Mode backgroundTintMode) {
        this.setBackgroundTintMode(backgroundTintMode);
    }
    
    @Override
    public void setSupportImageTintList(@k0 final ColorStateList j) {
        if (this.J != j) {
            this.J = j;
            this.t();
        }
    }
    
    @Override
    public void setSupportImageTintMode(@k0 final PorterDuff$Mode k) {
        if (this.K != k) {
            this.K = k;
            this.t();
        }
    }
    
    public void setTranslationX(final float translationX) {
        super.setTranslationX(translationX);
        this.getImpl().J();
    }
    
    public void setTranslationY(final float translationY) {
        super.setTranslationY(translationY);
        this.getImpl().J();
    }
    
    public void setTranslationZ(final float translationZ) {
        super.setTranslationZ(translationZ);
        this.getImpl().J();
    }
    
    public void setUseCompatPadding(final boolean r) {
        if (this.R != r) {
            this.R = r;
            this.getImpl().C();
        }
    }
    
    @Override
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
    }
    
    public void u(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.getImpl().K(animator$AnimatorListener);
    }
    
    public void v(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.getImpl().L(animator$AnimatorListener);
    }
    
    public void w(@j0 final k<? extends FloatingActionButton> k) {
        this.getImpl().M((com.google.android.material.floatingactionbutton.d.i)new e((k<FloatingActionButton>)k));
    }
    
    public boolean y() {
        return this.getImpl().o();
    }
    
    public void z() {
        this.A(null);
    }
    
    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T>
    {
        private static final boolean d = true;
        private Rect a;
        private FloatingActionButton.b b;
        private boolean c;
        
        public BaseBehavior() {
            this.c = true;
        }
        
        public BaseBehavior(final Context context, final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.if);
            this.c = obtainStyledAttributes.getBoolean(o2.a.o.jf, true);
            obtainStyledAttributes.recycle();
        }
        
        private static boolean I(@j0 final View view) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof g && ((g)layoutParams).f() instanceof BottomSheetBehavior;
        }
        
        private void J(@j0 final CoordinatorLayout coordinatorLayout, @j0 final FloatingActionButton floatingActionButton) {
            final Rect s = floatingActionButton.S;
            if (s != null && s.centerX() > 0 && s.centerY() > 0) {
                final g g = (g)floatingActionButton.getLayoutParams();
                final int right = floatingActionButton.getRight();
                final int width = coordinatorLayout.getWidth();
                final int rightMargin = g.rightMargin;
                int bottom = 0;
                int right2;
                if (right >= width - rightMargin) {
                    right2 = s.right;
                }
                else if (floatingActionButton.getLeft() <= g.leftMargin) {
                    right2 = -s.left;
                }
                else {
                    right2 = 0;
                }
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - g.bottomMargin) {
                    bottom = s.bottom;
                }
                else if (floatingActionButton.getTop() <= g.topMargin) {
                    bottom = -s.top;
                }
                if (bottom != 0) {
                    androidx.core.view.j0.d1((View)floatingActionButton, bottom);
                }
                if (right2 != 0) {
                    androidx.core.view.j0.c1((View)floatingActionButton, right2);
                }
            }
        }
        
        private boolean O(@j0 final View view, @j0 final FloatingActionButton floatingActionButton) {
            final g g = (g)floatingActionButton.getLayoutParams();
            return this.c && g.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0;
        }
        
        private boolean P(final CoordinatorLayout coordinatorLayout, @j0 final AppBarLayout appBarLayout, @j0 final FloatingActionButton floatingActionButton) {
            if (!this.O((View)appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            com.google.android.material.internal.c.a(coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.p(this.b, false);
            }
            else {
                floatingActionButton.B(this.b, false);
            }
            return true;
        }
        
        private boolean Q(@j0 final View view, @j0 final FloatingActionButton floatingActionButton) {
            if (!this.O(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < floatingActionButton.getHeight() / 2 + ((g)floatingActionButton.getLayoutParams()).topMargin) {
                floatingActionButton.p(this.b, false);
            }
            else {
                floatingActionButton.B(this.b, false);
            }
            return true;
        }
        
        public boolean G(@j0 final CoordinatorLayout coordinatorLayout, @j0 final FloatingActionButton floatingActionButton, @j0 final Rect rect) {
            final Rect s = floatingActionButton.S;
            rect.set(floatingActionButton.getLeft() + s.left, floatingActionButton.getTop() + s.top, floatingActionButton.getRight() - s.right, floatingActionButton.getBottom() - s.bottom);
            return true;
        }
        
        public boolean H() {
            return this.c;
        }
        
        public boolean K(final CoordinatorLayout coordinatorLayout, @j0 final FloatingActionButton floatingActionButton, final View view) {
            if (view instanceof AppBarLayout) {
                this.P(coordinatorLayout, (AppBarLayout)view, floatingActionButton);
            }
            else if (I(view)) {
                this.Q(view, floatingActionButton);
            }
            return false;
        }
        
        public boolean L(@j0 final CoordinatorLayout coordinatorLayout, @j0 final FloatingActionButton floatingActionButton, final int n) {
            final List<View> w = coordinatorLayout.w((View)floatingActionButton);
            for (int size = w.size(), i = 0; i < size; ++i) {
                final View view = w.get(i);
                if (view instanceof AppBarLayout) {
                    if (this.P(coordinatorLayout, (AppBarLayout)view, floatingActionButton)) {
                        break;
                    }
                }
                else if (I(view) && this.Q(view, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N((View)floatingActionButton, n);
            this.J(coordinatorLayout, floatingActionButton);
            return true;
        }
        
        public void M(final boolean c) {
            this.c = c;
        }
        
        @b1
        public void N(final FloatingActionButton.b b) {
            this.b = b;
        }
        
        @Override
        public void h(@j0 final g g) {
            if (g.h == 0) {
                g.h = 80;
            }
        }
    }
    
    public static class Behavior extends BaseBehavior<FloatingActionButton>
    {
        public Behavior() {
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
        }
    }
    
    public abstract static class b
    {
        public void a(final FloatingActionButton floatingActionButton) {
        }
        
        public void b(final FloatingActionButton floatingActionButton) {
        }
    }
    
    private class c implements com.google.android.material.shadow.c
    {
        c() {
        }
        
        @Override
        public void a(final int n, final int n2, final int n3, final int n4) {
            FloatingActionButton.this.S.set(n, n2, n3, n4);
            final FloatingActionButton a = FloatingActionButton.this;
            a.setPadding(n + a.P, n2 + FloatingActionButton.this.P, n3 + FloatingActionButton.this.P, n4 + FloatingActionButton.this.P);
        }
        
        @Override
        public void b(@k0 final Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.e(FloatingActionButton.this, drawable);
            }
        }
        
        @Override
        public boolean c() {
            return FloatingActionButton.this.R;
        }
        
        @Override
        public float d() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface d {
    }
    
    class e<T extends FloatingActionButton> implements d.i
    {
        @j0
        private final com.google.android.material.animation.k<T> a;
        
        e(final com.google.android.material.animation.k<T> a) {
            this.a = a;
        }
        
        @Override
        public void a() {
            this.a.b((T)FloatingActionButton.this);
        }
        
        @Override
        public void b() {
            this.a.a((T)FloatingActionButton.this);
        }
        
        @Override
        public boolean equals(@k0 final Object o) {
            return o instanceof e && ((e)o).a.equals(this.a);
        }
        
        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }
}
