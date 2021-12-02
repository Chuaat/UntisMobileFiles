// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.annotation.SuppressLint;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(19)
class z0 extends e1
{
    private static boolean h = true;
    
    @Override
    public void a(@j0 final View view) {
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public float c(@j0 final View view) {
        if (z0.h) {
            try {
                return view.getTransitionAlpha();
            }
            catch (NoSuchMethodError noSuchMethodError) {
                z0.h = false;
            }
        }
        return view.getAlpha();
    }
    
    @Override
    public void d(@j0 final View view) {
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void g(@j0 final View view, final float n) {
        if (z0.h) {
            try {
                view.setTransitionAlpha(n);
                return;
            }
            catch (NoSuchMethodError noSuchMethodError) {
                z0.h = false;
            }
        }
        view.setAlpha(n);
    }
}
