// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import androidx.recyclerview.widget.RecyclerView;
import android.animation.LayoutTransition;
import android.view.ViewGroup;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import java.util.Arrays;
import java.util.Comparator;
import androidx.annotation.j0;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.view.ViewGroup$MarginLayoutParams;

final class a
{
    private static final ViewGroup$MarginLayoutParams b;
    private LinearLayoutManager a;
    
    static {
        (b = new ViewGroup$MarginLayoutParams(-1, -1)).setMargins(0, 0, 0, 0);
    }
    
    a(@j0 final LinearLayoutManager a) {
        this.a = a;
    }
    
    private boolean a() {
        final int q = ((RecyclerView.p)this.a).Q();
        if (q == 0) {
            return true;
        }
        final boolean b = this.a.M2() == 0;
        final int[][] a = new int[q][2];
        for (int i = 0; i < q; ++i) {
            final View p = ((RecyclerView.p)this.a).P(i);
            if (p == null) {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
            final ViewGroup$LayoutParams layoutParams = p.getLayoutParams();
            ViewGroup$MarginLayoutParams b2;
            if (layoutParams instanceof ViewGroup$MarginLayoutParams) {
                b2 = (ViewGroup$MarginLayoutParams)layoutParams;
            }
            else {
                b2 = androidx.viewpager2.widget.a.b;
            }
            final int[] array = a[i];
            int n;
            int n2;
            if (b) {
                n = p.getLeft();
                n2 = b2.leftMargin;
            }
            else {
                n = p.getTop();
                n2 = b2.topMargin;
            }
            array[0] = n - n2;
            final int[] array2 = a[i];
            int n3;
            int n4;
            if (b) {
                n3 = p.getRight();
                n4 = b2.rightMargin;
            }
            else {
                n3 = p.getBottom();
                n4 = b2.bottomMargin;
            }
            array2[1] = n3 + n4;
        }
        Arrays.sort(a, new Comparator<int[]>() {
            public int a(final int[] array, final int[] array2) {
                return array[0] - array2[0];
            }
        });
        for (int j = 1; j < q; ++j) {
            if (a[j - 1][1] != a[j][0]) {
                return false;
            }
        }
        final int n5 = a[0][1];
        final int n6 = a[0][0];
        return a[0][0] <= 0 && a[q - 1][1] >= n5 - n6;
    }
    
    private boolean b() {
        for (int q = ((RecyclerView.p)this.a).Q(), i = 0; i < q; ++i) {
            if (c(((RecyclerView.p)this.a).P(i))) {
                return true;
            }
        }
        return false;
    }
    
    private static boolean c(final View view) {
        if (view instanceof ViewGroup) {
            final ViewGroup viewGroup = (ViewGroup)view;
            final LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            for (int childCount = viewGroup.getChildCount(), i = 0; i < childCount; ++i) {
                if (c(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
    
    boolean d() {
        final boolean a = this.a();
        boolean b = true;
        if ((a && ((RecyclerView.p)this.a).Q() > 1) || !this.b()) {
            b = false;
        }
        return b;
    }
}
