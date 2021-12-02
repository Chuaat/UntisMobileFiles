// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.SubMenu;
import o.d;
import android.view.MenuItem;
import androidx.collection.m;
import android.content.Context;

abstract class c
{
    final Context l;
    private m<o.c, MenuItem> m;
    private m<d, SubMenu> n;
    
    c(final Context l) {
        this.l = l;
    }
    
    final MenuItem e(MenuItem menuItem) {
        Object o = menuItem;
        if (menuItem instanceof o.c) {
            final o.c c = (o.c)menuItem;
            if (this.m == null) {
                this.m = new m<o.c, MenuItem>();
            }
            menuItem = this.m.get(menuItem);
            if ((o = menuItem) == null) {
                o = new k(this.l, c);
                this.m.put(c, (MenuItem)o);
            }
        }
        return (MenuItem)o;
    }
    
    final SubMenu f(SubMenu o) {
        if (o instanceof d) {
            final d d = (d)o;
            if (this.n == null) {
                this.n = new m<d, SubMenu>();
            }
            if ((o = this.n.get(d)) == null) {
                o = new t(this.l, d);
                this.n.put(d, (SubMenu)o);
            }
            return (SubMenu)o;
        }
        return (SubMenu)o;
    }
    
    final void g() {
        final m<o.c, MenuItem> m = this.m;
        if (m != null) {
            m.clear();
        }
        final m<d, SubMenu> n = this.n;
        if (n != null) {
            n.clear();
        }
    }
    
    final void h(final int n) {
        if (this.m == null) {
            return;
        }
        int n2;
        for (int i = 0; i < this.m.size(); i = n2 + 1) {
            n2 = i;
            if (((MenuItem)this.m.i(i)).getGroupId() == n) {
                this.m.k(i);
                n2 = i - 1;
            }
        }
    }
    
    final void i(final int n) {
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); ++i) {
            if (((MenuItem)this.m.i(i)).getItemId() == n) {
                this.m.k(i);
                break;
            }
        }
    }
}
