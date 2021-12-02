// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.completable;

import io.reactivex.internal.disposables.d;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.f;
import x5.g;
import io.reactivex.i;
import x5.o;
import java.util.concurrent.Callable;
import io.reactivex.c;

public final class r0<R> extends c
{
    final Callable<R> G;
    final o<? super R, ? extends i> H;
    final g<? super R> I;
    final boolean J;
    
    public r0(final Callable<R> g, final o<? super R, ? extends i> h, final g<? super R> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L0(final f f) {
        try {
            final R call = this.G.call();
            try {
                b.g((i)this.H.apply((Object)call), "The completableFunction returned a null CompletableSource").c(new a<Object>(f, call, (g<? super Object>)this.I, this.J));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                if (this.J) {
                    try {
                        this.I.accept((Object)call);
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)call);
                        e.g(new io.reactivex.exceptions.a(new Throwable[] { t, (Throwable)call }), f);
                        return;
                    }
                }
                e.g(t, f);
                if (!this.J) {
                    try {
                        this.I.accept((Object)call);
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)f);
                        io.reactivex.plugins.a.Y((Throwable)f);
                    }
                }
            }
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            e.g(t2, f);
        }
    }
    
    static final class a<R> extends AtomicReference<Object> implements f, io.reactivex.disposables.c
    {
        private static final long K = -674404550052917487L;
        final f G;
        final g<? super R> H;
        final boolean I;
        io.reactivex.disposables.c J;
        
        a(final f g, final R initialValue, final g<? super R> h, final boolean i) {
            super(initialValue);
            this.G = g;
            this.H = h;
            this.I = i;
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
        public void dispose() {
            this.J.dispose();
            this.J = d.G;
            this.a();
        }
        
        @Override
        public void f() {
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
                            final Throwable t;
                            io.reactivex.exceptions.b.b(t);
                            this.G.b(t);
                        }
                    }
                    return;
                }
            }
            this.G.f();
            if (!this.I) {
                this.a();
            }
        }
        
        @Override
        public boolean i() {
            return this.J.i();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
    }
}
