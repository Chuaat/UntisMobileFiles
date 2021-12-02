// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.widget;

import android.view.animation.AnimationUtils;
import android.view.MotionEvent;
import android.os.SystemClock;
import android.content.res.Resources;
import android.view.animation.AccelerateInterpolator;
import androidx.annotation.j0;
import android.view.ViewConfiguration;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.View$OnTouchListener;

public abstract class a implements View$OnTouchListener
{
    public static final float X = 0.0f;
    public static final float Y = Float.MAX_VALUE;
    public static final float Z = 0.0f;
    public static final int a0 = 0;
    public static final int b0 = 1;
    public static final int c0 = 2;
    private static final int d0 = 0;
    private static final int e0 = 1;
    private static final int f0 = 1;
    private static final int g0 = 315;
    private static final int h0 = 1575;
    private static final float i0 = Float.MAX_VALUE;
    private static final float j0 = 0.2f;
    private static final float k0 = 1.0f;
    private static final int l0;
    private static final int m0 = 500;
    private static final int n0 = 500;
    final a G;
    private final Interpolator H;
    final View I;
    private Runnable J;
    private float[] K;
    private float[] L;
    private int M;
    private int N;
    private float[] O;
    private float[] P;
    private float[] Q;
    private boolean R;
    boolean S;
    boolean T;
    boolean U;
    private boolean V;
    private boolean W;
    
    static {
        l0 = ViewConfiguration.getTapTimeout();
    }
    
    public a(@j0 final View i) {
        this.G = new a();
        this.H = (Interpolator)new AccelerateInterpolator();
        this.K = new float[] { 0.0f, 0.0f };
        this.L = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.O = new float[] { 0.0f, 0.0f };
        this.P = new float[] { 0.0f, 0.0f };
        this.Q = new float[] { Float.MAX_VALUE, Float.MAX_VALUE };
        this.I = i;
        final float density = Resources.getSystem().getDisplayMetrics().density;
        final int n = (int)(1575.0f * density + 0.5f);
        final int n2 = (int)(density * 315.0f + 0.5f);
        final float n3 = (float)n;
        this.r(n3, n3);
        final float n4 = (float)n2;
        this.s(n4, n4);
        this.n(1);
        this.q(Float.MAX_VALUE, Float.MAX_VALUE);
        this.v(0.2f, 0.2f);
        this.w(1.0f, 1.0f);
        this.m(a.l0);
        this.u(500);
        this.t(500);
    }
    
    private float d(final int n, float h, float n2, float n3) {
        h = this.h(this.K[n], n2, this.L[n], h);
        final float n4 = fcmpl(h, 0.0f);
        if (n4 == 0) {
            return 0.0f;
        }
        final float n5 = this.O[n];
        final float n6 = this.P[n];
        n2 = this.Q[n];
        n3 *= n5;
        if (n4 > 0) {
            return e(h * n3, n6, n2);
        }
        return -e(-h * n3, n6, n2);
    }
    
    static float e(final float n, final float n2, final float n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    static int f(final int n, final int n2, final int n3) {
        if (n > n3) {
            return n3;
        }
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    private float g(final float n, final float n2) {
        if (n2 == 0.0f) {
            return 0.0f;
        }
        final int m = this.M;
        if (m != 0 && m != 1) {
            if (m == 2) {
                if (n < 0.0f) {
                    return n / -n2;
                }
            }
        }
        else if (n < n2) {
            if (n >= 0.0f) {
                return 1.0f - n / n2;
            }
            if (this.U && m == 1) {
                return 1.0f;
            }
        }
        return 0.0f;
    }
    
    private float h(float n, final float n2, float e, final float n3) {
        e = e(n * n2, 0.0f, e);
        n = this.g(n3, e);
        n = this.g(n2 - n3, e) - n;
        if (n < 0.0f) {
            n = -this.H.getInterpolation(-n);
        }
        else {
            if (n <= 0.0f) {
                return 0.0f;
            }
            n = this.H.getInterpolation(n);
        }
        return e(n, -1.0f, 1.0f);
    }
    
    private void k() {
        if (this.S) {
            this.U = false;
        }
        else {
            this.G.i();
        }
    }
    
    private void y() {
        if (this.J == null) {
            this.J = new b();
        }
        this.U = true;
        this.S = true;
        Label_0070: {
            if (!this.R) {
                final int n = this.N;
                if (n > 0) {
                    androidx.core.view.j0.o1(this.I, this.J, n);
                    break Label_0070;
                }
            }
            this.J.run();
        }
        this.R = true;
    }
    
    public abstract boolean a(final int p0);
    
    public abstract boolean b(final int p0);
    
    void c() {
        final long uptimeMillis = SystemClock.uptimeMillis();
        final MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.I.onTouchEvent(obtain);
        obtain.recycle();
    }
    
    public boolean i() {
        return this.V;
    }
    
    public boolean j() {
        return this.W;
    }
    
    public abstract void l(final int p0, final int p1);
    
    @j0
    public a m(final int n) {
        this.N = n;
        return this;
    }
    
    @j0
    public a n(final int m) {
        this.M = m;
        return this;
    }
    
    public a o(final boolean v) {
        if (this.V && !v) {
            this.k();
        }
        this.V = v;
        return this;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final boolean v = this.V;
        final boolean b = false;
        if (!v) {
            return false;
        }
        final int actionMasked = motionEvent.getActionMasked();
        Label_0140: {
            Label_0063: {
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked == 2) {
                            break Label_0063;
                        }
                        if (actionMasked != 3) {
                            break Label_0140;
                        }
                    }
                    this.k();
                    break Label_0140;
                }
                this.T = true;
                this.R = false;
            }
            this.G.l(this.d(0, motionEvent.getX(), (float)view.getWidth(), (float)this.I.getWidth()), this.d(1, motionEvent.getY(), (float)view.getHeight(), (float)this.I.getHeight()));
            if (!this.U && this.x()) {
                this.y();
            }
        }
        boolean b2 = b;
        if (this.W) {
            b2 = b;
            if (this.U) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public a p(final boolean w) {
        this.W = w;
        return this;
    }
    
    @j0
    public a q(final float n, final float n2) {
        final float[] l = this.L;
        l[0] = n;
        l[1] = n2;
        return this;
    }
    
    @j0
    public a r(final float n, final float n2) {
        final float[] q = this.Q;
        q[0] = n / 1000.0f;
        q[1] = n2 / 1000.0f;
        return this;
    }
    
    @j0
    public a s(final float n, final float n2) {
        final float[] p2 = this.P;
        p2[0] = n / 1000.0f;
        p2[1] = n2 / 1000.0f;
        return this;
    }
    
    @j0
    public a t(final int n) {
        this.G.j(n);
        return this;
    }
    
    @j0
    public a u(final int n) {
        this.G.k(n);
        return this;
    }
    
    @j0
    public a v(final float n, final float n2) {
        final float[] k = this.K;
        k[0] = n;
        k[1] = n2;
        return this;
    }
    
    @j0
    public a w(final float n, final float n2) {
        final float[] o = this.O;
        o[0] = n / 1000.0f;
        o[1] = n2 / 1000.0f;
        return this;
    }
    
    boolean x() {
        final a g = this.G;
        final int f = g.f();
        final int d = g.d();
        return (f != 0 && this.b(f)) || (d != 0 && this.a(d));
    }
    
    private static class a
    {
        private int a;
        private int b;
        private float c;
        private float d;
        private long e;
        private long f;
        private int g;
        private int h;
        private long i;
        private float j;
        private int k;
        
        a() {
            this.e = Long.MIN_VALUE;
            this.i = -1L;
            this.f = 0L;
            this.g = 0;
            this.h = 0;
        }
        
        private float e(final long n) {
            final long e = this.e;
            if (n < e) {
                return 0.0f;
            }
            final long i = this.i;
            if (i >= 0L && n >= i) {
                final float j = this.j;
                return 1.0f - j + j * androidx.core.widget.a.e((n - i) / (float)this.k, 0.0f, 1.0f);
            }
            return androidx.core.widget.a.e((n - e) / (float)this.a, 0.0f, 1.0f) * 0.5f;
        }
        
        private float g(final float n) {
            return -4.0f * n * n + n * 4.0f;
        }
        
        public void a() {
            if (this.f != 0L) {
                final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                final float g = this.g(this.e(currentAnimationTimeMillis));
                final long f = this.f;
                this.f = currentAnimationTimeMillis;
                final float n = (currentAnimationTimeMillis - f) * g;
                this.g = (int)(this.c * n);
                this.h = (int)(n * this.d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
        
        public int b() {
            return this.g;
        }
        
        public int c() {
            return this.h;
        }
        
        public int d() {
            final float c = this.c;
            return (int)(c / Math.abs(c));
        }
        
        public int f() {
            final float d = this.d;
            return (int)(d / Math.abs(d));
        }
        
        public boolean h() {
            return this.i > 0L && AnimationUtils.currentAnimationTimeMillis() > this.i + this.k;
        }
        
        public void i() {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.k = androidx.core.widget.a.f((int)(currentAnimationTimeMillis - this.e), 0, this.b);
            this.j = this.e(currentAnimationTimeMillis);
            this.i = currentAnimationTimeMillis;
        }
        
        public void j(final int b) {
            this.b = b;
        }
        
        public void k(final int a) {
            this.a = a;
        }
        
        public void l(final float c, final float d) {
            this.c = c;
            this.d = d;
        }
        
        public void m() {
            final long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.e = currentAnimationTimeMillis;
            this.i = -1L;
            this.f = currentAnimationTimeMillis;
            this.j = 0.5f;
            this.g = 0;
            this.h = 0;
        }
    }
    
    private class b implements Runnable
    {
        b() {
        }
        
        @Override
        public void run() {
            final a g = a.this;
            if (!g.U) {
                return;
            }
            if (g.S) {
                g.S = false;
                g.G.m();
            }
            final a g2 = a.this.G;
            if (!g2.h() && a.this.x()) {
                final a g3 = a.this;
                if (g3.T) {
                    g3.T = false;
                    g3.c();
                }
                g2.a();
                a.this.l(g2.b(), g2.c());
                androidx.core.view.j0.n1(a.this.I, this);
                return;
            }
            a.this.U = false;
        }
    }
}
