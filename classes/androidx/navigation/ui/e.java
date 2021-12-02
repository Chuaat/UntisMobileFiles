// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import java.util.Set;
import androidx.navigation.e0;
import kotlin.jvm.internal.k0;
import n6.a;
import org.jetbrains.annotations.f;
import androidx.customview.widget.c;
import android.view.Menu;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0003\u001a-\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u001a-\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b\u001a3\u0010\u000f\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\b¨\u0006\u0010" }, d2 = { "Landroidx/navigation/e0;", "navGraph", "Landroidx/customview/widget/c;", "drawerLayout", "Lkotlin/Function0;", "", "fallbackOnNavigateUpListener", "Landroidx/navigation/ui/d;", "b", "Landroid/view/Menu;", "topLevelMenu", "a", "", "", "topLevelDestinationIds", "c", "navigation-ui-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class e
{
    @org.jetbrains.annotations.e
    public static final d a(@org.jetbrains.annotations.e final Menu menu, @f final c c, @org.jetbrains.annotations.e final a<Boolean> a) {
        k0.q((Object)menu, "topLevelMenu");
        k0.q((Object)a, "fallbackOnNavigateUpListener");
        final d a2 = new d.b(menu).d(c).c(new androidx.navigation.ui.f(a)).a();
        k0.h((Object)a2, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        return a2;
    }
    
    @org.jetbrains.annotations.e
    public static final d b(@org.jetbrains.annotations.e final e0 e0, @f final c c, @org.jetbrains.annotations.e final a<Boolean> a) {
        k0.q((Object)e0, "navGraph");
        k0.q((Object)a, "fallbackOnNavigateUpListener");
        final d a2 = new d.b(e0).d(c).c(new androidx.navigation.ui.f(a)).a();
        k0.h((Object)a2, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        return a2;
    }
    
    @org.jetbrains.annotations.e
    public static final d c(@org.jetbrains.annotations.e final Set<Integer> set, @f final c c, @org.jetbrains.annotations.e final a<Boolean> a) {
        k0.q((Object)set, "topLevelDestinationIds");
        k0.q((Object)a, "fallbackOnNavigateUpListener");
        final d a2 = new d.b(set).d(c).c(new androidx.navigation.ui.f(a)).a();
        k0.h((Object)a2, "AppBarConfiguration.Buil\u2026eUpListener)\n    .build()");
        return a2;
    }
}
