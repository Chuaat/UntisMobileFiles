// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.b0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import n6.l;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.d;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.h;
import java.util.LinkedHashSet;
import org.jetbrains.annotations.e;

public final class a extends n
{
    @e
    public static final a a;
    
    static {
        a = new a();
    }
    
    private a() {
    }
    
    private static final void b(final kotlin.reflect.jvm.internal.impl.descriptors.e e, final LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e> set, final h h, final boolean b) {
        for (final m e2 : k.a.a(h, d.t, null, 2, null)) {
            if (!(e2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e)) {
                continue;
            }
            final kotlin.reflect.jvm.internal.impl.descriptors.e e3 = (kotlin.reflect.jvm.internal.impl.descriptors.e)e2;
            if (kotlin.reflect.jvm.internal.impl.resolve.d.z(e3, e)) {
                set.add((kotlin.reflect.jvm.internal.impl.descriptors.e)e2);
            }
            if (!b) {
                continue;
            }
            final h b2 = e3.B0();
            k0.o((Object)b2, "descriptor.unsubstitutedInnerClassesScope");
            b(e, set, b2, b);
        }
    }
    
    @e
    public Collection<kotlin.reflect.jvm.internal.impl.descriptors.e> a(@e final kotlin.reflect.jvm.internal.impl.descriptors.e e, final boolean b) {
        k0.p((Object)e, "sealedClass");
        if (e.o() != b0.I) {
            return (Collection<kotlin.reflect.jvm.internal.impl.descriptors.e>)v.E();
        }
        final LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e> set = new LinkedHashSet<kotlin.reflect.jvm.internal.impl.descriptors.e>();
        m c = null;
        Label_0099: {
            if (b) {
                while (true) {
                    for (final m next : kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.m((m)e)) {
                        if (next instanceof h0) {
                            c = next;
                            break Label_0099;
                        }
                    }
                    m next = null;
                    continue;
                }
            }
            c = e.c();
        }
        if (c instanceof h0) {
            b(e, set, ((h0)c).x(), b);
        }
        final h b2 = e.B0();
        k0.o((Object)b2, "sealedClass.unsubstitutedInnerClassesScope");
        b(e, set, b2, true);
        return set;
    }
}
