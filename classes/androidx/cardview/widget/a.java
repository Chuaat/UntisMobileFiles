// 
// Decompiled by Procyon v0.5.36
// 

package androidx.cardview.widget;

import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Canvas;
import androidx.annotation.p0;

@p0(17)
class a extends c
{
    @Override
    public void j() {
        g.s = (g.a)new g.a() {
            @Override
            public void a(final Canvas canvas, final RectF rectF, final float n, final Paint paint) {
                canvas.drawRoundRect(rectF, n, n, paint);
            }
        };
    }
}
