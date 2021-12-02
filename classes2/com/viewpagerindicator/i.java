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
import android.view.View$MeasureSpec;
import android.graphics.Canvas;
import android.graphics.Typeface;
import java.util.ArrayList;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.content.res.Resources;
import androidx.core.view.k0;
import android.view.ViewConfiguration;
import android.graphics.Paint$Style;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Path;
import android.graphics.Paint;
import androidx.viewpager.widget.ViewPager$j;
import androidx.viewpager.widget.ViewPager;
import android.view.View;

public class i extends View implements f
{
    private static final float k0 = 0.25f;
    private static final float l0 = 0.05f;
    private static final String m0 = "";
    private static final int n0 = -1;
    private ViewPager G;
    private ViewPager$j H;
    private int I;
    private float J;
    private int K;
    private final Paint L;
    private boolean M;
    private int N;
    private int O;
    private Path P;
    private final Rect Q;
    private final Paint R;
    private b S;
    private c T;
    private final Paint U;
    private float V;
    private float W;
    private float a0;
    private float b0;
    private float c0;
    private float d0;
    private float e0;
    private int f0;
    private float g0;
    private int h0;
    private boolean i0;
    private d j0;
    
    public i(final Context context) {
        this(context, null);
    }
    
    public i(final Context context, final AttributeSet set) {
        this(context, set, g.a.D);
    }
    
    public i(final Context context, final AttributeSet set, int color) {
        super(context, set, color);
        this.I = -1;
        final Paint l = new Paint();
        this.L = l;
        this.P = new Path();
        this.Q = new Rect();
        final Paint r = new Paint();
        this.R = r;
        final Paint u = new Paint();
        this.U = u;
        this.g0 = -1.0f;
        this.h0 = -1;
        if (this.isInEditMode()) {
            return;
        }
        final Resources resources = this.getResources();
        final int color2 = resources.getColor(g.c.f);
        final float dimension = resources.getDimension(g.d.i);
        final int integer = resources.getInteger(g.g.b);
        final float dimension2 = resources.getDimension(g.d.g);
        final float dimension3 = resources.getDimension(g.d.h);
        final float dimension4 = resources.getDimension(g.d.j);
        final int integer2 = resources.getInteger(g.g.c);
        final int color3 = resources.getColor(g.c.g);
        final boolean boolean1 = resources.getBoolean(g.b.d);
        final int color4 = resources.getColor(g.c.h);
        final float dimension5 = resources.getDimension(g.d.k);
        final float dimension6 = resources.getDimension(g.d.l);
        final float dimension7 = resources.getDimension(g.d.f);
        final float dimension8 = resources.getDimension(g.d.m);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, g.i.s, color, 0);
        this.e0 = obtainStyledAttributes.getDimension(g.i.B, dimension);
        this.S = b.b(obtainStyledAttributes.getInteger(g.i.z, integer));
        this.V = obtainStyledAttributes.getDimension(g.i.y, dimension2);
        this.W = obtainStyledAttributes.getDimension(g.i.A, dimension3);
        this.a0 = obtainStyledAttributes.getDimension(g.i.C, dimension4);
        this.T = c.b(obtainStyledAttributes.getInteger(g.i.D, integer2));
        this.c0 = obtainStyledAttributes.getDimension(g.i.H, dimension8);
        this.b0 = obtainStyledAttributes.getDimension(g.i.G, dimension6);
        this.d0 = obtainStyledAttributes.getDimension(g.i.w, dimension7);
        this.O = obtainStyledAttributes.getColor(g.i.F, color3);
        this.N = obtainStyledAttributes.getColor(g.i.u, color4);
        this.M = obtainStyledAttributes.getBoolean(g.i.E, boolean1);
        final float dimension9 = obtainStyledAttributes.getDimension(g.i.t, dimension5);
        color = obtainStyledAttributes.getColor(g.i.x, color2);
        l.setTextSize(dimension9);
        l.setAntiAlias(true);
        r.setStyle(Paint$Style.FILL_AND_STROKE);
        r.setStrokeWidth(this.e0);
        r.setColor(color);
        u.setStyle(Paint$Style.FILL_AND_STROKE);
        u.setColor(color);
        final Drawable drawable = obtainStyledAttributes.getDrawable(g.i.v);
        if (drawable != null) {
            this.setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.f0 = androidx.core.view.k0.d(ViewConfiguration.get(context));
    }
    
    private Rect a(final int n, final Paint paint) {
        final Rect rect = new Rect();
        final CharSequence g = this.g(n);
        rect.right = (int)paint.measureText(g, 0, g.length());
        rect.bottom = (int)(paint.descent() - paint.ascent());
        return rect;
    }
    
    private ArrayList<Rect> c(final Paint paint) {
        final ArrayList<Rect> list = new ArrayList<Rect>();
        final int count = this.G.getAdapter().getCount();
        final int width = this.getWidth();
        final int n = width / 2;
        for (int i = 0; i < count; ++i) {
            final Rect a = this.a(i, paint);
            final int n2 = a.right - a.left;
            final int bottom = a.bottom;
            final int top = a.top;
            final int left = (int)(n - n2 / 2.0f + (i - this.I - this.J) * width);
            a.left = left;
            a.right = left + n2;
            a.top = 0;
            a.bottom = bottom - top;
            list.add(a);
        }
        return list;
    }
    
    private void d(final Rect rect, final float n, final int n2) {
        final float n3 = (float)n2;
        final float d0 = this.d0;
        rect.left = (int)(n3 + d0);
        rect.right = (int)(d0 + n);
    }
    
    private void f(final Rect rect, final float n, int right) {
        right -= (int)this.d0;
        rect.right = right;
        rect.left = (int)(right - n);
    }
    
    private CharSequence g(final int n) {
        CharSequence pageTitle;
        if ((pageTitle = this.G.getAdapter().getPageTitle(n)) == null) {
            pageTitle = "";
        }
        return pageTitle;
    }
    
    public void b(final int i, final float j, final int n) {
        this.I = i;
        this.J = j;
        this.invalidate();
        final ViewPager$j h = this.H;
        if (h != null) {
            h.b(i, j, n);
        }
    }
    
    public void e() {
        this.invalidate();
    }
    
    public float getClipPadding() {
        return this.d0;
    }
    
    public int getFooterColor() {
        return this.R.getColor();
    }
    
    public float getFooterIndicatorHeight() {
        return this.V;
    }
    
    public float getFooterIndicatorPadding() {
        return this.a0;
    }
    
    public b getFooterIndicatorStyle() {
        return this.S;
    }
    
    public float getFooterLineHeight() {
        return this.e0;
    }
    
    public c getLinePosition() {
        return this.T;
    }
    
    public int getSelectedColor() {
        return this.O;
    }
    
    public int getTextColor() {
        return this.N;
    }
    
    public float getTextSize() {
        return this.L.getTextSize();
    }
    
    public float getTitlePadding() {
        return this.b0;
    }
    
    public float getTopPadding() {
        return this.c0;
    }
    
    public Typeface getTypeface() {
        return this.L.getTypeface();
    }
    
    public boolean h() {
        return this.M;
    }
    
    public void j(final ViewPager viewPager, final int currentItem) {
        this.setViewPager(viewPager);
        this.setCurrentItem(currentItem);
    }
    
    public void k(final int k) {
        this.K = k;
        final ViewPager$j h = this.H;
        if (h != null) {
            h.k(k);
        }
    }
    
    public void l(final int i) {
        if (this.K == 0) {
            this.I = i;
            this.invalidate();
        }
        final ViewPager$j h = this.H;
        if (h != null) {
            h.l(i);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        final ViewPager g = this.G;
        if (g == null) {
            return;
        }
        final int count = g.getAdapter().getCount();
        if (count == 0) {
            return;
        }
        if (this.I == -1) {
            final ViewPager g2 = this.G;
            if (g2 != null) {
                this.I = g2.getCurrentItem();
            }
        }
        final ArrayList<Rect> c = this.c(this.L);
        final int size = c.size();
        if (this.I >= size) {
            this.setCurrentItem(size - 1);
            return;
        }
        final float n = this.getWidth() / 2.0f;
        final int left = this.getLeft();
        final float n2 = left + this.d0;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int n3 = left + width;
        final float n4 = n3 - this.d0;
        final int i = this.I;
        float j = this.J;
        int index;
        if (j <= 0.5) {
            index = i;
        }
        else {
            index = i + 1;
            j = 1.0f - j;
        }
        final boolean b = j <= 0.25f;
        final boolean b2 = j <= 0.05f;
        final float n5 = (0.25f - j) / 0.25f;
        final Rect rect = c.get(i);
        final int right = rect.right;
        final int left2 = rect.left;
        final float n6 = (float)(right - left2);
        if (left2 < n2) {
            this.d(rect, n6, left);
        }
        if (rect.right > n4) {
            this.f(rect, n6, n3);
        }
        int k = this.I;
        int n7 = width;
        int n8 = size;
        if (k > 0) {
            --k;
            final float n9 = n2;
            while (true) {
                n7 = width;
                n8 = size;
                if (k < 0) {
                    break;
                }
                final Rect rect2 = c.get(k);
                final int left3 = rect2.left;
                if (left3 < n9) {
                    final int n10 = rect2.right - left3;
                    this.d(rect2, (float)n10, left);
                    final Rect rect3 = c.get(k + 1);
                    final float n11 = (float)rect2.right;
                    final float b3 = this.b0;
                    final int left4 = rect3.left;
                    if (n11 + b3 > left4) {
                        final int left5 = (int)(left4 - n10 - b3);
                        rect2.left = left5;
                        rect2.right = left5 + n10;
                    }
                }
                --k;
            }
        }
        final int n12 = n7;
        int l = this.I;
        if (l < count - 1) {
            ++l;
            while (l < count) {
                final Rect rect4 = c.get(l);
                final int right2 = rect4.right;
                if (right2 > n4) {
                    final int n13 = right2 - rect4.left;
                    this.f(rect4, (float)n13, n3);
                    final Rect rect5 = c.get(l - 1);
                    final float n14 = (float)rect4.left;
                    final float b4 = this.b0;
                    final int right3 = rect5.right;
                    if (n14 - b4 < right3) {
                        final int left6 = (int)(right3 + b4);
                        rect4.left = left6;
                        rect4.right = left6 + n13;
                    }
                }
                ++l;
            }
        }
        final int n15 = this.N >>> 24;
        int index2 = 0;
        final int n16 = n3;
        while (index2 < count) {
            final Rect rect6 = c.get(index2);
            final int left7 = rect6.left;
            Label_1010: {
                if (left7 <= left || left7 >= n16) {
                    final int right4 = rect6.right;
                    if (right4 <= left || right4 >= n16) {
                        break Label_1010;
                    }
                }
                final boolean b5 = index2 == index;
                final CharSequence g3 = this.g(index2);
                this.L.setFakeBoldText(b5 && b2 && this.M);
                this.L.setColor(this.N);
                if (b5 && b) {
                    this.L.setAlpha(n15 - (int)(n15 * n5));
                }
                if (index2 < n8 - 1) {
                    final Rect rect7 = c.get(index2 + 1);
                    final int right5 = rect6.right;
                    final float n17 = (float)right5;
                    final float b6 = this.b0;
                    final int left8 = rect7.left;
                    if (n17 + b6 > left8) {
                        final int n18 = right5 - rect6.left;
                        final int left9 = (int)(left8 - n18 - b6);
                        rect6.left = left9;
                        rect6.right = left9 + n18;
                    }
                }
                canvas.drawText(g3, 0, g3.length(), (float)rect6.left, rect6.bottom + this.c0, this.L);
                if (b5 && b) {
                    this.L.setColor(this.O);
                    this.L.setAlpha((int)((this.O >>> 24) * n5));
                    canvas.drawText(g3, 0, g3.length(), (float)rect6.left, rect6.bottom + this.c0, this.L);
                }
            }
            ++index2;
        }
        float e0 = this.e0;
        float v = this.V;
        int n19;
        if (this.T == com.viewpagerindicator.i.c.I) {
            e0 = -e0;
            v = -v;
            n19 = 0;
        }
        else {
            n19 = height;
        }
        this.P.reset();
        final Path p = this.P;
        final float n20 = (float)n19;
        final float n21 = n20 - e0 / 2.0f;
        p.moveTo(0.0f, n21);
        this.P.lineTo((float)n12, n21);
        this.P.close();
        canvas.drawPath(this.P, this.R);
        final float n22 = n20 - e0;
        final int n23 = i$a.a[this.S.ordinal()];
        if (n23 != 1) {
            if (n23 == 2) {
                if (b) {
                    if (index < n8) {
                        final Rect rect8 = c.get(index);
                        final float n24 = (float)rect8.right;
                        final float w = this.W;
                        final float n25 = n24 + w;
                        final float n26 = rect8.left - w;
                        final float n27 = n22 - v;
                        this.P.reset();
                        this.P.moveTo(n26, n22);
                        this.P.lineTo(n25, n22);
                        this.P.lineTo(n25, n27);
                        this.P.lineTo(n26, n27);
                        this.P.close();
                        this.U.setAlpha((int)(n5 * 255.0f));
                        canvas.drawPath(this.P, this.U);
                        this.U.setAlpha(255);
                    }
                }
            }
        }
        else {
            this.P.reset();
            this.P.moveTo(n, n22 - v);
            this.P.lineTo(n + v, n22);
            this.P.lineTo(n - v, n22);
            this.P.close();
            canvas.drawPath(this.P, this.U);
        }
    }
    
    protected void onMeasure(int size, final int n) {
        size = View$MeasureSpec.getSize(size);
        float n2;
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            n2 = (float)View$MeasureSpec.getSize(n);
        }
        else {
            this.Q.setEmpty();
            this.Q.bottom = (int)(this.L.descent() - this.L.ascent());
            final Rect q = this.Q;
            n2 = q.bottom - q.top + this.e0 + this.a0 + this.c0;
            if (this.S != b.H) {
                n2 += this.V;
            }
        }
        this.setMeasuredDimension(size, (int)n2);
    }
    
    public void onRestoreInstanceState(final Parcelable parcelable) {
        final e e = (e)parcelable;
        super.onRestoreInstanceState(e.getSuperState());
        this.I = e.G;
        this.requestLayout();
    }
    
    public Parcelable onSaveInstanceState() {
        final e e = new e(super.onSaveInstanceState());
        e.G = this.I;
        return (Parcelable)e;
    }
    
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        final ViewPager g = this.G;
        int n = 0;
        if (g != null && g.getAdapter().getCount() != 0) {
            final int n2 = motionEvent.getAction() & 0xFF;
            float g2 = 0.0f;
            Label_0452: {
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 == 5) {
                                    final int b = r.b(motionEvent);
                                    this.g0 = r.j(motionEvent, b);
                                    this.h0 = r.h(motionEvent, b);
                                    return true;
                                }
                                if (n2 != 6) {
                                    return true;
                                }
                                final int b2 = r.b(motionEvent);
                                if (r.h(motionEvent, b2) == this.h0) {
                                    if (b2 == 0) {
                                        n = 1;
                                    }
                                    this.h0 = r.h(motionEvent, n);
                                }
                                g2 = r.j(motionEvent, r.a(motionEvent, this.h0));
                                break Label_0452;
                            }
                        }
                        else {
                            final float j = r.j(motionEvent, r.a(motionEvent, this.h0));
                            final float a = j - this.g0;
                            if (!this.i0 && Math.abs(a) > this.f0) {
                                this.i0 = true;
                            }
                            if (!this.i0) {
                                return true;
                            }
                            this.g0 = j;
                            if (this.G.isFakeDragging() || this.G.beginFakeDrag()) {
                                this.G.fakeDragBy(a);
                                return true;
                            }
                            return true;
                        }
                    }
                    if (!this.i0) {
                        final int count = this.G.getAdapter().getCount();
                        final float n3 = (float)this.getWidth();
                        final float n4 = n3 / 2.0f;
                        final float n5 = n3 / 6.0f;
                        final float x = motionEvent.getX();
                        if (x < n4 - n5) {
                            final int i = this.I;
                            if (i > 0) {
                                if (n2 != 3) {
                                    this.G.setCurrentItem(i - 1);
                                }
                                return true;
                            }
                        }
                        else if (x > n4 + n5) {
                            final int k = this.I;
                            if (k < count - 1) {
                                if (n2 != 3) {
                                    this.G.setCurrentItem(k + 1);
                                }
                                return true;
                            }
                        }
                        else {
                            final d j2 = this.j0;
                            if (j2 != null && n2 != 3) {
                                j2.a(this.I);
                            }
                        }
                    }
                    this.i0 = false;
                    this.h0 = -1;
                    if (this.G.isFakeDragging()) {
                        this.G.endFakeDrag();
                        return true;
                    }
                    return true;
                }
                else {
                    this.h0 = r.h(motionEvent, 0);
                    g2 = motionEvent.getX();
                }
            }
            this.g0 = g2;
            return true;
        }
        return false;
    }
    
    public void setClipPadding(final float d0) {
        this.d0 = d0;
        this.invalidate();
    }
    
    public void setCurrentItem(final int n) {
        final ViewPager g = this.G;
        if (g != null) {
            g.setCurrentItem(n);
            this.I = n;
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager has not been bound.");
    }
    
    public void setFooterColor(final int n) {
        this.R.setColor(n);
        this.U.setColor(n);
        this.invalidate();
    }
    
    public void setFooterIndicatorHeight(final float v) {
        this.V = v;
        this.invalidate();
    }
    
    public void setFooterIndicatorPadding(final float a0) {
        this.a0 = a0;
        this.invalidate();
    }
    
    public void setFooterIndicatorStyle(final b s) {
        this.S = s;
        this.invalidate();
    }
    
    public void setFooterLineHeight(final float n) {
        this.e0 = n;
        this.R.setStrokeWidth(n);
        this.invalidate();
    }
    
    public void setLinePosition(final c t) {
        this.T = t;
        this.invalidate();
    }
    
    public void setOnCenterItemClickListener(final d j0) {
        this.j0 = j0;
    }
    
    public void setOnPageChangeListener(final ViewPager$j h) {
        this.H = h;
    }
    
    public void setSelectedBold(final boolean m) {
        this.M = m;
        this.invalidate();
    }
    
    public void setSelectedColor(final int o) {
        this.O = o;
        this.invalidate();
    }
    
    public void setTextColor(final int n) {
        this.L.setColor(n);
        this.N = n;
        this.invalidate();
    }
    
    public void setTextSize(final float textSize) {
        this.L.setTextSize(textSize);
        this.invalidate();
    }
    
    public void setTitlePadding(final float b0) {
        this.b0 = b0;
        this.invalidate();
    }
    
    public void setTopPadding(final float c0) {
        this.c0 = c0;
        this.invalidate();
    }
    
    public void setTypeface(final Typeface typeface) {
        this.L.setTypeface(typeface);
        this.invalidate();
    }
    
    public void setViewPager(final ViewPager g) {
        final ViewPager g2 = this.G;
        if (g2 == g) {
            return;
        }
        if (g2 != null) {
            g2.setOnPageChangeListener((ViewPager$j)null);
        }
        if (g.getAdapter() != null) {
            (this.G = g).setOnPageChangeListener((ViewPager$j)this);
            this.invalidate();
            return;
        }
        throw new IllegalStateException("ViewPager does not have adapter instance.");
    }
    
    public enum b
    {
        H(0), 
        I(1), 
        J(2);
        
        public final int G;
        
        private b(final int g) {
            this.G = g;
        }
        
        public static b b(final int n) {
            for (final b b : values()) {
                if (b.G == n) {
                    return b;
                }
            }
            return null;
        }
    }
    
    public enum c
    {
        H(0), 
        I(1);
        
        public final int G;
        
        private c(final int g) {
            this.G = g;
        }
        
        public static c b(final int n) {
            for (final c c : values()) {
                if (c.G == n) {
                    return c;
                }
            }
            return null;
        }
    }
    
    public interface d
    {
        void a(final int p0);
    }
    
    static class e extends View$BaseSavedState
    {
        public static final Parcelable$Creator<e> CREATOR;
        int G;
        
        static {
            CREATOR = (Parcelable$Creator)new Parcelable$Creator<e>() {
                public e a(final Parcel parcel) {
                    return new e(parcel);
                }
                
                public e[] b(final int n) {
                    return new e[n];
                }
            };
        }
        
        private e(final Parcel parcel) {
            super(parcel);
            this.G = parcel.readInt();
        }
        
        public e(final Parcelable parcelable) {
            super(parcelable);
        }
        
        public void writeToParcel(final Parcel parcel, final int n) {
            super.writeToParcel(parcel, n);
            parcel.writeInt(this.G);
        }
    }
}
