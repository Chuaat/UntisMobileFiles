// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.views;

import android.view.MotionEvent;
import androidx.annotation.j0;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.k0;
import androidx.viewpager.widget.a;
import androidx.viewpager.widget.ViewPager;

public class NonSwipeableViewPager extends ViewPager
{
    @k0
    private a G;
    
    public NonSwipeableViewPager(final Context context) {
        super(context);
    }
    
    public NonSwipeableViewPager(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    public void a(@j0 final a g) {
        this.G = g;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final a g = this.G;
        if (g != null) {
            this.setAdapter(g);
        }
    }
    
    public boolean onInterceptTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        return false;
    }
}
