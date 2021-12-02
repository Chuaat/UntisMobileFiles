// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.view.ViewParent;
import java.lang.reflect.InvocationTargetException;
import androidx.annotation.k0;
import android.graphics.Matrix;
import androidx.annotation.j0;
import android.annotation.SuppressLint;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class e1
{
    private static final String b = "ViewUtilsBase";
    private static Method c;
    private static boolean d = false;
    private static Field e;
    private static boolean f = false;
    private static final int g = 12;
    private float[] a;
    
    @SuppressLint({ "PrivateApi" })
    private void b() {
        if (!e1.d) {
            try {
                final Class<Integer> type = Integer.TYPE;
                (e1.c = View.class.getDeclaredMethod("setFrame", type, type, type, type)).setAccessible(true);
            }
            catch (NoSuchMethodException ex) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", (Throwable)ex);
            }
            e1.d = true;
        }
    }
    
    public void a(@j0 final View view) {
        if (view.getVisibility() == 0) {
            view.setTag(a0.g.Y0, (Object)null);
        }
    }
    
    public float c(@j0 final View view) {
        final Float n = (Float)view.getTag(a0.g.Y0);
        float alpha = view.getAlpha();
        if (n != null) {
            alpha /= n;
        }
        return alpha;
    }
    
    public void d(@j0 final View view) {
        final int y0 = a0.g.Y0;
        if (view.getTag(y0) == null) {
            view.setTag(y0, (Object)view.getAlpha());
        }
    }
    
    public void e(@j0 final View view, @k0 final Matrix matrix) {
        if (matrix != null && !matrix.isIdentity()) {
            float[] a;
            if ((a = this.a) == null) {
                a = new float[9];
                this.a = a;
            }
            matrix.getValues(a);
            final float n = a[3];
            final float n2 = (float)Math.sqrt(1.0f - n * n);
            int n3;
            if (a[0] < 0.0f) {
                n3 = -1;
            }
            else {
                n3 = 1;
            }
            final float n4 = n2 * n3;
            final float rotation = (float)Math.toDegrees(Math.atan2(n, n4));
            final float scaleX = a[0] / n4;
            final float scaleY = a[4] / n4;
            final float translationX = a[2];
            final float translationY = a[5];
            view.setPivotX(0.0f);
            view.setPivotY(0.0f);
            view.setTranslationX(translationX);
            view.setTranslationY(translationY);
            view.setRotation(rotation);
            view.setScaleX(scaleX);
            view.setScaleY(scaleY);
        }
        else {
            view.setPivotX((float)(view.getWidth() / 2));
            view.setPivotY((float)(view.getHeight() / 2));
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            view.setRotation(0.0f);
        }
    }
    
    public void f(@j0 final View obj, final int i, final int j, final int k, final int l) {
        this.b();
        final Method c = e1.c;
        if (c == null) {
            goto Label_0071;
        }
        try {
            c.invoke(obj, i, j, k, l);
            goto Label_0071;
        }
        catch (InvocationTargetException ex) {
            throw new RuntimeException(ex.getCause());
        }
        catch (IllegalAccessException ex2) {
            goto Label_0071;
        }
    }
    
    public void g(@j0 final View view, final float alpha) {
        final Float n = (Float)view.getTag(a0.g.Y0);
        if (n != null) {
            view.setAlpha(n * alpha);
        }
        else {
            view.setAlpha(alpha);
        }
    }
    
    public void h(@j0 final View view, final int n) {
        if (!e1.f) {
            try {
                (e1.e = View.class.getDeclaredField("mViewFlags")).setAccessible(true);
            }
            catch (NoSuchFieldException ex) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            e1.f = true;
        }
        final Field e = e1.e;
        if (e == null) {
            return;
        }
        try {
            e1.e.setInt(view, n | (e.getInt(view) & 0xFFFFFFF3));
        }
        catch (IllegalAccessException ex2) {}
    }
    
    public void i(@j0 final View view, @j0 final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            final View view2 = (View)parent;
            this.i(view2, matrix);
            matrix.preTranslate((float)(-view2.getScrollX()), (float)(-view2.getScrollY()));
        }
        matrix.preTranslate((float)view.getLeft(), (float)view.getTop());
        final Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            matrix.preConcat(matrix2);
        }
    }
    
    public void j(@j0 final View view, @j0 final Matrix matrix) {
        final ViewParent parent = view.getParent();
        if (parent instanceof View) {
            final View view2 = (View)parent;
            this.j(view2, matrix);
            matrix.postTranslate((float)view2.getScrollX(), (float)view2.getScrollY());
        }
        matrix.postTranslate((float)(-view.getLeft()), (float)(-view.getTop()));
        final Matrix matrix2 = view.getMatrix();
        if (!matrix2.isIdentity()) {
            final Matrix matrix3 = new Matrix();
            if (matrix2.invert(matrix3)) {
                matrix.postConcat(matrix3);
            }
        }
    }
}
