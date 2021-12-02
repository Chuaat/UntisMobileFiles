// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.graphics.Canvas;
import c1.a;
import android.os.Build$VERSION;
import androidx.core.view.j0;
import android.view.View;

class q implements p
{
    static final p a;
    
    static {
        a = new q();
    }
    
    private static float e(final RecyclerView recyclerView, final View view) {
        final int childCount = recyclerView.getChildCount();
        float n = 0.0f;
        float n2;
        for (int i = 0; i < childCount; ++i, n = n2) {
            final View child = recyclerView.getChildAt(i);
            if (child == view) {
                n2 = n;
            }
            else {
                final float p2 = j0.P(child);
                n2 = n;
                if (p2 > n) {
                    n2 = p2;
                }
            }
        }
        return n;
    }
    
    @Override
    public void a(final View view) {
        if (Build$VERSION.SDK_INT >= 21) {
            final int v = c1.a.e.V;
            final Object tag = view.getTag(v);
            if (tag instanceof Float) {
                j0.L1(view, (float)tag);
            }
            view.setTag(v, (Object)null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }
    
    @Override
    public void b(final View view) {
    }
    
    @Override
    public void c(final Canvas canvas, final RecyclerView recyclerView, final View view, final float n, final float n2, final int n3, final boolean b) {
    }
    
    @Override
    public void d(final Canvas canvas, final RecyclerView recyclerView, final View view, final float translationX, final float translationY, int v, final boolean b) {
        if (Build$VERSION.SDK_INT >= 21 && b) {
            v = c1.a.e.V;
            if (view.getTag(v) == null) {
                final float p7 = j0.P(view);
                j0.L1(view, e(recyclerView, view) + 1.0f);
                view.setTag(v, (Object)p7);
            }
        }
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
    }
}
