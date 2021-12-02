// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(23)
class c1 extends b1
{
    private static boolean m = true;
    
    @SuppressLint({ "NewApi" })
    @Override
    public void h(@j0 final View view, final int transitionVisibility) {
        if (Build$VERSION.SDK_INT == 28) {
            super.h(view, transitionVisibility);
        }
        else if (c1.m) {
            try {
                view.setTransitionVisibility(transitionVisibility);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                c1.m = false;
            }
        }
    }
}
