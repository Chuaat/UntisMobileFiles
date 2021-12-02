// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.LinkedHashMap;
import kotlin.ranges.o;
import kotlin.collections.y0;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import n6.l;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.a;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.c;

public final class w implements g
{
    @e
    private final c a;
    @e
    private final a b;
    @e
    private final l<kotlin.reflect.jvm.internal.impl.name.a, w0> c;
    @e
    private final Map<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.metadata.a.c> d;
    
    public w(@e final kotlin.reflect.jvm.internal.impl.metadata.a.m m, @e final c a, @e final a b, @e final l<? super kotlin.reflect.jvm.internal.impl.name.a, ? extends w0> c) {
        k0.p((Object)m, "proto");
        k0.p((Object)a, "nameResolver");
        k0.p((Object)b, "metadataVersion");
        k0.p((Object)c, "classSource");
        this.a = a;
        this.b = b;
        this.c = (l<kotlin.reflect.jvm.internal.impl.name.a, w0>)c;
        final List<kotlin.reflect.jvm.internal.impl.metadata.a.c> l = m.L();
        k0.o((Object)l, "proto.class_List");
        final LinkedHashMap d = new LinkedHashMap<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.metadata.a.c>(o.n(y0.j(v.Y((Iterable)l, 10)), 16));
        for (final kotlin.reflect.jvm.internal.impl.metadata.a.c next : l) {
            d.put(kotlin.reflect.jvm.internal.impl.serialization.deserialization.v.a(this.a, next.p0()), next);
        }
        this.d = (Map<kotlin.reflect.jvm.internal.impl.name.a, kotlin.reflect.jvm.internal.impl.metadata.a.c>)d;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public f a(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
        k0.p((Object)a, "classId");
        final kotlin.reflect.jvm.internal.impl.metadata.a.c c = this.d.get(a);
        if (c == null) {
            return null;
        }
        return new f(this.a, c, this.b, (w0)this.c.invoke((Object)a));
    }
    
    @e
    public final Collection<kotlin.reflect.jvm.internal.impl.name.a> b() {
        return this.d.keySet();
    }
}
