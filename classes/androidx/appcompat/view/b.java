// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import android.view.MenuItem;
import androidx.annotation.t0;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.View;

public abstract class b
{
    private Object G;
    private boolean H;
    
    public abstract void c();
    
    public abstract View d();
    
    public abstract Menu e();
    
    public abstract MenuInflater f();
    
    public abstract CharSequence g();
    
    public Object h() {
        return this.G;
    }
    
    public abstract CharSequence i();
    
    public boolean j() {
        return this.H;
    }
    
    public abstract void k();
    
    public boolean l() {
        return false;
    }
    
    @t0({ t0.a.I })
    public boolean m() {
        return true;
    }
    
    public abstract void n(final View p0);
    
    public abstract void o(final int p0);
    
    public abstract void p(final CharSequence p0);
    
    public void q(final Object g) {
        this.G = g;
    }
    
    public abstract void r(final int p0);
    
    public abstract void s(final CharSequence p0);
    
    public void t(final boolean h) {
        this.H = h;
    }
    
    public interface a
    {
        void a(final b p0);
        
        boolean b(final b p0, final Menu p1);
        
        boolean c(final b p0, final Menu p1);
        
        boolean d(final b p0, final MenuItem p1);
    }
}
