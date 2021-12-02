// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import androidx.core.view.d0;
import android.view.animation.Transformation;
import android.view.animation.AnimationSet;
import android.animation.AnimatorInflater;
import android.content.res.Resources$NotFoundException;
import android.view.animation.AnimationUtils;
import y.a;
import android.content.Context;
import android.animation.Animator$AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.Animation;
import android.view.ViewGroup;
import android.view.animation.Animation$AnimationListener;
import android.animation.Animator;
import android.view.View;
import androidx.core.os.c;
import androidx.annotation.j0;

class e
{
    private e() {
    }
    
    static void a(@j0 final Fragment fragment, @j0 final d d, @j0 final c0.g g) {
        final View mView = fragment.mView;
        final ViewGroup mContainer = fragment.mContainer;
        mContainer.startViewTransition(mView);
        final c c = new c();
        c.d((c.a)new c.a() {
            @Override
            public void onCancel() {
                if (fragment.getAnimatingAway() != null) {
                    final View animatingAway = fragment.getAnimatingAway();
                    fragment.setAnimatingAway(null);
                    animatingAway.clearAnimation();
                }
                fragment.setAnimator(null);
            }
        });
        g.b(fragment, c);
        if (d.a != null) {
            final e e = new e(d.a, mContainer, mView);
            fragment.setAnimatingAway(fragment.mView);
            ((Animation)e).setAnimationListener((Animation$AnimationListener)new Animation$AnimationListener() {
                public void onAnimationEnd(final Animation animation) {
                    mContainer.post((Runnable)new Runnable() {
                        @Override
                        public void run() {
                            if (fragment.getAnimatingAway() != null) {
                                fragment.setAnimatingAway(null);
                                final Animation$AnimationListener g = (Animation$AnimationListener)Animation$AnimationListener.this;
                                g.a(fragment, c);
                            }
                        }
                    });
                }
                
                public void onAnimationRepeat(final Animation animation) {
                }
                
                public void onAnimationStart(final Animation animation) {
                }
            });
            fragment.mView.startAnimation((Animation)e);
        }
        else {
            final Animator b = d.b;
            fragment.setAnimator(b);
            b.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(Animator animator) {
                    mContainer.endViewTransition(mView);
                    animator = fragment.getAnimator();
                    fragment.setAnimator(null);
                    if (animator != null && mContainer.indexOfChild(mView) < 0) {
                        g.a(fragment, c);
                    }
                }
            });
            b.setTarget((Object)fragment.mView);
            b.start();
        }
    }
    
    private static int b(final Fragment fragment, final boolean b, final boolean b2) {
        if (b2) {
            if (b) {
                return fragment.getPopEnterAnim();
            }
            return fragment.getPopExitAnim();
        }
        else {
            if (b) {
                return fragment.getEnterAnim();
            }
            return fragment.getExitAnim();
        }
    }
    
    static d c(@j0 final Context context, @j0 final Fragment fragment, boolean equals, final boolean b) {
        final int nextTransition = fragment.getNextTransition();
        final int b2 = b(fragment, equals, b);
        final boolean b3 = false;
        fragment.setAnimations(0, 0, 0, 0);
        final ViewGroup mContainer = fragment.mContainer;
        if (mContainer != null) {
            final int u0 = a.g.u0;
            if (mContainer.getTag(u0) != null) {
                fragment.mContainer.setTag(u0, (Object)null);
            }
        }
        final ViewGroup mContainer2 = fragment.mContainer;
        if (mContainer2 != null && mContainer2.getLayoutTransition() != null) {
            return null;
        }
        final Animation onCreateAnimation = fragment.onCreateAnimation(nextTransition, equals, b2);
        if (onCreateAnimation != null) {
            return new d(onCreateAnimation);
        }
        final Animator onCreateAnimator = fragment.onCreateAnimator(nextTransition, equals, b2);
        if (onCreateAnimator != null) {
            return new d(onCreateAnimator);
        }
        int d;
        if ((d = b2) == 0) {
            d = b2;
            if (nextTransition != 0) {
                d = d(nextTransition, equals);
            }
        }
        if (d != 0) {
            equals = "anim".equals(context.getResources().getResourceTypeName(d));
            int n = b3 ? 1 : 0;
            if (equals) {
                try {
                    final Animation loadAnimation = AnimationUtils.loadAnimation(context, d);
                    if (loadAnimation != null) {
                        return new d(loadAnimation);
                    }
                    n = 1;
                }
                catch (RuntimeException ex3) {
                    n = (b3 ? 1 : 0);
                }
                catch (Resources$NotFoundException ex) {
                    throw ex;
                }
            }
            if (n == 0) {
                try {
                    final Animator loadAnimator = AnimatorInflater.loadAnimator(context, d);
                    if (loadAnimator != null) {
                        return new d(loadAnimator);
                    }
                }
                catch (RuntimeException ex2) {
                    if (equals) {
                        throw ex2;
                    }
                    final Animation loadAnimation2 = AnimationUtils.loadAnimation(context, d);
                    if (loadAnimation2 != null) {
                        return new d(loadAnimation2);
                    }
                }
            }
        }
        return null;
    }
    
    @androidx.annotation.a
    private static int d(int n, final boolean b) {
        if (n != 4097) {
            if (n != 4099) {
                if (n != 8194) {
                    n = -1;
                }
                else if (b) {
                    n = a.b.a;
                }
                else {
                    n = a.b.b;
                }
            }
            else if (b) {
                n = a.b.c;
            }
            else {
                n = a.b.d;
            }
        }
        else if (b) {
            n = a.b.e;
        }
        else {
            n = a.b.f;
        }
        return n;
    }
    
    static class d
    {
        public final Animation a;
        public final Animator b;
        
        d(final Animator b) {
            this.a = null;
            this.b = b;
            if (b != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }
        
        d(final Animation a) {
            this.a = a;
            this.b = null;
            if (a != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }
    
    static class e extends AnimationSet implements Runnable
    {
        private final ViewGroup G;
        private final View H;
        private boolean I;
        private boolean J;
        private boolean K;
        
        e(@j0 final Animation animation, @j0 final ViewGroup g, @j0 final View h) {
            super(false);
            this.K = true;
            this.G = g;
            this.H = h;
            this.addAnimation(animation);
            g.post((Runnable)this);
        }
        
        public boolean getTransformation(final long n, @j0 final Transformation transformation) {
            this.K = true;
            if (this.I) {
                return this.J ^ true;
            }
            if (!super.getTransformation(n, transformation)) {
                this.I = true;
                d0.a((View)this.G, this);
            }
            return true;
        }
        
        public boolean getTransformation(final long n, @j0 final Transformation transformation, final float n2) {
            this.K = true;
            if (this.I) {
                return this.J ^ true;
            }
            if (!super.getTransformation(n, transformation, n2)) {
                this.I = true;
                d0.a((View)this.G, this);
            }
            return true;
        }
        
        public void run() {
            if (!this.I && this.K) {
                this.K = false;
                this.G.post((Runnable)this);
            }
            else {
                this.G.endViewTransition(this.H);
                this.J = true;
            }
        }
    }
}
