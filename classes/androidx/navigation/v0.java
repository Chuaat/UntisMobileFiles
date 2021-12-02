// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import java.util.Map;
import androidx.annotation.i;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.util.HashMap;
import android.annotation.SuppressLint;

@SuppressLint({ "TypeParameterUnusedInFormals" })
public class v0
{
    private static final HashMap<Class<?>, String> b;
    private final HashMap<String, u0<? extends a0>> a;
    
    static {
        b = new HashMap<Class<?>, String>();
    }
    
    public v0() {
        this.a = new HashMap<String, u0<? extends a0>>();
    }
    
    @j0
    static String c(@j0 final Class<? extends u0> clazz) {
        final HashMap<Class<?>, String> b = v0.b;
        String value;
        if ((value = b.get(clazz)) == null) {
            final u0.b b2 = clazz.getAnnotation(u0.b.class);
            if (b2 != null) {
                value = b2.value();
            }
            else {
                value = null;
            }
            if (!g(value)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("No @Navigator.Name annotation found for ");
                sb.append(clazz.getSimpleName());
                throw new IllegalArgumentException(sb.toString());
            }
            b.put(clazz, value);
        }
        return value;
    }
    
    private static boolean g(final String s) {
        return s != null && !s.isEmpty();
    }
    
    @k0
    public final u0<? extends a0> a(@j0 final u0<? extends a0> u0) {
        return this.b(c(u0.getClass()), u0);
    }
    
    @i
    @k0
    public u0<? extends a0> b(@j0 final String key, @j0 final u0<? extends a0> value) {
        if (g(key)) {
            return this.a.put(key, value);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
    
    @j0
    public final <T extends u0<?>> T d(@j0 final Class<T> clazz) {
        return this.e(c(clazz));
    }
    
    @i
    @j0
    public <T extends u0<?>> T e(@j0 final String s) {
        if (!g(s)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        final u0<? extends a0> u0 = this.a.get(s);
        if (u0 != null) {
            return (T)u0;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Could not find Navigator with name \"");
        sb.append(s);
        sb.append("\". You must call NavController.addNavigator() for each navigation type.");
        throw new IllegalStateException(sb.toString());
    }
    
    Map<String, u0<? extends a0>> f() {
        return this.a;
    }
}
