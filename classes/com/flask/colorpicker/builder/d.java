// 
// Decompiled by Procyon v0.5.36
// 

package com.flask.colorpicker.builder;

import android.graphics.Paint$Style;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Shader;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public class d
{
    private static Bitmap a(int i) {
        final Paint b = c().b();
        final Bitmap bitmap = Bitmap.createBitmap(i, i, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final int round = Math.round(i / 2.0f);
        int j;
        int color;
        float n;
        float n2;
        float n3;
        for (i = 0; i < 2; ++i) {
            j = 0;
            while (j < 2) {
                if ((i + j) % 2 == 0) {
                    color = -1;
                }
                else {
                    color = -3092272;
                }
                b.setColor(color);
                n = (float)(i * round);
                n2 = (float)(j * round);
                n3 = (float)((i + 1) * round);
                ++j;
                canvas.drawRect(n, n2, n3, (float)(j * round), b);
            }
        }
        return bitmap;
    }
    
    public static Shader b(final int n) {
        final Bitmap a = a(Math.max(8, n / 2 * 2));
        final Shader$TileMode repeat = Shader$TileMode.REPEAT;
        return (Shader)new BitmapShader(a, repeat, repeat);
    }
    
    public static b c() {
        return new b();
    }
    
    public static class b
    {
        private Paint a;
        
        private b() {
            this.a = new Paint(1);
        }
        
        public b a(final boolean antiAlias) {
            this.a.setAntiAlias(antiAlias);
            return this;
        }
        
        public Paint b() {
            return this.a;
        }
        
        public b c(final int color) {
            this.a.setColor(color);
            return this;
        }
        
        public b d(final PorterDuff$Mode porterDuff$Mode) {
            this.a.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
            return this;
        }
        
        public b e(final Shader shader) {
            this.a.setShader(shader);
            return this;
        }
        
        public b f(final float strokeWidth) {
            this.a.setStrokeWidth(strokeWidth);
            return this;
        }
        
        public b g(final Paint$Style style) {
            this.a.setStyle(style);
            return this;
        }
        
        public b h(final PorterDuff$Mode porterDuff$Mode) {
            this.a.setXfermode((Xfermode)new PorterDuffXfermode(porterDuff$Mode));
            return this;
        }
    }
}
