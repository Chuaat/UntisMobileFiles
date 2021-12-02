// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.net.Uri;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import android.graphics.drawable.Icon;
import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0087\b\u001a\r\u0010\u0007\u001a\u00020\u0001*\u00020\u0006H\u0087\b¨\u0006\b" }, d2 = { "Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Icon;", "a", "b", "Landroid/net/Uri;", "c", "", "d", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Icon a(@org.jetbrains.annotations.e final Bitmap bitmap) {
        k0.p((Object)bitmap, "<this>");
        final Icon withAdaptiveBitmap = Icon.createWithAdaptiveBitmap(bitmap);
        k0.o((Object)withAdaptiveBitmap, "createWithAdaptiveBitmap(this)");
        return withAdaptiveBitmap;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Icon b(@org.jetbrains.annotations.e final Bitmap bitmap) {
        k0.p((Object)bitmap, "<this>");
        final Icon withBitmap = Icon.createWithBitmap(bitmap);
        k0.o((Object)withBitmap, "createWithBitmap(this)");
        return withBitmap;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Icon c(@org.jetbrains.annotations.e final Uri uri) {
        k0.p((Object)uri, "<this>");
        final Icon withContentUri = Icon.createWithContentUri(uri);
        k0.o((Object)withContentUri, "createWithContentUri(this)");
        return withContentUri;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Icon d(@org.jetbrains.annotations.e final byte[] array) {
        k0.p((Object)array, "<this>");
        final Icon withData = Icon.createWithData(array, 0, array.length);
        k0.o((Object)withData, "createWithData(this, 0, size)");
        return withData;
    }
}
