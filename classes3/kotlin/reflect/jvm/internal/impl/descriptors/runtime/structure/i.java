// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import kotlin.reflect.jvm.internal.impl.load.java.structure.x;
import kotlin.collections.v;
import java.lang.reflect.GenericArrayType;
import kotlin.jvm.internal.k0;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import java.util.Collection;
import org.jetbrains.annotations.e;
import java.lang.reflect.Type;
import kotlin.reflect.jvm.internal.impl.load.java.structure.f;

public final class i extends w implements f
{
    @e
    private final Type b;
    @e
    private final w c;
    @e
    private final Collection<a> d;
    private final boolean e;
    
    public i(@e final Type b) {
        k0.p((Object)b, "reflectType");
        this.b = b;
        final Type q = this.Q();
        w.a a = null;
        Type type = null;
        String s = null;
        Label_0044: {
            if (!(q instanceof GenericArrayType)) {
                if (q instanceof Class) {
                    final Class clazz = (Class)q;
                    if (clazz.isArray()) {
                        a = w.a;
                        type = clazz.getComponentType();
                        s = "getComponentType()";
                        break Label_0044;
                    }
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("Not an array type (");
                sb.append(this.Q().getClass());
                sb.append("): ");
                sb.append(this.Q());
                throw new IllegalArgumentException(sb.toString());
            }
            a = w.a;
            type = ((GenericArrayType)q).getGenericComponentType();
            s = "genericComponentType";
        }
        k0.o((Object)type, s);
        this.c = a.a(type);
        this.d = (Collection<a>)v.E();
    }
    
    @e
    @Override
    protected Type Q() {
        return this.b;
    }
    
    @e
    public w R() {
        return this.c;
    }
    
    @e
    @Override
    public Collection<a> getAnnotations() {
        return this.d;
    }
    
    @Override
    public boolean i() {
        return this.e;
    }
}
