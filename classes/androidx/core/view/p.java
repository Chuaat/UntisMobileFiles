// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.MenuItem$OnActionExpandListener;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.os.Build$VERSION;
import android.view.View;
import android.util.Log;
import o.c;
import android.view.MenuItem;

public final class p
{
    private static final String a = "MenuItemCompat";
    @Deprecated
    public static final int b = 0;
    @Deprecated
    public static final int c = 1;
    @Deprecated
    public static final int d = 2;
    @Deprecated
    public static final int e = 4;
    @Deprecated
    public static final int f = 8;
    
    private p() {
    }
    
    @Deprecated
    public static boolean a(final MenuItem menuItem) {
        return menuItem.collapseActionView();
    }
    
    @Deprecated
    public static boolean b(final MenuItem menuItem) {
        return menuItem.expandActionView();
    }
    
    public static androidx.core.view.b c(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).b();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }
    
    @Deprecated
    public static View d(final MenuItem menuItem) {
        return menuItem.getActionView();
    }
    
    public static int e(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getAlphabeticModifiers();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getAlphabeticModifiers();
        }
        return 0;
    }
    
    public static CharSequence f(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getContentDescription();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getContentDescription();
        }
        return null;
    }
    
    public static ColorStateList g(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getIconTintList();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintList();
        }
        return null;
    }
    
    public static PorterDuff$Mode h(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getIconTintMode();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getIconTintMode();
        }
        return null;
    }
    
    public static int i(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getNumericModifiers();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getNumericModifiers();
        }
        return 0;
    }
    
    public static CharSequence j(final MenuItem menuItem) {
        if (menuItem instanceof c) {
            return ((c)menuItem).getTooltipText();
        }
        if (Build$VERSION.SDK_INT >= 26) {
            return menuItem.getTooltipText();
        }
        return null;
    }
    
    @Deprecated
    public static boolean k(final MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }
    
    public static MenuItem l(final MenuItem menuItem, final androidx.core.view.b b) {
        if (menuItem instanceof c) {
            return (MenuItem)((c)menuItem).a(b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }
    
    @Deprecated
    public static MenuItem m(final MenuItem menuItem, final int actionView) {
        return menuItem.setActionView(actionView);
    }
    
    @Deprecated
    public static MenuItem n(final MenuItem menuItem, final View actionView) {
        return menuItem.setActionView(actionView);
    }
    
    public static void o(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof c) {
            ((c)menuItem).setAlphabeticShortcut(c, n);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, n);
        }
    }
    
    public static void p(final MenuItem menuItem, final CharSequence charSequence) {
        if (menuItem instanceof c) {
            ((c)menuItem).setContentDescription(charSequence);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }
    
    public static void q(final MenuItem menuItem, final ColorStateList list) {
        if (menuItem instanceof c) {
            ((c)menuItem).setIconTintList(list);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(list);
        }
    }
    
    public static void r(final MenuItem menuItem, final PorterDuff$Mode porterDuff$Mode) {
        if (menuItem instanceof c) {
            ((c)menuItem).setIconTintMode(porterDuff$Mode);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(porterDuff$Mode);
        }
    }
    
    public static void s(final MenuItem menuItem, final char c, final int n) {
        if (menuItem instanceof c) {
            ((c)menuItem).setNumericShortcut(c, n);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, n);
        }
    }
    
    @Deprecated
    public static MenuItem t(final MenuItem menuItem, final b b) {
        return menuItem.setOnActionExpandListener((MenuItem$OnActionExpandListener)new MenuItem$OnActionExpandListener() {
            public boolean onMenuItemActionCollapse(final MenuItem menuItem) {
                return b.onMenuItemActionCollapse(menuItem);
            }
            
            public boolean onMenuItemActionExpand(final MenuItem menuItem) {
                return b.onMenuItemActionExpand(menuItem);
            }
        });
    }
    
    public static void u(final MenuItem menuItem, final char c, final char c2, final int n, final int n2) {
        if (menuItem instanceof c) {
            ((c)menuItem).setShortcut(c, c2, n, n2);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setShortcut(c, c2, n, n2);
        }
    }
    
    @Deprecated
    public static void v(final MenuItem menuItem, final int showAsAction) {
        menuItem.setShowAsAction(showAsAction);
    }
    
    public static void w(final MenuItem menuItem, final CharSequence charSequence) {
        if (menuItem instanceof c) {
            ((c)menuItem).setTooltipText(charSequence);
        }
        else if (Build$VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }
    
    @Deprecated
    public interface b
    {
        boolean onMenuItemActionCollapse(final MenuItem p0);
        
        boolean onMenuItemActionExpand(final MenuItem p0);
    }
}
