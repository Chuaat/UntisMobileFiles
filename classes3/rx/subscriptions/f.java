// 
// Decompiled by Procyon v0.5.36
// 

package rx.subscriptions;

import java.util.concurrent.Future;
import rx.o;
import rx.functions.a;

public final class f
{
    private static final b a;
    
    static {
        a = new b();
    }
    
    private f() {
        throw new IllegalStateException("No instances!");
    }
    
    public static o a(final rx.functions.a a) {
        return a.b(a);
    }
    
    public static o b() {
        return rx.subscriptions.a.a();
    }
    
    public static o c(final Future<?> future) {
        return new a(future);
    }
    
    public static rx.subscriptions.b d(final o... array) {
        return new rx.subscriptions.b(array);
    }
    
    public static o e() {
        return f.a;
    }
    
    static final class a implements o
    {
        final Future<?> G;
        
        public a(final Future<?> g) {
            this.G = g;
        }
        
        @Override
        public boolean g() {
            return this.G.isCancelled();
        }
        
        @Override
        public void i() {
            this.G.cancel(true);
        }
    }
    
    static final class b implements o
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
