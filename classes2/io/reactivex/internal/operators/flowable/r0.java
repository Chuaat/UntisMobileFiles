// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.util.k;
import io.reactivex.exceptions.b;
import io.reactivex.q;
import o7.c;
import io.reactivex.l;
import x5.g;

public final class r0<T> extends io.reactivex.internal.operators.flowable.a<T, T>
{
    final g<? super T> I;
    final g<? super Throwable> J;
    final x5.a K;
    final x5.a L;
    
    public r0(final l<T> l, final g<? super T> i, final g<? super Throwable> j, final x5.a k, final x5.a m) {
        super(l);
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = m;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        Object o;
        Object o2;
        if (c instanceof y5.a) {
            o = super.H;
            o2 = new a((y5.a<? super Object>)c, (g<? super Object>)this.I, this.J, this.K, this.L);
        }
        else {
            o = super.H;
            o2 = new b(c, this.I, this.J, this.K, this.L);
        }
        ((l)o).m6((q)o2);
    }
    
    static final class a<T> extends io.reactivex.internal.subscribers.a<T, T>
    {
        final g<? super T> L;
        final g<? super Throwable> M;
        final x5.a N;
        final x5.a O;
        
        a(final y5.a<? super T> a, final g<? super T> l, final g<? super Throwable> m, final x5.a n, final x5.a o) {
            super(a);
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
        }
        
        @Override
        public boolean B(final T t) {
            if (super.J) {
                return false;
            }
            try {
                this.L.accept((Object)t);
                return super.G.B(t);
            }
            finally {
                final Throwable t2;
                this.d(t2);
                return false;
            }
        }
        
        @Override
        public int E(final int n) {
            return this.e(n);
        }
        
        @Override
        public void b(final Throwable t) {
            if (super.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.J = true;
            boolean b = false;
            try {
                this.M.accept(t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                ((c)super.G).b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
                b = false;
            }
            if (b) {
                ((c)super.G).b(t);
            }
            try {
                this.O.run();
            }
            finally {
                io.reactivex.exceptions.b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (super.J) {
                return;
            }
            try {
                this.N.run();
                super.J = true;
                ((c)super.G).f();
                try {
                    this.O.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        public void m(final T t) {
            if (super.J) {
                return;
            }
            if (super.K != 0) {
                ((c)super.G).m((Object)null);
                return;
            }
            try {
                this.L.accept((Object)t);
                ((c)super.G).m((Object)t);
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        @io.reactivex.annotations.g
        public T poll() throws Exception {
            try {
                final T poll = (T)super.I.poll();
                Label_0099: {
                    if (poll != null) {
                        try {
                            this.L.accept((Object)poll);
                            break Label_0099;
                        }
                        finally {
                            try {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                try {
                                    this.M.accept(t);
                                    throw io.reactivex.internal.util.k.d(t);
                                }
                                finally {
                                    final Throwable t2;
                                    throw new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
                                }
                            }
                            finally {
                                this.O.run();
                            }
                        }
                    }
                    if (super.K != 1) {
                        return (T)poll;
                    }
                    this.N.run();
                }
                this.O.run();
                return (T)poll;
            }
            finally {
                final Throwable t3;
                io.reactivex.exceptions.b.b(t3);
                try {
                    this.M.accept(t3);
                    throw io.reactivex.internal.util.k.d(t3);
                }
                finally {
                    final Throwable t4;
                    throw new io.reactivex.exceptions.a(new Throwable[] { t3, t4 });
                }
            }
        }
    }
    
    static final class b<T> extends io.reactivex.internal.subscribers.b<T, T>
    {
        final g<? super T> L;
        final g<? super Throwable> M;
        final x5.a N;
        final x5.a O;
        
        b(final c<? super T> c, final g<? super T> l, final g<? super Throwable> m, final x5.a n, final x5.a o) {
            super(c);
            this.L = l;
            this.M = m;
            this.N = n;
            this.O = o;
        }
        
        public int E(final int n) {
            return this.e(n);
        }
        
        @Override
        public void b(final Throwable t) {
            if (super.J) {
                io.reactivex.plugins.a.Y(t);
                return;
            }
            super.J = true;
            boolean b = false;
            try {
                this.M.accept(t);
            }
            finally {
                final Throwable t2;
                io.reactivex.exceptions.b.b(t2);
                super.G.b((Throwable)new io.reactivex.exceptions.a(new Throwable[] { t, t2 }));
                b = false;
            }
            if (b) {
                super.G.b(t);
            }
            try {
                this.O.run();
            }
            finally {
                io.reactivex.exceptions.b.b(t);
                io.reactivex.plugins.a.Y(t);
            }
        }
        
        @Override
        public void f() {
            if (super.J) {
                return;
            }
            try {
                this.N.run();
                super.J = true;
                super.G.f();
                try {
                    this.O.run();
                }
                finally {
                    final Throwable t;
                    io.reactivex.exceptions.b.b(t);
                    io.reactivex.plugins.a.Y(t);
                }
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        public void m(final T t) {
            if (super.J) {
                return;
            }
            if (super.K != 0) {
                super.G.m((Object)null);
                return;
            }
            try {
                this.L.accept((Object)t);
                super.G.m((Object)t);
            }
            finally {
                final Throwable t2;
                this.d(t2);
            }
        }
        
        @io.reactivex.annotations.g
        public T poll() throws Exception {
            try {
                final T poll = (T)super.I.poll();
                Label_0099: {
                    if (poll != null) {
                        try {
                            this.L.accept((Object)poll);
                            break Label_0099;
                        }
                        finally {
                            try {
                                final Throwable t;
                                io.reactivex.exceptions.b.b(t);
                                try {
                                    this.M.accept(t);
                                    throw io.reactivex.internal.util.k.d(t);
                                }
                                finally {
                                    final Throwable t2;
                                    throw new io.reactivex.exceptions.a(new Throwable[] { t, t2 });
                                }
                            }
                            finally {
                                this.O.run();
                            }
                        }
                    }
                    if (super.K != 1) {
                        return (T)poll;
                    }
                    this.N.run();
                }
                this.O.run();
                return (T)poll;
            }
            finally {
                final Throwable t3;
                io.reactivex.exceptions.b.b(t3);
                try {
                    this.M.accept(t3);
                    throw io.reactivex.internal.util.k.d(t3);
                }
                finally {
                    final Throwable t4;
                    throw new io.reactivex.exceptions.a(new Throwable[] { t3, t4 });
                }
            }
        }
    }
}
