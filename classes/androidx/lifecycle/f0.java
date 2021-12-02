// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;
import androidx.arch.core.executor.a;
import androidx.annotation.k0;
import o7.d;
import o7.c;
import androidx.annotation.j0;
import o7.b;

public final class f0
{
    private f0() {
    }
    
    @j0
    public static <T> LiveData<T> a(@j0 final o7.b<T> b) {
        return new b<T>(b);
    }
    
    @j0
    public static <T> o7.b<T> b(@j0 final y y, @j0 final LiveData<T> liveData) {
        return (o7.b<T>)new a(y, (LiveData<Object>)liveData);
    }
    
    private static final class a<T> implements o7.b<T>
    {
        final y G;
        final LiveData<T> H;
        
        a(final y g, final LiveData<T> h) {
            this.G = g;
            this.H = h;
        }
        
        public void e(final c<? super T> c) {
            c.z((d)new f0.a.a((o7.c<? super Object>)c, this.G, (LiveData<Object>)this.H));
        }
        
        static final class a<T> implements d, l0<T>
        {
            final c<? super T> G;
            final y H;
            final LiveData<T> I;
            volatile boolean J;
            boolean K;
            long L;
            @k0
            T M;
            
            a(final c<? super T> g, final y h, final LiveData<T> i) {
                this.G = g;
                this.H = h;
                this.I = i;
            }
            
            public void a(@k0 final T m) {
                if (this.J) {
                    return;
                }
                if (this.L > 0L) {
                    this.M = null;
                    this.G.m((Object)m);
                    final long l = this.L;
                    if (l != Long.MAX_VALUE) {
                        this.L = l - 1L;
                    }
                }
                else {
                    this.M = m;
                }
            }
            
            public void cancel() {
                if (this.J) {
                    return;
                }
                this.J = true;
                androidx.arch.core.executor.a.f().b(new Runnable() {
                    @Override
                    public void run() {
                        final a g = a.this;
                        if (g.K) {
                            g.I.o(g);
                            a.this.K = false;
                        }
                        a.this.M = null;
                    }
                });
            }
            
            public void v(final long n) {
                if (this.J) {
                    return;
                }
                androidx.arch.core.executor.a.f().b(new Runnable() {
                    @Override
                    public void run() {
                        if (a.this.J) {
                            return;
                        }
                        final long g = n;
                        if (g <= 0L) {
                            a.this.J = true;
                            final a h = a.this;
                            if (h.K) {
                                h.I.o(h);
                                a.this.K = false;
                            }
                            final a h2 = a.this;
                            h2.M = null;
                            h2.G.b((Throwable)new IllegalArgumentException("Non-positive request"));
                            return;
                        }
                        final a h3 = a.this;
                        final long l = h3.L;
                        long i;
                        if (l + g >= l) {
                            i = l + g;
                        }
                        else {
                            i = Long.MAX_VALUE;
                        }
                        h3.L = i;
                        if (!h3.K) {
                            h3.K = true;
                            h3.I.j(h3.H, h3);
                        }
                        else {
                            final T m = h3.M;
                            if (m != null) {
                                h3.a(m);
                                a.this.M = null;
                            }
                        }
                    }
                });
            }
        }
    }
    
    private static class b<T> extends LiveData<T>
    {
        private final o7.b<T> m;
        final AtomicReference<a> n;
        
        b(@j0 final o7.b<T> m) {
            this.m = m;
            this.n = new AtomicReference<a>();
        }
        
        @Override
        protected void l() {
            super.l();
            final a newValue = new a();
            this.n.set(newValue);
            this.m.e((o7.c)newValue);
        }
        
        @Override
        protected void m() {
            super.m();
            final a a = this.n.getAndSet(null);
            if (a != null) {
                a.a();
            }
        }
        
        final class a extends AtomicReference<d> implements o7.c<T>
        {
            public void a() {
                final d d = this.get();
                if (d != null) {
                    d.cancel();
                }
            }
            
            public void b(final Throwable t) {
                b.this.n.compareAndSet(this, null);
                androidx.arch.core.executor.a.f().b(new Runnable() {
                    @Override
                    public void run() {
                        throw new RuntimeException("LiveData does not handle errors. Errors from publishers should be handled upstream and propagated as state", t);
                    }
                });
            }
            
            public void f() {
                b.this.n.compareAndSet(this, null);
            }
            
            public void m(final T t) {
                b.this.n(t);
            }
            
            public void z(final d newValue) {
                if (this.compareAndSet(null, newValue)) {
                    newValue.v(Long.MAX_VALUE);
                }
                else {
                    newValue.cancel();
                }
            }
        }
    }
}
