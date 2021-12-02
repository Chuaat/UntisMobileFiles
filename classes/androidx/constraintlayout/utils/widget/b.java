// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import androidx.annotation.p0;
import android.graphics.Path$Direction;
import android.graphics.Outline;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.a;
import android.graphics.Canvas;
import android.widget.ImageView$ScaleType;
import android.graphics.Matrix;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.RectF;
import android.view.ViewOutlineProvider;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;

public class b extends AppCompatImageView
{
    private c I;
    private boolean J;
    private Drawable K;
    private Drawable L;
    private float M;
    private float N;
    private float O;
    private Path P;
    ViewOutlineProvider Q;
    RectF R;
    Drawable[] S;
    LayerDrawable T;
    float U;
    float V;
    float W;
    float a0;
    
    public b(final Context context) {
        super(context);
        this.I = new c();
        this.J = true;
        this.K = null;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = Float.NaN;
        this.S = new Drawable[2];
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.e(context, null);
    }
    
    public b(final Context context, final AttributeSet set) {
        super(context, set);
        this.I = new c();
        this.J = true;
        this.K = null;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = Float.NaN;
        this.S = new Drawable[2];
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.e(context, set);
    }
    
    public b(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = new c();
        this.J = true;
        this.K = null;
        this.L = null;
        this.M = 0.0f;
        this.N = 0.0f;
        this.O = Float.NaN;
        this.S = new Drawable[2];
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.e(context, set);
    }
    
    private void e(final Context context, final AttributeSet set) {
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.me);
            final int indexCount = obtainStyledAttributes.getIndexCount();
            this.K = obtainStyledAttributes.getDrawable(j.m.ne);
            for (int i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.re) {
                    this.M = obtainStyledAttributes.getFloat(index, 0.0f);
                }
                else if (index == j.m.Ae) {
                    this.setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                }
                else if (index == j.m.ze) {
                    this.setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                }
                else if (index == j.m.qe) {
                    this.setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                }
                else if (index == j.m.pe) {
                    this.setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                }
                else if (index == j.m.xe) {
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                }
                else if (index == j.m.ye) {
                    if (Build$VERSION.SDK_INT >= 21) {
                        this.setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                }
                else if (index == j.m.we) {
                    this.setOverlay(obtainStyledAttributes.getBoolean(index, this.J));
                }
                else if (index == j.m.se) {
                    this.setImagePanX(obtainStyledAttributes.getFloat(index, this.U));
                }
                else if (index == j.m.te) {
                    this.setImagePanY(obtainStyledAttributes.getFloat(index, this.V));
                }
                else if (index == j.m.ue) {
                    this.setImageRotate(obtainStyledAttributes.getFloat(index, this.a0));
                }
                else if (index == j.m.ve) {
                    this.setImageZoom(obtainStyledAttributes.getFloat(index, this.W));
                }
            }
            obtainStyledAttributes.recycle();
            final Drawable drawable = this.getDrawable();
            this.L = drawable;
            if (this.K != null && drawable != null) {
                this.S[0] = (this.L = this.getDrawable().mutate());
                this.S[1] = this.K.mutate();
                final LayerDrawable t = new LayerDrawable(this.S);
                this.T = t;
                t.getDrawable(1).setAlpha((int)(this.M * 255.0f));
                if (!this.J) {
                    this.T.getDrawable(0).setAlpha((int)((1.0f - this.M) * 255.0f));
                }
                super.setImageDrawable((Drawable)this.T);
            }
            else {
                final Drawable drawable2 = this.getDrawable();
                if ((this.L = drawable2) != null) {
                    this.S[0] = (this.L = drawable2.mutate());
                }
            }
        }
    }
    
    private void f() {
        if (Float.isNaN(this.U) && Float.isNaN(this.V) && Float.isNaN(this.W) && Float.isNaN(this.a0)) {
            return;
        }
        final boolean naN = Float.isNaN(this.U);
        float a0 = 0.0f;
        float u;
        if (naN) {
            u = 0.0f;
        }
        else {
            u = this.U;
        }
        float v;
        if (Float.isNaN(this.V)) {
            v = 0.0f;
        }
        else {
            v = this.V;
        }
        float w;
        if (Float.isNaN(this.W)) {
            w = 1.0f;
        }
        else {
            w = this.W;
        }
        if (!Float.isNaN(this.a0)) {
            a0 = this.a0;
        }
        final Matrix imageMatrix = new Matrix();
        imageMatrix.reset();
        final float n = (float)this.getDrawable().getIntrinsicWidth();
        final float n2 = (float)this.getDrawable().getIntrinsicHeight();
        final float n3 = (float)this.getWidth();
        final float n4 = (float)this.getHeight();
        float n5;
        if (n * n4 < n2 * n3) {
            n5 = n3 / n;
        }
        else {
            n5 = n4 / n2;
        }
        final float n6 = w * n5;
        imageMatrix.postScale(n6, n6);
        final float n7 = n * n6;
        final float n8 = n6 * n2;
        imageMatrix.postTranslate((u * (n3 - n7) + n3 - n7) * 0.5f, (v * (n4 - n8) + n4 - n8) * 0.5f);
        imageMatrix.postRotate(a0, n3 / 2.0f, n4 / 2.0f);
        this.setImageMatrix(imageMatrix);
        this.setScaleType(ImageView$ScaleType.MATRIX);
    }
    
    private void g() {
        if (Float.isNaN(this.U) && Float.isNaN(this.V) && Float.isNaN(this.W) && Float.isNaN(this.a0)) {
            this.setScaleType(ImageView$ScaleType.FIT_CENTER);
            return;
        }
        this.f();
    }
    
    private void setOverlay(final boolean j) {
        this.J = j;
    }
    
    public void draw(final Canvas canvas) {
        boolean b;
        if (Build$VERSION.SDK_INT < 21 && this.N != 0.0f && this.P != null) {
            b = true;
            canvas.save();
            canvas.clipPath(this.P);
        }
        else {
            b = false;
        }
        super.draw(canvas);
        if (b) {
            canvas.restore();
        }
    }
    
    public float getBrightness() {
        return this.I.d;
    }
    
    public float getContrast() {
        return this.I.f;
    }
    
    public float getCrossfade() {
        return this.M;
    }
    
    public float getImagePanX() {
        return this.U;
    }
    
    public float getImagePanY() {
        return this.V;
    }
    
    public float getImageRotate() {
        return this.a0;
    }
    
    public float getImageZoom() {
        return this.W;
    }
    
    public float getRound() {
        return this.O;
    }
    
    public float getRoundPercent() {
        return this.N;
    }
    
    public float getSaturation() {
        return this.I.e;
    }
    
    public float getWarmth() {
        return this.I.g;
    }
    
    public void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        this.f();
    }
    
    public void setAltImageResource(final int n) {
        final Drawable mutate = a.d(this.getContext(), n).mutate();
        this.K = mutate;
        final Drawable[] s = this.S;
        s[0] = this.L;
        s[1] = mutate;
        super.setImageDrawable((Drawable)(this.T = new LayerDrawable(this.S)));
        this.setCrossfade(this.M);
    }
    
    public void setBrightness(final float d) {
        final c i = this.I;
        i.d = d;
        i.c(this);
    }
    
    public void setContrast(final float f) {
        final c i = this.I;
        i.f = f;
        i.c(this);
    }
    
    public void setCrossfade(final float m) {
        this.M = m;
        if (this.S != null) {
            if (!this.J) {
                this.T.getDrawable(0).setAlpha((int)((1.0f - this.M) * 255.0f));
            }
            this.T.getDrawable(1).setAlpha((int)(this.M * 255.0f));
            super.setImageDrawable((Drawable)this.T);
        }
    }
    
    @Override
    public void setImageDrawable(Drawable mutate) {
        if (this.K != null && mutate != null) {
            mutate = mutate.mutate();
            this.L = mutate;
            final Drawable[] s = this.S;
            s[0] = mutate;
            s[1] = this.K;
            super.setImageDrawable((Drawable)(this.T = new LayerDrawable(this.S)));
            this.setCrossfade(this.M);
        }
        else {
            super.setImageDrawable(mutate);
        }
    }
    
    public void setImagePanX(final float u) {
        this.U = u;
        this.g();
    }
    
    public void setImagePanY(final float v) {
        this.V = v;
        this.g();
    }
    
    @Override
    public void setImageResource(final int imageResource) {
        if (this.K != null) {
            final Drawable mutate = a.d(this.getContext(), imageResource).mutate();
            this.L = mutate;
            final Drawable[] s = this.S;
            s[0] = mutate;
            s[1] = this.K;
            super.setImageDrawable((Drawable)(this.T = new LayerDrawable(this.S)));
            this.setCrossfade(this.M);
        }
        else {
            super.setImageResource(imageResource);
        }
    }
    
    public void setImageRotate(final float a0) {
        this.a0 = a0;
        this.g();
    }
    
    public void setImageZoom(final float w) {
        this.W = w;
        this.g();
    }
    
    @p0(21)
    public void setRound(float n) {
        if (Float.isNaN(n)) {
            this.O = n;
            n = this.N;
            this.N = -1.0f;
            this.setRoundPercent(n);
            return;
        }
        final boolean b = this.O != n;
        this.O = n;
        if (n != 0.0f) {
            if (this.P == null) {
                this.P = new Path();
            }
            if (this.R == null) {
                this.R = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.Q == null) {
                    this.setOutlineProvider(this.Q = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            outline.setRoundRect(0, 0, b.this.getWidth(), b.this.getHeight(), b.this.O);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            this.R.set(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
            this.P.reset();
            final Path p = this.P;
            final RectF r = this.R;
            n = this.O;
            p.addRoundRect(r, n, n, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    @p0(21)
    public void setRoundPercent(float n) {
        final boolean b = this.N != n;
        this.N = n;
        if (n != 0.0f) {
            if (this.P == null) {
                this.P = new Path();
            }
            if (this.R == null) {
                this.R = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.Q == null) {
                    this.setOutlineProvider(this.Q = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            final int width = b.this.getWidth();
                            final int height = b.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, Math.min(width, height) * b.this.N / 2.0f);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            final int width = this.getWidth();
            final int height = this.getHeight();
            n = Math.min(width, height) * this.N / 2.0f;
            this.R.set(0.0f, 0.0f, (float)width, (float)height);
            this.P.reset();
            this.P.addRoundRect(this.R, n, n, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setSaturation(final float e) {
        final c i = this.I;
        i.e = e;
        i.c(this);
    }
    
    public void setWarmth(final float g) {
        final c i = this.I;
        i.g = g;
        i.c(this);
    }
    
    static class c
    {
        float[] a;
        ColorMatrix b;
        ColorMatrix c;
        float d;
        float e;
        float f;
        float g;
        
        c() {
            this.a = new float[20];
            this.b = new ColorMatrix();
            this.c = new ColorMatrix();
            this.d = 1.0f;
            this.e = 1.0f;
            this.f = 1.0f;
            this.g = 1.0f;
        }
        
        private void a(final float n) {
            final float[] a = this.a;
            a[0] = n;
            a[1] = 0.0f;
            a[3] = (a[2] = 0.0f);
            a[5] = (a[4] = 0.0f);
            a[6] = n;
            a[7] = 0.0f;
            a[9] = (a[8] = 0.0f);
            a[11] = (a[10] = 0.0f);
            a[12] = n;
            a[13] = 0.0f;
            a[15] = (a[14] = 0.0f);
            a[17] = (a[16] = 0.0f);
            a[18] = 1.0f;
            a[19] = 0.0f;
        }
        
        private void b(final float n) {
            final float n2 = 1.0f - n;
            final float n3 = 0.2999f * n2;
            final float n4 = 0.587f * n2;
            final float n5 = n2 * 0.114f;
            final float[] a = this.a;
            a[0] = n3 + n;
            a[1] = n4;
            a[2] = n5;
            a[4] = (a[3] = 0.0f);
            a[5] = n3;
            a[6] = n4 + n;
            a[7] = n5;
            a[9] = (a[8] = 0.0f);
            a[10] = n3;
            a[11] = n4;
            a[12] = n5 + n;
            a[13] = 0.0f;
            a[15] = (a[14] = 0.0f);
            a[17] = (a[16] = 0.0f);
            a[18] = 1.0f;
            a[19] = 0.0f;
        }
        
        private void d(float min) {
            float n = min;
            if (min <= 0.0f) {
                n = 0.01f;
            }
            min = 5000.0f / n / 100.0f;
            float a;
            float a2;
            if (min > 66.0f) {
                final double n2 = min - 60.0f;
                a = (float)Math.pow(n2, -0.13320475816726685) * 329.69873f;
                a2 = (float)Math.pow(n2, 0.07551484555006027) * 288.12216f;
            }
            else {
                a2 = (float)Math.log(min) * 99.4708f - 161.11957f;
                a = 255.0f;
            }
            if (min < 66.0f) {
                if (min > 19.0f) {
                    min = (float)Math.log(min - 10.0f) * 138.51773f - 305.0448f;
                }
                else {
                    min = 0.0f;
                }
            }
            else {
                min = 255.0f;
            }
            final float min2 = Math.min(255.0f, Math.max(a, 0.0f));
            final float min3 = Math.min(255.0f, Math.max(a2, 0.0f));
            min = Math.min(255.0f, Math.max(min, 0.0f));
            final float n3 = (float)Math.log(50.0f);
            final float n4 = (float)Math.log(40.0f);
            final float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            final float min5 = Math.min(255.0f, Math.max(n3 * 99.4708f - 161.11957f, 0.0f));
            final float min6 = Math.min(255.0f, Math.max(n4 * 138.51773f - 305.0448f, 0.0f));
            final float n5 = min2 / min4;
            final float n6 = min3 / min5;
            min /= min6;
            final float[] a3 = this.a;
            a3[0] = n5;
            a3[1] = 0.0f;
            a3[3] = (a3[2] = 0.0f);
            a3[5] = (a3[4] = 0.0f);
            a3[6] = n6;
            a3[7] = 0.0f;
            a3[9] = (a3[8] = 0.0f);
            a3[11] = (a3[10] = 0.0f);
            a3[12] = min;
            a3[13] = 0.0f;
            a3[15] = (a3[14] = 0.0f);
            a3[17] = (a3[16] = 0.0f);
            a3[18] = 1.0f;
            a3[19] = 0.0f;
        }
        
        void c(final ImageView imageView) {
            this.b.reset();
            final float e = this.e;
            final int n = 1;
            int n2;
            if (e != 1.0f) {
                this.b(e);
                this.b.set(this.a);
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            final float f = this.f;
            if (f != 1.0f) {
                this.c.setScale(f, f, f, 1.0f);
                this.b.postConcat(this.c);
                n2 = 1;
            }
            final float g = this.g;
            if (g != 1.0f) {
                this.d(g);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                n2 = 1;
            }
            final float d = this.d;
            if (d != 1.0f) {
                this.a(d);
                this.c.set(this.a);
                this.b.postConcat(this.c);
                n2 = n;
            }
            if (n2 != 0) {
                imageView.setColorFilter((ColorFilter)new ColorMatrixColorFilter(this.b));
            }
            else {
                imageView.clearColorFilter();
            }
        }
    }
}
