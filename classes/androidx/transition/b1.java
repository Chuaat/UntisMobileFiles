// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.annotation.SuppressLint;
import androidx.annotation.j0;
import android.view.View;
import androidx.annotation.p0;

@p0(22)
class b1 extends a1
{
    private static boolean l = true;
    
    @SuppressLint({ "NewApi" })
    @Override
    public void f(@j0 final View view, final int n, final int n2, final int n3, final int n4) {
        if (b1.l) {
            try {
                view.setLeftTopRightBottom(n, n2, n3, n4);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                b1.l = false;
            }
        }
    }
}
