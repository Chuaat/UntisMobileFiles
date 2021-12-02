// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.drawable.Drawable;
import androidx.annotation.p0;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import kotlin.jvm.internal.k0;
import android.graphics.Bitmap;
import kotlin.j2;
import android.graphics.ImageDecoder$ImageInfo;
import android.graphics.ImageDecoder;
import n6.q;
import org.jetbrains.annotations.e;
import android.graphics.ImageDecoder$Source;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\f\u001a\u00020\u000b*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b\u00f8\u0001\u0000\u001aU\u0010\u000e\u001a\u00020\r*\u00020\u00002C\b\u0004\u0010\n\u001a=\u0012\u0004\u0012\u00020\u0002\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0001¢\u0006\u0002\b\tH\u0087\b\u00f8\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000f" }, d2 = { "Landroid/graphics/ImageDecoder$Source;", "Lkotlin/Function3;", "Landroid/graphics/ImageDecoder;", "Landroid/graphics/ImageDecoder$ImageInfo;", "Lkotlin/t0;", "name", "info", "source", "Lkotlin/j2;", "Lkotlin/s;", "action", "Landroid/graphics/Bitmap;", "a", "Landroid/graphics/drawable/Drawable;", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class i
{
    @p0(28)
    @e
    public static final Bitmap a(@e final ImageDecoder$Source imageDecoder$Source, @e final q<? super ImageDecoder, ? super ImageDecoder$ImageInfo, ? super ImageDecoder$Source, j2> q) {
        k0.p((Object)imageDecoder$Source, "<this>");
        k0.p((Object)q, "action");
        final Bitmap decodeBitmap = ImageDecoder.decodeBitmap(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new ImageDecoder$OnHeaderDecodedListener() {
            public final void onHeaderDecoded(@e final ImageDecoder imageDecoder, @e final ImageDecoder$ImageInfo imageDecoder$ImageInfo, @e final ImageDecoder$Source imageDecoder$Source) {
                k0.p((Object)imageDecoder, "decoder");
                k0.p((Object)imageDecoder$ImageInfo, "info");
                k0.p((Object)imageDecoder$Source, "source");
                q.invoke((Object)imageDecoder, (Object)imageDecoder$ImageInfo, (Object)imageDecoder$Source);
            }
        });
        k0.o((Object)decodeBitmap, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Bitmap {\n    return ImageDecoder.decodeBitmap(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeBitmap;
    }
    
    @p0(28)
    @e
    public static final Drawable b(@e final ImageDecoder$Source imageDecoder$Source, @e final q<? super ImageDecoder, ? super ImageDecoder$ImageInfo, ? super ImageDecoder$Source, j2> q) {
        k0.p((Object)imageDecoder$Source, "<this>");
        k0.p((Object)q, "action");
        final Drawable decodeDrawable = ImageDecoder.decodeDrawable(imageDecoder$Source, (ImageDecoder$OnHeaderDecodedListener)new ImageDecoder$OnHeaderDecodedListener() {
            public final void onHeaderDecoded(@e final ImageDecoder imageDecoder, @e final ImageDecoder$ImageInfo imageDecoder$ImageInfo, @e final ImageDecoder$Source imageDecoder$Source) {
                k0.p((Object)imageDecoder, "decoder");
                k0.p((Object)imageDecoder$ImageInfo, "info");
                k0.p((Object)imageDecoder$Source, "source");
                q.invoke((Object)imageDecoder, (Object)imageDecoder$ImageInfo, (Object)imageDecoder$Source);
            }
        });
        k0.o((Object)decodeDrawable, "crossinline action: ImageDecoder.(info: ImageInfo, source: Source) -> Unit\n): Drawable {\n    return ImageDecoder.decodeDrawable(this) { decoder, info, source ->\n        decoder.action(info, source)\n    }");
        return decodeDrawable;
    }
}
