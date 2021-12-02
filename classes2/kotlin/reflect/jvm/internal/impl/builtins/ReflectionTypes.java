// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.builtins;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.k;
import kotlin.text.s;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.types.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.types.c0;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.incremental.components.b;
import kotlin.reflect.jvm.internal.impl.incremental.components.d;
import kotlin.d0;
import kotlin.jvm.internal.m0;
import n6.a;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.e0;
import kotlin.jvm.internal.e1;
import kotlin.reflect.h;
import kotlin.jvm.internal.f1;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.w;
import kotlin.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.o;
import org.jetbrains.annotations.e;

public final class ReflectionTypes
{
    @e
    public static final Companion Companion;
    static final /* synthetic */ o<Object>[] k;
    @e
    private final g0 a;
    @e
    private final b0 b;
    @e
    private final a c;
    @e
    private final a d;
    @e
    private final a e;
    @e
    private final a f;
    @e
    private final a g;
    @e
    private final a h;
    @e
    private final a i;
    @e
    private final a j;
    
    static {
        Companion = new Companion(null);
        k = new o[] { null, k1.r(new f1(k1.d(ReflectionTypes.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), k1.r(new f1(k1.d(ReflectionTypes.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")) };
    }
    
    public ReflectionTypes(@e final e0 e0, @e final g0 a) {
        k0.p(e0, "module");
        k0.p(a, "notFoundClasses");
        this.a = a;
        this.b = d0.b(kotlin.g0.H, (n6.a<?>)new n6.a<kotlin.reflect.jvm.internal.impl.resolve.scopes.h>() {
            @e
            public final kotlin.reflect.jvm.internal.impl.resolve.scopes.h a() {
                return e0.R(StandardNames.KOTLIN_REFLECT_FQ_NAME).x();
            }
        });
        this.c = new a(1);
        this.d = new a(1);
        this.e = new a(1);
        this.f = new a(2);
        this.g = new a(3);
        this.h = new a(1);
        this.i = new a(2);
        this.j = new a(3);
    }
    
    private final kotlin.reflect.jvm.internal.impl.descriptors.e a(final String s, final int i) {
        final kotlin.reflect.jvm.internal.impl.name.e j = kotlin.reflect.jvm.internal.impl.name.e.i(s);
        k0.o(j, "identifier(className)");
        final kotlin.reflect.jvm.internal.impl.descriptors.h g = ((k)this.b()).g(j, (b)kotlin.reflect.jvm.internal.impl.incremental.components.d.N);
        kotlin.reflect.jvm.internal.impl.descriptors.e e;
        if (g instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            e = (kotlin.reflect.jvm.internal.impl.descriptors.e)g;
        }
        else {
            e = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.e d = e;
        if (e == null) {
            d = this.a.d(new kotlin.reflect.jvm.internal.impl.name.a(StandardNames.KOTLIN_REFLECT_FQ_NAME, j), v.k(i));
        }
        return d;
    }
    
    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.h b() {
        return this.b.getValue();
    }
    
    @e
    public final kotlin.reflect.jvm.internal.impl.descriptors.e getKClass() {
        return this.c.a(this, ReflectionTypes.k[1]);
    }
    
    public static final class Companion
    {
        private Companion() {
        }
        
        @f
        public final c0 createKPropertyStarType(@e final e0 e0) {
            k0.p(e0, "module");
            final kotlin.reflect.jvm.internal.impl.descriptors.e a = x.a(e0, StandardNames.FqNames.kProperty);
            if (a == null) {
                return null;
            }
            final kotlin.reflect.jvm.internal.impl.types.d0 a2 = kotlin.reflect.jvm.internal.impl.types.d0.a;
            final g b = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.r.b();
            final List parameters = a.l().getParameters();
            k0.o(parameters, "kPropertyClass.typeConstructor.parameters");
            final b1 u4 = v.U4((List<? extends b1>)parameters);
            k0.o(u4, "kPropertyClass.typeConstructor.parameters.single()");
            return (c0)kotlin.reflect.jvm.internal.impl.types.d0.g(b, a, (List)v.k(new p0((b1)u4)));
        }
    }
    
    private static final class a
    {
        private final int a;
        
        public a(final int a) {
            this.a = a;
        }
        
        @e
        public final kotlin.reflect.jvm.internal.impl.descriptors.e a(@e final ReflectionTypes reflectionTypes, @e final o<?> o) {
            k0.p(reflectionTypes, "types");
            k0.p(o, "property");
            return reflectionTypes.a(s.m1(o.getName()), this.a);
        }
    }
}
