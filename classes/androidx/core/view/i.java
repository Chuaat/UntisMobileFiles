// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.Gravity;
import android.os.Build$VERSION;
import android.graphics.Rect;

public final class i
{
    public static final int a = 8388608;
    public static final int b = 8388611;
    public static final int c = 8388613;
    public static final int d = 8388615;
    
    private i() {
    }
    
    public static void a(final int n, final int n2, final int n3, final Rect rect, final int n4, final int n5, final Rect rect2, final int n6) {
        if (Build$VERSION.SDK_INT >= 17) {
            Gravity.apply(n, n2, n3, rect, n4, n5, rect2, n6);
        }
        else {
            Gravity.apply(n, n2, n3, rect, n4, n5, rect2);
        }
    }
    
    public static void b(final int n, final int n2, final int n3, final Rect rect, final Rect rect2, final int n4) {
        if (Build$VERSION.SDK_INT >= 17) {
            Gravity.apply(n, n2, n3, rect, rect2, n4);
        }
        else {
            Gravity.apply(n, n2, n3, rect, rect2);
        }
    }
    
    public static void c(final int n, final Rect rect, final Rect rect2, final int n2) {
        if (Build$VERSION.SDK_INT >= 17) {
            Gravity.applyDisplay(n, rect, rect2, n2);
        }
        else {
            Gravity.applyDisplay(n, rect, rect2);
        }
    }
    
    public static int d(final int n, final int n2) {
        if (Build$VERSION.SDK_INT >= 17) {
            return Gravity.getAbsoluteGravity(n, n2);
        }
        return n & 0xFF7FFFFF;
    }
}
