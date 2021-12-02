// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import androidx.annotation.k0;
import android.graphics.PorterDuff$Mode;
import android.graphics.BlendMode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.BlendModeColorFilter;
import android.os.Build$VERSION;
import android.graphics.ColorFilter;
import androidx.annotation.j0;

public class c
{
    private c() {
    }
    
    @k0
    public static ColorFilter a(final int n, @j0 final d d) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final ColorFilter colorFilter = null;
        final ColorFilter colorFilter2 = null;
        if (sdk_INT >= 29) {
            final BlendMode a = e.a(d);
            Object o = colorFilter2;
            if (a != null) {
                o = new BlendModeColorFilter(n, a);
            }
            return (ColorFilter)o;
        }
        final PorterDuff$Mode b = e.b(d);
        Object o2 = colorFilter;
        if (b != null) {
            o2 = new PorterDuffColorFilter(n, b);
        }
        return (ColorFilter)o2;
    }
}
