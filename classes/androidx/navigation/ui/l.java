// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import com.google.android.material.navigation.NavigationView;
import android.view.Menu;
import java.lang.ref.WeakReference;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.appbar.a;
import android.view.View$OnClickListener;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.e;
import android.os.Bundle;
import androidx.navigation.o0;
import android.view.MenuItem;
import androidx.annotation.k0;
import androidx.customview.widget.c;
import androidx.navigation.NavController;
import java.util.Set;
import androidx.annotation.y;
import androidx.navigation.a0;
import androidx.navigation.e0;
import android.view.ViewParent;
import android.view.ViewGroup$LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import androidx.annotation.j0;
import android.view.View;

public final class l
{
    private l() {
    }
    
    static BottomSheetBehavior a(@j0 final View view) {
        final ViewGroup$LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            final ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return a((View)parent);
            }
            return null;
        }
        else {
            final CoordinatorLayout.c f = ((CoordinatorLayout.g)layoutParams).f();
            if (!(f instanceof BottomSheetBehavior)) {
                return null;
            }
            return (BottomSheetBehavior)f;
        }
    }
    
    static a0 b(@j0 e0 n) {
        while (n instanceof e0) {
            n = n;
            n = ((e0)n).N(((e0)n).R());
        }
        return n;
    }
    
    static boolean c(@j0 a0 t, @y final int n) {
        while (t.p() != n && t.t() != null) {
            t = t.t();
        }
        return t.p() == n;
    }
    
    static boolean d(@j0 a0 t, @j0 final Set<Integer> set) {
        while (!set.contains(t.p())) {
            if ((t = t.t()) == null) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean e(@j0 final NavController navController, @k0 final c c) {
        return f(navController, new d.b(navController.m()).d(c).a());
    }
    
    public static boolean f(@j0 final NavController navController, @j0 final d d) {
        final c c = d.c();
        final a0 k = navController.k();
        final Set<Integer> d2 = d.d();
        if (c != null && k != null && d(k, d2)) {
            c.open();
            return true;
        }
        return navController.G() || (d.b() != null && d.b().a());
    }
    
    public static boolean g(@j0 final MenuItem menuItem, @j0 final NavController navController) {
        final o0.a d = new o0.a().d(true);
        o0.a a;
        int n;
        if (navController.k().t().N(menuItem.getItemId()) instanceof androidx.navigation.d.a) {
            a = d.b(androidx.navigation.ui.n.a.r).c(androidx.navigation.ui.n.a.s).e(androidx.navigation.ui.n.a.t);
            n = androidx.navigation.ui.n.a.u;
        }
        else {
            a = d.b(androidx.navigation.ui.n.b.k).c(androidx.navigation.ui.n.b.l).e(androidx.navigation.ui.n.b.m);
            n = androidx.navigation.ui.n.b.n;
        }
        a.f(n);
        if ((menuItem.getOrder() & 0x30000) == 0x0) {
            d.g(b(navController.m()).p(), false);
        }
        final o0 a2 = d.a();
        try {
            navController.u(menuItem.getItemId(), null, a2);
            return true;
        }
        catch (IllegalArgumentException ex) {
            return false;
        }
    }
    
    public static void h(@j0 final e e, @j0 final NavController navController) {
        j(e, navController, new d.b(navController.m()).a());
    }
    
    public static void i(@j0 final e e, @j0 final NavController navController, @k0 final c c) {
        j(e, navController, new d.b(navController.m()).d(c).a());
    }
    
    public static void j(@j0 final e e, @j0 final NavController navController, @j0 final d d) {
        navController.a((NavController.b)new b(e, d));
    }
    
    public static void k(@j0 final Toolbar toolbar, @j0 final NavController navController) {
        m(toolbar, navController, new d.b(navController.m()).a());
    }
    
    public static void l(@j0 final Toolbar toolbar, @j0 final NavController navController, @k0 final c c) {
        m(toolbar, navController, new d.b(navController.m()).d(c).a());
    }
    
    public static void m(@j0 final Toolbar toolbar, @j0 final NavController navController, @j0 final d d) {
        navController.a((NavController.b)new p(toolbar, d));
        toolbar.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                l.f(navController, d);
            }
        });
    }
    
    public static void n(@j0 final a a, @j0 final Toolbar toolbar, @j0 final NavController navController) {
        p(a, toolbar, navController, new d.b(navController.m()).a());
    }
    
    public static void o(@j0 final a a, @j0 final Toolbar toolbar, @j0 final NavController navController, @k0 final c c) {
        p(a, toolbar, navController, new d.b(navController.m()).d(c).a());
    }
    
    public static void p(@j0 final a a, @j0 final Toolbar toolbar, @j0 final NavController navController, @j0 final d d) {
        navController.a((NavController.b)new i(a, toolbar, d));
        toolbar.setNavigationOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                l.f(navController, d);
            }
        });
    }
    
    public static void q(@j0 final BottomNavigationView referent, @j0 final NavController navController) {
        referent.setOnNavigationItemSelectedListener((BottomNavigationView.b)new BottomNavigationView.b() {
            @Override
            public boolean a(@j0 final MenuItem menuItem) {
                return l.g(menuItem, navController);
            }
        });
        navController.a((NavController.b)new NavController.b() {
            final /* synthetic */ WeakReference a = new WeakReference((T)referent);
            
            @Override
            public void a(@j0 final NavController navController, @j0 final a0 a0, @k0 final Bundle bundle) {
                final BottomNavigationView bottomNavigationView = (BottomNavigationView)this.a.get();
                if (bottomNavigationView == null) {
                    navController.L((NavController.b)this);
                    return;
                }
                final Menu menu = bottomNavigationView.getMenu();
                for (int i = 0; i < menu.size(); ++i) {
                    final MenuItem item = menu.getItem(i);
                    if (l.c(a0, item.getItemId())) {
                        item.setChecked(true);
                    }
                }
            }
        });
    }
    
    public static void r(@j0 final NavigationView referent, @j0 final NavController navController) {
        referent.setNavigationItemSelectedListener((NavigationView.c)new NavigationView.c() {
            @Override
            public boolean a(@j0 final MenuItem menuItem) {
                final boolean g = l.g(menuItem, navController);
                if (g) {
                    final ViewParent parent = referent.getParent();
                    if (parent instanceof androidx.customview.widget.c) {
                        ((androidx.customview.widget.c)parent).close();
                    }
                    else {
                        final BottomSheetBehavior a = l.a((View)referent);
                        if (a != null) {
                            a.K0(5);
                        }
                    }
                }
                return g;
            }
        });
        navController.a((NavController.b)new NavController.b() {
            final /* synthetic */ WeakReference a = new WeakReference((T)referent);
            
            @Override
            public void a(@j0 final NavController navController, @j0 final a0 a0, @k0 final Bundle bundle) {
                final NavigationView navigationView = (NavigationView)this.a.get();
                if (navigationView == null) {
                    navController.L((NavController.b)this);
                    return;
                }
                final Menu menu = navigationView.getMenu();
                for (int i = 0; i < menu.size(); ++i) {
                    final MenuItem item = menu.getItem(i);
                    item.setChecked(l.c(a0, item.getItemId()));
                }
            }
        });
    }
}
