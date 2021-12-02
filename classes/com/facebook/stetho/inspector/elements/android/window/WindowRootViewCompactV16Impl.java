// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android.window;

import androidx.annotation.j0;
import android.view.WindowManager;
import java.util.Collections;
import java.util.Arrays;
import android.view.View;
import java.util.List;
import java.lang.reflect.Field;
import android.content.Context;

class WindowRootViewCompactV16Impl extends WindowRootViewCompat
{
    private Context mContext;
    
    WindowRootViewCompactV16Impl(final Context mContext) {
        this.mContext = mContext;
    }
    
    private static Object getOuter(Object value) {
        try {
            final Field declaredField = value.getClass().getDeclaredField("mWindowManager");
            declaredField.setAccessible(true);
            value = declaredField.get(value);
            declaredField.setAccessible(false);
            return value;
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
        catch (NoSuchFieldException cause2) {
            throw new RuntimeException(cause2);
        }
    }
    
    private static List<View> getWindowViews(final Object obj) {
        try {
            final Field declaredField = obj.getClass().getDeclaredField("mViews");
            declaredField.setAccessible(true);
            return (List<View>)Collections.unmodifiableList((List<?>)Arrays.asList((T[])declaredField.get(obj)));
        }
        catch (IllegalAccessException cause) {
            throw new RuntimeException(cause);
        }
        catch (NoSuchFieldException cause2) {
            throw new RuntimeException(cause2);
        }
    }
    
    @j0
    @Override
    public List<View> getRootViews() {
        return getWindowViews(getOuter(this.mContext.getSystemService("window")));
    }
}
