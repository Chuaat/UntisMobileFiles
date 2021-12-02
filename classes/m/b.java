// 
// Decompiled by Procyon v0.5.36
// 

package m;

import androidx.annotation.j0;
import android.os.Build$VERSION;
import android.database.CursorWindow;
import androidx.annotation.k0;

public final class b
{
    private b() {
    }
    
    @j0
    public static CursorWindow a(@k0 final String s, final long n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return new CursorWindow(s, n);
        }
        if (sdk_INT >= 15) {
            return new CursorWindow(s);
        }
        return new CursorWindow(false);
    }
}
