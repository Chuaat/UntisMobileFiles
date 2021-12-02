// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.subscriptions;

import rx.subscriptions.f;
import rx.o;
import java.util.concurrent.atomic.AtomicReference;

public final class b extends AtomicReference<o> implements o
{
    private static final long G = 995205034283130269L;
    
    public b() {
    }
    
    public b(final o newValue) {
        this.lazySet(newValue);
    }
    
    public o a() {
        o e;
        if ((e = super.get()) == c.G) {
            e = f.e();
        }
        return e;
    }
    
    public boolean b(final o newValue) {
        o expectedValue;
        do {
            expectedValue = this.get();
            if (expectedValue == c.G) {
                if (newValue != null) {
                    newValue.i();
                }
                return false;
            }
        } while (!this.compareAndSet(expectedValue, newValue));
        return true;
    }
    
    public boolean c(final o newValue) {
        final o expectedValue = this.get();
        final c g = c.G;
        if (expectedValue == g) {
            if (newValue != null) {
                newValue.i();
            }
            return false;
        }
        if (this.compareAndSet(expectedValue, newValue)) {
            return true;
        }
        if (this.get() == g) {
            if (newValue != null) {
                newValue.i();
            }
            return false;
        }
        return true;
    }
    
    public boolean d(final o newValue) {
        o expectedValue;
        do {
            expectedValue = this.get();
            if (expectedValue == c.G) {
                if (newValue != null) {
                    newValue.i();
                }
                return false;
            }
        } while (!this.compareAndSet(expectedValue, newValue));
        if (expectedValue != null) {
            expectedValue.i();
        }
        return true;
    }
    
    public boolean e(final o newValue) {
        final o expectedValue = this.get();
        final c g = c.G;
        boolean b = false;
        if (expectedValue == g) {
            if (newValue != null) {
                newValue.i();
            }
            return false;
        }
        if (this.compareAndSet(expectedValue, newValue)) {
            return true;
        }
        final o o = this.get();
        if (newValue != null) {
            newValue.i();
        }
        if (o == g) {
            b = true;
        }
        return b;
    }
    
    @Override
    public boolean g() {
        return this.get() == c.G;
    }
    
    @Override
    public void i() {
        final o o = this.get();
        final c g = c.G;
        if (o != g) {
            final c c = ((AtomicReference<c>)this).getAndSet(g);
            if (c != null && c != g) {
                c.i();
            }
        }
    }
}
