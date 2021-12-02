// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.renderer;

import java.util.List;
import com.flask.colorpicker.c;
import android.graphics.Color;
import com.flask.colorpicker.builder.d;
import android.graphics.Paint;

public class e extends a
{
    private Paint d;
    private float[] e;
    
    public e() {
        this.d = com.flask.colorpicker.builder.d.c().b();
        this.e = new float[3];
    }
    
    @Override
    public void a() {
        final int size = super.c.size();
        final float n = super.b.g.getWidth() / 2.0f;
        final b b = super.b;
        final int a = b.a;
        final float b2 = b.b;
        int i = 0;
        int n2 = 0;
        while (i < a) {
            final float n3 = i / (float)(a - 1) * b2;
            final float c = super.b.c;
            for (int e = this.e(n3, c), j = 0; j < e; ++j) {
                final double n4 = j;
                final double n5 = e;
                final double n6 = n4 * 6.283185307179586 / n5 + 3.141592653589793 / n5 * ((i + 1) % 2);
                final double n7 = n3;
                final float n8 = (float)(Math.cos(n6) * n7) + n;
                final float n9 = (float)(n7 * Math.sin(n6)) + n;
                final float[] e2 = this.e;
                e2[0] = (float)(n6 * 180.0 / 3.141592653589793);
                e2[1] = n3 / b2;
                e2[2] = super.b.f;
                this.d.setColor(Color.HSVToColor(e2));
                this.d.setAlpha(this.f());
                final b b3 = super.b;
                b3.g.drawCircle(n8, n9, c - b3.d, this.d);
                final List<com.flask.colorpicker.c> c2 = (List<com.flask.colorpicker.c>)super.c;
                if (n2 >= size) {
                    c2.add(new com.flask.colorpicker.c(n8, n9, this.e));
                }
                else {
                    c2.get(n2).f(n8, n9, this.e);
                }
                ++n2;
            }
            ++i;
        }
    }
}
