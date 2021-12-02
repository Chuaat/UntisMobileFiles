// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003" }, d2 = { "Landroid/view/View;", "Landroidx/navigation/NavController;", "a", "navigation-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class a1
{
    @e
    public static final NavController a(@e final View view) {
        k0.q((Object)view, "$this$findNavController");
        final NavController e = t0.e(view);
        k0.h((Object)e, "Navigation.findNavController(this)");
        return e;
    }
}
