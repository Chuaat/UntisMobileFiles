// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.subscriptions.f;
import io.reactivex.n0;
import o7.c;
import io.reactivex.q0;
import io.reactivex.l;

public final class u0<T> extends l<T>
{
    final q0<? extends T> H;
    
    public u0(final q0<? extends T> h) {
        this.H = h;
    }
    
    public void n6(final c<? super T> c) {
        this.H.c(new a<Object>(c));
    }
    
    static final class a<T> extends f<T> implements n0<T>
    {
        private static final long T = 187782011903685568L;
        io.reactivex.disposables.c S;
        
        a(final o7.c<? super T> c) {
            super(c);
        }
        
        @Override
        public void b(final Throwable t) {
            super.H.b(t);
        }
        
        @Override
        public void cancel() {
            super.cancel();
            this.S.dispose();
        }
        
        @Override
        public void d(final T t) {
            this.g(t);
        }
        
        @Override
        public void l(final io.reactivex.disposables.c s) {
            if (d.l(this.S, s)) {
                this.S = s;
                super.H.z((o7.d)this);
            }
        }
    }
}
