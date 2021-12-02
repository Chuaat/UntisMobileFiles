// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.graphics.Matrix;
import androidx.core.view.accessibility.d;
import androidx.annotation.i;
import android.view.ViewGroup$MarginLayoutParams;
import android.os.Bundle;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.database.Observable;
import java.util.Collections;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.annotation.t0;
import android.os.SystemClock;
import android.animation.LayoutTransition;
import android.view.View$MeasureSpec;
import android.view.Display;
import android.view.FocusFinder;
import android.graphics.Canvas;
import android.util.SparseArray;
import android.view.ViewParent;
import android.widget.OverScroller;
import androidx.annotation.n0;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.view.r;
import android.view.MotionEvent;
import android.os.Parcelable;
import androidx.core.view.accessibility.b;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup$LayoutParams;
import android.annotation.SuppressLint;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.ref.WeakReference;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.view.VelocityTracker;
import android.widget.EdgeEffect;
import androidx.annotation.j0;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.v;
import java.util.ArrayList;
import androidx.annotation.b1;
import java.util.List;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.animation.Interpolator;
import androidx.core.view.t;
import androidx.core.view.s;
import androidx.core.view.g0;
import android.view.ViewGroup;

public class RecyclerView extends ViewGroup implements androidx.core.view.g0, androidx.core.view.s, androidx.core.view.t
{
    public static final int A1 = 1;
    public static final int B1 = Integer.MIN_VALUE;
    static final int C1 = 2000;
    static final String D1 = "RV Scroll";
    private static final String E1 = "RV OnLayout";
    private static final String F1 = "RV FullInvalidate";
    private static final String G1 = "RV PartialInvalidate";
    static final String H1 = "RV OnBindView";
    static final String I1 = "RV Prefetch";
    static final String J1 = "RV Nested Prefetch";
    static final String K1 = "RV CreateView";
    private static final Class<?>[] L1;
    private static final int M1 = -1;
    public static final int N1 = 0;
    public static final int O1 = 1;
    public static final int P1 = 2;
    static final long Q1 = Long.MAX_VALUE;
    static final Interpolator R1;
    static final String i1 = "RecyclerView";
    static final boolean j1 = false;
    static final boolean k1 = false;
    private static final int[] l1;
    static final boolean m1;
    static final boolean n1;
    static final boolean o1;
    static final boolean p1;
    private static final boolean q1;
    private static final boolean r1;
    static final boolean s1 = false;
    public static final int t1 = 0;
    public static final int u1 = 1;
    static final int v1 = 1;
    public static final int w1 = -1;
    public static final long x1 = -1L;
    public static final int y1 = -1;
    public static final int z1 = 0;
    private int A0;
    private int B0;
    private int C0;
    private int D0;
    private int E0;
    private s F0;
    private final z G;
    private final int G0;
    final x H;
    private final int H0;
    a0 I;
    private float I0;
    a J;
    private float J0;
    g K;
    private boolean K0;
    final l0 L;
    final f0 L0;
    boolean M;
    androidx.recyclerview.widget.n M0;
    final Runnable N;
    androidx.recyclerview.widget.n.b N0;
    final Rect O;
    final d0 O0;
    private final Rect P;
    private u P0;
    final RectF Q;
    private List<u> Q0;
    h R;
    boolean R0;
    @b1
    p S;
    boolean S0;
    y T;
    private m.c T0;
    final List<y> U;
    boolean U0;
    final ArrayList<o> V;
    androidx.recyclerview.widget.b0 V0;
    private final ArrayList<t> W;
    private k W0;
    private final int[] X0;
    private androidx.core.view.v Y0;
    private final int[] Z0;
    private t a0;
    private final int[] a1;
    boolean b0;
    final int[] b1;
    boolean c0;
    @b1
    final List<g0> c1;
    boolean d0;
    private Runnable d1;
    @b1
    boolean e0;
    private boolean e1;
    private int f0;
    private int f1;
    boolean g0;
    private int g1;
    boolean h0;
    private final l0.b h1;
    private boolean i0;
    private int j0;
    boolean k0;
    private final AccessibilityManager l0;
    private List<r> m0;
    boolean n0;
    boolean o0;
    private int p0;
    private int q0;
    @j0
    private l r0;
    private EdgeEffect s0;
    private EdgeEffect t0;
    private EdgeEffect u0;
    private EdgeEffect v0;
    m w0;
    private int x0;
    private int y0;
    private VelocityTracker z0;
    
    static {
        l1 = new int[] { 16843830 };
        final int sdk_INT = Build$VERSION.SDK_INT;
        m1 = (sdk_INT == 18 || sdk_INT == 19 || sdk_INT == 20);
        n1 = (sdk_INT >= 23);
        o1 = (sdk_INT >= 16);
        p1 = (sdk_INT >= 21);
        q1 = (sdk_INT <= 15);
        r1 = (sdk_INT <= 15);
        final Class<Integer> type = Integer.TYPE;
        L1 = new Class[] { Context.class, AttributeSet.class, type, type };
        R1 = (Interpolator)new Interpolator() {
            public float getInterpolation(float n) {
                --n;
                return n * n * n * n * n + 1.0f;
            }
        };
    }
    
    public RecyclerView(@j0 final Context context) {
        this(context, null);
    }
    
    public RecyclerView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.a.r);
    }
    
    public RecyclerView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new z();
        this.H = new x();
        this.L = new l0();
        this.N = new Runnable() {
            @Override
            public void run() {
                final RecyclerView g = RecyclerView.this;
                if (g.e0) {
                    if (!g.isLayoutRequested()) {
                        final RecyclerView g2 = RecyclerView.this;
                        if (!g2.b0) {
                            g2.requestLayout();
                            return;
                        }
                        if (g2.h0) {
                            g2.g0 = true;
                            return;
                        }
                        g2.F();
                    }
                }
            }
        };
        this.O = new Rect();
        this.P = new Rect();
        this.Q = new RectF();
        this.U = new ArrayList<y>();
        this.V = new ArrayList<o>();
        this.W = new ArrayList<t>();
        this.f0 = 0;
        this.n0 = false;
        this.o0 = false;
        this.p0 = 0;
        this.q0 = 0;
        this.r0 = new l();
        this.w0 = (m)new androidx.recyclerview.widget.j();
        this.x0 = 0;
        this.y0 = -1;
        this.I0 = Float.MIN_VALUE;
        this.J0 = Float.MIN_VALUE;
        final boolean b = true;
        this.K0 = true;
        this.L0 = new f0();
        androidx.recyclerview.widget.n.b n2;
        if (RecyclerView.p1) {
            n2 = new androidx.recyclerview.widget.n.b();
        }
        else {
            n2 = null;
        }
        this.N0 = n2;
        this.O0 = new d0();
        this.R0 = false;
        this.S0 = false;
        this.T0 = (m.c)new n();
        this.U0 = false;
        this.X0 = new int[2];
        this.Z0 = new int[2];
        this.a1 = new int[2];
        this.b1 = new int[2];
        this.c1 = new ArrayList<g0>();
        this.d1 = new Runnable() {
            @Override
            public void run() {
                final m w0 = RecyclerView.this.w0;
                if (w0 != null) {
                    w0.x();
                }
                RecyclerView.this.U0 = false;
            }
        };
        this.f1 = 0;
        this.g1 = 0;
        this.h1 = new l0.b() {
            @Override
            public void a(final g0 g0) {
                final RecyclerView a = RecyclerView.this;
                a.S.F1(g0.itemView, a.H);
            }
            
            @Override
            public void b(final g0 g0, final m.d d, final m.d d2) {
                RecyclerView.this.t(g0, d, d2);
            }
            
            @Override
            public void c(final g0 g0, @j0 final m.d d, @k0 final m.d d2) {
                RecyclerView.this.H.K(g0);
                RecyclerView.this.v(g0, d, d2);
            }
            
            @Override
            public void d(final g0 g0, @j0 final m.d d, @j0 final m.d d2) {
                g0.setIsRecyclable(false);
                final RecyclerView a = RecyclerView.this;
                final boolean n0 = a.n0;
                final m w0 = a.w0;
                if (n0) {
                    if (!w0.b(g0, g0, d, d2)) {
                        return;
                    }
                }
                else if (!w0.d(g0, d, d2)) {
                    return;
                }
                RecyclerView.this.i1();
            }
        };
        this.setScrollContainer(true);
        this.setFocusableInTouchMode(true);
        final ViewConfiguration value = ViewConfiguration.get(context);
        this.E0 = value.getScaledTouchSlop();
        this.I0 = androidx.core.view.k0.b(value, context);
        this.J0 = androidx.core.view.k0.e(value, context);
        this.G0 = value.getScaledMinimumFlingVelocity();
        this.H0 = value.getScaledMaximumFlingVelocity();
        this.setWillNotDraw(this.getOverScrollMode() == 2);
        this.w0.A(this.T0);
        this.F0();
        this.H0();
        this.G0();
        if (androidx.core.view.j0.T((View)this) == 0) {
            androidx.core.view.j0.P1((View)this, 1);
        }
        this.l0 = (AccessibilityManager)this.getContext().getSystemService("accessibility");
        this.setAccessibilityDelegateCompat(new androidx.recyclerview.widget.b0(this));
        final int[] n3 = c1.a.j.N;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, n3, n, 0);
        androidx.core.view.j0.x1((View)this, context, n3, set, obtainStyledAttributes, n, 0);
        final String string = obtainStyledAttributes.getString(c1.a.j.W);
        if (obtainStyledAttributes.getInt(c1.a.j.Q, -1) == -1) {
            this.setDescendantFocusability(262144);
        }
        this.M = obtainStyledAttributes.getBoolean(c1.a.j.P, true);
        final boolean boolean1 = obtainStyledAttributes.getBoolean(c1.a.j.R, false);
        this.d0 = boolean1;
        if (boolean1) {
            this.I0((StateListDrawable)obtainStyledAttributes.getDrawable(c1.a.j.U), obtainStyledAttributes.getDrawable(c1.a.j.V), (StateListDrawable)obtainStyledAttributes.getDrawable(c1.a.j.S), obtainStyledAttributes.getDrawable(c1.a.j.T));
        }
        obtainStyledAttributes.recycle();
        this.G(context, string, set, n, 0);
        boolean boolean2 = b;
        if (Build$VERSION.SDK_INT >= 21) {
            final int[] l1 = RecyclerView.l1;
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(set, l1, n, 0);
            androidx.core.view.j0.x1((View)this, context, l1, set, obtainStyledAttributes2, n, 0);
            boolean2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        this.setNestedScrollingEnabled(boolean2);
    }
    
    static void A(@j0 final g0 g0) {
        final WeakReference<RecyclerView> mNestedRecyclerView = g0.mNestedRecyclerView;
        if (mNestedRecyclerView != null) {
            Object o = mNestedRecyclerView.get();
        Label_0014:
            while (true) {
                for (View view = (View)o; view != null; view = null) {
                    if (view == g0.itemView) {
                        return;
                    }
                    o = view.getParent();
                    if (o instanceof View) {
                        continue Label_0014;
                    }
                }
                g0.mNestedRecyclerView = null;
                break;
            }
        }
    }
    
    private void A1() {
        final d0 o0 = this.O0;
        o0.n = -1L;
        o0.m = -1;
        o0.o = -1;
    }
    
    private void B0(final long n, final g0 obj, final g0 obj2) {
        for (int g = this.K.g(), i = 0; i < g; ++i) {
            final g0 u0 = u0(this.K.f(i));
            if (u0 != obj) {
                if (this.o0(u0) == n) {
                    final h r = this.R;
                    if (r != null && r.hasStableIds()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                        sb.append(u0);
                        sb.append(" \n View Holder 2:");
                        sb.append(obj);
                        sb.append(this.Y());
                        throw new IllegalStateException(sb.toString());
                    }
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb2.append(u0);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(obj);
                    sb2.append(this.Y());
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(obj2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(obj);
        sb3.append(this.Y());
        Log.e("RecyclerView", sb3.toString());
    }
    
    private void B1() {
        final VelocityTracker z0 = this.z0;
        if (z0 != null) {
            z0.clear();
        }
        this.g(0);
        this.p1();
    }
    
    private void C1() {
        final boolean k0 = this.K0;
        final g0 g0 = null;
        View focusedChild;
        if (k0 && this.hasFocus() && this.R != null) {
            focusedChild = this.getFocusedChild();
        }
        else {
            focusedChild = null;
        }
        g0 c0;
        if (focusedChild == null) {
            c0 = g0;
        }
        else {
            c0 = this.c0(focusedChild);
        }
        if (c0 == null) {
            this.A1();
        }
        else {
            final d0 o0 = this.O0;
            long itemId;
            if (this.R.hasStableIds()) {
                itemId = c0.getItemId();
            }
            else {
                itemId = -1L;
            }
            o0.n = itemId;
            final d0 o2 = this.O0;
            int m;
            if (this.n0) {
                m = -1;
            }
            else if (c0.isRemoved()) {
                m = c0.mOldPosition;
            }
            else {
                m = c0.getAbsoluteAdapterPosition();
            }
            o2.m = m;
            this.O0.o = this.x0(c0.itemView);
        }
    }
    
    private boolean E0() {
        for (int g = this.K.g(), i = 0; i < g; ++i) {
            final g0 u0 = u0(this.K.f(i));
            if (u0 != null) {
                if (!u0.shouldIgnore()) {
                    if (u0.isUpdated()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private void G(Context ex, String trim, final AttributeSet set, final int i, final int j) {
        if (trim != null) {
            trim = trim.trim();
            if (!trim.isEmpty()) {
                final String y0 = this.y0((Context)ex, trim);
                try {
                    ClassLoader loader;
                    if (this.isInEditMode()) {
                        loader = this.getClass().getClassLoader();
                    }
                    else {
                        loader = ((Context)ex).getClassLoader();
                    }
                    final Class<? extends p> subclass = Class.forName(y0, false, loader).asSubclass(p.class);
                    final NoSuchMethodException ex2 = null;
                    try {
                        final Constructor<? extends p> constructor = subclass.getConstructor(RecyclerView.L1);
                        ex = (NoSuchMethodException)new Object[] { ex, set, i, j };
                    }
                    catch (NoSuchMethodException ex) {
                        try {
                            final Constructor<? extends p> constructor = subclass.getConstructor((Class<?>[])new Class[0]);
                            ex = ex2;
                            constructor.setAccessible(true);
                            this.setLayoutManager((p)constructor.newInstance((Object[])(Object)ex));
                        }
                        catch (NoSuchMethodException cause) {
                            cause.initCause(ex);
                            final StringBuilder sb = new StringBuilder();
                            sb.append(set.getPositionDescription());
                            sb.append(": Error creating LayoutManager ");
                            sb.append(y0);
                            throw new IllegalStateException(sb.toString(), cause);
                        }
                    }
                }
                catch (ClassCastException cause2) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(set.getPositionDescription());
                    sb2.append(": Class is not a LayoutManager ");
                    sb2.append(y0);
                    throw new IllegalStateException(sb2.toString(), cause2);
                }
                catch (IllegalAccessException cause3) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(set.getPositionDescription());
                    sb3.append(": Cannot access non-public constructor ");
                    sb3.append(y0);
                    throw new IllegalStateException(sb3.toString(), cause3);
                }
                catch (InstantiationException cause4) {
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append(set.getPositionDescription());
                    sb4.append(": Could not instantiate the LayoutManager: ");
                    sb4.append(y0);
                    throw new IllegalStateException(sb4.toString(), cause4);
                }
                catch (InvocationTargetException cause5) {
                    final StringBuilder sb5 = new StringBuilder();
                    sb5.append(set.getPositionDescription());
                    sb5.append(": Could not instantiate the LayoutManager: ");
                    sb5.append(y0);
                    throw new IllegalStateException(sb5.toString(), cause5);
                }
                catch (ClassNotFoundException cause6) {
                    final StringBuilder sb6 = new StringBuilder();
                    sb6.append(set.getPositionDescription());
                    sb6.append(": Unable to find LayoutManager ");
                    sb6.append(y0);
                    throw new IllegalStateException(sb6.toString(), cause6);
                }
            }
        }
    }
    
    @SuppressLint({ "InlinedApi" })
    private void G0() {
        if (androidx.core.view.j0.U((View)this) == 0) {
            androidx.core.view.j0.Q1((View)this, 8);
        }
    }
    
    private void H0() {
        this.K = new g((g.b)new g.b() {
            @Override
            public View a(final int n) {
                return RecyclerView.this.getChildAt(n);
            }
            
            @Override
            public void b(final View view) {
                final g0 u0 = RecyclerView.u0(view);
                if (u0 != null) {
                    u0.onEnteredHiddenState(RecyclerView.this);
                }
            }
            
            @Override
            public int c() {
                return RecyclerView.this.getChildCount();
            }
            
            @Override
            public void d() {
                for (int c = this.c(), i = 0; i < c; ++i) {
                    final View a = this.a(i);
                    RecyclerView.this.K(a);
                    a.clearAnimation();
                }
                RecyclerView.this.removeAllViews();
            }
            
            @Override
            public int e(final View view) {
                return RecyclerView.this.indexOfChild(view);
            }
            
            @Override
            public g0 f(final View view) {
                return RecyclerView.u0(view);
            }
            
            @Override
            public void g(final int n) {
                final View a = this.a(n);
                if (a != null) {
                    final g0 u0 = RecyclerView.u0(a);
                    if (u0 != null) {
                        if (u0.isTmpDetached() && !u0.shouldIgnore()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("called detach on an already detached child ");
                            sb.append(u0);
                            sb.append(RecyclerView.this.Y());
                            throw new IllegalArgumentException(sb.toString());
                        }
                        u0.addFlags(256);
                    }
                }
                RecyclerView.j(RecyclerView.this, n);
            }
            
            @Override
            public void h(final View view) {
                final g0 u0 = RecyclerView.u0(view);
                if (u0 != null) {
                    u0.onLeftHiddenState(RecyclerView.this);
                }
            }
            
            @Override
            public void i(final View view, final int n) {
                RecyclerView.this.addView(view, n);
                RecyclerView.this.J(view);
            }
            
            @Override
            public void j(final int n) {
                final View child = RecyclerView.this.getChildAt(n);
                if (child != null) {
                    RecyclerView.this.K(child);
                    child.clearAnimation();
                }
                RecyclerView.this.removeViewAt(n);
            }
            
            @Override
            public void k(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
                final g0 u0 = RecyclerView.u0(view);
                if (u0 != null) {
                    if (!u0.isTmpDetached() && !u0.shouldIgnore()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Called attach on a child which is not detached: ");
                        sb.append(u0);
                        sb.append(RecyclerView.this.Y());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    u0.clearTmpDetachFlag();
                }
                RecyclerView.i(RecyclerView.this, view, n, viewGroup$LayoutParams);
            }
        });
    }
    
    private void H1(@k0 final h r, final boolean b, final boolean b2) {
        final h r2 = this.R;
        if (r2 != null) {
            r2.unregisterAdapterDataObserver(this.G);
            this.R.onDetachedFromRecyclerView(this);
        }
        if (!b || b2) {
            this.q1();
        }
        this.J.z();
        final h r3 = this.R;
        if ((this.R = r) != null) {
            r.registerAdapterDataObserver(this.G);
            r.onAttachedToRecyclerView(this);
        }
        final p s = this.S;
        if (s != null) {
            s.V0(r3, this.R);
        }
        this.H.y(r3, this.R, b);
        this.O0.g = true;
    }
    
    private boolean I(final int n, final int n2) {
        this.e0(this.X0);
        final int[] x0 = this.X0;
        boolean b = false;
        if (x0[0] != n || x0[1] != n2) {
            b = true;
        }
        return b;
    }
    
    private void L() {
        final int j0 = this.j0;
        this.j0 = 0;
        if (j0 != 0 && this.L0()) {
            final AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            b.i(obtain, j0);
            this.sendAccessibilityEventUnchecked(obtain);
        }
    }
    
    private void N() {
        final d0 o0 = this.O0;
        boolean i = true;
        o0.a(1);
        this.Z(this.O0);
        this.O0.j = false;
        this.P1();
        this.L.f();
        this.c1();
        this.k1();
        this.C1();
        final d0 o2 = this.O0;
        if (!o2.k || !this.S0) {
            i = false;
        }
        o2.i = i;
        this.S0 = false;
        this.R0 = false;
        o2.h = o2.l;
        o2.f = this.R.getItemCount();
        this.e0(this.X0);
        if (this.O0.k) {
            for (int g = this.K.g(), j = 0; j < g; ++j) {
                final g0 u0 = u0(this.K.f(j));
                if (!u0.shouldIgnore()) {
                    if (!u0.isInvalid() || this.R.hasStableIds()) {
                        this.L.e(u0, this.w0.w(this.O0, u0, m.e(u0), u0.getUnmodifiedPayloads()));
                        if (this.O0.i && u0.isUpdated() && !u0.isRemoved() && !u0.shouldIgnore() && !u0.isInvalid()) {
                            this.L.c(this.o0(u0), u0);
                        }
                    }
                }
            }
        }
        if (this.O0.l) {
            this.D1();
            final d0 o3 = this.O0;
            final boolean g2 = o3.g;
            o3.g = false;
            this.S.o1(this.H, o3);
            this.O0.g = g2;
            for (int k = 0; k < this.K.g(); ++k) {
                final g0 u2 = u0(this.K.f(k));
                if (!u2.shouldIgnore()) {
                    if (!this.L.i(u2)) {
                        final int e = m.e(u2);
                        final boolean hasAnyOfTheFlags = u2.hasAnyOfTheFlags(8192);
                        int n = e;
                        if (!hasAnyOfTheFlags) {
                            n = (e | 0x1000);
                        }
                        final m.d w = this.w0.w(this.O0, u2, n, u2.getUnmodifiedPayloads());
                        if (hasAnyOfTheFlags) {
                            this.n1(u2, w);
                        }
                        else {
                            this.L.a(u2, w);
                        }
                    }
                }
            }
        }
        this.B();
        this.d1();
        this.Q1(false);
        this.O0.e = 2;
    }
    
    private void O() {
        this.P1();
        this.c1();
        this.O0.a(6);
        this.J.k();
        this.O0.f = this.R.getItemCount();
        this.O0.d = 0;
        if (this.I != null && this.R.canRestoreState()) {
            final Parcelable i = this.I.I;
            if (i != null) {
                this.S.t1(i);
            }
            this.I = null;
        }
        final d0 o0 = this.O0;
        o0.h = false;
        this.S.o1(this.H, o0);
        final d0 o2 = this.O0;
        o2.g = false;
        o2.k = (o2.k && this.w0 != null);
        o2.e = 4;
        this.d1();
        this.Q1(false);
    }
    
    private void P() {
        this.O0.a(4);
        this.P1();
        this.c1();
        final d0 o0 = this.O0;
        o0.e = 1;
        if (o0.k) {
            for (int i = this.K.g() - 1; i >= 0; --i) {
                final g0 u0 = u0(this.K.f(i));
                if (!u0.shouldIgnore()) {
                    final long o2 = this.o0(u0);
                    final m.d v = this.w0.v(this.O0, u0);
                    final g0 g = this.L.g(o2);
                    if (g != null && !g.shouldIgnore()) {
                        final boolean h = this.L.h(g);
                        final boolean h2 = this.L.h(u0);
                        if (!h || g != u0) {
                            final m.d n = this.L.n(g);
                            this.L.d(u0, v);
                            final m.d m = this.L.m(u0);
                            if (n == null) {
                                this.B0(o2, u0, g);
                                continue;
                            }
                            this.u(g, u0, n, m, h, h2);
                            continue;
                        }
                    }
                    this.L.d(u0, v);
                }
            }
            this.L.o(this.h1);
        }
        this.S.E1(this.H);
        final d0 o3 = this.O0;
        o3.c = o3.f;
        this.n0 = false;
        this.o0 = false;
        o3.k = false;
        o3.l = false;
        this.S.h = false;
        final ArrayList<g0> b = this.H.b;
        if (b != null) {
            b.clear();
        }
        final p s = this.S;
        if (s.n) {
            s.m = 0;
            s.n = false;
            this.H.L();
        }
        this.S.p1(this.O0);
        this.d1();
        this.Q1(false);
        this.L.f();
        final int[] x0 = this.X0;
        if (this.I(x0[0], x0[1])) {
            this.R(0, 0);
        }
        this.o1();
        this.A1();
    }
    
    private boolean P0(final View view, final View view2, final int i) {
        final boolean b = false;
        final boolean b2 = false;
        final boolean b3 = false;
        final boolean b4 = false;
        final boolean b5 = false;
        final boolean b6 = false;
        boolean b7 = b5;
        if (view2 != null) {
            b7 = b5;
            if (view2 != this) {
                if (view2 == view) {
                    b7 = b5;
                }
                else {
                    if (this.b0(view2) == null) {
                        return false;
                    }
                    if (view == null) {
                        return true;
                    }
                    if (this.b0(view) == null) {
                        return true;
                    }
                    this.O.set(0, 0, view.getWidth(), view.getHeight());
                    this.P.set(0, 0, view2.getWidth(), view2.getHeight());
                    this.offsetDescendantRectToMyCoords(view, this.O);
                    this.offsetDescendantRectToMyCoords(view2, this.P);
                    final int i2 = this.S.i0();
                    int n = -1;
                    int n2;
                    if (i2 == 1) {
                        n2 = -1;
                    }
                    else {
                        n2 = 1;
                    }
                    final Rect o = this.O;
                    final int left = o.left;
                    final Rect p3 = this.P;
                    final int left2 = p3.left;
                    int n3;
                    if ((left < left2 || o.right <= left2) && o.right < p3.right) {
                        n3 = 1;
                    }
                    else {
                        final int right = o.right;
                        final int right2 = p3.right;
                        if ((right > right2 || left >= right2) && left > left2) {
                            n3 = -1;
                        }
                        else {
                            n3 = 0;
                        }
                    }
                    final int top = o.top;
                    final int top2 = p3.top;
                    if ((top < top2 || o.bottom <= top2) && o.bottom < p3.bottom) {
                        n = 1;
                    }
                    else {
                        final int bottom = o.bottom;
                        final int bottom2 = p3.bottom;
                        if ((bottom <= bottom2 && top < bottom2) || top <= top2) {
                            n = 0;
                        }
                    }
                    if (i != 1) {
                        if (i == 2) {
                            if (n <= 0) {
                                boolean b8 = b4;
                                if (n != 0) {
                                    return b8;
                                }
                                b8 = b4;
                                if (n3 * n2 <= 0) {
                                    return b8;
                                }
                            }
                            return true;
                        }
                        if (i == 17) {
                            boolean b9 = b3;
                            if (n3 < 0) {
                                b9 = true;
                            }
                            return b9;
                        }
                        if (i == 33) {
                            boolean b10 = b2;
                            if (n < 0) {
                                b10 = true;
                            }
                            return b10;
                        }
                        if (i == 66) {
                            boolean b11 = b;
                            if (n3 > 0) {
                                b11 = true;
                            }
                            return b11;
                        }
                        if (i == 130) {
                            boolean b12 = b6;
                            if (n > 0) {
                                b12 = true;
                            }
                            return b12;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid direction: ");
                        sb.append(i);
                        sb.append(this.Y());
                        throw new IllegalArgumentException(sb.toString());
                    }
                    else {
                        if (n >= 0) {
                            b7 = b5;
                            if (n != 0) {
                                return b7;
                            }
                            b7 = b5;
                            if (n3 * n2 >= 0) {
                                return b7;
                            }
                        }
                        b7 = true;
                    }
                }
            }
        }
        return b7;
    }
    
    private void S1() {
        this.L0.f();
        final p s = this.S;
        if (s != null) {
            s.i2();
        }
    }
    
    private boolean T(final MotionEvent motionEvent) {
        final t a0 = this.a0;
        if (a0 == null) {
            return motionEvent.getAction() != 0 && this.d0(motionEvent);
        }
        a0.a(this, motionEvent);
        final int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.a0 = null;
        }
        return true;
    }
    
    private void U0(int n, int n2, @k0 final MotionEvent motionEvent, final int n3) {
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.h0) {
            return;
        }
        final int[] b1 = this.b1;
        final int n4 = 0;
        b1[1] = (b1[0] = 0);
        final int n5 = s.n() ? 1 : 0;
        final boolean o = this.S.o();
        int n6;
        if (o) {
            n6 = (n5 | 0x2);
        }
        else {
            n6 = n5;
        }
        this.f(n6, n3);
        int n7;
        if (n5 != 0) {
            n7 = n;
        }
        else {
            n7 = 0;
        }
        int n8;
        if (o) {
            n8 = n2;
        }
        else {
            n8 = 0;
        }
        int n9 = n;
        int n10 = n2;
        if (this.b(n7, n8, this.b1, this.Z0, n3)) {
            final int[] b2 = this.b1;
            n9 = n - b2[0];
            n10 = n2 - b2[1];
        }
        if (n5 != 0) {
            n = n9;
        }
        else {
            n = 0;
        }
        n2 = n4;
        if (o) {
            n2 = n10;
        }
        this.E1(n, n2, motionEvent, n3);
        final androidx.recyclerview.widget.n m0 = this.M0;
        if (m0 != null && (n9 != 0 || n10 != 0)) {
            m0.f(this, n9, n10);
        }
        this.g(n3);
    }
    
    private boolean d0(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        for (int size = this.W.size(), i = 0; i < size; ++i) {
            final t a0 = this.W.get(i);
            if (a0.c(this, motionEvent) && action != 3) {
                this.a0 = a0;
                return true;
            }
        }
        return false;
    }
    
    private void e0(final int[] array) {
        final int g = this.K.g();
        if (g == 0) {
            array[1] = (array[0] = -1);
            return;
        }
        int n = Integer.MAX_VALUE;
        int n2 = Integer.MIN_VALUE;
        int n3;
        for (int i = 0; i < g; ++i, n2 = n3) {
            final g0 u0 = u0(this.K.f(i));
            if (u0.shouldIgnore()) {
                n3 = n2;
            }
            else {
                final int layoutPosition = u0.getLayoutPosition();
                int n4;
                if (layoutPosition < (n4 = n)) {
                    n4 = layoutPosition;
                }
                n = n4;
                if (layoutPosition > (n3 = n2)) {
                    n3 = layoutPosition;
                    n = n4;
                }
            }
        }
        array[0] = n;
        array[1] = n2;
    }
    
    @k0
    static RecyclerView f0(@j0 final View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView)view;
        }
        final ViewGroup viewGroup = (ViewGroup)view;
        for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
            final RecyclerView f0 = f0(viewGroup.getChildAt(i));
            if (f0 != null) {
                return f0;
            }
        }
        return null;
    }
    
    private void f1(final MotionEvent motionEvent) {
        final int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.y0) {
            int n;
            if (actionIndex == 0) {
                n = 1;
            }
            else {
                n = 0;
            }
            this.y0 = motionEvent.getPointerId(n);
            final int n2 = (int)(motionEvent.getX(n) + 0.5f);
            this.C0 = n2;
            this.A0 = n2;
            final int n3 = (int)(motionEvent.getY(n) + 0.5f);
            this.D0 = n3;
            this.B0 = n3;
        }
    }
    
    @k0
    private View g0() {
        final d0 o0 = this.O0;
        int m = o0.m;
        if (m == -1) {
            m = 0;
        }
        final int d = o0.d();
        for (int i = m; i < d; ++i) {
            final g0 h0 = this.h0(i);
            if (h0 == null) {
                break;
            }
            if (h0.itemView.hasFocusable()) {
                return h0.itemView;
            }
        }
        for (int j = Math.min(d, m) - 1; j >= 0; --j) {
            final g0 h2 = this.h0(j);
            if (h2 == null) {
                return null;
            }
            if (h2.itemView.hasFocusable()) {
                return h2.itemView;
            }
        }
        return null;
    }
    
    private androidx.core.view.v getScrollingChildHelper() {
        if (this.Y0 == null) {
            this.Y0 = new androidx.core.view.v((View)this);
        }
        return this.Y0;
    }
    
    static /* synthetic */ void i(final RecyclerView recyclerView, final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        recyclerView.attachViewToParent(view, n, viewGroup$LayoutParams);
    }
    
    static /* synthetic */ void j(final RecyclerView recyclerView, final int n) {
        recyclerView.detachViewFromParent(n);
    }
    
    private boolean j1() {
        return this.w0 != null && this.S.j2();
    }
    
    static /* synthetic */ boolean k(final RecyclerView recyclerView) {
        return recyclerView.awakenScrollBars();
    }
    
    private void k1() {
        if (this.n0) {
            this.J.z();
            if (this.o0) {
                this.S.j1(this);
            }
        }
        if (this.j1()) {
            this.J.x();
        }
        else {
            this.J.k();
        }
        final boolean r0 = this.R0;
        final boolean b = false;
        final boolean b2 = r0 || this.S0;
        final d0 o0 = this.O0;
        boolean k = false;
        Label_0145: {
            if (this.e0 && this.w0 != null) {
                final boolean n0 = this.n0;
                if ((n0 || b2 || this.S.h) && (!n0 || this.R.hasStableIds())) {
                    k = true;
                    break Label_0145;
                }
            }
            k = false;
        }
        o0.k = k;
        final d0 o2 = this.O0;
        boolean l = b;
        if (o2.k) {
            l = b;
            if (b2) {
                l = b;
                if (!this.n0) {
                    l = b;
                    if (this.j1()) {
                        l = true;
                    }
                }
            }
        }
        o2.l = l;
    }
    
    static /* synthetic */ void l(final RecyclerView recyclerView, final int n, final int n2) {
        recyclerView.setMeasuredDimension(n, n2);
    }
    
    private void m(final g0 g0) {
        final View itemView = g0.itemView;
        final boolean b = itemView.getParent() == this;
        this.H.K(this.t0(itemView));
        if (g0.isTmpDetached()) {
            this.K.c(itemView, -1, itemView.getLayoutParams(), true);
        }
        else {
            final g k = this.K;
            if (!b) {
                k.b(itemView, true);
            }
            else {
                k.k(itemView);
            }
        }
    }
    
    private void m1(final float n, final float n2, float n3, final float n4) {
        final int n5 = 1;
        int n7 = 0;
        Label_0092: {
            EdgeEffect edgeEffect;
            float n6;
            if (n2 < 0.0f) {
                this.V();
                edgeEffect = this.s0;
                n6 = -n2 / this.getWidth();
                n3 = 1.0f - n3 / this.getHeight();
            }
            else {
                if (n2 <= 0.0f) {
                    n7 = 0;
                    break Label_0092;
                }
                this.W();
                edgeEffect = this.u0;
                n6 = n2 / this.getWidth();
                n3 /= this.getHeight();
            }
            androidx.core.widget.j.e(edgeEffect, n6, n3);
            n7 = 1;
        }
        if (n4 < 0.0f) {
            this.X();
            androidx.core.widget.j.e(this.t0, -n4 / this.getHeight(), n / this.getWidth());
            n7 = n5;
        }
        else if (n4 > 0.0f) {
            this.U();
            androidx.core.widget.j.e(this.v0, n4 / this.getHeight(), 1.0f - n / this.getWidth());
            n7 = n5;
        }
        if (n7 != 0 || n2 != 0.0f || n4 != 0.0f) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    private void o1() {
        if (this.K0 && this.R != null && this.hasFocus() && this.getDescendantFocusability() != 393216) {
            if (this.getDescendantFocusability() != 131072 || !this.isFocused()) {
                if (!this.isFocused()) {
                    final View focusedChild = this.getFocusedChild();
                    if (RecyclerView.r1 && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.K.g() == 0) {
                            this.requestFocus();
                            return;
                        }
                    }
                    else if (!this.K.n(focusedChild)) {
                        return;
                    }
                }
                final long n = this.O0.n;
                final View view = null;
                g0 i0;
                if (n != -1L && this.R.hasStableIds()) {
                    i0 = this.i0(this.O0.n);
                }
                else {
                    i0 = null;
                }
                View view2;
                if (i0 != null && !this.K.n(i0.itemView) && i0.itemView.hasFocusable()) {
                    view2 = i0.itemView;
                }
                else {
                    view2 = view;
                    if (this.K.g() > 0) {
                        view2 = this.g0();
                    }
                }
                if (view2 != null) {
                    final int o = this.O0.o;
                    View view3 = view2;
                    if (o != -1L) {
                        final View viewById = view2.findViewById(o);
                        view3 = view2;
                        if (viewById != null) {
                            view3 = view2;
                            if (viewById.isFocusable()) {
                                view3 = viewById;
                            }
                        }
                    }
                    view3.requestFocus();
                }
            }
        }
    }
    
    private void p1() {
        final EdgeEffect s0 = this.s0;
        int finished;
        if (s0 != null) {
            s0.onRelease();
            finished = (this.s0.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        final EdgeEffect t0 = this.t0;
        int n = finished;
        if (t0 != null) {
            t0.onRelease();
            n = (finished | (this.t0.isFinished() ? 1 : 0));
        }
        final EdgeEffect u0 = this.u0;
        int n2 = n;
        if (u0 != null) {
            u0.onRelease();
            n2 = (n | (this.u0.isFinished() ? 1 : 0));
        }
        final EdgeEffect v0 = this.v0;
        int n3 = n2;
        if (v0 != null) {
            v0.onRelease();
            n3 = (n2 | (this.v0.isFinished() ? 1 : 0));
        }
        if (n3 != 0) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    private void u(@j0 final g0 mShadowingHolder, @j0 final g0 mShadowedHolder, @j0 final m.d d, @j0 final m.d d2, final boolean b, final boolean b2) {
        mShadowingHolder.setIsRecyclable(false);
        if (b) {
            this.m(mShadowingHolder);
        }
        if (mShadowingHolder != mShadowedHolder) {
            if (b2) {
                this.m(mShadowedHolder);
            }
            mShadowingHolder.mShadowedHolder = mShadowedHolder;
            this.m(mShadowingHolder);
            this.H.K(mShadowingHolder);
            mShadowedHolder.setIsRecyclable(false);
            mShadowedHolder.mShadowingHolder = mShadowingHolder;
        }
        if (this.w0.b(mShadowingHolder, mShadowedHolder, d, d2)) {
            this.i1();
        }
    }
    
    static g0 u0(final View view) {
        if (view == null) {
            return null;
        }
        return ((q)view.getLayoutParams()).a;
    }
    
    static void w0(final View view, final Rect rect) {
        final q q = (q)view.getLayoutParams();
        final Rect b = q.b;
        rect.set(view.getLeft() - b.left - q.leftMargin, view.getTop() - b.top - q.topMargin, view.getRight() + b.right + q.rightMargin, view.getBottom() + b.bottom + q.bottomMargin);
    }
    
    private int x0(View focusedChild) {
        int id = 0;
    Label_0000:
        while (true) {
            id = focusedChild.getId();
            while (!focusedChild.isFocused() && focusedChild instanceof ViewGroup && focusedChild.hasFocus()) {
                final View view = focusedChild = ((ViewGroup)focusedChild).getFocusedChild();
                if (view.getId() != -1) {
                    focusedChild = view;
                    continue Label_0000;
                }
            }
            break;
        }
        return id;
    }
    
    private String y0(final Context context, final String s) {
        if (s.charAt(0) == '.') {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(s);
            return sb.toString();
        }
        if (s.contains(".")) {
            return s;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(RecyclerView.class.getPackage().getName());
        sb2.append('.');
        sb2.append(s);
        return sb2.toString();
    }
    
    private void z() {
        this.B1();
        this.setScrollState(0);
    }
    
    private void z1(@j0 final View view, @k0 final View view2) {
        View view3;
        if (view2 != null) {
            view3 = view2;
        }
        else {
            view3 = view;
        }
        this.O.set(0, 0, view3.getWidth(), view3.getHeight());
        final ViewGroup$LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof q) {
            final q q = (q)layoutParams;
            if (!q.c) {
                final Rect b = q.b;
                final Rect o = this.O;
                o.left -= b.left;
                o.right += b.right;
                o.top -= b.top;
                o.bottom += b.bottom;
            }
        }
        if (view2 != null) {
            this.offsetDescendantRectToMyCoords(view2, this.O);
            this.offsetRectIntoDescendantCoords(view, this.O);
        }
        this.S.M1(this, view, this.O, this.e0 ^ true, view2 == null);
    }
    
    @j0
    public o A0(final int n) {
        final int itemDecorationCount = this.getItemDecorationCount();
        if (n >= 0 && n < itemDecorationCount) {
            return this.V.get(n);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    void B() {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (!u0.shouldIgnore()) {
                u0.clearOldPosition();
            }
        }
        this.H.e();
    }
    
    public void C() {
        final List<r> m0 = this.m0;
        if (m0 != null) {
            m0.clear();
        }
    }
    
    public boolean C0() {
        return this.c0;
    }
    
    public void D() {
        final List<u> q0 = this.Q0;
        if (q0 != null) {
            q0.clear();
        }
    }
    
    public boolean D0() {
        return !this.e0 || this.n0 || this.J.q();
    }
    
    void D1() {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (!u0.shouldIgnore()) {
                u0.saveOldPosition();
            }
        }
    }
    
    void E(final int n, final int n2) {
        final EdgeEffect s0 = this.s0;
        int finished;
        if (s0 != null && !s0.isFinished() && n > 0) {
            this.s0.onRelease();
            finished = (this.s0.isFinished() ? 1 : 0);
        }
        else {
            finished = 0;
        }
        final EdgeEffect u0 = this.u0;
        int n3 = finished;
        if (u0 != null) {
            n3 = finished;
            if (!u0.isFinished()) {
                n3 = finished;
                if (n < 0) {
                    this.u0.onRelease();
                    n3 = (finished | (this.u0.isFinished() ? 1 : 0));
                }
            }
        }
        final EdgeEffect t0 = this.t0;
        int n4 = n3;
        if (t0 != null) {
            n4 = n3;
            if (!t0.isFinished()) {
                n4 = n3;
                if (n2 > 0) {
                    this.t0.onRelease();
                    n4 = (n3 | (this.t0.isFinished() ? 1 : 0));
                }
            }
        }
        final EdgeEffect v0 = this.v0;
        int n5 = n4;
        if (v0 != null) {
            n5 = n4;
            if (!v0.isFinished()) {
                n5 = n4;
                if (n2 < 0) {
                    this.v0.onRelease();
                    n5 = (n4 | (this.v0.isFinished() ? 1 : 0));
                }
            }
        }
        if (n5 != 0) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    boolean E1(final int n, final int n2, final MotionEvent motionEvent, int n3) {
        this.F();
        final h r = this.R;
        final boolean b = true;
        int n6;
        int n7;
        int n8;
        int n9;
        if (r != null) {
            final int[] b2 = this.b1;
            b2[1] = (b2[0] = 0);
            this.F1(n, n2, b2);
            final int[] b3 = this.b1;
            final int n4 = b3[0];
            final int n5 = n6 = b3[1];
            n7 = n4;
            n8 = n - n4;
            n9 = n2 - n5;
        }
        else {
            n6 = 0;
            n7 = 0;
            n8 = 0;
            n9 = 0;
        }
        if (!this.V.isEmpty()) {
            this.invalidate();
        }
        final int[] b4 = this.b1;
        b4[1] = (b4[0] = 0);
        this.c(n7, n6, n8, n9, this.Z0, n3, b4);
        final int[] b5 = this.b1;
        final int n10 = b5[0];
        final int n11 = b5[1];
        if (b5[0] == 0 && b5[1] == 0) {
            n3 = 0;
        }
        else {
            n3 = 1;
        }
        final int c0 = this.C0;
        final int[] z0 = this.Z0;
        this.C0 = c0 - z0[0];
        this.D0 -= z0[1];
        final int[] a1 = this.a1;
        a1[0] += z0[0];
        a1[1] += z0[1];
        if (this.getOverScrollMode() != 2) {
            if (motionEvent != null && !androidx.core.view.r.l(motionEvent, 8194)) {
                this.m1(motionEvent.getX(), (float)(n8 - n10), motionEvent.getY(), (float)(n9 - n11));
            }
            this.E(n, n2);
        }
        if (n7 != 0 || n6 != 0) {
            this.R(n7, n6);
        }
        if (!this.awakenScrollBars()) {
            this.invalidate();
        }
        boolean b6 = b;
        if (n3 == 0) {
            b6 = b;
            if (n7 == 0) {
                b6 = (n6 != 0 && b);
            }
        }
        return b6;
    }
    
    void F() {
        if (!this.e0 || this.n0) {
            androidx.core.os.t.b("RV FullInvalidate");
            this.M();
            androidx.core.os.t.d();
            return;
        }
        if (!this.J.q()) {
            return;
        }
        if (this.J.p(4) && !this.J.p(11)) {
            androidx.core.os.t.b("RV PartialInvalidate");
            this.P1();
            this.c1();
            this.J.x();
            if (!this.g0) {
                if (this.E0()) {
                    this.M();
                }
                else {
                    this.J.j();
                }
            }
            this.Q1(true);
            this.d1();
        }
        else {
            if (!this.J.q()) {
                return;
            }
            androidx.core.os.t.b("RV FullInvalidate");
            this.M();
        }
        androidx.core.os.t.d();
    }
    
    void F0() {
        this.J = new a((a.a)new a.a() {
            @Override
            public void a(final int n, final int n2) {
                RecyclerView.this.Y0(n, n2);
                RecyclerView.this.R0 = true;
            }
            
            @Override
            public void b(final a.b b) {
                this.i(b);
            }
            
            @Override
            public void c(final int n, final int n2, final Object o) {
                RecyclerView.this.U1(n, n2, o);
                RecyclerView.this.S0 = true;
            }
            
            @Override
            public void d(final a.b b) {
                this.i(b);
            }
            
            @Override
            public g0 e(final int n) {
                final g0 l0 = RecyclerView.this.l0(n, true);
                if (l0 == null) {
                    return null;
                }
                if (RecyclerView.this.K.n(l0.itemView)) {
                    return null;
                }
                return l0;
            }
            
            @Override
            public void f(final int n, final int n2) {
                RecyclerView.this.Z0(n, n2, false);
                RecyclerView.this.R0 = true;
            }
            
            @Override
            public void g(final int n, final int n2) {
                RecyclerView.this.X0(n, n2);
                RecyclerView.this.R0 = true;
            }
            
            @Override
            public void h(final int n, final int n2) {
                RecyclerView.this.Z0(n, n2, true);
                final RecyclerView a = RecyclerView.this;
                a.R0 = true;
                final d0 o0 = a.O0;
                o0.d += n2;
            }
            
            void i(final a.b b) {
                final int a = b.a;
                if (a != 1) {
                    if (a != 2) {
                        if (a != 4) {
                            if (a == 8) {
                                final RecyclerView a2 = RecyclerView.this;
                                a2.S.k1(a2, b.b, b.d, 1);
                            }
                        }
                        else {
                            final RecyclerView a3 = RecyclerView.this;
                            a3.S.n1(a3, b.b, b.d, b.c);
                        }
                    }
                    else {
                        final RecyclerView a4 = RecyclerView.this;
                        a4.S.l1(a4, b.b, b.d);
                    }
                }
                else {
                    final RecyclerView a5 = RecyclerView.this;
                    a5.S.i1(a5, b.b, b.d);
                }
            }
        });
    }
    
    void F1(int q1, int s1, @k0 final int[] array) {
        this.P1();
        this.c1();
        androidx.core.os.t.b("RV Scroll");
        this.Z(this.O0);
        if (q1 != 0) {
            q1 = this.S.Q1(q1, this.H, this.O0);
        }
        else {
            q1 = 0;
        }
        if (s1 != 0) {
            s1 = this.S.S1(s1, this.H, this.O0);
        }
        else {
            s1 = 0;
        }
        androidx.core.os.t.d();
        this.y1();
        this.d1();
        this.Q1(false);
        if (array != null) {
            array[0] = q1;
            array[1] = s1;
        }
    }
    
    public void G1(final int n) {
        if (this.h0) {
            return;
        }
        this.R1();
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        s.R1(n);
        this.awakenScrollBars();
    }
    
    void H(final int n, final int n2) {
        this.setMeasuredDimension(p.q(n, this.getPaddingLeft() + this.getPaddingRight(), androidx.core.view.j0.d0((View)this)), p.q(n2, this.getPaddingTop() + this.getPaddingBottom(), androidx.core.view.j0.c0((View)this)));
    }
    
    @b1
    void I0(final StateListDrawable stateListDrawable, final Drawable drawable, final StateListDrawable stateListDrawable2, final Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            final Resources resources = this.getContext().getResources();
            new androidx.recyclerview.widget.m(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.c.h), resources.getDimensionPixelSize(a.c.j), resources.getDimensionPixelOffset(a.c.i));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Trying to set fast scroller without both required drawables.");
        sb.append(this.Y());
        throw new IllegalArgumentException(sb.toString());
    }
    
    @b1
    boolean I1(final g0 g0, final int mPendingAccessibilityState) {
        if (this.N0()) {
            g0.mPendingAccessibilityState = mPendingAccessibilityState;
            this.c1.add(g0);
            return false;
        }
        androidx.core.view.j0.P1(g0.itemView, mPendingAccessibilityState);
        return true;
    }
    
    void J(final View view) {
        final g0 u0 = u0(view);
        this.a1(view);
        final h r = this.R;
        if (r != null && u0 != null) {
            r.onViewAttachedToWindow(u0);
        }
        final List<r> m0 = this.m0;
        if (m0 != null) {
            for (int i = m0.size() - 1; i >= 0; --i) {
                this.m0.get(i).d(view);
            }
        }
    }
    
    void J0() {
        this.v0 = null;
        this.t0 = null;
        this.u0 = null;
        this.s0 = null;
    }
    
    boolean J1(final AccessibilityEvent accessibilityEvent) {
        final boolean n0 = this.N0();
        final int n2 = 0;
        if (n0) {
            int d;
            if (accessibilityEvent != null) {
                d = b.d(accessibilityEvent);
            }
            else {
                d = 0;
            }
            if (d == 0) {
                d = n2;
            }
            this.j0 |= d;
            return true;
        }
        return false;
    }
    
    void K(final View view) {
        final g0 u0 = u0(view);
        this.b1(view);
        final h r = this.R;
        if (r != null && u0 != null) {
            r.onViewDetachedFromWindow(u0);
        }
        final List<r> m0 = this.m0;
        if (m0 != null) {
            for (int i = m0.size() - 1; i >= 0; --i) {
                this.m0.get(i).b(view);
            }
        }
    }
    
    public void K0() {
        if (this.V.size() == 0) {
            return;
        }
        final p s = this.S;
        if (s != null) {
            s.i("Cannot invalidate item decorations during a scroll or layout");
        }
        this.R0();
        this.requestLayout();
    }
    
    public void K1(@n0 final int n, @n0 final int n2) {
        this.L1(n, n2, null);
    }
    
    boolean L0() {
        final AccessibilityManager l0 = this.l0;
        return l0 != null && l0.isEnabled();
    }
    
    public void L1(@n0 final int n, @n0 final int n2, @k0 final Interpolator interpolator) {
        this.M1(n, n2, interpolator, Integer.MIN_VALUE);
    }
    
    void M() {
        if (this.R == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.S == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        this.O0.j = false;
        final boolean b = this.e1 && (this.f1 != this.getWidth() || this.g1 != this.getHeight());
        this.f1 = 0;
        this.g1 = 0;
        this.e1 = false;
        Label_0176: {
            if (this.O0.e == 1) {
                this.N();
            }
            else if (!this.J.r() && !b && this.S.z0() == this.getWidth()) {
                if (this.S.e0() == this.getHeight()) {
                    this.S.U1(this);
                    break Label_0176;
                }
            }
            this.S.U1(this);
            this.O();
        }
        this.P();
    }
    
    public boolean M0() {
        final m w0 = this.w0;
        return w0 != null && w0.q();
    }
    
    public void M1(@n0 final int n, @n0 final int n2, @k0 final Interpolator interpolator, final int n3) {
        this.N1(n, n2, interpolator, n3, false);
    }
    
    public boolean N0() {
        return this.p0 > 0;
    }
    
    void N1(@n0 int n, @n0 int n2, @k0 final Interpolator interpolator, final int n3, final boolean b) {
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.h0) {
            return;
        }
        final boolean n4 = s.n();
        final int n5 = 0;
        int n6 = n;
        if (!n4) {
            n6 = 0;
        }
        if (!this.S.o()) {
            n2 = 0;
        }
        if (n6 != 0 || n2 != 0) {
            if (n3 != Integer.MIN_VALUE && n3 <= 0) {
                n = 0;
            }
            else {
                n = 1;
            }
            if (n != 0) {
                if (b) {
                    n = n5;
                    if (n6 != 0) {
                        n = 1;
                    }
                    int n7 = n;
                    if (n2 != 0) {
                        n7 = (n | 0x2);
                    }
                    this.f(n7, 1);
                }
                this.L0.e(n6, n2, n3, interpolator);
            }
            else {
                this.scrollBy(n6, n2);
            }
        }
    }
    
    @Deprecated
    public boolean O0() {
        return this.isLayoutSuppressed();
    }
    
    public void O1(final int n) {
        if (this.h0) {
            return;
        }
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        s.f2(this, this.O0, n);
    }
    
    void P1() {
        final int f0 = this.f0 + 1;
        this.f0 = f0;
        if (f0 == 1 && !this.h0) {
            this.g0 = false;
        }
    }
    
    void Q(final int n) {
        final p s = this.S;
        if (s != null) {
            s.v1(n);
        }
        this.g1(n);
        final u p = this.P0;
        if (p != null) {
            p.a(this, n);
        }
        final List<u> q0 = this.Q0;
        if (q0 != null) {
            for (int i = q0.size() - 1; i >= 0; --i) {
                this.Q0.get(i).a(this, n);
            }
        }
    }
    
    void Q0(final int n) {
        if (this.S == null) {
            return;
        }
        this.setScrollState(2);
        this.S.R1(n);
        this.awakenScrollBars();
    }
    
    void Q1(final boolean b) {
        if (this.f0 < 1) {
            this.f0 = 1;
        }
        if (!b && !this.h0) {
            this.g0 = false;
        }
        if (this.f0 == 1) {
            if (b && this.g0 && !this.h0 && this.S != null && this.R != null) {
                this.M();
            }
            if (!this.h0) {
                this.g0 = false;
            }
        }
        --this.f0;
    }
    
    void R(final int n, final int n2) {
        ++this.q0;
        final int scrollX = this.getScrollX();
        final int scrollY = this.getScrollY();
        this.onScrollChanged(scrollX, scrollY, scrollX - n, scrollY - n2);
        this.h1(n, n2);
        final u p2 = this.P0;
        if (p2 != null) {
            p2.b(this, n, n2);
        }
        final List<u> q0 = this.Q0;
        if (q0 != null) {
            for (int i = q0.size() - 1; i >= 0; --i) {
                this.Q0.get(i).b(this, n, n2);
            }
        }
        --this.q0;
    }
    
    void R0() {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            ((q)this.K.i(i).getLayoutParams()).c = true;
        }
        this.H.t();
    }
    
    public void R1() {
        this.setScrollState(0);
        this.S1();
    }
    
    void S() {
        for (int i = this.c1.size() - 1; i >= 0; --i) {
            final g0 g0 = this.c1.get(i);
            if (g0.itemView.getParent() == this) {
                if (!g0.shouldIgnore()) {
                    final int mPendingAccessibilityState = g0.mPendingAccessibilityState;
                    if (mPendingAccessibilityState != -1) {
                        androidx.core.view.j0.P1(g0.itemView, mPendingAccessibilityState);
                        g0.mPendingAccessibilityState = -1;
                    }
                }
            }
        }
        this.c1.clear();
    }
    
    void S0() {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (u0 != null && !u0.shouldIgnore()) {
                u0.addFlags(6);
            }
        }
        this.R0();
        this.H.u();
    }
    
    public void T0(final int n, final int n2) {
        this.U0(n, n2, null, 1);
    }
    
    public void T1(@k0 final h h, final boolean b) {
        this.setLayoutFrozen(false);
        this.H1(h, true, b);
        this.l1(true);
        this.requestLayout();
    }
    
    void U() {
        if (this.v0 != null) {
            return;
        }
        final EdgeEffect a = this.r0.a(this, 3);
        this.v0 = a;
        int measuredWidth;
        int measuredHeight;
        if (this.M) {
            measuredWidth = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
            measuredHeight = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        }
        else {
            measuredWidth = this.getMeasuredWidth();
            measuredHeight = this.getMeasuredHeight();
        }
        a.setSize(measuredWidth, measuredHeight);
    }
    
    void U1(final int n, final int n2, final Object o) {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final View k = this.K.i(i);
            final g0 u0 = u0(k);
            if (u0 != null) {
                if (!u0.shouldIgnore()) {
                    final int mPosition = u0.mPosition;
                    if (mPosition >= n && mPosition < n + n2) {
                        u0.addFlags(2);
                        u0.addChangePayload(o);
                        ((q)k.getLayoutParams()).c = true;
                    }
                }
            }
        }
        this.H.N(n, n2);
    }
    
    void V() {
        if (this.s0 != null) {
            return;
        }
        final EdgeEffect a = this.r0.a(this, 0);
        this.s0 = a;
        int measuredHeight;
        int measuredWidth;
        if (this.M) {
            measuredHeight = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
            measuredWidth = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
        }
        else {
            measuredHeight = this.getMeasuredHeight();
            measuredWidth = this.getMeasuredWidth();
        }
        a.setSize(measuredHeight, measuredWidth);
    }
    
    public void V0(@n0 final int n) {
        for (int g = this.K.g(), i = 0; i < g; ++i) {
            this.K.f(i).offsetLeftAndRight(n);
        }
    }
    
    void W() {
        if (this.u0 != null) {
            return;
        }
        final EdgeEffect a = this.r0.a(this, 2);
        this.u0 = a;
        int measuredHeight;
        int measuredWidth;
        if (this.M) {
            measuredHeight = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
            measuredWidth = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
        }
        else {
            measuredHeight = this.getMeasuredHeight();
            measuredWidth = this.getMeasuredWidth();
        }
        a.setSize(measuredHeight, measuredWidth);
    }
    
    public void W0(@n0 final int n) {
        for (int g = this.K.g(), i = 0; i < g; ++i) {
            this.K.f(i).offsetTopAndBottom(n);
        }
    }
    
    void X() {
        if (this.t0 != null) {
            return;
        }
        final EdgeEffect a = this.r0.a(this, 1);
        this.t0 = a;
        int measuredWidth;
        int measuredHeight;
        if (this.M) {
            measuredWidth = this.getMeasuredWidth() - this.getPaddingLeft() - this.getPaddingRight();
            measuredHeight = this.getMeasuredHeight() - this.getPaddingTop() - this.getPaddingBottom();
        }
        else {
            measuredWidth = this.getMeasuredWidth();
            measuredHeight = this.getMeasuredHeight();
        }
        a.setSize(measuredWidth, measuredHeight);
    }
    
    void X0(final int n, final int n2) {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (u0 != null && !u0.shouldIgnore() && u0.mPosition >= n) {
                u0.offsetPosition(n2, false);
                this.O0.g = true;
            }
        }
        this.H.v(n, n2);
        this.requestLayout();
    }
    
    String Y() {
        final StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.R);
        sb.append(", layout:");
        sb.append(this.S);
        sb.append(", context:");
        sb.append(this.getContext());
        return sb.toString();
    }
    
    void Y0(final int n, final int n2) {
        final int j = this.K.j();
        int n3;
        int n4;
        int n5;
        if (n < n2) {
            n3 = -1;
            n4 = n;
            n5 = n2;
        }
        else {
            n5 = n;
            n4 = n2;
            n3 = 1;
        }
        for (int i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (u0 != null) {
                final int mPosition = u0.mPosition;
                if (mPosition >= n4) {
                    if (mPosition <= n5) {
                        if (mPosition == n) {
                            u0.offsetPosition(n2 - n, false);
                        }
                        else {
                            u0.offsetPosition(n3, false);
                        }
                        this.O0.g = true;
                    }
                }
            }
        }
        this.H.w(n, n2);
        this.requestLayout();
    }
    
    final void Z(final d0 d0) {
        if (this.getScrollState() == 2) {
            final OverScroller i = this.L0.I;
            d0.p = i.getFinalX() - i.getCurrX();
            d0.q = i.getFinalY() - i.getCurrY();
        }
        else {
            d0.p = 0;
            d0.q = 0;
        }
    }
    
    void Z0(final int n, final int n2, final boolean b) {
        for (int j = this.K.j(), i = 0; i < j; ++i) {
            final g0 u0 = u0(this.K.i(i));
            if (u0 != null && !u0.shouldIgnore()) {
                final int mPosition = u0.mPosition;
                if (mPosition >= n + n2) {
                    u0.offsetPosition(-n2, b);
                }
                else {
                    if (mPosition < n) {
                        continue;
                    }
                    u0.flagRemovedAndOffsetPosition(n - 1, -n2, b);
                }
                this.O0.g = true;
            }
        }
        this.H.x(n, n2, b);
        this.requestLayout();
    }
    
    public boolean a(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5) {
        return this.getScrollingChildHelper().g(n, n2, n3, n4, array, n5);
    }
    
    @k0
    public View a0(final float n, final float n2) {
        for (int i = this.K.g() - 1; i >= 0; --i) {
            final View f = this.K.f(i);
            final float translationX = f.getTranslationX();
            final float translationY = f.getTranslationY();
            if (n >= f.getLeft() + translationX && n <= f.getRight() + translationX && n2 >= f.getTop() + translationY && n2 <= f.getBottom() + translationY) {
                return f;
            }
        }
        return null;
    }
    
    public void a1(@j0 final View view) {
    }
    
    public void addFocusables(final ArrayList<View> list, final int n, final int n2) {
        final p s = this.S;
        if (s == null || !s.W0(this, list, n, n2)) {
            super.addFocusables((ArrayList)list, n, n2);
        }
    }
    
    public boolean b(final int n, final int n2, final int[] array, final int[] array2, final int n3) {
        return this.getScrollingChildHelper().d(n, n2, array, array2, n3);
    }
    
    @k0
    public View b0(@j0 View view) {
        ViewParent parent;
        while (true) {
            parent = view.getParent();
            if (parent == null || parent == this || !(parent instanceof View)) {
                break;
            }
            view = (View)parent;
        }
        if (parent != this) {
            view = null;
        }
        return view;
    }
    
    public void b1(@j0 final View view) {
    }
    
    public final void c(final int n, final int n2, final int n3, final int n4, final int[] array, final int n5, @j0 final int[] array2) {
        this.getScrollingChildHelper().e(n, n2, n3, n4, array, n5, array2);
    }
    
    @k0
    public g0 c0(@j0 View b0) {
        b0 = this.b0(b0);
        g0 t0;
        if (b0 == null) {
            t0 = null;
        }
        else {
            t0 = this.t0(b0);
        }
        return t0;
    }
    
    void c1() {
        ++this.p0;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof q && this.S.p((q)viewGroup$LayoutParams);
    }
    
    public int computeHorizontalScrollExtent() {
        final p s = this.S;
        int t = 0;
        if (s == null) {
            return 0;
        }
        if (s.n()) {
            t = this.S.t(this.O0);
        }
        return t;
    }
    
    public int computeHorizontalScrollOffset() {
        final p s = this.S;
        int u = 0;
        if (s == null) {
            return 0;
        }
        if (s.n()) {
            u = this.S.u(this.O0);
        }
        return u;
    }
    
    public int computeHorizontalScrollRange() {
        final p s = this.S;
        int v = 0;
        if (s == null) {
            return 0;
        }
        if (s.n()) {
            v = this.S.v(this.O0);
        }
        return v;
    }
    
    public int computeVerticalScrollExtent() {
        final p s = this.S;
        int w = 0;
        if (s == null) {
            return 0;
        }
        if (s.o()) {
            w = this.S.w(this.O0);
        }
        return w;
    }
    
    public int computeVerticalScrollOffset() {
        final p s = this.S;
        int x = 0;
        if (s == null) {
            return 0;
        }
        if (s.o()) {
            x = this.S.x(this.O0);
        }
        return x;
    }
    
    public int computeVerticalScrollRange() {
        final p s = this.S;
        int y = 0;
        if (s == null) {
            return 0;
        }
        if (s.o()) {
            y = this.S.y(this.O0);
        }
        return y;
    }
    
    public boolean d(final int n) {
        return this.getScrollingChildHelper().l(n);
    }
    
    void d1() {
        this.e1(true);
    }
    
    public boolean dispatchNestedFling(final float n, final float n2, final boolean b) {
        return this.getScrollingChildHelper().a(n, n2, b);
    }
    
    public boolean dispatchNestedPreFling(final float n, final float n2) {
        return this.getScrollingChildHelper().b(n, n2);
    }
    
    public boolean dispatchNestedPreScroll(final int n, final int n2, final int[] array, final int[] array2) {
        return this.getScrollingChildHelper().c(n, n2, array, array2);
    }
    
    public boolean dispatchNestedScroll(final int n, final int n2, final int n3, final int n4, final int[] array) {
        return this.getScrollingChildHelper().f(n, n2, n3, n4, array);
    }
    
    public boolean dispatchPopulateAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        this.onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }
    
    protected void dispatchRestoreInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchThawSelfOnly((SparseArray)sparseArray);
    }
    
    protected void dispatchSaveInstanceState(final SparseArray<Parcelable> sparseArray) {
        this.dispatchFreezeSelfOnly((SparseArray)sparseArray);
    }
    
    public void draw(final Canvas canvas) {
        super.draw(canvas);
        final int size = this.V.size();
        final int n = false ? 1 : 0;
        for (int i = 0; i < size; ++i) {
            this.V.get(i).k(canvas, this, this.O0);
        }
        final EdgeEffect s0 = this.s0;
        final int n2 = 1;
        int n3;
        if (s0 != null && !s0.isFinished()) {
            final int save = canvas.save();
            int paddingBottom;
            if (this.M) {
                paddingBottom = this.getPaddingBottom();
            }
            else {
                paddingBottom = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float)(-this.getHeight() + paddingBottom), 0.0f);
            final EdgeEffect s2 = this.s0;
            n3 = ((s2 != null && s2.draw(canvas)) ? 1 : 0);
            canvas.restoreToCount(save);
        }
        else {
            n3 = 0;
        }
        final EdgeEffect t0 = this.t0;
        boolean b = n3 != 0;
        if (t0 != null) {
            b = (n3 != 0);
            if (!t0.isFinished()) {
                final int save2 = canvas.save();
                if (this.M) {
                    canvas.translate((float)this.getPaddingLeft(), (float)this.getPaddingTop());
                }
                final EdgeEffect t2 = this.t0;
                b = ((n3 | ((t2 != null && t2.draw(canvas)) ? 1 : 0)) != 0x0);
                canvas.restoreToCount(save2);
            }
        }
        final EdgeEffect u0 = this.u0;
        boolean b2 = b;
        if (u0 != null) {
            b2 = b;
            if (!u0.isFinished()) {
                final int save3 = canvas.save();
                final int width = this.getWidth();
                int paddingTop;
                if (this.M) {
                    paddingTop = this.getPaddingTop();
                }
                else {
                    paddingTop = 0;
                }
                canvas.rotate(90.0f);
                canvas.translate((float)paddingTop, (float)(-width));
                final EdgeEffect u2 = this.u0;
                b2 = (b | (u2 != null && u2.draw(canvas)));
                canvas.restoreToCount(save3);
            }
        }
        final EdgeEffect v0 = this.v0;
        int n4 = b2 ? 1 : 0;
        if (v0 != null) {
            n4 = (b2 ? 1 : 0);
            if (!v0.isFinished()) {
                final int save4 = canvas.save();
                canvas.rotate(180.0f);
                float n5;
                int n6;
                if (this.M) {
                    n5 = (float)(-this.getWidth() + this.getPaddingRight());
                    n6 = -this.getHeight() + this.getPaddingBottom();
                }
                else {
                    n5 = (float)(-this.getWidth());
                    n6 = -this.getHeight();
                }
                canvas.translate(n5, (float)n6);
                final EdgeEffect v2 = this.v0;
                int n7 = n;
                if (v2 != null) {
                    n7 = n;
                    if (v2.draw(canvas)) {
                        n7 = 1;
                    }
                }
                n4 = ((b2 ? 1 : 0) | n7);
                canvas.restoreToCount(save4);
            }
        }
        if (n4 == 0 && this.w0 != null && this.V.size() > 0 && this.w0.q()) {
            n4 = n2;
        }
        if (n4 != 0) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public boolean drawChild(final Canvas canvas, final View view, final long n) {
        return super.drawChild(canvas, view, n);
    }
    
    void e1(final boolean b) {
        final int p = this.p0 - 1;
        this.p0 = p;
        if (p < 1) {
            this.p0 = 0;
            if (b) {
                this.L();
                this.S();
            }
        }
    }
    
    public boolean f(final int n, final int n2) {
        return this.getScrollingChildHelper().s(n, n2);
    }
    
    public View focusSearch(final View view, int n) {
        final View h1 = this.S.h1(view, n);
        if (h1 != null) {
            return h1;
        }
        final h r = this.R;
        final int n2 = 1;
        final boolean b = r != null && this.S != null && !this.N0() && !this.h0;
        final FocusFinder instance = FocusFinder.getInstance();
        View view2;
        if (b && (n == 2 || n == 1)) {
            int n4;
            if (this.S.o()) {
                int n3;
                if (n == 2) {
                    n3 = 130;
                }
                else {
                    n3 = 33;
                }
                final boolean b2 = (n4 = ((instance.findNextFocus((ViewGroup)this, view, n3) == null) ? 1 : 0)) != 0;
                if (RecyclerView.q1) {
                    n = n3;
                    n4 = (b2 ? 1 : 0);
                }
            }
            else {
                n4 = 0;
            }
            int n5 = n4;
            int n6 = n;
            if (n4 == 0) {
                n5 = n4;
                n6 = n;
                if (this.S.n()) {
                    int n7;
                    if (this.S.i0() == 1 ^ n == 2) {
                        n7 = 66;
                    }
                    else {
                        n7 = 17;
                    }
                    int n8;
                    if (instance.findNextFocus((ViewGroup)this, view, n7) == null) {
                        n8 = n2;
                    }
                    else {
                        n8 = 0;
                    }
                    if (RecyclerView.q1) {
                        n = n7;
                    }
                    n5 = n8;
                    n6 = n;
                }
            }
            if (n5 != 0) {
                this.F();
                if (this.b0(view) == null) {
                    return null;
                }
                this.P1();
                this.S.a1(view, n6, this.H, this.O0);
                this.Q1(false);
            }
            view2 = instance.findNextFocus((ViewGroup)this, view, n6);
            n = n6;
        }
        else {
            view2 = instance.findNextFocus((ViewGroup)this, view, n);
            if (view2 == null && b) {
                this.F();
                if (this.b0(view) == null) {
                    return null;
                }
                this.P1();
                view2 = this.S.a1(view, n, this.H, this.O0);
                this.Q1(false);
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!this.P0(view, view2, n)) {
                view2 = super.focusSearch(view, n);
            }
            return view2;
        }
        if (this.getFocusedChild() == null) {
            return super.focusSearch(view, n);
        }
        this.z1(view2, null);
        return view;
    }
    
    public void g(final int n) {
        this.getScrollingChildHelper().u(n);
    }
    
    public void g1(final int n) {
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        final p s = this.S;
        if (s != null) {
            return (ViewGroup$LayoutParams)s.K();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.Y());
        throw new IllegalStateException(sb.toString());
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        final p s = this.S;
        if (s != null) {
            return (ViewGroup$LayoutParams)s.L(this.getContext(), set);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.Y());
        throw new IllegalStateException(sb.toString());
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        final p s = this.S;
        if (s != null) {
            return (ViewGroup$LayoutParams)s.M(viewGroup$LayoutParams);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(this.Y());
        throw new IllegalStateException(sb.toString());
    }
    
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }
    
    @k0
    public h getAdapter() {
        return this.R;
    }
    
    public int getBaseline() {
        final p s = this.S;
        if (s != null) {
            return s.N();
        }
        return super.getBaseline();
    }
    
    protected int getChildDrawingOrder(final int n, final int n2) {
        final k w0 = this.W0;
        if (w0 == null) {
            return super.getChildDrawingOrder(n, n2);
        }
        return w0.a(n, n2);
    }
    
    public boolean getClipToPadding() {
        return this.M;
    }
    
    @k0
    public androidx.recyclerview.widget.b0 getCompatAccessibilityDelegate() {
        return this.V0;
    }
    
    @j0
    public l getEdgeEffectFactory() {
        return this.r0;
    }
    
    @k0
    public m getItemAnimator() {
        return this.w0;
    }
    
    public int getItemDecorationCount() {
        return this.V.size();
    }
    
    @k0
    public p getLayoutManager() {
        return this.S;
    }
    
    public int getMaxFlingVelocity() {
        return this.H0;
    }
    
    public int getMinFlingVelocity() {
        return this.G0;
    }
    
    long getNanoTime() {
        if (RecyclerView.p1) {
            return System.nanoTime();
        }
        return 0L;
    }
    
    @k0
    public s getOnFlingListener() {
        return this.F0;
    }
    
    public boolean getPreserveFocusAfterLayout() {
        return this.K0;
    }
    
    @j0
    public w getRecycledViewPool() {
        return this.H.j();
    }
    
    public int getScrollState() {
        return this.x0;
    }
    
    void h(final int n, final int n2) {
        if (n < 0) {
            this.V();
            if (this.s0.isFinished()) {
                this.s0.onAbsorb(-n);
            }
        }
        else if (n > 0) {
            this.W();
            if (this.u0.isFinished()) {
                this.u0.onAbsorb(n);
            }
        }
        if (n2 < 0) {
            this.X();
            if (this.t0.isFinished()) {
                this.t0.onAbsorb(-n2);
            }
        }
        else if (n2 > 0) {
            this.U();
            if (this.v0.isFinished()) {
                this.v0.onAbsorb(n2);
            }
        }
        if (n != 0 || n2 != 0) {
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    @k0
    public g0 h0(final int n) {
        final boolean n2 = this.n0;
        g0 g0 = null;
        if (n2) {
            return null;
        }
        g0 g2;
        for (int j = this.K.j(), i = 0; i < j; ++i, g0 = g2) {
            final g0 u0 = u0(this.K.i(i));
            g2 = g0;
            if (u0 != null) {
                g2 = g0;
                if (!u0.isRemoved()) {
                    g2 = g0;
                    if (this.n0(u0) == n) {
                        if (!this.K.n(u0.itemView)) {
                            return u0;
                        }
                        g2 = u0;
                    }
                }
            }
        }
        return g0;
    }
    
    public void h1(@n0 final int n, @n0 final int n2) {
    }
    
    public boolean hasNestedScrollingParent() {
        return this.getScrollingChildHelper().k();
    }
    
    public g0 i0(final long n) {
        final h r = this.R;
        final g0 g0 = null;
        g0 g2 = null;
        g0 g3 = g0;
        if (r != null) {
            if (!r.hasStableIds()) {
                g3 = g0;
            }
            else {
                final int j = this.K.j();
                int n2 = 0;
                while (true) {
                    g3 = g2;
                    if (n2 >= j) {
                        break;
                    }
                    final g0 u0 = u0(this.K.i(n2));
                    g0 g4 = g2;
                    if (u0 != null) {
                        g4 = g2;
                        if (!u0.isRemoved()) {
                            g4 = g2;
                            if (u0.getItemId() == n) {
                                if (!this.K.n(u0.itemView)) {
                                    return u0;
                                }
                                g4 = u0;
                            }
                        }
                    }
                    ++n2;
                    g2 = g4;
                }
            }
        }
        return g3;
    }
    
    void i1() {
        if (!this.U0 && this.b0) {
            androidx.core.view.j0.n1((View)this, this.d1);
            this.U0 = true;
        }
    }
    
    public boolean isAttachedToWindow() {
        return this.b0;
    }
    
    public final boolean isLayoutSuppressed() {
        return this.h0;
    }
    
    public boolean isNestedScrollingEnabled() {
        return this.getScrollingChildHelper().m();
    }
    
    @k0
    public g0 j0(final int n) {
        return this.l0(n, false);
    }
    
    @Deprecated
    @k0
    public g0 k0(final int n) {
        return this.l0(n, false);
    }
    
    @k0
    g0 l0(final int n, final boolean b) {
        final int j = this.K.j();
        g0 g0 = null;
        g0 g2;
        for (int i = 0; i < j; ++i, g0 = g2) {
            final g0 u0 = u0(this.K.i(i));
            g2 = g0;
            if (u0 != null) {
                g2 = g0;
                if (!u0.isRemoved()) {
                    if (b) {
                        if (u0.mPosition != n) {
                            g2 = g0;
                            continue;
                        }
                    }
                    else if (u0.getLayoutPosition() != n) {
                        g2 = g0;
                        continue;
                    }
                    if (!this.K.n(u0.itemView)) {
                        return u0;
                    }
                    g2 = u0;
                }
            }
        }
        return g0;
    }
    
    void l1(final boolean b) {
        this.o0 |= b;
        this.n0 = true;
        this.S0();
    }
    
    public boolean m0(int max, int n) {
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.h0) {
            return false;
        }
        final int n2 = s.n() ? 1 : 0;
        final boolean o = this.S.o();
        int a = 0;
        Label_0066: {
            if (n2 != 0) {
                a = max;
                if (Math.abs(max) >= this.G0) {
                    break Label_0066;
                }
            }
            a = 0;
        }
        Label_0086: {
            if (o) {
                max = n;
                if (Math.abs(n) >= this.G0) {
                    break Label_0086;
                }
            }
            max = 0;
        }
        if (a == 0 && max == 0) {
            return false;
        }
        final float n3 = (float)a;
        final float n4 = (float)max;
        if (!this.dispatchNestedPreFling(n3, n4)) {
            final boolean b = n2 != 0 || o;
            this.dispatchNestedFling(n3, n4, b);
            final s f0 = this.F0;
            if (f0 != null && f0.a(a, max)) {
                return true;
            }
            if (b) {
                n = n2;
                if (o) {
                    n = (n2 | 0x2);
                }
                this.f(n, 1);
                n = this.H0;
                n = Math.max(-n, Math.min(a, n));
                final int h0 = this.H0;
                max = Math.max(-h0, Math.min(max, h0));
                this.L0.b(n, max);
                return true;
            }
        }
        return false;
    }
    
    public void n(@j0 final o o) {
        this.o(o, -1);
    }
    
    int n0(final g0 g0) {
        if (!g0.hasAnyOfTheFlags(524) && g0.isBound()) {
            return this.J.f(g0.mPosition);
        }
        return -1;
    }
    
    void n1(final g0 g0, final m.d d) {
        g0.setFlags(0, 8192);
        if (this.O0.i && g0.isUpdated() && !g0.isRemoved() && !g0.shouldIgnore()) {
            this.L.c(this.o0(g0), g0);
        }
        this.L.e(g0, d);
    }
    
    public void o(@j0 final o o, final int index) {
        final p s = this.S;
        if (s != null) {
            s.i("Cannot add item decoration during a scroll  or layout");
        }
        if (this.V.isEmpty()) {
            this.setWillNotDraw(false);
        }
        if (index < 0) {
            this.V.add(o);
        }
        else {
            this.V.add(index, o);
        }
        this.R0();
        this.requestLayout();
    }
    
    long o0(final g0 g0) {
        long itemId;
        if (this.R.hasStableIds()) {
            itemId = g0.getItemId();
        }
        else {
            itemId = g0.mPosition;
        }
        return itemId;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.p0 = 0;
        boolean e0 = true;
        this.b0 = true;
        if (!this.e0 || this.isLayoutRequested()) {
            e0 = false;
        }
        this.e0 = e0;
        final p s = this.S;
        if (s != null) {
            s.F(this);
        }
        this.U0 = false;
        if (RecyclerView.p1) {
            final ThreadLocal<androidx.recyclerview.widget.n> k = androidx.recyclerview.widget.n.K;
            if ((this.M0 = k.get()) == null) {
                this.M0 = new androidx.recyclerview.widget.n();
                final Display o = androidx.core.view.j0.O((View)this);
                float n2;
                final float n = n2 = 60.0f;
                if (!this.isInEditMode()) {
                    n2 = n;
                    if (o != null) {
                        final float refreshRate = o.getRefreshRate();
                        n2 = n;
                        if (refreshRate >= 30.0f) {
                            n2 = refreshRate;
                        }
                    }
                }
                final androidx.recyclerview.widget.n m0 = this.M0;
                m0.I = (long)(1.0E9f / n2);
                k.set(m0);
            }
            this.M0.a(this);
        }
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final m w0 = this.w0;
        if (w0 != null) {
            w0.l();
        }
        this.R1();
        this.b0 = false;
        final p s = this.S;
        if (s != null) {
            s.G(this, this.H);
        }
        this.c1.clear();
        this.removeCallbacks(this.d1);
        this.L.j();
        if (RecyclerView.p1) {
            final androidx.recyclerview.widget.n m0 = this.M0;
            if (m0 != null) {
                m0.j(this);
                this.M0 = null;
            }
        }
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int size = this.V.size(), i = 0; i < size; ++i) {
            this.V.get(i).i(canvas, this, this.O0);
        }
    }
    
    public boolean onGenericMotionEvent(final MotionEvent motionEvent) {
        if (this.S == null) {
            return false;
        }
        if (this.h0) {
            return false;
        }
        if (motionEvent.getAction() == 8) {
            float n2 = 0.0f;
            float axisValue2 = 0.0f;
            Label_0140: {
                Label_0138: {
                    if ((motionEvent.getSource() & 0x2) != 0x0) {
                        float n;
                        if (this.S.o()) {
                            n = -motionEvent.getAxisValue(9);
                        }
                        else {
                            n = 0.0f;
                        }
                        n2 = n;
                        if (this.S.n()) {
                            final float axisValue = motionEvent.getAxisValue(10);
                            n2 = n;
                            axisValue2 = axisValue;
                            break Label_0140;
                        }
                    }
                    else {
                        if ((motionEvent.getSource() & 0x400000) != 0x0) {
                            axisValue2 = motionEvent.getAxisValue(26);
                            if (this.S.o()) {
                                n2 = -axisValue2;
                                break Label_0138;
                            }
                            if (this.S.n()) {
                                n2 = 0.0f;
                                break Label_0140;
                            }
                        }
                        n2 = 0.0f;
                    }
                }
                axisValue2 = 0.0f;
            }
            if (n2 != 0.0f || axisValue2 != 0.0f) {
                this.U0((int)(axisValue2 * this.I0), (int)(n2 * this.J0), motionEvent, 1);
            }
        }
        return false;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final boolean h0 = this.h0;
        boolean b = false;
        if (h0) {
            return false;
        }
        this.a0 = null;
        if (this.d0(motionEvent)) {
            this.z();
            return true;
        }
        final p s = this.S;
        if (s == null) {
            return false;
        }
        final int n = s.n() ? 1 : 0;
        final boolean o = this.S.o();
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        this.z0.addMovement(motionEvent);
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                this.f1(motionEvent);
                            }
                        }
                        else {
                            this.y0 = motionEvent.getPointerId(actionIndex);
                            final int n2 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                            this.C0 = n2;
                            this.A0 = n2;
                            final int n3 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                            this.D0 = n3;
                            this.B0 = n3;
                        }
                    }
                    else {
                        this.z();
                    }
                }
                else {
                    final int pointerIndex = motionEvent.findPointerIndex(this.y0);
                    if (pointerIndex < 0) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Error processing scroll; pointer index for id ");
                        sb.append(this.y0);
                        sb.append(" not found. Did any MotionEvents get skipped?");
                        Log.e("RecyclerView", sb.toString());
                        return false;
                    }
                    final int c0 = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                    final int d0 = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                    if (this.x0 != 1) {
                        final int a0 = this.A0;
                        final int b2 = this.B0;
                        boolean b3;
                        if (n != 0 && Math.abs(c0 - a0) > this.E0) {
                            this.C0 = c0;
                            b3 = true;
                        }
                        else {
                            b3 = false;
                        }
                        boolean b4 = b3;
                        if (o) {
                            b4 = b3;
                            if (Math.abs(d0 - b2) > this.E0) {
                                this.D0 = d0;
                                b4 = true;
                            }
                        }
                        if (b4) {
                            this.setScrollState(1);
                        }
                    }
                }
            }
            else {
                this.z0.clear();
                this.g(0);
            }
        }
        else {
            if (this.i0) {
                this.i0 = false;
            }
            this.y0 = motionEvent.getPointerId(0);
            final int n4 = (int)(motionEvent.getX() + 0.5f);
            this.C0 = n4;
            this.A0 = n4;
            final int n5 = (int)(motionEvent.getY() + 0.5f);
            this.D0 = n5;
            this.B0 = n5;
            if (this.x0 == 2) {
                this.getParent().requestDisallowInterceptTouchEvent(true);
                this.setScrollState(1);
                this.g(1);
            }
            final int[] a2 = this.a1;
            a2[a2[1] = 0] = 0;
            int n6 = n;
            if (o) {
                n6 = (n | 0x2);
            }
            this.f(n6, 0);
        }
        if (this.x0 == 1) {
            b = true;
        }
        return b;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        androidx.core.os.t.b("RV OnLayout");
        this.M();
        androidx.core.os.t.d();
        this.e0 = true;
    }
    
    protected void onMeasure(final int n, final int n2) {
        final p s = this.S;
        if (s == null) {
            this.H(n, n2);
            return;
        }
        final boolean f0 = s.F0();
        final boolean b = false;
        if (f0) {
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            this.S.q1(this.H, this.O0, n, n2);
            boolean e1 = b;
            if (mode == 1073741824) {
                e1 = b;
                if (mode2 == 1073741824) {
                    e1 = true;
                }
            }
            if ((this.e1 = e1) || this.R == null) {
                return;
            }
            if (this.O0.e == 1) {
                this.N();
            }
            this.S.W1(n, n2);
            this.O0.j = true;
            this.O();
            this.S.Z1(n, n2);
            if (this.S.d2()) {
                this.S.W1(View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 1073741824));
                this.O0.j = true;
                this.O();
                this.S.Z1(n, n2);
            }
            this.f1 = this.getMeasuredWidth();
            this.g1 = this.getMeasuredHeight();
        }
        else {
            if (this.c0) {
                this.S.q1(this.H, this.O0, n, n2);
                return;
            }
            if (this.k0) {
                this.P1();
                this.c1();
                this.k1();
                this.d1();
                final d0 o0 = this.O0;
                if (o0.l) {
                    o0.h = true;
                }
                else {
                    this.J.k();
                    this.O0.h = false;
                }
                this.Q1(this.k0 = false);
            }
            else if (this.O0.l) {
                this.setMeasuredDimension(this.getMeasuredWidth(), this.getMeasuredHeight());
                return;
            }
            final h r = this.R;
            if (r != null) {
                this.O0.f = r.getItemCount();
            }
            else {
                this.O0.f = 0;
            }
            this.P1();
            this.S.q1(this.H, this.O0, n, n2);
            this.Q1(false);
            this.O0.h = false;
        }
    }
    
    protected boolean onRequestFocusInDescendants(final int n, final Rect rect) {
        return !this.N0() && super.onRequestFocusInDescendants(n, rect);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final a0 i = (a0)parcelable;
        this.I = i;
        super.onRestoreInstanceState(i.a());
        this.requestLayout();
    }
    
    protected Parcelable onSaveInstanceState() {
        final a0 a0 = new a0(super.onSaveInstanceState());
        final a0 i = this.I;
        if (i != null) {
            a0.b(i);
        }
        else {
            final p s = this.S;
            Parcelable u1;
            if (s != null) {
                u1 = s.u1();
            }
            else {
                u1 = null;
            }
            a0.I = u1;
        }
        return (Parcelable)a0;
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        if (n != n3 || n2 != n4) {
            this.J0();
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final boolean h0 = this.h0;
        final boolean b = false;
        if (h0 || this.i0) {
            return false;
        }
        if (this.T(motionEvent)) {
            this.z();
            return true;
        }
        final p s = this.S;
        if (s == null) {
            return false;
        }
        final int n = s.n() ? 1 : 0;
        final boolean o = this.S.o();
        if (this.z0 == null) {
            this.z0 = VelocityTracker.obtain();
        }
        final int actionMasked = motionEvent.getActionMasked();
        final int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            final int[] a1 = this.a1;
            a1[a1[1] = 0] = 0;
        }
        final MotionEvent obtain = MotionEvent.obtain(motionEvent);
        final int[] a2 = this.a1;
        obtain.offsetLocation((float)a2[0], (float)a2[1]);
        int n2 = 0;
        Label_1024: {
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                        if (actionMasked != 3) {
                            if (actionMasked != 5) {
                                if (actionMasked != 6) {
                                    n2 = (b ? 1 : 0);
                                }
                                else {
                                    this.f1(motionEvent);
                                    n2 = (b ? 1 : 0);
                                }
                            }
                            else {
                                this.y0 = motionEvent.getPointerId(actionIndex);
                                final int n3 = (int)(motionEvent.getX(actionIndex) + 0.5f);
                                this.C0 = n3;
                                this.A0 = n3;
                                final int n4 = (int)(motionEvent.getY(actionIndex) + 0.5f);
                                this.D0 = n4;
                                this.B0 = n4;
                                n2 = (b ? 1 : 0);
                            }
                        }
                        else {
                            this.z();
                            n2 = (b ? 1 : 0);
                        }
                    }
                    else {
                        final int pointerIndex = motionEvent.findPointerIndex(this.y0);
                        if (pointerIndex < 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Error processing scroll; pointer index for id ");
                            sb.append(this.y0);
                            sb.append(" not found. Did any MotionEvents get skipped?");
                            Log.e("RecyclerView", sb.toString());
                            return false;
                        }
                        final int n5 = (int)(motionEvent.getX(pointerIndex) + 0.5f);
                        final int n6 = (int)(motionEvent.getY(pointerIndex) + 0.5f);
                        final int n7 = this.C0 - n5;
                        final int n8 = this.D0 - n6;
                        int n9 = n7;
                        int n10 = n8;
                        if (this.x0 != 1) {
                            int n11 = n7;
                            int n12 = 0;
                            boolean b2 = false;
                            Label_0453: {
                                if (n != 0) {
                                    final int e0 = this.E0;
                                    if (n7 > 0) {
                                        n12 = Math.max(0, n7 - e0);
                                    }
                                    else {
                                        n12 = Math.min(0, n7 + e0);
                                    }
                                    n11 = n12;
                                    if (n12 != 0) {
                                        b2 = true;
                                        break Label_0453;
                                    }
                                }
                                b2 = false;
                                n12 = n11;
                            }
                            int n13 = n8;
                            boolean b3 = b2;
                            if (o) {
                                final int e2 = this.E0;
                                int n14;
                                if (n8 > 0) {
                                    n14 = Math.max(0, n8 - e2);
                                }
                                else {
                                    n14 = Math.min(0, n8 + e2);
                                }
                                n13 = n14;
                                b3 = b2;
                                if (n14 != 0) {
                                    b3 = true;
                                    n13 = n14;
                                }
                            }
                            n9 = n12;
                            n10 = n13;
                            if (b3) {
                                this.setScrollState(1);
                                n10 = n13;
                                n9 = n12;
                            }
                        }
                        final int n15 = n9;
                        n2 = (b ? 1 : 0);
                        if (this.x0 == 1) {
                            final int[] b4 = this.b1;
                            b4[1] = (b4[0] = 0);
                            int n16;
                            if (n != 0) {
                                n16 = n15;
                            }
                            else {
                                n16 = 0;
                            }
                            int n17;
                            if (o) {
                                n17 = n10;
                            }
                            else {
                                n17 = 0;
                            }
                            int n18 = n15;
                            int n19 = n10;
                            if (this.b(n16, n17, b4, this.Z0, 0)) {
                                final int[] b5 = this.b1;
                                n18 = n15 - b5[0];
                                n19 = n10 - b5[1];
                                final int[] a3 = this.a1;
                                final int n20 = a3[0];
                                final int[] z0 = this.Z0;
                                a3[0] = n20 + z0[0];
                                a3[1] += z0[1];
                                this.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            final int[] z2 = this.Z0;
                            this.C0 = n5 - z2[0];
                            this.D0 = n6 - z2[1];
                            int n21;
                            if (n != 0) {
                                n21 = n18;
                            }
                            else {
                                n21 = 0;
                            }
                            int n22;
                            if (o) {
                                n22 = n19;
                            }
                            else {
                                n22 = 0;
                            }
                            if (this.E1(n21, n22, motionEvent, 0)) {
                                this.getParent().requestDisallowInterceptTouchEvent(true);
                            }
                            final androidx.recyclerview.widget.n m0 = this.M0;
                            n2 = (b ? 1 : 0);
                            if (m0 != null) {
                                if (n18 == 0) {
                                    n2 = (b ? 1 : 0);
                                    if (n19 == 0) {
                                        break Label_1024;
                                    }
                                }
                                m0.f(this, n18, n19);
                                n2 = (b ? 1 : 0);
                            }
                        }
                    }
                }
                else {
                    this.z0.addMovement(obtain);
                    this.z0.computeCurrentVelocity(1000, (float)this.H0);
                    float n23;
                    if (n != 0) {
                        n23 = -this.z0.getXVelocity(this.y0);
                    }
                    else {
                        n23 = 0.0f;
                    }
                    float n24;
                    if (o) {
                        n24 = -this.z0.getYVelocity(this.y0);
                    }
                    else {
                        n24 = 0.0f;
                    }
                    if ((n23 == 0.0f && n24 == 0.0f) || !this.m0((int)n23, (int)n24)) {
                        this.setScrollState(0);
                    }
                    this.B1();
                    n2 = 1;
                }
            }
            else {
                this.y0 = motionEvent.getPointerId(0);
                final int n25 = (int)(motionEvent.getX() + 0.5f);
                this.C0 = n25;
                this.A0 = n25;
                final int n26 = (int)(motionEvent.getY() + 0.5f);
                this.D0 = n26;
                this.B0 = n26;
                int n27 = n;
                if (o) {
                    n27 = (n | 0x2);
                }
                this.f(n27, 0);
                n2 = (b ? 1 : 0);
            }
        }
        if (n2 == 0) {
            this.z0.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }
    
    public void p(@j0 final r r) {
        if (this.m0 == null) {
            this.m0 = new ArrayList<r>();
        }
        this.m0.add(r);
    }
    
    public int p0(@j0 final View view) {
        final g0 u0 = u0(view);
        int absoluteAdapterPosition;
        if (u0 != null) {
            absoluteAdapterPosition = u0.getAbsoluteAdapterPosition();
        }
        else {
            absoluteAdapterPosition = -1;
        }
        return absoluteAdapterPosition;
    }
    
    public void q(@j0 final t e) {
        this.W.add(e);
    }
    
    public long q0(@j0 final View view) {
        final h r = this.R;
        long itemId;
        final long n = itemId = -1L;
        if (r != null) {
            if (!r.hasStableIds()) {
                itemId = n;
            }
            else {
                final g0 u0 = u0(view);
                itemId = n;
                if (u0 != null) {
                    itemId = u0.getItemId();
                }
            }
        }
        return itemId;
    }
    
    void q1() {
        final m w0 = this.w0;
        if (w0 != null) {
            w0.l();
        }
        final p s = this.S;
        if (s != null) {
            s.D1(this.H);
            this.S.E1(this.H);
        }
        this.H.d();
    }
    
    public void r(@j0 final u u) {
        if (this.Q0 == null) {
            this.Q0 = new ArrayList<u>();
        }
        this.Q0.add(u);
    }
    
    public int r0(@j0 final View view) {
        final g0 u0 = u0(view);
        int layoutPosition;
        if (u0 != null) {
            layoutPosition = u0.getLayoutPosition();
        }
        else {
            layoutPosition = -1;
        }
        return layoutPosition;
    }
    
    boolean r1(final View view) {
        this.P1();
        final boolean r = this.K.r(view);
        if (r) {
            final g0 u0 = u0(view);
            this.H.K(u0);
            this.H.D(u0);
        }
        this.Q1(r ^ true);
        return r;
    }
    
    protected void removeDetachedView(final View view, final boolean b) {
        final g0 u0 = u0(view);
        if (u0 != null) {
            if (u0.isTmpDetached()) {
                u0.clearTmpDetachFlag();
            }
            else if (!u0.shouldIgnore()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(u0);
                sb.append(this.Y());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        this.K(view);
        super.removeDetachedView(view, b);
    }
    
    public void requestChildFocus(final View view, final View view2) {
        if (!this.S.s1(this, this.O0, view, view2) && view2 != null) {
            this.z1(view, view2);
        }
        super.requestChildFocus(view, view2);
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        return this.S.L1(this, view, rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        for (int size = this.W.size(), i = 0; i < size; ++i) {
            this.W.get(i).e(b);
        }
        super.requestDisallowInterceptTouchEvent(b);
    }
    
    public void requestLayout() {
        if (this.f0 == 0 && !this.h0) {
            super.requestLayout();
        }
        else {
            this.g0 = true;
        }
    }
    
    public void s(@j0 final y y) {
        androidx.core.util.n.b(y != null, "'listener' arg cannot be null.");
        this.U.add(y);
    }
    
    @Deprecated
    public int s0(@j0 final View view) {
        return this.p0(view);
    }
    
    public void s1(@j0 final o o) {
        final p s = this.S;
        if (s != null) {
            s.i("Cannot remove item decoration during a scroll  or layout");
        }
        this.V.remove(o);
        if (this.V.isEmpty()) {
            this.setWillNotDraw(this.getOverScrollMode() == 2);
        }
        this.R0();
        this.requestLayout();
    }
    
    public void scrollBy(int n, int n2) {
        final p s = this.S;
        if (s == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.h0) {
            return;
        }
        final boolean n3 = s.n();
        final boolean o = this.S.o();
        if (n3 || o) {
            if (!n3) {
                n = 0;
            }
            if (!o) {
                n2 = 0;
            }
            this.E1(n, n2, null, 0);
        }
    }
    
    public void scrollTo(final int n, final int n2) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }
    
    public void sendAccessibilityEventUnchecked(final AccessibilityEvent accessibilityEvent) {
        if (this.J1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }
    
    public void setAccessibilityDelegateCompat(@k0 final androidx.recyclerview.widget.b0 v0) {
        androidx.core.view.j0.z1((View)this, this.V0 = v0);
    }
    
    public void setAdapter(@k0 final h h) {
        this.setLayoutFrozen(false);
        this.H1(h, false, true);
        this.l1(false);
        this.requestLayout();
    }
    
    public void setChildDrawingOrderCallback(@k0 final k w0) {
        if (w0 == this.W0) {
            return;
        }
        this.W0 = w0;
        this.setChildrenDrawingOrderEnabled(w0 != null);
    }
    
    public void setClipToPadding(final boolean m) {
        if (m != this.M) {
            this.J0();
        }
        super.setClipToPadding(this.M = m);
        if (this.e0) {
            this.requestLayout();
        }
    }
    
    public void setEdgeEffectFactory(@j0 final l r0) {
        androidx.core.util.n.g(r0);
        this.r0 = r0;
        this.J0();
    }
    
    public void setHasFixedSize(final boolean c0) {
        this.c0 = c0;
    }
    
    public void setItemAnimator(@k0 final m w0) {
        final m w2 = this.w0;
        if (w2 != null) {
            w2.l();
            this.w0.A(null);
        }
        if ((this.w0 = w0) != null) {
            w0.A(this.T0);
        }
    }
    
    public void setItemViewCacheSize(final int n) {
        this.H.H(n);
    }
    
    @Deprecated
    public void setLayoutFrozen(final boolean b) {
        this.suppressLayout(b);
    }
    
    public void setLayoutManager(@k0 final p p) {
        if (p == this.S) {
            return;
        }
        this.R1();
        if (this.S != null) {
            final m w0 = this.w0;
            if (w0 != null) {
                w0.l();
            }
            this.S.D1(this.H);
            this.S.E1(this.H);
            this.H.d();
            if (this.b0) {
                this.S.G(this, this.H);
            }
            this.S.b2(null);
            this.S = null;
        }
        else {
            this.H.d();
        }
        this.K.o();
        this.S = p;
        if (p != null) {
            if (p.b != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("LayoutManager ");
                sb.append(p);
                sb.append(" is already attached to a RecyclerView:");
                sb.append(p.b.Y());
                throw new IllegalArgumentException(sb.toString());
            }
            p.b2(this);
            if (this.b0) {
                this.S.F(this);
            }
        }
        this.H.L();
        this.requestLayout();
    }
    
    @Deprecated
    public void setLayoutTransition(final LayoutTransition layoutTransition) {
        if (Build$VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                this.suppressLayout(false);
                return;
            }
            if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                this.suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition)null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }
    
    public void setNestedScrollingEnabled(final boolean b) {
        this.getScrollingChildHelper().p(b);
    }
    
    public void setOnFlingListener(@k0 final s f0) {
        this.F0 = f0;
    }
    
    @Deprecated
    public void setOnScrollListener(@k0 final u p) {
        this.P0 = p;
    }
    
    public void setPreserveFocusAfterLayout(final boolean k0) {
        this.K0 = k0;
    }
    
    public void setRecycledViewPool(@k0 final w w) {
        this.H.F(w);
    }
    
    @Deprecated
    public void setRecyclerListener(@k0 final y t) {
        this.T = t;
    }
    
    void setScrollState(final int x0) {
        if (x0 == this.x0) {
            return;
        }
        if ((this.x0 = x0) != 2) {
            this.S1();
        }
        this.Q(x0);
    }
    
    public void setScrollingTouchSlop(int n) {
        final ViewConfiguration value = ViewConfiguration.get(this.getContext());
        Label_0073: {
            if (n != 0) {
                if (n == 1) {
                    n = value.getScaledPagingTouchSlop();
                    break Label_0073;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(n);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            }
            n = value.getScaledTouchSlop();
        }
        this.E0 = n;
    }
    
    public void setViewCacheExtension(@k0 final e0 e0) {
        this.H.G(e0);
    }
    
    public boolean startNestedScroll(final int n) {
        return this.getScrollingChildHelper().r(n);
    }
    
    public void stopNestedScroll() {
        this.getScrollingChildHelper().t();
    }
    
    public final void suppressLayout(final boolean b) {
        if (b != this.h0) {
            this.x("Do not suppressLayout in layout or scroll");
            if (!b) {
                this.h0 = false;
                if (this.g0 && this.S != null && this.R != null) {
                    this.requestLayout();
                }
                this.g0 = false;
            }
            else {
                final long uptimeMillis = SystemClock.uptimeMillis();
                this.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.h0 = true;
                this.i0 = true;
                this.R1();
            }
        }
    }
    
    void t(@j0 final g0 g0, @k0 final m.d d, @j0 final m.d d2) {
        g0.setIsRecyclable(false);
        if (this.w0.a(g0, d, d2)) {
            this.i1();
        }
    }
    
    public g0 t0(@j0 final View obj) {
        final ViewParent parent = obj.getParent();
        if (parent != null && parent != this) {
            final StringBuilder sb = new StringBuilder();
            sb.append("View ");
            sb.append(obj);
            sb.append(" is not a direct child of ");
            sb.append(this);
            throw new IllegalArgumentException(sb.toString());
        }
        return u0(obj);
    }
    
    public void t1(final int i) {
        final int itemDecorationCount = this.getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            this.s1(this.A0(i));
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is an invalid index for size ");
        sb.append(itemDecorationCount);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public void u1(@j0 final r r) {
        final List<r> m0 = this.m0;
        if (m0 == null) {
            return;
        }
        m0.remove(r);
    }
    
    void v(@j0 final g0 g0, @j0 final m.d d, @k0 final m.d d2) {
        this.m(g0);
        g0.setIsRecyclable(false);
        if (this.w0.c(g0, d, d2)) {
            this.i1();
        }
    }
    
    public void v0(@j0 final View view, @j0 final Rect rect) {
        w0(view, rect);
    }
    
    public void v1(@j0 final t o) {
        this.W.remove(o);
        if (this.a0 == o) {
            this.a0 = null;
        }
    }
    
    void w(final String str) {
        if (this.N0()) {
            return;
        }
        if (str == null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot call this method unless RecyclerView is computing a layout or scrolling");
            sb.append(this.Y());
            throw new IllegalStateException(sb.toString());
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(this.Y());
        throw new IllegalStateException(sb2.toString());
    }
    
    public void w1(@j0 final u u) {
        final List<u> q0 = this.Q0;
        if (q0 != null) {
            q0.remove(u);
        }
    }
    
    void x(final String s) {
        if (!this.N0()) {
            if (this.q0 > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(this.Y());
                Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", (Throwable)new IllegalStateException(sb.toString()));
            }
            return;
        }
        if (s == null) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
            sb2.append(this.Y());
            throw new IllegalStateException(sb2.toString());
        }
        throw new IllegalStateException(s);
    }
    
    public void x1(@j0 final y y) {
        this.U.remove(y);
    }
    
    boolean y(final g0 g0) {
        final m w0 = this.w0;
        return w0 == null || w0.g(g0, g0.getUnmodifiedPayloads());
    }
    
    void y1() {
        for (int g = this.K.g(), i = 0; i < g; ++i) {
            final View f = this.K.f(i);
            final g0 t0 = this.t0(f);
            if (t0 != null) {
                final g0 mShadowingHolder = t0.mShadowingHolder;
                if (mShadowingHolder != null) {
                    final View itemView = mShadowingHolder.itemView;
                    final int left = f.getLeft();
                    final int top = f.getTop();
                    if (left != itemView.getLeft() || top != itemView.getTop()) {
                        itemView.layout(left, top, itemView.getWidth() + left, itemView.getHeight() + top);
                    }
                }
            }
        }
    }
    
    Rect z0(final View view) {
        final q q = (q)view.getLayoutParams();
        if (!q.c) {
            return q.b;
        }
        if (this.O0.j() && (q.f() || q.h())) {
            return q.b;
        }
        final Rect b = q.b;
        b.set(0, 0, 0, 0);
        for (int size = this.V.size(), i = 0; i < size; ++i) {
            this.O.set(0, 0, 0, 0);
            this.V.get(i).g(this.O, view, this, this.O0);
            final int left = b.left;
            final Rect o = this.O;
            b.left = left + o.left;
            b.top += o.top;
            b.right += o.right;
            b.bottom += o.bottom;
        }
        q.c = false;
        return b;
    }
    
    @t0({ t0.a.G })
    public static class a0 extends androidx.customview.view.a
    {
        public static final Parcelable$Creator<a0> CREATOR;
        Parcelable I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<a0>() {
                public a0 a(final Parcel parcel) {
                    return new a0(parcel, null);
                }
                
                public a0 b(final Parcel parcel, final ClassLoader classLoader) {
                    return new a0(parcel, classLoader);
                }
                
                public a0[] c(final int n) {
                    return new a0[n];
                }
            };
        }
        
        a0(final Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = p.class.getClassLoader();
            }
            this.I = parcel.readParcelable(classLoader);
        }
        
        a0(final Parcelable parcelable) {
            super(parcelable);
        }
        
        void b(final a0 a0) {
            this.I = a0.I;
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeParcelable(this.I, 0);
        }
    }
    
    public static class b0 implements t
    {
        @Override
        public void a(@j0 final RecyclerView recyclerView, @j0 final MotionEvent motionEvent) {
        }
        
        @Override
        public boolean c(@j0 final RecyclerView recyclerView, @j0 final MotionEvent motionEvent) {
            return false;
        }
        
        @Override
        public void e(final boolean b) {
        }
    }
    
    public abstract static class c0
    {
        private int a;
        private RecyclerView b;
        private p c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g;
        private boolean h;
        
        public c0() {
            this.a = -1;
            this.g = new a(0, 0);
        }
        
        @k0
        public PointF a(final int n) {
            final p e = this.e();
            if (e instanceof b) {
                return ((b)e).a(n);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(b.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }
        
        public View b(final int n) {
            return this.b.S.J(n);
        }
        
        public int c() {
            return this.b.S.Q();
        }
        
        public int d(final View view) {
            return this.b.r0(view);
        }
        
        @k0
        public p e() {
            return this.c;
        }
        
        public int f() {
            return this.a;
        }
        
        @Deprecated
        public void g(final int n) {
            this.b.G1(n);
        }
        
        public boolean h() {
            return this.d;
        }
        
        public boolean i() {
            return this.e;
        }
        
        protected void j(@j0 final PointF pointF) {
            final float x = pointF.x;
            final float y = pointF.y;
            final float n = (float)Math.sqrt(x * x + y * y);
            pointF.x /= n;
            pointF.y /= n;
        }
        
        void k(final int n, final int n2) {
            final RecyclerView b = this.b;
            if (this.a == -1 || b == null) {
                this.s();
            }
            if (this.d && this.f == null && this.c != null) {
                final PointF a = this.a(this.a);
                if (a != null) {
                    final float x = a.x;
                    if (x != 0.0f || a.y != 0.0f) {
                        b.F1((int)Math.signum(x), (int)Math.signum(a.y), null);
                    }
                }
            }
            this.d = false;
            final View f = this.f;
            if (f != null) {
                if (this.d(f) == this.a) {
                    this.p(this.f, b.O0, this.g);
                    this.g.g(b);
                    this.s();
                }
                else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                this.m(n, n2, b.O0, this.g);
                final boolean e = this.g.e();
                this.g.g(b);
                if (e && this.e) {
                    this.d = true;
                    b.L0.d();
                }
            }
        }
        
        protected void l(final View f) {
            if (this.d(f) == this.f()) {
                this.f = f;
            }
        }
        
        protected abstract void m(@n0 final int p0, @n0 final int p1, @j0 final d0 p2, @j0 final a p3);
        
        protected abstract void n();
        
        protected abstract void o();
        
        protected abstract void p(@j0 final View p0, @j0 final d0 p1, @j0 final a p2);
        
        public void q(final int a) {
            this.a = a;
        }
        
        void r(final RecyclerView b, final p c) {
            b.L0.f();
            if (this.h) {
                final StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(this.getClass().getSimpleName());
                sb.append(" was started more than once. Each instance of");
                sb.append(this.getClass().getSimpleName());
                sb.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w("RecyclerView", sb.toString());
            }
            this.b = b;
            this.c = c;
            final int a = this.a;
            if (a != -1) {
                b.O0.a = a;
                this.e = true;
                this.d = true;
                this.f = this.b(this.f());
                this.n();
                this.b.L0.d();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }
        
        protected final void s() {
            if (!this.e) {
                return;
            }
            this.e = false;
            this.o();
            this.b.O0.a = -1;
            this.f = null;
            this.a = -1;
            this.d = false;
            this.c.w1(this);
            this.c = null;
            this.b = null;
        }
        
        public static class a
        {
            public static final int h = Integer.MIN_VALUE;
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;
            
            public a(@n0 final int n, @n0 final int n2) {
                this(n, n2, Integer.MIN_VALUE, null);
            }
            
            public a(@n0 final int n, @n0 final int n2, final int n3) {
                this(n, n2, n3, null);
            }
            
            public a(@n0 final int a, @n0 final int b, final int c, @k0 final Interpolator e) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = a;
                this.b = b;
                this.c = c;
                this.e = e;
            }
            
            private void m() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.c >= 1) {
                    return;
                }
                throw new IllegalStateException("Scroll duration must be a positive number");
            }
            
            public int a() {
                return this.c;
            }
            
            @n0
            public int b() {
                return this.a;
            }
            
            @n0
            public int c() {
                return this.b;
            }
            
            @k0
            public Interpolator d() {
                return this.e;
            }
            
            boolean e() {
                return this.d >= 0;
            }
            
            public void f(final int d) {
                this.d = d;
            }
            
            void g(final RecyclerView recyclerView) {
                final int d = this.d;
                if (d >= 0) {
                    this.d = -1;
                    recyclerView.Q0(d);
                    this.f = false;
                    return;
                }
                if (this.f) {
                    this.m();
                    recyclerView.L0.e(this.a, this.b, this.c, this.e);
                    if (++this.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                }
                else {
                    this.g = 0;
                }
            }
            
            public void h(final int c) {
                this.f = true;
                this.c = c;
            }
            
            public void i(@n0 final int a) {
                this.f = true;
                this.a = a;
            }
            
            public void j(@n0 final int b) {
                this.f = true;
                this.b = b;
            }
            
            public void k(@k0 final Interpolator e) {
                this.f = true;
                this.e = e;
            }
            
            public void l(@n0 final int a, @n0 final int b, final int c, @k0 final Interpolator e) {
                this.a = a;
                this.b = b;
                this.c = c;
                this.e = e;
                this.f = true;
            }
        }
        
        public interface b
        {
            @k0
            PointF a(final int p0);
        }
    }
    
    public static class d0
    {
        static final int r = 1;
        static final int s = 2;
        static final int t = 4;
        int a;
        private SparseArray<Object> b;
        int c;
        int d;
        int e;
        int f;
        boolean g;
        boolean h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        int m;
        long n;
        int o;
        int p;
        int q;
        
        public d0() {
            this.a = -1;
            this.c = 0;
            this.d = 0;
            this.e = 1;
            this.f = 0;
            this.g = false;
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = false;
            this.l = false;
        }
        
        void a(final int i) {
            if ((this.e & i) != 0x0) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Layout state should be one of ");
            sb.append(Integer.toBinaryString(i));
            sb.append(" but it is ");
            sb.append(Integer.toBinaryString(this.e));
            throw new IllegalStateException(sb.toString());
        }
        
        public boolean b() {
            return this.g;
        }
        
        public <T> T c(final int n) {
            final SparseArray<Object> b = this.b;
            if (b == null) {
                return null;
            }
            return (T)b.get(n);
        }
        
        public int d() {
            int f;
            if (this.h) {
                f = this.c - this.d;
            }
            else {
                f = this.f;
            }
            return f;
        }
        
        public int e() {
            return this.p;
        }
        
        public int f() {
            return this.q;
        }
        
        public int g() {
            return this.a;
        }
        
        public boolean h() {
            return this.a != -1;
        }
        
        public boolean i() {
            return this.j;
        }
        
        public boolean j() {
            return this.h;
        }
        
        void k(final h h) {
            this.e = 1;
            this.f = h.getItemCount();
            this.h = false;
            this.i = false;
            this.j = false;
        }
        
        public void l(final int n, final Object o) {
            if (this.b == null) {
                this.b = (SparseArray<Object>)new SparseArray();
            }
            this.b.put(n, o);
        }
        
        public void m(final int n) {
            final SparseArray<Object> b = this.b;
            if (b == null) {
                return;
            }
            b.remove(n);
        }
        
        public boolean n() {
            return this.l;
        }
        
        public boolean o() {
            return this.k;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=");
            sb.append(this.b);
            sb.append(", mItemCount=");
            sb.append(this.f);
            sb.append(", mIsMeasuring=");
            sb.append(this.j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.d);
            sb.append(", mStructureChanged=");
            sb.append(this.g);
            sb.append(", mInPreLayout=");
            sb.append(this.h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.l);
            sb.append('}');
            return sb.toString();
        }
    }
    
    public abstract static class e0
    {
        @k0
        public abstract View a(@j0 final x p0, final int p1, final int p2);
    }
    
    class f0 implements Runnable
    {
        private int G;
        private int H;
        OverScroller I;
        Interpolator J;
        private boolean K;
        private boolean L;
        
        f0() {
            final Interpolator r1 = RecyclerView.R1;
            this.J = r1;
            this.K = false;
            this.L = false;
            this.I = new OverScroller(RecyclerView.this.getContext(), r1);
        }
        
        private int a(int a, int a2) {
            final int abs = Math.abs(a);
            final int abs2 = Math.abs(a2);
            if (abs > abs2) {
                a = 1;
            }
            else {
                a = 0;
            }
            final RecyclerView m = RecyclerView.this;
            if (a != 0) {
                a2 = m.getWidth();
            }
            else {
                a2 = m.getHeight();
            }
            if (a != 0) {
                a = abs;
            }
            else {
                a = abs2;
            }
            return Math.min((int)((a / (float)a2 + 1.0f) * 300.0f), 2000);
        }
        
        private void c() {
            RecyclerView.this.removeCallbacks((Runnable)this);
            androidx.core.view.j0.n1((View)RecyclerView.this, this);
        }
        
        public void b(final int n, final int n2) {
            RecyclerView.this.setScrollState(2);
            this.H = 0;
            this.G = 0;
            final Interpolator j = this.J;
            final Interpolator r1 = RecyclerView.R1;
            if (j != r1) {
                this.J = r1;
                this.I = new OverScroller(RecyclerView.this.getContext(), r1);
            }
            this.I.fling(0, 0, n, n2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            this.d();
        }
        
        void d() {
            if (this.K) {
                this.L = true;
            }
            else {
                this.c();
            }
        }
        
        public void e(final int n, final int n2, final int n3, @k0 final Interpolator interpolator) {
            int a = n3;
            if (n3 == Integer.MIN_VALUE) {
                a = this.a(n, n2);
            }
            Interpolator r1;
            if ((r1 = interpolator) == null) {
                r1 = RecyclerView.R1;
            }
            if (this.J != r1) {
                this.J = r1;
                this.I = new OverScroller(RecyclerView.this.getContext(), r1);
            }
            this.H = 0;
            this.G = 0;
            RecyclerView.this.setScrollState(2);
            this.I.startScroll(0, 0, n, n2, a);
            if (Build$VERSION.SDK_INT < 23) {
                this.I.computeScrollOffset();
            }
            this.d();
        }
        
        public void f() {
            RecyclerView.this.removeCallbacks((Runnable)this);
            this.I.abortAnimation();
        }
        
        @Override
        public void run() {
            final RecyclerView m = RecyclerView.this;
            if (m.S == null) {
                this.f();
                return;
            }
            this.L = false;
            this.K = true;
            m.F();
            final OverScroller i = this.I;
            if (i.computeScrollOffset()) {
                final int currX = i.getCurrX();
                final int currY = i.getCurrY();
                final int n = currX - this.G;
                final int n2 = currY - this.H;
                this.G = currX;
                this.H = currY;
                final RecyclerView j = RecyclerView.this;
                final int[] b1 = j.b1;
                b1[1] = (b1[0] = 0);
                int n3 = n;
                int n4 = n2;
                if (j.b(n, n2, b1, null, 1)) {
                    final int[] b2 = RecyclerView.this.b1;
                    n3 = n - b2[0];
                    n4 = n2 - b2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.E(n3, n4);
                }
                final RecyclerView k = RecyclerView.this;
                int n9;
                int n10;
                int n11;
                if (k.R != null) {
                    final int[] b3 = k.b1;
                    b3[1] = (b3[0] = 0);
                    k.F1(n3, n4, b3);
                    final RecyclerView l = RecyclerView.this;
                    final int[] b4 = l.b1;
                    final int n5 = b4[0];
                    final int n6 = b4[1];
                    final int n7 = n3 - n5;
                    final int n8 = n4 - n6;
                    final c0 g = l.S.g;
                    n3 = n7;
                    n9 = n6;
                    n10 = n5;
                    n11 = n8;
                    if (g != null) {
                        n3 = n7;
                        n9 = n6;
                        n10 = n5;
                        n11 = n8;
                        if (!g.h()) {
                            n3 = n7;
                            n9 = n6;
                            n10 = n5;
                            n11 = n8;
                            if (g.i()) {
                                final int d = RecyclerView.this.O0.d();
                                if (d == 0) {
                                    g.s();
                                    n3 = n7;
                                    n9 = n6;
                                    n10 = n5;
                                    n11 = n8;
                                }
                                else {
                                    if (g.f() >= d) {
                                        g.q(d - 1);
                                    }
                                    g.k(n5, n6);
                                    n3 = n7;
                                    n9 = n6;
                                    n10 = n5;
                                    n11 = n8;
                                }
                            }
                        }
                    }
                }
                else {
                    n9 = 0;
                    final int n12 = 0;
                    n11 = n4;
                    n10 = n12;
                }
                if (!RecyclerView.this.V.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                final RecyclerView m2 = RecyclerView.this;
                final int[] b5 = m2.b1;
                b5[1] = (b5[0] = 0);
                m2.c(n10, n9, n3, n11, null, 1, b5);
                final RecyclerView m3 = RecyclerView.this;
                final int[] b6 = m3.b1;
                final int n13 = n3 - b6[0];
                final int n14 = n11 - b6[1];
                if (n10 != 0 || n9 != 0) {
                    m3.R(n10, n9);
                }
                if (!RecyclerView.k(RecyclerView.this)) {
                    RecyclerView.this.invalidate();
                }
                final boolean b7 = i.getCurrX() == i.getFinalX();
                final boolean b8 = i.getCurrY() == i.getFinalY();
                boolean b9 = false;
                Label_0607: {
                    Label_0605: {
                        if (!i.isFinished()) {
                            if (b7 || n13 != 0) {
                                if (b8) {
                                    break Label_0605;
                                }
                                if (n14 != 0) {
                                    break Label_0605;
                                }
                            }
                            b9 = false;
                            break Label_0607;
                        }
                    }
                    b9 = true;
                }
                final c0 g2 = RecyclerView.this.S.g;
                if ((g2 == null || !g2.h()) && b9) {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int n15 = (int)i.getCurrVelocity();
                        int n16;
                        if (n13 < 0) {
                            n16 = -n15;
                        }
                        else if (n13 > 0) {
                            n16 = n15;
                        }
                        else {
                            n16 = 0;
                        }
                        if (n14 < 0) {
                            n15 = -n15;
                        }
                        else if (n14 <= 0) {
                            n15 = 0;
                        }
                        RecyclerView.this.h(n16, n15);
                    }
                    if (RecyclerView.p1) {
                        RecyclerView.this.N0.b();
                    }
                }
                else {
                    this.d();
                    final RecyclerView m4 = RecyclerView.this;
                    final androidx.recyclerview.widget.n m5 = m4.M0;
                    if (m5 != null) {
                        m5.f(m4, n10, n9);
                    }
                }
            }
            final c0 g3 = RecyclerView.this.S.g;
            if (g3 != null && g3.h()) {
                g3.k(0, 0);
            }
            this.K = false;
            if (this.L) {
                this.c();
            }
            else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.g(1);
            }
        }
    }
    
    public abstract static class g0
    {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS;
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        @j0
        public final View itemView;
        h<? extends g0> mBindingAdapter;
        int mFlags;
        boolean mInChangeScrap;
        private int mIsRecyclableCount;
        long mItemId;
        int mItemViewType;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads;
        @b1
        int mPendingAccessibilityState;
        int mPosition;
        int mPreLayoutPosition;
        x mScrapContainer;
        g0 mShadowedHolder;
        g0 mShadowingHolder;
        List<Object> mUnmodifiedPayloads;
        private int mWasImportantForAccessibilityBeforeHidden;
        
        static {
            FULLUPDATE_PAYLOADS = Collections.emptyList();
        }
        
        public g0(@j0 final View itemView) {
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mItemViewType = -1;
            this.mPreLayoutPosition = -1;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.mPayloads = null;
            this.mUnmodifiedPayloads = null;
            this.mIsRecyclableCount = 0;
            this.mScrapContainer = null;
            this.mInChangeScrap = false;
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            if (itemView != null) {
                this.itemView = itemView;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }
        
        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                final ArrayList<Object> list = new ArrayList<Object>();
                this.mPayloads = list;
                this.mUnmodifiedPayloads = Collections.unmodifiableList((List<?>)list);
            }
        }
        
        void addChangePayload(final Object o) {
            if (o == null) {
                this.addFlags(1024);
            }
            else if ((0x400 & this.mFlags) == 0x0) {
                this.createPayloadsIfNeeded();
                this.mPayloads.add(o);
            }
        }
        
        void addFlags(final int n) {
            this.mFlags |= n;
        }
        
        void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }
        
        void clearPayload() {
            final List<Object> mPayloads = this.mPayloads;
            if (mPayloads != null) {
                mPayloads.clear();
            }
            this.mFlags &= 0xFFFFFBFF;
        }
        
        void clearReturnedFromScrapFlag() {
            this.mFlags &= 0xFFFFFFDF;
        }
        
        void clearTmpDetachFlag() {
            this.mFlags &= 0xFFFFFEFF;
        }
        
        boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 0x10) == 0x0 && androidx.core.view.j0.L0(this.itemView);
        }
        
        void flagRemovedAndOffsetPosition(final int mPosition, final int n, final boolean b) {
            this.addFlags(8);
            this.offsetPosition(n, b);
            this.mPosition = mPosition;
        }
        
        public final int getAbsoluteAdapterPosition() {
            final RecyclerView mOwnerRecyclerView = this.mOwnerRecyclerView;
            if (mOwnerRecyclerView == null) {
                return -1;
            }
            return mOwnerRecyclerView.n0(this);
        }
        
        @Deprecated
        public final int getAdapterPosition() {
            return this.getBindingAdapterPosition();
        }
        
        @k0
        public final h<? extends g0> getBindingAdapter() {
            return this.mBindingAdapter;
        }
        
        public final int getBindingAdapterPosition() {
            if (this.mBindingAdapter == null) {
                return -1;
            }
            final RecyclerView mOwnerRecyclerView = this.mOwnerRecyclerView;
            if (mOwnerRecyclerView == null) {
                return -1;
            }
            final h adapter = mOwnerRecyclerView.getAdapter();
            if (adapter == null) {
                return -1;
            }
            final int n0 = this.mOwnerRecyclerView.n0(this);
            if (n0 == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn((h)this.mBindingAdapter, this, n0);
        }
        
        public final long getItemId() {
            return this.mItemId;
        }
        
        public final int getItemViewType() {
            return this.mItemViewType;
        }
        
        public final int getLayoutPosition() {
            int n;
            if ((n = this.mPreLayoutPosition) == -1) {
                n = this.mPosition;
            }
            return n;
        }
        
        public final int getOldPosition() {
            return this.mOldPosition;
        }
        
        @Deprecated
        public final int getPosition() {
            int n;
            if ((n = this.mPreLayoutPosition) == -1) {
                n = this.mPosition;
            }
            return n;
        }
        
        List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & 0x400) != 0x0) {
                return g0.FULLUPDATE_PAYLOADS;
            }
            final List<Object> mPayloads = this.mPayloads;
            if (mPayloads != null && mPayloads.size()) {
                return this.mUnmodifiedPayloads;
            }
            return g0.FULLUPDATE_PAYLOADS;
        }
        
        boolean hasAnyOfTheFlags(final int n) {
            return (n & this.mFlags) != 0x0;
        }
        
        boolean isAdapterPositionUnknown() {
            return (this.mFlags & 0x200) != 0x0 || this.isInvalid();
        }
        
        boolean isAttachedToTransitionOverlay() {
            return this.itemView.getParent() != null && this.itemView.getParent() != this.mOwnerRecyclerView;
        }
        
        boolean isBound() {
            final int mFlags = this.mFlags;
            boolean b = true;
            if ((mFlags & 0x1) == 0x0) {
                b = false;
            }
            return b;
        }
        
        boolean isInvalid() {
            return (this.mFlags & 0x4) != 0x0;
        }
        
        public final boolean isRecyclable() {
            return (this.mFlags & 0x10) == 0x0 && !androidx.core.view.j0.L0(this.itemView);
        }
        
        boolean isRemoved() {
            return (this.mFlags & 0x8) != 0x0;
        }
        
        boolean isScrap() {
            return this.mScrapContainer != null;
        }
        
        boolean isTmpDetached() {
            return (this.mFlags & 0x100) != 0x0;
        }
        
        boolean isUpdated() {
            return (this.mFlags & 0x2) != 0x0;
        }
        
        boolean needsUpdate() {
            return (this.mFlags & 0x2) != 0x0;
        }
        
        void offsetPosition(final int n, final boolean b) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (b) {
                this.mPreLayoutPosition += n;
            }
            this.mPosition += n;
            if (this.itemView.getLayoutParams() != null) {
                ((q)this.itemView.getLayoutParams()).c = true;
            }
        }
        
        void onEnteredHiddenState(final RecyclerView recyclerView) {
            int mWasImportantForAccessibilityBeforeHidden = this.mPendingAccessibilityState;
            if (mWasImportantForAccessibilityBeforeHidden == -1) {
                mWasImportantForAccessibilityBeforeHidden = androidx.core.view.j0.T(this.itemView);
            }
            this.mWasImportantForAccessibilityBeforeHidden = mWasImportantForAccessibilityBeforeHidden;
            recyclerView.I1(this, 4);
        }
        
        void onLeftHiddenState(final RecyclerView recyclerView) {
            recyclerView.I1(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }
        
        void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1L;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            this.clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.A(this);
        }
        
        void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }
        
        void setFlags(final int n, final int n2) {
            this.mFlags = ((n & n2) | (this.mFlags & ~n2));
        }
        
        public final void setIsRecyclable(final boolean b) {
            int mIsRecyclableCount = this.mIsRecyclableCount;
            if (b) {
                --mIsRecyclableCount;
            }
            else {
                ++mIsRecyclableCount;
            }
            this.mIsRecyclableCount = mIsRecyclableCount;
            if (mIsRecyclableCount < 0) {
                this.mIsRecyclableCount = 0;
                final StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            }
            else {
                int mFlags;
                if (!b && mIsRecyclableCount == 1) {
                    mFlags = (this.mFlags | 0x10);
                }
                else {
                    if (!b || mIsRecyclableCount != 0) {
                        return;
                    }
                    mFlags = (this.mFlags & 0xFFFFFFEF);
                }
                this.mFlags = mFlags;
            }
        }
        
        void setScrapContainer(final x mScrapContainer, final boolean mInChangeScrap) {
            this.mScrapContainer = mScrapContainer;
            this.mInChangeScrap = mInChangeScrap;
        }
        
        boolean shouldBeKeptAsChild() {
            return (this.mFlags & 0x10) != 0x0;
        }
        
        boolean shouldIgnore() {
            return (this.mFlags & 0x80) != 0x0;
        }
        
        void stopIgnoring() {
            this.mFlags &= 0xFFFFFF7F;
        }
        
        @Override
        public String toString() {
            String simpleName;
            if (this.getClass().isAnonymousClass()) {
                simpleName = "ViewHolder";
            }
            else {
                simpleName = this.getClass().getSimpleName();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(simpleName);
            sb.append("{");
            sb.append(Integer.toHexString(this.hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            final StringBuilder sb2 = new StringBuilder(sb.toString());
            if (this.isScrap()) {
                sb2.append(" scrap ");
                String str;
                if (this.mInChangeScrap) {
                    str = "[changeScrap]";
                }
                else {
                    str = "[attachedScrap]";
                }
                sb2.append(str);
            }
            if (this.isInvalid()) {
                sb2.append(" invalid");
            }
            if (!this.isBound()) {
                sb2.append(" unbound");
            }
            if (this.needsUpdate()) {
                sb2.append(" update");
            }
            if (this.isRemoved()) {
                sb2.append(" removed");
            }
            if (this.shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (this.isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!this.isRecyclable()) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (this.isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
        
        void unScrap() {
            this.mScrapContainer.K(this);
        }
        
        boolean wasReturnedFromScrap() {
            return (this.mFlags & 0x20) != 0x0;
        }
    }
    
    public abstract static class h<VH extends g0>
    {
        private boolean mHasStableIds;
        private final i mObservable;
        private a mStateRestorationPolicy;
        
        public h() {
            this.mObservable = new i();
            this.mHasStableIds = false;
            this.mStateRestorationPolicy = a.G;
        }
        
        public final void bindViewHolder(@j0 final VH vh, final int mPosition) {
            final boolean b = vh.mBindingAdapter == null;
            if (b) {
                vh.mPosition = mPosition;
                if (this.hasStableIds()) {
                    vh.mItemId = this.getItemId(mPosition);
                }
                ((g0)vh).setFlags(1, 519);
                androidx.core.os.t.b("RV OnBindView");
            }
            (vh.mBindingAdapter = (h<? extends g0>)this).onBindViewHolder((g0)vh, mPosition, ((g0)vh).getUnmodifiedPayloads());
            if (b) {
                ((g0)vh).clearPayload();
                final ViewGroup$LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof q) {
                    ((q)layoutParams).c = true;
                }
                androidx.core.os.t.d();
            }
        }
        
        boolean canRestoreState() {
            final int n = RecyclerView$g.a[this.mStateRestorationPolicy.ordinal()];
            boolean b = false;
            if (n != 1) {
                if (n != 2) {
                    return true;
                }
                b = b;
                if (this.getItemCount() > 0) {
                    b = true;
                }
            }
            return b;
        }
        
        @j0
        public final VH createViewHolder(@j0 final ViewGroup viewGroup, final int mItemViewType) {
            try {
                androidx.core.os.t.b("RV CreateView");
                final g0 onCreateViewHolder = this.onCreateViewHolder(viewGroup, mItemViewType);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = mItemViewType;
                    return (VH)onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            }
            finally {
                androidx.core.os.t.d();
            }
        }
        
        public int findRelativeAdapterPositionIn(@j0 final h<? extends g0> h, @j0 final g0 g0, final int n) {
            if (h == this) {
                return n;
            }
            return -1;
        }
        
        public abstract int getItemCount();
        
        public long getItemId(final int n) {
            return -1L;
        }
        
        public int getItemViewType(final int n) {
            return 0;
        }
        
        @j0
        public final a getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }
        
        public final boolean hasObservers() {
            return this.mObservable.a();
        }
        
        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }
        
        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }
        
        public final void notifyItemChanged(final int n) {
            this.mObservable.d(n, 1);
        }
        
        public final void notifyItemChanged(final int n, @k0 final Object o) {
            this.mObservable.e(n, 1, o);
        }
        
        public final void notifyItemInserted(final int n) {
            this.mObservable.f(n, 1);
        }
        
        public final void notifyItemMoved(final int n, final int n2) {
            this.mObservable.c(n, n2);
        }
        
        public final void notifyItemRangeChanged(final int n, final int n2) {
            this.mObservable.d(n, n2);
        }
        
        public final void notifyItemRangeChanged(final int n, final int n2, @k0 final Object o) {
            this.mObservable.e(n, n2, o);
        }
        
        public final void notifyItemRangeInserted(final int n, final int n2) {
            this.mObservable.f(n, n2);
        }
        
        public final void notifyItemRangeRemoved(final int n, final int n2) {
            this.mObservable.g(n, n2);
        }
        
        public final void notifyItemRemoved(final int n) {
            this.mObservable.g(n, 1);
        }
        
        public void onAttachedToRecyclerView(@j0 final RecyclerView recyclerView) {
        }
        
        public abstract void onBindViewHolder(@j0 final VH p0, final int p1);
        
        public void onBindViewHolder(@j0 final VH vh, final int n, @j0 final List<Object> list) {
            this.onBindViewHolder(vh, n);
        }
        
        @j0
        public abstract VH onCreateViewHolder(@j0 final ViewGroup p0, final int p1);
        
        public void onDetachedFromRecyclerView(@j0 final RecyclerView recyclerView) {
        }
        
        public boolean onFailedToRecycleView(@j0 final VH vh) {
            return false;
        }
        
        public void onViewAttachedToWindow(@j0 final VH vh) {
        }
        
        public void onViewDetachedFromWindow(@j0 final VH vh) {
        }
        
        public void onViewRecycled(@j0 final VH vh) {
        }
        
        public void registerAdapterDataObserver(@j0 final j j) {
            this.mObservable.registerObserver((Object)j);
        }
        
        public void setHasStableIds(final boolean mHasStableIds) {
            if (!this.hasObservers()) {
                this.mHasStableIds = mHasStableIds;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        
        public void setStateRestorationPolicy(@j0 final a mStateRestorationPolicy) {
            this.mStateRestorationPolicy = mStateRestorationPolicy;
            this.mObservable.h();
        }
        
        public void unregisterAdapterDataObserver(@j0 final j j) {
            this.mObservable.unregisterObserver((Object)j);
        }
        
        public enum a
        {
            G, 
            H, 
            I;
        }
    }
    
    static class i extends Observable<j>
    {
        public boolean a() {
            return super.mObservers.isEmpty() ^ true;
        }
        
        public void b() {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).a();
            }
        }
        
        public void c(final int n, final int n2) {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).e(n, n2, 1);
            }
        }
        
        public void d(final int n, final int n2) {
            this.e(n, n2, null);
        }
        
        public void e(final int n, final int n2, @k0 final Object o) {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).c(n, n2, o);
            }
        }
        
        public void f(final int n, final int n2) {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).d(n, n2);
            }
        }
        
        public void g(final int n, final int n2) {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).f(n, n2);
            }
        }
        
        public void h() {
            for (int i = super.mObservers.size() - 1; i >= 0; --i) {
                ((j)super.mObservers.get(i)).g();
            }
        }
    }
    
    public abstract static class j
    {
        public void a() {
        }
        
        public void b(final int n, final int n2) {
        }
        
        public void c(final int n, final int n2, @k0 final Object o) {
            this.b(n, n2);
        }
        
        public void d(final int n, final int n2) {
        }
        
        public void e(final int n, final int n2, final int n3) {
        }
        
        public void f(final int n, final int n2) {
        }
        
        public void g() {
        }
    }
    
    public interface k
    {
        int a(final int p0, final int p1);
    }
    
    public static class l
    {
        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        public static final int d = 3;
        
        @j0
        protected EdgeEffect a(@j0 final RecyclerView recyclerView, final int n) {
            return new EdgeEffect(recyclerView.getContext());
        }
        
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
    }
    
    public abstract static class m
    {
        public static final int g = 2;
        public static final int h = 8;
        public static final int i = 4;
        public static final int j = 2048;
        public static final int k = 4096;
        private c a;
        private ArrayList<b> b;
        private long c;
        private long d;
        private long e;
        private long f;
        
        public m() {
            this.a = null;
            this.b = new ArrayList<b>();
            this.c = 120L;
            this.d = 120L;
            this.e = 250L;
            this.f = 250L;
        }
        
        static int e(final g0 g0) {
            final int n = g0.mFlags & 0xE;
            if (g0.isInvalid()) {
                return 4;
            }
            int n2 = n;
            if ((n & 0x4) == 0x0) {
                final int oldPosition = g0.getOldPosition();
                final int absoluteAdapterPosition = g0.getAbsoluteAdapterPosition();
                n2 = n;
                if (oldPosition != -1) {
                    n2 = n;
                    if (absoluteAdapterPosition != -1) {
                        n2 = n;
                        if (oldPosition != absoluteAdapterPosition) {
                            n2 = (n | 0x800);
                        }
                    }
                }
            }
            return n2;
        }
        
        void A(final c a) {
            this.a = a;
        }
        
        public void B(final long e) {
            this.e = e;
        }
        
        public void C(final long d) {
            this.d = d;
        }
        
        public abstract boolean a(@j0 final g0 p0, @k0 final d p1, @j0 final d p2);
        
        public abstract boolean b(@j0 final g0 p0, @j0 final g0 p1, @j0 final d p2, @j0 final d p3);
        
        public abstract boolean c(@j0 final g0 p0, @j0 final d p1, @k0 final d p2);
        
        public abstract boolean d(@j0 final g0 p0, @j0 final d p1, @j0 final d p2);
        
        public boolean f(@j0 final g0 g0) {
            return true;
        }
        
        public boolean g(@j0 final g0 g0, @j0 final List<Object> list) {
            return this.f(g0);
        }
        
        public final void h(@j0 final g0 g0) {
            this.t(g0);
            final c a = this.a;
            if (a != null) {
                a.a(g0);
            }
        }
        
        public final void i(@j0 final g0 g0) {
            this.u(g0);
        }
        
        public final void j() {
            for (int size = this.b.size(), i = 0; i < size; ++i) {
                this.b.get(i).a();
            }
            this.b.clear();
        }
        
        public abstract void k(@j0 final g0 p0);
        
        public abstract void l();
        
        public long m() {
            return this.c;
        }
        
        public long n() {
            return this.f;
        }
        
        public long o() {
            return this.e;
        }
        
        public long p() {
            return this.d;
        }
        
        public abstract boolean q();
        
        public final boolean r(@k0 final b e) {
            final boolean q = this.q();
            if (e != null) {
                if (!q) {
                    e.a();
                }
                else {
                    this.b.add(e);
                }
            }
            return q;
        }
        
        @j0
        public d s() {
            return new d();
        }
        
        public void t(@j0 final g0 g0) {
        }
        
        public void u(@j0 final g0 g0) {
        }
        
        @j0
        public d v(@j0 final d0 d0, @j0 final g0 g0) {
            return this.s().a(g0);
        }
        
        @j0
        public d w(@j0 final d0 d0, @j0 final g0 g0, final int n, @j0 final List<Object> list) {
            return this.s().a(g0);
        }
        
        public abstract void x();
        
        public void y(final long c) {
            this.c = c;
        }
        
        public void z(final long f) {
            this.f = f;
        }
        
        @Retention(RetentionPolicy.SOURCE)
        public @interface a {
        }
        
        public interface b
        {
            void a();
        }
        
        interface c
        {
            void a(@j0 final g0 p0);
        }
        
        public static class d
        {
            public int a;
            public int b;
            public int c;
            public int d;
            public int e;
            
            @j0
            public d a(@j0 final g0 g0) {
                return this.b(g0, 0);
            }
            
            @j0
            public d b(@j0 final g0 g0, final int n) {
                final View itemView = g0.itemView;
                this.a = itemView.getLeft();
                this.b = itemView.getTop();
                this.c = itemView.getRight();
                this.d = itemView.getBottom();
                return this;
            }
        }
    }
    
    private class n implements m.c
    {
        n() {
        }
        
        @Override
        public void a(final g0 g0) {
            g0.setIsRecyclable(true);
            if (g0.mShadowedHolder != null && g0.mShadowingHolder == null) {
                g0.mShadowedHolder = null;
            }
            g0.mShadowingHolder = null;
            if (!g0.shouldBeKeptAsChild() && !RecyclerView.this.r1(g0.itemView) && g0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(g0.itemView, false);
            }
        }
    }
    
    public abstract static class o
    {
        @Deprecated
        public void f(@j0 final Rect rect, final int n, @j0 final RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }
        
        public void g(@j0 final Rect rect, @j0 final View view, @j0 final RecyclerView recyclerView, @j0 final d0 d0) {
            this.f(rect, ((q)view.getLayoutParams()).d(), recyclerView);
        }
        
        @Deprecated
        public void h(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView) {
        }
        
        public void i(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView, @j0 final d0 d0) {
            this.h(canvas, recyclerView);
        }
        
        @Deprecated
        public void j(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView) {
        }
        
        public void k(@j0 final Canvas canvas, @j0 final RecyclerView recyclerView, @j0 final d0 d0) {
            this.j(canvas, recyclerView);
        }
    }
    
    public abstract static class p
    {
        g a;
        RecyclerView b;
        private final androidx.recyclerview.widget.k0.b c;
        private final androidx.recyclerview.widget.k0.b d;
        androidx.recyclerview.widget.k0 e;
        androidx.recyclerview.widget.k0 f;
        @k0
        c0 g;
        boolean h;
        boolean i;
        boolean j;
        private boolean k;
        private boolean l;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;
        
        public p() {
            final androidx.recyclerview.widget.k0.b c = new androidx.recyclerview.widget.k0.b() {
                @Override
                public View a(final int n) {
                    return RecyclerView.p.this.P(n);
                }
                
                @Override
                public int b(final View view) {
                    return RecyclerView.p.this.Y(view) - ((q)view.getLayoutParams()).leftMargin;
                }
                
                @Override
                public int c() {
                    return RecyclerView.p.this.o0();
                }
                
                @Override
                public int d() {
                    return RecyclerView.p.this.z0() - RecyclerView.p.this.p0();
                }
                
                @Override
                public int e(final View view) {
                    return RecyclerView.p.this.b0(view) + ((q)view.getLayoutParams()).rightMargin;
                }
            };
            this.c = c;
            final androidx.recyclerview.widget.k0.b d = new androidx.recyclerview.widget.k0.b() {
                @Override
                public View a(final int n) {
                    return RecyclerView.p.this.P(n);
                }
                
                @Override
                public int b(final View view) {
                    return RecyclerView.p.this.c0(view) - ((q)view.getLayoutParams()).topMargin;
                }
                
                @Override
                public int c() {
                    return RecyclerView.p.this.r0();
                }
                
                @Override
                public int d() {
                    return RecyclerView.p.this.e0() - RecyclerView.p.this.m0();
                }
                
                @Override
                public int e(final View view) {
                    return RecyclerView.p.this.W(view) + ((q)view.getLayoutParams()).bottomMargin;
                }
            };
            this.d = d;
            this.e = new androidx.recyclerview.widget.k0((androidx.recyclerview.widget.k0.b)c);
            this.f = new androidx.recyclerview.widget.k0((androidx.recyclerview.widget.k0.b)d);
            this.h = false;
            this.i = false;
            this.j = false;
            this.k = true;
            this.l = true;
        }
        
        private void E(final int n, @j0 final View view) {
            this.a.d(n);
        }
        
        private boolean H0(final RecyclerView recyclerView, final int n, final int n2) {
            final View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            final int o0 = this.o0();
            final int r0 = this.r0();
            final int z0 = this.z0();
            final int p3 = this.p0();
            final int e0 = this.e0();
            final int m0 = this.m0();
            final Rect o2 = this.b.O;
            this.X(focusedChild, o2);
            return o2.left - n < z0 - p3 && o2.right - n > o0 && o2.top - n2 < e0 - m0 && o2.bottom - n2 > r0;
        }
        
        private static boolean L0(final int n, int size, final int n2) {
            final int mode = View$MeasureSpec.getMode(size);
            size = View$MeasureSpec.getSize(size);
            final boolean b = false;
            boolean b2 = false;
            if (n2 > 0 && n != n2) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                boolean b3 = b;
                if (size >= n) {
                    b3 = true;
                }
                return b3;
            }
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824) {
                return false;
            }
            if (size == n) {
                b2 = true;
            }
            return b2;
        }
        
        private void P1(final x x, final int n, final View view) {
            final g0 u0 = RecyclerView.u0(view);
            if (u0.shouldIgnore()) {
                return;
            }
            if (u0.isInvalid() && !u0.isRemoved() && !this.b.R.hasStableIds()) {
                this.K1(n);
                x.D(u0);
            }
            else {
                this.D(n);
                x.E(view);
                this.b.L.k(u0);
            }
        }
        
        public static int R(int n, final int n2, int max, int n3, final boolean b) {
            max = Math.max(0, n - max);
            Label_0102: {
                Label_0065: {
                    if (b) {
                        if (n3 < 0) {
                            if (n3 != -1) {
                                break Label_0102;
                            }
                            if ((n = n2) == Integer.MIN_VALUE) {
                                break Label_0065;
                            }
                            if (n2 == 0) {
                                break Label_0102;
                            }
                            if ((n = n2) != 1073741824) {
                                break Label_0102;
                            }
                            break Label_0065;
                        }
                    }
                    else if (n3 < 0) {
                        if (n3 == -1) {
                            n = n2;
                            break Label_0065;
                        }
                        if (n3 != -2) {
                            break Label_0102;
                        }
                        if (n2 != Integer.MIN_VALUE && n2 != 1073741824) {
                            n = 0;
                            break Label_0065;
                        }
                        n = Integer.MIN_VALUE;
                        break Label_0065;
                    }
                    n = 1073741824;
                    return View$MeasureSpec.makeMeasureSpec(n3, n);
                }
                n3 = max;
                return View$MeasureSpec.makeMeasureSpec(n3, n);
            }
            n = 0;
            n3 = 0;
            return View$MeasureSpec.makeMeasureSpec(n3, n);
        }
        
        @Deprecated
        public static int S(int n, int max, int n2, final boolean b) {
            final int n3 = 0;
            max = Math.max(0, n - max);
            Label_0034: {
                Label_0022: {
                    if (b) {
                        if (n2 >= 0) {
                            break Label_0034;
                        }
                    }
                    else {
                        if (n2 >= 0) {
                            break Label_0034;
                        }
                        if (n2 == -1) {
                            n = 1073741824;
                        }
                        else {
                            if (n2 != -2) {
                                break Label_0022;
                            }
                            n = Integer.MIN_VALUE;
                        }
                        n2 = max;
                        return View$MeasureSpec.makeMeasureSpec(n2, n);
                    }
                }
                n2 = 0;
                n = n3;
                return View$MeasureSpec.makeMeasureSpec(n2, n);
            }
            n = 1073741824;
            return View$MeasureSpec.makeMeasureSpec(n2, n);
        }
        
        private int[] T(final View view, final Rect rect) {
            final int o0 = this.o0();
            final int r0 = this.r0();
            final int z0 = this.z0();
            final int p2 = this.p0();
            final int e0 = this.e0();
            final int m0 = this.m0();
            final int n = view.getLeft() + rect.left - view.getScrollX();
            final int n2 = view.getTop() + rect.top - view.getScrollY();
            final int width = rect.width();
            final int height = rect.height();
            final int n3 = n - o0;
            int a = Math.min(0, n3);
            final int n4 = n2 - r0;
            int n5 = Math.min(0, n4);
            final int n6 = width + n - (z0 - p2);
            final int max = Math.max(0, n6);
            final int max2 = Math.max(0, height + n2 - (e0 - m0));
            if (this.i0() == 1) {
                if (max != 0) {
                    a = max;
                }
                else {
                    a = Math.max(a, n6);
                }
            }
            else if (a == 0) {
                a = Math.min(n3, max);
            }
            if (n5 == 0) {
                n5 = Math.min(n4, max2);
            }
            return new int[] { a, n5 };
        }
        
        private void g(final View view, final int n, final boolean b) {
            final g0 u0 = RecyclerView.u0(view);
            if (!b && !u0.isRemoved()) {
                this.b.L.p(u0);
            }
            else {
                this.b.L.b(u0);
            }
            final q q = (q)view.getLayoutParams();
            if (!u0.wasReturnedFromScrap() && !u0.isScrap()) {
                if (view.getParent() == this.b) {
                    final int m = this.a.m(view);
                    int g;
                    if ((g = n) == -1) {
                        g = this.a.g();
                    }
                    if (m == -1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        sb.append(this.b.indexOfChild(view));
                        sb.append(this.b.Y());
                        throw new IllegalStateException(sb.toString());
                    }
                    if (m != g) {
                        this.b.S.S0(m, g);
                    }
                }
                else {
                    this.a.a(view, n, false);
                    q.c = true;
                    final c0 g2 = this.g;
                    if (g2 != null && g2.i()) {
                        this.g.l(view);
                    }
                }
            }
            else {
                if (u0.isScrap()) {
                    u0.unScrap();
                }
                else {
                    u0.clearReturnedFromScrapFlag();
                }
                this.a.c(view, n, view.getLayoutParams(), false);
            }
            if (q.d) {
                u0.itemView.invalidate();
                q.d = false;
            }
        }
        
        public static int q(int a, final int n, final int n2) {
            final int mode = View$MeasureSpec.getMode(a);
            a = View$MeasureSpec.getSize(a);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 1073741824) {
                    a = Math.max(n, n2);
                }
                return a;
            }
            return Math.min(a, Math.max(n, n2));
        }
        
        public static d t0(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
            final d d = new d();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c1.a.j.N, n, n2);
            d.a = obtainStyledAttributes.getInt(c1.a.j.O, 1);
            d.b = obtainStyledAttributes.getInt(c1.a.j.Y, 1);
            d.c = obtainStyledAttributes.getBoolean(c1.a.j.X, false);
            d.d = obtainStyledAttributes.getBoolean(c1.a.j.Z, false);
            obtainStyledAttributes.recycle();
            return d;
        }
        
        public void A(@j0 final View view, @j0 final x x) {
            this.P1(x, this.a.m(view), view);
        }
        
        public int A0() {
            return this.o;
        }
        
        public boolean A1(@j0 final x x, @j0 final d0 d0, @j0 final View view, final int n, @k0 final Bundle bundle) {
            return false;
        }
        
        public void B(final int n, @j0 final x x) {
            this.P1(x, n, this.P(n));
        }
        
        boolean B0() {
            for (int q = this.Q(), i = 0; i < q; ++i) {
                final ViewGroup$LayoutParams layoutParams = this.P(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }
        
        public void B1(final Runnable runnable) {
            final RecyclerView b = this.b;
            if (b != null) {
                androidx.core.view.j0.n1((View)b, runnable);
            }
        }
        
        public void C(@j0 final View view) {
            final int m = this.a.m(view);
            if (m >= 0) {
                this.E(m, view);
            }
        }
        
        public boolean C0() {
            final RecyclerView b = this.b;
            return b != null && b.hasFocus();
        }
        
        public void C1() {
            for (int i = this.Q() - 1; i >= 0; --i) {
                this.a.q(i);
            }
        }
        
        public void D(final int n) {
            this.E(n, this.P(n));
        }
        
        public void D0(@j0 final View view) {
            final ViewParent parent = view.getParent();
            final RecyclerView b = this.b;
            if (parent == b && b.indexOfChild(view) != -1) {
                final g0 u0 = RecyclerView.u0(view);
                u0.addFlags(128);
                this.b.L.q(u0);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("View should be fully attached to be ignored");
            sb.append(this.b.Y());
            throw new IllegalArgumentException(sb.toString());
        }
        
        public void D1(@j0 final x x) {
            for (int i = this.Q() - 1; i >= 0; --i) {
                if (!RecyclerView.u0(this.P(i)).shouldIgnore()) {
                    this.G1(i, x);
                }
            }
        }
        
        public boolean E0() {
            return this.i;
        }
        
        void E1(final x x) {
            final int k = x.k();
            for (int i = k - 1; i >= 0; --i) {
                final View o = x.o(i);
                final g0 u0 = RecyclerView.u0(o);
                if (!u0.shouldIgnore()) {
                    u0.setIsRecyclable(false);
                    if (u0.isTmpDetached()) {
                        this.b.removeDetachedView(o, false);
                    }
                    final m w0 = this.b.w0;
                    if (w0 != null) {
                        w0.k(u0);
                    }
                    u0.setIsRecyclable(true);
                    x.z(o);
                }
            }
            x.f();
            if (k > 0) {
                this.b.invalidate();
            }
        }
        
        void F(final RecyclerView recyclerView) {
            this.i = true;
            this.X0(recyclerView);
        }
        
        public boolean F0() {
            return this.j;
        }
        
        public void F1(@j0 final View view, @j0 final x x) {
            this.J1(view);
            x.C(view);
        }
        
        void G(final RecyclerView recyclerView, final x x) {
            this.i = false;
            this.Z0(recyclerView, x);
        }
        
        public boolean G0() {
            final RecyclerView b = this.b;
            return b != null && b.isFocused();
        }
        
        public void G1(final int n, @j0 final x x) {
            final View p2 = this.P(n);
            this.K1(n);
            x.C(p2);
        }
        
        public void H(final View view) {
            final m w0 = this.b.w0;
            if (w0 != null) {
                w0.k(RecyclerView.u0(view));
            }
        }
        
        public boolean H1(final Runnable runnable) {
            final RecyclerView b = this.b;
            return b != null && b.removeCallbacks(runnable);
        }
        
        @k0
        public View I(@j0 View b0) {
            final RecyclerView b2 = this.b;
            if (b2 == null) {
                return null;
            }
            b0 = b2.b0(b0);
            if (b0 == null) {
                return null;
            }
            if (this.a.n(b0)) {
                return null;
            }
            return b0;
        }
        
        public final boolean I0() {
            return this.l;
        }
        
        public void I1(@j0 final View view) {
            this.b.removeDetachedView(view, false);
        }
        
        @k0
        public View J(final int n) {
            for (int q = this.Q(), i = 0; i < q; ++i) {
                final View p = this.P(i);
                final g0 u0 = RecyclerView.u0(p);
                if (u0 != null) {
                    if (u0.getLayoutPosition() == n && !u0.shouldIgnore() && (this.b.O0.j() || !u0.isRemoved())) {
                        return p;
                    }
                }
            }
            return null;
        }
        
        public boolean J0(@j0 final x x, @j0 final d0 d0) {
            return false;
        }
        
        public void J1(final View view) {
            this.a.p(view);
        }
        
        public abstract q K();
        
        public boolean K0() {
            return this.k;
        }
        
        public void K1(final int n) {
            if (this.P(n) != null) {
                this.a.q(n);
            }
        }
        
        public q L(final Context context, final AttributeSet set) {
            return new q(context, set);
        }
        
        public boolean L1(@j0 final RecyclerView recyclerView, @j0 final View view, @j0 final Rect rect, final boolean b) {
            return this.M1(recyclerView, view, rect, b, false);
        }
        
        public q M(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            if (viewGroup$LayoutParams instanceof q) {
                return new q((q)viewGroup$LayoutParams);
            }
            if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
                return new q((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
            }
            return new q(viewGroup$LayoutParams);
        }
        
        public boolean M0() {
            final c0 g = this.g;
            return g != null && g.i();
        }
        
        public boolean M1(@j0 final RecyclerView recyclerView, @j0 final View view, @j0 final Rect rect, final boolean b, final boolean b2) {
            final int[] t = this.T(view, rect);
            final int n = t[0];
            final int n2 = t[1];
            if ((!b2 || this.H0(recyclerView, n, n2)) && (n != 0 || n2 != 0)) {
                if (b) {
                    recyclerView.scrollBy(n, n2);
                }
                else {
                    recyclerView.K1(n, n2);
                }
                return true;
            }
            return false;
        }
        
        public int N() {
            return -1;
        }
        
        public boolean N0(@j0 final View view, final boolean b, final boolean b2) {
            final boolean b3 = this.e.b(view, 24579) && this.f.b(view, 24579);
            if (b) {
                return b3;
            }
            return b3 ^ true;
        }
        
        public void N1() {
            final RecyclerView b = this.b;
            if (b != null) {
                b.requestLayout();
            }
        }
        
        public int O(@j0 final View view) {
            return ((q)view.getLayoutParams()).b.bottom;
        }
        
        public void O0(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
            final Rect b = ((q)view.getLayoutParams()).b;
            view.layout(n + b.left, n2 + b.top, n3 - b.right, n4 - b.bottom);
        }
        
        public void O1() {
            this.h = true;
        }
        
        @k0
        public View P(final int n) {
            final g a = this.a;
            View f;
            if (a != null) {
                f = a.f(n);
            }
            else {
                f = null;
            }
            return f;
        }
        
        public void P0(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
            final q q = (q)view.getLayoutParams();
            final Rect b = q.b;
            view.layout(n + b.left + q.leftMargin, n2 + b.top + q.topMargin, n3 - b.right - q.rightMargin, n4 - b.bottom - q.bottomMargin);
        }
        
        public int Q() {
            final g a = this.a;
            int g;
            if (a != null) {
                g = a.g();
            }
            else {
                g = 0;
            }
            return g;
        }
        
        public void Q0(@j0 final View view, int r, int r2) {
            final q q = (q)view.getLayoutParams();
            final Rect z0 = this.b.z0(view);
            final int left = z0.left;
            final int right = z0.right;
            final int top = z0.top;
            final int bottom = z0.bottom;
            r = R(this.z0(), this.A0(), this.o0() + this.p0() + (r + (left + right)), q.width, this.n());
            r2 = R(this.e0(), this.f0(), this.r0() + this.m0() + (r2 + (top + bottom)), q.height, this.o());
            if (this.c2(view, r, r2, q)) {
                view.measure(r, r2);
            }
        }
        
        public int Q1(final int n, final x x, final d0 d0) {
            return 0;
        }
        
        public void R0(@j0 final View view, int r, int r2) {
            final q q = (q)view.getLayoutParams();
            final Rect z0 = this.b.z0(view);
            final int left = z0.left;
            final int right = z0.right;
            final int top = z0.top;
            final int bottom = z0.bottom;
            r = R(this.z0(), this.A0(), this.o0() + this.p0() + q.leftMargin + q.rightMargin + (r + (left + right)), q.width, this.n());
            r2 = R(this.e0(), this.f0(), this.r0() + this.m0() + q.topMargin + q.bottomMargin + (r2 + (top + bottom)), q.height, this.o());
            if (this.c2(view, r, r2, q)) {
                view.measure(r, r2);
            }
        }
        
        public void R1(final int n) {
        }
        
        public void S0(final int i, final int n) {
            final View p2 = this.P(i);
            if (p2 != null) {
                this.D(i);
                this.k(p2, n);
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i);
            sb.append(this.b.toString());
            throw new IllegalArgumentException(sb.toString());
        }
        
        public int S1(final int n, final x x, final d0 d0) {
            return 0;
        }
        
        public void T0(@n0 final int n) {
            final RecyclerView b = this.b;
            if (b != null) {
                b.V0(n);
            }
        }
        
        @Deprecated
        public void T1(final boolean j) {
            this.j = j;
        }
        
        public boolean U() {
            final RecyclerView b = this.b;
            return b != null && b.M;
        }
        
        public void U0(@n0 final int n) {
            final RecyclerView b = this.b;
            if (b != null) {
                b.W0(n);
            }
        }
        
        void U1(final RecyclerView recyclerView) {
            this.W1(View$MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View$MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
        
        public int V(@j0 final x x, @j0 final d0 d0) {
            return -1;
        }
        
        public void V0(@k0 final h h, @k0 final h h2) {
        }
        
        public final void V1(final boolean l) {
            if (l != this.l) {
                this.l = l;
                this.m = 0;
                final RecyclerView b = this.b;
                if (b != null) {
                    b.H.L();
                }
            }
        }
        
        public int W(@j0 final View view) {
            return view.getBottom() + this.O(view);
        }
        
        public boolean W0(@j0 final RecyclerView recyclerView, @j0 final ArrayList<View> list, final int n, final int n2) {
            return false;
        }
        
        void W1(int n, final int n2) {
            this.q = View$MeasureSpec.getSize(n);
            n = View$MeasureSpec.getMode(n);
            this.o = n;
            if (n == 0 && !RecyclerView.n1) {
                this.q = 0;
            }
            this.r = View$MeasureSpec.getSize(n2);
            n = View$MeasureSpec.getMode(n2);
            if ((this.p = n) == 0 && !RecyclerView.n1) {
                this.r = 0;
            }
        }
        
        public void X(@j0 final View view, @j0 final Rect rect) {
            RecyclerView.w0(view, rect);
        }
        
        @androidx.annotation.i
        public void X0(final RecyclerView recyclerView) {
        }
        
        public void X1(final int n, final int n2) {
            RecyclerView.l(this.b, n, n2);
        }
        
        public int Y(@j0 final View view) {
            return view.getLeft() - this.j0(view);
        }
        
        @Deprecated
        public void Y0(final RecyclerView recyclerView) {
        }
        
        public void Y1(final Rect rect, final int n, final int n2) {
            this.X1(q(n, rect.width() + this.o0() + this.p0(), this.l0()), q(n2, rect.height() + this.r0() + this.m0(), this.k0()));
        }
        
        public int Z(@j0 final View view) {
            final Rect b = ((q)view.getLayoutParams()).b;
            return view.getMeasuredHeight() + b.top + b.bottom;
        }
        
        @androidx.annotation.i
        public void Z0(final RecyclerView recyclerView, final x x) {
            this.Y0(recyclerView);
        }
        
        void Z1(final int n, final int n2) {
            final int q = this.Q();
            if (q == 0) {
                this.b.H(n, n2);
                return;
            }
            int i = 0;
            int n3 = Integer.MIN_VALUE;
            int n4 = Integer.MIN_VALUE;
            int n5 = Integer.MAX_VALUE;
            int n6 = Integer.MAX_VALUE;
            while (i < q) {
                final View p2 = this.P(i);
                final Rect o = this.b.O;
                this.X(p2, o);
                final int left = o.left;
                int n7;
                if (left < (n7 = n5)) {
                    n7 = left;
                }
                final int right = o.right;
                int n8;
                if (right > (n8 = n3)) {
                    n8 = right;
                }
                final int top = o.top;
                int n9;
                if (top < (n9 = n6)) {
                    n9 = top;
                }
                final int bottom = o.bottom;
                int n10;
                if (bottom > (n10 = n4)) {
                    n10 = bottom;
                }
                ++i;
                n3 = n8;
                n4 = n10;
                n5 = n7;
                n6 = n9;
            }
            this.b.O.set(n5, n6, n3, n4);
            this.Y1(this.b.O, n, n2);
        }
        
        public int a0(@j0 final View view) {
            final Rect b = ((q)view.getLayoutParams()).b;
            return view.getMeasuredWidth() + b.left + b.right;
        }
        
        @k0
        public View a1(@j0 final View view, final int n, @j0 final x x, @j0 final d0 d0) {
            return null;
        }
        
        public void a2(final boolean k) {
            this.k = k;
        }
        
        public int b0(@j0 final View view) {
            return view.getRight() + this.u0(view);
        }
        
        public void b1(@j0 final AccessibilityEvent accessibilityEvent) {
            final RecyclerView b = this.b;
            this.c1(b.H, b.O0, accessibilityEvent);
        }
        
        void b2(final RecyclerView b) {
            int height;
            if (b == null) {
                this.b = null;
                this.a = null;
                height = 0;
                this.q = 0;
            }
            else {
                this.b = b;
                this.a = b.K;
                this.q = b.getWidth();
                height = b.getHeight();
            }
            this.r = height;
            this.o = 1073741824;
            this.p = 1073741824;
        }
        
        public void c(final View view) {
            this.d(view, -1);
        }
        
        public int c0(@j0 final View view) {
            return view.getTop() - this.x0(view);
        }
        
        public void c1(@j0 final x x, @j0 final d0 d0, @j0 final AccessibilityEvent accessibilityEvent) {
            final RecyclerView b = this.b;
            if (b != null) {
                if (accessibilityEvent != null) {
                    boolean scrollable;
                    final boolean b2 = scrollable = true;
                    if (!b.canScrollVertically(1)) {
                        scrollable = b2;
                        if (!this.b.canScrollVertically(-1)) {
                            scrollable = b2;
                            if (!this.b.canScrollHorizontally(-1)) {
                                scrollable = (this.b.canScrollHorizontally(1) && b2);
                            }
                        }
                    }
                    accessibilityEvent.setScrollable(scrollable);
                    final h r = this.b.R;
                    if (r != null) {
                        accessibilityEvent.setItemCount(r.getItemCount());
                    }
                }
            }
        }
        
        boolean c2(final View view, final int n, final int n2, final q q) {
            return view.isLayoutRequested() || !this.k || !L0(view.getWidth(), n, q.width) || !L0(view.getHeight(), n2, q.height);
        }
        
        public void d(final View view, final int n) {
            this.g(view, n, true);
        }
        
        @k0
        public View d0() {
            final RecyclerView b = this.b;
            if (b == null) {
                return null;
            }
            final View focusedChild = b.getFocusedChild();
            if (focusedChild != null && !this.a.n(focusedChild)) {
                return focusedChild;
            }
            return null;
        }
        
        void d1(final androidx.core.view.accessibility.d d) {
            final RecyclerView b = this.b;
            this.e1(b.H, b.O0, d);
        }
        
        boolean d2() {
            return false;
        }
        
        public void e(final View view) {
            this.f(view, -1);
        }
        
        @n0
        public int e0() {
            return this.r;
        }
        
        public void e1(@j0 final x x, @j0 final d0 d0, @j0 final androidx.core.view.accessibility.d d2) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                d2.a(8192);
                d2.D1(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                d2.a(4096);
                d2.D1(true);
            }
            d2.W0(androidx.core.view.accessibility.d.b.f(this.v0(x, d0), this.V(x, d0), this.J0(x, d0), this.w0(x, d0)));
        }
        
        boolean e2(final View view, final int n, final int n2, final q q) {
            return !this.k || !L0(view.getMeasuredWidth(), n, q.width) || !L0(view.getMeasuredHeight(), n2, q.height);
        }
        
        public void f(final View view, final int n) {
            this.g(view, n, false);
        }
        
        public int f0() {
            return this.p;
        }
        
        void f1(final View view, final androidx.core.view.accessibility.d d) {
            final g0 u0 = RecyclerView.u0(view);
            if (u0 != null && !u0.isRemoved() && !this.a.n(u0.itemView)) {
                final RecyclerView b = this.b;
                this.g1(b.H, b.O0, view, d);
            }
        }
        
        public void f2(final RecyclerView recyclerView, final d0 d0, final int n) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }
        
        public int g0() {
            final RecyclerView b = this.b;
            h adapter;
            if (b != null) {
                adapter = b.getAdapter();
            }
            else {
                adapter = null;
            }
            int itemCount;
            if (adapter != null) {
                itemCount = adapter.getItemCount();
            }
            else {
                itemCount = 0;
            }
            return itemCount;
        }
        
        public void g1(@j0 final x x, @j0 final d0 d0, @j0 final View view, @j0 final androidx.core.view.accessibility.d d2) {
        }
        
        public void g2(final c0 g) {
            final c0 g2 = this.g;
            if (g2 != null && g != g2 && g2.i()) {
                this.g.s();
            }
            (this.g = g).r(this.b, this);
        }
        
        public void h(final String s) {
            final RecyclerView b = this.b;
            if (b != null) {
                b.w(s);
            }
        }
        
        public int h0(@j0 final View view) {
            return RecyclerView.u0(view).getItemViewType();
        }
        
        @k0
        public View h1(@j0 final View view, final int n) {
            return null;
        }
        
        public void h2(@j0 final View view) {
            final g0 u0 = RecyclerView.u0(view);
            u0.stopIgnoring();
            u0.resetInternal();
            u0.addFlags(4);
        }
        
        public void i(final String s) {
            final RecyclerView b = this.b;
            if (b != null) {
                b.x(s);
            }
        }
        
        public int i0() {
            return androidx.core.view.j0.X((View)this.b);
        }
        
        public void i1(@j0 final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        void i2() {
            final c0 g = this.g;
            if (g != null) {
                g.s();
            }
        }
        
        public void j(@j0 final View view) {
            this.k(view, -1);
        }
        
        public int j0(@j0 final View view) {
            return ((q)view.getLayoutParams()).b.left;
        }
        
        public void j1(@j0 final RecyclerView recyclerView) {
        }
        
        public boolean j2() {
            return false;
        }
        
        public void k(@j0 final View view, final int n) {
            this.l(view, n, (q)view.getLayoutParams());
        }
        
        @n0
        public int k0() {
            return androidx.core.view.j0.c0((View)this.b);
        }
        
        public void k1(@j0 final RecyclerView recyclerView, final int n, final int n2, final int n3) {
        }
        
        public void l(@j0 final View view, final int n, final q q) {
            final g0 u0 = RecyclerView.u0(view);
            if (u0.isRemoved()) {
                this.b.L.b(u0);
            }
            else {
                this.b.L.p(u0);
            }
            this.a.c(view, n, (ViewGroup$LayoutParams)q, u0.isRemoved());
        }
        
        @n0
        public int l0() {
            return androidx.core.view.j0.d0((View)this.b);
        }
        
        public void l1(@j0 final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        public void m(@j0 final View view, @j0 final Rect rect) {
            final RecyclerView b = this.b;
            if (b == null) {
                rect.set(0, 0, 0, 0);
                return;
            }
            rect.set(b.z0(view));
        }
        
        @n0
        public int m0() {
            final RecyclerView b = this.b;
            int paddingBottom;
            if (b != null) {
                paddingBottom = b.getPaddingBottom();
            }
            else {
                paddingBottom = 0;
            }
            return paddingBottom;
        }
        
        public void m1(@j0 final RecyclerView recyclerView, final int n, final int n2) {
        }
        
        public boolean n() {
            return false;
        }
        
        @n0
        public int n0() {
            final RecyclerView b = this.b;
            int i0;
            if (b != null) {
                i0 = androidx.core.view.j0.i0((View)b);
            }
            else {
                i0 = 0;
            }
            return i0;
        }
        
        public void n1(@j0 final RecyclerView recyclerView, final int n, final int n2, @k0 final Object o) {
            this.m1(recyclerView, n, n2);
        }
        
        public boolean o() {
            return false;
        }
        
        @n0
        public int o0() {
            final RecyclerView b = this.b;
            int paddingLeft;
            if (b != null) {
                paddingLeft = b.getPaddingLeft();
            }
            else {
                paddingLeft = 0;
            }
            return paddingLeft;
        }
        
        public void o1(final x x, final d0 d0) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }
        
        public boolean p(final q q) {
            return q != null;
        }
        
        @n0
        public int p0() {
            final RecyclerView b = this.b;
            int paddingRight;
            if (b != null) {
                paddingRight = b.getPaddingRight();
            }
            else {
                paddingRight = 0;
            }
            return paddingRight;
        }
        
        public void p1(final d0 d0) {
        }
        
        @n0
        public int q0() {
            final RecyclerView b = this.b;
            int j0;
            if (b != null) {
                j0 = androidx.core.view.j0.j0((View)b);
            }
            else {
                j0 = 0;
            }
            return j0;
        }
        
        public void q1(@j0 final x x, @j0 final d0 d0, final int n, final int n2) {
            this.b.H(n, n2);
        }
        
        public void r(final int n, final int n2, final d0 d0, final c c) {
        }
        
        @n0
        public int r0() {
            final RecyclerView b = this.b;
            int paddingTop;
            if (b != null) {
                paddingTop = b.getPaddingTop();
            }
            else {
                paddingTop = 0;
            }
            return paddingTop;
        }
        
        @Deprecated
        public boolean r1(@j0 final RecyclerView recyclerView, @j0 final View view, @k0 final View view2) {
            return this.M0() || recyclerView.N0();
        }
        
        public void s(final int n, final c c) {
        }
        
        public int s0(@j0 final View view) {
            return ((q)view.getLayoutParams()).d();
        }
        
        public boolean s1(@j0 final RecyclerView recyclerView, @j0 final d0 d0, @j0 final View view, @k0 final View view2) {
            return this.r1(recyclerView, view, view2);
        }
        
        public int t(@j0 final d0 d0) {
            return 0;
        }
        
        public void t1(final Parcelable parcelable) {
        }
        
        public int u(@j0 final d0 d0) {
            return 0;
        }
        
        public int u0(@j0 final View view) {
            return ((q)view.getLayoutParams()).b.right;
        }
        
        @k0
        public Parcelable u1() {
            return null;
        }
        
        public int v(@j0 final d0 d0) {
            return 0;
        }
        
        public int v0(@j0 final x x, @j0 final d0 d0) {
            return -1;
        }
        
        public void v1(final int n) {
        }
        
        public int w(@j0 final d0 d0) {
            return 0;
        }
        
        public int w0(@j0 final x x, @j0 final d0 d0) {
            return 0;
        }
        
        void w1(final c0 c0) {
            if (this.g == c0) {
                this.g = null;
            }
        }
        
        public int x(@j0 final d0 d0) {
            return 0;
        }
        
        public int x0(@j0 final View view) {
            return ((q)view.getLayoutParams()).b.top;
        }
        
        boolean x1(final int n, @k0 final Bundle bundle) {
            final RecyclerView b = this.b;
            return this.y1(b.H, b.O0, n, bundle);
        }
        
        public int y(@j0 final d0 d0) {
            return 0;
        }
        
        public void y0(@j0 final View view, final boolean b, @j0 final Rect rect) {
            if (b) {
                final Rect b2 = ((q)view.getLayoutParams()).b;
                rect.set(-b2.left, -b2.top, view.getWidth() + b2.right, view.getHeight() + b2.bottom);
            }
            else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null) {
                final Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    final RectF q = this.b.Q;
                    q.set(rect);
                    matrix.mapRect(q);
                    rect.set((int)Math.floor(q.left), (int)Math.floor(q.top), (int)Math.ceil(q.right), (int)Math.ceil(q.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }
        
        public boolean y1(@j0 final x x, @j0 final d0 d0, int n, @k0 final Bundle bundle) {
            final RecyclerView b = this.b;
            if (b == null) {
                return false;
            }
            int n2 = 0;
            Label_0169: {
                Label_0167: {
                    int n3;
                    if (n != 4096) {
                        if (n != 8192) {
                            n = 0;
                            n2 = 0;
                            break Label_0169;
                        }
                        if (b.canScrollVertically(-1)) {
                            n = -(this.e0() - this.r0() - this.m0());
                        }
                        else {
                            n = 0;
                        }
                        n2 = n;
                        if (!this.b.canScrollHorizontally(-1)) {
                            break Label_0167;
                        }
                        n3 = -(this.z0() - this.o0() - this.p0());
                    }
                    else {
                        if (b.canScrollVertically(1)) {
                            n = this.e0() - this.r0() - this.m0();
                        }
                        else {
                            n = 0;
                        }
                        n2 = n;
                        if (!this.b.canScrollHorizontally(1)) {
                            break Label_0167;
                        }
                        n3 = this.z0() - this.o0() - this.p0();
                    }
                    final int n4 = n;
                    n = n3;
                    n2 = n4;
                    break Label_0169;
                }
                n = 0;
            }
            if (n2 == 0 && n == 0) {
                return false;
            }
            this.b.N1(n, n2, null, Integer.MIN_VALUE, true);
            return true;
        }
        
        public void z(@j0 final x x) {
            for (int i = this.Q() - 1; i >= 0; --i) {
                this.P1(x, i, this.P(i));
            }
        }
        
        @n0
        public int z0() {
            return this.q;
        }
        
        boolean z1(@j0 final View view, final int n, @k0 final Bundle bundle) {
            final RecyclerView b = this.b;
            return this.A1(b.H, b.O0, view, n, bundle);
        }
        
        public interface c
        {
            void a(final int p0, final int p1);
        }
        
        public static class d
        {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }
    }
    
    public static class q extends ViewGroup$MarginLayoutParams
    {
        g0 a;
        final Rect b;
        boolean c;
        boolean d;
        
        public q(final int n, final int n2) {
            super(n, n2);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
        
        public q(final Context context, final AttributeSet set) {
            super(context, set);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
        
        public q(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
        
        public q(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
        
        public q(final q q) {
            super((ViewGroup$LayoutParams)q);
            this.b = new Rect();
            this.c = true;
            this.d = false;
        }
        
        public int a() {
            return this.a.getAbsoluteAdapterPosition();
        }
        
        public int b() {
            return this.a.getBindingAdapterPosition();
        }
        
        @Deprecated
        public int c() {
            return this.a.getBindingAdapterPosition();
        }
        
        public int d() {
            return this.a.getLayoutPosition();
        }
        
        @Deprecated
        public int e() {
            return this.a.getPosition();
        }
        
        public boolean f() {
            return this.a.isUpdated();
        }
        
        public boolean g() {
            return this.a.isRemoved();
        }
        
        public boolean h() {
            return this.a.isInvalid();
        }
        
        public boolean i() {
            return this.a.needsUpdate();
        }
    }
    
    public interface r
    {
        void b(@j0 final View p0);
        
        void d(@j0 final View p0);
    }
    
    public abstract static class s
    {
        public abstract boolean a(final int p0, final int p1);
    }
    
    public interface t
    {
        void a(@j0 final RecyclerView p0, @j0 final MotionEvent p1);
        
        boolean c(@j0 final RecyclerView p0, @j0 final MotionEvent p1);
        
        void e(final boolean p0);
    }
    
    public abstract static class u
    {
        public void a(@j0 final RecyclerView recyclerView, final int n) {
        }
        
        public void b(@j0 final RecyclerView recyclerView, final int n, final int n2) {
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface v {
    }
    
    public static class w
    {
        private static final int c = 5;
        SparseArray<a> a;
        private int b;
        
        public w() {
            this.a = (SparseArray<a>)new SparseArray();
            this.b = 0;
        }
        
        private a h(final int n) {
            a a;
            if ((a = (a)this.a.get(n)) == null) {
                a = new a();
                this.a.put(n, (Object)a);
            }
            return a;
        }
        
        void a() {
            ++this.b;
        }
        
        public void b() {
            for (int i = 0; i < this.a.size(); ++i) {
                ((a)this.a.valueAt(i)).a.clear();
            }
        }
        
        void c() {
            --this.b;
        }
        
        void d(final int n, final long n2) {
            final a h = this.h(n);
            h.d = this.k(h.d, n2);
        }
        
        void e(final int n, final long n2) {
            final a h = this.h(n);
            h.c = this.k(h.c, n2);
        }
        
        @k0
        public g0 f(int i) {
            final a a = (a)this.a.get(i);
            if (a != null && !a.a.isEmpty()) {
                final ArrayList<g0> a2 = a.a;
                for (i = a2.size() - 1; i >= 0; --i) {
                    if (!a2.get(i).isAttachedToTransitionOverlay()) {
                        return a2.remove(i);
                    }
                }
            }
            return null;
        }
        
        public int g(final int n) {
            return this.h(n).a.size();
        }
        
        void i(final h h, final h h2, final boolean b) {
            if (h != null) {
                this.c();
            }
            if (!b && this.b == 0) {
                this.b();
            }
            if (h2 != null) {
                this.a();
            }
        }
        
        public void j(final g0 e) {
            final int itemViewType = e.getItemViewType();
            final ArrayList<g0> a = this.h(itemViewType).a;
            if (((a)this.a.get(itemViewType)).b <= a.size()) {
                return;
            }
            e.resetInternal();
            a.add(e);
        }
        
        long k(final long n, final long n2) {
            if (n == 0L) {
                return n2;
            }
            return n / 4L * 3L + n2 / 4L;
        }
        
        public void l(final int n, final int b) {
            final a h = this.h(n);
            h.b = b;
            final ArrayList<g0> a = h.a;
            while (a.size() > b) {
                a.remove(a.size() - 1);
            }
        }
        
        int m() {
            int i = 0;
            int n = 0;
            while (i < this.a.size()) {
                final ArrayList<g0> a = ((a)this.a.valueAt(i)).a;
                int n2 = n;
                if (a != null) {
                    n2 = n + a.size();
                }
                ++i;
                n = n2;
            }
            return n;
        }
        
        boolean n(final int n, final long n2, final long n3) {
            final long d = this.h(n).d;
            return d == 0L || n2 + d < n3;
        }
        
        boolean o(final int n, final long n2, final long n3) {
            final long c = this.h(n).c;
            return c == 0L || n2 + c < n3;
        }
        
        static class a
        {
            final ArrayList<g0> a;
            int b;
            long c;
            long d;
            
            a() {
                this.a = new ArrayList<g0>();
                this.b = 5;
                this.c = 0L;
                this.d = 0L;
            }
        }
    }
    
    public final class x
    {
        static final int j = 2;
        final ArrayList<g0> a;
        ArrayList<g0> b;
        final ArrayList<g0> c;
        private final List<g0> d;
        private int e;
        int f;
        w g;
        private e0 h;
        
        public x() {
            final ArrayList<g0> list = new ArrayList<g0>();
            this.a = list;
            this.b = null;
            this.c = new ArrayList<g0>();
            this.d = (List<g0>)Collections.unmodifiableList((List<?>)list);
            this.e = 2;
            this.f = 2;
        }
        
        private boolean I(@j0 final g0 g0, final int n, final int mPreLayoutPosition, long nanoTime) {
            g0.mBindingAdapter = null;
            g0.mOwnerRecyclerView = RecyclerView.this;
            final int itemViewType = g0.getItemViewType();
            final long nanoTime2 = RecyclerView.this.getNanoTime();
            if (nanoTime != Long.MAX_VALUE && !this.g.n(itemViewType, nanoTime2, nanoTime)) {
                return false;
            }
            RecyclerView.this.R.bindViewHolder(g0, n);
            nanoTime = RecyclerView.this.getNanoTime();
            this.g.d(g0.getItemViewType(), nanoTime - nanoTime2);
            this.b(g0);
            if (RecyclerView.this.O0.j()) {
                g0.mPreLayoutPosition = mPreLayoutPosition;
            }
            return true;
        }
        
        private void b(final g0 g0) {
            if (RecyclerView.this.L0()) {
                final View itemView = g0.itemView;
                if (androidx.core.view.j0.T(itemView) == 0) {
                    androidx.core.view.j0.P1(itemView, 1);
                }
                final androidx.recyclerview.widget.b0 v0 = RecyclerView.this.V0;
                if (v0 == null) {
                    return;
                }
                final androidx.core.view.a n = v0.n();
                if (n instanceof androidx.recyclerview.widget.b0.a) {
                    ((androidx.recyclerview.widget.b0.a)n).o(itemView);
                }
                androidx.core.view.j0.z1(itemView, n);
            }
        }
        
        private void r(final ViewGroup viewGroup, final boolean b) {
            for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                final View child = viewGroup.getChildAt(i);
                if (child instanceof ViewGroup) {
                    this.r((ViewGroup)child, true);
                }
            }
            if (!b) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
            }
            else {
                final int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }
        
        private void s(final g0 g0) {
            final View itemView = g0.itemView;
            if (itemView instanceof ViewGroup) {
                this.r((ViewGroup)itemView, false);
            }
        }
        
        void A() {
            for (int i = this.c.size() - 1; i >= 0; --i) {
                this.B(i);
            }
            this.c.clear();
            if (RecyclerView.p1) {
                RecyclerView.this.N0.b();
            }
        }
        
        void B(final int n) {
            this.a(this.c.get(n), true);
            this.c.remove(n);
        }
        
        public void C(@j0 final View view) {
            final g0 u0 = RecyclerView.u0(view);
            if (u0.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (u0.isScrap()) {
                u0.unScrap();
            }
            else if (u0.wasReturnedFromScrap()) {
                u0.clearReturnedFromScrapFlag();
            }
            this.D(u0);
            if (RecyclerView.this.w0 != null && !u0.isRecyclable()) {
                RecyclerView.this.w0.k(u0);
            }
        }
        
        void D(final g0 g0) {
            final boolean scrap = g0.isScrap();
            boolean b = false;
            final int n = 0;
            final int n2 = 1;
            if (scrap || g0.itemView.getParent() != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(g0.isScrap());
                sb.append(" isAttached:");
                if (g0.itemView.getParent() != null) {
                    b = true;
                }
                sb.append(b);
                sb.append(RecyclerView.this.Y());
                throw new IllegalArgumentException(sb.toString());
            }
            if (g0.isTmpDetached()) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(g0);
                sb2.append(RecyclerView.this.Y());
                throw new IllegalArgumentException(sb2.toString());
            }
            if (!g0.shouldIgnore()) {
                final boolean doesTransientStatePreventRecycling = g0.doesTransientStatePreventRecycling();
                final h r = RecyclerView.this.R;
                int n3 = 0;
                int n4 = 0;
                Label_0304: {
                    while (true) {
                        Label_0110: {
                            if (r != null && doesTransientStatePreventRecycling && r.onFailedToRecycleView(g0)) {
                                break Label_0110;
                            }
                            n3 = n;
                            if (g0.isRecyclable()) {
                                break Label_0110;
                            }
                            n4 = 0;
                            break Label_0304;
                        }
                        if (this.f > 0 && !g0.hasAnyOfTheFlags(526)) {
                            int size;
                            final int n5 = size = this.c.size();
                            if (n5 >= this.f && (size = n5) > 0) {
                                this.B(0);
                                size = n5 - 1;
                            }
                            int index = size;
                            if (RecyclerView.p1 && (index = size) > 0) {
                                index = size;
                                if (!RecyclerView.this.N0.d(g0.mPosition)) {
                                    --size;
                                    while (size >= 0 && RecyclerView.this.N0.d(this.c.get(size).mPosition)) {
                                        --size;
                                    }
                                    index = size + 1;
                                }
                            }
                            this.c.add(index, g0);
                            n3 = 1;
                        }
                        else {
                            n3 = 0;
                        }
                        if (n3 != 0) {
                            continue;
                        }
                        break;
                    }
                    this.a(g0, true);
                    n4 = n2;
                }
                RecyclerView.this.L.q(g0);
                if (n3 == 0 && n4 == 0 && doesTransientStatePreventRecycling) {
                    g0.mBindingAdapter = null;
                    g0.mOwnerRecyclerView = null;
                }
                return;
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            sb3.append(RecyclerView.this.Y());
            throw new IllegalArgumentException(sb3.toString());
        }
        
        void E(final View view) {
            final g0 u0 = RecyclerView.u0(view);
            ArrayList<g0> list;
            if (!u0.hasAnyOfTheFlags(12) && u0.isUpdated() && !RecyclerView.this.y(u0)) {
                if (this.b == null) {
                    this.b = new ArrayList<g0>();
                }
                u0.setScrapContainer(this, true);
                list = this.b;
            }
            else {
                if (u0.isInvalid() && !u0.isRemoved() && !RecyclerView.this.R.hasStableIds()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                    sb.append(RecyclerView.this.Y());
                    throw new IllegalArgumentException(sb.toString());
                }
                u0.setScrapContainer(this, false);
                list = this.a;
            }
            list.add(u0);
        }
        
        void F(final w g) {
            final w g2 = this.g;
            if (g2 != null) {
                g2.c();
            }
            this.g = g;
            if (g != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }
        
        void G(final e0 h) {
            this.h = h;
        }
        
        public void H(final int e) {
            this.e = e;
            this.L();
        }
        
        @k0
        g0 J(final int n, final boolean b, final long n2) {
            if (n >= 0 && n < RecyclerView.this.O0.d()) {
                final boolean j = RecyclerView.this.O0.j();
                final boolean b2 = true;
                g0 i = null;
                int n3 = 0;
                Label_0070: {
                    g0 g0;
                    if (j) {
                        i = this.i(n);
                        if ((g0 = i) != null) {
                            n3 = 1;
                            break Label_0070;
                        }
                    }
                    else {
                        g0 = null;
                    }
                    n3 = 0;
                    i = g0;
                }
                g0 g2 = i;
                int n4 = n3;
                if (i == null) {
                    final g0 g3 = g2 = this.n(n, b);
                    n4 = n3;
                    if (g3 != null) {
                        if (!this.M(g3)) {
                            if (!b) {
                                g3.addFlags(4);
                                if (g3.isScrap()) {
                                    RecyclerView.this.removeDetachedView(g3.itemView, false);
                                    g3.unScrap();
                                }
                                else if (g3.wasReturnedFromScrap()) {
                                    g3.clearReturnedFromScrapFlag();
                                }
                                this.D(g3);
                            }
                            g2 = null;
                            n4 = n3;
                        }
                        else {
                            n4 = 1;
                            g2 = g3;
                        }
                    }
                }
                g0 g4 = g2;
                int n5 = n4;
                int n7 = 0;
                g0 viewHolder = null;
                Label_0743: {
                    if (g2 == null) {
                        final int n6 = RecyclerView.this.J.n(n);
                        if (n6 < 0 || n6 >= RecyclerView.this.R.getItemCount()) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Inconsistency detected. Invalid item position ");
                            sb.append(n);
                            sb.append("(offset:");
                            sb.append(n6);
                            sb.append(").state:");
                            sb.append(RecyclerView.this.O0.d());
                            sb.append(RecyclerView.this.Y());
                            throw new IndexOutOfBoundsException(sb.toString());
                        }
                        final int itemViewType = RecyclerView.this.R.getItemViewType(n6);
                        n7 = n4;
                        if (RecyclerView.this.R.hasStableIds()) {
                            final g0 g5 = g2 = this.m(RecyclerView.this.R.getItemId(n6), itemViewType, b);
                            n7 = n4;
                            if (g5 != null) {
                                g5.mPosition = n6;
                                n7 = 1;
                                g2 = g5;
                            }
                        }
                        Object t0;
                        if ((t0 = g2) == null) {
                            final e0 h = this.h;
                            t0 = g2;
                            if (h != null) {
                                final View a = h.a(this, n, itemViewType);
                                t0 = g2;
                                if (a != null) {
                                    t0 = RecyclerView.this.t0(a);
                                    if (t0 == null) {
                                        final StringBuilder sb2 = new StringBuilder();
                                        sb2.append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                        sb2.append(RecyclerView.this.Y());
                                        throw new IllegalArgumentException(sb2.toString());
                                    }
                                    if (((g0)t0).shouldIgnore()) {
                                        final StringBuilder sb3 = new StringBuilder();
                                        sb3.append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                        sb3.append(RecyclerView.this.Y());
                                        throw new IllegalArgumentException(sb3.toString());
                                    }
                                }
                            }
                        }
                        g0 f;
                        if ((f = (g0)t0) == null) {
                            f = this.j().f(itemViewType);
                            if (f != null) {
                                f.resetInternal();
                                if (RecyclerView.m1) {
                                    this.s(f);
                                }
                            }
                        }
                        g4 = f;
                        n5 = n7;
                        if (f == null) {
                            final long nanoTime = RecyclerView.this.getNanoTime();
                            if (n2 != Long.MAX_VALUE && !this.g.o(itemViewType, nanoTime, n2)) {
                                return null;
                            }
                            final RecyclerView k = RecyclerView.this;
                            viewHolder = k.R.createViewHolder(k, itemViewType);
                            if (RecyclerView.p1) {
                                final RecyclerView f2 = RecyclerView.f0(viewHolder.itemView);
                                if (f2 != null) {
                                    viewHolder.mNestedRecyclerView = new WeakReference<RecyclerView>(f2);
                                }
                            }
                            this.g.e(itemViewType, RecyclerView.this.getNanoTime() - nanoTime);
                            break Label_0743;
                        }
                    }
                    viewHolder = g4;
                    n7 = n5;
                }
                if (n7 != 0 && !RecyclerView.this.O0.j() && viewHolder.hasAnyOfTheFlags(8192)) {
                    viewHolder.setFlags(0, 8192);
                    if (RecyclerView.this.O0.k) {
                        final int e = m.e(viewHolder);
                        final RecyclerView l = RecyclerView.this;
                        RecyclerView.this.n1(viewHolder, l.w0.w(l.O0, viewHolder, e | 0x1000, viewHolder.getUnmodifiedPayloads()));
                    }
                }
                boolean m = false;
                Label_0928: {
                    if (RecyclerView.this.O0.j() && viewHolder.isBound()) {
                        viewHolder.mPreLayoutPosition = n;
                    }
                    else if (!viewHolder.isBound() || viewHolder.needsUpdate() || viewHolder.isInvalid()) {
                        m = this.I(viewHolder, RecyclerView.this.J.n(n), n, n2);
                        break Label_0928;
                    }
                    m = false;
                }
                final ViewGroup$LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
                q layoutParams2 = null;
                Label_1005: {
                    ViewGroup$LayoutParams viewGroup$LayoutParams;
                    if (layoutParams == null) {
                        viewGroup$LayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    }
                    else {
                        if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            layoutParams2 = (q)layoutParams;
                            break Label_1005;
                        }
                        viewGroup$LayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                    }
                    layoutParams2 = (q)viewGroup$LayoutParams;
                    viewHolder.itemView.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
                layoutParams2.a = viewHolder;
                layoutParams2.d = (n7 != 0 && m && b2);
                return viewHolder;
            }
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Invalid item position ");
            sb4.append(n);
            sb4.append("(");
            sb4.append(n);
            sb4.append("). Item count:");
            sb4.append(RecyclerView.this.O0.d());
            sb4.append(RecyclerView.this.Y());
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        
        void K(final g0 o) {
            ArrayList<g0> list;
            if (o.mInChangeScrap) {
                list = this.b;
            }
            else {
                list = this.a;
            }
            list.remove(o);
            o.mScrapContainer = null;
            o.mInChangeScrap = false;
            o.clearReturnedFromScrapFlag();
        }
        
        void L() {
            final p s = RecyclerView.this.S;
            int m;
            if (s != null) {
                m = s.m;
            }
            else {
                m = 0;
            }
            this.f = this.e + m;
            for (int n = this.c.size() - 1; n >= 0 && this.c.size() > this.f; --n) {
                this.B(n);
            }
        }
        
        boolean M(final g0 obj) {
            if (obj.isRemoved()) {
                return RecyclerView.this.O0.j();
            }
            final int mPosition = obj.mPosition;
            if (mPosition < 0 || mPosition >= RecyclerView.this.R.getItemCount()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(obj);
                sb.append(RecyclerView.this.Y());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            final boolean j = RecyclerView.this.O0.j();
            boolean b = false;
            if (!j && RecyclerView.this.R.getItemViewType(obj.mPosition) != obj.getItemViewType()) {
                return false;
            }
            if (RecyclerView.this.R.hasStableIds()) {
                if (obj.getItemId() == RecyclerView.this.R.getItemId(obj.mPosition)) {
                    b = true;
                }
                return b;
            }
            return true;
        }
        
        void N(final int n, final int n2) {
            for (int i = this.c.size() - 1; i >= 0; --i) {
                final g0 g0 = this.c.get(i);
                if (g0 != null) {
                    final int mPosition = g0.mPosition;
                    if (mPosition >= n && mPosition < n2 + n) {
                        g0.addFlags(2);
                        this.B(i);
                    }
                }
            }
        }
        
        void a(@j0 final g0 g0, final boolean b) {
            RecyclerView.A(g0);
            final View itemView = g0.itemView;
            final androidx.recyclerview.widget.b0 v0 = RecyclerView.this.V0;
            if (v0 != null) {
                final androidx.core.view.a n = v0.n();
                androidx.core.view.a n2;
                if (n instanceof androidx.recyclerview.widget.b0.a) {
                    n2 = ((androidx.recyclerview.widget.b0.a)n).n(itemView);
                }
                else {
                    n2 = null;
                }
                androidx.core.view.j0.z1(itemView, n2);
            }
            if (b) {
                this.h(g0);
            }
            g0.mBindingAdapter = null;
            g0.mOwnerRecyclerView = null;
            this.j().j(g0);
        }
        
        public void c(@j0 final View view, final int i) {
            final g0 u0 = RecyclerView.u0(view);
            if (u0 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter");
                sb.append(RecyclerView.this.Y());
                throw new IllegalArgumentException(sb.toString());
            }
            final int n = RecyclerView.this.J.n(i);
            if (n >= 0 && n < RecyclerView.this.R.getItemCount()) {
                this.I(u0, n, i, Long.MAX_VALUE);
                final ViewGroup$LayoutParams layoutParams = u0.itemView.getLayoutParams();
                q layoutParams2 = null;
                Label_0118: {
                    ViewGroup$LayoutParams viewGroup$LayoutParams;
                    if (layoutParams == null) {
                        viewGroup$LayoutParams = RecyclerView.this.generateDefaultLayoutParams();
                    }
                    else {
                        if (RecyclerView.this.checkLayoutParams(layoutParams)) {
                            layoutParams2 = (q)layoutParams;
                            break Label_0118;
                        }
                        viewGroup$LayoutParams = RecyclerView.this.generateLayoutParams(layoutParams);
                    }
                    layoutParams2 = (q)viewGroup$LayoutParams;
                    u0.itemView.setLayoutParams((ViewGroup$LayoutParams)layoutParams2);
                }
                boolean d = true;
                layoutParams2.c = true;
                layoutParams2.a = u0;
                if (u0.itemView.getParent() != null) {
                    d = false;
                }
                layoutParams2.d = d;
                return;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Inconsistency detected. Invalid item position ");
            sb2.append(i);
            sb2.append("(offset:");
            sb2.append(n);
            sb2.append(").state:");
            sb2.append(RecyclerView.this.O0.d());
            sb2.append(RecyclerView.this.Y());
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        
        public void d() {
            this.a.clear();
            this.A();
        }
        
        void e() {
            final int size = this.c.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                this.c.get(i).clearOldPosition();
            }
            for (int size2 = this.a.size(), j = 0; j < size2; ++j) {
                this.a.get(j).clearOldPosition();
            }
            final ArrayList<g0> b = this.b;
            if (b != null) {
                for (int size3 = b.size(), k = n; k < size3; ++k) {
                    this.b.get(k).clearOldPosition();
                }
            }
        }
        
        void f() {
            this.a.clear();
            final ArrayList<g0> b = this.b;
            if (b != null) {
                b.clear();
            }
        }
        
        public int g(final int i) {
            if (i < 0 || i >= RecyclerView.this.O0.d()) {
                final StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i);
                sb.append(". State item count is ");
                sb.append(RecyclerView.this.O0.d());
                sb.append(RecyclerView.this.Y());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (!RecyclerView.this.O0.j()) {
                return i;
            }
            return RecyclerView.this.J.n(i);
        }
        
        void h(@j0 final g0 g0) {
            final y t = RecyclerView.this.T;
            if (t != null) {
                t.a(g0);
            }
            for (int size = RecyclerView.this.U.size(), i = 0; i < size; ++i) {
                ((y)RecyclerView.this.U.get(i)).a(g0);
            }
            final h r = RecyclerView.this.R;
            if (r != null) {
                r.onViewRecycled(g0);
            }
            final RecyclerView j = RecyclerView.this;
            if (j.O0 != null) {
                j.L.q(g0);
            }
        }
        
        g0 i(int i) {
            final ArrayList<g0> b = this.b;
            if (b != null) {
                final int size = b.size();
                if (size != 0) {
                    final int n = 0;
                    for (int j = 0; j < size; ++j) {
                        final g0 g0 = this.b.get(j);
                        if (!g0.wasReturnedFromScrap() && g0.getLayoutPosition() == i) {
                            g0.addFlags(32);
                            return g0;
                        }
                    }
                    if (RecyclerView.this.R.hasStableIds()) {
                        i = RecyclerView.this.J.n(i);
                        if (i > 0 && i < RecyclerView.this.R.getItemCount()) {
                            final long itemId = RecyclerView.this.R.getItemId(i);
                            g0 g2;
                            for (i = n; i < size; ++i) {
                                g2 = this.b.get(i);
                                if (!g2.wasReturnedFromScrap() && g2.getItemId() == itemId) {
                                    g2.addFlags(32);
                                    return g2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }
        
        w j() {
            if (this.g == null) {
                this.g = new w();
            }
            return this.g;
        }
        
        int k() {
            return this.a.size();
        }
        
        @j0
        public List<g0> l() {
            return this.d;
        }
        
        g0 m(final long n, final int n2, final boolean b) {
            for (int i = this.a.size() - 1; i >= 0; --i) {
                final g0 g0 = this.a.get(i);
                if (g0.getItemId() == n && !g0.wasReturnedFromScrap()) {
                    if (n2 == g0.getItemViewType()) {
                        g0.addFlags(32);
                        if (g0.isRemoved() && !RecyclerView.this.O0.j()) {
                            g0.setFlags(2, 14);
                        }
                        return g0;
                    }
                    if (!b) {
                        this.a.remove(i);
                        RecyclerView.this.removeDetachedView(g0.itemView, false);
                        this.z(g0.itemView);
                    }
                }
            }
            for (int j = this.c.size() - 1; j >= 0; --j) {
                final g0 g2 = this.c.get(j);
                if (g2.getItemId() == n && !g2.isAttachedToTransitionOverlay()) {
                    if (n2 == g2.getItemViewType()) {
                        if (!b) {
                            this.c.remove(j);
                        }
                        return g2;
                    }
                    if (!b) {
                        this.B(j);
                        return null;
                    }
                }
            }
            return null;
        }
        
        g0 n(int m, final boolean b) {
            final int size = this.a.size();
            final int n = 0;
            for (int i = 0; i < size; ++i) {
                final g0 g0 = this.a.get(i);
                if (!g0.wasReturnedFromScrap() && g0.getLayoutPosition() == m && !g0.isInvalid() && (RecyclerView.this.O0.h || !g0.isRemoved())) {
                    g0.addFlags(32);
                    return g0;
                }
            }
            if (!b) {
                final View e = RecyclerView.this.K.e(m);
                if (e != null) {
                    final g0 u0 = RecyclerView.u0(e);
                    RecyclerView.this.K.s(e);
                    m = RecyclerView.this.K.m(e);
                    if (m != -1) {
                        RecyclerView.this.K.d(m);
                        this.E(e);
                        u0.addFlags(8224);
                        return u0;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(u0);
                    sb.append(RecyclerView.this.Y());
                    throw new IllegalStateException(sb.toString());
                }
            }
            for (int size2 = this.c.size(), j = n; j < size2; ++j) {
                final g0 g2 = this.c.get(j);
                if (!g2.isInvalid() && g2.getLayoutPosition() == m && !g2.isAttachedToTransitionOverlay()) {
                    if (!b) {
                        this.c.remove(j);
                    }
                    return g2;
                }
            }
            return null;
        }
        
        View o(final int index) {
            return this.a.get(index).itemView;
        }
        
        @j0
        public View p(final int n) {
            return this.q(n, false);
        }
        
        View q(final int n, final boolean b) {
            return this.J(n, b, Long.MAX_VALUE).itemView;
        }
        
        void t() {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final q q = (q)this.c.get(i).itemView.getLayoutParams();
                if (q != null) {
                    q.c = true;
                }
            }
        }
        
        void u() {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final g0 g0 = this.c.get(i);
                if (g0 != null) {
                    g0.addFlags(6);
                    g0.addChangePayload(null);
                }
            }
            final h r = RecyclerView.this.R;
            if (r == null || !r.hasStableIds()) {
                this.A();
            }
        }
        
        void v(final int n, final int n2) {
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final g0 g0 = this.c.get(i);
                if (g0 != null && g0.mPosition >= n) {
                    g0.offsetPosition(n2, false);
                }
            }
        }
        
        void w(final int n, final int n2) {
            int n3;
            int n4;
            int n5;
            if (n < n2) {
                n3 = -1;
                n4 = n;
                n5 = n2;
            }
            else {
                n3 = 1;
                n5 = n;
                n4 = n2;
            }
            for (int size = this.c.size(), i = 0; i < size; ++i) {
                final g0 g0 = this.c.get(i);
                if (g0 != null) {
                    final int mPosition = g0.mPosition;
                    if (mPosition >= n4) {
                        if (mPosition <= n5) {
                            if (mPosition == n) {
                                g0.offsetPosition(n2 - n, false);
                            }
                            else {
                                g0.offsetPosition(n3, false);
                            }
                        }
                    }
                }
            }
        }
        
        void x(final int n, final int n2, final boolean b) {
            for (int i = this.c.size() - 1; i >= 0; --i) {
                final g0 g0 = this.c.get(i);
                if (g0 != null) {
                    final int mPosition = g0.mPosition;
                    if (mPosition >= n + n2) {
                        g0.offsetPosition(-n2, b);
                    }
                    else if (mPosition >= n) {
                        g0.addFlags(8);
                        this.B(i);
                    }
                }
            }
        }
        
        void y(final h h, final h h2, final boolean b) {
            this.d();
            this.j().i(h, h2, b);
        }
        
        void z(final View view) {
            final g0 u0 = RecyclerView.u0(view);
            u0.mScrapContainer = null;
            u0.mInChangeScrap = false;
            u0.clearReturnedFromScrapFlag();
            this.D(u0);
        }
    }
    
    public interface y
    {
        void a(@j0 final g0 p0);
    }
    
    private class z extends j
    {
        z() {
        }
        
        @Override
        public void a() {
            RecyclerView.this.x(null);
            final RecyclerView a = RecyclerView.this;
            a.l1(a.O0.g = true);
            if (!RecyclerView.this.J.q()) {
                RecyclerView.this.requestLayout();
            }
        }
        
        @Override
        public void c(final int n, final int n2, final Object o) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.J.s(n, n2, o)) {
                this.h();
            }
        }
        
        @Override
        public void d(final int n, final int n2) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.J.t(n, n2)) {
                this.h();
            }
        }
        
        @Override
        public void e(final int n, final int n2, final int n3) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.J.u(n, n2, n3)) {
                this.h();
            }
        }
        
        @Override
        public void f(final int n, final int n2) {
            RecyclerView.this.x(null);
            if (RecyclerView.this.J.v(n, n2)) {
                this.h();
            }
        }
        
        @Override
        public void g() {
            final RecyclerView a = RecyclerView.this;
            if (a.I == null) {
                return;
            }
            final h r = a.R;
            if (r != null && r.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }
        
        void h() {
            if (RecyclerView.o1) {
                final RecyclerView a = RecyclerView.this;
                if (a.c0 && a.b0) {
                    androidx.core.view.j0.n1((View)a, a.N);
                    return;
                }
            }
            final RecyclerView a2 = RecyclerView.this;
            a2.k0 = true;
            a2.requestLayout();
        }
    }
}
