// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager.widget;

import androidx.core.content.d;
import androidx.annotation.n;
import androidx.annotation.s;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.graphics.Canvas;
import androidx.annotation.l;
import android.view.View;
import android.view.View$OnClickListener;
import android.view.ViewConfiguration;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Paint;

public class b extends c
{
    private static final String r0 = "PagerTabStrip";
    private static final int s0 = 3;
    private static final int t0 = 6;
    private static final int u0 = 16;
    private static final int v0 = 32;
    private static final int w0 = 64;
    private static final int x0 = 1;
    private static final int y0 = 32;
    private int b0;
    private int c0;
    private int d0;
    private int e0;
    private int f0;
    private int g0;
    private final Paint h0;
    private final Rect i0;
    private int j0;
    private boolean k0;
    private boolean l0;
    private int m0;
    private boolean n0;
    private float o0;
    private float p0;
    private int q0;
    
    public b(@j0 final Context context) {
        this(context, null);
    }
    
    public b(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        final Paint h0 = new Paint();
        this.h0 = h0;
        this.i0 = new Rect();
        this.j0 = 255;
        this.k0 = false;
        this.l0 = false;
        h0.setColor(this.b0 = super.T);
        final float density = context.getResources().getDisplayMetrics().density;
        this.c0 = (int)(3.0f * density + 0.5f);
        this.d0 = (int)(6.0f * density + 0.5f);
        this.e0 = (int)(64.0f * density);
        this.g0 = (int)(16.0f * density + 0.5f);
        this.m0 = (int)(1.0f * density + 0.5f);
        this.f0 = (int)(density * 32.0f + 0.5f);
        this.q0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.setPadding(this.getPaddingLeft(), this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
        this.setTextSpacing(this.getTextSpacing());
        this.setWillNotDraw(false);
        super.H.setFocusable(true);
        super.H.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final ViewPager g = b.this.G;
                g.setCurrentItem(g.getCurrentItem() - 1);
            }
        });
        super.J.setFocusable(true);
        super.J.setOnClickListener((View$OnClickListener)new View$OnClickListener() {
            public void onClick(final View view) {
                final ViewPager g = b.this.G;
                g.setCurrentItem(g.getCurrentItem() + 1);
            }
        });
        if (this.getBackground() == null) {
            this.k0 = true;
        }
    }
    
    @Override
    void d(final int n, final float n2, final boolean b) {
        final Rect i0 = this.i0;
        final int height = this.getHeight();
        final int left = super.I.getLeft();
        final int g0 = this.g0;
        final int right = super.I.getRight();
        final int g2 = this.g0;
        final int n3 = height - this.c0;
        i0.set(left - g0, n3, right + g2, height);
        super.d(n, n2, b);
        this.j0 = (int)(Math.abs(n2 - 0.5f) * 2.0f * 255.0f);
        i0.union(super.I.getLeft() - this.g0, n3, super.I.getRight() + this.g0, height);
        this.invalidate(i0);
    }
    
    public boolean getDrawFullUnderline() {
        return this.k0;
    }
    
    @Override
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f0);
    }
    
    @l
    public int getTabIndicatorColor() {
        return this.b0;
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final int height = this.getHeight();
        final int left = super.I.getLeft();
        final int g0 = this.g0;
        final int right = super.I.getRight();
        final int g2 = this.g0;
        final int c0 = this.c0;
        this.h0.setColor(this.j0 << 24 | (this.b0 & 0xFFFFFF));
        final float n = (float)(left - g0);
        final float n2 = (float)(height - c0);
        final float n3 = (float)(right + g2);
        final float n4 = (float)height;
        canvas.drawRect(n, n2, n3, n4, this.h0);
        if (this.k0) {
            this.h0.setColor(0xFF000000 | (this.b0 & 0xFFFFFF));
            canvas.drawRect((float)this.getPaddingLeft(), (float)(height - this.m0), (float)(this.getWidth() - this.getPaddingRight()), n4, this.h0);
        }
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        final int action = motionEvent.getAction();
        if (action != 0 && this.n0) {
            return false;
        }
        final float x = motionEvent.getX();
        final float y = motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                if (action == 2) {
                    if (Math.abs(x - this.o0) > this.q0 || Math.abs(y - this.p0) > this.q0) {
                        this.n0 = true;
                    }
                }
            }
            else {
                ViewPager viewPager;
                int currentItem;
                if (x < super.I.getLeft() - this.g0) {
                    viewPager = super.G;
                    currentItem = viewPager.getCurrentItem() - 1;
                }
                else {
                    if (x <= super.I.getRight() + this.g0) {
                        return true;
                    }
                    viewPager = super.G;
                    currentItem = viewPager.getCurrentItem() + 1;
                }
                viewPager.setCurrentItem(currentItem);
            }
        }
        else {
            this.o0 = x;
            this.p0 = y;
            this.n0 = false;
        }
        return true;
    }
    
    public void setBackgroundColor(@l final int backgroundColor) {
        super.setBackgroundColor(backgroundColor);
        if (!this.l0) {
            this.k0 = ((backgroundColor & 0xFF000000) == 0x0);
        }
    }
    
    public void setBackgroundDrawable(final Drawable backgroundDrawable) {
        super.setBackgroundDrawable(backgroundDrawable);
        if (!this.l0) {
            this.k0 = (backgroundDrawable == null);
        }
    }
    
    public void setBackgroundResource(@s final int backgroundResource) {
        super.setBackgroundResource(backgroundResource);
        if (!this.l0) {
            this.k0 = (backgroundResource == 0);
        }
    }
    
    public void setDrawFullUnderline(final boolean k0) {
        this.k0 = k0;
        this.l0 = true;
        this.invalidate();
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        final int d0 = this.d0;
        int n5 = n4;
        if (n4 < d0) {
            n5 = d0;
        }
        super.setPadding(n, n2, n3, n5);
    }
    
    public void setTabIndicatorColor(@l final int n) {
        this.b0 = n;
        this.h0.setColor(n);
        this.invalidate();
    }
    
    public void setTabIndicatorColorResource(@n final int n) {
        this.setTabIndicatorColor(d.f(this.getContext(), n));
    }
    
    @Override
    public void setTextSpacing(final int n) {
        final int e0 = this.e0;
        int textSpacing = n;
        if (n < e0) {
            textSpacing = e0;
        }
        super.setTextSpacing(textSpacing);
    }
}
