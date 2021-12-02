// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm;

import kotlin.reflect.jvm.internal.impl.metadata.a$t;
import kotlin.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.k;
import kotlin.reflect.jvm.internal.l;
import kotlin.reflect.jvm.internal.b;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.u;
import n6.p;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.metadata.a$i;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.g;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.h;
import kotlin.jvm.internal.k0;
import kotlin.reflect.i;
import org.jetbrains.annotations.e;
import kotlin.t;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0004" }, d2 = { "R", "Lkotlin/t;", "Lkotlin/reflect/i;", "a", "kotlin-reflection" }, k = 2, mv = { 1, 4, 1 })
public final class f
{
    @org.jetbrains.annotations.f
    public static final <R> i<R> a(@e final t<? extends R> t) {
        k0.p(t, "$this$reflect");
        final Metadata metadata = t.getClass().getAnnotation(Metadata.class);
        if (metadata != null) {
            String[] d1 = metadata.d1();
            final int length = d1.length;
            boolean b = true;
            if (length == 0) {
                d1 = null;
            }
            if (d1 != null) {
                final s0 j = h.j(d1, metadata.d2());
                final g g = j.a();
                final a$i a$i = (a$i)j.b();
                final int[] mv = metadata.mv();
                if ((metadata.xi() & 0x8) == 0x0) {
                    b = false;
                }
                final kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f f = new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.f(mv, b);
                final Class<? extends t> class1 = t.getClass();
                final a$t g2 = a$i.g0();
                k0.o(g2, "proto.typeTable");
                final v0 v0 = kotlin.reflect.jvm.internal.k0.f((Class<?>)class1, a$i, (c)g, new kotlin.reflect.jvm.internal.impl.metadata.deserialization.g(g2), (a)f, (p<? super u, ? super a$i, ? extends v0>)f$a.G);
                if (v0 != null) {
                    return (i<R>)new l(kotlin.reflect.jvm.internal.b.J, v0);
                }
            }
        }
        return null;
    }
}
