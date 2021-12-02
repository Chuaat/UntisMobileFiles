// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.lang.reflect.Modifier;
import kotlin.collections.v;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a0;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Member;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.Constructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.k;

public final class m extends r implements k
{
    @e
    private final Constructor<?> a;
    
    public m(@e final Constructor<?> a) {
        k0.p((Object)a, "member");
        this.a = a;
    }
    
    @e
    public Constructor<?> V() {
        return this.a;
    }
    
    @e
    @Override
    public List<x> getTypeParameters() {
        final TypeVariable<Constructor<?>>[] typeParameters = this.V().getTypeParameters();
        k0.o((Object)typeParameters, "member.typeParameters");
        final ArrayList list = new ArrayList<x>(typeParameters.length);
        for (int length = typeParameters.length, i = 0; i < length; ++i) {
            list.add(new x(typeParameters[i]));
        }
        return (List<x>)list;
    }
    
    @e
    @Override
    public List<a0> m() {
        final Type[] genericParameterTypes = this.V().getGenericParameterTypes();
        k0.o((Object)genericParameterTypes, "types");
        if (genericParameterTypes.length == 0) {
            return (List<a0>)v.E();
        }
        final Class<?> declaringClass = this.V().getDeclaringClass();
        Type[] array = genericParameterTypes;
        if (declaringClass.getDeclaringClass() != null) {
            array = genericParameterTypes;
            if (!Modifier.isStatic(declaringClass.getModifiers())) {
                array = (Type[])kotlin.collections.m.M1((Object[])genericParameterTypes, 1, genericParameterTypes.length);
            }
        }
        final Annotation[][] parameterAnnotations = this.V().getParameterAnnotations();
        if (parameterAnnotations.length >= array.length) {
            Annotation[][] array2 = parameterAnnotations;
            if (parameterAnnotations.length > array.length) {
                k0.o((Object)parameterAnnotations, "annotations");
                array2 = (Annotation[][])kotlin.collections.m.M1((Object[])parameterAnnotations, parameterAnnotations.length - array.length, parameterAnnotations.length);
            }
            k0.o((Object)array, "realTypes");
            k0.o((Object)array2, "realAnnotations");
            return this.U(array, array2, this.V().isVarArgs());
        }
        throw new IllegalStateException(k0.C("Illegal generic signature: ", (Object)this.V()));
    }
}
