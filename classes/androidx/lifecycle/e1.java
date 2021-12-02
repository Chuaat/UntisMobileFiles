// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.fragment.app.d;
import androidx.annotation.g0;
import androidx.annotation.j0;
import androidx.fragment.app.Fragment;

@Deprecated
public class e1
{
    private e1() {
    }
    
    @Deprecated
    @g0
    @j0
    public static c1 a(@j0 final Fragment fragment) {
        return fragment.getViewModelStore();
    }
    
    @Deprecated
    @g0
    @j0
    public static c1 b(@j0 final d d) {
        return d.getViewModelStore();
    }
}
