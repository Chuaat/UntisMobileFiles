// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import androidx.annotation.p0;
import kotlin.jvm.internal.k0;
import android.util.Half;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u001e\n\u0002\u0010\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0087\b\u001a\r\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0087\b\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0005H\u0087\b\u001a\r\u0010\b\u001a\u00020\u0001*\u00020\u0007H\u0087\b¨\u0006\t" }, d2 = { "", "Landroid/util/Half;", "d", "", "b", "", "a", "", "c", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Half a(final double n) {
        final Half value = Half.valueOf((float)n);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Half b(final float n) {
        final Half value = Half.valueOf(n);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Half c(@org.jetbrains.annotations.e final String s) {
        k0.p((Object)s, "<this>");
        final Half value = Half.valueOf(s);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
    
    @p0(26)
    @org.jetbrains.annotations.e
    public static final Half d(final short n) {
        final Half value = Half.valueOf(n);
        k0.o((Object)value, "valueOf(this)");
        return value;
    }
}
