// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.graphics.Paint;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.animation.Animator$AnimatorListener;
import android.util.Property;
import android.animation.ObjectAnimator;
import android.animation.Animator;
import android.view.View;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import androidx.core.content.res.i;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.content.Context;

public class l extends f1
{
    private static final String J0 = "android:fade:transitionAlpha";
    private static final String K0 = "Fade";
    public static final int L0 = 1;
    public static final int M0 = 2;
    
    public l() {
    }
    
    public l(final int n) {
        this.Q0(n);
    }
    
    @SuppressLint({ "RestrictedApi" })
    public l(final Context context, final AttributeSet set) {
        super(context, set);
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.f);
        this.Q0(i.k(obtainStyledAttributes, (XmlPullParser)set, "fadingMode", 0, this.J0()));
        obtainStyledAttributes.recycle();
    }
    
    private Animator R0(final View view, final float n, final float n2) {
        if (n == n2) {
            return null;
        }
        androidx.transition.y0.h(view, n);
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, (Property)androidx.transition.y0.c, new float[] { n2 });
        ofFloat.addListener((Animator$AnimatorListener)new b(view));
        this.a((h)new i0() {
            @Override
            public void c(@j0 final g0 g0) {
                androidx.transition.y0.h(view, 1.0f);
                androidx.transition.y0.a(view);
                g0.p0((h)this);
            }
        });
        return (Animator)ofFloat;
    }
    
    private static float S0(final n0 n0, final float n2) {
        float floatValue = n2;
        if (n0 != null) {
            final Float n3 = n0.a.get("android:fade:transitionAlpha");
            floatValue = n2;
            if (n3 != null) {
                floatValue = n3;
            }
        }
        return floatValue;
    }
    
    @Override
    public Animator M0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        final float n3 = 0.0f;
        float s0 = S0(n0, 0.0f);
        if (s0 == 1.0f) {
            s0 = n3;
        }
        return this.R0(view, s0, 1.0f);
    }
    
    @Override
    public Animator O0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        androidx.transition.y0.e(view);
        return this.R0(view, S0(n0, 1.0f), 0.0f);
    }
    
    @Override
    public void r(@j0 final n0 n0) {
        super.r(n0);
        n0.a.put("android:fade:transitionAlpha", androidx.transition.y0.c(n0.b));
    }
    
    private static class b extends AnimatorListenerAdapter
    {
        private final View a;
        private boolean b;
        
        b(final View a) {
            this.b = false;
            this.a = a;
        }
        
        public void onAnimationEnd(final Animator animator) {
            androidx.transition.y0.h(this.a, 1.0f);
            if (this.b) {
                this.a.setLayerType(0, (Paint)null);
            }
        }
        
        public void onAnimationStart(final Animator animator) {
            if (androidx.core.view.j0.K0(this.a) && this.a.getLayerType() == 0) {
                this.b = true;
                this.a.setLayerType(2, (Paint)null);
            }
        }
    }
}
