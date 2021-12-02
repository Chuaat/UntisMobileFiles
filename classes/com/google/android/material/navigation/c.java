// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import android.view.accessibility.AccessibilityNodeInfo;
import android.util.TypedValue;
import android.annotation.SuppressLint;
import java.util.HashSet;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.n;
import android.view.MenuItem;
import android.view.View;
import androidx.transition.g0;
import com.google.android.material.internal.r;
import android.animation.TimeInterpolator;
import androidx.interpolator.view.animation.b;
import android.content.Context;
import androidx.appcompat.view.menu.g;
import android.graphics.drawable.Drawable;
import androidx.annotation.x0;
import androidx.annotation.q;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import android.view.View$OnTouchListener;
import android.util.SparseArray;
import androidx.core.util.m;
import android.view.View$OnClickListener;
import androidx.annotation.j0;
import androidx.transition.l0;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.o;
import android.view.ViewGroup;

@t0({ t0.a.H })
public abstract class c extends ViewGroup implements o
{
    private static final long c0 = 115L;
    private static final int d0 = 5;
    private static final int[] e0;
    private static final int[] f0;
    @j0
    private final l0 G;
    @j0
    private final View$OnClickListener H;
    private final m.a<com.google.android.material.navigation.a> I;
    @j0
    private final SparseArray<View$OnTouchListener> J;
    private int K;
    @k0
    private com.google.android.material.navigation.a[] L;
    private int M;
    private int N;
    @k0
    private ColorStateList O;
    @q
    private int P;
    private ColorStateList Q;
    @k0
    private final ColorStateList R;
    @x0
    private int S;
    @x0
    private int T;
    private Drawable U;
    private int V;
    @j0
    private SparseArray<com.google.android.material.badge.a> W;
    private d a0;
    private g b0;
    
    static {
        e0 = new int[] { 16842912 };
        f0 = new int[] { -16842910 };
    }
    
    public c(@j0 final Context context) {
        super(context);
        this.I = new m.c<com.google.android.material.navigation.a>(5);
        this.J = (SparseArray<View$OnTouchListener>)new SparseArray(5);
        this.M = 0;
        this.N = 0;
        this.W = (SparseArray<com.google.android.material.badge.a>)new SparseArray(5);
        this.R = this.d(16842808);
        final androidx.transition.c g = new androidx.transition.c();
        (this.G = g).a1(0);
        g.Y0(115L);
        g.Z0((TimeInterpolator)new b());
        g.N0(new r());
        this.H = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final j itemData = ((com.google.android.material.navigation.a)view).getItemData();
                if (!c.this.b0.P((MenuItem)itemData, c.this.a0, 0)) {
                    ((MenuItem)itemData).setChecked(true);
                }
            }
        };
        androidx.core.view.j0.P1((View)this, 1);
    }
    
    private com.google.android.material.navigation.a getNewItem() {
        com.google.android.material.navigation.a f;
        if ((f = this.I.b()) == null) {
            f = this.f(this.getContext());
        }
        return f;
    }
    
    private boolean k(final int n) {
        return n != -1;
    }
    
    private void m() {
        final HashSet<Integer> set = new HashSet<Integer>();
        final int n = 0;
        int n2 = 0;
        int i;
        while (true) {
            i = n;
            if (n2 >= this.b0.size()) {
                break;
            }
            set.add(this.b0.getItem(n2).getItemId());
            ++n2;
        }
        while (i < this.W.size()) {
            final int key = this.W.keyAt(i);
            if (!set.contains(key)) {
                this.W.delete(key);
            }
            ++i;
        }
    }
    
    private void q(final int i) {
        if (this.k(i)) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" is not a valid view id");
        throw new IllegalArgumentException(sb.toString());
    }
    
    private void setBadgeIfNeeded(@j0 final com.google.android.material.navigation.a a) {
        final int id = a.getId();
        if (!this.k(id)) {
            return;
        }
        final com.google.android.material.badge.a badge = (com.google.android.material.badge.a)this.W.get(id);
        if (badge != null) {
            a.setBadge(badge);
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public void c() {
        this.removeAllViews();
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                if (a != null) {
                    this.I.a(a);
                    a.j();
                }
            }
        }
        if (this.b0.size() == 0) {
            this.M = 0;
            this.N = 0;
            this.L = null;
            return;
        }
        this.m();
        this.L = new com.google.android.material.navigation.a[this.b0.size()];
        final boolean j = this.j(this.K, this.b0.H().size());
        for (int k = 0; k < this.b0.size(); ++k) {
            this.a0.l(true);
            this.b0.getItem(k).setCheckable(true);
            this.a0.l(false);
            final com.google.android.material.navigation.a newItem = this.getNewItem();
            (this.L[k] = newItem).setIconTintList(this.O);
            newItem.setIconSize(this.P);
            newItem.setTextColor(this.R);
            newItem.setTextAppearanceInactive(this.S);
            newItem.setTextAppearanceActive(this.T);
            newItem.setTextColor(this.Q);
            final Drawable u = this.U;
            if (u != null) {
                newItem.setItemBackground(u);
            }
            else {
                newItem.setItemBackground(this.V);
            }
            newItem.setShifting(j);
            newItem.setLabelVisibilityMode(this.K);
            final j m = (j)this.b0.getItem(k);
            newItem.g(m, 0);
            newItem.setItemPosition(k);
            final int itemId = m.getItemId();
            newItem.setOnTouchListener((View$OnTouchListener)this.J.get(itemId));
            newItem.setOnClickListener(this.H);
            final int m2 = this.M;
            if (m2 != 0 && itemId == m2) {
                this.N = k;
            }
            this.setBadgeIfNeeded(newItem);
            this.addView((View)newItem);
        }
        final int min = Math.min(this.b0.size() - 1, this.N);
        this.N = min;
        this.b0.getItem(min).setChecked(true);
    }
    
    @k0
    public ColorStateList d(int colorForState) {
        final TypedValue typedValue = new TypedValue();
        if (!this.getContext().getTheme().resolveAttribute(colorForState, typedValue, true)) {
            return null;
        }
        final ColorStateList c = androidx.appcompat.content.res.a.c(this.getContext(), typedValue.resourceId);
        if (!this.getContext().getTheme().resolveAttribute(c.a.c.H0, typedValue, true)) {
            return null;
        }
        final int data = typedValue.data;
        final int defaultColor = c.getDefaultColor();
        final int[] f0 = com.google.android.material.navigation.c.f0;
        final int[] e0 = com.google.android.material.navigation.c.e0;
        final int[] empty_STATE_SET = ViewGroup.EMPTY_STATE_SET;
        colorForState = c.getColorForState(f0, defaultColor);
        return new ColorStateList(new int[][] { f0, e0, empty_STATE_SET }, new int[] { colorForState, data, defaultColor });
    }
    
    public void e(@j0 final g b0) {
        this.b0 = b0;
    }
    
    @j0
    protected abstract com.google.android.material.navigation.a f(@j0 final Context p0);
    
    @k0
    public com.google.android.material.navigation.a g(final int n) {
        this.q(n);
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                if (a.getId() == n) {
                    return a;
                }
            }
        }
        return null;
    }
    
    SparseArray<com.google.android.material.badge.a> getBadgeDrawables() {
        return this.W;
    }
    
    @k0
    public ColorStateList getIconTintList() {
        return this.O;
    }
    
    @k0
    public Drawable getItemBackground() {
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null && l.length > 0) {
            return l[0].getBackground();
        }
        return this.U;
    }
    
    @Deprecated
    public int getItemBackgroundRes() {
        return this.V;
    }
    
    @q
    public int getItemIconSize() {
        return this.P;
    }
    
    @x0
    public int getItemTextAppearanceActive() {
        return this.T;
    }
    
    @x0
    public int getItemTextAppearanceInactive() {
        return this.S;
    }
    
    @k0
    public ColorStateList getItemTextColor() {
        return this.Q;
    }
    
    public int getLabelVisibilityMode() {
        return this.K;
    }
    
    @k0
    protected g getMenu() {
        return this.b0;
    }
    
    public int getSelectedItemId() {
        return this.M;
    }
    
    protected int getSelectedItemPosition() {
        return this.N;
    }
    
    public int getWindowAnimations() {
        return 0;
    }
    
    @k0
    public com.google.android.material.badge.a h(final int n) {
        return (com.google.android.material.badge.a)this.W.get(n);
    }
    
    com.google.android.material.badge.a i(final int n) {
        this.q(n);
        com.google.android.material.badge.a d;
        if ((d = (com.google.android.material.badge.a)this.W.get(n)) == null) {
            d = com.google.android.material.badge.a.d(this.getContext());
            this.W.put(n, (Object)d);
        }
        final com.google.android.material.navigation.a g = this.g(n);
        if (g != null) {
            g.setBadge(d);
        }
        return d;
    }
    
    protected boolean j(final int n, final int n2) {
        boolean b = true;
        if (n == -1) {
            if (n2 > 3) {
                return b;
            }
        }
        else if (n == 0) {
            return b;
        }
        b = false;
        return b;
    }
    
    void l(final int n) {
        this.q(n);
        final com.google.android.material.badge.a a = (com.google.android.material.badge.a)this.W.get(n);
        final com.google.android.material.navigation.a g = this.g(n);
        if (g != null) {
            g.j();
        }
        if (a != null) {
            this.W.remove(n);
        }
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public void n(final int n, @k0 final View$OnTouchListener onTouchListener) {
        final SparseArray<View$OnTouchListener> j = this.J;
        if (onTouchListener == null) {
            j.remove(n);
        }
        else {
            j.put(n, (Object)onTouchListener);
        }
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                if (a.getItemData().getItemId() == n) {
                    a.setOnTouchListener(onTouchListener);
                }
            }
        }
    }
    
    void o(final int m) {
        for (int size = this.b0.size(), i = 0; i < size; ++i) {
            final MenuItem item = this.b0.getItem(i);
            if (m == item.getItemId()) {
                this.M = m;
                this.N = i;
                item.setChecked(true);
                break;
            }
        }
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.d.V1(accessibilityNodeInfo).W0(androidx.core.view.accessibility.d.b.f(1, this.b0.H().size(), false, 1));
    }
    
    public void p() {
        final g b0 = this.b0;
        if (b0 != null) {
            if (this.L != null) {
                final int size = b0.size();
                if (size != this.L.length) {
                    this.c();
                    return;
                }
                final int m = this.M;
                for (int i = 0; i < size; ++i) {
                    final MenuItem item = this.b0.getItem(i);
                    if (item.isChecked()) {
                        this.M = item.getItemId();
                        this.N = i;
                    }
                }
                if (m != this.M) {
                    androidx.transition.j0.b(this, this.G);
                }
                final boolean j = this.j(this.K, this.b0.H().size());
                for (int k = 0; k < size; ++k) {
                    this.a0.l(true);
                    this.L[k].setLabelVisibilityMode(this.K);
                    this.L[k].setShifting(j);
                    this.L[k].g((j)this.b0.getItem(k), 0);
                    this.a0.l(false);
                }
            }
        }
    }
    
    void setBadgeDrawables(final SparseArray<com.google.android.material.badge.a> w) {
        this.W = w;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                a.setBadge((com.google.android.material.badge.a)w.get(a.getId()));
            }
        }
    }
    
    public void setIconTintList(@k0 final ColorStateList list) {
        this.O = list;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                l[i].setIconTintList(list);
            }
        }
    }
    
    public void setItemBackground(@k0 final Drawable drawable) {
        this.U = drawable;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                l[i].setItemBackground(drawable);
            }
        }
    }
    
    public void setItemBackgroundRes(final int n) {
        this.V = n;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                l[i].setItemBackground(n);
            }
        }
    }
    
    public void setItemIconSize(@q final int n) {
        this.P = n;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                l[i].setIconSize(n);
            }
        }
    }
    
    public void setItemTextAppearanceActive(@x0 final int n) {
        this.T = n;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                a.setTextAppearanceActive(n);
                final ColorStateList q = this.Q;
                if (q != null) {
                    a.setTextColor(q);
                }
            }
        }
    }
    
    public void setItemTextAppearanceInactive(@x0 final int n) {
        this.S = n;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (final com.google.android.material.navigation.a a : l) {
                a.setTextAppearanceInactive(n);
                final ColorStateList q = this.Q;
                if (q != null) {
                    a.setTextColor(q);
                }
            }
        }
    }
    
    public void setItemTextColor(@k0 final ColorStateList list) {
        this.Q = list;
        final com.google.android.material.navigation.a[] l = this.L;
        if (l != null) {
            for (int length = l.length, i = 0; i < length; ++i) {
                l[i].setTextColor(list);
            }
        }
    }
    
    public void setLabelVisibilityMode(final int k) {
        this.K = k;
    }
    
    public void setPresenter(@j0 final d a0) {
        this.a0 = a0;
    }
}
