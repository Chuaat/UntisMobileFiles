// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel.ext.android;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.w0;
import org.jetbrains.annotations.f;
import kotlin.reflect.d;
import androidx.lifecycle.y;
import org.jetbrains.annotations.e;
import org.koin.core.scope.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aT\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b\u001aK\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0086\b\u001aL\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\n\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000bH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001aU\u0010\u0012\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\u0004\u0018\u0001`\u000b¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Lorg/koin/core/scope/a;", "Landroidx/lifecycle/y;", "owner", "Lkotlin/reflect/d;", "clazz", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "e", "f", "b", "(Lorg/koin/core/scope/a;Landroidx/lifecycle/y;Ll7/a;Ln6/a;)Landroidx/lifecycle/w0;", "a", "(Lorg/koin/core/scope/a;Landroidx/lifecycle/y;Lkotlin/reflect/d;Ll7/a;Ln6/a;)Landroidx/lifecycle/w0;", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    @e
    public static final <T extends w0> T a(@e final a a, @e final y y, @e final d<T> d, @f final l7.a a2, @f final n6.a<org.koin.core.parameter.a> a3) {
        k0.q((Object)a, "$this$getViewModel");
        k0.q((Object)y, "owner");
        k0.q((Object)d, "clazz");
        return org.koin.androidx.viewmodel.f.a(a, new org.koin.androidx.viewmodel.c<T>(d, y, a2, null, a3, 8, null));
    }
    
    private static final <T extends w0> T b(@e final a a, final y y, final l7.a a2, final n6.a<org.koin.core.parameter.a> a3) {
        k0.y(4, "T");
        return a(a, y, (kotlin.reflect.d<T>)k1.d((Class)w0.class), a2, a3);
    }
    
    @e
    public static final <T extends w0> b0<T> e(@e final a a, @e final y y, @e final d<T> d, @f final l7.a a2, @f final n6.a<org.koin.core.parameter.a> a3) {
        k0.q((Object)a, "$this$viewModel");
        k0.q((Object)y, "owner");
        k0.q((Object)d, "clazz");
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            @e
            public final T invoke() {
                return c.a(a, y, d, a2, a3);
            }
        });
    }
    
    private static final <T extends w0> b0<T> f(@e final a a, final y y, final l7.a a2, final n6.a<org.koin.core.parameter.a> a3) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ a G;
            final /* synthetic */ y H;
            final /* synthetic */ l7.a I;
            final /* synthetic */ n6.a J;
            
            @e
            public final T invoke() {
                final a g = this.G;
                final y h = this.H;
                final l7.a i = this.I;
                final n6.a j = this.J;
                k0.y(4, "T");
                return c.a(g, h, (kotlin.reflect.d<T>)k1.d((Class)w0.class), i, (n6.a<org.koin.core.parameter.a>)j);
            }
        });
    }
}
