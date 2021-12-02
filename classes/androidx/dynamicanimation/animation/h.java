// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import androidx.annotation.t;
import androidx.annotation.t0;

public final class h implements f
{
    public static final float k = 10000.0f;
    public static final float l = 1500.0f;
    public static final float m = 200.0f;
    public static final float n = 50.0f;
    public static final float o = 0.2f;
    public static final float p = 0.5f;
    public static final float q = 0.75f;
    public static final float r = 1.0f;
    private static final double s = 62.5;
    private static final double t = Double.MAX_VALUE;
    double a;
    double b;
    private boolean c;
    private double d;
    private double e;
    private double f;
    private double g;
    private double h;
    private double i;
    private final b.p j;
    
    public h() {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new b.p();
    }
    
    public h(final float n) {
        this.a = Math.sqrt(1500.0);
        this.b = 0.5;
        this.c = false;
        this.i = Double.MAX_VALUE;
        this.j = new b.p();
        this.i = n;
    }
    
    private void f() {
        if (this.c) {
            return;
        }
        if (this.i != Double.MAX_VALUE) {
            final double b = this.b;
            if (b > 1.0) {
                final double n = -b;
                final double a = this.a;
                this.f = n * a + a * Math.sqrt(b * b - 1.0);
                final double b2 = this.b;
                final double n2 = -b2;
                final double a2 = this.a;
                this.g = n2 * a2 - a2 * Math.sqrt(b2 * b2 - 1.0);
            }
            else if (b >= 0.0 && b < 1.0) {
                this.h = this.a * Math.sqrt(1.0 - b * b);
            }
            this.c = true;
            return;
        }
        throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
    }
    
    @t0({ t0.a.G })
    @Override
    public boolean a(final float n, final float a) {
        return Math.abs(a) < this.e && Math.abs(n - this.d()) < this.d;
    }
    
    @t0({ t0.a.G })
    @Override
    public float b(final float n, final float n2) {
        final float d = this.d();
        final double a = this.a;
        return (float)(-(a * a) * (n - d) - a * 2.0 * this.b * n2);
    }
    
    public float c() {
        return (float)this.b;
    }
    
    public float d() {
        return (float)this.i;
    }
    
    public float e() {
        final double a = this.a;
        return (float)(a * a);
    }
    
    public h g(@t(from = 0.0) final float n) {
        if (n >= 0.0f) {
            this.b = n;
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }
    
    public h h(final float n) {
        this.i = n;
        return this;
    }
    
    public h i(@t(from = 0.0, fromInclusive = false) final float n) {
        if (n > 0.0f) {
            this.a = Math.sqrt(n);
            this.c = false;
            return this;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }
    
    void j(double abs) {
        abs = Math.abs(abs);
        this.d = abs;
        this.e = abs * 62.5;
    }
    
    b.p k(double n, double n2, final long n3) {
        this.f();
        final double n4 = n3 / 1000.0;
        final double n5 = n - this.i;
        n = this.b;
        if (n > 1.0) {
            n = this.g;
            final double f = this.f;
            final double n6 = n5 - (n * n5 - n2) / (n - f);
            n2 = (n5 * n - n2) / (n - f);
            n = Math.pow(2.718281828459045, n * n4) * n6 + Math.pow(2.718281828459045, this.f * n4) * n2;
            final double g = this.g;
            final double pow = Math.pow(2.718281828459045, g * n4);
            final double f2 = this.f;
            n2 = n6 * g * pow + n2 * f2 * Math.pow(2.718281828459045, f2 * n4);
        }
        else if (n == 1.0) {
            n = this.a;
            n2 += n * n5;
            final double n7 = n5 + n2 * n4;
            n = Math.pow(2.718281828459045, -n * n4) * n7;
            final double pow2 = Math.pow(2.718281828459045, -this.a * n4);
            final double a = this.a;
            n2 = n2 * Math.pow(2.718281828459045, -a * n4) + n7 * pow2 * -a;
        }
        else {
            final double n8 = 1.0 / this.h;
            final double a2 = this.a;
            n2 = n8 * (n * a2 * n5 + n2);
            n = Math.pow(2.718281828459045, -n * a2 * n4) * (Math.cos(this.h * n4) * n5 + Math.sin(this.h * n4) * n2);
            final double a3 = this.a;
            final double n9 = -a3;
            final double b = this.b;
            final double pow3 = Math.pow(2.718281828459045, -b * a3 * n4);
            final double h = this.h;
            final double n10 = -h;
            final double sin = Math.sin(h * n4);
            final double h2 = this.h;
            n2 = n9 * n * b + pow3 * (n10 * n5 * sin + n2 * h2 * Math.cos(h2 * n4));
        }
        final b.p j = this.j;
        j.a = (float)(n + this.i);
        j.b = (float)n2;
        return j;
    }
}
