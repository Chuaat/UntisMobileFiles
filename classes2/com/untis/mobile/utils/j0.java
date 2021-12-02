// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import java.io.Closeable;
import kotlin.io.c;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import org.jetbrains.annotations.e;
import io.realm.f0;
import n6.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\b" }, d2 = { "Lio/realm/f0;", "Lkotlin/Function1;", "Lkotlin/t0;", "name", "realm", "Lkotlin/j2;", "transaction", "b", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class j0
{
    public static final void b(@e final f0 f0, @e final l<? super f0, j2> t) {
        k0.p(f0, "<this>");
        k0.p(t, "transaction");
        try {
            f0.H1((f0.d)new i0((l)t));
            final j2 a = j2.a;
            c.a(f0, null);
        }
        finally {
            try {}
            finally {
                c.a(f0, t);
            }
        }
    }
    
    private static final void c(final l l, final f0 f0) {
        k0.p(l, "$transaction");
        k0.o(f0, "it");
        l.invoke(f0);
    }
}
