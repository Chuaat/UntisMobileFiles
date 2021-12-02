// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import androidx.constraintlayout.core.widgets.m;
import androidx.constraintlayout.core.widgets.k;
import android.util.SparseIntArray;
import android.util.Log;
import android.content.res.TypedArray;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.constraintlayout.core.widgets.h;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.view.ViewGroup$LayoutParams;
import android.view.View$MeasureSpec;
import android.os.Build$VERSION;
import androidx.constraintlayout.core.widgets.d;
import android.content.res.Resources$NotFoundException;
import android.annotation.TargetApi;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import java.util.HashMap;
import androidx.constraintlayout.core.widgets.f;
import java.util.ArrayList;
import android.view.View;
import android.util.SparseArray;
import android.view.ViewGroup;

public class ConstraintLayout extends ViewGroup
{
    public static final String i0 = "ConstraintLayout-2.1.0";
    private static final String j0 = "ConstraintLayout";
    private static final boolean k0 = true;
    private static final boolean l0 = false;
    private static final boolean m0 = false;
    private static final boolean n0 = false;
    private static final boolean o0 = false;
    public static final int p0 = 0;
    private static l q0;
    SparseArray<View> G;
    private ArrayList<androidx.constraintlayout.widget.b> H;
    protected f I;
    private int J;
    private int K;
    private int L;
    private int M;
    protected boolean N;
    private int O;
    private e P;
    protected androidx.constraintlayout.widget.c Q;
    private int R;
    private HashMap<String, Integer> S;
    private int T;
    private int U;
    int V;
    int W;
    int a0;
    int b0;
    private SparseArray<androidx.constraintlayout.core.widgets.e> c0;
    private g d0;
    private androidx.constraintlayout.core.f e0;
    c f0;
    private int g0;
    private int h0;
    
    public ConstraintLayout(@j0 final Context context) {
        super(context);
        this.G = (SparseArray<View>)new SparseArray();
        this.H = new ArrayList<androidx.constraintlayout.widget.b>(4);
        this.I = new f();
        this.J = 0;
        this.K = 0;
        this.L = Integer.MAX_VALUE;
        this.M = Integer.MAX_VALUE;
        this.N = true;
        this.O = 257;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = new HashMap<String, Integer>();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = (SparseArray<androidx.constraintlayout.core.widgets.e>)new SparseArray();
        this.f0 = new c(this);
        this.g0 = 0;
        this.v(null, this.h0 = 0, 0);
    }
    
    public ConstraintLayout(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.G = (SparseArray<View>)new SparseArray();
        this.H = new ArrayList<androidx.constraintlayout.widget.b>(4);
        this.I = new f();
        this.J = 0;
        this.K = 0;
        this.L = Integer.MAX_VALUE;
        this.M = Integer.MAX_VALUE;
        this.N = true;
        this.O = 257;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = new HashMap<String, Integer>();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = (SparseArray<androidx.constraintlayout.core.widgets.e>)new SparseArray();
        this.f0 = new c(this);
        this.g0 = 0;
        this.v(set, this.h0 = 0, 0);
    }
    
    public ConstraintLayout(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = (SparseArray<View>)new SparseArray();
        this.H = new ArrayList<androidx.constraintlayout.widget.b>(4);
        this.I = new f();
        this.J = 0;
        this.K = 0;
        this.L = Integer.MAX_VALUE;
        this.M = Integer.MAX_VALUE;
        this.N = true;
        this.O = 257;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = new HashMap<String, Integer>();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = (SparseArray<androidx.constraintlayout.core.widgets.e>)new SparseArray();
        this.f0 = new c(this);
        this.g0 = 0;
        this.v(set, n, this.h0 = 0);
    }
    
    @TargetApi(21)
    public ConstraintLayout(@j0 final Context context, @k0 final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        this.G = (SparseArray<View>)new SparseArray();
        this.H = new ArrayList<androidx.constraintlayout.widget.b>(4);
        this.I = new f();
        this.J = 0;
        this.K = 0;
        this.L = Integer.MAX_VALUE;
        this.M = Integer.MAX_VALUE;
        this.N = true;
        this.O = 257;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = new HashMap<String, Integer>();
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = (SparseArray<androidx.constraintlayout.core.widgets.e>)new SparseArray();
        this.f0 = new c(this);
        this.g0 = 0;
        this.h0 = 0;
        this.v(set, n, n2);
    }
    
    private void C() {
        final boolean inEditMode = this.isInEditMode();
        final int childCount = this.getChildCount();
        for (int i = 0; i < childCount; ++i) {
            final androidx.constraintlayout.core.widgets.e o = this.o(this.getChildAt(i));
            if (o != null) {
                o.N0();
            }
        }
        Label_0144: {
            if (!inEditMode) {
                break Label_0144;
            }
            int i = 0;
        Label_0138_Outer:
            while (true) {
                if (i >= childCount) {
                    break Label_0144;
                }
                final View child = this.getChildAt(i);
                while (true) {
                    try {
                        final String resourceName = this.getResources().getResourceName(child.getId());
                        this.D(0, resourceName, child.getId());
                        final int index = resourceName.indexOf(47);
                        String substring = resourceName;
                        if (index != -1) {
                            substring = resourceName.substring(index + 1);
                        }
                        this.m(child.getId()).d1(substring);
                        ++i;
                        continue Label_0138_Outer;
                        // iftrue(Label_0303:, !child4 instanceof i)
                        // iftrue(Label_0455:, i >= childCount)
                        // iftrue(Label_0272:, i >= size)
                        // iftrue(Label_0222:, p == null)
                        // iftrue(Label_0204:, i >= childCount)
                        // iftrue(Label_0309:, i >= childCount)
                        // iftrue(Label_0272:, size <= 0)
                        // iftrue(Label_0204:, this.R == -1)
                        // iftrue(Label_0415:, o2 != null)
                        // iftrue(Label_0385:, i >= childCount)
                        // iftrue(Label_0198:, child2.getId() != this.R || !child2 instanceof f)
                        View child2 = null;
                        View child3;
                        b b;
                        androidx.constraintlayout.core.widgets.e o2;
                        View child4 = null;
                        int size;
                        e p;
                        View child5;
                        Label_0154_Outer:Label_0303_Outer:Label_0387_Outer:Block_17_Outer:
                        while (true) {
                            this.P = ((androidx.constraintlayout.widget.f)child2).getConstraintSet();
                            Block_9: {
                                while (true) {
                                    Label_0345: {
                                        while (true) {
                                            Label_0449: {
                                            Block_18:
                                                while (true) {
                                                Label_0154:
                                                    while (true) {
                                                        Label_0198: {
                                                            break Label_0198;
                                                        Block_13_Outer:
                                                            while (true) {
                                                                i = 0;
                                                                break Label_0154;
                                                                Label_0415: {
                                                                    b = (b)child3.getLayoutParams();
                                                                }
                                                                this.I.b(o2);
                                                                this.h(inEditMode, child3, o2, b, this.c0);
                                                                break Label_0449;
                                                                while (true) {
                                                                    Label_0222: {
                                                                        while (true) {
                                                                            Label_0274: {
                                                                                while (true) {
                                                                                    this.H.get(i).H(this);
                                                                                    ++i;
                                                                                    Label_0245: {
                                                                                        break Label_0245;
                                                                                        break Label_0449;
                                                                                        ++i;
                                                                                        break Label_0274;
                                                                                        child4 = this.getChildAt(i);
                                                                                        break Label_0154;
                                                                                        i = 0;
                                                                                        break Label_0245;
                                                                                        Label_0272:
                                                                                        i = 0;
                                                                                        break Label_0274;
                                                                                        break Block_18;
                                                                                    }
                                                                                    continue Label_0303_Outer;
                                                                                }
                                                                                Label_0204:
                                                                                p = this.P;
                                                                                p.t(this, true);
                                                                                break Label_0222;
                                                                                break Block_9;
                                                                            }
                                                                            continue Block_13_Outer;
                                                                        }
                                                                        Label_0309:
                                                                        this.c0.clear();
                                                                        this.c0.put(0, (Object)this.I);
                                                                        this.c0.put(this.getId(), (Object)this.I);
                                                                        i = 0;
                                                                        break Label_0345;
                                                                    }
                                                                    this.I.j2();
                                                                    size = this.H.size();
                                                                    continue Label_0387_Outer;
                                                                }
                                                                continue Label_0154_Outer;
                                                            }
                                                        }
                                                        ++i;
                                                        continue Label_0154;
                                                    }
                                                    ((i)child4).c(this);
                                                    continue Label_0387_Outer;
                                                }
                                                child3 = this.getChildAt(i);
                                                o2 = this.o(child3);
                                            }
                                            ++i;
                                            continue Block_17_Outer;
                                            Label_0385: {
                                                i = 0;
                                            }
                                            continue Block_17_Outer;
                                        }
                                        child5 = this.getChildAt(i);
                                        this.c0.put(child5.getId(), (Object)this.o(child5));
                                        ++i;
                                    }
                                    continue;
                                }
                            }
                            child2 = this.getChildAt(i);
                            continue Label_0154_Outer;
                        }
                        Label_0455:;
                    }
                    catch (Resources$NotFoundException ex) {
                        continue;
                    }
                    break;
                }
                break;
            }
        }
    }
    
    private void G(final androidx.constraintlayout.core.widgets.e e, final b b, final SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray, final int n, final d.b b2) {
        final View view = (View)this.G.get(n);
        final androidx.constraintlayout.core.widgets.e e2 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(n);
        if (e2 != null && view != null && view.getLayoutParams() instanceof b) {
            b.f0 = true;
            final d.b l = d.b.L;
            if (b2 == l) {
                final b b3 = (b)view.getLayoutParams();
                b3.f0 = true;
                b3.u0.r1(true);
            }
            e.r(l).b(e2.r(b2), b.C, b.B, true);
            e.r1(true);
            e.r(d.b.I).x();
            e.r(d.b.K).x();
        }
    }
    
    private boolean H() {
        final int childCount = this.getChildCount();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= childCount) {
                break;
            }
            if (this.getChildAt(n).isLayoutRequested()) {
                b2 = true;
                break;
            }
            ++n;
        }
        if (b2) {
            this.C();
        }
        return b2;
    }
    
    private int getPaddingWidth() {
        final int paddingLeft = this.getPaddingLeft();
        int n = 0;
        int n2 = Math.max(0, paddingLeft) + Math.max(0, this.getPaddingRight());
        if (Build$VERSION.SDK_INT >= 17) {
            n = Math.max(0, this.getPaddingEnd()) + Math.max(0, this.getPaddingStart());
        }
        if (n > 0) {
            n2 = n;
        }
        return n2;
    }
    
    public static l getSharedValues() {
        if (ConstraintLayout.q0 == null) {
            ConstraintLayout.q0 = new l();
        }
        return ConstraintLayout.q0;
    }
    
    private final androidx.constraintlayout.core.widgets.e m(final int n) {
        if (n == 0) {
            return this.I;
        }
        View view;
        if ((view = (View)this.G.get(n)) == null) {
            final View viewById = this.findViewById(n);
            if ((view = viewById) != null && (view = viewById) != this) {
                view = viewById;
                if (viewById.getParent() == this) {
                    this.onViewAdded(viewById);
                    view = viewById;
                }
            }
        }
        if (view == this) {
            return this.I;
        }
        androidx.constraintlayout.core.widgets.e u0;
        if (view == null) {
            u0 = null;
        }
        else {
            u0 = ((b)view.getLayoutParams()).u0;
        }
        return u0;
    }
    
    private void v(AttributeSet obtainStyledAttributes, int i, int indexCount) {
        this.I.b1(this);
        this.I.O2(this.f0);
        this.G.put(this.getId(), (Object)this);
        this.P = null;
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes = (AttributeSet)this.getContext().obtainStyledAttributes(obtainStyledAttributes, j.m.t6, i, indexCount);
            int index;
            int resourceId;
            int resourceId2;
            for (indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                if (index == j.m.K6) {
                    this.J = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.J);
                }
                else if (index == j.m.L6) {
                    this.K = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.K);
                }
                else if (index == j.m.I6) {
                    this.L = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.L);
                }
                else if (index == j.m.J6) {
                    this.M = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.M);
                }
                else if (index == j.m.C8) {
                    this.O = ((TypedArray)obtainStyledAttributes).getInt(index, this.O);
                }
                else if (index == j.m.x7) {
                    resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            this.z(resourceId);
                        }
                        catch (Resources$NotFoundException ex) {
                            this.Q = null;
                        }
                    }
                }
                else if (index == j.m.c7) {
                    resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, 0);
                    try {
                        (this.P = new e()).w0(this.getContext(), resourceId2);
                    }
                    catch (Resources$NotFoundException ex2) {
                        this.P = null;
                    }
                    this.R = resourceId2;
                }
            }
            ((TypedArray)obtainStyledAttributes).recycle();
        }
        this.I.P2(this.O);
    }
    
    private void y() {
        this.N = true;
        this.T = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.a0 = 0;
        this.b0 = 0;
    }
    
    protected void A(int resolveSizeAndState, int min, int n, final int n2, final boolean b, final boolean b2) {
        final c f0 = this.f0;
        final int e = f0.e;
        resolveSizeAndState = ViewGroup.resolveSizeAndState(n + f0.d, resolveSizeAndState, 0);
        n = ViewGroup.resolveSizeAndState(n2 + e, min, 0);
        min = Math.min(this.L, resolveSizeAndState & 0xFFFFFF);
        n = Math.min(this.M, n & 0xFFFFFF);
        resolveSizeAndState = min;
        if (b) {
            resolveSizeAndState = (min | 0x1000000);
        }
        min = n;
        if (b2) {
            min = (n | 0x1000000);
        }
        this.setMeasuredDimension(resolveSizeAndState, min);
        this.T = resolveSizeAndState;
        this.U = min;
    }
    
    protected void B(final f f, final int n, int n2, int max) {
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(max);
        final int size2 = View$MeasureSpec.getSize(max);
        final int max2 = Math.max(0, this.getPaddingTop());
        final int max3 = Math.max(0, this.getPaddingBottom());
        final int n3 = max2 + max3;
        final int paddingWidth = this.getPaddingWidth();
        this.f0.c(n2, max, max2, max3, paddingWidth, n3);
        if (Build$VERSION.SDK_INT >= 17) {
            n2 = Math.max(0, this.getPaddingStart());
            max = Math.max(0, this.getPaddingEnd());
            if (n2 <= 0 && max <= 0) {
                n2 = Math.max(0, this.getPaddingLeft());
            }
            else if (this.w()) {
                n2 = max;
            }
        }
        else {
            n2 = Math.max(0, this.getPaddingLeft());
        }
        max = size - paddingWidth;
        final int n4 = size2 - n3;
        this.E(f, mode, max, mode2, n4);
        f.K2(n, mode, max, mode2, n4, this.T, this.U, n2, max2);
    }
    
    public void D(int i, final Object o, final Object o2) {
        if (i == 0 && o instanceof String && o2 instanceof Integer) {
            if (this.S == null) {
                this.S = new HashMap<String, Integer>();
            }
            final String s = (String)o;
            i = s.indexOf("/");
            String substring = s;
            if (i != -1) {
                substring = s.substring(i + 1);
            }
            i = (int)o2;
            this.S.put(substring, i);
        }
    }
    
    protected void E(final f f, final int n, int b, final int n2, int b2) {
        final c f2 = this.f0;
        final int e = f2.e;
        final int d = f2.d;
        androidx.constraintlayout.core.widgets.e.b b3 = androidx.constraintlayout.core.widgets.e.b.G;
        final int childCount = this.getChildCount();
        androidx.constraintlayout.core.widgets.e.b b4 = null;
        Label_0125: {
            Label_0116: {
                if (n != Integer.MIN_VALUE) {
                    if (n != 0) {
                        if (n == 1073741824) {
                            b = Math.min(this.L - d, b);
                            b4 = b3;
                            break Label_0125;
                        }
                        b4 = b3;
                    }
                    else {
                        final androidx.constraintlayout.core.widgets.e.b b5 = b4 = androidx.constraintlayout.core.widgets.e.b.H;
                        if (childCount == 0) {
                            b4 = b5;
                            break Label_0116;
                        }
                    }
                    b = 0;
                    break Label_0125;
                }
                final androidx.constraintlayout.core.widgets.e.b b6 = b4 = androidx.constraintlayout.core.widgets.e.b.H;
                if (childCount != 0) {
                    break Label_0125;
                }
                b4 = b6;
            }
            b = Math.max(0, this.J);
        }
        Label_0218: {
            Label_0208: {
                if (n2 != Integer.MIN_VALUE) {
                    if (n2 != 0) {
                        if (n2 == 1073741824) {
                            b2 = Math.min(this.M - e, b2);
                            break Label_0218;
                        }
                    }
                    else {
                        final androidx.constraintlayout.core.widgets.e.b b7 = b3 = androidx.constraintlayout.core.widgets.e.b.H;
                        if (childCount == 0) {
                            b3 = b7;
                            break Label_0208;
                        }
                    }
                    b2 = 0;
                    break Label_0218;
                }
                final androidx.constraintlayout.core.widgets.e.b b8 = b3 = androidx.constraintlayout.core.widgets.e.b.H;
                if (childCount != 0) {
                    break Label_0218;
                }
                b3 = b8;
            }
            b2 = Math.max(0, this.K);
        }
        if (b != f.j0() || b2 != f.D()) {
            f.G2();
        }
        f.Z1(0);
        f.a2(0);
        f.G1(this.L - d);
        f.F1(this.M - e);
        f.J1(0);
        f.I1(0);
        f.x1(b4);
        f.W1(b);
        f.S1(b3);
        f.s1(b2);
        f.J1(this.J - d);
        f.I1(this.K - e);
    }
    
    public void F(final int n, final int n2, final int n3) {
        final androidx.constraintlayout.widget.c q = this.Q;
        if (q != null) {
            q.e(n, (float)n2, (float)n3);
        }
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return viewGroup$LayoutParams instanceof b;
    }
    
    protected void dispatchDraw(final Canvas canvas) {
        final ArrayList<androidx.constraintlayout.widget.b> h = this.H;
        if (h != null) {
            final int size = h.size();
            if (size > 0) {
                for (int i = 0; i < size; ++i) {
                    this.H.get(i).F(this);
                }
            }
        }
        super.dispatchDraw(canvas);
        if (this.isInEditMode()) {
            final float n = (float)this.getWidth();
            final float n2 = (float)this.getHeight();
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                final View child = this.getChildAt(j);
                if (child.getVisibility() != 8) {
                    final Object tag = child.getTag();
                    if (tag != null && tag instanceof String) {
                        final String[] split = ((String)tag).split(",");
                        if (split.length == 4) {
                            final int int1 = Integer.parseInt(split[0]);
                            final int int2 = Integer.parseInt(split[1]);
                            final int int3 = Integer.parseInt(split[2]);
                            final int int4 = Integer.parseInt(split[3]);
                            final int n3 = (int)(int1 / 1080.0f * n);
                            final int n4 = (int)(int2 / 1920.0f * n2);
                            final int n5 = (int)(int3 / 1080.0f * n);
                            final int n6 = (int)(int4 / 1920.0f * n2);
                            final Paint paint = new Paint();
                            paint.setColor(-65536);
                            final float n7 = (float)n3;
                            final float n8 = (float)n4;
                            final float n9 = (float)(n3 + n5);
                            canvas.drawLine(n7, n8, n9, n8, paint);
                            final float n10 = (float)(n4 + n6);
                            canvas.drawLine(n9, n8, n9, n10, paint);
                            canvas.drawLine(n9, n10, n7, n10, paint);
                            canvas.drawLine(n7, n10, n7, n8, paint);
                            paint.setColor(-16711936);
                            canvas.drawLine(n7, n8, n9, n10, paint);
                            canvas.drawLine(n7, n10, n9, n8, paint);
                        }
                    }
                }
            }
        }
    }
    
    public void forceLayout() {
        this.y();
        super.forceLayout();
    }
    
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new b(viewGroup$LayoutParams);
    }
    
    public int getMaxHeight() {
        return this.M;
    }
    
    public int getMaxWidth() {
        return this.L;
    }
    
    public int getMinHeight() {
        return this.K;
    }
    
    public int getMinWidth() {
        return this.J;
    }
    
    public int getOptimizationLevel() {
        return this.I.B2();
    }
    
    protected void h(final boolean b, final View view, final androidx.constraintlayout.core.widgets.e e, final b b2, final SparseArray<androidx.constraintlayout.core.widgets.e> sparseArray) {
        b2.e();
        b2.v0 = false;
        e.V1(view.getVisibility());
        if (b2.i0) {
            e.B1(true);
            e.V1(8);
        }
        e.b1(view);
        if (view instanceof androidx.constraintlayout.widget.b) {
            ((androidx.constraintlayout.widget.b)view).B(e, this.I.I2());
        }
        if (b2.g0) {
            final h h = (h)e;
            int n = b2.r0;
            int n2 = b2.s0;
            float n3 = b2.t0;
            if (Build$VERSION.SDK_INT < 17) {
                n = b2.a;
                n2 = b2.b;
                n3 = b2.c;
            }
            if (n3 != -1.0f) {
                h.s2(n3);
            }
            else if (n != -1) {
                h.q2(n);
            }
            else if (n2 != -1) {
                h.r2(n2);
            }
        }
        else {
            int k0 = b2.k0;
            int l0 = b2.l0;
            int n4 = b2.m0;
            int n5 = b2.n0;
            int o0 = b2.o0;
            int p5 = b2.p0;
            float n6 = b2.q0;
            Label_0469: {
                if (Build$VERSION.SDK_INT < 17) {
                    final int d = b2.d;
                    final int e2 = b2.e;
                    n4 = b2.f;
                    final int g = b2.g;
                    final int v = b2.v;
                    final int x = b2.x;
                    n6 = b2.F;
                    int s = d;
                    int n7 = e2;
                    if (d == -1) {
                        s = d;
                        if ((n7 = e2) == -1) {
                            s = b2.s;
                            if (s != -1) {
                                n7 = e2;
                            }
                            else {
                                final int r = b2.r;
                                s = d;
                                n7 = e2;
                                if (r != -1) {
                                    n7 = r;
                                    s = d;
                                }
                            }
                        }
                    }
                    if (n4 == -1 && g == -1) {
                        final int t = b2.t;
                        if (t != -1) {
                            n4 = t;
                        }
                        else {
                            final int u = b2.u;
                            if (u != -1) {
                                final int n8 = x;
                                final int n9 = v;
                                n5 = u;
                                k0 = s;
                                l0 = n7;
                                o0 = n9;
                                p5 = n8;
                                break Label_0469;
                            }
                        }
                    }
                    final int n10 = x;
                    final int n11 = v;
                    n5 = g;
                    k0 = s;
                    l0 = n7;
                    o0 = n11;
                    p5 = n10;
                }
            }
            final int o2 = b2.o;
            if (o2 != -1) {
                final androidx.constraintlayout.core.widgets.e e3 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(o2);
                if (e3 != null) {
                    e.m(e3, b2.q, b2.p);
                }
            }
            else {
                Label_0608: {
                    androidx.constraintlayout.core.widgets.e e4;
                    d.b b3;
                    int n12;
                    Enum<d.b> h2;
                    if (k0 != -1) {
                        e4 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(k0);
                        if (e4 == null) {
                            break Label_0608;
                        }
                        b3 = d.b.H;
                        n12 = b2.leftMargin;
                        h2 = b3;
                    }
                    else {
                        if (l0 == -1) {
                            break Label_0608;
                        }
                        e4 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(l0);
                        if (e4 == null) {
                            break Label_0608;
                        }
                        h2 = d.b.H;
                        b3 = d.b.J;
                        n12 = b2.leftMargin;
                    }
                    e.s0((d.b)h2, e4, b3, n12, o0);
                }
                Label_0701: {
                    androidx.constraintlayout.core.widgets.e e5;
                    Enum<d.b> j;
                    d.b b4;
                    int n13;
                    if (n4 != -1) {
                        e5 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(n4);
                        if (e5 == null) {
                            break Label_0701;
                        }
                        j = d.b.J;
                        b4 = d.b.H;
                        n13 = b2.rightMargin;
                    }
                    else {
                        if (n5 == -1) {
                            break Label_0701;
                        }
                        e5 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(n5);
                        if (e5 == null) {
                            break Label_0701;
                        }
                        b4 = d.b.J;
                        n13 = b2.rightMargin;
                        j = b4;
                    }
                    e.s0((d.b)j, e5, b4, n13, p5);
                }
                final int h3 = b2.h;
                Label_0822: {
                    androidx.constraintlayout.core.widgets.e e6;
                    d.b b5;
                    int n14;
                    int n15;
                    Enum<d.b> i;
                    if (h3 != -1) {
                        e6 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(h3);
                        if (e6 == null) {
                            break Label_0822;
                        }
                        b5 = d.b.I;
                        n14 = b2.topMargin;
                        n15 = b2.w;
                        i = b5;
                    }
                    else {
                        final int m = b2.i;
                        if (m == -1) {
                            break Label_0822;
                        }
                        e6 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(m);
                        if (e6 == null) {
                            break Label_0822;
                        }
                        i = d.b.I;
                        b5 = d.b.K;
                        n14 = b2.topMargin;
                        n15 = b2.w;
                    }
                    e.s0((d.b)i, e6, b5, n14, n15);
                }
                final int j2 = b2.j;
                Label_0943: {
                    androidx.constraintlayout.core.widgets.e e7;
                    Enum<d.b> k2;
                    d.b b6;
                    int n16;
                    int n17;
                    if (j2 != -1) {
                        e7 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(j2);
                        if (e7 == null) {
                            break Label_0943;
                        }
                        k2 = d.b.K;
                        b6 = d.b.I;
                        n16 = b2.bottomMargin;
                        n17 = b2.y;
                    }
                    else {
                        final int k3 = b2.k;
                        if (k3 == -1) {
                            break Label_0943;
                        }
                        e7 = (androidx.constraintlayout.core.widgets.e)sparseArray.get(k3);
                        if (e7 == null) {
                            break Label_0943;
                        }
                        b6 = d.b.K;
                        n16 = b2.bottomMargin;
                        n17 = b2.y;
                        k2 = b6;
                    }
                    e.s0((d.b)k2, e7, b6, n16, n17);
                }
                int n18 = b2.l;
                Label_1015: {
                    d.b b7;
                    if (n18 != -1) {
                        b7 = d.b.L;
                    }
                    else {
                        n18 = b2.m;
                        if (n18 != -1) {
                            b7 = d.b.I;
                        }
                        else {
                            n18 = b2.n;
                            if (n18 == -1) {
                                break Label_1015;
                            }
                            b7 = d.b.K;
                        }
                    }
                    this.G(e, b2, sparseArray, n18, b7);
                }
                if (n6 >= 0.0f) {
                    e.u1(n6);
                }
                final float g2 = b2.G;
                if (g2 >= 0.0f) {
                    e.P1(g2);
                }
            }
            if (b) {
                final int w = b2.W;
                if (w != -1 || b2.X != -1) {
                    e.L1(w, b2.X);
                }
            }
            if (!b2.d0) {
                if (b2.width == -1) {
                    androidx.constraintlayout.core.widgets.e.b b8;
                    if (b2.Z) {
                        b8 = e.b.I;
                    }
                    else {
                        b8 = e.b.J;
                    }
                    e.x1(b8);
                    e.r(d.b.H).g = b2.leftMargin;
                    e.r(d.b.J).g = b2.rightMargin;
                }
                else {
                    e.x1(e.b.I);
                    e.W1(0);
                }
            }
            else {
                e.x1(e.b.G);
                e.W1(b2.width);
                if (b2.width == -2) {
                    e.x1(e.b.H);
                }
            }
            if (!b2.e0) {
                if (b2.height == -1) {
                    androidx.constraintlayout.core.widgets.e.b b9;
                    if (b2.a0) {
                        b9 = e.b.I;
                    }
                    else {
                        b9 = e.b.J;
                    }
                    e.S1(b9);
                    e.r(d.b.I).g = b2.topMargin;
                    e.r(d.b.K).g = b2.bottomMargin;
                }
                else {
                    e.S1(e.b.I);
                    e.s1(0);
                }
            }
            else {
                e.S1(e.b.G);
                e.s1(b2.height);
                if (b2.height == -2) {
                    e.S1(e.b.H);
                }
            }
            e.h1(b2.H);
            e.z1(b2.K);
            e.U1(b2.L);
            e.v1(b2.M);
            e.Q1(b2.N);
            e.Y1(b2.c0);
            e.y1(b2.O, b2.Q, b2.S, b2.U);
            e.T1(b2.P, b2.R, b2.T, b2.V);
        }
    }
    
    public void i(final androidx.constraintlayout.core.f e0) {
        this.e0 = e0;
        this.I.y2(e0);
    }
    
    protected b j() {
        return new b(-2, -2);
    }
    
    public b k(final AttributeSet set) {
        return new b(this.getContext(), set);
    }
    
    public Object l(final int n, final Object o) {
        if (n == 0 && o instanceof String) {
            final String s = (String)o;
            final HashMap<String, Integer> s2 = this.S;
            if (s2 != null && s2.containsKey(s)) {
                return this.S.get(s);
            }
        }
        return null;
    }
    
    public View n(final int n) {
        return (View)this.G.get(n);
    }
    
    public final androidx.constraintlayout.core.widgets.e o(final View view) {
        if (view == this) {
            return this.I;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof b)) {
                view.setLayoutParams(this.generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof b)) {
                    return null;
                }
            }
            return ((b)view.getLayoutParams()).u0;
        }
        return null;
    }
    
    protected void onLayout(final boolean b, int i, int n, int n2, int n3) {
        n2 = this.getChildCount();
        final boolean inEditMode = this.isInEditMode();
        n = 0;
        View child;
        b b2;
        androidx.constraintlayout.core.widgets.e u0;
        int l0;
        int m0;
        int n4;
        View content;
        for (i = 0; i < n2; ++i) {
            child = this.getChildAt(i);
            b2 = (b)child.getLayoutParams();
            u0 = b2.u0;
            if (child.getVisibility() != 8 || b2.g0 || b2.h0 || b2.j0 || inEditMode) {
                if (!b2.i0) {
                    l0 = u0.l0();
                    m0 = u0.m0();
                    n3 = u0.j0() + l0;
                    n4 = u0.D() + m0;
                    child.layout(l0, m0, n3, n4);
                    if (child instanceof i) {
                        content = ((i)child).getContent();
                        if (content != null) {
                            content.setVisibility(0);
                            content.layout(l0, m0, n3, n4);
                        }
                    }
                }
            }
        }
        n2 = this.H.size();
        if (n2 > 0) {
            for (i = n; i < n2; ++i) {
                this.H.get(i).D(this);
            }
        }
    }
    
    protected void onMeasure(final int g0, final int h0) {
        if (this.g0 == g0) {
            final int h2 = this.h0;
        }
        if (!this.N) {
            for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
                if (this.getChildAt(i).isLayoutRequested()) {
                    this.N = true;
                    break;
                }
            }
        }
        final boolean n = this.N;
        this.g0 = g0;
        this.h0 = h0;
        this.I.S2(this.w());
        if (this.N) {
            this.N = false;
            if (this.H()) {
                this.I.U2();
            }
        }
        this.B(this.I, this.O, g0, h0);
        this.A(g0, h0, this.I.j0(), this.I.D(), this.I.J2(), this.I.H2());
    }
    
    public void onViewAdded(final View view) {
        super.onViewAdded(view);
        final androidx.constraintlayout.core.widgets.e o = this.o(view);
        if (view instanceof Guideline && !(o instanceof h)) {
            final b b = (b)view.getLayoutParams();
            final h u0 = new h();
            b.u0 = u0;
            b.g0 = true;
            u0.v2(b.Y);
        }
        if (view instanceof androidx.constraintlayout.widget.b) {
            final androidx.constraintlayout.widget.b b2 = (androidx.constraintlayout.widget.b)view;
            b2.I();
            ((b)view.getLayoutParams()).h0 = true;
            if (!this.H.contains(b2)) {
                this.H.add(b2);
            }
        }
        this.G.put(view.getId(), (Object)view);
        this.N = true;
    }
    
    public void onViewRemoved(final View o) {
        super.onViewRemoved(o);
        this.G.remove(o.getId());
        this.I.i2(this.o(o));
        this.H.remove(o);
        this.N = true;
    }
    
    public void requestLayout() {
        this.y();
        super.requestLayout();
    }
    
    public void setConstraintSet(final e p) {
        this.P = p;
    }
    
    public void setId(final int id) {
        this.G.remove(this.getId());
        super.setId(id);
        this.G.put(this.getId(), (Object)this);
    }
    
    public void setMaxHeight(final int m) {
        if (m == this.M) {
            return;
        }
        this.M = m;
        this.requestLayout();
    }
    
    public void setMaxWidth(final int l) {
        if (l == this.L) {
            return;
        }
        this.L = l;
        this.requestLayout();
    }
    
    public void setMinHeight(final int k) {
        if (k == this.K) {
            return;
        }
        this.K = k;
        this.requestLayout();
    }
    
    public void setMinWidth(final int j) {
        if (j == this.J) {
            return;
        }
        this.J = j;
        this.requestLayout();
    }
    
    public void setOnConstraintsChanged(final g d0) {
        this.d0 = d0;
        final androidx.constraintlayout.widget.c q = this.Q;
        if (q != null) {
            q.d(d0);
        }
    }
    
    public void setOptimizationLevel(final int o) {
        this.O = o;
        this.I.P2(o);
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    protected boolean w() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b2;
        final boolean b = b2 = false;
        if (sdk_INT >= 17) {
            final boolean b3 = (this.getContext().getApplicationInfo().flags & 0x400000) != 0x0;
            b2 = b;
            if (b3) {
                b2 = b;
                if (1 == this.getLayoutDirection()) {
                    b2 = true;
                }
            }
        }
        return b2;
    }
    
    public void x(final int n) {
        while (true) {
            if (n == 0) {
                break Label_0026;
            }
            try {
                this.Q = new androidx.constraintlayout.widget.c(this.getContext(), this, n);
                return;
                this.Q = null;
            }
            catch (Resources$NotFoundException ex) {
                continue;
            }
            break;
        }
    }
    
    protected void z(final int n) {
        this.Q = new androidx.constraintlayout.widget.c(this.getContext(), this, n);
    }
    
    public static class b extends ViewGroup$MarginLayoutParams
    {
        public static final int A0 = 0;
        public static final int B0 = 1;
        public static final int C0 = 1;
        public static final int D0 = 2;
        public static final int E0 = 3;
        public static final int F0 = 4;
        public static final int G0 = 5;
        public static final int H0 = 6;
        public static final int I0 = 7;
        public static final int J0 = 8;
        public static final int K0 = 1;
        public static final int L0 = 0;
        public static final int M0 = 2;
        public static final int N0 = 0;
        public static final int O0 = 1;
        public static final int P0 = 2;
        public static final int Q0 = 0;
        public static final int R0 = 1;
        public static final int S0 = 2;
        public static final int T0 = 3;
        public static final int w0 = 0;
        public static final int x0 = 0;
        public static final int y0 = -1;
        public static final int z0 = Integer.MIN_VALUE;
        public int A;
        public int B;
        public int C;
        boolean D;
        boolean E;
        public float F;
        public float G;
        public String H;
        float I;
        int J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public int P;
        public int Q;
        public int R;
        public int S;
        public int T;
        public float U;
        public float V;
        public int W;
        public int X;
        public int Y;
        public boolean Z;
        public int a;
        public boolean a0;
        public int b;
        public String b0;
        public float c;
        public int c0;
        public int d;
        boolean d0;
        public int e;
        boolean e0;
        public int f;
        boolean f0;
        public int g;
        boolean g0;
        public int h;
        boolean h0;
        public int i;
        boolean i0;
        public int j;
        boolean j0;
        public int k;
        int k0;
        public int l;
        int l0;
        public int m;
        int m0;
        public int n;
        int n0;
        public int o;
        int o0;
        public int p;
        int p0;
        public float q;
        float q0;
        public int r;
        int r0;
        public int s;
        int s0;
        public int t;
        float t0;
        public int u;
        androidx.constraintlayout.core.widgets.e u0;
        public int v;
        public boolean v0;
        public int w;
        public int x;
        public int y;
        public int z;
        
        public b(final int n, final int n2) {
            super(n, n2);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new androidx.constraintlayout.core.widgets.e();
            this.v0 = false;
        }
        
        public b(final Context context, AttributeSet obtainStyledAttributes) {
            super(context, obtainStyledAttributes);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new androidx.constraintlayout.core.widgets.e();
            this.v0 = false;
            obtainStyledAttributes = (AttributeSet)context.obtainStyledAttributes(obtainStyledAttributes, j.m.t6);
            for (int indexCount = ((TypedArray)obtainStyledAttributes).getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = ((TypedArray)obtainStyledAttributes).getIndex(i);
                final int value = a.h0.get(index);
                String s = null;
                switch (value) {
                    default: {
                        switch (value) {
                            default: {
                                switch (value) {
                                    default: {
                                        continue;
                                    }
                                    case 66: {
                                        this.c0 = ((TypedArray)obtainStyledAttributes).getInt(index, this.c0);
                                        continue;
                                    }
                                    case 65: {
                                        e.A0(this, (TypedArray)obtainStyledAttributes, index, 1);
                                        this.E = true;
                                        continue;
                                    }
                                    case 64: {
                                        e.A0(this, (TypedArray)obtainStyledAttributes, index, 0);
                                        this.D = true;
                                        continue;
                                    }
                                }
                                break;
                            }
                            case 55: {
                                this.B = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.B);
                                continue;
                            }
                            case 54: {
                                this.C = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.C);
                                continue;
                            }
                            case 53: {
                                final int resourceId = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.n);
                                this.n = resourceId;
                                if (resourceId == -1) {
                                    this.n = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                }
                                continue;
                            }
                            case 52: {
                                final int resourceId2 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.m);
                                this.m = resourceId2;
                                if (resourceId2 == -1) {
                                    this.m = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                                }
                                continue;
                            }
                            case 51: {
                                this.b0 = ((TypedArray)obtainStyledAttributes).getString(index);
                                continue;
                            }
                            case 50: {
                                this.X = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.X);
                                continue;
                            }
                            case 49: {
                                this.W = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.W);
                                continue;
                            }
                            case 48: {
                                this.N = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                continue;
                            }
                            case 47: {
                                this.M = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                                continue;
                            }
                            case 46: {
                                this.L = ((TypedArray)obtainStyledAttributes).getFloat(index, this.L);
                                continue;
                            }
                            case 45: {
                                this.K = ((TypedArray)obtainStyledAttributes).getFloat(index, this.K);
                                continue;
                            }
                            case 44: {
                                e.C0(this, ((TypedArray)obtainStyledAttributes).getString(index));
                                continue;
                            }
                        }
                        break;
                    }
                    case 38: {
                        this.V = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.V));
                        this.P = 2;
                        continue;
                    }
                    case 37: {
                        try {
                            this.T = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.T);
                        }
                        catch (Exception ex) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.T) == -2) {
                                this.T = -2;
                            }
                        }
                        continue;
                    }
                    case 36: {
                        try {
                            this.R = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.R);
                        }
                        catch (Exception ex2) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.R) == -2) {
                                this.R = -2;
                            }
                        }
                        continue;
                    }
                    case 35: {
                        this.U = Math.max(0.0f, ((TypedArray)obtainStyledAttributes).getFloat(index, this.U));
                        this.O = 2;
                        continue;
                    }
                    case 34: {
                        try {
                            this.S = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.S);
                        }
                        catch (Exception ex3) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.S) == -2) {
                                this.S = -2;
                            }
                        }
                        continue;
                    }
                    case 33: {
                        try {
                            this.Q = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.Q);
                        }
                        catch (Exception ex4) {
                            if (((TypedArray)obtainStyledAttributes).getInt(index, this.Q) == -2) {
                                this.Q = -2;
                            }
                        }
                        continue;
                    }
                    case 32: {
                        final int int1 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                        this.P = int1;
                        if (int1 == 1) {
                            s = "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.";
                            break;
                        }
                        continue;
                    }
                    case 31: {
                        final int int2 = ((TypedArray)obtainStyledAttributes).getInt(index, 0);
                        this.O = int2;
                        if (int2 == 1) {
                            s = "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.";
                            break;
                        }
                        continue;
                    }
                    case 30: {
                        this.G = ((TypedArray)obtainStyledAttributes).getFloat(index, this.G);
                        continue;
                    }
                    case 29: {
                        this.F = ((TypedArray)obtainStyledAttributes).getFloat(index, this.F);
                        continue;
                    }
                    case 28: {
                        this.a0 = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.a0);
                        continue;
                    }
                    case 27: {
                        this.Z = ((TypedArray)obtainStyledAttributes).getBoolean(index, this.Z);
                        continue;
                    }
                    case 26: {
                        this.A = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.A);
                        continue;
                    }
                    case 25: {
                        this.z = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.z);
                        continue;
                    }
                    case 24: {
                        this.y = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.y);
                        continue;
                    }
                    case 23: {
                        this.x = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.x);
                        continue;
                    }
                    case 22: {
                        this.w = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.w);
                        continue;
                    }
                    case 21: {
                        this.v = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.v);
                        continue;
                    }
                    case 20: {
                        final int resourceId3 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.u);
                        this.u = resourceId3;
                        if (resourceId3 == -1) {
                            this.u = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 19: {
                        final int resourceId4 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.t);
                        this.t = resourceId4;
                        if (resourceId4 == -1) {
                            this.t = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 18: {
                        final int resourceId5 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.s);
                        this.s = resourceId5;
                        if (resourceId5 == -1) {
                            this.s = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 17: {
                        final int resourceId6 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.r);
                        this.r = resourceId6;
                        if (resourceId6 == -1) {
                            this.r = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 16: {
                        final int resourceId7 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.l);
                        this.l = resourceId7;
                        if (resourceId7 == -1) {
                            this.l = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 15: {
                        final int resourceId8 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.k);
                        this.k = resourceId8;
                        if (resourceId8 == -1) {
                            this.k = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 14: {
                        final int resourceId9 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.j);
                        this.j = resourceId9;
                        if (resourceId9 == -1) {
                            this.j = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 13: {
                        final int resourceId10 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.i);
                        this.i = resourceId10;
                        if (resourceId10 == -1) {
                            this.i = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 12: {
                        final int resourceId11 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.h);
                        this.h = resourceId11;
                        if (resourceId11 == -1) {
                            this.h = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 11: {
                        final int resourceId12 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.g);
                        this.g = resourceId12;
                        if (resourceId12 == -1) {
                            this.g = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 10: {
                        final int resourceId13 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.f);
                        this.f = resourceId13;
                        if (resourceId13 == -1) {
                            this.f = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 9: {
                        final int resourceId14 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.e);
                        this.e = resourceId14;
                        if (resourceId14 == -1) {
                            this.e = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 8: {
                        final int resourceId15 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.d);
                        this.d = resourceId15;
                        if (resourceId15 == -1) {
                            this.d = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 7: {
                        this.c = ((TypedArray)obtainStyledAttributes).getFloat(index, this.c);
                        continue;
                    }
                    case 6: {
                        this.b = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.b);
                        continue;
                    }
                    case 5: {
                        this.a = ((TypedArray)obtainStyledAttributes).getDimensionPixelOffset(index, this.a);
                        continue;
                    }
                    case 4: {
                        final float q = ((TypedArray)obtainStyledAttributes).getFloat(index, this.q) % 360.0f;
                        this.q = q;
                        if (q < 0.0f) {
                            this.q = (360.0f - q) % 360.0f;
                        }
                        continue;
                    }
                    case 3: {
                        this.p = ((TypedArray)obtainStyledAttributes).getDimensionPixelSize(index, this.p);
                        continue;
                    }
                    case 2: {
                        final int resourceId16 = ((TypedArray)obtainStyledAttributes).getResourceId(index, this.o);
                        this.o = resourceId16;
                        if (resourceId16 == -1) {
                            this.o = ((TypedArray)obtainStyledAttributes).getInt(index, -1);
                        }
                        continue;
                    }
                    case 1: {
                        this.Y = ((TypedArray)obtainStyledAttributes).getInt(index, this.Y);
                        continue;
                    }
                }
                Log.e("ConstraintLayout", s);
            }
            ((TypedArray)obtainStyledAttributes).recycle();
            this.e();
        }
        
        public b(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new androidx.constraintlayout.core.widgets.e();
            this.v0 = false;
        }
        
        public b(final b b) {
            super((ViewGroup$MarginLayoutParams)b);
            this.a = -1;
            this.b = -1;
            this.c = -1.0f;
            this.d = -1;
            this.e = -1;
            this.f = -1;
            this.g = -1;
            this.h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = 0.0f;
            this.r = -1;
            this.s = -1;
            this.t = -1;
            this.u = -1;
            this.v = Integer.MIN_VALUE;
            this.w = Integer.MIN_VALUE;
            this.x = Integer.MIN_VALUE;
            this.y = Integer.MIN_VALUE;
            this.z = Integer.MIN_VALUE;
            this.A = Integer.MIN_VALUE;
            this.B = Integer.MIN_VALUE;
            this.C = 0;
            this.D = true;
            this.E = true;
            this.F = 0.5f;
            this.G = 0.5f;
            this.H = null;
            this.I = 0.0f;
            this.J = 1;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 0;
            this.N = 0;
            this.O = 0;
            this.P = 0;
            this.Q = 0;
            this.R = 0;
            this.S = 0;
            this.T = 0;
            this.U = 1.0f;
            this.V = 1.0f;
            this.W = -1;
            this.X = -1;
            this.Y = -1;
            this.Z = false;
            this.a0 = false;
            this.b0 = null;
            this.c0 = 0;
            this.d0 = true;
            this.e0 = true;
            this.f0 = false;
            this.g0 = false;
            this.h0 = false;
            this.i0 = false;
            this.j0 = false;
            this.k0 = -1;
            this.l0 = -1;
            this.m0 = -1;
            this.n0 = -1;
            this.o0 = Integer.MIN_VALUE;
            this.p0 = Integer.MIN_VALUE;
            this.q0 = 0.5f;
            this.u0 = new androidx.constraintlayout.core.widgets.e();
            this.v0 = false;
            this.a = b.a;
            this.b = b.b;
            this.c = b.c;
            this.d = b.d;
            this.e = b.e;
            this.f = b.f;
            this.g = b.g;
            this.h = b.h;
            this.i = b.i;
            this.j = b.j;
            this.k = b.k;
            this.l = b.l;
            this.m = b.m;
            this.n = b.n;
            this.o = b.o;
            this.p = b.p;
            this.q = b.q;
            this.r = b.r;
            this.s = b.s;
            this.t = b.t;
            this.u = b.u;
            this.v = b.v;
            this.w = b.w;
            this.x = b.x;
            this.y = b.y;
            this.z = b.z;
            this.A = b.A;
            this.B = b.B;
            this.C = b.C;
            this.F = b.F;
            this.G = b.G;
            this.H = b.H;
            this.I = b.I;
            this.J = b.J;
            this.K = b.K;
            this.L = b.L;
            this.M = b.M;
            this.N = b.N;
            this.Z = b.Z;
            this.a0 = b.a0;
            this.O = b.O;
            this.P = b.P;
            this.Q = b.Q;
            this.S = b.S;
            this.R = b.R;
            this.T = b.T;
            this.U = b.U;
            this.V = b.V;
            this.W = b.W;
            this.X = b.X;
            this.Y = b.Y;
            this.d0 = b.d0;
            this.e0 = b.e0;
            this.f0 = b.f0;
            this.g0 = b.g0;
            this.k0 = b.k0;
            this.l0 = b.l0;
            this.m0 = b.m0;
            this.n0 = b.n0;
            this.o0 = b.o0;
            this.p0 = b.p0;
            this.q0 = b.q0;
            this.b0 = b.b0;
            this.c0 = b.c0;
            this.u0 = b.u0;
            this.D = b.D;
            this.E = b.E;
        }
        
        public String a() {
            return this.b0;
        }
        
        public androidx.constraintlayout.core.widgets.e b() {
            return this.u0;
        }
        
        public void c() {
            final androidx.constraintlayout.core.widgets.e u0 = this.u0;
            if (u0 != null) {
                u0.N0();
            }
        }
        
        public void d(final String s) {
            this.u0.d1(s);
        }
        
        public void e() {
            this.g0 = false;
            this.d0 = true;
            this.e0 = true;
            final int width = super.width;
            if (width == -2 && this.Z) {
                this.d0 = false;
                if (this.O == 0) {
                    this.O = 1;
                }
            }
            final int height = super.height;
            if (height == -2 && this.a0) {
                this.e0 = false;
                if (this.P == 0) {
                    this.P = 1;
                }
            }
            if (width == 0 || width == -1) {
                this.d0 = false;
                if (width == 0 && this.O == 1) {
                    super.width = -2;
                    this.Z = true;
                }
            }
            if (height == 0 || height == -1) {
                this.e0 = false;
                if (height == 0 && this.P == 1) {
                    super.height = -2;
                    this.a0 = true;
                }
            }
            if (this.c != -1.0f || this.a != -1 || this.b != -1) {
                this.g0 = true;
                this.d0 = true;
                this.e0 = true;
                if (!(this.u0 instanceof h)) {
                    this.u0 = new h();
                }
                ((h)this.u0).v2(this.Y);
            }
        }
        
        @TargetApi(17)
        public void resolveLayoutDirection(int l0) {
            final int leftMargin = super.leftMargin;
            final int rightMargin = super.rightMargin;
            final int sdk_INT = Build$VERSION.SDK_INT;
            final int n = 0;
            Label_0045: {
                if (sdk_INT >= 17) {
                    super.resolveLayoutDirection(l0);
                    if (1 == this.getLayoutDirection()) {
                        l0 = 1;
                        break Label_0045;
                    }
                }
                l0 = 0;
            }
            this.m0 = -1;
            this.n0 = -1;
            this.k0 = -1;
            this.l0 = -1;
            this.o0 = -1;
            this.p0 = -1;
            this.o0 = this.v;
            this.p0 = this.x;
            final float f = this.F;
            this.q0 = f;
            final int a = this.a;
            this.r0 = a;
            final int b = this.b;
            this.s0 = b;
            final float c = this.c;
            this.t0 = c;
            Label_0459: {
                if (l0 != 0) {
                    l0 = this.r;
                    Label_0187: {
                        if (l0 != -1) {
                            this.m0 = l0;
                        }
                        else {
                            final int s = this.s;
                            l0 = n;
                            if (s == -1) {
                                break Label_0187;
                            }
                            this.n0 = s;
                        }
                        l0 = 1;
                    }
                    final int t = this.t;
                    if (t != -1) {
                        this.l0 = t;
                        l0 = 1;
                    }
                    final int u = this.u;
                    if (u != -1) {
                        this.k0 = u;
                        l0 = 1;
                    }
                    final int z = this.z;
                    if (z != Integer.MIN_VALUE) {
                        this.p0 = z;
                    }
                    final int a2 = this.A;
                    if (a2 != Integer.MIN_VALUE) {
                        this.o0 = a2;
                    }
                    if (l0 != 0) {
                        this.q0 = 1.0f - f;
                    }
                    if (this.g0 && this.Y == 1) {
                        if (c != -1.0f) {
                            this.t0 = 1.0f - c;
                            this.r0 = -1;
                            this.s0 = -1;
                        }
                        else {
                            if (a != -1) {
                                this.s0 = a;
                                this.r0 = -1;
                            }
                            else {
                                if (b == -1) {
                                    break Label_0459;
                                }
                                this.r0 = b;
                                this.s0 = -1;
                            }
                            this.t0 = -1.0f;
                        }
                    }
                }
                else {
                    l0 = this.r;
                    if (l0 != -1) {
                        this.l0 = l0;
                    }
                    l0 = this.s;
                    if (l0 != -1) {
                        this.k0 = l0;
                    }
                    l0 = this.t;
                    if (l0 != -1) {
                        this.m0 = l0;
                    }
                    l0 = this.u;
                    if (l0 != -1) {
                        this.n0 = l0;
                    }
                    l0 = this.z;
                    if (l0 != Integer.MIN_VALUE) {
                        this.o0 = l0;
                    }
                    l0 = this.A;
                    if (l0 != Integer.MIN_VALUE) {
                        this.p0 = l0;
                    }
                }
            }
            if (this.t == -1 && this.u == -1 && this.s == -1 && this.r == -1) {
                l0 = this.f;
                Label_0554: {
                    if (l0 != -1) {
                        this.m0 = l0;
                        if (super.rightMargin > 0 || rightMargin <= 0) {
                            break Label_0554;
                        }
                    }
                    else {
                        l0 = this.g;
                        if (l0 == -1) {
                            break Label_0554;
                        }
                        this.n0 = l0;
                        if (super.rightMargin > 0 || rightMargin <= 0) {
                            break Label_0554;
                        }
                    }
                    super.rightMargin = rightMargin;
                }
                l0 = this.d;
                if (l0 != -1) {
                    this.k0 = l0;
                    if (super.leftMargin > 0 || leftMargin <= 0) {
                        return;
                    }
                }
                else {
                    l0 = this.e;
                    if (l0 == -1) {
                        return;
                    }
                    this.l0 = l0;
                    if (super.leftMargin > 0 || leftMargin <= 0) {
                        return;
                    }
                }
                super.leftMargin = leftMargin;
            }
        }
        
        private static class a
        {
            public static final int A = 26;
            public static final int B = 27;
            public static final int C = 28;
            public static final int D = 29;
            public static final int E = 30;
            public static final int F = 31;
            public static final int G = 32;
            public static final int H = 33;
            public static final int I = 34;
            public static final int J = 35;
            public static final int K = 36;
            public static final int L = 37;
            public static final int M = 38;
            public static final int N = 39;
            public static final int O = 40;
            public static final int P = 41;
            public static final int Q = 42;
            public static final int R = 43;
            public static final int S = 44;
            public static final int T = 45;
            public static final int U = 46;
            public static final int V = 47;
            public static final int W = 48;
            public static final int X = 49;
            public static final int Y = 50;
            public static final int Z = 51;
            public static final int a = 0;
            public static final int a0 = 52;
            public static final int b = 1;
            public static final int b0 = 53;
            public static final int c = 2;
            public static final int c0 = 54;
            public static final int d = 3;
            public static final int d0 = 55;
            public static final int e = 4;
            public static final int e0 = 64;
            public static final int f = 5;
            public static final int f0 = 65;
            public static final int g = 6;
            public static final int g0 = 66;
            public static final int h = 7;
            public static final SparseIntArray h0;
            public static final int i = 8;
            public static final int j = 9;
            public static final int k = 10;
            public static final int l = 11;
            public static final int m = 12;
            public static final int n = 13;
            public static final int o = 14;
            public static final int p = 15;
            public static final int q = 16;
            public static final int r = 17;
            public static final int s = 18;
            public static final int t = 19;
            public static final int u = 20;
            public static final int v = 21;
            public static final int w = 22;
            public static final int x = 23;
            public static final int y = 24;
            public static final int z = 25;
            
            static {
                final SparseIntArray h = new SparseIntArray();
                (h0 = h).append(androidx.constraintlayout.widget.j.m.n8, 64);
                h.append(androidx.constraintlayout.widget.j.m.Q7, 65);
                h.append(androidx.constraintlayout.widget.j.m.Z7, 8);
                h.append(androidx.constraintlayout.widget.j.m.a8, 9);
                h.append(androidx.constraintlayout.widget.j.m.c8, 10);
                h.append(androidx.constraintlayout.widget.j.m.d8, 11);
                h.append(androidx.constraintlayout.widget.j.m.j8, 12);
                h.append(androidx.constraintlayout.widget.j.m.i8, 13);
                h.append(androidx.constraintlayout.widget.j.m.G7, 14);
                h.append(androidx.constraintlayout.widget.j.m.F7, 15);
                h.append(androidx.constraintlayout.widget.j.m.B7, 16);
                h.append(androidx.constraintlayout.widget.j.m.D7, 52);
                h.append(androidx.constraintlayout.widget.j.m.C7, 53);
                h.append(androidx.constraintlayout.widget.j.m.H7, 2);
                h.append(androidx.constraintlayout.widget.j.m.J7, 3);
                h.append(androidx.constraintlayout.widget.j.m.I7, 4);
                h.append(androidx.constraintlayout.widget.j.m.s8, 49);
                h.append(androidx.constraintlayout.widget.j.m.t8, 50);
                h.append(androidx.constraintlayout.widget.j.m.N7, 5);
                h.append(androidx.constraintlayout.widget.j.m.O7, 6);
                h.append(androidx.constraintlayout.widget.j.m.P7, 7);
                h.append(androidx.constraintlayout.widget.j.m.u6, 1);
                h.append(androidx.constraintlayout.widget.j.m.e8, 17);
                h.append(androidx.constraintlayout.widget.j.m.f8, 18);
                h.append(androidx.constraintlayout.widget.j.m.M7, 19);
                h.append(androidx.constraintlayout.widget.j.m.L7, 20);
                h.append(androidx.constraintlayout.widget.j.m.x8, 21);
                h.append(androidx.constraintlayout.widget.j.m.A8, 22);
                h.append(androidx.constraintlayout.widget.j.m.y8, 23);
                h.append(androidx.constraintlayout.widget.j.m.v8, 24);
                h.append(androidx.constraintlayout.widget.j.m.z8, 25);
                h.append(androidx.constraintlayout.widget.j.m.w8, 26);
                h.append(androidx.constraintlayout.widget.j.m.u8, 55);
                h.append(androidx.constraintlayout.widget.j.m.B8, 54);
                h.append(androidx.constraintlayout.widget.j.m.V7, 29);
                h.append(androidx.constraintlayout.widget.j.m.k8, 30);
                h.append(androidx.constraintlayout.widget.j.m.K7, 44);
                h.append(androidx.constraintlayout.widget.j.m.X7, 45);
                h.append(androidx.constraintlayout.widget.j.m.m8, 46);
                h.append(androidx.constraintlayout.widget.j.m.W7, 47);
                h.append(androidx.constraintlayout.widget.j.m.l8, 48);
                h.append(androidx.constraintlayout.widget.j.m.z7, 27);
                h.append(androidx.constraintlayout.widget.j.m.y7, 28);
                h.append(androidx.constraintlayout.widget.j.m.o8, 31);
                h.append(androidx.constraintlayout.widget.j.m.R7, 32);
                h.append(androidx.constraintlayout.widget.j.m.q8, 33);
                h.append(androidx.constraintlayout.widget.j.m.p8, 34);
                h.append(androidx.constraintlayout.widget.j.m.r8, 35);
                h.append(androidx.constraintlayout.widget.j.m.T7, 36);
                h.append(androidx.constraintlayout.widget.j.m.S7, 37);
                h.append(androidx.constraintlayout.widget.j.m.U7, 38);
                h.append(androidx.constraintlayout.widget.j.m.Y7, 39);
                h.append(androidx.constraintlayout.widget.j.m.h8, 40);
                h.append(androidx.constraintlayout.widget.j.m.b8, 41);
                h.append(androidx.constraintlayout.widget.j.m.E7, 42);
                h.append(androidx.constraintlayout.widget.j.m.A7, 43);
                h.append(androidx.constraintlayout.widget.j.m.g8, 51);
                h.append(androidx.constraintlayout.widget.j.m.D8, 66);
            }
        }
    }
    
    class c implements b.b
    {
        ConstraintLayout a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        
        public c(final ConstraintLayout a) {
            this.a = a;
        }
        
        private boolean d(int mode, int size, final int n) {
            if (mode == size) {
                return true;
            }
            final int mode2 = View$MeasureSpec.getMode(mode);
            View$MeasureSpec.getSize(mode);
            mode = View$MeasureSpec.getMode(size);
            size = View$MeasureSpec.getSize(size);
            return mode == 1073741824 && (mode2 == Integer.MIN_VALUE || mode2 == 0) && n == size;
        }
        
        @Override
        public final void a() {
            final int childCount = this.a.getChildCount();
            final int n = 0;
            for (int i = 0; i < childCount; ++i) {
                final View child = this.a.getChildAt(i);
                if (child instanceof i) {
                    ((i)child).b(this.a);
                }
            }
            final int size = this.a.H.size();
            if (size > 0) {
                for (int j = n; j < size; ++j) {
                    ((b)this.a.H.get(j)).E(this.a);
                }
            }
        }
        
        @SuppressLint({ "WrongCall" })
        @Override
        public final void b(final androidx.constraintlayout.core.widgets.e e, final b.a a) {
            if (e == null) {
                return;
            }
            if (e.i0() == 8 && !e.y0()) {
                a.e = 0;
                a.f = 0;
                a.g = 0;
                return;
            }
            if (e.U() == null) {
                return;
            }
            final androidx.constraintlayout.core.widgets.e.b a2 = a.a;
            final androidx.constraintlayout.core.widgets.e.b b = a.b;
            int n = a.c;
            final int d = a.d;
            final int n2 = this.b + this.c;
            int d2 = this.d;
            final View view = (View)e.w();
            final int[] a3 = ConstraintLayout$a.a;
            final int n3 = a3[a2.ordinal()];
            int n4 = 0;
            Label_0339: {
                Label_0330: {
                    if (n3 != 1) {
                        int n5;
                        int n6;
                        if (n3 != 2) {
                            if (n3 != 3) {
                                if (n3 != 4) {
                                    n4 = 0;
                                    break Label_0339;
                                }
                                final int childMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, d2, -2);
                                final boolean b2 = e.w == 1;
                                final int j = a.j;
                                if (j != androidx.constraintlayout.core.widgets.analyzer.b.a.l) {
                                    n4 = childMeasureSpec;
                                    if (j != androidx.constraintlayout.core.widgets.analyzer.b.a.m) {
                                        break Label_0339;
                                    }
                                }
                                final boolean b3 = view.getMeasuredHeight() == e.D();
                                final boolean b4 = a.j == androidx.constraintlayout.core.widgets.analyzer.b.a.m || !b2 || (b2 && b3) || view instanceof i || e.C0();
                                n4 = childMeasureSpec;
                                if (b4) {
                                    n = e.j0();
                                    break Label_0330;
                                }
                                break Label_0339;
                            }
                            else {
                                n5 = this.f;
                                d2 += e.I();
                                n6 = -1;
                            }
                        }
                        else {
                            n5 = this.f;
                            n6 = -2;
                        }
                        n4 = ViewGroup.getChildMeasureSpec(n5, d2, n6);
                        break Label_0339;
                    }
                }
                n4 = View$MeasureSpec.makeMeasureSpec(n, 1073741824);
            }
            final int n7 = a3[b.ordinal()];
            int d3 = d;
            int n8 = 0;
            Label_0596: {
                Label_0587: {
                    if (n7 != 1) {
                        int n9;
                        int n10;
                        int n11;
                        if (n7 != 2) {
                            if (n7 != 3) {
                                if (n7 != 4) {
                                    n8 = 0;
                                    break Label_0596;
                                }
                                final int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, n2, -2);
                                final boolean b5 = e.x == 1;
                                final int i = a.j;
                                if (i != androidx.constraintlayout.core.widgets.analyzer.b.a.l) {
                                    n8 = childMeasureSpec2;
                                    if (i != androidx.constraintlayout.core.widgets.analyzer.b.a.m) {
                                        break Label_0596;
                                    }
                                }
                                final boolean b6 = view.getMeasuredWidth() == e.j0();
                                final boolean b7 = a.j == androidx.constraintlayout.core.widgets.analyzer.b.a.m || !b5 || (b5 && b6) || view instanceof i || e.D0();
                                n8 = childMeasureSpec2;
                                if (b7) {
                                    d3 = e.D();
                                    break Label_0587;
                                }
                                break Label_0596;
                            }
                            else {
                                final int g = this.g;
                                n9 = n2 + e.h0();
                                n10 = -1;
                                n11 = g;
                            }
                        }
                        else {
                            final int g2 = this.g;
                            n10 = -2;
                            n9 = n2;
                            n11 = g2;
                        }
                        n8 = ViewGroup.getChildMeasureSpec(n11, n9, n10);
                        break Label_0596;
                    }
                }
                n8 = View$MeasureSpec.makeMeasureSpec(d3, 1073741824);
            }
            final f f = (f)e.U();
            if (f != null && androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.O, 256) && view.getMeasuredWidth() == e.j0() && view.getMeasuredWidth() < f.j0() && view.getMeasuredHeight() == e.D() && view.getMeasuredHeight() < f.D() && view.getBaseline() == e.t() && !e.B0() && (this.d(e.J(), n4, e.j0()) && this.d(e.K(), n8, e.D()))) {
                a.e = e.j0();
                a.f = e.D();
                a.g = e.t();
                return;
            }
            final androidx.constraintlayout.core.widgets.e.b k = androidx.constraintlayout.core.widgets.e.b.I;
            final boolean b8 = a2 == k;
            final boolean b9 = b == k;
            final androidx.constraintlayout.core.widgets.e.b l = androidx.constraintlayout.core.widgets.e.b.J;
            final boolean b10 = b == l || b == androidx.constraintlayout.core.widgets.e.b.G;
            final boolean b11 = a2 == l || a2 == androidx.constraintlayout.core.widgets.e.b.G;
            final boolean b12 = b8 && e.f0 > 0.0f;
            final boolean b13 = b9 && e.f0 > 0.0f;
            if (view == null) {
                return;
            }
            final ConstraintLayout.b b14 = (ConstraintLayout.b)view.getLayoutParams();
            final int m = a.j;
            int measuredHeight = 0;
            int baseline = 0;
            int measuredWidth = 0;
            Label_1373: {
                if (m != androidx.constraintlayout.core.widgets.analyzer.b.a.l && m != androidx.constraintlayout.core.widgets.analyzer.b.a.m && b8 && e.w == 0 && b9 && e.x == 0) {
                    measuredHeight = 0;
                    baseline = 0;
                    measuredWidth = 0;
                }
                else {
                    if (view instanceof n && e instanceof m) {
                        ((n)view).J((m)e, n4, n8);
                    }
                    else {
                        view.measure(n4, n8);
                    }
                    e.D1(n4, n8);
                    final int measuredWidth2 = view.getMeasuredWidth();
                    final int measuredHeight2 = view.getMeasuredHeight();
                    final int baseline2 = view.getBaseline();
                    final int z = e.z;
                    int max;
                    if (z > 0) {
                        max = Math.max(z, measuredWidth2);
                    }
                    else {
                        max = measuredWidth2;
                    }
                    final int a4 = e.A;
                    int min = max;
                    if (a4 > 0) {
                        min = Math.min(a4, max);
                    }
                    final int c = e.C;
                    int max2;
                    if (c > 0) {
                        max2 = Math.max(c, measuredHeight2);
                    }
                    else {
                        max2 = measuredHeight2;
                    }
                    final int d4 = e.D;
                    int min2 = max2;
                    if (d4 > 0) {
                        min2 = Math.min(d4, max2);
                    }
                    int n12 = min2;
                    int n13 = min;
                    if (!androidx.constraintlayout.core.widgets.k.b(ConstraintLayout.this.O, 1)) {
                        if (b12 && b10) {
                            n13 = (int)(min2 * e.f0 + 0.5f);
                            n12 = min2;
                        }
                        else {
                            n12 = min2;
                            n13 = min;
                            if (b13) {
                                n12 = min2;
                                n13 = min;
                                if (b11) {
                                    n12 = (int)(min / e.f0 + 0.5f);
                                    n13 = min;
                                }
                            }
                        }
                    }
                    Label_1297: {
                        if (measuredWidth2 != n13) {
                            break Label_1297;
                        }
                        measuredHeight = n12;
                        baseline = baseline2;
                        measuredWidth = n13;
                        if (measuredHeight2 != n12) {
                            break Label_1297;
                        }
                        break Label_1373;
                    }
                    if (measuredWidth2 != n13) {
                        n4 = View$MeasureSpec.makeMeasureSpec(n13, 1073741824);
                    }
                    if (measuredHeight2 != n12) {
                        n8 = View$MeasureSpec.makeMeasureSpec(n12, 1073741824);
                    }
                    view.measure(n4, n8);
                    e.D1(n4, n8);
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            boolean h = baseline != -1;
            a.i = (measuredWidth != a.c || measuredHeight != a.d);
            if (b14.f0) {
                h = true;
            }
            if (h && baseline != -1 && e.t() != baseline) {
                a.i = true;
            }
            a.e = measuredWidth;
            a.f = measuredHeight;
            a.h = h;
            a.g = baseline;
        }
        
        public void c(final int f, final int g, final int b, final int c, final int d, final int e) {
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
        }
    }
}
