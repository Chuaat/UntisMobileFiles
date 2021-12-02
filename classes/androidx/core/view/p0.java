// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;
import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.lang.ref.WeakReference;

public final class p0
{
    static final int e = 2113929216;
    private WeakReference<View> a;
    Runnable b;
    Runnable c;
    int d;
    
    p0(final View referent) {
        this.b = null;
        this.c = null;
        this.d = -1;
        this.a = new WeakReference<View>(referent);
    }
    
    private void t(final View view, final q0 q0) {
        if (q0 != null) {
            view.animate().setListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationCancel(final Animator animator) {
                    q0.a(view);
                }
                
                public void onAnimationEnd(final Animator animator) {
                    q0.b(view);
                }
                
                public void onAnimationStart(final Animator animator) {
                    q0.c(view);
                }
            });
        }
        else {
            view.animate().setListener((Animator$AnimatorListener)null);
        }
    }
    
    public p0 A(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().translationYBy(n);
        }
        return this;
    }
    
    public p0 B(final float n) {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 21) {
            view.animate().translationZ(n);
        }
        return this;
    }
    
    public p0 C(final float n) {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 21) {
            view.animate().translationZBy(n);
        }
        return this;
    }
    
    public p0 D(final Runnable c) {
        final View view = this.a.get();
        if (view != null) {
            if (Build$VERSION.SDK_INT >= 16) {
                view.animate().withEndAction(c);
            }
            else {
                this.t(view, new c(this));
                this.c = c;
            }
        }
        return this;
    }
    
    @SuppressLint({ "WrongConstant" })
    public p0 E() {
        final View view = this.a.get();
        if (view != null) {
            if (Build$VERSION.SDK_INT >= 16) {
                view.animate().withLayer();
            }
            else {
                this.d = view.getLayerType();
                this.t(view, new c(this));
            }
        }
        return this;
    }
    
    public p0 F(final Runnable b) {
        final View view = this.a.get();
        if (view != null) {
            if (Build$VERSION.SDK_INT >= 16) {
                view.animate().withStartAction(b);
            }
            else {
                this.t(view, new c(this));
                this.b = b;
            }
        }
        return this;
    }
    
    public p0 G(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().x(n);
        }
        return this;
    }
    
    public p0 H(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().xBy(n);
        }
        return this;
    }
    
    public p0 I(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().y(n);
        }
        return this;
    }
    
    public p0 J(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().yBy(n);
        }
        return this;
    }
    
    public p0 K(final float n) {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 21) {
            view.animate().z(n);
        }
        return this;
    }
    
    public p0 L(final float n) {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 21) {
            view.animate().zBy(n);
        }
        return this;
    }
    
    public p0 a(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().alpha(n);
        }
        return this;
    }
    
    public p0 b(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().alphaBy(n);
        }
        return this;
    }
    
    public void c() {
        final View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
    
    public long d() {
        final View view = this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }
    
    public Interpolator e() {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 18) {
            return (Interpolator)view.animate().getInterpolator();
        }
        return null;
    }
    
    public long f() {
        final View view = this.a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }
    
    public p0 g(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotation(n);
        }
        return this;
    }
    
    public p0 h(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotationBy(n);
        }
        return this;
    }
    
    public p0 i(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotationX(n);
        }
        return this;
    }
    
    public p0 j(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotationXBy(n);
        }
        return this;
    }
    
    public p0 k(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotationY(n);
        }
        return this;
    }
    
    public p0 l(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().rotationYBy(n);
        }
        return this;
    }
    
    public p0 m(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().scaleX(n);
        }
        return this;
    }
    
    public p0 n(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().scaleXBy(n);
        }
        return this;
    }
    
    public p0 o(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().scaleY(n);
        }
        return this;
    }
    
    public p0 p(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().scaleYBy(n);
        }
        return this;
    }
    
    public p0 q(final long duration) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(duration);
        }
        return this;
    }
    
    public p0 r(final Interpolator interpolator) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
        return this;
    }
    
    public p0 s(q0 q0) {
        final View view = this.a.get();
        if (view != null) {
            if (Build$VERSION.SDK_INT < 16) {
                view.setTag(2113929216, (Object)q0);
                q0 = new c(this);
            }
            this.t(view, q0);
        }
        return this;
    }
    
    public p0 u(final long startDelay) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().setStartDelay(startDelay);
        }
        return this;
    }
    
    public p0 v(final s0 s0) {
        final View view = this.a.get();
        if (view != null && Build$VERSION.SDK_INT >= 19) {
            Object updateListener = null;
            if (s0 != null) {
                updateListener = new ValueAnimator$AnimatorUpdateListener() {
                    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                        s0.a(view);
                    }
                };
            }
            view.animate().setUpdateListener((ValueAnimator$AnimatorUpdateListener)updateListener);
        }
        return this;
    }
    
    public void w() {
        final View view = this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }
    
    public p0 x(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().translationX(n);
        }
        return this;
    }
    
    public p0 y(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().translationXBy(n);
        }
        return this;
    }
    
    public p0 z(final float n) {
        final View view = this.a.get();
        if (view != null) {
            view.animate().translationY(n);
        }
        return this;
    }
    
    static class c implements q0
    {
        p0 a;
        boolean b;
        
        c(final p0 a) {
            this.a = a;
        }
        
        @Override
        public void a(final View view) {
            final Object tag = view.getTag(2113929216);
            q0 q0;
            if (tag instanceof q0) {
                q0 = (q0)tag;
            }
            else {
                q0 = null;
            }
            if (q0 != null) {
                q0.a(view);
            }
        }
        
        @SuppressLint({ "WrongConstant" })
        @Override
        public void b(final View view) {
            final int d = this.a.d;
            q0 q0 = null;
            if (d > -1) {
                view.setLayerType(d, (Paint)null);
                this.a.d = -1;
            }
            if (Build$VERSION.SDK_INT >= 16 || !this.b) {
                final p0 a = this.a;
                final Runnable c = a.c;
                if (c != null) {
                    a.c = null;
                    c.run();
                }
                final Object tag = view.getTag(2113929216);
                if (tag instanceof q0) {
                    q0 = (q0)tag;
                }
                if (q0 != null) {
                    q0.b(view);
                }
                this.b = true;
            }
        }
        
        @Override
        public void c(final View view) {
            this.b = false;
            final int d = this.a.d;
            q0 q0 = null;
            if (d > -1) {
                view.setLayerType(2, (Paint)null);
            }
            final p0 a = this.a;
            final Runnable b = a.b;
            if (b != null) {
                a.b = null;
                b.run();
            }
            final Object tag = view.getTag(2113929216);
            if (tag instanceof q0) {
                q0 = (q0)tag;
            }
            if (q0 != null) {
                q0.c(view);
            }
        }
    }
}
