// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.shadow;

import androidx.core.graphics.h;
import android.graphics.LinearGradient;
import android.graphics.Region$Op;
import android.graphics.Shader;
import android.graphics.RadialGradient;
import android.graphics.Shader$TileMode;
import android.graphics.RectF;
import androidx.annotation.k0;
import android.graphics.Matrix;
import android.graphics.Canvas;
import android.graphics.Paint$Style;
import android.graphics.Path;
import androidx.annotation.j0;
import android.graphics.Paint;
import androidx.annotation.t0;

@t0({ t0.a.H })
public class b
{
    private static final int i = 68;
    private static final int j = 20;
    private static final int k = 0;
    private static final int[] l;
    private static final float[] m;
    private static final int[] n;
    private static final float[] o;
    @j0
    private final Paint a;
    @j0
    private final Paint b;
    @j0
    private final Paint c;
    private int d;
    private int e;
    private int f;
    private final Path g;
    private Paint h;
    
    static {
        l = new int[3];
        m = new float[] { 0.0f, 0.5f, 1.0f };
        n = new int[4];
        o = new float[] { 0.0f, 0.0f, 0.5f, 1.0f };
    }
    
    public b() {
        this(-16777216);
    }
    
    public b(final int n) {
        this.g = new Path();
        this.h = new Paint();
        this.a = new Paint();
        this.d(n);
        this.h.setColor(0);
        final Paint b = new Paint(4);
        (this.b = b).setStyle(Paint$Style.FILL);
        this.c = new Paint(b);
    }
    
    public void a(@j0 final Canvas canvas, @k0 final Matrix matrix, @j0 final RectF rectF, final int n, final float n2, final float n3) {
        final boolean b = n3 < 0.0f;
        final Path g = this.g;
        if (b) {
            final int[] n4 = com.google.android.material.shadow.b.n;
            n4[0] = 0;
            n4[1] = this.f;
            n4[2] = this.e;
            n4[3] = this.d;
        }
        else {
            g.rewind();
            g.moveTo(rectF.centerX(), rectF.centerY());
            g.arcTo(rectF, n2, n3);
            g.close();
            final float n5 = (float)(-n);
            rectF.inset(n5, n5);
            final int[] n6 = com.google.android.material.shadow.b.n;
            n6[0] = 0;
            n6[1] = this.d;
            n6[2] = this.e;
            n6[3] = this.f;
        }
        final float n7 = rectF.width() / 2.0f;
        if (n7 <= 0.0f) {
            return;
        }
        final float n8 = 1.0f - n / n7;
        final float n9 = (1.0f - n8) / 2.0f;
        final float[] o = com.google.android.material.shadow.b.o;
        o[2] = n9 + (o[1] = n8);
        this.b.setShader((Shader)new RadialGradient(rectF.centerX(), rectF.centerY(), n7, com.google.android.material.shadow.b.n, o, Shader$TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!b) {
            canvas.clipPath(g, Region$Op.DIFFERENCE);
            canvas.drawPath(g, this.h);
        }
        canvas.drawArc(rectF, n2, n3, true, this.b);
        canvas.restore();
    }
    
    public void b(@j0 final Canvas canvas, @k0 final Matrix matrix, @j0 final RectF rectF, final int n) {
        rectF.bottom += n;
        rectF.offset(0.0f, (float)(-n));
        final int[] l = com.google.android.material.shadow.b.l;
        l[0] = this.f;
        l[1] = this.e;
        l[2] = this.d;
        final Paint c = this.c;
        final float left = rectF.left;
        c.setShader((Shader)new LinearGradient(left, rectF.top, left, rectF.bottom, l, com.google.android.material.shadow.b.m, Shader$TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.c);
        canvas.restore();
    }
    
    @j0
    public Paint c() {
        return this.a;
    }
    
    public void d(final int n) {
        this.d = androidx.core.graphics.h.B(n, 68);
        this.e = androidx.core.graphics.h.B(n, 20);
        this.f = androidx.core.graphics.h.B(n, 0);
        this.a.setColor(this.d);
    }
}
