// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel.ext.android;

import kotlin.d0;
import kotlin.b0;
import kotlin.p1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.k1;
import androidx.lifecycle.y;
import org.koin.androidx.viewmodel.c;
import android.content.ComponentCallbacks;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.w0;
import androidx.lifecycle.d1;
import org.jetbrains.annotations.f;
import kotlin.reflect.d;
import org.jetbrains.annotations.e;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aW\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\b\u001a`\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\n\u001aX\u0010\u0011\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\n\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\n\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\nH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001aa\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005j\u0004\u0018\u0001`\n¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Landroidx/fragment/app/Fragment;", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Landroidx/lifecycle/d1;", "Lorg/koin/androidx/viewmodel/ViewModelStoreOwnerDefinition;", "from", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "f", "Lkotlin/reflect/d;", "clazz", "e", "b", "(Landroidx/fragment/app/Fragment;Ll7/a;Ln6/a;Ln6/a;)Landroidx/lifecycle/w0;", "a", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/d;Ll7/a;Ln6/a;Ln6/a;)Landroidx/lifecycle/w0;", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @e
    public static final <T extends w0> T a(@e final Fragment fragment, @e final d<T> d, @f final l7.a a, @e final n6.a<? extends d1> a2, @f final n6.a<org.koin.core.parameter.a> a3) {
        k0.q((Object)fragment, "$this$getSharedViewModel");
        k0.q((Object)d, "clazz");
        k0.q((Object)a2, "from");
        return org.koin.androidx.viewmodel.e.c(org.koin.android.ext.android.a.e((ComponentCallbacks)fragment), new c<T>(d, (y)fragment, a, a2, a3));
    }
    
    private static final <T extends w0> T b(@e final Fragment fragment, final l7.a a, final n6.a<? extends d1> a2, final n6.a<org.koin.core.parameter.a> a3) {
        k0.y(4, "T");
        return a(fragment, (kotlin.reflect.d<T>)k1.d((Class)w0.class), a, a2, a3);
    }
    
    @e
    public static final <T extends w0> b0<T> e(@e final Fragment fragment, @e final d<T> d, @f final l7.a a, @e final n6.a<? extends d1> a2, @f final n6.a<org.koin.core.parameter.a> a3) {
        k0.q((Object)fragment, "$this$sharedViewModel");
        k0.q((Object)d, "clazz");
        k0.q((Object)a2, "from");
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            @e
            public final T invoke() {
                return a.a(fragment, d, a, a2, a3);
            }
        });
    }
    
    private static final <T extends w0> b0<T> f(@e final Fragment fragment, final l7.a a, final n6.a<? extends d1> a2, final n6.a<org.koin.core.parameter.a> a3) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ Fragment G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            final /* synthetic */ n6.a J;
            
            @e
            public final T invoke() {
                final Fragment g = this.G;
                final l7.a h = this.H;
                final n6.a i = this.I;
                final n6.a j = this.J;
                k0.y(4, "T");
                return a.a(g, (kotlin.reflect.d<T>)k1.d((Class)w0.class), h, (n6.a<? extends d1>)i, (n6.a<org.koin.core.parameter.a>)j);
            }
        });
    }
}
