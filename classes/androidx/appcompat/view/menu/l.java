// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.widget.PopupWindow$OnDismissListener;
import android.widget.AdapterView;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.View;
import android.widget.FrameLayout;
import android.view.View$MeasureSpec;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.view.MenuItem;
import android.graphics.Rect;
import android.widget.AdapterView$OnItemClickListener;

abstract class l implements q, n, AdapterView$OnItemClickListener
{
    private Rect G;
    
    protected static boolean B(final g g) {
        final int size = g.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final MenuItem item = g.getItem(n);
            if (item.isVisible() && item.getIcon() != null) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    protected static f C(final ListAdapter listAdapter) {
        if (listAdapter instanceof HeaderViewListAdapter) {
            return (f)((HeaderViewListAdapter)listAdapter).getWrappedAdapter();
        }
        return (f)listAdapter;
    }
    
    protected static int s(final ListAdapter listAdapter, final ViewGroup viewGroup, final Context context, final int n) {
        int i = 0;
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(0, 0);
        final int count = listAdapter.getCount();
        final View view = null;
        int n2 = 0;
        int n3 = 0;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        while (i < count) {
            final int itemViewType = listAdapter.getItemViewType(i);
            int n4;
            if (itemViewType != (n4 = n3)) {
                view2 = null;
                n4 = itemViewType;
            }
            Object o;
            if ((o = viewGroup2) == null) {
                o = new FrameLayout(context);
            }
            view2 = listAdapter.getView(i, view2, (ViewGroup)o);
            view2.measure(measureSpec, measureSpec2);
            final int measuredWidth = view2.getMeasuredWidth();
            if (measuredWidth >= n) {
                return n;
            }
            int n5;
            if (measuredWidth > (n5 = n2)) {
                n5 = measuredWidth;
            }
            ++i;
            n2 = n5;
            n3 = n4;
            viewGroup2 = (ViewGroup)o;
        }
        return n2;
    }
    
    public abstract void A(final int p0);
    
    @Override
    public int b() {
        return 0;
    }
    
    @Override
    public boolean g(final g g, final j j) {
        return false;
    }
    
    @Override
    public boolean h(final g g, final j j) {
        return false;
    }
    
    @Override
    public void j(@j0 final Context context, @k0 final g g) {
    }
    
    @Override
    public o n(final ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }
    
    public void onItemClick(final AdapterView<?> adapterView, final View view, int n, final long n2) {
        final ListAdapter listAdapter = (ListAdapter)adapterView.getAdapter();
        final g g = C(listAdapter).G;
        final MenuItem menuItem = (MenuItem)listAdapter.getItem(n);
        if (this.q()) {
            n = 0;
        }
        else {
            n = 4;
        }
        g.P(menuItem, this, n);
    }
    
    public abstract void p(final g p0);
    
    protected boolean q() {
        return true;
    }
    
    public Rect r() {
        return this.G;
    }
    
    public abstract void t(final View p0);
    
    public void u(final Rect g) {
        this.G = g;
    }
    
    public abstract void v(final boolean p0);
    
    public abstract void w(final int p0);
    
    public abstract void x(final int p0);
    
    public abstract void y(final PopupWindow$OnDismissListener p0);
    
    public abstract void z(final boolean p0);
}
