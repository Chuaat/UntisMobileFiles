// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import androidx.annotation.k0;
import androidx.annotation.h0;
import androidx.annotation.t0;
import android.widget.ListView;
import android.view.MenuInflater;
import android.view.Menu;
import androidx.appcompat.view.menu.q;
import android.widget.PopupWindow$OnDismissListener;
import android.view.MenuItem;
import androidx.annotation.x0;
import androidx.annotation.f;
import c.a;
import androidx.annotation.j0;
import android.view.View$OnTouchListener;
import androidx.appcompat.view.menu.m;
import android.view.View;
import androidx.appcompat.view.menu.g;
import android.content.Context;

public class i0
{
    private final Context a;
    private final g b;
    private final View c;
    final m d;
    e e;
    d f;
    private View$OnTouchListener g;
    
    public i0(@j0 final Context context, @j0 final View view) {
        this(context, view, 0);
    }
    
    public i0(@j0 final Context context, @j0 final View view, final int n) {
        this(context, view, n, c.a.c.G2, 0);
    }
    
    public i0(@j0 final Context a, @j0 final View c, final int n, @f final int n2, @x0 final int n3) {
        this.a = a;
        this.c = c;
        final g b = new g(a);
        (this.b = b).X((g.a)new g.a() {
            @Override
            public boolean a(@j0 final g g, @j0 final MenuItem menuItem) {
                final e e = i0.this.e;
                return e != null && e.onMenuItemClick(menuItem);
            }
            
            @Override
            public void b(@j0 final g g) {
            }
        });
        final m d = new m(a, b, c, false, n2, n3);
        (this.d = d).j(n);
        d.k((PopupWindow$OnDismissListener)new PopupWindow$OnDismissListener() {
            public void onDismiss() {
                final i0 g = i0.this;
                final d f = g.f;
                if (f != null) {
                    f.a(g);
                }
            }
        });
    }
    
    public void a() {
        this.d.dismiss();
    }
    
    @j0
    public View$OnTouchListener b() {
        if (this.g == null) {
            this.g = (View$OnTouchListener)new e0(this.c) {
                @Override
                public q b() {
                    return i0.this.d.e();
                }
                
                @Override
                protected boolean c() {
                    i0.this.k();
                    return true;
                }
                
                @Override
                protected boolean d() {
                    i0.this.a();
                    return true;
                }
            };
        }
        return this.g;
    }
    
    public int c() {
        return this.d.c();
    }
    
    @j0
    public Menu d() {
        return (Menu)this.b;
    }
    
    @j0
    public MenuInflater e() {
        return new androidx.appcompat.view.g(this.a);
    }
    
    @t0({ t0.a.I })
    ListView f() {
        if (!this.d.f()) {
            return null;
        }
        return this.d.d();
    }
    
    public void g(@h0 final int n) {
        this.e().inflate(n, (Menu)this.b);
    }
    
    public void h(final int n) {
        this.d.j(n);
    }
    
    public void i(@k0 final d f) {
        this.f = f;
    }
    
    public void j(@k0 final e e) {
        this.e = e;
    }
    
    public void k() {
        this.d.l();
    }
    
    public interface d
    {
        void a(final i0 p0);
    }
    
    public interface e
    {
        boolean onMenuItemClick(final MenuItem p0);
    }
}
