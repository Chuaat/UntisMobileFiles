// 
// Decompiled by Procyon v0.5.36
// 

package r6;

import kotlin.reflect.jvm.internal.impl.descriptors.h0;
import kotlin.reflect.jvm.internal.impl.incremental.components.f;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.resolve.d;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.incremental.components.c;

public final class a
{
    public static final void a(@e final c c, @e final b b, @e final kotlin.reflect.jvm.internal.impl.descriptors.e e, @e final kotlin.reflect.jvm.internal.impl.name.e e2) {
        k0.p((Object)c, "<this>");
        k0.p((Object)b, "from");
        k0.p((Object)e, "scopeOwner");
        k0.p((Object)e2, "name");
        if (c == kotlin.reflect.jvm.internal.impl.incremental.components.c.a.a) {
            return;
        }
        final kotlin.reflect.jvm.internal.impl.incremental.components.a b2 = b.b();
        if (b2 == null) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.incremental.components.e e3;
        if (c.a()) {
            e3 = b2.getPosition();
        }
        else {
            e3 = kotlin.reflect.jvm.internal.impl.incremental.components.e.I.a();
        }
        final String a = b2.a();
        final String b3 = d.m((m)e).b();
        k0.o((Object)b3, "getFqName(scopeOwner).asString()");
        final f h = f.H;
        final String d = e2.d();
        k0.o((Object)d, "name.asString()");
        c.b(a, e3, b3, h, d);
    }
    
    public static final void b(@e final c c, @e final b b, @e final h0 h0, @e final kotlin.reflect.jvm.internal.impl.name.e e) {
        k0.p((Object)c, "<this>");
        k0.p((Object)b, "from");
        k0.p((Object)h0, "scopeOwner");
        k0.p((Object)e, "name");
        final String b2 = h0.f().b();
        k0.o((Object)b2, "scopeOwner.fqName.asString()");
        final String d = e.d();
        k0.o((Object)d, "name.asString()");
        c(c, b, b2, d);
    }
    
    public static final void c(@e final c c, @e final b b, @e final String s, @e final String s2) {
        k0.p((Object)c, "<this>");
        k0.p((Object)b, "from");
        k0.p((Object)s, "packageFqName");
        k0.p((Object)s2, "name");
        if (c == kotlin.reflect.jvm.internal.impl.incremental.components.c.a.a) {
            return;
        }
        final kotlin.reflect.jvm.internal.impl.incremental.components.a b2 = b.b();
        if (b2 == null) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.incremental.components.e e;
        if (c.a()) {
            e = b2.getPosition();
        }
        else {
            e = kotlin.reflect.jvm.internal.impl.incremental.components.e.I.a();
        }
        c.b(b2.a(), e, s, f.G, s2);
    }
}
