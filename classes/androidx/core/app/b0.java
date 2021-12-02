// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import java.util.Map;
import java.util.List;
import android.content.Context;
import android.widget.ImageView$ScaleType;
import android.os.Bundle;
import android.widget.ImageView;
import android.os.Parcelable;
import android.graphics.RectF;
import android.view.View;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;

public abstract class b0
{
    private static final int b = 1048576;
    private static final String c = "sharedElement:snapshot:bitmap";
    private static final String d = "sharedElement:snapshot:imageScaleType";
    private static final String e = "sharedElement:snapshot:imageMatrix";
    private Matrix a;
    
    private static Bitmap a(final Drawable drawable) {
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        final float min = Math.min(1.0f, 1048576.0f / (intrinsicWidth * intrinsicHeight));
        if (drawable instanceof BitmapDrawable && min == 1.0f) {
            return ((BitmapDrawable)drawable).getBitmap();
        }
        final int n = (int)(intrinsicWidth * min);
        final int n2 = (int)(intrinsicHeight * min);
        final Bitmap bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
        final Canvas canvas = new Canvas(bitmap);
        final Rect bounds = drawable.getBounds();
        final int left = bounds.left;
        final int top = bounds.top;
        final int right = bounds.right;
        final int bottom = bounds.bottom;
        drawable.setBounds(0, 0, n, n2);
        drawable.draw(canvas);
        drawable.setBounds(left, top, right, bottom);
        return bitmap;
    }
    
    public Parcelable b(final View view, final Matrix matrix, final RectF rectF) {
        if (view instanceof ImageView) {
            final ImageView imageView = (ImageView)view;
            final Drawable drawable = imageView.getDrawable();
            final Drawable background = imageView.getBackground();
            if (drawable != null && background == null) {
                final Bitmap a = a(drawable);
                if (a != null) {
                    final Bundle bundle = new Bundle();
                    bundle.putParcelable("sharedElement:snapshot:bitmap", (Parcelable)a);
                    bundle.putString("sharedElement:snapshot:imageScaleType", imageView.getScaleType().toString());
                    if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                        final Matrix imageMatrix = imageView.getImageMatrix();
                        final float[] array = new float[9];
                        imageMatrix.getValues(array);
                        bundle.putFloatArray("sharedElement:snapshot:imageMatrix", array);
                    }
                    return (Parcelable)bundle;
                }
            }
        }
        final int round = Math.round(rectF.width());
        final int round2 = Math.round(rectF.height());
        Object bitmap;
        final Object o = bitmap = null;
        if (round > 0) {
            bitmap = o;
            if (round2 > 0) {
                final float min = Math.min(1.0f, 1048576.0f / (round * round2));
                final int n = (int)(round * min);
                final int n2 = (int)(round2 * min);
                if (this.a == null) {
                    this.a = new Matrix();
                }
                this.a.set(matrix);
                this.a.postTranslate(-rectF.left, -rectF.top);
                this.a.postScale(min, min);
                bitmap = Bitmap.createBitmap(n, n2, Bitmap$Config.ARGB_8888);
                final Canvas canvas = new Canvas((Bitmap)bitmap);
                canvas.concat(this.a);
                view.draw(canvas);
            }
        }
        return (Parcelable)bitmap;
    }
    
    public View c(final Context context, final Parcelable parcelable) {
        final boolean b = parcelable instanceof Bundle;
        Object o = null;
        if (b) {
            final Bundle bundle = (Bundle)parcelable;
            final Bitmap imageBitmap = (Bitmap)bundle.getParcelable("sharedElement:snapshot:bitmap");
            if (imageBitmap == null) {
                return null;
            }
            final ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(imageBitmap);
            imageView.setScaleType(ImageView$ScaleType.valueOf(bundle.getString("sharedElement:snapshot:imageScaleType")));
            o = imageView;
            if (imageView.getScaleType() == ImageView$ScaleType.MATRIX) {
                final float[] floatArray = bundle.getFloatArray("sharedElement:snapshot:imageMatrix");
                final Matrix imageMatrix = new Matrix();
                imageMatrix.setValues(floatArray);
                imageView.setImageMatrix(imageMatrix);
                o = imageView;
            }
        }
        else if (parcelable instanceof Bitmap) {
            final Bitmap imageBitmap2 = (Bitmap)parcelable;
            o = new ImageView(context);
            ((ImageView)o).setImageBitmap(imageBitmap2);
        }
        return (View)o;
    }
    
    public void d(final List<String> list, final Map<String, View> map) {
    }
    
    public void e(final List<View> list) {
    }
    
    public void f(final List<String> list, final List<View> list2, final List<View> list3) {
    }
    
    public void g(final List<String> list, final List<View> list2, final List<View> list3) {
    }
    
    public void h(final List<String> list, final List<View> list2, final a a) {
        a.a();
    }
    
    public interface a
    {
        void a();
    }
}
