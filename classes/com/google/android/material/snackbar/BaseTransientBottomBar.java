// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.snackbar;

import android.view.View$OnClickListener;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.material.resources.c;
import android.util.AttributeSet;
import android.annotation.SuppressLint;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View$OnTouchListener;
import android.widget.FrameLayout;
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.MotionEvent;
import java.util.ArrayList;
import android.view.WindowInsets;
import com.google.android.material.internal.b0;
import androidx.annotation.y;
import android.view.ViewParent;
import android.content.res.TypedArray;
import androidx.annotation.e0;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.animation.Animator;
import android.animation.AnimatorSet;
import com.google.android.material.behavior.SwipeDismissBehavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.os.Bundle;
import androidx.core.view.accessibility.d;
import androidx.core.view.x0;
import androidx.core.view.a0;
import android.view.LayoutInflater;
import com.google.android.material.internal.t;
import android.view.ViewGroup$LayoutParams;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.os.Message;
import android.os.Handler$Callback;
import android.os.Looper;
import android.os.Build$VERSION;
import android.view.accessibility.AccessibilityManager;
import java.util.List;
import android.graphics.Rect;
import androidx.annotation.p0;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import androidx.annotation.k0;
import android.view.View;
import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.os.Handler;

public abstract class BaseTransientBottomBar<B extends BaseTransientBottomBar<B>>
{
    static final int A = 180;
    private static final int B = 150;
    private static final int C = 75;
    private static final float D = 0.8f;
    @j0
    static final Handler E;
    static final int F = 0;
    static final int G = 1;
    private static final boolean H;
    private static final int[] I;
    private static final String J;
    public static final int u = 0;
    public static final int v = 1;
    public static final int w = -2;
    public static final int x = -1;
    public static final int y = 0;
    static final int z = 250;
    @j0
    private final ViewGroup a;
    private final Context b;
    @j0
    protected final z c;
    @j0
    private final com.google.android.material.snackbar.a d;
    private int e;
    private boolean f;
    @k0
    private View g;
    private boolean h;
    private final ViewTreeObserver$OnGlobalLayoutListener i;
    @p0(29)
    private final Runnable j;
    @k0
    private Rect k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private List<t<B>> q;
    private Behavior r;
    @k0
    private final AccessibilityManager s;
    @j0
    b.b t;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        H = (sdk_INT >= 16 && sdk_INT <= 19);
        I = new int[] { o2.a.c.Lc };
        J = BaseTransientBottomBar.class.getSimpleName();
        E = new Handler(Looper.getMainLooper(), (Handler$Callback)new Handler$Callback() {
            public boolean handleMessage(@j0 final Message message) {
                final int what = message.what;
                if (what == 0) {
                    ((BaseTransientBottomBar)message.obj).g0();
                    return true;
                }
                if (what != 1) {
                    return false;
                }
                ((BaseTransientBottomBar)message.obj).M(message.arg1);
                return true;
            }
        });
    }
    
    protected BaseTransientBottomBar(@j0 final Context b, @j0 final ViewGroup a, @j0 final View view, @j0 final com.google.android.material.snackbar.a d) {
        this.h = false;
        this.i = (ViewTreeObserver$OnGlobalLayoutListener)new ViewTreeObserver$OnGlobalLayoutListener() {
            public void onGlobalLayout() {
                if (!BaseTransientBottomBar.this.h) {
                    return;
                }
                final BaseTransientBottomBar g = BaseTransientBottomBar.this;
                g.p = g.v();
                BaseTransientBottomBar.this.m0();
            }
        };
        this.j = new Runnable() {
            @Override
            public void run() {
                final BaseTransientBottomBar g = BaseTransientBottomBar.this;
                if (g.c != null) {
                    if (g.b != null) {
                        final int n = BaseTransientBottomBar.this.G() - BaseTransientBottomBar.this.K() + (int)BaseTransientBottomBar.this.c.getTranslationY();
                        if (n >= BaseTransientBottomBar.this.o) {
                            return;
                        }
                        final ViewGroup$LayoutParams layoutParams = BaseTransientBottomBar.this.c.getLayoutParams();
                        if (!(layoutParams instanceof ViewGroup$MarginLayoutParams)) {
                            Log.w(BaseTransientBottomBar.J, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                            return;
                        }
                        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                        viewGroup$MarginLayoutParams.bottomMargin += BaseTransientBottomBar.this.o - n;
                        BaseTransientBottomBar.this.c.requestLayout();
                    }
                }
            }
        };
        this.t = new b.b() {
            @Override
            public void a() {
                final Handler e = BaseTransientBottomBar.E;
                e.sendMessage(e.obtainMessage(0, (Object)BaseTransientBottomBar.this));
            }
            
            @Override
            public void b(final int n) {
                final Handler e = BaseTransientBottomBar.E;
                e.sendMessage(e.obtainMessage(1, n, 0, (Object)BaseTransientBottomBar.this));
            }
        };
        if (a == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        }
        if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        if (d != null) {
            this.a = a;
            this.d = d;
            com.google.android.material.internal.t.a(this.b = b);
            final z c = (z)LayoutInflater.from(b).inflate(this.H(), a, false);
            this.c = c;
            if (view instanceof SnackbarContentLayout) {
                ((SnackbarContentLayout)view).c(c.getActionTextColorAlpha());
            }
            c.addView(view);
            final ViewGroup$LayoutParams layoutParams = c.getLayoutParams();
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                this.k = new Rect(viewGroup$MarginLayoutParams.leftMargin, viewGroup$MarginLayoutParams.topMargin, viewGroup$MarginLayoutParams.rightMargin, viewGroup$MarginLayoutParams.bottomMargin);
            }
            androidx.core.view.j0.B1((View)c, 1);
            androidx.core.view.j0.P1((View)c, 1);
            androidx.core.view.j0.M1((View)c, true);
            androidx.core.view.j0.Y1((View)c, new a0() {
                @j0
                @Override
                public x0 a(final View view, @j0 final x0 x0) {
                    BaseTransientBottomBar.this.l = x0.o();
                    BaseTransientBottomBar.this.m = x0.p();
                    BaseTransientBottomBar.this.n = x0.q();
                    BaseTransientBottomBar.this.m0();
                    return x0;
                }
            });
            androidx.core.view.j0.z1((View)c, new androidx.core.view.a() {
                @Override
                public void g(final View view, @j0 final d d) {
                    super.g(view, d);
                    d.a(1048576);
                    d.b1(true);
                }
                
                @Override
                public boolean j(final View view, final int n, final Bundle bundle) {
                    if (n == 1048576) {
                        BaseTransientBottomBar.this.w();
                        return true;
                    }
                    return super.j(view, n, bundle);
                }
            });
            this.s = (AccessibilityManager)b.getSystemService("accessibility");
            return;
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
    }
    
    protected BaseTransientBottomBar(@j0 final ViewGroup viewGroup, @j0 final View view, @j0 final com.google.android.material.snackbar.a a) {
        this(viewGroup.getContext(), viewGroup, view, a);
    }
    
    private ValueAnimator F(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(com.google.android.material.animation.a.d);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                BaseTransientBottomBar.this.c.setScaleX(floatValue);
                BaseTransientBottomBar.this.c.setScaleY(floatValue);
            }
        });
        return ofFloat;
    }
    
    @p0(17)
    private int G() {
        final WindowManager windowManager = (WindowManager)this.b.getSystemService("window");
        final DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }
    
    private int I() {
        final int height = this.c.getHeight();
        final ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
        int n = height;
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            n = height + ((ViewGroup$MarginLayoutParams)layoutParams).bottomMargin;
        }
        return n;
    }
    
    private int K() {
        final int[] array = new int[2];
        this.c.getLocationOnScreen(array);
        return array[1] + this.c.getHeight();
    }
    
    private boolean R() {
        final ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
        return layoutParams instanceof CoordinatorLayout.g && ((CoordinatorLayout.g)layoutParams).f() instanceof SwipeDismissBehavior;
    }
    
    private void c0(final CoordinatorLayout.g g) {
        SwipeDismissBehavior<? extends View> swipeDismissBehavior;
        if ((swipeDismissBehavior = this.r) == null) {
            swipeDismissBehavior = this.E();
        }
        if (swipeDismissBehavior instanceof Behavior) {
            ((Behavior)swipeDismissBehavior).V(this);
        }
        swipeDismissBehavior.P((SwipeDismissBehavior.c)new SwipeDismissBehavior.c() {
            @Override
            public void a(@j0 final View view) {
                if (view.getParent() != null) {
                    view.setVisibility(8);
                }
                BaseTransientBottomBar.this.x(0);
            }
            
            @Override
            public void onDragStateChanged(final int n) {
                if (n != 0) {
                    if (n == 1 || n == 2) {
                        b.c().k(BaseTransientBottomBar.this.t);
                    }
                }
                else {
                    b.c().l(BaseTransientBottomBar.this.t);
                }
            }
        });
        g.q(swipeDismissBehavior);
        if (this.g == null) {
            g.g = 80;
        }
    }
    
    private boolean e0() {
        return this.o > 0 && !this.f && this.R();
    }
    
    private void h0() {
        if (this.d0()) {
            this.t();
        }
        else {
            if (this.c.getParent() != null) {
                this.c.setVisibility(0);
            }
            this.T();
        }
    }
    
    private void i0() {
        final ValueAnimator y = this.y(0.0f, 1.0f);
        final ValueAnimator f = this.F(0.8f, 1.0f);
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { (Animator)y, (Animator)f });
        set.setDuration(150L);
        set.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                BaseTransientBottomBar.this.T();
            }
        });
        set.start();
    }
    
    private void j0(final int n) {
        final ValueAnimator y = this.y(1.0f, 0.0f);
        y.setDuration(75L);
        y.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                BaseTransientBottomBar.this.S(n);
            }
        });
        y.start();
    }
    
    private void k0() {
        final int i = this.I();
        if (BaseTransientBottomBar.H) {
            androidx.core.view.j0.d1((View)this.c, i);
        }
        else {
            this.c.setTranslationY((float)i);
        }
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[] { i, 0 });
        valueAnimator.setInterpolator(com.google.android.material.animation.a.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                BaseTransientBottomBar.this.T();
            }
            
            public void onAnimationStart(final Animator animator) {
                BaseTransientBottomBar.this.d.a(70, 180);
            }
        });
        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            private int a = n;
            
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                final int intValue = (int)valueAnimator.getAnimatedValue();
                if (BaseTransientBottomBar.H) {
                    androidx.core.view.j0.d1((View)BaseTransientBottomBar.this.c, intValue - this.a);
                }
                else {
                    BaseTransientBottomBar.this.c.setTranslationY((float)intValue);
                }
                this.a = intValue;
            }
        });
        valueAnimator.start();
    }
    
    private void l0(final int n) {
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(new int[] { 0, this.I() });
        valueAnimator.setInterpolator(com.google.android.material.animation.a.b);
        valueAnimator.setDuration(250L);
        valueAnimator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                BaseTransientBottomBar.this.S(n);
            }
            
            public void onAnimationStart(final Animator animator) {
                BaseTransientBottomBar.this.d.b(0, 180);
            }
        });
        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            private int a = 0;
            
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                final int intValue = (int)valueAnimator.getAnimatedValue();
                if (BaseTransientBottomBar.H) {
                    androidx.core.view.j0.d1((View)BaseTransientBottomBar.this.c, intValue - this.a);
                }
                else {
                    BaseTransientBottomBar.this.c.setTranslationY((float)intValue);
                }
                this.a = intValue;
            }
        });
        valueAnimator.start();
    }
    
    private void m0() {
        final ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
            final Rect k = this.k;
            if (k != null) {
                int n;
                if (this.g != null) {
                    n = this.p;
                }
                else {
                    n = this.l;
                }
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)layoutParams;
                viewGroup$MarginLayoutParams.bottomMargin = k.bottom + n;
                viewGroup$MarginLayoutParams.leftMargin = k.left + this.m;
                viewGroup$MarginLayoutParams.rightMargin = k.right + this.n;
                this.c.requestLayout();
                if (Build$VERSION.SDK_INT >= 29 && this.e0()) {
                    this.c.removeCallbacks(this.j);
                    this.c.post(this.j);
                }
                return;
            }
        }
        Log.w(BaseTransientBottomBar.J, "Unable to update margins because layout params are not MarginLayoutParams");
    }
    
    private void u(final int n) {
        if (this.c.getAnimationMode() == 1) {
            this.j0(n);
        }
        else {
            this.l0(n);
        }
    }
    
    private int v() {
        final View g = this.g;
        if (g == null) {
            return 0;
        }
        final int[] array = new int[2];
        g.getLocationOnScreen(array);
        final int n = array[1];
        final int[] array2 = new int[2];
        this.a.getLocationOnScreen(array2);
        return array2[1] + this.a.getHeight() - n;
    }
    
    private ValueAnimator y(final float... array) {
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(array);
        ofFloat.setInterpolator(com.google.android.material.animation.a.a);
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                BaseTransientBottomBar.this.c.setAlpha((float)valueAnimator.getAnimatedValue());
            }
        });
        return ofFloat;
    }
    
    public int A() {
        return this.c.getAnimationMode();
    }
    
    public Behavior B() {
        return this.r;
    }
    
    @j0
    public Context C() {
        return this.b;
    }
    
    public int D() {
        return this.e;
    }
    
    @j0
    protected SwipeDismissBehavior<? extends View> E() {
        return new Behavior();
    }
    
    @e0
    protected int H() {
        int n;
        if (this.L()) {
            n = o2.a.k.w0;
        }
        else {
            n = o2.a.k.F;
        }
        return n;
    }
    
    @j0
    public View J() {
        return (View)this.c;
    }
    
    protected boolean L() {
        final TypedArray obtainStyledAttributes = this.b.obtainStyledAttributes(BaseTransientBottomBar.I);
        boolean b = false;
        final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            b = true;
        }
        return b;
    }
    
    final void M(final int n) {
        if (this.d0() && this.c.getVisibility() == 0) {
            this.u(n);
        }
        else {
            this.S(n);
        }
    }
    
    public boolean N() {
        return this.h;
    }
    
    public boolean O() {
        return this.f;
    }
    
    public boolean P() {
        return com.google.android.material.snackbar.b.c().e(this.t);
    }
    
    public boolean Q() {
        return com.google.android.material.snackbar.b.c().f(this.t);
    }
    
    void S(final int n) {
        com.google.android.material.snackbar.b.c().i(this.t);
        final List<t<B>> q = this.q;
        if (q != null) {
            for (int i = q.size() - 1; i >= 0; --i) {
                this.q.get(i).a((B)this, n);
            }
        }
        final ViewParent parent = this.c.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup)parent).removeView((View)this.c);
        }
    }
    
    void T() {
        com.google.android.material.snackbar.b.c().j(this.t);
        final List<t<B>> q = this.q;
        if (q != null) {
            for (int i = q.size() - 1; i >= 0; --i) {
                this.q.get(i).b((B)this);
            }
        }
    }
    
    @j0
    public B U(@k0 final t<B> t) {
        if (t == null) {
            return (B)this;
        }
        final List<t<B>> q = this.q;
        if (q == null) {
            return (B)this;
        }
        q.remove(t);
        return (B)this;
    }
    
    @j0
    public B V(@androidx.annotation.y final int i) {
        final View viewById = this.a.findViewById(i);
        if (viewById != null) {
            return this.W(viewById);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to find anchor view with id: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    public B W(@k0 final View g) {
        b0.l(this.g, this.i);
        b0.a(this.g = g, this.i);
        return (B)this;
    }
    
    public void X(final boolean h) {
        this.h = h;
    }
    
    @j0
    public B Y(final int animationMode) {
        this.c.setAnimationMode(animationMode);
        return (B)this;
    }
    
    @j0
    public B Z(final Behavior r) {
        this.r = r;
        return (B)this;
    }
    
    @j0
    public B a0(final int e) {
        this.e = e;
        return (B)this;
    }
    
    @j0
    public B b0(final boolean f) {
        this.f = f;
        return (B)this;
    }
    
    boolean d0() {
        final AccessibilityManager s = this.s;
        boolean b = true;
        if (s == null) {
            return true;
        }
        final List enabledAccessibilityServiceList = s.getEnabledAccessibilityServiceList(1);
        if (enabledAccessibilityServiceList == null || !enabledAccessibilityServiceList.isEmpty()) {
            b = false;
        }
        return b;
    }
    
    public void f0() {
        com.google.android.material.snackbar.b.c().n(this.D(), this.t);
    }
    
    final void g0() {
        this.c.setOnAttachStateChangeListener(new x() {
            @Override
            public void onViewAttachedToWindow(final View view) {
                if (Build$VERSION.SDK_INT >= 29) {
                    final WindowInsets rootWindowInsets = BaseTransientBottomBar.this.c.getRootWindowInsets();
                    if (rootWindowInsets != null) {
                        BaseTransientBottomBar.this.o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
                        BaseTransientBottomBar.this.m0();
                    }
                }
            }
            
            @Override
            public void onViewDetachedFromWindow(final View view) {
                if (BaseTransientBottomBar.this.Q()) {
                    BaseTransientBottomBar.E.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            BaseTransientBottomBar.this.S(3);
                        }
                    });
                }
            }
        });
        if (this.c.getParent() == null) {
            final ViewGroup$LayoutParams layoutParams = this.c.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                this.c0((CoordinatorLayout.g)layoutParams);
            }
            this.p = this.v();
            this.m0();
            this.c.setVisibility(4);
            this.a.addView((View)this.c);
        }
        if (androidx.core.view.j0.T0((View)this.c)) {
            this.h0();
            return;
        }
        this.c.setOnLayoutChangeListener(new y() {
            @Override
            public void a(final View view, final int n, final int n2, final int n3, final int n4) {
                BaseTransientBottomBar.this.c.setOnLayoutChangeListener(null);
                BaseTransientBottomBar.this.h0();
            }
        });
    }
    
    @j0
    public B s(@k0 final t<B> t) {
        if (t == null) {
            return (B)this;
        }
        if (this.q == null) {
            this.q = new ArrayList<t<B>>();
        }
        this.q.add(t);
        return (B)this;
    }
    
    void t() {
        this.c.post((Runnable)new Runnable() {
            @Override
            public void run() {
                final z c = BaseTransientBottomBar.this.c;
                if (c == null) {
                    return;
                }
                if (c.getParent() != null) {
                    BaseTransientBottomBar.this.c.setVisibility(0);
                }
                if (BaseTransientBottomBar.this.c.getAnimationMode() == 1) {
                    BaseTransientBottomBar.this.i0();
                }
                else {
                    BaseTransientBottomBar.this.k0();
                }
            }
        });
    }
    
    public void w() {
        this.x(3);
    }
    
    protected void x(final int n) {
        com.google.android.material.snackbar.b.c().b(this.t, n);
    }
    
    @k0
    public View z() {
        return this.g;
    }
    
    public static class Behavior extends SwipeDismissBehavior<View>
    {
        @j0
        private final u t;
        
        public Behavior() {
            this.t = new u(this);
        }
        
        private void V(@j0 final BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.t.c(baseTransientBottomBar);
        }
        
        @Override
        public boolean G(final View view) {
            return this.t.a(view);
        }
        
        @Override
        public boolean l(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final MotionEvent motionEvent) {
            this.t.b(coordinatorLayout, view, motionEvent);
            return super.l(coordinatorLayout, view, motionEvent);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface s {
    }
    
    public abstract static class t<B>
    {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        public static final int e = 4;
        
        public void a(final B b, final int n) {
        }
        
        public void b(final B b) {
        }
        
        @Retention(RetentionPolicy.SOURCE)
        @t0({ t0.a.H })
        public @interface a {
        }
    }
    
    @t0({ t0.a.H })
    public static class u
    {
        private b.b a;
        
        public u(@j0 final SwipeDismissBehavior<?> swipeDismissBehavior) {
            swipeDismissBehavior.R(0.1f);
            swipeDismissBehavior.O(0.6f);
            swipeDismissBehavior.S(0);
        }
        
        public boolean a(final View view) {
            return view instanceof z;
        }
        
        public void b(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final MotionEvent motionEvent) {
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.b.c().l(this.a);
                }
            }
            else if (coordinatorLayout.G(view, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                com.google.android.material.snackbar.b.c().k(this.a);
            }
        }
        
        public void c(@j0 final BaseTransientBottomBar<?> baseTransientBottomBar) {
            this.a = baseTransientBottomBar.t;
        }
    }
    
    @Deprecated
    public interface v extends a
    {
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b0(from = 1L)
    @t0({ t0.a.H })
    public @interface w {
    }
    
    @t0({ t0.a.H })
    protected interface x
    {
        void onViewAttachedToWindow(final View p0);
        
        void onViewDetachedFromWindow(final View p0);
    }
    
    @t0({ t0.a.H })
    protected interface y
    {
        void a(final View p0, final int p1, final int p2, final int p3, final int p4);
    }
    
    @t0({ t0.a.H })
    protected static class z extends FrameLayout
    {
        private static final View$OnTouchListener N;
        private y G;
        private x H;
        private int I;
        private final float J;
        private final float K;
        private ColorStateList L;
        private PorterDuff$Mode M;
        
        static {
            N = (View$OnTouchListener)new View$OnTouchListener() {
                @SuppressLint({ "ClickableViewAccessibility" })
                public boolean onTouch(final View view, final MotionEvent motionEvent) {
                    return true;
                }
            };
        }
        
        protected z(@j0 final Context context) {
            this(context, null);
        }
        
        protected z(@j0 Context context, final AttributeSet set) {
            super(com.google.android.material.theme.overlay.a.c(context, set, 0, 0), set);
            context = this.getContext();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Iq);
            final int pq = o2.a.o.Pq;
            if (obtainStyledAttributes.hasValue(pq)) {
                androidx.core.view.j0.L1((View)this, (float)obtainStyledAttributes.getDimensionPixelSize(pq, 0));
            }
            this.I = obtainStyledAttributes.getInt(o2.a.o.Lq, 0);
            this.J = obtainStyledAttributes.getFloat(o2.a.o.Mq, 1.0f);
            this.setBackgroundTintList(c.a(context, obtainStyledAttributes, o2.a.o.Nq));
            this.setBackgroundTintMode(b0.k(obtainStyledAttributes.getInt(o2.a.o.Oq, -1), PorterDuff$Mode.SRC_IN));
            this.K = obtainStyledAttributes.getFloat(o2.a.o.Kq, 1.0f);
            obtainStyledAttributes.recycle();
            this.setOnTouchListener(z.N);
            this.setFocusable(true);
            if (this.getBackground() == null) {
                androidx.core.view.j0.G1((View)this, this.a());
            }
        }
        
        @j0
        private Drawable a() {
            final float dimension = this.getResources().getDimension(o2.a.f.Y5);
            final GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(s2.a.j((View)this, o2.a.c.P2, o2.a.c.I2, this.getBackgroundOverlayColorAlpha()));
            if (this.L != null) {
                final Drawable r = androidx.core.graphics.drawable.c.r((Drawable)gradientDrawable);
                androidx.core.graphics.drawable.c.o(r, this.L);
                return r;
            }
            return androidx.core.graphics.drawable.c.r((Drawable)gradientDrawable);
        }
        
        float getActionTextColorAlpha() {
            return this.K;
        }
        
        int getAnimationMode() {
            return this.I;
        }
        
        float getBackgroundOverlayColorAlpha() {
            return this.J;
        }
        
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            final x h = this.H;
            if (h != null) {
                h.onViewAttachedToWindow((View)this);
            }
            androidx.core.view.j0.t1((View)this);
        }
        
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            final x h = this.H;
            if (h != null) {
                h.onViewDetachedFromWindow((View)this);
            }
        }
        
        protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
            super.onLayout(b, n, n2, n3, n4);
            final y g = this.G;
            if (g != null) {
                g.a((View)this, n, n2, n3, n4);
            }
        }
        
        void setAnimationMode(final int i) {
            this.I = i;
        }
        
        public void setBackground(@k0 final Drawable backgroundDrawable) {
            this.setBackgroundDrawable(backgroundDrawable);
        }
        
        public void setBackgroundDrawable(@k0 final Drawable drawable) {
            Drawable r = drawable;
            if (drawable != null) {
                r = drawable;
                if (this.L != null) {
                    r = androidx.core.graphics.drawable.c.r(drawable.mutate());
                    androidx.core.graphics.drawable.c.o(r, this.L);
                    androidx.core.graphics.drawable.c.p(r, this.M);
                }
            }
            super.setBackgroundDrawable(r);
        }
        
        public void setBackgroundTintList(@k0 final ColorStateList l) {
            this.L = l;
            if (this.getBackground() != null) {
                final Drawable r = androidx.core.graphics.drawable.c.r(this.getBackground().mutate());
                androidx.core.graphics.drawable.c.o(r, l);
                androidx.core.graphics.drawable.c.p(r, this.M);
                if (r != this.getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }
        
        public void setBackgroundTintMode(@k0 final PorterDuff$Mode m) {
            this.M = m;
            if (this.getBackground() != null) {
                final Drawable r = androidx.core.graphics.drawable.c.r(this.getBackground().mutate());
                androidx.core.graphics.drawable.c.p(r, m);
                if (r != this.getBackground()) {
                    super.setBackgroundDrawable(r);
                }
            }
        }
        
        void setOnAttachStateChangeListener(final x h) {
            this.H = h;
        }
        
        public void setOnClickListener(@k0 final View$OnClickListener onClickListener) {
            View$OnTouchListener n;
            if (onClickListener != null) {
                n = null;
            }
            else {
                n = z.N;
            }
            this.setOnTouchListener(n);
            super.setOnClickListener(onClickListener);
        }
        
        void setOnLayoutChangeListener(final y g) {
            this.G = g;
        }
    }
}
