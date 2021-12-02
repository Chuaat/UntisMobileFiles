// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.m0;
import n6.l;
import java.util.Iterator;
import java.util.Collection;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import org.jetbrains.annotations.e;

public final class i
{
    @e
    public static final i a;
    
    static {
        a = new i();
    }
    
    private i() {
    }
    
    private final boolean c(final b b) {
        final boolean j1 = v.J1((Iterable)g.a.c(), (Object)kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.e((m)b));
        boolean b2 = true;
        if (j1 && ((kotlin.reflect.jvm.internal.impl.descriptors.a)b).m().isEmpty()) {
            return true;
        }
        if (!KotlinBuiltIns.isBuiltIn((m)b)) {
            return false;
        }
        final Collection g = b.g();
        k0.o((Object)g, "overriddenDescriptors");
        if (!g.isEmpty()) {
            for (final b b3 : g) {
                k0.o((Object)b3, "it");
                if (this.b(b3)) {
                    return b2;
                }
            }
        }
        b2 = false;
        return b2;
    }
    
    @f
    public final String a(@e final b b) {
        k0.p((Object)b, "<this>");
        KotlinBuiltIns.isBuiltIn((m)b);
        final b o = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.o(b);
        final l<b, Boolean> l = (l<b, Boolean>)new l<b, Boolean>() {
            final /* synthetic */ i G;
            
            public final boolean a(@e final b b) {
                k0.p((Object)b, "it");
                return this.G.b(b);
            }
        };
        String d = null;
        final b d2 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.d(o, false, (l)l, 1, null);
        if (d2 == null) {
            return null;
        }
        final kotlin.reflect.jvm.internal.impl.name.e e = g.a.a().get(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.i((m)d2));
        if (e != null) {
            d = e.d();
        }
        return d;
    }
    
    public final boolean b(@e final b b) {
        k0.p((Object)b, "callableMemberDescriptor");
        return g.a.d().contains(((f0)b).getName()) && this.c(b);
    }
}
