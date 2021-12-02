// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.android.ext.android;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import org.koin.core.c;
import kotlin.reflect.d;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.content.ComponentCallbacks;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001aC\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\b\u001aD\u0010\r\u001a\u00028\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a<\u0010\u0011\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u000f\u0018\u0001\"\u0006\b\u0001\u0010\u0010\u0018\u0001*\u00020\u00002\u0016\b\n\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007j\u0004\u0018\u0001`\tH\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013" }, d2 = { "Landroid/content/ComponentCallbacks;", "Lorg/koin/core/a;", "e", "", "T", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "Lkotlin/b0;", "f", "c", "(Landroid/content/ComponentCallbacks;Ll7/a;Ln6/a;)Ljava/lang/Object;", "S", "P", "a", "(Landroid/content/ComponentCallbacks;Ln6/a;)Ljava/lang/Object;", "koin-android_release" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    private static final <S, P> S a(@e final ComponentCallbacks componentCallbacks, final n6.a<org.koin.core.parameter.a> a) {
        final org.koin.core.scope.a y = e(componentCallbacks).y();
        k0.y(4, "S");
        final d d = k1.d((Class)Object.class);
        k0.y(4, "P");
        return (S)y.b((d<?>)k1.d((Class)Object.class), (d<?>)d, a);
    }
    
    private static final <T> T c(@e final ComponentCallbacks componentCallbacks, final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = e(componentCallbacks).y();
        k0.y(4, "T");
        return (T)y.t((d<?>)k1.d((Class)Object.class), a, a2);
    }
    
    @e
    public static final org.koin.core.a e(@e final ComponentCallbacks componentCallbacks) {
        k0.q((Object)componentCallbacks, "$this$getKoin");
        org.koin.core.a a;
        if (componentCallbacks instanceof c) {
            a = ((c)componentCallbacks).getKoin();
        }
        else {
            a = org.koin.core.context.a.a().j();
        }
        return a;
    }
    
    private static final <T> b0<T> f(@e final ComponentCallbacks componentCallbacks, final l7.a a, final n6.a<org.koin.core.parameter.a> a2) {
        k0.w();
        return (b0<T>)d0.c((n6.a)new n6.a<T>() {
            final /* synthetic */ ComponentCallbacks G;
            final /* synthetic */ l7.a H;
            final /* synthetic */ n6.a I;
            
            @e
            public final T invoke() {
                final ComponentCallbacks g = this.G;
                final l7.a h = this.H;
                final n6.a i = this.I;
                final org.koin.core.scope.a y = a.e(g).y();
                k0.y(4, "T");
                return (T)y.t((d<?>)k1.d((Class)Object.class), h, (n6.a<org.koin.core.parameter.a>)i);
            }
        });
    }
}
