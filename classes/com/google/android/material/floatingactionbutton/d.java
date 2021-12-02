// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.material.floatingactionbutton;

import android.graphics.drawable.LayerDrawable;
import android.graphics.Paint;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.shape.s;
import android.graphics.PorterDuff$Mode;
import android.content.res.ColorStateList;
import java.util.Iterator;
import android.graphics.drawable.InsetDrawable;
import android.view.ViewTreeObserver;
import com.google.android.material.shape.k;
import androidx.core.util.n;
import android.animation.FloatEvaluator;
import android.os.Build$VERSION;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import java.util.List;
import com.google.android.material.animation.b;
import android.animation.TypeEvaluator;
import android.util.Property;
import com.google.android.material.animation.g;
import com.google.android.material.animation.f;
import android.animation.ObjectAnimator;
import android.animation.AnimatorSet;
import android.graphics.Matrix$ScaleToFit;
import android.view.View;
import com.google.android.material.animation.a;
import android.animation.Animator$AnimatorListener;
import java.util.ArrayList;
import android.animation.Animator;
import com.google.android.material.animation.h;
import androidx.annotation.j0;
import android.graphics.drawable.Drawable;
import com.google.android.material.shape.j;
import com.google.android.material.shape.o;
import androidx.annotation.k0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.Rect;
import android.animation.TimeInterpolator;

class d
{
    static final TimeInterpolator F;
    static final long G = 100L;
    static final long H = 100L;
    static final int I = 0;
    static final int J = 1;
    static final int K = 2;
    static final float L = 1.5f;
    private static final float M = 0.0f;
    private static final float N = 0.0f;
    private static final float O = 0.0f;
    private static final float P = 1.0f;
    private static final float Q = 1.0f;
    private static final float R = 1.0f;
    static final int[] S;
    static final int[] T;
    static final int[] U;
    static final int[] V;
    static final int[] W;
    static final int[] X;
    private final Rect A;
    private final RectF B;
    private final RectF C;
    private final Matrix D;
    @k0
    private ViewTreeObserver$OnPreDrawListener E;
    @k0
    o a;
    @k0
    com.google.android.material.shape.j b;
    @k0
    Drawable c;
    @k0
    c d;
    @k0
    Drawable e;
    boolean f;
    boolean g;
    float h;
    float i;
    float j;
    int k;
    @j0
    private final com.google.android.material.internal.o l;
    @k0
    private com.google.android.material.animation.h m;
    @k0
    private com.google.android.material.animation.h n;
    @k0
    private Animator o;
    @k0
    private com.google.android.material.animation.h p;
    @k0
    private com.google.android.material.animation.h q;
    private float r;
    private float s;
    private int t;
    private int u;
    private ArrayList<Animator$AnimatorListener> v;
    private ArrayList<Animator$AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final com.google.android.material.shadow.c z;
    
    static {
        F = a.c;
        S = new int[] { 16842919, 16842910 };
        T = new int[] { 16843623, 16842908, 16842910 };
        U = new int[] { 16842908, 16842910 };
        V = new int[] { 16843623, 16842910 };
        W = new int[] { 16842910 };
        X = new int[0];
    }
    
    d(final FloatingActionButton y, final com.google.android.material.shadow.c z) {
        this.g = true;
        this.s = 1.0f;
        this.u = 0;
        this.A = new Rect();
        this.B = new RectF();
        this.C = new RectF();
        this.D = new Matrix();
        this.y = y;
        this.z = z;
        final com.google.android.material.internal.o l = new com.google.android.material.internal.o();
        (this.l = l).a(com.google.android.material.floatingactionbutton.d.S, this.i((l)new h()));
        l.a(com.google.android.material.floatingactionbutton.d.T, this.i((l)new g()));
        l.a(com.google.android.material.floatingactionbutton.d.U, this.i((l)new g()));
        l.a(com.google.android.material.floatingactionbutton.d.V, this.i((l)new g()));
        l.a(com.google.android.material.floatingactionbutton.d.W, this.i((l)new k()));
        l.a(com.google.android.material.floatingactionbutton.d.X, this.i((l)new f()));
        this.r = y.getRotation();
    }
    
    private boolean d0() {
        return androidx.core.view.j0.T0((View)this.y) && !this.y.isInEditMode();
    }
    
    private void g(final float n, @j0 final Matrix matrix) {
        matrix.reset();
        final Drawable drawable = this.y.getDrawable();
        if (drawable != null && this.t != 0) {
            final RectF b = this.B;
            final RectF c = this.C;
            b.set(0.0f, 0.0f, (float)drawable.getIntrinsicWidth(), (float)drawable.getIntrinsicHeight());
            final int t = this.t;
            c.set(0.0f, 0.0f, (float)t, (float)t);
            matrix.setRectToRect(b, c, Matrix$ScaleToFit.CENTER);
            final int t2 = this.t;
            matrix.postScale(n, n, t2 / 2.0f, t2 / 2.0f);
        }
    }
    
    @j0
    private AnimatorSet h(@j0 final com.google.android.material.animation.h h, final float n, final float n2, final float n3) {
        final ArrayList<Animator> list = new ArrayList<Animator>();
        final ObjectAnimator ofFloat = ObjectAnimator.ofFloat((Object)this.y, View.ALPHA, new float[] { n });
        h.h("opacity").a((Animator)ofFloat);
        list.add((Animator)ofFloat);
        final ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat((Object)this.y, View.SCALE_X, new float[] { n2 });
        h.h("scale").a((Animator)ofFloat2);
        this.k0(ofFloat2);
        list.add((Animator)ofFloat2);
        final ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat((Object)this.y, View.SCALE_Y, new float[] { n2 });
        h.h("scale").a((Animator)ofFloat3);
        this.k0(ofFloat3);
        list.add((Animator)ofFloat3);
        this.g(n3, this.D);
        final ObjectAnimator ofObject = ObjectAnimator.ofObject((Object)this.y, (Property)new com.google.android.material.animation.f(), (TypeEvaluator)new com.google.android.material.animation.g() {
            @Override
            public Matrix a(final float n, @j0 final Matrix matrix, @j0 final Matrix matrix2) {
                com.google.android.material.floatingactionbutton.d.this.s = n;
                return super.a(n, matrix, matrix2);
            }
        }, (Object[])new Matrix[] { new Matrix(this.D) });
        h.h("iconScale").a((Animator)ofObject);
        list.add((Animator)ofObject);
        final AnimatorSet set = new AnimatorSet();
        com.google.android.material.animation.b.a(set, list);
        return set;
    }
    
    @j0
    private ValueAnimator i(@j0 final l l) {
        final ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(com.google.android.material.floatingactionbutton.d.F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener((Animator$AnimatorListener)l);
        valueAnimator.addUpdateListener((ValueAnimator$AnimatorUpdateListener)l);
        valueAnimator.setFloatValues(new float[] { 0.0f, 1.0f });
        return valueAnimator;
    }
    
    private void k0(final ObjectAnimator objectAnimator) {
        if (Build$VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator((TypeEvaluator)new TypeEvaluator<Float>() {
            FloatEvaluator a = new FloatEvaluator();
            
            public Float a(float floatValue, final Float n, final Float n2) {
                if ((floatValue = this.a.evaluate(floatValue, (Number)n, (Number)n2)) < 0.1f) {
                    floatValue = 0.0f;
                }
                return floatValue;
            }
        });
    }
    
    private com.google.android.material.animation.h l() {
        if (this.n == null) {
            this.n = com.google.android.material.animation.h.d(this.y.getContext(), o2.a.b.b);
        }
        return androidx.core.util.n.g(this.n);
    }
    
    private com.google.android.material.animation.h m() {
        if (this.m == null) {
            this.m = com.google.android.material.animation.h.d(this.y.getContext(), o2.a.b.c);
        }
        return androidx.core.util.n.g(this.m);
    }
    
    @j0
    private ViewTreeObserver$OnPreDrawListener r() {
        if (this.E == null) {
            this.E = (ViewTreeObserver$OnPreDrawListener)new ViewTreeObserver$OnPreDrawListener() {
                public boolean onPreDraw() {
                    com.google.android.material.floatingactionbutton.d.this.H();
                    return true;
                }
            };
        }
        return this.E;
    }
    
    void A() {
        this.l.c();
    }
    
    void B() {
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            com.google.android.material.shape.k.f((View)this.y, b);
        }
        if (this.N()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(this.r());
        }
    }
    
    void C() {
    }
    
    void D() {
        final ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        final ViewTreeObserver$OnPreDrawListener e = this.E;
        if (e != null) {
            viewTreeObserver.removeOnPreDrawListener(e);
            this.E = null;
        }
    }
    
    void E(final int[] array) {
        this.l.d(array);
    }
    
    void F(final float n, final float n2, final float n3) {
        this.i0();
        this.j0(n);
    }
    
    void G(@j0 final Rect rect) {
        androidx.core.util.n.h(this.e, "Didn't initialize content background");
        Object e;
        com.google.android.material.shadow.c c;
        if (this.c0()) {
            e = new InsetDrawable(this.e, rect.left, rect.top, rect.right, rect.bottom);
            c = this.z;
        }
        else {
            c = this.z;
            e = this.e;
        }
        c.b((Drawable)e);
    }
    
    void H() {
        final float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            this.g0();
        }
    }
    
    void I() {
        final ArrayList<i> x = this.x;
        if (x != null) {
            final Iterator<i> iterator = x.iterator();
            while (iterator.hasNext()) {
                iterator.next().b();
            }
        }
    }
    
    void J() {
        final ArrayList<i> x = this.x;
        if (x != null) {
            final Iterator<i> iterator = x.iterator();
            while (iterator.hasNext()) {
                iterator.next().a();
            }
        }
    }
    
    public void K(@j0 final Animator$AnimatorListener o) {
        final ArrayList<Animator$AnimatorListener> w = this.w;
        if (w == null) {
            return;
        }
        w.remove(o);
    }
    
    void L(@j0 final Animator$AnimatorListener o) {
        final ArrayList<Animator$AnimatorListener> v = this.v;
        if (v == null) {
            return;
        }
        v.remove(o);
    }
    
    void M(@j0 final i o) {
        final ArrayList<i> x = this.x;
        if (x == null) {
            return;
        }
        x.remove(o);
    }
    
    boolean N() {
        return true;
    }
    
    void O(@k0 final ColorStateList tintList) {
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            b.setTintList(tintList);
        }
        final c d = this.d;
        if (d != null) {
            d.d(tintList);
        }
    }
    
    void P(@k0 final PorterDuff$Mode tintMode) {
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            b.setTintMode(tintMode);
        }
    }
    
    final void Q(final float h) {
        if (this.h != h) {
            this.F(this.h = h, this.i, this.j);
        }
    }
    
    void R(final boolean f) {
        this.f = f;
    }
    
    final void S(@k0 final com.google.android.material.animation.h q) {
        this.q = q;
    }
    
    final void T(final float i) {
        if (this.i != i) {
            this.i = i;
            this.F(this.h, i, this.j);
        }
    }
    
    final void U(final float s) {
        this.s = s;
        final Matrix d = this.D;
        this.g(s, d);
        this.y.setImageMatrix(d);
    }
    
    final void V(final int t) {
        if (this.t != t) {
            this.t = t;
            this.h0();
        }
    }
    
    void W(final int k) {
        this.k = k;
    }
    
    final void X(final float j) {
        if (this.j != j) {
            this.j = j;
            this.F(this.h, this.i, j);
        }
    }
    
    void Y(@k0 final ColorStateList list) {
        final Drawable c = this.c;
        if (c != null) {
            androidx.core.graphics.drawable.c.o(c, com.google.android.material.ripple.b.d(list));
        }
    }
    
    void Z(final boolean g) {
        this.g = g;
        this.i0();
    }
    
    final void a0(@j0 final o shapeAppearanceModel) {
        this.a = shapeAppearanceModel;
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            b.setShapeAppearanceModel(shapeAppearanceModel);
        }
        final Drawable c = this.c;
        if (c instanceof s) {
            ((s)c).setShapeAppearanceModel(shapeAppearanceModel);
        }
        final c d = this.d;
        if (d != null) {
            d.g(shapeAppearanceModel);
        }
    }
    
    final void b0(@k0 final com.google.android.material.animation.h p) {
        this.p = p;
    }
    
    boolean c0() {
        return true;
    }
    
    public void d(@j0 final Animator$AnimatorListener e) {
        if (this.w == null) {
            this.w = new ArrayList<Animator$AnimatorListener>();
        }
        this.w.add(e);
    }
    
    void e(@j0 final Animator$AnimatorListener e) {
        if (this.v == null) {
            this.v = new ArrayList<Animator$AnimatorListener>();
        }
        this.v.add(e);
    }
    
    final boolean e0() {
        return !this.f || this.y.getSizeDimension() >= this.k;
    }
    
    void f(@j0 final i e) {
        if (this.x == null) {
            this.x = new ArrayList<i>();
        }
        this.x.add(e);
    }
    
    void f0(@k0 final j j, final boolean b) {
        if (this.z()) {
            return;
        }
        final Animator o = this.o;
        if (o != null) {
            o.cancel();
        }
        if (this.d0()) {
            if (this.y.getVisibility() != 0) {
                this.y.setAlpha(0.0f);
                this.y.setScaleY(0.0f);
                this.y.setScaleX(0.0f);
                this.U(0.0f);
            }
            com.google.android.material.animation.h h = this.p;
            if (h == null) {
                h = this.m();
            }
            final AnimatorSet h2 = this.h(h, 1.0f, 1.0f, 1.0f);
            h2.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                public void onAnimationEnd(final Animator animator) {
                    com.google.android.material.floatingactionbutton.d.this.u = 0;
                    com.google.android.material.floatingactionbutton.d.this.o = null;
                    final j b = j;
                    if (b != null) {
                        b.a();
                    }
                }
                
                public void onAnimationStart(final Animator animator) {
                    com.google.android.material.floatingactionbutton.d.this.y.c(0, b);
                    com.google.android.material.floatingactionbutton.d.this.u = 2;
                    com.google.android.material.floatingactionbutton.d.this.o = animator;
                }
            });
            final ArrayList<Animator$AnimatorListener> v = this.v;
            if (v != null) {
                final Iterator<Animator$AnimatorListener> iterator = v.iterator();
                while (iterator.hasNext()) {
                    h2.addListener((Animator$AnimatorListener)iterator.next());
                }
            }
            h2.start();
        }
        else {
            this.y.c(0, b);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            this.U(1.0f);
            if (j != null) {
                j.a();
            }
        }
    }
    
    void g0() {
        Label_0067: {
            if (Build$VERSION.SDK_INT == 19) {
                int n;
                FloatingActionButton floatingActionButton;
                if (this.r % 90.0f != 0.0f) {
                    final int layerType = this.y.getLayerType();
                    n = 1;
                    if (layerType == 1) {
                        break Label_0067;
                    }
                    floatingActionButton = this.y;
                }
                else {
                    if (this.y.getLayerType() == 0) {
                        break Label_0067;
                    }
                    floatingActionButton = this.y;
                    n = 0;
                }
                floatingActionButton.setLayerType(n, (Paint)null);
            }
        }
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            b.v0((int)this.r);
        }
    }
    
    final void h0() {
        this.U(this.s);
    }
    
    final void i0() {
        final Rect a = this.A;
        this.s(a);
        this.G(a);
        this.z.a(a.left, a.top, a.right, a.bottom);
    }
    
    com.google.android.material.shape.j j() {
        return new com.google.android.material.shape.j(androidx.core.util.n.g(this.a));
    }
    
    void j0(final float n) {
        final com.google.android.material.shape.j b = this.b;
        if (b != null) {
            b.m0(n);
        }
    }
    
    @k0
    final Drawable k() {
        return this.e;
    }
    
    float n() {
        return this.h;
    }
    
    boolean o() {
        return this.f;
    }
    
    @k0
    final com.google.android.material.animation.h p() {
        return this.q;
    }
    
    float q() {
        return this.i;
    }
    
    void s(@j0 final Rect rect) {
        int n;
        if (this.f) {
            n = (this.k - this.y.getSizeDimension()) / 2;
        }
        else {
            n = 0;
        }
        float n2;
        if (this.g) {
            n2 = this.n() + this.j;
        }
        else {
            n2 = 0.0f;
        }
        final int max = Math.max(n, (int)Math.ceil(n2));
        final int max2 = Math.max(n, (int)Math.ceil(n2 * 1.5f));
        rect.set(max, max2, max, max2);
    }
    
    float t() {
        return this.j;
    }
    
    @k0
    final o u() {
        return this.a;
    }
    
    @k0
    final com.google.android.material.animation.h v() {
        return this.p;
    }
    
    void w(@k0 final j j, final boolean b) {
        if (this.y()) {
            return;
        }
        final Animator o = this.o;
        if (o != null) {
            o.cancel();
        }
        if (this.d0()) {
            com.google.android.material.animation.h h = this.q;
            if (h == null) {
                h = this.l();
            }
            final AnimatorSet h2 = this.h(h, 0.0f, 0.0f, 0.0f);
            h2.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                private boolean a;
                
                public void onAnimationCancel(final Animator animator) {
                    this.a = true;
                }
                
                public void onAnimationEnd(final Animator animator) {
                    com.google.android.material.floatingactionbutton.d.this.u = 0;
                    com.google.android.material.floatingactionbutton.d.this.o = null;
                    if (!this.a) {
                        final FloatingActionButton y = com.google.android.material.floatingactionbutton.d.this.y;
                        final boolean b = b;
                        int n;
                        if (b) {
                            n = 8;
                        }
                        else {
                            n = 4;
                        }
                        y.c(n, b);
                        final j c = j;
                        if (c != null) {
                            c.b();
                        }
                    }
                }
                
                public void onAnimationStart(final Animator animator) {
                    com.google.android.material.floatingactionbutton.d.this.y.c(0, b);
                    com.google.android.material.floatingactionbutton.d.this.u = 1;
                    com.google.android.material.floatingactionbutton.d.this.o = animator;
                    this.a = false;
                }
            });
            final ArrayList<Animator$AnimatorListener> w = this.w;
            if (w != null) {
                final Iterator<Animator$AnimatorListener> iterator = w.iterator();
                while (iterator.hasNext()) {
                    h2.addListener((Animator$AnimatorListener)iterator.next());
                }
            }
            h2.start();
        }
        else {
            final FloatingActionButton y = this.y;
            int n;
            if (b) {
                n = 8;
            }
            else {
                n = 4;
            }
            y.c(n, b);
            if (j != null) {
                j.b();
            }
        }
    }
    
    void x(final ColorStateList tintList, @k0 final PorterDuff$Mode tintMode, final ColorStateList list, final int n) {
        (this.b = this.j()).setTintList(tintList);
        if (tintMode != null) {
            this.b.setTintMode(tintMode);
        }
        this.b.u0(-12303292);
        this.b.Y(this.y.getContext());
        final com.google.android.material.ripple.a c = new com.google.android.material.ripple.a(this.b.getShapeAppearanceModel());
        c.setTintList(com.google.android.material.ripple.b.d(list));
        this.c = c;
        this.e = (Drawable)new LayerDrawable(new Drawable[] { n.g(this.b), c });
    }
    
    boolean y() {
        final int visibility = this.y.getVisibility();
        final boolean b = false;
        boolean b2 = false;
        if (visibility == 0) {
            if (this.u == 1) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (this.u != 2) {
            b3 = true;
        }
        return b3;
    }
    
    boolean z() {
        final int visibility = this.y.getVisibility();
        final boolean b = false;
        boolean b2 = false;
        if (visibility != 0) {
            if (this.u == 2) {
                b2 = true;
            }
            return b2;
        }
        boolean b3 = b;
        if (this.u != 1) {
            b3 = true;
        }
        return b3;
    }
    
    private class f extends l
    {
        f() {
        }
        
        @Override
        protected float a() {
            return 0.0f;
        }
    }
    
    private class g extends l
    {
        g() {
        }
        
        @Override
        protected float a() {
            final d e = d.this;
            return e.h + e.i;
        }
    }
    
    private class h extends l
    {
        h() {
        }
        
        @Override
        protected float a() {
            final d e = d.this;
            return e.h + e.j;
        }
    }
    
    interface i
    {
        void a();
        
        void b();
    }
    
    interface j
    {
        void a();
        
        void b();
    }
    
    private class k extends l
    {
        k() {
        }
        
        @Override
        protected float a() {
            return d.this.h;
        }
    }
    
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator$AnimatorUpdateListener
    {
        private boolean a;
        private float b;
        private float c;
        
        protected abstract float a();
        
        public void onAnimationEnd(final Animator animator) {
            com.google.android.material.floatingactionbutton.d.this.j0((float)(int)this.c);
            this.a = false;
        }
        
        public void onAnimationUpdate(@j0 final ValueAnimator valueAnimator) {
            if (!this.a) {
                final com.google.android.material.shape.j b = com.google.android.material.floatingactionbutton.d.this.b;
                float x;
                if (b == null) {
                    x = 0.0f;
                }
                else {
                    x = b.x();
                }
                this.b = x;
                this.c = this.a();
                this.a = true;
            }
            final d d = com.google.android.material.floatingactionbutton.d.this;
            final float b2 = this.b;
            d.j0((float)(int)(b2 + (this.c - b2) * valueAnimator.getAnimatedFraction()));
        }
    }
}
