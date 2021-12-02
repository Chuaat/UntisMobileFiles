// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import java.util.Iterator;
import java.lang.reflect.Type;
import kotlin.jvm.internal.o1;
import kotlin.reflect.jvm.internal.impl.load.java.structure.w;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.jvm.internal.m0;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;
import n6.l;
import kotlin.sequences.p;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.c0;
import java.util.Collection;
import java.util.Arrays;
import java.lang.reflect.Method;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;

public final class j extends n implements f, t, g
{
    @e
    private final Class<?> a;
    
    public j(@e final Class<?> a) {
        k0.p((Object)a, "klass");
        this.a = a;
    }
    
    private final boolean Z(final Method method) {
        final String name = method.getName();
        final boolean g = k0.g((Object)name, (Object)"values");
        boolean equals = true;
        if (g) {
            final Class<?>[] parameterTypes = method.getParameterTypes();
            k0.o((Object)parameterTypes, "method.parameterTypes");
            if (parameterTypes.length == 0) {
                return equals;
            }
        }
        else if (k0.g((Object)name, (Object)"valueOf")) {
            equals = Arrays.equals(method.getParameterTypes(), new Class[] { String.class });
            return equals;
        }
        equals = false;
        return equals;
    }
    
    @Override
    public boolean A() {
        return this.a.isEnum();
    }
    
    @Override
    public int D() {
        return this.a.getModifiers();
    }
    
    @Override
    public boolean G() {
        return this.a.isInterface();
    }
    
    @org.jetbrains.annotations.f
    @Override
    public c0 H() {
        return null;
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j> M() {
        return (Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j>)v.E();
    }
    
    @Override
    public boolean P() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t.a.d(this);
    }
    
    @org.jetbrains.annotations.f
    public c R(@e final b b) {
        return f.a.a(this, b);
    }
    
    @e
    public List<c> S() {
        return f.a.b(this);
    }
    
    @e
    public List<m> T() {
        final Constructor<?>[] declaredConstructors = this.a.getDeclaredConstructors();
        k0.o((Object)declaredConstructors, "klass.declaredConstructors");
        return (List<m>)p.V2((kotlin.sequences.m<?>)p.d1((kotlin.sequences.m<?>)p.n0((kotlin.sequences.m<?>)kotlin.collections.m.h5((Object[])declaredConstructors), (n6.l<? super Object, Boolean>)j$a.G), (n6.l<? super Object, ?>)j$b.G));
    }
    
    @e
    public Class<?> U() {
        return this.a;
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p> V() {
        final Field[] declaredFields = this.a.getDeclaredFields();
        k0.o((Object)declaredFields, "klass.declaredFields");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p>)p.V2((kotlin.sequences.m<?>)p.d1((kotlin.sequences.m<?>)p.n0((kotlin.sequences.m<?>)kotlin.collections.m.h5((Object[])declaredFields), (n6.l<? super Object, Boolean>)j$c.G), (n6.l<? super Object, ?>)j$d.G));
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.name.e> W() {
        final Class<?>[] declaredClasses = this.a.getDeclaredClasses();
        k0.o((Object)declaredClasses, "klass.declaredClasses");
        return (List<kotlin.reflect.jvm.internal.impl.name.e>)p.V2((kotlin.sequences.m<?>)p.i1((kotlin.sequences.m<?>)p.n0((kotlin.sequences.m<?>)kotlin.collections.m.h5((Object[])declaredClasses), (n6.l<? super Object, Boolean>)j$e.G), (n6.l<? super Object, ?>)j$f.G));
    }
    
    @e
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s> X() {
        final Method[] declaredMethods = this.a.getDeclaredMethods();
        k0.o((Object)declaredMethods, "klass.declaredMethods");
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s>)p.V2((kotlin.sequences.m<?>)p.d1((kotlin.sequences.m<?>)p.i0((kotlin.sequences.m<?>)kotlin.collections.m.h5((Object[])declaredMethods), (n6.l<? super Object, Boolean>)new n6.l<Method, Boolean>() {
            final /* synthetic */ j G;
            
            public final boolean a(final Method method) {
                final boolean synthetic = method.isSynthetic();
                final boolean b = true;
                if (!synthetic) {
                    boolean b2 = b;
                    if (!this.G.A()) {
                        return b2;
                    }
                    final j g = this.G;
                    k0.o((Object)method, "method");
                    if (!g.Z(method)) {
                        b2 = b;
                        return b2;
                    }
                }
                return false;
            }
        }), (n6.l<? super Object, ?>)j$h.G));
    }
    
    @org.jetbrains.annotations.f
    public j Y() {
        final Class<?> declaringClass = this.a.getDeclaringClass();
        j j;
        if (declaringClass == null) {
            j = null;
        }
        else {
            j = new j(declaringClass);
        }
        return j;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof j && k0.g((Object)this.a, (Object)((j)o).a);
    }
    
    @e
    @Override
    public b f() {
        final b b = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.b(this.a).b();
        k0.o((Object)b, "klass.classId.asSingleFqName()");
        return b;
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final kotlin.reflect.jvm.internal.impl.name.e i = kotlin.reflect.jvm.internal.impl.name.e.i(this.a.getSimpleName());
        k0.o((Object)i, "identifier(klass.simpleName)");
        return i;
    }
    
    @e
    @Override
    public List<x> getTypeParameters() {
        final TypeVariable<Class<?>>[] typeParameters = this.a.getTypeParameters();
        k0.o((Object)typeParameters, "klass.typeParameters");
        final ArrayList list = new ArrayList<x>(typeParameters.length);
        for (int length = typeParameters.length, i = 0; i < length; ++i) {
            list.add(new x(typeParameters[i]));
        }
        return (List<x>)list;
    }
    
    @e
    @Override
    public j1 getVisibility() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t.a.a(this);
    }
    
    @e
    @Override
    public Collection<w> h() {
        return (Collection<w>)v.E();
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean i() {
        return f.a.c(this);
    }
    
    @Override
    public boolean isAbstract() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t.a.b(this);
    }
    
    @Override
    public boolean isFinal() {
        return kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.t.a.c(this);
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j> k() {
        final Class<Object> clazz = Object.class;
        if (k0.g((Object)this.a, (Object)Object.class)) {
            return (Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j>)v.E();
        }
        final o1 o1 = new o1(2);
        Type genericSuperclass = this.a.getGenericSuperclass();
        if (genericSuperclass == null) {
            genericSuperclass = clazz;
        }
        o1.a((Object)genericSuperclass);
        final Type[] genericInterfaces = this.a.getGenericInterfaces();
        k0.o((Object)genericInterfaces, "klass.genericInterfaces");
        o1.b((Object)genericInterfaces);
        final List l = v.L(o1.d((Object[])new Type[o1.c()]));
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l>(v.Y((Iterable)l, 10));
        final Iterator<Type> iterator = (Iterator<Type>)l.iterator();
        while (iterator.hasNext()) {
            list.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l(iterator.next()));
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.j>)list;
    }
    
    @Override
    public boolean p() {
        return this.a.isAnnotation();
    }
    
    @Override
    public boolean r() {
        return false;
    }
    
    @Override
    public boolean s() {
        return false;
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(j.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
    
    @Override
    public boolean w() {
        return false;
    }
}
