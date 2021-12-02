// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.k0;
import android.graphics.Bitmap;
import org.jetbrains.annotations.f;
import android.graphics.Bitmap$Config;
import androidx.annotation.n0;
import org.jetbrains.annotations.e;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00012\b\b\u0003\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u001a2\u0010\r\u001a\u00020\f*\u00020\u00002\b\b\u0003\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u00012\b\b\u0003\u0010\n\u001a\u00020\u00012\b\b\u0003\u0010\u000b\u001a\u00020\u0001¨\u0006\u000e" }, d2 = { "Landroid/graphics/drawable/Drawable;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/Bitmap;", "a", "left", "top", "right", "bottom", "Lkotlin/j2;", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class d
{
    @e
    public static final Bitmap a(@e final Drawable drawable, @n0 final int n, @n0 final int n2, @f final Bitmap$Config bitmap$Config) {
        k0.p((Object)drawable, "<this>");
        if (!(drawable instanceof BitmapDrawable) || (bitmap$Config != null && ((BitmapDrawable)drawable).getBitmap().getConfig() != bitmap$Config)) {
            final Rect bounds = drawable.getBounds();
            k0.o((Object)bounds, "bounds");
            final int left = bounds.left;
            final int top = bounds.top;
            final int right = bounds.right;
            final int bottom = bounds.bottom;
            Bitmap$Config argb_8888;
            if ((argb_8888 = bitmap$Config) == null) {
                argb_8888 = Bitmap$Config.ARGB_8888;
            }
            final Bitmap bitmap = Bitmap.createBitmap(n, n2, argb_8888);
            drawable.setBounds(0, 0, n, n2);
            drawable.draw(new Canvas(bitmap));
            drawable.setBounds(left, top, right, bottom);
            k0.o((Object)bitmap, "bitmap");
            return bitmap;
        }
        final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
        if (n == bitmapDrawable.getIntrinsicWidth() && n2 == bitmapDrawable.getIntrinsicHeight()) {
            final Bitmap bitmap2 = bitmapDrawable.getBitmap();
            k0.o((Object)bitmap2, "bitmap");
            return bitmap2;
        }
        final Bitmap scaledBitmap = Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), n, n2, true);
        k0.o((Object)scaledBitmap, "createScaledBitmap(bitmap, width, height, true)");
        return scaledBitmap;
    }
    
    public static final void c(@e final Drawable drawable, @n0 final int n, @n0 final int n2, @n0 final int n3, @n0 final int n4) {
        k0.p((Object)drawable, "<this>");
        drawable.setBounds(n, n2, n3, n4);
    }
}
