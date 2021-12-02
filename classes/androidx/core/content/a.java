// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.content;

import android.content.Context;
import androidx.annotation.j0;
import android.content.ContentProvider;

public final class a
{
    private a() {
    }
    
    @j0
    public static Context a(@j0 final ContentProvider contentProvider) {
        final Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
