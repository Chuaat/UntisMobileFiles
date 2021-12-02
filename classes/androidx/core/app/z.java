// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.app.Service;

public final class z
{
    public static final int a = 1;
    public static final int b = 1;
    public static final int c = 2;
    
    private z() {
    }
    
    public static void a(@j0 final Service service, final int n) {
        if (Build$VERSION.SDK_INT >= 24) {
            service.stopForeground(n);
        }
        else {
            boolean b = true;
            if ((n & 0x1) == 0x0) {
                b = false;
            }
            service.stopForeground(b);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
