// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import androidx.annotation.t0;
import androidx.annotation.p0;

@p0(28)
@t0({ t0.a.I })
public class b0 extends a0
{
    private static final String B = "createFromFamiliesWithDefault";
    private static final int C = -1;
    private static final String D = "sans-serif";
    
    @Override
    protected Typeface l(Object cause) {
        try {
            final Object instance = Array.newInstance(super.m, 1);
            Array.set(instance, 0, cause);
            cause = (InvocationTargetException)super.s.invoke(null, instance, "sans-serif", -1, -1);
            return (Typeface)cause;
        }
        catch (InvocationTargetException cause) {}
        catch (IllegalAccessException ex) {}
        throw new RuntimeException(cause);
    }
    
    @Override
    protected Method x(final Class<?> componentType) throws NoSuchMethodException {
        final Class<?> class1 = Array.newInstance(componentType, 1).getClass();
        final Class<Integer> type = Integer.TYPE;
        final Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", class1, String.class, type, type);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
