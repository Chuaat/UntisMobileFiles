// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import android.view.ViewParent;
import n0.a;
import androidx.annotation.j0;
import android.view.View;

public class f1
{
    private f1() {
    }
    
    @k0
    public static y a(@j0 View view) {
        y y2;
        final y y = y2 = (y)view.getTag(a.a.a);
        if (y != null) {
            return y;
        }
        while (true) {
            final ViewParent parent = view.getParent();
            if (y2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View)parent;
            y2 = (y)view.getTag(a.a.a);
        }
        return y2;
    }
    
    public static void b(@j0 final View view, @k0 final y y) {
        view.setTag(a.a.a, (Object)y);
    }
}
