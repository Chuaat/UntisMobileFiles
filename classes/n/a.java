// 
// Decompiled by Procyon v0.5.36
// 

package n;

import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.database.sqlite.SQLiteCursor;

public final class a
{
    private a() {
    }
    
    public static void a(@j0 final SQLiteCursor sqLiteCursor, final boolean fillWindowForwardOnly) {
        if (Build$VERSION.SDK_INT >= 28) {
            sqLiteCursor.setFillWindowForwardOnly(fillWindowForwardOnly);
        }
    }
}
