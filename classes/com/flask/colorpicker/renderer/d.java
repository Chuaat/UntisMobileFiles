// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.renderer;

import java.util.List;
import com.flask.colorpicker.c;
import android.graphics.Color;
import android.graphics.Paint;

public class d extends a
{
    private Paint d;
    private float[] e;
    private float f;
    
    public d() {
        this.d = com.flask.colorpicker.builder.d.c().b();
        this.e = new float[3];
        this.f = 1.2f;
    }
    
    @Override
    public void a() {
        final int size = super.c.size();
        final float n = super.b.g.getWidth() / 2.0f;
        final b b = super.b;
        final int a = b.a;
        final float d = b.d;
        final float b2 = b.b;
        final float c = b.c;
        int i = 0;
        int n2 = 0;
        while (i < a) {
            final float n3 = (float)i;
            final float n4 = n3 / (a - 1);
            final float n5 = (float)a;
            final float n6 = (n3 - n5 / 2.0f) / n5;
            final float n7 = n4 * b2;
            float n8;
            if (i == 0) {
                n8 = 0.0f;
            }
            else {
                n8 = n6 * (this.f * c);
            }
            final float max = Math.max(1.5f + d, n8 + c);
            for (int min = Math.min(this.e(n7, max), a * 2), j = 0; j < min; ++j) {
                final double n9 = j;
                final double n10 = min;
                final double n11 = n9 * 6.283185307179586 / n10 + 3.141592653589793 / n10 * ((i + 1) % 2);
                final double n12 = n7;
                final float n13 = (float)(Math.cos(n11) * n12) + n;
                final float n14 = (float)(n12 * Math.sin(n11)) + n;
                final float[] e = this.e;
                e[0] = (float)(n11 * 180.0 / 3.141592653589793);
                e[1] = n7 / b2;
                e[2] = super.b.f;
                this.d.setColor(Color.HSVToColor(e));
                this.d.setAlpha(this.f());
                super.b.g.drawCircle(n13, n14, max - d, this.d);
                final List<com.flask.colorpicker.c> c2 = (List<com.flask.colorpicker.c>)super.c;
                if (n2 >= size) {
                    c2.add(new com.flask.colorpicker.c(n13, n14, this.e));
                }
                else {
                    c2.get(n2).f(n13, n14, this.e);
                }
                ++n2;
            }
            ++i;
        }
    }
}
