// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.view.View;

class c0
{
    private c0() {
    }
    
    static int a(final RecyclerView.d0 d0, final z z, final View view, final View view2, final RecyclerView.p p6, final boolean b) {
        if (p6.Q() == 0 || d0.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return Math.abs(p6.s0(view) - p6.s0(view2)) + 1;
        }
        return Math.min(z.o(), z.d(view2) - z.g(view));
    }
    
    static int b(final RecyclerView.d0 d0, final z z, final View view, final View view2, final RecyclerView.p p7, final boolean b, final boolean b2) {
        if (p7.Q() == 0 || d0.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        final int min = Math.min(p7.s0(view), p7.s0(view2));
        final int max = Math.max(p7.s0(view), p7.s0(view2));
        int n;
        if (b2) {
            n = Math.max(0, d0.d() - max - 1);
        }
        else {
            n = Math.max(0, min);
        }
        if (!b) {
            return n;
        }
        return Math.round(n * (Math.abs(z.d(view2) - z.g(view)) / (float)(Math.abs(p7.s0(view) - p7.s0(view2)) + 1)) + (z.n() - z.g(view)));
    }
    
    static int c(final RecyclerView.d0 d0, final z z, final View view, final View view2, final RecyclerView.p p6, final boolean b) {
        if (p6.Q() == 0 || d0.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return d0.d();
        }
        return (int)((z.d(view2) - z.g(view)) / (float)(Math.abs(p6.s0(view) - p6.s0(view2)) + 1) * d0.d());
    }
}
