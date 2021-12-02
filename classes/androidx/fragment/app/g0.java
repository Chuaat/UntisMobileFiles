// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.lifecycle.d1;
import androidx.lifecycle.y0;
import kotlin.jvm.internal.m0;
import androidx.lifecycle.c1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import androidx.lifecycle.w0;
import org.jetbrains.annotations.f;
import androidx.lifecycle.z0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u000e\b\n\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b\u001a1\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0087\b\u001aJ\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0007¨\u0006\u0010" }, d2 = { "Landroidx/lifecycle/w0;", "VM", "Landroidx/fragment/app/Fragment;", "Lkotlin/Function0;", "Landroidx/lifecycle/d1;", "ownerProducer", "Landroidx/lifecycle/z0$b;", "factoryProducer", "Lkotlin/b0;", "e", "a", "Lkotlin/reflect/d;", "viewModelClass", "Landroidx/lifecycle/c1;", "storeProducer", "c", "fragment-ktx_release" }, k = 2, mv = { 1, 4, 0 })
public final class g0
{
    @androidx.annotation.g0
    @e
    public static final <VM extends w0> b0<VM> c(@e final Fragment fragment, @e final kotlin.reflect.d<VM> d, @e final a<? extends c1> a, @f a<? extends z0.b> a2) {
        k0.q((Object)fragment, "$this$createViewModelLazy");
        k0.q((Object)d, "viewModelClass");
        k0.q((Object)a, "storeProducer");
        if (a2 == null) {
            a2 = new a<z0.b>() {
                @e
                public final z0.b a() {
                    final z0.b defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
                    k0.h((Object)defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
                    return defaultViewModelProviderFactory;
                }
            };
        }
        return (b0<VM>)new y0((kotlin.reflect.d<w0>)d, a, (a<? extends z0.b>)a2);
    }
}
