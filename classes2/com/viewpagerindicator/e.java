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
import android.view.View$MeasureSpec;
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

public class e extends View implements f
{
    private static final int S = -1;
    private final Paint G;
    private final Paint H;
    private ViewPager I;
    private ViewPager$j J;
    private int K;
    private boolean L;
    private float M;
    private float N;
    private int O;
    private float P;
    private int Q;
    private boolean R;
    
    public e(final Context context) {
        this(context, null);
    }
    
    public e(final Context context, final AttributeSet set) {
        this(context, set, g.a.B);
    }
    
    public e(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Paint g = new Paint(1);
        this.G = g;
        final Paint h = new Paint(1);
        this.H = h;
        this.P = -1.0f;
        this.Q = -1;
        if (this.isInEditMode()) {
            return;
        }
        final Resources resources = this.getResources();
        final int color = resources.getColor(com.viewpagerindicator.g.c.d);
        final int color2 = resources.getColor(com.viewpagerindicator.g.c.e);
        final float dimension = resources.getDimension(com.viewpagerindicator.g.d.d);
        final float dimension2 = resources.getDimension(com.viewpagerindicator.g.d.c);
        final float dimension3 = resources.getDimension(com.viewpagerindicator.g.d.e);
        final boolean boolean1 = resources.getBoolean(com.viewpagerindicator.g.b.c);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, com.viewpagerindicator.g.i.k, n, 0);
        this.L = obtainStyledAttributes.getBoolean(com.viewpagerindicator.g.i.m, boolean1);
        this.M = obtainStyledAttributes.getDimension(com.viewpagerindicator.g.i.o, dimension);
        this.N = obtainStyledAttributes.getDimension(com.viewpagerindicator.g.i.n, dimension2);
        this.setStrokeWidth(obtainStyledAttributes.getDimension(com.viewpagerindicator.g.i.q, dimension3));
        g.setColor(obtainStyledAttributes.getColor(com.viewpagerindicator.g.i.r, color2));
        h.setColor(obtainStyledAttributes.getColor(com.viewpagerindicator.g.i.p, color));
        final Drawable drawable = obtainStyledAttributes.getDrawable(com.viewpagerindicator.g.i.l);
        if (drawable != null) {
            this.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.O = k0.d(ViewConfiguration.get(context));
    }
    
    private int c(int size) {
        final int mode = View$MeasureSpec.getMode(size);
        size = View$MeasureSpec.getSize(size);
        float min;
        if (mode == 1073741824) {
            min = (float)size;
        }
        else {
            min = this.H.getStrokeWidth() + this.getPaddingTop() + this.getPaddingBottom();
            if (mode == Integer.MIN_VALUE) {
                min = Math.min(min, (float)size);
            }
        }
        return (int)Math.ceil(min);
    }
    
    private int d(int count) {
        final int mode = View$MeasureSpec.getMode(count);
        final int size = View$MeasureSpec.getSize(count);
        if (mode != 1073741824) {
            final ViewPager i = this.I;
            if (i != null) {
                count = i.getAdapter().getCount();
                float min = this.getPaddingLeft() + this.getPaddingRight() + count * this.M + (count - 1) * this.N;
                if (mode == Integer.MIN_VALUE) {
                    min = Math.min(min, (float)size);
                    return (int)Math.ceil(min);
                }
                return (int)Math.ceil(min);
            }
        }
        float min = (float)size;
        return (int)Math.ceil(min);
    }
    
    public boolean a() {
        return this.L;
    }
    
    public void b(final int n, final float n2, final int n3) {
        final ViewPager$j j = this.J;
        if (j != null) {
            j.b(n, n2, n3);
        }
    }
    
    public void e() {
        this.invalidate();
    }
    
    public float getGapWidth() {
        return this.N;
    }
    
    public float getLineWidth() {
        return this.M;
    }
    
    public int getSelectedColor() {
        return this.H.getColor();
    }
    
    public float getStrokeWidth() {
        return this.H.getStrokeWidth();
    }
    
    public int getUnselectedColor() {
        return this.G.getColor();
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int n) {
        final ViewPager$j j = this.J;
        if (j != null) {
            j.k(n);
        }
    }
    
    public void l(final int k) {
        this.K = k;
        this.invalidate();
        final ViewPager$j j = this.J;
        if (j != null) {
            j.l(k);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final ViewPager i = this.I;
        if (i == null) {
            return;
        }
        final int count = i.getAdapter().getCount();
        if (count == 0) {
            return;
        }
        if (this.K >= count) {
            this.setCurrentItem(count - 1);
            return;
        }
        final float m = this.M;
        final float n = this.N;
        final float n2 = m + n;
        final float n3 = (float)count;
        final float n4 = (float)this.getPaddingTop();
        final float n5 = (float)this.getPaddingLeft();
        final float n6 = (float)this.getPaddingRight();
        final float n7 = n4 + (this.getHeight() - n4 - this.getPaddingBottom()) / 2.0f;
        float n8 = n5;
        if (this.L) {
            n8 = n5 + ((this.getWidth() - n5 - n6) / 2.0f - (n3 * n2 - n) / 2.0f);
        }
        for (int j = 0; j < count; ++j) {
            final float n9 = n8 + j * n2;
            final float k = this.M;
            Paint paint;
            if (j == this.K) {
                paint = this.H;
            }
            else {
                paint = this.G;
            }
            canvas.drawLine(n9, n7, n9 + k, n7, paint);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(this.d(n), this.c(n2));
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final b b = (b)parcelable;
        super.onRestoreInstanceState(b.getSuperState());
        this.K = b.G;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final b b = new b(super.onSaveInstanceState());
        b.G = this.K;
        return (Parcelable)b;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        final ViewPager i = this.I;
        int n = 0;
        if (i != null && i.getAdapter().getCount() != 0) {
            final int n2 = motionEvent.getAction() & 0xFF;
            float p = 0.0f;
            Label_0424: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 == 5) {
                                    final int b = r.b(motionEvent);
                                    this.P = r.j(motionEvent, b);
                                    this.Q = r.h(motionEvent, b);
                                    return true;
                                }
                                if (n2 != 6) {
                                    return true;
                                }
                                final int b2 = r.b(motionEvent);
                                if (r.h(motionEvent, b2) == this.Q) {
                                    if (b2 == 0) {
                                        n = 1;
                                    }
                                    this.Q = r.h(motionEvent, n);
                                }
                                p = r.j(motionEvent, r.a(motionEvent, this.Q));
                                break Label_0424;
                            }
                        }
                        else {
                            final float j = r.j(motionEvent, r.a(motionEvent, this.Q));
                            final float a = j - this.P;
                            if (!this.R && Math.abs(a) > this.O) {
                                this.R = true;
                            }
                            if (!this.R) {
                                return true;
                            }
                            this.P = j;
                            if (this.I.isFakeDragging() || this.I.beginFakeDrag()) {
                                this.I.fakeDragBy(a);
                                return true;
                            }
                            return true;
                        }
                    }
                    if (!this.R) {
                        final int count = this.I.getAdapter().getCount();
                        final float n3 = (float)this.getWidth();
                        final float n4 = n3 / 2.0f;
                        final float n5 = n3 / 6.0f;
                        if (this.K > 0 && motionEvent.getX() < n4 - n5) {
                            if (n2 != 3) {
                                this.I.setCurrentItem(this.K - 1);
                            }
                            return true;
                        }
                        if (this.K < count - 1 && motionEvent.getX() > n4 + n5) {
                            if (n2 != 3) {
                                this.I.setCurrentItem(this.K + 1);
                            }
                            return true;
                        }
                    }
                    this.R = false;
                    this.Q = -1;
                    if (this.I.isFakeDragging()) {
                        this.I.endFakeDrag();
                        return true;
                    }
                    return true;
                }
                else {
                    this.Q = r.h(motionEvent, 0);
                    p = motionEvent.getX();
                }
            }
            this.P = p;
            return true;
        }
        return false;
    }
    
    public void setCentered(final boolean l) {
        this.L = l;
        this.invalidate();
    }
    
    public void setCurrentItem(final int n) {
        final ViewPager i = this.I;
        if (i != null) {
            i.setCurrentItem(n);
            this.K = n;
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setGapWidth(final float n) {
        this.N = n;
        this.invalidate();
    }
    
    public void setLineWidth(final float m) {
        this.M = m;
        this.invalidate();
    }
    
    public void setOnPageChangeListener(final ViewPager$j j) {
        this.J = j;
    }
    
    public void setSelectedColor(final int color) {
        this.H.setColor(color);
        this.invalidate();
    }
    
    public void setStrokeWidth(final float n) {
        this.H.setStrokeWidth(n);
        this.G.setStrokeWidth(n);
        this.invalidate();
    }
    
    public void setUnselectedColor(final int color) {
        this.G.setColor(color);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager i) {
        final ViewPager j = this.I;
        if (j == i) {
            return;
        }
        if (j != null) {
            j.setOnPageChangeListener((ViewPager$j)null);
        }
        if (i.getAdapter() != null) {
            (this.I = i).setOnPageChangeListener((ViewPager$j)this);
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    
    static class b extends View$BaseSavedState
    {
        public static final Parcelable$Creator<b> CREATOR;
        int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<b>() {
                public b a(final Parcel parcel) {
                    return new b(parcel);
                }
                
                public b[] b(final int n) {
                    return new b[n];
                }
            };
        }
        
        private b(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
        }
        
        public b(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
        }
    }
}
