// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import io.reactivex.internal.disposables.d;
import io.reactivex.plugins.a;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import java.util.Iterator;
import io.reactivex.i0;
import x5.c;
import io.reactivex.b0;

public final class m4<T, U, V> extends b0<V>
{
    final b0<? extends T> G;
    final Iterable<U> H;
    final c<? super T, ? super U, ? extends V> I;
    
    public m4(final b0<? extends T> g, final Iterable<U> h, final c<? super T, ? super U, ? extends V> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public void L5(final i0<? super V> i0) {
        try {
            final Iterator<U> iterator = b.g(this.H.iterator(), "The iterator returned by other is null");
            try {
                if (!iterator.hasNext()) {
                    e.f(i0);
                    return;
                }
                this.G.c(new a<Object, Object, Object>((i0<? super Object>)i0, (Iterator<Object>)iterator, (c<? super Object, ? super Object, ?>)this.I));
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                e.l(t, i0);
            }
        }
        finally {
            final Throwable t2;
            io.reactivex.exceptions.b.b(t2);
            e.l(t2, i0);
        }
    }
    
    static final class a<T, U, V> implements i0<T>, c
    {
        final i0<? super V> G;
        final Iterator<U> H;
        final x5.c<? super T, ? super U, ? extends V> I;
        c J;
        boolean K;
        
        a(final i0<? super V> g, final Iterator<U> h, final x5.c<? super T, ? super U, ? extends V> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        void a(final Throwable t) {
            this.K = true;
            this.J.dispose();
            this.G.b(t);
        }
        
        @Override
        public void b(final Throwable t) {
            if (this.K) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            this.K = true;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.J.dispose();
        }
        
        @Override
        public void f() {
            if (this.K) {
                return;
            }
            this.K = true;
            this.G.f();
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
        
        @Override
        public void m(final T t) {
            if (this.K) {
                return;
            }
            try {
                this.G.m((Object)b.g((Object)this.I.b((Object)t, (Object)b.g(this.H.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                if (!this.H.hasNext()) {
                    this.K = true;
                    this.J.dispose();
                    this.G.f();
                }
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                this.a(t2);
            }
        }
    }
}
