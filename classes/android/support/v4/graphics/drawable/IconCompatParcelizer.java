// 
// Decompiled by Procyon v0.5.36
// 

package android.support.v4.graphics.drawable;

import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.e;
import androidx.annotation.t0;

@t0({ t0.a.G })
public final class IconCompatParcelizer extends androidx.core.graphics.drawable.IconCompatParcelizer
{
    public static IconCompat read(final e e) {
        return androidx.core.graphics.drawable.IconCompatParcelizer.read(e);
    }
    
    public static void write(final IconCompat iconCompat, final e e) {
        androidx.core.graphics.drawable.IconCompatParcelizer.write(iconCompat, e);
    }
}
