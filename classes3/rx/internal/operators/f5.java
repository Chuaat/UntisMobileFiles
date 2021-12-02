// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.CancellationException;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.o;
import rx.m;
import rx.k;

public final class f5<T, U> implements t<T>
{
    final t<T> G;
    final k<? extends U> H;
    
    public f5(final t<T> g, final k<? extends U> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final a a = new a((m<? super T>)m);
        m.d(a);
        this.H.j0((m<? super U>)a.J);
        this.G.h(a);
    }
    
    static final class a<T, U> extends m<T>
    {
        final m<? super T> H;
        final AtomicBoolean I;
        final m<U> J;
        
        a(final m<? super T> h) {
            this.H = h;
            this.I = new AtomicBoolean();
            this.d(this.J = new f5.a.a());
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
        
        final class a extends m<U>
        {
            @Override
            public void b(final Throwable t) {
                f5.a.this.b(t);
            }
            
            @Override
            public void e(final U u) {
                this.b(new CancellationException("Single::takeUntil(Single) - Stream was canceled before emitting a terminal event."));
            }
        }
    }
}
