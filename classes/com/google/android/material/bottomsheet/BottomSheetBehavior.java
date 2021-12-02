// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.util.Log;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import androidx.annotation.t0;
import androidx.annotation.b1;
import androidx.annotation.n0;
import android.view.MotionEvent;
import androidx.annotation.t;
import android.view.ViewGroup$LayoutParams;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.content.res.ColorStateList;
import androidx.core.view.accessibility.g;
import java.util.HashMap;
import androidx.annotation.w0;
import android.view.ViewParent;
import androidx.core.view.x0;
import com.google.android.material.internal.b0;
import android.util.TypedValue;
import android.content.res.TypedArray;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import com.google.android.material.resources.c;
import android.util.AttributeSet;
import android.content.Context;
import o2.a;
import android.animation.ValueAnimator;
import com.google.android.material.shape.o;
import com.google.android.material.shape.j;
import java.util.Map;
import android.view.VelocityTracker;
import androidx.annotation.j0;
import java.util.ArrayList;
import java.lang.ref.WeakReference;
import androidx.annotation.k0;
import androidx.customview.widget.d;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;

public class BottomSheetBehavior<V extends View> extends c<V>
{
    public static final int Y = 1;
    public static final int Z = 2;
    public static final int a0 = 3;
    public static final int b0 = 4;
    public static final int c0 = 5;
    public static final int d0 = 6;
    public static final int e0 = -1;
    public static final int f0 = 1;
    public static final int g0 = 2;
    public static final int h0 = 4;
    public static final int i0 = 8;
    public static final int j0 = -1;
    public static final int k0 = 0;
    private static final String l0 = "BottomSheetBehavior";
    private static final int m0 = 500;
    private static final float n0 = 0.5f;
    private static final float o0 = 0.1f;
    private static final int p0 = 500;
    private static final int q0 = -1;
    private static final int r0;
    float A;
    int B;
    float C;
    boolean D;
    private boolean E;
    private boolean F;
    int G;
    @k0
    androidx.customview.widget.d H;
    private boolean I;
    private int J;
    private boolean K;
    private int L;
    int M;
    int N;
    @k0
    WeakReference<V> O;
    @k0
    WeakReference<View> P;
    @j0
    private final ArrayList<g> Q;
    @k0
    private VelocityTracker R;
    int S;
    private int T;
    boolean U;
    @k0
    private Map<View, Integer> V;
    private int W;
    private final androidx.customview.widget.d.c X;
    private int a;
    private boolean b;
    private boolean c;
    private float d;
    private int e;
    private boolean f;
    private int g;
    private int h;
    private boolean i;
    private com.google.android.material.shape.j j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private o t;
    private boolean u;
    private j v;
    @k0
    private ValueAnimator w;
    int x;
    int y;
    int z;
    
    static {
        r0 = a.n.ua;
    }
    
    public BottomSheetBehavior() {
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<g>();
        this.W = -1;
        this.X = new androidx.customview.widget.d.c() {
            private boolean a(@j0 final View view) {
                final int top = view.getTop();
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                return top > (a.N + a.g0()) / 2;
            }
            
            @Override
            public int clampViewPositionHorizontal(@j0 final View view, final int n, final int n2) {
                return view.getLeft();
            }
            
            @Override
            public int clampViewPositionVertical(@j0 final View view, final int n, int n2) {
                final int g0 = BottomSheetBehavior.this.g0();
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.D) {
                    n2 = a.N;
                }
                else {
                    n2 = a.B;
                }
                return q.a.c(n, g0, n2);
            }
            
            @Override
            public int getViewVerticalDragRange(@j0 final View view) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.D) {
                    return a.N;
                }
                return a.B;
            }
            
            @Override
            public void onViewDragStateChanged(final int n) {
                if (n == 1 && BottomSheetBehavior.this.F) {
                    BottomSheetBehavior.this.L0(1);
                }
            }
            
            @Override
            public void onViewPositionChanged(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
                BottomSheetBehavior.this.d0(n2);
            }
            
            @Override
            public void onViewReleased(@j0 final View view, final float n, final float n2) {
                int n3 = 4;
                int n4 = 0;
                Label_0405: {
                    Label_0284: {
                        Label_0028: {
                            Label_0019: {
                                if (n2 >= 0.0f) {
                                    final BottomSheetBehavior a = BottomSheetBehavior.this;
                                    Label_0275: {
                                        Label_0185: {
                                            if (!a.D || !a.Q0(view, n2)) {
                                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                                    if (!BottomSheetBehavior.this.b) {
                                                        final int top = view.getTop();
                                                        if (Math.abs(top - BottomSheetBehavior.this.z) < Math.abs(top - BottomSheetBehavior.this.B)) {
                                                            break Label_0275;
                                                        }
                                                    }
                                                }
                                                else {
                                                    final int top2 = view.getTop();
                                                    if (BottomSheetBehavior.this.b) {
                                                        if (Math.abs(top2 - BottomSheetBehavior.this.y) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                                                            break Label_0019;
                                                        }
                                                    }
                                                    else {
                                                        final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                                                        final int z = a2.z;
                                                        if (top2 < z) {
                                                            if (top2 < Math.abs(top2 - a2.B)) {
                                                                break Label_0185;
                                                            }
                                                            break Label_0275;
                                                        }
                                                        else if (Math.abs(top2 - z) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                                                            break Label_0275;
                                                        }
                                                    }
                                                }
                                                n4 = BottomSheetBehavior.this.B;
                                                break Label_0405;
                                            }
                                            if ((Math.abs(n) < Math.abs(n2) && n2 > 500.0f) || this.a(view)) {
                                                n4 = BottomSheetBehavior.this.N;
                                                n3 = 5;
                                                break Label_0405;
                                            }
                                            if (BottomSheetBehavior.this.b) {
                                                break Label_0019;
                                            }
                                            if (Math.abs(view.getTop() - BottomSheetBehavior.this.g0()) >= Math.abs(view.getTop() - BottomSheetBehavior.this.z)) {
                                                break Label_0275;
                                            }
                                        }
                                        n4 = BottomSheetBehavior.this.g0();
                                        break Label_0028;
                                    }
                                    n4 = BottomSheetBehavior.this.z;
                                    break Label_0284;
                                }
                                if (!BottomSheetBehavior.this.b) {
                                    final int top3 = view.getTop();
                                    final BottomSheetBehavior a3 = BottomSheetBehavior.this;
                                    n4 = a3.z;
                                    if (top3 > n4) {
                                        break Label_0284;
                                    }
                                    n4 = a3.g0();
                                    break Label_0028;
                                }
                            }
                            n4 = BottomSheetBehavior.this.y;
                        }
                        n3 = 3;
                        break Label_0405;
                    }
                    n3 = 6;
                }
                BottomSheetBehavior.this.R0(view, n3, n4, true);
            }
            
            @Override
            public boolean tryCaptureView(@j0 final View view, final int n) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                final int g = a.G;
                boolean b = true;
                if (g == 1) {
                    return false;
                }
                if (a.U) {
                    return false;
                }
                if (g == 3 && a.S == n) {
                    final WeakReference<View> p2 = a.P;
                    View view2;
                    if (p2 != null) {
                        view2 = p2.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                final WeakReference<V> o = BottomSheetBehavior.this.O;
                if (o == null || o.get() != view) {
                    b = false;
                }
                return b;
            }
        };
    }
    
    public BottomSheetBehavior(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.a = 0;
        this.b = true;
        this.c = false;
        this.k = -1;
        this.v = null;
        this.A = 0.5f;
        this.C = -1.0f;
        this.F = true;
        this.G = 4;
        this.Q = new ArrayList<g>();
        this.W = -1;
        this.X = new androidx.customview.widget.d.c() {
            private boolean a(@j0 final View view) {
                final int top = view.getTop();
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                return top > (a.N + a.g0()) / 2;
            }
            
            @Override
            public int clampViewPositionHorizontal(@j0 final View view, final int n, final int n2) {
                return view.getLeft();
            }
            
            @Override
            public int clampViewPositionVertical(@j0 final View view, final int n, int n2) {
                final int g0 = BottomSheetBehavior.this.g0();
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.D) {
                    n2 = a.N;
                }
                else {
                    n2 = a.B;
                }
                return q.a.c(n, g0, n2);
            }
            
            @Override
            public int getViewVerticalDragRange(@j0 final View view) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                if (a.D) {
                    return a.N;
                }
                return a.B;
            }
            
            @Override
            public void onViewDragStateChanged(final int n) {
                if (n == 1 && BottomSheetBehavior.this.F) {
                    BottomSheetBehavior.this.L0(1);
                }
            }
            
            @Override
            public void onViewPositionChanged(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
                BottomSheetBehavior.this.d0(n2);
            }
            
            @Override
            public void onViewReleased(@j0 final View view, final float n, final float n2) {
                int n3 = 4;
                int n4 = 0;
                Label_0405: {
                    Label_0284: {
                        Label_0028: {
                            Label_0019: {
                                if (n2 >= 0.0f) {
                                    final BottomSheetBehavior a = BottomSheetBehavior.this;
                                    Label_0275: {
                                        Label_0185: {
                                            if (!a.D || !a.Q0(view, n2)) {
                                                if (n2 != 0.0f && Math.abs(n) <= Math.abs(n2)) {
                                                    if (!BottomSheetBehavior.this.b) {
                                                        final int top = view.getTop();
                                                        if (Math.abs(top - BottomSheetBehavior.this.z) < Math.abs(top - BottomSheetBehavior.this.B)) {
                                                            break Label_0275;
                                                        }
                                                    }
                                                }
                                                else {
                                                    final int top2 = view.getTop();
                                                    if (BottomSheetBehavior.this.b) {
                                                        if (Math.abs(top2 - BottomSheetBehavior.this.y) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                                                            break Label_0019;
                                                        }
                                                    }
                                                    else {
                                                        final BottomSheetBehavior a2 = BottomSheetBehavior.this;
                                                        final int z = a2.z;
                                                        if (top2 < z) {
                                                            if (top2 < Math.abs(top2 - a2.B)) {
                                                                break Label_0185;
                                                            }
                                                            break Label_0275;
                                                        }
                                                        else if (Math.abs(top2 - z) < Math.abs(top2 - BottomSheetBehavior.this.B)) {
                                                            break Label_0275;
                                                        }
                                                    }
                                                }
                                                n4 = BottomSheetBehavior.this.B;
                                                break Label_0405;
                                            }
                                            if ((Math.abs(n) < Math.abs(n2) && n2 > 500.0f) || this.a(view)) {
                                                n4 = BottomSheetBehavior.this.N;
                                                n3 = 5;
                                                break Label_0405;
                                            }
                                            if (BottomSheetBehavior.this.b) {
                                                break Label_0019;
                                            }
                                            if (Math.abs(view.getTop() - BottomSheetBehavior.this.g0()) >= Math.abs(view.getTop() - BottomSheetBehavior.this.z)) {
                                                break Label_0275;
                                            }
                                        }
                                        n4 = BottomSheetBehavior.this.g0();
                                        break Label_0028;
                                    }
                                    n4 = BottomSheetBehavior.this.z;
                                    break Label_0284;
                                }
                                if (!BottomSheetBehavior.this.b) {
                                    final int top3 = view.getTop();
                                    final BottomSheetBehavior a3 = BottomSheetBehavior.this;
                                    n4 = a3.z;
                                    if (top3 > n4) {
                                        break Label_0284;
                                    }
                                    n4 = a3.g0();
                                    break Label_0028;
                                }
                            }
                            n4 = BottomSheetBehavior.this.y;
                        }
                        n3 = 3;
                        break Label_0405;
                    }
                    n3 = 6;
                }
                BottomSheetBehavior.this.R0(view, n3, n4, true);
            }
            
            @Override
            public boolean tryCaptureView(@j0 final View view, final int n) {
                final BottomSheetBehavior a = BottomSheetBehavior.this;
                final int g = a.G;
                boolean b = true;
                if (g == 1) {
                    return false;
                }
                if (a.U) {
                    return false;
                }
                if (g == 3 && a.S == n) {
                    final WeakReference<View> p2 = a.P;
                    View view2;
                    if (p2 != null) {
                        view2 = p2.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && view2.canScrollVertically(-1)) {
                        return false;
                    }
                }
                final WeakReference<V> o = BottomSheetBehavior.this.O;
                if (o == null || o.get() != view) {
                    b = false;
                }
                return b;
            }
        };
        this.h = context.getResources().getDimensionPixelSize(o2.a.f.e5);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.A4);
        this.i = obtainStyledAttributes.hasValue(o2.a.o.R4);
        final int d4 = o2.a.o.D4;
        final boolean hasValue = obtainStyledAttributes.hasValue(d4);
        if (hasValue) {
            this.a0(context, set, hasValue, com.google.android.material.resources.c.a(context, obtainStyledAttributes, d4));
        }
        else {
            this.Z(context, set, hasValue);
        }
        this.b0();
        if (Build$VERSION.SDK_INT >= 21) {
            this.C = obtainStyledAttributes.getDimension(o2.a.o.C4, -1.0f);
        }
        final int b4 = o2.a.o.B4;
        if (obtainStyledAttributes.hasValue(b4)) {
            this.F0(obtainStyledAttributes.getDimensionPixelSize(b4, -1));
        }
        final int j4 = o2.a.o.J4;
        final TypedValue peekValue = obtainStyledAttributes.peekValue(j4);
        Label_0257: {
            if (peekValue != null) {
                final int data = peekValue.data;
                if (data == -1) {
                    this.G0(data);
                    break Label_0257;
                }
            }
            this.G0(obtainStyledAttributes.getDimensionPixelSize(j4, -1));
        }
        this.E0(obtainStyledAttributes.getBoolean(o2.a.o.I4, false));
        this.C0(obtainStyledAttributes.getBoolean(o2.a.o.M4, false));
        this.B0(obtainStyledAttributes.getBoolean(o2.a.o.G4, true));
        this.J0(obtainStyledAttributes.getBoolean(o2.a.o.L4, false));
        this.z0(obtainStyledAttributes.getBoolean(o2.a.o.E4, true));
        this.I0(obtainStyledAttributes.getInt(o2.a.o.K4, 0));
        this.D0(obtainStyledAttributes.getFloat(o2.a.o.H4, 0.5f));
        final int f4 = o2.a.o.F4;
        final TypedValue peekValue2 = obtainStyledAttributes.peekValue(f4);
        int n;
        if (peekValue2 != null && peekValue2.type == 16) {
            n = peekValue2.data;
        }
        else {
            n = obtainStyledAttributes.getDimensionPixelOffset(f4, 0);
        }
        this.A0(n);
        this.n = obtainStyledAttributes.getBoolean(o2.a.o.N4, false);
        this.o = obtainStyledAttributes.getBoolean(o2.a.o.O4, false);
        this.p = obtainStyledAttributes.getBoolean(o2.a.o.P4, false);
        this.q = obtainStyledAttributes.getBoolean(o2.a.o.Q4, true);
        obtainStyledAttributes.recycle();
        this.d = (float)ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
    
    private void N0(@j0 final View view) {
        final boolean b = Build$VERSION.SDK_INT >= 29 && !this.s0() && !this.f;
        if (!this.n && !this.o && !this.p && !b) {
            return;
        }
        com.google.android.material.internal.b0.d(view, (b0.e)new b0.e() {
            @Override
            public x0 a(final View view, final x0 x0, final b0.f f) {
                BottomSheetBehavior.this.s = x0.r();
                final boolean j = b0.j(view);
                int paddingBottom = view.getPaddingBottom();
                int paddingLeft = view.getPaddingLeft();
                int paddingRight = view.getPaddingRight();
                if (BottomSheetBehavior.this.n) {
                    BottomSheetBehavior.this.r = x0.o();
                    paddingBottom = f.d + BottomSheetBehavior.this.r;
                }
                if (BottomSheetBehavior.this.o) {
                    int n;
                    if (j) {
                        n = f.c;
                    }
                    else {
                        n = f.a;
                    }
                    paddingLeft = n + x0.p();
                }
                if (BottomSheetBehavior.this.p) {
                    int n2;
                    if (j) {
                        n2 = f.a;
                    }
                    else {
                        n2 = f.c;
                    }
                    paddingRight = n2 + x0.q();
                }
                view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
                if (b) {
                    BottomSheetBehavior.this.l = x0.h().d;
                }
                if (BottomSheetBehavior.this.n || b) {
                    BottomSheetBehavior.this.V0(false);
                }
                return x0;
            }
        });
    }
    
    private void P0(final int n) {
        final View view = this.O.get();
        if (view == null) {
            return;
        }
        final ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && androidx.core.view.j0.N0(view)) {
            view.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    BottomSheetBehavior.this.O0(view, n);
                }
            });
        }
        else {
            this.O0(view, n);
        }
    }
    
    private void S0() {
        final WeakReference<V> o = this.O;
        if (o == null) {
            return;
        }
        final View view = o.get();
        if (view == null) {
            return;
        }
        androidx.core.view.j0.p1(view, 524288);
        androidx.core.view.j0.p1(view, 262144);
        androidx.core.view.j0.p1(view, 1048576);
        final int w = this.W;
        if (w != -1) {
            androidx.core.view.j0.p1(view, w);
        }
        final boolean b = this.b;
        int n = 6;
        if (!b && this.G != 6) {
            this.W = this.T((V)view, o2.a.m.D, 6);
        }
        if (this.D && this.G != 5) {
            this.v0((V)view, androidx.core.view.accessibility.d.a.z, 5);
        }
        final int g = this.G;
        androidx.core.view.accessibility.d.a a;
        if (g != 3) {
            if (g != 4) {
                if (g != 6) {
                    return;
                }
                this.v0((V)view, androidx.core.view.accessibility.d.a.y, 4);
                this.v0((V)view, androidx.core.view.accessibility.d.a.x, 3);
                return;
            }
            else {
                if (this.b) {
                    n = 3;
                }
                a = androidx.core.view.accessibility.d.a.x;
            }
        }
        else {
            if (this.b) {
                n = 4;
            }
            a = androidx.core.view.accessibility.d.a.y;
        }
        this.v0((V)view, a, n);
    }
    
    private int T(final V v, @w0 final int n, final int n2) {
        return androidx.core.view.j0.b(v, v.getResources().getString(n), this.Y(n2));
    }
    
    private void T0(final int n) {
        if (n == 2) {
            return;
        }
        final boolean u = n == 3;
        if (this.u != u) {
            this.u = u;
            if (this.j != null) {
                final ValueAnimator w = this.w;
                if (w != null) {
                    if (w.isRunning()) {
                        this.w.reverse();
                    }
                    else {
                        float n2;
                        if (u) {
                            n2 = 0.0f;
                        }
                        else {
                            n2 = 1.0f;
                        }
                        this.w.setFloatValues(new float[] { 1.0f - n2, n2 });
                        this.w.start();
                    }
                }
            }
        }
    }
    
    private void U0(final boolean b) {
        final WeakReference<V> o = this.O;
        if (o == null) {
            return;
        }
        final ViewParent parent = o.get().getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        final CoordinatorLayout coordinatorLayout = (CoordinatorLayout)parent;
        final int childCount = coordinatorLayout.getChildCount();
        if (Build$VERSION.SDK_INT >= 16 && b) {
            if (this.V != null) {
                return;
            }
            this.V = new HashMap<View, Integer>(childCount);
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = coordinatorLayout.getChildAt(i);
            if (child != this.O.get()) {
                int intValue;
                if (b) {
                    if (Build$VERSION.SDK_INT >= 16) {
                        this.V.put(child, child.getImportantForAccessibility());
                    }
                    if (!this.c) {
                        continue;
                    }
                    intValue = 4;
                }
                else {
                    if (!this.c) {
                        continue;
                    }
                    final Map<View, Integer> v = this.V;
                    if (v == null || !v.containsKey(child)) {
                        continue;
                    }
                    intValue = this.V.get(child);
                }
                androidx.core.view.j0.P1(child, intValue);
            }
        }
        if (!b) {
            this.V = null;
        }
        else if (this.c) {
            this.O.get().sendAccessibilityEvent(8);
        }
    }
    
    private void V() {
        final int x = this.X();
        if (this.b) {
            this.B = Math.max(this.N - x, this.y);
        }
        else {
            this.B = this.N - x;
        }
    }
    
    private void V0(final boolean b) {
        if (this.O != null) {
            this.V();
            if (this.G == 4) {
                final View view = this.O.get();
                if (view != null) {
                    if (b) {
                        this.P0(this.G);
                    }
                    else {
                        view.requestLayout();
                    }
                }
            }
        }
    }
    
    private void W() {
        this.z = (int)(this.N * (1.0f - this.A));
    }
    
    private int X() {
        if (this.f) {
            return Math.min(Math.max(this.g, this.N - this.M * 9 / 16), this.L) + this.r;
        }
        if (!this.m && !this.n) {
            final int l = this.l;
            if (l > 0) {
                return Math.max(this.e, l + this.h);
            }
        }
        return this.e + this.r;
    }
    
    private androidx.core.view.accessibility.g Y(final int n) {
        return new androidx.core.view.accessibility.g() {
            @Override
            public boolean a(@j0 final View view, @k0 final a a) {
                BottomSheetBehavior.this.K0(n);
                return true;
            }
        };
    }
    
    private void Z(@j0 final Context context, final AttributeSet set, final boolean b) {
        this.a0(context, set, b, null);
    }
    
    private void a0(@j0 final Context context, final AttributeSet set, final boolean b, @k0 final ColorStateList list) {
        if (this.i) {
            this.t = com.google.android.material.shape.o.e(context, set, o2.a.c.N0, BottomSheetBehavior.r0).m();
            (this.j = new com.google.android.material.shape.j(this.t)).Y(context);
            if (b && list != null) {
                this.j.n0(list);
            }
            else {
                final TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.j.setTint(typedValue.data);
            }
        }
    }
    
    private void b0() {
        (this.w = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f })).setDuration(500L);
        this.w.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                if (BottomSheetBehavior.this.j != null) {
                    BottomSheetBehavior.this.j.o0(floatValue);
                }
            }
        });
    }
    
    @j0
    public static <V extends View> BottomSheetBehavior<V> f0(@j0 final V v) {
        final ViewGroup$LayoutParams layoutParams = v.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final c f = ((CoordinatorLayout.g)layoutParams).f();
        if (f instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior<V>)f;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }
    
    private float p0() {
        final VelocityTracker r = this.R;
        if (r == null) {
            return 0.0f;
        }
        r.computeCurrentVelocity(1000, this.d);
        return this.R.getYVelocity(this.S);
    }
    
    private void v0(final V v, final androidx.core.view.accessibility.d.a a, final int n) {
        androidx.core.view.j0.s1(v, a, null, this.Y(n));
    }
    
    private void w0() {
        this.S = -1;
        final VelocityTracker r = this.R;
        if (r != null) {
            r.recycle();
            this.R = null;
        }
    }
    
    private void x0(@j0 final i i) {
        final int a = this.a;
        if (a == 0) {
            return;
        }
        if (a == -1 || (a & 0x1) == 0x1) {
            this.e = i.J;
        }
        if (a == -1 || (a & 0x2) == 0x2) {
            this.b = i.K;
        }
        if (a == -1 || (a & 0x4) == 0x4) {
            this.D = i.L;
        }
        if (a == -1 || (a & 0x8) == 0x8) {
            this.E = i.M;
        }
    }
    
    public void A0(final int x) {
        if (x >= 0) {
            this.x = x;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }
    
    @Override
    public boolean B(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n, final int n2) {
        boolean b = false;
        this.J = 0;
        this.K = false;
        if ((n & 0x2) != 0x0) {
            b = true;
        }
        return b;
    }
    
    public void B0(final boolean b) {
        if (this.b == b) {
            return;
        }
        this.b = b;
        if (this.O != null) {
            this.V();
        }
        int g;
        if (this.b && this.G == 6) {
            g = 3;
        }
        else {
            g = this.G;
        }
        this.L0(g);
        this.S0();
    }
    
    public void C0(final boolean m) {
        this.m = m;
    }
    
    @Override
    public void D(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, int n) {
        n = v.getTop();
        final int g0 = this.g0();
        int n2 = 3;
        if (n == g0) {
            this.L0(3);
            return;
        }
        final WeakReference<View> p4 = this.P;
        if (p4 != null && view == p4.get()) {
            if (this.K) {
                Label_0299: {
                    Label_0295: {
                        Label_0100: {
                            Label_0069: {
                                if (this.J > 0) {
                                    if (!this.b) {
                                        final int top = v.getTop();
                                        n = this.z;
                                        if (top > n) {
                                            break Label_0295;
                                        }
                                        break Label_0100;
                                    }
                                }
                                else {
                                    if (this.D && this.Q0(v, this.p0())) {
                                        n = this.N;
                                        n2 = 5;
                                        break Label_0299;
                                    }
                                    Label_0289: {
                                        if (this.J == 0) {
                                            n = v.getTop();
                                            if (this.b) {
                                                if (Math.abs(n - this.y) < Math.abs(n - this.B)) {
                                                    break Label_0069;
                                                }
                                            }
                                            else {
                                                final int z = this.z;
                                                if (n < z) {
                                                    if (n < Math.abs(n - this.B)) {
                                                        break Label_0100;
                                                    }
                                                    break Label_0289;
                                                }
                                                else if (Math.abs(n - z) < Math.abs(n - this.B)) {
                                                    break Label_0289;
                                                }
                                            }
                                        }
                                        else if (!this.b) {
                                            n = v.getTop();
                                            if (Math.abs(n - this.z) < Math.abs(n - this.B)) {
                                                break Label_0289;
                                            }
                                        }
                                        n = this.B;
                                        n2 = 4;
                                        break Label_0299;
                                    }
                                    n = this.z;
                                    break Label_0295;
                                }
                            }
                            n = this.y;
                            break Label_0299;
                        }
                        n = this.g0();
                        break Label_0299;
                    }
                    n2 = 6;
                }
                this.R0(v, n2, n, false);
                this.K = false;
            }
        }
    }
    
    public void D0(@t(from = 0.0, to = 1.0) final float a) {
        if (a > 0.0f && a < 1.0f) {
            this.A = a;
            if (this.O != null) {
                this.W();
            }
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
    
    @Override
    public boolean E(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        if (this.G == 1 && actionMasked == 0) {
            return true;
        }
        final androidx.customview.widget.d h = this.H;
        if (h != null) {
            h.M(motionEvent);
        }
        if (actionMasked == 0) {
            this.w0();
        }
        if (this.R == null) {
            this.R = VelocityTracker.obtain();
        }
        this.R.addMovement(motionEvent);
        if (this.H != null && actionMasked == 2 && !this.I && Math.abs(this.T - motionEvent.getY()) > this.H.E()) {
            this.H.d(v, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return this.I ^ true;
    }
    
    public void E0(final boolean d) {
        if (this.D != d) {
            this.D = d;
            if (!d && this.G == 5) {
                this.K0(4);
            }
            this.S0();
        }
    }
    
    public void F0(@n0 final int k) {
        this.k = k;
    }
    
    public void G0(final int n) {
        this.H0(n, false);
    }
    
    public final void H0(int b, final boolean b2) {
        final int n = 1;
        Label_0063: {
            if (b == -1) {
                if (!this.f) {
                    this.f = true;
                    b = n;
                    break Label_0063;
                }
            }
            else if (this.f || this.e != b) {
                this.f = false;
                this.e = Math.max(0, b);
                b = n;
                break Label_0063;
            }
            b = 0;
        }
        if (b != 0) {
            this.V0(b2);
        }
    }
    
    public void I0(final int a) {
        this.a = a;
    }
    
    public void J0(final boolean e) {
        this.E = e;
    }
    
    public void K0(final int g) {
        if (g == this.G) {
            return;
        }
        if (this.O == null) {
            if (g == 4 || g == 3 || g == 6 || (this.D && g == 5)) {
                this.G = g;
            }
            return;
        }
        this.P0(g);
    }
    
    void L0(final int g) {
        if (this.G == g) {
            return;
        }
        this.G = g;
        final WeakReference<V> o = this.O;
        if (o == null) {
            return;
        }
        final View view = o.get();
        if (view == null) {
            return;
        }
        int i = 0;
        if (g == 3) {
            this.U0(true);
        }
        else if (g == 6 || g == 5 || g == 4) {
            this.U0(false);
        }
        this.T0(g);
        while (i < this.Q.size()) {
            this.Q.get(i).b(view, g);
            ++i;
        }
        this.S0();
    }
    
    public void M0(final boolean c) {
        this.c = c;
    }
    
    void O0(@j0 final View view, int i) {
        int n = 0;
        Label_0084: {
            if (i == 4) {
                n = this.B;
            }
            else if (i == 6) {
                final int z = this.z;
                if (this.b) {
                    n = this.y;
                    if (z <= n) {
                        i = 3;
                        break Label_0084;
                    }
                }
                n = z;
            }
            else if (i == 3) {
                n = this.g0();
            }
            else {
                if (!this.D || i != 5) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Illegal state argument: ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                }
                n = this.N;
            }
        }
        this.R0(view, i, n, false);
    }
    
    boolean Q0(@j0 final View view, final float n) {
        final boolean e = this.E;
        boolean b = true;
        if (e) {
            return true;
        }
        if (view.getTop() < this.B) {
            return false;
        }
        if (Math.abs(view.getTop() + n * 0.1f - this.B) / this.X() <= 0.5f) {
            b = false;
        }
        return b;
    }
    
    void R0(final View view, final int n, int n2, final boolean b) {
        final androidx.customview.widget.d h = this.H;
        if (h != null && (b ? h.V(view.getLeft(), n2) : h.X(view, view.getLeft(), n2))) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        if (n2 != 0) {
            this.L0(2);
            this.T0(n);
            if (this.v == null) {
                this.v = new j(view, n);
            }
            if (!this.v.H) {
                final j v = this.v;
                v.I = n;
                androidx.core.view.j0.n1(view, v);
                this.v.H = true;
            }
            else {
                this.v.I = n;
            }
        }
        else {
            this.L0(n);
        }
    }
    
    public void U(@j0 final g g) {
        if (!this.Q.contains(g)) {
            this.Q.add(g);
        }
    }
    
    @b1
    @t0({ t0.a.H })
    public void c0() {
        this.w = null;
    }
    
    void d0(int i) {
        final View view = this.O.get();
        if (view != null && !this.Q.isEmpty()) {
            final int b = this.B;
            float n;
            float n2;
            if (i <= b && b != this.g0()) {
                final int b2 = this.B;
                n = (float)(b2 - i);
                n2 = (float)(b2 - this.g0());
            }
            else {
                final int b3 = this.B;
                n = (float)(b3 - i);
                n2 = (float)(this.N - b3);
            }
            final float n3 = n / n2;
            for (i = 0; i < this.Q.size(); ++i) {
                this.Q.get(i).a(view, n3);
            }
        }
    }
    
    @b1
    @k0
    View e0(final View view) {
        if (androidx.core.view.j0.V0(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                final View e0 = this.e0(viewGroup.getChildAt(i));
                if (e0 != null) {
                    return e0;
                }
            }
        }
        return null;
    }
    
    public int g0() {
        int n;
        if (this.b) {
            n = this.y;
        }
        else {
            final int x = this.x;
            int s;
            if (this.q) {
                s = 0;
            }
            else {
                s = this.s;
            }
            n = Math.max(x, s);
        }
        return n;
    }
    
    @Override
    public void h(@j0 final CoordinatorLayout.g g) {
        super.h(g);
        this.O = null;
        this.H = null;
    }
    
    @t(from = 0.0, to = 1.0)
    public float h0() {
        return this.A;
    }
    
    com.google.android.material.shape.j i0() {
        return this.j;
    }
    
    @n0
    public int j0() {
        return this.k;
    }
    
    @Override
    public void k() {
        super.k();
        this.O = null;
        this.H = null;
    }
    
    public int k0() {
        int e;
        if (this.f) {
            e = -1;
        }
        else {
            e = this.e;
        }
        return e;
    }
    
    @Override
    public boolean l(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
        final boolean shown = v.isShown();
        final boolean b = false;
        if (shown && this.F) {
            final int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                this.w0();
            }
            if (this.R == null) {
                this.R = VelocityTracker.obtain();
            }
            this.R.addMovement(motionEvent);
            final View view = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.U = false;
                    this.S = -1;
                    if (this.I) {
                        return this.I = false;
                    }
                }
            }
            else {
                final int n = (int)motionEvent.getX();
                this.T = (int)motionEvent.getY();
                if (this.G != 2) {
                    final WeakReference<View> p3 = this.P;
                    View view2;
                    if (p3 != null) {
                        view2 = p3.get();
                    }
                    else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.G(view2, n, this.T)) {
                        this.S = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.U = true;
                    }
                }
                this.I = (this.S == -1 && !coordinatorLayout.G(v, n, this.T));
            }
            if (!this.I) {
                final androidx.customview.widget.d h = this.H;
                if (h != null && h.W(motionEvent)) {
                    return true;
                }
            }
            final WeakReference<View> p4 = this.P;
            View view3 = view;
            if (p4 != null) {
                view3 = p4.get();
            }
            boolean b2 = b;
            if (actionMasked == 2) {
                b2 = b;
                if (view3 != null) {
                    b2 = b;
                    if (!this.I) {
                        b2 = b;
                        if (this.G != 1) {
                            b2 = b;
                            if (!coordinatorLayout.G(view3, (int)motionEvent.getX(), (int)motionEvent.getY())) {
                                b2 = b;
                                if (this.H != null) {
                                    b2 = b;
                                    if (Math.abs(this.T - motionEvent.getY()) > this.H.E()) {
                                        b2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b2;
        }
        this.I = true;
        return false;
    }
    
    @b1
    int l0() {
        return this.g;
    }
    
    @Override
    public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V referent, int l) {
        if (androidx.core.view.j0.S((View)coordinatorLayout) && !androidx.core.view.j0.S(referent)) {
            referent.setFitsSystemWindows(true);
        }
        if (this.O == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(o2.a.f.d1);
            this.N0(referent);
            this.O = new WeakReference<V>(referent);
            if (this.i) {
                final com.google.android.material.shape.j j = this.j;
                if (j != null) {
                    androidx.core.view.j0.G1(referent, j);
                }
            }
            final com.google.android.material.shape.j i = this.j;
            if (i != null) {
                float n;
                if ((n = this.C) == -1.0f) {
                    n = androidx.core.view.j0.P(referent);
                }
                i.m0(n);
                final boolean u = this.G == 3;
                this.u = u;
                final com.google.android.material.shape.j k = this.j;
                float n2;
                if (u) {
                    n2 = 0.0f;
                }
                else {
                    n2 = 1.0f;
                }
                k.o0(n2);
            }
            this.S0();
            if (androidx.core.view.j0.T(referent) == 0) {
                androidx.core.view.j0.P1(referent, 1);
            }
            final int measuredWidth = referent.getMeasuredWidth();
            final int m = this.k;
            if (measuredWidth > m && m != -1) {
                final ViewGroup$LayoutParams layoutParams = referent.getLayoutParams();
                layoutParams.width = this.k;
                referent.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        referent.setLayoutParams(layoutParams);
                    }
                });
            }
        }
        if (this.H == null) {
            this.H = androidx.customview.widget.d.q(coordinatorLayout, this.X);
        }
        final int top = referent.getTop();
        coordinatorLayout.N(referent, l);
        this.M = coordinatorLayout.getWidth();
        this.N = coordinatorLayout.getHeight();
        final int height = referent.getHeight();
        this.L = height;
        l = this.N;
        final int s = this.s;
        if (l - height < s) {
            if (this.q) {
                this.L = l;
            }
            else {
                this.L = l - s;
            }
        }
        this.y = Math.max(0, l - this.L);
        this.W();
        this.V();
        l = this.G;
        Label_0460: {
            if (l == 3) {
                l = this.g0();
            }
            else if (l == 6) {
                l = this.z;
            }
            else if (this.D && l == 5) {
                l = this.N;
            }
            else if (l == 4) {
                l = this.B;
            }
            else {
                if (l == 1 || l == 2) {
                    androidx.core.view.j0.d1(referent, top - referent.getTop());
                }
                break Label_0460;
            }
            androidx.core.view.j0.d1(referent, l);
        }
        this.P = new WeakReference<View>(this.e0(referent));
        return true;
    }
    
    public int m0() {
        return this.a;
    }
    
    public boolean n0() {
        return this.E;
    }
    
    public int o0() {
        return this.G;
    }
    
    @Override
    public boolean p(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final float n, final float n2) {
        final WeakReference<View> p5 = this.P;
        boolean b2;
        final boolean b = b2 = false;
        if (p5 != null) {
            b2 = b;
            if (view == p5.get()) {
                if (this.G == 3) {
                    b2 = b;
                    if (!super.p(coordinatorLayout, v, view, n, n2)) {
                        return b2;
                    }
                }
                b2 = true;
            }
        }
        return b2;
    }
    
    public boolean q0() {
        return this.F;
    }
    
    @Override
    public void r(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, int top, final int j, @j0 final int[] array, int n) {
        if (n == 1) {
            return;
        }
        final WeakReference<View> p7 = this.P;
        View view2;
        if (p7 != null) {
            view2 = p7.get();
        }
        else {
            view2 = null;
        }
        if (view != view2) {
            return;
        }
        top = v.getTop();
        n = top - j;
        Label_0200: {
            Label_0108: {
                if (j > 0) {
                    if (n < this.g0()) {
                        array[1] = top - this.g0();
                        androidx.core.view.j0.d1(v, -array[1]);
                        top = 3;
                    }
                    else {
                        if (!this.F) {
                            return;
                        }
                        array[1] = j;
                        break Label_0108;
                    }
                }
                else {
                    if (j >= 0 || view.canScrollVertically(-1)) {
                        break Label_0200;
                    }
                    final int b = this.B;
                    if (n > b && !this.D) {
                        array[1] = top - b;
                        androidx.core.view.j0.d1(v, -array[1]);
                        top = 4;
                    }
                    else {
                        if (!this.F) {
                            return;
                        }
                        array[1] = j;
                        break Label_0108;
                    }
                }
                this.L0(top);
                break Label_0200;
            }
            androidx.core.view.j0.d1(v, -j);
            this.L0(1);
        }
        this.d0(v.getTop());
        this.J = j;
        this.K = true;
    }
    
    public boolean r0() {
        return this.b;
    }
    
    public boolean s0() {
        return this.m;
    }
    
    public boolean t0() {
        return this.D;
    }
    
    @Override
    public void u(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
    }
    
    public void u0(@j0 final g o) {
        this.Q.remove(o);
    }
    
    @Override
    public void y(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final Parcelable parcelable) {
        final i i = (i)parcelable;
        super.y(coordinatorLayout, v, i.a());
        this.x0(i);
        final int j = i.I;
        int g;
        if (j == 1 || (g = j) == 2) {
            g = 4;
        }
        this.G = g;
    }
    
    @Deprecated
    public void y0(final g e) {
        Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.Q.clear();
        if (e != null) {
            this.Q.add(e);
        }
    }
    
    @j0
    @Override
    public Parcelable z(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v) {
        return (Parcelable)new i(super.z(coordinatorLayout, v), this);
    }
    
    public void z0(final boolean f) {
        this.F = f;
    }
    
    public abstract static class g
    {
        public abstract void a(@j0 final View p0, final float p1);
        
        public abstract void b(@j0 final View p0, final int p1);
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface h {
    }
    
    protected static class i extends a
    {
        public static final Parcelable$Creator<i> CREATOR;
        final int I;
        int J;
        boolean K;
        boolean L;
        boolean M;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<i>() {
                @k0
                public i a(@j0 final Parcel parcel) {
                    return new i(parcel, null);
                }
                
                @j0
                public i b(@j0 final Parcel parcel, final ClassLoader classLoader) {
                    return new i(parcel, classLoader);
                }
                
                @j0
                public i[] c(final int n) {
                    return new i[n];
                }
            };
        }
        
        public i(@j0 final Parcel parcel) {
            this(parcel, null);
        }
        
        public i(@j0 final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            this.I = parcel.readInt();
            this.J = parcel.readInt();
            final int int1 = parcel.readInt();
            final boolean b = false;
            this.K = (int1 == 1);
            this.L = (parcel.readInt() == 1);
            boolean m = b;
            if (parcel.readInt() == 1) {
                m = true;
            }
            this.M = m;
        }
        
        @Deprecated
        public i(final Parcelable parcelable, final int i) {
            super(parcelable);
            this.I = i;
        }
        
        public i(final Parcelable parcelable, @j0 final BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.I = bottomSheetBehavior.G;
            this.J = ((BottomSheetBehavior<View>)bottomSheetBehavior).e;
            this.K = ((BottomSheetBehavior<View>)bottomSheetBehavior).b;
            this.L = bottomSheetBehavior.D;
            this.M = ((BottomSheetBehavior<View>)bottomSheetBehavior).E;
        }
        
        @Override
        public void writeToParcel(@j0 final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeInt((int)(this.K ? 1 : 0));
            parcel.writeInt((int)(this.L ? 1 : 0));
            parcel.writeInt((int)(this.M ? 1 : 0));
        }
    }
    
    private class j implements Runnable
    {
        private final View G;
        private boolean H;
        int I;
        
        j(final View g, final int i) {
            this.G = g;
            this.I = i;
        }
        
        @Override
        public void run() {
            final androidx.customview.widget.d h = BottomSheetBehavior.this.H;
            if (h != null && h.o(true)) {
                androidx.core.view.j0.n1(this.G, this);
            }
            else {
                BottomSheetBehavior.this.L0(this.I);
            }
            this.H = false;
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface k {
    }
}
