// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import androidx.annotation.k0;
import android.widget.PopupMenu;
import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import androidx.annotation.j0;

public final class o
{
    private o() {
    }
    
    @k0
    public static View$OnTouchListener a(@j0 final Object o) {
        if (Build$VERSION.SDK_INT >= 19) {
            return ((PopupMenu)o).getDragToOpenListener();
        }
        return null;
    }
}
