// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import kotlin.collections.j1;
import org.jetbrains.annotations.e;
import java.util.Set;

public final class i
{
    @e
    private static final Set<Class<?>> a;
    
    static {
        a = j1.u((Object[])new Class[] { Integer.class, Character.class, Byte.class, Long.class, Short.class, Boolean.class, Double.class, Float.class, int[].class, char[].class, byte[].class, long[].class, short[].class, boolean[].class, double[].class, float[].class, Class.class, String.class });
    }
}
