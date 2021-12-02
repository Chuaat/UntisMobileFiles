// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import o.a;
import android.content.Context;
import o.d;
import androidx.annotation.t0;
import android.view.SubMenu;

@t0({ t0.a.I })
class t extends p implements SubMenu
{
    private final d p;
    
    t(final Context context, final d p2) {
        super(context, p2);
        this.p = p2;
    }
    
    public void clearHeader() {
        ((SubMenu)this.p).clearHeader();
    }
    
    public MenuItem getItem() {
        return this.e(((SubMenu)this.p).getItem());
    }
    
    public SubMenu setHeaderIcon(final int headerIcon) {
        ((SubMenu)this.p).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderIcon(final Drawable headerIcon) {
        ((SubMenu)this.p).setHeaderIcon(headerIcon);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderTitle(final int headerTitle) {
        ((SubMenu)this.p).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderTitle(final CharSequence headerTitle) {
        ((SubMenu)this.p).setHeaderTitle(headerTitle);
        return (SubMenu)this;
    }
    
    public SubMenu setHeaderView(final View headerView) {
        ((SubMenu)this.p).setHeaderView(headerView);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final int icon) {
        ((SubMenu)this.p).setIcon(icon);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final Drawable icon) {
        ((SubMenu)this.p).setIcon(icon);
        return (SubMenu)this;
    }
}
