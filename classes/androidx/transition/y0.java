// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.k0;
import android.graphics.Matrix;
import androidx.core.view.j0;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.view.View;
import android.util.Property;

class y0
{
    private static final e1 a;
    private static final String b = "ViewUtils";
    static final Property<View, Float> c;
    static final Property<View, Rect> d;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        e1 a2;
        if (sdk_INT >= 29) {
            a2 = new d1();
        }
        else if (sdk_INT >= 23) {
            a2 = new c1();
        }
        else if (sdk_INT >= 22) {
            a2 = new b1();
        }
        else if (sdk_INT >= 21) {
            a2 = new a1();
        }
        else if (sdk_INT >= 19) {
            a2 = new z0();
        }
        else {
            a2 = new e1();
        }
        a = a2;
        c = new Property<View, Float>(Float.class, "translationAlpha") {
            public Float a(final View view) {
                return y0.c(view);
            }
            
            public void b(final View view, final Float n) {
                y0.h(view, n);
            }
        };
        d = new Property<View, Rect>(Rect.class, "clipBounds") {
            public Rect a(final View view) {
                return j0.N(view);
            }
            
            public void b(final View view, final Rect rect) {
                j0.K1(view, rect);
            }
        };
    }
    
    private y0() {
    }
    
    static void a(@androidx.annotation.j0 final View view) {
        y0.a.a(view);
    }
    
    static x0 b(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 18) {
            return new w0(view);
        }
        return v0.e(view);
    }
    
    static float c(@androidx.annotation.j0 final View view) {
        return y0.a.c(view);
    }
    
    static j1 d(@androidx.annotation.j0 final View view) {
        if (Build$VERSION.SDK_INT >= 18) {
            return new i1(view);
        }
        return new h1(view.getWindowToken());
    }
    
    static void e(@androidx.annotation.j0 final View view) {
        y0.a.d(view);
    }
    
    static void f(@androidx.annotation.j0 final View view, @k0 final Matrix matrix) {
        y0.a.e(view, matrix);
    }
    
    static void g(@androidx.annotation.j0 final View view, final int n, final int n2, final int n3, final int n4) {
        y0.a.f(view, n, n2, n3, n4);
    }
    
    static void h(@androidx.annotation.j0 final View view, final float n) {
        y0.a.g(view, n);
    }
    
    static void i(@androidx.annotation.j0 final View view, final int n) {
        y0.a.h(view, n);
    }
    
    static void j(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final Matrix matrix) {
        y0.a.i(view, matrix);
    }
    
    static void k(@androidx.annotation.j0 final View view, @androidx.annotation.j0 final Matrix matrix) {
        y0.a.j(view, matrix);
    }
}
