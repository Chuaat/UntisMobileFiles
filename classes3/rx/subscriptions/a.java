// 
// Decompiled by Procyon v0.5.36
// 

package rx.subscriptions;

import java.util.concurrent.atomic.AtomicReference;
import rx.o;

public final class a implements o
{
    static final rx.functions.a H;
    final AtomicReference<rx.functions.a> G;
    
    static {
        H = new rx.functions.a() {
            @Override
            public void call() {
            }
        };
    }
    
    public a() {
        this.G = new AtomicReference<rx.functions.a>();
    }
    
    private a(final rx.functions.a initialValue) {
        this.G = new AtomicReference<rx.functions.a>(initialValue);
    }
    
    public static a a() {
        return new a();
    }
    
    public static a b(final rx.functions.a a) {
        return new a(a);
    }
    
    @Override
    public boolean g() {
        return this.G.get() == a.H;
    }
    
    @Override
    public void i() {
        final rx.functions.a a = this.G.get();
        final rx.functions.a h = rx.subscriptions.a.H;
        if (a != h) {
            final rx.functions.a a2 = this.G.getAndSet(h);
            if (a2 != null && a2 != h) {
                a2.call();
            }
        }
    }
}
