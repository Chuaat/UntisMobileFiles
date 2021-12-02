// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.help;

import android.graphics.Path;
import android.graphics.Paint$Style;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.annotation.j0;
import android.graphics.Canvas;

public class h extends g
{
    private static final float P = 3.0f;
    private float K;
    private float L;
    private float M;
    private float N;
    private float O;
    
    public h(final float k, final float l, final float m, final float n, final float o) {
        super(k, l, m, n);
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
    }
    
    @Override
    void b(@j0 final Canvas canvas) {
        final Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#FF6F00"));
        paint.setStyle(Paint$Style.STROKE);
        paint.setStrokeWidth(this.O * 3.0f);
        final float m = this.M;
        final float k = this.K;
        final float n = (m - k) / 2.0f;
        final float l = this.L;
        final float n2 = l + (this.N - l) / 2.0f;
        canvas.drawLine(n, n2, n + (m - k) / 8.0f, n2, paint);
        final Path path = new Path();
        path.moveTo((this.M - this.K) / 10.0f + n, n2 - (this.N - this.L) / 8.0f);
        path.lineTo((this.M - this.K) / 8.0f + n, n2);
        path.lineTo(n + (this.M - this.K) / 10.0f, n2 + (this.N - this.L) / 8.0f);
        canvas.drawPath(path, paint);
    }
}
