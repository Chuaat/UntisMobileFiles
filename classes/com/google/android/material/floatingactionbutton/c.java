// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.graphics.ColorFilter;
import androidx.annotation.b0;
import android.annotation.TargetApi;
import android.graphics.Outline;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import androidx.core.graphics.h;
import android.graphics.Shader;
import android.graphics.Paint$Style;
import androidx.annotation.k0;
import android.content.res.ColorStateList;
import com.google.android.material.shape.o;
import androidx.annotation.l;
import androidx.annotation.q;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Path;
import androidx.annotation.j0;
import android.graphics.Paint;
import com.google.android.material.shape.p;
import androidx.annotation.t0;
import android.graphics.drawable.Drawable;

@t0({ t0.a.H })
class c extends Drawable
{
    private static final float q = 1.3333f;
    private final p a;
    @j0
    private final Paint b;
    private final Path c;
    private final Rect d;
    private final RectF e;
    private final RectF f;
    private final b g;
    @q
    float h;
    @l
    private int i;
    @l
    private int j;
    @l
    private int k;
    @l
    private int l;
    @l
    private int m;
    private boolean n;
    private o o;
    @k0
    private ColorStateList p;
    
    c(final o o) {
        this.a = com.google.android.material.shape.p.k();
        this.c = new Path();
        this.d = new Rect();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new b();
        this.n = true;
        this.o = o;
        (this.b = new Paint(1)).setStyle(Paint$Style.STROKE);
    }
    
    @j0
    private Shader a() {
        final Rect d = this.d;
        this.copyBounds(d);
        final float n = this.h / d.height();
        return (Shader)new LinearGradient(0.0f, (float)d.top, 0.0f, (float)d.bottom, new int[] { androidx.core.graphics.h.t(this.i, this.m), androidx.core.graphics.h.t(this.j, this.m), androidx.core.graphics.h.t(androidx.core.graphics.h.B(this.j, 0), this.m), androidx.core.graphics.h.t(androidx.core.graphics.h.B(this.l, 0), this.m), androidx.core.graphics.h.t(this.l, this.m), androidx.core.graphics.h.t(this.k, this.m) }, new float[] { 0.0f, n, 0.5f, 0.5f, 1.0f - n, 1.0f }, Shader$TileMode.CLAMP);
    }
    
    @j0
    protected RectF b() {
        this.f.set(this.getBounds());
        return this.f;
    }
    
    public o c() {
        return this.o;
    }
    
    void d(@k0 final ColorStateList p) {
        if (p != null) {
            this.m = p.getColorForState(this.getState(), this.m);
        }
        this.p = p;
        this.n = true;
        this.invalidateSelf();
    }
    
    public void draw(@j0 final Canvas canvas) {
        if (this.n) {
            this.b.setShader(this.a());
            this.n = false;
        }
        final float n = this.b.getStrokeWidth() / 2.0f;
        this.copyBounds(this.d);
        this.e.set(this.d);
        final float min = Math.min(this.o.r().a(this.b()), this.e.width() / 2.0f);
        if (this.o.u(this.b())) {
            this.e.inset(n, n);
            canvas.drawRoundRect(this.e, min, min, this.b);
        }
    }
    
    public void e(@q final float h) {
        if (this.h != h) {
            this.h = h;
            this.b.setStrokeWidth(h * 1.3333f);
            this.n = true;
            this.invalidateSelf();
        }
    }
    
    void f(@l final int i, @l final int j, @l final int k, @l final int l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public void g(final o o) {
        this.o = o;
        this.invalidateSelf();
    }
    
    @k0
    public Drawable$ConstantState getConstantState() {
        return this.g;
    }
    
    public int getOpacity() {
        int n;
        if (this.h > 0.0f) {
            n = -3;
        }
        else {
            n = -2;
        }
        return n;
    }
    
    @TargetApi(21)
    public void getOutline(@j0 final Outline outline) {
        if (this.o.u(this.b())) {
            outline.setRoundRect(this.getBounds(), this.o.r().a(this.b()));
            return;
        }
        this.copyBounds(this.d);
        this.e.set(this.d);
        this.a.d(this.o, 1.0f, this.e, this.c);
        if (this.c.isConvex()) {
            outline.setConvexPath(this.c);
        }
    }
    
    public boolean getPadding(@j0 final Rect rect) {
        if (this.o.u(this.b())) {
            final int round = Math.round(this.h);
            rect.set(round, round, round, round);
        }
        return true;
    }
    
    public boolean isStateful() {
        final ColorStateList p = this.p;
        return (p != null && p.isStateful()) || super.isStateful();
    }
    
    protected void onBoundsChange(final Rect rect) {
        this.n = true;
    }
    
    protected boolean onStateChange(final int[] array) {
        final ColorStateList p = this.p;
        if (p != null) {
            final int colorForState = p.getColorForState(array, this.m);
            if (colorForState != this.m) {
                this.n = true;
                this.m = colorForState;
            }
        }
        if (this.n) {
            this.invalidateSelf();
        }
        return this.n;
    }
    
    public void setAlpha(@b0(from = 0L, to = 255L) final int alpha) {
        this.b.setAlpha(alpha);
        this.invalidateSelf();
    }
    
    public void setColorFilter(@k0 final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    private class b extends Drawable$ConstantState
    {
        public int getChangingConfigurations() {
            return 0;
        }
        
        @j0
        public Drawable newDrawable() {
            return com.google.android.material.floatingactionbutton.c.this;
        }
    }
}
