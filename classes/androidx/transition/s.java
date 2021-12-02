// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.graphics.Matrix;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.view.View;

class s
{
    private s() {
    }
    
    @k0
    static o a(@j0 final View view, @j0 final ViewGroup viewGroup, @k0 final Matrix matrix) {
        if (Build$VERSION.SDK_INT == 28) {
            return q.b(view, viewGroup, matrix);
        }
        return r.b(view, viewGroup, matrix);
    }
    
    static void b(final View view) {
        if (Build$VERSION.SDK_INT == 28) {
            q.f(view);
        }
        else {
            r.f(view);
        }
    }
}
