// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import androidx.core.content.res.i;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import androidx.core.view.j0;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.animation.TimeInterpolator;

public class e0 extends f1
{
    private static final TimeInterpolator L0;
    private static final TimeInterpolator M0;
    private static final String N0 = "android:slide:screenPosition";
    private static final g O0;
    private static final g P0;
    private static final g Q0;
    private static final g R0;
    private static final g S0;
    private static final g T0;
    private g J0;
    private int K0;
    
    static {
        L0 = (TimeInterpolator)new DecelerateInterpolator();
        M0 = (TimeInterpolator)new AccelerateInterpolator();
        O0 = (g)new h() {
            @Override
            public float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() - viewGroup.getWidth();
            }
        };
        P0 = (g)new h() {
            @Override
            public float b(final ViewGroup viewGroup, final View view) {
                final int x = androidx.core.view.j0.X((View)viewGroup);
                boolean b = true;
                if (x != 1) {
                    b = false;
                }
                final float translationX = view.getTranslationX();
                final float n = (float)viewGroup.getWidth();
                float n2;
                if (b) {
                    n2 = translationX + n;
                }
                else {
                    n2 = translationX - n;
                }
                return n2;
            }
        };
        Q0 = (g)new i() {
            @Override
            public float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() - viewGroup.getHeight();
            }
        };
        R0 = (g)new h() {
            @Override
            public float b(final ViewGroup viewGroup, final View view) {
                return view.getTranslationX() + viewGroup.getWidth();
            }
        };
        S0 = (g)new h() {
            @Override
            public float b(final ViewGroup viewGroup, final View view) {
                final int x = androidx.core.view.j0.X((View)viewGroup);
                boolean b = true;
                if (x != 1) {
                    b = false;
                }
                final float translationX = view.getTranslationX();
                final float n = (float)viewGroup.getWidth();
                float n2;
                if (b) {
                    n2 = translationX - n;
                }
                else {
                    n2 = translationX + n;
                }
                return n2;
            }
        };
        T0 = (g)new i() {
            @Override
            public float a(final ViewGroup viewGroup, final View view) {
                return view.getTranslationY() + viewGroup.getHeight();
            }
        };
    }
    
    public e0() {
        this.J0 = e0.T0;
        this.S0(this.K0 = 80);
    }
    
    public e0(final int n) {
        this.J0 = e0.T0;
        this.K0 = 80;
        this.S0(n);
    }
    
    @SuppressLint({ "RestrictedApi" })
    public e0(final Context context, final AttributeSet set) {
        super(context, set);
        this.J0 = e0.T0;
        this.K0 = 80;
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.h);
        final int k = androidx.core.content.res.i.k(obtainStyledAttributes, (XmlPullParser)set, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        this.S0(k);
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        final int[] array = new int[2];
        b.getLocationOnScreen(array);
        n0.a.put("android:slide:screenPosition", array);
    }
    
    @Override
    public Animator M0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        if (n2 == null) {
            return null;
        }
        final int[] array = n2.a.get("android:slide:screenPosition");
        return androidx.transition.p0.a(view, n2, array[0], array[1], this.J0.b(viewGroup, view), this.J0.a(viewGroup, view), view.getTranslationX(), view.getTranslationY(), e0.L0, this);
    }
    
    @Override
    public Animator O0(final ViewGroup viewGroup, final View view, final n0 n0, final n0 n2) {
        if (n0 == null) {
            return null;
        }
        final int[] array = n0.a.get("android:slide:screenPosition");
        return androidx.transition.p0.a(view, n0, array[0], array[1], view.getTranslationX(), view.getTranslationY(), this.J0.b(viewGroup, view), this.J0.a(viewGroup, view), e0.M0, this);
    }
    
    public int R0() {
        return this.K0;
    }
    
    public void S0(final int k0) {
        g j0;
        if (k0 != 3) {
            if (k0 != 5) {
                if (k0 != 48) {
                    if (k0 != 80) {
                        if (k0 != 8388611) {
                            if (k0 != 8388613) {
                                throw new IllegalArgumentException("Invalid slide direction");
                            }
                            j0 = e0.S0;
                        }
                        else {
                            j0 = e0.P0;
                        }
                    }
                    else {
                        j0 = e0.T0;
                    }
                }
                else {
                    j0 = e0.Q0;
                }
            }
            else {
                j0 = e0.R0;
            }
        }
        else {
            j0 = e0.O0;
        }
        this.J0 = j0;
        this.K0 = k0;
        final d0 d0 = new d0();
        d0.k(k0);
        this.D0(d0);
    }
    
    @Override
    public void m(@androidx.annotation.j0 final n0 n0) {
        super.m(n0);
        this.I0(n0);
    }
    
    @Override
    public void r(@androidx.annotation.j0 final n0 n0) {
        super.r(n0);
        this.I0(n0);
    }
    
    private interface g
    {
        float a(final ViewGroup p0, final View p1);
        
        float b(final ViewGroup p0, final View p1);
    }
    
    private abstract static class h implements g
    {
        @Override
        public float a(final ViewGroup viewGroup, final View view) {
            return view.getTranslationY();
        }
    }
    
    private abstract static class i implements g
    {
        @Override
        public float b(final ViewGroup viewGroup, final View view) {
            return view.getTranslationX();
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ androidx.annotation.t0.a.I })
    public @interface j {
    }
}
