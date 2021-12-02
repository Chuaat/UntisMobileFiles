// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.context;

import kotlin.j2;
import n6.l;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import org.koin.core.module.a;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\u001a#\u0010\u0006\u001a\u00020\u00012\u001b\u0010\u0005\u001a\u0017\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003¢\u0006\u0002\b\u0004\u001a\u0006\u0010\u0007\u001a\u00020\u0002\u001a\u000e\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\r\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u001a\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b\u001a\u0014\u0010\u000f\u001a\u00020\u00022\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¨\u0006\u0010" }, d2 = { "Lkotlin/Function1;", "Lorg/koin/core/b;", "Lkotlin/j2;", "Lorg/koin/dsl/KoinAppDeclaration;", "Lkotlin/s;", "appDeclaration", "c", "d", "Lorg/koin/core/module/a;", "module", "b", "", "modules", "a", "f", "e", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class b
{
    public static final void a(@e final List<a> list) {
        k0.q((Object)list, "modules");
        org.koin.core.context.a.a().n(list);
    }
    
    public static final void b(@e final a a) {
        k0.q((Object)a, "module");
        a.a().n(v.k((Object)a));
    }
    
    @e
    public static final org.koin.core.b c(@e final l<? super org.koin.core.b, j2> l) {
        k0.q((Object)l, "appDeclaration");
        final org.koin.core.b a = org.koin.core.b.c.a();
        org.koin.core.context.a.e(a);
        l.invoke((Object)a);
        a.f();
        return a;
    }
    
    public static final void d() {
        org.koin.core.context.a.f();
    }
    
    public static final void e(@e final List<a> list) {
        k0.q((Object)list, "modules");
        org.koin.core.context.a.a().t(list);
    }
    
    public static final void f(@e final a a) {
        k0.q((Object)a, "module");
        a.a().t(v.k((Object)a));
    }
}
