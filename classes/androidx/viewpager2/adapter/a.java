// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager2.adapter;

import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup;
import android.view.View;
import androidx.annotation.j0;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;

public final class a extends g0
{
    private a(@j0 final FrameLayout frameLayout) {
        super((View)frameLayout);
    }
    
    @j0
    static a a(@j0 final ViewGroup viewGroup) {
        final FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup$LayoutParams(-1, -1));
        frameLayout.setId(androidx.core.view.j0.B());
        frameLayout.setSaveEnabled(false);
        return new a(frameLayout);
    }
    
    @j0
    FrameLayout b() {
        return (FrameLayout)super.itemView;
    }
}
