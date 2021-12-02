// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.RectF;
import android.view.View$OnLayoutChangeListener;
import java.lang.ref.WeakReference;
import android.graphics.Rect;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.annotation.q;
import androidx.annotation.n0;
import java.util.Collection;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.Iterator;
import android.animation.AnimatorSet;
import androidx.appcompat.widget.ActionMenuView;
import android.animation.ObjectAnimator;
import java.util.List;
import android.animation.Animator$AnimatorListener;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import androidx.core.view.x0;
import com.google.android.material.internal.b0;
import android.graphics.drawable.Drawable;
import android.graphics.Paint$Style;
import com.google.android.material.shape.g;
import com.google.android.material.shape.o;
import com.google.android.material.resources.c;
import com.google.android.material.internal.t;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import o2.a;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.animation.k;
import androidx.annotation.j0;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.h0;
import java.util.ArrayList;
import androidx.annotation.k0;
import android.animation.Animator;
import com.google.android.material.shape.j;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.appcompat.widget.Toolbar;

public class BottomAppBar extends Toolbar implements b
{
    private static final int U0;
    private static final long V0 = 300L;
    public static final int W0 = 0;
    public static final int X0 = 1;
    public static final int Y0 = 0;
    public static final int Z0 = 1;
    private static final int a1 = 0;
    private final com.google.android.material.shape.j A0;
    @k0
    private Animator B0;
    @k0
    private Animator C0;
    private int D0;
    private int E0;
    private boolean F0;
    private final boolean G0;
    private final boolean H0;
    private final boolean I0;
    private int J0;
    private ArrayList<j> K0;
    @h0
    private int L0;
    private boolean M0;
    private boolean N0;
    private Behavior O0;
    private int P0;
    private int Q0;
    private int R0;
    @j0
    AnimatorListenerAdapter S0;
    @j0
    com.google.android.material.animation.k<FloatingActionButton> T0;
    private final int z0;
    
    static {
        U0 = a.n.Pa;
    }
    
    public BottomAppBar(@j0 final Context context) {
        this(context, null, 0);
    }
    
    public BottomAppBar(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.K0);
    }
    
    public BottomAppBar(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        final int u0 = BottomAppBar.U0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, u0), set, n);
        final com.google.android.material.shape.j a0 = new com.google.android.material.shape.j();
        this.A0 = a0;
        this.J0 = 0;
        this.L0 = 0;
        this.M0 = false;
        this.N0 = true;
        this.S0 = new AnimatorListenerAdapter() {
            public void onAnimationStart(final Animator animator) {
                if (!BottomAppBar.this.M0) {
                    final BottomAppBar a = BottomAppBar.this;
                    a.M0(a.D0, BottomAppBar.this.N0);
                }
            }
        };
        this.T0 = new com.google.android.material.animation.k<FloatingActionButton>() {
            public void c(@j0 final FloatingActionButton floatingActionButton) {
                final com.google.android.material.shape.j s0 = BottomAppBar.this.A0;
                float scaleY;
                if (floatingActionButton.getVisibility() == 0) {
                    scaleY = floatingActionButton.getScaleY();
                }
                else {
                    scaleY = 0.0f;
                }
                s0.o0(scaleY);
            }
            
            public void d(@j0 final FloatingActionButton floatingActionButton) {
                final float translationX = floatingActionButton.getTranslationX();
                if (BottomAppBar.this.getTopEdgeTreatment().l() != translationX) {
                    BottomAppBar.this.getTopEdgeTreatment().t(translationX);
                    BottomAppBar.this.A0.invalidateSelf();
                }
                final float b = -floatingActionButton.getTranslationY();
                float scaleY = 0.0f;
                final float max = Math.max(0.0f, b);
                if (BottomAppBar.this.getTopEdgeTreatment().d() != max) {
                    BottomAppBar.this.getTopEdgeTreatment().m(max);
                    BottomAppBar.this.A0.invalidateSelf();
                }
                final com.google.android.material.shape.j s0 = BottomAppBar.this.A0;
                if (floatingActionButton.getVisibility() == 0) {
                    scaleY = floatingActionButton.getScaleY();
                }
                s0.o0(scaleY);
            }
        };
        final Context context2 = this.getContext();
        final TypedArray j = t.j(context2, set, a.o.m4, n, u0, new int[0]);
        final ColorStateList a2 = com.google.android.material.resources.c.a(context2, j, a.o.n4);
        final int dimensionPixelSize = j.getDimensionPixelSize(a.o.o4, 0);
        final float n2 = (float)j.getDimensionPixelOffset(a.o.r4, 0);
        final float n3 = (float)j.getDimensionPixelOffset(a.o.s4, 0);
        final float n4 = (float)j.getDimensionPixelOffset(a.o.t4, 0);
        this.D0 = j.getInt(a.o.p4, 0);
        this.E0 = j.getInt(a.o.q4, 0);
        this.F0 = j.getBoolean(a.o.u4, false);
        this.G0 = j.getBoolean(a.o.v4, false);
        this.H0 = j.getBoolean(a.o.w4, false);
        this.I0 = j.getBoolean(a.o.x4, false);
        j.recycle();
        this.z0 = this.getResources().getDimensionPixelOffset(a.f.U2);
        a0.setShapeAppearanceModel(o.a().G(new com.google.android.material.bottomappbar.a(n2, n3, n4)).m());
        a0.w0(2);
        a0.q0(Paint$Style.FILL);
        a0.Y(context2);
        this.setElevation((float)dimensionPixelSize);
        androidx.core.graphics.drawable.c.o(a0, a2);
        androidx.core.view.j0.G1((View)this, a0);
        b0.c((View)this, set, n, u0, (b0.e)new b0.e() {
            @j0
            @Override
            public x0 a(final View view, @j0 final x0 x0, @j0 final b0.f f) {
                if (BottomAppBar.this.G0) {
                    BottomAppBar.this.P0 = x0.o();
                }
                final boolean w0 = BottomAppBar.this.H0;
                final int n = 1;
                final int n2 = 0;
                boolean b2;
                if (w0) {
                    final boolean b = BottomAppBar.this.R0 != x0.p();
                    BottomAppBar.this.R0 = x0.p();
                    b2 = b;
                }
                else {
                    b2 = false;
                }
                int n3 = n2;
                if (BottomAppBar.this.I0) {
                    if (BottomAppBar.this.Q0 != x0.q()) {
                        n3 = n;
                    }
                    else {
                        n3 = 0;
                    }
                    BottomAppBar.this.Q0 = x0.q();
                }
                if (b2 || n3 != 0) {
                    BottomAppBar.this.B0();
                    BottomAppBar.this.T0();
                    BottomAppBar.this.S0();
                }
                return x0;
            }
        });
    }
    
    private void A0(@j0 final FloatingActionButton floatingActionButton) {
        floatingActionButton.f((Animator$AnimatorListener)this.S0);
        floatingActionButton.g((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationStart(final Animator animator) {
                BottomAppBar.this.S0.onAnimationStart(animator);
                final FloatingActionButton j0 = BottomAppBar.this.H0();
                if (j0 != null) {
                    j0.setTranslationX(BottomAppBar.this.getFabTranslationX());
                }
            }
        });
        floatingActionButton.h(this.T0);
    }
    
    private void B0() {
        final Animator c0 = this.C0;
        if (c0 != null) {
            c0.cancel();
        }
        final Animator b0 = this.B0;
        if (b0 != null) {
            b0.cancel();
        }
    }
    
    private void D0(final int n, @j0 final List<Animator> list) {
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.H0(), "translationX", new float[] { this.K0(n) });
        ofFloat.setDuration(300L);
        list.add((Animator)ofFloat);
    }
    
    private void E0(final int n, final boolean b, @j0 final List<Animator> list) {
        final ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)actionMenuView, "alpha", new float[] { 1.0f });
        if (Math.abs(actionMenuView.getTranslationX() - this.J0(actionMenuView, n, b)) > 1.0f) {
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)actionMenuView, "alpha", new float[] { 0.0f });
            ((Animator)ofFloat2).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public boolean a;
                
                public void onAnimationCancel(final Animator animator) {
                    this.a = true;
                }
                
                public void onAnimationEnd(final Animator animator) {
                    if (!this.a) {
                        final boolean b = BottomAppBar.this.L0 != 0;
                        final BottomAppBar e = BottomAppBar.this;
                        e.R0(e.L0);
                        BottomAppBar.this.X0(actionMenuView, n, b, b);
                    }
                }
            });
            final AnimatorSet set = new AnimatorSet();
            set.setDuration(150L);
            set.playSequentially(new Animator[] { (Animator)ofFloat2, (Animator)ofFloat });
            list.add((Animator)set);
        }
        else if (actionMenuView.getAlpha() < 1.0f) {
            list.add((Animator)ofFloat);
        }
    }
    
    private void F0() {
        final int j0 = this.J0 - 1;
        this.J0 = j0;
        if (j0 == 0) {
            final ArrayList<j> k0 = this.K0;
            if (k0 != null) {
                final Iterator<j> iterator = k0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().b(this);
                }
            }
        }
    }
    
    private void G0() {
        if (this.J0++ == 0) {
            final ArrayList<j> k0 = this.K0;
            if (k0 != null) {
                final Iterator<j> iterator = k0.iterator();
                while (iterator.hasNext()) {
                    iterator.next().a(this);
                }
            }
        }
    }
    
    @k0
    private FloatingActionButton H0() {
        final View i0 = this.I0();
        FloatingActionButton floatingActionButton;
        if (i0 instanceof FloatingActionButton) {
            floatingActionButton = (FloatingActionButton)i0;
        }
        else {
            floatingActionButton = null;
        }
        return floatingActionButton;
    }
    
    @k0
    private View I0() {
        if (!(this.getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (final View view : ((CoordinatorLayout)this.getParent()).x((View)this)) {
            if (view instanceof FloatingActionButton || view instanceof ExtendedFloatingActionButton) {
                return view;
            }
        }
        return null;
    }
    
    private float K0(int n) {
        final boolean j = b0.j((View)this);
        int n2 = 1;
        if (n == 1) {
            if (j) {
                n = this.R0;
            }
            else {
                n = this.Q0;
            }
            final int z0 = this.z0;
            final int n3 = this.getMeasuredWidth() / 2;
            if (j) {
                n2 = -1;
            }
            return (float)((n3 - (z0 + n)) * n2);
        }
        return 0.0f;
    }
    
    private boolean L0() {
        final FloatingActionButton h0 = this.H0();
        return h0 != null && h0.r();
    }
    
    private void M0(int n, boolean b) {
        if (!androidx.core.view.j0.T0((View)this)) {
            this.M0 = false;
            this.R0(this.L0);
            return;
        }
        final Animator c0 = this.C0;
        if (c0 != null) {
            c0.cancel();
        }
        final ArrayList<Animator> list = new ArrayList<Animator>();
        if (!this.L0()) {
            n = 0;
            b = false;
        }
        this.E0(n, b, list);
        final AnimatorSet c2 = new AnimatorSet();
        c2.playTogether((Collection)list);
        (this.C0 = (Animator)c2).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                BottomAppBar.this.F0();
                BottomAppBar.this.M0 = false;
                BottomAppBar.this.C0 = null;
            }
            
            public void onAnimationStart(final Animator animator) {
                BottomAppBar.this.G0();
            }
        });
        this.C0.start();
    }
    
    private void N0(final int n) {
        if (this.D0 != n) {
            if (androidx.core.view.j0.T0((View)this)) {
                final Animator b0 = this.B0;
                if (b0 != null) {
                    b0.cancel();
                }
                final ArrayList<Animator> list = new ArrayList<Animator>();
                if (this.E0 == 1) {
                    this.D0(n, list);
                }
                else {
                    this.C0(n, list);
                }
                final AnimatorSet b2 = new AnimatorSet();
                b2.playTogether((Collection)list);
                (this.B0 = (Animator)b2).addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public void onAnimationEnd(final Animator animator) {
                        BottomAppBar.this.F0();
                        BottomAppBar.this.B0 = null;
                    }
                    
                    public void onAnimationStart(final Animator animator) {
                        BottomAppBar.this.G0();
                    }
                });
                this.B0.start();
            }
        }
    }
    
    private void S0() {
        final ActionMenuView actionMenuView = this.getActionMenuView();
        if (actionMenuView != null && this.C0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!this.L0()) {
                this.W0(actionMenuView, 0, false);
            }
            else {
                this.W0(actionMenuView, this.D0, this.N0);
            }
        }
    }
    
    private void T0() {
        this.getTopEdgeTreatment().t(this.getFabTranslationX());
        final View i0 = this.I0();
        final com.google.android.material.shape.j a0 = this.A0;
        float n;
        if (this.N0 && this.L0()) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        a0.o0(n);
        if (i0 != null) {
            i0.setTranslationY(this.getFabTranslationY());
            i0.setTranslationX(this.getFabTranslationX());
        }
    }
    
    private void W0(@j0 final ActionMenuView actionMenuView, final int n, final boolean b) {
        this.X0(actionMenuView, n, b, false);
    }
    
    private void X0(@j0 final ActionMenuView actionMenuView, final int n, final boolean b, final boolean b2) {
        final Runnable runnable = new Runnable() {
            @Override
            public void run() {
                final ActionMenuView g = actionMenuView;
                g.setTranslationX((float)BottomAppBar.this.J0(g, n, b));
            }
        };
        if (b2) {
            actionMenuView.post((Runnable)runnable);
        }
        else {
            runnable.run();
        }
    }
    
    @k0
    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof ActionMenuView) {
                return (ActionMenuView)child;
            }
        }
        return null;
    }
    
    private int getBottomInset() {
        return this.P0;
    }
    
    private float getFabTranslationX() {
        return this.K0(this.D0);
    }
    
    private float getFabTranslationY() {
        return -this.getTopEdgeTreatment().d();
    }
    
    private int getLeftInset() {
        return this.R0;
    }
    
    private int getRightInset() {
        return this.Q0;
    }
    
    @j0
    private com.google.android.material.bottomappbar.a getTopEdgeTreatment() {
        return (com.google.android.material.bottomappbar.a)this.A0.getShapeAppearanceModel().p();
    }
    
    protected void C0(final int n, final List<Animator> list) {
        final FloatingActionButton h0 = this.H0();
        if (h0 != null) {
            if (!h0.q()) {
                this.G0();
                h0.o((FloatingActionButton.b)new FloatingActionButton.b() {
                    @Override
                    public void a(@j0 final FloatingActionButton floatingActionButton) {
                        floatingActionButton.setTranslationX(BottomAppBar.this.K0(n));
                        floatingActionButton.A((FloatingActionButton.b)new FloatingActionButton.b() {
                            @Override
                            public void b(final FloatingActionButton floatingActionButton) {
                                BottomAppBar.this.F0();
                            }
                        });
                    }
                });
            }
        }
    }
    
    protected int J0(@j0 final ActionMenuView actionMenuView, int n, final boolean b) {
        if (n == 1 && b) {
            final boolean j = b0.j((View)this);
            if (j) {
                n = this.getMeasuredWidth();
            }
            else {
                n = 0;
            }
            int i = 0;
            int n2 = n;
            while (i < this.getChildCount()) {
                final View child = this.getChildAt(i);
                final boolean b2 = child.getLayoutParams() instanceof Toolbar.e && (((Toolbar.e)child.getLayoutParams()).a & 0x800007) == 0x800003;
                n = n2;
                if (b2) {
                    if (j) {
                        n = Math.min(n2, child.getLeft());
                    }
                    else {
                        n = Math.max(n2, child.getRight());
                    }
                }
                ++i;
                n2 = n;
            }
            if (j) {
                n = actionMenuView.getRight();
            }
            else {
                n = actionMenuView.getLeft();
            }
            int q0;
            if (j) {
                q0 = this.Q0;
            }
            else {
                q0 = -this.R0;
            }
            return n2 - (n + q0);
        }
        return 0;
    }
    
    public void O0() {
        this.getBehavior().J(this);
    }
    
    public void P0() {
        this.getBehavior().K(this);
    }
    
    void Q0(@j0 final j o) {
        final ArrayList<j> k0 = this.K0;
        if (k0 == null) {
            return;
        }
        k0.remove(o);
    }
    
    public void R0(@h0 final int n) {
        if (n != 0) {
            this.L0 = 0;
            this.getMenu().clear();
            this.x(n);
        }
    }
    
    public void U0(final int d0, @h0 final int l0) {
        this.L0 = l0;
        this.M0 = true;
        this.M0(d0, this.N0);
        this.N0(d0);
        this.D0 = d0;
    }
    
    boolean V0(@n0 final int n) {
        final float n2 = (float)n;
        if (n2 != this.getTopEdgeTreatment().j()) {
            this.getTopEdgeTreatment().s(n2);
            this.A0.invalidateSelf();
            return true;
        }
        return false;
    }
    
    @k0
    public ColorStateList getBackgroundTint() {
        return this.A0.Q();
    }
    
    @j0
    public Behavior getBehavior() {
        if (this.O0 == null) {
            this.O0 = new Behavior();
        }
        return this.O0;
    }
    
    @q
    public float getCradleVerticalOffset() {
        return this.getTopEdgeTreatment().d();
    }
    
    public int getFabAlignmentMode() {
        return this.D0;
    }
    
    public int getFabAnimationMode() {
        return this.E0;
    }
    
    public float getFabCradleMargin() {
        return this.getTopEdgeTreatment().g();
    }
    
    @q
    public float getFabCradleRoundedCornerRadius() {
        return this.getTopEdgeTreatment().i();
    }
    
    public boolean getHideOnScroll() {
        return this.F0;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.k.f((View)this, this.A0);
        if (this.getParent() instanceof ViewGroup) {
            ((ViewGroup)this.getParent()).setClipChildren(false);
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b) {
            this.B0();
            this.T0();
        }
        this.S0();
    }
    
    @Override
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof m)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final m m = (m)parcelable;
        super.onRestoreInstanceState(m.a());
        this.D0 = m.I;
        this.N0 = m.J;
    }
    
    @j0
    @Override
    protected Parcelable onSaveInstanceState() {
        final m m = new m(super.onSaveInstanceState());
        m.I = this.D0;
        m.J = this.N0;
        return (Parcelable)m;
    }
    
    public void setBackgroundTint(@k0 final ColorStateList list) {
        androidx.core.graphics.drawable.c.o(this.A0, list);
    }
    
    public void setCradleVerticalOffset(@q final float n) {
        if (n != this.getCradleVerticalOffset()) {
            this.getTopEdgeTreatment().m(n);
            this.A0.invalidateSelf();
            this.T0();
        }
    }
    
    public void setElevation(final float n) {
        this.A0.m0(n);
        this.getBehavior().I(this, this.A0.J() - this.A0.I());
    }
    
    public void setFabAlignmentMode(final int n) {
        this.U0(n, 0);
    }
    
    public void setFabAnimationMode(final int e0) {
        this.E0 = e0;
    }
    
    void setFabCornerSize(@q final float n) {
        if (n != this.getTopEdgeTreatment().f()) {
            this.getTopEdgeTreatment().n(n);
            this.A0.invalidateSelf();
        }
    }
    
    public void setFabCradleMargin(@q final float n) {
        if (n != this.getFabCradleMargin()) {
            this.getTopEdgeTreatment().q(n);
            this.A0.invalidateSelf();
        }
    }
    
    public void setFabCradleRoundedCornerRadius(@q final float n) {
        if (n != this.getFabCradleRoundedCornerRadius()) {
            this.getTopEdgeTreatment().r(n);
            this.A0.invalidateSelf();
        }
    }
    
    public void setHideOnScroll(final boolean f0) {
        this.F0 = f0;
    }
    
    @Override
    public void setSubtitle(final CharSequence charSequence) {
    }
    
    @Override
    public void setTitle(final CharSequence charSequence) {
    }
    
    void z0(@j0 final j e) {
        if (this.K0 == null) {
            this.K0 = new ArrayList<j>();
        }
        this.K0.add(e);
    }
    
    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar>
    {
        @j0
        private final Rect i;
        private WeakReference<BottomAppBar> j;
        private int k;
        private final View$OnLayoutChangeListener l;
        
        public Behavior() {
            this.l = (View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, int height, int dimensionPixelOffset, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
                    final BottomAppBar bottomAppBar = (BottomAppBar)Behavior.this.j.get();
                    if (bottomAppBar != null && view instanceof FloatingActionButton) {
                        final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
                        floatingActionButton.l(Behavior.this.i);
                        height = Behavior.this.i.height();
                        bottomAppBar.V0(height);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.i)));
                        final CoordinatorLayout.g g = (CoordinatorLayout.g)view.getLayoutParams();
                        if (Behavior.this.k == 0) {
                            height = (floatingActionButton.getMeasuredHeight() - height) / 2;
                            dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(o2.a.f.V2);
                            g.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - height);
                            g.leftMargin = bottomAppBar.getLeftInset();
                            g.rightMargin = bottomAppBar.getRightInset();
                            if (b0.j((View)floatingActionButton)) {
                                g.leftMargin += bottomAppBar.z0;
                            }
                            else {
                                g.rightMargin += bottomAppBar.z0;
                            }
                        }
                        return;
                    }
                    view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                }
            };
            this.i = new Rect();
        }
        
        public Behavior(final Context context, final AttributeSet set) {
            super(context, set);
            this.l = (View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, int height, int dimensionPixelOffset, final int n, final int n2, final int n3, final int n4, final int n5, final int n6) {
                    final BottomAppBar bottomAppBar = (BottomAppBar)Behavior.this.j.get();
                    if (bottomAppBar != null && view instanceof FloatingActionButton) {
                        final FloatingActionButton floatingActionButton = (FloatingActionButton)view;
                        floatingActionButton.l(Behavior.this.i);
                        height = Behavior.this.i.height();
                        bottomAppBar.V0(height);
                        bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().r().a(new RectF(Behavior.this.i)));
                        final CoordinatorLayout.g g = (CoordinatorLayout.g)view.getLayoutParams();
                        if (Behavior.this.k == 0) {
                            height = (floatingActionButton.getMeasuredHeight() - height) / 2;
                            dimensionPixelOffset = bottomAppBar.getResources().getDimensionPixelOffset(o2.a.f.V2);
                            g.bottomMargin = bottomAppBar.getBottomInset() + (dimensionPixelOffset - height);
                            g.leftMargin = bottomAppBar.getLeftInset();
                            g.rightMargin = bottomAppBar.getRightInset();
                            if (b0.j((View)floatingActionButton)) {
                                g.leftMargin += bottomAppBar.z0;
                            }
                            else {
                                g.rightMargin += bottomAppBar.z0;
                            }
                        }
                        return;
                    }
                    view.removeOnLayoutChangeListener((View$OnLayoutChangeListener)this);
                }
            };
            this.i = new Rect();
        }
        
        public boolean O(@j0 final CoordinatorLayout coordinatorLayout, @j0 final BottomAppBar referent, final int n) {
            this.j = new WeakReference<BottomAppBar>(referent);
            final View q0 = referent.I0();
            if (q0 != null && !androidx.core.view.j0.T0(q0)) {
                final CoordinatorLayout.g g = (CoordinatorLayout.g)q0.getLayoutParams();
                g.d = 49;
                this.k = g.bottomMargin;
                if (q0 instanceof FloatingActionButton) {
                    final FloatingActionButton floatingActionButton = (FloatingActionButton)q0;
                    floatingActionButton.addOnLayoutChangeListener(this.l);
                    referent.A0(floatingActionButton);
                }
                referent.T0();
            }
            coordinatorLayout.N((View)referent, n);
            return super.m(coordinatorLayout, referent, n);
        }
        
        public boolean P(@j0 final CoordinatorLayout coordinatorLayout, @j0 final BottomAppBar bottomAppBar, @j0 final View view, @j0 final View view2, final int n, final int n2) {
            return bottomAppBar.getHideOnScroll() && super.B(coordinatorLayout, bottomAppBar, view, view2, n, n2);
        }
    }
    
    interface j
    {
        void a(final BottomAppBar p0);
        
        void b(final BottomAppBar p0);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface k {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface l {
    }
    
    static class m extends a
    {
        public static final Parcelable$Creator<m> CREATOR;
        int I;
        boolean J;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<m>() {
                @k0
                public m a(@j0 final Parcel parcel) {
                    return new m(parcel, null);
                }
                
                @j0
                public m b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new m(parcel, classLoader);
                }
                
                @j0
                public m[] c(final int n) {
                    return new m[n];
                }
            };
        }
        
        public m(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = parcel.readInt();
            this.J = (parcel.readInt() != 0);
        }
        
        public m(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.I);
            parcel.writeInt((int)(this.J ? 1 : 0));
        }
    }
}
