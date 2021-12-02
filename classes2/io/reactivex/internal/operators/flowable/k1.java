// 
// Decompiled by Procyon v0.5.36
// 

package io.reactivex.internal.operators.flowable;

import o7.d;
import io.reactivex.i0;
import o7.c;
import io.reactivex.b0;
import io.reactivex.l;

public final class k1<T> extends l<T>
{
    private final b0<T> H;
    
    public k1(final b0<T> h) {
        this.H = h;
    }
    
    @Override
    protected void n6(final c<? super T> c) {
        this.H.c(new a<Object>(c));
    }
    
    static final class a<T> implements i0<T>, d
    {
        final c<? super T> G;
        io.reactivex.disposables.c H;
        
        a(final c<? super T> g) {
            this.G = g;
        }
        
        @Override
        public void b(final Throwable t) {
            this.G.b(t);
        }
        
        public void cancel() {
            this.H.dispose();
        }
        
        @Override
        public void f() {
            this.G.f();
        }
        
        @Override
        public void l(final io.reactivex.disposables.c h) {
            this.H = h;
            this.G.z((d)this);
        }
        
        @Override
        public void m(final T t) {
            this.G.m((Object)t);
        }
        
        public void v(final long n) {
        }
    }
}
