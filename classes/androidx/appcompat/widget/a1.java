// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import java.lang.reflect.InvocationTargetException;
import androidx.core.view.j0;
import android.util.Log;
import android.graphics.Rect;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class a1
{
    private static final String a = "ViewUtils";
    private static Method b;
    
    static {
        if (Build$VERSION.SDK_INT >= 18) {
            try {
                if (!(a1.b = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class)).isAccessible()) {
                    a1.b.setAccessible(true);
                }
            }
            catch (NoSuchMethodException ex) {
                Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
            }
        }
    }
    
    private a1() {
    }
    
    public static void a(final View obj, final Rect rect, final Rect rect2) {
        final Method b = a1.b;
        if (b != null) {
            try {
                b.invoke(obj, rect, rect2);
            }
            catch (Exception ex) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", (Throwable)ex);
            }
        }
    }
    
    public static boolean b(final View view) {
        final int x = j0.X(view);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    public static void c(final View obj) {
        if (Build$VERSION.SDK_INT >= 16) {
            try {
                final Method method = obj.getClass().getMethod("makeOptionalFitsSystemWindows", (Class<?>[])new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(obj, new Object[0]);
            }
            catch (IllegalAccessException obj) {
                goto Label_0052;
            }
            catch (InvocationTargetException ex) {}
            catch (NoSuchMethodException ex2) {
                Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
            }
        }
    }
}
