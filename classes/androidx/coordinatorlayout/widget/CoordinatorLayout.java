// 
// Decompiled by Procyon v0.5.36
// 

package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable$ClassLoaderCreator;
import android.os.Parcelable$Creator;
import androidx.annotation.y;
import android.view.ViewParent;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.view.View$BaseSavedState;
import androidx.annotation.t;
import androidx.core.content.d;
import androidx.annotation.s;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.l;
import androidx.core.graphics.drawable.c;
import android.graphics.drawable.Drawable$Callback;
import android.util.SparseArray;
import android.os.Parcelable;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.annotation.t0;
import androidx.annotation.b1;
import android.graphics.Region$Op;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewTreeObserver$OnPreDrawListener;
import java.util.Collection;
import android.os.SystemClock;
import android.view.MotionEvent;
import java.util.HashMap;
import android.text.TextUtils;
import java.util.Collections;
import android.util.Log;
import androidx.core.view.i;
import android.content.res.Resources;
import android.content.res.TypedArray;
import java.util.ArrayList;
import androidx.annotation.f;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import androidx.core.view.z;
import androidx.core.view.a0;
import android.view.ViewGroup$OnHierarchyChangeListener;
import android.graphics.drawable.Drawable;
import androidx.core.view.x0;
import android.graphics.Paint;
import java.util.List;
import android.graphics.Rect;
import androidx.core.util.m;
import android.view.View;
import java.util.Comparator;
import java.lang.reflect.Constructor;
import java.util.Map;
import androidx.core.view.x;
import androidx.core.view.w;
import android.view.ViewGroup;

public class CoordinatorLayout extends ViewGroup implements w, x
{
    static final String d0 = "CoordinatorLayout";
    static final String e0;
    private static final int f0 = 0;
    private static final int g0 = 1;
    static final Class<?>[] h0;
    static final ThreadLocal<Map<String, Constructor<c>>> i0;
    static final int j0 = 0;
    static final int k0 = 1;
    static final int l0 = 2;
    static final Comparator<View> m0;
    private static final m.a<Rect> n0;
    private final List<View> G;
    private final a<View> H;
    private final List<View> I;
    private final List<View> J;
    private Paint K;
    private final int[] L;
    private final int[] M;
    private boolean N;
    private boolean O;
    private int[] P;
    private View Q;
    private View R;
    private h S;
    private boolean T;
    private x0 U;
    private boolean V;
    private Drawable W;
    ViewGroup$OnHierarchyChangeListener a0;
    private a0 b0;
    private final z c0;
    
    static {
        final Package package1 = CoordinatorLayout.class.getPackage();
        String name;
        if (package1 != null) {
            name = package1.getName();
        }
        else {
            name = null;
        }
        e0 = name;
        if (Build$VERSION.SDK_INT >= 21) {
            m0 = new j();
        }
        else {
            m0 = null;
        }
        h0 = new Class[] { Context.class, AttributeSet.class };
        i0 = new ThreadLocal<Map<String, Constructor<c>>>();
        n0 = new m.c<Rect>(12);
    }
    
    public CoordinatorLayout(@j0 final Context context) {
        this(context, null);
    }
    
    public CoordinatorLayout(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, j.a.a.b);
    }
    
    public CoordinatorLayout(@j0 final Context context, @k0 final AttributeSet set, @androidx.annotation.f int i) {
        super(context, set, i);
        this.G = new ArrayList<View>();
        this.H = new a<View>();
        this.I = new ArrayList<View>();
        this.J = new ArrayList<View>();
        this.L = new int[2];
        this.M = new int[2];
        this.c0 = new z(this);
        final int n = 0;
        final int[] e = j.a.j.e;
        TypedArray typedArray;
        if (i == 0) {
            typedArray = context.obtainStyledAttributes(set, e, 0, j.a.i.h);
        }
        else {
            typedArray = context.obtainStyledAttributes(set, e, i, 0);
        }
        if (Build$VERSION.SDK_INT >= 29) {
            final int[] e2 = j.a.j.e;
            if (i == 0) {
                this.saveAttributeDataForStyleable(context, e2, set, typedArray, 0, j.a.i.h);
            }
            else {
                this.saveAttributeDataForStyleable(context, e2, set, typedArray, i, 0);
            }
        }
        i = typedArray.getResourceId(j.a.j.f, 0);
        if (i != 0) {
            final Resources resources = context.getResources();
            this.P = resources.getIntArray(i);
            final float density = resources.getDisplayMetrics().density;
            int length;
            int[] p3;
            for (length = this.P.length, i = n; i < length; ++i) {
                p3 = this.P;
                p3[i] *= (int)density;
            }
        }
        this.W = typedArray.getDrawable(j.a.j.g);
        typedArray.recycle();
        this.c0();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)new f());
        if (androidx.core.view.j0.T((View)this) == 0) {
            androidx.core.view.j0.P1((View)this, 1);
        }
    }
    
    private void A(final View view, int n, final Rect rect, final Rect rect2, final g g, final int n2, final int n3) {
        final int d = androidx.core.view.i.d(W(g.c), n);
        final int d2 = androidx.core.view.i.d(X(g.d), n);
        final int n4 = d & 0x7;
        final int n5 = d & 0x70;
        n = (d2 & 0x7);
        final int n6 = d2 & 0x70;
        if (n != 1) {
            if (n != 5) {
                n = rect.left;
            }
            else {
                n = rect.right;
            }
        }
        else {
            n = rect.left + rect.width() / 2;
        }
        int n7;
        if (n6 != 16) {
            if (n6 != 80) {
                n7 = rect.top;
            }
            else {
                n7 = rect.bottom;
            }
        }
        else {
            n7 = rect.top + rect.height() / 2;
        }
        int n8;
        if (n4 != 1) {
            n8 = n;
            if (n4 != 5) {
                n8 = n - n2;
            }
        }
        else {
            n8 = n - n2 / 2;
        }
        if (n5 != 16) {
            n = n7;
            if (n5 != 80) {
                n = n7 - n3;
            }
        }
        else {
            n = n7 - n3 / 2;
        }
        rect2.set(n8, n, n2 + n8, n3 + n);
    }
    
    private int B(final int n) {
        final int[] p = this.P;
        StringBuilder sb;
        if (p == null) {
            sb = new StringBuilder();
            sb.append("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(n);
        }
        else {
            if (n >= 0 && n < p.length) {
                return p[n];
            }
            sb = new StringBuilder();
            sb.append("Keyline index ");
            sb.append(n);
            sb.append(" out of range for ");
            sb.append(this);
        }
        Log.e("CoordinatorLayout", sb.toString());
        return 0;
    }
    
    private void E(final List<View> list) {
        list.clear();
        final boolean childrenDrawingOrderEnabled = this.isChildrenDrawingOrderEnabled();
        final int childCount = this.getChildCount();
        for (int i = childCount - 1; i >= 0; --i) {
            int childDrawingOrder;
            if (childrenDrawingOrderEnabled) {
                childDrawingOrder = this.getChildDrawingOrder(childCount, i);
            }
            else {
                childDrawingOrder = i;
            }
            list.add(this.getChildAt(childDrawingOrder));
        }
        final Comparator<View> m0 = CoordinatorLayout.m0;
        if (m0 != null) {
            Collections.sort((List<Object>)list, (Comparator<? super Object>)m0);
        }
    }
    
    private boolean F(final View view) {
        return this.H.j(view);
    }
    
    private void H(final View view, final int n) {
        final g g = (g)view.getLayoutParams();
        final Rect e = e();
        e.set(this.getPaddingLeft() + g.leftMargin, this.getPaddingTop() + g.topMargin, this.getWidth() - this.getPaddingRight() - g.rightMargin, this.getHeight() - this.getPaddingBottom() - g.bottomMargin);
        if (this.U != null && androidx.core.view.j0.S((View)this) && !androidx.core.view.j0.S(view)) {
            e.left += this.U.p();
            e.top += this.U.r();
            e.right -= this.U.q();
            e.bottom -= this.U.o();
        }
        final Rect e2 = e();
        androidx.core.view.i.b(X(g.c), view.getMeasuredWidth(), view.getMeasuredHeight(), e, e2, n);
        view.layout(e2.left, e2.top, e2.right, e2.bottom);
        T(e);
        T(e2);
    }
    
    private void I(final View view, final View view2, final int n) {
        final Rect e = e();
        final Rect e2 = e();
        try {
            this.y(view2, e);
            this.z(view, n, e, e2);
            view.layout(e2.left, e2.top, e2.right, e2.bottom);
        }
        finally {
            T(e);
            T(e2);
        }
    }
    
    private void J(final View view, int max, int max2) {
        final g g = (g)view.getLayoutParams();
        final int d = androidx.core.view.i.d(Y(g.c), max2);
        final int n = d & 0x7;
        final int n2 = d & 0x70;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        int n3 = max;
        if (max2 == 1) {
            n3 = width - max;
        }
        max = this.B(n3) - measuredWidth;
        max2 = 0;
        if (n != 1) {
            if (n == 5) {
                max += measuredWidth;
            }
        }
        else {
            max += measuredWidth / 2;
        }
        if (n2 != 16) {
            if (n2 == 80) {
                max2 = measuredHeight + 0;
            }
        }
        else {
            max2 = 0 + measuredHeight / 2;
        }
        max = Math.max(this.getPaddingLeft() + g.leftMargin, Math.min(max, width - this.getPaddingRight() - measuredWidth - g.rightMargin));
        max2 = Math.max(this.getPaddingTop() + g.topMargin, Math.min(max2, height - this.getPaddingBottom() - measuredHeight - g.bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }
    
    private void K(final View view, final Rect rect, int top) {
        if (!androidx.core.view.j0.T0(view)) {
            return;
        }
        if (view.getWidth() > 0) {
            if (view.getHeight() > 0) {
                final g g = (g)view.getLayoutParams();
                final c f = g.f();
                final Rect e = e();
                final Rect e2 = e();
                e2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                if (f != null && f.b(this, view, e)) {
                    if (!e2.contains(e)) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Rect should be within the child's bounds. Rect:");
                        sb.append(e.toShortString());
                        sb.append(" | Bounds:");
                        sb.append(e2.toShortString());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                else {
                    e.set(e2);
                }
                T(e2);
                if (e.isEmpty()) {
                    T(e);
                    return;
                }
                final int d = androidx.core.view.i.d(g.h, top);
                final int n = 1;
                Label_0254: {
                    if ((d & 0x30) == 0x30) {
                        final int n2 = e.top - g.topMargin - g.j;
                        top = rect.top;
                        if (n2 < top) {
                            this.a0(view, top - n2);
                            top = 1;
                            break Label_0254;
                        }
                    }
                    top = 0;
                }
                int n3 = top;
                if ((d & 0x50) == 0x50) {
                    final int n4 = this.getHeight() - e.bottom - g.bottomMargin + g.j;
                    final int bottom = rect.bottom;
                    n3 = top;
                    if (n4 < bottom) {
                        this.a0(view, n4 - bottom);
                        n3 = 1;
                    }
                }
                if (n3 == 0) {
                    this.a0(view, 0);
                }
                Label_0385: {
                    if ((d & 0x3) == 0x3) {
                        top = e.left - g.leftMargin - g.i;
                        final int left = rect.left;
                        if (top < left) {
                            this.Z(view, left - top);
                            top = 1;
                            break Label_0385;
                        }
                    }
                    top = 0;
                }
                if ((d & 0x5) == 0x5) {
                    final int n5 = this.getWidth() - e.right - g.rightMargin + g.i;
                    final int right = rect.right;
                    if (n5 < right) {
                        this.Z(view, n5 - right);
                        top = n;
                    }
                }
                if (top == 0) {
                    this.Z(view, 0);
                }
                T(e);
            }
        }
    }
    
    static c P(final Context context, final AttributeSet set, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return null;
        }
        String s2;
        if (s.startsWith(".")) {
            final StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(s);
            s2 = sb.toString();
        }
        else if (s.indexOf(46) >= 0) {
            s2 = s;
        }
        else {
            final String e0 = CoordinatorLayout.e0;
            s2 = s;
            if (!TextUtils.isEmpty((CharSequence)e0)) {
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(e0);
                sb2.append('.');
                sb2.append(s);
                s2 = sb2.toString();
            }
        }
        try {
            final ThreadLocal<Map<String, Constructor<c>>> i0 = CoordinatorLayout.i0;
            Map<String, Constructor<c>> value;
            if ((value = i0.get()) == null) {
                value = new HashMap<String, Constructor<c>>();
                i0.set(value);
            }
            Constructor<?> constructor;
            if ((constructor = value.get(s2)) == null) {
                constructor = Class.forName(s2, false, context.getClassLoader()).getConstructor(CoordinatorLayout.h0);
                constructor.setAccessible(true);
                value.put(s2, (Constructor<c>)constructor);
            }
            return constructor.newInstance(context, set);
        }
        catch (Exception cause) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Could not inflate Behavior subclass ");
            sb3.append(s2);
            throw new RuntimeException(sb3.toString(), cause);
        }
    }
    
    private boolean Q(final MotionEvent motionEvent, final int n) {
        final int actionMasked = motionEvent.getActionMasked();
        final List<View> i = this.I;
        this.E(i);
        final int size = i.size();
        MotionEvent motionEvent2 = null;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5;
        while (true) {
            n5 = n3;
            if (n2 >= size) {
                break;
            }
            final View q = i.get(n2);
            final g g = (g)q.getLayoutParams();
            final c f = g.f();
            MotionEvent obtain;
            int n6;
            int n7;
            if ((n3 || n4 != 0) && actionMasked != 0) {
                obtain = motionEvent2;
                n6 = n3;
                n7 = n4;
                if (f != null) {
                    if ((obtain = motionEvent2) == null) {
                        final long uptimeMillis = SystemClock.uptimeMillis();
                        obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (n != 0) {
                        if (n != 1) {
                            n6 = n3;
                            n7 = n4;
                        }
                        else {
                            f.E(this, q, obtain);
                            n6 = n3;
                            n7 = n4;
                        }
                    }
                    else {
                        f.l(this, q, obtain);
                        n6 = n3;
                        n7 = n4;
                    }
                }
            }
            else {
                n5 = n3;
                if (n3 == 0) {
                    n5 = n3;
                    if (f != null) {
                        if (n != 0) {
                            if (n == 1) {
                                n3 = (f.E(this, q, motionEvent) ? 1 : 0);
                            }
                        }
                        else {
                            n3 = (f.l(this, q, motionEvent) ? 1 : 0);
                        }
                        n5 = n3;
                        if (n3 != 0) {
                            this.Q = q;
                            n5 = n3;
                        }
                    }
                }
                final boolean c = g.c();
                final boolean j = g.j(this, q);
                final boolean b = j && !c;
                obtain = motionEvent2;
                n6 = n5;
                n7 = (b ? 1 : 0);
                if (j) {
                    obtain = motionEvent2;
                    n6 = n5;
                    if ((n7 = (b ? 1 : 0)) == 0) {
                        break;
                    }
                }
            }
            ++n2;
            motionEvent2 = obtain;
            n3 = n6;
            n4 = n7;
        }
        i.clear();
        return n5 != 0;
    }
    
    private void R() {
        this.G.clear();
        this.H.c();
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final g d = this.D(child);
            d.d(this, child);
            this.H.b(child);
            for (int j = 0; j < childCount; ++j) {
                if (j != i) {
                    final View child2 = this.getChildAt(j);
                    if (d.b(this, child, child2)) {
                        if (!this.H.d(child2)) {
                            this.H.b(child2);
                        }
                        this.H.a(child2, child);
                    }
                }
            }
        }
        this.G.addAll(this.H.i());
        Collections.reverse(this.G);
    }
    
    private static void T(@j0 final Rect rect) {
        rect.setEmpty();
        CoordinatorLayout.n0.a(rect);
    }
    
    private void V(final boolean b) {
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final c f = ((g)child.getLayoutParams()).f();
            if (f != null) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (b) {
                    f.l(this, child, obtain);
                }
                else {
                    f.E(this, child, obtain);
                }
                obtain.recycle();
            }
        }
        for (int j = 0; j < childCount; ++j) {
            ((g)this.getChildAt(j).getLayoutParams()).n();
        }
        this.Q = null;
        this.N = false;
    }
    
    private static int W(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 17;
        }
        return n2;
    }
    
    private static int X(int n) {
        int n2 = n;
        if ((n & 0x7) == 0x0) {
            n2 = (n | 0x800003);
        }
        n = n2;
        if ((n2 & 0x70) == 0x0) {
            n = (n2 | 0x30);
        }
        return n;
    }
    
    private static int Y(final int n) {
        int n2 = n;
        if (n == 0) {
            n2 = 8388661;
        }
        return n2;
    }
    
    private void Z(final View view, final int i) {
        final g g = (g)view.getLayoutParams();
        final int j = g.i;
        if (j != i) {
            androidx.core.view.j0.c1(view, i - j);
            g.i = i;
        }
    }
    
    private void a0(final View view, final int j) {
        final g g = (g)view.getLayoutParams();
        final int i = g.j;
        if (i != j) {
            androidx.core.view.j0.d1(view, j - i);
            g.j = j;
        }
    }
    
    private void c0() {
        if (Build$VERSION.SDK_INT < 21) {
            return;
        }
        if (androidx.core.view.j0.S((View)this)) {
            if (this.b0 == null) {
                this.b0 = new a0() {
                    @Override
                    public x0 a(final View view, final x0 x0) {
                        return CoordinatorLayout.this.b0(x0);
                    }
                };
            }
            androidx.core.view.j0.Y1((View)this, this.b0);
            this.setSystemUiVisibility(1280);
        }
        else {
            androidx.core.view.j0.Y1((View)this, null);
        }
    }
    
    @j0
    private static Rect e() {
        Rect rect;
        if ((rect = CoordinatorLayout.n0.b()) == null) {
            rect = new Rect();
        }
        return rect;
    }
    
    private static int g(final int n, final int n2, final int n3) {
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    private void h(final g g, final Rect rect, final int n, final int n2) {
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int max = Math.max(this.getPaddingLeft() + g.leftMargin, Math.min(rect.left, width - this.getPaddingRight() - n - g.rightMargin));
        final int max2 = Math.max(this.getPaddingTop() + g.topMargin, Math.min(rect.top, height - this.getPaddingBottom() - n2 - g.bottomMargin));
        rect.set(max, max2, n + max, n2 + max2);
    }
    
    private x0 i(x0 x0) {
        if (x0.A()) {
            return x0;
        }
        int n = 0;
        final int childCount = this.getChildCount();
        x0 x2;
        while (true) {
            x2 = x0;
            if (n >= childCount) {
                break;
            }
            final View child = this.getChildAt(n);
            x0 g = x0;
            if (androidx.core.view.j0.S(child)) {
                final c f = ((g)child.getLayoutParams()).f();
                g = x0;
                if (f != null) {
                    x0 = (g = f.g(this, child, x0));
                    if (x0.A()) {
                        x2 = x0;
                        break;
                    }
                }
            }
            ++n;
            x0 = g;
        }
        return x2;
    }
    
    void C(final View view, final Rect rect) {
        rect.set(((g)view.getLayoutParams()).h());
    }
    
    g D(View o) {
        final g g = (g)((View)o).getLayoutParams();
        if (!g.b) {
            if (o instanceof b) {
                final c behavior = ((b)o).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                g.q(behavior);
            }
            else {
                Class<?> clazz = o.getClass();
                o = null;
                while (clazz != null) {
                    final d d = clazz.getAnnotation(d.class);
                    if ((o = d) != null) {
                        break;
                    }
                    clazz = clazz.getSuperclass();
                    o = d;
                }
                if (o != null) {
                    try {
                        g.q((c)((d)o).value().getDeclaredConstructor((Class<?>[])new Class[0]).newInstance(new Object[0]));
                    }
                    catch (Exception ex) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Default behavior class ");
                        sb.append(((d)o).value().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), (Throwable)ex);
                    }
                }
            }
            g.b = true;
        }
        return g;
    }
    
    public boolean G(@j0 final View view, final int n, final int n2) {
        final Rect e = e();
        this.y(view, e);
        try {
            return e.contains(n, n2);
        }
        finally {
            T(e);
        }
    }
    
    void L(final View view, int n) {
        final g g = (g)view.getLayoutParams();
        if (g.k != null) {
            final Rect e = e();
            final Rect e2 = e();
            final Rect e3 = e();
            this.y(g.k, e);
            final int n2 = 0;
            this.v(view, false, e2);
            final int measuredWidth = view.getMeasuredWidth();
            final int measuredHeight = view.getMeasuredHeight();
            this.A(view, n, e, e3, g, measuredWidth, measuredHeight);
            Label_0109: {
                if (e3.left == e2.left) {
                    n = n2;
                    if (e3.top == e2.top) {
                        break Label_0109;
                    }
                }
                n = 1;
            }
            this.h(g, e3, measuredWidth, measuredHeight);
            final int n3 = e3.left - e2.left;
            final int n4 = e3.top - e2.top;
            if (n3 != 0) {
                androidx.core.view.j0.c1(view, n3);
            }
            if (n4 != 0) {
                androidx.core.view.j0.d1(view, n4);
            }
            if (n != 0) {
                final c f = g.f();
                if (f != null) {
                    f.i(this, view, g.k);
                }
            }
            T(e);
            T(e2);
            T(e3);
        }
    }
    
    final void M(final int n) {
        final int x = androidx.core.view.j0.X((View)this);
        final int size = this.G.size();
        final Rect e = e();
        final Rect e2 = e();
        final Rect e3 = e();
        for (int i = 0; i < size; ++i) {
            final View view = this.G.get(i);
            final g g = (g)view.getLayoutParams();
            if (n != 0 || view.getVisibility() != 8) {
                for (int j = 0; j < i; ++j) {
                    if (g.l == this.G.get(j)) {
                        this.L(view, x);
                    }
                }
                this.v(view, true, e2);
                if (g.g != 0 && !e2.isEmpty()) {
                    final int d = androidx.core.view.i.d(g.g, x);
                    final int n2 = d & 0x70;
                    if (n2 != 48) {
                        if (n2 == 80) {
                            e.bottom = Math.max(e.bottom, this.getHeight() - e2.top);
                        }
                    }
                    else {
                        e.top = Math.max(e.top, e2.bottom);
                    }
                    final int n3 = d & 0x7;
                    if (n3 != 3) {
                        if (n3 == 5) {
                            e.right = Math.max(e.right, this.getWidth() - e2.left);
                        }
                    }
                    else {
                        e.left = Math.max(e.left, e2.right);
                    }
                }
                if (g.h != 0 && view.getVisibility() == 0) {
                    this.K(view, e, x);
                }
                if (n != 2) {
                    this.C(view, e3);
                    if (e3.equals((Object)e2)) {
                        continue;
                    }
                    this.S(view, e2);
                }
                for (int k = i + 1; k < size; ++k) {
                    final View view2 = this.G.get(k);
                    final g g2 = (g)view2.getLayoutParams();
                    final c f = g2.f();
                    if (f != null && f.f(this, view2, view)) {
                        if (n == 0 && g2.g()) {
                            g2.l();
                        }
                        else {
                            boolean l;
                            if (n != 2) {
                                l = f.i(this, view2, view);
                            }
                            else {
                                f.j(this, view2, view);
                                l = true;
                            }
                            if (n == 1) {
                                g2.r(l);
                            }
                        }
                    }
                }
            }
        }
        T(e);
        T(e2);
        T(e3);
    }
    
    public void N(@j0 final View view, final int n) {
        final g g = (g)view.getLayoutParams();
        if (!g.a()) {
            final View k = g.k;
            if (k != null) {
                this.I(view, k, n);
            }
            else {
                final int e = g.e;
                if (e >= 0) {
                    this.J(view, e, n);
                }
                else {
                    this.H(view, n);
                }
            }
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }
    
    public void O(final View view, final int n, final int n2, final int n3, final int n4) {
        this.measureChildWithMargins(view, n, n2, n3, n4);
    }
    
    void S(final View view, final Rect rect) {
        ((g)view.getLayoutParams()).s(rect);
    }
    
    void U() {
        if (this.O && this.S != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.S);
        }
        this.T = false;
    }
    
    final x0 b0(final x0 u) {
        x0 i = u;
        if (!androidx.core.util.i.a(this.U, u)) {
            this.U = u;
            final boolean b = true;
            final boolean v = u != null && u.r() > 0;
            this.V = v;
            this.setWillNotDraw(!v && this.getBackground() == null && b);
            i = this.i(u);
            this.requestLayout();
        }
        return i;
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof g && super.checkLayoutParams(viewGroup$LayoutParams);
    }
    
    protected boolean drawChild(final Canvas canvas, final View view, final long n) {
        final g g = (g)view.getLayoutParams();
        final c a = g.a;
        if (a != null) {
            final float d = a.d(this, view);
            if (d > 0.0f) {
                if (this.K == null) {
                    this.K = new Paint();
                }
                this.K.setColor(g.a.c(this, view));
                this.K.setAlpha(g(Math.round(d * 255.0f), 0, 255));
                final int save = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect((float)view.getLeft(), (float)view.getTop(), (float)view.getRight(), (float)view.getBottom(), Region$Op.DIFFERENCE);
                }
                canvas.drawRect((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(this.getWidth() - this.getPaddingRight()), (float)(this.getHeight() - this.getPaddingBottom()), this.K);
                canvas.restoreToCount(save);
            }
        }
        return super.drawChild(canvas, view, n);
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final int[] drawableState = this.getDrawableState();
        final Drawable w = this.W;
        int n = 0;
        if (w != null) {
            n = n;
            if (w.isStateful()) {
                n = ((false | w.setState(drawableState)) ? 1 : 0);
            }
        }
        if (n != 0) {
            this.invalidate();
        }
    }
    
    void f() {
        if (this.O) {
            if (this.S == null) {
                this.S = new h();
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.S);
        }
        this.T = true;
    }
    
    @b1
    final List<View> getDependencySortedChildren() {
        this.R();
        return Collections.unmodifiableList((List<? extends View>)this.G);
    }
    
    @t0({ t0.a.I })
    public final x0 getLastWindowInsets() {
        return this.U;
    }
    
    public int getNestedScrollAxes() {
        return this.c0.a();
    }
    
    @k0
    public Drawable getStatusBarBackground() {
        return this.W;
    }
    
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), this.getPaddingTop() + this.getPaddingBottom());
    }
    
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), this.getPaddingLeft() + this.getPaddingRight());
    }
    
    public void j(@j0 final View view) {
        final List g = this.H.g(view);
        if (g != null && !g.isEmpty()) {
            for (int i = 0; i < g.size(); ++i) {
                final View view2 = g.get(i);
                final c f = ((g)view2.getLayoutParams()).f();
                if (f != null) {
                    f.i(this, view2, view);
                }
            }
        }
    }
    
    public boolean k(@j0 View e, @j0 final View view) {
        final int visibility = e.getVisibility();
        final boolean b = false;
        if (visibility == 0 && view.getVisibility() == 0) {
            final Rect e2 = e();
            this.v(e, e.getParent() != this, e2);
            e = (View)e();
            this.v(view, view.getParent() != this, (Rect)e);
            boolean b2 = b;
            try {
                if (e2.left <= ((Rect)e).right) {
                    b2 = b;
                    if (e2.top <= ((Rect)e).bottom) {
                        b2 = b;
                        if (e2.right >= ((Rect)e).left) {
                            final int bottom = e2.bottom;
                            final int top = ((Rect)e).top;
                            b2 = b;
                            if (bottom >= top) {
                                b2 = true;
                            }
                        }
                    }
                }
                return b2;
            }
            finally {
                T(e2);
                T((Rect)e);
            }
        }
        return false;
    }
    
    void l() {
        final int childCount = this.getChildCount();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= childCount) {
                break;
            }
            if (this.F(this.getChildAt(n))) {
                b2 = true;
                break;
            }
            ++n;
        }
        if (b2 != this.T) {
            if (b2) {
                this.f();
            }
            else {
                this.U();
            }
        }
    }
    
    protected g m() {
        return new g(-2, -2);
    }
    
    public g n(final AttributeSet set) {
        return new g(this.getContext(), set);
    }
    
    protected g o(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (viewGroup$LayoutParams instanceof g) {
            return new g((g)viewGroup$LayoutParams);
        }
        if (viewGroup$LayoutParams instanceof ViewGroup$MarginLayoutParams) {
            return new g((ViewGroup$MarginLayoutParams)viewGroup$LayoutParams);
        }
        return new g(viewGroup$LayoutParams);
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.V(false);
        if (this.T) {
            if (this.S == null) {
                this.S = new h();
            }
            this.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.S);
        }
        if (this.U == null && androidx.core.view.j0.S((View)this)) {
            androidx.core.view.j0.t1((View)this);
        }
        this.O = true;
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.V(false);
        if (this.T && this.S != null) {
            this.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this.S);
        }
        final View r = this.R;
        if (r != null) {
            this.onStopNestedScroll(r);
        }
        this.O = false;
    }
    
    public void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        if (this.V && this.W != null) {
            final x0 u = this.U;
            int r;
            if (u != null) {
                r = u.r();
            }
            else {
                r = 0;
            }
            if (r > 0) {
                this.W.setBounds(0, 0, this.getWidth(), r);
                this.W.draw(canvas);
            }
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        final int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V(true);
        }
        final boolean q = this.Q(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.V(true);
        }
        return q;
    }
    
    protected void onLayout(final boolean b, int i, int x, int size, final int n) {
        x = androidx.core.view.j0.X((View)this);
        View view;
        c f;
        for (size = this.G.size(), i = 0; i < size; ++i) {
            view = this.G.get(i);
            if (view.getVisibility() != 8) {
                f = ((g)view.getLayoutParams()).f();
                if (f == null || !f.m(this, view, x)) {
                    this.N(view, x);
                }
            }
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.R();
        this.l();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingTop = this.getPaddingTop();
        final int paddingRight = this.getPaddingRight();
        final int paddingBottom = this.getPaddingBottom();
        final int x = androidx.core.view.j0.X((View)this);
        final boolean b = x == 1;
        final int mode = View$MeasureSpec.getMode(n);
        final int size = View$MeasureSpec.getSize(n);
        final int mode2 = View$MeasureSpec.getMode(n2);
        final int size2 = View$MeasureSpec.getSize(n2);
        int a = this.getSuggestedMinimumWidth();
        int a2 = this.getSuggestedMinimumHeight();
        final boolean b2 = this.U != null && androidx.core.view.j0.S((View)this);
        final int size3 = this.G.size();
        int combineMeasuredStates = 0;
        int n3 = 0;
        int n4 = paddingLeft;
        while (true) {
            final int n5 = n4;
            if (n3 >= size3) {
                break;
            }
            final View view = this.G.get(n3);
            if (view.getVisibility() != 8) {
                final g g = (g)view.getLayoutParams();
                final int e = g.e;
                int n7 = 0;
                Label_0302: {
                    if (e >= 0 && mode != 0) {
                        final int b3 = this.B(e);
                        final int n6 = androidx.core.view.i.d(Y(g.c), x) & 0x7;
                        if ((n6 == 3 && !b) || (n6 == 5 && b)) {
                            n7 = Math.max(0, size - paddingRight - b3);
                            break Label_0302;
                        }
                        if ((n6 == 5 && !b) || (n6 == 3 && b)) {
                            n7 = Math.max(0, b3 - n5);
                            break Label_0302;
                        }
                    }
                    n7 = 0;
                }
                final int n8 = combineMeasuredStates;
                int measureSpec;
                int measureSpec2;
                if (b2 && !androidx.core.view.j0.S(view)) {
                    final int p2 = this.U.p();
                    final int q = this.U.q();
                    final int r = this.U.r();
                    final int o = this.U.o();
                    measureSpec = View$MeasureSpec.makeMeasureSpec(size - (p2 + q), mode);
                    measureSpec2 = View$MeasureSpec.makeMeasureSpec(size2 - (r + o), mode2);
                }
                else {
                    measureSpec = n;
                    measureSpec2 = n2;
                }
                final c f = g.f();
                if (f == null || !f.n(this, view, measureSpec, n7, measureSpec2, 0)) {
                    this.O(view, measureSpec, n7, measureSpec2, 0);
                }
                a = Math.max(a, paddingLeft + paddingRight + view.getMeasuredWidth() + g.leftMargin + g.rightMargin);
                a2 = Math.max(a2, paddingTop + paddingBottom + view.getMeasuredHeight() + g.topMargin + g.bottomMargin);
                combineMeasuredStates = View.combineMeasuredStates(n8, view.getMeasuredState());
            }
            ++n3;
            n4 = n5;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(a, n, 0xFF000000 & combineMeasuredStates), View.resolveSizeAndState(a2, n2, combineMeasuredStates << 16));
    }
    
    public boolean onNestedFling(final View view, final float n, final float n2, final boolean b) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b2;
            if (child.getVisibility() == 8) {
                b2 = (n3 != 0);
            }
            else {
                final g g = (g)child.getLayoutParams();
                if (!g.k(0)) {
                    b2 = (n3 != 0);
                }
                else {
                    final c f = g.f();
                    b2 = (n3 != 0);
                    if (f != null) {
                        b2 = ((n3 | (f.o(this, child, view, n, n2, b) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b2 ? 1 : 0);
        }
        if (n3 != 0) {
            this.M(1);
        }
        return n3 != 0;
    }
    
    public boolean onNestedPreFling(final View view, final float n, final float n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        int n3 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            boolean b;
            if (child.getVisibility() == 8) {
                b = (n3 != 0);
            }
            else {
                final g g = (g)child.getLayoutParams();
                if (!g.k(0)) {
                    b = (n3 != 0);
                }
                else {
                    final c f = g.f();
                    b = (n3 != 0);
                    if (f != null) {
                        b = ((n3 | (f.p(this, child, view, n, n2) ? 1 : 0)) != 0x0);
                    }
                }
            }
            ++i;
            n3 = (b ? 1 : 0);
        }
        return n3 != 0;
    }
    
    public void onNestedPreScroll(final View view, final int n, final int n2, final int[] array) {
        this.u(view, n, n2, array, 0);
    }
    
    public void onNestedScroll(final View view, final int n, final int n2, final int n3, final int n4) {
        this.q(view, n, n2, n3, n4, 0);
    }
    
    public void onNestedScrollAccepted(final View view, final View view2, final int n) {
        this.s(view, view2, n, 0);
    }
    
    protected void onRestoreInstanceState(final Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        final i i = (i)parcelable;
        super.onRestoreInstanceState(i.a());
        final SparseArray<Parcelable> j = i.I;
        for (int k = 0; k < this.getChildCount(); ++k) {
            final View child = this.getChildAt(k);
            final int id = child.getId();
            final c f = this.D(child).f();
            if (id != -1 && f != null) {
                final Parcelable parcelable2 = (Parcelable)j.get(id);
                if (parcelable2 != null) {
                    f.y(this, child, parcelable2);
                }
            }
        }
    }
    
    protected Parcelable onSaveInstanceState() {
        final i i = new i(super.onSaveInstanceState());
        final SparseArray j = new SparseArray();
        for (int childCount = this.getChildCount(), k = 0; k < childCount; ++k) {
            final View child = this.getChildAt(k);
            final int id = child.getId();
            final c f = ((g)child.getLayoutParams()).f();
            if (id != -1 && f != null) {
                final Parcelable z = f.z(this, child);
                if (z != null) {
                    j.append(id, (Object)z);
                }
            }
        }
        i.I = (SparseArray<Parcelable>)j;
        return (Parcelable)i;
    }
    
    public boolean onStartNestedScroll(final View view, final View view2, final int n) {
        return this.r(view, view2, n, 0);
    }
    
    public void onStopNestedScroll(final View view) {
        this.t(view, 0);
    }
    
    public boolean onTouchEvent(MotionEvent obtain) {
        final int actionMasked = obtain.getActionMasked();
        int n = 0;
        int n2 = 0;
        Label_0078: {
            Label_0076: {
                int q;
                if (this.Q == null) {
                    q = (this.Q(obtain, 1) ? 1 : 0);
                    if ((n = q) == 0) {
                        break Label_0076;
                    }
                }
                else {
                    q = 0;
                }
                final c f = ((g)this.Q.getLayoutParams()).f();
                n = q;
                if (f != null) {
                    final boolean e = f.E(this, this.Q, obtain);
                    n = q;
                    n2 = (e ? 1 : 0);
                    break Label_0078;
                }
            }
            n2 = 0;
        }
        final View q2 = this.Q;
        final MotionEvent motionEvent = null;
        boolean b;
        if (q2 == null) {
            b = ((n2 | (super.onTouchEvent(obtain) ? 1 : 0)) != 0x0);
            obtain = motionEvent;
        }
        else {
            b = (n2 != 0);
            obtain = motionEvent;
            if (n != 0) {
                final long uptimeMillis = SystemClock.uptimeMillis();
                obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                b = (n2 != 0);
            }
        }
        if (obtain != null) {
            obtain.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V(false);
        }
        return b;
    }
    
    public void p(@j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n6 = 0;
        int n7 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n8;
            int n9;
            if (child.getVisibility() == 8) {
                n8 = n6;
                n9 = n7;
            }
            else {
                final g g = (g)child.getLayoutParams();
                if (!g.k(n5)) {
                    n8 = n6;
                    n9 = n7;
                }
                else {
                    final c f = g.f();
                    n8 = n6;
                    n9 = n7;
                    if (f != null) {
                        final int[] l = this.L;
                        l[1] = (l[0] = 0);
                        f.u(this, child, view, n, n2, n3, n4, n5, l);
                        final int[] j = this.L;
                        int n10;
                        if (n3 > 0) {
                            n10 = Math.max(n6, j[0]);
                        }
                        else {
                            n10 = Math.min(n6, j[0]);
                        }
                        n8 = n10;
                        if (n4 > 0) {
                            n9 = Math.max(n7, this.L[1]);
                        }
                        else {
                            n9 = Math.min(n7, this.L[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
            n6 = n8;
            n7 = n9;
        }
        array[0] += n6;
        array[1] += n7;
        if (b) {
            this.M(1);
        }
    }
    
    public void q(final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
        this.p(view, n, n2, n3, n4, 0, this.M);
    }
    
    public boolean r(final View view, final View view2, final int n, final int n2) {
        final int childCount = this.getChildCount();
        int i = 0;
        boolean b = false;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final g g = (g)child.getLayoutParams();
                final c f = g.f();
                if (f != null) {
                    final boolean b2 = f.B(this, child, view, view2, n, n2);
                    b |= b2;
                    g.t(n2, b2);
                }
                else {
                    g.t(n2, false);
                }
            }
            ++i;
        }
        return b;
    }
    
    public boolean requestChildRectangleOnScreen(final View view, final Rect rect, final boolean b) {
        final c f = ((g)view.getLayoutParams()).f();
        return (f != null && f.x(this, view, rect, b)) || super.requestChildRectangleOnScreen(view, rect, b);
    }
    
    public void requestDisallowInterceptTouchEvent(final boolean b) {
        super.requestDisallowInterceptTouchEvent(b);
        if (b && !this.N) {
            this.V(false);
            this.N = true;
        }
    }
    
    public void s(final View view, final View r, final int n, final int n2) {
        this.c0.c(view, r, n, n2);
        this.R = r;
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final g g = (g)child.getLayoutParams();
            if (g.k(n2)) {
                final c f = g.f();
                if (f != null) {
                    f.w(this, child, view, r, n, n2);
                }
            }
        }
    }
    
    public void setFitsSystemWindows(final boolean fitsSystemWindows) {
        super.setFitsSystemWindows(fitsSystemWindows);
        this.c0();
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener a0) {
        this.a0 = a0;
    }
    
    public void setStatusBarBackground(@k0 Drawable w) {
        final Drawable w2 = this.W;
        if (w2 != w) {
            Drawable mutate = null;
            if (w2 != null) {
                w2.setCallback((Drawable$Callback)null);
            }
            if (w != null) {
                mutate = w.mutate();
            }
            if ((this.W = mutate) != null) {
                if (mutate.isStateful()) {
                    this.W.setState(this.getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.W, androidx.core.view.j0.X((View)this));
                w = this.W;
                w.setVisible(this.getVisibility() == 0, false);
                this.W.setCallback((Drawable$Callback)this);
            }
            androidx.core.view.j0.l1((View)this);
        }
    }
    
    public void setStatusBarBackgroundColor(@l final int n) {
        this.setStatusBarBackground((Drawable)new ColorDrawable(n));
    }
    
    public void setStatusBarBackgroundResource(@s final int n) {
        Drawable i;
        if (n != 0) {
            i = androidx.core.content.d.i(this.getContext(), n);
        }
        else {
            i = null;
        }
        this.setStatusBarBackground(i);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable w = this.W;
        if (w != null && w.isVisible() != b) {
            this.W.setVisible(b, false);
        }
    }
    
    public void t(final View view, final int n) {
        this.c0.e(view, n);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            final g g = (g)child.getLayoutParams();
            if (g.k(n)) {
                final c f = g.f();
                if (f != null) {
                    f.D(this, child, view, n);
                }
                g.m(n);
                g.l();
            }
        }
        this.R = null;
    }
    
    public void u(final View view, final int n, final int n2, final int[] array, final int n3) {
        final int childCount = this.getChildCount();
        boolean b = false;
        int i = 0;
        int n4 = 0;
        int n5 = 0;
        while (i < childCount) {
            final View child = this.getChildAt(i);
            int n6;
            int n7;
            if (child.getVisibility() == 8) {
                n6 = n4;
                n7 = n5;
            }
            else {
                final g g = (g)child.getLayoutParams();
                if (!g.k(n3)) {
                    n6 = n4;
                    n7 = n5;
                }
                else {
                    final c f = g.f();
                    n6 = n4;
                    n7 = n5;
                    if (f != null) {
                        final int[] l = this.L;
                        l[1] = (l[0] = 0);
                        f.r(this, child, view, n, n2, l, n3);
                        final int[] j = this.L;
                        int n8;
                        if (n > 0) {
                            n8 = Math.max(n4, j[0]);
                        }
                        else {
                            n8 = Math.min(n4, j[0]);
                        }
                        n6 = n8;
                        final int[] k = this.L;
                        if (n2 > 0) {
                            n7 = Math.max(n5, k[1]);
                        }
                        else {
                            n7 = Math.min(n5, k[1]);
                        }
                        b = true;
                    }
                }
            }
            ++i;
            n4 = n6;
            n5 = n7;
        }
        array[0] = n4;
        array[1] = n5;
        if (b) {
            this.M(1);
        }
    }
    
    void v(final View view, final boolean b, final Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (b) {
                this.y(view, rect);
            }
            else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            return;
        }
        rect.setEmpty();
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.W;
    }
    
    @j0
    public List<View> w(@j0 final View view) {
        final List<View> h = this.H.h(view);
        this.J.clear();
        if (h != null) {
            this.J.addAll(h);
        }
        return this.J;
    }
    
    @j0
    public List<View> x(@j0 final View view) {
        final List g = this.H.g(view);
        this.J.clear();
        if (g != null) {
            this.J.addAll(g);
        }
        return this.J;
    }
    
    void y(final View view, final Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }
    
    void z(final View view, final int n, final Rect rect, final Rect rect2) {
        final g g = (g)view.getLayoutParams();
        final int measuredWidth = view.getMeasuredWidth();
        final int measuredHeight = view.getMeasuredHeight();
        this.A(view, n, rect, rect2, g, measuredWidth, measuredHeight);
        this.h(g, rect2, measuredWidth, measuredHeight);
    }
    
    public interface b
    {
        @j0
        c getBehavior();
    }
    
    public abstract static class c<V extends View>
    {
        public c() {
        }
        
        public c(final Context context, final AttributeSet set) {
        }
        
        public static void F(@j0 final View view, @k0 final Object r) {
            ((g)view.getLayoutParams()).r = r;
        }
        
        @k0
        public static Object e(@j0 final View view) {
            return ((g)view.getLayoutParams()).r;
        }
        
        @Deprecated
        public boolean A(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n) {
            return false;
        }
        
        public boolean B(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n, final int n2) {
            return n2 == 0 && this.A(coordinatorLayout, v, view, view2, n);
        }
        
        @Deprecated
        public void C(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view) {
        }
        
        public void D(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n) {
            if (n == 0) {
                this.C(coordinatorLayout, v, view);
            }
        }
        
        public boolean E(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
            return false;
        }
        
        public boolean a(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v) {
            return this.d(coordinatorLayout, v) > 0.0f;
        }
        
        public boolean b(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final Rect rect) {
            return false;
        }
        
        @l
        public int c(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v) {
            return -16777216;
        }
        
        @t(from = 0.0, to = 1.0)
        public float d(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v) {
            return 0.0f;
        }
        
        public boolean f(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view) {
            return false;
        }
        
        @j0
        public x0 g(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final x0 x0) {
            return x0;
        }
        
        public void h(@j0 final g g) {
        }
        
        public boolean i(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view) {
            return false;
        }
        
        public void j(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view) {
        }
        
        public void k() {
        }
        
        public boolean l(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final MotionEvent motionEvent) {
            return false;
        }
        
        public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n) {
            return false;
        }
        
        public boolean n(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, final int n, final int n2, final int n3, final int n4) {
            return false;
        }
        
        public boolean o(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final float n, final float n2, final boolean b) {
            return false;
        }
        
        public boolean p(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final float n, final float n2) {
            return false;
        }
        
        @Deprecated
        public void q(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, @j0 final int[] array) {
        }
        
        public void r(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, @j0 final int[] array, final int n3) {
            if (n3 == 0) {
                this.q(coordinatorLayout, v, view, n, n2, array);
            }
        }
        
        @Deprecated
        public void s(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, final int n3, final int n4) {
        }
        
        @Deprecated
        public void t(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5) {
            if (n5 == 0) {
                this.s(coordinatorLayout, v, view, n, n2, n3, n4);
            }
        }
        
        public void u(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, final int n, final int n2, final int n3, final int n4, final int n5, @j0 final int[] array) {
            array[0] += n3;
            array[1] += n4;
            this.t(coordinatorLayout, v, view, n, n2, n3, n4, n5);
        }
        
        @Deprecated
        public void v(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n) {
        }
        
        public void w(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final View view, @j0 final View view2, final int n, final int n2) {
            if (n2 == 0) {
                this.v(coordinatorLayout, v, view, view2, n);
            }
        }
        
        public boolean x(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final Rect rect, final boolean b) {
            return false;
        }
        
        public void y(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v, @j0 final Parcelable parcelable) {
        }
        
        @k0
        public Parcelable z(@j0 final CoordinatorLayout coordinatorLayout, @j0 final V v) {
            return (Parcelable)View$BaseSavedState.EMPTY_STATE;
        }
    }
    
    @Deprecated
    @Retention(RetentionPolicy.RUNTIME)
    public @interface d {
        Class<? extends c> value();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface e {
    }
    
    private class f implements ViewGroup$OnHierarchyChangeListener
    {
        f() {
        }
        
        public void onChildViewAdded(final View view, final View view2) {
            final ViewGroup$OnHierarchyChangeListener a0 = CoordinatorLayout.this.a0;
            if (a0 != null) {
                a0.onChildViewAdded(view, view2);
            }
        }
        
        public void onChildViewRemoved(final View view, final View view2) {
            CoordinatorLayout.this.M(2);
            final ViewGroup$OnHierarchyChangeListener a0 = CoordinatorLayout.this.a0;
            if (a0 != null) {
                a0.onChildViewRemoved(view, view2);
            }
        }
    }
    
    public static class g extends ViewGroup$MarginLayoutParams
    {
        c a;
        boolean b;
        public int c;
        public int d;
        public int e;
        int f;
        public int g;
        public int h;
        int i;
        int j;
        View k;
        View l;
        private boolean m;
        private boolean n;
        private boolean o;
        private boolean p;
        final Rect q;
        Object r;
        
        public g(final int n, final int n2) {
            super(n, n2);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        g(@j0 final Context context, @k0 final AttributeSet set) {
            super(context, set);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, j.a.j.h);
            this.c = obtainStyledAttributes.getInteger(j.a.j.i, 0);
            this.f = obtainStyledAttributes.getResourceId(j.a.j.j, -1);
            this.d = obtainStyledAttributes.getInteger(j.a.j.k, 0);
            this.e = obtainStyledAttributes.getInteger(j.a.j.o, -1);
            this.g = obtainStyledAttributes.getInt(j.a.j.n, 0);
            this.h = obtainStyledAttributes.getInt(j.a.j.m, 0);
            final int l = j.a.j.l;
            final boolean hasValue = obtainStyledAttributes.hasValue(l);
            this.b = hasValue;
            if (hasValue) {
                this.a = CoordinatorLayout.P(context, set, obtainStyledAttributes.getString(l));
            }
            obtainStyledAttributes.recycle();
            final c a = this.a;
            if (a != null) {
                a.h(this);
            }
        }
        
        public g(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public g(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        public g(final g g) {
            super((ViewGroup$MarginLayoutParams)g);
            this.b = false;
            this.c = 0;
            this.d = 0;
            this.e = -1;
            this.f = -1;
            this.g = 0;
            this.h = 0;
            this.q = new Rect();
        }
        
        private void o(final View obj, final CoordinatorLayout coordinatorLayout) {
            View viewById = coordinatorLayout.findViewById(this.f);
            this.k = viewById;
            Label_0030: {
                if (viewById != null) {
                    if (viewById != coordinatorLayout) {
                        ViewParent viewParent = viewById.getParent();
                        while (viewParent != coordinatorLayout && viewParent != null) {
                            if (viewParent == obj) {
                                if (coordinatorLayout.isInEditMode()) {
                                    break Label_0030;
                                }
                                throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                            }
                            else {
                                if (viewParent instanceof View) {
                                    viewById = (View)viewParent;
                                }
                                viewParent = viewParent.getParent();
                            }
                        }
                        this.l = viewById;
                        return;
                    }
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                    }
                }
                else if (!coordinatorLayout.isInEditMode()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Could not find CoordinatorLayout descendant view with id ");
                    sb.append(coordinatorLayout.getResources().getResourceName(this.f));
                    sb.append(" to anchor view ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
            }
            this.l = null;
            this.k = null;
        }
        
        private boolean u(final View view, final int n) {
            final int d = androidx.core.view.i.d(((g)view.getLayoutParams()).g, n);
            return d != 0 && (androidx.core.view.i.d(this.h, n) & d) == d;
        }
        
        private boolean v(final View view, final CoordinatorLayout coordinatorLayout) {
            if (this.k.getId() != this.f) {
                return false;
            }
            View k = this.k;
            for (ViewParent viewParent = k.getParent(); viewParent != coordinatorLayout; viewParent = viewParent.getParent()) {
                if (viewParent == null || viewParent == view) {
                    this.l = null;
                    this.k = null;
                    return false;
                }
                if (viewParent instanceof View) {
                    k = (View)viewParent;
                }
            }
            this.l = k;
            return true;
        }
        
        boolean a() {
            return this.k == null && this.f != -1;
        }
        
        boolean b(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
            if (view2 != this.l && !this.u(view2, androidx.core.view.j0.X((View)coordinatorLayout))) {
                final c a = this.a;
                if (a == null || !a.f(coordinatorLayout, view, view2)) {
                    return false;
                }
            }
            return true;
        }
        
        boolean c() {
            if (this.a == null) {
                this.m = false;
            }
            return this.m;
        }
        
        View d(final CoordinatorLayout coordinatorLayout, final View view) {
            if (this.f == -1) {
                this.l = null;
                return this.k = null;
            }
            if (this.k == null || !this.v(view, coordinatorLayout)) {
                this.o(view, coordinatorLayout);
            }
            return this.k;
        }
        
        @androidx.annotation.y
        public int e() {
            return this.f;
        }
        
        @k0
        public c f() {
            return this.a;
        }
        
        boolean g() {
            return this.p;
        }
        
        Rect h() {
            return this.q;
        }
        
        void i() {
            this.l = null;
            this.k = null;
        }
        
        boolean j(final CoordinatorLayout coordinatorLayout, final View view) {
            final boolean m = this.m;
            if (m) {
                return true;
            }
            final c a = this.a;
            return this.m = ((a != null && a.a(coordinatorLayout, view)) | m);
        }
        
        boolean k(final int n) {
            if (n != 0) {
                return n == 1 && this.o;
            }
            return this.n;
        }
        
        void l() {
            this.p = false;
        }
        
        void m(final int n) {
            this.t(n, false);
        }
        
        void n() {
            this.m = false;
        }
        
        public void p(@androidx.annotation.y final int f) {
            this.i();
            this.f = f;
        }
        
        public void q(@k0 final c a) {
            final c a2 = this.a;
            if (a2 != a) {
                if (a2 != null) {
                    a2.k();
                }
                this.a = a;
                this.r = null;
                this.b = true;
                if (a != null) {
                    a.h(this);
                }
            }
        }
        
        void r(final boolean p) {
            this.p = p;
        }
        
        void s(final Rect rect) {
            this.q.set(rect);
        }
        
        void t(final int n, final boolean b) {
            if (n != 0) {
                if (n == 1) {
                    this.o = b;
                }
            }
            else {
                this.n = b;
            }
        }
    }
    
    class h implements ViewTreeObserver$OnPreDrawListener
    {
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }
    
    protected static class i extends a
    {
        public static final Parcelable$Creator<i> CREATOR;
        SparseArray<Parcelable> I;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$ClassLoaderCreator<i>() {
                public i a(final Parcel parcel) {
                    return new i(parcel, null);
                }
                
                public i b(final Parcel parcel, final ClassLoader classLoader) {
                    return new i(parcel, classLoader);
                }
                
                public i[] c(final int n) {
                    return new i[n];
                }
            };
        }
        
        public i(final Parcel parcel, final ClassLoader classLoader) {
            super(parcel, classLoader);
            final int int1 = parcel.readInt();
            final int[] array = new int[int1];
            parcel.readIntArray(array);
            final Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.I = (SparseArray<Parcelable>)new SparseArray(int1);
            for (int i = 0; i < int1; ++i) {
                this.I.append(array[i], (Object)parcelableArray[i]);
            }
        }
        
        public i(final Parcelable parcelable) {
            super(parcelable);
        }
        
        @Override
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            final SparseArray<Parcelable> i = this.I;
            int j = 0;
            int size;
            if (i != null) {
                size = i.size();
            }
            else {
                size = 0;
            }
            parcel.writeInt(size);
            final int[] array = new int[size];
            final Parcelable[] array2 = new Parcelable[size];
            while (j < size) {
                array[j] = this.I.keyAt(j);
                array2[j] = (Parcelable)this.I.valueAt(j);
                ++j;
            }
            parcel.writeIntArray(array);
            parcel.writeParcelableArray(array2, n);
        }
    }
    
    static class j implements Comparator<View>
    {
        public int a(final View view, final View view2) {
            final float e0 = androidx.core.view.j0.E0(view);
            final float e2 = androidx.core.view.j0.E0(view2);
            if (e0 > e2) {
                return -1;
            }
            if (e0 < e2) {
                return 1;
            }
            return 0;
        }
    }
}
