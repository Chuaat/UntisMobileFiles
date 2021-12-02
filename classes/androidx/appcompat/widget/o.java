// 
// Decompiled by Procyon v0.5.36
// 

package androidx.appcompat.widget;

import android.util.AttributeSet;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.Shader;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.LayerDrawable;
import androidx.core.graphics.drawable.j;
import android.graphics.drawable.Drawable;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.graphics.Bitmap;
import android.widget.ProgressBar;

class o
{
    private static final int[] c;
    private final ProgressBar a;
    private Bitmap b;
    
    static {
        c = new int[] { 16843067, 16843068 };
    }
    
    o(final ProgressBar a) {
        this.a = a;
    }
    
    private Shape a() {
        return (Shape)new RoundRectShape(new float[] { 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f }, (RectF)null, (float[])null);
    }
    
    private Drawable d(final Drawable drawable, final boolean b) {
        if (drawable instanceof j) {
            final j j = (j)drawable;
            final Drawable b2 = j.b();
            if (b2 != null) {
                j.a(this.d(b2, b));
            }
        }
        else {
            if (drawable instanceof LayerDrawable) {
                final LayerDrawable layerDrawable = (LayerDrawable)drawable;
                final int numberOfLayers = layerDrawable.getNumberOfLayers();
                final Drawable[] array = new Drawable[numberOfLayers];
                final int n = 0;
                for (int i = 0; i < numberOfLayers; ++i) {
                    final int id = layerDrawable.getId(i);
                    array[i] = this.d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                final LayerDrawable layerDrawable2 = new LayerDrawable(array);
                for (int k = n; k < numberOfLayers; ++k) {
                    layerDrawable2.setId(k, layerDrawable.getId(k));
                }
                return (Drawable)layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                final BitmapDrawable bitmapDrawable = (BitmapDrawable)drawable;
                final Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.b == null) {
                    this.b = bitmap;
                }
                final ShapeDrawable shapeDrawable = new ShapeDrawable(this.a());
                shapeDrawable.getPaint().setShader((Shader)new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                Object o = shapeDrawable;
                if (b) {
                    o = new ClipDrawable((Drawable)shapeDrawable, 3, 1);
                }
                return (Drawable)o;
            }
        }
        return drawable;
    }
    
    private Drawable e(final Drawable drawable) {
        Object o = drawable;
        if (drawable instanceof AnimationDrawable) {
            final AnimationDrawable animationDrawable = (AnimationDrawable)drawable;
            final int numberOfFrames = animationDrawable.getNumberOfFrames();
            o = new AnimationDrawable();
            ((AnimationDrawable)o).setOneShot(animationDrawable.isOneShot());
            for (int i = 0; i < numberOfFrames; ++i) {
                final Drawable d = this.d(animationDrawable.getFrame(i), true);
                d.setLevel(10000);
                ((AnimationDrawable)o).addFrame(d, animationDrawable.getDuration(i));
            }
            ((AnimationDrawable)o).setLevel(10000);
        }
        return (Drawable)o;
    }
    
    Bitmap b() {
        return this.b;
    }
    
    void c(final AttributeSet set, final int n) {
        final u0 g = u0.G(this.a.getContext(), set, o.c, n, 0);
        final Drawable i = g.i(0);
        if (i != null) {
            this.a.setIndeterminateDrawable(this.e(i));
        }
        final Drawable j = g.i(1);
        if (j != null) {
            this.a.setProgressDrawable(this.d(j, false));
        }
        g.I();
    }
}
