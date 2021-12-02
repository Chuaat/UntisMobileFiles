// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.WindowInsetsController;
import androidx.annotation.p0;
import androidx.annotation.y;
import androidx.annotation.k0;
import android.os.Build$VERSION;
import android.view.View;
import androidx.annotation.j0;
import android.view.Window;

public final class t0
{
    public static final int a = 8;
    public static final int b = 9;
    public static final int c = 10;
    
    private t0() {
    }
    
    @k0
    public static y0 a(@j0 final Window window, @j0 final View view) {
        if (Build$VERSION.SDK_INT >= 30) {
            return t0.b.a(window);
        }
        return new y0(window, view);
    }
    
    @j0
    public static <T extends View> T b(@j0 final Window window, @y final int n) {
        if (Build$VERSION.SDK_INT >= 28) {
            return (T)window.requireViewById(n);
        }
        final View viewById = window.findViewById(n);
        if (viewById != null) {
            return (T)viewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Window");
    }
    
    public static void c(@j0 final Window window, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            t0.b.b(window, b);
        }
        else if (sdk_INT >= 16) {
            t0.a.a(window, b);
        }
    }
    
    @p0(16)
    private static class a
    {
        static void a(@j0 final Window window, final boolean b) {
            final View decorView = window.getDecorView();
            final int systemUiVisibility = decorView.getSystemUiVisibility();
            int systemUiVisibility2;
            if (b) {
                systemUiVisibility2 = (systemUiVisibility & 0xFFFFF8FF);
            }
            else {
                systemUiVisibility2 = (systemUiVisibility | 0x700);
            }
            decorView.setSystemUiVisibility(systemUiVisibility2);
        }
    }
    
    @p0(30)
    private static class b
    {
        static y0 a(@j0 final Window window) {
            final WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                return y0.l(insetsController);
            }
            return null;
        }
        
        static void b(@j0 final Window window, final boolean decorFitsSystemWindows) {
            window.setDecorFitsSystemWindows(decorFitsSystemWindows);
        }
    }
}
