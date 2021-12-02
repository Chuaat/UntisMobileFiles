// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.os.UserManager;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.content.Context;

public class w
{
    private w() {
    }
    
    public static boolean a(@j0 final Context context) {
        return Build$VERSION.SDK_INT < 24 || ((UserManager)context.getSystemService((Class)UserManager.class)).isUserUnlocked();
    }
}
