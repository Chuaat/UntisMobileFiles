// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import kotlin.jvm.internal.k0;
import androidx.navigation.NavController;
import org.jetbrains.annotations.e;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavController;", "a", "navigation-fragment-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    @e
    public static final NavController a(@e final Fragment fragment) {
        k0.q((Object)fragment, "$this$findNavController");
        final NavController u = NavHostFragment.u(fragment);
        k0.h((Object)u, "NavHostFragment.findNavController(this)");
        return u;
    }
}
