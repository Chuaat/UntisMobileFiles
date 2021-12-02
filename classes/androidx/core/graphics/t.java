// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics;

import android.graphics.PorterDuffXfermode;
import kotlin.jvm.internal.k0;
import android.graphics.PorterDuffColorFilter;
import org.jetbrains.annotations.e;
import android.graphics.PorterDuff$Mode;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b¨\u0006\u0007" }, d2 = { "Landroid/graphics/PorterDuff$Mode;", "Landroid/graphics/PorterDuffXfermode;", "b", "", "color", "Landroid/graphics/PorterDuffColorFilter;", "a", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class t
{
    @e
    public static final PorterDuffColorFilter a(@e final PorterDuff$Mode porterDuff$Mode, final int n) {
        k0.p((Object)porterDuff$Mode, "<this>");
        return new PorterDuffColorFilter(n, porterDuff$Mode);
    }
    
    @e
    public static final PorterDuffXfermode b(@e final PorterDuff$Mode porterDuff$Mode) {
        k0.p((Object)porterDuff$Mode, "<this>");
        return new PorterDuffXfermode(porterDuff$Mode);
    }
}
