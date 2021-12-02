// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.j0;
import android.animation.Animator;
import android.view.ViewGroup;
import android.view.View;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.content.Context;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public class k extends f1
{
    private static final TimeInterpolator K0;
    private static final TimeInterpolator L0;
    private static final String M0 = "android:explode:screenBounds";
    private int[] J0;
    
    static {
        K0 = (TimeInterpolator)new DecelerateInterpolator();
        L0 = (TimeInterpolator)new AccelerateInterpolator();
    }
    
    public k() {
        this.J0 = new int[2];
        this.D0(new j());
    }
    
    public k(final Context context, final AttributeSet set) {
        super(context, set);
        this.J0 = new int[2];
        this.D0(new j());
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        b.getLocationOnScreen(this.J0);
        final int[] j0 = this.J0;
        final int n2 = j0[0];
        final int n3 = j0[1];
        n0.a.put("android:explode:screenBounds", new Rect(n2, n3, b.getWidth() + n2, b.getHeight() + n3));
    }
    
    private static float R0(final float n, final float n2) {
        return (float)Math.sqrt(n * n + n2 * n2);
    }
    
    private static float S0(final View view, int max, int max2) {
        max = Math.max(max, view.getWidth() - max);
        max2 = Math.max(max2, view.getHeight() - max2);
        return R0((float)max, (float)max2);
    }
    
    private void T0(final View view, final Rect rect, final int[] array) {
        view.getLocationOnScreen(this.J0);
        final int[] j0 = this.J0;
        final int n = j0[0];
        final int n2 = j0[1];
        final Rect o = this.O();
        int centerX;
        int centerY;
        if (o == null) {
            centerX = view.getWidth() / 2 + n + Math.round(view.getTranslationX());
            centerY = view.getHeight() / 2 + n2 + Math.round(view.getTranslationY());
        }
        else {
            centerX = o.centerX();
            centerY = o.centerY();
        }
        final int centerX2 = rect.centerX();
        final int centerY2 = rect.centerY();
        final float n3 = (float)(centerX2 - centerX);
        final float n4 = (float)(centerY2 - centerY);
        float n5 = n3;
        float n6 = n4;
        if (n3 == 0.0f) {
            n5 = n3;
            n6 = n4;
            if (n4 == 0.0f) {
                n5 = (float)(Math.random() * 2.0) - 1.0f;
                n6 = (float)(Math.random() * 2.0) - 1.0f;
            }
        }
        final float r0 = R0(n5, n6);
        final float n7 = n5 / r0;
        final float n8 = n6 / r0;
        final float s0 = S0(view, centerX - n, centerY - n2);
        array[0] = Math.round(n7 * s0);
        array[1] = Math.round(s0 * n8);
    }
    
    @Override
    public Animator M0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        if (n2 == null) {
            return null;
        }
        final Rect rect = n2.a.get("android:explode:screenBounds");
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        this.T0((View)viewGroup, rect, this.J0);
        final int[] j0 = this.J0;
        return androidx.transition.p0.a(view, n2, rect.left, rect.top, translationX + j0[0], translationY + j0[1], translationX, translationY, k.K0, this);
    }
    
    @Override
    public Animator O0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        if (n0 == null) {
            return null;
        }
        final Rect rect = n0.a.get("android:explode:screenBounds");
        final int left = rect.left;
        final int top = rect.top;
        final float translationX = view.getTranslationX();
        final float translationY = view.getTranslationY();
        final int[] array = (int[])n0.b.getTag(androidx.transition.a0.g.T1);
        float n3;
        float n4;
        if (array != null) {
            n3 = array[0] - rect.left + translationX;
            n4 = array[1] - rect.top + translationY;
            rect.offsetTo(array[0], array[1]);
        }
        else {
            n3 = translationX;
            n4 = translationY;
        }
        this.T0((View)viewGroup, rect, this.J0);
        final int[] j0 = this.J0;
        return androidx.transition.p0.a(view, n0, left, top, translationX, translationY, n3 + j0[0], n4 + j0[1], k.L0, this);
    }
    
    @Override
    public void m(@j0 final n0 n0) {
        super.m(n0);
        this.I0(n0);
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        super.r(n0);
        this.I0(n0);
    }
}
