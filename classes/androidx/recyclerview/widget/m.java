// 
// Decompiled by Procyon v0.5.36
// 

package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.annotation.k0;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.j0;
import android.graphics.Canvas;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.Animator$AnimatorListener;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.annotation.b1;

@b1
class m extends o implements t
{
    private static final int D = 0;
    private static final int E = 1;
    private static final int F = 2;
    private static final int G = 0;
    private static final int H = 1;
    private static final int I = 2;
    private static final int J = 0;
    private static final int K = 1;
    private static final int L = 2;
    private static final int M = 3;
    private static final int N = 500;
    private static final int O = 1500;
    private static final int P = 1200;
    private static final int Q = 500;
    private static final int R = 255;
    private static final int[] S;
    private static final int[] T;
    int A;
    private final Runnable B;
    private final u C;
    private final int a;
    private final int b;
    final StateListDrawable c;
    final Drawable d;
    private final int e;
    private final int f;
    private final StateListDrawable g;
    private final Drawable h;
    private final int i;
    private final int j;
    @b1
    int k;
    @b1
    int l;
    @b1
    float m;
    @b1
    int n;
    @b1
    int o;
    @b1
    float p;
    private int q;
    private int r;
    private RecyclerView s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private final int[] x;
    private final int[] y;
    final ValueAnimator z;
    
    static {
        S = new int[] { 16842919 };
        T = new int[0];
    }
    
    m(final RecyclerView recyclerView, final StateListDrawable c, final Drawable d, final StateListDrawable g, final Drawable h, final int n, final int a, final int b) {
        this.q = 0;
        this.r = 0;
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = new int[2];
        this.y = new int[2];
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        this.z = ofFloat;
        this.A = 0;
        this.B = new Runnable() {
            @Override
            public void run() {
                androidx.recyclerview.widget.m.this.w(500);
            }
        };
        this.C = new u() {
            @Override
            public void b(final RecyclerView recyclerView, final int n, final int n2) {
                m.this.J(recyclerView.computeHorizontalScrollOffset(), recyclerView.computeVerticalScrollOffset());
            }
        };
        this.c = c;
        this.d = d;
        this.g = g;
        this.h = h;
        this.e = Math.max(n, c.getIntrinsicWidth());
        this.f = Math.max(n, d.getIntrinsicWidth());
        this.i = Math.max(n, g.getIntrinsicWidth());
        this.j = Math.max(n, h.getIntrinsicWidth());
        this.a = a;
        this.b = b;
        c.setAlpha(255);
        d.setAlpha(255);
        ofFloat.addListener((Animator$AnimatorListener)new c());
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new d());
        this.l(recyclerView);
    }
    
    private void E(final int n) {
        this.m();
        this.s.postDelayed(this.B, (long)n);
    }
    
    private int F(float n, final float n2, final int[] array, int n3, int n4, int n5) {
        final int n6 = array[1] - array[0];
        if (n6 == 0) {
            return 0;
        }
        n = (n2 - n) / n6;
        n3 -= n5;
        n5 = (int)(n * n3);
        n4 += n5;
        if (n4 < n3 && n4 >= 0) {
            return n5;
        }
        return 0;
    }
    
    private void H() {
        this.s.n((RecyclerView.o)this);
        this.s.q((RecyclerView.t)this);
        this.s.r(this.C);
    }
    
    private void K(float max) {
        final int[] t = this.t();
        max = Math.max((float)t[0], Math.min((float)t[1], max));
        if (Math.abs(this.l - max) < 2.0f) {
            return;
        }
        final int f = this.F(this.m, max, t, this.s.computeVerticalScrollRange(), this.s.computeVerticalScrollOffset(), this.r);
        if (f != 0) {
            this.s.scrollBy(0, f);
        }
        this.m = max;
    }
    
    private void m() {
        this.s.removeCallbacks(this.B);
    }
    
    private void n() {
        this.s.s1((RecyclerView.o)this);
        this.s.v1((RecyclerView.t)this);
        this.s.w1(this.C);
        this.m();
    }
    
    private void o(final Canvas canvas) {
        final int r = this.r;
        final int i = this.i;
        final int n = r - i;
        final int o = this.o;
        final int n2 = this.n;
        final int n3 = o - n2 / 2;
        this.g.setBounds(0, 0, n2, i);
        this.h.setBounds(0, 0, this.q, this.j);
        canvas.translate(0.0f, (float)n);
        this.h.draw(canvas);
        canvas.translate((float)n3, 0.0f);
        this.g.draw(canvas);
        canvas.translate((float)(-n3), (float)(-n));
    }
    
    private void p(final Canvas canvas) {
        final int q = this.q;
        final int e = this.e;
        int e2 = q - e;
        final int l = this.l;
        final int k = this.k;
        final int n = l - k / 2;
        this.c.setBounds(0, 0, e, k);
        this.d.setBounds(0, 0, this.f, this.r);
        if (this.z()) {
            this.d.draw(canvas);
            canvas.translate((float)this.e, (float)n);
            canvas.scale(-1.0f, 1.0f);
            this.c.draw(canvas);
            canvas.scale(-1.0f, 1.0f);
            e2 = this.e;
        }
        else {
            canvas.translate((float)e2, 0.0f);
            this.d.draw(canvas);
            canvas.translate(0.0f, (float)n);
            this.c.draw(canvas);
        }
        canvas.translate((float)(-e2), (float)(-n));
    }
    
    private int[] q() {
        final int[] y = this.y;
        final int b = this.b;
        y[0] = b;
        y[1] = this.q - b;
        return y;
    }
    
    private int[] t() {
        final int[] x = this.x;
        final int b = this.b;
        x[0] = b;
        x[1] = this.r - b;
        return x;
    }
    
    private void x(float max) {
        final int[] q = this.q();
        max = Math.max((float)q[0], Math.min((float)q[1], max));
        if (Math.abs(this.o - max) < 2.0f) {
            return;
        }
        final int f = this.F(this.p, max, q, this.s.computeHorizontalScrollRange(), this.s.computeHorizontalScrollOffset(), this.q);
        if (f != 0) {
            this.s.scrollBy(f, 0);
        }
        this.p = max;
    }
    
    private boolean z() {
        final int x = androidx.core.view.j0.X((View)this.s);
        boolean b = true;
        if (x != 1) {
            b = false;
        }
        return b;
    }
    
    @b1
    boolean A(final float n, final float n2) {
        if (n2 >= this.r - this.i) {
            final int o = this.o;
            final int n3 = this.n;
            if (n >= o - n3 / 2 && n <= o + n3 / 2) {
                return true;
            }
        }
        return false;
    }
    
    @b1
    boolean B(final float n, final float n2) {
        if (this.z()) {
            if (n > this.e) {
                return false;
            }
        }
        else if (n < this.q - this.e) {
            return false;
        }
        final int l = this.l;
        final int k = this.k;
        if (n2 >= l - k / 2 && n2 <= l + k / 2) {
            return true;
        }
        return false;
    }
    
    @b1
    boolean C() {
        final int v = this.v;
        boolean b = true;
        if (v != 1) {
            b = false;
        }
        return b;
    }
    
    void D() {
        this.s.invalidate();
    }
    
    void G(final int v) {
        if (v == 2 && this.v != 2) {
            this.c.setState(androidx.recyclerview.widget.m.S);
            this.m();
        }
        if (v == 0) {
            this.D();
        }
        else {
            this.I();
        }
        Label_0088: {
            int n;
            if (this.v == 2 && v != 2) {
                this.c.setState(androidx.recyclerview.widget.m.T);
                n = 1200;
            }
            else {
                if (v != 1) {
                    break Label_0088;
                }
                n = 1500;
            }
            this.E(n);
        }
        this.v = v;
    }
    
    public void I() {
        final int a = this.A;
        if (a != 0) {
            if (a != 3) {
                return;
            }
            this.z.cancel();
        }
        this.A = 1;
        final ValueAnimator z = this.z;
        z.setFloatValues(new float[] { (float)z.getAnimatedValue(), 1.0f });
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
    
    void J(int v, final int n) {
        final int computeVerticalScrollRange = this.s.computeVerticalScrollRange();
        final int r = this.r;
        this.t = (computeVerticalScrollRange - r > 0 && r >= this.a);
        final int computeHorizontalScrollRange = this.s.computeHorizontalScrollRange();
        final int q = this.q;
        final boolean u = computeHorizontalScrollRange - q > 0 && q >= this.a;
        this.u = u;
        final boolean t = this.t;
        if (!t && !u) {
            if (this.v != 0) {
                this.G(0);
            }
            return;
        }
        if (t) {
            final float n2 = (float)n;
            final float n3 = (float)r;
            this.l = (int)(n3 * (n2 + n3 / 2.0f) / computeVerticalScrollRange);
            this.k = Math.min(r, r * r / computeVerticalScrollRange);
        }
        if (this.u) {
            final float n4 = (float)v;
            final float n5 = (float)q;
            this.o = (int)(n5 * (n4 + n5 / 2.0f) / computeHorizontalScrollRange);
            this.n = Math.min(q, q * q / computeHorizontalScrollRange);
        }
        v = this.v;
        if (v == 0 || v == 1) {
            this.G(1);
        }
    }
    
    @Override
    public void a(@androidx.annotation.j0 final RecyclerView recyclerView, @androidx.annotation.j0 final MotionEvent motionEvent) {
        if (this.v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            final boolean b = this.B(motionEvent.getX(), motionEvent.getY());
            final boolean a = this.A(motionEvent.getX(), motionEvent.getY());
            if (b || a) {
                if (a) {
                    this.w = 1;
                    this.p = (float)(int)motionEvent.getX();
                }
                else if (b) {
                    this.w = 2;
                    this.m = (float)(int)motionEvent.getY();
                }
                this.G(2);
            }
        }
        else if (motionEvent.getAction() == 1 && this.v == 2) {
            this.m = 0.0f;
            this.p = 0.0f;
            this.G(1);
            this.w = 0;
        }
        else if (motionEvent.getAction() == 2 && this.v == 2) {
            this.I();
            if (this.w == 1) {
                this.x(motionEvent.getX());
            }
            if (this.w == 2) {
                this.K(motionEvent.getY());
            }
        }
    }
    
    @Override
    public boolean c(@androidx.annotation.j0 final RecyclerView recyclerView, @androidx.annotation.j0 final MotionEvent motionEvent) {
        final int v = this.v;
        final boolean b = false;
        if (v == 1) {
            final boolean b2 = this.B(motionEvent.getX(), motionEvent.getY());
            final boolean a = this.A(motionEvent.getX(), motionEvent.getY());
            boolean b3 = b;
            if (motionEvent.getAction() != 0) {
                return b3;
            }
            if (!b2) {
                b3 = b;
                if (!a) {
                    return b3;
                }
            }
            if (a) {
                this.w = 1;
                this.p = (float)(int)motionEvent.getX();
            }
            else if (b2) {
                this.w = 2;
                this.m = (float)(int)motionEvent.getY();
            }
            this.G(2);
        }
        else {
            final boolean b3 = b;
            if (v != 2) {
                return b3;
            }
        }
        return true;
    }
    
    @Override
    public void e(final boolean b) {
    }
    
    @Override
    public void k(final Canvas canvas, final RecyclerView recyclerView, final d0 d0) {
        if (this.q == this.s.getWidth() && this.r == this.s.getHeight()) {
            if (this.A != 0) {
                if (this.t) {
                    this.p(canvas);
                }
                if (this.u) {
                    this.o(canvas);
                }
            }
            return;
        }
        this.q = this.s.getWidth();
        this.r = this.s.getHeight();
        this.G(0);
    }
    
    public void l(@k0 final RecyclerView s) {
        final RecyclerView s2 = this.s;
        if (s2 == s) {
            return;
        }
        if (s2 != null) {
            this.n();
        }
        if ((this.s = s) != null) {
            this.H();
        }
    }
    
    @b1
    Drawable r() {
        return (Drawable)this.g;
    }
    
    @b1
    Drawable s() {
        return this.h;
    }
    
    @b1
    Drawable u() {
        return (Drawable)this.c;
    }
    
    @b1
    Drawable v() {
        return this.d;
    }
    
    @b1
    void w(final int n) {
        final int a = this.A;
        if (a != 1) {
            if (a != 2) {
                return;
            }
        }
        else {
            this.z.cancel();
        }
        this.A = 3;
        final ValueAnimator z = this.z;
        z.setFloatValues(new float[] { (float)z.getAnimatedValue(), 0.0f });
        this.z.setDuration((long)n);
        this.z.start();
    }
    
    public boolean y() {
        return this.v == 2;
    }
    
    private class c extends AnimatorListenerAdapter
    {
        private boolean a;
        
        c() {
            this.a = false;
        }
        
        public void onAnimationCancel(final Animator animator) {
            this.a = true;
        }
        
        public void onAnimationEnd(final Animator animator) {
            if (this.a) {
                this.a = false;
                return;
            }
            if ((float)androidx.recyclerview.widget.m.this.z.getAnimatedValue() == 0.0f) {
                final m b = androidx.recyclerview.widget.m.this;
                b.G(b.A = 0);
            }
            else {
                final m b2 = androidx.recyclerview.widget.m.this;
                b2.A = 2;
                b2.D();
            }
        }
    }
    
    private class d implements ValueAnimator$AnimatorUpdateListener
    {
        d() {
        }
        
        public void onAnimationUpdate(final ValueAnimator valueAnimator) {
            final int n = (int)((float)valueAnimator.getAnimatedValue() * 255.0f);
            androidx.recyclerview.widget.m.this.c.setAlpha(n);
            androidx.recyclerview.widget.m.this.d.setAlpha(n);
            androidx.recyclerview.widget.m.this.D();
        }
    }
}
