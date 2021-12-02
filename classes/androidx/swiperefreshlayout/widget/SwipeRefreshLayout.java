// 
// Decompiled by Procyon v0.5.36
// 

package androidx.swiperefreshlayout.widget;

import androidx.annotation.n0;
import androidx.core.content.d;
import androidx.annotation.l;
import android.widget.AbsListView;
import android.os.Build$VERSION;
import android.view.View$MeasureSpec;
import android.util.Log;
import androidx.core.widget.n;
import android.widget.ListView;
import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.content.res.TypedArray;
import android.util.DisplayMetrics;
import android.view.ViewConfiguration;
import android.view.animation.Transformation;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.v;
import androidx.core.view.z;
import android.view.View;
import androidx.annotation.b1;
import androidx.core.view.u;
import androidx.core.view.y;
import android.view.ViewGroup;

public class SwipeRefreshLayout extends ViewGroup implements y, u
{
    @b1
    static final int A0 = 40;
    @b1
    static final int B0 = 56;
    private static final String C0;
    private static final int D0 = 255;
    private static final int E0 = 76;
    private static final float F0 = 2.0f;
    private static final int G0 = -1;
    private static final float H0 = 0.5f;
    private static final float I0 = 0.8f;
    private static final int J0 = 150;
    private static final int K0 = 300;
    private static final int L0 = 200;
    private static final int M0 = 200;
    private static final int N0 = -328966;
    private static final int O0 = 64;
    private static final int[] P0;
    public static final int x0 = 0;
    public static final int y0 = 1;
    public static final int z0 = -1;
    private View G;
    j H;
    boolean I;
    private int J;
    private float K;
    private float L;
    private final z M;
    private final v N;
    private final int[] O;
    private final int[] P;
    private boolean Q;
    private int R;
    int S;
    private float T;
    private float U;
    private boolean V;
    private int W;
    boolean a0;
    private boolean b0;
    private final DecelerateInterpolator c0;
    a d0;
    private int e0;
    protected int f0;
    float g0;
    protected int h0;
    int i0;
    int j0;
    b k0;
    private Animation l0;
    private Animation m0;
    private Animation n0;
    private Animation o0;
    private Animation p0;
    boolean q0;
    private int r0;
    boolean s0;
    private i t0;
    private Animation$AnimationListener u0;
    private final Animation v0;
    private final Animation w0;
    
    static {
        C0 = SwipeRefreshLayout.class.getSimpleName();
        P0 = new int[] { 16842766 };
    }
    
    public SwipeRefreshLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public SwipeRefreshLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.I = false;
        this.K = -1.0f;
        this.O = new int[2];
        this.P = new int[2];
        this.W = -1;
        this.e0 = -1;
        this.u0 = (Animation$AnimationListener)new Animation$AnimationListener() {
            public void onAnimationEnd(final Animation animation) {
                final SwipeRefreshLayout a = SwipeRefreshLayout.this;
                if (a.I) {
                    a.k0.setAlpha(255);
                    SwipeRefreshLayout.this.k0.start();
                    final SwipeRefreshLayout a2 = SwipeRefreshLayout.this;
                    if (a2.q0) {
                        final j h = a2.H;
                        if (h != null) {
                            h.a();
                        }
                    }
                    final SwipeRefreshLayout a3 = SwipeRefreshLayout.this;
                    a3.S = a3.d0.getTop();
                }
                else {
                    a.x();
                }
            }
            
            public void onAnimationRepeat(final Animation animation) {
            }
            
            public void onAnimationStart(final Animation animation) {
            }
        };
        this.v0 = new Animation() {
            public void applyTransformation(final float n, final Transformation transformation) {
                final SwipeRefreshLayout g = SwipeRefreshLayout.this;
                int i0;
                if (!g.s0) {
                    i0 = g.i0 - Math.abs(g.h0);
                }
                else {
                    i0 = g.i0;
                }
                final SwipeRefreshLayout g2 = SwipeRefreshLayout.this;
                final int f0 = g2.f0;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom(f0 + (int)((i0 - f0) * n) - g2.d0.getTop());
                SwipeRefreshLayout.this.k0.v(1.0f - n);
            }
        };
        this.w0 = new Animation() {
            public void applyTransformation(final float n, final Transformation transformation) {
                SwipeRefreshLayout.this.v(n);
            }
        };
        this.J = ViewConfiguration.get(context).getScaledTouchSlop();
        this.R = this.getResources().getInteger(17694721);
        this.setWillNotDraw(false);
        this.c0 = new DecelerateInterpolator(2.0f);
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        this.r0 = (int)(displayMetrics.density * 40.0f);
        this.j();
        this.setChildrenDrawingOrderEnabled(true);
        final int i0 = (int)(displayMetrics.density * 64.0f);
        this.i0 = i0;
        this.K = (float)i0;
        this.M = new z(this);
        this.N = new v((View)this);
        this.setNestedScrollingEnabled(true);
        final int n = -this.r0;
        this.S = n;
        this.h0 = n;
        this.v(1.0f);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, SwipeRefreshLayout.P0);
        this.setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
    
    private void A(final boolean i, final boolean q0) {
        if (this.I != i) {
            this.q0 = q0;
            this.k();
            this.I = i;
            if (i) {
                this.e(this.S, this.u0);
            }
            else {
                this.F(this.u0);
            }
        }
    }
    
    private Animation B(final int n, final int n2) {
        final Animation animation = new Animation() {
            public void applyTransformation(final float n, final Transformation transformation) {
                final b k0 = SwipeRefreshLayout.this.k0;
                final int g = n;
                k0.setAlpha((int)(g + (n2 - g) * n));
            }
        };
        animation.setDuration(300L);
        this.d0.b(null);
        this.d0.clearAnimation();
        this.d0.startAnimation((Animation)animation);
        return animation;
    }
    
    private void C(final float n) {
        final float u = this.U;
        final int j = this.J;
        if (n - u > j && !this.V) {
            this.T = u + j;
            this.V = true;
            this.k0.setAlpha(76);
        }
    }
    
    private void D() {
        this.o0 = this.B(this.k0.getAlpha(), 255);
    }
    
    private void E() {
        this.n0 = this.B(this.k0.getAlpha(), 76);
    }
    
    private void G(final int f0, final Animation$AnimationListener animation$AnimationListener) {
        this.f0 = f0;
        this.g0 = this.d0.getScaleX();
        (this.p0 = new Animation() {
            public void applyTransformation(final float n, final Transformation transformation) {
                final SwipeRefreshLayout g = SwipeRefreshLayout.this;
                final float g2 = g.g0;
                g.setAnimationProgress(g2 + -g2 * n);
                SwipeRefreshLayout.this.v(n);
            }
        }).setDuration(150L);
        if (animation$AnimationListener != null) {
            this.d0.b(animation$AnimationListener);
        }
        this.d0.clearAnimation();
        this.d0.startAnimation(this.p0);
    }
    
    private void H(final Animation$AnimationListener animation$AnimationListener) {
        this.d0.setVisibility(0);
        this.k0.setAlpha(255);
        (this.l0 = new Animation() {
            public void applyTransformation(final float animationProgress, final Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(animationProgress);
            }
        }).setDuration((long)this.R);
        if (animation$AnimationListener != null) {
            this.d0.b(animation$AnimationListener);
        }
        this.d0.clearAnimation();
        this.d0.startAnimation(this.l0);
    }
    
    private void e(final int f0, final Animation$AnimationListener animation$AnimationListener) {
        this.f0 = f0;
        this.v0.reset();
        this.v0.setDuration(200L);
        this.v0.setInterpolator((Interpolator)this.c0);
        if (animation$AnimationListener != null) {
            this.d0.b(animation$AnimationListener);
        }
        this.d0.clearAnimation();
        this.d0.startAnimation(this.v0);
    }
    
    private void h(final int f0, final Animation$AnimationListener animation$AnimationListener) {
        if (this.a0) {
            this.G(f0, animation$AnimationListener);
        }
        else {
            this.f0 = f0;
            this.w0.reset();
            this.w0.setDuration(200L);
            this.w0.setInterpolator((Interpolator)this.c0);
            if (animation$AnimationListener != null) {
                this.d0.b(animation$AnimationListener);
            }
            this.d0.clearAnimation();
            this.d0.startAnimation(this.w0);
        }
    }
    
    private void j() {
        this.d0 = new a(this.getContext(), -328966);
        (this.k0 = new b(this.getContext())).F(1);
        this.d0.setImageDrawable((Drawable)this.k0);
        this.d0.setVisibility(8);
        this.addView((View)this.d0);
    }
    
    private void k() {
        if (this.G == null) {
            for (int i = 0; i < this.getChildCount(); ++i) {
                final View child = this.getChildAt(i);
                if (!child.equals(this.d0)) {
                    this.G = child;
                    break;
                }
            }
        }
    }
    
    private void l(final float n) {
        if (n > this.K) {
            this.A(true, true);
        }
        else {
            this.I = false;
            this.k0.C(0.0f, 0.0f);
            Object o = null;
            if (!this.a0) {
                o = new Animation$AnimationListener() {
                    public void onAnimationEnd(final Animation animation) {
                        final SwipeRefreshLayout a = SwipeRefreshLayout.this;
                        if (!a.a0) {
                            a.F(null);
                        }
                    }
                    
                    public void onAnimationRepeat(final Animation animation) {
                    }
                    
                    public void onAnimationStart(final Animation animation) {
                    }
                };
            }
            this.h(this.S, (Animation$AnimationListener)o);
            this.k0.u(false);
        }
    }
    
    private boolean m(final Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }
    
    private void o(final float a) {
        this.k0.u(true);
        final float min = Math.min(1.0f, Math.abs(a / this.K));
        final float b = (float)Math.max(min - 0.4, 0.0) * 5.0f / 3.0f;
        final float abs = Math.abs(a);
        final float k = this.K;
        int n = this.j0;
        if (n <= 0) {
            if (this.s0) {
                n = this.i0 - this.h0;
            }
            else {
                n = this.i0;
            }
        }
        final float n2 = (float)n;
        final double a2 = Math.max(0.0f, Math.min(abs - k, n2 * 2.0f) / n2) / 4.0f;
        final float n3 = (float)(a2 - Math.pow(a2, 2.0)) * 2.0f;
        final int h0 = this.h0;
        final int n4 = (int)(n2 * min + n2 * n3 * 2.0f);
        if (this.d0.getVisibility() != 0) {
            this.d0.setVisibility(0);
        }
        if (!this.a0) {
            this.d0.setScaleX(1.0f);
            this.d0.setScaleY(1.0f);
        }
        if (this.a0) {
            this.setAnimationProgress(Math.min(1.0f, a / this.K));
        }
        if (a < this.K) {
            if (this.k0.getAlpha() > 76 && !this.m(this.n0)) {
                this.E();
            }
        }
        else if (this.k0.getAlpha() < 255 && !this.m(this.o0)) {
            this.D();
        }
        this.k0.C(0.0f, Math.min(0.8f, b * 0.8f));
        this.k0.v(Math.min(1.0f, b));
        this.k0.z((b * 0.4f - 0.25f + n3 * 2.0f) * 0.5f);
        this.setTargetOffsetTopAndBottom(h0 + n4 - this.S);
    }
    
    private void setColorViewAlpha(final int n) {
        this.d0.getBackground().setAlpha(n);
        this.k0.setAlpha(n);
    }
    
    private void w(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.W = motionEvent.getPointerId(n);
        }
    }
    
    void F(final Animation$AnimationListener animation$AnimationListener) {
        (this.m0 = new Animation() {
            public void applyTransformation(final float n, final Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - n);
            }
        }).setDuration(150L);
        this.d0.b(animation$AnimationListener);
        this.d0.clearAnimation();
        this.d0.startAnimation(this.m0);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.N.a(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.N.b(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.N.c(n, n2, array, array2);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.N.f(n, n2, n3, n4, array);
    }
    
    protected int getChildDrawingOrder(int n, final int n2) {
        final int e0 = this.e0;
        if (e0 < 0) {
            return n2;
        }
        if (n2 == n - 1) {
            return e0;
        }
        if ((n = n2) >= e0) {
            n = n2 + 1;
        }
        return n;
    }
    
    public int getNestedScrollAxes() {
        return this.M.a();
    }
    
    public int getProgressCircleDiameter() {
        return this.r0;
    }
    
    public int getProgressViewEndOffset() {
        return this.i0;
    }
    
    public int getProgressViewStartOffset() {
        return this.h0;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.N.k();
    }
    
    public boolean i() {
        final i t0 = this.t0;
        if (t0 != null) {
            return t0.a(this, this.G);
        }
        final View g = this.G;
        if (g instanceof ListView) {
            return n.a((ListView)g, -1);
        }
        return g.canScrollVertically(-1);
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.N.m();
    }
    
    public boolean n() {
        return this.I;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        this.k();
        final int actionMasked = motionEvent.getActionMasked();
        if (this.b0 && actionMasked == 0) {
            this.b0 = false;
        }
        if (this.isEnabled() && !this.b0 && !this.i() && !this.I && !this.Q) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 6) {
                                return this.V;
                            }
                            this.w(motionEvent);
                            return this.V;
                        }
                    }
                    else {
                        final int w = this.W;
                        if (w == -1) {
                            Log.e(SwipeRefreshLayout.C0, "Got ACTION_MOVE event but don't have an active pointer id.");
                            return false;
                        }
                        final int pointerIndex = motionEvent.findPointerIndex(w);
                        if (pointerIndex < 0) {
                            return false;
                        }
                        this.C(motionEvent.getY(pointerIndex));
                        return this.V;
                    }
                }
                this.V = false;
                this.W = -1;
            }
            else {
                this.setTargetOffsetTopAndBottom(this.h0 - this.d0.getTop());
                final int pointerId = motionEvent.getPointerId(0);
                this.W = pointerId;
                this.V = false;
                final int pointerIndex2 = motionEvent.findPointerIndex(pointerId);
                if (pointerIndex2 < 0) {
                    return false;
                }
                this.U = motionEvent.getY(pointerIndex2);
            }
            return this.V;
        }
        return false;
    }
    
    protected void onLayout(final boolean b, int n, int measuredWidth, int n2, int n3) {
        measuredWidth = this.getMeasuredWidth();
        n = this.getMeasuredHeight();
        if (this.getChildCount() == 0) {
            return;
        }
        if (this.G == null) {
            this.k();
        }
        final View g = this.G;
        if (g == null) {
            return;
        }
        n2 = this.getPaddingLeft();
        n3 = this.getPaddingTop();
        g.layout(n2, n3, measuredWidth - this.getPaddingLeft() - this.getPaddingRight() + n2, n - this.getPaddingTop() - this.getPaddingBottom() + n3);
        n2 = this.d0.getMeasuredWidth();
        n = this.d0.getMeasuredHeight();
        final a d0 = this.d0;
        measuredWidth /= 2;
        n2 /= 2;
        n3 = this.S;
        d0.layout(measuredWidth - n2, n3, measuredWidth + n2, n + n3);
    }
    
    public void onMeasure(int i, final int n) {
        super.onMeasure(i, n);
        if (this.G == null) {
            this.k();
        }
        final View g = this.G;
        if (g == null) {
            return;
        }
        g.measure(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom(), 1073741824));
        this.d0.measure(View$MeasureSpec.makeMeasureSpec(this.r0, 1073741824), View$MeasureSpec.makeMeasureSpec(this.r0, 1073741824));
        this.e0 = -1;
        for (i = 0; i < this.getChildCount(); ++i) {
            if (this.getChildAt(i) == this.d0) {
                this.e0 = i;
                break;
            }
        }
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        return this.dispatchNestedFling(n, n2, b);
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        if (n2 > 0) {
            final float l = this.L;
            if (l > 0.0f) {
                final float n3 = (float)n2;
                if (n3 > l) {
                    array[1] = n2 - (int)l;
                    this.L = 0.0f;
                }
                else {
                    this.L = l - n3;
                    array[1] = n2;
                }
                this.o(this.L);
            }
        }
        if (this.s0 && n2 > 0 && this.L == 0.0f && Math.abs(n2 - array[1]) > 0) {
            this.d0.setVisibility(8);
        }
        final int[] o = this.O;
        if (this.dispatchNestedPreScroll(n - array[0], n2 - array[1], o, null)) {
            array[0] += o[0];
            array[1] += o[1];
        }
    }
    
    public void onNestedScroll(final View view, int a, final int n, final int n2, final int n3) {
        this.dispatchNestedScroll(a, n, n2, n3, this.P);
        a = n3 + this.P[1];
        if (a < 0 && !this.i()) {
            this.o(this.L += Math.abs(a));
        }
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.M.b(view, view2, n);
        this.startNestedScroll(n & 0x2);
        this.L = 0.0f;
        this.Q = true;
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.isEnabled() && !this.b0 && !this.I && (n & 0x2) != 0x0;
    }
    
    public void onStopNestedScroll(final View view) {
        this.M.d(view);
        this.Q = false;
        final float l = this.L;
        if (l > 0.0f) {
            this.l(l);
            this.L = 0.0f;
        }
        this.stopNestedScroll();
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (this.b0 && actionMasked == 0) {
            this.b0 = false;
        }
        if (this.isEnabled() && !this.b0 && !this.i() && !this.I && !this.Q) {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked == 3) {
                            return false;
                        }
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.w(motionEvent);
                            }
                        }
                        else {
                            final int actionIndex = motionEvent.getActionIndex();
                            if (actionIndex < 0) {
                                Log.e(SwipeRefreshLayout.C0, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                                return false;
                            }
                            this.W = motionEvent.getPointerId(actionIndex);
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.W);
                        if (pointerIndex < 0) {
                            Log.e(SwipeRefreshLayout.C0, "Got ACTION_MOVE event but have an invalid active pointer id.");
                            return false;
                        }
                        final float y = motionEvent.getY(pointerIndex);
                        this.C(y);
                        if (this.V) {
                            final float n = (y - this.T) * 0.5f;
                            if (n <= 0.0f) {
                                return false;
                            }
                            this.o(n);
                        }
                    }
                }
                else {
                    final int pointerIndex2 = motionEvent.findPointerIndex(this.W);
                    if (pointerIndex2 < 0) {
                        Log.e(SwipeRefreshLayout.C0, "Got ACTION_UP event but don't have an active pointer id.");
                        return false;
                    }
                    if (this.V) {
                        final float y2 = motionEvent.getY(pointerIndex2);
                        final float t = this.T;
                        this.V = false;
                        this.l((y2 - t) * 0.5f);
                    }
                    this.W = -1;
                    return false;
                }
            }
            else {
                this.W = motionEvent.getPointerId(0);
                this.V = false;
            }
            return true;
        }
        return false;
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        if (Build$VERSION.SDK_INT >= 21 || !(this.G instanceof AbsListView)) {
            final View g = this.G;
            if (g == null || androidx.core.view.j0.V0(g)) {
                super.requestDisallowInterceptTouchEvent(b);
            }
        }
    }
    
    void setAnimationProgress(final float n) {
        this.d0.setScaleX(n);
        this.d0.setScaleY(n);
    }
    
    @Deprecated
    public void setColorScheme(@androidx.annotation.n final int... colorSchemeResources) {
        this.setColorSchemeResources(colorSchemeResources);
    }
    
    public void setColorSchemeColors(@l final int... array) {
        this.k();
        this.k0.y(array);
    }
    
    public void setColorSchemeResources(@androidx.annotation.n final int... array) {
        final Context context = this.getContext();
        final int[] colorSchemeColors = new int[array.length];
        for (int i = 0; i < array.length; ++i) {
            colorSchemeColors[i] = d.f(context, array[i]);
        }
        this.setColorSchemeColors(colorSchemeColors);
    }
    
    public void setDistanceToTriggerSync(final int n) {
        this.K = (float)n;
    }
    
    public void setEnabled(final boolean enabled) {
        super.setEnabled(enabled);
        if (!enabled) {
            this.x();
        }
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.N.p(b);
    }
    
    public void setOnChildScrollUpCallback(@k0 final i t0) {
        this.t0 = t0;
    }
    
    public void setOnRefreshListener(@k0 final j h) {
        this.H = h;
    }
    
    @Deprecated
    public void setProgressBackgroundColor(final int progressBackgroundColorSchemeResource) {
        this.setProgressBackgroundColorSchemeResource(progressBackgroundColorSchemeResource);
    }
    
    public void setProgressBackgroundColorSchemeColor(@l final int backgroundColor) {
        this.d0.setBackgroundColor(backgroundColor);
    }
    
    public void setProgressBackgroundColorSchemeResource(@androidx.annotation.n final int n) {
        this.setProgressBackgroundColorSchemeColor(d.f(this.getContext(), n));
    }
    
    public void setRefreshing(final boolean i) {
        if (i && this.I != i) {
            this.I = i;
            int i2;
            if (!this.s0) {
                i2 = this.i0 + this.h0;
            }
            else {
                i2 = this.i0;
            }
            this.setTargetOffsetTopAndBottom(i2 - this.S);
            this.q0 = false;
            this.H(this.u0);
        }
        else {
            this.A(i, false);
        }
    }
    
    public void setSize(final int n) {
        if (n != 0 && n != 1) {
            return;
        }
        final DisplayMetrics displayMetrics = this.getResources().getDisplayMetrics();
        float n2;
        if (n == 0) {
            n2 = 56.0f;
        }
        else {
            n2 = 40.0f;
        }
        this.r0 = (int)(displayMetrics.density * n2);
        this.d0.setImageDrawable((Drawable)null);
        this.k0.F(n);
        this.d0.setImageDrawable((Drawable)this.k0);
    }
    
    public void setSlingshotDistance(@n0 final int j0) {
        this.j0 = j0;
    }
    
    void setTargetOffsetTopAndBottom(final int n) {
        this.d0.bringToFront();
        androidx.core.view.j0.d1((View)this.d0, n);
        this.S = this.d0.getTop();
    }
    
    public boolean startNestedScroll(final int n) {
        return this.N.r(n);
    }
    
    public void stopNestedScroll() {
        this.N.t();
    }
    
    void v(final float n) {
        final int f0 = this.f0;
        this.setTargetOffsetTopAndBottom(f0 + (int)((this.h0 - f0) * n) - this.d0.getTop());
    }
    
    void x() {
        this.d0.clearAnimation();
        this.k0.stop();
        this.d0.setVisibility(8);
        this.setColorViewAlpha(255);
        if (this.a0) {
            this.setAnimationProgress(0.0f);
        }
        else {
            this.setTargetOffsetTopAndBottom(this.h0 - this.S);
        }
        this.S = this.d0.getTop();
    }
    
    public void y(final boolean a0, final int i0) {
        this.i0 = i0;
        this.a0 = a0;
        this.d0.invalidate();
    }
    
    public void z(final boolean a0, final int h0, final int i0) {
        this.a0 = a0;
        this.h0 = h0;
        this.i0 = i0;
        this.s0 = true;
        this.x();
        this.I = false;
    }
    
    public interface i
    {
        boolean a(@j0 final SwipeRefreshLayout p0, @k0 final View p1);
    }
    
    public interface j
    {
        void a();
    }
}
