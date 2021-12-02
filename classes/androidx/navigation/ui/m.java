// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.ui;

import kotlin.jvm.internal.k0;
import androidx.navigation.NavController;
import org.jetbrains.annotations.e;
import com.google.android.material.navigation.NavigationView;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005" }, d2 = { "Lcom/google/android/material/navigation/NavigationView;", "Landroidx/navigation/NavController;", "navController", "Lkotlin/j2;", "a", "navigation-ui-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class m
{
    public static final void a(@e final NavigationView navigationView, @e final NavController navController) {
        k0.q((Object)navigationView, "$this$setupWithNavController");
        k0.q((Object)navController, "navController");
        l.r(navigationView, navController);
    }
}
