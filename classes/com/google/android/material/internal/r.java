// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.internal;

import java.util.Map;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.animation.Animator;
import androidx.annotation.k0;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.j0;
import androidx.transition.n0;
import androidx.annotation.t0;
import androidx.transition.g0;

@t0({ androidx.annotation.t0.a.H })
public class r extends g0
{
    private static final String C0 = "android:textscale:scale";
    
    private void I0(@j0 final n0 n0) {
        final View b = n0.b;
        if (b instanceof TextView) {
            n0.a.put("android:textscale:scale", ((TextView)b).getScaleX());
        }
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
    public Animator v(@j0 final ViewGroup viewGroup, @k0 final n0 n0, @k0 final n0 n2) {
        ValueAnimator ofFloat;
        final ValueAnimator valueAnimator = ofFloat = null;
        if (n0 != null) {
            ofFloat = valueAnimator;
            if (n2 != null) {
                ofFloat = valueAnimator;
                if (n0.b instanceof TextView) {
                    final View b = n2.b;
                    if (!(b instanceof TextView)) {
                        ofFloat = valueAnimator;
                    }
                    else {
                        final TextView textView = (TextView)b;
                        final Map<String, Object> a = n0.a;
                        final Map<String, Object> a2 = n2.a;
                        final Object value = a.get("android:textscale:scale");
                        float floatValue = 1.0f;
                        float floatValue2;
                        if (value != null) {
                            floatValue2 = a.get("android:textscale:scale");
                        }
                        else {
                            floatValue2 = 1.0f;
                        }
                        if (a2.get("android:textscale:scale") != null) {
                            floatValue = a2.get("android:textscale:scale");
                        }
                        if (floatValue2 == floatValue) {
                            return null;
                        }
                        ofFloat = ValueAnimator.ofFloat(new float[] { floatValue2, floatValue });
                        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                            public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
                                final float floatValue = (float)valueAnimator.getAnimatedValue();
                                textView.setScaleX(floatValue);
                                textView.setScaleY(floatValue);
                            }
                        });
                    }
                }
            }
        }
        return (Animator)ofFloat;
    }
}
