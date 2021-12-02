// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.util;

import rx.functions.a;
import rx.internal.schedulers.b;
import rx.j;
import rx.o;
import rx.m;
import rx.k;

public final class p<T> extends k<T>
{
    final T b;
    
    protected p(final T b) {
        super((t)new t<T>() {
            public void a(final m<? super T> m) {
                m.e((Object)b);
            }
        });
        this.b = b;
    }
    
    public static <T> p<T> P0(final T t) {
        return new p<T>(t);
    }
    
    public T Q0() {
        return this.b;
    }
    
    public <R> k<R> R0(final rx.functions.p<? super T, ? extends k<? extends R>> p) {
        return k.n((t<R>)new t<R>() {
            public void a(final m<? super R> m) {
                final k k = p.h(p.this.b);
                if (k instanceof p) {
                    m.e(((p)k).b);
                }
                else {
                    final m<R> i = new m<R>() {
                        @Override
                        public void b(final Throwable t) {
                            m.b(t);
                        }
                        
                        @Override
                        public void e(final R r) {
                            m.e(r);
                        }
                    };
                    m.d(i);
                    k.j0((m<? super Object>)i);
                }
            }
        });
    }
    
    public k<T> S0(final j j) {
        Object o;
        if (j instanceof b) {
            o = new c((b)j, this.b);
        }
        else {
            o = new d(j, this.b);
        }
        return k.n((t<T>)o);
    }
    
    static final class c<T> implements t<T>
    {
        private final rx.internal.schedulers.b G;
        private final T H;
        
        c(final rx.internal.schedulers.b g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        public void a(final m<? super T> m) {
            m.d(this.G.d(new e<Object>(m, this.H)));
        }
    }
    
    static final class d<T> implements t<T>
    {
        private final j G;
        private final T H;
        
        d(final j g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        public void a(final m<? super T> m) {
            final j.a a = this.G.a();
            m.d(a);
            a.c(new e<Object>(m, this.H));
        }
    }
    
    static final class e<T> implements a
    {
        private final m<? super T> G;
        private final T H;
        
        e(final m<? super T> g, final T h) {
            this.G = g;
            this.H = h;
        }
        
        @Override
        public void call() {
            try {
                this.G.e((Object)this.H);
            }
            finally {
                final Throwable t;
                this.G.b(t);
            }
        }
    }
}
