// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.Animator;
import android.view.ViewGroup;
import android.animation.ObjectAnimator;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import java.util.Map;
import android.view.View;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ImageView;
import android.util.Property;
import android.graphics.Matrix;
import android.animation.TypeEvaluator;

public class g extends g0
{
    private static final String C0 = "android:changeImageTransform:matrix";
    private static final String D0 = "android:changeImageTransform:bounds";
    private static final String[] E0;
    private static final TypeEvaluator<Matrix> F0;
    private static final Property<ImageView, Matrix> G0;
    
    static {
        E0 = new String[] { "android:changeImageTransform:matrix", "android:changeImageTransform:bounds" };
        F0 = (TypeEvaluator)new TypeEvaluator<Matrix>() {
            public Matrix a(final float n, final Matrix matrix, final Matrix matrix2) {
                return null;
            }
        };
        G0 = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
            public Matrix a(final ImageView imageView) {
                return null;
            }
            
            public void b(final ImageView imageView, final Matrix matrix) {
                t.a(imageView, matrix);
            }
        };
    }
    
    public g() {
    }
    
    public g(final Context context, final AttributeSet set) {
        super(context, set);
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        if (b instanceof ImageView) {
            if (b.getVisibility() == 0) {
                final ImageView imageView = (ImageView)b;
                if (imageView.getDrawable() == null) {
                    return;
                }
                final Map<String, Object> a = n0.a;
                a.put("android:changeImageTransform:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
                a.put("android:changeImageTransform:matrix", K0(imageView));
            }
        }
    }
    
    private static Matrix J0(final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        final int intrinsicWidth = drawable.getIntrinsicWidth();
        final float n = (float)imageView.getWidth();
        final float n2 = (float)intrinsicWidth;
        final float a = n / n2;
        final int intrinsicHeight = drawable.getIntrinsicHeight();
        final float n3 = (float)imageView.getHeight();
        final float n4 = (float)intrinsicHeight;
        final float max = Math.max(a, n3 / n4);
        final int round = Math.round((n - n2 * max) / 2.0f);
        final int round2 = Math.round((n3 - n4 * max) / 2.0f);
        final Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate((float)round, (float)round2);
        return matrix;
    }
    
    @j0
    private static Matrix K0(@j0 final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
            final int n = g$c.a[imageView.getScaleType().ordinal()];
            if (n == 1) {
                return N0(imageView);
            }
            if (n == 2) {
                return J0(imageView);
            }
        }
        return new Matrix(imageView.getImageMatrix());
    }
    
    private ObjectAnimator L0(final ImageView imageView, final Matrix matrix, final Matrix matrix2) {
        return ObjectAnimator.ofObject((Object)imageView, (Property)g.G0, (TypeEvaluator)new m0.a(), (Object[])new Matrix[] { matrix, matrix2 });
    }
    
    @j0
    private ObjectAnimator M0(@j0 final ImageView imageView) {
        final Property<ImageView, Matrix> g0 = g.G0;
        final TypeEvaluator<Matrix> f0 = g.F0;
        final Matrix a = u.a;
        return ObjectAnimator.ofObject((Object)imageView, (Property)g0, (TypeEvaluator)f0, (Object[])new Matrix[] { a, a });
    }
    
    private static Matrix N0(final ImageView imageView) {
        final Drawable drawable = imageView.getDrawable();
        final Matrix matrix = new Matrix();
        matrix.postScale(imageView.getWidth() / (float)drawable.getIntrinsicWidth(), imageView.getHeight() / (float)drawable.getIntrinsicHeight());
        return matrix;
    }
    
    @Override
    public String[] b0() {
        return g.E0;
    }
    
    @Override
    public void m(@j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public Animator v(@j0 final ViewGroup viewGroup, final n0 n0, final n0 n2) {
        Object o2;
        final Object o = o2 = null;
        if (n0 != null) {
            if (n2 == null) {
                o2 = o;
            }
            else {
                final Rect rect = n0.a.get("android:changeImageTransform:bounds");
                final Rect rect2 = n2.a.get("android:changeImageTransform:bounds");
                o2 = o;
                if (rect != null) {
                    if (rect2 == null) {
                        o2 = o;
                    }
                    else {
                        final Matrix matrix = n0.a.get("android:changeImageTransform:matrix");
                        final Matrix matrix2 = n2.a.get("android:changeImageTransform:matrix");
                        final boolean b = (matrix == null && matrix2 == null) || (matrix != null && matrix.equals((Object)matrix2));
                        if (rect.equals((Object)rect2) && b) {
                            return null;
                        }
                        final ImageView imageView = (ImageView)n2.b;
                        final Drawable drawable = imageView.getDrawable();
                        final int intrinsicWidth = drawable.getIntrinsicWidth();
                        final int intrinsicHeight = drawable.getIntrinsicHeight();
                        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                            Matrix a;
                            if ((a = matrix) == null) {
                                a = u.a;
                            }
                            Matrix a2;
                            if ((a2 = matrix2) == null) {
                                a2 = u.a;
                            }
                            g.G0.set((Object)imageView, (Object)a);
                            o2 = this.L0(imageView, a, a2);
                        }
                        else {
                            o2 = this.M0(imageView);
                        }
                    }
                }
            }
        }
        return (Animator)o2;
    }
}
