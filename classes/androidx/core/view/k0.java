// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.content.res.Resources;
import androidx.annotation.j0;
import android.util.TypedValue;
import android.content.Context;
import android.util.Log;
import android.view.ViewConfiguration;
import android.os.Build$VERSION;
import java.lang.reflect.Method;

public final class k0
{
    private static final String a = "ViewConfigCompat";
    private static Method b;
    
    static {
        if (Build$VERSION.SDK_INT == 25) {
            try {
                k0.b = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", (Class<?>[])new Class[0]);
            }
            catch (Exception ex) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }
    
    private k0() {
    }
    
    private static float a(final ViewConfiguration obj, final Context context) {
        if (Build$VERSION.SDK_INT >= 25) {
            final Method b = k0.b;
            if (b != null) {
                try {
                    return (float)(int)b.invoke(obj, new Object[0]);
                }
                catch (Exception ex) {
                    Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
                }
            }
        }
        final TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(16842829, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }
    
    public static float b(@j0 final ViewConfiguration viewConfiguration, @j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }
        return a(viewConfiguration, context);
    }
    
    public static int c(final ViewConfiguration viewConfiguration) {
        if (Build$VERSION.SDK_INT >= 28) {
            return viewConfiguration.getScaledHoverSlop();
        }
        return viewConfiguration.getScaledTouchSlop() / 2;
    }
    
    @Deprecated
    public static int d(final ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledPagingTouchSlop();
    }
    
    public static float e(@j0 final ViewConfiguration viewConfiguration, @j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 26) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
        return a(viewConfiguration, context);
    }
    
    @Deprecated
    public static boolean f(final ViewConfiguration viewConfiguration) {
        return viewConfiguration.hasPermanentMenuKey();
    }
    
    public static boolean g(final ViewConfiguration viewConfiguration, @j0 final Context context) {
        if (Build$VERSION.SDK_INT >= 28) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
        return identifier != 0 && resources.getBoolean(identifier);
    }
}
