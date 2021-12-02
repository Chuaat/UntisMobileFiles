// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import kotlin.jvm.internal.k0;
import kotlin.j2;
import n6.l;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a:\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0001\u0010\u0003\u001a\u00020\u00012\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007H\u0086\b¨\u0006\u000b" }, d2 = { "Landroidx/navigation/NavController;", "", "id", "startDestination", "Lkotlin/Function1;", "Landroidx/navigation/f0;", "Lkotlin/j2;", "Lkotlin/s;", "builder", "Landroidx/navigation/e0;", "a", "navigation-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class s
{
    @e
    public static final e0 a(@e final NavController navController, @y final int n, @y final int n2, @e final l<? super f0, j2> l) {
        k0.q((Object)navController, "$this$createGraph");
        k0.q((Object)l, "builder");
        final v0 o = navController.o();
        k0.h((Object)o, "navigatorProvider");
        final f0 f0 = new f0(o, n, n2);
        l.invoke((Object)f0);
        return f0.k();
    }
}
