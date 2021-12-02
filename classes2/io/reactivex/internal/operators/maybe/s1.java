// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.maybe;

import io.reactivex.internal.disposables.d;
import io.reactivex.disposables.c;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.internal.disposables.e;
import io.reactivex.exceptions.a;
import io.reactivex.internal.functions.b;
import io.reactivex.v;
import x5.g;
import io.reactivex.y;
import x5.o;
import java.util.concurrent.Callable;
import io.reactivex.s;

public final class s1<T, D> extends s<T>
{
    final Callable<? extends D> G;
    final o<? super D, ? extends y<? extends T>> H;
    final g<? super D> I;
    final boolean J;
    
    public s1(final Callable<? extends D> g, final o<? super D, ? extends y<? extends T>> h, final g<? super D> i, final boolean j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void u1(final v<? super T> v) {
        try {
            final D call = (D)this.G.call();
            try {
                b.g((y)this.H.apply((Object)call), "The sourceSupplier returned a null MaybeSource").c(new a(v, call, (g<? super Object>)this.I, this.J));
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
                        e.j(new io.reactivex.exceptions.a(new Throwable[] { t, (Throwable)call }), v);
                        return;
                    }
                }
                e.j(t, v);
                if (!this.J) {
                    try {
                        this.I.accept((Object)call);
                    }
                    finally {
                        io.reactivex.exceptions.b.b((Throwable)v);
                        io.reactivex.plugins.a.Y((Throwable)v);
                    }
                }
            }
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            e.j(t2, v);
        }
    }
    
    static final class a<T, D> extends AtomicReference<Object> implements v<T>, c
    {
        private static final long K = -674404550052917487L;
        final v<? super T> G;
        final g<? super D> H;
        final boolean I;
        c J;
        
        a(final v<? super T> g, final D initialValue, final g<? super D> h, final boolean i) {
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
        public void l(final c j) {
            if (d.l(this.J, j)) {
                this.J = j;
                this.G.l(this);
            }
        }
    }
}
