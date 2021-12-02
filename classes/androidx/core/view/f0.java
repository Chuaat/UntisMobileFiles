// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.os.Build$VERSION;
import android.view.ScaleGestureDetector;

public final class f0
{
    private f0() {
    }
    
    public static boolean a(final ScaleGestureDetector scaleGestureDetector) {
        return Build$VERSION.SDK_INT >= 19 && scaleGestureDetector.isQuickScaleEnabled();
    }
    
    @Deprecated
    public static boolean b(final Object o) {
        return a((ScaleGestureDetector)o);
    }
    
    public static void c(final ScaleGestureDetector scaleGestureDetector, final boolean quickScaleEnabled) {
        if (Build$VERSION.SDK_INT >= 19) {
            scaleGestureDetector.setQuickScaleEnabled(quickScaleEnabled);
        }
    }
    
    @Deprecated
    public static void d(final Object o, final boolean b) {
        c((ScaleGestureDetector)o, b);
    }
}
