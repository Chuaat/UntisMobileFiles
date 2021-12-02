// 
// Decompiled by Procyon v0.5.36
// 

package v2;

import android.os.Bundle;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.annotation.y;
import androidx.annotation.j0;
import android.view.View;

public final class c
{
    @j0
    private final View a;
    private boolean b;
    @y
    private int c;
    
    public c(final b b) {
        this.b = false;
        this.c = 0;
        this.a = (View)b;
    }
    
    private void a() {
        final ViewParent parent = this.a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout)parent).j(this.a);
        }
    }
    
    @y
    public int b() {
        return this.c;
    }
    
    public boolean c() {
        return this.b;
    }
    
    public void d(@j0 final Bundle bundle) {
        this.b = bundle.getBoolean("expanded", false);
        this.c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.b) {
            this.a();
        }
    }
    
    @j0
    public Bundle e() {
        final Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.b);
        bundle.putInt("expandedComponentIdHint", this.c);
        return bundle;
    }
    
    public boolean f(final boolean b) {
        if (this.b != b) {
            this.b = b;
            this.a();
            return true;
        }
        return false;
    }
    
    public void g(@y final int c) {
        this.c = c;
    }
}
