// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.reflect.jvm.internal.impl.load.kotlin.d;
import kotlin.reflect.jvm.internal.impl.descriptors.i0;
import kotlin.reflect.jvm.internal.impl.descriptors.l0;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.h;
import kotlin.collections.v;
import kotlin.j2;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.b;
import kotlin.reflect.jvm.internal.impl.load.kotlin.u;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.i;
import kotlin.reflect.jvm.internal.impl.load.kotlin.m;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import java.util.Map;
import t6.c;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.x;
import kotlin.reflect.jvm.internal.impl.storage.n;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.f$a;
import kotlin.reflect.jvm.internal.impl.storage.f;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.w;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.j;
import org.jetbrains.annotations.e;

public final class k
{
    @e
    public static final a c;
    @e
    private final j a;
    @e
    private final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a b;
    
    static {
        c = new a(null);
    }
    
    private k(final j a, final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a b) {
        this.a = a;
        this.b = b;
    }
    
    @e
    public final j a() {
        return this.a;
    }
    
    @e
    public final e0 b() {
        return this.a.p();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a c() {
        return this.b;
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final k a(@e final ClassLoader obj) {
            k0.p((Object)obj, "classLoader");
            final f f = new f("RuntimeModuleData");
            final kotlin.reflect.jvm.internal.impl.builtins.jvm.f f2 = new kotlin.reflect.jvm.internal.impl.builtins.jvm.f((n)f, f$a.G);
            final StringBuilder sb = new StringBuilder();
            sb.append("<runtime module for ");
            sb.append(obj);
            sb.append('>');
            final kotlin.reflect.jvm.internal.impl.name.e l = kotlin.reflect.jvm.internal.impl.name.e.l(sb.toString());
            k0.o((Object)l, "special(\"<runtime module for $classLoader>\")");
            final x builtInsModule = new x(l, (n)f, (KotlinBuiltIns)f2, (c)null, (Map)null, (kotlin.reflect.jvm.internal.impl.name.e)null, 56, (w)null);
            ((KotlinBuiltIns)f2).setBuiltInsModule(builtInsModule);
            f2.v((e0)builtInsModule, true);
            final g g = new g(obj);
            final kotlin.reflect.jvm.internal.impl.load.kotlin.e e = new kotlin.reflect.jvm.internal.impl.load.kotlin.e();
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.j j = new kotlin.reflect.jvm.internal.impl.load.java.lazy.j();
            final g0 g2 = new g0((n)f, (e0)builtInsModule);
            final kotlin.reflect.jvm.internal.impl.load.java.lazy.f c = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.c(obj, (e0)builtInsModule, f, g2, g, e, j, null, 128, null);
            final d a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.l.a((e0)builtInsModule, f, g2, c, g, e);
            e.n(a);
            final kotlin.reflect.jvm.internal.impl.load.java.components.g a2 = kotlin.reflect.jvm.internal.impl.load.java.components.g.a;
            k0.o((Object)a2, "EMPTY");
            final b b = new b(c, a2);
            j.c(b);
            final ClassLoader classLoader = j2.class.getClassLoader();
            k0.o((Object)classLoader, "stdlibClassLoader");
            final h h = new h((n)f, (m)new g(classLoader), (e0)builtInsModule, g2, (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.a)f2.u(), (kotlin.reflect.jvm.internal.impl.descriptors.deserialization.c)f2.u(), (kotlin.reflect.jvm.internal.impl.serialization.deserialization.k)kotlin.reflect.jvm.internal.impl.serialization.deserialization.k.a.a, (kotlin.reflect.jvm.internal.impl.types.checker.l)kotlin.reflect.jvm.internal.impl.types.checker.l.b.a(), (u6.a)new u6.b(f, v.E()));
            builtInsModule.Y0(new x[] { builtInsModule });
            builtInsModule.S0((i0)new kotlin.reflect.jvm.internal.impl.descriptors.impl.i(v.L((Object[])new l0[] { (l0)b.a(), (l0)h })));
            return new k(a.a(), new kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.a(e, g), null);
        }
    }
}
