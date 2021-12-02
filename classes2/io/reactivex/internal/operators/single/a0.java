// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.annotations.g;
import io.reactivex.internal.disposables.d;
import java.util.Iterator;
import io.reactivex.disposables.c;
import io.reactivex.internal.observers.b;
import io.reactivex.n0;
import io.reactivex.i0;
import x5.o;
import io.reactivex.q0;
import io.reactivex.b0;

public final class a0<T, R> extends b0<R>
{
    final q0<T> G;
    final o<? super T, ? extends Iterable<? extends R>> H;
    
    public a0(final q0<T> g, final o<? super T, ? extends Iterable<? extends R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        this.G.c(new a<Object, Object>(i0, this.H));
    }
    
    static final class a<T, R> extends b<R> implements n0<T>
    {
        private static final long N = -8938804753851907758L;
        final i0<? super R> H;
        final x5.o<? super T, ? extends Iterable<? extends R>> I;
        c J;
        volatile Iterator<? extends R> K;
        volatile boolean L;
        boolean M;
        
        a(final i0<? super R> h, final x5.o<? super T, ? extends Iterable<? extends R>> i) {
            this.H = h;
            this.I = i;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.M = true;
                return 2;
            }
            return 0;
        }
        
        @Override
        public void b(final Throwable t) {
            this.J = d.G;
            this.H.b(t);
        }
        
        @Override
        public void clear() {
            this.K = null;
        }
        
        @Override
        public void d(final T t) {
            i0<? super R> i0 = this.H;
            while (true) {
                try {
                    final Iterator iterator = ((Iterable)this.I.apply((Object)t)).iterator();
                    if (!iterator.hasNext()) {
                        i0.f();
                        return;
                    }
                    if (this.M) {
                        this.K = (Iterator<? extends R>)iterator;
                        i0.m((Object)null);
                        i0.f();
                        return;
                    }
                    while (!this.L) {
                        try {
                            i0.m((Object)iterator.next());
                            if (this.L) {
                                return;
                            }
                            if (!iterator.hasNext()) {
                                i0.f();
                                return;
                            }
                            continue;
                        }
                        finally {
                            io.reactivex.exceptions.b.b((Throwable)iterator);
                        }
                        i0.b((Throwable)iterator);
                    }
                }
                finally {
                    final Iterator iterator;
                    io.reactivex.exceptions.b.b((Throwable)iterator);
                    i0 = this.H;
                    continue;
                }
                break;
            }
        }
        
        @Override
        public void dispose() {
            this.L = true;
            this.J.dispose();
            this.J = d.G;
        }
        
        @Override
        public boolean i() {
            return this.L;
        }
        
        @Override
        public boolean isEmpty() {
            return this.K == null;
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.H.l(this);
            }
        }
        
        @g
        @Override
        public R poll() throws Exception {
            final Iterator<? extends R> k = this.K;
            if (k != null) {
                final R g = io.reactivex.internal.functions.b.g((R)k.next(), "The iterator returned a null value");
                if (!k.hasNext()) {
                    this.K = null;
                }
                return g;
            }
            return null;
        }
    }
}
