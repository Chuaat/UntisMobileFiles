// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transformation;

import android.view.ViewTreeObserver$OnPreDrawListener;
import androidx.annotation.i;
import java.util.List;
import v2.b;
import androidx.annotation.k0;
import android.view.ViewGroup$LayoutParams;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public abstract class ExpandableBehavior extends c<View>
{
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private int a;
    
    public ExpandableBehavior() {
        this.a = 0;
    }
    
    public ExpandableBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.a = 0;
    }
    
    private boolean H(final boolean b) {
        final boolean b2 = false;
        final boolean b3 = false;
        if (b) {
            final int a = this.a;
            if (a != 0) {
                final boolean b4 = b3;
                if (a != 2) {
                    return b4;
                }
            }
            return true;
        }
        boolean b5 = b2;
        if (this.a == 1) {
            b5 = true;
        }
        return b5;
    }
    
    @k0
    public static <T extends ExpandableBehavior> T J(@j0 final View view, @j0 final Class<T> clazz) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        final c f = ((g)layoutParams).f();
        if (f instanceof ExpandableBehavior) {
            return clazz.cast(f);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }
    
    @k0
    protected v2.b I(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view) {
        final List<View> w = coordinatorLayout.w(view);
        for (int size = w.size(), i = 0; i < size; ++i) {
            final View view2 = w.get(i);
            if (this.f(coordinatorLayout, view, view2)) {
                return (v2.b)view2;
            }
        }
        return null;
    }
    
    protected abstract boolean K(final View p0, final View p1, final boolean p2, final boolean p3);
    
    @Override
    public abstract boolean f(final CoordinatorLayout p0, final View p1, final View p2);
    
    @androidx.annotation.i
    @Override
    public boolean i(final CoordinatorLayout coordinatorLayout, final View view, final View view2) {
        final v2.b b = (v2.b)view2;
        if (this.H(b.b())) {
            int a;
            if (b.b()) {
                a = 1;
            }
            else {
                a = 2;
            }
            this.a = a;
            return this.K((View)b, view, b.b(), true);
        }
        return false;
    }
    
    @androidx.annotation.i
    @Override
    public boolean m(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, int a) {
        if (!androidx.core.view.j0.T0(view)) {
            final v2.b i = this.I(coordinatorLayout, view);
            if (i != null && this.H(i.b())) {
                if (i.b()) {
                    a = 1;
                }
                else {
                    a = 2;
                }
                this.a = a;
                view.getViewTreeObserver().addOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                    public boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
                        if (ExpandableBehavior.this.a == a) {
                            final ExpandableBehavior j = ExpandableBehavior.this;
                            final v2.b i = i;
                            j.K((View)i, view, i.b(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }
}
