// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import androidx.annotation.j0;
import android.view.View;

public interface y
{
    int getNestedScrollAxes();
    
    boolean onNestedFling(@j0 final View p0, final float p1, final float p2, final boolean p3);
    
    boolean onNestedPreFling(@j0 final View p0, final float p1, final float p2);
    
    void onNestedPreScroll(@j0 final View p0, final int p1, final int p2, @j0 final int[] p3);
    
    void onNestedScroll(@j0 final View p0, final int p1, final int p2, final int p3, final int p4);
    
    void onNestedScrollAccepted(@j0 final View p0, @j0 final View p1, final int p2);
    
    boolean onStartNestedScroll(@j0 final View p0, @j0 final View p1, final int p2);
    
    void onStopNestedScroll(@j0 final View p0);
}
