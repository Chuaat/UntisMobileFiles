// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel.dsl;

import org.koin.core.definition.f;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.w0;
import n6.p;
import l7.a;
import org.jetbrains.annotations.e;
import org.koin.dsl.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a`\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052)\b\b\u0010\f\u001a#\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0007j\b\u0012\u0004\u0012\u00028\u0000`\n¢\u0006\u0002\b\u000bH\u0086\b¨\u0006\u000f" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Lorg/koin/dsl/d;", "Ll7/a;", "qualifier", "", "override", "Lkotlin/Function2;", "Lorg/koin/core/scope/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/definition/Definition;", "Lkotlin/s;", "definition", "Lorg/koin/core/definition/b;", "a", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    private static final <T extends w0> org.koin.core.definition.b<T> a(@e final d d, final a a, final boolean b, final p<? super org.koin.core.scope.a, ? super org.koin.core.parameter.a, ? extends T> p4) {
        final org.koin.core.definition.d a2 = org.koin.core.definition.d.a;
        final a i = d.i();
        final org.koin.core.definition.e h = org.koin.core.definition.e.H;
        k0.y(4, "T");
        final org.koin.core.definition.b obj = new org.koin.core.definition.b<T>(a, i, (kotlin.reflect.d<?>)k1.d((Class)Object.class));
        obj.p(p4);
        obj.r(h);
        d.e((org.koin.core.definition.b<T>)obj, new f(false, b));
        a.b(obj);
        if (!d.h().contains(obj)) {
            d.h().add(obj);
            return (org.koin.core.definition.b<T>)obj;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Can't add definition ");
        sb.append(obj);
        sb.append(" for scope ");
        sb.append(d.i());
        sb.append(" as it already exists");
        throw new k7.b(sb.toString());
    }
}
