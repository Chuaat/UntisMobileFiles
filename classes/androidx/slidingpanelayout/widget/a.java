// 
// Decompiled by Procyon v0.5.36
// 

package androidx.slidingpanelayout.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.content.res.TypedArray;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.s;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.l;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import android.graphics.Rect;
import androidx.customview.widget.d;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;

public class a extends ViewGroup
{
    private static final String g0 = "SlidingPaneLayout";
    private static final int h0 = 32;
    private static final int i0 = -858993460;
    private static final int j0 = 400;
    private int G;
    private int H;
    private Drawable I;
    private Drawable J;
    private final int K;
    private boolean L;
    View M;
    float N;
    private float O;
    int P;
    boolean Q;
    private int R;
    private float S;
    private float T;
    private e U;
    final androidx.customview.widget.d V;
    boolean W;
    private boolean a0;
    private final Rect b0;
    final ArrayList<b> c0;
    private Method d0;
    private Field e0;
    private boolean f0;
    
    public a(@j0 final Context context) {
        this(context, null);
    }
    
    public a(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public a(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = -858993460;
        this.a0 = true;
        this.b0 = new Rect();
        this.c0 = new ArrayList<b>();
        final float density = context.getResources().getDisplayMetrics().density;
        this.K = (int)(32.0f * density + 0.5f);
        this.setWillNotDraw(false);
        androidx.core.view.j0.z1((View)this, new a());
        androidx.core.view.j0.P1((View)this, 1);
        (this.V = androidx.customview.widget.d.p(this, 0.5f, (androidx.customview.widget.d.c)new c())).U(density * 400.0f);
    }
    
    private boolean d(final View view, final int n) {
        if (!this.a0 && !this.u(0.0f, n)) {
            return false;
        }
        this.W = false;
        return true;
    }
    
    private void e(final View view, final float n, final int n2) {
        final d d = (d)view.getLayoutParams();
        if (n > 0.0f && n2 != 0) {
            final int n3 = (int)(((0xFF000000 & n2) >>> 24) * n);
            if (d.d == null) {
                d.d = new Paint();
            }
            d.d.setColorFilter((ColorFilter)new PorterDuffColorFilter(n3 << 24 | (n2 & 0xFFFFFF), PorterDuff$Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, d.d);
            }
            this.i(view);
        }
        else if (view.getLayerType() != 0) {
            final Paint d2 = d.d;
            if (d2 != null) {
                d2.setColorFilter((ColorFilter)null);
            }
            final b e = new b(view);
            this.c0.add(e);
            androidx.core.view.j0.n1((View)this, e);
        }
    }
    
    private boolean p(final View view, final int n) {
        return (this.a0 || this.u(1.0f, n)) && (this.W = true);
    }
    
    private void q(final float o) {
        final boolean k = this.k();
        final d d = (d)this.M.getLayoutParams();
        final boolean c = d.c;
        int i = 0;
        boolean b = false;
        Label_0063: {
            if (c) {
                int n;
                if (k) {
                    n = d.rightMargin;
                }
                else {
                    n = d.leftMargin;
                }
                if (n <= 0) {
                    b = true;
                    break Label_0063;
                }
            }
            b = false;
        }
        while (i < this.getChildCount()) {
            final View child = this.getChildAt(i);
            if (child != this.M) {
                final float o2 = this.O;
                final int r = this.R;
                final int n2 = (int)((1.0f - o2) * r);
                this.O = o;
                int n3 = n2 - (int)((1.0f - o) * r);
                if (k) {
                    n3 = -n3;
                }
                child.offsetLeftAndRight(n3);
                if (b) {
                    final float o3 = this.O;
                    float n4;
                    if (k) {
                        n4 = o3 - 1.0f;
                    }
                    else {
                        n4 = 1.0f - o3;
                    }
                    this.e(child, n4, this.H);
                }
            }
            ++i;
        }
    }
    
    private static boolean w(final View view) {
        final boolean opaque = view.isOpaque();
        boolean b = true;
        if (opaque) {
            return true;
        }
        if (Build$VERSION.SDK_INT >= 18) {
            return false;
        }
        final Drawable background = view.getBackground();
        if (background != null) {
            if (background.getOpacity() != -1) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    protected boolean a(final View view, final boolean b, int n, final int n2, final int n3) {
        final boolean b2 = view instanceof ViewGroup;
        final boolean b3 = true;
        if (b2) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final int scrollX = view.getScrollX();
            final int scrollY = view.getScrollY();
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                final int n4 = n2 + scrollX;
                if (n4 >= child.getLeft() && n4 < child.getRight()) {
                    final int n5 = n3 + scrollY;
                    if (n5 >= child.getTop() && n5 < child.getBottom() && this.a(child, true, n, n4 - child.getLeft(), n5 - child.getTop())) {
                        return true;
                    }
                }
            }
        }
        if (b) {
            if (!this.k()) {
                n = -n;
            }
            if (view.canScrollHorizontally(n)) {
                return b3;
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean b() {
        return this.L;
    }
    
    public boolean c() {
        return this.d(this.M, 0);
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof d && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void computeScroll() {
        if (this.V.o(true)) {
            if (!this.L) {
                this.V.a();
                return;
            }
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        Drawable drawable;
        if (this.k()) {
            drawable = this.J;
        }
        else {
            drawable = this.I;
        }
        View child;
        if (this.getChildCount() > 1) {
            child = this.getChildAt(1);
        }
        else {
            child = null;
        }
        if (child != null) {
            if (drawable != null) {
                final int top = child.getTop();
                final int bottom = child.getBottom();
                final int intrinsicWidth = drawable.getIntrinsicWidth();
                int right;
                int left;
                if (this.k()) {
                    right = child.getRight();
                    left = intrinsicWidth + right;
                }
                else {
                    right = (left = child.getLeft()) - intrinsicWidth;
                }
                drawable.setBounds(right, top, left, bottom);
                drawable.draw(canvas);
            }
        }
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final d d = (d)view.getLayoutParams();
        final int save = canvas.save();
        if (this.L && !d.b && this.M != null) {
            canvas.getClipBounds(this.b0);
            if (this.k()) {
                final Rect b0 = this.b0;
                b0.left = Math.max(b0.left, this.M.getRight());
            }
            else {
                final Rect b2 = this.b0;
                b2.right = Math.min(b2.right, this.M.getLeft());
            }
            canvas.clipRect(this.b0);
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        return drawChild;
    }
    
    void f(final View view) {
        final e u = this.U;
        if (u != null) {
            u.c(view);
        }
        this.sendAccessibilityEvent(32);
    }
    
    void g(final View view) {
        final e u = this.U;
        if (u != null) {
            u.b(view);
        }
        this.sendAccessibilityEvent(32);
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new d();
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new d(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        d d;
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            d = new d((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            d = new d(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)d;
    }
    
    @l
    public int getCoveredFadeColor() {
        return this.H;
    }
    
    @n0
    public int getParallaxDistance() {
        return this.R;
    }
    
    @l
    public int getSliderFadeColor() {
        return this.G;
    }
    
    void h(final View view) {
        final e u = this.U;
        if (u != null) {
            u.a(view, this.N);
        }
    }
    
    void i(final View view) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 17) {
            androidx.core.view.j0.T1(view, ((d)view.getLayoutParams()).d);
            return;
        }
        Label_0160: {
            if (sdk_INT >= 16) {
                if (!this.f0) {
                    try {
                        this.d0 = View.class.getDeclaredMethod("getDisplayList", (Class<?>[])null);
                    }
                    catch (NoSuchMethodException ex) {
                        Log.e("SlidingPaneLayout", "Couldn't fetch getDisplayList method; dimming won't work right.", (Throwable)ex);
                    }
                    try {
                        (this.e0 = View.class.getDeclaredField("mRecreateDisplayList")).setAccessible(true);
                    }
                    catch (NoSuchFieldException ex2) {
                        Log.e("SlidingPaneLayout", "Couldn't fetch mRecreateDisplayList field; dimming will be slow.", (Throwable)ex2);
                    }
                    this.f0 = true;
                }
                if (this.d0 != null) {
                    final Field e0 = this.e0;
                    if (e0 != null) {
                        try {
                            e0.setBoolean(view, true);
                            this.d0.invoke(view, (Object[])null);
                        }
                        catch (Exception ex3) {
                            Log.e("SlidingPaneLayout", "Error refreshing display list state", (Throwable)ex3);
                        }
                        break Label_0160;
                    }
                }
                view.invalidate();
                return;
            }
        }
        androidx.core.view.j0.m1((View)this, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }
    
    boolean j(final View view) {
        final boolean b = false;
        if (view == null) {
            return false;
        }
        final d d = (d)view.getLayoutParams();
        boolean b2 = b;
        if (this.L) {
            b2 = b;
            if (d.c) {
                b2 = b;
                if (this.N > 0.0f) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    boolean k() {
        final int x = androidx.core.view.j0.X((View)this);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    public boolean l() {
        return !this.L || this.N == 1.0f;
    }
    
    public boolean m() {
        return this.L;
    }
    
    void n(int n) {
        if (this.M == null) {
            this.N = 0.0f;
            return;
        }
        final boolean k = this.k();
        final d d = (d)this.M.getLayoutParams();
        final int width = this.M.getWidth();
        int n2 = n;
        if (k) {
            n2 = this.getWidth() - n - width;
        }
        if (k) {
            n = this.getPaddingRight();
        }
        else {
            n = this.getPaddingLeft();
        }
        int n3;
        if (k) {
            n3 = d.rightMargin;
        }
        else {
            n3 = d.leftMargin;
        }
        final float n4 = (n2 - (n + n3)) / (float)this.P;
        this.N = n4;
        if (this.R != 0) {
            this.q(n4);
        }
        if (d.c) {
            this.e(this.M, this.N, this.G);
        }
        this.h(this.M);
    }
    
    public boolean o() {
        return this.p(this.M, 0);
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a0 = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a0 = true;
        for (int size = this.c0.size(), i = 0; i < size; ++i) {
            this.c0.get(i).run();
        }
        this.c0.clear();
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean l = this.L;
        final boolean b = true;
        if (!l && actionMasked == 0 && this.getChildCount() > 1) {
            final View child = this.getChildAt(1);
            if (child != null) {
                this.W = (this.V.L(child, (int)motionEvent.getX(), (int)motionEvent.getY()) ^ true);
            }
        }
        if (!this.L || (this.Q && actionMasked != 0)) {
            this.V.c();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 3 && actionMasked != 1) {
            boolean b2 = false;
            Label_0251: {
                if (actionMasked != 0) {
                    if (actionMasked == 2) {
                        final float x = motionEvent.getX();
                        final float y = motionEvent.getY();
                        final float abs = Math.abs(x - this.S);
                        final float abs2 = Math.abs(y - this.T);
                        if (abs > this.V.E() && abs2 > abs) {
                            this.V.c();
                            this.Q = true;
                            return false;
                        }
                    }
                }
                else {
                    this.Q = false;
                    final float x2 = motionEvent.getX();
                    final float y2 = motionEvent.getY();
                    this.S = x2;
                    this.T = y2;
                    if (this.V.L(this.M, (int)x2, (int)y2) && this.j(this.M)) {
                        b2 = true;
                        break Label_0251;
                    }
                }
                b2 = false;
            }
            boolean b3 = b;
            if (!this.V.W(motionEvent)) {
                b3 = (b2 && b);
            }
            return b3;
        }
        this.V.c();
        return false;
    }
    
    protected void onLayout(final boolean b, int i, int r, int n, int n2) {
        final boolean k = this.k();
        final androidx.customview.widget.d v = this.V;
        if (k) {
            v.T(2);
        }
        else {
            v.T(1);
        }
        final int n3 = n - i;
        if (k) {
            i = this.getPaddingRight();
        }
        else {
            i = this.getPaddingLeft();
        }
        if (k) {
            n2 = this.getPaddingLeft();
        }
        else {
            n2 = this.getPaddingRight();
        }
        final int paddingTop = this.getPaddingTop();
        final int childCount = this.getChildCount();
        if (this.a0) {
            float n4;
            if (this.L && this.W) {
                n4 = 1.0f;
            }
            else {
                n4 = 0.0f;
            }
            this.N = n4;
        }
        r = i;
        for (int j = 0; j < childCount; ++j) {
            final View child = this.getChildAt(j);
            if (child.getVisibility() != 8) {
                final d d = (d)child.getLayoutParams();
                final int measuredWidth = child.getMeasuredWidth();
                Label_0356: {
                    if (d.b) {
                        final int leftMargin = d.leftMargin;
                        n = d.rightMargin;
                        final int n5 = n3 - n2;
                        final int p5 = Math.min(i, n5 - this.K) - r - (leftMargin + n);
                        this.P = p5;
                        if (k) {
                            n = d.rightMargin;
                        }
                        else {
                            n = d.leftMargin;
                        }
                        d.c = (r + n + p5 + measuredWidth / 2 > n5);
                        final int n6 = (int)(p5 * this.N);
                        r += n + n6;
                        this.N = n6 / (float)p5;
                        n = 0;
                    }
                    else {
                        if (this.L) {
                            r = this.R;
                            if (r != 0) {
                                n = (int)((1.0f - this.N) * r);
                                r = i;
                                break Label_0356;
                            }
                        }
                        r = i;
                        n = 0;
                    }
                }
                int n7;
                if (k) {
                    n7 = n3 - r + n;
                    n = n7 - measuredWidth;
                }
                else {
                    n = r - n;
                    n7 = n + measuredWidth;
                }
                child.layout(n, paddingTop, n7, child.getMeasuredHeight() + paddingTop);
                i += child.getWidth();
            }
        }
        if (this.a0) {
            if (this.L) {
                if (this.R != 0) {
                    this.q(this.N);
                }
                if (((d)this.M.getLayoutParams()).c) {
                    this.e(this.M, this.N, this.G);
                }
            }
            else {
                for (i = 0; i < childCount; ++i) {
                    this.e(this.getChildAt(i), 0.0f, this.G);
                }
            }
            this.v(this.M);
        }
        this.a0 = false;
    }
    
    protected void onMeasure(int n, int size) {
        final int mode = View$MeasureSpec.getMode(n);
        final int size2 = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        int n2;
        int n3;
        if (mode != 1073741824) {
            if (!this.isInEditMode()) {
                throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
            }
            if (mode == Integer.MIN_VALUE) {
                n2 = size2;
                n3 = mode2;
                n = size;
            }
            else {
                n2 = size2;
                n3 = mode2;
                n = size;
                if (mode == 0) {
                    n2 = 300;
                    n3 = mode2;
                    n = size;
                }
            }
        }
        else {
            n2 = size2;
            n3 = mode2;
            n = size;
            if (mode2 == 0) {
                if (!this.isInEditMode()) {
                    throw new IllegalStateException("Height must not be UNSPECIFIED");
                }
                n2 = size2;
                n3 = mode2;
                n = size;
                if (mode2 == 0) {
                    n3 = Integer.MIN_VALUE;
                    n = 300;
                    n2 = size2;
                }
            }
        }
        if (n3 != Integer.MIN_VALUE) {
            if (n3 != 1073741824) {
                n = 0;
                size = 0;
            }
            else {
                n = (size = n - this.getPaddingTop() - this.getPaddingBottom());
            }
        }
        else {
            size = n - this.getPaddingTop() - this.getPaddingBottom();
            n = 0;
        }
        final int n4 = n2 - this.getPaddingLeft() - this.getPaddingRight();
        final int childCount = this.getChildCount();
        if (childCount > 2) {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        this.M = null;
        int b = n4;
        int i = 0;
        boolean l = false;
        float n5 = 0.0f;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final d d = (d)child.getLayoutParams();
            Label_0579: {
                if (child.getVisibility() == 8) {
                    d.c = false;
                }
                else {
                    final float a = d.a;
                    float n6 = n5;
                    if (a > 0.0f) {
                        n5 = (n6 = n5 + a);
                        if (d.width == 0) {
                            break Label_0579;
                        }
                    }
                    final int n7 = d.leftMargin + d.rightMargin;
                    final int width = d.width;
                    int n8;
                    if (width == -2) {
                        n8 = View$MeasureSpec.makeMeasureSpec(n4 - n7, Integer.MIN_VALUE);
                    }
                    else if (width == -1) {
                        n8 = View$MeasureSpec.makeMeasureSpec(n4 - n7, 1073741824);
                    }
                    else {
                        n8 = View$MeasureSpec.makeMeasureSpec(width, 1073741824);
                    }
                    final int height = d.height;
                    int n9;
                    if (height == -2) {
                        n9 = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                    }
                    else if (height == -1) {
                        n9 = View$MeasureSpec.makeMeasureSpec(size, 1073741824);
                    }
                    else {
                        n9 = View$MeasureSpec.makeMeasureSpec(height, 1073741824);
                    }
                    child.measure(n8, n9);
                    final int measuredWidth = child.getMeasuredWidth();
                    final int measuredHeight = child.getMeasuredHeight();
                    int min = n;
                    if (n3 == Integer.MIN_VALUE && measuredHeight > (min = n)) {
                        min = Math.min(measuredHeight, size);
                    }
                    b -= measuredWidth;
                    int b2;
                    if (b < 0) {
                        b2 = 1;
                    }
                    else {
                        b2 = 0;
                    }
                    d.b = (b2 != 0);
                    l |= (b2 != 0);
                    if (b2 != 0) {
                        this.M = child;
                    }
                    n5 = n6;
                    n = min;
                }
            }
            ++i;
        }
        if (l || n5 > 0.0f) {
            final int n10 = n4 - this.K;
            for (int j = 0; j < childCount; ++j) {
                final View child2 = this.getChildAt(j);
                if (child2.getVisibility() != 8) {
                    final d d2 = (d)child2.getLayoutParams();
                    if (child2.getVisibility() != 8) {
                        final boolean b3 = d2.width == 0 && d2.a > 0.0f;
                        int measuredWidth2;
                        if (b3) {
                            measuredWidth2 = 0;
                        }
                        else {
                            measuredWidth2 = child2.getMeasuredWidth();
                        }
                        if (l && child2 != this.M) {
                            if (d2.width < 0 && (measuredWidth2 > n10 || d2.a > 0.0f)) {
                                int n12 = 0;
                                Label_0813: {
                                    int n11;
                                    if (b3) {
                                        n11 = d2.height;
                                        if (n11 == -2) {
                                            n12 = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                                            break Label_0813;
                                        }
                                        if (n11 == -1) {
                                            n12 = View$MeasureSpec.makeMeasureSpec(size, 1073741824);
                                            break Label_0813;
                                        }
                                    }
                                    else {
                                        n11 = child2.getMeasuredHeight();
                                    }
                                    n12 = View$MeasureSpec.makeMeasureSpec(n11, 1073741824);
                                }
                                child2.measure(View$MeasureSpec.makeMeasureSpec(n10, 1073741824), n12);
                            }
                        }
                        else if (d2.a > 0.0f) {
                            int n14 = 0;
                            Label_0913: {
                                int n13;
                                if (d2.width == 0) {
                                    n13 = d2.height;
                                    if (n13 == -2) {
                                        n14 = View$MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
                                        break Label_0913;
                                    }
                                    if (n13 == -1) {
                                        n14 = View$MeasureSpec.makeMeasureSpec(size, 1073741824);
                                        break Label_0913;
                                    }
                                }
                                else {
                                    n13 = child2.getMeasuredHeight();
                                }
                                n14 = View$MeasureSpec.makeMeasureSpec(n13, 1073741824);
                            }
                            if (l) {
                                final int n15 = n4 - (d2.leftMargin + d2.rightMargin);
                                final int measureSpec = View$MeasureSpec.makeMeasureSpec(n15, 1073741824);
                                if (measuredWidth2 != n15) {
                                    child2.measure(measureSpec, n14);
                                }
                            }
                            else {
                                child2.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth2 + (int)(d2.a * Math.max(0, b) / n5), 1073741824), n14);
                            }
                        }
                    }
                }
            }
        }
        this.setMeasuredDimension(n2, n + this.getPaddingTop() + this.getPaddingBottom());
        this.L = l;
        if (this.V.F() != 0 && !l) {
            this.V.a();
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final f f = (f)parcelable;
        super.onRestoreInstanceState(f.a());
        if (f.I) {
            this.o();
        }
        else {
            this.c();
        }
        this.W = f.I;
    }
    
    protected Parcelable onSaveInstanceState() {
        final f f = new f(super.onSaveInstanceState());
        boolean i;
        if (this.m()) {
            i = this.l();
        }
        else {
            i = this.W;
        }
        f.I = i;
        return (Parcelable)f;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3) {
            this.a0 = true;
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (!this.L) {
            return super.onTouchEvent(motionEvent);
        }
        this.V.M(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                if (this.j(this.M)) {
                    final float x = motionEvent.getX();
                    final float y = motionEvent.getY();
                    final float n = x - this.S;
                    final float n2 = y - this.T;
                    final int e = this.V.E();
                    if (n * n + n2 * n2 < e * e && this.V.L(this.M, (int)x, (int)y)) {
                        this.d(this.M, 0);
                    }
                }
            }
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.S = x2;
            this.T = y2;
        }
        return true;
    }
    
    void r() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() == 4) {
                child.setVisibility(0);
            }
        }
    }
    
    public void requestChildFocus(final View view, final View view2) {
        super.requestChildFocus(view, view2);
        if (!this.isInTouchMode() && !this.L) {
            this.W = (view == this.M);
        }
    }
    
    @Deprecated
    public void s() {
        this.c();
    }
    
    public void setCoveredFadeColor(@l final int h) {
        this.H = h;
    }
    
    public void setPanelSlideListener(@k0 final e u) {
        this.U = u;
    }
    
    public void setParallaxDistance(@n0 final int r) {
        this.R = r;
        this.requestLayout();
    }
    
    @Deprecated
    public void setShadowDrawable(final Drawable shadowDrawableLeft) {
        this.setShadowDrawableLeft(shadowDrawableLeft);
    }
    
    public void setShadowDrawableLeft(@k0 final Drawable i) {
        this.I = i;
    }
    
    public void setShadowDrawableRight(@k0 final Drawable j) {
        this.J = j;
    }
    
    @Deprecated
    public void setShadowResource(@s final int n) {
        this.setShadowDrawable(this.getResources().getDrawable(n));
    }
    
    public void setShadowResourceLeft(final int n) {
        this.setShadowDrawableLeft(androidx.core.content.d.i(this.getContext(), n));
    }
    
    public void setShadowResourceRight(final int n) {
        this.setShadowDrawableRight(androidx.core.content.d.i(this.getContext(), n));
    }
    
    public void setSliderFadeColor(@l final int g) {
        this.G = g;
    }
    
    @Deprecated
    public void t() {
        this.o();
    }
    
    boolean u(final float n, int paddingRight) {
        if (!this.L) {
            return false;
        }
        final boolean k = this.k();
        final d d = (d)this.M.getLayoutParams();
        if (k) {
            paddingRight = this.getPaddingRight();
            paddingRight = (int)(this.getWidth() - (paddingRight + d.rightMargin + n * this.P + this.M.getWidth()));
        }
        else {
            paddingRight = (int)(this.getPaddingLeft() + d.leftMargin + n * this.P);
        }
        final androidx.customview.widget.d v = this.V;
        final View m = this.M;
        if (v.X(m, paddingRight, m.getTop())) {
            this.r();
            androidx.core.view.j0.l1((View)this);
            return true;
        }
        return false;
    }
    
    void v(final View view) {
        final boolean k = this.k();
        int paddingLeft;
        if (k) {
            paddingLeft = this.getWidth() - this.getPaddingRight();
        }
        else {
            paddingLeft = this.getPaddingLeft();
        }
        int paddingLeft2;
        if (k) {
            paddingLeft2 = this.getPaddingLeft();
        }
        else {
            paddingLeft2 = this.getWidth() - this.getPaddingRight();
        }
        final int paddingTop = this.getPaddingTop();
        final int height = this.getHeight();
        final int paddingBottom = this.getPaddingBottom();
        int left;
        int right;
        int top;
        int bottom;
        if (view != null && w(view)) {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        else {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        }
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child == view) {
                break;
            }
            if (child.getVisibility() != 8) {
                int a;
                if (k) {
                    a = paddingLeft2;
                }
                else {
                    a = paddingLeft;
                }
                final int max = Math.max(a, child.getLeft());
                final int max2 = Math.max(paddingTop, child.getTop());
                int a2;
                if (k) {
                    a2 = paddingLeft;
                }
                else {
                    a2 = paddingLeft2;
                }
                final int min = Math.min(a2, child.getRight());
                final int min2 = Math.min(height - paddingBottom, child.getBottom());
                int visibility;
                if (max >= left && max2 >= top && min <= right && min2 <= bottom) {
                    visibility = 4;
                }
                else {
                    visibility = 0;
                }
                child.setVisibility(visibility);
            }
        }
    }
    
    class a extends androidx.core.view.a
    {
        private final Rect d;
        
        a() {
            this.d = new Rect();
        }
        
        private void n(final androidx.core.view.accessibility.d d, final androidx.core.view.accessibility.d d2) {
            final Rect d3 = this.d;
            d2.r(d3);
            d.P0(d3);
            d2.s(d3);
            d.Q0(d3);
            d.T1(d2.A0());
            d.v1(d2.M());
            d.U0(d2.v());
            d.Y0(d2.z());
            d.e1(d2.n0());
            d.V0(d2.i0());
            d.g1(d2.o0());
            d.h1(d2.p0());
            d.N0(d2.f0());
            d.E1(d2.x0());
            d.r1(d2.s0());
            d.a(d2.p());
            d.t1(d2.K());
        }
        
        @Override
        public void f(final View view, final AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)androidx.slidingpanelayout.widget.a.class.getName());
        }
        
        @Override
        public void g(View child, final androidx.core.view.accessibility.d d) {
            final androidx.core.view.accessibility.d e0 = androidx.core.view.accessibility.d.E0(d);
            super.g(child, e0);
            this.n(d, e0);
            e0.H0();
            d.U0(androidx.slidingpanelayout.widget.a.class.getName());
            d.G1(child);
            final ViewParent k0 = androidx.core.view.j0.k0(child);
            if (k0 instanceof View) {
                d.x1((View)k0);
            }
            for (int childCount = androidx.slidingpanelayout.widget.a.this.getChildCount(), i = 0; i < childCount; ++i) {
                child = androidx.slidingpanelayout.widget.a.this.getChildAt(i);
                if (!this.o(child) && child.getVisibility() == 0) {
                    androidx.core.view.j0.P1(child, 1);
                    d.c(child);
                }
            }
        }
        
        @Override
        public boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return !this.o(view) && super.i(viewGroup, view, accessibilityEvent);
        }
        
        public boolean o(final View view) {
            return androidx.slidingpanelayout.widget.a.this.j(view);
        }
    }
    
    private class b implements Runnable
    {
        final View G;
        
        b(final View g) {
            this.G = g;
        }
        
        @Override
        public void run() {
            if (this.G.getParent() == a.this) {
                this.G.setLayerType(0, (Paint)null);
                a.this.i(this.G);
            }
            a.this.c0.remove(this);
        }
    }
    
    private class c extends androidx.customview.widget.d.c
    {
        c() {
        }
        
        @Override
        public int clampViewPositionHorizontal(final View view, int n, int p3) {
            final d d = (d)androidx.slidingpanelayout.widget.a.this.M.getLayoutParams();
            if (androidx.slidingpanelayout.widget.a.this.k()) {
                final int b = androidx.slidingpanelayout.widget.a.this.getWidth() - (androidx.slidingpanelayout.widget.a.this.getPaddingRight() + d.rightMargin + androidx.slidingpanelayout.widget.a.this.M.getWidth());
                p3 = androidx.slidingpanelayout.widget.a.this.P;
                n = Math.max(Math.min(n, b), b - p3);
            }
            else {
                p3 = androidx.slidingpanelayout.widget.a.this.getPaddingLeft() + d.leftMargin;
                n = Math.min(Math.max(n, p3), androidx.slidingpanelayout.widget.a.this.P + p3);
            }
            return n;
        }
        
        @Override
        public int clampViewPositionVertical(final View view, final int n, final int n2) {
            return view.getTop();
        }
        
        @Override
        public int getViewHorizontalDragRange(final View view) {
            return androidx.slidingpanelayout.widget.a.this.P;
        }
        
        @Override
        public void onEdgeDragStarted(final int n, final int n2) {
            final a a = androidx.slidingpanelayout.widget.a.this;
            a.V.d(a.M, n2);
        }
        
        @Override
        public void onViewCaptured(final View view, final int n) {
            androidx.slidingpanelayout.widget.a.this.r();
        }
        
        @Override
        public void onViewDragStateChanged(final int n) {
            if (androidx.slidingpanelayout.widget.a.this.V.F() == 0) {
                final a a = androidx.slidingpanelayout.widget.a.this;
                a a3;
                boolean w;
                if (a.N == 0.0f) {
                    a.v(a.M);
                    final a a2 = androidx.slidingpanelayout.widget.a.this;
                    a2.f(a2.M);
                    a3 = androidx.slidingpanelayout.widget.a.this;
                    w = false;
                }
                else {
                    a.g(a.M);
                    a3 = androidx.slidingpanelayout.widget.a.this;
                    w = true;
                }
                a3.W = w;
            }
        }
        
        @Override
        public void onViewPositionChanged(final View view, final int n, final int n2, final int n3, final int n4) {
            androidx.slidingpanelayout.widget.a.this.n(n);
            androidx.slidingpanelayout.widget.a.this.invalidate();
        }
        
        @Override
        public void onViewReleased(final View view, final float n, final float n2) {
            final d d = (d)view.getLayoutParams();
            int n5 = 0;
            Label_0176: {
                if (androidx.slidingpanelayout.widget.a.this.k()) {
                    final int n3 = androidx.slidingpanelayout.widget.a.this.getPaddingRight() + d.rightMargin;
                    int n4 = 0;
                    Label_0079: {
                        if (n >= 0.0f) {
                            n4 = n3;
                            if (n != 0.0f) {
                                break Label_0079;
                            }
                            n4 = n3;
                            if (androidx.slidingpanelayout.widget.a.this.N <= 0.5f) {
                                break Label_0079;
                            }
                        }
                        n4 = n3 + androidx.slidingpanelayout.widget.a.this.P;
                    }
                    n5 = androidx.slidingpanelayout.widget.a.this.getWidth() - n4 - androidx.slidingpanelayout.widget.a.this.M.getWidth();
                }
                else {
                    final int n6 = d.leftMargin + androidx.slidingpanelayout.widget.a.this.getPaddingLeft();
                    final float n7 = fcmpl(n, 0.0f);
                    if (n7 <= 0) {
                        n5 = n6;
                        if (n7 != 0) {
                            break Label_0176;
                        }
                        n5 = n6;
                        if (androidx.slidingpanelayout.widget.a.this.N <= 0.5f) {
                            break Label_0176;
                        }
                    }
                    n5 = n6 + androidx.slidingpanelayout.widget.a.this.P;
                }
            }
            androidx.slidingpanelayout.widget.a.this.V.V(n5, view.getTop());
            androidx.slidingpanelayout.widget.a.this.invalidate();
        }
        
        @Override
        public boolean tryCaptureView(final View view, final int n) {
            return !androidx.slidingpanelayout.widget.a.this.Q && ((d)view.getLayoutParams()).b;
        }
    }
    
    public static class d extends ViewGroup$MarginLayoutParams
    {
        private static final int[] e;
        public float a;
        boolean b;
        boolean c;
        Paint d;
        
        static {
            e = new int[] { 16843137 };
        }
        
        public d() {
            super(-1, -1);
            this.a = 0.0f;
        }
        
        public d(final int n, final int n2) {
            super(n, n2);
            this.a = 0.0f;
        }
        
        public d(@j0 final Context context, @k0 final AttributeSet set) {
            super(context, set);
            this.a = 0.0f;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, d.e);
            this.a = obtainStyledAttributes.getFloat(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        
        public d(@j0 final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0.0f;
        }
        
        public d(@j0 final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 0.0f;
        }
        
        public d(@j0 final d d) {
            super((ViewGroup$MarginLayoutParams)d);
            this.a = 0.0f;
            this.a = d.a;
        }
    }
    
    public interface e
    {
        void a(@j0 final View p0, final float p1);
        
        void b(@j0 final View p0);
        
        void c(@j0 final View p0);
    }
    
    static class f extends androidx.customview.view.a
    {
        public static final Parcelable$Creator<f> CREATOR;
        boolean I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<f>() {
                public f a(final Parcel parcel) {
                    return new f(parcel, null);
                }
                
                public f b(final Parcel parcel, final ClassLoader classLoader) {
                    return new f(parcel, null);
                }
                
                public f[] c(final int n) {
                    return new f[n];
                }
            };
        }
        
        f(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = (parcel.readInt() != 0);
        }
        
        f(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt((int)(this.I ? 1 : 0));
        }
    }
    
    public static class g implements e
    {
        @Override
        public void a(final View view, final float n) {
        }
        
        @Override
        public void b(final View view) {
        }
        
        @Override
        public void c(final View view) {
        }
    }
}
