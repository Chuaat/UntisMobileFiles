// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android.window;

import androidx.annotation.j0;
import java.util.Collections;
import java.util.Arrays;
import android.view.View;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;

class WindowRootViewCompactV18Impl extends WindowRootViewCompat
{
    private Field mViewsField;
    private Object mWindowManagerGlobal;
    
    WindowRootViewCompactV18Impl() {
        try {
            final Class<?> forName = Class.forName("android.view.WindowManagerGlobal");
            this.mWindowManagerGlobal = forName.getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(forName, new Object[0]);
            (this.mViewsField = forName.getDeclaredField("mViews")).setAccessible(true);
        }
        catch (NoSuchFieldException cause) {
            throw new RuntimeException(cause);
        }
        catch (InvocationTargetException cause2) {
            throw new RuntimeException(cause2);
        }
        catch (IllegalAccessException cause3) {
            throw new RuntimeException(cause3);
        }
        catch (NoSuchMethodException cause4) {
            throw new RuntimeException(cause4);
        }
        catch (ClassNotFoundException cause5) {
            throw new RuntimeException(cause5);
        }
    }
    
    @j0
    @Override
    public List<View> getRootViews() {
        try {
            return Collections.unmodifiableList((List<? extends View>)Arrays.asList((T[])this.mViewsField.get(this.mWindowManagerGlobal)));
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
    }
}
