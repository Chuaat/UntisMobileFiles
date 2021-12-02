// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.view.View;
import androidx.annotation.j0;
import android.view.ViewGroup;

public class z
{
    private int a;
    private int b;
    
    public z(@j0 final ViewGroup viewGroup) {
    }
    
    public int a() {
        return this.a | this.b;
    }
    
    public void b(@j0 final View view, @j0 final View view2, final int n) {
        this.c(view, view2, n, 0);
    }
    
    public void c(@j0 final View view, @j0 final View view2, final int n, final int n2) {
        if (n2 == 1) {
            this.b = n;
        }
        else {
            this.a = n;
        }
    }
    
    public void d(@j0 final View view) {
        this.e(view, 0);
    }
    
    public void e(@j0 final View view, final int n) {
        if (n == 1) {
            this.b = 0;
        }
        else {
            this.a = 0;
        }
    }
}
