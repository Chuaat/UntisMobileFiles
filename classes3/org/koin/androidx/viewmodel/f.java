// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel;

import kotlin.jvm.internal.k0;
import androidx.lifecycle.w0;
import org.jetbrains.annotations.e;
import org.koin.core.scope.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Lorg/koin/core/scope/a;", "Lorg/koin/androidx/viewmodel/c;", "parameters", "a", "(Lorg/koin/core/scope/a;Lorg/koin/androidx/viewmodel/c;)Landroidx/lifecycle/w0;", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class f
{
    @e
    public static final <T extends w0> T a(@e final a a, @e final c<T> c) {
        k0.q((Object)a, "$this$getViewModel");
        k0.q((Object)c, "parameters");
        return org.koin.androidx.viewmodel.e.b(org.koin.androidx.viewmodel.e.a(a, org.koin.androidx.viewmodel.e.d(c.c(), c), c), c);
    }
}
