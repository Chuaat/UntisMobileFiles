// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.graphics.drawable;

import android.util.DisplayMetrics;
import android.graphics.Shader;
import android.graphics.ColorFilter;
import androidx.annotation.j0;
import android.graphics.Canvas;
import androidx.annotation.k0;
import android.graphics.Shader$TileMode;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.Matrix;
import android.graphics.BitmapShader;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

public abstract class g extends Drawable
{
    private static final int n = 3;
    final Bitmap a;
    private int b;
    private int c;
    private final Paint d;
    private final BitmapShader e;
    private final Matrix f;
    private float g;
    final Rect h;
    private final RectF i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    
    g(final Resources resources, final Bitmap a) {
        this.b = 160;
        this.c = 119;
        this.d = new Paint(3);
        this.f = new Matrix();
        this.h = new Rect();
        this.i = new RectF();
        this.j = true;
        if (resources != null) {
            this.b = resources.getDisplayMetrics().densityDpi;
        }
        BitmapShader e;
        if ((this.a = a) != null) {
            this.a();
            final Shader$TileMode clamp = Shader$TileMode.CLAMP;
            e = new BitmapShader(a, clamp, clamp);
        }
        else {
            this.m = -1;
            this.l = -1;
            e = null;
        }
        this.e = e;
    }
    
    private void a() {
        this.l = this.a.getScaledWidth(this.b);
        this.m = this.a.getScaledHeight(this.b);
    }
    
    private static boolean j(final float n) {
        return n > 0.05f;
    }
    
    private void s() {
        this.g = (float)(Math.min(this.m, this.l) / 2);
    }
    
    @k0
    public final Bitmap b() {
        return this.a;
    }
    
    public float c() {
        return this.g;
    }
    
    public int d() {
        return this.c;
    }
    
    public void draw(@j0 final Canvas canvas) {
        final Bitmap a = this.a;
        if (a == null) {
            return;
        }
        this.t();
        if (this.d.getShader() == null) {
            canvas.drawBitmap(a, (Rect)null, this.h, this.d);
        }
        else {
            final RectF i = this.i;
            final float g = this.g;
            canvas.drawRoundRect(i, g, g, this.d);
        }
    }
    
    @j0
    public final Paint e() {
        return this.d;
    }
    
    void f(final int n, final int n2, final int n3, final Rect rect, final Rect rect2) {
        throw new UnsupportedOperationException();
    }
    
    public boolean g() {
        return this.d.isAntiAlias();
    }
    
    public int getAlpha() {
        return this.d.getAlpha();
    }
    
    public ColorFilter getColorFilter() {
        return this.d.getColorFilter();
    }
    
    public int getIntrinsicHeight() {
        return this.m;
    }
    
    public int getIntrinsicWidth() {
        return this.l;
    }
    
    public int getOpacity() {
        final int c = this.c;
        int n2;
        final int n = n2 = -3;
        if (c == 119) {
            if (this.k) {
                n2 = n;
            }
            else {
                final Bitmap a = this.a;
                n2 = n;
                if (a != null) {
                    n2 = n;
                    if (!a.hasAlpha()) {
                        n2 = n;
                        if (this.d.getAlpha() >= 255) {
                            if (j(this.g)) {
                                n2 = n;
                            }
                            else {
                                n2 = -1;
                            }
                        }
                    }
                }
            }
        }
        return n2;
    }
    
    public boolean h() {
        throw new UnsupportedOperationException();
    }
    
    public boolean i() {
        return this.k;
    }
    
    public void k(final boolean antiAlias) {
        this.d.setAntiAlias(antiAlias);
        this.invalidateSelf();
    }
    
    public void l(final boolean k) {
        this.k = k;
        this.j = true;
        if (k) {
            this.s();
            this.d.setShader((Shader)this.e);
            this.invalidateSelf();
        }
        else {
            this.m(0.0f);
        }
    }
    
    public void m(final float g) {
        if (this.g == g) {
            return;
        }
        this.k = false;
        Paint paint;
        Object e;
        if (j(g)) {
            paint = this.d;
            e = this.e;
        }
        else {
            paint = this.d;
            e = null;
        }
        paint.setShader((Shader)e);
        this.g = g;
        this.invalidateSelf();
    }
    
    public void n(final int c) {
        if (this.c != c) {
            this.c = c;
            this.j = true;
            this.invalidateSelf();
        }
    }
    
    public void o(final boolean b) {
        throw new UnsupportedOperationException();
    }
    
    protected void onBoundsChange(final Rect rect) {
        super.onBoundsChange(rect);
        if (this.k) {
            this.s();
        }
        this.j = true;
    }
    
    public void p(final int n) {
        if (this.b != n) {
            int b;
            if ((b = n) == 0) {
                b = 160;
            }
            this.b = b;
            if (this.a != null) {
                this.a();
            }
            this.invalidateSelf();
        }
    }
    
    public void q(@j0 final Canvas canvas) {
        this.p(canvas.getDensity());
    }
    
    public void r(@j0 final DisplayMetrics displayMetrics) {
        this.p(displayMetrics.densityDpi);
    }
    
    public void setAlpha(final int alpha) {
        if (alpha != this.d.getAlpha()) {
            this.d.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public void setDither(final boolean dither) {
        this.d.setDither(dither);
        this.invalidateSelf();
    }
    
    public void setFilterBitmap(final boolean filterBitmap) {
        this.d.setFilterBitmap(filterBitmap);
        this.invalidateSelf();
    }
    
    void t() {
        if (this.j) {
            if (this.k) {
                final int min = Math.min(this.l, this.m);
                this.f(this.c, min, min, this.getBounds(), this.h);
                final int min2 = Math.min(this.h.width(), this.h.height());
                this.h.inset(Math.max(0, (this.h.width() - min2) / 2), Math.max(0, (this.h.height() - min2) / 2));
                this.g = min2 * 0.5f;
            }
            else {
                this.f(this.c, this.l, this.m, this.getBounds(), this.h);
            }
            this.i.set(this.h);
            if (this.e != null) {
                final Matrix f = this.f;
                final RectF i = this.i;
                f.setTranslate(i.left, i.top);
                this.f.preScale(this.i.width() / this.a.getWidth(), this.i.height() / this.a.getHeight());
                this.e.setLocalMatrix(this.f);
                this.d.setShader((Shader)this.e);
            }
            this.j = false;
        }
    }
}
