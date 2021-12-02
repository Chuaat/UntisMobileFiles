// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import android.os.Bundle;
import androidx.core.view.accessibility.d;
import android.view.accessibility.AccessibilityRecord;
import androidx.core.view.accessibility.f;
import android.widget.ScrollView;
import android.view.accessibility.AccessibilityEvent;
import android.os.Parcelable;
import android.util.Log;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.View$MeasureSpec;
import android.view.FocusFinder;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.view.KeyEvent;
import androidx.annotation.t0;
import android.view.ViewGroup$LayoutParams;
import java.util.ArrayList;
import android.util.TypedValue;
import android.widget.FrameLayout$LayoutParams;
import android.view.animation.AnimationUtils;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.view.ViewConfiguration;
import android.content.res.TypedArray;
import android.view.ViewGroup;
import k.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.view.v;
import androidx.core.view.z;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import android.graphics.Rect;
import androidx.core.view.g0;
import androidx.core.view.t;
import androidx.core.view.x;
import android.widget.FrameLayout;

public class NestedScrollView extends FrameLayout implements x, t, g0
{
    static final int j0 = 250;
    static final float k0 = 0.5f;
    private static final String l0 = "NestedScrollView";
    private static final int m0 = 250;
    private static final int n0 = -1;
    private static final a o0;
    private static final int[] p0;
    private long G;
    private final Rect H;
    private OverScroller I;
    private EdgeEffect J;
    private EdgeEffect K;
    private int L;
    private boolean M;
    private boolean N;
    private View O;
    private boolean P;
    private VelocityTracker Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private int V;
    private int W;
    private final int[] a0;
    private final int[] b0;
    private int c0;
    private int d0;
    private c e0;
    private final z f0;
    private final v g0;
    private float h0;
    private b i0;
    
    static {
        o0 = new a();
        p0 = new int[] { 16843130 };
    }
    
    public NestedScrollView(@j0 final Context context) {
        this(context, null);
    }
    
    public NestedScrollView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, k.a.a.m);
    }
    
    public NestedScrollView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.H = new Rect();
        this.M = true;
        this.N = false;
        this.O = null;
        this.P = false;
        this.S = true;
        this.W = -1;
        this.a0 = new int[2];
        this.b0 = new int[2];
        this.A();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, NestedScrollView.p0, n, 0);
        this.setFillViewport(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
        this.f0 = new z((ViewGroup)this);
        this.g0 = new v((View)this);
        this.setNestedScrollingEnabled(true);
        androidx.core.view.j0.z1((View)this, NestedScrollView.o0);
    }
    
    private void A() {
        this.I = new OverScroller(this.getContext());
        this.setFocusable(true);
        this.setDescendantFocusability(262144);
        this.setWillNotDraw(false);
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        this.T = value.getScaledTouchSlop();
        this.U = value.getScaledMinimumFlingVelocity();
        this.V = value.getScaledMaximumFlingVelocity();
    }
    
    private void B() {
        if (this.Q == null) {
            this.Q = VelocityTracker.obtain();
        }
    }
    
    private boolean D(final View view) {
        return this.G(view, 0, this.getHeight()) ^ true;
    }
    
    private static boolean F(final View view, final View view2) {
        boolean b = true;
        if (view == view2) {
            return true;
        }
        final ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup) || !F((View)parent, view2)) {
            b = false;
        }
        return b;
    }
    
    private boolean G(final View view, final int n, final int n2) {
        view.getDrawingRect(this.H);
        this.offsetDescendantRectToMyCoords(view, this.H);
        return this.H.bottom + n >= this.getScrollY() && this.H.top - n <= this.getScrollY() + n2;
    }
    
    private void H(final int n, final int n2, @k0 final int[] array) {
        final int scrollY = this.getScrollY();
        this.scrollBy(0, n);
        final int n3 = this.getScrollY() - scrollY;
        if (array != null) {
            array[1] += n3;
        }
        this.g0.e(0, n3, 0, n - n3, null, n2, array);
    }
    
    private void I(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.L = (int)motionEvent.getY(n);
            this.W = motionEvent.getPointerId(n);
            final VelocityTracker q = this.Q;
            if (q != null) {
                q.clear();
            }
        }
    }
    
    private void L() {
        final VelocityTracker q = this.Q;
        if (q != null) {
            q.recycle();
            this.Q = null;
        }
    }
    
    private void M(final boolean b) {
        if (b) {
            this.f(2, 1);
        }
        else {
            this.g(1);
        }
        this.d0 = this.getScrollY();
        androidx.core.view.j0.l1((View)this);
    }
    
    private boolean N(final int n, int n2, final int n3) {
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n4 = height + scrollY;
        final boolean b = false;
        final boolean b2 = n == 33;
        Object v;
        if ((v = this.v(b2, n2, n3)) == null) {
            v = this;
        }
        boolean b3;
        if (n2 >= scrollY && n3 <= n4) {
            b3 = b;
        }
        else {
            if (b2) {
                n2 -= scrollY;
            }
            else {
                n2 = n3 - n4;
            }
            this.l(n2);
            b3 = true;
        }
        if (v != this.findFocus()) {
            ((View)v).requestFocus(n);
        }
        return b3;
    }
    
    private void O(final View view) {
        view.getDrawingRect(this.H);
        this.offsetDescendantRectToMyCoords(view, this.H);
        final int k = this.k(this.H);
        if (k != 0) {
            this.scrollBy(0, k);
        }
    }
    
    private boolean P(final Rect rect, final boolean b) {
        final int k = this.k(rect);
        final boolean b2 = k != 0;
        if (b2) {
            if (b) {
                this.scrollBy(0, k);
            }
            else {
                this.Q(0, k);
            }
        }
        return b2;
    }
    
    private void S(int scrollY, int max, final int n, final boolean b) {
        if (this.getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.G > 250L) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int height = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            final int height2 = this.getHeight();
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            max = Math.max(0, Math.min(max + scrollY, Math.max(0, height + topMargin + bottomMargin - (height2 - paddingTop - paddingBottom))));
            this.I.startScroll(this.getScrollX(), scrollY, 0, max - scrollY, n);
            this.M(b);
        }
        else {
            if (!this.I.isFinished()) {
                this.e();
            }
            this.scrollBy(scrollY, max);
        }
        this.G = AnimationUtils.currentAnimationTimeMillis();
    }
    
    private void e() {
        this.I.abortAnimation();
        this.g(1);
    }
    
    private float getVerticalScrollFactorCompat() {
        if (this.h0 == 0.0f) {
            final TypedValue typedValue = new TypedValue();
            final Context context = this.getContext();
            if (!context.getTheme().resolveAttribute(16842829, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.h0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.h0;
    }
    
    private boolean i() {
        final int childCount = this.getChildCount();
        boolean b = false;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            b = b;
            if (child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin > this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()) {
                b = true;
            }
        }
        return b;
    }
    
    private static int j(final int n, final int n2, final int n3) {
        if (n2 >= n3 || n < 0) {
            return 0;
        }
        if (n2 + n > n3) {
            return n3 - n2;
        }
        return n;
    }
    
    private void l(final int n) {
        if (n != 0) {
            if (this.S) {
                this.Q(0, n);
            }
            else {
                this.scrollBy(0, n);
            }
        }
    }
    
    private void m() {
        this.P = false;
        this.L();
        this.g(0);
        final EdgeEffect j = this.J;
        if (j != null) {
            j.onRelease();
            this.K.onRelease();
        }
    }
    
    private void n() {
        if (this.getOverScrollMode() != 2) {
            if (this.J == null) {
                final Context context = this.getContext();
                this.J = new EdgeEffect(context);
                this.K = new EdgeEffect(context);
            }
        }
        else {
            this.J = null;
            this.K = null;
        }
    }
    
    private View v(final boolean b, final int n, final int n2) {
        final ArrayList focusables = this.getFocusables(2);
        final int size = focusables.size();
        View view = null;
        int i = 0;
        int n3 = 0;
        while (i < size) {
            final View view2 = focusables.get(i);
            final int top = view2.getTop();
            final int bottom = view2.getBottom();
            View view3 = view;
            int n4 = n3;
            Label_0232: {
                if (n < bottom) {
                    view3 = view;
                    n4 = n3;
                    if (top < n2) {
                        final boolean b2 = n < top && bottom < n2;
                        if (view == null) {
                            view3 = view2;
                            n4 = (b2 ? 1 : 0);
                        }
                        else {
                            final boolean b3 = (b && top < view.getTop()) || (!b && bottom > view.getBottom());
                            if (n3 != 0) {
                                view3 = view;
                                n4 = n3;
                                if (!b2) {
                                    break Label_0232;
                                }
                                view3 = view;
                                n4 = n3;
                                if (!b3) {
                                    break Label_0232;
                                }
                            }
                            else {
                                if (b2) {
                                    view3 = view2;
                                    n4 = 1;
                                    break Label_0232;
                                }
                                view3 = view;
                                n4 = n3;
                                if (!b3) {
                                    break Label_0232;
                                }
                            }
                            view3 = view2;
                            n4 = n3;
                        }
                    }
                }
            }
            ++i;
            view = view3;
            n3 = n4;
        }
        return view;
    }
    
    private boolean y(final int n, final int n2) {
        final int childCount = this.getChildCount();
        boolean b2;
        final boolean b = b2 = false;
        if (childCount > 0) {
            final int scrollY = this.getScrollY();
            final View child = this.getChildAt(0);
            b2 = b;
            if (n2 >= child.getTop() - scrollY) {
                b2 = b;
                if (n2 < child.getBottom() - scrollY) {
                    b2 = b;
                    if (n >= child.getLeft()) {
                        b2 = b;
                        if (n < child.getRight()) {
                            b2 = true;
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    private void z() {
        final VelocityTracker q = this.Q;
        if (q == null) {
            this.Q = VelocityTracker.obtain();
        }
        else {
            q.clear();
        }
    }
    
    public boolean C() {
        return this.R;
    }
    
    public boolean E() {
        return this.S;
    }
    
    boolean J(int n, int n2, int n3, int n4, int n5, int n6, int n7, final int n8, final boolean b) {
        final int overScrollMode = this.getOverScrollMode();
        final int computeHorizontalScrollRange = this.computeHorizontalScrollRange();
        final int computeHorizontalScrollExtent = this.computeHorizontalScrollExtent();
        final boolean b2 = false;
        final boolean b3 = computeHorizontalScrollRange > computeHorizontalScrollExtent;
        final boolean b4 = this.computeVerticalScrollRange() > this.computeVerticalScrollExtent();
        final boolean b5 = overScrollMode == 0 || (overScrollMode == 1 && b3);
        final boolean b6 = overScrollMode == 0 || (overScrollMode == 1 && b4);
        n3 += n;
        if (!b5) {
            n = 0;
        }
        else {
            n = n7;
        }
        n4 += n2;
        if (!b6) {
            n2 = 0;
        }
        else {
            n2 = n8;
        }
        n7 = -n;
        n += n5;
        n5 = -n2;
        n6 += n2;
        boolean b7 = false;
        Label_0198: {
            if (n3 <= n) {
                if (n3 >= n7) {
                    b7 = false;
                    n2 = n3;
                    break Label_0198;
                }
                n = n7;
            }
            b7 = true;
            n2 = n;
        }
        boolean b8 = false;
        Label_0233: {
            if (n4 > n6) {
                n = n6;
            }
            else {
                if (n4 >= n5) {
                    b8 = false;
                    n = n4;
                    break Label_0233;
                }
                n = n5;
            }
            b8 = true;
        }
        if (b8 && !this.d(1)) {
            this.I.springBack(n2, n, 0, 0, 0, this.getScrollRange());
        }
        this.onOverScrolled(n2, n, b7, b8);
        if (!b7) {
            final boolean b9 = b2;
            if (!b8) {
                return b9;
            }
        }
        return true;
    }
    
    public boolean K(final int n) {
        final boolean b = n == 130;
        final int height = this.getHeight();
        if (b) {
            this.H.top = this.getScrollY() + height;
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                final View child = this.getChildAt(childCount - 1);
                final int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                final Rect h = this.H;
                if (h.top + height > n2) {
                    h.top = n2 - height;
                }
            }
        }
        else {
            this.H.top = this.getScrollY() - height;
            final Rect h2 = this.H;
            if (h2.top < 0) {
                h2.top = 0;
            }
        }
        final Rect h3 = this.H;
        final int top = h3.top;
        final int bottom = height + top;
        h3.bottom = bottom;
        return this.N(n, top, bottom);
    }
    
    public final void Q(final int n, final int n2) {
        this.S(n, n2, 250, false);
    }
    
    public final void R(final int n, final int n2, final int n3) {
        this.S(n, n2, n3, false);
    }
    
    public final void T(final int n, final int n2) {
        this.V(n, n2, 250, false);
    }
    
    public final void U(final int n, final int n2, final int n3) {
        this.V(n, n2, n3, false);
    }
    
    void V(final int n, final int n2, final int n3, final boolean b) {
        this.S(n - this.getScrollX(), n2 - this.getScrollY(), n3, b);
    }
    
    void W(final int n, final int n2, final boolean b) {
        this.V(n, n2, 250, b);
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5) {
        return this.g0.g(n, n2, n3, n4, array, n5);
    }
    
    public void addView(final View view) {
        if (this.getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final int n) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, n, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public void addView(final View view, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (this.getChildCount() <= 0) {
            super.addView(view, viewGroup$LayoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
    
    public boolean b(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.g0.d(n, n2, array, array2, n3);
    }
    
    public void c(final int n, final int n2, final int n3, final int n4, @k0 final int[] array, final int n5, @j0 final int[] array2) {
        this.g0.e(n, n2, n3, n4, array, n5, array2);
    }
    
    @t0({ t0.a.I })
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }
    
    @t0({ t0.a.I })
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }
    
    @t0({ t0.a.I })
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }
    
    public void computeScroll() {
        if (this.I.isFinished()) {
            return;
        }
        this.I.computeScrollOffset();
        final int currY = this.I.getCurrY();
        final int n = currY - this.d0;
        this.d0 = currY;
        final int[] b0 = this.b0;
        final boolean b2 = false;
        this.b(b0[1] = 0, n, b0, null, 1);
        final int n2 = n - this.b0[1];
        final int scrollRange = this.getScrollRange();
        int n3;
        if ((n3 = n2) != 0) {
            final int scrollY = this.getScrollY();
            this.J(0, n2, this.getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            final int n4 = this.getScrollY() - scrollY;
            final int n5 = n2 - n4;
            final int[] b3 = this.b0;
            this.c(b3[1] = 0, n4, 0, n5, this.a0, 1, b3);
            n3 = n5 - this.b0[1];
        }
        if (n3 != 0) {
            final int overScrollMode = this.getOverScrollMode();
            int n6 = 0;
            Label_0182: {
                if (overScrollMode != 0) {
                    n6 = (b2 ? 1 : 0);
                    if (overScrollMode != 1) {
                        break Label_0182;
                    }
                    n6 = (b2 ? 1 : 0);
                    if (scrollRange <= 0) {
                        break Label_0182;
                    }
                }
                n6 = 1;
            }
            Label_0239: {
                if (n6 != 0) {
                    this.n();
                    EdgeEffect edgeEffect;
                    if (n3 < 0) {
                        if (!this.J.isFinished()) {
                            break Label_0239;
                        }
                        edgeEffect = this.J;
                    }
                    else {
                        if (!this.K.isFinished()) {
                            break Label_0239;
                        }
                        edgeEffect = this.K;
                    }
                    edgeEffect.onAbsorb((int)this.I.getCurrVelocity());
                }
            }
            this.e();
        }
        if (!this.I.isFinished()) {
            androidx.core.view.j0.l1((View)this);
        }
        else {
            this.g(1);
        }
    }
    
    @t0({ t0.a.I })
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }
    
    @t0({ t0.a.I })
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }
    
    @t0({ t0.a.I })
    public int computeVerticalScrollRange() {
        final int childCount = this.getChildCount();
        final int n = this.getHeight() - this.getPaddingBottom() - this.getPaddingTop();
        if (childCount == 0) {
            return n;
        }
        final View child = this.getChildAt(0);
        final int n2 = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin;
        final int scrollY = this.getScrollY();
        final int max = Math.max(0, n2 - n);
        int n3;
        if (scrollY < 0) {
            n3 = n2 - scrollY;
        }
        else {
            n3 = n2;
            if (scrollY > max) {
                n3 = n2 + (scrollY - max);
            }
        }
        return n3;
    }
    
    public boolean d(final int n) {
        return this.g0.l(n);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || this.o(keyEvent);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.g0.a(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.g0.b(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.b(n, n2, array, array2, 0);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.g0.f(n, n2, n3, n4, array);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        if (this.J != null) {
            final int scrollY = this.getScrollY();
            final boolean finished = this.J.isFinished();
            final int n = 0;
            if (!finished) {
                final int save = canvas.save();
                int width = this.getWidth();
                final int height = this.getHeight();
                final int min = Math.min(0, scrollY);
                final int sdk_INT = Build$VERSION.SDK_INT;
                int n2;
                if (sdk_INT >= 21 && !this.getClipToPadding()) {
                    n2 = 0;
                }
                else {
                    width -= this.getPaddingLeft() + this.getPaddingRight();
                    n2 = this.getPaddingLeft() + 0;
                }
                int n3 = height;
                int n4 = min;
                if (sdk_INT >= 21) {
                    n3 = height;
                    n4 = min;
                    if (this.getClipToPadding()) {
                        n3 = height - (this.getPaddingTop() + this.getPaddingBottom());
                        n4 = min + this.getPaddingTop();
                    }
                }
                canvas.translate((float)n2, (float)n4);
                this.J.setSize(width, n3);
                if (this.J.draw(canvas)) {
                    androidx.core.view.j0.l1((View)this);
                }
                canvas.restoreToCount(save);
            }
            if (!this.K.isFinished()) {
                final int save2 = canvas.save();
                final int width2 = this.getWidth();
                final int height2 = this.getHeight();
                final int n5 = Math.max(this.getScrollRange(), scrollY) + height2;
                final int sdk_INT2 = Build$VERSION.SDK_INT;
                int n6 = 0;
                int n7 = 0;
                Label_0290: {
                    if (sdk_INT2 >= 21) {
                        n6 = n;
                        n7 = width2;
                        if (!this.getClipToPadding()) {
                            break Label_0290;
                        }
                    }
                    n7 = width2 - (this.getPaddingLeft() + this.getPaddingRight());
                    n6 = 0 + this.getPaddingLeft();
                }
                int n8 = n5;
                int n9 = height2;
                if (sdk_INT2 >= 21) {
                    n8 = n5;
                    n9 = height2;
                    if (this.getClipToPadding()) {
                        n9 = height2 - (this.getPaddingTop() + this.getPaddingBottom());
                        n8 = n5 - this.getPaddingBottom();
                    }
                }
                canvas.translate((float)(n6 - n7), (float)n8);
                canvas.rotate(180.0f, (float)n7, 0.0f);
                this.K.setSize(n7, n9);
                if (this.K.draw(canvas)) {
                    androidx.core.view.j0.l1((View)this);
                }
                canvas.restoreToCount(save2);
            }
        }
    }
    
    public boolean f(final int n, final int n2) {
        return this.g0.s(n, n2);
    }
    
    public void g(final int n) {
        this.g0.u(n);
    }
    
    protected float getBottomFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int n = child.getBottom() + frameLayout$LayoutParams.bottomMargin - this.getScrollY() - (this.getHeight() - this.getPaddingBottom());
        if (n < verticalFadingEdgeLength) {
            return n / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public int getMaxScrollAmount() {
        return (int)(this.getHeight() * 0.5f);
    }
    
    public int getNestedScrollAxes() {
        return this.f0.a();
    }
    
    int getScrollRange() {
        final int childCount = this.getChildCount();
        int max = 0;
        if (childCount > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            max = Math.max(0, child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin - (this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()));
        }
        return max;
    }
    
    protected float getTopFadingEdgeStrength() {
        if (this.getChildCount() == 0) {
            return 0.0f;
        }
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        final int scrollY = this.getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / (float)verticalFadingEdgeLength;
        }
        return 1.0f;
    }
    
    public boolean h(int descendantFocusability) {
        View focus;
        if ((focus = this.findFocus()) == this) {
            focus = null;
        }
        final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, descendantFocusability);
        final int maxScrollAmount = this.getMaxScrollAmount();
        if (nextFocus != null && this.G(nextFocus, maxScrollAmount, this.getHeight())) {
            nextFocus.getDrawingRect(this.H);
            this.offsetDescendantRectToMyCoords(nextFocus, this.H);
            this.l(this.k(this.H));
            nextFocus.requestFocus(descendantFocusability);
        }
        else {
            int n;
            if (descendantFocusability == 33 && this.getScrollY() < maxScrollAmount) {
                n = this.getScrollY();
            }
            else {
                n = maxScrollAmount;
                if (descendantFocusability == 130) {
                    n = maxScrollAmount;
                    if (this.getChildCount() > 0) {
                        final View child = this.getChildAt(0);
                        n = Math.min(child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin - (this.getScrollY() + this.getHeight() - this.getPaddingBottom()), maxScrollAmount);
                    }
                }
            }
            if (n == 0) {
                return false;
            }
            if (descendantFocusability != 130) {
                n = -n;
            }
            this.l(n);
        }
        if (focus != null && focus.isFocused() && this.D(focus)) {
            descendantFocusability = this.getDescendantFocusability();
            this.setDescendantFocusability(131072);
            this.requestFocus();
            this.setDescendantFocusability(descendantFocusability);
        }
        return true;
    }
    
    public boolean hasNestedScrollingParent() {
        return this.d(0);
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.g0.m();
    }
    
    protected int k(final Rect rect) {
        final int childCount = this.getChildCount();
        final boolean b = false;
        if (childCount == 0) {
            return 0;
        }
        final int height = this.getHeight();
        final int scrollY = this.getScrollY();
        final int n = scrollY + height;
        final int verticalFadingEdgeLength = this.getVerticalFadingEdgeLength();
        int n2 = scrollY;
        if (rect.top > 0) {
            n2 = scrollY + verticalFadingEdgeLength;
        }
        final View child = this.getChildAt(0);
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
        int n3;
        if (rect.bottom < child.getHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin) {
            n3 = n - verticalFadingEdgeLength;
        }
        else {
            n3 = n;
        }
        final int bottom = rect.bottom;
        int n5;
        if (bottom > n3 && rect.top > n2) {
            int n4;
            if (rect.height() > height) {
                n4 = rect.top - n2;
            }
            else {
                n4 = rect.bottom - n3;
            }
            n5 = Math.min(n4 + 0, child.getBottom() + frameLayout$LayoutParams.bottomMargin - n);
        }
        else {
            n5 = (b ? 1 : 0);
            if (rect.top < n2) {
                n5 = (b ? 1 : 0);
                if (bottom < n3) {
                    int a;
                    if (rect.height() > height) {
                        a = 0 - (n3 - rect.bottom);
                    }
                    else {
                        a = 0 - (n2 - rect.top);
                    }
                    n5 = Math.max(a, -this.getScrollY());
                }
            }
        }
        return n5;
    }
    
    protected void measureChild(final View view, final int n, final int n2) {
        view.measure(FrameLayout.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight(), view.getLayoutParams().width), View$MeasureSpec.makeMeasureSpec(0, 0));
    }
    
    protected void measureChildWithMargins(final View view, final int n, final int n2, final int n3, final int n4) {
        final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)view.getLayoutParams();
        view.measure(FrameLayout.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin + n2, viewGroup$MarginLayoutParams.width), View$MeasureSpec.makeMeasureSpec(viewGroup$MarginLayoutParams.topMargin + viewGroup$MarginLayoutParams.bottomMargin, 0));
    }
    
    public boolean o(@j0 final KeyEvent keyEvent) {
        this.H.setEmpty();
        final boolean i = this.i();
        final boolean b = false;
        final boolean b2 = false;
        int n = 130;
        if (!i) {
            boolean b3 = b2;
            if (this.isFocused()) {
                b3 = b2;
                if (keyEvent.getKeyCode() != 4) {
                    View focus;
                    if ((focus = this.findFocus()) == this) {
                        focus = null;
                    }
                    final View nextFocus = FocusFinder.getInstance().findNextFocus((ViewGroup)this, focus, 130);
                    b3 = b2;
                    if (nextFocus != null) {
                        b3 = b2;
                        if (nextFocus != this) {
                            b3 = b2;
                            if (nextFocus.requestFocus(130)) {
                                b3 = true;
                            }
                        }
                    }
                }
            }
            return b3;
        }
        boolean b4 = b;
        if (keyEvent.getAction() == 0) {
            final int keyCode = keyEvent.getKeyCode();
            if (keyCode != 19) {
                if (keyCode != 20) {
                    if (keyCode != 62) {
                        b4 = b;
                    }
                    else {
                        if (keyEvent.isShiftPressed()) {
                            n = 33;
                        }
                        this.K(n);
                        b4 = b;
                    }
                }
                else if (!keyEvent.isAltPressed()) {
                    b4 = this.h(130);
                }
                else {
                    b4 = this.x(130);
                }
            }
            else if (!keyEvent.isAltPressed()) {
                b4 = this.h(33);
            }
            else {
                b4 = this.x(33);
            }
        }
        return b4;
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N = false;
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0) {
            if (motionEvent.getAction() == 8) {
                if (!this.P) {
                    final float axisValue = motionEvent.getAxisValue(9);
                    if (axisValue != 0.0f) {
                        final int n = (int)(axisValue * this.getVerticalScrollFactorCompat());
                        int scrollRange = this.getScrollRange();
                        final int scrollY = this.getScrollY();
                        final int n2 = scrollY - n;
                        if (n2 < 0) {
                            scrollRange = 0;
                        }
                        else if (n2 <= scrollRange) {
                            scrollRange = n2;
                        }
                        if (scrollRange != scrollY) {
                            super.scrollTo(this.getScrollX(), scrollRange);
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action == 2 && this.P) {
            return true;
        }
        final int n = action & 0xFF;
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        if (n != 6) {
                            return this.P;
                        }
                        this.I(motionEvent);
                        return this.P;
                    }
                }
                else {
                    final int w = this.W;
                    if (w == -1) {
                        return this.P;
                    }
                    final int pointerIndex = motionEvent.findPointerIndex(w);
                    if (pointerIndex == -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid pointerId=");
                        sb.append(w);
                        sb.append(" in onInterceptTouchEvent");
                        Log.e("NestedScrollView", sb.toString());
                        return this.P;
                    }
                    final int l = (int)motionEvent.getY(pointerIndex);
                    if (Math.abs(l - this.L) <= this.T || (0x2 & this.getNestedScrollAxes()) != 0x0) {
                        return this.P;
                    }
                    this.P = true;
                    this.L = l;
                    this.B();
                    this.Q.addMovement(motionEvent);
                    this.c0 = 0;
                    final ViewParent parent = this.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                        return this.P;
                    }
                    return this.P;
                }
            }
            this.P = false;
            this.W = -1;
            this.L();
            if (this.I.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                androidx.core.view.j0.l1((View)this);
            }
            this.g(0);
        }
        else {
            final int i = (int)motionEvent.getY();
            if (!this.y((int)motionEvent.getX(), i)) {
                this.P = false;
                this.L();
            }
            else {
                this.L = i;
                this.W = motionEvent.getPointerId(0);
                this.z();
                this.Q.addMovement(motionEvent);
                this.I.computeScrollOffset();
                this.P = (this.I.isFinished() ^ true);
                this.f(2, 0);
            }
        }
        return this.P;
    }
    
    protected void onLayout(final boolean b, int j, final int n, int scrollY, final int n2) {
        super.onLayout(b, j, n, scrollY, n2);
        j = 0;
        this.M = false;
        final View o = this.O;
        if (o != null && F(o, (View)this)) {
            this.O(this.O);
        }
        this.O = null;
        if (!this.N) {
            if (this.e0 != null) {
                this.scrollTo(this.getScrollX(), this.e0.G);
                this.e0 = null;
            }
            if (this.getChildCount() > 0) {
                final View child = this.getChildAt(0);
                final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
                j = child.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
            }
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            scrollY = this.getScrollY();
            j = j(scrollY, n2 - n - paddingTop - paddingBottom, j);
            if (j != scrollY) {
                this.scrollTo(this.getScrollX(), j);
            }
        }
        this.scrollTo(this.getScrollX(), this.getScrollY());
        this.N = true;
    }
    
    protected void onMeasure(final int n, int measuredHeight) {
        super.onMeasure(n, measuredHeight);
        if (!this.R) {
            return;
        }
        if (View$MeasureSpec.getMode(measuredHeight) == 0) {
            return;
        }
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            measuredHeight = child.getMeasuredHeight();
            final int n2 = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom() - frameLayout$LayoutParams.topMargin - frameLayout$LayoutParams.bottomMargin;
            if (measuredHeight < n2) {
                child.measure(FrameLayout.getChildMeasureSpec(n, this.getPaddingLeft() + this.getPaddingRight() + frameLayout$LayoutParams.leftMargin + frameLayout$LayoutParams.rightMargin, frameLayout$LayoutParams.width), View$MeasureSpec.makeMeasureSpec(n2, 1073741824));
            }
        }
    }
    
    public boolean onNestedFling(@j0 final View view, final float n, final float n2, final boolean b) {
        if (!b) {
            this.dispatchNestedFling(0.0f, n2, true);
            this.w((int)n2);
            return true;
        }
        return false;
    }
    
    public boolean onNestedPreFling(@j0 final View view, final float n, final float n2) {
        return this.dispatchNestedPreFling(n, n2);
    }
    
    public void onNestedPreScroll(@j0 final View view, final int n, final int n2, @j0 final int[] array) {
        this.u(view, n, n2, array, 0);
    }
    
    public void onNestedScroll(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
        this.H(n4, 0, null);
    }
    
    public void onNestedScrollAccepted(@j0 final View view, @j0 final View view2, final int n) {
        this.s(view, view2, n, 0);
    }
    
    protected void onOverScrolled(final int n, final int n2, final boolean b, final boolean b2) {
        super.scrollTo(n, n2);
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        int n2;
        if (n == 2) {
            n2 = 130;
        }
        else if ((n2 = n) == 1) {
            n2 = 33;
        }
        final FocusFinder instance = FocusFinder.getInstance();
        View view;
        if (rect == null) {
            view = instance.findNextFocus((ViewGroup)this, (View)null, n2);
        }
        else {
            view = instance.findNextFocusFromRect((ViewGroup)this, rect, n2);
        }
        return view != null && !this.D(view) && view.requestFocus(n2, rect);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final c e0 = (c)parcelable;
        super.onRestoreInstanceState(e0.getSuperState());
        this.e0 = e0;
        this.requestLayout();
    }
    
    protected Parcelable onSaveInstanceState() {
        final c c = new c(super.onSaveInstanceState());
        c.G = this.getScrollY();
        return (Parcelable)c;
    }
    
    protected void onScrollChanged(final int n, final int n2, final int n3, final int n4) {
        super.onScrollChanged(n, n2, n3, n4);
        final b i0 = this.i0;
        if (i0 != null) {
            i0.a(this, n, n2, n3, n4);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        final View focus = this.findFocus();
        if (focus != null) {
            if (this != focus) {
                if (this.G(focus, 0, n4)) {
                    focus.getDrawingRect(this.H);
                    this.offsetDescendantRectToMyCoords(focus, this.H);
                    this.l(this.k(this.H));
                }
            }
        }
    }
    
    public boolean onStartNestedScroll(@j0 final View view, @j0 final View view2, final int n) {
        return this.r(view, view2, n, 0);
    }
    
    public void onStopNestedScroll(@j0 final View view) {
        this.t(view, 0);
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.B();
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c0 = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation(0.0f, (float)this.c0);
        Label_0905: {
            if (actionMasked != 0) {
                Label_0161: {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked != 3) {
                                if (actionMasked == 5) {
                                    final int actionIndex = motionEvent.getActionIndex();
                                    this.L = (int)motionEvent.getY(actionIndex);
                                    this.W = motionEvent.getPointerId(actionIndex);
                                    break Label_0905;
                                }
                                if (actionMasked != 6) {
                                    break Label_0905;
                                }
                                this.I(motionEvent);
                                this.L = (int)motionEvent.getY(motionEvent.findPointerIndex(this.W));
                                break Label_0905;
                            }
                            else if (!this.P || this.getChildCount() <= 0 || !this.I.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                                break Label_0161;
                            }
                        }
                        else {
                            final int pointerIndex = motionEvent.findPointerIndex(this.W);
                            if (pointerIndex == -1) {
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Invalid pointerId=");
                                sb.append(this.W);
                                sb.append(" in onTouchEvent");
                                Log.e("NestedScrollView", sb.toString());
                                break Label_0905;
                            }
                            final int n = (int)motionEvent.getY(pointerIndex);
                            int n2;
                            final int a = n2 = this.L - n;
                            if (!this.P) {
                                n2 = a;
                                if (Math.abs(a) > this.T) {
                                    final ViewParent parent = this.getParent();
                                    if (parent != null) {
                                        parent.requestDisallowInterceptTouchEvent(true);
                                    }
                                    this.P = true;
                                    final int t = this.T;
                                    if (a > 0) {
                                        n2 = a - t;
                                    }
                                    else {
                                        n2 = a + t;
                                    }
                                }
                            }
                            final int n3 = n2;
                            if (!this.P) {
                                break Label_0905;
                            }
                            int n4 = n3;
                            if (this.b(0, n3, this.b0, this.a0, 0)) {
                                n4 = n3 - this.b0[1];
                                this.c0 += this.a0[1];
                            }
                            this.L = n - this.a0[1];
                            final int scrollY = this.getScrollY();
                            final int scrollRange = this.getScrollRange();
                            final int overScrollMode = this.getOverScrollMode();
                            final boolean b = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                            if (this.J(0, n4, 0, this.getScrollY(), 0, scrollRange, 0, 0, true) && !this.d(0)) {
                                this.Q.clear();
                            }
                            final int n5 = this.getScrollY() - scrollY;
                            final int[] b2 = this.b0;
                            this.c(b2[1] = 0, n5, 0, n4 - n5, this.a0, 0, b2);
                            final int l = this.L;
                            final int[] a2 = this.a0;
                            this.L = l - a2[1];
                            this.c0 += a2[1];
                            if (!b) {
                                break Label_0905;
                            }
                            final int n6 = n4 - this.b0[1];
                            this.n();
                            final int n7 = scrollY + n6;
                            Label_0683: {
                                EdgeEffect edgeEffect;
                                if (n7 < 0) {
                                    j.e(this.J, n6 / (float)this.getHeight(), motionEvent.getX(pointerIndex) / this.getWidth());
                                    if (this.K.isFinished()) {
                                        break Label_0683;
                                    }
                                    edgeEffect = this.K;
                                }
                                else {
                                    if (n7 <= scrollRange) {
                                        break Label_0683;
                                    }
                                    j.e(this.K, n6 / (float)this.getHeight(), 1.0f - motionEvent.getX(pointerIndex) / this.getWidth());
                                    if (this.J.isFinished()) {
                                        break Label_0683;
                                    }
                                    edgeEffect = this.J;
                                }
                                edgeEffect.onRelease();
                            }
                            final EdgeEffect j = this.J;
                            if (j != null && (!j.isFinished() || !this.K.isFinished())) {
                                androidx.core.view.j0.l1((View)this);
                            }
                            break Label_0905;
                        }
                    }
                    else {
                        final VelocityTracker q = this.Q;
                        q.computeCurrentVelocity(1000, (float)this.V);
                        final int a3 = (int)q.getYVelocity(this.W);
                        if (Math.abs(a3) >= this.U) {
                            final int n8 = -a3;
                            final float n9 = (float)n8;
                            if (!this.dispatchNestedPreFling(0.0f, n9)) {
                                this.dispatchNestedFling(0.0f, n9, true);
                                this.w(n8);
                            }
                            break Label_0161;
                        }
                        else if (!this.I.springBack(this.getScrollX(), this.getScrollY(), 0, 0, 0, this.getScrollRange())) {
                            break Label_0161;
                        }
                    }
                    androidx.core.view.j0.l1((View)this);
                }
                this.W = -1;
                this.m();
            }
            else {
                if (this.getChildCount() == 0) {
                    return false;
                }
                final boolean p = this.I.isFinished() ^ true;
                this.P = p;
                if (p) {
                    final ViewParent parent2 = this.getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                }
                if (!this.I.isFinished()) {
                    this.e();
                }
                this.L = (int)motionEvent.getY();
                this.W = motionEvent.getPointerId(0);
                this.f(2, 0);
            }
        }
        final VelocityTracker q2 = this.Q;
        if (q2 != null) {
            q2.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    public void p(@j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
        this.H(n4, n5, array);
    }
    
    public void q(@j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.H(n4, n5, null);
    }
    
    public boolean r(@j0 final View view, @j0 final View view2, final int n, final int n2) {
        return (n & 0x2) != 0x0;
    }
    
    public void requestChildFocus(final View view, final View o) {
        if (!this.M) {
            this.O(o);
        }
        else {
            this.O = o;
        }
        super.requestChildFocus(view, o);
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return this.P(rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        if (b) {
            this.L();
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void requestLayout() {
        this.M = true;
        super.requestLayout();
    }
    
    public void s(@j0 final View view, @j0 final View view2, final int n, final int n2) {
        this.f0.c(view, view2, n, n2);
        this.f(2, n2);
    }
    
    public void scrollTo(int j, int i) {
        if (this.getChildCount() > 0) {
            final View child = this.getChildAt(0);
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)child.getLayoutParams();
            final int width = this.getWidth();
            final int paddingLeft = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            final int width2 = child.getWidth();
            final int leftMargin = frameLayout$LayoutParams.leftMargin;
            final int rightMargin = frameLayout$LayoutParams.rightMargin;
            final int height = this.getHeight();
            final int paddingTop = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            final int height2 = child.getHeight();
            final int topMargin = frameLayout$LayoutParams.topMargin;
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            j = j(j, width - paddingLeft - paddingRight, width2 + leftMargin + rightMargin);
            i = j(i, height - paddingTop - paddingBottom, height2 + topMargin + bottomMargin);
            if (j != this.getScrollX() || i != this.getScrollY()) {
                super.scrollTo(j, i);
            }
        }
    }
    
    public void setFillViewport(final boolean r) {
        if (r != this.R) {
            this.R = r;
            this.requestLayout();
        }
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.g0.p(b);
    }
    
    public void setOnScrollChangeListener(@k0 final b i0) {
        this.i0 = i0;
    }
    
    public void setSmoothScrollingEnabled(final boolean s) {
        this.S = s;
    }
    
    public boolean shouldDelayChildPressedState() {
        return true;
    }
    
    public boolean startNestedScroll(final int n) {
        return this.f(n, 0);
    }
    
    public void stopNestedScroll() {
        this.g(0);
    }
    
    public void t(@j0 final View view, final int n) {
        this.f0.e(view, n);
        this.g(n);
    }
    
    public void u(@j0 final View view, final int n, final int n2, @j0 final int[] array, final int n3) {
        this.b(n, n2, array, null, n3);
    }
    
    public void w(final int n) {
        if (this.getChildCount() > 0) {
            this.I.fling(this.getScrollX(), this.getScrollY(), 0, n, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            this.M(true);
        }
    }
    
    public boolean x(final int n) {
        final boolean b = n == 130;
        final int height = this.getHeight();
        final Rect h = this.H;
        h.top = 0;
        h.bottom = height;
        if (b) {
            final int childCount = this.getChildCount();
            if (childCount > 0) {
                final View child = this.getChildAt(childCount - 1);
                this.H.bottom = child.getBottom() + ((FrameLayout$LayoutParams)child.getLayoutParams()).bottomMargin + this.getPaddingBottom();
                final Rect h2 = this.H;
                h2.top = h2.bottom - height;
            }
        }
        final Rect h3 = this.H;
        return this.N(n, h3.top, h3.bottom);
    }
    
    static class a extends androidx.core.view.a
    {
        @Override
        public void f(final View view, final AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            accessibilityEvent.setClassName((CharSequence)ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            f.N((AccessibilityRecord)accessibilityEvent, nestedScrollView.getScrollX());
            f.P((AccessibilityRecord)accessibilityEvent, nestedScrollView.getScrollRange());
        }
        
        @Override
        public void g(final View view, final d d) {
            super.g(view, d);
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            d.U0(ScrollView.class.getName());
            if (nestedScrollView.isEnabled()) {
                final int scrollRange = nestedScrollView.getScrollRange();
                if (scrollRange > 0) {
                    d.D1(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        d.b(androidx.core.view.accessibility.d.a.s);
                        d.b(androidx.core.view.accessibility.d.a.D);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        d.b(androidx.core.view.accessibility.d.a.r);
                        d.b(androidx.core.view.accessibility.d.a.F);
                    }
                }
            }
        }
        
        @Override
        public boolean j(final View view, int n, final Bundle bundle) {
            if (super.j(view, n, bundle)) {
                return true;
            }
            final NestedScrollView nestedScrollView = (NestedScrollView)view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            if (n != 4096) {
                if (n != 8192 && n != 16908344) {
                    if (n != 16908346) {
                        return false;
                    }
                }
                else {
                    final int height = nestedScrollView.getHeight();
                    final int paddingBottom = nestedScrollView.getPaddingBottom();
                    n = nestedScrollView.getPaddingTop();
                    n = Math.max(nestedScrollView.getScrollY() - (height - paddingBottom - n), 0);
                    if (n != nestedScrollView.getScrollY()) {
                        nestedScrollView.W(0, n, true);
                        return true;
                    }
                    return false;
                }
            }
            final int height2 = nestedScrollView.getHeight();
            final int paddingBottom2 = nestedScrollView.getPaddingBottom();
            n = nestedScrollView.getPaddingTop();
            n = Math.min(nestedScrollView.getScrollY() + (height2 - paddingBottom2 - n), nestedScrollView.getScrollRange());
            if (n != nestedScrollView.getScrollY()) {
                nestedScrollView.W(0, n, true);
                return true;
            }
            return false;
        }
    }
    
    public interface b
    {
        void a(final NestedScrollView p0, final int p1, final int p2, final int p3, final int p4);
    }
    
    static class c extends View$BaseSavedState
    {
        public static final Parcelable$Creator<c> CREATOR;
        public int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
                public c a(final Parcel parcel) {
                    return new c(parcel);
                }
                
                public c[] b(final int n) {
                    return new c[n];
                }
            };
        }
        
        c(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
        }
        
        c(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @j0
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.G);
            sb.append("}");
            return sb.toString();
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
        }
    }
}
