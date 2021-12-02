// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.structure.u;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.name.a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j;
import kotlin.text.s;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.q;

public final class d implements q
{
    @e
    private final ClassLoader a;
    
    public d(@e final ClassLoader a) {
        k0.p((Object)a, "classLoader");
        this.a = a;
    }
    
    @f
    @Override
    public g a(@e final a a) {
        k0.p((Object)a, "request");
        final kotlin.reflect.jvm.internal.impl.name.a a2 = a.a();
        final b h = a2.h();
        k0.o((Object)h, "classId.packageFqName");
        final String b = a2.i().b();
        k0.o((Object)b, "classId.relativeClassName.asString()");
        String str = s.j2(b, '.', '$', false, 4, null);
        if (!h.d()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(h.b());
            sb.append('.');
            sb.append(str);
            str = sb.toString();
        }
        final Class<?> a3 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(this.a, str);
        j j;
        if (a3 != null) {
            j = new j(a3);
        }
        else {
            j = null;
        }
        return j;
    }
    
    @f
    @Override
    public u b(@e final b b) {
        k0.p((Object)b, "fqName");
        return new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.u(b);
    }
    
    @f
    @Override
    public Set<String> c(@e final b b) {
        k0.p((Object)b, "packageFqName");
        return null;
    }
}
