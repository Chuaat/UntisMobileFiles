// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.view.ViewGroup;
import androidx.annotation.j0;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$j;

public class e implements ViewPager$j
{
    @j0
    private ViewPager G;
    @j0
    private ViewPager H;
    private int I;
    
    public e(@j0 final ViewPager g, @j0 final ViewPager h) {
        this.I = 0;
        this.G = g;
        this.H = h;
    }
    
    public void b(final int n, final float n2, final int n3) {
        if (this.I == 0) {
            return;
        }
        ((ViewGroup)this.H).scrollTo(((ViewGroup)this.G).getScrollX(), ((ViewGroup)this.G).getScrollY());
    }
    
    public void k(final int i) {
        this.I = i;
        if (i == 0) {
            this.H.setCurrentItem(this.G.getCurrentItem(), false);
        }
    }
    
    public void l(final int n) {
    }
}
