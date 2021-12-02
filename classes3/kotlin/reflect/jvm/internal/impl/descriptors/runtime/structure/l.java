// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.util.Iterator;
import java.util.ArrayList;
import kotlin.collections.v;
import java.util.List;
import java.util.Objects;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.i;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.j;

public final class l extends w implements j
{
    @e
    private final Type b;
    @e
    private final i c;
    
    public l(@e Type obj) {
        k0.p((Object)obj, "reflectType");
        this.b = obj;
        obj = this.Q();
        f c;
        if (obj instanceof Class) {
            c = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j((Class<?>)obj);
        }
        else if (obj instanceof TypeVariable) {
            c = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x((TypeVariable<?>)obj);
        }
        else {
            if (!(obj instanceof ParameterizedType)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Not a classifier type (");
                sb.append(obj.getClass());
                sb.append("): ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString());
            }
            obj = ((ParameterizedType)obj).getRawType();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            c = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.j((Class<?>)obj);
        }
        this.c = (i)c;
    }
    
    @e
    @Override
    public List<x> E() {
        final List<Type> e = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.b.e(this.Q());
        final w.a a = w.a;
        final ArrayList list = new ArrayList<w>(v.Y((Iterable)e, 10));
        final Iterator<Object> iterator = e.iterator();
        while (iterator.hasNext()) {
            list.add(a.a(iterator.next()));
        }
        return (List<x>)list;
    }
    
    @e
    public Type Q() {
        return this.b;
    }
    
    @org.jetbrains.annotations.f
    @Override
    public a a0(@e final kotlin.reflect.jvm.internal.impl.name.b b) {
        k0.p((Object)b, "fqName");
        return null;
    }
    
    @e
    @Override
    public i b() {
        return this.c;
    }
    
    @e
    @Override
    public Collection<a> getAnnotations() {
        return (Collection<a>)v.E();
    }
    
    @Override
    public boolean i() {
        return false;
    }
    
    @e
    @Override
    public String o() {
        return this.Q().toString();
    }
    
    @Override
    public boolean v() {
        final Type q = this.Q();
        final boolean b = q instanceof Class;
        boolean b2 = false;
        if (b) {
            final TypeVariable[] typeParameters = ((Class)q).getTypeParameters();
            k0.o((Object)typeParameters, "getTypeParameters()");
            final boolean b3 = typeParameters.length == 0;
            b2 = b2;
            if (b3 ^ true) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @e
    @Override
    public String x() {
        throw new UnsupportedOperationException(k0.C("Type not found: ", (Object)this.Q()));
    }
}
