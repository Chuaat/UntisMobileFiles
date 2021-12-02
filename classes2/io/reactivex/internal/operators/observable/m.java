// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.observable;

import java.util.Iterator;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.internal.disposables.d;
import io.reactivex.internal.disposables.e;
import io.reactivex.internal.functions.b;
import io.reactivex.disposables.c;
import io.reactivex.i0;
import io.reactivex.g0;
import java.util.concurrent.Callable;
import java.util.Collection;

public final class m<T, U extends Collection<? super T>> extends io.reactivex.internal.operators.observable.a<T, U>
{
    final int H;
    final int I;
    final Callable<U> J;
    
    public m(final g0<T> g0, final int h, final int i, final Callable<U> j) {
        super(g0);
        this.H = h;
        this.I = i;
        this.J = j;
    }
    
    @Override
    protected void L5(final i0<? super U> i0) {
        final int j = this.I;
        final int h = this.H;
        if (j == h) {
            final a a = new a<Object, Object>((i0<? super Collection>)i0, h, (Callable<Collection>)this.J);
            if (a.a()) {
                super.G.c(a);
            }
        }
        else {
            super.G.c(new b<Object, Object>((i0<? super Collection>)i0, this.H, this.I, (Callable<Collection>)this.J));
        }
    }
    
    static final class a<T, U extends Collection<? super T>> implements i0<T>, c
    {
        final i0<? super U> G;
        final int H;
        final Callable<U> I;
        U J;
        int K;
        c L;
        
        a(final i0<? super U> g, final int h, final Callable<U> i) {
            this.G = g;
            this.H = h;
            this.I = i;
        }
        
        boolean a() {
            try {
                this.J = io.reactivex.internal.functions.b.g(this.I.call(), "Empty buffer supplied");
                return true;
            }
            finally {
                final Throwable t;
                io.reactivex.exceptions.b.b(t);
                this.J = null;
                final c l = this.L;
                if (l == null) {
                    e.l(t, this.G);
                }
                else {
                    l.dispose();
                    this.G.b(t);
                }
                return false;
            }
        }
        
        @Override
        public void b(final Throwable t) {
            this.J = null;
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.L.dispose();
        }
        
        @Override
        public void f() {
            final Collection<? super T> j = this.J;
            if (j != null) {
                this.J = null;
                if (!j.isEmpty()) {
                    this.G.m((Object)j);
                }
                this.G.f();
            }
        }
        
        @Override
        public boolean i() {
            return this.L.i();
        }
        
        @Override
        public void l(final c l) {
            if (d.l(this.L, l)) {
                this.L = l;
                this.G.l(this);
            }
        }
        
        @Override
        public void m(final T t) {
            final Collection<? super T> j = this.J;
            if (j != null) {
                j.add(t);
                if (++this.K >= this.H) {
                    this.G.m((Object)j);
                    this.K = 0;
                    this.a();
                }
            }
        }
    }
    
    static final class b<T, U extends Collection<? super T>> extends AtomicBoolean implements i0<T>, c
    {
        private static final long N = -8223395059921494546L;
        final i0<? super U> G;
        final int H;
        final int I;
        final Callable<U> J;
        c K;
        final ArrayDeque<U> L;
        long M;
        
        b(final i0<? super U> g, final int h, final int i, final Callable<U> j) {
            this.G = g;
            this.H = h;
            this.I = i;
            this.J = j;
            this.L = new ArrayDeque<U>();
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.clear();
            this.G.b(t);
        }
        
        @Override
        public void dispose() {
            this.K.dispose();
        }
        
        @Override
        public void f() {
            while (!this.L.isEmpty()) {
                this.G.m((Object)this.L.poll());
            }
            this.G.f();
        }
        
        @Override
        public boolean i() {
            return this.K.i();
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
            final long m = this.M;
            this.M = 1L + m;
            if (m % this.I == 0L) {
                try {
                    this.L.offer(io.reactivex.internal.functions.b.g(this.J.call(), "The bufferSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."));
                }
                finally {
                    this.L.clear();
                    this.K.dispose();
                    this.G.b((Throwable)t);
                    return;
                }
            }
            final Iterator<U> iterator = this.L.iterator();
            while (iterator.hasNext()) {
                final Collection<? super T> collection = iterator.next();
                collection.add(t);
                if (this.H <= collection.size()) {
                    iterator.remove();
                    this.G.m((Object)collection);
                }
            }
        }
    }
}
