// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import androidx.annotation.j0;
import android.os.Looper;
import android.os.Handler;

class b
{
    private b() {
    }
    
    @j0
    static Handler a() {
        Handler handler;
        if (Looper.myLooper() == null) {
            handler = new Handler(Looper.getMainLooper());
        }
        else {
            handler = new Handler();
        }
        return handler;
    }
}
