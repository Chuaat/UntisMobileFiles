// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.location;

import kotlin.jvm.internal.k0;
import android.location.Location;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\u001a\r\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u0086\n¨\u0006\u0004" }, d2 = { "Landroid/location/Location;", "", "a", "b", "core-ktx_release" }, k = 2, mv = { 1, 5, 1 })
public final class e
{
    public static final double a(@org.jetbrains.annotations.e final Location location) {
        k0.p((Object)location, "<this>");
        return location.getLatitude();
    }
    
    public static final double b(@org.jetbrains.annotations.e final Location location) {
        k0.p((Object)location, "<this>");
        return location.getLongitude();
    }
}
