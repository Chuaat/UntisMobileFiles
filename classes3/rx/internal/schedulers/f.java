// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.schedulers;

import java.util.concurrent.TimeUnit;
import rx.subscriptions.a;
import rx.o;
import rx.j;

public final class f extends j
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    private f() {
    }
    
    @Override
    public j.a a() {
        return new a();
    }
    
    final class a extends j.a implements o
    {
        final rx.subscriptions.a G;
        
        a() {
            this.G = new rx.subscriptions.a();
        }
        
        @Override
        public o c(final rx.functions.a a) {
            a.call();
            return rx.subscriptions.f.e();
        }
        
        @Override
        public o d(final rx.functions.a a, final long duration, final TimeUnit timeUnit) {
            return this.c(new m(a, this, f.this.b() + timeUnit.toMillis(duration)));
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
}
