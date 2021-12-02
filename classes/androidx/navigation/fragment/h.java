// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.s0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a9\u0010\u0006\u001a\u00020\u00052*\u0010\u0004\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00010\u0000\"\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "", "Lkotlin/s0;", "Landroid/view/View;", "", "sharedElements", "Landroidx/navigation/fragment/e$b;", "a", "([Lkotlin/s0;)Landroidx/navigation/fragment/e$b;", "navigation-fragment-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class h
{
    @e
    public static final androidx.navigation.fragment.e.b a(@e final s0<? extends View, String>... array) {
        k0.q((Object)array, "sharedElements");
        final androidx.navigation.fragment.e.b.a a = new androidx.navigation.fragment.e.b.a();
        for (final s0<? extends View, String> s0 : array) {
            a.a((View)s0.a(), (String)s0.b());
        }
        final androidx.navigation.fragment.e.b c = a.c();
        k0.h((Object)c, "FragmentNavigator.Extras\u2026      }\n        }.build()");
        return c;
    }
}
