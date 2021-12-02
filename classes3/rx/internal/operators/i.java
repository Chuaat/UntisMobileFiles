// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.exceptions.c;
import rx.m;
import rx.o;
import rx.d;
import rx.functions.p;
import rx.k;
import rx.b;

public final class i<T> implements j0
{
    final rx.k<T> G;
    final p<? super T, ? extends b> H;
    
    public i(final rx.k<T> g, final p<? super T, ? extends b> h) {
        this.G = g;
        this.H = h;
    }
    
    public void a(final d d) {
        final a<Object> a = new a<Object>(d, (p<? super Object, ? extends b>)this.H);
        d.a(a);
        this.G.j0(a);
    }
    
    static final class a<T> extends m<T> implements d
    {
        final d H;
        final p<? super T, ? extends b> I;
        
        public a(final d h, final p<? super T, ? extends b> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public void a(final o o) {
            this.d(o);
        }
        
        @Override
        public void b(final Throwable t) {
            this.H.b(t);
        }
        
        @Override
        public void c() {
            this.H.c();
        }
        
        @Override
        public void e(final T t) {
            while (true) {
                try {
                    final b b = (b)this.I.h((Object)t);
                    if (b == null) {
                        final NullPointerException ex = new NullPointerException("The mapper returned a null Completable");
                        this.b(ex);
                        return;
                    }
                    b.q0(this);
                }
                finally {
                    final NullPointerException ex;
                    rx.exceptions.c.e(ex);
                    continue;
                }
                break;
            }
        }
    }
}
