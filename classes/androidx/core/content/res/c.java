// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content.res;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.res.Resources;

public final class c
{
    private c() {
    }
    
    public static int a(@j0 final Resources resources) {
        if (Build$VERSION.SDK_INT >= 17) {
            return resources.getConfiguration().densityDpi;
        }
        return resources.getDisplayMetrics().densityDpi;
    }
}
