// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.logger;

import java.io.PrintStream;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¨\u0006\u000b" }, d2 = { "Lorg/koin/core/logger/e;", "Lorg/koin/core/logger/c;", "Lorg/koin/core/logger/b;", "level", "", "Lorg/koin/core/logger/MESSAGE;", "msg", "Lkotlin/j2;", "f", "<init>", "(Lorg/koin/core/logger/b;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public final class e extends c
{
    public e() {
        this(null, 1, null);
    }
    
    public e(@org.jetbrains.annotations.e final b b) {
        k0.q((Object)b, "level");
        super(b);
    }
    
    @Override
    public void f(@org.jetbrains.annotations.e final b b, @org.jetbrains.annotations.e final String str) {
        k0.q((Object)b, "level");
        k0.q((Object)str, "msg");
        PrintStream printStream;
        if (b.compareTo(b.I) >= 0) {
            printStream = System.err;
        }
        else {
            printStream = System.out;
        }
        if (this.c().compareTo(b) <= 0) {
            final StringBuilder sb = new StringBuilder();
            sb.append('[');
            sb.append(b);
            sb.append("] [Koin] ");
            sb.append(str);
            printStream.println(sb.toString());
        }
    }
}
