// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.navigation;

import androidx.core.widget.r;
import androidx.annotation.x0;
import android.graphics.drawable.Drawable$ConstantState;
import androidx.core.graphics.drawable.c;
import androidx.core.view.accessibility.d;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.e0;
import androidx.annotation.p;
import androidx.annotation.s;
import androidx.appcompat.widget.w0;
import android.os.Build$VERSION;
import android.text.TextUtils;
import android.view.ViewGroup$LayoutParams;
import com.google.android.material.badge.b;
import android.widget.FrameLayout$LayoutParams;
import android.view.View$OnLayoutChangeListener;
import android.view.View;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.annotation.k0;
import androidx.appcompat.view.menu.j;
import android.widget.TextView;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.o;
import android.widget.FrameLayout;

@t0({ t0.a.H })
public abstract class a extends FrameLayout implements o.a
{
    private static final int W = -1;
    private static final int[] a0;
    private final int G;
    private float H;
    private float I;
    private float J;
    private int K;
    private boolean L;
    private ImageView M;
    private final ViewGroup N;
    private final TextView O;
    private final TextView P;
    private int Q;
    @k0
    private j R;
    @k0
    private ColorStateList S;
    @k0
    private Drawable T;
    @k0
    private Drawable U;
    @k0
    private com.google.android.material.badge.a V;
    
    static {
        a0 = new int[] { 16842912 };
    }
    
    public a(@j0 final Context context) {
        super(context);
        this.Q = -1;
        LayoutInflater.from(context).inflate(this.getItemLayoutResId(), (ViewGroup)this, true);
        this.M = (ImageView)this.findViewById(o2.a.h.p3);
        final ViewGroup n = (ViewGroup)this.findViewById(o2.a.h.q3);
        this.N = n;
        final TextView o = (TextView)this.findViewById(o2.a.h.s3);
        this.O = o;
        final TextView p = (TextView)this.findViewById(o2.a.h.r3);
        this.P = p;
        this.setBackgroundResource(this.getItemBackgroundResId());
        this.G = this.getResources().getDimensionPixelSize(this.getItemDefaultMarginResId());
        n.setTag(o2.a.h.n3, (Object)n.getPaddingBottom());
        androidx.core.view.j0.P1((View)o, 2);
        androidx.core.view.j0.P1((View)p, 2);
        this.setFocusable(true);
        this.e(o.getTextSize(), p.getTextSize());
        final ImageView m = this.M;
        if (m != null) {
            m.addOnLayoutChangeListener((View$OnLayoutChangeListener)new View$OnLayoutChangeListener() {
                public void onLayoutChange(final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8) {
                    if (com.google.android.material.navigation.a.this.M.getVisibility() == 0) {
                        final a a = com.google.android.material.navigation.a.this;
                        a.o((View)a.M);
                    }
                }
            });
        }
    }
    
    private void e(final float n, final float n2) {
        this.H = n - n2;
        this.I = n2 * 1.0f / n;
        this.J = n * 1.0f / n2;
    }
    
    private int getItemVisiblePosition() {
        final ViewGroup viewGroup = (ViewGroup)this.getParent();
        final int indexOfChild = viewGroup.indexOfChild((View)this);
        int i = 0;
        int n = 0;
        while (i < indexOfChild) {
            final View child = viewGroup.getChildAt(i);
            int n2 = n;
            if (child instanceof a) {
                n2 = n;
                if (child.getVisibility() == 0) {
                    n2 = n + 1;
                }
            }
            ++i;
            n = n2;
        }
        return n;
    }
    
    private int getSuggestedIconHeight() {
        final com.google.android.material.badge.a v = this.V;
        int a;
        if (v != null) {
            a = v.getMinimumHeight() / 2;
        }
        else {
            a = 0;
        }
        return Math.max(a, ((FrameLayout$LayoutParams)this.M.getLayoutParams()).topMargin) + this.M.getMeasuredWidth() + a;
    }
    
    private int getSuggestedIconWidth() {
        final com.google.android.material.badge.a v = this.V;
        int n;
        if (v == null) {
            n = 0;
        }
        else {
            n = v.getMinimumWidth() - this.V.q();
        }
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.M.getLayoutParams();
        return Math.max(n, frameLayout$LayoutParams.leftMargin) + this.M.getMeasuredWidth() + Math.max(n, frameLayout$LayoutParams.rightMargin);
    }
    
    @k0
    private FrameLayout h(final View view) {
        final ImageView m = this.M;
        FrameLayout frameLayout = null;
        if (view == m) {
            frameLayout = frameLayout;
            if (b.a) {
                frameLayout = (FrameLayout)m.getParent();
            }
        }
        return frameLayout;
    }
    
    private boolean i() {
        return this.V != null;
    }
    
    private static void k(@j0 final View view, final int topMargin, final int gravity) {
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
        layoutParams.topMargin = topMargin;
        layoutParams.gravity = gravity;
        view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    private static void l(@j0 final View view, final float scaleX, final float scaleY, final int visibility) {
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        view.setVisibility(visibility);
    }
    
    private void m(@k0 final View view) {
        if (!this.i()) {
            return;
        }
        if (view != null) {
            this.setClipChildren(false);
            this.setClipToPadding(false);
            b.b(this.V, view, this.h(view));
        }
    }
    
    private void n(@k0 final View view) {
        if (!this.i()) {
            return;
        }
        if (view != null) {
            this.setClipChildren(true);
            this.setClipToPadding(true);
            b.g(this.V, view);
        }
        this.V = null;
    }
    
    private void o(final View view) {
        if (!this.i()) {
            return;
        }
        b.j(this.V, view, this.h(view));
    }
    
    private static void p(@j0 final View view, final int n) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), n);
    }
    
    public void b(final boolean b, final char c) {
    }
    
    public boolean d() {
        return false;
    }
    
    public boolean f() {
        return true;
    }
    
    public void g(@j0 final j r, int sdk_INT) {
        this.R = r;
        this.setCheckable(r.isCheckable());
        this.setChecked(r.isChecked());
        this.setEnabled(r.isEnabled());
        this.setIcon(r.getIcon());
        this.setTitle(r.getTitle());
        this.setId(r.getItemId());
        if (!TextUtils.isEmpty(r.getContentDescription())) {
            this.setContentDescription(r.getContentDescription());
        }
        CharSequence charSequence;
        if (!TextUtils.isEmpty(r.getTooltipText())) {
            charSequence = r.getTooltipText();
        }
        else {
            charSequence = r.getTitle();
        }
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 21 || sdk_INT > 23) {
            w0.a((View)this, charSequence);
        }
        if (r.isVisible()) {
            sdk_INT = 0;
        }
        else {
            sdk_INT = 8;
        }
        this.setVisibility(sdk_INT);
    }
    
    @k0
    public com.google.android.material.badge.a getBadge() {
        return this.V;
    }
    
    @s
    protected int getItemBackgroundResId() {
        return o2.a.g.h1;
    }
    
    @k0
    public j getItemData() {
        return this.R;
    }
    
    @p
    protected int getItemDefaultMarginResId() {
        return o2.a.f.g5;
    }
    
    @e0
    protected abstract int getItemLayoutResId();
    
    public int getItemPosition() {
        return this.Q;
    }
    
    protected int getSuggestedMinimumHeight() {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.N.getLayoutParams();
        return this.getSuggestedIconHeight() + frameLayout$LayoutParams.topMargin + this.N.getMeasuredHeight() + frameLayout$LayoutParams.bottomMargin;
    }
    
    protected int getSuggestedMinimumWidth() {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)this.N.getLayoutParams();
        return Math.max(this.getSuggestedIconWidth(), frameLayout$LayoutParams.leftMargin + this.N.getMeasuredWidth() + frameLayout$LayoutParams.rightMargin);
    }
    
    void j() {
        this.n((View)this.M);
    }
    
    @j0
    public int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final j r = this.R;
        if (r != null && r.isCheckable() && this.R.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, a.a0);
        }
        return onCreateDrawableState;
    }
    
    public void onInitializeAccessibilityNodeInfo(@j0 final AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        final com.google.android.material.badge.a v = this.V;
        if (v != null && v.isVisible()) {
            CharSequence obj = this.R.getTitle();
            if (!TextUtils.isEmpty(this.R.getContentDescription())) {
                obj = this.R.getContentDescription();
            }
            final StringBuilder sb = new StringBuilder();
            sb.append((Object)obj);
            sb.append(", ");
            sb.append((Object)this.V.o());
            accessibilityNodeInfo.setContentDescription((CharSequence)sb.toString());
        }
        final d v2 = d.V1(accessibilityNodeInfo);
        v2.X0(d.c.h(0, 1, this.getItemVisiblePosition(), 1, false, this.isSelected()));
        if (this.isSelected()) {
            v2.V0(false);
            v2.J0(d.a.j);
        }
        v2.B1(this.getResources().getString(o2.a.m.P));
    }
    
    void setBadge(@j0 final com.google.android.material.badge.a v) {
        this.V = v;
        final ImageView m = this.M;
        if (m != null) {
            this.m((View)m);
        }
    }
    
    public void setCheckable(final boolean b) {
        this.refreshDrawableState();
    }
    
    public void setChecked(final boolean selected) {
        final TextView p = this.P;
        p.setPivotX((float)(p.getWidth() / 2));
        final TextView p2 = this.P;
        p2.setPivotY((float)p2.getBaseline());
        final TextView o = this.O;
        o.setPivotX((float)(o.getWidth() / 2));
        final TextView o2 = this.O;
        o2.setPivotY((float)o2.getBaseline());
        final int k = this.K;
        Label_0405: {
            Label_0333: {
                View view = null;
                int n3 = 0;
                Label_0310: {
                    ImageView imageView = null;
                    int n2 = 0;
                    Label_0268: {
                        Label_0200: {
                            if (k != -1) {
                                if (k != 0) {
                                    if (k != 1) {
                                        if (k != 2) {
                                            break Label_0405;
                                        }
                                        k((View)this.M, this.G, 17);
                                        this.P.setVisibility(8);
                                        this.O.setVisibility(8);
                                        break Label_0405;
                                    }
                                    else {
                                        final ViewGroup n = this.N;
                                        p((View)n, (int)n.getTag(o2.a.h.n3));
                                        if (!selected) {
                                            break Label_0200;
                                        }
                                    }
                                }
                                else {
                                    imageView = this.M;
                                    n2 = this.G;
                                    view = (View)imageView;
                                    n3 = n2;
                                    if (selected) {
                                        break Label_0268;
                                    }
                                    break Label_0310;
                                }
                            }
                            else if (this.L) {
                                imageView = this.M;
                                n2 = this.G;
                                view = (View)imageView;
                                n3 = n2;
                                if (selected) {
                                    break Label_0268;
                                }
                                break Label_0310;
                            }
                            else {
                                final ViewGroup n4 = this.N;
                                p((View)n4, (int)n4.getTag(o2.a.h.n3));
                                if (!selected) {
                                    break Label_0200;
                                }
                            }
                            k((View)this.M, (int)(this.G + this.H), 49);
                            l((View)this.P, 1.0f, 1.0f, 0);
                            final TextView o3 = this.O;
                            final float i = this.I;
                            l((View)o3, i, i, 4);
                            break Label_0405;
                        }
                        k((View)this.M, this.G, 49);
                        final TextView p3 = this.P;
                        final float j = this.J;
                        l((View)p3, j, j, 4);
                        l((View)this.O, 1.0f, 1.0f, 0);
                        break Label_0405;
                    }
                    k((View)imageView, n2, 49);
                    final ViewGroup n5 = this.N;
                    p((View)n5, (int)n5.getTag(o2.a.h.n3));
                    this.P.setVisibility(0);
                    break Label_0333;
                }
                k(view, n3, 17);
                p((View)this.N, 0);
                this.P.setVisibility(4);
            }
            this.O.setVisibility(4);
        }
        this.refreshDrawableState();
        this.setSelected(selected);
    }
    
    public void setEnabled(final boolean b) {
        super.setEnabled(b);
        this.O.setEnabled(b);
        this.P.setEnabled(b);
        this.M.setEnabled(b);
        androidx.core.view.e0 c;
        if (b) {
            c = androidx.core.view.e0.c(this.getContext(), 1002);
        }
        else {
            c = null;
        }
        androidx.core.view.j0.e2((View)this, c);
    }
    
    public void setIcon(@k0 Drawable drawable) {
        if (drawable == this.T) {
            return;
        }
        this.T = drawable;
        Drawable imageDrawable;
        if ((imageDrawable = drawable) != null) {
            final Drawable$ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = c.r(drawable).mutate();
            this.U = drawable;
            final ColorStateList s = this.S;
            imageDrawable = drawable;
            if (s != null) {
                c.o(drawable, s);
                imageDrawable = drawable;
            }
        }
        this.M.setImageDrawable(imageDrawable);
    }
    
    public void setIconSize(final int n) {
        final FrameLayout$LayoutParams layoutParams = (FrameLayout$LayoutParams)this.M.getLayoutParams();
        layoutParams.width = n;
        layoutParams.height = n;
        this.M.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    public void setIconTintList(@k0 final ColorStateList s) {
        this.S = s;
        if (this.R != null) {
            final Drawable u = this.U;
            if (u != null) {
                c.o(u, s);
                this.U.invalidateSelf();
            }
        }
    }
    
    public void setItemBackground(final int n) {
        Drawable i;
        if (n == 0) {
            i = null;
        }
        else {
            i = androidx.core.content.d.i(this.getContext(), n);
        }
        this.setItemBackground(i);
    }
    
    public void setItemBackground(@k0 final Drawable drawable) {
        Drawable mutate = drawable;
        if (drawable != null) {
            mutate = drawable;
            if (drawable.getConstantState() != null) {
                mutate = drawable.getConstantState().newDrawable().mutate();
            }
        }
        androidx.core.view.j0.G1((View)this, mutate);
    }
    
    public void setItemPosition(final int q) {
        this.Q = q;
    }
    
    public void setLabelVisibilityMode(int k) {
        if (this.K != k) {
            this.K = k;
            final j r = this.R;
            if (r != null) {
                k = 1;
            }
            else {
                k = 0;
            }
            if (k != 0) {
                this.setChecked(r.isChecked());
            }
        }
    }
    
    public void setShifting(final boolean l) {
        if (this.L != l) {
            this.L = l;
            final j r = this.R;
            if (r != null) {
                this.setChecked(r.isChecked());
            }
        }
    }
    
    public void setTextAppearanceActive(@x0 final int n) {
        r.E(this.P, n);
        this.e(this.O.getTextSize(), this.P.getTextSize());
    }
    
    public void setTextAppearanceInactive(@x0 final int n) {
        r.E(this.O, n);
        this.e(this.O.getTextSize(), this.P.getTextSize());
    }
    
    public void setTextColor(@k0 final ColorStateList list) {
        if (list != null) {
            this.O.setTextColor(list);
            this.P.setTextColor(list);
        }
    }
    
    public void setTitle(@k0 final CharSequence contentDescription) {
        this.O.setText(contentDescription);
        this.P.setText(contentDescription);
        final j r = this.R;
        if (r == null || TextUtils.isEmpty(r.getContentDescription())) {
            this.setContentDescription(contentDescription);
        }
        final j r2 = this.R;
        CharSequence tooltipText = contentDescription;
        if (r2 != null) {
            if (TextUtils.isEmpty(r2.getTooltipText())) {
                tooltipText = contentDescription;
            }
            else {
                tooltipText = this.R.getTooltipText();
            }
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 21 || sdk_INT > 23) {
            w0.a((View)this, tooltipText);
        }
    }
}
