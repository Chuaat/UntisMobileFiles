// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import android.util.AndroidRuntimeException;
import android.os.Looper;

public final class g extends b<g>
{
    private static final float J = Float.MAX_VALUE;
    private h G;
    private float H;
    private boolean I;
    
    public g(final androidx.dynamicanimation.animation.e e) {
        super(e);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }
    
    public <K> g(final K k, final androidx.dynamicanimation.animation.d<K> d) {
        super(k, d);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
    }
    
    public <K> g(final K k, final androidx.dynamicanimation.animation.d<K> d, final float n) {
        super(k, d);
        this.G = null;
        this.H = Float.MAX_VALUE;
        this.I = false;
        this.G = new h(n);
    }
    
    private void C() {
        final h g = this.G;
        if (g == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        final double n = g.d();
        if (n > super.g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (n >= super.h) {
            return;
        }
        throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
    }
    
    public boolean A() {
        return this.G.b > 0.0;
    }
    
    public h B() {
        return this.G;
    }
    
    public g D(final h g) {
        this.G = g;
        return this;
    }
    
    public void E() {
        if (!this.A()) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (super.f) {
                this.I = true;
            }
            return;
        }
        throw new AndroidRuntimeException("Animations may only be started on the main thread");
    }
    
    @Override
    float f(final float n, final float n2) {
        return this.G.b(n, n2);
    }
    
    @Override
    boolean j(final float n, final float n2) {
        return this.G.a(n, n2);
    }
    
    @Override
    void v(final float n) {
    }
    
    @Override
    public void w() {
        this.C();
        this.G.j(this.i());
        super.w();
    }
    
    @Override
    boolean y(long n) {
        if (this.I) {
            final float h = this.H;
            if (h != Float.MAX_VALUE) {
                this.G.h(h);
                this.H = Float.MAX_VALUE;
            }
            super.b = this.G.d();
            super.a = 0.0f;
            this.I = false;
            return true;
        }
        h h2;
        double n4;
        double n5;
        if (this.H != Float.MAX_VALUE) {
            this.G.d();
            final h g = this.G;
            final double n2 = super.b;
            final double n3 = super.a;
            n /= 2L;
            final p k = g.k(n2, n3, n);
            this.G.h(this.H);
            this.H = Float.MAX_VALUE;
            h2 = this.G;
            n4 = k.a;
            n5 = k.b;
        }
        else {
            h2 = this.G;
            n4 = super.b;
            n5 = super.a;
        }
        final p i = h2.k(n4, n5, n);
        super.b = i.a;
        super.a = i.b;
        final float max = Math.max(super.b, super.h);
        super.b = max;
        final float min = Math.min(max, super.g);
        super.b = min;
        if (this.j(min, super.a)) {
            super.b = this.G.d();
            super.a = 0.0f;
            return true;
        }
        return false;
    }
    
    public void z(final float h) {
        if (this.k()) {
            this.H = h;
        }
        else {
            if (this.G == null) {
                this.G = new h(h);
            }
            this.G.h(h);
            this.w();
        }
    }
}
