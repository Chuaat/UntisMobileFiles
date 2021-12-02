// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import androidx.core.view.i;
import android.view.View$MeasureSpec;
import c.a;
import android.view.ViewGroup;
import androidx.core.view.j0;
import android.view.View;
import android.util.AttributeSet;
import androidx.annotation.k0;
import android.content.Context;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class AlertDialogLayout extends LinearLayoutCompat
{
    public AlertDialogLayout(@k0 final Context context) {
        super(context);
    }
    
    public AlertDialogLayout(@k0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
    }
    
    private void E(final View view, final int n, final int n2, final int n3, final int n4) {
        view.layout(n, n2, n3 + n, n4 + n2);
    }
    
    private static int F(final View view) {
        final int c0 = androidx.core.view.j0.c0(view);
        if (c0 > 0) {
            return c0;
        }
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            if (viewGroup.getChildCount() == 1) {
                return F(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }
    
    private boolean G(final int n, final int n2) {
        final int childCount = this.getChildCount();
        View view = null;
        View view3;
        View view2 = view3 = null;
        for (int i = 0; i < childCount; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final int id = child.getId();
                if (id == c.a.h.O1) {
                    view = child;
                }
                else if (id == c.a.h.e0) {
                    view2 = child;
                }
                else {
                    if (id != c.a.h.j0 && id != c.a.h.l0) {
                        return false;
                    }
                    if (view3 != null) {
                        return false;
                    }
                    view3 = child;
                }
            }
        }
        final int mode = View$MeasureSpec.getMode(n2);
        final int size = View$MeasureSpec.getSize(n2);
        final int mode2 = View$MeasureSpec.getMode(n);
        int n3 = this.getPaddingTop() + this.getPaddingBottom();
        int n4;
        if (view != null) {
            view.measure(n, 0);
            n3 += view.getMeasuredHeight();
            n4 = View.combineMeasuredStates(0, view.getMeasuredState());
        }
        else {
            n4 = 0;
        }
        int f;
        int b;
        if (view2 != null) {
            view2.measure(n, 0);
            f = F(view2);
            b = view2.getMeasuredHeight() - f;
            n3 += f;
            n4 = View.combineMeasuredStates(n4, view2.getMeasuredState());
        }
        else {
            f = 0;
            b = 0;
        }
        int measuredHeight;
        if (view3 != null) {
            int measureSpec;
            if (mode == 0) {
                measureSpec = 0;
            }
            else {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, size - n3), mode);
            }
            view3.measure(n, measureSpec);
            measuredHeight = view3.getMeasuredHeight();
            n3 += measuredHeight;
            n4 = View.combineMeasuredStates(n4, view3.getMeasuredState());
        }
        else {
            measuredHeight = 0;
        }
        final int a = size - n3;
        int n5 = n4;
        int n6 = a;
        int n7 = n3;
        if (view2 != null) {
            final int min = Math.min(a, b);
            int n8 = a;
            int n9 = f;
            if (min > 0) {
                n8 = a - min;
                n9 = f + min;
            }
            view2.measure(n, View$MeasureSpec.makeMeasureSpec(n9, 1073741824));
            n7 = n3 - f + view2.getMeasuredHeight();
            final int combineMeasuredStates = View.combineMeasuredStates(n4, view2.getMeasuredState());
            n6 = n8;
            n5 = combineMeasuredStates;
        }
        int combineMeasuredStates2 = n5;
        int n10 = n7;
        if (view3 != null) {
            combineMeasuredStates2 = n5;
            n10 = n7;
            if (n6 > 0) {
                view3.measure(n, View$MeasureSpec.makeMeasureSpec(measuredHeight + n6, mode));
                n10 = n7 - measuredHeight + view3.getMeasuredHeight();
                combineMeasuredStates2 = View.combineMeasuredStates(n5, view3.getMeasuredState());
            }
        }
        int j = 0;
        int a2 = 0;
        while (j < childCount) {
            final View child2 = this.getChildAt(j);
            int max = a2;
            if (child2.getVisibility() != 8) {
                max = Math.max(a2, child2.getMeasuredWidth());
            }
            ++j;
            a2 = max;
        }
        this.setMeasuredDimension(View.resolveSizeAndState(a2 + (this.getPaddingLeft() + this.getPaddingRight()), n, combineMeasuredStates2), View.resolveSizeAndState(n10, n2, 0));
        if (mode2 != 1073741824) {
            this.n(childCount, n2);
        }
        return true;
    }
    
    private void n(final int n, final int n2) {
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(this.getMeasuredWidth(), 1073741824);
        for (int i = 0; i < n; ++i) {
            final View child = this.getChildAt(i);
            if (child.getVisibility() != 8) {
                final b b = (b)child.getLayoutParams();
                if (b.width == -1) {
                    final int height = b.height;
                    b.height = child.getMeasuredHeight();
                    this.measureChildWithMargins(child, measureSpec, 0, n2, 0);
                    b.height = height;
                }
            }
        }
    }
    
    @Override
    protected void onLayout(final boolean b, int n, int intrinsicHeight, int i, int gravity) {
        final int paddingLeft = this.getPaddingLeft();
        final int n2 = i - n;
        final int paddingRight = this.getPaddingRight();
        final int paddingRight2 = this.getPaddingRight();
        n = this.getMeasuredHeight();
        final int childCount = this.getChildCount();
        final int gravity2 = this.getGravity();
        i = (gravity2 & 0x70);
        if (i != 16) {
            if (i != 80) {
                n = this.getPaddingTop();
            }
            else {
                n = this.getPaddingTop() + gravity - intrinsicHeight - n;
            }
        }
        else {
            n = this.getPaddingTop() + (gravity - intrinsicHeight - n) / 2;
        }
        final Drawable dividerDrawable = this.getDividerDrawable();
        if (dividerDrawable == null) {
            intrinsicHeight = 0;
        }
        else {
            intrinsicHeight = dividerDrawable.getIntrinsicHeight();
        }
        View child;
        int measuredWidth;
        int measuredHeight;
        b b2;
        int n3;
        for (i = 0; i < childCount; ++i, n = gravity) {
            child = this.getChildAt(i);
            gravity = n;
            if (child != null) {
                gravity = n;
                if (child.getVisibility() != 8) {
                    measuredWidth = child.getMeasuredWidth();
                    measuredHeight = child.getMeasuredHeight();
                    b2 = (b)child.getLayoutParams();
                    if ((gravity = b2.gravity) < 0) {
                        gravity = (gravity2 & 0x800007);
                    }
                    gravity = (i.d(gravity, androidx.core.view.j0.X((View)this)) & 0x7);
                    Label_0293: {
                        if (gravity != 1) {
                            if (gravity != 5) {
                                gravity = b2.leftMargin + paddingLeft;
                                break Label_0293;
                            }
                            gravity = n2 - paddingRight - measuredWidth;
                        }
                        else {
                            gravity = (n2 - paddingLeft - paddingRight2 - measuredWidth) / 2 + paddingLeft + b2.leftMargin;
                        }
                        gravity -= b2.rightMargin;
                    }
                    n3 = n;
                    if (this.v(i)) {
                        n3 = n + intrinsicHeight;
                    }
                    n = n3 + b2.topMargin;
                    this.E(child, gravity, n, measuredWidth, measuredHeight);
                    gravity = n + (measuredHeight + b2.bottomMargin);
                }
            }
        }
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        if (!this.G(n, n2)) {
            super.onMeasure(n, n2);
        }
    }
}
