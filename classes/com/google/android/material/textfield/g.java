// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.textfield;

import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View$MeasureSpec;
import android.view.ViewParent;
import android.content.res.TypedArray;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemClickListener;
import android.view.View;
import android.text.method.KeyListener;
import com.google.android.material.internal.t;
import o2.a;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import androidx.annotation.k0;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.j0;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.e;

public class g extends e
{
    private static final int M = 15;
    @j0
    private final f0 J;
    @k0
    private final AccessibilityManager K;
    @j0
    private final Rect L;
    
    public g(@j0 final Context context) {
        this(context, null);
    }
    
    public g(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, a.c.Y);
    }
    
    public g(@j0 Context context, @k0 final AttributeSet set, int rk) {
        super(com.google.android.material.theme.overlay.a.c(context, set, rk, 0), set, rk);
        this.L = new Rect();
        context = this.getContext();
        final TypedArray j = t.j(context, set, a.o.qk, rk, a.n.f9, new int[0]);
        rk = a.o.rk;
        if (j.hasValue(rk) && j.getInt(rk, 0) == 0) {
            this.setKeyListener((KeyListener)null);
        }
        this.K = (AccessibilityManager)context.getSystemService("accessibility");
        final f0 i = new f0(context);
        (this.J = i).d0(true);
        i.S((View)this);
        i.a0(2);
        i.q(this.getAdapter());
        i.f0((AdapterView$OnItemClickListener)new AdapterView$OnItemClickListener() {
            public void onItemClick(final AdapterView<?> adapterView, View f, final int n, long d) {
                final g g = com.google.android.material.textfield.g.this;
                Object o;
                if (n < 0) {
                    o = g.J.C();
                }
                else {
                    o = g.getAdapter().getItem(n);
                }
                com.google.android.material.textfield.g.this.e(o);
                final AdapterView$OnItemClickListener onItemClickListener = com.google.android.material.textfield.g.this.getOnItemClickListener();
                if (onItemClickListener != null) {
                    int e;
                    if (f == null || (e = n) < 0) {
                        f = com.google.android.material.textfield.g.this.J.F();
                        e = com.google.android.material.textfield.g.this.J.E();
                        d = com.google.android.material.textfield.g.this.J.D();
                    }
                    onItemClickListener.onItemClick((AdapterView)com.google.android.material.textfield.g.this.J.l(), f, e, d);
                }
                com.google.android.material.textfield.g.this.J.dismiss();
            }
        });
        j.recycle();
    }
    
    @k0
    private TextInputLayout c() {
        for (ViewParent viewParent = this.getParent(); viewParent != null; viewParent = viewParent.getParent()) {
            if (viewParent instanceof TextInputLayout) {
                return (TextInputLayout)viewParent;
            }
        }
        return null;
    }
    
    private int d() {
        final ListAdapter adapter = this.getAdapter();
        final TextInputLayout c = this.c();
        int n = 0;
        if (adapter != null && c != null) {
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 0);
            final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(this.getMeasuredHeight(), 0);
            final int min = Math.min(adapter.getCount(), Math.max(0, this.J.E()) + 15);
            int i = Math.max(0, min - 15);
            View view = null;
            int max = 0;
            while (i < min) {
                final int itemViewType = adapter.getItemViewType(i);
                int n2;
                if (itemViewType != (n2 = n)) {
                    view = null;
                    n2 = itemViewType;
                }
                view = adapter.getView(i, view, (ViewGroup)c);
                if (view.getLayoutParams() == null) {
                    view.setLayoutParams(new ViewGroup$LayoutParams(-2, -2));
                }
                view.measure(measureSpec, measureSpec2);
                max = Math.max(max, view.getMeasuredWidth());
                ++i;
                n = n2;
            }
            final Drawable j = this.J.i();
            int n3 = max;
            if (j != null) {
                j.getPadding(this.L);
                final Rect l = this.L;
                n3 = max + (l.left + l.right);
            }
            return n3 + c.getEndIconView().getMeasuredWidth();
        }
        return 0;
    }
    
    private <T extends android.widget.ListAdapter> void e(final Object o) {
        if (Build$VERSION.SDK_INT >= 17) {
            this.setText(this.convertSelectionToString(o), false);
        }
        else {
            final ListAdapter adapter = this.getAdapter();
            this.setAdapter((ListAdapter)null);
            this.setText(this.convertSelectionToString(o));
            this.setAdapter(adapter);
        }
    }
    
    @k0
    public CharSequence getHint() {
        final TextInputLayout c = this.c();
        if (c != null && c.Z()) {
            return c.getHint();
        }
        return super.getHint();
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final TextInputLayout c = this.c();
        if (c != null && c.Z() && super.getHint() == null && com.google.android.material.internal.g.c()) {
            this.setHint((CharSequence)"");
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        if (View$MeasureSpec.getMode(n) == Integer.MIN_VALUE) {
            this.setMeasuredDimension(Math.min(Math.max(this.getMeasuredWidth(), this.d()), View$MeasureSpec.getSize(n)), this.getMeasuredHeight());
        }
    }
    
    public <T extends android.widget.ListAdapter> void setAdapter(@k0 final T adapter) {
        super.setAdapter((ListAdapter)adapter);
        this.J.q(this.getAdapter());
    }
    
    public void showDropDown() {
        final AccessibilityManager k = this.K;
        if (k != null && k.isTouchExplorationEnabled()) {
            this.J.a();
        }
        else {
            super.showDropDown();
        }
    }
}
