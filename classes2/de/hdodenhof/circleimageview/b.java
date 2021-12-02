// 
// Decompiled by Procyon v0.5.36
// 

package de.hdodenhof.circleimageview;

import android.graphics.Rect;
import android.graphics.Outline;
import android.view.View;
import androidx.annotation.p0;
import android.net.Uri;
import androidx.annotation.s;
import androidx.annotation.n;
import androidx.annotation.l;
import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.Shader$TileMode;
import android.view.ViewOutlineProvider;
import android.os.Build$VERSION;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.BitmapShader;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Bitmap$Config;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;

public class b extends ImageView
{
    private static final ImageView$ScaleType d0;
    private static final Bitmap$Config e0;
    private static final int f0 = 2;
    private static final int g0 = 0;
    private static final int h0 = -16777216;
    private static final int i0 = 0;
    private static final boolean j0 = false;
    private final RectF G;
    private final RectF H;
    private final Matrix I;
    private final Paint J;
    private final Paint K;
    private final Paint L;
    private int M;
    private int N;
    private int O;
    private Bitmap P;
    private BitmapShader Q;
    private int R;
    private int S;
    private float T;
    private float U;
    private ColorFilter V;
    private boolean W;
    private boolean a0;
    private boolean b0;
    private boolean c0;
    
    static {
        d0 = ImageView$ScaleType.CENTER_CROP;
        e0 = Bitmap$Config.ARGB_8888;
    }
    
    public b(final Context context) {
        super(context);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Matrix();
        this.J = new Paint();
        this.K = new Paint();
        this.L = new Paint();
        this.M = -16777216;
        this.N = 0;
        this.O = 0;
        this.g();
    }
    
    public b(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public b(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.G = new RectF();
        this.H = new RectF();
        this.I = new Matrix();
        this.J = new Paint();
        this.K = new Paint();
        this.L = new Paint();
        this.M = -16777216;
        this.N = 0;
        this.O = 0;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, c.b.a, n, 0);
        this.N = obtainStyledAttributes.getDimensionPixelSize(c.b.d, 0);
        this.M = obtainStyledAttributes.getColor(c.b.b, -16777216);
        this.b0 = obtainStyledAttributes.getBoolean(c.b.c, false);
        this.O = obtainStyledAttributes.getColor(c.b.e, 0);
        obtainStyledAttributes.recycle();
        this.g();
    }
    
    private void c() {
        final Paint j = this.J;
        if (j != null) {
            j.setColorFilter(this.V);
        }
    }
    
    private RectF d() {
        final int a = this.getWidth() - this.getPaddingLeft() - this.getPaddingRight();
        final int b = this.getHeight() - this.getPaddingTop() - this.getPaddingBottom();
        final int min = Math.min(a, b);
        final float n = this.getPaddingLeft() + (a - min) / 2.0f;
        final float n2 = this.getPaddingTop() + (b - min) / 2.0f;
        final float n3 = (float)min;
        return new RectF(n, n2, n + n3, n3 + n2);
    }
    
    private Bitmap e(final Drawable drawable) {
        if (drawable == null) {
            return null;
        }
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        try {
            Bitmap bitmap;
            if (drawable instanceof ColorDrawable) {
                bitmap = Bitmap.createBitmap(2, 2, b.e0);
            }
            else {
                bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), b.e0);
            }
            final Canvas canvas = new Canvas(bitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return bitmap;
        }
        catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    private boolean f(final float n, final float n2) {
        final boolean empty = this.H.isEmpty();
        boolean b = true;
        if (empty) {
            return true;
        }
        if (Math.pow(n - this.H.centerX(), 2.0) + Math.pow(n2 - this.H.centerY(), 2.0) > Math.pow(this.U, 2.0)) {
            b = false;
        }
        return b;
    }
    
    private void g() {
        super.setScaleType(b.d0);
        this.W = true;
        if (Build$VERSION.SDK_INT >= 21) {
            this.setOutlineProvider((ViewOutlineProvider)new b());
        }
        if (this.a0) {
            this.k();
            this.a0 = false;
        }
    }
    
    private void h() {
        Bitmap e;
        if (this.c0) {
            e = null;
        }
        else {
            e = this.e(this.getDrawable());
        }
        this.P = e;
        this.k();
    }
    
    private void k() {
        if (!this.W) {
            this.a0 = true;
            return;
        }
        if (this.getWidth() == 0 && this.getHeight() == 0) {
            return;
        }
        if (this.P == null) {
            this.invalidate();
            return;
        }
        final Bitmap p = this.P;
        final Shader$TileMode clamp = Shader$TileMode.CLAMP;
        this.Q = new BitmapShader(p, clamp, clamp);
        this.J.setAntiAlias(true);
        this.J.setDither(true);
        this.J.setFilterBitmap(true);
        this.J.setShader((Shader)this.Q);
        this.K.setStyle(Paint$Style.STROKE);
        this.K.setAntiAlias(true);
        this.K.setColor(this.M);
        this.K.setStrokeWidth((float)this.N);
        this.L.setStyle(Paint$Style.FILL);
        this.L.setAntiAlias(true);
        this.L.setColor(this.O);
        this.S = this.P.getHeight();
        this.R = this.P.getWidth();
        this.H.set(this.d());
        this.U = Math.min((this.H.height() - this.N) / 2.0f, (this.H.width() - this.N) / 2.0f);
        this.G.set(this.H);
        if (!this.b0) {
            final int n = this.N;
            if (n > 0) {
                this.G.inset(n - 1.0f, n - 1.0f);
            }
        }
        this.T = Math.min(this.G.height() / 2.0f, this.G.width() / 2.0f);
        this.c();
        this.l();
        this.invalidate();
    }
    
    private void l() {
        this.I.set((Matrix)null);
        final float n = (float)this.R;
        final float height = this.G.height();
        final float width = this.G.width();
        final float n2 = (float)this.S;
        float n3 = 0.0f;
        float n4;
        float n5;
        if (n * height > width * n2) {
            n4 = this.G.height() / this.S;
            n3 = (this.G.width() - this.R * n4) * 0.5f;
            n5 = 0.0f;
        }
        else {
            n4 = this.G.width() / this.R;
            n5 = (this.G.height() - this.S * n4) * 0.5f;
        }
        this.I.setScale(n4, n4);
        final Matrix i = this.I;
        final float n6 = (float)(int)(n3 + 0.5f);
        final RectF g = this.G;
        i.postTranslate(n6 + g.left, (int)(n5 + 0.5f) + g.top);
        this.Q.setLocalMatrix(this.I);
    }
    
    public int getBorderColor() {
        return this.M;
    }
    
    public int getBorderWidth() {
        return this.N;
    }
    
    public int getCircleBackgroundColor() {
        return this.O;
    }
    
    public ColorFilter getColorFilter() {
        return this.V;
    }
    
    public ImageView$ScaleType getScaleType() {
        return b.d0;
    }
    
    public boolean i() {
        return this.b0;
    }
    
    public boolean j() {
        return this.c0;
    }
    
    protected void onDraw(final Canvas canvas) {
        if (this.c0) {
            super.onDraw(canvas);
            return;
        }
        if (this.P == null) {
            return;
        }
        if (this.O != 0) {
            canvas.drawCircle(this.G.centerX(), this.G.centerY(), this.T, this.L);
        }
        canvas.drawCircle(this.G.centerX(), this.G.centerY(), this.T, this.J);
        if (this.N > 0) {
            canvas.drawCircle(this.H.centerX(), this.H.centerY(), this.U, this.K);
        }
    }
    
    protected void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.k();
    }
    
    @SuppressLint({ "ClickableViewAccessibility" })
    public boolean onTouchEvent(final MotionEvent motionEvent) {
        if (this.c0) {
            return super.onTouchEvent(motionEvent);
        }
        return this.f(motionEvent.getX(), motionEvent.getY()) && super.onTouchEvent(motionEvent);
    }
    
    public void setAdjustViewBounds(final boolean b) {
        if (!b) {
            return;
        }
        throw new IllegalArgumentException("adjustViewBounds not supported.");
    }
    
    public void setBorderColor(@l final int n) {
        if (n == this.M) {
            return;
        }
        this.M = n;
        this.K.setColor(n);
        this.invalidate();
    }
    
    public void setBorderOverlay(final boolean b0) {
        if (b0 == this.b0) {
            return;
        }
        this.b0 = b0;
        this.k();
    }
    
    public void setBorderWidth(final int n) {
        if (n == this.N) {
            return;
        }
        this.N = n;
        this.k();
    }
    
    public void setCircleBackgroundColor(@l final int n) {
        if (n == this.O) {
            return;
        }
        this.O = n;
        this.L.setColor(n);
        this.invalidate();
    }
    
    public void setCircleBackgroundColorResource(@n final int n) {
        this.setCircleBackgroundColor(this.getContext().getResources().getColor(n));
    }
    
    public void setColorFilter(final ColorFilter v) {
        if (v == this.V) {
            return;
        }
        this.V = v;
        this.c();
        this.invalidate();
    }
    
    public void setDisableCircularTransformation(final boolean c0) {
        if (this.c0 == c0) {
            return;
        }
        this.c0 = c0;
        this.h();
    }
    
    public void setImageBitmap(final Bitmap imageBitmap) {
        super.setImageBitmap(imageBitmap);
        this.h();
    }
    
    public void setImageDrawable(final Drawable imageDrawable) {
        super.setImageDrawable(imageDrawable);
        this.h();
    }
    
    public void setImageResource(@s final int imageResource) {
        super.setImageResource(imageResource);
        this.h();
    }
    
    public void setImageURI(final Uri imageURI) {
        super.setImageURI(imageURI);
        this.h();
    }
    
    public void setPadding(final int n, final int n2, final int n3, final int n4) {
        super.setPadding(n, n2, n3, n4);
        this.k();
    }
    
    public void setPaddingRelative(final int n, final int n2, final int n3, final int n4) {
        super.setPaddingRelative(n, n2, n3, n4);
        this.k();
    }
    
    public void setScaleType(final ImageView$ScaleType imageView$ScaleType) {
        if (imageView$ScaleType == b.d0) {
            return;
        }
        throw new IllegalArgumentException(String.format("ScaleType %s not supported.", imageView$ScaleType));
    }
    
    @p0(api = 21)
    private class b extends ViewOutlineProvider
    {
        public void getOutline(final View view, final Outline outline) {
            if (de.hdodenhof.circleimageview.b.this.c0) {
                ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
            }
            else {
                final Rect rect = new Rect();
                de.hdodenhof.circleimageview.b.this.H.roundOut(rect);
                outline.setRoundRect(rect, rect.width() / 2.0f);
            }
        }
    }
}
