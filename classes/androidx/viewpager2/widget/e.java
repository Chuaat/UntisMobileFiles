// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.widget;

import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.annotation.j0;
import android.view.View;
import androidx.core.util.n;
import androidx.annotation.n0;

public final class e implements m
{
    private final int a;
    
    public e(@n0 final int a) {
        androidx.core.util.n.e(a, "Margin must be non-negative");
        this.a = a;
    }
    
    private ViewPager2 b(@j0 final View view) {
        final ViewParent parent = view.getParent();
        final ViewParent parent2 = parent.getParent();
        if (parent instanceof RecyclerView && parent2 instanceof ViewPager2) {
            return (ViewPager2)parent2;
        }
        throw new IllegalStateException("Expected the page view to be managed by a ViewPager2 instance.");
    }
    
    @Override
    public void a(@j0 final View view, float translationX) {
        final ViewPager2 b = this.b(view);
        final float translationY = this.a * translationX;
        if (b.getOrientation() == 0) {
            translationX = translationY;
            if (b.k()) {
                translationX = -translationY;
            }
            view.setTranslationX(translationX);
        }
        else {
            view.setTranslationY(translationY);
        }
    }
}
