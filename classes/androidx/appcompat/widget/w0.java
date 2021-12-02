// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.os.Build$VERSION;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.view.View;

public class w0
{
    private w0() {
    }
    
    public static void a(@j0 final View view, @k0 final CharSequence tooltipText) {
        if (Build$VERSION.SDK_INT >= 26) {
            view.setTooltipText(tooltipText);
        }
        else {
            x0.f(view, tooltipText);
        }
    }
}
