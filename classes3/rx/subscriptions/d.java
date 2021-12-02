// 
// Decompiled by Procyon v0.5.36
// 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;

public final class d implements o
{
    static final b I;
    private final o G;
    final AtomicReference<b> H;
    
    static {
        I = new b(false, 0);
    }
    
    public d(final o g) {
        this.H = new AtomicReference<b>(d.I);
        if (g != null) {
            this.G = g;
            return;
        }
        throw new IllegalArgumentException("s");
    }
    
    private void c(final b b) {
        if (b.a && b.b == 0) {
            this.G.i();
        }
    }
    
    public o a() {
        final AtomicReference<b> h = this.H;
        b expectedValue;
        do {
            expectedValue = h.get();
            if (expectedValue.a) {
                return f.e();
            }
        } while (!h.compareAndSet(expectedValue, expectedValue.a()));
        return new a(this);
    }
    
    void b() {
        final AtomicReference<b> h = this.H;
        b expectedValue;
        b b;
        do {
            expectedValue = h.get();
            b = expectedValue.b();
        } while (!h.compareAndSet(expectedValue, b));
        this.c(b);
    }
    
    @Override
    public boolean g() {
        return this.H.get().a;
    }
    
    @Override
    public void i() {
        final AtomicReference<b> h = this.H;
        b expectedValue;
        b c;
        do {
            expectedValue = h.get();
            if (expectedValue.a) {
                return;
            }
            c = expectedValue.c();
        } while (!h.compareAndSet(expectedValue, c));
        this.c(c);
    }
    
    static final class a extends AtomicInteger implements o
    {
        private static final long H = 7005765588239987643L;
        final d G;
        
        public a(final d g) {
            this.G = g;
        }
        
        @Override
        public boolean g() {
            return this.get() != 0;
        }
        
        @Override
        public void i() {
            if (this.compareAndSet(0, 1)) {
                this.G.b();
            }
        }
    }
    
    static final class b
    {
        final boolean a;
        final int b;
        
        b(final boolean a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        b a() {
            return new b(this.a, this.b + 1);
        }
        
        b b() {
            return new b(this.a, this.b - 1);
        }
        
        b c() {
            return new b(true, this.b);
        }
    }
}
