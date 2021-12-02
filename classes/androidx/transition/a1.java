// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.annotation.SuppressLint;
import androidx.annotation.k0;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(21)
class a1 extends z0
{
    private static boolean i = true;
    private static boolean j = true;
    private static boolean k = true;
    
    @SuppressLint({ "NewApi" })
    @Override
    public void e(@j0 final View view, @k0 final Matrix animationMatrix) {
        if (a1.i) {
            try {
                view.setAnimationMatrix(animationMatrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a1.i = false;
            }
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void i(@j0 final View view, @j0 final Matrix matrix) {
        if (a1.j) {
            try {
                view.transformMatrixToGlobal(matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a1.j = false;
            }
        }
    }
    
    @SuppressLint({ "NewApi" })
    @Override
    public void j(@j0 final View view, @j0 final Matrix matrix) {
        if (a1.k) {
            try {
                view.transformMatrixToLocal(matrix);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                a1.k = false;
            }
        }
    }
}
