// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListView;
import android.widget.PopupWindow$OnDismissListener;
import android.view.View$OnTouchListener;
import androidx.core.widget.p;
import android.view.KeyEvent$DispatcherState;
import android.view.KeyEvent;
import androidx.annotation.t0;
import android.view.View$MeasureSpec;
import android.view.ViewGroup$LayoutParams;
import android.widget.LinearLayout$LayoutParams;
import android.widget.LinearLayout;
import android.widget.AbsListView$OnScrollListener;
import android.widget.AdapterView;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import androidx.annotation.x0;
import androidx.annotation.f;
import androidx.annotation.k0;
import android.util.AttributeSet;
import c.a;
import androidx.annotation.j0;
import android.util.Log;
import android.os.Build$VERSION;
import android.widget.PopupWindow;
import android.graphics.Rect;
import android.os.Handler;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.AdapterView$OnItemClickListener;
import android.graphics.drawable.Drawable;
import android.database.DataSetObserver;
import android.view.View;
import android.widget.ListAdapter;
import android.content.Context;
import java.lang.reflect.Method;
import androidx.appcompat.view.menu.q;

public class f0 implements q
{
    private static final String m0 = "ListPopupWindow";
    private static final boolean n0 = false;
    static final int o0 = 250;
    private static Method p0;
    private static Method q0;
    private static Method r0;
    public static final int s0 = 0;
    public static final int t0 = 1;
    public static final int u0 = -1;
    public static final int v0 = -2;
    public static final int w0 = 0;
    public static final int x0 = 1;
    public static final int y0 = 2;
    private Context G;
    private ListAdapter H;
    c0 I;
    private int J;
    private int K;
    private int L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private boolean S;
    private boolean T;
    int U;
    private View V;
    private int W;
    private DataSetObserver X;
    private View Y;
    private Drawable Z;
    private AdapterView$OnItemClickListener a0;
    private AdapterView$OnItemSelectedListener b0;
    final h c0;
    private final g d0;
    private final f e0;
    private final d f0;
    private Runnable g0;
    final Handler h0;
    private final Rect i0;
    private Rect j0;
    private boolean k0;
    PopupWindow l0;
    
    static {
        if (Build$VERSION.SDK_INT <= 28) {
            try {
                f0.p0 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            }
            catch (NoSuchMethodException ex) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f0.r0 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            }
            catch (NoSuchMethodException ex2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build$VERSION.SDK_INT <= 23) {
            try {
                f0.q0 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            }
            catch (NoSuchMethodException ex3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }
    
    public f0(@j0 final Context context) {
        this(context, null, a.c.g2);
    }
    
    public f0(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.g2);
    }
    
    public f0(@j0 final Context context, @k0 final AttributeSet set, @androidx.annotation.f final int n) {
        this(context, set, n, 0);
    }
    
    public f0(@j0 final Context g, @k0 final AttributeSet set, @androidx.annotation.f final int n, @x0 final int n2) {
        this.J = -2;
        this.K = -2;
        this.N = 1002;
        this.R = 0;
        this.S = false;
        this.T = false;
        this.U = Integer.MAX_VALUE;
        this.W = 0;
        this.c0 = new h();
        this.d0 = new g();
        this.e0 = new f();
        this.f0 = new d();
        this.i0 = new Rect();
        this.G = g;
        this.h0 = new Handler(g.getMainLooper());
        final TypedArray obtainStyledAttributes = g.obtainStyledAttributes(set, a.n.c5, n, n2);
        this.L = obtainStyledAttributes.getDimensionPixelOffset(a.n.d5, 0);
        final int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(a.n.e5, 0);
        this.M = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.O = true;
        }
        obtainStyledAttributes.recycle();
        (this.l0 = new n(g, set, n, n2)).setInputMethodMode(1);
    }
    
    private int A(final View view, final int i, final boolean b) {
        if (Build$VERSION.SDK_INT <= 23) {
            final Method q0 = androidx.appcompat.widget.f0.q0;
            if (q0 != null) {
                try {
                    return (int)q0.invoke(this.l0, view, i, b);
                }
                catch (Exception ex) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            return this.l0.getMaxAvailableHeight(view, i);
        }
        return this.l0.getMaxAvailableHeight(view, i, b);
    }
    
    private static boolean I(final int n) {
        return n == 66 || n == 23;
    }
    
    private void R() {
        final View v = this.V;
        if (v != null) {
            final ViewParent parent = v.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup)parent).removeView(this.V);
            }
        }
    }
    
    private void i0(final boolean b) {
        if (Build$VERSION.SDK_INT <= 28) {
            final Method p = androidx.appcompat.widget.f0.p0;
            if (p != null) {
                try {
                    p.invoke(this.l0, b);
                }
                catch (Exception ex) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        }
        else {
            this.l0.setIsClippedToScreen(b);
        }
    }
    
    private int r() {
        final c0 i = this.I;
        int n = Integer.MIN_VALUE;
        boolean b = true;
        int n3;
        if (i == null) {
            final Context g = this.G;
            this.g0 = new Runnable() {
                @Override
                public void run() {
                    final View v = androidx.appcompat.widget.f0.this.v();
                    if (v != null && v.getWindowToken() != null) {
                        androidx.appcompat.widget.f0.this.a();
                    }
                }
            };
            final c0 u = this.u(g, this.k0 ^ true);
            this.I = u;
            final Drawable z = this.Z;
            if (z != null) {
                u.setSelector(z);
            }
            this.I.setAdapter(this.H);
            this.I.setOnItemClickListener(this.a0);
            this.I.setFocusable(true);
            this.I.setFocusableInTouchMode(true);
            this.I.setOnItemSelectedListener((AdapterView$OnItemSelectedListener)new AdapterView$OnItemSelectedListener() {
                public void onItemSelected(final AdapterView<?> adapterView, final View view, final int n, final long n2) {
                    if (n != -1) {
                        final c0 i = androidx.appcompat.widget.f0.this.I;
                        if (i != null) {
                            i.setListSelectionHidden(false);
                        }
                    }
                }
                
                public void onNothingSelected(final AdapterView<?> adapterView) {
                }
            });
            this.I.setOnScrollListener((AbsListView$OnScrollListener)this.e0);
            final AdapterView$OnItemSelectedListener b2 = this.b0;
            if (b2 != null) {
                this.I.setOnItemSelectedListener(b2);
            }
            final c0 j = this.I;
            final View v = this.V;
            Object contentView;
            if (v != null) {
                contentView = new LinearLayout(g);
                ((LinearLayout)contentView).setOrientation(1);
                final LinearLayout$LayoutParams linearLayout$LayoutParams = new LinearLayout$LayoutParams(-1, 0, 1.0f);
                final int w = this.W;
                if (w != 0) {
                    if (w != 1) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid hint position ");
                        sb.append(this.W);
                        Log.e("ListPopupWindow", sb.toString());
                    }
                    else {
                        ((LinearLayout)contentView).addView((View)j, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                        ((LinearLayout)contentView).addView(v);
                    }
                }
                else {
                    ((LinearLayout)contentView).addView(v);
                    ((LinearLayout)contentView).addView((View)j, (ViewGroup$LayoutParams)linearLayout$LayoutParams);
                }
                int k = this.K;
                int n2;
                if (k >= 0) {
                    n2 = Integer.MIN_VALUE;
                }
                else {
                    k = 0;
                    n2 = 0;
                }
                v.measure(View$MeasureSpec.makeMeasureSpec(k, n2), 0);
                final LinearLayout$LayoutParams linearLayout$LayoutParams2 = (LinearLayout$LayoutParams)v.getLayoutParams();
                n3 = v.getMeasuredHeight() + linearLayout$LayoutParams2.topMargin + linearLayout$LayoutParams2.bottomMargin;
            }
            else {
                n3 = 0;
                contentView = j;
            }
            this.l0.setContentView((View)contentView);
        }
        else {
            final ViewGroup viewGroup = (ViewGroup)this.l0.getContentView();
            final View v2 = this.V;
            if (v2 != null) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams3 = (LinearLayout$LayoutParams)v2.getLayoutParams();
                n3 = v2.getMeasuredHeight() + linearLayout$LayoutParams3.topMargin + linearLayout$LayoutParams3.bottomMargin;
            }
            else {
                n3 = 0;
            }
        }
        final Drawable background = this.l0.getBackground();
        int n5;
        if (background != null) {
            background.getPadding(this.i0);
            final Rect i2 = this.i0;
            final int top = i2.top;
            final int n4 = n5 = i2.bottom + top;
            if (!this.O) {
                this.M = -top;
                n5 = n4;
            }
        }
        else {
            this.i0.setEmpty();
            n5 = 0;
        }
        if (this.l0.getInputMethodMode() != 2) {
            b = false;
        }
        final int a = this.A(this.v(), this.M, b);
        if (!this.S && this.J != -1) {
            final int l = this.K;
            int n6 = 0;
            Label_0624: {
                if (l != -2) {
                    n = 1073741824;
                    if (l != -1) {
                        n6 = View$MeasureSpec.makeMeasureSpec(l, 1073741824);
                        break Label_0624;
                    }
                }
                final int widthPixels = this.G.getResources().getDisplayMetrics().widthPixels;
                final Rect i3 = this.i0;
                n6 = View$MeasureSpec.makeMeasureSpec(widthPixels - (i3.left + i3.right), n);
            }
            final int e = this.I.e(n6, 0, -1, a - n3, -1);
            int n7 = n3;
            if (e > 0) {
                n7 = n3 + (n5 + (this.I.getPaddingTop() + this.I.getPaddingBottom()));
            }
            return e + n7;
        }
        return a + n5;
    }
    
    public int B() {
        return this.W;
    }
    
    @k0
    public Object C() {
        if (!this.c()) {
            return null;
        }
        return this.I.getSelectedItem();
    }
    
    public long D() {
        if (!this.c()) {
            return Long.MIN_VALUE;
        }
        return this.I.getSelectedItemId();
    }
    
    public int E() {
        if (!this.c()) {
            return -1;
        }
        return this.I.getSelectedItemPosition();
    }
    
    @k0
    public View F() {
        if (!this.c()) {
            return null;
        }
        return this.I.getSelectedView();
    }
    
    public int G() {
        return this.l0.getSoftInputMode();
    }
    
    public int H() {
        return this.K;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public boolean J() {
        return this.S;
    }
    
    public boolean K() {
        return this.l0.getInputMethodMode() == 2;
    }
    
    public boolean L() {
        return this.k0;
    }
    
    public boolean M(final int n, @j0 final KeyEvent keyEvent) {
        if (this.c() && n != 62 && (this.I.getSelectedItemPosition() >= 0 || !I(n))) {
            final int selectedItemPosition = this.I.getSelectedItemPosition();
            final boolean b = this.l0.isAboveAnchor() ^ true;
            final ListAdapter h = this.H;
            int d = Integer.MAX_VALUE;
            int d2 = Integer.MIN_VALUE;
            if (h != null) {
                final boolean allItemsEnabled = h.areAllItemsEnabled();
                if (allItemsEnabled) {
                    d = 0;
                }
                else {
                    d = this.I.d(0, true);
                }
                if (allItemsEnabled) {
                    d2 = h.getCount() - 1;
                }
                else {
                    d2 = this.I.d(h.getCount() - 1, false);
                }
            }
            if ((b && n == 19 && selectedItemPosition <= d) || (!b && n == 20 && selectedItemPosition >= d2)) {
                this.s();
                this.l0.setInputMethodMode(1);
                this.a();
                return true;
            }
            this.I.setListSelectionHidden(false);
            if (this.I.onKeyDown(n, keyEvent)) {
                this.l0.setInputMethodMode(2);
                this.I.requestFocusFromTouch();
                this.a();
                if (n == 19 || n == 20 || n == 23 || n == 66) {
                    return true;
                }
            }
            else if (b && n == 20) {
                if (selectedItemPosition == d2) {
                    return true;
                }
            }
            else if (!b && n == 19 && selectedItemPosition == d) {
                return true;
            }
        }
        return false;
    }
    
    public boolean N(final int n, @j0 final KeyEvent keyEvent) {
        if (n == 4 && this.c()) {
            final View y = this.Y;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final KeyEvent$DispatcherState keyDispatcherState = y.getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, (Object)this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1) {
                final KeyEvent$DispatcherState keyDispatcherState2 = y.getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    this.dismiss();
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean O(final int n, @j0 final KeyEvent keyEvent) {
        if (this.c() && this.I.getSelectedItemPosition() >= 0) {
            final boolean onKeyUp = this.I.onKeyUp(n, keyEvent);
            if (onKeyUp && I(n)) {
                this.dismiss();
            }
            return onKeyUp;
        }
        return false;
    }
    
    public boolean P(final int n) {
        if (this.c()) {
            if (this.a0 != null) {
                final c0 i = this.I;
                this.a0.onItemClick((AdapterView)i, i.getChildAt(n - i.getFirstVisiblePosition()), n, i.getAdapter().getItemId(n));
            }
            return true;
        }
        return false;
    }
    
    public void Q() {
        this.h0.post(this.g0);
    }
    
    public void S(@k0 final View y) {
        this.Y = y;
    }
    
    public void T(@x0 final int animationStyle) {
        this.l0.setAnimationStyle(animationStyle);
    }
    
    public void U(final int n) {
        final Drawable background = this.l0.getBackground();
        if (background != null) {
            background.getPadding(this.i0);
            final Rect i0 = this.i0;
            this.K = i0.left + i0.right + n;
        }
        else {
            this.n0(n);
        }
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void V(final boolean s) {
        this.S = s;
    }
    
    public void W(final int r) {
        this.R = r;
    }
    
    public void X(@k0 Rect j0) {
        if (j0 != null) {
            j0 = new Rect(j0);
        }
        else {
            j0 = null;
        }
        this.j0 = j0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void Y(final boolean t) {
        this.T = t;
    }
    
    public void Z(final int j) {
        if (j < 0 && -2 != j && -1 != j) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.J = j;
    }
    
    @Override
    public void a() {
        int r = this.r();
        final boolean k = this.K();
        p.d(this.l0, this.N);
        final boolean showing = this.l0.isShowing();
        boolean outsideTouchable = true;
        if (showing) {
            if (!androidx.core.view.j0.N0(this.v())) {
                return;
            }
            final int i = this.K;
            int width;
            if (i == -1) {
                width = -1;
            }
            else if ((width = i) == -2) {
                width = this.v().getWidth();
            }
            final int j = this.J;
            if (j == -1) {
                if (!k) {
                    r = -1;
                }
                if (k) {
                    final PopupWindow l0 = this.l0;
                    int width2;
                    if (this.K == -1) {
                        width2 = -1;
                    }
                    else {
                        width2 = 0;
                    }
                    l0.setWidth(width2);
                    this.l0.setHeight(0);
                }
                else {
                    final PopupWindow l2 = this.l0;
                    int width3;
                    if (this.K == -1) {
                        width3 = -1;
                    }
                    else {
                        width3 = 0;
                    }
                    l2.setWidth(width3);
                    this.l0.setHeight(-1);
                }
            }
            else if (j != -2) {
                r = j;
            }
            final PopupWindow l3 = this.l0;
            if (this.T || this.S) {
                outsideTouchable = false;
            }
            l3.setOutsideTouchable(outsideTouchable);
            final PopupWindow l4 = this.l0;
            final View v = this.v();
            final int m = this.L;
            final int m2 = this.M;
            if (width < 0) {
                width = -1;
            }
            if (r < 0) {
                r = -1;
            }
            l4.update(v, m, m2, width, r);
        }
        else {
            final int k2 = this.K;
            int width4;
            if (k2 == -1) {
                width4 = -1;
            }
            else if ((width4 = k2) == -2) {
                width4 = this.v().getWidth();
            }
            final int j2 = this.J;
            if (j2 == -1) {
                r = -1;
            }
            else if (j2 != -2) {
                r = j2;
            }
            this.l0.setWidth(width4);
            this.l0.setHeight(r);
            this.i0(true);
            this.l0.setOutsideTouchable(!this.T && !this.S);
            this.l0.setTouchInterceptor((View$OnTouchListener)this.d0);
            if (this.Q) {
                p.c(this.l0, this.P);
            }
            if (Build$VERSION.SDK_INT <= 28) {
                final Method r2 = androidx.appcompat.widget.f0.r0;
                if (r2 != null) {
                    try {
                        r2.invoke(this.l0, this.j0);
                    }
                    catch (Exception ex) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", (Throwable)ex);
                    }
                }
            }
            else {
                this.l0.setEpicenterBounds(this.j0);
            }
            p.e(this.l0, this.v(), this.L, this.M, this.R);
            this.I.setSelection(-1);
            if (!this.k0 || this.I.isInTouchMode()) {
                this.s();
            }
            if (!this.k0) {
                this.h0.post((Runnable)this.f0);
            }
        }
    }
    
    public void a0(final int inputMethodMode) {
        this.l0.setInputMethodMode(inputMethodMode);
    }
    
    public void b(@k0 final Drawable backgroundDrawable) {
        this.l0.setBackgroundDrawable(backgroundDrawable);
    }
    
    void b0(final int u) {
        this.U = u;
    }
    
    @Override
    public boolean c() {
        return this.l0.isShowing();
    }
    
    public void c0(final Drawable z) {
        this.Z = z;
    }
    
    public int d() {
        return this.L;
    }
    
    public void d0(final boolean b) {
        this.k0 = b;
        this.l0.setFocusable(b);
    }
    
    @Override
    public void dismiss() {
        this.l0.dismiss();
        this.R();
        this.l0.setContentView((View)null);
        this.I = null;
        this.h0.removeCallbacks((Runnable)this.c0);
    }
    
    public void e0(@k0 final PopupWindow$OnDismissListener onDismissListener) {
        this.l0.setOnDismissListener(onDismissListener);
    }
    
    public void f(final int l) {
        this.L = l;
    }
    
    public void f0(@k0 final AdapterView$OnItemClickListener a0) {
        this.a0 = a0;
    }
    
    public void g0(@k0 final AdapterView$OnItemSelectedListener b0) {
        this.b0 = b0;
    }
    
    @t0({ androidx.annotation.t0.a.I })
    public void h0(final boolean p) {
        this.Q = true;
        this.P = p;
    }
    
    @k0
    public Drawable i() {
        return this.l0.getBackground();
    }
    
    public void j0(final int w) {
        this.W = w;
    }
    
    public void k(final int m) {
        this.M = m;
        this.O = true;
    }
    
    public void k0(@k0 final View v) {
        final boolean c = this.c();
        if (c) {
            this.R();
        }
        this.V = v;
        if (c) {
            this.a();
        }
    }
    
    @k0
    @Override
    public ListView l() {
        return this.I;
    }
    
    public void l0(final int selection) {
        final c0 i = this.I;
        if (this.c() && i != null) {
            i.setListSelectionHidden(false);
            i.setSelection(selection);
            if (i.getChoiceMode() != 0) {
                i.setItemChecked(selection, true);
            }
        }
    }
    
    public void m0(final int softInputMode) {
        this.l0.setSoftInputMode(softInputMode);
    }
    
    public void n0(final int k) {
        this.K = k;
    }
    
    public int o() {
        if (!this.O) {
            return 0;
        }
        return this.M;
    }
    
    public void o0(final int n) {
        this.N = n;
    }
    
    public void q(@k0 final ListAdapter h) {
        final DataSetObserver x = this.X;
        if (x == null) {
            this.X = new e();
        }
        else {
            final ListAdapter h2 = this.H;
            if (h2 != null) {
                h2.unregisterDataSetObserver(x);
            }
        }
        if ((this.H = h) != null) {
            h.registerDataSetObserver(this.X);
        }
        final c0 i = this.I;
        if (i != null) {
            i.setAdapter(this.H);
        }
    }
    
    public void s() {
        final c0 i = this.I;
        if (i != null) {
            i.setListSelectionHidden(true);
            i.requestLayout();
        }
    }
    
    public View$OnTouchListener t(final View view) {
        return (View$OnTouchListener)new e0(view) {
            public f0 k() {
                return androidx.appcompat.widget.f0.this;
            }
        };
    }
    
    @j0
    c0 u(final Context context, final boolean b) {
        return new c0(context, b);
    }
    
    @k0
    public View v() {
        return this.Y;
    }
    
    @x0
    public int w() {
        return this.l0.getAnimationStyle();
    }
    
    @k0
    public Rect x() {
        Rect rect;
        if (this.j0 != null) {
            rect = new Rect(this.j0);
        }
        else {
            rect = null;
        }
        return rect;
    }
    
    public int y() {
        return this.J;
    }
    
    public int z() {
        return this.l0.getInputMethodMode();
    }
    
    private class d implements Runnable
    {
        d() {
        }
        
        @Override
        public void run() {
            androidx.appcompat.widget.f0.this.s();
        }
    }
    
    private class e extends DataSetObserver
    {
        e() {
        }
        
        public void onChanged() {
            if (androidx.appcompat.widget.f0.this.c()) {
                androidx.appcompat.widget.f0.this.a();
            }
        }
        
        public void onInvalidated() {
            androidx.appcompat.widget.f0.this.dismiss();
        }
    }
    
    private class f implements AbsListView$OnScrollListener
    {
        f() {
        }
        
        public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
        }
        
        public void onScrollStateChanged(final AbsListView absListView, final int n) {
            if (n == 1 && !androidx.appcompat.widget.f0.this.K() && androidx.appcompat.widget.f0.this.l0.getContentView() != null) {
                final f0 a = androidx.appcompat.widget.f0.this;
                a.h0.removeCallbacks((Runnable)a.c0);
                androidx.appcompat.widget.f0.this.c0.run();
            }
        }
    }
    
    private class g implements View$OnTouchListener
    {
        g() {
        }
        
        public boolean onTouch(final View view, final MotionEvent motionEvent) {
            final int action = motionEvent.getAction();
            final int n = (int)motionEvent.getX();
            final int n2 = (int)motionEvent.getY();
            if (action == 0) {
                final PopupWindow l0 = androidx.appcompat.widget.f0.this.l0;
                if (l0 != null && l0.isShowing() && n >= 0 && n < androidx.appcompat.widget.f0.this.l0.getWidth() && n2 >= 0 && n2 < androidx.appcompat.widget.f0.this.l0.getHeight()) {
                    final f0 g = androidx.appcompat.widget.f0.this;
                    g.h0.postDelayed((Runnable)g.c0, 250L);
                    return false;
                }
            }
            if (action == 1) {
                final f0 g2 = androidx.appcompat.widget.f0.this;
                g2.h0.removeCallbacks((Runnable)g2.c0);
            }
            return false;
        }
    }
    
    private class h implements Runnable
    {
        h() {
        }
        
        @Override
        public void run() {
            final c0 i = androidx.appcompat.widget.f0.this.I;
            if (i != null && androidx.core.view.j0.N0((View)i) && androidx.appcompat.widget.f0.this.I.getCount() > androidx.appcompat.widget.f0.this.I.getChildCount()) {
                final int childCount = androidx.appcompat.widget.f0.this.I.getChildCount();
                final f0 g = androidx.appcompat.widget.f0.this;
                if (childCount <= g.U) {
                    g.l0.setInputMethodMode(2);
                    androidx.appcompat.widget.f0.this.a();
                }
            }
        }
    }
}
