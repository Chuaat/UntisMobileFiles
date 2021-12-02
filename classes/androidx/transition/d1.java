// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.k0;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(29)
class d1 extends c1
{
    @Override
    public float c(@j0 final View view) {
        return view.getTransitionAlpha();
    }
    
    @Override
    public void e(@j0 final View view, @k0 final Matrix animationMatrix) {
        view.setAnimationMatrix(animationMatrix);
    }
    
    @Override
    public void f(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
        view.setLeftTopRightBottom(n, n2, n3, n4);
    }
    
    @Override
    public void g(@j0 final View view, final float transitionAlpha) {
        view.setTransitionAlpha(transitionAlpha);
    }
    
    @Override
    public void h(@j0 final View view, final int transitionVisibility) {
        view.setTransitionVisibility(transitionVisibility);
    }
    
    @Override
    public void i(@j0 final View view, @j0 final Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }
    
    @Override
    public void j(@j0 final View view, @j0 final Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
