// 
// Decompiled by Procyon v0.5.36
// 

package com.viewpagerindicator;

import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager$j;

public interface f extends ViewPager$j
{
    void e();
    
    void j(final ViewPager p0, final int p1);
    
    void setCurrentItem(final int p0);
    
    void setOnPageChangeListener(final ViewPager$j p0);
    
    void setViewPager(final ViewPager p0);
}
