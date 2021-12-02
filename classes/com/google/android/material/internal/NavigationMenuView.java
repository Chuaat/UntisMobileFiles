// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import androidx.appcompat.view.menu.g;
import androidx.recyclerview.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.o;
import androidx.recyclerview.widget.RecyclerView;

@t0({ androidx.annotation.t0.a.H })
public class NavigationMenuView extends RecyclerView implements o
{
    public NavigationMenuView(final Context context) {
        this(context, null);
    }
    
    public NavigationMenuView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public NavigationMenuView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.setLayoutManager((p)new LinearLayoutManager(context, 1, false));
    }
    
    @Override
    public void e(final g g) {
    }
    
    @Override
    public int getWindowAnimations() {
        return 0;
    }
}
