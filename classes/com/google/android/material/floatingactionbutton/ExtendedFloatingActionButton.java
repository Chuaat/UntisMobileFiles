// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.animation.PropertyValuesHolder;
import java.util.List;
import android.view.ViewGroup;
import com.google.android.material.internal.c;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import android.graphics.Rect;
import androidx.annotation.b;
import android.text.TextUtils;
import androidx.annotation.b1;
import java.util.Iterator;
import android.animation.AnimatorSet;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.TypedArray;
import com.google.android.material.shape.o;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.animation.h;
import com.google.android.material.internal.t;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.content.res.ColorStateList;
import androidx.annotation.j0;
import android.view.View;
import android.util.Property;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b
{
    static final Property<View, Float> A0;
    static final Property<View, Float> B0;
    static final Property<View, Float> C0;
    static final Property<View, Float> D0;
    private static final int w0;
    private static final int x0 = 0;
    private static final int y0 = 1;
    private static final int z0 = 2;
    private int i0;
    private final com.google.android.material.floatingactionbutton.a j0;
    @j0
    private final com.google.android.material.floatingactionbutton.f k0;
    @j0
    private final com.google.android.material.floatingactionbutton.f l0;
    private final com.google.android.material.floatingactionbutton.f m0;
    private final com.google.android.material.floatingactionbutton.f n0;
    private final int o0;
    private int p0;
    private int q0;
    @j0
    private final CoordinatorLayout.c<ExtendedFloatingActionButton> r0;
    private boolean s0;
    private boolean t0;
    private boolean u0;
    @j0
    protected ColorStateList v0;
    
    static {
        w0 = o2.a.n.zb;
        A0 = new Property<View, Float>(Float.class, "width") {
            @j0
            public Float a(@j0 final View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }
            
            public void b(@j0 final View view, @j0 final Float n) {
                view.getLayoutParams().width = n.intValue();
                view.requestLayout();
            }
        };
        B0 = new Property<View, Float>(Float.class, "height") {
            @j0
            public Float a(@j0 final View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }
            
            public void b(@j0 final View view, @j0 final Float n) {
                view.getLayoutParams().height = n.intValue();
                view.requestLayout();
            }
        };
        C0 = new Property<View, Float>(Float.class, "paddingStart") {
            @j0
            public Float a(@j0 final View view) {
                return Float.valueOf(androidx.core.view.j0.j0(view));
            }
            
            public void b(@j0 final View view, @j0 final Float n) {
                androidx.core.view.j0.b2(view, n.intValue(), view.getPaddingTop(), androidx.core.view.j0.i0(view), view.getPaddingBottom());
            }
        };
        D0 = new Property<View, Float>(Float.class, "paddingEnd") {
            @j0
            public Float a(@j0 final View view) {
                return Float.valueOf(androidx.core.view.j0.i0(view));
            }
            
            public void b(@j0 final View view, @j0 final Float n) {
                androidx.core.view.j0.b2(view, androidx.core.view.j0.j0(view), view.getPaddingTop(), n.intValue(), view.getPaddingBottom());
            }
        };
    }
    
    public ExtendedFloatingActionButton(@j0 final Context context) {
        this(context, null);
    }
    
    public ExtendedFloatingActionButton(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.k5);
    }
    
    public ExtendedFloatingActionButton(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        final int w0 = ExtendedFloatingActionButton.w0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, w0), set, n);
        this.i0 = 0;
        final com.google.android.material.floatingactionbutton.a j0 = new com.google.android.material.floatingactionbutton.a();
        this.j0 = j0;
        final k m0 = new k(j0);
        this.m0 = m0;
        final i n2 = new i(j0);
        this.n0 = n2;
        this.s0 = true;
        this.t0 = false;
        this.u0 = false;
        final Context context2 = this.getContext();
        this.r0 = new ExtendedFloatingActionButtonBehavior<ExtendedFloatingActionButton>(context2, set);
        final TypedArray i = t.j(context2, set, o2.a.o.Ge, n, w0, new int[0]);
        final com.google.android.material.animation.h c = com.google.android.material.animation.h.c(context2, i, o2.a.o.Le);
        final com.google.android.material.animation.h c2 = com.google.android.material.animation.h.c(context2, i, o2.a.o.Ke);
        final com.google.android.material.animation.h c3 = com.google.android.material.animation.h.c(context2, i, o2.a.o.Je);
        final com.google.android.material.animation.h c4 = com.google.android.material.animation.h.c(context2, i, o2.a.o.Me);
        this.o0 = i.getDimensionPixelSize(o2.a.o.He, -1);
        this.p0 = androidx.core.view.j0.j0((View)this);
        this.q0 = androidx.core.view.j0.i0((View)this);
        final com.google.android.material.floatingactionbutton.a a = new com.google.android.material.floatingactionbutton.a();
        final h l0 = new h(a, new l() {
            @Override
            public int a() {
                return ExtendedFloatingActionButton.this.getMeasuredHeight();
            }
            
            @Override
            public int b() {
                return ExtendedFloatingActionButton.this.getMeasuredWidth() - ExtendedFloatingActionButton.this.getCollapsedPadding() * 2 + ExtendedFloatingActionButton.this.p0 + ExtendedFloatingActionButton.this.q0;
            }
            
            @Override
            public int c() {
                return ExtendedFloatingActionButton.this.q0;
            }
            
            @Override
            public ViewGroup$LayoutParams d() {
                return new ViewGroup$LayoutParams(-2, -2);
            }
            
            @Override
            public int e() {
                return ExtendedFloatingActionButton.this.p0;
            }
        }, true);
        this.l0 = l0;
        final h k0 = new h(a, new l() {
            @Override
            public int a() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
            
            @Override
            public int b() {
                return ExtendedFloatingActionButton.this.getCollapsedSize();
            }
            
            @Override
            public int c() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }
            
            @Override
            public ViewGroup$LayoutParams d() {
                return new ViewGroup$LayoutParams(this.b(), this.a());
            }
            
            @Override
            public int e() {
                return ExtendedFloatingActionButton.this.getCollapsedPadding();
            }
        }, false);
        this.k0 = k0;
        m0.j(c);
        n2.j(c2);
        l0.j(c3);
        k0.j(c4);
        i.recycle();
        this.setShapeAppearanceModel(o.g(context2, set, n, w0, o.m).m());
        this.P();
    }
    
    private boolean I() {
        final int visibility = this.getVisibility();
        final boolean b = false;
        boolean b2 = false;
        if (visibility == 0) {
            if (this.i0 == 1) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (this.i0 != 2) {
            b3 = true;
        }
        return b3;
    }
    
    private boolean J() {
        final int visibility = this.getVisibility();
        final boolean b = false;
        boolean b2 = false;
        if (visibility != 0) {
            if (this.i0 == 2) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (this.i0 != 1) {
            b3 = true;
        }
        return b3;
    }
    
    private void K(@j0 final com.google.android.material.floatingactionbutton.f f, @k0 final j j) {
        if (f.f()) {
            return;
        }
        if (!this.Q()) {
            f.d();
            f.m(j);
            return;
        }
        this.measure(0, 0);
        final AnimatorSet k = f.k();
        ((Animator)k).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            private boolean a;
            
            public void onAnimationCancel(final Animator animator) {
                this.a = true;
                f.a();
            }
            
            public void onAnimationEnd(final Animator animator) {
                f.i();
                if (!this.a) {
                    f.m(j);
                }
            }
            
            public void onAnimationStart(final Animator animator) {
                f.onAnimationStart(animator);
                this.a = false;
            }
        });
        final Iterator<Animator$AnimatorListener> iterator = f.l().iterator();
        while (iterator.hasNext()) {
            ((Animator)k).addListener((Animator$AnimatorListener)iterator.next());
        }
        ((Animator)k).start();
    }
    
    private void P() {
        this.v0 = this.getTextColors();
    }
    
    private boolean Q() {
        return (androidx.core.view.j0.T0((View)this) || (!this.J() && this.u0)) && !this.isInEditMode();
    }
    
    public void A(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.n0.h(animator$AnimatorListener);
    }
    
    public void B(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.m0.h(animator$AnimatorListener);
    }
    
    public void C(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.k0.h(animator$AnimatorListener);
    }
    
    public void D() {
        this.K(this.l0, null);
    }
    
    public void E(@j0 final j j) {
        this.K(this.l0, j);
    }
    
    public void F() {
        this.K(this.n0, null);
    }
    
    public void G(@j0 final j j) {
        this.K(this.n0, j);
    }
    
    public final boolean H() {
        return this.s0;
    }
    
    public void L(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.l0.g(animator$AnimatorListener);
    }
    
    public void M(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.n0.g(animator$AnimatorListener);
    }
    
    public void N(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.m0.g(animator$AnimatorListener);
    }
    
    public void O(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.k0.g(animator$AnimatorListener);
    }
    
    public void R() {
        this.K(this.m0, null);
    }
    
    public void S(@j0 final j j) {
        this.K(this.m0, j);
    }
    
    public void T() {
        this.K(this.k0, null);
    }
    
    public void U(@j0 final j j) {
        this.K(this.k0, j);
    }
    
    protected void V(@j0 final ColorStateList textColor) {
        super.setTextColor(textColor);
    }
    
    @j0
    @Override
    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return this.r0;
    }
    
    int getCollapsedPadding() {
        return (this.getCollapsedSize() - this.getIconSize()) / 2;
    }
    
    @b1
    int getCollapsedSize() {
        int o0;
        if ((o0 = this.o0) < 0) {
            o0 = Math.min(androidx.core.view.j0.j0((View)this), androidx.core.view.j0.i0((View)this)) * 2 + this.getIconSize();
        }
        return o0;
    }
    
    @k0
    public com.google.android.material.animation.h getExtendMotionSpec() {
        return this.l0.e();
    }
    
    @k0
    public com.google.android.material.animation.h getHideMotionSpec() {
        return this.n0.e();
    }
    
    @k0
    public com.google.android.material.animation.h getShowMotionSpec() {
        return this.m0.e();
    }
    
    @k0
    public com.google.android.material.animation.h getShrinkMotionSpec() {
        return this.k0.e();
    }
    
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.s0 && TextUtils.isEmpty(this.getText()) && this.getIcon() != null) {
            this.s0 = false;
            this.k0.d();
        }
    }
    
    public void setAnimateShowBeforeLayout(final boolean u0) {
        this.u0 = u0;
    }
    
    public void setExtendMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.l0.j(h);
    }
    
    public void setExtendMotionSpecResource(@b final int n) {
        this.setExtendMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setExtended(final boolean b) {
        if (this.s0 == b) {
            return;
        }
        com.google.android.material.floatingactionbutton.f f;
        if (b) {
            f = this.l0;
        }
        else {
            f = this.k0;
        }
        if (f.f()) {
            return;
        }
        f.d();
    }
    
    public void setHideMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.n0.j(h);
    }
    
    public void setHideMotionSpecResource(@b final int n) {
        this.setHideMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
        if (this.s0 && !this.t0) {
            this.p0 = androidx.core.view.j0.j0((View)this);
            this.q0 = androidx.core.view.j0.i0((View)this);
        }
    }
    
    public void setPaddingRelative(final int p4, final int n, final int q0, final int n2) {
        super.setPaddingRelative(p4, n, q0, n2);
        if (this.s0 && !this.t0) {
            this.p0 = p4;
            this.q0 = q0;
        }
    }
    
    public void setShowMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.m0.j(h);
    }
    
    public void setShowMotionSpecResource(@b final int n) {
        this.setShowMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setShrinkMotionSpec(@k0 final com.google.android.material.animation.h h) {
        this.k0.j(h);
    }
    
    public void setShrinkMotionSpecResource(@b final int n) {
        this.setShrinkMotionSpec(com.google.android.material.animation.h.d(this.getContext(), n));
    }
    
    public void setTextColor(final int textColor) {
        super.setTextColor(textColor);
        this.P();
    }
    
    public void setTextColor(@j0 final ColorStateList textColor) {
        super.setTextColor(textColor);
        this.P();
    }
    
    public void z(@j0 final Animator$AnimatorListener animator$AnimatorListener) {
        this.l0.h(animator$AnimatorListener);
    }
    
    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T>
    {
        private static final boolean f = false;
        private static final boolean g = true;
        private Rect a;
        @k0
        private ExtendedFloatingActionButton.j b;
        @k0
        private ExtendedFloatingActionButton.j c;
        private boolean d;
        private boolean e;
        
        public ExtendedFloatingActionButtonBehavior() {
            this.d = false;
            this.e = true;
        }
        
        public ExtendedFloatingActionButtonBehavior(@j0 final Context context, @k0 final AttributeSet set) {
            super(context, set);
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Ne);
            this.d = obtainStyledAttributes.getBoolean(o2.a.o.Oe, false);
            this.e = obtainStyledAttributes.getBoolean(o2.a.o.Pe, true);
            obtainStyledAttributes.recycle();
        }
        
        private static boolean K(@j0 final View view) {
            final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
            return layoutParams instanceof g && ((g)layoutParams).f() instanceof BottomSheetBehavior;
        }
        
        private boolean R(@j0 final View view, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final g g = (g)extendedFloatingActionButton.getLayoutParams();
            return (this.d || this.e) && g.e() == view.getId();
        }
        
        private boolean T(final CoordinatorLayout coordinatorLayout, @j0 final AppBarLayout appBarLayout, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.R((View)appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            final Rect a = this.a;
            com.google.android.material.internal.c.a(coordinatorLayout, (View)appBarLayout, a);
            if (a.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                this.S(extendedFloatingActionButton);
            }
            else {
                this.G(extendedFloatingActionButton);
            }
            return true;
        }
        
        private boolean U(@j0 final View view, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!this.R(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < extendedFloatingActionButton.getHeight() / 2 + ((g)extendedFloatingActionButton.getLayoutParams()).topMargin) {
                this.S(extendedFloatingActionButton);
            }
            else {
                this.G(extendedFloatingActionButton);
            }
            return true;
        }
        
        protected void G(@j0 final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final boolean e = this.e;
            ExtendedFloatingActionButton.j j;
            if (e) {
                j = this.c;
            }
            else {
                j = this.b;
            }
            com.google.android.material.floatingactionbutton.f f;
            if (e) {
                f = extendedFloatingActionButton.l0;
            }
            else {
                f = extendedFloatingActionButton.m0;
            }
            extendedFloatingActionButton.K(f, j);
        }
        
        public boolean H(@j0 final CoordinatorLayout coordinatorLayout, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton, @j0 final Rect rect) {
            return super.b(coordinatorLayout, (T)extendedFloatingActionButton, rect);
        }
        
        public boolean I() {
            return this.d;
        }
        
        public boolean J() {
            return this.e;
        }
        
        public boolean L(final CoordinatorLayout coordinatorLayout, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton, final View view) {
            if (view instanceof AppBarLayout) {
                this.T(coordinatorLayout, (AppBarLayout)view, extendedFloatingActionButton);
            }
            else if (K(view)) {
                this.U(view, extendedFloatingActionButton);
            }
            return false;
        }
        
        public boolean M(@j0 final CoordinatorLayout coordinatorLayout, @j0 final ExtendedFloatingActionButton extendedFloatingActionButton, final int n) {
            final List<View> w = coordinatorLayout.w((View)extendedFloatingActionButton);
            for (int size = w.size(), i = 0; i < size; ++i) {
                final View view = w.get(i);
                if (view instanceof AppBarLayout) {
                    if (this.T(coordinatorLayout, (AppBarLayout)view, extendedFloatingActionButton)) {
                        break;
                    }
                }
                else if (K(view) && this.U(view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.N((View)extendedFloatingActionButton, n);
            return true;
        }
        
        public void N(final boolean d) {
            this.d = d;
        }
        
        public void O(final boolean e) {
            this.e = e;
        }
        
        @b1
        void P(@k0 final ExtendedFloatingActionButton.j b) {
            this.b = b;
        }
        
        @b1
        void Q(@k0 final ExtendedFloatingActionButton.j c) {
            this.c = c;
        }
        
        protected void S(@j0 final ExtendedFloatingActionButton extendedFloatingActionButton) {
            final boolean e = this.e;
            ExtendedFloatingActionButton.j j;
            if (e) {
                j = this.c;
            }
            else {
                j = this.b;
            }
            com.google.android.material.floatingactionbutton.f f;
            if (e) {
                f = extendedFloatingActionButton.k0;
            }
            else {
                f = extendedFloatingActionButton.n0;
            }
            extendedFloatingActionButton.K(f, j);
        }
        
        @Override
        public void h(@j0 final g g) {
            if (g.h == 0) {
                g.h = 80;
            }
        }
    }
    
    class h extends b
    {
        private final l g;
        private final boolean h;
        
        h(final com.google.android.material.floatingactionbutton.a a, final l g, final boolean h) {
            super(ExtendedFloatingActionButton.this, a);
            this.g = g;
            this.h = h;
        }
        
        @Override
        public int c() {
            int n;
            if (this.h) {
                n = a.b.m;
            }
            else {
                n = a.b.l;
            }
            return n;
        }
        
        @Override
        public void d() {
            ExtendedFloatingActionButton.this.s0 = this.h;
            final ViewGroup$LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.d().width;
            layoutParams.height = this.g.d().height;
            androidx.core.view.j0.b2((View)ExtendedFloatingActionButton.this, this.g.e(), ExtendedFloatingActionButton.this.getPaddingTop(), this.g.c(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }
        
        @Override
        public boolean f() {
            return this.h == ExtendedFloatingActionButton.this.s0 || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }
        
        @Override
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.t0 = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            final ViewGroup$LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.g.d().width;
            layoutParams.height = this.g.d().height;
        }
        
        @j0
        @Override
        public AnimatorSet k() {
            final com.google.android.material.animation.h b = this.b();
            if (b.j("width")) {
                final PropertyValuesHolder[] g = b.g("width");
                g[0].setFloatValues(new float[] { (float)ExtendedFloatingActionButton.this.getWidth(), (float)this.g.b() });
                b.l("width", g);
            }
            if (b.j("height")) {
                final PropertyValuesHolder[] g2 = b.g("height");
                g2[0].setFloatValues(new float[] { (float)ExtendedFloatingActionButton.this.getHeight(), (float)this.g.a() });
                b.l("height", g2);
            }
            if (b.j("paddingStart")) {
                final PropertyValuesHolder[] g3 = b.g("paddingStart");
                g3[0].setFloatValues(new float[] { (float)androidx.core.view.j0.j0((View)ExtendedFloatingActionButton.this), (float)this.g.e() });
                b.l("paddingStart", g3);
            }
            if (b.j("paddingEnd")) {
                final PropertyValuesHolder[] g4 = b.g("paddingEnd");
                g4[0].setFloatValues(new float[] { (float)androidx.core.view.j0.i0((View)ExtendedFloatingActionButton.this), (float)this.g.c() });
                b.l("paddingEnd", g4);
            }
            if (b.j("labelOpacity")) {
                final PropertyValuesHolder[] g5 = b.g("labelOpacity");
                final boolean h = this.h;
                float n = 0.0f;
                float n2;
                if (h) {
                    n2 = 0.0f;
                }
                else {
                    n2 = 1.0f;
                }
                if (h) {
                    n = 1.0f;
                }
                g5[0].setFloatValues(new float[] { n2, n });
                b.l("labelOpacity", g5);
            }
            return super.o(b);
        }
        
        @Override
        public void m(@k0 final j j) {
            if (j == null) {
                return;
            }
            if (this.h) {
                j.a(ExtendedFloatingActionButton.this);
            }
            else {
                j.d(ExtendedFloatingActionButton.this);
            }
        }
        
        @Override
        public void onAnimationStart(final Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.s0 = this.h;
            ExtendedFloatingActionButton.this.t0 = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }
    
    class i extends b
    {
        private boolean g;
        
        public i(final com.google.android.material.floatingactionbutton.a a) {
            super(ExtendedFloatingActionButton.this, a);
        }
        
        @Override
        public void a() {
            super.a();
            this.g = true;
        }
        
        @Override
        public int c() {
            return a.b.n;
        }
        
        @Override
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
        
        @Override
        public boolean f() {
            return ExtendedFloatingActionButton.this.I();
        }
        
        @Override
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.i0 = 0;
            if (!this.g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }
        
        @Override
        public void m(@k0 final j j) {
            if (j != null) {
                j.b(ExtendedFloatingActionButton.this);
            }
        }
        
        @Override
        public void onAnimationStart(final Animator animator) {
            super.onAnimationStart(animator);
            this.g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.i0 = 1;
        }
    }
    
    public abstract static class j
    {
        public void a(final ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
        
        public void b(final ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
        
        public void c(final ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
        
        public void d(final ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }
    
    class k extends b
    {
        public k(final com.google.android.material.floatingactionbutton.a a) {
            super(ExtendedFloatingActionButton.this, a);
        }
        
        @Override
        public int c() {
            return a.b.o;
        }
        
        @Override
        public void d() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }
        
        @Override
        public boolean f() {
            return ExtendedFloatingActionButton.this.J();
        }
        
        @Override
        public void i() {
            super.i();
            ExtendedFloatingActionButton.this.i0 = 0;
        }
        
        @Override
        public void m(@k0 final j j) {
            if (j != null) {
                j.c(ExtendedFloatingActionButton.this);
            }
        }
        
        @Override
        public void onAnimationStart(final Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.i0 = 2;
        }
    }
    
    interface l
    {
        int a();
        
        int b();
        
        int c();
        
        ViewGroup$LayoutParams d();
        
        int e();
    }
}
