// 
// Decompiled by Procyon v0.5.36
// 

package o;

import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import android.view.View;
import androidx.core.view.b;
import androidx.annotation.t0;
import android.view.MenuItem;

@t0({ t0.a.I })
public interface c extends MenuItem
{
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 4;
    public static final int k = 8;
    
    c a(final b p0);
    
    b b();
    
    boolean c();
    
    boolean collapseActionView();
    
    boolean d();
    
    boolean expandActionView();
    
    View getActionView();
    
    int getAlphabeticModifiers();
    
    CharSequence getContentDescription();
    
    ColorStateList getIconTintList();
    
    PorterDuff$Mode getIconTintMode();
    
    int getNumericModifiers();
    
    CharSequence getTooltipText();
    
    boolean isActionViewExpanded();
    
    MenuItem setActionView(final int p0);
    
    MenuItem setActionView(final View p0);
    
    MenuItem setAlphabeticShortcut(final char p0, final int p1);
    
    c setContentDescription(final CharSequence p0);
    
    MenuItem setIconTintList(final ColorStateList p0);
    
    MenuItem setIconTintMode(final PorterDuff$Mode p0);
    
    MenuItem setNumericShortcut(final char p0, final int p1);
    
    MenuItem setShortcut(final char p0, final char p1, final int p2, final int p3);
    
    void setShowAsAction(final int p0);
    
    MenuItem setShowAsActionFlags(final int p0);
    
    c setTooltipText(final CharSequence p0);
}
