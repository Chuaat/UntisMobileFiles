// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.motion.widget;

import android.view.VelocityTracker;
import android.view.ViewGroup$LayoutParams;
import androidx.constraintlayout.core.widgets.h;
import androidx.constraintlayout.core.widgets.i;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.b;
import android.view.View$MeasureSpec;
import android.widget.TextView;
import android.graphics.PathEffect;
import android.graphics.Paint$Style;
import android.graphics.DashPathEffect;
import android.graphics.Path;
import android.view.Display;
import androidx.constraintlayout.widget.m;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.graphics.Paint;
import android.graphics.Canvas;
import java.util.Arrays;
import androidx.annotation.p0;
import android.annotation.SuppressLint;
import android.util.SparseIntArray;
import android.util.SparseBooleanArray;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.constraintlayout.widget.j;
import android.view.ViewGroup;
import android.view.MotionEvent;
import android.util.SparseArray;
import androidx.constraintlayout.core.widgets.e;
import androidx.constraintlayout.core.widgets.f;
import java.util.Iterator;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.g;
import android.view.animation.Interpolator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.ArrayList;
import androidx.constraintlayout.motion.utils.a;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Rect;
import androidx.constraintlayout.motion.utils.d;
import android.view.View;
import java.util.HashMap;
import androidx.core.view.x;
import androidx.constraintlayout.widget.ConstraintLayout;

public class s extends ConstraintLayout implements x
{
    public static final int S1 = 0;
    public static final int T1 = 1;
    public static final int U1 = 2;
    public static final int V1 = 3;
    public static final int W1 = 4;
    public static final int X1 = 5;
    public static final int Y1 = 6;
    public static final int Z1 = 7;
    static final String a2 = "MotionLayout";
    private static final boolean b2 = false;
    public static boolean c2 = false;
    public static final int d2 = 0;
    public static final int e2 = 1;
    public static final int f2 = 2;
    static final int g2 = 50;
    public static final int h2 = 0;
    public static final int i2 = 1;
    public static final int j2 = 2;
    public static final int k2 = 3;
    private static final float l2 = 1.0E-5f;
    private boolean A0;
    private Runnable A1;
    HashMap<View, o> B0;
    private int[] B1;
    private long C0;
    int C1;
    private float D0;
    private boolean D1;
    float E0;
    int E1;
    float F0;
    HashMap<View, d> F1;
    private long G0;
    private int G1;
    float H0;
    private int H1;
    private boolean I0;
    private int I1;
    boolean J0;
    Rect J1;
    boolean K0;
    private boolean K1;
    private l L0;
    m L1;
    private float M0;
    h M1;
    private float N0;
    private boolean N1;
    int O0;
    private RectF O1;
    g P0;
    private View P1;
    private boolean Q0;
    private Matrix Q1;
    private androidx.constraintlayout.motion.utils.a R0;
    ArrayList<Integer> R1;
    private f S0;
    private androidx.constraintlayout.motion.widget.d T0;
    boolean U0;
    int V0;
    int W0;
    int X0;
    int Y0;
    boolean Z0;
    float a1;
    float b1;
    long c1;
    float d1;
    private boolean e1;
    private ArrayList<p> f1;
    private ArrayList<p> g1;
    private ArrayList<p> h1;
    private CopyOnWriteArrayList<l> i1;
    private int j1;
    private long k1;
    private float l1;
    private int m1;
    private float n1;
    boolean o1;
    protected boolean p1;
    int q1;
    u r0;
    int r1;
    Interpolator s0;
    int s1;
    Interpolator t0;
    int t1;
    float u0;
    int u1;
    private int v0;
    int v1;
    int w0;
    float w1;
    private int x0;
    private androidx.constraintlayout.core.motion.utils.g x1;
    private int y0;
    private boolean y1;
    private int z0;
    private k z1;
    
    public s(@j0 final Context context) {
        super(context);
        this.t0 = null;
        this.u0 = 0.0f;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = true;
        this.B0 = new HashMap<View, o>();
        this.C0 = 0L;
        this.D0 = 1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.H0 = 0.0f;
        this.J0 = false;
        this.K0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new androidx.constraintlayout.motion.utils.a();
        this.S0 = new f();
        this.U0 = true;
        this.Z0 = false;
        this.e1 = false;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = null;
        this.j1 = 0;
        this.k1 = -1L;
        this.l1 = 0.0f;
        this.m1 = 0;
        this.n1 = 0.0f;
        this.o1 = false;
        this.p1 = false;
        this.x1 = new androidx.constraintlayout.core.motion.utils.g();
        this.y1 = false;
        this.A1 = null;
        this.B1 = null;
        this.C1 = 0;
        this.D1 = false;
        this.E1 = 0;
        this.F1 = new HashMap<View, d>();
        this.J1 = new Rect();
        this.K1 = false;
        this.L1 = m.G;
        this.M1 = new h();
        this.N1 = false;
        this.O1 = new RectF();
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new ArrayList<Integer>();
        this.M0(null);
    }
    
    public s(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.t0 = null;
        this.u0 = 0.0f;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = true;
        this.B0 = new HashMap<View, o>();
        this.C0 = 0L;
        this.D0 = 1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.H0 = 0.0f;
        this.J0 = false;
        this.K0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new androidx.constraintlayout.motion.utils.a();
        this.S0 = new f();
        this.U0 = true;
        this.Z0 = false;
        this.e1 = false;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = null;
        this.j1 = 0;
        this.k1 = -1L;
        this.l1 = 0.0f;
        this.m1 = 0;
        this.n1 = 0.0f;
        this.o1 = false;
        this.p1 = false;
        this.x1 = new androidx.constraintlayout.core.motion.utils.g();
        this.y1 = false;
        this.A1 = null;
        this.B1 = null;
        this.C1 = 0;
        this.D1 = false;
        this.E1 = 0;
        this.F1 = new HashMap<View, d>();
        this.J1 = new Rect();
        this.K1 = false;
        this.L1 = m.G;
        this.M1 = new h();
        this.N1 = false;
        this.O1 = new RectF();
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new ArrayList<Integer>();
        this.M0(set);
    }
    
    public s(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.t0 = null;
        this.u0 = 0.0f;
        this.v0 = -1;
        this.w0 = -1;
        this.x0 = -1;
        this.y0 = 0;
        this.z0 = 0;
        this.A0 = true;
        this.B0 = new HashMap<View, o>();
        this.C0 = 0L;
        this.D0 = 1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.H0 = 0.0f;
        this.J0 = false;
        this.K0 = false;
        this.O0 = 0;
        this.Q0 = false;
        this.R0 = new androidx.constraintlayout.motion.utils.a();
        this.S0 = new f();
        this.U0 = true;
        this.Z0 = false;
        this.e1 = false;
        this.f1 = null;
        this.g1 = null;
        this.h1 = null;
        this.i1 = null;
        this.j1 = 0;
        this.k1 = -1L;
        this.l1 = 0.0f;
        this.m1 = 0;
        this.n1 = 0.0f;
        this.o1 = false;
        this.p1 = false;
        this.x1 = new androidx.constraintlayout.core.motion.utils.g();
        this.y1 = false;
        this.A1 = null;
        this.B1 = null;
        this.C1 = 0;
        this.D1 = false;
        this.E1 = 0;
        this.F1 = new HashMap<View, d>();
        this.J1 = new Rect();
        this.K1 = false;
        this.L1 = m.G;
        this.M1 = new h();
        this.N1 = false;
        this.O1 = new RectF();
        this.P1 = null;
        this.Q1 = null;
        this.R1 = new ArrayList<Integer>();
        this.M0(set);
    }
    
    private void A0() {
        if (this.L0 == null) {
            final CopyOnWriteArrayList<l> i1 = this.i1;
            if (i1 == null || i1.isEmpty()) {
                return;
            }
        }
        if (this.n1 != this.E0) {
            if (this.m1 != -1) {
                final l l0 = this.L0;
                if (l0 != null) {
                    l0.c(this, this.v0, this.x0);
                }
                final CopyOnWriteArrayList<l> i2 = this.i1;
                if (i2 != null) {
                    final Iterator<l> iterator = i2.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().c(this, this.v0, this.x0);
                    }
                }
                this.o1 = true;
            }
            this.m1 = -1;
            final float e0 = this.E0;
            this.n1 = e0;
            final l l2 = this.L0;
            if (l2 != null) {
                l2.a(this, this.v0, this.x0, e0);
            }
            final CopyOnWriteArrayList<l> i3 = this.i1;
            if (i3 != null) {
                final Iterator<l> iterator2 = i3.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().a(this, this.v0, this.x0, this.E0);
                }
            }
            this.o1 = true;
        }
    }
    
    private void C0(final s s, final int n, final int n2) {
        final l l0 = this.L0;
        if (l0 != null) {
            l0.c(this, n, n2);
        }
        final CopyOnWriteArrayList<l> i1 = this.i1;
        if (i1 != null) {
            final Iterator<l> iterator = i1.iterator();
            while (iterator.hasNext()) {
                iterator.next().c(s, n, n2);
            }
        }
    }
    
    private boolean L0(final float n, final float n2, final View view, final MotionEvent motionEvent) {
        final boolean b = view instanceof ViewGroup;
        final boolean b2 = true;
        boolean b3 = false;
        Label_0097: {
            if (b) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = viewGroup.getChildCount() - 1; i >= 0; --i) {
                    final View child = viewGroup.getChildAt(i);
                    if (this.L0(child.getLeft() + n - view.getScrollX(), child.getTop() + n2 - view.getScrollY(), child, motionEvent)) {
                        b3 = true;
                        break Label_0097;
                    }
                }
            }
            b3 = false;
        }
        if (!b3) {
            this.O1.set(n, n2, view.getRight() + n - view.getLeft(), view.getBottom() + n2 - view.getTop());
            if ((motionEvent.getAction() != 0 || this.O1.contains(motionEvent.getX(), motionEvent.getY())) && this.n0(view, motionEvent, -n, -n2)) {
                b3 = b2;
            }
        }
        return b3;
    }
    
    private void M0(final AttributeSet set) {
        s.c2 = this.isInEditMode();
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, androidx.constraintlayout.widget.j.m.ak);
            final int indexCount = obtainStyledAttributes.getIndexCount();
            int i = 0;
            int n = 1;
            while (i < indexCount) {
                final int index = obtainStyledAttributes.getIndex(i);
                int boolean1 = 0;
                Label_0237: {
                    if (index == androidx.constraintlayout.widget.j.m.dk) {
                        this.r0 = new u(this.getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                        boolean1 = n;
                    }
                    else if (index == androidx.constraintlayout.widget.j.m.ck) {
                        this.w0 = obtainStyledAttributes.getResourceId(index, -1);
                        boolean1 = n;
                    }
                    else if (index == androidx.constraintlayout.widget.j.m.fk) {
                        this.H0 = obtainStyledAttributes.getFloat(index, 0.0f);
                        this.J0 = true;
                        boolean1 = n;
                    }
                    else if (index == androidx.constraintlayout.widget.j.m.bk) {
                        boolean1 = (obtainStyledAttributes.getBoolean(index, (boolean)(n != 0)) ? 1 : 0);
                    }
                    else {
                        int int1;
                        if (index == androidx.constraintlayout.widget.j.m.gk) {
                            boolean1 = n;
                            if (this.O0 != 0) {
                                break Label_0237;
                            }
                            if (obtainStyledAttributes.getBoolean(index, false)) {
                                int1 = 2;
                            }
                            else {
                                int1 = 0;
                            }
                        }
                        else {
                            boolean1 = n;
                            if (index != androidx.constraintlayout.widget.j.m.ek) {
                                break Label_0237;
                            }
                            int1 = obtainStyledAttributes.getInt(index, 0);
                        }
                        this.O0 = int1;
                        boolean1 = n;
                    }
                }
                ++i;
                n = boolean1;
            }
            obtainStyledAttributes.recycle();
            if (this.r0 == null) {
                Log.e("MotionLayout", "WARNING NO app:layoutDescription tag");
            }
            if (n == 0) {
                this.r0 = null;
            }
        }
        if (this.O0 != 0) {
            this.o0();
        }
        if (this.w0 == -1) {
            final u r0 = this.r0;
            if (r0 != null) {
                this.w0 = r0.N();
                this.v0 = this.r0.N();
                this.x0 = this.r0.u();
            }
        }
    }
    
    private void V0() {
        if (this.L0 == null) {
            final CopyOnWriteArrayList<l> i1 = this.i1;
            if (i1 == null || i1.isEmpty()) {
                return;
            }
        }
        this.o1 = false;
        for (final Integer n : this.R1) {
            final l l0 = this.L0;
            if (l0 != null) {
                l0.k(this, n);
            }
            final CopyOnWriteArrayList<l> i2 = this.i1;
            if (i2 != null) {
                final Iterator<l> iterator2 = i2.iterator();
                while (iterator2.hasNext()) {
                    iterator2.next().k(this, n);
                }
            }
        }
        this.R1.clear();
    }
    
    private void d1() {
        final int childCount = this.getChildCount();
        this.M1.a();
        final int n = 1;
        this.J0 = true;
        final SparseArray sparseArray = new SparseArray();
        final int n2 = 0;
        final int n3 = 0;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            sparseArray.put(child.getId(), (Object)this.B0.get(child));
        }
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int m = this.r0.m();
        if (m != -1) {
            for (int j = 0; j < childCount; ++j) {
                final o o = this.B0.get(this.getChildAt(j));
                if (o != null) {
                    o.T(m);
                }
            }
        }
        final SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        final int[] array = new int[this.B0.size()];
        int k = 0;
        int n4 = 0;
        while (k < childCount) {
            final o o2 = this.B0.get(this.getChildAt(k));
            int n5 = n4;
            if (o2.k() != -1) {
                sparseBooleanArray.put(o2.k(), true);
                array[n4] = o2.k();
                n5 = n4 + 1;
            }
            ++k;
            n4 = n5;
        }
        if (this.h1 != null) {
            for (int l = 0; l < n4; ++l) {
                final o o3 = this.B0.get(this.findViewById(array[l]));
                if (o3 != null) {
                    this.r0.z(o3);
                }
            }
            final Iterator<p> iterator = this.h1.iterator();
            while (iterator.hasNext()) {
                iterator.next().g(this, this.B0);
            }
            for (int n6 = 0; n6 < n4; ++n6) {
                final o o4 = this.B0.get(this.findViewById(array[n6]));
                if (o4 != null) {
                    o4.Z(width, height, this.D0, this.getNanoTime());
                }
            }
        }
        else {
            for (int n7 = 0; n7 < n4; ++n7) {
                final o o5 = this.B0.get(this.findViewById(array[n7]));
                if (o5 != null) {
                    this.r0.z(o5);
                    o5.Z(width, height, this.D0, this.getNanoTime());
                }
            }
        }
        for (int n8 = 0; n8 < childCount; ++n8) {
            final View child2 = this.getChildAt(n8);
            final o o6 = this.B0.get(child2);
            if (!sparseBooleanArray.get(child2.getId())) {
                if (o6 != null) {
                    this.r0.z(o6);
                    o6.Z(width, height, this.D0, this.getNanoTime());
                }
            }
        }
        final float m2 = this.r0.M();
        if (m2 != 0.0f) {
            final boolean b = m2 < 0.0;
            final float abs = Math.abs(m2);
            final float n9 = -3.4028235E38f;
            final float n10 = Float.MAX_VALUE;
            int n11 = 0;
            float min = Float.MAX_VALUE;
            float max = -3.4028235E38f;
            while (true) {
                while (n11 < childCount) {
                    final o o7 = this.B0.get(this.getChildAt(n11));
                    if (!Float.isNaN(o7.l)) {
                        final int n12 = n;
                        int n13 = n2;
                        if (n12 != 0) {
                            int n14 = 0;
                            float a = n10;
                            float a2 = n9;
                            int n15;
                            while (true) {
                                n15 = n3;
                                if (n14 >= childCount) {
                                    break;
                                }
                                final o o8 = this.B0.get(this.getChildAt(n14));
                                float max2 = a2;
                                float min2 = a;
                                if (!Float.isNaN(o8.l)) {
                                    min2 = Math.min(a, o8.l);
                                    max2 = Math.max(a2, o8.l);
                                }
                                ++n14;
                                a2 = max2;
                                a = min2;
                            }
                            while (n15 < childCount) {
                                final o o9 = this.B0.get(this.getChildAt(n15));
                                if (!Float.isNaN(o9.l)) {
                                    o9.n = 1.0f / (1.0f - abs);
                                    final float l2 = o9.l;
                                    float n16;
                                    if (b) {
                                        n16 = (a2 - l2) / (a2 - a) * abs;
                                    }
                                    else {
                                        n16 = (l2 - a) * abs / (a2 - a);
                                    }
                                    o9.m = abs - n16;
                                }
                                ++n15;
                            }
                            return;
                        }
                        while (n13 < childCount) {
                            final o o10 = this.B0.get(this.getChildAt(n13));
                            final float t = o10.t();
                            final float u = o10.u();
                            float n17;
                            if (b) {
                                n17 = u - t;
                            }
                            else {
                                n17 = u + t;
                            }
                            o10.n = 1.0f / (1.0f - abs);
                            o10.m = abs - (n17 - min) * abs / (max - min);
                            ++n13;
                        }
                        return;
                    }
                    else {
                        final float t2 = o7.t();
                        final float u2 = o7.u();
                        float n18;
                        if (b) {
                            n18 = u2 - t2;
                        }
                        else {
                            n18 = u2 + t2;
                        }
                        min = Math.min(min, n18);
                        max = Math.max(max, n18);
                        ++n11;
                    }
                }
                final int n12 = 0;
                continue;
            }
        }
    }
    
    private Rect e1(final e e) {
        this.J1.top = e.m0();
        this.J1.left = e.l0();
        final Rect j1 = this.J1;
        final int j2 = e.j0();
        final Rect j3 = this.J1;
        j1.right = j2 + j3.left;
        final int d = e.D();
        final Rect j4 = this.J1;
        j3.bottom = d + j4.top;
        return j4;
    }
    
    private boolean n0(final View view, MotionEvent obtain, final float n, final float n2) {
        final Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            obtain.offsetLocation(n, n2);
            final boolean onTouchEvent = view.onTouchEvent(obtain);
            obtain.offsetLocation(-n, -n2);
            return onTouchEvent;
        }
        obtain = MotionEvent.obtain(obtain);
        obtain.offsetLocation(n, n2);
        if (this.Q1 == null) {
            this.Q1 = new Matrix();
        }
        matrix.invert(this.Q1);
        obtain.transform(this.Q1);
        final boolean onTouchEvent2 = view.onTouchEvent(obtain);
        obtain.recycle();
        return onTouchEvent2;
    }
    
    private void o0() {
        final u r0 = this.r0;
        if (r0 == null) {
            Log.e("MotionLayout", "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\"");
            return;
        }
        final int n = r0.N();
        final u r2 = this.r0;
        this.p0(n, r2.o(r2.N()));
        final SparseIntArray sparseIntArray = new SparseIntArray();
        final SparseIntArray sparseIntArray2 = new SparseIntArray();
        for (final u.b b : this.r0.s()) {
            if (b == this.r0.c) {
                Log.v("MotionLayout", "CHECK: CURRENT");
            }
            this.q0(b);
            final int i = b.I();
            final int b2 = b.B();
            final String j = androidx.constraintlayout.motion.widget.c.i(this.getContext(), i);
            final String k = androidx.constraintlayout.motion.widget.c.i(this.getContext(), b2);
            if (sparseIntArray.get(i) == b2) {
                final StringBuilder sb = new StringBuilder();
                sb.append("CHECK: two transitions with the same start and end ");
                sb.append(j);
                sb.append("->");
                sb.append(k);
                Log.e("MotionLayout", sb.toString());
            }
            if (sparseIntArray2.get(b2) == i) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("CHECK: you can't have reverse transitions");
                sb2.append(j);
                sb2.append("->");
                sb2.append(k);
                Log.e("MotionLayout", sb2.toString());
            }
            sparseIntArray.put(i, b2);
            sparseIntArray2.put(b2, i);
            if (this.r0.o(i) == null) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(" no such constraintSetStart ");
                sb3.append(j);
                Log.e("MotionLayout", sb3.toString());
            }
            if (this.r0.o(b2) == null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append(" no such constraintSetEnd ");
                sb4.append(j);
                Log.e("MotionLayout", sb4.toString());
            }
        }
    }
    
    private void p0(int i, final androidx.constraintlayout.widget.e e) {
        final String j = androidx.constraintlayout.motion.widget.c.i(this.getContext(), i);
        final int childCount = this.getChildCount();
        final int n = 0;
        View child;
        int id;
        StringBuilder sb;
        StringBuilder sb2;
        for (i = 0; i < childCount; ++i) {
            child = this.getChildAt(i);
            id = child.getId();
            if (id == -1) {
                sb = new StringBuilder();
                sb.append("CHECK: ");
                sb.append(j);
                sb.append(" ALL VIEWS SHOULD HAVE ID's ");
                sb.append(child.getClass().getName());
                sb.append(" does not!");
                Log.w("MotionLayout", sb.toString());
            }
            if (e.k0(id) == null) {
                sb2 = new StringBuilder();
                sb2.append("CHECK: ");
                sb2.append(j);
                sb2.append(" NO CONSTRAINTS for ");
                sb2.append(androidx.constraintlayout.motion.widget.c.k(child));
                Log.w("MotionLayout", sb2.toString());
            }
        }
        int[] o0;
        int n2;
        String k;
        StringBuilder sb3;
        StringBuilder sb4;
        StringBuilder sb5;
        for (o0 = e.o0(), i = n; i < o0.length; ++i) {
            n2 = o0[i];
            k = androidx.constraintlayout.motion.widget.c.i(this.getContext(), n2);
            if (this.findViewById(o0[i]) == null) {
                sb3 = new StringBuilder();
                sb3.append("CHECK: ");
                sb3.append(j);
                sb3.append(" NO View matches id ");
                sb3.append(k);
                Log.w("MotionLayout", sb3.toString());
            }
            if (e.n0(n2) == -1) {
                sb4 = new StringBuilder();
                sb4.append("CHECK: ");
                sb4.append(j);
                sb4.append("(");
                sb4.append(k);
                sb4.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb4.toString());
            }
            if (e.u0(n2) == -1) {
                sb5 = new StringBuilder();
                sb5.append("CHECK: ");
                sb5.append(j);
                sb5.append("(");
                sb5.append(k);
                sb5.append(") no LAYOUT_HEIGHT");
                Log.w("MotionLayout", sb5.toString());
            }
        }
    }
    
    private void q0(final u.b b) {
        if (b.I() == b.B()) {
            Log.e("MotionLayout", "CHECK: start and end constraint set should not be the same!");
        }
    }
    
    private void s0() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final o o = this.B0.get(child);
            if (o != null) {
                o.U(child);
            }
        }
    }
    
    private static boolean s1(final float n, final float n2, final float n3) {
        final boolean b = true;
        boolean b2 = true;
        if (n > 0.0f) {
            final float n4 = n / n3;
            if (n2 + (n * n4 - n3 * n4 * n4 / 2.0f) <= 1.0f) {
                b2 = false;
            }
            return b2;
        }
        final float n5 = -n / n3;
        return n2 + (n * n5 + n3 * n5 * n5 / 2.0f) < 0.0f && b;
    }
    
    @SuppressLint({ "LogConditional" })
    private void t0() {
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            final StringBuilder sb = new StringBuilder();
            sb.append(" ");
            sb.append(androidx.constraintlayout.motion.widget.c.g());
            sb.append(" ");
            sb.append(androidx.constraintlayout.motion.widget.c.k((View)this));
            sb.append(" ");
            sb.append(androidx.constraintlayout.motion.widget.c.i(this.getContext(), this.w0));
            sb.append(" ");
            sb.append(androidx.constraintlayout.motion.widget.c.k(child));
            sb.append(child.getLeft());
            sb.append(" ");
            sb.append(child.getTop());
            Log.v("MotionLayout", sb.toString());
        }
    }
    
    private void z0() {
        final float signum = Math.signum(this.H0 - this.F0);
        final long nanoTime = this.getNanoTime();
        final Interpolator s0 = this.s0;
        float n;
        if (!(s0 instanceof androidx.constraintlayout.motion.utils.a)) {
            n = (nanoTime - this.G0) * signum * 1.0E-9f / this.D0;
        }
        else {
            n = 0.0f;
        }
        float n2 = this.F0 + n;
        if (this.I0) {
            n2 = this.H0;
        }
        final int n3 = 0;
        final float n4 = fcmpl(signum, 0.0f);
        boolean b;
        if ((n4 > 0 && n2 >= this.H0) || (signum <= 0.0f && n2 <= this.H0)) {
            n2 = this.H0;
            b = true;
        }
        else {
            b = false;
        }
        float n5 = n2;
        if (s0 != null) {
            n5 = n2;
            if (!b) {
                if (this.Q0) {
                    n5 = s0.getInterpolation((nanoTime - this.C0) * 1.0E-9f);
                }
                else {
                    n5 = s0.getInterpolation(n2);
                }
            }
        }
        float w1 = 0.0f;
        Label_0238: {
            if (n4 <= 0 || n5 < this.H0) {
                w1 = n5;
                if (signum > 0.0f) {
                    break Label_0238;
                }
                w1 = n5;
                if (n5 > this.H0) {
                    break Label_0238;
                }
            }
            w1 = this.H0;
        }
        this.w1 = w1;
        final int childCount = this.getChildCount();
        final long nanoTime2 = this.getNanoTime();
        final Interpolator t0 = this.t0;
        int i;
        if (t0 == null) {
            i = n3;
        }
        else {
            w1 = t0.getInterpolation(w1);
            i = n3;
        }
        while (i < childCount) {
            final View child = this.getChildAt(i);
            final o o = this.B0.get(child);
            if (o != null) {
                o.L(child, w1, nanoTime2, this.x1);
            }
            ++i;
        }
        if (this.p1) {
            this.requestLayout();
        }
    }
    
    protected void B0() {
        Label_0103: {
            if (this.L0 == null) {
                final CopyOnWriteArrayList<l> i1 = this.i1;
                if (i1 == null || i1.isEmpty()) {
                    break Label_0103;
                }
            }
            if (this.m1 == -1) {
                this.m1 = this.w0;
                int intValue;
                if (!this.R1.isEmpty()) {
                    final ArrayList<Integer> r1 = this.R1;
                    intValue = r1.get(r1.size() - 1);
                }
                else {
                    intValue = -1;
                }
                final int w0 = this.w0;
                if (intValue != w0 && w0 != -1) {
                    this.R1.add(w0);
                }
            }
        }
        this.V0();
        final Runnable a1 = this.A1;
        if (a1 != null) {
            a1.run();
        }
        final int[] b1 = this.B1;
        if (b1 != null && this.C1 > 0) {
            this.k1(b1[0]);
            final int[] b2 = this.B1;
            System.arraycopy(b2, 1, b2, 0, b2.length - 1);
            --this.C1;
        }
    }
    
    public void D0(final int n, final boolean b, final float n2) {
        final l l0 = this.L0;
        if (l0 != null) {
            l0.d(this, n, b, n2);
        }
        final CopyOnWriteArrayList<l> i1 = this.i1;
        if (i1 != null) {
            final Iterator<l> iterator = i1.iterator();
            while (iterator.hasNext()) {
                iterator.next().d(this, n, b, n2);
            }
        }
    }
    
    void E0(final int i, final float m0, float y, final float n, final float[] array) {
        final HashMap<View, o> b0 = this.B0;
        final View n2 = this.n(i);
        final o o = b0.get(n2);
        if (o != null) {
            o.p(m0, y, n, array);
            y = n2.getY();
            this.M0 = m0;
            this.N0 = y;
        }
        else {
            String str;
            if (n2 == null) {
                final StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(i);
                str = sb.toString();
            }
            else {
                str = n2.getContext().getResources().getResourceName(i);
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("WARNING could not find view id ");
            sb2.append(str);
            Log.w("MotionLayout", sb2.toString());
        }
    }
    
    @Override
    public void F(final int w0, final int n, final int n2) {
        this.setState(m.H);
        this.w0 = w0;
        this.v0 = -1;
        this.x0 = -1;
        final androidx.constraintlayout.widget.c q = super.Q;
        if (q != null) {
            q.e(w0, (float)n, (float)n2);
        }
        else {
            final u r0 = this.r0;
            if (r0 != null) {
                r0.o(w0).r(this);
            }
        }
    }
    
    public androidx.constraintlayout.widget.e F0(final int n) {
        final u r0 = this.r0;
        if (r0 == null) {
            return null;
        }
        return r0.o(n);
    }
    
    String G0(final int n) {
        final u r0 = this.r0;
        if (r0 == null) {
            return null;
        }
        return r0.X(n);
    }
    
    public void H0(final boolean b) {
        int o0;
        if (b) {
            o0 = 2;
        }
        else {
            o0 = 1;
        }
        this.O0 = o0;
        this.invalidate();
    }
    
    o I0(final int n) {
        return this.B0.get(this.findViewById(n));
    }
    
    public u.b J0(final int n) {
        return this.r0.O(n);
    }
    
    public void K0(final View key, final float n, final float n2, final float[] array, final int n3) {
        float n4 = this.u0;
        float n5 = this.F0;
        if (this.s0 != null) {
            final float signum = Math.signum(this.H0 - n5);
            final float interpolation = this.s0.getInterpolation(this.F0 + 1.0E-5f);
            n5 = this.s0.getInterpolation(this.F0);
            n4 = signum * ((interpolation - n5) / 1.0E-5f) / this.D0;
        }
        final Interpolator s0 = this.s0;
        if (s0 instanceof r) {
            n4 = ((r)s0).a();
        }
        final o o = this.B0.get(key);
        if ((n3 & 0x1) == 0x0) {
            o.C(n5, key.getWidth(), key.getHeight(), n, n2, array);
        }
        else {
            o.p(n5, n, n2, array);
        }
        if (n3 < 2) {
            array[0] *= n4;
            array[1] *= n4;
        }
    }
    
    public boolean N0() {
        return this.K1;
    }
    
    public boolean O0() {
        return this.D1;
    }
    
    public boolean P0() {
        return this.A0;
    }
    
    public boolean Q0(final int n) {
        final u r0 = this.r0;
        return r0 != null && r0.U(n);
    }
    
    public void R0(final int w0) {
        if (!this.isAttachedToWindow()) {
            this.w0 = w0;
        }
        float progress;
        if (this.v0 == w0) {
            progress = 0.0f;
        }
        else {
            if (this.x0 != w0) {
                this.c1(w0, w0);
                return;
            }
            progress = 1.0f;
        }
        this.setProgress(progress);
    }
    
    int S0(final String s) {
        final u r0 = this.r0;
        if (r0 == null) {
            return 0;
        }
        return r0.W(s);
    }
    
    protected i T0() {
        return (i)j.i();
    }
    
    void U0() {
        final u r0 = this.r0;
        if (r0 == null) {
            return;
        }
        if (r0.i(this, this.w0)) {
            this.requestLayout();
            return;
        }
        final int w0 = this.w0;
        if (w0 != -1) {
            this.r0.f(this, w0);
        }
        if (this.r0.r0()) {
            this.r0.p0();
        }
    }
    
    @Deprecated
    public void W0() {
        Log.e("MotionLayout", "This method is deprecated. Please call rebuildScene() instead.");
        this.X0();
    }
    
    public void X0() {
        this.M1.j();
        this.invalidate();
    }
    
    public boolean Y0(final l o) {
        final CopyOnWriteArrayList<l> i1 = this.i1;
        return i1 != null && i1.remove(o);
    }
    
    @p0(api = 17)
    public void Z0(final int x0, final int n) {
        int e1 = 1;
        this.D1 = true;
        this.G1 = this.getWidth();
        this.H1 = this.getHeight();
        final int rotation = this.getDisplay().getRotation();
        if ((rotation + 1) % 4 <= (this.I1 + 1) % 4) {
            e1 = 2;
        }
        this.E1 = e1;
        this.I1 = rotation;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            d value;
            if ((value = this.F1.get(child)) == null) {
                value = new d();
                this.F1.put(child, value);
            }
            value.a(child);
        }
        this.v0 = -1;
        this.x0 = x0;
        this.r0.n0(-1, x0);
        this.M1.g(super.I, null, this.r0.o(this.x0));
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.invalidate();
        this.i1(new Runnable() {
            @Override
            public void run() {
                s.this.D1 = false;
            }
        });
        if (n > 0) {
            this.D0 = n / 1000.0f;
        }
    }
    
    public void a1(final int n) {
        if (this.getCurrentState() == -1) {
            this.k1(n);
        }
        else {
            final int[] b1 = this.B1;
            if (b1 == null) {
                this.B1 = new int[4];
            }
            else if (b1.length <= this.C1) {
                this.B1 = Arrays.copyOf(b1, b1.length * 2);
            }
            this.B1[this.C1++] = n;
        }
    }
    
    public void b1(final float progress, final float u0) {
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.e(progress);
            this.z1.h(u0);
            return;
        }
        this.setProgress(progress);
        this.setState(m.I);
        this.u0 = u0;
        this.l0(1.0f);
    }
    
    public void c1(final int v0, final int x0) {
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.f(v0);
            this.z1.d(x0);
            return;
        }
        final u r0 = this.r0;
        if (r0 != null) {
            r0.n0(this.v0 = v0, this.x0 = x0);
            this.M1.g(super.I, this.r0.o(v0), this.r0.o(x0));
            this.X0();
            this.F0 = 0.0f;
            this.j1();
        }
    }
    
    @Override
    protected void dispatchDraw(final Canvas canvas) {
        final ArrayList<p> h1 = this.h1;
        if (h1 != null) {
            final Iterator<p> iterator = h1.iterator();
            while (iterator.hasNext()) {
                iterator.next().h(canvas);
            }
        }
        this.y0(false);
        final u r0 = this.r0;
        if (r0 != null) {
            final c0 s = r0.s;
            if (s != null) {
                s.d();
            }
        }
        super.dispatchDraw(canvas);
        if (this.r0 == null) {
            return;
        }
        if ((this.O0 & 0x1) == 0x1 && !this.isInEditMode()) {
            ++this.j1;
            final long nanoTime = this.getNanoTime();
            final long k1 = this.k1;
            Label_0178: {
                if (k1 != -1L) {
                    final long n = nanoTime - k1;
                    if (n <= 200000000L) {
                        break Label_0178;
                    }
                    this.l1 = (int)(this.j1 / (n * 1.0E-9f) * 100.0f) / 100.0f;
                    this.j1 = 0;
                }
                this.k1 = nanoTime;
            }
            final Paint paint = new Paint();
            paint.setTextSize(42.0f);
            final float f = (int)(this.getProgress() * 1000.0f) / 10.0f;
            final StringBuilder sb = new StringBuilder();
            sb.append(this.l1);
            sb.append(" fps ");
            sb.append(androidx.constraintlayout.motion.widget.c.l(this, this.v0));
            sb.append(" -> ");
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(androidx.constraintlayout.motion.widget.c.l(this, this.x0));
            sb2.append(" (progress: ");
            sb2.append(f);
            sb2.append(" ) state=");
            final int w0 = this.w0;
            String l;
            if (w0 == -1) {
                l = "undefined";
            }
            else {
                l = androidx.constraintlayout.motion.widget.c.l(this, w0);
            }
            sb2.append(l);
            final String string2 = sb2.toString();
            paint.setColor(-16777216);
            canvas.drawText(string2, 11.0f, (float)(this.getHeight() - 29), paint);
            paint.setColor(-7864184);
            canvas.drawText(string2, 10.0f, (float)(this.getHeight() - 30), paint);
        }
        if (this.O0 > 1) {
            if (this.P0 == null) {
                this.P0 = new g();
            }
            this.P0.a(canvas, this.B0, this.r0.t(), this.O0);
        }
        final ArrayList<p> h2 = this.h1;
        if (h2 != null) {
            final Iterator<p> iterator2 = h2.iterator();
            while (iterator2.hasNext()) {
                iterator2.next().i(canvas);
            }
        }
    }
    
    public void f1(int w0, float n, final float n2) {
        if (this.r0 == null) {
            return;
        }
        if (this.F0 == n) {
            return;
        }
        this.Q0 = true;
        this.C0 = this.getNanoTime();
        this.D0 = this.r0.t() / 1000.0f;
        this.H0 = n;
        this.J0 = true;
        Label_0344: {
            while (true) {
                Label_0211: {
                    r s0 = null;
                    Label_0202: {
                        if (w0 != 0 && w0 != 1 && w0 != 2) {
                            if (w0 != 4) {
                                if (w0 != 5) {
                                    if (w0 != 6 && w0 != 7) {
                                        break Label_0344;
                                    }
                                    break Label_0211;
                                }
                                else if (!s1(n2, this.F0, this.r0.B())) {
                                    this.R0.b(this.F0, n, n2, this.D0, this.r0.B(), this.r0.C());
                                    this.u0 = 0.0f;
                                    break Label_0153;
                                }
                            }
                            this.S0.b(n2, this.F0, this.r0.B());
                            s0 = this.S0;
                            break Label_0202;
                        }
                        break Label_0211;
                        w0 = this.w0;
                        this.H0 = n;
                        this.w0 = w0;
                        s0 = this.R0;
                    }
                    this.s0 = (Interpolator)s0;
                    break Label_0344;
                }
                if (w0 != 1 && w0 != 7) {
                    if (w0 == 2 || w0 == 6) {
                        n = 1.0f;
                    }
                }
                else {
                    n = 0.0f;
                }
                w0 = this.r0.n();
                final androidx.constraintlayout.motion.utils.a r0 = this.R0;
                final float f0 = this.F0;
                if (w0 == 0) {
                    r0.b(f0, n, n2, this.D0, this.r0.B(), this.r0.C());
                    continue;
                }
                r0.f(f0, n, n2, this.r0.J(), this.r0.K(), this.r0.I(), this.r0.L(), this.r0.H());
                continue;
            }
        }
        this.I0 = false;
        this.C0 = this.getNanoTime();
        this.invalidate();
    }
    
    public void g1(final float n, final float n2) {
        if (this.r0 == null) {
            return;
        }
        if (this.F0 == n) {
            return;
        }
        this.Q0 = true;
        this.C0 = this.getNanoTime();
        this.D0 = this.r0.t() / 1000.0f;
        this.H0 = n;
        this.J0 = true;
        this.R0.f(this.F0, n, n2, this.r0.J(), this.r0.K(), this.r0.I(), this.r0.L(), this.r0.H());
        final int w0 = this.w0;
        this.H0 = n;
        this.w0 = w0;
        this.s0 = (Interpolator)this.R0;
        this.I0 = false;
        this.C0 = this.getNanoTime();
        this.invalidate();
    }
    
    public int[] getConstraintSetIds() {
        final u r0 = this.r0;
        if (r0 == null) {
            return null;
        }
        return r0.r();
    }
    
    public int getCurrentState() {
        return this.w0;
    }
    
    public ArrayList<u.b> getDefinedTransitions() {
        final u r0 = this.r0;
        if (r0 == null) {
            return null;
        }
        return r0.s();
    }
    
    public androidx.constraintlayout.motion.widget.d getDesignTool() {
        if (this.T0 == null) {
            this.T0 = new androidx.constraintlayout.motion.widget.d(this);
        }
        return this.T0;
    }
    
    public int getEndState() {
        return this.x0;
    }
    
    protected long getNanoTime() {
        return System.nanoTime();
    }
    
    public float getProgress() {
        return this.F0;
    }
    
    public int getStartState() {
        return this.v0;
    }
    
    public float getTargetPosition() {
        return this.H0;
    }
    
    public Bundle getTransitionState() {
        if (this.z1 == null) {
            this.z1 = new k();
        }
        this.z1.c();
        return this.z1.b();
    }
    
    public long getTransitionTimeMs() {
        final u r0 = this.r0;
        if (r0 != null) {
            this.D0 = r0.t() / 1000.0f;
        }
        return (long)(this.D0 * 1000.0f);
    }
    
    public float getVelocity() {
        return this.u0;
    }
    
    public void h1() {
        this.l0(1.0f);
        this.A1 = null;
    }
    
    public void i1(final Runnable a1) {
        this.l0(1.0f);
        this.A1 = a1;
    }
    
    public boolean isAttachedToWindow() {
        if (Build$VERSION.SDK_INT >= 19) {
            return super.isAttachedToWindow();
        }
        return this.getWindowToken() != null;
    }
    
    public void j1() {
        this.l0(0.0f);
    }
    
    public void k0(final l e) {
        if (this.i1 == null) {
            this.i1 = new CopyOnWriteArrayList<l>();
        }
        this.i1.add(e);
    }
    
    public void k1(final int n) {
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.d(n);
            return;
        }
        this.m1(n, -1, -1);
    }
    
    void l0(final float h0) {
        final u r0 = this.r0;
        if (r0 == null) {
            return;
        }
        final float f0 = this.F0;
        final float e0 = this.E0;
        if (f0 != e0 && this.I0) {
            this.F0 = e0;
        }
        final float f2 = this.F0;
        if (f2 == h0) {
            return;
        }
        this.Q0 = false;
        this.H0 = h0;
        this.D0 = r0.t() / 1000.0f;
        this.setProgress(this.H0);
        this.s0 = null;
        this.t0 = this.r0.x();
        this.I0 = false;
        this.C0 = this.getNanoTime();
        this.J0 = true;
        this.E0 = f2;
        this.F0 = f2;
        this.invalidate();
    }
    
    public void l1(final int n, final int n2) {
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.d(n);
            return;
        }
        this.n1(n, -1, -1, n2);
    }
    
    public boolean m0(final int n, final o o) {
        final u r0 = this.r0;
        return r0 != null && r0.h(n, o);
    }
    
    public void m1(final int n, final int n2, final int n3) {
        this.n1(n, n2, n3, -1);
    }
    
    public void n1(int i, int n, int n2, int n3) {
        final u r0 = this.r0;
        int x0 = i;
        if (r0 != null) {
            final androidx.constraintlayout.widget.m b = r0.b;
            x0 = i;
            if (b != null) {
                n = b.a(this.w0, i, (float)n, (float)n2);
                x0 = i;
                if (n != -1) {
                    x0 = n;
                }
            }
        }
        i = this.w0;
        if (i == x0) {
            return;
        }
        if (this.v0 == x0) {
            this.l0(0.0f);
            if (n3 > 0) {
                this.D0 = n3 / 1000.0f;
            }
            return;
        }
        if (this.x0 == x0) {
            this.l0(1.0f);
            if (n3 > 0) {
                this.D0 = n3 / 1000.0f;
            }
            return;
        }
        this.x0 = x0;
        if (i != -1) {
            this.c1(i, x0);
            this.l0(1.0f);
            this.F0 = 0.0f;
            this.h1();
            if (n3 > 0) {
                this.D0 = n3 / 1000.0f;
            }
            return;
        }
        n2 = 0;
        this.Q0 = false;
        this.H0 = 1.0f;
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.G0 = this.getNanoTime();
        this.C0 = this.getNanoTime();
        this.I0 = false;
        this.s0 = null;
        if (n3 == -1) {
            this.D0 = this.r0.t() / 1000.0f;
        }
        this.v0 = -1;
        this.r0.n0(-1, this.x0);
        final SparseArray sparseArray = new SparseArray();
        Label_0310: {
            if (n3 == 0) {
                n3 = this.r0.t();
            }
            else if (n3 <= 0) {
                break Label_0310;
            }
            this.D0 = n3 / 1000.0f;
        }
        n3 = this.getChildCount();
        this.B0.clear();
        View child;
        for (i = 0; i < n3; ++i) {
            child = this.getChildAt(i);
            this.B0.put(child, new o(child));
            sparseArray.put(child.getId(), (Object)this.B0.get(child));
        }
        this.J0 = true;
        this.M1.g(super.I, null, this.r0.o(x0));
        this.X0();
        this.M1.a();
        this.s0();
        n = this.getWidth();
        final int height = this.getHeight();
        if (this.h1 != null) {
            o o;
            for (i = 0; i < n3; ++i) {
                o = this.B0.get(this.getChildAt(i));
                if (o != null) {
                    this.r0.z(o);
                }
            }
            final Iterator<p> iterator = this.h1.iterator();
            while (iterator.hasNext()) {
                iterator.next().g(this, this.B0);
            }
            o o2;
            for (i = 0; i < n3; ++i) {
                o2 = this.B0.get(this.getChildAt(i));
                if (o2 != null) {
                    o2.Z(n, height, this.D0, this.getNanoTime());
                }
            }
        }
        else {
            o o3;
            for (i = 0; i < n3; ++i) {
                o3 = this.B0.get(this.getChildAt(i));
                if (o3 != null) {
                    this.r0.z(o3);
                    o3.Z(n, height, this.D0, this.getNanoTime());
                }
            }
        }
        final float m = this.r0.M();
        if (m != 0.0f) {
            float min = Float.MAX_VALUE;
            float max = -3.4028235E38f;
            n = 0;
            while (true) {
                i = n2;
                if (n >= n3) {
                    break;
                }
                final o o4 = this.B0.get(this.getChildAt(n));
                final float n4 = o4.u() + o4.t();
                min = Math.min(min, n4);
                max = Math.max(max, n4);
                ++n;
            }
            while (i < n3) {
                final o o5 = this.B0.get(this.getChildAt(i));
                final float t = o5.t();
                final float u = o5.u();
                o5.n = 1.0f / (1.0f - m);
                o5.m = m - (t + u - min) * m / (max - min);
                ++i;
            }
        }
        this.E0 = 0.0f;
        this.F0 = 0.0f;
        this.J0 = true;
        this.invalidate();
    }
    
    public void o1() {
        this.M1.g(super.I, this.r0.o(this.v0), this.r0.o(this.x0));
        this.X0();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Build$VERSION.SDK_INT >= 17) {
            final Display display = this.getDisplay();
            if (display != null) {
                this.I1 = display.getRotation();
            }
        }
        final u r0 = this.r0;
        if (r0 != null) {
            final int w0 = this.w0;
            if (w0 != -1) {
                final androidx.constraintlayout.widget.e o = r0.o(w0);
                this.r0.h0(this);
                final ArrayList<p> h1 = this.h1;
                if (h1 != null) {
                    final Iterator<p> iterator = h1.iterator();
                    while (iterator.hasNext()) {
                        iterator.next().b(this);
                    }
                }
                if (o != null) {
                    o.r(this);
                }
                this.v0 = this.w0;
            }
        }
        this.U0();
        final k z1 = this.z1;
        if (z1 != null) {
            if (this.K1) {
                this.post((Runnable)new Runnable() {
                    @Override
                    public void run() {
                        s.this.z1.a();
                    }
                });
            }
            else {
                z1.a();
            }
        }
        else {
            final u r2 = this.r0;
            if (r2 != null) {
                final u.b c = r2.c;
                if (c != null && c.z() == 4) {
                    this.h1();
                    this.setState(m.H);
                    this.setState(m.I);
                }
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final u r0 = this.r0;
        if (r0 != null) {
            if (this.A0) {
                final c0 s = r0.s;
                if (s != null) {
                    s.l(motionEvent);
                }
                final u.b c = this.r0.c;
                if (c != null && c.K()) {
                    final androidx.constraintlayout.motion.widget.x j = c.J();
                    if (j != null) {
                        if (motionEvent.getAction() == 0) {
                            final RectF r2 = j.r(this, new RectF());
                            if (r2 != null && !r2.contains(motionEvent.getX(), motionEvent.getY())) {
                                return false;
                            }
                        }
                        final int s2 = j.s();
                        if (s2 != -1) {
                            final View p = this.P1;
                            if (p == null || p.getId() != s2) {
                                this.P1 = this.findViewById(s2);
                            }
                            final View p2 = this.P1;
                            if (p2 != null) {
                                this.O1.set((float)p2.getLeft(), (float)this.P1.getTop(), (float)this.P1.getRight(), (float)this.P1.getBottom());
                                if (this.O1.contains(motionEvent.getX(), motionEvent.getY()) && !this.L0((float)this.P1.getLeft(), (float)this.P1.getTop(), this.P1, motionEvent)) {
                                    return this.onTouchEvent(motionEvent);
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    protected void onLayout(final boolean b, int n, int n2, final int n3, final int n4) {
        this.y1 = true;
        try {
            if (this.r0 == null) {
                super.onLayout(b, n, n2, n3, n4);
                return;
            }
            n = n3 - n;
            n2 = n4 - n2;
            if (this.X0 != n || this.Y0 != n2) {
                this.X0();
                this.y0(true);
            }
            this.X0 = n;
            this.Y0 = n2;
            this.V0 = n;
            this.W0 = n2;
        }
        finally {
            this.y1 = false;
        }
    }
    
    @Override
    protected void onMeasure(int y0, int z0) {
        if (this.r0 == null) {
            super.onMeasure(y0, z0);
            return;
        }
        final int y2 = this.y0;
        final int n = 0;
        boolean b = y2 != y0 || this.z0 != z0;
        if (this.N1) {
            this.N1 = false;
            this.U0();
            this.V0();
            b = true;
        }
        if (super.N) {
            b = true;
        }
        this.y0 = y0;
        this.z0 = z0;
        final int n2 = this.r0.N();
        final int u = this.r0.u();
        if ((b || this.M1.h(n2, u)) && this.v0 != -1) {
            super.onMeasure(y0, z0);
            this.M1.g(super.I, this.r0.o(n2), this.r0.o(u));
            this.M1.j();
            this.M1.k(n2, u);
            y0 = n;
        }
        else {
            if (b) {
                super.onMeasure(y0, z0);
            }
            y0 = 1;
        }
        if (this.p1 || y0 != 0) {
            z0 = this.getPaddingTop();
            final int paddingBottom = this.getPaddingBottom();
            y0 = this.getPaddingLeft();
            y0 = super.I.j0() + (y0 + this.getPaddingRight());
            z0 = super.I.D() + (z0 + paddingBottom);
            final int u2 = this.u1;
            if (u2 == Integer.MIN_VALUE || u2 == 0) {
                y0 = this.q1;
                y0 += (int)(this.w1 * (this.s1 - y0));
                this.requestLayout();
            }
            final int v1 = this.v1;
            if (v1 == Integer.MIN_VALUE || v1 == 0) {
                z0 = this.r1;
                z0 += (int)(this.w1 * (this.t1 - z0));
                this.requestLayout();
            }
            this.setMeasuredDimension(y0, z0);
        }
        this.z0();
    }
    
    public boolean onNestedFling(@j0 final View view, final float n, final float n2, final boolean b) {
        return false;
    }
    
    public boolean onNestedPreFling(@j0 final View view, final float n, final float n2) {
        return false;
    }
    
    public void onRtlPropertiesChanged(final int n) {
        final u r0 = this.r0;
        if (r0 != null) {
            r0.m0(this.w());
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final u r0 = this.r0;
        if (r0 == null || !this.A0 || !r0.r0()) {
            return super.onTouchEvent(motionEvent);
        }
        final u.b c = this.r0.c;
        if (c != null && !c.K()) {
            return super.onTouchEvent(motionEvent);
        }
        this.r0.f0(motionEvent, this.getCurrentState(), this);
        return true;
    }
    
    @Override
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        if (view instanceof p) {
            final p p = (p)view;
            if (this.i1 == null) {
                this.i1 = new CopyOnWriteArrayList<l>();
            }
            this.i1.add((l)p);
            if (p.e()) {
                if (this.f1 == null) {
                    this.f1 = new ArrayList<p>();
                }
                this.f1.add(p);
            }
            if (p.f()) {
                if (this.g1 == null) {
                    this.g1 = new ArrayList<p>();
                }
                this.g1.add(p);
            }
            if (p.j()) {
                if (this.h1 == null) {
                    this.h1 = new ArrayList<p>();
                }
                this.h1.add(p);
            }
        }
    }
    
    @Override
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        final ArrayList<p> f1 = this.f1;
        if (f1 != null) {
            f1.remove(view);
        }
        final ArrayList<p> g1 = this.g1;
        if (g1 != null) {
            g1.remove(view);
        }
    }
    
    @Override
    public void p(@j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (this.Z0 || n != 0 || n2 != 0) {
            array[0] += n3;
            array[1] += n4;
        }
        this.Z0 = false;
    }
    
    public void p1(final int n, final androidx.constraintlayout.widget.e e) {
        final u r0 = this.r0;
        if (r0 != null) {
            r0.j0(n, e);
        }
        this.o1();
        if (this.w0 == n) {
            e.r(this);
        }
    }
    
    public void q(@j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
    }
    
    public void q1(final int n, final androidx.constraintlayout.widget.e e, final int n2) {
        if (this.r0 == null) {
            return;
        }
        if (this.w0 == n) {
            final int l3 = androidx.constraintlayout.widget.j.g.L3;
            this.p1(l3, this.F0(n));
            this.F(l3, -1, -1);
            this.p1(n, e);
            final u.b transition = new u.b(-1, this.r0, l3, n);
            transition.O(n2);
            this.setTransition(transition);
            this.h1();
        }
    }
    
    public boolean r(@j0 final View view, @j0 final View view2, final int n, final int n2) {
        final u r0 = this.r0;
        if (r0 != null) {
            final u.b c = r0.c;
            if (c != null && c.J() != null) {
                if ((this.r0.c.J().f() & 0x2) == 0x0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public androidx.constraintlayout.widget.e r0(final int n) {
        final u r0 = this.r0;
        if (r0 == null) {
            return null;
        }
        final androidx.constraintlayout.widget.e o = r0.o(n);
        final androidx.constraintlayout.widget.e e = new androidx.constraintlayout.widget.e();
        e.I(o);
        return e;
    }
    
    public void r1(final int n, final View... array) {
        final u r0 = this.r0;
        if (r0 != null) {
            r0.t0(n, array);
        }
        else {
            Log.e("MotionLayout", " no motionScene");
        }
    }
    
    @Override
    public void requestLayout() {
        if (!this.p1 && this.w0 == -1) {
            final u r0 = this.r0;
            if (r0 != null) {
                final u.b c = r0.c;
                if (c != null && c.E() == 0) {
                    return;
                }
            }
        }
        super.requestLayout();
    }
    
    public void s(@j0 final View view, @j0 final View view2, final int n, final int n2) {
        this.c1 = this.getNanoTime();
        this.d1 = 0.0f;
        this.a1 = 0.0f;
        this.b1 = 0.0f;
    }
    
    public void setDebugMode(final int o0) {
        this.O0 = o0;
        this.invalidate();
    }
    
    public void setDelayedApplicationOfInitialState(final boolean k1) {
        this.K1 = k1;
    }
    
    public void setInteractionEnabled(final boolean a0) {
        this.A0 = a0;
    }
    
    public void setInterpolatedProgress(final float progress) {
        if (this.r0 != null) {
            this.setState(m.I);
            final Interpolator x = this.r0.x();
            if (x != null) {
                this.setProgress(x.getInterpolation(progress));
                return;
            }
        }
        this.setProgress(progress);
    }
    
    public void setOnHide(final float progress) {
        final ArrayList<p> g1 = this.g1;
        if (g1 != null) {
            for (int size = g1.size(), i = 0; i < size; ++i) {
                this.g1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setOnShow(final float progress) {
        final ArrayList<p> f1 = this.f1;
        if (f1 != null) {
            for (int size = f1.size(), i = 0; i < size; ++i) {
                this.f1.get(i).setProgress(progress);
            }
        }
    }
    
    public void setProgress(final float n) {
        final float n2 = fcmpg(n, 0.0f);
        if (n2 < 0 || n > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.e(n);
            return;
        }
        Label_0180: {
            m state = null;
            Label_0175: {
                if (n2 <= 0) {
                    if (this.F0 == 1.0f && this.w0 == this.x0) {
                        this.setState(m.I);
                    }
                    this.w0 = this.v0;
                    if (this.F0 != 0.0f) {
                        break Label_0180;
                    }
                }
                else {
                    if (n < 1.0f) {
                        this.w0 = -1;
                        state = m.I;
                        break Label_0175;
                    }
                    if (this.F0 == 0.0f && this.w0 == this.v0) {
                        this.setState(m.I);
                    }
                    this.w0 = this.x0;
                    if (this.F0 != 1.0f) {
                        break Label_0180;
                    }
                }
                state = m.J;
            }
            this.setState(state);
        }
        if (this.r0 == null) {
            return;
        }
        this.I0 = true;
        this.H0 = n;
        this.E0 = n;
        this.G0 = -1L;
        this.C0 = -1L;
        this.s0 = null;
        this.J0 = true;
        this.invalidate();
    }
    
    public void setScene(final u r0) {
        (this.r0 = r0).m0(this.w());
        this.X0();
    }
    
    void setStartState(final int w0) {
        if (!this.isAttachedToWindow()) {
            if (this.z1 == null) {
                this.z1 = new k();
            }
            this.z1.f(w0);
            this.z1.d(w0);
            return;
        }
        this.w0 = w0;
    }
    
    void setState(final m l1) {
        final m j = m.J;
        if (l1 == j && this.w0 == -1) {
            return;
        }
        final m l2 = this.L1;
        this.L1 = l1;
        final m i = m.I;
        if (l2 == i && l1 == i) {
            this.A0();
        }
        final int n = s$e.a[l2.ordinal()];
        if (n != 1 && n != 2) {
            if (n != 3) {
                return;
            }
            if (l1 != j) {
                return;
            }
        }
        else {
            if (l1 == i) {
                this.A0();
            }
            if (l1 != j) {
                return;
            }
        }
        this.B0();
    }
    
    public void setTransition(int n) {
        if (this.r0 != null) {
            final u.b j0 = this.J0(n);
            this.v0 = j0.I();
            this.x0 = j0.B();
            if (!this.isAttachedToWindow()) {
                if (this.z1 == null) {
                    this.z1 = new k();
                }
                this.z1.f(this.v0);
                this.z1.d(this.x0);
                return;
            }
            float progress = Float.NaN;
            final int w0 = this.w0;
            n = this.v0;
            float f0 = 0.0f;
            if (w0 == n) {
                progress = 0.0f;
            }
            else if (w0 == this.x0) {
                progress = 1.0f;
            }
            this.r0.o0(j0);
            this.M1.g(super.I, this.r0.o(this.v0), this.r0.o(this.x0));
            this.X0();
            Label_0229: {
                if (this.F0 != progress) {
                    u u;
                    if (progress == 0.0f) {
                        this.x0(true);
                        u = this.r0;
                        n = this.v0;
                    }
                    else {
                        if (progress != 1.0f) {
                            break Label_0229;
                        }
                        this.x0(false);
                        u = this.r0;
                        n = this.x0;
                    }
                    u.o(n).r(this);
                }
            }
            if (!Float.isNaN(progress)) {
                f0 = progress;
            }
            this.F0 = f0;
            if (Float.isNaN(progress)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(androidx.constraintlayout.motion.widget.c.g());
                sb.append(" transitionToStart ");
                Log.v("MotionLayout", sb.toString());
                this.j1();
            }
            else {
                this.setProgress(progress);
            }
        }
    }
    
    protected void setTransition(final u.b b) {
        this.r0.o0(b);
        this.setState(m.H);
        float h0;
        if (this.w0 == this.r0.u()) {
            h0 = 1.0f;
        }
        else {
            h0 = 0.0f;
        }
        this.F0 = h0;
        this.E0 = h0;
        this.H0 = h0;
        long nanoTime;
        if (b.L(1)) {
            nanoTime = -1L;
        }
        else {
            nanoTime = this.getNanoTime();
        }
        this.G0 = nanoTime;
        final int n = this.r0.N();
        final int u = this.r0.u();
        if (n == this.v0 && u == this.x0) {
            return;
        }
        this.v0 = n;
        this.x0 = u;
        this.r0.n0(n, u);
        this.M1.g(super.I, this.r0.o(this.v0), this.r0.o(this.x0));
        this.M1.k(this.v0, this.x0);
        this.M1.j();
        this.X0();
    }
    
    public void setTransitionDuration(final int n) {
        final u r0 = this.r0;
        if (r0 == null) {
            Log.e("MotionLayout", "MotionScene not defined");
            return;
        }
        r0.k0(n);
    }
    
    public void setTransitionListener(final l l0) {
        this.L0 = l0;
    }
    
    public void setTransitionState(final Bundle bundle) {
        if (this.z1 == null) {
            this.z1 = new k();
        }
        this.z1.g(bundle);
        if (this.isAttachedToWindow()) {
            this.z1.a();
        }
    }
    
    public void t(@j0 final View view, final int n) {
        final u r0 = this.r0;
        if (r0 != null) {
            final float d1 = this.d1;
            if (d1 != 0.0f) {
                r0.e0(this.a1 / d1, this.b1 / d1);
            }
        }
    }
    
    public String toString() {
        final Context context = this.getContext();
        final StringBuilder sb = new StringBuilder();
        sb.append(androidx.constraintlayout.motion.widget.c.i(context, this.v0));
        sb.append("->");
        sb.append(androidx.constraintlayout.motion.widget.c.i(context, this.x0));
        sb.append(" (pos:");
        sb.append(this.F0);
        sb.append(" Dpos/Dt:");
        sb.append(this.u0);
        return sb.toString();
    }
    
    public void u(@j0 final View view, final int n, final int n2, @j0 final int[] array, int s) {
        final u r0 = this.r0;
        if (r0 == null) {
            return;
        }
        final u.b c = r0.c;
        if (c != null) {
            if (c.K()) {
                final boolean k = c.K();
                final int n3 = -1;
                if (k) {
                    final androidx.constraintlayout.motion.widget.x j = c.J();
                    if (j != null) {
                        s = j.s();
                        if (s != -1 && view.getId() != s) {
                            return;
                        }
                    }
                }
                if (r0.D()) {
                    final androidx.constraintlayout.motion.widget.x i = c.J();
                    s = n3;
                    if (i != null) {
                        s = n3;
                        if ((i.f() & 0x4) != 0x0) {
                            s = n2;
                        }
                    }
                    final float e0 = this.E0;
                    if ((e0 == 1.0f || e0 == 0.0f) && view.canScrollVertically(s)) {
                        return;
                    }
                }
                if (c.J() != null && (c.J().f() & 0x1) != 0x0) {
                    final float f = r0.F((float)n, (float)n2);
                    final float f2 = this.F0;
                    if ((f2 <= 0.0f && f < 0.0f) || (f2 >= 1.0f && f > 0.0f)) {
                        if (Build$VERSION.SDK_INT >= 21) {
                            view.setNestedScrollingEnabled(false);
                            view.post((Runnable)new Runnable() {
                                @Override
                                public void run() {
                                    view.setNestedScrollingEnabled(true);
                                }
                            });
                        }
                        return;
                    }
                }
                final float e2 = this.E0;
                final long nanoTime = this.getNanoTime();
                final float a1 = (float)n;
                this.a1 = a1;
                final float b1 = (float)n2;
                this.b1 = b1;
                this.d1 = (float)((nanoTime - this.c1) * 1.0E-9);
                this.c1 = nanoTime;
                r0.d0(a1, b1);
                if (e2 != this.E0) {
                    array[0] = n;
                    array[1] = n2;
                }
                this.y0(false);
                if (array[0] != 0 || array[1] != 0) {
                    this.Z0 = true;
                }
            }
        }
    }
    
    void u0(final boolean b) {
        final u r0 = this.r0;
        if (r0 == null) {
            return;
        }
        r0.k(b);
    }
    
    public void v0(final int n, final boolean b) {
        final u.b j0 = this.J0(n);
        boolean b2;
        if (b) {
            b2 = true;
        }
        else {
            final u r0 = this.r0;
            if (j0 == r0.c) {
                for (final u.b c : r0.Q(this.w0)) {
                    if (c.K()) {
                        this.r0.c = c;
                        break;
                    }
                }
            }
            b2 = false;
        }
        j0.Q(b2);
    }
    
    public void w0(final int n, final boolean b) {
        final u r0 = this.r0;
        if (r0 != null) {
            r0.l(n, b);
        }
    }
    
    @Override
    public void x(int i1) {
        if (i1 != 0) {
            try {
                final u r0 = new u(this.getContext(), this, i1);
                this.r0 = r0;
                if (this.w0 == -1) {
                    this.w0 = r0.N();
                    this.v0 = this.r0.N();
                    this.x0 = this.r0.u();
                }
                i1 = Build$VERSION.SDK_INT;
                if (i1 >= 19 && !this.isAttachedToWindow()) {
                    this.r0 = null;
                    return;
                }
                Label_0119: {
                    if (i1 < 17) {
                        break Label_0119;
                    }
                    try {
                        final Display display = this.getDisplay();
                        if (display == null) {
                            i1 = 0;
                        }
                        else {
                            i1 = display.getRotation();
                        }
                        this.I1 = i1;
                        final u r2 = this.r0;
                        if (r2 != null) {
                            final androidx.constraintlayout.widget.e o = r2.o(this.w0);
                            this.r0.h0(this);
                            final ArrayList<p> h1 = this.h1;
                            if (h1 != null) {
                                final Iterator<p> iterator = h1.iterator();
                                while (iterator.hasNext()) {
                                    iterator.next().b(this);
                                }
                            }
                            if (o != null) {
                                o.r(this);
                            }
                            this.v0 = this.w0;
                        }
                        this.U0();
                        final k z1 = this.z1;
                        if (z1 != null) {
                            if (this.K1) {
                                this.post((Runnable)new Runnable() {
                                    @Override
                                    public void run() {
                                        s.this.z1.a();
                                    }
                                });
                                return;
                            }
                            z1.a();
                            return;
                        }
                        else {
                            final u r3 = this.r0;
                            if (r3 == null) {
                                return;
                            }
                            final u.b c = r3.c;
                            if (c != null && c.z() == 4) {
                                this.h1();
                                this.setState(m.H);
                                this.setState(m.I);
                            }
                            return;
                        }
                    }
                    catch (Exception cause) {
                        throw new IllegalArgumentException("unable to parse MotionScene file", cause);
                    }
                }
            }
            catch (Exception cause2) {
                throw new IllegalArgumentException("unable to parse MotionScene file", cause2);
            }
        }
        this.r0 = null;
    }
    
    void x0(final boolean b) {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final o o = this.B0.get(this.getChildAt(i));
            if (o != null) {
                o.i(b);
            }
        }
    }
    
    void y0(final boolean b) {
        if (this.G0 == -1L) {
            this.G0 = this.getNanoTime();
        }
        final float f0 = this.F0;
        if (f0 > 0.0f && f0 < 1.0f) {
            this.w0 = -1;
        }
        final boolean e1 = this.e1;
        final boolean b2 = true;
        final boolean b3 = false;
        final boolean b4 = false;
        boolean b5 = false;
        Label_1166: {
            if (!e1) {
                b5 = b3;
                if (!this.J0) {
                    break Label_1166;
                }
                if (!b) {
                    b5 = b3;
                    if (this.H0 == f0) {
                        break Label_1166;
                    }
                }
            }
            final float signum = Math.signum(this.H0 - f0);
            final long nanoTime = this.getNanoTime();
            final Interpolator s0 = this.s0;
            float u0;
            if (!(s0 instanceof r)) {
                u0 = (nanoTime - this.G0) * signum * 1.0E-9f / this.D0;
            }
            else {
                u0 = 0.0f;
            }
            float n = this.F0 + u0;
            if (this.I0) {
                n = this.H0;
            }
            final float n2 = fcmpl(signum, 0.0f);
            boolean b6;
            if ((n2 > 0 && n >= this.H0) || (signum <= 0.0f && n <= this.H0)) {
                n = this.H0;
                this.J0 = false;
                b6 = true;
            }
            else {
                b6 = false;
            }
            this.F0 = n;
            this.E0 = n;
            this.G0 = nanoTime;
            int n3 = 0;
            Label_0539: {
                if (s0 != null && !b6) {
                    if (this.Q0) {
                        final float interpolation = s0.getInterpolation((nanoTime - this.C0) * 1.0E-9f);
                        final Interpolator s2 = this.s0;
                        final androidx.constraintlayout.motion.utils.a r0 = this.R0;
                        if (s2 == r0) {
                            if (r0.e()) {
                                n3 = 2;
                            }
                            else {
                                n3 = 1;
                            }
                        }
                        else {
                            n3 = 0;
                        }
                        this.F0 = interpolation;
                        this.G0 = nanoTime;
                        final Interpolator s3 = this.s0;
                        float n4 = interpolation;
                        if (s3 instanceof r) {
                            final float a = ((r)s3).a();
                            this.u0 = a;
                            if (Math.abs(a) * this.D0 <= 1.0E-5f && n3 == 2) {
                                this.J0 = false;
                            }
                            float n5 = interpolation;
                            if (a > 0.0f) {
                                n5 = interpolation;
                                if (interpolation >= 1.0f) {
                                    this.F0 = 1.0f;
                                    this.J0 = false;
                                    n5 = 1.0f;
                                }
                            }
                            n4 = n5;
                            if (a < 0.0f) {
                                n4 = n5;
                                if (n5 <= 0.0f) {
                                    this.F0 = 0.0f;
                                    this.J0 = false;
                                    n = 0.0f;
                                    break Label_0539;
                                }
                            }
                        }
                        n = n4;
                        break Label_0539;
                    }
                    final float interpolation2 = s0.getInterpolation(n);
                    final Interpolator s4 = this.s0;
                    float a2;
                    if (s4 instanceof r) {
                        a2 = ((r)s4).a();
                    }
                    else {
                        a2 = (s4.getInterpolation(n + u0) - interpolation2) * signum / u0;
                    }
                    this.u0 = a2;
                    n = interpolation2;
                }
                else {
                    this.u0 = u0;
                }
                n3 = 0;
            }
            if (Math.abs(this.u0) > 1.0E-5f) {
                this.setState(m.I);
            }
            float w1 = n;
            Label_0649: {
                if (n3 != 1) {
                    float h0 = 0.0f;
                    Label_0615: {
                        if (n2 <= 0 || n < this.H0) {
                            h0 = n;
                            if (signum > 0.0f) {
                                break Label_0615;
                            }
                            h0 = n;
                            if (n > this.H0) {
                                break Label_0615;
                            }
                        }
                        h0 = this.H0;
                        this.J0 = false;
                    }
                    if (h0 < 1.0f) {
                        w1 = h0;
                        if (h0 > 0.0f) {
                            break Label_0649;
                        }
                    }
                    this.J0 = false;
                    this.setState(m.J);
                    w1 = h0;
                }
            }
            final int childCount = this.getChildCount();
            this.e1 = false;
            final long nanoTime2 = this.getNanoTime();
            this.w1 = w1;
            final Interpolator t0 = this.t0;
            float interpolation3;
            if (t0 == null) {
                interpolation3 = w1;
            }
            else {
                interpolation3 = t0.getInterpolation(w1);
            }
            final Interpolator t2 = this.t0;
            if (t2 != null) {
                final float interpolation4 = t2.getInterpolation(signum / this.D0 + w1);
                this.u0 = interpolation4;
                this.u0 = interpolation4 - this.t0.getInterpolation(w1);
            }
            for (int i = 0; i < childCount; ++i) {
                final View child = this.getChildAt(i);
                final o o = this.B0.get(child);
                if (o != null) {
                    this.e1 |= o.L(child, interpolation3, nanoTime2, this.x1);
                }
            }
            final boolean b7 = (n2 > 0 && w1 >= this.H0) || (signum <= 0.0f && w1 <= this.H0);
            if (!this.e1 && !this.J0 && b7) {
                this.setState(m.J);
            }
            if (this.p1) {
                this.requestLayout();
            }
            this.e1 |= (b7 ^ true);
            boolean b8 = b4;
            if (w1 <= 0.0f) {
                final int v0 = this.v0;
                b8 = b4;
                if (v0 != -1) {
                    b8 = b4;
                    if (this.w0 != v0) {
                        this.w0 = v0;
                        this.r0.o(v0).p(this);
                        this.setState(m.J);
                        b8 = true;
                    }
                }
            }
            boolean b9 = b8;
            if (w1 >= 1.0) {
                final int w2 = this.w0;
                final int x0 = this.x0;
                b9 = b8;
                if (w2 != x0) {
                    this.w0 = x0;
                    this.r0.o(x0).p(this);
                    this.setState(m.J);
                    b9 = true;
                }
            }
            if (!this.e1 && !this.J0) {
                if ((n2 > 0 && w1 == 1.0f) || (signum < 0.0f && w1 == 0.0f)) {
                    this.setState(m.J);
                }
            }
            else {
                this.invalidate();
            }
            b5 = b9;
            if (!this.e1) {
                b5 = b9;
                if (!this.J0) {
                    if (n2 <= 0 || w1 != 1.0f) {
                        b5 = b9;
                        if (signum >= 0.0f) {
                            break Label_1166;
                        }
                        b5 = b9;
                        if (w1 != 0.0f) {
                            break Label_1166;
                        }
                    }
                    this.U0();
                    b5 = b9;
                }
            }
        }
        final float f2 = this.F0;
        boolean b10 = false;
        Label_1268: {
            int w4;
            if (f2 >= 1.0f) {
                final int w3 = this.w0;
                final int x2 = this.x0;
                if (w3 != (w4 = x2)) {
                    w4 = x2;
                    b5 = b2;
                }
            }
            else {
                b10 = b5;
                if (f2 > 0.0f) {
                    break Label_1268;
                }
                final int w5 = this.w0;
                final int v2 = this.v0;
                if (w5 != (w4 = v2)) {
                    w4 = v2;
                    b5 = b2;
                }
            }
            this.w0 = w4;
            b10 = b5;
        }
        this.N1 |= b10;
        if (b10 && !this.y1) {
            this.requestLayout();
        }
        this.E0 = this.F0;
    }
    
    @Override
    protected void z(final int n) {
        super.Q = null;
    }
    
    class f extends r
    {
        float a;
        float b;
        float c;
        
        f() {
            this.a = 0.0f;
            this.b = 0.0f;
        }
        
        @Override
        public float a() {
            return s.this.u0;
        }
        
        public void b(final float a, final float b, final float c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public float getInterpolation(float n) {
            final float a = this.a;
            if (a > 0.0f) {
                final float c = this.c;
                float n2 = n;
                if (a / c < n) {
                    n2 = a / c;
                }
                s.this.u0 = a - c * n2;
                n = a * n2 - c * n2 * n2 / 2.0f;
            }
            else {
                final float n3 = -a;
                final float c2 = this.c;
                float n4 = n;
                if (n3 / c2 < n) {
                    n4 = -a / c2;
                }
                s.this.u0 = c2 * n4 + a;
                n = a * n4 + c2 * n4 * n4 / 2.0f;
            }
            return n + this.b;
        }
    }
    
    private class g
    {
        private static final int v = 16;
        float[] a;
        int[] b;
        float[] c;
        Path d;
        Paint e;
        Paint f;
        Paint g;
        Paint h;
        Paint i;
        private float[] j;
        final int k;
        final int l;
        final int m;
        final int n;
        final int o;
        DashPathEffect p;
        int q;
        Rect r;
        boolean s;
        int t;
        
        public g() {
            this.k = -21965;
            this.l = -2067046;
            this.m = -13391360;
            this.n = 1996488704;
            this.o = 10;
            this.r = new Rect();
            this.s = false;
            this.t = 1;
            (this.e = new Paint()).setAntiAlias(true);
            this.e.setColor(-21965);
            this.e.setStrokeWidth(2.0f);
            this.e.setStyle(Paint$Style.STROKE);
            (this.f = new Paint()).setAntiAlias(true);
            this.f.setColor(-2067046);
            this.f.setStrokeWidth(2.0f);
            this.f.setStyle(Paint$Style.STROKE);
            (this.g = new Paint()).setAntiAlias(true);
            this.g.setColor(-13391360);
            this.g.setStrokeWidth(2.0f);
            this.g.setStyle(Paint$Style.STROKE);
            (this.h = new Paint()).setAntiAlias(true);
            this.h.setColor(-13391360);
            this.h.setTextSize(androidx.constraintlayout.motion.widget.s.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.j = new float[8];
            (this.i = new Paint()).setAntiAlias(true);
            final DashPathEffect dashPathEffect = new DashPathEffect(new float[] { 4.0f, 8.0f }, 0.0f);
            this.p = dashPathEffect;
            this.g.setPathEffect((PathEffect)dashPathEffect);
            this.c = new float[100];
            this.b = new int[50];
            if (this.s) {
                this.e.setStrokeWidth(8.0f);
                this.i.setStrokeWidth(8.0f);
                this.f.setStrokeWidth(8.0f);
                this.t = 4;
            }
        }
        
        private void c(final Canvas canvas) {
            canvas.drawLines(this.a, this.e);
        }
        
        private void d(final Canvas canvas) {
            int i = 0;
            boolean b = false;
            boolean b2 = false;
            while (i < this.q) {
                final int[] b3 = this.b;
                if (b3[i] == 1) {
                    b = true;
                }
                if (b3[i] == 0) {
                    b2 = true;
                }
                ++i;
            }
            if (b) {
                this.g(canvas);
            }
            if (b2) {
                this.e(canvas);
            }
        }
        
        private void e(final Canvas canvas) {
            final float[] a = this.a;
            final float n = a[0];
            final float n2 = a[1];
            final float n3 = a[a.length - 2];
            final float n4 = a[a.length - 1];
            canvas.drawLine(Math.min(n, n3), Math.max(n2, n4), Math.max(n, n3), Math.max(n2, n4), this.g);
            canvas.drawLine(Math.min(n, n3), Math.min(n2, n4), Math.min(n, n3), Math.max(n2, n4), this.g);
        }
        
        private void f(final Canvas canvas, final float n, final float n2) {
            final float[] a = this.a;
            final float a2 = a[0];
            final float a3 = a[1];
            final float b = a[a.length - 2];
            final float b2 = a[a.length - 1];
            final float min = Math.min(a2, b);
            final float max = Math.max(a3, b2);
            final float n3 = n - Math.min(a2, b);
            final float n4 = Math.max(a3, b2) - n2;
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append((int)(n3 * 100.0f / Math.abs(b - a2) + 0.5) / 100.0f);
            final String string = sb.toString();
            this.m(string, this.h);
            canvas.drawText(string, n3 / 2.0f - this.r.width() / 2 + min, n2 - 20.0f, this.h);
            canvas.drawLine(n, n2, Math.min(a2, b), n2, this.g);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append((int)(n4 * 100.0f / Math.abs(b2 - a3) + 0.5) / 100.0f);
            final String string2 = sb2.toString();
            this.m(string2, this.h);
            canvas.drawText(string2, n + 5.0f, max - (n4 / 2.0f - this.r.height() / 2), this.h);
            canvas.drawLine(n, n2, n, Math.max(a3, b2), this.g);
        }
        
        private void g(final Canvas canvas) {
            final float[] a = this.a;
            canvas.drawLine(a[0], a[1], a[a.length - 2], a[a.length - 1], this.g);
        }
        
        private void h(final Canvas canvas, final float n, final float n2) {
            final float[] a = this.a;
            final float n3 = a[0];
            final float n4 = a[1];
            final float n5 = a[a.length - 2];
            final float n6 = a[a.length - 1];
            final float n7 = (float)Math.hypot(n3 - n5, n4 - n6);
            final float n8 = n5 - n3;
            final float n9 = n6 - n4;
            final float n10 = ((n - n3) * n8 + (n2 - n4) * n9) / (n7 * n7);
            final float n11 = n3 + n8 * n10;
            final float n12 = n4 + n10 * n9;
            final Path path = new Path();
            path.moveTo(n, n2);
            path.lineTo(n11, n12);
            final float n13 = (float)Math.hypot(n11 - n, n12 - n2);
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append((int)(n13 * 100.0f / n7) / 100.0f);
            final String string = sb.toString();
            this.m(string, this.h);
            canvas.drawTextOnPath(string, path, n13 / 2.0f - this.r.width() / 2, -20.0f, this.h);
            canvas.drawLine(n, n2, n11, n12, this.g);
        }
        
        private void i(final Canvas canvas, final float n, final float n2, final int n3, final int n4) {
            final StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append((int)((n - n3 / 2) * 100.0f / (androidx.constraintlayout.motion.widget.s.this.getWidth() - n3) + 0.5) / 100.0f);
            final String string = sb.toString();
            this.m(string, this.h);
            canvas.drawText(string, n / 2.0f - this.r.width() / 2 + 0.0f, n2 - 20.0f, this.h);
            canvas.drawLine(n, n2, Math.min(0.0f, 1.0f), n2, this.g);
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append((int)((n2 - n4 / 2) * 100.0f / (androidx.constraintlayout.motion.widget.s.this.getHeight() - n4) + 0.5) / 100.0f);
            final String string2 = sb2.toString();
            this.m(string2, this.h);
            canvas.drawText(string2, n + 5.0f, 0.0f - (n2 / 2.0f - this.r.height() / 2), this.h);
            canvas.drawLine(n, n2, n, Math.max(0.0f, 1.0f), this.g);
        }
        
        private void j(final Canvas canvas, final o o) {
            this.d.reset();
            for (int i = 0; i <= 50; ++i) {
                o.g(i / (float)50, this.j, 0);
                final Path d = this.d;
                final float[] j = this.j;
                d.moveTo(j[0], j[1]);
                final Path d2 = this.d;
                final float[] k = this.j;
                d2.lineTo(k[2], k[3]);
                final Path d3 = this.d;
                final float[] l = this.j;
                d3.lineTo(l[4], l[5]);
                final Path d4 = this.d;
                final float[] m = this.j;
                d4.lineTo(m[6], m[7]);
                this.d.close();
            }
            this.e.setColor(1140850688);
            canvas.translate(2.0f, 2.0f);
            canvas.drawPath(this.d, this.e);
            canvas.translate(-2.0f, -2.0f);
            this.e.setColor(-65536);
            canvas.drawPath(this.d, this.e);
        }
        
        private void k(final Canvas canvas, final int n, final int n2, final o o) {
            final View b = o.b;
            int width;
            int height;
            if (b != null) {
                width = b.getWidth();
                height = o.b.getHeight();
            }
            else {
                width = 0;
                height = 0;
            }
            for (int i = 1; i < n2 - 1; ++i) {
                if (n != 4 || this.b[i - 1] != 0) {
                    final float[] c = this.c;
                    final int n3 = i * 2;
                    final float n4 = c[n3];
                    final float n5 = c[n3 + 1];
                    this.d.reset();
                    this.d.moveTo(n4, n5 + 10.0f);
                    this.d.lineTo(n4 + 10.0f, n5);
                    this.d.lineTo(n4, n5 - 10.0f);
                    this.d.lineTo(n4 - 10.0f, n5);
                    this.d.close();
                    final int n6 = i - 1;
                    o.w(n6);
                    if (n == 4) {
                        final int[] b2 = this.b;
                        if (b2[n6] == 1) {
                            this.h(canvas, n4 - 0.0f, n5 - 0.0f);
                        }
                        else if (b2[n6] == 0) {
                            this.f(canvas, n4 - 0.0f, n5 - 0.0f);
                        }
                        else if (b2[n6] == 2) {
                            this.i(canvas, n4 - 0.0f, n5 - 0.0f, width, height);
                        }
                        canvas.drawPath(this.d, this.i);
                    }
                    if (n == 2) {
                        this.h(canvas, n4 - 0.0f, n5 - 0.0f);
                    }
                    if (n == 3) {
                        this.f(canvas, n4 - 0.0f, n5 - 0.0f);
                    }
                    if (n == 6) {
                        this.i(canvas, n4 - 0.0f, n5 - 0.0f, width, height);
                    }
                    canvas.drawPath(this.d, this.i);
                }
            }
            final float[] a = this.a;
            if (a.length > 1) {
                canvas.drawCircle(a[0], a[1], 8.0f, this.f);
                final float[] a2 = this.a;
                canvas.drawCircle(a2[a2.length - 2], a2[a2.length - 1], 8.0f, this.f);
            }
        }
        
        private void l(final Canvas canvas, final float n, final float n2, final float n3, final float n4) {
            canvas.drawRect(n, n2, n3, n4, this.g);
            canvas.drawLine(n, n2, n3, n4, this.g);
        }
        
        public void a(final Canvas canvas, final HashMap<View, o> hashMap, final int n, final int n2) {
            if (hashMap != null) {
                if (hashMap.size() != 0) {
                    canvas.save();
                    if (!androidx.constraintlayout.motion.widget.s.this.isInEditMode() && (n2 & 0x1) == 0x2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(androidx.constraintlayout.motion.widget.s.this.getContext().getResources().getResourceName(androidx.constraintlayout.motion.widget.s.this.x0));
                        sb.append(":");
                        sb.append(androidx.constraintlayout.motion.widget.s.this.getProgress());
                        final String string = sb.toString();
                        canvas.drawText(string, 10.0f, (float)(androidx.constraintlayout.motion.widget.s.this.getHeight() - 30), this.h);
                        canvas.drawText(string, 11.0f, (float)(androidx.constraintlayout.motion.widget.s.this.getHeight() - 29), this.e);
                    }
                    for (final o o : hashMap.values()) {
                        int q;
                        final int n3 = q = o.q();
                        if (n2 > 0 && (q = n3) == 0) {
                            q = 1;
                        }
                        if (q == 0) {
                            continue;
                        }
                        this.q = o.e(this.c, this.b);
                        if (q < 1) {
                            continue;
                        }
                        final int n4 = n / 16;
                        final float[] a = this.a;
                        if (a == null || a.length != n4 * 2) {
                            this.a = new float[n4 * 2];
                            this.d = new Path();
                        }
                        final int t = this.t;
                        canvas.translate((float)t, (float)t);
                        this.e.setColor(1996488704);
                        this.i.setColor(1996488704);
                        this.f.setColor(1996488704);
                        this.g.setColor(1996488704);
                        o.f(this.a, n4);
                        this.b(canvas, q, this.q, o);
                        this.e.setColor(-21965);
                        this.f.setColor(-2067046);
                        this.i.setColor(-2067046);
                        this.g.setColor(-13391360);
                        final int t2 = this.t;
                        canvas.translate((float)(-t2), (float)(-t2));
                        this.b(canvas, q, this.q, o);
                        if (q != 5) {
                            continue;
                        }
                        this.j(canvas, o);
                    }
                    canvas.restore();
                }
            }
        }
        
        public void b(final Canvas canvas, final int n, final int n2, final o o) {
            if (n == 4) {
                this.d(canvas);
            }
            if (n == 2) {
                this.g(canvas);
            }
            if (n == 3) {
                this.e(canvas);
            }
            this.c(canvas);
            this.k(canvas, n, n2, o);
        }
        
        void m(final String s, final Paint paint) {
            paint.getTextBounds(s, 0, s.length(), this.r);
        }
    }
    
    class h
    {
        androidx.constraintlayout.core.widgets.f a;
        androidx.constraintlayout.core.widgets.f b;
        androidx.constraintlayout.widget.e c;
        androidx.constraintlayout.widget.e d;
        int e;
        int f;
        
        h() {
            this.a = new androidx.constraintlayout.core.widgets.f();
            this.b = new androidx.constraintlayout.core.widgets.f();
            this.c = null;
            this.d = null;
        }
        
        @SuppressLint({ "LogConditional" })
        private void c(String str, final androidx.constraintlayout.core.widgets.f obj) {
            final View view = (View)obj.w();
            final StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(androidx.constraintlayout.motion.widget.c.k(view));
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append("  ========= ");
            sb2.append(obj);
            Log.v("MotionLayout", sb2.toString());
            for (int size = obj.f2().size(), i = 0; i < size; ++i) {
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(string);
                sb3.append("[");
                sb3.append(i);
                sb3.append("] ");
                final String string2 = sb3.toString();
                final e obj2 = obj.f2().get(i);
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("");
                final androidx.constraintlayout.core.widgets.d f = obj2.R.f;
                final String s = "_";
                if (f != null) {
                    str = "T";
                }
                else {
                    str = "_";
                }
                sb4.append(str);
                str = sb4.toString();
                final StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                if (obj2.T.f != null) {
                    str = "B";
                }
                else {
                    str = "_";
                }
                sb5.append(str);
                str = sb5.toString();
                final StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                if (obj2.Q.f != null) {
                    str = "L";
                }
                else {
                    str = "_";
                }
                sb6.append(str);
                str = sb6.toString();
                final StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                str = s;
                if (obj2.S.f != null) {
                    str = "R";
                }
                sb7.append(str);
                final String string3 = sb7.toString();
                final View view2 = (View)obj2.w();
                final String str2 = str = androidx.constraintlayout.motion.widget.c.k(view2);
                if (view2 instanceof TextView) {
                    final StringBuilder sb8 = new StringBuilder();
                    sb8.append(str2);
                    sb8.append("(");
                    sb8.append((Object)((TextView)view2).getText());
                    sb8.append(")");
                    str = sb8.toString();
                }
                final StringBuilder sb9 = new StringBuilder();
                sb9.append(string2);
                sb9.append("  ");
                sb9.append(str);
                sb9.append(" ");
                sb9.append(obj2);
                sb9.append(" ");
                sb9.append(string3);
                Log.v("MotionLayout", sb9.toString());
            }
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(string);
            sb10.append(" done. ");
            Log.v("MotionLayout", sb10.toString());
        }
        
        @SuppressLint({ "LogConditional" })
        private void d(final String str, final b b) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" ");
            String str2;
            if (b.s != -1) {
                str2 = "SS";
            }
            else {
                str2 = "__";
            }
            sb.append(str2);
            final String string = sb.toString();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            final int r = b.r;
            final String s = "|__";
            String str3;
            if (r != -1) {
                str3 = "|SE";
            }
            else {
                str3 = "|__";
            }
            sb2.append(str3);
            final String string2 = sb2.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            String str4;
            if (b.t != -1) {
                str4 = "|ES";
            }
            else {
                str4 = "|__";
            }
            sb3.append(str4);
            final String string3 = sb3.toString();
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(string3);
            String str5;
            if (b.u != -1) {
                str5 = "|EE";
            }
            else {
                str5 = "|__";
            }
            sb4.append(str5);
            final String string4 = sb4.toString();
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            String str6;
            if (b.d != -1) {
                str6 = "|LL";
            }
            else {
                str6 = "|__";
            }
            sb5.append(str6);
            final String string5 = sb5.toString();
            final StringBuilder sb6 = new StringBuilder();
            sb6.append(string5);
            String str7;
            if (b.e != -1) {
                str7 = "|LR";
            }
            else {
                str7 = "|__";
            }
            sb6.append(str7);
            final String string6 = sb6.toString();
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(string6);
            String str8;
            if (b.f != -1) {
                str8 = "|RL";
            }
            else {
                str8 = "|__";
            }
            sb7.append(str8);
            final String string7 = sb7.toString();
            final StringBuilder sb8 = new StringBuilder();
            sb8.append(string7);
            String str9;
            if (b.g != -1) {
                str9 = "|RR";
            }
            else {
                str9 = "|__";
            }
            sb8.append(str9);
            final String string8 = sb8.toString();
            final StringBuilder sb9 = new StringBuilder();
            sb9.append(string8);
            String str10;
            if (b.h != -1) {
                str10 = "|TT";
            }
            else {
                str10 = "|__";
            }
            sb9.append(str10);
            final String string9 = sb9.toString();
            final StringBuilder sb10 = new StringBuilder();
            sb10.append(string9);
            String str11;
            if (b.i != -1) {
                str11 = "|TB";
            }
            else {
                str11 = "|__";
            }
            sb10.append(str11);
            final String string10 = sb10.toString();
            final StringBuilder sb11 = new StringBuilder();
            sb11.append(string10);
            String str12;
            if (b.j != -1) {
                str12 = "|BT";
            }
            else {
                str12 = "|__";
            }
            sb11.append(str12);
            final String string11 = sb11.toString();
            final StringBuilder sb12 = new StringBuilder();
            sb12.append(string11);
            String str13 = s;
            if (b.k != -1) {
                str13 = "|BB";
            }
            sb12.append(str13);
            final String string12 = sb12.toString();
            final StringBuilder sb13 = new StringBuilder();
            sb13.append(str);
            sb13.append(string12);
            Log.v("MotionLayout", sb13.toString());
        }
        
        @SuppressLint({ "LogConditional" })
        private void e(final String str, final e obj) {
            final StringBuilder sb = new StringBuilder();
            sb.append(" ");
            final androidx.constraintlayout.core.widgets.d f = obj.R.f;
            final String s = "B";
            final String s2 = "__";
            String string;
            if (f != null) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("T");
                String str2;
                if (obj.R.f.e == androidx.constraintlayout.core.widgets.d.b.I) {
                    str2 = "T";
                }
                else {
                    str2 = "B";
                }
                sb2.append(str2);
                string = sb2.toString();
            }
            else {
                string = "__";
            }
            sb.append(string);
            final String string2 = sb.toString();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            String string3;
            if (obj.T.f != null) {
                final StringBuilder sb4 = new StringBuilder();
                sb4.append("B");
                String str3 = s;
                if (obj.T.f.e == androidx.constraintlayout.core.widgets.d.b.I) {
                    str3 = "T";
                }
                sb4.append(str3);
                string3 = sb4.toString();
            }
            else {
                string3 = "__";
            }
            sb3.append(string3);
            final String string4 = sb3.toString();
            final StringBuilder sb5 = new StringBuilder();
            sb5.append(string4);
            final androidx.constraintlayout.core.widgets.d f2 = obj.Q.f;
            final String s3 = "R";
            String string5;
            if (f2 != null) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("L");
                String str4;
                if (obj.Q.f.e == androidx.constraintlayout.core.widgets.d.b.H) {
                    str4 = "L";
                }
                else {
                    str4 = "R";
                }
                sb6.append(str4);
                string5 = sb6.toString();
            }
            else {
                string5 = "__";
            }
            sb5.append(string5);
            final String string6 = sb5.toString();
            final StringBuilder sb7 = new StringBuilder();
            sb7.append(string6);
            String string7 = s2;
            if (obj.S.f != null) {
                final StringBuilder sb8 = new StringBuilder();
                sb8.append("R");
                String str5 = s3;
                if (obj.S.f.e == androidx.constraintlayout.core.widgets.d.b.H) {
                    str5 = "L";
                }
                sb8.append(str5);
                string7 = sb8.toString();
            }
            sb7.append(string7);
            final String string8 = sb7.toString();
            final StringBuilder sb9 = new StringBuilder();
            sb9.append(str);
            sb9.append(string8);
            sb9.append(" ---  ");
            sb9.append(obj);
            Log.v("MotionLayout", sb9.toString());
        }
        
        private void l(final androidx.constraintlayout.core.widgets.f f, final androidx.constraintlayout.widget.e e) {
            final SparseArray sparseArray = new SparseArray();
            final androidx.constraintlayout.widget.f.a a = new androidx.constraintlayout.widget.f.a(-2, -2);
            sparseArray.clear();
            sparseArray.put(0, (Object)f);
            sparseArray.put(s.this.getId(), (Object)f);
            if (e != null && e.d != 0) {
                final s g = s.this;
                g.B(this.b, g.getOptimizationLevel(), View$MeasureSpec.makeMeasureSpec(s.this.getHeight(), 1073741824), View$MeasureSpec.makeMeasureSpec(s.this.getWidth(), 1073741824));
            }
            for (final e e2 : f.f2()) {
                sparseArray.put(((View)e2.w()).getId(), (Object)e2);
            }
            for (final e e3 : f.f2()) {
                final View view = (View)e3.w();
                e.u(view.getId(), a);
                e3.W1(e.u0(view.getId()));
                e3.s1(e.n0(view.getId()));
                if (view instanceof androidx.constraintlayout.widget.b) {
                    e.s((androidx.constraintlayout.widget.b)view, e3, a, (SparseArray<e>)sparseArray);
                    if (view instanceof Barrier) {
                        ((Barrier)view).I();
                    }
                }
                if (Build$VERSION.SDK_INT >= 17) {
                    ((b)a).resolveLayoutDirection(s.this.getLayoutDirection());
                }
                else {
                    ((b)a).resolveLayoutDirection(0);
                }
                ConstraintLayout.this.h(false, view, e3, a, (SparseArray<e>)sparseArray);
                int n;
                if (e.t0(view.getId()) == 1) {
                    n = view.getVisibility();
                }
                else {
                    n = e.s0(view.getId());
                }
                e3.V1(n);
            }
            for (final e e4 : f.f2()) {
                if (e4 instanceof androidx.constraintlayout.core.widgets.m) {
                    final androidx.constraintlayout.widget.b b = (androidx.constraintlayout.widget.b)e4.w();
                    final androidx.constraintlayout.core.widgets.i i = (androidx.constraintlayout.core.widgets.i)e4;
                    b.G(f, i, (SparseArray<e>)sparseArray);
                    ((androidx.constraintlayout.core.widgets.m)i).h2();
                }
            }
        }
        
        public void a() {
            final int childCount = s.this.getChildCount();
            s.this.B0.clear();
            final SparseArray sparseArray = new SparseArray();
            final int[] array = new int[childCount];
            for (int i = 0; i < childCount; ++i) {
                final View child = s.this.getChildAt(i);
                final o value = new o(child);
                sparseArray.put(array[i] = child.getId(), (Object)value);
                s.this.B0.put(child, value);
            }
            for (int j = 0; j < childCount; ++j) {
                final View child2 = s.this.getChildAt(j);
                final o o = s.this.B0.get(child2);
                if (o != null) {
                    if (this.c != null) {
                        final e f = this.f(this.a, child2);
                        if (f != null) {
                            o.V(s.this.e1(f), this.c, s.this.getWidth(), s.this.getHeight());
                        }
                        else if (s.this.O0 != 0) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append(androidx.constraintlayout.motion.widget.c.g());
                            sb.append("no widget for  ");
                            sb.append(androidx.constraintlayout.motion.widget.c.k(child2));
                            sb.append(" (");
                            sb.append(child2.getClass().getName());
                            sb.append(")");
                            Log.e("MotionLayout", sb.toString());
                        }
                    }
                    else if (s.this.D1) {
                        final d d = s.this.F1.get(child2);
                        final s g = s.this;
                        o.W(d, child2, g.E1, g.G1, s.this.H1);
                    }
                    if (this.d != null) {
                        final e f2 = this.f(this.b, child2);
                        if (f2 != null) {
                            o.S(s.this.e1(f2), this.d, s.this.getWidth(), s.this.getHeight());
                        }
                        else if (s.this.O0 != 0) {
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append(androidx.constraintlayout.motion.widget.c.g());
                            sb2.append("no widget for  ");
                            sb2.append(androidx.constraintlayout.motion.widget.c.k(child2));
                            sb2.append(" (");
                            sb2.append(child2.getClass().getName());
                            sb2.append(")");
                            Log.e("MotionLayout", sb2.toString());
                        }
                    }
                }
            }
            for (int k = 0; k < childCount; ++k) {
                final o o2 = (o)sparseArray.get(array[k]);
                final int l = o2.k();
                if (l != -1) {
                    o2.a0((o)sparseArray.get(l));
                }
            }
        }
        
        void b(final androidx.constraintlayout.core.widgets.f key, final androidx.constraintlayout.core.widgets.f value) {
            final ArrayList<e> f2 = key.f2();
            final HashMap<e, androidx.constraintlayout.core.widgets.f> hashMap = new HashMap<e, androidx.constraintlayout.core.widgets.f>();
            hashMap.put(key, value);
            value.f2().clear();
            value.n(key, (HashMap<e, e>)hashMap);
            for (final e key2 : f2) {
                e value2;
                if (key2 instanceof androidx.constraintlayout.core.widgets.a) {
                    value2 = new androidx.constraintlayout.core.widgets.a();
                }
                else if (key2 instanceof androidx.constraintlayout.core.widgets.h) {
                    value2 = new androidx.constraintlayout.core.widgets.h();
                }
                else if (key2 instanceof androidx.constraintlayout.core.widgets.g) {
                    value2 = new androidx.constraintlayout.core.widgets.g();
                }
                else if (key2 instanceof androidx.constraintlayout.core.widgets.i) {
                    value2 = new androidx.constraintlayout.core.widgets.j();
                }
                else {
                    value2 = new e();
                }
                value.b(value2);
                hashMap.put(key2, (androidx.constraintlayout.core.widgets.f)value2);
            }
            for (final e key3 : f2) {
                hashMap.get(key3).n(key3, (HashMap<e, e>)hashMap);
            }
        }
        
        e f(final androidx.constraintlayout.core.widgets.f f, final View view) {
            if (f.w() == view) {
                return f;
            }
            final ArrayList<e> f2 = f.f2();
            for (int size = f2.size(), i = 0; i < size; ++i) {
                final e e = f2.get(i);
                if (e.w() == view) {
                    return e;
                }
            }
            return null;
        }
        
        void g(androidx.constraintlayout.core.widgets.f f, final androidx.constraintlayout.widget.e c, final androidx.constraintlayout.widget.e d) {
            this.c = c;
            this.d = d;
            this.a = new androidx.constraintlayout.core.widgets.f();
            this.b = new androidx.constraintlayout.core.widgets.f();
            this.a.O2(s.this.I.A2());
            this.b.O2(s.this.I.A2());
            this.a.j2();
            this.b.j2();
            this.b(s.this.I, this.a);
            this.b(s.this.I, this.b);
            if (s.this.F0 > 0.5) {
                if (c != null) {
                    this.l(this.a, c);
                }
                this.l(this.b, d);
            }
            else {
                this.l(this.b, d);
                if (c != null) {
                    this.l(this.a, c);
                }
            }
            this.a.S2(ConstraintLayout.this.w());
            this.a.U2();
            this.b.S2(ConstraintLayout.this.w());
            this.b.U2();
            final ViewGroup$LayoutParams layoutParams = s.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    f = this.a;
                    final e.b h = androidx.constraintlayout.core.widgets.e.b.H;
                    f.x1(h);
                    this.b.x1(h);
                }
                if (layoutParams.height == -2) {
                    f = this.a;
                    final e.b h2 = androidx.constraintlayout.core.widgets.e.b.H;
                    f.S1(h2);
                    this.b.S1(h2);
                }
            }
        }
        
        public boolean h(final int n, final int n2) {
            return n != this.e || n2 != this.f;
        }
        
        public void i(final int n, final int n2) {
            final int mode = View$MeasureSpec.getMode(n);
            final int mode2 = View$MeasureSpec.getMode(n2);
            final s g = s.this;
            g.u1 = mode;
            g.v1 = mode2;
            final int optimizationLevel = g.getOptimizationLevel();
            final s g2 = s.this;
            if (g2.w0 == g2.getStartState()) {
                final s g3 = s.this;
                final androidx.constraintlayout.core.widgets.f b = this.b;
                final androidx.constraintlayout.widget.e d = this.d;
                int n3;
                if (d != null && d.d != 0) {
                    n3 = n2;
                }
                else {
                    n3 = n;
                }
                int n4;
                if (d != null && d.d != 0) {
                    n4 = n;
                }
                else {
                    n4 = n2;
                }
                g3.B(b, optimizationLevel, n3, n4);
                final androidx.constraintlayout.widget.e c = this.c;
                if (c != null) {
                    final s g4 = s.this;
                    final androidx.constraintlayout.core.widgets.f a = this.a;
                    final int d2 = c.d;
                    int n5;
                    if (d2 == 0) {
                        n5 = n;
                    }
                    else {
                        n5 = n2;
                    }
                    int n6;
                    if (d2 == 0) {
                        n6 = n2;
                    }
                    else {
                        n6 = n;
                    }
                    g4.B(a, optimizationLevel, n5, n6);
                }
            }
            else {
                final androidx.constraintlayout.widget.e c2 = this.c;
                if (c2 != null) {
                    final s g5 = s.this;
                    final androidx.constraintlayout.core.widgets.f a2 = this.a;
                    final int d3 = c2.d;
                    int n7;
                    if (d3 == 0) {
                        n7 = n;
                    }
                    else {
                        n7 = n2;
                    }
                    int n8;
                    if (d3 == 0) {
                        n8 = n2;
                    }
                    else {
                        n8 = n;
                    }
                    g5.B(a2, optimizationLevel, n7, n8);
                }
                final s g6 = s.this;
                final androidx.constraintlayout.core.widgets.f b2 = this.b;
                final androidx.constraintlayout.widget.e d4 = this.d;
                int n9;
                if (d4 != null && d4.d != 0) {
                    n9 = n2;
                }
                else {
                    n9 = n;
                }
                int n10;
                if (d4 != null && d4.d != 0) {
                    n10 = n;
                }
                else {
                    n10 = n2;
                }
                g6.B(b2, optimizationLevel, n9, n10);
            }
            if (!(s.this.getParent() instanceof s) || mode != 1073741824 || mode2 != 1073741824) {
                final s g7 = s.this;
                g7.u1 = mode;
                g7.v1 = mode2;
                if (g7.w0 == g7.getStartState()) {
                    final s g8 = s.this;
                    final androidx.constraintlayout.core.widgets.f b3 = this.b;
                    final int d5 = this.d.d;
                    int n11;
                    if (d5 == 0) {
                        n11 = n;
                    }
                    else {
                        n11 = n2;
                    }
                    int n12;
                    if (d5 == 0) {
                        n12 = n2;
                    }
                    else {
                        n12 = n;
                    }
                    g8.B(b3, optimizationLevel, n11, n12);
                    final androidx.constraintlayout.widget.e c3 = this.c;
                    if (c3 != null) {
                        final s g9 = s.this;
                        final androidx.constraintlayout.core.widgets.f a3 = this.a;
                        final int d6 = c3.d;
                        int n13;
                        if (d6 == 0) {
                            n13 = n;
                        }
                        else {
                            n13 = n2;
                        }
                        int n14;
                        if (d6 == 0) {
                            n14 = n2;
                        }
                        else {
                            n14 = n;
                        }
                        g9.B(a3, optimizationLevel, n13, n14);
                    }
                }
                else {
                    final androidx.constraintlayout.widget.e c4 = this.c;
                    if (c4 != null) {
                        final s g10 = s.this;
                        final androidx.constraintlayout.core.widgets.f a4 = this.a;
                        final int d7 = c4.d;
                        int n15;
                        if (d7 == 0) {
                            n15 = n;
                        }
                        else {
                            n15 = n2;
                        }
                        int n16;
                        if (d7 == 0) {
                            n16 = n2;
                        }
                        else {
                            n16 = n;
                        }
                        g10.B(a4, optimizationLevel, n15, n16);
                    }
                    final s g11 = s.this;
                    final androidx.constraintlayout.core.widgets.f b4 = this.b;
                    final int d8 = this.d.d;
                    int n17;
                    if (d8 == 0) {
                        n17 = n;
                    }
                    else {
                        n17 = n2;
                    }
                    int n18;
                    if (d8 == 0) {
                        n18 = n2;
                    }
                    else {
                        n18 = n;
                    }
                    g11.B(b4, optimizationLevel, n17, n18);
                }
                s.this.q1 = this.a.j0();
                s.this.r1 = this.a.D();
                s.this.s1 = this.b.j0();
                s.this.t1 = this.b.D();
                final s g12 = s.this;
                g12.p1 = (g12.q1 != g12.s1 || g12.r1 != g12.t1);
            }
            final s g13 = s.this;
            final int q1 = g13.q1;
            final int r1 = g13.r1;
            final int u1 = g13.u1;
            int n19 = 0;
            Label_0877: {
                if (u1 != Integer.MIN_VALUE) {
                    n19 = q1;
                    if (u1 != 0) {
                        break Label_0877;
                    }
                }
                n19 = (int)(q1 + g13.w1 * (g13.s1 - q1));
            }
            final int v1 = g13.v1;
            int n20 = 0;
            Label_0923: {
                if (v1 != Integer.MIN_VALUE) {
                    n20 = r1;
                    if (v1 != 0) {
                        break Label_0923;
                    }
                }
                n20 = (int)(r1 + g13.w1 * (g13.t1 - r1));
            }
            ConstraintLayout.this.A(n, n2, n19, n20, this.a.J2() || this.b.J2(), this.a.H2() || this.b.H2());
        }
        
        public void j() {
            this.i(s.this.y0, s.this.z0);
            s.this.d1();
        }
        
        public void k(final int e, final int f) {
            this.e = e;
            this.f = f;
        }
    }
    
    protected interface i
    {
        void a();
        
        void b(final int p0, final float p1);
        
        float c(final int p0);
        
        void clear();
        
        float d(final int p0);
        
        void e(final MotionEvent p0);
        
        float f();
        
        float g();
        
        void h(final int p0);
    }
    
    private static class j implements i
    {
        private static j b;
        VelocityTracker a;
        
        static {
            j.b = new j();
        }
        
        public static j i() {
            j.b.a = VelocityTracker.obtain();
            return j.b;
        }
        
        @Override
        public void a() {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.recycle();
                this.a = null;
            }
        }
        
        @Override
        public void b(final int n, final float n2) {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.computeCurrentVelocity(n, n2);
            }
        }
        
        @Override
        public float c(final int n) {
            final VelocityTracker a = this.a;
            if (a != null) {
                return a.getXVelocity(n);
            }
            return 0.0f;
        }
        
        @Override
        public void clear() {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.clear();
            }
        }
        
        @Override
        public float d(final int n) {
            if (this.a != null) {
                return this.d(n);
            }
            return 0.0f;
        }
        
        @Override
        public void e(final MotionEvent motionEvent) {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.addMovement(motionEvent);
            }
        }
        
        @Override
        public float f() {
            final VelocityTracker a = this.a;
            if (a != null) {
                return a.getYVelocity();
            }
            return 0.0f;
        }
        
        @Override
        public float g() {
            final VelocityTracker a = this.a;
            if (a != null) {
                return a.getXVelocity();
            }
            return 0.0f;
        }
        
        @Override
        public void h(final int n) {
            final VelocityTracker a = this.a;
            if (a != null) {
                a.computeCurrentVelocity(n);
            }
        }
    }
    
    class k
    {
        float a;
        float b;
        int c;
        int d;
        final String e;
        final String f;
        final String g;
        final String h;
        
        k() {
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
            this.e = "motion.progress";
            this.f = "motion.velocity";
            this.g = "motion.StartState";
            this.h = "motion.EndState";
        }
        
        void a() {
            final int c = this.c;
            if (c != -1 || this.d != -1) {
                if (c == -1) {
                    s.this.k1(this.d);
                }
                else {
                    final int d = this.d;
                    if (d == -1) {
                        s.this.F(c, -1, -1);
                    }
                    else {
                        s.this.c1(c, d);
                    }
                }
                s.this.setState(m.H);
            }
            if (!Float.isNaN(this.b)) {
                s.this.b1(this.a, this.b);
                this.a = Float.NaN;
                this.b = Float.NaN;
                this.c = -1;
                this.d = -1;
                return;
            }
            if (Float.isNaN(this.a)) {
                return;
            }
            s.this.setProgress(this.a);
        }
        
        public Bundle b() {
            final Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.a);
            bundle.putFloat("motion.velocity", this.b);
            bundle.putInt("motion.StartState", this.c);
            bundle.putInt("motion.EndState", this.d);
            return bundle;
        }
        
        public void c() {
            this.d = s.this.x0;
            this.c = s.this.v0;
            this.b = s.this.getVelocity();
            this.a = s.this.getProgress();
        }
        
        public void d(final int d) {
            this.d = d;
        }
        
        public void e(final float a) {
            this.a = a;
        }
        
        public void f(final int c) {
            this.c = c;
        }
        
        public void g(final Bundle bundle) {
            this.a = bundle.getFloat("motion.progress");
            this.b = bundle.getFloat("motion.velocity");
            this.c = bundle.getInt("motion.StartState");
            this.d = bundle.getInt("motion.EndState");
        }
        
        public void h(final float b) {
            this.b = b;
        }
    }
    
    public interface l
    {
        void a(final s p0, final int p1, final int p2, final float p3);
        
        void c(final s p0, final int p1, final int p2);
        
        void d(final s p0, final int p1, final boolean p2, final float p3);
        
        void k(final s p0, final int p1);
    }
    
    enum m
    {
        G, 
        H, 
        I, 
        J;
    }
}
