// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.ColorSpace$Named;
import androidx.annotation.p0;
import android.graphics.ColorSpace;
import android.graphics.Bitmap$Config;
import android.graphics.PointF;
import android.graphics.Point;
import kotlin.jvm.internal.k0;
import kotlin.j2;
import android.graphics.Canvas;
import n6.l;
import org.jetbrains.annotations.e;
import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\b\u0004H\u0086\b\u00f8\u0001\u0000\u001a\u001d\u0010\n\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0086\n\u001a'\u0010\f\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H\u0086\n\u001a'\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0086\b\u001a#\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0086\b\u001a7\u0010\u0018\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u000f2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0087\b\u001a\u0015\u0010\u001b\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0019H\u0086\n\u001a\u0015\u0010\u001d\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001cH\u0086\n\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001e" }, d2 = { "Landroid/graphics/Bitmap;", "Lkotlin/Function1;", "Landroid/graphics/Canvas;", "Lkotlin/j2;", "Lkotlin/s;", "block", "a", "", "x", "y", "h", "color", "k", "width", "height", "", "filter", "i", "Landroid/graphics/Bitmap$Config;", "config", "d", "hasAlpha", "Landroid/graphics/ColorSpace;", "colorSpace", "e", "Landroid/graphics/Point;", "p", "b", "Landroid/graphics/PointF;", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final Bitmap a(@e final Bitmap bitmap, @e final l<? super Canvas, j2> l) {
        k0.p((Object)bitmap, "<this>");
        k0.p((Object)l, "block");
        l.invoke((Object)new Canvas(bitmap));
        return bitmap;
    }
    
    public static final boolean b(@e final Bitmap bitmap, @e final Point point) {
        k0.p((Object)bitmap, "<this>");
        k0.p((Object)point, "p");
        final int x = point.x;
        if (x >= 0 && x < bitmap.getWidth()) {
            final int y = point.y;
            if (y >= 0 && y < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }
    
    public static final boolean c(@e final Bitmap bitmap, @e final PointF pointF) {
        k0.p((Object)bitmap, "<this>");
        k0.p((Object)pointF, "p");
        final float x = pointF.x;
        if (x >= 0.0f && x < bitmap.getWidth()) {
            final float y = pointF.y;
            if (y >= 0.0f && y < bitmap.getHeight()) {
                return true;
            }
        }
        return false;
    }
    
    @e
    public static final Bitmap d(final int n, final int n2, @e final Bitmap$Config bitmap$Config) {
        k0.p((Object)bitmap$Config, "config");
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, bitmap$Config);
        k0.o((Object)bitmap, "createBitmap(width, height, config)");
        return bitmap;
    }
    
    @p0(26)
    @e
    public static final Bitmap e(final int n, final int n2, @e final Bitmap$Config bitmap$Config, final boolean b, @e final ColorSpace colorSpace) {
        k0.p((Object)bitmap$Config, "config");
        k0.p((Object)colorSpace, "colorSpace");
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, bitmap$Config, b, colorSpace);
        k0.o((Object)bitmap, "createBitmap(width, height, config, hasAlpha, colorSpace)");
        return bitmap;
    }
    
    public static final int h(@e final Bitmap bitmap, final int n, final int n2) {
        k0.p((Object)bitmap, "<this>");
        return bitmap.getPixel(n, n2);
    }
    
    @e
    public static final Bitmap i(@e Bitmap scaledBitmap, final int n, final int n2, final boolean b) {
        k0.p((Object)scaledBitmap, "<this>");
        scaledBitmap = Bitmap.createScaledBitmap(scaledBitmap, n, n2, b);
        k0.o((Object)scaledBitmap, "createScaledBitmap(this, width, height, filter)");
        return scaledBitmap;
    }
    
    public static final void k(@e final Bitmap bitmap, final int n, final int n2, @androidx.annotation.l final int n3) {
        k0.p((Object)bitmap, "<this>");
        bitmap.setPixel(n, n2, n3);
    }
}
