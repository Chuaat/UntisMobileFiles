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
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager;
import android.graphics.Paint;
import android.view.View;

public class CirclePageIndicator extends View implements f
{
    private static final int a0 = -1;
    private float G;
    private final Paint H;
    private final Paint I;
    private final Paint J;
    private ViewPager K;
    private ViewPager$j L;
    private int M;
    private int N;
    private float O;
    private int P;
    private int Q;
    private boolean R;
    private boolean S;
    private int T;
    private float U;
    private int V;
    private boolean W;
    
    public CirclePageIndicator(final Context context) {
        this(context, null);
    }
    
    public CirclePageIndicator(final Context context, final AttributeSet set) {
        this(context, set, g.a.z);
    }
    
    public CirclePageIndicator(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        final Paint h = new Paint(1);
        this.H = h;
        final Paint i = new Paint(1);
        this.I = i;
        final Paint j = new Paint(1);
        this.J = j;
        this.U = -1.0f;
        this.V = -1;
        if (this.isInEditMode()) {
            return;
        }
        final Resources resources = this.getResources();
        final int color = resources.getColor(g.c.b);
        final int color2 = resources.getColor(g.c.a);
        final int integer = resources.getInteger(g.g.a);
        final int color3 = resources.getColor(g.c.c);
        final float dimension = resources.getDimension(g.d.b);
        final float dimension2 = resources.getDimension(g.d.a);
        final boolean boolean1 = resources.getBoolean(g.b.a);
        final boolean boolean2 = resources.getBoolean(g.b.b);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, g.i.a, n, 0);
        this.R = obtainStyledAttributes.getBoolean(g.i.d, boolean1);
        this.Q = obtainStyledAttributes.getInt(g.i.b, integer);
        h.setStyle(Paint$Style.FILL);
        h.setColor(obtainStyledAttributes.getColor(g.i.f, color));
        i.setStyle(Paint$Style.STROKE);
        i.setColor(obtainStyledAttributes.getColor(g.i.i, color3));
        i.setStrokeWidth(obtainStyledAttributes.getDimension(g.i.j, dimension));
        j.setStyle(Paint$Style.FILL);
        j.setColor(obtainStyledAttributes.getColor(g.i.e, color2));
        this.G = obtainStyledAttributes.getDimension(g.i.g, dimension2);
        this.S = obtainStyledAttributes.getBoolean(g.i.h, boolean2);
        final Drawable drawable = obtainStyledAttributes.getDrawable(g.i.c);
        if (drawable != null) {
            this.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.T = k0.d(ViewConfiguration.get(context));
    }
    
    private int d(int a) {
        final int mode = View$MeasureSpec.getMode(a);
        final int b = a = View$MeasureSpec.getSize(a);
        if (mode != 1073741824) {
            final ViewPager k = this.K;
            if (k == null) {
                a = b;
            }
            else {
                a = k.getAdapter().getCount();
                final float n = (float)(this.getPaddingLeft() + this.getPaddingRight());
                final float n2 = (float)(a * 2);
                final float g = this.G;
                a = (int)(n + n2 * g + (a - 1) * g + 1.0f);
                if (mode == Integer.MIN_VALUE) {
                    a = Math.min(a, b);
                }
            }
        }
        return a;
    }
    
    private int f(int b) {
        final int mode = View$MeasureSpec.getMode(b);
        b = View$MeasureSpec.getSize(b);
        if (mode != 1073741824) {
            final int a = (int)(this.G * 2.0f + this.getPaddingTop() + this.getPaddingBottom() + 1.0f);
            if (mode == Integer.MIN_VALUE) {
                b = Math.min(a, b);
            }
            else {
                b = a;
            }
        }
        return b;
    }
    
    public boolean a() {
        return this.R;
    }
    
    public void b(final int m, final float o, final int n) {
        this.M = m;
        this.O = o;
        this.invalidate();
        final ViewPager$j l = this.L;
        if (l != null) {
            l.b(m, o, n);
        }
    }
    
    public boolean c() {
        return this.S;
    }
    
    public void e() {
        this.invalidate();
    }
    
    public int getFillColor() {
        return this.J.getColor();
    }
    
    public int getOrientation() {
        return this.Q;
    }
    
    public int getPageColor() {
        return this.H.getColor();
    }
    
    public float getRadius() {
        return this.G;
    }
    
    public int getStrokeColor() {
        return this.I.getColor();
    }
    
    public float getStrokeWidth() {
        return this.I.getStrokeWidth();
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int p) {
        this.P = p;
        final ViewPager$j l = this.L;
        if (l != null) {
            l.k(p);
        }
    }
    
    public void l(final int n) {
        if (this.S || this.P == 0) {
            this.M = n;
            this.N = n;
            this.invalidate();
        }
        final ViewPager$j l = this.L;
        if (l != null) {
            l.l(n);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final ViewPager k = this.K;
        if (k == null) {
            return;
        }
        final int count = k.getAdapter().getCount();
        if (count == 0) {
            return;
        }
        if (this.M >= count) {
            this.setCurrentItem(count - 1);
            return;
        }
        int n;
        int n2;
        int n3;
        int n4;
        if (this.Q == 0) {
            n = this.getWidth();
            n2 = this.getPaddingLeft();
            n3 = this.getPaddingRight();
            n4 = this.getPaddingTop();
        }
        else {
            n = this.getHeight();
            n2 = this.getPaddingTop();
            n3 = this.getPaddingBottom();
            n4 = this.getPaddingLeft();
        }
        final float g = this.G;
        final float n5 = 3.0f * g;
        final float n6 = n4 + g;
        float n8;
        final float n7 = n8 = n2 + g;
        if (this.R) {
            n8 = n7 + ((n - n2 - n3) / 2.0f - count * n5 / 2.0f);
        }
        float n9 = g;
        if (this.I.getStrokeWidth() > 0.0f) {
            n9 = g - this.I.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; ++i) {
            float n10 = i * n5 + n8;
            float n11;
            if (this.Q == 0) {
                n11 = n6;
            }
            else {
                n11 = n10;
                n10 = n6;
            }
            if (this.H.getAlpha() > 0) {
                canvas.drawCircle(n10, n11, n9, this.H);
            }
            final float g2 = this.G;
            if (n9 != g2) {
                canvas.drawCircle(n10, n11, g2, this.I);
            }
        }
        final boolean s = this.S;
        int n12;
        if (s) {
            n12 = this.N;
        }
        else {
            n12 = this.M;
        }
        float n13 = n12 * n5;
        if (!s) {
            n13 += this.O * n5;
        }
        final int q = this.Q;
        final float n14 = n8 + n13;
        float n15 = n6;
        float n16 = n14;
        if (q == 0) {
            n16 = n6;
            n15 = n14;
        }
        canvas.drawCircle(n15, n16, this.G, this.J);
    }
    
    protected void onMeasure(int n, int n2) {
        if (this.Q == 0) {
            n = this.d(n);
            n2 = this.f(n2);
        }
        else {
            n = this.f(n);
            n2 = this.d(n2);
        }
        this.setMeasuredDimension(n, n2);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final b b = (b)parcelable;
        super.onRestoreInstanceState(b.getSuperState());
        final int g = b.G;
        this.M = g;
        this.N = g;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final b b = new b(super.onSaveInstanceState());
        b.G = this.M;
        return (Parcelable)b;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        final ViewPager k = this.K;
        int n = 0;
        if (k != null && k.getAdapter().getCount() != 0) {
            final int n2 = motionEvent.getAction() & 0xFF;
            float u = 0.0f;
            Label_0424: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 == 5) {
                                    final int b = r.b(motionEvent);
                                    this.U = r.j(motionEvent, b);
                                    this.V = r.h(motionEvent, b);
                                    return true;
                                }
                                if (n2 != 6) {
                                    return true;
                                }
                                final int b2 = r.b(motionEvent);
                                if (r.h(motionEvent, b2) == this.V) {
                                    if (b2 == 0) {
                                        n = 1;
                                    }
                                    this.V = r.h(motionEvent, n);
                                }
                                u = r.j(motionEvent, r.a(motionEvent, this.V));
                                break Label_0424;
                            }
                        }
                        else {
                            final float j = r.j(motionEvent, r.a(motionEvent, this.V));
                            final float a = j - this.U;
                            if (!this.W && Math.abs(a) > this.T) {
                                this.W = true;
                            }
                            if (!this.W) {
                                return true;
                            }
                            this.U = j;
                            if (this.K.isFakeDragging() || this.K.beginFakeDrag()) {
                                this.K.fakeDragBy(a);
                                return true;
                            }
                            return true;
                        }
                    }
                    if (!this.W) {
                        final int count = this.K.getAdapter().getCount();
                        final float n3 = (float)this.getWidth();
                        final float n4 = n3 / 2.0f;
                        final float n5 = n3 / 6.0f;
                        if (this.M > 0 && motionEvent.getX() < n4 - n5) {
                            if (n2 != 3) {
                                this.K.setCurrentItem(this.M - 1);
                            }
                            return true;
                        }
                        if (this.M < count - 1 && motionEvent.getX() > n4 + n5) {
                            if (n2 != 3) {
                                this.K.setCurrentItem(this.M + 1);
                            }
                            return true;
                        }
                    }
                    this.W = false;
                    this.V = -1;
                    if (this.K.isFakeDragging()) {
                        this.K.endFakeDrag();
                        return true;
                    }
                    return true;
                }
                else {
                    this.V = r.h(motionEvent, 0);
                    u = motionEvent.getX();
                }
            }
            this.U = u;
            return true;
        }
        return false;
    }
    
    public void setCentered(final boolean r) {
        this.R = r;
        this.invalidate();
    }
    
    public void setCurrentItem(final int n) {
        final ViewPager k = this.K;
        if (k != null) {
            k.setCurrentItem(n);
            this.M = n;
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setFillColor(final int color) {
        this.J.setColor(color);
        this.invalidate();
    }
    
    public void setOnPageChangeListener(final ViewPager$j l) {
        this.L = l;
    }
    
    public void setOrientation(final int q) {
        if (q != 0 && q != 1) {
            throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
        this.Q = q;
        this.requestLayout();
    }
    
    public void setPageColor(final int color) {
        this.H.setColor(color);
        this.invalidate();
    }
    
    public void setRadius(final float g) {
        this.G = g;
        this.invalidate();
    }
    
    public void setSnap(final boolean s) {
        this.S = s;
        this.invalidate();
    }
    
    public void setStrokeColor(final int color) {
        this.I.setColor(color);
        this.invalidate();
    }
    
    public void setStrokeWidth(final float strokeWidth) {
        this.I.setStrokeWidth(strokeWidth);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager k) {
        final ViewPager i = this.K;
        if (i == k) {
            return;
        }
        if (i != null) {
            i.setOnPageChangeListener((ViewPager$j)null);
        }
        if (k.getAdapter() != null) {
            (this.K = k).setOnPageChangeListener((ViewPager$j)this);
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
