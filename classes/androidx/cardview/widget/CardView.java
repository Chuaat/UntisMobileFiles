// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cardview.widget;

import androidx.annotation.l;
import android.view.View$MeasureSpec;
import androidx.annotation.n0;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.util.AttributeSet;
import androidx.annotation.j0;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Rect;
import android.widget.FrameLayout;

public class CardView extends FrameLayout
{
    private static final int[] N;
    private static final e O;
    private boolean G;
    private boolean H;
    int I;
    int J;
    final Rect K;
    final Rect L;
    private final d M;
    
    static {
        N = new int[] { 16842801 };
        final int sdk_INT = Build$VERSION.SDK_INT;
        e o;
        if (sdk_INT >= 21) {
            o = new b();
        }
        else if (sdk_INT >= 17) {
            o = new a();
        }
        else {
            o = new c();
        }
        (O = o).j();
    }
    
    public CardView(@j0 final Context context) {
        this(context, null);
    }
    
    public CardView(@j0 final Context context, @k0 final AttributeSet set) {
        this(context, set, i.a.a.g);
    }
    
    public CardView(@j0 final Context context, @k0 final AttributeSet set, int n) {
        super(context, set, n);
        final Rect k = new Rect();
        this.K = k;
        this.L = new Rect();
        final d m = new d() {
            private Drawable a;
            
            @Override
            public void a(final int n, final int n2, final int n3, final int n4) {
                CardView.this.L.set(n, n2, n3, n4);
                final CardView b = CardView.this;
                final Rect k = b.K;
                CardView.e(b, n + k.left, n2 + k.top, n3 + k.right, n4 + k.bottom);
            }
            
            @Override
            public void b(final int n, final int n2) {
                final CardView b = CardView.this;
                if (n > b.I) {
                    CardView.f(b, n);
                }
                final CardView b2 = CardView.this;
                if (n2 > b2.J) {
                    CardView.g(b2, n2);
                }
            }
            
            @Override
            public void c(final Drawable drawable) {
                this.a = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }
            
            @Override
            public boolean d() {
                return CardView.this.getPreventCornerOverlap();
            }
            
            @Override
            public boolean e() {
                return CardView.this.getUseCompatPadding();
            }
            
            @Override
            public Drawable f() {
                return this.a;
            }
            
            @Override
            public View g() {
                return (View)CardView.this;
            }
        };
        this.M = m;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, i.a.e.a, n, i.a.d.b);
        n = i.a.e.d;
        ColorStateList list;
        if (obtainStyledAttributes.hasValue(n)) {
            list = obtainStyledAttributes.getColorStateList(n);
        }
        else {
            final TypedArray obtainStyledAttributes2 = this.getContext().obtainStyledAttributes(CardView.N);
            n = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            final float[] array = new float[3];
            Color.colorToHSV(n, array);
            Resources resources;
            if (array[2] > 0.5f) {
                resources = this.getResources();
                n = i.a.b.b;
            }
            else {
                resources = this.getResources();
                n = i.a.b.a;
            }
            list = ColorStateList.valueOf(resources.getColor(n));
        }
        final float dimension = obtainStyledAttributes.getDimension(i.a.e.e, 0.0f);
        final float dimension2 = obtainStyledAttributes.getDimension(i.a.e.f, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(i.a.e.g, 0.0f);
        this.G = obtainStyledAttributes.getBoolean(i.a.e.i, false);
        this.H = obtainStyledAttributes.getBoolean(i.a.e.h, true);
        n = obtainStyledAttributes.getDimensionPixelSize(i.a.e.j, 0);
        k.left = obtainStyledAttributes.getDimensionPixelSize(i.a.e.l, n);
        k.top = obtainStyledAttributes.getDimensionPixelSize(i.a.e.n, n);
        k.right = obtainStyledAttributes.getDimensionPixelSize(i.a.e.m, n);
        k.bottom = obtainStyledAttributes.getDimensionPixelSize(i.a.e.k, n);
        if (dimension2 > dimension3) {
            dimension3 = dimension2;
        }
        this.I = obtainStyledAttributes.getDimensionPixelSize(i.a.e.b, 0);
        this.J = obtainStyledAttributes.getDimensionPixelSize(i.a.e.c, 0);
        obtainStyledAttributes.recycle();
        CardView.O.a(m, context, list, dimension, dimension2, dimension3);
    }
    
    static /* synthetic */ void e(final CardView cardView, final int n, final int n2, final int n3, final int n4) {
        cardView.setPadding(n, n2, n3, n4);
    }
    
    static /* synthetic */ void f(final CardView cardView, final int minimumWidth) {
        cardView.setMinimumWidth(minimumWidth);
    }
    
    static /* synthetic */ void g(final CardView cardView, final int minimumHeight) {
        cardView.setMinimumHeight(minimumHeight);
    }
    
    @j0
    public ColorStateList getCardBackgroundColor() {
        return CardView.O.h(this.M);
    }
    
    public float getCardElevation() {
        return CardView.O.c(this.M);
    }
    
    @n0
    public int getContentPaddingBottom() {
        return this.K.bottom;
    }
    
    @n0
    public int getContentPaddingLeft() {
        return this.K.left;
    }
    
    @n0
    public int getContentPaddingRight() {
        return this.K.right;
    }
    
    @n0
    public int getContentPaddingTop() {
        return this.K.top;
    }
    
    public float getMaxCardElevation() {
        return CardView.O.g(this.M);
    }
    
    public boolean getPreventCornerOverlap() {
        return this.H;
    }
    
    public float getRadius() {
        return CardView.O.d(this.M);
    }
    
    public boolean getUseCompatPadding() {
        return this.G;
    }
    
    public void h(@n0 final int n, @n0 final int n2, @n0 final int n3, @n0 final int n4) {
        this.K.set(n, n2, n3, n4);
        CardView.O.i(this.M);
    }
    
    protected void onMeasure(int measureSpec, final int n) {
        final e o = CardView.O;
        int n2 = measureSpec;
        int measureSpec2 = n;
        if (!(o instanceof b)) {
            final int mode = View$MeasureSpec.getMode(measureSpec);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                measureSpec = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(o.l(this.M)), View$MeasureSpec.getSize(measureSpec)), mode);
            }
            final int mode2 = View$MeasureSpec.getMode(n);
            if (mode2 != Integer.MIN_VALUE && mode2 != 1073741824) {
                n2 = measureSpec;
                measureSpec2 = n;
            }
            else {
                measureSpec2 = View$MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(o.k(this.M)), View$MeasureSpec.getSize(n)), mode2);
                n2 = measureSpec;
            }
        }
        super.onMeasure(n2, measureSpec2);
    }
    
    public void setCardBackgroundColor(@l final int n) {
        CardView.O.n(this.M, ColorStateList.valueOf(n));
    }
    
    public void setCardBackgroundColor(@k0 final ColorStateList list) {
        CardView.O.n(this.M, list);
    }
    
    public void setCardElevation(final float n) {
        CardView.O.f(this.M, n);
    }
    
    public void setMaxCardElevation(final float n) {
        CardView.O.o(this.M, n);
    }
    
    public void setMinimumHeight(final int j) {
        super.setMinimumHeight(this.J = j);
    }
    
    public void setMinimumWidth(final int i) {
        super.setMinimumWidth(this.I = i);
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
    }
    
    public void setPreventCornerOverlap(final boolean h) {
        if (h != this.H) {
            this.H = h;
            CardView.O.m(this.M);
        }
    }
    
    public void setRadius(final float n) {
        CardView.O.b(this.M, n);
    }
    
    public void setUseCompatPadding(final boolean g) {
        if (this.G != g) {
            this.G = g;
            CardView.O.e(this.M);
        }
    }
}
