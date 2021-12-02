// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import android.graphics.Matrix;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.view.View;
import java.lang.reflect.Method;
import androidx.annotation.p0;

@p0(21)
class q implements o
{
    private static final String H = "GhostViewApi21";
    private static Class<?> I;
    private static boolean J;
    private static Method K;
    private static boolean L;
    private static Method M;
    private static boolean N;
    private final View G;
    
    private q(@j0 final View g) {
        this.G = g;
    }
    
    static o b(final View view, final ViewGroup viewGroup, final Matrix matrix) {
        c();
        final Method k = q.K;
        if (k == null) {
            goto Label_0058;
        }
        try {
            return new q((View)k.invoke(null, view, viewGroup, matrix));
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException(ex.getCause());
        }
        catch (IllegalAccessException ex2) {
            goto Label_0058;
        }
    }
    
    private static void c() {
        if (!q.L) {
            try {
                d();
                (q.K = q.I.getDeclaredMethod("addGhost", View.class, ViewGroup.class, Matrix.class)).setAccessible(true);
            }
            catch (NoSuchMethodException ex) {
                Log.i("GhostViewApi21", "Failed to retrieve addGhost method", (Throwable)ex);
            }
            q.L = true;
        }
    }
    
    private static void d() {
        if (!q.J) {
            try {
                q.I = Class.forName("android.view.GhostView");
            }
            catch (ClassNotFoundException ex) {
                Log.i("GhostViewApi21", "Failed to retrieve GhostView class", (Throwable)ex);
            }
            q.J = true;
        }
    }
    
    private static void e() {
        if (!q.N) {
            try {
                d();
                (q.M = q.I.getDeclaredMethod("removeGhost", View.class)).setAccessible(true);
            }
            catch (NoSuchMethodException ex) {
                Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", (Throwable)ex);
            }
            q.N = true;
        }
    }
    
    static void f(final View view) {
        e();
        final Method m = q.M;
        if (m == null) {
            goto Label_0041;
        }
        try {
            m.invoke(null, view);
            goto Label_0041;
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException(ex.getCause());
        }
        catch (IllegalAccessException ex2) {
            goto Label_0041;
        }
    }
    
    @Override
    public void a(final ViewGroup viewGroup, final View view) {
    }
    
    @Override
    public void setVisibility(final int visibility) {
        this.G.setVisibility(visibility);
    }
}
