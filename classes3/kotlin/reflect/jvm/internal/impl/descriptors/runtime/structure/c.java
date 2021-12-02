// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import org.jetbrains.annotations.f;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;

public final class c extends n implements a
{
    @e
    private final Annotation a;
    
    public c(@e final Annotation a) {
        k0.p((Object)a, "annotation");
        this.a = a;
    }
    
    @e
    public final Annotation Q() {
        return this.a;
    }
    
    @e
    public j R() {
        return new j(m6.a.c(m6.a.a(this.a)));
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.a c() {
        return b.b(m6.a.c(m6.a.a(this.a)));
    }
    
    @Override
    public boolean d() {
        return kotlin.reflect.jvm.internal.impl.load.java.structure.a.a.b(this);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof c && k0.g((Object)this.a, (Object)((c)o).a);
    }
    
    @e
    @Override
    public Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.b> getArguments() {
        final Method[] declaredMethods = m6.a.c(m6.a.a(this.a)).getDeclaredMethods();
        k0.o((Object)declaredMethods, "annotation.annotationClass.java.declaredMethods");
        final ArrayList list = new ArrayList<d>(declaredMethods.length);
        for (final Method method : declaredMethods) {
            final d.a b = d.b;
            final Object invoke = method.invoke(this.Q(), new Object[0]);
            k0.o(invoke, "method.invoke(annotation)");
            list.add(b.a(invoke, kotlin.reflect.jvm.internal.impl.name.e.i(method.getName())));
        }
        return (Collection<kotlin.reflect.jvm.internal.impl.load.java.structure.b>)list;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public boolean t() {
        return kotlin.reflect.jvm.internal.impl.load.java.structure.a.a.a(this);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(c.class.getName());
        sb.append(": ");
        sb.append(this.a);
        return sb.toString();
    }
}
