// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ViewGroup$MarginLayoutParams;
import android.view.Window$Callback;
import androidx.core.graphics.j;
import android.content.res.Configuration;
import androidx.annotation.p0;
import android.view.WindowInsets;
import android.os.Parcelable;
import android.util.SparseArray;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.view.menu.n;
import android.view.Menu;
import android.content.res.TypedArray;
import android.view.View;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import c.a;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import android.widget.OverScroller;
import androidx.annotation.j0;
import androidx.core.view.x0;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.t0;
import android.annotation.SuppressLint;
import androidx.core.view.x;
import androidx.core.view.w;
import androidx.core.view.y;
import android.view.ViewGroup;

@SuppressLint({ "UnknownNullness" })
@t0({ t0.a.I })
public class ActionBarOverlayLayout extends ViewGroup implements z, y, w, x
{
    private static final String o0 = "ActionBarOverlayLayout";
    private static final int p0 = 600;
    static final int[] q0;
    private int G;
    private int H;
    private ContentFrameLayout I;
    ActionBarContainer J;
    private a0 K;
    private Drawable L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    boolean Q;
    private int R;
    private int S;
    private final Rect T;
    private final Rect U;
    private final Rect V;
    private final Rect W;
    private final Rect a0;
    private final Rect b0;
    private final Rect c0;
    @j0
    private x0 d0;
    @j0
    private x0 e0;
    @j0
    private x0 f0;
    @j0
    private x0 g0;
    private d h0;
    private OverScroller i0;
    ViewPropertyAnimator j0;
    final AnimatorListenerAdapter k0;
    private final Runnable l0;
    private final Runnable m0;
    private final androidx.core.view.z n0;
    
    static {
        q0 = new int[] { a.c.d, 16842841 };
    }
    
    public ActionBarOverlayLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public ActionBarOverlayLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.H = 0;
        this.T = new Rect();
        this.U = new Rect();
        this.V = new Rect();
        this.W = new Rect();
        this.a0 = new Rect();
        this.b0 = new Rect();
        this.c0 = new Rect();
        final x0 c = x0.c;
        this.d0 = c;
        this.e0 = c;
        this.f0 = c;
        this.g0 = c;
        this.k0 = new AnimatorListenerAdapter() {
            public void onAnimationCancel(final Animator animator) {
                final ActionBarOverlayLayout a = ActionBarOverlayLayout.this;
                a.j0 = null;
                a.Q = false;
            }
            
            public void onAnimationEnd(final Animator animator) {
                final ActionBarOverlayLayout a = ActionBarOverlayLayout.this;
                a.j0 = null;
                a.Q = false;
            }
        };
        this.l0 = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.y();
                final ActionBarOverlayLayout g = ActionBarOverlayLayout.this;
                g.j0 = g.J.animate().translationY(0.0f).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.k0);
            }
        };
        this.m0 = new Runnable() {
            @Override
            public void run() {
                ActionBarOverlayLayout.this.y();
                final ActionBarOverlayLayout g = ActionBarOverlayLayout.this;
                g.j0 = g.J.animate().translationY((float)(-ActionBarOverlayLayout.this.J.getHeight())).setListener((Animator$AnimatorListener)ActionBarOverlayLayout.this.k0);
            }
        };
        this.z(context);
        this.n0 = new androidx.core.view.z(this);
    }
    
    private void C() {
        this.y();
        this.postDelayed(this.m0, 600L);
    }
    
    private void D() {
        this.y();
        this.postDelayed(this.l0, 600L);
    }
    
    private void F() {
        this.y();
        this.l0.run();
    }
    
    private boolean G(final float n) {
        this.i0.fling(0, 0, 0, (int)n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.i0.getFinalY() > this.J.getHeight();
    }
    
    private void a() {
        this.y();
        this.m0.run();
    }
    
    private boolean b(@j0 final View view, @j0 final Rect rect, final boolean b, final boolean b2, final boolean b3, final boolean b4) {
        final e e = (e)view.getLayoutParams();
        final boolean b5 = true;
        boolean b6 = false;
        Label_0049: {
            if (b) {
                final int leftMargin = e.leftMargin;
                final int left = rect.left;
                if (leftMargin != left) {
                    e.leftMargin = left;
                    b6 = true;
                    break Label_0049;
                }
            }
            b6 = false;
        }
        boolean b7 = b6;
        if (b2) {
            final int topMargin = e.topMargin;
            final int top = rect.top;
            b7 = b6;
            if (topMargin != top) {
                e.topMargin = top;
                b7 = true;
            }
        }
        boolean b8 = b7;
        if (b4) {
            final int rightMargin = e.rightMargin;
            final int right = rect.right;
            b8 = b7;
            if (rightMargin != right) {
                e.rightMargin = right;
                b8 = true;
            }
        }
        if (b3) {
            final int bottomMargin = e.bottomMargin;
            final int bottom = rect.bottom;
            if (bottomMargin != bottom) {
                e.bottomMargin = bottom;
                b8 = b5;
            }
        }
        return b8;
    }
    
    private a0 x(final View view) {
        if (view instanceof a0) {
            return (a0)view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar)view).getWrapper();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }
    
    private void z(final Context context) {
        final TypedArray obtainStyledAttributes = this.getContext().getTheme().obtainStyledAttributes(ActionBarOverlayLayout.q0);
        final boolean b = false;
        this.G = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        final Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.L = drawable;
        this.setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        boolean m = b;
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            m = true;
        }
        this.M = m;
        this.i0 = new OverScroller(context);
    }
    
    public boolean A() {
        return this.P;
    }
    
    public boolean B() {
        return this.N;
    }
    
    void E() {
        if (this.I == null) {
            this.I = (ContentFrameLayout)this.findViewById(a.h.I);
            this.J = (ActionBarContainer)this.findViewById(a.h.J);
            this.K = this.x(this.findViewById(a.h.H));
        }
    }
    
    public void c(final Menu menu, final n.a a) {
        this.E();
        this.K.c(menu, a);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof e;
    }
    
    public boolean d() {
        this.E();
        return this.K.d();
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.L != null && !this.M) {
            int n;
            if (this.J.getVisibility() == 0) {
                n = (int)(this.J.getBottom() + this.J.getTranslationY() + 0.5f);
            }
            else {
                n = 0;
            }
            this.L.setBounds(0, n, this.getWidth(), this.L.getIntrinsicHeight() + n);
            this.L.draw(canvas);
        }
    }
    
    public void e() {
        this.E();
        this.K.e();
    }
    
    public boolean f() {
        this.E();
        return this.K.f();
    }
    
    protected boolean fitSystemWindows(final Rect rect) {
        if (Build$VERSION.SDK_INT >= 21) {
            return super.fitSystemWindows(rect);
        }
        this.E();
        boolean b = this.b((View)this.J, rect, true, true, false, true);
        this.W.set(rect);
        a1.a((View)this, this.W, this.T);
        if (!this.a0.equals((Object)this.W)) {
            this.a0.set(this.W);
            b = true;
        }
        if (!this.U.equals((Object)this.T)) {
            this.U.set(this.T);
            b = true;
        }
        if (b) {
            this.requestLayout();
        }
        return true;
    }
    
    public boolean g() {
        this.E();
        return this.K.g();
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new e(viewGroup$LayoutParams);
    }
    
    public int getActionBarHideOffset() {
        final ActionBarContainer j = this.J;
        int n;
        if (j != null) {
            n = -(int)j.getTranslationY();
        }
        else {
            n = 0;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        return this.n0.a();
    }
    
    public CharSequence getTitle() {
        this.E();
        return this.K.getTitle();
    }
    
    public boolean h() {
        this.E();
        return this.K.h();
    }
    
    public boolean i() {
        this.E();
        return this.K.i();
    }
    
    public boolean j() {
        this.E();
        return this.K.j();
    }
    
    public boolean k() {
        this.E();
        return this.K.k();
    }
    
    public void l(final SparseArray<Parcelable> sparseArray) {
        this.E();
        this.K.w(sparseArray);
    }
    
    public void m(final int n) {
        this.E();
        if (n != 2) {
            if (n != 5) {
                if (n == 109) {
                    this.setOverlayMode(true);
                }
            }
            else {
                this.K.R();
            }
        }
        else {
            this.K.P();
        }
    }
    
    public void n() {
        this.E();
        this.K.m();
    }
    
    public void o(final SparseArray<Parcelable> sparseArray) {
        this.E();
        this.K.J(sparseArray);
    }
    
    @p0(21)
    public WindowInsets onApplyWindowInsets(@j0 final WindowInsets windowInsets) {
        this.E();
        final x0 l = x0.L(windowInsets, (View)this);
        int b = this.b((View)this.J, new Rect(l.p(), l.r(), l.q(), l.o()), true, true, false, true) ? 1 : 0;
        androidx.core.view.j0.n((View)this, l, this.T);
        final Rect t = this.T;
        final x0 x = l.x(t.left, t.top, t.right, t.bottom);
        this.d0 = x;
        final boolean equals = this.e0.equals(x);
        final int n = 1;
        if (!equals) {
            this.e0 = this.d0;
            b = 1;
        }
        if (!this.U.equals((Object)this.T)) {
            this.U.set(this.T);
            b = n;
        }
        if (b != 0) {
            this.requestLayout();
        }
        return l.a().c().b().J();
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.z(this.getContext());
        androidx.core.view.j0.t1((View)this);
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.y();
    }
    
    protected void onLayout(final boolean b, int i, int paddingLeft, int childCount, int paddingTop) {
        childCount = this.getChildCount();
        paddingLeft = this.getPaddingLeft();
        paddingTop = this.getPaddingTop();
        View child;
        e e;
        int measuredWidth;
        int measuredHeight;
        int n;
        int n2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                e = (e)child.getLayoutParams();
                measuredWidth = child.getMeasuredWidth();
                measuredHeight = child.getMeasuredHeight();
                n = e.leftMargin + paddingLeft;
                n2 = e.topMargin + paddingTop;
                child.layout(n, n2, measuredWidth + n, measuredHeight + n2);
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.E();
        this.measureChildWithMargins((View)this.J, n, 0, n2, 0);
        final e e = (e)this.J.getLayoutParams();
        final int max = Math.max(0, this.J.getMeasuredWidth() + e.leftMargin + e.rightMargin);
        final int max2 = Math.max(0, this.J.getMeasuredHeight() + e.topMargin + e.bottomMargin);
        final int combineMeasuredStates = View.combineMeasuredStates(0, this.J.getMeasuredState());
        final boolean b = (androidx.core.view.j0.B0((View)this) & 0x100) != 0x0;
        int n4;
        if (b) {
            final int n3 = n4 = this.G;
            if (this.O) {
                n4 = n3;
                if (this.J.getTabContainer() != null) {
                    n4 = n3 + this.G;
                }
            }
        }
        else if (this.J.getVisibility() != 8) {
            n4 = this.J.getMeasuredHeight();
        }
        else {
            n4 = 0;
        }
        this.V.set(this.T);
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            this.f0 = this.d0;
        }
        else {
            this.b0.set(this.W);
        }
        Label_0384: {
            x0 f0;
            if (!this.N && !b) {
                final Rect v = this.V;
                v.top += n4;
                v.bottom += 0;
                if (sdk_INT < 21) {
                    break Label_0384;
                }
                f0 = this.f0.x(0, n4, 0, 0);
            }
            else {
                if (sdk_INT < 21) {
                    final Rect b2 = this.b0;
                    b2.top += n4;
                    b2.bottom += 0;
                    break Label_0384;
                }
                f0 = new x0.b(this.f0).h(j.d(this.f0.p(), this.f0.r() + n4, this.f0.q(), this.f0.o() + 0)).a();
            }
            this.f0 = f0;
        }
        this.b((View)this.I, this.V, true, true, true, true);
        if (sdk_INT >= 21 && !this.g0.equals(this.f0)) {
            final x0 f2 = this.f0;
            this.g0 = f2;
            androidx.core.view.j0.o((View)this.I, f2);
        }
        else if (sdk_INT < 21 && !this.c0.equals((Object)this.b0)) {
            this.c0.set(this.b0);
            this.I.a(this.b0);
        }
        this.measureChildWithMargins((View)this.I, n, 0, n2, 0);
        final e e2 = (e)this.I.getLayoutParams();
        final int max3 = Math.max(max, this.I.getMeasuredWidth() + e2.leftMargin + e2.rightMargin);
        final int max4 = Math.max(max2, this.I.getMeasuredHeight() + e2.topMargin + e2.bottomMargin);
        final int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.I.getMeasuredState());
        this.setMeasuredDimension(View.resolveSizeAndState(Math.max(max3 + (this.getPaddingLeft() + this.getPaddingRight()), this.getSuggestedMinimumWidth()), n, combineMeasuredStates2), View.resolveSizeAndState(Math.max(max4 + (this.getPaddingTop() + this.getPaddingBottom()), this.getSuggestedMinimumHeight()), n2, combineMeasuredStates2 << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        if (this.P && b) {
            if (this.G(n2)) {
                this.a();
            }
            else {
                this.F();
            }
            return this.Q = true;
        }
        return false;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return false;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
    }
    
    public void onNestedScroll(final View view, int r, final int n, final int n2, final int n3) {
        r = this.R + n;
        this.setActionBarHideOffset(this.R = r);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.n0.b(view, view2, n);
        this.R = this.getActionBarHideOffset();
        this.y();
        final d h0 = this.h0;
        if (h0 != null) {
            h0.e();
        }
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return (n & 0x2) != 0x0 && this.J.getVisibility() == 0 && this.P;
    }
    
    public void onStopNestedScroll(final View view) {
        if (this.P && !this.Q) {
            if (this.R <= this.J.getHeight()) {
                this.D();
            }
            else {
                this.C();
            }
        }
        final d h0 = this.h0;
        if (h0 != null) {
            h0.b();
        }
    }
    
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(final int s) {
        if (Build$VERSION.SDK_INT >= 16) {
            super.onWindowSystemUiVisibilityChanged(s);
        }
        this.E();
        final int s2 = this.S;
        this.S = s;
        boolean b = false;
        final boolean b2 = (s & 0x4) == 0x0;
        if ((s & 0x100) != 0x0) {
            b = true;
        }
        final d h0 = this.h0;
        if (h0 != null) {
            h0.c(b ^ true);
            if (!b2 && b) {
                this.h0.d();
            }
            else {
                this.h0.a();
            }
        }
        if (((s2 ^ s) & 0x100) != 0x0 && this.h0 != null) {
            androidx.core.view.j0.t1((View)this);
        }
    }
    
    protected void onWindowVisibilityChanged(final int h) {
        super.onWindowVisibilityChanged(h);
        this.H = h;
        final d h2 = this.h0;
        if (h2 != null) {
            h2.f(h);
        }
    }
    
    public void p(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        this.q(view, n, n2, n3, n4, n5);
    }
    
    public void q(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        if (n5 == 0) {
            this.onNestedScroll(view, n, n2, n3, n4);
        }
    }
    
    public boolean r(final View view, final View view2, final int n, final int n2) {
        return n2 == 0 && this.onStartNestedScroll(view, view2, n);
    }
    
    public void s(final View view, final View view2, final int n, final int n2) {
        if (n2 == 0) {
            this.onNestedScrollAccepted(view, view2, n);
        }
    }
    
    public void setActionBarHideOffset(int max) {
        this.y();
        max = Math.max(0, Math.min(max, this.J.getHeight()));
        this.J.setTranslationY((float)(-max));
    }
    
    public void setActionBarVisibilityCallback(final d h0) {
        this.h0 = h0;
        if (this.getWindowToken() != null) {
            this.h0.f(this.H);
            final int s = this.S;
            if (s != 0) {
                this.onWindowSystemUiVisibilityChanged(s);
                androidx.core.view.j0.t1((View)this);
            }
        }
    }
    
    public void setHasNonEmbeddedTabs(final boolean o) {
        this.O = o;
    }
    
    public void setHideOnContentScrollEnabled(final boolean p) {
        if (p != this.P && !(this.P = p)) {
            this.y();
            this.setActionBarHideOffset(0);
        }
    }
    
    public void setIcon(final int icon) {
        this.E();
        this.K.setIcon(icon);
    }
    
    public void setIcon(final Drawable icon) {
        this.E();
        this.K.setIcon(icon);
    }
    
    public void setLogo(final int logo) {
        this.E();
        this.K.setLogo(logo);
    }
    
    public void setOverlayMode(final boolean n) {
        this.N = n;
        this.M = (n && this.getContext().getApplicationInfo().targetSdkVersion < 19);
    }
    
    public void setShowingForActionMode(final boolean b) {
    }
    
    public void setUiOptions(final int n) {
    }
    
    public void setWindowCallback(final Window$Callback windowCallback) {
        this.E();
        this.K.setWindowCallback(windowCallback);
    }
    
    public void setWindowTitle(final CharSequence windowTitle) {
        this.E();
        this.K.setWindowTitle(windowTitle);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void t(final View view, final int n) {
        if (n == 0) {
            this.onStopNestedScroll(view);
        }
    }
    
    public void u(final View view, final int n, final int n2, final int[] array, final int n3) {
        if (n3 == 0) {
            this.onNestedPreScroll(view, n, n2, array);
        }
    }
    
    protected e v() {
        return new e(-1, -1);
    }
    
    public e w(final AttributeSet set) {
        return new e(this.getContext(), set);
    }
    
    void y() {
        this.removeCallbacks(this.l0);
        this.removeCallbacks(this.m0);
        final ViewPropertyAnimator j0 = this.j0;
        if (j0 != null) {
            j0.cancel();
        }
    }
    
    public interface d
    {
        void a();
        
        void b();
        
        void c(final boolean p0);
        
        void d();
        
        void e();
        
        void f(final int p0);
    }
    
    public static class e extends ViewGroup$MarginLayoutParams
    {
        public e(final int n, final int n2) {
            super(n, n2);
        }
        
        public e(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public e(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public e(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
    }
}
