// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.circularreveal;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import androidx.annotation.l;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Color;
import android.graphics.Path$Direction;
import w2.a;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import androidx.annotation.k0;
import android.graphics.Paint;
import android.graphics.Path;
import androidx.annotation.j0;
import android.view.View;

public class d
{
    private static final boolean k = false;
    public static final int l = 0;
    public static final int m = 1;
    public static final int n = 2;
    public static final int o;
    private final a a;
    @j0
    private final View b;
    @j0
    private final Path c;
    @j0
    private final Paint d;
    @j0
    private final Paint e;
    @k0
    private g.e f;
    @k0
    private Drawable g;
    private Paint h;
    private boolean i;
    private boolean j;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        int o2;
        if (sdk_INT >= 21) {
            o2 = 2;
        }
        else if (sdk_INT >= 18) {
            o2 = 1;
        }
        else {
            o2 = 0;
        }
        o = o2;
    }
    
    public d(final a a) {
        this.a = a;
        (this.b = (View)a).setWillNotDraw(false);
        this.c = new Path();
        this.d = new Paint(7);
        (this.e = new Paint(1)).setColor(0);
    }
    
    private void d(@j0 final Canvas canvas, final int color, final float strokeWidth) {
        this.h.setColor(color);
        this.h.setStrokeWidth(strokeWidth);
        final g.e f = this.f;
        canvas.drawCircle(f.a, f.b, f.c - strokeWidth / 2.0f, this.h);
    }
    
    private void e(@j0 final Canvas canvas) {
        this.a.c(canvas);
        if (this.r()) {
            final g.e f = this.f;
            canvas.drawCircle(f.a, f.b, f.c, this.e);
        }
        if (this.p()) {
            this.d(canvas, -16777216, 10.0f);
            this.d(canvas, -65536, 5.0f);
        }
        this.f(canvas);
    }
    
    private void f(@j0 final Canvas canvas) {
        if (this.q()) {
            final Rect bounds = this.g.getBounds();
            final float n = this.f.a - bounds.width() / 2.0f;
            final float n2 = this.f.b - bounds.height() / 2.0f;
            canvas.translate(n, n2);
            this.g.draw(canvas);
            canvas.translate(-n, -n2);
        }
    }
    
    private float i(@j0 final g.e e) {
        return w2.a.b(e.a, e.b, 0.0f, 0.0f, (float)this.b.getWidth(), (float)this.b.getHeight());
    }
    
    private void k() {
        if (com.google.android.material.circularreveal.d.o == 1) {
            this.c.rewind();
            final g.e f = this.f;
            if (f != null) {
                this.c.addCircle(f.a, f.b, f.c, Path$Direction.CW);
            }
        }
        this.b.invalidate();
    }
    
    private boolean p() {
        final g.e f = this.f;
        final boolean b = false;
        final boolean b2 = f == null || f.a();
        if (com.google.android.material.circularreveal.d.o == 0) {
            boolean b3 = b;
            if (!b2) {
                b3 = b;
                if (this.j) {
                    b3 = true;
                }
            }
            return b3;
        }
        return b2 ^ true;
    }
    
    private boolean q() {
        return !this.i && this.g != null && this.f != null;
    }
    
    private boolean r() {
        return !this.i && Color.alpha(this.e.getColor()) != 0;
    }
    
    public void a() {
        if (com.google.android.material.circularreveal.d.o == 0) {
            this.i = true;
            this.j = false;
            this.b.buildDrawingCache();
            final Bitmap drawingCache = this.b.getDrawingCache();
            Bitmap bitmap;
            if ((bitmap = drawingCache) == null) {
                bitmap = drawingCache;
                if (this.b.getWidth() != 0) {
                    bitmap = drawingCache;
                    if (this.b.getHeight() != 0) {
                        bitmap = Bitmap.createBitmap(this.b.getWidth(), this.b.getHeight(), Bitmap$Config.ARGB_8888);
                        this.b.draw(new Canvas(bitmap));
                    }
                }
            }
            if (bitmap != null) {
                final Paint d = this.d;
                final Shader$TileMode clamp = Shader$TileMode.CLAMP;
                d.setShader((Shader)new BitmapShader(bitmap, clamp, clamp));
            }
            this.i = false;
            this.j = true;
        }
    }
    
    public void b() {
        if (com.google.android.material.circularreveal.d.o == 0) {
            this.j = false;
            this.b.destroyDrawingCache();
            this.d.setShader((Shader)null);
            this.b.invalidate();
        }
    }
    
    public void c(@j0 final Canvas canvas) {
        Label_0246: {
            if (this.p()) {
                final int o = com.google.android.material.circularreveal.d.o;
                if (o != 0) {
                    if (o == 1) {
                        final int save = canvas.save();
                        canvas.clipPath(this.c);
                        this.a.c(canvas);
                        if (this.r()) {
                            canvas.drawRect(0.0f, 0.0f, (float)this.b.getWidth(), (float)this.b.getHeight(), this.e);
                        }
                        canvas.restoreToCount(save);
                        break Label_0246;
                    }
                    if (o != 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported strategy ");
                        sb.append(o);
                        throw new IllegalStateException(sb.toString());
                    }
                    this.a.c(canvas);
                    if (!this.r()) {
                        break Label_0246;
                    }
                }
                else {
                    final g.e f = this.f;
                    canvas.drawCircle(f.a, f.b, f.c, this.d);
                    if (this.r()) {
                        final g.e f2 = this.f;
                        canvas.drawCircle(f2.a, f2.b, f2.c, this.e);
                    }
                    break Label_0246;
                }
            }
            else {
                this.a.c(canvas);
                if (!this.r()) {
                    break Label_0246;
                }
            }
            canvas.drawRect(0.0f, 0.0f, (float)this.b.getWidth(), (float)this.b.getHeight(), this.e);
        }
        this.f(canvas);
    }
    
    @k0
    public Drawable g() {
        return this.g;
    }
    
    @l
    public int h() {
        return this.e.getColor();
    }
    
    @k0
    public g.e j() {
        final g.e f = this.f;
        if (f == null) {
            return null;
        }
        final g.e e = new g.e(f);
        if (e.a()) {
            e.c = this.i(e);
        }
        return e;
    }
    
    public boolean l() {
        return this.a.d() && !this.p();
    }
    
    public void m(@k0 final Drawable g) {
        this.g = g;
        this.b.invalidate();
    }
    
    public void n(@l final int color) {
        this.e.setColor(color);
        this.b.invalidate();
    }
    
    public void o(@k0 final g.e e) {
        if (e == null) {
            this.f = null;
        }
        else {
            final g.e f = this.f;
            if (f == null) {
                this.f = new g.e(e);
            }
            else {
                f.c(e);
            }
            if (w2.a.e(e.c, this.i(e), 1.0E-4f)) {
                this.f.c = Float.MAX_VALUE;
            }
        }
        this.k();
    }
    
    public interface a
    {
        void c(final Canvas p0);
        
        boolean d();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }
}
