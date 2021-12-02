// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.graphics.drawable;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.ColorFilter;
import androidx.annotation.t;
import androidx.annotation.l;
import android.graphics.Rect;
import androidx.core.graphics.drawable.c;
import android.graphics.Canvas;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import c.a;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import android.content.Context;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public class d extends Drawable
{
    public static final int m = 0;
    public static final int n = 1;
    public static final int o = 2;
    public static final int p = 3;
    private static final float q;
    private final Paint a;
    private float b;
    private float c;
    private float d;
    private float e;
    private boolean f;
    private final Path g;
    private final int h;
    private boolean i;
    private float j;
    private float k;
    private int l;
    
    static {
        q = (float)Math.toRadians(45.0);
    }
    
    public d(final Context context) {
        final Paint a = new Paint();
        this.a = a;
        this.g = new Path();
        this.i = false;
        this.l = 2;
        a.setStyle(Paint$Style.STROKE);
        a.setStrokeJoin(Paint$Join.MITER);
        a.setStrokeCap(Paint$Cap.BUTT);
        a.setAntiAlias(true);
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)null, c.a.n.O3, c.a.c.m1, c.a.m.v1);
        this.p(obtainStyledAttributes.getColor(c.a.n.S3, 0));
        this.o(obtainStyledAttributes.getDimension(c.a.n.W3, 0.0f));
        this.s(obtainStyledAttributes.getBoolean(c.a.n.V3, true));
        this.r((float)Math.round(obtainStyledAttributes.getDimension(c.a.n.U3, 0.0f)));
        this.h = obtainStyledAttributes.getDimensionPixelSize(c.a.n.T3, 0);
        this.c = (float)Math.round(obtainStyledAttributes.getDimension(c.a.n.R3, 0.0f));
        this.b = (float)Math.round(obtainStyledAttributes.getDimension(c.a.n.P3, 0.0f));
        this.d = obtainStyledAttributes.getDimension(c.a.n.Q3, 0.0f);
        obtainStyledAttributes.recycle();
    }
    
    private static float k(final float n, final float n2, final float n3) {
        return n + (n2 - n) * n3;
    }
    
    public float a() {
        return this.b;
    }
    
    public float b() {
        return this.d;
    }
    
    public float c() {
        return this.c;
    }
    
    public float d() {
        return this.a.getStrokeWidth();
    }
    
    public void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        final int l = this.l;
        boolean b2;
        final boolean b = b2 = false;
        Label_0060: {
            if (l != 0) {
                if (l != 1) {
                    if (l != 3) {
                        b2 = b;
                        if (androidx.core.graphics.drawable.c.f(this) != 1) {
                            break Label_0060;
                        }
                    }
                    else {
                        b2 = b;
                        if (androidx.core.graphics.drawable.c.f(this) != 0) {
                            break Label_0060;
                        }
                    }
                }
                b2 = true;
            }
        }
        final float b3 = this.b;
        final float k = k(this.c, (float)Math.sqrt(b3 * b3 * 2.0f), this.j);
        final float i = k(this.c, this.d, this.j);
        final float n = (float)Math.round(k(0.0f, this.k, this.j));
        final float j = k(0.0f, androidx.appcompat.graphics.drawable.d.q, this.j);
        float n2;
        if (b2) {
            n2 = 0.0f;
        }
        else {
            n2 = -180.0f;
        }
        float n3;
        if (b2) {
            n3 = 180.0f;
        }
        else {
            n3 = 0.0f;
        }
        final float m = k(n2, n3, this.j);
        final double n4 = k;
        final double n5 = j;
        final float n6 = (float)Math.round(Math.cos(n5) * n4);
        final float n7 = (float)Math.round(n4 * Math.sin(n5));
        this.g.rewind();
        final float k2 = k(this.e + this.a.getStrokeWidth(), -this.k, this.j);
        final float n8 = -i / 2.0f;
        this.g.moveTo(n8 + n, 0.0f);
        this.g.rLineTo(i - n * 2.0f, 0.0f);
        this.g.moveTo(n8, k2);
        this.g.rLineTo(n6, n7);
        this.g.moveTo(n8, -k2);
        this.g.rLineTo(n6, -n7);
        this.g.close();
        canvas.save();
        final float strokeWidth = this.a.getStrokeWidth();
        final float n9 = (float)bounds.height();
        final float e = this.e;
        canvas.translate((float)bounds.centerX(), (int)(n9 - 3.0f * strokeWidth - 2.0f * e) / 4 * 2 + (strokeWidth * 1.5f + e));
        if (this.f) {
            int n10;
            if (this.i ^ b2) {
                n10 = -1;
            }
            else {
                n10 = 1;
            }
            canvas.rotate(m * n10);
        }
        else if (b2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.g, this.a);
        canvas.restore();
    }
    
    @l
    public int e() {
        return this.a.getColor();
    }
    
    public int f() {
        return this.l;
    }
    
    public float g() {
        return this.e;
    }
    
    public int getIntrinsicHeight() {
        return this.h;
    }
    
    public int getIntrinsicWidth() {
        return this.h;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public final Paint h() {
        return this.a;
    }
    
    @t(from = 0.0, to = 1.0)
    public float i() {
        return this.j;
    }
    
    public boolean j() {
        return this.f;
    }
    
    public void l(final float b) {
        if (this.b != b) {
            this.b = b;
            this.invalidateSelf();
        }
    }
    
    public void m(final float d) {
        if (this.d != d) {
            this.d = d;
            this.invalidateSelf();
        }
    }
    
    public void n(final float c) {
        if (this.c != c) {
            this.c = c;
            this.invalidateSelf();
        }
    }
    
    public void o(final float strokeWidth) {
        if (this.a.getStrokeWidth() != strokeWidth) {
            this.a.setStrokeWidth(strokeWidth);
            this.k = (float)(strokeWidth / 2.0f * Math.cos(androidx.appcompat.graphics.drawable.d.q));
            this.invalidateSelf();
        }
    }
    
    public void p(@l final int color) {
        if (color != this.a.getColor()) {
            this.a.setColor(color);
            this.invalidateSelf();
        }
    }
    
    public void q(final int l) {
        if (l != this.l) {
            this.l = l;
            this.invalidateSelf();
        }
    }
    
    public void r(final float e) {
        if (e != this.e) {
            this.e = e;
            this.invalidateSelf();
        }
    }
    
    public void s(final boolean f) {
        if (this.f != f) {
            this.f = f;
            this.invalidateSelf();
        }
    }
    
    public void setAlpha(final int alpha) {
        if (alpha != this.a.getAlpha()) {
            this.a.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.a.setColorFilter(colorFilter);
        this.invalidateSelf();
    }
    
    public void setProgress(@t(from = 0.0, to = 1.0) final float j) {
        if (this.j != j) {
            this.j = j;
            this.invalidateSelf();
        }
    }
    
    public void t(final boolean i) {
        if (this.i != i) {
            this.i = i;
            this.invalidateSelf();
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.I })
    public @interface a {
    }
}
