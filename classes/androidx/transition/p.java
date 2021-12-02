// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.os.Build$VERSION;
import android.view.ViewParent;
import java.util.ArrayList;
import android.view.View;
import androidx.annotation.j0;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.widget.FrameLayout;

@SuppressLint({ "ViewConstructor" })
class p extends FrameLayout
{
    @j0
    private ViewGroup G;
    private boolean H;
    
    p(final ViewGroup g) {
        super(g.getContext());
        this.setClipChildren(false);
        (this.G = g).setTag(a0.g.w0, (Object)this);
        t0.b(this.G).c((View)this);
        this.H = true;
    }
    
    static p b(@j0 final ViewGroup viewGroup) {
        return (p)viewGroup.getTag(a0.g.w0);
    }
    
    private int c(final ArrayList<View> list) {
        final ArrayList<View> list2 = new ArrayList<View>();
        int n = this.getChildCount() - 1;
        int i = 0;
        while (i <= n) {
            final int n2 = (i + n) / 2;
            d(((r)this.getChildAt(n2)).I, list2);
            if (f(list, list2)) {
                i = n2 + 1;
            }
            else {
                n = n2 - 1;
            }
            list2.clear();
        }
        return i;
    }
    
    private static void d(final View e, final ArrayList<View> list) {
        final ViewParent parent = e.getParent();
        if (parent instanceof ViewGroup) {
            d((View)parent, list);
        }
        list.add(e);
    }
    
    private static boolean e(final View view, final View view2) {
        final ViewGroup viewGroup = (ViewGroup)view.getParent();
        final int childCount = viewGroup.getChildCount();
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b = false;
        boolean b2 = false;
        if (sdk_INT >= 21 && view.getZ() != view2.getZ()) {
            if (view.getZ() > view2.getZ()) {
                b2 = true;
            }
            return b2;
        }
        for (int i = 0; i < childCount; ++i) {
            final View child = viewGroup.getChildAt(t0.a(viewGroup, i));
            if (child == view) {
                return b;
            }
            if (child == view2) {
                break;
            }
        }
        return true;
    }
    
    private static boolean f(final ArrayList<View> list, final ArrayList<View> list2) {
        final boolean empty = list.isEmpty();
        boolean b2;
        final boolean b = b2 = true;
        if (!empty) {
            b2 = b;
            if (!list2.isEmpty()) {
                if (list.get(0) != list2.get(0)) {
                    b2 = b;
                }
                else {
                    final int min = Math.min(list.size(), list2.size());
                    for (int i = 1; i < min; ++i) {
                        final View view = list.get(i);
                        final View view2 = list2.get(i);
                        if (view != view2) {
                            return e(view, view2);
                        }
                    }
                    b2 = (list2.size() == min && b);
                }
            }
        }
        return b2;
    }
    
    void a(final r r) {
        final ArrayList<View> list = new ArrayList<View>();
        d(r.I, list);
        final int c = this.c(list);
        if (c >= 0 && c < this.getChildCount()) {
            this.addView((View)r, c);
        }
        else {
            this.addView((View)r);
        }
    }
    
    void g() {
        if (this.H) {
            t0.b(this.G).d((View)this);
            t0.b(this.G).c((View)this);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }
    
    public void onViewAdded(final View view) {
        if (this.H) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }
    
    public void onViewRemoved(final View view) {
        super.onViewRemoved(view);
        if ((this.getChildCount() == 1 && this.getChildAt(0) == view) || this.getChildCount() == 0) {
            this.G.setTag(a0.g.w0, (Object)null);
            t0.b(this.G).d((View)this);
            this.H = false;
        }
    }
}
