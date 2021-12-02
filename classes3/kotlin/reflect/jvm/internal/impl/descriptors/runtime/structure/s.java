// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.b;
import java.lang.annotation.Annotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a0;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import java.lang.reflect.Type;
import java.lang.reflect.Member;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.lang.reflect.Method;

public final class s extends r implements kotlin.reflect.jvm.internal.impl.load.java.structure.r
{
    @e
    private final Method a;
    
    public s(@e final Method a) {
        k0.p((Object)a, "member");
        this.a = a;
    }
    
    @Override
    public boolean K() {
        return kotlin.reflect.jvm.internal.impl.load.java.structure.r.a.a(this);
    }
    
    @e
    public Method V() {
        return this.a;
    }
    
    @e
    public w W() {
        final w.a a = w.a;
        final Type genericReturnType = this.V().getGenericReturnType();
        k0.o((Object)genericReturnType, "member.genericReturnType");
        return a.a(genericReturnType);
    }
    
    @e
    @Override
    public List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x> getTypeParameters() {
        final TypeVariable<Method>[] typeParameters = this.V().getTypeParameters();
        k0.o((Object)typeParameters, "member.typeParameters");
        final ArrayList list = new ArrayList<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x>(typeParameters.length);
        for (int length = typeParameters.length, i = 0; i < length; ++i) {
            list.add(new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x(typeParameters[i]));
        }
        return (List<kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.x>)list;
    }
    
    @e
    @Override
    public List<a0> m() {
        final Type[] genericParameterTypes = this.V().getGenericParameterTypes();
        k0.o((Object)genericParameterTypes, "member.genericParameterTypes");
        final Annotation[][] parameterAnnotations = this.V().getParameterAnnotations();
        k0.o((Object)parameterAnnotations, "member.parameterAnnotations");
        return this.U(genericParameterTypes, parameterAnnotations, this.V().isVarArgs());
    }
    
    @org.jetbrains.annotations.f
    @Override
    public b q() {
        final Object defaultValue = this.V().getDefaultValue();
        b a = null;
        if (defaultValue != null) {
            a = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.d.b.a(defaultValue, null);
        }
        return a;
    }
}
