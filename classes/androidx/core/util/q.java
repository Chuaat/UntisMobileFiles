// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import android.util.Size;
import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import android.util.SizeF;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0087\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0004H\u0087\n¨\u0006\b" }, d2 = { "Landroid/util/Size;", "", "b", "d", "Landroid/util/SizeF;", "", "a", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class q
{
    @p0(21)
    public static final float a(@e final SizeF sizeF) {
        k0.p((Object)sizeF, "<this>");
        return sizeF.getWidth();
    }
    
    @p0(21)
    public static final int b(@e final Size size) {
        k0.p((Object)size, "<this>");
        return size.getWidth();
    }
    
    @p0(21)
    public static final float c(@e final SizeF sizeF) {
        k0.p((Object)sizeF, "<this>");
        return sizeF.getHeight();
    }
    
    @p0(21)
    public static final int d(@e final Size size) {
        k0.p((Object)size, "<this>");
        return size.getHeight();
    }
}
