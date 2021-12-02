// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.view.View$OnTouchListener;
import android.view.View;
import androidx.annotation.j0;
import android.widget.ListPopupWindow;

public final class l
{
    private l() {
    }
    
    @k0
    public static View$OnTouchListener a(@j0 final ListPopupWindow listPopupWindow, @j0 final View view) {
        if (Build$VERSION.SDK_INT >= 19) {
            return listPopupWindow.createDragToOpenListener(view);
        }
        return null;
    }
    
    @Deprecated
    public static View$OnTouchListener b(final Object o, final View view) {
        return a((ListPopupWindow)o, view);
    }
}
