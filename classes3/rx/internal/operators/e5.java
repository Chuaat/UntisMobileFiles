// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.CancellationException;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.n;
import rx.o;
import rx.m;
import rx.g;
import rx.k;

public final class e5<T, U> implements t<T>
{
    final t<T> G;
    final g<? extends U> H;
    
    public e5(final t<T> g, final g<? extends U> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final a a = new a((m<? super T>)m);
        m.d(a);
        this.H.z5((n<? super U>)a.J);
        this.G.h(a);
    }
    
    static final class a<T, U> extends m<T>
    {
        final m<? super T> H;
        final AtomicBoolean I;
        final n<U> J;
        
        a(final m<? super T> h) {
            this.H = h;
            this.I = new AtomicBoolean();
            this.d(this.J = new e5.a.a());
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.compareAndSet(false, true)) {
                this.i();
                this.H.b(t);
            }
            else {
                c.I(t);
            }
        }
        
        @Override
        public void e(final T t) {
            if (this.I.compareAndSet(false, true)) {
                this.i();
                this.H.e((Object)t);
            }
        }
        
        final class a extends n<U>
        {
            @Override
            public void b(final Throwable t) {
                e5.a.this.b(t);
            }
            
            @Override
            public void c() {
                this.b(new CancellationException("Single::takeUntil(Observable) - Stream was canceled before emitting a terminal event."));
            }
            
            @Override
            public void m(final U u) {
                this.c();
            }
        }
    }
}
