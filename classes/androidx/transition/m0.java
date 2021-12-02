// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.TypeEvaluator;
import android.animation.AnimatorSet;
import android.animation.Animator;
import android.graphics.Canvas;
import android.graphics.Bitmap$Config;
import android.graphics.Picture;
import android.graphics.Bitmap;
import android.view.View$MeasureSpec;
import android.widget.ImageView$ScaleType;
import android.widget.ImageView;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build$VERSION;

class m0
{
    private static final int a = 1048576;
    private static final boolean b;
    private static final boolean c;
    private static final boolean d;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        final boolean b2 = true;
        b = (sdk_INT >= 19);
        c = (sdk_INT >= 18);
        d = (sdk_INT >= 28 && b2);
    }
    
    private m0() {
    }
    
    static View a(final ViewGroup viewGroup, final View view, final View view2) {
        final Matrix matrix = new Matrix();
        matrix.setTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        y0.j(view, matrix);
        y0.k((View)viewGroup, matrix);
        final RectF rectF = new RectF(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        matrix.mapRect(rectF);
        final int round = Math.round(rectF.left);
        final int round2 = Math.round(rectF.top);
        final int round3 = Math.round(rectF.right);
        final int round4 = Math.round(rectF.bottom);
        final ImageView imageView = new ImageView(view.getContext());
        imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
        final Bitmap b = b(view, matrix, rectF, viewGroup);
        if (b != null) {
            imageView.setImageBitmap(b);
        }
        imageView.measure(View$MeasureSpec.makeMeasureSpec(round3 - round, 1073741824), View$MeasureSpec.makeMeasureSpec(round4 - round2, 1073741824));
        imageView.layout(round, round2, round3, round4);
        return (View)imageView;
    }
    
    private static Bitmap b(final View view, final Matrix matrix, final RectF rectF, final ViewGroup viewGroup) {
        boolean b = false;
        boolean attachedToWindow = false;
        Label_0036: {
            if (m0.b) {
                b = (view.isAttachedToWindow() ^ true);
                if (viewGroup != null) {
                    attachedToWindow = viewGroup.isAttachedToWindow();
                    break Label_0036;
                }
            }
            else {
                b = false;
            }
            attachedToWindow = false;
        }
        final boolean c = m0.c;
        final Bitmap bitmap = null;
        ViewGroup viewGroup2;
        int indexOfChild;
        if (c && b) {
            if (!attachedToWindow) {
                return null;
            }
            viewGroup2 = (ViewGroup)view.getParent();
            indexOfChild = viewGroup2.indexOfChild(view);
            viewGroup.getOverlay().add(view);
        }
        else {
            viewGroup2 = null;
            indexOfChild = 0;
        }
        final int round = Math.round(rectF.width());
        final int round2 = Math.round(rectF.height());
        Bitmap bitmap2 = bitmap;
        if (round > 0) {
            bitmap2 = bitmap;
            if (round2 > 0) {
                final float min = Math.min(1.0f, 1048576.0f / (round * round2));
                final int round3 = Math.round(round * min);
                final int round4 = Math.round(round2 * min);
                matrix.postTranslate(-rectF.left, -rectF.top);
                matrix.postScale(min, min);
                if (m0.d) {
                    final Picture picture = new Picture();
                    final Canvas beginRecording = picture.beginRecording(round3, round4);
                    beginRecording.concat(matrix);
                    view.draw(beginRecording);
                    picture.endRecording();
                    bitmap2 = Bitmap.createBitmap(picture);
                }
                else {
                    bitmap2 = Bitmap.createBitmap(round3, round4, Bitmap$Config.ARGB_8888);
                    final Canvas canvas = new Canvas(bitmap2);
                    canvas.concat(matrix);
                    view.draw(canvas);
                }
            }
        }
        if (c && b) {
            viewGroup.getOverlay().remove(view);
            viewGroup2.addView(view, indexOfChild);
        }
        return bitmap2;
    }
    
    static Animator c(final Animator animator, final Animator animator2) {
        if (animator == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator;
        }
        final AnimatorSet set = new AnimatorSet();
        set.playTogether(new Animator[] { animator, animator2 });
        return (Animator)set;
    }
    
    static class a implements TypeEvaluator<Matrix>
    {
        final float[] a;
        final float[] b;
        final Matrix c;
        
        a() {
            this.a = new float[9];
            this.b = new float[9];
            this.c = new Matrix();
        }
        
        public Matrix a(final float n, final Matrix matrix, final Matrix matrix2) {
            matrix.getValues(this.a);
            matrix2.getValues(this.b);
            for (int i = 0; i < 9; ++i) {
                final float[] b = this.b;
                final float n2 = b[i];
                final float[] a = this.a;
                b[i] = a[i] + (n2 - a[i]) * n;
            }
            this.c.setValues(this.b);
            return this.c;
        }
    }
}
