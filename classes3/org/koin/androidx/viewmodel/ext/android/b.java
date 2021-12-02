// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel.ext.android;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import org.koin.androidx.viewmodel.c;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.d;
import kotlin.p1;
import android.content.ComponentCallbacks;
import org.koin.core.a;
import org.jetbrains.annotations.e;
import androidx.lifecycle.y;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aL\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t\u001aC\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\b\u001aD\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\f\u0010\u0011\u001a\u00020\u0010*\u00020\u0002H\u0002\u001aM\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\t¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Landroidx/lifecycle/y;", "Lkotlin/reflect/d;", "clazz", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "f", "g", "c", "(Landroidx/lifecycle/y;Ll7/a;Ln6/a;)Landroidx/lifecycle/w0;", "Lorg/koin/core/a;", "a", "b", "(Landroidx/lifecycle/y;Lkotlin/reflect/d;Ll7/a;Ln6/a;)Landroidx/lifecycle/w0;", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    private static final a a(@e final y y) {
        if (y != null) {
            return org.koin.android.ext.android.a.e((ComponentCallbacks)y);
        }
        throw new p1("null cannot be cast to non-null type android.content.ComponentCallbacks");
    }
    
    @e
    public static final <T extends w0> T b(@e final y y, @e final d<T> d, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)y, "$this$getViewModel");
        k0.q((Object)d, "clazz");
        return org.koin.androidx.viewmodel.e.c(a(y), new c<T>(d, y, a, null, a2, 8, null));
    }
    
    private static final <T extends w0> T c(@e final y y, final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.y(4, "T");
        return b(y, (kotlin.reflect.d<T>)k1.d((Class)w0.class), a, a2);
    }
    
    @e
    public static final <T extends w0> b0<T> f(@e final y y, @e final d<T> d, @f final l7.a a, @f final n6.a<org.koin.core.parameter.a> a2) {
        k0.q((Object)y, "$this$viewModel");
        k0.q((Object)d, "clazz");
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            @e
            public final T invoke() {
                return b.b(y, d, a, a2);
            }
        });
    }
    
    private static final <T extends w0> b0<T> g(@e final y y, final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ y G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            @e
            public final T invoke() {
                final y g = this.G;
                final l7.a h = this.H;
                final n6.a i = this.I;
                k0.y(4, "T");
                return b.b(g, (kotlin.reflect.d<T>)k1.d((Class)w0.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
}
