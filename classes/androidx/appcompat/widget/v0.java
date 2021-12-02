// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.util.Log;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.AdapterView$OnItemSelectedListener;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.n;
import android.view.ViewParent;
import androidx.core.view.q0;
import androidx.core.view.r0;
import androidx.core.view.j0;
import androidx.core.view.p0;
import android.view.ViewGroup$LayoutParams;
import android.view.MenuItem;
import android.view.View$OnClickListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import android.util.AttributeSet;
import c.a;
import android.view.Window$Callback;
import android.graphics.drawable.Drawable;
import android.widget.Spinner;
import android.view.View;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class v0 implements a0
{
    private static final String s = "ToolbarWidgetWrapper";
    private static final int t = 3;
    private static final long u = 200L;
    Toolbar a;
    private int b;
    private View c;
    private Spinner d;
    private View e;
    private Drawable f;
    private Drawable g;
    private Drawable h;
    private boolean i;
    CharSequence j;
    private CharSequence k;
    private CharSequence l;
    Window$Callback m;
    boolean n;
    private c o;
    private int p;
    private int q;
    private Drawable r;
    
    public v0(final Toolbar toolbar, final boolean b) {
        this(toolbar, b, c.a.l.b, c.a.g.v);
    }
    
    public v0(final Toolbar a, final boolean b, final int n, int popupTheme) {
        this.p = 0;
        this.q = 0;
        this.a = a;
        this.j = a.getTitle();
        this.k = a.getSubtitle();
        this.i = (this.j != null);
        this.h = a.getNavigationIcon();
        final u0 g = u0.G(a.getContext(), null, c.a.n.a, c.a.c.f, 0);
        this.r = g.h(c.a.n.q);
        if (b) {
            final CharSequence x = g.x(c.a.n.C);
            if (!TextUtils.isEmpty(x)) {
                this.setTitle(x);
            }
            final CharSequence x2 = g.x(c.a.n.A);
            if (!TextUtils.isEmpty(x2)) {
                this.u(x2);
            }
            final Drawable h = g.h(c.a.n.v);
            if (h != null) {
                this.p(h);
            }
            final Drawable h2 = g.h(c.a.n.s);
            if (h2 != null) {
                this.setIcon(h2);
            }
            if (this.h == null) {
                final Drawable r = this.r;
                if (r != null) {
                    this.S(r);
                }
            }
            this.s(g.o(c.a.n.l, 0));
            popupTheme = g.u(c.a.n.k, 0);
            if (popupTheme != 0) {
                this.O(LayoutInflater.from(this.a.getContext()).inflate(popupTheme, (ViewGroup)this.a, false));
                this.s(this.b | 0x10);
            }
            popupTheme = g.q(c.a.n.o, 0);
            if (popupTheme > 0) {
                final ViewGroup$LayoutParams layoutParams = this.a.getLayoutParams();
                layoutParams.height = popupTheme;
                this.a.setLayoutParams(layoutParams);
            }
            final int f = g.f(c.a.n.i, -1);
            popupTheme = g.f(c.a.n.e, -1);
            if (f >= 0 || popupTheme >= 0) {
                this.a.J(Math.max(f, 0), Math.max(popupTheme, 0));
            }
            popupTheme = g.u(c.a.n.D, 0);
            if (popupTheme != 0) {
                final Toolbar a2 = this.a;
                a2.O(a2.getContext(), popupTheme);
            }
            popupTheme = g.u(c.a.n.B, 0);
            if (popupTheme != 0) {
                final Toolbar a3 = this.a;
                a3.M(a3.getContext(), popupTheme);
            }
            popupTheme = g.u(c.a.n.x, 0);
            if (popupTheme != 0) {
                this.a.setPopupTheme(popupTheme);
            }
        }
        else {
            this.b = this.U();
        }
        g.I();
        this.l(n);
        this.l = this.a.getNavigationContentDescription();
        this.a.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
            final androidx.appcompat.view.menu.a G = new androidx.appcompat.view.menu.a(v0.this.a.getContext(), 0, 16908332, 0, 0, v0.this.j);
            
            public void onClick(final View view) {
                final v0 h = v0.this;
                final Window$Callback m = h.m;
                if (m != null && h.n) {
                    m.onMenuItemSelected(0, (MenuItem)this.G);
                }
            }
        });
    }
    
    private int U() {
        int n;
        if (this.a.getNavigationIcon() != null) {
            n = 15;
            this.r = this.a.getNavigationIcon();
        }
        else {
            n = 11;
        }
        return n;
    }
    
    private void V() {
        if (this.d == null) {
            (this.d = new u(this.getContext(), null, c.a.c.m)).setLayoutParams((ViewGroup$LayoutParams)new Toolbar.e(-2, -2, 8388627));
        }
    }
    
    private void W(final CharSequence charSequence) {
        this.j = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setTitle(charSequence);
        }
    }
    
    private void X() {
        if ((this.b & 0x4) != 0x0) {
            if (TextUtils.isEmpty(this.l)) {
                this.a.setNavigationContentDescription(this.q);
            }
            else {
                this.a.setNavigationContentDescription(this.l);
            }
        }
    }
    
    private void Y() {
        Toolbar toolbar;
        Drawable navigationIcon;
        if ((this.b & 0x4) != 0x0) {
            toolbar = this.a;
            navigationIcon = this.h;
            if (navigationIcon == null) {
                navigationIcon = this.r;
            }
        }
        else {
            toolbar = this.a;
            navigationIcon = null;
        }
        toolbar.setNavigationIcon(navigationIcon);
    }
    
    private void Z() {
        final int b = this.b;
        Drawable logo = null;
        Label_0039: {
            if ((b & 0x2) != 0x0) {
                if ((b & 0x1) != 0x0) {
                    logo = this.g;
                    if (logo != null) {
                        break Label_0039;
                    }
                }
                logo = this.f;
            }
            else {
                logo = null;
            }
        }
        this.a.setLogo(logo);
    }
    
    @Override
    public int A() {
        return this.p;
    }
    
    @Override
    public void B(final int n) {
        final p0 c = this.C(n, 200L);
        if (c != null) {
            c.w();
        }
    }
    
    @Override
    public p0 C(final int n, final long n2) {
        final p0 f = j0.f((View)this.a);
        float n3;
        if (n == 0) {
            n3 = 1.0f;
        }
        else {
            n3 = 0.0f;
        }
        return f.a(n3).q(n2).s(new r0() {
            private boolean a = false;
            
            @Override
            public void a(final View view) {
                this.a = true;
            }
            
            @Override
            public void b(final View view) {
                if (!this.a) {
                    v0.this.a.setVisibility(n);
                }
            }
            
            @Override
            public void c(final View view) {
                v0.this.a.setVisibility(0);
            }
        });
    }
    
    @Override
    public void D(final int n) {
        final int p = this.p;
        if (n != p) {
            Label_0094: {
                Toolbar toolbar;
                Object o;
                if (p != 1) {
                    if (p != 2) {
                        break Label_0094;
                    }
                    final View c = this.c;
                    if (c == null) {
                        break Label_0094;
                    }
                    final ViewParent parent = c.getParent();
                    toolbar = this.a;
                    if (parent != toolbar) {
                        break Label_0094;
                    }
                    o = this.c;
                }
                else {
                    final Spinner d = this.d;
                    if (d == null) {
                        break Label_0094;
                    }
                    final ViewParent parent2 = d.getParent();
                    toolbar = this.a;
                    if (parent2 != toolbar) {
                        break Label_0094;
                    }
                    o = this.d;
                }
                toolbar.removeView((View)o);
            }
            if ((this.p = n) != 0) {
                if (n != 1) {
                    if (n != 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Invalid navigation mode ");
                        sb.append(n);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    final View c2 = this.c;
                    if (c2 != null) {
                        this.a.addView(c2, 0);
                        final Toolbar.e e = (Toolbar.e)this.c.getLayoutParams();
                        e.width = -2;
                        e.height = -2;
                        e.a = 8388691;
                    }
                }
                else {
                    this.V();
                    this.a.addView((View)this.d, 0);
                }
            }
        }
    }
    
    @Override
    public void E(final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.S(d);
    }
    
    @Override
    public void F(final n.a a, final g.a a2) {
        this.a.L(a, a2);
    }
    
    @Override
    public ViewGroup G() {
        return this.a;
    }
    
    @Override
    public void H(final boolean b) {
    }
    
    @Override
    public void I(final SpinnerAdapter adapter, final AdapterView$OnItemSelectedListener onItemSelectedListener) {
        this.V();
        this.d.setAdapter(adapter);
        this.d.setOnItemSelectedListener(onItemSelectedListener);
    }
    
    @Override
    public void J(final SparseArray<Parcelable> sparseArray) {
        this.a.restoreHierarchyState((SparseArray)sparseArray);
    }
    
    @Override
    public CharSequence K() {
        return this.a.getSubtitle();
    }
    
    @Override
    public int L() {
        return this.b;
    }
    
    @Override
    public int M() {
        final Spinner d = this.d;
        int selectedItemPosition;
        if (d != null) {
            selectedItemPosition = d.getSelectedItemPosition();
        }
        else {
            selectedItemPosition = 0;
        }
        return selectedItemPosition;
    }
    
    @Override
    public void N(final int n) {
        CharSequence string;
        if (n == 0) {
            string = null;
        }
        else {
            string = this.getContext().getString(n);
        }
        this.t(string);
    }
    
    @Override
    public void O(final View e) {
        final View e2 = this.e;
        if (e2 != null && (this.b & 0x10) != 0x0) {
            this.a.removeView(e2);
        }
        if ((this.e = e) != null && (this.b & 0x10) != 0x0) {
            this.a.addView(e);
        }
    }
    
    @Override
    public void P() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public int Q() {
        final Spinner d = this.d;
        int count;
        if (d != null) {
            count = d.getCount();
        }
        else {
            count = 0;
        }
        return count;
    }
    
    @Override
    public void R() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }
    
    @Override
    public void S(final Drawable h) {
        this.h = h;
        this.Y();
    }
    
    @Override
    public void T(final boolean collapsible) {
        this.a.setCollapsible(collapsible);
    }
    
    @Override
    public int a() {
        return this.a.getHeight();
    }
    
    @Override
    public void b(final Drawable drawable) {
        j0.G1((View)this.a, drawable);
    }
    
    @Override
    public void c(final Menu menu, final n.a a) {
        if (this.o == null) {
            (this.o = new c(this.a.getContext())).t(c.a.h.T);
        }
        this.o.i(a);
        this.a.K((g)menu, this.o);
    }
    
    @Override
    public void collapseActionView() {
        this.a.e();
    }
    
    @Override
    public boolean d() {
        return this.a.A();
    }
    
    @Override
    public void e() {
        this.n = true;
    }
    
    @Override
    public boolean f() {
        return this.f != null;
    }
    
    @Override
    public boolean g() {
        return this.a.d();
    }
    
    @Override
    public Context getContext() {
        return this.a.getContext();
    }
    
    @Override
    public CharSequence getTitle() {
        return this.a.getTitle();
    }
    
    @Override
    public int getVisibility() {
        return this.a.getVisibility();
    }
    
    @Override
    public boolean h() {
        return this.g != null;
    }
    
    @Override
    public boolean i() {
        return this.a.z();
    }
    
    @Override
    public boolean j() {
        return this.a.w();
    }
    
    @Override
    public boolean k() {
        return this.a.R();
    }
    
    @Override
    public void l(final int q) {
        if (q == this.q) {
            return;
        }
        this.q = q;
        if (TextUtils.isEmpty(this.a.getNavigationContentDescription())) {
            this.N(this.q);
        }
    }
    
    @Override
    public void m() {
        this.a.f();
    }
    
    @Override
    public View n() {
        return this.e;
    }
    
    @Override
    public void o(final m0 c) {
        final View c2 = this.c;
        if (c2 != null) {
            final ViewParent parent = c2.getParent();
            final Toolbar a = this.a;
            if (parent == a) {
                a.removeView(this.c);
            }
        }
        if ((this.c = (View)c) != null && this.p == 2) {
            this.a.addView((View)c, 0);
            final Toolbar.e e = (Toolbar.e)this.c.getLayoutParams();
            e.width = -2;
            e.height = -2;
            e.a = 8388691;
            c.setAllowCollapse(true);
        }
    }
    
    @Override
    public void p(final Drawable g) {
        this.g = g;
        this.Z();
    }
    
    @Override
    public boolean q() {
        return this.a.v();
    }
    
    @Override
    public boolean r() {
        return this.a.B();
    }
    
    @Override
    public void s(final int b) {
        final int n = this.b ^ b;
        this.b = b;
        if (n != 0) {
            if ((n & 0x4) != 0x0) {
                if ((b & 0x4) != 0x0) {
                    this.X();
                }
                this.Y();
            }
            if ((n & 0x3) != 0x0) {
                this.Z();
            }
            if ((n & 0x8) != 0x0) {
                Toolbar toolbar;
                CharSequence k;
                if ((b & 0x8) != 0x0) {
                    this.a.setTitle(this.j);
                    toolbar = this.a;
                    k = this.k;
                }
                else {
                    final Toolbar a = this.a;
                    k = null;
                    a.setTitle(null);
                    toolbar = this.a;
                }
                toolbar.setSubtitle(k);
            }
            if ((n & 0x10) != 0x0) {
                final View e = this.e;
                if (e != null) {
                    if ((b & 0x10) != 0x0) {
                        this.a.addView(e);
                    }
                    else {
                        this.a.removeView(e);
                    }
                }
            }
        }
    }
    
    @Override
    public void setIcon(final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.setIcon(d);
    }
    
    @Override
    public void setIcon(final Drawable f) {
        this.f = f;
        this.Z();
    }
    
    @Override
    public void setLogo(final int n) {
        Drawable d;
        if (n != 0) {
            d = androidx.appcompat.content.res.a.d(this.getContext(), n);
        }
        else {
            d = null;
        }
        this.p(d);
    }
    
    @Override
    public void setTitle(final CharSequence charSequence) {
        this.i = true;
        this.W(charSequence);
    }
    
    @Override
    public void setVisibility(final int visibility) {
        this.a.setVisibility(visibility);
    }
    
    @Override
    public void setWindowCallback(final Window$Callback m) {
        this.m = m;
    }
    
    @Override
    public void setWindowTitle(final CharSequence charSequence) {
        if (!this.i) {
            this.W(charSequence);
        }
    }
    
    @Override
    public void t(final CharSequence l) {
        this.l = l;
        this.X();
    }
    
    @Override
    public void u(final CharSequence charSequence) {
        this.k = charSequence;
        if ((this.b & 0x8) != 0x0) {
            this.a.setSubtitle(charSequence);
        }
    }
    
    @Override
    public void v(final Drawable r) {
        if (this.r != r) {
            this.r = r;
            this.Y();
        }
    }
    
    @Override
    public void w(final SparseArray<Parcelable> sparseArray) {
        this.a.saveHierarchyState((SparseArray)sparseArray);
    }
    
    @Override
    public void x(final int selection) {
        final Spinner d = this.d;
        if (d != null) {
            d.setSelection(selection);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }
    
    @Override
    public Menu y() {
        return this.a.getMenu();
    }
    
    @Override
    public boolean z() {
        return this.c != null;
    }
}
