// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.graphics.drawable.Drawable;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.g;
import android.view.View$OnClickListener;
import androidx.appcompat.view.b;
import android.view.View$MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.view.MotionEvent;
import androidx.core.view.p0;
import android.view.ViewGroup$MarginLayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class ActionBarContextView extends a
{
    private CharSequence P;
    private CharSequence Q;
    private View R;
    private View S;
    private View T;
    private LinearLayout U;
    private TextView V;
    private TextView W;
    private int a0;
    private int b0;
    private boolean c0;
    private int d0;
    
    public ActionBarContextView(@j0 final Context context) {
        this(context, null);
    }
    
    public ActionBarContextView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, c.a.c.C);
    }
    
    public ActionBarContextView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        final u0 g = u0.G(context, set, c.a.n.J, n, 0);
        androidx.core.view.j0.G1((View)this, g.h(c.a.n.K));
        this.a0 = g.u(c.a.n.P, 0);
        this.b0 = g.u(c.a.n.O, 0);
        super.K = g.q(c.a.n.N, 0);
        this.d0 = g.u(c.a.n.M, c.a.k.f);
        g.I();
    }
    
    private void r() {
        if (this.U == null) {
            LayoutInflater.from(this.getContext()).inflate(c.a.k.a, (ViewGroup)this);
            final LinearLayout u = (LinearLayout)this.getChildAt(this.getChildCount() - 1);
            this.U = u;
            this.V = (TextView)u.findViewById(c.a.h.N);
            this.W = (TextView)this.U.findViewById(c.a.h.M);
            if (this.a0 != 0) {
                this.V.setTextAppearance(this.getContext(), this.a0);
            }
            if (this.b0 != 0) {
                this.W.setTextAppearance(this.getContext(), this.b0);
            }
        }
        this.V.setText(this.P);
        this.W.setText(this.Q);
        final boolean empty = TextUtils.isEmpty(this.P);
        final boolean b = TextUtils.isEmpty(this.Q) ^ true;
        final TextView w = this.W;
        final int n = 0;
        int visibility;
        if (b) {
            visibility = 0;
        }
        else {
            visibility = 8;
        }
        w.setVisibility(visibility);
        final LinearLayout u2 = this.U;
        int visibility2 = n;
        if (!(empty ^ true)) {
            if (b) {
                visibility2 = n;
            }
            else {
                visibility2 = 8;
            }
        }
        u2.setVisibility(visibility2);
        if (this.U.getParent() == null) {
            this.addView((View)this.U);
        }
    }
    
    @Override
    public boolean f() {
        final c j = super.J;
        return j != null && j.F();
    }
    
    protected ViewGroup$LayoutParams generateDefaultLayoutParams() {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(-1, -2);
    }
    
    public ViewGroup$LayoutParams generateLayoutParams(final AttributeSet set) {
        return (ViewGroup$LayoutParams)new ViewGroup$MarginLayoutParams(this.getContext(), set);
    }
    
    public CharSequence getSubtitle() {
        return this.Q;
    }
    
    public CharSequence getTitle() {
        return this.P;
    }
    
    @Override
    public boolean h() {
        final c j = super.J;
        return j != null && j.I();
    }
    
    @Override
    public boolean o() {
        final c j = super.J;
        return j != null && j.R();
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final c j = super.J;
        if (j != null) {
            j.F();
            super.J.G();
        }
    }
    
    public void onInitializeAccessibilityEvent(final AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.setSource((View)this);
            accessibilityEvent.setClassName((CharSequence)this.getClass().getName());
            accessibilityEvent.setPackageName((CharSequence)this.getContext().getPackageName());
            accessibilityEvent.setContentDescription(this.P);
        }
        else {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }
    
    protected void onLayout(final boolean b, int paddingLeft, int n, final int n2, int n3) {
        final boolean b2 = a1.b((View)this);
        int paddingLeft2;
        if (b2) {
            paddingLeft2 = n2 - paddingLeft - this.getPaddingRight();
        }
        else {
            paddingLeft2 = this.getPaddingLeft();
        }
        final int paddingTop = this.getPaddingTop();
        final int n4 = n3 - n - this.getPaddingTop() - this.getPaddingBottom();
        final View r = this.R;
        n = paddingLeft2;
        if (r != null) {
            n = paddingLeft2;
            if (r.getVisibility() != 8) {
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.R.getLayoutParams();
                if (b2) {
                    n = viewGroup$MarginLayoutParams.rightMargin;
                }
                else {
                    n = viewGroup$MarginLayoutParams.leftMargin;
                }
                if (b2) {
                    n3 = viewGroup$MarginLayoutParams.leftMargin;
                }
                else {
                    n3 = viewGroup$MarginLayoutParams.rightMargin;
                }
                n = a.k(paddingLeft2, n, b2);
                n = a.k(n + this.l(this.R, n, paddingTop, n4, b2), n3, b2);
            }
        }
        final LinearLayout u = this.U;
        n3 = n;
        if (u != null) {
            n3 = n;
            if (this.T == null) {
                n3 = n;
                if (u.getVisibility() != 8) {
                    n3 = n + this.l((View)this.U, n, paddingTop, n4, b2);
                }
            }
        }
        final View t = this.T;
        if (t != null) {
            this.l(t, n3, paddingTop, n4, b2);
        }
        if (b2) {
            paddingLeft = this.getPaddingLeft();
        }
        else {
            paddingLeft = n2 - paddingLeft - this.getPaddingRight();
        }
        final ActionMenuView i = super.I;
        if (i != null) {
            this.l((View)i, paddingLeft, paddingTop, n4, b2 ^ true);
        }
    }
    
    protected void onMeasure(int i, int b) {
        final int mode = View$MeasureSpec.getMode(i);
        final int n = 1073741824;
        if (mode != 1073741824) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.getClass().getSimpleName());
            sb.append(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
            throw new IllegalStateException(sb.toString());
        }
        if (View$MeasureSpec.getMode(b) != 0) {
            final int size = View$MeasureSpec.getSize(i);
            int n2 = super.K;
            if (n2 <= 0) {
                n2 = View$MeasureSpec.getSize(b);
            }
            final int n3 = this.getPaddingTop() + this.getPaddingBottom();
            i = size - this.getPaddingLeft() - this.getPaddingRight();
            final int b2 = n2 - n3;
            final int measureSpec = View$MeasureSpec.makeMeasureSpec(b2, Integer.MIN_VALUE);
            final View r = this.R;
            final int n4 = 0;
            b = i;
            if (r != null) {
                i = this.j(r, i, measureSpec, 0);
                final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams = (ViewGroup$MarginLayoutParams)this.R.getLayoutParams();
                b = i - (viewGroup$MarginLayoutParams.leftMargin + viewGroup$MarginLayoutParams.rightMargin);
            }
            final ActionMenuView j = super.I;
            i = b;
            if (j != null) {
                i = b;
                if (j.getParent() == this) {
                    i = this.j((View)super.I, b, measureSpec, 0);
                }
            }
            final LinearLayout u = this.U;
            b = i;
            if (u != null) {
                b = i;
                if (this.T == null) {
                    if (this.c0) {
                        b = View$MeasureSpec.makeMeasureSpec(0, 0);
                        this.U.measure(b, measureSpec);
                        final int measuredWidth = this.U.getMeasuredWidth();
                        final boolean b3 = measuredWidth <= i;
                        b = i;
                        if (b3) {
                            b = i - measuredWidth;
                        }
                        final LinearLayout u2 = this.U;
                        if (b3) {
                            i = 0;
                        }
                        else {
                            i = 8;
                        }
                        u2.setVisibility(i);
                    }
                    else {
                        b = this.j((View)u, i, measureSpec, 0);
                    }
                }
            }
            final View t = this.T;
            if (t != null) {
                final ViewGroup$LayoutParams layoutParams = t.getLayoutParams();
                final int width = layoutParams.width;
                if (width != -2) {
                    i = 1073741824;
                }
                else {
                    i = Integer.MIN_VALUE;
                }
                int min = b;
                if (width >= 0) {
                    min = Math.min(width, b);
                }
                final int height = layoutParams.height;
                if (height != -2) {
                    b = n;
                }
                else {
                    b = Integer.MIN_VALUE;
                }
                int min2 = b2;
                if (height >= 0) {
                    min2 = Math.min(height, b2);
                }
                this.T.measure(View$MeasureSpec.makeMeasureSpec(min, i), View$MeasureSpec.makeMeasureSpec(min2, b));
            }
            if (super.K <= 0) {
                final int childCount = this.getChildCount();
                int n5 = 0;
                int n6;
                for (i = n4; i < childCount; ++i, n5 = b) {
                    n6 = this.getChildAt(i).getMeasuredHeight() + n3;
                    if (n6 > (b = n5)) {
                        b = n6;
                    }
                }
                this.setMeasuredDimension(size, n5);
            }
            else {
                this.setMeasuredDimension(size, n2);
            }
            return;
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getClass().getSimpleName());
        sb2.append(" can only be used with android:layout_height=\"wrap_content\"");
        throw new IllegalStateException(sb2.toString());
    }
    
    public void p() {
        if (this.R == null) {
            this.t();
        }
    }
    
    public void q(final androidx.appcompat.view.b b) {
        final View r = this.R;
        Label_0054: {
            View r2;
            if (r == null) {
                r2 = LayoutInflater.from(this.getContext()).inflate(this.d0, (ViewGroup)this, false);
                this.R = r2;
            }
            else {
                if (r.getParent() != null) {
                    break Label_0054;
                }
                r2 = this.R;
            }
            this.addView(r2);
        }
        (this.S = this.R.findViewById(c.a.h.W)).setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                b.c();
            }
        });
        final g g = (g)b.e();
        final c j = super.J;
        if (j != null) {
            j.C();
        }
        (super.J = new c(this.getContext())).P(true);
        final ViewGroup$LayoutParams viewGroup$LayoutParams = new ViewGroup$LayoutParams(-2, -1);
        g.c(super.J, super.H);
        androidx.core.view.j0.G1((View)(super.I = (ActionMenuView)super.J.n(this)), null);
        this.addView((View)super.I, viewGroup$LayoutParams);
    }
    
    public boolean s() {
        return this.c0;
    }
    
    @Override
    public void setContentHeight(final int k) {
        super.K = k;
    }
    
    public void setCustomView(final View t) {
        final View t2 = this.T;
        if (t2 != null) {
            this.removeView(t2);
        }
        if ((this.T = t) != null) {
            final LinearLayout u = this.U;
            if (u != null) {
                this.removeView((View)u);
                this.U = null;
            }
        }
        if (t != null) {
            this.addView(t);
        }
        this.requestLayout();
    }
    
    public void setSubtitle(final CharSequence q) {
        this.Q = q;
        this.r();
    }
    
    public void setTitle(final CharSequence p) {
        this.P = p;
        this.r();
    }
    
    public void setTitleOptional(final boolean c0) {
        if (c0 != this.c0) {
            this.requestLayout();
        }
        this.c0 = c0;
    }
    
    public boolean shouldDelayChildPressedState() {
        return false;
    }
    
    public void t() {
        this.removeAllViews();
        this.T = null;
        super.I = null;
        super.J = null;
        final View s = this.S;
        if (s != null) {
            s.setOnClickListener((View$OnClickListener)null);
        }
    }
}
