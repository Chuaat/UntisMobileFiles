// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation.fragment;

import androidx.navigation.a0;
import androidx.navigation.u0;
import kotlin.jvm.internal.k0;
import androidx.annotation.y;
import org.jetbrains.annotations.e;
import androidx.fragment.app.DialogFragment;
import kotlin.reflect.d;
import kotlin.Metadata;
import androidx.navigation.c0;
import androidx.navigation.b0;

@c0
@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000f" }, d2 = { "Landroidx/navigation/fragment/a;", "Landroidx/navigation/b0;", "Landroidx/navigation/fragment/DialogFragmentNavigator$a;", "j", "Lkotlin/reflect/d;", "Landroidx/fragment/app/DialogFragment;", "g", "Lkotlin/reflect/d;", "fragmentClass", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "navigator", "", "id", "<init>", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/d;)V", "navigation-fragment-ktx_release" }, k = 1, mv = { 1, 4, 0 })
public final class a extends b0<DialogFragmentNavigator.a>
{
    private final d<? extends DialogFragment> g;
    
    public a(@e final DialogFragmentNavigator dialogFragmentNavigator, @y final int n, @e final d<? extends DialogFragment> g) {
        k0.q((Object)dialogFragmentNavigator, "navigator");
        k0.q((Object)g, "fragmentClass");
        super(dialogFragmentNavigator, n);
        this.g = g;
    }
    
    @e
    public DialogFragmentNavigator.a j() {
        final DialogFragmentNavigator.a a = super.c();
        a.K(m6.a.c((d)this.g).getName());
        return a;
    }
}
