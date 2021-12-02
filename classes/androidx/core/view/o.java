// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.MenuItem;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import o.a;
import android.view.Menu;

public final class o
{
    private o() {
    }
    
    @SuppressLint({ "NewApi" })
    public static void a(final Menu menu, final boolean b) {
        if (menu instanceof a) {
            ((a)menu).setGroupDividerEnabled(b);
        }
        else if (Build$VERSION.SDK_INT >= 28) {
            menu.setGroupDividerEnabled(b);
        }
    }
    
    @Deprecated
    public static void b(final MenuItem menuItem, final int showAsAction) {
        menuItem.setShowAsAction(showAsAction);
    }
}
