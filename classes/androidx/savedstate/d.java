// 
// Decompiled by Procyon v0.5.36
// 

package androidx.savedstate;

import androidx.annotation.k0;
import android.view.ViewParent;
import androidx.annotation.j0;
import android.view.View;

public final class d
{
    private d() {
    }
    
    @k0
    public static c a(@j0 View view) {
        c c2;
        final c c = c2 = (c)view.getTag(a.a.a);
        if (c != null) {
            return c;
        }
        while (true) {
            final ViewParent parent = view.getParent();
            if (c2 != null || !(parent instanceof View)) {
                break;
            }
            view = (View)parent;
            c2 = (c)view.getTag(a.a.a);
        }
        return c2;
    }
    
    public static void b(@j0 final View view, @k0 final c c) {
        view.setTag(a.a.a, (Object)c);
    }
}
