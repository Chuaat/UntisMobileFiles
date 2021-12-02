// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.app;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.app.ActionBar;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.content.res.Configuration;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.w0;
import androidx.appcompat.widget.Toolbar;
import android.app.Activity;
import android.view.View$OnClickListener;
import android.graphics.drawable.Drawable;
import androidx.appcompat.graphics.drawable.d;
import androidx.drawerlayout.widget.DrawerLayout;

public class b implements DrawerLayout.e
{
    private final b a;
    private final DrawerLayout b;
    private androidx.appcompat.graphics.drawable.d c;
    private boolean d;
    private Drawable e;
    boolean f;
    private boolean g;
    private final int h;
    private final int i;
    View$OnClickListener j;
    private boolean k;
    
    b(final Activity activity, final Toolbar toolbar, final DrawerLayout b, final androidx.appcompat.graphics.drawable.d c, @w0 final int h, @w0 final int i) {
        this.d = true;
        this.f = true;
        this.k = false;
        if (toolbar != null) {
            this.a = (b)new e(toolbar);
            toolbar.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
                public void onClick(final View view) {
                    final b g = androidx.appcompat.app.b.this;
                    if (g.f) {
                        g.v();
                    }
                    else {
                        final View$OnClickListener j = g.j;
                        if (j != null) {
                            j.onClick(view);
                        }
                    }
                }
            });
        }
        else if (activity instanceof c) {
            this.a = ((c)activity).getDrawerToggleDelegate();
        }
        else {
            this.a = (b)new d(activity);
        }
        this.b = b;
        this.h = h;
        this.i = i;
        if (c == null) {
            this.c = new androidx.appcompat.graphics.drawable.d(this.a.e());
        }
        else {
            this.c = c;
        }
        this.e = this.f();
    }
    
    public b(final Activity activity, final DrawerLayout drawerLayout, @w0 final int n, @w0 final int n2) {
        this(activity, null, drawerLayout, null, n, n2);
    }
    
    public b(final Activity activity, final DrawerLayout drawerLayout, final Toolbar toolbar, @w0 final int n, @w0 final int n2) {
        this(activity, toolbar, drawerLayout, null, n, n2);
    }
    
    private void s(final float progress) {
        Label_0037: {
            androidx.appcompat.graphics.drawable.d d;
            boolean b;
            if (progress == 1.0f) {
                d = this.c;
                b = true;
            }
            else {
                if (progress != 0.0f) {
                    break Label_0037;
                }
                d = this.c;
                b = false;
            }
            d.t(b);
        }
        this.c.setProgress(progress);
    }
    
    @Override
    public void a(final View view) {
        this.s(1.0f);
        if (this.f) {
            this.l(this.i);
        }
    }
    
    @Override
    public void b(final View view) {
        this.s(0.0f);
        if (this.f) {
            this.l(this.h);
        }
    }
    
    @Override
    public void c(final int n) {
    }
    
    @Override
    public void d(final View view, final float b) {
        if (this.d) {
            this.s(Math.min(1.0f, Math.max(0.0f, b)));
        }
        else {
            this.s(0.0f);
        }
    }
    
    @j0
    public androidx.appcompat.graphics.drawable.d e() {
        return this.c;
    }
    
    Drawable f() {
        return this.a.b();
    }
    
    public View$OnClickListener g() {
        return this.j;
    }
    
    public boolean h() {
        return this.f;
    }
    
    public boolean i() {
        return this.d;
    }
    
    public void j(final Configuration configuration) {
        if (!this.g) {
            this.e = this.f();
        }
        this.u();
    }
    
    public boolean k(final MenuItem menuItem) {
        if (menuItem != null && menuItem.getItemId() == 16908332 && this.f) {
            this.v();
            return true;
        }
        return false;
    }
    
    void l(final int n) {
        this.a.c(n);
    }
    
    void m(final Drawable drawable, final int n) {
        if (!this.k && !this.a.d()) {
            Log.w("ActionBarDrawerToggle", "DrawerToggle may not show up because NavigationIcon is not visible. You may need to call actionbar.setDisplayHomeAsUpEnabled(true);");
            this.k = true;
        }
        this.a.a(drawable, n);
    }
    
    public void n(@j0 final androidx.appcompat.graphics.drawable.d c) {
        this.c = c;
        this.u();
    }
    
    public void o(final boolean f) {
        if (f != this.f) {
            Drawable drawable;
            int n;
            if (f) {
                drawable = this.c;
                if (this.b.C(8388611)) {
                    n = this.i;
                }
                else {
                    n = this.h;
                }
            }
            else {
                drawable = this.e;
                n = 0;
            }
            this.m(drawable, n);
            this.f = f;
        }
    }
    
    public void p(final boolean d) {
        if (!(this.d = d)) {
            this.s(0.0f);
        }
    }
    
    public void q(final int n) {
        Drawable drawable;
        if (n != 0) {
            drawable = this.b.getResources().getDrawable(n);
        }
        else {
            drawable = null;
        }
        this.r(drawable);
    }
    
    public void r(final Drawable e) {
        if (e == null) {
            this.e = this.f();
            this.g = false;
        }
        else {
            this.e = e;
            this.g = true;
        }
        if (!this.f) {
            this.m(this.e, 0);
        }
    }
    
    public void t(final View$OnClickListener j) {
        this.j = j;
    }
    
    public void u() {
        float n;
        if (this.b.C(8388611)) {
            n = 1.0f;
        }
        else {
            n = 0.0f;
        }
        this.s(n);
        if (this.f) {
            final androidx.appcompat.graphics.drawable.d c = this.c;
            int n2;
            if (this.b.C(8388611)) {
                n2 = this.i;
            }
            else {
                n2 = this.h;
            }
            this.m(c, n2);
        }
    }
    
    void v() {
        final int q = this.b.q(8388611);
        if (this.b.F(8388611) && q != 2) {
            this.b.d(8388611);
        }
        else if (q != 1) {
            this.b.K(8388611);
        }
    }
    
    public interface b
    {
        void a(final Drawable p0, @w0 final int p1);
        
        Drawable b();
        
        void c(@w0 final int p0);
        
        boolean d();
        
        Context e();
    }
    
    public interface c
    {
        @k0
        b getDrawerToggleDelegate();
    }
    
    private static class d implements b
    {
        private final Activity a;
        private androidx.appcompat.app.c.a b;
        
        d(final Activity a) {
            this.a = a;
        }
        
        @Override
        public void a(final Drawable homeAsUpIndicator, final int homeActionContentDescription) {
            final ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                if (Build$VERSION.SDK_INT >= 18) {
                    actionBar.setHomeAsUpIndicator(homeAsUpIndicator);
                    actionBar.setHomeActionContentDescription(homeActionContentDescription);
                }
                else {
                    actionBar.setDisplayShowHomeEnabled(true);
                    this.b = androidx.appcompat.app.c.c(this.a, homeAsUpIndicator, homeActionContentDescription);
                    actionBar.setDisplayShowHomeEnabled(false);
                }
            }
        }
        
        @Override
        public Drawable b() {
            if (Build$VERSION.SDK_INT >= 18) {
                final TypedArray obtainStyledAttributes = this.e().obtainStyledAttributes((AttributeSet)null, new int[] { 16843531 }, 16843470, 0);
                final Drawable drawable = obtainStyledAttributes.getDrawable(0);
                obtainStyledAttributes.recycle();
                return drawable;
            }
            return androidx.appcompat.app.c.a(this.a);
        }
        
        @Override
        public void c(final int homeActionContentDescription) {
            if (Build$VERSION.SDK_INT >= 18) {
                final ActionBar actionBar = this.a.getActionBar();
                if (actionBar != null) {
                    actionBar.setHomeActionContentDescription(homeActionContentDescription);
                }
            }
            else {
                this.b = androidx.appcompat.app.c.b(this.b, this.a, homeActionContentDescription);
            }
        }
        
        @Override
        public boolean d() {
            final ActionBar actionBar = this.a.getActionBar();
            return actionBar != null && (actionBar.getDisplayOptions() & 0x4) != 0x0;
        }
        
        @Override
        public Context e() {
            final ActionBar actionBar = this.a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return (Context)this.a;
        }
    }
    
    static class e implements b
    {
        final Toolbar a;
        final Drawable b;
        final CharSequence c;
        
        e(final Toolbar a) {
            this.a = a;
            this.b = a.getNavigationIcon();
            this.c = a.getNavigationContentDescription();
        }
        
        @Override
        public void a(final Drawable navigationIcon, @w0 final int n) {
            this.a.setNavigationIcon(navigationIcon);
            this.c(n);
        }
        
        @Override
        public Drawable b() {
            return this.b;
        }
        
        @Override
        public void c(@w0 final int navigationContentDescription) {
            if (navigationContentDescription == 0) {
                this.a.setNavigationContentDescription(this.c);
            }
            else {
                this.a.setNavigationContentDescription(navigationContentDescription);
            }
        }
        
        @Override
        public boolean d() {
            return true;
        }
        
        @Override
        public Context e() {
            return this.a.getContext();
        }
    }
}
