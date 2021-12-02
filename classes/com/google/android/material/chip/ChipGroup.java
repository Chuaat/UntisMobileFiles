// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.chip;

import android.view.ViewGroup$MarginLayoutParams;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import androidx.annotation.h;
import android.graphics.drawable.Drawable;
import androidx.annotation.p;
import androidx.core.view.accessibility.d;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import android.view.ViewGroup$LayoutParams;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup$OnHierarchyChangeListener;
import com.google.android.material.internal.t;
import android.util.AttributeSet;
import android.content.Context;
import o2.a;
import androidx.annotation.y;
import androidx.annotation.j0;
import androidx.annotation.k0;
import androidx.annotation.q;
import com.google.android.material.internal.e;

public class ChipGroup extends com.google.android.material.internal.e
{
    private static final int T;
    @q
    private int K;
    @q
    private int L;
    private boolean M;
    private boolean N;
    @k0
    private d O;
    private final b P;
    @j0
    private e Q;
    @y
    private int R;
    private boolean S;
    
    static {
        T = a.n.lb;
    }
    
    public ChipGroup(final Context context) {
        this(context, null);
    }
    
    public ChipGroup(final Context context, final AttributeSet set) {
        this(context, set, a.c.J1);
    }
    
    public ChipGroup(final Context context, final AttributeSet set, int r) {
        final int t = ChipGroup.T;
        super(com.google.android.material.theme.overlay.a.c(context, set, r, t), set, r);
        this.P = new b();
        this.Q = new e();
        this.R = -1;
        this.S = false;
        final TypedArray j = com.google.android.material.internal.t.j(this.getContext(), set, a.o.a6, r, t, new int[0]);
        r = j.getDimensionPixelOffset(a.o.c6, 0);
        this.setChipSpacingHorizontal(j.getDimensionPixelOffset(a.o.d6, r));
        this.setChipSpacingVertical(j.getDimensionPixelOffset(a.o.e6, r));
        this.setSingleLine(j.getBoolean(a.o.g6, false));
        this.setSingleSelection(j.getBoolean(a.o.h6, false));
        this.setSelectionRequired(j.getBoolean(a.o.f6, false));
        r = j.getResourceId(a.o.b6, -1);
        if (r != -1) {
            this.R = r;
        }
        j.recycle();
        super.setOnHierarchyChangeListener((ViewGroup$OnHierarchyChangeListener)this.Q);
        androidx.core.view.j0.P1((View)this, 1);
    }
    
    private int getChipCount() {
        int i = 0;
        int n = 0;
        while (i < this.getChildCount()) {
            int n2 = n;
            if (this.getChildAt(i) instanceof Chip) {
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    private void r(final int r, final boolean b) {
        this.R = r;
        final d o = this.O;
        if (o != null && this.M && b) {
            o.a(this, r);
        }
    }
    
    private void s(@y final int n, final boolean checked) {
        final View viewById = this.findViewById(n);
        if (viewById instanceof Chip) {
            this.S = true;
            ((Chip)viewById).setChecked(checked);
            this.S = false;
        }
    }
    
    private void setCheckedId(final int n) {
        this.r(n, true);
    }
    
    public void addView(final View view, final int n, final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (view instanceof Chip) {
            final Chip chip = (Chip)view;
            if (chip.isChecked()) {
                final int r = this.R;
                if (r != -1 && this.M) {
                    this.s(r, false);
                }
                this.setCheckedId(chip.getId());
            }
        }
        super.addView(view, n, viewGroup$LayoutParams);
    }
    
    @Override
    public boolean c() {
        return super.c();
    }
    
    protected boolean checkLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return super.checkLayoutParams(viewGroup$LayoutParams) && viewGroup$LayoutParams instanceof c;
    }
    
    @j0
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new c(-2, -2);
    }
    
    @j0
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new c(this.getContext(), set);
    }
    
    @j0
    protected ViewGroup$LayoutParams generateLayoutParams(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        return (ViewGroup$LayoutParams)new c(viewGroup$LayoutParams);
    }
    
    @y
    public int getCheckedChipId() {
        int r;
        if (this.M) {
            r = this.R;
        }
        else {
            r = -1;
        }
        return r;
    }
    
    @j0
    public List<Integer> getCheckedChipIds() {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof Chip && ((Chip)child).isChecked()) {
                list.add(child.getId());
                if (this.M) {
                    return list;
                }
            }
        }
        return list;
    }
    
    @q
    public int getChipSpacingHorizontal() {
        return this.K;
    }
    
    @q
    public int getChipSpacingVertical() {
        return this.L;
    }
    
    public void m(@y final int checkedId) {
        final int r = this.R;
        if (checkedId == r) {
            return;
        }
        if (r != -1 && this.M) {
            this.s(r, false);
        }
        if (checkedId != -1) {
            this.s(checkedId, true);
        }
        this.setCheckedId(checkedId);
    }
    
    public void n() {
        this.S = true;
        for (int i = 0; i < this.getChildCount(); ++i) {
            final View child = this.getChildAt(i);
            if (child instanceof Chip) {
                ((Chip)child).setChecked(false);
            }
        }
        this.S = false;
        this.setCheckedId(-1);
    }
    
    int o(@k0 final View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i = 0;
        int n = 0;
        while (i < this.getChildCount()) {
            int n2 = n;
            if (this.getChildAt(i) instanceof Chip) {
                if (this.getChildAt(i) == view) {
                    return n;
                }
                n2 = n + 1;
            }
            ++i;
            n = n2;
        }
        return -1;
    }
    
    protected void onFinishInflate() {
        super.onFinishInflate();
        final int r = this.R;
        if (r != -1) {
            this.s(r, true);
            this.setCheckedId(this.R);
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final androidx.core.view.accessibility.d v1 = androidx.core.view.accessibility.d.V1(accessibilityNodeInfo);
        int chipCount;
        if (this.c()) {
            chipCount = this.getChipCount();
        }
        else {
            chipCount = -1;
        }
        final int rowCount = this.getRowCount();
        int n;
        if (this.q()) {
            n = 1;
        }
        else {
            n = 2;
        }
        v1.W0(androidx.core.view.accessibility.d.b.f(rowCount, chipCount, false, n));
    }
    
    public boolean p() {
        return this.N;
    }
    
    public boolean q() {
        return this.M;
    }
    
    public void setChipSpacing(@q final int n) {
        this.setChipSpacingHorizontal(n);
        this.setChipSpacingVertical(n);
    }
    
    public void setChipSpacingHorizontal(@q final int k) {
        if (this.K != k) {
            this.setItemSpacing(this.K = k);
            this.requestLayout();
        }
    }
    
    public void setChipSpacingHorizontalResource(@p final int n) {
        this.setChipSpacingHorizontal(this.getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingResource(@p final int n) {
        this.setChipSpacing(this.getResources().getDimensionPixelOffset(n));
    }
    
    public void setChipSpacingVertical(@q final int l) {
        if (this.L != l) {
            this.setLineSpacing(this.L = l);
            this.requestLayout();
        }
    }
    
    public void setChipSpacingVerticalResource(@p final int n) {
        this.setChipSpacingVertical(this.getResources().getDimensionPixelOffset(n));
    }
    
    @Deprecated
    public void setDividerDrawableHorizontal(final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setDividerDrawableVertical(@k0 final Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setFlexWrap(final int n) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }
    
    public void setOnCheckedChangeListener(final d o) {
        this.O = o;
    }
    
    public void setOnHierarchyChangeListener(final ViewGroup$OnHierarchyChangeListener viewGroup$OnHierarchyChangeListener) {
        this.Q.G = viewGroup$OnHierarchyChangeListener;
    }
    
    public void setSelectionRequired(final boolean n) {
        this.N = n;
    }
    
    @Deprecated
    public void setShowDividerHorizontal(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    @Deprecated
    public void setShowDividerVertical(final int n) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }
    
    public void setSingleLine(@h final int n) {
        this.setSingleLine(this.getResources().getBoolean(n));
    }
    
    @Override
    public void setSingleLine(final boolean singleLine) {
        super.setSingleLine(singleLine);
    }
    
    public void setSingleSelection(@h final int n) {
        this.setSingleSelection(this.getResources().getBoolean(n));
    }
    
    public void setSingleSelection(final boolean m) {
        if (this.M != m) {
            this.M = m;
            this.n();
        }
    }
    
    private class b implements CompoundButton$OnCheckedChangeListener
    {
        public void onCheckedChanged(@j0 final CompoundButton compoundButton, final boolean b) {
            if (ChipGroup.this.S) {
                return;
            }
            if (ChipGroup.this.getCheckedChipIds().isEmpty() && ChipGroup.this.N) {
                ChipGroup.this.s(compoundButton.getId(), true);
                ChipGroup.this.r(compoundButton.getId(), false);
                return;
            }
            final int id = compoundButton.getId();
            if (b) {
                if (ChipGroup.this.R != -1 && ChipGroup.this.R != id && ChipGroup.this.M) {
                    final ChipGroup a = ChipGroup.this;
                    a.s(a.R, false);
                }
                ChipGroup.this.setCheckedId(id);
            }
            else if (ChipGroup.this.R == id) {
                ChipGroup.this.setCheckedId(-1);
            }
        }
    }
    
    public static class c extends ViewGroup$MarginLayoutParams
    {
        public c(final int n, final int n2) {
            super(n, n2);
        }
        
        public c(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        public c(final ViewGroup$LayoutParams viewGroup$LayoutParams) {
            super(viewGroup$LayoutParams);
        }
        
        public c(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams) {
            super(viewGroup$MarginLayoutParams);
        }
    }
    
    public interface d
    {
        void a(final ChipGroup p0, @y final int p1);
    }
    
    private class e implements ViewGroup$OnHierarchyChangeListener
    {
        private ViewGroup$OnHierarchyChangeListener G;
        
        public void onChildViewAdded(final View view, final View view2) {
            if (view == ChipGroup.this && view2 instanceof Chip) {
                if (view2.getId() == -1) {
                    view2.setId(androidx.core.view.j0.B());
                }
                final Chip chip = (Chip)view2;
                if (chip.isChecked()) {
                    ((ChipGroup)view).m(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal((CompoundButton$OnCheckedChangeListener)ChipGroup.this.P);
            }
            final ViewGroup$OnHierarchyChangeListener g = this.G;
            if (g != null) {
                g.onChildViewAdded(view, view2);
            }
        }
        
        public void onChildViewRemoved(final View view, final View view2) {
            if (view == ChipGroup.this && view2 instanceof Chip) {
                ((Chip)view2).setOnCheckedChangeListenerInternal(null);
            }
            final ViewGroup$OnHierarchyChangeListener g = this.G;
            if (g != null) {
                g.onChildViewRemoved(view, view2);
            }
        }
    }
}
