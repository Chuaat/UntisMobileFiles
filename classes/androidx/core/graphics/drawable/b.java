// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import android.graphics.Color;
import org.jetbrains.annotations.e;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.l;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0012\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b¨\u0006\u0005" }, d2 = { "", "Landroid/graphics/drawable/ColorDrawable;", "a", "Landroid/graphics/Color;", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class b
{
    @e
    public static final ColorDrawable a(@l final int n) {
        return new ColorDrawable(n);
    }
    
    @p0(26)
    @e
    public static final ColorDrawable b(@e final Color color) {
        k0.p((Object)color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
