// 
// Decompiled by Procyon v0.5.36
// 

package androidx.swiperefreshlayout.widget;

import android.graphics.Path$FillType;
import android.graphics.Paint$Style;
import android.graphics.Path;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.annotation.t0;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.Paint$Cap;
import android.animation.Animator$AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.animation.ValueAnimator;
import androidx.core.util.n;
import androidx.annotation.j0;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.animation.Animator;
import android.content.res.Resources;
import android.view.animation.Interpolator;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public class b extends Drawable implements Animatable
{
    private static final Interpolator M;
    private static final Interpolator N;
    public static final int O = 0;
    private static final float P = 11.0f;
    private static final float Q = 3.0f;
    private static final int R = 12;
    private static final int S = 6;
    public static final int T = 1;
    private static final float U = 7.5f;
    private static final float V = 2.5f;
    private static final int W = 10;
    private static final int X = 5;
    private static final int[] Y;
    private static final float Z = 0.75f;
    private static final float a0 = 0.5f;
    private static final int b0 = 1332;
    private static final float c0 = 216.0f;
    private static final float d0 = 0.8f;
    private static final float e0 = 0.01f;
    private static final float f0 = 0.20999998f;
    private final d G;
    private float H;
    private Resources I;
    private Animator J;
    float K;
    boolean L;
    
    static {
        M = (Interpolator)new LinearInterpolator();
        N = (Interpolator)new androidx.interpolator.view.animation.b();
        Y = new int[] { -16777216 };
    }
    
    public b(@j0 final Context context) {
        this.I = n.g(context).getResources();
        (this.G = new d()).F(b.Y);
        this.E(2.5f);
        this.G();
    }
    
    private void A(final float h) {
        this.H = h;
    }
    
    private void B(final float n, final float n2, final float n3, final float n4) {
        final d g = this.G;
        final float density = this.I.getDisplayMetrics().density;
        g.L(n2 * density);
        g.B(n * density);
        g.E(0);
        g.y(n3 * density, n4 * density);
    }
    
    private void G() {
        final d g = this.G;
        final ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[] { 0.0f, 1.0f });
        ofFloat.addUpdateListener((ValueAnimator$AnimatorUpdateListener)new ValueAnimator$AnimatorUpdateListener() {
            public void onAnimationUpdate(final ValueAnimator valueAnimator) {
                final float floatValue = (float)valueAnimator.getAnimatedValue();
                androidx.swiperefreshlayout.widget.b.this.H(floatValue, g);
                androidx.swiperefreshlayout.widget.b.this.e(floatValue, g, false);
                androidx.swiperefreshlayout.widget.b.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator((TimeInterpolator)b.M);
        ofFloat.addListener((Animator$AnimatorListener)new Animator$AnimatorListener() {
            public void onAnimationCancel(final Animator animator) {
            }
            
            public void onAnimationEnd(final Animator animator) {
            }
            
            public void onAnimationRepeat(final Animator animator) {
                androidx.swiperefreshlayout.widget.b.this.e(1.0f, g, true);
                g.M();
                g.v();
                final b b = androidx.swiperefreshlayout.widget.b.this;
                if (b.L) {
                    b.L = false;
                    animator.cancel();
                    animator.setDuration(1332L);
                    animator.start();
                    g.I(false);
                }
                else {
                    ++b.K;
                }
            }
            
            public void onAnimationStart(final Animator animator) {
                androidx.swiperefreshlayout.widget.b.this.K = 0.0f;
            }
        });
        this.J = (Animator)ofFloat;
    }
    
    private void a(final float n, final d d) {
        this.H(n, d);
        final float n2 = (float)(Math.floor(d.r() / 0.8f) + 1.0);
        d.J(d.s() + (d.q() - 0.01f - d.s()) * n);
        d.G(d.q());
        d.H(d.r() + (n2 - d.r()) * n);
    }
    
    private int f(final float n, int n2, final int n3) {
        final int n4 = n2 >> 24 & 0xFF;
        final int n5 = n2 >> 16 & 0xFF;
        final int n6 = n2 >> 8 & 0xFF;
        n2 &= 0xFF;
        return n4 + (int)(((n3 >> 24 & 0xFF) - n4) * n) << 24 | n5 + (int)(((n3 >> 16 & 0xFF) - n5) * n) << 16 | n6 + (int)(((n3 >> 8 & 0xFF) - n6) * n) << 8 | n2 + (int)(n * ((n3 & 0xFF) - n2));
    }
    
    private float p() {
        return this.H;
    }
    
    public void C(final float n, final float n2) {
        this.G.J(n);
        this.G.G(n2);
        this.invalidateSelf();
    }
    
    public void D(@j0 final Paint$Cap paint$Cap) {
        this.G.K(paint$Cap);
        this.invalidateSelf();
    }
    
    public void E(final float n) {
        this.G.L(n);
        this.invalidateSelf();
    }
    
    public void F(final int n) {
        float n2;
        float n3;
        float n4;
        float n5;
        if (n == 0) {
            n2 = 11.0f;
            n3 = 3.0f;
            n4 = 12.0f;
            n5 = 6.0f;
        }
        else {
            n2 = 7.5f;
            n3 = 2.5f;
            n4 = 10.0f;
            n5 = 5.0f;
        }
        this.B(n2, n3, n4, n5);
        this.invalidateSelf();
    }
    
    void H(final float n, final d d) {
        int n2;
        if (n > 0.75f) {
            n2 = this.f((n - 0.75f) / 0.25f, d.p(), d.k());
        }
        else {
            n2 = d.p();
        }
        d.C(n2);
    }
    
    public void draw(final Canvas canvas) {
        final Rect bounds = this.getBounds();
        canvas.save();
        canvas.rotate(this.H, bounds.exactCenterX(), bounds.exactCenterY());
        this.G.a(canvas, bounds);
        canvas.restore();
    }
    
    void e(final float n, final d d, final boolean b) {
        if (this.L) {
            this.a(n, d);
        }
        else if (n != 1.0f || b) {
            final float r = d.r();
            float s;
            float n3;
            if (n < 0.5f) {
                final float n2 = n / 0.5f;
                s = d.s();
                n3 = b.N.getInterpolation(n2) * 0.79f + 0.01f + s;
            }
            else {
                final float n4 = (n - 0.5f) / 0.5f;
                n3 = d.s() + 0.79f;
                s = n3 - ((1.0f - b.N.getInterpolation(n4)) * 0.79f + 0.01f);
            }
            final float k = this.K;
            d.J(s);
            d.G(n3);
            d.H(r + 0.20999998f * n);
            this.A((n + k) * 216.0f);
        }
    }
    
    public boolean g() {
        return this.G.n();
    }
    
    public int getAlpha() {
        return this.G.c();
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public float h() {
        return this.G.d();
    }
    
    public float i() {
        return this.G.e();
    }
    
    public boolean isRunning() {
        return this.J.isRunning();
    }
    
    public float j() {
        return this.G.f();
    }
    
    public int k() {
        return this.G.g();
    }
    
    public float l() {
        return this.G.h();
    }
    
    @j0
    public int[] m() {
        return this.G.i();
    }
    
    public float n() {
        return this.G.j();
    }
    
    public float o() {
        return this.G.m();
    }
    
    public float q() {
        return this.G.o();
    }
    
    @j0
    public Paint$Cap r() {
        return this.G.t();
    }
    
    public float s() {
        return this.G.u();
    }
    
    public void setAlpha(final int n) {
        this.G.x(n);
        this.invalidateSelf();
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
        this.G.D(colorFilter);
        this.invalidateSelf();
    }
    
    public void start() {
        this.J.cancel();
        this.G.M();
        Animator animator;
        long duration;
        if (this.G.j() != this.G.o()) {
            this.L = true;
            animator = this.J;
            duration = 666L;
        }
        else {
            this.G.E(0);
            this.G.w();
            animator = this.J;
            duration = 1332L;
        }
        animator.setDuration(duration);
        this.J.start();
    }
    
    public void stop() {
        this.J.cancel();
        this.A(0.0f);
        this.G.I(false);
        this.G.E(0);
        this.G.w();
        this.invalidateSelf();
    }
    
    public void t(final float n, final float n2) {
        this.G.y(n, n2);
        this.invalidateSelf();
    }
    
    public void u(final boolean b) {
        this.G.I(b);
        this.invalidateSelf();
    }
    
    public void v(final float n) {
        this.G.z(n);
        this.invalidateSelf();
    }
    
    public void w(final int n) {
        this.G.A(n);
        this.invalidateSelf();
    }
    
    public void x(final float n) {
        this.G.B(n);
        this.invalidateSelf();
    }
    
    public void y(@j0 final int... array) {
        this.G.F(array);
        this.G.E(0);
        this.invalidateSelf();
    }
    
    public void z(final float n) {
        this.G.H(n);
        this.invalidateSelf();
    }
    
    @Retention(RetentionPolicy.SOURCE)
    @t0({ t0.a.H })
    public @interface c {
    }
    
    private static class d
    {
        final RectF a;
        final Paint b;
        final Paint c;
        final Paint d;
        float e;
        float f;
        float g;
        float h;
        int[] i;
        int j;
        float k;
        float l;
        float m;
        boolean n;
        Path o;
        float p;
        float q;
        int r;
        int s;
        int t;
        int u;
        
        d() {
            this.a = new RectF();
            final Paint b = new Paint();
            this.b = b;
            final Paint c = new Paint();
            this.c = c;
            final Paint d = new Paint();
            this.d = d;
            this.e = 0.0f;
            this.f = 0.0f;
            this.g = 0.0f;
            this.h = 5.0f;
            this.p = 1.0f;
            this.t = 255;
            b.setStrokeCap(Paint$Cap.SQUARE);
            b.setAntiAlias(true);
            b.setStyle(Paint$Style.STROKE);
            c.setStyle(Paint$Style.FILL);
            c.setAntiAlias(true);
            d.setColor(0);
        }
        
        void A(final int color) {
            this.d.setColor(color);
        }
        
        void B(final float q) {
            this.q = q;
        }
        
        void C(final int u) {
            this.u = u;
        }
        
        void D(final ColorFilter colorFilter) {
            this.b.setColorFilter(colorFilter);
        }
        
        void E(final int j) {
            this.j = j;
            this.u = this.i[j];
        }
        
        void F(@j0 final int[] i) {
            this.i = i;
            this.E(0);
        }
        
        void G(final float f) {
            this.f = f;
        }
        
        void H(final float g) {
            this.g = g;
        }
        
        void I(final boolean n) {
            if (this.n != n) {
                this.n = n;
            }
        }
        
        void J(final float e) {
            this.e = e;
        }
        
        void K(final Paint$Cap strokeCap) {
            this.b.setStrokeCap(strokeCap);
        }
        
        void L(final float n) {
            this.h = n;
            this.b.setStrokeWidth(n);
        }
        
        void M() {
            this.k = this.e;
            this.l = this.f;
            this.m = this.g;
        }
        
        void a(final Canvas canvas, final Rect rect) {
            final RectF a = this.a;
            final float q = this.q;
            float n = this.h / 2.0f + q;
            if (q <= 0.0f) {
                n = Math.min(rect.width(), rect.height()) / 2.0f - Math.max(this.r * this.p / 2.0f, this.h / 2.0f);
            }
            a.set(rect.centerX() - n, rect.centerY() - n, rect.centerX() + n, rect.centerY() + n);
            final float e = this.e;
            final float g = this.g;
            final float n2 = (e + g) * 360.0f;
            final float n3 = (this.f + g) * 360.0f - n2;
            this.b.setColor(this.u);
            this.b.setAlpha(this.t);
            final float n4 = this.h / 2.0f;
            a.inset(n4, n4);
            canvas.drawCircle(a.centerX(), a.centerY(), a.width() / 2.0f, this.d);
            final float n5 = -n4;
            a.inset(n5, n5);
            canvas.drawArc(a, n2, n3, false, this.b);
            this.b(canvas, n2, n3, a);
        }
        
        void b(final Canvas canvas, final float n, final float n2, final RectF rectF) {
            if (this.n) {
                final Path o = this.o;
                if (o == null) {
                    (this.o = new Path()).setFillType(Path$FillType.EVEN_ODD);
                }
                else {
                    o.reset();
                }
                final float n3 = Math.min(rectF.width(), rectF.height()) / 2.0f;
                final float n4 = this.r * this.p / 2.0f;
                this.o.moveTo(0.0f, 0.0f);
                this.o.lineTo(this.r * this.p, 0.0f);
                final Path o2 = this.o;
                final float n5 = (float)this.r;
                final float p4 = this.p;
                o2.lineTo(n5 * p4 / 2.0f, this.s * p4);
                this.o.offset(n3 + rectF.centerX() - n4, rectF.centerY() + this.h / 2.0f);
                this.o.close();
                this.c.setColor(this.u);
                this.c.setAlpha(this.t);
                canvas.save();
                canvas.rotate(n + n2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.o, this.c);
                canvas.restore();
            }
        }
        
        int c() {
            return this.t;
        }
        
        float d() {
            return (float)this.s;
        }
        
        float e() {
            return this.p;
        }
        
        float f() {
            return (float)this.r;
        }
        
        int g() {
            return this.d.getColor();
        }
        
        float h() {
            return this.q;
        }
        
        int[] i() {
            return this.i;
        }
        
        float j() {
            return this.f;
        }
        
        int k() {
            return this.i[this.l()];
        }
        
        int l() {
            return (this.j + 1) % this.i.length;
        }
        
        float m() {
            return this.g;
        }
        
        boolean n() {
            return this.n;
        }
        
        float o() {
            return this.e;
        }
        
        int p() {
            return this.i[this.j];
        }
        
        float q() {
            return this.l;
        }
        
        float r() {
            return this.m;
        }
        
        float s() {
            return this.k;
        }
        
        Paint$Cap t() {
            return this.b.getStrokeCap();
        }
        
        float u() {
            return this.h;
        }
        
        void v() {
            this.E(this.l());
        }
        
        void w() {
            this.k = 0.0f;
            this.l = 0.0f;
            this.J(this.m = 0.0f);
            this.G(0.0f);
            this.H(0.0f);
        }
        
        void x(final int t) {
            this.t = t;
        }
        
        void y(final float n, final float n2) {
            this.r = (int)n;
            this.s = (int)n2;
        }
        
        void z(final float p) {
            if (p != this.p) {
                this.p = p;
            }
        }
    }
}
