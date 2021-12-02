// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.annotation.q;
import android.graphics.drawable.Drawable$ConstantState;
import android.widget.TextView;
import androidx.core.widget.r;
import androidx.core.content.res.g;
import androidx.core.graphics.drawable.c;
import androidx.appcompat.widget.w0;
import android.view.ViewStub;
import android.graphics.drawable.ColorDrawable;
import android.util.TypedValue;
import android.graphics.drawable.StateListDrawable;
import android.view.ViewGroup$LayoutParams;
import androidx.appcompat.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.core.view.accessibility.d;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import androidx.core.view.a;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import androidx.appcompat.view.menu.j;
import android.widget.FrameLayout;
import android.widget.CheckedTextView;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.o;

@t0({ androidx.annotation.t0.a.H })
public class NavigationMenuItemView extends f implements o.a
{
    private static final int[] A0;
    private int q0;
    private boolean r0;
    boolean s0;
    private final CheckedTextView t0;
    private FrameLayout u0;
    private j v0;
    private ColorStateList w0;
    private boolean x0;
    private Drawable y0;
    private final a z0;
    
    static {
        A0 = new int[] { 16842912 };
    }
    
    public NavigationMenuItemView(@j0 final Context context) {
        this(context, null);
    }
    
    public NavigationMenuItemView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuItemView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        final a z0 = new a() {
            @Override
            public void g(final View view, @j0 final d d) {
                super.g(view, d);
                d.S0(NavigationMenuItemView.this.s0);
            }
        };
        this.z0 = z0;
        this.setOrientation(0);
        LayoutInflater.from(context).inflate(a.k.P, (ViewGroup)this, true);
        this.setIconSize(context.getResources().getDimensionPixelSize(o2.a.f.n1));
        final CheckedTextView t0 = (CheckedTextView)this.findViewById(a.h.j1);
        (this.t0 = t0).setDuplicateParentStateEnabled(true);
        androidx.core.view.j0.z1((View)t0, z0);
    }
    
    private void F() {
        b layoutParams;
        int width;
        if (this.I()) {
            this.t0.setVisibility(8);
            final FrameLayout u0 = this.u0;
            if (u0 == null) {
                return;
            }
            layoutParams = (b)u0.getLayoutParams();
            width = -1;
        }
        else {
            this.t0.setVisibility(0);
            final FrameLayout u2 = this.u0;
            if (u2 == null) {
                return;
            }
            layoutParams = (b)u2.getLayoutParams();
            width = -2;
        }
        layoutParams.width = width;
        this.u0.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
    }
    
    @k0
    private StateListDrawable G() {
        final TypedValue typedValue = new TypedValue();
        if (this.getContext().getTheme().resolveAttribute(c.a.c.E0, typedValue, true)) {
            final StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(NavigationMenuItemView.A0, (Drawable)new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, (Drawable)new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }
    
    private boolean I() {
        return this.v0.getTitle() == null && this.v0.getIcon() == null && this.v0.getActionView() != null;
    }
    
    private void setActionView(@k0 final View view) {
        if (view != null) {
            if (this.u0 == null) {
                this.u0 = (FrameLayout)((ViewStub)this.findViewById(a.h.i1)).inflate();
            }
            this.u0.removeAllViews();
            this.u0.addView(view);
        }
    }
    
    public void H() {
        final FrameLayout u0 = this.u0;
        if (u0 != null) {
            u0.removeAllViews();
        }
        this.t0.setCompoundDrawables((Drawable)null, (Drawable)null, (Drawable)null, (Drawable)null);
    }
    
    @Override
    public void b(final boolean b, final char c) {
    }
    
    @Override
    public boolean d() {
        return false;
    }
    
    @Override
    public boolean f() {
        return true;
    }
    
    @Override
    public void g(@j0 final j v0, int visibility) {
        this.v0 = v0;
        if (v0.getItemId() > 0) {
            this.setId(v0.getItemId());
        }
        if (v0.isVisible()) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        this.setVisibility(visibility);
        if (this.getBackground() == null) {
            androidx.core.view.j0.G1((View)this, (Drawable)this.G());
        }
        this.setCheckable(v0.isCheckable());
        this.setChecked(v0.isChecked());
        this.setEnabled(v0.isEnabled());
        this.setTitle(v0.getTitle());
        this.setIcon(v0.getIcon());
        this.setActionView(v0.getActionView());
        this.setContentDescription(v0.getContentDescription());
        androidx.appcompat.widget.w0.a((View)this, v0.getTooltipText());
        this.F();
    }
    
    @Override
    public j getItemData() {
        return this.v0;
    }
    
    protected int[] onCreateDrawableState(final int n) {
        final int[] onCreateDrawableState = super.onCreateDrawableState(n + 1);
        final j v0 = this.v0;
        if (v0 != null && v0.isCheckable() && this.v0.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, NavigationMenuItemView.A0);
        }
        return onCreateDrawableState;
    }
    
    @Override
    public void setCheckable(final boolean s0) {
        this.refreshDrawableState();
        if (this.s0 != s0) {
            this.s0 = s0;
            this.z0.l((View)this.t0, 2048);
        }
    }
    
    @Override
    public void setChecked(final boolean checked) {
        this.refreshDrawableState();
        this.t0.setChecked(checked);
    }
    
    public void setHorizontalPadding(final int n) {
        this.setPadding(n, 0, n, 0);
    }
    
    @Override
    public void setIcon(@k0 Drawable y0) {
        if (y0 != null) {
            Drawable mutate = y0;
            if (this.x0) {
                final Drawable$ConstantState constantState = y0.getConstantState();
                if (constantState != null) {
                    y0 = constantState.newDrawable();
                }
                mutate = androidx.core.graphics.drawable.c.r(y0).mutate();
                androidx.core.graphics.drawable.c.o(mutate, this.w0);
            }
            final int q0 = this.q0;
            mutate.setBounds(0, 0, q0, q0);
            y0 = mutate;
        }
        else if (this.r0) {
            if (this.y0 == null) {
                y0 = g.f(this.getResources(), o2.a.g.l1, this.getContext().getTheme());
                if ((this.y0 = y0) != null) {
                    final int q2 = this.q0;
                    y0.setBounds(0, 0, q2, q2);
                }
            }
            y0 = this.y0;
        }
        r.w((TextView)this.t0, y0, null, null, null);
    }
    
    public void setIconPadding(final int compoundDrawablePadding) {
        this.t0.setCompoundDrawablePadding(compoundDrawablePadding);
    }
    
    public void setIconSize(@q final int q0) {
        this.q0 = q0;
    }
    
    void setIconTintList(final ColorStateList w0) {
        this.w0 = w0;
        this.x0 = (w0 != null);
        final j v0 = this.v0;
        if (v0 != null) {
            this.setIcon(v0.getIcon());
        }
    }
    
    public void setMaxLines(final int maxLines) {
        this.t0.setMaxLines(maxLines);
    }
    
    public void setNeedsEmptyIcon(final boolean r0) {
        this.r0 = r0;
    }
    
    public void setTextAppearance(final int n) {
        r.E((TextView)this.t0, n);
    }
    
    public void setTextColor(final ColorStateList textColor) {
        this.t0.setTextColor(textColor);
    }
    
    @Override
    public void setTitle(final CharSequence text) {
        this.t0.setText(text);
    }
}
