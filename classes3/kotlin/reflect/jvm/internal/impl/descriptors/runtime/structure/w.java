// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.WildcardType;
import java.lang.reflect.GenericArrayType;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.f;
import kotlin.reflect.jvm.internal.impl.load.java.structure.a;
import kotlin.reflect.jvm.internal.impl.name.b;
import java.lang.reflect.Type;
import org.jetbrains.annotations.e;
import kotlin.reflect.jvm.internal.impl.load.java.structure.x;

public abstract class w implements x
{
    @e
    public static final a a;
    
    static {
        a = new a(null);
    }
    
    @e
    protected abstract Type Q();
    
    @f
    @Override
    public kotlin.reflect.jvm.internal.impl.load.java.structure.a a0(@e final b b) {
        return x.a.a(this, b);
    }
    
    @Override
    public boolean equals(@f final Object o) {
        return o instanceof w && k0.g((Object)this.Q(), (Object)((w)o).Q());
    }
    
    @Override
    public int hashCode() {
        return this.Q().hashCode();
    }
    
    @e
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName());
        sb.append(": ");
        sb.append(this.Q());
        return sb.toString();
    }
    
    public static final class a
    {
        private a() {
        }
        
        @e
        public final w a(@e final Type type) {
            k0.p((Object)type, "type");
            final boolean b = type instanceof Class;
            if (b) {
                final Class clazz = (Class)type;
                if (clazz.isPrimitive()) {
                    return new v(clazz);
                }
            }
            w w;
            if (!(type instanceof GenericArrayType) && (!b || !((Class)type).isArray())) {
                if (type instanceof WildcardType) {
                    w = new z((WildcardType)type);
                }
                else {
                    w = new kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.l(type);
                }
            }
            else {
                w = new i(type);
            }
            return w;
        }
    }
}
