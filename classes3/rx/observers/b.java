// 
// Decompiled by Procyon v0.5.36
// 

package rx.observers;

import rx.plugins.c;
import java.util.concurrent.atomic.AtomicReference;
import rx.o;
import rx.d;

public abstract class b implements d, o
{
    static final a H;
    private final AtomicReference<o> G;
    
    static {
        H = new a();
    }
    
    public b() {
        this.G = new AtomicReference<o>();
    }
    
    @Override
    public final void a(final o newValue) {
        if (!this.G.compareAndSet(null, newValue)) {
            newValue.i();
            if (this.G.get() != b.H) {
                c.I(new IllegalStateException("Subscription already set!"));
            }
        }
        else {
            this.f();
        }
    }
    
    protected final void d() {
        this.G.set(b.H);
    }
    
    protected void f() {
    }
    
    @Override
    public final boolean g() {
        return this.G.get() == b.H;
    }
    
    @Override
    public final void i() {
        final o o = this.G.get();
        final a h = b.H;
        if (o != h) {
            final a a = this.G.getAndSet(h);
            if (a != null && a != h) {
                a.i();
            }
        }
    }
    
    static final class a implements o
    {
        @Override
        public boolean g() {
            return true;
        }
        
        @Override
        public void i() {
        }
    }
}
