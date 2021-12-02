// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.view.View;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import androidx.annotation.j0;
import android.view.MenuItem;
import android.content.Context;
import androidx.annotation.t0;
import android.view.SubMenu;

@t0({ t0.a.I })
public class s extends g implements SubMenu
{
    private g Q;
    private j R;
    
    public s(final Context context, final g q, final j r) {
        super(context);
        this.Q = q;
        this.R = r;
    }
    
    @Override
    public g G() {
        return this.Q.G();
    }
    
    @Override
    public boolean I() {
        return this.Q.I();
    }
    
    public boolean J() {
        return this.Q.J();
    }
    
    @Override
    public boolean K() {
        return this.Q.K();
    }
    
    @Override
    public void X(final a a) {
        this.Q.X(a);
    }
    
    @Override
    public boolean g(final j j) {
        return this.Q.g(j);
    }
    
    public MenuItem getItem() {
        return (MenuItem)this.R;
    }
    
    @Override
    boolean i(@j0 final g g, @j0 final MenuItem menuItem) {
        return super.i(g, menuItem) || this.Q.i(g, menuItem);
    }
    
    @Override
    public void j0(final boolean b) {
        this.Q.j0(b);
    }
    
    @Override
    public boolean n(final j j) {
        return this.Q.n(j);
    }
    
    public Menu n0() {
        return (Menu)this.Q;
    }
    
    @Override
    public void setGroupDividerEnabled(final boolean groupDividerEnabled) {
        this.Q.setGroupDividerEnabled(groupDividerEnabled);
    }
    
    public SubMenu setHeaderIcon(final int n) {
        return (SubMenu)super.b0(n);
    }
    
    public SubMenu setHeaderIcon(final Drawable drawable) {
        return (SubMenu)super.c0(drawable);
    }
    
    public SubMenu setHeaderTitle(final int n) {
        return (SubMenu)super.e0(n);
    }
    
    public SubMenu setHeaderTitle(final CharSequence charSequence) {
        return (SubMenu)super.f0(charSequence);
    }
    
    public SubMenu setHeaderView(final View view) {
        return (SubMenu)super.g0(view);
    }
    
    public SubMenu setIcon(final int icon) {
        this.R.setIcon(icon);
        return (SubMenu)this;
    }
    
    public SubMenu setIcon(final Drawable icon) {
        this.R.setIcon(icon);
        return (SubMenu)this;
    }
    
    @Override
    public void setQwertyMode(final boolean qwertyMode) {
        this.Q.setQwertyMode(qwertyMode);
    }
    
    public String w() {
        final j r = this.R;
        int itemId;
        if (r != null) {
            itemId = r.getItemId();
        }
        else {
            itemId = 0;
        }
        if (itemId == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(super.w());
        sb.append(":");
        sb.append(itemId);
        return sb.toString();
    }
}
