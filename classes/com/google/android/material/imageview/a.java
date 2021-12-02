// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.imageview;

import android.graphics.Outline;
import android.view.View;
import android.graphics.Rect;
import android.annotation.TargetApi;
import androidx.annotation.n;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.graphics.Path$Direction;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.view.ViewOutlineProvider;
import android.os.Build$VERSION;
import android.graphics.Paint$Style;
import com.google.android.material.resources.c;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import androidx.annotation.q;
import com.google.android.material.shape.o;
import com.google.android.material.shape.j;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import com.google.android.material.shape.p;
import com.google.android.material.shape.s;
import androidx.appcompat.widget.AppCompatImageView;

public class a extends AppCompatImageView implements s
{
    private static final int d0;
    private static final int e0 = Integer.MIN_VALUE;
    private final p I;
    private final RectF J;
    private final RectF K;
    private final Paint L;
    private final Paint M;
    private final Path N;
    @k0
    private ColorStateList O;
    @k0
    private j P;
    private o Q;
    @q
    private float R;
    private Path S;
    @q
    private int T;
    @q
    private int U;
    @q
    private int V;
    @q
    private int W;
    @q
    private int a0;
    @q
    private int b0;
    private boolean c0;
    
    static {
        d0 = o2.a.n.lc;
    }
    
    public a(final Context context) {
        this(context, null, 0);
    }
    
    public a(final Context context, @k0 final AttributeSet set) {
        this(context, set, 0);
    }
    
    public a(Context context, @k0 final AttributeSet set, final int n) {
        final int d0 = a.d0;
        super(com.google.android.material.theme.overlay.a.c(context, set, n, d0), set, n);
        this.I = p.k();
        this.N = new Path();
        this.c0 = false;
        context = this.getContext();
        final Paint m = new Paint();
        (this.M = m).setAntiAlias(true);
        m.setColor(-1);
        m.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
        this.J = new RectF();
        this.K = new RectF();
        this.S = new Path();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, o2.a.o.Vp, n, d0);
        this.O = c.a(context, obtainStyledAttributes, o2.a.o.fq);
        this.R = (float)obtainStyledAttributes.getDimensionPixelSize(o2.a.o.gq, 0);
        final int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Wp, 0);
        this.T = dimensionPixelSize;
        this.U = dimensionPixelSize;
        this.V = dimensionPixelSize;
        this.W = dimensionPixelSize;
        this.T = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Zp, dimensionPixelSize);
        this.U = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.cq, dimensionPixelSize);
        this.V = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.aq, dimensionPixelSize);
        this.W = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Xp, dimensionPixelSize);
        this.a0 = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.bq, Integer.MIN_VALUE);
        this.b0 = obtainStyledAttributes.getDimensionPixelSize(o2.a.o.Yp, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        final Paint l = new Paint();
        (this.L = l).setStyle(Paint$Style.STROKE);
        l.setAntiAlias(true);
        this.Q = o.e(context, set, n, d0).m();
        if (Build$VERSION.SDK_INT >= 21) {
            this.setOutlineProvider((ViewOutlineProvider)new a());
        }
    }
    
    private void g(final Canvas canvas) {
        if (this.O == null) {
            return;
        }
        this.L.setStrokeWidth(this.R);
        final int colorForState = this.O.getColorForState(this.getDrawableState(), this.O.getDefaultColor());
        if (this.R > 0.0f && colorForState != 0) {
            this.L.setColor(colorForState);
            canvas.drawPath(this.N, this.L);
        }
    }
    
    private boolean h() {
        return this.a0 != Integer.MIN_VALUE || this.b0 != Integer.MIN_VALUE;
    }
    
    private boolean i() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        boolean b = true;
        if (sdk_INT < 17 || this.getLayoutDirection() != 1) {
            b = false;
        }
        return b;
    }
    
    private void l(final int n, final int n2) {
        this.J.set((float)this.getPaddingLeft(), (float)this.getPaddingTop(), (float)(n - this.getPaddingRight()), (float)(n2 - this.getPaddingBottom()));
        this.I.d(this.Q, 1.0f, this.J, this.N);
        this.S.rewind();
        this.S.addPath(this.N);
        this.K.set(0.0f, 0.0f, (float)n, (float)n2);
        this.S.addRect(this.K, Path$Direction.CCW);
    }
    
    @q
    public int getContentPaddingBottom() {
        return this.W;
    }
    
    @q
    public final int getContentPaddingEnd() {
        final int b0 = this.b0;
        if (b0 != Integer.MIN_VALUE) {
            return b0;
        }
        int n;
        if (this.i()) {
            n = this.T;
        }
        else {
            n = this.V;
        }
        return n;
    }
    
    @q
    public int getContentPaddingLeft() {
        if (this.h()) {
            if (this.i()) {
                final int b0 = this.b0;
                if (b0 != Integer.MIN_VALUE) {
                    return b0;
                }
            }
            if (!this.i()) {
                final int a0 = this.a0;
                if (a0 != Integer.MIN_VALUE) {
                    return a0;
                }
            }
        }
        return this.T;
    }
    
    @q
    public int getContentPaddingRight() {
        if (this.h()) {
            if (this.i()) {
                final int a0 = this.a0;
                if (a0 != Integer.MIN_VALUE) {
                    return a0;
                }
            }
            if (!this.i()) {
                final int b0 = this.b0;
                if (b0 != Integer.MIN_VALUE) {
                    return b0;
                }
            }
        }
        return this.V;
    }
    
    @q
    public final int getContentPaddingStart() {
        final int a0 = this.a0;
        if (a0 != Integer.MIN_VALUE) {
            return a0;
        }
        int n;
        if (this.i()) {
            n = this.V;
        }
        else {
            n = this.T;
        }
        return n;
    }
    
    @q
    public int getContentPaddingTop() {
        return this.U;
    }
    
    @q
    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.getContentPaddingBottom();
    }
    
    @q
    public int getPaddingEnd() {
        return super.getPaddingEnd() - this.getContentPaddingEnd();
    }
    
    @q
    public int getPaddingLeft() {
        return super.getPaddingLeft() - this.getContentPaddingLeft();
    }
    
    @q
    public int getPaddingRight() {
        return super.getPaddingRight() - this.getContentPaddingRight();
    }
    
    @q
    public int getPaddingStart() {
        return super.getPaddingStart() - this.getContentPaddingStart();
    }
    
    @q
    public int getPaddingTop() {
        return super.getPaddingTop() - this.getContentPaddingTop();
    }
    
    @j0
    @Override
    public o getShapeAppearanceModel() {
        return this.Q;
    }
    
    @k0
    public ColorStateList getStrokeColor() {
        return this.O;
    }
    
    @q
    public float getStrokeWidth() {
        return this.R;
    }
    
    public void j(@q final int t, @q final int u, @q final int v, @q final int w) {
        this.a0 = Integer.MIN_VALUE;
        this.b0 = Integer.MIN_VALUE;
        super.setPadding(super.getPaddingLeft() - this.T + t, super.getPaddingTop() - this.U + u, super.getPaddingRight() - this.V + v, super.getPaddingBottom() - this.W + w);
        this.T = t;
        this.U = u;
        this.V = v;
        this.W = w;
    }
    
    @p0(17)
    public void k(@q int v, @q final int u, @q final int n, @q final int w) {
        super.setPaddingRelative(super.getPaddingStart() - this.getContentPaddingStart() + v, super.getPaddingTop() - this.U + u, super.getPaddingEnd() - this.getContentPaddingEnd() + n, super.getPaddingBottom() - this.W + w);
        int t;
        if (this.i()) {
            t = n;
        }
        else {
            t = v;
        }
        this.T = t;
        this.U = u;
        if (!this.i()) {
            v = n;
        }
        this.V = v;
        this.W = w;
    }
    
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.setLayerType(2, (Paint)null);
    }
    
    protected void onDetachedFromWindow() {
        this.setLayerType(0, (Paint)null);
        super.onDetachedFromWindow();
    }
    
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.S, this.M);
        this.g(canvas);
    }
    
    protected void onMeasure(int sdk_INT, final int n) {
        super.onMeasure(sdk_INT, n);
        if (this.c0) {
            return;
        }
        sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT > 19 && !this.isLayoutDirectionResolved()) {
            return;
        }
        this.c0 = true;
        if (sdk_INT >= 21 && (this.isPaddingRelative() || this.h())) {
            this.setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            return;
        }
        this.setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.l(n, n2);
    }
    
    public void setPadding(@q final int n, @q final int n2, @q final int n3, @q final int n4) {
        super.setPadding(n + this.getContentPaddingLeft(), n2 + this.getContentPaddingTop(), n3 + this.getContentPaddingRight(), n4 + this.getContentPaddingBottom());
    }
    
    public void setPaddingRelative(@q final int n, @q final int n2, @q final int n3, @q final int n4) {
        super.setPaddingRelative(n + this.getContentPaddingStart(), n2 + this.getContentPaddingTop(), n3 + this.getContentPaddingEnd(), n4 + this.getContentPaddingBottom());
    }
    
    @Override
    public void setShapeAppearanceModel(@j0 final o o) {
        this.Q = o;
        final j p = this.P;
        if (p != null) {
            p.setShapeAppearanceModel(o);
        }
        this.l(this.getWidth(), this.getHeight());
        this.invalidate();
        if (Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setStrokeColor(@k0 final ColorStateList o) {
        this.O = o;
        this.invalidate();
    }
    
    public void setStrokeColorResource(@n final int n) {
        this.setStrokeColor(androidx.appcompat.content.res.a.c(this.getContext(), n));
    }
    
    public void setStrokeWidth(@q final float r) {
        if (this.R != r) {
            this.R = r;
            this.invalidate();
        }
    }
    
    public void setStrokeWidthResource(@androidx.annotation.p final int n) {
        this.setStrokeWidth((float)this.getResources().getDimensionPixelSize(n));
    }
    
    @TargetApi(21)
    class a extends ViewOutlineProvider
    {
        private final Rect a;
        
        a() {
            this.a = new Rect();
        }
        
        public void getOutline(final View view, final Outline outline) {
            if (com.google.android.material.imageview.a.this.Q == null) {
                return;
            }
            if (com.google.android.material.imageview.a.this.P == null) {
                com.google.android.material.imageview.a.this.P = new j(com.google.android.material.imageview.a.this.Q);
            }
            com.google.android.material.imageview.a.this.J.round(this.a);
            com.google.android.material.imageview.a.this.P.setBounds(this.a);
            com.google.android.material.imageview.a.this.P.getOutline(outline);
        }
    }
}
