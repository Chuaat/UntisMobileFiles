// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.load.kotlin.o;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.c;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;

public final class g implements m
{
    @e
    private final ClassLoader a;
    @e
    private final c b;
    
    public g(@e final ClassLoader a) {
        k0.p((Object)a, "classLoader");
        this.a = a;
        this.b = new c();
    }
    
    private final m.a d(final String s) {
        final Class<?> a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(this.a, s);
        Object o = null;
        if (a != null) {
            final f a2 = f.c.a(a);
            if (a2 != null) {
                o = new b(a2, null, 2, null);
            }
        }
        return (m.a)o;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public m.a a(@e final kotlin.reflect.jvm.internal.impl.load.java.structure.g g) {
        k0.p((Object)g, "javaClass");
        final kotlin.reflect.jvm.internal.impl.name.b f = g.f();
        String b;
        if (f == null) {
            b = null;
        }
        else {
            b = f.b();
        }
        if (b == null) {
            return null;
        }
        return this.d(b);
    }
    
    @org.jetbrains.annotations.f
    @Override
    public InputStream b(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p((Object)b, "packageFqName");
        if (!b.i(StandardNames.BUILT_INS_PACKAGE_NAME)) {
            return null;
        }
        return this.b.a(kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.a.n.n(b));
    }
    
    @org.jetbrains.annotations.f
    @Override
    public m.a c(@e final kotlin.reflect.jvm.internal.impl.name.a a) {
        k0.p((Object)a, "classId");
        return this.d(h.a(a));
    }
}
