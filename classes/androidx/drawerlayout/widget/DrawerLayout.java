// 
// Decompiled by Procyon v0.5.36
// 

package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.l;
import android.os.Parcelable;
import android.annotation.SuppressLint;
import android.view.View$MeasureSpec;
import androidx.core.graphics.j;
import androidx.core.view.x0;
import android.view.KeyEvent;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.s;
import androidx.annotation.t0;
import androidx.core.view.i;
import android.view.MotionEvent;
import android.content.res.TypedArray;
import android.view.WindowInsets;
import android.view.View$OnApplyWindowInsetsListener;
import v.a;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import androidx.core.view.accessibility.g;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import java.util.List;
import androidx.annotation.k0;
import androidx.customview.widget.d;
import android.graphics.Paint;
import androidx.customview.widget.c;
import android.view.ViewGroup;

public class DrawerLayout extends ViewGroup implements androidx.customview.widget.c
{
    public static final int A0 = 1;
    public static final int B0 = 2;
    public static final int C0 = 3;
    private static final int D0 = 64;
    private static final int E0 = -1728053248;
    private static final int F0 = 160;
    private static final int G0 = 400;
    private static final boolean H0 = false;
    private static final boolean I0 = true;
    private static final float J0 = 1.0f;
    static final int[] K0;
    static final boolean L0;
    private static final boolean M0;
    private static final String N0 = "androidx.drawerlayout.widget.DrawerLayout";
    private static boolean O0 = false;
    private static final String u0 = "DrawerLayout";
    private static final int[] v0;
    public static final int w0 = 0;
    public static final int x0 = 1;
    public static final int y0 = 2;
    public static final int z0 = 0;
    private final d G;
    private float H;
    private int I;
    private int J;
    private float K;
    private Paint L;
    private final androidx.customview.widget.d M;
    private final androidx.customview.widget.d N;
    private final i O;
    private final i P;
    private int Q;
    private boolean R;
    private boolean S;
    private int T;
    private int U;
    private int V;
    private int W;
    private boolean a0;
    @k0
    private e b0;
    private List<e> c0;
    private float d0;
    private float e0;
    private Drawable f0;
    private Drawable g0;
    private Drawable h0;
    private CharSequence i0;
    private CharSequence j0;
    private Object k0;
    private boolean l0;
    private Drawable m0;
    private Drawable n0;
    private Drawable o0;
    private Drawable p0;
    private final ArrayList<View> q0;
    private Rect r0;
    private Matrix s0;
    private final androidx.core.view.accessibility.g t0;
    
    static {
        final boolean b = true;
        v0 = new int[] { 16843828 };
        K0 = new int[] { 16842931 };
        final int sdk_INT = Build$VERSION.SDK_INT;
        L0 = (sdk_INT >= 19);
        M0 = (sdk_INT >= 21);
        DrawerLayout.O0 = (sdk_INT >= 29 && b);
    }
    
    public DrawerLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public DrawerLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.a.b);
    }
    
    public DrawerLayout(@j0 final Context context, @k0 AttributeSet obtainStyledAttributes, int f) {
        super(context, obtainStyledAttributes, f);
        this.G = new d();
        this.J = -1728053248;
        this.L = new Paint();
        this.S = true;
        this.T = 3;
        this.U = 3;
        this.V = 3;
        this.W = 3;
        this.m0 = null;
        this.n0 = null;
        this.o0 = null;
        this.p0 = null;
        this.t0 = new androidx.core.view.accessibility.g() {
            @Override
            public boolean a(@j0 final View view, @k0 final a a) {
                if (DrawerLayout.this.D(view) && DrawerLayout.this.r(view) != 2) {
                    DrawerLayout.this.f(view);
                    return true;
                }
                return false;
            }
        };
        this.setDescendantFocusability(262144);
        final float density = this.getResources().getDisplayMetrics().density;
        this.I = (int)(64.0f * density + 0.5f);
        final float n = density * 400.0f;
        final i o = new i(3);
        this.O = o;
        final i p3 = new i(5);
        this.P = p3;
        final androidx.customview.widget.d p4 = androidx.customview.widget.d.p(this, 1.0f, (androidx.customview.widget.d.c)o);
        (this.M = p4).T(1);
        p4.U(n);
        o.d(p4);
        final androidx.customview.widget.d p5 = androidx.customview.widget.d.p(this, 1.0f, (androidx.customview.widget.d.c)p3);
        (this.N = p5).T(2);
        p5.U(n);
        p3.d(p5);
        this.setFocusableInTouchMode(true);
        androidx.core.view.j0.P1((View)this, 1);
        androidx.core.view.j0.z1((View)this, new c());
        this.setMotionEventSplittingEnabled(false);
        Label_0335: {
            if (androidx.core.view.j0.S((View)this)) {
                if (Build$VERSION.SDK_INT >= 21) {
                    this.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new View$OnApplyWindowInsetsListener() {
                        public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
                            ((DrawerLayout)view).S(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                            return windowInsets.consumeSystemWindowInsets();
                        }
                    });
                    this.setSystemUiVisibility(1280);
                    final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(DrawerLayout.v0);
                    try {
                        this.f0 = obtainStyledAttributes2.getDrawable(0);
                        break Label_0335;
                    }
                    finally {
                        obtainStyledAttributes2.recycle();
                    }
                }
                this.f0 = null;
            }
        }
        obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, a.j.e, f, 0);
        try {
            f = a.j.f;
            float h;
            if (((TypedArray)obtainStyledAttributes).hasValue(f)) {
                h = ((TypedArray)obtainStyledAttributes).getDimension(f, 0.0f);
            }
            else {
                h = this.getResources().getDimension(a.c.h);
            }
            this.H = h;
            ((TypedArray)obtainStyledAttributes).recycle();
            this.q0 = new ArrayList<View>();
        }
        finally {
            ((TypedArray)obtainStyledAttributes).recycle();
        }
    }
    
    static boolean A(final View view) {
        return androidx.core.view.j0.T(view) != 4 && androidx.core.view.j0.T(view) != 2;
    }
    
    private boolean H(final float n, final float n2, final View view) {
        if (this.r0 == null) {
            this.r0 = new Rect();
        }
        view.getHitRect(this.r0);
        return this.r0.contains((int)n, (int)n2);
    }
    
    private void I(final Drawable drawable, final int n) {
        if (drawable != null && androidx.core.graphics.drawable.c.h(drawable)) {
            androidx.core.graphics.drawable.c.m(drawable, n);
        }
    }
    
    private Drawable P() {
        final int x = androidx.core.view.j0.X((View)this);
        if (x == 0) {
            final Drawable m0 = this.m0;
            if (m0 != null) {
                this.I(m0, x);
                return this.m0;
            }
        }
        else {
            final Drawable n0 = this.n0;
            if (n0 != null) {
                this.I(n0, x);
                return this.n0;
            }
        }
        return this.o0;
    }
    
    private Drawable Q() {
        final int x = androidx.core.view.j0.X((View)this);
        if (x == 0) {
            final Drawable n0 = this.n0;
            if (n0 != null) {
                this.I(n0, x);
                return this.n0;
            }
        }
        else {
            final Drawable m0 = this.m0;
            if (m0 != null) {
                this.I(m0, x);
                return this.m0;
            }
        }
        return this.p0;
    }
    
    private void R() {
        if (DrawerLayout.M0) {
            return;
        }
        this.g0 = this.P();
        this.h0 = this.Q();
    }
    
    private void Z(final View view) {
        final androidx.core.view.accessibility.d.a z = androidx.core.view.accessibility.d.a.z;
        androidx.core.view.j0.p1(view, z.b());
        if (this.D(view) && this.r(view) != 2) {
            androidx.core.view.j0.s1(view, z, null, this.t0);
        }
    }
    
    private void a0(final View view, final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            int n;
            if ((!b && !this.E(child)) || (b && child == view)) {
                n = 1;
            }
            else {
                n = 4;
            }
            androidx.core.view.j0.P1(child, n);
        }
    }
    
    private boolean m(MotionEvent v, final View view) {
        boolean b;
        if (!view.getMatrix().isIdentity()) {
            v = this.v(v, view);
            b = view.dispatchGenericMotionEvent(v);
            v.recycle();
        }
        else {
            final float n = (float)(this.getScrollX() - view.getLeft());
            final float n2 = (float)(this.getScrollY() - view.getTop());
            v.offsetLocation(n, n2);
            b = view.dispatchGenericMotionEvent(v);
            v.offsetLocation(-n, -n2);
        }
        return b;
    }
    
    private MotionEvent v(MotionEvent obtain, final View view) {
        final float n = (float)(this.getScrollX() - view.getLeft());
        final float n2 = (float)(this.getScrollY() - view.getTop());
        obtain = MotionEvent.obtain(obtain);
        obtain.offsetLocation(n, n2);
        final Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.s0 == null) {
                this.s0 = new Matrix();
            }
            matrix.invert(this.s0);
            obtain.transform(this.s0);
        }
        return obtain;
    }
    
    static String w(final int i) {
        if ((i & 0x3) == 0x3) {
            return "LEFT";
        }
        if ((i & 0x5) == 0x5) {
            return "RIGHT";
        }
        return Integer.toHexString(i);
    }
    
    private static boolean x(final View view) {
        final Drawable background = view.getBackground();
        boolean b = false;
        if (background != null) {
            b = b;
            if (background.getOpacity() == -1) {
                b = true;
            }
        }
        return b;
    }
    
    private boolean y() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (((f)this.getChildAt(i).getLayoutParams()).c) {
                return true;
            }
        }
        return false;
    }
    
    private boolean z() {
        return this.p() != null;
    }
    
    boolean B(final View view) {
        return ((f)view.getLayoutParams()).a == 0;
    }
    
    public boolean C(final int n) {
        final View n2 = this.n(n);
        return n2 != null && this.D(n2);
    }
    
    public boolean D(@j0 final View obj) {
        if (this.E(obj)) {
            final int d = ((f)obj.getLayoutParams()).d;
            boolean b = true;
            if ((d & 0x1) != 0x1) {
                b = false;
            }
            return b;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    boolean E(final View view) {
        final int d = androidx.core.view.i.d(((f)view.getLayoutParams()).a, androidx.core.view.j0.X(view));
        return (d & 0x3) != 0x0 || (d & 0x5) != 0x0;
    }
    
    public boolean F(final int n) {
        final View n2 = this.n(n);
        return n2 != null && this.G(n2);
    }
    
    public boolean G(@j0 final View obj) {
        if (this.E(obj)) {
            return ((f)obj.getLayoutParams()).b > 0.0f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    void J(final View view, final float n) {
        final float u = this.u(view);
        final float n2 = (float)view.getWidth();
        int n3 = (int)(n2 * n) - (int)(u * n2);
        if (!this.c(view, 3)) {
            n3 = -n3;
        }
        view.offsetLeftAndRight(n3);
        this.Y(view, n);
    }
    
    public void K(final int n) {
        this.L(n, true);
    }
    
    public void L(final int n, final boolean b) {
        final View n2 = this.n(n);
        if (n2 != null) {
            this.N(n2, b);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(w(n));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void M(@j0 final View view) {
        this.N(view, true);
    }
    
    public void N(@j0 final View obj, final boolean b) {
        if (this.E(obj)) {
            final f f = (f)obj.getLayoutParams();
            if (this.S) {
                f.b = 1.0f;
                f.d = 1;
                this.a0(obj, true);
                this.Z(obj);
            }
            else if (b) {
                f.d |= 0x2;
                if (this.c(obj, 3)) {
                    this.M.X(obj, 0, obj.getTop());
                }
                else {
                    this.N.X(obj, this.getWidth() - obj.getWidth(), obj.getTop());
                }
            }
            else {
                this.J(obj, 1.0f);
                this.b0(0, obj);
                obj.setVisibility(0);
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void O(@j0 final e e) {
        if (e == null) {
            return;
        }
        final List<e> c0 = this.c0;
        if (c0 == null) {
            return;
        }
        c0.remove(e);
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void S(final Object k0, final boolean l0) {
        this.k0 = k0;
        this.l0 = l0;
        this.setWillNotDraw(!l0 && this.getBackground() == null);
        this.requestLayout();
    }
    
    public void T(final int n, final int n2) {
        final int d = androidx.core.view.i.d(n2, androidx.core.view.j0.X((View)this));
        if (n2 != 3) {
            if (n2 != 5) {
                if (n2 != 8388611) {
                    if (n2 == 8388613) {
                        this.W = n;
                    }
                }
                else {
                    this.V = n;
                }
            }
            else {
                this.U = n;
            }
        }
        else {
            this.T = n;
        }
        if (n != 0) {
            androidx.customview.widget.d d2;
            if (d == 3) {
                d2 = this.M;
            }
            else {
                d2 = this.N;
            }
            d2.c();
        }
        if (n != 1) {
            if (n == 2) {
                final View n3 = this.n(d);
                if (n3 != null) {
                    this.M(n3);
                }
            }
        }
        else {
            final View n4 = this.n(d);
            if (n4 != null) {
                this.f(n4);
            }
        }
    }
    
    public void U(final int n, @j0 final View obj) {
        if (this.E(obj)) {
            this.T(n, ((f)obj.getLayoutParams()).a);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a drawer with appropriate layout_gravity");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void V(@s final int n, final int n2) {
        this.W(androidx.core.content.d.i(this.getContext(), n), n2);
    }
    
    public void W(final Drawable drawable, final int n) {
        if (DrawerLayout.M0) {
            return;
        }
        if ((n & 0x800003) == 0x800003) {
            this.m0 = drawable;
        }
        else if ((n & 0x800005) == 0x800005) {
            this.n0 = drawable;
        }
        else if ((n & 0x3) == 0x3) {
            this.o0 = drawable;
        }
        else {
            if ((n & 0x5) != 0x5) {
                return;
            }
            this.p0 = drawable;
        }
        this.R();
        this.invalidate();
    }
    
    public void X(int d, @k0 final CharSequence charSequence) {
        d = androidx.core.view.i.d(d, androidx.core.view.j0.X((View)this));
        if (d == 3) {
            this.i0 = charSequence;
        }
        else if (d == 5) {
            this.j0 = charSequence;
        }
    }
    
    void Y(final View view, final float b) {
        final f f = (f)view.getLayoutParams();
        if (b == f.b) {
            return;
        }
        this.l(view, f.b = b);
    }
    
    public void a(@j0 final e e) {
        if (e == null) {
            return;
        }
        if (this.c0 == null) {
            this.c0 = new ArrayList<e>();
        }
        this.c0.add(e);
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        if (this.getDescendantFocusability() == 393216) {
            return;
        }
        final int childCount = this.getChildCount();
        final int n3 = 0;
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (this.E(child)) {
                if (this.D(child)) {
                    child.addFocusables((ArrayList)list, n, n2);
                    b = true;
                }
            }
            else {
                this.q0.add(child);
            }
            ++i;
        }
        if (!b) {
            for (int size = this.q0.size(), j = n3; j < size; ++j) {
                final View view = this.q0.get(j);
                if (view.getVisibility() == 0) {
                    view.addFocusables((ArrayList)list, n, n2);
                }
            }
        }
        this.q0.clear();
    }
    
    public void addView(final View view, int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        super.addView(view, n, viewGroup$LayoutParams);
        if (this.o() == null && !this.E(view)) {
            n = 1;
        }
        else {
            n = 4;
        }
        androidx.core.view.j0.P1(view, n);
        if (!DrawerLayout.L0) {
            androidx.core.view.j0.z1(view, this.G);
        }
    }
    
    void b() {
        if (!this.a0) {
            final long uptimeMillis = SystemClock.uptimeMillis();
            final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                this.getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.a0 = true;
        }
    }
    
    void b0(int i, final View view) {
        final int f = this.M.F();
        final int f2 = this.N.F();
        final int n = 2;
        int q;
        if (f != 1 && f2 != 1) {
            q = n;
            if (f != 2) {
                if (f2 == 2) {
                    q = n;
                }
                else {
                    q = 0;
                }
            }
        }
        else {
            q = 1;
        }
        if (view != null && i == 0) {
            final float b = ((f)view.getLayoutParams()).b;
            if (b == 0.0f) {
                this.j(view);
            }
            else if (b == 1.0f) {
                this.k(view);
            }
        }
        if (q != this.Q) {
            this.Q = q;
            final List<e> c0 = this.c0;
            if (c0 != null) {
                for (i = c0.size() - 1; i >= 0; --i) {
                    this.c0.get(i).c(q);
                }
            }
        }
    }
    
    boolean c(final View view, final int n) {
        return (this.t(view) & n) == n;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof f && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    public void close() {
        this.d(8388611);
    }
    
    public void computeScroll() {
        final int childCount = this.getChildCount();
        float max = 0.0f;
        for (int i = 0; i < childCount; ++i) {
            max = Math.max(max, ((f)this.getChildAt(i).getLayoutParams()).b);
        }
        this.K = max;
        final boolean o = this.M.o(true);
        final boolean o2 = this.N.o(true);
        if (o || o2) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void d(final int n) {
        this.e(n, true);
    }
    
    public boolean dispatchGenericMotionEvent(final MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 0x2) != 0x0 && motionEvent.getAction() != 10 && this.K > 0.0f) {
            int i = this.getChildCount();
            if (i != 0) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                --i;
                while (i >= 0) {
                    final View child = this.getChildAt(i);
                    if (this.H(x, y, child)) {
                        if (!this.B(child)) {
                            if (this.m(motionEvent, child)) {
                                return true;
                            }
                        }
                    }
                    --i;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final int height = this.getHeight();
        final boolean b = this.B(view);
        int width = this.getWidth();
        final int save = canvas.save();
        int n2 = 0;
        int n3 = width;
        if (b) {
            final int childCount = this.getChildCount();
            int i = 0;
            int n4 = 0;
            while (i < childCount) {
                final View child = this.getChildAt(i);
                int n5 = width;
                int n6 = n4;
                if (child != view) {
                    n5 = width;
                    n6 = n4;
                    if (child.getVisibility() == 0) {
                        n5 = width;
                        n6 = n4;
                        if (x(child)) {
                            n5 = width;
                            n6 = n4;
                            if (this.E(child)) {
                                if (child.getHeight() < height) {
                                    n5 = width;
                                    n6 = n4;
                                }
                                else if (this.c(child, 3)) {
                                    final int right = child.getRight();
                                    n5 = width;
                                    if (right > (n6 = n4)) {
                                        n6 = right;
                                        n5 = width;
                                    }
                                }
                                else {
                                    final int left = child.getLeft();
                                    n5 = width;
                                    n6 = n4;
                                    if (left < width) {
                                        n5 = left;
                                        n6 = n4;
                                    }
                                }
                            }
                        }
                    }
                }
                ++i;
                width = n5;
                n4 = n6;
            }
            canvas.clipRect(n4, 0, width, this.getHeight());
            n2 = n4;
            n3 = width;
        }
        final boolean drawChild = super.drawChild(canvas, view, n);
        canvas.restoreToCount(save);
        final float k = this.K;
        if (k > 0.0f && b) {
            final int j = this.J;
            this.L.setColor((j & 0xFFFFFF) | (int)(((0xFF000000 & j) >>> 24) * k) << 24);
            canvas.drawRect((float)n2, 0.0f, (float)n3, (float)this.getHeight(), this.L);
        }
        else {
            Drawable drawable;
            if (this.g0 != null && this.c(view, 3)) {
                final int intrinsicWidth = this.g0.getIntrinsicWidth();
                final int right2 = view.getRight();
                final float max = Math.max(0.0f, Math.min(right2 / (float)this.M.B(), 1.0f));
                this.g0.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
                this.g0.setAlpha((int)(max * 255.0f));
                drawable = this.g0;
            }
            else {
                if (this.h0 == null || !this.c(view, 5)) {
                    return drawChild;
                }
                final int intrinsicWidth2 = this.h0.getIntrinsicWidth();
                final int left2 = view.getLeft();
                final float max2 = Math.max(0.0f, Math.min((this.getWidth() - left2) / (float)this.N.B(), 1.0f));
                this.h0.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
                this.h0.setAlpha((int)(max2 * 255.0f));
                drawable = this.h0;
            }
            drawable.draw(canvas);
        }
        return drawChild;
    }
    
    public void e(final int n, final boolean b) {
        final View n2 = this.n(n);
        if (n2 != null) {
            this.g(n2, b);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No drawer view found with gravity ");
        sb.append(w(n));
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void f(@j0 final View view) {
        this.g(view, true);
    }
    
    public void g(@j0 final View obj, final boolean b) {
        if (this.E(obj)) {
            final f f = (f)obj.getLayoutParams();
            if (this.S) {
                f.b = 0.0f;
                f.d = 0;
            }
            else if (b) {
                f.d |= 0x4;
                androidx.customview.widget.d d;
                int width;
                if (this.c(obj, 3)) {
                    d = this.M;
                    width = -obj.getWidth();
                }
                else {
                    d = this.N;
                    width = this.getWidth();
                }
                d.X(obj, width, obj.getTop());
            }
            else {
                this.J(obj, 0.0f);
                this.b0(0, obj);
                obj.setVisibility(4);
            }
            this.invalidate();
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a sliding drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new f(-1, -1);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new f(this.getContext(), set);
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        f f;
        if (viewGroup$LayoutParams instanceof f) {
            f = new f((f)viewGroup$LayoutParams);
        }
        else if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            f = new f((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        else {
            f = new f(viewGroup$LayoutParams);
        }
        return (ViewGroup$LayoutParams)f;
    }
    
    public float getDrawerElevation() {
        if (DrawerLayout.M0) {
            return this.H;
        }
        return 0.0f;
    }
    
    @k0
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f0;
    }
    
    public void h() {
        this.i(false);
    }
    
    void i(final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final f f = (f)child.getLayoutParams();
            int n2 = n;
            if (this.E(child)) {
                if (b && !f.c) {
                    n2 = n;
                }
                else {
                    final int width = child.getWidth();
                    boolean b2;
                    if (this.c(child, 3)) {
                        b2 = this.M.X(child, -width, child.getTop());
                    }
                    else {
                        b2 = this.N.X(child, this.getWidth(), child.getTop());
                    }
                    n2 = (n | (b2 ? 1 : 0));
                    f.c = false;
                }
            }
            ++i;
            n = n2;
        }
        this.O.c();
        this.P.c();
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public boolean isOpen() {
        return this.C(8388611);
    }
    
    void j(View rootView) {
        final f f = (f)rootView.getLayoutParams();
        if ((f.d & 0x1) == 0x1) {
            f.d = 0;
            final List<e> c0 = this.c0;
            if (c0 != null) {
                for (int i = c0.size() - 1; i >= 0; --i) {
                    this.c0.get(i).b(rootView);
                }
            }
            this.a0(rootView, false);
            this.Z(rootView);
            if (this.hasWindowFocus()) {
                rootView = this.getRootView();
                if (rootView != null) {
                    rootView.sendAccessibilityEvent(32);
                }
            }
        }
    }
    
    void k(final View view) {
        final f f = (f)view.getLayoutParams();
        if ((f.d & 0x1) == 0x0) {
            f.d = 1;
            final List<e> c0 = this.c0;
            if (c0 != null) {
                for (int i = c0.size() - 1; i >= 0; --i) {
                    this.c0.get(i).a(view);
                }
            }
            this.a0(view, true);
            this.Z(view);
            if (this.hasWindowFocus()) {
                this.sendAccessibilityEvent(32);
            }
        }
    }
    
    void l(final View view, final float n) {
        final List<e> c0 = this.c0;
        if (c0 != null) {
            for (int i = c0.size() - 1; i >= 0; --i) {
                this.c0.get(i).d(view, n);
            }
        }
    }
    
    View n(int i) {
        final int d = i.d(i, androidx.core.view.j0.X((View)this));
        int childCount;
        View child;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if ((this.t(child) & 0x7) == (d & 0x7)) {
                return child;
            }
        }
        return null;
    }
    
    View o() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if ((((f)child.getLayoutParams()).d & 0x1) == 0x1) {
                return child;
            }
        }
        return null;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = true;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.l0 && this.f0 != null) {
            int systemWindowInsetTop = 0;
            Label_0049: {
                if (Build$VERSION.SDK_INT >= 21) {
                    final Object k0 = this.k0;
                    if (k0 != null) {
                        systemWindowInsetTop = ((WindowInsets)k0).getSystemWindowInsetTop();
                        break Label_0049;
                    }
                }
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.f0.setBounds(0, 0, this.getWidth(), systemWindowInsetTop);
                this.f0.draw(canvas);
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        final boolean w = this.M.W(motionEvent);
        final boolean w2 = this.N.W(motionEvent);
        final boolean b = true;
        boolean b2;
        if (actionMasked != 0) {
            Label_0087: {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            break Label_0087;
                        }
                    }
                    else {
                        if (this.M.f(3)) {
                            this.O.c();
                            this.P.c();
                        }
                        break Label_0087;
                    }
                }
                this.i(true);
                this.a0 = false;
            }
            b2 = false;
        }
        else {
            final float x = motionEvent.getX();
            final float y = motionEvent.getY();
            this.d0 = x;
            this.e0 = y;
            Label_0158: {
                if (this.K > 0.0f) {
                    final View v = this.M.v((int)x, (int)y);
                    if (v != null && this.B(v)) {
                        b2 = true;
                        break Label_0158;
                    }
                }
                b2 = false;
            }
            this.a0 = false;
        }
        boolean b3 = b;
        if (!(w | w2)) {
            b3 = b;
            if (!b2) {
                b3 = b;
                if (!this.y()) {
                    b3 = (this.a0 && b);
                }
            }
        }
        return b3;
    }
    
    public boolean onKeyDown(final int n, final KeyEvent keyEvent) {
        if (n == 4 && this.z()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(n, keyEvent);
    }
    
    public boolean onKeyUp(final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            final View p2 = this.p();
            if (p2 != null && this.r(p2) == 0) {
                this.h();
            }
            return p2 != null;
        }
        return super.onKeyUp(n, keyEvent);
    }
    
    protected void onLayout(final boolean b, int visibility, final int n, int i, final int n2) {
        this.R = true;
        final int n3 = i - visibility;
        int childCount;
        View child;
        f f;
        int measuredWidth;
        int measuredHeight;
        float n4;
        int n5;
        float n6;
        float n7;
        boolean b2;
        int topMargin;
        int n8;
        int n9;
        int n10;
        int n11;
        int bottomMargin;
        for (childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                f = (f)child.getLayoutParams();
                if (this.B(child)) {
                    visibility = f.leftMargin;
                    child.layout(visibility, f.topMargin, child.getMeasuredWidth() + visibility, f.topMargin + child.getMeasuredHeight());
                }
                else {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    if (this.c(child, 3)) {
                        visibility = -measuredWidth;
                        n4 = (float)measuredWidth;
                        n5 = visibility + (int)(f.b * n4);
                        n6 = (measuredWidth + n5) / n4;
                    }
                    else {
                        n7 = (float)measuredWidth;
                        n5 = n3 - (int)(f.b * n7);
                        n6 = (n3 - n5) / n7;
                    }
                    b2 = (n6 != f.b);
                    visibility = (f.a & 0x70);
                    if (visibility != 16) {
                        if (visibility != 80) {
                            topMargin = f.topMargin;
                            visibility = measuredWidth + n5;
                            n8 = measuredHeight + topMargin;
                        }
                        else {
                            n9 = n2 - n;
                            topMargin = n9 - f.bottomMargin - child.getMeasuredHeight();
                            visibility = measuredWidth + n5;
                            n8 = n9 - f.bottomMargin;
                        }
                        child.layout(n5, topMargin, visibility, n8);
                    }
                    else {
                        n10 = n2 - n;
                        n11 = (n10 - measuredHeight) / 2;
                        visibility = f.topMargin;
                        if (n11 >= visibility) {
                            bottomMargin = f.bottomMargin;
                            visibility = n11;
                            if (n11 + measuredHeight > n10 - bottomMargin) {
                                visibility = n10 - bottomMargin - measuredHeight;
                            }
                        }
                        child.layout(n5, visibility, measuredWidth + n5, measuredHeight + visibility);
                    }
                    if (b2) {
                        this.Y(child, n6);
                    }
                    if (f.b > 0.0f) {
                        visibility = 0;
                    }
                    else {
                        visibility = 4;
                    }
                    if (child.getVisibility() != visibility) {
                        child.setVisibility(visibility);
                    }
                }
            }
        }
        if (DrawerLayout.O0) {
            final WindowInsets rootWindowInsets = this.getRootWindowInsets();
            if (rootWindowInsets != null) {
                final j n12 = androidx.core.view.x0.K(rootWindowInsets).n();
                final androidx.customview.widget.d m = this.M;
                m.S(Math.max(m.A(), n12.a));
                final androidx.customview.widget.d n13 = this.N;
                n13.S(Math.max(n13.A(), n12.c));
            }
        }
        this.R = false;
        this.S = false;
    }
    
    @SuppressLint({ "WrongConstant" })
    protected void onMeasure(final int n, final int n2) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        int size = View$MeasureSpec.getSize(n);
        final int size2 = View$MeasureSpec.getSize(n2);
        int n3 = 0;
        int n4 = 0;
        Label_0084: {
            if (mode == 1073741824) {
                n3 = size;
                n4 = size2;
                if (mode2 == 1073741824) {
                    break Label_0084;
                }
            }
            if (!this.isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            n3 = size;
            n4 = size2;
            if (mode2 == 0) {
                n4 = 300;
                n3 = size;
            }
        }
        this.setMeasuredDimension(n3, n4);
        final boolean b = this.k0 != null && androidx.core.view.j0.S((View)this);
        final int x = androidx.core.view.j0.X((View)this);
        final int childCount = this.getChildCount();
        int i = 0;
        int n5 = 0;
        int n6 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final f f = (f)child.getLayoutParams();
                if (b) {
                    final int d = androidx.core.view.i.d(f.a, x);
                    final boolean s = androidx.core.view.j0.S(child);
                    final int sdk_INT = Build$VERSION.SDK_INT;
                    if (s) {
                        if (sdk_INT >= 21) {
                            final WindowInsets windowInsets = (WindowInsets)this.k0;
                            WindowInsets windowInsets2;
                            if (d == 3) {
                                windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                            }
                            else {
                                windowInsets2 = windowInsets;
                                if (d == 5) {
                                    windowInsets2 = windowInsets.replaceSystemWindowInsets(0, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                                }
                            }
                            child.dispatchApplyWindowInsets(windowInsets2);
                        }
                    }
                    else if (sdk_INT >= 21) {
                        final WindowInsets windowInsets3 = (WindowInsets)this.k0;
                        WindowInsets windowInsets4;
                        if (d == 3) {
                            windowInsets4 = windowInsets3.replaceSystemWindowInsets(windowInsets3.getSystemWindowInsetLeft(), windowInsets3.getSystemWindowInsetTop(), 0, windowInsets3.getSystemWindowInsetBottom());
                        }
                        else {
                            windowInsets4 = windowInsets3;
                            if (d == 5) {
                                windowInsets4 = windowInsets3.replaceSystemWindowInsets(0, windowInsets3.getSystemWindowInsetTop(), windowInsets3.getSystemWindowInsetRight(), windowInsets3.getSystemWindowInsetBottom());
                            }
                        }
                        f.leftMargin = windowInsets4.getSystemWindowInsetLeft();
                        f.topMargin = windowInsets4.getSystemWindowInsetTop();
                        f.rightMargin = windowInsets4.getSystemWindowInsetRight();
                        f.bottomMargin = windowInsets4.getSystemWindowInsetBottom();
                    }
                }
                if (this.B(child)) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(n3 - f.leftMargin - f.rightMargin, 1073741824), View$MeasureSpec.makeMeasureSpec(n4 - f.topMargin - f.bottomMargin, 1073741824));
                }
                else {
                    if (!this.E(child)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Child ");
                        sb.append(child);
                        sb.append(" at index ");
                        sb.append(i);
                        sb.append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                        throw new IllegalStateException(sb.toString());
                    }
                    if (DrawerLayout.M0) {
                        final float p2 = androidx.core.view.j0.P(child);
                        final float h = this.H;
                        if (p2 != h) {
                            androidx.core.view.j0.L1(child, h);
                        }
                    }
                    final int n7 = this.t(child) & 0x7;
                    final boolean b2 = n7 == 3;
                    if ((b2 && n5 != 0) || (!b2 && n6 != 0)) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Child drawer has absolute gravity ");
                        sb2.append(w(n7));
                        sb2.append(" but this ");
                        sb2.append("DrawerLayout");
                        sb2.append(" already has a drawer view along that edge");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (b2) {
                        n5 = 1;
                    }
                    else {
                        n6 = 1;
                    }
                    child.measure(ViewGroup.getChildMeasureSpec(n, this.I + f.leftMargin + f.rightMargin, f.width), ViewGroup.getChildMeasureSpec(n2, f.topMargin + f.bottomMargin, f.height));
                }
            }
            ++i;
        }
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final g g = (g)parcelable;
        super.onRestoreInstanceState(g.a());
        final int i = g.I;
        if (i != 0) {
            final View n = this.n(i);
            if (n != null) {
                this.M(n);
            }
        }
        final int j = g.J;
        if (j != 3) {
            this.T(j, 3);
        }
        final int k = g.K;
        if (k != 3) {
            this.T(k, 5);
        }
        final int l = g.L;
        if (l != 3) {
            this.T(l, 8388611);
        }
        final int m = g.M;
        if (m != 3) {
            this.T(m, 8388613);
        }
    }
    
    public void onRtlPropertiesChanged(final int n) {
        this.R();
    }
    
    protected Parcelable onSaveInstanceState() {
        final g g = new g(super.onSaveInstanceState());
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final f f = (f)this.getChildAt(i).getLayoutParams();
            final int d = f.d;
            boolean b = true;
            final boolean b2 = d == 1;
            if (d != 2) {
                b = false;
            }
            if (b2 || b) {
                g.I = f.a;
                break;
            }
        }
        g.J = this.T;
        g.K = this.U;
        g.L = this.V;
        g.M = this.W;
        return (Parcelable)g;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        this.M.M(motionEvent);
        this.N.M(motionEvent);
        final int n = motionEvent.getAction() & 0xFF;
        boolean b = false;
        if (n != 0) {
            if (n == 1) {
                final float x = motionEvent.getX();
                final float y = motionEvent.getY();
                final View v = this.M.v((int)x, (int)y);
                Label_0155: {
                    if (v != null && this.B(v)) {
                        final float n2 = x - this.d0;
                        final float n3 = y - this.e0;
                        final int e = this.M.E();
                        if (n2 * n2 + n3 * n3 < e * e) {
                            final View o = this.o();
                            if (o != null && this.r(o) != 2) {
                                break Label_0155;
                            }
                        }
                    }
                    b = true;
                }
                this.i(b);
                return true;
            }
            if (n != 3) {
                return true;
            }
            this.i(true);
        }
        else {
            final float x2 = motionEvent.getX();
            final float y2 = motionEvent.getY();
            this.d0 = x2;
            this.e0 = y2;
        }
        this.a0 = false;
        return true;
    }
    
    public void open() {
        this.K(8388611);
    }
    
    View p() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (this.E(child) && this.G(child)) {
                return child;
            }
        }
        return null;
    }
    
    public int q(int n) {
        final int x = androidx.core.view.j0.X((View)this);
        if (n != 3) {
            if (n != 5) {
                if (n != 8388611) {
                    if (n == 8388613) {
                        n = this.W;
                        if (n != 3) {
                            return n;
                        }
                        if (x == 0) {
                            n = this.U;
                        }
                        else {
                            n = this.T;
                        }
                        if (n != 3) {
                            return n;
                        }
                    }
                }
                else {
                    n = this.V;
                    if (n != 3) {
                        return n;
                    }
                    if (x == 0) {
                        n = this.T;
                    }
                    else {
                        n = this.U;
                    }
                    if (n != 3) {
                        return n;
                    }
                }
            }
            else {
                n = this.U;
                if (n != 3) {
                    return n;
                }
                if (x == 0) {
                    n = this.W;
                }
                else {
                    n = this.V;
                }
                if (n != 3) {
                    return n;
                }
            }
        }
        else {
            n = this.T;
            if (n != 3) {
                return n;
            }
            if (x == 0) {
                n = this.V;
            }
            else {
                n = this.W;
            }
            if (n != 3) {
                return n;
            }
        }
        return 0;
    }
    
    public int r(@j0 final View obj) {
        if (this.E(obj)) {
            return this.q(((f)obj.getLayoutParams()).a);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(obj);
        sb.append(" is not a drawer");
        throw new IllegalArgumentException(sb.toString());
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b) {
            this.i(true);
        }
    }
    
    public void requestLayout() {
        if (!this.R) {
            super.requestLayout();
        }
    }
    
    @k0
    public CharSequence s(int d) {
        d = androidx.core.view.i.d(d, androidx.core.view.j0.X((View)this));
        if (d == 3) {
            return this.i0;
        }
        if (d == 5) {
            return this.j0;
        }
        return null;
    }
    
    public void setDrawerElevation(final float h) {
        this.H = h;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (this.E(child)) {
                androidx.core.view.j0.L1(child, this.H);
            }
        }
    }
    
    @Deprecated
    public void setDrawerListener(final e b0) {
        final e b2 = this.b0;
        if (b2 != null) {
            this.O(b2);
        }
        if (b0 != null) {
            this.a(b0);
        }
        this.b0 = b0;
    }
    
    public void setDrawerLockMode(final int n) {
        this.T(n, 3);
        this.T(n, 5);
    }
    
    public void setScrimColor(@l final int j) {
        this.J = j;
        this.invalidate();
    }
    
    public void setStatusBarBackground(final int n) {
        Drawable i;
        if (n != 0) {
            i = androidx.core.content.d.i(this.getContext(), n);
        }
        else {
            i = null;
        }
        this.f0 = i;
        this.invalidate();
    }
    
    public void setStatusBarBackground(@k0 final Drawable f0) {
        this.f0 = f0;
        this.invalidate();
    }
    
    public void setStatusBarBackgroundColor(@l final int n) {
        this.f0 = (Drawable)new ColorDrawable(n);
        this.invalidate();
    }
    
    int t(final View view) {
        return androidx.core.view.i.d(((f)view.getLayoutParams()).a, androidx.core.view.j0.X((View)this));
    }
    
    float u(final View view) {
        return ((f)view.getLayoutParams()).b;
    }
    
    class c extends androidx.core.view.a
    {
        private final Rect d;
        
        c() {
            this.d = new Rect();
        }
        
        private void n(final androidx.core.view.accessibility.d d, final ViewGroup viewGroup) {
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = viewGroup.getChildAt(i);
                if (DrawerLayout.A(child)) {
                    d.c(child);
                }
            }
        }
        
        private void o(final androidx.core.view.accessibility.d d, final androidx.core.view.accessibility.d d2) {
            final Rect d3 = this.d;
            d2.s(d3);
            d.Q0(d3);
            d.T1(d2.A0());
            d.v1(d2.M());
            d.U0(d2.v());
            d.Y0(d2.z());
            d.e1(d2.n0());
            d.h1(d2.p0());
            d.N0(d2.f0());
            d.E1(d2.x0());
            d.a(d2.p());
        }
        
        @Override
        public boolean a(final View view, final AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                final List text = accessibilityEvent.getText();
                final View p2 = DrawerLayout.this.p();
                if (p2 != null) {
                    final CharSequence s = DrawerLayout.this.s(DrawerLayout.this.t(p2));
                    if (s != null) {
                        text.add(s);
                    }
                }
                return true;
            }
            return super.a(view, accessibilityEvent);
        }
        
        @Override
        public void f(final View view, final AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            accessibilityEvent.setClassName((CharSequence)"androidx.drawerlayout.widget.DrawerLayout");
        }
        
        @Override
        public void g(final View view, final androidx.core.view.accessibility.d d) {
            if (DrawerLayout.L0) {
                super.g(view, d);
            }
            else {
                final androidx.core.view.accessibility.d e0 = androidx.core.view.accessibility.d.E0(d);
                super.g(view, e0);
                d.G1(view);
                final ViewParent k0 = androidx.core.view.j0.k0(view);
                if (k0 instanceof View) {
                    d.x1((View)k0);
                }
                this.o(d, e0);
                e0.H0();
                this.n(d, (ViewGroup)view);
            }
            d.U0("androidx.drawerlayout.widget.DrawerLayout");
            d.g1(false);
            d.h1(false);
            d.J0(androidx.core.view.accessibility.d.a.f);
            d.J0(androidx.core.view.accessibility.d.a.g);
        }
        
        @Override
        public boolean i(final ViewGroup viewGroup, final View view, final AccessibilityEvent accessibilityEvent) {
            return (DrawerLayout.L0 || DrawerLayout.A(view)) && super.i(viewGroup, view, accessibilityEvent);
        }
    }
    
    static final class d extends androidx.core.view.a
    {
        @Override
        public void g(final View view, final androidx.core.view.accessibility.d d) {
            super.g(view, d);
            if (!DrawerLayout.A(view)) {
                d.x1(null);
            }
        }
    }
    
    public interface e
    {
        void a(@j0 final View p0);
        
        void b(@j0 final View p0);
        
        void c(final int p0);
        
        void d(@j0 final View p0, final float p1);
    }
    
    public static class f extends ViewGroup$MarginLayoutParams
    {
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 4;
        public int a;
        float b;
        boolean c;
        int d;
        
        public f(final int n, final int n2) {
            super(n, n2);
            this.a = 0;
        }
        
        public f(final int n, final int n2, final int a) {
            this(n, n2);
            this.a = a;
        }
        
        public f(@j0 final Context context, @k0 final AttributeSet set) {
            super(context, set);
            this.a = 0;
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, DrawerLayout.K0);
            this.a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
        
        public f(@j0 final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = 0;
        }
        
        public f(@j0 final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.a = 0;
        }
        
        public f(@j0 final f f) {
            super((ViewGroup$MarginLayoutParams)f);
            this.a = 0;
            this.a = f.a;
        }
    }
    
    protected static class g extends a
    {
        public static final Parcelable$Creator<g> CREATOR;
        int I;
        int J;
        int K;
        int L;
        int M;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<g>() {
                public g a(final Parcel parcel) {
                    return new g(parcel, null);
                }
                
                public g b(final Parcel parcel, final ClassLoader classLoader) {
                    return new g(parcel, classLoader);
                }
                
                public g[] c(final int n) {
                    return new g[n];
                }
            };
        }
        
        public g(@j0 final Parcel parcel, @k0 final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = 0;
            this.I = parcel.readInt();
            this.J = parcel.readInt();
            this.K = parcel.readInt();
            this.L = parcel.readInt();
            this.M = parcel.readInt();
        }
        
        public g(@j0 final Parcelable parcelable) {
            super(parcelable);
            this.I = 0;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeInt(this.K);
            parcel.writeInt(this.L);
            parcel.writeInt(this.M);
        }
    }
    
    public abstract static class h implements e
    {
        @Override
        public void a(final View view) {
        }
        
        @Override
        public void b(final View view) {
        }
        
        @Override
        public void c(final int n) {
        }
        
        @Override
        public void d(final View view, final float n) {
        }
    }
    
    private class i extends d.c
    {
        private final int a;
        private d b;
        private final Runnable c;
        
        i(final int a) {
            this.c = new Runnable() {
                @Override
                public void run() {
                    i.this.b();
                }
            };
            this.a = a;
        }
        
        private void a() {
            final int a = this.a;
            int n = 3;
            if (a == 3) {
                n = 5;
            }
            final View n2 = DrawerLayout.this.n(n);
            if (n2 != null) {
                DrawerLayout.this.f(n2);
            }
        }
        
        void b() {
            final int b = this.b.B();
            final int a = this.a;
            int n = 0;
            final boolean b2 = a == 3;
            View view;
            int n2;
            if (b2) {
                view = DrawerLayout.this.n(3);
                if (view != null) {
                    n = -view.getWidth();
                }
                n2 = n + b;
            }
            else {
                view = DrawerLayout.this.n(5);
                n2 = DrawerLayout.this.getWidth() - b;
            }
            if (view != null && ((b2 && view.getLeft() < n2) || (!b2 && view.getLeft() > n2)) && DrawerLayout.this.r(view) == 0) {
                final f f = (f)view.getLayoutParams();
                this.b.X(view, n2, view.getTop());
                f.c = true;
                DrawerLayout.this.invalidate();
                this.a();
                DrawerLayout.this.b();
            }
        }
        
        public void c() {
            DrawerLayout.this.removeCallbacks(this.c);
        }
        
        @Override
        public int clampViewPositionHorizontal(final View view, final int a, int width) {
            int a2;
            if (DrawerLayout.this.c(view, 3)) {
                a2 = -view.getWidth();
                width = 0;
            }
            else {
                width = DrawerLayout.this.getWidth();
                a2 = width - view.getWidth();
            }
            return Math.max(a2, Math.min(a, width));
        }
        
        @Override
        public int clampViewPositionVertical(final View view, final int n, final int n2) {
            return view.getTop();
        }
        
        public void d(final d b) {
            this.b = b;
        }
        
        @Override
        public int getViewHorizontalDragRange(final View view) {
            int width;
            if (DrawerLayout.this.E(view)) {
                width = view.getWidth();
            }
            else {
                width = 0;
            }
            return width;
        }
        
        @Override
        public void onEdgeDragStarted(int n, final int n2) {
            DrawerLayout drawerLayout;
            if ((n & 0x1) == 0x1) {
                drawerLayout = DrawerLayout.this;
                n = 3;
            }
            else {
                drawerLayout = DrawerLayout.this;
                n = 5;
            }
            final View n3 = drawerLayout.n(n);
            if (n3 != null && DrawerLayout.this.r(n3) == 0) {
                this.b.d(n3, n2);
            }
        }
        
        @Override
        public boolean onEdgeLock(final int n) {
            return false;
        }
        
        @Override
        public void onEdgeTouched(final int n, final int n2) {
            DrawerLayout.this.postDelayed(this.c, 160L);
        }
        
        @Override
        public void onViewCaptured(final View view, final int n) {
            ((f)view.getLayoutParams()).c = false;
            this.a();
        }
        
        @Override
        public void onViewDragStateChanged(final int n) {
            DrawerLayout.this.b0(n, this.b.z());
        }
        
        @Override
        public void onViewPositionChanged(final View view, int visibility, int width, final int n, final int n2) {
            width = view.getWidth();
            float n3;
            if (DrawerLayout.this.c(view, 3)) {
                n3 = (float)(visibility + width);
            }
            else {
                n3 = (float)(DrawerLayout.this.getWidth() - visibility);
            }
            final float n4 = n3 / width;
            DrawerLayout.this.Y(view, n4);
            if (n4 == 0.0f) {
                visibility = 4;
            }
            else {
                visibility = 0;
            }
            view.setVisibility(visibility);
            DrawerLayout.this.invalidate();
        }
        
        @Override
        public void onViewReleased(final View view, final float n, float u) {
            u = DrawerLayout.this.u(view);
            final int width = view.getWidth();
            int n3 = 0;
            Label_0109: {
                if (DrawerLayout.this.c(view, 3)) {
                    final float n2 = fcmpl(n, 0.0f);
                    if (n2 <= 0 && (n2 != 0 || u <= 0.5f)) {
                        n3 = -width;
                    }
                    else {
                        n3 = 0;
                    }
                }
                else {
                    final int width2 = DrawerLayout.this.getWidth();
                    if (n >= 0.0f) {
                        n3 = width2;
                        if (n != 0.0f) {
                            break Label_0109;
                        }
                        n3 = width2;
                        if (u <= 0.5f) {
                            break Label_0109;
                        }
                    }
                    n3 = width2 - width;
                }
            }
            this.b.V(n3, view.getTop());
            DrawerLayout.this.invalidate();
        }
        
        @Override
        public boolean tryCaptureView(final View view, final int n) {
            return DrawerLayout.this.E(view) && DrawerLayout.this.c(view, this.a) && DrawerLayout.this.r(view) == 0;
        }
    }
}
