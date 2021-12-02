// 
// Decompiled by Procyon v0.5.36
// 

package rx.internal.operators;

import rx.functions.a;
import rx.o;
import rx.n;
import rx.j;
import java.util.concurrent.TimeUnit;
import rx.g;

public final class s3<T> implements b<T, T>
{
    final long G;
    final TimeUnit H;
    final j I;
    
    public s3(final long g, final TimeUnit h, final j i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    public n<? super T> a(final n<? super T> n) {
        final j.a a = this.I.a();
        n.r(a);
        final a a2 = new a<Object>(new rx.observers.g<Object>(n));
        a.d(a2, this.G, this.H);
        return (n<? super T>)a2;
    }
    
    static final class a<T> extends n<T> implements rx.functions.a
    {
        final n<? super T> L;
        
        public a(final n<? super T> l) {
            super(l);
            this.L = l;
        }
        
        @Override
        public void b(final Throwable t) {
            this.L.b(t);
            this.i();
        }
        
        @Override
        public void c() {
            this.L.c();
            this.i();
        }
        
        @Override
        public void call() {
            this.c();
        }
        
        @Override
        public void m(final T t) {
            this.L.m((Object)t);
        }
    }
}
