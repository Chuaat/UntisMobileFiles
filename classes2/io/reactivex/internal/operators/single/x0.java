// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.single;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.n0;
import x5.g;
import io.reactivex.q0;
import x5.o;
import java.util.concurrent.Callable;
import io.reactivex.k0;

public final class x0<T, U> extends k0<T>
{
    final Callable<U> G;
    final o<? super U, ? extends q0<? extends T>> H;
    final g<? super U> I;
    final boolean J;
    
    public x0(final Callable<U> g, final o<? super U, ? extends q0<? extends T>> h, final g<? super U> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void e1(final n0<? super T> n0) {
        try {
            final U call = this.G.call();
            try {
                b.g((q0)this.H.apply((Object)call), "The singleFunction returned a null SingleSource").c(new a(n0, call, this.J, (g<? super Object>)this.I));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                Throwable t2 = t;
                if (this.J) {
                    try {
                        this.I.accept((Object)call);
                    }
                    finally {
                        final Throwable t3;
                        io.reactivex.exceptions.b.b(t3);
                        t2 = new io.reactivex.exceptions.a(new Throwable[] { t, t3 });
                    }
                }
                e.m(t2, n0);
                if (!this.J) {
                    try {
                        this.I.accept((Object)call);
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)n0);
                        io.reactivex.plugins.a.Y((Throwable)n0);
                    }
                }
            }
        }
        finally {
            final Throwable t4;
            io.reactivex.exceptions.b.b(t4);
            e.m(t4, n0);
        }
    }
    
    static final class a<T, U> extends AtomicReference<Object> implements n0<T>, c
    {
        private static final long K = -5331524057054083935L;
        final n0<? super T> G;
        final g<? super U> H;
        final boolean I;
        c J;
        
        a(final n0<? super T> g, final U initialValue, final boolean i, final g<? super U> h) {
            super(initialValue);
            this.G = g;
            this.I = i;
            this.H = h;
        }
        
        void a() {
            final a andSet = this.getAndSet(this);
            if (andSet != this) {
                try {
                    this.H.accept((Object)andSet);
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
            this.J = d.G;
            Throwable t2 = t;
            if (this.I) {
                final a andSet = this.getAndSet(this);
                if (andSet == this) {
                    return;
                }
                try {
                    this.H.accept((Object)andSet);
                }
                finally {
                    final Throwable t3;
                    io.reactivex.exceptions.b.b(t3);
                    t2 = new io.reactivex.exceptions.a(new Throwable[] { t, t3 });
                }
            }
            this.G.b(t2);
            if (!this.I) {
                this.a();
            }
        }
        
        @Override
        public void d(final T t) {
            this.J = d.G;
            Label_0054: {
                if (this.I) {
                    final a andSet = this.getAndSet(this);
                    if (andSet != this) {
                        try {
                            this.H.accept((Object)andSet);
                            break Label_0054;
                        }
                        finally {
                            io.reactivex.exceptions.b.b((Throwable)t);
                            this.G.b((Throwable)t);
                        }
                    }
                    return;
                }
            }
            this.G.d((Object)t);
            if (!this.I) {
                this.a();
            }
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
            this.J = d.G;
            this.a();
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
    }
}
