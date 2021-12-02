// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.logger;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\u000b" }, d2 = { "Lorg/koin/core/logger/a;", "Lorg/koin/core/logger/c;", "Lorg/koin/core/logger/b;", "level", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lkotlin/j2;", "f", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class a extends c
{
    public a() {
        super(b.I);
    }
    
    @Override
    public void f(@e final b b, @e final String s) {
        k0.q((Object)b, "level");
        k0.q((Object)s, "msg");
    }
}
