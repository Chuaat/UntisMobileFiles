// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import kotlin.jvm.internal.k0;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import org.jetbrains.annotations.e;
import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0005" }, d2 = { "Landroid/graphics/Bitmap;", "Landroid/content/res/Resources;", "resources", "Landroid/graphics/drawable/BitmapDrawable;", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class a
{
    @e
    public static final BitmapDrawable a(@e final Bitmap bitmap, @e final Resources resources) {
        k0.p((Object)bitmap, "<this>");
        k0.p((Object)resources, "resources");
        return new BitmapDrawable(resources, bitmap);
    }
}
