// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.load.java.components;

import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.collections.y0;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.c0;
import java.util.Collection;
import kotlin.collections.v;
import kotlin.jvm.internal.m0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.l;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.g;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import org.jetbrains.annotations.e;
import kotlin.reflect.o;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.c;

public class b implements c, i
{
    static final /* synthetic */ o<Object>[] f;
    @e
    private final kotlin.reflect.jvm.internal.impl.name.b a;
    @e
    private final w0 b;
    @e
    private final kotlin.reflect.jvm.internal.impl.storage.i c;
    @f
    private final kotlin.reflect.jvm.internal.impl.load.java.structure.b d;
    private final boolean e;
    
    static {
        f = new o[] { (o)k1.r((e1)new f1((h)k1.d((Class)b.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")) };
    }
    
    public b(@e final g g, @f final a a, @e final kotlin.reflect.jvm.internal.impl.name.b a2) {
        k0.p((Object)g, "c");
        k0.p((Object)a2, "fqName");
        this.a = a2;
        final Object o = null;
        Object a3;
        if (a == null) {
            a3 = null;
        }
        else {
            a3 = g.a().s().a(a);
        }
        w0 a4 = (w0)a3;
        if (a3 == null) {
            a4 = w0.a;
            k0.o((Object)a4, "NO_SOURCE");
        }
        this.b = a4;
        this.c = g.e().g((n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.types.k0>() {
            final /* synthetic */ b H;
            
            @e
            public final kotlin.reflect.jvm.internal.impl.types.k0 a() {
                final kotlin.reflect.jvm.internal.impl.types.k0 a = g.d().w().getBuiltInClassByFqName(this.H.f()).A();
                k0.o((Object)a, "c.module.builtIns.getBuiltInClassByFqName(fqName).defaultType");
                return a;
            }
        });
        kotlin.reflect.jvm.internal.impl.load.java.structure.b d = null;
        Label_0125: {
            if (a != null) {
                final Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.b> arguments = a.getArguments();
                if (arguments != null) {
                    d = (kotlin.reflect.jvm.internal.impl.load.java.structure.b)v.r2((Iterable)arguments);
                    break Label_0125;
                }
            }
            d = null;
        }
        this.d = d;
        Object value;
        if (a == null) {
            value = o;
        }
        else {
            value = a.d();
        }
        this.e = k0.g(value, (Object)Boolean.TRUE);
    }
    
    @e
    public Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> b() {
        return (Map<kotlin.reflect.jvm.internal.impl.name.e, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>>)y0.z();
    }
    
    @f
    protected final kotlin.reflect.jvm.internal.impl.load.java.structure.b c() {
        return this.d;
    }
    
    public boolean d() {
        return this.e;
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.types.k0 e() {
        return m.a((kotlin.reflect.jvm.internal.impl.storage.i<? extends kotlin.reflect.jvm.internal.impl.types.k0>)this.c, (Object)this, (o<?>)kotlin.reflect.jvm.internal.impl.load.java.components.b.f[0]);
    }
    
    @e
    public kotlin.reflect.jvm.internal.impl.name.b f() {
        return this.a;
    }
    
    @e
    public w0 k() {
        return this.b;
    }
}
