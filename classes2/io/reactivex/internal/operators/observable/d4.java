// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.exceptions.a;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.i0;
import x5.g;
import io.reactivex.g0;
import x5.o;
import java.util.concurrent.Callable;
import io.reactivex.b0;

public final class d4<T, D> extends b0<T>
{
    final Callable<? extends D> G;
    final o<? super D, ? extends g0<? extends T>> H;
    final g<? super D> I;
    final boolean J;
    
    public d4(final Callable<? extends D> g, final o<? super D, ? extends g0<? extends T>> h, final g<? super D> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    public void L5(final i0<? super T> i0) {
        try {
            final D call = (D)this.G.call();
            try {
                b.g((g0)this.H.apply((Object)call), "The sourceSupplier returned a null ObservableSource").c(new a((i0<? super Object>)i0, call, (g<? super Object>)this.I, this.J));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                try {
                    this.I.accept((Object)call);
                    e.l(t, i0);
                }
                finally {
                    final Throwable t2;
                    io.reactivex.exceptions.b.b(t2);
                    e.l(new io.reactivex.exceptions.a(new Throwable[] { t, t2 }), i0);
                }
            }
        }
        finally {
            final Throwable t3;
            io.reactivex.exceptions.b.b(t3);
            e.l(t3, i0);
        }
    }
    
    static final class a<T, D> extends AtomicBoolean implements i0<T>, c
    {
        private static final long L = 5904473792286235046L;
        final i0<? super T> G;
        final D H;
        final g<? super D> I;
        final boolean J;
        c K;
        
        a(final i0<? super T> g, final D h, final g<? super D> i, final boolean j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
        }
        
        void a() {
            if (this.compareAndSet(false, true)) {
                try {
                    this.I.accept((Object)this.H);
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.J) {
                Throwable t2 = t;
                if (this.compareAndSet(false, true)) {
                    try {
                        this.I.accept((Object)this.H);
                    }
                    finally {
                        final Throwable t3;
                        io.reactivex.exceptions.b.b(t3);
                        t2 = new io.reactivex.exceptions.a(new Throwable[] { t, t3 });
                    }
                }
                this.K.dispose();
                this.G.b(t2);
            }
            else {
                this.G.b(t);
                this.K.dispose();
                this.a();
            }
        }
        
        @Override
        public void dispose() {
            this.a();
            this.K.dispose();
        }
        
        @Override
        public void f() {
            if (this.J) {
                if (this.compareAndSet(false, true)) {
                    try {
                        this.I.accept((Object)this.H);
                    }
                    finally {
                        final Throwable t;
                        io.reactivex.exceptions.b.b(t);
                        this.G.b(t);
                        return;
                    }
                }
                this.K.dispose();
                this.G.f();
            }
            else {
                this.G.f();
                this.K.dispose();
                this.a();
            }
        }
        
        @Override
        public boolean i() {
            return this.get();
        }
        
        @Override
        public void l(final c k) {
            if (d.l(this.K, k)) {
                this.K = k;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
    }
}
