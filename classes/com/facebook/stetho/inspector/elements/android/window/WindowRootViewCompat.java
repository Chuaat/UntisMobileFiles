// 
// Decompiled by Procyon v0.5.36
// 

package com.facebook.stetho.inspector.elements.android.window;

import androidx.annotation.j0;
import android.view.View;
import java.util.List;
import android.os.Build$VERSION;
import com.facebook.stetho.common.Util;
import android.content.Context;

public abstract class WindowRootViewCompat
{
    private static WindowRootViewCompat sInstance;
    
    public static WindowRootViewCompat get(final Context context) {
        final WindowRootViewCompat sInstance = WindowRootViewCompat.sInstance;
        if (sInstance != null) {
            return sInstance;
        }
        Util.throwIfNull(context);
        final int sdk_INT = Build$VERSION.SDK_INT;
        WindowRootViewCompat sInstance2;
        if (sdk_INT >= 19) {
            sInstance2 = new WindowRootViewCompactV19Impl();
        }
        else {
            if (sdk_INT != 17 && sdk_INT != 18) {
                WindowRootViewCompat.sInstance = new WindowRootViewCompactV16Impl(context.getApplicationContext());
                return WindowRootViewCompat.sInstance;
            }
            sInstance2 = new WindowRootViewCompactV18Impl();
        }
        WindowRootViewCompat.sInstance = sInstance2;
        return WindowRootViewCompat.sInstance;
    }
    
    @j0
    public abstract List<View> getRootViews();
}
