// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import o7.d;
import io.reactivex.q;
import io.reactivex.internal.subscriptions.g;
import io.reactivex.internal.functions.b;
import java.util.Iterator;
import io.reactivex.l;
import x5.c;

public final class a5<T, U, V> extends io.reactivex.internal.operators.flowable.a<T, V>
{
    final Iterable<U> I;
    final c<? super T, ? super U, ? extends V> J;
    
    public a5(final l<T> l, final Iterable<U> i, final c<? super T, ? super U, ? extends V> j) {
        super(l);
        this.I = i;
        this.J = j;
    }
    
    public void n6(final o7.c<? super V> c) {
        try {
            final Iterator<U> iterator = b.g(this.I.iterator(), "The iterator returned by other is null");
            try {
                if (!iterator.hasNext()) {
                    g.b(c);
                    return;
                }
                super.H.m6(new a<Object, Object, Object>((o7.c<? super Object>)c, (Iterator<Object>)iterator, (c<? super Object, ? super Object, ?>)this.J));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                g.d(t, c);
            }
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            g.d(t2, c);
        }
    }
    
    static final class a<T, U, V> implements q<T>, d
    {
        final o7.c<? super V> G;
        final Iterator<U> H;
        final c<? super T, ? super U, ? extends V> I;
        d J;
        boolean K;
        
        a(final o7.c<? super V> g, final Iterator<U> h, final c<? super T, ? super U, ? extends V> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        void a(final Throwable t) {
            io.reactivex.exceptions.b.b(t);
            this.K = true;
            this.J.cancel();
            this.G.b(t);
        }
        
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        public void cancel() {
            this.J.cancel();
        }
        
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.G.f();
        }
        
        public void m(final T t) {
            if (this.K) {
                return;
            }
            try {
                final U g = b.g(this.H.next(), "The iterator returned a null value");
                try {
                    this.G.m(b.g((Object)this.I.b((Object)t, (Object)g), "The zipper function returned a null value"));
                    try {
                        if (!this.H.hasNext()) {
                            this.K = true;
                            this.J.cancel();
                            this.G.f();
                        }
                    }
                    finally {
                        final Throwable t2;
                        this.a(t2);
                    }
                }
                finally {
                    final Throwable t3;
                    this.a(t3);
                }
            }
            finally {
                final Throwable t4;
                this.a(t4);
            }
        }
        
        public void v(final long n) {
            this.J.v(n);
        }
        
        @Override
        public void z(final d j) {
            if (j.o(this.J, j)) {
                this.J = j;
                this.G.z((d)this);
            }
        }
    }
}
