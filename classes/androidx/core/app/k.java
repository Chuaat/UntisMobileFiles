// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.j0;
import android.app.Dialog;

public class k
{
    private k() {
    }
    
    @j0
    public static View a(@j0 final Dialog dialog, final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return dialog.requireViewById(n);
        }
        final View viewById = dialog.findViewById(n);
        if (viewById != null) {
            return viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
