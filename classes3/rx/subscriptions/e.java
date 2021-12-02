// 
// Decompiled by Procyon v0.5.36
// 

package rx.subscriptions;

import rx.internal.subscriptions.b;
import rx.o;

public final class e implements o
{
    final b G;
    
    public e() {
        this.G = new b();
    }
    
    public o a() {
        return this.G.a();
    }
    
    public void b(final o o) {
        if (o != null) {
            this.G.d(o);
            return;
        }
        throw new IllegalArgumentException("Subscription can not be null");
    }
    
    @Override
    public boolean g() {
        return this.G.g();
    }
    
    @Override
    public void i() {
        this.G.i();
    }
}
