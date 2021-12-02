// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import androidx.annotation.p0;
import android.graphics.Path$Direction;
import android.graphics.Outline;
import android.annotation.SuppressLint;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import android.util.Log;
import androidx.constraintlayout.motion.widget.c;
import android.view.View$MeasureSpec;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import c.a;
import android.util.TypedValue;
import android.graphics.Typeface;
import android.graphics.Paint$FontMetrics;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.j;
import androidx.annotation.k0;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.BitmapShader;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.ViewOutlineProvider;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.View;

public class e extends View implements androidx.constraintlayout.motion.widget.e
{
    static String F0 = "MotionLabel";
    private static final int G0 = 1;
    private static final int H0 = 2;
    private static final int I0 = 3;
    float A0;
    float B0;
    float C0;
    float D0;
    float E0;
    TextPaint G;
    Path H;
    private int I;
    private int J;
    private boolean K;
    private float L;
    private float M;
    ViewOutlineProvider N;
    RectF O;
    private float P;
    private float Q;
    private int R;
    private int S;
    private float T;
    private String U;
    boolean V;
    private Rect W;
    private CharSequence a0;
    private int b0;
    private int c0;
    private int d0;
    private int e0;
    private String f0;
    private Layout g0;
    private int h0;
    private int i0;
    private boolean j0;
    private float k0;
    private float l0;
    private float m0;
    private Drawable n0;
    Matrix o0;
    private Bitmap p0;
    private BitmapShader q0;
    private Matrix r0;
    private float s0;
    private float t0;
    private float u0;
    private float v0;
    Paint w0;
    private int x0;
    Rect y0;
    Paint z0;
    
    public e(final Context context) {
        super(context);
        this.G = new TextPaint();
        this.H = new Path();
        this.I = 65535;
        this.J = 65535;
        this.K = false;
        this.L = 0.0f;
        this.M = Float.NaN;
        this.P = 48.0f;
        this.Q = Float.NaN;
        this.T = 0.0f;
        this.U = "Hello World";
        this.V = true;
        this.W = new Rect();
        this.b0 = 1;
        this.c0 = 1;
        this.d0 = 1;
        this.e0 = 1;
        this.h0 = 8388659;
        this.i0 = 0;
        this.j0 = false;
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = 0.0f;
        this.v0 = 0.0f;
        this.w0 = new Paint();
        this.x0 = 0;
        this.B0 = Float.NaN;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = Float.NaN;
        this.g(context, null);
    }
    
    public e(final Context context, @k0 final AttributeSet set) {
        super(context, set);
        this.G = new TextPaint();
        this.H = new Path();
        this.I = 65535;
        this.J = 65535;
        this.K = false;
        this.L = 0.0f;
        this.M = Float.NaN;
        this.P = 48.0f;
        this.Q = Float.NaN;
        this.T = 0.0f;
        this.U = "Hello World";
        this.V = true;
        this.W = new Rect();
        this.b0 = 1;
        this.c0 = 1;
        this.d0 = 1;
        this.e0 = 1;
        this.h0 = 8388659;
        this.i0 = 0;
        this.j0 = false;
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = 0.0f;
        this.v0 = 0.0f;
        this.w0 = new Paint();
        this.x0 = 0;
        this.B0 = Float.NaN;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = Float.NaN;
        this.g(context, set);
    }
    
    public e(final Context context, @k0 final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new TextPaint();
        this.H = new Path();
        this.I = 65535;
        this.J = 65535;
        this.K = false;
        this.L = 0.0f;
        this.M = Float.NaN;
        this.P = 48.0f;
        this.Q = Float.NaN;
        this.T = 0.0f;
        this.U = "Hello World";
        this.V = true;
        this.W = new Rect();
        this.b0 = 1;
        this.c0 = 1;
        this.d0 = 1;
        this.e0 = 1;
        this.h0 = 8388659;
        this.i0 = 0;
        this.j0 = false;
        this.s0 = Float.NaN;
        this.t0 = Float.NaN;
        this.u0 = 0.0f;
        this.v0 = 0.0f;
        this.w0 = new Paint();
        this.x0 = 0;
        this.B0 = Float.NaN;
        this.C0 = Float.NaN;
        this.D0 = Float.NaN;
        this.E0 = Float.NaN;
        this.g(context, set);
    }
    
    private void d(final float n, final float n2, final float n3, final float n4) {
        if (this.r0 == null) {
            return;
        }
        this.l0 = n3 - n;
        this.m0 = n4 - n2;
        this.l();
    }
    
    private void g(final Context context, final AttributeSet set) {
        this.i(context, set);
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.Aj);
            for (int indexCount = obtainStyledAttributes.getIndexCount(), i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.Gj) {
                    this.setText(obtainStyledAttributes.getText(index));
                }
                else if (index == j.m.Ij) {
                    this.f0 = obtainStyledAttributes.getString(index);
                }
                else if (index == j.m.Mj) {
                    this.Q = (float)obtainStyledAttributes.getDimensionPixelSize(index, (int)this.Q);
                }
                else if (index == j.m.Bj) {
                    this.P = (float)obtainStyledAttributes.getDimensionPixelSize(index, (int)this.P);
                }
                else if (index == j.m.Dj) {
                    this.R = obtainStyledAttributes.getInt(index, this.R);
                }
                else if (index == j.m.Cj) {
                    this.S = obtainStyledAttributes.getInt(index, this.S);
                }
                else if (index == j.m.Ej) {
                    this.I = obtainStyledAttributes.getColor(index, this.I);
                }
                else if (index == j.m.Kj) {
                    final float dimension = obtainStyledAttributes.getDimension(index, this.M);
                    this.M = dimension;
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.setRound(dimension);
                    }
                }
                else if (index == j.m.Lj) {
                    final float float1 = obtainStyledAttributes.getFloat(index, this.L);
                    this.L = float1;
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.setRoundPercent(float1);
                    }
                }
                else if (index == j.m.Fj) {
                    this.setGravity(obtainStyledAttributes.getInt(index, -1));
                }
                else if (index == j.m.Jj) {
                    this.i0 = obtainStyledAttributes.getInt(index, 0);
                }
                else {
                    if (index == j.m.Sj) {
                        this.J = obtainStyledAttributes.getInt(index, this.J);
                    }
                    else if (index == j.m.Tj) {
                        this.T = obtainStyledAttributes.getDimension(index, this.T);
                    }
                    else if (index == j.m.Nj) {
                        this.n0 = obtainStyledAttributes.getDrawable(index);
                    }
                    else {
                        if (index == j.m.Oj) {
                            this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                            continue;
                        }
                        if (index == j.m.Pj) {
                            this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                            continue;
                        }
                        if (index == j.m.Uj) {
                            this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                            continue;
                        }
                        if (index == j.m.Vj) {
                            this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                            continue;
                        }
                        if (index == j.m.Qj) {
                            this.E0 = obtainStyledAttributes.getFloat(index, this.E0);
                            continue;
                        }
                        if (index == j.m.Rj) {
                            this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                            continue;
                        }
                        if (index == j.m.Yj) {
                            this.s0 = obtainStyledAttributes.getDimension(index, this.s0);
                            continue;
                        }
                        if (index == j.m.Zj) {
                            this.t0 = obtainStyledAttributes.getDimension(index, this.t0);
                            continue;
                        }
                        if (index == j.m.Xj) {
                            this.x0 = obtainStyledAttributes.getInt(index, this.x0);
                        }
                        continue;
                    }
                    this.K = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.k();
        this.j();
    }
    
    private float getHorizontalOffset() {
        float n;
        if (Float.isNaN(this.Q)) {
            n = 1.0f;
        }
        else {
            n = this.P / this.Q;
        }
        final TextPaint g = this.G;
        final String u = this.U;
        final float measureText = g.measureText(u, 0, u.length());
        float l0;
        if (Float.isNaN(this.l0)) {
            l0 = (float)this.getMeasuredWidth();
        }
        else {
            l0 = this.l0;
        }
        return (l0 - this.getPaddingLeft() - this.getPaddingRight() - n * measureText) * (this.u0 + 1.0f) / 2.0f;
    }
    
    private float getVerticalOffset() {
        float n;
        if (Float.isNaN(this.Q)) {
            n = 1.0f;
        }
        else {
            n = this.P / this.Q;
        }
        final Paint$FontMetrics fontMetrics = this.G.getFontMetrics();
        float m0;
        if (Float.isNaN(this.m0)) {
            m0 = (float)this.getMeasuredHeight();
        }
        else {
            m0 = this.m0;
        }
        final float n2 = (float)this.getPaddingTop();
        final float n3 = (float)this.getPaddingBottom();
        final float descent = fontMetrics.descent;
        final float ascent = fontMetrics.ascent;
        return (m0 - n2 - n3 - (descent - ascent) * n) * (1.0f - this.v0) / 2.0f - n * ascent;
    }
    
    private void h(final String s, int style, final int n) {
        if (s != null) {
            final Typeface create = Typeface.create(s, n);
            final Typeface typeface;
            if ((typeface = create) != null) {
                this.setTypeface(create);
                return;
            }
        }
        else {
            final Typeface typeface = null;
        }
        boolean fakeBoldText = true;
        Typeface typeface;
        if (style != 1) {
            if (style != 2) {
                if (style == 3) {
                    typeface = Typeface.MONOSPACE;
                }
            }
            else {
                typeface = Typeface.SERIF;
            }
        }
        else {
            typeface = Typeface.SANS_SERIF;
        }
        float textSkewX = 0.0f;
        if (n > 0) {
            Typeface typeface2;
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(n);
            }
            else {
                typeface2 = Typeface.create(typeface, n);
            }
            this.setTypeface(typeface2);
            if (typeface2 != null) {
                style = typeface2.getStyle();
            }
            else {
                style = 0;
            }
            style = (~style & n);
            final TextPaint g = this.G;
            if ((style & 0x1) == 0x0) {
                fakeBoldText = false;
            }
            g.setFakeBoldText(fakeBoldText);
            final TextPaint g2 = this.G;
            if ((style & 0x2) != 0x0) {
                textSkewX = -0.25f;
            }
            g2.setTextSkewX(textSkewX);
        }
        else {
            this.G.setFakeBoldText(false);
            this.G.setTextSkewX(0.0f);
            this.setTypeface(typeface);
        }
    }
    
    private void i(final Context context, @k0 final AttributeSet set) {
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(a.c.H0, typedValue, true);
        this.G.setColor(this.I = typedValue.data);
    }
    
    private void k() {
        if (this.n0 != null) {
            this.r0 = new Matrix();
            final int intrinsicWidth = this.n0.getIntrinsicWidth();
            final int intrinsicHeight = this.n0.getIntrinsicHeight();
            final int n = 128;
            int width;
            if ((width = intrinsicWidth) <= 0 && (width = this.getWidth()) == 0) {
                if (Float.isNaN(this.t0)) {
                    width = 128;
                }
                else {
                    width = (int)this.t0;
                }
            }
            int height;
            if ((height = intrinsicHeight) <= 0 && (height = this.getHeight()) == 0) {
                if (Float.isNaN(this.s0)) {
                    height = n;
                }
                else {
                    height = (int)this.s0;
                }
            }
            int n2 = width;
            int n3 = height;
            if (this.x0 != 0) {
                n2 = width / 2;
                n3 = height / 2;
            }
            this.p0 = Bitmap.createBitmap(n2, n3, Bitmap$Config.ARGB_8888);
            final Canvas canvas = new Canvas(this.p0);
            this.n0.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.n0.setFilterBitmap(true);
            this.n0.draw(canvas);
            if (this.x0 != 0) {
                this.p0 = this.e(this.p0, 4);
            }
            final Bitmap p0 = this.p0;
            final Shader$TileMode repeat = Shader$TileMode.REPEAT;
            this.q0 = new BitmapShader(p0, repeat, repeat);
        }
    }
    
    private void l() {
        final boolean naN = Float.isNaN(this.B0);
        float e0 = 0.0f;
        float b0;
        if (naN) {
            b0 = 0.0f;
        }
        else {
            b0 = this.B0;
        }
        float c0;
        if (Float.isNaN(this.C0)) {
            c0 = 0.0f;
        }
        else {
            c0 = this.C0;
        }
        float d0;
        if (Float.isNaN(this.D0)) {
            d0 = 1.0f;
        }
        else {
            d0 = this.D0;
        }
        if (!Float.isNaN(this.E0)) {
            e0 = this.E0;
        }
        this.r0.reset();
        final float n = (float)this.p0.getWidth();
        final float n2 = (float)this.p0.getHeight();
        float n3;
        if (Float.isNaN(this.t0)) {
            n3 = this.l0;
        }
        else {
            n3 = this.t0;
        }
        float n4;
        if (Float.isNaN(this.s0)) {
            n4 = this.m0;
        }
        else {
            n4 = this.s0;
        }
        float n5;
        if (n * n4 < n2 * n3) {
            n5 = n3 / n;
        }
        else {
            n5 = n4 / n2;
        }
        final float n6 = d0 * n5;
        this.r0.postScale(n6, n6);
        final float n7 = n * n6;
        float n8 = n3 - n7;
        final float n9 = n6 * n2;
        float n10 = n4 - n9;
        if (!Float.isNaN(this.s0)) {
            n10 = this.s0 / 2.0f;
        }
        if (!Float.isNaN(this.t0)) {
            n8 = this.t0 / 2.0f;
        }
        this.r0.postTranslate((b0 * n8 + n3 - n7) * 0.5f, (c0 * n10 + n4 - n9) * 0.5f);
        this.r0.postRotate(e0, n3 / 2.0f, n4 / 2.0f);
        this.q0.setLocalMatrix(this.r0);
    }
    
    public void a(float n, float n2, float n3, float n4) {
        final int n5 = (int)(n + 0.5f);
        this.k0 = n - n5;
        final int n6 = (int)(n3 + 0.5f);
        final int n7 = n6 - n5;
        final int n8 = (int)(n4 + 0.5f);
        final int n9 = (int)(0.5f + n2);
        final int n10 = n8 - n9;
        final float n11 = n3 - n;
        this.l0 = n11;
        final float n12 = n4 - n2;
        this.m0 = n12;
        this.d(n, n2, n3, n4);
        if (this.getMeasuredHeight() != n10 || this.getMeasuredWidth() != n7) {
            this.measure(View$MeasureSpec.makeMeasureSpec(n7, 1073741824), View$MeasureSpec.makeMeasureSpec(n10, 1073741824));
        }
        super.layout(n5, n9, n6, n8);
        if (this.j0) {
            if (this.y0 == null) {
                this.z0 = new Paint();
                this.y0 = new Rect();
                this.z0.set((Paint)this.G);
                this.A0 = this.z0.getTextSize();
            }
            this.l0 = n11;
            this.m0 = n12;
            final Paint z0 = this.z0;
            final String u = this.U;
            z0.getTextBounds(u, 0, u.length(), this.y0);
            final int width = this.y0.width();
            n = this.y0.height() * 1.3f;
            n2 = n11 - this.c0 - this.b0;
            n3 = n12 - this.e0 - this.d0;
            n4 = (float)width;
            if (n4 * n3 > n * n2) {
                this.G.setTextSize(this.A0 * n2 / n4);
            }
            else {
                this.G.setTextSize(this.A0 * n3 / n);
            }
            if (this.K || !Float.isNaN(this.Q)) {
                if (Float.isNaN(this.Q)) {
                    n = 1.0f;
                }
                else {
                    n = this.P / this.Q;
                }
                this.f(n);
            }
        }
    }
    
    Bitmap e(Bitmap bitmap, final int n) {
        System.nanoTime();
        final int width = bitmap.getWidth();
        final int height = bitmap.getHeight();
        int n2 = width / 2;
        int n3 = height / 2;
        bitmap = Bitmap.createScaledBitmap(bitmap, n2, n3, true);
        for (int n4 = 0; n4 < n && n2 >= 32 && n3 >= 32; n2 /= 2, n3 /= 2, bitmap = Bitmap.createScaledBitmap(bitmap, n2, n3, true), ++n4) {}
        return bitmap;
    }
    
    void f(final float f) {
        if (!this.K && f == 1.0f) {
            return;
        }
        this.H.reset();
        final String u = this.U;
        final int length = u.length();
        this.G.getTextBounds(u, 0, length, this.W);
        this.G.getTextPath(u, 0, length, 0.0f, 0.0f, this.H);
        if (f != 1.0f) {
            final String f2 = e.F0;
            final StringBuilder sb = new StringBuilder();
            sb.append(c.f());
            sb.append(" scale ");
            sb.append(f);
            Log.v(f2, sb.toString());
            final Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            this.H.transform(matrix);
        }
        final Rect w = this.W;
        --w.right;
        ++w.left;
        ++w.bottom;
        --w.top;
        final RectF rectF = new RectF();
        rectF.bottom = (float)this.getHeight();
        rectF.right = (float)this.getWidth();
        this.V = false;
    }
    
    public float getRound() {
        return this.M;
    }
    
    public float getRoundPercent() {
        return this.L;
    }
    
    public float getScaleFromTextSize() {
        return this.Q;
    }
    
    public float getTextBackgroundPanX() {
        return this.B0;
    }
    
    public float getTextBackgroundPanY() {
        return this.C0;
    }
    
    public float getTextBackgroundRotate() {
        return this.E0;
    }
    
    public float getTextBackgroundZoom() {
        return this.D0;
    }
    
    public int getTextOutlineColor() {
        return this.J;
    }
    
    public float getTextPanX() {
        return this.u0;
    }
    
    public float getTextPanY() {
        return this.v0;
    }
    
    public float getTextureHeight() {
        return this.s0;
    }
    
    public float getTextureWidth() {
        return this.t0;
    }
    
    public Typeface getTypeface() {
        return this.G.getTypeface();
    }
    
    void j() {
        this.b0 = this.getPaddingLeft();
        this.c0 = this.getPaddingRight();
        this.d0 = this.getPaddingTop();
        this.e0 = this.getPaddingBottom();
        this.h(this.f0, this.S, this.R);
        this.G.setColor(this.I);
        this.G.setStrokeWidth(this.T);
        this.G.setStyle(Paint$Style.FILL_AND_STROKE);
        this.G.setFlags(128);
        this.setTextSize(this.P);
        this.G.setAntiAlias(true);
    }
    
    public void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        final boolean naN = Float.isNaN(this.Q);
        float n5;
        if (naN) {
            n5 = 1.0f;
        }
        else {
            n5 = this.P / this.Q;
        }
        this.l0 = (float)(n3 - n);
        this.m0 = (float)(n4 - n2);
        float n6 = n5;
        if (this.j0) {
            if (this.y0 == null) {
                this.z0 = new Paint();
                this.y0 = new Rect();
                this.z0.set((Paint)this.G);
                this.A0 = this.z0.getTextSize();
            }
            final Paint z0 = this.z0;
            final String u = this.U;
            z0.getTextBounds(u, 0, u.length(), this.y0);
            final int width = this.y0.width();
            final int n7 = (int)(this.y0.height() * 1.3f);
            final float n8 = this.l0 - this.c0 - this.b0;
            final float n9 = this.m0 - this.e0 - this.d0;
            if (naN) {
                final float n10 = (float)width;
                final float n11 = (float)n7;
                if (n10 * n9 > n11 * n8) {
                    this.G.setTextSize(this.A0 * n8 / n10);
                    n6 = n5;
                }
                else {
                    this.G.setTextSize(this.A0 * n9 / n11);
                    n6 = n5;
                }
            }
            else {
                final float n12 = (float)width;
                final float n13 = (float)n7;
                if (n12 * n9 > n13 * n8) {
                    n6 = n8 / n12;
                }
                else {
                    n6 = n9 / n13;
                }
            }
        }
        if (this.K || !naN) {
            this.d((float)n, (float)n2, (float)n3, (float)n4);
            this.f(n6);
        }
    }
    
    protected void onDraw(final Canvas canvas) {
        float n;
        if (Float.isNaN(this.Q)) {
            n = 1.0f;
        }
        else {
            n = this.P / this.Q;
        }
        super.onDraw(canvas);
        if (!this.K && n == 1.0f) {
            canvas.drawText(this.U, this.k0 + (this.b0 + this.getHorizontalOffset()), this.d0 + this.getVerticalOffset(), (Paint)this.G);
            return;
        }
        if (this.V) {
            this.f(n);
        }
        if (this.o0 == null) {
            this.o0 = new Matrix();
        }
        if (this.K) {
            this.w0.set((Paint)this.G);
            this.o0.reset();
            final float n2 = this.b0 + this.getHorizontalOffset();
            final float n3 = this.d0 + this.getVerticalOffset();
            this.o0.postTranslate(n2, n3);
            this.o0.preScale(n, n);
            this.H.transform(this.o0);
            if (this.q0 != null) {
                this.G.setFilterBitmap(true);
                this.G.setShader((Shader)this.q0);
            }
            else {
                this.G.setColor(this.I);
            }
            this.G.setStyle(Paint$Style.FILL);
            this.G.setStrokeWidth(this.T);
            canvas.drawPath(this.H, (Paint)this.G);
            if (this.q0 != null) {
                this.G.setShader((Shader)null);
            }
            this.G.setColor(this.J);
            this.G.setStyle(Paint$Style.STROKE);
            this.G.setStrokeWidth(this.T);
            canvas.drawPath(this.H, (Paint)this.G);
            this.o0.reset();
            this.o0.postTranslate(-n2, -n3);
            this.H.transform(this.o0);
            this.G.set(this.w0);
        }
        else {
            final float n4 = this.b0 + this.getHorizontalOffset();
            final float n5 = this.d0 + this.getVerticalOffset();
            this.o0.reset();
            this.o0.preTranslate(n4, n5);
            this.H.transform(this.o0);
            this.G.setColor(this.I);
            this.G.setStyle(Paint$Style.FILL_AND_STROKE);
            this.G.setStrokeWidth(this.T);
            canvas.drawPath(this.H, (Paint)this.G);
            this.o0.reset();
            this.o0.preTranslate(-n4, -n5);
            this.H.transform(this.o0);
        }
    }
    
    protected void onMeasure(int n, int b) {
        final int mode = View$MeasureSpec.getMode(n);
        final int mode2 = View$MeasureSpec.getMode(b);
        n = View$MeasureSpec.getSize(n);
        final int size = View$MeasureSpec.getSize(b);
        this.j0 = false;
        this.b0 = this.getPaddingLeft();
        this.c0 = this.getPaddingRight();
        this.d0 = this.getPaddingTop();
        this.e0 = this.getPaddingBottom();
        int n2;
        if (mode == 1073741824 && mode2 == 1073741824) {
            n2 = n;
            b = size;
            if (this.i0 != 0) {
                this.j0 = true;
                n2 = n;
                b = size;
            }
        }
        else {
            final TextPaint g = this.G;
            final String u = this.U;
            g.getTextBounds(u, 0, u.length(), this.W);
            if (mode != 1073741824) {
                n = (int)(this.W.width() + 0.99999f);
            }
            n2 = n + (this.b0 + this.c0);
            b = size;
            if (mode2 != 1073741824) {
                b = (n = (int)(this.G.getFontMetricsInt((Paint$FontMetricsInt)null) + 0.99999f));
                if (mode2 == Integer.MIN_VALUE) {
                    n = Math.min(size, b);
                }
                b = this.d0 + this.e0 + n;
                n2 = n2;
            }
        }
        this.setMeasuredDimension(n2, b);
    }
    
    @SuppressLint({ "RtlHardcoded" })
    public void setGravity(int h0) {
        int n = h0;
        if ((h0 & 0x800007) == 0x0) {
            n = (h0 | 0x800003);
        }
        h0 = n;
        if ((n & 0x70) == 0x0) {
            h0 = (n | 0x30);
        }
        if (h0 != this.h0) {
            this.invalidate();
        }
        this.h0 = h0;
        final int n2 = h0 & 0x70;
        if (n2 != 48) {
            if (n2 != 80) {
                this.v0 = 0.0f;
            }
            else {
                this.v0 = 1.0f;
            }
        }
        else {
            this.v0 = -1.0f;
        }
        h0 &= 0x800007;
        Label_0133: {
            if (h0 != 3) {
                if (h0 != 5) {
                    if (h0 == 8388611) {
                        break Label_0133;
                    }
                    if (h0 != 8388613) {
                        this.u0 = 0.0f;
                        return;
                    }
                }
                this.u0 = 1.0f;
                return;
            }
        }
        this.u0 = -1.0f;
    }
    
    @p0(21)
    public void setRound(float n) {
        if (Float.isNaN(n)) {
            this.M = n;
            n = this.L;
            this.L = -1.0f;
            this.setRoundPercent(n);
            return;
        }
        final boolean b = this.M != n;
        this.M = n;
        if (n != 0.0f) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.O == null) {
                this.O = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.N == null) {
                    this.setOutlineProvider(this.N = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            outline.setRoundRect(0, 0, e.this.getWidth(), e.this.getHeight(), e.this.M);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            this.O.set(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
            this.H.reset();
            final Path h = this.H;
            final RectF o = this.O;
            n = this.M;
            h.addRoundRect(o, n, n, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    @p0(21)
    public void setRoundPercent(float l) {
        final boolean b = this.L != l;
        this.L = l;
        if (l != 0.0f) {
            if (this.H == null) {
                this.H = new Path();
            }
            if (this.O == null) {
                this.O = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.N == null) {
                    this.setOutlineProvider(this.N = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            final int width = e.this.getWidth();
                            final int height = e.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, Math.min(width, height) * e.this.L / 2.0f);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            final int width = this.getWidth();
            final int height = this.getHeight();
            l = Math.min(width, height) * this.L / 2.0f;
            this.O.set(0.0f, 0.0f, (float)width, (float)height);
            this.H.reset();
            this.H.addRoundRect(this.O, l, l, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setScaleFromTextSize(final float q) {
        this.Q = q;
    }
    
    public void setText(final CharSequence charSequence) {
        this.U = charSequence.toString();
        this.invalidate();
    }
    
    public void setTextBackgroundPanX(final float b0) {
        this.B0 = b0;
        this.l();
        this.invalidate();
    }
    
    public void setTextBackgroundPanY(final float c0) {
        this.C0 = c0;
        this.l();
        this.invalidate();
    }
    
    public void setTextBackgroundRotate(final float e0) {
        this.E0 = e0;
        this.l();
        this.invalidate();
    }
    
    public void setTextBackgroundZoom(final float d0) {
        this.D0 = d0;
        this.l();
        this.invalidate();
    }
    
    public void setTextFillColor(final int i) {
        this.I = i;
        this.invalidate();
    }
    
    public void setTextOutlineColor(final int j) {
        this.J = j;
        this.K = true;
        this.invalidate();
    }
    
    public void setTextOutlineThickness(final float n) {
        this.T = n;
        this.K = true;
        if (Float.isNaN(n)) {
            this.T = 1.0f;
            this.K = false;
        }
        this.invalidate();
    }
    
    public void setTextPanX(final float u0) {
        this.u0 = u0;
        this.invalidate();
    }
    
    public void setTextPanY(final float v0) {
        this.v0 = v0;
        this.invalidate();
    }
    
    public void setTextSize(float q) {
        this.P = q;
        final String f0 = e.F0;
        final StringBuilder sb = new StringBuilder();
        sb.append(c.f());
        sb.append("  ");
        sb.append(q);
        sb.append(" / ");
        sb.append(this.Q);
        Log.v(f0, sb.toString());
        final TextPaint g = this.G;
        if (!Float.isNaN(this.Q)) {
            q = this.Q;
        }
        g.setTextSize(q);
        if (Float.isNaN(this.Q)) {
            q = 1.0f;
        }
        else {
            q = this.P / this.Q;
        }
        this.f(q);
        this.requestLayout();
        this.invalidate();
    }
    
    public void setTextureHeight(final float s0) {
        this.s0 = s0;
        this.l();
        this.invalidate();
    }
    
    public void setTextureWidth(final float t0) {
        this.t0 = t0;
        this.l();
        this.invalidate();
    }
    
    public void setTypeface(final Typeface typeface) {
        if (this.G.getTypeface() != typeface) {
            this.G.setTypeface(typeface);
            if (this.g0 != null) {
                this.g0 = null;
                this.requestLayout();
                this.invalidate();
            }
        }
    }
}
