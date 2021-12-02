// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import java.util.concurrent.TimeoutException;
import rx.plugins.c;
import java.util.concurrent.atomic.AtomicBoolean;
import rx.functions.a;
import rx.o;
import rx.m;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.k;

public final class g5<T> implements t<T>
{
    final t<T> G;
    final long H;
    final TimeUnit I;
    final j J;
    final t<? extends T> K;
    
    public g5(final t<T> g, final long h, final TimeUnit i, final j j, final t<? extends T> k) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public void a(final m<? super T> m) {
        final a<Object> a = new a<Object>((m<? super Object>)m, this.K);
        final j.a a2 = this.J.a();
        a.d(a2);
        m.d(a);
        a2.d(a, this.H, this.I);
        this.G.h(a);
    }
    
    static final class a<T> extends m<T> implements a
    {
        final m<? super T> H;
        final AtomicBoolean I;
        final t<? extends T> J;
        
        a(final m<? super T> h, final t<? extends T> j) {
            this.H = h;
            this.J = j;
            this.I = new AtomicBoolean();
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.I.compareAndSet(false, true)) {
                try {
                    this.H.b(t);
                    return;
                }
                finally {
                    this.i();
                }
            }
            c.I(t);
        }
        
        @Override
        public void call() {
            if (this.I.compareAndSet(false, true)) {
                try {
                    final t<? extends T> j = this.J;
                    if (j == null) {
                        this.H.b(new TimeoutException());
                    }
                    else {
                        final g5.a.a<Object> a = new g5.a.a<Object>((m<? super Object>)this.H);
                        this.H.d(a);
                        j.h(a);
                    }
                }
                finally {
                    this.i();
                }
            }
        }
        
        @Override
        public void e(final T t) {
            if (this.I.compareAndSet(false, true)) {
                try {
                    this.H.e((Object)t);
                }
                finally {
                    this.i();
                }
            }
        }
        
        static final class a<T> extends m<T>
        {
            final m<? super T> H;
            
            a(final m<? super T> h) {
                this.H = h;
            }
            
            @Override
            public void b(final Throwable t) {
                this.H.b(t);
            }
            
            @Override
            public void e(final T t) {
                this.H.e((Object)t);
            }
        }
    }
}
