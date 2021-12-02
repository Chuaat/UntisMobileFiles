// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import java.util.Locale;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.res.Configuration;

public final class d
{
    private d() {
    }
    
    @j0
    public static i a(@j0 final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 24) {
            return i.n(configuration.getLocales());
        }
        return i.a(configuration.locale);
    }
}
