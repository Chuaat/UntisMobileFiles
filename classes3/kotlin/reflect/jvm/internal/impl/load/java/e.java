// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.f0;
import java.util.Objects;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import n6.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import org.jetbrains.annotations.f;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.descriptors.a;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.collections.v;
import kotlin.jvm.internal.k0;
import java.util.List;

public final class e extends c0
{
    @org.jetbrains.annotations.e
    public static final e n;
    
    static {
        n = new e();
    }
    
    private e() {
    }
    
    @org.jetbrains.annotations.e
    public final List<kotlin.reflect.jvm.internal.impl.name.e> i(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "name");
        List<kotlin.reflect.jvm.internal.impl.name.e> e2;
        if ((e2 = c0.a.e().get(e)) == null) {
            e2 = (List<kotlin.reflect.jvm.internal.impl.name.e>)v.E();
        }
        return e2;
    }
    
    @f
    public final kotlin.reflect.jvm.internal.impl.name.e j(@org.jetbrains.annotations.e final v0 v0) {
        k0.p((Object)v0, "functionDescriptor");
        final Map<String, kotlin.reflect.jvm.internal.impl.name.e> i = c0.a.i();
        final String d = t.d((a)v0);
        if (d == null) {
            return null;
        }
        return i.get(d);
    }
    
    public final boolean k(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)e, "<this>");
        return c0.a.f().contains(e);
    }
    
    public final boolean l(@org.jetbrains.annotations.e final v0 v0) {
        k0.p((Object)v0, "functionDescriptor");
        final boolean builtIn = KotlinBuiltIns.isBuiltIn((m)v0);
        boolean b = true;
        if (!builtIn || kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.d((kotlin.reflect.jvm.internal.impl.descriptors.b)v0, false, (l)new l<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean>() {
            public final boolean a(@org.jetbrains.annotations.e final kotlin.reflect.jvm.internal.impl.descriptors.b b) {
                k0.p((Object)b, "it");
                final Map<String, kotlin.reflect.jvm.internal.impl.name.e> i = c0.a.i();
                final String d = t.d((a)v0);
                Objects.requireNonNull(i, "null cannot be cast to non-null type kotlin.collections.Map<K, *>");
                return i.containsKey(d);
            }
        }, 1, null) == null) {
            b = false;
        }
        return b;
    }
    
    public final boolean m(@org.jetbrains.annotations.e final v0 v0) {
        k0.p((Object)v0, "<this>");
        return k0.g((Object)((f0)v0).getName().d(), (Object)"removeAt") && k0.g((Object)t.d((a)v0), (Object)c0.a.g().b());
    }
}
