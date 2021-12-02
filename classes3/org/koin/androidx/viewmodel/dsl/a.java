// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel.dsl;

import kotlin.jvm.internal.w;
import org.koin.core.definition.f;
import kotlin.jvm.internal.k1;
import org.koin.core.definition.d;
import androidx.lifecycle.w0;
import n6.p;
import kotlin.jvm.internal.k0;
import org.koin.core.definition.b;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a`\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\b\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0086\b\u001a\u000e\u0010\u0010\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\r\u001a\u000e\u0010\u0011\u001a\u00020\u0005*\u0006\u0012\u0002\b\u00030\r\"\u0016\u0010\u0014\u001a\u00020\u00128\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0013¨\u0006\u0015" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Lorg/koin/core/module/a;", "Ll7/a;", "qualifier", "", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Lorg/koin/core/definition/b;", "c", "Lkotlin/j2;", "b", "a", "", "Ljava/lang/String;", "ATTRIBUTE_VIEW_MODEL", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class a
{
    @e
    public static final String a = "isViewModel";
    
    public static final boolean a(@e final b<?> b) {
        k0.q((Object)b, "$this$isViewModel");
        final Boolean b2 = b.j().e("isViewModel");
        return b2 != null && b2;
    }
    
    public static final void b(@e final b<?> b) {
        k0.q((Object)b, "$this$setIsViewModel");
        b.j().f("isViewModel", Boolean.TRUE);
    }
    
    private static final <T extends w0> b<T> c(@e final org.koin.core.module.a a, final l7.a a2, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p4) {
        final d a3 = d.a;
        final org.koin.core.definition.e h = org.koin.core.definition.e.H;
        k0.y(4, "T");
        final b<T> b2 = new b<T>(a2, null, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        b2.p(p4);
        b2.r(h);
        a.a(b2, new f(false, b, 1, null));
        b(b2);
        return b2;
    }
}
