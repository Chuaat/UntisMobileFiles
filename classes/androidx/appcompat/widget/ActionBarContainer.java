// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.view.ActionMode;
import android.view.ActionMode$Callback;
import android.view.ViewGroup$LayoutParams;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable$Callback;
import android.view.View$MeasureSpec;
import android.view.MotionEvent;
import android.widget.FrameLayout$LayoutParams;
import android.content.res.TypedArray;
import c.a;
import androidx.core.view.j0;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.t0;
import android.widget.FrameLayout;

@t0({ t0.a.I })
public class ActionBarContainer extends FrameLayout
{
    private boolean G;
    private View H;
    private View I;
    private View J;
    Drawable K;
    Drawable L;
    Drawable M;
    boolean N;
    boolean O;
    private int P;
    
    public ActionBarContainer(final Context context) {
        this(context, null);
    }
    
    public ActionBarContainer(final Context context, final AttributeSet set) {
        super(context, set);
        j0.G1((View)this, new b(this));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.n.a);
        this.K = obtainStyledAttributes.getDrawable(a.n.b);
        this.L = obtainStyledAttributes.getDrawable(a.n.d);
        this.P = obtainStyledAttributes.getDimensionPixelSize(a.n.o, -1);
        final int id = this.getId();
        final int m1 = a.h.m1;
        boolean willNotDraw = true;
        if (id == m1) {
            this.N = true;
            this.M = obtainStyledAttributes.getDrawable(a.n.c);
        }
        obtainStyledAttributes.recycle();
        Label_0137: {
            if (this.N) {
                if (this.M == null) {
                    break Label_0137;
                }
            }
            else if (this.K == null && this.L == null) {
                break Label_0137;
            }
            willNotDraw = false;
        }
        this.setWillNotDraw(willNotDraw);
    }
    
    private int a(final View view) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)view.getLayoutParams();
        return view.getMeasuredHeight() + frameLayout$LayoutParams.topMargin + frameLayout$LayoutParams.bottomMargin;
    }
    
    private boolean b(final View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }
    
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        final Drawable k = this.K;
        if (k != null && k.isStateful()) {
            this.K.setState(this.getDrawableState());
        }
        final Drawable l = this.L;
        if (l != null && l.isStateful()) {
            this.L.setState(this.getDrawableState());
        }
        final Drawable m = this.M;
        if (m != null && m.isStateful()) {
            this.M.setState(this.getDrawableState());
        }
    }
    
    public View getTabContainer() {
        return this.H;
    }
    
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        final Drawable k = this.K;
        if (k != null) {
            k.jumpToCurrentState();
        }
        final Drawable l = this.L;
        if (l != null) {
            l.jumpToCurrentState();
        }
        final Drawable m = this.M;
        if (m != null) {
            m.jumpToCurrentState();
        }
    }
    
    public void onFinishInflate() {
        super.onFinishInflate();
        this.I = this.findViewById(a.h.H);
        this.J = this.findViewById(a.h.P);
    }
    
    public boolean onHoverEvent(final MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return this.G || super.onInterceptTouchEvent(motionEvent);
    }
    
    public void onLayout(final boolean b, int n, int n2, int n3, int n4) {
        super.onLayout(b, n, n2, n3, n4);
        final View h = this.H;
        n4 = 1;
        n2 = 0;
        final boolean o = h != null && h.getVisibility() != 8;
        if (h != null && h.getVisibility() != 8) {
            final int measuredHeight = this.getMeasuredHeight();
            final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)h.getLayoutParams();
            final int measuredHeight2 = h.getMeasuredHeight();
            final int bottomMargin = frameLayout$LayoutParams.bottomMargin;
            h.layout(n, measuredHeight - measuredHeight2 - bottomMargin, n3, measuredHeight - bottomMargin);
        }
        if (this.N) {
            final Drawable m = this.M;
            if (m != null) {
                m.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                n = n4;
            }
            else {
                n = 0;
            }
        }
        else {
            n = n2;
            if (this.K != null) {
                Label_0297: {
                    Drawable drawable;
                    View view;
                    if (this.I.getVisibility() == 0) {
                        drawable = this.K;
                        n3 = this.I.getLeft();
                        n = this.I.getTop();
                        n2 = this.I.getRight();
                        view = this.I;
                    }
                    else {
                        final View j = this.J;
                        if (j == null || j.getVisibility() != 0) {
                            this.K.setBounds(0, 0, 0, 0);
                            break Label_0297;
                        }
                        drawable = this.K;
                        n3 = this.J.getLeft();
                        n = this.J.getTop();
                        n2 = this.J.getRight();
                        view = this.J;
                    }
                    drawable.setBounds(n3, n, n2, view.getBottom());
                }
                n = 1;
            }
            this.O = o;
            if (o) {
                final Drawable l = this.L;
                if (l != null) {
                    l.setBounds(h.getLeft(), h.getTop(), h.getRight(), h.getBottom());
                    n = n4;
                }
            }
        }
        if (n != 0) {
            this.invalidate();
        }
    }
    
    public void onMeasure(int a, int b) {
        int measureSpec = b;
        if (this.I == null) {
            measureSpec = b;
            if (View$MeasureSpec.getMode(b) == Integer.MIN_VALUE) {
                final int p2 = this.P;
                measureSpec = b;
                if (p2 >= 0) {
                    measureSpec = View$MeasureSpec.makeMeasureSpec(Math.min(p2, View$MeasureSpec.getSize(b)), Integer.MIN_VALUE);
                }
            }
        }
        super.onMeasure(a, measureSpec);
        if (this.I == null) {
            return;
        }
        b = View$MeasureSpec.getMode(measureSpec);
        final View h = this.H;
        if (h != null && h.getVisibility() != 8 && b != 1073741824) {
            Label_0143: {
                View view;
                if (!this.b(this.I)) {
                    view = this.I;
                }
                else {
                    if (this.b(this.J)) {
                        a = 0;
                        break Label_0143;
                    }
                    view = this.J;
                }
                a = this.a(view);
            }
            if (b == Integer.MIN_VALUE) {
                b = View$MeasureSpec.getSize(measureSpec);
            }
            else {
                b = Integer.MAX_VALUE;
            }
            this.setMeasuredDimension(this.getMeasuredWidth(), Math.min(a + this.a(this.H), b));
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
    
    public void setPrimaryBackground(final Drawable k) {
        final Drawable i = this.K;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.K);
        }
        if ((this.K = k) != null) {
            k.setCallback((Drawable$Callback)this);
            final View j = this.I;
            if (j != null) {
                this.K.setBounds(j.getLeft(), this.I.getTop(), this.I.getRight(), this.I.getBottom());
            }
        }
        final boolean n = this.N;
        boolean willNotDraw = true;
        Label_0119: {
            if (n) {
                if (this.M == null) {
                    break Label_0119;
                }
            }
            else if (this.K == null && this.L == null) {
                break Label_0119;
            }
            willNotDraw = false;
        }
        this.setWillNotDraw(willNotDraw);
        this.invalidate();
        if (Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setSplitBackground(Drawable m) {
        final Drawable i = this.M;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.M);
        }
        this.M = m;
        final boolean b = false;
        if (m != null) {
            m.setCallback((Drawable$Callback)this);
            if (this.N) {
                m = this.M;
                if (m != null) {
                    m.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
                }
            }
        }
        boolean willNotDraw = false;
        Label_0114: {
            if (this.N) {
                willNotDraw = b;
                if (this.M != null) {
                    break Label_0114;
                }
            }
            else {
                willNotDraw = b;
                if (this.K != null) {
                    break Label_0114;
                }
                willNotDraw = b;
                if (this.L != null) {
                    break Label_0114;
                }
            }
            willNotDraw = true;
        }
        this.setWillNotDraw(willNotDraw);
        this.invalidate();
        if (Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setStackedBackground(Drawable l) {
        final Drawable i = this.L;
        if (i != null) {
            i.setCallback((Drawable$Callback)null);
            this.unscheduleDrawable(this.L);
        }
        if ((this.L = l) != null) {
            l.setCallback((Drawable$Callback)this);
            if (this.O) {
                l = this.L;
                if (l != null) {
                    l.setBounds(this.H.getLeft(), this.H.getTop(), this.H.getRight(), this.H.getBottom());
                }
            }
        }
        final boolean n = this.N;
        boolean willNotDraw = true;
        Label_0126: {
            if (n) {
                if (this.M == null) {
                    break Label_0126;
                }
            }
            else if (this.K == null && this.L == null) {
                break Label_0126;
            }
            willNotDraw = false;
        }
        this.setWillNotDraw(willNotDraw);
        this.invalidate();
        if (Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setTabContainer(final m0 h) {
        final View h2 = this.H;
        if (h2 != null) {
            this.removeView(h2);
        }
        if ((this.H = (View)h) != null) {
            this.addView((View)h);
            final ViewGroup$LayoutParams layoutParams = h.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            h.setAllowCollapse(false);
        }
    }
    
    public void setTransitioning(final boolean g) {
        this.G = g;
        int descendantFocusability;
        if (g) {
            descendantFocusability = 393216;
        }
        else {
            descendantFocusability = 262144;
        }
        this.setDescendantFocusability(descendantFocusability);
    }
    
    public void setVisibility(final int visibility) {
        super.setVisibility(visibility);
        final boolean b = visibility == 0;
        final Drawable k = this.K;
        if (k != null) {
            k.setVisible(b, false);
        }
        final Drawable l = this.L;
        if (l != null) {
            l.setVisible(b, false);
        }
        final Drawable m = this.M;
        if (m != null) {
            m.setVisible(b, false);
        }
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback) {
        return null;
    }
    
    public ActionMode startActionModeForChild(final View view, final ActionMode$Callback actionMode$Callback, final int n) {
        if (n != 0) {
            return super.startActionModeForChild(view, actionMode$Callback, n);
        }
        return null;
    }
    
    protected boolean verifyDrawable(final Drawable drawable) {
        return (drawable == this.K && !this.N) || (drawable == this.L && this.O) || (drawable == this.M && this.N) || super.verifyDrawable(drawable);
    }
}
