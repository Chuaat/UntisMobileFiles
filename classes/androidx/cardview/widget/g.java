// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cardview.widget;

import android.graphics.ColorFilter;
import androidx.annotation.k0;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Path$FillType;
import android.graphics.Rect;
import android.graphics.Paint$Style;
import i.a;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

class g extends Drawable
{
    private static final double q;
    private static final float r = 1.5f;
    static a s;
    private final int a;
    private Paint b;
    private Paint c;
    private Paint d;
    private final RectF e;
    private float f;
    private Path g;
    private float h;
    private float i;
    private float j;
    private ColorStateList k;
    private boolean l;
    private final int m;
    private final int n;
    private boolean o;
    private boolean p;
    
    static {
        q = Math.cos(Math.toRadians(45.0));
    }
    
    g(final Resources resources, final ColorStateList list, final float n, final float n2, final float n3) {
        this.l = true;
        this.o = true;
        this.p = false;
        this.m = resources.getColor(i.a.b.d);
        this.n = resources.getColor(i.a.b.c);
        this.a = resources.getDimensionPixelSize(i.a.c.a);
        this.b = new Paint(5);
        this.n(list);
        (this.c = new Paint(5)).setStyle(Paint$Style.FILL);
        this.f = (float)(int)(n + 0.5f);
        this.e = new RectF();
        (this.d = new Paint(this.c)).setAntiAlias(false);
        this.s(n2, n3);
    }
    
    private void a(final Rect rect) {
        final float h = this.h;
        final float n = 1.5f * h;
        this.e.set(rect.left + h, rect.top + n, rect.right - h, rect.bottom - n);
        this.b();
    }
    
    private void b() {
        final float f = this.f;
        final RectF rectF = new RectF(-f, -f, f, f);
        final RectF rectF2 = new RectF(rectF);
        final float i = this.i;
        rectF2.inset(-i, -i);
        final Path g = this.g;
        if (g == null) {
            this.g = new Path();
        }
        else {
            g.reset();
        }
        this.g.setFillType(Path$FillType.EVEN_ODD);
        this.g.moveTo(-this.f, 0.0f);
        this.g.rLineTo(-this.i, 0.0f);
        this.g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.g.arcTo(rectF, 270.0f, -90.0f, false);
        this.g.close();
        final float f2 = this.f;
        final float n = f2 / (this.i + f2);
        final Paint c = this.c;
        final float f3 = this.f;
        final float j = this.i;
        final int m = this.m;
        c.setShader((Shader)new RadialGradient(0.0f, 0.0f, f3 + j, new int[] { m, m, this.n }, new float[] { 0.0f, n, 1.0f }, Shader$TileMode.CLAMP));
        final Paint d = this.d;
        final float f4 = this.f;
        final float n2 = -f4;
        final float k = this.i;
        final float n3 = -f4;
        final int l = this.m;
        d.setShader((Shader)new LinearGradient(0.0f, n2 + k, 0.0f, n3 - k, new int[] { l, l, this.n }, new float[] { 0.0f, 0.5f, 1.0f }, Shader$TileMode.CLAMP));
        this.d.setAntiAlias(false);
    }
    
    static float c(final float n, final float n2, final boolean b) {
        float n3 = n;
        if (b) {
            n3 = (float)(n + (1.0 - g.q) * n2);
        }
        return n3;
    }
    
    static float d(float n, final float n2, final boolean b) {
        final float n3 = n *= 1.5f;
        if (b) {
            n = (float)(n3 + (1.0 - g.q) * n2);
        }
        return n;
    }
    
    private void e(final Canvas canvas) {
        final float f = this.f;
        final float n = -f - this.i;
        final float n2 = f + this.a + this.j / 2.0f;
        final float width = this.e.width();
        final float n3 = n2 * 2.0f;
        final boolean b = width - n3 > 0.0f;
        final boolean b2 = this.e.height() - n3 > 0.0f;
        final int save = canvas.save();
        final RectF e = this.e;
        canvas.translate(e.left + n2, e.top + n2);
        canvas.drawPath(this.g, this.c);
        if (b) {
            canvas.drawRect(0.0f, n, this.e.width() - n3, -this.f, this.d);
        }
        canvas.restoreToCount(save);
        final int save2 = canvas.save();
        final RectF e2 = this.e;
        canvas.translate(e2.right - n2, e2.bottom - n2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.g, this.c);
        if (b) {
            canvas.drawRect(0.0f, n, this.e.width() - n3, -this.f + this.i, this.d);
        }
        canvas.restoreToCount(save2);
        final int save3 = canvas.save();
        final RectF e3 = this.e;
        canvas.translate(e3.left + n2, e3.bottom - n2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.g, this.c);
        if (b2) {
            canvas.drawRect(0.0f, n, this.e.height() - n3, -this.f, this.d);
        }
        canvas.restoreToCount(save3);
        final int save4 = canvas.save();
        final RectF e4 = this.e;
        canvas.translate(e4.right - n2, e4.top + n2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.g, this.c);
        if (b2) {
            canvas.drawRect(0.0f, n, this.e.height() - n3, -this.f, this.d);
        }
        canvas.restoreToCount(save4);
    }
    
    private void n(final ColorStateList list) {
        ColorStateList value = list;
        if (list == null) {
            value = ColorStateList.valueOf(0);
        }
        this.k = value;
        this.b.setColor(value.getColorForState(this.getState(), this.k.getDefaultColor()));
    }
    
    private void s(float n, float n2) {
        if (n < 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid shadow size ");
            sb.append(n);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        }
        if (n2 < 0.0f) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid max shadow size ");
            sb2.append(n2);
            sb2.append(". Must be >= 0");
            throw new IllegalArgumentException(sb2.toString());
        }
        final float n3 = (float)this.t(n);
        n2 = (float)this.t(n2);
        n = n3;
        if (n3 > n2) {
            if (!this.p) {
                this.p = true;
            }
            n = n2;
        }
        if (this.j == n && this.h == n2) {
            return;
        }
        this.j = n;
        this.h = n2;
        this.i = (float)(int)(n * 1.5f + this.a + 0.5f);
        this.l = true;
        this.invalidateSelf();
    }
    
    private int t(final float n) {
        int n3;
        final int n2 = n3 = (int)(n + 0.5f);
        if (n2 % 2 == 1) {
            n3 = n2 - 1;
        }
        return n3;
    }
    
    public void draw(final Canvas canvas) {
        if (this.l) {
            this.a(this.getBounds());
            this.l = false;
        }
        canvas.translate(0.0f, this.j / 2.0f);
        this.e(canvas);
        canvas.translate(0.0f, -this.j / 2.0f);
        androidx.cardview.widget.g.s.a(canvas, this.e, this.f, this.b);
    }
    
    ColorStateList f() {
        return this.k;
    }
    
    float g() {
        return this.f;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public boolean getPadding(final Rect rect) {
        final int n = (int)Math.ceil(d(this.h, this.f, this.o));
        final int n2 = (int)Math.ceil(c(this.h, this.f, this.o));
        rect.set(n2, n, n2, n);
        return true;
    }
    
    void h(final Rect rect) {
        this.getPadding(rect);
    }
    
    float i() {
        return this.h;
    }
    
    public boolean isStateful() {
        final ColorStateList k = this.k;
        return (k != null && k.isStateful()) || super.isStateful();
    }
    
    float j() {
        final float h = this.h;
        return Math.max(h, this.f + this.a + h * 1.5f / 2.0f) * 2.0f + (this.h * 1.5f + this.a) * 2.0f;
    }
    
    float k() {
        final float h = this.h;
        return Math.max(h, this.f + this.a + h / 2.0f) * 2.0f + (this.h + this.a) * 2.0f;
    }
    
    float l() {
        return this.j;
    }
    
    void m(final boolean o) {
        this.o = o;
        this.invalidateSelf();
    }
    
    void o(@k0 final ColorStateList list) {
        this.n(list);
        this.invalidateSelf();
    }
    
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        this.l = true;
    }
    
    protected boolean onStateChange(final int[] array) {
        final ColorStateList k = this.k;
        final int colorForState = k.getColorForState(array, k.getDefaultColor());
        if (this.b.getColor() == colorForState) {
            return false;
        }
        this.b.setColor(colorForState);
        this.l = true;
        this.invalidateSelf();
        return true;
    }
    
    void p(float n) {
        if (n < 0.0f) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Invalid radius ");
            sb.append(n);
            sb.append(". Must be >= 0");
            throw new IllegalArgumentException(sb.toString());
        }
        n = (float)(int)(n + 0.5f);
        if (this.f == n) {
            return;
        }
        this.f = n;
        this.l = true;
        this.invalidateSelf();
    }
    
    void q(final float n) {
        this.s(this.j, n);
    }
    
    void r(final float n) {
        this.s(n, this.h);
    }
    
    public void setAlpha(final int alpha) {
        this.b.setAlpha(alpha);
        this.c.setAlpha(alpha);
        this.d.setAlpha(alpha);
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
    }
    
    interface a
    {
        void a(final Canvas p0, final RectF p1, final float p2, final Paint p3);
    }
}
