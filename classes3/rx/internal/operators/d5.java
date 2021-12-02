// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.CancellationException;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.d;
import rx.o;
import rx.m;
import rx.b;
import rx.k;

public final class d5<T> implements t<T>
{
    final t<T> G;
    final rx.b H;
    
    public d5(final t<T> g, final rx.b h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m);
        m.d(a);
        this.H.q0(a);
        this.G.h(a);
    }
    
    static final class a<T> extends m<T> implements d
    {
        final m<? super T> H;
        final AtomicBoolean I;
        
        a(final m<? super T> h) {
            this.H = h;
            this.I = new AtomicBoolean();
        }
        
        @Override
        public void a(final o o) {
            this.d(o);
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
        public void c() {
            this.b(new CancellationException("Single::takeUntil(Completable) - Stream was canceled before emitting a terminal event."));
        }
        
        @Override
        public void e(final T t) {
            if (this.I.compareAndSet(false, true)) {
                this.i();
                this.H.e((Object)t);
            }
        }
    }
}
