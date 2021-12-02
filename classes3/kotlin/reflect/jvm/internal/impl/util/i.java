// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.util;

import kotlin.collections.v;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.jvm.internal.w;
import java.util.List;
import org.jetbrains.annotations.e;

public final class i extends a
{
    @e
    public static final i a;
    @e
    private static final List<d> b;
    
    static {
        a = new i();
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.util.j.j;
        final f.b b2 = f.b.b;
        final d d = new d(j, new b[] { b2, new l.a(1) }, null, 4, null);
        final d d2 = new d(kotlin.reflect.jvm.internal.impl.util.j.k, new b[] { b2, new l.a(2) }, (n6.l<? super y, String>)i$a.G);
        final kotlin.reflect.jvm.internal.impl.name.e b3 = kotlin.reflect.jvm.internal.impl.util.j.b;
        final h a2 = h.a;
        final l.a a3 = new l.a(2);
        final kotlin.reflect.jvm.internal.impl.util.e a4 = kotlin.reflect.jvm.internal.impl.util.e.a;
        final d d3 = new d(b3, new b[] { b2, a2, a3, a4 }, null, 4, null);
        final d d4 = new d(kotlin.reflect.jvm.internal.impl.util.j.c, new b[] { b2, a2, new l.a(3), a4 }, null, 4, null);
        final d d5 = new d(kotlin.reflect.jvm.internal.impl.util.j.d, new b[] { b2, a2, new l.b(2), a4 }, null, 4, null);
        final d d6 = new d(kotlin.reflect.jvm.internal.impl.util.j.h, new b[] { b2 }, null, 4, null);
        final kotlin.reflect.jvm.internal.impl.name.e g = kotlin.reflect.jvm.internal.impl.util.j.g;
        final l.d b4 = l.d.b;
        final k.a d7 = k.a.d;
        final d d8 = new d(g, new b[] { b2, b4, a2, d7 }, null, 4, null);
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.util.j.i;
        final l.c b5 = l.c.b;
        b = v.L((Object[])new d[] { d, d2, d3, d4, d5, d6, d8, new d(i, new b[] { b2, b5 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.l, new b[] { b2, b5 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.m, new b[] { b2, b5, d7 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.C, new b[] { b2, b4, a2 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.e, new b[] { f.a.b }, (n6.l<? super y, String>)i$b.G), new d(kotlin.reflect.jvm.internal.impl.util.j.f, new b[] { b2, k.b.d, b4, a2 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.L, new b[] { b2, b4, a2 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.K, new b[] { b2, b5 }, null, 4, null), new d(v.L((Object[])new kotlin.reflect.jvm.internal.impl.name.e[] { kotlin.reflect.jvm.internal.impl.util.j.r, kotlin.reflect.jvm.internal.impl.util.j.s }), new b[] { b2 }, (n6.l<? super y, String>)i$c.G), new d(kotlin.reflect.jvm.internal.impl.util.j.M, new b[] { b2, k.c.d, b4, a2 }, null, 4, null), new d(kotlin.reflect.jvm.internal.impl.util.j.o, new b[] { b2, b5 }, null, 4, null) });
    }
    
    private i() {
    }
    
    @e
    @Override
    public List<d> b() {
        return i.b;
    }
}
