// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.view;

import java.util.HashMap;
import java.util.ArrayList;
import android.view.WindowInsetsAnimation$Callback;
import android.animation.Animator$AnimatorListener;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.Collections;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import java.util.Objects;
import k.a;
import android.view.ViewGroup;
import android.view.View$OnApplyWindowInsetsListener;
import android.annotation.SuppressLint;
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import java.util.List;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation$Bounds;
import androidx.core.graphics.j;
import androidx.annotation.t;
import android.view.View;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.view.WindowInsetsAnimation;
import android.os.Build$VERSION;
import androidx.annotation.k0;
import android.view.animation.Interpolator;

public final class u0
{
    private static final boolean b = false;
    private static final String c = "WindowInsetsAnimCompat";
    private e a;
    
    public u0(final int n, @k0 final Interpolator interpolator, final long n2) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        e a;
        if (sdk_INT >= 30) {
            a = new d(n, interpolator, n2);
        }
        else {
            if (sdk_INT < 21) {
                this.a = new e(0, interpolator, n2);
                return;
            }
            a = new c(n, interpolator, n2);
        }
        this.a = a;
    }
    
    @p0(30)
    private u0(@j0 final WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build$VERSION.SDK_INT >= 30) {
            this.a = (e)new d(windowInsetsAnimation);
        }
    }
    
    static void h(@j0 final View view, @k0 final b b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 30) {
            d.l(view, b);
        }
        else if (sdk_INT >= 21) {
            u0.c.s(view, b);
        }
    }
    
    @p0(30)
    static u0 j(final WindowInsetsAnimation windowInsetsAnimation) {
        return new u0(windowInsetsAnimation);
    }
    
    @t(from = 0.0, to = 1.0)
    public float a() {
        return this.a.a();
    }
    
    public long b() {
        return this.a.b();
    }
    
    @t(from = 0.0, to = 1.0)
    public float c() {
        return this.a.c();
    }
    
    public float d() {
        return this.a.d();
    }
    
    @k0
    public Interpolator e() {
        return this.a.e();
    }
    
    public int f() {
        return this.a.f();
    }
    
    public void g(@t(from = 0.0, to = 1.0) final float n) {
        this.a.g(n);
    }
    
    public void i(@t(from = 0.0, to = 1.0) final float n) {
        this.a.h(n);
    }
    
    public static final class a
    {
        private final j a;
        private final j b;
        
        @p0(30)
        private a(@j0 final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            this.a = d.k(windowInsetsAnimation$Bounds);
            this.b = d.j(windowInsetsAnimation$Bounds);
        }
        
        public a(@j0 final j a, @j0 final j b) {
            this.a = a;
            this.b = b;
        }
        
        @j0
        @p0(30)
        public static a e(@j0 final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            return new a(windowInsetsAnimation$Bounds);
        }
        
        @j0
        public j a() {
            return this.a;
        }
        
        @j0
        public j b() {
            return this.b;
        }
        
        @j0
        public a c(@j0 final j j) {
            return new a(x0.z(this.a, j.a, j.b, j.c, j.d), x0.z(this.b, j.a, j.b, j.c, j.d));
        }
        
        @j0
        @p0(30)
        public WindowInsetsAnimation$Bounds d() {
            return d.i(this);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append("Bounds{lower=");
            sb.append(this.a);
            sb.append(" upper=");
            sb.append(this.b);
            sb.append("}");
            return sb.toString();
        }
    }
    
    public abstract static class b
    {
        public static final int c = 0;
        public static final int d = 1;
        WindowInsets a;
        private final int b;
        
        public b(final int b) {
            this.b = b;
        }
        
        public final int a() {
            return this.b;
        }
        
        public void b(@j0 final u0 u0) {
        }
        
        public void c(@j0 final u0 u0) {
        }
        
        @j0
        public abstract x0 d(@j0 final x0 p0, @j0 final List<u0> p1);
        
        @j0
        public u0.a e(@j0 final u0 u0, @j0 final u0.a a) {
            return a;
        }
        
        @Retention(RetentionPolicy.SOURCE)
        @t0({ t0.a.H })
        public @interface a {
        }
    }
    
    @p0(21)
    private static class c extends e
    {
        c(final int n, @k0 final Interpolator interpolator, final long n2) {
            super(n, interpolator, n2);
        }
        
        @SuppressLint({ "WrongConstant" })
        static int i(@j0 final x0 x0, @j0 final x0 x2) {
            int i = 1;
            int n = 0;
            while (i <= 256) {
                int n2 = n;
                if (!x0.f(i).equals(x2.f(i))) {
                    n2 = (n | i);
                }
                i <<= 1;
                n = n2;
            }
            return n;
        }
        
        @j0
        static u0.a j(@j0 final x0 x0, @j0 final x0 x2, final int n) {
            final j f = x0.f(n);
            final j f2 = x2.f(n);
            return new u0.a(j.d(Math.min(f.a, f2.a), Math.min(f.b, f2.b), Math.min(f.c, f2.c), Math.min(f.d, f2.d)), j.d(Math.max(f.a, f2.a), Math.max(f.b, f2.b), Math.max(f.c, f2.c), Math.max(f.d, f2.d)));
        }
        
        @j0
        private static View$OnApplyWindowInsetsListener k(@j0 final View view, @j0 final b b) {
            return (View$OnApplyWindowInsetsListener)new a(view, b);
        }
        
        static void l(@j0 final View view, @j0 final u0 u0) {
            final b q = q(view);
            if (q != null) {
                q.b(u0);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    l(viewGroup.getChildAt(i), u0);
                }
            }
        }
        
        static void m(final View view, final u0 u0, final WindowInsets a, final boolean b) {
            final b q = q(view);
            int i = 0;
            boolean b2 = b;
            if (q != null) {
                q.a = a;
                if (!(b2 = b)) {
                    q.c(u0);
                    b2 = (q.a() == 0);
                }
            }
            if (view instanceof ViewGroup) {
                for (ViewGroup viewGroup = (ViewGroup)view; i < viewGroup.getChildCount(); ++i) {
                    m(viewGroup.getChildAt(i), u0, a, b2);
                }
            }
        }
        
        static void n(@j0 final View view, @j0 final x0 x0, @j0 final List<u0> list) {
            final b q = q(view);
            x0 d = x0;
            if (q != null) {
                d = q.d(x0, list);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    n(viewGroup.getChildAt(i), d, list);
                }
            }
        }
        
        static void o(final View view, final u0 u0, final u0.a a) {
            final b q = q(view);
            if (q != null) {
                q.e(u0, a);
                if (q.a() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup)view;
                for (int i = 0; i < viewGroup.getChildCount(); ++i) {
                    o(viewGroup.getChildAt(i), u0, a);
                }
            }
        }
        
        @j0
        static WindowInsets p(@j0 final View view, @j0 final WindowInsets windowInsets) {
            if (view.getTag(k.a.e.h0) != null) {
                return windowInsets;
            }
            return view.onApplyWindowInsets(windowInsets);
        }
        
        @k0
        static b q(final View view) {
            final Object tag = view.getTag(k.a.e.p0);
            b a;
            if (tag instanceof a) {
                a = ((a)tag).a;
            }
            else {
                a = null;
            }
            return a;
        }
        
        @SuppressLint({ "WrongConstant" })
        static x0 r(final x0 x0, final x0 x2, final float n, final int n2) {
            final x0.b b = new x0.b(x0);
            for (int i = 1; i <= 256; i <<= 1) {
                j j;
                if ((n2 & i) == 0x0) {
                    j = x0.f(i);
                }
                else {
                    final j f = x0.f(i);
                    final j f2 = x2.f(i);
                    final float n3 = (float)(f.a - f2.a);
                    final float n4 = 1.0f - n;
                    j = x0.z(f, (int)(n3 * n4 + 0.5), (int)((f.b - f2.b) * n4 + 0.5), (int)((f.c - f2.c) * n4 + 0.5), (int)((f.d - f2.d) * n4 + 0.5));
                }
                b.c(i, j);
            }
            return b.a();
        }
        
        static void s(@j0 final View view, @k0 final b b) {
            final Object tag = view.getTag(k.a.e.h0);
            if (b == null) {
                view.setTag(k.a.e.p0, (Object)null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
                }
            }
            else {
                final View$OnApplyWindowInsetsListener k = k(view, b);
                view.setTag(k.a.e.p0, (Object)k);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(k);
                }
            }
        }
        
        @p0(21)
        private static class a implements View$OnApplyWindowInsetsListener
        {
            private static final int c = 160;
            final b a;
            private x0 b;
            
            a(@j0 final View view, @j0 final b a) {
                this.a = a;
                final x0 n0 = androidx.core.view.j0.n0(view);
                x0 a2;
                if (n0 != null) {
                    a2 = new x0.b(n0).a();
                }
                else {
                    a2 = null;
                }
                this.b = a2;
            }
            
            public WindowInsets onApplyWindowInsets(final View view, final WindowInsets b) {
                if (!view.isLaidOut()) {
                    this.b = x0.L(b, view);
                }
                else {
                    final x0 l = x0.L(b, view);
                    if (this.b == null) {
                        this.b = androidx.core.view.j0.n0(view);
                    }
                    if (this.b != null) {
                        final b q = u0.c.q(view);
                        if (q != null && Objects.equals(q.a, b)) {
                            return u0.c.p(view, b);
                        }
                        final int i = u0.c.i(l, this.b);
                        if (i == 0) {
                            return u0.c.p(view, b);
                        }
                        final x0 b2 = this.b;
                        final u0 u0 = new u0(i, (Interpolator)new DecelerateInterpolator(), 160L);
                        u0.i(0.0f);
                        final ValueAnimator setDuration = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f }).setDuration(u0.b());
                        final u0.a j = androidx.core.view.u0.c.j(l, b2, i);
                        androidx.core.view.u0.c.m(view, u0, b, false);
                        setDuration.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
                            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                                u0.i(valueAnimator.getAnimatedFraction());
                                u0.c.n(view, u0.c.r(l, b2, u0.d(), i), Collections.singletonList(u0));
                            }
                        });
                        setDuration.addListener((Animator$AnimatorListener)new AnimatorListenerAdapter() {
                            public void onAnimationEnd(final Animator animator) {
                                u0.i(1.0f);
                                u0.c.l(view, u0);
                            }
                        });
                        d0.a(view, new Runnable() {
                            @Override
                            public void run() {
                                u0.c.o(view, u0, j);
                                setDuration.start();
                            }
                        });
                    }
                    this.b = l;
                }
                return u0.c.p(view, b);
            }
        }
    }
    
    @p0(30)
    private static class d extends e
    {
        @j0
        private final WindowInsetsAnimation f;
        
        d(final int n, final Interpolator interpolator, final long n2) {
            this(new WindowInsetsAnimation(n, interpolator, n2));
        }
        
        d(@j0 final WindowInsetsAnimation f) {
            super(0, null, 0L);
            this.f = f;
        }
        
        @j0
        public static WindowInsetsAnimation$Bounds i(@j0 final u0.a a) {
            return new WindowInsetsAnimation$Bounds(a.a().h(), a.b().h());
        }
        
        @j0
        public static j j(@j0 final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            return j.g(windowInsetsAnimation$Bounds.getUpperBound());
        }
        
        @j0
        public static j k(@j0 final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
            return j.g(windowInsetsAnimation$Bounds.getLowerBound());
        }
        
        public static void l(@j0 final View view, @k0 final b b) {
            a windowInsetsAnimationCallback;
            if (b != null) {
                windowInsetsAnimationCallback = new a(b);
            }
            else {
                windowInsetsAnimationCallback = null;
            }
            view.setWindowInsetsAnimationCallback((WindowInsetsAnimation$Callback)windowInsetsAnimationCallback);
        }
        
        @Override
        public long b() {
            return this.f.getDurationMillis();
        }
        
        @Override
        public float c() {
            return this.f.getFraction();
        }
        
        @Override
        public float d() {
            return this.f.getInterpolatedFraction();
        }
        
        @k0
        @Override
        public Interpolator e() {
            return this.f.getInterpolator();
        }
        
        @Override
        public int f() {
            return this.f.getTypeMask();
        }
        
        @Override
        public void h(final float fraction) {
            this.f.setFraction(fraction);
        }
        
        @p0(30)
        private static class a extends WindowInsetsAnimation$Callback
        {
            private final b a;
            private List<u0> b;
            private ArrayList<u0> c;
            private final HashMap<WindowInsetsAnimation, u0> d;
            
            a(@j0 final b a) {
                super(a.a());
                this.d = new HashMap<WindowInsetsAnimation, u0>();
                this.a = a;
            }
            
            @j0
            private u0 a(@j0 final WindowInsetsAnimation windowInsetsAnimation) {
                u0 j;
                if ((j = this.d.get(windowInsetsAnimation)) == null) {
                    j = u0.j(windowInsetsAnimation);
                    this.d.put(windowInsetsAnimation, j);
                }
                return j;
            }
            
            public void onEnd(@j0 final WindowInsetsAnimation key) {
                this.a.b(this.a(key));
                this.d.remove(key);
            }
            
            public void onPrepare(@j0 final WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(this.a(windowInsetsAnimation));
            }
            
            @j0
            public WindowInsets onProgress(@j0 final WindowInsets windowInsets, @j0 final List<WindowInsetsAnimation> list) {
                final ArrayList<u0> c = this.c;
                if (c == null) {
                    final ArrayList<u0> list2 = new ArrayList<u0>(list.size());
                    this.c = list2;
                    this.b = (List<u0>)Collections.unmodifiableList((List<?>)list2);
                }
                else {
                    c.clear();
                }
                for (int i = list.size() - 1; i >= 0; --i) {
                    final WindowInsetsAnimation windowInsetsAnimation = list.get(i);
                    final u0 a = this.a(windowInsetsAnimation);
                    a.i(windowInsetsAnimation.getFraction());
                    this.c.add(a);
                }
                return this.a.d(x0.K(windowInsets), this.b).J();
            }
            
            @j0
            public WindowInsetsAnimation$Bounds onStart(@j0 final WindowInsetsAnimation windowInsetsAnimation, @j0 final WindowInsetsAnimation$Bounds windowInsetsAnimation$Bounds) {
                return this.a.e(this.a(windowInsetsAnimation), u0.a.e(windowInsetsAnimation$Bounds)).d();
            }
        }
    }
    
    private static class e
    {
        private final int a;
        private float b;
        @k0
        private final Interpolator c;
        private final long d;
        private float e;
        
        e(final int a, @k0 final Interpolator c, final long d) {
            this.a = a;
            this.c = c;
            this.d = d;
        }
        
        public float a() {
            return this.e;
        }
        
        public long b() {
            return this.d;
        }
        
        public float c() {
            return this.b;
        }
        
        public float d() {
            final Interpolator c = this.c;
            if (c != null) {
                return c.getInterpolation(this.b);
            }
            return this.b;
        }
        
        @k0
        public Interpolator e() {
            return this.c;
        }
        
        public int f() {
            return this.a;
        }
        
        public void g(final float e) {
            this.e = e;
        }
        
        public void h(final float b) {
            this.b = b;
        }
    }
}
