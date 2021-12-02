// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shadow;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Path$FillType;
import android.graphics.Rect;
import android.graphics.Paint$Style;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Path;
import android.graphics.RectF;
import androidx.annotation.j0;
import android.graphics.Paint;
import androidx.appcompat.graphics.drawable.c;

@Deprecated
public class a extends c
{
    static final double X;
    static final float Y = 1.5f;
    static final float Z = 0.25f;
    static final float a0 = 0.5f;
    static final float b0 = 1.0f;
    @j0
    final Paint H;
    @j0
    final Paint I;
    @j0
    final RectF J;
    float K;
    Path L;
    float M;
    float N;
    float O;
    float P;
    private boolean Q;
    private final int R;
    private final int S;
    private final int T;
    private boolean U;
    private float V;
    private boolean W;
    
    static {
        X = Math.cos(Math.toRadians(45.0));
    }
    
    public a(final Context context, final Drawable drawable, final float a, final float n, final float n2) {
        super(drawable);
        this.Q = true;
        this.U = true;
        this.W = false;
        this.R = d.f(context, o2.a.e.z0);
        this.S = d.f(context, o2.a.e.y0);
        this.T = d.f(context, o2.a.e.x0);
        final Paint h = new Paint(5);
        (this.H = h).setStyle(Paint$Style.FILL);
        this.K = (float)Math.round(a);
        this.J = new RectF();
        (this.I = new Paint(h)).setAntiAlias(false);
        this.r(n, n2);
    }
    
    private void c(@j0 final Rect rect) {
        final float n = this.N;
        final float n2 = 1.5f * n;
        this.J.set(rect.left + n, rect.top + n2, rect.right - n, rect.bottom - n2);
        final Drawable a = this.a();
        final RectF j = this.J;
        a.setBounds((int)j.left, (int)j.top, (int)j.right, (int)j.bottom);
        this.d();
    }
    
    private void d() {
        final float k = this.K;
        final RectF rectF = new RectF(-k, -k, k, k);
        final RectF rectF2 = new RectF(rectF);
        final float o = this.O;
        rectF2.inset(-o, -o);
        final Path l = this.L;
        if (l == null) {
            this.L = new Path();
        }
        else {
            l.reset();
        }
        this.L.setFillType(Path$FillType.EVEN_ODD);
        this.L.moveTo(-this.K, 0.0f);
        this.L.rLineTo(-this.O, 0.0f);
        this.L.arcTo(rectF2, 180.0f, 90.0f, false);
        this.L.arcTo(rectF, 270.0f, -90.0f, false);
        this.L.close();
        final float n = -rectF2.top;
        if (n > 0.0f) {
            final float n2 = this.K / n;
            this.H.setShader((Shader)new RadialGradient(0.0f, 0.0f, n, new int[] { 0, this.R, this.S, this.T }, new float[] { 0.0f, n2, (1.0f - n2) / 2.0f + n2, 1.0f }, Shader$TileMode.CLAMP));
        }
        this.I.setShader((Shader)new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[] { this.R, this.S, this.T }, new float[] { 0.0f, 0.5f, 1.0f }, Shader$TileMode.CLAMP));
        this.I.setAntiAlias(false);
    }
    
    public static float e(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            n3 = (float)(n + (1.0 - a.X) * n2);
        }
        return n3;
    }
    
    public static float f(float n, final float n2, final boolean b) {
        final float n3 = n *= 1.5f;
        if (b) {
            n = (float)(n3 + (1.0 - a.X) * n2);
        }
        return n;
    }
    
    private void g(@j0 final Canvas canvas) {
        final int save = canvas.save();
        canvas.rotate(this.V, this.J.centerX(), this.J.centerY());
        final float k = this.K;
        final float n = -k - this.O;
        final float width = this.J.width();
        final float n2 = k * 2.0f;
        final boolean b = width - n2 > 0.0f;
        final boolean b2 = this.J.height() - n2 > 0.0f;
        final float p = this.P;
        final float n3 = k / (p - 0.5f * p + k);
        final float n4 = k / (p - 0.25f * p + k);
        final float n5 = k / (p - p * 1.0f + k);
        final int save2 = canvas.save();
        final RectF j = this.J;
        canvas.translate(j.left + k, j.top + k);
        canvas.scale(n3, n4);
        canvas.drawPath(this.L, this.H);
        if (b) {
            canvas.scale(1.0f / n3, 1.0f);
            canvas.drawRect(0.0f, n, this.J.width() - n2, -this.K, this.I);
        }
        canvas.restoreToCount(save2);
        final int save3 = canvas.save();
        final RectF i = this.J;
        canvas.translate(i.right - k, i.bottom - k);
        canvas.scale(n3, n5);
        canvas.rotate(180.0f);
        canvas.drawPath(this.L, this.H);
        if (b) {
            canvas.scale(1.0f / n3, 1.0f);
            canvas.drawRect(0.0f, n, this.J.width() - n2, -this.K + this.O, this.I);
        }
        canvas.restoreToCount(save3);
        final int save4 = canvas.save();
        final RectF l = this.J;
        canvas.translate(l.left + k, l.bottom - k);
        canvas.scale(n3, n5);
        canvas.rotate(270.0f);
        canvas.drawPath(this.L, this.H);
        if (b2) {
            canvas.scale(1.0f / n5, 1.0f);
            canvas.drawRect(0.0f, n, this.J.height() - n2, -this.K, this.I);
        }
        canvas.restoreToCount(save4);
        final int save5 = canvas.save();
        final RectF m = this.J;
        canvas.translate(m.right - k, m.top + k);
        canvas.scale(n3, n4);
        canvas.rotate(90.0f);
        canvas.drawPath(this.L, this.H);
        if (b2) {
            canvas.scale(1.0f / n4, 1.0f);
            canvas.drawRect(0.0f, n, this.J.height() - n2, -this.K, this.I);
        }
        canvas.restoreToCount(save5);
        canvas.restoreToCount(save);
    }
    
    private static int s(final float a) {
        int round;
        final int n = round = Math.round(a);
        if (n % 2 == 1) {
            round = n - 1;
        }
        return round;
    }
    
    @Override
    public void draw(@j0 final Canvas canvas) {
        if (this.Q) {
            this.c(this.getBounds());
            this.Q = false;
        }
        this.g(canvas);
        super.draw(canvas);
    }
    
    @Override
    public int getOpacity() {
        return -3;
    }
    
    @Override
    public boolean getPadding(@j0 final Rect rect) {
        final int n = (int)Math.ceil(f(this.N, this.K, this.U));
        final int n2 = (int)Math.ceil(e(this.N, this.K, this.U));
        rect.set(n2, n, n2, n);
        return true;
    }
    
    public float h() {
        return this.K;
    }
    
    public float i() {
        return this.N;
    }
    
    public float j() {
        final float n = this.N;
        return Math.max(n, this.K + n * 1.5f / 2.0f) * 2.0f + this.N * 1.5f * 2.0f;
    }
    
    public float k() {
        final float n = this.N;
        return Math.max(n, this.K + n / 2.0f) * 2.0f + this.N * 2.0f;
    }
    
    public float l() {
        return this.P;
    }
    
    public void m(final boolean u) {
        this.U = u;
        this.invalidateSelf();
    }
    
    public void n(float n) {
        n = (float)Math.round(n);
        if (this.K == n) {
            return;
        }
        this.K = n;
        this.Q = true;
        this.invalidateSelf();
    }
    
    public void o(final float n) {
        this.r(this.P, n);
    }
    
    @Override
    protected void onBoundsChange(final Rect rect) {
        this.Q = true;
    }
    
    public final void p(final float v) {
        if (this.V != v) {
            this.V = v;
            this.invalidateSelf();
        }
    }
    
    public void q(final float n) {
        this.r(n, this.N);
    }
    
    public void r(float p2, float n) {
        if (p2 < 0.0f || n < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        final float n2 = (float)s(p2);
        n = (float)s(n);
        p2 = n2;
        if (n2 > n) {
            if (!this.W) {
                this.W = true;
            }
            p2 = n;
        }
        if (this.P == p2 && this.N == n) {
            return;
        }
        this.P = p2;
        this.N = n;
        this.O = (float)Math.round(p2 * 1.5f);
        this.M = n;
        this.Q = true;
        this.invalidateSelf();
    }
    
    @Override
    public void setAlpha(final int alpha) {
        super.setAlpha(alpha);
        this.H.setAlpha(alpha);
        this.I.setAlpha(alpha);
    }
}
