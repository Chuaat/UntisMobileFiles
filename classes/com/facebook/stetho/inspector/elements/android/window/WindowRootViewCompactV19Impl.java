// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android.window;

import androidx.annotation.j0;
import java.util.Collections;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import android.view.View;
import java.util.List;

class WindowRootViewCompactV19Impl extends WindowRootViewCompat
{
    private List<View> mRootViews;
    
    WindowRootViewCompactV19Impl() {
        try {
            final Class<?> forName = Class.forName("android.view.WindowManagerGlobal");
            final Object invoke = forName.getDeclaredMethod("getInstance", (Class<?>[])new Class[0]).invoke(forName, new Object[0]);
            final Field declaredField = forName.getDeclaredField("mViews");
            declaredField.setAccessible(true);
            this.mRootViews = (List<View>)declaredField.get(invoke);
            declaredField.setAccessible(false);
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
        return Collections.unmodifiableList((List<? extends View>)this.mRootViews);
    }
}
