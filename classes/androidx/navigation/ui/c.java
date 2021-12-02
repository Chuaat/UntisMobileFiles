// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import androidx.navigation.e0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.appcompat.app.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001c\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u001a\u001c\u0010\t\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u0007¨\u0006\n" }, d2 = { "Landroidx/appcompat/app/e;", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/j2;", "a", "Landroidx/navigation/ui/d;", "configuration", "b", "navigation-ui-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    public static final void a(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final NavController navController, @f final DrawerLayout drawerLayout) {
        k0.q((Object)e, "$this$setupActionBarWithNavController");
        k0.q((Object)navController, "navController");
        final e0 m = navController.m();
        k0.h((Object)m, "navController.graph");
        final a<Boolean> g = (a<Boolean>)e.e$a.G;
        final d.b d = new d.b(m).d(drawerLayout);
        Object o = g;
        if (g != null) {
            o = new androidx.navigation.ui.f((a)g);
        }
        final d a = d.c((d.c)o).a();
        k0.h((Object)a, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        l.j(e, navController, a);
    }
    
    public static final void b(@org.jetbrains.annotations.e final e e, @org.jetbrains.annotations.e final NavController navController, @org.jetbrains.annotations.e final d d) {
        k0.q((Object)e, "$this$setupActionBarWithNavController");
        k0.q((Object)navController, "navController");
        k0.q((Object)d, "configuration");
        l.j(e, navController, d);
    }
}
