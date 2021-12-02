// 
// Decompiled by Procyon v0.5.36
// 

package com.squareup.moshi;

import com.squareup.moshi.internal.a;
import com.squareup.moshi.internal.b;
import kotlin.reflect.d0;
import org.jetbrains.annotations.e;
import kotlin.q;
import kotlin.reflect.s;
import kotlin.jvm.internal.k0;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u0001H\u0087\b\u001a#\u0010\u0006\u001a\u00020\u0004\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u001a \u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007¨\u0006\n" }, d2 = { "T", "Lcom/squareup/moshi/x;", "Lcom/squareup/moshi/h;", "a", "Lcom/squareup/moshi/x$c;", "adapter", "c", "Lkotlin/reflect/s;", "ktype", "b", "moshi" }, k = 2, mv = { 1, 4, 2 })
public final class b0
{
    @q
    @e
    public static final <T> h<T> b(@e final x x, @e final s s) {
        k0.p(x, "$this$adapter");
        k0.p(s, "ktype");
        h<T> h2;
        final h<T> h = h2 = x.d(d0.f(s));
        if (!(h instanceof b)) {
            if (h instanceof a) {
                h2 = h;
            }
            else {
                if (s.c()) {
                    h2 = h.j();
                }
                else {
                    h2 = h.i();
                }
                k0.o(h2, "if (ktype.isMarkedNullab\u2026    adapter.nonNull()\n  }");
            }
        }
        return h2;
    }
}
