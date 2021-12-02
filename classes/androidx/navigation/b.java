// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import android.app.Activity;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001¨\u0006\u0005" }, d2 = { "Landroid/app/Activity;", "", "viewId", "Landroidx/navigation/NavController;", "a", "navigation-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    @e
    public static final NavController a(@e final Activity activity, @y final int n) {
        k0.q((Object)activity, "$this$findNavController");
        final NavController d = t0.d(activity, n);
        k0.h((Object)d, "Navigation.findNavController(this, viewId)");
        return d;
    }
}
