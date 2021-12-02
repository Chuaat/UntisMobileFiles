// 
// Decompiled by Procyon v0.5.36
// 

package androidx.dynamicanimation.animation;

import androidx.annotation.t;

public final class c extends b<c>
{
    private final a G;
    
    public c(final androidx.dynamicanimation.animation.e e) {
        super(e);
        (this.G = new a()).e(this.i());
    }
    
    public <K> c(final K k, final androidx.dynamicanimation.animation.d<K> d) {
        super(k, d);
        (this.G = new a()).e(this.i());
    }
    
    public c A(@t(from = 0.0, fromInclusive = false) final float n) {
        if (n > 0.0f) {
            this.G.d(n);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }
    
    public c B(final float n) {
        super.p(n);
        return this;
    }
    
    public c C(final float n) {
        super.q(n);
        return this;
    }
    
    public c D(final float n) {
        super.u(n);
        return this;
    }
    
    @Override
    float f(final float n, final float n2) {
        return this.G.b(n, n2);
    }
    
    @Override
    boolean j(final float n, final float n2) {
        return n >= super.g || n <= super.h || this.G.a(n, n2);
    }
    
    @Override
    void v(final float n) {
        this.G.e(n);
    }
    
    @Override
    boolean y(final long n) {
        final p f = this.G.f(super.b, super.a, n);
        final float a = f.a;
        super.b = a;
        final float b = f.b;
        super.a = b;
        final float h = super.h;
        if (a < h) {
            super.b = h;
            return true;
        }
        final float g = super.g;
        if (a > g) {
            super.b = g;
            return true;
        }
        return this.j(a, b);
    }
    
    public float z() {
        return this.G.c();
    }
    
    static final class a implements f
    {
        private static final float d = -4.2f;
        private static final float e = 62.5f;
        private float a;
        private float b;
        private final p c;
        
        a() {
            this.a = -4.2f;
            this.c = new p();
        }
        
        @Override
        public boolean a(final float n, final float a) {
            return Math.abs(a) < this.b;
        }
        
        @Override
        public float b(final float n, final float n2) {
            return n2 * this.a;
        }
        
        float c() {
            return this.a / -4.2f;
        }
        
        void d(final float n) {
            this.a = n * -4.2f;
        }
        
        void e(final float n) {
            this.b = n * 62.5f;
        }
        
        p f(final float n, final float n2, final long n3) {
            final p c = this.c;
            final double n4 = n2;
            final float n5 = (float)n3;
            c.b = (float)(n4 * Math.exp(n5 / 1000.0f * this.a));
            final p c2 = this.c;
            final float a = this.a;
            c2.a = (float)(n - n2 / a + n2 / a * Math.exp(a * n5 / 1000.0f));
            final p c3 = this.c;
            if (this.a(c3.a, c3.b)) {
                this.c.b = 0.0f;
            }
            return this.c;
        }
    }
}
