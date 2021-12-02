// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.os.Build$VERSION;
import android.animation.LayoutTransition;
import android.graphics.Canvas;
import androidx.annotation.p0;
import androidx.core.view.x0;
import android.view.WindowInsets;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.os.Bundle;
import android.content.res.TypedArray;
import y.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import java.util.ArrayList;
import android.widget.FrameLayout;

public final class FragmentContainerView extends FrameLayout
{
    private ArrayList<View> G;
    private ArrayList<View> H;
    private View$OnApplyWindowInsetsListener I;
    private boolean J;
    
    public FragmentContainerView(@j0 final Context context) {
        super(context);
        this.J = true;
    }
    
    public FragmentContainerView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public FragmentContainerView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.J = true;
        if (set != null) {
            final String classAttribute = set.getClassAttribute();
            final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.l.B);
            String string;
            String str;
            if (classAttribute == null) {
                string = obtainStyledAttributes.getString(a.l.C);
                str = "android:name";
            }
            else {
                str = "class";
                string = classAttribute;
            }
            obtainStyledAttributes.recycle();
            if (string != null) {
                if (!this.isInEditMode()) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("FragmentContainerView must be within a FragmentActivity to use ");
                    sb.append(str);
                    sb.append("=\"");
                    sb.append(string);
                    sb.append("\"");
                    throw new UnsupportedOperationException(sb.toString());
                }
            }
        }
    }
    
    FragmentContainerView(@j0 final Context context, @j0 final AttributeSet set, @j0 final FragmentManager fragmentManager) {
        super(context, set);
        this.J = true;
        final String classAttribute = set.getClassAttribute();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, a.l.B);
        String string = classAttribute;
        if (classAttribute == null) {
            string = obtainStyledAttributes.getString(a.l.C);
        }
        final String string2 = obtainStyledAttributes.getString(a.l.D);
        obtainStyledAttributes.recycle();
        final int id = this.getId();
        final Fragment p3 = fragmentManager.p0(id);
        if (string != null && p3 == null) {
            if (id <= 0) {
                String string3;
                if (string2 != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(" with tag ");
                    sb.append(string2);
                    string3 = sb.toString();
                }
                else {
                    string3 = "";
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(string);
                sb2.append(string3);
                throw new IllegalStateException(sb2.toString());
            }
            final Fragment a = fragmentManager.E0().a(context.getClassLoader(), string);
            a.onInflate(context, set, null);
            fragmentManager.r().R(true).k((ViewGroup)this, a, string2).u();
        }
        fragmentManager.i1(this);
    }
    
    private void a(@j0 final View view) {
        final ArrayList<View> h = this.H;
        if (h != null && h.contains(view)) {
            if (this.G == null) {
                this.G = new ArrayList<View>();
            }
            this.G.add(view);
        }
    }
    
    public void addView(@j0 final View obj, final int n, @k0 final ViewGroup$LayoutParams viewGroup$LayoutParams) {
        if (FragmentManager.N0(obj) != null) {
            super.addView(obj, n, viewGroup$LayoutParams);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(obj);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    protected boolean addViewInLayout(@j0 final View obj, final int n, @k0 final ViewGroup$LayoutParams viewGroup$LayoutParams, final boolean b) {
        if (FragmentManager.N0(obj) != null) {
            return super.addViewInLayout(obj, n, viewGroup$LayoutParams, b);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Views added to a FragmentContainerView must be associated with a Fragment. View ");
        sb.append(obj);
        sb.append(" is not associated with a Fragment.");
        throw new IllegalStateException(sb.toString());
    }
    
    @j0
    @p0(20)
    public WindowInsets dispatchApplyWindowInsets(@j0 final WindowInsets windowInsets) {
        final x0 k = x0.K(windowInsets);
        final View$OnApplyWindowInsetsListener i = this.I;
        x0 x0;
        if (i != null) {
            x0 = androidx.core.view.x0.K(i.onApplyWindowInsets((View)this, windowInsets));
        }
        else {
            x0 = androidx.core.view.j0.e1((View)this, k);
        }
        if (!x0.A()) {
            for (int childCount = this.getChildCount(), j = 0; j < childCount; ++j) {
                androidx.core.view.j0.o(this.getChildAt(j), x0);
            }
        }
        return windowInsets;
    }
    
    protected void dispatchDraw(@j0 final Canvas canvas) {
        if (this.J && this.G != null) {
            for (int i = 0; i < this.G.size(); ++i) {
                super.drawChild(canvas, (View)this.G.get(i), this.getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }
    
    protected boolean drawChild(@j0 final Canvas canvas, @j0 final View o, final long n) {
        if (this.J) {
            final ArrayList<View> g = this.G;
            if (g != null && g.size() > 0 && this.G.contains(o)) {
                return false;
            }
        }
        return super.drawChild(canvas, o, n);
    }
    
    public void endViewTransition(@j0 final View view) {
        final ArrayList<View> h = this.H;
        if (h != null) {
            h.remove(view);
            final ArrayList<View> g = this.G;
            if (g != null && g.remove(view)) {
                this.J = true;
            }
        }
        super.endViewTransition(view);
    }
    
    @j0
    @p0(20)
    public WindowInsets onApplyWindowInsets(@j0 final WindowInsets windowInsets) {
        return windowInsets;
    }
    
    public void removeAllViewsInLayout() {
        for (int i = this.getChildCount() - 1; i >= 0; --i) {
            this.a(this.getChildAt(i));
        }
        super.removeAllViewsInLayout();
    }
    
    protected void removeDetachedView(@j0 final View view, final boolean b) {
        if (b) {
            this.a(view);
        }
        super.removeDetachedView(view, b);
    }
    
    public void removeView(@j0 final View view) {
        this.a(view);
        super.removeView(view);
    }
    
    public void removeViewAt(final int n) {
        this.a(this.getChildAt(n));
        super.removeViewAt(n);
    }
    
    public void removeViewInLayout(@j0 final View view) {
        this.a(view);
        super.removeViewInLayout(view);
    }
    
    public void removeViews(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(this.getChildAt(i));
        }
        super.removeViews(n, n2);
    }
    
    public void removeViewsInLayout(final int n, final int n2) {
        for (int i = n; i < n + n2; ++i) {
            this.a(this.getChildAt(i));
        }
        super.removeViewsInLayout(n, n2);
    }
    
    void setDrawDisappearingViewsLast(final boolean j) {
        this.J = j;
    }
    
    public void setLayoutTransition(@k0 final LayoutTransition layoutTransition) {
        if (Build$VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }
    
    public void setOnApplyWindowInsetsListener(@j0 final View$OnApplyWindowInsetsListener i) {
        this.I = i;
    }
    
    public void startViewTransition(@j0 final View e) {
        if (e.getParent() == this) {
            if (this.H == null) {
                this.H = new ArrayList<View>();
            }
            this.H.add(e);
        }
        super.startViewTransition(e);
    }
}
