// 
// Decompiled by Procyon v0.5.36
// 

package com.viewpagerindicator;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.view.View$BaseSavedState;
import androidx.core.view.r;
import android.view.MotionEvent;
import android.os.Parcelable;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import androidx.core.view.k0;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager;
import android.graphics.Paint;
import android.view.View;

public class j extends View implements f
{
    private static final int V = -1;
    private static final int W = 30;
    private final Paint G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private ViewPager L;
    private ViewPager$j M;
    private int N;
    private int O;
    private float P;
    private int Q;
    private float R;
    private int S;
    private boolean T;
    private final Runnable U;
    
    public j(final Context context) {
        this(context, null);
    }
    
    public j(final Context context, final AttributeSet set) {
        this(context, set, g.a.E);
    }
    
    public j(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new Paint(1);
        this.R = -1.0f;
        this.S = -1;
        this.U = new Runnable() {
            @Override
            public void run() {
                if (!j.this.H) {
                    return;
                }
                final int max = Math.max(j.this.G.getAlpha() - j.this.K, 0);
                j.this.G.setAlpha(max);
                j.this.invalidate();
                if (max > 0) {
                    j.this.postDelayed((Runnable)this, 30L);
                }
            }
        };
        if (this.isInEditMode()) {
            return;
        }
        final Resources resources = this.getResources();
        final boolean boolean1 = resources.getBoolean(g.b.e);
        final int integer = resources.getInteger(g.g.d);
        final int integer2 = resources.getInteger(g.g.e);
        final int color = resources.getColor(g.c.i);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, g.i.I, n, 0);
        this.setFades(obtainStyledAttributes.getBoolean(g.i.M, boolean1));
        this.setSelectedColor(obtainStyledAttributes.getColor(g.i.N, color));
        this.setFadeDelay(obtainStyledAttributes.getInteger(g.i.K, integer));
        this.setFadeLength(obtainStyledAttributes.getInteger(g.i.L, integer2));
        final Drawable drawable = obtainStyledAttributes.getDrawable(g.i.J);
        if (drawable != null) {
            this.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.Q = k0.d(ViewConfiguration.get(context));
    }
    
    public void b(final int o, final float p3, final int n) {
        this.O = o;
        this.P = p3;
        if (this.H) {
            if (n > 0) {
                this.removeCallbacks(this.U);
                this.G.setAlpha(255);
            }
            else if (this.N != 1) {
                this.postDelayed(this.U, (long)this.I);
            }
        }
        this.invalidate();
        final ViewPager$j m = this.M;
        if (m != null) {
            m.b(o, p3, n);
        }
    }
    
    public void e() {
        this.invalidate();
    }
    
    public int getFadeDelay() {
        return this.I;
    }
    
    public int getFadeLength() {
        return this.J;
    }
    
    public boolean getFades() {
        return this.H;
    }
    
    public int getSelectedColor() {
        return this.G.getColor();
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int n) {
        this.N = n;
        final ViewPager$j m = this.M;
        if (m != null) {
            m.k(n);
        }
    }
    
    public void l(final int o) {
        if (this.N == 0) {
            this.O = o;
            this.P = 0.0f;
            this.invalidate();
            this.U.run();
        }
        final ViewPager$j m = this.M;
        if (m != null) {
            m.l(o);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final ViewPager l = this.L;
        if (l == null) {
            return;
        }
        final int count = l.getAdapter().getCount();
        if (count == 0) {
            return;
        }
        if (this.O >= count) {
            this.setCurrentItem(count - 1);
            return;
        }
        final int paddingLeft = this.getPaddingLeft();
        final float n = (this.getWidth() - paddingLeft - this.getPaddingRight()) / (count * 1.0f);
        final float n2 = paddingLeft + (this.O + this.P) * n;
        canvas.drawRect(n2, (float)this.getPaddingTop(), n2 + n, (float)(this.getHeight() - this.getPaddingBottom()), this.G);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final c c = (c)parcelable;
        super.onRestoreInstanceState(c.getSuperState());
        this.O = c.G;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final c c = new c(super.onSaveInstanceState());
        c.G = this.O;
        return (Parcelable)c;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        final ViewPager l = this.L;
        int n = 0;
        if (l != null && l.getAdapter().getCount() != 0) {
            final int n2 = motionEvent.getAction() & 0xFF;
            float r = 0.0f;
            Label_0424: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 == 5) {
                                    final int b = androidx.core.view.r.b(motionEvent);
                                    this.R = androidx.core.view.r.j(motionEvent, b);
                                    this.S = androidx.core.view.r.h(motionEvent, b);
                                    return true;
                                }
                                if (n2 != 6) {
                                    return true;
                                }
                                final int b2 = androidx.core.view.r.b(motionEvent);
                                if (androidx.core.view.r.h(motionEvent, b2) == this.S) {
                                    if (b2 == 0) {
                                        n = 1;
                                    }
                                    this.S = androidx.core.view.r.h(motionEvent, n);
                                }
                                r = androidx.core.view.r.j(motionEvent, androidx.core.view.r.a(motionEvent, this.S));
                                break Label_0424;
                            }
                        }
                        else {
                            final float j = androidx.core.view.r.j(motionEvent, androidx.core.view.r.a(motionEvent, this.S));
                            final float a = j - this.R;
                            if (!this.T && Math.abs(a) > this.Q) {
                                this.T = true;
                            }
                            if (!this.T) {
                                return true;
                            }
                            this.R = j;
                            if (this.L.isFakeDragging() || this.L.beginFakeDrag()) {
                                this.L.fakeDragBy(a);
                                return true;
                            }
                            return true;
                        }
                    }
                    if (!this.T) {
                        final int count = this.L.getAdapter().getCount();
                        final float n3 = (float)this.getWidth();
                        final float n4 = n3 / 2.0f;
                        final float n5 = n3 / 6.0f;
                        if (this.O > 0 && motionEvent.getX() < n4 - n5) {
                            if (n2 != 3) {
                                this.L.setCurrentItem(this.O - 1);
                            }
                            return true;
                        }
                        if (this.O < count - 1 && motionEvent.getX() > n4 + n5) {
                            if (n2 != 3) {
                                this.L.setCurrentItem(this.O + 1);
                            }
                            return true;
                        }
                    }
                    this.T = false;
                    this.S = -1;
                    if (this.L.isFakeDragging()) {
                        this.L.endFakeDrag();
                        return true;
                    }
                    return true;
                }
                else {
                    this.S = androidx.core.view.r.h(motionEvent, 0);
                    r = motionEvent.getX();
                }
            }
            this.R = r;
            return true;
        }
        return false;
    }
    
    public void setCurrentItem(final int n) {
        final ViewPager l = this.L;
        if (l != null) {
            l.setCurrentItem(n);
            this.O = n;
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setFadeDelay(final int i) {
        this.I = i;
    }
    
    public void setFadeLength(final int j) {
        this.J = j;
        this.K = 255 / (j / 30);
    }
    
    public void setFades(final boolean h) {
        if (h != this.H) {
            this.H = h;
            if (h) {
                this.post(this.U);
            }
            else {
                this.removeCallbacks(this.U);
                this.G.setAlpha(255);
                this.invalidate();
            }
        }
    }
    
    public void setOnPageChangeListener(final ViewPager$j m) {
        this.M = m;
    }
    
    public void setSelectedColor(final int color) {
        this.G.setColor(color);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager l) {
        final ViewPager i = this.L;
        if (i == l) {
            return;
        }
        if (i != null) {
            i.setOnPageChangeListener((ViewPager$j)null);
        }
        if (l.getAdapter() != null) {
            (this.L = l).setOnPageChangeListener((ViewPager$j)this);
            this.invalidate();
            this.post((Runnable)new Runnable() {
                @Override
                public void run() {
                    if (j.this.H) {
                        final j g = j.this;
                        g.post(g.U);
                    }
                }
            });
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    
    static class c extends View$BaseSavedState
    {
        public static final Parcelable$Creator<c> CREATOR;
        int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<c>() {
                public c a(final Parcel parcel) {
                    return new c(parcel);
                }
                
                public c[] b(final int n) {
                    return new c[n];
                }
            };
        }
        
        private c(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
        }
        
        public c(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
        }
    }
}
