// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.j0;
import android.view.View;
import android.view.WindowId;
import androidx.annotation.p0;

@p0(18)
class i1 implements j1
{
    private final WindowId a;
    
    i1(@j0 final View view) {
        this.a = view.getWindowId();
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof i1 && ((i1)o).a.equals((Object)this.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
}
