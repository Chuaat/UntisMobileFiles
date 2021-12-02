// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.widget.AdapterView;
import android.view.MenuItem;
import androidx.appcompat.widget.u0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import android.widget.AdapterView$OnItemClickListener;
import android.widget.ListView;

@t0({ t0.a.I })
public final class ExpandedMenuView extends ListView implements b, o, AdapterView$OnItemClickListener
{
    private static final int[] I;
    private g G;
    private int H;
    
    static {
        I = new int[] { 16842964, 16843049 };
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set) {
        this(context, set, 16842868);
    }
    
    public ExpandedMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.setOnItemClickListener((AdapterView$OnItemClickListener)this);
        final u0 g = u0.G(context, set, ExpandedMenuView.I, n, 0);
        if (g.C(0)) {
            this.setBackgroundDrawable(g.h(0));
        }
        if (g.C(1)) {
            this.setDivider(g.h(1));
        }
        g.I();
    }
    
    public boolean a(final j j) {
        return this.G.O((MenuItem)j, 0);
    }
    
    public void e(final g g) {
        this.G = g;
    }
    
    public int getWindowAnimations() {
        return this.H;
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.setChildrenDrawingCacheEnabled(false);
    }
    
    public void onItemClick(final AdapterView adapterView, final View view, final int n, final long n2) {
        this.a((j)this.getAdapter().getItem(n));
    }
}
