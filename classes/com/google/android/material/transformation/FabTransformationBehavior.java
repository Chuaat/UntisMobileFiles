// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.transformation;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import android.animation.AnimatorSet;
import android.content.res.ColorStateList;
import android.view.ViewAnimationUtils;
import android.os.Build$VERSION;
import android.graphics.drawable.Drawable;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import com.google.android.material.animation.e;
import android.widget.ImageView;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.annotation.TargetApi;
import android.animation.TypeEvaluator;
import com.google.android.material.animation.c;
import android.util.Property;
import android.animation.ObjectAnimator;
import com.google.android.material.circularreveal.d;
import com.google.android.material.circularreveal.g;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import java.util.List;
import com.google.android.material.animation.j;
import com.google.android.material.animation.h;
import android.util.Pair;
import com.google.android.material.animation.i;
import androidx.annotation.k0;
import o2.a;
import android.view.ViewGroup;
import androidx.annotation.j0;
import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import android.graphics.RectF;
import android.graphics.Rect;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior
{
    private final Rect f;
    private final RectF g;
    private final RectF h;
    private final int[] i;
    private float j;
    private float k;
    
    public FabTransformationBehavior() {
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }
    
    public FabTransformationBehavior(final Context context, final AttributeSet set) {
        super(context, set);
        this.f = new Rect();
        this.g = new RectF();
        this.h = new RectF();
        this.i = new int[2];
    }
    
    @k0
    private ViewGroup N(@j0 final View view) {
        final View viewById = view.findViewById(o2.a.h.b3);
        if (viewById != null) {
            return this.i0(viewById);
        }
        if (!(view instanceof com.google.android.material.transformation.b) && !(view instanceof com.google.android.material.transformation.a)) {
            return this.i0(view);
        }
        return this.i0(((ViewGroup)view).getChildAt(0));
    }
    
    private void O(@j0 final View view, @j0 final e e, @j0 final com.google.android.material.animation.i i, @j0 final com.google.android.material.animation.i j, float v, float v2, final float n, final float n2, @j0 final RectF rectF) {
        v = this.V(e, i, v, n);
        v2 = this.V(e, j, v2, n2);
        final Rect f = this.f;
        view.getWindowVisibleDisplayFrame(f);
        final RectF g = this.g;
        g.set(f);
        final RectF h = this.h;
        this.W(view, h);
        h.offset(v, v2);
        h.intersect(g);
        rectF.set(h);
    }
    
    private void P(@j0 final View view, @j0 final RectF rectF) {
        this.W(view, rectF);
        rectF.offset(this.j, this.k);
    }
    
    @j0
    private Pair<com.google.android.material.animation.i, com.google.android.material.animation.i> Q(final float n, final float n2, final boolean b, @j0 final e e) {
        if (n != 0.0f) {
            final float n3 = fcmpl(n2, 0.0f);
            if (n3 != 0) {
                if ((b && n2 < 0.0f) || (!b && n3 > 0)) {
                    final com.google.android.material.animation.i h = e.a.h("translationXCurveUpwards");
                    final com.google.android.material.animation.h a = e.a;
                    final String s = "translationYCurveUpwards";
                    final com.google.android.material.animation.i i = h;
                    final com.google.android.material.animation.h h2 = a;
                    return (Pair<com.google.android.material.animation.i, com.google.android.material.animation.i>)new Pair((Object)i, (Object)h2.h(s));
                }
                final com.google.android.material.animation.i h3 = e.a.h("translationXCurveDownwards");
                final com.google.android.material.animation.h h2 = e.a;
                final String s = "translationYCurveDownwards";
                final com.google.android.material.animation.i i = h3;
                return (Pair<com.google.android.material.animation.i, com.google.android.material.animation.i>)new Pair((Object)i, (Object)h2.h(s));
            }
        }
        final com.google.android.material.animation.i h4 = e.a.h("translationXLinear");
        final com.google.android.material.animation.h h2 = e.a;
        final String s = "translationYLinear";
        final com.google.android.material.animation.i i = h4;
        return (Pair<com.google.android.material.animation.i, com.google.android.material.animation.i>)new Pair((Object)i, (Object)h2.h(s));
    }
    
    private float R(@j0 final View view, @j0 final View view2, @j0 final com.google.android.material.animation.j j) {
        final RectF g = this.g;
        final RectF h = this.h;
        this.P(view, g);
        this.W(view2, h);
        h.offset(-this.T(view, view2, j), 0.0f);
        return g.centerX() - h.left;
    }
    
    private float S(@j0 final View view, @j0 final View view2, @j0 final com.google.android.material.animation.j j) {
        final RectF g = this.g;
        final RectF h = this.h;
        this.P(view, g);
        this.W(view2, h);
        h.offset(0.0f, -this.U(view, view2, j));
        return g.centerY() - h.top;
    }
    
    private float T(@j0 final View view, @j0 final View view2, @j0 final com.google.android.material.animation.j j) {
        final RectF g = this.g;
        final RectF h = this.h;
        this.P(view, g);
        this.W(view2, h);
        final int n = j.a & 0x7;
        float n3;
        float n4;
        if (n != 1) {
            if (n != 3) {
                if (n != 5) {
                    final float n2 = 0.0f;
                    return n2 + j.b;
                }
                n3 = h.right;
                n4 = g.right;
            }
            else {
                n3 = h.left;
                n4 = g.left;
            }
        }
        else {
            n3 = h.centerX();
            n4 = g.centerX();
        }
        final float n2 = n3 - n4;
        return n2 + j.b;
    }
    
    private float U(@j0 final View view, @j0 final View view2, @j0 final com.google.android.material.animation.j j) {
        final RectF g = this.g;
        final RectF h = this.h;
        this.P(view, g);
        this.W(view2, h);
        final int n = j.a & 0x70;
        float n3;
        float n4;
        if (n != 16) {
            if (n != 48) {
                if (n != 80) {
                    final float n2 = 0.0f;
                    return n2 + j.c;
                }
                n3 = h.bottom;
                n4 = g.bottom;
            }
            else {
                n3 = h.top;
                n4 = g.top;
            }
        }
        else {
            n3 = h.centerY();
            n4 = g.centerY();
        }
        final float n2 = n3 - n4;
        return n2 + j.c;
    }
    
    private float V(@j0 final e e, @j0 final com.google.android.material.animation.i i, final float n, final float n2) {
        final long c = i.c();
        final long d = i.d();
        final com.google.android.material.animation.i h = e.a.h("expansion");
        return com.google.android.material.animation.a.a(n, n2, i.e().getInterpolation((h.c() + h.d() + 17L - c) / (float)d));
    }
    
    private void W(@j0 final View view, final RectF rectF) {
        rectF.set(0.0f, 0.0f, (float)view.getWidth(), (float)view.getHeight());
        final int[] i = this.i;
        view.getLocationInWindow(i);
        rectF.offsetTo((float)i[0], (float)i[1]);
        rectF.offset((float)(int)(-view.getTranslationX()), (float)(int)(-view.getTranslationY()));
    }
    
    private void X(final View view, final View view2, final boolean b, final boolean b2, @j0 final e e, @j0 final List<Animator> list, final List<Animator$AnimatorListener> list2) {
        if (!(view2 instanceof ViewGroup)) {
            return;
        }
        if (view2 instanceof com.google.android.material.circularreveal.g && com.google.android.material.circularreveal.d.o == 0) {
            return;
        }
        final ViewGroup n = this.N(view2);
        if (n == null) {
            return;
        }
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                com.google.android.material.animation.d.a.set((Object)n, (Object)0.0f);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)n, (Property)com.google.android.material.animation.d.a, new float[] { 1.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)n, (Property)com.google.android.material.animation.d.a, new float[] { 0.0f });
        }
        e.a.h("contentFade").a((Animator)objectAnimator);
        list.add((Animator)objectAnimator);
    }
    
    private void Y(@j0 final View view, final View view2, final boolean b, final boolean b2, @j0 final e e, @j0 final List<Animator> list, final List<Animator$AnimatorListener> list2) {
        if (!(view2 instanceof com.google.android.material.circularreveal.g)) {
            return;
        }
        final com.google.android.material.circularreveal.g g = (com.google.android.material.circularreveal.g)view2;
        final int g2 = this.g0(view);
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                g.setCircularRevealScrimColor(g2);
            }
            objectAnimator = ObjectAnimator.ofInt((Object)g, (Property)com.google.android.material.circularreveal.g.d.a, new int[] { 0xFFFFFF & g2 });
        }
        else {
            objectAnimator = ObjectAnimator.ofInt((Object)g, (Property)com.google.android.material.circularreveal.g.d.a, new int[] { g2 });
        }
        objectAnimator.setEvaluator((TypeEvaluator)com.google.android.material.animation.c.b());
        e.a.h("color").a((Animator)objectAnimator);
        list.add((Animator)objectAnimator);
    }
    
    private void Z(@j0 final View view, @j0 final View view2, final boolean b, @j0 final e e, @j0 final List<Animator> list) {
        float n = this.T(view, view2, e.b);
        final float u = this.U(view, view2, e.b);
        final Pair<com.google.android.material.animation.i, com.google.android.material.animation.i> q = this.Q(n, u, b, e);
        final com.google.android.material.animation.i i = (com.google.android.material.animation.i)q.first;
        final com.google.android.material.animation.i j = (com.google.android.material.animation.i)q.second;
        final Property translation_X = View.TRANSLATION_X;
        if (!b) {
            n = this.j;
        }
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view, translation_X, new float[] { n });
        final Property translation_Y = View.TRANSLATION_Y;
        float k;
        if (b) {
            k = u;
        }
        else {
            k = this.k;
        }
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)view, translation_Y, new float[] { k });
        i.a((Animator)ofFloat);
        j.a((Animator)ofFloat2);
        list.add((Animator)ofFloat);
        list.add((Animator)ofFloat2);
    }
    
    @TargetApi(21)
    private void a0(final View view, @j0 final View view2, final boolean b, final boolean b2, @j0 final e e, @j0 final List<Animator> list, final List<Animator$AnimatorListener> list2) {
        final float n = androidx.core.view.j0.P(view2) - androidx.core.view.j0.P(view);
        ObjectAnimator objectAnimator;
        if (b) {
            if (!b2) {
                view2.setTranslationZ(-n);
            }
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Z, new float[] { 0.0f });
        }
        else {
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Z, new float[] { -n });
        }
        e.a.h("elevation").a((Animator)objectAnimator);
        list.add((Animator)objectAnimator);
    }
    
    private void b0(@j0 final View view, final View view2, final boolean b, final boolean b2, @j0 final e e, float c, final float n, @j0 final List<Animator> list, @j0 final List<Animator$AnimatorListener> list2) {
        if (!(view2 instanceof com.google.android.material.circularreveal.g)) {
            return;
        }
        final com.google.android.material.circularreveal.g g = (com.google.android.material.circularreveal.g)view2;
        final float r = this.R(view, view2, e.b);
        final float s = this.S(view, view2, e.b);
        ((FloatingActionButton)view).k(this.f);
        float c2 = this.f.width() / 2.0f;
        final com.google.android.material.animation.i h = e.a.h("expansion");
        Animator animator;
        if (b) {
            if (!b2) {
                g.setRevealInfo(new com.google.android.material.circularreveal.g.e(r, s, c2));
            }
            if (b2) {
                c2 = g.getRevealInfo().c;
            }
            animator = com.google.android.material.circularreveal.a.a(g, r, s, w2.a.b(r, s, 0.0f, 0.0f, c, n));
            animator.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    final com.google.android.material.circularreveal.g.e revealInfo = g.getRevealInfo();
                    revealInfo.c = Float.MAX_VALUE;
                    g.setRevealInfo(revealInfo);
                }
            });
            this.e0(view2, h.c(), (int)r, (int)s, c2, list);
        }
        else {
            c = g.getRevealInfo().c;
            animator = com.google.android.material.circularreveal.a.a(g, r, s, c2);
            final long c3 = h.c();
            final int n2 = (int)r;
            final int n3 = (int)s;
            this.e0(view2, c3, n2, n3, c, list);
            this.d0(view2, h.c(), h.d(), e.a.i(), n2, n3, c2, list);
        }
        h.a(animator);
        list.add(animator);
        list2.add(com.google.android.material.circularreveal.a.c(g));
    }
    
    private void c0(final View view, final View view2, final boolean b, final boolean b2, @j0 final e e, @j0 final List<Animator> list, @j0 final List<Animator$AnimatorListener> list2) {
        if (view2 instanceof com.google.android.material.circularreveal.g) {
            if (view instanceof ImageView) {
                final com.google.android.material.circularreveal.g g = (com.google.android.material.circularreveal.g)view2;
                final Drawable drawable = ((ImageView)view).getDrawable();
                if (drawable == null) {
                    return;
                }
                drawable.mutate();
                ObjectAnimator objectAnimator;
                if (b) {
                    if (!b2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt((Object)drawable, (Property)e.b, new int[] { 0 });
                }
                else {
                    objectAnimator = ObjectAnimator.ofInt((Object)drawable, (Property)e.b, new int[] { 255 });
                }
                objectAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                        view2.invalidate();
                    }
                });
                e.a.h("iconFade").a((Animator)objectAnimator);
                list.add((Animator)objectAnimator);
                list2.add((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                    public void onAnimationEnd(final Animator animator) {
                        g.setCircularRevealOverlayDrawable(null);
                    }
                    
                    public void onAnimationStart(final Animator animator) {
                        g.setCircularRevealOverlayDrawable(drawable);
                    }
                });
            }
        }
    }
    
    private void d0(final View view, long startDelay, final long n, final long n2, final int n3, final int n4, final float n5, @j0 final List<Animator> list) {
        if (Build$VERSION.SDK_INT >= 21) {
            startDelay += n;
            if (startDelay < n2) {
                final Animator circularReveal = ViewAnimationUtils.createCircularReveal(view, n3, n4, n5, n5);
                circularReveal.setStartDelay(startDelay);
                circularReveal.setDuration(n2 - startDelay);
                list.add(circularReveal);
            }
        }
    }
    
    private void e0(final View view, final long duration, final int n, final int n2, final float n3, @j0 final List<Animator> list) {
        if (Build$VERSION.SDK_INT >= 21 && duration > 0L) {
            final Animator circularReveal = ViewAnimationUtils.createCircularReveal(view, n, n2, n3, n3);
            circularReveal.setStartDelay(0L);
            circularReveal.setDuration(duration);
            list.add(circularReveal);
        }
    }
    
    private void f0(@j0 final View view, @j0 final View view2, final boolean b, final boolean b2, @j0 final e e, @j0 final List<Animator> list, final List<Animator$AnimatorListener> list2, @j0 final RectF rectF) {
        final float t = this.T(view, view2, e.b);
        final float u = this.U(view, view2, e.b);
        final Pair<com.google.android.material.animation.i, com.google.android.material.animation.i> q = this.Q(t, u, b, e);
        final com.google.android.material.animation.i i = (com.google.android.material.animation.i)q.first;
        final com.google.android.material.animation.i j = (com.google.android.material.animation.i)q.second;
        ObjectAnimator objectAnimator;
        Object o;
        if (b) {
            if (!b2) {
                view2.setTranslationX(-t);
                view2.setTranslationY(-u);
            }
            final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { 0.0f });
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { 0.0f });
            this.O(view2, e, i, j, -t, -u, 0.0f, 0.0f, rectF);
            o = ofFloat;
        }
        else {
            final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_X, new float[] { -t });
            objectAnimator = ObjectAnimator.ofFloat((Object)view2, View.TRANSLATION_Y, new float[] { -u });
            o = ofFloat2;
        }
        i.a((Animator)o);
        j.a((Animator)objectAnimator);
        list.add((Animator)o);
        list.add((Animator)objectAnimator);
    }
    
    private int g0(@j0 final View view) {
        final ColorStateList l = androidx.core.view.j0.L(view);
        if (l != null) {
            return l.getColorForState(view.getDrawableState(), l.getDefaultColor());
        }
        return 0;
    }
    
    @k0
    private ViewGroup i0(final View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup)view;
        }
        return null;
    }
    
    @j0
    @Override
    protected AnimatorSet M(@j0 final View view, @j0 final View view2, final boolean b, final boolean b2) {
        final e h0 = this.h0(view2.getContext(), b);
        if (b) {
            this.j = view.getTranslationX();
            this.k = view.getTranslationY();
        }
        final ArrayList<Animator> list = new ArrayList<Animator>();
        final ArrayList list2 = new ArrayList<Object>();
        if (Build$VERSION.SDK_INT >= 21) {
            this.a0(view, view2, b, b2, h0, list, list2);
        }
        final RectF g = this.g;
        this.f0(view, view2, b, b2, h0, list, list2, g);
        final float width = g.width();
        final float height = g.height();
        this.Z(view, view2, b, h0, list);
        this.c0(view, view2, b, b2, h0, list, list2);
        this.b0(view, view2, b, b2, h0, width, height, list, list2);
        this.Y(view, view2, b, b2, h0, list, list2);
        this.X(view, view2, b, b2, h0, list, list2);
        final AnimatorSet set = new AnimatorSet();
        com.google.android.material.animation.b.a(set, list);
        set.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
            public void onAnimationEnd(final Animator animator) {
                if (!b) {
                    view2.setVisibility(4);
                    view.setAlpha(1.0f);
                    view.setVisibility(0);
                }
            }
            
            public void onAnimationStart(final Animator animator) {
                if (b) {
                    view2.setVisibility(0);
                    view.setAlpha(0.0f);
                    view.setVisibility(4);
                }
            }
        });
        for (int i = 0; i < list2.size(); ++i) {
            set.addListener((Animator$AnimatorListener)list2.get(i));
        }
        return set;
    }
    
    @androidx.annotation.i
    @Override
    public boolean f(@j0 final CoordinatorLayout coordinatorLayout, @j0 final View view, @j0 final View view2) {
        if (view.getVisibility() != 8) {
            final boolean b = view2 instanceof FloatingActionButton;
            boolean b2 = false;
            if (b) {
                final int expandedComponentIdHint = ((FloatingActionButton)view2).getExpandedComponentIdHint();
                if (expandedComponentIdHint != 0) {
                    b2 = b2;
                    if (expandedComponentIdHint != view.getId()) {
                        return b2;
                    }
                }
                b2 = true;
            }
            return b2;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }
    
    @androidx.annotation.i
    @Override
    public void h(@j0 final g g) {
        if (g.h == 0) {
            g.h = 80;
        }
    }
    
    protected abstract e h0(final Context p0, final boolean p1);
    
    protected static class e
    {
        @k0
        public com.google.android.material.animation.h a;
        public com.google.android.material.animation.j b;
    }
}
