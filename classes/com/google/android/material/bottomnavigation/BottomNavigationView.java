// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.bottomnavigation;

import androidx.annotation.t0;
import com.google.android.material.navigation.c;
import com.google.android.material.shape.j;
import android.os.Build$VERSION;
import android.view.ViewGroup$LayoutParams;
import android.widget.FrameLayout$LayoutParams;
import androidx.core.content.d;
import android.view.View;
import androidx.appcompat.widget.u0;
import com.google.android.material.internal.t;
import o2.a;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import com.google.android.material.navigation.e;

public class BottomNavigationView extends e
{
    static final int S = 5;
    
    public BottomNavigationView(@j0 final Context context) {
        this(context, null);
    }
    
    public BottomNavigationView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, o2.a.c.L0);
    }
    
    public BottomNavigationView(@j0 final Context context, @k0 final AttributeSet set, final int n) {
        this(context, set, n, o2.a.n.ta);
    }
    
    public BottomNavigationView(@j0 Context context, @k0 final AttributeSet set, final int n, final int n2) {
        super(context, set, n, n2);
        context = this.getContext();
        final u0 k = t.k(context, set, o2.a.o.y4, n, n2, new int[0]);
        this.setItemHorizontalTranslationEnabled(k.a(o2.a.o.z4, true));
        k.I();
        if (this.m()) {
            this.k(context);
        }
    }
    
    private void k(@j0 final Context context) {
        final View view = new View(context);
        view.setBackgroundColor(androidx.core.content.d.f(context, o2.a.e.U));
        view.setLayoutParams((ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-1, this.getResources().getDimensionPixelSize(o2.a.f.Z0)));
        this.addView(view);
    }
    
    private boolean m() {
        return Build$VERSION.SDK_INT < 21 && !(this.getBackground() instanceof j);
    }
    
    @j0
    @t0({ t0.a.H })
    @Override
    protected com.google.android.material.navigation.c e(@j0 final Context context) {
        return new com.google.android.material.bottomnavigation.b(context);
    }
    
    @Override
    public int getMaxItemCount() {
        return 5;
    }
    
    public boolean l() {
        return ((com.google.android.material.bottomnavigation.b)this.getMenuView()).r();
    }
    
    public void setItemHorizontalTranslationEnabled(final boolean itemHorizontalTranslationEnabled) {
        final com.google.android.material.bottomnavigation.b b = (com.google.android.material.bottomnavigation.b)this.getMenuView();
        if (b.r() != itemHorizontalTranslationEnabled) {
            b.setItemHorizontalTranslationEnabled(itemHorizontalTranslationEnabled);
            this.getPresenter().e(false);
        }
    }
    
    @Deprecated
    public void setOnNavigationItemReselectedListener(@k0 final a onItemReselectedListener) {
        this.setOnItemReselectedListener((d)onItemReselectedListener);
    }
    
    @Deprecated
    public void setOnNavigationItemSelectedListener(@k0 final b onItemSelectedListener) {
        this.setOnItemSelectedListener((e)onItemSelectedListener);
    }
    
    @Deprecated
    public interface a extends d
    {
    }
    
    @Deprecated
    public interface b extends e
    {
    }
}
