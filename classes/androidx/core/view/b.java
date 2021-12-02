// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.util.Log;
import androidx.annotation.t0;
import android.view.SubMenu;
import android.view.MenuItem;
import android.view.View;
import android.content.Context;

public abstract class b
{
    private static final String d = "ActionProvider(support)";
    private final Context a;
    private a b;
    private b c;
    
    public b(final Context a) {
        this.a = a;
    }
    
    public Context a() {
        return this.a;
    }
    
    public boolean b() {
        return false;
    }
    
    public boolean c() {
        return true;
    }
    
    public abstract View d();
    
    public View e(final MenuItem menuItem) {
        return this.d();
    }
    
    public boolean f() {
        return false;
    }
    
    public void g(final SubMenu subMenu) {
    }
    
    public boolean h() {
        return false;
    }
    
    public void i() {
        if (this.c != null && this.h()) {
            this.c.onActionProviderVisibilityChanged(this.c());
        }
    }
    
    @t0({ t0.a.I })
    public void j() {
        this.c = null;
        this.b = null;
    }
    
    @t0({ t0.a.I })
    public void k(final a b) {
        this.b = b;
    }
    
    public void l(final b c) {
        if (this.c != null && c != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(this.getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.c = c;
    }
    
    @t0({ t0.a.I })
    public void m(final boolean b) {
        final a b2 = this.b;
        if (b2 != null) {
            b2.a(b);
        }
    }
    
    @t0({ t0.a.I })
    public interface a
    {
        void a(final boolean p0);
    }
    
    public interface b
    {
        void onActionProviderVisibilityChanged(final boolean p0);
    }
}
