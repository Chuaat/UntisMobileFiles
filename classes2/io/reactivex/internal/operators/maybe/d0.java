// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.annotations.g;
import io.reactivex.exceptions.b;
import io.reactivex.internal.disposables.d;
import java.util.Iterator;
import io.reactivex.internal.observers.c;
import io.reactivex.v;
import io.reactivex.i0;
import x5.o;
import io.reactivex.y;
import io.reactivex.b0;

public final class d0<T, R> extends b0<R>
{
    final y<T> G;
    final o<? super T, ? extends Iterable<? extends R>> H;
    
    public d0(final y<T> g, final o<? super T, ? extends Iterable<? extends R>> h) {
        this.G = g;
        this.H = h;
    }
    
    @Override
    protected void L5(final i0<? super R> i0) {
        this.G.c(new a<Object, Object>(i0, this.H));
    }
    
    static final class a<T, R> extends c<R> implements v<T>
    {
        final i0<? super R> G;
        final x5.o<? super T, ? extends Iterable<? extends R>> H;
        io.reactivex.disposables.c I;
        volatile Iterator<? extends R> J;
        volatile boolean K;
        boolean L;
        
        a(final i0<? super R> g, final x5.o<? super T, ? extends Iterable<? extends R>> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x2) != 0x0) {
                this.L = true;
                return 2;
            }
            return 0;
        }
        
        @Override
        public void b(final Throwable t) {
            this.I = d.G;
            this.G.b(t);
        }
        
        @Override
        public void clear() {
            this.J = null;
        }
        
        @Override
        public void d(final T t) {
            final i0<? super R> g = this.G;
            try {
                final Iterator<? extends R> iterator = (Iterator<? extends R>)((Iterable)this.H.apply((Object)t)).iterator();
                if (!iterator.hasNext()) {
                    g.f();
                    return;
                }
                this.J = iterator;
                if (this.L) {
                    g.m((Object)null);
                    g.f();
                    return;
                }
                while (!this.K) {
                    try {
                        g.m((Object)iterator.next());
                        if (this.K) {
                            return;
                        }
                        try {
                            if (!iterator.hasNext()) {
                                g.f();
                                return;
                            }
                            continue;
                        }
                        finally {
                            final Throwable t2;
                            b.b(t2);
                            g.b(t2);
                        }
                    }
                    finally {
                        final Throwable t3;
                        b.b(t3);
                        g.b(t3);
                    }
                }
            }
            finally {
                final Throwable t4;
                b.b(t4);
                g.b(t4);
            }
        }
        
        @Override
        public void dispose() {
            this.K = true;
            this.I.dispose();
            this.I = d.G;
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.K;
        }
        
        @Override
        public boolean isEmpty() {
            return this.J == null;
        }
        
        @Override
        public void l(final io.reactivex.disposables.c i) {
            if (d.l(this.I, i)) {
                this.I = i;
                this.G.l(this);
            }
        }
        
        @g
        @Override
        public R poll() throws Exception {
            final Iterator<? extends R> j = this.J;
            if (j != null) {
                final R g = io.reactivex.internal.functions.b.g((R)j.next(), "The iterator returned a null value");
                if (!j.hasNext()) {
                    this.J = null;
                }
                return g;
            }
            return null;
        }
    }
}
