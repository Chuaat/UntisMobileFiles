// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.v;
import io.reactivex.y;
import x5.o;

public final class v0<T, R> extends io.reactivex.internal.operators.maybe.a<T, R>
{
    final o<? super T, ? extends R> H;
    
    public v0(final y<T> y, final o<? super T, ? extends R> h) {
        super(y);
        this.H = h;
    }
    
    @Override
    protected void u1(final v<? super R> v) {
        super.G.c(new a<Object, Object>(v, this.H));
    }
    
    static final class a<T, R> implements v<T>, c
    {
        final v<? super R> G;
        final o<? super T, ? extends R> H;
        c I;
        
        a(final v<? super R> g, final o<? super T, ? extends R> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        @Override
        public void d(final T t) {
            try {
                this.G.d((Object)b.g((Object)this.H.apply((Object)t), "The mapper returned a null item"));
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.G.b(t2);
            }
        }
        
        @Override
        public void dispose() {
            final c i = this.I;
            this.I = d.G;
            i.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.I.i();
        }
        
        @Override
        public void l(final c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
    }
}
