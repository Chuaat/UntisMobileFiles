// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils;

import org.jetbrains.annotations.e;
import kotlin.jvm.internal.k0;
import rx.android.schedulers.a;
import rx.schedulers.c;
import rx.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005" }, d2 = { "Target", "target", "Lrx/g;", "a", "(Ljava/lang/Object;)Lrx/g;", "untismobile_5.1.0_release" }, k = 2, mv = { 1, 5, 1 })
public final class l0
{
    @e
    public static final <Target> g<Target> a(final Target target) {
        final g q3 = g.U2((Object)target).E5(c.e()).Q3(a.c());
        k0.o(q3, "just(target)\n            .subscribeOn(Schedulers.io())\n            .observeOn(AndroidSchedulers.mainThread())");
        return (g<Target>)q3;
    }
}
