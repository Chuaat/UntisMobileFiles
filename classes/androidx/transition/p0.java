// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.animation.AnimatorListenerAdapter;
import android.animation.Animator$AnimatorListener;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.Animator;
import androidx.annotation.k0;
import android.animation.TimeInterpolator;
import androidx.annotation.j0;
import android.view.View;

class p0
{
    private p0() {
    }
    
    @k0
    static Animator a(@j0 final View view, @j0 final n0 n0, final int n2, final int n3, float translationX, float translationY, final float n4, final float n5, @k0 final TimeInterpolator interpolator, @j0 final g0 g0) {
        final float translationX2 = view.getTranslationX();
        final float translationY2 = view.getTranslationY();
        final int[] array = (int[])n0.b.getTag(a0.g.T1);
        if (array != null) {
            translationX = array[0] - n2 + translationX2;
            translationY = array[1] - n3 + translationY2;
        }
        final int round = Math.round(translationX - translationX2);
        final int round2 = Math.round(translationY - translationY2);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        if (translationX == n4 && translationY == n5) {
            return null;
        }
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)view, new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat(View.TRANSLATION_X, new float[] { translationX, n4 }), PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[] { translationY, n5 }) });
        final a a = new a(view, n0.b, n2 + round, n3 + round2, translationX2, translationY2);
        g0.a((g0.h)a);
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)a);
        androidx.transition.a.a((Animator)ofPropertyValuesHolder, a);
        ofPropertyValuesHolder.setInterpolator(interpolator);
        return (Animator)ofPropertyValuesHolder;
    }
    
    private static class a extends AnimatorListenerAdapter implements h
    {
        private final View a;
        private final View b;
        private final int c;
        private final int d;
        private int[] e;
        private float f;
        private float g;
        private final float h;
        private final float i;
        
        a(final View b, final View a, int t1, final int n, final float h, final float i) {
            this.b = b;
            this.a = a;
            this.c = t1 - Math.round(b.getTranslationX());
            this.d = n - Math.round(b.getTranslationY());
            this.h = h;
            this.i = i;
            t1 = a0.g.T1;
            final int[] e = (int[])a.getTag(t1);
            this.e = e;
            if (e != null) {
                a.setTag(t1, (Object)null);
            }
        }
        
        public void a(@j0 final g0 g0) {
        }
        
        public void b(@j0 final g0 g0) {
        }
        
        public void c(@j0 final g0 g0) {
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
            g0.p0((g0.h)this);
        }
        
        public void d(@j0 final g0 g0) {
        }
        
        public void e(@j0 final g0 g0) {
        }
        
        public void onAnimationCancel(final Animator animator) {
            if (this.e == null) {
                this.e = new int[2];
            }
            this.e[0] = Math.round(this.c + this.b.getTranslationX());
            this.e[1] = Math.round(this.d + this.b.getTranslationY());
            this.a.setTag(androidx.transition.a0.g.T1, (Object)this.e);
        }
        
        public void onAnimationPause(final Animator animator) {
            this.f = this.b.getTranslationX();
            this.g = this.b.getTranslationY();
            this.b.setTranslationX(this.h);
            this.b.setTranslationY(this.i);
        }
        
        public void onAnimationResume(final Animator animator) {
            this.b.setTranslationX(this.f);
            this.b.setTranslationY(this.g);
        }
    }
}
