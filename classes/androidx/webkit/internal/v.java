// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import java.lang.reflect.Method;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import java.lang.reflect.InvocationTargetException;
import org.chromium.support_lib_boundary.util.a;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import android.os.Build$VERSION;

public class v
{
    private static final String a = "org.chromium.support_lib_glue.SupportLibReflectionUtil";
    private static final String b = "createWebViewProviderFactory";
    
    private v() {
    }
    
    @j0
    static x a() {
        if (Build$VERSION.SDK_INT < 21) {
            return new d();
        }
        try {
            return new y((WebViewProviderFactoryBoundaryInterface)org.chromium.support_lib_boundary.util.a.a((Class)WebViewProviderFactoryBoundaryInterface.class, b()));
        }
        catch (NoSuchMethodException cause) {
            throw new RuntimeException(cause);
        }
        catch (ClassNotFoundException ex) {
            return new d();
        }
        catch (InvocationTargetException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (IllegalAccessException cause3) {
            throw new RuntimeException(cause3);
        }
    }
    
    private static InvocationHandler b() throws IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchMethodException {
        return (InvocationHandler)Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
    }
    
    @j0
    public static c0 c() {
        return v.a.a;
    }
    
    @j0
    public static x d() {
        return v.b.a;
    }
    
    public static ClassLoader e() {
        if (Build$VERSION.SDK_INT >= 28) {
            return WebView.getWebViewClassLoader();
        }
        return f().getClass().getClassLoader();
    }
    
    private static Object f() {
        try {
            final Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", (Class<?>[])new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
        catch (InvocationTargetException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (NoSuchMethodException cause3) {
            throw new RuntimeException(cause3);
        }
    }
    
    private static class a
    {
        static final c0 a;
        
        static {
            a = new c0(v.d().getWebkitToCompatConverter());
        }
    }
    
    private static class b
    {
        static final x a;
        
        static {
            a = v.a();
        }
    }
}
