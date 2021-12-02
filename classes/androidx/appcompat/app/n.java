// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import androidx.appcompat.view.i;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import android.annotation.SuppressLint;
import android.view.ViewGroup$LayoutParams;
import android.view.LayoutInflater;
import androidx.annotation.k0;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.content.res.Configuration;
import android.view.View;
import androidx.core.view.j0;
import android.content.Context;
import androidx.appcompat.view.menu.g;
import android.view.Menu;
import androidx.appcompat.widget.v0;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import android.view.Window$Callback;
import androidx.appcompat.widget.a0;

class n extends a
{
    a0 i;
    boolean j;
    Window$Callback k;
    private boolean l;
    private boolean m;
    private ArrayList<androidx.appcompat.app.a.d> n;
    private final Runnable o;
    private final Toolbar.f p;
    
    n(final Toolbar toolbar, final CharSequence windowTitle, final Window$Callback window$Callback) {
        this.n = new ArrayList<androidx.appcompat.app.a.d>();
        this.o = new Runnable() {
            @Override
            public void run() {
                androidx.appcompat.app.n.this.G0();
            }
        };
        final Toolbar.f f = new Toolbar.f() {
            @Override
            public boolean onMenuItemClick(final MenuItem menuItem) {
                return androidx.appcompat.app.n.this.k.onMenuItemSelected(0, menuItem);
            }
        };
        this.p = f;
        this.i = new v0(toolbar, false);
        final e e = new e(window$Callback);
        this.k = (Window$Callback)e;
        this.i.setWindowCallback((Window$Callback)e);
        toolbar.setOnMenuItemClickListener((Toolbar.f)f);
        this.i.setWindowTitle(windowTitle);
    }
    
    private Menu E0() {
        if (!this.l) {
            this.i.F(new c(), new d());
            this.l = true;
        }
        return this.i.y();
    }
    
    @Override
    public Context A() {
        return this.i.getContext();
    }
    
    @Override
    public void A0(final CharSequence title) {
        this.i.setTitle(title);
    }
    
    @Override
    public CharSequence B() {
        return this.i.getTitle();
    }
    
    @Override
    public void B0(final CharSequence windowTitle) {
        this.i.setWindowTitle(windowTitle);
    }
    
    @Override
    public void C() {
        this.i.setVisibility(8);
    }
    
    @Override
    public void C0() {
        this.i.setVisibility(0);
    }
    
    @Override
    public boolean D() {
        this.i.G().removeCallbacks(this.o);
        j0.n1((View)this.i.G(), this.o);
        return true;
    }
    
    @Override
    public boolean F() {
        return this.i.getVisibility() == 0;
    }
    
    public Window$Callback F0() {
        return this.k;
    }
    
    @Override
    public boolean G() {
        return super.G();
    }
    
    void G0() {
        final Menu e0 = this.E0();
        androidx.appcompat.view.menu.g g;
        if (e0 instanceof androidx.appcompat.view.menu.g) {
            g = (androidx.appcompat.view.menu.g)e0;
        }
        else {
            g = null;
        }
        if (g != null) {
            g.m0();
        }
        try {
            e0.clear();
            if (!this.k.onCreatePanelMenu(0, e0) || !this.k.onPreparePanel(0, (View)null, e0)) {
                e0.clear();
            }
        }
        finally {
            if (g != null) {
                g.l0();
            }
        }
    }
    
    @Override
    public f H() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void I(final Configuration configuration) {
        super.I(configuration);
    }
    
    @Override
    void J() {
        this.i.G().removeCallbacks(this.o);
    }
    
    @Override
    public boolean K(final int n, final KeyEvent keyEvent) {
        final Menu e0 = this.E0();
        if (e0 != null) {
            int deviceId;
            if (keyEvent != null) {
                deviceId = keyEvent.getDeviceId();
            }
            else {
                deviceId = -1;
            }
            final int keyboardType = KeyCharacterMap.load(deviceId).getKeyboardType();
            boolean qwertyMode = true;
            if (keyboardType == 1) {
                qwertyMode = false;
            }
            e0.setQwertyMode(qwertyMode);
            return e0.performShortcut(n, keyEvent, 0);
        }
        return false;
    }
    
    @Override
    public boolean L(final KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            this.M();
        }
        return true;
    }
    
    @Override
    public boolean M() {
        return this.i.k();
    }
    
    @Override
    public void N() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void O(final androidx.appcompat.app.a.d o) {
        this.n.remove(o);
    }
    
    @Override
    public void P(final f f) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void Q(final int n) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    public boolean R() {
        final ViewGroup g = this.i.G();
        if (g != null && !g.hasFocus()) {
            g.requestFocus();
            return true;
        }
        return false;
    }
    
    @Override
    public void S(final f f) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void T(@k0 final Drawable drawable) {
        this.i.b(drawable);
    }
    
    @Override
    public void U(final int n) {
        this.V(LayoutInflater.from(this.i.getContext()).inflate(n, this.i.G(), false));
    }
    
    @Override
    public void V(final View view) {
        this.W(view, new b(-2, -2));
    }
    
    @Override
    public void W(final View view, final b layoutParams) {
        if (view != null) {
            view.setLayoutParams((ViewGroup$LayoutParams)layoutParams);
        }
        this.i.O(view);
    }
    
    @Override
    public void X(final boolean b) {
    }
    
    @Override
    public void Y(final boolean b) {
        int n;
        if (b) {
            n = 4;
        }
        else {
            n = 0;
        }
        this.a0(n, 4);
    }
    
    @SuppressLint({ "WrongConstant" })
    @Override
    public void Z(final int n) {
        this.a0(n, -1);
    }
    
    @Override
    public void a0(final int n, final int n2) {
        this.i.s((n & n2) | (~n2 & this.i.L()));
    }
    
    @Override
    public void b0(final boolean b) {
        int n;
        if (b) {
            n = 16;
        }
        else {
            n = 0;
        }
        this.a0(n, 16);
    }
    
    @Override
    public void c0(final boolean b) {
        int n;
        if (b) {
            n = 2;
        }
        else {
            n = 0;
        }
        this.a0(n, 2);
    }
    
    @Override
    public void d0(final boolean b) {
        int n;
        if (b) {
            n = 8;
        }
        else {
            n = 0;
        }
        this.a0(n, 8);
    }
    
    @Override
    public void e0(final boolean b) {
        this.a0(b ? 1 : 0, 1);
    }
    
    @Override
    public void f0(final float n) {
        j0.L1((View)this.i.G(), n);
    }
    
    @Override
    public void g(final androidx.appcompat.app.a.d e) {
        this.n.add(e);
    }
    
    @Override
    public void h(final f f) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void i(final f f, final int n) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void i0(final int n) {
        this.i.N(n);
    }
    
    @Override
    public void j(final f f, final int n, final boolean b) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void j0(final CharSequence charSequence) {
        this.i.t(charSequence);
    }
    
    @Override
    public void k(final f f, final boolean b) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void k0(final int n) {
        this.i.E(n);
    }
    
    @Override
    public boolean l() {
        return this.i.j();
    }
    
    @Override
    public void l0(final Drawable drawable) {
        this.i.S(drawable);
    }
    
    @Override
    public boolean m() {
        if (this.i.q()) {
            this.i.collapseActionView();
            return true;
        }
        return false;
    }
    
    @Override
    public void m0(final boolean b) {
    }
    
    @Override
    public void n(final boolean m) {
        if (m == this.m) {
            return;
        }
        this.m = m;
        for (int size = this.n.size(), i = 0; i < size; ++i) {
            this.n.get(i).a(m);
        }
    }
    
    @Override
    public void n0(final int icon) {
        this.i.setIcon(icon);
    }
    
    @Override
    public View o() {
        return this.i.n();
    }
    
    @Override
    public void o0(final Drawable icon) {
        this.i.setIcon(icon);
    }
    
    @Override
    public int p() {
        return this.i.L();
    }
    
    @Override
    public void p0(final SpinnerAdapter spinnerAdapter, final androidx.appcompat.app.a.e e) {
        this.i.I(spinnerAdapter, (AdapterView$OnItemSelectedListener)new l(e));
    }
    
    @Override
    public float q() {
        return j0.P((View)this.i.G());
    }
    
    @Override
    public void q0(final int logo) {
        this.i.setLogo(logo);
    }
    
    @Override
    public int r() {
        return this.i.a();
    }
    
    @Override
    public void r0(final Drawable drawable) {
        this.i.p(drawable);
    }
    
    @Override
    public void s0(final int n) {
        if (n != 2) {
            this.i.D(n);
            return;
        }
        throw new IllegalArgumentException("Tabs not supported in this configuration");
    }
    
    @Override
    public int t() {
        return 0;
    }
    
    @Override
    public void t0(final int n) {
        if (this.i.A() == 1) {
            this.i.x(n);
            return;
        }
        throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");
    }
    
    @Override
    public int u() {
        return 0;
    }
    
    @Override
    public void u0(final boolean b) {
    }
    
    @Override
    public int v() {
        return -1;
    }
    
    @Override
    public void v0(final Drawable drawable) {
    }
    
    @Override
    public f w() {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void w0(final Drawable drawable) {
    }
    
    @Override
    public CharSequence x() {
        return this.i.K();
    }
    
    @Override
    public void x0(final int n) {
        final a0 i = this.i;
        CharSequence text;
        if (n != 0) {
            text = i.getContext().getText(n);
        }
        else {
            text = null;
        }
        i.u(text);
    }
    
    @Override
    public f y(final int n) {
        throw new UnsupportedOperationException("Tabs are not supported in toolbar action bars");
    }
    
    @Override
    public void y0(final CharSequence charSequence) {
        this.i.u(charSequence);
    }
    
    @Override
    public int z() {
        return 0;
    }
    
    @Override
    public void z0(final int n) {
        final a0 i = this.i;
        CharSequence text;
        if (n != 0) {
            text = i.getContext().getText(n);
        }
        else {
            text = null;
        }
        i.setTitle(text);
    }
    
    private final class c implements n.a
    {
        private boolean G;
        
        c() {
        }
        
        @Override
        public void d(@androidx.annotation.j0 final androidx.appcompat.view.menu.g g, final boolean b) {
            if (this.G) {
                return;
            }
            this.G = true;
            n.this.i.m();
            final Window$Callback k = n.this.k;
            if (k != null) {
                k.onPanelClosed(108, (Menu)g);
            }
            this.G = false;
        }
        
        @Override
        public boolean e(@androidx.annotation.j0 final androidx.appcompat.view.menu.g g) {
            final Window$Callback k = n.this.k;
            if (k != null) {
                k.onMenuOpened(108, (Menu)g);
                return true;
            }
            return false;
        }
    }
    
    private final class d implements g.a
    {
        d() {
        }
        
        @Override
        public boolean a(@androidx.annotation.j0 final g g, @androidx.annotation.j0 final MenuItem menuItem) {
            return false;
        }
        
        @Override
        public void b(@androidx.annotation.j0 final g g) {
            final n g2 = n.this;
            if (g2.k != null) {
                if (g2.i.d()) {
                    n.this.k.onPanelClosed(108, (Menu)g);
                }
                else if (n.this.k.onPreparePanel(0, (View)null, (Menu)g)) {
                    n.this.k.onMenuOpened(108, (Menu)g);
                }
            }
        }
    }
    
    private class e extends i
    {
        public e(final Window$Callback window$Callback) {
            super(window$Callback);
        }
        
        @Override
        public View onCreatePanelView(final int n) {
            if (n == 0) {
                return new View(n.this.i.getContext());
            }
            return super.onCreatePanelView(n);
        }
        
        @Override
        public boolean onPreparePanel(final int n, final View view, final Menu menu) {
            final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
            if (onPreparePanel) {
                final n h = n.this;
                if (!h.j) {
                    h.i.e();
                    n.this.j = true;
                }
            }
            return onPreparePanel;
        }
    }
}
