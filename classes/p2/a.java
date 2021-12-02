// 
// Decompiled by Procyon v0.5.36
// 

package p2;

import androidx.annotation.k0;
import android.graphics.RectF;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.Canvas;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class a
{
    private a() {
    }
    
    public static int a(@j0 final Canvas canvas, final float n, final float n2, final float n3, final float n4, final int n5) {
        if (Build$VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(n, n2, n3, n4, n5);
        }
        return canvas.saveLayerAlpha(n, n2, n3, n4, n5, 31);
    }
    
    public static int b(@j0 final Canvas canvas, @k0 final RectF rectF, final int n) {
        if (Build$VERSION.SDK_INT > 21) {
            return canvas.saveLayerAlpha(rectF, n);
        }
        return canvas.saveLayerAlpha(rectF, n, 31);
    }
}
