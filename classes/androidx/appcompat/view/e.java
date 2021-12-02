// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.view;

import androidx.appcompat.view.menu.m;
import androidx.appcompat.view.menu.s;
import android.view.MenuInflater;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.j0;
import android.view.View;
import java.lang.ref.WeakReference;
import androidx.appcompat.widget.ActionBarContextView;
import android.content.Context;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.g;

@t0({ t0.a.I })
public class e extends b implements g.a
{
    private Context I;
    private ActionBarContextView J;
    private a K;
    private WeakReference<View> L;
    private boolean M;
    private boolean N;
    private g O;
    
    public e(final Context i, final ActionBarContextView j, final a k, final boolean n) {
        this.I = i;
        this.J = j;
        this.K = k;
        (this.O = new g(j.getContext()).Z(1)).X((g.a)this);
        this.N = n;
    }
    
    @Override
    public boolean a(@j0 final g g, @j0 final MenuItem menuItem) {
        return this.K.d(this, menuItem);
    }
    
    @Override
    public void b(@j0 final g g) {
        this.k();
        this.J.o();
    }
    
    @Override
    public void c() {
        if (this.M) {
            return;
        }
        this.M = true;
        this.J.sendAccessibilityEvent(32);
        this.K.a(this);
    }
    
    @Override
    public View d() {
        final WeakReference<View> l = this.L;
        View view;
        if (l != null) {
            view = l.get();
        }
        else {
            view = null;
        }
        return view;
    }
    
    @Override
    public Menu e() {
        return (Menu)this.O;
    }
    
    @Override
    public MenuInflater f() {
        return new androidx.appcompat.view.g(this.J.getContext());
    }
    
    @Override
    public CharSequence g() {
        return this.J.getSubtitle();
    }
    
    @Override
    public CharSequence i() {
        return this.J.getTitle();
    }
    
    @Override
    public void k() {
        this.K.c(this, (Menu)this.O);
    }
    
    @Override
    public boolean l() {
        return this.J.s();
    }
    
    @Override
    public boolean m() {
        return this.N;
    }
    
    @Override
    public void n(final View view) {
        this.J.setCustomView(view);
        WeakReference<View> l;
        if (view != null) {
            l = new WeakReference<View>(view);
        }
        else {
            l = null;
        }
        this.L = l;
    }
    
    @Override
    public void o(final int n) {
        this.p(this.I.getString(n));
    }
    
    @Override
    public void p(final CharSequence subtitle) {
        this.J.setSubtitle(subtitle);
    }
    
    @Override
    public void r(final int n) {
        this.s(this.I.getString(n));
    }
    
    @Override
    public void s(final CharSequence title) {
        this.J.setTitle(title);
    }
    
    @Override
    public void t(final boolean titleOptional) {
        super.t(titleOptional);
        this.J.setTitleOptional(titleOptional);
    }
    
    public void u(final g g, final boolean b) {
    }
    
    public void v(final s s) {
    }
    
    public boolean w(final s s) {
        if (!s.hasVisibleItems()) {
            return true;
        }
        new m(this.J.getContext(), s).l();
        return true;
    }
}
