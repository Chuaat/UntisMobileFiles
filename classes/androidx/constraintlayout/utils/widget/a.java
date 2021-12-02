// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.utils.widget;

import androidx.annotation.p0;
import android.graphics.Path$Direction;
import android.graphics.Outline;
import android.view.View;
import android.widget.ImageView;
import android.graphics.Canvas;
import android.widget.ImageView$ScaleType;
import android.graphics.Matrix;
import android.content.res.TypedArray;
import android.os.Build$VERSION;
import androidx.constraintlayout.widget.j;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.view.ViewOutlineProvider;
import android.graphics.Path;
import androidx.appcompat.widget.AppCompatImageButton;

public class a extends AppCompatImageButton
{
    private b.c I;
    private float J;
    private float K;
    private float L;
    private Path M;
    ViewOutlineProvider N;
    RectF O;
    Drawable[] P;
    LayerDrawable Q;
    private boolean R;
    private Drawable S;
    private Drawable T;
    private float U;
    private float V;
    private float W;
    private float a0;
    
    public a(final Context context) {
        super(context);
        this.I = new b.c();
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = Float.NaN;
        this.P = new Drawable[2];
        this.R = true;
        this.S = null;
        this.T = null;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.c(context, null);
    }
    
    public a(final Context context, final AttributeSet set) {
        super(context, set);
        this.I = new b.c();
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = Float.NaN;
        this.P = new Drawable[2];
        this.R = true;
        this.S = null;
        this.T = null;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.c(context, set);
    }
    
    public a(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.I = new b.c();
        this.J = 0.0f;
        this.K = 0.0f;
        this.L = Float.NaN;
        this.P = new Drawable[2];
        this.R = true;
        this.S = null;
        this.T = null;
        this.U = Float.NaN;
        this.V = Float.NaN;
        this.W = Float.NaN;
        this.a0 = Float.NaN;
        this.c(context, set);
    }
    
    private void c(final Context context, final AttributeSet set) {
        this.setPadding(0, 0, 0, 0);
        if (set != null) {
            final TypedArray obtainStyledAttributes = this.getContext().obtainStyledAttributes(set, j.m.me);
            final int indexCount = obtainStyledAttributes.getIndexCount();
            this.S = obtainStyledAttributes.getDrawable(j.m.ne);
            for (int i = 0; i < indexCount; ++i) {
                final int index = obtainStyledAttributes.getIndex(i);
                if (index == j.m.re) {
                    this.J = obtainStyledAttributes.getFloat(index, 0.0f);
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
                    this.setOverlay(obtainStyledAttributes.getBoolean(index, this.R));
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
            this.T = drawable;
            if (this.S != null && drawable != null) {
                this.P[0] = (this.T = this.getDrawable().mutate());
                this.P[1] = this.S.mutate();
                final LayerDrawable q = new LayerDrawable(this.P);
                this.Q = q;
                q.getDrawable(1).setAlpha((int)(this.J * 255.0f));
                if (!this.R) {
                    this.Q.getDrawable(0).setAlpha((int)((1.0f - this.J) * 255.0f));
                }
                super.setImageDrawable((Drawable)this.Q);
            }
            else {
                final Drawable drawable2 = this.getDrawable();
                if ((this.T = drawable2) != null) {
                    this.P[0] = (this.T = drawable2.mutate());
                }
            }
        }
    }
    
    private void d() {
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
    
    private void e() {
        if (Float.isNaN(this.U) && Float.isNaN(this.V) && Float.isNaN(this.W) && Float.isNaN(this.a0)) {
            this.setScaleType(ImageView$ScaleType.FIT_CENTER);
            return;
        }
        this.d();
    }
    
    private void setOverlay(final boolean r) {
        this.R = r;
    }
    
    public void draw(final Canvas canvas) {
        boolean b;
        if (Build$VERSION.SDK_INT < 21 && this.L != 0.0f && this.M != null) {
            b = true;
            canvas.save();
            canvas.clipPath(this.M);
        }
        else {
            b = false;
        }
        super.draw(canvas);
        if (b) {
            canvas.restore();
        }
    }
    
    public float getContrast() {
        return this.I.f;
    }
    
    public float getCrossfade() {
        return this.J;
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
        return this.L;
    }
    
    public float getRoundPercent() {
        return this.K;
    }
    
    public float getSaturation() {
        return this.I.e;
    }
    
    public float getWarmth() {
        return this.I.g;
    }
    
    public void layout(final int n, final int n2, final int n3, final int n4) {
        super.layout(n, n2, n3, n4);
        this.d();
    }
    
    public void setAltImageResource(final int n) {
        final Drawable mutate = androidx.appcompat.content.res.a.d(this.getContext(), n).mutate();
        this.S = mutate;
        final Drawable[] p = this.P;
        p[0] = this.T;
        p[1] = mutate;
        super.setImageDrawable((Drawable)(this.Q = new LayerDrawable(this.P)));
        this.setCrossfade(this.J);
    }
    
    public void setBrightness(final float d) {
        final b.c i = this.I;
        i.d = d;
        i.c((ImageView)this);
    }
    
    public void setContrast(final float f) {
        final b.c i = this.I;
        i.f = f;
        i.c((ImageView)this);
    }
    
    public void setCrossfade(final float j) {
        this.J = j;
        if (this.P != null) {
            if (!this.R) {
                this.Q.getDrawable(0).setAlpha((int)((1.0f - this.J) * 255.0f));
            }
            this.Q.getDrawable(1).setAlpha((int)(this.J * 255.0f));
            super.setImageDrawable((Drawable)this.Q);
        }
    }
    
    @Override
    public void setImageDrawable(Drawable mutate) {
        if (this.S != null && mutate != null) {
            mutate = mutate.mutate();
            this.T = mutate;
            final Drawable[] p = this.P;
            p[0] = mutate;
            p[1] = this.S;
            super.setImageDrawable((Drawable)(this.Q = new LayerDrawable(this.P)));
            this.setCrossfade(this.J);
        }
        else {
            super.setImageDrawable(mutate);
        }
    }
    
    public void setImagePanX(final float u) {
        this.U = u;
        this.e();
    }
    
    public void setImagePanY(final float v) {
        this.V = v;
        this.e();
    }
    
    @Override
    public void setImageResource(final int imageResource) {
        if (this.S != null) {
            final Drawable mutate = androidx.appcompat.content.res.a.d(this.getContext(), imageResource).mutate();
            this.T = mutate;
            final Drawable[] p = this.P;
            p[0] = mutate;
            p[1] = this.S;
            super.setImageDrawable((Drawable)(this.Q = new LayerDrawable(this.P)));
            this.setCrossfade(this.J);
        }
        else {
            super.setImageResource(imageResource);
        }
    }
    
    public void setImageRotate(final float a0) {
        this.a0 = a0;
        this.e();
    }
    
    public void setImageZoom(final float w) {
        this.W = w;
        this.e();
    }
    
    @p0(21)
    public void setRound(float n) {
        if (Float.isNaN(n)) {
            this.L = n;
            n = this.K;
            this.K = -1.0f;
            this.setRoundPercent(n);
            return;
        }
        final boolean b = this.L != n;
        this.L = n;
        if (n != 0.0f) {
            if (this.M == null) {
                this.M = new Path();
            }
            if (this.O == null) {
                this.O = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.N == null) {
                    this.setOutlineProvider(this.N = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.a.this.getWidth(), androidx.constraintlayout.utils.widget.a.this.getHeight(), androidx.constraintlayout.utils.widget.a.this.L);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            this.O.set(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
            this.M.reset();
            final Path m = this.M;
            final RectF o = this.O;
            n = this.L;
            m.addRoundRect(o, n, n, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    @p0(21)
    public void setRoundPercent(float k) {
        final boolean b = this.K != k;
        this.K = k;
        if (k != 0.0f) {
            if (this.M == null) {
                this.M = new Path();
            }
            if (this.O == null) {
                this.O = new RectF();
            }
            if (Build$VERSION.SDK_INT >= 21) {
                if (this.N == null) {
                    this.setOutlineProvider(this.N = new ViewOutlineProvider() {
                        public void getOutline(final View view, final Outline outline) {
                            final int width = androidx.constraintlayout.utils.widget.a.this.getWidth();
                            final int height = androidx.constraintlayout.utils.widget.a.this.getHeight();
                            outline.setRoundRect(0, 0, width, height, Math.min(width, height) * androidx.constraintlayout.utils.widget.a.this.K / 2.0f);
                        }
                    });
                }
                this.setClipToOutline(true);
            }
            final int width = this.getWidth();
            final int height = this.getHeight();
            k = Math.min(width, height) * this.K / 2.0f;
            this.O.set(0.0f, 0.0f, (float)width, (float)height);
            this.M.reset();
            this.M.addRoundRect(this.O, k, k, Path$Direction.CW);
        }
        else if (Build$VERSION.SDK_INT >= 21) {
            this.setClipToOutline(false);
        }
        if (b && Build$VERSION.SDK_INT >= 21) {
            this.invalidateOutline();
        }
    }
    
    public void setSaturation(final float e) {
        final b.c i = this.I;
        i.e = e;
        i.c((ImageView)this);
    }
    
    public void setWarmth(final float g) {
        final b.c i = this.I;
        i.g = g;
        i.c((ImageView)this);
    }
}
