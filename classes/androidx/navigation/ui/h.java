// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import androidx.navigation.e0;
import androidx.customview.widget.c;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.appcompat.widget.Toolbar;
import org.jetbrains.annotations.e;
import com.google.android.material.appbar.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001a$\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\t¨\u0006\f" }, d2 = { "Lcom/google/android/material/appbar/a;", "Landroidx/appcompat/widget/Toolbar;", "toolbar", "Landroidx/navigation/NavController;", "navController", "Landroidx/drawerlayout/widget/DrawerLayout;", "drawerLayout", "Lkotlin/j2;", "a", "Landroidx/navigation/ui/d;", "configuration", "b", "navigation-ui-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class h
{
    public static final void a(@e final a a, @e final Toolbar toolbar, @e final NavController navController, @f final DrawerLayout drawerLayout) {
        k0.q((Object)a, "$this$setupWithNavController");
        k0.q((Object)toolbar, "toolbar");
        k0.q((Object)navController, "navController");
        final e0 m = navController.m();
        k0.h((Object)m, "navController.graph");
        final n6.a<Boolean> g = (n6.a<Boolean>)androidx.navigation.ui.e.e$a.G;
        final d.b d = new d.b(m).d(drawerLayout);
        Object o = g;
        if (g != null) {
            o = new androidx.navigation.ui.f((n6.a)g);
        }
        final d a2 = d.c((d.c)o).a();
        k0.h((Object)a2, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        l.p(a, toolbar, navController, a2);
    }
    
    public static final void b(@e final a a, @e final Toolbar toolbar, @e final NavController navController, @e final d d) {
        k0.q((Object)a, "$this$setupWithNavController");
        k0.q((Object)toolbar, "toolbar");
        k0.q((Object)navController, "navController");
        k0.q((Object)d, "configuration");
        l.p(a, toolbar, navController, d);
    }
}
