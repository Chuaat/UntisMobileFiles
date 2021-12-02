// 
// Decompiled by Procyon v0.5.36
// 

package androidx.viewpager.widget;

import java.util.Locale;
import android.text.method.SingleLineTransformationMethod;
import androidx.annotation.l;
import androidx.annotation.t;
import android.view.ViewParent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import android.database.DataSetObserver;
import android.text.method.TransformationMethod;
import android.content.res.TypedArray;
import android.text.TextUtils$TruncateAt;
import androidx.core.widget.r;
import android.view.View;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.widget.TextView;
import android.view.ViewGroup;

@ViewPager.e
public class c extends ViewGroup
{
    private static final int[] U;
    private static final int[] V;
    private static final float W = 0.6f;
    private static final int a0 = 16;
    ViewPager G;
    TextView H;
    TextView I;
    TextView J;
    private int K;
    float L;
    private int M;
    private int N;
    private boolean O;
    private boolean P;
    private final a Q;
    private WeakReference<androidx.viewpager.widget.a> R;
    private int S;
    int T;
    
    static {
        U = new int[] { 16842804, 16842901, 16842904, 16842927 };
        V = new int[] { 16843660 };
    }
    
    public c(@j0 final Context context) {
        this(context, null);
    }
    
    public c(@j0 final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.K = -1;
        this.L = -1.0f;
        this.Q = new a();
        this.addView((View)(this.H = new TextView(context)));
        this.addView((View)(this.I = new TextView(context)));
        this.addView((View)(this.J = new TextView(context)));
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.U);
        boolean boolean1 = false;
        final int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            r.E(this.H, resourceId);
            r.E(this.I, resourceId);
            r.E(this.J, resourceId);
        }
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            this.a(0, (float)dimensionPixelSize);
        }
        if (obtainStyledAttributes.hasValue(2)) {
            final int color = obtainStyledAttributes.getColor(2, 0);
            this.H.setTextColor(color);
            this.I.setTextColor(color);
            this.J.setTextColor(color);
        }
        this.N = obtainStyledAttributes.getInteger(3, 80);
        obtainStyledAttributes.recycle();
        this.T = this.I.getTextColors().getDefaultColor();
        this.setNonPrimaryAlpha(0.6f);
        this.H.setEllipsize(TextUtils$TruncateAt.END);
        this.I.setEllipsize(TextUtils$TruncateAt.END);
        this.J.setEllipsize(TextUtils$TruncateAt.END);
        if (resourceId != 0) {
            final TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, c.V);
            boolean1 = obtainStyledAttributes2.getBoolean(0, false);
            obtainStyledAttributes2.recycle();
        }
        final TextView h = this.H;
        if (boolean1) {
            setSingleLineAllCaps(h);
            setSingleLineAllCaps(this.I);
            setSingleLineAllCaps(this.J);
        }
        else {
            h.setSingleLine();
            this.I.setSingleLine();
            this.J.setSingleLine();
        }
        this.M = (int)(context.getResources().getDisplayMetrics().density * 16.0f);
    }
    
    private static void setSingleLineAllCaps(final TextView textView) {
        textView.setTransformationMethod((TransformationMethod)new b(textView.getContext()));
    }
    
    public void a(final int n, final float n2) {
        this.H.setTextSize(n, n2);
        this.I.setTextSize(n, n2);
        this.J.setTextSize(n, n2);
    }
    
    void b(final androidx.viewpager.widget.a a, final androidx.viewpager.widget.a referent) {
        if (a != null) {
            a.unregisterDataSetObserver(this.Q);
            this.R = null;
        }
        if (referent != null) {
            referent.registerDataSetObserver(this.Q);
            this.R = new WeakReference<androidx.viewpager.widget.a>(referent);
        }
        final ViewPager g = this.G;
        if (g != null) {
            this.K = -1;
            this.L = -1.0f;
            this.c(g.getCurrentItem(), referent);
            this.requestLayout();
        }
    }
    
    void c(final int k, final androidx.viewpager.widget.a a) {
        int count;
        if (a != null) {
            count = a.getCount();
        }
        else {
            count = 0;
        }
        this.O = true;
        final CharSequence charSequence = null;
        CharSequence pageTitle;
        if (k >= 1 && a != null) {
            pageTitle = a.getPageTitle(k - 1);
        }
        else {
            pageTitle = null;
        }
        this.H.setText(pageTitle);
        final TextView i = this.I;
        CharSequence pageTitle2;
        if (a != null && k < count) {
            pageTitle2 = a.getPageTitle(k);
        }
        else {
            pageTitle2 = null;
        }
        i.setText(pageTitle2);
        final int n = k + 1;
        CharSequence pageTitle3 = charSequence;
        if (n < count) {
            pageTitle3 = charSequence;
            if (a != null) {
                pageTitle3 = a.getPageTitle(n);
            }
        }
        this.J.setText(pageTitle3);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max(0, (int)((this.getWidth() - this.getPaddingLeft() - this.getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.max(0, this.getHeight() - this.getPaddingTop() - this.getPaddingBottom()), Integer.MIN_VALUE);
        this.H.measure(measureSpec, measureSpec2);
        this.I.measure(measureSpec, measureSpec2);
        this.J.measure(measureSpec, measureSpec2);
        this.K = k;
        if (!this.P) {
            this.d(k, this.L, false);
        }
        this.O = false;
    }
    
    void d(int paddingTop, final float l, final boolean b) {
        if (paddingTop != this.K) {
            this.c(paddingTop, this.G.getAdapter());
        }
        else if (!b && l == this.L) {
            return;
        }
        this.P = true;
        final int measuredWidth = this.H.getMeasuredWidth();
        final int measuredWidth2 = this.I.getMeasuredWidth();
        final int measuredWidth3 = this.J.getMeasuredWidth();
        final int n = measuredWidth2 / 2;
        final int width = this.getWidth();
        final int height = this.getHeight();
        final int paddingLeft = this.getPaddingLeft();
        final int paddingRight = this.getPaddingRight();
        paddingTop = this.getPaddingTop();
        final int paddingBottom = this.getPaddingBottom();
        final int n2 = paddingRight + n;
        float n4;
        final float n3 = n4 = 0.5f + l;
        if (n3 > 1.0f) {
            n4 = n3 - 1.0f;
        }
        final int n5 = width - n2 - (int)((width - (paddingLeft + n) - n2) * n4) - n;
        final int n6 = measuredWidth2 + n5;
        final int baseline = this.H.getBaseline();
        final int baseline2 = this.I.getBaseline();
        final int baseline3 = this.J.getBaseline();
        final int max = Math.max(Math.max(baseline, baseline2), baseline3);
        final int n7 = max - baseline;
        final int n8 = max - baseline2;
        final int n9 = max - baseline3;
        final int max2 = Math.max(Math.max(this.H.getMeasuredHeight() + n7, this.I.getMeasuredHeight() + n8), this.J.getMeasuredHeight() + n9);
        final int n10 = this.N & 0x70;
        int n11 = 0;
        int n12 = 0;
        Label_0372: {
            if (n10 != 16) {
                if (n10 != 80) {
                    n11 = n7 + paddingTop;
                    n12 = n8 + paddingTop;
                    paddingTop += n9;
                    break Label_0372;
                }
                paddingTop = height - paddingBottom - max2;
            }
            else {
                paddingTop = (height - paddingTop - paddingBottom - max2) / 2;
            }
            n11 = n7 + paddingTop;
            n12 = n8 + paddingTop;
            paddingTop += n9;
        }
        final TextView i = this.I;
        i.layout(n5, n12, n6, i.getMeasuredHeight() + n12);
        final int min = Math.min(paddingLeft, n5 - this.M - measuredWidth);
        final TextView h = this.H;
        h.layout(min, n11, measuredWidth + min, h.getMeasuredHeight() + n11);
        final int max3 = Math.max(width - paddingRight - measuredWidth3, n6 + this.M);
        final TextView j = this.J;
        j.layout(max3, paddingTop, max3 + measuredWidth3, j.getMeasuredHeight() + paddingTop);
        this.L = l;
        this.P = false;
    }
    
    int getMinHeight() {
        final Drawable background = this.getBackground();
        int intrinsicHeight;
        if (background != null) {
            intrinsicHeight = background.getIntrinsicHeight();
        }
        else {
            intrinsicHeight = 0;
        }
        return intrinsicHeight;
    }
    
    public int getTextSpacing() {
        return this.M;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        final ViewParent parent = this.getParent();
        if (parent instanceof ViewPager) {
            final ViewPager g = (ViewPager)parent;
            final androidx.viewpager.widget.a adapter = g.getAdapter();
            g.setInternalPageChangeListener((ViewPager.j)this.Q);
            g.addOnAdapterChangeListener((ViewPager.i)this.Q);
            this.G = g;
            final WeakReference<androidx.viewpager.widget.a> r = this.R;
            androidx.viewpager.widget.a a;
            if (r != null) {
                a = r.get();
            }
            else {
                a = null;
            }
            this.b(a, adapter);
            return;
        }
        throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
    }
    
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        final ViewPager g = this.G;
        if (g != null) {
            this.b(g.getAdapter(), null);
            this.G.setInternalPageChangeListener(null);
            this.G.removeOnAdapterChangeListener((ViewPager.i)this.Q);
            this.G = null;
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        if (this.G != null) {
            float l = this.L;
            if (l < 0.0f) {
                l = 0.0f;
            }
            this.d(this.K, l, true);
        }
    }
    
    protected void onMeasure(int n, final int n2) {
        if (View$MeasureSpec.getMode(n) == 1073741824) {
            final int n3 = this.getPaddingTop() + this.getPaddingBottom();
            final int childMeasureSpec = ViewGroup.getChildMeasureSpec(n2, n3, -2);
            final int size = View$MeasureSpec.getSize(n);
            n = ViewGroup.getChildMeasureSpec(n, (int)(size * 0.2f), -2);
            this.H.measure(n, childMeasureSpec);
            this.I.measure(n, childMeasureSpec);
            this.J.measure(n, childMeasureSpec);
            if (View$MeasureSpec.getMode(n2) == 1073741824) {
                n = View$MeasureSpec.getSize(n2);
            }
            else {
                n = this.I.getMeasuredHeight();
                n = Math.max(this.getMinHeight(), n + n3);
            }
            this.setMeasuredDimension(size, View.resolveSizeAndState(n, n2, this.I.getMeasuredState() << 16));
            return;
        }
        throw new IllegalStateException("Must measure with an exact width");
    }
    
    public void requestLayout() {
        if (!this.O) {
            super.requestLayout();
        }
    }
    
    public void setGravity(final int n) {
        this.N = n;
        this.requestLayout();
    }
    
    public void setNonPrimaryAlpha(@t(from = 0.0, to = 1.0) final float n) {
        final int s = (int)(n * 255.0f) & 0xFF;
        this.S = s;
        final int n2 = s << 24 | (this.T & 0xFFFFFF);
        this.H.setTextColor(n2);
        this.J.setTextColor(n2);
    }
    
    public void setTextColor(@l int n) {
        this.T = n;
        this.I.setTextColor(n);
        n = (this.S << 24 | (this.T & 0xFFFFFF));
        this.H.setTextColor(n);
        this.J.setTextColor(n);
    }
    
    public void setTextSpacing(final int m) {
        this.M = m;
        this.requestLayout();
    }
    
    private class a extends DataSetObserver implements j, i
    {
        private int G;
        
        a() {
        }
        
        public void a(final ViewPager viewPager, final androidx.viewpager.widget.a a, final androidx.viewpager.widget.a a2) {
            c.this.b(a, a2);
        }
        
        public void b(final int n, final float n2, int n3) {
            n3 = n;
            if (n2 > 0.5f) {
                n3 = n + 1;
            }
            c.this.d(n3, n2, false);
        }
        
        public void k(final int g) {
            this.G = g;
        }
        
        public void l(final int n) {
            if (this.G == 0) {
                final c h = c.this;
                h.c(h.G.getCurrentItem(), c.this.G.getAdapter());
                final c h2 = c.this;
                float l = h2.L;
                if (l < 0.0f) {
                    l = 0.0f;
                }
                h2.d(h2.G.getCurrentItem(), l, true);
            }
        }
        
        public void onChanged() {
            final c h = c.this;
            h.c(h.G.getCurrentItem(), c.this.G.getAdapter());
            final c h2 = c.this;
            float l = h2.L;
            if (l < 0.0f) {
                l = 0.0f;
            }
            h2.d(h2.G.getCurrentItem(), l, true);
        }
    }
    
    private static class b extends SingleLineTransformationMethod
    {
        private Locale G;
        
        b(final Context context) {
            this.G = context.getResources().getConfiguration().locale;
        }
        
        public CharSequence getTransformation(CharSequence transformation, final View view) {
            transformation = super.getTransformation(transformation, view);
            String upperCase;
            if (transformation != null) {
                upperCase = transformation.toString().toUpperCase(this.G);
            }
            else {
                upperCase = null;
            }
            return upperCase;
        }
    }
}
