// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import androidx.annotation.j0;
import java.util.Arrays;
import java.util.Objects;
import android.os.Build$VERSION;
import androidx.annotation.k0;

public class i
{
    private i() {
    }
    
    public static boolean a(@k0 final Object a, @k0 final Object o) {
        if (Build$VERSION.SDK_INT >= 19) {
            return Objects.equals(a, o);
        }
        return a == o || (a != null && a.equals(o));
    }
    
    public static int b(@k0 final Object... array) {
        if (Build$VERSION.SDK_INT >= 19) {
            return Objects.hash(array);
        }
        return Arrays.hashCode(array);
    }
    
    public static int c(@k0 final Object o) {
        int hashCode;
        if (o != null) {
            hashCode = o.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @j0
    public static <T> T d(@k0 final T obj) {
        Objects.requireNonNull(obj);
        return obj;
    }
    
    @j0
    public static <T> T e(@k0 final T obj, @j0 final String message) {
        Objects.requireNonNull(obj, message);
        return obj;
    }
    
    @k0
    public static String f(@k0 final Object o, @k0 String string) {
        if (o != null) {
            string = o.toString();
        }
        return string;
    }
}
