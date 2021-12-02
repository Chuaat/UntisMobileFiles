// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.button;

import com.google.android.material.internal.b0;
import androidx.annotation.h;
import android.view.accessibility.AccessibilityNodeInfo;
import android.graphics.Canvas;
import androidx.core.view.accessibility.d;
import android.util.Log;
import androidx.annotation.b1;
import com.google.android.material.shape.o;
import android.text.TextUtils$TruncateAt;
import java.util.Iterator;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import androidx.core.view.n;
import java.util.TreeMap;
import android.content.res.TypedArray;
import com.google.android.material.internal.t;
import android.view.View;
import java.util.ArrayList;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;
import androidx.annotation.y;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import android.widget.LinearLayout;

public class MaterialButtonToggleGroup extends LinearLayout
{
    private static final String Q;
    private static final int R;
    private final List<d> G;
    private final c H;
    private final f I;
    private final LinkedHashSet<e> J;
    private final Comparator<MaterialButton> K;
    private Integer[] L;
    private boolean M;
    private boolean N;
    private boolean O;
    @y
    private int P;
    
    static {
        Q = MaterialButtonToggleGroup.class.getSimpleName();
        R = a.n.Db;
    }
    
    public MaterialButtonToggleGroup(@j0 final Context context) {
        this(context, null);
    }
    
    public MaterialButtonToggleGroup(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.w9);
    }
    
    public MaterialButtonToggleGroup(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        final int r = MaterialButtonToggleGroup.R;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, r), set, n);
        this.G = new ArrayList<d>();
        this.H = new c();
        this.I = new f();
        this.J = new LinkedHashSet<e>();
        this.K = new Comparator<MaterialButton>() {
            public int a(final MaterialButton materialButton, final MaterialButton materialButton2) {
                final int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                final int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                return Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild((View)materialButton)).compareTo(MaterialButtonToggleGroup.this.indexOfChild((View)materialButton2));
            }
        };
        this.M = false;
        final TypedArray j = t.j(this.getContext(), set, a.o.Ok, n, r, new int[0]);
        this.setSingleSelection(j.getBoolean(a.o.Rk, false));
        this.P = j.getResourceId(a.o.Pk, -1);
        this.O = j.getBoolean(a.o.Qk, false);
        this.setChildrenDrawingOrderEnabled(true);
        j.recycle();
        androidx.core.view.j0.P1((View)this, 1);
    }
    
    private void A() {
        final TreeMap<MaterialButton, Object> treeMap = new TreeMap<MaterialButton, Object>(this.K);
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            treeMap.put(this.o(i), i);
        }
        this.L = treeMap.values().toArray(new Integer[0]);
    }
    
    private int getFirstVisibleChildIndex() {
        for (int childCount = this.getChildCount(), i = 0; i < childCount; ++i) {
            if (this.r(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private int getLastVisibleChildIndex() {
        for (int i = this.getChildCount() - 1; i >= 0; --i) {
            if (this.r(i)) {
                return i;
            }
        }
        return -1;
    }
    
    private int getVisibleButtonCount() {
        int i = 0;
        int n = 0;
        while (i < this.getChildCount()) {
            int n2 = n;
            if (this.getChildAt(i) instanceof MaterialButton) {
                n2 = n;
                if (this.r(i)) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    private void h() {
        final int firstVisibleChildIndex = this.getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < this.getChildCount(); ++i) {
            final MaterialButton o = this.o(i);
            final int min = Math.min(o.getStrokeWidth(), this.o(i - 1).getStrokeWidth());
            final LinearLayout$LayoutParams j = this.i((View)o);
            if (this.getOrientation() == 0) {
                n.g((ViewGroup$MarginLayoutParams)j, 0);
                n.h((ViewGroup$MarginLayoutParams)j, -min);
                j.topMargin = 0;
            }
            else {
                j.bottomMargin = 0;
                j.topMargin = -min;
                n.h((ViewGroup$MarginLayoutParams)j, 0);
            }
            o.setLayoutParams((ViewGroup$LayoutParams)j);
        }
        this.v(firstVisibleChildIndex);
    }
    
    @j0
    private LinearLayout$LayoutParams i(@j0 final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof LinearLayout$LayoutParams) {
            return (LinearLayout$LayoutParams)layoutParams;
        }
        return new LinearLayout$LayoutParams(layoutParams.width, layoutParams.height);
    }
    
    private void k(final int n, final boolean checked) {
        final MaterialButton materialButton = (MaterialButton)this.findViewById(n);
        if (materialButton != null) {
            materialButton.setChecked(checked);
        }
    }
    
    private void n(@y final int n, final boolean b) {
        final Iterator<e> iterator = this.J.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(this, n, b);
        }
    }
    
    private MaterialButton o(final int n) {
        return (MaterialButton)this.getChildAt(n);
    }
    
    private int p(@k0 final View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i = 0;
        int n = 0;
        while (i < this.getChildCount()) {
            if (this.getChildAt(i) == view) {
                return n;
            }
            int n2 = n;
            if (this.getChildAt(i) instanceof MaterialButton) {
                n2 = n;
                if (this.r(i)) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        return -1;
    }
    
    @k0
    private d q(final int n, final int n2, final int n3) {
        final d d = this.G.get(n);
        if (n2 == n3) {
            return d;
        }
        final boolean b = this.getOrientation() == 0;
        if (n == n2) {
            d d2;
            if (b) {
                d2 = MaterialButtonToggleGroup.d.e(d, (View)this);
            }
            else {
                d2 = MaterialButtonToggleGroup.d.f(d);
            }
            return d2;
        }
        if (n == n3) {
            d d3;
            if (b) {
                d3 = MaterialButtonToggleGroup.d.b(d, (View)this);
            }
            else {
                d3 = MaterialButtonToggleGroup.d.a(d);
            }
            return d3;
        }
        return null;
    }
    
    private boolean r(final int n) {
        return this.getChildAt(n).getVisibility() != 8;
    }
    
    private void setCheckedId(final int p) {
        this.n(this.P = p, true);
    }
    
    private void setGeneratedIdIfNeeded(@j0 final MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(androidx.core.view.j0.B());
        }
    }
    
    private void setupButtonChild(@j0 final MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils$TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.a((MaterialButton.b)this.H);
        materialButton.setOnPressedChangeListenerInternal((MaterialButton.c)this.I);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }
    
    private void v(final int n) {
        if (this.getChildCount() != 0) {
            if (n != -1) {
                final LinearLayout$LayoutParams linearLayout$LayoutParams = (LinearLayout$LayoutParams)this.o(n).getLayoutParams();
                if (this.getOrientation() == 1) {
                    linearLayout$LayoutParams.topMargin = 0;
                    linearLayout$LayoutParams.bottomMargin = 0;
                    return;
                }
                n.g((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                n.h((ViewGroup$MarginLayoutParams)linearLayout$LayoutParams, 0);
                linearLayout$LayoutParams.leftMargin = 0;
                linearLayout$LayoutParams.rightMargin = 0;
            }
        }
    }
    
    private void w(@y final int n, final boolean checked) {
        final View viewById = this.findViewById(n);
        if (viewById instanceof MaterialButton) {
            this.M = true;
            ((MaterialButton)viewById).setChecked(checked);
            this.M = false;
        }
    }
    
    private static void y(final o.b b, @k0 final d d) {
        if (d == null) {
            b.o(0.0f);
            return;
        }
        b.L(d.a).y(d.d).Q(d.b).D(d.c);
    }
    
    private boolean z(int intValue, final boolean b) {
        final List<Integer> checkedButtonIds = this.getCheckedButtonIds();
        if (this.O && checkedButtonIds.isEmpty()) {
            this.w(intValue, true);
            this.P = intValue;
            return false;
        }
        if (b && this.N) {
            checkedButtonIds.remove((Object)intValue);
            final Iterator<Integer> iterator = checkedButtonIds.iterator();
            while (iterator.hasNext()) {
                intValue = iterator.next();
                this.w(intValue, false);
                this.n(intValue, false);
            }
        }
        return true;
    }
    
    @b1
    void B() {
        final int childCount = this.getChildCount();
        final int firstVisibleChildIndex = this.getFirstVisibleChildIndex();
        final int lastVisibleChildIndex = this.getLastVisibleChildIndex();
        for (int i = 0; i < childCount; ++i) {
            final MaterialButton o = this.o(i);
            if (o.getVisibility() != 8) {
                final o.b v = o.getShapeAppearanceModel().v();
                y(v, this.q(i, firstVisibleChildIndex, lastVisibleChildIndex));
                o.setShapeAppearanceModel(v.m());
            }
        }
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(MaterialButtonToggleGroup.Q, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, n, viewGroup$LayoutParams);
        final MaterialButton generatedIdIfNeeded = (MaterialButton)view;
        this.setGeneratedIdIfNeeded(generatedIdIfNeeded);
        this.setupButtonChild(generatedIdIfNeeded);
        if (generatedIdIfNeeded.isChecked()) {
            this.z(generatedIdIfNeeded.getId(), true);
            this.setCheckedId(generatedIdIfNeeded.getId());
        }
        final o shapeAppearanceModel = generatedIdIfNeeded.getShapeAppearanceModel();
        this.G.add(new d(shapeAppearanceModel.r(), shapeAppearanceModel.j(), shapeAppearanceModel.t(), shapeAppearanceModel.l()));
        androidx.core.view.j0.z1((View)generatedIdIfNeeded, new androidx.core.view.a() {
            @Override
            public void g(final View view, @j0 final androidx.core.view.accessibility.d d) {
                super.g(view, d);
                d.X0(d.c.h(0, 1, MaterialButtonToggleGroup.this.p(view), 1, false, ((MaterialButton)view).isChecked()));
            }
        });
    }
    
    protected void dispatchDraw(@j0 final Canvas canvas) {
        this.A();
        super.dispatchDraw(canvas);
    }
    
    public void g(@j0 final e e) {
        this.J.add(e);
    }
    
    @j0
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }
    
    @y
    public int getCheckedButtonId() {
        int p;
        if (this.N) {
            p = this.P;
        }
        else {
            p = -1;
        }
        return p;
    }
    
    @j0
    public List<Integer> getCheckedButtonIds() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < this.getChildCount(); ++i) {
            final MaterialButton o = this.o(i);
            if (o.isChecked()) {
                list.add(o.getId());
            }
        }
        return list;
    }
    
    protected int getChildDrawingOrder(final int n, final int n2) {
        final Integer[] l = this.L;
        if (l != null && n2 < l.length) {
            return l[n2];
        }
        Log.w(MaterialButtonToggleGroup.Q, "Child order wasn't updated");
        return n2;
    }
    
    public void j(@y final int n) {
        if (n == this.P) {
            return;
        }
        this.k(n, true);
    }
    
    public void l() {
        this.M = true;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final MaterialButton o = this.o(i);
            o.setChecked(false);
            this.n(o.getId(), false);
        }
        this.M = false;
        this.setCheckedId(-1);
    }
    
    public void m() {
        this.J.clear();
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        final int p = this.P;
        if (p != -1) {
            this.k(p, true);
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final androidx.core.view.accessibility.d v1 = androidx.core.view.accessibility.d.V1(accessibilityNodeInfo);
        final int visibleButtonCount = this.getVisibleButtonCount();
        int n;
        if (this.t()) {
            n = 1;
        }
        else {
            n = 2;
        }
        v1.W0(androidx.core.view.accessibility.d.b.f(1, visibleButtonCount, false, n));
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.B();
        this.h();
        super.onMeasure(n, n2);
    }
    
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            final MaterialButton materialButton = (MaterialButton)view;
            materialButton.i((MaterialButton.b)this.H);
            materialButton.setOnPressedChangeListenerInternal(null);
        }
        final int indexOfChild = this.indexOfChild(view);
        if (indexOfChild >= 0) {
            this.G.remove(indexOfChild);
        }
        this.B();
        this.h();
    }
    
    public boolean s() {
        return this.O;
    }
    
    public void setSelectionRequired(final boolean o) {
        this.O = o;
    }
    
    public void setSingleSelection(@h final int n) {
        this.setSingleSelection(this.getResources().getBoolean(n));
    }
    
    public void setSingleSelection(final boolean n) {
        if (this.N != n) {
            this.N = n;
            this.l();
        }
    }
    
    public boolean t() {
        return this.N;
    }
    
    public void u(@j0 final e o) {
        this.J.remove(o);
    }
    
    public void x(@y final int n) {
        this.k(n, false);
    }
    
    private class c implements b
    {
        @Override
        public void a(@j0 final MaterialButton materialButton, final boolean b) {
            if (MaterialButtonToggleGroup.this.M) {
                return;
            }
            if (MaterialButtonToggleGroup.this.N) {
                final MaterialButtonToggleGroup a = MaterialButtonToggleGroup.this;
                int id;
                if (b) {
                    id = materialButton.getId();
                }
                else {
                    id = -1;
                }
                a.P = id;
            }
            if (MaterialButtonToggleGroup.this.z(materialButton.getId(), b)) {
                MaterialButtonToggleGroup.this.n(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }
    }
    
    private static class d
    {
        private static final com.google.android.material.shape.d e;
        com.google.android.material.shape.d a;
        com.google.android.material.shape.d b;
        com.google.android.material.shape.d c;
        com.google.android.material.shape.d d;
        
        static {
            e = new com.google.android.material.shape.a(0.0f);
        }
        
        d(final com.google.android.material.shape.d a, final com.google.android.material.shape.d d, final com.google.android.material.shape.d b, final com.google.android.material.shape.d c) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public static d a(final d d) {
            final com.google.android.material.shape.d e = MaterialButtonToggleGroup.d.e;
            return new d(e, d.d, e, d.c);
        }
        
        public static d b(d d, final View view) {
            if (b0.j(view)) {
                d = c(d);
            }
            else {
                d = d(d);
            }
            return d;
        }
        
        public static d c(final d d) {
            final com.google.android.material.shape.d a = d.a;
            final com.google.android.material.shape.d d2 = d.d;
            final com.google.android.material.shape.d e = MaterialButtonToggleGroup.d.e;
            return new d(a, d2, e, e);
        }
        
        public static d d(final d d) {
            final com.google.android.material.shape.d e = MaterialButtonToggleGroup.d.e;
            return new d(e, e, d.b, d.c);
        }
        
        public static d e(d d, final View view) {
            if (b0.j(view)) {
                d = d(d);
            }
            else {
                d = c(d);
            }
            return d;
        }
        
        public static d f(final d d) {
            final com.google.android.material.shape.d a = d.a;
            final com.google.android.material.shape.d e = MaterialButtonToggleGroup.d.e;
            return new d(a, e, d.b, e);
        }
    }
    
    public interface e
    {
        void a(final MaterialButtonToggleGroup p0, @y final int p1, final boolean p2);
    }
    
    private class f implements MaterialButton.c
    {
        @Override
        public void a(@j0 final MaterialButton materialButton, final boolean b) {
            MaterialButtonToggleGroup.this.invalidate();
        }
    }
}
