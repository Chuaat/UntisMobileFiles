// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.AnnotatedElement;
import kotlin.reflect.jvm.internal.impl.descriptors.j1;
import java.util.Collection;
import kotlin.collections.m;
import kotlin.collections.v;
import java.util.ArrayList;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.Member;
import kotlin.jvm.internal.k0;
import java.util.List;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.name.b;
import kotlin.reflect.jvm.internal.impl.load.java.structure.g;
import kotlin.reflect.jvm.internal.impl.load.java.structure.q;

public abstract class r extends n implements f, t, q
{
    @Override
    public int D() {
        return this.T().getModifiers();
    }
    
    @Override
    public boolean P() {
        return a.d(this);
    }
    
    @org.jetbrains.annotations.f
    public c Q(@e final b b) {
        return f.a.a(this, b);
    }
    
    @e
    public List<c> R() {
        return f.a.b(this);
    }
    
    @e
    public j S() {
        final Class<?> declaringClass = this.T().getDeclaringClass();
        k0.o((Object)declaringClass, "member.declaringClass");
        return new j(declaringClass);
    }
    
    @e
    public abstract Member T();
    
    @e
    protected final List<a0> U(@e final Type[] array, @e final Annotation[][] array2, final boolean b) {
        k0.p((Object)array, "parameterTypes");
        k0.p((Object)array2, "parameterAnnotations");
        final ArrayList<y> list = (ArrayList<y>)new ArrayList<a0>(array.length);
        final List<String> b2 = a.a.b(this.T());
        Integer value;
        if (b2 == null) {
            value = null;
        }
        else {
            value = b2.size();
        }
        int i;
        if (value == null) {
            i = 0;
        }
        else {
            i = value - array.length;
        }
        final int n = array.length - 1;
        if (n >= 0) {
            int j = 0;
            while (true) {
                final int n2 = j + 1;
                final w a = w.a.a(array[j]);
                String s;
                if (b2 == null) {
                    s = null;
                }
                else {
                    s = (String)v.J2((List)b2, j + i);
                    if (s == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("No parameter with index ");
                        sb.append(j);
                        sb.append('+');
                        sb.append(i);
                        sb.append(" (name=");
                        sb.append(this.getName());
                        sb.append(" type=");
                        sb.append(a);
                        sb.append(") in ");
                        sb.append(b2);
                        sb.append("@ReflectJavaMember");
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                list.add(new y(a, array2[j], s, b && j == m.Td((Object[])array)));
                if (n2 > n) {
                    break;
                }
                j = n2;
            }
        }
        return (List<a0>)list;
    }
    
    @Override
    public boolean equals(@org.jetbrains.annotations.f final Object o) {
        return o instanceof r && k0.g((Object)this.T(), (Object)((r)o).T());
    }
    
    @e
    @Override
    public kotlin.reflect.jvm.internal.impl.name.e getName() {
        final String name = this.T().getName();
        kotlin.reflect.jvm.internal.impl.name.e i;
        if (name == null) {
            i = null;
        }
        else {
            i = kotlin.reflect.jvm.internal.impl.name.e.i(name);
        }
        kotlin.reflect.jvm.internal.impl.name.e a = i;
        if (i == null) {
            a = kotlin.reflect.jvm.internal.impl.name.g.a;
            k0.o((Object)a, "NO_NAME_PROVIDED");
        }
        return a;
    }
    
    @e
    @Override
    public j1 getVisibility() {
        return a.a(this);
    }
    
    @Override
    public int hashCode() {
        return this.T().hashCode();
    }
    
    @Override
    public boolean i() {
        return f.a.c(this);
    }
    
    @Override
    public boolean isAbstract() {
        return a.b(this);
    }
    
    @Override
    public boolean isFinal() {
        return a.c(this);
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(": ");
        sb.append(this.T());
        return sb.toString();
    }
    
    @e
    @Override
    public AnnotatedElement u() {
        return (AnnotatedElement)this.T();
    }
}
