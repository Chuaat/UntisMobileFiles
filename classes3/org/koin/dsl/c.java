// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.dsl;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.j2;
import org.koin.core.module.a;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\u001b\u0010\b\u001a\u0017\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0002\b\u0007*,\u0010\n\"\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u00072\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0007¨\u0006\u000b" }, d2 = { "", "createdAtStart", "override", "Lkotlin/Function1;", "Lorg/koin/core/module/a;", "Lkotlin/j2;", "Lorg/koin/dsl/ModuleDeclaration;", "Lkotlin/s;", "moduleDeclaration", "a", "ModuleDeclaration", "koin-core" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    @e
    public static final a a(final boolean b, final boolean b2, @e final l<? super a, j2> l) {
        k0.q((Object)l, "moduleDeclaration");
        final a a = new a(b, b2);
        l.invoke((Object)a);
        return a;
    }
}
