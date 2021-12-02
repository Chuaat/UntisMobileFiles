// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import kotlin.jvm.internal.k1;
import kotlin.reflect.h;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.g;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.i;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.q;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.p;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.t;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.d;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.m;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.k;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import java.util.ArrayList;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a$a;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.reflect.jvm.internal.impl.storage.n;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.builtins.BuiltInsLoader;

public final class BuiltInsLoaderImpl implements BuiltInsLoader
{
    @e
    private final c a;
    
    public BuiltInsLoaderImpl() {
        this.a = new c();
    }
    
    @e
    public final i0 a(@e final n n, @e final e0 e0, @e final Set<b> set, @e final Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> iterable, @e final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c c, @e final a a, final boolean b, @e final l<? super String, ? extends InputStream> l) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)e0, "module");
        k0.p((Object)set, "packageFqNames");
        k0.p((Object)iterable, "classDescriptorFactories");
        k0.p((Object)c, "platformDependentDeclarationFilter");
        k0.p((Object)a, "additionalClassPartsProvider");
        k0.p((Object)l, "loadResource");
        final ArrayList<kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b> list = new ArrayList<kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.b>(v.Y((Iterable)set, 10));
        for (final b b2 : set) {
            final String n2 = a.n.n(b2);
            final InputStream inputStream = (InputStream)l.invoke((Object)n2);
            if (inputStream == null) {
                throw new IllegalStateException(k0.C("Resource not found in classpath: ", (Object)n2));
            }
            list.add(b.T.a(b2, n, e0, inputStream, b));
        }
        final j0 j0 = new j0((Collection)list);
        final g0 g0 = new g0(n, e0);
        final k.a a2 = k.a.a;
        final m m = new m((i0)j0);
        final kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a n3 = a.n;
        final d d = new d(e0, g0, n3);
        final t.a a3 = t.a.a;
        final p a4 = p.a;
        k0.o((Object)a4, "DO_NOTHING");
        final j i = new j(n, e0, a2, m, d, (i0)j0, a3, a4, c.a.a, q.a.a, iterable, g0, kotlin.reflect.jvm.internal.impl.serialization.deserialization.i.a.a(), a, c, n3.e(), null, new u6.b(n, v.E()), null, 327680, null);
        final Iterator<Object> iterator2 = list.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().M0(i);
        }
        return (i0)j0;
    }
    
    @e
    public i0 createPackageFragmentProvider(@e final n n, @e final e0 e0, @e final Iterable<? extends kotlin.reflect.jvm.internal.impl.descriptors.deserialization.b> iterable, @e final kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c c, @e final a a, final boolean b) {
        k0.p((Object)n, "storageManager");
        k0.p((Object)e0, "builtInsModule");
        k0.p((Object)iterable, "classDescriptorFactories");
        k0.p((Object)c, "platformDependentDeclarationFilter");
        k0.p((Object)a, "additionalClassPartsProvider");
        return this.a(n, e0, StandardNames.BUILT_INS_PACKAGE_FQ_NAMES, iterable, c, a, b, (l<? super String, ? extends InputStream>)new l<String, InputStream>(this.a));
    }
}
