// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import java.lang.reflect.InvocationTargetException;
import android.util.Log;
import java.lang.reflect.Method;
import android.os.Build$VERSION;
import android.os.IBinder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import android.os.Bundle;

public final class i
{
    private i() {
    }
    
    @k0
    public static IBinder a(@j0 final Bundle bundle, @k0 final String s) {
        if (Build$VERSION.SDK_INT >= 18) {
            return bundle.getBinder(s);
        }
        return a.a(bundle, s);
    }
    
    public static void b(@j0 final Bundle bundle, @k0 final String s, @k0 final IBinder binder) {
        if (Build$VERSION.SDK_INT >= 18) {
            bundle.putBinder(s, binder);
        }
        else {
            a.b(bundle, s, binder);
        }
    }
    
    static class a
    {
        private static final String a = "BundleCompatBaseImpl";
        private static Method b;
        private static boolean c;
        private static Method d;
        private static boolean e;
        
        private a() {
        }
        
        public static IBinder a(Bundle obj, final String s) {
            if (!i.a.c) {
                try {
                    (i.a.b = Bundle.class.getMethod("getIBinder", String.class)).setAccessible(true);
                }
                catch (NoSuchMethodException ex) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", (Throwable)ex);
                }
                i.a.c = true;
            }
            final Method b = i.a.b;
            if (b != null) {
                try {
                    obj = (IllegalArgumentException)b.invoke(obj, s);
                    return (IBinder)obj;
                }
                catch (IllegalArgumentException obj) {}
                catch (IllegalAccessException obj) {}
                catch (InvocationTargetException ex2) {}
                Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", (Throwable)obj);
                i.a.b = null;
            }
            return null;
        }
        
        public static void b(final Bundle obj, final String s, final IBinder binder) {
            if (!i.a.e) {
                try {
                    (i.a.d = Bundle.class.getMethod("putIBinder", String.class, IBinder.class)).setAccessible(true);
                }
                catch (NoSuchMethodException ex) {
                    Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", (Throwable)ex);
                }
                i.a.e = true;
            }
            final Method d = i.a.d;
            if (d != null) {
                try {
                    d.invoke(obj, s, binder);
                    return;
                }
                catch (IllegalArgumentException obj) {}
                catch (IllegalAccessException obj) {}
                catch (InvocationTargetException ex2) {}
                Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", (Throwable)obj);
                i.a.d = null;
            }
        }
    }
}
