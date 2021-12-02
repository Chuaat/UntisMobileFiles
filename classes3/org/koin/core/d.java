// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core;

import kotlin.d0;
import kotlin.jvm.internal.m0;
import kotlin.b0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import n6.a;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a@\u0010\b\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H\u0086\b\u001a<\u0010\u000e\u001a\u00028\u0000\"\u0006\b\u0000\u0010\f\u0018\u0001\"\u0006\b\u0001\u0010\r\u0018\u0001*\u00020\u00012\u0016\b\n\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\u0004\u0018\u0001`\u0006H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010" }, d2 = { "T", "Lorg/koin/core/c;", "Ll7/a;", "qualifier", "Lkotlin/Function0;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "c", "(Lorg/koin/core/c;Ll7/a;Ln6/a;)Ljava/lang/Object;", "Lkotlin/b0;", "e", "S", "P", "a", "(Lorg/koin/core/c;Ln6/a;)Ljava/lang/Object;", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class d
{
    private static final <S, P> S a(@e final c c, final a<org.koin.core.parameter.a> a) {
        final org.koin.core.scope.a y = c.getKoin().y();
        k0.y(4, "S");
        final kotlin.reflect.d d = k1.d((Class)Object.class);
        k0.y(4, "P");
        return (S)y.b((kotlin.reflect.d<?>)k1.d((Class)Object.class), (kotlin.reflect.d<?>)d, a);
    }
    
    private static final <T> T c(@e final c c, final l7.a a, final a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = c.getKoin().y();
        k0.y(4, "T");
        return (T)y.t((kotlin.reflect.d<?>)k1.d((Class)Object.class), a, a2);
    }
    
    private static final <T> b0<T> e(@e final c c, final l7.a a, final a<org.koin.core.parameter.a> a2) {
        final org.koin.core.scope.a y = c.getKoin().y();
        k0.w();
        return (b0<T>)d0.c((a)new a<T>() {
            public final T invoke() {
                final org.koin.core.scope.a g = y;
                final l7.a h = a;
                final a i = a2;
                k0.y(4, "T");
                return (T)g.t((kotlin.reflect.d<?>)k1.d((Class)Object.class), h, (a<org.koin.core.parameter.a>)i);
            }
        });
    }
}
