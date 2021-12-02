// 
// Decompiled by Procyon v0.5.36
// 

package com.viewpagerindicator;

import android.widget.ImageView;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.widget.FrameLayout$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager;
import android.widget.HorizontalScrollView;

public class b extends HorizontalScrollView implements f
{
    private final d G;
    private ViewPager H;
    private ViewPager$j I;
    private Runnable J;
    private int K;
    
    public b(final Context context) {
        this(context, null);
    }
    
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.setHorizontalScrollBarEnabled(false);
        this.addView((View)(this.G = new d(context, g.a.A)), (ViewGroup$LayoutParams)new FrameLayout$LayoutParams(-2, -1, 17));
    }
    
    private void c(final int n) {
        final View child = this.G.getChildAt(n);
        final Runnable j = this.J;
        if (j != null) {
            this.removeCallbacks(j);
        }
        this.post(this.J = new Runnable() {
            @Override
            public void run() {
                b.this.smoothScrollTo(child.getLeft() - (b.this.getWidth() - child.getWidth()) / 2, 0);
                b.this.J = null;
            }
        });
    }
    
    public void b(final int n, final float n2, final int n3) {
        final ViewPager$j i = this.I;
        if (i != null) {
            i.b(n, n2, n3);
        }
    }
    
    public void e() {
        this.G.removeAllViews();
        final c c = (c)this.H.getAdapter();
        final int count = c.getCount();
        for (int i = 0; i < count; ++i) {
            final ImageView imageView = new ImageView(this.getContext(), (AttributeSet)null, g.a.A);
            imageView.setImageResource(c.a(i));
            this.G.addView((View)imageView);
        }
        if (this.K > count) {
            this.K = count - 1;
        }
        this.setCurrentItem(this.K);
        this.requestLayout();
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int n) {
        final ViewPager$j i = this.I;
        if (i != null) {
            i.k(n);
        }
    }
    
    public void l(final int currentItem) {
        this.setCurrentItem(currentItem);
        final ViewPager$j i = this.I;
        if (i != null) {
            i.l(currentItem);
        }
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Runnable j = this.J;
        if (j != null) {
            this.post(j);
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Runnable j = this.J;
        if (j != null) {
            this.removeCallbacks(j);
        }
    }
    
    public void setCurrentItem(final int k) {
        final ViewPager h = this.H;
        if (h != null) {
            h.setCurrentItem(this.K = k);
            for (int childCount = this.G.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.G.getChildAt(i);
                final boolean selected = i == k;
                child.setSelected(selected);
                if (selected) {
                    this.c(k);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setOnPageChangeListener(final ViewPager$j i) {
        this.I = i;
    }
    
    public void setViewPager(final ViewPager h) {
        final ViewPager h2 = this.H;
        if (h2 == h) {
            return;
        }
        if (h2 != null) {
            h2.setOnPageChangeListener((ViewPager$j)null);
        }
        if (h.getAdapter() != null) {
            (this.H = h).setOnPageChangeListener((ViewPager$j)this);
            this.e();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
}
