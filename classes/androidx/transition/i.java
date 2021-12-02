// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import androidx.core.view.j0;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TypeEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.annotation.SuppressLint;
import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;
import android.util.AttributeSet;
import android.content.Context;
import android.os.Build$VERSION;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Property;

public class i extends g0
{
    private static final String F0 = "android:changeTransform:matrix";
    private static final String G0 = "android:changeTransform:transforms";
    private static final String H0 = "android:changeTransform:parent";
    private static final String I0 = "android:changeTransform:parentMatrix";
    private static final String J0 = "android:changeTransform:intermediateParentMatrix";
    private static final String K0 = "android:changeTransform:intermediateMatrix";
    private static final String[] L0;
    private static final Property<e, float[]> M0;
    private static final Property<e, PointF> N0;
    private static final boolean O0;
    boolean C0;
    private boolean D0;
    private Matrix E0;
    
    static {
        L0 = new String[] { "android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix" };
        M0 = new Property<e, float[]>(float[].class, "nonTranslations") {
            public float[] a(final e e) {
                return null;
            }
            
            public void b(final e e, final float[] array) {
                e.d(array);
            }
        };
        N0 = new Property<e, PointF>(PointF.class, "translations") {
            public PointF a(final e e) {
                return null;
            }
            
            public void b(final e e, final PointF pointF) {
                e.c(pointF);
            }
        };
        O0 = (Build$VERSION.SDK_INT >= 21);
    }
    
    public i() {
        this.C0 = true;
        this.D0 = true;
        this.E0 = new Matrix();
    }
    
    @SuppressLint({ "RestrictedApi" })
    public i(final Context context, final AttributeSet set) {
        super(context, set);
        this.C0 = true;
        this.D0 = true;
        this.E0 = new Matrix();
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(set, androidx.transition.f0.g);
        final XmlPullParser xmlPullParser = (XmlPullParser)set;
        this.C0 = androidx.core.content.res.i.e(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.D0 = androidx.core.content.res.i.e(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
    
    private void I0(final n0 n0) {
        final View b = n0.b;
        if (b.getVisibility() == 8) {
            return;
        }
        n0.a.put("android:changeTransform:parent", b.getParent());
        n0.a.put("android:changeTransform:transforms", new f(b));
        final Matrix matrix = b.getMatrix();
        Matrix matrix2;
        if (matrix != null && !matrix.isIdentity()) {
            matrix2 = new Matrix(matrix);
        }
        else {
            matrix2 = null;
        }
        n0.a.put("android:changeTransform:matrix", matrix2);
        if (this.D0) {
            final Matrix matrix3 = new Matrix();
            final ViewGroup viewGroup = (ViewGroup)b.getParent();
            androidx.transition.y0.j((View)viewGroup, matrix3);
            matrix3.preTranslate((float)(-viewGroup.getScrollX()), (float)(-viewGroup.getScrollY()));
            n0.a.put("android:changeTransform:parentMatrix", matrix3);
            n0.a.put("android:changeTransform:intermediateMatrix", b.getTag(androidx.transition.a0.g.V1));
            n0.a.put("android:changeTransform:intermediateParentMatrix", b.getTag(androidx.transition.a0.g.R0));
        }
    }
    
    private void J0(final ViewGroup viewGroup, final n0 n0, final n0 n2) {
        final View b = n2.b;
        final Matrix matrix = new Matrix((Matrix)n2.a.get("android:changeTransform:parentMatrix"));
        androidx.transition.y0.k((View)viewGroup, matrix);
        final o a = s.a(b, viewGroup, matrix);
        if (a == null) {
            return;
        }
        a.a(n0.a.get("android:changeTransform:parent"), n0.b);
        i i = this;
        while (true) {
            final l0 x = i.X;
            if (x == null) {
                break;
            }
            i = (i)x;
        }
        i.a((h)new d(b, a));
        if (androidx.transition.i.O0) {
            final View b2 = n0.b;
            if (b2 != n2.b) {
                androidx.transition.y0.h(b2, 0.0f);
            }
            androidx.transition.y0.h(b, 1.0f);
        }
    }
    
    private ObjectAnimator K0(final n0 n0, final n0 n2, final boolean b) {
        final Matrix matrix = n0.a.get("android:changeTransform:matrix");
        final Matrix matrix2 = n2.a.get("android:changeTransform:matrix");
        Matrix a = matrix;
        if (matrix == null) {
            a = u.a;
        }
        Matrix a2;
        if ((a2 = matrix2) == null) {
            a2 = u.a;
        }
        if (a.equals((Object)a2)) {
            return null;
        }
        final f f = n2.a.get("android:changeTransform:transforms");
        final View b2 = n2.b;
        O0(b2);
        final float[] array = new float[9];
        a.getValues(array);
        final float[] array2 = new float[9];
        a2.getValues(array2);
        final e e = new e(b2, array);
        final ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder((Object)e, new PropertyValuesHolder[] { PropertyValuesHolder.ofObject((Property)i.M0, (TypeEvaluator)new m(new float[9]), (Object[])new float[][] { array, array2 }), z.a(i.N0, this.T().a(array[2], array[5], array2[2], array2[5])) });
        final AnimatorListenerAdapter animatorListenerAdapter = new AnimatorListenerAdapter() {
            private boolean a;
            private Matrix b = new Matrix();
            
            private void a(final Matrix matrix) {
                this.b.set(matrix);
                b2.setTag(androidx.transition.a0.g.V1, (Object)this.b);
                f.a(b2);
            }
            
            public void onAnimationCancel(final Animator animator) {
                this.a = true;
            }
            
            public void onAnimationEnd(final Animator animator) {
                if (!this.a) {
                    if (b && i.this.C0) {
                        this.a(a2);
                    }
                    else {
                        b2.setTag(androidx.transition.a0.g.V1, (Object)null);
                        b2.setTag(androidx.transition.a0.g.R0, (Object)null);
                    }
                }
                androidx.transition.y0.f(b2, null);
                f.a(b2);
            }
            
            public void onAnimationPause(final Animator animator) {
                this.a(e.a());
            }
            
            public void onAnimationResume(final Animator animator) {
                i.O0(b2);
            }
        };
        ofPropertyValuesHolder.addListener((Animator$AnimatorListener)animatorListenerAdapter);
        androidx.transition.a.a((Animator)ofPropertyValuesHolder, animatorListenerAdapter);
        return ofPropertyValuesHolder;
    }
    
    private boolean N0(final ViewGroup viewGroup, final ViewGroup viewGroup2) {
        final boolean f0 = this.f0((View)viewGroup);
        final boolean b = true;
        boolean b2 = false;
        if (f0 && this.f0((View)viewGroup2)) {
            final n0 r = this.R((View)viewGroup, true);
            if (r == null) {
                return b2;
            }
            if (viewGroup2 == r.b) {
                b2 = b;
                return b2;
            }
        }
        else if (viewGroup == viewGroup2) {
            b2 = b;
            return b2;
        }
        b2 = false;
        return b2;
    }
    
    static void O0(final View view) {
        S0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }
    
    private void P0(final n0 n0, final n0 n2) {
        final Matrix matrix = n2.a.get("android:changeTransform:parentMatrix");
        n2.b.setTag(androidx.transition.a0.g.R0, (Object)matrix);
        final Matrix e0 = this.E0;
        e0.reset();
        matrix.invert(e0);
        Matrix matrix2;
        if ((matrix2 = n0.a.get("android:changeTransform:matrix")) == null) {
            matrix2 = new Matrix();
            n0.a.put("android:changeTransform:matrix", matrix2);
        }
        matrix2.postConcat((Matrix)n0.a.get("android:changeTransform:parentMatrix"));
        matrix2.postConcat(e0);
    }
    
    static void S0(final View view, final float translationX, final float translationY, final float n, final float scaleX, final float scaleY, final float rotationX, final float rotationY, final float rotation) {
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        j0.u2(view, n);
        view.setScaleX(scaleX);
        view.setScaleY(scaleY);
        view.setRotationX(rotationX);
        view.setRotationY(rotationY);
        view.setRotation(rotation);
    }
    
    public boolean L0() {
        return this.D0;
    }
    
    public boolean M0() {
        return this.C0;
    }
    
    public void Q0(final boolean d0) {
        this.D0 = d0;
    }
    
    public void R0(final boolean c0) {
        this.C0 = c0;
    }
    
    @Override
    public String[] b0() {
        return i.L0;
    }
    
    @Override
    public void m(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
    }
    
    @Override
    public void r(@androidx.annotation.j0 final n0 n0) {
        this.I0(n0);
        if (!i.O0) {
            ((ViewGroup)n0.b.getParent()).startViewTransition(n0.b);
        }
    }
    
    @Override
    public Animator v(@androidx.annotation.j0 final ViewGroup viewGroup, final n0 n0, final n0 n2) {
        if (n0 != null && n2 != null && n0.a.containsKey("android:changeTransform:parent") && n2.a.containsKey("android:changeTransform:parent")) {
            final ViewGroup viewGroup2 = n0.a.get("android:changeTransform:parent");
            final ViewGroup viewGroup3 = n2.a.get("android:changeTransform:parent");
            final boolean b = this.D0 && !this.N0(viewGroup2, viewGroup3);
            final Matrix matrix = n0.a.get("android:changeTransform:intermediateMatrix");
            if (matrix != null) {
                n0.a.put("android:changeTransform:matrix", matrix);
            }
            final Matrix matrix2 = n0.a.get("android:changeTransform:intermediateParentMatrix");
            if (matrix2 != null) {
                n0.a.put("android:changeTransform:parentMatrix", matrix2);
            }
            if (b) {
                this.P0(n0, n2);
            }
            final ObjectAnimator k0 = this.K0(n0, n2, b);
            if (b && k0 != null && this.C0) {
                this.J0(viewGroup, n0, n2);
            }
            else if (!i.O0) {
                viewGroup2.endViewTransition(n0.b);
            }
            return (Animator)k0;
        }
        return null;
    }
    
    private static class d extends i0
    {
        private View a;
        private o b;
        
        d(final View a, final o b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public void b(@androidx.annotation.j0 final g0 g0) {
            this.b.setVisibility(4);
        }
        
        @Override
        public void c(@androidx.annotation.j0 final g0 g0) {
            g0.p0((h)this);
            s.b(this.a);
            this.a.setTag(androidx.transition.a0.g.V1, (Object)null);
            this.a.setTag(androidx.transition.a0.g.R0, (Object)null);
        }
        
        @Override
        public void e(@androidx.annotation.j0 final g0 g0) {
            this.b.setVisibility(0);
        }
    }
    
    private static class e
    {
        private final Matrix a;
        private final View b;
        private final float[] c;
        private float d;
        private float e;
        
        e(final View b, final float[] array) {
            this.a = new Matrix();
            this.b = b;
            final float[] c = array.clone();
            this.c = c;
            this.d = c[2];
            this.e = c[5];
            this.b();
        }
        
        private void b() {
            final float[] c = this.c;
            c[2] = this.d;
            c[5] = this.e;
            this.a.setValues(c);
            androidx.transition.y0.f(this.b, this.a);
        }
        
        Matrix a() {
            return this.a;
        }
        
        void c(final PointF pointF) {
            this.d = pointF.x;
            this.e = pointF.y;
            this.b();
        }
        
        void d(final float[] array) {
            System.arraycopy(array, 0, this.c, 0, array.length);
            this.b();
        }
    }
    
    private static class f
    {
        final float a;
        final float b;
        final float c;
        final float d;
        final float e;
        final float f;
        final float g;
        final float h;
        
        f(final View view) {
            this.a = view.getTranslationX();
            this.b = view.getTranslationY();
            this.c = j0.z0(view);
            this.d = view.getScaleX();
            this.e = view.getScaleY();
            this.f = view.getRotationX();
            this.g = view.getRotationY();
            this.h = view.getRotation();
        }
        
        public void a(final View view) {
            i.S0(view, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        }
        
        @Override
        public boolean equals(final Object o) {
            final boolean b = o instanceof f;
            final boolean b2 = false;
            if (!b) {
                return false;
            }
            final f f = (f)o;
            boolean b3 = b2;
            if (f.a == this.a) {
                b3 = b2;
                if (f.b == this.b) {
                    b3 = b2;
                    if (f.c == this.c) {
                        b3 = b2;
                        if (f.d == this.d) {
                            b3 = b2;
                            if (f.e == this.e) {
                                b3 = b2;
                                if (f.f == this.f) {
                                    b3 = b2;
                                    if (f.g == this.g) {
                                        b3 = b2;
                                        if (f.h == this.h) {
                                            b3 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return b3;
        }
        
        @Override
        public int hashCode() {
            final float a = this.a;
            int floatToIntBits = 0;
            int floatToIntBits2;
            if (a != 0.0f) {
                floatToIntBits2 = Float.floatToIntBits(a);
            }
            else {
                floatToIntBits2 = 0;
            }
            final float b = this.b;
            int floatToIntBits3;
            if (b != 0.0f) {
                floatToIntBits3 = Float.floatToIntBits(b);
            }
            else {
                floatToIntBits3 = 0;
            }
            final float c = this.c;
            int floatToIntBits4;
            if (c != 0.0f) {
                floatToIntBits4 = Float.floatToIntBits(c);
            }
            else {
                floatToIntBits4 = 0;
            }
            final float d = this.d;
            int floatToIntBits5;
            if (d != 0.0f) {
                floatToIntBits5 = Float.floatToIntBits(d);
            }
            else {
                floatToIntBits5 = 0;
            }
            final float e = this.e;
            int floatToIntBits6;
            if (e != 0.0f) {
                floatToIntBits6 = Float.floatToIntBits(e);
            }
            else {
                floatToIntBits6 = 0;
            }
            final float f = this.f;
            int floatToIntBits7;
            if (f != 0.0f) {
                floatToIntBits7 = Float.floatToIntBits(f);
            }
            else {
                floatToIntBits7 = 0;
            }
            final float g = this.g;
            int floatToIntBits8;
            if (g != 0.0f) {
                floatToIntBits8 = Float.floatToIntBits(g);
            }
            else {
                floatToIntBits8 = 0;
            }
            final float h = this.h;
            if (h != 0.0f) {
                floatToIntBits = Float.floatToIntBits(h);
            }
            return ((((((floatToIntBits2 * 31 + floatToIntBits3) * 31 + floatToIntBits4) * 31 + floatToIntBits5) * 31 + floatToIntBits6) * 31 + floatToIntBits7) * 31 + floatToIntBits8) * 31 + floatToIntBits;
        }
    }
}
