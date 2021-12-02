// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import androidx.navigation.e0;
import n6.a;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import androidx.customview.widget.c;
import org.jetbrains.annotations.e;
import androidx.navigation.NavController;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\b" }, d2 = { "Landroidx/navigation/NavController;", "Landroidx/customview/widget/c;", "drawerLayout", "", "a", "Landroidx/navigation/ui/d;", "appBarConfiguration", "b", "navigation-ui-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class k
{
    public static final boolean a(@e final NavController navController, @f final c c) {
        k0.q((Object)navController, "$this$navigateUp");
        final e0 m = navController.m();
        k0.h((Object)m, "graph");
        final a<Boolean> g = (a<Boolean>)androidx.navigation.ui.e.e$a.G;
        final d.b d = new d.b(m).d(c);
        Object o = g;
        if (g != null) {
            o = new androidx.navigation.ui.f((a)g);
        }
        final d a = d.c((d.c)o).a();
        k0.h((Object)a, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        return l.f(navController, a);
    }
    
    public static final boolean b(@e final NavController navController, @e final d d) {
        k0.q((Object)navController, "$this$navigateUp");
        k0.q((Object)d, "appBarConfiguration");
        return l.f(navController, d);
    }
}
