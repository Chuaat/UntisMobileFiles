// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.k0;
import android.view.ViewParent;
import p0.a;
import androidx.annotation.j0;
import android.view.View;

public class g1
{
    private g1() {
    }
    
    @k0
    public static d1 a(@j0 View view) {
        d1 d2;
        final d1 d1 = d2 = (d1)view.getTag(a.a.a);
        if (d1 != null) {
            return d1;
        }
        while (true) {
            final ViewParent parent = view.getParent();
            if (d2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View)parent;
            d2 = (d1)view.getTag(a.a.a);
        }
        return d2;
    }
    
    public static void b(@j0 final View view, @k0 final d1 d1) {
        view.setTag(a.a.a, (Object)d1);
    }
}
