// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.ViewGroup;
import android.view.View;
import java.util.ArrayList;
import android.view.LayoutInflater;
import androidx.annotation.t0;
import android.widget.BaseAdapter;

@t0({ t0.a.I })
public class f extends BaseAdapter
{
    g G;
    private int H;
    private boolean I;
    private final boolean J;
    private final LayoutInflater K;
    private final int L;
    
    public f(final g g, final LayoutInflater k, final boolean j, final int l) {
        this.H = -1;
        this.J = j;
        this.K = k;
        this.G = g;
        this.L = l;
        this.a();
    }
    
    void a() {
        final j y = this.G.y();
        if (y != null) {
            final ArrayList<j> c = this.G.C();
            for (int size = c.size(), i = 0; i < size; ++i) {
                if (c.get(i) == y) {
                    this.H = i;
                    return;
                }
            }
        }
        this.H = -1;
    }
    
    public g b() {
        return this.G;
    }
    
    public boolean c() {
        return this.I;
    }
    
    public j d(final int n) {
        ArrayList<j> list;
        if (this.J) {
            list = this.G.C();
        }
        else {
            list = this.G.H();
        }
        final int h = this.H;
        int index = n;
        if (h >= 0 && (index = n) >= h) {
            index = n + 1;
        }
        return list.get(index);
    }
    
    public void e(final boolean i) {
        this.I = i;
    }
    
    public int getCount() {
        ArrayList<j> list;
        if (this.J) {
            list = this.G.C();
        }
        else {
            list = this.G.H();
        }
        final int h = this.H;
        final int size = list.size();
        if (h < 0) {
            return size;
        }
        return size - 1;
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        View inflate = view;
        if (view == null) {
            inflate = this.K.inflate(this.L, viewGroup, false);
        }
        final int groupId = this.d(n).getGroupId();
        final int n2 = n - 1;
        int groupId2;
        if (n2 >= 0) {
            groupId2 = this.d(n2).getGroupId();
        }
        else {
            groupId2 = groupId;
        }
        final ListMenuItemView listMenuItemView = (ListMenuItemView)inflate;
        listMenuItemView.setGroupDividerEnabled(this.G.I() && groupId != groupId2);
        final ListMenuItemView listMenuItemView2 = (ListMenuItemView)inflate;
        if (this.I) {
            listMenuItemView.setForceShowIcon(true);
        }
        ((o.a)listMenuItemView2).g(this.d(n), 0);
        return inflate;
    }
    
    public void notifyDataSetChanged() {
        this.a();
        super.notifyDataSetChanged();
    }
}
