// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.Bitmap;

public final class a
{
    private a() {
    }
    
    public static int a(@j0 final Bitmap bitmap) {
        if (Build$VERSION.SDK_INT >= 19) {
            return bitmap.getAllocationByteCount();
        }
        return bitmap.getByteCount();
    }
    
    public static boolean b(@j0 final Bitmap bitmap) {
        return Build$VERSION.SDK_INT >= 18 && bitmap.hasMipMap();
    }
    
    public static void c(@j0 final Bitmap bitmap, final boolean hasMipMap) {
        if (Build$VERSION.SDK_INT >= 18) {
            bitmap.setHasMipMap(hasMipMap);
        }
    }
}
