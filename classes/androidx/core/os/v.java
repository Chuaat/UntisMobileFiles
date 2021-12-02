// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.j0;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import android.os.UserHandle;
import java.lang.reflect.Constructor;
import androidx.annotation.k0;
import java.lang.reflect.Method;
import androidx.annotation.p0;

@p0(17)
public class v
{
    @k0
    private static Method a;
    @k0
    private static Constructor<UserHandle> b;
    
    private v() {
    }
    
    private static Method a() throws NoSuchMethodException {
        if (v.a == null) {
            (v.a = UserHandle.class.getDeclaredMethod("getUserId", Integer.TYPE)).setAccessible(true);
        }
        return v.a;
    }
    
    private static Constructor<UserHandle> b() throws NoSuchMethodException {
        if (v.b == null) {
            (v.b = UserHandle.class.getDeclaredConstructor(Integer.TYPE)).setAccessible(true);
        }
        return v.b;
    }
    
    @j0
    public static UserHandle c(final int i) {
        if (Build$VERSION.SDK_INT >= 24) {
            return v.a.a(i);
        }
        try {
            return b().newInstance((Integer)a().invoke(null, i));
        }
        catch (InvocationTargetException cause) {
            throw new RuntimeException(cause);
        }
        catch (InstantiationException cause2) {
            final InstantiationError instantiationError = new InstantiationError();
            instantiationError.initCause(cause2);
            throw instantiationError;
        }
        catch (IllegalAccessException cause3) {
            final IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(cause3);
            throw illegalAccessError;
        }
        catch (NoSuchMethodException cause4) {
            final NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(cause4);
            throw noSuchMethodError;
        }
    }
    
    @p0(24)
    private static class a
    {
        @j0
        static UserHandle a(final int n) {
            return UserHandle.getUserHandleForUid(n);
        }
    }
}
