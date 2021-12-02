// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.ActivityManager;

public final class b
{
    private b() {
    }
    
    public static boolean a(@j0 final ActivityManager activityManager) {
        return Build$VERSION.SDK_INT >= 19 && activityManager.isLowRamDevice();
    }
}
