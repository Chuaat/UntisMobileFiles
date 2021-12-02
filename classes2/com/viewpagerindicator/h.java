// 
// Decompiled by Procyon v0.5.36
// 

package com.viewpagerindicator;

import android.widget.TextView;
import android.view.View$MeasureSpec;
import androidx.viewpager.widget.a;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager;
import android.view.View$OnClickListener;
import android.widget.HorizontalScrollView;

public class h extends HorizontalScrollView implements f
{
    private static final CharSequence O;
    private Runnable G;
    private final View$OnClickListener H;
    private final com.viewpagerindicator.d I;
    private ViewPager J;
    private ViewPager$j K;
    private int L;
    private int M;
    private c N;
    
    static {
        O = "";
    }
    
    public h(final Context context) {
        this(context, null);
    }
    
    public h(final Context context, final AttributeSet set) {
        super(context, set);
        this.H = (View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final d d = (d)view;
                final int currentItem = h.this.J.getCurrentItem();
                final int b = d.b();
                h.this.J.setCurrentItem(b);
                if (currentItem == b && h.this.N != null) {
                    h.this.N.a(b);
                }
            }
        };
        this.setHorizontalScrollBarEnabled(false);
        this.addView((View)(this.I = new com.viewpagerindicator.d(context, g.a.C)), new ViewGroup$LayoutParams(-2, -1));
    }
    
    private void g(final int n, final CharSequence text, final int n2) {
        final d d = new d(this.getContext());
        d.G = n;
        d.setFocusable(true);
        d.setOnClickListener(this.H);
        d.setText(text);
        if (n2 != 0) {
            d.setCompoundDrawablesWithIntrinsicBounds(n2, 0, 0, 0);
        }
        this.I.addView((View)d, (ViewGroup$LayoutParams)new LinearLayout$LayoutParams(0, -1, 1.0f));
    }
    
    private void h(final int n) {
        final View child = this.I.getChildAt(n);
        final Runnable g = this.G;
        if (g != null) {
            this.removeCallbacks(g);
        }
        this.post(this.G = new Runnable() {
            @Override
            public void run() {
                h.this.smoothScrollTo(child.getLeft() - (h.this.getWidth() - child.getWidth()) / 2, 0);
                h.this.G = null;
            }
        });
    }
    
    public void b(final int n, final float n2, final int n3) {
        final ViewPager$j k = this.K;
        if (k != null) {
            k.b(n, n2, n3);
        }
    }
    
    public void e() {
        this.I.removeAllViews();
        final a adapter = this.J.getAdapter();
        com.viewpagerindicator.c c;
        if (adapter instanceof com.viewpagerindicator.c) {
            c = (com.viewpagerindicator.c)adapter;
        }
        else {
            c = null;
        }
        final int count = adapter.getCount();
        for (int i = 0; i < count; ++i) {
            CharSequence charSequence;
            if ((charSequence = adapter.getPageTitle(i)) == null) {
                charSequence = h.O;
            }
            int a;
            if (c != null) {
                a = c.a(i);
            }
            else {
                a = 0;
            }
            this.g(i, charSequence, a);
        }
        if (this.M > count) {
            this.M = count - 1;
        }
        this.setCurrentItem(this.M);
        this.requestLayout();
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int n) {
        final ViewPager$j k = this.K;
        if (k != null) {
            k.k(n);
        }
    }
    
    public void l(final int currentItem) {
        this.setCurrentItem(currentItem);
        final ViewPager$j k = this.K;
        if (k != null) {
            k.l(currentItem);
        }
    }
    
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        final Runnable g = this.G;
        if (g != null) {
            this.post(g);
        }
    }
    
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final Runnable g = this.G;
        if (g != null) {
            this.removeCallbacks(g);
        }
    }
    
    public void onMeasure(int measuredWidth, final int n) {
        final int mode = View$MeasureSpec.getMode(measuredWidth);
        final boolean fillViewport = mode == 1073741824;
        this.setFillViewport(fillViewport);
        final int childCount = this.I.getChildCount();
        Label_0092: {
            int l;
            if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
                if (childCount <= 2) {
                    this.L = View$MeasureSpec.getSize(measuredWidth) / 2;
                    break Label_0092;
                }
                l = (int)(View$MeasureSpec.getSize(measuredWidth) * 0.4f);
            }
            else {
                l = -1;
            }
            this.L = l;
        }
        final int measuredWidth2 = this.getMeasuredWidth();
        super.onMeasure(measuredWidth, n);
        measuredWidth = this.getMeasuredWidth();
        if (fillViewport && measuredWidth2 != measuredWidth) {
            this.setCurrentItem(this.M);
        }
    }
    
    public void setCurrentItem(final int m) {
        final ViewPager j = this.J;
        if (j != null) {
            j.setCurrentItem(this.M = m);
            for (int childCount = this.I.getChildCount(), i = 0; i < childCount; ++i) {
                final View child = this.I.getChildAt(i);
                final boolean selected = i == m;
                child.setSelected(selected);
                if (selected) {
                    this.h(m);
                }
            }
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setOnPageChangeListener(final ViewPager$j k) {
        this.K = k;
    }
    
    public void setOnTabReselectedListener(final c n) {
        this.N = n;
    }
    
    public void setViewPager(final ViewPager j) {
        final ViewPager i = this.J;
        if (i == j) {
            return;
        }
        if (i != null) {
            i.setOnPageChangeListener((ViewPager$j)null);
        }
        if (j.getAdapter() != null) {
            (this.J = j).setOnPageChangeListener((ViewPager$j)this);
            this.e();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    
    public interface c
    {
        void a(final int p0);
    }
    
    private class d extends TextView
    {
        private int G;
        
        public d(final Context context) {
            super(context, (AttributeSet)null, g.a.C);
        }
        
        public int b() {
            return this.G;
        }
        
        public void onMeasure(final int n, final int n2) {
            super.onMeasure(n, n2);
            if (h.this.L > 0 && this.getMeasuredWidth() > h.this.L) {
                super.onMeasure(View$MeasureSpec.makeMeasureSpec(h.this.L, 1073741824), n2);
            }
        }
    }
}
