// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.view.View;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Landroidx/fragment/app/Fragment;", "F", "Landroid/view/View;", "a", "(Landroid/view/View;)Landroidx/fragment/app/Fragment;", "fragment-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class l0
{
    @e
    public static final <F extends Fragment> F a(@e final View view) {
        k0.q((Object)view, "$this$findFragment");
        final Fragment o0 = FragmentManager.o0(view);
        k0.h((Object)o0, "FragmentManager.findFragment(this)");
        return (F)o0;
    }
}
