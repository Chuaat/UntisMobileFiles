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

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a0\u0010\b\u001a\u00020\u0005*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\b¨\u0006\t" }, d2 = { "Landroidx/navigation/f0;", "", "id", "Lkotlin/Function1;", "Landroidx/navigation/e;", "Lkotlin/j2;", "Lkotlin/s;", "builder", "a", "navigation-runtime-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class f
{
    public static final void a(@e final f0 f0, @y final int n, @e final l<? super androidx.navigation.e, j2> l) {
        k0.q((Object)f0, "$this$activity");
        k0.q((Object)l, "builder");
        final d d = f0.m().d(d.class);
        k0.h((Object)d, "getNavigator(clazz.java)");
        final androidx.navigation.e e = new androidx.navigation.e(d, n);
        l.invoke((Object)e);
        f0.l((b0<? extends a0>)e);
    }
}
