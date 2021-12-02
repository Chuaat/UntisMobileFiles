// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.annotations.g;
import io.reactivex.exceptions.b;
import io.reactivex.disposables.c;
import java.util.Iterator;
import io.reactivex.internal.disposables.e;
import io.reactivex.i0;
import io.reactivex.b0;

public final class f1<T> extends b0<T>
{
    final Iterable<? extends T> G;
    
    public f1(final Iterable<? extends T> g) {
        this.G = g;
    }
    
    public void L5(final i0<? super T> i0) {
        try {
            final Iterator<? extends T> iterator = this.G.iterator();
            if (!iterator.hasNext()) {
                e.f(i0);
                return;
            }
            final a a = new a(i0, iterator);
            i0.l(a);
            if (!a.J) {
                a.a();
            }
        }
        finally {
            final Throwable t;
            b.b(t);
            e.l(t, i0);
        }
    }
    
    static final class a<T> extends c<T>
    {
        final i0<? super T> G;
        final Iterator<? extends T> H;
        volatile boolean I;
        boolean J;
        boolean K;
        boolean L;
        
        a(final i0<? super T> g, final Iterator<? extends T> h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public int E(final int n) {
            if ((n & 0x1) != 0x0) {
                this.J = true;
                return 1;
            }
            return 0;
        }
        
        void a() {
            while (!this.i()) {
                try {
                    this.G.m((Object)io.reactivex.internal.functions.b.g((Object)this.H.next(), "The iterator returned a null value"));
                    if (this.i()) {
                        return;
                    }
                    if (!this.H.hasNext()) {
                        if (!this.i()) {
                            this.G.f();
                        }
                        return;
                    }
                    continue;
                }
                finally {
                    final Throwable t;
                    b.b(t);
                    this.G.b(t);
                }
            }
        }
        
        @Override
        public void clear() {
            this.K = true;
        }
        
        @Override
        public void dispose() {
            this.I = true;
        }
        
        @Override
        public boolean i() {
            return this.I;
        }
        
        @Override
        public boolean isEmpty() {
            return this.K;
        }
        
        @g
        @Override
        public T poll() {
            if (this.K) {
                return null;
            }
            if (this.L) {
                if (!this.H.hasNext()) {
                    this.K = true;
                    return null;
                }
            }
            else {
                this.L = true;
            }
            return io.reactivex.internal.functions.b.g((T)this.H.next(), "The iterator returned a null value");
        }
    }
}
