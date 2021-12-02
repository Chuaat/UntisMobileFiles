// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import io.reactivex.internal.subscriptions.j;
import io.reactivex.internal.disposables.e;
import java.util.concurrent.atomic.AtomicReference;
import o7.d;
import o7.c;
import java.util.concurrent.TimeUnit;
import io.reactivex.j0;
import io.reactivex.l;

public final class n4 extends l<Long>
{
    final j0 H;
    final long I;
    final TimeUnit J;
    
    public n4(final long i, final TimeUnit j, final j0 h) {
        this.I = i;
        this.J = j;
        this.H = h;
    }
    
    public void n6(final c<? super Long> c) {
        final a a = new a(c);
        c.z((d)a);
        a.a(this.H.f(a, this.I, this.J));
    }
    
    static final class a extends AtomicReference<io.reactivex.disposables.c> implements d, Runnable
    {
        private static final long I = -2809475196591179431L;
        final c<? super Long> G;
        volatile boolean H;
        
        a(final c<? super Long> g) {
            this.G = g;
        }
        
        public void a(final io.reactivex.disposables.c c) {
            io.reactivex.internal.disposables.d.k(this, c);
        }
        
        public void cancel() {
            io.reactivex.internal.disposables.d.b(this);
        }
        
        public void run() {
            if (this.get() != io.reactivex.internal.disposables.d.G) {
                if (this.H) {
                    this.G.m((Object)0L);
                    ((AtomicReference<e>)this).lazySet(e.G);
                    this.G.f();
                }
                else {
                    ((AtomicReference<e>)this).lazySet(e.G);
                    this.G.b((Throwable)new io.reactivex.exceptions.c("Can't deliver value due to lack of requests"));
                }
            }
        }
        
        public void v(final long n) {
            if (j.m(n)) {
                this.H = true;
            }
        }
    }
}
