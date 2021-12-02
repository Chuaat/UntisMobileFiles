// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.snackbar;

import android.widget.TextView;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.util.AttributeSet;
import androidx.annotation.t0;
import android.widget.Button;
import android.text.TextUtils;
import android.view.View$OnClickListener;
import android.content.res.ColorStateList;
import androidx.annotation.l;
import android.os.Build$VERSION;
import androidx.annotation.q;
import android.graphics.PorterDuff$Mode;
import android.view.LayoutInflater;
import androidx.annotation.w0;
import android.content.res.TypedArray;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.content.Context;
import o2.a;
import androidx.annotation.k0;
import android.view.accessibility.AccessibilityManager;

public class Snackbar extends BaseTransientBottomBar<Snackbar>
{
    private static final int[] N;
    private static final int[] O;
    @k0
    private final AccessibilityManager K;
    private boolean L;
    @k0
    private t<Snackbar> M;
    
    static {
        final int kc = o2.a.c.Kc;
        N = new int[] { kc };
        O = new int[] { kc, o2.a.c.Mc };
    }
    
    private Snackbar(@j0 final Context context, @j0 final ViewGroup viewGroup, @j0 final View view, @j0 final com.google.android.material.snackbar.a a) {
        super(context, viewGroup, view, a);
        this.K = (AccessibilityManager)viewGroup.getContext().getSystemService("accessibility");
    }
    
    @k0
    private static ViewGroup n0(View view) {
        ViewGroup viewGroup = null;
        View view2 = view;
        while (!(view2 instanceof CoordinatorLayout)) {
            ViewGroup viewGroup2 = viewGroup;
            if (view2 instanceof FrameLayout) {
                if (view2.getId() == 16908290) {
                    return (ViewGroup)view2;
                }
                viewGroup2 = (ViewGroup)view2;
            }
            if ((view = view2) != null) {
                final ViewParent parent = view2.getParent();
                if (parent instanceof View) {
                    view = (View)parent;
                }
                else {
                    view = null;
                }
            }
            viewGroup = viewGroup2;
            if ((view2 = view) == null) {
                return viewGroup2;
            }
        }
        return (ViewGroup)view2;
    }
    
    @Deprecated
    protected static boolean o0(@j0 final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.N);
        boolean b = false;
        final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId != -1) {
            b = true;
        }
        return b;
    }
    
    private static boolean p0(@j0 final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.O);
        final boolean b = false;
        final int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        final int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
        obtainStyledAttributes.recycle();
        boolean b2 = b;
        if (resourceId != -1) {
            b2 = b;
            if (resourceId2 != -1) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @j0
    public static Snackbar q0(@j0 final Context context, @j0 final View view, @j0 final CharSequence charSequence, final int n) {
        return t0(context, view, charSequence, n);
    }
    
    @j0
    public static Snackbar r0(@j0 final View view, @w0 final int n, final int n2) {
        return s0(view, view.getResources().getText(n), n2);
    }
    
    @j0
    public static Snackbar s0(@j0 final View view, @j0 final CharSequence charSequence, final int n) {
        return t0(null, view, charSequence, n);
    }
    
    @j0
    private static Snackbar t0(@k0 final Context context, @j0 final View view, @j0 final CharSequence charSequence, final int n) {
        final ViewGroup n2 = n0(view);
        if (n2 != null) {
            Context context2;
            if ((context2 = context) == null) {
                context2 = n2.getContext();
            }
            final LayoutInflater from = LayoutInflater.from(context2);
            int n3;
            if (p0(context2)) {
                n3 = o2.a.k.x0;
            }
            else {
                n3 = o2.a.k.G;
            }
            final SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout)from.inflate(n3, n2, false);
            final Snackbar snackbar = new Snackbar(context2, n2, (View)snackbarContentLayout, snackbarContentLayout);
            snackbar.E0(charSequence);
            snackbar.a0(n);
            return snackbar;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }
    
    @j0
    public Snackbar A0(@k0 final PorterDuff$Mode backgroundTintMode) {
        super.c.setBackgroundTintMode(backgroundTintMode);
        return this;
    }
    
    @Deprecated
    @j0
    public Snackbar B0(@k0 final b m) {
        final t<Snackbar> i = this.M;
        if (i != null) {
            this.U(i);
        }
        if (m != null) {
            this.s((t<Snackbar>)m);
        }
        this.M = m;
        return this;
    }
    
    @j0
    public Snackbar C0(@q final int maxInlineActionWidth) {
        ((SnackbarContentLayout)super.c.getChildAt(0)).setMaxInlineActionWidth(maxInlineActionWidth);
        return this;
    }
    
    @Override
    public int D() {
        final int d = super.D();
        if (d == -2) {
            return -2;
        }
        if (Build$VERSION.SDK_INT >= 29) {
            int n;
            if (this.L) {
                n = 4;
            }
            else {
                n = 0;
            }
            return this.K.getRecommendedTimeoutMillis(d, n | 0x1 | 0x2);
        }
        int n2 = d;
        if (this.L) {
            n2 = d;
            if (this.K.isTouchExplorationEnabled()) {
                n2 = -2;
            }
        }
        return n2;
    }
    
    @j0
    public Snackbar D0(@w0 final int n) {
        return this.E0(this.C().getText(n));
    }
    
    @j0
    public Snackbar E0(@j0 final CharSequence text) {
        ((SnackbarContentLayout)super.c.getChildAt(0)).getMessageView().setText(text);
        return this;
    }
    
    @j0
    public Snackbar F0(@l final int textColor) {
        ((SnackbarContentLayout)super.c.getChildAt(0)).getMessageView().setTextColor(textColor);
        return this;
    }
    
    @j0
    public Snackbar G0(final ColorStateList textColor) {
        ((SnackbarContentLayout)super.c.getChildAt(0)).getMessageView().setTextColor(textColor);
        return this;
    }
    
    @Override
    public boolean P() {
        return super.P();
    }
    
    @Override
    public void f0() {
        super.f0();
    }
    
    @j0
    public Snackbar u0(@w0 final int n, final View$OnClickListener view$OnClickListener) {
        return this.v0(this.C().getText(n), view$OnClickListener);
    }
    
    @j0
    public Snackbar v0(@k0 final CharSequence text, @k0 final View$OnClickListener view$OnClickListener) {
        final Button actionView = ((SnackbarContentLayout)super.c.getChildAt(0)).getActionView();
        if (!TextUtils.isEmpty(text) && view$OnClickListener != null) {
            this.L = true;
            ((TextView)actionView).setVisibility(0);
            ((TextView)actionView).setText(text);
            ((TextView)actionView).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public void onClick(final View view) {
                    view$OnClickListener.onClick(view);
                    Snackbar.this.x(1);
                }
            });
        }
        else {
            ((TextView)actionView).setVisibility(8);
            ((TextView)actionView).setOnClickListener((View$OnClickListener)null);
            this.L = false;
        }
        return this;
    }
    
    @Override
    public void w() {
        super.w();
    }
    
    @j0
    public Snackbar w0(@l final int textColor) {
        ((TextView)((SnackbarContentLayout)super.c.getChildAt(0)).getActionView()).setTextColor(textColor);
        return this;
    }
    
    @j0
    public Snackbar x0(final ColorStateList textColor) {
        ((TextView)((SnackbarContentLayout)super.c.getChildAt(0)).getActionView()).setTextColor(textColor);
        return this;
    }
    
    @j0
    public Snackbar y0(@l final int n) {
        return this.z0(ColorStateList.valueOf(n));
    }
    
    @j0
    public Snackbar z0(@k0 final ColorStateList backgroundTintList) {
        super.c.setBackgroundTintList(backgroundTintList);
        return this;
    }
    
    @t0({ t0.a.H })
    public static final class SnackbarLayout extends z
    {
        public SnackbarLayout(final Context context) {
            super(context);
        }
        
        public SnackbarLayout(final Context context, final AttributeSet set) {
            super(context, set);
        }
        
        protected void onMeasure(int i, int measuredWidth) {
            super.onMeasure(i, measuredWidth);
            final int childCount = this.getChildCount();
            measuredWidth = this.getMeasuredWidth();
            final int paddingLeft = this.getPaddingLeft();
            final int paddingRight = this.getPaddingRight();
            View child;
            for (i = 0; i < childCount; ++i) {
                child = this.getChildAt(i);
                if (child.getLayoutParams().width == -1) {
                    child.measure(View$MeasureSpec.makeMeasureSpec(measuredWidth - paddingLeft - paddingRight, 1073741824), View$MeasureSpec.makeMeasureSpec(child.getMeasuredHeight(), 1073741824));
                }
            }
        }
    }
    
    public static class b extends t<Snackbar>
    {
        public static final int f = 0;
        public static final int g = 1;
        public static final int h = 2;
        public static final int i = 3;
        public static final int j = 4;
        
        public void c(final Snackbar snackbar, final int n) {
        }
        
        public void d(final Snackbar snackbar) {
        }
    }
}
