// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view.menu;

import android.widget.FrameLayout;
import androidx.annotation.p0;
import android.view.ActionProvider$VisibilityListener;
import android.view.MenuItem$OnMenuItemClickListener;
import android.view.MenuItem$OnActionExpandListener;
import android.view.CollapsibleActionView;
import android.os.Build$VERSION;
import android.util.Log;
import android.view.SubMenu;
import android.view.ContextMenu$ContextMenuInfo;
import android.content.Intent;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.view.b;
import android.view.ActionProvider;
import android.content.Context;
import java.lang.reflect.Method;
import androidx.annotation.t0;
import android.view.MenuItem;

@t0({ t0.a.I })
public class k extends androidx.appcompat.view.menu.c implements MenuItem
{
    static final String q = "MenuItemWrapper";
    private final o.c o;
    private Method p;
    
    public k(final Context context, final o.c o) {
        super(context);
        if (o != null) {
            this.o = o;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }
    
    public boolean collapseActionView() {
        return this.o.collapseActionView();
    }
    
    public boolean expandActionView() {
        return this.o.expandActionView();
    }
    
    public ActionProvider getActionProvider() {
        final androidx.core.view.b b = this.o.b();
        if (b instanceof a) {
            return ((a)b).e;
        }
        return null;
    }
    
    public View getActionView() {
        View view2;
        final View view = view2 = this.o.getActionView();
        if (view instanceof c) {
            view2 = ((c)view).a();
        }
        return view2;
    }
    
    public int getAlphabeticModifiers() {
        return this.o.getAlphabeticModifiers();
    }
    
    public char getAlphabeticShortcut() {
        return ((MenuItem)this.o).getAlphabeticShortcut();
    }
    
    public CharSequence getContentDescription() {
        return this.o.getContentDescription();
    }
    
    public int getGroupId() {
        return ((MenuItem)this.o).getGroupId();
    }
    
    public Drawable getIcon() {
        return ((MenuItem)this.o).getIcon();
    }
    
    public ColorStateList getIconTintList() {
        return this.o.getIconTintList();
    }
    
    public PorterDuff$Mode getIconTintMode() {
        return this.o.getIconTintMode();
    }
    
    public Intent getIntent() {
        return ((MenuItem)this.o).getIntent();
    }
    
    public int getItemId() {
        return ((MenuItem)this.o).getItemId();
    }
    
    public ContextMenu$ContextMenuInfo getMenuInfo() {
        return ((MenuItem)this.o).getMenuInfo();
    }
    
    public int getNumericModifiers() {
        return this.o.getNumericModifiers();
    }
    
    public char getNumericShortcut() {
        return ((MenuItem)this.o).getNumericShortcut();
    }
    
    public int getOrder() {
        return ((MenuItem)this.o).getOrder();
    }
    
    public SubMenu getSubMenu() {
        return this.f(((MenuItem)this.o).getSubMenu());
    }
    
    public CharSequence getTitle() {
        return ((MenuItem)this.o).getTitle();
    }
    
    public CharSequence getTitleCondensed() {
        return ((MenuItem)this.o).getTitleCondensed();
    }
    
    public CharSequence getTooltipText() {
        return this.o.getTooltipText();
    }
    
    public boolean hasSubMenu() {
        return ((MenuItem)this.o).hasSubMenu();
    }
    
    public boolean isActionViewExpanded() {
        return this.o.isActionViewExpanded();
    }
    
    public boolean isCheckable() {
        return ((MenuItem)this.o).isCheckable();
    }
    
    public boolean isChecked() {
        return ((MenuItem)this.o).isChecked();
    }
    
    public boolean isEnabled() {
        return ((MenuItem)this.o).isEnabled();
    }
    
    public boolean isVisible() {
        return ((MenuItem)this.o).isVisible();
    }
    
    public void j(final boolean b) {
        try {
            if (this.p == null) {
                this.p = this.o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.p.invoke(this.o, b);
        }
        catch (Exception ex) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", (Throwable)ex);
        }
    }
    
    public MenuItem setActionProvider(final ActionProvider actionProvider) {
        androidx.core.view.b b;
        if (Build$VERSION.SDK_INT >= 16) {
            b = new b(super.l, actionProvider);
        }
        else {
            b = new a(super.l, actionProvider);
        }
        final o.c o = this.o;
        if (actionProvider == null) {
            b = null;
        }
        o.a(b);
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final int actionView) {
        this.o.setActionView(actionView);
        final View actionView2 = this.o.getActionView();
        if (actionView2 instanceof CollapsibleActionView) {
            this.o.setActionView((View)new c(actionView2));
        }
        return (MenuItem)this;
    }
    
    public MenuItem setActionView(final View view) {
        Object actionView = view;
        if (view instanceof CollapsibleActionView) {
            actionView = new c(view);
        }
        this.o.setActionView((View)actionView);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char alphabeticShortcut) {
        ((MenuItem)this.o).setAlphabeticShortcut(alphabeticShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setAlphabeticShortcut(final char c, final int n) {
        this.o.setAlphabeticShortcut(c, n);
        return (MenuItem)this;
    }
    
    public MenuItem setCheckable(final boolean checkable) {
        ((MenuItem)this.o).setCheckable(checkable);
        return (MenuItem)this;
    }
    
    public MenuItem setChecked(final boolean checked) {
        ((MenuItem)this.o).setChecked(checked);
        return (MenuItem)this;
    }
    
    public MenuItem setContentDescription(final CharSequence contentDescription) {
        this.o.setContentDescription(contentDescription);
        return (MenuItem)this;
    }
    
    public MenuItem setEnabled(final boolean enabled) {
        ((MenuItem)this.o).setEnabled(enabled);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final int icon) {
        ((MenuItem)this.o).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIcon(final Drawable icon) {
        ((MenuItem)this.o).setIcon(icon);
        return (MenuItem)this;
    }
    
    public MenuItem setIconTintList(final ColorStateList iconTintList) {
        this.o.setIconTintList(iconTintList);
        return (MenuItem)this;
    }
    
    public MenuItem setIconTintMode(final PorterDuff$Mode iconTintMode) {
        this.o.setIconTintMode(iconTintMode);
        return (MenuItem)this;
    }
    
    public MenuItem setIntent(final Intent intent) {
        ((MenuItem)this.o).setIntent(intent);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char numericShortcut) {
        ((MenuItem)this.o).setNumericShortcut(numericShortcut);
        return (MenuItem)this;
    }
    
    public MenuItem setNumericShortcut(final char c, final int n) {
        this.o.setNumericShortcut(c, n);
        return (MenuItem)this;
    }
    
    public MenuItem setOnActionExpandListener(final MenuItem$OnActionExpandListener menuItem$OnActionExpandListener) {
        final o.c o = this.o;
        Object onActionExpandListener;
        if (menuItem$OnActionExpandListener != null) {
            onActionExpandListener = new d(menuItem$OnActionExpandListener);
        }
        else {
            onActionExpandListener = null;
        }
        ((MenuItem)o).setOnActionExpandListener((MenuItem$OnActionExpandListener)onActionExpandListener);
        return (MenuItem)this;
    }
    
    public MenuItem setOnMenuItemClickListener(final MenuItem$OnMenuItemClickListener menuItem$OnMenuItemClickListener) {
        final o.c o = this.o;
        Object onMenuItemClickListener;
        if (menuItem$OnMenuItemClickListener != null) {
            onMenuItemClickListener = new e(menuItem$OnMenuItemClickListener);
        }
        else {
            onMenuItemClickListener = null;
        }
        ((MenuItem)o).setOnMenuItemClickListener((MenuItem$OnMenuItemClickListener)onMenuItemClickListener);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char c2) {
        ((MenuItem)this.o).setShortcut(c, c2);
        return (MenuItem)this;
    }
    
    public MenuItem setShortcut(final char c, final char c2, final int n, final int n2) {
        this.o.setShortcut(c, c2, n, n2);
        return (MenuItem)this;
    }
    
    public void setShowAsAction(final int showAsAction) {
        this.o.setShowAsAction(showAsAction);
    }
    
    public MenuItem setShowAsActionFlags(final int showAsActionFlags) {
        this.o.setShowAsActionFlags(showAsActionFlags);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final int title) {
        ((MenuItem)this.o).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitle(final CharSequence title) {
        ((MenuItem)this.o).setTitle(title);
        return (MenuItem)this;
    }
    
    public MenuItem setTitleCondensed(final CharSequence titleCondensed) {
        ((MenuItem)this.o).setTitleCondensed(titleCondensed);
        return (MenuItem)this;
    }
    
    public MenuItem setTooltipText(final CharSequence tooltipText) {
        this.o.setTooltipText(tooltipText);
        return (MenuItem)this;
    }
    
    public MenuItem setVisible(final boolean visible) {
        return ((MenuItem)this.o).setVisible(visible);
    }
    
    private class a extends b
    {
        final ActionProvider e;
        
        a(final Context context, final ActionProvider e) {
            super(context);
            this.e = e;
        }
        
        @Override
        public boolean b() {
            return this.e.hasSubMenu();
        }
        
        @Override
        public View d() {
            return this.e.onCreateActionView();
        }
        
        @Override
        public boolean f() {
            return this.e.onPerformDefaultAction();
        }
        
        @Override
        public void g(final SubMenu subMenu) {
            this.e.onPrepareSubMenu(k.this.f(subMenu));
        }
    }
    
    @p0(16)
    private class b extends a implements ActionProvider$VisibilityListener
    {
        private androidx.core.view.b.b g;
        
        b(final Context context, final ActionProvider actionProvider) {
            super(context, actionProvider);
        }
        
        public boolean c() {
            return super.e.isVisible();
        }
        
        public View e(final MenuItem menuItem) {
            return super.e.onCreateActionView(menuItem);
        }
        
        public boolean h() {
            return super.e.overridesItemVisibility();
        }
        
        public void i() {
            super.e.refreshVisibility();
        }
        
        public void l(final androidx.core.view.b.b g) {
            this.g = g;
            final ActionProvider e = super.e;
            Object visibilityListener;
            if (g != null) {
                visibilityListener = this;
            }
            else {
                visibilityListener = null;
            }
            e.setVisibilityListener((ActionProvider$VisibilityListener)visibilityListener);
        }
        
        public void onActionProviderVisibilityChanged(final boolean b) {
            final androidx.core.view.b.b g = this.g;
            if (g != null) {
                g.onActionProviderVisibilityChanged(b);
            }
        }
    }
    
    static class c extends FrameLayout implements androidx.appcompat.view.c
    {
        final CollapsibleActionView G;
        
        c(final View view) {
            super(view.getContext());
            this.G = (CollapsibleActionView)view;
            this.addView(view);
        }
        
        View a() {
            return (View)this.G;
        }
        
        public void c() {
            this.G.onActionViewExpanded();
        }
        
        public void h() {
            this.G.onActionViewCollapsed();
        }
    }
    
    private class d implements MenuItem$OnActionExpandListener
    {
        private final MenuItem$OnActionExpandListener a;
        
        d(final MenuItem$OnActionExpandListener a) {
            this.a = a;
        }
        
        public boolean onMenuItemActionCollapse(final MenuItem menuItem) {
            return this.a.onMenuItemActionCollapse(k.this.e(menuItem));
        }
        
        public boolean onMenuItemActionExpand(final MenuItem menuItem) {
            return this.a.onMenuItemActionExpand(k.this.e(menuItem));
        }
    }
    
    private class e implements MenuItem$OnMenuItemClickListener
    {
        private final MenuItem$OnMenuItemClickListener G;
        
        e(final MenuItem$OnMenuItemClickListener g) {
            this.G = g;
        }
        
        public boolean onMenuItemClick(final MenuItem menuItem) {
            return this.G.onMenuItemClick(k.this.e(menuItem));
        }
    }
}
