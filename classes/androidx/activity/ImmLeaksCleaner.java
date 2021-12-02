// 
// Decompiled by Procyon v0.5.36
// 

package androidx.activity;

import android.view.View;
import androidx.lifecycle.s;
import androidx.annotation.j0;
import androidx.lifecycle.y;
import androidx.annotation.g0;
import android.view.inputmethod.InputMethodManager;
import android.app.Activity;
import java.lang.reflect.Field;
import androidx.annotation.p0;
import androidx.lifecycle.v;

@p0(19)
final class ImmLeaksCleaner implements v
{
    private static final int H = 0;
    private static final int I = 1;
    private static final int J = 2;
    private static int K;
    private static Field L;
    private static Field M;
    private static Field N;
    private Activity G;
    
    ImmLeaksCleaner(final Activity g) {
        this.G = g;
    }
    
    @g0
    private static void e() {
        try {
            ImmLeaksCleaner.K = 2;
            (ImmLeaksCleaner.M = InputMethodManager.class.getDeclaredField("mServedView")).setAccessible(true);
            (ImmLeaksCleaner.N = InputMethodManager.class.getDeclaredField("mNextServedView")).setAccessible(true);
            (ImmLeaksCleaner.L = InputMethodManager.class.getDeclaredField("mH")).setAccessible(true);
            ImmLeaksCleaner.K = 1;
        }
        catch (NoSuchFieldException ex) {}
    }
    
    @Override
    public void h(@j0 y value, @j0 final s.b b) {
        if (b != s.b.ON_DESTROY) {
            return;
        }
        if (ImmLeaksCleaner.K == 0) {
            e();
        }
        if (ImmLeaksCleaner.K != 1) {
            return;
        }
        final InputMethodManager obj = (InputMethodManager)this.G.getSystemService("input_method");
        try {
            value = (y)ImmLeaksCleaner.L.get(obj);
            if (value == null) {
                return;
            }
            // monitorenter(value)
            try {
                try {
                    final View view = (View)ImmLeaksCleaner.M.get(obj);
                    if (view == null) {
                        // monitorexit(value)
                        return;
                    }
                    if (view.isAttachedToWindow()) {
                        // monitorexit(value)
                        return;
                    }
                    try {
                        ImmLeaksCleaner.N.set(obj, null);
                        // monitorexit(value)
                        obj.isActive();
                    }
                    catch (IllegalAccessException ex) {
                    }
                    // monitorexit(value)
                }
                finally {
                }
                // monitorexit(value)
            }
            catch (ClassCastException ex2) {}
            catch (IllegalAccessException ex3) {}
        }
        catch (IllegalAccessException ex4) {}
    }
}
